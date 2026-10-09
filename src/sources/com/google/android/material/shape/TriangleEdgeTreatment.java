package com.google.android.material.shape;

import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class TriangleEdgeTreatment extends EdgeTreatment {
    @Override // com.google.android.material.shape.EdgeTreatment
    public final void c(float f5, float f11, float f12, ShapePath shapePath) {
        float f13 = CropImageView.DEFAULT_ASPECT_RATIO * f12;
        shapePath.e(f11 - f13, f11, (-0.0f) * f12);
        shapePath.e(f11 + f13, f5, CropImageView.DEFAULT_ASPECT_RATIO);
    }
}
