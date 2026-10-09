package b7;

import java.math.RoundingMode;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f3954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f3955b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f3956c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ThreadLocal f3957d = new ThreadLocal();

    public b0(long j11) {
        e(j11);
    }

    public final synchronized long a(long j11) {
        long j12;
        if (j11 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            synchronized (this) {
                if (!(this.f3955b != -9223372036854775807L)) {
                    long jLongValue = this.f3954a;
                    if (jLongValue == 9223372036854775806L) {
                        Long l9 = (Long) this.f3957d.get();
                        l9.getClass();
                        jLongValue = l9.longValue();
                    }
                    this.f3955b = jLongValue - j11;
                    notifyAll();
                }
                this.f3956c = j11;
                j12 = j11 + this.f3955b;
            }
            return j12;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized long b(long j11) {
        if (j11 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j12 = this.f3956c;
            if (j12 != -9223372036854775807L) {
                String str = f0.f3975a;
                long jR = f0.R(j12, 90000L, 1000000L, RoundingMode.DOWN);
                long j13 = (4294967296L + jR) / 8589934592L;
                long j14 = ((j13 - 1) * 8589934592L) + j11;
                long j15 = (j13 * 8589934592L) + j11;
                j11 = Math.abs(j14 - jR) < Math.abs(j15 - jR) ? j14 : j15;
            }
            long j16 = j11;
            String str2 = f0.f3975a;
            return a(f0.R(j16, 1000000L, 90000L, RoundingMode.DOWN));
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized long c(long j11) {
        if (j11 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j12 = this.f3956c;
            if (j12 != -9223372036854775807L) {
                String str = f0.f3975a;
                long jR = f0.R(j12, 90000L, 1000000L, RoundingMode.DOWN);
                long j13 = jR / 8589934592L;
                long j14 = (j13 * 8589934592L) + j11;
                j11 = j14 >= jR ? j14 : ((j13 + 1) * 8589934592L) + j11;
            }
            long j15 = j11;
            String str2 = f0.f3975a;
            return a(f0.R(j15, 1000000L, 90000L, RoundingMode.DOWN));
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized long d() {
        long j11;
        j11 = this.f3954a;
        if (j11 == Long.MAX_VALUE || j11 == 9223372036854775806L) {
            j11 = -9223372036854775807L;
        }
        return j11;
    }

    public final synchronized void e(long j11) {
        this.f3954a = j11;
        this.f3955b = j11 == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.f3956c = -9223372036854775807L;
    }
}
