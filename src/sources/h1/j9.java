package h1;

import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class j9 extends kotlin.jvm.internal.n implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f30492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f30493b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f30494c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f30495d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j9(boolean z11, boolean z12, float f5, boolean z13) {
        super(1);
        this.f30492a = z11;
        this.f30493b = z12;
        this.f30494c = f5;
        this.f30495d = z13;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        i1.b0 b0Var = (i1.b0) obj;
        b0Var.a(o9.Settled, CropImageView.DEFAULT_ASPECT_RATIO);
        boolean z11 = this.f30492a;
        boolean z12 = this.f30493b;
        float f5 = this.f30494c;
        if (z11) {
            b0Var.a(o9.StartToEnd, z12 ? -f5 : f5);
        }
        if (this.f30495d) {
            o9 o9Var = o9.EndToStart;
            if (!z12) {
                f5 = -f5;
            }
            b0Var.a(o9Var, f5);
        }
        return qy.b0.f48488a;
    }
}
