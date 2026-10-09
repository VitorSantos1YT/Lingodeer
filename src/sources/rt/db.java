package rt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class db implements fb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f49634a;

    public db(float f5) {
        this.f49634a = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof db) && Float.compare(this.f49634a, ((db) obj).f49634a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f49634a);
    }

    public final String toString() {
        return "Downloading(progress=" + this.f49634a + ")";
    }
}
