package oz;

import com.tbruyelle.rxpermissions3.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class x extends w {
    public static boolean k0(String str, String suffix, boolean z11) {
        kotlin.jvm.internal.m.f(str, "<this>");
        kotlin.jvm.internal.m.f(suffix, "suffix");
        return !z11 ? str.endsWith(suffix) : n0(str.length() - suffix.length(), 0, suffix.length(), str, suffix, true);
    }

    public static boolean l0(String str, String str2, boolean z11) {
        if (str == null) {
            return str2 == null;
        }
        return !z11 ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    public static final void m0(String str) {
        throw new NumberFormatException(nv.p.q("Invalid number format: '", str, '\''));
    }

    public static boolean n0(int i11, int i12, int i13, String str, String other, boolean z11) {
        kotlin.jvm.internal.m.f(str, "<this>");
        kotlin.jvm.internal.m.f(other, "other");
        return !z11 ? str.regionMatches(i11, other, i12, i13) : str.regionMatches(z11, i11, other, i12, i13);
    }

    public static String o0(int i11, String str) {
        kotlin.jvm.internal.m.f(str, "<this>");
        if (i11 < 0) {
            throw new IllegalArgumentException(nv.p.o("Count 'n' must be non-negative, but was ", i11, '.').toString());
        }
        if (i11 == 0) {
            return BuildConfig.VERSION_NAME;
        }
        int i12 = 1;
        if (i11 == 1) {
            return str.toString();
        }
        int length = str.length();
        if (length == 0) {
            return BuildConfig.VERSION_NAME;
        }
        if (length == 1) {
            char cCharAt = str.charAt(0);
            char[] cArr = new char[i11];
            for (int i13 = 0; i13 < i11; i13++) {
                cArr[i13] = cCharAt;
            }
            return new String(cArr);
        }
        StringBuilder sb2 = new StringBuilder(str.length() * i11);
        if (1 <= i11) {
            while (true) {
                sb2.append((CharSequence) str);
                if (i12 == i11) {
                    break;
                }
                i12++;
            }
        }
        String string = sb2.toString();
        kotlin.jvm.internal.m.c(string);
        return string;
    }

    public static String p0(String str, char c11, char c12) {
        kotlin.jvm.internal.m.f(str, "<this>");
        String strReplace = str.replace(c11, c12);
        kotlin.jvm.internal.m.e(strReplace, "replace(...)");
        return strReplace;
    }

    public static String q0(String str, String oldValue, String newValue) {
        kotlin.jvm.internal.m.f(str, "<this>");
        kotlin.jvm.internal.m.f(oldValue, "oldValue");
        kotlin.jvm.internal.m.f(newValue, "newValue");
        int iF0 = q.F0(str, oldValue, 0, false);
        if (iF0 < 0) {
            return str;
        }
        int length = oldValue.length();
        int i11 = length >= 1 ? length : 1;
        int length2 = newValue.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb2 = new StringBuilder(length2);
        int i12 = 0;
        do {
            sb2.append((CharSequence) str, i12, iF0);
            sb2.append(newValue);
            i12 = iF0 + length;
            if (iF0 >= str.length()) {
                break;
            }
            iF0 = q.F0(str, oldValue, iF0 + i11, false);
        } while (iF0 > 0);
        sb2.append((CharSequence) str, i12, str.length());
        String string = sb2.toString();
        kotlin.jvm.internal.m.e(string, "toString(...)");
        return string;
    }

    public static boolean r0(int i11, String str, String prefix, boolean z11) {
        kotlin.jvm.internal.m.f(str, "<this>");
        kotlin.jvm.internal.m.f(prefix, "prefix");
        return !z11 ? str.startsWith(prefix, i11) : n0(i11, 0, prefix.length(), str, prefix, z11);
    }

    public static boolean s0(String str, String prefix, boolean z11) {
        kotlin.jvm.internal.m.f(str, "<this>");
        kotlin.jvm.internal.m.f(prefix, "prefix");
        return !z11 ? str.startsWith(prefix) : n0(0, 0, prefix.length(), str, prefix, z11);
    }

    public static Integer t0(String str) {
        boolean z11;
        int i11;
        int i12;
        kotlin.jvm.internal.m.f(str, "<this>");
        qx.p.k(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i13 = 0;
        char cCharAt = str.charAt(0);
        int i14 = -2147483647;
        if (kotlin.jvm.internal.m.h(cCharAt, 48) < 0) {
            i11 = 1;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '+') {
                z11 = false;
            } else {
                if (cCharAt != '-') {
                    return null;
                }
                i14 = Integer.MIN_VALUE;
                z11 = true;
            }
        } else {
            z11 = false;
            i11 = 0;
        }
        int i15 = -59652323;
        while (i11 < length) {
            int iDigit = Character.digit((int) str.charAt(i11), 10);
            if (iDigit < 0) {
                return null;
            }
            if ((i13 < i15 && (i15 != -59652323 || i13 < (i15 = i14 / 10))) || (i12 = i13 * 10) < i14 + iDigit) {
                return null;
            }
            i13 = i12 - iDigit;
            i11++;
        }
        return z11 ? Integer.valueOf(i13) : Integer.valueOf(-i13);
    }

    public static Long u0(String str) {
        boolean z11;
        kotlin.jvm.internal.m.f(str, "<this>");
        qx.p.k(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i11 = 0;
        char cCharAt = str.charAt(0);
        long j11 = -9223372036854775807L;
        if (kotlin.jvm.internal.m.h(cCharAt, 48) < 0) {
            z11 = true;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '+') {
                z11 = false;
                i11 = 1;
            } else {
                if (cCharAt != '-') {
                    return null;
                }
                j11 = Long.MIN_VALUE;
                i11 = 1;
            }
        } else {
            z11 = false;
        }
        long j12 = 0;
        long j13 = -256204778801521550L;
        while (i11 < length) {
            int iDigit = Character.digit((int) str.charAt(i11), 10);
            if (iDigit < 0) {
                return null;
            }
            if (j12 < j13) {
                if (j13 != -256204778801521550L) {
                    return null;
                }
                j13 = j11 / ((long) 10);
                if (j12 < j13) {
                    return null;
                }
            }
            long j14 = j12 * ((long) 10);
            long j15 = iDigit;
            if (j14 < j11 + j15) {
                return null;
            }
            j12 = j14 - j15;
            i11++;
        }
        return z11 ? Long.valueOf(j12) : Long.valueOf(-j12);
    }
}
