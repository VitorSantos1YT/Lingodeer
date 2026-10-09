package f0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class o2 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f26389b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fz.f f26390c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l1 f26391d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s2.t f26392e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o2(fz.f fVar, l1 l1Var, s2.t tVar, vy.d dVar, int i11) {
        super(2, dVar);
        this.f26388a = i11;
        this.f26390c = fVar;
        this.f26391d = l1Var;
        this.f26392e = tVar;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f26388a) {
            case 0:
                return new o2(this.f26390c, this.f26391d, this.f26392e, dVar, 0);
            default:
                return new o2(this.f26390c, this.f26391d, this.f26392e, dVar, 1);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f26388a) {
            case 0:
                break;
        }
        return ((o2) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f26388a) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i11 = this.f26389b;
                if (i11 == 0) {
                    com.bumptech.glide.e.F(obj);
                    f2.b bVar = new f2.b(this.f26392e.f51345c);
                    this.f26389b = 1;
                    if (this.f26390c.invoke(this.f26391d, bVar, this) == aVar) {
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
                int i12 = this.f26389b;
                if (i12 == 0) {
                    com.bumptech.glide.e.F(obj);
                    f2.b bVar2 = new f2.b(this.f26392e.f51345c);
                    this.f26389b = 1;
                    if (this.f26390c.invoke(this.f26391d, bVar2, this) == aVar2) {
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
