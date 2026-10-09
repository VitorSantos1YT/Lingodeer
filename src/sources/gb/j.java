package gb;

import rz.e0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends xy.i implements fz.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f28936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ long f28937b;

    @Override // fz.g
    public final Object f(Object obj, Object obj2, Object obj3, Object obj4) {
        long jLongValue = ((Number) obj3).longValue();
        j jVar = new j(4, (vy.d) obj4);
        jVar.f28937b = jLongValue;
        return jVar.invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i11 = this.f28936a;
        if (i11 == 0) {
            com.bumptech.glide.e.F(obj);
            long j11 = this.f28937b;
            fb.l lVarB = fb.l.b();
            int i12 = k.f28939b;
            lVarB.getClass();
            long jMin = Math.min(j11 * ((long) 30000), k.f28938a);
            this.f28936a = 1;
            if (e0.m(jMin, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(obj);
        }
        return Boolean.TRUE;
    }
}
