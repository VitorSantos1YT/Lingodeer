package com.google.zxing;

import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class ResultPoint {
    public final boolean equals(Object obj) {
        return obj instanceof ResultPoint;
    }

    public final int hashCode() {
        return Float.floatToIntBits(CropImageView.DEFAULT_ASPECT_RATIO) + (Float.floatToIntBits(CropImageView.DEFAULT_ASPECT_RATIO) * 31);
    }

    public final String toString() {
        return "(0.0,0.0)";
    }
}
