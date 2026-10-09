package com.google.android.material.internal;

import android.animation.TypeEvaluator;
import android.graphics.Rect;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class RectEvaluator implements TypeEvaluator<Rect> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rect f14708a;

    public RectEvaluator(Rect rect) {
        this.f14708a = rect;
    }

    @Override // android.animation.TypeEvaluator
    public final Rect evaluate(float f5, Rect rect, Rect rect2) {
        Rect rect3 = rect;
        Rect rect4 = rect2;
        int i11 = rect3.left;
        int i12 = i11 + ((int) ((rect4.left - i11) * f5));
        int i13 = rect3.top;
        int i14 = i13 + ((int) ((rect4.top - i13) * f5));
        int i15 = rect3.right;
        int i16 = i15 + ((int) ((rect4.right - i15) * f5));
        int i17 = rect3.bottom;
        int i18 = i17 + ((int) ((rect4.bottom - i17) * f5));
        Rect rect5 = this.f14708a;
        rect5.set(i12, i14, i16, i18);
        return rect5;
    }
}
