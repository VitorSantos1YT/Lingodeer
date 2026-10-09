package bt;

import com.lingodeer.data.model.CourseSentence;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class r implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CourseSentence f5906b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ jt.g f5907c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ys.d0 f5908d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f5909e;

    public /* synthetic */ r(CourseSentence courseSentence, jt.g gVar, ys.d0 d0Var, l1.b1 b1Var, int i11) {
        this.f5905a = i11;
        this.f5906b = courseSentence;
        this.f5907c = gVar;
        this.f5908d = d0Var;
        this.f5909e = b1Var;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f5905a) {
            case 0:
                CourseSentence courseSentence = this.f5906b;
                i0.f(this.f5907c, this.f5908d, jh.h.q(courseSentence), new ht.c(courseSentence.getVisemedMap()));
                this.f5909e.setValue(Boolean.TRUE);
                break;
            default:
                CourseSentence courseSentence2 = this.f5906b;
                i0.f(this.f5907c, this.f5908d, jh.h.q(courseSentence2), new ht.c(courseSentence2.getVisemedMap()));
                this.f5909e.setValue(Boolean.TRUE);
                break;
        }
        return qy.b0.f48488a;
    }
}
