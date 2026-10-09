package com.google.android.gms.internal.play_billing;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzj extends zzd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f12469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f12470b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f12471c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f12472d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f12473e;

    public zzj(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f12469a = atomicReferenceFieldUpdater;
        this.f12470b = atomicReferenceFieldUpdater2;
        this.f12471c = atomicReferenceFieldUpdater3;
        this.f12472d = atomicReferenceFieldUpdater4;
        this.f12473e = atomicReferenceFieldUpdater5;
    }

    @Override // com.google.android.gms.internal.play_billing.zzd
    public final void a(zzm zzmVar, zzm zzmVar2) {
        this.f12470b.lazySet(zzmVar, zzmVar2);
    }

    @Override // com.google.android.gms.internal.play_billing.zzd
    public final void b(zzm zzmVar, Thread thread) {
        this.f12469a.lazySet(zzmVar, thread);
    }

    @Override // com.google.android.gms.internal.play_billing.zzd
    public final boolean c(zzo zzoVar, zzh zzhVar, zzh zzhVar2) {
        return zzi.a(this.f12472d, zzoVar, zzhVar, zzhVar2);
    }

    @Override // com.google.android.gms.internal.play_billing.zzd
    public final boolean d(zzo zzoVar, Object obj, Object obj2) {
        return zzi.a(this.f12473e, zzoVar, obj, obj2);
    }

    @Override // com.google.android.gms.internal.play_billing.zzd
    public final boolean e(zzo zzoVar, zzm zzmVar, zzm zzmVar2) {
        return zzi.a(this.f12471c, zzoVar, zzmVar, zzmVar2);
    }
}
