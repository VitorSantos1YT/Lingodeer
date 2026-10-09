package z3;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.window.PopupLayout;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import java.util.UUID;
import l1.b1;
import l1.d0;
import l1.q1;
import l1.x1;
import s0.r1;
import w2.q0;
import z2.g1;
import z2.l0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d0 f58774a = new d0(d.f58751d);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d0 f58775b = new d0(d.f58750c);

    /* JADX WARN: Code duplicated, block: B:101:0x022d  */
    /* JADX WARN: Code duplicated, block: B:102:0x0231  */
    /* JADX WARN: Code duplicated, block: B:104:0x0258  */
    /* JADX WARN: Code duplicated, block: B:107:0x0262  */
    /* JADX WARN: Code duplicated, block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x003f  */
    /* JADX WARN: Code duplicated, block: B:25:0x0047  */
    /* JADX WARN: Code duplicated, block: B:26:0x004a  */
    /* JADX WARN: Code duplicated, block: B:28:0x004e  */
    /* JADX WARN: Code duplicated, block: B:31:0x0054  */
    /* JADX WARN: Code duplicated, block: B:33:0x005a  */
    /* JADX WARN: Code duplicated, block: B:34:0x005d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0068  */
    /* JADX WARN: Code duplicated, block: B:39:0x006a  */
    /* JADX WARN: Code duplicated, block: B:42:0x0073 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x0075  */
    /* JADX WARN: Code duplicated, block: B:44:0x0078  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:51:0x0101  */
    /* JADX WARN: Code duplicated, block: B:54:0x0112  */
    /* JADX WARN: Code duplicated, block: B:55:0x0114  */
    /* JADX WARN: Code duplicated, block: B:58:0x011d  */
    /* JADX WARN: Code duplicated, block: B:59:0x011f  */
    /* JADX WARN: Code duplicated, block: B:63:0x0138  */
    /* JADX WARN: Code duplicated, block: B:68:0x0158  */
    /* JADX WARN: Code duplicated, block: B:69:0x015a  */
    /* JADX WARN: Code duplicated, block: B:72:0x0161  */
    /* JADX WARN: Code duplicated, block: B:73:0x0163  */
    /* JADX WARN: Code duplicated, block: B:79:0x0180  */
    /* JADX WARN: Code duplicated, block: B:82:0x019f  */
    /* JADX WARN: Code duplicated, block: B:86:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:90:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:94:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:98:0x0206  */
    public static final void a(y yVar, fz.a aVar, z zVar, t1.d dVar, l1.n nVar, int i11, int i12) {
        int i13;
        fz.a aVar2;
        z zVar2;
        int i14;
        boolean z11;
        fz.a aVar3;
        x1 x1VarT;
        fz.a aVar4;
        View view;
        v3.c cVar;
        String str;
        v3.m mVar;
        l1.q qVarG;
        b1 b1VarH;
        Object objQ;
        l1.g gVar;
        UUID uuid;
        boolean zBooleanValue;
        Object objQ2;
        String str2;
        vy.d dVar2;
        boolean z12;
        PopupLayout popupLayout;
        int i15;
        boolean z13;
        int i16;
        boolean z14;
        boolean zF;
        Object objQ3;
        boolean z15;
        boolean z16;
        boolean zF2;
        Object objQ4;
        boolean z17;
        Object objQ5;
        boolean zH;
        Object objQ6;
        boolean zH2;
        Object objQ7;
        boolean zH3;
        Object objQ8;
        y2.i iVar;
        int i17;
        int i18;
        y yVar2 = yVar;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-1772091631);
        if ((i11 & 6) == 0) {
            i13 = (sVar.f(yVar2) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i19 = i12 & 2;
        if (i19 == 0) {
            if ((i11 & 48) == 0) {
                aVar2 = aVar;
                i13 |= sVar.h(aVar2) ? 32 : 16;
            }
            if ((i11 & 384) == 0) {
                zVar2 = zVar;
                if (sVar.f(zVar2)) {
                    i18 = 256;
                } else {
                    i18 = 128;
                }
                i13 |= i18;
            } else {
                zVar2 = zVar;
            }
            if ((i11 & 3072) == 0) {
                if (sVar.h(dVar)) {
                    i17 = 2048;
                } else {
                    i17 = 1024;
                }
                i13 |= i17;
            }
            i14 = i13;
            if ((i14 & 1171) != 1170) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (sVar.T(i14 & 1, z11)) {
                if (i19 != 0) {
                    aVar4 = null;
                } else {
                    aVar4 = aVar2;
                }
                view = (View) sVar.j(AndroidCompositionLocals_androidKt.f1204f);
                cVar = (v3.c) sVar.j(g1.f58547h);
                str = (String) sVar.j(f58774a);
                mVar = (v3.m) sVar.j(g1.f58552n);
                qVarG = l1.t.G(sVar);
                b1VarH = l1.t.H(dVar, sVar);
                Object[] objArr = new Object[0];
                objQ = sVar.Q();
                gVar = l1.m.f39353a;
                if (objQ == gVar) {
                    objQ = d.f58752e;
                    sVar.o0(objQ);
                }
                uuid = (UUID) w1.j.c(objArr, (fz.a) objQ, sVar, 48);
                zBooleanValue = ((Boolean) sVar.j(f58775b)).booleanValue();
                objQ2 = sVar.Q();
                if (objQ2 == gVar) {
                    str2 = str;
                    dVar2 = null;
                    z12 = false;
                    PopupLayout popupLayout2 = new PopupLayout(aVar4, zVar2, str2, view, cVar, yVar2, uuid, zBooleanValue);
                    yVar2 = yVar2;
                    popupLayout2.k(qVarG, new t1.d(new j(popupLayout2, b1VarH, 1), true, -297523940));
                    sVar.o0(popupLayout2);
                    objQ2 = popupLayout2;
                } else {
                    str2 = str;
                    dVar2 = null;
                    z12 = false;
                }
                popupLayout = (PopupLayout) objQ2;
                boolean zH4 = sVar.h(popupLayout);
                i15 = i14 & 112;
                if (i15 == 32) {
                    z13 = true;
                } else {
                    z13 = z12;
                }
                boolean z18 = zH4 | z13;
                i16 = i14 & 896;
                if (i16 == 256) {
                    z14 = true;
                } else {
                    z14 = z12;
                }
                zF = z18 | z14 | sVar.f(str2) | sVar.d(mVar.ordinal());
                objQ3 = sVar.Q();
                if (zF || objQ3 == gVar) {
                    g.b bVar = new g.b(popupLayout, aVar4, zVar, str2, mVar);
                    sVar.o0(bVar);
                    objQ3 = bVar;
                }
                l1.t.c(popupLayout, (fz.c) objQ3, sVar);
                boolean zH5 = sVar.h(popupLayout);
                if (i15 == 32) {
                    z15 = true;
                } else {
                    z15 = z12;
                }
                boolean z19 = z15 | zH5;
                if (i16 == 256) {
                    z16 = true;
                } else {
                    z16 = z12;
                }
                zF2 = z19 | z16 | sVar.f(str2) | sVar.d(mVar.ordinal());
                objQ4 = sVar.Q();
                if (zF2 || objQ4 == gVar) {
                    g gVar2 = new g(popupLayout, aVar4, zVar, str2, mVar);
                    sVar.o0(gVar2);
                    objQ4 = gVar2;
                }
                l1.t.j((fz.a) objQ4, sVar);
                boolean zH6 = sVar.h(popupLayout);
                if ((i14 & 14) == 4) {
                    z12 = true;
                }
                z17 = zH6 | z12;
                objQ5 = sVar.Q();
                if (z17 || objQ5 == gVar) {
                    objQ5 = new l0(3, popupLayout, yVar2);
                    sVar.o0(objQ5);
                }
                l1.t.c(yVar2, (fz.c) objQ5, sVar);
                zH = sVar.h(popupLayout);
                objQ6 = sVar.Q();
                if (zH || objQ6 == gVar) {
                    objQ6 = new xg.b(popupLayout, dVar2, 11);
                    sVar.o0(objQ6);
                }
                l1.t.f((fz.e) objQ6, popupLayout, sVar);
                zH2 = sVar.h(popupLayout);
                objQ7 = sVar.Q();
                if (zH2 || objQ7 == gVar) {
                    objQ7 = new i(popupLayout, 0);
                    sVar.o0(objQ7);
                }
                z1.r rVarM = w2.a0.m(z1.o.f58481a, (fz.c) objQ7);
                zH3 = sVar.h(popupLayout) | sVar.d(mVar.ordinal());
                objQ8 = sVar.Q();
                if (zH3 || objQ8 == gVar) {
                    objQ8 = new r1(1, popupLayout, mVar);
                    sVar.o0(objQ8);
                }
                q0 q0Var = (q0) objQ8;
                int iHashCode = Long.hashCode(sVar.T);
                q1 q1VarL = sVar.l();
                z1.r rVarC = z1.a.c(sVar, rVarM);
                y2.k.J.getClass();
                iVar = y2.j.f56913b;
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar);
                } else {
                    sVar.r0();
                }
                l1.t.J(y2.j.f56917f, q0Var, sVar);
                l1.t.J(y2.j.f56916e, q1VarL, sVar);
                l1.t.y(sVar, Integer.valueOf(iHashCode), y2.j.f56918g);
                l1.t.F(sVar, y2.j.f56919h);
                l1.t.J(y2.j.f56915d, rVarC, sVar);
                sVar.p(true);
                aVar3 = aVar4;
            } else {
                sVar.W();
                aVar3 = aVar2;
            }
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new h1.j(yVar2, aVar3, zVar, dVar, i11, i12);
            }
        }
        i13 |= 48;
        aVar2 = aVar;
        if ((i11 & 384) == 0) {
            zVar2 = zVar;
            if (sVar.f(zVar2)) {
                i18 = 256;
            } else {
                i18 = 128;
            }
            i13 |= i18;
        } else {
            zVar2 = zVar;
        }
        if ((i11 & 3072) == 0) {
            if (sVar.h(dVar)) {
                i17 = 2048;
            } else {
                i17 = 1024;
            }
            i13 |= i17;
        }
        i14 = i13;
        if ((i14 & 1171) != 1170) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (sVar.T(i14 & 1, z11)) {
            if (i19 != 0) {
                aVar4 = null;
            } else {
                aVar4 = aVar2;
            }
            view = (View) sVar.j(AndroidCompositionLocals_androidKt.f1204f);
            cVar = (v3.c) sVar.j(g1.f58547h);
            str = (String) sVar.j(f58774a);
            mVar = (v3.m) sVar.j(g1.f58552n);
            qVarG = l1.t.G(sVar);
            b1VarH = l1.t.H(dVar, sVar);
            Object[] objArr2 = new Object[0];
            objQ = sVar.Q();
            gVar = l1.m.f39353a;
            if (objQ == gVar) {
                objQ = d.f58752e;
                sVar.o0(objQ);
            }
            uuid = (UUID) w1.j.c(objArr2, (fz.a) objQ, sVar, 48);
            zBooleanValue = ((Boolean) sVar.j(f58775b)).booleanValue();
            objQ2 = sVar.Q();
            if (objQ2 == gVar) {
                str2 = str;
                dVar2 = null;
                z12 = false;
                PopupLayout popupLayout3 = new PopupLayout(aVar4, zVar2, str2, view, cVar, yVar2, uuid, zBooleanValue);
                yVar2 = yVar2;
                popupLayout3.k(qVarG, new t1.d(new j(popupLayout3, b1VarH, 1), true, -297523940));
                sVar.o0(popupLayout3);
                objQ2 = popupLayout3;
            } else {
                str2 = str;
                dVar2 = null;
                z12 = false;
            }
            popupLayout = (PopupLayout) objQ2;
            boolean zH7 = sVar.h(popupLayout);
            i15 = i14 & 112;
            if (i15 == 32) {
                z13 = true;
            } else {
                z13 = z12;
            }
            boolean z110 = zH7 | z13;
            i16 = i14 & 896;
            if (i16 == 256) {
                z14 = true;
            } else {
                z14 = z12;
            }
            zF = z110 | z14 | sVar.f(str2) | sVar.d(mVar.ordinal());
            objQ3 = sVar.Q();
            if (zF) {
                g.b bVar2 = new g.b(popupLayout, aVar4, zVar, str2, mVar);
                sVar.o0(bVar2);
                objQ3 = bVar2;
            } else {
                g.b bVar3 = new g.b(popupLayout, aVar4, zVar, str2, mVar);
                sVar.o0(bVar3);
                objQ3 = bVar3;
            }
            l1.t.c(popupLayout, (fz.c) objQ3, sVar);
            boolean zH8 = sVar.h(popupLayout);
            if (i15 == 32) {
                z15 = true;
            } else {
                z15 = z12;
            }
            boolean z111 = z15 | zH8;
            if (i16 == 256) {
                z16 = true;
            } else {
                z16 = z12;
            }
            zF2 = z111 | z16 | sVar.f(str2) | sVar.d(mVar.ordinal());
            objQ4 = sVar.Q();
            if (zF2) {
                g gVar3 = new g(popupLayout, aVar4, zVar, str2, mVar);
                sVar.o0(gVar3);
                objQ4 = gVar3;
            } else {
                g gVar4 = new g(popupLayout, aVar4, zVar, str2, mVar);
                sVar.o0(gVar4);
                objQ4 = gVar4;
            }
            l1.t.j((fz.a) objQ4, sVar);
            boolean zH9 = sVar.h(popupLayout);
            if ((i14 & 14) == 4) {
                z12 = true;
            }
            z17 = zH9 | z12;
            objQ5 = sVar.Q();
            if (z17) {
                objQ5 = new l0(3, popupLayout, yVar2);
                sVar.o0(objQ5);
            } else {
                objQ5 = new l0(3, popupLayout, yVar2);
                sVar.o0(objQ5);
            }
            l1.t.c(yVar2, (fz.c) objQ5, sVar);
            zH = sVar.h(popupLayout);
            objQ6 = sVar.Q();
            if (zH) {
                objQ6 = new xg.b(popupLayout, dVar2, 11);
                sVar.o0(objQ6);
            } else {
                objQ6 = new xg.b(popupLayout, dVar2, 11);
                sVar.o0(objQ6);
            }
            l1.t.f((fz.e) objQ6, popupLayout, sVar);
            zH2 = sVar.h(popupLayout);
            objQ7 = sVar.Q();
            if (zH2) {
                objQ7 = new i(popupLayout, 0);
                sVar.o0(objQ7);
            } else {
                objQ7 = new i(popupLayout, 0);
                sVar.o0(objQ7);
            }
            z1.r rVarM2 = w2.a0.m(z1.o.f58481a, (fz.c) objQ7);
            zH3 = sVar.h(popupLayout) | sVar.d(mVar.ordinal());
            objQ8 = sVar.Q();
            if (zH3) {
                objQ8 = new r1(1, popupLayout, mVar);
                sVar.o0(objQ8);
            } else {
                objQ8 = new r1(1, popupLayout, mVar);
                sVar.o0(objQ8);
            }
            q0 q0Var2 = (q0) objQ8;
            int iHashCode2 = Long.hashCode(sVar.T);
            q1 q1VarL2 = sVar.l();
            z1.r rVarC2 = z1.a.c(sVar, rVarM2);
            y2.k.J.getClass();
            iVar = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(y2.j.f56917f, q0Var2, sVar);
            l1.t.J(y2.j.f56916e, q1VarL2, sVar);
            l1.t.y(sVar, Integer.valueOf(iHashCode2), y2.j.f56918g);
            l1.t.F(sVar, y2.j.f56919h);
            l1.t.J(y2.j.f56915d, rVarC2, sVar);
            sVar.p(true);
            aVar3 = aVar4;
        } else {
            sVar.W();
            aVar3 = aVar2;
        }
        x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new h1.j(yVar2, aVar3, zVar, dVar, i11, i12);
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0054  */
    /* JADX WARN: Code duplicated, block: B:31:0x005a  */
    /* JADX WARN: Code duplicated, block: B:32:0x005d  */
    /* JADX WARN: Code duplicated, block: B:36:0x0068  */
    /* JADX WARN: Code duplicated, block: B:37:0x006a  */
    /* JADX WARN: Code duplicated, block: B:40:0x0073  */
    /* JADX WARN: Code duplicated, block: B:42:0x0077  */
    /* JADX WARN: Code duplicated, block: B:43:0x0082  */
    /* JADX WARN: Code duplicated, block: B:46:0x0089  */
    /* JADX WARN: Code duplicated, block: B:47:0x008b  */
    /* JADX WARN: Code duplicated, block: B:51:0x0091  */
    /* JADX WARN: Code duplicated, block: B:56:0x009e  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:61:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:63:? A[RETURN, SYNTHETIC] */
    public static final void b(z1.e eVar, long j11, fz.a aVar, z zVar, t1.d dVar, l1.n nVar, int i11, int i12) {
        z zVar2;
        boolean z11;
        z1.e eVar2;
        x1 x1VarT;
        boolean z12;
        z zVar3;
        boolean z13;
        boolean z14;
        Object objQ;
        int i13;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(71005054);
        int i14 = i11 | 6;
        if ((i11 & 48) == 0) {
            i14 |= sVar.e(j11) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i14 |= sVar.h(aVar) ? 256 : 128;
        }
        int i15 = i12 & 8;
        if (i15 == 0) {
            if ((i11 & 3072) == 0) {
                zVar2 = zVar;
                i14 |= sVar.f(zVar2) ? 2048 : 1024;
            }
            if ((i11 & 24576) == 0) {
                if (sVar.h(dVar)) {
                    i13 = 16384;
                } else {
                    i13 = OSSConstants.DEFAULT_BUFFER_SIZE;
                }
                i14 |= i13;
            }
            if ((i14 & 9363) != 9362) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (sVar.T(i14 & 1, z11)) {
                z1.j jVar = z1.c.f58463a;
                if (i15 != 0) {
                    zVar3 = new z(false, 15);
                    z12 = false;
                } else {
                    z12 = false;
                    zVar3 = zVar2;
                }
                if ((i14 & 14) == 4) {
                    z13 = true;
                } else {
                    z13 = z12;
                }
                z14 = z13 | ((i14 & 112) != 32 ? z12 : true);
                objQ = sVar.Q();
                if (z14 || objQ == l1.m.f39353a) {
                    objQ = new a(j11);
                    sVar.o0(objQ);
                }
                a((a) objQ, aVar, zVar3, dVar, sVar, (i14 >> 3) & 8176, 0);
                eVar2 = jVar;
                zVar2 = zVar3;
            } else {
                sVar.W();
                eVar2 = eVar;
            }
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new f(eVar2, j11, aVar, zVar2, dVar, i11, i12);
            }
        }
        i14 |= 3072;
        zVar2 = zVar;
        if ((i11 & 24576) == 0) {
            if (sVar.h(dVar)) {
                i13 = 16384;
            } else {
                i13 = OSSConstants.DEFAULT_BUFFER_SIZE;
            }
            i14 |= i13;
        }
        if ((i14 & 9363) != 9362) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (sVar.T(i14 & 1, z11)) {
            z1.j jVar2 = z1.c.f58463a;
            if (i15 != 0) {
                zVar3 = new z(false, 15);
                z12 = false;
            } else {
                z12 = false;
                zVar3 = zVar2;
            }
            if ((i14 & 14) == 4) {
                z13 = true;
            } else {
                z13 = z12;
            }
            z14 = z13 | ((i14 & 112) != 32 ? z12 : true);
            objQ = sVar.Q();
            if (z14) {
                objQ = new a(j11);
                sVar.o0(objQ);
            } else {
                objQ = new a(j11);
                sVar.o0(objQ);
            }
            a((a) objQ, aVar, zVar3, dVar, sVar, (i14 >> 3) & 8176, 0);
            eVar2 = jVar2;
            zVar2 = zVar3;
        } else {
            sVar.W();
            eVar2 = eVar;
        }
        x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new f(eVar2, j11, aVar, zVar2, dVar, i11, i12);
        }
    }

    public static final boolean c(View view) {
        ViewGroup.LayoutParams layoutParams = view.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        return (layoutParams2 == null || (layoutParams2.flags & OSSConstants.DEFAULT_BUFFER_SIZE) == 0) ? false : true;
    }
}
