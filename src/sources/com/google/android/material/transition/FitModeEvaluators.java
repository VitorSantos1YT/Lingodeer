package com.google.android.material.transition;

import android.graphics.RectF;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
class FitModeEvaluators {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AnonymousClass1 f15906a = new FitModeEvaluator() { // from class: com.google.android.material.transition.FitModeEvaluators.1
        @Override // com.google.android.material.transition.FitModeEvaluator
        public final FitModeResult a(float f5, float f11, float f12, float f13, float f14, float f15, float f16) {
            float fD = TransitionUtils.d(f13, f15, f11, f12, f5, true);
            float f17 = fD / f13;
            float f18 = fD / f15;
            return new FitModeResult(f17, f18, fD, f14 * f17, fD, f16 * f18);
        }

        @Override // com.google.android.material.transition.FitModeEvaluator
        public final boolean b(FitModeResult fitModeResult) {
            return fitModeResult.f15911d > fitModeResult.f15913f;
        }

        @Override // com.google.android.material.transition.FitModeEvaluator
        public final void c(RectF rectF, float f5, FitModeResult fitModeResult) {
            rectF.bottom -= Math.abs(fitModeResult.f15913f - fitModeResult.f15911d) * f5;
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AnonymousClass2 f15907b = new FitModeEvaluator() { // from class: com.google.android.material.transition.FitModeEvaluators.2
        @Override // com.google.android.material.transition.FitModeEvaluator
        public final FitModeResult a(float f5, float f11, float f12, float f13, float f14, float f15, float f16) {
            float fD = TransitionUtils.d(f14, f16, f11, f12, f5, true);
            float f17 = fD / f14;
            float f18 = fD / f16;
            return new FitModeResult(f17, f18, f13 * f17, fD, f15 * f18, fD);
        }

        @Override // com.google.android.material.transition.FitModeEvaluator
        public final boolean b(FitModeResult fitModeResult) {
            return fitModeResult.f15910c > fitModeResult.f15912e;
        }

        @Override // com.google.android.material.transition.FitModeEvaluator
        public final void c(RectF rectF, float f5, FitModeResult fitModeResult) {
            float fAbs = (Math.abs(fitModeResult.f15912e - fitModeResult.f15910c) / 2.0f) * f5;
            rectF.left += fAbs;
            rectF.right -= fAbs;
        }
    };

    private FitModeEvaluators() {
    }
}
