package qu;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import b0.k0;
import bp.f0;
import bt.j1;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.lingodeer.R;
import com.lingodeer.data.model.AchievementLeaderBoardType;
import com.lingodeer.data.model.uistate.LeaderBoardUser;
import com.yalantis.ucrop.view.CropImageView;
import dt.d2;
import fr.j3;
import g2.r0;
import h1.k7;
import h1.s1;
import h1.ua;
import iv.u0;
import j0.a2;
import j0.v1;
import j0.z1;
import j3.y0;
import java.util.ArrayList;
import kotlin.jvm.internal.z;
import l1.b1;
import l1.d0;
import l1.j0;
import l1.q1;
import l1.x1;
import mt.k6;
import mt.l0;
import ot.e2;
import ot.f2;
import pr.y;
import qp.n2;
import qy.b0;
import tu.a0;
import tu.e0;
import w2.q0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t1.d f48341a = new t1.d(new nv.b(28), false, -314327894);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final t1.d f48342b = new t1.d(new nv.b(29), false, -472859999);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final t1.d f48343c = new t1.d(new a(0), false, -1439653838);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final t1.d f48344d = new t1.d(new a(1), false, -1876193652);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final t1.d f48345e = new t1.d(new a(2), false, 1766971664);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final t1.d f48346f = new t1.d(new a(3), false, -1907868373);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final t1.d f48347g = new t1.d(new a(4), false, 1570222345);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final t1.d f48348h = new t1.d(new os.a(22), false, 1650694422);

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void a(tu.j jVar, mu.x xVar, fz.a onDismiss, l1.n nVar, int i11) {
        tu.j jVar2;
        mu.x xVar2;
        mu.x xVar3;
        final tu.j jVar3;
        final fz.a aVar;
        kotlin.jvm.internal.m.f(onDismiss, "onDismiss");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-1259893324);
        int i12 = i11 | 18;
        if (sVar.T(i12 & 1, (i12 & 147) != 146)) {
            sVar.Y();
            if ((i11 & 1) == 0 || sVar.C()) {
                sVar.d0(-1614864554);
                LocalViewModelStoreOwner localViewModelStoreOwner = LocalViewModelStoreOwner.INSTANCE;
                int i13 = LocalViewModelStoreOwner.$stable;
                ViewModelStoreOwner current = localViewModelStoreOwner.getCurrent(sVar, i13);
                if (current == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                ViewModel viewModelA = i20.b.a(z.a(tu.j.class), current.getViewModelStore(), null, i20.a.a(current), null, q10.b.a(sVar), null);
                sVar.p(false);
                tu.j jVar4 = (tu.j) viewModelA;
                sVar.d0(-1614864554);
                ViewModelStoreOwner current2 = localViewModelStoreOwner.getCurrent(sVar, i13);
                if (current2 == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                ViewModel viewModelA2 = i20.b.a(z.a(mu.x.class), current2.getViewModelStore(), null, i20.a.a(current2), null, q10.b.a(sVar), null);
                sVar.p(false);
                xVar3 = (mu.x) viewModelA2;
                jVar3 = jVar4;
            } else {
                sVar.W();
                jVar3 = jVar;
                xVar3 = xVar;
            }
            sVar.q();
            b1 b1VarO = l1.t.o(jVar3.L, sVar);
            b1 b1VarO2 = l1.t.o(xVar3.T, sVar);
            b1 b1VarO3 = l1.t.o(xVar3.Q, sVar);
            if (((Boolean) l1.t.o(xVar3.L, sVar).getValue()).booleanValue()) {
                sVar.d0(237690351);
                tv.a.c(sVar, 0);
            } else {
                sVar.d0(233988238);
            }
            sVar.p(false);
            mu.l lVar = (mu.l) b1VarO2.getValue();
            if (kotlin.jvm.internal.m.a(lVar, mu.j.f42143a)) {
                sVar.d0(423312184);
                sVar.p(false);
            } else {
                if (!(lVar instanceof mu.k)) {
                    throw nv.p.x(sVar, 423312829, false);
                }
                sVar.d0(237880195);
                Object objQ = sVar.Q();
                l1.g gVar = l1.m.f39353a;
                if (objQ == gVar) {
                    objQ = l1.t.B(Boolean.FALSE);
                    sVar.o0(objQ);
                }
                b1 b1Var = (b1) objQ;
                Boolean bool = (Boolean) b1VarO3.getValue();
                bool.booleanValue();
                boolean zF = sVar.f(b1VarO3) | sVar.h(jVar3);
                Object objQ2 = sVar.Q();
                if (zF || objQ2 == gVar) {
                    qg.e eVar = new qg.e(jVar3, onDismiss, b1VarO3, null, 1);
                    aVar = onDismiss;
                    sVar.o0(eVar);
                    objQ2 = eVar;
                } else {
                    aVar = onDismiss;
                }
                l1.t.f((fz.e) objQ2, bool, sVar);
                f.n nVar2 = (f.n) sVar.j(ju.f.f37369c);
                tu.h hVar = (tu.h) b1VarO.getValue();
                mu.l lVar2 = (mu.l) b1VarO2.getValue();
                boolean zH = sVar.h(jVar3);
                Object objQ3 = sVar.Q();
                if (zH || objQ3 == gVar) {
                    objQ3 = new e2(jVar3, 16);
                    sVar.o0(objQ3);
                }
                fz.c cVar = (fz.c) objQ3;
                boolean zF2 = sVar.f(b1VarO2) | sVar.f(b1VarO) | sVar.h(xVar3);
                Object objQ4 = sVar.Q();
                if (zF2 || objQ4 == gVar) {
                    k0 k0Var = new k0(b1Var, b1VarO2, b1VarO, xVar3, 19);
                    sVar.o0(k0Var);
                    objQ4 = k0Var;
                }
                fz.a aVar2 = (fz.a) objQ4;
                boolean zH2 = sVar.h(jVar3);
                Object objQ5 = sVar.Q();
                if (zH2 || objQ5 == gVar) {
                    final int i14 = 0;
                    objQ5 = new fz.a() { // from class: qu.t
                        @Override // fz.a
                        public final Object invoke() {
                            switch (i14) {
                                case 0:
                                    jVar3.a(tu.b.f52543a);
                                    aVar.invoke();
                                    break;
                                default:
                                    jVar3.a(tu.c.f52544a);
                                    aVar.invoke();
                                    break;
                            }
                            return b0.f48488a;
                        }
                    };
                    sVar.o0(objQ5);
                }
                fz.a aVar3 = (fz.a) objQ5;
                boolean zH3 = sVar.h(jVar3);
                Object objQ6 = sVar.Q();
                if (zH3 || objQ6 == gVar) {
                    final int i15 = 1;
                    objQ6 = new fz.a() { // from class: qu.t
                        @Override // fz.a
                        public final Object invoke() {
                            switch (i15) {
                                case 0:
                                    jVar3.a(tu.b.f52543a);
                                    aVar.invoke();
                                    break;
                                default:
                                    jVar3.a(tu.c.f52544a);
                                    aVar.invoke();
                                    break;
                            }
                            return b0.f48488a;
                        }
                    };
                    sVar.o0(objQ6);
                }
                b(hVar, lVar2, cVar, aVar2, aVar3, (fz.a) objQ6, sVar, 0);
                if (((Boolean) b1Var.getValue()).booleanValue()) {
                    sVar.d0(239656774);
                    mu.l lVar3 = (mu.l) b1VarO2.getValue();
                    kotlin.jvm.internal.m.d(lVar3, "null cannot be cast to non-null type com.lingodeer.gem.viewmodels.GemUiState.Success");
                    mu.k kVar = (mu.k) lVar3;
                    Object objQ7 = sVar.Q();
                    if (objQ7 == gVar) {
                        objQ7 = new pr.z(3, b1Var);
                        sVar.o0(objQ7);
                    }
                    fz.a aVar4 = (fz.a) objQ7;
                    boolean zH4 = sVar.h(xVar3) | sVar.h(nVar2);
                    Object objQ8 = sVar.Q();
                    if (zH4 || objQ8 == gVar) {
                        objQ8 = new n2(5, xVar3, nVar2);
                        sVar.o0(objQ8);
                    }
                    ku.a.j(kVar, aVar4, (fz.c) objQ8, sVar, 56);
                } else {
                    sVar.d0(233988238);
                }
                sVar.p(false);
                sVar.p(false);
            }
            jVar2 = jVar3;
            xVar2 = xVar3;
        } else {
            sVar.W();
            jVar2 = jVar;
            xVar2 = xVar;
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new k6(jVar2, xVar2, false, onDismiss, i11, 13);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:102:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:105:0x0307  */
    /* JADX WARN: Code duplicated, block: B:108:0x030c  */
    /* JADX WARN: Code duplicated, block: B:112:0x034c  */
    /* JADX WARN: Code duplicated, block: B:113:0x034e  */
    /* JADX WARN: Code duplicated, block: B:116:0x0355 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:119:0x035b  */
    /* JADX WARN: Code duplicated, block: B:122:0x0383  */
    /* JADX WARN: Code duplicated, block: B:123:0x0385  */
    /* JADX WARN: Code duplicated, block: B:125:0x039d  */
    /* JADX WARN: Code duplicated, block: B:57:0x014f  */
    /* JADX WARN: Code duplicated, block: B:58:0x015f  */
    /* JADX WARN: Code duplicated, block: B:60:0x0163  */
    /* JADX WARN: Code duplicated, block: B:62:0x019a  */
    /* JADX WARN: Code duplicated, block: B:63:0x019e  */
    /* JADX WARN: Code duplicated, block: B:70:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:74:0x0290  */
    /* JADX WARN: Code duplicated, block: B:75:0x0292  */
    /* JADX WARN: Code duplicated, block: B:78:0x0299  */
    /* JADX WARN: Code duplicated, block: B:79:0x029b  */
    /* JADX WARN: Code duplicated, block: B:82:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:85:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:89:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:90:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:93:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:94:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:97:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:98:0x02f3  */
    public static final void b(tu.h uiStatus, mu.l gemUiState, fz.c onSelected, fz.a onClickUseGem, fz.a onConfirm, fz.a onClear, l1.n nVar, int i11) {
        l1.g gVar;
        y2.h hVar;
        int iHashCode;
        boolean z11;
        l1.g gVar2;
        int i12;
        boolean z12;
        boolean z13;
        boolean z14;
        Object objQ;
        l1.g gVar3;
        l1.g gVar4;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        Object objQ2;
        l1.g gVar5;
        boolean z20;
        Object objQ3;
        boolean z21;
        kotlin.jvm.internal.m.f(uiStatus, "uiStatus");
        kotlin.jvm.internal.m.f(gemUiState, "gemUiState");
        kotlin.jvm.internal.m.f(onSelected, "onSelected");
        kotlin.jvm.internal.m.f(onClickUseGem, "onClickUseGem");
        kotlin.jvm.internal.m.f(onConfirm, "onConfirm");
        kotlin.jvm.internal.m.f(onClear, "onClear");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(145360127);
        int i13 = i11 | (sVar.f(uiStatus) ? 4 : 2) | (sVar.h(gemUiState) ? 32 : 16) | (sVar.h(onSelected) ? 256 : 128) | (sVar.h(onClickUseGem) ? 2048 : 1024) | (sVar.h(onConfirm) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE) | (sVar.h(onClear) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536);
        if (!sVar.T(i13 & 1, (74899 & i13) != 74898)) {
            sVar.W();
        } else if (uiStatus.equals(tu.f.f52562a)) {
            sVar.d0(-2042827613);
            sVar.p(false);
        } else {
            if (!(uiStatus instanceof tu.g)) {
                throw nv.p.x(sVar, -2042822305, false);
            }
            sVar.d0(1097138887);
            tu.g gVar6 = (tu.g) uiStatus;
            tu.k kVar = gVar6.f52568c;
            boolean zF = sVar.f(kVar);
            Object objQ4 = sVar.Q();
            l1.g gVar7 = l1.m.f39353a;
            if (zF || objQ4 == gVar7) {
                objQ4 = kVar != null ? new c(kVar.f52594a, kVar.f52595b, kVar.f52597d) : null;
                sVar.o0(objQ4);
            }
            c cVar = (c) objQ4;
            z1.o oVar = z1.o.f58481a;
            z1.r rVarE = j0.c.E(j0.c.v(oVar), CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, su.b.f51786e, 7);
            j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.P, sVar, 48);
            int iHashCode2 = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, rVarE);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            y2.h hVar2 = y2.j.f56917f;
            l1.t.J(hVar2, uVarA, sVar);
            y2.h hVar3 = y2.j.f56916e;
            l1.t.J(hVar3, q1VarL, sVar);
            y2.h hVar4 = y2.j.f56918g;
            if (sVar.S) {
                gVar = gVar7;
            } else {
                gVar = gVar7;
                if (!kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                }
                hVar = y2.j.f56915d;
                l1.t.J(hVar, rVarC, sVar);
                if (gemUiState.equals(mu.j.f42143a)) {
                    sVar.d0(-1604673364);
                    sVar.p(false);
                    z11 = false;
                } else {
                    if (gemUiState instanceof mu.k) {
                        throw nv.p.x(sVar, -1604675029, false);
                    }
                    sVar.d0(1794788729);
                    z1.r rVarE2 = j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 16, CropImageView.DEFAULT_ASPECT_RATIO, 11);
                    q0 q0VarD = j0.o.d(z1.c.f58463a, false);
                    iHashCode = Long.hashCode(sVar.T);
                    q1 q1VarL2 = sVar.l();
                    z1.r rVarC2 = z1.a.c(sVar, rVarE2);
                    sVar.h0();
                    if (sVar.S) {
                        sVar.k(iVar);
                    } else {
                        sVar.r0();
                    }
                    l1.t.J(hVar2, q0VarD, sVar);
                    l1.t.J(hVar3, q1VarL2, sVar);
                    if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                        defpackage.e.A(iHashCode, sVar, iHashCode, hVar4);
                    }
                    l1.t.J(hVar, rVarC2, sVar);
                    z11 = false;
                    ku.a.b(((mu.k) gemUiState).f42144a, sVar, 0);
                    sVar.p(true);
                    sVar.p(false);
                }
                gVar2 = gVar;
                ua.b("Status Settings", null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar.j(ua.f31167a), 0L, j3.A(16), n3.s.N, null, null, 0L, null, null, 0, 0, 0L, null, 16777209), sVar, 6, 0, 65534);
                g(gVar6.f52566a, gVar6.f52567b, cVar, true, (int) su.b.f51782a, j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, su.b.f51787f, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), sVar, 199680);
                m0.b bVar = new m0.b(5);
                float f5 = su.b.f51788g;
                float f11 = su.b.f51789h;
                v1 v1Var = new v1(f11, f5, f11, f5);
                j0.e eVar = j0.i.f35309g;
                j0.g gVarG = j0.i.g(su.b.f51790i);
                i12 = i13 & 14;
                if (i12 != 4) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                if ((i13 & 896) == 256) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                z14 = z12 | z13;
                objQ = sVar.Q();
                if (z14) {
                    gVar3 = gVar2;
                } else {
                    gVar3 = gVar2;
                    if (objQ == gVar3) {
                    }
                    gVar4 = gVar3;
                    md.a.a(bVar, null, null, v1Var, gVarG, eVar, null, false, null, (fz.c) objQ, sVar, 1769472, 918);
                    sVar = sVar;
                    if (kVar != null) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    float f12 = su.b.f51791j;
                    z1.r rVarE3 = j0.e2.e(j0.c.C(oVar, f12, CropImageView.DEFAULT_ASPECT_RATIO, 2), 1.0f);
                    if (i12 != 4) {
                        z16 = false;
                    } else {
                        z16 = true;
                    }
                    if ((i13 & 7168) == 2048) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    boolean z22 = z16 | z17;
                    if ((57344 & i13) == 16384) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    z19 = z22 | z18;
                    objQ2 = sVar.Q();
                    if (z19) {
                        gVar5 = gVar4;
                    } else {
                        gVar5 = gVar4;
                        if (objQ2 == gVar5) {
                        }
                        iu.k.e((fz.a) objQ2, rVarE3, z15, 0L, null, t1.e.d(-1155665059, new s(uiStatus, 0), sVar), sVar, 196656, 24);
                        if ((i13 & 458752) == 131072) {
                            z20 = true;
                        } else {
                            z20 = false;
                        }
                        objQ3 = sVar.Q();
                        if (z20 || objQ3 == gVar5) {
                            objQ3 = new okhttp3.b(8, onClear);
                            sVar.o0(objQ3);
                        }
                        fz.a aVar = (fz.a) objQ3;
                        z1.r rVarE4 = j0.c.E(j0.e2.e(j0.c.C(oVar, f12, CropImageView.DEFAULT_ASPECT_RATIO, 2), 1.0f), CropImageView.DEFAULT_ASPECT_RATIO, su.b.f51792k, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13);
                        if (kVar != null) {
                            z21 = true;
                        } else {
                            z21 = false;
                        }
                        k7.m(aVar, rVarE4, z21, null, null, null, f48346f, sVar, 805306416, 504);
                        sVar.p(true);
                        sVar.p(false);
                    }
                    objQ2 = new l0(uiStatus, onClickUseGem, onConfirm, 19);
                    sVar.o0(objQ2);
                    iu.k.e((fz.a) objQ2, rVarE3, z15, 0L, null, t1.e.d(-1155665059, new s(uiStatus, 0), sVar), sVar, 196656, 24);
                    if ((i13 & 458752) == 131072) {
                        z20 = true;
                    } else {
                        z20 = false;
                    }
                    objQ3 = sVar.Q();
                    if (z20) {
                        objQ3 = new okhttp3.b(8, onClear);
                        sVar.o0(objQ3);
                    } else {
                        objQ3 = new okhttp3.b(8, onClear);
                        sVar.o0(objQ3);
                    }
                    fz.a aVar2 = (fz.a) objQ3;
                    z1.r rVarE5 = j0.c.E(j0.e2.e(j0.c.C(oVar, f12, CropImageView.DEFAULT_ASPECT_RATIO, 2), 1.0f), CropImageView.DEFAULT_ASPECT_RATIO, su.b.f51792k, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13);
                    if (kVar != null) {
                        z21 = true;
                    } else {
                        z21 = false;
                    }
                    k7.m(aVar2, rVarE5, z21, null, null, null, f48346f, sVar, 805306416, 504);
                    sVar.p(true);
                    sVar.p(false);
                }
                objQ = new n2(6, uiStatus, onSelected);
                sVar.o0(objQ);
                gVar4 = gVar3;
                md.a.a(bVar, null, null, v1Var, gVarG, eVar, null, false, null, (fz.c) objQ, sVar, 1769472, 918);
                sVar = sVar;
                if (kVar != null) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                float f13 = su.b.f51791j;
                z1.r rVarE6 = j0.e2.e(j0.c.C(oVar, f13, CropImageView.DEFAULT_ASPECT_RATIO, 2), 1.0f);
                if (i12 != 4) {
                    z16 = false;
                } else {
                    z16 = true;
                }
                if ((i13 & 7168) == 2048) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                boolean z23 = z16 | z17;
                if ((57344 & i13) == 16384) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                z19 = z23 | z18;
                objQ2 = sVar.Q();
                if (z19) {
                    gVar5 = gVar4;
                    if (objQ2 == gVar5) {
                    }
                    iu.k.e((fz.a) objQ2, rVarE6, z15, 0L, null, t1.e.d(-1155665059, new s(uiStatus, 0), sVar), sVar, 196656, 24);
                    if ((i13 & 458752) == 131072) {
                        z20 = true;
                    } else {
                        z20 = false;
                    }
                    objQ3 = sVar.Q();
                    if (z20) {
                        objQ3 = new okhttp3.b(8, onClear);
                        sVar.o0(objQ3);
                    } else {
                        objQ3 = new okhttp3.b(8, onClear);
                        sVar.o0(objQ3);
                    }
                    fz.a aVar3 = (fz.a) objQ3;
                    z1.r rVarE7 = j0.c.E(j0.e2.e(j0.c.C(oVar, f13, CropImageView.DEFAULT_ASPECT_RATIO, 2), 1.0f), CropImageView.DEFAULT_ASPECT_RATIO, su.b.f51792k, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13);
                    if (kVar != null) {
                        z21 = true;
                    } else {
                        z21 = false;
                    }
                    k7.m(aVar3, rVarE7, z21, null, null, null, f48346f, sVar, 805306416, 504);
                    sVar.p(true);
                    sVar.p(false);
                } else {
                    gVar5 = gVar4;
                }
                objQ2 = new l0(uiStatus, onClickUseGem, onConfirm, 19);
                sVar.o0(objQ2);
                iu.k.e((fz.a) objQ2, rVarE6, z15, 0L, null, t1.e.d(-1155665059, new s(uiStatus, 0), sVar), sVar, 196656, 24);
                if ((i13 & 458752) == 131072) {
                    z20 = true;
                } else {
                    z20 = false;
                }
                objQ3 = sVar.Q();
                if (z20) {
                    objQ3 = new okhttp3.b(8, onClear);
                    sVar.o0(objQ3);
                } else {
                    objQ3 = new okhttp3.b(8, onClear);
                    sVar.o0(objQ3);
                }
                fz.a aVar4 = (fz.a) objQ3;
                z1.r rVarE8 = j0.c.E(j0.e2.e(j0.c.C(oVar, f13, CropImageView.DEFAULT_ASPECT_RATIO, 2), 1.0f), CropImageView.DEFAULT_ASPECT_RATIO, su.b.f51792k, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13);
                if (kVar != null) {
                    z21 = true;
                } else {
                    z21 = false;
                }
                k7.m(aVar4, rVarE8, z21, null, null, null, f48346f, sVar, 805306416, 504);
                sVar.p(true);
                sVar.p(false);
            }
            defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar4);
            hVar = y2.j.f56915d;
            l1.t.J(hVar, rVarC, sVar);
            if (gemUiState.equals(mu.j.f42143a)) {
                sVar.d0(-1604673364);
                sVar.p(false);
                z11 = false;
            } else {
                if (gemUiState instanceof mu.k) {
                    throw nv.p.x(sVar, -1604675029, false);
                }
                sVar.d0(1794788729);
                z1.r rVarE9 = j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 16, CropImageView.DEFAULT_ASPECT_RATIO, 11);
                q0 q0VarD2 = j0.o.d(z1.c.f58463a, false);
                iHashCode = Long.hashCode(sVar.T);
                q1 q1VarL3 = sVar.l();
                z1.r rVarC3 = z1.a.c(sVar, rVarE9);
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar);
                } else {
                    sVar.r0();
                }
                l1.t.J(hVar2, q0VarD2, sVar);
                l1.t.J(hVar3, q1VarL3, sVar);
                if (sVar.S) {
                    defpackage.e.A(iHashCode, sVar, iHashCode, hVar4);
                } else {
                    defpackage.e.A(iHashCode, sVar, iHashCode, hVar4);
                }
                l1.t.J(hVar, rVarC3, sVar);
                z11 = false;
                ku.a.b(((mu.k) gemUiState).f42144a, sVar, 0);
                sVar.p(true);
                sVar.p(false);
            }
            gVar2 = gVar;
            ua.b("Status Settings", null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar.j(ua.f31167a), 0L, j3.A(16), n3.s.N, null, null, 0L, null, null, 0, 0, 0L, null, 16777209), sVar, 6, 0, 65534);
            g(gVar6.f52566a, gVar6.f52567b, cVar, true, (int) su.b.f51782a, j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, su.b.f51787f, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), sVar, 199680);
            m0.b bVar2 = new m0.b(5);
            float f14 = su.b.f51788g;
            float f15 = su.b.f51789h;
            v1 v1Var2 = new v1(f15, f14, f15, f14);
            j0.e eVar2 = j0.i.f35309g;
            j0.g gVarG2 = j0.i.g(su.b.f51790i);
            i12 = i13 & 14;
            if (i12 != 4) {
                z12 = false;
            } else {
                z12 = true;
            }
            if ((i13 & 896) == 256) {
                z13 = true;
            } else {
                z13 = false;
            }
            z14 = z12 | z13;
            objQ = sVar.Q();
            if (z14) {
                gVar3 = gVar2;
                if (objQ == gVar3) {
                }
                gVar4 = gVar3;
                md.a.a(bVar2, null, null, v1Var2, gVarG2, eVar2, null, false, null, (fz.c) objQ, sVar, 1769472, 918);
                sVar = sVar;
                if (kVar != null) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                float f16 = su.b.f51791j;
                z1.r rVarE10 = j0.e2.e(j0.c.C(oVar, f16, CropImageView.DEFAULT_ASPECT_RATIO, 2), 1.0f);
                if (i12 != 4) {
                    z16 = false;
                } else {
                    z16 = true;
                }
                if ((i13 & 7168) == 2048) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                boolean z24 = z16 | z17;
                if ((57344 & i13) == 16384) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                z19 = z24 | z18;
                objQ2 = sVar.Q();
                if (z19) {
                    gVar5 = gVar4;
                    if (objQ2 == gVar5) {
                    }
                    iu.k.e((fz.a) objQ2, rVarE10, z15, 0L, null, t1.e.d(-1155665059, new s(uiStatus, 0), sVar), sVar, 196656, 24);
                    if ((i13 & 458752) == 131072) {
                        z20 = true;
                    } else {
                        z20 = false;
                    }
                    objQ3 = sVar.Q();
                    if (z20) {
                        objQ3 = new okhttp3.b(8, onClear);
                        sVar.o0(objQ3);
                    } else {
                        objQ3 = new okhttp3.b(8, onClear);
                        sVar.o0(objQ3);
                    }
                    fz.a aVar5 = (fz.a) objQ3;
                    z1.r rVarE11 = j0.c.E(j0.e2.e(j0.c.C(oVar, f16, CropImageView.DEFAULT_ASPECT_RATIO, 2), 1.0f), CropImageView.DEFAULT_ASPECT_RATIO, su.b.f51792k, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13);
                    if (kVar != null) {
                        z21 = true;
                    } else {
                        z21 = false;
                    }
                    k7.m(aVar5, rVarE11, z21, null, null, null, f48346f, sVar, 805306416, 504);
                    sVar.p(true);
                    sVar.p(false);
                } else {
                    gVar5 = gVar4;
                }
                objQ2 = new l0(uiStatus, onClickUseGem, onConfirm, 19);
                sVar.o0(objQ2);
                iu.k.e((fz.a) objQ2, rVarE10, z15, 0L, null, t1.e.d(-1155665059, new s(uiStatus, 0), sVar), sVar, 196656, 24);
                if ((i13 & 458752) == 131072) {
                    z20 = true;
                } else {
                    z20 = false;
                }
                objQ3 = sVar.Q();
                if (z20) {
                    objQ3 = new okhttp3.b(8, onClear);
                    sVar.o0(objQ3);
                } else {
                    objQ3 = new okhttp3.b(8, onClear);
                    sVar.o0(objQ3);
                }
                fz.a aVar6 = (fz.a) objQ3;
                z1.r rVarE12 = j0.c.E(j0.e2.e(j0.c.C(oVar, f16, CropImageView.DEFAULT_ASPECT_RATIO, 2), 1.0f), CropImageView.DEFAULT_ASPECT_RATIO, su.b.f51792k, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13);
                if (kVar != null) {
                    z21 = true;
                } else {
                    z21 = false;
                }
                k7.m(aVar6, rVarE12, z21, null, null, null, f48346f, sVar, 805306416, 504);
                sVar.p(true);
                sVar.p(false);
            } else {
                gVar3 = gVar2;
            }
            objQ = new n2(6, uiStatus, onSelected);
            sVar.o0(objQ);
            gVar4 = gVar3;
            md.a.a(bVar2, null, null, v1Var2, gVarG2, eVar2, null, false, null, (fz.c) objQ, sVar, 1769472, 918);
            sVar = sVar;
            if (kVar != null) {
                z15 = true;
            } else {
                z15 = false;
            }
            float f17 = su.b.f51791j;
            z1.r rVarE13 = j0.e2.e(j0.c.C(oVar, f17, CropImageView.DEFAULT_ASPECT_RATIO, 2), 1.0f);
            if (i12 != 4) {
                z16 = false;
            } else {
                z16 = true;
            }
            if ((i13 & 7168) == 2048) {
                z17 = true;
            } else {
                z17 = false;
            }
            boolean z25 = z16 | z17;
            if ((57344 & i13) == 16384) {
                z18 = true;
            } else {
                z18 = false;
            }
            z19 = z25 | z18;
            objQ2 = sVar.Q();
            if (z19) {
                gVar5 = gVar4;
                if (objQ2 == gVar5) {
                }
                iu.k.e((fz.a) objQ2, rVarE13, z15, 0L, null, t1.e.d(-1155665059, new s(uiStatus, 0), sVar), sVar, 196656, 24);
                if ((i13 & 458752) == 131072) {
                    z20 = true;
                } else {
                    z20 = false;
                }
                objQ3 = sVar.Q();
                if (z20) {
                    objQ3 = new okhttp3.b(8, onClear);
                    sVar.o0(objQ3);
                } else {
                    objQ3 = new okhttp3.b(8, onClear);
                    sVar.o0(objQ3);
                }
                fz.a aVar7 = (fz.a) objQ3;
                z1.r rVarE14 = j0.c.E(j0.e2.e(j0.c.C(oVar, f17, CropImageView.DEFAULT_ASPECT_RATIO, 2), 1.0f), CropImageView.DEFAULT_ASPECT_RATIO, su.b.f51792k, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13);
                if (kVar != null) {
                    z21 = true;
                } else {
                    z21 = false;
                }
                k7.m(aVar7, rVarE14, z21, null, null, null, f48346f, sVar, 805306416, 504);
                sVar.p(true);
                sVar.p(false);
            } else {
                gVar5 = gVar4;
            }
            objQ2 = new l0(uiStatus, onClickUseGem, onConfirm, 19);
            sVar.o0(objQ2);
            iu.k.e((fz.a) objQ2, rVarE13, z15, 0L, null, t1.e.d(-1155665059, new s(uiStatus, 0), sVar), sVar, 196656, 24);
            if ((i13 & 458752) == 131072) {
                z20 = true;
            } else {
                z20 = false;
            }
            objQ3 = sVar.Q();
            if (z20) {
                objQ3 = new okhttp3.b(8, onClear);
                sVar.o0(objQ3);
            } else {
                objQ3 = new okhttp3.b(8, onClear);
                sVar.o0(objQ3);
            }
            fz.a aVar8 = (fz.a) objQ3;
            z1.r rVarE15 = j0.c.E(j0.e2.e(j0.c.C(oVar, f17, CropImageView.DEFAULT_ASPECT_RATIO, 2), 1.0f), CropImageView.DEFAULT_ASPECT_RATIO, su.b.f51792k, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13);
            if (kVar != null) {
                z21 = true;
            } else {
                z21 = false;
            }
            k7.m(aVar8, rVarE15, z21, null, null, null, f48346f, sVar, 805306416, 504);
            sVar.p(true);
            sVar.p(false);
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new f0((Object) uiStatus, (Object) gemUiState, (Object) onSelected, onClickUseGem, onConfirm, onClear, i11, 12);
        }
    }

    public static final void c(z1.r modifier, l1.n nVar, int i11) {
        kotlin.jvm.internal.m.f(modifier, "modifier");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1714781394);
        if (sVar.T(i11 & 1, (i11 & 3) != 2)) {
            z1.r rVarC = j0.c.C(j0.e2.d(modifier, 1.0f), 16, CropImageView.DEFAULT_ASPECT_RATIO, 2);
            j0.u uVarA = j0.t.a(j0.i.f35307e, z1.c.P, sVar, 54);
            int iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            z1.r rVarC2 = z1.a.c(sVar, rVarC);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(y2.j.f56917f, uVarA, sVar);
            l1.t.J(y2.j.f56916e, q1VarL, sVar);
            y2.h hVar = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
            }
            l1.t.J(y2.j.f56915d, rVarC2, sVar);
            d0.n.c(se.k.y(R.drawable.lb_locked_status, sVar, 0), null, null, null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar, 48, 124);
            ua.b(ub.a.e0(sVar, R.string.leaderboard_hide_message), j0.c.E(z1.o.f58481a, CropImageView.DEFAULT_ASPECT_RATIO, 6, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), 0L, 0L, null, null, null, 0L, new u3.k(3), 0L, 0, false, 0, 0, y0.a((y0) sVar.j(ua.f31167a), 0L, j3.A(16), null, null, null, 0L, null, null, 0, 0, 0L, null, 16777213), sVar, 48, 0, 65020);
            sVar = sVar;
            sVar.p(true);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new ch.g(modifier, i11, 16);
        }
    }

    public static final void d(int i11, int i12, l1.n nVar, z1.r rVar) {
        z1.r rVar2;
        int i13;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(180596306);
        int i14 = i12 & 1;
        if (i14 != 0) {
            i13 = i11 | 6;
            rVar2 = rVar;
        } else if ((i11 & 6) == 0) {
            rVar2 = rVar;
            i13 = i11 | (sVar.f(rVar2) ? 4 : 2);
        } else {
            rVar2 = rVar;
            i13 = i11;
        }
        if (sVar.T(i13 & 1, (i13 & 3) != 2)) {
            z1.o oVar = z1.o.f58481a;
            z1.r rVar3 = i14 != 0 ? oVar : rVar2;
            z1.r rVarC = j0.c.C(j0.e2.d(rVar3, 1.0f), 16, CropImageView.DEFAULT_ASPECT_RATIO, 2);
            j0.u uVarA = j0.t.a(j0.i.f35307e, z1.c.P, sVar, 54);
            int iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            z1.r rVarC2 = z1.a.c(sVar, rVarC);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(y2.j.f56917f, uVarA, sVar);
            l1.t.J(y2.j.f56916e, q1VarL, sVar);
            y2.h hVar = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
            }
            l1.t.J(y2.j.f56915d, rVarC2, sVar);
            d0.n.c(se.k.y(R.drawable.lb_locked_status, sVar, 0), null, null, null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar, 48, 124);
            ua.b(ub.a.e0(sVar, R.string.start_learning_and_unlock_weekly_leaderboard), j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, 6, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), 0L, 0L, null, null, null, 0L, new u3.k(3), 0L, 0, false, 0, 0, null, sVar, 48, 0, 130556);
            sVar = sVar;
            sVar.p(true);
            rVar2 = rVar3;
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new fu.t(rVar2, i11, i12, 2);
        }
    }

    public static final void e(z1.r rVar, fz.a onClickLogin, l1.n nVar, int i11, int i12) {
        z1.r rVar2;
        int i13;
        z1.r rVar3;
        kotlin.jvm.internal.m.f(onClickLogin, "onClickLogin");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1201622536);
        int i14 = i12 & 1;
        if (i14 != 0) {
            i13 = i11 | 6;
            rVar2 = rVar;
        } else {
            rVar2 = rVar;
            i13 = (sVar.f(rVar2) ? 4 : 2) | i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= sVar.h(onClickLogin) ? 32 : 16;
        }
        if (sVar.T(i13 & 1, (i13 & 19) != 18)) {
            z1.o oVar = z1.o.f58481a;
            z1.r rVar4 = i14 != 0 ? oVar : rVar2;
            j0.u uVarA = j0.t.a(j0.i.f35307e, z1.c.P, sVar, 54);
            int iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, rVar4);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(y2.j.f56917f, uVarA, sVar);
            l1.t.J(y2.j.f56916e, q1VarL, sVar);
            y2.h hVar = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
            }
            l1.t.J(y2.j.f56915d, rVarC, sVar);
            j0.c.g(sVar, j0.v.a(j0.e2.e(oVar, 1.0f), 1.0f));
            d0.n.c(se.k.y(R.drawable.lb_locked_status, sVar, 0), null, null, null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar, 48, 124);
            float f5 = 32;
            ua.b(ub.a.e0(sVar, R.string.leaderboard_need_login), j0.c.E(j0.c.C(oVar, f5, CropImageView.DEFAULT_ASPECT_RATIO, 2), CropImageView.DEFAULT_ASPECT_RATIO, f5, CropImageView.DEFAULT_ASPECT_RATIO, 21, 5), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar.j(ua.f31167a), 0L, j3.A(14), n3.s.L, null, null, 0L, null, null, 3, 0, 0L, null, 16744441), sVar, 48, 0, 65532);
            rVar3 = rVar4;
            sVar = sVar;
            iu.k.e(onClickLogin, j0.c.C(j0.e2.e(oVar, 1.0f), 42, CropImageView.DEFAULT_ASPECT_RATIO, 2), false, 0L, null, f48347g, sVar, ((i13 >> 3) & 14) | 196656, 28);
            j0.c.g(sVar, j0.v.a(oVar, 2.0f));
            sVar.p(true);
        } else {
            sVar.W();
            rVar3 = rVar2;
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new gs.o(i11, i12, onClickLogin, rVar3);
        }
    }

    public static final void f(int i11, int i12, String str, l1.n nVar, z1.r rVar) {
        z1.r rVar2;
        y2.i iVar;
        y2.h hVar;
        long jE;
        y2.i iVar2;
        y2.h hVar2;
        String str2 = str;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(225823702);
        int i13 = i12 | (sVar.d(i11) ? 4 : 2) | (sVar.f(str2) ? 32 : 16) | 384;
        if (sVar.T(i13 & 1, (i13 & 147) != 146)) {
            z1.i iVar3 = z1.c.M;
            a2 a2VarA = z1.a(j0.i.g(16), iVar3, sVar, 54);
            int iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            z1.o oVar = z1.o.f58481a;
            z1.r rVarC = z1.a.c(sVar, oVar);
            y2.k.J.getClass();
            y2.i iVar4 = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar4);
            } else {
                sVar.r0();
            }
            y2.h hVar3 = y2.j.f56917f;
            l1.t.J(hVar3, a2VarA, sVar);
            y2.h hVar4 = y2.j.f56916e;
            l1.t.J(hVar4, q1VarL, sVar);
            y2.h hVar5 = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar5);
            }
            y2.h hVar6 = y2.j.f56915d;
            l1.t.J(hVar6, rVarC, sVar);
            j0.b bVar = j0.i.f35303a;
            a2 a2VarA2 = z1.a(bVar, iVar3, sVar, 48);
            int iHashCode2 = Long.hashCode(sVar.T);
            q1 q1VarL2 = sVar.l();
            z1.r rVarC2 = z1.a.c(sVar, oVar);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar4);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar3, a2VarA2, sVar);
            l1.t.J(hVar4, q1VarL2, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar5);
            }
            l1.t.J(hVar6, rVarC2, sVar);
            String strM = defpackage.e.m(ub.a.e0(sVar, R.string.today), ":");
            d0 d0Var = ua.f31167a;
            y0 y0Var = (y0) sVar.j(d0Var);
            long jA = j3.A(12);
            long jE2 = g2.f0.e(4289440683L);
            n3.s sVar2 = n3.s.K;
            ua.b(strM, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a(y0Var, jE2, jA, sVar2, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), sVar, 0, 0, 65534);
            float f5 = 6;
            j0.c.g(sVar, j0.e2.s(oVar, f5));
            a2 a2VarA3 = z1.a(bVar, iVar3, sVar, 48);
            int iHashCode3 = Long.hashCode(sVar.T);
            q1 q1VarL3 = sVar.l();
            z1.r rVarC3 = z1.a.c(sVar, oVar);
            sVar.h0();
            if (sVar.S) {
                iVar = iVar4;
                sVar.k(iVar);
            } else {
                iVar = iVar4;
                sVar.r0();
            }
            l1.t.J(hVar3, a2VarA3, sVar);
            l1.t.J(hVar4, q1VarL3, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode3))) {
                hVar = hVar5;
                defpackage.e.A(iHashCode3, sVar, iHashCode3, hVar);
            } else {
                hVar = hVar5;
            }
            l1.t.J(hVar6, rVarC3, sVar);
            if (i11 > 0) {
                jE = g2.f0.e(4282434192L);
            } else {
                jE = i11 < 0 ? g2.f0.e(4294923319L) : g2.f0.e(4289440683L);
            }
            long j11 = jE;
            k(0, j11, sVar, d2.h.h(j0.e2.n(oVar, 10), i11 < 0 ? 180.0f : CropImageView.DEFAULT_ASPECT_RATIO));
            String strValueOf = String.valueOf(i11);
            y0 y0Var2 = (y0) sVar.j(d0Var);
            long jA2 = j3.A(14);
            n3.s sVar3 = n3.s.L;
            y0 y0VarA = y0.a(y0Var2, j11, jA2, sVar3, null, null, 0L, null, null, 0, 0, 0L, null, 16777208);
            float f11 = 4;
            y2.h hVar7 = hVar;
            y2.i iVar5 = iVar;
            ua.b(strValueOf, j0.c.E(oVar, f11, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0VarA, sVar, 48, 0, 65532);
            sVar.p(true);
            sVar.p(true);
            a2 a2VarA4 = z1.a(bVar, iVar3, sVar, 48);
            int iHashCode4 = Long.hashCode(sVar.T);
            q1 q1VarL4 = sVar.l();
            z1.r rVarC4 = z1.a.c(sVar, oVar);
            sVar.h0();
            if (sVar.S) {
                iVar2 = iVar5;
                sVar.k(iVar2);
            } else {
                iVar2 = iVar5;
                sVar.r0();
            }
            l1.t.J(hVar3, a2VarA4, sVar);
            l1.t.J(hVar4, q1VarL4, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode4))) {
                hVar2 = hVar7;
                defpackage.e.A(iHashCode4, sVar, iHashCode4, hVar2);
            } else {
                hVar2 = hVar7;
            }
            l1.t.J(hVar6, rVarC4, sVar);
            y2.h hVar8 = hVar2;
            y2.i iVar6 = iVar2;
            ua.b(defpackage.e.m(ub.a.e0(sVar, R.string.time_left), ":"), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar.j(d0Var), g2.f0.e(4289440683L), j3.A(12), sVar2, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), sVar, 0, 0, 65534);
            j0.c.g(sVar, j0.e2.s(oVar, f5));
            a2 a2VarA5 = z1.a(bVar, iVar3, sVar, 48);
            int iHashCode5 = Long.hashCode(sVar.T);
            q1 q1VarL5 = sVar.l();
            z1.r rVarC5 = z1.a.c(sVar, oVar);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar6);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar3, a2VarA5, sVar);
            l1.t.J(hVar4, q1VarL5, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode5))) {
                defpackage.e.A(iHashCode5, sVar, iHashCode5, hVar8);
            }
            l1.t.J(hVar6, rVarC5, sVar);
            str2 = str;
            ua.b(str2, j0.c.E(oVar, f11, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar.j(d0Var), g2.f0.e(4294939923L), j3.A(14), sVar3, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), sVar, ((i13 >> 3) & 14) | 48, 0, 65532);
            sVar = sVar;
            com.google.android.material.datepicker.d.B(sVar, true, true, true);
            rVar2 = oVar;
        } else {
            sVar.W();
            rVar2 = rVar;
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new u0(i11, str2, rVar2, i12);
        }
    }

    /* JADX WARN: Code duplicated, block: B:106:0x0357  */
    /* JADX WARN: Code duplicated, block: B:107:0x036b  */
    /* JADX WARN: Code duplicated, block: B:122:0x03bc  */
    /* JADX WARN: Code duplicated, block: B:124:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:125:0x03dc  */
    /* JADX WARN: Code duplicated, block: B:128:0x03f0  */
    /* JADX WARN: Code duplicated, block: B:131:0x0403  */
    /* JADX WARN: Code duplicated, block: B:136:0x043f  */
    /* JADX WARN: Code duplicated, block: B:137:0x0443  */
    /* JADX WARN: Code duplicated, block: B:142:0x045e  */
    /* JADX WARN: Code duplicated, block: B:147:0x049e  */
    /* JADX WARN: Code duplicated, block: B:148:0x04d2  */
    /* JADX WARN: Instruction removed from duplicated block: B:128:0x03f0, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v28 */
    /* JADX WARN: Type inference failed for: r10v29 */
    /* JADX WARN: Type inference failed for: r10v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r10v32 */
    /* JADX WARN: Type inference failed for: r10v90 */
    /* JADX WARN: Type inference failed for: r10v91 */
    /* JADX WARN: Type inference failed for: r15v15, types: [l1.s] */
    /* JADX WARN: Type inference failed for: r15v17, types: [l1.s] */
    /* JADX WARN: Type inference failed for: r15v2, types: [l1.s] */
    /* JADX WARN: Type inference failed for: r15v20 */
    /* JADX WARN: Type inference failed for: r15v21 */
    /* JADX WARN: Type inference failed for: r15v22 */
    /* JADX WARN: Type inference failed for: r15v23 */
    /* JADX WARN: Type inference failed for: r15v26 */
    /* JADX WARN: Type inference failed for: r15v27 */
    /* JADX WARN: Type inference failed for: r15v9, types: [l1.s] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v30 */
    public static final void g(String avatarUrl, String nickName, c cVar, boolean z11, int i11, z1.r rVar, l1.n nVar, int i12) {
        ?? r15;
        y2.h hVar;
        y2.h hVar2;
        y2.h hVar3;
        j0.r rVar2;
        xt.u uVar;
        z1.j jVar;
        y2.i iVar;
        ?? r9;
        y2.h hVar4;
        l1.s sVar;
        boolean z12;
        l1.s sVar2;
        ?? r11;
        boolean z13;
        ?? r16;
        ?? r12;
        l1.g gVar;
        int iIntValue;
        int i13;
        xt.u uVar2;
        boolean z14;
        int i14;
        boolean zD;
        Object objQ;
        int iA;
        boolean z15;
        int i15;
        float f5;
        int iHashCode;
        l1.s sVar3;
        boolean z16;
        l1.s sVar4;
        ?? r17;
        z1.j jVar2 = z1.c.f58464b;
        kotlin.jvm.internal.m.f(avatarUrl, "avatarUrl");
        kotlin.jvm.internal.m.f(nickName, "nickName");
        l1.s sVar5 = (l1.s) nVar;
        sVar5.f0(273025689);
        int i16 = (sVar5.f(avatarUrl) ? 4 : 2) | i12 | (sVar5.f(nickName) ? 32 : 16) | (sVar5.f(cVar) ? 256 : 128);
        if ((i12 & 3072) == 0) {
            i16 |= sVar5.g(z11) ? 2048 : 1024;
        }
        if ((i12 & 24576) == 0) {
            i16 |= sVar5.d(i11) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE;
        }
        if ((196608 & i12) == 0) {
            i16 |= sVar5.f(rVar) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536;
        }
        if (sVar5.T(i16 & 1, (74899 & i16) != 74898)) {
            e20.a aVarC = w4.c.c(sVar5, -1168520582, sVar5, -1633490746);
            boolean zF = sVar5.f(null) | sVar5.f(aVarC);
            Object objQ2 = sVar5.Q();
            l1.g gVar2 = l1.m.f39353a;
            if (zF || objQ2 == gVar2) {
                objQ2 = w4.c.e(xt.u.class, aVarC, null, null, sVar5);
            }
            sVar5.p(false);
            sVar5.p(false);
            xt.u uVar3 = (xt.u) objQ2;
            z1.j jVar3 = z1.c.f58463a;
            q0 q0VarD = j0.o.d(jVar3, false);
            int iHashCode2 = Long.hashCode(sVar5.T);
            q1 q1VarL = sVar5.l();
            z1.r rVarC = z1.a.c(sVar5, rVar);
            y2.k.J.getClass();
            y2.i iVar2 = y2.j.f56913b;
            sVar5.h0();
            if (sVar5.S) {
                sVar5.k(iVar2);
            } else {
                sVar5.r0();
            }
            y2.h hVar5 = y2.j.f56917f;
            l1.t.J(hVar5, q0VarD, sVar5);
            y2.h hVar6 = y2.j.f56916e;
            l1.t.J(hVar6, q1VarL, sVar5);
            y2.h hVar7 = y2.j.f56918g;
            if (sVar5.S || !kotlin.jvm.internal.m.a(sVar5.Q(), Integer.valueOf(iHashCode2))) {
                defpackage.e.A(iHashCode2, sVar5, iHashCode2, hVar7);
            }
            y2.h hVar8 = y2.j.f56915d;
            l1.t.J(hVar8, rVarC, sVar5);
            boolean zEquals = avatarUrl.equals("null");
            z1.o oVar = z1.o.f58481a;
            j0.r rVar3 = j0.r.f35391a;
            if (zEquals || oz.q.i1(avatarUrl).toString().length() <= 0) {
                hVar = hVar6;
                hVar2 = hVar7;
                hVar3 = hVar5;
                rVar2 = rVar3;
                uVar = uVar3;
                jVar = jVar3;
                iVar = iVar2;
                r9 = 0;
                sVar5.d0(-1807408176);
                z1.r rVarN = j0.e2.n(oVar, i11);
                r0.e eVar = r0.f.f48733a;
                z1.r rVarA = rVar2.a(d2.h.b(d0.n.h(rVarN, ((s1) sVar5.j(h1.v1.f31180a)).f31017a, eVar), eVar), jVar2);
                q0 q0VarD2 = j0.o.d(z1.c.f58467e, false);
                int iHashCode3 = Long.hashCode(sVar5.T);
                q1 q1VarL2 = sVar5.l();
                z1.r rVarC2 = z1.a.c(sVar5, rVarA);
                sVar5.h0();
                if (sVar5.S) {
                    sVar5.k(iVar);
                } else {
                    sVar5.r0();
                }
                l1.t.J(hVar3, q0VarD2, sVar5);
                l1.t.J(hVar, q1VarL2, sVar5);
                if (sVar5.S || !kotlin.jvm.internal.m.a(sVar5.Q(), Integer.valueOf(iHashCode3))) {
                    defpackage.e.A(iHashCode3, sVar5, iHashCode3, hVar2);
                }
                l1.t.J(hVar8, rVarC2, sVar5);
                if (nickName.length() > 0) {
                    sVar5.d0(-515061295);
                    hVar4 = hVar8;
                    ua.b(String.valueOf(oz.q.C0(nickName)), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar5.j(ua.f31167a), g2.x.f28618e, j3.A(20), n3.s.N, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), sVar5, 0, 0, 65534);
                    l1.s sVar6 = sVar5;
                    sVar6.p(false);
                    sVar = sVar6;
                } else {
                    hVar4 = hVar8;
                    sVar5.d0(-514672369);
                    d0.n.c(se.k.y(R.drawable.ep_me_avaster_active, sVar5, 0), null, null, null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar5, 48, 124);
                    l1.s sVar7 = sVar5;
                    sVar7.p(false);
                    sVar = sVar7;
                }
                z12 = true;
                sVar.p(true);
                sVar.p(false);
                sVar2 = sVar;
            } else {
                sVar5.d0(-1808292482);
                String strConcat = oz.x.s0(avatarUrl, "http", false) ? avatarUrl : null;
                if (strConcat == null) {
                    strConcat = "https://lingodeer.oss-us-west-1.aliyuncs.com/uimage/".concat(avatarUrl);
                }
                k2.b bVarY = se.k.y(R.drawable.ep_me_avaster_active, sVar5, 0);
                z1.r rVarN2 = j0.e2.n(oVar, i11);
                r0.e eVar2 = r0.f.f48733a;
                z1.r rVarA2 = rVar3.a(d2.h.b(d0.n.h(rVarN2, g2.x.f28621h, eVar2), eVar2), jVar2);
                d0.v vVarA = d0.n.a(((s1) sVar5.j(h1.v1.f31180a)).f31017a, su.a.f51781a);
                hVar3 = hVar5;
                jVar = jVar3;
                rVar2 = rVar3;
                hVar2 = hVar7;
                iVar = iVar2;
                hVar = hVar6;
                uVar = uVar3;
                r9 = 0;
                wb.k.b(strConcat, null, d0.n.k(vVarA.f22811a, vVarA.f22812b, eVar2, rVarA2), bVarY, null, w2.i.f54517d, sVar5, 48, 64496);
                sVar5.p(false);
                hVar4 = hVar8;
                z12 = true;
                sVar2 = sVar5;
            }
            if (cVar == null && z11) {
                sVar2.d0(-1806350208);
                float f11 = i11;
                float f12 = 0.625f * f11;
                l1.s sVar8 = sVar2;
                d0.n.c(se.k.y(R.drawable.leaderboard_emoji_empty, sVar2, r9), null, d2.h.i(j0.c.y(j0.e2.p(rVar2.a(oVar, jVar), f12, f11 * 0.65625f), f12, CropImageView.DEFAULT_ASPECT_RATIO, 2), iu.k.p(sVar2), 1.0f), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar8, 48, 120);
                ?? r18 = sVar8;
                r18.p(r9);
                z13 = z12;
                r17 = r18;
            } else {
                z1.j jVar4 = jVar;
                boolean z17 = z12;
                if (cVar != null) {
                    int i17 = cVar.f48350b;
                    int i18 = cVar.f48351c;
                    int i19 = cVar.f48349a;
                    if (i19 != -1) {
                        sVar2.d0(-1805529731);
                        boolean zD2 = sVar2.d(i19);
                        Object objQ3 = sVar2.Q();
                        if (zD2) {
                            gVar = r19;
                        } else {
                            gVar = gVar2;
                            if (objQ3 == gVar) {
                            }
                            iIntValue = ((Number) objQ3).intValue();
                            if (i18 != 0) {
                                i13 = i17;
                                sVar2.d0(-1805306438);
                                z14 = false;
                                sVar2.p(false);
                                i14 = i18;
                                uVar2 = uVar;
                            } else {
                                i13 = i17;
                                if (1 <= iIntValue || iIntValue >= 7) {
                                    uVar2 = uVar;
                                    z14 = false;
                                    sVar2.d0(-1804879506);
                                    sVar2.p(false);
                                    i14 = 0;
                                } else {
                                    sVar2.d0(-1805177664);
                                    boolean zD3 = sVar2.d(iIntValue);
                                    Object objQ4 = sVar2.Q();
                                    if (zD3 || objQ4 == gVar) {
                                        uVar2 = uVar;
                                        int iB = uVar2.b("leaderboard_emoji_" + iIntValue);
                                        if (iB == 0) {
                                            iB = uVar2.b("leaderboard_emoji_6");
                                        }
                                        objQ4 = Integer.valueOf(iB);
                                        sVar2.o0(objQ4);
                                    } else {
                                        uVar2 = uVar;
                                    }
                                    int iIntValue2 = ((Number) objQ4).intValue();
                                    z14 = false;
                                    sVar2.p(false);
                                    i14 = iIntValue2;
                                }
                            }
                            if (i13 != 0) {
                                sVar2.d0(-1804769642);
                                sVar2.p(z14);
                                z15 = z14;
                                i15 = i13;
                            } else {
                                sVar2.d0(-1804699489);
                                zD = sVar2.d(iIntValue);
                                objQ = sVar2.Q();
                                if (zD || objQ == gVar) {
                                    iA = uVar2.a("leaderboard_emoji_" + iIntValue);
                                    if (iA == 0) {
                                        iA = uVar2.a("leaderboard_emoji_6");
                                    }
                                    objQ = Integer.valueOf(iA);
                                    sVar2.o0(objQ);
                                }
                                int iIntValue3 = ((Number) objQ).intValue();
                                z15 = false;
                                sVar2.p(false);
                                i15 = iIntValue3;
                            }
                            f5 = i11;
                            float f13 = f5 * 0.625f;
                            z1.r rVarY = j0.c.y(rVar2.a(oVar, jVar4), f13, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                            q0 q0VarD3 = j0.o.d(jVar2, z15);
                            iHashCode = Long.hashCode(sVar2.T);
                            q1 q1VarL3 = sVar2.l();
                            z1.r rVarC3 = z1.a.c(sVar2, rVarY);
                            sVar2.h0();
                            if (sVar2.S) {
                                sVar2.k(iVar);
                            } else {
                                sVar2.r0();
                            }
                            l1.t.J(hVar3, q0VarD3, sVar2);
                            l1.t.J(hVar, q1VarL3, sVar2);
                            if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode))) {
                                defpackage.e.A(iHashCode, sVar2, iHashCode, hVar2);
                            }
                            l1.t.J(hVar4, rVarC3, sVar2);
                            l1.s sVar9 = sVar2;
                            z13 = true;
                            d0.n.c(se.k.y(R.drawable.leaderboard_emoji_bg, sVar2, 0), null, d2.h.i(j0.e2.p(oVar, f13, f5 * 0.65625f), iu.k.p(sVar2), 1.0f), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar9, 48, 120);
                            sVar3 = sVar9;
                            if (i14 != 0) {
                                sVar3.d0(262014967);
                                tv.g.a(d2.h.b(j0.e2.n(j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, f5 * 0.0625f, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), f5 * 0.515f), r0.f.f48733a), i14, null, null, false, null, sVar3, 196608, 92);
                                z16 = false;
                                sVar3.p(false);
                                sVar4 = sVar3;
                            } else {
                                sVar3.d0(262585243);
                                d0.n.c(se.k.y(i15, sVar3, 0), null, d2.h.b(j0.e2.n(j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, f5 * 0.0625f, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), f5 * 0.515f), r0.f.f48733a), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar3, 48, 120);
                                l1.s sVar10 = sVar3;
                                z16 = false;
                                sVar10.p(false);
                                sVar4 = sVar10;
                            }
                            sVar4.p(true);
                            r12 = z16;
                            r16 = sVar4;
                        }
                        if (1 > i19 || i19 >= 11) {
                            i19 = 6;
                        }
                        objQ3 = Integer.valueOf(i19);
                        sVar2.o0(objQ3);
                        iIntValue = ((Number) objQ3).intValue();
                        if (i18 != 0) {
                            i13 = i17;
                            sVar2.d0(-1805306438);
                            z14 = false;
                            sVar2.p(false);
                            i14 = i18;
                            uVar2 = uVar;
                        } else {
                            i13 = i17;
                            if (1 <= iIntValue) {
                                uVar2 = uVar;
                                z14 = false;
                                sVar2.d0(-1804879506);
                                sVar2.p(false);
                                i14 = 0;
                            } else {
                                uVar2 = uVar;
                                z14 = false;
                                sVar2.d0(-1804879506);
                                sVar2.p(false);
                                i14 = 0;
                            }
                        }
                        if (i13 != 0) {
                            sVar2.d0(-1804769642);
                            sVar2.p(z14);
                            z15 = z14;
                            i15 = i13;
                        } else {
                            sVar2.d0(-1804699489);
                            zD = sVar2.d(iIntValue);
                            objQ = sVar2.Q();
                            if (zD) {
                                iA = uVar2.a("leaderboard_emoji_" + iIntValue);
                                if (iA == 0) {
                                    iA = uVar2.a("leaderboard_emoji_6");
                                }
                                objQ = Integer.valueOf(iA);
                                sVar2.o0(objQ);
                            } else {
                                iA = uVar2.a("leaderboard_emoji_" + iIntValue);
                                if (iA == 0) {
                                    iA = uVar2.a("leaderboard_emoji_6");
                                }
                                objQ = Integer.valueOf(iA);
                                sVar2.o0(objQ);
                            }
                            int iIntValue4 = ((Number) objQ).intValue();
                            z15 = false;
                            sVar2.p(false);
                            i15 = iIntValue4;
                        }
                        f5 = i11;
                        float f14 = f5 * 0.625f;
                        z1.r rVarY2 = j0.c.y(rVar2.a(oVar, jVar4), f14, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                        q0 q0VarD4 = j0.o.d(jVar2, z15);
                        iHashCode = Long.hashCode(sVar2.T);
                        q1 q1VarL4 = sVar2.l();
                        z1.r rVarC4 = z1.a.c(sVar2, rVarY2);
                        sVar2.h0();
                        if (sVar2.S) {
                            sVar2.k(iVar);
                        } else {
                            sVar2.r0();
                        }
                        l1.t.J(hVar3, q0VarD4, sVar2);
                        l1.t.J(hVar, q1VarL4, sVar2);
                        if (sVar2.S) {
                            defpackage.e.A(iHashCode, sVar2, iHashCode, hVar2);
                        } else {
                            defpackage.e.A(iHashCode, sVar2, iHashCode, hVar2);
                        }
                        l1.t.J(hVar4, rVarC4, sVar2);
                        l1.s sVar11 = sVar2;
                        z13 = true;
                        d0.n.c(se.k.y(R.drawable.leaderboard_emoji_bg, sVar2, 0), null, d2.h.i(j0.e2.p(oVar, f14, f5 * 0.65625f), iu.k.p(sVar2), 1.0f), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar11, 48, 120);
                        sVar3 = sVar11;
                        if (i14 != 0) {
                            sVar3.d0(262014967);
                            tv.g.a(d2.h.b(j0.e2.n(j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, f5 * 0.0625f, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), f5 * 0.515f), r0.f.f48733a), i14, null, null, false, null, sVar3, 196608, 92);
                            z16 = false;
                            sVar3.p(false);
                            sVar4 = sVar3;
                        } else {
                            sVar3.d0(262585243);
                            d0.n.c(se.k.y(i15, sVar3, 0), null, d2.h.b(j0.e2.n(j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, f5 * 0.0625f, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), f5 * 0.515f), r0.f.f48733a), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar3, 48, 120);
                            l1.s sVar12 = sVar3;
                            z16 = false;
                            sVar12.p(false);
                            sVar4 = sVar12;
                        }
                        sVar4.p(true);
                        r12 = z16;
                        r16 = sVar4;
                    } else {
                        r11 = 0;
                    }
                    r16.p(r12);
                    r17 = r16;
                } else {
                    r11 = r9;
                }
                z13 = z17;
                sVar2.d0(-1822485553);
                r12 = r11;
                r16 = sVar2;
                r16.p(r12);
                r17 = r16;
            }
            r17.p(z13);
            r15 = r17;
        } else {
            sVar5.W();
            r15 = sVar5;
        }
        x1 x1VarT = r15.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new lh.b(avatarUrl, nickName, cVar, z11, i11, rVar, i12);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r7v34 */
    /* JADX WARN: Type inference failed for: r9v1, types: [l1.s] */
    /* JADX WARN: Type inference failed for: r9v10, types: [l1.s] */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19 */
    public static final void h(LeaderBoardUser leaderBoardUser, z1.r rVar, fz.c cVar, fz.c cVar2, l1.n nVar, int i11) {
        int i12;
        ?? r9;
        ?? r11;
        l1.s sVar;
        ?? r12;
        Object obj;
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(-6580461);
        if ((i11 & 6) == 0) {
            i12 = (sVar2.h(leaderBoardUser) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar2.f(rVar) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= sVar2.h(cVar) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar2.h(cVar2) ? 2048 : 1024;
        }
        if (sVar2.T(i12 & 1, (i12 & 1171) != 1170)) {
            a2 a2VarA = z1.a(j0.i.f35303a, z1.c.M, sVar2, 48);
            int iHashCode = Long.hashCode(sVar2.T);
            q1 q1VarL = sVar2.l();
            z1.r rVarC = z1.a.c(sVar2, rVar);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar2.h0();
            if (sVar2.S) {
                sVar2.k(iVar);
            } else {
                sVar2.r0();
            }
            l1.t.J(y2.j.f56917f, a2VarA, sVar2);
            l1.t.J(y2.j.f56916e, q1VarL, sVar2);
            y2.h hVar = y2.j.f56918g;
            if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar2, iHashCode, hVar);
            }
            l1.t.J(y2.j.f56915d, rVarC, sVar2);
            boolean zK0 = oz.q.K0(leaderBoardUser.getImageName());
            z1.o oVar = z1.o.f58481a;
            if (zK0 || kotlin.jvm.internal.m.a(leaderBoardUser.getImageName(), "null")) {
                sVar2.d0(1696706522);
                k2.b bVarY = se.k.y(R.drawable.ep_me_avaster_active, sVar2, 0);
                z1.r rVarN = j0.e2.n(oVar, 42);
                long j11 = g2.x.f28621h;
                r0.e eVar = r0.f.f48733a;
                z1.r rVarB = d2.h.b(d0.n.h(rVarN, j11, eVar), eVar);
                d0.v vVarA = d0.n.a(g2.f0.e(4292335575L), 2);
                r11 = 0;
                d0.n.c(bVarY, null, d0.n.k(vVarA.f22811a, vVarA.f22812b, eVar, rVarB), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar2, 48, 120);
                sVar = sVar2;
                sVar.p(false);
            } else {
                sVar2.d0(1696089994);
                String imageName = leaderBoardUser.getImageName();
                if (!oz.x.s0(imageName, "http", false)) {
                    imageName = null;
                }
                if (imageName == null) {
                    imageName = ep.a.e("https://lingodeer.oss-us-west-1.aliyuncs.com/uimage/", leaderBoardUser.getImageName());
                }
                z1.r rVarN2 = j0.e2.n(oVar, 42);
                long j12 = g2.x.f28621h;
                r0.e eVar2 = r0.f.f48733a;
                z1.r rVarB2 = d2.h.b(d0.n.h(rVarN2, j12, eVar2), eVar2);
                d0.v vVarA2 = d0.n.a(g2.f0.e(4292335575L), 2);
                sVar = sVar2;
                wb.k.c(imageName, d0.n.k(vVarA2.f22811a, vVarA2.f22812b, eVar2, rVarB2), null, sVar, 48, 4088);
                sVar.p(false);
                r11 = 0;
            }
            String nickName = leaderBoardUser.getNickName();
            y0 y0VarA = y0.a((y0) sVar.j(ua.f31167a), 0L, j3.A(14), n3.s.N, null, null, 0L, null, null, 0, 0, 0L, null, 16777209);
            z1.r rVarE = j0.c.E(oVar, 16, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14);
            if (1.0f <= 0.0d) {
                k0.a.a("invalid weight; must be greater than zero");
            }
            l1.s sVar3 = sVar;
            ua.b(nickName, w4.c.p(1.0f, true, rVarE), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0VarA, sVar3, 0, 0, 65532);
            l1.s sVar4 = sVar3;
            if (leaderBoardUser.isMe()) {
                sVar4.d0(1686074483);
                r12 = sVar4;
            } else {
                sVar4.d0(1697585124);
                k2.b bVarY2 = se.k.y(leaderBoardUser.isFriend() ? R.drawable.ic_friend_added : R.drawable.ic_add_friend, sVar4, r11);
                z1.r rVarP = j0.e2.p(j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 20, CropImageView.DEFAULT_ASPECT_RATIO, 11), 37, 23);
                int i13 = ((i12 & 896) == 256 ? 1 : r11) | (sVar4.h(leaderBoardUser) ? 1 : 0) | ((i12 & 7168) == 2048 ? 1 : r11);
                Object objQ = sVar4.Q();
                if (i13 != 0 || objQ == l1.m.f39353a) {
                    obj = objQ;
                    x xVar = new x(leaderBoardUser, cVar2, cVar, 0);
                    sVar4.o0(xVar);
                    obj = xVar;
                }
                obj = objQ;
                d0.n.c(bVarY2, "add friend", iu.k.q(6, 7, (fz.a) obj, sVar4, rVarP, false), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar4, 48, 120);
                r12 = sVar4;
            }
            r12.p(r11);
            r12.p(true);
            r9 = r12;
        } else {
            l1.s sVar5 = sVar2;
            sVar5.W();
            r9 = sVar5;
        }
        x1 x1VarT = r9.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new cs.a(leaderBoardUser, rVar, cVar, cVar2, i11, 15);
        }
    }

    public static final void i(LeaderBoardUser leaderBoardUser, final e0 e0Var, l1.n nVar, int i11) {
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-1393790399);
        int i12 = (sVar.h(leaderBoardUser) ? 4 : 2) | i11 | 16;
        if (sVar.T(i12 & 1, (i12 & 19) != 18)) {
            sVar.Y();
            if ((i11 & 1) == 0 || sVar.C()) {
                sVar.d0(-1614864554);
                ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(sVar, LocalViewModelStoreOwner.$stable);
                if (current == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                ViewModel viewModelA = i20.b.a(z.a(e0.class), current.getViewModelStore(), null, i20.a.a(current), null, q10.b.a(sVar), null);
                sVar.p(false);
                e0Var = (e0) viewModelA;
            } else {
                sVar.W();
            }
            sVar.q();
            b1 b1VarO = l1.t.o(e0Var.f52561f, sVar);
            String uid = leaderBoardUser.getUid();
            boolean zH = sVar.h(e0Var) | sVar.h(leaderBoardUser);
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (zH || objQ == gVar) {
                objQ = new nu.b(1, e0Var, leaderBoardUser, null);
                sVar.o0(objQ);
            }
            l1.t.f((fz.e) objQ, uid, sVar);
            String uid2 = leaderBoardUser.getUid();
            boolean zH2 = sVar.h(e0Var);
            Object objQ2 = sVar.Q();
            if (zH2 || objQ2 == gVar) {
                final int i13 = 0;
                objQ2 = new fz.c() { // from class: qu.w
                    @Override // fz.c
                    public final Object invoke(Object obj) {
                        switch (i13) {
                            case 0:
                                j0 DisposableEffect = (j0) obj;
                                kotlin.jvm.internal.m.f(DisposableEffect, "$this$DisposableEffect");
                                return new j1(e0Var, 11);
                            case 1:
                                LeaderBoardUser it = (LeaderBoardUser) obj;
                                kotlin.jvm.internal.m.f(it, "it");
                                e0Var.a(new tu.u(it));
                                return b0.f48488a;
                            default:
                                LeaderBoardUser it2 = (LeaderBoardUser) obj;
                                kotlin.jvm.internal.m.f(it2, "it");
                                e0Var.a(new tu.x(it2));
                                return b0.f48488a;
                        }
                    }
                };
                sVar.o0(objQ2);
            }
            l1.t.c(uid2, (fz.c) objQ2, sVar);
            tu.b0 b0Var = (tu.b0) b1VarO.getValue();
            boolean zH3 = sVar.h(e0Var);
            Object objQ3 = sVar.Q();
            if (zH3 || objQ3 == gVar) {
                final int i14 = 1;
                objQ3 = new fz.c() { // from class: qu.w
                    @Override // fz.c
                    public final Object invoke(Object obj) {
                        switch (i14) {
                            case 0:
                                j0 DisposableEffect = (j0) obj;
                                kotlin.jvm.internal.m.f(DisposableEffect, "$this$DisposableEffect");
                                return new j1(e0Var, 11);
                            case 1:
                                LeaderBoardUser it = (LeaderBoardUser) obj;
                                kotlin.jvm.internal.m.f(it, "it");
                                e0Var.a(new tu.u(it));
                                return b0.f48488a;
                            default:
                                LeaderBoardUser it2 = (LeaderBoardUser) obj;
                                kotlin.jvm.internal.m.f(it2, "it");
                                e0Var.a(new tu.x(it2));
                                return b0.f48488a;
                        }
                    }
                };
                sVar.o0(objQ3);
            }
            fz.c cVar = (fz.c) objQ3;
            boolean zH4 = sVar.h(e0Var);
            Object objQ4 = sVar.Q();
            if (zH4 || objQ4 == gVar) {
                final int i15 = 2;
                objQ4 = new fz.c() { // from class: qu.w
                    @Override // fz.c
                    public final Object invoke(Object obj) {
                        switch (i15) {
                            case 0:
                                j0 DisposableEffect = (j0) obj;
                                kotlin.jvm.internal.m.f(DisposableEffect, "$this$DisposableEffect");
                                return new j1(e0Var, 11);
                            case 1:
                                LeaderBoardUser it = (LeaderBoardUser) obj;
                                kotlin.jvm.internal.m.f(it, "it");
                                e0Var.a(new tu.u(it));
                                return b0.f48488a;
                            default:
                                LeaderBoardUser it2 = (LeaderBoardUser) obj;
                                kotlin.jvm.internal.m.f(it2, "it");
                                e0Var.a(new tu.x(it2));
                                return b0.f48488a;
                        }
                    }
                };
                sVar.o0(objQ4);
            }
            j(b0Var, cVar, (fz.c) objQ4, sVar, 0);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new y(leaderBoardUser, i11, 5, e0Var);
        }
    }

    public static final void j(tu.b0 uiStatus, fz.c follow, fz.c unFollow, l1.n nVar, int i11) {
        y2.i iVar;
        y2.h hVar;
        int i12;
        boolean z11;
        boolean z12;
        kotlin.jvm.internal.m.f(uiStatus, "uiStatus");
        kotlin.jvm.internal.m.f(follow, "follow");
        kotlin.jvm.internal.m.f(unFollow, "unFollow");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(457176082);
        int i13 = i11 | (sVar.f(uiStatus) ? 4 : 2) | (sVar.h(follow) ? 32 : 16) | (sVar.h(unFollow) ? 256 : 128);
        if (sVar.T(i13 & 1, (i13 & 147) != 146)) {
            z1.o oVar = z1.o.f58481a;
            z1.r rVarC = j0.e2.c(j0.c.v(oVar), 0.9f);
            j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            z1.r rVarC2 = z1.a.c(sVar, rVarC);
            y2.k.J.getClass();
            y2.i iVar2 = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar2);
            } else {
                sVar.r0();
            }
            y2.h hVar2 = y2.j.f56917f;
            l1.t.J(hVar2, uVarA, sVar);
            y2.h hVar3 = y2.j.f56916e;
            l1.t.J(hVar3, q1VarL, sVar);
            y2.h hVar4 = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar4);
            }
            y2.h hVar5 = y2.j.f56915d;
            l1.t.J(hVar5, rVarC2, sVar);
            if (uiStatus.equals(tu.z.f52631a)) {
                sVar.d0(730306315);
                tv.a.d(0, 1, sVar, null);
                sVar.p(false);
                z11 = true;
            } else {
                if (!(uiStatus instanceof a0)) {
                    throw nv.p.x(sVar, 730310389, false);
                }
                sVar.d0(1164922694);
                a0 a0Var = (a0) uiStatus;
                ArrayList arrayList = a0Var.f52540b;
                LeaderBoardUser leaderBoardUser = a0Var.f52539a;
                float f5 = 22;
                int i14 = i13 << 3;
                h(leaderBoardUser, j0.c.C(oVar, f5, CropImageView.DEFAULT_ASPECT_RATIO, 2), follow, unFollow, sVar, (i14 & 896) | 48 | (i14 & 7168));
                String strE0 = ub.a.e0(sVar, R.string.statistics);
                d0 d0Var = ua.f31167a;
                y0 y0Var = (y0) sVar.j(d0Var);
                long jA = j3.A(14);
                n3.s sVar2 = n3.s.L;
                float f11 = 20;
                ua.b(strE0, j0.c.E(oVar, f5, f11, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 12), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a(y0Var, 0L, jA, sVar2, null, null, 0L, null, null, 0, 0, 0L, null, 16777209), sVar, 0, 0, 65532);
                float f12 = 14;
                z1.r rVarC3 = j0.c.C(j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, f12, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), f5, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                long j11 = g2.x.f28621h;
                z1.r rVarH = d0.n.h(rVarC3, j11, r0.f.d(f12));
                float f13 = (float) 1.5d;
                d0.v vVarA = d0.n.a(g2.f0.e(4292335575L), f13);
                z1.r rVarK = d0.n.k(vVarA.f22811a, vVarA.f22812b, r0.f.d(f12), rVarH);
                z1.i iVar3 = z1.c.M;
                j0.b bVar = j0.i.f35303a;
                a2 a2VarA = z1.a(bVar, iVar3, sVar, 48);
                int iHashCode2 = Long.hashCode(sVar.T);
                q1 q1VarL2 = sVar.l();
                z1.r rVarC4 = z1.a.c(sVar, rVarK);
                sVar.h0();
                if (sVar.S) {
                    iVar = iVar2;
                    sVar.k(iVar);
                } else {
                    iVar = iVar2;
                    sVar.r0();
                }
                l1.t.J(hVar2, a2VarA, sVar);
                l1.t.J(hVar3, q1VarL2, sVar);
                if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                    hVar = hVar4;
                    defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar);
                } else {
                    hVar = hVar4;
                }
                l1.t.J(hVar5, rVarC4, sVar);
                tv.a.h(R.drawable.ep_me_daystreak, String.valueOf(leaderBoardUser.getDayStreak()), ub.a.e0(sVar, R.string.day_streak), null, sVar, 196614);
                float f14 = 1;
                float f15 = 50;
                z1.r rVarG = j0.e2.g(j0.e2.s(oVar, f14), f15);
                long jE = g2.f0.e(4292270304L);
                r0 r0Var = g2.f0.f28556b;
                j0.c.g(sVar, d0.n.h(rVarG, jE, r0Var));
                if (leaderBoardUser.getRank() >= 1 && leaderBoardUser.getGroup().length() > 0 && leaderBoardUser.getTotalXP() > 0) {
                    String group = leaderBoardUser.getGroup();
                    int iHashCode3 = group.hashCode();
                    i12 = R.drawable.lb_group_a_small;
                    switch (iHashCode3) {
                        case 2020897257:
                            group.equals(AchievementLeaderBoardType.LEADERBOARD_CLASS_A);
                            break;
                        case 2020897258:
                            if (group.equals(AchievementLeaderBoardType.LEADERBOARD_CLASS_B)) {
                                i12 = R.drawable.lb_group_b_small;
                            }
                            break;
                        case 2020897259:
                            if (group.equals(AchievementLeaderBoardType.LEADERBOARD_CLASS_C)) {
                                i12 = R.drawable.lb_group_c_small;
                            }
                            break;
                        case 2020897260:
                            if (group.equals(AchievementLeaderBoardType.LEADERBOARD_CLASS_D)) {
                                i12 = R.drawable.lb_group_d_small;
                            }
                            break;
                        case 2020897261:
                            if (group.equals(AchievementLeaderBoardType.LEADERBOARD_CLASS_E)) {
                                i12 = R.drawable.lb_group_e_small;
                            }
                            break;
                        case 2020897262:
                            if (group.equals(AchievementLeaderBoardType.LEADERBOARD_CLASS_F)) {
                                i12 = R.drawable.lb_group_f_small;
                            }
                            break;
                    }
                } else {
                    i12 = R.drawable.ep_me_leaderboard;
                }
                tv.a.h(i12, (leaderBoardUser.getRank() < 1 || leaderBoardUser.getTotalXP() <= 0) ? "-" : String.valueOf(leaderBoardUser.getRank()), ub.a.e0(sVar, R.string.ranking), null, sVar, 196614);
                sVar.p(true);
                z1.r rVarH2 = d0.n.h(j0.c.C(j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, 8, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), f5, CropImageView.DEFAULT_ASPECT_RATIO, 2), j11, r0.f.d(f12));
                d0.v vVarA2 = d0.n.a(g2.f0.e(4292335575L), f13);
                z1.r rVarK2 = d0.n.k(vVarA2.f22811a, vVarA2.f22812b, r0.f.d(f12), rVarH2);
                a2 a2VarA2 = z1.a(bVar, iVar3, sVar, 48);
                int iHashCode4 = Long.hashCode(sVar.T);
                q1 q1VarL3 = sVar.l();
                z1.r rVarC5 = z1.a.c(sVar, rVarK2);
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar);
                } else {
                    sVar.r0();
                }
                l1.t.J(hVar2, a2VarA2, sVar);
                l1.t.J(hVar3, q1VarL3, sVar);
                if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode4))) {
                    defpackage.e.A(iHashCode4, sVar, iHashCode4, hVar);
                }
                l1.t.J(hVar5, rVarC5, sVar);
                tv.a.h(R.drawable.ep_me_xp, String.valueOf(leaderBoardUser.getTotalXP()), ub.a.e0(sVar, R.string.f22253xp), null, sVar, 196614);
                j0.c.g(sVar, d0.n.h(j0.e2.g(j0.e2.s(oVar, f14), f15), g2.f0.e(4292270304L), r0Var));
                tv.a.h(R.drawable.ep_me_history_learntime, ks.f.a(leaderBoardUser.getTotalTime(), false), ub.a.e0(sVar, R.string.total_time), null, sVar, 196614);
                sVar.p(true);
                if (arrayList.isEmpty()) {
                    z11 = true;
                    z12 = false;
                    sVar.d0(1170422063);
                    z1.r rVarD = j0.e2.d(oVar, 1.0f);
                    q0 q0VarD = j0.o.d(z1.c.f58467e, false);
                    int iHashCode5 = Long.hashCode(sVar.T);
                    q1 q1VarL4 = sVar.l();
                    z1.r rVarC6 = z1.a.c(sVar, rVarD);
                    sVar.h0();
                    if (sVar.S) {
                        sVar.k(iVar);
                    } else {
                        sVar.r0();
                    }
                    l1.t.J(hVar2, q0VarD, sVar);
                    l1.t.J(hVar3, q1VarL4, sVar);
                    if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode5))) {
                        defpackage.e.A(iHashCode5, sVar, iHashCode5, hVar);
                    }
                    l1.t.J(hVar5, rVarC6, sVar);
                    d0.n.c(se.k.y(R.drawable.lb_weekly_xp_empty, sVar, 0), null, j0.e2.s(oVar, 192), null, w2.i.f54517d, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar, 25008, 104);
                    sVar = sVar;
                    sVar.p(true);
                    sVar.p(false);
                } else {
                    sVar.d0(1169458769);
                    z11 = true;
                    ua.b(ub.a.e0(sVar, R.string.achievements), j0.c.E(oVar, f5, f11, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 12), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar.j(d0Var), 0L, j3.A(14), sVar2, null, null, 0L, null, null, 0, 0, 0L, null, 16777209), sVar, 0, 0, 65532);
                    ArrayList arrayList2 = a0Var.f52542d;
                    ArrayList arrayList3 = a0Var.f52541c;
                    Object objQ = sVar.Q();
                    l1.g gVar = l1.m.f39353a;
                    if (objQ == gVar) {
                        objQ = new f2(17);
                        sVar.o0(objQ);
                    }
                    fz.c cVar = (fz.c) objQ;
                    Object objQ2 = sVar.Q();
                    if (objQ2 == gVar) {
                        objQ2 = new f2(18);
                        sVar.o0(objQ2);
                    }
                    fz.c cVar2 = (fz.c) objQ2;
                    Object objQ3 = sVar.Q();
                    if (objQ3 == gVar) {
                        objQ3 = new f2(19);
                        sVar.o0(objQ3);
                    }
                    fz.c cVar3 = (fz.c) objQ3;
                    Object objQ4 = sVar.Q();
                    if (objQ4 == gVar) {
                        objQ4 = new f2(20);
                        sVar.o0(objQ4);
                    }
                    fz.c cVar4 = (fz.c) objQ4;
                    Object objQ5 = sVar.Q();
                    if (objQ5 == gVar) {
                        objQ5 = new f2(21);
                        sVar.o0(objQ5);
                    }
                    pr.f0.l(arrayList, arrayList2, arrayList3, true, cVar, cVar2, cVar3, cVar4, (fz.c) objQ5, sVar, 920346630);
                    sVar = sVar;
                    sVar.p(false);
                    z12 = false;
                }
                sVar.p(z12);
            }
            sVar.p(z11);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new k6(uiStatus, follow, false, unFollow, i11, 14);
        }
    }

    public static final void k(int i11, long j11, l1.n nVar, z1.r rVar) {
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1509361251);
        int i12 = (sVar.f(rVar) ? 4 : 2) | i11 | (sVar.e(j11) ? 32 : 16);
        if (sVar.T(i12 & 1, (i12 & 19) != 18)) {
            boolean z11 = (i12 & 112) == 32;
            Object objQ = sVar.Q();
            if (z11 || objQ == l1.m.f39353a) {
                objQ = new au.o(j11, 18);
                sVar.o0(objQ);
            }
            d0.n.b(i12 & 14, (fz.c) objQ, sVar, rVar);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new d2(i11, j11, 1, rVar);
        }
    }
}
