package a0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class v1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0.d f207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f208b;

    public v1(b0.d dVar, long j11) {
        this.f207a = dVar;
        this.f208b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v1)) {
            return false;
        }
        v1 v1Var = (v1) obj;
        return this.f207a.equals(v1Var.f207a) && v3.l.a(this.f208b, v1Var.f208b);
    }

    public final int hashCode() {
        return Long.hashCode(this.f208b) + (this.f207a.hashCode() * 31);
    }

    public final String toString() {
        return "AnimData(anim=" + this.f207a + ", startSize=" + ((Object) v3.l.b(this.f208b)) + ')';
    }
}
