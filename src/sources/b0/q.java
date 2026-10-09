package b0;

import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class q extends s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f3640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f3641b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f3642c;

    public q(float f5, float f11, float f12) {
        this.f3640a = f5;
        this.f3641b = f11;
        this.f3642c = f12;
    }

    @Override // b0.s
    public final float a(int i11) {
        if (i11 == 0) {
            return this.f3640a;
        }
        if (i11 != 1) {
            return i11 != 2 ? CropImageView.DEFAULT_ASPECT_RATIO : this.f3642c;
        }
        return this.f3641b;
    }

    @Override // b0.s
    public final int b() {
        return 3;
    }

    @Override // b0.s
    public final s c() {
        return new q(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO);
    }

    @Override // b0.s
    public final void d() {
        this.f3640a = CropImageView.DEFAULT_ASPECT_RATIO;
        this.f3641b = CropImageView.DEFAULT_ASPECT_RATIO;
        this.f3642c = CropImageView.DEFAULT_ASPECT_RATIO;
    }

    @Override // b0.s
    public final void e(int i11, float f5) {
        if (i11 == 0) {
            this.f3640a = f5;
        } else if (i11 == 1) {
            this.f3641b = f5;
        } else {
            if (i11 != 2) {
                return;
            }
            this.f3642c = f5;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return qVar.f3640a == this.f3640a && qVar.f3641b == this.f3641b && qVar.f3642c == this.f3642c;
    }

    public final int hashCode() {
        return Float.hashCode(this.f3642c) + defpackage.e.a(Float.hashCode(this.f3640a) * 31, this.f3641b, 31);
    }

    public final String toString() {
        return "AnimationVector3D: v1 = " + this.f3640a + ", v2 = " + this.f3641b + ", v3 = " + this.f3642c;
    }
}
