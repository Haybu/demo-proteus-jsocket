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

    private String datafile;

    private final HouseRepository houseRepository;

    public HouseSeed(HouseRepository houseRepository,
                     @Value("${data.filepath}") String datafile) {
        this.houseRepository = houseRepository;
        this.datafile = datafile;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        log.info("Initializing database...");

        //@formatter:off
        houseRepository
          .deleteAll()
          .thenMany(HouseFeed.read(datafile)
                    .flatMap(house -> houseRepository.save(house))
                    .thenMany(houseRepository.findAll())
          )
          .subscribe(System.out::println)
        ;
        //@formatter:on
    }
}
