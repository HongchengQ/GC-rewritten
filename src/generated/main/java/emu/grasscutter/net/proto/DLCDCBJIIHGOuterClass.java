// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DLCDCBJIIHG.proto

package emu.grasscutter.net.proto;

public final class DLCDCBJIIHGOuterClass {
  private DLCDCBJIIHGOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface DLCDCBJIIHGOrBuilder extends
      // @@protoc_insertion_point(interface_extends:DLCDCBJIIHG)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 GKNCBIEJEPP = 7;</code>
     * @return The gKNCBIEJEPP.
     */
    int getGKNCBIEJEPP();

    /**
     * <code>uint32 group_id = 8;</code>
     * @return The groupId.
     */
    int getGroupId();
  }
  /**
   * <pre>
   * CmdId: 7498
   * </pre>
   *
   * Protobuf type {@code DLCDCBJIIHG}
   */
  public static final class DLCDCBJIIHG extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:DLCDCBJIIHG)
      DLCDCBJIIHGOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use DLCDCBJIIHG.newBuilder() to construct.
    private DLCDCBJIIHG(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private DLCDCBJIIHG() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new DLCDCBJIIHG();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private DLCDCBJIIHG(
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
            case 56: {

              gKNCBIEJEPP_ = input.readUInt32();
              break;
            }
            case 64: {

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
      return emu.grasscutter.net.proto.DLCDCBJIIHGOuterClass.internal_static_DLCDCBJIIHG_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.DLCDCBJIIHGOuterClass.internal_static_DLCDCBJIIHG_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.DLCDCBJIIHGOuterClass.DLCDCBJIIHG.class, emu.grasscutter.net.proto.DLCDCBJIIHGOuterClass.DLCDCBJIIHG.Builder.class);
    }

    public static final int GKNCBIEJEPP_FIELD_NUMBER = 7;
    private int gKNCBIEJEPP_;
    /**
     * <code>uint32 GKNCBIEJEPP = 7;</code>
     * @return The gKNCBIEJEPP.
     */
    @java.lang.Override
    public int getGKNCBIEJEPP() {
      return gKNCBIEJEPP_;
    }

    public static final int GROUP_ID_FIELD_NUMBER = 8;
    private int groupId_;
    /**
     * <code>uint32 group_id = 8;</code>
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
      if (gKNCBIEJEPP_ != 0) {
        output.writeUInt32(7, gKNCBIEJEPP_);
      }
      if (groupId_ != 0) {
        output.writeUInt32(8, groupId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (gKNCBIEJEPP_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, gKNCBIEJEPP_);
      }
      if (groupId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, groupId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.DLCDCBJIIHGOuterClass.DLCDCBJIIHG)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.DLCDCBJIIHGOuterClass.DLCDCBJIIHG other = (emu.grasscutter.net.proto.DLCDCBJIIHGOuterClass.DLCDCBJIIHG) obj;

      if (getGKNCBIEJEPP()
          != other.getGKNCBIEJEPP()) return false;
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
      hash = (37 * hash) + GKNCBIEJEPP_FIELD_NUMBER;
      hash = (53 * hash) + getGKNCBIEJEPP();
      hash = (37 * hash) + GROUP_ID_FIELD_NUMBER;
      hash = (53 * hash) + getGroupId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.DLCDCBJIIHGOuterClass.DLCDCBJIIHG parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DLCDCBJIIHGOuterClass.DLCDCBJIIHG parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DLCDCBJIIHGOuterClass.DLCDCBJIIHG parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DLCDCBJIIHGOuterClass.DLCDCBJIIHG parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DLCDCBJIIHGOuterClass.DLCDCBJIIHG parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DLCDCBJIIHGOuterClass.DLCDCBJIIHG parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DLCDCBJIIHGOuterClass.DLCDCBJIIHG parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DLCDCBJIIHGOuterClass.DLCDCBJIIHG parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DLCDCBJIIHGOuterClass.DLCDCBJIIHG parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DLCDCBJIIHGOuterClass.DLCDCBJIIHG parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DLCDCBJIIHGOuterClass.DLCDCBJIIHG parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DLCDCBJIIHGOuterClass.DLCDCBJIIHG parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.DLCDCBJIIHGOuterClass.DLCDCBJIIHG prototype) {
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
     * CmdId: 7498
     * </pre>
     *
     * Protobuf type {@code DLCDCBJIIHG}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:DLCDCBJIIHG)
        emu.grasscutter.net.proto.DLCDCBJIIHGOuterClass.DLCDCBJIIHGOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.DLCDCBJIIHGOuterClass.internal_static_DLCDCBJIIHG_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.DLCDCBJIIHGOuterClass.internal_static_DLCDCBJIIHG_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.DLCDCBJIIHGOuterClass.DLCDCBJIIHG.class, emu.grasscutter.net.proto.DLCDCBJIIHGOuterClass.DLCDCBJIIHG.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.DLCDCBJIIHGOuterClass.DLCDCBJIIHG.newBuilder()
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
        gKNCBIEJEPP_ = 0;

        groupId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.DLCDCBJIIHGOuterClass.internal_static_DLCDCBJIIHG_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DLCDCBJIIHGOuterClass.DLCDCBJIIHG getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.DLCDCBJIIHGOuterClass.DLCDCBJIIHG.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DLCDCBJIIHGOuterClass.DLCDCBJIIHG build() {
        emu.grasscutter.net.proto.DLCDCBJIIHGOuterClass.DLCDCBJIIHG result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DLCDCBJIIHGOuterClass.DLCDCBJIIHG buildPartial() {
        emu.grasscutter.net.proto.DLCDCBJIIHGOuterClass.DLCDCBJIIHG result = new emu.grasscutter.net.proto.DLCDCBJIIHGOuterClass.DLCDCBJIIHG(this);
        result.gKNCBIEJEPP_ = gKNCBIEJEPP_;
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
        if (other instanceof emu.grasscutter.net.proto.DLCDCBJIIHGOuterClass.DLCDCBJIIHG) {
          return mergeFrom((emu.grasscutter.net.proto.DLCDCBJIIHGOuterClass.DLCDCBJIIHG)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.DLCDCBJIIHGOuterClass.DLCDCBJIIHG other) {
        if (other == emu.grasscutter.net.proto.DLCDCBJIIHGOuterClass.DLCDCBJIIHG.getDefaultInstance()) return this;
        if (other.getGKNCBIEJEPP() != 0) {
          setGKNCBIEJEPP(other.getGKNCBIEJEPP());
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
        emu.grasscutter.net.proto.DLCDCBJIIHGOuterClass.DLCDCBJIIHG parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.DLCDCBJIIHGOuterClass.DLCDCBJIIHG) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int gKNCBIEJEPP_ ;
      /**
       * <code>uint32 GKNCBIEJEPP = 7;</code>
       * @return The gKNCBIEJEPP.
       */
      @java.lang.Override
      public int getGKNCBIEJEPP() {
        return gKNCBIEJEPP_;
      }
      /**
       * <code>uint32 GKNCBIEJEPP = 7;</code>
       * @param value The gKNCBIEJEPP to set.
       * @return This builder for chaining.
       */
      public Builder setGKNCBIEJEPP(int value) {
        
        gKNCBIEJEPP_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 GKNCBIEJEPP = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearGKNCBIEJEPP() {
        
        gKNCBIEJEPP_ = 0;
        onChanged();
        return this;
      }

      private int groupId_ ;
      /**
       * <code>uint32 group_id = 8;</code>
       * @return The groupId.
       */
      @java.lang.Override
      public int getGroupId() {
        return groupId_;
      }
      /**
       * <code>uint32 group_id = 8;</code>
       * @param value The groupId to set.
       * @return This builder for chaining.
       */
      public Builder setGroupId(int value) {
        
        groupId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 group_id = 8;</code>
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


      // @@protoc_insertion_point(builder_scope:DLCDCBJIIHG)
    }

    // @@protoc_insertion_point(class_scope:DLCDCBJIIHG)
    private static final emu.grasscutter.net.proto.DLCDCBJIIHGOuterClass.DLCDCBJIIHG DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.DLCDCBJIIHGOuterClass.DLCDCBJIIHG();
    }

    public static emu.grasscutter.net.proto.DLCDCBJIIHGOuterClass.DLCDCBJIIHG getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<DLCDCBJIIHG>
        PARSER = new com.google.protobuf.AbstractParser<DLCDCBJIIHG>() {
      @java.lang.Override
      public DLCDCBJIIHG parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new DLCDCBJIIHG(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<DLCDCBJIIHG> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<DLCDCBJIIHG> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.DLCDCBJIIHGOuterClass.DLCDCBJIIHG getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DLCDCBJIIHG_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DLCDCBJIIHG_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021DLCDCBJIIHG.proto\"4\n\013DLCDCBJIIHG\022\023\n\013GK" +
      "NCBIEJEPP\030\007 \001(\r\022\020\n\010group_id\030\010 \001(\rB\033\n\031emu" +
      ".grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_DLCDCBJIIHG_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_DLCDCBJIIHG_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DLCDCBJIIHG_descriptor,
        new java.lang.String[] { "GKNCBIEJEPP", "GroupId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}