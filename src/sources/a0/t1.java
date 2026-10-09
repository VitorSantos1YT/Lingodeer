package a0;

import b0.j2;
import com.yalantis.ucrop.view.CropImageView;
import l1.b3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b0.i1 f193a = b0.e.q(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, 7);

    public static final b3 a(long j11, b0.c0 c0Var, String str, l1.n nVar, int i11, int i12) {
        if ((i12 & 2) != 0) {
            c0Var = f193a;
        }
        b0.c0 c0Var2 = c0Var;
        if ((i12 & 4) != 0) {
            str = "ColorAnimation";
        }
        String str2 = str;
        l1.s sVar = (l1.s) nVar;
        boolean zF = sVar.f(g2.x.g(j11));
        Object objQ = sVar.Q();
        if (zF || objQ == l1.m.f39353a) {
            j2 j2Var = new j2(c.f33t, new o0(g2.x.g(j11), 0));
            sVar.o0(j2Var);
            objQ = j2Var;
        }
        return b0.h.c(new g2.x(j11), (j2) objQ, c0Var2, null, str2, sVar, ((i11 << 3) & 896) | ((i11 << 6) & 57344), 8);
    }
}
