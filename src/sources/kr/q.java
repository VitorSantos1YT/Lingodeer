package kr;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class q extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f38560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b0 f38561c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(b0 b0Var, vy.d dVar, int i11) {
        super(2, dVar);
        this.f38559a = i11;
        this.f38561c = b0Var;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f38559a) {
            case 0:
                return new q(this.f38561c, dVar, 0);
            default:
                return new q(this.f38561c, dVar, 1);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f38559a) {
            case 0:
                break;
        }
        return ((q) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        switch (this.f38559a) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i11 = this.f38560b;
                if (i11 == 0) {
                    com.bumptech.glide.e.F(obj);
                    b0 b0Var = this.f38561c;
                    uz.i1 i1Var = b0Var.K;
                    jr.i0 i0Var = new jr.i0(b0Var, (vy.d) null, 2);
                    this.f38560b = 1;
                    if (uz.x0.i(i1Var, i0Var, this) == aVar) {
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
                int i12 = this.f38560b;
                b0 b0Var2 = this.f38561c;
                if (i12 == 0) {
                    com.bumptech.glide.e.F(obj);
                    no.s sVar = b0Var2.f38429f;
                    String strW = ((fr.o0) b0Var2.f38424a).w();
                    sVar.getClass();
                    gp.r rVar = new gp.r(new w(sVar, strW, (vy.d) null));
                    this.f38560b = 1;
                    if (uz.x0.u(rVar, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                uz.i1 i1Var2 = b0Var2.H;
                do {
                    value = i1Var2.getValue();
                    ((Boolean) value).getClass();
                } while (!i1Var2.j(value, Boolean.TRUE));
                return qy.b0.f48488a;
        }
    }
}
