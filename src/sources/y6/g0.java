package y6;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f57202a;

    public g0(n nVar) {
        this.f57202a = nVar;
    }

    public final boolean a(int... iArr) {
        for (int i11 : iArr) {
            if (this.f57202a.f57235a.get(i11)) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g0) {
            return this.f57202a.equals(((g0) obj).f57202a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f57202a.f57235a.hashCode();
    }
}
