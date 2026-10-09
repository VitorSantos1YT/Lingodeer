package com.google.android.material.motion;

import android.animation.TypeEvaluator;
import com.google.android.material.animation.AnimationUtils;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements TypeEvaluator {
    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f5, Object obj, Object obj2) {
        float[] fArr = (float[]) obj;
        float[] fArr2 = (float[]) obj2;
        return new float[]{AnimationUtils.a(fArr[0], fArr2[0], f5), AnimationUtils.a(fArr[1], fArr2[1], f5), AnimationUtils.a(fArr[2], fArr2[2], f5), AnimationUtils.a(fArr[3], fArr2[3], f5), AnimationUtils.a(fArr[4], fArr2[4], f5), AnimationUtils.a(fArr[5], fArr2[5], f5), AnimationUtils.a(fArr[6], fArr2[6], f5), AnimationUtils.a(fArr[7], fArr2[7], f5)};
    }
}
