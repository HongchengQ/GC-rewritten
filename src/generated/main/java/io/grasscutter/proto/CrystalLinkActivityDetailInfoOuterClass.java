// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CrystalLinkActivityDetailInfo.proto

package io.grasscutter.proto;

public final class CrystalLinkActivityDetailInfoOuterClass {
  private CrystalLinkActivityDetailInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface CrystalLinkActivityDetailInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CrystalLinkActivityDetailInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .Unk2700_IOLMLCCBAKP Unk2700_FIKHCFMEOAJ = 3;</code>
     */
    java.util.List<io.grasscutter.proto.Unk2700IOLMLCCBAKP.Unk2700_IOLMLCCBAKP> 
        getUnk2700FIKHCFMEOAJList();
    /**
     * <code>repeated .Unk2700_IOLMLCCBAKP Unk2700_FIKHCFMEOAJ = 3;</code>
     */
    io.grasscutter.proto.Unk2700IOLMLCCBAKP.Unk2700_IOLMLCCBAKP getUnk2700FIKHCFMEOAJ(int index);
    /**
     * <code>repeated .Unk2700_IOLMLCCBAKP Unk2700_FIKHCFMEOAJ = 3;</code>
     */
    int getUnk2700FIKHCFMEOAJCount();
    /**
     * <code>repeated .Unk2700_IOLMLCCBAKP Unk2700_FIKHCFMEOAJ = 3;</code>
     */
    java.util.List<? extends io.grasscutter.proto.Unk2700IOLMLCCBAKP.Unk2700_IOLMLCCBAKPOrBuilder> 
        getUnk2700FIKHCFMEOAJOrBuilderList();
    /**
     * <code>repeated .Unk2700_IOLMLCCBAKP Unk2700_FIKHCFMEOAJ = 3;</code>
     */
    io.grasscutter.proto.Unk2700IOLMLCCBAKP.Unk2700_IOLMLCCBAKPOrBuilder getUnk2700FIKHCFMEOAJOrBuilder(
        int index);

    /**
     * <code>uint32 difficulty_id = 7;</code>
     * @return The difficultyId.
     */
    int getDifficultyId();
  }
  /**
   * Protobuf type {@code CrystalLinkActivityDetailInfo}
   */
  public static final class CrystalLinkActivityDetailInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CrystalLinkActivityDetailInfo)
      CrystalLinkActivityDetailInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CrystalLinkActivityDetailInfo.newBuilder() to construct.
    private CrystalLinkActivityDetailInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CrystalLinkActivityDetailInfo() {
      unk2700FIKHCFMEOAJ_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new CrystalLinkActivityDetailInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private CrystalLinkActivityDetailInfo(
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
            case 26: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                unk2700FIKHCFMEOAJ_ = new java.util.ArrayList<io.grasscutter.proto.Unk2700IOLMLCCBAKP.Unk2700_IOLMLCCBAKP>();
                mutable_bitField0_ |= 0x00000001;
              }
              unk2700FIKHCFMEOAJ_.add(
                  input.readMessage(io.grasscutter.proto.Unk2700IOLMLCCBAKP.Unk2700_IOLMLCCBAKP.parser(), extensionRegistry));
              break;
            }
            case 56: {

              difficultyId_ = input.readUInt32();
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
          unk2700FIKHCFMEOAJ_ = java.util.Collections.unmodifiableList(unk2700FIKHCFMEOAJ_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grasscutter.proto.CrystalLinkActivityDetailInfoOuterClass.internal_static_CrystalLinkActivityDetailInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.proto.CrystalLinkActivityDetailInfoOuterClass.internal_static_CrystalLinkActivityDetailInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.proto.CrystalLinkActivityDetailInfoOuterClass.CrystalLinkActivityDetailInfo.class, io.grasscutter.proto.CrystalLinkActivityDetailInfoOuterClass.CrystalLinkActivityDetailInfo.Builder.class);
    }

    public static final int UNK2700_FIKHCFMEOAJ_FIELD_NUMBER = 3;
    private java.util.List<io.grasscutter.proto.Unk2700IOLMLCCBAKP.Unk2700_IOLMLCCBAKP> unk2700FIKHCFMEOAJ_;
    /**
     * <code>repeated .Unk2700_IOLMLCCBAKP Unk2700_FIKHCFMEOAJ = 3;</code>
     */
    @java.lang.Override
    public java.util.List<io.grasscutter.proto.Unk2700IOLMLCCBAKP.Unk2700_IOLMLCCBAKP> getUnk2700FIKHCFMEOAJList() {
      return unk2700FIKHCFMEOAJ_;
    }
    /**
     * <code>repeated .Unk2700_IOLMLCCBAKP Unk2700_FIKHCFMEOAJ = 3;</code>
     */
    @java.lang.Override
    public java.util.List<? extends io.grasscutter.proto.Unk2700IOLMLCCBAKP.Unk2700_IOLMLCCBAKPOrBuilder> 
        getUnk2700FIKHCFMEOAJOrBuilderList() {
      return unk2700FIKHCFMEOAJ_;
    }
    /**
     * <code>repeated .Unk2700_IOLMLCCBAKP Unk2700_FIKHCFMEOAJ = 3;</code>
     */
    @java.lang.Override
    public int getUnk2700FIKHCFMEOAJCount() {
      return unk2700FIKHCFMEOAJ_.size();
    }
    /**
     * <code>repeated .Unk2700_IOLMLCCBAKP Unk2700_FIKHCFMEOAJ = 3;</code>
     */
    @java.lang.Override
    public io.grasscutter.proto.Unk2700IOLMLCCBAKP.Unk2700_IOLMLCCBAKP getUnk2700FIKHCFMEOAJ(int index) {
      return unk2700FIKHCFMEOAJ_.get(index);
    }
    /**
     * <code>repeated .Unk2700_IOLMLCCBAKP Unk2700_FIKHCFMEOAJ = 3;</code>
     */
    @java.lang.Override
    public io.grasscutter.proto.Unk2700IOLMLCCBAKP.Unk2700_IOLMLCCBAKPOrBuilder getUnk2700FIKHCFMEOAJOrBuilder(
        int index) {
      return unk2700FIKHCFMEOAJ_.get(index);
    }

    public static final int DIFFICULTY_ID_FIELD_NUMBER = 7;
    private int difficultyId_;
    /**
     * <code>uint32 difficulty_id = 7;</code>
     * @return The difficultyId.
     */
    @java.lang.Override
    public int getDifficultyId() {
      return difficultyId_;
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
      for (int i = 0; i < unk2700FIKHCFMEOAJ_.size(); i++) {
        output.writeMessage(3, unk2700FIKHCFMEOAJ_.get(i));
      }
      if (difficultyId_ != 0) {
        output.writeUInt32(7, difficultyId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < unk2700FIKHCFMEOAJ_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, unk2700FIKHCFMEOAJ_.get(i));
      }
      if (difficultyId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, difficultyId_);
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
      if (!(obj instanceof io.grasscutter.proto.CrystalLinkActivityDetailInfoOuterClass.CrystalLinkActivityDetailInfo)) {
        return super.equals(obj);
      }
      io.grasscutter.proto.CrystalLinkActivityDetailInfoOuterClass.CrystalLinkActivityDetailInfo other = (io.grasscutter.proto.CrystalLinkActivityDetailInfoOuterClass.CrystalLinkActivityDetailInfo) obj;

      if (!getUnk2700FIKHCFMEOAJList()
          .equals(other.getUnk2700FIKHCFMEOAJList())) return false;
      if (getDifficultyId()
          != other.getDifficultyId()) return false;
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
      if (getUnk2700FIKHCFMEOAJCount() > 0) {
        hash = (37 * hash) + UNK2700_FIKHCFMEOAJ_FIELD_NUMBER;
        hash = (53 * hash) + getUnk2700FIKHCFMEOAJList().hashCode();
      }
      hash = (37 * hash) + DIFFICULTY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getDifficultyId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.grasscutter.proto.CrystalLinkActivityDetailInfoOuterClass.CrystalLinkActivityDetailInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.CrystalLinkActivityDetailInfoOuterClass.CrystalLinkActivityDetailInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.CrystalLinkActivityDetailInfoOuterClass.CrystalLinkActivityDetailInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.CrystalLinkActivityDetailInfoOuterClass.CrystalLinkActivityDetailInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.CrystalLinkActivityDetailInfoOuterClass.CrystalLinkActivityDetailInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.CrystalLinkActivityDetailInfoOuterClass.CrystalLinkActivityDetailInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.CrystalLinkActivityDetailInfoOuterClass.CrystalLinkActivityDetailInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.CrystalLinkActivityDetailInfoOuterClass.CrystalLinkActivityDetailInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.CrystalLinkActivityDetailInfoOuterClass.CrystalLinkActivityDetailInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.CrystalLinkActivityDetailInfoOuterClass.CrystalLinkActivityDetailInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.CrystalLinkActivityDetailInfoOuterClass.CrystalLinkActivityDetailInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.CrystalLinkActivityDetailInfoOuterClass.CrystalLinkActivityDetailInfo parseFrom(
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
    public static Builder newBuilder(io.grasscutter.proto.CrystalLinkActivityDetailInfoOuterClass.CrystalLinkActivityDetailInfo prototype) {
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
     * Protobuf type {@code CrystalLinkActivityDetailInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CrystalLinkActivityDetailInfo)
        io.grasscutter.proto.CrystalLinkActivityDetailInfoOuterClass.CrystalLinkActivityDetailInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.grasscutter.proto.CrystalLinkActivityDetailInfoOuterClass.internal_static_CrystalLinkActivityDetailInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.grasscutter.proto.CrystalLinkActivityDetailInfoOuterClass.internal_static_CrystalLinkActivityDetailInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.grasscutter.proto.CrystalLinkActivityDetailInfoOuterClass.CrystalLinkActivityDetailInfo.class, io.grasscutter.proto.CrystalLinkActivityDetailInfoOuterClass.CrystalLinkActivityDetailInfo.Builder.class);
      }

      // Construct using io.grasscutter.proto.CrystalLinkActivityDetailInfoOuterClass.CrystalLinkActivityDetailInfo.newBuilder()
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
          getUnk2700FIKHCFMEOAJFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (unk2700FIKHCFMEOAJBuilder_ == null) {
          unk2700FIKHCFMEOAJ_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          unk2700FIKHCFMEOAJBuilder_.clear();
        }
        difficultyId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.grasscutter.proto.CrystalLinkActivityDetailInfoOuterClass.internal_static_CrystalLinkActivityDetailInfo_descriptor;
      }

      @java.lang.Override
      public io.grasscutter.proto.CrystalLinkActivityDetailInfoOuterClass.CrystalLinkActivityDetailInfo getDefaultInstanceForType() {
        return io.grasscutter.proto.CrystalLinkActivityDetailInfoOuterClass.CrystalLinkActivityDetailInfo.getDefaultInstance();
      }

      @java.lang.Override
      public io.grasscutter.proto.CrystalLinkActivityDetailInfoOuterClass.CrystalLinkActivityDetailInfo build() {
        io.grasscutter.proto.CrystalLinkActivityDetailInfoOuterClass.CrystalLinkActivityDetailInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.grasscutter.proto.CrystalLinkActivityDetailInfoOuterClass.CrystalLinkActivityDetailInfo buildPartial() {
        io.grasscutter.proto.CrystalLinkActivityDetailInfoOuterClass.CrystalLinkActivityDetailInfo result = new io.grasscutter.proto.CrystalLinkActivityDetailInfoOuterClass.CrystalLinkActivityDetailInfo(this);
        int from_bitField0_ = bitField0_;
        if (unk2700FIKHCFMEOAJBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            unk2700FIKHCFMEOAJ_ = java.util.Collections.unmodifiableList(unk2700FIKHCFMEOAJ_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.unk2700FIKHCFMEOAJ_ = unk2700FIKHCFMEOAJ_;
        } else {
          result.unk2700FIKHCFMEOAJ_ = unk2700FIKHCFMEOAJBuilder_.build();
        }
        result.difficultyId_ = difficultyId_;
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
        if (other instanceof io.grasscutter.proto.CrystalLinkActivityDetailInfoOuterClass.CrystalLinkActivityDetailInfo) {
          return mergeFrom((io.grasscutter.proto.CrystalLinkActivityDetailInfoOuterClass.CrystalLinkActivityDetailInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.grasscutter.proto.CrystalLinkActivityDetailInfoOuterClass.CrystalLinkActivityDetailInfo other) {
        if (other == io.grasscutter.proto.CrystalLinkActivityDetailInfoOuterClass.CrystalLinkActivityDetailInfo.getDefaultInstance()) return this;
        if (unk2700FIKHCFMEOAJBuilder_ == null) {
          if (!other.unk2700FIKHCFMEOAJ_.isEmpty()) {
            if (unk2700FIKHCFMEOAJ_.isEmpty()) {
              unk2700FIKHCFMEOAJ_ = other.unk2700FIKHCFMEOAJ_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureUnk2700FIKHCFMEOAJIsMutable();
              unk2700FIKHCFMEOAJ_.addAll(other.unk2700FIKHCFMEOAJ_);
            }
            onChanged();
          }
        } else {
          if (!other.unk2700FIKHCFMEOAJ_.isEmpty()) {
            if (unk2700FIKHCFMEOAJBuilder_.isEmpty()) {
              unk2700FIKHCFMEOAJBuilder_.dispose();
              unk2700FIKHCFMEOAJBuilder_ = null;
              unk2700FIKHCFMEOAJ_ = other.unk2700FIKHCFMEOAJ_;
              bitField0_ = (bitField0_ & ~0x00000001);
              unk2700FIKHCFMEOAJBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getUnk2700FIKHCFMEOAJFieldBuilder() : null;
            } else {
              unk2700FIKHCFMEOAJBuilder_.addAllMessages(other.unk2700FIKHCFMEOAJ_);
            }
          }
        }
        if (other.getDifficultyId() != 0) {
          setDifficultyId(other.getDifficultyId());
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
        io.grasscutter.proto.CrystalLinkActivityDetailInfoOuterClass.CrystalLinkActivityDetailInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.grasscutter.proto.CrystalLinkActivityDetailInfoOuterClass.CrystalLinkActivityDetailInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<io.grasscutter.proto.Unk2700IOLMLCCBAKP.Unk2700_IOLMLCCBAKP> unk2700FIKHCFMEOAJ_ =
        java.util.Collections.emptyList();
      private void ensureUnk2700FIKHCFMEOAJIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          unk2700FIKHCFMEOAJ_ = new java.util.ArrayList<io.grasscutter.proto.Unk2700IOLMLCCBAKP.Unk2700_IOLMLCCBAKP>(unk2700FIKHCFMEOAJ_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          io.grasscutter.proto.Unk2700IOLMLCCBAKP.Unk2700_IOLMLCCBAKP, io.grasscutter.proto.Unk2700IOLMLCCBAKP.Unk2700_IOLMLCCBAKP.Builder, io.grasscutter.proto.Unk2700IOLMLCCBAKP.Unk2700_IOLMLCCBAKPOrBuilder> unk2700FIKHCFMEOAJBuilder_;

      /**
       * <code>repeated .Unk2700_IOLMLCCBAKP Unk2700_FIKHCFMEOAJ = 3;</code>
       */
      public java.util.List<io.grasscutter.proto.Unk2700IOLMLCCBAKP.Unk2700_IOLMLCCBAKP> getUnk2700FIKHCFMEOAJList() {
        if (unk2700FIKHCFMEOAJBuilder_ == null) {
          return java.util.Collections.unmodifiableList(unk2700FIKHCFMEOAJ_);
        } else {
          return unk2700FIKHCFMEOAJBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .Unk2700_IOLMLCCBAKP Unk2700_FIKHCFMEOAJ = 3;</code>
       */
      public int getUnk2700FIKHCFMEOAJCount() {
        if (unk2700FIKHCFMEOAJBuilder_ == null) {
          return unk2700FIKHCFMEOAJ_.size();
        } else {
          return unk2700FIKHCFMEOAJBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .Unk2700_IOLMLCCBAKP Unk2700_FIKHCFMEOAJ = 3;</code>
       */
      public io.grasscutter.proto.Unk2700IOLMLCCBAKP.Unk2700_IOLMLCCBAKP getUnk2700FIKHCFMEOAJ(int index) {
        if (unk2700FIKHCFMEOAJBuilder_ == null) {
          return unk2700FIKHCFMEOAJ_.get(index);
        } else {
          return unk2700FIKHCFMEOAJBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .Unk2700_IOLMLCCBAKP Unk2700_FIKHCFMEOAJ = 3;</code>
       */
      public Builder setUnk2700FIKHCFMEOAJ(
          int index, io.grasscutter.proto.Unk2700IOLMLCCBAKP.Unk2700_IOLMLCCBAKP value) {
        if (unk2700FIKHCFMEOAJBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureUnk2700FIKHCFMEOAJIsMutable();
          unk2700FIKHCFMEOAJ_.set(index, value);
          onChanged();
        } else {
          unk2700FIKHCFMEOAJBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .Unk2700_IOLMLCCBAKP Unk2700_FIKHCFMEOAJ = 3;</code>
       */
      public Builder setUnk2700FIKHCFMEOAJ(
          int index, io.grasscutter.proto.Unk2700IOLMLCCBAKP.Unk2700_IOLMLCCBAKP.Builder builderForValue) {
        if (unk2700FIKHCFMEOAJBuilder_ == null) {
          ensureUnk2700FIKHCFMEOAJIsMutable();
          unk2700FIKHCFMEOAJ_.set(index, builderForValue.build());
          onChanged();
        } else {
          unk2700FIKHCFMEOAJBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Unk2700_IOLMLCCBAKP Unk2700_FIKHCFMEOAJ = 3;</code>
       */
      public Builder addUnk2700FIKHCFMEOAJ(io.grasscutter.proto.Unk2700IOLMLCCBAKP.Unk2700_IOLMLCCBAKP value) {
        if (unk2700FIKHCFMEOAJBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureUnk2700FIKHCFMEOAJIsMutable();
          unk2700FIKHCFMEOAJ_.add(value);
          onChanged();
        } else {
          unk2700FIKHCFMEOAJBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .Unk2700_IOLMLCCBAKP Unk2700_FIKHCFMEOAJ = 3;</code>
       */
      public Builder addUnk2700FIKHCFMEOAJ(
          int index, io.grasscutter.proto.Unk2700IOLMLCCBAKP.Unk2700_IOLMLCCBAKP value) {
        if (unk2700FIKHCFMEOAJBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureUnk2700FIKHCFMEOAJIsMutable();
          unk2700FIKHCFMEOAJ_.add(index, value);
          onChanged();
        } else {
          unk2700FIKHCFMEOAJBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .Unk2700_IOLMLCCBAKP Unk2700_FIKHCFMEOAJ = 3;</code>
       */
      public Builder addUnk2700FIKHCFMEOAJ(
          io.grasscutter.proto.Unk2700IOLMLCCBAKP.Unk2700_IOLMLCCBAKP.Builder builderForValue) {
        if (unk2700FIKHCFMEOAJBuilder_ == null) {
          ensureUnk2700FIKHCFMEOAJIsMutable();
          unk2700FIKHCFMEOAJ_.add(builderForValue.build());
          onChanged();
        } else {
          unk2700FIKHCFMEOAJBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Unk2700_IOLMLCCBAKP Unk2700_FIKHCFMEOAJ = 3;</code>
       */
      public Builder addUnk2700FIKHCFMEOAJ(
          int index, io.grasscutter.proto.Unk2700IOLMLCCBAKP.Unk2700_IOLMLCCBAKP.Builder builderForValue) {
        if (unk2700FIKHCFMEOAJBuilder_ == null) {
          ensureUnk2700FIKHCFMEOAJIsMutable();
          unk2700FIKHCFMEOAJ_.add(index, builderForValue.build());
          onChanged();
        } else {
          unk2700FIKHCFMEOAJBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Unk2700_IOLMLCCBAKP Unk2700_FIKHCFMEOAJ = 3;</code>
       */
      public Builder addAllUnk2700FIKHCFMEOAJ(
          java.lang.Iterable<? extends io.grasscutter.proto.Unk2700IOLMLCCBAKP.Unk2700_IOLMLCCBAKP> values) {
        if (unk2700FIKHCFMEOAJBuilder_ == null) {
          ensureUnk2700FIKHCFMEOAJIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, unk2700FIKHCFMEOAJ_);
          onChanged();
        } else {
          unk2700FIKHCFMEOAJBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .Unk2700_IOLMLCCBAKP Unk2700_FIKHCFMEOAJ = 3;</code>
       */
      public Builder clearUnk2700FIKHCFMEOAJ() {
        if (unk2700FIKHCFMEOAJBuilder_ == null) {
          unk2700FIKHCFMEOAJ_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          unk2700FIKHCFMEOAJBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .Unk2700_IOLMLCCBAKP Unk2700_FIKHCFMEOAJ = 3;</code>
       */
      public Builder removeUnk2700FIKHCFMEOAJ(int index) {
        if (unk2700FIKHCFMEOAJBuilder_ == null) {
          ensureUnk2700FIKHCFMEOAJIsMutable();
          unk2700FIKHCFMEOAJ_.remove(index);
          onChanged();
        } else {
          unk2700FIKHCFMEOAJBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .Unk2700_IOLMLCCBAKP Unk2700_FIKHCFMEOAJ = 3;</code>
       */
      public io.grasscutter.proto.Unk2700IOLMLCCBAKP.Unk2700_IOLMLCCBAKP.Builder getUnk2700FIKHCFMEOAJBuilder(
          int index) {
        return getUnk2700FIKHCFMEOAJFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .Unk2700_IOLMLCCBAKP Unk2700_FIKHCFMEOAJ = 3;</code>
       */
      public io.grasscutter.proto.Unk2700IOLMLCCBAKP.Unk2700_IOLMLCCBAKPOrBuilder getUnk2700FIKHCFMEOAJOrBuilder(
          int index) {
        if (unk2700FIKHCFMEOAJBuilder_ == null) {
          return unk2700FIKHCFMEOAJ_.get(index);  } else {
          return unk2700FIKHCFMEOAJBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .Unk2700_IOLMLCCBAKP Unk2700_FIKHCFMEOAJ = 3;</code>
       */
      public java.util.List<? extends io.grasscutter.proto.Unk2700IOLMLCCBAKP.Unk2700_IOLMLCCBAKPOrBuilder> 
           getUnk2700FIKHCFMEOAJOrBuilderList() {
        if (unk2700FIKHCFMEOAJBuilder_ != null) {
          return unk2700FIKHCFMEOAJBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(unk2700FIKHCFMEOAJ_);
        }
      }
      /**
       * <code>repeated .Unk2700_IOLMLCCBAKP Unk2700_FIKHCFMEOAJ = 3;</code>
       */
      public io.grasscutter.proto.Unk2700IOLMLCCBAKP.Unk2700_IOLMLCCBAKP.Builder addUnk2700FIKHCFMEOAJBuilder() {
        return getUnk2700FIKHCFMEOAJFieldBuilder().addBuilder(
            io.grasscutter.proto.Unk2700IOLMLCCBAKP.Unk2700_IOLMLCCBAKP.getDefaultInstance());
      }
      /**
       * <code>repeated .Unk2700_IOLMLCCBAKP Unk2700_FIKHCFMEOAJ = 3;</code>
       */
      public io.grasscutter.proto.Unk2700IOLMLCCBAKP.Unk2700_IOLMLCCBAKP.Builder addUnk2700FIKHCFMEOAJBuilder(
          int index) {
        return getUnk2700FIKHCFMEOAJFieldBuilder().addBuilder(
            index, io.grasscutter.proto.Unk2700IOLMLCCBAKP.Unk2700_IOLMLCCBAKP.getDefaultInstance());
      }
      /**
       * <code>repeated .Unk2700_IOLMLCCBAKP Unk2700_FIKHCFMEOAJ = 3;</code>
       */
      public java.util.List<io.grasscutter.proto.Unk2700IOLMLCCBAKP.Unk2700_IOLMLCCBAKP.Builder> 
           getUnk2700FIKHCFMEOAJBuilderList() {
        return getUnk2700FIKHCFMEOAJFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          io.grasscutter.proto.Unk2700IOLMLCCBAKP.Unk2700_IOLMLCCBAKP, io.grasscutter.proto.Unk2700IOLMLCCBAKP.Unk2700_IOLMLCCBAKP.Builder, io.grasscutter.proto.Unk2700IOLMLCCBAKP.Unk2700_IOLMLCCBAKPOrBuilder> 
          getUnk2700FIKHCFMEOAJFieldBuilder() {
        if (unk2700FIKHCFMEOAJBuilder_ == null) {
          unk2700FIKHCFMEOAJBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              io.grasscutter.proto.Unk2700IOLMLCCBAKP.Unk2700_IOLMLCCBAKP, io.grasscutter.proto.Unk2700IOLMLCCBAKP.Unk2700_IOLMLCCBAKP.Builder, io.grasscutter.proto.Unk2700IOLMLCCBAKP.Unk2700_IOLMLCCBAKPOrBuilder>(
                  unk2700FIKHCFMEOAJ_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          unk2700FIKHCFMEOAJ_ = null;
        }
        return unk2700FIKHCFMEOAJBuilder_;
      }

      private int difficultyId_ ;
      /**
       * <code>uint32 difficulty_id = 7;</code>
       * @return The difficultyId.
       */
      @java.lang.Override
      public int getDifficultyId() {
        return difficultyId_;
      }
      /**
       * <code>uint32 difficulty_id = 7;</code>
       * @param value The difficultyId to set.
       * @return This builder for chaining.
       */
      public Builder setDifficultyId(int value) {
        
        difficultyId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 difficulty_id = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearDifficultyId() {
        
        difficultyId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:CrystalLinkActivityDetailInfo)
    }

    // @@protoc_insertion_point(class_scope:CrystalLinkActivityDetailInfo)
    private static final io.grasscutter.proto.CrystalLinkActivityDetailInfoOuterClass.CrystalLinkActivityDetailInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.grasscutter.proto.CrystalLinkActivityDetailInfoOuterClass.CrystalLinkActivityDetailInfo();
    }

    public static io.grasscutter.proto.CrystalLinkActivityDetailInfoOuterClass.CrystalLinkActivityDetailInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<CrystalLinkActivityDetailInfo>
        PARSER = new com.google.protobuf.AbstractParser<CrystalLinkActivityDetailInfo>() {
      @java.lang.Override
      public CrystalLinkActivityDetailInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new CrystalLinkActivityDetailInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<CrystalLinkActivityDetailInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CrystalLinkActivityDetailInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.grasscutter.proto.CrystalLinkActivityDetailInfoOuterClass.CrystalLinkActivityDetailInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CrystalLinkActivityDetailInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CrystalLinkActivityDetailInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#CrystalLinkActivityDetailInfo.proto\032\031U" +
      "nk2700_IOLMLCCBAKP.proto\"i\n\035CrystalLinkA" +
      "ctivityDetailInfo\0221\n\023Unk2700_FIKHCFMEOAJ" +
      "\030\003 \003(\0132\024.Unk2700_IOLMLCCBAKP\022\025\n\rdifficul" +
      "ty_id\030\007 \001(\rB\026\n\024io.grasscutter.protob\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.grasscutter.proto.Unk2700IOLMLCCBAKP.getDescriptor(),
        });
    internal_static_CrystalLinkActivityDetailInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_CrystalLinkActivityDetailInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CrystalLinkActivityDetailInfo_descriptor,
        new java.lang.String[] { "Unk2700FIKHCFMEOAJ", "DifficultyId", });
    io.grasscutter.proto.Unk2700IOLMLCCBAKP.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
