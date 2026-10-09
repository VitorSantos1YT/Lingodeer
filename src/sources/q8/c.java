package q8;

import android.util.Pair;
import b7.f0;
import x7.x;
import x7.z;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long[] f47557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f47558b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f47559c;

    public c(long j11, long[] jArr, long[] jArr2) {
        this.f47557a = jArr;
        this.f47558b = jArr2;
        this.f47559c = j11 == -9223372036854775807L ? f0.K(jArr2[jArr2.length - 1]) : j11;
    }

    public static Pair c(long j11, long[] jArr, long[] jArr2) {
        int iD = f0.d(jArr, j11, true);
        long j12 = jArr[iD];
        long j13 = jArr2[iD];
        int i11 = iD + 1;
        if (i11 == jArr.length) {
            return Pair.create(Long.valueOf(j12), Long.valueOf(j13));
        }
        long j14 = jArr[i11];
        return Pair.create(Long.valueOf(j11), Long.valueOf(((long) ((j14 == j12 ? 0.0d : (j11 - j12) / (j14 - j12)) * (jArr2[i11] - j13))) + j13));
    }

    @Override // q8.f
    public final long a() {
        return -1L;
    }

    @Override // q8.f
    public final long b(long j11) {
        return f0.K(((Long) c(j11, this.f47557a, this.f47558b).second).longValue());
    }

    @Override // x7.y
    public final boolean d() {
        return true;
    }

    @Override // x7.y
    public final x i(long j11) {
        Pair pairC = c(f0.V(f0.h(j11, 0L, this.f47559c)), this.f47558b, this.f47557a);
        z zVar = new z(f0.K(((Long) pairC.first).longValue()), ((Long) pairC.second).longValue());
        return new x(zVar, zVar);
    }

    @Override // q8.f
    public final int j() {
        return -2147483647;
    }

    @Override // x7.y
    public final long k() {
        return this.f47559c;
    }
}
