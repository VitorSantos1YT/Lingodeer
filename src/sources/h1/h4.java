package h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f30328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f30329b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f30330c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f30331d;

    public h4(float f5, float f11, float f12, float f13) {
        this.f30328a = f5;
        this.f30329b = f11;
        this.f30330c = f12;
        this.f30331d = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof h4)) {
            return false;
        }
        h4 h4Var = (h4) obj;
        if (v3.f.b(this.f30328a, h4Var.f30328a) && v3.f.b(this.f30329b, h4Var.f30329b) && v3.f.b(this.f30330c, h4Var.f30330c)) {
            return v3.f.b(this.f30331d, h4Var.f30331d);
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f30331d) + defpackage.e.a(defpackage.e.a(Float.hashCode(this.f30328a) * 31, this.f30329b, 31), this.f30330c, 31);
    }
}
