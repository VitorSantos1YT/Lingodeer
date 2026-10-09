package kb;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f38037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f38038b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f38039c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f38040d;

    public g(boolean z11, boolean z12, boolean z13, boolean z14) {
        this.f38037a = z11;
        this.f38038b = z12;
        this.f38039c = z13;
        this.f38040d = z14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f38037a == gVar.f38037a && this.f38038b == gVar.f38038b && this.f38039c == gVar.f38039c && this.f38040d == gVar.f38040d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f38040d) + defpackage.e.e(defpackage.e.e(Boolean.hashCode(this.f38037a) * 31, 31, this.f38038b), 31, this.f38039c);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NetworkState(isConnected=");
        sb2.append(this.f38037a);
        sb2.append(", isValidated=");
        sb2.append(this.f38038b);
        sb2.append(", isMetered=");
        sb2.append(this.f38039c);
        sb2.append(", isNotRoaming=");
        return ep.a.l(sb2, this.f38040d, ')');
    }
}
