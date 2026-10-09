package ro;

import com.lingo.lingoskill.thaiskill.ui.learn.THAISyllableIntroductionActivity;
import l1.n;
import l1.t;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ THAISyllableIntroductionActivity f49307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ uo.a f49308c;

    public /* synthetic */ c(THAISyllableIntroductionActivity tHAISyllableIntroductionActivity, uo.a aVar, int i11, int i12) {
        this.f49306a = i12;
        this.f49307b = tHAISyllableIntroductionActivity;
        this.f49308c = aVar;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f49306a;
        b0 b0Var = b0.f48488a;
        uo.a aVar = this.f49308c;
        THAISyllableIntroductionActivity tHAISyllableIntroductionActivity = this.f49307b;
        n nVar = (n) obj;
        ((Integer) obj2).getClass();
        int i12 = THAISyllableIntroductionActivity.M;
        switch (i11) {
            case 0:
                tHAISyllableIntroductionActivity.p(aVar, nVar, t.M(1));
                break;
            default:
                tHAISyllableIntroductionActivity.u(aVar, nVar, t.M(1));
                break;
        }
        return b0Var;
    }
}
