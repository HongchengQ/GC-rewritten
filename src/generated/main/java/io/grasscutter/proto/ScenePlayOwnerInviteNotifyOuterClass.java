// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ScenePlayOwnerInviteNotify.proto

package io.grasscutter.proto;

public final class ScenePlayOwnerInviteNotifyOuterClass {
  private ScenePlayOwnerInviteNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ScenePlayOwnerInviteNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ScenePlayOwnerInviteNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 invite_cd = 14;</code>
     * @return The inviteCd.
     */
    int getInviteCd();

    /**
     * <code>uint32 play_id = 5;</code>
     * @return The playId.
     */
    int getPlayId();

    /**
     * <code>bool is_remain_reward = 15;</code>
     * @return The isRemainReward.
     */
    boolean getIsRemainReward();
  }
  /**
   * <pre>
   * CmdId: 4371
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code ScenePlayOwnerInviteNotify}
   */
  public static final class ScenePlayOwnerInviteNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ScenePlayOwnerInviteNotify)
      ScenePlayOwnerInviteNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ScenePlayOwnerInviteNotify.newBuilder() to construct.
    private ScenePlayOwnerInviteNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ScenePlayOwnerInviteNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ScenePlayOwnerInviteNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ScenePlayOwnerInviteNotify(
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
            case 40: {

              playId_ = input.readUInt32();
              break;
            }
            case 112: {

              inviteCd_ = input.readUInt32();
              break;
            }
            case 120: {

              isRemainReward_ = input.readBool();
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
      return io.grasscutter.proto.ScenePlayOwnerInviteNotifyOuterClass.internal_static_ScenePlayOwnerInviteNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.proto.ScenePlayOwnerInviteNotifyOuterClass.internal_static_ScenePlayOwnerInviteNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.proto.ScenePlayOwnerInviteNotifyOuterClass.ScenePlayOwnerInviteNotify.class, io.grasscutter.proto.ScenePlayOwnerInviteNotifyOuterClass.ScenePlayOwnerInviteNotify.Builder.class);
    }

    public static final int INVITE_CD_FIELD_NUMBER = 14;
    private int inviteCd_;
    /**
     * <code>uint32 invite_cd = 14;</code>
     * @return The inviteCd.
     */
    @java.lang.Override
    public int getInviteCd() {
      return inviteCd_;
    }

    public static final int PLAY_ID_FIELD_NUMBER = 5;
    private int playId_;
    /**
     * <code>uint32 play_id = 5;</code>
     * @return The playId.
     */
    @java.lang.Override
    public int getPlayId() {
      return playId_;
    }

    public static final int IS_REMAIN_REWARD_FIELD_NUMBER = 15;
    private boolean isRemainReward_;
    /**
     * <code>bool is_remain_reward = 15;</code>
     * @return The isRemainReward.
     */
    @java.lang.Override
    public boolean getIsRemainReward() {
      return isRemainReward_;
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
      if (playId_ != 0) {
        output.writeUInt32(5, playId_);
      }
      if (inviteCd_ != 0) {
        output.writeUInt32(14, inviteCd_);
      }
      if (isRemainReward_ != false) {
        output.writeBool(15, isRemainReward_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (playId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, playId_);
      }
      if (inviteCd_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, inviteCd_);
      }
      if (isRemainReward_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(15, isRemainReward_);
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
      if (!(obj instanceof io.grasscutter.proto.ScenePlayOwnerInviteNotifyOuterClass.ScenePlayOwnerInviteNotify)) {
        return super.equals(obj);
      }
      io.grasscutter.proto.ScenePlayOwnerInviteNotifyOuterClass.ScenePlayOwnerInviteNotify other = (io.grasscutter.proto.ScenePlayOwnerInviteNotifyOuterClass.ScenePlayOwnerInviteNotify) obj;

      if (getInviteCd()
          != other.getInviteCd()) return false;
      if (getPlayId()
          != other.getPlayId()) return false;
      if (getIsRemainReward()
          != other.getIsRemainReward()) return false;
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
      hash = (37 * hash) + INVITE_CD_FIELD_NUMBER;
      hash = (53 * hash) + getInviteCd();
      hash = (37 * hash) + PLAY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getPlayId();
      hash = (37 * hash) + IS_REMAIN_REWARD_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsRemainReward());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.grasscutter.proto.ScenePlayOwnerInviteNotifyOuterClass.ScenePlayOwnerInviteNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.ScenePlayOwnerInviteNotifyOuterClass.ScenePlayOwnerInviteNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.ScenePlayOwnerInviteNotifyOuterClass.ScenePlayOwnerInviteNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.ScenePlayOwnerInviteNotifyOuterClass.ScenePlayOwnerInviteNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.ScenePlayOwnerInviteNotifyOuterClass.ScenePlayOwnerInviteNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.ScenePlayOwnerInviteNotifyOuterClass.ScenePlayOwnerInviteNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.ScenePlayOwnerInviteNotifyOuterClass.ScenePlayOwnerInviteNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.ScenePlayOwnerInviteNotifyOuterClass.ScenePlayOwnerInviteNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.ScenePlayOwnerInviteNotifyOuterClass.ScenePlayOwnerInviteNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.ScenePlayOwnerInviteNotifyOuterClass.ScenePlayOwnerInviteNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.ScenePlayOwnerInviteNotifyOuterClass.ScenePlayOwnerInviteNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.ScenePlayOwnerInviteNotifyOuterClass.ScenePlayOwnerInviteNotify parseFrom(
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
    public static Builder newBuilder(io.grasscutter.proto.ScenePlayOwnerInviteNotifyOuterClass.ScenePlayOwnerInviteNotify prototype) {
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
     * CmdId: 4371
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code ScenePlayOwnerInviteNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ScenePlayOwnerInviteNotify)
        io.grasscutter.proto.ScenePlayOwnerInviteNotifyOuterClass.ScenePlayOwnerInviteNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.grasscutter.proto.ScenePlayOwnerInviteNotifyOuterClass.internal_static_ScenePlayOwnerInviteNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.grasscutter.proto.ScenePlayOwnerInviteNotifyOuterClass.internal_static_ScenePlayOwnerInviteNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.grasscutter.proto.ScenePlayOwnerInviteNotifyOuterClass.ScenePlayOwnerInviteNotify.class, io.grasscutter.proto.ScenePlayOwnerInviteNotifyOuterClass.ScenePlayOwnerInviteNotify.Builder.class);
      }

      // Construct using io.grasscutter.proto.ScenePlayOwnerInviteNotifyOuterClass.ScenePlayOwnerInviteNotify.newBuilder()
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
        inviteCd_ = 0;

        playId_ = 0;

        isRemainReward_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.grasscutter.proto.ScenePlayOwnerInviteNotifyOuterClass.internal_static_ScenePlayOwnerInviteNotify_descriptor;
      }

      @java.lang.Override
      public io.grasscutter.proto.ScenePlayOwnerInviteNotifyOuterClass.ScenePlayOwnerInviteNotify getDefaultInstanceForType() {
        return io.grasscutter.proto.ScenePlayOwnerInviteNotifyOuterClass.ScenePlayOwnerInviteNotify.getDefaultInstance();
      }

      @java.lang.Override
      public io.grasscutter.proto.ScenePlayOwnerInviteNotifyOuterClass.ScenePlayOwnerInviteNotify build() {
        io.grasscutter.proto.ScenePlayOwnerInviteNotifyOuterClass.ScenePlayOwnerInviteNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.grasscutter.proto.ScenePlayOwnerInviteNotifyOuterClass.ScenePlayOwnerInviteNotify buildPartial() {
        io.grasscutter.proto.ScenePlayOwnerInviteNotifyOuterClass.ScenePlayOwnerInviteNotify result = new io.grasscutter.proto.ScenePlayOwnerInviteNotifyOuterClass.ScenePlayOwnerInviteNotify(this);
        result.inviteCd_ = inviteCd_;
        result.playId_ = playId_;
        result.isRemainReward_ = isRemainReward_;
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
        if (other instanceof io.grasscutter.proto.ScenePlayOwnerInviteNotifyOuterClass.ScenePlayOwnerInviteNotify) {
          return mergeFrom((io.grasscutter.proto.ScenePlayOwnerInviteNotifyOuterClass.ScenePlayOwnerInviteNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.grasscutter.proto.ScenePlayOwnerInviteNotifyOuterClass.ScenePlayOwnerInviteNotify other) {
        if (other == io.grasscutter.proto.ScenePlayOwnerInviteNotifyOuterClass.ScenePlayOwnerInviteNotify.getDefaultInstance()) return this;
        if (other.getInviteCd() != 0) {
          setInviteCd(other.getInviteCd());
        }
        if (other.getPlayId() != 0) {
          setPlayId(other.getPlayId());
        }
        if (other.getIsRemainReward() != false) {
          setIsRemainReward(other.getIsRemainReward());
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
        io.grasscutter.proto.ScenePlayOwnerInviteNotifyOuterClass.ScenePlayOwnerInviteNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.grasscutter.proto.ScenePlayOwnerInviteNotifyOuterClass.ScenePlayOwnerInviteNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int inviteCd_ ;
      /**
       * <code>uint32 invite_cd = 14;</code>
       * @return The inviteCd.
       */
      @java.lang.Override
      public int getInviteCd() {
        return inviteCd_;
      }
      /**
       * <code>uint32 invite_cd = 14;</code>
       * @param value The inviteCd to set.
       * @return This builder for chaining.
       */
      public Builder setInviteCd(int value) {
        
        inviteCd_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 invite_cd = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearInviteCd() {
        
        inviteCd_ = 0;
        onChanged();
        return this;
      }

      private int playId_ ;
      /**
       * <code>uint32 play_id = 5;</code>
       * @return The playId.
       */
      @java.lang.Override
      public int getPlayId() {
        return playId_;
      }
      /**
       * <code>uint32 play_id = 5;</code>
       * @param value The playId to set.
       * @return This builder for chaining.
       */
      public Builder setPlayId(int value) {
        
        playId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 play_id = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearPlayId() {
        
        playId_ = 0;
        onChanged();
        return this;
      }

      private boolean isRemainReward_ ;
      /**
       * <code>bool is_remain_reward = 15;</code>
       * @return The isRemainReward.
       */
      @java.lang.Override
      public boolean getIsRemainReward() {
        return isRemainReward_;
      }
      /**
       * <code>bool is_remain_reward = 15;</code>
       * @param value The isRemainReward to set.
       * @return This builder for chaining.
       */
      public Builder setIsRemainReward(boolean value) {
        
        isRemainReward_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_remain_reward = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsRemainReward() {
        
        isRemainReward_ = false;
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


      // @@protoc_insertion_point(builder_scope:ScenePlayOwnerInviteNotify)
    }

    // @@protoc_insertion_point(class_scope:ScenePlayOwnerInviteNotify)
    private static final io.grasscutter.proto.ScenePlayOwnerInviteNotifyOuterClass.ScenePlayOwnerInviteNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.grasscutter.proto.ScenePlayOwnerInviteNotifyOuterClass.ScenePlayOwnerInviteNotify();
    }

    public static io.grasscutter.proto.ScenePlayOwnerInviteNotifyOuterClass.ScenePlayOwnerInviteNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ScenePlayOwnerInviteNotify>
        PARSER = new com.google.protobuf.AbstractParser<ScenePlayOwnerInviteNotify>() {
      @java.lang.Override
      public ScenePlayOwnerInviteNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ScenePlayOwnerInviteNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ScenePlayOwnerInviteNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ScenePlayOwnerInviteNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.grasscutter.proto.ScenePlayOwnerInviteNotifyOuterClass.ScenePlayOwnerInviteNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ScenePlayOwnerInviteNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ScenePlayOwnerInviteNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n ScenePlayOwnerInviteNotify.proto\"Z\n\032Sc" +
      "enePlayOwnerInviteNotify\022\021\n\tinvite_cd\030\016 " +
      "\001(\r\022\017\n\007play_id\030\005 \001(\r\022\030\n\020is_remain_reward" +
      "\030\017 \001(\010B\026\n\024io.grasscutter.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ScenePlayOwnerInviteNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ScenePlayOwnerInviteNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ScenePlayOwnerInviteNotify_descriptor,
        new java.lang.String[] { "InviteCd", "PlayId", "IsRemainReward", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
