package p7;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f1 implements z, y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f46375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f46376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public y f46377c;

    public f1(z zVar, long j11) {
        this.f46375a = zVar;
        this.f46376b = j11;
    }

    @Override // p7.b1
    public final boolean a() {
        return this.f46375a.a();
    }

    @Override // p7.a1
    public final void b(b1 b1Var) {
        y yVar = this.f46377c;
        yVar.getClass();
        yVar.b(this);
    }

    @Override // p7.y
    public final void d(z zVar) {
        y yVar = this.f46377c;
        yVar.getClass();
        yVar.d(this);
    }

    @Override // p7.b1
    public final long h() {
        long jH = this.f46375a.h();
        if (jH == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jH + this.f46376b;
    }

    @Override // p7.z
    public final long i(long j11, f7.h1 h1Var) {
        long j12 = this.f46376b;
        return this.f46375a.i(j11 - j12, h1Var) + j12;
    }

    @Override // p7.z
    public final void j() {
        this.f46375a.j();
    }

    @Override // p7.z
    public final long k(long j11) {
        long j12 = this.f46376b;
        return this.f46375a.k(j11 - j12) + j12;
    }

    @Override // p7.z
    public final void l(long j11) {
        this.f46375a.l(j11 - this.f46376b);
    }

    @Override // p7.z
    public final void n(y yVar, long j11) {
        this.f46377c = yVar;
        this.f46375a.n(this, j11 - this.f46376b);
    }

    @Override // p7.z
    public final long r(s7.s[] sVarArr, boolean[] zArr, z0[] z0VarArr, boolean[] zArr2, long j11) {
        z0[] z0VarArr2 = new z0[z0VarArr.length];
        int i11 = 0;
        while (true) {
            z0 z0Var = null;
            if (i11 >= z0VarArr.length) {
                break;
            }
            e1 e1Var = (e1) z0VarArr[i11];
            if (e1Var != null) {
                z0Var = e1Var.f46364a;
            }
            z0VarArr2[i11] = z0Var;
            i11++;
        }
        z zVar = this.f46375a;
        long j12 = this.f46376b;
        long jR = zVar.r(sVarArr, zArr, z0VarArr2, zArr2, j11 - j12);
        for (int i12 = 0; i12 < z0VarArr.length; i12++) {
            z0 z0Var2 = z0VarArr2[i12];
            if (z0Var2 == null) {
                z0VarArr[i12] = null;
            } else {
                z0 z0Var3 = z0VarArr[i12];
                if (z0Var3 == null || ((e1) z0Var3).f46364a != z0Var2) {
                    z0VarArr[i12] = new e1(z0Var2, j12);
                }
            }
        }
        return jR + j12;
    }

    @Override // p7.z
    public final long s() {
        long jS = this.f46375a.s();
        if (jS == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return jS + this.f46376b;
    }

    @Override // p7.z
    public final g1 t() {
        return this.f46375a.t();
    }

    @Override // p7.b1
    public final boolean u(f7.j0 j0Var) {
        f7.i0 i0Var = new f7.i0();
        long j11 = j0Var.f26811a;
        i0Var.f26798b = j0Var.f26812b;
        i0Var.f26799c = j0Var.f26813c;
        i0Var.f26797a = j11 - this.f46376b;
        return this.f46375a.u(new f7.j0(i0Var));
    }

    @Override // p7.b1
    public final long w() {
        long jW = this.f46375a.w();
        if (jW == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jW + this.f46376b;
    }

    @Override // p7.b1
    public final void x(long j11) {
        this.f46375a.x(j11 - this.f46376b);
    }
}
