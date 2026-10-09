package l1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends t {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f39244d;

    public c(int i11) {
        this.f39244d = i11;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof c) && ((c) obj).f39244d == this.f39244d;
    }

    public final int hashCode() {
        return this.f39244d * 31;
    }
}
