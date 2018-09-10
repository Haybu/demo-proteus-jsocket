package io.agilehandy.demo.proteus.service;

@javax.annotation.Generated(
    value = "by RSocket RPC proto compiler (version 0.2.0)",
    comments = "Source: io/agilehandy/proteus/house/service/protobuf/service.proto")
@io.rsocket.rpc.annotations.internal.Generated(
    type = io.rsocket.rpc.annotations.internal.ResourceType.CLIENT,
    idlClass = BlockingHouseService.class)
public final class BlockingHouseServiceClient implements BlockingHouseService {
  private final io.agilehandy.demo.proteus.service.HouseServiceClient delegate;

  public BlockingHouseServiceClient(io.rsocket.RSocket rSocket) {
    this.delegate = new io.agilehandy.demo.proteus.service.HouseServiceClient(rSocket);
  }

  public BlockingHouseServiceClient(io.rsocket.RSocket rSocket, io.micrometer.core.instrument.MeterRegistry registry) {
    this.delegate = new io.agilehandy.demo.proteus.service.HouseServiceClient(rSocket, registry);
  }

  @io.rsocket.rpc.annotations.internal.GeneratedMethod(returnTypeClass = io.agilehandy.demo.proteus.service.HouseResponse.class)
  public io.agilehandy.demo.proteus.service.HouseResponse getHouseById(io.agilehandy.demo.proteus.service.HouseRequest message) {
    return getHouseById(message, io.netty.buffer.Unpooled.EMPTY_BUFFER);
  }

  @java.lang.Override
  @io.rsocket.rpc.annotations.internal.GeneratedMethod(returnTypeClass = io.agilehandy.demo.proteus.service.HouseResponse.class)
  public io.agilehandy.demo.proteus.service.HouseResponse getHouseById(io.agilehandy.demo.proteus.service.HouseRequest message, io.netty.buffer.ByteBuf metadata) {
    return delegate.getHouseById(message, metadata).block();
  }

  @io.rsocket.rpc.annotations.internal.GeneratedMethod(returnTypeClass = io.agilehandy.demo.proteus.service.HouseResponse.class)
  public  io.rsocket.rpc.BlockingIterable<io.agilehandy.demo.proteus.service.HouseResponse> getHousesByRooms(io.agilehandy.demo.proteus.service.HouseRequest message) {
    return getHousesByRooms(message, io.netty.buffer.Unpooled.EMPTY_BUFFER);
  }

  @java.lang.Override
  @io.rsocket.rpc.annotations.internal.GeneratedMethod(returnTypeClass = io.agilehandy.demo.proteus.service.HouseResponse.class)
  public  io.rsocket.rpc.BlockingIterable<io.agilehandy.demo.proteus.service.HouseResponse> getHousesByRooms(io.agilehandy.demo.proteus.service.HouseRequest message, io.netty.buffer.ByteBuf metadata) {
    reactor.core.publisher.Flux stream = delegate.getHousesByRooms(message, metadata);
    return new  io.rsocket.rpc.BlockingIterable<>(stream, reactor.util.concurrent.Queues.SMALL_BUFFER_SIZE, reactor.util.concurrent.Queues.small());
  }

  @io.rsocket.rpc.annotations.internal.GeneratedMethod(returnTypeClass = io.agilehandy.demo.proteus.service.HouseResponse.class)
  public  io.rsocket.rpc.BlockingIterable<io.agilehandy.demo.proteus.service.HouseResponse> getHousesByBaths(io.agilehandy.demo.proteus.service.HouseRequest message) {
    return getHousesByBaths(message, io.netty.buffer.Unpooled.EMPTY_BUFFER);
  }

  @java.lang.Override
  @io.rsocket.rpc.annotations.internal.GeneratedMethod(returnTypeClass = io.agilehandy.demo.proteus.service.HouseResponse.class)
  public  io.rsocket.rpc.BlockingIterable<io.agilehandy.demo.proteus.service.HouseResponse> getHousesByBaths(io.agilehandy.demo.proteus.service.HouseRequest message, io.netty.buffer.ByteBuf metadata) {
    reactor.core.publisher.Flux stream = delegate.getHousesByBaths(message, metadata);
    return new  io.rsocket.rpc.BlockingIterable<>(stream, reactor.util.concurrent.Queues.SMALL_BUFFER_SIZE, reactor.util.concurrent.Queues.small());
  }

  @io.rsocket.rpc.annotations.internal.GeneratedMethod(returnTypeClass = io.agilehandy.demo.proteus.service.HouseResponse.class)
  public  io.rsocket.rpc.BlockingIterable<io.agilehandy.demo.proteus.service.HouseResponse> getHousesByLotsize(io.agilehandy.demo.proteus.service.HouseRequest message) {
    return getHousesByLotsize(message, io.netty.buffer.Unpooled.EMPTY_BUFFER);
  }

  @java.lang.Override
  @io.rsocket.rpc.annotations.internal.GeneratedMethod(returnTypeClass = io.agilehandy.demo.proteus.service.HouseResponse.class)
  public  io.rsocket.rpc.BlockingIterable<io.agilehandy.demo.proteus.service.HouseResponse> getHousesByLotsize(io.agilehandy.demo.proteus.service.HouseRequest message, io.netty.buffer.ByteBuf metadata) {
    reactor.core.publisher.Flux stream = delegate.getHousesByLotsize(message, metadata);
    return new  io.rsocket.rpc.BlockingIterable<>(stream, reactor.util.concurrent.Queues.SMALL_BUFFER_SIZE, reactor.util.concurrent.Queues.small());
  }

  @io.rsocket.rpc.annotations.internal.GeneratedMethod(returnTypeClass = io.agilehandy.demo.proteus.service.HouseResponse.class)
  public  io.rsocket.rpc.BlockingIterable<io.agilehandy.demo.proteus.service.HouseResponse> getHousesByPrice(io.agilehandy.demo.proteus.service.HouseRequest message) {
    return getHousesByPrice(message, io.netty.buffer.Unpooled.EMPTY_BUFFER);
  }

  @java.lang.Override
  @io.rsocket.rpc.annotations.internal.GeneratedMethod(returnTypeClass = io.agilehandy.demo.proteus.service.HouseResponse.class)
  public  io.rsocket.rpc.BlockingIterable<io.agilehandy.demo.proteus.service.HouseResponse> getHousesByPrice(io.agilehandy.demo.proteus.service.HouseRequest message, io.netty.buffer.ByteBuf metadata) {
    reactor.core.publisher.Flux stream = delegate.getHousesByPrice(message, metadata);
    return new  io.rsocket.rpc.BlockingIterable<>(stream, reactor.util.concurrent.Queues.SMALL_BUFFER_SIZE, reactor.util.concurrent.Queues.small());
  }

  @io.rsocket.rpc.annotations.internal.GeneratedMethod(returnTypeClass = io.agilehandy.demo.proteus.service.HouseResponse.class)
  public  io.rsocket.rpc.BlockingIterable<io.agilehandy.demo.proteus.service.HouseResponse> getHousesByStories(io.agilehandy.demo.proteus.service.HouseRequest message) {
    return getHousesByStories(message, io.netty.buffer.Unpooled.EMPTY_BUFFER);
  }

  @java.lang.Override
  @io.rsocket.rpc.annotations.internal.GeneratedMethod(returnTypeClass = io.agilehandy.demo.proteus.service.HouseResponse.class)
  public  io.rsocket.rpc.BlockingIterable<io.agilehandy.demo.proteus.service.HouseResponse> getHousesByStories(io.agilehandy.demo.proteus.service.HouseRequest message, io.netty.buffer.ByteBuf metadata) {
    reactor.core.publisher.Flux stream = delegate.getHousesByStories(message, metadata);
    return new  io.rsocket.rpc.BlockingIterable<>(stream, reactor.util.concurrent.Queues.SMALL_BUFFER_SIZE, reactor.util.concurrent.Queues.small());
  }

  @io.rsocket.rpc.annotations.internal.GeneratedMethod(returnTypeClass = io.agilehandy.demo.proteus.service.HouseResponse.class)
  public  io.rsocket.rpc.BlockingIterable<io.agilehandy.demo.proteus.service.HouseResponse> getAllHouses(io.agilehandy.demo.proteus.service.Empty message) {
    return getAllHouses(message, io.netty.buffer.Unpooled.EMPTY_BUFFER);
  }

  @java.lang.Override
  @io.rsocket.rpc.annotations.internal.GeneratedMethod(returnTypeClass = io.agilehandy.demo.proteus.service.HouseResponse.class)
  public  io.rsocket.rpc.BlockingIterable<io.agilehandy.demo.proteus.service.HouseResponse> getAllHouses(io.agilehandy.demo.proteus.service.Empty message, io.netty.buffer.ByteBuf metadata) {
    reactor.core.publisher.Flux stream = delegate.getAllHouses(message, metadata);
    return new  io.rsocket.rpc.BlockingIterable<>(stream, reactor.util.concurrent.Queues.SMALL_BUFFER_SIZE, reactor.util.concurrent.Queues.small());
  }

  @io.rsocket.rpc.annotations.internal.GeneratedMethod(returnTypeClass = io.agilehandy.demo.proteus.service.Identifier.class)
  public io.agilehandy.demo.proteus.service.Identifier addHouse(io.agilehandy.demo.proteus.service.HouseRequest message) {
    return addHouse(message, io.netty.buffer.Unpooled.EMPTY_BUFFER);
  }

  @java.lang.Override
  @io.rsocket.rpc.annotations.internal.GeneratedMethod(returnTypeClass = io.agilehandy.demo.proteus.service.Identifier.class)
  public io.agilehandy.demo.proteus.service.Identifier addHouse(io.agilehandy.demo.proteus.service.HouseRequest message, io.netty.buffer.ByteBuf metadata) {
    return delegate.addHouse(message, metadata).block();
  }

  @io.rsocket.rpc.annotations.internal.GeneratedMethod(returnTypeClass = io.agilehandy.demo.proteus.service.Identifier.class)
  public  io.rsocket.rpc.BlockingIterable<io.agilehandy.demo.proteus.service.Identifier> addHouses(Iterable<io.agilehandy.demo.proteus.service.HouseRequest> messages) {
    return addHouses(messages, io.netty.buffer.Unpooled.EMPTY_BUFFER);
  }

  @java.lang.Override
  @io.rsocket.rpc.annotations.internal.GeneratedMethod(returnTypeClass = io.agilehandy.demo.proteus.service.Identifier.class)
  public  io.rsocket.rpc.BlockingIterable<io.agilehandy.demo.proteus.service.Identifier> addHouses(Iterable<io.agilehandy.demo.proteus.service.HouseRequest> messages, io.netty.buffer.ByteBuf metadata) {
    reactor.core.publisher.Flux stream = delegate.addHouses(reactor.core.publisher.Flux.defer(() -> reactor.core.publisher.Flux.fromIterable(messages)), metadata);
    return new  io.rsocket.rpc.BlockingIterable<>(stream, reactor.util.concurrent.Queues.SMALL_BUFFER_SIZE, reactor.util.concurrent.Queues.small());
  }

}

