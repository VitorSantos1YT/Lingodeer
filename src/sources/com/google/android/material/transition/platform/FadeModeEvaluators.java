package com.google.android.material.transition.platform;

import hh.p0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
class FadeModeEvaluators {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AnonymousClass1 f15986a = new FadeModeEvaluator() { // from class: com.google.android.material.transition.platform.FadeModeEvaluators.1
        @Override // com.google.android.material.transition.platform.FadeModeEvaluator
        public final FadeModeResult a(float f5, float f11, float f12) {
            return new FadeModeResult(255, TransitionUtils.e(f11, f12, f5, 0, 255), true);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AnonymousClass2 f15987b = new FadeModeEvaluator() { // from class: com.google.android.material.transition.platform.FadeModeEvaluators.2
        @Override // com.google.android.material.transition.platform.FadeModeEvaluator
        public final FadeModeResult a(float f5, float f11, float f12) {
            return new FadeModeResult(TransitionUtils.e(f11, f12, f5, 255, 0), 255, false);
        }
    };

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.material.transition.platform.FadeModeEvaluators$1] */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.material.transition.platform.FadeModeEvaluators$2] */
    static {
        new FadeModeEvaluator() { // from class: com.google.android.material.transition.platform.FadeModeEvaluators.3
            @Override // com.google.android.material.transition.platform.FadeModeEvaluator
            public final FadeModeResult a(float f5, float f11, float f12) {
                return new FadeModeResult(TransitionUtils.e(f11, f12, f5, 255, 0), TransitionUtils.e(f11, f12, f5, 0, 255), false);
            }
        };
        new FadeModeEvaluator() { // from class: com.google.android.material.transition.platform.FadeModeEvaluators.4
            @Override // com.google.android.material.transition.platform.FadeModeEvaluator
            public final FadeModeResult a(float f5, float f11, float f12) {
                float fA = p0.a(f12, f11, 0.35f, f11);
                return new FadeModeResult(TransitionUtils.e(f11, fA, f5, 255, 0), TransitionUtils.e(fA, f12, f5, 0, 255), false);
            }
        };
    }

    private FadeModeEvaluators() {
    }
}
