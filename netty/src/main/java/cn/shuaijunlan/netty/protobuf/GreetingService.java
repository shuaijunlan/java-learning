// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: hello_service.proto

package cn.shuaijunlan.netty.protobuf;

public final class GreetingService {
  private GreetingService() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023hello_service.proto\022\032com.xxx.tutorial." +
      "demo.grpc\032\013hello.proto2o\n\014HelloService\022_" +
      "\n\010sayHello\022(.com.xxx.tutorial.demo.grpc." +
      "HelloRequest\032).com.xxx.tutorial.demo.grp" +
      "c.HelloResponseB0\n\035cn.shuaijunlan.netty." +
      "protobufB\017GreetingServiceb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          cn.shuaijunlan.netty.protobuf.HelloProto.getDescriptor(),
        }, assigner);
    cn.shuaijunlan.netty.protobuf.HelloProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}