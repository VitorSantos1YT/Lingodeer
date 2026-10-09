package a0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class x1 extends kotlin.jvm.internal.n implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f230b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f231c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w2.s0 f232d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w2.g1 f233e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(y1 y1Var, long j11, int i11, int i12, w2.s0 s0Var, w2.g1 g1Var) {
        super(1);
        this.f229a = j11;
        this.f230b = i11;
        this.f231c = i12;
        this.f232d = s0Var;
        this.f233e = g1Var;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        w2.f1 f1Var = (w2.f1) obj;
        long j11 = (((long) this.f230b) << 32) | (((long) this.f231c) & 4294967295L);
        v3.m layoutDirection = this.f232d.getLayoutDirection();
        long j12 = this.f229a;
        float f5 = (((int) (j11 >> 32)) - ((int) (j12 >> 32))) / 2.0f;
        float f11 = (((int) (j11 & 4294967295L)) - ((int) (j12 & 4294967295L))) / 2.0f;
        float f12 = layoutDirection == v3.m.Ltr ? -1.0f : (-1) * (-1.0f);
        float f13 = 1;
        float f14 = (f12 + f13) * f5;
        w2.f1.i(f1Var, this.f233e, (((long) Math.round((f13 - 1.0f) * f11)) & 4294967295L) | (((long) Math.round(f14)) << 32));
        return qy.b0.f48488a;
    }
}
