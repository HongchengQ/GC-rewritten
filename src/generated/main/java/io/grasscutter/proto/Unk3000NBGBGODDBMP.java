// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk3000_NBGBGODDBMP.proto

package io.grasscutter.proto;

public final class Unk3000NBGBGODDBMP {
  private Unk3000NBGBGODDBMP() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Unk3000_NBGBGODDBMPOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Unk3000_NBGBGODDBMP)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool Unk3000_PHOPHGOGIIK = 12;</code>
     * @return The unk3000PHOPHGOGIIK.
     */
    boolean getUnk3000PHOPHGOGIIK();

    /**
     * <code>.Unk3000_LBNFMLHLBIH Unk3000_APCKCDLMGMN = 13;</code>
     * @return Whether the unk3000APCKCDLMGMN field is set.
     */
    boolean hasUnk3000APCKCDLMGMN();
    /**
     * <code>.Unk3000_LBNFMLHLBIH Unk3000_APCKCDLMGMN = 13;</code>
     * @return The unk3000APCKCDLMGMN.
     */
    io.grasscutter.proto.Unk3000LBNFMLHLBIH.Unk3000_LBNFMLHLBIH getUnk3000APCKCDLMGMN();
    /**
     * <code>.Unk3000_LBNFMLHLBIH Unk3000_APCKCDLMGMN = 13;</code>
     */
    io.grasscutter.proto.Unk3000LBNFMLHLBIH.Unk3000_LBNFMLHLBIHOrBuilder getUnk3000APCKCDLMGMNOrBuilder();

    /**
     * <code>int32 query_id = 9;</code>
     * @return The queryId.
     */
    int getQueryId();

    /**
     * <code>uint32 scene_id = 3;</code>
     * @return The sceneId.
     */
    int getSceneId();
  }
  /**
   * <pre>
   * CmdId: 6121
   * EnetChannelId: 0
   * EnetIsReliable: true
   * IsAllowClient: true
   * </pre>
   *
   * Protobuf type {@code Unk3000_NBGBGODDBMP}
   */
  public static final class Unk3000_NBGBGODDBMP extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Unk3000_NBGBGODDBMP)
      Unk3000_NBGBGODDBMPOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Unk3000_NBGBGODDBMP.newBuilder() to construct.
    private Unk3000_NBGBGODDBMP(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Unk3000_NBGBGODDBMP() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Unk3000_NBGBGODDBMP();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Unk3000_NBGBGODDBMP(
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

              sceneId_ = input.readUInt32();
              break;
            }
            case 72: {

              queryId_ = input.readInt32();
              break;
            }
            case 96: {

              unk3000PHOPHGOGIIK_ = input.readBool();
              break;
            }
            case 106: {
              io.grasscutter.proto.Unk3000LBNFMLHLBIH.Unk3000_LBNFMLHLBIH.Builder subBuilder = null;
              if (unk3000APCKCDLMGMN_ != null) {
                subBuilder = unk3000APCKCDLMGMN_.toBuilder();
              }
              unk3000APCKCDLMGMN_ = input.readMessage(io.grasscutter.proto.Unk3000LBNFMLHLBIH.Unk3000_LBNFMLHLBIH.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(unk3000APCKCDLMGMN_);
                unk3000APCKCDLMGMN_ = subBuilder.buildPartial();
              }

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
      return io.grasscutter.proto.Unk3000NBGBGODDBMP.internal_static_Unk3000_NBGBGODDBMP_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.proto.Unk3000NBGBGODDBMP.internal_static_Unk3000_NBGBGODDBMP_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.proto.Unk3000NBGBGODDBMP.Unk3000_NBGBGODDBMP.class, io.grasscutter.proto.Unk3000NBGBGODDBMP.Unk3000_NBGBGODDBMP.Builder.class);
    }

    public static final int UNK3000_PHOPHGOGIIK_FIELD_NUMBER = 12;
    private boolean unk3000PHOPHGOGIIK_;
    /**
     * <code>bool Unk3000_PHOPHGOGIIK = 12;</code>
     * @return The unk3000PHOPHGOGIIK.
     */
    @java.lang.Override
    public boolean getUnk3000PHOPHGOGIIK() {
      return unk3000PHOPHGOGIIK_;
    }

    public static final int UNK3000_APCKCDLMGMN_FIELD_NUMBER = 13;
    private io.grasscutter.proto.Unk3000LBNFMLHLBIH.Unk3000_LBNFMLHLBIH unk3000APCKCDLMGMN_;
    /**
     * <code>.Unk3000_LBNFMLHLBIH Unk3000_APCKCDLMGMN = 13;</code>
     * @return Whether the unk3000APCKCDLMGMN field is set.
     */
    @java.lang.Override
    public boolean hasUnk3000APCKCDLMGMN() {
      return unk3000APCKCDLMGMN_ != null;
    }
    /**
     * <code>.Unk3000_LBNFMLHLBIH Unk3000_APCKCDLMGMN = 13;</code>
     * @return The unk3000APCKCDLMGMN.
     */
    @java.lang.Override
    public io.grasscutter.proto.Unk3000LBNFMLHLBIH.Unk3000_LBNFMLHLBIH getUnk3000APCKCDLMGMN() {
      return unk3000APCKCDLMGMN_ == null ? io.grasscutter.proto.Unk3000LBNFMLHLBIH.Unk3000_LBNFMLHLBIH.getDefaultInstance() : unk3000APCKCDLMGMN_;
    }
    /**
     * <code>.Unk3000_LBNFMLHLBIH Unk3000_APCKCDLMGMN = 13;</code>
     */
    @java.lang.Override
    public io.grasscutter.proto.Unk3000LBNFMLHLBIH.Unk3000_LBNFMLHLBIHOrBuilder getUnk3000APCKCDLMGMNOrBuilder() {
      return getUnk3000APCKCDLMGMN();
    }

    public static final int QUERY_ID_FIELD_NUMBER = 9;
    private int queryId_;
    /**
     * <code>int32 query_id = 9;</code>
     * @return The queryId.
     */
    @java.lang.Override
    public int getQueryId() {
      return queryId_;
    }

    public static final int SCENE_ID_FIELD_NUMBER = 3;
    private int sceneId_;
    /**
     * <code>uint32 scene_id = 3;</code>
     * @return The sceneId.
     */
    @java.lang.Override
    public int getSceneId() {
      return sceneId_;
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
      if (sceneId_ != 0) {
        output.writeUInt32(3, sceneId_);
      }
      if (queryId_ != 0) {
        output.writeInt32(9, queryId_);
      }
      if (unk3000PHOPHGOGIIK_ != false) {
        output.writeBool(12, unk3000PHOPHGOGIIK_);
      }
      if (unk3000APCKCDLMGMN_ != null) {
        output.writeMessage(13, getUnk3000APCKCDLMGMN());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (sceneId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, sceneId_);
      }
      if (queryId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(9, queryId_);
      }
      if (unk3000PHOPHGOGIIK_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(12, unk3000PHOPHGOGIIK_);
      }
      if (unk3000APCKCDLMGMN_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(13, getUnk3000APCKCDLMGMN());
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
      if (!(obj instanceof io.grasscutter.proto.Unk3000NBGBGODDBMP.Unk3000_NBGBGODDBMP)) {
        return super.equals(obj);
      }
      io.grasscutter.proto.Unk3000NBGBGODDBMP.Unk3000_NBGBGODDBMP other = (io.grasscutter.proto.Unk3000NBGBGODDBMP.Unk3000_NBGBGODDBMP) obj;

      if (getUnk3000PHOPHGOGIIK()
          != other.getUnk3000PHOPHGOGIIK()) return false;
      if (hasUnk3000APCKCDLMGMN() != other.hasUnk3000APCKCDLMGMN()) return false;
      if (hasUnk3000APCKCDLMGMN()) {
        if (!getUnk3000APCKCDLMGMN()
            .equals(other.getUnk3000APCKCDLMGMN())) return false;
      }
      if (getQueryId()
          != other.getQueryId()) return false;
      if (getSceneId()
          != other.getSceneId()) return false;
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
      hash = (37 * hash) + UNK3000_PHOPHGOGIIK_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getUnk3000PHOPHGOGIIK());
      if (hasUnk3000APCKCDLMGMN()) {
        hash = (37 * hash) + UNK3000_APCKCDLMGMN_FIELD_NUMBER;
        hash = (53 * hash) + getUnk3000APCKCDLMGMN().hashCode();
      }
      hash = (37 * hash) + QUERY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getQueryId();
      hash = (37 * hash) + SCENE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getSceneId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.grasscutter.proto.Unk3000NBGBGODDBMP.Unk3000_NBGBGODDBMP parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.Unk3000NBGBGODDBMP.Unk3000_NBGBGODDBMP parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.Unk3000NBGBGODDBMP.Unk3000_NBGBGODDBMP parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.Unk3000NBGBGODDBMP.Unk3000_NBGBGODDBMP parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.Unk3000NBGBGODDBMP.Unk3000_NBGBGODDBMP parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.Unk3000NBGBGODDBMP.Unk3000_NBGBGODDBMP parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.Unk3000NBGBGODDBMP.Unk3000_NBGBGODDBMP parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.Unk3000NBGBGODDBMP.Unk3000_NBGBGODDBMP parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.Unk3000NBGBGODDBMP.Unk3000_NBGBGODDBMP parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.Unk3000NBGBGODDBMP.Unk3000_NBGBGODDBMP parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.Unk3000NBGBGODDBMP.Unk3000_NBGBGODDBMP parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.Unk3000NBGBGODDBMP.Unk3000_NBGBGODDBMP parseFrom(
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
    public static Builder newBuilder(io.grasscutter.proto.Unk3000NBGBGODDBMP.Unk3000_NBGBGODDBMP prototype) {
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
     * CmdId: 6121
     * EnetChannelId: 0
     * EnetIsReliable: true
     * IsAllowClient: true
     * </pre>
     *
     * Protobuf type {@code Unk3000_NBGBGODDBMP}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Unk3000_NBGBGODDBMP)
        io.grasscutter.proto.Unk3000NBGBGODDBMP.Unk3000_NBGBGODDBMPOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.grasscutter.proto.Unk3000NBGBGODDBMP.internal_static_Unk3000_NBGBGODDBMP_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.grasscutter.proto.Unk3000NBGBGODDBMP.internal_static_Unk3000_NBGBGODDBMP_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.grasscutter.proto.Unk3000NBGBGODDBMP.Unk3000_NBGBGODDBMP.class, io.grasscutter.proto.Unk3000NBGBGODDBMP.Unk3000_NBGBGODDBMP.Builder.class);
      }

      // Construct using io.grasscutter.proto.Unk3000NBGBGODDBMP.Unk3000_NBGBGODDBMP.newBuilder()
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
        unk3000PHOPHGOGIIK_ = false;

        if (unk3000APCKCDLMGMNBuilder_ == null) {
          unk3000APCKCDLMGMN_ = null;
        } else {
          unk3000APCKCDLMGMN_ = null;
          unk3000APCKCDLMGMNBuilder_ = null;
        }
        queryId_ = 0;

        sceneId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.grasscutter.proto.Unk3000NBGBGODDBMP.internal_static_Unk3000_NBGBGODDBMP_descriptor;
      }

      @java.lang.Override
      public io.grasscutter.proto.Unk3000NBGBGODDBMP.Unk3000_NBGBGODDBMP getDefaultInstanceForType() {
        return io.grasscutter.proto.Unk3000NBGBGODDBMP.Unk3000_NBGBGODDBMP.getDefaultInstance();
      }

      @java.lang.Override
      public io.grasscutter.proto.Unk3000NBGBGODDBMP.Unk3000_NBGBGODDBMP build() {
        io.grasscutter.proto.Unk3000NBGBGODDBMP.Unk3000_NBGBGODDBMP result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.grasscutter.proto.Unk3000NBGBGODDBMP.Unk3000_NBGBGODDBMP buildPartial() {
        io.grasscutter.proto.Unk3000NBGBGODDBMP.Unk3000_NBGBGODDBMP result = new io.grasscutter.proto.Unk3000NBGBGODDBMP.Unk3000_NBGBGODDBMP(this);
        result.unk3000PHOPHGOGIIK_ = unk3000PHOPHGOGIIK_;
        if (unk3000APCKCDLMGMNBuilder_ == null) {
          result.unk3000APCKCDLMGMN_ = unk3000APCKCDLMGMN_;
        } else {
          result.unk3000APCKCDLMGMN_ = unk3000APCKCDLMGMNBuilder_.build();
        }
        result.queryId_ = queryId_;
        result.sceneId_ = sceneId_;
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
        if (other instanceof io.grasscutter.proto.Unk3000NBGBGODDBMP.Unk3000_NBGBGODDBMP) {
          return mergeFrom((io.grasscutter.proto.Unk3000NBGBGODDBMP.Unk3000_NBGBGODDBMP)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.grasscutter.proto.Unk3000NBGBGODDBMP.Unk3000_NBGBGODDBMP other) {
        if (other == io.grasscutter.proto.Unk3000NBGBGODDBMP.Unk3000_NBGBGODDBMP.getDefaultInstance()) return this;
        if (other.getUnk3000PHOPHGOGIIK() != false) {
          setUnk3000PHOPHGOGIIK(other.getUnk3000PHOPHGOGIIK());
        }
        if (other.hasUnk3000APCKCDLMGMN()) {
          mergeUnk3000APCKCDLMGMN(other.getUnk3000APCKCDLMGMN());
        }
        if (other.getQueryId() != 0) {
          setQueryId(other.getQueryId());
        }
        if (other.getSceneId() != 0) {
          setSceneId(other.getSceneId());
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
        io.grasscutter.proto.Unk3000NBGBGODDBMP.Unk3000_NBGBGODDBMP parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.grasscutter.proto.Unk3000NBGBGODDBMP.Unk3000_NBGBGODDBMP) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private boolean unk3000PHOPHGOGIIK_ ;
      /**
       * <code>bool Unk3000_PHOPHGOGIIK = 12;</code>
       * @return The unk3000PHOPHGOGIIK.
       */
      @java.lang.Override
      public boolean getUnk3000PHOPHGOGIIK() {
        return unk3000PHOPHGOGIIK_;
      }
      /**
       * <code>bool Unk3000_PHOPHGOGIIK = 12;</code>
       * @param value The unk3000PHOPHGOGIIK to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3000PHOPHGOGIIK(boolean value) {
        
        unk3000PHOPHGOGIIK_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool Unk3000_PHOPHGOGIIK = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3000PHOPHGOGIIK() {
        
        unk3000PHOPHGOGIIK_ = false;
        onChanged();
        return this;
      }

      private io.grasscutter.proto.Unk3000LBNFMLHLBIH.Unk3000_LBNFMLHLBIH unk3000APCKCDLMGMN_;
      private com.google.protobuf.SingleFieldBuilderV3<
          io.grasscutter.proto.Unk3000LBNFMLHLBIH.Unk3000_LBNFMLHLBIH, io.grasscutter.proto.Unk3000LBNFMLHLBIH.Unk3000_LBNFMLHLBIH.Builder, io.grasscutter.proto.Unk3000LBNFMLHLBIH.Unk3000_LBNFMLHLBIHOrBuilder> unk3000APCKCDLMGMNBuilder_;
      /**
       * <code>.Unk3000_LBNFMLHLBIH Unk3000_APCKCDLMGMN = 13;</code>
       * @return Whether the unk3000APCKCDLMGMN field is set.
       */
      public boolean hasUnk3000APCKCDLMGMN() {
        return unk3000APCKCDLMGMNBuilder_ != null || unk3000APCKCDLMGMN_ != null;
      }
      /**
       * <code>.Unk3000_LBNFMLHLBIH Unk3000_APCKCDLMGMN = 13;</code>
       * @return The unk3000APCKCDLMGMN.
       */
      public io.grasscutter.proto.Unk3000LBNFMLHLBIH.Unk3000_LBNFMLHLBIH getUnk3000APCKCDLMGMN() {
        if (unk3000APCKCDLMGMNBuilder_ == null) {
          return unk3000APCKCDLMGMN_ == null ? io.grasscutter.proto.Unk3000LBNFMLHLBIH.Unk3000_LBNFMLHLBIH.getDefaultInstance() : unk3000APCKCDLMGMN_;
        } else {
          return unk3000APCKCDLMGMNBuilder_.getMessage();
        }
      }
      /**
       * <code>.Unk3000_LBNFMLHLBIH Unk3000_APCKCDLMGMN = 13;</code>
       */
      public Builder setUnk3000APCKCDLMGMN(io.grasscutter.proto.Unk3000LBNFMLHLBIH.Unk3000_LBNFMLHLBIH value) {
        if (unk3000APCKCDLMGMNBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          unk3000APCKCDLMGMN_ = value;
          onChanged();
        } else {
          unk3000APCKCDLMGMNBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.Unk3000_LBNFMLHLBIH Unk3000_APCKCDLMGMN = 13;</code>
       */
      public Builder setUnk3000APCKCDLMGMN(
          io.grasscutter.proto.Unk3000LBNFMLHLBIH.Unk3000_LBNFMLHLBIH.Builder builderForValue) {
        if (unk3000APCKCDLMGMNBuilder_ == null) {
          unk3000APCKCDLMGMN_ = builderForValue.build();
          onChanged();
        } else {
          unk3000APCKCDLMGMNBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.Unk3000_LBNFMLHLBIH Unk3000_APCKCDLMGMN = 13;</code>
       */
      public Builder mergeUnk3000APCKCDLMGMN(io.grasscutter.proto.Unk3000LBNFMLHLBIH.Unk3000_LBNFMLHLBIH value) {
        if (unk3000APCKCDLMGMNBuilder_ == null) {
          if (unk3000APCKCDLMGMN_ != null) {
            unk3000APCKCDLMGMN_ =
              io.grasscutter.proto.Unk3000LBNFMLHLBIH.Unk3000_LBNFMLHLBIH.newBuilder(unk3000APCKCDLMGMN_).mergeFrom(value).buildPartial();
          } else {
            unk3000APCKCDLMGMN_ = value;
          }
          onChanged();
        } else {
          unk3000APCKCDLMGMNBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.Unk3000_LBNFMLHLBIH Unk3000_APCKCDLMGMN = 13;</code>
       */
      public Builder clearUnk3000APCKCDLMGMN() {
        if (unk3000APCKCDLMGMNBuilder_ == null) {
          unk3000APCKCDLMGMN_ = null;
          onChanged();
        } else {
          unk3000APCKCDLMGMN_ = null;
          unk3000APCKCDLMGMNBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.Unk3000_LBNFMLHLBIH Unk3000_APCKCDLMGMN = 13;</code>
       */
      public io.grasscutter.proto.Unk3000LBNFMLHLBIH.Unk3000_LBNFMLHLBIH.Builder getUnk3000APCKCDLMGMNBuilder() {
        
        onChanged();
        return getUnk3000APCKCDLMGMNFieldBuilder().getBuilder();
      }
      /**
       * <code>.Unk3000_LBNFMLHLBIH Unk3000_APCKCDLMGMN = 13;</code>
       */
      public io.grasscutter.proto.Unk3000LBNFMLHLBIH.Unk3000_LBNFMLHLBIHOrBuilder getUnk3000APCKCDLMGMNOrBuilder() {
        if (unk3000APCKCDLMGMNBuilder_ != null) {
          return unk3000APCKCDLMGMNBuilder_.getMessageOrBuilder();
        } else {
          return unk3000APCKCDLMGMN_ == null ?
              io.grasscutter.proto.Unk3000LBNFMLHLBIH.Unk3000_LBNFMLHLBIH.getDefaultInstance() : unk3000APCKCDLMGMN_;
        }
      }
      /**
       * <code>.Unk3000_LBNFMLHLBIH Unk3000_APCKCDLMGMN = 13;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          io.grasscutter.proto.Unk3000LBNFMLHLBIH.Unk3000_LBNFMLHLBIH, io.grasscutter.proto.Unk3000LBNFMLHLBIH.Unk3000_LBNFMLHLBIH.Builder, io.grasscutter.proto.Unk3000LBNFMLHLBIH.Unk3000_LBNFMLHLBIHOrBuilder> 
          getUnk3000APCKCDLMGMNFieldBuilder() {
        if (unk3000APCKCDLMGMNBuilder_ == null) {
          unk3000APCKCDLMGMNBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              io.grasscutter.proto.Unk3000LBNFMLHLBIH.Unk3000_LBNFMLHLBIH, io.grasscutter.proto.Unk3000LBNFMLHLBIH.Unk3000_LBNFMLHLBIH.Builder, io.grasscutter.proto.Unk3000LBNFMLHLBIH.Unk3000_LBNFMLHLBIHOrBuilder>(
                  getUnk3000APCKCDLMGMN(),
                  getParentForChildren(),
                  isClean());
          unk3000APCKCDLMGMN_ = null;
        }
        return unk3000APCKCDLMGMNBuilder_;
      }

      private int queryId_ ;
      /**
       * <code>int32 query_id = 9;</code>
       * @return The queryId.
       */
      @java.lang.Override
      public int getQueryId() {
        return queryId_;
      }
      /**
       * <code>int32 query_id = 9;</code>
       * @param value The queryId to set.
       * @return This builder for chaining.
       */
      public Builder setQueryId(int value) {
        
        queryId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 query_id = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearQueryId() {
        
        queryId_ = 0;
        onChanged();
        return this;
      }

      private int sceneId_ ;
      /**
       * <code>uint32 scene_id = 3;</code>
       * @return The sceneId.
       */
      @java.lang.Override
      public int getSceneId() {
        return sceneId_;
      }
      /**
       * <code>uint32 scene_id = 3;</code>
       * @param value The sceneId to set.
       * @return This builder for chaining.
       */
      public Builder setSceneId(int value) {
        
        sceneId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 scene_id = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearSceneId() {
        
        sceneId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:Unk3000_NBGBGODDBMP)
    }

    // @@protoc_insertion_point(class_scope:Unk3000_NBGBGODDBMP)
    private static final io.grasscutter.proto.Unk3000NBGBGODDBMP.Unk3000_NBGBGODDBMP DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.grasscutter.proto.Unk3000NBGBGODDBMP.Unk3000_NBGBGODDBMP();
    }

    public static io.grasscutter.proto.Unk3000NBGBGODDBMP.Unk3000_NBGBGODDBMP getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Unk3000_NBGBGODDBMP>
        PARSER = new com.google.protobuf.AbstractParser<Unk3000_NBGBGODDBMP>() {
      @java.lang.Override
      public Unk3000_NBGBGODDBMP parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Unk3000_NBGBGODDBMP(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Unk3000_NBGBGODDBMP> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Unk3000_NBGBGODDBMP> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.grasscutter.proto.Unk3000NBGBGODDBMP.Unk3000_NBGBGODDBMP getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk3000_NBGBGODDBMP_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk3000_NBGBGODDBMP_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031Unk3000_NBGBGODDBMP.proto\032\031Unk3000_LBN" +
      "FMLHLBIH.proto\"\211\001\n\023Unk3000_NBGBGODDBMP\022\033" +
      "\n\023Unk3000_PHOPHGOGIIK\030\014 \001(\010\0221\n\023Unk3000_A" +
      "PCKCDLMGMN\030\r \001(\0132\024.Unk3000_LBNFMLHLBIH\022\020" +
      "\n\010query_id\030\t \001(\005\022\020\n\010scene_id\030\003 \001(\rB\026\n\024io" +
      ".grasscutter.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.grasscutter.proto.Unk3000LBNFMLHLBIH.getDescriptor(),
        });
    internal_static_Unk3000_NBGBGODDBMP_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Unk3000_NBGBGODDBMP_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk3000_NBGBGODDBMP_descriptor,
        new java.lang.String[] { "Unk3000PHOPHGOGIIK", "Unk3000APCKCDLMGMN", "QueryId", "SceneId", });
    io.grasscutter.proto.Unk3000LBNFMLHLBIH.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
