package j$.time.format;

import java.text.ParsePosition;

/* JADX INFO: loaded from: classes2.dex */
public class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f35078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f35079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final char f35080c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public n f35081d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public n f35082e;

    public boolean b(char c11, char c12) {
        return c11 == c12;
    }

    public n(String str, String str2, n nVar) {
        this.f35078a = str;
        this.f35079b = str2;
        this.f35081d = nVar;
        if (str.isEmpty()) {
            this.f35080c = (char) 65535;
        } else {
            this.f35080c = this.f35078a.charAt(0);
        }
    }

    public final String c(CharSequence charSequence, ParsePosition parsePosition) {
        int index = parsePosition.getIndex();
        int length = charSequence.length();
        if (!e(charSequence, index, length)) {
            return null;
        }
        int length2 = this.f35078a.length() + index;
        n nVar = this.f35081d;
        if (nVar != null && length2 != length) {
            while (!b(nVar.f35080c, charSequence.charAt(length2))) {
                nVar = nVar.f35082e;
                if (nVar == null) {
                }
            }
            parsePosition.setIndex(length2);
            String strC = nVar.c(charSequence, parsePosition);
            if (strC != null) {
                return strC;
            }
        }
        parsePosition.setIndex(length2);
        return this.f35079b;
    }

    public n d(String str, String str2, n nVar) {
        return new n(str, str2, nVar);
    }

    public boolean e(CharSequence charSequence, int i11, int i12) {
        if (charSequence instanceof String) {
            return ((String) charSequence).startsWith(this.f35078a, i11);
        }
        int length = this.f35078a.length();
        if (length > i12 - i11) {
            return false;
        }
        int i13 = 0;
        while (true) {
            int i14 = length - 1;
            if (length <= 0) {
                return true;
            }
            int i15 = i13 + 1;
            int i16 = i11 + 1;
            if (!b(this.f35078a.charAt(i13), charSequence.charAt(i11))) {
                return false;
            }
            i11 = i16;
            length = i14;
            i13 = i15;
        }
    }

    public final boolean a(String str, String str2) {
        int i11 = 0;
        while (i11 < str.length() && i11 < this.f35078a.length() && b(str.charAt(i11), this.f35078a.charAt(i11))) {
            i11++;
        }
        if (i11 == this.f35078a.length()) {
            if (i11 < str.length()) {
                String strSubstring = str.substring(i11);
                for (n nVar = this.f35081d; nVar != null; nVar = nVar.f35082e) {
                    if (b(nVar.f35080c, strSubstring.charAt(0))) {
                        return nVar.a(strSubstring, str2);
                    }
                }
                n nVarD = d(strSubstring, str2, null);
                nVarD.f35082e = this.f35081d;
                this.f35081d = nVarD;
                return true;
            }
            this.f35079b = str2;
            return true;
        }
        n nVarD2 = d(this.f35078a.substring(i11), this.f35079b, this.f35081d);
        this.f35078a = str.substring(0, i11);
        this.f35081d = nVarD2;
        if (i11 < str.length()) {
            this.f35081d.f35082e = d(str.substring(i11), str2, null);
            this.f35079b = null;
            return true;
        }
        this.f35079b = str2;
        return true;
    }
}
