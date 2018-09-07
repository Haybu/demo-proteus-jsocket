package io.agilehandy.demo;

import io.agilehandy.proteus.house.service.protobuf.HouseRequest;
import io.agilehandy.proteus.house.service.protobuf.HouseServiceClient;
import io.netifi.proteus.annotations.ProteusClient;
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
    
    
    @ProteusClient(group = "house.services.data-services")
    private HouseServiceClient client;
    
    @Override
    public void run(String... args) throws Exception {
        // Create Request to HelloService
        HouseRequest request = HouseRequest.newBuilder()
                                   .setId("111")
                                   .build();
    
        logger.info("Retrieving a house from HouseService...");
    
        // Call the HelloService
        logger.info(client.getHouse(request).block());
        
        // Exit
        System.exit(0);
    }

}
