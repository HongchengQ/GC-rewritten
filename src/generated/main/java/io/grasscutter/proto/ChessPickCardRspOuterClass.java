// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ChessPickCardRsp.proto

package io.grasscutter.proto;

public final class ChessPickCardRspOuterClass {
  private ChessPickCardRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ChessPickCardRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ChessPickCardRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 card_index = 11;</code>
     * @return The cardIndex.
     */
    int getCardIndex();

    /**
     * <code>uint32 card_id = 1;</code>
     * @return The cardId.
     */
    int getCardId();

    /**
     * <code>int32 retcode = 4;</code>
     * @return The retcode.
     */
    int getRetcode();
  }
  /**
   * <pre>
   * CmdId: 5384
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code ChessPickCardRsp}
   */
  public static final class ChessPickCardRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ChessPickCardRsp)
      ChessPickCardRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ChessPickCardRsp.newBuilder() to construct.
    private ChessPickCardRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ChessPickCardRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ChessPickCardRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ChessPickCardRsp(
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

              cardId_ = input.readUInt32();
              break;
            }
            case 32: {

              retcode_ = input.readInt32();
              break;
            }
            case 88: {

              cardIndex_ = input.readUInt32();
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
      return io.grasscutter.proto.ChessPickCardRspOuterClass.internal_static_ChessPickCardRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.proto.ChessPickCardRspOuterClass.internal_static_ChessPickCardRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.proto.ChessPickCardRspOuterClass.ChessPickCardRsp.class, io.grasscutter.proto.ChessPickCardRspOuterClass.ChessPickCardRsp.Builder.class);
    }

    public static final int CARD_INDEX_FIELD_NUMBER = 11;
    private int cardIndex_;
    /**
     * <code>uint32 card_index = 11;</code>
     * @return The cardIndex.
     */
    @java.lang.Override
    public int getCardIndex() {
      return cardIndex_;
    }

    public static final int CARD_ID_FIELD_NUMBER = 1;
    private int cardId_;
    /**
     * <code>uint32 card_id = 1;</code>
     * @return The cardId.
     */
    @java.lang.Override
    public int getCardId() {
      return cardId_;
    }

    public static final int RETCODE_FIELD_NUMBER = 4;
    private int retcode_;
    /**
     * <code>int32 retcode = 4;</code>
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
      if (cardId_ != 0) {
        output.writeUInt32(1, cardId_);
      }
      if (retcode_ != 0) {
        output.writeInt32(4, retcode_);
      }
      if (cardIndex_ != 0) {
        output.writeUInt32(11, cardIndex_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (cardId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, cardId_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(4, retcode_);
      }
      if (cardIndex_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, cardIndex_);
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
      if (!(obj instanceof io.grasscutter.proto.ChessPickCardRspOuterClass.ChessPickCardRsp)) {
        return super.equals(obj);
      }
      io.grasscutter.proto.ChessPickCardRspOuterClass.ChessPickCardRsp other = (io.grasscutter.proto.ChessPickCardRspOuterClass.ChessPickCardRsp) obj;

      if (getCardIndex()
          != other.getCardIndex()) return false;
      if (getCardId()
          != other.getCardId()) return false;
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
      hash = (37 * hash) + CARD_INDEX_FIELD_NUMBER;
      hash = (53 * hash) + getCardIndex();
      hash = (37 * hash) + CARD_ID_FIELD_NUMBER;
      hash = (53 * hash) + getCardId();
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.grasscutter.proto.ChessPickCardRspOuterClass.ChessPickCardRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.ChessPickCardRspOuterClass.ChessPickCardRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.ChessPickCardRspOuterClass.ChessPickCardRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.ChessPickCardRspOuterClass.ChessPickCardRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.ChessPickCardRspOuterClass.ChessPickCardRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.ChessPickCardRspOuterClass.ChessPickCardRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.ChessPickCardRspOuterClass.ChessPickCardRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.ChessPickCardRspOuterClass.ChessPickCardRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.ChessPickCardRspOuterClass.ChessPickCardRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.ChessPickCardRspOuterClass.ChessPickCardRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.ChessPickCardRspOuterClass.ChessPickCardRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.ChessPickCardRspOuterClass.ChessPickCardRsp parseFrom(
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
    public static Builder newBuilder(io.grasscutter.proto.ChessPickCardRspOuterClass.ChessPickCardRsp prototype) {
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
     * CmdId: 5384
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code ChessPickCardRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ChessPickCardRsp)
        io.grasscutter.proto.ChessPickCardRspOuterClass.ChessPickCardRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.grasscutter.proto.ChessPickCardRspOuterClass.internal_static_ChessPickCardRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.grasscutter.proto.ChessPickCardRspOuterClass.internal_static_ChessPickCardRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.grasscutter.proto.ChessPickCardRspOuterClass.ChessPickCardRsp.class, io.grasscutter.proto.ChessPickCardRspOuterClass.ChessPickCardRsp.Builder.class);
      }

      // Construct using io.grasscutter.proto.ChessPickCardRspOuterClass.ChessPickCardRsp.newBuilder()
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
        cardIndex_ = 0;

        cardId_ = 0;

        retcode_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.grasscutter.proto.ChessPickCardRspOuterClass.internal_static_ChessPickCardRsp_descriptor;
      }

      @java.lang.Override
      public io.grasscutter.proto.ChessPickCardRspOuterClass.ChessPickCardRsp getDefaultInstanceForType() {
        return io.grasscutter.proto.ChessPickCardRspOuterClass.ChessPickCardRsp.getDefaultInstance();
      }

      @java.lang.Override
      public io.grasscutter.proto.ChessPickCardRspOuterClass.ChessPickCardRsp build() {
        io.grasscutter.proto.ChessPickCardRspOuterClass.ChessPickCardRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.grasscutter.proto.ChessPickCardRspOuterClass.ChessPickCardRsp buildPartial() {
        io.grasscutter.proto.ChessPickCardRspOuterClass.ChessPickCardRsp result = new io.grasscutter.proto.ChessPickCardRspOuterClass.ChessPickCardRsp(this);
        result.cardIndex_ = cardIndex_;
        result.cardId_ = cardId_;
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
        if (other instanceof io.grasscutter.proto.ChessPickCardRspOuterClass.ChessPickCardRsp) {
          return mergeFrom((io.grasscutter.proto.ChessPickCardRspOuterClass.ChessPickCardRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.grasscutter.proto.ChessPickCardRspOuterClass.ChessPickCardRsp other) {
        if (other == io.grasscutter.proto.ChessPickCardRspOuterClass.ChessPickCardRsp.getDefaultInstance()) return this;
        if (other.getCardIndex() != 0) {
          setCardIndex(other.getCardIndex());
        }
        if (other.getCardId() != 0) {
          setCardId(other.getCardId());
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
        io.grasscutter.proto.ChessPickCardRspOuterClass.ChessPickCardRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.grasscutter.proto.ChessPickCardRspOuterClass.ChessPickCardRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int cardIndex_ ;
      /**
       * <code>uint32 card_index = 11;</code>
       * @return The cardIndex.
       */
      @java.lang.Override
      public int getCardIndex() {
        return cardIndex_;
      }
      /**
       * <code>uint32 card_index = 11;</code>
       * @param value The cardIndex to set.
       * @return This builder for chaining.
       */
      public Builder setCardIndex(int value) {
        
        cardIndex_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 card_index = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearCardIndex() {
        
        cardIndex_ = 0;
        onChanged();
        return this;
      }

      private int cardId_ ;
      /**
       * <code>uint32 card_id = 1;</code>
       * @return The cardId.
       */
      @java.lang.Override
      public int getCardId() {
        return cardId_;
      }
      /**
       * <code>uint32 card_id = 1;</code>
       * @param value The cardId to set.
       * @return This builder for chaining.
       */
      public Builder setCardId(int value) {
        
        cardId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 card_id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearCardId() {
        
        cardId_ = 0;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 4;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 4;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 4;</code>
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


      // @@protoc_insertion_point(builder_scope:ChessPickCardRsp)
    }

    // @@protoc_insertion_point(class_scope:ChessPickCardRsp)
    private static final io.grasscutter.proto.ChessPickCardRspOuterClass.ChessPickCardRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.grasscutter.proto.ChessPickCardRspOuterClass.ChessPickCardRsp();
    }

    public static io.grasscutter.proto.ChessPickCardRspOuterClass.ChessPickCardRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ChessPickCardRsp>
        PARSER = new com.google.protobuf.AbstractParser<ChessPickCardRsp>() {
      @java.lang.Override
      public ChessPickCardRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ChessPickCardRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ChessPickCardRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ChessPickCardRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.grasscutter.proto.ChessPickCardRspOuterClass.ChessPickCardRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ChessPickCardRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ChessPickCardRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026ChessPickCardRsp.proto\"H\n\020ChessPickCar" +
      "dRsp\022\022\n\ncard_index\030\013 \001(\r\022\017\n\007card_id\030\001 \001(" +
      "\r\022\017\n\007retcode\030\004 \001(\005B\026\n\024io.grasscutter.pro" +
      "tob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ChessPickCardRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ChessPickCardRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ChessPickCardRsp_descriptor,
        new java.lang.String[] { "CardIndex", "CardId", "Retcode", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
