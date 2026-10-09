package h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class wa extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f31258b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ya f31259c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f31260d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wa(ya yaVar, float f5, vy.d dVar, int i11) {
        super(2, dVar);
        this.f31257a = i11;
        this.f31259c = yaVar;
        this.f31260d = f5;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f31257a) {
            case 0:
                return new wa(this.f31259c, this.f31260d, dVar, 0);
            default:
                return new wa(this.f31259c, this.f31260d, dVar, 1);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f31257a) {
            case 0:
                break;
        }
        return ((wa) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f31257a) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i11 = this.f31258b;
                if (i11 == 0) {
                    com.bumptech.glide.e.F(obj);
                    ya yaVar = this.f31259c;
                    b0.d dVar = yaVar.U;
                    if (dVar != null) {
                        Float f5 = new Float(this.f31260d);
                        b0.m mVar = yaVar.S ? r9.f31000f : r9.f31001g;
                        this.f31258b = 1;
                        obj = b0.d.c(dVar, f5, mVar, null, this, 12);
                        if (obj == aVar) {
                            return aVar;
                        }
                    }
                    return qy.b0.f48488a;
                }
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.e.F(obj);
                return qy.b0.f48488a;
            default:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i12 = this.f31258b;
                if (i12 == 0) {
                    com.bumptech.glide.e.F(obj);
                    ya yaVar2 = this.f31259c;
                    b0.d dVar2 = yaVar2.T;
                    if (dVar2 != null) {
                        Float f11 = new Float(this.f31260d);
                        b0.m mVar2 = yaVar2.S ? r9.f31000f : r9.f31001g;
                        this.f31258b = 1;
                        obj = b0.d.c(dVar2, f11, mVar2, null, this, 12);
                        if (obj == aVar2) {
                            return aVar2;
                        }
                    }
                    return qy.b0.f48488a;
                }
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.e.F(obj);
                return qy.b0.f48488a;
        }
    }
}
