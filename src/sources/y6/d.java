package y6;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f57180b = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public tp.g f57181a;

    static {
        w4.c.s(0, 1, 2, 3, 4);
        b7.f0.G(5);
    }

    public final tp.g a() {
        if (this.f57181a == null) {
            this.f57181a = new tp.g(this);
        }
        return this.f57181a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return -2092275855;
    }
}
