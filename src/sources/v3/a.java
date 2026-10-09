package v3;

import hh.p0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f53483a;

    public /* synthetic */ a(long j11) {
        this.f53483a = j11;
    }

    public static long a(int i11, int i12, int i13, int i14, int i15, long j11) {
        if ((i15 & 1) != 0) {
            i11 = j(j11);
        }
        if ((i15 & 2) != 0) {
            i12 = h(j11);
        }
        if ((i15 & 4) != 0) {
            i13 = i(j11);
        }
        if ((i15 & 8) != 0) {
            i14 = g(j11);
        }
        if (i12 < i11 || i14 < i13 || i11 < 0 || i13 < 0) {
            i.a("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return b.h(i11, i12, i13, i14);
    }

    public static final boolean b(long j11, long j12) {
        return j11 == j12;
    }

    public static final boolean c(long j11) {
        int i11 = (int) (3 & j11);
        int i12 = (((i11 & 2) >> 1) * 3) + ((i11 & 1) << 1);
        return (((int) (j11 >> (i12 + 46))) & ((1 << (18 - i12)) - 1)) != 0;
    }

    public static final boolean d(long j11) {
        int i11 = (int) (3 & j11);
        return (((int) (j11 >> 33)) & ((1 << (((((i11 & 2) >> 1) * 3) + ((i11 & 1) << 1)) + 13)) - 1)) != 0;
    }

    public static final boolean e(long j11) {
        int i11 = (int) (3 & j11);
        int i12 = (((i11 & 2) >> 1) * 3) + ((i11 & 1) << 1);
        int i13 = (1 << (18 - i12)) - 1;
        int i14 = ((int) (j11 >> (i12 + 15))) & i13;
        int i15 = ((int) (j11 >> (i12 + 46))) & i13;
        return i14 == (i15 == 0 ? Integer.MAX_VALUE : i15 - 1);
    }

    public static final boolean f(long j11) {
        int i11 = (int) (3 & j11);
        int i12 = (1 << (((((i11 & 2) >> 1) * 3) + ((i11 & 1) << 1)) + 13)) - 1;
        int i13 = ((int) (j11 >> 2)) & i12;
        int i14 = ((int) (j11 >> 33)) & i12;
        return i13 == (i14 == 0 ? Integer.MAX_VALUE : i14 - 1);
    }

    public static final int g(long j11) {
        int i11 = (int) (3 & j11);
        int i12 = (((i11 & 2) >> 1) * 3) + ((i11 & 1) << 1);
        int i13 = ((int) (j11 >> (i12 + 46))) & ((1 << (18 - i12)) - 1);
        if (i13 == 0) {
            return Integer.MAX_VALUE;
        }
        return i13 - 1;
    }

    public static final int h(long j11) {
        int i11 = (int) (3 & j11);
        int i12 = (int) (j11 >> 33);
        int i13 = i12 & ((1 << (((((i11 & 2) >> 1) * 3) + ((i11 & 1) << 1)) + 13)) - 1);
        if (i13 == 0) {
            return Integer.MAX_VALUE;
        }
        return i13 - 1;
    }

    public static final int i(long j11) {
        int i11 = (int) (3 & j11);
        int i12 = (((i11 & 2) >> 1) * 3) + ((i11 & 1) << 1);
        return ((int) (j11 >> (i12 + 15))) & ((1 << (18 - i12)) - 1);
    }

    public static final int j(long j11) {
        int i11 = (int) (3 & j11);
        return ((int) (j11 >> 2)) & ((1 << (((((i11 & 2) >> 1) * 3) + ((i11 & 1) << 1)) + 13)) - 1);
    }

    public static String k(long j11) {
        int iH = h(j11);
        String strValueOf = iH == Integer.MAX_VALUE ? "Infinity" : String.valueOf(iH);
        int iG = g(j11);
        String strValueOf2 = iG != Integer.MAX_VALUE ? String.valueOf(iG) : "Infinity";
        StringBuilder sb2 = new StringBuilder("Constraints(minWidth = ");
        sb2.append(j(j11));
        sb2.append(", maxWidth = ");
        sb2.append(strValueOf);
        sb2.append(", minHeight = ");
        sb2.append(i(j11));
        sb2.append(", maxHeight = ");
        return p0.o(sb2, strValueOf2, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.f53483a == ((a) obj).f53483a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f53483a);
    }

    public final String toString() {
        return k(this.f53483a);
    }
}
