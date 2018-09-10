package io.agilehandy.demo.proteus.service;

/**
 */
@javax.annotation.Generated(
    value = "by RSocket RPC proto compiler (version 0.2.0)",
    comments = "Source: io/agilehandy/proteus/house/service/protobuf/service.proto")
public interface BlockingHouseService {
  String SERVICE_ID = "io.agilehandy.demo.proteus.service.HouseService";
  String METHOD_GET_HOUSE_BY_ID = "getHouseById";
  String METHOD_GET_HOUSES_BY_ROOMS = "getHousesByRooms";
  String METHOD_GET_HOUSES_BY_BATHS = "getHousesByBaths";
  String METHOD_GET_HOUSES_BY_LOTSIZE = "getHousesByLotsize";
  String METHOD_GET_HOUSES_BY_PRICE = "getHousesByPrice";
  String METHOD_GET_HOUSES_BY_STORIES = "getHousesByStories";
  String METHOD_GET_ALL_HOUSES = "getAllHouses";
  String METHOD_ADD_HOUSE = "addHouse";
  String METHOD_ADD_HOUSES = "addHouses";

  /**
   */
  io.agilehandy.demo.proteus.service.HouseResponse getHouseById(io.agilehandy.demo.proteus.service.HouseRequest message, io.netty.buffer.ByteBuf metadata);

  /**
   */
  Iterable<io.agilehandy.demo.proteus.service.HouseResponse> getHousesByRooms(io.agilehandy.demo.proteus.service.HouseRequest message, io.netty.buffer.ByteBuf metadata);

  /**
   */
  Iterable<io.agilehandy.demo.proteus.service.HouseResponse> getHousesByBaths(io.agilehandy.demo.proteus.service.HouseRequest message, io.netty.buffer.ByteBuf metadata);

  /**
   */
  Iterable<io.agilehandy.demo.proteus.service.HouseResponse> getHousesByLotsize(io.agilehandy.demo.proteus.service.HouseRequest message, io.netty.buffer.ByteBuf metadata);

  /**
   */
  Iterable<io.agilehandy.demo.proteus.service.HouseResponse> getHousesByPrice(io.agilehandy.demo.proteus.service.HouseRequest message, io.netty.buffer.ByteBuf metadata);

  /**
   */
  Iterable<io.agilehandy.demo.proteus.service.HouseResponse> getHousesByStories(io.agilehandy.demo.proteus.service.HouseRequest message, io.netty.buffer.ByteBuf metadata);

  /**
   */
  Iterable<io.agilehandy.demo.proteus.service.HouseResponse> getAllHouses(io.agilehandy.demo.proteus.service.Empty message, io.netty.buffer.ByteBuf metadata);

  /**
   */
  io.agilehandy.demo.proteus.service.Identifier addHouse(io.agilehandy.demo.proteus.service.HouseRequest message, io.netty.buffer.ByteBuf metadata);

  /**
   */
  Iterable<io.agilehandy.demo.proteus.service.Identifier> addHouses(Iterable<io.agilehandy.demo.proteus.service.HouseRequest> messages, io.netty.buffer.ByteBuf metadata);
}
