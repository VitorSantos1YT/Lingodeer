package t1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f52004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f52005b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[] f52006c;

    public k(int i11, long[] jArr, Object[] objArr) {
        this.f52004a = i11;
        this.f52005b = jArr;
        this.f52006c = objArr;
    }

    public final int a(long j11) {
        int i11 = this.f52004a - 1;
        if (i11 != -1) {
            long[] jArr = this.f52005b;
            int i12 = 0;
            if (i11 != 0) {
                while (i12 <= i11) {
                    int i13 = (i12 + i11) >>> 1;
                    long j12 = jArr[i13] - j11;
                    if (j12 < 0) {
                        i12 = i13 + 1;
                    } else {
                        if (j12 <= 0) {
                            return i13;
                        }
                        i11 = i13 - 1;
                    }
                }
                return -(i12 + 1);
            }
            long j13 = jArr[0];
            if (j13 == j11) {
                return 0;
            }
            if (j13 > j11) {
                return -2;
            }
        }
        return -1;
    }

    public final k b(long j11, Object obj) {
        long[] jArr;
        int i11;
        Object[] objArr = this.f52006c;
        int i12 = 0;
        int i13 = 0;
        for (Object obj2 : objArr) {
            if (obj2 != null) {
                i13++;
            }
        }
        int i14 = i13 + 1;
        long[] jArr2 = new long[i14];
        Object[] objArr2 = new Object[i14];
        if (i14 > 1) {
            int i15 = 0;
            while (true) {
                jArr = this.f52005b;
                i11 = this.f52004a;
                if (i12 >= i14 || i15 >= i11) {
                    break;
                }
                long j12 = jArr[i15];
                Object obj3 = objArr[i15];
                if (j12 > j11) {
                    jArr2[i12] = j11;
                    objArr2[i12] = obj;
                    i12++;
                    break;
                }
                if (obj3 != null) {
                    jArr2[i12] = j12;
                    objArr2[i12] = obj3;
                    i12++;
                }
                i15++;
            }
            if (i15 == i11) {
                jArr2[i13] = j11;
                objArr2[i13] = obj;
            } else {
                while (i12 < i14) {
                    long j13 = jArr[i15];
                    Object obj4 = objArr[i15];
                    if (obj4 != null) {
                        jArr2[i12] = j13;
                        objArr2[i12] = obj4;
                        i12++;
                    }
                    i15++;
                }
            }
        } else {
            jArr2[0] = j11;
            objArr2[0] = obj;
        }
        return new k(i14, jArr2, objArr2);
    }
}
