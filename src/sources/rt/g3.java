package rt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class g3 extends xy.i implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ int f49774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ int f49775b;

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj2).intValue();
        g3 g3Var = new g3(3, (vy.d) obj3);
        g3Var.f49774a = iIntValue;
        g3Var.f49775b = iIntValue2;
        return g3Var.invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        int i11 = this.f49774a;
        int i12 = this.f49775b;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        com.bumptech.glide.e.F(obj);
        return new t(i11, i12 == i11);
    }
}
