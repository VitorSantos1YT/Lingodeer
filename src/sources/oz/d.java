package oz;

import aj.uZCn.evRpcb;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f46149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long[] f46150b;

    static {
        int[] iArr = new int[256];
        int i11 = 0;
        for (int i12 = 0; i12 < 256; i12++) {
            iArr[i12] = "0123456789abcdef".charAt(i12 & 15) | ("0123456789abcdef".charAt(i12 >> 4) << '\b');
        }
        f46149a = iArr;
        int[] iArr2 = new int[256];
        for (int i13 = 0; i13 < 256; i13++) {
            iArr2[i13] = "0123456789ABCDEF".charAt(i13 & 15) | ("0123456789ABCDEF".charAt(i13 >> 4) << '\b');
        }
        int[] iArr3 = new int[256];
        for (int i14 = 0; i14 < 256; i14++) {
            iArr3[i14] = -1;
        }
        int i15 = 0;
        int i16 = 0;
        while (i15 < "0123456789abcdef".length()) {
            iArr3["0123456789abcdef".charAt(i15)] = i16;
            i15++;
            i16++;
        }
        int i17 = 0;
        int i18 = 0;
        while (i17 < "0123456789ABCDEF".length()) {
            iArr3["0123456789ABCDEF".charAt(i17)] = i18;
            i17++;
            i18++;
        }
        long[] jArr = new long[256];
        for (int i19 = 0; i19 < 256; i19++) {
            jArr[i19] = -1;
        }
        int i21 = 0;
        int i22 = 0;
        while (i21 < "0123456789abcdef".length()) {
            jArr["0123456789abcdef".charAt(i21)] = i22;
            i21++;
            i22++;
        }
        int i23 = 0;
        while (i11 < "0123456789ABCDEF".length()) {
            jArr["0123456789ABCDEF".charAt(i11)] = i23;
            i11++;
            i23++;
        }
        f46150b = jArr;
    }

    public static long b(int i11, int i12, String str) {
        g format = g.f46154d;
        kotlin.jvm.internal.m.f(format, "format");
        jh.h.c(i11, i12, str.length());
        if (format.f46157c.f46153a) {
            a(i11, i12, str);
            return c(i11, i12, str);
        }
        if (i12 - i11 > 0) {
            a(i11, i12, str);
            return c(i11, i12, str);
        }
        String strSubstring = str.substring(i11, i12);
        kotlin.jvm.internal.m.e(strSubstring, "substring(...)");
        throw new NumberFormatException("Expected a hexadecimal number with prefix \"\" and suffix \"\", but was ".concat(strSubstring));
    }

    public static final long c(int i11, int i12, String str) {
        long j11 = 0;
        while (i11 < i12) {
            long j12 = j11 << 4;
            char cCharAt = str.charAt(i11);
            if ((cCharAt >>> '\b') == 0) {
                long j13 = f46150b[cCharAt];
                if (j13 >= 0) {
                    j11 = j12 | j13;
                    i11++;
                }
            }
            StringBuilder sbI = w4.c.i(i11, "Expected a hexadecimal digit at index ", ", but was ");
            sbI.append(str.charAt(i11));
            throw new NumberFormatException(sbI.toString());
        }
        return j11;
    }

    public static final void a(int i11, int i12, String str) {
        int i13 = i12 - i11;
        if (i13 < 1) {
            String strSubstring = str.substring(i11, i12);
            kotlin.jvm.internal.m.e(strSubstring, "substring(...)");
            throw new NumberFormatException("Expected at least 1 hexadecimal digits at index " + i11 + ", but was \"" + strSubstring + "\" of length " + i13);
        }
        if (i13 > 16) {
            int i14 = (i13 + i11) - 16;
            while (i11 < i14) {
                if (str.charAt(i11) != '0') {
                    StringBuilder sbI = w4.c.i(i11, evRpcb.GEzhvgMBrdMLX, ", but was '");
                    sbI.append(str.charAt(i11));
                    sbI.append("'.\nThe result won't fit the type being parsed.");
                    throw new NumberFormatException(sbI.toString());
                }
                i11++;
            }
        }
    }
}
