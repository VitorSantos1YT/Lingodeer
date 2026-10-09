package com.google.firebase.inappmessaging;

import com.google.protobuf.Internal;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public enum DismissType implements Internal.EnumLite {
    UNKNOWN_DISMISS_TYPE(0),
    AUTO(1),
    CLICK(2),
    SWIPE(3);

    public static final int AUTO_VALUE = 1;
    public static final int CLICK_VALUE = 2;
    public static final int SWIPE_VALUE = 3;
    public static final int UNKNOWN_DISMISS_TYPE_VALUE = 0;
    private static final Internal.EnumLiteMap<DismissType> internalValueMap = new Internal.EnumLiteMap<DismissType>() { // from class: com.google.firebase.inappmessaging.DismissType.1
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final Internal.EnumLite a(int i11) {
            if (i11 == 0) {
                return DismissType.UNKNOWN_DISMISS_TYPE;
            }
            if (i11 == 1) {
                return DismissType.AUTO;
            }
            if (i11 == 2) {
                return DismissType.CLICK;
            }
            if (i11 == 3) {
                return DismissType.SWIPE;
            }
            DismissType dismissType = DismissType.UNKNOWN_DISMISS_TYPE;
            return null;
        }
    };
    private final int value;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class DismissTypeVerifier implements Internal.EnumVerifier {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Internal.EnumVerifier f19697a = new DismissTypeVerifier();

        private DismissTypeVerifier() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean a(int i11) {
            DismissType dismissType;
            if (i11 == 0) {
                dismissType = DismissType.UNKNOWN_DISMISS_TYPE;
            } else if (i11 == 1) {
                dismissType = DismissType.AUTO;
            } else if (i11 == 2) {
                dismissType = DismissType.CLICK;
            } else if (i11 != 3) {
                DismissType dismissType2 = DismissType.UNKNOWN_DISMISS_TYPE;
                dismissType = null;
            } else {
                dismissType = DismissType.SWIPE;
            }
            return dismissType != null;
        }
    }

    DismissType(int i11) {
        this.value = i11;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int d() {
        return this.value;
    }
}
