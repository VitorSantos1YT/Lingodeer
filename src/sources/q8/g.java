package q8;

import b7.f0;
import x7.x;
import x7.z;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long[] f47578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f47579b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f47580c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f47581d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f47582e;

    public g(long[] jArr, long[] jArr2, long j11, long j12, long j13, int i11) {
        this.f47578a = jArr;
        this.f47579b = jArr2;
        this.f47580c = j11;
        this.f47581d = j13;
        this.f47582e = i11;
    }

    @Override // q8.f
    public final long a() {
        return this.f47581d;
    }

    @Override // q8.f
    public final long b(long j11) {
        return this.f47578a[f0.d(this.f47579b, j11, true)];
    }

    @Override // x7.y
    public final boolean d() {
        return true;
    }

    @Override // x7.y
    public final x i(long j11) {
        long[] jArr = this.f47578a;
        int iD = f0.d(jArr, j11, true);
        long j12 = jArr[iD];
        long[] jArr2 = this.f47579b;
        z zVar = new z(j12, jArr2[iD]);
        if (j12 >= j11 || iD == jArr.length - 1) {
            return new x(zVar, zVar);
        }
        int i11 = iD + 1;
        return new x(zVar, new z(jArr[i11], jArr2[i11]));
    }

    @Override // q8.f
    public final int j() {
        return this.f47582e;
    }

    @Override // x7.y
    public final long k() {
        return this.f47580c;
    }
}
