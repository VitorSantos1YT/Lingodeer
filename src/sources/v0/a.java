package v0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f53450a;

    public a(int i11) {
        this.f53450a = i11;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.f53450a == ((a) obj).f53450a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f53450a;
    }
}
