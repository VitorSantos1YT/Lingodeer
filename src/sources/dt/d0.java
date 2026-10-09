package dt;

import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d0 implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f23729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f23730c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f23731d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f23732e;

    public /* synthetic */ d0(float f5, int i11, long j11, long j12, boolean z11) {
        this.f23728a = i11;
        this.f23729b = f5;
        this.f23730c = z11;
        this.f23731d = j11;
        this.f23732e = j12;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        switch (this.f23728a) {
            case 0:
                d2.e drawWithCache = (d2.e) obj;
                kotlin.jvm.internal.m.f(drawWithCache, "$this$drawWithCache");
                return drawWithCache.a(new d0(this.f23729b, 1, this.f23731d, this.f23732e, this.f23730c));
            default:
                i2.d onDrawBehind = (i2.d) obj;
                kotlin.jvm.internal.m.f(onDrawBehind, "$this$onDrawBehind");
                g2.k kVarA = g2.o.a();
                float fE0 = onDrawBehind.e0(10);
                float fE1 = onDrawBehind.e0(14);
                float f5 = this.f23729b;
                if (this.f23730c) {
                    float f11 = fE0 + fE1;
                    kVarA.g(CropImageView.DEFAULT_ASPECT_RATIO, f11);
                    kVarA.i(CropImageView.DEFAULT_ASPECT_RATIO, fE0, fE1, fE0);
                    kVarA.f(f5 - fE0, fE0);
                    kVarA.f(f5, CropImageView.DEFAULT_ASPECT_RATIO);
                    kVarA.f(f5 + fE0, fE0);
                    kVarA.f(Float.intBitsToFloat((int) (onDrawBehind.d() >> 32)) - fE1, fE0);
                    kVarA.i(Float.intBitsToFloat((int) (onDrawBehind.d() >> 32)), fE0, Float.intBitsToFloat((int) (onDrawBehind.d() >> 32)), f11);
                    kVarA.f(Float.intBitsToFloat((int) (onDrawBehind.d() >> 32)), Float.intBitsToFloat((int) (onDrawBehind.d() & 4294967295L)) - fE1);
                    kVarA.i(Float.intBitsToFloat((int) (onDrawBehind.d() >> 32)), Float.intBitsToFloat((int) (onDrawBehind.d() & 4294967295L)), Float.intBitsToFloat((int) (onDrawBehind.d() >> 32)) - fE1, Float.intBitsToFloat((int) (onDrawBehind.d() & 4294967295L)));
                    kVarA.f(fE1, Float.intBitsToFloat((int) (onDrawBehind.d() & 4294967295L)));
                    kVarA.i(CropImageView.DEFAULT_ASPECT_RATIO, Float.intBitsToFloat((int) (onDrawBehind.d() & 4294967295L)), CropImageView.DEFAULT_ASPECT_RATIO, Float.intBitsToFloat((int) (onDrawBehind.d() & 4294967295L)) - fE1);
                } else {
                    kVarA.g(CropImageView.DEFAULT_ASPECT_RATIO, fE1);
                    kVarA.i(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, fE1, CropImageView.DEFAULT_ASPECT_RATIO);
                    kVarA.f(Float.intBitsToFloat((int) (onDrawBehind.d() >> 32)) - fE1, CropImageView.DEFAULT_ASPECT_RATIO);
                    kVarA.i(Float.intBitsToFloat((int) (onDrawBehind.d() >> 32)), CropImageView.DEFAULT_ASPECT_RATIO, Float.intBitsToFloat((int) (onDrawBehind.d() >> 32)), fE1);
                    kVarA.f(Float.intBitsToFloat((int) (onDrawBehind.d() >> 32)), (Float.intBitsToFloat((int) (onDrawBehind.d() & 4294967295L)) - fE1) - fE0);
                    kVarA.i(Float.intBitsToFloat((int) (onDrawBehind.d() >> 32)), Float.intBitsToFloat((int) (onDrawBehind.d() & 4294967295L)) - fE0, Float.intBitsToFloat((int) (onDrawBehind.d() >> 32)) - fE1, Float.intBitsToFloat((int) (onDrawBehind.d() & 4294967295L)) - fE0);
                    kVarA.f(f5 + fE0, Float.intBitsToFloat((int) (onDrawBehind.d() & 4294967295L)) - fE0);
                    kVarA.f(f5, Float.intBitsToFloat((int) (onDrawBehind.d() & 4294967295L)));
                    kVarA.f(f5 - fE0, Float.intBitsToFloat((int) (onDrawBehind.d() & 4294967295L)) - fE0);
                    kVarA.f(fE1, Float.intBitsToFloat((int) (onDrawBehind.d() & 4294967295L)) - fE0);
                    kVarA.i(CropImageView.DEFAULT_ASPECT_RATIO, Float.intBitsToFloat((int) (onDrawBehind.d() & 4294967295L)) - fE0, CropImageView.DEFAULT_ASPECT_RATIO, (Float.intBitsToFloat((int) (onDrawBehind.d() & 4294967295L)) - fE0) - fE1);
                    kVarA.f(CropImageView.DEFAULT_ASPECT_RATIO, fE1);
                }
                kVarA.d();
                i2.d.o0(onDrawBehind, kVarA, this.f23731d, CropImageView.DEFAULT_ASPECT_RATIO, i2.g.f34126a, 52);
                i2.d.o0(onDrawBehind, kVarA, this.f23732e, CropImageView.DEFAULT_ASPECT_RATIO, new i2.h(onDrawBehind.e0(2), CropImageView.DEFAULT_ASPECT_RATIO, 0, 0, null, 30), 52);
                return qy.b0.f48488a;
        }
    }
}
