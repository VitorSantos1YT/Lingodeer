package h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class x6 extends kotlin.jvm.internal.n implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fz.a f31307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f31308b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f31309c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f31310d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f31311e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i2.h f31312f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ long f31313t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x6(fz.a aVar, int i11, float f5, float f11, long j11, i2.h hVar, long j12) {
        super(1);
        this.f31307a = aVar;
        this.f31308b = i11;
        this.f31309c = f5;
        this.f31310d = f11;
        this.f31311e = j11;
        this.f31312f = hVar;
        this.f31313t = j12;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        i2.d dVar = (i2.d) obj;
        float fFloatValue = ((Number) this.f31307a.invoke()).floatValue() * 360.0f;
        int i11 = this.f31308b;
        float f5 = this.f31309c;
        if (i11 != 0 && f2.e.b(dVar.d()) <= f2.e.d(dVar.d())) {
            f5 += this.f31310d;
        }
        float fT = (f5 / ((float) (((double) dVar.T(f2.e.d(dVar.d()))) * 3.141592653589793d))) * 360.0f;
        float fMin = Math.min(fFloatValue, fT) + 270.0f + fFloatValue;
        float fMin2 = (360.0f - fFloatValue) - (Math.min(fFloatValue, fT) * 2);
        long j11 = this.f31311e;
        i2.h hVar = this.f31312f;
        g7.f(dVar, fMin, fMin2, j11, hVar);
        g7.f(dVar, 270.0f, fFloatValue, this.f31313t, hVar);
        return qy.b0.f48488a;
    }
}
