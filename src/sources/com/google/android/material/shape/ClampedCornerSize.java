package com.google.android.material.shape;

import android.graphics.RectF;
import com.yalantis.ucrop.view.CropImageView;
import java.util.Arrays;
import ue.f;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class ClampedCornerSize implements CornerSize {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f15193a;

    public ClampedCornerSize(float f5) {
        this.f15193a = f5;
    }

    @Override // com.google.android.material.shape.CornerSize
    public final float a(RectF rectF) {
        return f.m(this.f15193a, CropImageView.DEFAULT_ASPECT_RATIO, Math.min(rectF.width() / 2.0f, rectF.height() / 2.0f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ClampedCornerSize) && this.f15193a == ((ClampedCornerSize) obj).f15193a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f15193a)});
    }
}
