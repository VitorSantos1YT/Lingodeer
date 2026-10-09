package com.google.android.material.shape;

import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class RoundedCornerTreatment extends CornerTreatment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f15244a = -1.0f;

    @Override // com.google.android.material.shape.CornerTreatment
    public final void a(ShapePath shapePath, float f5, float f11) {
        float f12 = f11 * f5;
        shapePath.f(CropImageView.DEFAULT_ASPECT_RATIO, f12, 180.0f, 90.0f);
        float f13 = f12 * 2.0f;
        shapePath.a(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, f13, f13, 180.0f, 90.0f);
    }
}
