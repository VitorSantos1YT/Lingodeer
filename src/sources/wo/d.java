package wo;

import com.lingo.lingoskill.turskill.ui.learn.TURSyllableIntroductionActivity;
import com.yalantis.ucrop.view.CropImageView;
import h1.e0;
import iu.k;
import l1.m;
import l1.n;
import l1.s;
import qy.b0;
import s0.u;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f55185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TURSyllableIntroductionActivity f55186b;

    public /* synthetic */ d(TURSyllableIntroductionActivity tURSyllableIntroductionActivity, int i11) {
        this.f55185a = i11;
        this.f55186b = tURSyllableIntroductionActivity;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f55185a;
        b0 b0Var = b0.f48488a;
        TURSyllableIntroductionActivity tURSyllableIntroductionActivity = this.f55186b;
        int i12 = 0;
        switch (i11) {
            case 0:
                n nVar = (n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i13 = TURSyllableIntroductionActivity.H;
                s sVar = (s) nVar;
                if (!sVar.T(1 & iIntValue, (iIntValue & 3) != 2)) {
                    sVar.W();
                } else {
                    boolean zH = sVar.h(tURSyllableIntroductionActivity);
                    Object objQ = sVar.Q();
                    if (zH || objQ == m.f39353a) {
                        objQ = new u(tURSyllableIntroductionActivity, 25);
                        sVar.o0(objQ);
                    }
                    k.j((fz.a) objQ, sVar, 0);
                }
                break;
            default:
                n nVar2 = (n) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i14 = TURSyllableIntroductionActivity.H;
                s sVar2 = (s) nVar2;
                if (!sVar2.T(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    sVar2.W();
                } else {
                    e0.c(a.f55182a, null, t1.e.d(-570031751, new d(tURSyllableIntroductionActivity, i12), sVar2), null, CropImageView.DEFAULT_ASPECT_RATIO, null, null, null, sVar2, 390, 250);
                }
                break;
        }
        return b0Var;
    }
}
