package c1;

import g2.y;
import j3.y0;
import java.util.List;
import y2.d1;
import z1.q;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends d1 {
    public final int H;
    public final List K;
    public final fz.c L;
    public final y M;
    public final s0.g N;
    public final fz.c O;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j3.h f6462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y0 f6463b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n3.h f6464c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final fz.c f6465d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f6466e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f6467f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f6468t;

    public h(j3.h hVar, y0 y0Var, n3.h hVar2, fz.c cVar, int i11, boolean z11, int i12, int i13, List list, fz.c cVar2, y yVar, s0.g gVar, fz.c cVar3) {
        this.f6462a = hVar;
        this.f6463b = y0Var;
        this.f6464c = hVar2;
        this.f6465d = cVar;
        this.f6466e = i11;
        this.f6467f = z11;
        this.f6468t = i12;
        this.H = i13;
        this.K = list;
        this.L = cVar2;
        this.M = yVar;
        this.N = gVar;
        this.O = cVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return kotlin.jvm.internal.m.a(this.M, hVar.M) && kotlin.jvm.internal.m.a(this.f6462a, hVar.f6462a) && kotlin.jvm.internal.m.a(this.f6463b, hVar.f6463b) && kotlin.jvm.internal.m.a(this.K, hVar.K) && kotlin.jvm.internal.m.a(this.f6464c, hVar.f6464c) && this.f6465d == hVar.f6465d && this.O == hVar.O && this.f6466e == hVar.f6466e && this.f6467f == hVar.f6467f && this.f6468t == hVar.f6468t && this.H == hVar.H && this.L == hVar.L;
    }

    @Override // y2.d1
    public final q f() {
        l lVar = new l();
        lVar.Q = this.f6462a;
        lVar.R = this.f6463b;
        lVar.S = this.f6464c;
        lVar.T = this.f6465d;
        lVar.U = this.f6466e;
        lVar.V = this.f6467f;
        lVar.W = this.f6468t;
        lVar.X = this.H;
        lVar.Y = this.K;
        lVar.Z = this.L;
        lVar.f6477a0 = this.M;
        lVar.f6478b0 = this.N;
        lVar.f6479c0 = this.O;
        return lVar;
    }

    public final int hashCode() {
        int iHashCode = (this.f6464c.hashCode() + ((this.f6463b.hashCode() + (this.f6462a.hashCode() * 31)) * 31)) * 31;
        fz.c cVar = this.f6465d;
        int iE = (((defpackage.e.e(defpackage.e.b(this.f6466e, (iHashCode + (cVar != null ? cVar.hashCode() : 0)) * 31, 31), 31, this.f6467f) + this.f6468t) * 31) + this.H) * 31;
        List list = this.K;
        int iHashCode2 = (iE + (list != null ? list.hashCode() : 0)) * 31;
        fz.c cVar2 = this.L;
        int iHashCode3 = (iHashCode2 + (cVar2 != null ? cVar2.hashCode() : 0)) * 961;
        y yVar = this.M;
        int iHashCode4 = (iHashCode3 + (yVar != null ? yVar.hashCode() : 0)) * 31;
        fz.c cVar3 = this.O;
        return iHashCode4 + (cVar3 != null ? cVar3.hashCode() : 0);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0024  */
    @Override // y2.d1
    public final void j(q qVar) {
        boolean z11;
        boolean z12;
        l lVar = (l) qVar;
        y yVar = lVar.f6477a0;
        y yVar2 = this.M;
        boolean zA = kotlin.jvm.internal.m.a(yVar2, yVar);
        lVar.f6477a0 = yVar2;
        if (zA) {
            y0 y0Var = lVar.R;
            y0 y0Var2 = this.f6463b;
            if (y0Var2 == y0Var) {
                y0Var2.getClass();
            } else if (!y0Var2.f35827a.b(y0Var.f35827a)) {
                z11 = true;
            }
            z11 = false;
        } else {
            z11 = true;
        }
        String str = lVar.Q.f35700b;
        j3.h hVar = this.f6462a;
        boolean zA2 = kotlin.jvm.internal.m.a(str, hVar.f35700b);
        boolean z13 = (zA2 && kotlin.jvm.internal.m.a(lVar.Q.f35699a, hVar.f35699a)) ? false : true;
        if (z13) {
            lVar.Q = hVar;
        }
        if (!zA2) {
            lVar.f6483g0 = null;
        }
        y0 y0Var3 = lVar.R;
        y0 y0Var4 = this.f6463b;
        boolean z14 = true;
        boolean z15 = !y0Var3.c(y0Var4);
        lVar.R = y0Var4;
        List list = lVar.Y;
        List list2 = this.K;
        if (!kotlin.jvm.internal.m.a(list, list2)) {
            lVar.Y = list2;
            z15 = true;
        }
        int i11 = lVar.X;
        int i12 = this.H;
        if (i11 != i12) {
            lVar.X = i12;
            z15 = true;
        }
        int i13 = lVar.W;
        int i14 = this.f6468t;
        if (i13 != i14) {
            lVar.W = i14;
            z15 = true;
        }
        boolean z16 = lVar.V;
        boolean z17 = this.f6467f;
        if (z16 != z17) {
            lVar.V = z17;
            z15 = true;
        }
        n3.h hVar2 = lVar.S;
        n3.h hVar3 = this.f6464c;
        if (!kotlin.jvm.internal.m.a(hVar2, hVar3)) {
            lVar.S = hVar3;
            z15 = true;
        }
        int i15 = lVar.U;
        int i16 = this.f6466e;
        if (i15 != i16) {
            lVar.U = i16;
            z15 = true;
        }
        s0.g gVar = lVar.f6478b0;
        s0.g gVar2 = this.N;
        if (kotlin.jvm.internal.m.a(gVar, gVar2)) {
            z14 = z15;
        } else {
            lVar.f6478b0 = gVar2;
        }
        fz.c cVar = lVar.T;
        fz.c cVar2 = this.f6465d;
        boolean z18 = true;
        if (cVar != cVar2) {
            lVar.T = cVar2;
            z12 = true;
        } else {
            z12 = false;
        }
        fz.c cVar3 = lVar.Z;
        fz.c cVar4 = this.L;
        if (cVar3 != cVar4) {
            lVar.Z = cVar4;
            z12 = true;
        }
        fz.c cVar5 = lVar.f6479c0;
        fz.c cVar6 = this.O;
        if (cVar5 != cVar6) {
            lVar.f6479c0 = cVar6;
        } else {
            z18 = z12;
        }
        if (z13 || z14 || z18) {
            e eVarT0 = lVar.T0();
            j3.h hVar4 = lVar.Q;
            y0 y0Var5 = lVar.R;
            n3.h hVar5 = lVar.S;
            int i17 = lVar.U;
            boolean z19 = lVar.V;
            int i18 = lVar.W;
            int i19 = lVar.X;
            List list3 = lVar.Y;
            s0.g gVar3 = lVar.f6478b0;
            eVarT0.f6425a = hVar4;
            eVarT0.f(y0Var5);
            eVarT0.f6426b = hVar5;
            eVarT0.f6427c = i17;
            eVarT0.f6428d = z19;
            eVarT0.f6429e = i18;
            eVarT0.f6430f = i19;
            eVarT0.f6431g = list3;
            eVarT0.f6432h = gVar3;
            eVarT0.f6442s = (eVarT0.f6442s << 2) | 2;
            eVarT0.m = null;
            eVarT0.f6438o = null;
            eVarT0.f6440q = -1;
            eVarT0.f6439p = -1;
            eVarT0.f6441r = null;
        }
        if (lVar.P) {
            if (z13 || (z11 && lVar.f6482f0 != null)) {
                y2.f.o(lVar);
            }
            if (z13 || z14 || z18) {
                y2.f.n(lVar);
                y2.f.m(lVar);
            }
            if (z11) {
                y2.f.m(lVar);
            }
        }
    }
}
