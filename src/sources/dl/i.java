package dl;

import com.lingo.lingoskill.grkskill.ui.learn.GRKSyllableIntroductionActivity;
import l1.t;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GRKSyllableIntroductionActivity f23464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f23465c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f23466d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fz.a f23467e;

    public /* synthetic */ i(GRKSyllableIntroductionActivity gRKSyllableIntroductionActivity, String str, String str2, fz.a aVar, int i11, int i12) {
        this.f23463a = i12;
        this.f23464b = gRKSyllableIntroductionActivity;
        this.f23465c = str;
        this.f23466d = str2;
        this.f23467e = aVar;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f23463a;
        b0 b0Var = b0.f48488a;
        switch (i11) {
            case 0:
                l1.n nVar = (l1.n) obj;
                ((Integer) obj2).getClass();
                int i12 = GRKSyllableIntroductionActivity.H;
                this.f23464b.r(this.f23465c, this.f23466d, this.f23467e, nVar, t.M(1));
                break;
            default:
                l1.n nVar2 = (l1.n) obj;
                ((Integer) obj2).getClass();
                int i13 = GRKSyllableIntroductionActivity.H;
                this.f23464b.s(this.f23465c, this.f23466d, this.f23467e, nVar2, t.M(7));
                break;
        }
        return b0Var;
    }
}
