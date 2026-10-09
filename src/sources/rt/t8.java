package rt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class t8 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f50429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ long f50430b;

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        t8 t8Var = new t8(2, dVar);
        t8Var.f50430b = ((Number) obj).longValue();
        return t8Var;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        return ((t8) create(Long.valueOf(((Number) obj).longValue()), (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        long j11 = this.f50430b;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i11 = this.f50429a;
        if (i11 == 0) {
            com.bumptech.glide.e.F(obj);
            this.f50430b = j11;
            this.f50429a = 1;
            if (rz.e0.m(j11, this) == aVar) {
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
