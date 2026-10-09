package h1;

import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class m6 extends kotlin.jvm.internal.n implements fz.e {
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
    public final /* synthetic */ g2.w0 V;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z1.r f30679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fz.e f30680b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v3.c f30681c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f30682d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ha f30683e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f30684f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ fz.c f30685t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m6(z1.r rVar, fz.e eVar, v3.c cVar, boolean z11, ha haVar, String str, fz.c cVar2, boolean z12, j3.y0 y0Var, s0.r0 r0Var, s0.q0 q0Var, boolean z13, int i11, int i12, o3.f0 f0Var, h0.i iVar, fz.e eVar2, fz.e eVar3, fz.e eVar4, g2.w0 w0Var) {
        super(2);
        this.f30679a = rVar;
        this.f30680b = eVar;
        this.f30681c = cVar;
        this.f30682d = z11;
        this.f30683e = haVar;
        this.f30684f = str;
        this.f30685t = cVar2;
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
        this.V = w0Var;
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
                eVar = this.f30680b;
                rVarE = z1.o.f58481a;
                if (eVar != null) {
                    rVarE = j0.c.E(g3.r.b(rVarE, true, o0.P), CropImageView.DEFAULT_ASPECT_RATIO, this.f30681c.w(t6.f31109b), CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13);
                }
                rVarI = this.f30679a.i(rVarE);
                strI = i1.p.i(nVar, R.string.default_error_message);
                float f5 = i1.d1.f33993b;
                z11 = this.f30682d;
                if (z11) {
                    rVarI = g3.r.b(rVarI, false, new c6.o(strI, 11));
                }
                z1.r rVarA = j0.e2.a(rVarI, j6.f30481c, j6.f30480b);
                haVar = this.f30683e;
                if (z11) {
                    j11 = haVar.f30359j;
                } else {
                    j11 = haVar.f30358i;
                }
                g2.y0 y0Var = new g2.y0(j11);
                fz.e eVar2 = this.U;
                g2.w0 w0Var = this.V;
                String str = this.f30684f;
                boolean z12 = this.H;
                boolean z13 = this.N;
                o3.f0 f0Var = this.Q;
                h0.i iVar = this.R;
                s0.l.a(str, this.f30685t, rVarA, z12, this.K, this.L, this.M, z13, this.O, this.P, f0Var, null, iVar, y0Var, t1.e.d(1474611661, new l6(str, z12, z13, f0Var, iVar, this.f30682d, this.f30680b, this.S, this.T, eVar2, haVar, w0Var), nVar), nVar, 0);
            }
        } else {
            eVar = this.f30680b;
            rVarE = z1.o.f58481a;
            if (eVar != null) {
                rVarE = j0.c.E(g3.r.b(rVarE, true, o0.P), CropImageView.DEFAULT_ASPECT_RATIO, this.f30681c.w(t6.f31109b), CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13);
            }
            rVarI = this.f30679a.i(rVarE);
            strI = i1.p.i(nVar, R.string.default_error_message);
            float f11 = i1.d1.f33993b;
            z11 = this.f30682d;
            if (z11) {
                rVarI = g3.r.b(rVarI, false, new c6.o(strI, 11));
            }
            z1.r rVarA2 = j0.e2.a(rVarI, j6.f30481c, j6.f30480b);
            haVar = this.f30683e;
            if (z11) {
                j11 = haVar.f30359j;
            } else {
                j11 = haVar.f30358i;
            }
            g2.y0 y0Var2 = new g2.y0(j11);
            fz.e eVar3 = this.U;
            g2.w0 w0Var2 = this.V;
            String str2 = this.f30684f;
            boolean z14 = this.H;
            boolean z15 = this.N;
            o3.f0 f0Var2 = this.Q;
            h0.i iVar2 = this.R;
            s0.l.a(str2, this.f30685t, rVarA2, z14, this.K, this.L, this.M, z15, this.O, this.P, f0Var2, null, iVar2, y0Var2, t1.e.d(1474611661, new l6(str2, z14, z15, f0Var2, iVar2, this.f30682d, this.f30680b, this.S, this.T, eVar3, haVar, w0Var2), nVar), nVar, 0);
        }
        return qy.b0.f48488a;
    }
}
