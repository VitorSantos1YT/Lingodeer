package h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class p1 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f30828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f30829c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r1 f30830d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p1(r1 r1Var, vy.d dVar, int i11) {
        super(2, dVar);
        this.f30827a = i11;
        this.f30830d = r1Var;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f30827a) {
            case 0:
                p1 p1Var = new p1(this.f30830d, dVar, 0);
                p1Var.f30829c = obj;
                return p1Var;
            default:
                p1 p1Var2 = new p1(this.f30830d, dVar, 1);
                p1Var2.f30829c = obj;
                return p1Var2;
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        s2.w wVar = (s2.w) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f30827a) {
            case 0:
                break;
        }
        return ((p1) create(wVar, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f30827a) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i11 = this.f30828b;
                if (i11 == 0) {
                    com.bumptech.glide.e.F(obj);
                    s2.w wVar = (s2.w) this.f30829c;
                    r1 r1Var = this.f30830d;
                    a0.c0 c0Var = new a0.c0(r1Var, 6);
                    a0.h hVar = new a0.h(r1Var, 3);
                    this.f30828b = 1;
                    if (f0.g0.f(wVar, null, c0Var, hVar, this, 5) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return qy.b0.f48488a;
            default:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i12 = this.f30828b;
                if (i12 == 0) {
                    com.bumptech.glide.e.F(obj);
                    s2.w wVar2 = (s2.w) this.f30829c;
                    r1 r1Var2 = this.f30830d;
                    q1 q1Var = new q1(r1Var2, (vy.d) null, 0);
                    a0.o0 o0Var = new a0.o0(r1Var2, 13);
                    this.f30828b = 1;
                    if (f0.s2.d(wVar2, null, q1Var, o0Var, this, 3) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return qy.b0.f48488a;
        }
    }
}
