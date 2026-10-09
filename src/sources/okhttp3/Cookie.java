package okhttp3;

import defpackage.e;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.m;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.http.DateFormattingKt;
import oz.q;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class Cookie {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Companion f45004k = new Companion(0);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Pattern f45005l = Pattern.compile("(\\d{2,4})[^\\d]*");
    public static final Pattern m = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Pattern f45006n = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Pattern f45007o = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f45008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f45009b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f45010c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f45011d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f45012e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f45013f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f45014g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f45015h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f45016i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f45017j;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Builder {
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Companion {
        public /* synthetic */ Companion(int i11) {
            this();
        }

        public static int a(int i11, boolean z11, int i12, String str) {
            while (i11 < i12) {
                char cCharAt = str.charAt(i11);
                if (((cCharAt < ' ' && cCharAt != '\t') || cCharAt >= 127 || ('0' <= cCharAt && cCharAt < ':') || (('a' <= cCharAt && cCharAt < '{') || (('A' <= cCharAt && cCharAt < '[') || cCharAt == ':'))) == (!z11)) {
                    return i11;
                }
                i11++;
            }
            return i12;
        }

        /* JADX WARN: Code duplicated, block: B:18:0x00a2  */
        public static long b(int i11, String str) {
            int iA = a(0, false, i11, str);
            Matcher matcher = Cookie.f45007o.matcher(str);
            int i12 = -1;
            int i13 = -1;
            int i14 = -1;
            int iI0 = -1;
            int i15 = -1;
            int i16 = -1;
            while (iA < i11) {
                int iA2 = a(iA + 1, true, i11, str);
                matcher.region(iA, iA2);
                if (i13 == -1 && matcher.usePattern(Cookie.f45007o).matches()) {
                    String strGroup = matcher.group(1);
                    m.e(strGroup, "group(...)");
                    i13 = Integer.parseInt(strGroup);
                    String strGroup2 = matcher.group(2);
                    m.e(strGroup2, "group(...)");
                    i15 = Integer.parseInt(strGroup2);
                    String strGroup3 = matcher.group(3);
                    m.e(strGroup3, "group(...)");
                    i16 = Integer.parseInt(strGroup3);
                } else if (i14 == -1 && matcher.usePattern(Cookie.f45006n).matches()) {
                    String strGroup4 = matcher.group(1);
                    m.e(strGroup4, "group(...)");
                    i14 = Integer.parseInt(strGroup4);
                } else if (iI0 == -1) {
                    Pattern pattern = Cookie.m;
                    if (matcher.usePattern(pattern).matches()) {
                        String strGroup5 = matcher.group(1);
                        m.e(strGroup5, "group(...)");
                        Locale US = Locale.US;
                        m.e(US, "US");
                        String lowerCase = strGroup5.toLowerCase(US);
                        m.e(lowerCase, "toLowerCase(...)");
                        String strPattern = pattern.pattern();
                        m.e(strPattern, "pattern(...)");
                        iI0 = q.I0(strPattern, lowerCase, 0, false, 6) / 4;
                    } else if (i12 != -1 && matcher.usePattern(Cookie.f45005l).matches()) {
                        String strGroup6 = matcher.group(1);
                        m.e(strGroup6, "group(...)");
                        i12 = Integer.parseInt(strGroup6);
                    }
                } else if (i12 != -1) {
                }
                iA = a(iA2 + 1, false, i11, str);
            }
            if (70 <= i12 && i12 < 100) {
                i12 += 1900;
            }
            if (i12 >= 0 && i12 < 70) {
                i12 += 2000;
            }
            if (i12 < 1601) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (iI0 == -1) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (1 > i14 || i14 >= 32) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (i13 < 0 || i13 >= 24) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (i15 < 0 || i15 >= 60) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (i16 < 0 || i16 >= 60) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar(_UtilJvmKt.f45204a);
            gregorianCalendar.setLenient(false);
            gregorianCalendar.set(1, i12);
            gregorianCalendar.set(2, iI0 - 1);
            gregorianCalendar.set(5, i14);
            gregorianCalendar.set(11, i13);
            gregorianCalendar.set(12, i15);
            gregorianCalendar.set(13, i16);
            gregorianCalendar.set(14, 0);
            return gregorianCalendar.getTimeInMillis();
        }

        private Companion() {
        }
    }

    public Cookie(String str, String str2, long j11, String str3, String str4, boolean z11, boolean z12, boolean z13, boolean z14, String str5) {
        this.f45008a = str;
        this.f45009b = str2;
        this.f45010c = j11;
        this.f45011d = str3;
        this.f45012e = str4;
        this.f45013f = z11;
        this.f45014g = z12;
        this.f45015h = z13;
        this.f45016i = z14;
        this.f45017j = str5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Cookie)) {
            return false;
        }
        Cookie cookie = (Cookie) obj;
        return m.a(cookie.f45008a, this.f45008a) && m.a(cookie.f45009b, this.f45009b) && cookie.f45010c == this.f45010c && m.a(cookie.f45011d, this.f45011d) && m.a(cookie.f45012e, this.f45012e) && cookie.f45013f == this.f45013f && cookie.f45014g == this.f45014g && cookie.f45015h == this.f45015h && cookie.f45016i == this.f45016i && m.a(cookie.f45017j, this.f45017j);
    }

    public final int hashCode() {
        int iE = e.e(e.e(e.e(e.e(e.d(e.d(e.f(this.f45010c, e.d(e.d(527, 31, this.f45008a), 31, this.f45009b), 31), 31, this.f45011d), 31, this.f45012e), 31, this.f45013f), 31, this.f45014g), 31, this.f45015h), 31, this.f45016i);
        String str = this.f45017j;
        return iE + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f45008a);
        sb2.append('=');
        sb2.append(this.f45009b);
        if (this.f45015h) {
            long j11 = this.f45010c;
            if (j11 == Long.MIN_VALUE) {
                sb2.append("; max-age=0");
            } else {
                sb2.append("; expires=");
                String str = DateFormattingKt.f45339a.get().format(new Date(j11));
                m.e(str, "format(...)");
                sb2.append(str);
            }
        }
        if (!this.f45016i) {
            sb2.append("; domain=");
            sb2.append(this.f45011d);
        }
        sb2.append("; path=");
        sb2.append(this.f45012e);
        if (this.f45013f) {
            sb2.append("; secure");
        }
        if (this.f45014g) {
            sb2.append("; httponly");
        }
        String str2 = this.f45017j;
        if (str2 != null) {
            sb2.append("; samesite=");
            sb2.append(str2);
        }
        String string = sb2.toString();
        m.e(string, "toString(...)");
        return string;
    }
}
