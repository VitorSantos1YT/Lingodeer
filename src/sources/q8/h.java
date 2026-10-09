package q8;

import b7.f0;
import x7.x;
import x7.z;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f47583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f47584b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f47585c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f47586d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f47587e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f47588f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long[] f47589g;

    public h(long j11, int i11, long j12, int i12, long j13, long[] jArr) {
        this.f47583a = j11;
        this.f47584b = i11;
        this.f47585c = j12;
        this.f47586d = i12;
        this.f47587e = j13;
        this.f47589g = jArr;
        this.f47588f = j13 != -1 ? j11 + j13 : -1L;
    }

    @Override // q8.f
    public final long a() {
        return this.f47588f;
    }

    @Override // q8.f
    public final long b(long j11) {
        long j12 = j11 - this.f47583a;
        if (!d() || j12 <= this.f47584b) {
            return 0L;
        }
        long[] jArr = this.f47589g;
        b7.a.k(jArr);
        double d5 = (j12 * 256.0d) / this.f47587e;
        int iD = f0.d(jArr, (long) d5, true);
        long j13 = this.f47585c;
        long j14 = (((long) iD) * j13) / 100;
        long j15 = jArr[iD];
        int i11 = iD + 1;
        long j16 = (j13 * ((long) i11)) / 100;
        long j17 = iD == 99 ? 256L : jArr[i11];
        return Math.round((j15 == j17 ? 0.0d : (d5 - j15) / (j17 - j15)) * (j16 - j14)) + j14;
    }

    @Override // x7.y
    public final boolean d() {
        return this.f47589g != null;
    }

    @Override // x7.y
    public final x i(long j11) {
        double d5;
        double d11;
        boolean zD = d();
        int i11 = this.f47584b;
        long j12 = this.f47583a;
        if (!zD) {
            z zVar = new z(0L, j12 + ((long) i11));
            return new x(zVar, zVar);
        }
        long jH = f0.h(j11, 0L, this.f47585c);
        double d12 = (jH * 100.0d) / this.f47585c;
        double d13 = 0.0d;
        if (d12 <= 0.0d) {
            d5 = 256.0d;
        } else if (d12 >= 100.0d) {
            d5 = 256.0d;
            d13 = 256.0d;
        } else {
            int i12 = (int) d12;
            long[] jArr = this.f47589g;
            b7.a.k(jArr);
            double d14 = jArr[i12];
            if (i12 == 99) {
                d5 = 256.0d;
                d11 = 256.0d;
            } else {
                d5 = 256.0d;
                d11 = jArr[i12 + 1];
            }
            d13 = ((d11 - d14) * (d12 - ((double) i12))) + d14;
        }
        long j13 = this.f47587e;
        z zVar2 = new z(jH, j12 + f0.h(Math.round((d13 / d5) * j13), i11, j13 - 1));
        return new x(zVar2, zVar2);
    }

    @Override // q8.f
    public final int j() {
        return this.f47586d;
    }

    @Override // x7.y
    public final long k() {
        return this.f47585c;
    }
}
