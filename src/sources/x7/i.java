package x7;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f55892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f55893b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f55894c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long[] f55895d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long[] f55896e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f55897f;

    public i(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f55893b = iArr;
        this.f55894c = jArr;
        this.f55895d = jArr2;
        this.f55896e = jArr3;
        int length = iArr.length;
        this.f55892a = length;
        if (length > 0) {
            this.f55897f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f55897f = 0L;
        }
    }

    @Override // x7.y
    public final boolean d() {
        return true;
    }

    @Override // x7.y
    public final x i(long j11) {
        long[] jArr = this.f55896e;
        int iD = b7.f0.d(jArr, j11, true);
        long j12 = jArr[iD];
        long[] jArr2 = this.f55894c;
        z zVar = new z(j12, jArr2[iD]);
        if (j12 >= j11 || iD == this.f55892a - 1) {
            return new x(zVar, zVar);
        }
        int i11 = iD + 1;
        return new x(zVar, new z(jArr[i11], jArr2[i11]));
    }

    @Override // x7.y
    public final long k() {
        return this.f55897f;
    }

    public final String toString() {
        return "ChunkIndex(length=" + this.f55892a + ", sizes=" + Arrays.toString(this.f55893b) + ", offsets=" + Arrays.toString(this.f55894c) + ", timeUs=" + Arrays.toString(this.f55896e) + ", durationsUs=" + Arrays.toString(this.f55895d) + ")";
    }
}
