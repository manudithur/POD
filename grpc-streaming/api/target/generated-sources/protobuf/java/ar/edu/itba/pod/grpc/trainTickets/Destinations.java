// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: trainTicketService.proto

package ar.edu.itba.pod.grpc.trainTickets;

/**
 * Protobuf type {@code trainTicketService.Destinations}
 */
public final class Destinations extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:trainTicketService.Destinations)
    DestinationsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Destinations.newBuilder() to construct.
  private Destinations(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Destinations() {
    destinations_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Destinations();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ar.edu.itba.pod.grpc.trainTickets.TrainTicketServiceModel.internal_static_trainTicketService_Destinations_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ar.edu.itba.pod.grpc.trainTickets.TrainTicketServiceModel.internal_static_trainTicketService_Destinations_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ar.edu.itba.pod.grpc.trainTickets.Destinations.class, ar.edu.itba.pod.grpc.trainTickets.Destinations.Builder.class);
  }

  public static final int DESTINATIONS_FIELD_NUMBER = 1;
  private com.google.protobuf.LazyStringList destinations_;
  /**
   * <code>repeated string destinations = 1;</code>
   * @return A list containing the destinations.
   */
  public com.google.protobuf.ProtocolStringList
      getDestinationsList() {
    return destinations_;
  }
  /**
   * <code>repeated string destinations = 1;</code>
   * @return The count of destinations.
   */
  public int getDestinationsCount() {
    return destinations_.size();
  }
  /**
   * <code>repeated string destinations = 1;</code>
   * @param index The index of the element to return.
   * @return The destinations at the given index.
   */
  public java.lang.String getDestinations(int index) {
    return destinations_.get(index);
  }
  /**
   * <code>repeated string destinations = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the destinations at the given index.
   */
  public com.google.protobuf.ByteString
      getDestinationsBytes(int index) {
    return destinations_.getByteString(index);
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
    for (int i = 0; i < destinations_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, destinations_.getRaw(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < destinations_.size(); i++) {
        dataSize += computeStringSizeNoTag(destinations_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getDestinationsList().size();
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
    if (!(obj instanceof ar.edu.itba.pod.grpc.trainTickets.Destinations)) {
      return super.equals(obj);
    }
    ar.edu.itba.pod.grpc.trainTickets.Destinations other = (ar.edu.itba.pod.grpc.trainTickets.Destinations) obj;

    if (!getDestinationsList()
        .equals(other.getDestinationsList())) return false;
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
    if (getDestinationsCount() > 0) {
      hash = (37 * hash) + DESTINATIONS_FIELD_NUMBER;
      hash = (53 * hash) + getDestinationsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ar.edu.itba.pod.grpc.trainTickets.Destinations parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ar.edu.itba.pod.grpc.trainTickets.Destinations parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ar.edu.itba.pod.grpc.trainTickets.Destinations parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ar.edu.itba.pod.grpc.trainTickets.Destinations parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ar.edu.itba.pod.grpc.trainTickets.Destinations parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ar.edu.itba.pod.grpc.trainTickets.Destinations parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ar.edu.itba.pod.grpc.trainTickets.Destinations parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ar.edu.itba.pod.grpc.trainTickets.Destinations parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ar.edu.itba.pod.grpc.trainTickets.Destinations parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ar.edu.itba.pod.grpc.trainTickets.Destinations parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ar.edu.itba.pod.grpc.trainTickets.Destinations parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ar.edu.itba.pod.grpc.trainTickets.Destinations parseFrom(
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
  public static Builder newBuilder(ar.edu.itba.pod.grpc.trainTickets.Destinations prototype) {
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
   * Protobuf type {@code trainTicketService.Destinations}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:trainTicketService.Destinations)
      ar.edu.itba.pod.grpc.trainTickets.DestinationsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ar.edu.itba.pod.grpc.trainTickets.TrainTicketServiceModel.internal_static_trainTicketService_Destinations_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ar.edu.itba.pod.grpc.trainTickets.TrainTicketServiceModel.internal_static_trainTicketService_Destinations_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ar.edu.itba.pod.grpc.trainTickets.Destinations.class, ar.edu.itba.pod.grpc.trainTickets.Destinations.Builder.class);
    }

    // Construct using ar.edu.itba.pod.grpc.trainTickets.Destinations.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      destinations_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ar.edu.itba.pod.grpc.trainTickets.TrainTicketServiceModel.internal_static_trainTicketService_Destinations_descriptor;
    }

    @java.lang.Override
    public ar.edu.itba.pod.grpc.trainTickets.Destinations getDefaultInstanceForType() {
      return ar.edu.itba.pod.grpc.trainTickets.Destinations.getDefaultInstance();
    }

    @java.lang.Override
    public ar.edu.itba.pod.grpc.trainTickets.Destinations build() {
      ar.edu.itba.pod.grpc.trainTickets.Destinations result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ar.edu.itba.pod.grpc.trainTickets.Destinations buildPartial() {
      ar.edu.itba.pod.grpc.trainTickets.Destinations result = new ar.edu.itba.pod.grpc.trainTickets.Destinations(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        destinations_ = destinations_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.destinations_ = destinations_;
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
      if (other instanceof ar.edu.itba.pod.grpc.trainTickets.Destinations) {
        return mergeFrom((ar.edu.itba.pod.grpc.trainTickets.Destinations)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ar.edu.itba.pod.grpc.trainTickets.Destinations other) {
      if (other == ar.edu.itba.pod.grpc.trainTickets.Destinations.getDefaultInstance()) return this;
      if (!other.destinations_.isEmpty()) {
        if (destinations_.isEmpty()) {
          destinations_ = other.destinations_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureDestinationsIsMutable();
          destinations_.addAll(other.destinations_);
        }
        onChanged();
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
              java.lang.String s = input.readStringRequireUtf8();
              ensureDestinationsIsMutable();
              destinations_.add(s);
              break;
            } // case 10
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
    private int bitField0_;

    private com.google.protobuf.LazyStringList destinations_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureDestinationsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        destinations_ = new com.google.protobuf.LazyStringArrayList(destinations_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated string destinations = 1;</code>
     * @return A list containing the destinations.
     */
    public com.google.protobuf.ProtocolStringList
        getDestinationsList() {
      return destinations_.getUnmodifiableView();
    }
    /**
     * <code>repeated string destinations = 1;</code>
     * @return The count of destinations.
     */
    public int getDestinationsCount() {
      return destinations_.size();
    }
    /**
     * <code>repeated string destinations = 1;</code>
     * @param index The index of the element to return.
     * @return The destinations at the given index.
     */
    public java.lang.String getDestinations(int index) {
      return destinations_.get(index);
    }
    /**
     * <code>repeated string destinations = 1;</code>
     * @param index The index of the value to return.
     * @return The bytes of the destinations at the given index.
     */
    public com.google.protobuf.ByteString
        getDestinationsBytes(int index) {
      return destinations_.getByteString(index);
    }
    /**
     * <code>repeated string destinations = 1;</code>
     * @param index The index to set the value at.
     * @param value The destinations to set.
     * @return This builder for chaining.
     */
    public Builder setDestinations(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureDestinationsIsMutable();
      destinations_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string destinations = 1;</code>
     * @param value The destinations to add.
     * @return This builder for chaining.
     */
    public Builder addDestinations(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureDestinationsIsMutable();
      destinations_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string destinations = 1;</code>
     * @param values The destinations to add.
     * @return This builder for chaining.
     */
    public Builder addAllDestinations(
        java.lang.Iterable<java.lang.String> values) {
      ensureDestinationsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, destinations_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string destinations = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearDestinations() {
      destinations_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string destinations = 1;</code>
     * @param value The bytes of the destinations to add.
     * @return This builder for chaining.
     */
    public Builder addDestinationsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureDestinationsIsMutable();
      destinations_.add(value);
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


    // @@protoc_insertion_point(builder_scope:trainTicketService.Destinations)
  }

  // @@protoc_insertion_point(class_scope:trainTicketService.Destinations)
  private static final ar.edu.itba.pod.grpc.trainTickets.Destinations DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ar.edu.itba.pod.grpc.trainTickets.Destinations();
  }

  public static ar.edu.itba.pod.grpc.trainTickets.Destinations getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Destinations>
      PARSER = new com.google.protobuf.AbstractParser<Destinations>() {
    @java.lang.Override
    public Destinations parsePartialFrom(
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

  public static com.google.protobuf.Parser<Destinations> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Destinations> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ar.edu.itba.pod.grpc.trainTickets.Destinations getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

