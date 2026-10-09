package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzake implements zzanw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzakb f10111a;

    public zzake(zzakb zzakbVar) {
        byte[] bArr = zzakw.f10134a;
        if (zzakbVar == null) {
            throw new NullPointerException("output");
        }
        this.f10111a = zzakbVar;
        zzakbVar.f10106a = this;
    }

    public final void a(int i11, double d5) {
        zzakb zzakbVar = this.f10111a;
        zzakbVar.getClass();
        zzakbVar.f(i11, Double.doubleToRawLongBits(d5));
    }

    public final void b(int i11, float f5) {
        zzakb zzakbVar = this.f10111a;
        zzakbVar.getClass();
        zzakbVar.e(i11, Float.floatToRawIntBits(f5));
    }

    public final void c(int i11, int i12) {
        this.f10111a.m(i11, i12);
    }

    public final void d(int i11, long j11) {
        this.f10111a.f(i11, j11);
    }

    public final void e(int i11, zzaje zzajeVar) {
        this.f10111a.g(i11, zzajeVar);
    }

    public final void f(int i11, Object obj, zzamr zzamrVar) {
        zzakb zzakbVar = this.f10111a;
        zzakbVar.s(i11, 3);
        zzamrVar.e((zzaix) obj, this);
        zzakbVar.s(i11, 4);
    }

    public final void g(int i11, boolean z11) {
        this.f10111a.j(i11, z11);
    }

    public final void h(int i11, int i12) {
        this.f10111a.e(i11, i12);
    }

    public final void i(int i11, long j11) {
        this.f10111a.n(i11, j11);
    }

    public final void j(int i11, Object obj, zzamr zzamrVar) {
        zzaix zzaixVar = (zzaix) obj;
        zzakb zzakbVar = this.f10111a;
        zzakbVar.s(i11, 2);
        zzakbVar.r(zzaixVar.b(zzamrVar));
        zzamrVar.e(zzaixVar, this);
    }

    public final void k(int i11, int i12) {
        this.f10111a.m(i11, i12);
    }

    public final void l(int i11, long j11) {
        this.f10111a.f(i11, j11);
    }

    public final void m(int i11, int i12) {
        this.f10111a.e(i11, i12);
    }

    public final void n(int i11, long j11) {
        this.f10111a.n(i11, (j11 >> 63) ^ (j11 << 1));
    }

    public final void o(int i11, int i12) {
        this.f10111a.t(i11, (i12 >> 31) ^ (i12 << 1));
    }

    public final void p(int i11, long j11) {
        this.f10111a.n(i11, j11);
    }

    public final void q(int i11, int i12) {
        this.f10111a.t(i11, i12);
    }
}
