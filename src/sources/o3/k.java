package o3;

import i0.pKy.shrCcjmOhAmRC;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f44685a;

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            return this.f44685a == ((k) obj).f44685a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f44685a);
    }

    public final String toString() {
        return a(this.f44685a);
    }

    public static String a(int i11) {
        if (i11 == 0) {
            return "Unspecified";
        }
        if (i11 == 1) {
            return shrCcjmOhAmRC.XVpwcUkbJG;
        }
        if (i11 == 2) {
            return "Ascii";
        }
        if (i11 == 3) {
            return "Number";
        }
        if (i11 == 4) {
            return "Phone";
        }
        if (i11 == 5) {
            return "Uri";
        }
        if (i11 == 6) {
            return "Email";
        }
        if (i11 == 7) {
            return "Password";
        }
        if (i11 == 8) {
            return "NumberPassword";
        }
        return i11 == 9 ? "Decimal" : "Invalid";
    }
}
