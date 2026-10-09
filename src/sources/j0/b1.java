package j0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f35250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f35251b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f35252c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f35253d;

    public b1(int i11, int i12, int i13, int i14) {
        this.f35250a = i11;
        this.f35251b = i12;
        this.f35252c = i13;
        this.f35253d = i14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b1)) {
            return false;
        }
        b1 b1Var = (b1) obj;
        return this.f35250a == b1Var.f35250a && this.f35251b == b1Var.f35251b && this.f35252c == b1Var.f35252c && this.f35253d == b1Var.f35253d;
    }

    public final int hashCode() {
        return (((((this.f35250a * 31) + this.f35251b) * 31) + this.f35252c) * 31) + this.f35253d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InsetsValues(left=");
        sb2.append(this.f35250a);
        sb2.append(", top=");
        sb2.append(this.f35251b);
        sb2.append(", right=");
        sb2.append(this.f35252c);
        sb2.append(", bottom=");
        return ep.a.j(sb2, this.f35253d, ')');
    }
}
