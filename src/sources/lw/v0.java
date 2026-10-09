package lw;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class v0 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i11;
        u0 u0Var = (u0) obj2;
        ((nw.k) ((u0) obj)).getClass();
        int i12 = 3;
        try {
            Class.forName("android.app.Application", false, nw.k.class.getClassLoader());
            i11 = 8;
        } catch (Exception unused) {
            i11 = 3;
        }
        ((nw.k) u0Var).getClass();
        try {
            Class.forName("android.app.Application", false, nw.k.class.getClassLoader());
            i12 = 8;
        } catch (Exception unused2) {
        }
        return i11 - i12;
    }
}
