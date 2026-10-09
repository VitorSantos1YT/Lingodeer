package h1;

import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class i2 extends kotlin.jvm.internal.n implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f30398b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i2(int i11, l1.b1 b1Var) {
        super(1);
        this.f30397a = i11;
        this.f30398b = b1Var;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        int i11 = this.f30397a;
        qy.b0 b0Var = qy.b0.f48488a;
        l1.b1 b1Var = this.f30398b;
        switch (i11) {
            case 0:
                g3.b0 b0Var2 = (g3.b0) obj;
                if (!oz.q.K0((CharSequence) b1Var.getValue())) {
                    String str = (String) b1Var.getValue();
                    mz.j[] jVarArr = g3.z.f28737a;
                    b0Var2.b(g3.x.L, str);
                }
                break;
            default:
                y2.k0 k0Var = (y2.k0) obj;
                k0Var.a();
                float fE0 = k0Var.e0(((d0.v) b1Var.getValue()).f22811a);
                i2.b bVar = k0Var.f56937a;
                float fB = f2.e.b(bVar.d()) - (fE0 / 2);
                i2.d.F(k0Var, ((d0.v) b1Var.getValue()).f22812b, com.bumptech.glide.d.c(CropImageView.DEFAULT_ASPECT_RATIO, fB), com.bumptech.glide.d.c(f2.e.d(bVar.d()), fB), fE0, CropImageView.DEFAULT_ASPECT_RATIO, 496);
                break;
        }
        return b0Var;
    }
}
