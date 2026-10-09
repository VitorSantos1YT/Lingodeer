package com.google.android.gms.internal.p002firebaseauthapi;

import b7.e0;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzani {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final zzani f10217f = new zzani(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f10218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f10219b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f10220c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f10221d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f10222e;

    private zzani() {
        this(0, new int[8], new Object[8], true);
    }

    public static zzani e() {
        return new zzani();
    }

    public final int a() {
        int iX;
        int iU;
        int i11 = this.f10221d;
        if (i11 != -1) {
            return i11;
        }
        int iB = 0;
        for (int i12 = 0; i12 < this.f10218a; i12++) {
            int i13 = this.f10219b[i12];
            int i14 = i13 >>> 3;
            int i15 = i13 & 7;
            if (i15 != 0) {
                if (i15 == 1) {
                    ((Long) this.f10220c[i12]).getClass();
                    iB = e0.B(i14 << 3, 8, iB);
                } else if (i15 == 2) {
                    iB = zzakb.q(i14, (zzaje) this.f10220c[i12]) + iB;
                } else if (i15 == 3) {
                    iX = zzakb.w(i14) << 1;
                    iU = ((zzani) this.f10220c[i12]).a();
                } else {
                    if (i15 != 5) {
                        throw new IllegalStateException(zzale.a());
                    }
                    ((Integer) this.f10220c[i12]).getClass();
                    iB = e0.B(i14 << 3, 4, iB);
                }
            } else {
                long jLongValue = ((Long) this.f10220c[i12]).longValue();
                iX = zzakb.x(i14 << 3);
                iU = zzakb.u(jLongValue);
            }
            iB = iU + iX + iB;
        }
        this.f10221d = iB;
        return iB;
    }

    public final void b(int i11) {
        int[] iArr = this.f10219b;
        if (i11 > iArr.length) {
            int i12 = this.f10218a;
            int i13 = (i12 / 2) + i12;
            if (i13 >= i11) {
                i11 = i13;
            }
            if (i11 < 8) {
                i11 = 8;
            }
            this.f10219b = Arrays.copyOf(iArr, i11);
            this.f10220c = Arrays.copyOf(this.f10220c, i11);
        }
    }

    public final void c(int i11, Object obj) {
        if (!this.f10222e) {
            throw new UnsupportedOperationException();
        }
        b(this.f10218a + 1);
        int[] iArr = this.f10219b;
        int i12 = this.f10218a;
        iArr[i12] = i11;
        this.f10220c[i12] = obj;
        this.f10218a = i12 + 1;
    }

    public final void d(zzake zzakeVar) {
        if (this.f10218a == 0) {
            return;
        }
        for (int i11 = 0; i11 < this.f10218a; i11++) {
            int i12 = this.f10219b[i11];
            Object obj = this.f10220c[i11];
            int i13 = i12 >>> 3;
            int i14 = i12 & 7;
            if (i14 == 0) {
                zzakeVar.i(i13, ((Long) obj).longValue());
            } else if (i14 == 1) {
                zzakeVar.d(i13, ((Long) obj).longValue());
            } else if (i14 == 2) {
                zzakeVar.e(i13, (zzaje) obj);
            } else if (i14 == 3) {
                zzakeVar.f10111a.s(i13, 3);
                ((zzani) obj).d(zzakeVar);
                zzakeVar.f10111a.s(i13, 4);
            } else {
                if (i14 != 5) {
                    throw new RuntimeException(zzale.a());
                }
                zzakeVar.h(i13, ((Integer) obj).intValue());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzani)) {
            return false;
        }
        zzani zzaniVar = (zzani) obj;
        int i11 = this.f10218a;
        if (i11 == zzaniVar.f10218a) {
            int[] iArr = this.f10219b;
            int[] iArr2 = zzaniVar.f10219b;
            for (int i12 = 0; i12 < i11; i12++) {
                if (iArr[i12] == iArr2[i12]) {
                }
            }
            Object[] objArr = this.f10220c;
            Object[] objArr2 = zzaniVar.f10220c;
            int i13 = this.f10218a;
            for (int i14 = 0; i14 < i13; i14++) {
                if (objArr[i14].equals(objArr2[i14])) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i11 = this.f10218a;
        int i12 = (i11 + 527) * 31;
        int[] iArr = this.f10219b;
        int iHashCode = 17;
        int i13 = 17;
        for (int i14 = 0; i14 < i11; i14++) {
            i13 = (i13 * 31) + iArr[i14];
        }
        int i15 = (i12 + i13) * 31;
        Object[] objArr = this.f10220c;
        int i16 = this.f10218a;
        for (int i17 = 0; i17 < i16; i17++) {
            iHashCode = (iHashCode * 31) + objArr[i17].hashCode();
        }
        return i15 + iHashCode;
    }

    public zzani(int i11, int[] iArr, Object[] objArr, boolean z11) {
        this.f10221d = -1;
        this.f10218a = i11;
        this.f10219b = iArr;
        this.f10220c = objArr;
        this.f10222e = z11;
    }
}
