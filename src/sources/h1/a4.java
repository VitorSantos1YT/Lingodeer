package h1;

import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a4 extends kotlin.jvm.internal.n implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f29971b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f29972c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a4(float f5, int i11, long j11) {
        super(1);
        this.f29970a = i11;
        this.f29971b = f5;
        this.f29972c = j11;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        switch (this.f29970a) {
            case 0:
                i2.d dVar = (i2.d) obj;
                float f5 = this.f29971b;
                float f11 = 2;
                dVar.f0(this.f29972c, com.bumptech.glide.d.c(CropImageView.DEFAULT_ASPECT_RATIO, dVar.e0(f5) / f11), com.bumptech.glide.d.c(f2.e.d(dVar.d()), dVar.e0(f5) / f11), (480 & 8) != 0 ? 0.0f : dVar.e0(f5), (480 & 16) != 0 ? 0 : 0, (480 & 32) != 0 ? null : null, 3);
                break;
            default:
                i2.d dVar2 = (i2.d) obj;
                float f12 = this.f29971b;
                float f13 = 2;
                dVar2.f0(this.f29972c, com.bumptech.glide.d.c(dVar2.e0(f12) / f13, CropImageView.DEFAULT_ASPECT_RATIO), com.bumptech.glide.d.c(dVar2.e0(f12) / f13, f2.e.b(dVar2.d())), (480 & 8) != 0 ? 0.0f : dVar2.e0(f12), (480 & 16) != 0 ? 0 : 0, (480 & 32) != 0 ? null : null, 3);
                break;
        }
        return qy.b0.f48488a;
    }
}
