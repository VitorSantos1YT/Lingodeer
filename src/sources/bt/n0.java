package bt;

import com.lingodeer.data.model.CourseSentence;
import com.lingodeer.data.model.CourseWord;
import java.util.List;
import rt.gc;
import rt.h9;
import rt.rc;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class n0 implements fz.e {
    public final /* synthetic */ fz.c H;
    public final /* synthetic */ int K;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object M;
    public final /* synthetic */ Object N;
    public final /* synthetic */ Object O;
    public final /* synthetic */ qy.e P;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5737a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5738b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fz.a f5739c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fz.e f5740d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fz.c f5741e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fz.a f5742f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ fz.a f5743t;

    public /* synthetic */ n0(CourseSentence courseSentence, jt.u uVar, ht.o oVar, String str, t1.d dVar, t1.d dVar2, fz.a aVar, fz.e eVar, fz.c cVar, fz.a aVar2, fz.a aVar3, fz.c cVar2, int i11) {
        this.L = courseSentence;
        this.M = uVar;
        this.f5738b = oVar;
        this.N = str;
        this.O = dVar;
        this.P = dVar2;
        this.f5739c = aVar;
        this.f5740d = eVar;
        this.f5741e = cVar;
        this.f5742f = aVar2;
        this.f5743t = aVar3;
        this.H = cVar2;
        this.K = i11;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f5737a) {
            case 0:
                ((Integer) obj2).getClass();
                int iM = l1.t.M(this.K | 1);
                b.f((CourseSentence) this.L, (jt.u) this.M, (ht.o) this.f5738b, (String) this.N, (t1.d) this.O, (t1.d) this.P, this.f5739c, this.f5740d, this.f5741e, this.f5742f, this.f5743t, this.H, (l1.n) obj, iM);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iM2 = l1.t.M(this.K | 1);
                b.O((ht.q) this.L, (ht.l) this.M, (CourseWord) this.N, (List) this.O, (ht.o) this.f5738b, this.f5739c, this.f5740d, this.f5741e, this.f5742f, this.f5743t, (fz.a) this.P, this.H, (l1.n) obj, iM2);
                break;
            default:
                ((Integer) obj2).getClass();
                int iM3 = l1.t.M(1);
                iv.a.E((rc) this.L, (h9) this.M, (gc) this.f5738b, this.K, this.f5739c, this.f5742f, this.f5741e, this.f5740d, (fz.e) this.N, this.H, this.f5743t, (fz.c) this.O, (fz.a) this.P, (l1.n) obj, iM3);
                break;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ n0(ht.q qVar, ht.l lVar, CourseWord courseWord, List list, ht.o oVar, fz.a aVar, fz.e eVar, fz.c cVar, fz.a aVar2, fz.a aVar3, fz.a aVar4, fz.c cVar2, int i11) {
        this.L = qVar;
        this.M = lVar;
        this.N = courseWord;
        this.O = list;
        this.f5738b = oVar;
        this.f5739c = aVar;
        this.f5740d = eVar;
        this.f5741e = cVar;
        this.f5742f = aVar2;
        this.f5743t = aVar3;
        this.P = aVar4;
        this.H = cVar2;
        this.K = i11;
    }

    public /* synthetic */ n0(rc rcVar, h9 h9Var, gc gcVar, int i11, fz.a aVar, fz.a aVar2, fz.c cVar, fz.e eVar, fz.e eVar2, fz.c cVar2, fz.a aVar3, fz.c cVar3, fz.a aVar4, int i12) {
        this.L = rcVar;
        this.M = h9Var;
        this.f5738b = gcVar;
        this.K = i11;
        this.f5739c = aVar;
        this.f5742f = aVar2;
        this.f5741e = cVar;
        this.f5740d = eVar;
        this.N = eVar2;
        this.H = cVar2;
        this.f5743t = aVar3;
        this.O = cVar3;
        this.P = aVar4;
    }
}
