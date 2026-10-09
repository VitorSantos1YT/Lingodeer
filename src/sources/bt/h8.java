package bt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class h8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5502b;

    public h8(int i11, int i12) {
        this.f5501a = i11;
        this.f5502b = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h8)) {
            return false;
        }
        h8 h8Var = (h8) obj;
        return this.f5501a == h8Var.f5501a && this.f5502b == h8Var.f5502b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f5502b) + (Integer.hashCode(this.f5501a) * 31);
    }

    public final String toString() {
        return hh.p0.l("StemItemBounds(top=", this.f5501a, ", bottom=", this.f5502b, ")");
    }
}
