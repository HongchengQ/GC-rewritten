// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DIIHAAGDDJK.proto

package emu.grasscutter.net.proto;

public final class DIIHAAGDDJKOuterClass {
  private DIIHAAGDDJKOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code DIIHAAGDDJK}
   */
  public enum DIIHAAGDDJK
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>DIIHAAGDDJK_WispCageStateNotExist = 0;</code>
     */
    DIIHAAGDDJK_WispCageStateNotExist(0),
    /**
     * <code>DIIHAAGDDJK_WispCageStateCreated = 1;</code>
     */
    DIIHAAGDDJK_WispCageStateCreated(1),
    /**
     * <code>DIIHAAGDDJK_WispCageStateMaterialDelivered = 2;</code>
     */
    DIIHAAGDDJK_WispCageStateMaterialDelivered(2),
    /**
     * <code>DIIHAAGDDJK_WispCageStateNotTakeReward = 3;</code>
     */
    DIIHAAGDDJK_WispCageStateNotTakeReward(3),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>DIIHAAGDDJK_WispCageStateNotExist = 0;</code>
     */
    public static final int DIIHAAGDDJK_WispCageStateNotExist_VALUE = 0;
    /**
     * <code>DIIHAAGDDJK_WispCageStateCreated = 1;</code>
     */
    public static final int DIIHAAGDDJK_WispCageStateCreated_VALUE = 1;
    /**
     * <code>DIIHAAGDDJK_WispCageStateMaterialDelivered = 2;</code>
     */
    public static final int DIIHAAGDDJK_WispCageStateMaterialDelivered_VALUE = 2;
    /**
     * <code>DIIHAAGDDJK_WispCageStateNotTakeReward = 3;</code>
     */
    public static final int DIIHAAGDDJK_WispCageStateNotTakeReward_VALUE = 3;


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
    public static DIIHAAGDDJK valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static DIIHAAGDDJK forNumber(int value) {
      switch (value) {
        case 0: return DIIHAAGDDJK_WispCageStateNotExist;
        case 1: return DIIHAAGDDJK_WispCageStateCreated;
        case 2: return DIIHAAGDDJK_WispCageStateMaterialDelivered;
        case 3: return DIIHAAGDDJK_WispCageStateNotTakeReward;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<DIIHAAGDDJK>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        DIIHAAGDDJK> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<DIIHAAGDDJK>() {
            public DIIHAAGDDJK findValueByNumber(int number) {
              return DIIHAAGDDJK.forNumber(number);
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
      return emu.grasscutter.net.proto.DIIHAAGDDJKOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final DIIHAAGDDJK[] VALUES = values();

    public static DIIHAAGDDJK valueOf(
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

    private DIIHAAGDDJK(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:DIIHAAGDDJK)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021DIIHAAGDDJK.proto*\266\001\n\013DIIHAAGDDJK\022%\n!D" +
      "IIHAAGDDJK_WispCageStateNotExist\020\000\022$\n DI" +
      "IHAAGDDJK_WispCageStateCreated\020\001\022.\n*DIIH" +
      "AAGDDJK_WispCageStateMaterialDelivered\020\002" +
      "\022*\n&DIIHAAGDDJK_WispCageStateNotTakeRewa" +
      "rd\020\003B\033\n\031emu.grasscutter.net.protob\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
