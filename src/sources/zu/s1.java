package zu;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class s1 implements b2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f59554a;

    public s1(boolean z11) {
        this.f59554a = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s1) && this.f59554a == ((s1) obj).f59554a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f59554a);
    }

    public final String toString() {
        return ep.a.i("UpdateRankingEnable(rankingEnable=", ")", this.f59554a);
    }
}
