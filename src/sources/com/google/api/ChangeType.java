package com.google.api;

import com.google.protobuf.Internal;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public enum ChangeType implements Internal.EnumLite {
    CHANGE_TYPE_UNSPECIFIED(0),
    ADDED(1),
    REMOVED(2),
    MODIFIED(3),
    UNRECOGNIZED(-1);

    public static final int ADDED_VALUE = 1;
    public static final int CHANGE_TYPE_UNSPECIFIED_VALUE = 0;
    public static final int MODIFIED_VALUE = 3;
    public static final int REMOVED_VALUE = 2;
    private static final Internal.EnumLiteMap<ChangeType> internalValueMap = new Internal.EnumLiteMap<ChangeType>() { // from class: com.google.api.ChangeType.1
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final Internal.EnumLite a(int i11) {
            if (i11 == 0) {
                return ChangeType.CHANGE_TYPE_UNSPECIFIED;
            }
            if (i11 == 1) {
                return ChangeType.ADDED;
            }
            if (i11 == 2) {
                return ChangeType.REMOVED;
            }
            if (i11 == 3) {
                return ChangeType.MODIFIED;
            }
            ChangeType changeType = ChangeType.CHANGE_TYPE_UNSPECIFIED;
            return null;
        }
    };
    private final int value;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class ChangeTypeVerifier implements Internal.EnumVerifier {
        static {
            new ChangeTypeVerifier();
        }

        private ChangeTypeVerifier() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean a(int i11) {
            ChangeType changeType;
            if (i11 == 0) {
                changeType = ChangeType.CHANGE_TYPE_UNSPECIFIED;
            } else if (i11 == 1) {
                changeType = ChangeType.ADDED;
            } else if (i11 == 2) {
                changeType = ChangeType.REMOVED;
            } else if (i11 != 3) {
                ChangeType changeType2 = ChangeType.CHANGE_TYPE_UNSPECIFIED;
                changeType = null;
            } else {
                changeType = ChangeType.MODIFIED;
            }
            return changeType != null;
        }
    }

    ChangeType(int i11) {
        this.value = i11;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int d() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
