package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzadb implements zzago {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzada f11247a;

    public zzadb(zzada zzadaVar) {
        this.f11247a = zzadaVar;
        zzadaVar.f11246a = this;
    }

    public final void a(int i11, List list) {
        boolean z11 = list instanceof zzaen;
        int i12 = 0;
        zzada zzadaVar = this.f11247a;
        if (!z11) {
            while (i12 < list.size()) {
                zzadaVar.m(i11, (String) list.get(i12));
                i12++;
            }
            return;
        }
        zzaen zzaenVar = (zzaen) list;
        while (i12 < list.size()) {
            Object objZzc = zzaenVar.zzc();
            if (objZzc instanceof String) {
                zzadaVar.m(i11, (String) objZzc);
            } else {
                zzadaVar.n(i11, (zzacr) objZzc);
            }
            i12++;
        }
    }

    public final void b(int i11, List list) {
        for (int i12 = 0; i12 < list.size(); i12++) {
            this.f11247a.n(i11, (zzacr) list.get(i12));
        }
    }

    public final void c(int i11, int i12) {
        this.f11247a.i(i11, i12);
    }

    public final void d(int i11, long j11) {
        this.f11247a.j(i11, j11);
    }

    public final void e(int i11, long j11) {
        this.f11247a.k(i11, j11);
    }

    public final void f(int i11, float f5) {
        this.f11247a.i(i11, Float.floatToRawIntBits(f5));
    }

    public final void g(int i11, double d5) {
        this.f11247a.k(i11, Double.doubleToRawLongBits(d5));
    }

    public final void h(int i11, int i12) {
        this.f11247a.g(i11, i12);
    }

    public final void i(int i11, long j11) {
        this.f11247a.j(i11, j11);
    }

    public final void j(int i11, int i12) {
        this.f11247a.g(i11, i12);
    }

    public final void k(int i11, long j11) {
        this.f11247a.k(i11, j11);
    }

    public final void l(int i11, int i12) {
        this.f11247a.i(i11, i12);
    }

    public final void m(int i11, boolean z11) {
        this.f11247a.l(i11, z11);
    }

    public final void n(int i11, zzacr zzacrVar) {
        this.f11247a.n(i11, zzacrVar);
    }

    public final void o(int i11, int i12) {
        this.f11247a.h(i11, i12);
    }

    public final void p(int i11, int i12) {
        this.f11247a.h(i11, (i12 >> 31) ^ (i12 + i12));
    }

    public final void q(int i11, long j11) {
        this.f11247a.j(i11, (j11 >> 63) ^ (j11 + j11));
    }

    public final void r(int i11, Object obj, zzafp zzafpVar) {
        zzacb zzacbVar = (zzacb) obj;
        zzada zzadaVar = this.f11247a;
        zzadaVar.f(i11, 2);
        zzadaVar.v(zzacbVar.e(zzafpVar));
        zzafpVar.b(zzacbVar, this);
    }

    public final void s(int i11, Object obj, zzafp zzafpVar) {
        zzada zzadaVar = this.f11247a;
        zzadaVar.f(i11, 3);
        zzafpVar.b((zzacb) obj, this);
        zzadaVar.f(i11, 4);
    }
}
