// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: trainTicketService.proto

package ar.edu.itba.pod.grpc.trainTickets;

/**
 * Protobuf type {@code trainTicketService.Train}
 */
public final class Train extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:trainTicketService.Train)
    TrainOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Train.newBuilder() to construct.
  private Train(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Train() {
    id_ = "";
    destination_ = "";
    time_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Train();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ar.edu.itba.pod.grpc.trainTickets.TrainTicketServiceModel.internal_static_trainTicketService_Train_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ar.edu.itba.pod.grpc.trainTickets.TrainTicketServiceModel.internal_static_trainTicketService_Train_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ar.edu.itba.pod.grpc.trainTickets.Train.class, ar.edu.itba.pod.grpc.trainTickets.Train.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object id_;
  /**
   * <code>string id = 1;</code>
   * @return The id.
   */
  @java.lang.Override
  public java.lang.String getId() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      id_ = s;
      return s;
    }
  }
  /**
   * <code>string id = 1;</code>
   * @return The bytes for id.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getIdBytes() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      id_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DESTINATION_FIELD_NUMBER = 2;
  private volatile java.lang.Object destination_;
  /**
   * <code>string destination = 2;</code>
   * @return The destination.
   */
  @java.lang.Override
  public java.lang.String getDestination() {
    java.lang.Object ref = destination_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      destination_ = s;
      return s;
    }
  }
  /**
   * <code>string destination = 2;</code>
   * @return The bytes for destination.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDestinationBytes() {
    java.lang.Object ref = destination_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      destination_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TIME_FIELD_NUMBER = 3;
  private volatile java.lang.Object time_;
  /**
   * <code>string time = 3;</code>
   * @return The time.
   */
  @java.lang.Override
  public java.lang.String getTime() {
    java.lang.Object ref = time_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      time_ = s;
      return s;
    }
  }
  /**
   * <code>string time = 3;</code>
   * @return The bytes for time.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTimeBytes() {
    java.lang.Object ref = time_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      time_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int AVAILABLECOUNT_FIELD_NUMBER = 4;
  private int availableCount_;
  /**
   * <code>int32 availableCount = 4;</code>
   * @return The availableCount.
   */
  @java.lang.Override
  public int getAvailableCount() {
    return availableCount_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(id_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, id_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(destination_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, destination_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(time_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, time_);
    }
    if (availableCount_ != 0) {
      output.writeInt32(4, availableCount_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(id_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, id_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(destination_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, destination_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(time_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, time_);
    }
    if (availableCount_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, availableCount_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof ar.edu.itba.pod.grpc.trainTickets.Train)) {
      return super.equals(obj);
    }
    ar.edu.itba.pod.grpc.trainTickets.Train other = (ar.edu.itba.pod.grpc.trainTickets.Train) obj;

    if (!getId()
        .equals(other.getId())) return false;
    if (!getDestination()
        .equals(other.getDestination())) return false;
    if (!getTime()
        .equals(other.getTime())) return false;
    if (getAvailableCount()
        != other.getAvailableCount()) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getId().hashCode();
    hash = (37 * hash) + DESTINATION_FIELD_NUMBER;
    hash = (53 * hash) + getDestination().hashCode();
    hash = (37 * hash) + TIME_FIELD_NUMBER;
    hash = (53 * hash) + getTime().hashCode();
    hash = (37 * hash) + AVAILABLECOUNT_FIELD_NUMBER;
    hash = (53 * hash) + getAvailableCount();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ar.edu.itba.pod.grpc.trainTickets.Train parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ar.edu.itba.pod.grpc.trainTickets.Train parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ar.edu.itba.pod.grpc.trainTickets.Train parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ar.edu.itba.pod.grpc.trainTickets.Train parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ar.edu.itba.pod.grpc.trainTickets.Train parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ar.edu.itba.pod.grpc.trainTickets.Train parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ar.edu.itba.pod.grpc.trainTickets.Train parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ar.edu.itba.pod.grpc.trainTickets.Train parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ar.edu.itba.pod.grpc.trainTickets.Train parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ar.edu.itba.pod.grpc.trainTickets.Train parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ar.edu.itba.pod.grpc.trainTickets.Train parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ar.edu.itba.pod.grpc.trainTickets.Train parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(ar.edu.itba.pod.grpc.trainTickets.Train prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code trainTicketService.Train}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:trainTicketService.Train)
      ar.edu.itba.pod.grpc.trainTickets.TrainOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ar.edu.itba.pod.grpc.trainTickets.TrainTicketServiceModel.internal_static_trainTicketService_Train_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ar.edu.itba.pod.grpc.trainTickets.TrainTicketServiceModel.internal_static_trainTicketService_Train_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ar.edu.itba.pod.grpc.trainTickets.Train.class, ar.edu.itba.pod.grpc.trainTickets.Train.Builder.class);
    }

    // Construct using ar.edu.itba.pod.grpc.trainTickets.Train.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      id_ = "";

      destination_ = "";

      time_ = "";

      availableCount_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ar.edu.itba.pod.grpc.trainTickets.TrainTicketServiceModel.internal_static_trainTicketService_Train_descriptor;
    }

    @java.lang.Override
    public ar.edu.itba.pod.grpc.trainTickets.Train getDefaultInstanceForType() {
      return ar.edu.itba.pod.grpc.trainTickets.Train.getDefaultInstance();
    }

    @java.lang.Override
    public ar.edu.itba.pod.grpc.trainTickets.Train build() {
      ar.edu.itba.pod.grpc.trainTickets.Train result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ar.edu.itba.pod.grpc.trainTickets.Train buildPartial() {
      ar.edu.itba.pod.grpc.trainTickets.Train result = new ar.edu.itba.pod.grpc.trainTickets.Train(this);
      result.id_ = id_;
      result.destination_ = destination_;
      result.time_ = time_;
      result.availableCount_ = availableCount_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof ar.edu.itba.pod.grpc.trainTickets.Train) {
        return mergeFrom((ar.edu.itba.pod.grpc.trainTickets.Train)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ar.edu.itba.pod.grpc.trainTickets.Train other) {
      if (other == ar.edu.itba.pod.grpc.trainTickets.Train.getDefaultInstance()) return this;
      if (!other.getId().isEmpty()) {
        id_ = other.id_;
        onChanged();
      }
      if (!other.getDestination().isEmpty()) {
        destination_ = other.destination_;
        onChanged();
      }
      if (!other.getTime().isEmpty()) {
        time_ = other.time_;
        onChanged();
      }
      if (other.getAvailableCount() != 0) {
        setAvailableCount(other.getAvailableCount());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              id_ = input.readStringRequireUtf8();

              break;
            } // case 10
            case 18: {
              destination_ = input.readStringRequireUtf8();

              break;
            } // case 18
            case 26: {
              time_ = input.readStringRequireUtf8();

              break;
            } // case 26
            case 32: {
              availableCount_ = input.readInt32();

              break;
            } // case 32
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private java.lang.Object id_ = "";
    /**
     * <code>string id = 1;</code>
     * @return The id.
     */
    public java.lang.String getId() {
      java.lang.Object ref = id_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        id_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string id = 1;</code>
     * @return The bytes for id.
     */
    public com.google.protobuf.ByteString
        getIdBytes() {
      java.lang.Object ref = id_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        id_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string id = 1;</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      
      id_ = getDefaultInstance().getId();
      onChanged();
      return this;
    }
    /**
     * <code>string id = 1;</code>
     * @param value The bytes for id to set.
     * @return This builder for chaining.
     */
    public Builder setIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      id_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object destination_ = "";
    /**
     * <code>string destination = 2;</code>
     * @return The destination.
     */
    public java.lang.String getDestination() {
      java.lang.Object ref = destination_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        destination_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string destination = 2;</code>
     * @return The bytes for destination.
     */
    public com.google.protobuf.ByteString
        getDestinationBytes() {
      java.lang.Object ref = destination_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        destination_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string destination = 2;</code>
     * @param value The destination to set.
     * @return This builder for chaining.
     */
    public Builder setDestination(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      destination_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string destination = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearDestination() {
      
      destination_ = getDefaultInstance().getDestination();
      onChanged();
      return this;
    }
    /**
     * <code>string destination = 2;</code>
     * @param value The bytes for destination to set.
     * @return This builder for chaining.
     */
    public Builder setDestinationBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      destination_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object time_ = "";
    /**
     * <code>string time = 3;</code>
     * @return The time.
     */
    public java.lang.String getTime() {
      java.lang.Object ref = time_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        time_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string time = 3;</code>
     * @return The bytes for time.
     */
    public com.google.protobuf.ByteString
        getTimeBytes() {
      java.lang.Object ref = time_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        time_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string time = 3;</code>
     * @param value The time to set.
     * @return This builder for chaining.
     */
    public Builder setTime(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      time_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string time = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearTime() {
      
      time_ = getDefaultInstance().getTime();
      onChanged();
      return this;
    }
    /**
     * <code>string time = 3;</code>
     * @param value The bytes for time to set.
     * @return This builder for chaining.
     */
    public Builder setTimeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      time_ = value;
      onChanged();
      return this;
    }

    private int availableCount_ ;
    /**
     * <code>int32 availableCount = 4;</code>
     * @return The availableCount.
     */
    @java.lang.Override
    public int getAvailableCount() {
      return availableCount_;
    }
    /**
     * <code>int32 availableCount = 4;</code>
     * @param value The availableCount to set.
     * @return This builder for chaining.
     */
    public Builder setAvailableCount(int value) {
      
      availableCount_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 availableCount = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearAvailableCount() {
      
      availableCount_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:trainTicketService.Train)
  }

  // @@protoc_insertion_point(class_scope:trainTicketService.Train)
  private static final ar.edu.itba.pod.grpc.trainTickets.Train DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ar.edu.itba.pod.grpc.trainTickets.Train();
  }

  public static ar.edu.itba.pod.grpc.trainTickets.Train getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Train>
      PARSER = new com.google.protobuf.AbstractParser<Train>() {
    @java.lang.Override
    public Train parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<Train> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Train> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ar.edu.itba.pod.grpc.trainTickets.Train getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

