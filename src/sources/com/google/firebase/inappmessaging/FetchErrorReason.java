package com.google.firebase.inappmessaging;

import com.google.protobuf.Internal;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public enum FetchErrorReason implements Internal.EnumLite {
    UNSPECIFIED_FETCH_ERROR(0),
    SERVER_ERROR(1),
    CLIENT_ERROR(2),
    NETWORK_ERROR(3);

    public static final int CLIENT_ERROR_VALUE = 2;
    public static final int NETWORK_ERROR_VALUE = 3;
    public static final int SERVER_ERROR_VALUE = 1;
    public static final int UNSPECIFIED_FETCH_ERROR_VALUE = 0;
    private static final Internal.EnumLiteMap<FetchErrorReason> internalValueMap = new Internal.EnumLiteMap<FetchErrorReason>() { // from class: com.google.firebase.inappmessaging.FetchErrorReason.1
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final Internal.EnumLite a(int i11) {
            if (i11 == 0) {
                return FetchErrorReason.UNSPECIFIED_FETCH_ERROR;
            }
            if (i11 == 1) {
                return FetchErrorReason.SERVER_ERROR;
            }
            if (i11 == 2) {
                return FetchErrorReason.CLIENT_ERROR;
            }
            if (i11 == 3) {
                return FetchErrorReason.NETWORK_ERROR;
            }
            FetchErrorReason fetchErrorReason = FetchErrorReason.UNSPECIFIED_FETCH_ERROR;
            return null;
        }
    };
    private final int value;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class FetchErrorReasonVerifier implements Internal.EnumVerifier {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Internal.EnumVerifier f19700a = new FetchErrorReasonVerifier();

        private FetchErrorReasonVerifier() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean a(int i11) {
            FetchErrorReason fetchErrorReason;
            if (i11 == 0) {
                fetchErrorReason = FetchErrorReason.UNSPECIFIED_FETCH_ERROR;
            } else if (i11 == 1) {
                fetchErrorReason = FetchErrorReason.SERVER_ERROR;
            } else if (i11 == 2) {
                fetchErrorReason = FetchErrorReason.CLIENT_ERROR;
            } else if (i11 != 3) {
                FetchErrorReason fetchErrorReason2 = FetchErrorReason.UNSPECIFIED_FETCH_ERROR;
                fetchErrorReason = null;
            } else {
                fetchErrorReason = FetchErrorReason.NETWORK_ERROR;
            }
            return fetchErrorReason != null;
        }
    }

    FetchErrorReason(int i11) {
        this.value = i11;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int d() {
        return this.value;
    }
}
