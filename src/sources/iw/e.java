package iw;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class e implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Exception f34888a;

    public e(Exception exc) {
        this.f34888a = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && this.f34888a.equals(((e) obj).f34888a);
    }

    public final int hashCode() {
        return this.f34888a.hashCode();
    }

    public final String toString() {
        return "Error(throwable=" + this.f34888a + ')';
    }
}
