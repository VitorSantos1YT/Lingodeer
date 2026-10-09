package dl;

import com.lingo.lingoskill.grkskill.ui.learn.GRKSyllableIntroductionActivity;
import com.yalantis.ucrop.view.CropImageView;
import h1.e0;
import l1.s;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GRKSyllableIntroductionActivity f23450b;

    public /* synthetic */ e(GRKSyllableIntroductionActivity gRKSyllableIntroductionActivity, int i11) {
        this.f23449a = i11;
        this.f23450b = gRKSyllableIntroductionActivity;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f23449a;
        b0 b0Var = b0.f48488a;
        GRKSyllableIntroductionActivity gRKSyllableIntroductionActivity = this.f23450b;
        int i12 = 0;
        switch (i11) {
            case 0:
                l1.n nVar = (l1.n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i13 = GRKSyllableIntroductionActivity.H;
                s sVar = (s) nVar;
                if (!sVar.T(1 & iIntValue, (iIntValue & 3) != 2)) {
                    sVar.W();
                } else {
                    boolean zH = sVar.h(gRKSyllableIntroductionActivity);
                    Object objQ = sVar.Q();
                    if (zH || objQ == l1.m.f39353a) {
                        objQ = new cr.n(gRKSyllableIntroductionActivity, 4);
                        sVar.o0(objQ);
                    }
                    iu.k.j((fz.a) objQ, sVar, 0);
                }
                break;
            default:
                l1.n nVar2 = (l1.n) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i14 = GRKSyllableIntroductionActivity.H;
                s sVar2 = (s) nVar2;
                if (!sVar2.T(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    sVar2.W();
                } else {
                    e0.c(a.f23438a, null, t1.e.d(-439813253, new e(gRKSyllableIntroductionActivity, i12), sVar2), null, CropImageView.DEFAULT_ASPECT_RATIO, null, null, null, sVar2, 390, 250);
                }
                break;
        }
        return b0Var;
    }
}
