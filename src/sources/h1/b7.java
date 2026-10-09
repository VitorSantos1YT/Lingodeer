package h1;

import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b7 extends kotlin.jvm.internal.n implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w2.g1 f30042b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f30043c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b7(int i11, int i12, w2.g1 g1Var) {
        super(1);
        this.f30041a = i12;
        this.f30042b = g1Var;
        this.f30043c = i11;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        switch (this.f30041a) {
            case 0:
                ((w2.f1) obj).f(this.f30042b, 0, -this.f30043c, CropImageView.DEFAULT_ASPECT_RATIO);
                break;
            default:
                ((w2.f1) obj).f(this.f30042b, -this.f30043c, 0, CropImageView.DEFAULT_ASPECT_RATIO);
                break;
        }
        return qy.b0.f48488a;
    }
}
