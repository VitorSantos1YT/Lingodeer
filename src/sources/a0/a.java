package a0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f10a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f11b;

    public a(float f5, float f11) {
        this.f10a = f5;
        this.f11b = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Float.compare(this.f10a, aVar.f10a) == 0 && Float.compare(this.f11b, aVar.f11b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f11b) + (Float.hashCode(this.f10a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FlingResult(distanceCoefficient=");
        sb2.append(this.f10a);
        sb2.append(", velocityCoefficient=");
        return defpackage.e.o(sb2, this.f11b, ')');
    }
}
