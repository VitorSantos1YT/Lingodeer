package i1;

import b0.y1;
import com.yalantis.ucrop.view.CropImageView;
import l1.b3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class z0 extends kotlin.jvm.internal.n implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b3 f34113b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z0(y1 y1Var, int i11) {
        super(0);
        this.f34112a = i11;
        this.f34113b = y1Var;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f34112a) {
            case 0:
                return Boolean.valueOf(((Number) this.f34113b.getValue()).floatValue() > CropImageView.DEFAULT_ASPECT_RATIO);
            default:
                return Boolean.valueOf(((Number) this.f34113b.getValue()).floatValue() > CropImageView.DEFAULT_ASPECT_RATIO);
        }
    }
}
