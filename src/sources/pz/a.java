package pz;

import com.google.android.gms.measurement.zfxB.ypOOxsaJG;
import kotlin.jvm.internal.m;
import oz.q;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f47218b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f47219c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f47220d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f47221a;

    static {
        int i11 = b.f47222a;
        f47218b = f.e(4611686018427387903L);
        f47219c = f.e(-4611686018427387903L);
    }

    public static final long a(long j11, long j12) {
        long j13 = 1000000;
        long j14 = j12 / j13;
        long j15 = j11 + j14;
        if (-4611686018426L > j15 || j15 >= 4611686018427L) {
            return f.e(hz.b.n(j15, -4611686018427387903L, 4611686018427387903L));
        }
        return f.g((j15 * j13) + (j12 - (j14 * j13)));
    }

    public static final void b(StringBuilder sb2, int i11, int i12, int i13, String str, boolean z11) {
        sb2.append(i11);
        if (i12 != 0) {
            sb2.append('.');
            String strP0 = q.P0(i13, String.valueOf(i12));
            int i14 = -1;
            int length = strP0.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i15 = length - 1;
                    if (strP0.charAt(length) != '0') {
                        i14 = length;
                        break;
                    } else if (i15 < 0) {
                        break;
                    } else {
                        length = i15;
                    }
                }
            }
            int i16 = i14 + 1;
            if (z11 || i16 >= 3) {
                sb2.append((CharSequence) strP0, 0, ((i14 + 3) / 3) * 3);
            } else {
                sb2.append((CharSequence) strP0, 0, i16);
            }
        }
        sb2.append(str);
    }

    public static int c(long j11, long j12) {
        long j13 = j11 ^ j12;
        if (j13 < 0 || (((int) j13) & 1) == 0) {
            return m.i(j11, j12);
        }
        int i11 = (((int) j11) & 1) - (((int) j12) & 1);
        return j11 < 0 ? -i11 : i11;
    }

    public static final long e(long j11) {
        return ((((int) j11) & 1) != 1 || g(j11)) ? j(j11, c.MILLISECONDS) : j11 >> 1;
    }

    public static final int f(long j11) {
        if (g(j11)) {
            return 0;
        }
        return (int) ((((int) j11) & 1) == 1 ? ((j11 >> 1) % ((long) 1000)) * ((long) 1000000) : (j11 >> 1) % ((long) 1000000000));
    }

    public static final boolean g(long j11) {
        return j11 == f47218b || j11 == f47219c;
    }

    public static final long h(long j11, long j12) {
        if (g(j11)) {
            if (!g(j12) || (j12 ^ j11) >= 0) {
                return j11;
            }
            throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
        }
        if (g(j12)) {
            return j12;
        }
        int i11 = ((int) j11) & 1;
        if (i11 != (((int) j12) & 1)) {
            return i11 == 1 ? a(j11 >> 1, j12 >> 1) : a(j12 >> 1, j11 >> 1);
        }
        long j13 = (j11 >> 1) + (j12 >> 1);
        if (i11 == 0) {
            return (-4611686018426999999L > j13 || j13 >= 4611686018427000000L) ? f.e(j13 / ((long) 1000000)) : f.g(j13);
        }
        return f.f(j13);
    }

    public static final long j(long j11, c unit) {
        m.f(unit, "unit");
        if (j11 == f47218b) {
            return Long.MAX_VALUE;
        }
        if (j11 == f47219c) {
            return Long.MIN_VALUE;
        }
        return f.c(j11 >> 1, (((int) j11) & 1) == 0 ? c.NANOSECONDS : c.MILLISECONDS, unit);
    }

    public static final long l(long j11) {
        long j12 = ((-(j11 >> 1)) << 1) + ((long) (((int) j11) & 1));
        int i11 = b.f47222a;
        return j12;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return c(this.f47221a, ((a) obj).f47221a);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.f47221a == ((a) obj).f47221a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f47221a);
    }

    public final String toString() {
        return k(this.f47221a);
    }

    public static String k(long j11) {
        if (j11 == 0) {
            return "0s";
        }
        if (j11 == f47218b) {
            return "Infinity";
        }
        if (j11 == f47219c) {
            return "-Infinity";
        }
        int i11 = 0;
        boolean z11 = j11 < 0;
        StringBuilder sb2 = new StringBuilder();
        if (z11) {
            sb2.append('-');
        }
        long jL = j11 < 0 ? l(j11) : j11;
        long j12 = j(jL, c.DAYS);
        int iJ = g(jL) ? 0 : (int) (j(jL, c.HOURS) % ((long) 24));
        int iJ2 = g(jL) ? 0 : (int) (j(jL, c.MINUTES) % ((long) 60));
        int iJ3 = g(jL) ? 0 : (int) (j(jL, c.SECONDS) % ((long) 60));
        int iF = f(jL);
        boolean z12 = j12 != 0;
        boolean z13 = iJ != 0;
        boolean z14 = iJ2 != 0;
        boolean z15 = (iJ3 == 0 && iF == 0) ? false : true;
        if (z12) {
            sb2.append(j12);
            sb2.append('d');
            i11 = 1;
        }
        if (z13 || (z12 && (z14 || z15))) {
            int i12 = i11 + 1;
            if (i11 > 0) {
                sb2.append(' ');
            }
            sb2.append(iJ);
            sb2.append('h');
            i11 = i12;
        }
        if (z14 || (z15 && (z13 || z12))) {
            int i13 = i11 + 1;
            if (i11 > 0) {
                sb2.append(' ');
            }
            sb2.append(iJ2);
            sb2.append('m');
            i11 = i13;
        }
        if (z15) {
            int i14 = i11 + 1;
            if (i11 > 0) {
                sb2.append(' ');
            }
            if (iJ3 != 0 || z12 || z13 || z14) {
                b(sb2, iJ3, iF, 9, ypOOxsaJG.ULxwEDQRJAdsPXL, false);
            } else if (iF >= 1000000) {
                b(sb2, iF / 1000000, iF % 1000000, 6, "ms", false);
            } else if (iF >= 1000) {
                b(sb2, iF / 1000, iF % 1000, 3, "us", false);
            } else {
                sb2.append(iF);
                sb2.append("ns");
            }
            i11 = i14;
        }
        if (z11 && i11 > 1) {
            sb2.insert(1, '(').append(')');
        }
        return sb2.toString();
    }
}
