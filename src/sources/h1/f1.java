package h1;

import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f1 extends kotlin.jvm.internal.n implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w2.g1 f30223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f30224b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f30225c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w2.g1 f30226d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f30227e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ w2.g1 f30228f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f30229t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(w2.g1 g1Var, int i11, int i12, w2.g1 g1Var2, int i13, w2.g1 g1Var3, int i14) {
        super(1);
        this.f30223a = g1Var;
        this.f30224b = i11;
        this.f30225c = i12;
        this.f30226d = g1Var2;
        this.f30227e = i13;
        this.f30228f = g1Var3;
        this.f30229t = i14;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        w2.f1 f1Var = (w2.f1) obj;
        int i11 = this.f30225c;
        w2.g1 g1Var = this.f30223a;
        if (g1Var != null) {
            w2.f1.k(f1Var, g1Var, 0, Math.round((1 + CropImageView.DEFAULT_ASPECT_RATIO) * ((i11 - this.f30224b) / 2.0f)));
        }
        w2.g1 g1Var2 = this.f30226d;
        int i12 = this.f30227e;
        w2.f1.k(f1Var, g1Var2, i12, 0);
        w2.g1 g1Var3 = this.f30228f;
        if (g1Var3 != null) {
            w2.f1.k(f1Var, g1Var3, i12 + g1Var2.f54501a, Math.round((1 + CropImageView.DEFAULT_ASPECT_RATIO) * ((i11 - this.f30229t) / 2.0f)));
        }
        return qy.b0.f48488a;
    }
}
