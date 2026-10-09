package iv;

import com.yalantis.ucrop.view.CropImageView;
import rt.x4;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class m implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f34783b;

    public /* synthetic */ m(int i11, float f5) {
        this.f34782a = i11;
        this.f34783b = f5;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        switch (this.f34782a) {
            case 0:
                g2.t0 placeRelativeWithLayer = (g2.t0) obj;
                kotlin.jvm.internal.m.f(placeRelativeWithLayer, "$this$placeRelativeWithLayer");
                float f5 = this.f34783b;
                placeRelativeWithLayer.h(f5);
                placeRelativeWithLayer.i(f5);
                placeRelativeWithLayer.p(g2.f0.j(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO));
                return qy.b0.f48488a;
            case 1:
                g2.t0 graphicsLayer = (g2.t0) obj;
                kotlin.jvm.internal.m.f(graphicsLayer, "$this$graphicsLayer");
                float f11 = this.f34783b;
                graphicsLayer.b(f11);
                float f12 = (f11 * 0.04f) + 0.96f;
                graphicsLayer.h(f12);
                graphicsLayer.i(f12);
                return qy.b0.f48488a;
            case 2:
                x4 it = (x4) obj;
                kotlin.jvm.internal.m.f(it, "it");
                return x4.a(it, null, 0, 0, CropImageView.DEFAULT_ASPECT_RATIO, null, false, null, false, CropImageView.DEFAULT_ASPECT_RATIO, 0, com.bumptech.glide.e.x(this.f34783b), CropImageView.DEFAULT_ASPECT_RATIO, 3071);
            case 3:
                x4 it2 = (x4) obj;
                kotlin.jvm.internal.m.f(it2, "it");
                return x4.a(it2, null, 0, 0, CropImageView.DEFAULT_ASPECT_RATIO, null, false, null, false, CropImageView.DEFAULT_ASPECT_RATIO, 0, CropImageView.DEFAULT_ASPECT_RATIO, com.bumptech.glide.e.x(this.f34783b), 2047);
            default:
                x4 it3 = (x4) obj;
                kotlin.jvm.internal.m.f(it3, "it");
                return x4.a(it3, null, 0, 0, CropImageView.DEFAULT_ASPECT_RATIO, null, false, null, false, this.f34783b, 0, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 3839);
        }
    }
}
