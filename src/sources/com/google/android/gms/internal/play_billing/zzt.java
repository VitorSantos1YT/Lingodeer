package com.google.android.gms.internal.play_billing;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzt implements zzcz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f12490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzo f12491b = new zzs(this);

    public zzt(zzp zzpVar) {
        this.f12490a = new WeakReference(zzpVar);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z11) {
        zzp zzpVar = (zzp) this.f12490a.get();
        boolean zCancel = this.f12491b.cancel(z11);
        if (!zCancel || zzpVar == null) {
            return zCancel;
        }
        zzpVar.f12486a = null;
        zzpVar.f12487b = null;
        zzpVar.f12488c.g(null);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f12491b.get();
    }

    @Override // com.google.android.gms.internal.play_billing.zzcz
    public final void h0(Runnable runnable, Executor executor) {
        this.f12491b.h0(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f12491b.f12483a instanceof zze;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f12491b.isDone();
    }

    public final String toString() {
        return this.f12491b.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j11, TimeUnit timeUnit) {
        return this.f12491b.get(j11, timeUnit);
    }
}
