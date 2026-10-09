package h1;

import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h0 f30315a = new h0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f30316b;

    static {
        k1.c cVar = k1.e0.f37503a;
        float f5 = k1.e0.f37508f;
        f30316b = 640;
    }

    public final void a(z1.r rVar, float f5, float f11, g2.w0 w0Var, long j11, l1.n nVar, int i11) {
        float f12;
        float f13;
        z1.r rVar2;
        g2.w0 w0Var2;
        long j12;
        l1.s sVar;
        float f14;
        float f15;
        z1.r rVar3;
        g2.w0 w0Var3;
        long j13;
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(-1364277227);
        if (((i11 | 9654) & 9363) == 9362 && sVar2.F()) {
            sVar2.W();
            rVar3 = rVar;
            f14 = f5;
            f15 = f11;
            w0Var3 = w0Var;
            j13 = j11;
            sVar = sVar2;
        } else {
            sVar2.Y();
            if ((i11 & 1) == 0 || sVar2.C()) {
                f12 = k1.e0.f37507e;
                f13 = k1.e0.f37506d;
                r0.e eVar = ((w7) sVar2.j(y7.f31359a)).f31245e;
                long jD = v1.d(k1.e0.f37505c, sVar2);
                rVar2 = z1.o.f58481a;
                w0Var2 = eVar;
                j12 = jD;
            } else {
                sVar2.W();
                rVar2 = rVar;
                f12 = f5;
                f13 = f11;
                w0Var2 = w0Var;
                j12 = j11;
            }
            sVar2.q();
            String strI = i1.p.i(sVar2, R.string.m3c_bottom_sheet_drag_handle_description);
            z1.r rVarC = j0.c.C(rVar2, CropImageView.DEFAULT_ASPECT_RATIO, b8.f30044a, 1);
            boolean zF = sVar2.f(strI);
            Object objQ = sVar2.Q();
            if (zF || objQ == l1.m.f39353a) {
                objQ = new c6.o(strI, 3);
                sVar2.o0(objQ);
            }
            sVar = sVar2;
            i9.a(g3.r.b(rVarC, false, (fz.c) objQ), w0Var2, j12, 0L, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, t1.e.d(-1039573072, new f0(f12, f13), sVar2), sVar, 12582912, 120);
            f14 = f12;
            f15 = f13;
            rVar3 = rVar2;
            w0Var3 = w0Var2;
            j13 = j12;
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new g0(this, rVar3, f14, f15, w0Var3, j13, i11);
        }
    }
}
