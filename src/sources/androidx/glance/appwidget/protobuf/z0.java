package androidx.glance.appwidget.protobuf;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class z0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final z0 f2011f = new z0(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f2013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f2014c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2015d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f2016e;

    public z0(int i11, int[] iArr, Object[] objArr, boolean z11) {
        this.f2012a = i11;
        this.f2013b = iArr;
        this.f2014c = objArr;
        this.f2016e = z11;
    }

    public final void a(int i11) {
        int[] iArr = this.f2013b;
        if (i11 > iArr.length) {
            int i12 = this.f2012a;
            int i13 = (i12 / 2) + i12;
            if (i13 >= i11) {
                i11 = i13;
            }
            if (i11 < 8) {
                i11 = 8;
            }
            this.f2013b = Arrays.copyOf(iArr, i11);
            this.f2014c = Arrays.copyOf(this.f2014c, i11);
        }
    }

    public final int b() {
        int iA0;
        int iC0;
        int iA1;
        int i11 = this.f2015d;
        if (i11 != -1) {
            return i11;
        }
        int i12 = 0;
        for (int i13 = 0; i13 < this.f2012a; i13++) {
            int i14 = this.f2013b[i13];
            int i15 = i14 >>> 3;
            int i16 = i14 & 7;
            if (i16 != 0) {
                if (i16 == 1) {
                    ((Long) this.f2014c[i13]).getClass();
                    iA1 = l.a0(i15) + 8;
                } else if (i16 == 2) {
                    iA1 = l.Y(i15, (h) this.f2014c[i13]);
                } else if (i16 == 3) {
                    iA0 = l.a0(i15) * 2;
                    iC0 = ((z0) this.f2014c[i13]).b();
                } else {
                    if (i16 != 5) {
                        throw new IllegalStateException(InvalidProtocolBufferException.b());
                    }
                    ((Integer) this.f2014c[i13]).getClass();
                    iA1 = l.a0(i15) + 4;
                }
                i12 = iA1 + i12;
            } else {
                long jLongValue = ((Long) this.f2014c[i13]).longValue();
                iA0 = l.a0(i15);
                iC0 = l.c0(jLongValue);
            }
            i12 = iC0 + iA0 + i12;
        }
        this.f2015d = i12;
        return i12;
    }

    public final void c(int i11, Object obj) {
        if (!this.f2016e) {
            throw new UnsupportedOperationException();
        }
        a(this.f2012a + 1);
        int[] iArr = this.f2013b;
        int i12 = this.f2012a;
        iArr[i12] = i11;
        this.f2014c[i12] = obj;
        this.f2012a = i12 + 1;
    }

    public final void d(h0 h0Var) {
        if (this.f2012a == 0) {
            return;
        }
        h0Var.getClass();
        l lVar = (l) h0Var.f1938a;
        for (int i11 = 0; i11 < this.f2012a; i11++) {
            int i12 = this.f2013b[i11];
            Object obj = this.f2014c[i11];
            int i13 = i12 >>> 3;
            int i14 = i12 & 7;
            if (i14 == 0) {
                lVar.t0(i13, ((Long) obj).longValue());
            } else if (i14 == 1) {
                lVar.k0(i13, ((Long) obj).longValue());
            } else if (i14 == 2) {
                h0Var.a(i13, (h) obj);
            } else if (i14 == 3) {
                lVar.q0(i13, 3);
                ((z0) obj).d(h0Var);
                lVar.q0(i13, 4);
            } else {
                if (i14 != 5) {
                    throw new RuntimeException(InvalidProtocolBufferException.b());
                }
                lVar.i0(i13, ((Integer) obj).intValue());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof z0)) {
            return false;
        }
        z0 z0Var = (z0) obj;
        int i11 = this.f2012a;
        if (i11 == z0Var.f2012a) {
            int[] iArr = this.f2013b;
            int[] iArr2 = z0Var.f2013b;
            for (int i12 = 0; i12 < i11; i12++) {
                if (iArr[i12] == iArr2[i12]) {
                }
            }
            Object[] objArr = this.f2014c;
            Object[] objArr2 = z0Var.f2014c;
            int i13 = this.f2012a;
            for (int i14 = 0; i14 < i13; i14++) {
                if (objArr[i14].equals(objArr2[i14])) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i11 = this.f2012a;
        int i12 = (527 + i11) * 31;
        int[] iArr = this.f2013b;
        int iHashCode = 17;
        int i13 = 17;
        for (int i14 = 0; i14 < i11; i14++) {
            i13 = (i13 * 31) + iArr[i14];
        }
        int i15 = (i12 + i13) * 31;
        Object[] objArr = this.f2014c;
        int i16 = this.f2012a;
        for (int i17 = 0; i17 < i16; i17++) {
            iHashCode = (iHashCode * 31) + objArr[i17].hashCode();
        }
        return i15 + iHashCode;
    }
}
