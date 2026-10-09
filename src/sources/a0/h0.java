package a0;

import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 extends kotlin.jvm.internal.n implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f94a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w2.g1 f95b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h0(w2.g1 g1Var, int i11) {
        super(1);
        this.f94a = i11;
        this.f95b = g1Var;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        switch (this.f94a) {
            case 0:
                ((w2.f1) obj).f(this.f95b, 0, 0, CropImageView.DEFAULT_ASPECT_RATIO);
                break;
            case 1:
                ((w2.f1) obj).f(this.f95b, 0, 0, CropImageView.DEFAULT_ASPECT_RATIO);
                break;
            case 2:
                ((w2.f1) obj).f(this.f95b, 0, 0, CropImageView.DEFAULT_ASPECT_RATIO);
                break;
            case 3:
                w2.f1 layout = (w2.f1) obj;
                kotlin.jvm.internal.m.f(layout, "$this$layout");
                w2.f1.k(layout, this.f95b, 0, 0);
                break;
            case 4:
                w2.f1.k((w2.f1) obj, this.f95b, 0, 0);
                break;
            case 5:
                ((w2.f1) obj).f(this.f95b, 0, 0, CropImageView.DEFAULT_ASPECT_RATIO);
                break;
            case 6:
                w2.f1.l((w2.f1) obj, this.f95b, 0, 0, null, 12);
                break;
            case 7:
                ((w2.f1) obj).f(this.f95b, 0, 0, CropImageView.DEFAULT_ASPECT_RATIO);
                break;
            default:
                w2.f1.k((w2.f1) obj, this.f95b, 0, 0);
                break;
        }
        return qy.b0.f48488a;
    }
}
