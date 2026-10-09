package com.google.firebase.inappmessaging;

import com.google.protobuf.Internal;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public enum RenderErrorReason implements Internal.EnumLite {
    UNSPECIFIED_RENDER_ERROR(0),
    IMAGE_FETCH_ERROR(1),
    IMAGE_DISPLAY_ERROR(2),
    IMAGE_UNSUPPORTED_FORMAT(3);

    public static final int IMAGE_DISPLAY_ERROR_VALUE = 2;
    public static final int IMAGE_FETCH_ERROR_VALUE = 1;
    public static final int IMAGE_UNSUPPORTED_FORMAT_VALUE = 3;
    public static final int UNSPECIFIED_RENDER_ERROR_VALUE = 0;
    private static final Internal.EnumLiteMap<RenderErrorReason> internalValueMap = new Internal.EnumLiteMap<RenderErrorReason>() { // from class: com.google.firebase.inappmessaging.RenderErrorReason.1
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final Internal.EnumLite a(int i11) {
            if (i11 == 0) {
                return RenderErrorReason.UNSPECIFIED_RENDER_ERROR;
            }
            if (i11 == 1) {
                return RenderErrorReason.IMAGE_FETCH_ERROR;
            }
            if (i11 == 2) {
                return RenderErrorReason.IMAGE_DISPLAY_ERROR;
            }
            if (i11 == 3) {
                return RenderErrorReason.IMAGE_UNSUPPORTED_FORMAT;
            }
            RenderErrorReason renderErrorReason = RenderErrorReason.UNSPECIFIED_RENDER_ERROR;
            return null;
        }
    };
    private final int value;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class RenderErrorReasonVerifier implements Internal.EnumVerifier {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Internal.EnumVerifier f19714a = new RenderErrorReasonVerifier();

        private RenderErrorReasonVerifier() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean a(int i11) {
            RenderErrorReason renderErrorReason;
            if (i11 == 0) {
                renderErrorReason = RenderErrorReason.UNSPECIFIED_RENDER_ERROR;
            } else if (i11 == 1) {
                renderErrorReason = RenderErrorReason.IMAGE_FETCH_ERROR;
            } else if (i11 == 2) {
                renderErrorReason = RenderErrorReason.IMAGE_DISPLAY_ERROR;
            } else if (i11 != 3) {
                RenderErrorReason renderErrorReason2 = RenderErrorReason.UNSPECIFIED_RENDER_ERROR;
                renderErrorReason = null;
            } else {
                renderErrorReason = RenderErrorReason.IMAGE_UNSUPPORTED_FORMAT;
            }
            return renderErrorReason != null;
        }
    }

    RenderErrorReason(int i11) {
        this.value = i11;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int d() {
        return this.value;
    }
}
