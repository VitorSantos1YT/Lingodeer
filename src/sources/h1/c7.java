package h1;

import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c7 extends kotlin.jvm.internal.n implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f30086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f30087b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c7(long j11, int i11) {
        super(1);
        this.f30086a = j11;
        this.f30087b = i11;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        i2.d dVar = (i2.d) obj;
        float fMin = Math.min(dVar.e0(w6.f31238e), f2.e.b(dVar.d()));
        float fB = (f2.e.b(dVar.d()) - fMin) / 2;
        long j11 = this.f30086a;
        if (this.f30087b == 1) {
            float f5 = fMin / 2.0f;
            i2.d.j(dVar, j11, f5, com.bumptech.glide.d.c((f2.e.d(dVar.d()) - f5) - fB, f2.e.b(dVar.d()) / 2.0f), null, 0, 120);
        } else {
            i2.d.U(dVar, j11, com.bumptech.glide.d.c((f2.e.d(dVar.d()) - fMin) - fB, (f2.e.b(dVar.d()) - fMin) / 2.0f), com.bumptech.glide.g.b(fMin, fMin), CropImageView.DEFAULT_ASPECT_RATIO, 120);
        }
        return qy.b0.f48488a;
    }
}
