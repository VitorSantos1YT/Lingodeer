package pz;

import kotlin.jvm.internal.m;
import oz.q;
import oz.x;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f47228a = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f47229b = {1, 2, 4, 5, 7, 8, 10, 11, 13, 14};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f47230c = {3, 6};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f47231d = {1, 2, 4, 5, 7, 8};

    public static final long a(String str) {
        c cVar;
        char cCharAt;
        int length = str.length();
        if (length == 0) {
            throw new IllegalArgumentException("The string is empty");
        }
        int i11 = a.f47220d;
        char cCharAt2 = str.charAt(0);
        int i12 = (cCharAt2 == '+' || cCharAt2 == '-') ? 1 : 0;
        boolean z11 = i12 > 0 && q.Y0(str, '-');
        if (length <= i12) {
            throw new IllegalArgumentException("No components");
        }
        if (str.charAt(i12) != 'P') {
            throw new IllegalArgumentException();
        }
        int i13 = i12 + 1;
        if (i13 == length) {
            throw new IllegalArgumentException();
        }
        c cVar2 = null;
        long jH = 0;
        boolean z12 = false;
        while (i13 < length) {
            if (str.charAt(i13) != 'T') {
                int i14 = i13;
                while (i14 < str.length() && (('0' <= (cCharAt = str.charAt(i14)) && cCharAt < ':') || q.w0("+-.", cCharAt))) {
                    i14++;
                }
                String strSubstring = str.substring(i13, i14);
                m.e(strSubstring, "substring(...)");
                if (strSubstring.length() == 0) {
                    throw new IllegalArgumentException();
                }
                int length2 = strSubstring.length() + i13;
                if (length2 < 0 || length2 >= str.length()) {
                    throw new IllegalArgumentException("Missing unit for value ".concat(strSubstring));
                }
                char cCharAt3 = str.charAt(length2);
                int i15 = length2 + 1;
                if (z12) {
                    if (cCharAt3 == 'H') {
                        cVar = c.HOURS;
                    } else if (cCharAt3 == 'M') {
                        cVar = c.MINUTES;
                    } else {
                        if (cCharAt3 != 'S') {
                            throw new IllegalArgumentException("Invalid duration ISO time unit: " + cCharAt3);
                        }
                        cVar = c.SECONDS;
                    }
                } else {
                    if (cCharAt3 != 'D') {
                        throw new IllegalArgumentException("Invalid or unsupported duration ISO non-time unit: " + cCharAt3);
                    }
                    cVar = c.DAYS;
                }
                if (cVar2 != null && cVar2.compareTo(cVar) <= 0) {
                    throw new IllegalArgumentException("Unexpected order of duration components");
                }
                int iH0 = q.H0(strSubstring, '.', 0, 6);
                if (cVar != c.SECONDS || iH0 <= 0) {
                    jH = a.h(jH, q(n(strSubstring), cVar));
                } else {
                    String strSubstring2 = strSubstring.substring(0, iH0);
                    m.e(strSubstring2, "substring(...)");
                    long jH2 = a.h(jH, q(n(strSubstring2), cVar));
                    String strSubstring3 = strSubstring.substring(iH0);
                    m.e(strSubstring3, "substring(...)");
                    double d5 = Double.parseDouble(strSubstring3);
                    double dB = b(d5, cVar, c.NANOSECONDS);
                    if (Double.isNaN(dB)) {
                        throw new IllegalArgumentException("Duration value cannot be NaN.");
                    }
                    long jR = hz.b.R(dB);
                    jH = a.h(jH2, (-4611686018426999999L > jR || jR >= 4611686018427000000L) ? f(hz.b.R(b(d5, cVar, c.MILLISECONDS))) : g(jR));
                }
                cVar2 = cVar;
                i13 = i15;
            } else {
                if (z12 || (i13 = i13 + 1) == length) {
                    throw new IllegalArgumentException();
                }
                z12 = true;
            }
        }
        return z11 ? a.l(jH) : jH;
    }

    public static final double b(double d5, c cVar, c targetUnit) {
        m.f(targetUnit, "targetUnit");
        long jConvert = targetUnit.a().convert(1L, cVar.a());
        return jConvert > 0 ? d5 * jConvert : d5 / cVar.a().convert(1L, targetUnit.a());
    }

    public static final long c(long j11, c sourceUnit, c targetUnit) {
        m.f(sourceUnit, "sourceUnit");
        m.f(targetUnit, "targetUnit");
        return targetUnit.a().convert(j11, sourceUnit.a());
    }

    public static final long d(long j11, c sourceUnit, c targetUnit) {
        m.f(sourceUnit, "sourceUnit");
        m.f(targetUnit, "targetUnit");
        return targetUnit.a().convert(j11, sourceUnit.a());
    }

    public static final long e(long j11) {
        long j12 = (j11 << 1) + 1;
        int i11 = a.f47220d;
        int i12 = b.f47222a;
        return j12;
    }

    public static final long f(long j11) {
        return (-4611686018426L > j11 || j11 >= 4611686018427L) ? e(hz.b.n(j11, -4611686018427387903L, 4611686018427387903L)) : g(j11 * ((long) 1000000));
    }

    public static final long g(long j11) {
        long j12 = j11 << 1;
        int i11 = a.f47220d;
        int i12 = b.f47222a;
        return j12;
    }

    public static final void h(StringBuilder sb2, StringBuilder sb3, int i11) {
        if (i11 < 10) {
            sb2.append('0');
        }
        sb3.append(i11);
    }

    public static d i(int i11, long j11) {
        long j12 = i11;
        long j13 = j12 / 1000000000;
        if ((j12 ^ 1000000000) < 0 && j13 * 1000000000 != j12) {
            j13--;
        }
        long j14 = j11 + j13;
        if ((j11 ^ j14) < 0 && (j13 ^ j11) >= 0) {
            return j11 > 0 ? d.f47224d : d.f47223c;
        }
        if (j14 < -31557014167219200L) {
            return d.f47223c;
        }
        if (j14 > 31556889864403199L) {
            return d.f47224d;
        }
        long j15 = j12 % 1000000000;
        return new d(j14, (int) (j15 + ((((j15 ^ 1000000000) & ((-j15) | j15)) >> 63) & 1000000000)));
    }

    public static final long j(long j11) {
        if (j11 < 0) {
            int i11 = a.f47220d;
            return a.f47219c;
        }
        int i12 = a.f47220d;
        return a.f47218b;
    }

    public static final g k(String str, String str2, int i11, fz.c cVar) {
        char cCharAt = str.charAt(i11);
        if (((Boolean) cVar.invoke(Character.valueOf(cCharAt))).booleanValue()) {
            return null;
        }
        return l(str, "Expected " + str2 + ", but got '" + cCharAt + "' at position " + i11);
    }

    public static final g l(String str, String str2) {
        StringBuilder sbR = defpackage.e.r(str2, " when parsing an Instant from \"");
        sbR.append(r(64, str));
        sbR.append('\"');
        return new g(sbR.toString(), str, 0);
    }

    public static final int m(int i11, String str) {
        return (str.charAt(i11 + 1) - '0') + ((str.charAt(i11) - '0') * 10);
    }

    public static final long n(String str) {
        char cCharAt;
        int length = str.length();
        int i11 = (length <= 0 || !q.w0("+-", str.charAt(0))) ? 0 : 1;
        if (length - i11 > 16) {
            int i12 = i11;
            while (true) {
                if (i11 >= length) {
                    if (length - i12 <= 16) {
                        break;
                    }
                    return str.charAt(0) == '-' ? Long.MIN_VALUE : Long.MAX_VALUE;
                }
                char cCharAt2 = str.charAt(i11);
                if (cCharAt2 == '0') {
                    if (i12 == i11) {
                        i12++;
                    }
                } else if ('1' > cCharAt2 || cCharAt2 >= ':') {
                    break;
                }
                i11++;
            }
        }
        return (!x.s0(str, "+", false) || length <= 1 || '0' > (cCharAt = str.charAt(1)) || cCharAt >= ':') ? Long.parseLong(str) : Long.parseLong(q.y0(1, str));
    }

    public static final long o(long j11, long j12, c cVar) {
        long j13 = j11 - j12;
        if (((j13 ^ j11) & (~(j13 ^ j12))) >= 0) {
            return q(j13, cVar);
        }
        c cVar2 = c.MILLISECONDS;
        if (cVar.compareTo(cVar2) >= 0) {
            return a.l(j(j13));
        }
        long jC = c(1L, cVar2, cVar);
        long j14 = (j11 / jC) - (j12 / jC);
        long j15 = (j11 % jC) - (j12 % jC);
        int i11 = a.f47220d;
        return a.h(q(j14, cVar2), q(j15, cVar));
    }

    public static final long p(int i11, c unit) {
        m.f(unit, "unit");
        return unit.compareTo(c.SECONDS) <= 0 ? g(d(i11, unit, c.NANOSECONDS)) : q(i11, unit);
    }

    public static final long q(long j11, c unit) {
        m.f(unit, "unit");
        c cVar = c.NANOSECONDS;
        long jD = d(4611686018426999999L, cVar, unit);
        return ((-jD) > j11 || j11 > jD) ? e(hz.b.n(c(j11, unit, c.MILLISECONDS), -4611686018427387903L, 4611686018427387903L)) : g(d(j11, unit, cVar));
    }

    public static final String r(int i11, String str) {
        if (str.length() <= i11) {
            return str.toString();
        }
        return str.subSequence(0, i11).toString() + "...";
    }
}
