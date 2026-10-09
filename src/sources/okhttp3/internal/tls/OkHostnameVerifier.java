package okhttp3.internal.tls;

import hh.p0;
import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import kotlin.jvm.internal.m;
import okhttp3.internal._HostnamesCommonKt;
import oz.o;
import oz.q;
import oz.x;
import ry.r;
import w4.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class OkHostnameVerifier implements HostnameVerifier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final OkHostnameVerifier f45574a = new OkHostnameVerifier();

    private OkHostnameVerifier() {
    }

    public static List a(X509Certificate x509Certificate, int i11) {
        Object obj;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames != null) {
                ArrayList arrayList = new ArrayList();
                for (List<?> list : subjectAlternativeNames) {
                    if (list != null && list.size() >= 2 && m.a(list.get(0), Integer.valueOf(i11)) && (obj = list.get(1)) != null) {
                        arrayList.add((String) obj);
                    }
                }
                return arrayList;
            }
        } catch (CertificateParsingException unused) {
        }
        return r.f50854a;
    }

    public static boolean b(String str) {
        int i11;
        int length = str.length();
        int length2 = str.length();
        if (length2 < 0) {
            throw new IllegalArgumentException(p0.h(length2, "endIndex < beginIndex: ", " < 0").toString());
        }
        if (length2 > str.length()) {
            StringBuilder sbI = c.i(length2, "endIndex > string.length: ", " > ");
            sbI.append(str.length());
            throw new IllegalArgumentException(sbI.toString().toString());
        }
        long j11 = 0;
        int i12 = 0;
        while (i12 < length2) {
            char cCharAt = str.charAt(i12);
            if (cCharAt < 128) {
                j11++;
            } else {
                if (cCharAt < 2048) {
                    i11 = 2;
                } else if (cCharAt < 55296 || cCharAt > 57343) {
                    i11 = 3;
                } else {
                    int i13 = i12 + 1;
                    char cCharAt2 = i13 < length2 ? str.charAt(i13) : (char) 0;
                    if (cCharAt > 56319 || cCharAt2 < 56320 || cCharAt2 > 57343) {
                        j11++;
                        i12 = i13;
                    } else {
                        j11 += (long) 4;
                        i12 += 2;
                    }
                }
                j11 += (long) i11;
            }
            i12++;
        }
        return length == ((int) j11);
    }

    /* JADX WARN: Code duplicated, block: B:59:0x00f8  */
    public static boolean c(String host, X509Certificate x509Certificate) {
        boolean zA;
        int length;
        m.f(host, "host");
        o oVar = _HostnamesCommonKt.f45201a;
        if (_HostnamesCommonKt.f45201a.f(host)) {
            String strB = _HostnamesCommonKt.b(host);
            List listA = a(x509Certificate, 7);
            if (!listA.isEmpty()) {
                Iterator it = listA.iterator();
                while (it.hasNext()) {
                    if (m.a(strB, _HostnamesCommonKt.b((String) it.next()))) {
                        return true;
                    }
                }
            }
            return false;
        }
        if (b(host)) {
            Locale US = Locale.US;
            m.e(US, "US");
            host = host.toLowerCase(US);
            m.e(host, "toLowerCase(...)");
        }
        List<String> listA2 = a(x509Certificate, 2);
        if (!listA2.isEmpty()) {
            for (String lowerCase : listA2) {
                f45574a.getClass();
                if (host.length() == 0 || x.s0(host, ".", false) || x.k0(host, "..", false) || lowerCase == null || lowerCase.length() == 0 || x.s0(lowerCase, ".", false) || x.k0(lowerCase, "..", false)) {
                    zA = false;
                } else {
                    String strConcat = !x.k0(host, ".", false) ? host.concat(".") : host;
                    if (!x.k0(lowerCase, ".", false)) {
                        lowerCase = lowerCase.concat(".");
                    }
                    if (b(lowerCase)) {
                        Locale US2 = Locale.US;
                        m.e(US2, "US");
                        lowerCase = lowerCase.toLowerCase(US2);
                        m.e(lowerCase, "toLowerCase(...)");
                    }
                    if (!q.v0(lowerCase, "*", false)) {
                        zA = m.a(strConcat, lowerCase);
                    } else if (!x.s0(lowerCase, "*.", false) || q.H0(lowerCase, '*', 1, 4) != -1 || strConcat.length() < lowerCase.length() || "*.".equals(lowerCase)) {
                        zA = false;
                    } else {
                        String strSubstring = lowerCase.substring(1);
                        m.e(strSubstring, "substring(...)");
                        if (x.k0(strConcat, strSubstring, false) && ((length = strConcat.length() - strSubstring.length()) <= 0 || q.N0(strConcat, '.', length - 1, 4) == -1)) {
                            zA = true;
                        } else {
                            zA = false;
                        }
                    }
                }
                if (zA) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String host, SSLSession session) {
        m.f(host, "host");
        m.f(session, "session");
        if (b(host)) {
            try {
                Certificate certificate = session.getPeerCertificates()[0];
                m.d(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                return c(host, (X509Certificate) certificate);
            } catch (SSLException unused) {
            }
        }
        return false;
    }
}
