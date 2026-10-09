package com.google.android.gms.internal.play_billing;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzhi {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final zzhi f12449f = new zzhi(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f12450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f12451b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f12452c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f12453d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f12454e;

    public zzhi(int i11, int[] iArr, Object[] objArr, boolean z11) {
        this.f12453d = -1;
        this.f12450a = i11;
        this.f12451b = iArr;
        this.f12452c = objArr;
        this.f12454e = z11;
    }

    public static zzhi b() {
        return new zzhi(0, new int[8], new Object[8], true);
    }

    public final int a() {
        int iB;
        int iC;
        int iB2;
        int i11 = this.f12453d;
        if (i11 != -1) {
            return i11;
        }
        int iB3 = 0;
        for (int i12 = 0; i12 < this.f12450a; i12++) {
            int i13 = this.f12451b[i12];
            int i14 = i13 >>> 3;
            int i15 = i13 & 7;
            if (i15 != 0) {
                if (i15 != 1) {
                    if (i15 == 2) {
                        int i16 = i14 << 3;
                        zzei zzeiVar = (zzei) this.f12452c[i12];
                        int iB4 = zzep.b(i16);
                        int iE = zzeiVar.e();
                        iB3 = zzep.b(iE) + iE + iB4 + iB3;
                    } else if (i15 == 3) {
                        int iB5 = zzep.b(i14 << 3);
                        iB = iB5 + iB5;
                        iC = ((zzhi) this.f12452c[i12]).a();
                    } else {
                        if (i15 != 5) {
                            throw new IllegalStateException(new zzfp());
                        }
                        ((Integer) this.f12452c[i12]).getClass();
                        iB2 = zzep.b(i14 << 3) + 4;
                    }
                } else {
                    ((Long) this.f12452c[i12]).getClass();
                    iB2 = zzep.b(i14 << 3) + 8;
                }
                iB3 = iB2 + iB3;
            } else {
                int i17 = i14 << 3;
                long jLongValue = ((Long) this.f12452c[i12]).longValue();
                iB = zzep.b(i17);
                iC = zzep.c(jLongValue);
            }
            iB3 = iC + iB + iB3;
        }
        this.f12453d = iB3;
        return iB3;
    }

    public final void c(int i11, Object obj) {
        if (!this.f12454e) {
            throw new UnsupportedOperationException();
        }
        e(this.f12450a + 1);
        int[] iArr = this.f12451b;
        int i12 = this.f12450a;
        iArr[i12] = i11;
        this.f12452c[i12] = obj;
        this.f12450a = i12 + 1;
    }

    public final void d(zzhu zzhuVar) {
        if (this.f12450a != 0) {
            for (int i11 = 0; i11 < this.f12450a; i11++) {
                int i12 = this.f12451b[i11];
                Object obj = this.f12452c[i11];
                int i13 = i12 & 7;
                int i14 = i12 >>> 3;
                if (i13 == 0) {
                    zzhuVar.zzt(i14, ((Long) obj).longValue());
                } else if (i13 == 1) {
                    zzhuVar.zzm(i14, ((Long) obj).longValue());
                } else if (i13 == 2) {
                    zzhuVar.b(i14, (zzei) obj);
                } else if (i13 == 3) {
                    zzhuVar.zzF(i14);
                    ((zzhi) obj).d(zzhuVar);
                    zzhuVar.zzh(i14);
                } else {
                    if (i13 != 5) {
                        throw new RuntimeException(new zzfp());
                    }
                    zzhuVar.zzk(i14, ((Integer) obj).intValue());
                }
            }
        }
    }

    public final void e(int i11) {
        int[] iArr = this.f12451b;
        if (i11 > iArr.length) {
            int i12 = this.f12450a;
            int i13 = (i12 / 2) + i12;
            if (i13 >= i11) {
                i11 = i13;
            }
            if (i11 < 8) {
                i11 = 8;
            }
            this.f12451b = Arrays.copyOf(iArr, i11);
            this.f12452c = Arrays.copyOf(this.f12452c, i11);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzhi)) {
            return false;
        }
        zzhi zzhiVar = (zzhi) obj;
        int i11 = this.f12450a;
        if (i11 == zzhiVar.f12450a) {
            int[] iArr = this.f12451b;
            int[] iArr2 = zzhiVar.f12451b;
            for (int i12 = 0; i12 < i11; i12++) {
                if (iArr[i12] == iArr2[i12]) {
                }
            }
            Object[] objArr = this.f12452c;
            Object[] objArr2 = zzhiVar.f12452c;
            int i13 = this.f12450a;
            for (int i14 = 0; i14 < i13; i14++) {
                if (objArr[i14].equals(objArr2[i14])) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i11 = this.f12450a;
        int i12 = i11 + 527;
        int[] iArr = this.f12451b;
        int iHashCode = 17;
        int i13 = 17;
        for (int i14 = 0; i14 < i11; i14++) {
            i13 = (i13 * 31) + iArr[i14];
        }
        int i15 = ((i12 * 31) + i13) * 31;
        Object[] objArr = this.f12452c;
        int i16 = this.f12450a;
        for (int i17 = 0; i17 < i16; i17++) {
            iHashCode = (iHashCode * 31) + objArr[i17].hashCode();
        }
        return i15 + iHashCode;
    }

    private zzhi() {
        this(0, new int[8], new Object[8], true);
    }
}
