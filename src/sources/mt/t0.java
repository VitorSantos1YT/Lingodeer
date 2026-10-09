package mt;

import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class t0 implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w2.g1 f41901b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w2.g1 f41902c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f41903d;

    public /* synthetic */ t0(w2.g1 g1Var, w2.g1 g1Var2, int i11, int i12) {
        this.f41900a = i12;
        this.f41901b = g1Var;
        this.f41902c = g1Var2;
        this.f41903d = i11;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        w2.f1 layout = (w2.f1) obj;
        switch (this.f41900a) {
            case 0:
                kotlin.jvm.internal.m.f(layout, "$this$layout");
                w2.f1.k(layout, this.f41901b, 0, 0);
                w2.g1 g1Var = this.f41902c;
                w2.f1.k(layout, g1Var, 0, (this.f41903d - g1Var.f54502b) / 2);
                break;
            default:
                kotlin.jvm.internal.m.f(layout, "$this$layout");
                w2.f1.i(layout, this.f41901b, 0L);
                layout.f(this.f41902c, this.f41903d, 0, CropImageView.DEFAULT_ASPECT_RATIO);
                break;
        }
        return qy.b0.f48488a;
    }
}
