package h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class y extends xy.i implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f31326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ float f31327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a9.i f31328c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(a9.i iVar, vy.d dVar) {
        super(3, dVar);
        this.f31328c = iVar;
    }

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        float fFloatValue = ((Number) obj2).floatValue();
        y yVar = new y(this.f31328c, (vy.d) obj3);
        yVar.f31327b = fFloatValue;
        return yVar.invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i11 = this.f31326a;
        if (i11 == 0) {
            com.bumptech.glide.e.F(obj);
            float f5 = this.f31327b;
            a9.i iVar = this.f31328c;
            cc ccVar = (cc) iVar.f517a;
            b0.x xVar = (b0.x) iVar.f519c;
            b0.i1 i1Var = (b0.i1) iVar.f518b;
            this.f31326a = 1;
            if (e0.e(ccVar, f5, xVar, i1Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(obj);
        }
        return qy.b0.f48488a;
    }
}
