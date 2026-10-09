package a0;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class i1 extends kotlin.jvm.internal.n implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k1 f108b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f109c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i1(k1 k1Var, long j11, int i11) {
        super(1);
        this.f107a = i11;
        this.f108b = k1Var;
        this.f109c = j11;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00ce  */
    @Override // fz.c
    public final Object invoke(Object obj) {
        fz.c cVar;
        fz.c cVar2;
        long jD;
        int i11;
        fz.c cVar3;
        fz.c cVar4;
        switch (this.f107a) {
            case 0:
                int i12 = g1.f91a[((v0) obj).ordinal()];
                long j11 = this.f109c;
                if (i12 != 1) {
                    k1 k1Var = this.f108b;
                    if (i12 == 2) {
                        n0 n0Var = k1Var.V.f132a.f55c;
                        if (n0Var != null && (cVar = n0Var.f148b) != null) {
                            j11 = ((v3.l) cVar.invoke(new v3.l(j11))).f53498a;
                        }
                    } else {
                        if (i12 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        n0 n0Var2 = k1Var.W.f143a.f55c;
                        if (n0Var2 != null && (cVar2 = n0Var2.f148b) != null) {
                            j11 = ((v3.l) cVar2.invoke(new v3.l(j11))).f53498a;
                        }
                    }
                }
                return new v3.l(j11);
            case 1:
                v0 v0Var = (v0) obj;
                k1 k1Var2 = this.f108b;
                if (k1Var2.f121a0 == null || k1Var2.V0() == null || kotlin.jvm.internal.m.a(k1Var2.f121a0, k1Var2.V0()) || (i11 = g1.f91a[v0Var.ordinal()]) == 1 || i11 == 2) {
                    jD = 0;
                } else {
                    if (i11 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    n0 n0Var3 = k1Var2.W.f143a.f55c;
                    if (n0Var3 != null) {
                        fz.c cVar5 = n0Var3.f148b;
                        long j12 = this.f109c;
                        long j13 = ((v3.l) cVar5.invoke(new v3.l(j12))).f53498a;
                        z1.e eVarV0 = k1Var2.V0();
                        kotlin.jvm.internal.m.c(eVarV0);
                        v3.m mVar = v3.m.Ltr;
                        long jA = ((z1.j) eVarV0).a(j12, j13, mVar);
                        z1.e eVar = k1Var2.f121a0;
                        kotlin.jvm.internal.m.c(eVar);
                        jD = v3.j.d(jA, eVar.a(j12, j13, mVar));
                    } else {
                        jD = 0;
                    }
                }
                return new v3.j(jD);
            default:
                v0 v0Var2 = (v0) obj;
                k1 k1Var3 = this.f108b;
                a2 a2Var = k1Var3.V.f132a.f54b;
                long j14 = this.f109c;
                long j15 = 0;
                long j16 = (a2Var == null || (cVar4 = a2Var.f15a) == null) ? 0L : ((v3.j) cVar4.invoke(new v3.l(j14))).f53492a;
                a2 a2Var2 = k1Var3.W.f143a.f54b;
                long j17 = (a2Var2 == null || (cVar3 = a2Var2.f15a) == null) ? 0L : ((v3.j) cVar3.invoke(new v3.l(j14))).f53492a;
                int i13 = g1.f91a[v0Var2.ordinal()];
                if (i13 != 1) {
                    if (i13 == 2) {
                        j15 = j16;
                    } else {
                        if (i13 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        j15 = j17;
                    }
                }
                return new v3.j(j15);
        }
    }
}
