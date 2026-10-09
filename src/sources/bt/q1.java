package bt;

import com.lingo.lingoskill.object.MergedBillingThemeBillingPage;
import com.lingodeer.syllable_ko.model.KOSyllableLesson;
import com.yalantis.ucrop.view.CropImageView;
import java.util.List;
import rt.l9;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class q1 implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f5865b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5866c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f5867d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f5868e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f5869f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f5870t;

    public /* synthetic */ q1(Object obj, boolean z11, Object obj2, Object obj3, qy.e eVar, Object obj4, int i11, int i12) {
        this.f5864a = i12;
        this.f5866c = obj;
        this.f5865b = z11;
        this.f5867d = obj2;
        this.f5868e = obj3;
        this.f5869f = eVar;
        this.f5870t = obj4;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f5864a) {
            case 0:
                l1.b1 b1Var = (l1.b1) this.f5866c;
                ht.o oVar = (ht.o) this.f5867d;
                rz.b0 b0Var = (rz.b0) this.f5868e;
                jt.h0 h0Var = (jt.h0) this.f5869f;
                fz.e eVar = (fz.e) this.f5870t;
                l1.n nVar = (l1.n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                l1.s sVar = (l1.s) nVar;
                if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    float f5 = 26;
                    z1.o oVar2 = z1.o.f58481a;
                    j0.c.g(sVar, j0.e2.g(oVar2, f5));
                    List list = (List) b1Var.getValue();
                    boolean z11 = !oVar.f33757e;
                    boolean z12 = this.f5865b;
                    boolean zG = sVar.g(z12) | sVar.h(b0Var) | sVar.h(h0Var);
                    Object objQ = sVar.Q();
                    l1.g gVar = l1.m.f39353a;
                    if (zG || objQ == gVar) {
                        objQ = new n1(z12, b0Var, h0Var, 0);
                        sVar.o0(objQ);
                    }
                    fz.c cVar = (fz.c) objQ;
                    boolean zF = sVar.f(eVar);
                    Object objQ2 = sVar.Q();
                    if (zF || objQ2 == gVar) {
                        objQ2 = new b0.p1(2, eVar);
                        sVar.o0(objQ2);
                    }
                    dt.d4.a(list, null, null, z11, false, null, null, false, false, 0, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 0, 0L, false, null, false, false, false, null, cVar, (fz.c) objQ2, sVar, 0, 0, 0, 1048566);
                    j0.c.g(sVar, j0.e2.g(oVar2, f5));
                } else {
                    sVar.W();
                }
                return qy.b0.f48488a;
            case 1:
                ((Integer) obj2).getClass();
                iv.a.x(this.f5865b, (fz.a) this.f5866c, (fz.c) this.f5867d, (fz.a) this.f5868e, (fz.a) this.f5869f, (mv.g0) this.f5870t, (l1.n) obj, l1.t.M(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                mt.g.h((String) this.f5866c, (String) this.f5867d, this.f5865b, (fz.a) this.f5868e, (fz.a) this.f5869f, (fz.a) this.f5870t, (l1.n) obj, l1.t.M(1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                mt.p2.d((rt.s2) this.f5866c, this.f5865b, (fz.c) this.f5867d, (fz.c) this.f5868e, (fz.a) this.f5869f, (rt.b4) this.f5870t, (l1.n) obj, l1.t.M(1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                mt.m3.g((List) this.f5866c, this.f5865b, (fz.a) this.f5867d, (fz.c) this.f5868e, (fz.c) this.f5869f, (rt.b4) this.f5870t, (l1.n) obj, l1.t.M(1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                nv.r.v((KOSyllableLesson) this.f5866c, this.f5865b, (sv.o) this.f5867d, (l9) this.f5868e, (fz.a) this.f5869f, (fz.c) this.f5870t, (l1.n) obj, l1.t.M(1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                xu.c.d((String) this.f5866c, (fz.c) this.f5867d, (z1.r) this.f5868e, (fz.e) this.f5870t, this.f5865b, (String) this.f5869f, (l1.n) obj, l1.t.M(3121));
                break;
            default:
                ((Integer) obj2).getClass();
                yg.o.n((String) this.f5866c, (String) this.f5867d, (MergedBillingThemeBillingPage) this.f5868e, this.f5865b, (ni.m) this.f5869f, (com.android.billingclient.api.o) this.f5870t, (l1.n) obj, l1.t.M(1));
                break;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ q1(String str, fz.c cVar, z1.r rVar, fz.e eVar, boolean z11, String str2, int i11) {
        this.f5864a = 6;
        this.f5866c = str;
        this.f5867d = cVar;
        this.f5868e = rVar;
        this.f5870t = eVar;
        this.f5865b = z11;
        this.f5869f = str2;
    }

    public /* synthetic */ q1(String str, String str2, MergedBillingThemeBillingPage mergedBillingThemeBillingPage, boolean z11, ni.m mVar, com.android.billingclient.api.o oVar, int i11) {
        this.f5864a = 7;
        this.f5866c = str;
        this.f5867d = str2;
        this.f5868e = mergedBillingThemeBillingPage;
        this.f5865b = z11;
        this.f5869f = mVar;
        this.f5870t = oVar;
    }

    public /* synthetic */ q1(String str, String str2, boolean z11, fz.a aVar, fz.a aVar2, fz.a aVar3, int i11) {
        this.f5864a = 2;
        this.f5866c = str;
        this.f5867d = str2;
        this.f5865b = z11;
        this.f5868e = aVar;
        this.f5869f = aVar2;
        this.f5870t = aVar3;
    }

    public /* synthetic */ q1(l1.b1 b1Var, ht.o oVar, boolean z11, rz.b0 b0Var, jt.h0 h0Var, fz.e eVar) {
        this.f5864a = 0;
        this.f5866c = b1Var;
        this.f5867d = oVar;
        this.f5865b = z11;
        this.f5868e = b0Var;
        this.f5869f = h0Var;
        this.f5870t = eVar;
    }

    public /* synthetic */ q1(boolean z11, fz.a aVar, fz.c cVar, fz.a aVar2, fz.a aVar3, mv.g0 g0Var, int i11) {
        this.f5864a = 1;
        this.f5865b = z11;
        this.f5866c = aVar;
        this.f5867d = cVar;
        this.f5868e = aVar2;
        this.f5869f = aVar3;
        this.f5870t = g0Var;
    }
}
