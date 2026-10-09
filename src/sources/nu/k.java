package nu;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f44082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f44083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f44084c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f44085d;

    public k(float f5, float f11, float f12, float f13) {
        this.f44082a = f5;
        this.f44083b = f11;
        this.f44084c = f12;
        this.f44085d = f13;
    }

    public final long a() {
        float f5 = this.f44084c;
        float f11 = this.f44082a;
        float f12 = 2;
        float f13 = ((f5 - f11) / f12) + f11;
        float f14 = this.f44085d;
        float f15 = this.f44083b;
        return (((long) Float.floatToRawIntBits(((f14 - f15) / f12) + f15)) & 4294967295L) | (Float.floatToRawIntBits(f13) << 32);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return Float.compare(this.f44082a, kVar.f44082a) == 0 && Float.compare(this.f44083b, kVar.f44083b) == 0 && Float.compare(this.f44084c, kVar.f44084c) == 0 && Float.compare(this.f44085d, kVar.f44085d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f44085d) + defpackage.e.a(defpackage.e.a(Float.hashCode(this.f44082a) * 31, this.f44083b, 31), this.f44084c, 31);
    }

    public final String toString() {
        return "RectF(left=" + this.f44082a + ", top=" + this.f44083b + ", right=" + this.f44084c + ", bottom=" + this.f44085d + ")";
    }
}
