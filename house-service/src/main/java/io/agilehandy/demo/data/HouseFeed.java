package io.agilehandy.demo.data;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class HouseFeed {

    private static final Logger logger = LogManager.getLogger(HouseFeed.class);

    public static List<House> read(String filePath) throws ParseException {
        Resource resource = new ClassPathResource(filePath);

        List<House> houses = new ArrayList<>();

        try{
            InputStream is = resource.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));

            House house;
            String line;
            String[] fields = null;

            //each line consists of the following fields
            //street:city:state:zip:lot:area:stories:rooms:baths:price
            while ((line = br.readLine()) != null) {
                logger.info("line feed: " + line);
                fields = line.split(":");
                house = new House();
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
                houses.add(house);
            }
            br.close();

            logger.info("Done reading feed data file");

        } catch(IOException e){
            e.printStackTrace();
        }

        return houses;
    }

}
