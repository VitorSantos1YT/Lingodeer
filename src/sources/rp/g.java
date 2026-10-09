package rp;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f49348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f49349b;

    public g(float f5, boolean z11) {
        this.f49348a = f5;
        this.f49349b = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Float.compare(this.f49348a, gVar.f49348a) == 0 && this.f49349b == gVar.f49349b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f49349b) + (Float.hashCode(this.f49348a) * 31);
    }

    public final String toString() {
        return "Success(progress=" + this.f49348a + ", completed=" + this.f49349b + ")";
    }
}
