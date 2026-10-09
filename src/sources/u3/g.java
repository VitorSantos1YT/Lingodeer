package u3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f52744a;

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            return this.f52744a == ((g) obj).f52744a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f52744a);
    }

    public final String toString() {
        int i11 = this.f52744a;
        if (i11 == 0) {
            return "LineHeightStyle.Mode.Fixed";
        }
        if (i11 == 1) {
            return "LineHeightStyle.Mode.Minimum";
        }
        return i11 == 2 ? "LineHeightStyle.Mode.Tight" : "Invalid";
    }
}
