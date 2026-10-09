package b0;

import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class r extends s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f3651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f3652b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f3653c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f3654d;

    public r(float f5, float f11, float f12, float f13) {
        this.f3651a = f5;
        this.f3652b = f11;
        this.f3653c = f12;
        this.f3654d = f13;
    }

    @Override // b0.s
    public final float a(int i11) {
        if (i11 == 0) {
            return this.f3651a;
        }
        if (i11 == 1) {
            return this.f3652b;
        }
        if (i11 != 2) {
            return i11 != 3 ? CropImageView.DEFAULT_ASPECT_RATIO : this.f3654d;
        }
        return this.f3653c;
    }

    @Override // b0.s
    public final int b() {
        return 4;
    }

    @Override // b0.s
    public final s c() {
        return new r(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO);
    }

    @Override // b0.s
    public final void d() {
        this.f3651a = CropImageView.DEFAULT_ASPECT_RATIO;
        this.f3652b = CropImageView.DEFAULT_ASPECT_RATIO;
        this.f3653c = CropImageView.DEFAULT_ASPECT_RATIO;
        this.f3654d = CropImageView.DEFAULT_ASPECT_RATIO;
    }

    @Override // b0.s
    public final void e(int i11, float f5) {
        if (i11 == 0) {
            this.f3651a = f5;
            return;
        }
        if (i11 == 1) {
            this.f3652b = f5;
        } else if (i11 == 2) {
            this.f3653c = f5;
        } else {
            if (i11 != 3) {
                return;
            }
            this.f3654d = f5;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return rVar.f3651a == this.f3651a && rVar.f3652b == this.f3652b && rVar.f3653c == this.f3653c && rVar.f3654d == this.f3654d;
    }

    public final int hashCode() {
        return Float.hashCode(this.f3654d) + defpackage.e.a(defpackage.e.a(Float.hashCode(this.f3651a) * 31, this.f3652b, 31), this.f3653c, 31);
    }

    public final String toString() {
        return "AnimationVector4D: v1 = " + this.f3651a + ", v2 = " + this.f3652b + ", v3 = " + this.f3653c + ", v4 = " + this.f3654d;
    }
}
