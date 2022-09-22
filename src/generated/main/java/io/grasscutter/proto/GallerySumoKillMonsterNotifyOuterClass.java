// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GallerySumoKillMonsterNotify.proto

package io.grasscutter.proto;

public final class GallerySumoKillMonsterNotifyOuterClass {
  private GallerySumoKillMonsterNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GallerySumoKillMonsterNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GallerySumoKillMonsterNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 kill_normal_mosnter_num = 4;</code>
     * @return The killNormalMosnterNum.
     */
    int getKillNormalMosnterNum();

    /**
     * <code>uint32 score = 7;</code>
     * @return The score.
     */
    int getScore();

    /**
     * <code>uint32 kill_elite_monster_num = 14;</code>
     * @return The killEliteMonsterNum.
     */
    int getKillEliteMonsterNum();

    /**
     * <code>uint32 gallery_id = 11;</code>
     * @return The galleryId.
     */
    int getGalleryId();
  }
  /**
   * <pre>
   * CmdId: 5582
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code GallerySumoKillMonsterNotify}
   */
  public static final class GallerySumoKillMonsterNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GallerySumoKillMonsterNotify)
      GallerySumoKillMonsterNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GallerySumoKillMonsterNotify.newBuilder() to construct.
    private GallerySumoKillMonsterNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GallerySumoKillMonsterNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GallerySumoKillMonsterNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GallerySumoKillMonsterNotify(
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
            case 32: {

              killNormalMosnterNum_ = input.readUInt32();
              break;
            }
            case 56: {

              score_ = input.readUInt32();
              break;
            }
            case 88: {

              galleryId_ = input.readUInt32();
              break;
            }
            case 112: {

              killEliteMonsterNum_ = input.readUInt32();
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
      return io.grasscutter.proto.GallerySumoKillMonsterNotifyOuterClass.internal_static_GallerySumoKillMonsterNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.proto.GallerySumoKillMonsterNotifyOuterClass.internal_static_GallerySumoKillMonsterNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.proto.GallerySumoKillMonsterNotifyOuterClass.GallerySumoKillMonsterNotify.class, io.grasscutter.proto.GallerySumoKillMonsterNotifyOuterClass.GallerySumoKillMonsterNotify.Builder.class);
    }

    public static final int KILL_NORMAL_MOSNTER_NUM_FIELD_NUMBER = 4;
    private int killNormalMosnterNum_;
    /**
     * <code>uint32 kill_normal_mosnter_num = 4;</code>
     * @return The killNormalMosnterNum.
     */
    @java.lang.Override
    public int getKillNormalMosnterNum() {
      return killNormalMosnterNum_;
    }

    public static final int SCORE_FIELD_NUMBER = 7;
    private int score_;
    /**
     * <code>uint32 score = 7;</code>
     * @return The score.
     */
    @java.lang.Override
    public int getScore() {
      return score_;
    }

    public static final int KILL_ELITE_MONSTER_NUM_FIELD_NUMBER = 14;
    private int killEliteMonsterNum_;
    /**
     * <code>uint32 kill_elite_monster_num = 14;</code>
     * @return The killEliteMonsterNum.
     */
    @java.lang.Override
    public int getKillEliteMonsterNum() {
      return killEliteMonsterNum_;
    }

    public static final int GALLERY_ID_FIELD_NUMBER = 11;
    private int galleryId_;
    /**
     * <code>uint32 gallery_id = 11;</code>
     * @return The galleryId.
     */
    @java.lang.Override
    public int getGalleryId() {
      return galleryId_;
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
      if (killNormalMosnterNum_ != 0) {
        output.writeUInt32(4, killNormalMosnterNum_);
      }
      if (score_ != 0) {
        output.writeUInt32(7, score_);
      }
      if (galleryId_ != 0) {
        output.writeUInt32(11, galleryId_);
      }
      if (killEliteMonsterNum_ != 0) {
        output.writeUInt32(14, killEliteMonsterNum_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (killNormalMosnterNum_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, killNormalMosnterNum_);
      }
      if (score_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, score_);
      }
      if (galleryId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, galleryId_);
      }
      if (killEliteMonsterNum_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, killEliteMonsterNum_);
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
      if (!(obj instanceof io.grasscutter.proto.GallerySumoKillMonsterNotifyOuterClass.GallerySumoKillMonsterNotify)) {
        return super.equals(obj);
      }
      io.grasscutter.proto.GallerySumoKillMonsterNotifyOuterClass.GallerySumoKillMonsterNotify other = (io.grasscutter.proto.GallerySumoKillMonsterNotifyOuterClass.GallerySumoKillMonsterNotify) obj;

      if (getKillNormalMosnterNum()
          != other.getKillNormalMosnterNum()) return false;
      if (getScore()
          != other.getScore()) return false;
      if (getKillEliteMonsterNum()
          != other.getKillEliteMonsterNum()) return false;
      if (getGalleryId()
          != other.getGalleryId()) return false;
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
      hash = (37 * hash) + KILL_NORMAL_MOSNTER_NUM_FIELD_NUMBER;
      hash = (53 * hash) + getKillNormalMosnterNum();
      hash = (37 * hash) + SCORE_FIELD_NUMBER;
      hash = (53 * hash) + getScore();
      hash = (37 * hash) + KILL_ELITE_MONSTER_NUM_FIELD_NUMBER;
      hash = (53 * hash) + getKillEliteMonsterNum();
      hash = (37 * hash) + GALLERY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getGalleryId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.grasscutter.proto.GallerySumoKillMonsterNotifyOuterClass.GallerySumoKillMonsterNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.GallerySumoKillMonsterNotifyOuterClass.GallerySumoKillMonsterNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.GallerySumoKillMonsterNotifyOuterClass.GallerySumoKillMonsterNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.GallerySumoKillMonsterNotifyOuterClass.GallerySumoKillMonsterNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.GallerySumoKillMonsterNotifyOuterClass.GallerySumoKillMonsterNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.GallerySumoKillMonsterNotifyOuterClass.GallerySumoKillMonsterNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.GallerySumoKillMonsterNotifyOuterClass.GallerySumoKillMonsterNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.GallerySumoKillMonsterNotifyOuterClass.GallerySumoKillMonsterNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.GallerySumoKillMonsterNotifyOuterClass.GallerySumoKillMonsterNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.GallerySumoKillMonsterNotifyOuterClass.GallerySumoKillMonsterNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.GallerySumoKillMonsterNotifyOuterClass.GallerySumoKillMonsterNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.GallerySumoKillMonsterNotifyOuterClass.GallerySumoKillMonsterNotify parseFrom(
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
    public static Builder newBuilder(io.grasscutter.proto.GallerySumoKillMonsterNotifyOuterClass.GallerySumoKillMonsterNotify prototype) {
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
     * CmdId: 5582
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code GallerySumoKillMonsterNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GallerySumoKillMonsterNotify)
        io.grasscutter.proto.GallerySumoKillMonsterNotifyOuterClass.GallerySumoKillMonsterNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.grasscutter.proto.GallerySumoKillMonsterNotifyOuterClass.internal_static_GallerySumoKillMonsterNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.grasscutter.proto.GallerySumoKillMonsterNotifyOuterClass.internal_static_GallerySumoKillMonsterNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.grasscutter.proto.GallerySumoKillMonsterNotifyOuterClass.GallerySumoKillMonsterNotify.class, io.grasscutter.proto.GallerySumoKillMonsterNotifyOuterClass.GallerySumoKillMonsterNotify.Builder.class);
      }

      // Construct using io.grasscutter.proto.GallerySumoKillMonsterNotifyOuterClass.GallerySumoKillMonsterNotify.newBuilder()
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
        killNormalMosnterNum_ = 0;

        score_ = 0;

        killEliteMonsterNum_ = 0;

        galleryId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.grasscutter.proto.GallerySumoKillMonsterNotifyOuterClass.internal_static_GallerySumoKillMonsterNotify_descriptor;
      }

      @java.lang.Override
      public io.grasscutter.proto.GallerySumoKillMonsterNotifyOuterClass.GallerySumoKillMonsterNotify getDefaultInstanceForType() {
        return io.grasscutter.proto.GallerySumoKillMonsterNotifyOuterClass.GallerySumoKillMonsterNotify.getDefaultInstance();
      }

      @java.lang.Override
      public io.grasscutter.proto.GallerySumoKillMonsterNotifyOuterClass.GallerySumoKillMonsterNotify build() {
        io.grasscutter.proto.GallerySumoKillMonsterNotifyOuterClass.GallerySumoKillMonsterNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.grasscutter.proto.GallerySumoKillMonsterNotifyOuterClass.GallerySumoKillMonsterNotify buildPartial() {
        io.grasscutter.proto.GallerySumoKillMonsterNotifyOuterClass.GallerySumoKillMonsterNotify result = new io.grasscutter.proto.GallerySumoKillMonsterNotifyOuterClass.GallerySumoKillMonsterNotify(this);
        result.killNormalMosnterNum_ = killNormalMosnterNum_;
        result.score_ = score_;
        result.killEliteMonsterNum_ = killEliteMonsterNum_;
        result.galleryId_ = galleryId_;
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
        if (other instanceof io.grasscutter.proto.GallerySumoKillMonsterNotifyOuterClass.GallerySumoKillMonsterNotify) {
          return mergeFrom((io.grasscutter.proto.GallerySumoKillMonsterNotifyOuterClass.GallerySumoKillMonsterNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.grasscutter.proto.GallerySumoKillMonsterNotifyOuterClass.GallerySumoKillMonsterNotify other) {
        if (other == io.grasscutter.proto.GallerySumoKillMonsterNotifyOuterClass.GallerySumoKillMonsterNotify.getDefaultInstance()) return this;
        if (other.getKillNormalMosnterNum() != 0) {
          setKillNormalMosnterNum(other.getKillNormalMosnterNum());
        }
        if (other.getScore() != 0) {
          setScore(other.getScore());
        }
        if (other.getKillEliteMonsterNum() != 0) {
          setKillEliteMonsterNum(other.getKillEliteMonsterNum());
        }
        if (other.getGalleryId() != 0) {
          setGalleryId(other.getGalleryId());
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
        io.grasscutter.proto.GallerySumoKillMonsterNotifyOuterClass.GallerySumoKillMonsterNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.grasscutter.proto.GallerySumoKillMonsterNotifyOuterClass.GallerySumoKillMonsterNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int killNormalMosnterNum_ ;
      /**
       * <code>uint32 kill_normal_mosnter_num = 4;</code>
       * @return The killNormalMosnterNum.
       */
      @java.lang.Override
      public int getKillNormalMosnterNum() {
        return killNormalMosnterNum_;
      }
      /**
       * <code>uint32 kill_normal_mosnter_num = 4;</code>
       * @param value The killNormalMosnterNum to set.
       * @return This builder for chaining.
       */
      public Builder setKillNormalMosnterNum(int value) {
        
        killNormalMosnterNum_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 kill_normal_mosnter_num = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearKillNormalMosnterNum() {
        
        killNormalMosnterNum_ = 0;
        onChanged();
        return this;
      }

      private int score_ ;
      /**
       * <code>uint32 score = 7;</code>
       * @return The score.
       */
      @java.lang.Override
      public int getScore() {
        return score_;
      }
      /**
       * <code>uint32 score = 7;</code>
       * @param value The score to set.
       * @return This builder for chaining.
       */
      public Builder setScore(int value) {
        
        score_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 score = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearScore() {
        
        score_ = 0;
        onChanged();
        return this;
      }

      private int killEliteMonsterNum_ ;
      /**
       * <code>uint32 kill_elite_monster_num = 14;</code>
       * @return The killEliteMonsterNum.
       */
      @java.lang.Override
      public int getKillEliteMonsterNum() {
        return killEliteMonsterNum_;
      }
      /**
       * <code>uint32 kill_elite_monster_num = 14;</code>
       * @param value The killEliteMonsterNum to set.
       * @return This builder for chaining.
       */
      public Builder setKillEliteMonsterNum(int value) {
        
        killEliteMonsterNum_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 kill_elite_monster_num = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearKillEliteMonsterNum() {
        
        killEliteMonsterNum_ = 0;
        onChanged();
        return this;
      }

      private int galleryId_ ;
      /**
       * <code>uint32 gallery_id = 11;</code>
       * @return The galleryId.
       */
      @java.lang.Override
      public int getGalleryId() {
        return galleryId_;
      }
      /**
       * <code>uint32 gallery_id = 11;</code>
       * @param value The galleryId to set.
       * @return This builder for chaining.
       */
      public Builder setGalleryId(int value) {
        
        galleryId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 gallery_id = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearGalleryId() {
        
        galleryId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:GallerySumoKillMonsterNotify)
    }

    // @@protoc_insertion_point(class_scope:GallerySumoKillMonsterNotify)
    private static final io.grasscutter.proto.GallerySumoKillMonsterNotifyOuterClass.GallerySumoKillMonsterNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.grasscutter.proto.GallerySumoKillMonsterNotifyOuterClass.GallerySumoKillMonsterNotify();
    }

    public static io.grasscutter.proto.GallerySumoKillMonsterNotifyOuterClass.GallerySumoKillMonsterNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GallerySumoKillMonsterNotify>
        PARSER = new com.google.protobuf.AbstractParser<GallerySumoKillMonsterNotify>() {
      @java.lang.Override
      public GallerySumoKillMonsterNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GallerySumoKillMonsterNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GallerySumoKillMonsterNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GallerySumoKillMonsterNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.grasscutter.proto.GallerySumoKillMonsterNotifyOuterClass.GallerySumoKillMonsterNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GallerySumoKillMonsterNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GallerySumoKillMonsterNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"GallerySumoKillMonsterNotify.proto\"\202\001\n" +
      "\034GallerySumoKillMonsterNotify\022\037\n\027kill_no" +
      "rmal_mosnter_num\030\004 \001(\r\022\r\n\005score\030\007 \001(\r\022\036\n" +
      "\026kill_elite_monster_num\030\016 \001(\r\022\022\n\ngallery" +
      "_id\030\013 \001(\rB\026\n\024io.grasscutter.protob\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GallerySumoKillMonsterNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GallerySumoKillMonsterNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GallerySumoKillMonsterNotify_descriptor,
        new java.lang.String[] { "KillNormalMosnterNum", "Score", "KillEliteMonsterNum", "GalleryId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
