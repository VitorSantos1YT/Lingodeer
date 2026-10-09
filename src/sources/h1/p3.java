package h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class p3 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f30833b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l0.w f30834c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p3(l0.w wVar, vy.d dVar, int i11) {
        super(2, dVar);
        this.f30832a = i11;
        this.f30834c = wVar;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f30832a) {
            case 0:
                return new p3(this.f30834c, dVar, 0);
            default:
                return new p3(this.f30834c, dVar, 1);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f30832a) {
            case 0:
                break;
        }
        return ((p3) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f30832a) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i11 = this.f30833b;
                if (i11 == 0) {
                    com.bumptech.glide.e.F(obj);
                    l0.w wVar = this.f30834c;
                    int iL = wVar.f39206e.f39181b.l() + 1;
                    this.f30833b = 1;
                    if (wVar.j(iL, 0, this) == aVar) {
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
                int i12 = this.f30833b;
                if (i12 == 0) {
                    com.bumptech.glide.e.F(obj);
                    l0.w wVar2 = this.f30834c;
                    int iL2 = wVar2.f39206e.f39181b.l() - 1;
                    this.f30833b = 1;
                    if (wVar2.j(iL2, 0, this) == aVar2) {
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
