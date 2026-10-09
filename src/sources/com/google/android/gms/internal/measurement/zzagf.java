package com.google.android.gms.internal.measurement;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
abstract class zzagf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Unsafe f11351a;

    public zzagf(Unsafe unsafe) {
        this.f11351a = unsafe;
    }

    public abstract void a(Object obj, long j11, byte b3);

    public abstract boolean b(long j11, Object obj);

    public abstract void c(Object obj, long j11, boolean z11);

    public abstract float d(long j11, Object obj);

    public abstract void e(Object obj, long j11, float f5);

    public abstract double f(long j11, Object obj);

    public abstract void g(Object obj, long j11, double d5);
}
