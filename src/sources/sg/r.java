package sg;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public q f51658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public q f51659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public q f51660c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public q f51661d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public q f51662e;

    public final boolean equals(Object obj) {
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f51658a == rVar.f51658a && this.f51659b == rVar.f51659b && this.f51660c == rVar.f51660c && this.f51661d == rVar.f51661d && this.f51662e == rVar.f51662e;
    }

    public final int hashCode() {
        Object obj = 0;
        Object obj2 = this.f51659b;
        if (obj2 == null) {
            obj2 = obj;
        }
        int iHashCode = obj2.hashCode() * 11;
        q qVar = this.f51662e;
        return ((qVar != null ? qVar : 0).hashCode() * 7) + iHashCode;
    }
}
