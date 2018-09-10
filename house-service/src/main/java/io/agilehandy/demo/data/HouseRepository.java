package io.agilehandy.demo.data;

import io.agilehandy.demo.data.House;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.aggregation.ArrayOperators;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface HouseRepository extends ReactiveCrudRepository<House, ObjectId> {

    Flux<House> findHouseByRoomsLessThanEqual(Integer rooms);

    Flux<House> findHouseByBathsLessThanEqual(Float baths);

    Flux<House> findHouseByStories(Integer num);

    Flux<House> findHouseByLotsizeLessThanEqual(Float num);

    Flux<House> findHouseByPriceLessThanEqual(Float price);


}
