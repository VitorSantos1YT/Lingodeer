package xp;

import com.lingo.lingoskill.ukrskill.ui.learn.UKRSyllableIntroductionActivity;
import l1.n;
import l1.t;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f56159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ UKRSyllableIntroductionActivity f56160b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f56161c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f56162d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fz.a f56163e;

    public /* synthetic */ i(UKRSyllableIntroductionActivity uKRSyllableIntroductionActivity, String str, String str2, fz.a aVar, int i11, int i12) {
        this.f56159a = i12;
        this.f56160b = uKRSyllableIntroductionActivity;
        this.f56161c = str;
        this.f56162d = str2;
        this.f56163e = aVar;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f56159a;
        b0 b0Var = b0.f48488a;
        switch (i11) {
            case 0:
                n nVar = (n) obj;
                ((Integer) obj2).getClass();
                int i12 = UKRSyllableIntroductionActivity.H;
                this.f56160b.r(this.f56161c, this.f56162d, this.f56163e, nVar, t.M(1));
                break;
            default:
                n nVar2 = (n) obj;
                ((Integer) obj2).getClass();
                int i13 = UKRSyllableIntroductionActivity.H;
                this.f56160b.s(this.f56161c, this.f56162d, this.f56163e, nVar2, t.M(7));
                break;
        }
        return b0Var;
    }
}
