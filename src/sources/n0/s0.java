package n0;

import f0.h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class s0 extends y2.d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fz.a f42998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r0 f42999b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h1 f43000c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f43001d;

    public s0(fz.a aVar, r0 r0Var, h1 h1Var, boolean z11) {
        this.f42998a = aVar;
        this.f42999b = r0Var;
        this.f43000c = h1Var;
        this.f43001d = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj;
        return this.f42998a == s0Var.f42998a && kotlin.jvm.internal.m.a(this.f42999b, s0Var.f42999b) && this.f43000c == s0Var.f43000c && this.f43001d == s0Var.f43001d;
    }

    @Override // y2.d1
    public final z1.q f() {
        return new v0(this.f42998a, this.f42999b, this.f43000c, this.f43001d);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + defpackage.e.e((this.f43000c.hashCode() + ((this.f42999b.hashCode() + (this.f42998a.hashCode() * 31)) * 31)) * 31, 31, this.f43001d);
    }

    @Override // y2.d1
    public final void j(z1.q qVar) {
        v0 v0Var = (v0) qVar;
        v0Var.Q = this.f42998a;
        v0Var.R = this.f42999b;
        h1 h1Var = v0Var.S;
        h1 h1Var2 = this.f43000c;
        if (h1Var != h1Var2) {
            v0Var.S = h1Var2;
            y2.f.o(v0Var);
        }
        boolean z11 = v0Var.T;
        boolean z12 = this.f43001d;
        if (z11 == z12) {
            return;
        }
        v0Var.T = z12;
        v0Var.T0();
        y2.f.o(v0Var);
    }
}
