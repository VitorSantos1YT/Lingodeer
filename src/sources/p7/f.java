package p7;

import androidx.media3.exoplayer.source.ClippingMediaSource$IllegalClippingException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends q {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f46366c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f46367d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f46368e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f46369f;

    public f(y6.o0 o0Var, long j11, long j12) throws ClippingMediaSource$IllegalClippingException {
        super(o0Var);
        if (j12 != Long.MIN_VALUE && j12 < j11) {
            throw new ClippingMediaSource$IllegalClippingException(j11, 2, j12);
        }
        boolean z11 = false;
        if (o0Var.h() != 1) {
            throw new ClippingMediaSource$IllegalClippingException(0);
        }
        y6.n0 n0VarM = o0Var.m(0, new y6.n0(), 0L);
        long jMax = Math.max(0L, j11);
        if (!n0VarM.f57248k && jMax != 0 && !n0VarM.f57245h) {
            throw new ClippingMediaSource$IllegalClippingException(1);
        }
        long jMax2 = j12 == Long.MIN_VALUE ? n0VarM.m : Math.max(0L, j12);
        long j13 = n0VarM.m;
        if (j13 != -9223372036854775807L) {
            jMax2 = jMax2 > j13 ? j13 : jMax2;
            if (jMax > jMax2) {
                jMax = jMax2;
            }
        }
        this.f46366c = jMax;
        this.f46367d = jMax2;
        this.f46368e = jMax2 != -9223372036854775807L ? jMax2 - jMax : -9223372036854775807L;
        if (n0VarM.f57246i && (jMax2 == -9223372036854775807L || (j13 != -9223372036854775807L && jMax2 == j13))) {
            z11 = true;
        }
        this.f46369f = z11;
    }

    @Override // p7.q, y6.o0
    public final y6.m0 f(int i11, y6.m0 m0Var, boolean z11) {
        this.f46450b.f(0, m0Var, z11);
        long j11 = m0Var.f57232e - this.f46366c;
        long j12 = this.f46368e;
        m0Var.h(m0Var.f57228a, m0Var.f57229b, 0, j12 != -9223372036854775807L ? j12 - j11 : -9223372036854775807L, j11, y6.b.f57174c, false);
        return m0Var;
    }

    @Override // p7.q, y6.o0
    public final y6.n0 m(int i11, y6.n0 n0Var, long j11) {
        this.f46450b.m(0, n0Var, 0L);
        long j12 = n0Var.f57252p;
        long j13 = this.f46366c;
        n0Var.f57252p = j12 + j13;
        n0Var.m = this.f46368e;
        n0Var.f57246i = this.f46369f;
        long j14 = n0Var.f57249l;
        if (j14 != -9223372036854775807L) {
            long jMax = Math.max(j14, j13);
            n0Var.f57249l = jMax;
            long j15 = this.f46367d;
            if (j15 != -9223372036854775807L) {
                jMax = Math.min(jMax, j15);
            }
            n0Var.f57249l = jMax - j13;
        }
        long jV = b7.f0.V(j13);
        long j16 = n0Var.f57242e;
        if (j16 != -9223372036854775807L) {
            n0Var.f57242e = j16 + jV;
        }
        long j17 = n0Var.f57243f;
        if (j17 != -9223372036854775807L) {
            n0Var.f57243f = j17 + jV;
        }
        return n0Var;
    }
}
