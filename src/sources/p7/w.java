package p7;

import android.util.Pair;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class w extends h1 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f46515l;
    public final y6.n0 m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final y6.m0 f46516n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public u f46517o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public t f46518p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f46519q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f46520r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f46521s;

    public w(a aVar, boolean z11) {
        super(aVar);
        this.f46515l = z11 && aVar.h();
        this.m = new y6.n0();
        this.f46516n = new y6.m0();
        y6.o0 o0VarF = aVar.f();
        if (o0VarF == null) {
            this.f46517o = new u(new v(aVar.g()), y6.n0.f57236q, u.f46495e);
        } else {
            this.f46517o = new u(o0VarF, null, null);
            this.f46521s = true;
        }
    }

    @Override // p7.h1
    public final void A() {
        if (this.f46515l) {
            return;
        }
        this.f46519q = true;
        z();
    }

    @Override // p7.a
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public final t a(b0 b0Var, t7.g gVar, long j11) {
        t tVar = new t(b0Var, gVar, j11);
        b7.a.j(tVar.f46491d == null);
        tVar.f46491d = this.f46393k;
        if (!this.f46520r) {
            this.f46518p = tVar;
            if (!this.f46519q) {
                this.f46519q = true;
                z();
            }
            return tVar;
        }
        Object obj = b0Var.f46328a;
        if (this.f46517o.f46497d != null && obj.equals(u.f46495e)) {
            obj = this.f46517o.f46497d;
        }
        tVar.c(b0Var.a(obj));
        return tVar;
    }

    public final boolean C(long j11) {
        t tVar = this.f46518p;
        int iB = this.f46517o.b(tVar.f46488a.f46328a);
        if (iB == -1) {
            return false;
        }
        u uVar = this.f46517o;
        y6.m0 m0Var = this.f46516n;
        uVar.f(iB, m0Var, false);
        long j12 = m0Var.f57231d;
        if (j12 != -9223372036854775807L && j11 >= j12) {
            j11 = Math.max(0L, j12 - 1);
        }
        tVar.f46494t = j11;
        return true;
    }

    @Override // p7.a
    public final void m(z zVar) {
        t tVar = (t) zVar;
        if (tVar.f46492e != null) {
            a aVar = tVar.f46491d;
            aVar.getClass();
            aVar.m(tVar.f46492e);
        }
        if (zVar == this.f46518p) {
            this.f46518p = null;
        }
    }

    @Override // p7.k, p7.a
    public final void o() {
        this.f46520r = false;
        this.f46519q = false;
        super.o();
    }

    @Override // p7.h1, p7.a
    public final void r(y6.x xVar) {
        if (this.f46521s) {
            u uVar = this.f46517o;
            this.f46517o = new u(new f7.c1(this.f46517o.f46450b, xVar), uVar.f46496c, uVar.f46497d);
        } else {
            this.f46517o = new u(new v(xVar), y6.n0.f57236q, u.f46495e);
        }
        this.f46393k.r(xVar);
    }

    @Override // p7.h1
    public final b0 x(b0 b0Var) {
        Object obj = b0Var.f46328a;
        Object obj2 = this.f46517o.f46497d;
        if (obj2 != null && obj2.equals(obj)) {
            obj = u.f46495e;
        }
        return b0Var.a(obj);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x006d  */
    /* JADX WARN: Code duplicated, block: B:37:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:39:? A[RETURN, SYNTHETIC] */
    @Override // p7.h1
    public final void y(y6.o0 o0Var) {
        long j11;
        u uVar;
        b0 b0VarA;
        u uVar2;
        if (this.f46520r) {
            u uVar3 = this.f46517o;
            this.f46517o = new u(o0Var, uVar3.f46496c, uVar3.f46497d);
            t tVar = this.f46518p;
            if (tVar != null) {
                C(tVar.f46494t);
            }
        } else {
            if (!o0Var.p()) {
                y6.n0 n0Var = this.m;
                o0Var.n(0, n0Var);
                long j12 = n0Var.f57249l;
                Object obj = n0Var.f57238a;
                t tVar2 = this.f46518p;
                if (tVar2 != null) {
                    long j13 = tVar2.f46489b;
                    u uVar4 = this.f46517o;
                    Object obj2 = tVar2.f46488a.f46328a;
                    y6.m0 m0Var = this.f46516n;
                    uVar4.g(obj2, m0Var);
                    long j14 = m0Var.f57232e + j13;
                    this.f46517o.m(0, n0Var, 0L);
                    if (j14 != n0Var.f57249l) {
                        j11 = j14;
                    } else {
                        j11 = j12;
                    }
                } else {
                    j11 = j12;
                }
                Pair pairI = o0Var.i(this.m, this.f46516n, 0, j11);
                Object obj3 = pairI.first;
                long jLongValue = ((Long) pairI.second).longValue();
                if (this.f46521s) {
                    u uVar5 = this.f46517o;
                    uVar = new u(o0Var, uVar5.f46496c, uVar5.f46497d);
                } else {
                    uVar = new u(o0Var, obj, obj3);
                }
                this.f46517o = uVar;
                t tVar3 = this.f46518p;
                if (tVar3 != null && C(jLongValue)) {
                    b0 b0Var = tVar3.f46488a;
                    Object obj4 = b0Var.f46328a;
                    if (this.f46517o.f46497d != null && obj4.equals(u.f46495e)) {
                        obj4 = this.f46517o.f46497d;
                    }
                    b0VarA = b0Var.a(obj4);
                }
                this.f46521s = true;
                this.f46520r = true;
                l(this.f46517o);
                if (b0VarA != null) {
                    t tVar4 = this.f46518p;
                    tVar4.getClass();
                    tVar4.c(b0VarA);
                }
            }
            if (this.f46521s) {
                u uVar6 = this.f46517o;
                uVar2 = new u(o0Var, uVar6.f46496c, uVar6.f46497d);
            } else {
                uVar2 = new u(o0Var, y6.n0.f57236q, u.f46495e);
            }
            this.f46517o = uVar2;
        }
        b0VarA = null;
        this.f46521s = true;
        this.f46520r = true;
        l(this.f46517o);
        if (b0VarA != null) {
            t tVar5 = this.f46518p;
            tVar5.getClass();
            tVar5.c(b0VarA);
        }
    }
}
