package z2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends ae.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static d f58524c;

    @Override // ae.d
    public final int[] f(int i11) {
        int length = k().length();
        if (length <= 0 || i11 >= length) {
            return null;
        }
        if (i11 < 0) {
            i11 = 0;
        }
        while (i11 < length && k().charAt(i11) == '\n' && (k().charAt(i11) == '\n' || (i11 != 0 && k().charAt(i11 - 1) != '\n'))) {
            i11++;
        }
        if (i11 >= length) {
            return null;
        }
        int i12 = i11 + 1;
        while (i12 < length && !o(i12)) {
            i12++;
        }
        return j(i11, i12);
    }

    @Override // ae.d
    public final int[] m(int i11) {
        int length = k().length();
        if (length <= 0 || i11 <= 0) {
            return null;
        }
        if (i11 > length) {
            i11 = length;
        }
        while (i11 > 0 && k().charAt(i11 - 1) == '\n' && !o(i11)) {
            i11--;
        }
        if (i11 <= 0) {
            return null;
        }
        int i12 = i11 - 1;
        while (i12 > 0 && (k().charAt(i12) == '\n' || (i12 != 0 && k().charAt(i12 - 1) != '\n'))) {
            i12--;
        }
        return j(i12, i11);
    }

    public final boolean o(int i11) {
        if (i11 <= 0 || k().charAt(i11 - 1) == '\n') {
            return false;
        }
        return i11 == k().length() || k().charAt(i11) == '\n';
    }
}
