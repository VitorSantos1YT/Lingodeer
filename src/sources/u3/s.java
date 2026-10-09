package u3;

import dt.Xk.wuoM;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final s f52764c = new s(2, false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final s f52765d = new s(1, true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f52766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f52767b;

    public s(int i11, boolean z11) {
        this.f52766a = i11;
        this.f52767b = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f52766a == sVar.f52766a && this.f52767b == sVar.f52767b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f52767b) + (Integer.hashCode(this.f52766a) * 31);
    }

    public final String toString() {
        if (equals(f52764c)) {
            return wuoM.ATTP;
        }
        return equals(f52765d) ? "TextMotion.Animated" : "Invalid";
    }
}
