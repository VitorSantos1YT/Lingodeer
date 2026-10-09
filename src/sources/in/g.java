package in;

import com.lingo.lingoskill.malskill.ui.learn.MALSyllableIntroductionActivity;
import j0.v1;
import java.util.List;
import kt.l;
import l1.n;
import l1.t;
import mt.b1;
import qy.b0;
import rt.oe;
import z1.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class g implements fz.e {
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34477a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f34478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f34479c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f34480d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fz.c f34481e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f34482f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f34483t;

    public /* synthetic */ g(MALSyllableIntroductionActivity mALSyllableIntroductionActivity, String str, String str2, r rVar, boolean z11, boolean z12, fz.c cVar, int i11, int i12) {
        this.H = mALSyllableIntroductionActivity;
        this.f34479c = str;
        this.K = str2;
        this.L = rVar;
        this.f34478b = z11;
        this.f34480d = z12;
        this.f34481e = cVar;
        this.f34482f = i11;
        this.f34483t = i12;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f34477a;
        b0 b0Var = b0.f48488a;
        int i12 = this.f34482f;
        Object obj3 = this.K;
        Object obj4 = this.L;
        Object obj5 = this.f34479c;
        Object obj6 = this.H;
        switch (i11) {
            case 0:
                ((Integer) obj2).getClass();
                int i13 = MALSyllableIntroductionActivity.Q;
                int iM = t.M(i12 | 1);
                ((MALSyllableIntroductionActivity) obj6).u((String) obj5, (String) obj3, (r) obj4, this.f34478b, this.f34480d, this.f34481e, (n) obj, iM, this.f34483t);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iM2 = t.M(i12 | 1);
                iv.a.k((List) obj6, this.f34478b, (String) obj5, this.f34480d, (fz.a) obj3, (fz.a) obj4, this.f34481e, (n) obj, iM2, this.f34483t);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iM3 = t.M(i12 | 1);
                l.g((String) obj5, this.f34481e, (r) obj4, this.f34478b, this.f34480d, (fz.a) obj6, (fz.a) obj3, (n) obj, iM3, this.f34483t);
                break;
            default:
                ((Integer) obj2).getClass();
                int iM4 = t.M(i12 | 1);
                b1.e((oe) obj6, this.f34478b, this.f34480d, this.f34481e, (fz.a) obj5, (r) obj4, (v1) obj3, (n) obj, iM4, this.f34483t);
                break;
        }
        return b0Var;
    }

    public /* synthetic */ g(String str, fz.c cVar, r rVar, boolean z11, boolean z12, fz.a aVar, fz.a aVar2, int i11, int i12) {
        this.f34479c = str;
        this.f34481e = cVar;
        this.L = rVar;
        this.f34478b = z11;
        this.f34480d = z12;
        this.H = aVar;
        this.K = aVar2;
        this.f34482f = i11;
        this.f34483t = i12;
    }

    public /* synthetic */ g(List list, boolean z11, String str, boolean z12, fz.a aVar, fz.a aVar2, fz.c cVar, int i11, int i12) {
        this.H = list;
        this.f34478b = z11;
        this.f34479c = str;
        this.f34480d = z12;
        this.K = aVar;
        this.L = aVar2;
        this.f34481e = cVar;
        this.f34482f = i11;
        this.f34483t = i12;
    }

    public /* synthetic */ g(oe oeVar, boolean z11, boolean z12, fz.c cVar, fz.a aVar, r rVar, v1 v1Var, int i11, int i12) {
        this.H = oeVar;
        this.f34478b = z11;
        this.f34480d = z12;
        this.f34481e = cVar;
        this.f34479c = aVar;
        this.L = rVar;
        this.K = v1Var;
        this.f34482f = i11;
        this.f34483t = i12;
    }
}
