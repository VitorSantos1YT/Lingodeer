package jt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class o0 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s0 f37086b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o0(s0 s0Var, vy.d dVar, int i11) {
        super(2, dVar);
        this.f37085a = i11;
        this.f37086b = s0Var;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f37085a) {
            case 0:
                return new o0(this.f37086b, dVar, 0);
            case 1:
                return new o0(this.f37086b, dVar, 1);
            default:
                return new o0(this.f37086b, dVar, 2);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f37085a) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((o0) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        int i11 = this.f37085a;
        s0 s0Var = this.f37086b;
        switch (i11) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                x1.p pVar = s0Var.f37172p;
                pVar.getClass();
                return x1.q.e(pVar).f55734c;
            case 1:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                return Boolean.valueOf(!s0Var.f37172p.isEmpty());
            default:
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                x1.p pVar2 = s0Var.f37172p;
                pVar2.getClass();
                return x1.q.e(pVar2).f55734c;
        }
    }
}
