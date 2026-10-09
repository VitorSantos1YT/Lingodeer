package f7;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h1 f26792c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f26793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f26794b;

    static {
        h1 h1Var = new h1(0L, 0L);
        new h1(Long.MAX_VALUE, Long.MAX_VALUE);
        new h1(Long.MAX_VALUE, 0L);
        new h1(0L, Long.MAX_VALUE);
        f26792c = h1Var;
    }

    public h1(long j11, long j12) {
        b7.a.d(j11 >= 0);
        b7.a.d(j12 >= 0);
        this.f26793a = j11;
        this.f26794b = j12;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x005d A[RETURN] */
    public final long a(long j11, long j12, long j13) {
        long j14 = this.f26793a;
        long j15 = this.f26794b;
        if (j14 == 0 && j15 == 0) {
            return j11;
        }
        String str = b7.f0.f3975a;
        long j16 = j11 - j14;
        if (((j14 ^ j11) & (j11 ^ j16)) < 0) {
            j16 = Long.MIN_VALUE;
        }
        long j17 = j11 + j15;
        if (((j15 ^ j17) & (j11 ^ j17)) < 0) {
            j17 = Long.MAX_VALUE;
        }
        boolean z11 = false;
        boolean z12 = j16 <= j12 && j12 <= j17;
        if (j16 <= j13 && j13 <= j17) {
            z11 = true;
        }
        if (z12 && z11) {
            if (Math.abs(j12 - j11) <= Math.abs(j13 - j11)) {
                return j12;
            }
            return j13;
        }
        if (!z12) {
            if (z11) {
                return j13;
            }
            return j16;
        }
        return j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && h1.class == obj.getClass()) {
            h1 h1Var = (h1) obj;
            if (this.f26793a == h1Var.f26793a && this.f26794b == h1Var.f26794b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f26793a) * 31) + ((int) this.f26794b);
    }
}
