package j1;

import a0.b2;
import a0.p1;
import b0.b0;
import b0.i2;
import com.google.logging.type.LogSeverity;
import com.yalantis.ucrop.view.CropImageView;
import g2.p0;
import h1.h3;
import h1.p5;
import h1.x5;
import i1.b1;
import j0.e2;
import l1.b3;
import l1.q1;
import l1.t;
import l1.x1;
import w2.q0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f35485a = (float) 2.5d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f35486b = (float) 5.5d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f35487c = 16;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f35488d = 40;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float f35489e = 10;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final float f35490f = 5;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final i2 f35491g = b0.e.r(LogSeverity.NOTICE_VALUE, 0, b0.f3441d, 2);

    public static final void a(boolean z11, fz.a aVar, z1.r rVar, q qVar, z1.e eVar, fz.f fVar, t1.d dVar, l1.n nVar, int i11) {
        q qVar2;
        z1.e eVar2;
        fz.f fVarD;
        z1.r rVar2;
        t1.d dVar2;
        fz.f fVar2;
        z1.e eVar3;
        q qVar3;
        z1.r rVar3;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1902956467);
        if (((i11 | (sVar.g(z11) ? 4 : 2) | (sVar.h(aVar) ? 32 : 16) | 222592) & 599187) == 599186 && sVar.F()) {
            sVar.W();
            rVar3 = rVar;
            qVar3 = qVar;
            eVar3 = eVar;
            dVar2 = dVar;
            fVar2 = fVar;
        } else {
            sVar.Y();
            if ((i11 & 1) == 0 || sVar.C()) {
                qVar2 = (s) w1.j.e(new Object[0], s.f35512b, i.f35484a, sVar, 3072, 4);
                eVar2 = z1.c.f58463a;
                fVarD = t1.e.d(1989171225, new f(qVar2, z11), sVar);
                rVar2 = z1.o.f58481a;
            } else {
                sVar.W();
                rVar2 = rVar;
                qVar2 = qVar;
                eVar2 = eVar;
                fVarD = fVar;
            }
            sVar.q();
            z1.r rVarI = rVar2.i(new d(z11, aVar, qVar2, c.f35463c));
            q0 q0VarD = j0.o.d(eVar2, false);
            int iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, rVarI);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            t.J(y2.j.f56917f, q0VarD, sVar);
            t.J(y2.j.f56916e, q1VarL, sVar);
            y2.h hVar = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
            }
            t.J(y2.j.f56915d, rVarC, sVar);
            j0.r rVar4 = j0.r.f35391a;
            dVar2 = dVar;
            dVar2.invoke(rVar4, sVar, 54);
            fVarD.invoke(rVar4, sVar, 54);
            sVar.p(true);
            fVar2 = fVarD;
            eVar3 = eVar2;
            qVar3 = qVar2;
            rVar3 = rVar2;
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new h3(z11, aVar, rVar3, qVar3, eVar3, fVar2, dVar2, i11);
        }
    }

    public static final void b(fz.a aVar, long j11, l1.n nVar, int i11) {
        int i12;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-569718810);
        if ((i11 & 6) == 0) {
            i12 = (sVar.h(aVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.e(j11) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && sVar.F()) {
            sVar.W();
        } else {
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            Object obj = objQ;
            if (objQ == gVar) {
                g2.k kVarA = g2.o.a();
                kVarA.k(1);
                sVar.o0(kVarA);
                obj = kVarA;
            }
            p0 p0Var = (p0) obj;
            Object objQ2 = sVar.Q();
            if (objQ2 == gVar) {
                objQ2 = t.s(new x5(4, aVar));
                sVar.o0(objQ2);
            }
            b3 b3VarB = b0.h.b(((Number) ((b3) objQ2).getValue()).floatValue(), f35491g, null, sVar, 48, 28);
            int i13 = i12 & 14;
            boolean z11 = i13 == 4;
            Object objQ3 = sVar.Q();
            if (z11 || objQ3 == gVar) {
                objQ3 = new p5(4, aVar);
                sVar.o0(objQ3);
            }
            z1.r rVarN = e2.n(g3.r.b(z1.o.f58481a, true, (fz.c) objQ3), f35487c);
            boolean zF = (i13 == 4) | sVar.f(b3VarB) | ((i12 & 112) == 32) | sVar.h(p0Var);
            Object objQ4 = sVar.Q();
            if (zF || objQ4 == gVar) {
                e eVar = new e(aVar, b3VarB, j11, p0Var, 0);
                sVar.o0(eVar);
                objQ4 = eVar;
            }
            d0.n.b(0, (fz.c) objQ4, sVar, rVarN);
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new b1(aVar, j11, i11);
        }
    }

    public static final void c(i2.d dVar, p0 p0Var, f2.c cVar, long j11, float f5, p1 p1Var) {
        g2.k kVar = (g2.k) p0Var;
        kVar.j();
        kVar.g(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO);
        float f11 = f35489e;
        float fE0 = dVar.e0(f11);
        float f12 = p1Var.f167b;
        kVar.f((fE0 * f12) / 2, dVar.e0(f35490f) * f12);
        kVar.f(dVar.e0(f11) * f12, CropImageView.DEFAULT_ASPECT_RATIO);
        float fE = (f2.b.e(cVar.b()) + (Math.min(cVar.f26574c - cVar.f26572a, cVar.f26575d - cVar.f26573b) / 2.0f)) - ((dVar.e0(f11) * f12) / 2.0f);
        float f13 = f2.b.f(cVar.b());
        float f14 = f35485a;
        kVar.m(com.bumptech.glide.d.c(fE, f13 - dVar.e0(f14)));
        float fE1 = p1Var.f166a - dVar.e0(f14);
        long jR0 = dVar.r0();
        xq.c cVarJ0 = dVar.j0();
        long jH = cVarJ0.H();
        cVarJ0.x().e();
        try {
            ((b2) cVarJ0.f56174b).m(jR0, fE1);
            i2.d.o0(dVar, kVar, j11, f5, new i2.h(dVar.e0(f14), CropImageView.DEFAULT_ASPECT_RATIO, 0, 0, null, 30), 48);
        } finally {
            com.google.android.material.datepicker.d.C(cVarJ0, jH);
        }
    }
}
