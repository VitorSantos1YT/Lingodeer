package rt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class uf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f50514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f50515b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f50516c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f50517d;

    public uf(int i11, long j11, boolean z11, boolean z12) {
        this.f50514a = i11;
        this.f50515b = j11;
        this.f50516c = z11;
        this.f50517d = z12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uf)) {
            return false;
        }
        uf ufVar = (uf) obj;
        return this.f50514a == ufVar.f50514a && this.f50515b == ufVar.f50515b && this.f50516c == ufVar.f50516c && this.f50517d == ufVar.f50517d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f50517d) + defpackage.e.e(defpackage.e.f(this.f50515b, Integer.hashCode(this.f50514a) * 31, 31), 31, this.f50516c);
    }

    public final String toString() {
        StringBuilder sbO = b7.e0.o(this.f50514a, "TipsLesson(unitSortIndex=", ", unitId=", this.f50515b);
        b7.e0.z(", canAccess=", ", isCurrentOpen=", sbO, this.f50516c, this.f50517d);
        sbO.append(")");
        return sbO.toString();
    }
}
