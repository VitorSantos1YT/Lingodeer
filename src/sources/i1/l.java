package i1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends xy.i implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ rz.b0 f34034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ float f34035b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ob.s f34036c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(ob.s sVar, vy.d dVar) {
        super(3, dVar);
        this.f34036c = sVar;
    }

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        float fFloatValue = ((Number) obj2).floatValue();
        l lVar = new l(this.f34036c, (vy.d) obj3);
        lVar.f34034a = (rz.b0) obj;
        lVar.f34035b = fFloatValue;
        qy.b0 b0Var = qy.b0.f48488a;
        lVar.invokeSuspend(b0Var);
        return b0Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        com.bumptech.glide.e.F(obj);
        rz.e0.B(this.f34034a, null, null, new f3.c(this.f34035b, 2, this.f34036c, null), 3);
        return qy.b0.f48488a;
    }
}
