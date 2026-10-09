package androidx.compose.material3;

import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.fragment.app.p;
import b0.d;
import h1.b6;
import h1.c6;
import h1.m5;
import h1.t1;
import java.util.UUID;
import l1.b1;
import l1.c0;
import l1.g;
import l1.n;
import l1.q;
import l1.s;
import l1.t;
import l1.x1;
import rz.b0;
import v3.m;
import w1.j;
import z2.g1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    /* JADX WARN: Code duplicated, block: B:59:0x0147  */
    /* JADX WARN: Code duplicated, block: B:60:0x0149  */
    /* JADX WARN: Code duplicated, block: B:63:0x0152  */
    /* JADX WARN: Code duplicated, block: B:64:0x0154  */
    /* JADX WARN: Code duplicated, block: B:68:0x0164  */
    public static final void a(fz.a aVar, b6 b6Var, d dVar, t1.d dVar2, n nVar, int i11) {
        int i12;
        b6 b6Var2;
        m mVar;
        s sVar;
        Object obj;
        g gVar;
        boolean z11;
        boolean z12;
        boolean zF;
        Object objQ;
        s sVar2;
        s sVar3 = (s) nVar;
        sVar3.f0(1254951810);
        if ((i11 & 6) == 0) {
            i12 = (sVar3.h(aVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            b6Var2 = b6Var;
            i12 |= sVar3.f(b6Var2) ? 32 : 16;
        } else {
            b6Var2 = b6Var;
        }
        if ((i11 & 384) == 0) {
            i12 |= (i11 & 512) == 0 ? sVar3.f(dVar) : sVar3.h(dVar) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar3.h(dVar2) ? 2048 : 1024;
        }
        int i13 = i12;
        if ((i13 & 1171) == 1170 && sVar3.F()) {
            sVar3.W();
            sVar2 = sVar3;
        } else {
            View view = (View) sVar3.j(AndroidCompositionLocals_androidKt.f1204f);
            v3.c cVar = (v3.c) sVar3.j(g1.f58547h);
            m mVar2 = (m) sVar3.j(g1.f58552n);
            q qVarG = t.G(sVar3);
            b1 b1VarH = t.H(dVar2, sVar3);
            UUID uuid = (UUID) j.e(new Object[0], null, t1.M, sVar3, 3072, 6);
            Object objQ2 = sVar3.Q();
            g gVar2 = l1.m.f39353a;
            if (objQ2 == gVar2) {
                c0 c0Var = new c0(t.q(sVar3));
                sVar3.o0(c0Var);
                objQ2 = c0Var;
            }
            b0 b0Var = ((c0) objQ2).f39245a;
            boolean zT = d0.n.t(sVar3);
            boolean zF2 = sVar3.f(view) | sVar3.f(cVar);
            Object objQ3 = sVar3.Q();
            if (zF2 || objQ3 == gVar2) {
                s sVar4 = sVar3;
                mVar = mVar2;
                b bVar = new b(aVar, b6Var2, view, mVar, cVar, uuid, dVar, b0Var, zT);
                t1.d dVar3 = new t1.d(new h1.q(2, b1VarH), true, -1560960657);
                ModalBottomSheetDialogLayout modalBottomSheetDialogLayout = bVar.f1132t;
                modalBottomSheetDialogLayout.setParentCompositionContext(qVarG);
                modalBottomSheetDialogLayout.P.setValue(dVar3);
                modalBottomSheetDialogLayout.R = true;
                modalBottomSheetDialogLayout.c();
                sVar4.o0(bVar);
                obj = bVar;
                sVar = sVar4;
            } else {
                sVar = sVar3;
                mVar = mVar2;
                obj = objQ3;
            }
            b bVar2 = (b) obj;
            boolean zH = sVar.h(bVar2);
            Object objQ4 = sVar.Q();
            if (zH) {
                gVar = gVar2;
            } else {
                gVar = gVar2;
                if (objQ4 == gVar) {
                }
                t.c(bVar2, (fz.c) objQ4, sVar);
                boolean zH2 = sVar.h(bVar2);
                if ((i13 & 14) == 4) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                boolean z13 = zH2 | z11;
                if ((i13 & 112) == 32) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                zF = z13 | z12 | sVar.f(mVar);
                objQ = sVar.Q();
                if (zF || objQ == gVar) {
                    p pVar = new p(bVar2, aVar, b6Var, mVar, 4);
                    sVar.o0(pVar);
                    objQ = pVar;
                }
                t.j((fz.a) objQ, sVar);
                sVar2 = sVar;
            }
            objQ4 = new m5(bVar2, 1);
            sVar.o0(objQ4);
            t.c(bVar2, (fz.c) objQ4, sVar);
            boolean zH3 = sVar.h(bVar2);
            if ((i13 & 14) == 4) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean z14 = zH3 | z11;
            if ((i13 & 112) == 32) {
                z12 = true;
            } else {
                z12 = false;
            }
            zF = z14 | z12 | sVar.f(mVar);
            objQ = sVar.Q();
            if (zF) {
                p pVar2 = new p(bVar2, aVar, b6Var, mVar, 4);
                sVar.o0(pVar2);
                objQ = pVar2;
            } else {
                p pVar3 = new p(bVar2, aVar, b6Var, mVar, 4);
                sVar.o0(pVar3);
                objQ = pVar3;
            }
            t.j((fz.a) objQ, sVar);
            sVar2 = sVar;
        }
        x1 x1VarT = sVar2.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new c6(aVar, b6Var, dVar, dVar2, i11);
        }
    }
}
