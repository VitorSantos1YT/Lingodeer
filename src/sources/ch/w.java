package ch;

import bt.a2;
import com.yalantis.ucrop.view.CropImageView;
import j0.e2;
import l1.a1;
import l1.h1;
import ys.y0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class w implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a1 f7115b;

    public /* synthetic */ w(a1 a1Var, int i11) {
        this.f7114a = i11;
        this.f7115b = a1Var;
    }

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f7114a) {
            case 0:
                fz.a showNext = (fz.a) obj;
                l1.n nVar = (l1.n) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(showNext, "showNext");
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((l1.s) nVar).h(showNext) ? 4 : 2;
                }
                l1.s sVar = (l1.s) nVar;
                if (sVar.T(iIntValue & 1, (iIntValue & 19) != 18)) {
                    y0.d(((h1) this.f7115b).l(), 100, (int) xt.b.f56286h, false, t1.e.d(-1854058483, new at.o(5, showNext), sVar), sVar, 24624, 8);
                } else {
                    sVar.W();
                }
                break;
            case 1:
                a0.k0 AnimatedVisibility = (a0.k0) obj;
                ((Integer) obj3).getClass();
                kotlin.jvm.internal.m.f(AnimatedVisibility, "$this$AnimatedVisibility");
                l1.s sVar2 = (l1.s) ((l1.n) obj2);
                Object objQ = sVar2.Q();
                if (objQ == l1.m.f39353a) {
                    objQ = new a2(this.f7115b, 7);
                    sVar2.o0(objQ);
                }
                fu.a.c(w2.a0.m(z1.o.f58481a, (fz.c) objQ), sVar2, 6);
                break;
            default:
                j0.v Card = (j0.v) obj;
                l1.n nVar2 = (l1.n) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(Card, "$this$Card");
                l1.s sVar3 = (l1.s) nVar2;
                if (sVar3.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    d0.n.c(se.k.y(((h1) this.f7115b).l(), sVar3, 0), null, e2.n(j0.c.B(z1.o.f58481a, 2, 1), 16), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar3, 432, 120);
                } else {
                    sVar3.W();
                }
                break;
        }
        return qy.b0.f48488a;
    }
}
