// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BrickBreakerStageType.proto

package emu.grasscutter.net.proto;

public final class BrickBreakerStageTypeOuterClass {
  private BrickBreakerStageTypeOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * <pre>
   * Obf: EDEDAHIPILO
   * </pre>
   *
   * Protobuf enum {@code BrickBreakerStageType}
   */
  public enum BrickBreakerStageType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>BRICK_BREAKER_STAGE_PREPARE = 0;</code>
     */
    BRICK_BREAKER_STAGE_PREPARE(0),
    /**
     * <code>BRICK_BREAKER_STAGE_PICK = 1;</code>
     */
    BRICK_BREAKER_STAGE_PICK(1),
    /**
     * <code>BRICK_BREAKER_STAGE_GAME = 2;</code>
     */
    BRICK_BREAKER_STAGE_GAME(2),
    /**
     * <code>BRICK_BREAKER_STAGE_PLAY = 3;</code>
     */
    BRICK_BREAKER_STAGE_PLAY(3),
    /**
     * <code>BRICK_BREAKER_STAGE_SETTLE = 4;</code>
     */
    BRICK_BREAKER_STAGE_SETTLE(4),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>BRICK_BREAKER_STAGE_PREPARE = 0;</code>
     */
    public static final int BRICK_BREAKER_STAGE_PREPARE_VALUE = 0;
    /**
     * <code>BRICK_BREAKER_STAGE_PICK = 1;</code>
     */
    public static final int BRICK_BREAKER_STAGE_PICK_VALUE = 1;
    /**
     * <code>BRICK_BREAKER_STAGE_GAME = 2;</code>
     */
    public static final int BRICK_BREAKER_STAGE_GAME_VALUE = 2;
    /**
     * <code>BRICK_BREAKER_STAGE_PLAY = 3;</code>
     */
    public static final int BRICK_BREAKER_STAGE_PLAY_VALUE = 3;
    /**
     * <code>BRICK_BREAKER_STAGE_SETTLE = 4;</code>
     */
    public static final int BRICK_BREAKER_STAGE_SETTLE_VALUE = 4;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static BrickBreakerStageType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static BrickBreakerStageType forNumber(int value) {
      switch (value) {
        case 0: return BRICK_BREAKER_STAGE_PREPARE;
        case 1: return BRICK_BREAKER_STAGE_PICK;
        case 2: return BRICK_BREAKER_STAGE_GAME;
        case 3: return BRICK_BREAKER_STAGE_PLAY;
        case 4: return BRICK_BREAKER_STAGE_SETTLE;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<BrickBreakerStageType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        BrickBreakerStageType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<BrickBreakerStageType>() {
            public BrickBreakerStageType findValueByNumber(int number) {
              return BrickBreakerStageType.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.BrickBreakerStageTypeOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final BrickBreakerStageType[] VALUES = values();

    public static BrickBreakerStageType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private BrickBreakerStageType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:BrickBreakerStageType)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033BrickBreakerStageType.proto*\262\001\n\025BrickB" +
      "reakerStageType\022\037\n\033BRICK_BREAKER_STAGE_P" +
      "REPARE\020\000\022\034\n\030BRICK_BREAKER_STAGE_PICK\020\001\022\034" +
      "\n\030BRICK_BREAKER_STAGE_GAME\020\002\022\034\n\030BRICK_BR" +
      "EAKER_STAGE_PLAY\020\003\022\036\n\032BRICK_BREAKER_STAG" +
      "E_SETTLE\020\004B\033\n\031emu.grasscutter.net.protob" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
