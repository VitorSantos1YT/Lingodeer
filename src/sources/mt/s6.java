package mt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class s6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f41896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f41897b;

    public s6(int i11, int i12) {
        this.f41896a = i11;
        this.f41897b = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s6)) {
            return false;
        }
        s6 s6Var = (s6) obj;
        return this.f41896a == s6Var.f41896a && this.f41897b == s6Var.f41897b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f41897b) + (Integer.hashCode(this.f41896a) * 31);
    }

    public final String toString() {
        return hh.p0.l("FutureReviewListScrollPosition(firstVisibleItemIndex=", this.f41896a, ", firstVisibleItemScrollOffset=", this.f41897b, ")");
    }
}
