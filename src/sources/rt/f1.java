package rt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class f1 implements h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f49709a;

    public f1(long j11) {
        this.f49709a = j11;
    }

    @Override // rt.h1
    public final long a() {
        return this.f49709a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f1) && this.f49709a == ((f1) obj).f49709a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f49709a);
    }

    public final String toString() {
        return nv.p.m(this.f49709a, "NotRequested(sourceRevision=", ")");
    }
}
