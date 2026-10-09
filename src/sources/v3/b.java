package v3;

import hh.p0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static final long a(int i11, int i12, int i13, int i14) {
        if (!((i13 >= 0) & (i12 >= i11) & (i14 >= i13) & (i11 >= 0))) {
            i.a("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return h(i11, i12, i13, i14);
    }

    public static /* synthetic */ long b(int i11, int i12, int i13) {
        if ((i13 & 2) != 0) {
            i11 = Integer.MAX_VALUE;
        }
        if ((i13 & 8) != 0) {
            i12 = Integer.MAX_VALUE;
        }
        return a(0, i11, 0, i12);
    }

    public static final int c(int i11) {
        if (i11 < 8191) {
            return 13;
        }
        if (i11 < 32767) {
            return 15;
        }
        if (i11 < 65535) {
            return 16;
        }
        return i11 < 262143 ? 18 : 255;
    }

    public static final long d(long j11, long j12) {
        int i11 = (int) (j12 >> 32);
        int iJ = a.j(j11);
        int iH = a.h(j11);
        if (i11 < iJ) {
            i11 = iJ;
        }
        if (i11 <= iH) {
            iH = i11;
        }
        int i12 = (int) (j12 & 4294967295L);
        int i13 = a.i(j11);
        int iG = a.g(j11);
        if (i12 < i13) {
            i12 = i13;
        }
        if (i12 <= iG) {
            iG = i12;
        }
        return (((long) iH) << 32) | (((long) iG) & 4294967295L);
    }

    public static final long e(long j11, long j12) {
        int iJ = a.j(j11);
        int iH = a.h(j11);
        int i11 = a.i(j11);
        int iG = a.g(j11);
        int iJ2 = a.j(j12);
        if (iJ2 < iJ) {
            iJ2 = iJ;
        }
        if (iJ2 > iH) {
            iJ2 = iH;
        }
        int iH2 = a.h(j12);
        if (iH2 >= iJ) {
            iJ = iH2;
        }
        if (iJ <= iH) {
            iH = iJ;
        }
        int i12 = a.i(j12);
        if (i12 < i11) {
            i12 = i11;
        }
        if (i12 > iG) {
            i12 = iG;
        }
        int iG2 = a.g(j12);
        if (iG2 >= i11) {
            i11 = iG2;
        }
        if (i11 <= iG) {
            iG = i11;
        }
        return a(iJ2, iH, i12, iG);
    }

    public static final int f(int i11, long j11) {
        int i12 = a.i(j11);
        int iG = a.g(j11);
        if (i11 < i12) {
            i11 = i12;
        }
        return i11 > iG ? iG : i11;
    }

    public static final int g(int i11, long j11) {
        int iJ = a.j(j11);
        int iH = a.h(j11);
        if (i11 < iJ) {
            i11 = iJ;
        }
        return i11 > iH ? iH : i11;
    }

    public static final long h(int i11, int i12, int i13, int i14) {
        int i15 = i14 == Integer.MAX_VALUE ? i13 : i14;
        int iC = c(i15);
        int i16 = i12 == Integer.MAX_VALUE ? i11 : i12;
        int iC2 = c(i16);
        if (iC + iC2 > 31) {
            k(i16, i15);
        }
        int i17 = i12 + 1;
        int i18 = i14 + 1;
        int i19 = iC2 - 13;
        return (((long) (i17 & (~(i17 >> 31)))) << 33) | ((long) ((i19 >> 1) + (i19 & 1))) | (((long) i11) << 2) | (((long) i13) << (iC2 + 2)) | (((long) (i18 & (~(i18 >> 31)))) << (iC2 + 33));
    }

    public static final long i(long j11, int i11, int i12) {
        int iJ = a.j(j11) + i11;
        if (iJ < 0) {
            iJ = 0;
        }
        int iH = a.h(j11);
        if (iH != Integer.MAX_VALUE && (iH = iH + i11) < 0) {
            iH = 0;
        }
        int i13 = a.i(j11) + i12;
        if (i13 < 0) {
            i13 = 0;
        }
        int iG = a.g(j11);
        return a(iJ, iH, i13, (iG == Integer.MAX_VALUE || (iG = iG + i12) >= 0) ? iG : 0);
    }

    public static /* synthetic */ long j(int i11, int i12, int i13, long j11) {
        if ((i13 & 1) != 0) {
            i11 = 0;
        }
        if ((i13 & 2) != 0) {
            i12 = 0;
        }
        return i(j11, i11, i12);
    }

    public static final void k(int i11, int i12) {
        throw new IllegalArgumentException(p0.l("Can't represent a width of ", i11, " and height of ", i12, " in Constraints"));
    }

    public static final Void l(int i11) {
        throw new IllegalArgumentException(p0.h(i11, "Can't represent a size of ", " in Constraints"));
    }
}
