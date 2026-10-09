package b0;

import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f3626a;

    public o(float f5) {
        this.f3626a = f5;
    }

    @Override // b0.s
    public final float a(int i11) {
        return i11 == 0 ? this.f3626a : CropImageView.DEFAULT_ASPECT_RATIO;
    }

    @Override // b0.s
    public final int b() {
        return 1;
    }

    @Override // b0.s
    public final s c() {
        return new o(CropImageView.DEFAULT_ASPECT_RATIO);
    }

    @Override // b0.s
    public final void d() {
        this.f3626a = CropImageView.DEFAULT_ASPECT_RATIO;
    }

    @Override // b0.s
    public final void e(int i11, float f5) {
        if (i11 == 0) {
            this.f3626a = f5;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof o) && ((o) obj).f3626a == this.f3626a;
    }

    public final int hashCode() {
        return Float.hashCode(this.f3626a);
    }

    public final String toString() {
        return "AnimationVector1D: value = " + this.f3626a;
    }
}
