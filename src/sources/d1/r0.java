package d1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class r0 extends xy.i implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f22984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z0 f22985c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r0(z0 z0Var, vy.d dVar, int i11) {
        super(1, dVar);
        this.f22983a = i11;
        this.f22985c = z0Var;
    }

    @Override // xy.a
    public final vy.d create(vy.d dVar) {
        switch (this.f22983a) {
            case 0:
                return new r0(this.f22985c, dVar, 0);
            default:
                return new r0(this.f22985c, dVar, 1);
        }
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        vy.d dVar = (vy.d) obj;
        switch (this.f22983a) {
            case 0:
                break;
        }
        return ((r0) create(dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f22983a) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i11 = this.f22984b;
                z0 z0Var = this.f22985c;
                if (i11 != 0) {
                    if (i11 == 1) {
                        com.bumptech.glide.e.F(obj);
                    } else {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.bumptech.glide.e.F(obj);
                    }
                    return qy.b0.f48488a;
                }
                com.bumptech.glide.e.F(obj);
                this.f22984b = 1;
                if (z0Var.r(this) == aVar) {
                    return aVar;
                }
                this.f22984b = 2;
                if (z0.b(z0Var, this) == aVar) {
                    return aVar;
                }
                return qy.b0.f48488a;
            default:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i12 = this.f22984b;
                z0 z0Var2 = this.f22985c;
                if (i12 != 0) {
                    if (i12 == 1) {
                        com.bumptech.glide.e.F(obj);
                    } else {
                        if (i12 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.bumptech.glide.e.F(obj);
                    }
                    z0Var2.B = true;
                    return qy.b0.f48488a;
                }
                com.bumptech.glide.e.F(obj);
                this.f22984b = 1;
                if (z0Var2.r(this) == aVar2) {
                    return aVar2;
                }
                this.f22984b = 2;
                if (z0.b(z0Var2, this) == aVar2) {
                    return aVar2;
                }
                z0Var2.B = true;
                return qy.b0.f48488a;
        }
    }
}
