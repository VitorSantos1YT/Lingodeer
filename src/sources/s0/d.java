package s0;

import dt.c3;
import j0.e2;
import l1.x1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f51012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f51013b;

    static {
        float f5 = 25;
        f51012a = f5;
        f51013b = (f5 * 2.0f) / 2.4142137f;
    }

    public static final void a(d1.l lVar, z1.r rVar, long j11, l1.n nVar, int i11) {
        int i12;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1776202187);
        int i13 = (sVar.f(lVar) ? 4 : 2) | i11 | (sVar.f(rVar) ? 32 : 16) | 128;
        if (sVar.T(i13 & 1, (i13 & 147) != 146)) {
            sVar.Y();
            if ((i11 & 1) == 0 || sVar.C()) {
                i12 = i13 & (-897);
                j11 = 9205357640488583168L;
            } else {
                sVar.W();
                i12 = i13 & (-897);
            }
            sVar.q();
            int i14 = i12 & 14;
            boolean z11 = i14 == 4;
            Object objQ = sVar.Q();
            if (z11 || objQ == l1.m.f39353a) {
                objQ = new a(lVar, 0);
                sVar.o0(objQ);
            }
            qx.p.c(lVar, z1.c.f58464b, t1.e.d(-1653527038, new b(j11, g3.r.b(rVar, false, (fz.c) objQ)), sVar), sVar, i14 | 432);
        } else {
            sVar.W();
        }
        long j12 = j11;
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new km.v0(lVar, rVar, j12, i11, 1);
        }
    }

    public static final void b(int i11, int i12, l1.n nVar, z1.r rVar) {
        int i13;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(694251107);
        int i14 = i12 & 1;
        if (i14 != 0) {
            i13 = i11 | 6;
        } else {
            i13 = (sVar.f(rVar) ? 4 : 2) | i11;
        }
        if (sVar.T(i13 & 1, (i13 & 3) != 2)) {
            if (i14 != 0) {
                rVar = z1.o.f58481a;
            }
            j0.c.g(sVar, z1.a.a(e2.p(rVar, f51013b, f51012a), c.f51010a));
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new c3(rVar, i11, i12, 5);
        }
    }
}
