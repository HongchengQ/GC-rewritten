// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GetSceneNpcPositionRsp.proto

package io.grasscutter.proto;

public final class GetSceneNpcPositionRspOuterClass {
  private GetSceneNpcPositionRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GetSceneNpcPositionRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GetSceneNpcPositionRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 retcode = 10;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>repeated .NpcPositionInfo npc_info_list = 14;</code>
     */
    java.util.List<io.grasscutter.proto.NpcPositionInfoOuterClass.NpcPositionInfo> 
        getNpcInfoListList();
    /**
     * <code>repeated .NpcPositionInfo npc_info_list = 14;</code>
     */
    io.grasscutter.proto.NpcPositionInfoOuterClass.NpcPositionInfo getNpcInfoList(int index);
    /**
     * <code>repeated .NpcPositionInfo npc_info_list = 14;</code>
     */
    int getNpcInfoListCount();
    /**
     * <code>repeated .NpcPositionInfo npc_info_list = 14;</code>
     */
    java.util.List<? extends io.grasscutter.proto.NpcPositionInfoOuterClass.NpcPositionInfoOrBuilder> 
        getNpcInfoListOrBuilderList();
    /**
     * <code>repeated .NpcPositionInfo npc_info_list = 14;</code>
     */
    io.grasscutter.proto.NpcPositionInfoOuterClass.NpcPositionInfoOrBuilder getNpcInfoListOrBuilder(
        int index);

    /**
     * <code>uint32 scene_id = 4;</code>
     * @return The sceneId.
     */
    int getSceneId();
  }
  /**
   * <pre>
   * CmdId: 507
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code GetSceneNpcPositionRsp}
   */
  public static final class GetSceneNpcPositionRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GetSceneNpcPositionRsp)
      GetSceneNpcPositionRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GetSceneNpcPositionRsp.newBuilder() to construct.
    private GetSceneNpcPositionRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GetSceneNpcPositionRsp() {
      npcInfoList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GetSceneNpcPositionRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GetSceneNpcPositionRsp(
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
            case 32: {

              sceneId_ = input.readUInt32();
              break;
            }
            case 80: {

              retcode_ = input.readInt32();
              break;
            }
            case 114: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                npcInfoList_ = new java.util.ArrayList<io.grasscutter.proto.NpcPositionInfoOuterClass.NpcPositionInfo>();
                mutable_bitField0_ |= 0x00000001;
              }
              npcInfoList_.add(
                  input.readMessage(io.grasscutter.proto.NpcPositionInfoOuterClass.NpcPositionInfo.parser(), extensionRegistry));
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
          npcInfoList_ = java.util.Collections.unmodifiableList(npcInfoList_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grasscutter.proto.GetSceneNpcPositionRspOuterClass.internal_static_GetSceneNpcPositionRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.proto.GetSceneNpcPositionRspOuterClass.internal_static_GetSceneNpcPositionRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.proto.GetSceneNpcPositionRspOuterClass.GetSceneNpcPositionRsp.class, io.grasscutter.proto.GetSceneNpcPositionRspOuterClass.GetSceneNpcPositionRsp.Builder.class);
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

    public static final int NPC_INFO_LIST_FIELD_NUMBER = 14;
    private java.util.List<io.grasscutter.proto.NpcPositionInfoOuterClass.NpcPositionInfo> npcInfoList_;
    /**
     * <code>repeated .NpcPositionInfo npc_info_list = 14;</code>
     */
    @java.lang.Override
    public java.util.List<io.grasscutter.proto.NpcPositionInfoOuterClass.NpcPositionInfo> getNpcInfoListList() {
      return npcInfoList_;
    }
    /**
     * <code>repeated .NpcPositionInfo npc_info_list = 14;</code>
     */
    @java.lang.Override
    public java.util.List<? extends io.grasscutter.proto.NpcPositionInfoOuterClass.NpcPositionInfoOrBuilder> 
        getNpcInfoListOrBuilderList() {
      return npcInfoList_;
    }
    /**
     * <code>repeated .NpcPositionInfo npc_info_list = 14;</code>
     */
    @java.lang.Override
    public int getNpcInfoListCount() {
      return npcInfoList_.size();
    }
    /**
     * <code>repeated .NpcPositionInfo npc_info_list = 14;</code>
     */
    @java.lang.Override
    public io.grasscutter.proto.NpcPositionInfoOuterClass.NpcPositionInfo getNpcInfoList(int index) {
      return npcInfoList_.get(index);
    }
    /**
     * <code>repeated .NpcPositionInfo npc_info_list = 14;</code>
     */
    @java.lang.Override
    public io.grasscutter.proto.NpcPositionInfoOuterClass.NpcPositionInfoOrBuilder getNpcInfoListOrBuilder(
        int index) {
      return npcInfoList_.get(index);
    }

    public static final int SCENE_ID_FIELD_NUMBER = 4;
    private int sceneId_;
    /**
     * <code>uint32 scene_id = 4;</code>
     * @return The sceneId.
     */
    @java.lang.Override
    public int getSceneId() {
      return sceneId_;
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
      if (sceneId_ != 0) {
        output.writeUInt32(4, sceneId_);
      }
      if (retcode_ != 0) {
        output.writeInt32(10, retcode_);
      }
      for (int i = 0; i < npcInfoList_.size(); i++) {
        output.writeMessage(14, npcInfoList_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (sceneId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, sceneId_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(10, retcode_);
      }
      for (int i = 0; i < npcInfoList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(14, npcInfoList_.get(i));
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
      if (!(obj instanceof io.grasscutter.proto.GetSceneNpcPositionRspOuterClass.GetSceneNpcPositionRsp)) {
        return super.equals(obj);
      }
      io.grasscutter.proto.GetSceneNpcPositionRspOuterClass.GetSceneNpcPositionRsp other = (io.grasscutter.proto.GetSceneNpcPositionRspOuterClass.GetSceneNpcPositionRsp) obj;

      if (getRetcode()
          != other.getRetcode()) return false;
      if (!getNpcInfoListList()
          .equals(other.getNpcInfoListList())) return false;
      if (getSceneId()
          != other.getSceneId()) return false;
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
      if (getNpcInfoListCount() > 0) {
        hash = (37 * hash) + NPC_INFO_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getNpcInfoListList().hashCode();
      }
      hash = (37 * hash) + SCENE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getSceneId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.grasscutter.proto.GetSceneNpcPositionRspOuterClass.GetSceneNpcPositionRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.GetSceneNpcPositionRspOuterClass.GetSceneNpcPositionRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.GetSceneNpcPositionRspOuterClass.GetSceneNpcPositionRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.GetSceneNpcPositionRspOuterClass.GetSceneNpcPositionRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.GetSceneNpcPositionRspOuterClass.GetSceneNpcPositionRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.GetSceneNpcPositionRspOuterClass.GetSceneNpcPositionRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.GetSceneNpcPositionRspOuterClass.GetSceneNpcPositionRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.GetSceneNpcPositionRspOuterClass.GetSceneNpcPositionRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.GetSceneNpcPositionRspOuterClass.GetSceneNpcPositionRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.GetSceneNpcPositionRspOuterClass.GetSceneNpcPositionRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.GetSceneNpcPositionRspOuterClass.GetSceneNpcPositionRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.GetSceneNpcPositionRspOuterClass.GetSceneNpcPositionRsp parseFrom(
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
    public static Builder newBuilder(io.grasscutter.proto.GetSceneNpcPositionRspOuterClass.GetSceneNpcPositionRsp prototype) {
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
     * CmdId: 507
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code GetSceneNpcPositionRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GetSceneNpcPositionRsp)
        io.grasscutter.proto.GetSceneNpcPositionRspOuterClass.GetSceneNpcPositionRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.grasscutter.proto.GetSceneNpcPositionRspOuterClass.internal_static_GetSceneNpcPositionRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.grasscutter.proto.GetSceneNpcPositionRspOuterClass.internal_static_GetSceneNpcPositionRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.grasscutter.proto.GetSceneNpcPositionRspOuterClass.GetSceneNpcPositionRsp.class, io.grasscutter.proto.GetSceneNpcPositionRspOuterClass.GetSceneNpcPositionRsp.Builder.class);
      }

      // Construct using io.grasscutter.proto.GetSceneNpcPositionRspOuterClass.GetSceneNpcPositionRsp.newBuilder()
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
          getNpcInfoListFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        retcode_ = 0;

        if (npcInfoListBuilder_ == null) {
          npcInfoList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          npcInfoListBuilder_.clear();
        }
        sceneId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.grasscutter.proto.GetSceneNpcPositionRspOuterClass.internal_static_GetSceneNpcPositionRsp_descriptor;
      }

      @java.lang.Override
      public io.grasscutter.proto.GetSceneNpcPositionRspOuterClass.GetSceneNpcPositionRsp getDefaultInstanceForType() {
        return io.grasscutter.proto.GetSceneNpcPositionRspOuterClass.GetSceneNpcPositionRsp.getDefaultInstance();
      }

      @java.lang.Override
      public io.grasscutter.proto.GetSceneNpcPositionRspOuterClass.GetSceneNpcPositionRsp build() {
        io.grasscutter.proto.GetSceneNpcPositionRspOuterClass.GetSceneNpcPositionRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.grasscutter.proto.GetSceneNpcPositionRspOuterClass.GetSceneNpcPositionRsp buildPartial() {
        io.grasscutter.proto.GetSceneNpcPositionRspOuterClass.GetSceneNpcPositionRsp result = new io.grasscutter.proto.GetSceneNpcPositionRspOuterClass.GetSceneNpcPositionRsp(this);
        int from_bitField0_ = bitField0_;
        result.retcode_ = retcode_;
        if (npcInfoListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            npcInfoList_ = java.util.Collections.unmodifiableList(npcInfoList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.npcInfoList_ = npcInfoList_;
        } else {
          result.npcInfoList_ = npcInfoListBuilder_.build();
        }
        result.sceneId_ = sceneId_;
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
        if (other instanceof io.grasscutter.proto.GetSceneNpcPositionRspOuterClass.GetSceneNpcPositionRsp) {
          return mergeFrom((io.grasscutter.proto.GetSceneNpcPositionRspOuterClass.GetSceneNpcPositionRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.grasscutter.proto.GetSceneNpcPositionRspOuterClass.GetSceneNpcPositionRsp other) {
        if (other == io.grasscutter.proto.GetSceneNpcPositionRspOuterClass.GetSceneNpcPositionRsp.getDefaultInstance()) return this;
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (npcInfoListBuilder_ == null) {
          if (!other.npcInfoList_.isEmpty()) {
            if (npcInfoList_.isEmpty()) {
              npcInfoList_ = other.npcInfoList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureNpcInfoListIsMutable();
              npcInfoList_.addAll(other.npcInfoList_);
            }
            onChanged();
          }
        } else {
          if (!other.npcInfoList_.isEmpty()) {
            if (npcInfoListBuilder_.isEmpty()) {
              npcInfoListBuilder_.dispose();
              npcInfoListBuilder_ = null;
              npcInfoList_ = other.npcInfoList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              npcInfoListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getNpcInfoListFieldBuilder() : null;
            } else {
              npcInfoListBuilder_.addAllMessages(other.npcInfoList_);
            }
          }
        }
        if (other.getSceneId() != 0) {
          setSceneId(other.getSceneId());
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
        io.grasscutter.proto.GetSceneNpcPositionRspOuterClass.GetSceneNpcPositionRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.grasscutter.proto.GetSceneNpcPositionRspOuterClass.GetSceneNpcPositionRsp) e.getUnfinishedMessage();
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

      private java.util.List<io.grasscutter.proto.NpcPositionInfoOuterClass.NpcPositionInfo> npcInfoList_ =
        java.util.Collections.emptyList();
      private void ensureNpcInfoListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          npcInfoList_ = new java.util.ArrayList<io.grasscutter.proto.NpcPositionInfoOuterClass.NpcPositionInfo>(npcInfoList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          io.grasscutter.proto.NpcPositionInfoOuterClass.NpcPositionInfo, io.grasscutter.proto.NpcPositionInfoOuterClass.NpcPositionInfo.Builder, io.grasscutter.proto.NpcPositionInfoOuterClass.NpcPositionInfoOrBuilder> npcInfoListBuilder_;

      /**
       * <code>repeated .NpcPositionInfo npc_info_list = 14;</code>
       */
      public java.util.List<io.grasscutter.proto.NpcPositionInfoOuterClass.NpcPositionInfo> getNpcInfoListList() {
        if (npcInfoListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(npcInfoList_);
        } else {
          return npcInfoListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .NpcPositionInfo npc_info_list = 14;</code>
       */
      public int getNpcInfoListCount() {
        if (npcInfoListBuilder_ == null) {
          return npcInfoList_.size();
        } else {
          return npcInfoListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .NpcPositionInfo npc_info_list = 14;</code>
       */
      public io.grasscutter.proto.NpcPositionInfoOuterClass.NpcPositionInfo getNpcInfoList(int index) {
        if (npcInfoListBuilder_ == null) {
          return npcInfoList_.get(index);
        } else {
          return npcInfoListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .NpcPositionInfo npc_info_list = 14;</code>
       */
      public Builder setNpcInfoList(
          int index, io.grasscutter.proto.NpcPositionInfoOuterClass.NpcPositionInfo value) {
        if (npcInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureNpcInfoListIsMutable();
          npcInfoList_.set(index, value);
          onChanged();
        } else {
          npcInfoListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .NpcPositionInfo npc_info_list = 14;</code>
       */
      public Builder setNpcInfoList(
          int index, io.grasscutter.proto.NpcPositionInfoOuterClass.NpcPositionInfo.Builder builderForValue) {
        if (npcInfoListBuilder_ == null) {
          ensureNpcInfoListIsMutable();
          npcInfoList_.set(index, builderForValue.build());
          onChanged();
        } else {
          npcInfoListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .NpcPositionInfo npc_info_list = 14;</code>
       */
      public Builder addNpcInfoList(io.grasscutter.proto.NpcPositionInfoOuterClass.NpcPositionInfo value) {
        if (npcInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureNpcInfoListIsMutable();
          npcInfoList_.add(value);
          onChanged();
        } else {
          npcInfoListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .NpcPositionInfo npc_info_list = 14;</code>
       */
      public Builder addNpcInfoList(
          int index, io.grasscutter.proto.NpcPositionInfoOuterClass.NpcPositionInfo value) {
        if (npcInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureNpcInfoListIsMutable();
          npcInfoList_.add(index, value);
          onChanged();
        } else {
          npcInfoListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .NpcPositionInfo npc_info_list = 14;</code>
       */
      public Builder addNpcInfoList(
          io.grasscutter.proto.NpcPositionInfoOuterClass.NpcPositionInfo.Builder builderForValue) {
        if (npcInfoListBuilder_ == null) {
          ensureNpcInfoListIsMutable();
          npcInfoList_.add(builderForValue.build());
          onChanged();
        } else {
          npcInfoListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .NpcPositionInfo npc_info_list = 14;</code>
       */
      public Builder addNpcInfoList(
          int index, io.grasscutter.proto.NpcPositionInfoOuterClass.NpcPositionInfo.Builder builderForValue) {
        if (npcInfoListBuilder_ == null) {
          ensureNpcInfoListIsMutable();
          npcInfoList_.add(index, builderForValue.build());
          onChanged();
        } else {
          npcInfoListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .NpcPositionInfo npc_info_list = 14;</code>
       */
      public Builder addAllNpcInfoList(
          java.lang.Iterable<? extends io.grasscutter.proto.NpcPositionInfoOuterClass.NpcPositionInfo> values) {
        if (npcInfoListBuilder_ == null) {
          ensureNpcInfoListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, npcInfoList_);
          onChanged();
        } else {
          npcInfoListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .NpcPositionInfo npc_info_list = 14;</code>
       */
      public Builder clearNpcInfoList() {
        if (npcInfoListBuilder_ == null) {
          npcInfoList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          npcInfoListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .NpcPositionInfo npc_info_list = 14;</code>
       */
      public Builder removeNpcInfoList(int index) {
        if (npcInfoListBuilder_ == null) {
          ensureNpcInfoListIsMutable();
          npcInfoList_.remove(index);
          onChanged();
        } else {
          npcInfoListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .NpcPositionInfo npc_info_list = 14;</code>
       */
      public io.grasscutter.proto.NpcPositionInfoOuterClass.NpcPositionInfo.Builder getNpcInfoListBuilder(
          int index) {
        return getNpcInfoListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .NpcPositionInfo npc_info_list = 14;</code>
       */
      public io.grasscutter.proto.NpcPositionInfoOuterClass.NpcPositionInfoOrBuilder getNpcInfoListOrBuilder(
          int index) {
        if (npcInfoListBuilder_ == null) {
          return npcInfoList_.get(index);  } else {
          return npcInfoListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .NpcPositionInfo npc_info_list = 14;</code>
       */
      public java.util.List<? extends io.grasscutter.proto.NpcPositionInfoOuterClass.NpcPositionInfoOrBuilder> 
           getNpcInfoListOrBuilderList() {
        if (npcInfoListBuilder_ != null) {
          return npcInfoListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(npcInfoList_);
        }
      }
      /**
       * <code>repeated .NpcPositionInfo npc_info_list = 14;</code>
       */
      public io.grasscutter.proto.NpcPositionInfoOuterClass.NpcPositionInfo.Builder addNpcInfoListBuilder() {
        return getNpcInfoListFieldBuilder().addBuilder(
            io.grasscutter.proto.NpcPositionInfoOuterClass.NpcPositionInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .NpcPositionInfo npc_info_list = 14;</code>
       */
      public io.grasscutter.proto.NpcPositionInfoOuterClass.NpcPositionInfo.Builder addNpcInfoListBuilder(
          int index) {
        return getNpcInfoListFieldBuilder().addBuilder(
            index, io.grasscutter.proto.NpcPositionInfoOuterClass.NpcPositionInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .NpcPositionInfo npc_info_list = 14;</code>
       */
      public java.util.List<io.grasscutter.proto.NpcPositionInfoOuterClass.NpcPositionInfo.Builder> 
           getNpcInfoListBuilderList() {
        return getNpcInfoListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          io.grasscutter.proto.NpcPositionInfoOuterClass.NpcPositionInfo, io.grasscutter.proto.NpcPositionInfoOuterClass.NpcPositionInfo.Builder, io.grasscutter.proto.NpcPositionInfoOuterClass.NpcPositionInfoOrBuilder> 
          getNpcInfoListFieldBuilder() {
        if (npcInfoListBuilder_ == null) {
          npcInfoListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              io.grasscutter.proto.NpcPositionInfoOuterClass.NpcPositionInfo, io.grasscutter.proto.NpcPositionInfoOuterClass.NpcPositionInfo.Builder, io.grasscutter.proto.NpcPositionInfoOuterClass.NpcPositionInfoOrBuilder>(
                  npcInfoList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          npcInfoList_ = null;
        }
        return npcInfoListBuilder_;
      }

      private int sceneId_ ;
      /**
       * <code>uint32 scene_id = 4;</code>
       * @return The sceneId.
       */
      @java.lang.Override
      public int getSceneId() {
        return sceneId_;
      }
      /**
       * <code>uint32 scene_id = 4;</code>
       * @param value The sceneId to set.
       * @return This builder for chaining.
       */
      public Builder setSceneId(int value) {
        
        sceneId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 scene_id = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearSceneId() {
        
        sceneId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:GetSceneNpcPositionRsp)
    }

    // @@protoc_insertion_point(class_scope:GetSceneNpcPositionRsp)
    private static final io.grasscutter.proto.GetSceneNpcPositionRspOuterClass.GetSceneNpcPositionRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.grasscutter.proto.GetSceneNpcPositionRspOuterClass.GetSceneNpcPositionRsp();
    }

    public static io.grasscutter.proto.GetSceneNpcPositionRspOuterClass.GetSceneNpcPositionRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GetSceneNpcPositionRsp>
        PARSER = new com.google.protobuf.AbstractParser<GetSceneNpcPositionRsp>() {
      @java.lang.Override
      public GetSceneNpcPositionRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GetSceneNpcPositionRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GetSceneNpcPositionRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GetSceneNpcPositionRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.grasscutter.proto.GetSceneNpcPositionRspOuterClass.GetSceneNpcPositionRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetSceneNpcPositionRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetSceneNpcPositionRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034GetSceneNpcPositionRsp.proto\032\025NpcPosit" +
      "ionInfo.proto\"d\n\026GetSceneNpcPositionRsp\022" +
      "\017\n\007retcode\030\n \001(\005\022\'\n\rnpc_info_list\030\016 \003(\0132" +
      "\020.NpcPositionInfo\022\020\n\010scene_id\030\004 \001(\rB\026\n\024i" +
      "o.grasscutter.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.grasscutter.proto.NpcPositionInfoOuterClass.getDescriptor(),
        });
    internal_static_GetSceneNpcPositionRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GetSceneNpcPositionRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetSceneNpcPositionRsp_descriptor,
        new java.lang.String[] { "Retcode", "NpcInfoList", "SceneId", });
    io.grasscutter.proto.NpcPositionInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
