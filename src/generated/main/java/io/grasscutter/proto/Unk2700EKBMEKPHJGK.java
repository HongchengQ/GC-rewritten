// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk2700_EKBMEKPHJGK.proto

package io.grasscutter.proto;

public final class Unk2700EKBMEKPHJGK {
  private Unk2700EKBMEKPHJGK() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Unk2700_EKBMEKPHJGKOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Unk2700_EKBMEKPHJGK)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 config_id = 9;</code>
     * @return The configId.
     */
    int getConfigId();

    /**
     * <code>uint32 group_id = 11;</code>
     * @return The groupId.
     */
    int getGroupId();
  }
  /**
   * <pre>
   * CmdId: 8726
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code Unk2700_EKBMEKPHJGK}
   */
  public static final class Unk2700_EKBMEKPHJGK extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Unk2700_EKBMEKPHJGK)
      Unk2700_EKBMEKPHJGKOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Unk2700_EKBMEKPHJGK.newBuilder() to construct.
    private Unk2700_EKBMEKPHJGK(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Unk2700_EKBMEKPHJGK() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Unk2700_EKBMEKPHJGK();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Unk2700_EKBMEKPHJGK(
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
            case 72: {

              configId_ = input.readUInt32();
              break;
            }
            case 88: {

              groupId_ = input.readUInt32();
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
      return io.grasscutter.proto.Unk2700EKBMEKPHJGK.internal_static_Unk2700_EKBMEKPHJGK_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.proto.Unk2700EKBMEKPHJGK.internal_static_Unk2700_EKBMEKPHJGK_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.proto.Unk2700EKBMEKPHJGK.Unk2700_EKBMEKPHJGK.class, io.grasscutter.proto.Unk2700EKBMEKPHJGK.Unk2700_EKBMEKPHJGK.Builder.class);
    }

    public static final int CONFIG_ID_FIELD_NUMBER = 9;
    private int configId_;
    /**
     * <code>uint32 config_id = 9;</code>
     * @return The configId.
     */
    @java.lang.Override
    public int getConfigId() {
      return configId_;
    }

    public static final int GROUP_ID_FIELD_NUMBER = 11;
    private int groupId_;
    /**
     * <code>uint32 group_id = 11;</code>
     * @return The groupId.
     */
    @java.lang.Override
    public int getGroupId() {
      return groupId_;
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
      if (configId_ != 0) {
        output.writeUInt32(9, configId_);
      }
      if (groupId_ != 0) {
        output.writeUInt32(11, groupId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (configId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, configId_);
      }
      if (groupId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, groupId_);
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
      if (!(obj instanceof io.grasscutter.proto.Unk2700EKBMEKPHJGK.Unk2700_EKBMEKPHJGK)) {
        return super.equals(obj);
      }
      io.grasscutter.proto.Unk2700EKBMEKPHJGK.Unk2700_EKBMEKPHJGK other = (io.grasscutter.proto.Unk2700EKBMEKPHJGK.Unk2700_EKBMEKPHJGK) obj;

      if (getConfigId()
          != other.getConfigId()) return false;
      if (getGroupId()
          != other.getGroupId()) return false;
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
      hash = (37 * hash) + CONFIG_ID_FIELD_NUMBER;
      hash = (53 * hash) + getConfigId();
      hash = (37 * hash) + GROUP_ID_FIELD_NUMBER;
      hash = (53 * hash) + getGroupId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.grasscutter.proto.Unk2700EKBMEKPHJGK.Unk2700_EKBMEKPHJGK parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.Unk2700EKBMEKPHJGK.Unk2700_EKBMEKPHJGK parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.Unk2700EKBMEKPHJGK.Unk2700_EKBMEKPHJGK parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.Unk2700EKBMEKPHJGK.Unk2700_EKBMEKPHJGK parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.Unk2700EKBMEKPHJGK.Unk2700_EKBMEKPHJGK parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.Unk2700EKBMEKPHJGK.Unk2700_EKBMEKPHJGK parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.Unk2700EKBMEKPHJGK.Unk2700_EKBMEKPHJGK parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.Unk2700EKBMEKPHJGK.Unk2700_EKBMEKPHJGK parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.Unk2700EKBMEKPHJGK.Unk2700_EKBMEKPHJGK parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.Unk2700EKBMEKPHJGK.Unk2700_EKBMEKPHJGK parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.Unk2700EKBMEKPHJGK.Unk2700_EKBMEKPHJGK parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.Unk2700EKBMEKPHJGK.Unk2700_EKBMEKPHJGK parseFrom(
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
    public static Builder newBuilder(io.grasscutter.proto.Unk2700EKBMEKPHJGK.Unk2700_EKBMEKPHJGK prototype) {
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
     * CmdId: 8726
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code Unk2700_EKBMEKPHJGK}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Unk2700_EKBMEKPHJGK)
        io.grasscutter.proto.Unk2700EKBMEKPHJGK.Unk2700_EKBMEKPHJGKOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.grasscutter.proto.Unk2700EKBMEKPHJGK.internal_static_Unk2700_EKBMEKPHJGK_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.grasscutter.proto.Unk2700EKBMEKPHJGK.internal_static_Unk2700_EKBMEKPHJGK_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.grasscutter.proto.Unk2700EKBMEKPHJGK.Unk2700_EKBMEKPHJGK.class, io.grasscutter.proto.Unk2700EKBMEKPHJGK.Unk2700_EKBMEKPHJGK.Builder.class);
      }

      // Construct using io.grasscutter.proto.Unk2700EKBMEKPHJGK.Unk2700_EKBMEKPHJGK.newBuilder()
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
        configId_ = 0;

        groupId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.grasscutter.proto.Unk2700EKBMEKPHJGK.internal_static_Unk2700_EKBMEKPHJGK_descriptor;
      }

      @java.lang.Override
      public io.grasscutter.proto.Unk2700EKBMEKPHJGK.Unk2700_EKBMEKPHJGK getDefaultInstanceForType() {
        return io.grasscutter.proto.Unk2700EKBMEKPHJGK.Unk2700_EKBMEKPHJGK.getDefaultInstance();
      }

      @java.lang.Override
      public io.grasscutter.proto.Unk2700EKBMEKPHJGK.Unk2700_EKBMEKPHJGK build() {
        io.grasscutter.proto.Unk2700EKBMEKPHJGK.Unk2700_EKBMEKPHJGK result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.grasscutter.proto.Unk2700EKBMEKPHJGK.Unk2700_EKBMEKPHJGK buildPartial() {
        io.grasscutter.proto.Unk2700EKBMEKPHJGK.Unk2700_EKBMEKPHJGK result = new io.grasscutter.proto.Unk2700EKBMEKPHJGK.Unk2700_EKBMEKPHJGK(this);
        result.configId_ = configId_;
        result.groupId_ = groupId_;
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
        if (other instanceof io.grasscutter.proto.Unk2700EKBMEKPHJGK.Unk2700_EKBMEKPHJGK) {
          return mergeFrom((io.grasscutter.proto.Unk2700EKBMEKPHJGK.Unk2700_EKBMEKPHJGK)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.grasscutter.proto.Unk2700EKBMEKPHJGK.Unk2700_EKBMEKPHJGK other) {
        if (other == io.grasscutter.proto.Unk2700EKBMEKPHJGK.Unk2700_EKBMEKPHJGK.getDefaultInstance()) return this;
        if (other.getConfigId() != 0) {
          setConfigId(other.getConfigId());
        }
        if (other.getGroupId() != 0) {
          setGroupId(other.getGroupId());
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
        io.grasscutter.proto.Unk2700EKBMEKPHJGK.Unk2700_EKBMEKPHJGK parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.grasscutter.proto.Unk2700EKBMEKPHJGK.Unk2700_EKBMEKPHJGK) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int configId_ ;
      /**
       * <code>uint32 config_id = 9;</code>
       * @return The configId.
       */
      @java.lang.Override
      public int getConfigId() {
        return configId_;
      }
      /**
       * <code>uint32 config_id = 9;</code>
       * @param value The configId to set.
       * @return This builder for chaining.
       */
      public Builder setConfigId(int value) {
        
        configId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 config_id = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearConfigId() {
        
        configId_ = 0;
        onChanged();
        return this;
      }

      private int groupId_ ;
      /**
       * <code>uint32 group_id = 11;</code>
       * @return The groupId.
       */
      @java.lang.Override
      public int getGroupId() {
        return groupId_;
      }
      /**
       * <code>uint32 group_id = 11;</code>
       * @param value The groupId to set.
       * @return This builder for chaining.
       */
      public Builder setGroupId(int value) {
        
        groupId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 group_id = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearGroupId() {
        
        groupId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:Unk2700_EKBMEKPHJGK)
    }

    // @@protoc_insertion_point(class_scope:Unk2700_EKBMEKPHJGK)
    private static final io.grasscutter.proto.Unk2700EKBMEKPHJGK.Unk2700_EKBMEKPHJGK DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.grasscutter.proto.Unk2700EKBMEKPHJGK.Unk2700_EKBMEKPHJGK();
    }

    public static io.grasscutter.proto.Unk2700EKBMEKPHJGK.Unk2700_EKBMEKPHJGK getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Unk2700_EKBMEKPHJGK>
        PARSER = new com.google.protobuf.AbstractParser<Unk2700_EKBMEKPHJGK>() {
      @java.lang.Override
      public Unk2700_EKBMEKPHJGK parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Unk2700_EKBMEKPHJGK(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Unk2700_EKBMEKPHJGK> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Unk2700_EKBMEKPHJGK> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.grasscutter.proto.Unk2700EKBMEKPHJGK.Unk2700_EKBMEKPHJGK getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk2700_EKBMEKPHJGK_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk2700_EKBMEKPHJGK_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031Unk2700_EKBMEKPHJGK.proto\":\n\023Unk2700_E" +
      "KBMEKPHJGK\022\021\n\tconfig_id\030\t \001(\r\022\020\n\010group_i" +
      "d\030\013 \001(\rB\026\n\024io.grasscutter.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Unk2700_EKBMEKPHJGK_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Unk2700_EKBMEKPHJGK_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk2700_EKBMEKPHJGK_descriptor,
        new java.lang.String[] { "ConfigId", "GroupId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
