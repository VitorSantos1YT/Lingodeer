package c1;

import android.os.Trace;
import g2.t;
import g2.v;
import g2.v0;
import g2.y;
import g3.a0;
import g3.b0;
import j3.t0;
import j3.u0;
import j3.x;
import j3.y0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import ry.r;
import s0.o0;
import w2.g1;
import w2.p0;
import w2.r0;
import w2.s0;
import y2.b2;
import y2.k0;
import y2.q0;
import y2.z;
import z1.q;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends q implements z, y2.q, b2 {
    public j3.h Q;
    public y0 R;
    public n3.h S;
    public fz.c T;
    public int U;
    public boolean V;
    public int W;
    public int X;
    public List Y;
    public fz.c Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public y f6477a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public s0.g f6478b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public fz.c f6479c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public Map f6480d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public e f6481e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public j f6482f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public k f6483g0;

    @Override // y2.z
    public final int E(q0 q0Var, p0 p0Var, int i11) {
        return o0.p(U0(q0Var).e(q0Var.getLayoutDirection()).b());
    }

    @Override // z1.q
    public final boolean I0() {
        return false;
    }

    @Override // y2.z
    public final int L(q0 q0Var, p0 p0Var, int i11) {
        return o0.p(U0(q0Var).e(q0Var.getLayoutDirection()).c());
    }

    public final e T0() {
        if (this.f6481e0 == null) {
            this.f6481e0 = new e(this.Q, this.R, this.S, this.U, this.V, this.W, this.X, this.Y, this.f6478b0);
        }
        e eVar = this.f6481e0;
        kotlin.jvm.internal.m.c(eVar);
        return eVar;
    }

    public final e U0(v3.c cVar) {
        e eVar;
        k kVar = this.f6483g0;
        if (kVar != null && kVar.f6475c && (eVar = kVar.f6476d) != null) {
            eVar.d(cVar);
            return eVar;
        }
        e eVarT0 = T0();
        eVarT0.d(cVar);
        return eVarT0;
    }

    @Override // y2.z
    public final r0 b(s0 s0Var, p0 p0Var, long j11) {
        Trace.beginSection("TextAnnotatedStringNode:measure");
        try {
            e eVarU0 = U0(s0Var);
            boolean zC = eVarU0.c(j11, s0Var.getLayoutDirection());
            u0 u0Var = eVarU0.f6438o;
            if (u0Var == null) {
                throw new IllegalStateException("Internal Error: MultiParagraphLayoutCache could not provide TextLayoutResult during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: " + eVarU0);
            }
            long j12 = u0Var.f35799c;
            u0Var.f35798b.f35813a.a();
            if (zC) {
                y2.f.v(this, 2).j1();
                fz.c cVar = this.T;
                if (cVar != null) {
                    cVar.invoke(u0Var);
                }
                Map linkedHashMap = this.f6480d0;
                if (linkedHashMap == null) {
                    linkedHashMap = new LinkedHashMap(2);
                }
                linkedHashMap.put(w2.c.f54475a, Integer.valueOf(Math.round(u0Var.f35800d)));
                linkedHashMap.put(w2.c.f54476b, Integer.valueOf(Math.round(u0Var.f35801e)));
                this.f6480d0 = linkedHashMap;
            }
            fz.c cVar2 = this.Z;
            if (cVar2 != null) {
                cVar2.invoke(u0Var.f35802f);
            }
            int i11 = (int) (j12 >> 32);
            int i12 = (int) (j12 & 4294967295L);
            g1 g1VarB = p0Var.B(com.bumptech.glide.f.q(i11, i11, i12, i12));
            Map map = this.f6480d0;
            kotlin.jvm.internal.m.c(map);
            r0 r0VarQ0 = s0Var.q0(i11, i12, map, new i(g1VarB, 0));
            Trace.endSection();
            return r0VarQ0;
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    @Override // y2.q
    public final void i(k0 k0Var) {
        if (this.P) {
            v vVarX = k0Var.f56937a.f34121b.x();
            e eVarU0 = U0(k0Var);
            u0 u0Var = eVarU0.f6438o;
            if (u0Var == null) {
                throw new IllegalStateException("Internal Error: MultiParagraphLayoutCache could not provide TextLayoutResult during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: " + eVarU0);
            }
            x xVar = u0Var.f35798b;
            boolean z11 = true;
            boolean z12 = u0Var.d() && this.U != 3;
            if (z12) {
                long j11 = u0Var.f35799c;
                f2.c cVarE = com.bumptech.glide.e.e(0L, (((long) Float.floatToRawIntBits((int) (j11 >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (j11 & 4294967295L))) & 4294967295L));
                vVarX.e();
                v.r(vVarX, cVarE);
            }
            try {
                j3.p0 p0Var = this.R.f35827a;
                u3.l lVar = p0Var.m;
                if (lVar == null) {
                    lVar = u3.l.f52751b;
                }
                u3.l lVar2 = lVar;
                v0 v0Var = p0Var.f35766n;
                if (v0Var == null) {
                    v0Var = v0.f28610d;
                }
                v0 v0Var2 = v0Var;
                i2.e eVar = p0Var.f35768p;
                if (eVar == null) {
                    eVar = i2.g.f34126a;
                }
                i2.e eVar2 = eVar;
                t tVarC = p0Var.f35754a.c();
                if (tVarC != null) {
                    x.j(xVar, vVarX, tVarC, this.R.f35827a.f35754a.a(), v0Var2, lVar2, eVar2);
                } else {
                    y yVar = this.f6477a0;
                    long jA = yVar != null ? yVar.a() : g2.x.f28622i;
                    if (jA == 16) {
                        jA = this.R.b() != 16 ? this.R.b() : g2.x.f28615b;
                    }
                    x.i(xVar, vVarX, jA, v0Var2, lVar2, eVar2, 32);
                }
                if (z12) {
                    vVarX.p();
                }
                k kVar = this.f6483g0;
                if (!((kVar == null || !kVar.f6475c) ? se.k.q(this.Q) : false)) {
                    List list = this.Y;
                    if (list != null && !list.isEmpty()) {
                        z11 = false;
                    }
                    if (z11) {
                        return;
                    }
                }
                k0Var.a();
            } catch (Throwable th2) {
                if (!z12) {
                    throw th2;
                }
                vVarX.p();
                throw th2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [fz.c] */
    /* JADX WARN: Type inference failed for: r0v2, types: [c1.j] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    @Override // y2.b2
    public final void i0(b0 b0Var) {
        j jVar = this.f6482f0;
        ?? r9 = jVar;
        if (jVar == null) {
            final int i11 = 0;
            ?? r11 = new fz.c(this) { // from class: c1.j

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ l f6472b;

                {
                    this.f6472b = this;
                }

                @Override // fz.c
                public final Object invoke(Object obj) {
                    u0 u0Var;
                    boolean z11;
                    switch (i11) {
                        case 0:
                            List list = (List) obj;
                            l lVar = this.f6472b;
                            u0 u0Var2 = lVar.T0().f6438o;
                            if (u0Var2 != null) {
                                t0 t0Var = u0Var2.f35797a;
                                j3.h hVar = t0Var.f35784a;
                                y0 y0Var = lVar.R;
                                y yVar = lVar.f6477a0;
                                u0Var = new u0(new t0(hVar, y0.e(y0Var, yVar != null ? yVar.a() : g2.x.f28622i, 0L, null, null, null, 0L, 0, 0L, 16777214), t0Var.f35786c, t0Var.f35787d, t0Var.f35788e, t0Var.f35789f, t0Var.f35790g, t0Var.f35791h, t0Var.f35792i, t0Var.f35793j), u0Var2.f35798b, u0Var2.f35799c);
                                list.add(u0Var);
                            } else {
                                u0Var = null;
                            }
                            return Boolean.valueOf(u0Var != null);
                        case 1:
                            j3.h hVar2 = (j3.h) obj;
                            l lVar2 = this.f6472b;
                            k kVar = lVar2.f6483g0;
                            r rVar = r.f50854a;
                            if (kVar == null) {
                                k kVar2 = new k(lVar2.Q, hVar2);
                                e eVar = new e(hVar2, lVar2.R, lVar2.S, lVar2.U, lVar2.V, lVar2.W, lVar2.X, rVar, lVar2.f6478b0);
                                eVar.d(lVar2.T0().f6435k);
                                kVar2.f6476d = eVar;
                                lVar2.f6483g0 = kVar2;
                            } else if (!kotlin.jvm.internal.m.a(hVar2, kVar.f6474b)) {
                                kVar.f6474b = hVar2;
                                e eVar2 = kVar.f6476d;
                                if (eVar2 != null) {
                                    y0 y0Var2 = lVar2.R;
                                    n3.h hVar3 = lVar2.S;
                                    int i12 = lVar2.U;
                                    boolean z12 = lVar2.V;
                                    int i13 = lVar2.W;
                                    int i14 = lVar2.X;
                                    s0.g gVar = lVar2.f6478b0;
                                    eVar2.f6425a = hVar2;
                                    eVar2.f(y0Var2);
                                    eVar2.f6426b = hVar3;
                                    eVar2.f6427c = i12;
                                    eVar2.f6428d = z12;
                                    eVar2.f6429e = i13;
                                    eVar2.f6430f = i14;
                                    eVar2.f6431g = rVar;
                                    eVar2.f6432h = gVar;
                                    eVar2.f6442s = (eVar2.f6442s << 2) | 2;
                                    eVar2.m = null;
                                    eVar2.f6438o = null;
                                    eVar2.f6440q = -1;
                                    eVar2.f6439p = -1;
                                    eVar2.f6441r = null;
                                }
                            }
                            y2.f.o(lVar2);
                            y2.f.n(lVar2);
                            y2.f.m(lVar2);
                            return Boolean.TRUE;
                        default:
                            boolean zBooleanValue = ((Boolean) obj).booleanValue();
                            l lVar3 = this.f6472b;
                            k kVar3 = lVar3.f6483g0;
                            if (kVar3 == null) {
                                z11 = false;
                            } else {
                                fz.c cVar = lVar3.f6479c0;
                                if (cVar != null) {
                                    cVar.invoke(kVar3);
                                }
                                k kVar4 = lVar3.f6483g0;
                                if (kVar4 != null) {
                                    kVar4.f6475c = zBooleanValue;
                                }
                                y2.f.o(lVar3);
                                y2.f.n(lVar3);
                                y2.f.m(lVar3);
                                z11 = true;
                            }
                            return Boolean.valueOf(z11);
                    }
                }
            };
            this.f6482f0 = r11;
            r9 = r11;
        }
        j3.h hVar = this.Q;
        mz.j[] jVarArr = g3.z.f28737a;
        b0Var.b(g3.x.B, ns.o.K(hVar));
        k kVar = this.f6483g0;
        if (kVar != null) {
            j3.h hVar2 = kVar.f6474b;
            a0 a0Var = g3.x.C;
            mz.j[] jVarArr2 = g3.z.f28737a;
            mz.j jVar2 = jVarArr2[16];
            b0Var.b(a0Var, hVar2);
            boolean z11 = kVar.f6475c;
            a0 a0Var2 = g3.x.D;
            mz.j jVar3 = jVarArr2[17];
            b0Var.b(a0Var2, Boolean.valueOf(z11));
        }
        final int i12 = 1;
        b0Var.b(g3.n.f28677l, new g3.a(null, new fz.c(this) { // from class: c1.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f6472b;

            {
                this.f6472b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                u0 u0Var;
                boolean z12;
                switch (i12) {
                    case 0:
                        List list = (List) obj;
                        l lVar = this.f6472b;
                        u0 u0Var2 = lVar.T0().f6438o;
                        if (u0Var2 != null) {
                            t0 t0Var = u0Var2.f35797a;
                            j3.h hVar3 = t0Var.f35784a;
                            y0 y0Var = lVar.R;
                            y yVar = lVar.f6477a0;
                            u0Var = new u0(new t0(hVar3, y0.e(y0Var, yVar != null ? yVar.a() : g2.x.f28622i, 0L, null, null, null, 0L, 0, 0L, 16777214), t0Var.f35786c, t0Var.f35787d, t0Var.f35788e, t0Var.f35789f, t0Var.f35790g, t0Var.f35791h, t0Var.f35792i, t0Var.f35793j), u0Var2.f35798b, u0Var2.f35799c);
                            list.add(u0Var);
                        } else {
                            u0Var = null;
                        }
                        return Boolean.valueOf(u0Var != null);
                    case 1:
                        j3.h hVar4 = (j3.h) obj;
                        l lVar2 = this.f6472b;
                        k kVar2 = lVar2.f6483g0;
                        r rVar = r.f50854a;
                        if (kVar2 == null) {
                            k kVar3 = new k(lVar2.Q, hVar4);
                            e eVar = new e(hVar4, lVar2.R, lVar2.S, lVar2.U, lVar2.V, lVar2.W, lVar2.X, rVar, lVar2.f6478b0);
                            eVar.d(lVar2.T0().f6435k);
                            kVar3.f6476d = eVar;
                            lVar2.f6483g0 = kVar3;
                        } else if (!kotlin.jvm.internal.m.a(hVar4, kVar2.f6474b)) {
                            kVar2.f6474b = hVar4;
                            e eVar2 = kVar2.f6476d;
                            if (eVar2 != null) {
                                y0 y0Var2 = lVar2.R;
                                n3.h hVar5 = lVar2.S;
                                int i13 = lVar2.U;
                                boolean z13 = lVar2.V;
                                int i14 = lVar2.W;
                                int i15 = lVar2.X;
                                s0.g gVar = lVar2.f6478b0;
                                eVar2.f6425a = hVar4;
                                eVar2.f(y0Var2);
                                eVar2.f6426b = hVar5;
                                eVar2.f6427c = i13;
                                eVar2.f6428d = z13;
                                eVar2.f6429e = i14;
                                eVar2.f6430f = i15;
                                eVar2.f6431g = rVar;
                                eVar2.f6432h = gVar;
                                eVar2.f6442s = (eVar2.f6442s << 2) | 2;
                                eVar2.m = null;
                                eVar2.f6438o = null;
                                eVar2.f6440q = -1;
                                eVar2.f6439p = -1;
                                eVar2.f6441r = null;
                            }
                        }
                        y2.f.o(lVar2);
                        y2.f.n(lVar2);
                        y2.f.m(lVar2);
                        return Boolean.TRUE;
                    default:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        l lVar3 = this.f6472b;
                        k kVar4 = lVar3.f6483g0;
                        if (kVar4 == null) {
                            z12 = false;
                        } else {
                            fz.c cVar = lVar3.f6479c0;
                            if (cVar != null) {
                                cVar.invoke(kVar4);
                            }
                            k kVar5 = lVar3.f6483g0;
                            if (kVar5 != null) {
                                kVar5.f6475c = zBooleanValue;
                            }
                            y2.f.o(lVar3);
                            y2.f.n(lVar3);
                            y2.f.m(lVar3);
                            z12 = true;
                        }
                        return Boolean.valueOf(z12);
                }
            }
        }));
        final int i13 = 2;
        b0Var.b(g3.n.m, new g3.a(null, new fz.c(this) { // from class: c1.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f6472b;

            {
                this.f6472b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                u0 u0Var;
                boolean z12;
                switch (i13) {
                    case 0:
                        List list = (List) obj;
                        l lVar = this.f6472b;
                        u0 u0Var2 = lVar.T0().f6438o;
                        if (u0Var2 != null) {
                            t0 t0Var = u0Var2.f35797a;
                            j3.h hVar3 = t0Var.f35784a;
                            y0 y0Var = lVar.R;
                            y yVar = lVar.f6477a0;
                            u0Var = new u0(new t0(hVar3, y0.e(y0Var, yVar != null ? yVar.a() : g2.x.f28622i, 0L, null, null, null, 0L, 0, 0L, 16777214), t0Var.f35786c, t0Var.f35787d, t0Var.f35788e, t0Var.f35789f, t0Var.f35790g, t0Var.f35791h, t0Var.f35792i, t0Var.f35793j), u0Var2.f35798b, u0Var2.f35799c);
                            list.add(u0Var);
                        } else {
                            u0Var = null;
                        }
                        return Boolean.valueOf(u0Var != null);
                    case 1:
                        j3.h hVar4 = (j3.h) obj;
                        l lVar2 = this.f6472b;
                        k kVar2 = lVar2.f6483g0;
                        r rVar = r.f50854a;
                        if (kVar2 == null) {
                            k kVar3 = new k(lVar2.Q, hVar4);
                            e eVar = new e(hVar4, lVar2.R, lVar2.S, lVar2.U, lVar2.V, lVar2.W, lVar2.X, rVar, lVar2.f6478b0);
                            eVar.d(lVar2.T0().f6435k);
                            kVar3.f6476d = eVar;
                            lVar2.f6483g0 = kVar3;
                        } else if (!kotlin.jvm.internal.m.a(hVar4, kVar2.f6474b)) {
                            kVar2.f6474b = hVar4;
                            e eVar2 = kVar2.f6476d;
                            if (eVar2 != null) {
                                y0 y0Var2 = lVar2.R;
                                n3.h hVar5 = lVar2.S;
                                int i14 = lVar2.U;
                                boolean z13 = lVar2.V;
                                int i15 = lVar2.W;
                                int i16 = lVar2.X;
                                s0.g gVar = lVar2.f6478b0;
                                eVar2.f6425a = hVar4;
                                eVar2.f(y0Var2);
                                eVar2.f6426b = hVar5;
                                eVar2.f6427c = i14;
                                eVar2.f6428d = z13;
                                eVar2.f6429e = i15;
                                eVar2.f6430f = i16;
                                eVar2.f6431g = rVar;
                                eVar2.f6432h = gVar;
                                eVar2.f6442s = (eVar2.f6442s << 2) | 2;
                                eVar2.m = null;
                                eVar2.f6438o = null;
                                eVar2.f6440q = -1;
                                eVar2.f6439p = -1;
                                eVar2.f6441r = null;
                            }
                        }
                        y2.f.o(lVar2);
                        y2.f.n(lVar2);
                        y2.f.m(lVar2);
                        return Boolean.TRUE;
                    default:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        l lVar3 = this.f6472b;
                        k kVar4 = lVar3.f6483g0;
                        if (kVar4 == null) {
                            z12 = false;
                        } else {
                            fz.c cVar = lVar3.f6479c0;
                            if (cVar != null) {
                                cVar.invoke(kVar4);
                            }
                            k kVar5 = lVar3.f6483g0;
                            if (kVar5 != null) {
                                kVar5.f6475c = zBooleanValue;
                            }
                            y2.f.o(lVar3);
                            y2.f.n(lVar3);
                            y2.f.m(lVar3);
                            z12 = true;
                        }
                        return Boolean.valueOf(z12);
                }
            }
        }));
        b0Var.b(g3.n.f28678n, new g3.a(null, new av.d(this, 21)));
        g3.z.a(b0Var, r9);
    }

    @Override // y2.z
    public final int p(q0 q0Var, p0 p0Var, int i11) {
        return U0(q0Var).a(i11, q0Var.getLayoutDirection());
    }

    @Override // y2.z
    public final int t(q0 q0Var, p0 p0Var, int i11) {
        return U0(q0Var).a(i11, q0Var.getLayoutDirection());
    }
}
