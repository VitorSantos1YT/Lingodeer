package y6;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f57313a;

    static {
        new r(new kw.b());
        b7.f0.G(0);
        b7.f0.G(1);
        b7.f0.G(2);
        b7.f0.G(3);
        b7.f0.G(4);
        b7.f0.G(5);
        b7.f0.G(6);
        b7.f0.G(7);
    }

    public r(kw.b bVar) {
        String str = b7.f0.f3975a;
        this.f57313a = bVar.f38845a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r) && this.f57313a == ((r) obj).f57313a;
    }

    public final int hashCode() {
        long j11 = this.f57313a;
        return ((((int) 0) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 923521;
    }
}
