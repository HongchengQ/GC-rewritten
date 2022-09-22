// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GrantRewardNotify.proto

package io.grasscutter.proto;

public final class GrantRewardNotifyOuterClass {
  private GrantRewardNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GrantRewardNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GrantRewardNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.Reward reward = 6;</code>
     * @return Whether the reward field is set.
     */
    boolean hasReward();
    /**
     * <code>.Reward reward = 6;</code>
     * @return The reward.
     */
    io.grasscutter.proto.RewardOuterClass.Reward getReward();
    /**
     * <code>.Reward reward = 6;</code>
     */
    io.grasscutter.proto.RewardOuterClass.RewardOrBuilder getRewardOrBuilder();
  }
  /**
   * <pre>
   * CmdId: 663
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code GrantRewardNotify}
   */
  public static final class GrantRewardNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GrantRewardNotify)
      GrantRewardNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GrantRewardNotify.newBuilder() to construct.
    private GrantRewardNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GrantRewardNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GrantRewardNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GrantRewardNotify(
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
            case 50: {
              io.grasscutter.proto.RewardOuterClass.Reward.Builder subBuilder = null;
              if (reward_ != null) {
                subBuilder = reward_.toBuilder();
              }
              reward_ = input.readMessage(io.grasscutter.proto.RewardOuterClass.Reward.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(reward_);
                reward_ = subBuilder.buildPartial();
              }

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
      return io.grasscutter.proto.GrantRewardNotifyOuterClass.internal_static_GrantRewardNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.proto.GrantRewardNotifyOuterClass.internal_static_GrantRewardNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.proto.GrantRewardNotifyOuterClass.GrantRewardNotify.class, io.grasscutter.proto.GrantRewardNotifyOuterClass.GrantRewardNotify.Builder.class);
    }

    public static final int REWARD_FIELD_NUMBER = 6;
    private io.grasscutter.proto.RewardOuterClass.Reward reward_;
    /**
     * <code>.Reward reward = 6;</code>
     * @return Whether the reward field is set.
     */
    @java.lang.Override
    public boolean hasReward() {
      return reward_ != null;
    }
    /**
     * <code>.Reward reward = 6;</code>
     * @return The reward.
     */
    @java.lang.Override
    public io.grasscutter.proto.RewardOuterClass.Reward getReward() {
      return reward_ == null ? io.grasscutter.proto.RewardOuterClass.Reward.getDefaultInstance() : reward_;
    }
    /**
     * <code>.Reward reward = 6;</code>
     */
    @java.lang.Override
    public io.grasscutter.proto.RewardOuterClass.RewardOrBuilder getRewardOrBuilder() {
      return getReward();
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
      if (reward_ != null) {
        output.writeMessage(6, getReward());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (reward_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(6, getReward());
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
      if (!(obj instanceof io.grasscutter.proto.GrantRewardNotifyOuterClass.GrantRewardNotify)) {
        return super.equals(obj);
      }
      io.grasscutter.proto.GrantRewardNotifyOuterClass.GrantRewardNotify other = (io.grasscutter.proto.GrantRewardNotifyOuterClass.GrantRewardNotify) obj;

      if (hasReward() != other.hasReward()) return false;
      if (hasReward()) {
        if (!getReward()
            .equals(other.getReward())) return false;
      }
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
      if (hasReward()) {
        hash = (37 * hash) + REWARD_FIELD_NUMBER;
        hash = (53 * hash) + getReward().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.grasscutter.proto.GrantRewardNotifyOuterClass.GrantRewardNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.GrantRewardNotifyOuterClass.GrantRewardNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.GrantRewardNotifyOuterClass.GrantRewardNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.GrantRewardNotifyOuterClass.GrantRewardNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.GrantRewardNotifyOuterClass.GrantRewardNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.GrantRewardNotifyOuterClass.GrantRewardNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.GrantRewardNotifyOuterClass.GrantRewardNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.GrantRewardNotifyOuterClass.GrantRewardNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.GrantRewardNotifyOuterClass.GrantRewardNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.GrantRewardNotifyOuterClass.GrantRewardNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.GrantRewardNotifyOuterClass.GrantRewardNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.GrantRewardNotifyOuterClass.GrantRewardNotify parseFrom(
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
    public static Builder newBuilder(io.grasscutter.proto.GrantRewardNotifyOuterClass.GrantRewardNotify prototype) {
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
     * CmdId: 663
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code GrantRewardNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GrantRewardNotify)
        io.grasscutter.proto.GrantRewardNotifyOuterClass.GrantRewardNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.grasscutter.proto.GrantRewardNotifyOuterClass.internal_static_GrantRewardNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.grasscutter.proto.GrantRewardNotifyOuterClass.internal_static_GrantRewardNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.grasscutter.proto.GrantRewardNotifyOuterClass.GrantRewardNotify.class, io.grasscutter.proto.GrantRewardNotifyOuterClass.GrantRewardNotify.Builder.class);
      }

      // Construct using io.grasscutter.proto.GrantRewardNotifyOuterClass.GrantRewardNotify.newBuilder()
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
        if (rewardBuilder_ == null) {
          reward_ = null;
        } else {
          reward_ = null;
          rewardBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.grasscutter.proto.GrantRewardNotifyOuterClass.internal_static_GrantRewardNotify_descriptor;
      }

      @java.lang.Override
      public io.grasscutter.proto.GrantRewardNotifyOuterClass.GrantRewardNotify getDefaultInstanceForType() {
        return io.grasscutter.proto.GrantRewardNotifyOuterClass.GrantRewardNotify.getDefaultInstance();
      }

      @java.lang.Override
      public io.grasscutter.proto.GrantRewardNotifyOuterClass.GrantRewardNotify build() {
        io.grasscutter.proto.GrantRewardNotifyOuterClass.GrantRewardNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.grasscutter.proto.GrantRewardNotifyOuterClass.GrantRewardNotify buildPartial() {
        io.grasscutter.proto.GrantRewardNotifyOuterClass.GrantRewardNotify result = new io.grasscutter.proto.GrantRewardNotifyOuterClass.GrantRewardNotify(this);
        if (rewardBuilder_ == null) {
          result.reward_ = reward_;
        } else {
          result.reward_ = rewardBuilder_.build();
        }
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
        if (other instanceof io.grasscutter.proto.GrantRewardNotifyOuterClass.GrantRewardNotify) {
          return mergeFrom((io.grasscutter.proto.GrantRewardNotifyOuterClass.GrantRewardNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.grasscutter.proto.GrantRewardNotifyOuterClass.GrantRewardNotify other) {
        if (other == io.grasscutter.proto.GrantRewardNotifyOuterClass.GrantRewardNotify.getDefaultInstance()) return this;
        if (other.hasReward()) {
          mergeReward(other.getReward());
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
        io.grasscutter.proto.GrantRewardNotifyOuterClass.GrantRewardNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.grasscutter.proto.GrantRewardNotifyOuterClass.GrantRewardNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private io.grasscutter.proto.RewardOuterClass.Reward reward_;
      private com.google.protobuf.SingleFieldBuilderV3<
          io.grasscutter.proto.RewardOuterClass.Reward, io.grasscutter.proto.RewardOuterClass.Reward.Builder, io.grasscutter.proto.RewardOuterClass.RewardOrBuilder> rewardBuilder_;
      /**
       * <code>.Reward reward = 6;</code>
       * @return Whether the reward field is set.
       */
      public boolean hasReward() {
        return rewardBuilder_ != null || reward_ != null;
      }
      /**
       * <code>.Reward reward = 6;</code>
       * @return The reward.
       */
      public io.grasscutter.proto.RewardOuterClass.Reward getReward() {
        if (rewardBuilder_ == null) {
          return reward_ == null ? io.grasscutter.proto.RewardOuterClass.Reward.getDefaultInstance() : reward_;
        } else {
          return rewardBuilder_.getMessage();
        }
      }
      /**
       * <code>.Reward reward = 6;</code>
       */
      public Builder setReward(io.grasscutter.proto.RewardOuterClass.Reward value) {
        if (rewardBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          reward_ = value;
          onChanged();
        } else {
          rewardBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.Reward reward = 6;</code>
       */
      public Builder setReward(
          io.grasscutter.proto.RewardOuterClass.Reward.Builder builderForValue) {
        if (rewardBuilder_ == null) {
          reward_ = builderForValue.build();
          onChanged();
        } else {
          rewardBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.Reward reward = 6;</code>
       */
      public Builder mergeReward(io.grasscutter.proto.RewardOuterClass.Reward value) {
        if (rewardBuilder_ == null) {
          if (reward_ != null) {
            reward_ =
              io.grasscutter.proto.RewardOuterClass.Reward.newBuilder(reward_).mergeFrom(value).buildPartial();
          } else {
            reward_ = value;
          }
          onChanged();
        } else {
          rewardBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.Reward reward = 6;</code>
       */
      public Builder clearReward() {
        if (rewardBuilder_ == null) {
          reward_ = null;
          onChanged();
        } else {
          reward_ = null;
          rewardBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.Reward reward = 6;</code>
       */
      public io.grasscutter.proto.RewardOuterClass.Reward.Builder getRewardBuilder() {
        
        onChanged();
        return getRewardFieldBuilder().getBuilder();
      }
      /**
       * <code>.Reward reward = 6;</code>
       */
      public io.grasscutter.proto.RewardOuterClass.RewardOrBuilder getRewardOrBuilder() {
        if (rewardBuilder_ != null) {
          return rewardBuilder_.getMessageOrBuilder();
        } else {
          return reward_ == null ?
              io.grasscutter.proto.RewardOuterClass.Reward.getDefaultInstance() : reward_;
        }
      }
      /**
       * <code>.Reward reward = 6;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          io.grasscutter.proto.RewardOuterClass.Reward, io.grasscutter.proto.RewardOuterClass.Reward.Builder, io.grasscutter.proto.RewardOuterClass.RewardOrBuilder> 
          getRewardFieldBuilder() {
        if (rewardBuilder_ == null) {
          rewardBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              io.grasscutter.proto.RewardOuterClass.Reward, io.grasscutter.proto.RewardOuterClass.Reward.Builder, io.grasscutter.proto.RewardOuterClass.RewardOrBuilder>(
                  getReward(),
                  getParentForChildren(),
                  isClean());
          reward_ = null;
        }
        return rewardBuilder_;
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


      // @@protoc_insertion_point(builder_scope:GrantRewardNotify)
    }

    // @@protoc_insertion_point(class_scope:GrantRewardNotify)
    private static final io.grasscutter.proto.GrantRewardNotifyOuterClass.GrantRewardNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.grasscutter.proto.GrantRewardNotifyOuterClass.GrantRewardNotify();
    }

    public static io.grasscutter.proto.GrantRewardNotifyOuterClass.GrantRewardNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GrantRewardNotify>
        PARSER = new com.google.protobuf.AbstractParser<GrantRewardNotify>() {
      @java.lang.Override
      public GrantRewardNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GrantRewardNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GrantRewardNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GrantRewardNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.grasscutter.proto.GrantRewardNotifyOuterClass.GrantRewardNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GrantRewardNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GrantRewardNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027GrantRewardNotify.proto\032\014Reward.proto\"" +
      ",\n\021GrantRewardNotify\022\027\n\006reward\030\006 \001(\0132\007.R" +
      "ewardB\026\n\024io.grasscutter.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.grasscutter.proto.RewardOuterClass.getDescriptor(),
        });
    internal_static_GrantRewardNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GrantRewardNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GrantRewardNotify_descriptor,
        new java.lang.String[] { "Reward", });
    io.grasscutter.proto.RewardOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
