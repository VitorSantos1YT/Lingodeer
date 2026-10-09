package dt;

import com.lingo.lingoskill.hindiskill.ui.learn.HINDISyllableIntroductionActivity;
import com.yalantis.ucrop.view.CropImageView;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class s implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24169a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f24170b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f24171c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f24172d;

    public /* synthetic */ s(HINDISyllableIntroductionActivity hINDISyllableIntroductionActivity, List list, float f5, int i11) {
        this.f24171c = hINDISyllableIntroductionActivity;
        this.f24172d = list;
        this.f24170b = f5;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f24169a;
        qy.b0 b0Var = qy.b0.f48488a;
        Object obj3 = this.f24172d;
        float f5 = this.f24170b;
        Object obj4 = this.f24171c;
        switch (i11) {
            case 0:
                ((Integer) obj2).getClass();
                a0.k((z1.r) obj4, f5, (fz.a) obj3, (l1.n) obj, l1.t.M(7));
                break;
            case 1:
                ((Integer) obj2).getClass();
                int i12 = HINDISyllableIntroductionActivity.K;
                ((HINDISyllableIntroductionActivity) obj4).t((List) obj3, f5, (l1.n) obj, l1.t.M(49));
                break;
            default:
                xq.o oVar = (xq.o) obj4;
                xq.k kVar = (xq.k) obj3;
                l1.n nVar = (l1.n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i13 = 0;
                l1.s sVar = (l1.s) nVar;
                if (!sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    sVar.W();
                } else {
                    c6.a aVar = new c6.a(oVar.f56207b);
                    c6.j jVar = c6.j.f6631a;
                    vc.a.a(aVar, "streak background", vc.a.i(jVar).d(new e6.y(new p6.c(f5))), 0, sVar, 48, 16);
                    c6.l lVarD = vc.a.i(jVar).d(new e6.y(new p6.c(f5)));
                    float f11 = 8;
                    ub.a.I(lVarD.d(new k6.o(new k6.n(3, CropImageView.DEFAULT_ASPECT_RATIO), new k6.n(2, f11), new k6.n(2, f11), new k6.n(3, CropImageView.DEFAULT_ASPECT_RATIO), new k6.n(2, f11), new k6.n(2, f11))), 1, t1.e.d(195065616, new xq.f(oVar, kVar, i13), sVar), sVar, 3072);
                }
                break;
        }
        return b0Var;
    }

    public /* synthetic */ s(xq.o oVar, float f5, xq.k kVar) {
        this.f24171c = oVar;
        this.f24170b = f5;
        this.f24172d = kVar;
    }

    public /* synthetic */ s(z1.r rVar, float f5, fz.a aVar, int i11) {
        this.f24171c = rVar;
        this.f24170b = f5;
        this.f24172d = aVar;
    }
}
