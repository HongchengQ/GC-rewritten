// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MistTrialGetChallengeMissionRsp.proto

package io.grasscutter.proto;

public final class MistTrialGetChallengeMissionRspOuterClass {
  private MistTrialGetChallengeMissionRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MistTrialGetChallengeMissionRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:MistTrialGetChallengeMissionRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 trial_id = 1;</code>
     * @return The trialId.
     */
    int getTrialId();

    /**
     * <code>repeated .MistTrialMissionInfo mission_info_list = 15;</code>
     */
    java.util.List<io.grasscutter.proto.MistTrialMissionInfoOuterClass.MistTrialMissionInfo> 
        getMissionInfoListList();
    /**
     * <code>repeated .MistTrialMissionInfo mission_info_list = 15;</code>
     */
    io.grasscutter.proto.MistTrialMissionInfoOuterClass.MistTrialMissionInfo getMissionInfoList(int index);
    /**
     * <code>repeated .MistTrialMissionInfo mission_info_list = 15;</code>
     */
    int getMissionInfoListCount();
    /**
     * <code>repeated .MistTrialMissionInfo mission_info_list = 15;</code>
     */
    java.util.List<? extends io.grasscutter.proto.MistTrialMissionInfoOuterClass.MistTrialMissionInfoOrBuilder> 
        getMissionInfoListOrBuilderList();
    /**
     * <code>repeated .MistTrialMissionInfo mission_info_list = 15;</code>
     */
    io.grasscutter.proto.MistTrialMissionInfoOuterClass.MistTrialMissionInfoOrBuilder getMissionInfoListOrBuilder(
        int index);

    /**
     * <code>int32 retcode = 11;</code>
     * @return The retcode.
     */
    int getRetcode();
  }
  /**
   * <pre>
   * CmdId: 8508
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code MistTrialGetChallengeMissionRsp}
   */
  public static final class MistTrialGetChallengeMissionRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:MistTrialGetChallengeMissionRsp)
      MistTrialGetChallengeMissionRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MistTrialGetChallengeMissionRsp.newBuilder() to construct.
    private MistTrialGetChallengeMissionRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MistTrialGetChallengeMissionRsp() {
      missionInfoList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new MistTrialGetChallengeMissionRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private MistTrialGetChallengeMissionRsp(
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
            case 8: {

              trialId_ = input.readUInt32();
              break;
            }
            case 88: {

              retcode_ = input.readInt32();
              break;
            }
            case 122: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                missionInfoList_ = new java.util.ArrayList<io.grasscutter.proto.MistTrialMissionInfoOuterClass.MistTrialMissionInfo>();
                mutable_bitField0_ |= 0x00000001;
              }
              missionInfoList_.add(
                  input.readMessage(io.grasscutter.proto.MistTrialMissionInfoOuterClass.MistTrialMissionInfo.parser(), extensionRegistry));
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
          missionInfoList_ = java.util.Collections.unmodifiableList(missionInfoList_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grasscutter.proto.MistTrialGetChallengeMissionRspOuterClass.internal_static_MistTrialGetChallengeMissionRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.proto.MistTrialGetChallengeMissionRspOuterClass.internal_static_MistTrialGetChallengeMissionRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.proto.MistTrialGetChallengeMissionRspOuterClass.MistTrialGetChallengeMissionRsp.class, io.grasscutter.proto.MistTrialGetChallengeMissionRspOuterClass.MistTrialGetChallengeMissionRsp.Builder.class);
    }

    public static final int TRIAL_ID_FIELD_NUMBER = 1;
    private int trialId_;
    /**
     * <code>uint32 trial_id = 1;</code>
     * @return The trialId.
     */
    @java.lang.Override
    public int getTrialId() {
      return trialId_;
    }

    public static final int MISSION_INFO_LIST_FIELD_NUMBER = 15;
    private java.util.List<io.grasscutter.proto.MistTrialMissionInfoOuterClass.MistTrialMissionInfo> missionInfoList_;
    /**
     * <code>repeated .MistTrialMissionInfo mission_info_list = 15;</code>
     */
    @java.lang.Override
    public java.util.List<io.grasscutter.proto.MistTrialMissionInfoOuterClass.MistTrialMissionInfo> getMissionInfoListList() {
      return missionInfoList_;
    }
    /**
     * <code>repeated .MistTrialMissionInfo mission_info_list = 15;</code>
     */
    @java.lang.Override
    public java.util.List<? extends io.grasscutter.proto.MistTrialMissionInfoOuterClass.MistTrialMissionInfoOrBuilder> 
        getMissionInfoListOrBuilderList() {
      return missionInfoList_;
    }
    /**
     * <code>repeated .MistTrialMissionInfo mission_info_list = 15;</code>
     */
    @java.lang.Override
    public int getMissionInfoListCount() {
      return missionInfoList_.size();
    }
    /**
     * <code>repeated .MistTrialMissionInfo mission_info_list = 15;</code>
     */
    @java.lang.Override
    public io.grasscutter.proto.MistTrialMissionInfoOuterClass.MistTrialMissionInfo getMissionInfoList(int index) {
      return missionInfoList_.get(index);
    }
    /**
     * <code>repeated .MistTrialMissionInfo mission_info_list = 15;</code>
     */
    @java.lang.Override
    public io.grasscutter.proto.MistTrialMissionInfoOuterClass.MistTrialMissionInfoOrBuilder getMissionInfoListOrBuilder(
        int index) {
      return missionInfoList_.get(index);
    }

    public static final int RETCODE_FIELD_NUMBER = 11;
    private int retcode_;
    /**
     * <code>int32 retcode = 11;</code>
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
      if (trialId_ != 0) {
        output.writeUInt32(1, trialId_);
      }
      if (retcode_ != 0) {
        output.writeInt32(11, retcode_);
      }
      for (int i = 0; i < missionInfoList_.size(); i++) {
        output.writeMessage(15, missionInfoList_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (trialId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, trialId_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(11, retcode_);
      }
      for (int i = 0; i < missionInfoList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(15, missionInfoList_.get(i));
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
      if (!(obj instanceof io.grasscutter.proto.MistTrialGetChallengeMissionRspOuterClass.MistTrialGetChallengeMissionRsp)) {
        return super.equals(obj);
      }
      io.grasscutter.proto.MistTrialGetChallengeMissionRspOuterClass.MistTrialGetChallengeMissionRsp other = (io.grasscutter.proto.MistTrialGetChallengeMissionRspOuterClass.MistTrialGetChallengeMissionRsp) obj;

      if (getTrialId()
          != other.getTrialId()) return false;
      if (!getMissionInfoListList()
          .equals(other.getMissionInfoListList())) return false;
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
      hash = (37 * hash) + TRIAL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getTrialId();
      if (getMissionInfoListCount() > 0) {
        hash = (37 * hash) + MISSION_INFO_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getMissionInfoListList().hashCode();
      }
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.grasscutter.proto.MistTrialGetChallengeMissionRspOuterClass.MistTrialGetChallengeMissionRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.MistTrialGetChallengeMissionRspOuterClass.MistTrialGetChallengeMissionRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.MistTrialGetChallengeMissionRspOuterClass.MistTrialGetChallengeMissionRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.MistTrialGetChallengeMissionRspOuterClass.MistTrialGetChallengeMissionRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.MistTrialGetChallengeMissionRspOuterClass.MistTrialGetChallengeMissionRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.MistTrialGetChallengeMissionRspOuterClass.MistTrialGetChallengeMissionRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.MistTrialGetChallengeMissionRspOuterClass.MistTrialGetChallengeMissionRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.MistTrialGetChallengeMissionRspOuterClass.MistTrialGetChallengeMissionRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.MistTrialGetChallengeMissionRspOuterClass.MistTrialGetChallengeMissionRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.MistTrialGetChallengeMissionRspOuterClass.MistTrialGetChallengeMissionRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.MistTrialGetChallengeMissionRspOuterClass.MistTrialGetChallengeMissionRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.MistTrialGetChallengeMissionRspOuterClass.MistTrialGetChallengeMissionRsp parseFrom(
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
    public static Builder newBuilder(io.grasscutter.proto.MistTrialGetChallengeMissionRspOuterClass.MistTrialGetChallengeMissionRsp prototype) {
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
     * CmdId: 8508
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code MistTrialGetChallengeMissionRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:MistTrialGetChallengeMissionRsp)
        io.grasscutter.proto.MistTrialGetChallengeMissionRspOuterClass.MistTrialGetChallengeMissionRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.grasscutter.proto.MistTrialGetChallengeMissionRspOuterClass.internal_static_MistTrialGetChallengeMissionRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.grasscutter.proto.MistTrialGetChallengeMissionRspOuterClass.internal_static_MistTrialGetChallengeMissionRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.grasscutter.proto.MistTrialGetChallengeMissionRspOuterClass.MistTrialGetChallengeMissionRsp.class, io.grasscutter.proto.MistTrialGetChallengeMissionRspOuterClass.MistTrialGetChallengeMissionRsp.Builder.class);
      }

      // Construct using io.grasscutter.proto.MistTrialGetChallengeMissionRspOuterClass.MistTrialGetChallengeMissionRsp.newBuilder()
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
          getMissionInfoListFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        trialId_ = 0;

        if (missionInfoListBuilder_ == null) {
          missionInfoList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          missionInfoListBuilder_.clear();
        }
        retcode_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.grasscutter.proto.MistTrialGetChallengeMissionRspOuterClass.internal_static_MistTrialGetChallengeMissionRsp_descriptor;
      }

      @java.lang.Override
      public io.grasscutter.proto.MistTrialGetChallengeMissionRspOuterClass.MistTrialGetChallengeMissionRsp getDefaultInstanceForType() {
        return io.grasscutter.proto.MistTrialGetChallengeMissionRspOuterClass.MistTrialGetChallengeMissionRsp.getDefaultInstance();
      }

      @java.lang.Override
      public io.grasscutter.proto.MistTrialGetChallengeMissionRspOuterClass.MistTrialGetChallengeMissionRsp build() {
        io.grasscutter.proto.MistTrialGetChallengeMissionRspOuterClass.MistTrialGetChallengeMissionRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.grasscutter.proto.MistTrialGetChallengeMissionRspOuterClass.MistTrialGetChallengeMissionRsp buildPartial() {
        io.grasscutter.proto.MistTrialGetChallengeMissionRspOuterClass.MistTrialGetChallengeMissionRsp result = new io.grasscutter.proto.MistTrialGetChallengeMissionRspOuterClass.MistTrialGetChallengeMissionRsp(this);
        int from_bitField0_ = bitField0_;
        result.trialId_ = trialId_;
        if (missionInfoListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            missionInfoList_ = java.util.Collections.unmodifiableList(missionInfoList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.missionInfoList_ = missionInfoList_;
        } else {
          result.missionInfoList_ = missionInfoListBuilder_.build();
        }
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
        if (other instanceof io.grasscutter.proto.MistTrialGetChallengeMissionRspOuterClass.MistTrialGetChallengeMissionRsp) {
          return mergeFrom((io.grasscutter.proto.MistTrialGetChallengeMissionRspOuterClass.MistTrialGetChallengeMissionRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.grasscutter.proto.MistTrialGetChallengeMissionRspOuterClass.MistTrialGetChallengeMissionRsp other) {
        if (other == io.grasscutter.proto.MistTrialGetChallengeMissionRspOuterClass.MistTrialGetChallengeMissionRsp.getDefaultInstance()) return this;
        if (other.getTrialId() != 0) {
          setTrialId(other.getTrialId());
        }
        if (missionInfoListBuilder_ == null) {
          if (!other.missionInfoList_.isEmpty()) {
            if (missionInfoList_.isEmpty()) {
              missionInfoList_ = other.missionInfoList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureMissionInfoListIsMutable();
              missionInfoList_.addAll(other.missionInfoList_);
            }
            onChanged();
          }
        } else {
          if (!other.missionInfoList_.isEmpty()) {
            if (missionInfoListBuilder_.isEmpty()) {
              missionInfoListBuilder_.dispose();
              missionInfoListBuilder_ = null;
              missionInfoList_ = other.missionInfoList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              missionInfoListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getMissionInfoListFieldBuilder() : null;
            } else {
              missionInfoListBuilder_.addAllMessages(other.missionInfoList_);
            }
          }
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
        io.grasscutter.proto.MistTrialGetChallengeMissionRspOuterClass.MistTrialGetChallengeMissionRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.grasscutter.proto.MistTrialGetChallengeMissionRspOuterClass.MistTrialGetChallengeMissionRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int trialId_ ;
      /**
       * <code>uint32 trial_id = 1;</code>
       * @return The trialId.
       */
      @java.lang.Override
      public int getTrialId() {
        return trialId_;
      }
      /**
       * <code>uint32 trial_id = 1;</code>
       * @param value The trialId to set.
       * @return This builder for chaining.
       */
      public Builder setTrialId(int value) {
        
        trialId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 trial_id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearTrialId() {
        
        trialId_ = 0;
        onChanged();
        return this;
      }

      private java.util.List<io.grasscutter.proto.MistTrialMissionInfoOuterClass.MistTrialMissionInfo> missionInfoList_ =
        java.util.Collections.emptyList();
      private void ensureMissionInfoListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          missionInfoList_ = new java.util.ArrayList<io.grasscutter.proto.MistTrialMissionInfoOuterClass.MistTrialMissionInfo>(missionInfoList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          io.grasscutter.proto.MistTrialMissionInfoOuterClass.MistTrialMissionInfo, io.grasscutter.proto.MistTrialMissionInfoOuterClass.MistTrialMissionInfo.Builder, io.grasscutter.proto.MistTrialMissionInfoOuterClass.MistTrialMissionInfoOrBuilder> missionInfoListBuilder_;

      /**
       * <code>repeated .MistTrialMissionInfo mission_info_list = 15;</code>
       */
      public java.util.List<io.grasscutter.proto.MistTrialMissionInfoOuterClass.MistTrialMissionInfo> getMissionInfoListList() {
        if (missionInfoListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(missionInfoList_);
        } else {
          return missionInfoListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .MistTrialMissionInfo mission_info_list = 15;</code>
       */
      public int getMissionInfoListCount() {
        if (missionInfoListBuilder_ == null) {
          return missionInfoList_.size();
        } else {
          return missionInfoListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .MistTrialMissionInfo mission_info_list = 15;</code>
       */
      public io.grasscutter.proto.MistTrialMissionInfoOuterClass.MistTrialMissionInfo getMissionInfoList(int index) {
        if (missionInfoListBuilder_ == null) {
          return missionInfoList_.get(index);
        } else {
          return missionInfoListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .MistTrialMissionInfo mission_info_list = 15;</code>
       */
      public Builder setMissionInfoList(
          int index, io.grasscutter.proto.MistTrialMissionInfoOuterClass.MistTrialMissionInfo value) {
        if (missionInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureMissionInfoListIsMutable();
          missionInfoList_.set(index, value);
          onChanged();
        } else {
          missionInfoListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .MistTrialMissionInfo mission_info_list = 15;</code>
       */
      public Builder setMissionInfoList(
          int index, io.grasscutter.proto.MistTrialMissionInfoOuterClass.MistTrialMissionInfo.Builder builderForValue) {
        if (missionInfoListBuilder_ == null) {
          ensureMissionInfoListIsMutable();
          missionInfoList_.set(index, builderForValue.build());
          onChanged();
        } else {
          missionInfoListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .MistTrialMissionInfo mission_info_list = 15;</code>
       */
      public Builder addMissionInfoList(io.grasscutter.proto.MistTrialMissionInfoOuterClass.MistTrialMissionInfo value) {
        if (missionInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureMissionInfoListIsMutable();
          missionInfoList_.add(value);
          onChanged();
        } else {
          missionInfoListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .MistTrialMissionInfo mission_info_list = 15;</code>
       */
      public Builder addMissionInfoList(
          int index, io.grasscutter.proto.MistTrialMissionInfoOuterClass.MistTrialMissionInfo value) {
        if (missionInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureMissionInfoListIsMutable();
          missionInfoList_.add(index, value);
          onChanged();
        } else {
          missionInfoListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .MistTrialMissionInfo mission_info_list = 15;</code>
       */
      public Builder addMissionInfoList(
          io.grasscutter.proto.MistTrialMissionInfoOuterClass.MistTrialMissionInfo.Builder builderForValue) {
        if (missionInfoListBuilder_ == null) {
          ensureMissionInfoListIsMutable();
          missionInfoList_.add(builderForValue.build());
          onChanged();
        } else {
          missionInfoListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .MistTrialMissionInfo mission_info_list = 15;</code>
       */
      public Builder addMissionInfoList(
          int index, io.grasscutter.proto.MistTrialMissionInfoOuterClass.MistTrialMissionInfo.Builder builderForValue) {
        if (missionInfoListBuilder_ == null) {
          ensureMissionInfoListIsMutable();
          missionInfoList_.add(index, builderForValue.build());
          onChanged();
        } else {
          missionInfoListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .MistTrialMissionInfo mission_info_list = 15;</code>
       */
      public Builder addAllMissionInfoList(
          java.lang.Iterable<? extends io.grasscutter.proto.MistTrialMissionInfoOuterClass.MistTrialMissionInfo> values) {
        if (missionInfoListBuilder_ == null) {
          ensureMissionInfoListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, missionInfoList_);
          onChanged();
        } else {
          missionInfoListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .MistTrialMissionInfo mission_info_list = 15;</code>
       */
      public Builder clearMissionInfoList() {
        if (missionInfoListBuilder_ == null) {
          missionInfoList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          missionInfoListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .MistTrialMissionInfo mission_info_list = 15;</code>
       */
      public Builder removeMissionInfoList(int index) {
        if (missionInfoListBuilder_ == null) {
          ensureMissionInfoListIsMutable();
          missionInfoList_.remove(index);
          onChanged();
        } else {
          missionInfoListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .MistTrialMissionInfo mission_info_list = 15;</code>
       */
      public io.grasscutter.proto.MistTrialMissionInfoOuterClass.MistTrialMissionInfo.Builder getMissionInfoListBuilder(
          int index) {
        return getMissionInfoListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .MistTrialMissionInfo mission_info_list = 15;</code>
       */
      public io.grasscutter.proto.MistTrialMissionInfoOuterClass.MistTrialMissionInfoOrBuilder getMissionInfoListOrBuilder(
          int index) {
        if (missionInfoListBuilder_ == null) {
          return missionInfoList_.get(index);  } else {
          return missionInfoListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .MistTrialMissionInfo mission_info_list = 15;</code>
       */
      public java.util.List<? extends io.grasscutter.proto.MistTrialMissionInfoOuterClass.MistTrialMissionInfoOrBuilder> 
           getMissionInfoListOrBuilderList() {
        if (missionInfoListBuilder_ != null) {
          return missionInfoListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(missionInfoList_);
        }
      }
      /**
       * <code>repeated .MistTrialMissionInfo mission_info_list = 15;</code>
       */
      public io.grasscutter.proto.MistTrialMissionInfoOuterClass.MistTrialMissionInfo.Builder addMissionInfoListBuilder() {
        return getMissionInfoListFieldBuilder().addBuilder(
            io.grasscutter.proto.MistTrialMissionInfoOuterClass.MistTrialMissionInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .MistTrialMissionInfo mission_info_list = 15;</code>
       */
      public io.grasscutter.proto.MistTrialMissionInfoOuterClass.MistTrialMissionInfo.Builder addMissionInfoListBuilder(
          int index) {
        return getMissionInfoListFieldBuilder().addBuilder(
            index, io.grasscutter.proto.MistTrialMissionInfoOuterClass.MistTrialMissionInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .MistTrialMissionInfo mission_info_list = 15;</code>
       */
      public java.util.List<io.grasscutter.proto.MistTrialMissionInfoOuterClass.MistTrialMissionInfo.Builder> 
           getMissionInfoListBuilderList() {
        return getMissionInfoListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          io.grasscutter.proto.MistTrialMissionInfoOuterClass.MistTrialMissionInfo, io.grasscutter.proto.MistTrialMissionInfoOuterClass.MistTrialMissionInfo.Builder, io.grasscutter.proto.MistTrialMissionInfoOuterClass.MistTrialMissionInfoOrBuilder> 
          getMissionInfoListFieldBuilder() {
        if (missionInfoListBuilder_ == null) {
          missionInfoListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              io.grasscutter.proto.MistTrialMissionInfoOuterClass.MistTrialMissionInfo, io.grasscutter.proto.MistTrialMissionInfoOuterClass.MistTrialMissionInfo.Builder, io.grasscutter.proto.MistTrialMissionInfoOuterClass.MistTrialMissionInfoOrBuilder>(
                  missionInfoList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          missionInfoList_ = null;
        }
        return missionInfoListBuilder_;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 11;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 11;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 11;</code>
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


      // @@protoc_insertion_point(builder_scope:MistTrialGetChallengeMissionRsp)
    }

    // @@protoc_insertion_point(class_scope:MistTrialGetChallengeMissionRsp)
    private static final io.grasscutter.proto.MistTrialGetChallengeMissionRspOuterClass.MistTrialGetChallengeMissionRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.grasscutter.proto.MistTrialGetChallengeMissionRspOuterClass.MistTrialGetChallengeMissionRsp();
    }

    public static io.grasscutter.proto.MistTrialGetChallengeMissionRspOuterClass.MistTrialGetChallengeMissionRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MistTrialGetChallengeMissionRsp>
        PARSER = new com.google.protobuf.AbstractParser<MistTrialGetChallengeMissionRsp>() {
      @java.lang.Override
      public MistTrialGetChallengeMissionRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new MistTrialGetChallengeMissionRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<MistTrialGetChallengeMissionRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MistTrialGetChallengeMissionRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.grasscutter.proto.MistTrialGetChallengeMissionRspOuterClass.MistTrialGetChallengeMissionRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MistTrialGetChallengeMissionRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MistTrialGetChallengeMissionRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n%MistTrialGetChallengeMissionRsp.proto\032" +
      "\032MistTrialMissionInfo.proto\"v\n\037MistTrial" +
      "GetChallengeMissionRsp\022\020\n\010trial_id\030\001 \001(\r" +
      "\0220\n\021mission_info_list\030\017 \003(\0132\025.MistTrialM" +
      "issionInfo\022\017\n\007retcode\030\013 \001(\005B\026\n\024io.grassc" +
      "utter.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.grasscutter.proto.MistTrialMissionInfoOuterClass.getDescriptor(),
        });
    internal_static_MistTrialGetChallengeMissionRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_MistTrialGetChallengeMissionRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MistTrialGetChallengeMissionRsp_descriptor,
        new java.lang.String[] { "TrialId", "MissionInfoList", "Retcode", });
    io.grasscutter.proto.MistTrialMissionInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
