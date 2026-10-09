package h1;

import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class p5 extends kotlin.jvm.internal.n implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fz.a f30843b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p5(int i11, fz.a aVar) {
        super(1);
        this.f30842a = i11;
        this.f30843b = aVar;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        switch (this.f30842a) {
            case 0:
                this.f30843b.invoke();
                break;
            case 1:
                long j11 = ((f2.b) obj).f26570a;
                this.f30843b.invoke();
                break;
            case 2:
                g3.z.c((g3.b0) obj, new g3.j(((Number) this.f30843b.invoke()).floatValue(), new lz.d(CropImageView.DEFAULT_ASPECT_RATIO, 1.0f), 0));
                break;
            case 3:
                g3.z.c((g3.b0) obj, new g3.j(((Number) this.f30843b.invoke()).floatValue(), new lz.d(CropImageView.DEFAULT_ASPECT_RATIO, 1.0f), 0));
                break;
            default:
                g3.z.c((g3.b0) obj, new g3.j(((Number) this.f30843b.invoke()).floatValue(), new lz.d(CropImageView.DEFAULT_ASPECT_RATIO, 1.0f), 0));
                break;
        }
        return qy.b0.f48488a;
    }
}
