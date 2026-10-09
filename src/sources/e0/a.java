package e0;

import com.yalantis.ucrop.view.CropImageView;
import g2.f0;
import j0.e2;
import j0.o;
import l1.n;
import l1.s;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f24634a = new a();

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        c cVar = (c) obj;
        n nVar = (n) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= ((s) nVar).f(cVar) ? 4 : 2;
        }
        s sVar = (s) nVar;
        if (sVar.T(iIntValue & 1, (iIntValue & 19) != 18)) {
            o.a(d0.n.h(e2.g(e2.e(j0.c.C(z1.o.f58481a, CropImageView.DEFAULT_ASPECT_RATIO, f.f24657l, 1), 1.0f), f.f24656k), cVar.f24638c, f0.f28556b), sVar, 0);
        } else {
            sVar.W();
        }
        return b0.f48488a;
    }
}
