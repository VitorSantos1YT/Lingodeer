package sg;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c.a f51656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f51657b;

    public q(c.a aVar, r rVar) {
        this.f51656a = aVar;
        this.f51657b = rVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return kotlin.jvm.internal.m.a(this.f51656a, qVar.f51656a) && kotlin.jvm.internal.m.a(this.f51657b, qVar.f51657b);
    }

    public final int hashCode() {
        return this.f51657b.hashCode() + (this.f51656a.hashCode() * 31);
    }
}
