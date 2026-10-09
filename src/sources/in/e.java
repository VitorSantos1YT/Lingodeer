package in;

import com.lingo.lingoskill.malskill.ui.learn.MALSyllableIntroductionActivity;
import l1.n;
import l1.t;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MALSyllableIntroductionActivity f34473b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f34474c;

    public /* synthetic */ e(MALSyllableIntroductionActivity mALSyllableIntroductionActivity, String str, int i11, int i12) {
        this.f34472a = i12;
        this.f34473b = mALSyllableIntroductionActivity;
        this.f34474c = str;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f34472a;
        b0 b0Var = b0.f48488a;
        String str = this.f34474c;
        MALSyllableIntroductionActivity mALSyllableIntroductionActivity = this.f34473b;
        n nVar = (n) obj;
        ((Integer) obj2).getClass();
        int i12 = MALSyllableIntroductionActivity.Q;
        switch (i11) {
            case 0:
                mALSyllableIntroductionActivity.q(str, nVar, t.M(7));
                break;
            default:
                mALSyllableIntroductionActivity.s(str, nVar, t.M(7));
                break;
        }
        return b0Var;
    }
}
