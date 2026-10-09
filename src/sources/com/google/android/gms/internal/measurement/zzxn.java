package com.google.android.gms.internal.measurement;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzxn extends zzyq {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final zzyf f12148d = new zzxl();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicLong f12149c = new AtomicLong(-1);

    @Override // com.google.android.gms.internal.measurement.zzyq
    public final void a() {
        AtomicLong atomicLong = this.f12149c;
        atomicLong.set(Math.max(-atomicLong.get(), 0L));
    }
}
