package com.google.android.gms.measurement.internal;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzkr implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f13285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzlj f13286b;

    public zzkr(zzlj zzljVar, AtomicReference atomicReference) {
        this.f13285a = atomicReference;
        Objects.requireNonNull(zzljVar);
        this.f13286b = zzljVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference = this.f13285a;
        synchronized (atomicReference) {
            try {
                try {
                    zzic zzicVar = this.f13286b.f13202a;
                    atomicReference.set(Double.valueOf(zzicVar.f13097d.q(zzicVar.r().m(), zzfy.f12849e0)));
                    this.f13285a.notify();
                } catch (Throwable th2) {
                    this.f13285a.notify();
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
