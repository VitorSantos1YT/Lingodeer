package bt;

import com.lingodeer.data.model.CourseSentence;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class k5 implements fz.a {
    public final /* synthetic */ l1.a1 H;
    public final /* synthetic */ l1.b1 K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CourseSentence f5623b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f5624c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jt.x0 f5625d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ys.d0 f5626e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f5627f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ rz.b0 f5628t;

    public /* synthetic */ k5(CourseSentence courseSentence, l1.b1 b1Var, jt.x0 x0Var, ys.d0 d0Var, l1.b1 b1Var2, rz.b0 b0Var, l1.a1 a1Var, l1.b1 b1Var3, int i11) {
        this.f5622a = i11;
        this.f5623b = courseSentence;
        this.f5624c = b1Var;
        this.f5625d = x0Var;
        this.f5626e = d0Var;
        this.f5627f = b1Var2;
        this.f5628t = b0Var;
        this.H = a1Var;
        this.K = b1Var3;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f5622a) {
            case 0:
                CourseSentence courseSentence = this.f5623b;
                s5.g(this.f5624c, this.f5625d, this.f5626e, this.f5627f, this.f5628t, courseSentence, this.H, jh.h.q(courseSentence), new ht.c(courseSentence.getVisemedMap()));
                this.K.setValue(Boolean.TRUE);
                break;
            default:
                CourseSentence courseSentence2 = this.f5623b;
                s5.g(this.f5624c, this.f5625d, this.f5626e, this.f5627f, this.f5628t, courseSentence2, this.H, jh.h.q(courseSentence2), new ht.c(courseSentence2.getVisemedMap()));
                this.K.setValue(Boolean.TRUE);
                break;
        }
        return qy.b0.f48488a;
    }
}
