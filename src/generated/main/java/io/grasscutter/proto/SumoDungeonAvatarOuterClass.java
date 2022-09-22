// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SumoDungeonAvatar.proto

package io.grasscutter.proto;

public final class SumoDungeonAvatarOuterClass {
  private SumoDungeonAvatarOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SumoDungeonAvatarOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SumoDungeonAvatar)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint64 avatar_guid = 11;</code>
     * @return The avatarGuid.
     */
    long getAvatarGuid();

    /**
     * <code>bool is_alive = 13;</code>
     * @return The isAlive.
     */
    boolean getIsAlive();

    /**
     * <code>bool is_trial = 4;</code>
     * @return The isTrial.
     */
    boolean getIsTrial();
  }
  /**
   * Protobuf type {@code SumoDungeonAvatar}
   */
  public static final class SumoDungeonAvatar extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SumoDungeonAvatar)
      SumoDungeonAvatarOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SumoDungeonAvatar.newBuilder() to construct.
    private SumoDungeonAvatar(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SumoDungeonAvatar() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SumoDungeonAvatar();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private SumoDungeonAvatar(
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

              isTrial_ = input.readBool();
              break;
            }
            case 88: {

              avatarGuid_ = input.readUInt64();
              break;
            }
            case 104: {

              isAlive_ = input.readBool();
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
      return io.grasscutter.proto.SumoDungeonAvatarOuterClass.internal_static_SumoDungeonAvatar_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.proto.SumoDungeonAvatarOuterClass.internal_static_SumoDungeonAvatar_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.proto.SumoDungeonAvatarOuterClass.SumoDungeonAvatar.class, io.grasscutter.proto.SumoDungeonAvatarOuterClass.SumoDungeonAvatar.Builder.class);
    }

    public static final int AVATAR_GUID_FIELD_NUMBER = 11;
    private long avatarGuid_;
    /**
     * <code>uint64 avatar_guid = 11;</code>
     * @return The avatarGuid.
     */
    @java.lang.Override
    public long getAvatarGuid() {
      return avatarGuid_;
    }

    public static final int IS_ALIVE_FIELD_NUMBER = 13;
    private boolean isAlive_;
    /**
     * <code>bool is_alive = 13;</code>
     * @return The isAlive.
     */
    @java.lang.Override
    public boolean getIsAlive() {
      return isAlive_;
    }

    public static final int IS_TRIAL_FIELD_NUMBER = 4;
    private boolean isTrial_;
    /**
     * <code>bool is_trial = 4;</code>
     * @return The isTrial.
     */
    @java.lang.Override
    public boolean getIsTrial() {
      return isTrial_;
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
      if (isTrial_ != false) {
        output.writeBool(4, isTrial_);
      }
      if (avatarGuid_ != 0L) {
        output.writeUInt64(11, avatarGuid_);
      }
      if (isAlive_ != false) {
        output.writeBool(13, isAlive_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isTrial_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(4, isTrial_);
      }
      if (avatarGuid_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(11, avatarGuid_);
      }
      if (isAlive_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(13, isAlive_);
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
      if (!(obj instanceof io.grasscutter.proto.SumoDungeonAvatarOuterClass.SumoDungeonAvatar)) {
        return super.equals(obj);
      }
      io.grasscutter.proto.SumoDungeonAvatarOuterClass.SumoDungeonAvatar other = (io.grasscutter.proto.SumoDungeonAvatarOuterClass.SumoDungeonAvatar) obj;

      if (getAvatarGuid()
          != other.getAvatarGuid()) return false;
      if (getIsAlive()
          != other.getIsAlive()) return false;
      if (getIsTrial()
          != other.getIsTrial()) return false;
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
      hash = (37 * hash) + AVATAR_GUID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getAvatarGuid());
      hash = (37 * hash) + IS_ALIVE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsAlive());
      hash = (37 * hash) + IS_TRIAL_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsTrial());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.grasscutter.proto.SumoDungeonAvatarOuterClass.SumoDungeonAvatar parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.SumoDungeonAvatarOuterClass.SumoDungeonAvatar parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.SumoDungeonAvatarOuterClass.SumoDungeonAvatar parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.SumoDungeonAvatarOuterClass.SumoDungeonAvatar parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.SumoDungeonAvatarOuterClass.SumoDungeonAvatar parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.SumoDungeonAvatarOuterClass.SumoDungeonAvatar parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.SumoDungeonAvatarOuterClass.SumoDungeonAvatar parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.SumoDungeonAvatarOuterClass.SumoDungeonAvatar parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.SumoDungeonAvatarOuterClass.SumoDungeonAvatar parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.SumoDungeonAvatarOuterClass.SumoDungeonAvatar parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.SumoDungeonAvatarOuterClass.SumoDungeonAvatar parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.SumoDungeonAvatarOuterClass.SumoDungeonAvatar parseFrom(
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
    public static Builder newBuilder(io.grasscutter.proto.SumoDungeonAvatarOuterClass.SumoDungeonAvatar prototype) {
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
     * Protobuf type {@code SumoDungeonAvatar}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SumoDungeonAvatar)
        io.grasscutter.proto.SumoDungeonAvatarOuterClass.SumoDungeonAvatarOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.grasscutter.proto.SumoDungeonAvatarOuterClass.internal_static_SumoDungeonAvatar_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.grasscutter.proto.SumoDungeonAvatarOuterClass.internal_static_SumoDungeonAvatar_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.grasscutter.proto.SumoDungeonAvatarOuterClass.SumoDungeonAvatar.class, io.grasscutter.proto.SumoDungeonAvatarOuterClass.SumoDungeonAvatar.Builder.class);
      }

      // Construct using io.grasscutter.proto.SumoDungeonAvatarOuterClass.SumoDungeonAvatar.newBuilder()
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
        avatarGuid_ = 0L;

        isAlive_ = false;

        isTrial_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.grasscutter.proto.SumoDungeonAvatarOuterClass.internal_static_SumoDungeonAvatar_descriptor;
      }

      @java.lang.Override
      public io.grasscutter.proto.SumoDungeonAvatarOuterClass.SumoDungeonAvatar getDefaultInstanceForType() {
        return io.grasscutter.proto.SumoDungeonAvatarOuterClass.SumoDungeonAvatar.getDefaultInstance();
      }

      @java.lang.Override
      public io.grasscutter.proto.SumoDungeonAvatarOuterClass.SumoDungeonAvatar build() {
        io.grasscutter.proto.SumoDungeonAvatarOuterClass.SumoDungeonAvatar result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.grasscutter.proto.SumoDungeonAvatarOuterClass.SumoDungeonAvatar buildPartial() {
        io.grasscutter.proto.SumoDungeonAvatarOuterClass.SumoDungeonAvatar result = new io.grasscutter.proto.SumoDungeonAvatarOuterClass.SumoDungeonAvatar(this);
        result.avatarGuid_ = avatarGuid_;
        result.isAlive_ = isAlive_;
        result.isTrial_ = isTrial_;
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
        if (other instanceof io.grasscutter.proto.SumoDungeonAvatarOuterClass.SumoDungeonAvatar) {
          return mergeFrom((io.grasscutter.proto.SumoDungeonAvatarOuterClass.SumoDungeonAvatar)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.grasscutter.proto.SumoDungeonAvatarOuterClass.SumoDungeonAvatar other) {
        if (other == io.grasscutter.proto.SumoDungeonAvatarOuterClass.SumoDungeonAvatar.getDefaultInstance()) return this;
        if (other.getAvatarGuid() != 0L) {
          setAvatarGuid(other.getAvatarGuid());
        }
        if (other.getIsAlive() != false) {
          setIsAlive(other.getIsAlive());
        }
        if (other.getIsTrial() != false) {
          setIsTrial(other.getIsTrial());
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
        io.grasscutter.proto.SumoDungeonAvatarOuterClass.SumoDungeonAvatar parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.grasscutter.proto.SumoDungeonAvatarOuterClass.SumoDungeonAvatar) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private long avatarGuid_ ;
      /**
       * <code>uint64 avatar_guid = 11;</code>
       * @return The avatarGuid.
       */
      @java.lang.Override
      public long getAvatarGuid() {
        return avatarGuid_;
      }
      /**
       * <code>uint64 avatar_guid = 11;</code>
       * @param value The avatarGuid to set.
       * @return This builder for chaining.
       */
      public Builder setAvatarGuid(long value) {
        
        avatarGuid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 avatar_guid = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearAvatarGuid() {
        
        avatarGuid_ = 0L;
        onChanged();
        return this;
      }

      private boolean isAlive_ ;
      /**
       * <code>bool is_alive = 13;</code>
       * @return The isAlive.
       */
      @java.lang.Override
      public boolean getIsAlive() {
        return isAlive_;
      }
      /**
       * <code>bool is_alive = 13;</code>
       * @param value The isAlive to set.
       * @return This builder for chaining.
       */
      public Builder setIsAlive(boolean value) {
        
        isAlive_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_alive = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsAlive() {
        
        isAlive_ = false;
        onChanged();
        return this;
      }

      private boolean isTrial_ ;
      /**
       * <code>bool is_trial = 4;</code>
       * @return The isTrial.
       */
      @java.lang.Override
      public boolean getIsTrial() {
        return isTrial_;
      }
      /**
       * <code>bool is_trial = 4;</code>
       * @param value The isTrial to set.
       * @return This builder for chaining.
       */
      public Builder setIsTrial(boolean value) {
        
        isTrial_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_trial = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsTrial() {
        
        isTrial_ = false;
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


      // @@protoc_insertion_point(builder_scope:SumoDungeonAvatar)
    }

    // @@protoc_insertion_point(class_scope:SumoDungeonAvatar)
    private static final io.grasscutter.proto.SumoDungeonAvatarOuterClass.SumoDungeonAvatar DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.grasscutter.proto.SumoDungeonAvatarOuterClass.SumoDungeonAvatar();
    }

    public static io.grasscutter.proto.SumoDungeonAvatarOuterClass.SumoDungeonAvatar getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SumoDungeonAvatar>
        PARSER = new com.google.protobuf.AbstractParser<SumoDungeonAvatar>() {
      @java.lang.Override
      public SumoDungeonAvatar parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SumoDungeonAvatar(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<SumoDungeonAvatar> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SumoDungeonAvatar> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.grasscutter.proto.SumoDungeonAvatarOuterClass.SumoDungeonAvatar getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SumoDungeonAvatar_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SumoDungeonAvatar_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027SumoDungeonAvatar.proto\"L\n\021SumoDungeon" +
      "Avatar\022\023\n\013avatar_guid\030\013 \001(\004\022\020\n\010is_alive\030" +
      "\r \001(\010\022\020\n\010is_trial\030\004 \001(\010B\026\n\024io.grasscutte" +
      "r.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_SumoDungeonAvatar_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SumoDungeonAvatar_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SumoDungeonAvatar_descriptor,
        new java.lang.String[] { "AvatarGuid", "IsAlive", "IsTrial", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
