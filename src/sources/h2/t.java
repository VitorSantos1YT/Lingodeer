package h2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f31531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f31532b;

    public t(float f5, float f11) {
        this.f31531a = f5;
        this.f31532b = f11;
    }

    public final float[] a() {
        float f5 = this.f31531a;
        float f11 = this.f31532b;
        return new float[]{f5 / f11, 1.0f, ((1.0f - f5) - f11) / f11};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return Float.compare(this.f31531a, tVar.f31531a) == 0 && Float.compare(this.f31532b, tVar.f31532b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f31532b) + (Float.hashCode(this.f31531a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("WhitePoint(x=");
        sb2.append(this.f31531a);
        sb2.append(", y=");
        return defpackage.e.o(sb2, this.f31532b, ')');
    }
}
