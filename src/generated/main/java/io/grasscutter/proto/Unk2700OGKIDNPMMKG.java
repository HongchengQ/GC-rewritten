// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk2700_OGKIDNPMMKG.proto

package io.grasscutter.proto;

public final class Unk2700OGKIDNPMMKG {
  private Unk2700OGKIDNPMMKG() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Unk2700_OGKIDNPMMKGOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Unk2700_OGKIDNPMMKG)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.Unk2700_HGMCNJOPDAA Unk2700_MINEHKAGOGA = 11;</code>
     * @return The enum numeric value on the wire for unk2700MINEHKAGOGA.
     */
    int getUnk2700MINEHKAGOGAValue();
    /**
     * <code>.Unk2700_HGMCNJOPDAA Unk2700_MINEHKAGOGA = 11;</code>
     * @return The unk2700MINEHKAGOGA.
     */
    io.grasscutter.proto.Unk2700HGMCNJOPDAA.Unk2700_HGMCNJOPDAA getUnk2700MINEHKAGOGA();

    /**
     * <code>uint32 expire_time = 6;</code>
     * @return The expireTime.
     */
    int getExpireTime();

    /**
     * <code>uint64 Unk2700_ONOOJBEABOE = 5;</code>
     * @return The unk2700ONOOJBEABOE.
     */
    long getUnk2700ONOOJBEABOE();
  }
  /**
   * Protobuf type {@code Unk2700_OGKIDNPMMKG}
   */
  public static final class Unk2700_OGKIDNPMMKG extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Unk2700_OGKIDNPMMKG)
      Unk2700_OGKIDNPMMKGOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Unk2700_OGKIDNPMMKG.newBuilder() to construct.
    private Unk2700_OGKIDNPMMKG(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Unk2700_OGKIDNPMMKG() {
      unk2700MINEHKAGOGA_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Unk2700_OGKIDNPMMKG();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Unk2700_OGKIDNPMMKG(
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
            case 40: {

              unk2700ONOOJBEABOE_ = input.readUInt64();
              break;
            }
            case 48: {

              expireTime_ = input.readUInt32();
              break;
            }
            case 88: {
              int rawValue = input.readEnum();

              unk2700MINEHKAGOGA_ = rawValue;
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
      return io.grasscutter.proto.Unk2700OGKIDNPMMKG.internal_static_Unk2700_OGKIDNPMMKG_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.proto.Unk2700OGKIDNPMMKG.internal_static_Unk2700_OGKIDNPMMKG_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.proto.Unk2700OGKIDNPMMKG.Unk2700_OGKIDNPMMKG.class, io.grasscutter.proto.Unk2700OGKIDNPMMKG.Unk2700_OGKIDNPMMKG.Builder.class);
    }

    public static final int UNK2700_MINEHKAGOGA_FIELD_NUMBER = 11;
    private int unk2700MINEHKAGOGA_;
    /**
     * <code>.Unk2700_HGMCNJOPDAA Unk2700_MINEHKAGOGA = 11;</code>
     * @return The enum numeric value on the wire for unk2700MINEHKAGOGA.
     */
    @java.lang.Override public int getUnk2700MINEHKAGOGAValue() {
      return unk2700MINEHKAGOGA_;
    }
    /**
     * <code>.Unk2700_HGMCNJOPDAA Unk2700_MINEHKAGOGA = 11;</code>
     * @return The unk2700MINEHKAGOGA.
     */
    @java.lang.Override public io.grasscutter.proto.Unk2700HGMCNJOPDAA.Unk2700_HGMCNJOPDAA getUnk2700MINEHKAGOGA() {
      @SuppressWarnings("deprecation")
      io.grasscutter.proto.Unk2700HGMCNJOPDAA.Unk2700_HGMCNJOPDAA result = io.grasscutter.proto.Unk2700HGMCNJOPDAA.Unk2700_HGMCNJOPDAA.valueOf(unk2700MINEHKAGOGA_);
      return result == null ? io.grasscutter.proto.Unk2700HGMCNJOPDAA.Unk2700_HGMCNJOPDAA.UNRECOGNIZED : result;
    }

    public static final int EXPIRE_TIME_FIELD_NUMBER = 6;
    private int expireTime_;
    /**
     * <code>uint32 expire_time = 6;</code>
     * @return The expireTime.
     */
    @java.lang.Override
    public int getExpireTime() {
      return expireTime_;
    }

    public static final int UNK2700_ONOOJBEABOE_FIELD_NUMBER = 5;
    private long unk2700ONOOJBEABOE_;
    /**
     * <code>uint64 Unk2700_ONOOJBEABOE = 5;</code>
     * @return The unk2700ONOOJBEABOE.
     */
    @java.lang.Override
    public long getUnk2700ONOOJBEABOE() {
      return unk2700ONOOJBEABOE_;
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
      if (unk2700ONOOJBEABOE_ != 0L) {
        output.writeUInt64(5, unk2700ONOOJBEABOE_);
      }
      if (expireTime_ != 0) {
        output.writeUInt32(6, expireTime_);
      }
      if (unk2700MINEHKAGOGA_ != io.grasscutter.proto.Unk2700HGMCNJOPDAA.Unk2700_HGMCNJOPDAA.Unk2700_HGMCNJOPDAA_NONE.getNumber()) {
        output.writeEnum(11, unk2700MINEHKAGOGA_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (unk2700ONOOJBEABOE_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(5, unk2700ONOOJBEABOE_);
      }
      if (expireTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, expireTime_);
      }
      if (unk2700MINEHKAGOGA_ != io.grasscutter.proto.Unk2700HGMCNJOPDAA.Unk2700_HGMCNJOPDAA.Unk2700_HGMCNJOPDAA_NONE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(11, unk2700MINEHKAGOGA_);
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
      if (!(obj instanceof io.grasscutter.proto.Unk2700OGKIDNPMMKG.Unk2700_OGKIDNPMMKG)) {
        return super.equals(obj);
      }
      io.grasscutter.proto.Unk2700OGKIDNPMMKG.Unk2700_OGKIDNPMMKG other = (io.grasscutter.proto.Unk2700OGKIDNPMMKG.Unk2700_OGKIDNPMMKG) obj;

      if (unk2700MINEHKAGOGA_ != other.unk2700MINEHKAGOGA_) return false;
      if (getExpireTime()
          != other.getExpireTime()) return false;
      if (getUnk2700ONOOJBEABOE()
          != other.getUnk2700ONOOJBEABOE()) return false;
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
      hash = (37 * hash) + UNK2700_MINEHKAGOGA_FIELD_NUMBER;
      hash = (53 * hash) + unk2700MINEHKAGOGA_;
      hash = (37 * hash) + EXPIRE_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getExpireTime();
      hash = (37 * hash) + UNK2700_ONOOJBEABOE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getUnk2700ONOOJBEABOE());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.grasscutter.proto.Unk2700OGKIDNPMMKG.Unk2700_OGKIDNPMMKG parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.Unk2700OGKIDNPMMKG.Unk2700_OGKIDNPMMKG parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.Unk2700OGKIDNPMMKG.Unk2700_OGKIDNPMMKG parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.Unk2700OGKIDNPMMKG.Unk2700_OGKIDNPMMKG parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.Unk2700OGKIDNPMMKG.Unk2700_OGKIDNPMMKG parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.Unk2700OGKIDNPMMKG.Unk2700_OGKIDNPMMKG parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.Unk2700OGKIDNPMMKG.Unk2700_OGKIDNPMMKG parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.Unk2700OGKIDNPMMKG.Unk2700_OGKIDNPMMKG parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.Unk2700OGKIDNPMMKG.Unk2700_OGKIDNPMMKG parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.Unk2700OGKIDNPMMKG.Unk2700_OGKIDNPMMKG parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.Unk2700OGKIDNPMMKG.Unk2700_OGKIDNPMMKG parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.Unk2700OGKIDNPMMKG.Unk2700_OGKIDNPMMKG parseFrom(
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
    public static Builder newBuilder(io.grasscutter.proto.Unk2700OGKIDNPMMKG.Unk2700_OGKIDNPMMKG prototype) {
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
     * Protobuf type {@code Unk2700_OGKIDNPMMKG}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Unk2700_OGKIDNPMMKG)
        io.grasscutter.proto.Unk2700OGKIDNPMMKG.Unk2700_OGKIDNPMMKGOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.grasscutter.proto.Unk2700OGKIDNPMMKG.internal_static_Unk2700_OGKIDNPMMKG_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.grasscutter.proto.Unk2700OGKIDNPMMKG.internal_static_Unk2700_OGKIDNPMMKG_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.grasscutter.proto.Unk2700OGKIDNPMMKG.Unk2700_OGKIDNPMMKG.class, io.grasscutter.proto.Unk2700OGKIDNPMMKG.Unk2700_OGKIDNPMMKG.Builder.class);
      }

      // Construct using io.grasscutter.proto.Unk2700OGKIDNPMMKG.Unk2700_OGKIDNPMMKG.newBuilder()
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
        unk2700MINEHKAGOGA_ = 0;

        expireTime_ = 0;

        unk2700ONOOJBEABOE_ = 0L;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.grasscutter.proto.Unk2700OGKIDNPMMKG.internal_static_Unk2700_OGKIDNPMMKG_descriptor;
      }

      @java.lang.Override
      public io.grasscutter.proto.Unk2700OGKIDNPMMKG.Unk2700_OGKIDNPMMKG getDefaultInstanceForType() {
        return io.grasscutter.proto.Unk2700OGKIDNPMMKG.Unk2700_OGKIDNPMMKG.getDefaultInstance();
      }

      @java.lang.Override
      public io.grasscutter.proto.Unk2700OGKIDNPMMKG.Unk2700_OGKIDNPMMKG build() {
        io.grasscutter.proto.Unk2700OGKIDNPMMKG.Unk2700_OGKIDNPMMKG result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.grasscutter.proto.Unk2700OGKIDNPMMKG.Unk2700_OGKIDNPMMKG buildPartial() {
        io.grasscutter.proto.Unk2700OGKIDNPMMKG.Unk2700_OGKIDNPMMKG result = new io.grasscutter.proto.Unk2700OGKIDNPMMKG.Unk2700_OGKIDNPMMKG(this);
        result.unk2700MINEHKAGOGA_ = unk2700MINEHKAGOGA_;
        result.expireTime_ = expireTime_;
        result.unk2700ONOOJBEABOE_ = unk2700ONOOJBEABOE_;
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
        if (other instanceof io.grasscutter.proto.Unk2700OGKIDNPMMKG.Unk2700_OGKIDNPMMKG) {
          return mergeFrom((io.grasscutter.proto.Unk2700OGKIDNPMMKG.Unk2700_OGKIDNPMMKG)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.grasscutter.proto.Unk2700OGKIDNPMMKG.Unk2700_OGKIDNPMMKG other) {
        if (other == io.grasscutter.proto.Unk2700OGKIDNPMMKG.Unk2700_OGKIDNPMMKG.getDefaultInstance()) return this;
        if (other.unk2700MINEHKAGOGA_ != 0) {
          setUnk2700MINEHKAGOGAValue(other.getUnk2700MINEHKAGOGAValue());
        }
        if (other.getExpireTime() != 0) {
          setExpireTime(other.getExpireTime());
        }
        if (other.getUnk2700ONOOJBEABOE() != 0L) {
          setUnk2700ONOOJBEABOE(other.getUnk2700ONOOJBEABOE());
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
        io.grasscutter.proto.Unk2700OGKIDNPMMKG.Unk2700_OGKIDNPMMKG parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.grasscutter.proto.Unk2700OGKIDNPMMKG.Unk2700_OGKIDNPMMKG) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int unk2700MINEHKAGOGA_ = 0;
      /**
       * <code>.Unk2700_HGMCNJOPDAA Unk2700_MINEHKAGOGA = 11;</code>
       * @return The enum numeric value on the wire for unk2700MINEHKAGOGA.
       */
      @java.lang.Override public int getUnk2700MINEHKAGOGAValue() {
        return unk2700MINEHKAGOGA_;
      }
      /**
       * <code>.Unk2700_HGMCNJOPDAA Unk2700_MINEHKAGOGA = 11;</code>
       * @param value The enum numeric value on the wire for unk2700MINEHKAGOGA to set.
       * @return This builder for chaining.
       */
      public Builder setUnk2700MINEHKAGOGAValue(int value) {
        
        unk2700MINEHKAGOGA_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.Unk2700_HGMCNJOPDAA Unk2700_MINEHKAGOGA = 11;</code>
       * @return The unk2700MINEHKAGOGA.
       */
      @java.lang.Override
      public io.grasscutter.proto.Unk2700HGMCNJOPDAA.Unk2700_HGMCNJOPDAA getUnk2700MINEHKAGOGA() {
        @SuppressWarnings("deprecation")
        io.grasscutter.proto.Unk2700HGMCNJOPDAA.Unk2700_HGMCNJOPDAA result = io.grasscutter.proto.Unk2700HGMCNJOPDAA.Unk2700_HGMCNJOPDAA.valueOf(unk2700MINEHKAGOGA_);
        return result == null ? io.grasscutter.proto.Unk2700HGMCNJOPDAA.Unk2700_HGMCNJOPDAA.UNRECOGNIZED : result;
      }
      /**
       * <code>.Unk2700_HGMCNJOPDAA Unk2700_MINEHKAGOGA = 11;</code>
       * @param value The unk2700MINEHKAGOGA to set.
       * @return This builder for chaining.
       */
      public Builder setUnk2700MINEHKAGOGA(io.grasscutter.proto.Unk2700HGMCNJOPDAA.Unk2700_HGMCNJOPDAA value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        unk2700MINEHKAGOGA_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.Unk2700_HGMCNJOPDAA Unk2700_MINEHKAGOGA = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk2700MINEHKAGOGA() {
        
        unk2700MINEHKAGOGA_ = 0;
        onChanged();
        return this;
      }

      private int expireTime_ ;
      /**
       * <code>uint32 expire_time = 6;</code>
       * @return The expireTime.
       */
      @java.lang.Override
      public int getExpireTime() {
        return expireTime_;
      }
      /**
       * <code>uint32 expire_time = 6;</code>
       * @param value The expireTime to set.
       * @return This builder for chaining.
       */
      public Builder setExpireTime(int value) {
        
        expireTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 expire_time = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearExpireTime() {
        
        expireTime_ = 0;
        onChanged();
        return this;
      }

      private long unk2700ONOOJBEABOE_ ;
      /**
       * <code>uint64 Unk2700_ONOOJBEABOE = 5;</code>
       * @return The unk2700ONOOJBEABOE.
       */
      @java.lang.Override
      public long getUnk2700ONOOJBEABOE() {
        return unk2700ONOOJBEABOE_;
      }
      /**
       * <code>uint64 Unk2700_ONOOJBEABOE = 5;</code>
       * @param value The unk2700ONOOJBEABOE to set.
       * @return This builder for chaining.
       */
      public Builder setUnk2700ONOOJBEABOE(long value) {
        
        unk2700ONOOJBEABOE_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 Unk2700_ONOOJBEABOE = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk2700ONOOJBEABOE() {
        
        unk2700ONOOJBEABOE_ = 0L;
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


      // @@protoc_insertion_point(builder_scope:Unk2700_OGKIDNPMMKG)
    }

    // @@protoc_insertion_point(class_scope:Unk2700_OGKIDNPMMKG)
    private static final io.grasscutter.proto.Unk2700OGKIDNPMMKG.Unk2700_OGKIDNPMMKG DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.grasscutter.proto.Unk2700OGKIDNPMMKG.Unk2700_OGKIDNPMMKG();
    }

    public static io.grasscutter.proto.Unk2700OGKIDNPMMKG.Unk2700_OGKIDNPMMKG getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Unk2700_OGKIDNPMMKG>
        PARSER = new com.google.protobuf.AbstractParser<Unk2700_OGKIDNPMMKG>() {
      @java.lang.Override
      public Unk2700_OGKIDNPMMKG parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Unk2700_OGKIDNPMMKG(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Unk2700_OGKIDNPMMKG> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Unk2700_OGKIDNPMMKG> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.grasscutter.proto.Unk2700OGKIDNPMMKG.Unk2700_OGKIDNPMMKG getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk2700_OGKIDNPMMKG_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk2700_OGKIDNPMMKG_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031Unk2700_OGKIDNPMMKG.proto\032\031Unk2700_HGM" +
      "CNJOPDAA.proto\"z\n\023Unk2700_OGKIDNPMMKG\0221\n" +
      "\023Unk2700_MINEHKAGOGA\030\013 \001(\0162\024.Unk2700_HGM" +
      "CNJOPDAA\022\023\n\013expire_time\030\006 \001(\r\022\033\n\023Unk2700" +
      "_ONOOJBEABOE\030\005 \001(\004B\026\n\024io.grasscutter.pro" +
      "tob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.grasscutter.proto.Unk2700HGMCNJOPDAA.getDescriptor(),
        });
    internal_static_Unk2700_OGKIDNPMMKG_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Unk2700_OGKIDNPMMKG_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk2700_OGKIDNPMMKG_descriptor,
        new java.lang.String[] { "Unk2700MINEHKAGOGA", "ExpireTime", "Unk2700ONOOJBEABOE", });
    io.grasscutter.proto.Unk2700HGMCNJOPDAA.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
