package j0;

import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class v1 implements t1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f35426b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f35427c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f35428d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f35429e;

    public v1(float f5, float f11, float f12, float f13) {
        this.f35426b = f5;
        this.f35427c = f11;
        this.f35428d = f12;
        this.f35429e = f13;
        if (!((f5 >= CropImageView.DEFAULT_ASPECT_RATIO) & (f11 >= CropImageView.DEFAULT_ASPECT_RATIO) & (f12 >= CropImageView.DEFAULT_ASPECT_RATIO)) || !(f13 >= CropImageView.DEFAULT_ASPECT_RATIO)) {
            k0.a.a("Padding must be non-negative");
        }
    }

    @Override // j0.t1
    public final float a() {
        return this.f35429e;
    }

    @Override // j0.t1
    public final float b(v3.m mVar) {
        return mVar == v3.m.Ltr ? this.f35426b : this.f35428d;
    }

    @Override // j0.t1
    public final float c() {
        return this.f35427c;
    }

    @Override // j0.t1
    public final float d(v3.m mVar) {
        return mVar == v3.m.Ltr ? this.f35428d : this.f35426b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof v1)) {
            return false;
        }
        v1 v1Var = (v1) obj;
        return v3.f.b(this.f35426b, v1Var.f35426b) && v3.f.b(this.f35427c, v1Var.f35427c) && v3.f.b(this.f35428d, v1Var.f35428d) && v3.f.b(this.f35429e, v1Var.f35429e);
    }

    public final int hashCode() {
        return Float.hashCode(this.f35429e) + defpackage.e.a(defpackage.e.a(Float.hashCode(this.f35426b) * 31, this.f35427c, 31), this.f35428d, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PaddingValues(start=");
        com.google.android.material.datepicker.d.s(this.f35426b, ", top=", sb2);
        com.google.android.material.datepicker.d.s(this.f35427c, ", end=", sb2);
        com.google.android.material.datepicker.d.s(this.f35428d, ", bottom=", sb2);
        sb2.append((Object) v3.f.c(this.f35429e));
        sb2.append(')');
        return sb2.toString();
    }
}
