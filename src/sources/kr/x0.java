package kr;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class x0 extends xy.i implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ boolean f38611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ int f38612b;

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int iIntValue = ((Number) obj2).intValue();
        x0 x0Var = new x0(3, (vy.d) obj3);
        x0Var.f38611a = zBooleanValue;
        x0Var.f38612b = iIntValue;
        return x0Var.invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        boolean z11 = this.f38611a;
        int i11 = this.f38612b;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        com.bumptech.glide.e.F(obj);
        return new qy.l(Boolean.valueOf(z11), new Integer(i11));
    }
}
