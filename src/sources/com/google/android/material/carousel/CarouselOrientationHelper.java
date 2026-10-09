package com.google.android.material.carousel;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
abstract class CarouselOrientationHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14151a;

    public CarouselOrientationHelper(int i11) {
        this.f14151a = i11;
    }

    public abstract void a(RectF rectF, RectF rectF2, RectF rectF3);

    public abstract RectF b(float f5, float f11, float f12, float f13);

    public abstract int c();

    public abstract int d();

    public abstract int e();

    public abstract int f();

    public abstract int g();

    public abstract void h(View view, int i11, int i12);

    public abstract void i(RectF rectF, RectF rectF2, RectF rectF3);

    public abstract void j(View view, Rect rect, float f5, float f11);
}
