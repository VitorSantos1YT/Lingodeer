package bt;

import com.lingodeer.data.model.CourseWord;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class p6 implements fz.e {
    public final /* synthetic */ fz.c H;
    public final /* synthetic */ fz.a K;
    public final /* synthetic */ fz.a L;
    public final /* synthetic */ fz.c M;
    public final /* synthetic */ int N;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5844a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ht.q f5845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CourseWord f5846c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List f5847d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ht.o f5848e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fz.a f5849f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ fz.e f5850t;

    public /* synthetic */ p6(ht.q qVar, CourseWord courseWord, List list, ht.o oVar, fz.a aVar, fz.e eVar, fz.c cVar, fz.a aVar2, fz.a aVar3, fz.c cVar2, int i11) {
        this.f5845b = qVar;
        this.f5846c = courseWord;
        this.f5847d = list;
        this.f5848e = oVar;
        this.f5849f = aVar;
        this.f5850t = eVar;
        this.H = cVar;
        this.K = aVar2;
        this.L = aVar3;
        this.M = cVar2;
        this.N = i11;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f5844a) {
            case 0:
                ((Integer) obj2).intValue();
                b.R(l1.t.M(this.N | 1), this.f5846c, this.f5849f, this.K, this.L, this.H, this.M, this.f5850t, this.f5848e, this.f5845b, this.f5847d, (l1.n) obj);
                break;
            default:
                ((Integer) obj2).intValue();
                b.U(l1.t.M(this.N | 1), this.f5846c, this.f5849f, this.K, this.L, this.H, this.M, this.f5850t, this.f5848e, this.f5845b, this.f5847d, (l1.n) obj);
                break;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ p6(ht.q qVar, CourseWord courseWord, List list, ht.o oVar, fz.a aVar, fz.e eVar, fz.c cVar, fz.c cVar2, fz.a aVar2, fz.a aVar3, int i11) {
        this.f5845b = qVar;
        this.f5846c = courseWord;
        this.f5847d = list;
        this.f5848e = oVar;
        this.f5849f = aVar;
        this.f5850t = eVar;
        this.H = cVar;
        this.M = cVar2;
        this.K = aVar2;
        this.L = aVar3;
        this.N = i11;
    }
}
