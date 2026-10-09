package h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f31133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f31134b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f31135c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f31136d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f31137e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f31138f;

    public u0(float f5, float f11, float f12, float f13, float f14, float f15) {
        this.f31133a = f5;
        this.f31134b = f11;
        this.f31135c = f12;
        this.f31136d = f13;
        this.f31137e = f14;
        this.f31138f = f15;
    }

    public final l1.b3 a(boolean z11, h0.i iVar, l1.n nVar, int i11) {
        b0.d dVar;
        l1.s sVar = (l1.s) nVar;
        sVar.d0(-1763481333);
        sVar.d0(-734838460);
        float f5 = this.f31133a;
        l1.g gVar = l1.m.f39353a;
        if (iVar == null) {
            Object objQ = sVar.Q();
            if (objQ == gVar) {
                objQ = l1.t.B(new v3.f(f5));
                sVar.o0(objQ);
            }
            l1.b1 b1Var = (l1.b1) objQ;
            sVar.p(false);
            sVar.p(false);
            return b1Var;
        }
        sVar.p(false);
        Object objQ2 = sVar.Q();
        if (objQ2 == gVar) {
            objQ2 = new x1.p();
            sVar.o0(objQ2);
        }
        x1.p pVar = (x1.p) objQ2;
        boolean z12 = true;
        boolean z13 = (((i11 & 112) ^ 48) > 32 && sVar.f(iVar)) || (i11 & 48) == 32;
        Object objQ3 = sVar.Q();
        vy.d dVar2 = null;
        if (z13 || objQ3 == gVar) {
            objQ3 = new l0(iVar, pVar, dVar2, 1);
            sVar.o0(objQ3);
        }
        l1.t.f((fz.e) objQ3, iVar, sVar);
        h0.h hVar = (h0.h) ry.m.A0(pVar);
        if (!z11) {
            f5 = this.f31138f;
        } else if (hVar instanceof h0.k) {
            f5 = this.f31134b;
        } else if (hVar instanceof h0.f) {
            f5 = this.f31136d;
        } else if (hVar instanceof h0.d) {
            f5 = this.f31135c;
        } else if (hVar instanceof h0.b) {
            f5 = this.f31137e;
        }
        Object objQ4 = sVar.Q();
        if (objQ4 == gVar) {
            objQ4 = new b0.d(new v3.f(f5), b0.e.f3498l, null, 12);
            sVar.o0(objQ4);
        }
        b0.d dVar3 = (b0.d) objQ4;
        v3.f fVar = new v3.f(f5);
        boolean zH = sVar.h(dVar3) | sVar.c(f5) | ((((i11 & 14) ^ 6) > 4 && sVar.g(z11)) || (i11 & 6) == 4);
        if ((((i11 & 896) ^ 384) <= 256 || !sVar.f(this)) && (i11 & 384) != 256) {
            z12 = false;
        }
        boolean zH2 = zH | z12 | sVar.h(hVar);
        Object objQ5 = sVar.Q();
        if (zH2 || objQ5 == gVar) {
            dVar = dVar3;
            m0 m0Var = new m0(dVar, f5, z11, this, hVar, null, 1);
            sVar.o0(m0Var);
            objQ5 = m0Var;
        } else {
            dVar = dVar3;
        }
        l1.t.f((fz.e) objQ5, fVar, sVar);
        b0.n nVar2 = dVar.f3472c;
        sVar.p(false);
        return nVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        return v3.f.b(this.f31133a, u0Var.f31133a) && v3.f.b(this.f31134b, u0Var.f31134b) && v3.f.b(this.f31135c, u0Var.f31135c) && v3.f.b(this.f31136d, u0Var.f31136d) && v3.f.b(this.f31138f, u0Var.f31138f);
    }

    public final int hashCode() {
        return Float.hashCode(this.f31138f) + defpackage.e.a(defpackage.e.a(defpackage.e.a(Float.hashCode(this.f31133a) * 31, this.f31134b, 31), this.f31135c, 31), this.f31136d, 31);
    }
}
