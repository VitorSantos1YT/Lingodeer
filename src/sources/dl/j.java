package dl;

import com.lingo.lingoskill.grkskill.ui.learn.GRKSyllableIntroductionActivity;
import l1.t;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GRKSyllableIntroductionActivity f23469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f23470c;

    public /* synthetic */ j(GRKSyllableIntroductionActivity gRKSyllableIntroductionActivity, String str, int i11, int i12) {
        this.f23468a = i12;
        this.f23469b = gRKSyllableIntroductionActivity;
        this.f23470c = str;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f23468a;
        b0 b0Var = b0.f48488a;
        String str = this.f23470c;
        GRKSyllableIntroductionActivity gRKSyllableIntroductionActivity = this.f23469b;
        l1.n nVar = (l1.n) obj;
        ((Integer) obj2).getClass();
        int i12 = GRKSyllableIntroductionActivity.H;
        switch (i11) {
            case 0:
                gRKSyllableIntroductionActivity.q(str, nVar, t.M(1));
                break;
            case 1:
                gRKSyllableIntroductionActivity.v(str, nVar, t.M(1));
                break;
            default:
                gRKSyllableIntroductionActivity.u(str, nVar, t.M(1));
                break;
        }
        return b0Var;
    }
}
