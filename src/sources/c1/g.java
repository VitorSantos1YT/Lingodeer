package c1;

import j3.b0;
import j3.t;
import j3.y0;
import ry.r;
import s0.o0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f6444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public y0 f6445b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public n3.h f6446c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f6447d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f6448e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f6449f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f6450g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public v3.c f6452i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public j3.b f6453j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f6454k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f6455l;
    public b m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public b0 f6456n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public v3.m f6457o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f6461s;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f6451h = a.f6411a;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f6458p = v3.b.h(0, 0, 0, 0);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f6459q = -1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f6460r = -1;

    public g(String str, y0 y0Var, n3.h hVar, int i11, boolean z11, int i12, int i13) {
        this.f6444a = str;
        this.f6445b = y0Var;
        this.f6446c = hVar;
        this.f6447d = i11;
        this.f6448e = z11;
        this.f6449f = i12;
        this.f6450g = i13;
        long j11 = 0;
        this.f6455l = (j11 & 4294967295L) | (j11 << 32);
    }

    public static long f(g gVar, long j11, v3.m mVar) {
        y0 y0Var = gVar.f6445b;
        b bVar = gVar.m;
        v3.c cVar = gVar.f6452i;
        kotlin.jvm.internal.m.c(cVar);
        b bVarN = se.i.n(bVar, mVar, y0Var, cVar, gVar.f6446c);
        gVar.m = bVarN;
        return bVarN.a(gVar.f6450g, j11);
    }

    public final int a(int i11, v3.m mVar) {
        int i12 = this.f6459q;
        int i13 = this.f6460r;
        if (i11 == i12 && i12 != -1) {
            return i13;
        }
        long jA = v3.b.a(0, i11, 0, Integer.MAX_VALUE);
        if (this.f6450g > 1) {
            jA = f(this, jA, mVar);
        }
        b0 b0VarE = e(mVar);
        long jO = qx.p.o(jA, this.f6448e, this.f6447d, b0VarE.c());
        boolean z11 = this.f6448e;
        int i14 = this.f6447d;
        int i15 = this.f6449f;
        int iP = o0.p(new j3.b((r3.c) b0VarE, ((z11 || !(i14 == 2 || i14 == 4 || i14 == 5)) && i15 >= 1) ? i15 : 1, i14, jO).b());
        int i16 = v3.a.i(jA);
        if (iP < i16) {
            iP = i16;
        }
        this.f6459q = i11;
        this.f6460r = iP;
        return iP;
    }

    public final boolean b(long j11, v3.m mVar) {
        b0 b0Var;
        this.f6461s = (this.f6461s << 2) | 3;
        boolean z11 = true;
        long jF = this.f6450g > 1 ? f(this, j11, mVar) : j11;
        j3.b bVar = this.f6453j;
        boolean z12 = false;
        if (bVar != null && (b0Var = this.f6456n) != null && !b0Var.a() && mVar == this.f6457o && (v3.a.b(jF, this.f6458p) || (v3.a.h(jF) == v3.a.h(this.f6458p) && v3.a.j(jF) == v3.a.j(this.f6458p) && v3.a.g(jF) >= bVar.b() && !bVar.f35664d.f37892d))) {
            if (!v3.a.b(jF, this.f6458p)) {
                j3.b bVar2 = this.f6453j;
                kotlin.jvm.internal.m.c(bVar2);
                long jD = v3.b.d(jF, (((long) o0.p(Math.min(bVar2.f35661a.K.c(), bVar2.d()))) << 32) | (((long) o0.p(bVar2.b())) & 4294967295L));
                this.f6455l = jD;
                if (this.f6447d == 3 || (((int) (jD >> 32)) >= bVar2.d() && ((int) (4294967295L & jD)) >= bVar2.b())) {
                    z11 = false;
                }
                this.f6454k = z11;
                this.f6458p = jF;
            }
            return false;
        }
        b0 b0VarE = e(mVar);
        long jO = qx.p.o(jF, this.f6448e, this.f6447d, b0VarE.c());
        boolean z13 = this.f6448e;
        int i11 = this.f6447d;
        int i12 = this.f6449f;
        j3.b bVar3 = new j3.b((r3.c) b0VarE, ((z13 || !(i11 == 2 || i11 == 4 || i11 == 5)) && i12 >= 1) ? i12 : 1, i11, jO);
        this.f6458p = jF;
        long jD2 = v3.b.d(jF, (((long) o0.p(bVar3.b())) & 4294967295L) | (((long) o0.p(bVar3.d())) << 32));
        this.f6455l = jD2;
        if (this.f6447d != 3 && (((int) (jD2 >> 32)) < bVar3.d() || ((int) (jD2 & 4294967295L)) < bVar3.b())) {
            z12 = true;
        }
        this.f6454k = z12;
        this.f6453j = bVar3;
        return true;
    }

    public final void c() {
        this.f6453j = null;
        this.f6456n = null;
        this.f6457o = null;
        this.f6459q = -1;
        this.f6460r = -1;
        this.f6458p = v3.b.h(0, 0, 0, 0);
        long j11 = 0;
        this.f6455l = (j11 & 4294967295L) | (j11 << 32);
        this.f6454k = false;
    }

    public final void d(v3.c cVar) {
        long jA;
        v3.c cVar2 = this.f6452i;
        if (cVar != null) {
            int i11 = a.f6412b;
            jA = a.a(cVar.getDensity(), cVar.Z());
        } else {
            jA = a.f6411a;
        }
        if (cVar2 == null) {
            this.f6452i = cVar;
            this.f6451h = jA;
        } else if (cVar == null || this.f6451h != jA) {
            this.f6452i = cVar;
            this.f6451h = jA;
            this.f6461s = (this.f6461s << 2) | 1;
            c();
        }
    }

    public final b0 e(v3.m mVar) {
        b0 cVar = this.f6456n;
        if (cVar == null || mVar != this.f6457o || cVar.a()) {
            this.f6457o = mVar;
            String str = this.f6444a;
            y0 y0VarJ = t.j(this.f6445b, mVar);
            v3.c cVar2 = this.f6452i;
            kotlin.jvm.internal.m.c(cVar2);
            n3.h hVar = this.f6446c;
            r rVar = r.f50854a;
            cVar = new r3.c(str, y0VarJ, rVar, rVar, hVar, cVar2);
        }
        this.f6456n = cVar;
        return cVar;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ParagraphLayoutCache(paragraph=");
        sb2.append(this.f6453j != null ? "<paragraph>" : "null");
        sb2.append(", lastDensity=");
        sb2.append((Object) a.b(this.f6451h));
        sb2.append(", history=");
        return defpackage.e.i(this.f6461s, ", constraints=$)", sb2);
    }
}
