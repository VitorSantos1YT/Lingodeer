package e2;

import androidx.lifecycle.viewmodel.compose.NP.IMCc;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f24711a;

    public static String a(int i11) {
        if (i11 == 1) {
            return "Next";
        }
        if (i11 == 2) {
            return "Previous";
        }
        if (i11 == 3) {
            return "Left";
        }
        if (i11 == 4) {
            return "Right";
        }
        if (i11 == 5) {
            return "Up";
        }
        if (i11 == 6) {
            return IMCc.rULxNEuGDNm;
        }
        if (i11 == 7) {
            return "Enter";
        }
        return i11 == 8 ? "Exit" : "Invalid FocusDirection";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return this.f24711a == ((f) obj).f24711a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f24711a);
    }

    public final String toString() {
        return a(this.f24711a);
    }
}
