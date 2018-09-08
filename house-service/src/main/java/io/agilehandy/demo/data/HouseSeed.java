package io.agilehandy.demo.data;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;

import java.util.List;

@Component
@Slf4j
public class HouseSeed implements ApplicationRunner {

    @Value("${data.filepath}")
    private String datafile;

    private final HouseRepository houseRepository;

    public HouseSeed(HouseRepository houseRepository) {
        this.houseRepository = houseRepository;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        log.info("Initializing database...");
        List<House> houses = HouseFeed.read(datafile);

        //@formatter:off
        houseRepository
          .deleteAll()
          .thenMany(Flux.fromStream(houses.stream())
                    .flatMap(house -> houseRepository.save(house))
                    .thenMany(houseRepository.findAll())
          )
          .subscribe(System.out::println)
        ;
        //@formatter:on
    }
}
