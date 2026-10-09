package r8;

import b7.f0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f48974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f48975b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f48976c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f48977d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f48978e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long[] f48979f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f48980g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f48981h;

    public q(n nVar, long[] jArr, int[] iArr, int i11, long[] jArr2, int[] iArr2, long j11) {
        b7.a.d(iArr.length == jArr2.length);
        b7.a.d(jArr.length == jArr2.length);
        b7.a.d(iArr2.length == jArr2.length);
        this.f48974a = nVar;
        this.f48976c = jArr;
        this.f48977d = iArr;
        this.f48978e = i11;
        this.f48979f = jArr2;
        this.f48980g = iArr2;
        this.f48981h = j11;
        this.f48975b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    public final int a(long j11) {
        long[] jArr = this.f48979f;
        for (int iA = f0.a(jArr, j11, true); iA < jArr.length; iA++) {
            if ((this.f48980g[iA] & 1) != 0) {
                return iA;
            }
        }
        return -1;
    }
}
