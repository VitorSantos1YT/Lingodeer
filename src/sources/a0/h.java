package a0;

import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.window.PopupLayout;
import h1.e8;
import h1.f8;
import h1.u5;
import h1.v5;
import h1.wb;
import java.util.LinkedHashMap;
import kotlin.NoWhenBranchMatchedException;
import n9.i2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends kotlin.jvm.internal.n implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f92a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f93b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(Object obj, int i11) {
        super(2);
        this.f92a = i11;
        this.f93b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:62:0x0199  */
    /* JADX WARN: Code duplicated, block: B:64:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:65:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:70:0x01eb  */
    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        int iV;
        l1.s sVar;
        y2.i iVar;
        y2.h hVar;
        f8 f8Var;
        switch (this.f92a) {
            case 0:
                v0 v0Var = (v0) obj;
                v0 v0Var2 = (v0) obj2;
                v0 v0Var3 = v0.PostExit;
                return Boolean.valueOf(v0Var == v0Var3 && v0Var2 == v0Var3 && !((m1) this.f93b).f143a.f57e);
            case 1:
                ((b2.i) this.f93b).i(((Number) obj).intValue(), (g3.t) obj2);
                return qy.b0.f48488a;
            case 2:
                l1.n nVar = (l1.n) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    l1.s sVar2 = (l1.s) nVar;
                    if (sVar2.F()) {
                        sVar2.W();
                    } else {
                        j0.b bVar = j0.i.f35304b;
                        z1.i iVar2 = z1.c.M;
                        fz.f fVar = (fz.f) this.f93b;
                        j0.a2 a2VarA = j0.z1.a(bVar, iVar2, nVar, 54);
                        iV = l1.t.v(nVar);
                        sVar = (l1.s) nVar;
                        l1.q1 q1VarL = sVar.l();
                        z1.r rVarC = z1.a.c(nVar, z1.o.f58481a);
                        y2.k.J.getClass();
                        iVar = y2.j.f56913b;
                        sVar.h0();
                        if (sVar.S) {
                            sVar.k(iVar);
                        } else {
                            sVar.r0();
                        }
                        l1.t.J(y2.j.f56917f, a2VarA, nVar);
                        l1.t.J(y2.j.f56916e, q1VarL, nVar);
                        hVar = y2.j.f56918g;
                        if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iV))) {
                            defpackage.e.A(iV, sVar, iV, hVar);
                        }
                        l1.t.J(y2.j.f56915d, rVarC, nVar);
                        fVar.invoke(j0.c2.f35266a, nVar, 6);
                        sVar.p(true);
                    }
                } else {
                    j0.b bVar2 = j0.i.f35304b;
                    z1.i iVar3 = z1.c.M;
                    fz.f fVar2 = (fz.f) this.f93b;
                    j0.a2 a2VarA2 = j0.z1.a(bVar2, iVar3, nVar, 54);
                    iV = l1.t.v(nVar);
                    sVar = (l1.s) nVar;
                    l1.q1 q1VarL2 = sVar.l();
                    z1.r rVarC2 = z1.a.c(nVar, z1.o.f58481a);
                    y2.k.J.getClass();
                    iVar = y2.j.f56913b;
                    sVar.h0();
                    if (sVar.S) {
                        sVar.k(iVar);
                    } else {
                        sVar.r0();
                    }
                    l1.t.J(y2.j.f56917f, a2VarA2, nVar);
                    l1.t.J(y2.j.f56916e, q1VarL2, nVar);
                    hVar = y2.j.f56918g;
                    if (sVar.S) {
                        defpackage.e.A(iV, sVar, iV, hVar);
                    } else {
                        defpackage.e.A(iV, sVar, iV, hVar);
                    }
                    l1.t.J(y2.j.f56915d, rVarC2, nVar);
                    fVar2.invoke(j0.c2.f35266a, nVar, 6);
                    sVar.p(true);
                }
                return qy.b0.f48488a;
            case 3:
                long j11 = ((f2.b) obj2).f26570a;
                h1.r1 r1Var = (h1.r1) this.f93b;
                rz.e0.B(r1Var.H0(), null, null, new h1.o1(r1Var, j11, null, 0), 3);
                wb.r(r1Var.S, r1Var.V, r1Var.W, y2.f.x(r1Var).f56881b0.e0(wb.f31266f), r1Var.X);
                return qy.b0.f48488a;
            case 4:
                long j12 = ((v3.l) obj).f53498a;
                float fG = v3.a.g(((v3.a) obj2).f53483a);
                e8 e8Var = (e8) this.f93b;
                v5 v5Var = new v5(fG, j12, e8Var);
                i1.b0 b0Var = new i1.b0();
                v5Var.invoke(b0Var);
                LinkedHashMap linkedHashMap = b0Var.f33980a;
                i1.o0 o0Var = new i1.o0(linkedHashMap);
                int i11 = u5.f31146a[((f8) ((l1.g0) e8Var.f30211b.f44882h).getValue()).ordinal()];
                if (i11 == 1) {
                    f8Var = f8.Hidden;
                } else {
                    if (i11 != 2 && i11 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    f8Var = f8.PartiallyExpanded;
                    if (!linkedHashMap.containsKey(f8Var)) {
                        f8Var = f8.Expanded;
                        if (!linkedHashMap.containsKey(f8Var)) {
                            f8Var = f8.Hidden;
                        }
                    }
                }
                return new qy.l(o0Var, f8Var);
            case 5:
                ((Number) obj2).intValue();
                ve.i.e((c6.l) this.f93b, (l1.n) obj, 1);
                return qy.b0.f48488a;
            case 6:
                float fFloatValue = ((Number) obj).floatValue();
                ((Number) obj2).floatValue();
                ((kw.h) this.f93b).f38868e.m(fFloatValue);
                return qy.b0.f48488a;
            case 7:
                n9.o prependHint = (n9.o) obj;
                n9.o appendHint = (n9.o) obj2;
                kotlin.jvm.internal.m.f(prependHint, "prependHint");
                kotlin.jvm.internal.m.f(appendHint, "appendHint");
                i2 i2Var = (i2) this.f93b;
                if (n9.m.c(i2Var, prependHint.f43654a, n9.y.PREPEND)) {
                    prependHint.f43654a = i2Var;
                    prependHint.f43655b.d(i2Var);
                }
                if (n9.m.c(i2Var, appendHint.f43654a, n9.y.APPEND)) {
                    appendHint.f43654a = i2Var;
                    appendHint.f43655b.d(i2Var);
                }
                return qy.b0.f48488a;
            case 8:
                z1.r rVar = (z1.r) obj;
                z1.r rVarB = (z1.p) obj2;
                l1.n nVar2 = (l1.n) this.f93b;
                if (rVarB instanceof z1.m) {
                    fz.f fVar3 = ((z1.m) rVarB).f58479b;
                    kotlin.jvm.internal.c0.d(3, fVar3);
                    rVarB = z1.a.b(nVar2, (z1.r) fVar3.invoke(z1.o.f58481a, nVar2, 0));
                }
                return rVar.i(rVarB);
            case 9:
                l1.n nVar3 = (l1.n) obj;
                int iIntValue = ((Number) obj2).intValue();
                l1.s sVar3 = (l1.s) nVar3;
                if (sVar3.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ((AbstractComposeView) this.f93b).a(sVar3, 0);
                } else {
                    sVar3.W();
                }
                return qy.b0.f48488a;
            case 10:
                ((Number) obj2).intValue();
                ((ComposeView) this.f93b).a((l1.n) obj, l1.t.M(1));
                return qy.b0.f48488a;
            default:
                ((Number) obj2).intValue();
                ((PopupLayout) this.f93b).a((l1.n) obj, l1.t.M(1));
                return qy.b0.f48488a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(Object obj, int i11, int i12) {
        super(2);
        this.f92a = i12;
        this.f93b = obj;
    }
}
