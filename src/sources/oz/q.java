package oz;

import am.rVFB.LwKl;
import com.google.android.gms.measurement.zfxB.ypOOxsaJG;
import com.tbruyelle.rxpermissions3.BuildConfig;
import hh.p0;
import iv.w0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class q extends x {
    public static boolean A0(CharSequence charSequence, char c11) {
        kotlin.jvm.internal.m.f(charSequence, "<this>");
        return charSequence.length() > 0 && qx.p.n(charSequence.charAt(E0(charSequence)), c11, false);
    }

    public static boolean B0(CharSequence charSequence, String str) {
        kotlin.jvm.internal.m.f(charSequence, "<this>");
        return charSequence instanceof String ? x.k0((String) charSequence, str, false) : Q0(charSequence, charSequence.length() - str.length(), str, 0, str.length(), false);
    }

    public static char C0(String str) {
        kotlin.jvm.internal.m.f(str, "<this>");
        if (str.length() != 0) {
            return str.charAt(0);
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    public static lz.g D0(CharSequence charSequence) {
        kotlin.jvm.internal.m.f(charSequence, "<this>");
        return new lz.g(0, charSequence.length() - 1, 1);
    }

    public static int E0(CharSequence charSequence) {
        kotlin.jvm.internal.m.f(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static int F0(CharSequence charSequence, String string, int i11, boolean z11) {
        kotlin.jvm.internal.m.f(charSequence, "<this>");
        kotlin.jvm.internal.m.f(string, "string");
        return (z11 || !(charSequence instanceof String)) ? G0(charSequence, string, i11, charSequence.length(), z11, false) : ((String) charSequence).indexOf(string, i11);
    }

    public static final int G0(CharSequence charSequence, CharSequence charSequence2, int i11, int i12, boolean z11, boolean z12) {
        lz.e eVar;
        if (z12) {
            int iE0 = E0(charSequence);
            if (i11 > iE0) {
                i11 = iE0;
            }
            if (i12 < 0) {
                i12 = 0;
            }
            eVar = new lz.e(i11, i12, -1);
        } else {
            if (i11 < 0) {
                i11 = 0;
            }
            int length = charSequence.length();
            if (i12 > length) {
                i12 = length;
            }
            eVar = new lz.g(i11, i12, 1);
        }
        boolean z13 = charSequence instanceof String;
        int i13 = eVar.f40534c;
        int i14 = eVar.f40533b;
        int i15 = eVar.f40532a;
        if (!z13 || !(charSequence2 instanceof String)) {
            boolean z14 = z11;
            if ((i13 > 0 && i15 <= i14) || (i13 < 0 && i14 <= i15)) {
                while (true) {
                    CharSequence charSequence3 = charSequence;
                    CharSequence charSequence4 = charSequence2;
                    boolean z15 = z14;
                    z14 = z15;
                    if (Q0(charSequence4, 0, charSequence3, i15, charSequence2.length(), z15)) {
                        return i15;
                    }
                    if (i15 != i14) {
                        i15 += i13;
                        charSequence2 = charSequence4;
                        charSequence = charSequence3;
                    }
                }
            }
        } else if ((i13 > 0 && i15 <= i14) || (i13 < 0 && i14 <= i15)) {
            int i16 = i15;
            while (true) {
                String str = (String) charSequence2;
                boolean z16 = z11;
                if (x.n0(0, i16, str.length(), str, (String) charSequence, z16)) {
                    return i16;
                }
                if (i16 != i14) {
                    i16 += i13;
                    z11 = z16;
                }
            }
        }
        return -1;
    }

    public static int H0(CharSequence charSequence, char c11, int i11, int i12) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        kotlin.jvm.internal.m.f(charSequence, "<this>");
        return !(charSequence instanceof String) ? J0(charSequence, new char[]{c11}, i11, false) : ((String) charSequence).indexOf(c11, i11);
    }

    public static /* synthetic */ int I0(CharSequence charSequence, String str, int i11, boolean z11, int i12) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        if ((i12 & 4) != 0) {
            z11 = false;
        }
        return F0(charSequence, str, i11, z11);
    }

    public static final int J0(CharSequence charSequence, char[] cArr, int i11, boolean z11) {
        kotlin.jvm.internal.m.f(charSequence, "<this>");
        if (!z11 && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(ry.l.e0(cArr), i11);
        }
        if (i11 < 0) {
            i11 = 0;
        }
        int iE0 = E0(charSequence);
        if (i11 > iE0) {
            return -1;
        }
        while (true) {
            char cCharAt = charSequence.charAt(i11);
            for (char c11 : cArr) {
                if (qx.p.n(c11, cCharAt, z11)) {
                    return i11;
                }
            }
            if (i11 == iE0) {
                return -1;
            }
            i11++;
        }
    }

    public static boolean K0(CharSequence charSequence) {
        kotlin.jvm.internal.m.f(charSequence, "<this>");
        for (int i11 = 0; i11 < charSequence.length(); i11++) {
            if (!qx.p.s(charSequence.charAt(i11))) {
                return false;
            }
        }
        return true;
    }

    public static char L0(CharSequence charSequence) {
        kotlin.jvm.internal.m.f(charSequence, "<this>");
        if (charSequence.length() != 0) {
            return charSequence.charAt(E0(charSequence));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    public static int N0(CharSequence charSequence, char c11, int i11, int i12) {
        if ((i12 & 2) != 0) {
            i11 = E0(charSequence);
        }
        kotlin.jvm.internal.m.f(charSequence, "<this>");
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(c11, i11);
        }
        char[] cArr = {c11};
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(ry.l.e0(cArr), i11);
        }
        int iE0 = E0(charSequence);
        if (i11 > iE0) {
            i11 = iE0;
        }
        while (-1 < i11) {
            if (qx.p.n(cArr[0], charSequence.charAt(i11), false)) {
                return i11;
            }
            i11--;
        }
        return -1;
    }

    public static String O0(int i11, String str) {
        CharSequence charSequenceSubSequence;
        kotlin.jvm.internal.m.f(str, "<this>");
        if (i11 < 0) {
            throw new IllegalArgumentException(p0.h(i11, "Desired length ", " is less than zero."));
        }
        if (i11 <= str.length()) {
            charSequenceSubSequence = str.subSequence(0, str.length());
        } else {
            StringBuilder sb2 = new StringBuilder(i11);
            sb2.append((CharSequence) str);
            int length = i11 - str.length();
            int i12 = 1;
            if (1 <= length) {
                while (true) {
                    sb2.append(' ');
                    if (i12 == length) {
                        break;
                    }
                    i12++;
                }
            }
            charSequenceSubSequence = sb2;
        }
        return charSequenceSubSequence.toString();
    }

    public static String P0(int i11, String str) {
        CharSequence charSequenceSubSequence;
        kotlin.jvm.internal.m.f(str, "<this>");
        if (i11 < 0) {
            throw new IllegalArgumentException(p0.h(i11, "Desired length ", " is less than zero."));
        }
        if (i11 <= str.length()) {
            charSequenceSubSequence = str.subSequence(0, str.length());
        } else {
            StringBuilder sb2 = new StringBuilder(i11);
            int length = i11 - str.length();
            int i12 = 1;
            if (1 <= length) {
                while (true) {
                    sb2.append('0');
                    if (i12 == length) {
                        break;
                    }
                    i12++;
                }
            }
            sb2.append((CharSequence) str);
            charSequenceSubSequence = sb2;
        }
        return charSequenceSubSequence.toString();
    }

    public static final boolean Q0(CharSequence charSequence, int i11, CharSequence other, int i12, int i13, boolean z11) {
        kotlin.jvm.internal.m.f(charSequence, "<this>");
        kotlin.jvm.internal.m.f(other, "other");
        if (i12 < 0 || i11 < 0 || i11 > charSequence.length() - i13 || i12 > other.length() - i13) {
            return false;
        }
        for (int i14 = 0; i14 < i13; i14++) {
            if (!qx.p.n(charSequence.charAt(i11 + i14), other.charAt(i12 + i14), z11)) {
                return false;
            }
        }
        return true;
    }

    public static String R0(String str, String str2) {
        kotlin.jvm.internal.m.f(str, "<this>");
        if (!x.s0(str, str2, false)) {
            return str;
        }
        String strSubstring = str.substring(str2.length());
        kotlin.jvm.internal.m.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String S0(String str, String str2) {
        kotlin.jvm.internal.m.f(str, "<this>");
        if (!B0(str, str2)) {
            return str;
        }
        String strSubstring = str.substring(0, str.length() - str2.length());
        kotlin.jvm.internal.m.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static StringBuilder T0(CharSequence charSequence, int i11, int i12, CharSequence replacement) {
        kotlin.jvm.internal.m.f(charSequence, "<this>");
        kotlin.jvm.internal.m.f(replacement, "replacement");
        if (i12 < i11) {
            throw new IndexOutOfBoundsException(p0.l("End index (", i12, ") is less than start index (", i11, ")."));
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(charSequence, 0, i11);
        sb2.append(replacement);
        sb2.append(charSequence, i12, charSequence.length());
        return sb2;
    }

    public static final void U0(int i11) {
        if (i11 < 0) {
            throw new IllegalArgumentException(nv.p.j(i11, "Limit must be non-negative, but was ").toString());
        }
    }

    public static final List V0(int i11, CharSequence charSequence, String str) {
        U0(i11);
        int iF0 = F0(charSequence, str, 0, false);
        if (iF0 == -1 || i11 == 1) {
            return ns.o.K(charSequence.toString());
        }
        boolean z11 = i11 > 0;
        int i12 = 10;
        if (z11 && i11 <= 10) {
            i12 = i11;
        }
        ArrayList arrayList = new ArrayList(i12);
        int length = 0;
        do {
            arrayList.add(charSequence.subSequence(length, iF0).toString());
            length = str.length() + iF0;
            if (z11 && arrayList.size() == i11 - 1) {
                break;
            }
            iF0 = F0(charSequence, str, length, false);
        } while (iF0 != -1);
        arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
        return arrayList;
    }

    public static List W0(CharSequence charSequence, String[] strArr, int i11, int i12) {
        if ((i12 & 4) != 0) {
            i11 = 0;
        }
        kotlin.jvm.internal.m.f(charSequence, "<this>");
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() != 0) {
                return V0(i11, charSequence, str);
            }
        }
        U0(i11);
        e00.j jVar = new e00.j(new c(charSequence, i11, new w0(ry.l.A(strArr))), 1);
        ArrayList arrayList = new ArrayList(ry.n.W(jVar, 10));
        Iterator it = jVar.iterator();
        while (true) {
            b bVar = (b) it;
            if (!bVar.hasNext()) {
                return arrayList;
            }
            lz.g range = (lz.g) bVar.next();
            kotlin.jvm.internal.m.f(range, "range");
            arrayList.add(charSequence.subSequence(range.f40532a, range.f40533b + 1).toString());
        }
    }

    public static List X0(String str, char[] cArr, int i11) {
        int i12 = (i11 & 4) != 0 ? 0 : 3;
        kotlin.jvm.internal.m.f(str, "<this>");
        if (cArr.length == 1) {
            return V0(i12, str, String.valueOf(cArr[0]));
        }
        U0(i12);
        e00.j jVar = new e00.j(new c(str, i12, new mt.r(cArr, 11)), 1);
        ArrayList arrayList = new ArrayList(ry.n.W(jVar, 10));
        Iterator it = jVar.iterator();
        while (true) {
            b bVar = (b) it;
            if (!bVar.hasNext()) {
                return arrayList;
            }
            lz.g range = (lz.g) bVar.next();
            kotlin.jvm.internal.m.f(range, "range");
            arrayList.add(str.subSequence(range.f40532a, range.f40533b + 1).toString());
        }
    }

    public static boolean Y0(String str, char c11) {
        return str.length() > 0 && qx.p.n(str.charAt(0), c11, false);
    }

    public static String Z0(String str, String str2, char c11) {
        int iH0 = H0(str, c11, 0, 6);
        if (iH0 == -1) {
            return str2;
        }
        String strSubstring = str.substring(iH0 + 1, str.length());
        kotlin.jvm.internal.m.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String a1(String str, String delimiter, String missingDelimiterValue) {
        kotlin.jvm.internal.m.f(str, "<this>");
        kotlin.jvm.internal.m.f(delimiter, "delimiter");
        kotlin.jvm.internal.m.f(missingDelimiterValue, "missingDelimiterValue");
        int iI0 = I0(str, delimiter, 0, false, 6);
        if (iI0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(delimiter.length() + iI0, str.length());
        kotlin.jvm.internal.m.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String b1(String str, String str2, char c11) {
        int iN0 = N0(str, c11, 0, 6);
        if (iN0 == -1) {
            return str2;
        }
        String strSubstring = str.substring(iN0 + 1, str.length());
        kotlin.jvm.internal.m.e(strSubstring, ypOOxsaJG.SdNLLLtgUFcxs);
        return strSubstring;
    }

    public static String c1(String missingDelimiterValue) {
        kotlin.jvm.internal.m.f(missingDelimiterValue, "<this>");
        kotlin.jvm.internal.m.f(missingDelimiterValue, "missingDelimiterValue");
        int iM0 = M0(6, missingDelimiterValue, "_");
        if (iM0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = missingDelimiterValue.substring(1 + iM0, missingDelimiterValue.length());
        kotlin.jvm.internal.m.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String d1(String str, String str2, String missingDelimiterValue) {
        kotlin.jvm.internal.m.f(str, "<this>");
        kotlin.jvm.internal.m.f(missingDelimiterValue, "missingDelimiterValue");
        int iI0 = I0(str, str2, 0, false, 6);
        if (iI0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(0, iI0);
        kotlin.jvm.internal.m.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String e1(String str, char c11) {
        int iH0 = H0(str, c11, 0, 6);
        if (iH0 == -1) {
            return str;
        }
        String strSubstring = str.substring(0, iH0);
        kotlin.jvm.internal.m.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String f1(String missingDelimiterValue, char c11) {
        kotlin.jvm.internal.m.f(missingDelimiterValue, "<this>");
        kotlin.jvm.internal.m.f(missingDelimiterValue, "missingDelimiterValue");
        int iN0 = N0(missingDelimiterValue, c11, 0, 6);
        if (iN0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = missingDelimiterValue.substring(0, iN0);
        kotlin.jvm.internal.m.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String g1(int i11, String str) {
        kotlin.jvm.internal.m.f(str, "<this>");
        if (i11 < 0) {
            throw new IllegalArgumentException(p0.h(i11, "Requested character count ", " is less than zero.").toString());
        }
        int length = str.length();
        if (i11 > length) {
            i11 = length;
        }
        String strSubstring = str.substring(0, i11);
        kotlin.jvm.internal.m.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static List h1(CharSequence charSequence) {
        kotlin.jvm.internal.m.f(charSequence, "<this>");
        int length = charSequence.length();
        if (length == 0) {
            return ry.r.f50854a;
        }
        if (length == 1) {
            return ns.o.K(Character.valueOf(charSequence.charAt(0)));
        }
        ArrayList arrayList = new ArrayList(charSequence.length());
        for (int i11 = 0; i11 < charSequence.length(); i11++) {
            arrayList.add(Character.valueOf(charSequence.charAt(i11)));
        }
        return arrayList;
    }

    public static CharSequence i1(CharSequence charSequence) {
        kotlin.jvm.internal.m.f(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i11 = 0;
        boolean z11 = false;
        while (i11 <= length) {
            boolean zS = qx.p.s(charSequence.charAt(!z11 ? i11 : length));
            if (z11) {
                if (!zS) {
                    break;
                }
                length--;
            } else if (zS) {
                i11++;
            } else {
                z11 = true;
            }
        }
        return charSequence.subSequence(i11, length + 1);
    }

    public static String j1(String str, char... cArr) {
        CharSequence charSequenceSubSequence;
        kotlin.jvm.internal.m.f(str, "<this>");
        int length = str.length() - 1;
        if (length < 0) {
            charSequenceSubSequence = BuildConfig.VERSION_NAME;
            break;
        }
        while (true) {
            int i11 = length - 1;
            char cCharAt = str.charAt(length);
            int length2 = cArr.length;
            int i12 = 0;
            while (true) {
                if (i12 >= length2) {
                    i12 = -1;
                    break;
                }
                if (cCharAt == cArr[i12]) {
                    break;
                }
                i12++;
            }
            if (!(i12 >= 0)) {
                charSequenceSubSequence = str.subSequence(0, length + 1);
                break;
            }
            if (i11 < 0) {
                charSequenceSubSequence = BuildConfig.VERSION_NAME;
                break;
            }
            length = i11;
        }
        return charSequenceSubSequence.toString();
    }

    public static boolean v0(CharSequence charSequence, CharSequence other, boolean z11) {
        kotlin.jvm.internal.m.f(charSequence, "<this>");
        kotlin.jvm.internal.m.f(other, "other");
        if (other instanceof String) {
            if (I0(charSequence, (String) other, 0, z11, 2) >= 0) {
                return true;
            }
        } else if (G0(charSequence, other, 0, charSequence.length(), z11, false) >= 0) {
            return true;
        }
        return false;
    }

    public static boolean w0(CharSequence charSequence, char c11) {
        kotlin.jvm.internal.m.f(charSequence, "<this>");
        return H0(charSequence, c11, 0, 2) >= 0;
    }

    public static String y0(int i11, String str) {
        kotlin.jvm.internal.m.f(str, "<this>");
        if (i11 < 0) {
            throw new IllegalArgumentException(p0.h(i11, "Requested character count ", " is less than zero.").toString());
        }
        int length = str.length();
        if (i11 > length) {
            i11 = length;
        }
        String strSubstring = str.substring(i11);
        kotlin.jvm.internal.m.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String z0(String str) {
        kotlin.jvm.internal.m.f(str, "<this>");
        int length = str.length() - 1;
        if (length < 0) {
            length = 0;
        }
        return g1(length, str);
    }

    public static int M0(int i11, CharSequence charSequence, String string) {
        int iE0 = (i11 & 2) != 0 ? E0(charSequence) : 0;
        boolean z11 = (i11 & 4) == 0;
        kotlin.jvm.internal.m.f(charSequence, LwKl.fgEIyosRZxdi);
        kotlin.jvm.internal.m.f(string, "string");
        return (z11 || !(charSequence instanceof String)) ? G0(charSequence, string, iE0, 0, z11, true) : ((String) charSequence).lastIndexOf(string, iE0);
    }
}
