// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ChessNormalCardInfo.proto

package io.grasscutter.proto;

public final class ChessNormalCardInfoOuterClass {
  private ChessNormalCardInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ChessNormalCardInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ChessNormalCardInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 card_id = 2;</code>
     * @return The cardId.
     */
    int getCardId();

    /**
     * <code>uint32 cost_points = 15;</code>
     * @return The costPoints.
     */
    int getCostPoints();

    /**
     * <code>bool is_attach_curse = 6;</code>
     * @return The isAttachCurse.
     */
    boolean getIsAttachCurse();
  }
  /**
   * Protobuf type {@code ChessNormalCardInfo}
   */
  public static final class ChessNormalCardInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ChessNormalCardInfo)
      ChessNormalCardInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ChessNormalCardInfo.newBuilder() to construct.
    private ChessNormalCardInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ChessNormalCardInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ChessNormalCardInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ChessNormalCardInfo(
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

              cardId_ = input.readUInt32();
              break;
            }
            case 48: {

              isAttachCurse_ = input.readBool();
              break;
            }
            case 120: {

              costPoints_ = input.readUInt32();
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
      return io.grasscutter.proto.ChessNormalCardInfoOuterClass.internal_static_ChessNormalCardInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.proto.ChessNormalCardInfoOuterClass.internal_static_ChessNormalCardInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.proto.ChessNormalCardInfoOuterClass.ChessNormalCardInfo.class, io.grasscutter.proto.ChessNormalCardInfoOuterClass.ChessNormalCardInfo.Builder.class);
    }

    public static final int CARD_ID_FIELD_NUMBER = 2;
    private int cardId_;
    /**
     * <code>uint32 card_id = 2;</code>
     * @return The cardId.
     */
    @java.lang.Override
    public int getCardId() {
      return cardId_;
    }

    public static final int COST_POINTS_FIELD_NUMBER = 15;
    private int costPoints_;
    /**
     * <code>uint32 cost_points = 15;</code>
     * @return The costPoints.
     */
    @java.lang.Override
    public int getCostPoints() {
      return costPoints_;
    }

    public static final int IS_ATTACH_CURSE_FIELD_NUMBER = 6;
    private boolean isAttachCurse_;
    /**
     * <code>bool is_attach_curse = 6;</code>
     * @return The isAttachCurse.
     */
    @java.lang.Override
    public boolean getIsAttachCurse() {
      return isAttachCurse_;
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
        output.writeUInt32(2, cardId_);
      }
      if (isAttachCurse_ != false) {
        output.writeBool(6, isAttachCurse_);
      }
      if (costPoints_ != 0) {
        output.writeUInt32(15, costPoints_);
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
          .computeUInt32Size(2, cardId_);
      }
      if (isAttachCurse_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(6, isAttachCurse_);
      }
      if (costPoints_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, costPoints_);
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
      if (!(obj instanceof io.grasscutter.proto.ChessNormalCardInfoOuterClass.ChessNormalCardInfo)) {
        return super.equals(obj);
      }
      io.grasscutter.proto.ChessNormalCardInfoOuterClass.ChessNormalCardInfo other = (io.grasscutter.proto.ChessNormalCardInfoOuterClass.ChessNormalCardInfo) obj;

      if (getCardId()
          != other.getCardId()) return false;
      if (getCostPoints()
          != other.getCostPoints()) return false;
      if (getIsAttachCurse()
          != other.getIsAttachCurse()) return false;
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
      hash = (37 * hash) + CARD_ID_FIELD_NUMBER;
      hash = (53 * hash) + getCardId();
      hash = (37 * hash) + COST_POINTS_FIELD_NUMBER;
      hash = (53 * hash) + getCostPoints();
      hash = (37 * hash) + IS_ATTACH_CURSE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsAttachCurse());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.grasscutter.proto.ChessNormalCardInfoOuterClass.ChessNormalCardInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.ChessNormalCardInfoOuterClass.ChessNormalCardInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.ChessNormalCardInfoOuterClass.ChessNormalCardInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.ChessNormalCardInfoOuterClass.ChessNormalCardInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.ChessNormalCardInfoOuterClass.ChessNormalCardInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.ChessNormalCardInfoOuterClass.ChessNormalCardInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.ChessNormalCardInfoOuterClass.ChessNormalCardInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.ChessNormalCardInfoOuterClass.ChessNormalCardInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.ChessNormalCardInfoOuterClass.ChessNormalCardInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.ChessNormalCardInfoOuterClass.ChessNormalCardInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.ChessNormalCardInfoOuterClass.ChessNormalCardInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.ChessNormalCardInfoOuterClass.ChessNormalCardInfo parseFrom(
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
    public static Builder newBuilder(io.grasscutter.proto.ChessNormalCardInfoOuterClass.ChessNormalCardInfo prototype) {
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
     * Protobuf type {@code ChessNormalCardInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ChessNormalCardInfo)
        io.grasscutter.proto.ChessNormalCardInfoOuterClass.ChessNormalCardInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.grasscutter.proto.ChessNormalCardInfoOuterClass.internal_static_ChessNormalCardInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.grasscutter.proto.ChessNormalCardInfoOuterClass.internal_static_ChessNormalCardInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.grasscutter.proto.ChessNormalCardInfoOuterClass.ChessNormalCardInfo.class, io.grasscutter.proto.ChessNormalCardInfoOuterClass.ChessNormalCardInfo.Builder.class);
      }

      // Construct using io.grasscutter.proto.ChessNormalCardInfoOuterClass.ChessNormalCardInfo.newBuilder()
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
        cardId_ = 0;

        costPoints_ = 0;

        isAttachCurse_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.grasscutter.proto.ChessNormalCardInfoOuterClass.internal_static_ChessNormalCardInfo_descriptor;
      }

      @java.lang.Override
      public io.grasscutter.proto.ChessNormalCardInfoOuterClass.ChessNormalCardInfo getDefaultInstanceForType() {
        return io.grasscutter.proto.ChessNormalCardInfoOuterClass.ChessNormalCardInfo.getDefaultInstance();
      }

      @java.lang.Override
      public io.grasscutter.proto.ChessNormalCardInfoOuterClass.ChessNormalCardInfo build() {
        io.grasscutter.proto.ChessNormalCardInfoOuterClass.ChessNormalCardInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.grasscutter.proto.ChessNormalCardInfoOuterClass.ChessNormalCardInfo buildPartial() {
        io.grasscutter.proto.ChessNormalCardInfoOuterClass.ChessNormalCardInfo result = new io.grasscutter.proto.ChessNormalCardInfoOuterClass.ChessNormalCardInfo(this);
        result.cardId_ = cardId_;
        result.costPoints_ = costPoints_;
        result.isAttachCurse_ = isAttachCurse_;
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
        if (other instanceof io.grasscutter.proto.ChessNormalCardInfoOuterClass.ChessNormalCardInfo) {
          return mergeFrom((io.grasscutter.proto.ChessNormalCardInfoOuterClass.ChessNormalCardInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.grasscutter.proto.ChessNormalCardInfoOuterClass.ChessNormalCardInfo other) {
        if (other == io.grasscutter.proto.ChessNormalCardInfoOuterClass.ChessNormalCardInfo.getDefaultInstance()) return this;
        if (other.getCardId() != 0) {
          setCardId(other.getCardId());
        }
        if (other.getCostPoints() != 0) {
          setCostPoints(other.getCostPoints());
        }
        if (other.getIsAttachCurse() != false) {
          setIsAttachCurse(other.getIsAttachCurse());
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
        io.grasscutter.proto.ChessNormalCardInfoOuterClass.ChessNormalCardInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.grasscutter.proto.ChessNormalCardInfoOuterClass.ChessNormalCardInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int cardId_ ;
      /**
       * <code>uint32 card_id = 2;</code>
       * @return The cardId.
       */
      @java.lang.Override
      public int getCardId() {
        return cardId_;
      }
      /**
       * <code>uint32 card_id = 2;</code>
       * @param value The cardId to set.
       * @return This builder for chaining.
       */
      public Builder setCardId(int value) {
        
        cardId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 card_id = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearCardId() {
        
        cardId_ = 0;
        onChanged();
        return this;
      }

      private int costPoints_ ;
      /**
       * <code>uint32 cost_points = 15;</code>
       * @return The costPoints.
       */
      @java.lang.Override
      public int getCostPoints() {
        return costPoints_;
      }
      /**
       * <code>uint32 cost_points = 15;</code>
       * @param value The costPoints to set.
       * @return This builder for chaining.
       */
      public Builder setCostPoints(int value) {
        
        costPoints_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 cost_points = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearCostPoints() {
        
        costPoints_ = 0;
        onChanged();
        return this;
      }

      private boolean isAttachCurse_ ;
      /**
       * <code>bool is_attach_curse = 6;</code>
       * @return The isAttachCurse.
       */
      @java.lang.Override
      public boolean getIsAttachCurse() {
        return isAttachCurse_;
      }
      /**
       * <code>bool is_attach_curse = 6;</code>
       * @param value The isAttachCurse to set.
       * @return This builder for chaining.
       */
      public Builder setIsAttachCurse(boolean value) {
        
        isAttachCurse_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_attach_curse = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsAttachCurse() {
        
        isAttachCurse_ = false;
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


      // @@protoc_insertion_point(builder_scope:ChessNormalCardInfo)
    }

    // @@protoc_insertion_point(class_scope:ChessNormalCardInfo)
    private static final io.grasscutter.proto.ChessNormalCardInfoOuterClass.ChessNormalCardInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.grasscutter.proto.ChessNormalCardInfoOuterClass.ChessNormalCardInfo();
    }

    public static io.grasscutter.proto.ChessNormalCardInfoOuterClass.ChessNormalCardInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ChessNormalCardInfo>
        PARSER = new com.google.protobuf.AbstractParser<ChessNormalCardInfo>() {
      @java.lang.Override
      public ChessNormalCardInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ChessNormalCardInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ChessNormalCardInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ChessNormalCardInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.grasscutter.proto.ChessNormalCardInfoOuterClass.ChessNormalCardInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ChessNormalCardInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ChessNormalCardInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031ChessNormalCardInfo.proto\"T\n\023ChessNorm" +
      "alCardInfo\022\017\n\007card_id\030\002 \001(\r\022\023\n\013cost_poin" +
      "ts\030\017 \001(\r\022\027\n\017is_attach_curse\030\006 \001(\010B\026\n\024io." +
      "grasscutter.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ChessNormalCardInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ChessNormalCardInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ChessNormalCardInfo_descriptor,
        new java.lang.String[] { "CardId", "CostPoints", "IsAttachCurse", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
