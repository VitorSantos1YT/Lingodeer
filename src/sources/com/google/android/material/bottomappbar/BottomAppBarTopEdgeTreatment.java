package com.google.android.material.bottomappbar;

import com.google.android.material.shape.EdgeTreatment;
import com.google.android.material.shape.ShapePath;
import com.yalantis.ucrop.view.CropImageView;
import hh.p0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class BottomAppBarTopEdgeTreatment extends EdgeTreatment implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f13962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f13963b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f13964c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f13965d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f13966e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f13967f;

    @Override // com.google.android.material.shape.EdgeTreatment
    public final void c(float f5, float f11, float f12, ShapePath shapePath) {
        float f13;
        float f14;
        float f15 = this.f13964c;
        if (f15 == CropImageView.DEFAULT_ASPECT_RATIO) {
            shapePath.d(f5, CropImageView.DEFAULT_ASPECT_RATIO);
            return;
        }
        float f16 = ((this.f13963b * 2.0f) + f15) / 2.0f;
        float f17 = f12 * this.f13962a;
        float f18 = f11 + this.f13966e;
        float fA = p0.a(1.0f, f12, f16, this.f13965d * f12);
        if (fA / f16 >= 1.0f) {
            shapePath.d(f5, CropImageView.DEFAULT_ASPECT_RATIO);
            return;
        }
        float f19 = this.f13967f;
        float f21 = f19 * f12;
        boolean z11 = f19 == -1.0f || Math.abs((f19 * 2.0f) - f15) < 0.1f;
        if (z11) {
            f13 = fA;
            f14 = 0.0f;
        } else {
            f14 = 1.75f;
            f13 = 0.0f;
        }
        float f22 = f16 + f17;
        float f23 = f13 + f17;
        float fSqrt = (float) Math.sqrt((f22 * f22) - (f23 * f23));
        float f24 = f18 - fSqrt;
        float f25 = f18 + fSqrt;
        float degrees = (float) Math.toDegrees(Math.atan(fSqrt / f23));
        float f26 = (90.0f - degrees) + f14;
        shapePath.d(f24, CropImageView.DEFAULT_ASPECT_RATIO);
        float f27 = f24 - f17;
        float f28 = f24 + f17;
        float f29 = f17 * 2.0f;
        shapePath.a(f27, CropImageView.DEFAULT_ASPECT_RATIO, f28, f29, 270.0f, degrees);
        if (z11) {
            shapePath.a(f18 - f16, (-f16) - f13, f18 + f16, f16 - f13, 180.0f - f26, (f26 * 2.0f) - 180.0f);
        } else {
            float f30 = this.f13963b;
            float f31 = f21 * 2.0f;
            float f32 = f30 + f31;
            float f33 = f18 - f16;
            shapePath.a(f33, -(f21 + f30), f32 + f33, f30 + f21, 180.0f - f26, ((f26 * 2.0f) - 180.0f) / 2.0f);
            float f34 = f18 + f16;
            float f35 = this.f13963b;
            shapePath.d(f34 - ((f35 / 2.0f) + f21), f35 + f21);
            float f36 = this.f13963b;
            shapePath.a(f34 - (f31 + f36), -(f21 + f36), f34, f36 + f21, 90.0f, f26 - 90.0f);
        }
        shapePath.a(f25 - f17, CropImageView.DEFAULT_ASPECT_RATIO, f25 + f17, f29, 270.0f - degrees, degrees);
        shapePath.d(f5, CropImageView.DEFAULT_ASPECT_RATIO);
    }

    public final void d(float f5) {
        if (f5 < CropImageView.DEFAULT_ASPECT_RATIO) {
            throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
        }
        this.f13965d = f5;
    }
}
