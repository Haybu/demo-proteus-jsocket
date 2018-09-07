package io.agilehandy.proteus.house.service.protobuf;

@javax.annotation.Generated(
    value = "by Proteus proto compiler (version 0.8.9)",
    comments = "Source: io/agilehandy/proteus/house/service/protobuf/service.proto")
@io.netifi.proteus.annotations.internal.ProteusGenerated(
    type = io.netifi.proteus.annotations.internal.ProteusResourceType.CLIENT,
    idlClass = BlockingHouseService.class)
public final class BlockingHouseServiceClient implements BlockingHouseService {
  private final io.agilehandy.proteus.house.service.protobuf.HouseServiceClient delegate;

  public BlockingHouseServiceClient(io.rsocket.RSocket rSocket) {
    this.delegate = new io.agilehandy.proteus.house.service.protobuf.HouseServiceClient(rSocket);
  }

  public BlockingHouseServiceClient(io.rsocket.RSocket rSocket, io.micrometer.core.instrument.MeterRegistry registry) {
    this.delegate = new io.agilehandy.proteus.house.service.protobuf.HouseServiceClient(rSocket, registry);
  }

  @io.netifi.proteus.annotations.internal.ProteusGeneratedMethod(returnTypeClass = io.agilehandy.proteus.house.service.protobuf.HouseResponse.class)
  public io.agilehandy.proteus.house.service.protobuf.HouseResponse getHouse(io.agilehandy.proteus.house.service.protobuf.HouseRequest message) {
    return getHouse(message, io.netty.buffer.Unpooled.EMPTY_BUFFER);
  }

  @java.lang.Override
  @io.netifi.proteus.annotations.internal.ProteusGeneratedMethod(returnTypeClass = io.agilehandy.proteus.house.service.protobuf.HouseResponse.class)
  public io.agilehandy.proteus.house.service.protobuf.HouseResponse getHouse(io.agilehandy.proteus.house.service.protobuf.HouseRequest message, io.netty.buffer.ByteBuf metadata) {
    return delegate.getHouse(message, metadata).block();
  }

  @io.netifi.proteus.annotations.internal.ProteusGeneratedMethod(returnTypeClass = io.agilehandy.proteus.house.service.protobuf.HouseResponse.class)
  public  io.netifi.proteus.BlockingIterable<io.agilehandy.proteus.house.service.protobuf.HouseResponse> getHousesByRooms(io.agilehandy.proteus.house.service.protobuf.HouseRequest message) {
    return getHousesByRooms(message, io.netty.buffer.Unpooled.EMPTY_BUFFER);
  }

  @java.lang.Override
  @io.netifi.proteus.annotations.internal.ProteusGeneratedMethod(returnTypeClass = io.agilehandy.proteus.house.service.protobuf.HouseResponse.class)
  public  io.netifi.proteus.BlockingIterable<io.agilehandy.proteus.house.service.protobuf.HouseResponse> getHousesByRooms(io.agilehandy.proteus.house.service.protobuf.HouseRequest message, io.netty.buffer.ByteBuf metadata) {
    reactor.core.publisher.Flux stream = delegate.getHousesByRooms(message, metadata);
    return new  io.netifi.proteus.BlockingIterable<>(stream, reactor.util.concurrent.Queues.SMALL_BUFFER_SIZE, reactor.util.concurrent.Queues.small());
  }

  @io.netifi.proteus.annotations.internal.ProteusGeneratedMethod(returnTypeClass = io.agilehandy.proteus.house.service.protobuf.HouseResponse.class)
  public  io.netifi.proteus.BlockingIterable<io.agilehandy.proteus.house.service.protobuf.HouseResponse> getHousesByBaths(io.agilehandy.proteus.house.service.protobuf.HouseRequest message) {
    return getHousesByBaths(message, io.netty.buffer.Unpooled.EMPTY_BUFFER);
  }

  @java.lang.Override
  @io.netifi.proteus.annotations.internal.ProteusGeneratedMethod(returnTypeClass = io.agilehandy.proteus.house.service.protobuf.HouseResponse.class)
  public  io.netifi.proteus.BlockingIterable<io.agilehandy.proteus.house.service.protobuf.HouseResponse> getHousesByBaths(io.agilehandy.proteus.house.service.protobuf.HouseRequest message, io.netty.buffer.ByteBuf metadata) {
    reactor.core.publisher.Flux stream = delegate.getHousesByBaths(message, metadata);
    return new  io.netifi.proteus.BlockingIterable<>(stream, reactor.util.concurrent.Queues.SMALL_BUFFER_SIZE, reactor.util.concurrent.Queues.small());
  }

  @io.netifi.proteus.annotations.internal.ProteusGeneratedMethod(returnTypeClass = io.agilehandy.proteus.house.service.protobuf.HouseResponse.class)
  public  io.netifi.proteus.BlockingIterable<io.agilehandy.proteus.house.service.protobuf.HouseResponse> getHousesByLotsize(io.agilehandy.proteus.house.service.protobuf.HouseRequest message) {
    return getHousesByLotsize(message, io.netty.buffer.Unpooled.EMPTY_BUFFER);
  }

  @java.lang.Override
  @io.netifi.proteus.annotations.internal.ProteusGeneratedMethod(returnTypeClass = io.agilehandy.proteus.house.service.protobuf.HouseResponse.class)
  public  io.netifi.proteus.BlockingIterable<io.agilehandy.proteus.house.service.protobuf.HouseResponse> getHousesByLotsize(io.agilehandy.proteus.house.service.protobuf.HouseRequest message, io.netty.buffer.ByteBuf metadata) {
    reactor.core.publisher.Flux stream = delegate.getHousesByLotsize(message, metadata);
    return new  io.netifi.proteus.BlockingIterable<>(stream, reactor.util.concurrent.Queues.SMALL_BUFFER_SIZE, reactor.util.concurrent.Queues.small());
  }

  @io.netifi.proteus.annotations.internal.ProteusGeneratedMethod(returnTypeClass = io.agilehandy.proteus.house.service.protobuf.HouseResponse.class)
  public  io.netifi.proteus.BlockingIterable<io.agilehandy.proteus.house.service.protobuf.HouseResponse> getHousesByPrice(io.agilehandy.proteus.house.service.protobuf.HouseRequest message) {
    return getHousesByPrice(message, io.netty.buffer.Unpooled.EMPTY_BUFFER);
  }

  @java.lang.Override
  @io.netifi.proteus.annotations.internal.ProteusGeneratedMethod(returnTypeClass = io.agilehandy.proteus.house.service.protobuf.HouseResponse.class)
  public  io.netifi.proteus.BlockingIterable<io.agilehandy.proteus.house.service.protobuf.HouseResponse> getHousesByPrice(io.agilehandy.proteus.house.service.protobuf.HouseRequest message, io.netty.buffer.ByteBuf metadata) {
    reactor.core.publisher.Flux stream = delegate.getHousesByPrice(message, metadata);
    return new  io.netifi.proteus.BlockingIterable<>(stream, reactor.util.concurrent.Queues.SMALL_BUFFER_SIZE, reactor.util.concurrent.Queues.small());
  }

  @io.netifi.proteus.annotations.internal.ProteusGeneratedMethod(returnTypeClass = io.agilehandy.proteus.house.service.protobuf.HouseResponse.class)
  public  io.netifi.proteus.BlockingIterable<io.agilehandy.proteus.house.service.protobuf.HouseResponse> getAllHouses(io.agilehandy.proteus.house.service.protobuf.Empty message) {
    return getAllHouses(message, io.netty.buffer.Unpooled.EMPTY_BUFFER);
  }

  @java.lang.Override
  @io.netifi.proteus.annotations.internal.ProteusGeneratedMethod(returnTypeClass = io.agilehandy.proteus.house.service.protobuf.HouseResponse.class)
  public  io.netifi.proteus.BlockingIterable<io.agilehandy.proteus.house.service.protobuf.HouseResponse> getAllHouses(io.agilehandy.proteus.house.service.protobuf.Empty message, io.netty.buffer.ByteBuf metadata) {
    reactor.core.publisher.Flux stream = delegate.getAllHouses(message, metadata);
    return new  io.netifi.proteus.BlockingIterable<>(stream, reactor.util.concurrent.Queues.SMALL_BUFFER_SIZE, reactor.util.concurrent.Queues.small());
  }

  @io.netifi.proteus.annotations.internal.ProteusGeneratedMethod(returnTypeClass = io.agilehandy.proteus.house.service.protobuf.Identifier.class)
  public io.agilehandy.proteus.house.service.protobuf.Identifier addHouse(io.agilehandy.proteus.house.service.protobuf.HouseRequest message) {
    return addHouse(message, io.netty.buffer.Unpooled.EMPTY_BUFFER);
  }

  @java.lang.Override
  @io.netifi.proteus.annotations.internal.ProteusGeneratedMethod(returnTypeClass = io.agilehandy.proteus.house.service.protobuf.Identifier.class)
  public io.agilehandy.proteus.house.service.protobuf.Identifier addHouse(io.agilehandy.proteus.house.service.protobuf.HouseRequest message, io.netty.buffer.ByteBuf metadata) {
    return delegate.addHouse(message, metadata).block();
  }

}

