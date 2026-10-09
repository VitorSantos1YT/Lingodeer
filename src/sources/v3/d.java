package v3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f53484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f53485b;

    public d(float f5, float f11) {
        this.f53484a = f5;
        this.f53485b = f11;
    }

    @Override // v3.c
    public final float Z() {
        return this.f53485b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Float.compare(this.f53484a, dVar.f53484a) == 0 && Float.compare(this.f53485b, dVar.f53485b) == 0;
    }

    @Override // v3.c
    public final float getDensity() {
        return this.f53484a;
    }

    public final int hashCode() {
        return Float.hashCode(this.f53485b) + (Float.hashCode(this.f53484a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DensityImpl(density=");
        sb2.append(this.f53484a);
        sb2.append(", fontScale=");
        return defpackage.e.o(sb2, this.f53485b, ')');
    }
}
