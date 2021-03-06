// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package io.grpc.health.v1.health

@SerialVersionUID(0L)
final case class HealthCheckResponse(
    status: io.grpc.health.v1.health.HealthCheckResponse.ServingStatus = io.grpc.health.v1.health.HealthCheckResponse.ServingStatus.UNKNOWN,
    unknownFields: _root_.scalapb.UnknownFieldSet = _root_.scalapb.UnknownFieldSet.empty
    ) extends scalapb.GeneratedMessage with scalapb.lenses.Updatable[HealthCheckResponse] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      
      {
        val __value = status.value
        if (__value != 0) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeEnumSize(1, __value)
        }
      };
      __size += unknownFields.serializedSize
      __size
    }
    override def serializedSize: _root_.scala.Int = {
      var read = __serializedSizeCachedValue
      if (read == 0) {
        read = __computeSerializedValue()
        __serializedSizeCachedValue = read
      }
      read
    }
    def writeTo(`_output__`: _root_.com.google.protobuf.CodedOutputStream): _root_.scala.Unit = {
      {
        val __v = status.value
        if (__v != 0) {
          _output__.writeEnum(1, __v)
        }
      };
      unknownFields.writeTo(_output__)
    }
    def withStatus(__v: io.grpc.health.v1.health.HealthCheckResponse.ServingStatus): HealthCheckResponse = copy(status = __v)
    def withUnknownFields(__v: _root_.scalapb.UnknownFieldSet) = copy(unknownFields = __v)
    def discardUnknownFields = copy(unknownFields = _root_.scalapb.UnknownFieldSet.empty)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => {
          val __t = status.javaValueDescriptor
          if (__t.getNumber() != 0) __t else null
        }
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PEnum(status.scalaValueDescriptor)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = io.grpc.health.v1.health.HealthCheckResponse
}

object HealthCheckResponse extends scalapb.GeneratedMessageCompanion[io.grpc.health.v1.health.HealthCheckResponse] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[io.grpc.health.v1.health.HealthCheckResponse] = this
  def merge(`_message__`: io.grpc.health.v1.health.HealthCheckResponse, `_input__`: _root_.com.google.protobuf.CodedInputStream): io.grpc.health.v1.health.HealthCheckResponse = {
    var __status = `_message__`.status
    var `_unknownFields__`: _root_.scalapb.UnknownFieldSet.Builder = null
    var _done__ = false
    while (!_done__) {
      val _tag__ = _input__.readTag()
      _tag__ match {
        case 0 => _done__ = true
        case 8 =>
          __status = io.grpc.health.v1.health.HealthCheckResponse.ServingStatus.fromValue(_input__.readEnum())
        case tag =>
          if (_unknownFields__ == null) {
            _unknownFields__ = new _root_.scalapb.UnknownFieldSet.Builder(_message__.unknownFields)
          }
          _unknownFields__.parseField(tag, _input__)
      }
    }
    io.grpc.health.v1.health.HealthCheckResponse(
        status = __status,
        unknownFields = if (_unknownFields__ == null) _message__.unknownFields else _unknownFields__.result()
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[io.grpc.health.v1.health.HealthCheckResponse] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      io.grpc.health.v1.health.HealthCheckResponse(
        status = io.grpc.health.v1.health.HealthCheckResponse.ServingStatus.fromValue(__fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scalapb.descriptors.EnumValueDescriptor]).getOrElse(io.grpc.health.v1.health.HealthCheckResponse.ServingStatus.UNKNOWN.scalaValueDescriptor).number)
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = HealthProto.javaDescriptor.getMessageTypes.get(1)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = HealthProto.scalaDescriptor.messages(1)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__number)
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = {
    (__fieldNumber: @_root_.scala.unchecked) match {
      case 1 => io.grpc.health.v1.health.HealthCheckResponse.ServingStatus
    }
  }
  lazy val defaultInstance = io.grpc.health.v1.health.HealthCheckResponse(
    status = io.grpc.health.v1.health.HealthCheckResponse.ServingStatus.UNKNOWN
  )
  sealed abstract class ServingStatus(val value: _root_.scala.Int) extends _root_.scalapb.GeneratedEnum {
    type EnumType = ServingStatus
    def isUnknown: _root_.scala.Boolean = false
    def isServing: _root_.scala.Boolean = false
    def isNotServing: _root_.scala.Boolean = false
    def isServiceUnknown: _root_.scala.Boolean = false
    def companion: _root_.scalapb.GeneratedEnumCompanion[ServingStatus] = io.grpc.health.v1.health.HealthCheckResponse.ServingStatus
    final def asRecognized: _root_.scala.Option[io.grpc.health.v1.health.HealthCheckResponse.ServingStatus.Recognized] = if (isUnrecognized) _root_.scala.None else _root_.scala.Some(this.asInstanceOf[io.grpc.health.v1.health.HealthCheckResponse.ServingStatus.Recognized])
  }
  
  object ServingStatus extends _root_.scalapb.GeneratedEnumCompanion[ServingStatus] {
    sealed trait Recognized extends ServingStatus
    implicit def enumCompanion: _root_.scalapb.GeneratedEnumCompanion[ServingStatus] = this
    @SerialVersionUID(0L)
    case object UNKNOWN extends ServingStatus(0) with ServingStatus.Recognized {
      val index = 0
      val name = "UNKNOWN"
      override def isUnknown: _root_.scala.Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object SERVING extends ServingStatus(1) with ServingStatus.Recognized {
      val index = 1
      val name = "SERVING"
      override def isServing: _root_.scala.Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object NOT_SERVING extends ServingStatus(2) with ServingStatus.Recognized {
      val index = 2
      val name = "NOT_SERVING"
      override def isNotServing: _root_.scala.Boolean = true
    }
    
    /** Used only by the Watch method.
      */
    @SerialVersionUID(0L)
    case object SERVICE_UNKNOWN extends ServingStatus(3) with ServingStatus.Recognized {
      val index = 3
      val name = "SERVICE_UNKNOWN"
      override def isServiceUnknown: _root_.scala.Boolean = true
    }
    
    @SerialVersionUID(0L)
    final case class Unrecognized(unrecognizedValue: _root_.scala.Int) extends ServingStatus(unrecognizedValue) with _root_.scalapb.UnrecognizedEnum
    
    lazy val values = scala.collection.immutable.Seq(UNKNOWN, SERVING, NOT_SERVING, SERVICE_UNKNOWN)
    def fromValue(__value: _root_.scala.Int): ServingStatus = __value match {
      case 0 => UNKNOWN
      case 1 => SERVING
      case 2 => NOT_SERVING
      case 3 => SERVICE_UNKNOWN
      case __other => Unrecognized(__other)
    }
    def javaDescriptor: _root_.com.google.protobuf.Descriptors.EnumDescriptor = io.grpc.health.v1.health.HealthCheckResponse.javaDescriptor.getEnumTypes.get(0)
    def scalaDescriptor: _root_.scalapb.descriptors.EnumDescriptor = io.grpc.health.v1.health.HealthCheckResponse.scalaDescriptor.enums(0)
  }
  implicit class HealthCheckResponseLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, io.grpc.health.v1.health.HealthCheckResponse]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, io.grpc.health.v1.health.HealthCheckResponse](_l) {
    def status: _root_.scalapb.lenses.Lens[UpperPB, io.grpc.health.v1.health.HealthCheckResponse.ServingStatus] = field(_.status)((c_, f_) => c_.copy(status = f_))
  }
  final val STATUS_FIELD_NUMBER = 1
  def of(
    status: io.grpc.health.v1.health.HealthCheckResponse.ServingStatus
  ): _root_.io.grpc.health.v1.health.HealthCheckResponse = _root_.io.grpc.health.v1.health.HealthCheckResponse(
    status
  )
  // @@protoc_insertion_point(GeneratedMessageCompanion[grpc.health.v1.HealthCheckResponse])
}
