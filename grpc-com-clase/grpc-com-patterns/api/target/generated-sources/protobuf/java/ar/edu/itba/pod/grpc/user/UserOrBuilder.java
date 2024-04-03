// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: User/user_service.proto

package ar.edu.itba.pod.grpc.user;

public interface UserOrBuilder extends
    // @@protoc_insertion_point(interface_extends:users.User)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 id = 1;</code>
   * @return The id.
   */
  int getId();

  /**
   * <code>string user_name = 2;</code>
   * @return The userName.
   */
  java.lang.String getUserName();
  /**
   * <code>string user_name = 2;</code>
   * @return The bytes for userName.
   */
  com.google.protobuf.ByteString
      getUserNameBytes();

  /**
   * <code>string display_name = 3;</code>
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   * <code>string display_name = 3;</code>
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString
      getDisplayNameBytes();

  /**
   * <code>.users.AccountStatus status = 4;</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <code>.users.AccountStatus status = 4;</code>
   * @return The status.
   */
  ar.edu.itba.pod.grpc.user.AccountStatus getStatus();

  /**
   * <code>repeated string preferences = 5;</code>
   * @return A list containing the preferences.
   */
  java.util.List<java.lang.String>
      getPreferencesList();
  /**
   * <code>repeated string preferences = 5;</code>
   * @return The count of preferences.
   */
  int getPreferencesCount();
  /**
   * <code>repeated string preferences = 5;</code>
   * @param index The index of the element to return.
   * @return The preferences at the given index.
   */
  java.lang.String getPreferences(int index);
  /**
   * <code>repeated string preferences = 5;</code>
   * @param index The index of the value to return.
   * @return The bytes of the preferences at the given index.
   */
  com.google.protobuf.ByteString
      getPreferencesBytes(int index);
}
