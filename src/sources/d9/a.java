package d9;

import b7.w;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f23287c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f23288d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f23289a = new w();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StringBuilder f23290b = new StringBuilder();

    public static String a(w wVar, StringBuilder sb2) {
        boolean z11 = false;
        sb2.setLength(0);
        int i11 = wVar.f4040b;
        int i12 = wVar.f4041c;
        while (i11 < i12 && !z11) {
            char c11 = (char) wVar.f4039a[i11];
            if ((c11 < 'A' || c11 > 'Z') && ((c11 < 'a' || c11 > 'z') && !((c11 >= '0' && c11 <= '9') || c11 == '#' || c11 == '-' || c11 == '.' || c11 == '_'))) {
                z11 = true;
            } else {
                i11++;
                sb2.append(c11);
            }
        }
        wVar.J(i11 - wVar.f4040b);
        return sb2.toString();
    }

    public static String b(w wVar, StringBuilder sb2) {
        c(wVar);
        if (wVar.a() == 0) {
            return null;
        }
        String strA = a(wVar, sb2);
        if (!strA.isEmpty()) {
            return strA;
        }
        return BuildConfig.VERSION_NAME + ((char) wVar.w());
    }

    public static void c(w wVar) {
        while (true) {
            for (boolean z11 = true; wVar.a() > 0 && z11; z11 = false) {
                int i11 = wVar.f4040b;
                byte[] bArr = wVar.f4039a;
                byte b3 = bArr[i11];
                char c11 = (char) b3;
                if (c11 == '\t' || c11 == '\n' || c11 == '\f' || c11 == '\r' || c11 == ' ') {
                    wVar.J(1);
                } else {
                    int i12 = wVar.f4041c;
                    int i13 = i11 + 2;
                    if (i13 <= i12) {
                        int i14 = i11 + 1;
                        if (b3 == 47 && bArr[i14] == 42) {
                            while (true) {
                                int i15 = i13 + 1;
                                if (i15 >= i12) {
                                    break;
                                }
                                if (((char) bArr[i13]) == '*' && ((char) bArr[i15]) == '/') {
                                    i13 += 2;
                                    i12 = i13;
                                } else {
                                    i13 = i15;
                                }
                            }
                            wVar.J(i12 - wVar.f4040b);
                        }
                    }
                }
            }
            return;
        }
    }
}
