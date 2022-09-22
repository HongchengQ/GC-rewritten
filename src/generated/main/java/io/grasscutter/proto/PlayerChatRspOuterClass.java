// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PlayerChatRsp.proto

package io.grasscutter.proto;

public final class PlayerChatRspOuterClass {
  private PlayerChatRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PlayerChatRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PlayerChatRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 chat_forbidden_endtime = 15;</code>
     * @return The chatForbiddenEndtime.
     */
    int getChatForbiddenEndtime();

    /**
     * <code>int32 retcode = 2;</code>
     * @return The retcode.
     */
    int getRetcode();
  }
  /**
   * <pre>
   * CmdId: 3228
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code PlayerChatRsp}
   */
  public static final class PlayerChatRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:PlayerChatRsp)
      PlayerChatRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PlayerChatRsp.newBuilder() to construct.
    private PlayerChatRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PlayerChatRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PlayerChatRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private PlayerChatRsp(
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

              retcode_ = input.readInt32();
              break;
            }
            case 120: {

              chatForbiddenEndtime_ = input.readUInt32();
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
      return io.grasscutter.proto.PlayerChatRspOuterClass.internal_static_PlayerChatRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.proto.PlayerChatRspOuterClass.internal_static_PlayerChatRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.proto.PlayerChatRspOuterClass.PlayerChatRsp.class, io.grasscutter.proto.PlayerChatRspOuterClass.PlayerChatRsp.Builder.class);
    }

    public static final int CHAT_FORBIDDEN_ENDTIME_FIELD_NUMBER = 15;
    private int chatForbiddenEndtime_;
    /**
     * <code>uint32 chat_forbidden_endtime = 15;</code>
     * @return The chatForbiddenEndtime.
     */
    @java.lang.Override
    public int getChatForbiddenEndtime() {
      return chatForbiddenEndtime_;
    }

    public static final int RETCODE_FIELD_NUMBER = 2;
    private int retcode_;
    /**
     * <code>int32 retcode = 2;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
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
      if (retcode_ != 0) {
        output.writeInt32(2, retcode_);
      }
      if (chatForbiddenEndtime_ != 0) {
        output.writeUInt32(15, chatForbiddenEndtime_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, retcode_);
      }
      if (chatForbiddenEndtime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, chatForbiddenEndtime_);
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
      if (!(obj instanceof io.grasscutter.proto.PlayerChatRspOuterClass.PlayerChatRsp)) {
        return super.equals(obj);
      }
      io.grasscutter.proto.PlayerChatRspOuterClass.PlayerChatRsp other = (io.grasscutter.proto.PlayerChatRspOuterClass.PlayerChatRsp) obj;

      if (getChatForbiddenEndtime()
          != other.getChatForbiddenEndtime()) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
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
      hash = (37 * hash) + CHAT_FORBIDDEN_ENDTIME_FIELD_NUMBER;
      hash = (53 * hash) + getChatForbiddenEndtime();
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.grasscutter.proto.PlayerChatRspOuterClass.PlayerChatRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.PlayerChatRspOuterClass.PlayerChatRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.PlayerChatRspOuterClass.PlayerChatRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.PlayerChatRspOuterClass.PlayerChatRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.PlayerChatRspOuterClass.PlayerChatRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.PlayerChatRspOuterClass.PlayerChatRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.PlayerChatRspOuterClass.PlayerChatRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.PlayerChatRspOuterClass.PlayerChatRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.PlayerChatRspOuterClass.PlayerChatRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.PlayerChatRspOuterClass.PlayerChatRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.PlayerChatRspOuterClass.PlayerChatRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.PlayerChatRspOuterClass.PlayerChatRsp parseFrom(
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
    public static Builder newBuilder(io.grasscutter.proto.PlayerChatRspOuterClass.PlayerChatRsp prototype) {
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
     * CmdId: 3228
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code PlayerChatRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PlayerChatRsp)
        io.grasscutter.proto.PlayerChatRspOuterClass.PlayerChatRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.grasscutter.proto.PlayerChatRspOuterClass.internal_static_PlayerChatRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.grasscutter.proto.PlayerChatRspOuterClass.internal_static_PlayerChatRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.grasscutter.proto.PlayerChatRspOuterClass.PlayerChatRsp.class, io.grasscutter.proto.PlayerChatRspOuterClass.PlayerChatRsp.Builder.class);
      }

      // Construct using io.grasscutter.proto.PlayerChatRspOuterClass.PlayerChatRsp.newBuilder()
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
        chatForbiddenEndtime_ = 0;

        retcode_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.grasscutter.proto.PlayerChatRspOuterClass.internal_static_PlayerChatRsp_descriptor;
      }

      @java.lang.Override
      public io.grasscutter.proto.PlayerChatRspOuterClass.PlayerChatRsp getDefaultInstanceForType() {
        return io.grasscutter.proto.PlayerChatRspOuterClass.PlayerChatRsp.getDefaultInstance();
      }

      @java.lang.Override
      public io.grasscutter.proto.PlayerChatRspOuterClass.PlayerChatRsp build() {
        io.grasscutter.proto.PlayerChatRspOuterClass.PlayerChatRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.grasscutter.proto.PlayerChatRspOuterClass.PlayerChatRsp buildPartial() {
        io.grasscutter.proto.PlayerChatRspOuterClass.PlayerChatRsp result = new io.grasscutter.proto.PlayerChatRspOuterClass.PlayerChatRsp(this);
        result.chatForbiddenEndtime_ = chatForbiddenEndtime_;
        result.retcode_ = retcode_;
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
        if (other instanceof io.grasscutter.proto.PlayerChatRspOuterClass.PlayerChatRsp) {
          return mergeFrom((io.grasscutter.proto.PlayerChatRspOuterClass.PlayerChatRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.grasscutter.proto.PlayerChatRspOuterClass.PlayerChatRsp other) {
        if (other == io.grasscutter.proto.PlayerChatRspOuterClass.PlayerChatRsp.getDefaultInstance()) return this;
        if (other.getChatForbiddenEndtime() != 0) {
          setChatForbiddenEndtime(other.getChatForbiddenEndtime());
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
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
        io.grasscutter.proto.PlayerChatRspOuterClass.PlayerChatRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.grasscutter.proto.PlayerChatRspOuterClass.PlayerChatRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int chatForbiddenEndtime_ ;
      /**
       * <code>uint32 chat_forbidden_endtime = 15;</code>
       * @return The chatForbiddenEndtime.
       */
      @java.lang.Override
      public int getChatForbiddenEndtime() {
        return chatForbiddenEndtime_;
      }
      /**
       * <code>uint32 chat_forbidden_endtime = 15;</code>
       * @param value The chatForbiddenEndtime to set.
       * @return This builder for chaining.
       */
      public Builder setChatForbiddenEndtime(int value) {
        
        chatForbiddenEndtime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 chat_forbidden_endtime = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearChatForbiddenEndtime() {
        
        chatForbiddenEndtime_ = 0;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 2;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 2;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
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


      // @@protoc_insertion_point(builder_scope:PlayerChatRsp)
    }

    // @@protoc_insertion_point(class_scope:PlayerChatRsp)
    private static final io.grasscutter.proto.PlayerChatRspOuterClass.PlayerChatRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.grasscutter.proto.PlayerChatRspOuterClass.PlayerChatRsp();
    }

    public static io.grasscutter.proto.PlayerChatRspOuterClass.PlayerChatRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PlayerChatRsp>
        PARSER = new com.google.protobuf.AbstractParser<PlayerChatRsp>() {
      @java.lang.Override
      public PlayerChatRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new PlayerChatRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<PlayerChatRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PlayerChatRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.grasscutter.proto.PlayerChatRspOuterClass.PlayerChatRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PlayerChatRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PlayerChatRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023PlayerChatRsp.proto\"@\n\rPlayerChatRsp\022\036" +
      "\n\026chat_forbidden_endtime\030\017 \001(\r\022\017\n\007retcod" +
      "e\030\002 \001(\005B\026\n\024io.grasscutter.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_PlayerChatRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PlayerChatRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PlayerChatRsp_descriptor,
        new java.lang.String[] { "ChatForbiddenEndtime", "Retcode", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
