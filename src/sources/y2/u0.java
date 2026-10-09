package y2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class u0 extends kotlin.jvm.internal.n implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f57008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v0 f57009b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u0(v0 v0Var, int i11) {
        super(0);
        this.f57008a = i11;
        this.f57009b = v0Var;
    }

    @Override // fz.a
    public final Object invoke() {
        r0 r0VarA1;
        switch (this.f57008a) {
            case 0:
                v0 v0Var = this.f57009b;
                m0 m0Var = v0Var.f57017f;
                m0Var.f56967h = 0;
                n1.e eVarA = m0Var.f56960a.A();
                Object[] objArr = eVarA.f43112a;
                int i11 = eVarA.f43114c;
                for (int i12 = 0; i12 < i11; i12++) {
                    v0 v0Var2 = ((i0) objArr[i12]).f56893j0.f56975q;
                    kotlin.jvm.internal.m.c(v0Var2);
                    v0Var2.H = v0Var2.K;
                    v0Var2.K = Integer.MAX_VALUE;
                    if (v0Var2.L == g0.InLayoutBlock) {
                        v0Var2.L = g0.NotUsed;
                    }
                }
                i0 i0Var = m0Var.f56960a;
                i0 i0Var2 = m0Var.f56960a;
                n1.e eVarA2 = i0Var.A();
                Object[] objArr2 = eVarA2.f43112a;
                int i13 = eVarA2.f43114c;
                for (int i14 = 0; i14 < i13; i14++) {
                    v0 v0Var3 = ((i0) objArr2[i14]).f56893j0.f56975q;
                    kotlin.jvm.internal.m.c(v0Var3);
                    v0Var3.T.f56923d = false;
                }
                u uVar = v0Var.e().f57012u0;
                if (uVar != null) {
                    boolean z11 = uVar.M;
                    n1.b bVar = (n1.b) i0Var2.o();
                    int i15 = ((n1.e) bVar.f43104b).f43114c;
                    for (int i16 = 0; i16 < i15; i16++) {
                        r0 r0VarA2 = ((k1) ((i0) bVar.get(i16)).f56892i0.f50087e).a1();
                        if (r0VarA2 != null) {
                            r0VarA2.M = z11;
                        }
                    }
                }
                u uVar2 = v0Var.e().f57012u0;
                kotlin.jvm.internal.m.c(uVar2);
                uVar2.K0().b();
                if (v0Var.e().f57012u0 != null) {
                    n1.b bVar2 = (n1.b) i0Var2.o();
                    int i17 = ((n1.e) bVar2.f43104b).f43114c;
                    for (int i18 = 0; i18 < i17; i18++) {
                        r0 r0VarA3 = ((k1) ((i0) bVar2.get(i18)).f56892i0.f50087e).a1();
                        if (r0VarA3 != null) {
                            r0VarA3.M = false;
                        }
                    }
                }
                n1.e eVarA3 = i0Var2.A();
                Object[] objArr3 = eVarA3.f43112a;
                int i19 = eVarA3.f43114c;
                for (int i21 = 0; i21 < i19; i21++) {
                    v0 v0Var4 = ((i0) objArr3[i21]).f56893j0.f56975q;
                    kotlin.jvm.internal.m.c(v0Var4);
                    int i22 = v0Var4.H;
                    int i23 = v0Var4.K;
                    if (i22 != i23 && i23 == Integer.MAX_VALUE) {
                        v0Var4.x0(true);
                    }
                }
                n1.e eVarA4 = i0Var2.A();
                Object[] objArr4 = eVarA4.f43112a;
                int i24 = eVarA4.f43114c;
                for (int i25 = 0; i25 < i24; i25++) {
                    v0 v0Var5 = ((i0) objArr4[i25]).f56893j0.f56975q;
                    kotlin.jvm.internal.m.c(v0Var5);
                    j0 j0Var = v0Var5.T;
                    j0Var.f56924e = j0Var.f56923d;
                }
                break;
            case 1:
                v0 v0Var6 = this.f57009b;
                m0 m0Var2 = v0Var6.f57017f;
                w2.f1 placementScope = null;
                if (f.s(m0Var2.f56960a) || m0Var2.f56962c) {
                    k1 k1Var = m0Var2.a().S;
                    if (k1Var != null) {
                        placementScope = k1Var.N;
                    }
                } else {
                    k1 k1Var2 = m0Var2.a().S;
                    if (k1Var2 != null && (r0VarA1 = k1Var2.a1()) != null) {
                        placementScope = r0VarA1.N;
                    }
                }
                if (placementScope == null) {
                    placementScope = l0.a(m0Var2.f56960a).getPlacementScope();
                }
                r0 r0VarA4 = m0Var2.a().a1();
                kotlin.jvm.internal.m.c(r0VarA4);
                w2.f1.i(placementScope, r0VarA4, v0Var6.Q);
                break;
            default:
                v0 v0Var7 = this.f57009b;
                r0 r0VarA5 = v0Var7.f57017f.a().a1();
                kotlin.jvm.internal.m.c(r0VarA5);
                r0VarA5.B(v0Var7.f57013a0);
                break;
        }
        return qy.b0.f48488a;
    }
}
