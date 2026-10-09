package bp;

import h1.e8;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class i0 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e8 f4629c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fz.a f4630d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i0(e8 e8Var, fz.a aVar, vy.d dVar, int i11) {
        super(2, dVar);
        this.f4627a = i11;
        this.f4629c = e8Var;
        this.f4630d = aVar;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f4627a) {
            case 0:
                return new i0(this.f4629c, this.f4630d, dVar, 0);
            default:
                return new i0(this.f4629c, this.f4630d, dVar, 1);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f4627a) {
            case 0:
                break;
        }
        return ((i0) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f4627a) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i11 = this.f4628b;
                if (i11 == 0) {
                    com.bumptech.glide.e.F(obj);
                    this.f4628b = 1;
                    if (this.f4629c.b(this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                this.f4630d.invoke();
                return qy.b0.f48488a;
            default:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i12 = this.f4628b;
                if (i12 == 0) {
                    com.bumptech.glide.e.F(obj);
                    this.f4628b = 1;
                    if (this.f4629c.b(this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                this.f4630d.invoke();
                return qy.b0.f48488a;
        }
    }
}
