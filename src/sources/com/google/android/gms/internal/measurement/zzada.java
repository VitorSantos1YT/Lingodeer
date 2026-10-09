package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzada extends zzacj {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f11245b = zzagg.f11355d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f11246a;

    private zzada() {
        throw null;
    }

    public static int b(int i11) {
        return (352 - (Integer.numberOfLeadingZeros(i11) * 9)) >>> 6;
    }

    public static int c(long j11) {
        return (640 - (Long.numberOfLeadingZeros(j11) * 9)) >>> 6;
    }

    public static int d(zzafc zzafcVar) {
        int iH = zzafcVar.h();
        return b(iH) + iH;
    }

    public abstract int A();

    public final void e() {
        if (A() > 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
        if (A() < 0) {
            throw new IllegalStateException("Wrote more data than expected.");
        }
    }

    public abstract void f(int i11, int i12);

    public abstract void g(int i11, int i12);

    public abstract void h(int i11, int i12);

    public abstract void i(int i11, int i12);

    public abstract void j(int i11, long j11);

    public abstract void k(int i11, long j11);

    public abstract void l(int i11, boolean z11);

    public abstract void m(int i11, String str);

    public abstract void n(int i11, zzacr zzacrVar);

    public abstract void o(zzacr zzacrVar);

    public abstract void p(byte[] bArr, int i11);

    public abstract void q(int i11, zzafc zzafcVar);

    public abstract void r(int i11, zzacr zzacrVar);

    public abstract void s(zzafc zzafcVar);

    public abstract void t(byte b3);

    public abstract void u(int i11);

    public abstract void v(int i11);

    public abstract void w(int i11);

    public abstract void x(long j11);

    public abstract void y(long j11);

    public abstract void z(String str);
}
