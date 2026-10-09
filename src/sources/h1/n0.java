package h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f30711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f30712b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f30713c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f30714d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f30715e;

    public n0(float f5, float f11, float f12, float f13, float f14) {
        this.f30711a = f5;
        this.f30712b = f11;
        this.f30713c = f12;
        this.f30714d = f13;
        this.f30715e = f14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        return v3.f.b(this.f30711a, n0Var.f30711a) && v3.f.b(this.f30712b, n0Var.f30712b) && v3.f.b(this.f30713c, n0Var.f30713c) && v3.f.b(this.f30714d, n0Var.f30714d) && v3.f.b(this.f30715e, n0Var.f30715e);
    }

    public final int hashCode() {
        return Float.hashCode(this.f30715e) + defpackage.e.a(defpackage.e.a(defpackage.e.a(Float.hashCode(this.f30711a) * 31, this.f30712b, 31), this.f30713c, 31), this.f30714d, 31);
    }
}
