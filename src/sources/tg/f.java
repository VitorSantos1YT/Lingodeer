package tg;

import com.yalantis.ucrop.view.CropImageView;
import j0.e2;
import l1.c3;
import l1.q1;
import l1.x1;
import z2.g1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f52270a = new c();

    public static final void a(i0 i0Var, t1.d dVar, l1.n nVar, int i11) {
        int i12;
        z1.o oVar;
        kotlin.jvm.internal.m.f(i0Var, "<this>");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(917212583);
        if ((i11 & 6) == 0) {
            i12 = (sVar.f(i0Var) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(dVar) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && sVar.F()) {
            sVar.W();
        } else {
            c cVar = k0.c(k0.b(i0Var, sVar)).f52302d;
            kotlin.jvm.internal.m.c(cVar);
            sVar.d0(-439858);
            c3 c3Var = g1.f58547h;
            v3.c cVar2 = (v3.c) sVar.j(c3Var);
            v3.o oVar2 = k0.c(k0.b(i0Var, sVar)).f52299a;
            kotlin.jvm.internal.m.c(oVar2);
            float fW = cVar2.w(oVar2.f53502a) / 2;
            sVar.p(false);
            sVar.d0(-429618);
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (objQ == gVar) {
                objQ = e.f52268a;
                sVar.o0(objQ);
            }
            w2.q0 q0Var = (w2.q0) objQ;
            sVar.p(false);
            int iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            z1.o oVar3 = z1.o.f58481a;
            z1.r rVarC = z1.a.c(sVar, oVar3);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(y2.j.f56917f, q0Var, sVar);
            l1.t.J(y2.j.f56916e, q1VarL, sVar);
            y2.h hVar = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
            }
            l1.t.J(y2.j.f56915d, rVarC, sVar);
            sVar.d0(1307483265);
            sVar.d0(2046098125);
            v3.c cVar3 = (v3.c) sVar.j(c3Var);
            long j11 = ((g2.x) cVar.f52257d.invoke(new g2.x(h0.c(i0Var, sVar)))).f28624a;
            long j12 = cVar.f52254a;
            long j13 = cVar.f52256c;
            long j14 = cVar.f52255b;
            int i13 = i12;
            sVar.d0(-348211689);
            boolean zE = sVar.e(j12) | sVar.e(j13) | sVar.e(j14) | sVar.e(j11);
            Object objQ2 = sVar.Q();
            if (zE || objQ2 == gVar) {
                oVar = oVar3;
                objQ2 = d0.n.h(e2.s(j0.c.E(oVar, cVar3.w(j12), CropImageView.DEFAULT_ASPECT_RATIO, cVar3.w(j13), CropImageView.DEFAULT_ASPECT_RATIO, 10), cVar3.w(j14)), j11, r0.f.a());
                sVar.o0(objQ2);
            } else {
                oVar = oVar3;
            }
            sVar.p(false);
            j0.o.a((z1.r) objQ2, sVar, 0);
            sVar.p(false);
            sVar.p(false);
            v.a(j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, fW, CropImageView.DEFAULT_ASPECT_RATIO, fW, 5), null, dVar, sVar, (i13 << 3) & 896, 2);
            sVar.p(true);
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new d(i0Var, dVar, i11, 0);
        }
    }
}
