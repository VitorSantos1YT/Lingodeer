package y2;

import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f56985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f56986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f56987c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f56988d;

    public p(float f5, float f11, float f12, float f13) {
        this.f56985a = f5;
        this.f56986b = f11;
        this.f56987c = f12;
        this.f56988d = f13;
        if (f5 < CropImageView.DEFAULT_ASPECT_RATIO) {
            v2.a.a("Left must be non-negative");
        }
        if (f11 < CropImageView.DEFAULT_ASPECT_RATIO) {
            v2.a.a("Top must be non-negative");
        }
        if (f12 < CropImageView.DEFAULT_ASPECT_RATIO) {
            v2.a.a("Right must be non-negative");
        }
        if (f13 >= CropImageView.DEFAULT_ASPECT_RATIO) {
            return;
        }
        v2.a.a("Bottom must be non-negative");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return v3.f.b(this.f56985a, pVar.f56985a) && v3.f.b(this.f56986b, pVar.f56986b) && v3.f.b(this.f56987c, pVar.f56987c) && v3.f.b(this.f56988d, pVar.f56988d);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + defpackage.e.a(defpackage.e.a(defpackage.e.a(Float.hashCode(this.f56985a) * 31, this.f56986b, 31), this.f56987c, 31), this.f56988d, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DpTouchBoundsExpansion(start=");
        com.google.android.material.datepicker.d.s(this.f56985a, ", top=", sb2);
        com.google.android.material.datepicker.d.s(this.f56986b, ", end=", sb2);
        com.google.android.material.datepicker.d.s(this.f56987c, ", bottom=", sb2);
        sb2.append((Object) v3.f.c(this.f56988d));
        sb2.append(", isLayoutDirectionAware=true)");
        return sb2.toString();
    }
}
