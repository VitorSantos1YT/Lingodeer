package h1;

import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class z6 extends kotlin.jvm.internal.n implements fz.c {
    public final /* synthetic */ long H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f31408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i2.h f31409b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l1.b3 f31410c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l1.b3 f31411d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l1.b3 f31412e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l1.b3 f31413f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ float f31414t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z6(long j11, i2.h hVar, b0.h0 h0Var, b0.h0 h0Var2, b0.h0 h0Var3, b0.h0 h0Var4, float f5, long j12) {
        super(1);
        this.f31408a = j11;
        this.f31409b = hVar;
        this.f31410c = h0Var;
        this.f31411d = h0Var2;
        this.f31412e = h0Var3;
        this.f31413f = h0Var4;
        this.f31414t = f5;
        this.H = j12;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        float f5;
        i2.d dVar = (i2.d) obj;
        long j11 = this.f31408a;
        i2.h hVar = this.f31409b;
        g7.f(dVar, CropImageView.DEFAULT_ASPECT_RATIO, 360.0f, j11, hVar);
        float fFloatValue = (((Number) this.f31410c.getValue()).floatValue() * 216.0f) % 360.0f;
        float fFloatValue2 = ((Number) this.f31411d.getValue()).floatValue();
        l1.b3 b3Var = this.f31412e;
        float fAbs = Math.abs(fFloatValue2 - ((Number) b3Var.getValue()).floatValue());
        float fFloatValue3 = ((Number) b3Var.getValue()).floatValue() + ((Number) this.f31413f.getValue()).floatValue() + (fFloatValue - 90.0f);
        if (hVar.f34129c == 0) {
            f5 = CropImageView.DEFAULT_ASPECT_RATIO;
        } else {
            f5 = ((this.f31414t / (g7.f30282e / 2)) * 57.29578f) / 2.0f;
        }
        g7.f(dVar, fFloatValue3 + f5, Math.max(fAbs, 0.1f), this.H, hVar);
        return qy.b0.f48488a;
    }
}
