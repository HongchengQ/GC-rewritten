// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FleurFairFallSettleNotify.proto

package io.grasscutter.proto;

public final class FleurFairFallSettleNotifyOuterClass {
  private FleurFairFallSettleNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface FleurFairFallSettleNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:FleurFairFallSettleNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 minigame_id = 15;</code>
     * @return The minigameId.
     */
    int getMinigameId();

    /**
     * <code>map&lt;uint32, .FleurFairFallSettleInfo&gt; settle_info_map = 11;</code>
     */
    int getSettleInfoMapCount();
    /**
     * <code>map&lt;uint32, .FleurFairFallSettleInfo&gt; settle_info_map = 11;</code>
     */
    boolean containsSettleInfoMap(
        int key);
    /**
     * Use {@link #getSettleInfoMapMap()} instead.
     */
    @java.lang.Deprecated
    java.util.Map<java.lang.Integer, io.grasscutter.proto.FleurFairFallSettleInfoOuterClass.FleurFairFallSettleInfo>
    getSettleInfoMap();
    /**
     * <code>map&lt;uint32, .FleurFairFallSettleInfo&gt; settle_info_map = 11;</code>
     */
    java.util.Map<java.lang.Integer, io.grasscutter.proto.FleurFairFallSettleInfoOuterClass.FleurFairFallSettleInfo>
    getSettleInfoMapMap();
    /**
     * <code>map&lt;uint32, .FleurFairFallSettleInfo&gt; settle_info_map = 11;</code>
     */

    io.grasscutter.proto.FleurFairFallSettleInfoOuterClass.FleurFairFallSettleInfo getSettleInfoMapOrDefault(
        int key,
        io.grasscutter.proto.FleurFairFallSettleInfoOuterClass.FleurFairFallSettleInfo defaultValue);
    /**
     * <code>map&lt;uint32, .FleurFairFallSettleInfo&gt; settle_info_map = 11;</code>
     */

    io.grasscutter.proto.FleurFairFallSettleInfoOuterClass.FleurFairFallSettleInfo getSettleInfoMapOrThrow(
        int key);
  }
  /**
   * <pre>
   * CmdId: 2017
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code FleurFairFallSettleNotify}
   */
  public static final class FleurFairFallSettleNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:FleurFairFallSettleNotify)
      FleurFairFallSettleNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use FleurFairFallSettleNotify.newBuilder() to construct.
    private FleurFairFallSettleNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private FleurFairFallSettleNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new FleurFairFallSettleNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private FleurFairFallSettleNotify(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
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
            case 90: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                settleInfoMap_ = com.google.protobuf.MapField.newMapField(
                    SettleInfoMapDefaultEntryHolder.defaultEntry);
                mutable_bitField0_ |= 0x00000001;
              }
              com.google.protobuf.MapEntry<java.lang.Integer, io.grasscutter.proto.FleurFairFallSettleInfoOuterClass.FleurFairFallSettleInfo>
              settleInfoMap__ = input.readMessage(
                  SettleInfoMapDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              settleInfoMap_.getMutableMap().put(
                  settleInfoMap__.getKey(), settleInfoMap__.getValue());
              break;
            }
            case 120: {

              minigameId_ = input.readUInt32();
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
      return io.grasscutter.proto.FleurFairFallSettleNotifyOuterClass.internal_static_FleurFairFallSettleNotify_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    @java.lang.Override
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 11:
          return internalGetSettleInfoMap();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.proto.FleurFairFallSettleNotifyOuterClass.internal_static_FleurFairFallSettleNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.proto.FleurFairFallSettleNotifyOuterClass.FleurFairFallSettleNotify.class, io.grasscutter.proto.FleurFairFallSettleNotifyOuterClass.FleurFairFallSettleNotify.Builder.class);
    }

    public static final int MINIGAME_ID_FIELD_NUMBER = 15;
    private int minigameId_;
    /**
     * <code>uint32 minigame_id = 15;</code>
     * @return The minigameId.
     */
    @java.lang.Override
    public int getMinigameId() {
      return minigameId_;
    }

    public static final int SETTLE_INFO_MAP_FIELD_NUMBER = 11;
    private static final class SettleInfoMapDefaultEntryHolder {
      static final com.google.protobuf.MapEntry<
          java.lang.Integer, io.grasscutter.proto.FleurFairFallSettleInfoOuterClass.FleurFairFallSettleInfo> defaultEntry =
              com.google.protobuf.MapEntry
              .<java.lang.Integer, io.grasscutter.proto.FleurFairFallSettleInfoOuterClass.FleurFairFallSettleInfo>newDefaultInstance(
                  io.grasscutter.proto.FleurFairFallSettleNotifyOuterClass.internal_static_FleurFairFallSettleNotify_SettleInfoMapEntry_descriptor, 
                  com.google.protobuf.WireFormat.FieldType.UINT32,
                  0,
                  com.google.protobuf.WireFormat.FieldType.MESSAGE,
                  io.grasscutter.proto.FleurFairFallSettleInfoOuterClass.FleurFairFallSettleInfo.getDefaultInstance());
    }
    private com.google.protobuf.MapField<
        java.lang.Integer, io.grasscutter.proto.FleurFairFallSettleInfoOuterClass.FleurFairFallSettleInfo> settleInfoMap_;
    private com.google.protobuf.MapField<java.lang.Integer, io.grasscutter.proto.FleurFairFallSettleInfoOuterClass.FleurFairFallSettleInfo>
    internalGetSettleInfoMap() {
      if (settleInfoMap_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            SettleInfoMapDefaultEntryHolder.defaultEntry);
      }
      return settleInfoMap_;
    }

    public int getSettleInfoMapCount() {
      return internalGetSettleInfoMap().getMap().size();
    }
    /**
     * <code>map&lt;uint32, .FleurFairFallSettleInfo&gt; settle_info_map = 11;</code>
     */

    @java.lang.Override
    public boolean containsSettleInfoMap(
        int key) {
      
      return internalGetSettleInfoMap().getMap().containsKey(key);
    }
    /**
     * Use {@link #getSettleInfoMapMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.Integer, io.grasscutter.proto.FleurFairFallSettleInfoOuterClass.FleurFairFallSettleInfo> getSettleInfoMap() {
      return getSettleInfoMapMap();
    }
    /**
     * <code>map&lt;uint32, .FleurFairFallSettleInfo&gt; settle_info_map = 11;</code>
     */
    @java.lang.Override

    public java.util.Map<java.lang.Integer, io.grasscutter.proto.FleurFairFallSettleInfoOuterClass.FleurFairFallSettleInfo> getSettleInfoMapMap() {
      return internalGetSettleInfoMap().getMap();
    }
    /**
     * <code>map&lt;uint32, .FleurFairFallSettleInfo&gt; settle_info_map = 11;</code>
     */
    @java.lang.Override

    public io.grasscutter.proto.FleurFairFallSettleInfoOuterClass.FleurFairFallSettleInfo getSettleInfoMapOrDefault(
        int key,
        io.grasscutter.proto.FleurFairFallSettleInfoOuterClass.FleurFairFallSettleInfo defaultValue) {
      
      java.util.Map<java.lang.Integer, io.grasscutter.proto.FleurFairFallSettleInfoOuterClass.FleurFairFallSettleInfo> map =
          internalGetSettleInfoMap().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;uint32, .FleurFairFallSettleInfo&gt; settle_info_map = 11;</code>
     */
    @java.lang.Override

    public io.grasscutter.proto.FleurFairFallSettleInfoOuterClass.FleurFairFallSettleInfo getSettleInfoMapOrThrow(
        int key) {
      
      java.util.Map<java.lang.Integer, io.grasscutter.proto.FleurFairFallSettleInfoOuterClass.FleurFairFallSettleInfo> map =
          internalGetSettleInfoMap().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
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
      com.google.protobuf.GeneratedMessageV3
        .serializeIntegerMapTo(
          output,
          internalGetSettleInfoMap(),
          SettleInfoMapDefaultEntryHolder.defaultEntry,
          11);
      if (minigameId_ != 0) {
        output.writeUInt32(15, minigameId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (java.util.Map.Entry<java.lang.Integer, io.grasscutter.proto.FleurFairFallSettleInfoOuterClass.FleurFairFallSettleInfo> entry
           : internalGetSettleInfoMap().getMap().entrySet()) {
        com.google.protobuf.MapEntry<java.lang.Integer, io.grasscutter.proto.FleurFairFallSettleInfoOuterClass.FleurFairFallSettleInfo>
        settleInfoMap__ = SettleInfoMapDefaultEntryHolder.defaultEntry.newBuilderForType()
            .setKey(entry.getKey())
            .setValue(entry.getValue())
            .build();
        size += com.google.protobuf.CodedOutputStream
            .computeMessageSize(11, settleInfoMap__);
      }
      if (minigameId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, minigameId_);
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
      if (!(obj instanceof io.grasscutter.proto.FleurFairFallSettleNotifyOuterClass.FleurFairFallSettleNotify)) {
        return super.equals(obj);
      }
      io.grasscutter.proto.FleurFairFallSettleNotifyOuterClass.FleurFairFallSettleNotify other = (io.grasscutter.proto.FleurFairFallSettleNotifyOuterClass.FleurFairFallSettleNotify) obj;

      if (getMinigameId()
          != other.getMinigameId()) return false;
      if (!internalGetSettleInfoMap().equals(
          other.internalGetSettleInfoMap())) return false;
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
      hash = (37 * hash) + MINIGAME_ID_FIELD_NUMBER;
      hash = (53 * hash) + getMinigameId();
      if (!internalGetSettleInfoMap().getMap().isEmpty()) {
        hash = (37 * hash) + SETTLE_INFO_MAP_FIELD_NUMBER;
        hash = (53 * hash) + internalGetSettleInfoMap().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.grasscutter.proto.FleurFairFallSettleNotifyOuterClass.FleurFairFallSettleNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.FleurFairFallSettleNotifyOuterClass.FleurFairFallSettleNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.FleurFairFallSettleNotifyOuterClass.FleurFairFallSettleNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.FleurFairFallSettleNotifyOuterClass.FleurFairFallSettleNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.FleurFairFallSettleNotifyOuterClass.FleurFairFallSettleNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.FleurFairFallSettleNotifyOuterClass.FleurFairFallSettleNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.FleurFairFallSettleNotifyOuterClass.FleurFairFallSettleNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.FleurFairFallSettleNotifyOuterClass.FleurFairFallSettleNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.FleurFairFallSettleNotifyOuterClass.FleurFairFallSettleNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.FleurFairFallSettleNotifyOuterClass.FleurFairFallSettleNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.FleurFairFallSettleNotifyOuterClass.FleurFairFallSettleNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.FleurFairFallSettleNotifyOuterClass.FleurFairFallSettleNotify parseFrom(
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
    public static Builder newBuilder(io.grasscutter.proto.FleurFairFallSettleNotifyOuterClass.FleurFairFallSettleNotify prototype) {
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
     * CmdId: 2017
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code FleurFairFallSettleNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:FleurFairFallSettleNotify)
        io.grasscutter.proto.FleurFairFallSettleNotifyOuterClass.FleurFairFallSettleNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.grasscutter.proto.FleurFairFallSettleNotifyOuterClass.internal_static_FleurFairFallSettleNotify_descriptor;
      }

      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMapField(
          int number) {
        switch (number) {
          case 11:
            return internalGetSettleInfoMap();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMutableMapField(
          int number) {
        switch (number) {
          case 11:
            return internalGetMutableSettleInfoMap();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.grasscutter.proto.FleurFairFallSettleNotifyOuterClass.internal_static_FleurFairFallSettleNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.grasscutter.proto.FleurFairFallSettleNotifyOuterClass.FleurFairFallSettleNotify.class, io.grasscutter.proto.FleurFairFallSettleNotifyOuterClass.FleurFairFallSettleNotify.Builder.class);
      }

      // Construct using io.grasscutter.proto.FleurFairFallSettleNotifyOuterClass.FleurFairFallSettleNotify.newBuilder()
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
        minigameId_ = 0;

        internalGetMutableSettleInfoMap().clear();
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.grasscutter.proto.FleurFairFallSettleNotifyOuterClass.internal_static_FleurFairFallSettleNotify_descriptor;
      }

      @java.lang.Override
      public io.grasscutter.proto.FleurFairFallSettleNotifyOuterClass.FleurFairFallSettleNotify getDefaultInstanceForType() {
        return io.grasscutter.proto.FleurFairFallSettleNotifyOuterClass.FleurFairFallSettleNotify.getDefaultInstance();
      }

      @java.lang.Override
      public io.grasscutter.proto.FleurFairFallSettleNotifyOuterClass.FleurFairFallSettleNotify build() {
        io.grasscutter.proto.FleurFairFallSettleNotifyOuterClass.FleurFairFallSettleNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.grasscutter.proto.FleurFairFallSettleNotifyOuterClass.FleurFairFallSettleNotify buildPartial() {
        io.grasscutter.proto.FleurFairFallSettleNotifyOuterClass.FleurFairFallSettleNotify result = new io.grasscutter.proto.FleurFairFallSettleNotifyOuterClass.FleurFairFallSettleNotify(this);
        int from_bitField0_ = bitField0_;
        result.minigameId_ = minigameId_;
        result.settleInfoMap_ = internalGetSettleInfoMap();
        result.settleInfoMap_.makeImmutable();
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
        if (other instanceof io.grasscutter.proto.FleurFairFallSettleNotifyOuterClass.FleurFairFallSettleNotify) {
          return mergeFrom((io.grasscutter.proto.FleurFairFallSettleNotifyOuterClass.FleurFairFallSettleNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.grasscutter.proto.FleurFairFallSettleNotifyOuterClass.FleurFairFallSettleNotify other) {
        if (other == io.grasscutter.proto.FleurFairFallSettleNotifyOuterClass.FleurFairFallSettleNotify.getDefaultInstance()) return this;
        if (other.getMinigameId() != 0) {
          setMinigameId(other.getMinigameId());
        }
        internalGetMutableSettleInfoMap().mergeFrom(
            other.internalGetSettleInfoMap());
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
        io.grasscutter.proto.FleurFairFallSettleNotifyOuterClass.FleurFairFallSettleNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.grasscutter.proto.FleurFairFallSettleNotifyOuterClass.FleurFairFallSettleNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int minigameId_ ;
      /**
       * <code>uint32 minigame_id = 15;</code>
       * @return The minigameId.
       */
      @java.lang.Override
      public int getMinigameId() {
        return minigameId_;
      }
      /**
       * <code>uint32 minigame_id = 15;</code>
       * @param value The minigameId to set.
       * @return This builder for chaining.
       */
      public Builder setMinigameId(int value) {
        
        minigameId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 minigame_id = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearMinigameId() {
        
        minigameId_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.MapField<
          java.lang.Integer, io.grasscutter.proto.FleurFairFallSettleInfoOuterClass.FleurFairFallSettleInfo> settleInfoMap_;
      private com.google.protobuf.MapField<java.lang.Integer, io.grasscutter.proto.FleurFairFallSettleInfoOuterClass.FleurFairFallSettleInfo>
      internalGetSettleInfoMap() {
        if (settleInfoMap_ == null) {
          return com.google.protobuf.MapField.emptyMapField(
              SettleInfoMapDefaultEntryHolder.defaultEntry);
        }
        return settleInfoMap_;
      }
      private com.google.protobuf.MapField<java.lang.Integer, io.grasscutter.proto.FleurFairFallSettleInfoOuterClass.FleurFairFallSettleInfo>
      internalGetMutableSettleInfoMap() {
        onChanged();;
        if (settleInfoMap_ == null) {
          settleInfoMap_ = com.google.protobuf.MapField.newMapField(
              SettleInfoMapDefaultEntryHolder.defaultEntry);
        }
        if (!settleInfoMap_.isMutable()) {
          settleInfoMap_ = settleInfoMap_.copy();
        }
        return settleInfoMap_;
      }

      public int getSettleInfoMapCount() {
        return internalGetSettleInfoMap().getMap().size();
      }
      /**
       * <code>map&lt;uint32, .FleurFairFallSettleInfo&gt; settle_info_map = 11;</code>
       */

      @java.lang.Override
      public boolean containsSettleInfoMap(
          int key) {
        
        return internalGetSettleInfoMap().getMap().containsKey(key);
      }
      /**
       * Use {@link #getSettleInfoMapMap()} instead.
       */
      @java.lang.Override
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, io.grasscutter.proto.FleurFairFallSettleInfoOuterClass.FleurFairFallSettleInfo> getSettleInfoMap() {
        return getSettleInfoMapMap();
      }
      /**
       * <code>map&lt;uint32, .FleurFairFallSettleInfo&gt; settle_info_map = 11;</code>
       */
      @java.lang.Override

      public java.util.Map<java.lang.Integer, io.grasscutter.proto.FleurFairFallSettleInfoOuterClass.FleurFairFallSettleInfo> getSettleInfoMapMap() {
        return internalGetSettleInfoMap().getMap();
      }
      /**
       * <code>map&lt;uint32, .FleurFairFallSettleInfo&gt; settle_info_map = 11;</code>
       */
      @java.lang.Override

      public io.grasscutter.proto.FleurFairFallSettleInfoOuterClass.FleurFairFallSettleInfo getSettleInfoMapOrDefault(
          int key,
          io.grasscutter.proto.FleurFairFallSettleInfoOuterClass.FleurFairFallSettleInfo defaultValue) {
        
        java.util.Map<java.lang.Integer, io.grasscutter.proto.FleurFairFallSettleInfoOuterClass.FleurFairFallSettleInfo> map =
            internalGetSettleInfoMap().getMap();
        return map.containsKey(key) ? map.get(key) : defaultValue;
      }
      /**
       * <code>map&lt;uint32, .FleurFairFallSettleInfo&gt; settle_info_map = 11;</code>
       */
      @java.lang.Override

      public io.grasscutter.proto.FleurFairFallSettleInfoOuterClass.FleurFairFallSettleInfo getSettleInfoMapOrThrow(
          int key) {
        
        java.util.Map<java.lang.Integer, io.grasscutter.proto.FleurFairFallSettleInfoOuterClass.FleurFairFallSettleInfo> map =
            internalGetSettleInfoMap().getMap();
        if (!map.containsKey(key)) {
          throw new java.lang.IllegalArgumentException();
        }
        return map.get(key);
      }

      public Builder clearSettleInfoMap() {
        internalGetMutableSettleInfoMap().getMutableMap()
            .clear();
        return this;
      }
      /**
       * <code>map&lt;uint32, .FleurFairFallSettleInfo&gt; settle_info_map = 11;</code>
       */

      public Builder removeSettleInfoMap(
          int key) {
        
        internalGetMutableSettleInfoMap().getMutableMap()
            .remove(key);
        return this;
      }
      /**
       * Use alternate mutation accessors instead.
       */
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, io.grasscutter.proto.FleurFairFallSettleInfoOuterClass.FleurFairFallSettleInfo>
      getMutableSettleInfoMap() {
        return internalGetMutableSettleInfoMap().getMutableMap();
      }
      /**
       * <code>map&lt;uint32, .FleurFairFallSettleInfo&gt; settle_info_map = 11;</code>
       */
      public Builder putSettleInfoMap(
          int key,
          io.grasscutter.proto.FleurFairFallSettleInfoOuterClass.FleurFairFallSettleInfo value) {
        
        if (value == null) { throw new java.lang.NullPointerException(); }
        internalGetMutableSettleInfoMap().getMutableMap()
            .put(key, value);
        return this;
      }
      /**
       * <code>map&lt;uint32, .FleurFairFallSettleInfo&gt; settle_info_map = 11;</code>
       */

      public Builder putAllSettleInfoMap(
          java.util.Map<java.lang.Integer, io.grasscutter.proto.FleurFairFallSettleInfoOuterClass.FleurFairFallSettleInfo> values) {
        internalGetMutableSettleInfoMap().getMutableMap()
            .putAll(values);
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


      // @@protoc_insertion_point(builder_scope:FleurFairFallSettleNotify)
    }

    // @@protoc_insertion_point(class_scope:FleurFairFallSettleNotify)
    private static final io.grasscutter.proto.FleurFairFallSettleNotifyOuterClass.FleurFairFallSettleNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.grasscutter.proto.FleurFairFallSettleNotifyOuterClass.FleurFairFallSettleNotify();
    }

    public static io.grasscutter.proto.FleurFairFallSettleNotifyOuterClass.FleurFairFallSettleNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<FleurFairFallSettleNotify>
        PARSER = new com.google.protobuf.AbstractParser<FleurFairFallSettleNotify>() {
      @java.lang.Override
      public FleurFairFallSettleNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new FleurFairFallSettleNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<FleurFairFallSettleNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<FleurFairFallSettleNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.grasscutter.proto.FleurFairFallSettleNotifyOuterClass.FleurFairFallSettleNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_FleurFairFallSettleNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_FleurFairFallSettleNotify_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_FleurFairFallSettleNotify_SettleInfoMapEntry_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_FleurFairFallSettleNotify_SettleInfoMapEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037FleurFairFallSettleNotify.proto\032\035Fleur" +
      "FairFallSettleInfo.proto\"\310\001\n\031FleurFairFa" +
      "llSettleNotify\022\023\n\013minigame_id\030\017 \001(\r\022F\n\017s" +
      "ettle_info_map\030\013 \003(\0132-.FleurFairFallSett" +
      "leNotify.SettleInfoMapEntry\032N\n\022SettleInf" +
      "oMapEntry\022\013\n\003key\030\001 \001(\r\022\'\n\005value\030\002 \001(\0132\030." +
      "FleurFairFallSettleInfo:\0028\001B\026\n\024io.grassc" +
      "utter.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.grasscutter.proto.FleurFairFallSettleInfoOuterClass.getDescriptor(),
        });
    internal_static_FleurFairFallSettleNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_FleurFairFallSettleNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_FleurFairFallSettleNotify_descriptor,
        new java.lang.String[] { "MinigameId", "SettleInfoMap", });
    internal_static_FleurFairFallSettleNotify_SettleInfoMapEntry_descriptor =
      internal_static_FleurFairFallSettleNotify_descriptor.getNestedTypes().get(0);
    internal_static_FleurFairFallSettleNotify_SettleInfoMapEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_FleurFairFallSettleNotify_SettleInfoMapEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    io.grasscutter.proto.FleurFairFallSettleInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
