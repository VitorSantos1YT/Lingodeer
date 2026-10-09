package h1;

import com.lingodeer.R;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class na extends kotlin.jvm.internal.n implements fz.e {
    public final /* synthetic */ s0.r0 H;
    public final /* synthetic */ s0.q0 K;
    public final /* synthetic */ boolean L;
    public final /* synthetic */ int M;
    public final /* synthetic */ int N;
    public final /* synthetic */ o3.f0 O;
    public final /* synthetic */ h0.i P;
    public final /* synthetic */ fz.e Q;
    public final /* synthetic */ fz.e R;
    public final /* synthetic */ g2.w0 S;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z1.r f30745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f30746b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ha f30747c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f30748d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fz.c f30749e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f30750f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ j3.y0 f30751t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public na(z1.r rVar, boolean z11, ha haVar, String str, fz.c cVar, boolean z12, j3.y0 y0Var, s0.r0 r0Var, s0.q0 q0Var, boolean z13, int i11, int i12, o3.f0 f0Var, h0.i iVar, fz.e eVar, fz.e eVar2, g2.w0 w0Var) {
        super(2);
        this.f30745a = rVar;
        this.f30746b = z11;
        this.f30747c = haVar;
        this.f30748d = str;
        this.f30749e = cVar;
        this.f30750f = z12;
        this.f30751t = y0Var;
        this.H = r0Var;
        this.K = q0Var;
        this.L = z13;
        this.M = i11;
        this.N = i12;
        this.O = f0Var;
        this.P = iVar;
        this.Q = eVar;
        this.R = eVar2;
        this.S = w0Var;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0031  */
    /* JADX WARN: Code duplicated, block: B:13:0x004b  */
    /* JADX WARN: Code duplicated, block: B:14:0x004e  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        String strI;
        boolean z11;
        z1.r rVarB;
        ha haVar;
        long j11;
        l1.n nVar = (l1.n) obj;
        if ((((Number) obj2).intValue() & 3) == 2) {
            l1.s sVar = (l1.s) nVar;
            if (sVar.F()) {
                sVar.W();
            } else {
                strI = i1.p.i(nVar, R.string.default_error_message);
                float f5 = i1.d1.f33993b;
                z11 = this.f30746b;
                rVarB = this.f30745a;
                if (z11) {
                    rVarB = g3.r.b(rVarB, false, new c6.o(strI, 11));
                }
                z1.r rVarA = j0.e2.a(rVarB, la.f30618c, la.f30617b);
                haVar = this.f30747c;
                if (z11) {
                    j11 = haVar.f30359j;
                } else {
                    j11 = haVar.f30358i;
                }
                g2.y0 y0Var = new g2.y0(j11);
                fz.e eVar = this.R;
                g2.w0 w0Var = this.S;
                String str = this.f30748d;
                boolean z12 = this.f30750f;
                boolean z13 = this.L;
                o3.f0 f0Var = this.O;
                h0.i iVar = this.P;
                s0.l.a(str, this.f30749e, rVarA, z12, this.f30751t, this.H, this.K, z13, this.M, this.N, f0Var, null, iVar, y0Var, t1.e.d(-288211827, new ma(str, z12, z13, f0Var, iVar, this.f30746b, this.Q, eVar, w0Var, haVar), nVar), nVar, 0);
            }
        } else {
            strI = i1.p.i(nVar, R.string.default_error_message);
            float f11 = i1.d1.f33993b;
            z11 = this.f30746b;
            rVarB = this.f30745a;
            if (z11) {
                rVarB = g3.r.b(rVarB, false, new c6.o(strI, 11));
            }
            z1.r rVarA2 = j0.e2.a(rVarB, la.f30618c, la.f30617b);
            haVar = this.f30747c;
            if (z11) {
                j11 = haVar.f30359j;
            } else {
                j11 = haVar.f30358i;
            }
            g2.y0 y0Var2 = new g2.y0(j11);
            fz.e eVar2 = this.R;
            g2.w0 w0Var2 = this.S;
            String str2 = this.f30748d;
            boolean z14 = this.f30750f;
            boolean z15 = this.L;
            o3.f0 f0Var2 = this.O;
            h0.i iVar2 = this.P;
            s0.l.a(str2, this.f30749e, rVarA2, z14, this.f30751t, this.H, this.K, z15, this.M, this.N, f0Var2, null, iVar2, y0Var2, t1.e.d(-288211827, new ma(str2, z14, z15, f0Var2, iVar2, this.f30746b, this.Q, eVar2, w0Var2, haVar), nVar), nVar, 0);
        }
        return qy.b0.f48488a;
    }
}
