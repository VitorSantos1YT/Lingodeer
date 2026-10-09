package com.google.android.gms.internal.measurement;

import b7.e0;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzaga {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final zzaga f11345f = new zzaga(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f11346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f11347b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f11348c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f11349d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f11350e;

    public zzaga(int i11, int[] iArr, Object[] objArr, boolean z11) {
        this.f11349d = -1;
        this.f11346a = i11;
        this.f11347b = iArr;
        this.f11348c = objArr;
        this.f11350e = z11;
    }

    public static zzaga a() {
        return new zzaga(0, new int[8], new Object[8], true);
    }

    public final void b(zzadb zzadbVar) {
        zzada zzadaVar = zzadbVar.f11247a;
        if (this.f11346a != 0) {
            for (int i11 = 0; i11 < this.f11346a; i11++) {
                int i12 = this.f11347b[i11];
                Object obj = this.f11348c[i11];
                int i13 = i12 & 7;
                int i14 = i12 >>> 3;
                if (i13 == 0) {
                    zzadbVar.d(i14, ((Long) obj).longValue());
                } else if (i13 == 1) {
                    zzadbVar.k(i14, ((Long) obj).longValue());
                } else if (i13 == 2) {
                    zzadbVar.n(i14, (zzacr) obj);
                } else if (i13 == 3) {
                    zzadaVar.f(i14, 3);
                    ((zzaga) obj).b(zzadbVar);
                    zzadaVar.f(i14, 4);
                } else {
                    if (i13 != 5) {
                        throw new RuntimeException(new zzaeg());
                    }
                    zzadbVar.l(i14, ((Integer) obj).intValue());
                }
            }
        }
    }

    public final int c() {
        int iB;
        int iC;
        int iB2;
        int i11 = this.f11349d;
        if (i11 != -1) {
            return i11;
        }
        int iB3 = 0;
        for (int i12 = 0; i12 < this.f11346a; i12++) {
            int i13 = this.f11347b[i12];
            int i14 = i13 >>> 3;
            int i15 = i13 & 7;
            if (i15 != 0) {
                if (i15 != 1) {
                    if (i15 == 2) {
                        int i16 = i14 << 3;
                        zzacr zzacrVar = (zzacr) this.f11348c[i12];
                        int iB4 = zzada.b(i16);
                        int iD = zzacrVar.d();
                        iB3 = e0.b(iD, iD, iB4, iB3);
                    } else if (i15 == 3) {
                        int iB5 = zzada.b(i14 << 3);
                        iB = iB5 + iB5;
                        iC = ((zzaga) this.f11348c[i12]).c();
                    } else {
                        if (i15 != 5) {
                            throw new IllegalStateException(new zzaeg());
                        }
                        ((Integer) this.f11348c[i12]).getClass();
                        iB2 = zzada.b(i14 << 3) + 4;
                    }
                } else {
                    ((Long) this.f11348c[i12]).getClass();
                    iB2 = zzada.b(i14 << 3) + 8;
                }
                iB3 = iB2 + iB3;
            } else {
                int i17 = i14 << 3;
                long jLongValue = ((Long) this.f11348c[i12]).longValue();
                iB = zzada.b(i17);
                iC = zzada.c(jLongValue);
            }
            iB3 = iC + iB + iB3;
        }
        this.f11349d = iB3;
        return iB3;
    }

    public final void d(int i11, Object obj) {
        if (!this.f11350e) {
            throw new UnsupportedOperationException();
        }
        e(this.f11346a + 1);
        int[] iArr = this.f11347b;
        int i12 = this.f11346a;
        iArr[i12] = i11;
        this.f11348c[i12] = obj;
        this.f11346a = i12 + 1;
    }

    public final void e(int i11) {
        int[] iArr = this.f11347b;
        if (i11 > iArr.length) {
            int i12 = this.f11346a;
            int i13 = (i12 / 2) + i12;
            if (i13 >= i11) {
                i11 = i13;
            }
            if (i11 < 8) {
                i11 = 8;
            }
            this.f11347b = Arrays.copyOf(iArr, i11);
            this.f11348c = Arrays.copyOf(this.f11348c, i11);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzaga)) {
            return false;
        }
        zzaga zzagaVar = (zzaga) obj;
        int i11 = this.f11346a;
        if (i11 == zzagaVar.f11346a) {
            int[] iArr = this.f11347b;
            int[] iArr2 = zzagaVar.f11347b;
            for (int i12 = 0; i12 < i11; i12++) {
                if (iArr[i12] == iArr2[i12]) {
                }
            }
            Object[] objArr = this.f11348c;
            Object[] objArr2 = zzagaVar.f11348c;
            int i13 = this.f11346a;
            for (int i14 = 0; i14 < i13; i14++) {
                if (objArr[i14].equals(objArr2[i14])) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i11 = this.f11346a;
        int i12 = i11 + 527;
        int[] iArr = this.f11347b;
        int iHashCode = 17;
        int i13 = 17;
        for (int i14 = 0; i14 < i11; i14++) {
            i13 = (i13 * 31) + iArr[i14];
        }
        int i15 = ((i12 * 31) + i13) * 31;
        Object[] objArr = this.f11348c;
        int i16 = this.f11346a;
        for (int i17 = 0; i17 < i16; i17++) {
            iHashCode = (iHashCode * 31) + objArr[i17].hashCode();
        }
        return i15 + iHashCode;
    }

    private zzaga() {
        this(0, new int[8], new Object[8], true);
    }
}
