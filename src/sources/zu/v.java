package zu;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class v implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f59567a;

    public v(boolean z11) {
        this.f59567a = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v) && this.f59567a == ((v) obj).f59567a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f59567a);
    }

    public final String toString() {
        return ep.a.i("Success(hasPurchased=", ")", this.f59567a);
    }
}
