package wo;

import com.lingo.lingoskill.turskill.ui.learn.TURSyllableIntroductionActivity;
import l1.n;
import l1.t;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f55187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TURSyllableIntroductionActivity f55188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zo.b f55189c;

    public /* synthetic */ e(TURSyllableIntroductionActivity tURSyllableIntroductionActivity, zo.b bVar, int i11, int i12) {
        this.f55187a = i12;
        this.f55188b = tURSyllableIntroductionActivity;
        this.f55189c = bVar;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f55187a;
        b0 b0Var = b0.f48488a;
        zo.b bVar = this.f55189c;
        TURSyllableIntroductionActivity tURSyllableIntroductionActivity = this.f55188b;
        n nVar = (n) obj;
        ((Integer) obj2).getClass();
        int i12 = TURSyllableIntroductionActivity.H;
        switch (i11) {
            case 0:
                tURSyllableIntroductionActivity.p(bVar, nVar, t.M(1));
                break;
            default:
                tURSyllableIntroductionActivity.s(bVar, nVar, t.M(1));
                break;
        }
        return b0Var;
    }
}
