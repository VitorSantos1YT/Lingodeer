package bt;

import com.lingodeer.data.model.CourseWord;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class a5 extends xy.i implements fz.e {
    public final /* synthetic */ fz.e H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ jt.s0 f5155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CourseWord f5156c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f5157d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f5158e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ht.o f5159f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ boolean f5160t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a5(jt.s0 s0Var, CourseWord courseWord, boolean z11, l1.b1 b1Var, ht.o oVar, boolean z12, fz.e eVar, vy.d dVar) {
        super(2, dVar);
        this.f5155b = s0Var;
        this.f5156c = courseWord;
        this.f5157d = z11;
        this.f5158e = b1Var;
        this.f5159f = oVar;
        this.f5160t = z12;
        this.H = eVar;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        return new a5(this.f5155b, this.f5156c, this.f5157d, this.f5158e, this.f5159f, this.f5160t, this.H, dVar);
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        return ((a5) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i11 = this.f5154a;
        CourseWord courseWord = this.f5156c;
        if (i11 == 0) {
            com.bumptech.glide.e.F(obj);
            this.f5154a = 1;
            if (this.f5155b.a(courseWord, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(obj);
        }
        if (!this.f5157d) {
            l1.b1 b1Var = this.f5158e;
            if (!(b1Var.getValue() instanceof ht.c) && !(b1Var.getValue() instanceof ht.i) && !(b1Var.getValue() instanceof ht.j)) {
                ht.o oVar = this.f5159f;
                if ((oVar.f33755c != 4 || !oVar.f33757e) && this.f5160t) {
                    this.H.invoke(ns.o.K(courseWord.getAudioUri().toString()), new ht.e(courseWord.getVisemedMap()));
                }
            }
        }
        return qy.b0.f48488a;
    }
}
