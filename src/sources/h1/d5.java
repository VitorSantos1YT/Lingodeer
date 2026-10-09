package h1;

import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d5 extends kotlin.jvm.internal.n implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w2.g1 f30140b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f30141c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d5(int i11, int i12, w2.g1 g1Var) {
        super(1);
        this.f30139a = i11;
        this.f30140b = g1Var;
        this.f30141c = i12;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        w2.g1 g1Var = this.f30140b;
        ((w2.f1) obj).f(g1Var, hz.b.Q((this.f30139a - g1Var.f54501a) / 2.0f), hz.b.Q((this.f30141c - g1Var.f54502b) / 2.0f), CropImageView.DEFAULT_ASPECT_RATIO);
        return qy.b0.f48488a;
    }
}
