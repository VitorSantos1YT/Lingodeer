package l0;

import com.yalantis.ucrop.view.CropImageView;
import f0.h1;
import qp.o2;
import rz.e0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f39224a = new o(null, 0, false, CropImageView.DEFAULT_ASPECT_RATIO, new x(), CropImageView.DEFAULT_ASPECT_RATIO, false, e0.c(vy.j.f54321a), com.bumptech.glide.g.a(), v3.b.b(0, 0, 15), ry.r.f50854a, 0, 0, 0, h1.Vertical, 0, 0);

    public static final w a(int i11, l1.n nVar, int i12) {
        if ((i12 & 1) != 0) {
            i11 = 0;
        }
        Object[] objArr = new Object[0];
        o2 o2Var = w.f39201x;
        boolean zD = ((l1.s) nVar).d(i11) | ((l1.s) nVar).d(0);
        l1.s sVar = (l1.s) nVar;
        Object objQ = sVar.Q();
        if (zD || objQ == l1.m.f39353a) {
            objQ = new fu.x(i11, 4);
            sVar.o0(objQ);
        }
        return (w) w1.j.d(objArr, o2Var, (fz.a) objQ, sVar, 0);
    }
}
