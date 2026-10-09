package mt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class h4 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f41522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ rt.e3 f41523c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fz.a f41524d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h4(rt.e3 e3Var, fz.a aVar, vy.d dVar, int i11) {
        super(2, dVar);
        this.f41521a = i11;
        this.f41523c = e3Var;
        this.f41524d = aVar;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f41521a) {
            case 0:
                return new h4(this.f41523c, this.f41524d, dVar, 0);
            default:
                return new h4(this.f41523c, this.f41524d, dVar, 1);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f41521a) {
            case 0:
                break;
        }
        return ((h4) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f41521a) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i11 = this.f41522b;
                if (i11 == 0) {
                    com.bumptech.glide.e.F(obj);
                    this.f41522b = 1;
                    if (this.f41523c.J(this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                this.f41524d.invoke();
                return qy.b0.f48488a;
            default:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i12 = this.f41522b;
                if (i12 == 0) {
                    com.bumptech.glide.e.F(obj);
                    this.f41522b = 1;
                    if (this.f41523c.J(this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                this.f41524d.invoke();
                return qy.b0.f48488a;
        }
    }
}
