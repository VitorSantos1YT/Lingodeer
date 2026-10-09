package d0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f22645b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h0.k f22646c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h0.i f22647d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(h0.i iVar, h0.k kVar, vy.d dVar) {
        super(2, dVar);
        this.f22644a = 2;
        this.f22647d = iVar;
        this.f22646c = kVar;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f22644a) {
            case 0:
                return new c(this.f22646c, this.f22647d, dVar, 0);
            case 1:
                return new c(this.f22646c, this.f22647d, dVar, 1);
            default:
                return new c(this.f22647d, this.f22646c, dVar);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f22644a) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((c) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f22644a) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i11 = this.f22645b;
                if (i11 == 0) {
                    com.bumptech.glide.e.F(obj);
                    h0.j jVar = new h0.j(this.f22646c);
                    this.f22645b = 1;
                    if (this.f22647d.a(jVar, this) == aVar) {
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
                int i12 = this.f22645b;
                if (i12 == 0) {
                    com.bumptech.glide.e.F(obj);
                    h0.l lVar = new h0.l(this.f22646c);
                    this.f22645b = 1;
                    if (this.f22647d.a(lVar, this) == aVar2) {
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
                int i13 = this.f22645b;
                if (i13 == 0) {
                    com.bumptech.glide.e.F(obj);
                    this.f22645b = 1;
                    if (this.f22647d.a(this.f22646c, this) == aVar3) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(h0.k kVar, h0.i iVar, vy.d dVar, int i11) {
        super(2, dVar);
        this.f22644a = i11;
        this.f22646c = kVar;
        this.f22647d = iVar;
    }
}
