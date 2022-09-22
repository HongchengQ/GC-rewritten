// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PlayerChatNotify.proto

package io.grasscutter.proto;

public final class PlayerChatNotifyOuterClass {
  private PlayerChatNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PlayerChatNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PlayerChatNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.ChatInfo chat_info = 3;</code>
     * @return Whether the chatInfo field is set.
     */
    boolean hasChatInfo();
    /**
     * <code>.ChatInfo chat_info = 3;</code>
     * @return The chatInfo.
     */
    io.grasscutter.proto.ChatInfoOuterClass.ChatInfo getChatInfo();
    /**
     * <code>.ChatInfo chat_info = 3;</code>
     */
    io.grasscutter.proto.ChatInfoOuterClass.ChatInfoOrBuilder getChatInfoOrBuilder();

    /**
     * <code>uint32 channel_id = 6;</code>
     * @return The channelId.
     */
    int getChannelId();
  }
  /**
   * <pre>
   * CmdId: 3010
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code PlayerChatNotify}
   */
  public static final class PlayerChatNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:PlayerChatNotify)
      PlayerChatNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PlayerChatNotify.newBuilder() to construct.
    private PlayerChatNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PlayerChatNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PlayerChatNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private PlayerChatNotify(
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
            case 26: {
              io.grasscutter.proto.ChatInfoOuterClass.ChatInfo.Builder subBuilder = null;
              if (chatInfo_ != null) {
                subBuilder = chatInfo_.toBuilder();
              }
              chatInfo_ = input.readMessage(io.grasscutter.proto.ChatInfoOuterClass.ChatInfo.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(chatInfo_);
                chatInfo_ = subBuilder.buildPartial();
              }

              break;
            }
            case 48: {

              channelId_ = input.readUInt32();
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
      return io.grasscutter.proto.PlayerChatNotifyOuterClass.internal_static_PlayerChatNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.proto.PlayerChatNotifyOuterClass.internal_static_PlayerChatNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.proto.PlayerChatNotifyOuterClass.PlayerChatNotify.class, io.grasscutter.proto.PlayerChatNotifyOuterClass.PlayerChatNotify.Builder.class);
    }

    public static final int CHAT_INFO_FIELD_NUMBER = 3;
    private io.grasscutter.proto.ChatInfoOuterClass.ChatInfo chatInfo_;
    /**
     * <code>.ChatInfo chat_info = 3;</code>
     * @return Whether the chatInfo field is set.
     */
    @java.lang.Override
    public boolean hasChatInfo() {
      return chatInfo_ != null;
    }
    /**
     * <code>.ChatInfo chat_info = 3;</code>
     * @return The chatInfo.
     */
    @java.lang.Override
    public io.grasscutter.proto.ChatInfoOuterClass.ChatInfo getChatInfo() {
      return chatInfo_ == null ? io.grasscutter.proto.ChatInfoOuterClass.ChatInfo.getDefaultInstance() : chatInfo_;
    }
    /**
     * <code>.ChatInfo chat_info = 3;</code>
     */
    @java.lang.Override
    public io.grasscutter.proto.ChatInfoOuterClass.ChatInfoOrBuilder getChatInfoOrBuilder() {
      return getChatInfo();
    }

    public static final int CHANNEL_ID_FIELD_NUMBER = 6;
    private int channelId_;
    /**
     * <code>uint32 channel_id = 6;</code>
     * @return The channelId.
     */
    @java.lang.Override
    public int getChannelId() {
      return channelId_;
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
      if (chatInfo_ != null) {
        output.writeMessage(3, getChatInfo());
      }
      if (channelId_ != 0) {
        output.writeUInt32(6, channelId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (chatInfo_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, getChatInfo());
      }
      if (channelId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, channelId_);
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
      if (!(obj instanceof io.grasscutter.proto.PlayerChatNotifyOuterClass.PlayerChatNotify)) {
        return super.equals(obj);
      }
      io.grasscutter.proto.PlayerChatNotifyOuterClass.PlayerChatNotify other = (io.grasscutter.proto.PlayerChatNotifyOuterClass.PlayerChatNotify) obj;

      if (hasChatInfo() != other.hasChatInfo()) return false;
      if (hasChatInfo()) {
        if (!getChatInfo()
            .equals(other.getChatInfo())) return false;
      }
      if (getChannelId()
          != other.getChannelId()) return false;
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
      if (hasChatInfo()) {
        hash = (37 * hash) + CHAT_INFO_FIELD_NUMBER;
        hash = (53 * hash) + getChatInfo().hashCode();
      }
      hash = (37 * hash) + CHANNEL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getChannelId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.grasscutter.proto.PlayerChatNotifyOuterClass.PlayerChatNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.PlayerChatNotifyOuterClass.PlayerChatNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.PlayerChatNotifyOuterClass.PlayerChatNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.PlayerChatNotifyOuterClass.PlayerChatNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.PlayerChatNotifyOuterClass.PlayerChatNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.PlayerChatNotifyOuterClass.PlayerChatNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.PlayerChatNotifyOuterClass.PlayerChatNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.PlayerChatNotifyOuterClass.PlayerChatNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.PlayerChatNotifyOuterClass.PlayerChatNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.PlayerChatNotifyOuterClass.PlayerChatNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.PlayerChatNotifyOuterClass.PlayerChatNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.PlayerChatNotifyOuterClass.PlayerChatNotify parseFrom(
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
    public static Builder newBuilder(io.grasscutter.proto.PlayerChatNotifyOuterClass.PlayerChatNotify prototype) {
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
     * CmdId: 3010
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code PlayerChatNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PlayerChatNotify)
        io.grasscutter.proto.PlayerChatNotifyOuterClass.PlayerChatNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.grasscutter.proto.PlayerChatNotifyOuterClass.internal_static_PlayerChatNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.grasscutter.proto.PlayerChatNotifyOuterClass.internal_static_PlayerChatNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.grasscutter.proto.PlayerChatNotifyOuterClass.PlayerChatNotify.class, io.grasscutter.proto.PlayerChatNotifyOuterClass.PlayerChatNotify.Builder.class);
      }

      // Construct using io.grasscutter.proto.PlayerChatNotifyOuterClass.PlayerChatNotify.newBuilder()
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
        if (chatInfoBuilder_ == null) {
          chatInfo_ = null;
        } else {
          chatInfo_ = null;
          chatInfoBuilder_ = null;
        }
        channelId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.grasscutter.proto.PlayerChatNotifyOuterClass.internal_static_PlayerChatNotify_descriptor;
      }

      @java.lang.Override
      public io.grasscutter.proto.PlayerChatNotifyOuterClass.PlayerChatNotify getDefaultInstanceForType() {
        return io.grasscutter.proto.PlayerChatNotifyOuterClass.PlayerChatNotify.getDefaultInstance();
      }

      @java.lang.Override
      public io.grasscutter.proto.PlayerChatNotifyOuterClass.PlayerChatNotify build() {
        io.grasscutter.proto.PlayerChatNotifyOuterClass.PlayerChatNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.grasscutter.proto.PlayerChatNotifyOuterClass.PlayerChatNotify buildPartial() {
        io.grasscutter.proto.PlayerChatNotifyOuterClass.PlayerChatNotify result = new io.grasscutter.proto.PlayerChatNotifyOuterClass.PlayerChatNotify(this);
        if (chatInfoBuilder_ == null) {
          result.chatInfo_ = chatInfo_;
        } else {
          result.chatInfo_ = chatInfoBuilder_.build();
        }
        result.channelId_ = channelId_;
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
        if (other instanceof io.grasscutter.proto.PlayerChatNotifyOuterClass.PlayerChatNotify) {
          return mergeFrom((io.grasscutter.proto.PlayerChatNotifyOuterClass.PlayerChatNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.grasscutter.proto.PlayerChatNotifyOuterClass.PlayerChatNotify other) {
        if (other == io.grasscutter.proto.PlayerChatNotifyOuterClass.PlayerChatNotify.getDefaultInstance()) return this;
        if (other.hasChatInfo()) {
          mergeChatInfo(other.getChatInfo());
        }
        if (other.getChannelId() != 0) {
          setChannelId(other.getChannelId());
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
        io.grasscutter.proto.PlayerChatNotifyOuterClass.PlayerChatNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.grasscutter.proto.PlayerChatNotifyOuterClass.PlayerChatNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private io.grasscutter.proto.ChatInfoOuterClass.ChatInfo chatInfo_;
      private com.google.protobuf.SingleFieldBuilderV3<
          io.grasscutter.proto.ChatInfoOuterClass.ChatInfo, io.grasscutter.proto.ChatInfoOuterClass.ChatInfo.Builder, io.grasscutter.proto.ChatInfoOuterClass.ChatInfoOrBuilder> chatInfoBuilder_;
      /**
       * <code>.ChatInfo chat_info = 3;</code>
       * @return Whether the chatInfo field is set.
       */
      public boolean hasChatInfo() {
        return chatInfoBuilder_ != null || chatInfo_ != null;
      }
      /**
       * <code>.ChatInfo chat_info = 3;</code>
       * @return The chatInfo.
       */
      public io.grasscutter.proto.ChatInfoOuterClass.ChatInfo getChatInfo() {
        if (chatInfoBuilder_ == null) {
          return chatInfo_ == null ? io.grasscutter.proto.ChatInfoOuterClass.ChatInfo.getDefaultInstance() : chatInfo_;
        } else {
          return chatInfoBuilder_.getMessage();
        }
      }
      /**
       * <code>.ChatInfo chat_info = 3;</code>
       */
      public Builder setChatInfo(io.grasscutter.proto.ChatInfoOuterClass.ChatInfo value) {
        if (chatInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          chatInfo_ = value;
          onChanged();
        } else {
          chatInfoBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.ChatInfo chat_info = 3;</code>
       */
      public Builder setChatInfo(
          io.grasscutter.proto.ChatInfoOuterClass.ChatInfo.Builder builderForValue) {
        if (chatInfoBuilder_ == null) {
          chatInfo_ = builderForValue.build();
          onChanged();
        } else {
          chatInfoBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.ChatInfo chat_info = 3;</code>
       */
      public Builder mergeChatInfo(io.grasscutter.proto.ChatInfoOuterClass.ChatInfo value) {
        if (chatInfoBuilder_ == null) {
          if (chatInfo_ != null) {
            chatInfo_ =
              io.grasscutter.proto.ChatInfoOuterClass.ChatInfo.newBuilder(chatInfo_).mergeFrom(value).buildPartial();
          } else {
            chatInfo_ = value;
          }
          onChanged();
        } else {
          chatInfoBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.ChatInfo chat_info = 3;</code>
       */
      public Builder clearChatInfo() {
        if (chatInfoBuilder_ == null) {
          chatInfo_ = null;
          onChanged();
        } else {
          chatInfo_ = null;
          chatInfoBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.ChatInfo chat_info = 3;</code>
       */
      public io.grasscutter.proto.ChatInfoOuterClass.ChatInfo.Builder getChatInfoBuilder() {
        
        onChanged();
        return getChatInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>.ChatInfo chat_info = 3;</code>
       */
      public io.grasscutter.proto.ChatInfoOuterClass.ChatInfoOrBuilder getChatInfoOrBuilder() {
        if (chatInfoBuilder_ != null) {
          return chatInfoBuilder_.getMessageOrBuilder();
        } else {
          return chatInfo_ == null ?
              io.grasscutter.proto.ChatInfoOuterClass.ChatInfo.getDefaultInstance() : chatInfo_;
        }
      }
      /**
       * <code>.ChatInfo chat_info = 3;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          io.grasscutter.proto.ChatInfoOuterClass.ChatInfo, io.grasscutter.proto.ChatInfoOuterClass.ChatInfo.Builder, io.grasscutter.proto.ChatInfoOuterClass.ChatInfoOrBuilder> 
          getChatInfoFieldBuilder() {
        if (chatInfoBuilder_ == null) {
          chatInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              io.grasscutter.proto.ChatInfoOuterClass.ChatInfo, io.grasscutter.proto.ChatInfoOuterClass.ChatInfo.Builder, io.grasscutter.proto.ChatInfoOuterClass.ChatInfoOrBuilder>(
                  getChatInfo(),
                  getParentForChildren(),
                  isClean());
          chatInfo_ = null;
        }
        return chatInfoBuilder_;
      }

      private int channelId_ ;
      /**
       * <code>uint32 channel_id = 6;</code>
       * @return The channelId.
       */
      @java.lang.Override
      public int getChannelId() {
        return channelId_;
      }
      /**
       * <code>uint32 channel_id = 6;</code>
       * @param value The channelId to set.
       * @return This builder for chaining.
       */
      public Builder setChannelId(int value) {
        
        channelId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 channel_id = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearChannelId() {
        
        channelId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:PlayerChatNotify)
    }

    // @@protoc_insertion_point(class_scope:PlayerChatNotify)
    private static final io.grasscutter.proto.PlayerChatNotifyOuterClass.PlayerChatNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.grasscutter.proto.PlayerChatNotifyOuterClass.PlayerChatNotify();
    }

    public static io.grasscutter.proto.PlayerChatNotifyOuterClass.PlayerChatNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PlayerChatNotify>
        PARSER = new com.google.protobuf.AbstractParser<PlayerChatNotify>() {
      @java.lang.Override
      public PlayerChatNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new PlayerChatNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<PlayerChatNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PlayerChatNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.grasscutter.proto.PlayerChatNotifyOuterClass.PlayerChatNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PlayerChatNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PlayerChatNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026PlayerChatNotify.proto\032\016ChatInfo.proto" +
      "\"D\n\020PlayerChatNotify\022\034\n\tchat_info\030\003 \001(\0132" +
      "\t.ChatInfo\022\022\n\nchannel_id\030\006 \001(\rB\026\n\024io.gra" +
      "sscutter.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.grasscutter.proto.ChatInfoOuterClass.getDescriptor(),
        });
    internal_static_PlayerChatNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PlayerChatNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PlayerChatNotify_descriptor,
        new java.lang.String[] { "ChatInfo", "ChannelId", });
    io.grasscutter.proto.ChatInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
