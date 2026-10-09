package kw;

import com.yalantis.ucrop.view.CropImageView;
import d0.o1;
import l1.b1;
import l1.g0;
import l1.g1;
import l1.k1;
import l1.t;
import rz.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f38864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b1 f38865b;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final g1 f38870g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final g1 f38871h;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g0 f38866c = t.s(new e(this, 1));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k1 f38867d = t.B(Boolean.FALSE);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g1 f38868e = new g1(CropImageView.DEFAULT_ASPECT_RATIO);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g1 f38869f = new g1(CropImageView.DEFAULT_ASPECT_RATIO);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final o1 f38872i = new o1();

    public h(b0 b0Var, b1 b1Var, float f5, float f11) {
        this.f38864a = b0Var;
        this.f38865b = b1Var;
        this.f38870g = new g1(f11);
        this.f38871h = new g1(f5);
    }

    public final float a() {
        return ((Number) this.f38866c.getValue()).floatValue();
    }

    public final boolean b() {
        return ((Boolean) this.f38867d.getValue()).booleanValue();
    }
}
