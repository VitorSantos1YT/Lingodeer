package com.google.android.gms.internal.p002firebaseauthapi;

import b7.e0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzakb extends zzajf {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f10105b = zzank.f10226d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f10106a;

    public /* synthetic */ zzakb(int i11) {
        this();
    }

    public static int q(int i11, zzaje zzajeVar) {
        int iX = x(i11 << 3);
        int iD = zzajeVar.d();
        return e0.B(iD, iD, iX);
    }

    public static int u(long j11) {
        return (640 - (Long.numberOfLeadingZeros(j11) * 9)) >>> 6;
    }

    public static int v(int i11, int i12) {
        return x(i12) + x(i11 << 3);
    }

    public static int w(int i11) {
        return x(i11 << 3);
    }

    public static int x(int i11) {
        return (352 - (Integer.numberOfLeadingZeros(i11) * 9)) >>> 6;
    }

    public abstract int b();

    public abstract void c(byte b3);

    public abstract void d(int i11);

    public abstract void e(int i11, int i12);

    public abstract void f(int i11, long j11);

    public abstract void g(int i11, zzaje zzajeVar);

    public abstract void h(int i11, zzaly zzalyVar);

    public abstract void i(int i11, String str);

    public abstract void j(int i11, boolean z11);

    public abstract void k(long j11);

    public abstract void l(int i11);

    public abstract void m(int i11, int i12);

    public abstract void n(int i11, long j11);

    public abstract void o(int i11, zzaje zzajeVar);

    public abstract void p(long j11);

    public abstract void r(int i11);

    public abstract void s(int i11, int i12);

    public abstract void t(int i11, int i12);

    private zzakb() {
    }
}
