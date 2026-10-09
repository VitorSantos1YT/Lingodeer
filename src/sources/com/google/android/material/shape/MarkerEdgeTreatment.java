package com.google.android.material.shape;

import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class MarkerEdgeTreatment extends EdgeTreatment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f15195a;

    public MarkerEdgeTreatment(float f5) {
        this.f15195a = f5 - 0.001f;
    }

    @Override // com.google.android.material.shape.EdgeTreatment
    public final void c(float f5, float f11, float f12, ShapePath shapePath) {
        double d5 = this.f15195a;
        float fSqrt = (float) ((Math.sqrt(2.0d) * d5) / 2.0d);
        float fSqrt2 = (float) Math.sqrt(Math.pow(d5, 2.0d) - Math.pow(fSqrt, 2.0d));
        shapePath.f(f11 - fSqrt, ((float) (-((Math.sqrt(2.0d) * d5) - d5))) + fSqrt2, 270.0f, CropImageView.DEFAULT_ASPECT_RATIO);
        shapePath.d(f11, (float) (-((Math.sqrt(2.0d) * d5) - d5)));
        shapePath.d(f11 + fSqrt, ((float) (-((Math.sqrt(2.0d) * d5) - d5))) + fSqrt2);
    }
}
