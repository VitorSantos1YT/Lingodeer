package h1;

import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class p6 extends kotlin.jvm.internal.n implements fz.e {
    public final /* synthetic */ boolean H;
    public final /* synthetic */ j3.y0 K;
    public final /* synthetic */ s0.r0 L;
    public final /* synthetic */ s0.q0 M;
    public final /* synthetic */ boolean N;
    public final /* synthetic */ int O;
    public final /* synthetic */ int P;
    public final /* synthetic */ o3.f0 Q;
    public final /* synthetic */ h0.i R;
    public final /* synthetic */ fz.e S;
    public final /* synthetic */ fz.e T;
    public final /* synthetic */ fz.e U;
    public final /* synthetic */ fz.e V;
    public final /* synthetic */ g2.w0 W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z1.r f30844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fz.e f30845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v3.c f30846c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f30847d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ha f30848e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ o3.w f30849f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ fz.c f30850t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p6(z1.r rVar, fz.e eVar, v3.c cVar, boolean z11, ha haVar, o3.w wVar, fz.c cVar2, boolean z12, j3.y0 y0Var, s0.r0 r0Var, s0.q0 q0Var, boolean z13, int i11, int i12, o3.f0 f0Var, h0.i iVar, fz.e eVar2, fz.e eVar3, fz.e eVar4, fz.e eVar5, g2.w0 w0Var) {
        super(2);
        this.f30844a = rVar;
        this.f30845b = eVar;
        this.f30846c = cVar;
        this.f30847d = z11;
        this.f30848e = haVar;
        this.f30849f = wVar;
        this.f30850t = cVar2;
        this.H = z12;
        this.K = y0Var;
        this.L = r0Var;
        this.M = q0Var;
        this.N = z13;
        this.O = i11;
        this.P = i12;
        this.Q = f0Var;
        this.R = iVar;
        this.S = eVar2;
        this.T = eVar3;
        this.U = eVar4;
        this.V = eVar5;
        this.W = w0Var;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:13:0x0053  */
    /* JADX WARN: Code duplicated, block: B:16:0x006d  */
    /* JADX WARN: Code duplicated, block: B:17:0x0070  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        fz.e eVar;
        z1.r rVarE;
        z1.r rVarI;
        String strI;
        boolean z11;
        ha haVar;
        long j11;
        l1.n nVar = (l1.n) obj;
        if ((((Number) obj2).intValue() & 3) == 2) {
            l1.s sVar = (l1.s) nVar;
            if (sVar.F()) {
                sVar.W();
            } else {
                eVar = this.f30845b;
                rVarE = z1.o.f58481a;
                if (eVar != null) {
                    rVarE = j0.c.E(g3.r.b(rVarE, true, o0.Q), CropImageView.DEFAULT_ASPECT_RATIO, this.f30846c.w(t6.f31109b), CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13);
                }
                rVarI = this.f30844a.i(rVarE);
                strI = i1.p.i(nVar, R.string.default_error_message);
                float f5 = i1.d1.f33993b;
                z11 = this.f30847d;
                if (z11) {
                    rVarI = g3.r.b(rVarI, false, new c6.o(strI, 11));
                }
                z1.r rVarA = j0.e2.a(rVarI, j6.f30481c, j6.f30480b);
                haVar = this.f30848e;
                if (z11) {
                    j11 = haVar.f30359j;
                } else {
                    j11 = haVar.f30358i;
                }
                g2.y0 y0Var = new g2.y0(j11);
                fz.e eVar2 = this.V;
                g2.w0 w0Var = this.W;
                o3.w wVar = this.f30849f;
                boolean z12 = this.H;
                boolean z13 = this.N;
                o3.f0 f0Var = this.Q;
                h0.i iVar = this.R;
                s0.l.b(wVar, this.f30850t, rVarA, z12, false, this.K, this.L, this.M, z13, this.O, this.P, f0Var, null, iVar, y0Var, t1.e.d(-757328870, new o6(wVar, z12, z13, f0Var, iVar, this.f30847d, this.f30845b, this.S, this.T, this.U, eVar2, haVar, w0Var), nVar), nVar, 0, 4096);
            }
        } else {
            eVar = this.f30845b;
            rVarE = z1.o.f58481a;
            if (eVar != null) {
                rVarE = j0.c.E(g3.r.b(rVarE, true, o0.Q), CropImageView.DEFAULT_ASPECT_RATIO, this.f30846c.w(t6.f31109b), CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13);
            }
            rVarI = this.f30844a.i(rVarE);
            strI = i1.p.i(nVar, R.string.default_error_message);
            float f11 = i1.d1.f33993b;
            z11 = this.f30847d;
            if (z11) {
                rVarI = g3.r.b(rVarI, false, new c6.o(strI, 11));
            }
            z1.r rVarA2 = j0.e2.a(rVarI, j6.f30481c, j6.f30480b);
            haVar = this.f30848e;
            if (z11) {
                j11 = haVar.f30359j;
            } else {
                j11 = haVar.f30358i;
            }
            g2.y0 y0Var2 = new g2.y0(j11);
            fz.e eVar3 = this.V;
            g2.w0 w0Var2 = this.W;
            o3.w wVar2 = this.f30849f;
            boolean z14 = this.H;
            boolean z15 = this.N;
            o3.f0 f0Var2 = this.Q;
            h0.i iVar2 = this.R;
            s0.l.b(wVar2, this.f30850t, rVarA2, z14, false, this.K, this.L, this.M, z15, this.O, this.P, f0Var2, null, iVar2, y0Var2, t1.e.d(-757328870, new o6(wVar2, z14, z15, f0Var2, iVar2, this.f30847d, this.f30845b, this.S, this.T, this.U, eVar3, haVar, w0Var2), nVar), nVar, 0, 4096);
        }
        return qy.b0.f48488a;
    }
}
