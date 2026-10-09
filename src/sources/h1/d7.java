package h1;

import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d7 extends kotlin.jvm.internal.n implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f30144b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fz.a f30145c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f30146d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f30147e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fz.c f30148f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d7(int i11, float f5, fz.a aVar, long j11, long j12, fz.c cVar) {
        super(1);
        this.f30143a = i11;
        this.f30144b = f5;
        this.f30145c = aVar;
        this.f30146d = j11;
        this.f30147e = j12;
        this.f30148f = cVar;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        i2.d dVar = (i2.d) obj;
        float fB = f2.e.b(dVar.d());
        int i11 = this.f30143a;
        float fT = this.f30144b;
        if (i11 != 0 && f2.e.b(dVar.d()) <= f2.e.d(dVar.d())) {
            fT += dVar.T(fB);
        }
        float fT2 = fT / dVar.T(f2.e.d(dVar.d()));
        float fFloatValue = ((Number) this.f30145c.invoke()).floatValue();
        float fMin = Math.min(fFloatValue, fT2) + fFloatValue;
        if (fMin <= 1.0f) {
            g7.e(dVar, fMin, 1.0f, this.f30146d, fB, this.f30143a);
        }
        g7.e(dVar, CropImageView.DEFAULT_ASPECT_RATIO, fFloatValue, this.f30147e, fB, this.f30143a);
        this.f30148f.invoke(dVar);
        return qy.b0.f48488a;
    }
}
