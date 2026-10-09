package rt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class p2 implements r2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f50229a;

    public p2(float f5) {
        this.f50229a = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p2) && Float.compare(this.f50229a, ((p2) obj).f50229a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f50229a);
    }

    public final String toString() {
        return "Loading(progress=" + this.f50229a + ")";
    }
}
