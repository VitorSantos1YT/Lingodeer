package com.google.android.material.animation;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;
import hh.p0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class MatrixEvaluator implements TypeEvaluator<Matrix> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f13777a = new float[9];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float[] f13778b = new float[9];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Matrix f13779c = new Matrix();

    @Override // android.animation.TypeEvaluator
    /* JADX INFO: renamed from: a */
    public Matrix evaluate(float f5, Matrix matrix, Matrix matrix2) {
        float[] fArr = this.f13777a;
        matrix.getValues(fArr);
        float[] fArr2 = this.f13778b;
        matrix2.getValues(fArr2);
        for (int i11 = 0; i11 < 9; i11++) {
            float f11 = fArr2[i11];
            float f12 = fArr[i11];
            fArr2[i11] = p0.a(f11, f12, f5, f12);
        }
        Matrix matrix3 = this.f13779c;
        matrix3.setValues(fArr2);
        return matrix3;
    }
}
