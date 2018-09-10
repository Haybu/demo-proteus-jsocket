package io.agilehandy.demo.service;

import io.agilehandy.demo.data.House;
import io.agilehandy.demo.data.HouseRepository;
import io.agilehandy.demo.proteus.service.*;
import io.netty.buffer.ByteBuf;
import lombok.extern.slf4j.Slf4j;
import org.bson.types.ObjectId;
import org.reactivestreams.Publisher;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Component
@Slf4j
public class DefaultHouseService implements HouseService {

    private final HouseRepository houseRepository;

    public DefaultHouseService(HouseRepository houseRepository) {
        this.houseRepository = houseRepository;
    }

    @Override
    public Mono<HouseResponse> getHouseById(HouseRequest message, ByteBuf metadata) {
        return houseRepository
                .findById(new ObjectId(message.getId()))
                .map(house -> this.buildHouseResponse(house))
                ;
    }

    @Override
    public Flux<HouseResponse> getHousesByRooms(HouseRequest message, ByteBuf metadata) {
        return houseRepository
                .findHouseByRoomsLessThanEqual(message.getMaxRooms())
                .map(house -> this.buildHouseResponse(house))
                ;
    }

    @Override
    public Flux<HouseResponse> getHousesByBaths(HouseRequest message, ByteBuf metadata) {
         return houseRepository
                .findHouseByBathsLessThanEqual(message.getMaxBaths())
                .map(house -> this.buildHouseResponse(house))
                ;
    }

    @Override
    public Flux<HouseResponse> getHousesByLotsize(HouseRequest message, ByteBuf metadata) {
        return houseRepository
                .findHouseByLotsizeLessThanEqual(message.getMaxLotsize())
                .map(house -> this.buildHouseResponse(house))
                ;
    }

    @Override
    public Flux<HouseResponse> getHousesByPrice(HouseRequest message, ByteBuf metadata) {
        return houseRepository
                .findHouseByPriceLessThanEqual(message.getMaxPrice())
                .map(house -> this.buildHouseResponse(house))
                ;
    }

    @Override
    public Flux<HouseResponse> getHousesByStories(HouseRequest message, ByteBuf metadata) {
        return houseRepository
                .findHouseByStories(message.getStories())
                .map(house -> this.buildHouseResponse(house))
                ;
    }

    @Override
    public Flux<HouseResponse> getAllHouses(Empty message, ByteBuf metadata) {
        return houseRepository.findAll()
                .map(house -> this.buildHouseResponse(house));
    }

    @Override
    public Mono<Identifier> addHouse(HouseRequest message, ByteBuf metadata) {
        return Mono.just(this.buildHouseFromRequest(message))
                .flatMap(houseRepository::save)
                .map(house -> house.getId())
                .map(i -> Identifier.newBuilder().setId(i).build())
        ;
    }

    @Override
    public Flux<Identifier> addHouses(Publisher<HouseRequest> messages, ByteBuf metadata) {
       return Flux.from(messages)
            .map(request -> this.buildHouseFromRequest(request))
            .flatMap(house -> houseRepository.save(house))
               .map(house -> house.getId())
               .map(i -> Identifier.newBuilder().setId(i).build())
               ;
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

    private House buildHouseFromRequest(HouseRequest message) {
        House house = new House();
        house.setPrice(message.getMaxPrice());
        house.setStories(message.getStories());
        house.setRooms(message.getMaxRooms());
        house.setBaths(message.getMaxBaths());
        house.setStreet(message.getStreet());
        house.setCity(message.getCity());
        house.setZip(message.getZip());
        house.setArea(message.getMaxArea());
        house.setLotsize(message.getMaxLotsize());
        return house;
    }
}
