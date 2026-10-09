package j7;

import b7.f0;
import java.math.RoundingMode;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n extends s {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f36151d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f36152e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f36153f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f36154g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f36155h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f36156i;

    public n(j jVar, long j11, long j12, long j13, long j14, List list, long j15, long j16, long j17) {
        super(jVar, j11, j12);
        this.f36151d = j13;
        this.f36152e = j14;
        this.f36153f = list;
        this.f36156i = j15;
        this.f36154g = j16;
        this.f36155h = j17;
    }

    public final long b(long j11, long j12) {
        long jD = d(j11);
        return jD != -1 ? jD : (int) (f((j12 - this.f36155h) + this.f36156i, j11) - c(j11, j12));
    }

    public final long c(long j11, long j12) {
        long jD = d(j11);
        long j13 = this.f36151d;
        if (jD == -1) {
            long j14 = this.f36154g;
            if (j14 != -9223372036854775807L) {
                return Math.max(j13, f((j12 - this.f36155h) - j14, j11));
            }
        }
        return j13;
    }

    public abstract long d(long j11);

    public final long e(long j11, long j12) {
        long j13 = this.f36166b;
        long j14 = this.f36151d;
        List list = this.f36153f;
        if (list != null) {
            return (((q) list.get((int) (j11 - j14))).f36162b * 1000000) / j13;
        }
        long jD = d(j12);
        return (jD == -1 || j11 != (j14 + jD) - 1) ? (this.f36152e * 1000000) / j13 : j12 - g(j11);
    }

    public final long f(long j11, long j12) {
        long jD = d(j12);
        long j13 = this.f36151d;
        if (jD != 0) {
            if (this.f36153f != null) {
                long j14 = (jD + j13) - 1;
                long j15 = j13;
                while (j15 <= j14) {
                    long j16 = ((j14 - j15) / 2) + j15;
                    long jG = g(j16);
                    if (jG < j11) {
                        j15 = j16 + 1;
                    } else {
                        if (jG <= j11) {
                            return j16;
                        }
                        j14 = j16 - 1;
                    }
                }
                return j15 == j13 ? j15 : j14;
            }
            long j17 = (j11 / ((this.f36152e * 1000000) / this.f36166b)) + j13;
            if (j17 >= j13) {
                return jD == -1 ? j17 : Math.min(j17, (j13 + jD) - 1);
            }
        }
        return j13;
    }

    public final long g(long j11) {
        long j12 = this.f36151d;
        List list = this.f36153f;
        long j13 = list != null ? ((q) list.get((int) (j11 - j12))).f36161a - this.f36167c : (j11 - j12) * this.f36152e;
        String str = f0.f3975a;
        return f0.R(j13, 1000000L, this.f36166b, RoundingMode.DOWN);
    }

    public abstract j h(k kVar, long j11);

    public boolean i() {
        return this.f36153f != null;
    }
}
