package j1;

import com.yalantis.ucrop.view.CropImageView;
import g2.t0;
import g2.w0;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends kotlin.jvm.internal.n implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f35479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f35480b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f35481c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f35482d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w0 f35483e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(q qVar, boolean z11, float f5, float f11, w0 w0Var) {
        super(1);
        this.f35479a = qVar;
        this.f35480b = z11;
        this.f35481c = f5;
        this.f35482d = f11;
        this.f35483e = w0Var;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        t0 t0Var = (t0) obj;
        s sVar = (s) this.f35479a;
        float fFloatValue = ((Number) sVar.f35513a.d()).floatValue();
        float density = CropImageView.DEFAULT_ASPECT_RATIO;
        boolean z11 = fFloatValue > CropImageView.DEFAULT_ASPECT_RATIO || this.f35480b;
        t0Var.r((((Number) sVar.f35513a.d()).floatValue() * t0Var.n0(this.f35481c)) - f2.e.b(t0Var.Q));
        if (z11) {
            density = t0Var.R.getDensity() * this.f35482d;
        }
        t0Var.k(density);
        t0Var.l(this.f35483e);
        t0Var.e(true);
        return b0.f48488a;
    }
}
