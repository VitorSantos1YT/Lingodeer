package f2;

import cf.x;
import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f26566a = CropImageView.DEFAULT_ASPECT_RATIO;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f26567b = CropImageView.DEFAULT_ASPECT_RATIO;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f26568c = CropImageView.DEFAULT_ASPECT_RATIO;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f26569d = CropImageView.DEFAULT_ASPECT_RATIO;

    public final void a(float f5, float f11, float f12, float f13) {
        this.f26566a = Math.max(f5, this.f26566a);
        this.f26567b = Math.max(f11, this.f26567b);
        this.f26568c = Math.min(f12, this.f26568c);
        this.f26569d = Math.min(f13, this.f26569d);
    }

    public final boolean b() {
        return (this.f26566a >= this.f26568c) | (this.f26567b >= this.f26569d);
    }

    public final void c(long j11) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j11 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j11 & 4294967295L));
        this.f26566a += fIntBitsToFloat;
        this.f26567b += fIntBitsToFloat2;
        this.f26568c += fIntBitsToFloat;
        this.f26569d += fIntBitsToFloat2;
    }

    public final String toString() {
        return "MutableRect(" + x.P(this.f26566a) + ", " + x.P(this.f26567b) + ", " + x.P(this.f26568c) + ", " + x.P(this.f26569d) + ')';
    }
}
