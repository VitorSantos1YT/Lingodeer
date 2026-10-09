package h1;

import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class cc {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final qp.o2 f30109d = w1.j.b(x1.f31286c0, o0.Y);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l1.g1 f30110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l1.g1 f30111b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l1.g1 f30112c;

    public cc(float f5, float f11, float f12) {
        this.f30110a = new l1.g1(f5);
        this.f30111b = new l1.g1(f12);
        this.f30112c = new l1.g1(f11);
    }

    public final float a() {
        l1.g1 g1Var = this.f30110a;
        return g1Var.l() == CropImageView.DEFAULT_ASPECT_RATIO ? CropImageView.DEFAULT_ASPECT_RATIO : this.f30112c.l() / g1Var.l();
    }

    public final void b(float f5) {
        this.f30112c.m(hz.b.k(f5, this.f30110a.l(), CropImageView.DEFAULT_ASPECT_RATIO));
    }
}
