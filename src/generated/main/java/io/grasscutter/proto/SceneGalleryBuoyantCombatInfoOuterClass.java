// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SceneGalleryBuoyantCombatInfo.proto

package io.grasscutter.proto;

public final class SceneGalleryBuoyantCombatInfoOuterClass {
  private SceneGalleryBuoyantCombatInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SceneGalleryBuoyantCombatInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SceneGalleryBuoyantCombatInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 score = 6;</code>
     * @return The score.
     */
    int getScore();

    /**
     * <code>uint32 kill_special_monster_count = 1;</code>
     * @return The killSpecialMonsterCount.
     */
    int getKillSpecialMonsterCount();

    /**
     * <code>uint32 kill_monster_count = 14;</code>
     * @return The killMonsterCount.
     */
    int getKillMonsterCount();
  }
  /**
   * Protobuf type {@code SceneGalleryBuoyantCombatInfo}
   */
  public static final class SceneGalleryBuoyantCombatInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SceneGalleryBuoyantCombatInfo)
      SceneGalleryBuoyantCombatInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SceneGalleryBuoyantCombatInfo.newBuilder() to construct.
    private SceneGalleryBuoyantCombatInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SceneGalleryBuoyantCombatInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SceneGalleryBuoyantCombatInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private SceneGalleryBuoyantCombatInfo(
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

              killSpecialMonsterCount_ = input.readUInt32();
              break;
            }
            case 48: {

              score_ = input.readUInt32();
              break;
            }
            case 112: {

              killMonsterCount_ = input.readUInt32();
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
      return io.grasscutter.proto.SceneGalleryBuoyantCombatInfoOuterClass.internal_static_SceneGalleryBuoyantCombatInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.proto.SceneGalleryBuoyantCombatInfoOuterClass.internal_static_SceneGalleryBuoyantCombatInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.proto.SceneGalleryBuoyantCombatInfoOuterClass.SceneGalleryBuoyantCombatInfo.class, io.grasscutter.proto.SceneGalleryBuoyantCombatInfoOuterClass.SceneGalleryBuoyantCombatInfo.Builder.class);
    }

    public static final int SCORE_FIELD_NUMBER = 6;
    private int score_;
    /**
     * <code>uint32 score = 6;</code>
     * @return The score.
     */
    @java.lang.Override
    public int getScore() {
      return score_;
    }

    public static final int KILL_SPECIAL_MONSTER_COUNT_FIELD_NUMBER = 1;
    private int killSpecialMonsterCount_;
    /**
     * <code>uint32 kill_special_monster_count = 1;</code>
     * @return The killSpecialMonsterCount.
     */
    @java.lang.Override
    public int getKillSpecialMonsterCount() {
      return killSpecialMonsterCount_;
    }

    public static final int KILL_MONSTER_COUNT_FIELD_NUMBER = 14;
    private int killMonsterCount_;
    /**
     * <code>uint32 kill_monster_count = 14;</code>
     * @return The killMonsterCount.
     */
    @java.lang.Override
    public int getKillMonsterCount() {
      return killMonsterCount_;
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
      if (killSpecialMonsterCount_ != 0) {
        output.writeUInt32(1, killSpecialMonsterCount_);
      }
      if (score_ != 0) {
        output.writeUInt32(6, score_);
      }
      if (killMonsterCount_ != 0) {
        output.writeUInt32(14, killMonsterCount_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (killSpecialMonsterCount_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, killSpecialMonsterCount_);
      }
      if (score_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, score_);
      }
      if (killMonsterCount_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, killMonsterCount_);
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
      if (!(obj instanceof io.grasscutter.proto.SceneGalleryBuoyantCombatInfoOuterClass.SceneGalleryBuoyantCombatInfo)) {
        return super.equals(obj);
      }
      io.grasscutter.proto.SceneGalleryBuoyantCombatInfoOuterClass.SceneGalleryBuoyantCombatInfo other = (io.grasscutter.proto.SceneGalleryBuoyantCombatInfoOuterClass.SceneGalleryBuoyantCombatInfo) obj;

      if (getScore()
          != other.getScore()) return false;
      if (getKillSpecialMonsterCount()
          != other.getKillSpecialMonsterCount()) return false;
      if (getKillMonsterCount()
          != other.getKillMonsterCount()) return false;
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
      hash = (37 * hash) + SCORE_FIELD_NUMBER;
      hash = (53 * hash) + getScore();
      hash = (37 * hash) + KILL_SPECIAL_MONSTER_COUNT_FIELD_NUMBER;
      hash = (53 * hash) + getKillSpecialMonsterCount();
      hash = (37 * hash) + KILL_MONSTER_COUNT_FIELD_NUMBER;
      hash = (53 * hash) + getKillMonsterCount();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.grasscutter.proto.SceneGalleryBuoyantCombatInfoOuterClass.SceneGalleryBuoyantCombatInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.SceneGalleryBuoyantCombatInfoOuterClass.SceneGalleryBuoyantCombatInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.SceneGalleryBuoyantCombatInfoOuterClass.SceneGalleryBuoyantCombatInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.SceneGalleryBuoyantCombatInfoOuterClass.SceneGalleryBuoyantCombatInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.SceneGalleryBuoyantCombatInfoOuterClass.SceneGalleryBuoyantCombatInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.SceneGalleryBuoyantCombatInfoOuterClass.SceneGalleryBuoyantCombatInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.SceneGalleryBuoyantCombatInfoOuterClass.SceneGalleryBuoyantCombatInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.SceneGalleryBuoyantCombatInfoOuterClass.SceneGalleryBuoyantCombatInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.SceneGalleryBuoyantCombatInfoOuterClass.SceneGalleryBuoyantCombatInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.SceneGalleryBuoyantCombatInfoOuterClass.SceneGalleryBuoyantCombatInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.SceneGalleryBuoyantCombatInfoOuterClass.SceneGalleryBuoyantCombatInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.SceneGalleryBuoyantCombatInfoOuterClass.SceneGalleryBuoyantCombatInfo parseFrom(
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
    public static Builder newBuilder(io.grasscutter.proto.SceneGalleryBuoyantCombatInfoOuterClass.SceneGalleryBuoyantCombatInfo prototype) {
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
     * Protobuf type {@code SceneGalleryBuoyantCombatInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SceneGalleryBuoyantCombatInfo)
        io.grasscutter.proto.SceneGalleryBuoyantCombatInfoOuterClass.SceneGalleryBuoyantCombatInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.grasscutter.proto.SceneGalleryBuoyantCombatInfoOuterClass.internal_static_SceneGalleryBuoyantCombatInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.grasscutter.proto.SceneGalleryBuoyantCombatInfoOuterClass.internal_static_SceneGalleryBuoyantCombatInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.grasscutter.proto.SceneGalleryBuoyantCombatInfoOuterClass.SceneGalleryBuoyantCombatInfo.class, io.grasscutter.proto.SceneGalleryBuoyantCombatInfoOuterClass.SceneGalleryBuoyantCombatInfo.Builder.class);
      }

      // Construct using io.grasscutter.proto.SceneGalleryBuoyantCombatInfoOuterClass.SceneGalleryBuoyantCombatInfo.newBuilder()
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
        score_ = 0;

        killSpecialMonsterCount_ = 0;

        killMonsterCount_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.grasscutter.proto.SceneGalleryBuoyantCombatInfoOuterClass.internal_static_SceneGalleryBuoyantCombatInfo_descriptor;
      }

      @java.lang.Override
      public io.grasscutter.proto.SceneGalleryBuoyantCombatInfoOuterClass.SceneGalleryBuoyantCombatInfo getDefaultInstanceForType() {
        return io.grasscutter.proto.SceneGalleryBuoyantCombatInfoOuterClass.SceneGalleryBuoyantCombatInfo.getDefaultInstance();
      }

      @java.lang.Override
      public io.grasscutter.proto.SceneGalleryBuoyantCombatInfoOuterClass.SceneGalleryBuoyantCombatInfo build() {
        io.grasscutter.proto.SceneGalleryBuoyantCombatInfoOuterClass.SceneGalleryBuoyantCombatInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.grasscutter.proto.SceneGalleryBuoyantCombatInfoOuterClass.SceneGalleryBuoyantCombatInfo buildPartial() {
        io.grasscutter.proto.SceneGalleryBuoyantCombatInfoOuterClass.SceneGalleryBuoyantCombatInfo result = new io.grasscutter.proto.SceneGalleryBuoyantCombatInfoOuterClass.SceneGalleryBuoyantCombatInfo(this);
        result.score_ = score_;
        result.killSpecialMonsterCount_ = killSpecialMonsterCount_;
        result.killMonsterCount_ = killMonsterCount_;
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
        if (other instanceof io.grasscutter.proto.SceneGalleryBuoyantCombatInfoOuterClass.SceneGalleryBuoyantCombatInfo) {
          return mergeFrom((io.grasscutter.proto.SceneGalleryBuoyantCombatInfoOuterClass.SceneGalleryBuoyantCombatInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.grasscutter.proto.SceneGalleryBuoyantCombatInfoOuterClass.SceneGalleryBuoyantCombatInfo other) {
        if (other == io.grasscutter.proto.SceneGalleryBuoyantCombatInfoOuterClass.SceneGalleryBuoyantCombatInfo.getDefaultInstance()) return this;
        if (other.getScore() != 0) {
          setScore(other.getScore());
        }
        if (other.getKillSpecialMonsterCount() != 0) {
          setKillSpecialMonsterCount(other.getKillSpecialMonsterCount());
        }
        if (other.getKillMonsterCount() != 0) {
          setKillMonsterCount(other.getKillMonsterCount());
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
        io.grasscutter.proto.SceneGalleryBuoyantCombatInfoOuterClass.SceneGalleryBuoyantCombatInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.grasscutter.proto.SceneGalleryBuoyantCombatInfoOuterClass.SceneGalleryBuoyantCombatInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int score_ ;
      /**
       * <code>uint32 score = 6;</code>
       * @return The score.
       */
      @java.lang.Override
      public int getScore() {
        return score_;
      }
      /**
       * <code>uint32 score = 6;</code>
       * @param value The score to set.
       * @return This builder for chaining.
       */
      public Builder setScore(int value) {
        
        score_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 score = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearScore() {
        
        score_ = 0;
        onChanged();
        return this;
      }

      private int killSpecialMonsterCount_ ;
      /**
       * <code>uint32 kill_special_monster_count = 1;</code>
       * @return The killSpecialMonsterCount.
       */
      @java.lang.Override
      public int getKillSpecialMonsterCount() {
        return killSpecialMonsterCount_;
      }
      /**
       * <code>uint32 kill_special_monster_count = 1;</code>
       * @param value The killSpecialMonsterCount to set.
       * @return This builder for chaining.
       */
      public Builder setKillSpecialMonsterCount(int value) {
        
        killSpecialMonsterCount_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 kill_special_monster_count = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearKillSpecialMonsterCount() {
        
        killSpecialMonsterCount_ = 0;
        onChanged();
        return this;
      }

      private int killMonsterCount_ ;
      /**
       * <code>uint32 kill_monster_count = 14;</code>
       * @return The killMonsterCount.
       */
      @java.lang.Override
      public int getKillMonsterCount() {
        return killMonsterCount_;
      }
      /**
       * <code>uint32 kill_monster_count = 14;</code>
       * @param value The killMonsterCount to set.
       * @return This builder for chaining.
       */
      public Builder setKillMonsterCount(int value) {
        
        killMonsterCount_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 kill_monster_count = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearKillMonsterCount() {
        
        killMonsterCount_ = 0;
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


      // @@protoc_insertion_point(builder_scope:SceneGalleryBuoyantCombatInfo)
    }

    // @@protoc_insertion_point(class_scope:SceneGalleryBuoyantCombatInfo)
    private static final io.grasscutter.proto.SceneGalleryBuoyantCombatInfoOuterClass.SceneGalleryBuoyantCombatInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.grasscutter.proto.SceneGalleryBuoyantCombatInfoOuterClass.SceneGalleryBuoyantCombatInfo();
    }

    public static io.grasscutter.proto.SceneGalleryBuoyantCombatInfoOuterClass.SceneGalleryBuoyantCombatInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SceneGalleryBuoyantCombatInfo>
        PARSER = new com.google.protobuf.AbstractParser<SceneGalleryBuoyantCombatInfo>() {
      @java.lang.Override
      public SceneGalleryBuoyantCombatInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SceneGalleryBuoyantCombatInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<SceneGalleryBuoyantCombatInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SceneGalleryBuoyantCombatInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.grasscutter.proto.SceneGalleryBuoyantCombatInfoOuterClass.SceneGalleryBuoyantCombatInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SceneGalleryBuoyantCombatInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SceneGalleryBuoyantCombatInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#SceneGalleryBuoyantCombatInfo.proto\"n\n" +
      "\035SceneGalleryBuoyantCombatInfo\022\r\n\005score\030" +
      "\006 \001(\r\022\"\n\032kill_special_monster_count\030\001 \001(" +
      "\r\022\032\n\022kill_monster_count\030\016 \001(\rB\026\n\024io.gras" +
      "scutter.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_SceneGalleryBuoyantCombatInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SceneGalleryBuoyantCombatInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SceneGalleryBuoyantCombatInfo_descriptor,
        new java.lang.String[] { "Score", "KillSpecialMonsterCount", "KillMonsterCount", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
