package io.agilehandy.proteus.house.service;

@javax.annotation.Generated(
    value = "by RSocket RPC proto compiler (version 0.2.0)",
    comments = "Source: io/agilehandy/proteus/house/service/protobuf/service.proto")
@io.rsocket.rpc.annotations.internal.Generated(
    type = io.rsocket.rpc.annotations.internal.ResourceType.SERVICE,
    idlClass = BlockingHouseService.class)
@javax.inject.Named(
    value ="BlockingHouseServiceServer")
public final class BlockingHouseServiceServer extends io.rsocket.rpc.AbstractRSocketService {
  private final BlockingHouseService service;
  private final reactor.core.scheduler.Scheduler scheduler;
  private final java.util.function.Function<? super org.reactivestreams.Publisher<io.rsocket.Payload>, ? extends org.reactivestreams.Publisher<io.rsocket.Payload>> getHouse;
  private final java.util.function.Function<? super org.reactivestreams.Publisher<io.rsocket.Payload>, ? extends org.reactivestreams.Publisher<io.rsocket.Payload>> getHousesByRooms;
  private final java.util.function.Function<? super org.reactivestreams.Publisher<io.rsocket.Payload>, ? extends org.reactivestreams.Publisher<io.rsocket.Payload>> getHousesByBaths;
  private final java.util.function.Function<? super org.reactivestreams.Publisher<io.rsocket.Payload>, ? extends org.reactivestreams.Publisher<io.rsocket.Payload>> getHousesByLotsize;
  private final java.util.function.Function<? super org.reactivestreams.Publisher<io.rsocket.Payload>, ? extends org.reactivestreams.Publisher<io.rsocket.Payload>> getHousesByPrice;
  private final java.util.function.Function<? super org.reactivestreams.Publisher<io.rsocket.Payload>, ? extends org.reactivestreams.Publisher<io.rsocket.Payload>> getAllHouses;
  private final java.util.function.Function<? super org.reactivestreams.Publisher<io.rsocket.Payload>, ? extends org.reactivestreams.Publisher<io.rsocket.Payload>> addHouse;
  @javax.inject.Inject
  public BlockingHouseServiceServer(BlockingHouseService service, java.util.Optional<reactor.core.scheduler.Scheduler> scheduler, java.util.Optional<io.micrometer.core.instrument.MeterRegistry> registry) {
    this.scheduler = scheduler.orElse(reactor.core.scheduler.Schedulers.elastic());
    this.service = service;
    if (!registry.isPresent()) {
      this.getHouse = java.util.function.Function.identity();
      this.getHousesByRooms = java.util.function.Function.identity();
      this.getHousesByBaths = java.util.function.Function.identity();
      this.getHousesByLotsize = java.util.function.Function.identity();
      this.getHousesByPrice = java.util.function.Function.identity();
      this.getAllHouses = java.util.function.Function.identity();
      this.addHouse = java.util.function.Function.identity();
    } else {
      this.getHouse = io.rsocket.rpc.metrics.Metrics.timed(registry.get(), "rsocket.server", "service", BlockingHouseService.SERVICE_ID, "method", BlockingHouseService.METHOD_GET_HOUSE);
      this.getHousesByRooms = io.rsocket.rpc.metrics.Metrics.timed(registry.get(), "rsocket.server", "service", BlockingHouseService.SERVICE_ID, "method", BlockingHouseService.METHOD_GET_HOUSES_BY_ROOMS);
      this.getHousesByBaths = io.rsocket.rpc.metrics.Metrics.timed(registry.get(), "rsocket.server", "service", BlockingHouseService.SERVICE_ID, "method", BlockingHouseService.METHOD_GET_HOUSES_BY_BATHS);
      this.getHousesByLotsize = io.rsocket.rpc.metrics.Metrics.timed(registry.get(), "rsocket.server", "service", BlockingHouseService.SERVICE_ID, "method", BlockingHouseService.METHOD_GET_HOUSES_BY_LOTSIZE);
      this.getHousesByPrice = io.rsocket.rpc.metrics.Metrics.timed(registry.get(), "rsocket.server", "service", BlockingHouseService.SERVICE_ID, "method", BlockingHouseService.METHOD_GET_HOUSES_BY_PRICE);
      this.getAllHouses = io.rsocket.rpc.metrics.Metrics.timed(registry.get(), "rsocket.server", "service", BlockingHouseService.SERVICE_ID, "method", BlockingHouseService.METHOD_GET_ALL_HOUSES);
      this.addHouse = io.rsocket.rpc.metrics.Metrics.timed(registry.get(), "rsocket.server", "service", BlockingHouseService.SERVICE_ID, "method", BlockingHouseService.METHOD_ADD_HOUSE);
    }

  }

  @java.lang.Override
  public String getService() {
    return BlockingHouseService.SERVICE_ID;
  }

  @java.lang.Override
  public Class<?> getServiceClass() {
    return service.getClass();
  }

  @java.lang.Override
  public reactor.core.publisher.Mono<Void> fireAndForget(io.rsocket.Payload payload) {
    return reactor.core.publisher.Mono.error(new UnsupportedOperationException("Fire and forget not implemented."));
  }

  @java.lang.Override
  public reactor.core.publisher.Mono<io.rsocket.Payload> requestResponse(io.rsocket.Payload payload) {
    try {
      io.netty.buffer.ByteBuf metadata = payload.sliceMetadata();
      switch(io.rsocket.rpc.frames.Metadata.getMethod(metadata)) {
        case HouseService.METHOD_GET_HOUSE: {
          com.google.protobuf.CodedInputStream is = com.google.protobuf.CodedInputStream.newInstance(payload.getData());
          io.agilehandy.proteus.house.service.HouseRequest message = io.agilehandy.proteus.house.service.HouseRequest.parseFrom(is);
          return reactor.core.publisher.Mono.fromSupplier(() -> service.getHouse(message, metadata)).map(serializer).transform(getHouse).subscribeOn(scheduler);
        }
        case HouseService.METHOD_ADD_HOUSE: {
          com.google.protobuf.CodedInputStream is = com.google.protobuf.CodedInputStream.newInstance(payload.getData());
          io.agilehandy.proteus.house.service.HouseRequest message = io.agilehandy.proteus.house.service.HouseRequest.parseFrom(is);
          return reactor.core.publisher.Mono.fromSupplier(() -> service.addHouse(message, metadata)).map(serializer).transform(addHouse).subscribeOn(scheduler);
        }
        default: {
          return reactor.core.publisher.Mono.error(new UnsupportedOperationException());
        }
      }
    } catch (Throwable t) {
      return reactor.core.publisher.Mono.error(t);
    } finally {
      payload.release();
    }
  }

  @java.lang.Override
  public reactor.core.publisher.Flux<io.rsocket.Payload> requestStream(io.rsocket.Payload payload) {
    try {
      io.netty.buffer.ByteBuf metadata = payload.sliceMetadata();
      switch(io.rsocket.rpc.frames.Metadata.getMethod(metadata)) {
        case BlockingHouseService.METHOD_GET_HOUSES_BY_ROOMS: {
          com.google.protobuf.CodedInputStream is = com.google.protobuf.CodedInputStream.newInstance(payload.getData());
          io.agilehandy.proteus.house.service.HouseRequest message = io.agilehandy.proteus.house.service.HouseRequest.parseFrom(is);
          return reactor.core.publisher.Flux.defer(() -> reactor.core.publisher.Flux.fromIterable(service.getHousesByRooms(message, metadata)).map(serializer).transform(getHousesByRooms)).subscribeOn(scheduler);
        }
        case BlockingHouseService.METHOD_GET_HOUSES_BY_BATHS: {
          com.google.protobuf.CodedInputStream is = com.google.protobuf.CodedInputStream.newInstance(payload.getData());
          io.agilehandy.proteus.house.service.HouseRequest message = io.agilehandy.proteus.house.service.HouseRequest.parseFrom(is);
          return reactor.core.publisher.Flux.defer(() -> reactor.core.publisher.Flux.fromIterable(service.getHousesByBaths(message, metadata)).map(serializer).transform(getHousesByBaths)).subscribeOn(scheduler);
        }
        case BlockingHouseService.METHOD_GET_HOUSES_BY_LOTSIZE: {
          com.google.protobuf.CodedInputStream is = com.google.protobuf.CodedInputStream.newInstance(payload.getData());
          io.agilehandy.proteus.house.service.HouseRequest message = io.agilehandy.proteus.house.service.HouseRequest.parseFrom(is);
          return reactor.core.publisher.Flux.defer(() -> reactor.core.publisher.Flux.fromIterable(service.getHousesByLotsize(message, metadata)).map(serializer).transform(getHousesByLotsize)).subscribeOn(scheduler);
        }
        case BlockingHouseService.METHOD_GET_HOUSES_BY_PRICE: {
          com.google.protobuf.CodedInputStream is = com.google.protobuf.CodedInputStream.newInstance(payload.getData());
          io.agilehandy.proteus.house.service.HouseRequest message = io.agilehandy.proteus.house.service.HouseRequest.parseFrom(is);
          return reactor.core.publisher.Flux.defer(() -> reactor.core.publisher.Flux.fromIterable(service.getHousesByPrice(message, metadata)).map(serializer).transform(getHousesByPrice)).subscribeOn(scheduler);
        }
        case BlockingHouseService.METHOD_GET_ALL_HOUSES: {
          com.google.protobuf.CodedInputStream is = com.google.protobuf.CodedInputStream.newInstance(payload.getData());
          io.agilehandy.proteus.house.service.Empty message = io.agilehandy.proteus.house.service.Empty.parseFrom(is);
          return reactor.core.publisher.Flux.defer(() -> reactor.core.publisher.Flux.fromIterable(service.getAllHouses(message, metadata)).map(serializer).transform(getAllHouses)).subscribeOn(scheduler);
        }
        default: {
          return reactor.core.publisher.Flux.error(new UnsupportedOperationException());
        }
      }
    } catch (Throwable t) {
      return reactor.core.publisher.Flux.error(t);
    } finally {
      payload.release();
    }
  }

  @java.lang.Override
  public reactor.core.publisher.Flux<io.rsocket.Payload> requestChannel(io.rsocket.Payload payload, reactor.core.publisher.Flux<io.rsocket.Payload> publisher) {
    return reactor.core.publisher.Flux.error(new UnsupportedOperationException("Request-Channel not implemented."));
  }

  @java.lang.Override
  public reactor.core.publisher.Flux<io.rsocket.Payload> requestChannel(org.reactivestreams.Publisher<io.rsocket.Payload> payloads) {
    return reactor.core.publisher.Flux.error(new UnsupportedOperationException("Request-Channel not implemented."));
  }

  private static final java.util.function.Function<com.google.protobuf.MessageLite, io.rsocket.Payload> serializer =
    new java.util.function.Function<com.google.protobuf.MessageLite, io.rsocket.Payload>() {
      @java.lang.Override
      public io.rsocket.Payload apply(com.google.protobuf.MessageLite message) {
        int length = message.getSerializedSize();
        io.netty.buffer.ByteBuf byteBuf = io.netty.buffer.ByteBufAllocator.DEFAULT.buffer(length);
        try {
          message.writeTo(com.google.protobuf.CodedOutputStream.newInstance(byteBuf.internalNioBuffer(0, length)));
          byteBuf.writerIndex(length);
          return io.rsocket.util.ByteBufPayload.create(byteBuf);
        } catch (Throwable t) {
          byteBuf.release();
          throw new RuntimeException(t);
        }
      }
    };

  private static <T> java.util.function.Function<io.rsocket.Payload, T> deserializer(final com.google.protobuf.Parser<T> parser) {
    return new java.util.function.Function<io.rsocket.Payload, T>() {
      @java.lang.Override
      public T apply(io.rsocket.Payload payload) {
        try {
          com.google.protobuf.CodedInputStream is = com.google.protobuf.CodedInputStream.newInstance(payload.getData());
          return parser.parseFrom(is);
        } catch (Throwable t) {
          throw new RuntimeException(t);
        } finally {
          payload.release();
        }
      }
    };
  }
}
