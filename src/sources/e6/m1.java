package e6;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class m1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e1 f24981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f24982b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f24983c;

    public m1(e1 e1Var, boolean z11, boolean z12) {
        this.f24981a = e1Var;
        this.f24982b = z11;
        this.f24983c = z12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m1)) {
            return false;
        }
        m1 m1Var = (m1) obj;
        return this.f24981a == m1Var.f24981a && this.f24982b == m1Var.f24982b && this.f24983c == m1Var.f24983c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f24983c) + defpackage.e.e(this.f24981a.hashCode() * 31, 31, this.f24982b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RowColumnChildSelector(type=");
        sb2.append(this.f24981a);
        sb2.append(", expandWidth=");
        sb2.append(this.f24982b);
        sb2.append(", expandHeight=");
        return ep.a.l(sb2, this.f24983c, ')');
    }
}
