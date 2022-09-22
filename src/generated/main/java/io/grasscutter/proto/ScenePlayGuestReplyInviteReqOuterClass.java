// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ScenePlayGuestReplyInviteReq.proto

package io.grasscutter.proto;

public final class ScenePlayGuestReplyInviteReqOuterClass {
  private ScenePlayGuestReplyInviteReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ScenePlayGuestReplyInviteReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ScenePlayGuestReplyInviteReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool is_agree = 15;</code>
     * @return The isAgree.
     */
    boolean getIsAgree();

    /**
     * <code>uint32 play_id = 6;</code>
     * @return The playId.
     */
    int getPlayId();
  }
  /**
   * <pre>
   * CmdId: 4353
   * EnetChannelId: 0
   * EnetIsReliable: true
   * IsAllowClient: true
   * </pre>
   *
   * Protobuf type {@code ScenePlayGuestReplyInviteReq}
   */
  public static final class ScenePlayGuestReplyInviteReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ScenePlayGuestReplyInviteReq)
      ScenePlayGuestReplyInviteReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ScenePlayGuestReplyInviteReq.newBuilder() to construct.
    private ScenePlayGuestReplyInviteReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ScenePlayGuestReplyInviteReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ScenePlayGuestReplyInviteReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ScenePlayGuestReplyInviteReq(
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
            case 48: {

              playId_ = input.readUInt32();
              break;
            }
            case 120: {

              isAgree_ = input.readBool();
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
      return io.grasscutter.proto.ScenePlayGuestReplyInviteReqOuterClass.internal_static_ScenePlayGuestReplyInviteReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.proto.ScenePlayGuestReplyInviteReqOuterClass.internal_static_ScenePlayGuestReplyInviteReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.proto.ScenePlayGuestReplyInviteReqOuterClass.ScenePlayGuestReplyInviteReq.class, io.grasscutter.proto.ScenePlayGuestReplyInviteReqOuterClass.ScenePlayGuestReplyInviteReq.Builder.class);
    }

    public static final int IS_AGREE_FIELD_NUMBER = 15;
    private boolean isAgree_;
    /**
     * <code>bool is_agree = 15;</code>
     * @return The isAgree.
     */
    @java.lang.Override
    public boolean getIsAgree() {
      return isAgree_;
    }

    public static final int PLAY_ID_FIELD_NUMBER = 6;
    private int playId_;
    /**
     * <code>uint32 play_id = 6;</code>
     * @return The playId.
     */
    @java.lang.Override
    public int getPlayId() {
      return playId_;
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
        output.writeUInt32(6, playId_);
      }
      if (isAgree_ != false) {
        output.writeBool(15, isAgree_);
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
          .computeUInt32Size(6, playId_);
      }
      if (isAgree_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(15, isAgree_);
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
      if (!(obj instanceof io.grasscutter.proto.ScenePlayGuestReplyInviteReqOuterClass.ScenePlayGuestReplyInviteReq)) {
        return super.equals(obj);
      }
      io.grasscutter.proto.ScenePlayGuestReplyInviteReqOuterClass.ScenePlayGuestReplyInviteReq other = (io.grasscutter.proto.ScenePlayGuestReplyInviteReqOuterClass.ScenePlayGuestReplyInviteReq) obj;

      if (getIsAgree()
          != other.getIsAgree()) return false;
      if (getPlayId()
          != other.getPlayId()) return false;
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
      hash = (37 * hash) + IS_AGREE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsAgree());
      hash = (37 * hash) + PLAY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getPlayId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.grasscutter.proto.ScenePlayGuestReplyInviteReqOuterClass.ScenePlayGuestReplyInviteReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.ScenePlayGuestReplyInviteReqOuterClass.ScenePlayGuestReplyInviteReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.ScenePlayGuestReplyInviteReqOuterClass.ScenePlayGuestReplyInviteReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.ScenePlayGuestReplyInviteReqOuterClass.ScenePlayGuestReplyInviteReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.ScenePlayGuestReplyInviteReqOuterClass.ScenePlayGuestReplyInviteReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.ScenePlayGuestReplyInviteReqOuterClass.ScenePlayGuestReplyInviteReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.ScenePlayGuestReplyInviteReqOuterClass.ScenePlayGuestReplyInviteReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.ScenePlayGuestReplyInviteReqOuterClass.ScenePlayGuestReplyInviteReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.ScenePlayGuestReplyInviteReqOuterClass.ScenePlayGuestReplyInviteReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.ScenePlayGuestReplyInviteReqOuterClass.ScenePlayGuestReplyInviteReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.ScenePlayGuestReplyInviteReqOuterClass.ScenePlayGuestReplyInviteReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.ScenePlayGuestReplyInviteReqOuterClass.ScenePlayGuestReplyInviteReq parseFrom(
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
    public static Builder newBuilder(io.grasscutter.proto.ScenePlayGuestReplyInviteReqOuterClass.ScenePlayGuestReplyInviteReq prototype) {
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
     * CmdId: 4353
     * EnetChannelId: 0
     * EnetIsReliable: true
     * IsAllowClient: true
     * </pre>
     *
     * Protobuf type {@code ScenePlayGuestReplyInviteReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ScenePlayGuestReplyInviteReq)
        io.grasscutter.proto.ScenePlayGuestReplyInviteReqOuterClass.ScenePlayGuestReplyInviteReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.grasscutter.proto.ScenePlayGuestReplyInviteReqOuterClass.internal_static_ScenePlayGuestReplyInviteReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.grasscutter.proto.ScenePlayGuestReplyInviteReqOuterClass.internal_static_ScenePlayGuestReplyInviteReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.grasscutter.proto.ScenePlayGuestReplyInviteReqOuterClass.ScenePlayGuestReplyInviteReq.class, io.grasscutter.proto.ScenePlayGuestReplyInviteReqOuterClass.ScenePlayGuestReplyInviteReq.Builder.class);
      }

      // Construct using io.grasscutter.proto.ScenePlayGuestReplyInviteReqOuterClass.ScenePlayGuestReplyInviteReq.newBuilder()
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
        isAgree_ = false;

        playId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.grasscutter.proto.ScenePlayGuestReplyInviteReqOuterClass.internal_static_ScenePlayGuestReplyInviteReq_descriptor;
      }

      @java.lang.Override
      public io.grasscutter.proto.ScenePlayGuestReplyInviteReqOuterClass.ScenePlayGuestReplyInviteReq getDefaultInstanceForType() {
        return io.grasscutter.proto.ScenePlayGuestReplyInviteReqOuterClass.ScenePlayGuestReplyInviteReq.getDefaultInstance();
      }

      @java.lang.Override
      public io.grasscutter.proto.ScenePlayGuestReplyInviteReqOuterClass.ScenePlayGuestReplyInviteReq build() {
        io.grasscutter.proto.ScenePlayGuestReplyInviteReqOuterClass.ScenePlayGuestReplyInviteReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.grasscutter.proto.ScenePlayGuestReplyInviteReqOuterClass.ScenePlayGuestReplyInviteReq buildPartial() {
        io.grasscutter.proto.ScenePlayGuestReplyInviteReqOuterClass.ScenePlayGuestReplyInviteReq result = new io.grasscutter.proto.ScenePlayGuestReplyInviteReqOuterClass.ScenePlayGuestReplyInviteReq(this);
        result.isAgree_ = isAgree_;
        result.playId_ = playId_;
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
        if (other instanceof io.grasscutter.proto.ScenePlayGuestReplyInviteReqOuterClass.ScenePlayGuestReplyInviteReq) {
          return mergeFrom((io.grasscutter.proto.ScenePlayGuestReplyInviteReqOuterClass.ScenePlayGuestReplyInviteReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.grasscutter.proto.ScenePlayGuestReplyInviteReqOuterClass.ScenePlayGuestReplyInviteReq other) {
        if (other == io.grasscutter.proto.ScenePlayGuestReplyInviteReqOuterClass.ScenePlayGuestReplyInviteReq.getDefaultInstance()) return this;
        if (other.getIsAgree() != false) {
          setIsAgree(other.getIsAgree());
        }
        if (other.getPlayId() != 0) {
          setPlayId(other.getPlayId());
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
        io.grasscutter.proto.ScenePlayGuestReplyInviteReqOuterClass.ScenePlayGuestReplyInviteReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.grasscutter.proto.ScenePlayGuestReplyInviteReqOuterClass.ScenePlayGuestReplyInviteReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private boolean isAgree_ ;
      /**
       * <code>bool is_agree = 15;</code>
       * @return The isAgree.
       */
      @java.lang.Override
      public boolean getIsAgree() {
        return isAgree_;
      }
      /**
       * <code>bool is_agree = 15;</code>
       * @param value The isAgree to set.
       * @return This builder for chaining.
       */
      public Builder setIsAgree(boolean value) {
        
        isAgree_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_agree = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsAgree() {
        
        isAgree_ = false;
        onChanged();
        return this;
      }

      private int playId_ ;
      /**
       * <code>uint32 play_id = 6;</code>
       * @return The playId.
       */
      @java.lang.Override
      public int getPlayId() {
        return playId_;
      }
      /**
       * <code>uint32 play_id = 6;</code>
       * @param value The playId to set.
       * @return This builder for chaining.
       */
      public Builder setPlayId(int value) {
        
        playId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 play_id = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearPlayId() {
        
        playId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:ScenePlayGuestReplyInviteReq)
    }

    // @@protoc_insertion_point(class_scope:ScenePlayGuestReplyInviteReq)
    private static final io.grasscutter.proto.ScenePlayGuestReplyInviteReqOuterClass.ScenePlayGuestReplyInviteReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.grasscutter.proto.ScenePlayGuestReplyInviteReqOuterClass.ScenePlayGuestReplyInviteReq();
    }

    public static io.grasscutter.proto.ScenePlayGuestReplyInviteReqOuterClass.ScenePlayGuestReplyInviteReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ScenePlayGuestReplyInviteReq>
        PARSER = new com.google.protobuf.AbstractParser<ScenePlayGuestReplyInviteReq>() {
      @java.lang.Override
      public ScenePlayGuestReplyInviteReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ScenePlayGuestReplyInviteReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ScenePlayGuestReplyInviteReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ScenePlayGuestReplyInviteReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.grasscutter.proto.ScenePlayGuestReplyInviteReqOuterClass.ScenePlayGuestReplyInviteReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ScenePlayGuestReplyInviteReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ScenePlayGuestReplyInviteReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"ScenePlayGuestReplyInviteReq.proto\"A\n\034" +
      "ScenePlayGuestReplyInviteReq\022\020\n\010is_agree" +
      "\030\017 \001(\010\022\017\n\007play_id\030\006 \001(\rB\026\n\024io.grasscutte" +
      "r.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ScenePlayGuestReplyInviteReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ScenePlayGuestReplyInviteReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ScenePlayGuestReplyInviteReq_descriptor,
        new java.lang.String[] { "IsAgree", "PlayId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
