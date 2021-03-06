// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/api/v2/core/address.proto

package io.grpc.xds.shaded.envoy.api.v2.core;

public interface TcpKeepaliveOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.api.v2.core.TcpKeepalive)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Maximum number of keepalive probes to send without response before deciding
   * the connection is dead. Default is to use the OS level configuration (unless
   * overridden, Linux defaults to 9.)
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value keepalive_probes = 1;</code>
   */
  boolean hasKeepaliveProbes();
  /**
   * <pre>
   * Maximum number of keepalive probes to send without response before deciding
   * the connection is dead. Default is to use the OS level configuration (unless
   * overridden, Linux defaults to 9.)
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value keepalive_probes = 1;</code>
   */
  com.google.protobuf.UInt32Value getKeepaliveProbes();
  /**
   * <pre>
   * Maximum number of keepalive probes to send without response before deciding
   * the connection is dead. Default is to use the OS level configuration (unless
   * overridden, Linux defaults to 9.)
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value keepalive_probes = 1;</code>
   */
  com.google.protobuf.UInt32ValueOrBuilder getKeepaliveProbesOrBuilder();

  /**
   * <pre>
   * The number of seconds a connection needs to be idle before keep-alive probes
   * start being sent. Default is to use the OS level configuration (unless
   * overridden, Linux defaults to 7200s (ie 2 hours.)
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value keepalive_time = 2;</code>
   */
  boolean hasKeepaliveTime();
  /**
   * <pre>
   * The number of seconds a connection needs to be idle before keep-alive probes
   * start being sent. Default is to use the OS level configuration (unless
   * overridden, Linux defaults to 7200s (ie 2 hours.)
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value keepalive_time = 2;</code>
   */
  com.google.protobuf.UInt32Value getKeepaliveTime();
  /**
   * <pre>
   * The number of seconds a connection needs to be idle before keep-alive probes
   * start being sent. Default is to use the OS level configuration (unless
   * overridden, Linux defaults to 7200s (ie 2 hours.)
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value keepalive_time = 2;</code>
   */
  com.google.protobuf.UInt32ValueOrBuilder getKeepaliveTimeOrBuilder();

  /**
   * <pre>
   * The number of seconds between keep-alive probes. Default is to use the OS
   * level configuration (unless overridden, Linux defaults to 75s.)
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value keepalive_interval = 3;</code>
   */
  boolean hasKeepaliveInterval();
  /**
   * <pre>
   * The number of seconds between keep-alive probes. Default is to use the OS
   * level configuration (unless overridden, Linux defaults to 75s.)
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value keepalive_interval = 3;</code>
   */
  com.google.protobuf.UInt32Value getKeepaliveInterval();
  /**
   * <pre>
   * The number of seconds between keep-alive probes. Default is to use the OS
   * level configuration (unless overridden, Linux defaults to 75s.)
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value keepalive_interval = 3;</code>
   */
  com.google.protobuf.UInt32ValueOrBuilder getKeepaliveIntervalOrBuilder();
}
