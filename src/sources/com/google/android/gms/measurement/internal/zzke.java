package com.google.android.gms.measurement.internal;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzke implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f13258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzlj f13259b;

    public zzke(zzlj zzljVar, AtomicReference atomicReference) {
        this.f13258a = atomicReference;
        Objects.requireNonNull(zzljVar);
        this.f13259b = zzljVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference = this.f13258a;
        synchronized (atomicReference) {
            try {
                try {
                    zzic zzicVar = this.f13259b.f13202a;
                    atomicReference.set(Boolean.valueOf(zzicVar.f13097d.r(zzicVar.r().m(), zzfy.f12837a0)));
                    this.f13258a.notify();
                } catch (Throwable th2) {
                    this.f13258a.notify();
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
