package j$.time.format;

/* JADX INFO: loaded from: classes2.dex */
public final class l implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f35075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f35076b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final char f35077c;

    @Override // j$.time.format.e
    public final int B(v vVar, CharSequence charSequence, int i11) {
        boolean z11 = vVar.f35108c;
        if (i11 > charSequence.length()) {
            throw new IndexOutOfBoundsException();
        }
        if (i11 == charSequence.length()) {
            return ~i11;
        }
        int length = this.f35076b + i11;
        if (length > charSequence.length()) {
            if (z11) {
                return ~i11;
            }
            length = charSequence.length();
        }
        int i12 = i11;
        while (i12 < length && vVar.a(charSequence.charAt(i12), this.f35077c)) {
            i12++;
        }
        int iB = this.f35075a.B(vVar, charSequence.subSequence(0, length), i12);
        return (iB == length || !z11) ? iB : ~(i11 + i12);
    }

    public l(e eVar, int i11, char c11) {
        this.f35075a = eVar;
        this.f35076b = i11;
        this.f35077c = c11;
    }

    @Override // j$.time.format.e
    public final boolean w(x xVar, StringBuilder sb2) {
        int length = sb2.length();
        if (!this.f35075a.w(xVar, sb2)) {
            return false;
        }
        int length2 = sb2.length() - length;
        int i11 = this.f35076b;
        if (length2 <= i11) {
            for (int i12 = 0; i12 < i11 - length2; i12++) {
                sb2.insert(length, this.f35077c);
            }
            return true;
        }
        throw new j$.time.c("Cannot print as output of " + length2 + " characters exceeds pad width of " + i11);
    }

    public final String toString() {
        String str;
        char c11 = this.f35077c;
        if (c11 == ' ') {
            str = ")";
        } else {
            str = ",'" + c11 + "')";
        }
        return "Pad(" + this.f35075a + "," + this.f35076b + str;
    }
}
