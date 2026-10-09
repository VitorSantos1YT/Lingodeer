package rt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class e1 implements h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f49664a;

    public e1(long j11) {
        this.f49664a = j11;
    }

    @Override // rt.h1
    public final long a() {
        return this.f49664a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e1) && this.f49664a == ((e1) obj).f49664a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f49664a);
    }

    public final String toString() {
        return nv.p.m(this.f49664a, "Loading(sourceRevision=", ")");
    }
}
