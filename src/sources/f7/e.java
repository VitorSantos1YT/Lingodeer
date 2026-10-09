package f7;

import androidx.media3.exoplayer.ExoPlaybackException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e implements a1 {
    public int H;
    public p7.z0 K;
    public y6.p[] L;
    public long M;
    public long N;
    public boolean P;
    public boolean Q;
    public p7.b0 S;
    public s7.q T;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f26700b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e1 f26702d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f26703e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public g7.j f26704f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public b7.y f26705t;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f26699a = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ob.e f26701c = new ob.e(8, false);
    public long O = Long.MIN_VALUE;
    public y6.o0 R = y6.o0.f57278a;

    public e(int i11) {
        this.f26700b = i11;
    }

    public static int a(int i11, int i12, int i13, int i14) {
        return i11 | i12 | i13 | 128 | i14;
    }

    public static boolean n(int i11, boolean z11) {
        int i12 = i11 & 7;
        if (i12 != 4) {
            return z11 && i12 == 3;
        }
        return true;
    }

    public abstract int B(y6.p pVar);

    public int C() {
        return 0;
    }

    public final ExoPlaybackException g(Exception exc, y6.p pVar, boolean z11, int i11) {
        int iB;
        if (pVar == null || this.Q) {
            iB = 4;
        } else {
            this.Q = true;
            try {
                iB = B(pVar) & 7;
                this.Q = false;
            } catch (ExoPlaybackException unused) {
                this.Q = false;
                iB = 4;
            } catch (Throwable th2) {
                this.Q = false;
                throw th2;
            }
        }
        return new ExoPlaybackException(1, exc, i11, k(), this.f26703e, pVar, pVar == null ? 4 : iB, this.S, z11);
    }

    public long i(long j11, long j12) {
        if (this.H == 1) {
            return (o() || m()) ? 1000000L : 10000L;
        }
        return 10000L;
    }

    public k0 j() {
        return null;
    }

    public abstract String k();

    public final boolean l() {
        return this.O == Long.MIN_VALUE;
    }

    public abstract boolean m();

    public abstract boolean o();

    public abstract void p();

    public abstract void r(long j11, boolean z11);

    public final int x(ob.e eVar, e7.d dVar, int i11) {
        p7.z0 z0Var = this.K;
        z0Var.getClass();
        int iO = z0Var.o(eVar, dVar, i11);
        if (iO == -4) {
            if (dVar.e(4)) {
                this.O = Long.MIN_VALUE;
                return this.P ? -4 : -3;
            }
            long j11 = dVar.f25117t + this.M;
            dVar.f25117t = j11;
            this.O = Math.max(this.O, j11);
            return iO;
        }
        if (iO == -5) {
            y6.p pVar = (y6.p) eVar.f44805c;
            pVar.getClass();
            long j12 = pVar.f57296s;
            if (j12 != Long.MAX_VALUE) {
                y6.o oVarA = pVar.a();
                oVarA.f57269r = j12 + this.M;
                eVar.f44805c = new y6.p(oVarA);
            }
        }
        return iO;
    }

    public abstract void y(long j11, long j12);

    public final void z(y6.p[] pVarArr, p7.z0 z0Var, long j11, long j12, p7.b0 b0Var) {
        b7.a.j(!this.P);
        this.K = z0Var;
        this.S = b0Var;
        if (this.O == Long.MIN_VALUE) {
            this.O = j11;
        }
        this.L = pVarArr;
        this.M = j12;
        w(pVarArr, j11, j12, b0Var);
    }

    public void h() {
    }

    public void s() {
    }

    public void t() {
    }

    public void u() {
    }

    public void v() {
    }

    public void A(float f5, float f11) {
    }

    @Override // f7.a1
    public void f(int i11, Object obj) {
    }

    public void q(boolean z11, boolean z12) {
    }

    public void w(y6.p[] pVarArr, long j11, long j12, p7.b0 b0Var) {
    }
}
