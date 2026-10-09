package ps;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f47134a;

    public g(float f5) {
        this.f47134a = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && Float.compare(this.f47134a, ((g) obj).f47134a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f47134a);
    }

    public final String toString() {
        return "PartiallyDownloaded(percentage=" + this.f47134a + ")";
    }
}
