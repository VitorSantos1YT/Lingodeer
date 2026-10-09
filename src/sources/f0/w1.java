package f0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class w1 implements r2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i2 f26482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f26483b;

    public w1(i2 i2Var, boolean z11) {
        this.f26482a = i2Var;
        this.f26483b = z11;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // r2.a
    public final Object D(long j11, long j12, vy.d dVar) throws Throwable {
        v1 v1Var;
        long jD;
        if (dVar instanceof v1) {
            v1Var = (v1) dVar;
            int i11 = v1Var.f26469d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                v1Var.f26469d = i11 - Integer.MIN_VALUE;
            } else {
                v1Var = new v1(this, (xy.c) dVar);
            }
        } else {
            v1Var = new v1(this, (xy.c) dVar);
        }
        Object objA = v1Var.f26467b;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = v1Var.f26469d;
        if (i12 == 0) {
            com.bumptech.glide.e.F(objA);
            jD = 0;
            if (this.f26483b) {
                i2 i2Var = this.f26482a;
                if (!i2Var.f26313i) {
                    v1Var.f26466a = j12;
                    v1Var.f26469d = 1;
                    objA = i2Var.a(j12, v1Var);
                    if (objA == aVar) {
                        return aVar;
                    }
                }
                jD = v3.q.d(j12, jD);
            }
            return new v3.q(jD);
        }
        if (i12 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        j12 = v1Var.f26466a;
        com.bumptech.glide.e.F(objA);
        jD = ((v3.q) objA).f53504a;
        jD = v3.q.d(j12, jD);
        return new v3.q(jD);
    }

    @Override // r2.a
    public final long x(long j11, int i11, long j12) {
        if (!this.f26483b) {
            return 0L;
        }
        i2 i2Var = this.f26482a;
        if (i2Var.f26305a.b()) {
            return 0L;
        }
        return i2Var.h(i2Var.d(i2Var.f26305a.e(i2Var.d(i2Var.g(j12)))));
    }
}
