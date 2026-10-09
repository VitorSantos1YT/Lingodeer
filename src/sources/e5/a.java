package e5;

import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f24836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f24837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f24838c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f24839d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f24840e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f24841f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f24842g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f24843h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f24844i;

    public final float a(long j11) {
        long j12 = this.f24840e;
        if (j11 < j12) {
            return CropImageView.DEFAULT_ASPECT_RATIO;
        }
        long j13 = this.f24842g;
        if (j13 < 0 || j11 < j13) {
            return f.h((j11 - j12) / this.f24836a, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f) * 0.5f;
        }
        float f5 = this.f24843h;
        return (f.h((j11 - j13) / this.f24844i, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f) * f5) + (1.0f - f5);
    }
}
