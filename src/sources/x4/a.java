package x4;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final byte[] f55763e = new byte[1792];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f55764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f55765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f55766c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public char f55767d;

    static {
        for (int i11 = 0; i11 < 1792; i11++) {
            f55763e[i11] = Character.getDirectionality(i11);
        }
    }

    public a(CharSequence charSequence) {
        this.f55764a = charSequence;
        this.f55765b = charSequence.length();
    }

    public final byte a() {
        int i11 = this.f55766c - 1;
        CharSequence charSequence = this.f55764a;
        char cCharAt = charSequence.charAt(i11);
        this.f55767d = cCharAt;
        if (Character.isLowSurrogate(cCharAt)) {
            int iCodePointBefore = Character.codePointBefore(charSequence, this.f55766c);
            this.f55766c -= Character.charCount(iCodePointBefore);
            return Character.getDirectionality(iCodePointBefore);
        }
        this.f55766c--;
        char c11 = this.f55767d;
        return c11 < 1792 ? f55763e[c11] : Character.getDirectionality(c11);
    }
}
