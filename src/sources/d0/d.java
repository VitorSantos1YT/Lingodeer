package d0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f22654b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f22655c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h0.k f22656d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(f fVar, h0.k kVar, vy.d dVar, int i11) {
        super(2, dVar);
        this.f22653a = i11;
        this.f22655c = fVar;
        this.f22656d = kVar;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f22653a) {
            case 0:
                return new d(this.f22655c, this.f22656d, dVar, 0);
            case 1:
                return new d(this.f22655c, this.f22656d, dVar, 1);
            default:
                return new d(this.f22655c, this.f22656d, dVar, 2);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f22653a) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((d) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f22653a) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i11 = this.f22654b;
                if (i11 == 0) {
                    com.bumptech.glide.e.F(obj);
                    h0.i iVar = this.f22655c.S;
                    if (iVar != null) {
                        h0.j jVar = new h0.j(this.f22656d);
                        this.f22654b = 1;
                        if (iVar.a(jVar, this) == aVar) {
                            return aVar;
                        }
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
                int i12 = this.f22654b;
                if (i12 == 0) {
                    com.bumptech.glide.e.F(obj);
                    h0.i iVar2 = this.f22655c.S;
                    if (iVar2 != null) {
                        this.f22654b = 1;
                        if (iVar2.a(this.f22656d, this) == aVar2) {
                            return aVar2;
                        }
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
                int i13 = this.f22654b;
                if (i13 == 0) {
                    com.bumptech.glide.e.F(obj);
                    h0.i iVar3 = this.f22655c.S;
                    if (iVar3 != null) {
                        h0.l lVar = new h0.l(this.f22656d);
                        this.f22654b = 1;
                        if (iVar3.a(lVar, this) == aVar3) {
                            return aVar3;
                        }
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
