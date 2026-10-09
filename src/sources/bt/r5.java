package bt;

import com.lingodeer.data.model.CourseSentence;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class r5 extends xy.i implements fz.e {
    public final /* synthetic */ l1.b1 H;
    public final /* synthetic */ jt.x0 K;
    public final /* synthetic */ ys.d0 L;
    public final /* synthetic */ rz.b0 M;
    public final /* synthetic */ l1.a1 N;
    public final /* synthetic */ l1.b1 O;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public l1.b1 f5937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5938b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f5939c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f5940d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ CourseSentence f5941e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ht.o f5942f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f5943t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r5(boolean z11, l1.b1 b1Var, CourseSentence courseSentence, ht.o oVar, l1.b1 b1Var2, l1.b1 b1Var3, jt.x0 x0Var, ys.d0 d0Var, rz.b0 b0Var, l1.a1 a1Var, l1.b1 b1Var4, vy.d dVar) {
        super(2, dVar);
        this.f5939c = z11;
        this.f5940d = b1Var;
        this.f5941e = courseSentence;
        this.f5942f = oVar;
        this.f5943t = b1Var2;
        this.H = b1Var3;
        this.K = x0Var;
        this.L = d0Var;
        this.M = b0Var;
        this.N = a1Var;
        this.O = b1Var4;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        return new r5(this.f5939c, this.f5940d, this.f5941e, this.f5942f, this.f5943t, this.H, this.K, this.L, this.M, this.N, this.O, dVar);
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        return ((r5) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        l1.b1 b1Var;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i11 = this.f5938b;
        CourseSentence courseSentence = this.f5941e;
        l1.b1 b1Var2 = this.f5943t;
        if (i11 == 0) {
            com.bumptech.glide.e.F(obj);
            yz.f fVar = rz.o0.f50940a;
            yz.e eVar = yz.e.f58387a;
            av.f0 f0Var = new av.f0(13, courseSentence, this.f5942f, null);
            this.f5937a = b1Var2;
            this.f5938b = 1;
            obj = rz.e0.M(eVar, f0Var, this);
            if (obj == aVar) {
                return aVar;
            }
            b1Var = b1Var2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b1Var = this.f5937a;
            com.bumptech.glide.e.F(obj);
        }
        Boolean bool = (Boolean) obj;
        bool.getClass();
        int i12 = s5.f5993u;
        b1Var.setValue(bool);
        if (this.f5939c && !((Boolean) b1Var2.getValue()).booleanValue() && kotlin.jvm.internal.m.a(this.f5940d.getValue(), ht.a.f33722e)) {
            s5.g(this.H, this.K, this.L, this.f5943t, this.M, courseSentence, this.N, jh.h.q(courseSentence), new ht.c(courseSentence.getVisemedMap()));
            this.O.setValue(Boolean.TRUE);
        }
        return qy.b0.f48488a;
    }
}
