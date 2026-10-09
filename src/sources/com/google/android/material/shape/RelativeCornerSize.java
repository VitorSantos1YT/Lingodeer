package com.google.android.material.shape;

import android.graphics.RectF;
import hh.p0;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class RelativeCornerSize implements CornerSize {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f15243a;

    public RelativeCornerSize(float f5) {
        this.f15243a = f5;
    }

    @Override // com.google.android.material.shape.CornerSize
    public final float a(RectF rectF) {
        return Math.min(rectF.width(), rectF.height()) * this.f15243a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RelativeCornerSize) && this.f15243a == ((RelativeCornerSize) obj).f15243a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f15243a)});
    }

    public final String toString() {
        return p0.i((int) (this.f15243a * 100.0f), "%", new StringBuilder());
    }
}
