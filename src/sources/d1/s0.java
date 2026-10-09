package d1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class s0 extends xy.i implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f22989b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s0(Object obj, vy.d dVar, int i11) {
        super(1, dVar);
        this.f22988a = i11;
        this.f22989b = obj;
    }

    @Override // xy.a
    public final vy.d create(vy.d dVar) {
        switch (this.f22988a) {
            case 0:
                return new s0((z0) this.f22989b, dVar, 0);
            case 1:
                return new s0((z0) this.f22989b, dVar, 1);
            case 2:
                return new s0((z0) this.f22989b, dVar, 2);
            case 3:
                return new s0((z0) this.f22989b, dVar, 3);
            default:
                return new s0((fz.a) this.f22989b, dVar, 4);
        }
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        vy.d dVar = (vy.d) obj;
        switch (this.f22988a) {
            case 0:
                s0 s0Var = (s0) create(dVar);
                qy.b0 b0Var = qy.b0.f48488a;
                s0Var.invokeSuspend(b0Var);
                return b0Var;
            case 1:
                s0 s0Var2 = (s0) create(dVar);
                qy.b0 b0Var2 = qy.b0.f48488a;
                s0Var2.invokeSuspend(b0Var2);
                return b0Var2;
            case 2:
                s0 s0Var3 = (s0) create(dVar);
                qy.b0 b0Var3 = qy.b0.f48488a;
                s0Var3.invokeSuspend(b0Var3);
                return b0Var3;
            case 3:
                s0 s0Var4 = (s0) create(dVar);
                qy.b0 b0Var4 = qy.b0.f48488a;
                s0Var4.invokeSuspend(b0Var4);
                return b0Var4;
            default:
                return ((s0) create(dVar)).invokeSuspend(qy.b0.f48488a);
        }
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        int i11 = this.f22988a;
        qy.b0 b0Var = qy.b0.f48488a;
        Object obj2 = this.f22989b;
        switch (i11) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                ((z0) obj2).B = false;
                return b0Var;
            case 1:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                ((z0) obj2).f();
                return b0Var;
            case 2:
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                z0 z0Var = (z0) obj2;
                z0Var.d(z0Var.B);
                return b0Var;
            case 3:
                wy.a aVar4 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                ((z0) obj2).o();
                return b0Var;
            default:
                wy.a aVar5 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                return ((fz.a) obj2).invoke();
        }
    }
}
