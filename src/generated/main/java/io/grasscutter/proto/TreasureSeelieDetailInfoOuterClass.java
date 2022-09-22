// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TreasureSeelieDetailInfo.proto

package io.grasscutter.proto;

public final class TreasureSeelieDetailInfoOuterClass {
  private TreasureSeelieDetailInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface TreasureSeelieDetailInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:TreasureSeelieDetailInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 treasure_close_time = 10;</code>
     * @return The treasureCloseTime.
     */
    int getTreasureCloseTime();

    /**
     * <code>bool is_content_closed = 8;</code>
     * @return The isContentClosed.
     */
    boolean getIsContentClosed();

    /**
     * <code>repeated .Unk3000_HDJHHOCABBK Unk3000_NMEPJANNLLE = 14;</code>
     */
    java.util.List<io.grasscutter.proto.Unk3000HDJHHOCABBK.Unk3000_HDJHHOCABBK> 
        getUnk3000NMEPJANNLLEList();
    /**
     * <code>repeated .Unk3000_HDJHHOCABBK Unk3000_NMEPJANNLLE = 14;</code>
     */
    io.grasscutter.proto.Unk3000HDJHHOCABBK.Unk3000_HDJHHOCABBK getUnk3000NMEPJANNLLE(int index);
    /**
     * <code>repeated .Unk3000_HDJHHOCABBK Unk3000_NMEPJANNLLE = 14;</code>
     */
    int getUnk3000NMEPJANNLLECount();
    /**
     * <code>repeated .Unk3000_HDJHHOCABBK Unk3000_NMEPJANNLLE = 14;</code>
     */
    java.util.List<? extends io.grasscutter.proto.Unk3000HDJHHOCABBK.Unk3000_HDJHHOCABBKOrBuilder> 
        getUnk3000NMEPJANNLLEOrBuilderList();
    /**
     * <code>repeated .Unk3000_HDJHHOCABBK Unk3000_NMEPJANNLLE = 14;</code>
     */
    io.grasscutter.proto.Unk3000HDJHHOCABBK.Unk3000_HDJHHOCABBKOrBuilder getUnk3000NMEPJANNLLEOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code TreasureSeelieDetailInfo}
   */
  public static final class TreasureSeelieDetailInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:TreasureSeelieDetailInfo)
      TreasureSeelieDetailInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use TreasureSeelieDetailInfo.newBuilder() to construct.
    private TreasureSeelieDetailInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private TreasureSeelieDetailInfo() {
      unk3000NMEPJANNLLE_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new TreasureSeelieDetailInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private TreasureSeelieDetailInfo(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
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
            case 64: {

              isContentClosed_ = input.readBool();
              break;
            }
            case 80: {

              treasureCloseTime_ = input.readUInt32();
              break;
            }
            case 114: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                unk3000NMEPJANNLLE_ = new java.util.ArrayList<io.grasscutter.proto.Unk3000HDJHHOCABBK.Unk3000_HDJHHOCABBK>();
                mutable_bitField0_ |= 0x00000001;
              }
              unk3000NMEPJANNLLE_.add(
                  input.readMessage(io.grasscutter.proto.Unk3000HDJHHOCABBK.Unk3000_HDJHHOCABBK.parser(), extensionRegistry));
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
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          unk3000NMEPJANNLLE_ = java.util.Collections.unmodifiableList(unk3000NMEPJANNLLE_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grasscutter.proto.TreasureSeelieDetailInfoOuterClass.internal_static_TreasureSeelieDetailInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.proto.TreasureSeelieDetailInfoOuterClass.internal_static_TreasureSeelieDetailInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.proto.TreasureSeelieDetailInfoOuterClass.TreasureSeelieDetailInfo.class, io.grasscutter.proto.TreasureSeelieDetailInfoOuterClass.TreasureSeelieDetailInfo.Builder.class);
    }

    public static final int TREASURE_CLOSE_TIME_FIELD_NUMBER = 10;
    private int treasureCloseTime_;
    /**
     * <code>uint32 treasure_close_time = 10;</code>
     * @return The treasureCloseTime.
     */
    @java.lang.Override
    public int getTreasureCloseTime() {
      return treasureCloseTime_;
    }

    public static final int IS_CONTENT_CLOSED_FIELD_NUMBER = 8;
    private boolean isContentClosed_;
    /**
     * <code>bool is_content_closed = 8;</code>
     * @return The isContentClosed.
     */
    @java.lang.Override
    public boolean getIsContentClosed() {
      return isContentClosed_;
    }

    public static final int UNK3000_NMEPJANNLLE_FIELD_NUMBER = 14;
    private java.util.List<io.grasscutter.proto.Unk3000HDJHHOCABBK.Unk3000_HDJHHOCABBK> unk3000NMEPJANNLLE_;
    /**
     * <code>repeated .Unk3000_HDJHHOCABBK Unk3000_NMEPJANNLLE = 14;</code>
     */
    @java.lang.Override
    public java.util.List<io.grasscutter.proto.Unk3000HDJHHOCABBK.Unk3000_HDJHHOCABBK> getUnk3000NMEPJANNLLEList() {
      return unk3000NMEPJANNLLE_;
    }
    /**
     * <code>repeated .Unk3000_HDJHHOCABBK Unk3000_NMEPJANNLLE = 14;</code>
     */
    @java.lang.Override
    public java.util.List<? extends io.grasscutter.proto.Unk3000HDJHHOCABBK.Unk3000_HDJHHOCABBKOrBuilder> 
        getUnk3000NMEPJANNLLEOrBuilderList() {
      return unk3000NMEPJANNLLE_;
    }
    /**
     * <code>repeated .Unk3000_HDJHHOCABBK Unk3000_NMEPJANNLLE = 14;</code>
     */
    @java.lang.Override
    public int getUnk3000NMEPJANNLLECount() {
      return unk3000NMEPJANNLLE_.size();
    }
    /**
     * <code>repeated .Unk3000_HDJHHOCABBK Unk3000_NMEPJANNLLE = 14;</code>
     */
    @java.lang.Override
    public io.grasscutter.proto.Unk3000HDJHHOCABBK.Unk3000_HDJHHOCABBK getUnk3000NMEPJANNLLE(int index) {
      return unk3000NMEPJANNLLE_.get(index);
    }
    /**
     * <code>repeated .Unk3000_HDJHHOCABBK Unk3000_NMEPJANNLLE = 14;</code>
     */
    @java.lang.Override
    public io.grasscutter.proto.Unk3000HDJHHOCABBK.Unk3000_HDJHHOCABBKOrBuilder getUnk3000NMEPJANNLLEOrBuilder(
        int index) {
      return unk3000NMEPJANNLLE_.get(index);
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
      if (isContentClosed_ != false) {
        output.writeBool(8, isContentClosed_);
      }
      if (treasureCloseTime_ != 0) {
        output.writeUInt32(10, treasureCloseTime_);
      }
      for (int i = 0; i < unk3000NMEPJANNLLE_.size(); i++) {
        output.writeMessage(14, unk3000NMEPJANNLLE_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isContentClosed_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(8, isContentClosed_);
      }
      if (treasureCloseTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, treasureCloseTime_);
      }
      for (int i = 0; i < unk3000NMEPJANNLLE_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(14, unk3000NMEPJANNLLE_.get(i));
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
      if (!(obj instanceof io.grasscutter.proto.TreasureSeelieDetailInfoOuterClass.TreasureSeelieDetailInfo)) {
        return super.equals(obj);
      }
      io.grasscutter.proto.TreasureSeelieDetailInfoOuterClass.TreasureSeelieDetailInfo other = (io.grasscutter.proto.TreasureSeelieDetailInfoOuterClass.TreasureSeelieDetailInfo) obj;

      if (getTreasureCloseTime()
          != other.getTreasureCloseTime()) return false;
      if (getIsContentClosed()
          != other.getIsContentClosed()) return false;
      if (!getUnk3000NMEPJANNLLEList()
          .equals(other.getUnk3000NMEPJANNLLEList())) return false;
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
      hash = (37 * hash) + TREASURE_CLOSE_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getTreasureCloseTime();
      hash = (37 * hash) + IS_CONTENT_CLOSED_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsContentClosed());
      if (getUnk3000NMEPJANNLLECount() > 0) {
        hash = (37 * hash) + UNK3000_NMEPJANNLLE_FIELD_NUMBER;
        hash = (53 * hash) + getUnk3000NMEPJANNLLEList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.grasscutter.proto.TreasureSeelieDetailInfoOuterClass.TreasureSeelieDetailInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.TreasureSeelieDetailInfoOuterClass.TreasureSeelieDetailInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.TreasureSeelieDetailInfoOuterClass.TreasureSeelieDetailInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.TreasureSeelieDetailInfoOuterClass.TreasureSeelieDetailInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.TreasureSeelieDetailInfoOuterClass.TreasureSeelieDetailInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.TreasureSeelieDetailInfoOuterClass.TreasureSeelieDetailInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.TreasureSeelieDetailInfoOuterClass.TreasureSeelieDetailInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.TreasureSeelieDetailInfoOuterClass.TreasureSeelieDetailInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.TreasureSeelieDetailInfoOuterClass.TreasureSeelieDetailInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.TreasureSeelieDetailInfoOuterClass.TreasureSeelieDetailInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.TreasureSeelieDetailInfoOuterClass.TreasureSeelieDetailInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.TreasureSeelieDetailInfoOuterClass.TreasureSeelieDetailInfo parseFrom(
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
    public static Builder newBuilder(io.grasscutter.proto.TreasureSeelieDetailInfoOuterClass.TreasureSeelieDetailInfo prototype) {
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
     * Protobuf type {@code TreasureSeelieDetailInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:TreasureSeelieDetailInfo)
        io.grasscutter.proto.TreasureSeelieDetailInfoOuterClass.TreasureSeelieDetailInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.grasscutter.proto.TreasureSeelieDetailInfoOuterClass.internal_static_TreasureSeelieDetailInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.grasscutter.proto.TreasureSeelieDetailInfoOuterClass.internal_static_TreasureSeelieDetailInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.grasscutter.proto.TreasureSeelieDetailInfoOuterClass.TreasureSeelieDetailInfo.class, io.grasscutter.proto.TreasureSeelieDetailInfoOuterClass.TreasureSeelieDetailInfo.Builder.class);
      }

      // Construct using io.grasscutter.proto.TreasureSeelieDetailInfoOuterClass.TreasureSeelieDetailInfo.newBuilder()
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
          getUnk3000NMEPJANNLLEFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        treasureCloseTime_ = 0;

        isContentClosed_ = false;

        if (unk3000NMEPJANNLLEBuilder_ == null) {
          unk3000NMEPJANNLLE_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          unk3000NMEPJANNLLEBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.grasscutter.proto.TreasureSeelieDetailInfoOuterClass.internal_static_TreasureSeelieDetailInfo_descriptor;
      }

      @java.lang.Override
      public io.grasscutter.proto.TreasureSeelieDetailInfoOuterClass.TreasureSeelieDetailInfo getDefaultInstanceForType() {
        return io.grasscutter.proto.TreasureSeelieDetailInfoOuterClass.TreasureSeelieDetailInfo.getDefaultInstance();
      }

      @java.lang.Override
      public io.grasscutter.proto.TreasureSeelieDetailInfoOuterClass.TreasureSeelieDetailInfo build() {
        io.grasscutter.proto.TreasureSeelieDetailInfoOuterClass.TreasureSeelieDetailInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.grasscutter.proto.TreasureSeelieDetailInfoOuterClass.TreasureSeelieDetailInfo buildPartial() {
        io.grasscutter.proto.TreasureSeelieDetailInfoOuterClass.TreasureSeelieDetailInfo result = new io.grasscutter.proto.TreasureSeelieDetailInfoOuterClass.TreasureSeelieDetailInfo(this);
        int from_bitField0_ = bitField0_;
        result.treasureCloseTime_ = treasureCloseTime_;
        result.isContentClosed_ = isContentClosed_;
        if (unk3000NMEPJANNLLEBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            unk3000NMEPJANNLLE_ = java.util.Collections.unmodifiableList(unk3000NMEPJANNLLE_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.unk3000NMEPJANNLLE_ = unk3000NMEPJANNLLE_;
        } else {
          result.unk3000NMEPJANNLLE_ = unk3000NMEPJANNLLEBuilder_.build();
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
        if (other instanceof io.grasscutter.proto.TreasureSeelieDetailInfoOuterClass.TreasureSeelieDetailInfo) {
          return mergeFrom((io.grasscutter.proto.TreasureSeelieDetailInfoOuterClass.TreasureSeelieDetailInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.grasscutter.proto.TreasureSeelieDetailInfoOuterClass.TreasureSeelieDetailInfo other) {
        if (other == io.grasscutter.proto.TreasureSeelieDetailInfoOuterClass.TreasureSeelieDetailInfo.getDefaultInstance()) return this;
        if (other.getTreasureCloseTime() != 0) {
          setTreasureCloseTime(other.getTreasureCloseTime());
        }
        if (other.getIsContentClosed() != false) {
          setIsContentClosed(other.getIsContentClosed());
        }
        if (unk3000NMEPJANNLLEBuilder_ == null) {
          if (!other.unk3000NMEPJANNLLE_.isEmpty()) {
            if (unk3000NMEPJANNLLE_.isEmpty()) {
              unk3000NMEPJANNLLE_ = other.unk3000NMEPJANNLLE_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureUnk3000NMEPJANNLLEIsMutable();
              unk3000NMEPJANNLLE_.addAll(other.unk3000NMEPJANNLLE_);
            }
            onChanged();
          }
        } else {
          if (!other.unk3000NMEPJANNLLE_.isEmpty()) {
            if (unk3000NMEPJANNLLEBuilder_.isEmpty()) {
              unk3000NMEPJANNLLEBuilder_.dispose();
              unk3000NMEPJANNLLEBuilder_ = null;
              unk3000NMEPJANNLLE_ = other.unk3000NMEPJANNLLE_;
              bitField0_ = (bitField0_ & ~0x00000001);
              unk3000NMEPJANNLLEBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getUnk3000NMEPJANNLLEFieldBuilder() : null;
            } else {
              unk3000NMEPJANNLLEBuilder_.addAllMessages(other.unk3000NMEPJANNLLE_);
            }
          }
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
        io.grasscutter.proto.TreasureSeelieDetailInfoOuterClass.TreasureSeelieDetailInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.grasscutter.proto.TreasureSeelieDetailInfoOuterClass.TreasureSeelieDetailInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int treasureCloseTime_ ;
      /**
       * <code>uint32 treasure_close_time = 10;</code>
       * @return The treasureCloseTime.
       */
      @java.lang.Override
      public int getTreasureCloseTime() {
        return treasureCloseTime_;
      }
      /**
       * <code>uint32 treasure_close_time = 10;</code>
       * @param value The treasureCloseTime to set.
       * @return This builder for chaining.
       */
      public Builder setTreasureCloseTime(int value) {
        
        treasureCloseTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 treasure_close_time = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearTreasureCloseTime() {
        
        treasureCloseTime_ = 0;
        onChanged();
        return this;
      }

      private boolean isContentClosed_ ;
      /**
       * <code>bool is_content_closed = 8;</code>
       * @return The isContentClosed.
       */
      @java.lang.Override
      public boolean getIsContentClosed() {
        return isContentClosed_;
      }
      /**
       * <code>bool is_content_closed = 8;</code>
       * @param value The isContentClosed to set.
       * @return This builder for chaining.
       */
      public Builder setIsContentClosed(boolean value) {
        
        isContentClosed_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_content_closed = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsContentClosed() {
        
        isContentClosed_ = false;
        onChanged();
        return this;
      }

      private java.util.List<io.grasscutter.proto.Unk3000HDJHHOCABBK.Unk3000_HDJHHOCABBK> unk3000NMEPJANNLLE_ =
        java.util.Collections.emptyList();
      private void ensureUnk3000NMEPJANNLLEIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          unk3000NMEPJANNLLE_ = new java.util.ArrayList<io.grasscutter.proto.Unk3000HDJHHOCABBK.Unk3000_HDJHHOCABBK>(unk3000NMEPJANNLLE_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          io.grasscutter.proto.Unk3000HDJHHOCABBK.Unk3000_HDJHHOCABBK, io.grasscutter.proto.Unk3000HDJHHOCABBK.Unk3000_HDJHHOCABBK.Builder, io.grasscutter.proto.Unk3000HDJHHOCABBK.Unk3000_HDJHHOCABBKOrBuilder> unk3000NMEPJANNLLEBuilder_;

      /**
       * <code>repeated .Unk3000_HDJHHOCABBK Unk3000_NMEPJANNLLE = 14;</code>
       */
      public java.util.List<io.grasscutter.proto.Unk3000HDJHHOCABBK.Unk3000_HDJHHOCABBK> getUnk3000NMEPJANNLLEList() {
        if (unk3000NMEPJANNLLEBuilder_ == null) {
          return java.util.Collections.unmodifiableList(unk3000NMEPJANNLLE_);
        } else {
          return unk3000NMEPJANNLLEBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .Unk3000_HDJHHOCABBK Unk3000_NMEPJANNLLE = 14;</code>
       */
      public int getUnk3000NMEPJANNLLECount() {
        if (unk3000NMEPJANNLLEBuilder_ == null) {
          return unk3000NMEPJANNLLE_.size();
        } else {
          return unk3000NMEPJANNLLEBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .Unk3000_HDJHHOCABBK Unk3000_NMEPJANNLLE = 14;</code>
       */
      public io.grasscutter.proto.Unk3000HDJHHOCABBK.Unk3000_HDJHHOCABBK getUnk3000NMEPJANNLLE(int index) {
        if (unk3000NMEPJANNLLEBuilder_ == null) {
          return unk3000NMEPJANNLLE_.get(index);
        } else {
          return unk3000NMEPJANNLLEBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .Unk3000_HDJHHOCABBK Unk3000_NMEPJANNLLE = 14;</code>
       */
      public Builder setUnk3000NMEPJANNLLE(
          int index, io.grasscutter.proto.Unk3000HDJHHOCABBK.Unk3000_HDJHHOCABBK value) {
        if (unk3000NMEPJANNLLEBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureUnk3000NMEPJANNLLEIsMutable();
          unk3000NMEPJANNLLE_.set(index, value);
          onChanged();
        } else {
          unk3000NMEPJANNLLEBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .Unk3000_HDJHHOCABBK Unk3000_NMEPJANNLLE = 14;</code>
       */
      public Builder setUnk3000NMEPJANNLLE(
          int index, io.grasscutter.proto.Unk3000HDJHHOCABBK.Unk3000_HDJHHOCABBK.Builder builderForValue) {
        if (unk3000NMEPJANNLLEBuilder_ == null) {
          ensureUnk3000NMEPJANNLLEIsMutable();
          unk3000NMEPJANNLLE_.set(index, builderForValue.build());
          onChanged();
        } else {
          unk3000NMEPJANNLLEBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Unk3000_HDJHHOCABBK Unk3000_NMEPJANNLLE = 14;</code>
       */
      public Builder addUnk3000NMEPJANNLLE(io.grasscutter.proto.Unk3000HDJHHOCABBK.Unk3000_HDJHHOCABBK value) {
        if (unk3000NMEPJANNLLEBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureUnk3000NMEPJANNLLEIsMutable();
          unk3000NMEPJANNLLE_.add(value);
          onChanged();
        } else {
          unk3000NMEPJANNLLEBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .Unk3000_HDJHHOCABBK Unk3000_NMEPJANNLLE = 14;</code>
       */
      public Builder addUnk3000NMEPJANNLLE(
          int index, io.grasscutter.proto.Unk3000HDJHHOCABBK.Unk3000_HDJHHOCABBK value) {
        if (unk3000NMEPJANNLLEBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureUnk3000NMEPJANNLLEIsMutable();
          unk3000NMEPJANNLLE_.add(index, value);
          onChanged();
        } else {
          unk3000NMEPJANNLLEBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .Unk3000_HDJHHOCABBK Unk3000_NMEPJANNLLE = 14;</code>
       */
      public Builder addUnk3000NMEPJANNLLE(
          io.grasscutter.proto.Unk3000HDJHHOCABBK.Unk3000_HDJHHOCABBK.Builder builderForValue) {
        if (unk3000NMEPJANNLLEBuilder_ == null) {
          ensureUnk3000NMEPJANNLLEIsMutable();
          unk3000NMEPJANNLLE_.add(builderForValue.build());
          onChanged();
        } else {
          unk3000NMEPJANNLLEBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Unk3000_HDJHHOCABBK Unk3000_NMEPJANNLLE = 14;</code>
       */
      public Builder addUnk3000NMEPJANNLLE(
          int index, io.grasscutter.proto.Unk3000HDJHHOCABBK.Unk3000_HDJHHOCABBK.Builder builderForValue) {
        if (unk3000NMEPJANNLLEBuilder_ == null) {
          ensureUnk3000NMEPJANNLLEIsMutable();
          unk3000NMEPJANNLLE_.add(index, builderForValue.build());
          onChanged();
        } else {
          unk3000NMEPJANNLLEBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Unk3000_HDJHHOCABBK Unk3000_NMEPJANNLLE = 14;</code>
       */
      public Builder addAllUnk3000NMEPJANNLLE(
          java.lang.Iterable<? extends io.grasscutter.proto.Unk3000HDJHHOCABBK.Unk3000_HDJHHOCABBK> values) {
        if (unk3000NMEPJANNLLEBuilder_ == null) {
          ensureUnk3000NMEPJANNLLEIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, unk3000NMEPJANNLLE_);
          onChanged();
        } else {
          unk3000NMEPJANNLLEBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .Unk3000_HDJHHOCABBK Unk3000_NMEPJANNLLE = 14;</code>
       */
      public Builder clearUnk3000NMEPJANNLLE() {
        if (unk3000NMEPJANNLLEBuilder_ == null) {
          unk3000NMEPJANNLLE_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          unk3000NMEPJANNLLEBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .Unk3000_HDJHHOCABBK Unk3000_NMEPJANNLLE = 14;</code>
       */
      public Builder removeUnk3000NMEPJANNLLE(int index) {
        if (unk3000NMEPJANNLLEBuilder_ == null) {
          ensureUnk3000NMEPJANNLLEIsMutable();
          unk3000NMEPJANNLLE_.remove(index);
          onChanged();
        } else {
          unk3000NMEPJANNLLEBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .Unk3000_HDJHHOCABBK Unk3000_NMEPJANNLLE = 14;</code>
       */
      public io.grasscutter.proto.Unk3000HDJHHOCABBK.Unk3000_HDJHHOCABBK.Builder getUnk3000NMEPJANNLLEBuilder(
          int index) {
        return getUnk3000NMEPJANNLLEFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .Unk3000_HDJHHOCABBK Unk3000_NMEPJANNLLE = 14;</code>
       */
      public io.grasscutter.proto.Unk3000HDJHHOCABBK.Unk3000_HDJHHOCABBKOrBuilder getUnk3000NMEPJANNLLEOrBuilder(
          int index) {
        if (unk3000NMEPJANNLLEBuilder_ == null) {
          return unk3000NMEPJANNLLE_.get(index);  } else {
          return unk3000NMEPJANNLLEBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .Unk3000_HDJHHOCABBK Unk3000_NMEPJANNLLE = 14;</code>
       */
      public java.util.List<? extends io.grasscutter.proto.Unk3000HDJHHOCABBK.Unk3000_HDJHHOCABBKOrBuilder> 
           getUnk3000NMEPJANNLLEOrBuilderList() {
        if (unk3000NMEPJANNLLEBuilder_ != null) {
          return unk3000NMEPJANNLLEBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(unk3000NMEPJANNLLE_);
        }
      }
      /**
       * <code>repeated .Unk3000_HDJHHOCABBK Unk3000_NMEPJANNLLE = 14;</code>
       */
      public io.grasscutter.proto.Unk3000HDJHHOCABBK.Unk3000_HDJHHOCABBK.Builder addUnk3000NMEPJANNLLEBuilder() {
        return getUnk3000NMEPJANNLLEFieldBuilder().addBuilder(
            io.grasscutter.proto.Unk3000HDJHHOCABBK.Unk3000_HDJHHOCABBK.getDefaultInstance());
      }
      /**
       * <code>repeated .Unk3000_HDJHHOCABBK Unk3000_NMEPJANNLLE = 14;</code>
       */
      public io.grasscutter.proto.Unk3000HDJHHOCABBK.Unk3000_HDJHHOCABBK.Builder addUnk3000NMEPJANNLLEBuilder(
          int index) {
        return getUnk3000NMEPJANNLLEFieldBuilder().addBuilder(
            index, io.grasscutter.proto.Unk3000HDJHHOCABBK.Unk3000_HDJHHOCABBK.getDefaultInstance());
      }
      /**
       * <code>repeated .Unk3000_HDJHHOCABBK Unk3000_NMEPJANNLLE = 14;</code>
       */
      public java.util.List<io.grasscutter.proto.Unk3000HDJHHOCABBK.Unk3000_HDJHHOCABBK.Builder> 
           getUnk3000NMEPJANNLLEBuilderList() {
        return getUnk3000NMEPJANNLLEFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          io.grasscutter.proto.Unk3000HDJHHOCABBK.Unk3000_HDJHHOCABBK, io.grasscutter.proto.Unk3000HDJHHOCABBK.Unk3000_HDJHHOCABBK.Builder, io.grasscutter.proto.Unk3000HDJHHOCABBK.Unk3000_HDJHHOCABBKOrBuilder> 
          getUnk3000NMEPJANNLLEFieldBuilder() {
        if (unk3000NMEPJANNLLEBuilder_ == null) {
          unk3000NMEPJANNLLEBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              io.grasscutter.proto.Unk3000HDJHHOCABBK.Unk3000_HDJHHOCABBK, io.grasscutter.proto.Unk3000HDJHHOCABBK.Unk3000_HDJHHOCABBK.Builder, io.grasscutter.proto.Unk3000HDJHHOCABBK.Unk3000_HDJHHOCABBKOrBuilder>(
                  unk3000NMEPJANNLLE_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          unk3000NMEPJANNLLE_ = null;
        }
        return unk3000NMEPJANNLLEBuilder_;
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


      // @@protoc_insertion_point(builder_scope:TreasureSeelieDetailInfo)
    }

    // @@protoc_insertion_point(class_scope:TreasureSeelieDetailInfo)
    private static final io.grasscutter.proto.TreasureSeelieDetailInfoOuterClass.TreasureSeelieDetailInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.grasscutter.proto.TreasureSeelieDetailInfoOuterClass.TreasureSeelieDetailInfo();
    }

    public static io.grasscutter.proto.TreasureSeelieDetailInfoOuterClass.TreasureSeelieDetailInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<TreasureSeelieDetailInfo>
        PARSER = new com.google.protobuf.AbstractParser<TreasureSeelieDetailInfo>() {
      @java.lang.Override
      public TreasureSeelieDetailInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new TreasureSeelieDetailInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<TreasureSeelieDetailInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<TreasureSeelieDetailInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.grasscutter.proto.TreasureSeelieDetailInfoOuterClass.TreasureSeelieDetailInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TreasureSeelieDetailInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TreasureSeelieDetailInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036TreasureSeelieDetailInfo.proto\032\031Unk300" +
      "0_HDJHHOCABBK.proto\"\205\001\n\030TreasureSeelieDe" +
      "tailInfo\022\033\n\023treasure_close_time\030\n \001(\r\022\031\n" +
      "\021is_content_closed\030\010 \001(\010\0221\n\023Unk3000_NMEP" +
      "JANNLLE\030\016 \003(\0132\024.Unk3000_HDJHHOCABBKB\026\n\024i" +
      "o.grasscutter.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.grasscutter.proto.Unk3000HDJHHOCABBK.getDescriptor(),
        });
    internal_static_TreasureSeelieDetailInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_TreasureSeelieDetailInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TreasureSeelieDetailInfo_descriptor,
        new java.lang.String[] { "TreasureCloseTime", "IsContentClosed", "Unk3000NMEPJANNLLE", });
    io.grasscutter.proto.Unk3000HDJHHOCABBK.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
