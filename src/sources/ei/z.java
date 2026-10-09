package ei;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import bp.p0;
import bt.d1;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.lingodeer.R;
import dt.i0;
import fr.j3;
import g2.f0;
import h1.k7;
import h1.s1;
import h1.ua;
import h1.v1;
import j0.a2;
import j0.e2;
import j0.i1;
import j0.z1;
import java.util.Iterator;
import java.util.List;
import l1.c3;
import l1.q1;
import l1.x1;
import qy.b0;
import w2.q0;
import z2.g1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t1.d f25678a = new t1.d(new dt.g(2), false, -1513848299);

    public static final void a(final z1.r rVar, h hVar, fz.c cVar, l1.n nVar, int i11) {
        h hVar2;
        fz.c cVar2;
        fz.c cVar3;
        final h hVar3;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(810138065);
        int i12 = i11 | 16;
        if (sVar.T(i12 & 1, (i12 & 19) != 18)) {
            sVar.Y();
            if ((i11 & 1) == 0 || sVar.C()) {
                List listL = ns.o.L(ub.a.e0(sVar, R.string.ar_alphabet_content_14), ub.a.e0(sVar, R.string.ar_alphabet_content_12), ub.a.e0(sVar, R.string.ar_alphabet_content_10), ub.a.e0(sVar, R.string.ar_alphabet_content_8), ub.a.e0(sVar, R.string.ar_alphabet_content_66));
                Object objQ = sVar.Q();
                l1.g gVar = l1.m.f39353a;
                if (objQ == gVar) {
                    objQ = a.f25574a;
                    sVar.o0(objQ);
                }
                List list = (List) objQ;
                boolean zF = sVar.f(listL);
                Object objQ2 = sVar.Q();
                if (zF || objQ2 == gVar) {
                    objQ2 = new h(listL, list);
                    sVar.o0(objQ2);
                }
                h hVar4 = (h) objQ2;
                Object objQ3 = sVar.Q();
                if (objQ3 == gVar) {
                    objQ3 = new dv.e(5);
                    sVar.o0(objQ3);
                }
                cVar3 = (fz.c) objQ3;
                hVar3 = hVar4;
            } else {
                sVar.W();
                hVar3 = hVar;
                cVar3 = cVar;
            }
            sVar.q();
            c3 c3Var = v1.f31180a;
            final long j11 = ((s1) sVar.j(c3Var)).A;
            final long j12 = ((s1) sVar.j(c3Var)).f31017a;
            final long j13 = ((s1) sVar.j(c3Var)).f31034q;
            final long j14 = ((s1) sVar.j(c3Var)).f31019b;
            l1.t.a(g1.f58552n.a(v3.m.Ltr), t1.e.d(2003734161, new fz.e() { // from class: ei.f
                @Override // fz.e
                public final Object invoke(Object obj, Object obj2) {
                    l1.n nVar2 = (l1.n) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    l1.s sVar2 = (l1.s) nVar2;
                    if (sVar2.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                        z1.r rVarD = e2.d(rVar, 1.0f);
                        j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, sVar2, 0);
                        int iHashCode = Long.hashCode(sVar2.T);
                        q1 q1VarL = sVar2.l();
                        z1.r rVarC = z1.a.c(sVar2, rVarD);
                        y2.k.J.getClass();
                        y2.i iVar = y2.j.f56913b;
                        sVar2.h0();
                        if (sVar2.S) {
                            sVar2.k(iVar);
                        } else {
                            sVar2.r0();
                        }
                        l1.t.J(y2.j.f56917f, uVarA, sVar2);
                        l1.t.J(y2.j.f56916e, q1VarL, sVar2);
                        y2.h hVar5 = y2.j.f56918g;
                        if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode))) {
                            defpackage.e.A(iHashCode, sVar2, iHashCode, hVar5);
                        }
                        l1.t.J(y2.j.f56915d, rVarC, sVar2);
                        final h hVar6 = hVar3;
                        List list2 = hVar6.f25601a;
                        final long j15 = j12;
                        final long j16 = j14;
                        z.c(list2, j15, j16, sVar2, 0);
                        float f5 = 1;
                        k7.e(null, f5, j11, sVar2, 48, 1);
                        z1.r rVarE = e2.e(z1.o.f58481a, 1.0f);
                        if (1.0f <= 0.0d) {
                            k0.a.a("invalid weight; must be greater than zero");
                        }
                        z1.r rVarP = w4.c.p(1.0f, true, rVarE);
                        j0.g gVarG = j0.i.g(f5);
                        boolean zF2 = sVar2.f(hVar6) | sVar2.e(j15);
                        final long j17 = j13;
                        boolean zE = zF2 | sVar2.e(j17) | sVar2.e(j16);
                        Object objQ4 = sVar2.Q();
                        if (zE || objQ4 == l1.m.f39353a) {
                            fz.c cVar4 = new fz.c() { // from class: ei.c
                                @Override // fz.c
                                public final Object invoke(Object obj3) {
                                    l0.h LazyColumn = (l0.h) obj3;
                                    kotlin.jvm.internal.m.f(LazyColumn, "$this$LazyColumn");
                                    List list3 = hVar6.f25602b;
                                    LazyColumn.q(list3.size(), null, new p0(4, list3), new t1.d(new g(list3, j15, j17, j16), true, 802480018));
                                    return b0.f48488a;
                                }
                            };
                            sVar2.o0(cVar4);
                            objQ4 = cVar4;
                        }
                        ue.f.a(rVarP, null, null, gVarG, null, null, false, null, (fz.c) objQ4, sVar2, 24576, 494);
                        sVar2.p(true);
                    } else {
                        sVar2.W();
                    }
                    return b0.f48488a;
                }
            }, sVar), sVar, 56);
            cVar2 = cVar3;
            hVar2 = hVar3;
        } else {
            sVar.W();
            hVar2 = hVar;
            cVar2 = cVar;
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new at.i(rVar, hVar2, cVar2, i11, 23);
        }
    }

    public static final void b(int i11, dn.d dVar, fz.a aVar, fz.c cVar, fz.c cVar2, fz.f fVar, Integer num, Integer num2, Integer num3, Integer num4, l1.n nVar, z1.r rVar) {
        fz.a aVar2;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1603055204);
        int i12 = i11 | (sVar.f(dVar) ? 4 : 2) | (sVar.h(fVar) ? 256 : 128) | (sVar.h(cVar) ? 2048 : 1024) | (sVar.h(cVar2) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE) | 196608 | (sVar.f(num) ? 1048576 : 524288) | (sVar.f(num2) ? 8388608 : 4194304) | (sVar.f(num3) ? 67108864 : 33554432) | (sVar.f(num4) ? 536870912 : 268435456);
        if (sVar.T(i12 & 1, (306783379 & i12) != 306783378)) {
            Object objQ = sVar.Q();
            if (objQ == l1.m.f39353a) {
                objQ = new ju.d(25);
                sVar.o0(objQ);
            }
            fz.a aVar3 = (fz.a) objQ;
            float f5 = 50;
            l1.t.a(g1.f58552n.a(v3.m.Rtl), t1.e.d(1951949604, new d1(dVar, new ms.a(100, 60, f5, f5, 144), (Context) sVar.j(AndroidCompositionLocals_androidKt.f1200b), fVar, cVar, cVar2, aVar3, num, num2, num3, num4, rVar), sVar), sVar, 56);
            aVar2 = aVar3;
        } else {
            sVar.W();
            aVar2 = aVar;
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new t(dVar, rVar, fVar, cVar, cVar2, aVar2, num, num2, num3, num4, i11, 0);
        }
    }

    public static final void c(List list, long j11, long j12, l1.n nVar, int i11) {
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1697516233);
        long j13 = j11;
        long j14 = j12;
        int i12 = i11 | (sVar.h(list) ? 4 : 2) | (sVar.e(j13) ? 32 : 16) | (sVar.e(j14) ? 256 : 128);
        if (sVar.T(i12 & 1, (i12 & 147) != 146)) {
            float f5 = 1.0f;
            z1.r rVarE = e2.e(z1.o.f58481a, 1.0f);
            a2 a2VarA = z1.a(j0.i.g(1), z1.c.L, sVar, 6);
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
            Iterator itO = com.google.android.material.datepicker.d.o(sVar, rVarC, y2.j.f56915d, -1676383517, list);
            while (itO.hasNext()) {
                String str = (String) itO.next();
                if (f5 <= 0.0d) {
                    k0.a.a("invalid weight; must be greater than zero");
                }
                int i13 = i12 << 3;
                d(str, e2.g(new i1(f5, true), 60), j13, j14, j3.A(14), sVar, (i13 & 7168) | (i13 & 896) | 24576);
                j13 = j11;
                j14 = j12;
                f5 = 1.0f;
            }
            sVar.p(false);
            sVar.p(true);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new i0(list, j11, j12, i11, 1);
        }
    }

    public static final void d(String str, z1.r rVar, long j11, long j12, long j13, l1.n nVar, int i11) {
        int i12;
        l1.s sVar;
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(-1665495081);
        if ((i11 & 6) == 0) {
            i12 = (sVar2.f(str) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar2.f(rVar) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= sVar2.e(j11) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar2.e(j12) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= sVar2.e(j13) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE;
        }
        if (sVar2.T(i12 & 1, (i12 & 9363) != 9362)) {
            z1.r rVarH = d0.n.h(rVar, j11, f0.f28556b);
            q0 q0VarD = j0.o.d(z1.c.f58467e, false);
            int iHashCode = Long.hashCode(sVar2.T);
            q1 q1VarL = sVar2.l();
            z1.r rVarC = z1.a.c(sVar2, rVarH);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar2.h0();
            int i13 = i12;
            if (sVar2.S) {
                sVar2.k(iVar);
            } else {
                sVar2.r0();
            }
            l1.t.J(y2.j.f56917f, q0VarD, sVar2);
            l1.t.J(y2.j.f56916e, q1VarL, sVar2);
            y2.h hVar = y2.j.f56918g;
            if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar2, iHashCode, hVar);
            }
            l1.t.J(y2.j.f56915d, rVarC, sVar2);
            int i14 = i13 >> 3;
            ua.b(str, null, j12, j13, null, null, null, 0L, new u3.k(3), 0L, 0, false, 1, 0, null, sVar2, (i13 & 14) | (i14 & 896) | (i14 & 7168), 3072, 122354);
            sVar = sVar2;
            sVar.p(true);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new e(str, rVar, j11, j12, j13, i11);
        }
    }

    public static final void e(final b bVar, final long j11, final long j12, final long j13, l1.n nVar, final int i11) {
        long j14;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(442269496);
        int i12 = 4;
        long j15 = j11;
        long j16 = j12;
        long j17 = j13;
        int i13 = i11 | (sVar.f(bVar) ? 4 : 2) | (sVar.e(j15) ? 32 : 16) | (sVar.e(j16) ? 256 : 128) | (sVar.e(j17) ? 2048 : 1024);
        if (sVar.T(i13 & 1, (i13 & 1171) != 1170)) {
            z1.r rVarE = e2.e(z1.o.f58481a, 1.0f);
            a2 a2VarA = z1.a(j0.i.g(1), z1.c.L, sVar, 6);
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
            sVar.d0(225836985);
            List list = bVar.f25575a;
            int i14 = 0;
            for (Object obj : list) {
                int i15 = i14 + 1;
                if (i14 < 0) {
                    ns.o.V();
                    throw null;
                }
                String str = (String) obj;
                boolean z11 = i14 == ns.o.A(list);
                float f5 = (list.size() == i12 && i14 == 0) ? 2.0f : 1.0f;
                if (z11) {
                    sVar.d0(672966073);
                    sVar.p(false);
                    j14 = j15;
                } else {
                    sVar.d0(672967445);
                    j14 = ((s1) sVar.j(v1.f31180a)).f31033p;
                    sVar.p(false);
                }
                long j18 = z11 ? j17 : j16;
                long jA = j3.A(z11 ? 14 : 18);
                List list2 = list;
                if (f5 <= 0.0d) {
                    k0.a.a("invalid weight; must be greater than zero");
                }
                if (f5 > Float.MAX_VALUE) {
                    f5 = Float.MAX_VALUE;
                }
                d(str, e2.g(new i1(f5, true), 60), j14, j18, jA, sVar, 0);
                j16 = j12;
                j17 = j13;
                list = list2;
                i14 = i15;
                i12 = 4;
                j15 = j11;
            }
            sVar.p(false);
            sVar.p(true);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new fz.e(j11, j12, j13, i11) { // from class: ei.d

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ long f25581b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ long f25582c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ long f25583d;

                @Override // fz.e
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iM = l1.t.M(1);
                    z.e(this.f25580a, this.f25581b, this.f25582c, this.f25583d, (l1.n) obj2, iM);
                    return b0.f48488a;
                }
            };
        }
    }
}
