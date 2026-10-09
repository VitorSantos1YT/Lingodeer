package com.google.android.material.shape;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class OffsetEdgeTreatment extends EdgeTreatment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MarkerEdgeTreatment f15241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f15242b;

    public OffsetEdgeTreatment(MarkerEdgeTreatment markerEdgeTreatment, float f5) {
        this.f15241a = markerEdgeTreatment;
        this.f15242b = f5;
    }

    @Override // com.google.android.material.shape.EdgeTreatment
    public final boolean a() {
        this.f15241a.getClass();
        return true;
    }

    @Override // com.google.android.material.shape.EdgeTreatment
    public final void c(float f5, float f11, float f12, ShapePath shapePath) {
        this.f15241a.c(f5, f11 - this.f15242b, f12, shapePath);
    }
}
