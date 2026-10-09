package h1;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class ta extends kotlin.jvm.internal.n implements fz.e {
    public final /* synthetic */ long H;
    public final /* synthetic */ int K;
    public final /* synthetic */ boolean L;
    public final /* synthetic */ int M;
    public final /* synthetic */ int N;
    public final /* synthetic */ j3.y0 O;
    public final /* synthetic */ int P;
    public final /* synthetic */ int Q;
    public final /* synthetic */ int R;
    public final /* synthetic */ CharSequence S;
    public final /* synthetic */ Object T;
    public final /* synthetic */ Object U;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31118a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z1.r f31119b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f31120c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f31121d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n3.s f31122e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f31123f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ u3.k f31124t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ta(j3.h hVar, z1.r rVar, long j11, long j12, n3.s sVar, long j13, u3.k kVar, long j14, int i11, boolean z11, int i12, int i13, Map map, fz.c cVar, j3.y0 y0Var, int i14, int i15, int i16) {
        super(2);
        this.S = hVar;
        this.f31119b = rVar;
        this.f31120c = j11;
        this.f31121d = j12;
        this.f31122e = sVar;
        this.f31123f = j13;
        this.f31124t = kVar;
        this.H = j14;
        this.K = i11;
        this.L = z11;
        this.M = i12;
        this.N = i13;
        this.T = map;
        this.U = cVar;
        this.O = y0Var;
        this.P = i14;
        this.Q = i15;
        this.R = i16;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        l1.n nVar = (l1.n) obj;
        switch (this.f31118a) {
            case 0:
                ((Number) obj2).intValue();
                ua.b((String) this.S, this.f31119b, this.f31120c, this.f31121d, (n3.o) this.T, this.f31122e, (n3.i) this.U, this.f31123f, this.f31124t, this.H, this.K, this.L, this.M, this.N, this.O, nVar, l1.t.M(this.P | 1), l1.t.M(this.Q), this.R);
                break;
            default:
                ((Number) obj2).intValue();
                ua.c((j3.h) this.S, this.f31119b, this.f31120c, this.f31121d, this.f31122e, this.f31123f, this.f31124t, this.H, this.K, this.L, this.M, this.N, (Map) this.T, (fz.c) this.U, this.O, nVar, l1.t.M(this.P | 1), l1.t.M(this.Q), this.R);
                break;
        }
        return qy.b0.f48488a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ta(String str, z1.r rVar, long j11, long j12, n3.o oVar, n3.s sVar, n3.i iVar, long j13, u3.k kVar, long j14, int i11, boolean z11, int i12, int i13, j3.y0 y0Var, int i14, int i15, int i16) {
        super(2);
        this.S = str;
        this.f31119b = rVar;
        this.f31120c = j11;
        this.f31121d = j12;
        this.T = oVar;
        this.f31122e = sVar;
        this.U = iVar;
        this.f31123f = j13;
        this.f31124t = kVar;
        this.H = j14;
        this.K = i11;
        this.L = z11;
        this.M = i12;
        this.N = i13;
        this.O = y0Var;
        this.P = i14;
        this.Q = i15;
        this.R = i16;
    }
}
