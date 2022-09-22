// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FleurFairBuffEnergyNotify.proto

package io.grasscutter.proto;

public final class FleurFairBuffEnergyNotifyOuterClass {
  private FleurFairBuffEnergyNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface FleurFairBuffEnergyNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:FleurFairBuffEnergyNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 energy = 4;</code>
     * @return The energy.
     */
    int getEnergy();
  }
  /**
   * <pre>
   * CmdId: 5324
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code FleurFairBuffEnergyNotify}
   */
  public static final class FleurFairBuffEnergyNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:FleurFairBuffEnergyNotify)
      FleurFairBuffEnergyNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use FleurFairBuffEnergyNotify.newBuilder() to construct.
    private FleurFairBuffEnergyNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private FleurFairBuffEnergyNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new FleurFairBuffEnergyNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private FleurFairBuffEnergyNotify(
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

              energy_ = input.readUInt32();
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
      return io.grasscutter.proto.FleurFairBuffEnergyNotifyOuterClass.internal_static_FleurFairBuffEnergyNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.proto.FleurFairBuffEnergyNotifyOuterClass.internal_static_FleurFairBuffEnergyNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.proto.FleurFairBuffEnergyNotifyOuterClass.FleurFairBuffEnergyNotify.class, io.grasscutter.proto.FleurFairBuffEnergyNotifyOuterClass.FleurFairBuffEnergyNotify.Builder.class);
    }

    public static final int ENERGY_FIELD_NUMBER = 4;
    private int energy_;
    /**
     * <code>uint32 energy = 4;</code>
     * @return The energy.
     */
    @java.lang.Override
    public int getEnergy() {
      return energy_;
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
      if (energy_ != 0) {
        output.writeUInt32(4, energy_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (energy_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, energy_);
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
      if (!(obj instanceof io.grasscutter.proto.FleurFairBuffEnergyNotifyOuterClass.FleurFairBuffEnergyNotify)) {
        return super.equals(obj);
      }
      io.grasscutter.proto.FleurFairBuffEnergyNotifyOuterClass.FleurFairBuffEnergyNotify other = (io.grasscutter.proto.FleurFairBuffEnergyNotifyOuterClass.FleurFairBuffEnergyNotify) obj;

      if (getEnergy()
          != other.getEnergy()) return false;
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
      hash = (37 * hash) + ENERGY_FIELD_NUMBER;
      hash = (53 * hash) + getEnergy();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.grasscutter.proto.FleurFairBuffEnergyNotifyOuterClass.FleurFairBuffEnergyNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.FleurFairBuffEnergyNotifyOuterClass.FleurFairBuffEnergyNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.FleurFairBuffEnergyNotifyOuterClass.FleurFairBuffEnergyNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.FleurFairBuffEnergyNotifyOuterClass.FleurFairBuffEnergyNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.FleurFairBuffEnergyNotifyOuterClass.FleurFairBuffEnergyNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.FleurFairBuffEnergyNotifyOuterClass.FleurFairBuffEnergyNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.FleurFairBuffEnergyNotifyOuterClass.FleurFairBuffEnergyNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.FleurFairBuffEnergyNotifyOuterClass.FleurFairBuffEnergyNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.FleurFairBuffEnergyNotifyOuterClass.FleurFairBuffEnergyNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.FleurFairBuffEnergyNotifyOuterClass.FleurFairBuffEnergyNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.FleurFairBuffEnergyNotifyOuterClass.FleurFairBuffEnergyNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.FleurFairBuffEnergyNotifyOuterClass.FleurFairBuffEnergyNotify parseFrom(
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
    public static Builder newBuilder(io.grasscutter.proto.FleurFairBuffEnergyNotifyOuterClass.FleurFairBuffEnergyNotify prototype) {
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
     * CmdId: 5324
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code FleurFairBuffEnergyNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:FleurFairBuffEnergyNotify)
        io.grasscutter.proto.FleurFairBuffEnergyNotifyOuterClass.FleurFairBuffEnergyNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.grasscutter.proto.FleurFairBuffEnergyNotifyOuterClass.internal_static_FleurFairBuffEnergyNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.grasscutter.proto.FleurFairBuffEnergyNotifyOuterClass.internal_static_FleurFairBuffEnergyNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.grasscutter.proto.FleurFairBuffEnergyNotifyOuterClass.FleurFairBuffEnergyNotify.class, io.grasscutter.proto.FleurFairBuffEnergyNotifyOuterClass.FleurFairBuffEnergyNotify.Builder.class);
      }

      // Construct using io.grasscutter.proto.FleurFairBuffEnergyNotifyOuterClass.FleurFairBuffEnergyNotify.newBuilder()
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
        energy_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.grasscutter.proto.FleurFairBuffEnergyNotifyOuterClass.internal_static_FleurFairBuffEnergyNotify_descriptor;
      }

      @java.lang.Override
      public io.grasscutter.proto.FleurFairBuffEnergyNotifyOuterClass.FleurFairBuffEnergyNotify getDefaultInstanceForType() {
        return io.grasscutter.proto.FleurFairBuffEnergyNotifyOuterClass.FleurFairBuffEnergyNotify.getDefaultInstance();
      }

      @java.lang.Override
      public io.grasscutter.proto.FleurFairBuffEnergyNotifyOuterClass.FleurFairBuffEnergyNotify build() {
        io.grasscutter.proto.FleurFairBuffEnergyNotifyOuterClass.FleurFairBuffEnergyNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.grasscutter.proto.FleurFairBuffEnergyNotifyOuterClass.FleurFairBuffEnergyNotify buildPartial() {
        io.grasscutter.proto.FleurFairBuffEnergyNotifyOuterClass.FleurFairBuffEnergyNotify result = new io.grasscutter.proto.FleurFairBuffEnergyNotifyOuterClass.FleurFairBuffEnergyNotify(this);
        result.energy_ = energy_;
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
        if (other instanceof io.grasscutter.proto.FleurFairBuffEnergyNotifyOuterClass.FleurFairBuffEnergyNotify) {
          return mergeFrom((io.grasscutter.proto.FleurFairBuffEnergyNotifyOuterClass.FleurFairBuffEnergyNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.grasscutter.proto.FleurFairBuffEnergyNotifyOuterClass.FleurFairBuffEnergyNotify other) {
        if (other == io.grasscutter.proto.FleurFairBuffEnergyNotifyOuterClass.FleurFairBuffEnergyNotify.getDefaultInstance()) return this;
        if (other.getEnergy() != 0) {
          setEnergy(other.getEnergy());
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
        io.grasscutter.proto.FleurFairBuffEnergyNotifyOuterClass.FleurFairBuffEnergyNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.grasscutter.proto.FleurFairBuffEnergyNotifyOuterClass.FleurFairBuffEnergyNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int energy_ ;
      /**
       * <code>uint32 energy = 4;</code>
       * @return The energy.
       */
      @java.lang.Override
      public int getEnergy() {
        return energy_;
      }
      /**
       * <code>uint32 energy = 4;</code>
       * @param value The energy to set.
       * @return This builder for chaining.
       */
      public Builder setEnergy(int value) {
        
        energy_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 energy = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearEnergy() {
        
        energy_ = 0;
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


      // @@protoc_insertion_point(builder_scope:FleurFairBuffEnergyNotify)
    }

    // @@protoc_insertion_point(class_scope:FleurFairBuffEnergyNotify)
    private static final io.grasscutter.proto.FleurFairBuffEnergyNotifyOuterClass.FleurFairBuffEnergyNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.grasscutter.proto.FleurFairBuffEnergyNotifyOuterClass.FleurFairBuffEnergyNotify();
    }

    public static io.grasscutter.proto.FleurFairBuffEnergyNotifyOuterClass.FleurFairBuffEnergyNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<FleurFairBuffEnergyNotify>
        PARSER = new com.google.protobuf.AbstractParser<FleurFairBuffEnergyNotify>() {
      @java.lang.Override
      public FleurFairBuffEnergyNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new FleurFairBuffEnergyNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<FleurFairBuffEnergyNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<FleurFairBuffEnergyNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.grasscutter.proto.FleurFairBuffEnergyNotifyOuterClass.FleurFairBuffEnergyNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_FleurFairBuffEnergyNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_FleurFairBuffEnergyNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037FleurFairBuffEnergyNotify.proto\"+\n\031Fle" +
      "urFairBuffEnergyNotify\022\016\n\006energy\030\004 \001(\rB\026" +
      "\n\024io.grasscutter.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_FleurFairBuffEnergyNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_FleurFairBuffEnergyNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_FleurFairBuffEnergyNotify_descriptor,
        new java.lang.String[] { "Energy", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
