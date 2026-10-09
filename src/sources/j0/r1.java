package j0;

import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class r1 implements t1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f35399b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f35400c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f35401d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f35402e;

    public r1() {
        float f5 = 0;
        float f11 = 0;
        float f12 = 0;
        float f13 = 0;
        this.f35399b = f5;
        this.f35400c = f11;
        this.f35401d = f12;
        this.f35402e = f13;
        if (!(f13 >= CropImageView.DEFAULT_ASPECT_RATIO) || !((((f5 > CropImageView.DEFAULT_ASPECT_RATIO ? 1 : (f5 == CropImageView.DEFAULT_ASPECT_RATIO ? 0 : -1)) >= 0) & ((f11 > CropImageView.DEFAULT_ASPECT_RATIO ? 1 : (f11 == CropImageView.DEFAULT_ASPECT_RATIO ? 0 : -1)) >= 0)) & ((f12 > CropImageView.DEFAULT_ASPECT_RATIO ? 1 : (f12 == CropImageView.DEFAULT_ASPECT_RATIO ? 0 : -1)) >= 0))) {
            k0.a.a("Padding must be non-negative");
        }
    }

    @Override // j0.t1
    public final float a() {
        return this.f35402e;
    }

    @Override // j0.t1
    public final float b(v3.m mVar) {
        return this.f35399b;
    }

    @Override // j0.t1
    public final float c() {
        return this.f35400c;
    }

    @Override // j0.t1
    public final float d(v3.m mVar) {
        return this.f35401d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof r1)) {
            return false;
        }
        r1 r1Var = (r1) obj;
        return v3.f.b(this.f35399b, r1Var.f35399b) && v3.f.b(this.f35400c, r1Var.f35400c) && v3.f.b(this.f35401d, r1Var.f35401d) && v3.f.b(this.f35402e, r1Var.f35402e);
    }

    public final int hashCode() {
        return Float.hashCode(this.f35402e) + defpackage.e.a(defpackage.e.a(Float.hashCode(this.f35399b) * 31, this.f35400c, 31), this.f35401d, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PaddingValues.Absolute(left=");
        com.google.android.material.datepicker.d.s(this.f35399b, ", top=", sb2);
        com.google.android.material.datepicker.d.s(this.f35400c, ", right=", sb2);
        com.google.android.material.datepicker.d.s(this.f35401d, ", bottom=", sb2);
        sb2.append((Object) v3.f.c(this.f35402e));
        sb2.append(')');
        return sb2.toString();
    }
}
