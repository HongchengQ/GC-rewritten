// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk2700_NCMPMILICGJ.proto

package io.grasscutter.proto;

public final class Unk2700NCMPMILICGJ {
  private Unk2700NCMPMILICGJ() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Unk2700_NCMPMILICGJOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Unk2700_NCMPMILICGJ)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 Unk2700_IGMHNDNGNPG = 3;</code>
     * @return The unk2700IGMHNDNGNPG.
     */
    int getUnk2700IGMHNDNGNPG();

    /**
     * <code>uint32 Unk2700_KIAHJKGOLGO = 7;</code>
     * @return The unk2700KIAHJKGOLGO.
     */
    int getUnk2700KIAHJKGOLGO();

    /**
     * <code>uint32 avatar_id = 11;</code>
     * @return The avatarId.
     */
    int getAvatarId();
  }
  /**
   * <pre>
   * CmdId: 8407
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code Unk2700_NCMPMILICGJ}
   */
  public static final class Unk2700_NCMPMILICGJ extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Unk2700_NCMPMILICGJ)
      Unk2700_NCMPMILICGJOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Unk2700_NCMPMILICGJ.newBuilder() to construct.
    private Unk2700_NCMPMILICGJ(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Unk2700_NCMPMILICGJ() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Unk2700_NCMPMILICGJ();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Unk2700_NCMPMILICGJ(
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
            case 24: {

              unk2700IGMHNDNGNPG_ = input.readUInt32();
              break;
            }
            case 56: {

              unk2700KIAHJKGOLGO_ = input.readUInt32();
              break;
            }
            case 88: {

              avatarId_ = input.readUInt32();
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
      return io.grasscutter.proto.Unk2700NCMPMILICGJ.internal_static_Unk2700_NCMPMILICGJ_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.proto.Unk2700NCMPMILICGJ.internal_static_Unk2700_NCMPMILICGJ_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.proto.Unk2700NCMPMILICGJ.Unk2700_NCMPMILICGJ.class, io.grasscutter.proto.Unk2700NCMPMILICGJ.Unk2700_NCMPMILICGJ.Builder.class);
    }

    public static final int UNK2700_IGMHNDNGNPG_FIELD_NUMBER = 3;
    private int unk2700IGMHNDNGNPG_;
    /**
     * <code>uint32 Unk2700_IGMHNDNGNPG = 3;</code>
     * @return The unk2700IGMHNDNGNPG.
     */
    @java.lang.Override
    public int getUnk2700IGMHNDNGNPG() {
      return unk2700IGMHNDNGNPG_;
    }

    public static final int UNK2700_KIAHJKGOLGO_FIELD_NUMBER = 7;
    private int unk2700KIAHJKGOLGO_;
    /**
     * <code>uint32 Unk2700_KIAHJKGOLGO = 7;</code>
     * @return The unk2700KIAHJKGOLGO.
     */
    @java.lang.Override
    public int getUnk2700KIAHJKGOLGO() {
      return unk2700KIAHJKGOLGO_;
    }

    public static final int AVATAR_ID_FIELD_NUMBER = 11;
    private int avatarId_;
    /**
     * <code>uint32 avatar_id = 11;</code>
     * @return The avatarId.
     */
    @java.lang.Override
    public int getAvatarId() {
      return avatarId_;
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
      if (unk2700IGMHNDNGNPG_ != 0) {
        output.writeUInt32(3, unk2700IGMHNDNGNPG_);
      }
      if (unk2700KIAHJKGOLGO_ != 0) {
        output.writeUInt32(7, unk2700KIAHJKGOLGO_);
      }
      if (avatarId_ != 0) {
        output.writeUInt32(11, avatarId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (unk2700IGMHNDNGNPG_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, unk2700IGMHNDNGNPG_);
      }
      if (unk2700KIAHJKGOLGO_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, unk2700KIAHJKGOLGO_);
      }
      if (avatarId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, avatarId_);
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
      if (!(obj instanceof io.grasscutter.proto.Unk2700NCMPMILICGJ.Unk2700_NCMPMILICGJ)) {
        return super.equals(obj);
      }
      io.grasscutter.proto.Unk2700NCMPMILICGJ.Unk2700_NCMPMILICGJ other = (io.grasscutter.proto.Unk2700NCMPMILICGJ.Unk2700_NCMPMILICGJ) obj;

      if (getUnk2700IGMHNDNGNPG()
          != other.getUnk2700IGMHNDNGNPG()) return false;
      if (getUnk2700KIAHJKGOLGO()
          != other.getUnk2700KIAHJKGOLGO()) return false;
      if (getAvatarId()
          != other.getAvatarId()) return false;
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
      hash = (37 * hash) + UNK2700_IGMHNDNGNPG_FIELD_NUMBER;
      hash = (53 * hash) + getUnk2700IGMHNDNGNPG();
      hash = (37 * hash) + UNK2700_KIAHJKGOLGO_FIELD_NUMBER;
      hash = (53 * hash) + getUnk2700KIAHJKGOLGO();
      hash = (37 * hash) + AVATAR_ID_FIELD_NUMBER;
      hash = (53 * hash) + getAvatarId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.grasscutter.proto.Unk2700NCMPMILICGJ.Unk2700_NCMPMILICGJ parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.Unk2700NCMPMILICGJ.Unk2700_NCMPMILICGJ parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.Unk2700NCMPMILICGJ.Unk2700_NCMPMILICGJ parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.Unk2700NCMPMILICGJ.Unk2700_NCMPMILICGJ parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.Unk2700NCMPMILICGJ.Unk2700_NCMPMILICGJ parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.Unk2700NCMPMILICGJ.Unk2700_NCMPMILICGJ parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.Unk2700NCMPMILICGJ.Unk2700_NCMPMILICGJ parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.Unk2700NCMPMILICGJ.Unk2700_NCMPMILICGJ parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.Unk2700NCMPMILICGJ.Unk2700_NCMPMILICGJ parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.Unk2700NCMPMILICGJ.Unk2700_NCMPMILICGJ parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.Unk2700NCMPMILICGJ.Unk2700_NCMPMILICGJ parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.Unk2700NCMPMILICGJ.Unk2700_NCMPMILICGJ parseFrom(
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
    public static Builder newBuilder(io.grasscutter.proto.Unk2700NCMPMILICGJ.Unk2700_NCMPMILICGJ prototype) {
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
     * CmdId: 8407
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code Unk2700_NCMPMILICGJ}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Unk2700_NCMPMILICGJ)
        io.grasscutter.proto.Unk2700NCMPMILICGJ.Unk2700_NCMPMILICGJOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.grasscutter.proto.Unk2700NCMPMILICGJ.internal_static_Unk2700_NCMPMILICGJ_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.grasscutter.proto.Unk2700NCMPMILICGJ.internal_static_Unk2700_NCMPMILICGJ_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.grasscutter.proto.Unk2700NCMPMILICGJ.Unk2700_NCMPMILICGJ.class, io.grasscutter.proto.Unk2700NCMPMILICGJ.Unk2700_NCMPMILICGJ.Builder.class);
      }

      // Construct using io.grasscutter.proto.Unk2700NCMPMILICGJ.Unk2700_NCMPMILICGJ.newBuilder()
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
        unk2700IGMHNDNGNPG_ = 0;

        unk2700KIAHJKGOLGO_ = 0;

        avatarId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.grasscutter.proto.Unk2700NCMPMILICGJ.internal_static_Unk2700_NCMPMILICGJ_descriptor;
      }

      @java.lang.Override
      public io.grasscutter.proto.Unk2700NCMPMILICGJ.Unk2700_NCMPMILICGJ getDefaultInstanceForType() {
        return io.grasscutter.proto.Unk2700NCMPMILICGJ.Unk2700_NCMPMILICGJ.getDefaultInstance();
      }

      @java.lang.Override
      public io.grasscutter.proto.Unk2700NCMPMILICGJ.Unk2700_NCMPMILICGJ build() {
        io.grasscutter.proto.Unk2700NCMPMILICGJ.Unk2700_NCMPMILICGJ result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.grasscutter.proto.Unk2700NCMPMILICGJ.Unk2700_NCMPMILICGJ buildPartial() {
        io.grasscutter.proto.Unk2700NCMPMILICGJ.Unk2700_NCMPMILICGJ result = new io.grasscutter.proto.Unk2700NCMPMILICGJ.Unk2700_NCMPMILICGJ(this);
        result.unk2700IGMHNDNGNPG_ = unk2700IGMHNDNGNPG_;
        result.unk2700KIAHJKGOLGO_ = unk2700KIAHJKGOLGO_;
        result.avatarId_ = avatarId_;
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
        if (other instanceof io.grasscutter.proto.Unk2700NCMPMILICGJ.Unk2700_NCMPMILICGJ) {
          return mergeFrom((io.grasscutter.proto.Unk2700NCMPMILICGJ.Unk2700_NCMPMILICGJ)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.grasscutter.proto.Unk2700NCMPMILICGJ.Unk2700_NCMPMILICGJ other) {
        if (other == io.grasscutter.proto.Unk2700NCMPMILICGJ.Unk2700_NCMPMILICGJ.getDefaultInstance()) return this;
        if (other.getUnk2700IGMHNDNGNPG() != 0) {
          setUnk2700IGMHNDNGNPG(other.getUnk2700IGMHNDNGNPG());
        }
        if (other.getUnk2700KIAHJKGOLGO() != 0) {
          setUnk2700KIAHJKGOLGO(other.getUnk2700KIAHJKGOLGO());
        }
        if (other.getAvatarId() != 0) {
          setAvatarId(other.getAvatarId());
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
        io.grasscutter.proto.Unk2700NCMPMILICGJ.Unk2700_NCMPMILICGJ parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.grasscutter.proto.Unk2700NCMPMILICGJ.Unk2700_NCMPMILICGJ) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int unk2700IGMHNDNGNPG_ ;
      /**
       * <code>uint32 Unk2700_IGMHNDNGNPG = 3;</code>
       * @return The unk2700IGMHNDNGNPG.
       */
      @java.lang.Override
      public int getUnk2700IGMHNDNGNPG() {
        return unk2700IGMHNDNGNPG_;
      }
      /**
       * <code>uint32 Unk2700_IGMHNDNGNPG = 3;</code>
       * @param value The unk2700IGMHNDNGNPG to set.
       * @return This builder for chaining.
       */
      public Builder setUnk2700IGMHNDNGNPG(int value) {
        
        unk2700IGMHNDNGNPG_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk2700_IGMHNDNGNPG = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk2700IGMHNDNGNPG() {
        
        unk2700IGMHNDNGNPG_ = 0;
        onChanged();
        return this;
      }

      private int unk2700KIAHJKGOLGO_ ;
      /**
       * <code>uint32 Unk2700_KIAHJKGOLGO = 7;</code>
       * @return The unk2700KIAHJKGOLGO.
       */
      @java.lang.Override
      public int getUnk2700KIAHJKGOLGO() {
        return unk2700KIAHJKGOLGO_;
      }
      /**
       * <code>uint32 Unk2700_KIAHJKGOLGO = 7;</code>
       * @param value The unk2700KIAHJKGOLGO to set.
       * @return This builder for chaining.
       */
      public Builder setUnk2700KIAHJKGOLGO(int value) {
        
        unk2700KIAHJKGOLGO_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk2700_KIAHJKGOLGO = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk2700KIAHJKGOLGO() {
        
        unk2700KIAHJKGOLGO_ = 0;
        onChanged();
        return this;
      }

      private int avatarId_ ;
      /**
       * <code>uint32 avatar_id = 11;</code>
       * @return The avatarId.
       */
      @java.lang.Override
      public int getAvatarId() {
        return avatarId_;
      }
      /**
       * <code>uint32 avatar_id = 11;</code>
       * @param value The avatarId to set.
       * @return This builder for chaining.
       */
      public Builder setAvatarId(int value) {
        
        avatarId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 avatar_id = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearAvatarId() {
        
        avatarId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:Unk2700_NCMPMILICGJ)
    }

    // @@protoc_insertion_point(class_scope:Unk2700_NCMPMILICGJ)
    private static final io.grasscutter.proto.Unk2700NCMPMILICGJ.Unk2700_NCMPMILICGJ DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.grasscutter.proto.Unk2700NCMPMILICGJ.Unk2700_NCMPMILICGJ();
    }

    public static io.grasscutter.proto.Unk2700NCMPMILICGJ.Unk2700_NCMPMILICGJ getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Unk2700_NCMPMILICGJ>
        PARSER = new com.google.protobuf.AbstractParser<Unk2700_NCMPMILICGJ>() {
      @java.lang.Override
      public Unk2700_NCMPMILICGJ parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Unk2700_NCMPMILICGJ(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Unk2700_NCMPMILICGJ> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Unk2700_NCMPMILICGJ> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.grasscutter.proto.Unk2700NCMPMILICGJ.Unk2700_NCMPMILICGJ getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk2700_NCMPMILICGJ_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk2700_NCMPMILICGJ_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031Unk2700_NCMPMILICGJ.proto\"b\n\023Unk2700_N" +
      "CMPMILICGJ\022\033\n\023Unk2700_IGMHNDNGNPG\030\003 \001(\r\022" +
      "\033\n\023Unk2700_KIAHJKGOLGO\030\007 \001(\r\022\021\n\tavatar_i" +
      "d\030\013 \001(\rB\026\n\024io.grasscutter.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Unk2700_NCMPMILICGJ_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Unk2700_NCMPMILICGJ_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk2700_NCMPMILICGJ_descriptor,
        new java.lang.String[] { "Unk2700IGMHNDNGNPG", "Unk2700KIAHJKGOLGO", "AvatarId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
