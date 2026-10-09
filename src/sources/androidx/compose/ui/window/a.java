package androidx.compose.ui.window;

import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.fragment.app.p;
import fz.e;
import h1.u2;
import java.util.UUID;
import l1.b1;
import l1.g;
import l1.n;
import l1.q;
import l1.q1;
import l1.s;
import l1.t;
import l1.x1;
import v3.m;
import w1.j;
import w2.q0;
import y2.i;
import y2.k;
import z2.g1;
import z3.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    /* JADX WARN: Code duplicated, block: B:23:0x0041  */
    /* JADX WARN: Code duplicated, block: B:25:0x0047  */
    /* JADX WARN: Code duplicated, block: B:26:0x004a  */
    /* JADX WARN: Code duplicated, block: B:30:0x0056  */
    /* JADX WARN: Code duplicated, block: B:31:0x0058  */
    /* JADX WARN: Code duplicated, block: B:34:0x0061 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0063  */
    /* JADX WARN: Code duplicated, block: B:38:0x0097  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:46:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:49:0x010a  */
    /* JADX WARN: Code duplicated, block: B:50:0x010c  */
    /* JADX WARN: Code duplicated, block: B:54:0x0115  */
    /* JADX WARN: Code duplicated, block: B:58:0x0128  */
    /* JADX WARN: Code duplicated, block: B:61:0x013d  */
    /* JADX WARN: Code duplicated, block: B:64:0x0147  */
    /* JADX WARN: Code duplicated, block: B:66:? A[RETURN, SYNTHETIC] */
    public static final void a(fz.a aVar, r rVar, t1.d dVar, n nVar, int i11, int i12) {
        fz.a aVar2;
        int i13;
        r rVar2;
        int i14;
        boolean z11;
        r rVar3;
        x1 x1VarT;
        View view;
        v3.c cVar;
        m mVar;
        q qVarG;
        b1 b1VarH;
        Object objQ;
        g gVar;
        UUID uuid;
        boolean zF;
        Object objQ2;
        d dVar2;
        boolean zH;
        Object objQ3;
        boolean z12;
        boolean zD;
        Object objQ4;
        int i15;
        s sVar = (s) nVar;
        sVar.f0(826668973);
        if ((i11 & 6) == 0) {
            aVar2 = aVar;
            i13 = (sVar.h(aVar2) ? 4 : 2) | i11;
        } else {
            aVar2 = aVar;
            i13 = i11;
        }
        int i16 = i12 & 2;
        if (i16 == 0) {
            if ((i11 & 48) == 0) {
                rVar2 = rVar;
                i13 |= sVar.f(rVar2) ? 32 : 16;
            }
            if ((i11 & 384) == 0) {
                if (sVar.h(dVar)) {
                    i15 = 256;
                } else {
                    i15 = 128;
                }
                i13 |= i15;
            }
            i14 = i13;
            if ((i14 & 147) != 146) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (sVar.T(i14 & 1, z11)) {
                if (i16 != 0) {
                    rVar2 = new r(7);
                }
                view = (View) sVar.j(AndroidCompositionLocals_androidKt.f1204f);
                cVar = (v3.c) sVar.j(g1.f58547h);
                mVar = (m) sVar.j(g1.f58552n);
                qVarG = t.G(sVar);
                b1VarH = t.H(dVar, sVar);
                Object[] objArr = new Object[0];
                objQ = sVar.Q();
                gVar = l1.m.f39353a;
                if (objQ == gVar) {
                    objQ = z3.d.f58749b;
                    sVar.o0(objQ);
                }
                uuid = (UUID) j.c(objArr, (fz.a) objQ, sVar, 48);
                zF = sVar.f(view) | sVar.f(cVar);
                objQ2 = sVar.Q();
                if (zF || objQ2 == gVar) {
                    d dVar3 = new d(aVar2, rVar2, view, mVar, cVar, uuid);
                    t1.d dVar4 = new t1.d(new h1.q(3, b1VarH), true, 346960332);
                    DialogLayout dialogLayout = dVar3.f1247t;
                    dialogLayout.setParentCompositionContext(qVarG);
                    dialogLayout.L.setValue(dVar4);
                    dialogLayout.P = true;
                    dialogLayout.c();
                    sVar.o0(dVar3);
                    objQ2 = dVar3;
                }
                dVar2 = (d) objQ2;
                zH = sVar.h(dVar2);
                objQ3 = sVar.Q();
                if (zH || objQ3 == gVar) {
                    objQ3 = new z3.b(dVar2, 0);
                    sVar.o0(objQ3);
                }
                t.c(dVar2, (fz.c) objQ3, sVar);
                boolean zH2 = sVar.h(dVar2);
                if ((i14 & 14) == 4) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                zD = zH2 | z12 | ((i14 & 112) == 32) | sVar.d(mVar.ordinal());
                objQ4 = sVar.Q();
                if (zD || objQ4 == gVar) {
                    r rVar4 = rVar2;
                    p pVar = new p(dVar2, aVar, rVar4, mVar, 6);
                    rVar2 = rVar4;
                    sVar.o0(pVar);
                    objQ4 = pVar;
                }
                t.j((fz.a) objQ4, sVar);
            } else {
                sVar.W();
            }
            rVar3 = rVar2;
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new c6.n(aVar, rVar3, dVar, i11, i12, 2);
            }
        }
        i13 |= 48;
        rVar2 = rVar;
        if ((i11 & 384) == 0) {
            if (sVar.h(dVar)) {
                i15 = 256;
            } else {
                i15 = 128;
            }
            i13 |= i15;
        }
        i14 = i13;
        if ((i14 & 147) != 146) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (sVar.T(i14 & 1, z11)) {
            if (i16 != 0) {
                rVar2 = new r(7);
            }
            view = (View) sVar.j(AndroidCompositionLocals_androidKt.f1204f);
            cVar = (v3.c) sVar.j(g1.f58547h);
            mVar = (m) sVar.j(g1.f58552n);
            qVarG = t.G(sVar);
            b1VarH = t.H(dVar, sVar);
            Object[] objArr2 = new Object[0];
            objQ = sVar.Q();
            gVar = l1.m.f39353a;
            if (objQ == gVar) {
                objQ = z3.d.f58749b;
                sVar.o0(objQ);
            }
            uuid = (UUID) j.c(objArr2, (fz.a) objQ, sVar, 48);
            zF = sVar.f(view) | sVar.f(cVar);
            objQ2 = sVar.Q();
            if (zF) {
                d dVar5 = new d(aVar2, rVar2, view, mVar, cVar, uuid);
                t1.d dVar6 = new t1.d(new h1.q(3, b1VarH), true, 346960332);
                DialogLayout dialogLayout2 = dVar5.f1247t;
                dialogLayout2.setParentCompositionContext(qVarG);
                dialogLayout2.L.setValue(dVar6);
                dialogLayout2.P = true;
                dialogLayout2.c();
                sVar.o0(dVar5);
                objQ2 = dVar5;
            } else {
                d dVar7 = new d(aVar2, rVar2, view, mVar, cVar, uuid);
                t1.d dVar8 = new t1.d(new h1.q(3, b1VarH), true, 346960332);
                DialogLayout dialogLayout3 = dVar7.f1247t;
                dialogLayout3.setParentCompositionContext(qVarG);
                dialogLayout3.L.setValue(dVar8);
                dialogLayout3.P = true;
                dialogLayout3.c();
                sVar.o0(dVar7);
                objQ2 = dVar7;
            }
            dVar2 = (d) objQ2;
            zH = sVar.h(dVar2);
            objQ3 = sVar.Q();
            if (zH) {
                objQ3 = new z3.b(dVar2, 0);
                sVar.o0(objQ3);
            } else {
                objQ3 = new z3.b(dVar2, 0);
                sVar.o0(objQ3);
            }
            t.c(dVar2, (fz.c) objQ3, sVar);
            boolean zH3 = sVar.h(dVar2);
            if ((i14 & 14) == 4) {
                z12 = true;
            } else {
                z12 = false;
            }
            zD = zH3 | z12 | ((i14 & 112) == 32) | sVar.d(mVar.ordinal());
            objQ4 = sVar.Q();
            if (zD) {
                r rVar5 = rVar2;
                p pVar2 = new p(dVar2, aVar, rVar5, mVar, 6);
                rVar2 = rVar5;
                sVar.o0(pVar2);
                objQ4 = pVar2;
            } else {
                r rVar6 = rVar2;
                p pVar3 = new p(dVar2, aVar, rVar6, mVar, 6);
                rVar2 = rVar6;
                sVar.o0(pVar3);
                objQ4 = pVar3;
            }
            t.j((fz.a) objQ4, sVar);
        } else {
            sVar.W();
        }
        rVar3 = rVar2;
        x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new c6.n(aVar, rVar3, dVar, i11, i12, 2);
        }
    }

    public static final void b(z1.r rVar, e eVar, n nVar, int i11) {
        int i12;
        s sVar = (s) nVar;
        sVar.f0(1090521195);
        if ((i11 & 6) == 0) {
            i12 = (sVar.f(rVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(eVar) ? 32 : 16;
        }
        if (sVar.T(i12 & 1, (i12 & 19) != 18)) {
            Object objQ = sVar.Q();
            if (objQ == l1.m.f39353a) {
                objQ = z3.e.f58754b;
                sVar.o0(objQ);
            }
            q0 q0Var = (q0) objQ;
            int iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, rVar);
            k.J.getClass();
            i iVar = y2.j.f56913b;
            int i13 = (((((i12 << 3) & 112) | (((i12 >> 3) & 14) | 384)) << 6) & 896) | 6;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            t.J(y2.j.f56917f, q0Var, sVar);
            t.J(y2.j.f56916e, q1VarL, sVar);
            t.y(sVar, Integer.valueOf(iHashCode), y2.j.f56918g);
            t.F(sVar, y2.j.f56919h);
            t.J(y2.j.f56915d, rVarC, sVar);
            ep.a.w((i13 >> 6) & 14, eVar, sVar, true);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new u2(rVar, i11, 5, eVar);
        }
    }
}
