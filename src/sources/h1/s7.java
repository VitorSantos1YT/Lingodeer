package h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class s7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f31058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f31059b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f31060c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f31061d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f31062e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f31063f;

    public s7(float f5, float f11, float f12, float f13, float f14, float f15) {
        this.f31058a = f5;
        this.f31059b = f11;
        this.f31060c = f12;
        this.f31061d = f13;
        this.f31062e = f14;
        this.f31063f = f15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof s7)) {
            return false;
        }
        s7 s7Var = (s7) obj;
        return v3.f.b(this.f31058a, s7Var.f31058a) && v3.f.b(this.f31059b, s7Var.f31059b) && v3.f.b(this.f31060c, s7Var.f31060c) && v3.f.b(this.f31061d, s7Var.f31061d) && v3.f.b(this.f31063f, s7Var.f31063f);
    }

    public final int hashCode() {
        return Float.hashCode(this.f31063f) + defpackage.e.a(defpackage.e.a(defpackage.e.a(Float.hashCode(this.f31058a) * 31, this.f31059b, 31), this.f31060c, 31), this.f31061d, 31);
    }
}
