package u3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f52745a;

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            return this.f52745a == ((h) obj).f52745a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f52745a);
    }

    public final String toString() {
        int i11 = this.f52745a;
        if (i11 == 1) {
            return "LineHeightStyle.Trim.FirstLineTop";
        }
        if (i11 == 16) {
            return "LineHeightStyle.Trim.LastLineBottom";
        }
        if (i11 == 17) {
            return "LineHeightStyle.Trim.Both";
        }
        return i11 == 0 ? "LineHeightStyle.Trim.None" : "Invalid";
    }
}
