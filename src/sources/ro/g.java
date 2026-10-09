package ro;

import com.lingo.lingoskill.thaiskill.ui.learn.THAISyllableIntroductionActivity;
import l1.n;
import l1.t;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class g implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ THAISyllableIntroductionActivity f49316b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f49317c;

    public /* synthetic */ g(THAISyllableIntroductionActivity tHAISyllableIntroductionActivity, String str, int i11, int i12) {
        this.f49315a = i12;
        this.f49316b = tHAISyllableIntroductionActivity;
        this.f49317c = str;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f49315a;
        b0 b0Var = b0.f48488a;
        String str = this.f49317c;
        THAISyllableIntroductionActivity tHAISyllableIntroductionActivity = this.f49316b;
        n nVar = (n) obj;
        ((Integer) obj2).getClass();
        int i12 = THAISyllableIntroductionActivity.M;
        switch (i11) {
            case 0:
                tHAISyllableIntroductionActivity.t(str, nVar, t.M(1));
                break;
            case 1:
                tHAISyllableIntroductionActivity.s(str, nVar, t.M(1));
                break;
            default:
                tHAISyllableIntroductionActivity.q(str, nVar, t.M(1));
                break;
        }
        return b0Var;
    }
}
