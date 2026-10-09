package bt;

import com.lingodeer.data.model.CourseSentence;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class i1 extends xy.i implements fz.e {
    public final /* synthetic */ l1.b1 H;
    public final /* synthetic */ l1.b1 K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f5508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CourseSentence f5509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ys.d0 f5510c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f5511d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f5512e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rz.b0 f5513f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ l1.a1 f5514t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(boolean z11, CourseSentence courseSentence, ys.d0 d0Var, l1.b1 b1Var, l1.b1 b1Var2, rz.b0 b0Var, l1.a1 a1Var, l1.b1 b1Var3, l1.b1 b1Var4, vy.d dVar) {
        super(2, dVar);
        this.f5508a = z11;
        this.f5509b = courseSentence;
        this.f5510c = d0Var;
        this.f5511d = b1Var;
        this.f5512e = b1Var2;
        this.f5513f = b0Var;
        this.f5514t = a1Var;
        this.H = b1Var3;
        this.K = b1Var4;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        return new i1(this.f5508a, this.f5509b, this.f5510c, this.f5511d, this.f5512e, this.f5513f, this.f5514t, this.H, this.K, dVar);
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        i1 i1Var = (i1) create((rz.b0) obj, (vy.d) obj2);
        qy.b0 b0Var = qy.b0.f48488a;
        i1Var.invokeSuspend(b0Var);
        return b0Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        com.bumptech.glide.e.F(obj);
        if (this.f5508a) {
            CourseSentence courseSentence = this.f5509b;
            b.k(this.f5510c, this.f5511d, this.f5512e, this.f5513f, courseSentence, this.f5514t, this.H, jh.h.q(courseSentence), new ht.c(courseSentence.getVisemedMap()));
            this.K.setValue(Boolean.TRUE);
        }
        return qy.b0.f48488a;
    }
}
