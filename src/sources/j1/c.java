package j1;

import a0.j0;
import g2.f0;
import h1.s1;
import h1.v1;
import j0.e2;
import l1.c3;
import l1.q1;
import l1.t;
import l1.x1;
import w2.q0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f35461a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final r0.e f35462b = r0.f.f48733a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f35463c = 80;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f35464d = k1.h.f37539c;

    public final void a(q qVar, boolean z11, z1.r rVar, long j11, long j12, float f5, l1.n nVar, int i11) {
        float f11;
        long j13;
        int i12;
        long j14;
        long j15;
        float f12;
        long j16;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-1076870256);
        int i13 = i11 | (sVar.f(qVar) ? 4 : 2) | (sVar.g(z11) ? 32 : 16) | (sVar.f(rVar) ? 256 : 128) | 74752;
        if ((599187 & i13) == 599186 && sVar.F()) {
            sVar.W();
            j15 = j11;
            j16 = j12;
            f12 = f5;
        } else {
            sVar.Y();
            if ((i11 & 1) == 0 || sVar.C()) {
                c3 c3Var = v1.f31180a;
                long j17 = ((s1) sVar.j(c3Var)).G;
                long j18 = ((s1) sVar.j(c3Var)).f31036s;
                f11 = f35463c;
                j13 = j18;
                i12 = i13 & (-523265);
                j14 = j17;
            } else {
                sVar.W();
                j13 = j12;
                f11 = f5;
                i12 = i13 & (-523265);
                j14 = j11;
            }
            sVar.q();
            float f13 = j.f35485a;
            z1.r rVarF = d2.h.f(e2.n(rVar, j.f35488d), g.f35476b);
            float f14 = f35464d;
            r0.e eVar = f35462b;
            float f15 = f11;
            z1.r rVarH = d0.n.h(f0.q(rVarF, new h(qVar, z11, f15, f14, eVar)), j14, eVar);
            q0 q0VarD = j0.o.d(z1.c.f58467e, false);
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
            t.J(y2.j.f56917f, q0VarD, sVar);
            t.J(y2.j.f56916e, q1VarL, sVar);
            y2.h hVar = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
            }
            t.J(y2.j.f56915d, rVarC, sVar);
            j0.g(Boolean.valueOf(z11), null, b0.e.r(100, 0, null, 6), null, t1.e.d(167807595, new a(j13, qVar), sVar), sVar, ((i12 >> 3) & 14) | 24960, 10);
            sVar.p(true);
            j15 = j14;
            f12 = f15;
            j16 = j13;
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new b(this, qVar, z11, rVar, j15, j16, f12, i11);
        }
    }
}
