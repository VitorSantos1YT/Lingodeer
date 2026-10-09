package f0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class r0 extends n0 {

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public s0 f26418b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public h1 f26419c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public boolean f26420d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public fz.f f26421e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public fz.f f26422f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public boolean f26423g0;

    @Override // f0.n0
    public final Object a1(m0 m0Var, m0 m0Var2) {
        Object objA = this.f26418b0.a(d0.l1.UserInput, new a0.e0(24, m0Var, this, (vy.d) null), m0Var2);
        return objA == wy.a.COROUTINE_SUSPENDED ? objA : qy.b0.f48488a;
    }

    @Override // f0.n0
    public final void b1(long j11) {
        if (!this.P || kotlin.jvm.internal.m.a(this.f26421e0, p0.f26394a)) {
            return;
        }
        rz.e0.B(H0(), null, rz.d0.UNDISPATCHED, new q0(this, j11, null, 0), 1);
    }

    @Override // f0.n0
    public final void c1(long j11) {
        if (!this.P || kotlin.jvm.internal.m.a(this.f26422f0, p0.f26395b)) {
            return;
        }
        rz.e0.B(H0(), null, rz.d0.UNDISPATCHED, new q0(this, j11, null, 1), 1);
    }

    @Override // f0.n0
    public final boolean d1() {
        return this.f26420d0;
    }
}
