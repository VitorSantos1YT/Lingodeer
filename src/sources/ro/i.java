package ro;

import com.lingo.lingoskill.thaiskill.ui.learn.THAISyllableIntroductionActivity;
import com.yalantis.ucrop.view.CropImageView;
import h1.e0;
import l1.m;
import l1.n;
import l1.s;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ THAISyllableIntroductionActivity f49321b;

    public /* synthetic */ i(THAISyllableIntroductionActivity tHAISyllableIntroductionActivity, int i11) {
        this.f49320a = i11;
        this.f49321b = tHAISyllableIntroductionActivity;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f49320a;
        b0 b0Var = b0.f48488a;
        THAISyllableIntroductionActivity tHAISyllableIntroductionActivity = this.f49321b;
        int i12 = 1;
        switch (i11) {
            case 0:
                n nVar = (n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i13 = THAISyllableIntroductionActivity.M;
                s sVar = (s) nVar;
                if (!sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    sVar.W();
                } else {
                    e0.c(a.f49305a, null, t1.e.d(-1583621809, new i(tHAISyllableIntroductionActivity, i12), sVar), null, CropImageView.DEFAULT_ASPECT_RATIO, null, null, null, sVar, 390, 250);
                }
                break;
            default:
                n nVar2 = (n) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i14 = THAISyllableIntroductionActivity.M;
                s sVar2 = (s) nVar2;
                if (!sVar2.T(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    sVar2.W();
                } else {
                    boolean zH = sVar2.h(tHAISyllableIntroductionActivity);
                    Object objQ = sVar2.Q();
                    if (zH || objQ == m.f39353a) {
                        objQ = new lt.e(tHAISyllableIntroductionActivity, 27);
                        sVar2.o0(objQ);
                    }
                    iu.k.j((fz.a) objQ, sVar2, 0);
                }
                break;
        }
        return b0Var;
    }
}
