package p7;

import androidx.media3.exoplayer.source.ClippingMediaSource$IllegalClippingException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements z, y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f46339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public y f46340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c[] f46341c = new c[0];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f46342d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f46343e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f46344f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ClippingMediaSource$IllegalClippingException f46345t;

    public d(z zVar, boolean z11, long j11, long j12) {
        this.f46339a = zVar;
        this.f46342d = z11 ? j11 : -9223372036854775807L;
        this.f46343e = j11;
        this.f46344f = j12;
    }

    @Override // p7.b1
    public final boolean a() {
        return this.f46339a.a();
    }

    @Override // p7.a1
    public final void b(b1 b1Var) {
        y yVar = this.f46340b;
        yVar.getClass();
        yVar.b(this);
    }

    public final boolean c() {
        return this.f46342d != -9223372036854775807L;
    }

    @Override // p7.y
    public final void d(z zVar) {
        if (this.f46345t != null) {
            return;
        }
        y yVar = this.f46340b;
        yVar.getClass();
        yVar.d(this);
    }

    @Override // p7.b1
    public final long h() {
        long jH = this.f46339a.h();
        if (jH != Long.MIN_VALUE) {
            long j11 = this.f46344f;
            if (j11 == Long.MIN_VALUE || jH < j11) {
                return jH;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // p7.z
    public final long i(long j11, f7.h1 h1Var) {
        long j12 = this.f46343e;
        if (j11 == j12) {
            return j12;
        }
        long jH = b7.f0.h(h1Var.f26793a, 0L, j11 - j12);
        long j13 = h1Var.f26794b;
        long j14 = this.f46344f;
        long jH2 = b7.f0.h(j13, 0L, j14 == Long.MIN_VALUE ? Long.MAX_VALUE : j14 - j11);
        if (jH != h1Var.f26793a || jH2 != h1Var.f26794b) {
            h1Var = new f7.h1(jH, jH2);
        }
        return this.f46339a.i(j11, h1Var);
    }

    @Override // p7.z
    public final void j() throws ClippingMediaSource$IllegalClippingException {
        ClippingMediaSource$IllegalClippingException clippingMediaSource$IllegalClippingException = this.f46345t;
        if (clippingMediaSource$IllegalClippingException != null) {
            throw clippingMediaSource$IllegalClippingException;
        }
        this.f46339a.j();
    }

    @Override // p7.z
    public final long k(long j11) {
        this.f46342d = -9223372036854775807L;
        for (c cVar : this.f46341c) {
            if (cVar != null) {
                cVar.f46334b = false;
            }
        }
        long jK = this.f46339a.k(j11);
        long j12 = this.f46343e;
        long j13 = this.f46344f;
        long jMax = Math.max(jK, j12);
        return j13 != Long.MIN_VALUE ? Math.min(jMax, j13) : jMax;
    }

    @Override // p7.z
    public final void l(long j11) {
        this.f46339a.l(j11);
    }

    @Override // p7.z
    public final void n(y yVar, long j11) {
        this.f46340b = yVar;
        this.f46339a.n(this, j11);
    }

    @Override // p7.z
    public final long r(s7.s[] sVarArr, boolean[] zArr, z0[] z0VarArr, boolean[] zArr2, long j11) {
        long j12;
        this.f46341c = new c[z0VarArr.length];
        z0[] z0VarArr2 = new z0[z0VarArr.length];
        for (int i11 = 0; i11 < z0VarArr.length; i11++) {
            c[] cVarArr = this.f46341c;
            c cVar = (c) z0VarArr[i11];
            cVarArr[i11] = cVar;
            z0VarArr2[i11] = cVar != null ? cVar.f46333a : null;
        }
        long jR = this.f46339a.r(sVarArr, zArr, z0VarArr2, zArr2, j11);
        long j13 = this.f46344f;
        long jMax = Math.max(jR, j11);
        if (j13 != Long.MIN_VALUE) {
            jMax = Math.min(jMax, j13);
        }
        if (c()) {
            if (jR >= j11) {
                if (jR != 0) {
                    int length = sVarArr.length;
                    int i12 = 0;
                    while (true) {
                        if (i12 < length) {
                            s7.s sVar = sVarArr[i12];
                            if (sVar != null) {
                                y6.p pVarM = sVar.m();
                                if (!y6.d0.a(pVarM.f57291n, pVarM.f57289k)) {
                                }
                            }
                            i12++;
                        }
                    }
                }
                j12 = -9223372036854775807L;
            }
            j12 = jMax;
        } else {
            j12 = -9223372036854775807L;
        }
        this.f46342d = j12;
        for (int i13 = 0; i13 < z0VarArr.length; i13++) {
            z0 z0Var = z0VarArr2[i13];
            if (z0Var == null) {
                this.f46341c[i13] = null;
            } else {
                c[] cVarArr2 = this.f46341c;
                c cVar2 = cVarArr2[i13];
                if (cVar2 == null || cVar2.f46333a != z0Var) {
                    cVarArr2[i13] = new c(this, z0Var);
                }
            }
            z0VarArr[i13] = this.f46341c[i13];
        }
        return jMax;
    }

    @Override // p7.z
    public final long s() {
        if (c()) {
            long j11 = this.f46342d;
            this.f46342d = -9223372036854775807L;
            long jS = s();
            return jS != -9223372036854775807L ? jS : j11;
        }
        long jS2 = this.f46339a.s();
        if (jS2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j12 = this.f46343e;
        long j13 = this.f46344f;
        long jMax = Math.max(jS2, j12);
        return j13 != Long.MIN_VALUE ? Math.min(jMax, j13) : jMax;
    }

    @Override // p7.z
    public final g1 t() {
        return this.f46339a.t();
    }

    @Override // p7.b1
    public final boolean u(f7.j0 j0Var) {
        return this.f46339a.u(j0Var);
    }

    @Override // p7.b1
    public final long w() {
        long jW = this.f46339a.w();
        if (jW != Long.MIN_VALUE) {
            long j11 = this.f46344f;
            if (j11 == Long.MIN_VALUE || jW < j11) {
                return jW;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // p7.b1
    public final void x(long j11) {
        this.f46339a.x(j11);
    }
}
