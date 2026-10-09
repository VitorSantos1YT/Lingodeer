package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzmf extends zzgg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f13400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zznl f13401b;

    public zzmf(zznl zznlVar, AtomicReference atomicReference) {
        this.f13400a = atomicReference;
        this.f13401b = zznlVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzgh
    public final void J0(zzoq zzoqVar) {
        AtomicReference atomicReference = this.f13400a;
        synchronized (atomicReference) {
            zzgu zzguVar = this.f13401b.f13202a.f13099f;
            zzic.m(zzguVar);
            zzguVar.f12949n.b(Integer.valueOf(zzoqVar.f13561a.size()), "[sgtm] Got upload batches from service. count");
            atomicReference.set(zzoqVar);
            atomicReference.notifyAll();
        }
    }
}
