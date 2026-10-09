package com.google.android.material.shape;

import android.graphics.RectF;
import java.util.Arrays;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class AbsoluteCornerSize implements CornerSize {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f15190a;

    public AbsoluteCornerSize(float f5) {
        this.f15190a = f5;
    }

    @Override // com.google.android.material.shape.CornerSize
    public final float a(RectF rectF) {
        return this.f15190a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AbsoluteCornerSize) && this.f15190a == ((AbsoluteCornerSize) obj).f15190a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f15190a)});
    }

    public final String toString() {
        return p.h(this.f15190a, "px", new StringBuilder());
    }
}
