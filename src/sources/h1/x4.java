package h1;

import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class x4 extends kotlin.jvm.internal.n implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f31300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b0.p0 f31301b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f31302c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l1.b3 f31303d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l1.b3 f31304e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x4(boolean z11, b0.p0 p0Var, l1.b1 b1Var, b0.y1 y1Var, b0.y1 y1Var2) {
        super(1);
        this.f31300a = z11;
        this.f31301b = p0Var;
        this.f31302c = b1Var;
        this.f31303d = y1Var;
        this.f31304e = y1Var2;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        float fFloatValue;
        g2.t0 t0Var = (g2.t0) obj;
        l1.k1 k1Var = this.f31301b.f3633d;
        float fFloatValue2 = 0.8f;
        l1.b3 b3Var = this.f31303d;
        float fFloatValue3 = 1.0f;
        boolean z11 = this.f31300a;
        if (z11) {
            fFloatValue = ((Boolean) k1Var.getValue()).booleanValue() ? 1.0f : 0.8f;
        } else {
            fFloatValue = ((Number) b3Var.getValue()).floatValue();
        }
        t0Var.h(fFloatValue);
        if (!z11) {
            fFloatValue2 = ((Number) b3Var.getValue()).floatValue();
        } else if (((Boolean) k1Var.getValue()).booleanValue()) {
            fFloatValue2 = 1.0f;
        }
        t0Var.i(fFloatValue2);
        if (!z11) {
            fFloatValue3 = ((Number) this.f31304e.getValue()).floatValue();
        } else if (!((Boolean) k1Var.getValue()).booleanValue()) {
            fFloatValue3 = CropImageView.DEFAULT_ASPECT_RATIO;
        }
        t0Var.b(fFloatValue3);
        t0Var.p(((g2.z0) this.f31302c.getValue()).f28633a);
        return qy.b0.f48488a;
    }
}
