package jl;

import com.lingo.lingoskill.hindiskill.ui.learn.HINDISyllableIntroductionActivity;
import l1.n;
import l1.t;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HINDISyllableIntroductionActivity f36422b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ml.a f36423c;

    public /* synthetic */ e(HINDISyllableIntroductionActivity hINDISyllableIntroductionActivity, ml.a aVar, int i11, int i12) {
        this.f36421a = i12;
        this.f36422b = hINDISyllableIntroductionActivity;
        this.f36423c = aVar;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f36421a;
        b0 b0Var = b0.f48488a;
        ml.a aVar = this.f36423c;
        HINDISyllableIntroductionActivity hINDISyllableIntroductionActivity = this.f36422b;
        n nVar = (n) obj;
        ((Integer) obj2).getClass();
        int i12 = HINDISyllableIntroductionActivity.K;
        switch (i11) {
            case 0:
                hINDISyllableIntroductionActivity.w(aVar, nVar, t.M(1));
                break;
            default:
                hINDISyllableIntroductionActivity.p(aVar, nVar, t.M(1));
                break;
        }
        return b0Var;
    }
}
