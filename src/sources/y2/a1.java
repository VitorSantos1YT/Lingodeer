package y2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a1 extends kotlin.jvm.internal.n implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f56820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b1 f56821b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a1(b1 b1Var, int i11) {
        super(0);
        this.f56820a = i11;
        this.f56821b = b1Var;
    }

    @Override // fz.a
    public final Object invoke() {
        w2.f1 placementScope;
        switch (this.f56820a) {
            case 0:
                b1 b1Var = this.f56821b;
                m0 m0Var = b1Var.f56832f;
                m0Var.f56968i = 0;
                n1.e eVarA = m0Var.f56960a.A();
                Object[] objArr = eVarA.f43112a;
                int i11 = eVarA.f43114c;
                for (int i12 = 0; i12 < i11; i12++) {
                    b1 b1Var2 = ((i0) objArr[i12]).f56893j0.f56974p;
                    b1Var2.H = b1Var2.K;
                    b1Var2.K = Integer.MAX_VALUE;
                    b1Var2.V = false;
                    if (b1Var2.N == g0.InLayoutBlock) {
                        b1Var2.N = g0.NotUsed;
                    }
                }
                i0 i0Var = m0Var.f56960a;
                i0 i0Var2 = m0Var.f56960a;
                n1.e eVarA2 = i0Var.A();
                Object[] objArr2 = eVarA2.f43112a;
                int i13 = eVarA2.f43114c;
                for (int i14 = 0; i14 < i13; i14++) {
                    ((i0) objArr2[i14]).f56893j0.f56974p.Z.f56923d = false;
                }
                if (b1Var.e().M) {
                    n1.b bVar = (n1.b) i0Var2.o();
                    int i15 = ((n1.e) bVar.f43104b).f43114c;
                    for (int i16 = 0; i16 < i15; i16++) {
                        ((k1) ((i0) bVar.get(i16)).f56892i0.f50087e).M = true;
                    }
                }
                b1Var.e().K0().b();
                if (b1Var.e().M) {
                    n1.b bVar2 = (n1.b) i0Var2.o();
                    int i17 = ((n1.e) bVar2.f43104b).f43114c;
                    for (int i18 = 0; i18 < i17; i18++) {
                        ((k1) ((i0) bVar2.get(i18)).f56892i0.f50087e).M = false;
                    }
                }
                n1.e eVarA3 = i0Var2.A();
                Object[] objArr3 = eVarA3.f43112a;
                int i19 = eVarA3.f43114c;
                for (int i21 = 0; i21 < i19; i21++) {
                    i0 i0Var3 = (i0) objArr3[i21];
                    m0 m0Var2 = i0Var3.f56893j0;
                    if (m0Var2.f56974p.H != i0Var3.x()) {
                        i0Var2.P();
                        i0Var2.D();
                        if (i0Var3.x() == Integer.MAX_VALUE) {
                            if (m0Var2.f56962c || f.s(i0Var3)) {
                                v0 v0Var = m0Var2.f56975q;
                                kotlin.jvm.internal.m.c(v0Var);
                                v0Var.x0(false);
                            }
                            m0Var2.f56974p.C0();
                        }
                    }
                }
                n1.e eVarA4 = i0Var2.A();
                Object[] objArr4 = eVarA4.f43112a;
                int i22 = eVarA4.f43114c;
                for (int i23 = 0; i23 < i22; i23++) {
                    j0 j0Var = ((i0) objArr4[i23]).f56893j0.f56974p.Z;
                    j0Var.f56924e = j0Var.f56923d;
                }
                break;
            case 1:
                b1 b1Var3 = this.f56821b;
                b1Var3.f56832f.a().B(b1Var3.f56830d0);
                break;
            default:
                b1 b1Var4 = this.f56821b;
                m0 m0Var3 = b1Var4.f56832f;
                k1 k1Var = m0Var3.a().S;
                if (k1Var == null || (placementScope = k1Var.N) == null) {
                    placementScope = l0.a(m0Var3.f56960a).getPlacementScope();
                }
                fz.c cVar = b1Var4.f56836i0;
                if (cVar == null) {
                    k1 k1VarA = m0Var3.a();
                    long j11 = b1Var4.f56837j0;
                    float f5 = b1Var4.f56838k0;
                    placementScope.getClass();
                    w2.f1.a(placementScope, k1VarA);
                    k1VarA.i0(v3.j.e(j11, k1VarA.f54505e), f5, null);
                } else {
                    k1 k1VarA2 = m0Var3.a();
                    long j12 = b1Var4.f56837j0;
                    float f11 = b1Var4.f56838k0;
                    placementScope.getClass();
                    w2.f1.a(placementScope, k1VarA2);
                    k1VarA2.i0(v3.j.e(j12, k1VarA2.f54505e), f11, cVar);
                }
                break;
        }
        return qy.b0.f48488a;
    }
}
