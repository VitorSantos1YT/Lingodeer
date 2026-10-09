package com.google.android.gms.internal.auth;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
abstract class zzhi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Unsafe f9569a;

    public zzhi(Unsafe unsafe) {
        this.f9569a = unsafe;
    }

    public abstract double a(Object obj, long j11);

    public abstract float b(Object obj, long j11);

    public abstract void c(Object obj, long j11, boolean z11);

    public abstract void d(Object obj, long j11, double d5);

    public abstract void e(Object obj, long j11, float f5);

    public abstract boolean f(long j11, Object obj);
}
