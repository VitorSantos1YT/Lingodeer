package com.google.android.material.shape;

import android.graphics.RectF;
import com.yalantis.ucrop.view.CropImageView;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class AdjustedCornerSize implements CornerSize {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CornerSize f15191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f15192b;

    public AdjustedCornerSize(float f5, CornerSize cornerSize) {
        while (cornerSize instanceof AdjustedCornerSize) {
            cornerSize = ((AdjustedCornerSize) cornerSize).f15191a;
            f5 += ((AdjustedCornerSize) cornerSize).f15192b;
        }
        this.f15191a = cornerSize;
        this.f15192b = f5;
    }

    @Override // com.google.android.material.shape.CornerSize
    public final float a(RectF rectF) {
        return Math.max(CropImageView.DEFAULT_ASPECT_RATIO, this.f15191a.a(rectF) + this.f15192b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdjustedCornerSize)) {
            return false;
        }
        AdjustedCornerSize adjustedCornerSize = (AdjustedCornerSize) obj;
        return this.f15191a.equals(adjustedCornerSize.f15191a) && this.f15192b == adjustedCornerSize.f15192b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f15191a, Float.valueOf(this.f15192b)});
    }
}
