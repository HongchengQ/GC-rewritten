// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GetRecentMpPlayerListRsp.proto

package emu.grasscutter.net.proto;

public final class GetRecentMpPlayerListRspOuterClass {
  private GetRecentMpPlayerListRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GetRecentMpPlayerListRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GetRecentMpPlayerListRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 retcode = 10;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>repeated .FriendBrief recent_mp_player_brief_list = 14;</code>
     */
    java.util.List<emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBrief> 
        getRecentMpPlayerBriefListList();
    /**
     * <code>repeated .FriendBrief recent_mp_player_brief_list = 14;</code>
     */
    emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBrief getRecentMpPlayerBriefList(int index);
    /**
     * <code>repeated .FriendBrief recent_mp_player_brief_list = 14;</code>
     */
    int getRecentMpPlayerBriefListCount();
    /**
     * <code>repeated .FriendBrief recent_mp_player_brief_list = 14;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBriefOrBuilder> 
        getRecentMpPlayerBriefListOrBuilderList();
    /**
     * <code>repeated .FriendBrief recent_mp_player_brief_list = 14;</code>
     */
    emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBriefOrBuilder getRecentMpPlayerBriefListOrBuilder(
        int index);
  }
  /**
   * <pre>
   * CmdId: 24279
   * Obf: GPGJECPCLBN
   * </pre>
   *
   * Protobuf type {@code GetRecentMpPlayerListRsp}
   */
  public static final class GetRecentMpPlayerListRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GetRecentMpPlayerListRsp)
      GetRecentMpPlayerListRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GetRecentMpPlayerListRsp.newBuilder() to construct.
    private GetRecentMpPlayerListRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GetRecentMpPlayerListRsp() {
      recentMpPlayerBriefList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GetRecentMpPlayerListRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GetRecentMpPlayerListRsp(
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
            case 80: {

              retcode_ = input.readInt32();
              break;
            }
            case 114: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                recentMpPlayerBriefList_ = new java.util.ArrayList<emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBrief>();
                mutable_bitField0_ |= 0x00000001;
              }
              recentMpPlayerBriefList_.add(
                  input.readMessage(emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBrief.parser(), extensionRegistry));
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
          recentMpPlayerBriefList_ = java.util.Collections.unmodifiableList(recentMpPlayerBriefList_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.GetRecentMpPlayerListRspOuterClass.internal_static_GetRecentMpPlayerListRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.GetRecentMpPlayerListRspOuterClass.internal_static_GetRecentMpPlayerListRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.GetRecentMpPlayerListRspOuterClass.GetRecentMpPlayerListRsp.class, emu.grasscutter.net.proto.GetRecentMpPlayerListRspOuterClass.GetRecentMpPlayerListRsp.Builder.class);
    }

    public static final int RETCODE_FIELD_NUMBER = 10;
    private int retcode_;
    /**
     * <code>int32 retcode = 10;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int RECENT_MP_PLAYER_BRIEF_LIST_FIELD_NUMBER = 14;
    private java.util.List<emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBrief> recentMpPlayerBriefList_;
    /**
     * <code>repeated .FriendBrief recent_mp_player_brief_list = 14;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBrief> getRecentMpPlayerBriefListList() {
      return recentMpPlayerBriefList_;
    }
    /**
     * <code>repeated .FriendBrief recent_mp_player_brief_list = 14;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBriefOrBuilder> 
        getRecentMpPlayerBriefListOrBuilderList() {
      return recentMpPlayerBriefList_;
    }
    /**
     * <code>repeated .FriendBrief recent_mp_player_brief_list = 14;</code>
     */
    @java.lang.Override
    public int getRecentMpPlayerBriefListCount() {
      return recentMpPlayerBriefList_.size();
    }
    /**
     * <code>repeated .FriendBrief recent_mp_player_brief_list = 14;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBrief getRecentMpPlayerBriefList(int index) {
      return recentMpPlayerBriefList_.get(index);
    }
    /**
     * <code>repeated .FriendBrief recent_mp_player_brief_list = 14;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBriefOrBuilder getRecentMpPlayerBriefListOrBuilder(
        int index) {
      return recentMpPlayerBriefList_.get(index);
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
        output.writeInt32(10, retcode_);
      }
      for (int i = 0; i < recentMpPlayerBriefList_.size(); i++) {
        output.writeMessage(14, recentMpPlayerBriefList_.get(i));
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
          .computeInt32Size(10, retcode_);
      }
      for (int i = 0; i < recentMpPlayerBriefList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(14, recentMpPlayerBriefList_.get(i));
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
      if (!(obj instanceof emu.grasscutter.net.proto.GetRecentMpPlayerListRspOuterClass.GetRecentMpPlayerListRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.GetRecentMpPlayerListRspOuterClass.GetRecentMpPlayerListRsp other = (emu.grasscutter.net.proto.GetRecentMpPlayerListRspOuterClass.GetRecentMpPlayerListRsp) obj;

      if (getRetcode()
          != other.getRetcode()) return false;
      if (!getRecentMpPlayerBriefListList()
          .equals(other.getRecentMpPlayerBriefListList())) return false;
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
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      if (getRecentMpPlayerBriefListCount() > 0) {
        hash = (37 * hash) + RECENT_MP_PLAYER_BRIEF_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getRecentMpPlayerBriefListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.GetRecentMpPlayerListRspOuterClass.GetRecentMpPlayerListRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GetRecentMpPlayerListRspOuterClass.GetRecentMpPlayerListRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetRecentMpPlayerListRspOuterClass.GetRecentMpPlayerListRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GetRecentMpPlayerListRspOuterClass.GetRecentMpPlayerListRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetRecentMpPlayerListRspOuterClass.GetRecentMpPlayerListRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GetRecentMpPlayerListRspOuterClass.GetRecentMpPlayerListRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetRecentMpPlayerListRspOuterClass.GetRecentMpPlayerListRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GetRecentMpPlayerListRspOuterClass.GetRecentMpPlayerListRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetRecentMpPlayerListRspOuterClass.GetRecentMpPlayerListRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GetRecentMpPlayerListRspOuterClass.GetRecentMpPlayerListRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetRecentMpPlayerListRspOuterClass.GetRecentMpPlayerListRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GetRecentMpPlayerListRspOuterClass.GetRecentMpPlayerListRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.GetRecentMpPlayerListRspOuterClass.GetRecentMpPlayerListRsp prototype) {
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
     * CmdId: 24279
     * Obf: GPGJECPCLBN
     * </pre>
     *
     * Protobuf type {@code GetRecentMpPlayerListRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GetRecentMpPlayerListRsp)
        emu.grasscutter.net.proto.GetRecentMpPlayerListRspOuterClass.GetRecentMpPlayerListRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GetRecentMpPlayerListRspOuterClass.internal_static_GetRecentMpPlayerListRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.GetRecentMpPlayerListRspOuterClass.internal_static_GetRecentMpPlayerListRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GetRecentMpPlayerListRspOuterClass.GetRecentMpPlayerListRsp.class, emu.grasscutter.net.proto.GetRecentMpPlayerListRspOuterClass.GetRecentMpPlayerListRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.GetRecentMpPlayerListRspOuterClass.GetRecentMpPlayerListRsp.newBuilder()
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
          getRecentMpPlayerBriefListFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        retcode_ = 0;

        if (recentMpPlayerBriefListBuilder_ == null) {
          recentMpPlayerBriefList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          recentMpPlayerBriefListBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.GetRecentMpPlayerListRspOuterClass.internal_static_GetRecentMpPlayerListRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GetRecentMpPlayerListRspOuterClass.GetRecentMpPlayerListRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GetRecentMpPlayerListRspOuterClass.GetRecentMpPlayerListRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GetRecentMpPlayerListRspOuterClass.GetRecentMpPlayerListRsp build() {
        emu.grasscutter.net.proto.GetRecentMpPlayerListRspOuterClass.GetRecentMpPlayerListRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GetRecentMpPlayerListRspOuterClass.GetRecentMpPlayerListRsp buildPartial() {
        emu.grasscutter.net.proto.GetRecentMpPlayerListRspOuterClass.GetRecentMpPlayerListRsp result = new emu.grasscutter.net.proto.GetRecentMpPlayerListRspOuterClass.GetRecentMpPlayerListRsp(this);
        int from_bitField0_ = bitField0_;
        result.retcode_ = retcode_;
        if (recentMpPlayerBriefListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            recentMpPlayerBriefList_ = java.util.Collections.unmodifiableList(recentMpPlayerBriefList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.recentMpPlayerBriefList_ = recentMpPlayerBriefList_;
        } else {
          result.recentMpPlayerBriefList_ = recentMpPlayerBriefListBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.proto.GetRecentMpPlayerListRspOuterClass.GetRecentMpPlayerListRsp) {
          return mergeFrom((emu.grasscutter.net.proto.GetRecentMpPlayerListRspOuterClass.GetRecentMpPlayerListRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.GetRecentMpPlayerListRspOuterClass.GetRecentMpPlayerListRsp other) {
        if (other == emu.grasscutter.net.proto.GetRecentMpPlayerListRspOuterClass.GetRecentMpPlayerListRsp.getDefaultInstance()) return this;
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (recentMpPlayerBriefListBuilder_ == null) {
          if (!other.recentMpPlayerBriefList_.isEmpty()) {
            if (recentMpPlayerBriefList_.isEmpty()) {
              recentMpPlayerBriefList_ = other.recentMpPlayerBriefList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureRecentMpPlayerBriefListIsMutable();
              recentMpPlayerBriefList_.addAll(other.recentMpPlayerBriefList_);
            }
            onChanged();
          }
        } else {
          if (!other.recentMpPlayerBriefList_.isEmpty()) {
            if (recentMpPlayerBriefListBuilder_.isEmpty()) {
              recentMpPlayerBriefListBuilder_.dispose();
              recentMpPlayerBriefListBuilder_ = null;
              recentMpPlayerBriefList_ = other.recentMpPlayerBriefList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              recentMpPlayerBriefListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getRecentMpPlayerBriefListFieldBuilder() : null;
            } else {
              recentMpPlayerBriefListBuilder_.addAllMessages(other.recentMpPlayerBriefList_);
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
        emu.grasscutter.net.proto.GetRecentMpPlayerListRspOuterClass.GetRecentMpPlayerListRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.GetRecentMpPlayerListRspOuterClass.GetRecentMpPlayerListRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int retcode_ ;
      /**
       * <code>int32 retcode = 10;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 10;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private java.util.List<emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBrief> recentMpPlayerBriefList_ =
        java.util.Collections.emptyList();
      private void ensureRecentMpPlayerBriefListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          recentMpPlayerBriefList_ = new java.util.ArrayList<emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBrief>(recentMpPlayerBriefList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBrief, emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBrief.Builder, emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBriefOrBuilder> recentMpPlayerBriefListBuilder_;

      /**
       * <code>repeated .FriendBrief recent_mp_player_brief_list = 14;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBrief> getRecentMpPlayerBriefListList() {
        if (recentMpPlayerBriefListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(recentMpPlayerBriefList_);
        } else {
          return recentMpPlayerBriefListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .FriendBrief recent_mp_player_brief_list = 14;</code>
       */
      public int getRecentMpPlayerBriefListCount() {
        if (recentMpPlayerBriefListBuilder_ == null) {
          return recentMpPlayerBriefList_.size();
        } else {
          return recentMpPlayerBriefListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .FriendBrief recent_mp_player_brief_list = 14;</code>
       */
      public emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBrief getRecentMpPlayerBriefList(int index) {
        if (recentMpPlayerBriefListBuilder_ == null) {
          return recentMpPlayerBriefList_.get(index);
        } else {
          return recentMpPlayerBriefListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .FriendBrief recent_mp_player_brief_list = 14;</code>
       */
      public Builder setRecentMpPlayerBriefList(
          int index, emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBrief value) {
        if (recentMpPlayerBriefListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureRecentMpPlayerBriefListIsMutable();
          recentMpPlayerBriefList_.set(index, value);
          onChanged();
        } else {
          recentMpPlayerBriefListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .FriendBrief recent_mp_player_brief_list = 14;</code>
       */
      public Builder setRecentMpPlayerBriefList(
          int index, emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBrief.Builder builderForValue) {
        if (recentMpPlayerBriefListBuilder_ == null) {
          ensureRecentMpPlayerBriefListIsMutable();
          recentMpPlayerBriefList_.set(index, builderForValue.build());
          onChanged();
        } else {
          recentMpPlayerBriefListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .FriendBrief recent_mp_player_brief_list = 14;</code>
       */
      public Builder addRecentMpPlayerBriefList(emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBrief value) {
        if (recentMpPlayerBriefListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureRecentMpPlayerBriefListIsMutable();
          recentMpPlayerBriefList_.add(value);
          onChanged();
        } else {
          recentMpPlayerBriefListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .FriendBrief recent_mp_player_brief_list = 14;</code>
       */
      public Builder addRecentMpPlayerBriefList(
          int index, emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBrief value) {
        if (recentMpPlayerBriefListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureRecentMpPlayerBriefListIsMutable();
          recentMpPlayerBriefList_.add(index, value);
          onChanged();
        } else {
          recentMpPlayerBriefListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .FriendBrief recent_mp_player_brief_list = 14;</code>
       */
      public Builder addRecentMpPlayerBriefList(
          emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBrief.Builder builderForValue) {
        if (recentMpPlayerBriefListBuilder_ == null) {
          ensureRecentMpPlayerBriefListIsMutable();
          recentMpPlayerBriefList_.add(builderForValue.build());
          onChanged();
        } else {
          recentMpPlayerBriefListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .FriendBrief recent_mp_player_brief_list = 14;</code>
       */
      public Builder addRecentMpPlayerBriefList(
          int index, emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBrief.Builder builderForValue) {
        if (recentMpPlayerBriefListBuilder_ == null) {
          ensureRecentMpPlayerBriefListIsMutable();
          recentMpPlayerBriefList_.add(index, builderForValue.build());
          onChanged();
        } else {
          recentMpPlayerBriefListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .FriendBrief recent_mp_player_brief_list = 14;</code>
       */
      public Builder addAllRecentMpPlayerBriefList(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBrief> values) {
        if (recentMpPlayerBriefListBuilder_ == null) {
          ensureRecentMpPlayerBriefListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, recentMpPlayerBriefList_);
          onChanged();
        } else {
          recentMpPlayerBriefListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .FriendBrief recent_mp_player_brief_list = 14;</code>
       */
      public Builder clearRecentMpPlayerBriefList() {
        if (recentMpPlayerBriefListBuilder_ == null) {
          recentMpPlayerBriefList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          recentMpPlayerBriefListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .FriendBrief recent_mp_player_brief_list = 14;</code>
       */
      public Builder removeRecentMpPlayerBriefList(int index) {
        if (recentMpPlayerBriefListBuilder_ == null) {
          ensureRecentMpPlayerBriefListIsMutable();
          recentMpPlayerBriefList_.remove(index);
          onChanged();
        } else {
          recentMpPlayerBriefListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .FriendBrief recent_mp_player_brief_list = 14;</code>
       */
      public emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBrief.Builder getRecentMpPlayerBriefListBuilder(
          int index) {
        return getRecentMpPlayerBriefListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .FriendBrief recent_mp_player_brief_list = 14;</code>
       */
      public emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBriefOrBuilder getRecentMpPlayerBriefListOrBuilder(
          int index) {
        if (recentMpPlayerBriefListBuilder_ == null) {
          return recentMpPlayerBriefList_.get(index);  } else {
          return recentMpPlayerBriefListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .FriendBrief recent_mp_player_brief_list = 14;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBriefOrBuilder> 
           getRecentMpPlayerBriefListOrBuilderList() {
        if (recentMpPlayerBriefListBuilder_ != null) {
          return recentMpPlayerBriefListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(recentMpPlayerBriefList_);
        }
      }
      /**
       * <code>repeated .FriendBrief recent_mp_player_brief_list = 14;</code>
       */
      public emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBrief.Builder addRecentMpPlayerBriefListBuilder() {
        return getRecentMpPlayerBriefListFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBrief.getDefaultInstance());
      }
      /**
       * <code>repeated .FriendBrief recent_mp_player_brief_list = 14;</code>
       */
      public emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBrief.Builder addRecentMpPlayerBriefListBuilder(
          int index) {
        return getRecentMpPlayerBriefListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBrief.getDefaultInstance());
      }
      /**
       * <code>repeated .FriendBrief recent_mp_player_brief_list = 14;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBrief.Builder> 
           getRecentMpPlayerBriefListBuilderList() {
        return getRecentMpPlayerBriefListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBrief, emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBrief.Builder, emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBriefOrBuilder> 
          getRecentMpPlayerBriefListFieldBuilder() {
        if (recentMpPlayerBriefListBuilder_ == null) {
          recentMpPlayerBriefListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBrief, emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBrief.Builder, emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBriefOrBuilder>(
                  recentMpPlayerBriefList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          recentMpPlayerBriefList_ = null;
        }
        return recentMpPlayerBriefListBuilder_;
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


      // @@protoc_insertion_point(builder_scope:GetRecentMpPlayerListRsp)
    }

    // @@protoc_insertion_point(class_scope:GetRecentMpPlayerListRsp)
    private static final emu.grasscutter.net.proto.GetRecentMpPlayerListRspOuterClass.GetRecentMpPlayerListRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GetRecentMpPlayerListRspOuterClass.GetRecentMpPlayerListRsp();
    }

    public static emu.grasscutter.net.proto.GetRecentMpPlayerListRspOuterClass.GetRecentMpPlayerListRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GetRecentMpPlayerListRsp>
        PARSER = new com.google.protobuf.AbstractParser<GetRecentMpPlayerListRsp>() {
      @java.lang.Override
      public GetRecentMpPlayerListRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GetRecentMpPlayerListRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GetRecentMpPlayerListRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GetRecentMpPlayerListRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GetRecentMpPlayerListRspOuterClass.GetRecentMpPlayerListRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetRecentMpPlayerListRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetRecentMpPlayerListRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036GetRecentMpPlayerListRsp.proto\032\021Friend" +
      "Brief.proto\"^\n\030GetRecentMpPlayerListRsp\022" +
      "\017\n\007retcode\030\n \001(\005\0221\n\033recent_mp_player_bri" +
      "ef_list\030\016 \003(\0132\014.FriendBriefB\033\n\031emu.grass" +
      "cutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.FriendBriefOuterClass.getDescriptor(),
        });
    internal_static_GetRecentMpPlayerListRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GetRecentMpPlayerListRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetRecentMpPlayerListRsp_descriptor,
        new java.lang.String[] { "Retcode", "RecentMpPlayerBriefList", });
    emu.grasscutter.net.proto.FriendBriefOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
