package jl;

import com.lingo.lingoskill.hindiskill.ui.learn.HINDISyllableIntroductionActivity;
import l1.n;
import l1.t;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HINDISyllableIntroductionActivity f36436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f36437c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f36438d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fz.a f36439e;

    public /* synthetic */ j(HINDISyllableIntroductionActivity hINDISyllableIntroductionActivity, String str, String str2, fz.a aVar, int i11, int i12) {
        this.f36435a = i12;
        this.f36436b = hINDISyllableIntroductionActivity;
        this.f36437c = str;
        this.f36438d = str2;
        this.f36439e = aVar;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f36435a;
        b0 b0Var = b0.f48488a;
        switch (i11) {
            case 0:
                n nVar = (n) obj;
                ((Integer) obj2).getClass();
                int i12 = HINDISyllableIntroductionActivity.K;
                this.f36436b.r(this.f36437c, this.f36438d, this.f36439e, nVar, t.M(1));
                break;
            default:
                n nVar2 = (n) obj;
                ((Integer) obj2).getClass();
                int i13 = HINDISyllableIntroductionActivity.K;
                this.f36436b.s(this.f36437c, this.f36438d, this.f36439e, nVar2, t.M(7));
                break;
        }
        return b0Var;
    }
}
