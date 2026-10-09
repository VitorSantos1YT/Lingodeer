package h1;

import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class v5 extends kotlin.jvm.internal.n implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f31189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f31190b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e8 f31191c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v5(float f5, long j11, e8 e8Var) {
        super(1);
        this.f31189a = f5;
        this.f31190b = j11;
        this.f31191c = e8Var;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        i1.b0 b0Var = (i1.b0) obj;
        f8 f8Var = f8.Hidden;
        float f5 = this.f31189a;
        b0Var.a(f8Var, f5);
        int i11 = (int) (this.f31190b & 4294967295L);
        float f11 = i11;
        if (f11 > f5 / 2 && !this.f31191c.f30210a) {
            b0Var.a(f8.PartiallyExpanded, f5 / 2.0f);
        }
        if (i11 != 0) {
            b0Var.a(f8.Expanded, Math.max(CropImageView.DEFAULT_ASPECT_RATIO, f5 - f11));
        }
        return qy.b0.f48488a;
    }
}
