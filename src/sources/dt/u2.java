package dt;

import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class u2 implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l1.g1 f24241b;

    public /* synthetic */ u2(l1.g1 g1Var, int i11) {
        this.f24240a = i11;
        this.f24241b = g1Var;
    }

    @Override // fz.a
    public final Object invoke() {
        int i11 = this.f24240a;
        l1.g1 g1Var = this.f24241b;
        switch (i11) {
            case 0:
                l1.c3 c3Var = v2.f24275a;
                g1Var.m(CropImageView.DEFAULT_ASPECT_RATIO);
                return qy.b0.f48488a;
            default:
                return Float.valueOf(g1Var.l());
        }
    }
}
