// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: StartArenaChallengeLevelReq.proto

package io.grasscutter.proto;

public final class StartArenaChallengeLevelReqOuterClass {
  private StartArenaChallengeLevelReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface StartArenaChallengeLevelReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:StartArenaChallengeLevelReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 arena_challenge_id = 4;</code>
     * @return The arenaChallengeId.
     */
    int getArenaChallengeId();

    /**
     * <code>uint32 gadget_entity_id = 5;</code>
     * @return The gadgetEntityId.
     */
    int getGadgetEntityId();

    /**
     * <code>uint32 arena_challenge_level = 2;</code>
     * @return The arenaChallengeLevel.
     */
    int getArenaChallengeLevel();
  }
  /**
   * <pre>
   * CmdId: 2127
   * EnetChannelId: 0
   * EnetIsReliable: true
   * IsAllowClient: true
   * </pre>
   *
   * Protobuf type {@code StartArenaChallengeLevelReq}
   */
  public static final class StartArenaChallengeLevelReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:StartArenaChallengeLevelReq)
      StartArenaChallengeLevelReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use StartArenaChallengeLevelReq.newBuilder() to construct.
    private StartArenaChallengeLevelReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private StartArenaChallengeLevelReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new StartArenaChallengeLevelReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private StartArenaChallengeLevelReq(
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
            case 16: {

              arenaChallengeLevel_ = input.readUInt32();
              break;
            }
            case 32: {

              arenaChallengeId_ = input.readUInt32();
              break;
            }
            case 40: {

              gadgetEntityId_ = input.readUInt32();
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
      return io.grasscutter.proto.StartArenaChallengeLevelReqOuterClass.internal_static_StartArenaChallengeLevelReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.proto.StartArenaChallengeLevelReqOuterClass.internal_static_StartArenaChallengeLevelReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.proto.StartArenaChallengeLevelReqOuterClass.StartArenaChallengeLevelReq.class, io.grasscutter.proto.StartArenaChallengeLevelReqOuterClass.StartArenaChallengeLevelReq.Builder.class);
    }

    public static final int ARENA_CHALLENGE_ID_FIELD_NUMBER = 4;
    private int arenaChallengeId_;
    /**
     * <code>uint32 arena_challenge_id = 4;</code>
     * @return The arenaChallengeId.
     */
    @java.lang.Override
    public int getArenaChallengeId() {
      return arenaChallengeId_;
    }

    public static final int GADGET_ENTITY_ID_FIELD_NUMBER = 5;
    private int gadgetEntityId_;
    /**
     * <code>uint32 gadget_entity_id = 5;</code>
     * @return The gadgetEntityId.
     */
    @java.lang.Override
    public int getGadgetEntityId() {
      return gadgetEntityId_;
    }

    public static final int ARENA_CHALLENGE_LEVEL_FIELD_NUMBER = 2;
    private int arenaChallengeLevel_;
    /**
     * <code>uint32 arena_challenge_level = 2;</code>
     * @return The arenaChallengeLevel.
     */
    @java.lang.Override
    public int getArenaChallengeLevel() {
      return arenaChallengeLevel_;
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
      if (arenaChallengeLevel_ != 0) {
        output.writeUInt32(2, arenaChallengeLevel_);
      }
      if (arenaChallengeId_ != 0) {
        output.writeUInt32(4, arenaChallengeId_);
      }
      if (gadgetEntityId_ != 0) {
        output.writeUInt32(5, gadgetEntityId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (arenaChallengeLevel_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, arenaChallengeLevel_);
      }
      if (arenaChallengeId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, arenaChallengeId_);
      }
      if (gadgetEntityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, gadgetEntityId_);
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
      if (!(obj instanceof io.grasscutter.proto.StartArenaChallengeLevelReqOuterClass.StartArenaChallengeLevelReq)) {
        return super.equals(obj);
      }
      io.grasscutter.proto.StartArenaChallengeLevelReqOuterClass.StartArenaChallengeLevelReq other = (io.grasscutter.proto.StartArenaChallengeLevelReqOuterClass.StartArenaChallengeLevelReq) obj;

      if (getArenaChallengeId()
          != other.getArenaChallengeId()) return false;
      if (getGadgetEntityId()
          != other.getGadgetEntityId()) return false;
      if (getArenaChallengeLevel()
          != other.getArenaChallengeLevel()) return false;
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
      hash = (37 * hash) + ARENA_CHALLENGE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getArenaChallengeId();
      hash = (37 * hash) + GADGET_ENTITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getGadgetEntityId();
      hash = (37 * hash) + ARENA_CHALLENGE_LEVEL_FIELD_NUMBER;
      hash = (53 * hash) + getArenaChallengeLevel();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.grasscutter.proto.StartArenaChallengeLevelReqOuterClass.StartArenaChallengeLevelReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.StartArenaChallengeLevelReqOuterClass.StartArenaChallengeLevelReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.StartArenaChallengeLevelReqOuterClass.StartArenaChallengeLevelReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.StartArenaChallengeLevelReqOuterClass.StartArenaChallengeLevelReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.StartArenaChallengeLevelReqOuterClass.StartArenaChallengeLevelReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.StartArenaChallengeLevelReqOuterClass.StartArenaChallengeLevelReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.StartArenaChallengeLevelReqOuterClass.StartArenaChallengeLevelReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.StartArenaChallengeLevelReqOuterClass.StartArenaChallengeLevelReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.StartArenaChallengeLevelReqOuterClass.StartArenaChallengeLevelReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.StartArenaChallengeLevelReqOuterClass.StartArenaChallengeLevelReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.StartArenaChallengeLevelReqOuterClass.StartArenaChallengeLevelReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.StartArenaChallengeLevelReqOuterClass.StartArenaChallengeLevelReq parseFrom(
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
    public static Builder newBuilder(io.grasscutter.proto.StartArenaChallengeLevelReqOuterClass.StartArenaChallengeLevelReq prototype) {
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
     * CmdId: 2127
     * EnetChannelId: 0
     * EnetIsReliable: true
     * IsAllowClient: true
     * </pre>
     *
     * Protobuf type {@code StartArenaChallengeLevelReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:StartArenaChallengeLevelReq)
        io.grasscutter.proto.StartArenaChallengeLevelReqOuterClass.StartArenaChallengeLevelReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.grasscutter.proto.StartArenaChallengeLevelReqOuterClass.internal_static_StartArenaChallengeLevelReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.grasscutter.proto.StartArenaChallengeLevelReqOuterClass.internal_static_StartArenaChallengeLevelReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.grasscutter.proto.StartArenaChallengeLevelReqOuterClass.StartArenaChallengeLevelReq.class, io.grasscutter.proto.StartArenaChallengeLevelReqOuterClass.StartArenaChallengeLevelReq.Builder.class);
      }

      // Construct using io.grasscutter.proto.StartArenaChallengeLevelReqOuterClass.StartArenaChallengeLevelReq.newBuilder()
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
        arenaChallengeId_ = 0;

        gadgetEntityId_ = 0;

        arenaChallengeLevel_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.grasscutter.proto.StartArenaChallengeLevelReqOuterClass.internal_static_StartArenaChallengeLevelReq_descriptor;
      }

      @java.lang.Override
      public io.grasscutter.proto.StartArenaChallengeLevelReqOuterClass.StartArenaChallengeLevelReq getDefaultInstanceForType() {
        return io.grasscutter.proto.StartArenaChallengeLevelReqOuterClass.StartArenaChallengeLevelReq.getDefaultInstance();
      }

      @java.lang.Override
      public io.grasscutter.proto.StartArenaChallengeLevelReqOuterClass.StartArenaChallengeLevelReq build() {
        io.grasscutter.proto.StartArenaChallengeLevelReqOuterClass.StartArenaChallengeLevelReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.grasscutter.proto.StartArenaChallengeLevelReqOuterClass.StartArenaChallengeLevelReq buildPartial() {
        io.grasscutter.proto.StartArenaChallengeLevelReqOuterClass.StartArenaChallengeLevelReq result = new io.grasscutter.proto.StartArenaChallengeLevelReqOuterClass.StartArenaChallengeLevelReq(this);
        result.arenaChallengeId_ = arenaChallengeId_;
        result.gadgetEntityId_ = gadgetEntityId_;
        result.arenaChallengeLevel_ = arenaChallengeLevel_;
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
        if (other instanceof io.grasscutter.proto.StartArenaChallengeLevelReqOuterClass.StartArenaChallengeLevelReq) {
          return mergeFrom((io.grasscutter.proto.StartArenaChallengeLevelReqOuterClass.StartArenaChallengeLevelReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.grasscutter.proto.StartArenaChallengeLevelReqOuterClass.StartArenaChallengeLevelReq other) {
        if (other == io.grasscutter.proto.StartArenaChallengeLevelReqOuterClass.StartArenaChallengeLevelReq.getDefaultInstance()) return this;
        if (other.getArenaChallengeId() != 0) {
          setArenaChallengeId(other.getArenaChallengeId());
        }
        if (other.getGadgetEntityId() != 0) {
          setGadgetEntityId(other.getGadgetEntityId());
        }
        if (other.getArenaChallengeLevel() != 0) {
          setArenaChallengeLevel(other.getArenaChallengeLevel());
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
        io.grasscutter.proto.StartArenaChallengeLevelReqOuterClass.StartArenaChallengeLevelReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.grasscutter.proto.StartArenaChallengeLevelReqOuterClass.StartArenaChallengeLevelReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int arenaChallengeId_ ;
      /**
       * <code>uint32 arena_challenge_id = 4;</code>
       * @return The arenaChallengeId.
       */
      @java.lang.Override
      public int getArenaChallengeId() {
        return arenaChallengeId_;
      }
      /**
       * <code>uint32 arena_challenge_id = 4;</code>
       * @param value The arenaChallengeId to set.
       * @return This builder for chaining.
       */
      public Builder setArenaChallengeId(int value) {
        
        arenaChallengeId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 arena_challenge_id = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearArenaChallengeId() {
        
        arenaChallengeId_ = 0;
        onChanged();
        return this;
      }

      private int gadgetEntityId_ ;
      /**
       * <code>uint32 gadget_entity_id = 5;</code>
       * @return The gadgetEntityId.
       */
      @java.lang.Override
      public int getGadgetEntityId() {
        return gadgetEntityId_;
      }
      /**
       * <code>uint32 gadget_entity_id = 5;</code>
       * @param value The gadgetEntityId to set.
       * @return This builder for chaining.
       */
      public Builder setGadgetEntityId(int value) {
        
        gadgetEntityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 gadget_entity_id = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearGadgetEntityId() {
        
        gadgetEntityId_ = 0;
        onChanged();
        return this;
      }

      private int arenaChallengeLevel_ ;
      /**
       * <code>uint32 arena_challenge_level = 2;</code>
       * @return The arenaChallengeLevel.
       */
      @java.lang.Override
      public int getArenaChallengeLevel() {
        return arenaChallengeLevel_;
      }
      /**
       * <code>uint32 arena_challenge_level = 2;</code>
       * @param value The arenaChallengeLevel to set.
       * @return This builder for chaining.
       */
      public Builder setArenaChallengeLevel(int value) {
        
        arenaChallengeLevel_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 arena_challenge_level = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearArenaChallengeLevel() {
        
        arenaChallengeLevel_ = 0;
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


      // @@protoc_insertion_point(builder_scope:StartArenaChallengeLevelReq)
    }

    // @@protoc_insertion_point(class_scope:StartArenaChallengeLevelReq)
    private static final io.grasscutter.proto.StartArenaChallengeLevelReqOuterClass.StartArenaChallengeLevelReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.grasscutter.proto.StartArenaChallengeLevelReqOuterClass.StartArenaChallengeLevelReq();
    }

    public static io.grasscutter.proto.StartArenaChallengeLevelReqOuterClass.StartArenaChallengeLevelReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<StartArenaChallengeLevelReq>
        PARSER = new com.google.protobuf.AbstractParser<StartArenaChallengeLevelReq>() {
      @java.lang.Override
      public StartArenaChallengeLevelReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new StartArenaChallengeLevelReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<StartArenaChallengeLevelReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<StartArenaChallengeLevelReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.grasscutter.proto.StartArenaChallengeLevelReqOuterClass.StartArenaChallengeLevelReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_StartArenaChallengeLevelReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_StartArenaChallengeLevelReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!StartArenaChallengeLevelReq.proto\"r\n\033S" +
      "tartArenaChallengeLevelReq\022\032\n\022arena_chal" +
      "lenge_id\030\004 \001(\r\022\030\n\020gadget_entity_id\030\005 \001(\r" +
      "\022\035\n\025arena_challenge_level\030\002 \001(\rB\026\n\024io.gr" +
      "asscutter.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_StartArenaChallengeLevelReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_StartArenaChallengeLevelReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_StartArenaChallengeLevelReq_descriptor,
        new java.lang.String[] { "ArenaChallengeId", "GadgetEntityId", "ArenaChallengeLevel", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
