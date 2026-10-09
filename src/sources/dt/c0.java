package dt;

import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c0 implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f23690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f23691c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qy.l f23692d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f23693e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f23694f;

    public /* synthetic */ c0(float f5, boolean z11, qy.l lVar, long j11, long j12, int i11) {
        this.f23689a = i11;
        this.f23690b = f5;
        this.f23691c = z11;
        this.f23692d = lVar;
        this.f23693e = j11;
        this.f23694f = j12;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        switch (this.f23689a) {
            case 0:
                Object obj2 = this.f23692d.f48496b;
                i2.d onDrawBehind = (i2.d) obj;
                kotlin.jvm.internal.m.f(onDrawBehind, "$this$onDrawBehind");
                g2.k kVarA = g2.o.a();
                float fE0 = onDrawBehind.e0(10);
                float fE1 = onDrawBehind.e0(14);
                float fE2 = onDrawBehind.e0(this.f23690b);
                if (this.f23691c) {
                    float fK = hz.b.k(((int) (((v3.j) obj2).f53492a >> 32)) - onDrawBehind.e0(25), fE1 + fE0, (Float.intBitsToFloat((int) (onDrawBehind.d() >> 32)) - fE1) - fE0);
                    kVarA.g(CropImageView.DEFAULT_ASPECT_RATIO, fE1);
                    kVarA.i(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, fE1, CropImageView.DEFAULT_ASPECT_RATIO);
                    kVarA.f(Float.intBitsToFloat((int) (onDrawBehind.d() >> 32)) - fE1, CropImageView.DEFAULT_ASPECT_RATIO);
                    kVarA.i(Float.intBitsToFloat((int) (onDrawBehind.d() >> 32)), CropImageView.DEFAULT_ASPECT_RATIO, Float.intBitsToFloat((int) (onDrawBehind.d() >> 32)), fE1);
                    kVarA.f(Float.intBitsToFloat((int) (onDrawBehind.d() >> 32)), (Float.intBitsToFloat((int) (onDrawBehind.d() & 4294967295L)) - fE1) - fE2);
                    kVarA.i(Float.intBitsToFloat((int) (onDrawBehind.d() >> 32)), Float.intBitsToFloat((int) (onDrawBehind.d() & 4294967295L)) - fE2, Float.intBitsToFloat((int) (onDrawBehind.d() >> 32)) - fE1, Float.intBitsToFloat((int) (onDrawBehind.d() & 4294967295L)) - fE2);
                    kVarA.f(fK + fE0, Float.intBitsToFloat((int) (onDrawBehind.d() & 4294967295L)) - fE2);
                    kVarA.f(fK, Float.intBitsToFloat((int) (onDrawBehind.d() & 4294967295L)));
                    kVarA.f(fK - fE0, Float.intBitsToFloat((int) (onDrawBehind.d() & 4294967295L)) - fE2);
                    kVarA.f(fE1, Float.intBitsToFloat((int) (onDrawBehind.d() & 4294967295L)) - fE2);
                    kVarA.i(CropImageView.DEFAULT_ASPECT_RATIO, Float.intBitsToFloat((int) (onDrawBehind.d() & 4294967295L)) - fE2, CropImageView.DEFAULT_ASPECT_RATIO, (Float.intBitsToFloat((int) (onDrawBehind.d() & 4294967295L)) - fE2) - fE1);
                    kVarA.f(CropImageView.DEFAULT_ASPECT_RATIO, fE1);
                } else {
                    float fE3 = ((int) (((v3.j) obj2).f53492a >> 32)) - onDrawBehind.e0(25);
                    float f5 = fE0 + fE1;
                    kVarA.g(CropImageView.DEFAULT_ASPECT_RATIO, f5);
                    kVarA.i(CropImageView.DEFAULT_ASPECT_RATIO, fE0, fE1, fE0);
                    kVarA.f(fE3 - fE0, fE0);
                    kVarA.f(fE3, CropImageView.DEFAULT_ASPECT_RATIO);
                    kVarA.f(fE3 + fE0, fE0);
                    kVarA.f(Float.intBitsToFloat((int) (onDrawBehind.d() >> 32)) - fE1, fE0);
                    kVarA.i(Float.intBitsToFloat((int) (onDrawBehind.d() >> 32)), fE0, Float.intBitsToFloat((int) (onDrawBehind.d() >> 32)), f5);
                    kVarA.f(Float.intBitsToFloat((int) (onDrawBehind.d() >> 32)), Float.intBitsToFloat((int) (onDrawBehind.d() & 4294967295L)) - fE1);
                    kVarA.i(Float.intBitsToFloat((int) (onDrawBehind.d() >> 32)), Float.intBitsToFloat((int) (onDrawBehind.d() & 4294967295L)), Float.intBitsToFloat((int) (onDrawBehind.d() >> 32)) - fE1, Float.intBitsToFloat((int) (onDrawBehind.d() & 4294967295L)));
                    kVarA.f(fE1, Float.intBitsToFloat((int) (onDrawBehind.d() & 4294967295L)));
                    kVarA.i(CropImageView.DEFAULT_ASPECT_RATIO, Float.intBitsToFloat((int) (onDrawBehind.d() & 4294967295L)), CropImageView.DEFAULT_ASPECT_RATIO, Float.intBitsToFloat((int) (onDrawBehind.d() & 4294967295L)) - fE1);
                }
                kVarA.d();
                i2.d.o0(onDrawBehind, kVarA, this.f23693e, CropImageView.DEFAULT_ASPECT_RATIO, i2.g.f34126a, 52);
                i2.d.o0(onDrawBehind, kVarA, this.f23694f, CropImageView.DEFAULT_ASPECT_RATIO, new i2.h(onDrawBehind.e0(2), CropImageView.DEFAULT_ASPECT_RATIO, 0, 0, null, 30), 52);
                return qy.b0.f48488a;
            default:
                d2.e drawWithCache = (d2.e) obj;
                kotlin.jvm.internal.m.f(drawWithCache, "$this$drawWithCache");
                return drawWithCache.a(new c0(this.f23690b, this.f23691c, this.f23692d, this.f23693e, this.f23694f, 0));
        }
    }
}
