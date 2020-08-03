package io.grpc.health.v1.health

object HealthGrpc {
  val METHOD_CHECK: _root_.io.grpc.MethodDescriptor[io.grpc.health.v1.health.HealthCheckRequest, io.grpc.health.v1.health.HealthCheckResponse] =
    _root_.io.grpc.MethodDescriptor.newBuilder()
      .setType(_root_.io.grpc.MethodDescriptor.MethodType.UNARY)
      .setFullMethodName(_root_.io.grpc.MethodDescriptor.generateFullMethodName("grpc.health.v1.Health", "Check"))
      .setSampledToLocalTracing(true)
      .setRequestMarshaller(_root_.scalapb.grpc.Marshaller.forMessage[io.grpc.health.v1.health.HealthCheckRequest])
      .setResponseMarshaller(_root_.scalapb.grpc.Marshaller.forMessage[io.grpc.health.v1.health.HealthCheckResponse])
      .setSchemaDescriptor(_root_.scalapb.grpc.ConcreteProtoMethodDescriptorSupplier.fromMethodDescriptor(io.grpc.health.v1.health.HealthProto.javaDescriptor.getServices.get(0).getMethods.get(0)))
      .build()
  
  val METHOD_WATCH: _root_.io.grpc.MethodDescriptor[io.grpc.health.v1.health.HealthCheckRequest, io.grpc.health.v1.health.HealthCheckResponse] =
    _root_.io.grpc.MethodDescriptor.newBuilder()
      .setType(_root_.io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
      .setFullMethodName(_root_.io.grpc.MethodDescriptor.generateFullMethodName("grpc.health.v1.Health", "Watch"))
      .setSampledToLocalTracing(true)
      .setRequestMarshaller(_root_.scalapb.grpc.Marshaller.forMessage[io.grpc.health.v1.health.HealthCheckRequest])
      .setResponseMarshaller(_root_.scalapb.grpc.Marshaller.forMessage[io.grpc.health.v1.health.HealthCheckResponse])
      .setSchemaDescriptor(_root_.scalapb.grpc.ConcreteProtoMethodDescriptorSupplier.fromMethodDescriptor(io.grpc.health.v1.health.HealthProto.javaDescriptor.getServices.get(0).getMethods.get(1)))
      .build()
  
  val SERVICE: _root_.io.grpc.ServiceDescriptor =
    _root_.io.grpc.ServiceDescriptor.newBuilder("grpc.health.v1.Health")
      .setSchemaDescriptor(new _root_.scalapb.grpc.ConcreteProtoFileDescriptorSupplier(io.grpc.health.v1.health.HealthProto.javaDescriptor))
      .addMethod(METHOD_CHECK)
      .addMethod(METHOD_WATCH)
      .build()
  
  trait Health extends _root_.scalapb.grpc.AbstractService {
    override def serviceCompanion = Health
    def check(request: io.grpc.health.v1.health.HealthCheckRequest): scala.concurrent.Future[io.grpc.health.v1.health.HealthCheckResponse]
    def watch(request: io.grpc.health.v1.health.HealthCheckRequest, responseObserver: _root_.io.grpc.stub.StreamObserver[io.grpc.health.v1.health.HealthCheckResponse]): Unit
  }
  
  object Health extends _root_.scalapb.grpc.ServiceCompanion[Health] {
    implicit def serviceCompanion: _root_.scalapb.grpc.ServiceCompanion[Health] = this
    def javaDescriptor: _root_.com.google.protobuf.Descriptors.ServiceDescriptor = io.grpc.health.v1.health.HealthProto.javaDescriptor.getServices.get(0)
    def scalaDescriptor: _root_.scalapb.descriptors.ServiceDescriptor = io.grpc.health.v1.health.HealthProto.scalaDescriptor.services(0)
    def bindService(serviceImpl: Health, executionContext: scala.concurrent.ExecutionContext): _root_.io.grpc.ServerServiceDefinition =
      _root_.io.grpc.ServerServiceDefinition.builder(SERVICE)
      .addMethod(
        METHOD_CHECK,
        _root_.io.grpc.stub.ServerCalls.asyncUnaryCall(new _root_.io.grpc.stub.ServerCalls.UnaryMethod[io.grpc.health.v1.health.HealthCheckRequest, io.grpc.health.v1.health.HealthCheckResponse] {
          override def invoke(request: io.grpc.health.v1.health.HealthCheckRequest, observer: _root_.io.grpc.stub.StreamObserver[io.grpc.health.v1.health.HealthCheckResponse]): Unit =
            serviceImpl.check(request).onComplete(scalapb.grpc.Grpc.completeObserver(observer))(
              executionContext)
        }))
      .addMethod(
        METHOD_WATCH,
        _root_.io.grpc.stub.ServerCalls.asyncServerStreamingCall(new _root_.io.grpc.stub.ServerCalls.ServerStreamingMethod[io.grpc.health.v1.health.HealthCheckRequest, io.grpc.health.v1.health.HealthCheckResponse] {
          override def invoke(request: io.grpc.health.v1.health.HealthCheckRequest, observer: _root_.io.grpc.stub.StreamObserver[io.grpc.health.v1.health.HealthCheckResponse]): Unit =
            serviceImpl.watch(request, observer)
        }))
      .build()
  }
  
  trait HealthBlockingClient {
    def serviceCompanion = Health
    def check(request: io.grpc.health.v1.health.HealthCheckRequest): io.grpc.health.v1.health.HealthCheckResponse
    def watch(request: io.grpc.health.v1.health.HealthCheckRequest): scala.collection.Iterator[io.grpc.health.v1.health.HealthCheckResponse]
  }
  
  class HealthBlockingStub(channel: _root_.io.grpc.Channel, options: _root_.io.grpc.CallOptions = _root_.io.grpc.CallOptions.DEFAULT) extends _root_.io.grpc.stub.AbstractStub[HealthBlockingStub](channel, options) with HealthBlockingClient {
    override def check(request: io.grpc.health.v1.health.HealthCheckRequest): io.grpc.health.v1.health.HealthCheckResponse = {
      _root_.scalapb.grpc.ClientCalls.blockingUnaryCall(channel, METHOD_CHECK, options, request)
    }
    
    override def watch(request: io.grpc.health.v1.health.HealthCheckRequest): scala.collection.Iterator[io.grpc.health.v1.health.HealthCheckResponse] = {
      _root_.scalapb.grpc.ClientCalls.blockingServerStreamingCall(channel, METHOD_WATCH, options, request)
    }
    
    override def build(channel: _root_.io.grpc.Channel, options: _root_.io.grpc.CallOptions): HealthBlockingStub = new HealthBlockingStub(channel, options)
  }
  
  class HealthStub(channel: _root_.io.grpc.Channel, options: _root_.io.grpc.CallOptions = _root_.io.grpc.CallOptions.DEFAULT) extends _root_.io.grpc.stub.AbstractStub[HealthStub](channel, options) with Health {
    override def check(request: io.grpc.health.v1.health.HealthCheckRequest): scala.concurrent.Future[io.grpc.health.v1.health.HealthCheckResponse] = {
      _root_.scalapb.grpc.ClientCalls.asyncUnaryCall(channel, METHOD_CHECK, options, request)
    }
    
    override def watch(request: io.grpc.health.v1.health.HealthCheckRequest, responseObserver: _root_.io.grpc.stub.StreamObserver[io.grpc.health.v1.health.HealthCheckResponse]): Unit = {
      _root_.scalapb.grpc.ClientCalls.asyncServerStreamingCall(channel, METHOD_WATCH, options, request, responseObserver)
    }
    
    override def build(channel: _root_.io.grpc.Channel, options: _root_.io.grpc.CallOptions): HealthStub = new HealthStub(channel, options)
  }
  
  def bindService(serviceImpl: Health, executionContext: scala.concurrent.ExecutionContext): _root_.io.grpc.ServerServiceDefinition = Health.bindService(serviceImpl, executionContext)
  
  def blockingStub(channel: _root_.io.grpc.Channel): HealthBlockingStub = new HealthBlockingStub(channel)
  
  def stub(channel: _root_.io.grpc.Channel): HealthStub = new HealthStub(channel)
  
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.ServiceDescriptor = io.grpc.health.v1.health.HealthProto.javaDescriptor.getServices.get(0)
  
}