package h1;

import com.alibaba.sdk.android.oss.common.OSSConstants;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n4 {
    static {
        b0.v vVar = k1.s.f37749b;
        a0.m1 m1VarF = a0.f1.f(b0.e.r(100, 0, vVar, 2), 2);
        b0.v vVar2 = k1.s.f37748a;
        m1VarF.a(a0.f1.i(b0.e.r(500, 0, vVar2, 2), 12));
        a0.f1.e(new b0.i2(200, 100, vVar), 2).a(a0.f1.a(b0.e.r(500, 0, vVar2, 2), 12));
    }

    public static final void a(fz.a aVar, z1.r rVar, g2.w0 w0Var, long j11, long j12, h4 h4Var, l1.n nVar, int i11) {
        g2.w0 w0VarA;
        int i12;
        h4 h4Var2;
        g2.w0 w0Var2;
        h4 h4Var3;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-731723913);
        int i13 = i11 | (sVar.h(aVar) ? 4 : 2) | 128 | (sVar.e(j11) ? 2048 : 1024) | (sVar.e(j12) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE) | 1638400;
        if ((4793491 & i13) == 4793490 && sVar.F()) {
            sVar.W();
            w0Var2 = w0Var;
            h4Var3 = h4Var;
        } else {
            sVar.Y();
            if ((i11 & 1) == 0 || sVar.C()) {
                int i14 = g4.f30274a;
                w0VarA = y7.a(k1.k.f37572c, sVar);
                i12 = i13 & (-459649);
                h4Var2 = new h4(k1.k.f37570a, k1.k.f37576g, k1.k.f37574e, k1.k.f37575f);
            } else {
                sVar.W();
                w0VarA = w0Var;
                i12 = i13 & (-459649);
                h4Var2 = h4Var;
            }
            sVar.q();
            sVar.d0(519755085);
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (objQ == gVar) {
                objQ = com.google.android.material.datepicker.d.f(sVar);
            }
            h0.i iVar = (h0.i) objQ;
            sVar.p(false);
            z1.r rVarB = g3.r.b(rVar, false, o0.L);
            int i15 = i12;
            float f5 = h4Var2.f30328a;
            boolean zF = sVar.f(iVar);
            Object objQ2 = sVar.Q();
            if (zF || objQ2 == gVar) {
                objQ2 = new k4(h4Var2.f30328a, h4Var2.f30329b, h4Var2.f30331d, h4Var2.f30330c);
                sVar.o0(objQ2);
            }
            k4 k4Var = (k4) objQ2;
            boolean zH = sVar.h(k4Var) | sVar.f(h4Var2);
            Object objQ3 = sVar.Q();
            vy.d dVar = null;
            if (zH || objQ3 == gVar) {
                objQ3 = new gu.b(4, k4Var, h4Var2, dVar);
                sVar.o0(objQ3);
            }
            l1.t.f((fz.e) objQ3, h4Var2, sVar);
            boolean zF2 = sVar.f(iVar) | sVar.h(k4Var);
            Object objQ4 = sVar.Q();
            if (zF2 || objQ4 == gVar) {
                objQ4 = new fr.c(12, iVar, k4Var, (vy.d) null);
                sVar.o0(objQ4);
            }
            l1.t.f((fz.e) objQ4, iVar, sVar);
            int i16 = i15 << 3;
            w0Var2 = w0VarA;
            i9.c(aVar, rVarB, false, w0Var2, j11, j12, f5, ((v3.f) k4Var.f30536e.f3472c.f3614b.getValue()).f53489a, null, iVar, t1.e.d(1249316354, new l4(j12), sVar), sVar, (i15 & 14) | (57344 & i16) | (i16 & 458752), 260);
            h4Var3 = h4Var2;
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new m4(aVar, rVar, w0Var2, j11, j12, h4Var3, i11);
        }
    }
}
