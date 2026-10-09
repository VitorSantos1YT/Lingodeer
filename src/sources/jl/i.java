package jl;

import com.lingo.lingoskill.hindiskill.ui.learn.HINDISyllableIntroductionActivity;
import l1.n;
import l1.t;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HINDISyllableIntroductionActivity f36433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f36434c;

    public /* synthetic */ i(HINDISyllableIntroductionActivity hINDISyllableIntroductionActivity, String str, int i11, int i12) {
        this.f36432a = i12;
        this.f36433b = hINDISyllableIntroductionActivity;
        this.f36434c = str;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f36432a;
        b0 b0Var = b0.f48488a;
        String str = this.f36434c;
        HINDISyllableIntroductionActivity hINDISyllableIntroductionActivity = this.f36433b;
        n nVar = (n) obj;
        ((Integer) obj2).getClass();
        int i12 = HINDISyllableIntroductionActivity.K;
        switch (i11) {
            case 0:
                hINDISyllableIntroductionActivity.q(str, nVar, t.M(1));
                break;
            default:
                hINDISyllableIntroductionActivity.v(str, nVar, t.M(1));
                break;
        }
        return b0Var;
    }
}
