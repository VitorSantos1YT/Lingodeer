package tg;

import l1.q1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class h implements fz.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z1.r f52282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f52283b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j3.y0 f52284c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t1.d f52285d;

    public h(z1.r rVar, float f5, j3.y0 y0Var, t1.d dVar) {
        this.f52282a = rVar;
        this.f52283b = f5;
        this.f52284c = y0Var;
        this.f52285d = dVar;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0052  */
    /* JADX WARN: Code duplicated, block: B:25:0x0082  */
    /* JADX WARN: Code duplicated, block: B:26:0x0086  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a7  */
    @Override // fz.g
    public final Object f(Object obj, Object obj2, Object obj3, Object obj4) {
        int i11;
        int iV;
        l1.s sVar;
        y2.i iVar;
        y2.h hVar;
        i0 CodeBlockLayout = (i0) obj;
        z1.r layoutModifier = (z1.r) obj2;
        l1.n nVar = (l1.n) obj3;
        int iIntValue = ((Number) obj4).intValue();
        kotlin.jvm.internal.m.f(CodeBlockLayout, "$this$CodeBlockLayout");
        kotlin.jvm.internal.m.f(layoutModifier, "layoutModifier");
        if ((iIntValue & 6) == 0) {
            i11 = (((l1.s) nVar).f(CodeBlockLayout) ? 4 : 2) | iIntValue;
        } else {
            i11 = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            i11 |= ((l1.s) nVar).f(layoutModifier) ? 32 : 16;
        }
        if ((i11 & 147) == 146) {
            l1.s sVar2 = (l1.s) nVar;
            if (sVar2.F()) {
                sVar2.W();
            } else {
                z1.r rVarA = j0.c.A(layoutModifier.i(this.f52282a), this.f52283b);
                w2.q0 q0VarD = j0.o.d(z1.c.f58463a, false);
                iV = l1.t.v(nVar);
                sVar = (l1.s) nVar;
                q1 q1VarL = sVar.l();
                z1.r rVarC = z1.a.c(nVar, rVarA);
                y2.k.J.getClass();
                iVar = y2.j.f56913b;
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar);
                } else {
                    sVar.r0();
                }
                l1.t.J(y2.j.f56917f, q0VarD, nVar);
                l1.t.J(y2.j.f56916e, q1VarL, nVar);
                hVar = y2.j.f56918g;
                if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iV))) {
                    defpackage.e.A(iV, sVar, iV, hVar);
                }
                l1.t.J(y2.j.f56915d, rVarC, nVar);
                n0.a(CodeBlockLayout, nVar).f(this.f52284c, t1.e.d(-375984849, new g(this.f52285d, CodeBlockLayout, 0), nVar), nVar, 48);
                sVar.p(true);
            }
        } else {
            z1.r rVarA2 = j0.c.A(layoutModifier.i(this.f52282a), this.f52283b);
            w2.q0 q0VarD2 = j0.o.d(z1.c.f58463a, false);
            iV = l1.t.v(nVar);
            sVar = (l1.s) nVar;
            q1 q1VarL2 = sVar.l();
            z1.r rVarC2 = z1.a.c(nVar, rVarA2);
            y2.k.J.getClass();
            iVar = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(y2.j.f56917f, q0VarD2, nVar);
            l1.t.J(y2.j.f56916e, q1VarL2, nVar);
            hVar = y2.j.f56918g;
            if (sVar.S) {
                defpackage.e.A(iV, sVar, iV, hVar);
            } else {
                defpackage.e.A(iV, sVar, iV, hVar);
            }
            l1.t.J(y2.j.f56915d, rVarC2, nVar);
            n0.a(CodeBlockLayout, nVar).f(this.f52284c, t1.e.d(-375984849, new g(this.f52285d, CodeBlockLayout, 0), nVar), nVar, 48);
            sVar.p(true);
        }
        return qy.b0.f48488a;
    }
}
