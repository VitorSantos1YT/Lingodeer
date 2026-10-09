package xu;

import com.lingodeer.R;
import com.lingodeer.data.model.uistate.MasteryUiState;
import com.yalantis.ucrop.view.CropImageView;
import fr.j3;
import h1.k7;
import h1.ua;
import j0.c2;
import j0.e2;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class c0 {
    public static final void a(List statics, l1.n nVar, int i11) {
        List list;
        kotlin.jvm.internal.m.f(statics, "statics");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1264701140);
        int i12 = i11 | (sVar.h(statics) ? 4 : 2);
        if (sVar.T(i12 & 1, (i12 & 3) != 2)) {
            z1.o oVar = z1.o.f58481a;
            z1.r rVarD = e2.d(oVar, 1.0f);
            j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            l1.q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, rVarD);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            y2.h hVar = y2.j.f56917f;
            l1.t.J(hVar, uVarA, sVar);
            y2.h hVar2 = y2.j.f56916e;
            l1.t.J(hVar2, q1VarL, sVar);
            y2.h hVar3 = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar3);
            }
            y2.h hVar4 = y2.j.f56915d;
            l1.t.J(hVar4, rVarC, sVar);
            z1.i iVar2 = z1.c.M;
            z1.r rVarB = j0.c.B(oVar, 20, 12);
            j0.a2 a2VarA = j0.z1.a(j0.i.f35303a, iVar2, sVar, 48);
            int iHashCode2 = Long.hashCode(sVar.T);
            l1.q1 q1VarL2 = sVar.l();
            z1.r rVarC2 = z1.a.c(sVar, rVarB);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar, a2VarA, sVar);
            l1.t.J(hVar2, q1VarL2, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar3);
            }
            l1.t.J(hVar4, rVarC2, sVar);
            j3.y0 y0VarA = j3.y0.a((j3.y0) sVar.j(ua.f31167a), 0L, j3.A(12), n3.s.K, null, null, 0L, null, null, 3, 0, 0L, null, 16744441);
            String strE0 = ub.a.e0(sVar, R.string.courses);
            c2 c2Var = c2.f35266a;
            ua.b(strE0, c2Var.a(oVar, 1.0f), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0VarA, sVar, 0, 0, 65532);
            float f5 = 16;
            k7.n(e2.g(oVar, f5), CropImageView.DEFAULT_ASPECT_RATIO, 0L, sVar, 6, 6);
            ua.b(ub.a.e0(sVar, R.string.words), c2Var.a(oVar, 1.0f), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0VarA, sVar, 0, 0, 65532);
            k7.n(e2.g(oVar, f5), CropImageView.DEFAULT_ASPECT_RATIO, 0L, sVar, 6, 6);
            ua.b(ub.a.e0(sVar, R.string.sentences), c2Var.a(oVar, 1.0f), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0VarA, sVar, 0, 0, 65532);
            k7.n(e2.g(oVar, f5), CropImageView.DEFAULT_ASPECT_RATIO, 0L, sVar, 6, 6);
            ua.b(ub.a.e0(sVar, R.string.total), c2Var.a(oVar, 1.0f), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0VarA, sVar, 0, 0, 65532);
            sVar.p(true);
            list = statics;
            boolean zH = sVar.h(list);
            Object objQ = sVar.Q();
            if (zH || objQ == l1.m.f39353a) {
                objQ = new iu.d(2, list);
                sVar.o0(objQ);
            }
            ue.f.a(null, null, null, null, null, null, false, null, (fz.c) objQ, sVar, 0, 511);
            sVar = sVar;
            sVar.p(true);
        } else {
            list = statics;
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new iv.w0(i11, 3, list);
        }
    }

    public static final void b(MasteryUiState masteryUiState, l1.n nVar, int i11) {
        kotlin.jvm.internal.m.f(masteryUiState, "masteryUiState");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-1312077010);
        int i12 = (sVar.h(masteryUiState) ? 4 : 2) | i11;
        if (!sVar.T(i12 & 1, (i12 & 3) != 2)) {
            sVar.W();
        } else if (masteryUiState.equals(MasteryUiState.Loading.INSTANCE)) {
            sVar.d0(1814382717);
            tv.a.d(0, 1, sVar, null);
            sVar.p(false);
        } else {
            if (!(masteryUiState instanceof MasteryUiState.Success)) {
                throw nv.p.x(sVar, 1814381024, false);
            }
            sVar.d0(411343383);
            a(((MasteryUiState.Success) masteryUiState).getStatics(), sVar, 0);
            sVar.p(false);
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new mt.r(masteryUiState, i11, 25);
        }
    }
}
