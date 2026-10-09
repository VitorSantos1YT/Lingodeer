package h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class q4 extends kotlin.jvm.internal.n implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f30913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f30914b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q4(float f5, float f11) {
        super(3);
        this.f30913a = f5;
        this.f30914b = f11;
    }

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        w2.s0 s0Var = (w2.s0) obj;
        w2.p0 p0Var = (w2.p0) obj2;
        long j11 = ((v3.a) obj3).f53483a;
        int i11 = (int) this.f30913a;
        int i12 = (int) this.f30914b;
        if (!((i12 >= 0) & (i11 >= 0))) {
            v3.i.a("width and height must be >= 0");
        }
        w2.g1 g1VarB = p0Var.B(v3.b.h(i11, i11, i12, i12));
        return s0Var.q0(g1VarB.f54501a, g1VarB.f54502b, ry.s.f50855a, new a0.h0(g1VarB, 5));
    }
}
