package b0;

import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f3630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f3631b;

    public p(float f5, float f11) {
        this.f3630a = f5;
        this.f3631b = f11;
    }

    @Override // b0.s
    public final float a(int i11) {
        if (i11 != 0) {
            return i11 != 1 ? CropImageView.DEFAULT_ASPECT_RATIO : this.f3631b;
        }
        return this.f3630a;
    }

    @Override // b0.s
    public final int b() {
        return 2;
    }

    @Override // b0.s
    public final s c() {
        return new p(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO);
    }

    @Override // b0.s
    public final void d() {
        this.f3630a = CropImageView.DEFAULT_ASPECT_RATIO;
        this.f3631b = CropImageView.DEFAULT_ASPECT_RATIO;
    }

    @Override // b0.s
    public final void e(int i11, float f5) {
        if (i11 == 0) {
            this.f3630a = f5;
        } else {
            if (i11 != 1) {
                return;
            }
            this.f3631b = f5;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return pVar.f3630a == this.f3630a && pVar.f3631b == this.f3631b;
    }

    public final int hashCode() {
        return Float.hashCode(this.f3631b) + (Float.hashCode(this.f3630a) * 31);
    }

    public final String toString() {
        return "AnimationVector2D: v1 = " + this.f3630a + ", v2 = " + this.f3631b;
    }
}
