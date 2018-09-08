package io.agilehandy.proteus.house.service;

@javax.annotation.Generated(
    value = "by RSocket RPC proto compiler",
    comments = "Source: io/agilehandy/proteus/house/service/protobuf/service.proto")
@io.rsocket.rpc.annotations.internal.Generated(
    type = io.rsocket.rpc.annotations.internal.ResourceType.SERVICE,
    idlClass = HouseService.class)
@javax.inject.Named(
    value ="HouseServiceServer")
public final class HouseServiceServer extends io.rsocket.rpc.AbstractRSocketService {
  private final HouseService service;
  private final io.opentracing.Tracer tracer;
  private final java.util.function.Function<? super org.reactivestreams.Publisher<io.rsocket.Payload>, ? extends org.reactivestreams.Publisher<io.rsocket.Payload>> getHouse;
  private final java.util.function.Function<? super org.reactivestreams.Publisher<io.rsocket.Payload>, ? extends org.reactivestreams.Publisher<io.rsocket.Payload>> getHousesByRooms;
  private final java.util.function.Function<? super org.reactivestreams.Publisher<io.rsocket.Payload>, ? extends org.reactivestreams.Publisher<io.rsocket.Payload>> getHousesByBaths;
  private final java.util.function.Function<? super org.reactivestreams.Publisher<io.rsocket.Payload>, ? extends org.reactivestreams.Publisher<io.rsocket.Payload>> getHousesByLotsize;
  private final java.util.function.Function<? super org.reactivestreams.Publisher<io.rsocket.Payload>, ? extends org.reactivestreams.Publisher<io.rsocket.Payload>> getHousesByPrice;
  private final java.util.function.Function<? super org.reactivestreams.Publisher<io.rsocket.Payload>, ? extends org.reactivestreams.Publisher<io.rsocket.Payload>> getAllHouses;
  private final java.util.function.Function<? super org.reactivestreams.Publisher<io.rsocket.Payload>, ? extends org.reactivestreams.Publisher<io.rsocket.Payload>> addHouse;
  private final java.util.function.Function<io.opentracing.SpanContext, java.util.function.Function<? super org.reactivestreams.Publisher<io.rsocket.Payload>, ? extends org.reactivestreams.Publisher<io.rsocket.Payload>>> getHouseTrace;
  private final java.util.function.Function<io.opentracing.SpanContext, java.util.function.Function<? super org.reactivestreams.Publisher<io.rsocket.Payload>, ? extends org.reactivestreams.Publisher<io.rsocket.Payload>>> getHousesByRoomsTrace;
  private final java.util.function.Function<io.opentracing.SpanContext, java.util.function.Function<? super org.reactivestreams.Publisher<io.rsocket.Payload>, ? extends org.reactivestreams.Publisher<io.rsocket.Payload>>> getHousesByBathsTrace;
  private final java.util.function.Function<io.opentracing.SpanContext, java.util.function.Function<? super org.reactivestreams.Publisher<io.rsocket.Payload>, ? extends org.reactivestreams.Publisher<io.rsocket.Payload>>> getHousesByLotsizeTrace;
  private final java.util.function.Function<io.opentracing.SpanContext, java.util.function.Function<? super org.reactivestreams.Publisher<io.rsocket.Payload>, ? extends org.reactivestreams.Publisher<io.rsocket.Payload>>> getHousesByPriceTrace;
  private final java.util.function.Function<io.opentracing.SpanContext, java.util.function.Function<? super org.reactivestreams.Publisher<io.rsocket.Payload>, ? extends org.reactivestreams.Publisher<io.rsocket.Payload>>> getAllHousesTrace;
  private final java.util.function.Function<io.opentracing.SpanContext, java.util.function.Function<? super org.reactivestreams.Publisher<io.rsocket.Payload>, ? extends org.reactivestreams.Publisher<io.rsocket.Payload>>> addHouseTrace;
  @javax.inject.Inject
  public HouseServiceServer(HouseService service, java.util.Optional<io.micrometer.core.instrument.MeterRegistry> registry, java.util.Optional<io.opentracing.Tracer> tracer) {
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
      this.getHouse = io.rsocket.rpc.metrics.Metrics.timed(registry.get(), "rsocket.server", "service", HouseService.SERVICE, "method", HouseService.METHOD_GET_HOUSE);
      this.getHousesByRooms = io.rsocket.rpc.metrics.Metrics.timed(registry.get(), "rsocket.server", "service", HouseService.SERVICE, "method", HouseService.METHOD_GET_HOUSES_BY_ROOMS);
      this.getHousesByBaths = io.rsocket.rpc.metrics.Metrics.timed(registry.get(), "rsocket.server", "service", HouseService.SERVICE, "method", HouseService.METHOD_GET_HOUSES_BY_BATHS);
      this.getHousesByLotsize = io.rsocket.rpc.metrics.Metrics.timed(registry.get(), "rsocket.server", "service", HouseService.SERVICE, "method", HouseService.METHOD_GET_HOUSES_BY_LOTSIZE);
      this.getHousesByPrice = io.rsocket.rpc.metrics.Metrics.timed(registry.get(), "rsocket.server", "service", HouseService.SERVICE, "method", HouseService.METHOD_GET_HOUSES_BY_PRICE);
      this.getAllHouses = io.rsocket.rpc.metrics.Metrics.timed(registry.get(), "rsocket.server", "service", HouseService.SERVICE, "method", HouseService.METHOD_GET_ALL_HOUSES);
      this.addHouse = io.rsocket.rpc.metrics.Metrics.timed(registry.get(), "rsocket.server", "service", HouseService.SERVICE, "method", HouseService.METHOD_ADD_HOUSE);
    }

    if (!tracer.isPresent()) {
      this.tracer = null;
      this.getHouseTrace = io.rsocket.rpc.tracing.Tracing.traceAsChild();
      this.getHousesByRoomsTrace = io.rsocket.rpc.tracing.Tracing.traceAsChild();
      this.getHousesByBathsTrace = io.rsocket.rpc.tracing.Tracing.traceAsChild();
      this.getHousesByLotsizeTrace = io.rsocket.rpc.tracing.Tracing.traceAsChild();
      this.getHousesByPriceTrace = io.rsocket.rpc.tracing.Tracing.traceAsChild();
      this.getAllHousesTrace = io.rsocket.rpc.tracing.Tracing.traceAsChild();
      this.addHouseTrace = io.rsocket.rpc.tracing.Tracing.traceAsChild();
    } else {
      this.tracer = tracer.get();
      this.getHouseTrace = io.rsocket.rpc.tracing.Tracing.traceAsChild(this.tracer, HouseService.METHOD_GET_HOUSE, io.rsocket.rpc.tracing.Tag.of("rsocket.service", HouseService.SERVICE), io.rsocket.rpc.tracing.Tag.of("rsocket.rpc.role", "server"), io.rsocket.rpc.tracing.Tag.of("rsocket.rpc.version", ""));
      this.getHousesByRoomsTrace = io.rsocket.rpc.tracing.Tracing.traceAsChild(this.tracer, HouseService.METHOD_GET_HOUSES_BY_ROOMS, io.rsocket.rpc.tracing.Tag.of("rsocket.service", HouseService.SERVICE), io.rsocket.rpc.tracing.Tag.of("rsocket.rpc.role", "server"), io.rsocket.rpc.tracing.Tag.of("rsocket.rpc.version", ""));
      this.getHousesByBathsTrace = io.rsocket.rpc.tracing.Tracing.traceAsChild(this.tracer, HouseService.METHOD_GET_HOUSES_BY_BATHS, io.rsocket.rpc.tracing.Tag.of("rsocket.service", HouseService.SERVICE), io.rsocket.rpc.tracing.Tag.of("rsocket.rpc.role", "server"), io.rsocket.rpc.tracing.Tag.of("rsocket.rpc.version", ""));
      this.getHousesByLotsizeTrace = io.rsocket.rpc.tracing.Tracing.traceAsChild(this.tracer, HouseService.METHOD_GET_HOUSES_BY_LOTSIZE, io.rsocket.rpc.tracing.Tag.of("rsocket.service", HouseService.SERVICE), io.rsocket.rpc.tracing.Tag.of("rsocket.rpc.role", "server"), io.rsocket.rpc.tracing.Tag.of("rsocket.rpc.version", ""));
      this.getHousesByPriceTrace = io.rsocket.rpc.tracing.Tracing.traceAsChild(this.tracer, HouseService.METHOD_GET_HOUSES_BY_PRICE, io.rsocket.rpc.tracing.Tag.of("rsocket.service", HouseService.SERVICE), io.rsocket.rpc.tracing.Tag.of("rsocket.rpc.role", "server"), io.rsocket.rpc.tracing.Tag.of("rsocket.rpc.version", ""));
      this.getAllHousesTrace = io.rsocket.rpc.tracing.Tracing.traceAsChild(this.tracer, HouseService.METHOD_GET_ALL_HOUSES, io.rsocket.rpc.tracing.Tag.of("rsocket.service", HouseService.SERVICE), io.rsocket.rpc.tracing.Tag.of("rsocket.rpc.role", "server"), io.rsocket.rpc.tracing.Tag.of("rsocket.rpc.version", ""));
      this.addHouseTrace = io.rsocket.rpc.tracing.Tracing.traceAsChild(this.tracer, HouseService.METHOD_ADD_HOUSE, io.rsocket.rpc.tracing.Tag.of("rsocket.service", HouseService.SERVICE), io.rsocket.rpc.tracing.Tag.of("rsocket.rpc.role", "server"), io.rsocket.rpc.tracing.Tag.of("rsocket.rpc.version", ""));
    }

  }

  @java.lang.Override
  public String getService() {
    return HouseService.SERVICE;
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
      io.opentracing.SpanContext spanContext = io.rsocket.rpc.tracing.Tracing.deserializeTracingMetadata(tracer, metadata);
      switch(io.rsocket.rpc.frames.Metadata.getMethod(metadata)) {
        case HouseService.METHOD_GET_HOUSE: {
          com.google.protobuf.CodedInputStream is = com.google.protobuf.CodedInputStream.newInstance(payload.getData());
          return service.getHouse(io.agilehandy.proteus.house.service.HouseRequest.parseFrom(is), metadata).map(serializer).transform(getHouse).transform(getHouseTrace.apply(spanContext));
        }
        case HouseService.METHOD_ADD_HOUSE: {
          com.google.protobuf.CodedInputStream is = com.google.protobuf.CodedInputStream.newInstance(payload.getData());
          return service.addHouse(io.agilehandy.proteus.house.service.HouseRequest.parseFrom(is), metadata).map(serializer).transform(addHouse).transform(addHouseTrace.apply(spanContext));
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
      io.opentracing.SpanContext spanContext = io.rsocket.rpc.tracing.Tracing.deserializeTracingMetadata(tracer, metadata);
      switch(io.rsocket.rpc.frames.Metadata.getMethod(metadata)) {
        case HouseService.METHOD_GET_HOUSES_BY_ROOMS: {
          com.google.protobuf.CodedInputStream is = com.google.protobuf.CodedInputStream.newInstance(payload.getData());
          return service.getHousesByRooms(io.agilehandy.proteus.house.service.HouseRequest.parseFrom(is), metadata).map(serializer).transform(getHousesByRooms).transform(getHousesByRoomsTrace.apply(spanContext));
        }
        case HouseService.METHOD_GET_HOUSES_BY_BATHS: {
          com.google.protobuf.CodedInputStream is = com.google.protobuf.CodedInputStream.newInstance(payload.getData());
          return service.getHousesByBaths(io.agilehandy.proteus.house.service.HouseRequest.parseFrom(is), metadata).map(serializer).transform(getHousesByBaths).transform(getHousesByBathsTrace.apply(spanContext));
        }
        case HouseService.METHOD_GET_HOUSES_BY_LOTSIZE: {
          com.google.protobuf.CodedInputStream is = com.google.protobuf.CodedInputStream.newInstance(payload.getData());
          return service.getHousesByLotsize(io.agilehandy.proteus.house.service.HouseRequest.parseFrom(is), metadata).map(serializer).transform(getHousesByLotsize).transform(getHousesByLotsizeTrace.apply(spanContext));
        }
        case HouseService.METHOD_GET_HOUSES_BY_PRICE: {
          com.google.protobuf.CodedInputStream is = com.google.protobuf.CodedInputStream.newInstance(payload.getData());
          return service.getHousesByPrice(io.agilehandy.proteus.house.service.HouseRequest.parseFrom(is), metadata).map(serializer).transform(getHousesByPrice).transform(getHousesByPriceTrace.apply(spanContext));
        }
        case HouseService.METHOD_GET_ALL_HOUSES: {
          com.google.protobuf.CodedInputStream is = com.google.protobuf.CodedInputStream.newInstance(payload.getData());
          return service.getAllHouses(io.agilehandy.proteus.house.service.Empty.parseFrom(is), metadata).map(serializer).transform(getAllHouses).transform(getAllHousesTrace.apply(spanContext));
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
