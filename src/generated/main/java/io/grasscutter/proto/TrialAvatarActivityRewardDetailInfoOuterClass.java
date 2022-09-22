// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TrialAvatarActivityRewardDetailInfo.proto

package io.grasscutter.proto;

public final class TrialAvatarActivityRewardDetailInfoOuterClass {
  private TrialAvatarActivityRewardDetailInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface TrialAvatarActivityRewardDetailInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:TrialAvatarActivityRewardDetailInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool passed_dungeon = 2;</code>
     * @return The passedDungeon.
     */
    boolean getPassedDungeon();

    /**
     * <code>uint32 trial_avatar_index_id = 4;</code>
     * @return The trialAvatarIndexId.
     */
    int getTrialAvatarIndexId();

    /**
     * <code>bool received_reward = 5;</code>
     * @return The receivedReward.
     */
    boolean getReceivedReward();

    /**
     * <code>uint32 reward_id = 7;</code>
     * @return The rewardId.
     */
    int getRewardId();
  }
  /**
   * Protobuf type {@code TrialAvatarActivityRewardDetailInfo}
   */
  public static final class TrialAvatarActivityRewardDetailInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:TrialAvatarActivityRewardDetailInfo)
      TrialAvatarActivityRewardDetailInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use TrialAvatarActivityRewardDetailInfo.newBuilder() to construct.
    private TrialAvatarActivityRewardDetailInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private TrialAvatarActivityRewardDetailInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new TrialAvatarActivityRewardDetailInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private TrialAvatarActivityRewardDetailInfo(
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

              passedDungeon_ = input.readBool();
              break;
            }
            case 32: {

              trialAvatarIndexId_ = input.readUInt32();
              break;
            }
            case 40: {

              receivedReward_ = input.readBool();
              break;
            }
            case 56: {

              rewardId_ = input.readUInt32();
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
      return io.grasscutter.proto.TrialAvatarActivityRewardDetailInfoOuterClass.internal_static_TrialAvatarActivityRewardDetailInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.proto.TrialAvatarActivityRewardDetailInfoOuterClass.internal_static_TrialAvatarActivityRewardDetailInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.proto.TrialAvatarActivityRewardDetailInfoOuterClass.TrialAvatarActivityRewardDetailInfo.class, io.grasscutter.proto.TrialAvatarActivityRewardDetailInfoOuterClass.TrialAvatarActivityRewardDetailInfo.Builder.class);
    }

    public static final int PASSED_DUNGEON_FIELD_NUMBER = 2;
    private boolean passedDungeon_;
    /**
     * <code>bool passed_dungeon = 2;</code>
     * @return The passedDungeon.
     */
    @java.lang.Override
    public boolean getPassedDungeon() {
      return passedDungeon_;
    }

    public static final int TRIAL_AVATAR_INDEX_ID_FIELD_NUMBER = 4;
    private int trialAvatarIndexId_;
    /**
     * <code>uint32 trial_avatar_index_id = 4;</code>
     * @return The trialAvatarIndexId.
     */
    @java.lang.Override
    public int getTrialAvatarIndexId() {
      return trialAvatarIndexId_;
    }

    public static final int RECEIVED_REWARD_FIELD_NUMBER = 5;
    private boolean receivedReward_;
    /**
     * <code>bool received_reward = 5;</code>
     * @return The receivedReward.
     */
    @java.lang.Override
    public boolean getReceivedReward() {
      return receivedReward_;
    }

    public static final int REWARD_ID_FIELD_NUMBER = 7;
    private int rewardId_;
    /**
     * <code>uint32 reward_id = 7;</code>
     * @return The rewardId.
     */
    @java.lang.Override
    public int getRewardId() {
      return rewardId_;
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
      if (passedDungeon_ != false) {
        output.writeBool(2, passedDungeon_);
      }
      if (trialAvatarIndexId_ != 0) {
        output.writeUInt32(4, trialAvatarIndexId_);
      }
      if (receivedReward_ != false) {
        output.writeBool(5, receivedReward_);
      }
      if (rewardId_ != 0) {
        output.writeUInt32(7, rewardId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (passedDungeon_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(2, passedDungeon_);
      }
      if (trialAvatarIndexId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, trialAvatarIndexId_);
      }
      if (receivedReward_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(5, receivedReward_);
      }
      if (rewardId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, rewardId_);
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
      if (!(obj instanceof io.grasscutter.proto.TrialAvatarActivityRewardDetailInfoOuterClass.TrialAvatarActivityRewardDetailInfo)) {
        return super.equals(obj);
      }
      io.grasscutter.proto.TrialAvatarActivityRewardDetailInfoOuterClass.TrialAvatarActivityRewardDetailInfo other = (io.grasscutter.proto.TrialAvatarActivityRewardDetailInfoOuterClass.TrialAvatarActivityRewardDetailInfo) obj;

      if (getPassedDungeon()
          != other.getPassedDungeon()) return false;
      if (getTrialAvatarIndexId()
          != other.getTrialAvatarIndexId()) return false;
      if (getReceivedReward()
          != other.getReceivedReward()) return false;
      if (getRewardId()
          != other.getRewardId()) return false;
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
      hash = (37 * hash) + PASSED_DUNGEON_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getPassedDungeon());
      hash = (37 * hash) + TRIAL_AVATAR_INDEX_ID_FIELD_NUMBER;
      hash = (53 * hash) + getTrialAvatarIndexId();
      hash = (37 * hash) + RECEIVED_REWARD_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getReceivedReward());
      hash = (37 * hash) + REWARD_ID_FIELD_NUMBER;
      hash = (53 * hash) + getRewardId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.grasscutter.proto.TrialAvatarActivityRewardDetailInfoOuterClass.TrialAvatarActivityRewardDetailInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.TrialAvatarActivityRewardDetailInfoOuterClass.TrialAvatarActivityRewardDetailInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.TrialAvatarActivityRewardDetailInfoOuterClass.TrialAvatarActivityRewardDetailInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.TrialAvatarActivityRewardDetailInfoOuterClass.TrialAvatarActivityRewardDetailInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.TrialAvatarActivityRewardDetailInfoOuterClass.TrialAvatarActivityRewardDetailInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.TrialAvatarActivityRewardDetailInfoOuterClass.TrialAvatarActivityRewardDetailInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.TrialAvatarActivityRewardDetailInfoOuterClass.TrialAvatarActivityRewardDetailInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.TrialAvatarActivityRewardDetailInfoOuterClass.TrialAvatarActivityRewardDetailInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.TrialAvatarActivityRewardDetailInfoOuterClass.TrialAvatarActivityRewardDetailInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.TrialAvatarActivityRewardDetailInfoOuterClass.TrialAvatarActivityRewardDetailInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.TrialAvatarActivityRewardDetailInfoOuterClass.TrialAvatarActivityRewardDetailInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.TrialAvatarActivityRewardDetailInfoOuterClass.TrialAvatarActivityRewardDetailInfo parseFrom(
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
    public static Builder newBuilder(io.grasscutter.proto.TrialAvatarActivityRewardDetailInfoOuterClass.TrialAvatarActivityRewardDetailInfo prototype) {
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
     * Protobuf type {@code TrialAvatarActivityRewardDetailInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:TrialAvatarActivityRewardDetailInfo)
        io.grasscutter.proto.TrialAvatarActivityRewardDetailInfoOuterClass.TrialAvatarActivityRewardDetailInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.grasscutter.proto.TrialAvatarActivityRewardDetailInfoOuterClass.internal_static_TrialAvatarActivityRewardDetailInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.grasscutter.proto.TrialAvatarActivityRewardDetailInfoOuterClass.internal_static_TrialAvatarActivityRewardDetailInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.grasscutter.proto.TrialAvatarActivityRewardDetailInfoOuterClass.TrialAvatarActivityRewardDetailInfo.class, io.grasscutter.proto.TrialAvatarActivityRewardDetailInfoOuterClass.TrialAvatarActivityRewardDetailInfo.Builder.class);
      }

      // Construct using io.grasscutter.proto.TrialAvatarActivityRewardDetailInfoOuterClass.TrialAvatarActivityRewardDetailInfo.newBuilder()
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
        passedDungeon_ = false;

        trialAvatarIndexId_ = 0;

        receivedReward_ = false;

        rewardId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.grasscutter.proto.TrialAvatarActivityRewardDetailInfoOuterClass.internal_static_TrialAvatarActivityRewardDetailInfo_descriptor;
      }

      @java.lang.Override
      public io.grasscutter.proto.TrialAvatarActivityRewardDetailInfoOuterClass.TrialAvatarActivityRewardDetailInfo getDefaultInstanceForType() {
        return io.grasscutter.proto.TrialAvatarActivityRewardDetailInfoOuterClass.TrialAvatarActivityRewardDetailInfo.getDefaultInstance();
      }

      @java.lang.Override
      public io.grasscutter.proto.TrialAvatarActivityRewardDetailInfoOuterClass.TrialAvatarActivityRewardDetailInfo build() {
        io.grasscutter.proto.TrialAvatarActivityRewardDetailInfoOuterClass.TrialAvatarActivityRewardDetailInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.grasscutter.proto.TrialAvatarActivityRewardDetailInfoOuterClass.TrialAvatarActivityRewardDetailInfo buildPartial() {
        io.grasscutter.proto.TrialAvatarActivityRewardDetailInfoOuterClass.TrialAvatarActivityRewardDetailInfo result = new io.grasscutter.proto.TrialAvatarActivityRewardDetailInfoOuterClass.TrialAvatarActivityRewardDetailInfo(this);
        result.passedDungeon_ = passedDungeon_;
        result.trialAvatarIndexId_ = trialAvatarIndexId_;
        result.receivedReward_ = receivedReward_;
        result.rewardId_ = rewardId_;
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
        if (other instanceof io.grasscutter.proto.TrialAvatarActivityRewardDetailInfoOuterClass.TrialAvatarActivityRewardDetailInfo) {
          return mergeFrom((io.grasscutter.proto.TrialAvatarActivityRewardDetailInfoOuterClass.TrialAvatarActivityRewardDetailInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.grasscutter.proto.TrialAvatarActivityRewardDetailInfoOuterClass.TrialAvatarActivityRewardDetailInfo other) {
        if (other == io.grasscutter.proto.TrialAvatarActivityRewardDetailInfoOuterClass.TrialAvatarActivityRewardDetailInfo.getDefaultInstance()) return this;
        if (other.getPassedDungeon() != false) {
          setPassedDungeon(other.getPassedDungeon());
        }
        if (other.getTrialAvatarIndexId() != 0) {
          setTrialAvatarIndexId(other.getTrialAvatarIndexId());
        }
        if (other.getReceivedReward() != false) {
          setReceivedReward(other.getReceivedReward());
        }
        if (other.getRewardId() != 0) {
          setRewardId(other.getRewardId());
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
        io.grasscutter.proto.TrialAvatarActivityRewardDetailInfoOuterClass.TrialAvatarActivityRewardDetailInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.grasscutter.proto.TrialAvatarActivityRewardDetailInfoOuterClass.TrialAvatarActivityRewardDetailInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private boolean passedDungeon_ ;
      /**
       * <code>bool passed_dungeon = 2;</code>
       * @return The passedDungeon.
       */
      @java.lang.Override
      public boolean getPassedDungeon() {
        return passedDungeon_;
      }
      /**
       * <code>bool passed_dungeon = 2;</code>
       * @param value The passedDungeon to set.
       * @return This builder for chaining.
       */
      public Builder setPassedDungeon(boolean value) {
        
        passedDungeon_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool passed_dungeon = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearPassedDungeon() {
        
        passedDungeon_ = false;
        onChanged();
        return this;
      }

      private int trialAvatarIndexId_ ;
      /**
       * <code>uint32 trial_avatar_index_id = 4;</code>
       * @return The trialAvatarIndexId.
       */
      @java.lang.Override
      public int getTrialAvatarIndexId() {
        return trialAvatarIndexId_;
      }
      /**
       * <code>uint32 trial_avatar_index_id = 4;</code>
       * @param value The trialAvatarIndexId to set.
       * @return This builder for chaining.
       */
      public Builder setTrialAvatarIndexId(int value) {
        
        trialAvatarIndexId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 trial_avatar_index_id = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearTrialAvatarIndexId() {
        
        trialAvatarIndexId_ = 0;
        onChanged();
        return this;
      }

      private boolean receivedReward_ ;
      /**
       * <code>bool received_reward = 5;</code>
       * @return The receivedReward.
       */
      @java.lang.Override
      public boolean getReceivedReward() {
        return receivedReward_;
      }
      /**
       * <code>bool received_reward = 5;</code>
       * @param value The receivedReward to set.
       * @return This builder for chaining.
       */
      public Builder setReceivedReward(boolean value) {
        
        receivedReward_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool received_reward = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearReceivedReward() {
        
        receivedReward_ = false;
        onChanged();
        return this;
      }

      private int rewardId_ ;
      /**
       * <code>uint32 reward_id = 7;</code>
       * @return The rewardId.
       */
      @java.lang.Override
      public int getRewardId() {
        return rewardId_;
      }
      /**
       * <code>uint32 reward_id = 7;</code>
       * @param value The rewardId to set.
       * @return This builder for chaining.
       */
      public Builder setRewardId(int value) {
        
        rewardId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 reward_id = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearRewardId() {
        
        rewardId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:TrialAvatarActivityRewardDetailInfo)
    }

    // @@protoc_insertion_point(class_scope:TrialAvatarActivityRewardDetailInfo)
    private static final io.grasscutter.proto.TrialAvatarActivityRewardDetailInfoOuterClass.TrialAvatarActivityRewardDetailInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.grasscutter.proto.TrialAvatarActivityRewardDetailInfoOuterClass.TrialAvatarActivityRewardDetailInfo();
    }

    public static io.grasscutter.proto.TrialAvatarActivityRewardDetailInfoOuterClass.TrialAvatarActivityRewardDetailInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<TrialAvatarActivityRewardDetailInfo>
        PARSER = new com.google.protobuf.AbstractParser<TrialAvatarActivityRewardDetailInfo>() {
      @java.lang.Override
      public TrialAvatarActivityRewardDetailInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new TrialAvatarActivityRewardDetailInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<TrialAvatarActivityRewardDetailInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<TrialAvatarActivityRewardDetailInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.grasscutter.proto.TrialAvatarActivityRewardDetailInfoOuterClass.TrialAvatarActivityRewardDetailInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TrialAvatarActivityRewardDetailInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TrialAvatarActivityRewardDetailInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n)TrialAvatarActivityRewardDetailInfo.pr" +
      "oto\"\210\001\n#TrialAvatarActivityRewardDetailI" +
      "nfo\022\026\n\016passed_dungeon\030\002 \001(\010\022\035\n\025trial_ava" +
      "tar_index_id\030\004 \001(\r\022\027\n\017received_reward\030\005 " +
      "\001(\010\022\021\n\treward_id\030\007 \001(\rB\026\n\024io.grasscutter" +
      ".protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_TrialAvatarActivityRewardDetailInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_TrialAvatarActivityRewardDetailInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TrialAvatarActivityRewardDetailInfo_descriptor,
        new java.lang.String[] { "PassedDungeon", "TrialAvatarIndexId", "ReceivedReward", "RewardId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
