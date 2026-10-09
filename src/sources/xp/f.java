package xp;

import com.lingo.lingoskill.ukrskill.ui.learn.UKRSyllableIntroductionActivity;
import l1.n;
import l1.t;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f56151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ UKRSyllableIntroductionActivity f56152b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f56153c;

    public /* synthetic */ f(UKRSyllableIntroductionActivity uKRSyllableIntroductionActivity, String str, int i11, int i12) {
        this.f56151a = i12;
        this.f56152b = uKRSyllableIntroductionActivity;
        this.f56153c = str;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f56151a;
        b0 b0Var = b0.f48488a;
        String str = this.f56153c;
        UKRSyllableIntroductionActivity uKRSyllableIntroductionActivity = this.f56152b;
        n nVar = (n) obj;
        ((Integer) obj2).getClass();
        int i12 = UKRSyllableIntroductionActivity.H;
        switch (i11) {
            case 0:
                uKRSyllableIntroductionActivity.w(str, nVar, t.M(1));
                break;
            case 1:
                uKRSyllableIntroductionActivity.v(str, nVar, t.M(1));
                break;
            default:
                uKRSyllableIntroductionActivity.q(str, nVar, t.M(1));
                break;
        }
        return b0Var;
    }
}
