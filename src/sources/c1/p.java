package c1;

import android.os.Trace;
import com.yalantis.ucrop.view.CropImageView;
import g2.t;
import g2.v;
import g2.v0;
import g2.x;
import g2.y;
import g3.a0;
import j3.b0;
import j3.t0;
import j3.u0;
import j3.y0;
import java.util.HashMap;
import java.util.List;
import k3.r;
import kotlin.KotlinNothingValueException;
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
public final class p extends q implements z, y2.q, b2 {
    public String Q;
    public y0 R;
    public n3.h S;
    public int T;
    public boolean U;
    public int V;
    public int W;
    public y X;
    public HashMap Y;
    public g Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public n f6497a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public o f6498b0;

    /* JADX WARN: Code duplicated, block: B:11:0x0010  */
    @Override // y2.z
    public final int E(q0 q0Var, p0 p0Var, int i11) {
        g gVarT0;
        o oVar = this.f6498b0;
        if (oVar == null) {
            gVarT0 = T0();
        } else {
            if (!oVar.f6495c) {
                oVar = null;
            }
            if (oVar == null || (gVarT0 = oVar.f6496d) == null) {
                gVarT0 = T0();
            }
        }
        gVarT0.d(q0Var);
        return o0.p(gVarT0.e(q0Var.getLayoutDirection()).b());
    }

    @Override // z1.q
    public final boolean I0() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0010  */
    @Override // y2.z
    public final int L(q0 q0Var, p0 p0Var, int i11) {
        g gVarT0;
        o oVar = this.f6498b0;
        if (oVar == null) {
            gVarT0 = T0();
        } else {
            if (!oVar.f6495c) {
                oVar = null;
            }
            if (oVar == null || (gVarT0 = oVar.f6496d) == null) {
                gVarT0 = T0();
            }
        }
        gVarT0.d(q0Var);
        return o0.p(gVarT0.e(q0Var.getLayoutDirection()).c());
    }

    public final g T0() {
        if (this.Z == null) {
            this.Z = new g(this.Q, this.R, this.S, this.T, this.U, this.V, this.W);
        }
        g gVar = this.Z;
        kotlin.jvm.internal.m.c(gVar);
        return gVar;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0015 A[Catch: all -> 0x004a, TryCatch #0 {all -> 0x004a, blocks: (B:3:0x0005, B:5:0x0009, B:10:0x0011, B:13:0x0019, B:15:0x0028, B:16:0x002b, B:18:0x0036, B:20:0x0042, B:23:0x004c, B:24:0x0073, B:12:0x0015), top: B:29:0x0005 }] */
    @Override // y2.z
    public final r0 b(s0 s0Var, p0 p0Var, long j11) {
        g gVarT0;
        Trace.beginSection("TextStringSimpleNode::measure");
        try {
            o oVar = this.f6498b0;
            if (oVar == null) {
                gVarT0 = T0();
            } else {
                if (!oVar.f6495c) {
                    oVar = null;
                }
                if (oVar == null || (gVarT0 = oVar.f6496d) == null) {
                    gVarT0 = T0();
                }
            }
            gVarT0.d(s0Var);
            boolean zB = gVarT0.b(j11, s0Var.getLayoutDirection());
            b0 b0Var = gVarT0.f6456n;
            if (b0Var != null) {
                b0Var.a();
            }
            j3.b bVar = gVarT0.f6453j;
            kotlin.jvm.internal.m.c(bVar);
            r rVar = bVar.f35664d;
            long j12 = gVarT0.f6455l;
            if (zB) {
                y2.f.v(this, 2).j1();
                HashMap map = this.Y;
                if (map == null) {
                    map = new HashMap(2);
                    this.Y = map;
                }
                map.put(w2.c.f54475a, Integer.valueOf(Math.round(rVar.d(0))));
                map.put(w2.c.f54476b, Integer.valueOf(Math.round(rVar.d(rVar.f37895g - 1))));
            }
            int i11 = (int) (j12 >> 32);
            int i12 = (int) (j12 & 4294967295L);
            g1 g1VarB = p0Var.B(com.bumptech.glide.f.q(i11, i11, i12, i12));
            HashMap map2 = this.Y;
            kotlin.jvm.internal.m.c(map2);
            return s0Var.q0(i11, i12, map2, new i(g1VarB, 1));
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0016  */
    @Override // y2.q
    public final void i(k0 k0Var) {
        g gVarT0;
        if (this.P) {
            o oVar = this.f6498b0;
            if (oVar == null) {
                gVarT0 = T0();
            } else {
                if (!oVar.f6495c) {
                    oVar = null;
                }
                if (oVar == null || (gVarT0 = oVar.f6496d) == null) {
                    gVarT0 = T0();
                }
            }
            j3.b bVar = gVarT0.f6453j;
            if (bVar == null) {
                i0.a.b("Internal Error: ParagraphLayoutCache could not provide a Paragraph during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: (layoutCache=" + this.Z + ", textSubstitution=" + this.f6498b0 + ')');
                throw new KotlinNothingValueException();
            }
            v vVarX = k0Var.f56937a.f34121b.x();
            boolean z11 = gVarT0.f6454k;
            if (z11) {
                long j11 = gVarT0.f6455l;
                vVarX.e();
                vVarX.m(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, (int) (j11 >> 32), (int) (j11 & 4294967295L), 1);
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
                    bVar.g(vVarX, tVarC, this.R.f35827a.f35754a.a(), v0Var2, lVar2, eVar2);
                } else {
                    y yVar = this.X;
                    long jA = yVar != null ? yVar.a() : x.f28622i;
                    if (jA == 16) {
                        jA = this.R.b() != 16 ? this.R.b() : x.f28615b;
                    }
                    bVar.f(vVarX, jA, v0Var2, lVar2, eVar2, 3);
                }
            } finally {
                if (z11) {
                    vVarX.p();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [fz.c] */
    /* JADX WARN: Type inference failed for: r0v2, types: [c1.n] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    @Override // y2.b2
    public final void i0(g3.b0 b0Var) {
        n nVar = this.f6497a0;
        ?? r9 = nVar;
        if (nVar == null) {
            final int i11 = 0;
            ?? r11 = new fz.c(this) { // from class: c1.n

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ p f6492b;

                {
                    this.f6492b = this;
                }

                /* JADX WARN: Code duplicated, block: B:27:0x00c8  */
                @Override // fz.c
                public final Object invoke(Object obj) {
                    v3.c cVar;
                    u0 u0Var;
                    boolean z11;
                    switch (i11) {
                        case 0:
                            List list = (List) obj;
                            p pVar = this.f6492b;
                            g gVarT0 = pVar.T0();
                            y0 y0Var = pVar.R;
                            y yVar = pVar.X;
                            y0 y0VarE = y0.e(y0Var, yVar != null ? yVar.a() : x.f28622i, 0L, null, null, null, 0L, 0, 0L, 16777214);
                            v3.m mVar = gVarT0.f6457o;
                            u0 u0Var2 = null;
                            if (mVar == null || (cVar = gVarT0.f6452i) == null) {
                                u0Var = null;
                            } else {
                                j3.h hVar = new j3.h(gVarT0.f6444a);
                                if (gVarT0.f6453j == null || gVarT0.f6456n == null) {
                                    u0Var = null;
                                } else {
                                    long j11 = gVarT0.f6458p & (-8589934589L);
                                    int i12 = gVarT0.f6449f;
                                    boolean z12 = gVarT0.f6448e;
                                    int i13 = gVarT0.f6447d;
                                    n3.h hVar2 = gVarT0.f6446c;
                                    ry.r rVar = ry.r.f50854a;
                                    u0Var = new u0(new t0(hVar, y0VarE, rVar, i12, z12, i13, cVar, mVar, hVar2, j11), new j3.x(new a9.i(hVar, y0VarE, (List) rVar, cVar, hVar2), j11, gVarT0.f6449f, gVarT0.f6447d), gVarT0.f6455l);
                                }
                            }
                            if (u0Var != null) {
                                list.add(u0Var);
                                u0Var2 = u0Var;
                            }
                            return Boolean.valueOf(u0Var2 != null);
                        case 1:
                            String str = ((j3.h) obj).f35700b;
                            p pVar2 = this.f6492b;
                            o oVar = pVar2.f6498b0;
                            if (oVar == null) {
                                o oVar2 = new o(pVar2.Q, str);
                                g gVar = new g(str, pVar2.R, pVar2.S, pVar2.T, pVar2.U, pVar2.V, pVar2.W);
                                gVar.d(pVar2.T0().f6452i);
                                oVar2.f6496d = gVar;
                                pVar2.f6498b0 = oVar2;
                            } else if (!kotlin.jvm.internal.m.a(str, oVar.f6494b)) {
                                oVar.f6494b = str;
                                g gVar2 = oVar.f6496d;
                                if (gVar2 != null) {
                                    y0 y0Var2 = pVar2.R;
                                    n3.h hVar3 = pVar2.S;
                                    int i14 = pVar2.T;
                                    boolean z13 = pVar2.U;
                                    int i15 = pVar2.V;
                                    int i16 = pVar2.W;
                                    gVar2.f6444a = str;
                                    gVar2.f6445b = y0Var2;
                                    gVar2.f6446c = hVar3;
                                    gVar2.f6447d = i14;
                                    gVar2.f6448e = z13;
                                    gVar2.f6449f = i15;
                                    gVar2.f6450g = i16;
                                    gVar2.f6461s = (gVar2.f6461s << 2) | 2;
                                    gVar2.c();
                                }
                            }
                            y2.f.o(pVar2);
                            y2.f.n(pVar2);
                            y2.f.m(pVar2);
                            return Boolean.TRUE;
                        default:
                            boolean zBooleanValue = ((Boolean) obj).booleanValue();
                            p pVar3 = this.f6492b;
                            o oVar3 = pVar3.f6498b0;
                            if (oVar3 == null) {
                                z11 = false;
                            } else {
                                oVar3.f6495c = zBooleanValue;
                                y2.f.o(pVar3);
                                y2.f.n(pVar3);
                                y2.f.m(pVar3);
                                z11 = true;
                            }
                            return Boolean.valueOf(z11);
                    }
                }
            };
            this.f6497a0 = r11;
            r9 = r11;
        }
        j3.h hVar = new j3.h(this.Q);
        mz.j[] jVarArr = g3.z.f28737a;
        b0Var.b(g3.x.B, ns.o.K(hVar));
        o oVar = this.f6498b0;
        if (oVar != null) {
            boolean z11 = oVar.f6495c;
            a0 a0Var = g3.x.D;
            mz.j[] jVarArr2 = g3.z.f28737a;
            mz.j jVar = jVarArr2[17];
            b0Var.b(a0Var, Boolean.valueOf(z11));
            j3.h hVar2 = new j3.h(oVar.f6494b);
            a0 a0Var2 = g3.x.C;
            mz.j jVar2 = jVarArr2[16];
            b0Var.b(a0Var2, hVar2);
        }
        final int i12 = 1;
        b0Var.b(g3.n.f28677l, new g3.a(null, new fz.c(this) { // from class: c1.n

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p f6492b;

            {
                this.f6492b = this;
            }

            /* JADX WARN: Code duplicated, block: B:27:0x00c8  */
            @Override // fz.c
            public final Object invoke(Object obj) {
                v3.c cVar;
                u0 u0Var;
                boolean z12;
                switch (i12) {
                    case 0:
                        List list = (List) obj;
                        p pVar = this.f6492b;
                        g gVarT0 = pVar.T0();
                        y0 y0Var = pVar.R;
                        y yVar = pVar.X;
                        y0 y0VarE = y0.e(y0Var, yVar != null ? yVar.a() : x.f28622i, 0L, null, null, null, 0L, 0, 0L, 16777214);
                        v3.m mVar = gVarT0.f6457o;
                        u0 u0Var2 = null;
                        if (mVar == null || (cVar = gVarT0.f6452i) == null) {
                            u0Var = null;
                        } else {
                            j3.h hVar3 = new j3.h(gVarT0.f6444a);
                            if (gVarT0.f6453j == null || gVarT0.f6456n == null) {
                                u0Var = null;
                            } else {
                                long j11 = gVarT0.f6458p & (-8589934589L);
                                int i13 = gVarT0.f6449f;
                                boolean z13 = gVarT0.f6448e;
                                int i14 = gVarT0.f6447d;
                                n3.h hVar4 = gVarT0.f6446c;
                                ry.r rVar = ry.r.f50854a;
                                u0Var = new u0(new t0(hVar3, y0VarE, rVar, i13, z13, i14, cVar, mVar, hVar4, j11), new j3.x(new a9.i(hVar3, y0VarE, (List) rVar, cVar, hVar4), j11, gVarT0.f6449f, gVarT0.f6447d), gVarT0.f6455l);
                            }
                        }
                        if (u0Var != null) {
                            list.add(u0Var);
                            u0Var2 = u0Var;
                        }
                        return Boolean.valueOf(u0Var2 != null);
                    case 1:
                        String str = ((j3.h) obj).f35700b;
                        p pVar2 = this.f6492b;
                        o oVar2 = pVar2.f6498b0;
                        if (oVar2 == null) {
                            o oVar3 = new o(pVar2.Q, str);
                            g gVar = new g(str, pVar2.R, pVar2.S, pVar2.T, pVar2.U, pVar2.V, pVar2.W);
                            gVar.d(pVar2.T0().f6452i);
                            oVar3.f6496d = gVar;
                            pVar2.f6498b0 = oVar3;
                        } else if (!kotlin.jvm.internal.m.a(str, oVar2.f6494b)) {
                            oVar2.f6494b = str;
                            g gVar2 = oVar2.f6496d;
                            if (gVar2 != null) {
                                y0 y0Var2 = pVar2.R;
                                n3.h hVar5 = pVar2.S;
                                int i15 = pVar2.T;
                                boolean z14 = pVar2.U;
                                int i16 = pVar2.V;
                                int i17 = pVar2.W;
                                gVar2.f6444a = str;
                                gVar2.f6445b = y0Var2;
                                gVar2.f6446c = hVar5;
                                gVar2.f6447d = i15;
                                gVar2.f6448e = z14;
                                gVar2.f6449f = i16;
                                gVar2.f6450g = i17;
                                gVar2.f6461s = (gVar2.f6461s << 2) | 2;
                                gVar2.c();
                            }
                        }
                        y2.f.o(pVar2);
                        y2.f.n(pVar2);
                        y2.f.m(pVar2);
                        return Boolean.TRUE;
                    default:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        p pVar3 = this.f6492b;
                        o oVar4 = pVar3.f6498b0;
                        if (oVar4 == null) {
                            z12 = false;
                        } else {
                            oVar4.f6495c = zBooleanValue;
                            y2.f.o(pVar3);
                            y2.f.n(pVar3);
                            y2.f.m(pVar3);
                            z12 = true;
                        }
                        return Boolean.valueOf(z12);
                }
            }
        }));
        final int i13 = 2;
        b0Var.b(g3.n.m, new g3.a(null, new fz.c(this) { // from class: c1.n

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p f6492b;

            {
                this.f6492b = this;
            }

            /* JADX WARN: Code duplicated, block: B:27:0x00c8  */
            @Override // fz.c
            public final Object invoke(Object obj) {
                v3.c cVar;
                u0 u0Var;
                boolean z12;
                switch (i13) {
                    case 0:
                        List list = (List) obj;
                        p pVar = this.f6492b;
                        g gVarT0 = pVar.T0();
                        y0 y0Var = pVar.R;
                        y yVar = pVar.X;
                        y0 y0VarE = y0.e(y0Var, yVar != null ? yVar.a() : x.f28622i, 0L, null, null, null, 0L, 0, 0L, 16777214);
                        v3.m mVar = gVarT0.f6457o;
                        u0 u0Var2 = null;
                        if (mVar == null || (cVar = gVarT0.f6452i) == null) {
                            u0Var = null;
                        } else {
                            j3.h hVar3 = new j3.h(gVarT0.f6444a);
                            if (gVarT0.f6453j == null || gVarT0.f6456n == null) {
                                u0Var = null;
                            } else {
                                long j11 = gVarT0.f6458p & (-8589934589L);
                                int i14 = gVarT0.f6449f;
                                boolean z13 = gVarT0.f6448e;
                                int i15 = gVarT0.f6447d;
                                n3.h hVar4 = gVarT0.f6446c;
                                ry.r rVar = ry.r.f50854a;
                                u0Var = new u0(new t0(hVar3, y0VarE, rVar, i14, z13, i15, cVar, mVar, hVar4, j11), new j3.x(new a9.i(hVar3, y0VarE, (List) rVar, cVar, hVar4), j11, gVarT0.f6449f, gVarT0.f6447d), gVarT0.f6455l);
                            }
                        }
                        if (u0Var != null) {
                            list.add(u0Var);
                            u0Var2 = u0Var;
                        }
                        return Boolean.valueOf(u0Var2 != null);
                    case 1:
                        String str = ((j3.h) obj).f35700b;
                        p pVar2 = this.f6492b;
                        o oVar2 = pVar2.f6498b0;
                        if (oVar2 == null) {
                            o oVar3 = new o(pVar2.Q, str);
                            g gVar = new g(str, pVar2.R, pVar2.S, pVar2.T, pVar2.U, pVar2.V, pVar2.W);
                            gVar.d(pVar2.T0().f6452i);
                            oVar3.f6496d = gVar;
                            pVar2.f6498b0 = oVar3;
                        } else if (!kotlin.jvm.internal.m.a(str, oVar2.f6494b)) {
                            oVar2.f6494b = str;
                            g gVar2 = oVar2.f6496d;
                            if (gVar2 != null) {
                                y0 y0Var2 = pVar2.R;
                                n3.h hVar5 = pVar2.S;
                                int i16 = pVar2.T;
                                boolean z14 = pVar2.U;
                                int i17 = pVar2.V;
                                int i18 = pVar2.W;
                                gVar2.f6444a = str;
                                gVar2.f6445b = y0Var2;
                                gVar2.f6446c = hVar5;
                                gVar2.f6447d = i16;
                                gVar2.f6448e = z14;
                                gVar2.f6449f = i17;
                                gVar2.f6450g = i18;
                                gVar2.f6461s = (gVar2.f6461s << 2) | 2;
                                gVar2.c();
                            }
                        }
                        y2.f.o(pVar2);
                        y2.f.n(pVar2);
                        y2.f.m(pVar2);
                        return Boolean.TRUE;
                    default:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        p pVar3 = this.f6492b;
                        o oVar4 = pVar3.f6498b0;
                        if (oVar4 == null) {
                            z12 = false;
                        } else {
                            oVar4.f6495c = zBooleanValue;
                            y2.f.o(pVar3);
                            y2.f.n(pVar3);
                            y2.f.m(pVar3);
                            z12 = true;
                        }
                        return Boolean.valueOf(z12);
                }
            }
        }));
        b0Var.b(g3.n.f28678n, new g3.a(null, new av.d(this, 22)));
        g3.z.a(b0Var, r9);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0010  */
    @Override // y2.z
    public final int p(q0 q0Var, p0 p0Var, int i11) {
        g gVarT0;
        o oVar = this.f6498b0;
        if (oVar == null) {
            gVarT0 = T0();
        } else {
            if (!oVar.f6495c) {
                oVar = null;
            }
            if (oVar == null || (gVarT0 = oVar.f6496d) == null) {
                gVarT0 = T0();
            }
        }
        gVarT0.d(q0Var);
        return gVarT0.a(i11, q0Var.getLayoutDirection());
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0010  */
    @Override // y2.z
    public final int t(q0 q0Var, p0 p0Var, int i11) {
        g gVarT0;
        o oVar = this.f6498b0;
        if (oVar == null) {
            gVarT0 = T0();
        } else {
            if (!oVar.f6495c) {
                oVar = null;
            }
            if (oVar == null || (gVarT0 = oVar.f6496d) == null) {
                gVarT0 = T0();
            }
        }
        gVarT0.d(q0Var);
        return gVarT0.a(i11, q0Var.getLayoutDirection());
    }
}
