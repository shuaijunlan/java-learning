// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: StreamingExample.proto

package cn.shuaijunlan.grpc.leagning.streaming;

/**
 * Protobuf type {@code streaming.Average}
 */
public  final class Average extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:streaming.Average)
    AverageOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Average.newBuilder() to construct.
  private Average(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Average() {
    val_ = 0D;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Average(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 9: {

            val_ = input.readDouble();
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return cn.shuaijunlan.grpc.leagning.streaming.StreamingExample.internal_static_streaming_Average_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return cn.shuaijunlan.grpc.leagning.streaming.StreamingExample.internal_static_streaming_Average_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            cn.shuaijunlan.grpc.leagning.streaming.Average.class, cn.shuaijunlan.grpc.leagning.streaming.Average.Builder.class);
  }

  public static final int VAL_FIELD_NUMBER = 1;
  private double val_;
  /**
   * <code>double val = 1;</code>
   */
  public double getVal() {
    return val_;
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
    if (val_ != 0D) {
      output.writeDouble(1, val_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (val_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(1, val_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof cn.shuaijunlan.grpc.leagning.streaming.Average)) {
      return super.equals(obj);
    }
    cn.shuaijunlan.grpc.leagning.streaming.Average other = (cn.shuaijunlan.grpc.leagning.streaming.Average) obj;

    boolean result = true;
    result = result && (
        java.lang.Double.doubleToLongBits(getVal())
        == java.lang.Double.doubleToLongBits(
            other.getVal()));
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + VAL_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getVal()));
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static cn.shuaijunlan.grpc.leagning.streaming.Average parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cn.shuaijunlan.grpc.leagning.streaming.Average parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cn.shuaijunlan.grpc.leagning.streaming.Average parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cn.shuaijunlan.grpc.leagning.streaming.Average parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cn.shuaijunlan.grpc.leagning.streaming.Average parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cn.shuaijunlan.grpc.leagning.streaming.Average parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cn.shuaijunlan.grpc.leagning.streaming.Average parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cn.shuaijunlan.grpc.leagning.streaming.Average parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static cn.shuaijunlan.grpc.leagning.streaming.Average parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static cn.shuaijunlan.grpc.leagning.streaming.Average parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static cn.shuaijunlan.grpc.leagning.streaming.Average parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cn.shuaijunlan.grpc.leagning.streaming.Average parseFrom(
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
  public static Builder newBuilder(cn.shuaijunlan.grpc.leagning.streaming.Average prototype) {
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
   * Protobuf type {@code streaming.Average}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:streaming.Average)
      cn.shuaijunlan.grpc.leagning.streaming.AverageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return cn.shuaijunlan.grpc.leagning.streaming.StreamingExample.internal_static_streaming_Average_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cn.shuaijunlan.grpc.leagning.streaming.StreamingExample.internal_static_streaming_Average_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cn.shuaijunlan.grpc.leagning.streaming.Average.class, cn.shuaijunlan.grpc.leagning.streaming.Average.Builder.class);
    }

    // Construct using cn.shuaijunlan.grpc.leagning.streaming.Average.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      val_ = 0D;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return cn.shuaijunlan.grpc.leagning.streaming.StreamingExample.internal_static_streaming_Average_descriptor;
    }

    @java.lang.Override
    public cn.shuaijunlan.grpc.leagning.streaming.Average getDefaultInstanceForType() {
      return cn.shuaijunlan.grpc.leagning.streaming.Average.getDefaultInstance();
    }

    @java.lang.Override
    public cn.shuaijunlan.grpc.leagning.streaming.Average build() {
      cn.shuaijunlan.grpc.leagning.streaming.Average result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public cn.shuaijunlan.grpc.leagning.streaming.Average buildPartial() {
      cn.shuaijunlan.grpc.leagning.streaming.Average result = new cn.shuaijunlan.grpc.leagning.streaming.Average(this);
      result.val_ = val_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof cn.shuaijunlan.grpc.leagning.streaming.Average) {
        return mergeFrom((cn.shuaijunlan.grpc.leagning.streaming.Average)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(cn.shuaijunlan.grpc.leagning.streaming.Average other) {
      if (other == cn.shuaijunlan.grpc.leagning.streaming.Average.getDefaultInstance()) return this;
      if (other.getVal() != 0D) {
        setVal(other.getVal());
      }
      this.mergeUnknownFields(other.unknownFields);
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
      cn.shuaijunlan.grpc.leagning.streaming.Average parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (cn.shuaijunlan.grpc.leagning.streaming.Average) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private double val_ ;
    /**
     * <code>double val = 1;</code>
     */
    public double getVal() {
      return val_;
    }
    /**
     * <code>double val = 1;</code>
     */
    public Builder setVal(double value) {
      
      val_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double val = 1;</code>
     */
    public Builder clearVal() {
      
      val_ = 0D;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:streaming.Average)
  }

  // @@protoc_insertion_point(class_scope:streaming.Average)
  private static final cn.shuaijunlan.grpc.leagning.streaming.Average DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new cn.shuaijunlan.grpc.leagning.streaming.Average();
  }

  public static cn.shuaijunlan.grpc.leagning.streaming.Average getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Average>
      PARSER = new com.google.protobuf.AbstractParser<Average>() {
    @java.lang.Override
    public Average parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Average(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Average> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Average> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public cn.shuaijunlan.grpc.leagning.streaming.Average getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

