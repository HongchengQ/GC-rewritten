// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk2700_EKDHFFHMNCD.proto

package io.grasscutter.proto;

public final class Unk2700EKDHFFHMNCD {
  private Unk2700EKDHFFHMNCD() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Unk2700_EKDHFFHMNCDOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Unk2700_EKDHFFHMNCD)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 index = 2;</code>
     * @return The index.
     */
    int getIndex();

    /**
     * <code>uint64 Unk2700_FALGECBMIHD = 14;</code>
     * @return The unk2700FALGECBMIHD.
     */
    long getUnk2700FALGECBMIHD();

    /**
     * <code>uint32 Unk2700_PBAFCLCIABF = 12;</code>
     * @return The unk2700PBAFCLCIABF.
     */
    int getUnk2700PBAFCLCIABF();
  }
  /**
   * Protobuf type {@code Unk2700_EKDHFFHMNCD}
   */
  public static final class Unk2700_EKDHFFHMNCD extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Unk2700_EKDHFFHMNCD)
      Unk2700_EKDHFFHMNCDOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Unk2700_EKDHFFHMNCD.newBuilder() to construct.
    private Unk2700_EKDHFFHMNCD(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Unk2700_EKDHFFHMNCD() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Unk2700_EKDHFFHMNCD();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Unk2700_EKDHFFHMNCD(
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
            case 16: {

              index_ = input.readUInt32();
              break;
            }
            case 96: {

              unk2700PBAFCLCIABF_ = input.readUInt32();
              break;
            }
            case 112: {

              unk2700FALGECBMIHD_ = input.readUInt64();
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
      return io.grasscutter.proto.Unk2700EKDHFFHMNCD.internal_static_Unk2700_EKDHFFHMNCD_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.proto.Unk2700EKDHFFHMNCD.internal_static_Unk2700_EKDHFFHMNCD_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.proto.Unk2700EKDHFFHMNCD.Unk2700_EKDHFFHMNCD.class, io.grasscutter.proto.Unk2700EKDHFFHMNCD.Unk2700_EKDHFFHMNCD.Builder.class);
    }

    public static final int INDEX_FIELD_NUMBER = 2;
    private int index_;
    /**
     * <code>uint32 index = 2;</code>
     * @return The index.
     */
    @java.lang.Override
    public int getIndex() {
      return index_;
    }

    public static final int UNK2700_FALGECBMIHD_FIELD_NUMBER = 14;
    private long unk2700FALGECBMIHD_;
    /**
     * <code>uint64 Unk2700_FALGECBMIHD = 14;</code>
     * @return The unk2700FALGECBMIHD.
     */
    @java.lang.Override
    public long getUnk2700FALGECBMIHD() {
      return unk2700FALGECBMIHD_;
    }

    public static final int UNK2700_PBAFCLCIABF_FIELD_NUMBER = 12;
    private int unk2700PBAFCLCIABF_;
    /**
     * <code>uint32 Unk2700_PBAFCLCIABF = 12;</code>
     * @return The unk2700PBAFCLCIABF.
     */
    @java.lang.Override
    public int getUnk2700PBAFCLCIABF() {
      return unk2700PBAFCLCIABF_;
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
      if (index_ != 0) {
        output.writeUInt32(2, index_);
      }
      if (unk2700PBAFCLCIABF_ != 0) {
        output.writeUInt32(12, unk2700PBAFCLCIABF_);
      }
      if (unk2700FALGECBMIHD_ != 0L) {
        output.writeUInt64(14, unk2700FALGECBMIHD_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (index_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, index_);
      }
      if (unk2700PBAFCLCIABF_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, unk2700PBAFCLCIABF_);
      }
      if (unk2700FALGECBMIHD_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(14, unk2700FALGECBMIHD_);
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
      if (!(obj instanceof io.grasscutter.proto.Unk2700EKDHFFHMNCD.Unk2700_EKDHFFHMNCD)) {
        return super.equals(obj);
      }
      io.grasscutter.proto.Unk2700EKDHFFHMNCD.Unk2700_EKDHFFHMNCD other = (io.grasscutter.proto.Unk2700EKDHFFHMNCD.Unk2700_EKDHFFHMNCD) obj;

      if (getIndex()
          != other.getIndex()) return false;
      if (getUnk2700FALGECBMIHD()
          != other.getUnk2700FALGECBMIHD()) return false;
      if (getUnk2700PBAFCLCIABF()
          != other.getUnk2700PBAFCLCIABF()) return false;
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
      hash = (37 * hash) + INDEX_FIELD_NUMBER;
      hash = (53 * hash) + getIndex();
      hash = (37 * hash) + UNK2700_FALGECBMIHD_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getUnk2700FALGECBMIHD());
      hash = (37 * hash) + UNK2700_PBAFCLCIABF_FIELD_NUMBER;
      hash = (53 * hash) + getUnk2700PBAFCLCIABF();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.grasscutter.proto.Unk2700EKDHFFHMNCD.Unk2700_EKDHFFHMNCD parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.Unk2700EKDHFFHMNCD.Unk2700_EKDHFFHMNCD parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.Unk2700EKDHFFHMNCD.Unk2700_EKDHFFHMNCD parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.Unk2700EKDHFFHMNCD.Unk2700_EKDHFFHMNCD parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.Unk2700EKDHFFHMNCD.Unk2700_EKDHFFHMNCD parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.Unk2700EKDHFFHMNCD.Unk2700_EKDHFFHMNCD parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.Unk2700EKDHFFHMNCD.Unk2700_EKDHFFHMNCD parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.Unk2700EKDHFFHMNCD.Unk2700_EKDHFFHMNCD parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.Unk2700EKDHFFHMNCD.Unk2700_EKDHFFHMNCD parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.Unk2700EKDHFFHMNCD.Unk2700_EKDHFFHMNCD parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.Unk2700EKDHFFHMNCD.Unk2700_EKDHFFHMNCD parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.Unk2700EKDHFFHMNCD.Unk2700_EKDHFFHMNCD parseFrom(
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
    public static Builder newBuilder(io.grasscutter.proto.Unk2700EKDHFFHMNCD.Unk2700_EKDHFFHMNCD prototype) {
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
     * Protobuf type {@code Unk2700_EKDHFFHMNCD}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Unk2700_EKDHFFHMNCD)
        io.grasscutter.proto.Unk2700EKDHFFHMNCD.Unk2700_EKDHFFHMNCDOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.grasscutter.proto.Unk2700EKDHFFHMNCD.internal_static_Unk2700_EKDHFFHMNCD_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.grasscutter.proto.Unk2700EKDHFFHMNCD.internal_static_Unk2700_EKDHFFHMNCD_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.grasscutter.proto.Unk2700EKDHFFHMNCD.Unk2700_EKDHFFHMNCD.class, io.grasscutter.proto.Unk2700EKDHFFHMNCD.Unk2700_EKDHFFHMNCD.Builder.class);
      }

      // Construct using io.grasscutter.proto.Unk2700EKDHFFHMNCD.Unk2700_EKDHFFHMNCD.newBuilder()
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
        index_ = 0;

        unk2700FALGECBMIHD_ = 0L;

        unk2700PBAFCLCIABF_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.grasscutter.proto.Unk2700EKDHFFHMNCD.internal_static_Unk2700_EKDHFFHMNCD_descriptor;
      }

      @java.lang.Override
      public io.grasscutter.proto.Unk2700EKDHFFHMNCD.Unk2700_EKDHFFHMNCD getDefaultInstanceForType() {
        return io.grasscutter.proto.Unk2700EKDHFFHMNCD.Unk2700_EKDHFFHMNCD.getDefaultInstance();
      }

      @java.lang.Override
      public io.grasscutter.proto.Unk2700EKDHFFHMNCD.Unk2700_EKDHFFHMNCD build() {
        io.grasscutter.proto.Unk2700EKDHFFHMNCD.Unk2700_EKDHFFHMNCD result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.grasscutter.proto.Unk2700EKDHFFHMNCD.Unk2700_EKDHFFHMNCD buildPartial() {
        io.grasscutter.proto.Unk2700EKDHFFHMNCD.Unk2700_EKDHFFHMNCD result = new io.grasscutter.proto.Unk2700EKDHFFHMNCD.Unk2700_EKDHFFHMNCD(this);
        result.index_ = index_;
        result.unk2700FALGECBMIHD_ = unk2700FALGECBMIHD_;
        result.unk2700PBAFCLCIABF_ = unk2700PBAFCLCIABF_;
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
        if (other instanceof io.grasscutter.proto.Unk2700EKDHFFHMNCD.Unk2700_EKDHFFHMNCD) {
          return mergeFrom((io.grasscutter.proto.Unk2700EKDHFFHMNCD.Unk2700_EKDHFFHMNCD)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.grasscutter.proto.Unk2700EKDHFFHMNCD.Unk2700_EKDHFFHMNCD other) {
        if (other == io.grasscutter.proto.Unk2700EKDHFFHMNCD.Unk2700_EKDHFFHMNCD.getDefaultInstance()) return this;
        if (other.getIndex() != 0) {
          setIndex(other.getIndex());
        }
        if (other.getUnk2700FALGECBMIHD() != 0L) {
          setUnk2700FALGECBMIHD(other.getUnk2700FALGECBMIHD());
        }
        if (other.getUnk2700PBAFCLCIABF() != 0) {
          setUnk2700PBAFCLCIABF(other.getUnk2700PBAFCLCIABF());
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
        io.grasscutter.proto.Unk2700EKDHFFHMNCD.Unk2700_EKDHFFHMNCD parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.grasscutter.proto.Unk2700EKDHFFHMNCD.Unk2700_EKDHFFHMNCD) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int index_ ;
      /**
       * <code>uint32 index = 2;</code>
       * @return The index.
       */
      @java.lang.Override
      public int getIndex() {
        return index_;
      }
      /**
       * <code>uint32 index = 2;</code>
       * @param value The index to set.
       * @return This builder for chaining.
       */
      public Builder setIndex(int value) {
        
        index_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 index = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearIndex() {
        
        index_ = 0;
        onChanged();
        return this;
      }

      private long unk2700FALGECBMIHD_ ;
      /**
       * <code>uint64 Unk2700_FALGECBMIHD = 14;</code>
       * @return The unk2700FALGECBMIHD.
       */
      @java.lang.Override
      public long getUnk2700FALGECBMIHD() {
        return unk2700FALGECBMIHD_;
      }
      /**
       * <code>uint64 Unk2700_FALGECBMIHD = 14;</code>
       * @param value The unk2700FALGECBMIHD to set.
       * @return This builder for chaining.
       */
      public Builder setUnk2700FALGECBMIHD(long value) {
        
        unk2700FALGECBMIHD_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 Unk2700_FALGECBMIHD = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk2700FALGECBMIHD() {
        
        unk2700FALGECBMIHD_ = 0L;
        onChanged();
        return this;
      }

      private int unk2700PBAFCLCIABF_ ;
      /**
       * <code>uint32 Unk2700_PBAFCLCIABF = 12;</code>
       * @return The unk2700PBAFCLCIABF.
       */
      @java.lang.Override
      public int getUnk2700PBAFCLCIABF() {
        return unk2700PBAFCLCIABF_;
      }
      /**
       * <code>uint32 Unk2700_PBAFCLCIABF = 12;</code>
       * @param value The unk2700PBAFCLCIABF to set.
       * @return This builder for chaining.
       */
      public Builder setUnk2700PBAFCLCIABF(int value) {
        
        unk2700PBAFCLCIABF_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk2700_PBAFCLCIABF = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk2700PBAFCLCIABF() {
        
        unk2700PBAFCLCIABF_ = 0;
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


      // @@protoc_insertion_point(builder_scope:Unk2700_EKDHFFHMNCD)
    }

    // @@protoc_insertion_point(class_scope:Unk2700_EKDHFFHMNCD)
    private static final io.grasscutter.proto.Unk2700EKDHFFHMNCD.Unk2700_EKDHFFHMNCD DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.grasscutter.proto.Unk2700EKDHFFHMNCD.Unk2700_EKDHFFHMNCD();
    }

    public static io.grasscutter.proto.Unk2700EKDHFFHMNCD.Unk2700_EKDHFFHMNCD getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Unk2700_EKDHFFHMNCD>
        PARSER = new com.google.protobuf.AbstractParser<Unk2700_EKDHFFHMNCD>() {
      @java.lang.Override
      public Unk2700_EKDHFFHMNCD parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Unk2700_EKDHFFHMNCD(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Unk2700_EKDHFFHMNCD> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Unk2700_EKDHFFHMNCD> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.grasscutter.proto.Unk2700EKDHFFHMNCD.Unk2700_EKDHFFHMNCD getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk2700_EKDHFFHMNCD_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk2700_EKDHFFHMNCD_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031Unk2700_EKDHFFHMNCD.proto\"^\n\023Unk2700_E" +
      "KDHFFHMNCD\022\r\n\005index\030\002 \001(\r\022\033\n\023Unk2700_FAL" +
      "GECBMIHD\030\016 \001(\004\022\033\n\023Unk2700_PBAFCLCIABF\030\014 " +
      "\001(\rB\026\n\024io.grasscutter.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Unk2700_EKDHFFHMNCD_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Unk2700_EKDHFFHMNCD_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk2700_EKDHFFHMNCD_descriptor,
        new java.lang.String[] { "Index", "Unk2700FALGECBMIHD", "Unk2700PBAFCLCIABF", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
