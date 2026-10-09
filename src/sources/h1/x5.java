package h1;

import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class x5 extends kotlin.jvm.internal.n implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fz.a f31306b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x5(int i11, fz.a aVar) {
        super(0);
        this.f31305a = i11;
        this.f31306b = aVar;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f31305a) {
            case 0:
                this.f31306b.invoke();
                return Boolean.TRUE;
            case 1:
                this.f31306b.invoke();
                return Boolean.TRUE;
            case 2:
                return Float.valueOf(hz.b.k(((Number) this.f31306b.invoke()).floatValue(), CropImageView.DEFAULT_ASPECT_RATIO, 1.0f));
            case 3:
                return Float.valueOf(hz.b.k(((Number) this.f31306b.invoke()).floatValue(), CropImageView.DEFAULT_ASPECT_RATIO, 1.0f));
            case 4:
                return Float.valueOf(((Number) this.f31306b.invoke()).floatValue() < 1.0f ? 0.3f : 1.0f);
            default:
                return this.f31306b.invoke();
        }
    }
}
