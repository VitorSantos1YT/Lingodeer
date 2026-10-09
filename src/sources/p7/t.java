package p7;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class t implements z, y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f46488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f46489b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t7.g f46490c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f46491d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public z f46492e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public y f46493f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f46494t = -9223372036854775807L;

    public t(b0 b0Var, t7.g gVar, long j11) {
        this.f46488a = b0Var;
        this.f46490c = gVar;
        this.f46489b = j11;
    }

    @Override // p7.b1
    public final boolean a() {
        z zVar = this.f46492e;
        return zVar != null && zVar.a();
    }

    @Override // p7.a1
    public final void b(b1 b1Var) {
        y yVar = this.f46493f;
        String str = b7.f0.f3975a;
        yVar.b(this);
    }

    public final void c(b0 b0Var) {
        long j11 = this.f46494t;
        if (j11 == -9223372036854775807L) {
            j11 = this.f46489b;
        }
        a aVar = this.f46491d;
        aVar.getClass();
        z zVarA = aVar.a(b0Var, this.f46490c, j11);
        this.f46492e = zVarA;
        if (this.f46493f != null) {
            zVarA.n(this, j11);
        }
    }

    @Override // p7.y
    public final void d(z zVar) {
        y yVar = this.f46493f;
        String str = b7.f0.f3975a;
        yVar.d(this);
    }

    @Override // p7.b1
    public final long h() {
        z zVar = this.f46492e;
        String str = b7.f0.f3975a;
        return zVar.h();
    }

    @Override // p7.z
    public final long i(long j11, f7.h1 h1Var) {
        z zVar = this.f46492e;
        String str = b7.f0.f3975a;
        return zVar.i(j11, h1Var);
    }

    @Override // p7.z
    public final void j() {
        z zVar = this.f46492e;
        if (zVar != null) {
            zVar.j();
            return;
        }
        a aVar = this.f46491d;
        if (aVar != null) {
            aVar.i();
        }
    }

    @Override // p7.z
    public final long k(long j11) {
        z zVar = this.f46492e;
        String str = b7.f0.f3975a;
        return zVar.k(j11);
    }

    @Override // p7.z
    public final void l(long j11) {
        z zVar = this.f46492e;
        String str = b7.f0.f3975a;
        zVar.l(j11);
    }

    @Override // p7.z
    public final void n(y yVar, long j11) {
        this.f46493f = yVar;
        z zVar = this.f46492e;
        if (zVar != null) {
            long j12 = this.f46494t;
            if (j12 == -9223372036854775807L) {
                j12 = this.f46489b;
            }
            zVar.n(this, j12);
        }
    }

    @Override // p7.z
    public final long r(s7.s[] sVarArr, boolean[] zArr, z0[] z0VarArr, boolean[] zArr2, long j11) {
        long j12 = this.f46494t;
        long j13 = (j12 == -9223372036854775807L || j11 != this.f46489b) ? j11 : j12;
        this.f46494t = -9223372036854775807L;
        z zVar = this.f46492e;
        String str = b7.f0.f3975a;
        return zVar.r(sVarArr, zArr, z0VarArr, zArr2, j13);
    }

    @Override // p7.z
    public final long s() {
        z zVar = this.f46492e;
        String str = b7.f0.f3975a;
        return zVar.s();
    }

    @Override // p7.z
    public final g1 t() {
        z zVar = this.f46492e;
        String str = b7.f0.f3975a;
        return zVar.t();
    }

    @Override // p7.b1
    public final boolean u(f7.j0 j0Var) {
        z zVar = this.f46492e;
        return zVar != null && zVar.u(j0Var);
    }

    @Override // p7.b1
    public final long w() {
        z zVar = this.f46492e;
        String str = b7.f0.f3975a;
        return zVar.w();
    }

    @Override // p7.b1
    public final void x(long j11) {
        z zVar = this.f46492e;
        String str = b7.f0.f3975a;
        zVar.x(j11);
    }
}
