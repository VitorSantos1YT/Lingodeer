package j$.time.format;

/* JADX INFO: loaded from: classes2.dex */
public final class m extends n {
    @Override // j$.time.format.n
    public final n d(String str, String str2, n nVar) {
        return new m(str, str2, nVar);
    }

    @Override // j$.time.format.n
    public final boolean b(char c11, char c12) {
        return v.b(c11, c12);
    }

    @Override // j$.time.format.n
    public final boolean e(CharSequence charSequence, int i11, int i12) {
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
            if (!v.b(this.f35078a.charAt(i13), charSequence.charAt(i11))) {
                return false;
            }
            i11 = i16;
            length = i14;
            i13 = i15;
        }
    }
}
