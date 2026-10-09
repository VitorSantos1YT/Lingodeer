package c1;

import j3.t;
import j3.t0;
import j3.u0;
import j3.x;
import j3.y0;
import java.util.List;
import ry.r;
import s0.o0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public j3.h f6425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public n3.h f6426b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f6427c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f6428d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f6429e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f6430f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List f6431g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public s0.g f6432h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public b f6433i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public v3.c f6435k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public y0 f6436l;
    public a9.i m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public v3.m f6437n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public u0 f6438o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public d f6441r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f6442s;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f6434j = a.f6411a;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f6439p = -1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f6440q = -1;

    public e(j3.h hVar, y0 y0Var, n3.h hVar2, int i11, boolean z11, int i12, int i13, List list, s0.g gVar) {
        this.f6425a = hVar;
        this.f6426b = hVar2;
        this.f6427c = i11;
        this.f6428d = z11;
        this.f6429e = i12;
        this.f6430f = i13;
        this.f6431g = list;
        this.f6432h = gVar;
        this.f6436l = y0Var;
    }

    public final int a(int i11, v3.m mVar) {
        int i12 = this.f6439p;
        int i13 = this.f6440q;
        if (i11 == i12 && i12 != -1) {
            return i13;
        }
        long jA = v3.b.a(0, i11, 0, Integer.MAX_VALUE);
        if (this.f6430f > 1) {
            jA = h(jA, mVar);
        }
        int iP = o0.p(b(jA, mVar).f35817e);
        int i14 = v3.a.i(jA);
        if (iP < i14) {
            iP = i14;
        }
        this.f6439p = i11;
        this.f6440q = iP;
        return iP;
    }

    public final x b(long j11, v3.m mVar) {
        a9.i iVarE = e(mVar);
        long jO = qx.p.o(j11, this.f6428d, this.f6427c, iVarE.c());
        boolean z11 = this.f6428d;
        int i11 = this.f6427c;
        int i12 = this.f6429e;
        return new x(iVarE, jO, ((z11 || !(i11 == 2 || i11 == 4 || i11 == 5)) && i12 >= 1) ? i12 : 1, i11);
    }

    public final boolean c(long j11, v3.m mVar) {
        boolean z11;
        this.f6442s = (this.f6442s << 2) | 3;
        boolean z12 = true;
        long jH = this.f6430f > 1 ? h(j11, mVar) : j11;
        u0 u0Var = this.f6438o;
        if (u0Var != null) {
            x xVar = u0Var.f35798b;
            t0 t0Var = u0Var.f35797a;
            if (!xVar.f35813a.a()) {
                v3.m mVar2 = t0Var.f35791h;
                long j12 = t0Var.f35793j;
                if (mVar == mVar2 && (v3.a.b(jH, j12) || (v3.a.h(jH) == v3.a.h(j12) && v3.a.j(jH) == v3.a.j(j12) && v3.a.g(jH) >= xVar.f35817e && !xVar.f35815c))) {
                    u0 u0Var2 = this.f6438o;
                    kotlin.jvm.internal.m.c(u0Var2);
                    if (v3.a.b(jH, u0Var2.f35797a.f35793j)) {
                        return false;
                    }
                    u0 u0Var3 = this.f6438o;
                    kotlin.jvm.internal.m.c(u0Var3);
                    this.f6438o = g(mVar, jH, u0Var3.f35798b);
                    return true;
                }
            }
        }
        s0.g gVar = this.f6432h;
        if (gVar != null) {
            this.f6437n = mVar;
            long j13 = this.f6436l.f35827a.f35755b;
            if (this.f6441r == null) {
                this.f6441r = new d(this);
            }
            d dVar = this.f6441r;
            kotlin.jvm.internal.m.c(dVar);
            float fY0 = dVar.y0(gVar.f51041c);
            float fY1 = dVar.y0(gVar.f51039a);
            float fY2 = dVar.y0(gVar.f51040b);
            float f5 = 2;
            float f11 = (fY1 + fY2) / f5;
            float f12 = fY2;
            float f13 = fY1;
            while (f12 - f13 >= fY0) {
                boolean z13 = z12;
                float f14 = f5;
                if (s0.g.a(dVar.a(j11, dVar.K(f11)))) {
                    f12 = f11;
                } else {
                    f13 = f11;
                }
                f11 = (f13 + f12) / f14;
                z12 = z13;
                f5 = f14;
            }
            z11 = z12;
            float fFloor = (((float) Math.floor((f13 - fY1) / fY0)) * fY0) + fY1;
            float f15 = fY0 + fFloor;
            if (f15 <= fY2 && !s0.g.a(dVar.a(j11, dVar.K(f15)))) {
                fFloor = f15;
            }
            long jK = dVar.K(fFloor);
            if (v3.o.d(jK)) {
                jK = f.a(j13, jK);
            }
            if (this.f6441r == null) {
                this.f6441r = new d(this);
            }
            d dVar2 = this.f6441r;
            kotlin.jvm.internal.m.c(dVar2);
            u0 u0Var4 = dVar2.f6423a;
            if (u0Var4 != null) {
                t0 t0Var2 = u0Var4.f35797a;
                if (v3.o.a(jK, t0Var2.f35785b.f35827a.f35755b) && t0Var2.f35789f == this.f6427c) {
                    this.f6438o = u0Var4;
                    return z11;
                }
            }
            f(y0.a(this.f6436l, 0L, jK, null, null, null, 0L, null, null, 0, 0, 0L, null, 16777213));
        } else {
            z11 = true;
        }
        this.f6438o = g(mVar, jH, b(jH, mVar));
        return z11;
    }

    public final void d(v3.c cVar) {
        long jA;
        v3.c cVar2 = this.f6435k;
        if (cVar != null) {
            int i11 = a.f6412b;
            jA = a.a(cVar.getDensity(), cVar.Z());
        } else {
            jA = a.f6411a;
        }
        if (cVar2 == null) {
            this.f6435k = cVar;
            this.f6434j = jA;
            return;
        }
        if (cVar == null || this.f6434j != jA) {
            this.f6435k = cVar;
            this.f6434j = jA;
            this.f6442s = (this.f6442s << 2) | 1;
            this.m = null;
            this.f6438o = null;
            this.f6440q = -1;
            this.f6439p = -1;
            this.f6441r = null;
        }
    }

    public final a9.i e(v3.m mVar) {
        a9.i iVar = this.m;
        if (iVar == null || mVar != this.f6437n || iVar.a()) {
            this.f6437n = mVar;
            j3.h hVar = this.f6425a;
            y0 y0VarJ = t.j(this.f6436l, mVar);
            v3.c cVar = this.f6435k;
            kotlin.jvm.internal.m.c(cVar);
            n3.h hVar2 = this.f6426b;
            List list = this.f6431g;
            if (list == null) {
                list = r.f50854a;
            }
            iVar = new a9.i(hVar, y0VarJ, list, cVar, hVar2);
        }
        this.m = iVar;
        return iVar;
    }

    public final void f(y0 y0Var) {
        boolean zC = y0Var.c(this.f6436l);
        this.f6436l = y0Var;
        if (zC) {
            return;
        }
        this.f6442s <<= 2;
        this.m = null;
        this.f6438o = null;
        this.f6440q = -1;
        this.f6439p = -1;
    }

    public final u0 g(v3.m mVar, long j11, x xVar) {
        float fMin = Math.min(xVar.f35813a.c(), xVar.f35816d);
        j3.h hVar = this.f6425a;
        y0 y0Var = this.f6436l;
        List list = this.f6431g;
        if (list == null) {
            list = r.f50854a;
        }
        int i11 = this.f6429e;
        boolean z11 = this.f6428d;
        int i12 = this.f6427c;
        v3.c cVar = this.f6435k;
        kotlin.jvm.internal.m.c(cVar);
        return new u0(new t0(hVar, y0Var, list, i11, z11, i12, cVar, mVar, this.f6426b, j11), xVar, v3.b.d(j11, (((long) o0.p(fMin)) << 32) | (((long) o0.p(xVar.f35817e)) & 4294967295L)));
    }

    public final long h(long j11, v3.m mVar) {
        b bVar = this.f6433i;
        y0 y0Var = this.f6436l;
        v3.c cVar = this.f6435k;
        kotlin.jvm.internal.m.c(cVar);
        b bVarN = se.i.n(bVar, mVar, y0Var, cVar, this.f6426b);
        this.f6433i = bVarN;
        return bVarN.a(this.f6430f, j11);
    }

    public final String toString() {
        t0 t0Var;
        StringBuilder sb2 = new StringBuilder("MultiParagraphLayoutCache(textLayoutResult=");
        Object aVar = "null";
        sb2.append(this.f6438o != null ? "<TextLayoutResult>" : "null");
        sb2.append(", lastDensity=");
        sb2.append((Object) a.b(this.f6434j));
        sb2.append(", history=");
        sb2.append(this.f6442s);
        sb2.append(", constraints=");
        u0 u0Var = this.f6438o;
        if (u0Var != null && (t0Var = u0Var.f35797a) != null) {
            aVar = new v3.a(t0Var.f35793j);
        }
        sb2.append(aVar);
        sb2.append(')');
        return sb2.toString();
    }
}
