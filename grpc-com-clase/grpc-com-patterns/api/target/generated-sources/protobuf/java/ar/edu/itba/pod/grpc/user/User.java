// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: User/user_service.proto

package ar.edu.itba.pod.grpc.user;

/**
 * Protobuf type {@code users.User}
 */
public final class User extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:users.User)
    UserOrBuilder {
private static final long serialVersionUID = 0L;
  // Use User.newBuilder() to construct.
  private User(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private User() {
    userName_ = "";
    displayName_ = "";
    status_ = 0;
    preferences_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new User();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ar.edu.itba.pod.grpc.user.UserServiceOuterClass.internal_static_users_User_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ar.edu.itba.pod.grpc.user.UserServiceOuterClass.internal_static_users_User_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ar.edu.itba.pod.grpc.user.User.class, ar.edu.itba.pod.grpc.user.User.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private int id_;
  /**
   * <code>int32 id = 1;</code>
   * @return The id.
   */
  @java.lang.Override
  public int getId() {
    return id_;
  }

  public static final int USER_NAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object userName_;
  /**
   * <code>string user_name = 2;</code>
   * @return The userName.
   */
  @java.lang.Override
  public java.lang.String getUserName() {
    java.lang.Object ref = userName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      userName_ = s;
      return s;
    }
  }
  /**
   * <code>string user_name = 2;</code>
   * @return The bytes for userName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getUserNameBytes() {
    java.lang.Object ref = userName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      userName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DISPLAY_NAME_FIELD_NUMBER = 3;
  private volatile java.lang.Object displayName_;
  /**
   * <code>string display_name = 3;</code>
   * @return The displayName.
   */
  @java.lang.Override
  public java.lang.String getDisplayName() {
    java.lang.Object ref = displayName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      displayName_ = s;
      return s;
    }
  }
  /**
   * <code>string display_name = 3;</code>
   * @return The bytes for displayName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDisplayNameBytes() {
    java.lang.Object ref = displayName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      displayName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int STATUS_FIELD_NUMBER = 4;
  private int status_;
  /**
   * <code>.users.AccountStatus status = 4;</code>
   * @return The enum numeric value on the wire for status.
   */
  @java.lang.Override public int getStatusValue() {
    return status_;
  }
  /**
   * <code>.users.AccountStatus status = 4;</code>
   * @return The status.
   */
  @java.lang.Override public ar.edu.itba.pod.grpc.user.AccountStatus getStatus() {
    @SuppressWarnings("deprecation")
    ar.edu.itba.pod.grpc.user.AccountStatus result = ar.edu.itba.pod.grpc.user.AccountStatus.valueOf(status_);
    return result == null ? ar.edu.itba.pod.grpc.user.AccountStatus.UNRECOGNIZED : result;
  }

  public static final int PREFERENCES_FIELD_NUMBER = 5;
  private com.google.protobuf.LazyStringList preferences_;
  /**
   * <code>repeated string preferences = 5;</code>
   * @return A list containing the preferences.
   */
  public com.google.protobuf.ProtocolStringList
      getPreferencesList() {
    return preferences_;
  }
  /**
   * <code>repeated string preferences = 5;</code>
   * @return The count of preferences.
   */
  public int getPreferencesCount() {
    return preferences_.size();
  }
  /**
   * <code>repeated string preferences = 5;</code>
   * @param index The index of the element to return.
   * @return The preferences at the given index.
   */
  public java.lang.String getPreferences(int index) {
    return preferences_.get(index);
  }
  /**
   * <code>repeated string preferences = 5;</code>
   * @param index The index of the value to return.
   * @return The bytes of the preferences at the given index.
   */
  public com.google.protobuf.ByteString
      getPreferencesBytes(int index) {
    return preferences_.getByteString(index);
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
    if (id_ != 0) {
      output.writeInt32(1, id_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(userName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, userName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(displayName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, displayName_);
    }
    if (status_ != ar.edu.itba.pod.grpc.user.AccountStatus.ACCOUNT_STATUS_UNSPECIFIED.getNumber()) {
      output.writeEnum(4, status_);
    }
    for (int i = 0; i < preferences_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, preferences_.getRaw(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (id_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, id_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(userName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, userName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(displayName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, displayName_);
    }
    if (status_ != ar.edu.itba.pod.grpc.user.AccountStatus.ACCOUNT_STATUS_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(4, status_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < preferences_.size(); i++) {
        dataSize += computeStringSizeNoTag(preferences_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getPreferencesList().size();
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
    if (!(obj instanceof ar.edu.itba.pod.grpc.user.User)) {
      return super.equals(obj);
    }
    ar.edu.itba.pod.grpc.user.User other = (ar.edu.itba.pod.grpc.user.User) obj;

    if (getId()
        != other.getId()) return false;
    if (!getUserName()
        .equals(other.getUserName())) return false;
    if (!getDisplayName()
        .equals(other.getDisplayName())) return false;
    if (status_ != other.status_) return false;
    if (!getPreferencesList()
        .equals(other.getPreferencesList())) return false;
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
    hash = (53 * hash) + getId();
    hash = (37 * hash) + USER_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getUserName().hashCode();
    hash = (37 * hash) + DISPLAY_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getDisplayName().hashCode();
    hash = (37 * hash) + STATUS_FIELD_NUMBER;
    hash = (53 * hash) + status_;
    if (getPreferencesCount() > 0) {
      hash = (37 * hash) + PREFERENCES_FIELD_NUMBER;
      hash = (53 * hash) + getPreferencesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ar.edu.itba.pod.grpc.user.User parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ar.edu.itba.pod.grpc.user.User parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ar.edu.itba.pod.grpc.user.User parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ar.edu.itba.pod.grpc.user.User parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ar.edu.itba.pod.grpc.user.User parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ar.edu.itba.pod.grpc.user.User parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ar.edu.itba.pod.grpc.user.User parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ar.edu.itba.pod.grpc.user.User parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ar.edu.itba.pod.grpc.user.User parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ar.edu.itba.pod.grpc.user.User parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ar.edu.itba.pod.grpc.user.User parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ar.edu.itba.pod.grpc.user.User parseFrom(
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
  public static Builder newBuilder(ar.edu.itba.pod.grpc.user.User prototype) {
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
   * Protobuf type {@code users.User}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:users.User)
      ar.edu.itba.pod.grpc.user.UserOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ar.edu.itba.pod.grpc.user.UserServiceOuterClass.internal_static_users_User_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ar.edu.itba.pod.grpc.user.UserServiceOuterClass.internal_static_users_User_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ar.edu.itba.pod.grpc.user.User.class, ar.edu.itba.pod.grpc.user.User.Builder.class);
    }

    // Construct using ar.edu.itba.pod.grpc.user.User.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      id_ = 0;

      userName_ = "";

      displayName_ = "";

      status_ = 0;

      preferences_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ar.edu.itba.pod.grpc.user.UserServiceOuterClass.internal_static_users_User_descriptor;
    }

    @java.lang.Override
    public ar.edu.itba.pod.grpc.user.User getDefaultInstanceForType() {
      return ar.edu.itba.pod.grpc.user.User.getDefaultInstance();
    }

    @java.lang.Override
    public ar.edu.itba.pod.grpc.user.User build() {
      ar.edu.itba.pod.grpc.user.User result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ar.edu.itba.pod.grpc.user.User buildPartial() {
      ar.edu.itba.pod.grpc.user.User result = new ar.edu.itba.pod.grpc.user.User(this);
      int from_bitField0_ = bitField0_;
      result.id_ = id_;
      result.userName_ = userName_;
      result.displayName_ = displayName_;
      result.status_ = status_;
      if (((bitField0_ & 0x00000001) != 0)) {
        preferences_ = preferences_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.preferences_ = preferences_;
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
      if (other instanceof ar.edu.itba.pod.grpc.user.User) {
        return mergeFrom((ar.edu.itba.pod.grpc.user.User)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ar.edu.itba.pod.grpc.user.User other) {
      if (other == ar.edu.itba.pod.grpc.user.User.getDefaultInstance()) return this;
      if (other.getId() != 0) {
        setId(other.getId());
      }
      if (!other.getUserName().isEmpty()) {
        userName_ = other.userName_;
        onChanged();
      }
      if (!other.getDisplayName().isEmpty()) {
        displayName_ = other.displayName_;
        onChanged();
      }
      if (other.status_ != 0) {
        setStatusValue(other.getStatusValue());
      }
      if (!other.preferences_.isEmpty()) {
        if (preferences_.isEmpty()) {
          preferences_ = other.preferences_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensurePreferencesIsMutable();
          preferences_.addAll(other.preferences_);
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
            case 8: {
              id_ = input.readInt32();

              break;
            } // case 8
            case 18: {
              userName_ = input.readStringRequireUtf8();

              break;
            } // case 18
            case 26: {
              displayName_ = input.readStringRequireUtf8();

              break;
            } // case 26
            case 32: {
              status_ = input.readEnum();

              break;
            } // case 32
            case 42: {
              java.lang.String s = input.readStringRequireUtf8();
              ensurePreferencesIsMutable();
              preferences_.add(s);
              break;
            } // case 42
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

    private int id_ ;
    /**
     * <code>int32 id = 1;</code>
     * @return The id.
     */
    @java.lang.Override
    public int getId() {
      return id_;
    }
    /**
     * <code>int32 id = 1;</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(int value) {
      
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      
      id_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object userName_ = "";
    /**
     * <code>string user_name = 2;</code>
     * @return The userName.
     */
    public java.lang.String getUserName() {
      java.lang.Object ref = userName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        userName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string user_name = 2;</code>
     * @return The bytes for userName.
     */
    public com.google.protobuf.ByteString
        getUserNameBytes() {
      java.lang.Object ref = userName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        userName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string user_name = 2;</code>
     * @param value The userName to set.
     * @return This builder for chaining.
     */
    public Builder setUserName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      userName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string user_name = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearUserName() {
      
      userName_ = getDefaultInstance().getUserName();
      onChanged();
      return this;
    }
    /**
     * <code>string user_name = 2;</code>
     * @param value The bytes for userName to set.
     * @return This builder for chaining.
     */
    public Builder setUserNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      userName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object displayName_ = "";
    /**
     * <code>string display_name = 3;</code>
     * @return The displayName.
     */
    public java.lang.String getDisplayName() {
      java.lang.Object ref = displayName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        displayName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string display_name = 3;</code>
     * @return The bytes for displayName.
     */
    public com.google.protobuf.ByteString
        getDisplayNameBytes() {
      java.lang.Object ref = displayName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        displayName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string display_name = 3;</code>
     * @param value The displayName to set.
     * @return This builder for chaining.
     */
    public Builder setDisplayName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      displayName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string display_name = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearDisplayName() {
      
      displayName_ = getDefaultInstance().getDisplayName();
      onChanged();
      return this;
    }
    /**
     * <code>string display_name = 3;</code>
     * @param value The bytes for displayName to set.
     * @return This builder for chaining.
     */
    public Builder setDisplayNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      displayName_ = value;
      onChanged();
      return this;
    }

    private int status_ = 0;
    /**
     * <code>.users.AccountStatus status = 4;</code>
     * @return The enum numeric value on the wire for status.
     */
    @java.lang.Override public int getStatusValue() {
      return status_;
    }
    /**
     * <code>.users.AccountStatus status = 4;</code>
     * @param value The enum numeric value on the wire for status to set.
     * @return This builder for chaining.
     */
    public Builder setStatusValue(int value) {
      
      status_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.users.AccountStatus status = 4;</code>
     * @return The status.
     */
    @java.lang.Override
    public ar.edu.itba.pod.grpc.user.AccountStatus getStatus() {
      @SuppressWarnings("deprecation")
      ar.edu.itba.pod.grpc.user.AccountStatus result = ar.edu.itba.pod.grpc.user.AccountStatus.valueOf(status_);
      return result == null ? ar.edu.itba.pod.grpc.user.AccountStatus.UNRECOGNIZED : result;
    }
    /**
     * <code>.users.AccountStatus status = 4;</code>
     * @param value The status to set.
     * @return This builder for chaining.
     */
    public Builder setStatus(ar.edu.itba.pod.grpc.user.AccountStatus value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      status_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.users.AccountStatus status = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearStatus() {
      
      status_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList preferences_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensurePreferencesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        preferences_ = new com.google.protobuf.LazyStringArrayList(preferences_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated string preferences = 5;</code>
     * @return A list containing the preferences.
     */
    public com.google.protobuf.ProtocolStringList
        getPreferencesList() {
      return preferences_.getUnmodifiableView();
    }
    /**
     * <code>repeated string preferences = 5;</code>
     * @return The count of preferences.
     */
    public int getPreferencesCount() {
      return preferences_.size();
    }
    /**
     * <code>repeated string preferences = 5;</code>
     * @param index The index of the element to return.
     * @return The preferences at the given index.
     */
    public java.lang.String getPreferences(int index) {
      return preferences_.get(index);
    }
    /**
     * <code>repeated string preferences = 5;</code>
     * @param index The index of the value to return.
     * @return The bytes of the preferences at the given index.
     */
    public com.google.protobuf.ByteString
        getPreferencesBytes(int index) {
      return preferences_.getByteString(index);
    }
    /**
     * <code>repeated string preferences = 5;</code>
     * @param index The index to set the value at.
     * @param value The preferences to set.
     * @return This builder for chaining.
     */
    public Builder setPreferences(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensurePreferencesIsMutable();
      preferences_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string preferences = 5;</code>
     * @param value The preferences to add.
     * @return This builder for chaining.
     */
    public Builder addPreferences(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensurePreferencesIsMutable();
      preferences_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string preferences = 5;</code>
     * @param values The preferences to add.
     * @return This builder for chaining.
     */
    public Builder addAllPreferences(
        java.lang.Iterable<java.lang.String> values) {
      ensurePreferencesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, preferences_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string preferences = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearPreferences() {
      preferences_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string preferences = 5;</code>
     * @param value The bytes of the preferences to add.
     * @return This builder for chaining.
     */
    public Builder addPreferencesBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensurePreferencesIsMutable();
      preferences_.add(value);
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


    // @@protoc_insertion_point(builder_scope:users.User)
  }

  // @@protoc_insertion_point(class_scope:users.User)
  private static final ar.edu.itba.pod.grpc.user.User DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ar.edu.itba.pod.grpc.user.User();
  }

  public static ar.edu.itba.pod.grpc.user.User getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<User>
      PARSER = new com.google.protobuf.AbstractParser<User>() {
    @java.lang.Override
    public User parsePartialFrom(
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

  public static com.google.protobuf.Parser<User> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<User> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ar.edu.itba.pod.grpc.user.User getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
