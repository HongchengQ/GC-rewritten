// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk2700_KJODHFMHMNC.proto

package io.grasscutter.proto;

public final class Unk2700KJODHFMHMNC {
  private Unk2700KJODHFMHMNC() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Unk2700_KJODHFMHMNCOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Unk2700_KJODHFMHMNC)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 id = 1;</code>
     * @return The id.
     */
    int getId();

    /**
     * <code>bool Unk2700_MMNILGLDHHD = 14;</code>
     * @return The unk2700MMNILGLDHHD.
     */
    boolean getUnk2700MMNILGLDHHD();
  }
  /**
   * Protobuf type {@code Unk2700_KJODHFMHMNC}
   */
  public static final class Unk2700_KJODHFMHMNC extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Unk2700_KJODHFMHMNC)
      Unk2700_KJODHFMHMNCOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Unk2700_KJODHFMHMNC.newBuilder() to construct.
    private Unk2700_KJODHFMHMNC(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Unk2700_KJODHFMHMNC() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Unk2700_KJODHFMHMNC();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Unk2700_KJODHFMHMNC(
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

              id_ = input.readUInt32();
              break;
            }
            case 112: {

              unk2700MMNILGLDHHD_ = input.readBool();
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
      return io.grasscutter.proto.Unk2700KJODHFMHMNC.internal_static_Unk2700_KJODHFMHMNC_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.proto.Unk2700KJODHFMHMNC.internal_static_Unk2700_KJODHFMHMNC_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.proto.Unk2700KJODHFMHMNC.Unk2700_KJODHFMHMNC.class, io.grasscutter.proto.Unk2700KJODHFMHMNC.Unk2700_KJODHFMHMNC.Builder.class);
    }

    public static final int ID_FIELD_NUMBER = 1;
    private int id_;
    /**
     * <code>uint32 id = 1;</code>
     * @return The id.
     */
    @java.lang.Override
    public int getId() {
      return id_;
    }

    public static final int UNK2700_MMNILGLDHHD_FIELD_NUMBER = 14;
    private boolean unk2700MMNILGLDHHD_;
    /**
     * <code>bool Unk2700_MMNILGLDHHD = 14;</code>
     * @return The unk2700MMNILGLDHHD.
     */
    @java.lang.Override
    public boolean getUnk2700MMNILGLDHHD() {
      return unk2700MMNILGLDHHD_;
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
      if (id_ != 0) {
        output.writeUInt32(1, id_);
      }
      if (unk2700MMNILGLDHHD_ != false) {
        output.writeBool(14, unk2700MMNILGLDHHD_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (id_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, id_);
      }
      if (unk2700MMNILGLDHHD_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(14, unk2700MMNILGLDHHD_);
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
      if (!(obj instanceof io.grasscutter.proto.Unk2700KJODHFMHMNC.Unk2700_KJODHFMHMNC)) {
        return super.equals(obj);
      }
      io.grasscutter.proto.Unk2700KJODHFMHMNC.Unk2700_KJODHFMHMNC other = (io.grasscutter.proto.Unk2700KJODHFMHMNC.Unk2700_KJODHFMHMNC) obj;

      if (getId()
          != other.getId()) return false;
      if (getUnk2700MMNILGLDHHD()
          != other.getUnk2700MMNILGLDHHD()) return false;
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
      hash = (37 * hash) + ID_FIELD_NUMBER;
      hash = (53 * hash) + getId();
      hash = (37 * hash) + UNK2700_MMNILGLDHHD_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getUnk2700MMNILGLDHHD());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.grasscutter.proto.Unk2700KJODHFMHMNC.Unk2700_KJODHFMHMNC parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.Unk2700KJODHFMHMNC.Unk2700_KJODHFMHMNC parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.Unk2700KJODHFMHMNC.Unk2700_KJODHFMHMNC parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.Unk2700KJODHFMHMNC.Unk2700_KJODHFMHMNC parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.Unk2700KJODHFMHMNC.Unk2700_KJODHFMHMNC parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.Unk2700KJODHFMHMNC.Unk2700_KJODHFMHMNC parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.Unk2700KJODHFMHMNC.Unk2700_KJODHFMHMNC parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.Unk2700KJODHFMHMNC.Unk2700_KJODHFMHMNC parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.Unk2700KJODHFMHMNC.Unk2700_KJODHFMHMNC parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.Unk2700KJODHFMHMNC.Unk2700_KJODHFMHMNC parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.Unk2700KJODHFMHMNC.Unk2700_KJODHFMHMNC parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.Unk2700KJODHFMHMNC.Unk2700_KJODHFMHMNC parseFrom(
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
    public static Builder newBuilder(io.grasscutter.proto.Unk2700KJODHFMHMNC.Unk2700_KJODHFMHMNC prototype) {
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
     * Protobuf type {@code Unk2700_KJODHFMHMNC}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Unk2700_KJODHFMHMNC)
        io.grasscutter.proto.Unk2700KJODHFMHMNC.Unk2700_KJODHFMHMNCOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.grasscutter.proto.Unk2700KJODHFMHMNC.internal_static_Unk2700_KJODHFMHMNC_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.grasscutter.proto.Unk2700KJODHFMHMNC.internal_static_Unk2700_KJODHFMHMNC_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.grasscutter.proto.Unk2700KJODHFMHMNC.Unk2700_KJODHFMHMNC.class, io.grasscutter.proto.Unk2700KJODHFMHMNC.Unk2700_KJODHFMHMNC.Builder.class);
      }

      // Construct using io.grasscutter.proto.Unk2700KJODHFMHMNC.Unk2700_KJODHFMHMNC.newBuilder()
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
        id_ = 0;

        unk2700MMNILGLDHHD_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.grasscutter.proto.Unk2700KJODHFMHMNC.internal_static_Unk2700_KJODHFMHMNC_descriptor;
      }

      @java.lang.Override
      public io.grasscutter.proto.Unk2700KJODHFMHMNC.Unk2700_KJODHFMHMNC getDefaultInstanceForType() {
        return io.grasscutter.proto.Unk2700KJODHFMHMNC.Unk2700_KJODHFMHMNC.getDefaultInstance();
      }

      @java.lang.Override
      public io.grasscutter.proto.Unk2700KJODHFMHMNC.Unk2700_KJODHFMHMNC build() {
        io.grasscutter.proto.Unk2700KJODHFMHMNC.Unk2700_KJODHFMHMNC result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.grasscutter.proto.Unk2700KJODHFMHMNC.Unk2700_KJODHFMHMNC buildPartial() {
        io.grasscutter.proto.Unk2700KJODHFMHMNC.Unk2700_KJODHFMHMNC result = new io.grasscutter.proto.Unk2700KJODHFMHMNC.Unk2700_KJODHFMHMNC(this);
        result.id_ = id_;
        result.unk2700MMNILGLDHHD_ = unk2700MMNILGLDHHD_;
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
        if (other instanceof io.grasscutter.proto.Unk2700KJODHFMHMNC.Unk2700_KJODHFMHMNC) {
          return mergeFrom((io.grasscutter.proto.Unk2700KJODHFMHMNC.Unk2700_KJODHFMHMNC)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.grasscutter.proto.Unk2700KJODHFMHMNC.Unk2700_KJODHFMHMNC other) {
        if (other == io.grasscutter.proto.Unk2700KJODHFMHMNC.Unk2700_KJODHFMHMNC.getDefaultInstance()) return this;
        if (other.getId() != 0) {
          setId(other.getId());
        }
        if (other.getUnk2700MMNILGLDHHD() != false) {
          setUnk2700MMNILGLDHHD(other.getUnk2700MMNILGLDHHD());
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
        io.grasscutter.proto.Unk2700KJODHFMHMNC.Unk2700_KJODHFMHMNC parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.grasscutter.proto.Unk2700KJODHFMHMNC.Unk2700_KJODHFMHMNC) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int id_ ;
      /**
       * <code>uint32 id = 1;</code>
       * @return The id.
       */
      @java.lang.Override
      public int getId() {
        return id_;
      }
      /**
       * <code>uint32 id = 1;</code>
       * @param value The id to set.
       * @return This builder for chaining.
       */
      public Builder setId(int value) {
        
        id_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearId() {
        
        id_ = 0;
        onChanged();
        return this;
      }

      private boolean unk2700MMNILGLDHHD_ ;
      /**
       * <code>bool Unk2700_MMNILGLDHHD = 14;</code>
       * @return The unk2700MMNILGLDHHD.
       */
      @java.lang.Override
      public boolean getUnk2700MMNILGLDHHD() {
        return unk2700MMNILGLDHHD_;
      }
      /**
       * <code>bool Unk2700_MMNILGLDHHD = 14;</code>
       * @param value The unk2700MMNILGLDHHD to set.
       * @return This builder for chaining.
       */
      public Builder setUnk2700MMNILGLDHHD(boolean value) {
        
        unk2700MMNILGLDHHD_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool Unk2700_MMNILGLDHHD = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk2700MMNILGLDHHD() {
        
        unk2700MMNILGLDHHD_ = false;
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


      // @@protoc_insertion_point(builder_scope:Unk2700_KJODHFMHMNC)
    }

    // @@protoc_insertion_point(class_scope:Unk2700_KJODHFMHMNC)
    private static final io.grasscutter.proto.Unk2700KJODHFMHMNC.Unk2700_KJODHFMHMNC DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.grasscutter.proto.Unk2700KJODHFMHMNC.Unk2700_KJODHFMHMNC();
    }

    public static io.grasscutter.proto.Unk2700KJODHFMHMNC.Unk2700_KJODHFMHMNC getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Unk2700_KJODHFMHMNC>
        PARSER = new com.google.protobuf.AbstractParser<Unk2700_KJODHFMHMNC>() {
      @java.lang.Override
      public Unk2700_KJODHFMHMNC parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Unk2700_KJODHFMHMNC(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Unk2700_KJODHFMHMNC> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Unk2700_KJODHFMHMNC> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.grasscutter.proto.Unk2700KJODHFMHMNC.Unk2700_KJODHFMHMNC getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk2700_KJODHFMHMNC_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk2700_KJODHFMHMNC_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031Unk2700_KJODHFMHMNC.proto\">\n\023Unk2700_K" +
      "JODHFMHMNC\022\n\n\002id\030\001 \001(\r\022\033\n\023Unk2700_MMNILG" +
      "LDHHD\030\016 \001(\010B\026\n\024io.grasscutter.protob\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Unk2700_KJODHFMHMNC_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Unk2700_KJODHFMHMNC_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk2700_KJODHFMHMNC_descriptor,
        new java.lang.String[] { "Id", "Unk2700MMNILGLDHHD", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
