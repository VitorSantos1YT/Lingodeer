package d1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f22914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f22915b;

    public g1(long j11, long j12) {
        this.f22914a = j11;
        this.f22915b = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g1)) {
            return false;
        }
        g1 g1Var = (g1) obj;
        return g2.x.d(this.f22914a, g1Var.f22914a) && g2.x.d(this.f22915b, g1Var.f22915b);
    }

    public final int hashCode() {
        int i11 = g2.x.f28623j;
        return Long.hashCode(this.f22915b) + (Long.hashCode(this.f22914a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SelectionColors(selectionHandleColor=");
        com.google.android.material.datepicker.d.t(this.f22914a, ", selectionBackgroundColor=", sb2);
        sb2.append((Object) g2.x.j(this.f22915b));
        sb2.append(')');
        return sb2.toString();
    }
}
