package a0;

import h1.k7;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 extends kotlin.jvm.internal.n implements fz.e {
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object K;
    public final /* synthetic */ fz.f L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f84a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z1.r f85b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f86c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f87d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f88e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f89f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f90t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(fz.a aVar, z1.r rVar, boolean z11, g2.w0 w0Var, h1.i0 i0Var, j0.t1 t1Var, fz.f fVar, int i11, int i12) {
        super(2);
        this.f89f = aVar;
        this.f85b = rVar;
        this.f86c = z11;
        this.f90t = w0Var;
        this.H = i0Var;
        this.K = t1Var;
        this.L = fVar;
        this.f87d = i11;
        this.f88e = i12;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f84a) {
            case 0:
                ((Number) obj2).intValue();
                j0.b2 b2Var = (j0.b2) this.f89f;
                l1 l1Var = (l1) this.f90t;
                m1 m1Var = (m1) this.H;
                String str = (String) this.K;
                t1.d dVar = (t1.d) this.L;
                j0.b(b2Var, this.f86c, this.f85b, l1Var, m1Var, str, dVar, (l1.n) obj, l1.t.M(this.f87d | 1), this.f88e);
                break;
            default:
                ((Number) obj2).intValue();
                fz.a aVar = (fz.a) this.f89f;
                g2.w0 w0Var = (g2.w0) this.f90t;
                h1.i0 i0Var = (h1.i0) this.H;
                j0.t1 t1Var = (j0.t1) this.K;
                k7.m(aVar, this.f85b, this.f86c, w0Var, i0Var, t1Var, this.L, (l1.n) obj, l1.t.M(this.f87d | 1), this.f88e);
                break;
        }
        return qy.b0.f48488a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(j0.b2 b2Var, boolean z11, z1.r rVar, l1 l1Var, m1 m1Var, String str, t1.d dVar, int i11, int i12) {
        super(2);
        this.f89f = b2Var;
        this.f86c = z11;
        this.f85b = rVar;
        this.f90t = l1Var;
        this.H = m1Var;
        this.K = str;
        this.L = dVar;
        this.f87d = i11;
        this.f88e = i12;
    }
}
