package y6;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f57203c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f57204a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f57205b = 0;

    static {
        b7.f0.G(0);
        b7.f0.G(1);
        b7.f0.G(2);
        b7.f0.G(3);
    }

    public i(w0 w0Var) {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f57204a == iVar.f57204a && this.f57205b == iVar.f57205b;
    }

    public final int hashCode() {
        return (((16337 + this.f57204a) * 31) + this.f57205b) * 31;
    }
}
