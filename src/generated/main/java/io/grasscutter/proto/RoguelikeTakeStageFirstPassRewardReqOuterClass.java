// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RoguelikeTakeStageFirstPassRewardReq.proto

package io.grasscutter.proto;

public final class RoguelikeTakeStageFirstPassRewardReqOuterClass {
  private RoguelikeTakeStageFirstPassRewardReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface RoguelikeTakeStageFirstPassRewardReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:RoguelikeTakeStageFirstPassRewardReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 stage_id = 1;</code>
     * @return The stageId.
     */
    int getStageId();
  }
  /**
   * <pre>
   * CmdId: 8421
   * EnetChannelId: 0
   * EnetIsReliable: true
   * IsAllowClient: true
   * </pre>
   *
   * Protobuf type {@code RoguelikeTakeStageFirstPassRewardReq}
   */
  public static final class RoguelikeTakeStageFirstPassRewardReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:RoguelikeTakeStageFirstPassRewardReq)
      RoguelikeTakeStageFirstPassRewardReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use RoguelikeTakeStageFirstPassRewardReq.newBuilder() to construct.
    private RoguelikeTakeStageFirstPassRewardReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private RoguelikeTakeStageFirstPassRewardReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new RoguelikeTakeStageFirstPassRewardReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private RoguelikeTakeStageFirstPassRewardReq(
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

              stageId_ = input.readUInt32();
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
      return io.grasscutter.proto.RoguelikeTakeStageFirstPassRewardReqOuterClass.internal_static_RoguelikeTakeStageFirstPassRewardReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.proto.RoguelikeTakeStageFirstPassRewardReqOuterClass.internal_static_RoguelikeTakeStageFirstPassRewardReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.proto.RoguelikeTakeStageFirstPassRewardReqOuterClass.RoguelikeTakeStageFirstPassRewardReq.class, io.grasscutter.proto.RoguelikeTakeStageFirstPassRewardReqOuterClass.RoguelikeTakeStageFirstPassRewardReq.Builder.class);
    }

    public static final int STAGE_ID_FIELD_NUMBER = 1;
    private int stageId_;
    /**
     * <code>uint32 stage_id = 1;</code>
     * @return The stageId.
     */
    @java.lang.Override
    public int getStageId() {
      return stageId_;
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
      if (stageId_ != 0) {
        output.writeUInt32(1, stageId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (stageId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, stageId_);
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
      if (!(obj instanceof io.grasscutter.proto.RoguelikeTakeStageFirstPassRewardReqOuterClass.RoguelikeTakeStageFirstPassRewardReq)) {
        return super.equals(obj);
      }
      io.grasscutter.proto.RoguelikeTakeStageFirstPassRewardReqOuterClass.RoguelikeTakeStageFirstPassRewardReq other = (io.grasscutter.proto.RoguelikeTakeStageFirstPassRewardReqOuterClass.RoguelikeTakeStageFirstPassRewardReq) obj;

      if (getStageId()
          != other.getStageId()) return false;
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
      hash = (37 * hash) + STAGE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getStageId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.grasscutter.proto.RoguelikeTakeStageFirstPassRewardReqOuterClass.RoguelikeTakeStageFirstPassRewardReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.RoguelikeTakeStageFirstPassRewardReqOuterClass.RoguelikeTakeStageFirstPassRewardReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.RoguelikeTakeStageFirstPassRewardReqOuterClass.RoguelikeTakeStageFirstPassRewardReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.RoguelikeTakeStageFirstPassRewardReqOuterClass.RoguelikeTakeStageFirstPassRewardReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.RoguelikeTakeStageFirstPassRewardReqOuterClass.RoguelikeTakeStageFirstPassRewardReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.RoguelikeTakeStageFirstPassRewardReqOuterClass.RoguelikeTakeStageFirstPassRewardReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.RoguelikeTakeStageFirstPassRewardReqOuterClass.RoguelikeTakeStageFirstPassRewardReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.RoguelikeTakeStageFirstPassRewardReqOuterClass.RoguelikeTakeStageFirstPassRewardReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.RoguelikeTakeStageFirstPassRewardReqOuterClass.RoguelikeTakeStageFirstPassRewardReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.RoguelikeTakeStageFirstPassRewardReqOuterClass.RoguelikeTakeStageFirstPassRewardReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.RoguelikeTakeStageFirstPassRewardReqOuterClass.RoguelikeTakeStageFirstPassRewardReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.RoguelikeTakeStageFirstPassRewardReqOuterClass.RoguelikeTakeStageFirstPassRewardReq parseFrom(
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
    public static Builder newBuilder(io.grasscutter.proto.RoguelikeTakeStageFirstPassRewardReqOuterClass.RoguelikeTakeStageFirstPassRewardReq prototype) {
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
     * CmdId: 8421
     * EnetChannelId: 0
     * EnetIsReliable: true
     * IsAllowClient: true
     * </pre>
     *
     * Protobuf type {@code RoguelikeTakeStageFirstPassRewardReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:RoguelikeTakeStageFirstPassRewardReq)
        io.grasscutter.proto.RoguelikeTakeStageFirstPassRewardReqOuterClass.RoguelikeTakeStageFirstPassRewardReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.grasscutter.proto.RoguelikeTakeStageFirstPassRewardReqOuterClass.internal_static_RoguelikeTakeStageFirstPassRewardReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.grasscutter.proto.RoguelikeTakeStageFirstPassRewardReqOuterClass.internal_static_RoguelikeTakeStageFirstPassRewardReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.grasscutter.proto.RoguelikeTakeStageFirstPassRewardReqOuterClass.RoguelikeTakeStageFirstPassRewardReq.class, io.grasscutter.proto.RoguelikeTakeStageFirstPassRewardReqOuterClass.RoguelikeTakeStageFirstPassRewardReq.Builder.class);
      }

      // Construct using io.grasscutter.proto.RoguelikeTakeStageFirstPassRewardReqOuterClass.RoguelikeTakeStageFirstPassRewardReq.newBuilder()
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
        stageId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.grasscutter.proto.RoguelikeTakeStageFirstPassRewardReqOuterClass.internal_static_RoguelikeTakeStageFirstPassRewardReq_descriptor;
      }

      @java.lang.Override
      public io.grasscutter.proto.RoguelikeTakeStageFirstPassRewardReqOuterClass.RoguelikeTakeStageFirstPassRewardReq getDefaultInstanceForType() {
        return io.grasscutter.proto.RoguelikeTakeStageFirstPassRewardReqOuterClass.RoguelikeTakeStageFirstPassRewardReq.getDefaultInstance();
      }

      @java.lang.Override
      public io.grasscutter.proto.RoguelikeTakeStageFirstPassRewardReqOuterClass.RoguelikeTakeStageFirstPassRewardReq build() {
        io.grasscutter.proto.RoguelikeTakeStageFirstPassRewardReqOuterClass.RoguelikeTakeStageFirstPassRewardReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.grasscutter.proto.RoguelikeTakeStageFirstPassRewardReqOuterClass.RoguelikeTakeStageFirstPassRewardReq buildPartial() {
        io.grasscutter.proto.RoguelikeTakeStageFirstPassRewardReqOuterClass.RoguelikeTakeStageFirstPassRewardReq result = new io.grasscutter.proto.RoguelikeTakeStageFirstPassRewardReqOuterClass.RoguelikeTakeStageFirstPassRewardReq(this);
        result.stageId_ = stageId_;
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
        if (other instanceof io.grasscutter.proto.RoguelikeTakeStageFirstPassRewardReqOuterClass.RoguelikeTakeStageFirstPassRewardReq) {
          return mergeFrom((io.grasscutter.proto.RoguelikeTakeStageFirstPassRewardReqOuterClass.RoguelikeTakeStageFirstPassRewardReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.grasscutter.proto.RoguelikeTakeStageFirstPassRewardReqOuterClass.RoguelikeTakeStageFirstPassRewardReq other) {
        if (other == io.grasscutter.proto.RoguelikeTakeStageFirstPassRewardReqOuterClass.RoguelikeTakeStageFirstPassRewardReq.getDefaultInstance()) return this;
        if (other.getStageId() != 0) {
          setStageId(other.getStageId());
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
        io.grasscutter.proto.RoguelikeTakeStageFirstPassRewardReqOuterClass.RoguelikeTakeStageFirstPassRewardReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.grasscutter.proto.RoguelikeTakeStageFirstPassRewardReqOuterClass.RoguelikeTakeStageFirstPassRewardReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int stageId_ ;
      /**
       * <code>uint32 stage_id = 1;</code>
       * @return The stageId.
       */
      @java.lang.Override
      public int getStageId() {
        return stageId_;
      }
      /**
       * <code>uint32 stage_id = 1;</code>
       * @param value The stageId to set.
       * @return This builder for chaining.
       */
      public Builder setStageId(int value) {
        
        stageId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 stage_id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearStageId() {
        
        stageId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:RoguelikeTakeStageFirstPassRewardReq)
    }

    // @@protoc_insertion_point(class_scope:RoguelikeTakeStageFirstPassRewardReq)
    private static final io.grasscutter.proto.RoguelikeTakeStageFirstPassRewardReqOuterClass.RoguelikeTakeStageFirstPassRewardReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.grasscutter.proto.RoguelikeTakeStageFirstPassRewardReqOuterClass.RoguelikeTakeStageFirstPassRewardReq();
    }

    public static io.grasscutter.proto.RoguelikeTakeStageFirstPassRewardReqOuterClass.RoguelikeTakeStageFirstPassRewardReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<RoguelikeTakeStageFirstPassRewardReq>
        PARSER = new com.google.protobuf.AbstractParser<RoguelikeTakeStageFirstPassRewardReq>() {
      @java.lang.Override
      public RoguelikeTakeStageFirstPassRewardReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new RoguelikeTakeStageFirstPassRewardReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<RoguelikeTakeStageFirstPassRewardReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<RoguelikeTakeStageFirstPassRewardReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.grasscutter.proto.RoguelikeTakeStageFirstPassRewardReqOuterClass.RoguelikeTakeStageFirstPassRewardReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RoguelikeTakeStageFirstPassRewardReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_RoguelikeTakeStageFirstPassRewardReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n*RoguelikeTakeStageFirstPassRewardReq.p" +
      "roto\"8\n$RoguelikeTakeStageFirstPassRewar" +
      "dReq\022\020\n\010stage_id\030\001 \001(\rB\026\n\024io.grasscutter" +
      ".protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_RoguelikeTakeStageFirstPassRewardReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_RoguelikeTakeStageFirstPassRewardReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_RoguelikeTakeStageFirstPassRewardReq_descriptor,
        new java.lang.String[] { "StageId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
