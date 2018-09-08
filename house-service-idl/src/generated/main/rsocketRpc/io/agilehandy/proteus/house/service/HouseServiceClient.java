package io.agilehandy.proteus.house.service;

@javax.annotation.Generated(
    value = "by RSocket RPC proto compiler",
    comments = "Source: io/agilehandy/proteus/house/service/protobuf/service.proto")
@io.rsocket.rpc.annotations.internal.Generated(
    type = io.rsocket.rpc.annotations.internal.ResourceType.CLIENT,
    idlClass = HouseService.class)
public final class HouseServiceClient implements HouseService {
  private final io.rsocket.RSocket rSocket;
  private final java.util.function.Function<? super org.reactivestreams.Publisher<io.agilehandy.proteus.house.service.HouseResponse>, ? extends org.reactivestreams.Publisher<io.agilehandy.proteus.house.service.HouseResponse>> getHouse;
  private final java.util.function.Function<? super org.reactivestreams.Publisher<io.agilehandy.proteus.house.service.HouseResponse>, ? extends org.reactivestreams.Publisher<io.agilehandy.proteus.house.service.HouseResponse>> getHousesByRooms;
  private final java.util.function.Function<? super org.reactivestreams.Publisher<io.agilehandy.proteus.house.service.HouseResponse>, ? extends org.reactivestreams.Publisher<io.agilehandy.proteus.house.service.HouseResponse>> getHousesByBaths;
  private final java.util.function.Function<? super org.reactivestreams.Publisher<io.agilehandy.proteus.house.service.HouseResponse>, ? extends org.reactivestreams.Publisher<io.agilehandy.proteus.house.service.HouseResponse>> getHousesByLotsize;
  private final java.util.function.Function<? super org.reactivestreams.Publisher<io.agilehandy.proteus.house.service.HouseResponse>, ? extends org.reactivestreams.Publisher<io.agilehandy.proteus.house.service.HouseResponse>> getHousesByPrice;
  private final java.util.function.Function<? super org.reactivestreams.Publisher<io.agilehandy.proteus.house.service.HouseResponse>, ? extends org.reactivestreams.Publisher<io.agilehandy.proteus.house.service.HouseResponse>> getAllHouses;
  private final java.util.function.Function<? super org.reactivestreams.Publisher<io.agilehandy.proteus.house.service.Identifier>, ? extends org.reactivestreams.Publisher<io.agilehandy.proteus.house.service.Identifier>> addHouse;
  private final java.util.function.Function<java.util.Map<String, String>, java.util.function.Function<? super org.reactivestreams.Publisher<io.agilehandy.proteus.house.service.HouseResponse>, ? extends org.reactivestreams.Publisher<io.agilehandy.proteus.house.service.HouseResponse>>> getHouseTrace;
  private final java.util.function.Function<java.util.Map<String, String>, java.util.function.Function<? super org.reactivestreams.Publisher<io.agilehandy.proteus.house.service.HouseResponse>, ? extends org.reactivestreams.Publisher<io.agilehandy.proteus.house.service.HouseResponse>>> getHousesByRoomsTrace;
  private final java.util.function.Function<java.util.Map<String, String>, java.util.function.Function<? super org.reactivestreams.Publisher<io.agilehandy.proteus.house.service.HouseResponse>, ? extends org.reactivestreams.Publisher<io.agilehandy.proteus.house.service.HouseResponse>>> getHousesByBathsTrace;
  private final java.util.function.Function<java.util.Map<String, String>, java.util.function.Function<? super org.reactivestreams.Publisher<io.agilehandy.proteus.house.service.HouseResponse>, ? extends org.reactivestreams.Publisher<io.agilehandy.proteus.house.service.HouseResponse>>> getHousesByLotsizeTrace;
  private final java.util.function.Function<java.util.Map<String, String>, java.util.function.Function<? super org.reactivestreams.Publisher<io.agilehandy.proteus.house.service.HouseResponse>, ? extends org.reactivestreams.Publisher<io.agilehandy.proteus.house.service.HouseResponse>>> getHousesByPriceTrace;
  private final java.util.function.Function<java.util.Map<String, String>, java.util.function.Function<? super org.reactivestreams.Publisher<io.agilehandy.proteus.house.service.HouseResponse>, ? extends org.reactivestreams.Publisher<io.agilehandy.proteus.house.service.HouseResponse>>> getAllHousesTrace;
  private final java.util.function.Function<java.util.Map<String, String>, java.util.function.Function<? super org.reactivestreams.Publisher<io.agilehandy.proteus.house.service.Identifier>, ? extends org.reactivestreams.Publisher<io.agilehandy.proteus.house.service.Identifier>>> addHouseTrace;

  public HouseServiceClient(io.rsocket.RSocket rSocket) {
    this.rSocket = rSocket;
    this.getHouse = java.util.function.Function.identity();
    this.getHousesByRooms = java.util.function.Function.identity();
    this.getHousesByBaths = java.util.function.Function.identity();
    this.getHousesByLotsize = java.util.function.Function.identity();
    this.getHousesByPrice = java.util.function.Function.identity();
    this.getAllHouses = java.util.function.Function.identity();
    this.addHouse = java.util.function.Function.identity();
    this.getHouseTrace = io.rsocket.rpc.tracing.Tracing.trace();
    this.getHousesByRoomsTrace = io.rsocket.rpc.tracing.Tracing.trace();
    this.getHousesByBathsTrace = io.rsocket.rpc.tracing.Tracing.trace();
    this.getHousesByLotsizeTrace = io.rsocket.rpc.tracing.Tracing.trace();
    this.getHousesByPriceTrace = io.rsocket.rpc.tracing.Tracing.trace();
    this.getAllHousesTrace = io.rsocket.rpc.tracing.Tracing.trace();
    this.addHouseTrace = io.rsocket.rpc.tracing.Tracing.trace();
  }

  public HouseServiceClient(io.rsocket.RSocket rSocket, io.micrometer.core.instrument.MeterRegistry registry) {
    this.rSocket = rSocket;
    this.getHouse = io.rsocket.rpc.metrics.Metrics.timed(registry, "rsocket.client", "service", HouseService.SERVICE, "method", HouseService.METHOD_GET_HOUSE);
    this.getHousesByRooms = io.rsocket.rpc.metrics.Metrics.timed(registry, "rsocket.client", "service", HouseService.SERVICE, "method", HouseService.METHOD_GET_HOUSES_BY_ROOMS);
    this.getHousesByBaths = io.rsocket.rpc.metrics.Metrics.timed(registry, "rsocket.client", "service", HouseService.SERVICE, "method", HouseService.METHOD_GET_HOUSES_BY_BATHS);
    this.getHousesByLotsize = io.rsocket.rpc.metrics.Metrics.timed(registry, "rsocket.client", "service", HouseService.SERVICE, "method", HouseService.METHOD_GET_HOUSES_BY_LOTSIZE);
    this.getHousesByPrice = io.rsocket.rpc.metrics.Metrics.timed(registry, "rsocket.client", "service", HouseService.SERVICE, "method", HouseService.METHOD_GET_HOUSES_BY_PRICE);
    this.getAllHouses = io.rsocket.rpc.metrics.Metrics.timed(registry, "rsocket.client", "service", HouseService.SERVICE, "method", HouseService.METHOD_GET_ALL_HOUSES);
    this.addHouse = io.rsocket.rpc.metrics.Metrics.timed(registry, "rsocket.client", "service", HouseService.SERVICE, "method", HouseService.METHOD_ADD_HOUSE);
    this.getHouseTrace = io.rsocket.rpc.tracing.Tracing.trace();
    this.getHousesByRoomsTrace = io.rsocket.rpc.tracing.Tracing.trace();
    this.getHousesByBathsTrace = io.rsocket.rpc.tracing.Tracing.trace();
    this.getHousesByLotsizeTrace = io.rsocket.rpc.tracing.Tracing.trace();
    this.getHousesByPriceTrace = io.rsocket.rpc.tracing.Tracing.trace();
    this.getAllHousesTrace = io.rsocket.rpc.tracing.Tracing.trace();
    this.addHouseTrace = io.rsocket.rpc.tracing.Tracing.trace();
  }


  public HouseServiceClient(io.rsocket.RSocket rSocket, io.opentracing.Tracer tracer) {
    this.rSocket = rSocket;
    this.getHouse = java.util.function.Function.identity();
    this.getHousesByRooms = java.util.function.Function.identity();
    this.getHousesByBaths = java.util.function.Function.identity();
    this.getHousesByLotsize = java.util.function.Function.identity();
    this.getHousesByPrice = java.util.function.Function.identity();
    this.getAllHouses = java.util.function.Function.identity();
    this.addHouse = java.util.function.Function.identity();
    this.getHouseTrace = io.rsocket.rpc.tracing.Tracing.trace(tracer, HouseService.METHOD_GET_HOUSE, io.rsocket.rpc.tracing.Tag.of("rsocket.service", HouseService.SERVICE), io.rsocket.rpc.tracing.Tag.of("rsocket.rpc.role", "client"), io.rsocket.rpc.tracing.Tag.of("rsocket.rpc.version", ""));
    this.getHousesByRoomsTrace = io.rsocket.rpc.tracing.Tracing.trace(tracer, HouseService.METHOD_GET_HOUSES_BY_ROOMS, io.rsocket.rpc.tracing.Tag.of("rsocket.service", HouseService.SERVICE), io.rsocket.rpc.tracing.Tag.of("rsocket.rpc.role", "client"), io.rsocket.rpc.tracing.Tag.of("rsocket.rpc.version", ""));
    this.getHousesByBathsTrace = io.rsocket.rpc.tracing.Tracing.trace(tracer, HouseService.METHOD_GET_HOUSES_BY_BATHS, io.rsocket.rpc.tracing.Tag.of("rsocket.service", HouseService.SERVICE), io.rsocket.rpc.tracing.Tag.of("rsocket.rpc.role", "client"), io.rsocket.rpc.tracing.Tag.of("rsocket.rpc.version", ""));
    this.getHousesByLotsizeTrace = io.rsocket.rpc.tracing.Tracing.trace(tracer, HouseService.METHOD_GET_HOUSES_BY_LOTSIZE, io.rsocket.rpc.tracing.Tag.of("rsocket.service", HouseService.SERVICE), io.rsocket.rpc.tracing.Tag.of("rsocket.rpc.role", "client"), io.rsocket.rpc.tracing.Tag.of("rsocket.rpc.version", ""));
    this.getHousesByPriceTrace = io.rsocket.rpc.tracing.Tracing.trace(tracer, HouseService.METHOD_GET_HOUSES_BY_PRICE, io.rsocket.rpc.tracing.Tag.of("rsocket.service", HouseService.SERVICE), io.rsocket.rpc.tracing.Tag.of("rsocket.rpc.role", "client"), io.rsocket.rpc.tracing.Tag.of("rsocket.rpc.version", ""));
    this.getAllHousesTrace = io.rsocket.rpc.tracing.Tracing.trace(tracer, HouseService.METHOD_GET_ALL_HOUSES, io.rsocket.rpc.tracing.Tag.of("rsocket.service", HouseService.SERVICE), io.rsocket.rpc.tracing.Tag.of("rsocket.rpc.role", "client"), io.rsocket.rpc.tracing.Tag.of("rsocket.rpc.version", ""));
    this.addHouseTrace = io.rsocket.rpc.tracing.Tracing.trace(tracer, HouseService.METHOD_ADD_HOUSE, io.rsocket.rpc.tracing.Tag.of("rsocket.service", HouseService.SERVICE), io.rsocket.rpc.tracing.Tag.of("rsocket.rpc.role", "client"), io.rsocket.rpc.tracing.Tag.of("rsocket.rpc.version", ""));
  }


  public HouseServiceClient(io.rsocket.RSocket rSocket, io.micrometer.core.instrument.MeterRegistry registry, io.opentracing.Tracer tracer) {
    this.rSocket = rSocket;
    this.getHouse = io.rsocket.rpc.metrics.Metrics.timed(registry, "rsocket.client", "service", HouseService.SERVICE, "method", HouseService.METHOD_GET_HOUSE);
    this.getHousesByRooms = io.rsocket.rpc.metrics.Metrics.timed(registry, "rsocket.client", "service", HouseService.SERVICE, "method", HouseService.METHOD_GET_HOUSES_BY_ROOMS);
    this.getHousesByBaths = io.rsocket.rpc.metrics.Metrics.timed(registry, "rsocket.client", "service", HouseService.SERVICE, "method", HouseService.METHOD_GET_HOUSES_BY_BATHS);
    this.getHousesByLotsize = io.rsocket.rpc.metrics.Metrics.timed(registry, "rsocket.client", "service", HouseService.SERVICE, "method", HouseService.METHOD_GET_HOUSES_BY_LOTSIZE);
    this.getHousesByPrice = io.rsocket.rpc.metrics.Metrics.timed(registry, "rsocket.client", "service", HouseService.SERVICE, "method", HouseService.METHOD_GET_HOUSES_BY_PRICE);
    this.getAllHouses = io.rsocket.rpc.metrics.Metrics.timed(registry, "rsocket.client", "service", HouseService.SERVICE, "method", HouseService.METHOD_GET_ALL_HOUSES);
    this.addHouse = io.rsocket.rpc.metrics.Metrics.timed(registry, "rsocket.client", "service", HouseService.SERVICE, "method", HouseService.METHOD_ADD_HOUSE);
    this.getHouseTrace = io.rsocket.rpc.tracing.Tracing.trace(tracer, HouseService.METHOD_GET_HOUSE, io.rsocket.rpc.tracing.Tag.of("rsocket.service", HouseService.SERVICE), io.rsocket.rpc.tracing.Tag.of("rsocket.rpc.role", "client"), io.rsocket.rpc.tracing.Tag.of("rsocket.rpc.version", ""));
    this.getHousesByRoomsTrace = io.rsocket.rpc.tracing.Tracing.trace(tracer, HouseService.METHOD_GET_HOUSES_BY_ROOMS, io.rsocket.rpc.tracing.Tag.of("rsocket.service", HouseService.SERVICE), io.rsocket.rpc.tracing.Tag.of("rsocket.rpc.role", "client"), io.rsocket.rpc.tracing.Tag.of("rsocket.rpc.version", ""));
    this.getHousesByBathsTrace = io.rsocket.rpc.tracing.Tracing.trace(tracer, HouseService.METHOD_GET_HOUSES_BY_BATHS, io.rsocket.rpc.tracing.Tag.of("rsocket.service", HouseService.SERVICE), io.rsocket.rpc.tracing.Tag.of("rsocket.rpc.role", "client"), io.rsocket.rpc.tracing.Tag.of("rsocket.rpc.version", ""));
    this.getHousesByLotsizeTrace = io.rsocket.rpc.tracing.Tracing.trace(tracer, HouseService.METHOD_GET_HOUSES_BY_LOTSIZE, io.rsocket.rpc.tracing.Tag.of("rsocket.service", HouseService.SERVICE), io.rsocket.rpc.tracing.Tag.of("rsocket.rpc.role", "client"), io.rsocket.rpc.tracing.Tag.of("rsocket.rpc.version", ""));
    this.getHousesByPriceTrace = io.rsocket.rpc.tracing.Tracing.trace(tracer, HouseService.METHOD_GET_HOUSES_BY_PRICE, io.rsocket.rpc.tracing.Tag.of("rsocket.service", HouseService.SERVICE), io.rsocket.rpc.tracing.Tag.of("rsocket.rpc.role", "client"), io.rsocket.rpc.tracing.Tag.of("rsocket.rpc.version", ""));
    this.getAllHousesTrace = io.rsocket.rpc.tracing.Tracing.trace(tracer, HouseService.METHOD_GET_ALL_HOUSES, io.rsocket.rpc.tracing.Tag.of("rsocket.service", HouseService.SERVICE), io.rsocket.rpc.tracing.Tag.of("rsocket.rpc.role", "client"), io.rsocket.rpc.tracing.Tag.of("rsocket.rpc.version", ""));
    this.addHouseTrace = io.rsocket.rpc.tracing.Tracing.trace(tracer, HouseService.METHOD_ADD_HOUSE, io.rsocket.rpc.tracing.Tag.of("rsocket.service", HouseService.SERVICE), io.rsocket.rpc.tracing.Tag.of("rsocket.rpc.role", "client"), io.rsocket.rpc.tracing.Tag.of("rsocket.rpc.version", ""));
  }

  @io.rsocket.rpc.annotations.internal.GeneratedMethod(returnTypeClass = io.agilehandy.proteus.house.service.HouseResponse.class)
  public reactor.core.publisher.Mono<io.agilehandy.proteus.house.service.HouseResponse> getHouse(io.agilehandy.proteus.house.service.HouseRequest message) {
    return getHouse(message, io.netty.buffer.Unpooled.EMPTY_BUFFER);
  }

  @java.lang.Override
  @io.rsocket.rpc.annotations.internal.GeneratedMethod(returnTypeClass = io.agilehandy.proteus.house.service.HouseResponse.class)
  public reactor.core.publisher.Mono<io.agilehandy.proteus.house.service.HouseResponse> getHouse(io.agilehandy.proteus.house.service.HouseRequest message, io.netty.buffer.ByteBuf metadata) {
  java.util.Map<String, String> map = new java.util.HashMap<>();
    return reactor.core.publisher.Mono.defer(new java.util.function.Supplier<reactor.core.publisher.Mono<io.rsocket.Payload>>() {
      @java.lang.Override
      public reactor.core.publisher.Mono<io.rsocket.Payload> get() {
        final io.netty.buffer.ByteBuf tracingMetadata = io.rsocket.rpc.tracing.Tracing.mapToByteBuf(io.netty.buffer.ByteBufAllocator.DEFAULT, map);
        final io.netty.buffer.ByteBuf metadataBuf = io.rsocket.rpc.frames.Metadata.encode(io.netty.buffer.ByteBufAllocator.DEFAULT, HouseService.SERVICE, HouseService.METHOD_GET_HOUSE, tracingMetadata, metadata);
        io.netty.buffer.ByteBuf data = serialize(message);
        tracingMetadata.release();
        return rSocket.requestResponse(io.rsocket.util.ByteBufPayload.create(data, metadataBuf));
      }
    }).map(deserializer(io.agilehandy.proteus.house.service.HouseResponse.parser())).transform(getHouse).transform(getHouseTrace.apply(map));
  }

  @io.rsocket.rpc.annotations.internal.GeneratedMethod(returnTypeClass = io.agilehandy.proteus.house.service.HouseResponse.class)
  public reactor.core.publisher.Flux<io.agilehandy.proteus.house.service.HouseResponse> getHousesByRooms(io.agilehandy.proteus.house.service.HouseRequest message) {
    return getHousesByRooms(message, io.netty.buffer.Unpooled.EMPTY_BUFFER);
  }

  @java.lang.Override
  @io.rsocket.rpc.annotations.internal.GeneratedMethod(returnTypeClass = io.agilehandy.proteus.house.service.HouseResponse.class)
  public reactor.core.publisher.Flux<io.agilehandy.proteus.house.service.HouseResponse> getHousesByRooms(io.agilehandy.proteus.house.service.HouseRequest message, io.netty.buffer.ByteBuf metadata) {
  java.util.Map<String, String> map = new java.util.HashMap<>();
    return reactor.core.publisher.Flux.defer(new java.util.function.Supplier<reactor.core.publisher.Flux<io.rsocket.Payload>>() {
      @java.lang.Override
      public reactor.core.publisher.Flux<io.rsocket.Payload> get() {
        final io.netty.buffer.ByteBuf tracingMetadata = io.rsocket.rpc.tracing.Tracing.mapToByteBuf(io.netty.buffer.ByteBufAllocator.DEFAULT, map);
        final io.netty.buffer.ByteBuf metadataBuf = io.rsocket.rpc.frames.Metadata.encode(io.netty.buffer.ByteBufAllocator.DEFAULT, HouseService.SERVICE, HouseService.METHOD_GET_HOUSES_BY_ROOMS, tracingMetadata, metadata);
        io.netty.buffer.ByteBuf data = serialize(message);
        tracingMetadata.release();
        return rSocket.requestStream(io.rsocket.util.ByteBufPayload.create(data, metadataBuf));
      }
    }).map(deserializer(io.agilehandy.proteus.house.service.HouseResponse.parser())).transform(getHousesByRooms).transform(getHousesByRoomsTrace.apply(map));
  }

  @io.rsocket.rpc.annotations.internal.GeneratedMethod(returnTypeClass = io.agilehandy.proteus.house.service.HouseResponse.class)
  public reactor.core.publisher.Flux<io.agilehandy.proteus.house.service.HouseResponse> getHousesByBaths(io.agilehandy.proteus.house.service.HouseRequest message) {
    return getHousesByBaths(message, io.netty.buffer.Unpooled.EMPTY_BUFFER);
  }

  @java.lang.Override
  @io.rsocket.rpc.annotations.internal.GeneratedMethod(returnTypeClass = io.agilehandy.proteus.house.service.HouseResponse.class)
  public reactor.core.publisher.Flux<io.agilehandy.proteus.house.service.HouseResponse> getHousesByBaths(io.agilehandy.proteus.house.service.HouseRequest message, io.netty.buffer.ByteBuf metadata) {
  java.util.Map<String, String> map = new java.util.HashMap<>();
    return reactor.core.publisher.Flux.defer(new java.util.function.Supplier<reactor.core.publisher.Flux<io.rsocket.Payload>>() {
      @java.lang.Override
      public reactor.core.publisher.Flux<io.rsocket.Payload> get() {
        final io.netty.buffer.ByteBuf tracingMetadata = io.rsocket.rpc.tracing.Tracing.mapToByteBuf(io.netty.buffer.ByteBufAllocator.DEFAULT, map);
        final io.netty.buffer.ByteBuf metadataBuf = io.rsocket.rpc.frames.Metadata.encode(io.netty.buffer.ByteBufAllocator.DEFAULT, HouseService.SERVICE, HouseService.METHOD_GET_HOUSES_BY_BATHS, tracingMetadata, metadata);
        io.netty.buffer.ByteBuf data = serialize(message);
        tracingMetadata.release();
        return rSocket.requestStream(io.rsocket.util.ByteBufPayload.create(data, metadataBuf));
      }
    }).map(deserializer(io.agilehandy.proteus.house.service.HouseResponse.parser())).transform(getHousesByBaths).transform(getHousesByBathsTrace.apply(map));
  }

  @io.rsocket.rpc.annotations.internal.GeneratedMethod(returnTypeClass = io.agilehandy.proteus.house.service.HouseResponse.class)
  public reactor.core.publisher.Flux<io.agilehandy.proteus.house.service.HouseResponse> getHousesByLotsize(io.agilehandy.proteus.house.service.HouseRequest message) {
    return getHousesByLotsize(message, io.netty.buffer.Unpooled.EMPTY_BUFFER);
  }

  @java.lang.Override
  @io.rsocket.rpc.annotations.internal.GeneratedMethod(returnTypeClass = io.agilehandy.proteus.house.service.HouseResponse.class)
  public reactor.core.publisher.Flux<io.agilehandy.proteus.house.service.HouseResponse> getHousesByLotsize(io.agilehandy.proteus.house.service.HouseRequest message, io.netty.buffer.ByteBuf metadata) {
  java.util.Map<String, String> map = new java.util.HashMap<>();
    return reactor.core.publisher.Flux.defer(new java.util.function.Supplier<reactor.core.publisher.Flux<io.rsocket.Payload>>() {
      @java.lang.Override
      public reactor.core.publisher.Flux<io.rsocket.Payload> get() {
        final io.netty.buffer.ByteBuf tracingMetadata = io.rsocket.rpc.tracing.Tracing.mapToByteBuf(io.netty.buffer.ByteBufAllocator.DEFAULT, map);
        final io.netty.buffer.ByteBuf metadataBuf = io.rsocket.rpc.frames.Metadata.encode(io.netty.buffer.ByteBufAllocator.DEFAULT, HouseService.SERVICE, HouseService.METHOD_GET_HOUSES_BY_LOTSIZE, tracingMetadata, metadata);
        io.netty.buffer.ByteBuf data = serialize(message);
        tracingMetadata.release();
        return rSocket.requestStream(io.rsocket.util.ByteBufPayload.create(data, metadataBuf));
      }
    }).map(deserializer(io.agilehandy.proteus.house.service.HouseResponse.parser())).transform(getHousesByLotsize).transform(getHousesByLotsizeTrace.apply(map));
  }

  @io.rsocket.rpc.annotations.internal.GeneratedMethod(returnTypeClass = io.agilehandy.proteus.house.service.HouseResponse.class)
  public reactor.core.publisher.Flux<io.agilehandy.proteus.house.service.HouseResponse> getHousesByPrice(io.agilehandy.proteus.house.service.HouseRequest message) {
    return getHousesByPrice(message, io.netty.buffer.Unpooled.EMPTY_BUFFER);
  }

  @java.lang.Override
  @io.rsocket.rpc.annotations.internal.GeneratedMethod(returnTypeClass = io.agilehandy.proteus.house.service.HouseResponse.class)
  public reactor.core.publisher.Flux<io.agilehandy.proteus.house.service.HouseResponse> getHousesByPrice(io.agilehandy.proteus.house.service.HouseRequest message, io.netty.buffer.ByteBuf metadata) {
  java.util.Map<String, String> map = new java.util.HashMap<>();
    return reactor.core.publisher.Flux.defer(new java.util.function.Supplier<reactor.core.publisher.Flux<io.rsocket.Payload>>() {
      @java.lang.Override
      public reactor.core.publisher.Flux<io.rsocket.Payload> get() {
        final io.netty.buffer.ByteBuf tracingMetadata = io.rsocket.rpc.tracing.Tracing.mapToByteBuf(io.netty.buffer.ByteBufAllocator.DEFAULT, map);
        final io.netty.buffer.ByteBuf metadataBuf = io.rsocket.rpc.frames.Metadata.encode(io.netty.buffer.ByteBufAllocator.DEFAULT, HouseService.SERVICE, HouseService.METHOD_GET_HOUSES_BY_PRICE, tracingMetadata, metadata);
        io.netty.buffer.ByteBuf data = serialize(message);
        tracingMetadata.release();
        return rSocket.requestStream(io.rsocket.util.ByteBufPayload.create(data, metadataBuf));
      }
    }).map(deserializer(io.agilehandy.proteus.house.service.HouseResponse.parser())).transform(getHousesByPrice).transform(getHousesByPriceTrace.apply(map));
  }

  @io.rsocket.rpc.annotations.internal.GeneratedMethod(returnTypeClass = io.agilehandy.proteus.house.service.HouseResponse.class)
  public reactor.core.publisher.Flux<io.agilehandy.proteus.house.service.HouseResponse> getAllHouses(io.agilehandy.proteus.house.service.Empty message) {
    return getAllHouses(message, io.netty.buffer.Unpooled.EMPTY_BUFFER);
  }

  @java.lang.Override
  @io.rsocket.rpc.annotations.internal.GeneratedMethod(returnTypeClass = io.agilehandy.proteus.house.service.HouseResponse.class)
  public reactor.core.publisher.Flux<io.agilehandy.proteus.house.service.HouseResponse> getAllHouses(io.agilehandy.proteus.house.service.Empty message, io.netty.buffer.ByteBuf metadata) {
  java.util.Map<String, String> map = new java.util.HashMap<>();
    return reactor.core.publisher.Flux.defer(new java.util.function.Supplier<reactor.core.publisher.Flux<io.rsocket.Payload>>() {
      @java.lang.Override
      public reactor.core.publisher.Flux<io.rsocket.Payload> get() {
        final io.netty.buffer.ByteBuf tracingMetadata = io.rsocket.rpc.tracing.Tracing.mapToByteBuf(io.netty.buffer.ByteBufAllocator.DEFAULT, map);
        final io.netty.buffer.ByteBuf metadataBuf = io.rsocket.rpc.frames.Metadata.encode(io.netty.buffer.ByteBufAllocator.DEFAULT, HouseService.SERVICE, HouseService.METHOD_GET_ALL_HOUSES, tracingMetadata, metadata);
        io.netty.buffer.ByteBuf data = serialize(message);
        tracingMetadata.release();
        return rSocket.requestStream(io.rsocket.util.ByteBufPayload.create(data, metadataBuf));
      }
    }).map(deserializer(io.agilehandy.proteus.house.service.HouseResponse.parser())).transform(getAllHouses).transform(getAllHousesTrace.apply(map));
  }

  @io.rsocket.rpc.annotations.internal.GeneratedMethod(returnTypeClass = io.agilehandy.proteus.house.service.Identifier.class)
  public reactor.core.publisher.Mono<io.agilehandy.proteus.house.service.Identifier> addHouse(io.agilehandy.proteus.house.service.HouseRequest message) {
    return addHouse(message, io.netty.buffer.Unpooled.EMPTY_BUFFER);
  }

  @java.lang.Override
  @io.rsocket.rpc.annotations.internal.GeneratedMethod(returnTypeClass = io.agilehandy.proteus.house.service.Identifier.class)
  public reactor.core.publisher.Mono<io.agilehandy.proteus.house.service.Identifier> addHouse(io.agilehandy.proteus.house.service.HouseRequest message, io.netty.buffer.ByteBuf metadata) {
  java.util.Map<String, String> map = new java.util.HashMap<>();
    return reactor.core.publisher.Mono.defer(new java.util.function.Supplier<reactor.core.publisher.Mono<io.rsocket.Payload>>() {
      @java.lang.Override
      public reactor.core.publisher.Mono<io.rsocket.Payload> get() {
        final io.netty.buffer.ByteBuf tracingMetadata = io.rsocket.rpc.tracing.Tracing.mapToByteBuf(io.netty.buffer.ByteBufAllocator.DEFAULT, map);
        final io.netty.buffer.ByteBuf metadataBuf = io.rsocket.rpc.frames.Metadata.encode(io.netty.buffer.ByteBufAllocator.DEFAULT, HouseService.SERVICE, HouseService.METHOD_ADD_HOUSE, tracingMetadata, metadata);
        io.netty.buffer.ByteBuf data = serialize(message);
        tracingMetadata.release();
        return rSocket.requestResponse(io.rsocket.util.ByteBufPayload.create(data, metadataBuf));
      }
    }).map(deserializer(io.agilehandy.proteus.house.service.Identifier.parser())).transform(addHouse).transform(addHouseTrace.apply(map));
  }

  private static io.netty.buffer.ByteBuf serialize(final com.google.protobuf.MessageLite message) {
    int length = message.getSerializedSize();
    io.netty.buffer.ByteBuf byteBuf = io.netty.buffer.ByteBufAllocator.DEFAULT.buffer(length);
    try {
      message.writeTo(com.google.protobuf.CodedOutputStream.newInstance(byteBuf.internalNioBuffer(0, length)));
      byteBuf.writerIndex(length);
      return byteBuf;
    } catch (Throwable t) {
      byteBuf.release();
      throw new RuntimeException(t);
    }
  }

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
