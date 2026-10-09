package jl;

import com.lingo.lingoskill.hindiskill.ui.learn.HINDISyllableIntroductionActivity;
import j0.v1;
import java.util.List;
import l1.n;
import l1.t;
import qy.b0;
import tg.u;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class k implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36440a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f36441b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f36442c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f36443d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f36444e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qy.e f36445f;

    public /* synthetic */ k(int i11, float f5, v1 v1Var, t1.d dVar, t1.d dVar2, int i12) {
        this.f36441b = i11;
        this.f36442c = f5;
        this.f36443d = v1Var;
        this.f36444e = dVar;
        this.f36445f = dVar2;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f36440a;
        b0 b0Var = b0.f48488a;
        qy.e eVar = this.f36445f;
        Object obj3 = this.f36444e;
        Object obj4 = this.f36443d;
        switch (i11) {
            case 0:
                ((Integer) obj2).getClass();
                int i12 = HINDISyllableIntroductionActivity.K;
                int iM = t.M(433);
                ((HINDISyllableIntroductionActivity) obj4).u((List) obj3, this.f36441b, this.f36442c, (fz.c) eVar, (n) obj, iM);
                break;
            default:
                ((Integer) obj2).getClass();
                int iM2 = t.M(27649);
                u.b(this.f36441b, this.f36442c, (v1) obj4, (t1.d) obj3, (t1.d) eVar, (n) obj, iM2);
                break;
        }
        return b0Var;
    }

    public /* synthetic */ k(HINDISyllableIntroductionActivity hINDISyllableIntroductionActivity, List list, int i11, float f5, fz.c cVar, int i12) {
        this.f36443d = hINDISyllableIntroductionActivity;
        this.f36444e = list;
        this.f36441b = i11;
        this.f36442c = f5;
        this.f36445f = cVar;
    }
}
