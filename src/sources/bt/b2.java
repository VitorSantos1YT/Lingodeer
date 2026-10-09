package bt;

import com.lingodeer.data.model.CourseSentence;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b2 implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CourseSentence f5210b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ht.o f5211c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l1.i1 f5212d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fz.e f5213e;

    public /* synthetic */ b2(CourseSentence courseSentence, ht.o oVar, l1.i1 i1Var, fz.e eVar, int i11) {
        this.f5209a = i11;
        this.f5210b = courseSentence;
        this.f5211c = oVar;
        this.f5212d = i1Var;
        this.f5213e = eVar;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f5209a) {
            case 0:
                CourseSentence courseSentence = this.f5210b;
                d3.e(this.f5211c, this.f5212d, this.f5213e, jh.h.q(courseSentence), new ht.h(courseSentence.getVisemedMap()));
                break;
            case 1:
                CourseSentence courseSentence2 = this.f5210b;
                d3.e(this.f5211c, this.f5212d, this.f5213e, jh.h.u(courseSentence2), new ht.i(courseSentence2.getSlowVisemedMap()));
                break;
            default:
                CourseSentence courseSentence3 = this.f5210b;
                d3.e(this.f5211c, this.f5212d, this.f5213e, jh.h.q(courseSentence3), new ht.c(courseSentence3.getVisemedMap()));
                break;
        }
        return qy.b0.f48488a;
    }
}
