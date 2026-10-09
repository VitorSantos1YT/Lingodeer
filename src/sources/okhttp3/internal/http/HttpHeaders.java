package okhttp3.internal.http;

import com.tbruyelle.rxpermissions3.BuildConfig;
import ep.a;
import fr.p3;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.jvm.internal.m;
import m00.i;
import m00.l;
import okhttp3.Challenge;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Response;
import okhttp3.internal._HostnamesCommonKt;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import oz.o;
import oz.q;
import oz.x;
import ry.r;
import ry.s;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class HttpHeaders {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f45342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l f45343b;

    static {
        l lVar = l.f40723d;
        f45342a = p3.l("\"\\");
        f45343b = p3.l("\t ,=");
    }

    public static final boolean a(Response response) {
        if (m.a(response.f45158a.f45135b, "HEAD")) {
            return false;
        }
        int i11 = response.f45161d;
        if (((i11 < 100 || i11 >= 200) && i11 != 204 && i11 != 304) || _UtilJvmKt.e(response) != -1) {
            return true;
        }
        String strB = response.f45163f.b("Transfer-Encoding");
        if (strB == null) {
            strB = null;
        }
        return "chunked".equalsIgnoreCase(strB);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0082  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:76:0x0106 A[EDGE_INSN: B:76:0x0106->B:64:0x0106 BREAK  A[LOOP:2: B:22:0x006f->B:63:0x0103], SYNTHETIC] */
    public static final void b(i iVar, ArrayList arrayList) throws EOFException {
        String strC;
        while (true) {
            String strC2 = null;
            while (true) {
                if (strC2 == null) {
                    e(iVar);
                    strC2 = c(iVar);
                    if (strC2 == null) {
                        return;
                    }
                }
                boolean zE = e(iVar);
                String strC3 = c(iVar);
                if (strC3 == null) {
                    if (iVar.R()) {
                        arrayList.add(new Challenge(strC2, s.f50855a));
                        return;
                    }
                    return;
                }
                int iM = _UtilCommonKt.m(iVar);
                boolean zE2 = e(iVar);
                if (zE || !(zE2 || iVar.R())) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    int iM2 = _UtilCommonKt.m(iVar) + iM;
                    while (true) {
                        if (strC3 != null) {
                            if (iM2 != 0) {
                                break;
                                break;
                            }
                            if (iM2 <= 1) {
                                return;
                            }
                            if (iVar.R()) {
                                strC = c(iVar);
                            } else {
                                strC = c(iVar);
                            }
                            if (strC != null) {
                                return;
                            }
                            if (e(iVar)) {
                            }
                            strC3 = null;
                        } else {
                            strC3 = c(iVar);
                            if (!e(iVar)) {
                                iM2 = _UtilCommonKt.m(iVar);
                                if (iM2 != 0) {
                                    break;
                                }
                                if (iM2 <= 1 || e(iVar)) {
                                    return;
                                }
                                if (iVar.R() || iVar.h(0L) != 34) {
                                    strC = c(iVar);
                                } else {
                                    if (iVar.readByte() != 34) {
                                        throw new IllegalArgumentException("Failed requirement.");
                                    }
                                    i iVar2 = new i();
                                    while (true) {
                                        long jP = iVar.p(f45342a);
                                        if (jP != -1) {
                                            if (iVar.h(jP) == 34) {
                                                iVar2.K0(iVar, jP);
                                                iVar.readByte();
                                                strC = iVar2.B();
                                                break;
                                            } else if (iVar.f40718b != jP + 1) {
                                                iVar2.K0(iVar, jP);
                                                iVar.readByte();
                                                iVar2.K0(iVar, 1L);
                                            }
                                        }
                                        strC = null;
                                        break;
                                    }
                                }
                                if (strC != null || ((String) linkedHashMap.put(strC3, strC)) != null) {
                                    return;
                                }
                                if (e(iVar) && !iVar.R()) {
                                    return;
                                } else {
                                    strC3 = null;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    arrayList.add(new Challenge(strC2, linkedHashMap));
                    strC2 = strC3;
                } else {
                    StringBuilder sbN = a.n(strC3);
                    sbN.append(x.o0(iM, "="));
                    Map mapSingletonMap = Collections.singletonMap(null, sbN.toString());
                    m.e(mapSingletonMap, "singletonMap(...)");
                    arrayList.add(new Challenge(strC2, mapSingletonMap));
                }
            }
        }
    }

    public static final String c(i iVar) {
        long jP = iVar.p(f45343b);
        if (jP == -1) {
            jP = iVar.f40718b;
        }
        if (jP != 0) {
            return iVar.A(jP, oz.a.f46133a);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00a7  */
    public static final void d(CookieJar cookieJar, HttpUrl url, Headers headers) {
        List listUnmodifiableList;
        List listUnmodifiableList2;
        r rVar;
        Cookie cookie;
        int i11;
        long j11;
        Cookie cookie2;
        m.f(cookieJar, "<this>");
        m.f(url, "url");
        m.f(headers, "headers");
        if (cookieJar == CookieJar.f45018a) {
            return;
        }
        Cookie.f45004k.getClass();
        int size = headers.size();
        int i12 = 0;
        ArrayList arrayList = null;
        for (int i13 = 0; i13 < size; i13++) {
            if ("Set-Cookie".equalsIgnoreCase(headers.d(i13))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(headers.g(i13));
            }
        }
        if (arrayList != null) {
            listUnmodifiableList = Collections.unmodifiableList(arrayList);
            m.e(listUnmodifiableList, "unmodifiableList(...)");
        } else {
            listUnmodifiableList = null;
        }
        r rVar2 = r.f50854a;
        List list = listUnmodifiableList == null ? rVar2 : listUnmodifiableList;
        int size2 = list.size();
        int i14 = 0;
        ArrayList arrayList2 = null;
        while (i14 < size2) {
            String setCookie = (String) list.get(i14);
            m.f(setCookie, "setCookie");
            long jCurrentTimeMillis = System.currentTimeMillis();
            byte[] bArr = _UtilCommonKt.f45202a;
            char c11 = ';';
            int iC = _UtilCommonKt.c(setCookie, ';', i12, setCookie.length());
            int iC2 = _UtilCommonKt.c(setCookie, '=', i12, iC);
            if (iC2 == iC) {
                rVar = rVar2;
                list = list;
                cookie = null;
                i11 = 0;
            } else {
                String strO = _UtilCommonKt.o(i12, iC2, setCookie);
                if (strO.length() != 0 && _UtilCommonKt.f(strO) == -1) {
                    String strO2 = _UtilCommonKt.o(iC2 + 1, iC, setCookie);
                    if (_UtilCommonKt.f(strO2) == -1) {
                        int i15 = iC + 1;
                        int length = setCookie.length();
                        long j12 = -1;
                        long jB = 253402300799999L;
                        String str = null;
                        String str2 = null;
                        boolean z11 = false;
                        boolean z12 = true;
                        boolean z13 = false;
                        String str3 = null;
                        boolean z14 = false;
                        while (true) {
                            long j13 = Long.MAX_VALUE;
                            if (i15 >= length) {
                                rVar = rVar2;
                                if (j12 == Long.MIN_VALUE) {
                                    list = list;
                                    j11 = Long.MIN_VALUE;
                                } else if (j12 != -1) {
                                    if (j12 <= 9223372036854775L) {
                                        j13 = j12 * ((long) 1000);
                                    }
                                    long j14 = jCurrentTimeMillis + j13;
                                    j11 = (j14 < jCurrentTimeMillis || j14 > 253402300799999L) ? 253402300799999L : j14;
                                } else {
                                    list = list;
                                    j11 = jB;
                                }
                                String str4 = url.f45048d;
                                if (str2 != null) {
                                    if (!m.a(str4, str2)) {
                                        if (x.k0(str4, str2, false) && str4.charAt((str4.length() - str2.length()) - 1) == '.') {
                                            o oVar = _HostnamesCommonKt.f45201a;
                                            if (!_HostnamesCommonKt.f45201a.f(str4)) {
                                            }
                                        }
                                        i11 = 0;
                                        cookie2 = null;
                                    }
                                    cookie = cookie2;
                                    break;
                                }
                                str2 = str4;
                                if (str4.length() != str2.length()) {
                                    PublicSuffixDatabase.f45561b.getClass();
                                    if (PublicSuffixDatabase.f45564e.a(str2) == null) {
                                        i11 = 0;
                                        cookie2 = null;
                                    }
                                    cookie = cookie2;
                                    break;
                                }
                                String strSubstring = "/";
                                i11 = 0;
                                if (str == null || !x.s0(str, "/", false)) {
                                    String strB = url.b();
                                    int iN0 = q.N0(strB, '/', 0, 6);
                                    if (iN0 != 0) {
                                        strSubstring = strB.substring(0, iN0);
                                        m.e(strSubstring, "substring(...)");
                                    }
                                    str = strSubstring;
                                }
                                cookie2 = new Cookie(strO, strO2, j11, str2, str, z14, z11, z13, z12, str3);
                                cookie = cookie2;
                                break;
                            }
                            r rVar3 = rVar2;
                            int iC3 = _UtilCommonKt.c(setCookie, c11, i15, length);
                            int i16 = length;
                            int iC4 = _UtilCommonKt.c(setCookie, '=', i15, iC3);
                            String strO3 = _UtilCommonKt.o(i15, iC4, setCookie);
                            String strO4 = iC4 < iC3 ? _UtilCommonKt.o(iC4 + 1, iC3, setCookie) : BuildConfig.VERSION_NAME;
                            if (strO3.equalsIgnoreCase("expires")) {
                                try {
                                    jB = Cookie.Companion.b(strO4.length(), strO4);
                                    z13 = true;
                                } catch (NumberFormatException | IllegalArgumentException unused) {
                                }
                            } else if (strO3.equalsIgnoreCase("max-age")) {
                                try {
                                    j12 = Long.parseLong(strO4);
                                    if (j12 <= 0) {
                                        j12 = Long.MIN_VALUE;
                                    }
                                } catch (NumberFormatException e8) {
                                    Pattern patternCompile = Pattern.compile("-?\\d+");
                                    m.e(patternCompile, "compile(...)");
                                    if (!patternCompile.matcher(strO4).matches()) {
                                        throw e8;
                                    }
                                    j12 = x.s0(strO4, "-", false) ? Long.MIN_VALUE : Long.MAX_VALUE;
                                }
                                z13 = true;
                            } else if (strO3.equalsIgnoreCase("domain")) {
                                if (x.k0(strO4, ".", false)) {
                                    throw new IllegalArgumentException("Failed requirement.");
                                }
                                String strB2 = _HostnamesCommonKt.b(q.R0(strO4, "."));
                                if (strB2 == null) {
                                    throw new IllegalArgumentException();
                                }
                                str2 = strB2;
                                z12 = false;
                            } else if (strO3.equalsIgnoreCase("path")) {
                                str = strO4;
                            } else if (strO3.equalsIgnoreCase("secure")) {
                                z14 = true;
                            } else if (strO3.equalsIgnoreCase("httponly")) {
                                z11 = true;
                            } else if (strO3.equalsIgnoreCase("samesite")) {
                                str3 = strO4;
                            }
                            i15 = iC3 + 1;
                            length = i16;
                            rVar2 = rVar3;
                            c11 = ';';
                        }
                    } else {
                        rVar = rVar2;
                        list = list;
                        cookie = null;
                        i11 = 0;
                    }
                } else {
                    rVar = rVar2;
                    list = list;
                    cookie = null;
                    i11 = 0;
                }
            }
            if (cookie != null) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                arrayList2.add(cookie);
            }
            i14++;
            list = list;
            i12 = i11;
            rVar2 = rVar;
        }
        r rVar4 = rVar2;
        if (arrayList2 != null) {
            listUnmodifiableList2 = Collections.unmodifiableList(arrayList2);
            m.e(listUnmodifiableList2, "unmodifiableList(...)");
        } else {
            listUnmodifiableList2 = null;
        }
        List list2 = listUnmodifiableList2 == null ? rVar4 : listUnmodifiableList2;
        if (list2.isEmpty()) {
            return;
        }
        cookieJar.a(url, list2);
    }

    public static final boolean e(i iVar) throws EOFException {
        boolean z11 = false;
        while (!iVar.R()) {
            byte bH = iVar.h(0L);
            if (bH != 44) {
                if (bH != 32 && bH != 9) {
                    break;
                }
                iVar.readByte();
            } else {
                iVar.readByte();
                z11 = true;
            }
        }
        return z11;
    }
}
