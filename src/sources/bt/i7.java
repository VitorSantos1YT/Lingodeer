package bt;

import com.lingodeer.data.model.CourseWord;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class i7 implements fz.e {
    public final /* synthetic */ fz.c H;
    public final /* synthetic */ fz.a K;
    public final /* synthetic */ fz.a L;
    public final /* synthetic */ fz.a M;
    public final /* synthetic */ fz.a N;
    public final /* synthetic */ fz.c O;
    public final /* synthetic */ int P;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ht.q f5543b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CourseWord f5544c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List f5545d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ht.o f5546e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fz.a f5547f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ fz.e f5548t;

    public /* synthetic */ i7(ht.q qVar, CourseWord courseWord, List list, ht.o oVar, fz.a aVar, fz.e eVar, fz.c cVar, fz.a aVar2, fz.a aVar3, fz.a aVar4, fz.a aVar5, fz.c cVar2, int i11, int i12) {
        this.f5542a = i12;
        this.f5543b = qVar;
        this.f5544c = courseWord;
        this.f5545d = list;
        this.f5546e = oVar;
        this.f5547f = aVar;
        this.f5548t = eVar;
        this.H = cVar;
        this.K = aVar2;
        this.L = aVar3;
        this.M = aVar4;
        this.N = aVar5;
        this.O = cVar2;
        this.P = i11;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        l1.n nVar = (l1.n) obj;
        switch (this.f5542a) {
            case 0:
                ((Integer) obj2).getClass();
                b.Z(this.f5543b, this.f5544c, this.f5545d, this.f5546e, this.f5547f, this.f5548t, this.H, this.K, this.L, this.M, this.N, this.O, nVar, l1.t.M(this.P | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                e8.d(this.f5543b, this.f5544c, this.f5545d, this.f5546e, this.f5547f, this.f5548t, this.H, this.K, this.L, this.M, this.N, this.O, nVar, l1.t.M(this.P | 1));
                break;
        }
        return qy.b0.f48488a;
    }
}
