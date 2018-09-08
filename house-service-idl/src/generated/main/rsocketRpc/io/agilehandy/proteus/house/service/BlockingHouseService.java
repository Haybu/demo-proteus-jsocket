package io.agilehandy.proteus.house.service;

/**
 */
@javax.annotation.Generated(
    value = "by RSocket RPC proto compiler (version 0.2.0)",
    comments = "Source: io/agilehandy/proteus/house/service/protobuf/service.proto")
public interface BlockingHouseService {
  String SERVICE_ID = "io.agilehandy.proteus.house.service.HouseService";
  String METHOD_GET_HOUSE = "getHouse";
  String METHOD_GET_HOUSES_BY_ROOMS = "getHousesByRooms";
  String METHOD_GET_HOUSES_BY_BATHS = "getHousesByBaths";
  String METHOD_GET_HOUSES_BY_LOTSIZE = "getHousesByLotsize";
  String METHOD_GET_HOUSES_BY_PRICE = "getHousesByPrice";
  String METHOD_GET_ALL_HOUSES = "getAllHouses";
  String METHOD_ADD_HOUSE = "addHouse";

  /**
   */
  io.agilehandy.proteus.house.service.HouseResponse getHouse(io.agilehandy.proteus.house.service.HouseRequest message, io.netty.buffer.ByteBuf metadata);

  /**
   */
  Iterable<io.agilehandy.proteus.house.service.HouseResponse> getHousesByRooms(io.agilehandy.proteus.house.service.HouseRequest message, io.netty.buffer.ByteBuf metadata);

  /**
   */
  Iterable<io.agilehandy.proteus.house.service.HouseResponse> getHousesByBaths(io.agilehandy.proteus.house.service.HouseRequest message, io.netty.buffer.ByteBuf metadata);

  /**
   */
  Iterable<io.agilehandy.proteus.house.service.HouseResponse> getHousesByLotsize(io.agilehandy.proteus.house.service.HouseRequest message, io.netty.buffer.ByteBuf metadata);

  /**
   */
  Iterable<io.agilehandy.proteus.house.service.HouseResponse> getHousesByPrice(io.agilehandy.proteus.house.service.HouseRequest message, io.netty.buffer.ByteBuf metadata);

  /**
   */
  Iterable<io.agilehandy.proteus.house.service.HouseResponse> getAllHouses(io.agilehandy.proteus.house.service.Empty message, io.netty.buffer.ByteBuf metadata);

  /**
   */
  io.agilehandy.proteus.house.service.Identifier addHouse(io.agilehandy.proteus.house.service.HouseRequest message, io.netty.buffer.ByteBuf metadata);
}
