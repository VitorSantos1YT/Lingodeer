package com.google.android.material.transition.platform;

import android.graphics.Path;
import android.graphics.PointF;
import android.transition.PathMotion;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class MaterialArcMotion extends PathMotion {
    @Override // android.transition.PathMotion
    public final Path getPath(float f5, float f11, float f12, float f13) {
        Path path = new Path();
        path.moveTo(f5, f11);
        PointF pointF = f11 > f13 ? new PointF(f12, f11) : new PointF(f5, f13);
        path.quadTo(pointF.x, pointF.y, f12, f13);
        return path;
    }
}
