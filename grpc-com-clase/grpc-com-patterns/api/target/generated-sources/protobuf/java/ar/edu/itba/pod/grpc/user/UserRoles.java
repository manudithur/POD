// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: User/user_service.proto

package ar.edu.itba.pod.grpc.user;

/**
 * Protobuf type {@code users.UserRoles}
 */
public final class UserRoles extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:users.UserRoles)
    UserRolesOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UserRoles.newBuilder() to construct.
  private UserRoles(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UserRoles() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UserRoles();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ar.edu.itba.pod.grpc.user.UserServiceOuterClass.internal_static_users_UserRoles_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 1:
        return internalGetRolesBySite();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ar.edu.itba.pod.grpc.user.UserServiceOuterClass.internal_static_users_UserRoles_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ar.edu.itba.pod.grpc.user.UserRoles.class, ar.edu.itba.pod.grpc.user.UserRoles.Builder.class);
  }

  public static final int ROLES_BY_SITE_FIELD_NUMBER = 1;
  private static final class RolesBySiteDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, java.lang.Integer> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, java.lang.Integer>newDefaultInstance(
                ar.edu.itba.pod.grpc.user.UserServiceOuterClass.internal_static_users_UserRoles_RolesBySiteEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.ENUM,
                ar.edu.itba.pod.grpc.user.Role.UNSPECIFIED.getNumber());
  }
  private com.google.protobuf.MapField<
      java.lang.String, java.lang.Integer> rolesBySite_;
  private com.google.protobuf.MapField<java.lang.String, java.lang.Integer>
  internalGetRolesBySite() {
    if (rolesBySite_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          RolesBySiteDefaultEntryHolder.defaultEntry);
    }
    return rolesBySite_;
  }
  private static final
  com.google.protobuf.Internal.MapAdapter.Converter<
      java.lang.Integer, ar.edu.itba.pod.grpc.user.Role> rolesBySiteValueConverter =
          com.google.protobuf.Internal.MapAdapter.newEnumConverter(
              ar.edu.itba.pod.grpc.user.Role.internalGetValueMap(),
              ar.edu.itba.pod.grpc.user.Role.UNRECOGNIZED);
  private static final java.util.Map<java.lang.String, ar.edu.itba.pod.grpc.user.Role>
  internalGetAdaptedRolesBySiteMap(
      java.util.Map<java.lang.String, java.lang.Integer> map) {
    return new com.google.protobuf.Internal.MapAdapter<
        java.lang.String, ar.edu.itba.pod.grpc.user.Role, java.lang.Integer>(
            map, rolesBySiteValueConverter);
  }

  public int getRolesBySiteCount() {
    return internalGetRolesBySite().getMap().size();
  }
  /**
   * <code>map&lt;string, .users.Role&gt; roles_by_site = 1;</code>
   */

  @java.lang.Override
  public boolean containsRolesBySite(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    return internalGetRolesBySite().getMap().containsKey(key);
  }
  /**
   * Use {@link #getRolesBySiteMap()} instead.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, ar.edu.itba.pod.grpc.user.Role>
  getRolesBySite() {
    return getRolesBySiteMap();
  }
  /**
   * <code>map&lt;string, .users.Role&gt; roles_by_site = 1;</code>
   */
  @java.lang.Override

  public java.util.Map<java.lang.String, ar.edu.itba.pod.grpc.user.Role>
  getRolesBySiteMap() {
    return internalGetAdaptedRolesBySiteMap(
        internalGetRolesBySite().getMap());}
  /**
   * <code>map&lt;string, .users.Role&gt; roles_by_site = 1;</code>
   */
  @java.lang.Override

  public /* nullable */
ar.edu.itba.pod.grpc.user.Role getRolesBySiteOrDefault(
      java.lang.String key,
      /* nullable */
ar.edu.itba.pod.grpc.user.Role defaultValue) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, java.lang.Integer> map =
        internalGetRolesBySite().getMap();
    return map.containsKey(key)
           ? rolesBySiteValueConverter.doForward(map.get(key))
           : defaultValue;
  }
  /**
   * <code>map&lt;string, .users.Role&gt; roles_by_site = 1;</code>
   */
  @java.lang.Override

  public ar.edu.itba.pod.grpc.user.Role getRolesBySiteOrThrow(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, java.lang.Integer> map =
        internalGetRolesBySite().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return rolesBySiteValueConverter.doForward(map.get(key));
  }
  /**
   * Use {@link #getRolesBySiteValueMap()} instead.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, java.lang.Integer>
  getRolesBySiteValue() {
    return getRolesBySiteValueMap();
  }
  /**
   * <code>map&lt;string, .users.Role&gt; roles_by_site = 1;</code>
   */
  @java.lang.Override

  public java.util.Map<java.lang.String, java.lang.Integer>
  getRolesBySiteValueMap() {
    return internalGetRolesBySite().getMap();
  }
  /**
   * <code>map&lt;string, .users.Role&gt; roles_by_site = 1;</code>
   */
  @java.lang.Override

  public int getRolesBySiteValueOrDefault(
      java.lang.String key,
      int defaultValue) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, java.lang.Integer> map =
        internalGetRolesBySite().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <code>map&lt;string, .users.Role&gt; roles_by_site = 1;</code>
   */
  @java.lang.Override

  public int getRolesBySiteValueOrThrow(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, java.lang.Integer> map =
        internalGetRolesBySite().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
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
    com.google.protobuf.GeneratedMessageV3
      .serializeStringMapTo(
        output,
        internalGetRolesBySite(),
        RolesBySiteDefaultEntryHolder.defaultEntry,
        1);
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (java.util.Map.Entry<java.lang.String, java.lang.Integer> entry
         : internalGetRolesBySite().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, java.lang.Integer>
      rolesBySite__ = RolesBySiteDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, rolesBySite__);
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
    if (!(obj instanceof ar.edu.itba.pod.grpc.user.UserRoles)) {
      return super.equals(obj);
    }
    ar.edu.itba.pod.grpc.user.UserRoles other = (ar.edu.itba.pod.grpc.user.UserRoles) obj;

    if (!internalGetRolesBySite().equals(
        other.internalGetRolesBySite())) return false;
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
    if (!internalGetRolesBySite().getMap().isEmpty()) {
      hash = (37 * hash) + ROLES_BY_SITE_FIELD_NUMBER;
      hash = (53 * hash) + internalGetRolesBySite().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ar.edu.itba.pod.grpc.user.UserRoles parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ar.edu.itba.pod.grpc.user.UserRoles parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ar.edu.itba.pod.grpc.user.UserRoles parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ar.edu.itba.pod.grpc.user.UserRoles parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ar.edu.itba.pod.grpc.user.UserRoles parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ar.edu.itba.pod.grpc.user.UserRoles parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ar.edu.itba.pod.grpc.user.UserRoles parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ar.edu.itba.pod.grpc.user.UserRoles parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ar.edu.itba.pod.grpc.user.UserRoles parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ar.edu.itba.pod.grpc.user.UserRoles parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ar.edu.itba.pod.grpc.user.UserRoles parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ar.edu.itba.pod.grpc.user.UserRoles parseFrom(
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
  public static Builder newBuilder(ar.edu.itba.pod.grpc.user.UserRoles prototype) {
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
   * Protobuf type {@code users.UserRoles}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:users.UserRoles)
      ar.edu.itba.pod.grpc.user.UserRolesOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ar.edu.itba.pod.grpc.user.UserServiceOuterClass.internal_static_users_UserRoles_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 1:
          return internalGetRolesBySite();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(
        int number) {
      switch (number) {
        case 1:
          return internalGetMutableRolesBySite();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ar.edu.itba.pod.grpc.user.UserServiceOuterClass.internal_static_users_UserRoles_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ar.edu.itba.pod.grpc.user.UserRoles.class, ar.edu.itba.pod.grpc.user.UserRoles.Builder.class);
    }

    // Construct using ar.edu.itba.pod.grpc.user.UserRoles.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      internalGetMutableRolesBySite().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ar.edu.itba.pod.grpc.user.UserServiceOuterClass.internal_static_users_UserRoles_descriptor;
    }

    @java.lang.Override
    public ar.edu.itba.pod.grpc.user.UserRoles getDefaultInstanceForType() {
      return ar.edu.itba.pod.grpc.user.UserRoles.getDefaultInstance();
    }

    @java.lang.Override
    public ar.edu.itba.pod.grpc.user.UserRoles build() {
      ar.edu.itba.pod.grpc.user.UserRoles result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ar.edu.itba.pod.grpc.user.UserRoles buildPartial() {
      ar.edu.itba.pod.grpc.user.UserRoles result = new ar.edu.itba.pod.grpc.user.UserRoles(this);
      int from_bitField0_ = bitField0_;
      result.rolesBySite_ = internalGetRolesBySite();
      result.rolesBySite_.makeImmutable();
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
      if (other instanceof ar.edu.itba.pod.grpc.user.UserRoles) {
        return mergeFrom((ar.edu.itba.pod.grpc.user.UserRoles)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ar.edu.itba.pod.grpc.user.UserRoles other) {
      if (other == ar.edu.itba.pod.grpc.user.UserRoles.getDefaultInstance()) return this;
      internalGetMutableRolesBySite().mergeFrom(
          other.internalGetRolesBySite());
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
              com.google.protobuf.MapEntry<java.lang.String, java.lang.Integer>
              rolesBySite__ = input.readMessage(
                  RolesBySiteDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              internalGetMutableRolesBySite().getMutableMap().put(
                  rolesBySite__.getKey(), rolesBySite__.getValue());
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

    private com.google.protobuf.MapField<
        java.lang.String, java.lang.Integer> rolesBySite_;
    private com.google.protobuf.MapField<java.lang.String, java.lang.Integer>
    internalGetRolesBySite() {
      if (rolesBySite_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            RolesBySiteDefaultEntryHolder.defaultEntry);
      }
      return rolesBySite_;
    }
    private com.google.protobuf.MapField<java.lang.String, java.lang.Integer>
    internalGetMutableRolesBySite() {
      onChanged();;
      if (rolesBySite_ == null) {
        rolesBySite_ = com.google.protobuf.MapField.newMapField(
            RolesBySiteDefaultEntryHolder.defaultEntry);
      }
      if (!rolesBySite_.isMutable()) {
        rolesBySite_ = rolesBySite_.copy();
      }
      return rolesBySite_;
    }

    public int getRolesBySiteCount() {
      return internalGetRolesBySite().getMap().size();
    }
    /**
     * <code>map&lt;string, .users.Role&gt; roles_by_site = 1;</code>
     */

    @java.lang.Override
    public boolean containsRolesBySite(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      return internalGetRolesBySite().getMap().containsKey(key);
    }
    /**
     * Use {@link #getRolesBySiteMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, ar.edu.itba.pod.grpc.user.Role>
    getRolesBySite() {
      return getRolesBySiteMap();
    }
    /**
     * <code>map&lt;string, .users.Role&gt; roles_by_site = 1;</code>
     */
    @java.lang.Override

    public java.util.Map<java.lang.String, ar.edu.itba.pod.grpc.user.Role>
    getRolesBySiteMap() {
      return internalGetAdaptedRolesBySiteMap(
          internalGetRolesBySite().getMap());}
    /**
     * <code>map&lt;string, .users.Role&gt; roles_by_site = 1;</code>
     */
    @java.lang.Override

    public /* nullable */
ar.edu.itba.pod.grpc.user.Role getRolesBySiteOrDefault(
        java.lang.String key,
        /* nullable */
ar.edu.itba.pod.grpc.user.Role defaultValue) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, java.lang.Integer> map =
          internalGetRolesBySite().getMap();
      return map.containsKey(key)
             ? rolesBySiteValueConverter.doForward(map.get(key))
             : defaultValue;
    }
    /**
     * <code>map&lt;string, .users.Role&gt; roles_by_site = 1;</code>
     */
    @java.lang.Override

    public ar.edu.itba.pod.grpc.user.Role getRolesBySiteOrThrow(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, java.lang.Integer> map =
          internalGetRolesBySite().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return rolesBySiteValueConverter.doForward(map.get(key));
    }
    /**
     * Use {@link #getRolesBySiteValueMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.Integer>
    getRolesBySiteValue() {
      return getRolesBySiteValueMap();
    }
    /**
     * <code>map&lt;string, .users.Role&gt; roles_by_site = 1;</code>
     */
    @java.lang.Override

    public java.util.Map<java.lang.String, java.lang.Integer>
    getRolesBySiteValueMap() {
      return internalGetRolesBySite().getMap();
    }
    /**
     * <code>map&lt;string, .users.Role&gt; roles_by_site = 1;</code>
     */
    @java.lang.Override

    public int getRolesBySiteValueOrDefault(
        java.lang.String key,
        int defaultValue) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, java.lang.Integer> map =
          internalGetRolesBySite().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;string, .users.Role&gt; roles_by_site = 1;</code>
     */
    @java.lang.Override

    public int getRolesBySiteValueOrThrow(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, java.lang.Integer> map =
          internalGetRolesBySite().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearRolesBySite() {
      internalGetMutableRolesBySite().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <code>map&lt;string, .users.Role&gt; roles_by_site = 1;</code>
     */

    public Builder removeRolesBySite(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      internalGetMutableRolesBySite().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, ar.edu.itba.pod.grpc.user.Role>
    getMutableRolesBySite() {
      return internalGetAdaptedRolesBySiteMap(
           internalGetMutableRolesBySite().getMutableMap());
    }
    /**
     * <code>map&lt;string, .users.Role&gt; roles_by_site = 1;</code>
     */
    public Builder putRolesBySite(
        java.lang.String key,
        ar.edu.itba.pod.grpc.user.Role value) {
      if (key == null) { throw new NullPointerException("map key"); }
      
      internalGetMutableRolesBySite().getMutableMap()
          .put(key, rolesBySiteValueConverter.doBackward(value));
      return this;
    }
    /**
     * <code>map&lt;string, .users.Role&gt; roles_by_site = 1;</code>
     */
    public Builder putAllRolesBySite(
        java.util.Map<java.lang.String, ar.edu.itba.pod.grpc.user.Role> values) {
      internalGetAdaptedRolesBySiteMap(
          internalGetMutableRolesBySite().getMutableMap())
              .putAll(values);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.Integer>
    getMutableRolesBySiteValue() {
      return internalGetMutableRolesBySite().getMutableMap();
    }
    /**
     * <code>map&lt;string, .users.Role&gt; roles_by_site = 1;</code>
     */
    public Builder putRolesBySiteValue(
        java.lang.String key,
        int value) {
      if (key == null) { throw new NullPointerException("map key"); }
      
      internalGetMutableRolesBySite().getMutableMap()
          .put(key, value);
      return this;
    }
    /**
     * <code>map&lt;string, .users.Role&gt; roles_by_site = 1;</code>
     */
    public Builder putAllRolesBySiteValue(
        java.util.Map<java.lang.String, java.lang.Integer> values) {
      internalGetMutableRolesBySite().getMutableMap()
          .putAll(values);
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


    // @@protoc_insertion_point(builder_scope:users.UserRoles)
  }

  // @@protoc_insertion_point(class_scope:users.UserRoles)
  private static final ar.edu.itba.pod.grpc.user.UserRoles DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ar.edu.itba.pod.grpc.user.UserRoles();
  }

  public static ar.edu.itba.pod.grpc.user.UserRoles getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UserRoles>
      PARSER = new com.google.protobuf.AbstractParser<UserRoles>() {
    @java.lang.Override
    public UserRoles parsePartialFrom(
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

  public static com.google.protobuf.Parser<UserRoles> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UserRoles> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ar.edu.itba.pod.grpc.user.UserRoles getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
