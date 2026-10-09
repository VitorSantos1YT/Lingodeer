package okhttp3.internal.url;

import java.io.EOFException;
import kotlin.jvm.internal.m;
import m00.i;
import okhttp3.internal._UtilCommonKt;
import oz.q;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class _UrlKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f45575a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static String a(String str, int i11, int i12, String str2, int i13) {
        int i14 = (i13 & 1) != 0 ? 0 : i11;
        if ((i13 & 2) != 0) {
            i12 = str.length();
        }
        int i15 = i12;
        boolean z11 = (i13 & 8) == 0;
        boolean z12 = (i13 & 16) == 0;
        boolean z13 = (i13 & 32) == 0;
        boolean z14 = (i13 & 64) == 0;
        m.f(str, "<this>");
        return b(str, i14, i15, str2, z11, z12, z13, z14, 128);
    }

    public static String b(String str, int i11, int i12, String str2, boolean z11, boolean z12, boolean z13, boolean z14, int i13) throws EOFException {
        int i14 = (i13 & 1) != 0 ? 0 : i11;
        int length = (i13 & 2) != 0 ? str.length() : i12;
        boolean z15 = (i13 & 8) != 0 ? false : z11;
        boolean z16 = (i13 & 16) != 0 ? false : z12;
        boolean z17 = (i13 & 64) == 0 ? z14 : false;
        m.f(str, "<this>");
        int iCharCount = i14;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            int i15 = 128;
            if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && !z17) || q.w0(str2, (char) iCodePointAt) || ((iCodePointAt == 37 && (!z15 || (z16 && !c(iCharCount, length, str)))) || (iCodePointAt == 43 && z13)))) {
                i iVar = new i();
                iVar.W(i14, iCharCount, str);
                i iVar2 = null;
                while (iCharCount < length) {
                    int iCodePointAt2 = str.codePointAt(iCharCount);
                    if (!z15 || (iCodePointAt2 != 9 && iCodePointAt2 != 10 && iCodePointAt2 != 12 && iCodePointAt2 != 13)) {
                        if (iCodePointAt2 == 32 && str2 == " !\"#$&'()+,/:;<=>?@[\\]^`{|}~") {
                            iVar.Y("+");
                        } else if (iCodePointAt2 == 43 && z13) {
                            iVar.Y(z15 ? "+" : "%2B");
                        } else if (iCodePointAt2 < 32 || iCodePointAt2 == 127 || ((iCodePointAt2 >= i15 && !z17) || q.w0(str2, (char) iCodePointAt2) || (iCodePointAt2 == 37 && (!z15 || (z16 && !c(iCharCount, length, str)))))) {
                            if (iVar2 == null) {
                                iVar2 = new i();
                            }
                            iVar2.Z(iCodePointAt2);
                            while (!iVar2.R()) {
                                byte b3 = iVar2.readByte();
                                iVar.J(37);
                                char[] cArr = f45575a;
                                iVar.J(cArr[((b3 & 255) >> 4) & 15]);
                                iVar.J(cArr[b3 & 15]);
                            }
                        } else {
                            iVar.Z(iCodePointAt2);
                        }
                    }
                    iCharCount += Character.charCount(iCodePointAt2);
                    i15 = 128;
                }
                return iVar.B();
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        String strSubstring = str.substring(i14, length);
        m.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final boolean c(int i11, int i12, String str) {
        m.f(str, "<this>");
        int i13 = i11 + 2;
        return i13 < i12 && str.charAt(i11) == '%' && _UtilCommonKt.k(str.charAt(i11 + 1)) != -1 && _UtilCommonKt.k(str.charAt(i13)) != -1;
    }

    public static String d(String str, int i11, int i12, int i13) {
        int i14;
        if ((i13 & 1) != 0) {
            i11 = 0;
        }
        if ((i13 & 2) != 0) {
            i12 = str.length();
        }
        boolean z11 = (i13 & 4) == 0;
        m.f(str, "<this>");
        int iCharCount = i11;
        while (iCharCount < i12) {
            char cCharAt = str.charAt(iCharCount);
            if (cCharAt == '%' || (cCharAt == '+' && z11)) {
                i iVar = new i();
                iVar.W(i11, iCharCount, str);
                while (iCharCount < i12) {
                    int iCodePointAt = str.codePointAt(iCharCount);
                    if (iCodePointAt == 37 && (i14 = iCharCount + 2) < i12) {
                        int iK = _UtilCommonKt.k(str.charAt(iCharCount + 1));
                        int iK2 = _UtilCommonKt.k(str.charAt(i14));
                        if (iK == -1 || iK2 == -1) {
                            iVar.Z(iCodePointAt);
                            iCharCount += Character.charCount(iCodePointAt);
                        } else {
                            iVar.J((iK << 4) + iK2);
                            iCharCount = Character.charCount(iCodePointAt) + i14;
                        }
                    } else if (iCodePointAt == 43 && z11) {
                        iVar.J(32);
                        iCharCount++;
                    } else {
                        iVar.Z(iCodePointAt);
                        iCharCount += Character.charCount(iCodePointAt);
                    }
                }
                return iVar.B();
            }
            iCharCount++;
        }
        String strSubstring = str.substring(i11, i12);
        m.e(strSubstring, "substring(...)");
        return strSubstring;
    }
}
