package io.agilehandy.demo;

import io.agilehandy.demo.data.House;
import io.agilehandy.demo.data.HouseRepository;
import io.agilehandy.proteus.house.service.protobuf.*;
import io.netty.buffer.ByteBuf;
import lombok.extern.slf4j.Slf4j;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Component
@Slf4j
public class HouseServiceImpl implements HouseService {

    private final HouseRepository houseRepository;

    public HouseServiceImpl(HouseRepository houseRepository) {
        this.houseRepository = houseRepository;
    }

    @Override
    public Mono<HouseResponse> getHouse(HouseRequest message, ByteBuf metadata) {
        return houseRepository
                .findById(new ObjectId(message.getId()))
                .map(house -> this.buildHouseResponse(house))
                ;
    }

    @Override
    public Flux<HouseResponse> getHousesByRooms(HouseRequest message, ByteBuf metadata) {
        return null;
    }

    @Override
    public Flux<HouseResponse> getHousesByBaths(HouseRequest message, ByteBuf metadata) {
        return null;
    }

    @Override
    public Flux<HouseResponse> getHousesByLotsize(HouseRequest message, ByteBuf metadata) {
        return null;
    }

    @Override
    public Flux<HouseResponse> getHousesByPrice(HouseRequest message, ByteBuf metadata) {
        return null;
    }

    @Override
    public Flux<HouseResponse> getAllHouses(Empty message, ByteBuf metadata) {
        return null;
    }

    @Override
    public Mono<Identifier> addHouse(HouseRequest message, ByteBuf metadata) {
        return null;
    }

    private HouseResponse buildHouseResponse(House house) {
        return HouseResponse.newBuilder()
                .setStreet(house.getStreet())
                .setCity(house.getCity())
                .setState(house.getState())
                .setZip(house.getZip())
                .setArea(house.getArea())
                .setLotsize(house.getLotsize())
                .setRooms(house.getRooms())
                .setBaths(house.getBaths())
                .setStories(house.getStories())
                .build()
                ;
    }
}
