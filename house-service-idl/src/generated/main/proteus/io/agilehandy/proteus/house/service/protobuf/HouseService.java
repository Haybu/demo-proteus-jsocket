package io.agilehandy.proteus.house.service.protobuf;

/**
 */
@javax.annotation.Generated(
    value = "by Proteus proto compiler (version 0.8.9)",
    comments = "Source: io/agilehandy/proteus/house/service/protobuf/service.proto")
public interface HouseService {
  String SERVICE = "io.agilehandy.proteus.house.service.HouseService";
  String METHOD_GET_HOUSE = "getHouse";
  String METHOD_GET_HOUSES_BY_ROOMS = "getHousesByRooms";
  String METHOD_GET_HOUSES_BY_BATHS = "getHousesByBaths";
  String METHOD_GET_HOUSES_BY_LOTSIZE = "getHousesByLotsize";
  String METHOD_GET_HOUSES_BY_PRICE = "getHousesByPrice";
  String METHOD_GET_ALL_HOUSES = "getAllHouses";
  String METHOD_ADD_HOUSE = "addHouse";

  /**
   */
  reactor.core.publisher.Mono<io.agilehandy.proteus.house.service.protobuf.HouseResponse> getHouse(io.agilehandy.proteus.house.service.protobuf.HouseRequest message, io.netty.buffer.ByteBuf metadata);

  /**
   */
  reactor.core.publisher.Flux<io.agilehandy.proteus.house.service.protobuf.HouseResponse> getHousesByRooms(io.agilehandy.proteus.house.service.protobuf.HouseRequest message, io.netty.buffer.ByteBuf metadata);

  /**
   */
  reactor.core.publisher.Flux<io.agilehandy.proteus.house.service.protobuf.HouseResponse> getHousesByBaths(io.agilehandy.proteus.house.service.protobuf.HouseRequest message, io.netty.buffer.ByteBuf metadata);

  /**
   */
  reactor.core.publisher.Flux<io.agilehandy.proteus.house.service.protobuf.HouseResponse> getHousesByLotsize(io.agilehandy.proteus.house.service.protobuf.HouseRequest message, io.netty.buffer.ByteBuf metadata);

  /**
   */
  reactor.core.publisher.Flux<io.agilehandy.proteus.house.service.protobuf.HouseResponse> getHousesByPrice(io.agilehandy.proteus.house.service.protobuf.HouseRequest message, io.netty.buffer.ByteBuf metadata);

  /**
   */
  reactor.core.publisher.Flux<io.agilehandy.proteus.house.service.protobuf.HouseResponse> getAllHouses(io.agilehandy.proteus.house.service.protobuf.Empty message, io.netty.buffer.ByteBuf metadata);

  /**
   */
  reactor.core.publisher.Mono<io.agilehandy.proteus.house.service.protobuf.Identifier> addHouse(io.agilehandy.proteus.house.service.protobuf.HouseRequest message, io.netty.buffer.ByteBuf metadata);
}
