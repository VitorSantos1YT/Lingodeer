package j0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class d2 extends y2.d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f35270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f35271b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f35272c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f35273d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f35274e;

    public d2(float f5, float f11, float f12, float f13, boolean z11) {
        this.f35270a = f5;
        this.f35271b = f11;
        this.f35272c = f12;
        this.f35273d = f13;
        this.f35274e = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d2)) {
            return false;
        }
        d2 d2Var = (d2) obj;
        return v3.f.b(this.f35270a, d2Var.f35270a) && v3.f.b(this.f35271b, d2Var.f35271b) && v3.f.b(this.f35272c, d2Var.f35272c) && v3.f.b(this.f35273d, d2Var.f35273d) && this.f35274e == d2Var.f35274e;
    }

    @Override // y2.d1
    public final z1.q f() {
        f2 f2Var = new f2();
        f2Var.Q = this.f35270a;
        f2Var.R = this.f35271b;
        f2Var.S = this.f35272c;
        f2Var.T = this.f35273d;
        f2Var.U = this.f35274e;
        return f2Var;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f35274e) + defpackage.e.a(defpackage.e.a(defpackage.e.a(Float.hashCode(this.f35270a) * 31, this.f35271b, 31), this.f35272c, 31), this.f35273d, 31);
    }

    @Override // y2.d1
    public final void j(z1.q qVar) {
        f2 f2Var = (f2) qVar;
        f2Var.Q = this.f35270a;
        f2Var.R = this.f35271b;
        f2Var.S = this.f35272c;
        f2Var.T = this.f35273d;
        f2Var.U = this.f35274e;
    }

    public /* synthetic */ d2(float f5, float f11, float f12, float f13, boolean z11, int i11) {
        this((i11 & 1) != 0 ? Float.NaN : f5, (i11 & 2) != 0 ? Float.NaN : f11, (i11 & 4) != 0 ? Float.NaN : f12, (i11 & 8) != 0 ? Float.NaN : f13, z11);
    }
}
