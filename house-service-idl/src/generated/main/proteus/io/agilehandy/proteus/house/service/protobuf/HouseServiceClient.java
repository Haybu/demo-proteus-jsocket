package io.agilehandy.proteus.house.service.protobuf;

@javax.annotation.Generated(
    value = "by Proteus proto compiler (version 0.8.9)",
    comments = "Source: io/agilehandy/proteus/house/service/protobuf/service.proto")
@io.netifi.proteus.annotations.internal.ProteusGenerated(
    type = io.netifi.proteus.annotations.internal.ProteusResourceType.CLIENT,
    idlClass = HouseService.class)
public final class HouseServiceClient implements HouseService {
  private final io.rsocket.RSocket rSocket;
  private final java.util.function.Function<? super org.reactivestreams.Publisher<io.agilehandy.proteus.house.service.protobuf.HouseResponse>, ? extends org.reactivestreams.Publisher<io.agilehandy.proteus.house.service.protobuf.HouseResponse>> getHouse;
  private final java.util.function.Function<? super org.reactivestreams.Publisher<io.agilehandy.proteus.house.service.protobuf.HouseResponse>, ? extends org.reactivestreams.Publisher<io.agilehandy.proteus.house.service.protobuf.HouseResponse>> getHousesByRooms;
  private final java.util.function.Function<? super org.reactivestreams.Publisher<io.agilehandy.proteus.house.service.protobuf.HouseResponse>, ? extends org.reactivestreams.Publisher<io.agilehandy.proteus.house.service.protobuf.HouseResponse>> getHousesByBaths;
  private final java.util.function.Function<? super org.reactivestreams.Publisher<io.agilehandy.proteus.house.service.protobuf.HouseResponse>, ? extends org.reactivestreams.Publisher<io.agilehandy.proteus.house.service.protobuf.HouseResponse>> getHousesByLotsize;
  private final java.util.function.Function<? super org.reactivestreams.Publisher<io.agilehandy.proteus.house.service.protobuf.HouseResponse>, ? extends org.reactivestreams.Publisher<io.agilehandy.proteus.house.service.protobuf.HouseResponse>> getHousesByPrice;
  private final java.util.function.Function<java.util.Map<String, String>, java.util.function.Function<? super org.reactivestreams.Publisher<io.agilehandy.proteus.house.service.protobuf.HouseResponse>, ? extends org.reactivestreams.Publisher<io.agilehandy.proteus.house.service.protobuf.HouseResponse>>> getHouseTrace;
  private final java.util.function.Function<java.util.Map<String, String>, java.util.function.Function<? super org.reactivestreams.Publisher<io.agilehandy.proteus.house.service.protobuf.HouseResponse>, ? extends org.reactivestreams.Publisher<io.agilehandy.proteus.house.service.protobuf.HouseResponse>>> getHousesByRoomsTrace;
  private final java.util.function.Function<java.util.Map<String, String>, java.util.function.Function<? super org.reactivestreams.Publisher<io.agilehandy.proteus.house.service.protobuf.HouseResponse>, ? extends org.reactivestreams.Publisher<io.agilehandy.proteus.house.service.protobuf.HouseResponse>>> getHousesByBathsTrace;
  private final java.util.function.Function<java.util.Map<String, String>, java.util.function.Function<? super org.reactivestreams.Publisher<io.agilehandy.proteus.house.service.protobuf.HouseResponse>, ? extends org.reactivestreams.Publisher<io.agilehandy.proteus.house.service.protobuf.HouseResponse>>> getHousesByLotsizeTrace;
  private final java.util.function.Function<java.util.Map<String, String>, java.util.function.Function<? super org.reactivestreams.Publisher<io.agilehandy.proteus.house.service.protobuf.HouseResponse>, ? extends org.reactivestreams.Publisher<io.agilehandy.proteus.house.service.protobuf.HouseResponse>>> getHousesByPriceTrace;

  public HouseServiceClient(io.rsocket.RSocket rSocket) {
    this.rSocket = rSocket;
    this.getHouse = java.util.function.Function.identity();
    this.getHousesByRooms = java.util.function.Function.identity();
    this.getHousesByBaths = java.util.function.Function.identity();
    this.getHousesByLotsize = java.util.function.Function.identity();
    this.getHousesByPrice = java.util.function.Function.identity();
    this.getHouseTrace = io.netifi.proteus.tracing.ProteusTracing.trace();
    this.getHousesByRoomsTrace = io.netifi.proteus.tracing.ProteusTracing.trace();
    this.getHousesByBathsTrace = io.netifi.proteus.tracing.ProteusTracing.trace();
    this.getHousesByLotsizeTrace = io.netifi.proteus.tracing.ProteusTracing.trace();
    this.getHousesByPriceTrace = io.netifi.proteus.tracing.ProteusTracing.trace();
  }

  public HouseServiceClient(io.rsocket.RSocket rSocket, io.micrometer.core.instrument.MeterRegistry registry) {
    this.rSocket = rSocket;
    this.getHouse = io.netifi.proteus.metrics.ProteusMetrics.timed(registry, "proteus.client", "service", HouseService.SERVICE, "method", HouseService.METHOD_GET_HOUSE);
    this.getHousesByRooms = io.netifi.proteus.metrics.ProteusMetrics.timed(registry, "proteus.client", "service", HouseService.SERVICE, "method", HouseService.METHOD_GET_HOUSES_BY_ROOMS);
    this.getHousesByBaths = io.netifi.proteus.metrics.ProteusMetrics.timed(registry, "proteus.client", "service", HouseService.SERVICE, "method", HouseService.METHOD_GET_HOUSES_BY_BATHS);
    this.getHousesByLotsize = io.netifi.proteus.metrics.ProteusMetrics.timed(registry, "proteus.client", "service", HouseService.SERVICE, "method", HouseService.METHOD_GET_HOUSES_BY_LOTSIZE);
    this.getHousesByPrice = io.netifi.proteus.metrics.ProteusMetrics.timed(registry, "proteus.client", "service", HouseService.SERVICE, "method", HouseService.METHOD_GET_HOUSES_BY_PRICE);
    this.getHouseTrace = io.netifi.proteus.tracing.ProteusTracing.trace();
    this.getHousesByRoomsTrace = io.netifi.proteus.tracing.ProteusTracing.trace();
    this.getHousesByBathsTrace = io.netifi.proteus.tracing.ProteusTracing.trace();
    this.getHousesByLotsizeTrace = io.netifi.proteus.tracing.ProteusTracing.trace();
    this.getHousesByPriceTrace = io.netifi.proteus.tracing.ProteusTracing.trace();
  }


  public HouseServiceClient(io.rsocket.RSocket rSocket, io.opentracing.Tracer tracer) {
    this.rSocket = rSocket;
    this.getHouse = java.util.function.Function.identity();
    this.getHousesByRooms = java.util.function.Function.identity();
    this.getHousesByBaths = java.util.function.Function.identity();
    this.getHousesByLotsize = java.util.function.Function.identity();
    this.getHousesByPrice = java.util.function.Function.identity();
    this.getHouseTrace = io.netifi.proteus.tracing.ProteusTracing.trace(tracer, HouseService.METHOD_GET_HOUSE, io.netifi.proteus.tracing.Tag.of("proteus.service", HouseService.SERVICE), io.netifi.proteus.tracing.Tag.of("proteus.type", "client"), io.netifi.proteus.tracing.Tag.of("proteus.version", "0.8.9"));
    this.getHousesByRoomsTrace = io.netifi.proteus.tracing.ProteusTracing.trace(tracer, HouseService.METHOD_GET_HOUSES_BY_ROOMS, io.netifi.proteus.tracing.Tag.of("proteus.service", HouseService.SERVICE), io.netifi.proteus.tracing.Tag.of("proteus.type", "client"), io.netifi.proteus.tracing.Tag.of("proteus.version", "0.8.9"));
    this.getHousesByBathsTrace = io.netifi.proteus.tracing.ProteusTracing.trace(tracer, HouseService.METHOD_GET_HOUSES_BY_BATHS, io.netifi.proteus.tracing.Tag.of("proteus.service", HouseService.SERVICE), io.netifi.proteus.tracing.Tag.of("proteus.type", "client"), io.netifi.proteus.tracing.Tag.of("proteus.version", "0.8.9"));
    this.getHousesByLotsizeTrace = io.netifi.proteus.tracing.ProteusTracing.trace(tracer, HouseService.METHOD_GET_HOUSES_BY_LOTSIZE, io.netifi.proteus.tracing.Tag.of("proteus.service", HouseService.SERVICE), io.netifi.proteus.tracing.Tag.of("proteus.type", "client"), io.netifi.proteus.tracing.Tag.of("proteus.version", "0.8.9"));
    this.getHousesByPriceTrace = io.netifi.proteus.tracing.ProteusTracing.trace(tracer, HouseService.METHOD_GET_HOUSES_BY_PRICE, io.netifi.proteus.tracing.Tag.of("proteus.service", HouseService.SERVICE), io.netifi.proteus.tracing.Tag.of("proteus.type", "client"), io.netifi.proteus.tracing.Tag.of("proteus.version", "0.8.9"));
  }


  public HouseServiceClient(io.rsocket.RSocket rSocket, io.micrometer.core.instrument.MeterRegistry registry, io.opentracing.Tracer tracer) {
    this.rSocket = rSocket;
    this.getHouse = io.netifi.proteus.metrics.ProteusMetrics.timed(registry, "proteus.client", "service", HouseService.SERVICE, "method", HouseService.METHOD_GET_HOUSE);
    this.getHousesByRooms = io.netifi.proteus.metrics.ProteusMetrics.timed(registry, "proteus.client", "service", HouseService.SERVICE, "method", HouseService.METHOD_GET_HOUSES_BY_ROOMS);
    this.getHousesByBaths = io.netifi.proteus.metrics.ProteusMetrics.timed(registry, "proteus.client", "service", HouseService.SERVICE, "method", HouseService.METHOD_GET_HOUSES_BY_BATHS);
    this.getHousesByLotsize = io.netifi.proteus.metrics.ProteusMetrics.timed(registry, "proteus.client", "service", HouseService.SERVICE, "method", HouseService.METHOD_GET_HOUSES_BY_LOTSIZE);
    this.getHousesByPrice = io.netifi.proteus.metrics.ProteusMetrics.timed(registry, "proteus.client", "service", HouseService.SERVICE, "method", HouseService.METHOD_GET_HOUSES_BY_PRICE);
    this.getHouseTrace = io.netifi.proteus.tracing.ProteusTracing.trace(tracer, HouseService.METHOD_GET_HOUSE, io.netifi.proteus.tracing.Tag.of("proteus.service", HouseService.SERVICE), io.netifi.proteus.tracing.Tag.of("proteus.type", "client"), io.netifi.proteus.tracing.Tag.of("proteus.version", "0.8.9"));
    this.getHousesByRoomsTrace = io.netifi.proteus.tracing.ProteusTracing.trace(tracer, HouseService.METHOD_GET_HOUSES_BY_ROOMS, io.netifi.proteus.tracing.Tag.of("proteus.service", HouseService.SERVICE), io.netifi.proteus.tracing.Tag.of("proteus.type", "client"), io.netifi.proteus.tracing.Tag.of("proteus.version", "0.8.9"));
    this.getHousesByBathsTrace = io.netifi.proteus.tracing.ProteusTracing.trace(tracer, HouseService.METHOD_GET_HOUSES_BY_BATHS, io.netifi.proteus.tracing.Tag.of("proteus.service", HouseService.SERVICE), io.netifi.proteus.tracing.Tag.of("proteus.type", "client"), io.netifi.proteus.tracing.Tag.of("proteus.version", "0.8.9"));
    this.getHousesByLotsizeTrace = io.netifi.proteus.tracing.ProteusTracing.trace(tracer, HouseService.METHOD_GET_HOUSES_BY_LOTSIZE, io.netifi.proteus.tracing.Tag.of("proteus.service", HouseService.SERVICE), io.netifi.proteus.tracing.Tag.of("proteus.type", "client"), io.netifi.proteus.tracing.Tag.of("proteus.version", "0.8.9"));
    this.getHousesByPriceTrace = io.netifi.proteus.tracing.ProteusTracing.trace(tracer, HouseService.METHOD_GET_HOUSES_BY_PRICE, io.netifi.proteus.tracing.Tag.of("proteus.service", HouseService.SERVICE), io.netifi.proteus.tracing.Tag.of("proteus.type", "client"), io.netifi.proteus.tracing.Tag.of("proteus.version", "0.8.9"));
  }

  @io.netifi.proteus.annotations.internal.ProteusGeneratedMethod(returnTypeClass = io.agilehandy.proteus.house.service.protobuf.HouseResponse.class)
  public reactor.core.publisher.Mono<io.agilehandy.proteus.house.service.protobuf.HouseResponse> getHouse(io.agilehandy.proteus.house.service.protobuf.HouseRequest message) {
    return getHouse(message, io.netty.buffer.Unpooled.EMPTY_BUFFER);
  }

  @java.lang.Override
  @io.netifi.proteus.annotations.internal.ProteusGeneratedMethod(returnTypeClass = io.agilehandy.proteus.house.service.protobuf.HouseResponse.class)
  public reactor.core.publisher.Mono<io.agilehandy.proteus.house.service.protobuf.HouseResponse> getHouse(io.agilehandy.proteus.house.service.protobuf.HouseRequest message, io.netty.buffer.ByteBuf metadata) {
  java.util.Map<String, String> map = new java.util.HashMap<>();
    return reactor.core.publisher.Mono.defer(new java.util.function.Supplier<reactor.core.publisher.Mono<io.rsocket.Payload>>() {
      @java.lang.Override
      public reactor.core.publisher.Mono<io.rsocket.Payload> get() {
        final io.netty.buffer.ByteBuf tracingMetadata = io.netifi.proteus.tracing.ProteusTracing.mapToByteBuf(io.netty.buffer.ByteBufAllocator.DEFAULT, map);
        final io.netty.buffer.ByteBuf metadataBuf = io.netifi.proteus.frames.ProteusMetadata.encode(io.netty.buffer.ByteBufAllocator.DEFAULT, HouseService.SERVICE, HouseService.METHOD_GET_HOUSE, tracingMetadata, metadata);
        io.netty.buffer.ByteBuf data = serialize(message);
        tracingMetadata.release();
        return rSocket.requestResponse(io.rsocket.util.ByteBufPayload.create(data, metadataBuf));
      }
    }).map(deserializer(io.agilehandy.proteus.house.service.protobuf.HouseResponse.parser())).transform(getHouse).transform(getHouseTrace.apply(map));
  }

  @io.netifi.proteus.annotations.internal.ProteusGeneratedMethod(returnTypeClass = io.agilehandy.proteus.house.service.protobuf.HouseResponse.class)
  public reactor.core.publisher.Flux<io.agilehandy.proteus.house.service.protobuf.HouseResponse> getHousesByRooms(io.agilehandy.proteus.house.service.protobuf.HouseRequest message) {
    return getHousesByRooms(message, io.netty.buffer.Unpooled.EMPTY_BUFFER);
  }

  @java.lang.Override
  @io.netifi.proteus.annotations.internal.ProteusGeneratedMethod(returnTypeClass = io.agilehandy.proteus.house.service.protobuf.HouseResponse.class)
  public reactor.core.publisher.Flux<io.agilehandy.proteus.house.service.protobuf.HouseResponse> getHousesByRooms(io.agilehandy.proteus.house.service.protobuf.HouseRequest message, io.netty.buffer.ByteBuf metadata) {
  java.util.Map<String, String> map = new java.util.HashMap<>();
    return reactor.core.publisher.Flux.defer(new java.util.function.Supplier<reactor.core.publisher.Flux<io.rsocket.Payload>>() {
      @java.lang.Override
      public reactor.core.publisher.Flux<io.rsocket.Payload> get() {
        final io.netty.buffer.ByteBuf tracingMetadata = io.netifi.proteus.tracing.ProteusTracing.mapToByteBuf(io.netty.buffer.ByteBufAllocator.DEFAULT, map);
        final io.netty.buffer.ByteBuf metadataBuf = io.netifi.proteus.frames.ProteusMetadata.encode(io.netty.buffer.ByteBufAllocator.DEFAULT, HouseService.SERVICE, HouseService.METHOD_GET_HOUSES_BY_ROOMS, tracingMetadata, metadata);
        io.netty.buffer.ByteBuf data = serialize(message);
        tracingMetadata.release();
        return rSocket.requestStream(io.rsocket.util.ByteBufPayload.create(data, metadataBuf));
      }
    }).map(deserializer(io.agilehandy.proteus.house.service.protobuf.HouseResponse.parser())).transform(getHousesByRooms).transform(getHousesByRoomsTrace.apply(map));
  }

  @io.netifi.proteus.annotations.internal.ProteusGeneratedMethod(returnTypeClass = io.agilehandy.proteus.house.service.protobuf.HouseResponse.class)
  public reactor.core.publisher.Flux<io.agilehandy.proteus.house.service.protobuf.HouseResponse> getHousesByBaths(io.agilehandy.proteus.house.service.protobuf.HouseRequest message) {
    return getHousesByBaths(message, io.netty.buffer.Unpooled.EMPTY_BUFFER);
  }

  @java.lang.Override
  @io.netifi.proteus.annotations.internal.ProteusGeneratedMethod(returnTypeClass = io.agilehandy.proteus.house.service.protobuf.HouseResponse.class)
  public reactor.core.publisher.Flux<io.agilehandy.proteus.house.service.protobuf.HouseResponse> getHousesByBaths(io.agilehandy.proteus.house.service.protobuf.HouseRequest message, io.netty.buffer.ByteBuf metadata) {
  java.util.Map<String, String> map = new java.util.HashMap<>();
    return reactor.core.publisher.Flux.defer(new java.util.function.Supplier<reactor.core.publisher.Flux<io.rsocket.Payload>>() {
      @java.lang.Override
      public reactor.core.publisher.Flux<io.rsocket.Payload> get() {
        final io.netty.buffer.ByteBuf tracingMetadata = io.netifi.proteus.tracing.ProteusTracing.mapToByteBuf(io.netty.buffer.ByteBufAllocator.DEFAULT, map);
        final io.netty.buffer.ByteBuf metadataBuf = io.netifi.proteus.frames.ProteusMetadata.encode(io.netty.buffer.ByteBufAllocator.DEFAULT, HouseService.SERVICE, HouseService.METHOD_GET_HOUSES_BY_BATHS, tracingMetadata, metadata);
        io.netty.buffer.ByteBuf data = serialize(message);
        tracingMetadata.release();
        return rSocket.requestStream(io.rsocket.util.ByteBufPayload.create(data, metadataBuf));
      }
    }).map(deserializer(io.agilehandy.proteus.house.service.protobuf.HouseResponse.parser())).transform(getHousesByBaths).transform(getHousesByBathsTrace.apply(map));
  }

  @io.netifi.proteus.annotations.internal.ProteusGeneratedMethod(returnTypeClass = io.agilehandy.proteus.house.service.protobuf.HouseResponse.class)
  public reactor.core.publisher.Flux<io.agilehandy.proteus.house.service.protobuf.HouseResponse> getHousesByLotsize(io.agilehandy.proteus.house.service.protobuf.HouseRequest message) {
    return getHousesByLotsize(message, io.netty.buffer.Unpooled.EMPTY_BUFFER);
  }

  @java.lang.Override
  @io.netifi.proteus.annotations.internal.ProteusGeneratedMethod(returnTypeClass = io.agilehandy.proteus.house.service.protobuf.HouseResponse.class)
  public reactor.core.publisher.Flux<io.agilehandy.proteus.house.service.protobuf.HouseResponse> getHousesByLotsize(io.agilehandy.proteus.house.service.protobuf.HouseRequest message, io.netty.buffer.ByteBuf metadata) {
  java.util.Map<String, String> map = new java.util.HashMap<>();
    return reactor.core.publisher.Flux.defer(new java.util.function.Supplier<reactor.core.publisher.Flux<io.rsocket.Payload>>() {
      @java.lang.Override
      public reactor.core.publisher.Flux<io.rsocket.Payload> get() {
        final io.netty.buffer.ByteBuf tracingMetadata = io.netifi.proteus.tracing.ProteusTracing.mapToByteBuf(io.netty.buffer.ByteBufAllocator.DEFAULT, map);
        final io.netty.buffer.ByteBuf metadataBuf = io.netifi.proteus.frames.ProteusMetadata.encode(io.netty.buffer.ByteBufAllocator.DEFAULT, HouseService.SERVICE, HouseService.METHOD_GET_HOUSES_BY_LOTSIZE, tracingMetadata, metadata);
        io.netty.buffer.ByteBuf data = serialize(message);
        tracingMetadata.release();
        return rSocket.requestStream(io.rsocket.util.ByteBufPayload.create(data, metadataBuf));
      }
    }).map(deserializer(io.agilehandy.proteus.house.service.protobuf.HouseResponse.parser())).transform(getHousesByLotsize).transform(getHousesByLotsizeTrace.apply(map));
  }

  @io.netifi.proteus.annotations.internal.ProteusGeneratedMethod(returnTypeClass = io.agilehandy.proteus.house.service.protobuf.HouseResponse.class)
  public reactor.core.publisher.Flux<io.agilehandy.proteus.house.service.protobuf.HouseResponse> getHousesByPrice(io.agilehandy.proteus.house.service.protobuf.HouseRequest message) {
    return getHousesByPrice(message, io.netty.buffer.Unpooled.EMPTY_BUFFER);
  }

  @java.lang.Override
  @io.netifi.proteus.annotations.internal.ProteusGeneratedMethod(returnTypeClass = io.agilehandy.proteus.house.service.protobuf.HouseResponse.class)
  public reactor.core.publisher.Flux<io.agilehandy.proteus.house.service.protobuf.HouseResponse> getHousesByPrice(io.agilehandy.proteus.house.service.protobuf.HouseRequest message, io.netty.buffer.ByteBuf metadata) {
  java.util.Map<String, String> map = new java.util.HashMap<>();
    return reactor.core.publisher.Flux.defer(new java.util.function.Supplier<reactor.core.publisher.Flux<io.rsocket.Payload>>() {
      @java.lang.Override
      public reactor.core.publisher.Flux<io.rsocket.Payload> get() {
        final io.netty.buffer.ByteBuf tracingMetadata = io.netifi.proteus.tracing.ProteusTracing.mapToByteBuf(io.netty.buffer.ByteBufAllocator.DEFAULT, map);
        final io.netty.buffer.ByteBuf metadataBuf = io.netifi.proteus.frames.ProteusMetadata.encode(io.netty.buffer.ByteBufAllocator.DEFAULT, HouseService.SERVICE, HouseService.METHOD_GET_HOUSES_BY_PRICE, tracingMetadata, metadata);
        io.netty.buffer.ByteBuf data = serialize(message);
        tracingMetadata.release();
        return rSocket.requestStream(io.rsocket.util.ByteBufPayload.create(data, metadataBuf));
      }
    }).map(deserializer(io.agilehandy.proteus.house.service.protobuf.HouseResponse.parser())).transform(getHousesByPrice).transform(getHousesByPriceTrace.apply(map));
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
