package h1;

import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f7 extends kotlin.jvm.internal.n implements fz.c {
    public final /* synthetic */ l1.b3 H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f30238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l1.b3 f30239c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f30240d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l1.b3 f30241e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f30242f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ l1.b3 f30243t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f7(int i11, float f5, b0.h0 h0Var, long j11, b0.h0 h0Var2, long j12, b0.h0 h0Var3, b0.h0 h0Var4) {
        super(1);
        this.f30237a = i11;
        this.f30238b = f5;
        this.f30239c = h0Var;
        this.f30240d = j11;
        this.f30241e = h0Var2;
        this.f30242f = j12;
        this.f30243t = h0Var3;
        this.H = h0Var4;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        i2.d dVar = (i2.d) obj;
        float fB = f2.e.b(dVar.d());
        int i11 = this.f30237a;
        float fT = this.f30238b;
        if (i11 != 0 && f2.e.b(dVar.d()) <= f2.e.d(dVar.d())) {
            fT += dVar.T(fB);
        }
        float fT2 = fT / dVar.T(f2.e.d(dVar.d()));
        l1.b3 b3Var = this.f30239c;
        if (((Number) b3Var.getValue()).floatValue() < 1.0f - fT2) {
            g7.e(dVar, ((Number) b3Var.getValue()).floatValue() > CropImageView.DEFAULT_ASPECT_RATIO ? ((Number) b3Var.getValue()).floatValue() + fT2 : 0.0f, 1.0f, this.f30240d, fB, this.f30237a);
        }
        float fFloatValue = ((Number) b3Var.getValue()).floatValue();
        l1.b3 b3Var2 = this.f30241e;
        if (fFloatValue - ((Number) b3Var2.getValue()).floatValue() > CropImageView.DEFAULT_ASPECT_RATIO) {
            g7.e(dVar, ((Number) b3Var.getValue()).floatValue(), ((Number) b3Var2.getValue()).floatValue(), this.f30242f, fB, this.f30237a);
        }
        float fFloatValue2 = ((Number) b3Var2.getValue()).floatValue();
        l1.b3 b3Var3 = this.f30243t;
        if (fFloatValue2 > fT2) {
            g7.e(dVar, ((Number) b3Var3.getValue()).floatValue() > CropImageView.DEFAULT_ASPECT_RATIO ? ((Number) b3Var3.getValue()).floatValue() + fT2 : 0.0f, ((Number) b3Var2.getValue()).floatValue() < 1.0f ? ((Number) b3Var2.getValue()).floatValue() - fT2 : 1.0f, this.f30240d, fB, this.f30237a);
        }
        float fFloatValue3 = ((Number) b3Var3.getValue()).floatValue();
        l1.b3 b3Var4 = this.H;
        if (fFloatValue3 - ((Number) b3Var4.getValue()).floatValue() > CropImageView.DEFAULT_ASPECT_RATIO) {
            g7.e(dVar, ((Number) b3Var3.getValue()).floatValue(), ((Number) b3Var4.getValue()).floatValue(), this.f30242f, fB, this.f30237a);
        }
        if (((Number) b3Var4.getValue()).floatValue() > fT2) {
            g7.e(dVar, CropImageView.DEFAULT_ASPECT_RATIO, ((Number) b3Var4.getValue()).floatValue() < 1.0f ? ((Number) b3Var4.getValue()).floatValue() - fT2 : 1.0f, this.f30240d, fB, this.f30237a);
        }
        return qy.b0.f48488a;
    }
}
