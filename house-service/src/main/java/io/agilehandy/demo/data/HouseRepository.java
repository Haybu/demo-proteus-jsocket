package io.agilehandy.demo.data;

import io.agilehandy.demo.data.House;
import org.bson.types.ObjectId;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface HouseRepository extends ReactiveCrudRepository<House, ObjectId> {
}
