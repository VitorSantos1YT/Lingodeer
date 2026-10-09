package androidx.datastore.preferences.protobuf;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class k1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final k1 f1503f = new k1(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f1505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f1506c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1507d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f1508e;

    public k1(int i11, int[] iArr, Object[] objArr, boolean z11) {
        this.f1504a = i11;
        this.f1505b = iArr;
        this.f1506c = objArr;
        this.f1508e = z11;
    }

    public final void a(int i11) {
        int[] iArr = this.f1505b;
        if (i11 > iArr.length) {
            int i12 = this.f1504a;
            int i13 = (i12 / 2) + i12;
            if (i13 >= i11) {
                i11 = i13;
            }
            if (i11 < 8) {
                i11 = 8;
            }
            this.f1505b = Arrays.copyOf(iArr, i11);
            this.f1506c = Arrays.copyOf(this.f1506c, i11);
        }
    }

    public final int b() {
        int iF0;
        int iH0;
        int iF1;
        int i11 = this.f1507d;
        if (i11 != -1) {
            return i11;
        }
        int i12 = 0;
        for (int i13 = 0; i13 < this.f1504a; i13++) {
            int i14 = this.f1505b[i13];
            int i15 = i14 >>> 3;
            int i16 = i14 & 7;
            if (i16 != 0) {
                if (i16 == 1) {
                    ((Long) this.f1506c[i13]).getClass();
                    iF1 = o.f0(i15) + 8;
                } else if (i16 == 2) {
                    iF1 = o.d0(i15, (i) this.f1506c[i13]);
                } else if (i16 == 3) {
                    iF0 = o.f0(i15) * 2;
                    iH0 = ((k1) this.f1506c[i13]).b();
                } else {
                    if (i16 != 5) {
                        throw new IllegalStateException(InvalidProtocolBufferException.b());
                    }
                    ((Integer) this.f1506c[i13]).getClass();
                    iF1 = o.f0(i15) + 4;
                }
                i12 = iF1 + i12;
            } else {
                long jLongValue = ((Long) this.f1506c[i13]).longValue();
                iF0 = o.f0(i15);
                iH0 = o.h0(jLongValue);
            }
            i12 = iH0 + iF0 + i12;
        }
        this.f1507d = i12;
        return i12;
    }

    public final void c(int i11, Object obj) {
        if (!this.f1508e) {
            throw new UnsupportedOperationException();
        }
        a(this.f1504a + 1);
        int[] iArr = this.f1505b;
        int i12 = this.f1504a;
        iArr[i12] = i11;
        this.f1506c[i12] = obj;
        this.f1504a = i12 + 1;
    }

    public final void d(l0 l0Var) {
        if (this.f1504a == 0) {
            return;
        }
        l0Var.getClass();
        o oVar = (o) l0Var.f1512a;
        for (int i11 = 0; i11 < this.f1504a; i11++) {
            int i12 = this.f1505b[i11];
            Object obj = this.f1506c[i11];
            int i13 = i12 >>> 3;
            int i14 = i12 & 7;
            if (i14 == 0) {
                oVar.B0(i13, ((Long) obj).longValue());
            } else if (i14 == 1) {
                oVar.r0(i13, ((Long) obj).longValue());
            } else if (i14 == 2) {
                l0Var.a(i13, (i) obj);
            } else if (i14 == 3) {
                oVar.y0(i13, 3);
                ((k1) obj).d(l0Var);
                oVar.y0(i13, 4);
            } else {
                if (i14 != 5) {
                    throw new RuntimeException(InvalidProtocolBufferException.b());
                }
                oVar.p0(i13, ((Integer) obj).intValue());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof k1)) {
            return false;
        }
        k1 k1Var = (k1) obj;
        int i11 = this.f1504a;
        if (i11 == k1Var.f1504a) {
            int[] iArr = this.f1505b;
            int[] iArr2 = k1Var.f1505b;
            for (int i12 = 0; i12 < i11; i12++) {
                if (iArr[i12] == iArr2[i12]) {
                }
            }
            Object[] objArr = this.f1506c;
            Object[] objArr2 = k1Var.f1506c;
            int i13 = this.f1504a;
            for (int i14 = 0; i14 < i13; i14++) {
                if (objArr[i14].equals(objArr2[i14])) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i11 = this.f1504a;
        int i12 = (527 + i11) * 31;
        int[] iArr = this.f1505b;
        int iHashCode = 17;
        int i13 = 17;
        for (int i14 = 0; i14 < i11; i14++) {
            i13 = (i13 * 31) + iArr[i14];
        }
        int i15 = (i12 + i13) * 31;
        Object[] objArr = this.f1506c;
        int i16 = this.f1504a;
        for (int i17 = 0; i17 < i16; i17++) {
            iHashCode = (iHashCode * 31) + objArr[i17].hashCode();
        }
        return i15 + iHashCode;
    }
}
