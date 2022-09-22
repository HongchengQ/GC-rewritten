// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DungeonCandidateTeamSetReadyReq.proto

package io.grasscutter.proto;

public final class DungeonCandidateTeamSetReadyReqOuterClass {
  private DungeonCandidateTeamSetReadyReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface DungeonCandidateTeamSetReadyReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:DungeonCandidateTeamSetReadyReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool is_ready = 15;</code>
     * @return The isReady.
     */
    boolean getIsReady();
  }
  /**
   * <pre>
   * CmdId: 991
   * EnetChannelId: 0
   * EnetIsReliable: true
   * IsAllowClient: true
   * </pre>
   *
   * Protobuf type {@code DungeonCandidateTeamSetReadyReq}
   */
  public static final class DungeonCandidateTeamSetReadyReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:DungeonCandidateTeamSetReadyReq)
      DungeonCandidateTeamSetReadyReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use DungeonCandidateTeamSetReadyReq.newBuilder() to construct.
    private DungeonCandidateTeamSetReadyReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private DungeonCandidateTeamSetReadyReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new DungeonCandidateTeamSetReadyReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private DungeonCandidateTeamSetReadyReq(
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
            case 120: {

              isReady_ = input.readBool();
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
      return io.grasscutter.proto.DungeonCandidateTeamSetReadyReqOuterClass.internal_static_DungeonCandidateTeamSetReadyReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.proto.DungeonCandidateTeamSetReadyReqOuterClass.internal_static_DungeonCandidateTeamSetReadyReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.proto.DungeonCandidateTeamSetReadyReqOuterClass.DungeonCandidateTeamSetReadyReq.class, io.grasscutter.proto.DungeonCandidateTeamSetReadyReqOuterClass.DungeonCandidateTeamSetReadyReq.Builder.class);
    }

    public static final int IS_READY_FIELD_NUMBER = 15;
    private boolean isReady_;
    /**
     * <code>bool is_ready = 15;</code>
     * @return The isReady.
     */
    @java.lang.Override
    public boolean getIsReady() {
      return isReady_;
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
      if (isReady_ != false) {
        output.writeBool(15, isReady_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isReady_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(15, isReady_);
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
      if (!(obj instanceof io.grasscutter.proto.DungeonCandidateTeamSetReadyReqOuterClass.DungeonCandidateTeamSetReadyReq)) {
        return super.equals(obj);
      }
      io.grasscutter.proto.DungeonCandidateTeamSetReadyReqOuterClass.DungeonCandidateTeamSetReadyReq other = (io.grasscutter.proto.DungeonCandidateTeamSetReadyReqOuterClass.DungeonCandidateTeamSetReadyReq) obj;

      if (getIsReady()
          != other.getIsReady()) return false;
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
      hash = (37 * hash) + IS_READY_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsReady());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.grasscutter.proto.DungeonCandidateTeamSetReadyReqOuterClass.DungeonCandidateTeamSetReadyReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.DungeonCandidateTeamSetReadyReqOuterClass.DungeonCandidateTeamSetReadyReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.DungeonCandidateTeamSetReadyReqOuterClass.DungeonCandidateTeamSetReadyReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.DungeonCandidateTeamSetReadyReqOuterClass.DungeonCandidateTeamSetReadyReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.DungeonCandidateTeamSetReadyReqOuterClass.DungeonCandidateTeamSetReadyReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.DungeonCandidateTeamSetReadyReqOuterClass.DungeonCandidateTeamSetReadyReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.DungeonCandidateTeamSetReadyReqOuterClass.DungeonCandidateTeamSetReadyReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.DungeonCandidateTeamSetReadyReqOuterClass.DungeonCandidateTeamSetReadyReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.DungeonCandidateTeamSetReadyReqOuterClass.DungeonCandidateTeamSetReadyReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.DungeonCandidateTeamSetReadyReqOuterClass.DungeonCandidateTeamSetReadyReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.DungeonCandidateTeamSetReadyReqOuterClass.DungeonCandidateTeamSetReadyReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.DungeonCandidateTeamSetReadyReqOuterClass.DungeonCandidateTeamSetReadyReq parseFrom(
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
    public static Builder newBuilder(io.grasscutter.proto.DungeonCandidateTeamSetReadyReqOuterClass.DungeonCandidateTeamSetReadyReq prototype) {
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
     * CmdId: 991
     * EnetChannelId: 0
     * EnetIsReliable: true
     * IsAllowClient: true
     * </pre>
     *
     * Protobuf type {@code DungeonCandidateTeamSetReadyReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:DungeonCandidateTeamSetReadyReq)
        io.grasscutter.proto.DungeonCandidateTeamSetReadyReqOuterClass.DungeonCandidateTeamSetReadyReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.grasscutter.proto.DungeonCandidateTeamSetReadyReqOuterClass.internal_static_DungeonCandidateTeamSetReadyReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.grasscutter.proto.DungeonCandidateTeamSetReadyReqOuterClass.internal_static_DungeonCandidateTeamSetReadyReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.grasscutter.proto.DungeonCandidateTeamSetReadyReqOuterClass.DungeonCandidateTeamSetReadyReq.class, io.grasscutter.proto.DungeonCandidateTeamSetReadyReqOuterClass.DungeonCandidateTeamSetReadyReq.Builder.class);
      }

      // Construct using io.grasscutter.proto.DungeonCandidateTeamSetReadyReqOuterClass.DungeonCandidateTeamSetReadyReq.newBuilder()
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
        isReady_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.grasscutter.proto.DungeonCandidateTeamSetReadyReqOuterClass.internal_static_DungeonCandidateTeamSetReadyReq_descriptor;
      }

      @java.lang.Override
      public io.grasscutter.proto.DungeonCandidateTeamSetReadyReqOuterClass.DungeonCandidateTeamSetReadyReq getDefaultInstanceForType() {
        return io.grasscutter.proto.DungeonCandidateTeamSetReadyReqOuterClass.DungeonCandidateTeamSetReadyReq.getDefaultInstance();
      }

      @java.lang.Override
      public io.grasscutter.proto.DungeonCandidateTeamSetReadyReqOuterClass.DungeonCandidateTeamSetReadyReq build() {
        io.grasscutter.proto.DungeonCandidateTeamSetReadyReqOuterClass.DungeonCandidateTeamSetReadyReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.grasscutter.proto.DungeonCandidateTeamSetReadyReqOuterClass.DungeonCandidateTeamSetReadyReq buildPartial() {
        io.grasscutter.proto.DungeonCandidateTeamSetReadyReqOuterClass.DungeonCandidateTeamSetReadyReq result = new io.grasscutter.proto.DungeonCandidateTeamSetReadyReqOuterClass.DungeonCandidateTeamSetReadyReq(this);
        result.isReady_ = isReady_;
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
        if (other instanceof io.grasscutter.proto.DungeonCandidateTeamSetReadyReqOuterClass.DungeonCandidateTeamSetReadyReq) {
          return mergeFrom((io.grasscutter.proto.DungeonCandidateTeamSetReadyReqOuterClass.DungeonCandidateTeamSetReadyReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.grasscutter.proto.DungeonCandidateTeamSetReadyReqOuterClass.DungeonCandidateTeamSetReadyReq other) {
        if (other == io.grasscutter.proto.DungeonCandidateTeamSetReadyReqOuterClass.DungeonCandidateTeamSetReadyReq.getDefaultInstance()) return this;
        if (other.getIsReady() != false) {
          setIsReady(other.getIsReady());
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
        io.grasscutter.proto.DungeonCandidateTeamSetReadyReqOuterClass.DungeonCandidateTeamSetReadyReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.grasscutter.proto.DungeonCandidateTeamSetReadyReqOuterClass.DungeonCandidateTeamSetReadyReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private boolean isReady_ ;
      /**
       * <code>bool is_ready = 15;</code>
       * @return The isReady.
       */
      @java.lang.Override
      public boolean getIsReady() {
        return isReady_;
      }
      /**
       * <code>bool is_ready = 15;</code>
       * @param value The isReady to set.
       * @return This builder for chaining.
       */
      public Builder setIsReady(boolean value) {
        
        isReady_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_ready = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsReady() {
        
        isReady_ = false;
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


      // @@protoc_insertion_point(builder_scope:DungeonCandidateTeamSetReadyReq)
    }

    // @@protoc_insertion_point(class_scope:DungeonCandidateTeamSetReadyReq)
    private static final io.grasscutter.proto.DungeonCandidateTeamSetReadyReqOuterClass.DungeonCandidateTeamSetReadyReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.grasscutter.proto.DungeonCandidateTeamSetReadyReqOuterClass.DungeonCandidateTeamSetReadyReq();
    }

    public static io.grasscutter.proto.DungeonCandidateTeamSetReadyReqOuterClass.DungeonCandidateTeamSetReadyReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<DungeonCandidateTeamSetReadyReq>
        PARSER = new com.google.protobuf.AbstractParser<DungeonCandidateTeamSetReadyReq>() {
      @java.lang.Override
      public DungeonCandidateTeamSetReadyReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new DungeonCandidateTeamSetReadyReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<DungeonCandidateTeamSetReadyReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<DungeonCandidateTeamSetReadyReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.grasscutter.proto.DungeonCandidateTeamSetReadyReqOuterClass.DungeonCandidateTeamSetReadyReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DungeonCandidateTeamSetReadyReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DungeonCandidateTeamSetReadyReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n%DungeonCandidateTeamSetReadyReq.proto\"" +
      "3\n\037DungeonCandidateTeamSetReadyReq\022\020\n\010is" +
      "_ready\030\017 \001(\010B\026\n\024io.grasscutter.protob\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_DungeonCandidateTeamSetReadyReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_DungeonCandidateTeamSetReadyReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DungeonCandidateTeamSetReadyReq_descriptor,
        new java.lang.String[] { "IsReady", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
