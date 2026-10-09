package c1;

import com.yalantis.ucrop.view.CropImageView;
import qy.b0;
import w2.f1;
import w2.g1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g1 f6470b;

    public /* synthetic */ i(g1 g1Var, int i11) {
        this.f6469a = i11;
        this.f6470b = g1Var;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        f1 layout = (f1) obj;
        switch (this.f6469a) {
            case 0:
                layout.f(this.f6470b, 0, 0, CropImageView.DEFAULT_ASPECT_RATIO);
                break;
            case 1:
                layout.f(this.f6470b, 0, 0, CropImageView.DEFAULT_ASPECT_RATIO);
                break;
            case 2:
                f1.k(layout, this.f6470b, 0, 0);
                break;
            case 3:
                f1.k(layout, this.f6470b, 0, 0);
                break;
            case 4:
                f1.k(layout, this.f6470b, 0, 0);
                break;
            case 5:
                v3.m mVarC = layout.c();
                v3.m mVar = v3.m.Ltr;
                g1 g1Var = this.f6470b;
                if (mVarC == mVar || layout.e() == 0) {
                    f1.a(layout, g1Var);
                    g1Var.i0(v3.j.e(0L, g1Var.f54505e), CropImageView.DEFAULT_ASPECT_RATIO, null);
                } else {
                    int i11 = (int) 0;
                    long jE = ((long) ((layout.e() - g1Var.f54501a) - i11)) << 32;
                    f1.a(layout, g1Var);
                    g1Var.i0(v3.j.e((((long) i11) & 4294967295L) | jE, g1Var.f54505e), CropImageView.DEFAULT_ASPECT_RATIO, null);
                }
                return b0.f48488a;
            case 6:
                f1.k(layout, this.f6470b, 0, 0);
                break;
            case 7:
                f1.k(layout, this.f6470b, 0, 0);
                break;
            case 8:
                layout.f(this.f6470b, 0, 0, CropImageView.DEFAULT_ASPECT_RATIO);
                break;
            case 9:
                layout.f(this.f6470b, 0, 0, CropImageView.DEFAULT_ASPECT_RATIO);
                break;
            case 10:
                f1.k(layout, this.f6470b, 0, 0);
                break;
            case 11:
                kotlin.jvm.internal.m.f(layout, "$this$layout");
                layout.f(this.f6470b, 0, 0, CropImageView.DEFAULT_ASPECT_RATIO);
                break;
            case 12:
                layout.f(this.f6470b, 0, 0, CropImageView.DEFAULT_ASPECT_RATIO);
                break;
            default:
                f1.k(layout, this.f6470b, 0, 0);
                break;
        }
        return b0.f48488a;
    }
}
