// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: User/user_service.proto

package ar.edu.itba.pod.grpc.user;

/**
 * Protobuf enum {@code users.Role}
 */
public enum Role
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>UNSPECIFIED = 0;</code>
   */
  UNSPECIFIED(0),
  /**
   * <code>ADMIN = 1;</code>
   */
  ADMIN(1),
  /**
   * <code>SELLER = 2;</code>
   */
  SELLER(2),
  /**
   * <code>BUYER = 3;</code>
   */
  BUYER(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>UNSPECIFIED = 0;</code>
   */
  public static final int UNSPECIFIED_VALUE = 0;
  /**
   * <code>ADMIN = 1;</code>
   */
  public static final int ADMIN_VALUE = 1;
  /**
   * <code>SELLER = 2;</code>
   */
  public static final int SELLER_VALUE = 2;
  /**
   * <code>BUYER = 3;</code>
   */
  public static final int BUYER_VALUE = 3;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static Role valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static Role forNumber(int value) {
    switch (value) {
      case 0: return UNSPECIFIED;
      case 1: return ADMIN;
      case 2: return SELLER;
      case 3: return BUYER;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<Role>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      Role> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Role>() {
          public Role findValueByNumber(int number) {
            return Role.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return ar.edu.itba.pod.grpc.user.UserServiceOuterClass.getDescriptor().getEnumTypes().get(1);
  }

  private static final Role[] VALUES = values();

  public static Role valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private Role(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:users.Role)
}
