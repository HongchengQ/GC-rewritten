// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PlantFlowerGetRecvFlowerListReq.proto

package io.grasscutter.proto;

public final class PlantFlowerGetRecvFlowerListReqOuterClass {
  private PlantFlowerGetRecvFlowerListReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PlantFlowerGetRecvFlowerListReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PlantFlowerGetRecvFlowerListReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 schedule_id = 1;</code>
     * @return The scheduleId.
     */
    int getScheduleId();
  }
  /**
   * <pre>
   * CmdId: 8270
   * EnetChannelId: 0
   * EnetIsReliable: true
   * IsAllowClient: true
   * </pre>
   *
   * Protobuf type {@code PlantFlowerGetRecvFlowerListReq}
   */
  public static final class PlantFlowerGetRecvFlowerListReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:PlantFlowerGetRecvFlowerListReq)
      PlantFlowerGetRecvFlowerListReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PlantFlowerGetRecvFlowerListReq.newBuilder() to construct.
    private PlantFlowerGetRecvFlowerListReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PlantFlowerGetRecvFlowerListReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PlantFlowerGetRecvFlowerListReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private PlantFlowerGetRecvFlowerListReq(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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
            case 8: {

              scheduleId_ = input.readUInt32();
              break;
            }
            default: {
              if (!parseUnknownField(
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
      return io.grasscutter.proto.PlantFlowerGetRecvFlowerListReqOuterClass.internal_static_PlantFlowerGetRecvFlowerListReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.proto.PlantFlowerGetRecvFlowerListReqOuterClass.internal_static_PlantFlowerGetRecvFlowerListReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.proto.PlantFlowerGetRecvFlowerListReqOuterClass.PlantFlowerGetRecvFlowerListReq.class, io.grasscutter.proto.PlantFlowerGetRecvFlowerListReqOuterClass.PlantFlowerGetRecvFlowerListReq.Builder.class);
    }

    public static final int SCHEDULE_ID_FIELD_NUMBER = 1;
    private int scheduleId_;
    /**
     * <code>uint32 schedule_id = 1;</code>
     * @return The scheduleId.
     */
    @java.lang.Override
    public int getScheduleId() {
      return scheduleId_;
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
      if (scheduleId_ != 0) {
        output.writeUInt32(1, scheduleId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (scheduleId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, scheduleId_);
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
      if (!(obj instanceof io.grasscutter.proto.PlantFlowerGetRecvFlowerListReqOuterClass.PlantFlowerGetRecvFlowerListReq)) {
        return super.equals(obj);
      }
      io.grasscutter.proto.PlantFlowerGetRecvFlowerListReqOuterClass.PlantFlowerGetRecvFlowerListReq other = (io.grasscutter.proto.PlantFlowerGetRecvFlowerListReqOuterClass.PlantFlowerGetRecvFlowerListReq) obj;

      if (getScheduleId()
          != other.getScheduleId()) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + SCHEDULE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getScheduleId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.grasscutter.proto.PlantFlowerGetRecvFlowerListReqOuterClass.PlantFlowerGetRecvFlowerListReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.PlantFlowerGetRecvFlowerListReqOuterClass.PlantFlowerGetRecvFlowerListReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.PlantFlowerGetRecvFlowerListReqOuterClass.PlantFlowerGetRecvFlowerListReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.PlantFlowerGetRecvFlowerListReqOuterClass.PlantFlowerGetRecvFlowerListReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.PlantFlowerGetRecvFlowerListReqOuterClass.PlantFlowerGetRecvFlowerListReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.PlantFlowerGetRecvFlowerListReqOuterClass.PlantFlowerGetRecvFlowerListReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.PlantFlowerGetRecvFlowerListReqOuterClass.PlantFlowerGetRecvFlowerListReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.PlantFlowerGetRecvFlowerListReqOuterClass.PlantFlowerGetRecvFlowerListReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.PlantFlowerGetRecvFlowerListReqOuterClass.PlantFlowerGetRecvFlowerListReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.PlantFlowerGetRecvFlowerListReqOuterClass.PlantFlowerGetRecvFlowerListReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.PlantFlowerGetRecvFlowerListReqOuterClass.PlantFlowerGetRecvFlowerListReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.PlantFlowerGetRecvFlowerListReqOuterClass.PlantFlowerGetRecvFlowerListReq parseFrom(
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
    public static Builder newBuilder(io.grasscutter.proto.PlantFlowerGetRecvFlowerListReqOuterClass.PlantFlowerGetRecvFlowerListReq prototype) {
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
     * <pre>
     * CmdId: 8270
     * EnetChannelId: 0
     * EnetIsReliable: true
     * IsAllowClient: true
     * </pre>
     *
     * Protobuf type {@code PlantFlowerGetRecvFlowerListReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PlantFlowerGetRecvFlowerListReq)
        io.grasscutter.proto.PlantFlowerGetRecvFlowerListReqOuterClass.PlantFlowerGetRecvFlowerListReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.grasscutter.proto.PlantFlowerGetRecvFlowerListReqOuterClass.internal_static_PlantFlowerGetRecvFlowerListReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.grasscutter.proto.PlantFlowerGetRecvFlowerListReqOuterClass.internal_static_PlantFlowerGetRecvFlowerListReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.grasscutter.proto.PlantFlowerGetRecvFlowerListReqOuterClass.PlantFlowerGetRecvFlowerListReq.class, io.grasscutter.proto.PlantFlowerGetRecvFlowerListReqOuterClass.PlantFlowerGetRecvFlowerListReq.Builder.class);
      }

      // Construct using io.grasscutter.proto.PlantFlowerGetRecvFlowerListReqOuterClass.PlantFlowerGetRecvFlowerListReq.newBuilder()
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
        scheduleId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.grasscutter.proto.PlantFlowerGetRecvFlowerListReqOuterClass.internal_static_PlantFlowerGetRecvFlowerListReq_descriptor;
      }

      @java.lang.Override
      public io.grasscutter.proto.PlantFlowerGetRecvFlowerListReqOuterClass.PlantFlowerGetRecvFlowerListReq getDefaultInstanceForType() {
        return io.grasscutter.proto.PlantFlowerGetRecvFlowerListReqOuterClass.PlantFlowerGetRecvFlowerListReq.getDefaultInstance();
      }

      @java.lang.Override
      public io.grasscutter.proto.PlantFlowerGetRecvFlowerListReqOuterClass.PlantFlowerGetRecvFlowerListReq build() {
        io.grasscutter.proto.PlantFlowerGetRecvFlowerListReqOuterClass.PlantFlowerGetRecvFlowerListReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.grasscutter.proto.PlantFlowerGetRecvFlowerListReqOuterClass.PlantFlowerGetRecvFlowerListReq buildPartial() {
        io.grasscutter.proto.PlantFlowerGetRecvFlowerListReqOuterClass.PlantFlowerGetRecvFlowerListReq result = new io.grasscutter.proto.PlantFlowerGetRecvFlowerListReqOuterClass.PlantFlowerGetRecvFlowerListReq(this);
        result.scheduleId_ = scheduleId_;
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
        if (other instanceof io.grasscutter.proto.PlantFlowerGetRecvFlowerListReqOuterClass.PlantFlowerGetRecvFlowerListReq) {
          return mergeFrom((io.grasscutter.proto.PlantFlowerGetRecvFlowerListReqOuterClass.PlantFlowerGetRecvFlowerListReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.grasscutter.proto.PlantFlowerGetRecvFlowerListReqOuterClass.PlantFlowerGetRecvFlowerListReq other) {
        if (other == io.grasscutter.proto.PlantFlowerGetRecvFlowerListReqOuterClass.PlantFlowerGetRecvFlowerListReq.getDefaultInstance()) return this;
        if (other.getScheduleId() != 0) {
          setScheduleId(other.getScheduleId());
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
        io.grasscutter.proto.PlantFlowerGetRecvFlowerListReqOuterClass.PlantFlowerGetRecvFlowerListReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.grasscutter.proto.PlantFlowerGetRecvFlowerListReqOuterClass.PlantFlowerGetRecvFlowerListReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int scheduleId_ ;
      /**
       * <code>uint32 schedule_id = 1;</code>
       * @return The scheduleId.
       */
      @java.lang.Override
      public int getScheduleId() {
        return scheduleId_;
      }
      /**
       * <code>uint32 schedule_id = 1;</code>
       * @param value The scheduleId to set.
       * @return This builder for chaining.
       */
      public Builder setScheduleId(int value) {
        
        scheduleId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 schedule_id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearScheduleId() {
        
        scheduleId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:PlantFlowerGetRecvFlowerListReq)
    }

    // @@protoc_insertion_point(class_scope:PlantFlowerGetRecvFlowerListReq)
    private static final io.grasscutter.proto.PlantFlowerGetRecvFlowerListReqOuterClass.PlantFlowerGetRecvFlowerListReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.grasscutter.proto.PlantFlowerGetRecvFlowerListReqOuterClass.PlantFlowerGetRecvFlowerListReq();
    }

    public static io.grasscutter.proto.PlantFlowerGetRecvFlowerListReqOuterClass.PlantFlowerGetRecvFlowerListReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PlantFlowerGetRecvFlowerListReq>
        PARSER = new com.google.protobuf.AbstractParser<PlantFlowerGetRecvFlowerListReq>() {
      @java.lang.Override
      public PlantFlowerGetRecvFlowerListReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new PlantFlowerGetRecvFlowerListReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<PlantFlowerGetRecvFlowerListReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PlantFlowerGetRecvFlowerListReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.grasscutter.proto.PlantFlowerGetRecvFlowerListReqOuterClass.PlantFlowerGetRecvFlowerListReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PlantFlowerGetRecvFlowerListReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PlantFlowerGetRecvFlowerListReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n%PlantFlowerGetRecvFlowerListReq.proto\"" +
      "6\n\037PlantFlowerGetRecvFlowerListReq\022\023\n\013sc" +
      "hedule_id\030\001 \001(\rB\026\n\024io.grasscutter.protob" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_PlantFlowerGetRecvFlowerListReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PlantFlowerGetRecvFlowerListReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PlantFlowerGetRecvFlowerListReq_descriptor,
        new java.lang.String[] { "ScheduleId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
