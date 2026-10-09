package p7;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class v extends y6.o0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y6.x f46503b;

    public v(y6.x xVar) {
        this.f46503b = xVar;
    }

    @Override // y6.o0
    public final int b(Object obj) {
        return obj == u.f46495e ? 0 : -1;
    }

    @Override // y6.o0
    public final y6.m0 f(int i11, y6.m0 m0Var, boolean z11) {
        m0Var.h(z11 ? 0 : null, z11 ? u.f46495e : null, 0, -9223372036854775807L, 0L, y6.b.f57174c, true);
        return m0Var;
    }

    @Override // y6.o0
    public final int h() {
        return 1;
    }

    @Override // y6.o0
    public final Object l(int i11) {
        return u.f46495e;
    }

    @Override // y6.o0
    public final y6.n0 m(int i11, y6.n0 n0Var, long j11) {
        Object obj = y6.n0.f57236q;
        n0Var.b(this.f46503b, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0, 0L);
        n0Var.f57248k = true;
        return n0Var;
    }

    @Override // y6.o0
    public final int o() {
        return 1;
    }
}
