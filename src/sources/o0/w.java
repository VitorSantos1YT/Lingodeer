package o0;

import bp.f4;
import com.yalantis.ucrop.view.CropImageView;
import f0.h1;
import qp.o2;
import rz.e0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f44457a = 56;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n f44458b = new n(0, 0, 0, h1.Horizontal, 0, 0, 0, g0.l.f28355a, new u(), e0.c(vy.j.f54321a));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final v f44459c = new v();

    public static final long a(n nVar, int i11) {
        long j11 = (((((long) i11) * ((long) (nVar.f44402c + nVar.f44401b))) + ((long) (-nVar.f44405f))) + ((long) nVar.f44403d)) - ((long) nVar.f44402c);
        h1 h1Var = nVar.f44404e;
        h1 h1Var2 = h1.Horizontal;
        long jE = nVar.e();
        int i12 = (int) (h1Var == h1Var2 ? jE >> 32 : jE & 4294967295L);
        nVar.f44412n.getClass();
        long jL = j11 - ((long) (i12 - hz.b.l(0, 0, i12)));
        if (jL < 0) {
            return 0L;
        }
        return jL;
    }

    public static final b b(int i11, int i12, int i13, fz.a aVar, l1.n nVar) {
        boolean z11 = true;
        if ((i13 & 1) != 0) {
            i11 = 0;
        }
        Object[] objArr = new Object[0];
        o2 o2Var = b.I;
        boolean zC = ((((i12 & 14) ^ 6) > 4 && ((l1.s) nVar).d(i11)) || (i12 & 6) == 4) | ((l1.s) nVar).c(CropImageView.DEFAULT_ASPECT_RATIO);
        if ((((i12 & 896) ^ 384) <= 256 || !((l1.s) nVar).f(aVar)) && (i12 & 384) != 256) {
            z11 = false;
        }
        boolean z12 = zC | z11;
        l1.s sVar = (l1.s) nVar;
        Object objQ = sVar.Q();
        if (z12 || objQ == l1.m.f39353a) {
            objQ = new f4(i11, aVar);
            sVar.o0(objQ);
        }
        b bVar = (b) w1.j.d(objArr, o2Var, (fz.a) objQ, sVar, 0);
        bVar.H.setValue(aVar);
        return bVar;
    }
}
