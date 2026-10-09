package h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class w5 extends xy.i implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ float f31232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fz.c f31233b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w5(fz.c cVar, vy.d dVar) {
        super(3, dVar);
        this.f31233b = cVar;
    }

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        float fFloatValue = ((Number) obj2).floatValue();
        w5 w5Var = new w5(this.f31233b, (vy.d) obj3);
        w5Var.f31232a = fFloatValue;
        qy.b0 b0Var = qy.b0.f48488a;
        w5Var.invokeSuspend(b0Var);
        return b0Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        com.bumptech.glide.e.F(obj);
        this.f31233b.invoke(new Float(this.f31232a));
        return qy.b0.f48488a;
    }
}
