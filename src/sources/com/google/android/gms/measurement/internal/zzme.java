package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzme extends zzgd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f13399a;

    public zzme(zznl zznlVar, AtomicReference atomicReference) {
        this.f13399a = atomicReference;
    }

    @Override // com.google.android.gms.measurement.internal.zzge
    public final void Q0(List list) {
        AtomicReference atomicReference = this.f13399a;
        synchronized (atomicReference) {
            atomicReference.set(list);
            atomicReference.notifyAll();
        }
    }
}
