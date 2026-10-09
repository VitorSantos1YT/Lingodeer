package j0;

import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class p1 extends y2.d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f35377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f35378b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f35379c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f35380d;

    public p1(float f5, float f11, float f12, float f13) {
        this.f35377a = f5;
        this.f35378b = f11;
        this.f35379c = f12;
        this.f35380d = f13;
        boolean z11 = true;
        boolean z12 = (f5 >= CropImageView.DEFAULT_ASPECT_RATIO || Float.isNaN(f5)) & (f11 >= CropImageView.DEFAULT_ASPECT_RATIO || Float.isNaN(f11)) & (f12 >= CropImageView.DEFAULT_ASPECT_RATIO || Float.isNaN(f12));
        if (f13 < CropImageView.DEFAULT_ASPECT_RATIO && !Float.isNaN(f13)) {
            z11 = false;
        }
        if (!z12 || !z11) {
            k0.a.a("Padding must be non-negative");
        }
    }

    public final boolean equals(Object obj) {
        p1 p1Var = obj instanceof p1 ? (p1) obj : null;
        return p1Var != null && v3.f.b(this.f35377a, p1Var.f35377a) && v3.f.b(this.f35378b, p1Var.f35378b) && v3.f.b(this.f35379c, p1Var.f35379c) && v3.f.b(this.f35380d, p1Var.f35380d);
    }

    @Override // y2.d1
    public final z1.q f() {
        q1 q1Var = new q1();
        q1Var.Q = this.f35377a;
        q1Var.R = this.f35378b;
        q1Var.S = this.f35379c;
        q1Var.T = this.f35380d;
        q1Var.U = true;
        return q1Var;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + defpackage.e.a(defpackage.e.a(defpackage.e.a(Float.hashCode(this.f35377a) * 31, this.f35378b, 31), this.f35379c, 31), this.f35380d, 31);
    }

    @Override // y2.d1
    public final void j(z1.q qVar) {
        q1 q1Var = (q1) qVar;
        q1Var.Q = this.f35377a;
        q1Var.R = this.f35378b;
        q1Var.S = this.f35379c;
        q1Var.T = this.f35380d;
        q1Var.U = true;
    }
}
