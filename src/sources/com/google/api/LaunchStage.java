package com.google.api;

import com.google.protobuf.Internal;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public enum LaunchStage implements Internal.EnumLite {
    LAUNCH_STAGE_UNSPECIFIED(0),
    EARLY_ACCESS(1),
    ALPHA(2),
    BETA(3),
    GA(4),
    DEPRECATED(5),
    UNRECOGNIZED(-1);

    public static final int ALPHA_VALUE = 2;
    public static final int BETA_VALUE = 3;
    public static final int DEPRECATED_VALUE = 5;
    public static final int EARLY_ACCESS_VALUE = 1;
    public static final int GA_VALUE = 4;
    public static final int LAUNCH_STAGE_UNSPECIFIED_VALUE = 0;
    private static final Internal.EnumLiteMap<LaunchStage> internalValueMap = new Internal.EnumLiteMap<LaunchStage>() { // from class: com.google.api.LaunchStage.1
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final Internal.EnumLite a(int i11) {
            return LaunchStage.a(i11);
        }
    };
    private final int value;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class LaunchStageVerifier implements Internal.EnumVerifier {
        static {
            new LaunchStageVerifier();
        }

        private LaunchStageVerifier() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean a(int i11) {
            return LaunchStage.a(i11) != null;
        }
    }

    LaunchStage(int i11) {
        this.value = i11;
    }

    public static LaunchStage a(int i11) {
        if (i11 == 0) {
            return LAUNCH_STAGE_UNSPECIFIED;
        }
        if (i11 == 1) {
            return EARLY_ACCESS;
        }
        if (i11 == 2) {
            return ALPHA;
        }
        if (i11 == 3) {
            return BETA;
        }
        if (i11 == 4) {
            return GA;
        }
        if (i11 != 5) {
            return null;
        }
        return DEPRECATED;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int d() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
