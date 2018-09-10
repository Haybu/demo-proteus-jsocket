package io.agilehandy.demo.data;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import reactor.core.publisher.Flux;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.BaseStream;
import java.util.stream.Stream;

public class HouseFeed {

    private static final Logger logger = LogManager.getLogger(HouseFeed.class);

    public static Flux<House> read(String filePath) throws ParseException, IOException {
        Resource resource = new ClassPathResource(filePath);
        URI uri = resource.getURI();
        Path path = Paths.get(uri);
        return linesFromPath(path)
                .map(HouseFeed::toHouse)
                ;
    }

    private static Flux<String> linesFromPath(Path path) {
        return Flux.using(() -> Files.lines(path),
                Flux::fromStream,
                BaseStream::close
        );
    }

    //each line consists of the following fields
    //street:city:state:zip:lot:area:stories:rooms:baths:price
    private static House toHouse(String line) {
        String[] fields = line.split(":");
        House house = new House();
        house.setStreet(fields[0]);
        house.setCity(fields[1]);
        house.setState(fields[2]);
        house.setZip(fields[3]);
        house.setLotsize(Float.valueOf(fields[4]));
        house.setArea(Float.valueOf(fields[5]));
        house.setStories(Integer.valueOf(fields[6]));
        house.setRooms(Integer.valueOf(fields[7]));
        house.setBaths(Float.valueOf(fields[8]));
        house.setPrice(Float.valueOf(fields[9]));
        return house;
    }

}
