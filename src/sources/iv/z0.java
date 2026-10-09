package iv;

import bt.e6;
import bt.j5;
import bt.q3;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.lingodeer.R;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import fr.j3;
import h1.dc;
import h1.fc;
import h1.k7;
import h1.s1;
import h1.ua;
import h1.v1;
import j0.a2;
import j0.c2;
import j0.e2;
import j0.i1;
import j0.z1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import l1.c3;
import l1.q1;
import l1.x1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class z0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f34879b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f34880c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f34878a = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f34881d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float f34882e = 4;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final float f34883f = 50;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final float f34884g = 56;

    static {
        float f5 = 62;
        f34879b = f5;
        f34880c = f5;
    }

    public static final long A(l1.n nVar) {
        return g2.x.c(((s1) ((l1.s) nVar).j(v1.f31180a)).A, 0.24f);
    }

    public static final j3.y0 B(long j11, boolean z11, l1.n nVar) {
        return j3.y0.a(((dc) ((l1.s) nVar).j(fc.f30256a)).f30178k, j11, j3.A(z11 ? 14 : 15), z11 ? n3.s.K : n3.s.f43178t, null, null, 0L, null, null, 0, 0, j3.A(z11 ? 18 : 20), null, 16646136);
    }

    public static final void a(int i11, fz.a onOpenAlphabetChart, l1.n nVar, z1.r rVar) {
        int i12;
        fz.a aVar;
        z1.r rVar2;
        kotlin.jvm.internal.m.f(onOpenAlphabetChart, "onOpenAlphabetChart");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1521360725);
        if ((i11 & 6) == 0) {
            i12 = (sVar.h(onOpenAlphabetChart) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.f(rVar) ? 32 : 16;
        }
        if (sVar.T(i12 & 1, (i12 & 19) != 18)) {
            int i13 = i12 << 3;
            aVar = onOpenAlphabetChart;
            rVar2 = rVar;
            j0.a(ub.a.e0(sVar, R.string.japanese_alphabet_chart), aVar, rVar2, new v3.f(45), sVar, (i13 & 112) | 3072 | (i13 & 896), 0);
        } else {
            aVar = onOpenAlphabetChart;
            rVar2 = rVar;
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new s0(i11, 0, aVar, rVar2);
        }
    }

    public static final void b(int i11, String str, l1.n nVar, z1.r rVar) {
        int i12;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-1760184837);
        if ((i11 & 6) == 0) {
            i12 = i11 | (sVar.f(str) ? 4 : 2);
        } else {
            i12 = i11;
        }
        int i13 = i12 | (sVar.f(rVar) ? 32 : 16);
        if (sVar.T(i13 & 1, (i13 & 19) != 18)) {
            c3 c3Var = v1.f31180a;
            z1.r rVarH = d0.n.h(rVar, g2.x.c(((s1) sVar.j(c3Var)).f31017a, 0.18f), g2.f0.f28556b);
            w2.q0 q0VarD = j0.o.d(z1.c.f58467e, false);
            int iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, rVarH);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(y2.j.f56917f, q0VarD, sVar);
            l1.t.J(y2.j.f56916e, q1VarL, sVar);
            y2.h hVar = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
            }
            l1.t.J(y2.j.f56915d, rVarC, sVar);
            List listW0 = oz.q.W0(str, new String[]{"\n"}, 2, 2);
            if (listW0.size() == 2) {
                sVar.d0(1299758267);
                sVar.d0(1150307569);
                j3.e eVar = new j3.e();
                eVar.i(new j3.p0(((s1) sVar.j(c3Var)).f31034q, j3.A(14), n3.s.K, (n3.o) null, (n3.p) null, (n3.i) null, (String) null, 0L, (u3.a) null, (u3.p) null, (q3.b) null, 0L, (u3.l) null, (g2.v0) null, 65528));
                eVar.d((String) listW0.get(0));
                eVar.e();
                eVar.d("\n");
                eVar.i(new j3.p0(((s1) sVar.j(c3Var)).f31036s, j3.A(12), n3.s.f43178t, (n3.o) null, (n3.p) null, (n3.i) null, (String) null, 0L, (u3.a) null, (u3.p) null, (q3.b) null, 0L, (u3.l) null, (g2.v0) null, 65528));
                eVar.d((String) listW0.get(1));
                eVar.e();
                j3.h hVarJ = eVar.j();
                sVar.p(false);
                ua.c(hVarJ, null, 0L, 0L, null, 0L, new u3.k(3), j3.A(16), 0, false, 0, 0, null, null, null, sVar, 0, 6, 260606);
                sVar = sVar;
                sVar.p(false);
            } else {
                sVar.d0(1300714772);
                ua.b(str, null, ((s1) sVar.j(c3Var)).f31034q, j3.A(14), null, n3.s.K, null, 0L, new u3.k(3), j3.A(18), 0, false, 0, 0, null, sVar, (i13 & 14) | 199680, 6, 129490);
                sVar = sVar;
                sVar.p(false);
            }
            sVar.p(true);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new u0(str, rVar, i11, 0);
        }
    }

    public static final void c(z1.r rVar, l1.n nVar, int i11) {
        l1.s sVar = (l1.s) nVar;
        sVar.f0(337245508);
        if (sVar.T(i11 & 1, (i11 & 3) != 2)) {
            a2 a2VarA = z1.a(j0.i.f35303a, z1.c.M, sVar, 48);
            int iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, rVar);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(y2.j.f56917f, a2VarA, sVar);
            l1.t.J(y2.j.f56916e, q1VarL, sVar);
            y2.h hVar = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
            }
            l1.t.J(y2.j.f56915d, rVarC, sVar);
            z1.o oVar = z1.o.f58481a;
            z1.r rVarB = d2.h.b(e2.n(oVar, 4), r0.f.f48733a);
            c3 c3Var = v1.f31180a;
            long j11 = ((s1) sVar.j(c3Var)).f31017a;
            g2.r0 r0Var = g2.f0.f28556b;
            j0.o.a(d0.n.h(rVarB, j11, r0Var), sVar, 0);
            j0.o.a(d0.n.h(e2.g(e2.s(oVar, 22), 1), ((s1) sVar.j(c3Var)).f31017a, r0Var), sVar, 0);
            sVar.p(true);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new ch.g(rVar, i11, 10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0125  */
    /* JADX WARN: Code duplicated, block: B:40:0x0131  */
    /* JADX WARN: Code duplicated, block: B:43:0x015f  */
    /* JADX WARN: Code duplicated, block: B:44:0x0163  */
    /* JADX WARN: Code duplicated, block: B:49:0x017e  */
    /* JADX WARN: Code duplicated, block: B:52:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:53:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:58:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:61:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:63:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:66:0x0242  */
    /* JADX WARN: Code duplicated, block: B:68:0x0250  */
    /* JADX WARN: Code duplicated, block: B:71:0x026c  */
    /* JADX WARN: Code duplicated, block: B:74:0x027a  */
    /* JADX WARN: Code duplicated, block: B:77:0x0283  */
    /* JADX WARN: Code duplicated, block: B:79:0x0287  */
    public static final void d(kv.b bVar, fz.c cVar, l1.n nVar, int i11) {
        long jC;
        long jA;
        boolean z11;
        float f5;
        int iHashCode;
        int iHashCode2;
        boolean z12;
        long j11;
        float f11;
        boolean z13;
        long j12;
        l1.s sVar;
        ArrayList arrayList;
        int size;
        int i12;
        float f12;
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(-109683845);
        int i13 = i11 | (sVar2.h(bVar) ? 4 : 2) | (sVar2.h(cVar) ? 32 : 16);
        if (sVar2.T(i13 & 1, (i13 & 19) != 18)) {
            boolean z14 = bVar.f38710b;
            if (z14) {
                sVar2.d0(878839065);
                jC = g2.x.c(((s1) sVar2.j(v1.f31180a)).f31021c, 0.16f);
                sVar2.p(false);
            } else {
                sVar2.d0(878921494);
                jC = ((s1) sVar2.j(v1.f31180a)).f31033p;
                sVar2.p(false);
            }
            if (z14) {
                sVar2.d0(879015362);
                jA = g2.x.c(((s1) sVar2.j(v1.f31180a)).f31017a, 0.36f);
                sVar2.p(false);
            } else {
                sVar2.d0(879088832);
                jA = A(sVar2);
                sVar2.p(false);
            }
            z1.o oVar = z1.o.f58481a;
            float f13 = 4;
            z1.r rVarB = d2.h.b(e2.e(oVar, 1.0f), r0.f.d(f13));
            g2.r0 r0Var = g2.f0.f28556b;
            z1.r rVarJ = d0.n.j(d0.n.h(rVarB, jC, r0Var), f34878a, jA, r0.f.d(f13));
            float f14 = 1;
            z1.r rVarA = j0.c.A(rVarJ, f14);
            a2 a2VarA = z1.a(j0.i.g(f14), z1.c.M, sVar2, 54);
            int iHashCode3 = Long.hashCode(sVar2.T);
            q1 q1VarL = sVar2.l();
            z1.r rVarC = z1.a.c(sVar2, rVarA);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar2.h0();
            if (sVar2.S) {
                sVar2.k(iVar);
            } else {
                sVar2.r0();
            }
            y2.h hVar = y2.j.f56917f;
            l1.t.J(hVar, a2VarA, sVar2);
            y2.h hVar2 = y2.j.f56916e;
            l1.t.J(hVar2, q1VarL, sVar2);
            y2.h hVar3 = y2.j.f56918g;
            if (sVar2.S) {
                z11 = z14;
            } else {
                z11 = z14;
                if (!kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode3))) {
                }
                y2.h hVar4 = y2.j.f56915d;
                l1.t.J(hVar4, rVarC, sVar2);
                if (0.9f <= 0.0d) {
                    k0.a.a("invalid weight; must be greater than zero");
                }
                i1 i1Var = new i1(0.9f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.9f, true);
                f5 = f34880c;
                z1.r rVarH = d0.n.h(e2.g(i1Var, f5), jC, r0Var);
                w2.q0 q0VarD = j0.o.d(z1.c.f58467e, false);
                long j13 = jC;
                iHashCode = Long.hashCode(sVar2.T);
                q1 q1VarL2 = sVar2.l();
                z1.r rVarC2 = z1.a.c(sVar2, rVarH);
                sVar2.h0();
                if (sVar2.S) {
                    sVar2.k(iVar);
                } else {
                    sVar2.r0();
                }
                l1.t.J(hVar, q0VarD, sVar2);
                l1.t.J(hVar2, q1VarL2, sVar2);
                if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode))) {
                    defpackage.e.A(iHashCode, sVar2, iHashCode, hVar3);
                }
                l1.t.J(hVar4, rVarC2, sVar2);
                j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.P, sVar2, 48);
                iHashCode2 = Long.hashCode(sVar2.T);
                q1 q1VarL3 = sVar2.l();
                z1.r rVarC3 = z1.a.c(sVar2, oVar);
                sVar2.h0();
                if (sVar2.S) {
                    sVar2.k(iVar);
                } else {
                    sVar2.r0();
                }
                l1.t.J(hVar, uVarA, sVar2);
                l1.t.J(hVar2, q1VarL3, sVar2);
                if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode2))) {
                    defpackage.e.A(iHashCode2, sVar2, iHashCode2, hVar3);
                }
                l1.t.J(hVar4, rVarC3, sVar2);
                String str = bVar.f38709a;
                if (z11) {
                    sVar2.d0(-2127825482);
                    j11 = ((s1) sVar2.j(v1.f31180a)).f31017a;
                    z12 = false;
                    sVar2.p(false);
                } else {
                    z12 = false;
                    sVar2.d0(-2127739147);
                    j11 = ((s1) sVar2.j(v1.f31180a)).f31028j;
                    sVar2.p(false);
                }
                f11 = 1.0f;
                z13 = z12;
                j12 = j13;
                ua.b(str, null, j11, j3.A(16), null, null, null, 0L, new u3.k(3), 0L, 0, false, 1, 0, null, sVar2, 3072, 3072, 122354);
                sVar = sVar2;
                if (bVar.f38711c) {
                    sVar.d0(-2127480204);
                    f(sVar, z13 ? 1 : 0);
                } else {
                    sVar.d0(-2141055321);
                }
                sVar.p(z13);
                sVar.p(true);
                sVar.p(true);
                sVar.d0(-946491715);
                arrayList = bVar.f38712d;
                size = arrayList.size();
                i12 = z13 ? 1 : 0;
                while (i12 < size) {
                    Object obj = arrayList.get(i12);
                    i12++;
                    kv.z0 z0Var = (kv.z0) obj;
                    if (f11 <= 0.0d) {
                        k0.a.a("invalid weight; must be greater than zero");
                    }
                    if (f11 > Float.MAX_VALUE) {
                        f12 = Float.MAX_VALUE;
                    } else {
                        f12 = f11;
                    }
                    long j14 = j12;
                    l1.s sVar3 = sVar;
                    p(z0Var, cVar, e2.g(new i1(f12, true), f5), new g2.x(j12), sVar3, i13 & 112, 0);
                    sVar = sVar3;
                    f5 = f5;
                    z13 = z13 ? 1 : 0;
                    f11 = f11;
                    j12 = j14;
                }
                sVar2 = sVar;
                sVar2.p(z13);
                sVar2.p(true);
            }
            defpackage.e.A(iHashCode3, sVar2, iHashCode3, hVar3);
            y2.h hVar5 = y2.j.f56915d;
            l1.t.J(hVar5, rVarC, sVar2);
            if (0.9f <= 0.0d) {
                k0.a.a("invalid weight; must be greater than zero");
            }
            i1 i1Var2 = new i1(0.9f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.9f, true);
            f5 = f34880c;
            z1.r rVarH2 = d0.n.h(e2.g(i1Var2, f5), jC, r0Var);
            w2.q0 q0VarD2 = j0.o.d(z1.c.f58467e, false);
            long j15 = jC;
            iHashCode = Long.hashCode(sVar2.T);
            q1 q1VarL4 = sVar2.l();
            z1.r rVarC4 = z1.a.c(sVar2, rVarH2);
            sVar2.h0();
            if (sVar2.S) {
                sVar2.k(iVar);
            } else {
                sVar2.r0();
            }
            l1.t.J(hVar, q0VarD2, sVar2);
            l1.t.J(hVar2, q1VarL4, sVar2);
            if (sVar2.S) {
                defpackage.e.A(iHashCode, sVar2, iHashCode, hVar3);
            } else {
                defpackage.e.A(iHashCode, sVar2, iHashCode, hVar3);
            }
            l1.t.J(hVar5, rVarC4, sVar2);
            j0.u uVarA2 = j0.t.a(j0.i.f35305c, z1.c.P, sVar2, 48);
            iHashCode2 = Long.hashCode(sVar2.T);
            q1 q1VarL5 = sVar2.l();
            z1.r rVarC5 = z1.a.c(sVar2, oVar);
            sVar2.h0();
            if (sVar2.S) {
                sVar2.k(iVar);
            } else {
                sVar2.r0();
            }
            l1.t.J(hVar, uVarA2, sVar2);
            l1.t.J(hVar2, q1VarL5, sVar2);
            if (sVar2.S) {
                defpackage.e.A(iHashCode2, sVar2, iHashCode2, hVar3);
            } else {
                defpackage.e.A(iHashCode2, sVar2, iHashCode2, hVar3);
            }
            l1.t.J(hVar5, rVarC5, sVar2);
            String str2 = bVar.f38709a;
            if (z11) {
                sVar2.d0(-2127825482);
                j11 = ((s1) sVar2.j(v1.f31180a)).f31017a;
                z12 = false;
                sVar2.p(false);
            } else {
                z12 = false;
                sVar2.d0(-2127739147);
                j11 = ((s1) sVar2.j(v1.f31180a)).f31028j;
                sVar2.p(false);
            }
            f11 = 1.0f;
            z13 = z12;
            j12 = j15;
            ua.b(str2, null, j11, j3.A(16), null, null, null, 0L, new u3.k(3), 0L, 0, false, 1, 0, null, sVar2, 3072, 3072, 122354);
            sVar = sVar2;
            if (bVar.f38711c) {
                sVar.d0(-2127480204);
                f(sVar, z13 ? 1 : 0);
            } else {
                sVar.d0(-2141055321);
            }
            sVar.p(z13);
            sVar.p(true);
            sVar.p(true);
            sVar.d0(-946491715);
            arrayList = bVar.f38712d;
            size = arrayList.size();
            i12 = z13 ? 1 : 0;
            while (i12 < size) {
                Object obj2 = arrayList.get(i12);
                i12++;
                kv.z0 z0Var2 = (kv.z0) obj2;
                if (f11 <= 0.0d) {
                    k0.a.a("invalid weight; must be greater than zero");
                }
                if (f11 > Float.MAX_VALUE) {
                    f12 = Float.MAX_VALUE;
                } else {
                    f12 = f11;
                }
                long j16 = j12;
                l1.s sVar4 = sVar;
                p(z0Var2, cVar, e2.g(new i1(f12, true), f5), new g2.x(j12), sVar4, i13 & 112, 0);
                sVar = sVar4;
                f5 = f5;
                z13 = z13 ? 1 : 0;
                f11 = f11;
                j12 = j16;
            }
            sVar2 = sVar;
            sVar2.p(z13);
            sVar2.p(true);
        } else {
            sVar2.W();
        }
        x1 x1VarT = sVar2.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new fu.n(bVar, i11, 15, cVar);
        }
    }

    public static final void e(List rows, fz.c playAlphabetAudio, l1.n nVar, int i11) {
        z1.h hVar = z1.c.O;
        kotlin.jvm.internal.m.f(rows, "rows");
        kotlin.jvm.internal.m.f(playAlphabetAudio, "playAlphabetAudio");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1199640843);
        int i12 = (sVar.h(rows) ? 4 : 2) | i11 | (sVar.h(playAlphabetAudio) ? 32 : 16);
        if (sVar.T(i12 & 1, (i12 & 19) != 18)) {
            z1.o oVar = z1.o.f58481a;
            float f5 = 1.0f;
            z1.r rVarE = e2.e(oVar, 1.0f);
            int i13 = 6;
            j0.u uVarA = j0.t.a(j0.i.g(10), hVar, sVar, 6);
            int iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, rVarE);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(y2.j.f56917f, uVarA, sVar);
            l1.t.J(y2.j.f56916e, q1VarL, sVar);
            y2.h hVar2 = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar2);
            }
            l1.t.J(y2.j.f56915d, rVarC, sVar);
            sVar.d0(-1546570856);
            ArrayList arrayList = new ArrayList();
            int i14 = 0;
            while (i14 < rows.size()) {
                int i15 = (((kv.b) rows.get(i14)).f38709a.equals("( h )") ? 3 : 2) + i14;
                int size = rows.size();
                if (i15 <= size) {
                    size = i15;
                }
                arrayList.add(rows.subList(i14, size));
                i14 = i15;
            }
            int size2 = arrayList.size();
            int i16 = 0;
            while (i16 < size2) {
                Object obj = arrayList.get(i16);
                i16++;
                List list = (List) obj;
                float f11 = i13;
                float f12 = 1;
                z1.r rVarA = j0.c.A(d0.n.j(d0.n.h(d2.h.b(e2.e(oVar, f5), r0.f.d(f11)), A(sVar), r0.f.d(f11)), f34878a, A(sVar), r0.f.d(f11)), f12);
                j0.u uVarA2 = j0.t.a(j0.i.g(f12), hVar, sVar, 6);
                int iHashCode2 = Long.hashCode(sVar.T);
                q1 q1VarL2 = sVar.l();
                z1.r rVarC2 = z1.a.c(sVar, rVarA);
                y2.k.J.getClass();
                y2.i iVar2 = y2.j.f56913b;
                sVar.h0();
                z1.h hVar3 = hVar;
                if (sVar.S) {
                    sVar.k(iVar2);
                } else {
                    sVar.r0();
                }
                l1.t.J(y2.j.f56917f, uVarA2, sVar);
                l1.t.J(y2.j.f56916e, q1VarL2, sVar);
                y2.h hVar4 = y2.j.f56918g;
                if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                    defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar4);
                }
                Iterator itO = com.google.android.material.datepicker.d.o(sVar, rVarC2, y2.j.f56915d, -585187904, list);
                while (itO.hasNext()) {
                    d((kv.b) itO.next(), playAlphabetAudio, sVar, i12 & 112);
                }
                sVar.p(false);
                sVar.p(true);
                hVar = hVar3;
                f5 = 1.0f;
                i13 = 6;
            }
            sVar.p(false);
            sVar.p(true);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new q3(i11, 1, playAlphabetAudio, rows);
        }
    }

    public static final void f(l1.n nVar, int i11) {
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-558627691);
        if (sVar.T(i11 & 1, i11 != 0)) {
            long j11 = ((s1) sVar.j(v1.f31180a)).f31017a;
            z1.r rVarP = e2.p(j0.c.E(z1.o.f58481a, CropImageView.DEFAULT_ASPECT_RATIO, 2, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), 12, 14);
            boolean zE = sVar.e(j11);
            Object objQ = sVar.Q();
            if (zE || objQ == l1.m.f39353a) {
                objQ = new au.o(j11, 12);
                sVar.o0(objQ);
            }
            d0.n.b(6, (fz.c) objQ, sVar, rVarP);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new c(i11, 3);
        }
    }

    public static final void g(kv.c cVar, z1.r rVar, l1.n nVar, int i11) {
        y2.h hVar;
        kv.c cVar2 = cVar;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-711308051);
        int i12 = i11 | (sVar.f(cVar2) ? 4 : 2) | (sVar.f(rVar) ? 32 : 16);
        if (sVar.T(i12 & 1, (i12 & 19) != 18)) {
            float f5 = 8;
            z1.r rVarB = d2.h.b(rVar, r0.f.d(f5));
            c3 c3Var = v1.f31180a;
            z1.r rVarA = j0.c.A(d0.n.j(d0.n.h(rVarB, ((s1) sVar.j(c3Var)).f31033p, r0.f.d(f5)), 1, g2.x.c(((s1) sVar.j(c3Var)).f31017a, 0.12f), r0.f.d(f5)), 12);
            j0.u uVarA = j0.t.a(j0.i.g(f5), z1.c.P, sVar, 54);
            int iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, rVarA);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            y2.h hVar2 = y2.j.f56917f;
            l1.t.J(hVar2, uVarA, sVar);
            y2.h hVar3 = y2.j.f56916e;
            l1.t.J(hVar3, q1VarL, sVar);
            y2.h hVar4 = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar4);
            }
            y2.h hVar5 = y2.j.f56915d;
            l1.t.J(hVar5, rVarC, sVar);
            String str = cVar2.f38717c;
            ua.b(str, null, ((s1) sVar.j(c3Var)).f31036s, j3.A(13), null, null, null, 0L, new u3.k(3), 0L, 0, false, 0, 0, null, sVar, 3072, 0, 130546);
            z1.o oVar = z1.o.f58481a;
            z1.r rVarE = e2.e(oVar, 1.0f);
            a2 a2VarA = z1.a(j0.i.f35307e, z1.c.M, sVar, 54);
            int iHashCode2 = Long.hashCode(sVar.T);
            q1 q1VarL2 = sVar.l();
            z1.r rVarC2 = z1.a.c(sVar, rVarE);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar2, a2VarA, sVar);
            l1.t.J(hVar3, q1VarL2, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                hVar = hVar4;
                defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar);
            } else {
                hVar = hVar4;
            }
            l1.t.J(hVar5, rVarC2, sVar);
            c2 c2Var = c2.f35266a;
            z1.r rVarA2 = c2Var.a(oVar, 1.0f);
            z1.j jVar = z1.c.f58467e;
            w2.q0 q0VarD = j0.o.d(jVar, false);
            int iHashCode3 = Long.hashCode(sVar.T);
            q1 q1VarL3 = sVar.l();
            z1.r rVarC3 = z1.a.c(sVar, rVarA2);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar2, q0VarD, sVar);
            l1.t.J(hVar3, q1VarL3, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode3))) {
                defpackage.e.A(iHashCode3, sVar, iHashCode3, hVar);
            }
            l1.t.J(hVar5, rVarC3, sVar);
            k2.b bVarY = se.k.y(cVar.f38715a, sVar, 0);
            String strD0 = ub.a.d0(R.string.jp_syllable_overview_intro_font_standard_form, new Object[]{str}, sVar);
            float f11 = f34884g;
            y2.h hVar6 = hVar;
            d0.n.c(bVarY, strD0, e2.n(oVar, f11), null, null, CropImageView.DEFAULT_ASPECT_RATIO, new g2.p(((s1) sVar.j(c3Var)).f31034q, 5), sVar, 384, 56);
            sVar.p(true);
            ua.b("/", c2Var.a(oVar, 0.35f), ((s1) sVar.j(c3Var)).f31036s, j3.A(16), null, null, null, 0L, new u3.k(3), 0L, 0, false, 0, 0, null, sVar, 3078, 0, 130544);
            sVar = sVar;
            z1.r rVarA3 = c2Var.a(oVar, 1.0f);
            w2.q0 q0VarD2 = j0.o.d(jVar, false);
            int iHashCode4 = Long.hashCode(sVar.T);
            q1 q1VarL4 = sVar.l();
            z1.r rVarC4 = z1.a.c(sVar, rVarA3);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar2, q0VarD2, sVar);
            l1.t.J(hVar3, q1VarL4, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode4))) {
                defpackage.e.A(iHashCode4, sVar, iHashCode4, hVar6);
            }
            l1.t.J(hVar5, rVarC4, sVar);
            cVar2 = cVar;
            d0.n.c(se.k.y(cVar2.f38716b, sVar, 0), ub.a.d0(R.string.jp_syllable_overview_intro_font_alternate_form, new Object[]{str}, sVar), e2.n(oVar, f11), null, null, CropImageView.DEFAULT_ASPECT_RATIO, new g2.p(((s1) sVar.j(c3Var)).f31034q, 5), sVar, 384, 56);
            com.google.android.material.datepicker.d.B(sVar, true, true, true);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new fu.n(cVar2, i11, 14, rVar);
        }
    }

    public static final void h(List variations, l1.n nVar, int i11) {
        double d5;
        kotlin.jvm.internal.m.f(variations, "variations");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1446985402);
        char c11 = 2;
        int i12 = (sVar.h(variations) ? 4 : 2) | i11;
        if (sVar.T(i12 & 1, (i12 & 3) != 2)) {
            float f5 = 10;
            int i13 = 6;
            j0.u uVarA = j0.t.a(j0.i.g(f5), z1.c.O, sVar, 6);
            int iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            z1.o oVar = z1.o.f58481a;
            z1.r rVarC = z1.a.c(sVar, oVar);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(y2.j.f56917f, uVarA, sVar);
            l1.t.J(y2.j.f56916e, q1VarL, sVar);
            y2.h hVar = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
            }
            l1.t.J(y2.j.f56915d, rVarC, sVar);
            sVar.d0(-1502454852);
            ArrayList arrayListG1 = ry.m.g1(variations, 2, 2);
            int size = arrayListG1.size();
            int i14 = 0;
            while (i14 < size) {
                Object obj = arrayListG1.get(i14);
                int i15 = i14 + 1;
                List list = (List) obj;
                z1.r rVarE = e2.e(oVar, 1.0f);
                char c12 = c11;
                a2 a2VarA = z1.a(j0.i.g(f5), z1.c.L, sVar, i13);
                int iHashCode2 = Long.hashCode(sVar.T);
                q1 q1VarL2 = sVar.l();
                z1.r rVarC2 = z1.a.c(sVar, rVarE);
                y2.k.J.getClass();
                y2.i iVar2 = y2.j.f56913b;
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar2);
                } else {
                    sVar.r0();
                }
                l1.t.J(y2.j.f56917f, a2VarA, sVar);
                l1.t.J(y2.j.f56916e, q1VarL2, sVar);
                y2.h hVar2 = y2.j.f56918g;
                if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                    defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar2);
                }
                Iterator itO = com.google.android.material.datepicker.d.o(sVar, rVarC2, y2.j.f56915d, 328135989, list);
                while (true) {
                    d5 = 0.0d;
                    if (!itO.hasNext()) {
                        break;
                    }
                    kv.c cVar = (kv.c) itO.next();
                    if (1.0f <= 0.0d) {
                        k0.a.a("invalid weight; must be greater than zero");
                    }
                    g(cVar, new i1(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), sVar, 0);
                }
                sVar.p(false);
                sVar.d0(328142945);
                int size2 = 2 - list.size();
                int i16 = 0;
                while (i16 < size2) {
                    double d11 = d5;
                    if (1.0f <= d11) {
                        k0.a.a("invalid weight; must be greater than zero");
                    }
                    j0.c.g(sVar, new i1(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
                    i16++;
                    d5 = d11;
                }
                sVar.p(false);
                sVar.p(true);
                c11 = c12;
                i14 = i15;
                i13 = 6;
            }
            sVar.p(false);
            sVar.p(true);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new w0(i11, 0, variations);
        }
    }

    public static final void i(kv.d data, fz.c playAlphabetAudio, z1.r rVar, l1.n nVar, int i11) {
        z1.r rVar2;
        float f5;
        z1.i iVar = z1.c.L;
        kotlin.jvm.internal.m.f(data, "data");
        kotlin.jvm.internal.m.f(playAlphabetAudio, "playAlphabetAudio");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1185268846);
        int i12 = i11 | (sVar.h(data) ? 4 : 2) | (sVar.h(playAlphabetAudio) ? 32 : 16);
        if (sVar.T(i12 & 1, (i12 & 147) != 146)) {
            r0.e eVarD = r0.f.d(8);
            rVar2 = rVar;
            float f11 = 1;
            z1.r rVarA = j0.c.A(d0.n.j(d0.n.h(d2.h.b(e2.e(rVar2, 1.0f), eVarD), A(sVar), eVarD), f11, z(sVar), eVarD), f11);
            j0.u uVarA = j0.t.a(j0.i.g(f11), z1.c.O, sVar, 6);
            int iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, rVarA);
            y2.k.J.getClass();
            y2.i iVar2 = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar2);
            } else {
                sVar.r0();
            }
            y2.h hVar = y2.j.f56917f;
            l1.t.J(hVar, uVarA, sVar);
            y2.h hVar2 = y2.j.f56916e;
            l1.t.J(hVar2, q1VarL, sVar);
            y2.h hVar3 = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar3);
            }
            y2.h hVar4 = y2.j.f56915d;
            l1.t.J(hVar4, rVarC, sVar);
            a2 a2VarA = z1.a(j0.i.g(f11), iVar, sVar, 6);
            int iHashCode2 = Long.hashCode(sVar.T);
            q1 q1VarL2 = sVar.l();
            z1.o oVar = z1.o.f58481a;
            z1.r rVarC2 = z1.a.c(sVar, oVar);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar2);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar, a2VarA, sVar);
            l1.t.J(hVar2, q1VarL2, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar3);
            }
            l1.t.J(hVar4, rVarC2, sVar);
            c2 c2Var = c2.f35266a;
            z1.r rVarA2 = c2Var.a(oVar, 0.72f);
            float f12 = f34883f;
            b(6, BuildConfig.VERSION_NAME, sVar, e2.g(rVarA2, f12));
            sVar.d0(1765341513);
            Iterator it = data.f38722a.iterator();
            while (it.hasNext()) {
                b(0, (String) it.next(), sVar, e2.g(c2Var.a(oVar, 1.0f), f12));
            }
            sVar.p(false);
            sVar.p(true);
            sVar.d0(-754258846);
            Iterator it2 = data.f38723b.iterator();
            while (true) {
                boolean zHasNext = it2.hasNext();
                f5 = f34879b;
                if (!zHasNext) {
                    break;
                }
                kv.e eVar = (kv.e) it2.next();
                a2 a2VarA2 = z1.a(j0.i.g(f11), iVar, sVar, 6);
                int iHashCode3 = Long.hashCode(sVar.T);
                q1 q1VarL3 = sVar.l();
                z1.r rVarC3 = z1.a.c(sVar, oVar);
                y2.k.J.getClass();
                y2.i iVar3 = y2.j.f56913b;
                sVar.h0();
                Iterator it3 = it2;
                if (sVar.S) {
                    sVar.k(iVar3);
                } else {
                    sVar.r0();
                }
                l1.t.J(y2.j.f56917f, a2VarA2, sVar);
                l1.t.J(y2.j.f56916e, q1VarL3, sVar);
                y2.h hVar5 = y2.j.f56918g;
                if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode3))) {
                    defpackage.e.A(iHashCode3, sVar, iHashCode3, hVar5);
                }
                l1.t.J(y2.j.f56915d, rVarC3, sVar);
                b(0, eVar.f38727a, sVar, e2.g(c2Var.a(oVar, 0.72f), f5));
                sVar.d0(-2017586568);
                ArrayList arrayList = eVar.f38728b;
                int size = arrayList.size();
                int i13 = 0;
                while (i13 < size) {
                    p((kv.z0) arrayList.get(i13), playAlphabetAudio, e2.g(c2Var.a(oVar, 1.0f), f5), null, sVar, i12 & 112, 8);
                    i13++;
                    arrayList = arrayList;
                    f5 = f5;
                }
                sVar.p(false);
                sVar.p(true);
                it2 = it3;
            }
            sVar.p(false);
            a2 a2VarA3 = z1.a(j0.i.g(f11), iVar, sVar, 6);
            int iHashCode4 = Long.hashCode(sVar.T);
            q1 q1VarL4 = sVar.l();
            z1.r rVarC4 = z1.a.c(sVar, oVar);
            y2.k.J.getClass();
            y2.i iVar4 = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar4);
            } else {
                sVar.r0();
            }
            l1.t.J(y2.j.f56917f, a2VarA3, sVar);
            l1.t.J(y2.j.f56916e, q1VarL4, sVar);
            y2.h hVar6 = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode4))) {
                defpackage.e.A(iHashCode4, sVar, iHashCode4, hVar6);
            }
            l1.t.J(y2.j.f56915d, rVarC4, sVar);
            b(6, BuildConfig.VERSION_NAME, sVar, e2.g(c2Var.a(oVar, 0.72f), f5));
            p(data.f38724c, playAlphabetAudio, e2.g(c2Var.a(oVar, 1.0f), f5), null, sVar, i12 & 112, 8);
            sVar.d0(-1008487073);
            for (int i14 = 0; i14 < 4; i14++) {
                j0.o.a(d0.n.h(e2.g(c2Var.a(oVar, 1.0f), f5), ((s1) sVar.j(v1.f31180a)).f31033p, g2.f0.f28556b), sVar, 0);
            }
            com.google.android.material.datepicker.d.B(sVar, false, true, true);
        } else {
            rVar2 = rVar;
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new fp.e(data, playAlphabetAudio, rVar2, i11, 9);
        }
    }

    public static final void j(ArrayList arrayList, boolean z11, l1.n nVar, int i11) {
        int i12;
        ArrayList arrayList2;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1882991394);
        if ((i11 & 6) == 0) {
            i12 = (sVar.h(arrayList) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.g(z11) ? 32 : 16;
        }
        if (sVar.T(i12 & 1, (i12 & 19) != 18)) {
            z1.r rVarE = z1.o.f58481a;
            if (!z11) {
                rVarE = j0.c.E(rVarE, CropImageView.DEFAULT_ASPECT_RATIO, j0.f34762b, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13);
            }
            z1.r rVar = rVarE;
            float f5 = j0.f34761a;
            arrayList2 = arrayList;
            l(arrayList2, rVar, ((dc) sVar.j(fc.f30256a)).f30177j, sVar, i12 & 14, 0);
        } else {
            arrayList2 = arrayList;
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new dt.n(i11, arrayList2, z11);
        }
    }

    public static final void k(String text, l1.n nVar, int i11) {
        l1.s sVar;
        kotlin.jvm.internal.m.f(text, "text");
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(-1836927785);
        int i12 = i11 | (sVar2.f(text) ? 4 : 2);
        if (sVar2.T(i12 & 1, (i12 & 3) != 2)) {
            float f5 = j0.f34761a;
            sVar = sVar2;
            ua.b(text, j0.c.E(z1.o.f58481a, CropImageView.DEFAULT_ASPECT_RATIO, j0.f34762b, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((dc) sVar2.j(fc.f30256a)).f30177j, sVar, (i12 & 14) | 48, 0, 65532);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new bp.e0(text, i11, 15);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0041  */
    /* JADX WARN: Code duplicated, block: B:25:0x0047  */
    /* JADX WARN: Code duplicated, block: B:26:0x004a  */
    /* JADX WARN: Code duplicated, block: B:30:0x0054  */
    /* JADX WARN: Code duplicated, block: B:31:0x0056  */
    /* JADX WARN: Code duplicated, block: B:34:0x005f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0061  */
    /* JADX WARN: Code duplicated, block: B:36:0x0064  */
    /* JADX WARN: Code duplicated, block: B:40:0x0096  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:44:0x00af  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:53:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:56:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:58:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:61:0x0132  */
    /* JADX WARN: Code duplicated, block: B:64:0x013e  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:? A[RETURN, SYNTHETIC] */
    public static final void l(List list, z1.r rVar, j3.y0 y0Var, l1.n nVar, int i11, int i12) {
        List<kv.j> list2;
        int i13;
        z1.r rVar2;
        int i14;
        boolean z11;
        l1.s sVar;
        z1.r rVar3;
        x1 x1VarT;
        z1.r rVar4;
        long j11;
        long jE;
        long jC;
        j3.e eVar;
        int i15;
        long jB;
        n3.s sVar2;
        int i16;
        l1.s sVar3 = (l1.s) nVar;
        sVar3.f0(-890312920);
        if ((i11 & 6) == 0) {
            list2 = list;
            i13 = (sVar3.h(list2) ? 4 : 2) | i11;
        } else {
            list2 = list;
            i13 = i11;
        }
        int i17 = i12 & 2;
        if (i17 == 0) {
            if ((i11 & 48) == 0) {
                rVar2 = rVar;
                i13 |= sVar3.f(rVar2) ? 32 : 16;
            }
            if ((i11 & 384) == 0) {
                if (sVar3.f(y0Var)) {
                    i16 = 256;
                } else {
                    i16 = 128;
                }
                i13 |= i16;
            }
            i14 = 1;
            if ((i13 & 147) != 146) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (sVar3.T(i13 & 1, z11)) {
                if (i17 != 0) {
                    rVar4 = z1.o.f58481a;
                } else {
                    rVar4 = rVar2;
                }
                c3 c3Var = v1.f31180a;
                j11 = ((s1) sVar3.j(c3Var)).f31017a;
                jE = g2.f0.e(4293212469L);
                jC = g2.x.c(((s1) sVar3.j(c3Var)).f31017a, 0.88f);
                eVar = new j3.e();
                for (kv.j jVar : list2) {
                    i15 = y0.f34870a[jVar.f38759c.ordinal()];
                    if (i15 != i14) {
                        jB = j11;
                    } else if (i15 != 2) {
                        jB = jE;
                    } else if (i15 != 3) {
                        jB = jC;
                    } else {
                        if (i15 == 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        jB = y0Var.b();
                    }
                    if (jVar.f38758b) {
                        sVar2 = n3.s.L;
                    } else {
                        sVar2 = y0Var.f35827a.f35756c;
                    }
                    eVar.i(new j3.p0(jB, 0L, sVar2, (n3.o) null, (n3.p) null, (n3.i) null, (String) null, 0L, (u3.a) null, (u3.p) null, (q3.b) null, 0L, (u3.l) null, (g2.v0) null, 65530));
                    eVar.d(jVar.f38757a);
                    eVar.e();
                    i14 = 1;
                }
                sVar = sVar3;
                z1.r rVar5 = rVar4;
                ua.c(eVar.j(), rVar5, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, y0Var, sVar, i13 & 112, (i13 << 15) & 29360128, 131068);
                rVar3 = rVar5;
            } else {
                sVar = sVar3;
                sVar.W();
                rVar3 = rVar2;
            }
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new androidx.lifecycle.compose.d(list, rVar3, y0Var, i11, i12, 4);
            }
        }
        i13 |= 48;
        rVar2 = rVar;
        if ((i11 & 384) == 0) {
            if (sVar3.f(y0Var)) {
                i16 = 256;
            } else {
                i16 = 128;
            }
            i13 |= i16;
        }
        i14 = 1;
        if ((i13 & 147) != 146) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (sVar3.T(i13 & 1, z11)) {
            if (i17 != 0) {
                rVar4 = z1.o.f58481a;
            } else {
                rVar4 = rVar2;
            }
            c3 c3Var2 = v1.f31180a;
            j11 = ((s1) sVar3.j(c3Var2)).f31017a;
            jE = g2.f0.e(4293212469L);
            jC = g2.x.c(((s1) sVar3.j(c3Var2)).f31017a, 0.88f);
            eVar = new j3.e();
            while (r16.hasNext()) {
                i15 = y0.f34870a[jVar.f38759c.ordinal()];
                if (i15 != i14) {
                    jB = j11;
                } else if (i15 != 2) {
                    jB = jE;
                } else if (i15 != 3) {
                    jB = jC;
                } else {
                    if (i15 == 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    jB = y0Var.b();
                }
                if (jVar.f38758b) {
                    sVar2 = n3.s.L;
                } else {
                    sVar2 = y0Var.f35827a.f35756c;
                }
                eVar.i(new j3.p0(jB, 0L, sVar2, (n3.o) null, (n3.p) null, (n3.i) null, (String) null, 0L, (u3.a) null, (u3.p) null, (q3.b) null, 0L, (u3.l) null, (g2.v0) null, 65530));
                eVar.d(jVar.f38757a);
                eVar.e();
                i14 = 1;
            }
            sVar = sVar3;
            z1.r rVar6 = rVar4;
            ua.c(eVar.j(), rVar6, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, y0Var, sVar, i13 & 112, (i13 << 15) & 29360128, 131068);
            rVar3 = rVar6;
        } else {
            sVar = sVar3;
            sVar.W();
            rVar3 = rVar2;
        }
        x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new androidx.lifecycle.compose.d(list, rVar3, y0Var, i11, i12, 4);
        }
    }

    public static final void m(String text, l1.n nVar, int i11) {
        l1.s sVar;
        kotlin.jvm.internal.m.f(text, "text");
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(327036860);
        int i12 = i11 | (sVar2.f(text) ? 4 : 2);
        if (sVar2.T(i12 & 1, (i12 & 3) != 2)) {
            sVar = sVar2;
            ua.b(text, j0.c.E(z1.o.f58481a, CropImageView.DEFAULT_ASPECT_RATIO, 4, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), ((s1) sVar2.j(v1.f31180a)).f31034q, j3.A(20), null, n3.s.L, null, 0L, null, j3.A(26), 0, false, 0, 0, null, sVar, (i12 & 14) | 199728, 6, 130000);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new bp.e0(text, i11, 12);
        }
    }

    public static final void n(String text, l1.n nVar, int i11) {
        l1.s sVar;
        kotlin.jvm.internal.m.f(text, "text");
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(-1481830400);
        int i12 = i11 | (sVar2.f(text) ? 4 : 2);
        if (sVar2.T(i12 & 1, (i12 & 3) != 2)) {
            sVar = sVar2;
            ua.b(text, j0.c.E(z1.o.f58481a, CropImageView.DEFAULT_ASPECT_RATIO, 6, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), ((s1) sVar2.j(v1.f31180a)).f31034q, j3.A(16), null, n3.s.K, null, 0L, null, j3.A(22), 0, false, 0, 0, null, sVar, (i12 & 14) | 199728, 6, 130000);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new bp.e0(text, i11, 16);
        }
    }

    public static final void o(kv.g table, fz.c cVar, l1.n nVar, int i11) {
        long jC;
        long j11;
        float f5;
        z1.o oVar;
        float f11;
        kotlin.jvm.internal.m.f(table, "table");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(506765331);
        int i12 = (sVar.h(table) ? 4 : 2) | i11 | (sVar.h(cVar) ? 32 : 16);
        boolean z11 = true;
        if (sVar.T(i12 & 1, (i12 & 19) != 18)) {
            r0.e eVarD = r0.f.d(8);
            z1.o oVar2 = z1.o.f58481a;
            float f12 = 1.0f;
            float f13 = 1;
            z1.r rVarA = j0.c.A(d0.n.j(d0.n.h(d2.h.b(e2.e(oVar2, 1.0f), eVarD), A(sVar), eVarD), f13, z(sVar), eVarD), f13);
            int i13 = 6;
            j0.u uVarA = j0.t.a(j0.i.g(f13), z1.c.O, sVar, 6);
            int iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, rVarA);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(y2.j.f56917f, uVarA, sVar);
            l1.t.J(y2.j.f56916e, q1VarL, sVar);
            y2.h hVar = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
            }
            l1.t.J(y2.j.f56915d, rVarC, sVar);
            sVar.d0(1999578513);
            int i14 = 0;
            for (Object obj : table.f38742a) {
                int i15 = i14 + 1;
                if (i14 < 0) {
                    ns.o.V();
                    throw null;
                }
                kv.h hVar2 = (kv.h) obj;
                z1.r rVarQ = j0.c.q(e2.e(oVar2, f12), j0.e1.Min);
                a2 a2VarA = z1.a(j0.i.g(f13), z1.c.L, sVar, i13);
                int iHashCode2 = Long.hashCode(sVar.T);
                q1 q1VarL2 = sVar.l();
                z1.r rVarC2 = z1.a.c(sVar, rVarQ);
                y2.k.J.getClass();
                y2.i iVar2 = y2.j.f56913b;
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar2);
                } else {
                    sVar.r0();
                }
                l1.t.J(y2.j.f56917f, a2VarA, sVar);
                l1.t.J(y2.j.f56916e, q1VarL2, sVar);
                y2.h hVar3 = y2.j.f56918g;
                if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                    defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar3);
                }
                l1.t.J(y2.j.f56915d, rVarC2, sVar);
                sVar.d0(488676415);
                for (kv.f fVar : hVar2.f38745a) {
                    if (f12 <= 0.0d) {
                        k0.a.a("invalid weight; must be greater than zero");
                    }
                    z1.r rVarI = e2.i(e2.c(new i1(f12, z11), f12), 42, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                    if (i14 == 0) {
                        sVar.d0(-1647179824);
                        jC = g2.x.c(((s1) sVar.j(v1.f31180a)).f31017a, 0.18f);
                        sVar.p(false);
                    } else {
                        sVar.d0(-1647069712);
                        jC = ((s1) sVar.j(v1.f31180a)).f31033p;
                        sVar.p(false);
                    }
                    z1.r rVarH = d0.n.h(rVarI, jC, g2.f0.f28556b);
                    boolean z12 = (fVar.f38735b == null || cVar == null) ? false : z11;
                    boolean zH = sVar.h(fVar) | ((i12 & 112) == 32 ? z11 : false);
                    Object objQ = sVar.Q();
                    if (zH || objQ == l1.m.f39353a) {
                        objQ = new fp.f(17, fVar, cVar);
                        sVar.o0(objQ);
                    }
                    z1.r rVarB = j0.c.B(d0.n.o(rVarH, z12, null, (fz.a) objQ, 14), 6, 9);
                    w2.q0 q0VarD = j0.o.d(z1.c.f58467e, false);
                    int iHashCode3 = Long.hashCode(sVar.T);
                    q1 q1VarL3 = sVar.l();
                    z1.r rVarC3 = z1.a.c(sVar, rVarB);
                    y2.k.J.getClass();
                    y2.i iVar3 = y2.j.f56913b;
                    sVar.h0();
                    if (sVar.S) {
                        sVar.k(iVar3);
                    } else {
                        sVar.r0();
                    }
                    l1.t.J(y2.j.f56917f, q0VarD, sVar);
                    l1.t.J(y2.j.f56916e, q1VarL3, sVar);
                    y2.h hVar4 = y2.j.f56918g;
                    if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode3))) {
                        defpackage.e.A(iHashCode3, sVar, iHashCode3, hVar4);
                    }
                    l1.t.J(y2.j.f56915d, rVarC3, sVar);
                    if (i14 == 0) {
                        sVar.d0(-1719662108);
                        j11 = ((s1) sVar.j(v1.f31180a)).f31034q;
                        sVar.p(false);
                    } else {
                        sVar.d0(-1719565667);
                        j11 = ((s1) sVar.j(v1.f31180a)).f31036s;
                        sVar.p(false);
                    }
                    if (fVar.f38736c != null) {
                        sVar.d0(-1719411411);
                        f5 = f13;
                        l(fVar.f38736c, null, j3.y0.a(B(j11, i14 == 0, sVar), 0L, 0L, null, null, null, 0L, null, null, 3, 0, 0L, null, 16744447), sVar, 0, 2);
                        sVar.p(false);
                        oVar = oVar2;
                        f11 = f12;
                    } else {
                        f5 = f13;
                        sVar.d0(-1719006954);
                        l1.s sVar2 = sVar;
                        oVar = oVar2;
                        f11 = f12;
                        ua.b(fVar.f38734a, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a(B(j11, i14 == 0, sVar), 0L, 0L, null, null, null, 0L, null, null, 3, 0, 0L, null, 16744447), sVar2, 0, 0, 65534);
                        sVar = sVar2;
                        sVar.p(false);
                    }
                    sVar.p(true);
                    i12 = i12;
                    z11 = true;
                    f13 = f5;
                    oVar2 = oVar;
                    f12 = f11;
                }
                sVar.p(false);
                sVar.p(z11);
                i12 = i12;
                i14 = i15;
                i13 = 6;
            }
            sVar.p(false);
            sVar.p(z11);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new fu.n(table, i11, 16, cVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0272  */
    /* JADX WARN: Code duplicated, block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0066  */
    /* JADX WARN: Code duplicated, block: B:38:0x0068  */
    /* JADX WARN: Code duplicated, block: B:41:0x0071  */
    /* JADX WARN: Code duplicated, block: B:43:0x0074  */
    /* JADX WARN: Code duplicated, block: B:44:0x0076  */
    /* JADX WARN: Code duplicated, block: B:46:0x0079  */
    /* JADX WARN: Code duplicated, block: B:47:0x008d  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:56:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:68:0x0105  */
    /* JADX WARN: Code duplicated, block: B:69:0x0109  */
    /* JADX WARN: Code duplicated, block: B:74:0x012a  */
    /* JADX WARN: Code duplicated, block: B:77:0x0134  */
    /* JADX WARN: Code duplicated, block: B:79:0x015b  */
    /* JADX WARN: Code duplicated, block: B:80:0x015f  */
    /* JADX WARN: Code duplicated, block: B:85:0x017a  */
    /* JADX WARN: Code duplicated, block: B:93:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:96:0x0257  */
    /* JADX WARN: Code duplicated, block: B:98:0x0267  */
    /* JADX WARN: Instruction removed from duplicated block: B:93:0x01ed, please report this as an issue */
    public static final void p(kv.z0 z0Var, fz.c cVar, z1.r rVar, g2.x xVar, l1.n nVar, int i11, int i12) {
        int i13;
        g2.x xVar2;
        boolean z11;
        l1.s sVar;
        g2.x xVar3;
        x1 x1VarT;
        g2.x xVar4;
        long j11;
        String str;
        String str2;
        String str3;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        Object objQ;
        int iHashCode;
        y2.i iVar;
        y2.h hVar;
        y2.h hVar2;
        y2.h hVar3;
        y2.h hVar4;
        boolean z17;
        boolean z18;
        int iHashCode2;
        z1.o oVar;
        c3 c3Var;
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(-1790581365);
        if ((i11 & 6) == 0) {
            i13 = (sVar2.f(z0Var) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= sVar2.h(cVar) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i13 |= sVar2.f(rVar) ? 256 : 128;
        }
        int i14 = i12 & 8;
        if (i14 == 0) {
            if ((i11 & 3072) == 0) {
                xVar2 = xVar;
                i13 |= sVar2.f(xVar2) ? 2048 : 1024;
            }
            if ((i13 & 1171) != 1170) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (sVar2.T(i13 & 1, z11)) {
                if (i14 != 0) {
                    xVar4 = null;
                } else {
                    xVar4 = xVar2;
                }
                if (xVar4 == null) {
                    sVar2.d0(1533203058);
                    j11 = ((s1) sVar2.j(v1.f31180a)).f31033p;
                    sVar2.p(false);
                } else {
                    sVar2.d0(1533201663);
                    sVar2.p(false);
                    j11 = xVar4.f28624a;
                }
                z1.r rVarH = d0.n.h(rVar, j11, g2.f0.f28556b);
                str = z0Var.f38841d;
                str2 = z0Var.f38840c;
                str3 = z0Var.f38839b;
                z12 = z0Var.f38842e;
                if (str != null || z12) {
                    z13 = false;
                } else {
                    z13 = true;
                }
                if ((i13 & 14) == 4) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if ((i13 & 112) == 32) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                z16 = z15 | z14;
                objQ = sVar2.Q();
                if (z16 || objQ == l1.m.f39353a) {
                    objQ = new fp.f(16, z0Var, cVar);
                    sVar2.o0(objQ);
                }
                z1.r rVarB = j0.c.B(d0.n.o(rVarH, z13, null, (fz.a) objQ, 14), f34881d, f34882e);
                w2.q0 q0VarD = j0.o.d(z1.c.f58467e, false);
                iHashCode = Long.hashCode(sVar2.T);
                q1 q1VarL = sVar2.l();
                z1.r rVarC = z1.a.c(sVar2, rVarB);
                y2.k.J.getClass();
                iVar = y2.j.f56913b;
                sVar2.h0();
                if (sVar2.S) {
                    sVar2.k(iVar);
                } else {
                    sVar2.r0();
                }
                hVar = y2.j.f56917f;
                l1.t.J(hVar, q0VarD, sVar2);
                hVar2 = y2.j.f56916e;
                l1.t.J(hVar2, q1VarL, sVar2);
                hVar3 = y2.j.f56918g;
                if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode))) {
                    defpackage.e.A(iHashCode, sVar2, iHashCode, hVar3);
                }
                hVar4 = y2.j.f56915d;
                l1.t.J(hVar4, rVarC, sVar2);
                if (z12) {
                    sVar = sVar2;
                    z17 = true;
                    z18 = false;
                    sVar.d0(-740097379);
                } else {
                    sVar2.d0(-732122319);
                    j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.P, sVar2, 48);
                    iHashCode2 = Long.hashCode(sVar2.T);
                    q1 q1VarL2 = sVar2.l();
                    oVar = z1.o.f58481a;
                    z1.r rVarC2 = z1.a.c(sVar2, oVar);
                    sVar2.h0();
                    if (sVar2.S) {
                        sVar2.k(iVar);
                    } else {
                        sVar2.r0();
                    }
                    l1.t.J(hVar, uVarA, sVar2);
                    l1.t.J(hVar2, q1VarL2, sVar2);
                    if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode2))) {
                        defpackage.e.A(iHashCode2, sVar2, iHashCode2, hVar3);
                    }
                    l1.t.J(hVar4, rVarC2, sVar2);
                    String str4 = z0Var.f38838a;
                    c3Var = v1.f31180a;
                    z18 = false;
                    ua.b(str4, null, ((s1) sVar2.j(c3Var)).f31034q, j3.A(22), null, n3.s.H, null, 0L, null, 0L, 0, false, 1, 0, null, sVar2, 199680, 3072, 122834);
                    sVar = sVar2;
                    if (oz.q.K0(str3) || !oz.q.K0(str2)) {
                        sVar.d0(-2057567978);
                        ua.b(oz.q.i1(str3 + " " + str2).toString(), e2.e(oVar, 1.0f), ((s1) sVar.j(c3Var)).f31036s, j3.A(14), null, null, null, 0L, new u3.k(3), j3.A(18), 0, false, 1, 0, null, sVar, 3120, 3078, 121328);
                        sVar = sVar;
                    } else {
                        sVar.d0(-2065968978);
                    }
                    sVar.p(false);
                    z17 = true;
                    sVar.p(true);
                }
                sVar.p(z18);
                sVar.p(z17);
                xVar3 = xVar4;
            } else {
                sVar = sVar2;
                sVar.W();
                xVar3 = xVar2;
            }
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new bp.z(z0Var, cVar, rVar, xVar3, i11, i12, 3);
            }
        }
        i13 |= 3072;
        xVar2 = xVar;
        if ((i13 & 1171) != 1170) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (sVar2.T(i13 & 1, z11)) {
            if (i14 != 0) {
                xVar4 = null;
            } else {
                xVar4 = xVar2;
            }
            if (xVar4 == null) {
                sVar2.d0(1533203058);
                j11 = ((s1) sVar2.j(v1.f31180a)).f31033p;
                sVar2.p(false);
            } else {
                sVar2.d0(1533201663);
                sVar2.p(false);
                j11 = xVar4.f28624a;
            }
            z1.r rVarH2 = d0.n.h(rVar, j11, g2.f0.f28556b);
            str = z0Var.f38841d;
            str2 = z0Var.f38840c;
            str3 = z0Var.f38839b;
            z12 = z0Var.f38842e;
            if (str != null) {
                z13 = false;
            } else {
                z13 = false;
            }
            if ((i13 & 14) == 4) {
                z14 = true;
            } else {
                z14 = false;
            }
            if ((i13 & 112) == 32) {
                z15 = true;
            } else {
                z15 = false;
            }
            z16 = z15 | z14;
            objQ = sVar2.Q();
            if (z16) {
                objQ = new fp.f(16, z0Var, cVar);
                sVar2.o0(objQ);
            } else {
                objQ = new fp.f(16, z0Var, cVar);
                sVar2.o0(objQ);
            }
            z1.r rVarB2 = j0.c.B(d0.n.o(rVarH2, z13, null, (fz.a) objQ, 14), f34881d, f34882e);
            w2.q0 q0VarD2 = j0.o.d(z1.c.f58467e, false);
            iHashCode = Long.hashCode(sVar2.T);
            q1 q1VarL3 = sVar2.l();
            z1.r rVarC3 = z1.a.c(sVar2, rVarB2);
            y2.k.J.getClass();
            iVar = y2.j.f56913b;
            sVar2.h0();
            if (sVar2.S) {
                sVar2.k(iVar);
            } else {
                sVar2.r0();
            }
            hVar = y2.j.f56917f;
            l1.t.J(hVar, q0VarD2, sVar2);
            hVar2 = y2.j.f56916e;
            l1.t.J(hVar2, q1VarL3, sVar2);
            hVar3 = y2.j.f56918g;
            if (sVar2.S) {
                defpackage.e.A(iHashCode, sVar2, iHashCode, hVar3);
            } else {
                defpackage.e.A(iHashCode, sVar2, iHashCode, hVar3);
            }
            hVar4 = y2.j.f56915d;
            l1.t.J(hVar4, rVarC3, sVar2);
            if (z12) {
                sVar2.d0(-732122319);
                j0.u uVarA2 = j0.t.a(j0.i.f35305c, z1.c.P, sVar2, 48);
                iHashCode2 = Long.hashCode(sVar2.T);
                q1 q1VarL4 = sVar2.l();
                oVar = z1.o.f58481a;
                z1.r rVarC4 = z1.a.c(sVar2, oVar);
                sVar2.h0();
                if (sVar2.S) {
                    sVar2.k(iVar);
                } else {
                    sVar2.r0();
                }
                l1.t.J(hVar, uVarA2, sVar2);
                l1.t.J(hVar2, q1VarL4, sVar2);
                if (sVar2.S) {
                    defpackage.e.A(iHashCode2, sVar2, iHashCode2, hVar3);
                } else {
                    defpackage.e.A(iHashCode2, sVar2, iHashCode2, hVar3);
                }
                l1.t.J(hVar4, rVarC4, sVar2);
                String str5 = z0Var.f38838a;
                c3Var = v1.f31180a;
                z18 = false;
                ua.b(str5, null, ((s1) sVar2.j(c3Var)).f31034q, j3.A(22), null, n3.s.H, null, 0L, null, 0L, 0, false, 1, 0, null, sVar2, 199680, 3072, 122834);
                sVar = sVar2;
                if (oz.q.K0(str3)) {
                    sVar.d0(-2057567978);
                    ua.b(oz.q.i1(str3 + " " + str2).toString(), e2.e(oVar, 1.0f), ((s1) sVar.j(c3Var)).f31036s, j3.A(14), null, null, null, 0L, new u3.k(3), j3.A(18), 0, false, 1, 0, null, sVar, 3120, 3078, 121328);
                    sVar = sVar;
                } else {
                    sVar.d0(-2057567978);
                    ua.b(oz.q.i1(str3 + " " + str2).toString(), e2.e(oVar, 1.0f), ((s1) sVar.j(c3Var)).f31036s, j3.A(14), null, null, null, 0L, new u3.k(3), j3.A(18), 0, false, 1, 0, null, sVar, 3120, 3078, 121328);
                    sVar = sVar;
                }
                sVar.p(false);
                z17 = true;
                sVar.p(true);
            } else {
                sVar = sVar2;
                z17 = true;
                z18 = false;
                sVar.d0(-740097379);
            }
            sVar.p(z18);
            sVar.p(z17);
            xVar3 = xVar4;
        } else {
            sVar = sVar2;
            sVar.W();
            xVar3 = xVar2;
        }
        x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new bp.z(z0Var, cVar, rVar, xVar3, i11, i12, 3);
        }
    }

    public static final void q(fz.c playAlphabetAudio, l1.n nVar, int i11) {
        kotlin.jvm.internal.m.f(playAlphabetAudio, "playAlphabetAudio");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-415727409);
        int i12 = (sVar.h(playAlphabetAudio) ? 4 : 2) | i11;
        if (sVar.T(i12 & 1, (i12 & 3) != 2)) {
            z1.o oVar = z1.o.f58481a;
            float f5 = 8;
            z1.r rVarB = j0.c.B(d0.n.j(d0.n.h(d2.h.b(e2.e(oVar, 1.0f), r0.f.d(f5)), ((s1) sVar.j(v1.f31180a)).f31033p, r0.f.d(f5)), 1, z(sVar), r0.f.d(f5)), 16, 14);
            j0.u uVarA = j0.t.a(j0.i.g(10), z1.c.P, sVar, 54);
            int iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, rVarB);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(y2.j.f56917f, uVarA, sVar);
            l1.t.J(y2.j.f56916e, q1VarL, sVar);
            y2.h hVar = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
            }
            l1.t.J(y2.j.f56915d, rVarC, sVar);
            z1.r rVarE = e2.e(oVar, 0.72f);
            int i13 = i12 & 14;
            boolean z11 = i13 == 4;
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (z11 || objQ == gVar) {
                objQ = new bt.g(playAlphabetAudio, 25);
                sVar.o0(objQ);
            }
            r(438, (fz.a) objQ, "あ", "Hiragana", sVar, rVarE);
            z1.r rVarE2 = e2.e(oVar, 0.72f);
            boolean z12 = i13 == 4;
            Object objQ2 = sVar.Q();
            if (z12 || objQ2 == gVar) {
                objQ2 = new bt.g(playAlphabetAudio, 26);
                sVar.o0(objQ2);
            }
            r(438, (fz.a) objQ2, "ア", "Katakana", sVar, rVarE2);
            z1.r rVarE3 = e2.e(oVar, 0.72f);
            boolean z13 = i13 == 4;
            Object objQ3 = sVar.Q();
            if (z13 || objQ3 == gVar) {
                objQ3 = new bt.g(playAlphabetAudio, 27);
                sVar.o0(objQ3);
            }
            r(438, (fz.a) objQ3, "a", "Romaji", sVar, rVarE3);
            sVar.p(true);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new e6(playAlphabetAudio, i11, 2);
        }
    }

    public static final void r(int i11, fz.a aVar, String str, String str2, l1.n nVar, z1.r rVar) {
        String str3;
        l1.s sVar;
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(115797656);
        int i12 = i11 | (sVar2.h(aVar) ? 2048 : 1024);
        if (sVar2.T(i12 & 1, (i12 & 1171) != 1170)) {
            z1.r rVarO = d0.n.o(rVar, false, null, aVar, 15);
            a2 a2VarA = z1.a(j0.i.f35303a, z1.c.M, sVar2, 48);
            int iHashCode = Long.hashCode(sVar2.T);
            q1 q1VarL = sVar2.l();
            z1.r rVarC = z1.a.c(sVar2, rVarO);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar2.h0();
            if (sVar2.S) {
                sVar2.k(iVar);
            } else {
                sVar2.r0();
            }
            y2.h hVar = y2.j.f56917f;
            l1.t.J(hVar, a2VarA, sVar2);
            y2.h hVar2 = y2.j.f56916e;
            l1.t.J(hVar2, q1VarL, sVar2);
            y2.h hVar3 = y2.j.f56918g;
            if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar2, iHashCode, hVar3);
            }
            y2.h hVar4 = y2.j.f56915d;
            l1.t.J(hVar4, rVarC, sVar2);
            z1.o oVar = z1.o.f58481a;
            float f5 = 6;
            z1.r rVarB = d2.h.b(e2.s(oVar, 58), r0.f.d(f5));
            c3 c3Var = v1.f31180a;
            z1.r rVarC2 = j0.c.C(d0.n.j(d0.n.h(rVarB, g2.x.c(((s1) sVar2.j(c3Var)).f31035r, 0.34f), r0.f.d(f5)), 1, g2.x.c(((s1) sVar2.j(c3Var)).f31017a, 0.12f), r0.f.d(f5)), CropImageView.DEFAULT_ASPECT_RATIO, f5, 1);
            w2.q0 q0VarD = j0.o.d(z1.c.f58467e, false);
            int iHashCode2 = Long.hashCode(sVar2.T);
            q1 q1VarL2 = sVar2.l();
            z1.r rVarC3 = z1.a.c(sVar2, rVarC2);
            sVar2.h0();
            if (sVar2.S) {
                sVar2.k(iVar);
            } else {
                sVar2.r0();
            }
            l1.t.J(hVar, q0VarD, sVar2);
            l1.t.J(hVar2, q1VarL2, sVar2);
            if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode2))) {
                defpackage.e.A(iHashCode2, sVar2, iHashCode2, hVar3);
            }
            l1.t.J(hVar4, rVarC3, sVar2);
            ua.b(str, null, ((s1) sVar2.j(c3Var)).f31034q, j3.A(20), null, null, null, 0L, new u3.k(3), 0L, 0, false, 0, 0, null, sVar2, 3078, 0, 130546);
            sVar = sVar2;
            sVar.p(true);
            c(j0.c.E(oVar, 10, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14), sVar, 6);
            str3 = str2;
            v(str3, sVar, 6);
            sVar.p(true);
        } else {
            str3 = str2;
            sVar = sVar2;
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new t0(i11, 0, aVar, str, str3, rVar);
        }
    }

    public static final void s(String str, l1.n nVar, int i11) {
        String text = str;
        kotlin.jvm.internal.m.f(text, "text");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(465520559);
        int i12 = i11 | (sVar.f(text) ? 4 : 2);
        if (sVar.T(i12 & 1, (i12 & 3) != 2)) {
            j3.y0 y0VarB = j0.b(sVar);
            z1.o oVar = z1.o.f58481a;
            z1.r rVarE = e2.e(oVar, 1.0f);
            a2 a2VarA = z1.a(j0.i.g(8), z1.c.L, sVar, 54);
            int iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, rVarE);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(y2.j.f56917f, a2VarA, sVar);
            l1.t.J(y2.j.f56916e, q1VarL, sVar);
            y2.h hVar = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
            }
            l1.t.J(y2.j.f56915d, rVarC, sVar);
            ua.b("•", j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, 1, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), ((s1) sVar.j(v1.f31180a)).f31036s, y0VarB.f35827a.f35755b, null, null, null, 0L, null, y0VarB.f35828b.f35670c, 0, false, 0, 0, null, sVar, 54, 0, 130032);
            if (1.0f <= 0.0d) {
                k0.a.a("invalid weight; must be greater than zero");
            }
            text = str;
            ua.b(text, new i1(1.0f, true), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0VarB, sVar, i12 & 14, 0, 65532);
            sVar = sVar;
            sVar.p(true);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new bp.e0(text, i11, 13);
        }
    }

    public static final void t(t1.d dVar, l1.n nVar, int i11) {
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-280668559);
        if (sVar.T(i11 & 1, (i11 & 3) != 2)) {
            j0.c(ub.a.e0(sVar, R.string.jp_syllable_note_title), null, j3.y0.a(((dc) sVar.j(fc.f30256a)).f30176i, ((s1) sVar.j(v1.f31180a)).f31034q, j3.A(14), n3.s.K, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), CropImageView.DEFAULT_ASPECT_RATIO, t1.e.d(-1555132069, new br.l(dVar, 4), sVar), sVar, 24576, 10);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new br.m(dVar, i11, 5);
        }
    }

    public static final void u(String str, l1.n nVar, int i11) {
        l1.s sVar;
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(358871114);
        if (sVar2.T(i11 & 1, (i11 & 3) != 2)) {
            sVar = sVar2;
            ua.b(str, e2.u(z1.o.f58481a, 18, CropImageView.DEFAULT_ASPECT_RATIO, 2), g2.x.c(((s1) sVar2.j(v1.f31180a)).f31036s, 0.62f), j3.A(24), null, n3.s.H, null, 0L, new u3.k(3), 0L, 0, false, 0, 0, null, sVar, 199734, 0, 130512);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new bp.e0(str, i11, 14);
        }
    }

    public static final void v(String str, l1.n nVar, int i11) {
        int i12;
        l1.s sVar;
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(-315932168);
        if ((i11 & 6) == 0) {
            i12 = i11 | (sVar2.f(str) ? 4 : 2);
        } else {
            i12 = i11;
        }
        if (sVar2.T(i12 & 1, (i12 & 3) != 2)) {
            c3 c3Var = v1.f31180a;
            sVar = sVar2;
            ua.b(str, j0.c.B(d0.n.h(z1.o.f58481a, ((s1) sVar2.j(c3Var)).f31017a, r0.f.d(40)), 12, 7), ((s1) sVar2.j(c3Var)).f31019b, j3.A(14), null, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar, (i12 & 14) | 3072, 0, 131056);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new j5(str, i11, 2);
        }
    }

    public static final void w(l1.n nVar, int i11) {
        l1.s sVar = (l1.s) nVar;
        sVar.f0(395785694);
        if (sVar.T(i11 & 1, i11 != 0)) {
            k7.g(null, 1, g2.x.c(((s1) sVar.j(v1.f31180a)).f31017a, 0.16f), sVar, 48, 1);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new c(i11, 2);
        }
    }

    public static final void x(String str, String str2, boolean z11, z1.r rVar, fz.a aVar, l1.n nVar, int i11) {
        l1.s sVar;
        long jC;
        long jA;
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(1087696328);
        int i12 = i11 | (sVar2.f(str) ? 4 : 2) | (sVar2.f(str2) ? 32 : 16) | (sVar2.f(rVar) ? 2048 : 1024) | (sVar2.h(aVar) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE);
        if (sVar2.T(i12 & 1, (i12 & 9363) != 9362)) {
            r0.e eVarD = r0.f.d(8);
            z1.r rVarB = d2.h.b(e2.i(rVar, 62, CropImageView.DEFAULT_ASPECT_RATIO, 2), eVarD);
            if (z11) {
                sVar2.d0(-1966563724);
                jC = g2.x.c(((s1) sVar2.j(v1.f31180a)).f31021c, 0.42f);
                sVar2.p(false);
            } else {
                sVar2.d0(-1966457487);
                jC = ((s1) sVar2.j(v1.f31180a)).f31033p;
                sVar2.p(false);
            }
            z1.r rVarH = d0.n.h(rVarB, jC, eVarD);
            if (z11) {
                sVar2.d0(-1966228707);
                jA = g2.x.c(((s1) sVar2.j(v1.f31180a)).f31017a, 0.24f);
                sVar2.p(false);
            } else {
                sVar2.d0(-1966131429);
                jA = A(sVar2);
                sVar2.p(false);
            }
            z1.r rVarO = d0.n.o(d0.n.j(rVarH, f34878a, jA, eVarD), false, null, aVar, 15);
            w2.q0 q0VarD = j0.o.d(z1.c.f58467e, false);
            int iHashCode = Long.hashCode(sVar2.T);
            q1 q1VarL = sVar2.l();
            z1.r rVarC = z1.a.c(sVar2, rVarO);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar2.h0();
            if (sVar2.S) {
                sVar2.k(iVar);
            } else {
                sVar2.r0();
            }
            y2.h hVar = y2.j.f56917f;
            l1.t.J(hVar, q0VarD, sVar2);
            y2.h hVar2 = y2.j.f56916e;
            l1.t.J(hVar2, q1VarL, sVar2);
            y2.h hVar3 = y2.j.f56918g;
            if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar2, iHashCode, hVar3);
            }
            y2.h hVar4 = y2.j.f56915d;
            l1.t.J(hVar4, rVarC, sVar2);
            z1.o oVar = z1.o.f58481a;
            z1.r rVarB2 = j0.c.B(e2.e(oVar, 1.0f), f34881d, f34882e);
            j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.P, sVar2, 48);
            int iHashCode2 = Long.hashCode(sVar2.T);
            q1 q1VarL2 = sVar2.l();
            z1.r rVarC2 = z1.a.c(sVar2, rVarB2);
            sVar2.h0();
            if (sVar2.S) {
                sVar2.k(iVar);
            } else {
                sVar2.r0();
            }
            l1.t.J(hVar, uVarA, sVar2);
            l1.t.J(hVar2, q1VarL2, sVar2);
            if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode2))) {
                defpackage.e.A(iHashCode2, sVar2, iHashCode2, hVar3);
            }
            l1.t.J(hVar4, rVarC2, sVar2);
            c3 c3Var = v1.f31180a;
            ua.b(str, e2.e(oVar, 1.0f), ((s1) sVar2.j(c3Var)).f31034q, j3.A(22), null, n3.s.H, null, 0L, new u3.k(3), 0L, 0, false, 1, 0, null, sVar2, (i12 & 14) | 199728, 3072, 122320);
            ua.b(str2, e2.e(oVar, 1.0f), ((s1) sVar2.j(c3Var)).f31036s, j3.A(14), null, null, null, 0L, new u3.k(3), j3.A(18), 0, false, 1, 0, null, sVar2, (14 & (i12 >> 3)) | 3120, 3078, 121328);
            sVar = sVar2;
            sVar.p(true);
            sVar.p(true);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new v0(str, str2, z11, rVar, aVar, i11, 0);
        }
    }

    public static final void y(List formulas, final fz.c playAlphabetAudio, l1.n nVar, int i11) {
        kotlin.jvm.internal.m.f(formulas, "formulas");
        kotlin.jvm.internal.m.f(playAlphabetAudio, "playAlphabetAudio");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-790546606);
        int i12 = 32;
        int i13 = (sVar.h(formulas) ? 4 : 2) | i11 | (sVar.h(playAlphabetAudio) ? 32 : 16);
        if (sVar.T(i13 & 1, (i13 & 19) != 18)) {
            float f5 = 8;
            r0.e eVarD = r0.f.d(f5);
            z1.o oVar = z1.o.f58481a;
            float f11 = 1.0f;
            z1.r rVarA = j0.c.A(d0.n.j(d0.n.h(d2.h.b(e2.e(oVar, 1.0f), eVarD), ((s1) sVar.j(v1.f31180a)).f31033p, eVarD), 1, z(sVar), eVarD), 12);
            j0.u uVarA = j0.t.a(j0.i.g(14), z1.c.O, sVar, 6);
            int iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, rVarA);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(y2.j.f56917f, uVarA, sVar);
            l1.t.J(y2.j.f56916e, q1VarL, sVar);
            y2.h hVar = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
            }
            Iterator itO = com.google.android.material.datepicker.d.o(sVar, rVarC, y2.j.f56915d, 1960229281, formulas);
            while (itO.hasNext()) {
                final kv.a1 a1Var = (kv.a1) itO.next();
                z1.r rVarE = e2.e(oVar, f11);
                a2 a2VarA = z1.a(j0.i.g(f5), z1.c.M, sVar, 54);
                Iterator it = itO;
                int iHashCode2 = Long.hashCode(sVar.T);
                q1 q1VarL2 = sVar.l();
                z1.r rVarC2 = z1.a.c(sVar, rVarE);
                y2.k.J.getClass();
                y2.i iVar2 = y2.j.f56913b;
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar2);
                } else {
                    sVar.r0();
                }
                l1.t.J(y2.j.f56917f, a2VarA, sVar);
                l1.t.J(y2.j.f56916e, q1VarL2, sVar);
                y2.h hVar2 = y2.j.f56918g;
                if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                    defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar2);
                }
                l1.t.J(y2.j.f56915d, rVarC2, sVar);
                String str = a1Var.f38703a;
                String str2 = a1Var.f38704b;
                c2 c2Var = c2.f35266a;
                z1.r rVarA2 = c2Var.a(oVar, 1.15f);
                int i14 = i13 & 112;
                boolean zF = (i14 == i12) | sVar.f(a1Var);
                Object objQ = sVar.Q();
                l1.g gVar = l1.m.f39353a;
                if (zF || objQ == gVar) {
                    final int i15 = 0;
                    objQ = new fz.a() { // from class: iv.x0
                        @Override // fz.a
                        public final Object invoke() {
                            switch (i15) {
                                case 0:
                                    playAlphabetAudio.invoke(a1Var.f38704b);
                                    break;
                                case 1:
                                    playAlphabetAudio.invoke(a1Var.f38706d);
                                    break;
                                default:
                                    playAlphabetAudio.invoke(a1Var.f38708f);
                                    break;
                            }
                            return qy.b0.f48488a;
                        }
                    };
                    sVar.o0(objQ);
                }
                int i16 = i13;
                x(str, str2, false, rVarA2, (fz.a) objQ, sVar, 384);
                u("+", sVar, 6);
                String str3 = a1Var.f38705c;
                String str4 = a1Var.f38706d;
                z1.r rVarA3 = c2Var.a(oVar, 0.82f);
                boolean zF2 = (i14 == 32) | sVar.f(a1Var);
                Object objQ2 = sVar.Q();
                if (zF2 || objQ2 == gVar) {
                    final int i17 = 1;
                    objQ2 = new fz.a() { // from class: iv.x0
                        @Override // fz.a
                        public final Object invoke() {
                            switch (i17) {
                                case 0:
                                    playAlphabetAudio.invoke(a1Var.f38704b);
                                    break;
                                case 1:
                                    playAlphabetAudio.invoke(a1Var.f38706d);
                                    break;
                                default:
                                    playAlphabetAudio.invoke(a1Var.f38708f);
                                    break;
                            }
                            return qy.b0.f48488a;
                        }
                    };
                    sVar.o0(objQ2);
                }
                x(str3, str4, false, rVarA3, (fz.a) objQ2, sVar, 384);
                u("→", sVar, 6);
                String str5 = a1Var.f38707e;
                String str6 = a1Var.f38708f;
                z1.r rVarA4 = c2Var.a(oVar, 1.15f);
                boolean zF3 = (i14 == 32) | sVar.f(a1Var);
                Object objQ3 = sVar.Q();
                if (zF3 || objQ3 == gVar) {
                    final int i18 = 2;
                    objQ3 = new fz.a() { // from class: iv.x0
                        @Override // fz.a
                        public final Object invoke() {
                            switch (i18) {
                                case 0:
                                    playAlphabetAudio.invoke(a1Var.f38704b);
                                    break;
                                case 1:
                                    playAlphabetAudio.invoke(a1Var.f38706d);
                                    break;
                                default:
                                    playAlphabetAudio.invoke(a1Var.f38708f);
                                    break;
                            }
                            return qy.b0.f48488a;
                        }
                    };
                    sVar.o0(objQ3);
                }
                x(str5, str6, true, rVarA4, (fz.a) objQ3, sVar, 384);
                sVar.p(true);
                i12 = 32;
                itO = it;
                i13 = i16;
                f11 = 1.0f;
            }
            sVar.p(false);
            sVar.p(true);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new q3(i11, 2, playAlphabetAudio, formulas);
        }
    }

    public static final long z(l1.n nVar) {
        return g2.x.c(((s1) ((l1.s) nVar).j(v1.f31180a)).f31017a, 0.18f);
    }
}
