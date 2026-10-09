package h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class l0 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f30568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h0.i f30569c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x1.p f30570d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l0(h0.i iVar, x1.p pVar, vy.d dVar, int i11) {
        super(2, dVar);
        this.f30567a = i11;
        this.f30569c = iVar;
        this.f30570d = pVar;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f30567a) {
            case 0:
                return new l0(this.f30569c, this.f30570d, dVar, 0);
            case 1:
                return new l0(this.f30569c, this.f30570d, dVar, 1);
            default:
                return new l0(this.f30569c, this.f30570d, dVar, 2);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f30567a) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((l0) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f30567a) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i11 = this.f30568b;
                if (i11 == 0) {
                    com.bumptech.glide.e.F(obj);
                    uz.w0 w0Var = this.f30569c.f29906a;
                    k0 k0Var = new k0(this.f30570d, 0);
                    this.f30568b = 1;
                    w0Var.getClass();
                    if (uz.w0.l(w0Var, k0Var, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return qy.b0.f48488a;
            case 1:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i12 = this.f30568b;
                if (i12 == 0) {
                    com.bumptech.glide.e.F(obj);
                    uz.w0 w0Var2 = this.f30569c.f29906a;
                    k0 k0Var2 = new k0(this.f30570d, 1);
                    this.f30568b = 1;
                    w0Var2.getClass();
                    if (uz.w0.l(w0Var2, k0Var2, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return qy.b0.f48488a;
            default:
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                int i13 = this.f30568b;
                if (i13 == 0) {
                    com.bumptech.glide.e.F(obj);
                    uz.w0 w0Var3 = this.f30569c.f29906a;
                    k0 k0Var3 = new k0(this.f30570d, 2);
                    this.f30568b = 1;
                    w0Var3.getClass();
                    if (uz.w0.l(w0Var3, k0Var3, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return qy.b0.f48488a;
        }
    }
}
