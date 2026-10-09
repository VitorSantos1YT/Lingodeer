package vr;

import android.content.Context;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.fragment.app.e1;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import b0.k0;
import bp.r0;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.yalantis.ucrop.view.CropImageView;
import dt.y3;
import e2.l;
import fr.p3;
import g2.f0;
import h1.dc;
import h1.fc;
import h1.ha;
import h1.j6;
import h1.k7;
import h1.s1;
import h1.t6;
import h1.ua;
import h1.v1;
import hh.p0;
import iv.y;
import j0.a2;
import j0.e2;
import j0.i1;
import j0.o2;
import j0.z1;
import j3.y0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.z;
import l1.b1;
import l1.b3;
import l1.c3;
import l1.n;
import l1.q1;
import l1.s;
import l1.t;
import l1.x1;
import mt.c4;
import mt.k6;
import mt.l0;
import nv.p;
import nv.x;
import oz.q;
import qp.n2;
import qy.b0;
import rz.w;
import s2.g0;
import w2.q0;
import y2.k;
import z1.j;
import z1.o;
import z1.r;
import z2.g1;
import zr.u;
import zr.v;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class b {
    public static final void a(fz.a onBackClick, fz.c onOpenGroup, zr.b bVar, n nVar, int i11) {
        zr.b bVar2;
        zr.b bVar3;
        int i12;
        zr.b bVar4;
        m.f(onBackClick, "onBackClick");
        m.f(onOpenGroup, "onOpenGroup");
        s sVar = (s) nVar;
        sVar.f0(1879473994);
        int i13 = i11 | (sVar.h(onBackClick) ? 4 : 2) | (sVar.h(onOpenGroup) ? 32 : 16) | 128;
        if (sVar.T(i13 & 1, (i13 & 147) != 146)) {
            sVar.Y();
            if ((i11 & 1) == 0 || sVar.C()) {
                sVar.d0(-1614864554);
                ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(sVar, LocalViewModelStoreOwner.$stable);
                if (current == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                ViewModel viewModelA = i20.b.a(z.a(zr.b.class), current.getViewModelStore(), null, i20.a.a(current), null, q10.b.a(sVar), null);
                sVar.p(false);
                bVar3 = (zr.b) viewModelA;
                i12 = i13 & (-897);
            } else {
                sVar.W();
                i12 = i13 & (-897);
                bVar3 = bVar;
            }
            sVar.q();
            b3 b3VarCollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(bVar3.f59291d, (LifecycleOwner) null, (Lifecycle.State) null, (vy.i) null, sVar, 0, 7);
            sVar = sVar;
            Context context = (Context) sVar.j(AndroidCompositionLocals_androidKt.f1200b);
            v vVar = (v) b3VarCollectAsStateWithLifecycle.getValue();
            boolean zH = sVar.h(bVar3);
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (zH || objQ == gVar) {
                bVar4 = bVar3;
                objQ = new c4(1, bVar4, zr.b.class, "updateQuery", "updateQuery(Ljava/lang/String;)V", 0, 18);
                sVar.o0(objQ);
            } else {
                bVar4 = bVar3;
            }
            fz.c cVar = (fz.c) ((mz.e) objQ);
            boolean zH2 = sVar.h(bVar4) | sVar.h(context);
            Object objQ2 = sVar.Q();
            if (zH2 || objQ2 == gVar) {
                objQ2 = new n2(22, bVar4, context);
                sVar.o0(objQ2);
            }
            b(vVar, onBackClick, cVar, onOpenGroup, (fz.c) objQ2, null, false, sVar, ((i12 << 3) & 112) | ((i12 << 6) & 7168));
            bVar2 = bVar4;
        } else {
            sVar.W();
            bVar2 = bVar;
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new k6(i11, 20, onBackClick, onOpenGroup, bVar2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0247  */
    /* JADX WARN: Code duplicated, block: B:103:0x025f  */
    /* JADX WARN: Code duplicated, block: B:104:0x0261  */
    /* JADX WARN: Code duplicated, block: B:108:0x026a  */
    /* JADX WARN: Code duplicated, block: B:114:0x029a  */
    /* JADX WARN: Code duplicated, block: B:117:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:118:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:120:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:123:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:124:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:129:0x0319  */
    /* JADX WARN: Code duplicated, block: B:132:0x033a  */
    /* JADX WARN: Code duplicated, block: B:133:0x033c  */
    /* JADX WARN: Code duplicated, block: B:139:0x034b  */
    /* JADX WARN: Code duplicated, block: B:145:0x0373  */
    /* JADX WARN: Code duplicated, block: B:148:0x03b1  */
    /* JADX WARN: Code duplicated, block: B:149:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:152:0x0401  */
    /* JADX WARN: Code duplicated, block: B:154:0x0464  */
    /* JADX WARN: Code duplicated, block: B:155:0x0468  */
    /* JADX WARN: Code duplicated, block: B:160:0x0483  */
    /* JADX WARN: Code duplicated, block: B:165:0x04a9  */
    /* JADX WARN: Code duplicated, block: B:171:0x04b8  */
    /* JADX WARN: Code duplicated, block: B:175:0x04d0  */
    /* JADX WARN: Code duplicated, block: B:176:0x04d3  */
    /* JADX WARN: Code duplicated, block: B:179:0x04db  */
    /* JADX WARN: Code duplicated, block: B:183:0x04e3  */
    /* JADX WARN: Code duplicated, block: B:186:0x050f  */
    /* JADX WARN: Code duplicated, block: B:189:0x0524  */
    /* JADX WARN: Code duplicated, block: B:83:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:84:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:86:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:88:0x0203  */
    /* JADX WARN: Code duplicated, block: B:89:0x0207  */
    /* JADX WARN: Code duplicated, block: B:94:0x0222  */
    /* JADX WARN: Code duplicated, block: B:97:0x0236  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [l1.s] */
    /* JADX WARN: Type inference failed for: r11v1, types: [l1.s] */
    /* JADX WARN: Type inference failed for: r11v10, types: [l1.s] */
    /* JADX WARN: Type inference failed for: r11v11, types: [l1.s] */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v7, types: [l1.n, l1.s] */
    /* JADX WARN: Type inference failed for: r11v8, types: [l1.s] */
    /* JADX WARN: Type inference failed for: r13v0, types: [ry.r] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v31, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v1, types: [l1.n, l1.s] */
    public static final void b(v uiState, fz.a onBackClick, fz.c onQueryChange, fz.c onOpenGroup, fz.c onOcrFromCamera, r rVar, boolean z11, n nVar, int i11) {
        r rVar2;
        boolean z12;
        ?? r11;
        ?? arrayList;
        j jVar;
        y2.h hVar;
        int iHashCode;
        Context context;
        Object objQ;
        b1 b1Var;
        Object objQ2;
        b1 b1Var2;
        boolean z13;
        Object objQ3;
        g.j jVarB;
        boolean zH;
        Object objQ4;
        g.j jVarB2;
        boolean z14;
        float f5;
        int iHashCode2;
        float f11;
        boolean z15;
        Object objQ5;
        boolean zH2;
        Object objQ6;
        Object objQ7;
        o oVar;
        j jVar2;
        ?? r12;
        boolean z16;
        boolean z17;
        ?? r13;
        int iHashCode3;
        v vVar;
        boolean z18;
        boolean z19;
        Object objQ8;
        ?? r14;
        String groupList;
        m.f(uiState, "uiState");
        m.f(onBackClick, "onBackClick");
        m.f(onQueryChange, "onQueryChange");
        m.f(onOpenGroup, "onOpenGroup");
        m.f(onOcrFromCamera, "onOcrFromCamera");
        ?? r9 = (s) nVar;
        r9.f0(1837280283);
        int i12 = (i11 & 6) == 0 ? ((i11 & 8) == 0 ? r9.f(uiState) : r9.h(uiState) ? 4 : 2) | i11 : i11;
        if ((i11 & 384) == 0) {
            i12 |= r9.h(onQueryChange) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= r9.h(onOpenGroup) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= r9.h(onOcrFromCamera) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE;
        }
        int i13 = i12 | 196608;
        if (r9.T(i13 & 1, (74883 & i13) != 74882)) {
            l lVar = (l) r9.j(g1.f58548i);
            v3.c cVar = (v3.c) r9.j(g1.f58547h);
            WeakHashMap weakHashMap = o2.f35353v;
            v3.f fVar = new v3.f(cVar.Q(j0.b.e(r9).f35356c.e().f48796d) - ((v3.f) r9.j(ju.b.f37362a)).f53489a);
            v3.f fVar2 = new v3.f(0);
            if (fVar.compareTo(fVar2) < 0) {
                fVar = fVar2;
            }
            boolean z20 = uiState instanceof u;
            u uVar = z20 ? (u) uiState : null;
            if (uVar == null || (groupList = uVar.f59326b.getGroupList()) == null) {
                arrayList = ry.r.f50854a;
            } else {
                List listW0 = q.W0(groupList, new String[]{";"}, 0, 6);
                arrayList = new ArrayList();
                for (Object obj : listW0) {
                    if (!q.K0((String) obj)) {
                        arrayList.add(obj);
                    }
                }
            }
            ?? r15 = arrayList;
            boolean zF = r9.f(r15);
            Object objQ9 = r9.Q();
            Object obj2 = l1.m.f39353a;
            if (zF || objQ9 == obj2) {
                objQ9 = t.B(ry.t.f50856a);
                r9.o0(objQ9);
            }
            b1 b1Var3 = (b1) objQ9;
            boolean zIsEmpty = r15.isEmpty();
            o oVar2 = o.f58481a;
            r rVarD = e2.d(oVar2, 1.0f);
            boolean zH3 = r9.h(lVar);
            Object objQ10 = r9.Q();
            if (zH3 || objQ10 == obj2) {
                objQ10 = new a1.d(lVar, 10);
                r9.o0(objQ10);
            }
            r rVarA = g0.a(rVarD, b0.f48488a, (PointerInputEventHandler) objQ10);
            j jVar3 = z1.c.f58463a;
            q0 q0VarD = j0.o.d(jVar3, false);
            int iHashCode4 = Long.hashCode(r9.T);
            q1 q1VarL = r9.l();
            r rVarC = z1.a.c(r9, rVarA);
            k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            r9.h0();
            v3.f fVar3 = fVar;
            if (r9.S) {
                r9.k(iVar);
            } else {
                r9.r0();
            }
            y2.h hVar2 = y2.j.f56917f;
            t.J(hVar2, q0VarD, r9);
            y2.h hVar3 = y2.j.f56916e;
            t.J(hVar3, q1VarL, r9);
            y2.h hVar4 = y2.j.f56918g;
            if (r9.S) {
                jVar = jVar3;
            } else {
                jVar = jVar3;
                if (!m.a(r9.Q(), Integer.valueOf(iHashCode4))) {
                }
                hVar = y2.j.f56915d;
                t.J(hVar, rVarC, r9);
                if (uiState instanceof zr.t) {
                    r9.d0(867665829);
                    tv.a.d(6, 0, r9, e2.d(oVar2, 1.0f));
                    r9.p(false);
                    oVar = oVar2;
                    r14 = r9;
                    z16 = true;
                } else {
                    if (z20) {
                        throw p.x(r9, 867670385, false);
                    }
                    r9.d0(1128129689);
                    j0.d dVar = j0.i.f35305c;
                    z1.h hVar5 = z1.c.O;
                    j0.u uVarA = j0.t.a(dVar, hVar5, r9, 0);
                    iHashCode = Long.hashCode(r9.T);
                    q1 q1VarL2 = r9.l();
                    r rVarC2 = z1.a.c(r9, oVar2);
                    r9.h0();
                    if (r9.S) {
                        r9.k(iVar);
                    } else {
                        r9.r0();
                    }
                    t.J(hVar2, uVarA, r9);
                    t.J(hVar3, q1VarL2, r9);
                    if (r9.S || !m.a(r9.Q(), Integer.valueOf(iHashCode))) {
                        defpackage.e.A(iHashCode, r9, iHashCode, hVar4);
                    }
                    t.J(hVar, rVarC2, r9);
                    context = (Context) r9.j(AndroidCompositionLocals_androidKt.f1200b);
                    objQ = r9.Q();
                    if (objQ == obj2) {
                        objQ = t.B(null);
                        r9.o0(objQ);
                    }
                    b1Var = (b1) objQ;
                    objQ2 = r9.Q();
                    if (objQ2 == obj2) {
                        objQ2 = t.B(null);
                        r9.o0(objQ2);
                    }
                    b1Var2 = (b1) objQ2;
                    e1 e1Var = new e1(4);
                    if ((i13 & 57344) == 16384) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objQ3 = r9.Q();
                    if (z13 || objQ3 == obj2) {
                        objQ3 = new y3(b1Var2, onOcrFromCamera, 9);
                        r9.o0(objQ3);
                    }
                    jVarB = qx.p.B(e1Var, (fz.c) objQ3, r9);
                    e1 e1Var2 = new e1(6);
                    zH = r9.h(context) | r9.h(jVarB);
                    objQ4 = r9.Q();
                    if (zH || objQ4 == obj2) {
                        objQ4 = new b0.a(b1Var, context, jVarB, b1Var2, 29);
                        r9.o0(objQ4);
                    }
                    jVarB2 = qx.p.B(e1Var2, (fz.c) objQ4, r9);
                    if (1.0f > 0.0d) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (!z14) {
                        k0.a.a("invalid weight; must be greater than zero");
                    }
                    f5 = 16;
                    r rVarC3 = j0.c.C(e2.e(new i1(1.0f, true), 1.0f), f5, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                    j0.u uVarA2 = j0.t.a(dVar, hVar5, r9, 0);
                    iHashCode2 = Long.hashCode(r9.T);
                    q1 q1VarL3 = r9.l();
                    r rVarC4 = z1.a.c(r9, rVarC3);
                    r9.h0();
                    if (r9.S) {
                        r9.k(iVar);
                    } else {
                        r9.r0();
                    }
                    t.J(hVar2, uVarA2, r9);
                    t.J(hVar3, q1VarL3, r9);
                    if (r9.S || !m.a(r9.Q(), Integer.valueOf(iHashCode2))) {
                        defpackage.e.A(iHashCode2, r9, iHashCode2, hVar4);
                    }
                    t.J(hVar, rVarC4, r9);
                    f11 = 12;
                    j0.c.g(r9, e2.g(oVar2, f11));
                    u uVar2 = (u) uiState;
                    String str = uVar2.f59325a;
                    if ((i13 & 896) == 256) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    objQ5 = r9.Q();
                    if (z15 || objQ5 == obj2) {
                        objQ5 = new x(onQueryChange, 29);
                        r9.o0(objQ5);
                    }
                    fz.a aVar = (fz.a) objQ5;
                    zH2 = r9.h(context) | r9.h(jVarB2);
                    objQ6 = r9.Q();
                    if (zH2 || objQ6 == obj2) {
                        objQ6 = new l0(context, jVarB2, b1Var, 27);
                        r9.o0(objQ6);
                    }
                    e(str, onQueryChange, aVar, (fz.a) objQ6, r9, (i13 >> 3) & 112);
                    j0.c.g(r9, e2.g(oVar2, f11));
                    String groupList2 = uVar2.f59326b.getGroupList();
                    objQ7 = r9.Q();
                    if (objQ7 == obj2) {
                        objQ7 = new a(0);
                        r9.o0(objQ7);
                    }
                    oVar = oVar2;
                    jVar2 = jVar;
                    a0.o.b(groupList2, null, (fz.c) objQ7, null, "result", null, t1.e.d(524974334, new bt.t(b1Var3, 6), r9), r9, 1597824, 42);
                    r12 = r9;
                    r12.p(true);
                    if (zIsEmpty) {
                        z16 = true;
                        z17 = false;
                        r12.d0(1385917156);
                        r13 = r12;
                    } else {
                        r12.d0(1396114110);
                        z16 = true;
                        r rVarB = j0.c.B(j0.c.E(d0.n.g(e2.e(oVar, 1.0f), p3.A(ns.o.L(new g2.x(g2.x.f28621h), new g2.x(((s1) r12.j(v1.f31180a)).f31033p))), null, 6), CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, fVar3.f53489a, 7), f5, f11);
                        q0 q0VarD2 = j0.o.d(jVar2, false);
                        iHashCode3 = Long.hashCode(r12.T);
                        q1 q1VarL4 = r12.l();
                        r rVarC5 = z1.a.c(r12, rVarB);
                        r12.h0();
                        if (r12.S) {
                            r12.k(iVar);
                        } else {
                            r12.r0();
                        }
                        t.J(hVar2, q0VarD2, r12);
                        t.J(hVar3, q1VarL4, r12);
                        if (r12.S || !m.a(r12.Q(), Integer.valueOf(iHashCode3))) {
                            defpackage.e.A(iHashCode3, r12, iHashCode3, hVar4);
                        }
                        t.J(hVar, rVarC5, r12);
                        boolean z21 = !((Set) b1Var3.getValue()).isEmpty();
                        r rVarE = e2.e(oVar, 1.0f);
                        if ((i13 & 14) != 4) {
                            vVar = uiState;
                            boolean z22 = (i13 & 8) == 0 && r12.h(vVar);
                            boolean zH4 = r12.h(r15) | z22 | r12.f(b1Var3);
                            if ((i13 & 7168) == 2048) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            z19 = zH4 | z18;
                            objQ8 = r12.Q();
                            if (z19 || objQ8 == obj2) {
                                k0 k0Var = new k0(vVar, r15, onOpenGroup, b1Var3, 20);
                                r12.o0(k0Var);
                                objQ8 = k0Var;
                            }
                            iu.k.e((fz.a) objQ8, rVarE, z21, 0L, null, c.f54125a, r12, 196656, 24);
                            ?? r16 = r12;
                            r16.p(z16);
                            z17 = false;
                            r13 = r16;
                        } else {
                            vVar = uiState;
                        }
                        boolean zH5 = r12.h(r15) | z22 | r12.f(b1Var3);
                        if ((i13 & 7168) == 2048) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        z19 = zH5 | z18;
                        objQ8 = r12.Q();
                        if (z19) {
                            k0 k0Var2 = new k0(vVar, r15, onOpenGroup, b1Var3, 20);
                            r12.o0(k0Var2);
                            objQ8 = k0Var2;
                        } else {
                            k0 k0Var3 = new k0(vVar, r15, onOpenGroup, b1Var3, 20);
                            r12.o0(k0Var3);
                            objQ8 = k0Var3;
                        }
                        iu.k.e((fz.a) objQ8, rVarE, z21, 0L, null, c.f54125a, r12, 196656, 24);
                        ?? r17 = r12;
                        r17.p(z16);
                        z17 = false;
                        r13 = r17;
                    }
                    r13.p(z17);
                    r13.p(z16);
                    r13.p(z17);
                    r14 = r13;
                }
                r14.p(z16);
                z12 = z16;
                rVar2 = oVar;
                r11 = r14;
            }
            defpackage.e.A(iHashCode4, r9, iHashCode4, hVar4);
            hVar = y2.j.f56915d;
            t.J(hVar, rVarC, r9);
            if (uiState instanceof zr.t) {
                r9.d0(867665829);
                tv.a.d(6, 0, r9, e2.d(oVar2, 1.0f));
                r9.p(false);
                oVar = oVar2;
                r14 = r9;
                z16 = true;
            } else {
                if (z20) {
                    throw p.x(r9, 867670385, false);
                }
                r9.d0(1128129689);
                j0.d dVar2 = j0.i.f35305c;
                z1.h hVar6 = z1.c.O;
                j0.u uVarA3 = j0.t.a(dVar2, hVar6, r9, 0);
                iHashCode = Long.hashCode(r9.T);
                q1 q1VarL5 = r9.l();
                r rVarC6 = z1.a.c(r9, oVar2);
                r9.h0();
                if (r9.S) {
                    r9.k(iVar);
                } else {
                    r9.r0();
                }
                t.J(hVar2, uVarA3, r9);
                t.J(hVar3, q1VarL5, r9);
                if (r9.S) {
                    defpackage.e.A(iHashCode, r9, iHashCode, hVar4);
                } else {
                    defpackage.e.A(iHashCode, r9, iHashCode, hVar4);
                }
                t.J(hVar, rVarC6, r9);
                context = (Context) r9.j(AndroidCompositionLocals_androidKt.f1200b);
                objQ = r9.Q();
                if (objQ == obj2) {
                    objQ = t.B(null);
                    r9.o0(objQ);
                }
                b1Var = (b1) objQ;
                objQ2 = r9.Q();
                if (objQ2 == obj2) {
                    objQ2 = t.B(null);
                    r9.o0(objQ2);
                }
                b1Var2 = (b1) objQ2;
                e1 e1Var3 = new e1(4);
                if ((i13 & 57344) == 16384) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objQ3 = r9.Q();
                if (z13) {
                    objQ3 = new y3(b1Var2, onOcrFromCamera, 9);
                    r9.o0(objQ3);
                } else {
                    objQ3 = new y3(b1Var2, onOcrFromCamera, 9);
                    r9.o0(objQ3);
                }
                jVarB = qx.p.B(e1Var3, (fz.c) objQ3, r9);
                e1 e1Var4 = new e1(6);
                zH = r9.h(context) | r9.h(jVarB);
                objQ4 = r9.Q();
                if (zH) {
                    objQ4 = new b0.a(b1Var, context, jVarB, b1Var2, 29);
                    r9.o0(objQ4);
                } else {
                    objQ4 = new b0.a(b1Var, context, jVarB, b1Var2, 29);
                    r9.o0(objQ4);
                }
                jVarB2 = qx.p.B(e1Var4, (fz.c) objQ4, r9);
                if (1.0f > 0.0d) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (!z14) {
                    k0.a.a("invalid weight; must be greater than zero");
                }
                f5 = 16;
                r rVarC7 = j0.c.C(e2.e(new i1(1.0f, true), 1.0f), f5, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                j0.u uVarA4 = j0.t.a(dVar2, hVar6, r9, 0);
                iHashCode2 = Long.hashCode(r9.T);
                q1 q1VarL6 = r9.l();
                r rVarC8 = z1.a.c(r9, rVarC7);
                r9.h0();
                if (r9.S) {
                    r9.k(iVar);
                } else {
                    r9.r0();
                }
                t.J(hVar2, uVarA4, r9);
                t.J(hVar3, q1VarL6, r9);
                if (r9.S) {
                    defpackage.e.A(iHashCode2, r9, iHashCode2, hVar4);
                } else {
                    defpackage.e.A(iHashCode2, r9, iHashCode2, hVar4);
                }
                t.J(hVar, rVarC8, r9);
                f11 = 12;
                j0.c.g(r9, e2.g(oVar2, f11));
                u uVar3 = (u) uiState;
                String str2 = uVar3.f59325a;
                if ((i13 & 896) == 256) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                objQ5 = r9.Q();
                if (z15) {
                    objQ5 = new x(onQueryChange, 29);
                    r9.o0(objQ5);
                } else {
                    objQ5 = new x(onQueryChange, 29);
                    r9.o0(objQ5);
                }
                fz.a aVar2 = (fz.a) objQ5;
                zH2 = r9.h(context) | r9.h(jVarB2);
                objQ6 = r9.Q();
                if (zH2) {
                    objQ6 = new l0(context, jVarB2, b1Var, 27);
                    r9.o0(objQ6);
                } else {
                    objQ6 = new l0(context, jVarB2, b1Var, 27);
                    r9.o0(objQ6);
                }
                e(str2, onQueryChange, aVar2, (fz.a) objQ6, r9, (i13 >> 3) & 112);
                j0.c.g(r9, e2.g(oVar2, f11));
                String groupList3 = uVar3.f59326b.getGroupList();
                objQ7 = r9.Q();
                if (objQ7 == obj2) {
                    objQ7 = new a(0);
                    r9.o0(objQ7);
                }
                oVar = oVar2;
                jVar2 = jVar;
                a0.o.b(groupList3, null, (fz.c) objQ7, null, "result", null, t1.e.d(524974334, new bt.t(b1Var3, 6), r9), r9, 1597824, 42);
                r12 = r9;
                r12.p(true);
                if (zIsEmpty) {
                    r12.d0(1396114110);
                    z16 = true;
                    r rVarB2 = j0.c.B(j0.c.E(d0.n.g(e2.e(oVar, 1.0f), p3.A(ns.o.L(new g2.x(g2.x.f28621h), new g2.x(((s1) r12.j(v1.f31180a)).f31033p))), null, 6), CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, fVar3.f53489a, 7), f5, f11);
                    q0 q0VarD3 = j0.o.d(jVar2, false);
                    iHashCode3 = Long.hashCode(r12.T);
                    q1 q1VarL7 = r12.l();
                    r rVarC9 = z1.a.c(r12, rVarB2);
                    r12.h0();
                    if (r12.S) {
                        r12.k(iVar);
                    } else {
                        r12.r0();
                    }
                    t.J(hVar2, q0VarD3, r12);
                    t.J(hVar3, q1VarL7, r12);
                    if (r12.S) {
                        defpackage.e.A(iHashCode3, r12, iHashCode3, hVar4);
                    } else {
                        defpackage.e.A(iHashCode3, r12, iHashCode3, hVar4);
                    }
                    t.J(hVar, rVarC9, r12);
                    boolean z23 = !((Set) b1Var3.getValue()).isEmpty();
                    r rVarE2 = e2.e(oVar, 1.0f);
                    if ((i13 & 14) != 4) {
                        vVar = uiState;
                        if ((i13 & 8) == 0) {
                        }
                        boolean zH6 = r12.h(r15) | z22 | r12.f(b1Var3);
                        if ((i13 & 7168) == 2048) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        z19 = zH6 | z18;
                        objQ8 = r12.Q();
                        if (z19) {
                            k0 k0Var4 = new k0(vVar, r15, onOpenGroup, b1Var3, 20);
                            r12.o0(k0Var4);
                            objQ8 = k0Var4;
                        } else {
                            k0 k0Var5 = new k0(vVar, r15, onOpenGroup, b1Var3, 20);
                            r12.o0(k0Var5);
                            objQ8 = k0Var5;
                        }
                        iu.k.e((fz.a) objQ8, rVarE2, z23, 0L, null, c.f54125a, r12, 196656, 24);
                        ?? r18 = r12;
                        r18.p(z16);
                        z17 = false;
                        r13 = r18;
                    } else {
                        vVar = uiState;
                    }
                    boolean zH7 = r12.h(r15) | z22 | r12.f(b1Var3);
                    if ((i13 & 7168) == 2048) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    z19 = zH7 | z18;
                    objQ8 = r12.Q();
                    if (z19) {
                        k0 k0Var6 = new k0(vVar, r15, onOpenGroup, b1Var3, 20);
                        r12.o0(k0Var6);
                        objQ8 = k0Var6;
                    } else {
                        k0 k0Var7 = new k0(vVar, r15, onOpenGroup, b1Var3, 20);
                        r12.o0(k0Var7);
                        objQ8 = k0Var7;
                    }
                    iu.k.e((fz.a) objQ8, rVarE2, z23, 0L, null, c.f54125a, r12, 196656, 24);
                    ?? r19 = r12;
                    r19.p(z16);
                    z17 = false;
                    r13 = r19;
                } else {
                    z16 = true;
                    z17 = false;
                    r12.d0(1385917156);
                    r13 = r12;
                }
                r13.p(z17);
                r13.p(z16);
                r13.p(z17);
                r14 = r13;
            }
            r14.p(z16);
            z12 = z16;
            rVar2 = oVar;
            r11 = r14;
        } else {
            ?? r110 = r9;
            r110.W();
            rVar2 = rVar;
            z12 = z11;
            r11 = r110;
        }
        x1 x1VarT = r11.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new jr.j(uiState, onBackClick, onQueryChange, onOpenGroup, onOcrFromCamera, rVar2, z12, i11);
        }
    }

    public static final void c(n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.f0(-1528645980);
        if (sVar.T(i11 & 1, i11 != 0)) {
            o oVar = o.f58481a;
            r rVarE = j0.c.E(e2.e(oVar, 1.0f), CropImageView.DEFAULT_ASPECT_RATIO, 48, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13);
            j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.P, sVar, 48);
            int iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            r rVarC = z1.a.c(sVar, rVarE);
            k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            t.J(y2.j.f56917f, uVarA, sVar);
            t.J(y2.j.f56916e, q1VarL, sVar);
            y2.h hVar = y2.j.f56918g;
            if (sVar.S || !m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
            }
            t.J(y2.j.f56915d, rVarC, sVar);
            c3 c3Var = fc.f30256a;
            y0 y0Var = ((dc) sVar.j(c3Var)).f30175h;
            c3 c3Var2 = v1.f31180a;
            ua.b("支持汉字句子与拼音搜索", null, ((s1) sVar.j(c3Var2)).f31034q, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0Var, sVar, 6, 0, 65530);
            j0.c.g(sVar, e2.g(oVar, 8));
            ua.b("示例: nihao / nǐhǎo / 中国", null, ((s1) sVar.j(c3Var2)).f31036s, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((dc) sVar.j(c3Var)).f30178k, sVar, 6, 0, 65530);
            sVar = sVar;
            sVar.p(true);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new w(i11, 16);
        }
    }

    public static final void d(int i11, fz.a aVar, String str, n nVar, boolean z11) {
        long jC;
        long jC2;
        boolean z12;
        long j11;
        s sVar = (s) nVar;
        sVar.f0(1991198660);
        int i12 = i11 | (sVar.f(str) ? 4 : 2) | (sVar.g(z11) ? 32 : 16) | (sVar.h(aVar) ? 256 : 128);
        if (sVar.T(i12 & 1, (i12 & 147) != 146)) {
            float f5 = 8;
            r0.e eVarD = r0.f.d(f5);
            o oVar = o.f58481a;
            r rVarB = d2.h.b(oVar, eVarD);
            if (z11) {
                sVar.d0(-2013493161);
                jC = g2.x.c(((s1) sVar.j(v1.f31180a)).f31017a, 0.12f);
                sVar.p(false);
            } else {
                sVar.d0(-2013490537);
                jC = g2.x.c(((s1) sVar.j(v1.f31180a)).f31035r, 0.25f);
                sVar.p(false);
            }
            r rVarH = d0.n.h(rVarB, jC, f0.f28556b);
            float f11 = 1;
            if (z11) {
                sVar.d0(-2013485717);
                jC2 = ((s1) sVar.j(v1.f31180a)).f31017a;
                sVar.p(false);
            } else {
                sVar.d0(-2013483690);
                jC2 = g2.x.c(((s1) sVar.j(v1.f31180a)).A, 0.3f);
                sVar.p(false);
            }
            r rVarJ = d0.n.j(rVarH, f11, jC2, r0.f.d(f5));
            int i13 = i12 & 896;
            boolean z13 = i13 == 256;
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (z13 || objQ == gVar) {
                objQ = new okhttp3.b(26, aVar);
                sVar.o0(objQ);
            }
            r rVarB2 = j0.c.B(d0.n.o(rVarJ, false, null, (fz.a) objQ, 15), 10, f5);
            q0 q0VarD = j0.o.d(z1.c.f58463a, false);
            int iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            r rVarC = z1.a.c(sVar, rVarB2);
            k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            y2.h hVar = y2.j.f56917f;
            t.J(hVar, q0VarD, sVar);
            y2.h hVar2 = y2.j.f56916e;
            t.J(hVar2, q1VarL, sVar);
            y2.h hVar3 = y2.j.f56918g;
            if (sVar.S || !m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar3);
            }
            y2.h hVar4 = y2.j.f56915d;
            t.J(hVar4, rVarC, sVar);
            a2 a2VarA = z1.a(j0.i.f35303a, z1.c.M, sVar, 54);
            int iHashCode2 = Long.hashCode(sVar.T);
            q1 q1VarL2 = sVar.l();
            r rVarC2 = z1.a.c(sVar, oVar);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            t.J(hVar, a2VarA, sVar);
            t.J(hVar2, q1VarL2, sVar);
            if (sVar.S || !m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar3);
            }
            t.J(hVar4, rVarC2, sVar);
            boolean z14 = i13 == 256;
            Object objQ2 = sVar.Q();
            if (z14 || objQ2 == gVar) {
                objQ2 = new r0(16, aVar);
                sVar.o0(objQ2);
            }
            h1.e1.a(z11, (fz.c) objQ2, null, false, null, sVar, (i12 >> 3) & 14, 60);
            j0.c.g(sVar, e2.s(oVar, 4));
            y0 y0Var = ((dc) sVar.j(fc.f30256a)).f30174g;
            if (z11) {
                sVar.d0(1468726613);
                j11 = ((s1) sVar.j(v1.f31180a)).f31017a;
                z12 = false;
            } else {
                z12 = false;
                sVar.d0(1468727863);
                j11 = ((s1) sVar.j(v1.f31180a)).f31034q;
            }
            sVar.p(z12);
            ua.b(str, null, j11, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0Var, sVar, i12 & 14, 0, 65530);
            sVar = sVar;
            sVar.p(true);
            sVar.p(true);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new y(str, z11, aVar, i11, 3);
        }
    }

    public static final void e(String str, fz.c cVar, fz.a aVar, fz.a aVar2, n nVar, int i11) {
        int i12;
        s sVar;
        s sVar2 = (s) nVar;
        sVar2.f0(370970981);
        if ((i11 & 6) == 0) {
            i12 = (sVar2.f(str) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar2.h(cVar) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= sVar2.h(aVar) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar2.h(aVar2) ? 2048 : 1024;
        }
        if (sVar2.T(i12 & 1, (i12 & 1171) != 1170)) {
            Object[] objArr = new Object[0];
            int i13 = i12 & 14;
            boolean z11 = i13 == 4;
            Object objQ = sVar2.Q();
            l1.g gVar = l1.m.f39353a;
            if (z11 || objQ == gVar) {
                objQ = new ar.a(str, 11);
                sVar2.o0(objQ);
            }
            b1 b1Var = (b1) w1.j.e(Arrays.copyOf(objArr, 0), new qp.o2(6, new w(24), new a(3)), (fz.a) objQ, sVar2, 384, 0);
            boolean zF = sVar2.f(b1Var) | (i13 == 4);
            Object objQ2 = sVar2.Q();
            if (zF || objQ2 == gVar) {
                objQ2 = new kt.k(str, b1Var, null, 1);
                sVar2.o0(objQ2);
            }
            t.f((fz.e) objQ2, str, sVar2);
            o3.w wVar = (o3.w) b1Var.getValue();
            r rVarE = e2.e(o.f58481a, 1.0f);
            s0.r0 r0Var = new s0.r0(0, 3, 119);
            Object objQ3 = sVar2.Q();
            if (objQ3 == gVar) {
                objQ3 = new a(1);
                sVar2.o0(objQ3);
            }
            s0.q0 q0Var = new s0.q0(null, (fz.c) objQ3, 47);
            j6 j6Var = j6.f30479a;
            c3 c3Var = v1.f31180a;
            ha haVarC = j6.c(0L, 0L, ((s1) sVar2.j(c3Var)).f31017a, g2.x.c(((s1) sVar2.j(c3Var)).A, 0.4f), sVar2, 2147477503);
            boolean zF2 = sVar2.f(b1Var) | ((i12 & 112) == 32);
            Object objQ4 = sVar2.Q();
            if (zF2 || objQ4 == gVar) {
                objQ4 = new y3(cVar, b1Var, 8);
                sVar2.o0(objQ4);
            }
            t6.b(wVar, (fz.c) objQ4, rVarE, false, null, null, c.f54126b, c.f54127c, t1.e.d(-1837860836, new k6(aVar2, aVar, b1Var), sVar2), null, false, null, r0Var, q0Var, true, 0, 0, null, haVarC, sVar2, 918552960, 12779520, 3964024);
            sVar = sVar2;
        } else {
            sVar = sVar2;
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new cs.a(str, (Object) cVar, (Object) aVar, (Object) aVar2, i11, 18);
        }
    }

    public static final void f(ArrayList arrayList, Set set, fz.c cVar, n nVar, int i11) {
        ArrayList arrayList2;
        s sVar;
        s sVar2 = (s) nVar;
        sVar2.f0(-1953888764);
        int i12 = i11 | (sVar2.h(arrayList) ? 4 : 2) | (sVar2.h(set) ? 32 : 16) | (sVar2.h(cVar) ? 256 : 128);
        if (sVar2.T(i12 & 1, (i12 & 147) != 146)) {
            String strL = p0.l("已选 ", set.size(), " / 共 ", arrayList.size(), " 个");
            y0 y0Var = ((dc) sVar2.j(fc.f30256a)).f30178k;
            c3 c3Var = v1.f31180a;
            sVar = sVar2;
            ua.b(strL, null, ((s1) sVar2.j(c3Var)).f31036s, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0Var, sVar, 0, 0, 65530);
            o oVar = o.f58481a;
            j0.c.g(sVar, e2.g(oVar, 8));
            arrayList2 = arrayList;
            k7.d(e2.e(oVar, 1.0f), null, k7.p(((s1) sVar.j(c3Var)).f31033p, sVar, 0), null, null, t1.e.d(-1467016366, new defpackage.d(arrayList2, set, cVar, 17), sVar), sVar, 196614, 26);
        } else {
            arrayList2 = arrayList;
            sVar = sVar2;
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new k6(arrayList2, set, cVar, i11, 19);
        }
    }
}
