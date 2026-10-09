package dl;

import com.lingo.lingoskill.grkskill.ui.learn.GRKSyllableIntroductionActivity;
import l1.t;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GRKSyllableIntroductionActivity f23440b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ gl.a f23441c;

    public /* synthetic */ c(GRKSyllableIntroductionActivity gRKSyllableIntroductionActivity, gl.a aVar, int i11, int i12) {
        this.f23439a = i12;
        this.f23440b = gRKSyllableIntroductionActivity;
        this.f23441c = aVar;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f23439a;
        b0 b0Var = b0.f48488a;
        gl.a aVar = this.f23441c;
        GRKSyllableIntroductionActivity gRKSyllableIntroductionActivity = this.f23440b;
        l1.n nVar = (l1.n) obj;
        ((Integer) obj2).getClass();
        int i12 = GRKSyllableIntroductionActivity.H;
        switch (i11) {
            case 0:
                gRKSyllableIntroductionActivity.w(aVar, nVar, t.M(1));
                break;
            default:
                gRKSyllableIntroductionActivity.p(aVar, nVar, t.M(1));
                break;
        }
        return b0Var;
    }
}
