package ch;

import bp.n1;
import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;
import fr.j3;
import g2.v0;
import h1.k7;
import h1.s1;
import h1.ua;
import h1.v1;
import j0.e2;
import l1.q1;
import l1.x1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f7040a = g2.f0.e(4294937614L);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f7041b = g2.f0.e(4288982967L);

    public static final void a(fz.a aVar, fz.a aVar2, l1.n nVar, int i11) {
        fz.a aVar3;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(454156477);
        int i12 = (sVar.h(aVar) ? 4 : 2) | i11 | (sVar.h(aVar2) ? 32 : 16);
        if (sVar.T(i12 & 1, (i12 & 19) != 18)) {
            aVar3 = aVar;
            h1.k.d(aVar3, null, null, t1.e.d(1221968375, new n1(1, aVar, aVar2), sVar), sVar, (i12 & 14) | 3072, 6);
        } else {
            aVar3 = aVar;
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new n1(i11, 2, aVar3, aVar2);
        }
    }

    public static final void b(fz.a aVar, fz.a aVar2, z1.r rVar, l1.n nVar, int i11) {
        int i12;
        z1.r rVar2;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1781805551);
        if ((i11 & 6) == 0) {
            i12 = i11 | (sVar.h(aVar) ? 4 : 2);
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(aVar2) ? 32 : 16;
        }
        int i13 = i12 | 384;
        if (sVar.T(i13 & 1, (i13 & 147) != 146)) {
            w2.q0 q0VarD = j0.o.d(z1.c.f58463a, false);
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
            y2.h hVar = y2.j.f56917f;
            l1.t.J(hVar, q0VarD, sVar);
            y2.h hVar2 = y2.j.f56916e;
            l1.t.J(hVar2, q1VarL, sVar);
            y2.h hVar3 = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar3);
            }
            y2.h hVar4 = y2.j.f56915d;
            l1.t.J(hVar4, rVarC, sVar);
            j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.P, sVar, 48);
            int iHashCode2 = Long.hashCode(sVar.T);
            q1 q1VarL2 = sVar.l();
            z1.r rVarC2 = z1.a.c(sVar, oVar);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar, uVarA, sVar);
            l1.t.J(hVar2, q1VarL2, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar3);
            }
            l1.t.J(hVar4, rVarC2, sVar);
            j0.c.g(sVar, e2.g(oVar, 123));
            k7.d(e2.t(oVar, 280, 306), r0.f.d(16), null, null, null, t1.e.d(780153281, new e(0, aVar, aVar2), sVar), sVar, 196614, 28);
            ep.a.C(oVar, 100, sVar, true);
            d0.n.c(se.k.y(R.drawable.gp_review_mascot, sVar, 0), null, e2.p(j0.r.f35391a.a(oVar, z1.c.f58464b), 195, 143), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar, 56, 120);
            sVar = sVar;
            sVar.p(true);
            rVar2 = oVar;
        } else {
            sVar.W();
            rVar2 = rVar;
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new f(aVar, aVar2, rVar2, i11, 0);
        }
    }

    public static final void c(z1.r rVar, l1.n nVar, int i11) {
        l1.s sVar;
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(1729321767);
        if (sVar2.T(i11 & 1, (i11 & 3) != 2)) {
            sVar = sVar2;
            ua.c(e(ub.a.e0(sVar2, R.string.gp_review_journey_text)), j0.c.C(rVar, 22, CropImageView.DEFAULT_ASPECT_RATIO, 2), ((s1) sVar2.j(v1.f31180a)).f31034q, j3.A(16), n3.s.L, 0L, new u3.k(3), 0L, 0, false, 0, 0, null, null, null, sVar, 199680, 0, 261584);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new g(rVar, i11, 1);
        }
    }

    public static final void d(z1.r rVar, l1.n nVar, int i11) {
        l1.s sVar;
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(586357112);
        if (sVar2.T(i11 & 1, (i11 & 3) != 2)) {
            sVar = sVar2;
            ua.c(e(ub.a.e0(sVar2, R.string.gp_review_request_text)), j0.c.C(rVar, 22, CropImageView.DEFAULT_ASPECT_RATIO, 2), ((s1) sVar2.j(v1.f31180a)).f31034q, j3.A(14), n3.s.H, 0L, new u3.k(3), 0L, 0, false, 0, 0, null, null, null, sVar, 199680, 0, 261584);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new g(rVar, i11, 0);
        }
    }

    public static final j3.h e(String str) {
        j3.e eVar = new j3.e();
        int i11 = 0;
        while (i11 < str.length()) {
            if (str.charAt(i11) == '*') {
                int i12 = i11 + 1;
                int iH0 = oz.q.H0(str, '*', i12, 4);
                if (iH0 > i12) {
                    int i13 = eVar.i(new j3.p0(f7040a, 0L, n3.s.L, (n3.o) null, (n3.p) null, (n3.i) null, (String) null, 0L, (u3.a) null, (u3.p) null, (q3.b) null, 0L, (u3.l) null, (v0) null, 65530));
                    try {
                        String strSubstring = str.substring(i12, iH0);
                        kotlin.jvm.internal.m.e(strSubstring, "substring(...)");
                        eVar.d(strSubstring);
                        eVar.f(i13);
                        i11 = iH0 + 1;
                    } catch (Throwable th2) {
                        eVar.f(i13);
                        throw th2;
                    }
                } else {
                    eVar.b(str.charAt(i11));
                    i11 = i12;
                }
            } else {
                eVar.b(str.charAt(i11));
                i11++;
            }
        }
        return eVar.j();
    }
}
