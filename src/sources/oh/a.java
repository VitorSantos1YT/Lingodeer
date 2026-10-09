package oh;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Exception f44913a;

    public a(Exception exc) {
        this.f44913a = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f44913a.equals(((a) obj).f44913a);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.f44913a.hashCode() * 31);
    }

    public final String toString() {
        return "Error(exception=" + this.f44913a + ", canRetry=true)";
    }
}
