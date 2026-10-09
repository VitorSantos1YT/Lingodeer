package com.google.android.gms.common;

import com.google.android.gms.internal.common.zzah;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzaa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f9147a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f9148b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public zzah f9149c = zzah.m();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public zzah f9150d = zzah.m();

    public final void a() {
        if (this.f9147a == null) {
            throw new IllegalStateException("packageName must be defined");
        }
        if (this.f9148b < 0) {
            throw new IllegalStateException("minimumStampedVersionNumber must be greater than or equal to 0");
        }
        if (this.f9149c.isEmpty() && this.f9150d.isEmpty()) {
            throw new IllegalStateException("Either orderedTestCerts or orderedProdCerts must have at least one cert");
        }
    }
}
