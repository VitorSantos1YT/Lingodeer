package j0;

import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y0 implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w2.g1 f35438b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f35439c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f35440d;

    public /* synthetic */ y0(w2.g1 g1Var, int i11, int i12, int i13) {
        this.f35437a = i13;
        this.f35438b = g1Var;
        this.f35439c = i11;
        this.f35440d = i12;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        switch (this.f35437a) {
            case 0:
                ((w2.f1) obj).f(this.f35438b, this.f35439c, this.f35440d, CropImageView.DEFAULT_ASPECT_RATIO);
                break;
            default:
                ((w2.f1) obj).f(this.f35438b, this.f35439c, this.f35440d, CropImageView.DEFAULT_ASPECT_RATIO);
                break;
        }
        return qy.b0.f48488a;
    }
}
