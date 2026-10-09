package h1;

import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class u4 {
    static {
        new l1.v0(t1.L);
    }

    public static final void a(s1 s1Var, w7 w7Var, dc dcVar, t1.d dVar, l1.n nVar, int i11) {
        w7 w7Var2;
        t1.d dVar2;
        w7 w7Var3;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-2127166334);
        if (((i11 | (sVar.f(s1Var) ? 4 : 2) | 16) & 1171) == 1170 && sVar.F()) {
            sVar.W();
            w7Var3 = w7Var;
            dVar2 = dVar;
        } else {
            sVar.Y();
            if ((i11 & 1) == 0 || sVar.C()) {
                w7Var2 = (w7) sVar.j(y7.f31359a);
            } else {
                sVar.W();
                w7Var2 = w7Var;
            }
            sVar.q();
            d0.z0 z0VarA = l7.a(false, CropImageView.DEFAULT_ASPECT_RATIO, 0L, sVar, 0, 7);
            long j11 = s1Var.f31017a;
            boolean zE = sVar.e(j11);
            Object objQ = sVar.Q();
            if (zE || objQ == l1.m.f39353a) {
                objQ = new d1.g1(j11, g2.x.c(j11, 0.4f));
                sVar.o0(objQ);
            }
            dVar2 = dVar;
            l1.t.b(new l1.w1[]{v1.f31180a.a(s1Var), d0.c1.f22650a.a(z0VarA), g1.j.f28525a.a(w1.f31224a), y7.f31359a.a(w7Var2), d1.h1.f22920a.a((d1.g1) objQ), fc.f30256a.a(dcVar)}, t1.e.d(-1066563262, new b2.h(4, dcVar, dVar2), sVar), sVar, 56);
            w7Var3 = w7Var2;
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new a0.t0(s1Var, w7Var3, dcVar, dVar2, i11);
        }
    }
}
