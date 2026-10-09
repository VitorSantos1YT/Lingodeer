package c1;

import g2.y;
import j3.y0;
import y2.d1;
import z1.q;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends d1 {
    public final y H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y0 f6485b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n3.h f6486c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f6487d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f6488e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f6489f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f6490t;

    public m(String str, y0 y0Var, n3.h hVar, int i11, boolean z11, int i12, int i13, y yVar) {
        this.f6484a = str;
        this.f6485b = y0Var;
        this.f6486c = hVar;
        this.f6487d = i11;
        this.f6488e = z11;
        this.f6489f = i12;
        this.f6490t = i13;
        this.H = yVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return kotlin.jvm.internal.m.a(this.H, mVar.H) && kotlin.jvm.internal.m.a(this.f6484a, mVar.f6484a) && kotlin.jvm.internal.m.a(this.f6485b, mVar.f6485b) && kotlin.jvm.internal.m.a(this.f6486c, mVar.f6486c) && this.f6487d == mVar.f6487d && this.f6488e == mVar.f6488e && this.f6489f == mVar.f6489f && this.f6490t == mVar.f6490t;
    }

    @Override // y2.d1
    public final q f() {
        p pVar = new p();
        pVar.Q = this.f6484a;
        pVar.R = this.f6485b;
        pVar.S = this.f6486c;
        pVar.T = this.f6487d;
        pVar.U = this.f6488e;
        pVar.V = this.f6489f;
        pVar.W = this.f6490t;
        pVar.X = this.H;
        return pVar;
    }

    public final int hashCode() {
        int iE = (((defpackage.e.e(defpackage.e.b(this.f6487d, (this.f6486c.hashCode() + ((this.f6485b.hashCode() + (this.f6484a.hashCode() * 31)) * 31)) * 31, 31), 31, this.f6488e) + this.f6489f) * 31) + this.f6490t) * 31;
        y yVar = this.H;
        return iE + (yVar != null ? yVar.hashCode() : 0);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0026  */
    @Override // y2.d1
    public final void j(q qVar) {
        boolean z11;
        p pVar = (p) qVar;
        y yVar = pVar.X;
        y yVar2 = this.H;
        boolean zA = kotlin.jvm.internal.m.a(yVar2, yVar);
        pVar.X = yVar2;
        boolean z12 = false;
        boolean z13 = true;
        y0 y0Var = this.f6485b;
        if (zA) {
            y0 y0Var2 = pVar.R;
            if (y0Var == y0Var2) {
                y0Var.getClass();
            } else if (!y0Var.f35827a.b(y0Var2.f35827a)) {
                z11 = true;
            }
            z11 = false;
        } else {
            z11 = true;
        }
        String str = pVar.Q;
        String str2 = this.f6484a;
        if (!kotlin.jvm.internal.m.a(str, str2)) {
            pVar.Q = str2;
            pVar.f6498b0 = null;
            z12 = true;
        }
        boolean z14 = !pVar.R.c(y0Var);
        pVar.R = y0Var;
        int i11 = pVar.W;
        int i12 = this.f6490t;
        if (i11 != i12) {
            pVar.W = i12;
            z14 = true;
        }
        int i13 = pVar.V;
        int i14 = this.f6489f;
        if (i13 != i14) {
            pVar.V = i14;
            z14 = true;
        }
        boolean z15 = pVar.U;
        boolean z16 = this.f6488e;
        if (z15 != z16) {
            pVar.U = z16;
            z14 = true;
        }
        n3.h hVar = pVar.S;
        n3.h hVar2 = this.f6486c;
        if (!kotlin.jvm.internal.m.a(hVar, hVar2)) {
            pVar.S = hVar2;
            z14 = true;
        }
        int i15 = pVar.T;
        int i16 = this.f6487d;
        if (i15 == i16) {
            z13 = z14;
        } else {
            pVar.T = i16;
        }
        if (z12 || z13) {
            g gVarT0 = pVar.T0();
            String str3 = pVar.Q;
            y0 y0Var3 = pVar.R;
            n3.h hVar3 = pVar.S;
            int i17 = pVar.T;
            boolean z17 = pVar.U;
            int i18 = pVar.V;
            int i19 = pVar.W;
            gVarT0.f6444a = str3;
            gVarT0.f6445b = y0Var3;
            gVarT0.f6446c = hVar3;
            gVarT0.f6447d = i17;
            gVarT0.f6448e = z17;
            gVarT0.f6449f = i18;
            gVarT0.f6450g = i19;
            gVarT0.f6461s = (gVarT0.f6461s << 2) | 2;
            gVarT0.c();
        }
        if (pVar.P) {
            if (z12 || (z11 && pVar.f6497a0 != null)) {
                y2.f.o(pVar);
            }
            if (z12 || z13) {
                y2.f.n(pVar);
                y2.f.m(pVar);
            }
            if (z11) {
                y2.f.m(pVar);
            }
        }
    }
}
