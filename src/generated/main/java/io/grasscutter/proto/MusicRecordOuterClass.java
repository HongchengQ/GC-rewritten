// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MusicRecord.proto

package io.grasscutter.proto;

public final class MusicRecordOuterClass {
  private MusicRecordOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MusicRecordOrBuilder extends
      // @@protoc_insertion_point(interface_extends:MusicRecord)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .Unk2700_AAAMOFPACEA Unk2700_MBJFOAGKKDJ = 4;</code>
     */
    java.util.List<io.grasscutter.proto.Unk2700AAAMOFPACEA.Unk2700_AAAMOFPACEA> 
        getUnk2700MBJFOAGKKDJList();
    /**
     * <code>repeated .Unk2700_AAAMOFPACEA Unk2700_MBJFOAGKKDJ = 4;</code>
     */
    io.grasscutter.proto.Unk2700AAAMOFPACEA.Unk2700_AAAMOFPACEA getUnk2700MBJFOAGKKDJ(int index);
    /**
     * <code>repeated .Unk2700_AAAMOFPACEA Unk2700_MBJFOAGKKDJ = 4;</code>
     */
    int getUnk2700MBJFOAGKKDJCount();
    /**
     * <code>repeated .Unk2700_AAAMOFPACEA Unk2700_MBJFOAGKKDJ = 4;</code>
     */
    java.util.List<? extends io.grasscutter.proto.Unk2700AAAMOFPACEA.Unk2700_AAAMOFPACEAOrBuilder> 
        getUnk2700MBJFOAGKKDJOrBuilderList();
    /**
     * <code>repeated .Unk2700_AAAMOFPACEA Unk2700_MBJFOAGKKDJ = 4;</code>
     */
    io.grasscutter.proto.Unk2700AAAMOFPACEA.Unk2700_AAAMOFPACEAOrBuilder getUnk2700MBJFOAGKKDJOrBuilder(
        int index);

    /**
     * <code>uint32 Unk2700_DFIBAIILJHN = 13;</code>
     * @return The unk2700DFIBAIILJHN.
     */
    int getUnk2700DFIBAIILJHN();
  }
  /**
   * Protobuf type {@code MusicRecord}
   */
  public static final class MusicRecord extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:MusicRecord)
      MusicRecordOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MusicRecord.newBuilder() to construct.
    private MusicRecord(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MusicRecord() {
      unk2700MBJFOAGKKDJ_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new MusicRecord();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private MusicRecord(
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
            case 34: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                unk2700MBJFOAGKKDJ_ = new java.util.ArrayList<io.grasscutter.proto.Unk2700AAAMOFPACEA.Unk2700_AAAMOFPACEA>();
                mutable_bitField0_ |= 0x00000001;
              }
              unk2700MBJFOAGKKDJ_.add(
                  input.readMessage(io.grasscutter.proto.Unk2700AAAMOFPACEA.Unk2700_AAAMOFPACEA.parser(), extensionRegistry));
              break;
            }
            case 104: {

              unk2700DFIBAIILJHN_ = input.readUInt32();
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
          unk2700MBJFOAGKKDJ_ = java.util.Collections.unmodifiableList(unk2700MBJFOAGKKDJ_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grasscutter.proto.MusicRecordOuterClass.internal_static_MusicRecord_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.proto.MusicRecordOuterClass.internal_static_MusicRecord_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.proto.MusicRecordOuterClass.MusicRecord.class, io.grasscutter.proto.MusicRecordOuterClass.MusicRecord.Builder.class);
    }

    public static final int UNK2700_MBJFOAGKKDJ_FIELD_NUMBER = 4;
    private java.util.List<io.grasscutter.proto.Unk2700AAAMOFPACEA.Unk2700_AAAMOFPACEA> unk2700MBJFOAGKKDJ_;
    /**
     * <code>repeated .Unk2700_AAAMOFPACEA Unk2700_MBJFOAGKKDJ = 4;</code>
     */
    @java.lang.Override
    public java.util.List<io.grasscutter.proto.Unk2700AAAMOFPACEA.Unk2700_AAAMOFPACEA> getUnk2700MBJFOAGKKDJList() {
      return unk2700MBJFOAGKKDJ_;
    }
    /**
     * <code>repeated .Unk2700_AAAMOFPACEA Unk2700_MBJFOAGKKDJ = 4;</code>
     */
    @java.lang.Override
    public java.util.List<? extends io.grasscutter.proto.Unk2700AAAMOFPACEA.Unk2700_AAAMOFPACEAOrBuilder> 
        getUnk2700MBJFOAGKKDJOrBuilderList() {
      return unk2700MBJFOAGKKDJ_;
    }
    /**
     * <code>repeated .Unk2700_AAAMOFPACEA Unk2700_MBJFOAGKKDJ = 4;</code>
     */
    @java.lang.Override
    public int getUnk2700MBJFOAGKKDJCount() {
      return unk2700MBJFOAGKKDJ_.size();
    }
    /**
     * <code>repeated .Unk2700_AAAMOFPACEA Unk2700_MBJFOAGKKDJ = 4;</code>
     */
    @java.lang.Override
    public io.grasscutter.proto.Unk2700AAAMOFPACEA.Unk2700_AAAMOFPACEA getUnk2700MBJFOAGKKDJ(int index) {
      return unk2700MBJFOAGKKDJ_.get(index);
    }
    /**
     * <code>repeated .Unk2700_AAAMOFPACEA Unk2700_MBJFOAGKKDJ = 4;</code>
     */
    @java.lang.Override
    public io.grasscutter.proto.Unk2700AAAMOFPACEA.Unk2700_AAAMOFPACEAOrBuilder getUnk2700MBJFOAGKKDJOrBuilder(
        int index) {
      return unk2700MBJFOAGKKDJ_.get(index);
    }

    public static final int UNK2700_DFIBAIILJHN_FIELD_NUMBER = 13;
    private int unk2700DFIBAIILJHN_;
    /**
     * <code>uint32 Unk2700_DFIBAIILJHN = 13;</code>
     * @return The unk2700DFIBAIILJHN.
     */
    @java.lang.Override
    public int getUnk2700DFIBAIILJHN() {
      return unk2700DFIBAIILJHN_;
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
      for (int i = 0; i < unk2700MBJFOAGKKDJ_.size(); i++) {
        output.writeMessage(4, unk2700MBJFOAGKKDJ_.get(i));
      }
      if (unk2700DFIBAIILJHN_ != 0) {
        output.writeUInt32(13, unk2700DFIBAIILJHN_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < unk2700MBJFOAGKKDJ_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(4, unk2700MBJFOAGKKDJ_.get(i));
      }
      if (unk2700DFIBAIILJHN_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, unk2700DFIBAIILJHN_);
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
      if (!(obj instanceof io.grasscutter.proto.MusicRecordOuterClass.MusicRecord)) {
        return super.equals(obj);
      }
      io.grasscutter.proto.MusicRecordOuterClass.MusicRecord other = (io.grasscutter.proto.MusicRecordOuterClass.MusicRecord) obj;

      if (!getUnk2700MBJFOAGKKDJList()
          .equals(other.getUnk2700MBJFOAGKKDJList())) return false;
      if (getUnk2700DFIBAIILJHN()
          != other.getUnk2700DFIBAIILJHN()) return false;
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
      if (getUnk2700MBJFOAGKKDJCount() > 0) {
        hash = (37 * hash) + UNK2700_MBJFOAGKKDJ_FIELD_NUMBER;
        hash = (53 * hash) + getUnk2700MBJFOAGKKDJList().hashCode();
      }
      hash = (37 * hash) + UNK2700_DFIBAIILJHN_FIELD_NUMBER;
      hash = (53 * hash) + getUnk2700DFIBAIILJHN();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.grasscutter.proto.MusicRecordOuterClass.MusicRecord parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.MusicRecordOuterClass.MusicRecord parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.MusicRecordOuterClass.MusicRecord parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.MusicRecordOuterClass.MusicRecord parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.MusicRecordOuterClass.MusicRecord parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.MusicRecordOuterClass.MusicRecord parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.MusicRecordOuterClass.MusicRecord parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.MusicRecordOuterClass.MusicRecord parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.MusicRecordOuterClass.MusicRecord parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.MusicRecordOuterClass.MusicRecord parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.MusicRecordOuterClass.MusicRecord parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.MusicRecordOuterClass.MusicRecord parseFrom(
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
    public static Builder newBuilder(io.grasscutter.proto.MusicRecordOuterClass.MusicRecord prototype) {
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
     * Protobuf type {@code MusicRecord}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:MusicRecord)
        io.grasscutter.proto.MusicRecordOuterClass.MusicRecordOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.grasscutter.proto.MusicRecordOuterClass.internal_static_MusicRecord_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.grasscutter.proto.MusicRecordOuterClass.internal_static_MusicRecord_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.grasscutter.proto.MusicRecordOuterClass.MusicRecord.class, io.grasscutter.proto.MusicRecordOuterClass.MusicRecord.Builder.class);
      }

      // Construct using io.grasscutter.proto.MusicRecordOuterClass.MusicRecord.newBuilder()
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
          getUnk2700MBJFOAGKKDJFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (unk2700MBJFOAGKKDJBuilder_ == null) {
          unk2700MBJFOAGKKDJ_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          unk2700MBJFOAGKKDJBuilder_.clear();
        }
        unk2700DFIBAIILJHN_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.grasscutter.proto.MusicRecordOuterClass.internal_static_MusicRecord_descriptor;
      }

      @java.lang.Override
      public io.grasscutter.proto.MusicRecordOuterClass.MusicRecord getDefaultInstanceForType() {
        return io.grasscutter.proto.MusicRecordOuterClass.MusicRecord.getDefaultInstance();
      }

      @java.lang.Override
      public io.grasscutter.proto.MusicRecordOuterClass.MusicRecord build() {
        io.grasscutter.proto.MusicRecordOuterClass.MusicRecord result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.grasscutter.proto.MusicRecordOuterClass.MusicRecord buildPartial() {
        io.grasscutter.proto.MusicRecordOuterClass.MusicRecord result = new io.grasscutter.proto.MusicRecordOuterClass.MusicRecord(this);
        int from_bitField0_ = bitField0_;
        if (unk2700MBJFOAGKKDJBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            unk2700MBJFOAGKKDJ_ = java.util.Collections.unmodifiableList(unk2700MBJFOAGKKDJ_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.unk2700MBJFOAGKKDJ_ = unk2700MBJFOAGKKDJ_;
        } else {
          result.unk2700MBJFOAGKKDJ_ = unk2700MBJFOAGKKDJBuilder_.build();
        }
        result.unk2700DFIBAIILJHN_ = unk2700DFIBAIILJHN_;
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
        if (other instanceof io.grasscutter.proto.MusicRecordOuterClass.MusicRecord) {
          return mergeFrom((io.grasscutter.proto.MusicRecordOuterClass.MusicRecord)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.grasscutter.proto.MusicRecordOuterClass.MusicRecord other) {
        if (other == io.grasscutter.proto.MusicRecordOuterClass.MusicRecord.getDefaultInstance()) return this;
        if (unk2700MBJFOAGKKDJBuilder_ == null) {
          if (!other.unk2700MBJFOAGKKDJ_.isEmpty()) {
            if (unk2700MBJFOAGKKDJ_.isEmpty()) {
              unk2700MBJFOAGKKDJ_ = other.unk2700MBJFOAGKKDJ_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureUnk2700MBJFOAGKKDJIsMutable();
              unk2700MBJFOAGKKDJ_.addAll(other.unk2700MBJFOAGKKDJ_);
            }
            onChanged();
          }
        } else {
          if (!other.unk2700MBJFOAGKKDJ_.isEmpty()) {
            if (unk2700MBJFOAGKKDJBuilder_.isEmpty()) {
              unk2700MBJFOAGKKDJBuilder_.dispose();
              unk2700MBJFOAGKKDJBuilder_ = null;
              unk2700MBJFOAGKKDJ_ = other.unk2700MBJFOAGKKDJ_;
              bitField0_ = (bitField0_ & ~0x00000001);
              unk2700MBJFOAGKKDJBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getUnk2700MBJFOAGKKDJFieldBuilder() : null;
            } else {
              unk2700MBJFOAGKKDJBuilder_.addAllMessages(other.unk2700MBJFOAGKKDJ_);
            }
          }
        }
        if (other.getUnk2700DFIBAIILJHN() != 0) {
          setUnk2700DFIBAIILJHN(other.getUnk2700DFIBAIILJHN());
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
        io.grasscutter.proto.MusicRecordOuterClass.MusicRecord parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.grasscutter.proto.MusicRecordOuterClass.MusicRecord) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<io.grasscutter.proto.Unk2700AAAMOFPACEA.Unk2700_AAAMOFPACEA> unk2700MBJFOAGKKDJ_ =
        java.util.Collections.emptyList();
      private void ensureUnk2700MBJFOAGKKDJIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          unk2700MBJFOAGKKDJ_ = new java.util.ArrayList<io.grasscutter.proto.Unk2700AAAMOFPACEA.Unk2700_AAAMOFPACEA>(unk2700MBJFOAGKKDJ_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          io.grasscutter.proto.Unk2700AAAMOFPACEA.Unk2700_AAAMOFPACEA, io.grasscutter.proto.Unk2700AAAMOFPACEA.Unk2700_AAAMOFPACEA.Builder, io.grasscutter.proto.Unk2700AAAMOFPACEA.Unk2700_AAAMOFPACEAOrBuilder> unk2700MBJFOAGKKDJBuilder_;

      /**
       * <code>repeated .Unk2700_AAAMOFPACEA Unk2700_MBJFOAGKKDJ = 4;</code>
       */
      public java.util.List<io.grasscutter.proto.Unk2700AAAMOFPACEA.Unk2700_AAAMOFPACEA> getUnk2700MBJFOAGKKDJList() {
        if (unk2700MBJFOAGKKDJBuilder_ == null) {
          return java.util.Collections.unmodifiableList(unk2700MBJFOAGKKDJ_);
        } else {
          return unk2700MBJFOAGKKDJBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .Unk2700_AAAMOFPACEA Unk2700_MBJFOAGKKDJ = 4;</code>
       */
      public int getUnk2700MBJFOAGKKDJCount() {
        if (unk2700MBJFOAGKKDJBuilder_ == null) {
          return unk2700MBJFOAGKKDJ_.size();
        } else {
          return unk2700MBJFOAGKKDJBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .Unk2700_AAAMOFPACEA Unk2700_MBJFOAGKKDJ = 4;</code>
       */
      public io.grasscutter.proto.Unk2700AAAMOFPACEA.Unk2700_AAAMOFPACEA getUnk2700MBJFOAGKKDJ(int index) {
        if (unk2700MBJFOAGKKDJBuilder_ == null) {
          return unk2700MBJFOAGKKDJ_.get(index);
        } else {
          return unk2700MBJFOAGKKDJBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .Unk2700_AAAMOFPACEA Unk2700_MBJFOAGKKDJ = 4;</code>
       */
      public Builder setUnk2700MBJFOAGKKDJ(
          int index, io.grasscutter.proto.Unk2700AAAMOFPACEA.Unk2700_AAAMOFPACEA value) {
        if (unk2700MBJFOAGKKDJBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureUnk2700MBJFOAGKKDJIsMutable();
          unk2700MBJFOAGKKDJ_.set(index, value);
          onChanged();
        } else {
          unk2700MBJFOAGKKDJBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .Unk2700_AAAMOFPACEA Unk2700_MBJFOAGKKDJ = 4;</code>
       */
      public Builder setUnk2700MBJFOAGKKDJ(
          int index, io.grasscutter.proto.Unk2700AAAMOFPACEA.Unk2700_AAAMOFPACEA.Builder builderForValue) {
        if (unk2700MBJFOAGKKDJBuilder_ == null) {
          ensureUnk2700MBJFOAGKKDJIsMutable();
          unk2700MBJFOAGKKDJ_.set(index, builderForValue.build());
          onChanged();
        } else {
          unk2700MBJFOAGKKDJBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Unk2700_AAAMOFPACEA Unk2700_MBJFOAGKKDJ = 4;</code>
       */
      public Builder addUnk2700MBJFOAGKKDJ(io.grasscutter.proto.Unk2700AAAMOFPACEA.Unk2700_AAAMOFPACEA value) {
        if (unk2700MBJFOAGKKDJBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureUnk2700MBJFOAGKKDJIsMutable();
          unk2700MBJFOAGKKDJ_.add(value);
          onChanged();
        } else {
          unk2700MBJFOAGKKDJBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .Unk2700_AAAMOFPACEA Unk2700_MBJFOAGKKDJ = 4;</code>
       */
      public Builder addUnk2700MBJFOAGKKDJ(
          int index, io.grasscutter.proto.Unk2700AAAMOFPACEA.Unk2700_AAAMOFPACEA value) {
        if (unk2700MBJFOAGKKDJBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureUnk2700MBJFOAGKKDJIsMutable();
          unk2700MBJFOAGKKDJ_.add(index, value);
          onChanged();
        } else {
          unk2700MBJFOAGKKDJBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .Unk2700_AAAMOFPACEA Unk2700_MBJFOAGKKDJ = 4;</code>
       */
      public Builder addUnk2700MBJFOAGKKDJ(
          io.grasscutter.proto.Unk2700AAAMOFPACEA.Unk2700_AAAMOFPACEA.Builder builderForValue) {
        if (unk2700MBJFOAGKKDJBuilder_ == null) {
          ensureUnk2700MBJFOAGKKDJIsMutable();
          unk2700MBJFOAGKKDJ_.add(builderForValue.build());
          onChanged();
        } else {
          unk2700MBJFOAGKKDJBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Unk2700_AAAMOFPACEA Unk2700_MBJFOAGKKDJ = 4;</code>
       */
      public Builder addUnk2700MBJFOAGKKDJ(
          int index, io.grasscutter.proto.Unk2700AAAMOFPACEA.Unk2700_AAAMOFPACEA.Builder builderForValue) {
        if (unk2700MBJFOAGKKDJBuilder_ == null) {
          ensureUnk2700MBJFOAGKKDJIsMutable();
          unk2700MBJFOAGKKDJ_.add(index, builderForValue.build());
          onChanged();
        } else {
          unk2700MBJFOAGKKDJBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Unk2700_AAAMOFPACEA Unk2700_MBJFOAGKKDJ = 4;</code>
       */
      public Builder addAllUnk2700MBJFOAGKKDJ(
          java.lang.Iterable<? extends io.grasscutter.proto.Unk2700AAAMOFPACEA.Unk2700_AAAMOFPACEA> values) {
        if (unk2700MBJFOAGKKDJBuilder_ == null) {
          ensureUnk2700MBJFOAGKKDJIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, unk2700MBJFOAGKKDJ_);
          onChanged();
        } else {
          unk2700MBJFOAGKKDJBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .Unk2700_AAAMOFPACEA Unk2700_MBJFOAGKKDJ = 4;</code>
       */
      public Builder clearUnk2700MBJFOAGKKDJ() {
        if (unk2700MBJFOAGKKDJBuilder_ == null) {
          unk2700MBJFOAGKKDJ_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          unk2700MBJFOAGKKDJBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .Unk2700_AAAMOFPACEA Unk2700_MBJFOAGKKDJ = 4;</code>
       */
      public Builder removeUnk2700MBJFOAGKKDJ(int index) {
        if (unk2700MBJFOAGKKDJBuilder_ == null) {
          ensureUnk2700MBJFOAGKKDJIsMutable();
          unk2700MBJFOAGKKDJ_.remove(index);
          onChanged();
        } else {
          unk2700MBJFOAGKKDJBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .Unk2700_AAAMOFPACEA Unk2700_MBJFOAGKKDJ = 4;</code>
       */
      public io.grasscutter.proto.Unk2700AAAMOFPACEA.Unk2700_AAAMOFPACEA.Builder getUnk2700MBJFOAGKKDJBuilder(
          int index) {
        return getUnk2700MBJFOAGKKDJFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .Unk2700_AAAMOFPACEA Unk2700_MBJFOAGKKDJ = 4;</code>
       */
      public io.grasscutter.proto.Unk2700AAAMOFPACEA.Unk2700_AAAMOFPACEAOrBuilder getUnk2700MBJFOAGKKDJOrBuilder(
          int index) {
        if (unk2700MBJFOAGKKDJBuilder_ == null) {
          return unk2700MBJFOAGKKDJ_.get(index);  } else {
          return unk2700MBJFOAGKKDJBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .Unk2700_AAAMOFPACEA Unk2700_MBJFOAGKKDJ = 4;</code>
       */
      public java.util.List<? extends io.grasscutter.proto.Unk2700AAAMOFPACEA.Unk2700_AAAMOFPACEAOrBuilder> 
           getUnk2700MBJFOAGKKDJOrBuilderList() {
        if (unk2700MBJFOAGKKDJBuilder_ != null) {
          return unk2700MBJFOAGKKDJBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(unk2700MBJFOAGKKDJ_);
        }
      }
      /**
       * <code>repeated .Unk2700_AAAMOFPACEA Unk2700_MBJFOAGKKDJ = 4;</code>
       */
      public io.grasscutter.proto.Unk2700AAAMOFPACEA.Unk2700_AAAMOFPACEA.Builder addUnk2700MBJFOAGKKDJBuilder() {
        return getUnk2700MBJFOAGKKDJFieldBuilder().addBuilder(
            io.grasscutter.proto.Unk2700AAAMOFPACEA.Unk2700_AAAMOFPACEA.getDefaultInstance());
      }
      /**
       * <code>repeated .Unk2700_AAAMOFPACEA Unk2700_MBJFOAGKKDJ = 4;</code>
       */
      public io.grasscutter.proto.Unk2700AAAMOFPACEA.Unk2700_AAAMOFPACEA.Builder addUnk2700MBJFOAGKKDJBuilder(
          int index) {
        return getUnk2700MBJFOAGKKDJFieldBuilder().addBuilder(
            index, io.grasscutter.proto.Unk2700AAAMOFPACEA.Unk2700_AAAMOFPACEA.getDefaultInstance());
      }
      /**
       * <code>repeated .Unk2700_AAAMOFPACEA Unk2700_MBJFOAGKKDJ = 4;</code>
       */
      public java.util.List<io.grasscutter.proto.Unk2700AAAMOFPACEA.Unk2700_AAAMOFPACEA.Builder> 
           getUnk2700MBJFOAGKKDJBuilderList() {
        return getUnk2700MBJFOAGKKDJFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          io.grasscutter.proto.Unk2700AAAMOFPACEA.Unk2700_AAAMOFPACEA, io.grasscutter.proto.Unk2700AAAMOFPACEA.Unk2700_AAAMOFPACEA.Builder, io.grasscutter.proto.Unk2700AAAMOFPACEA.Unk2700_AAAMOFPACEAOrBuilder> 
          getUnk2700MBJFOAGKKDJFieldBuilder() {
        if (unk2700MBJFOAGKKDJBuilder_ == null) {
          unk2700MBJFOAGKKDJBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              io.grasscutter.proto.Unk2700AAAMOFPACEA.Unk2700_AAAMOFPACEA, io.grasscutter.proto.Unk2700AAAMOFPACEA.Unk2700_AAAMOFPACEA.Builder, io.grasscutter.proto.Unk2700AAAMOFPACEA.Unk2700_AAAMOFPACEAOrBuilder>(
                  unk2700MBJFOAGKKDJ_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          unk2700MBJFOAGKKDJ_ = null;
        }
        return unk2700MBJFOAGKKDJBuilder_;
      }

      private int unk2700DFIBAIILJHN_ ;
      /**
       * <code>uint32 Unk2700_DFIBAIILJHN = 13;</code>
       * @return The unk2700DFIBAIILJHN.
       */
      @java.lang.Override
      public int getUnk2700DFIBAIILJHN() {
        return unk2700DFIBAIILJHN_;
      }
      /**
       * <code>uint32 Unk2700_DFIBAIILJHN = 13;</code>
       * @param value The unk2700DFIBAIILJHN to set.
       * @return This builder for chaining.
       */
      public Builder setUnk2700DFIBAIILJHN(int value) {
        
        unk2700DFIBAIILJHN_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk2700_DFIBAIILJHN = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk2700DFIBAIILJHN() {
        
        unk2700DFIBAIILJHN_ = 0;
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


      // @@protoc_insertion_point(builder_scope:MusicRecord)
    }

    // @@protoc_insertion_point(class_scope:MusicRecord)
    private static final io.grasscutter.proto.MusicRecordOuterClass.MusicRecord DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.grasscutter.proto.MusicRecordOuterClass.MusicRecord();
    }

    public static io.grasscutter.proto.MusicRecordOuterClass.MusicRecord getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MusicRecord>
        PARSER = new com.google.protobuf.AbstractParser<MusicRecord>() {
      @java.lang.Override
      public MusicRecord parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new MusicRecord(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<MusicRecord> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MusicRecord> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.grasscutter.proto.MusicRecordOuterClass.MusicRecord getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MusicRecord_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MusicRecord_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021MusicRecord.proto\032\031Unk2700_AAAMOFPACEA" +
      ".proto\"]\n\013MusicRecord\0221\n\023Unk2700_MBJFOAG" +
      "KKDJ\030\004 \003(\0132\024.Unk2700_AAAMOFPACEA\022\033\n\023Unk2" +
      "700_DFIBAIILJHN\030\r \001(\rB\026\n\024io.grasscutter." +
      "protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.grasscutter.proto.Unk2700AAAMOFPACEA.getDescriptor(),
        });
    internal_static_MusicRecord_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_MusicRecord_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MusicRecord_descriptor,
        new java.lang.String[] { "Unk2700MBJFOAGKKDJ", "Unk2700DFIBAIILJHN", });
    io.grasscutter.proto.Unk2700AAAMOFPACEA.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
