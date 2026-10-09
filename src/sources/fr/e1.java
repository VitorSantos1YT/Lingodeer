package fr;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class e1 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f27476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v1 f27477c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f27478d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e1(v1 v1Var, String str, vy.d dVar, int i11) {
        super(2, dVar);
        this.f27475a = i11;
        this.f27477c = v1Var;
        this.f27478d = str;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f27475a) {
            case 0:
                return new e1(this.f27477c, this.f27478d, dVar, 0);
            default:
                return new e1(this.f27477c, this.f27478d, dVar, 1);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f27475a) {
            case 0:
                break;
        }
        return ((e1) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f27475a) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i11 = this.f27476b;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return obj;
                }
                com.bumptech.glide.e.F(obj);
                gp.r rVarC = this.f27477c.c(this.f27478d);
                this.f27476b = 1;
                Object objU = uz.x0.u(rVarC, this);
                return objU == aVar ? aVar : objU;
            default:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i12 = this.f27476b;
                if (i12 != 0) {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return obj;
                }
                com.bumptech.glide.e.F(obj);
                gp.r rVarC2 = this.f27477c.c(this.f27478d);
                this.f27476b = 1;
                Object objU2 = uz.x0.u(rVarC2, this);
                return objU2 == aVar2 ? aVar2 : objU2;
        }
    }
}
