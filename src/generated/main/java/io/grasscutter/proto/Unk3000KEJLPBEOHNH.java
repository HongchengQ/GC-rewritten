// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk3000_KEJLPBEOHNH.proto

package io.grasscutter.proto;

public final class Unk3000KEJLPBEOHNH {
  private Unk3000KEJLPBEOHNH() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Unk3000_KEJLPBEOHNHOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Unk3000_KEJLPBEOHNH)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .Unk3000_JACOCADDNFE avatar_info_list = 13;</code>
     */
    java.util.List<io.grasscutter.proto.Unk3000JACOCADDNFE.Unk3000_JACOCADDNFE> 
        getAvatarInfoListList();
    /**
     * <code>repeated .Unk3000_JACOCADDNFE avatar_info_list = 13;</code>
     */
    io.grasscutter.proto.Unk3000JACOCADDNFE.Unk3000_JACOCADDNFE getAvatarInfoList(int index);
    /**
     * <code>repeated .Unk3000_JACOCADDNFE avatar_info_list = 13;</code>
     */
    int getAvatarInfoListCount();
    /**
     * <code>repeated .Unk3000_JACOCADDNFE avatar_info_list = 13;</code>
     */
    java.util.List<? extends io.grasscutter.proto.Unk3000JACOCADDNFE.Unk3000_JACOCADDNFEOrBuilder> 
        getAvatarInfoListOrBuilderList();
    /**
     * <code>repeated .Unk3000_JACOCADDNFE avatar_info_list = 13;</code>
     */
    io.grasscutter.proto.Unk3000JACOCADDNFE.Unk3000_JACOCADDNFEOrBuilder getAvatarInfoListOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code Unk3000_KEJLPBEOHNH}
   */
  public static final class Unk3000_KEJLPBEOHNH extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Unk3000_KEJLPBEOHNH)
      Unk3000_KEJLPBEOHNHOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Unk3000_KEJLPBEOHNH.newBuilder() to construct.
    private Unk3000_KEJLPBEOHNH(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Unk3000_KEJLPBEOHNH() {
      avatarInfoList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Unk3000_KEJLPBEOHNH();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Unk3000_KEJLPBEOHNH(
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
            case 106: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                avatarInfoList_ = new java.util.ArrayList<io.grasscutter.proto.Unk3000JACOCADDNFE.Unk3000_JACOCADDNFE>();
                mutable_bitField0_ |= 0x00000001;
              }
              avatarInfoList_.add(
                  input.readMessage(io.grasscutter.proto.Unk3000JACOCADDNFE.Unk3000_JACOCADDNFE.parser(), extensionRegistry));
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
          avatarInfoList_ = java.util.Collections.unmodifiableList(avatarInfoList_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grasscutter.proto.Unk3000KEJLPBEOHNH.internal_static_Unk3000_KEJLPBEOHNH_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.proto.Unk3000KEJLPBEOHNH.internal_static_Unk3000_KEJLPBEOHNH_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.proto.Unk3000KEJLPBEOHNH.Unk3000_KEJLPBEOHNH.class, io.grasscutter.proto.Unk3000KEJLPBEOHNH.Unk3000_KEJLPBEOHNH.Builder.class);
    }

    public static final int AVATAR_INFO_LIST_FIELD_NUMBER = 13;
    private java.util.List<io.grasscutter.proto.Unk3000JACOCADDNFE.Unk3000_JACOCADDNFE> avatarInfoList_;
    /**
     * <code>repeated .Unk3000_JACOCADDNFE avatar_info_list = 13;</code>
     */
    @java.lang.Override
    public java.util.List<io.grasscutter.proto.Unk3000JACOCADDNFE.Unk3000_JACOCADDNFE> getAvatarInfoListList() {
      return avatarInfoList_;
    }
    /**
     * <code>repeated .Unk3000_JACOCADDNFE avatar_info_list = 13;</code>
     */
    @java.lang.Override
    public java.util.List<? extends io.grasscutter.proto.Unk3000JACOCADDNFE.Unk3000_JACOCADDNFEOrBuilder> 
        getAvatarInfoListOrBuilderList() {
      return avatarInfoList_;
    }
    /**
     * <code>repeated .Unk3000_JACOCADDNFE avatar_info_list = 13;</code>
     */
    @java.lang.Override
    public int getAvatarInfoListCount() {
      return avatarInfoList_.size();
    }
    /**
     * <code>repeated .Unk3000_JACOCADDNFE avatar_info_list = 13;</code>
     */
    @java.lang.Override
    public io.grasscutter.proto.Unk3000JACOCADDNFE.Unk3000_JACOCADDNFE getAvatarInfoList(int index) {
      return avatarInfoList_.get(index);
    }
    /**
     * <code>repeated .Unk3000_JACOCADDNFE avatar_info_list = 13;</code>
     */
    @java.lang.Override
    public io.grasscutter.proto.Unk3000JACOCADDNFE.Unk3000_JACOCADDNFEOrBuilder getAvatarInfoListOrBuilder(
        int index) {
      return avatarInfoList_.get(index);
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
      for (int i = 0; i < avatarInfoList_.size(); i++) {
        output.writeMessage(13, avatarInfoList_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < avatarInfoList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(13, avatarInfoList_.get(i));
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
      if (!(obj instanceof io.grasscutter.proto.Unk3000KEJLPBEOHNH.Unk3000_KEJLPBEOHNH)) {
        return super.equals(obj);
      }
      io.grasscutter.proto.Unk3000KEJLPBEOHNH.Unk3000_KEJLPBEOHNH other = (io.grasscutter.proto.Unk3000KEJLPBEOHNH.Unk3000_KEJLPBEOHNH) obj;

      if (!getAvatarInfoListList()
          .equals(other.getAvatarInfoListList())) return false;
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
      if (getAvatarInfoListCount() > 0) {
        hash = (37 * hash) + AVATAR_INFO_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getAvatarInfoListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.grasscutter.proto.Unk3000KEJLPBEOHNH.Unk3000_KEJLPBEOHNH parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.Unk3000KEJLPBEOHNH.Unk3000_KEJLPBEOHNH parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.Unk3000KEJLPBEOHNH.Unk3000_KEJLPBEOHNH parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.Unk3000KEJLPBEOHNH.Unk3000_KEJLPBEOHNH parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.Unk3000KEJLPBEOHNH.Unk3000_KEJLPBEOHNH parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.Unk3000KEJLPBEOHNH.Unk3000_KEJLPBEOHNH parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.Unk3000KEJLPBEOHNH.Unk3000_KEJLPBEOHNH parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.Unk3000KEJLPBEOHNH.Unk3000_KEJLPBEOHNH parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.Unk3000KEJLPBEOHNH.Unk3000_KEJLPBEOHNH parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.Unk3000KEJLPBEOHNH.Unk3000_KEJLPBEOHNH parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.Unk3000KEJLPBEOHNH.Unk3000_KEJLPBEOHNH parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.Unk3000KEJLPBEOHNH.Unk3000_KEJLPBEOHNH parseFrom(
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
    public static Builder newBuilder(io.grasscutter.proto.Unk3000KEJLPBEOHNH.Unk3000_KEJLPBEOHNH prototype) {
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
     * Protobuf type {@code Unk3000_KEJLPBEOHNH}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Unk3000_KEJLPBEOHNH)
        io.grasscutter.proto.Unk3000KEJLPBEOHNH.Unk3000_KEJLPBEOHNHOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.grasscutter.proto.Unk3000KEJLPBEOHNH.internal_static_Unk3000_KEJLPBEOHNH_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.grasscutter.proto.Unk3000KEJLPBEOHNH.internal_static_Unk3000_KEJLPBEOHNH_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.grasscutter.proto.Unk3000KEJLPBEOHNH.Unk3000_KEJLPBEOHNH.class, io.grasscutter.proto.Unk3000KEJLPBEOHNH.Unk3000_KEJLPBEOHNH.Builder.class);
      }

      // Construct using io.grasscutter.proto.Unk3000KEJLPBEOHNH.Unk3000_KEJLPBEOHNH.newBuilder()
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
          getAvatarInfoListFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (avatarInfoListBuilder_ == null) {
          avatarInfoList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          avatarInfoListBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.grasscutter.proto.Unk3000KEJLPBEOHNH.internal_static_Unk3000_KEJLPBEOHNH_descriptor;
      }

      @java.lang.Override
      public io.grasscutter.proto.Unk3000KEJLPBEOHNH.Unk3000_KEJLPBEOHNH getDefaultInstanceForType() {
        return io.grasscutter.proto.Unk3000KEJLPBEOHNH.Unk3000_KEJLPBEOHNH.getDefaultInstance();
      }

      @java.lang.Override
      public io.grasscutter.proto.Unk3000KEJLPBEOHNH.Unk3000_KEJLPBEOHNH build() {
        io.grasscutter.proto.Unk3000KEJLPBEOHNH.Unk3000_KEJLPBEOHNH result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.grasscutter.proto.Unk3000KEJLPBEOHNH.Unk3000_KEJLPBEOHNH buildPartial() {
        io.grasscutter.proto.Unk3000KEJLPBEOHNH.Unk3000_KEJLPBEOHNH result = new io.grasscutter.proto.Unk3000KEJLPBEOHNH.Unk3000_KEJLPBEOHNH(this);
        int from_bitField0_ = bitField0_;
        if (avatarInfoListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            avatarInfoList_ = java.util.Collections.unmodifiableList(avatarInfoList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.avatarInfoList_ = avatarInfoList_;
        } else {
          result.avatarInfoList_ = avatarInfoListBuilder_.build();
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
        if (other instanceof io.grasscutter.proto.Unk3000KEJLPBEOHNH.Unk3000_KEJLPBEOHNH) {
          return mergeFrom((io.grasscutter.proto.Unk3000KEJLPBEOHNH.Unk3000_KEJLPBEOHNH)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.grasscutter.proto.Unk3000KEJLPBEOHNH.Unk3000_KEJLPBEOHNH other) {
        if (other == io.grasscutter.proto.Unk3000KEJLPBEOHNH.Unk3000_KEJLPBEOHNH.getDefaultInstance()) return this;
        if (avatarInfoListBuilder_ == null) {
          if (!other.avatarInfoList_.isEmpty()) {
            if (avatarInfoList_.isEmpty()) {
              avatarInfoList_ = other.avatarInfoList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureAvatarInfoListIsMutable();
              avatarInfoList_.addAll(other.avatarInfoList_);
            }
            onChanged();
          }
        } else {
          if (!other.avatarInfoList_.isEmpty()) {
            if (avatarInfoListBuilder_.isEmpty()) {
              avatarInfoListBuilder_.dispose();
              avatarInfoListBuilder_ = null;
              avatarInfoList_ = other.avatarInfoList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              avatarInfoListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getAvatarInfoListFieldBuilder() : null;
            } else {
              avatarInfoListBuilder_.addAllMessages(other.avatarInfoList_);
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
        io.grasscutter.proto.Unk3000KEJLPBEOHNH.Unk3000_KEJLPBEOHNH parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.grasscutter.proto.Unk3000KEJLPBEOHNH.Unk3000_KEJLPBEOHNH) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<io.grasscutter.proto.Unk3000JACOCADDNFE.Unk3000_JACOCADDNFE> avatarInfoList_ =
        java.util.Collections.emptyList();
      private void ensureAvatarInfoListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          avatarInfoList_ = new java.util.ArrayList<io.grasscutter.proto.Unk3000JACOCADDNFE.Unk3000_JACOCADDNFE>(avatarInfoList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          io.grasscutter.proto.Unk3000JACOCADDNFE.Unk3000_JACOCADDNFE, io.grasscutter.proto.Unk3000JACOCADDNFE.Unk3000_JACOCADDNFE.Builder, io.grasscutter.proto.Unk3000JACOCADDNFE.Unk3000_JACOCADDNFEOrBuilder> avatarInfoListBuilder_;

      /**
       * <code>repeated .Unk3000_JACOCADDNFE avatar_info_list = 13;</code>
       */
      public java.util.List<io.grasscutter.proto.Unk3000JACOCADDNFE.Unk3000_JACOCADDNFE> getAvatarInfoListList() {
        if (avatarInfoListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(avatarInfoList_);
        } else {
          return avatarInfoListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .Unk3000_JACOCADDNFE avatar_info_list = 13;</code>
       */
      public int getAvatarInfoListCount() {
        if (avatarInfoListBuilder_ == null) {
          return avatarInfoList_.size();
        } else {
          return avatarInfoListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .Unk3000_JACOCADDNFE avatar_info_list = 13;</code>
       */
      public io.grasscutter.proto.Unk3000JACOCADDNFE.Unk3000_JACOCADDNFE getAvatarInfoList(int index) {
        if (avatarInfoListBuilder_ == null) {
          return avatarInfoList_.get(index);
        } else {
          return avatarInfoListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .Unk3000_JACOCADDNFE avatar_info_list = 13;</code>
       */
      public Builder setAvatarInfoList(
          int index, io.grasscutter.proto.Unk3000JACOCADDNFE.Unk3000_JACOCADDNFE value) {
        if (avatarInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureAvatarInfoListIsMutable();
          avatarInfoList_.set(index, value);
          onChanged();
        } else {
          avatarInfoListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .Unk3000_JACOCADDNFE avatar_info_list = 13;</code>
       */
      public Builder setAvatarInfoList(
          int index, io.grasscutter.proto.Unk3000JACOCADDNFE.Unk3000_JACOCADDNFE.Builder builderForValue) {
        if (avatarInfoListBuilder_ == null) {
          ensureAvatarInfoListIsMutable();
          avatarInfoList_.set(index, builderForValue.build());
          onChanged();
        } else {
          avatarInfoListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Unk3000_JACOCADDNFE avatar_info_list = 13;</code>
       */
      public Builder addAvatarInfoList(io.grasscutter.proto.Unk3000JACOCADDNFE.Unk3000_JACOCADDNFE value) {
        if (avatarInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureAvatarInfoListIsMutable();
          avatarInfoList_.add(value);
          onChanged();
        } else {
          avatarInfoListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .Unk3000_JACOCADDNFE avatar_info_list = 13;</code>
       */
      public Builder addAvatarInfoList(
          int index, io.grasscutter.proto.Unk3000JACOCADDNFE.Unk3000_JACOCADDNFE value) {
        if (avatarInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureAvatarInfoListIsMutable();
          avatarInfoList_.add(index, value);
          onChanged();
        } else {
          avatarInfoListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .Unk3000_JACOCADDNFE avatar_info_list = 13;</code>
       */
      public Builder addAvatarInfoList(
          io.grasscutter.proto.Unk3000JACOCADDNFE.Unk3000_JACOCADDNFE.Builder builderForValue) {
        if (avatarInfoListBuilder_ == null) {
          ensureAvatarInfoListIsMutable();
          avatarInfoList_.add(builderForValue.build());
          onChanged();
        } else {
          avatarInfoListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Unk3000_JACOCADDNFE avatar_info_list = 13;</code>
       */
      public Builder addAvatarInfoList(
          int index, io.grasscutter.proto.Unk3000JACOCADDNFE.Unk3000_JACOCADDNFE.Builder builderForValue) {
        if (avatarInfoListBuilder_ == null) {
          ensureAvatarInfoListIsMutable();
          avatarInfoList_.add(index, builderForValue.build());
          onChanged();
        } else {
          avatarInfoListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Unk3000_JACOCADDNFE avatar_info_list = 13;</code>
       */
      public Builder addAllAvatarInfoList(
          java.lang.Iterable<? extends io.grasscutter.proto.Unk3000JACOCADDNFE.Unk3000_JACOCADDNFE> values) {
        if (avatarInfoListBuilder_ == null) {
          ensureAvatarInfoListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, avatarInfoList_);
          onChanged();
        } else {
          avatarInfoListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .Unk3000_JACOCADDNFE avatar_info_list = 13;</code>
       */
      public Builder clearAvatarInfoList() {
        if (avatarInfoListBuilder_ == null) {
          avatarInfoList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          avatarInfoListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .Unk3000_JACOCADDNFE avatar_info_list = 13;</code>
       */
      public Builder removeAvatarInfoList(int index) {
        if (avatarInfoListBuilder_ == null) {
          ensureAvatarInfoListIsMutable();
          avatarInfoList_.remove(index);
          onChanged();
        } else {
          avatarInfoListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .Unk3000_JACOCADDNFE avatar_info_list = 13;</code>
       */
      public io.grasscutter.proto.Unk3000JACOCADDNFE.Unk3000_JACOCADDNFE.Builder getAvatarInfoListBuilder(
          int index) {
        return getAvatarInfoListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .Unk3000_JACOCADDNFE avatar_info_list = 13;</code>
       */
      public io.grasscutter.proto.Unk3000JACOCADDNFE.Unk3000_JACOCADDNFEOrBuilder getAvatarInfoListOrBuilder(
          int index) {
        if (avatarInfoListBuilder_ == null) {
          return avatarInfoList_.get(index);  } else {
          return avatarInfoListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .Unk3000_JACOCADDNFE avatar_info_list = 13;</code>
       */
      public java.util.List<? extends io.grasscutter.proto.Unk3000JACOCADDNFE.Unk3000_JACOCADDNFEOrBuilder> 
           getAvatarInfoListOrBuilderList() {
        if (avatarInfoListBuilder_ != null) {
          return avatarInfoListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(avatarInfoList_);
        }
      }
      /**
       * <code>repeated .Unk3000_JACOCADDNFE avatar_info_list = 13;</code>
       */
      public io.grasscutter.proto.Unk3000JACOCADDNFE.Unk3000_JACOCADDNFE.Builder addAvatarInfoListBuilder() {
        return getAvatarInfoListFieldBuilder().addBuilder(
            io.grasscutter.proto.Unk3000JACOCADDNFE.Unk3000_JACOCADDNFE.getDefaultInstance());
      }
      /**
       * <code>repeated .Unk3000_JACOCADDNFE avatar_info_list = 13;</code>
       */
      public io.grasscutter.proto.Unk3000JACOCADDNFE.Unk3000_JACOCADDNFE.Builder addAvatarInfoListBuilder(
          int index) {
        return getAvatarInfoListFieldBuilder().addBuilder(
            index, io.grasscutter.proto.Unk3000JACOCADDNFE.Unk3000_JACOCADDNFE.getDefaultInstance());
      }
      /**
       * <code>repeated .Unk3000_JACOCADDNFE avatar_info_list = 13;</code>
       */
      public java.util.List<io.grasscutter.proto.Unk3000JACOCADDNFE.Unk3000_JACOCADDNFE.Builder> 
           getAvatarInfoListBuilderList() {
        return getAvatarInfoListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          io.grasscutter.proto.Unk3000JACOCADDNFE.Unk3000_JACOCADDNFE, io.grasscutter.proto.Unk3000JACOCADDNFE.Unk3000_JACOCADDNFE.Builder, io.grasscutter.proto.Unk3000JACOCADDNFE.Unk3000_JACOCADDNFEOrBuilder> 
          getAvatarInfoListFieldBuilder() {
        if (avatarInfoListBuilder_ == null) {
          avatarInfoListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              io.grasscutter.proto.Unk3000JACOCADDNFE.Unk3000_JACOCADDNFE, io.grasscutter.proto.Unk3000JACOCADDNFE.Unk3000_JACOCADDNFE.Builder, io.grasscutter.proto.Unk3000JACOCADDNFE.Unk3000_JACOCADDNFEOrBuilder>(
                  avatarInfoList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          avatarInfoList_ = null;
        }
        return avatarInfoListBuilder_;
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


      // @@protoc_insertion_point(builder_scope:Unk3000_KEJLPBEOHNH)
    }

    // @@protoc_insertion_point(class_scope:Unk3000_KEJLPBEOHNH)
    private static final io.grasscutter.proto.Unk3000KEJLPBEOHNH.Unk3000_KEJLPBEOHNH DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.grasscutter.proto.Unk3000KEJLPBEOHNH.Unk3000_KEJLPBEOHNH();
    }

    public static io.grasscutter.proto.Unk3000KEJLPBEOHNH.Unk3000_KEJLPBEOHNH getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Unk3000_KEJLPBEOHNH>
        PARSER = new com.google.protobuf.AbstractParser<Unk3000_KEJLPBEOHNH>() {
      @java.lang.Override
      public Unk3000_KEJLPBEOHNH parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Unk3000_KEJLPBEOHNH(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Unk3000_KEJLPBEOHNH> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Unk3000_KEJLPBEOHNH> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.grasscutter.proto.Unk3000KEJLPBEOHNH.Unk3000_KEJLPBEOHNH getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk3000_KEJLPBEOHNH_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk3000_KEJLPBEOHNH_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031Unk3000_KEJLPBEOHNH.proto\032\031Unk3000_JAC" +
      "OCADDNFE.proto\"E\n\023Unk3000_KEJLPBEOHNH\022.\n" +
      "\020avatar_info_list\030\r \003(\0132\024.Unk3000_JACOCA" +
      "DDNFEB\026\n\024io.grasscutter.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.grasscutter.proto.Unk3000JACOCADDNFE.getDescriptor(),
        });
    internal_static_Unk3000_KEJLPBEOHNH_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Unk3000_KEJLPBEOHNH_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk3000_KEJLPBEOHNH_descriptor,
        new java.lang.String[] { "AvatarInfoList", });
    io.grasscutter.proto.Unk3000JACOCADDNFE.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
