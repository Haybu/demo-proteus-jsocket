package io.agilehandy.demo;

import io.agilehandy.proteus.house.service.Empty;
import io.agilehandy.proteus.house.service.HouseServiceClient;
import io.rsocket.rpc.annotations.Client;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Calls the Hello Service
 */
@Component

public class HouseClientRunner implements CommandLineRunner {
    private static final Logger logger = LogManager.getLogger(HouseClientRunner.class);
    
    
    @Client(group = "house.services.dataservices")
    private HouseServiceClient client;
    
    //@Override
    /**
    public void run(String... args) throws Exception {

        HouseRequest request = HouseRequest.newBuilder()
                                   .setId("111")
                                   .build();
    
        logger.info("Retrieving a house from HouseService...");

        logger.info(client.getHouse(request).block());

        System.exit(0);
    }
    */

    @Override
    public void run(String... args) throws Exception {
        Empty request = Empty.newBuilder().build();

        logger.info("Retrieving all houses from HouseService...");

        client.getAllHouses(request)
                .doOnError(Throwable::printStackTrace)
                .subscribe(response -> logger.info("House Street: {}", response.getStreet()));


        // Exit
        //System.exit(0);
    }

}
