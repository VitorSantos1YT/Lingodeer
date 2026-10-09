package f9;

import b7.f0;
import b7.p;
import java.math.RoundingMode;
import x7.x;
import x7.y;
import x7.z;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f27024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f27025b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f27026c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f27027d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f27028e;

    public g(p pVar, int i11, long j11, long j12) {
        this.f27024a = pVar;
        this.f27025b = i11;
        this.f27026c = j11;
        long j13 = (j12 - j11) / ((long) pVar.f4018d);
        this.f27027d = j13;
        this.f27028e = c(j13);
    }

    public final long c(long j11) {
        long j12 = j11 * ((long) this.f27025b);
        long j13 = this.f27024a.f4017c;
        String str = f0.f3975a;
        return f0.R(j12, 1000000L, j13, RoundingMode.DOWN);
    }

    @Override // x7.y
    public final boolean d() {
        return true;
    }

    @Override // x7.y
    public final x i(long j11) {
        p pVar = this.f27024a;
        long j12 = (((long) pVar.f4017c) * j11) / (((long) this.f27025b) * 1000000);
        long j13 = this.f27027d;
        long jH = f0.h(j12, 0L, j13 - 1);
        long j14 = ((long) pVar.f4018d) * jH;
        long j15 = this.f27026c;
        long jC = c(jH);
        z zVar = new z(jC, j14 + j15);
        if (jC >= j11 || jH == j13 - 1) {
            return new x(zVar, zVar);
        }
        long j16 = jH + 1;
        return new x(zVar, new z(c(j16), (((long) pVar.f4018d) * j16) + j15));
    }

    @Override // x7.y
    public final long k() {
        return this.f27028e;
    }
}
