package d2;

import com.yalantis.ucrop.view.CropImageView;
import g2.f0;
import g2.s;
import g2.t0;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends kotlin.jvm.internal.n implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f23062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f23063b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f23064c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f23065d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(float f5, float f11, int i11, boolean z11) {
        super(1);
        this.f23062a = f5;
        this.f23063b = f11;
        this.f23064c = i11;
        this.f23065d = z11;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        t0 t0Var = (t0) obj;
        float density = t0Var.R.getDensity() * this.f23062a;
        float density2 = t0Var.R.getDensity() * this.f23063b;
        t0Var.f((density <= CropImageView.DEFAULT_ASPECT_RATIO || density2 <= CropImageView.DEFAULT_ASPECT_RATIO) ? null : new s(density, density2, this.f23064c));
        t0Var.l(f0.f28556b);
        t0Var.e(this.f23065d);
        return b0.f48488a;
    }
}
