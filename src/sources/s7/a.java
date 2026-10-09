package s7;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f51388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f51389b;

    public a(long j11, long j12) {
        this.f51388a = j11;
        this.f51389b = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f51388a == aVar.f51388a && this.f51389b == aVar.f51389b;
    }

    public final int hashCode() {
        return (((int) this.f51388a) * 31) + ((int) this.f51389b);
    }
}
