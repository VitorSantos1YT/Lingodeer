package jl;

import com.lingo.lingoskill.hindiskill.ui.learn.HINDISyllableIntroductionActivity;
import com.yalantis.ucrop.view.CropImageView;
import h1.e0;
import hh.o;
import l1.m;
import l1.n;
import l1.s;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HINDISyllableIntroductionActivity f36417b;

    public /* synthetic */ c(HINDISyllableIntroductionActivity hINDISyllableIntroductionActivity, int i11) {
        this.f36416a = i11;
        this.f36417b = hINDISyllableIntroductionActivity;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f36416a;
        b0 b0Var = b0.f48488a;
        HINDISyllableIntroductionActivity hINDISyllableIntroductionActivity = this.f36417b;
        int i12 = 1;
        switch (i11) {
            case 0:
                n nVar = (n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i13 = HINDISyllableIntroductionActivity.K;
                s sVar = (s) nVar;
                if (!sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    sVar.W();
                } else {
                    e0.c(a.f36415a, null, t1.e.d(1144466391, new c(hINDISyllableIntroductionActivity, i12), sVar), null, CropImageView.DEFAULT_ASPECT_RATIO, null, null, null, sVar, 390, 250);
                }
                break;
            default:
                n nVar2 = (n) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i14 = HINDISyllableIntroductionActivity.K;
                s sVar2 = (s) nVar2;
                if (!sVar2.T(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    sVar2.W();
                } else {
                    boolean zH = sVar2.h(hINDISyllableIntroductionActivity);
                    Object objQ = sVar2.Q();
                    if (zH || objQ == m.f39353a) {
                        objQ = new o(hINDISyllableIntroductionActivity, 12);
                        sVar2.o0(objQ);
                    }
                    iu.k.j((fz.a) objQ, sVar2, 0);
                }
                break;
        }
        return b0Var;
    }
}
