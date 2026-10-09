package com.google.android.gms.internal.measurement;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzyt extends zzyq {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final zzyf f12191d = new zzyr();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ThreadLocal f12192e = new zzys();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicInteger f12193c = new AtomicInteger();

    @Override // com.google.android.gms.internal.measurement.zzyq
    public final void a() {
        this.f12193c.decrementAndGet();
    }
}
