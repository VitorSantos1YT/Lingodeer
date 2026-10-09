package io.grpc.okhttp.internal;

import com.tbruyelle.rxpermissions3.BuildConfig;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class e implements HostnameVerifier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f34521a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f34522b = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    public static List a(X509Certificate x509Certificate, int i11) {
        Integer num;
        String str;
        ArrayList arrayList = new ArrayList();
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return Collections.EMPTY_LIST;
            }
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && (num = (Integer) list.get(0)) != null && num.intValue() == i11 && (str = (String) list.get(1)) != null) {
                    arrayList.add(str);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return Collections.EMPTY_LIST;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [int] */
    /* JADX WARN: Type inference failed for: r12v8 */
    public static boolean b(String str, X509Certificate x509Certificate) {
        boolean z11;
        boolean z12;
        String str2;
        char[] cArr;
        char c11;
        int i11;
        char c12;
        boolean z13 = false;
        boolean z14 = true;
        if (f34522b.matcher(str).matches()) {
            List listA = a(x509Certificate, 7);
            int size = listA.size();
            for (int i12 = 0; i12 < size; i12++) {
                if (str.equalsIgnoreCase((String) listA.get(i12))) {
                    return true;
                }
            }
            return false;
        }
        String lowerCase = str.toLowerCase(Locale.US);
        char c13 = 2;
        List listA2 = a(x509Certificate, 2);
        int size2 = listA2.size();
        int i13 = 0;
        boolean z15 = false;
        while (i13 < size2) {
            if (c(lowerCase, (String) listA2.get(i13))) {
                return true;
            }
            i13++;
            z15 = true;
        }
        if (!z15) {
            d dVar = new d(x509Certificate.getSubjectX500Principal());
            dVar.f34516c = 0;
            dVar.f34517d = 0;
            dVar.f34518e = 0;
            dVar.f34519f = 0;
            String str3 = dVar.f34514a;
            dVar.f34520g = str3.toCharArray();
            String strC = dVar.c();
            String str4 = null;
            if (strC == null) {
                z11 = z13;
            } else {
                while (true) {
                    int i14 = dVar.f34516c;
                    int i15 = dVar.f34515b;
                    if (i14 == i15) {
                        break;
                    }
                    char c14 = dVar.f34520g[i14];
                    char c15 = c13;
                    z11 = z13;
                    if (c14 == '\"') {
                        z12 = z14;
                        int i16 = i14 + 1;
                        dVar.f34516c = i16;
                        dVar.f34517d = i16;
                        dVar.f34518e = i16;
                        while (true) {
                            int i17 = dVar.f34516c;
                            if (i17 == i15) {
                                throw new IllegalStateException("Unexpected end of DN: ".concat(str3));
                            }
                            char[] cArr2 = dVar.f34520g;
                            char c16 = cArr2[i17];
                            if (c16 == '\"') {
                                dVar.f34516c = i17 + 1;
                                while (true) {
                                    int i18 = dVar.f34516c;
                                    if (i18 >= i15 || dVar.f34520g[i18] != ' ') {
                                        break;
                                    }
                                    dVar.f34516c = i18 + 1;
                                }
                                char[] cArr3 = dVar.f34520g;
                                int i19 = dVar.f34517d;
                                str2 = new String(cArr3, i19, dVar.f34518e - i19);
                                break;
                            }
                            if (c16 == '\\') {
                                cArr2[dVar.f34518e] = dVar.b();
                            } else {
                                cArr2[dVar.f34518e] = c16;
                            }
                            dVar.f34516c++;
                            dVar.f34518e++;
                        }
                    } else if (c14 == '#') {
                        z12 = z14;
                        if (i14 + 4 >= i15) {
                            throw new IllegalStateException("Unexpected end of DN: ".concat(str3));
                        }
                        dVar.f34517d = i14;
                        dVar.f34516c = i14 + 1;
                        while (true) {
                            int i21 = dVar.f34516c;
                            if (i21 == i15 || (c11 = (cArr = dVar.f34520g)[i21]) == '+' || c11 == ',' || c11 == ';') {
                                dVar.f34518e = i21;
                                break;
                            }
                            if (c11 == ' ') {
                                dVar.f34518e = i21;
                                dVar.f34516c = i21 + 1;
                                while (true) {
                                    int i22 = dVar.f34516c;
                                    if (i22 >= i15 || dVar.f34520g[i22] != ' ') {
                                        break;
                                    }
                                    dVar.f34516c = i22 + 1;
                                }
                            } else {
                                if (c11 >= 'A' && c11 <= 'F') {
                                    cArr[i21] = (char) (c11 + ' ');
                                }
                                dVar.f34516c = i21 + 1;
                            }
                        }
                        int i23 = dVar.f34518e;
                        int i24 = dVar.f34517d;
                        int i25 = i23 - i24;
                        if (i25 < 5 || (i25 & 1) == 0) {
                            throw new IllegalStateException("Unexpected end of DN: ".concat(str3));
                        }
                        int i26 = i25 / 2;
                        byte[] bArr = new byte[i26];
                        int i27 = i24 + 1;
                        for (?? r12 = z11; r12 < i26; r12++) {
                            bArr[r12] = (byte) dVar.a(i27);
                            i27 += 2;
                        }
                        str2 = new String(dVar.f34520g, dVar.f34517d, i25);
                    } else if (c14 == '+' || c14 == ',' || c14 == ';') {
                        z12 = z14;
                        str2 = BuildConfig.VERSION_NAME;
                    } else {
                        dVar.f34517d = i14;
                        dVar.f34518e = i14;
                        while (true) {
                            int i28 = dVar.f34516c;
                            if (i28 >= i15) {
                                char[] cArr4 = dVar.f34520g;
                                int i29 = dVar.f34517d;
                                str2 = new String(cArr4, i29, dVar.f34518e - i29);
                                z12 = z14;
                            } else {
                                char[] cArr5 = dVar.f34520g;
                                char c17 = cArr5[i28];
                                if (c17 != ' ') {
                                    if (c17 != ';') {
                                        if (c17 == '\\') {
                                            z12 = z14;
                                            int i30 = dVar.f34518e;
                                            dVar.f34518e = i30 + 1;
                                            cArr5[i30] = dVar.b();
                                            dVar.f34516c++;
                                        } else if (c17 != '+' && c17 != ',') {
                                            int i31 = dVar.f34518e;
                                            z12 = z14;
                                            dVar.f34518e = i31 + 1;
                                            cArr5[i31] = c17;
                                            dVar.f34516c = i28 + 1;
                                        }
                                        z14 = z12;
                                    }
                                    z12 = z14;
                                    int i32 = dVar.f34517d;
                                    str2 = new String(cArr5, i32, dVar.f34518e - i32);
                                } else {
                                    z12 = z14;
                                    int i33 = dVar.f34518e;
                                    dVar.f34519f = i33;
                                    dVar.f34516c = i28 + 1;
                                    dVar.f34518e = i33 + 1;
                                    cArr5[i33] = ' ';
                                    while (true) {
                                        i11 = dVar.f34516c;
                                        if (i11 >= i15) {
                                            break;
                                        }
                                        char[] cArr6 = dVar.f34520g;
                                        if (cArr6[i11] != ' ') {
                                            break;
                                        }
                                        int i34 = dVar.f34518e;
                                        dVar.f34518e = i34 + 1;
                                        cArr6[i34] = ' ';
                                        dVar.f34516c = i11 + 1;
                                    }
                                    if (i11 == i15 || (c12 = dVar.f34520g[i11]) == ',' || c12 == '+' || c12 == ';') {
                                        char[] cArr7 = dVar.f34520g;
                                        int i35 = dVar.f34517d;
                                        str2 = new String(cArr7, i35, dVar.f34519f - i35);
                                    } else {
                                        z14 = z12;
                                    }
                                }
                            }
                        }
                    }
                    if ("cn".equalsIgnoreCase(strC)) {
                        str4 = str2;
                    } else {
                        int i36 = dVar.f34516c;
                        if (i36 < i15) {
                            char c18 = dVar.f34520g[i36];
                            if (c18 != ',' && c18 != ';' && c18 != '+') {
                                throw new IllegalStateException("Malformed DN: ".concat(str3));
                            }
                            dVar.f34516c = i36 + 1;
                            strC = dVar.c();
                            if (strC == null) {
                                throw new IllegalStateException("Malformed DN: ".concat(str3));
                            }
                            c13 = c15;
                            z13 = z11;
                            z14 = z12;
                        }
                    }
                }
                z11 = z13;
            }
            return str4 != null ? c(lowerCase, str4) : z11;
        }
        return false;
    }

    public static boolean c(String str, String str2) {
        if (str == null || str.length() == 0 || str.startsWith(".") || str.endsWith("..") || str2 == null || str2.length() == 0 || str2.startsWith(".") || str2.endsWith("..")) {
            return false;
        }
        if (!str.endsWith(".")) {
            str = str.concat(".");
        }
        if (!str2.endsWith(".")) {
            str2 = str2.concat(".");
        }
        String lowerCase = str2.toLowerCase(Locale.US);
        if (!lowerCase.contains("*")) {
            return str.equals(lowerCase);
        }
        if (!lowerCase.startsWith("*.") || lowerCase.indexOf(42, 1) != -1 || str.length() < lowerCase.length() || "*.".equals(lowerCase)) {
            return false;
        }
        String strSubstring = lowerCase.substring(1);
        if (!str.endsWith(strSubstring)) {
            return false;
        }
        int length = str.length() - strSubstring.length();
        return length <= 0 || str.lastIndexOf(46, length - 1) == -1;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        try {
            return b(str, (X509Certificate) sSLSession.getPeerCertificates()[0]);
        } catch (SSLException unused) {
            return false;
        }
    }
}
