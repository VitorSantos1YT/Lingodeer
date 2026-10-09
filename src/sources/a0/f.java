package a0;

import b0.i2;
import h1.fa;
import h1.x9;
import h1.y9;
import j0.e2;
import l1.b3;
import l1.k2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends kotlin.jvm.internal.n implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f69a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f70b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(Object obj, int i11) {
        super(3);
        this.f69a = i11;
        this.f70b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x00c4  */
    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f69a) {
            case 0:
                w2.g1 g1VarB = ((w2.p0) obj2).B(((v3.a) obj3).f53483a);
                return ((w2.s0) obj).q0(g1VarB.f54501a, g1VarB.f54502b, ry.s.f50855a, new e(0, g1VarB, (p0) this.f70b));
            case 1:
                ((Number) obj3).intValue();
                l1.s sVar = (l1.s) ((l1.n) obj2);
                sVar.d0(955869654);
                b0.c0 c0Var = (b0.c0) this.f70b;
                sVar.p(false);
                return c0Var;
            case 2:
                l1.n nVar = (l1.n) obj2;
                if ((((Number) obj3).intValue() & 17) == 16) {
                    l1.s sVar2 = (l1.s) nVar;
                    if (sVar2.F()) {
                        sVar2.W();
                    } else {
                        x9.d((fz.e) this.f70b, nVar, 0);
                    }
                } else {
                    x9.d((fz.e) this.f70b, nVar, 0);
                }
                return qy.b0.f48488a;
            case 3:
                ((Number) obj3).intValue();
                l1.s sVar3 = (l1.s) ((l1.n) obj2);
                sVar3.d0(-1541271084);
                y9 y9Var = (y9) this.f70b;
                float f5 = y9Var.f31368b;
                i2 i2Var = fa.f30251a;
                b3 b3VarA = b0.h.a(f5, i2Var, null, sVar3, 0, 12);
                b3 b3VarA2 = b0.h.a(y9Var.f31367a, i2Var, null, sVar3, 0, 12);
                z1.r rVarW = e2.w(e2.e((z1.r) obj, 1.0f), z1.c.f58469t, 2);
                boolean zF = sVar3.f(b3VarA2);
                Object objQ = sVar3.Q();
                if (zF || objQ == l1.m.f39353a) {
                    objQ = new r0(b3VarA2, 1);
                    sVar3.o0(objQ);
                }
                z1.r rVarS = e2.s(j0.c.w(rVarW, (fz.c) objQ), ((v3.f) b3VarA.getValue()).f53489a);
                sVar3.p(false);
                return rVarS;
            default:
                l1.n nVar2 = ((k2) obj).f39331a;
                l1.n nVar3 = (l1.n) obj2;
                ((Number) obj3).intValue();
                int iHashCode = Long.hashCode(((l1.s) nVar3).T);
                z1.r rVarC = z1.a.c(nVar3, (z1.r) this.f70b);
                l1.s sVar4 = (l1.s) nVar2;
                sVar4.e0(509942095);
                y2.k.J.getClass();
                l1.t.J(y2.j.f56915d, rVarC, sVar4);
                l1.t.y(sVar4, Integer.valueOf(iHashCode), y2.j.f56918g);
                sVar4.p(false);
                return qy.b0.f48488a;
        }
    }
}
