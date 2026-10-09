package n0;

import j0.v1;
import l1.q1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class z implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f43038a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f43039b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f43040c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f43041d;

    public z(int i11, v1 v1Var, t1.d dVar) {
        this.f43039b = i11;
        this.f43040c = v1Var;
        this.f43041d = dVar;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    /* JADX WARN: Code duplicated, block: B:13:0x0027  */
    /* JADX WARN: Code duplicated, block: B:15:0x0058  */
    /* JADX WARN: Code duplicated, block: B:16:0x005c  */
    /* JADX WARN: Code duplicated, block: B:21:0x007d  */
    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        int i11;
        int iV;
        l1.s sVar;
        y2.i iVar;
        y2.h hVar;
        switch (this.f43038a) {
            case 0:
                l1.n nVar = (l1.n) obj;
                int iIntValue = ((Number) obj2).intValue();
                l1.s sVar2 = (l1.s) nVar;
                if (sVar2.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ((a0) this.f43040c).c(this.f43039b, this.f43041d, sVar2, 0);
                } else {
                    sVar2.W();
                }
                break;
            default:
                l1.n nVar2 = (l1.n) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    l1.s sVar3 = (l1.s) nVar2;
                    if (sVar3.F()) {
                        sVar3.W();
                    } else {
                        for (i11 = 0; i11 < this.f43039b; i11++) {
                            z1.r rVarZ = j0.c.z(z1.o.f58481a, (v1) this.f43040c);
                            t1.d dVar = (t1.d) this.f43041d;
                            w2.q0 q0VarD = j0.o.d(z1.c.f58463a, false);
                            iV = l1.t.v(nVar2);
                            sVar = (l1.s) nVar2;
                            q1 q1VarL = sVar.l();
                            z1.r rVarC = z1.a.c(nVar2, rVarZ);
                            y2.k.J.getClass();
                            iVar = y2.j.f56913b;
                            sVar.h0();
                            if (sVar.S) {
                                sVar.k(iVar);
                            } else {
                                sVar.r0();
                            }
                            l1.t.J(y2.j.f56917f, q0VarD, nVar2);
                            l1.t.J(y2.j.f56916e, q1VarL, nVar2);
                            hVar = y2.j.f56918g;
                            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iV))) {
                                defpackage.e.A(iV, sVar, iV, hVar);
                            }
                            l1.t.J(y2.j.f56915d, rVarC, nVar2);
                            dVar.invoke(Integer.valueOf(i11), nVar2, 0);
                            sVar.p(true);
                        }
                    }
                } else {
                    while (i11 < this.f43039b) {
                        z1.r rVarZ2 = j0.c.z(z1.o.f58481a, (v1) this.f43040c);
                        t1.d dVar2 = (t1.d) this.f43041d;
                        w2.q0 q0VarD2 = j0.o.d(z1.c.f58463a, false);
                        iV = l1.t.v(nVar2);
                        sVar = (l1.s) nVar2;
                        q1 q1VarL2 = sVar.l();
                        z1.r rVarC2 = z1.a.c(nVar2, rVarZ2);
                        y2.k.J.getClass();
                        iVar = y2.j.f56913b;
                        sVar.h0();
                        if (sVar.S) {
                            sVar.k(iVar);
                        } else {
                            sVar.r0();
                        }
                        l1.t.J(y2.j.f56917f, q0VarD2, nVar2);
                        l1.t.J(y2.j.f56916e, q1VarL2, nVar2);
                        hVar = y2.j.f56918g;
                        if (sVar.S) {
                            defpackage.e.A(iV, sVar, iV, hVar);
                        } else {
                            defpackage.e.A(iV, sVar, iV, hVar);
                        }
                        l1.t.J(y2.j.f56915d, rVarC2, nVar2);
                        dVar2.invoke(Integer.valueOf(i11), nVar2, 0);
                        sVar.p(true);
                    }
                }
                break;
        }
        return qy.b0.f48488a;
    }

    public z(int i11, Object obj, a0 a0Var) {
        this.f43040c = a0Var;
        this.f43039b = i11;
        this.f43041d = obj;
    }
}
