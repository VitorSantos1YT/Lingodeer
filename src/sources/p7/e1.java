package p7;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e1 implements z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z0 f46364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f46365b;

    public e1(z0 z0Var, long j11) {
        this.f46364a = z0Var;
        this.f46365b = j11;
    }

    @Override // p7.z0
    public final void b() {
        this.f46364a.b();
    }

    @Override // p7.z0
    public final boolean f() {
        return this.f46364a.f();
    }

    @Override // p7.z0
    public final int m(long j11) {
        return this.f46364a.m(j11 - this.f46365b);
    }

    @Override // p7.z0
    public final int o(ob.e eVar, e7.d dVar, int i11) {
        int iO = this.f46364a.o(eVar, dVar, i11);
        if (iO == -4) {
            dVar.f25117t += this.f46365b;
        }
        return iO;
    }
}
