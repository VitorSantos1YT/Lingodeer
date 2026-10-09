package okhttp3;

import com.adjust.sdk.Constants;
import com.lingo.lingoskill.ui.base.ENO.MzwEyWCkjXL;
import com.tbruyelle.rxpermissions3.BuildConfig;
import dt.Xk.wuoM;
import hh.p0;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.jvm.internal.m;
import lz.e;
import ns.o;
import nv.p;
import okhttp3.internal._HostnamesCommonKt;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal.url._UrlKt;
import oz.q;
import oz.x;
import ry.n;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class HttpUrl {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Companion f45044j = new Companion(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f45045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f45046b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f45047c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f45048d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f45049e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f45050f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f45051g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f45052h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f45053i;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f45054a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f45057d;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public ArrayList f45060g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public String f45061h;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f45055b = BuildConfig.VERSION_NAME;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f45056c = BuildConfig.VERSION_NAME;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f45058e = -1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final ArrayList f45059f = o.M(BuildConfig.VERSION_NAME);

        public static ArrayList c(String str) {
            ArrayList arrayList = new ArrayList();
            int i11 = 0;
            while (i11 <= str.length()) {
                int iH0 = q.H0(str, '&', i11, 4);
                if (iH0 == -1) {
                    iH0 = str.length();
                }
                int iH1 = q.H0(str, '=', i11, 4);
                if (iH1 == -1 || iH1 > iH0) {
                    String strSubstring = str.substring(i11, iH0);
                    m.e(strSubstring, "substring(...)");
                    arrayList.add(strSubstring);
                    arrayList.add(null);
                } else {
                    String strSubstring2 = str.substring(i11, iH1);
                    m.e(strSubstring2, "substring(...)");
                    arrayList.add(strSubstring2);
                    String strSubstring3 = str.substring(iH1 + 1, iH0);
                    m.e(strSubstring3, "substring(...)");
                    arrayList.add(strSubstring3);
                }
                i11 = iH0 + 1;
            }
            return arrayList;
        }

        public final HttpUrl a() {
            ArrayList arrayList;
            String str = this.f45054a;
            if (str == null) {
                throw new IllegalStateException("scheme == null");
            }
            String strD = _UrlKt.d(this.f45055b, 0, 0, 7);
            String strD2 = _UrlKt.d(this.f45056c, 0, 0, 7);
            String str2 = this.f45057d;
            if (str2 == null) {
                throw new IllegalStateException("host == null");
            }
            int iB = this.f45058e;
            if (iB == -1) {
                Companion companion = HttpUrl.f45044j;
                String str3 = this.f45054a;
                m.c(str3);
                companion.getClass();
                iB = Companion.b(str3);
            }
            ArrayList arrayList2 = this.f45059f;
            ArrayList arrayList3 = new ArrayList(n.W(arrayList2, 10));
            int size = arrayList2.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList2.get(i11);
                i11++;
                arrayList3.add(_UrlKt.d((String) obj, 0, 0, 7));
            }
            ArrayList arrayList4 = this.f45060g;
            if (arrayList4 != null) {
                arrayList = new ArrayList(n.W(arrayList4, 10));
                int size2 = arrayList4.size();
                int i12 = 0;
                while (i12 < size2) {
                    Object obj2 = arrayList4.get(i12);
                    i12++;
                    String str4 = (String) obj2;
                    arrayList.add(str4 != null ? _UrlKt.d(str4, 0, 0, 3) : null);
                }
            } else {
                arrayList = null;
            }
            String str5 = this.f45061h;
            return new HttpUrl(str, strD, strD2, str2, iB, arrayList3, arrayList, str5 != null ? _UrlKt.d(str5, 0, 0, 7) : null, toString());
        }

        /* JADX WARN: Code duplicated, block: B:4:0x002a  */
        public final void b(HttpUrl httpUrl, String input) {
            int i11;
            byte b3;
            int i12;
            int iD;
            int i13;
            char cCharAt;
            m.f(input, "input");
            byte[] bArr = _UtilCommonKt.f45202a;
            int iG = _UtilCommonKt.g(0, input.length(), input);
            int iH = _UtilCommonKt.h(iG, input.length(), input);
            byte b11 = -1;
            if (iH - iG >= 2) {
                char cCharAt2 = input.charAt(iG);
                if ((m.h(cCharAt2, 97) >= 0 && m.h(cCharAt2, 122) <= 0) || (m.h(cCharAt2, 65) >= 0 && m.h(cCharAt2, 90) <= 0)) {
                    i11 = iG + 1;
                    while (true) {
                        if (i11 < iH) {
                            char cCharAt3 = input.charAt(i11);
                            if (('a' > cCharAt3 || cCharAt3 >= '{') && (('A' > cCharAt3 || cCharAt3 >= '[') && !(('0' <= cCharAt3 && cCharAt3 < ':') || cCharAt3 == '+' || cCharAt3 == '-' || cCharAt3 == '.'))) {
                                if (cCharAt3 == ':') {
                                    break;
                                } else {
                                    break;
                                }
                            }
                            i11++;
                        }
                        i11 = -1;
                        break;
                    }
                } else {
                    i11 = -1;
                    break;
                }
            } else {
                i11 = -1;
                break;
            }
            String str = MzwEyWCkjXL.nojCLwtvdG;
            int i14 = 1;
            if (i11 != -1) {
                if (x.r0(iG, input, "https:", true)) {
                    this.f45054a = Constants.SCHEME;
                    iG += 6;
                } else {
                    if (!x.r0(iG, input, "http:", true)) {
                        StringBuilder sb2 = new StringBuilder("Expected URL scheme 'http' or 'https' but was '");
                        String strSubstring = input.substring(0, i11);
                        m.e(strSubstring, str);
                        sb2.append(strSubstring);
                        sb2.append('\'');
                        throw new IllegalArgumentException(sb2.toString());
                    }
                    this.f45054a = "http";
                    iG += 5;
                }
            } else {
                if (httpUrl == null) {
                    throw new IllegalArgumentException(ep.a.e("Expected URL scheme 'http' or 'https' but no scheme was found for ", input.length() > 6 ? q.g1(6, input).concat("...") : input));
                }
                this.f45054a = httpUrl.f45045a;
            }
            int i15 = iG;
            int i16 = 0;
            while (true) {
                b3 = 47;
                i12 = i14;
                if (i15 >= iH || !((cCharAt = input.charAt(i15)) == '/' || cCharAt == '\\')) {
                    break;
                }
                i16++;
                i15++;
                i14 = i12;
            }
            ArrayList arrayList = this.f45059f;
            byte b12 = 35;
            if (i16 >= 2 || httpUrl == null || !m.a(httpUrl.f45045a, this.f45054a)) {
                int i17 = iG + i16;
                int i18 = 0;
                int i19 = 0;
                while (true) {
                    iD = _UtilCommonKt.d(input, i17, iH, "@/\\?#");
                    byte bCharAt = iD != iH ? input.charAt(iD) : b11;
                    if (bCharAt == b11 || bCharAt == b12 || bCharAt == b3 || bCharAt == 92 || bCharAt == 63) {
                        break;
                    }
                    if (bCharAt == 64) {
                        if (i18 == 0) {
                            int iC = _UtilCommonKt.c(input, ':', i17, iD);
                            String strA = _UrlKt.a(input, i17, iC, " \"':;<=>@[]^`{}|/\\?#", 112);
                            if (i19 != 0) {
                                strA = p.u(new StringBuilder(), this.f45055b, "%40", strA);
                            }
                            this.f45055b = strA;
                            if (iC != iD) {
                                this.f45056c = _UrlKt.a(input, iC + 1, iD, " \"':;<=>@[]^`{}|/\\?#", 112);
                                i18 = i12;
                            }
                            i19 = i12;
                        } else {
                            this.f45056c += "%40" + _UrlKt.a(input, i17, iD, " \"':;<=>@[]^`{}|/\\?#", 112);
                        }
                        i17 = iD + 1;
                        b3 = 47;
                        b12 = 35;
                        b11 = -1;
                    }
                }
                int i21 = i17;
                while (true) {
                    if (i21 < iD) {
                        char cCharAt4 = input.charAt(i21);
                        if (cCharAt4 == ':') {
                            break;
                        }
                        if (cCharAt4 == '[') {
                            do {
                                i21++;
                                if (i21 >= iD) {
                                    break;
                                }
                            } while (input.charAt(i21) != ']');
                        }
                        i21++;
                    } else {
                        i21 = iD;
                        break;
                    }
                }
                int i22 = i21 + 1;
                if (i22 < iD) {
                    this.f45057d = _HostnamesCommonKt.b(_UrlKt.d(input, i17, i21, 4));
                    try {
                        i13 = Integer.parseInt(_UrlKt.a(input, i22, iD, BuildConfig.VERSION_NAME, 120));
                        if (i12 > i13 || i13 >= 65536) {
                            i13 = -1;
                        }
                    } catch (NumberFormatException unused) {
                    }
                    this.f45058e = i13;
                    if (i13 == -1) {
                        StringBuilder sb3 = new StringBuilder("Invalid URL port: \"");
                        String strSubstring2 = input.substring(i22, iD);
                        m.e(strSubstring2, str);
                        sb3.append(strSubstring2);
                        sb3.append('\"');
                        throw new IllegalArgumentException(sb3.toString().toString());
                    }
                } else {
                    this.f45057d = _HostnamesCommonKt.b(_UrlKt.d(input, i17, i21, 4));
                    Companion companion = HttpUrl.f45044j;
                    String str2 = this.f45054a;
                    m.c(str2);
                    companion.getClass();
                    this.f45058e = Companion.b(str2);
                }
                if (this.f45057d == null) {
                    StringBuilder sb4 = new StringBuilder("Invalid URL host: \"");
                    String strSubstring3 = input.substring(i17, i21);
                    m.e(strSubstring3, str);
                    sb4.append(strSubstring3);
                    sb4.append('\"');
                    throw new IllegalArgumentException(sb4.toString().toString());
                }
                iG = iD;
            } else {
                this.f45055b = httpUrl.e();
                this.f45056c = httpUrl.a();
                this.f45057d = httpUrl.f45048d;
                this.f45058e = httpUrl.f45049e;
                arrayList.clear();
                arrayList.addAll(httpUrl.c());
                if (iG == iH || input.charAt(iG) == '#') {
                    String strD = httpUrl.d();
                    this.f45060g = strD != null ? c(_UrlKt.a(strD, 0, 0, " \"'<>#", 83)) : null;
                }
            }
            int iD2 = _UtilCommonKt.d(input, iG, iH, "?#");
            if (iG != iD2) {
                char cCharAt5 = input.charAt(iG);
                if (cCharAt5 == '/' || cCharAt5 == '\\') {
                    arrayList.clear();
                    arrayList.add(BuildConfig.VERSION_NAME);
                    iG++;
                } else {
                    arrayList.set(arrayList.size() - 1, BuildConfig.VERSION_NAME);
                }
                while (iG < iD2) {
                    int iD3 = _UtilCommonKt.d(input, iG, iD2, "/\\");
                    boolean z11 = iD3 < iD2;
                    String strA2 = _UrlKt.a(input, iG, iD3, " \"<>^`{}|/\\?#", 112);
                    if (!strA2.equals(".") && !strA2.equalsIgnoreCase("%2e")) {
                        if (!strA2.equals("..") && !strA2.equalsIgnoreCase("%2e.") && !strA2.equalsIgnoreCase(".%2e") && !strA2.equalsIgnoreCase("%2e%2e")) {
                            if (((CharSequence) p.f(1, arrayList)).length() == 0) {
                                arrayList.set(arrayList.size() - 1, strA2);
                            } else {
                                arrayList.add(strA2);
                            }
                            if (z11) {
                                arrayList.add(BuildConfig.VERSION_NAME);
                            }
                        } else if (((String) p0.f(1, arrayList)).length() != 0 || arrayList.isEmpty()) {
                            arrayList.add(BuildConfig.VERSION_NAME);
                        } else {
                            arrayList.set(arrayList.size() - 1, BuildConfig.VERSION_NAME);
                        }
                    }
                    iG = z11 ? iD3 + 1 : iD3;
                }
            }
            if (iD2 < iH && input.charAt(iD2) == '?') {
                int iC2 = _UtilCommonKt.c(input, '#', iD2, iH);
                this.f45060g = c(_UrlKt.a(input, iD2 + 1, iC2, " \"'<>#", 80));
                iD2 = iC2;
            }
            if (iD2 >= iH || input.charAt(iD2) != '#') {
                return;
            }
            this.f45061h = _UrlKt.a(input, iD2 + 1, iH, BuildConfig.VERSION_NAME, 48);
        }

        /* JADX WARN: Code duplicated, block: B:32:0x008d  */
        public final String toString() {
            StringBuilder sb2 = new StringBuilder();
            String str = this.f45054a;
            if (str != null) {
                sb2.append(str);
                sb2.append(wuoM.zkjiHOvnBPpQSv);
            } else {
                sb2.append("//");
            }
            if (this.f45055b.length() > 0 || this.f45056c.length() > 0) {
                sb2.append(this.f45055b);
                if (this.f45056c.length() > 0) {
                    sb2.append(':');
                    sb2.append(this.f45056c);
                }
                sb2.append('@');
            }
            String str2 = this.f45057d;
            if (str2 != null) {
                if (q.w0(str2, ':')) {
                    sb2.append('[');
                    sb2.append(this.f45057d);
                    sb2.append(']');
                } else {
                    sb2.append(this.f45057d);
                }
            }
            int iB = this.f45058e;
            if (iB != -1 || this.f45054a != null) {
                if (iB == -1) {
                    Companion companion = HttpUrl.f45044j;
                    String str3 = this.f45054a;
                    m.c(str3);
                    companion.getClass();
                    iB = Companion.b(str3);
                }
                String str4 = this.f45054a;
                if (str4 != null) {
                    HttpUrl.f45044j.getClass();
                    if (iB != Companion.b(str4)) {
                        sb2.append(':');
                        sb2.append(iB);
                    }
                } else {
                    sb2.append(':');
                    sb2.append(iB);
                }
            }
            ArrayList arrayList = this.f45059f;
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                sb2.append('/');
                sb2.append((String) arrayList.get(i11));
            }
            if (this.f45060g != null) {
                sb2.append('?');
                Companion companion2 = HttpUrl.f45044j;
                ArrayList arrayList2 = this.f45060g;
                m.c(arrayList2);
                Companion.a(companion2, arrayList2, sb2);
            }
            if (this.f45061h != null) {
                sb2.append('#');
                sb2.append(this.f45061h);
            }
            return sb2.toString();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Companion {
        public /* synthetic */ Companion(int i11) {
            this();
        }

        public static final void a(Companion companion, List list, StringBuilder sb2) {
            companion.getClass();
            e eVarS = hz.b.S(2, hz.b.U(0, list.size()));
            int i11 = eVarS.f40532a;
            int i12 = eVarS.f40533b;
            int i13 = eVarS.f40534c;
            if ((i13 <= 0 || i11 > i12) && (i13 >= 0 || i12 > i11)) {
                return;
            }
            while (true) {
                String str = (String) list.get(i11);
                String str2 = (String) list.get(i11 + 1);
                if (i11 > 0) {
                    sb2.append('&');
                }
                sb2.append(str);
                if (str2 != null) {
                    sb2.append('=');
                    sb2.append(str2);
                }
                if (i11 == i12) {
                    return;
                } else {
                    i11 += i13;
                }
            }
        }

        public static int b(String scheme) {
            m.f(scheme, "scheme");
            if (scheme.equals("http")) {
                return 80;
            }
            return scheme.equals(Constants.SCHEME) ? 443 : -1;
        }

        public static HttpUrl c(String str) {
            m.f(str, "<this>");
            Builder builder = new Builder();
            builder.b(null, str);
            return builder.a();
        }

        private Companion() {
        }
    }

    public HttpUrl(String str, String str2, String str3, String str4, int i11, ArrayList arrayList, ArrayList arrayList2, String str5, String str6) {
        this.f45045a = str;
        this.f45046b = str2;
        this.f45047c = str3;
        this.f45048d = str4;
        this.f45049e = i11;
        this.f45050f = arrayList;
        this.f45051g = arrayList2;
        this.f45052h = str5;
        this.f45053i = str6;
    }

    public final String a() {
        if (this.f45047c.length() == 0) {
            return BuildConfig.VERSION_NAME;
        }
        int length = this.f45045a.length() + 3;
        String str = this.f45053i;
        String strSubstring = str.substring(q.H0(str, ':', length, 4) + 1, q.H0(str, '@', 0, 6));
        m.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public final String b() {
        int length = this.f45045a.length() + 3;
        String str = this.f45053i;
        int iH0 = q.H0(str, '/', length, 4);
        String strSubstring = str.substring(iH0, _UtilCommonKt.d(str, iH0, str.length(), "?#"));
        m.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public final ArrayList c() {
        int length = this.f45045a.length() + 3;
        String str = this.f45053i;
        int iH0 = q.H0(str, '/', length, 4);
        int iD = _UtilCommonKt.d(str, iH0, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (iH0 < iD) {
            int i11 = iH0 + 1;
            int iC = _UtilCommonKt.c(str, '/', i11, iD);
            String strSubstring = str.substring(i11, iC);
            m.e(strSubstring, "substring(...)");
            arrayList.add(strSubstring);
            iH0 = iC;
        }
        return arrayList;
    }

    public final String d() {
        if (this.f45051g == null) {
            return null;
        }
        String str = this.f45053i;
        int iH0 = q.H0(str, '?', 0, 6) + 1;
        String strSubstring = str.substring(iH0, _UtilCommonKt.c(str, '#', iH0, str.length()));
        m.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public final String e() {
        if (this.f45046b.length() == 0) {
            return BuildConfig.VERSION_NAME;
        }
        int length = this.f45045a.length() + 3;
        String str = this.f45053i;
        String strSubstring = str.substring(length, _UtilCommonKt.d(str, length, str.length(), ":@"));
        m.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof HttpUrl) && m.a(((HttpUrl) obj).f45053i, this.f45053i);
    }

    public final boolean f() {
        return m.a(this.f45045a, Constants.SCHEME);
    }

    public final Builder g(String link) {
        m.f(link, "link");
        try {
            Builder builder = new Builder();
            builder.b(this, link);
            return builder;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public final String h() {
        Builder builderG = g("/...");
        m.c(builderG);
        builderG.f45055b = _UrlKt.a(BuildConfig.VERSION_NAME, 0, 0, " \"':;<=>@[]^`{}|/\\?#", 123);
        builderG.f45056c = _UrlKt.a(BuildConfig.VERSION_NAME, 0, 0, " \"':;<=>@[]^`{}|/\\?#", 123);
        return builderG.a().f45053i;
    }

    public final int hashCode() {
        return this.f45053i.hashCode();
    }

    public final URI i() {
        String strSubstring;
        Builder builder = new Builder();
        String str = this.f45045a;
        builder.f45054a = str;
        builder.f45055b = e();
        builder.f45056c = a();
        builder.f45057d = this.f45048d;
        f45044j.getClass();
        int iB = Companion.b(str);
        int i11 = this.f45049e;
        if (i11 == iB) {
            i11 = -1;
        }
        builder.f45058e = i11;
        ArrayList arrayList = builder.f45059f;
        arrayList.clear();
        arrayList.addAll(c());
        String strD = d();
        builder.f45060g = strD != null ? Builder.c(_UrlKt.a(strD, 0, 0, " \"'<>#", 83)) : null;
        if (this.f45052h == null) {
            strSubstring = null;
        } else {
            String str2 = this.f45053i;
            strSubstring = str2.substring(q.H0(str2, '#', 0, 6) + 1);
            m.e(strSubstring, "substring(...)");
        }
        builder.f45061h = strSubstring;
        String str3 = builder.f45057d;
        builder.f45057d = str3 != null ? p.s("[\"<>^`{|}]", "compile(...)", str3, BuildConfig.VERSION_NAME, "replaceAll(...)") : null;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            arrayList.set(i12, _UrlKt.a((String) arrayList.get(i12), 0, 0, "[]", 99));
        }
        ArrayList arrayList2 = builder.f45060g;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i13 = 0; i13 < size2; i13++) {
                String str4 = (String) arrayList2.get(i13);
                arrayList2.set(i13, str4 != null ? _UrlKt.a(str4, 0, 0, "\\^`{|}", 67) : null);
            }
        }
        String str5 = builder.f45061h;
        builder.f45061h = str5 != null ? _UrlKt.a(str5, 0, 0, " \"#<>\\^`{|}", 35) : null;
        String input = builder.toString();
        try {
            return new URI(input);
        } catch (URISyntaxException e8) {
            try {
                Pattern patternCompile = Pattern.compile("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]");
                m.e(patternCompile, "compile(...)");
                m.f(input, "input");
                String strReplaceAll = patternCompile.matcher(input).replaceAll(BuildConfig.VERSION_NAME);
                m.e(strReplaceAll, "replaceAll(...)");
                URI uriCreate = URI.create(strReplaceAll);
                m.c(uriCreate);
                return uriCreate;
            } catch (Exception unused) {
                throw new RuntimeException(e8);
            }
        }
    }

    public final String toString() {
        return this.f45053i;
    }
}
