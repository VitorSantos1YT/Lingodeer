package xp;

import com.lingo.lingoskill.ukrskill.ui.learn.UKRSyllableIntroductionActivity;
import com.yalantis.ucrop.view.CropImageView;
import h1.e0;
import iu.k;
import l1.m;
import l1.n;
import l1.s;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f56142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ UKRSyllableIntroductionActivity f56143b;

    public /* synthetic */ c(UKRSyllableIntroductionActivity uKRSyllableIntroductionActivity, int i11) {
        this.f56142a = i11;
        this.f56143b = uKRSyllableIntroductionActivity;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f56142a;
        b0 b0Var = b0.f48488a;
        UKRSyllableIntroductionActivity uKRSyllableIntroductionActivity = this.f56143b;
        int i12 = 1;
        switch (i11) {
            case 0:
                n nVar = (n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i13 = UKRSyllableIntroductionActivity.H;
                s sVar = (s) nVar;
                if (!sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    sVar.W();
                } else {
                    e0.c(a.f56141a, null, t1.e.d(-622124413, new c(uKRSyllableIntroductionActivity, i12), sVar), null, CropImageView.DEFAULT_ASPECT_RATIO, null, null, null, sVar, 390, 250);
                }
                break;
            default:
                n nVar2 = (n) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i14 = UKRSyllableIntroductionActivity.H;
                s sVar2 = (s) nVar2;
                if (!sVar2.T(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    sVar2.W();
                } else {
                    boolean zH = sVar2.h(uKRSyllableIntroductionActivity);
                    Object objQ = sVar2.Q();
                    if (zH || objQ == m.f39353a) {
                        objQ = new xa.a(uKRSyllableIntroductionActivity, 3);
                        sVar2.o0(objQ);
                    }
                    k.j((fz.a) objQ, sVar2, 0);
                }
                break;
        }
        return b0Var;
    }
}
