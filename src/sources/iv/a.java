package iv;

import android.content.Context;
import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import bt.g7;
import bt.j4;
import bt.n1;
import bt.x2;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.lingodeer.R;
import com.lingodeer.course.stroke_order_view_new.old.HwView;
import com.lingodeer.data.model.CourseCharacter;
import com.lingodeer.data.model.SyllableLessonStatus;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import dt.n2;
import dt.s2;
import dt.y3;
import fr.j3;
import h1.dc;
import h1.fc;
import h1.k7;
import h1.p7;
import h1.r4;
import h1.s1;
import h1.ua;
import h1.v1;
import h1.x9;
import j0.a2;
import j0.c2;
import j0.e2;
import j0.z1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import l1.c3;
import l1.i1;
import l1.q1;
import l1.x1;
import rt.cb;
import rt.db;
import rt.eb;
import rt.fb;
import rt.gc;
import rt.h9;
import rt.l9;
import rt.pc;
import rt.qc;
import rt.rc;
import rt.y9;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t1.d f34661a = new t1.d(new dt.g(22), false, 368617020);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final t1.d f34662b = new t1.d(new dt.f(28), false, 1548558757);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final t1.d f34663c = new t1.d(new dt.f(29), false, 806716581);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final t1.d f34664d = new t1.d(new dt.g(23), false, 583484860);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final t1.d f34665e = new t1.d(new b(0), false, -1504683755);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final t1.d f34666f = new t1.d(new dt.g(24), false, -658876137);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final t1.d f34667g = new t1.d(new dt.g(25), false, -908383226);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final t1.d f34668h = new t1.d(new dt.g(26), false, -257109269);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final t1.d f34669i = new t1.d(new dt.g(27), false, -1201278622);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final t1.d f34670j = new t1.d(new dt.g(28), false, -1905141597);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final t1.d f34671k = new t1.d(new dt.g(29), false, 717618972);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final t1.d f34672l = new t1.d(new c(0), false, 114512037);

    public static final void A(List list, fz.c playAudio, z1.r rVar, l1.n nVar, int i11, int i12) {
        int i13;
        z1.r rVar2;
        kotlin.jvm.internal.m.f(playAudio, "playAudio");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-1556892898);
        if ((i11 & 6) == 0) {
            i13 = (sVar.h(list) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= sVar.h(playAudio) ? 32 : 16;
        }
        int i14 = i12 & 4;
        if (i14 != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            i13 |= sVar.f(rVar) ? 256 : 128;
        }
        if (sVar.T(i13 & 1, (i13 & 147) != 146)) {
            z1.r rVar3 = i14 != 0 ? z1.o.f58481a : rVar;
            z1.r rVarE = e2.e(rVar3, 1.0f);
            j0.u uVarA = j0.t.a(j0.i.g(8), z1.c.O, sVar, 6);
            int iHashCode = Long.hashCode(sVar.T);
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
            l1.t.J(y2.j.f56917f, uVarA, sVar);
            l1.t.J(y2.j.f56916e, q1VarL, sVar);
            y2.h hVar = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
            }
            Iterator itO = com.google.android.material.datepicker.d.o(sVar, rVarC, y2.j.f56915d, -1047772937, list);
            while (itO.hasNext()) {
                z((kv.x) itO.next(), null, playAudio, sVar, (i13 << 3) & 896);
            }
            sVar.p(false);
            sVar.p(true);
            rVar2 = rVar3;
        } else {
            sVar.W();
            rVar2 = rVar;
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new androidx.lifecycle.compose.d(list, playAudio, rVar2, i11, i12, 3);
        }
    }

    public static final void B(final String title, final String str, final kv.a0 subtitleStyle, l1.n nVar, final int i11) {
        l1.s sVar;
        x1 x1VarT;
        fz.e eVar;
        l1.s sVar2;
        int i12;
        boolean z11;
        kotlin.jvm.internal.m.f(title, "title");
        kotlin.jvm.internal.m.f(subtitleStyle, "subtitleStyle");
        l1.s sVar3 = (l1.s) nVar;
        sVar3.f0(2079768532);
        int i13 = i11 | (sVar3.f(title) ? 4 : 2) | (sVar3.f(str) ? 32 : 16) | (sVar3.d(subtitleStyle.ordinal()) ? 256 : 128);
        if (sVar3.T(i13 & 1, (i13 & 147) != 146)) {
            kv.a0 a0Var = kv.a0.Secondary;
            z1.o oVar = z1.o.f58481a;
            if (subtitleStyle == a0Var) {
                sVar3.d0(-813679393);
                float f5 = j0.f34761a;
                j3.y0 y0Var = ((dc) sVar3.j(fc.f30256a)).f30177j;
                float f11 = j0.f34761a;
                ua.b(title, j0.c.E(oVar, f11, j0.f34762b, f11, CropImageView.DEFAULT_ASPECT_RATIO, 8), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0Var, sVar3, (i13 & 14) | 48, 0, 65532);
                sVar3.p(false);
                x1VarT = sVar3.t();
                if (x1VarT == null) {
                    return;
                }
                final int i14 = 0;
                eVar = new fz.e(title, str, subtitleStyle, i11, i14) { // from class: iv.q0

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ int f34815a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ String f34816b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ String f34817c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    public final /* synthetic */ kv.a0 f34818d;

                    {
                        this.f34815a = i14;
                    }

                    @Override // fz.e
                    public final Object invoke(Object obj, Object obj2) {
                        int i15 = this.f34815a;
                        l1.n nVar2 = (l1.n) obj;
                        ((Integer) obj2).getClass();
                        switch (i15) {
                            case 0:
                                a.B(this.f34816b, this.f34817c, this.f34818d, nVar2, l1.t.M(1));
                                break;
                            default:
                                a.B(this.f34816b, this.f34817c, this.f34818d, nVar2, l1.t.M(1));
                                break;
                        }
                        return qy.b0.f48488a;
                    }
                };
            } else {
                sVar3.d0(-816377106);
                sVar3.p(false);
                z1.r rVarE = e2.e(j0.c.B(oVar, 16, 12), 1.0f);
                a2 a2VarA = z1.a(j0.i.g(6), z1.c.M, sVar3, 54);
                int iHashCode = Long.hashCode(sVar3.T);
                q1 q1VarL = sVar3.l();
                z1.r rVarC = z1.a.c(sVar3, rVarE);
                y2.k.J.getClass();
                y2.i iVar = y2.j.f56913b;
                sVar3.h0();
                if (sVar3.S) {
                    sVar3.k(iVar);
                } else {
                    sVar3.r0();
                }
                l1.t.J(y2.j.f56917f, a2VarA, sVar3);
                l1.t.J(y2.j.f56916e, q1VarL, sVar3);
                y2.h hVar = y2.j.f56918g;
                if (sVar3.S || !kotlin.jvm.internal.m.a(sVar3.Q(), Integer.valueOf(iHashCode))) {
                    defpackage.e.A(iHashCode, sVar3, iHashCode, hVar);
                }
                l1.t.J(y2.j.f56915d, rVarC, sVar3);
                if (str != null) {
                    sVar3.d0(910216987);
                    String strConcat = str.concat(".");
                    j3.y0 y0VarA = j3.y0.a(((dc) sVar3.j(fc.f30256a)).f30175h, ((s1) sVar3.j(v1.f31180a)).f31034q, 0L, n3.s.L, null, null, 0L, null, null, 0, 0, 0L, null, 16777210);
                    i12 = i13;
                    z11 = true;
                    ua.b(strConcat, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0VarA, sVar3, 0, 0, 65534);
                    sVar2 = sVar3;
                } else {
                    sVar2 = sVar3;
                    i12 = i13;
                    z11 = true;
                    sVar2.d0(906865298);
                }
                sVar2.p(false);
                l1.s sVar4 = sVar2;
                ua.b(title, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a(((dc) sVar2.j(fc.f30256a)).f30175h, ((s1) sVar2.j(v1.f31180a)).f31034q, 0L, n3.s.L, null, null, 0L, null, null, 0, 0, 0L, null, 16777210), sVar4, i12 & 14, 0, 65534);
                sVar = sVar4;
                sVar.p(true);
            }
            x1VarT.f39502d = eVar;
        }
        sVar = sVar3;
        sVar.W();
        x1VarT = sVar.t();
        if (x1VarT != null) {
            final int i15 = 1;
            eVar = new fz.e(title, str, subtitleStyle, i11, i15) { // from class: iv.q0

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ int f34815a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ String f34816b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ String f34817c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ kv.a0 f34818d;

                {
                    this.f34815a = i15;
                }

                @Override // fz.e
                public final Object invoke(Object obj, Object obj2) {
                    int i16 = this.f34815a;
                    l1.n nVar2 = (l1.n) obj;
                    ((Integer) obj2).getClass();
                    switch (i16) {
                        case 0:
                            a.B(this.f34816b, this.f34817c, this.f34818d, nVar2, l1.t.M(1));
                            break;
                        default:
                            a.B(this.f34816b, this.f34817c, this.f34818d, nVar2, l1.t.M(1));
                            break;
                    }
                    return qy.b0.f48488a;
                }
            };
            x1VarT.f39502d = eVar;
        }
    }

    public static final void C(int i11, fz.a aVar, String str, l1.n nVar, boolean z11) {
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-972652121);
        int i12 = (sVar.g(z11) ? 4 : 2) | i11 | (sVar.f(str) ? 32 : 16) | (sVar.h(aVar) ? 256 : 128);
        if (sVar.T(i12 & 1, (i12 & 147) != 146)) {
            x9.b(z11, aVar, null, false, t1.e.d(1763967885, new bp.e0(str, 11), sVar), 0L, 0L, sVar, (i12 & 14) | 24576 | ((i12 >> 3) & 112), 492);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new y(z11, str, aVar, i11);
        }
    }

    public static final void D(kv.i0 i0Var, mv.k0 k0Var, l9 l9Var, fz.a finish, fz.c loginNow, l1.n nVar, int i11) {
        mv.k0 k0Var2;
        l9 l9Var2;
        int i12;
        l9 l9Var3;
        mv.k0 k0Var3;
        j9.v vVar;
        kotlin.jvm.internal.m.f(finish, "finish");
        kotlin.jvm.internal.m.f(loginNow, "loginNow");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1503585525);
        int i13 = i11 | (sVar.h(i0Var) ? 4 : 2) | (sVar.g(false) ? 32 : 16) | 1152 | (sVar.h(finish) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE) | (sVar.h(loginNow) ? 131072 : 65536);
        if (sVar.T(i13 & 1, (74899 & i13) != 74898)) {
            sVar.Y();
            int i14 = i11 & 1;
            l1.g gVar = l1.m.f39353a;
            if (i14 == 0 || sVar.C()) {
                boolean zH = sVar.h(i0Var) | ((i13 & 112) == 32);
                Object objQ = sVar.Q();
                if (zH || objQ == gVar) {
                    objQ = new s(i0Var, 1);
                    sVar.o0(objQ);
                }
                fz.a aVar = (fz.a) objQ;
                sVar.d0(-1614864554);
                LocalViewModelStoreOwner localViewModelStoreOwner = LocalViewModelStoreOwner.INSTANCE;
                int i15 = LocalViewModelStoreOwner.$stable;
                ViewModelStoreOwner current = localViewModelStoreOwner.getCurrent(sVar, i15);
                if (current == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                ViewModel viewModelA = i20.b.a(kotlin.jvm.internal.z.a(mv.k0.class), current.getViewModelStore(), null, i20.a.a(current), null, q10.b.a(sVar), aVar);
                sVar.p(false);
                mv.k0 k0Var4 = (mv.k0) viewModelA;
                sVar.d0(-1614864554);
                ViewModelStoreOwner current2 = localViewModelStoreOwner.getCurrent(sVar, i15);
                if (current2 == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                ViewModel viewModelA2 = i20.b.a(kotlin.jvm.internal.z.a(l9.class), current2.getViewModelStore(), null, i20.a.a(current2), null, q10.b.a(sVar), null);
                sVar.p(false);
                i12 = i13 & (-8065);
                l9Var3 = (l9) viewModelA2;
                k0Var3 = k0Var4;
            } else {
                sVar.W();
                i12 = i13 & (-8065);
                k0Var3 = k0Var;
                l9Var3 = l9Var;
            }
            sVar.q();
            Object objQ2 = sVar.Q();
            if (objQ2 == gVar) {
                objQ2 = new i1(-1L);
                sVar.o0(objQ2);
            }
            i1 i1Var = (i1) objQ2;
            j9.v vVarH = cf.x.H(new j9.c0[0], sVar);
            boolean zH2 = ((57344 & i12) == 16384) | sVar.h(k0Var3) | sVar.h(l9Var3) | sVar.h(vVarH) | ((i12 & 458752) == 131072);
            Object objQ3 = sVar.Q();
            if (zH2 || objQ3 == gVar) {
                vVar = vVarH;
                objQ3 = new g7((y9) k0Var3, l9Var3, i1Var, finish, vVar, loginNow, 7);
                sVar.o0(objQ3);
            } else {
                vVar = vVarH;
            }
            com.bumptech.glide.e.c(vVar, "syllable_test", null, null, null, null, null, null, (fz.c) objQ3, sVar, 48);
            k0Var2 = k0Var3;
            l9Var2 = l9Var3;
        } else {
            sVar.W();
            k0Var2 = k0Var;
            l9Var2 = l9Var;
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new bt.v1(i0Var, k0Var2, l9Var2, finish, loginNow, i11, 7);
        }
    }

    public static final void E(rc rcVar, h9 h9Var, gc gcVar, int i11, fz.a aVar, fz.a aVar2, fz.c cVar, fz.e eVar, fz.e eVar2, fz.c cVar2, fz.a aVar3, fz.c cVar3, fz.a aVar4, l1.n nVar, int i12) {
        l1.s sVar;
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(231582621);
        int i13 = i12 | (sVar2.h(rcVar) ? 4 : 2) | (sVar2.h(h9Var) ? 32 : 16) | (sVar2.h(gcVar) ? 256 : 128) | (sVar2.d(i11) ? 2048 : 1024) | (sVar2.h(aVar) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE) | (sVar2.h(aVar2) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536) | (sVar2.h(eVar) ? 8388608 : 4194304) | (sVar2.h(eVar2) ? 67108864 : 33554432) | (sVar2.h(cVar2) ? 536870912 : 268435456);
        int i14 = (sVar2.h(aVar3) ? 4 : 2) | (sVar2.h(cVar3) ? 32 : 16) | (sVar2.h(aVar4) ? 256 : 128);
        if (!sVar2.T(i13 & 1, ((i13 & 306259091) == 306259090 && (i14 & 147) == 146) ? false : true)) {
            sVar = sVar2;
            sVar.W();
        } else if (rcVar instanceof pc) {
            sVar2.d0(-787380980);
            tv.a.d(0, 1, sVar2, null);
            sVar2.p(false);
            sVar = sVar2;
        } else {
            if (!(rcVar instanceof qc)) {
                throw nv.p.x(sVar2, -787379830, false);
            }
            sVar2.d0(1361137455);
            Object objQ = sVar2.Q();
            l1.g gVar = l1.m.f39353a;
            if (objQ == gVar) {
                objQ = l1.t.q(sVar2);
                sVar2.o0(objQ);
            }
            rz.b0 b0Var = (rz.b0) objQ;
            Object objQ2 = sVar2.Q();
            if (objQ2 == gVar) {
                objQ2 = l1.t.B(Boolean.FALSE);
                sVar2.o0(objQ2);
            }
            l1.b1 b1Var = (l1.b1) objQ2;
            t1.d dVarD = t1.e.d(1821267213, new br.d((Object) gcVar, aVar, (Object) b0Var, (qy.e) aVar2, (Object) b1Var, (Object) rcVar, i11, 3), sVar2);
            boolean z11 = (i13 & 1879048192) == 536870912;
            Object objQ3 = sVar2.Q();
            if (z11 || objQ3 == gVar) {
                objQ3 = new f1(cVar2, b1Var, 0);
                sVar2.o0(objQ3);
            }
            fz.e eVar3 = (fz.e) objQ3;
            boolean z12 = (i14 & 14) == 4;
            Object objQ4 = sVar2.Q();
            if (z12 || objQ4 == gVar) {
                objQ4 = new fu.e(3, aVar3, b1Var);
                sVar2.o0(objQ4);
            }
            fz.a aVar5 = (fz.a) objQ4;
            boolean z13 = (i14 & 112) == 32;
            Object objQ5 = sVar2.Q();
            if (z13 || objQ5 == gVar) {
                objQ5 = new y3(cVar3, b1Var, 2);
                sVar2.o0(objQ5);
            }
            int i15 = i13 >> 15;
            ys.a.n(rcVar, h9Var, false, false, 0L, null, null, null, null, null, null, dVarD, eVar, eVar2, eVar3, aVar5, (fz.c) objQ5, aVar, aVar4, sVar2, i13 & 112, (i15 & 7168) | (i15 & 896) | 48 | ((i13 << 9) & 29360128) | ((i14 << 18) & 234881024), 2044);
            sVar = sVar2;
            sVar.p(false);
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new bt.n0(rcVar, h9Var, gcVar, i11, aVar, aVar2, cVar, eVar, eVar2, cVar2, aVar3, cVar3, aVar4, i12);
        }
    }

    public static final void F(kv.e0 example, fz.a onClick, l1.n nVar, int i11) {
        int i12;
        kotlin.jvm.internal.m.f(example, "example");
        kotlin.jvm.internal.m.f(onClick, "onClick");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1551645119);
        if ((i11 & 6) == 0) {
            i12 = i11 | (sVar.h(example) ? 4 : 2);
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(onClick) ? 32 : 16;
        }
        if (sVar.T(i12 & 1, (i12 & 19) != 18)) {
            z1.r rVarE = e2.e(j0.c.B(z1.o.f58481a, 16, 6), 1.0f);
            c3 c3Var = v1.f31180a;
            iu.k.l(onClick, rVarE, false, CropImageView.DEFAULT_ASPECT_RATIO, g2.x.c(((s1) sVar.j(c3Var)).f31021c, 0.5f), 0L, g2.x.c(((s1) sVar.j(c3Var)).f31017a, 0.22f), CropImageView.DEFAULT_ASPECT_RATIO, d0.n.a(g2.x.c(((s1) sVar.j(c3Var)).f31017a, 0.28f), 1), t1.e.d(247913917, new a00.b(example, 17), sVar), sVar, ((i12 >> 3) & 14) | 805306416, 172);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new m0(example, onClick, i11, 0);
        }
    }

    public static final void G(CourseCharacter courseCharacter, boolean z11, fz.a aVar, l1.n nVar, int i11) {
        l1.s sVar = (l1.s) nVar;
        sVar.f0(2089391001);
        int i12 = (sVar.h(courseCharacter) ? 4 : 2) | i11 | (sVar.g(z11) ? 32 : 16) | (sVar.h(aVar) ? 256 : 128);
        if (sVar.T(i12 & 1, (i12 & 147) != 146)) {
            z1.r rVarN = e2.n(z1.o.f58481a, 142);
            boolean zH = ((i12 & 112) == 32) | sVar.h(courseCharacter) | ((i12 & 896) == 256);
            Object objQ = sVar.Q();
            if (zH || objQ == l1.m.f39353a) {
                objQ = new n1(courseCharacter, z11, aVar, 4);
                sVar.o0(objQ);
            }
            ef.e.c(6, (fz.c) objQ, sVar, rVarN);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new q(courseCharacter, z11, aVar, i11, 1);
        }
    }

    public static final void H(HwView hwView, CourseCharacter courseCharacter, boolean z11, fz.a aVar) {
        String charPath = courseCharacter.getCharPath();
        List<String> partStrings = courseCharacter.getPartStrings();
        List<String> polygonStrings = courseCharacter.getPolygonStrings();
        courseCharacter.getCharacterId();
        hwView.e(charPath, partStrings, polygonStrings);
        if (z11) {
            hwView.g();
            hwView.setTimeGap(100);
            hwView.f();
            hwView.setAnimListener(new r(0, aVar));
        } else {
            hwView.g();
            hwView.setBgHanziVisibility(true);
        }
        hwView.invalidate();
    }

    public static final String I(kv.i0 i0Var) {
        String strR0 = oz.q.R0(i0Var.f38748a, "L");
        int length = strR0.length();
        for (int i11 = 0; i11 < length; i11++) {
            if (!Character.isDigit(strR0.charAt(i11))) {
                String strSubstring = strR0.substring(0, i11);
                kotlin.jvm.internal.m.e(strSubstring, "substring(...)");
                return strSubstring;
            }
        }
        return strR0;
    }

    public static final void a(int i11, String str, l1.n nVar, z1.r rVar) {
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1889802867);
        int i12 = (sVar.f(str) ? 4 : 2) | i11 | (sVar.f(rVar) ? 32 : 16);
        if (sVar.T(i12 & 1, (i12 & 19) != 18)) {
            z1.r rVarC = j0.c.C(e2.i(rVar, 58, CropImageView.DEFAULT_ASPECT_RATIO, 2), CropImageView.DEFAULT_ASPECT_RATIO, 8, 1);
            w2.q0 q0VarD = j0.o.d(z1.c.f58466d, false);
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
            l1.t.J(y2.j.f56917f, q0VarD, sVar);
            l1.t.J(y2.j.f56916e, q1VarL, sVar);
            y2.h hVar = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
            }
            l1.t.J(y2.j.f56915d, rVarC2, sVar);
            iu.k.c(str, e2.e(z1.o.f58481a, 1.0f), j3.y0.a((j3.y0) sVar.j(ua.f31167a), ((s1) sVar.j(v1.f31180a)).f31034q, j3.A(20), n3.s.H, null, null, 0L, null, null, 5, 0, 0L, null, 16744440), 0, false, 1, 0, new s0.g(j3.A(10), j3.A(20), j3.A(1)), sVar, (i12 & 14) | 1572912, 184);
            sVar.p(true);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new br.a(str, rVar, i11, 3);
        }
    }

    public static final void b(kv.e0 example, fz.a onClick, l1.n nVar, int i11) {
        int i12;
        fz.a aVar;
        kotlin.jvm.internal.m.f(example, "example");
        kotlin.jvm.internal.m.f(onClick, "onClick");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-646236075);
        if ((i11 & 6) == 0) {
            i12 = (sVar.h(example) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(onClick) ? 32 : 16;
        }
        if (sVar.T(i12 & 1, (i12 & 19) != 18)) {
            z1.r rVarE = e2.e(j0.c.B(z1.o.f58481a, 16, 8), 1.0f);
            a2 a2VarA = z1.a(j0.i.g(24), z1.c.M, sVar, 54);
            int iHashCode = Long.hashCode(sVar.T);
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
            l1.t.J(y2.j.f56917f, a2VarA, sVar);
            l1.t.J(y2.j.f56916e, q1VarL, sVar);
            y2.h hVar = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
            }
            l1.t.J(y2.j.f56915d, rVarC, sVar);
            aVar = onClick;
            n(example.f38729a, example.f38730b, false, aVar, sVar, (i12 << 6) & 7168, 4);
            String str = example.f38731c;
            if (1.0f <= 0.0d) {
                k0.a.a("invalid weight; must be greater than zero");
            }
            a(0, str, sVar, new j0.i1(1.0f, true));
            sVar.p(true);
        } else {
            aVar = onClick;
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new m0(example, aVar, i11, 1);
        }
    }

    public static final void c(String syllable, String romaji, boolean z11, fz.a onClick, t1.d dVar, l1.n nVar, int i11) {
        t1.d dVar2;
        boolean z12;
        kotlin.jvm.internal.m.f(syllable, "syllable");
        kotlin.jvm.internal.m.f(romaji, "romaji");
        kotlin.jvm.internal.m.f(onClick, "onClick");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-357230388);
        int i12 = i11 | (sVar.f(syllable) ? 4 : 2) | (sVar.f(romaji) ? 32 : 16) | 384 | (sVar.h(onClick) ? 2048 : 1024);
        if (sVar.T(i12 & 1, (i12 & 9363) != 9362)) {
            z1.o oVar = z1.o.f58481a;
            z1.r rVarA = j0.c.A(oVar, 16);
            j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, rVarA);
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
            z1.r rVarQ = j0.c.q(oVar, j0.e1.Min);
            a2 a2VarA = z1.a(j0.i.f35303a, z1.c.L, sVar, 48);
            int iHashCode2 = Long.hashCode(sVar.T);
            q1 q1VarL2 = sVar.l();
            z1.r rVarC2 = z1.a.c(sVar, rVarQ);
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
            n(syllable, romaji, true, onClick, sVar, i12 & 8190, 0);
            z1.r rVarE = j0.c.E(oVar, 30, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14);
            w2.q0 q0VarD = j0.o.d(z1.c.f58463a, false);
            int iHashCode3 = Long.hashCode(sVar.T);
            q1 q1VarL3 = sVar.l();
            z1.r rVarC3 = z1.a.c(sVar, rVarE);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar, q0VarD, sVar);
            l1.t.J(hVar2, q1VarL3, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode3))) {
                defpackage.e.A(iHashCode3, sVar, iHashCode3, hVar3);
            }
            l1.t.J(hVar4, rVarC3, sVar);
            dVar2 = dVar;
            dVar2.invoke(sVar, 6);
            sVar.p(true);
            sVar.p(true);
            sVar.p(true);
            z12 = true;
        } else {
            dVar2 = dVar;
            sVar.W();
            z12 = z11;
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new br.c0(syllable, romaji, z12, onClick, dVar2, i11);
        }
    }

    public static final void d(final String str, final List list, final j3.y0 y0Var, final int i11, final int i12, l1.n nVar, final int i13) {
        l1.s sVar;
        x1 x1VarT;
        fz.e eVar;
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(-1907946735);
        int i14 = i13 | (sVar2.f(str) ? 4 : 2) | (sVar2.h(list) ? 32 : 16) | (sVar2.f(y0Var) ? 256 : 128);
        if (sVar2.T(i14 & 1, (i14 & 9363) != 9362)) {
            boolean zIsEmpty = list.isEmpty();
            z1.o oVar = z1.o.f58481a;
            if (zIsEmpty) {
                sVar2.d0(-43788254);
                iu.k.c(str, e2.e(oVar, 1.0f), y0Var, 0, false, 1, 0, new s0.g(j3.A(i12), j3.A(i11), j3.A(1)), sVar2, (i14 & 14) | 1572912 | (i14 & 896), 184);
                sVar2.p(false);
                x1VarT = sVar2.t();
                if (x1VarT == null) {
                    return;
                }
                final int i15 = 0;
                eVar = new fz.e(str, list, y0Var, i11, i12, i13, i15) { // from class: iv.p0

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ int f34805a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ String f34806b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ List f34807c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    public final /* synthetic */ j3.y0 f34808d;

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    public final /* synthetic */ int f34809e;

                    /* JADX INFO: renamed from: f, reason: collision with root package name */
                    public final /* synthetic */ int f34810f;

                    {
                        this.f34805a = i15;
                    }

                    @Override // fz.e
                    public final Object invoke(Object obj, Object obj2) {
                        switch (this.f34805a) {
                            case 0:
                                ((Integer) obj2).getClass();
                                int iM = l1.t.M(27649);
                                a.d(this.f34806b, this.f34807c, this.f34808d, this.f34809e, this.f34810f, (l1.n) obj, iM);
                                break;
                            default:
                                ((Integer) obj2).getClass();
                                int iM2 = l1.t.M(27649);
                                a.d(this.f34806b, this.f34807c, this.f34808d, this.f34809e, this.f34810f, (l1.n) obj, iM2);
                                break;
                        }
                        return qy.b0.f48488a;
                    }
                };
            } else {
                sVar = sVar2;
                sVar.d0(-64684207);
                sVar.p(false);
                w(str, list, y0Var, e2.e(oVar, 1.0f), sVar2, (i14 & 14) | 3072 | (i14 & 112) | (i14 & 896));
            }
            x1VarT.f39502d = eVar;
        }
        sVar = sVar2;
        sVar.W();
        x1VarT = sVar.t();
        if (x1VarT != null) {
            final int i16 = 1;
            eVar = new fz.e(str, list, y0Var, i11, i12, i13, i16) { // from class: iv.p0

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ int f34805a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ String f34806b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ List f34807c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ j3.y0 f34808d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ int f34809e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ int f34810f;

                {
                    this.f34805a = i16;
                }

                @Override // fz.e
                public final Object invoke(Object obj, Object obj2) {
                    switch (this.f34805a) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int iM = l1.t.M(27649);
                            a.d(this.f34806b, this.f34807c, this.f34808d, this.f34809e, this.f34810f, (l1.n) obj, iM);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            int iM2 = l1.t.M(27649);
                            a.d(this.f34806b, this.f34807c, this.f34808d, this.f34809e, this.f34810f, (l1.n) obj, iM2);
                            break;
                    }
                    return qy.b0.f48488a;
                }
            };
            x1VarT.f39502d = eVar;
        }
    }

    public static final void e(CourseCharacter courseCharacter, boolean z11, fz.c cVar, l1.n nVar, int i11) {
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-1665122583);
        int i12 = (sVar.h(courseCharacter) ? 4 : 2) | i11 | (sVar.g(z11) ? 32 : 16) | (sVar.h(cVar) ? 256 : 128);
        if (sVar.T(i12 & 1, (i12 & 147) != 146)) {
            h1.t0 t0VarP = k7.p(((s1) sVar.j(v1.f31180a)).f31033p, sVar, 0);
            z1.r rVarE = e2.e(j0.c.B(z1.o.f58481a, 16, 8), 1.0f);
            boolean zH = sVar.h(courseCharacter) | ((i12 & 896) == 256);
            Object objQ = sVar.Q();
            if (zH || objQ == l1.m.f39353a) {
                objQ = new fp.f(14, cVar, courseCharacter);
                sVar.o0(objQ);
            }
            k7.c((fz.a) objQ, rVarE, false, null, t0VarP, null, null, t1.e.d(1091651102, new n2(courseCharacter, z11, cVar, 2), sVar), sVar, 100663344, 236);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new bp.b0(courseCharacter, z11, cVar, i11, 7);
        }
    }

    public static final void f(int i11, fz.c cVar, List list, l1.n nVar, z1.r rVar) {
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1439680765);
        int i12 = (sVar.h(list) ? 4 : 2) | i11 | (sVar.h(cVar) ? 32 : 16) | (sVar.f(rVar) ? 256 : 128);
        if (sVar.T(i12 & 1, (i12 & 147) != 146)) {
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (objQ == gVar) {
                objQ = l1.t.B(null);
                sVar.o0(objQ);
            }
            l1.b1 b1Var = (l1.b1) objQ;
            j0.v1 v1VarD = j0.c.d(CropImageView.DEFAULT_ASPECT_RATIO, 8, 1);
            boolean zH = sVar.h(list) | ((i12 & 112) == 32);
            Object objQ2 = sVar.Q();
            if (zH || objQ2 == gVar) {
                objQ2 = new u(list, cVar, b1Var, 0);
                sVar.o0(objQ2);
            }
            ue.f.a(rVar, null, v1VarD, null, null, null, false, null, (fz.c) objQ2, sVar, ((i12 >> 6) & 14) | 384, 506);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new fp.e(list, cVar, rVar, i11, 4);
        }
    }

    public static final void g(kv.i0 i0Var, fz.a onBackClick, fz.a onClickPractice, mv.y yVar, l1.n nVar, int i11) {
        mv.y yVar2;
        int i12;
        mv.y yVar3;
        kotlin.jvm.internal.m.f(onBackClick, "onBackClick");
        kotlin.jvm.internal.m.f(onClickPractice, "onClickPractice");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1258386226);
        int i13 = i11 | (sVar.h(i0Var) ? 4 : 2) | (sVar.h(onBackClick) ? 32 : 16) | (sVar.h(onClickPractice) ? 256 : 128) | 1024;
        if (sVar.T(i13 & 1, (i13 & 1171) != 1170)) {
            sVar.Y();
            int i14 = i11 & 1;
            l1.g gVar = l1.m.f39353a;
            if (i14 == 0 || sVar.C()) {
                boolean zH = sVar.h(i0Var);
                Object objQ = sVar.Q();
                if (zH || objQ == gVar) {
                    objQ = new s(i0Var, 0);
                    sVar.o0(objQ);
                }
                fz.a aVar = (fz.a) objQ;
                sVar.d0(-1614864554);
                ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(sVar, LocalViewModelStoreOwner.$stable);
                if (current == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                ViewModel viewModelA = i20.b.a(kotlin.jvm.internal.z.a(mv.y.class), current.getViewModelStore(), null, i20.a.a(current), null, q10.b.a(sVar), aVar);
                sVar.p(false);
                mv.y yVar4 = (mv.y) viewModelA;
                i12 = i13 & (-7169);
                yVar3 = yVar4;
            } else {
                sVar.W();
                i12 = i13 & (-7169);
                yVar3 = yVar;
            }
            sVar.q();
            mv.u uVar = (mv.u) l1.t.o(yVar3.f42296t, sVar).getValue();
            boolean zH2 = sVar.h(yVar3);
            Object objQ2 = sVar.Q();
            if (zH2 || objQ2 == gVar) {
                objQ2 = new t(yVar3, 0);
                sVar.o0(objQ2);
            }
            h(uVar, onBackClick, onClickPractice, (fz.c) objQ2, sVar, i12 & 1008);
            yVar2 = yVar3;
        } else {
            sVar.W();
            yVar2 = yVar;
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new bp.t(i0Var, onBackClick, onClickPractice, yVar2, i11, 9);
        }
    }

    public static final void h(final mv.u uVar, final fz.a aVar, final fz.a aVar2, final fz.c cVar, l1.n nVar, final int i11) {
        int i12;
        x1 x1VarT;
        fz.e eVar;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-1065359409);
        if ((i11 & 6) == 0) {
            i12 = ((i11 & 8) == 0 ? sVar.f(uVar) : sVar.h(uVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(aVar) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= sVar.h(aVar2) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar.h(cVar) ? 2048 : 1024;
        }
        if (!sVar.T(i12 & 1, (i12 & 1171) != 1170)) {
            sVar.W();
        } else {
            if (!kotlin.jvm.internal.m.a(uVar, mv.s.f42273a)) {
                if (!(uVar instanceof mv.t)) {
                    throw nv.p.x(sVar, -1608164794, false);
                }
                sVar.d0(1686640982);
                fb fbVar = ((mv.t) uVar).f42276c;
                if (fbVar instanceof db) {
                    sVar.d0(1686709182);
                    tv.a.g(((db) fbVar).f49634a, null, sVar, 0, 6);
                    sVar.p(false);
                    sVar.p(false);
                    x1VarT = sVar.t();
                    if (x1VarT == null) {
                        return;
                    }
                    final int i13 = 0;
                    eVar = new fz.e() { // from class: iv.p
                        @Override // fz.e
                        public final Object invoke(Object obj, Object obj2) {
                            switch (i13) {
                                case 0:
                                    ((Integer) obj2).intValue();
                                    a.h(uVar, aVar, aVar2, cVar, (l1.n) obj, l1.t.M(i11 | 1));
                                    break;
                                case 1:
                                    ((Integer) obj2).intValue();
                                    a.h(uVar, aVar, aVar2, cVar, (l1.n) obj, l1.t.M(i11 | 1));
                                    break;
                                default:
                                    ((Integer) obj2).intValue();
                                    a.h(uVar, aVar, aVar2, cVar, (l1.n) obj, l1.t.M(i11 | 1));
                                    break;
                            }
                            return qy.b0.f48488a;
                        }
                    };
                } else {
                    sVar.d0(1682654227);
                    sVar.p(false);
                    if (kotlin.jvm.internal.m.a(fbVar, eb.f49693a)) {
                        sVar.d0(1686894221);
                        tv.a.d(0, 1, sVar, null);
                        sVar.p(false);
                        sVar.p(false);
                        x1VarT = sVar.t();
                        if (x1VarT == null) {
                            return;
                        }
                        final int i14 = 1;
                        eVar = new fz.e() { // from class: iv.p
                            @Override // fz.e
                            public final Object invoke(Object obj, Object obj2) {
                                switch (i14) {
                                    case 0:
                                        ((Integer) obj2).intValue();
                                        a.h(uVar, aVar, aVar2, cVar, (l1.n) obj, l1.t.M(i11 | 1));
                                        break;
                                    case 1:
                                        ((Integer) obj2).intValue();
                                        a.h(uVar, aVar, aVar2, cVar, (l1.n) obj, l1.t.M(i11 | 1));
                                        break;
                                    default:
                                        ((Integer) obj2).intValue();
                                        a.h(uVar, aVar, aVar2, cVar, (l1.n) obj, l1.t.M(i11 | 1));
                                        break;
                                }
                                return qy.b0.f48488a;
                            }
                        };
                    } else {
                        sVar.d0(1682654227);
                        sVar.p(false);
                        p7.a(null, t1.e.d(1281543028, new fu.n(9, uVar, aVar), sVar), t1.e.d(-866857803, new at.o(18, aVar2), sVar), null, null, 0, 0L, 0L, null, t1.e.d(-91861505, new at.p(uVar, cVar, 12), sVar), sVar, 805306800, 505);
                        sVar.p(false);
                    }
                }
                x1VarT.f39502d = eVar;
            }
            sVar.d0(-1608164802);
            tv.a.d(0, 1, sVar, null);
            sVar.p(false);
        }
        x1VarT = sVar.t();
        if (x1VarT != null) {
            final int i15 = 2;
            eVar = new fz.e() { // from class: iv.p
                @Override // fz.e
                public final Object invoke(Object obj, Object obj2) {
                    switch (i15) {
                        case 0:
                            ((Integer) obj2).intValue();
                            a.h(uVar, aVar, aVar2, cVar, (l1.n) obj, l1.t.M(i11 | 1));
                            break;
                        case 1:
                            ((Integer) obj2).intValue();
                            a.h(uVar, aVar, aVar2, cVar, (l1.n) obj, l1.t.M(i11 | 1));
                            break;
                        default:
                            ((Integer) obj2).intValue();
                            a.h(uVar, aVar, aVar2, cVar, (l1.n) obj, l1.t.M(i11 | 1));
                            break;
                    }
                    return qy.b0.f48488a;
                }
            };
            x1VarT.f39502d = eVar;
        }
    }

    public static final void i(CourseCharacter courseCharacter, boolean z11, fz.a aVar, l1.n nVar, int i11) {
        l1.s sVar;
        fz.a aVar2;
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(810192567);
        int i12 = i11 | (sVar2.h(courseCharacter) ? 4 : 2) | (sVar2.g(z11) ? 32 : 16) | (sVar2.h(aVar) ? 256 : 128);
        if (!sVar2.T(i12 & 1, (i12 & 147) != 146)) {
            sVar = sVar2;
            aVar2 = aVar;
            sVar.W();
        } else if (oz.q.K0(courseCharacter.getDrillJson())) {
            sVar = sVar2;
            aVar2 = aVar;
            sVar.d0(-1267764161);
            G(courseCharacter, z11, aVar2, sVar, i12 & 1022);
            sVar.p(false);
        } else {
            sVar2.d0(-1269197725);
            boolean zF = sVar2.f(courseCharacter.getDrillJson());
            Object objQ = sVar2.Q();
            l1.g gVar = l1.m.f39353a;
            if (zF || objQ == gVar) {
                h00.s sVar3 = xt.c.f56291a;
                String drillJson = courseCharacter.getDrillJson();
                com.android.billingclient.api.h hVar = sVar3.f29917b;
                kotlin.jvm.internal.a0 a0Var = kotlin.jvm.internal.z.f38362a;
                kotlin.jvm.internal.e eVarA = kotlin.jvm.internal.z.a(ou.c.class);
                List list = Collections.EMPTY_LIST;
                a0Var.getClass();
                objQ = (ou.c) sVar3.b(ob.f.K(hVar, new kotlin.jvm.internal.d0(eVarA)), drillJson);
                sVar2.o0(objQ);
            }
            ou.c cVar = (ou.c) objQ;
            Object objQ2 = sVar2.Q();
            if (objQ2 == gVar) {
                objQ2 = new pu.b();
                sVar2.o0(objQ2);
            }
            pu.b bVar = (pu.b) objQ2;
            Object objQ3 = sVar2.Q();
            if (objQ3 == gVar) {
                objQ3 = l1.t.q(sVar2);
                sVar2.o0(objQ3);
            }
            rz.b0 b0Var = (rz.b0) objQ3;
            c3 c3Var = v1.f31180a;
            ou.e eVar = new ou.e(ob.f.p((s1) sVar2.j(c3Var), sVar2), ob.f.l((s1) sVar2.j(c3Var), sVar2), ob.f.o((s1) sVar2.j(c3Var), sVar2), ob.f.m((s1) sVar2.j(c3Var), sVar2), ob.f.n((s1) sVar2.j(c3Var), sVar2), false, false, false, 1888);
            boolean zF2 = sVar2.f(cVar) | sVar2.f(b0Var);
            Object objQ4 = sVar2.Q();
            if (zF2 || objQ4 == gVar) {
                aVar2 = aVar;
                nu.e eVar2 = new nu.e(bVar, cVar, b0Var, eVar, new ju.d(25), aVar2);
                sVar2.o0(eVar2);
                objQ4 = eVar2;
            } else {
                aVar2 = aVar;
            }
            nu.e eVar3 = (nu.e) objQ4;
            Boolean boolValueOf = Boolean.valueOf(z11);
            boolean zH = sVar2.h(eVar3) | ((i12 & 112) == 32);
            Object objQ5 = sVar2.Q();
            if (zH || objQ5 == gVar) {
                objQ5 = new bt.o(z11, eVar3, (vy.d) null);
                sVar2.o0(objQ5);
            }
            l1.t.f((fz.e) objQ5, boolValueOf, sVar2);
            ou.b bVar2 = ou.c.Companion;
            sVar = sVar2;
            ub.a.J(cVar, eVar3, null, eVar, sVar, 72);
            sVar.p(false);
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new q(courseCharacter, z11, aVar2, i11, 0);
        }
    }

    public static final void j(final SyllableLessonStatus syllableLessonStatus, final String str, final String str2, final boolean z11, final boolean z12, final z1.r rVar, final fz.a aVar, final fz.a aVar2, l1.n nVar, final int i11) {
        l1.s sVar;
        long jE;
        int i12;
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(393922029);
        int i13 = i11 | (sVar2.d(syllableLessonStatus.ordinal()) ? 4 : 2) | (sVar2.f(str) ? 32 : 16) | (sVar2.f(str2) ? 256 : 128) | (sVar2.g(z11) ? 2048 : 1024) | (sVar2.g(z12) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE) | (sVar2.h(aVar) ? 1048576 : 524288) | (sVar2.h(aVar2) ? 8388608 : 4194304);
        if (sVar2.T(i13 & 1, (4793491 & i13) != 4793490)) {
            boolean z13 = syllableLessonStatus == SyllableLessonStatus.LOCKED;
            int[] iArr = e0.f34713b;
            if (iArr[syllableLessonStatus.ordinal()] == 1) {
                sVar2.d0(601960670);
                sVar2.p(false);
                jE = g2.f0.e(4293454056L);
            } else {
                sVar2.d0(601962580);
                jE = ((s1) sVar2.j(v1.f31180a)).f31017a;
                sVar2.p(false);
            }
            long jE2 = iArr[syllableLessonStatus.ordinal()] == 1 ? g2.f0.e(4290098613L) : g2.x.f28618e;
            int i14 = iArr[syllableLessonStatus.ordinal()];
            if (i14 == 1) {
                i12 = R.drawable.ic_lesson_index_lesson_start_grey;
            } else if (i14 == 2) {
                i12 = R.drawable.ic_lesson_index_lesson_start;
            } else {
                if (i14 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                i12 = R.drawable.ic_lesson_index_lesson_redo;
            }
            final int i15 = i12;
            h1.t0 t0VarO = k7.o(sVar2);
            if (z13) {
                long j11 = t0VarO.f31086c;
                long j12 = t0VarO.f31087d;
                t0VarO = t0VarO.a(j11, j12, j11, j12);
            }
            float f5 = 10;
            z1.r rVarB = d2.h.b(rVar, r0.f.d(f5));
            r0.e eVarD = r0.f.d(f5);
            boolean zG = ((3670016 & i13) == 1048576) | sVar2.g(z13) | ((i13 & 29360128) == 8388608);
            Object objQ = sVar2.Q();
            if (zG || objQ == l1.m.f39353a) {
                objQ = new gr.w(z13, aVar, aVar2, 1);
                sVar2.o0(objQ);
            }
            fz.a aVar3 = (fz.a) objQ;
            final long j13 = jE;
            final long j14 = jE2;
            t1.d dVarD = t1.e.d(783052632, new fz.f() { // from class: iv.z
                @Override // fz.f
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    boolean z14;
                    j0.v Card = (j0.v) obj;
                    l1.n nVar2 = (l1.n) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    kotlin.jvm.internal.m.f(Card, "$this$Card");
                    l1.s sVar3 = (l1.s) nVar2;
                    if (sVar3.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                        z1.j jVar = z1.c.f58463a;
                        w2.q0 q0VarD = j0.o.d(jVar, false);
                        int iHashCode = Long.hashCode(sVar3.T);
                        q1 q1VarL = sVar3.l();
                        z1.o oVar = z1.o.f58481a;
                        z1.r rVarC = z1.a.c(sVar3, oVar);
                        y2.k.J.getClass();
                        y2.i iVar = y2.j.f56913b;
                        sVar3.h0();
                        if (sVar3.S) {
                            sVar3.k(iVar);
                        } else {
                            sVar3.r0();
                        }
                        y2.h hVar = y2.j.f56917f;
                        l1.t.J(hVar, q0VarD, sVar3);
                        y2.h hVar2 = y2.j.f56916e;
                        l1.t.J(hVar2, q1VarL, sVar3);
                        y2.h hVar3 = y2.j.f56918g;
                        if (sVar3.S || !kotlin.jvm.internal.m.a(sVar3.Q(), Integer.valueOf(iHashCode))) {
                            defpackage.e.A(iHashCode, sVar3, iHashCode, hVar3);
                        }
                        y2.h hVar4 = y2.j.f56915d;
                        l1.t.J(hVar4, rVarC, sVar3);
                        float f11 = 14;
                        z1.r rVarB2 = j0.c.B(e2.i(oVar, 68, CropImageView.DEFAULT_ASPECT_RATIO, 2), f11, 8);
                        a2 a2VarA = z1.a(j0.i.g(f11), z1.c.M, sVar3, 54);
                        int iHashCode2 = Long.hashCode(sVar3.T);
                        q1 q1VarL2 = sVar3.l();
                        z1.r rVarC2 = z1.a.c(sVar3, rVarB2);
                        sVar3.h0();
                        if (sVar3.S) {
                            sVar3.k(iVar);
                        } else {
                            sVar3.r0();
                        }
                        l1.t.J(hVar, a2VarA, sVar3);
                        l1.t.J(hVar2, q1VarL2, sVar3);
                        if (sVar3.S || !kotlin.jvm.internal.m.a(sVar3.Q(), Integer.valueOf(iHashCode2))) {
                            defpackage.e.A(iHashCode2, sVar3, iHashCode2, hVar3);
                        }
                        l1.t.J(hVar4, rVarC2, sVar3);
                        r0.e eVar = r0.f.f48733a;
                        long j15 = j13;
                        z1.r rVarN = e2.n(d0.n.h(oVar, j15, eVar), 36);
                        w2.q0 q0VarD2 = j0.o.d(z1.c.f58467e, false);
                        int iHashCode3 = Long.hashCode(sVar3.T);
                        q1 q1VarL3 = sVar3.l();
                        z1.r rVarC3 = z1.a.c(sVar3, rVarN);
                        sVar3.h0();
                        if (sVar3.S) {
                            sVar3.k(iVar);
                        } else {
                            sVar3.r0();
                        }
                        l1.t.J(hVar, q0VarD2, sVar3);
                        l1.t.J(hVar2, q1VarL3, sVar3);
                        if (sVar3.S || !kotlin.jvm.internal.m.a(sVar3.Q(), Integer.valueOf(iHashCode3))) {
                            defpackage.e.A(iHashCode3, sVar3, iHashCode3, hVar3);
                        }
                        l1.t.J(hVar4, rVarC3, sVar3);
                        iu.k.c(str, null, j3.y0.a((j3.y0) sVar3.j(ua.f31167a), j14, j3.A(18), n3.s.N, null, null, 0L, null, null, 3, 0, 0L, null, 16744440), 0, false, 1, 0, new s0.g(j3.A(10), j3.A(18), j3.A(1)), sVar3, 1572864, 186);
                        sVar3.p(true);
                        j3.y0 y0Var = ((dc) sVar3.j(fc.f30256a)).f30177j;
                        if (1.0f <= 0.0d) {
                            k0.a.a("invalid weight; must be greater than zero");
                        }
                        ua.b(str2, new j0.i1(1.0f, true), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0Var, sVar3, 0, 0, 65532);
                        l1.s sVar4 = sVar3;
                        if (z12) {
                            sVar4.d0(-758218635);
                            z14 = false;
                            r4.b(se.k.y(i15, sVar4, 0), null, null, j15, sVar4, 48, 4);
                        } else {
                            z14 = false;
                            sVar4.d0(-784440140);
                        }
                        sVar4.p(z14);
                        sVar4.p(true);
                        if (z11) {
                            sVar4.d0(1301400509);
                            d0.n.c(se.k.y(R.drawable.ic_learn_lesson_open_tag, sVar4, z14 ? 1 : 0), null, e2.n(j0.c.E(j0.r.f35391a.a(oVar, jVar), 42, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14), 16), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar4, 48, 120);
                            sVar4 = sVar4;
                            z14 = false;
                        } else {
                            sVar4.d0(1274912528);
                        }
                        sVar4.p(z14);
                        sVar4.p(true);
                    } else {
                        sVar3.W();
                    }
                    return qy.b0.f48488a;
                }
            }, sVar2);
            sVar = sVar2;
            k7.c(aVar3, rVarB, false, eVarD, t0VarO, null, null, dVarD, sVar, 100663296, 228);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new fz.e(str, str2, z11, z12, rVar, aVar, aVar2, i11) { // from class: iv.a0
                public final /* synthetic */ fz.a H;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ String f34674b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ String f34675c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ boolean f34676d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ boolean f34677e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ z1.r f34678f;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public final /* synthetic */ fz.a f34679t;

                @Override // fz.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM = l1.t.M(196609);
                    a.j(this.f34673a, this.f34674b, this.f34675c, this.f34676d, this.f34677e, this.f34678f, this.f34679t, this.H, (l1.n) obj, iM);
                    return qy.b0.f48488a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x004e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0050  */
    /* JADX WARN: Code duplicated, block: B:28:0x005d  */
    /* JADX WARN: Code duplicated, block: B:29:0x005f  */
    /* JADX WARN: Code duplicated, block: B:32:0x006c  */
    /* JADX WARN: Code duplicated, block: B:33:0x006e  */
    /* JADX WARN: Code duplicated, block: B:36:0x007e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0081  */
    /* JADX WARN: Code duplicated, block: B:40:0x008b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x008d  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:53:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:56:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:57:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:60:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:67:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:69:0x0111  */
    /* JADX WARN: Code duplicated, block: B:72:0x011d  */
    /* JADX WARN: Code duplicated, block: B:74:? A[RETURN, SYNTHETIC] */
    public static final void k(List list, boolean z11, String str, boolean z12, fz.a aVar, fz.a aVar2, fz.c cVar, l1.n nVar, int i11, int i12) {
        boolean z13;
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z14;
        l1.s sVar;
        boolean z15;
        x1 x1VarT;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z20;
        Object objQ;
        boolean z21;
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(-1618803337);
        int i17 = (sVar2.h(list) ? 4 : 2) | i11 | (sVar2.f(str) ? 256 : 128);
        int i18 = i12 & 8;
        if (i18 == 0) {
            if ((i11 & 3072) == 0) {
                z13 = z12;
                i17 |= sVar2.g(z13) ? 2048 : 1024;
            }
            if (sVar2.h(aVar)) {
                i13 = 16384;
            } else {
                i13 = OSSConstants.DEFAULT_BUFFER_SIZE;
            }
            int i19 = i17 | i13;
            if (sVar2.h(aVar2)) {
                i14 = 131072;
            } else {
                i14 = 65536;
            }
            int i21 = i19 | i14;
            if (sVar2.h(cVar)) {
                i15 = 1048576;
            } else {
                i15 = 524288;
            }
            i16 = i21 | i15;
            if ((599187 & i16) != 599186) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (sVar2.T(i16 & 1, z14)) {
                if (i18 != 0) {
                    z13 = true;
                }
                float f5 = 16;
                j0.g gVarG = j0.i.g(f5);
                j0.v1 v1Var = new j0.v1(f5, f5, f5, f5);
                z1.r rVarD = e2.d(z1.o.f58481a, 1.0f);
                if ((57344 & i16) == 16384) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                boolean zH = z16 | sVar2.h(list);
                if ((i16 & 896) == 256) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                boolean z22 = zH | z17;
                if ((i16 & 7168) == 2048) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                boolean z23 = z22 | z18;
                if ((458752 & i16) == 131072) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                z20 = z23 | z19 | ((i16 & 3670016) == 1048576);
                objQ = sVar2.Q();
                if (!z20 || objQ == l1.m.f39353a) {
                    z21 = z13;
                    j4 j4Var = new j4(z11, list, aVar, str, z21, aVar2, cVar);
                    sVar2.o0(j4Var);
                    objQ = j4Var;
                } else {
                    z21 = z13;
                }
                sVar = sVar2;
                ue.f.a(rVarD, null, v1Var, gVarG, null, null, false, null, (fz.c) objQ, sVar, 24966, 490);
                z15 = z21;
            } else {
                sVar = sVar2;
                sVar.W();
                z15 = z13;
            }
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new in.g(list, z11, str, z15, aVar, aVar2, cVar, i11, i12);
            }
        }
        i17 |= 3072;
        z13 = z12;
        if (sVar2.h(aVar)) {
            i13 = 16384;
        } else {
            i13 = OSSConstants.DEFAULT_BUFFER_SIZE;
        }
        int i110 = i17 | i13;
        if (sVar2.h(aVar2)) {
            i14 = 131072;
        } else {
            i14 = 65536;
        }
        int i22 = i110 | i14;
        if (sVar2.h(cVar)) {
            i15 = 1048576;
        } else {
            i15 = 524288;
        }
        i16 = i22 | i15;
        if ((599187 & i16) != 599186) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (sVar2.T(i16 & 1, z14)) {
            if (i18 != 0) {
                z13 = true;
            }
            float f11 = 16;
            j0.g gVarG2 = j0.i.g(f11);
            j0.v1 v1Var2 = new j0.v1(f11, f11, f11, f11);
            z1.r rVarD2 = e2.d(z1.o.f58481a, 1.0f);
            if ((57344 & i16) == 16384) {
                z16 = true;
            } else {
                z16 = false;
            }
            boolean zH2 = z16 | sVar2.h(list);
            if ((i16 & 896) == 256) {
                z17 = true;
            } else {
                z17 = false;
            }
            boolean z24 = zH2 | z17;
            if ((i16 & 7168) == 2048) {
                z18 = true;
            } else {
                z18 = false;
            }
            boolean z25 = z24 | z18;
            if ((458752 & i16) == 131072) {
                z19 = true;
            } else {
                z19 = false;
            }
            z20 = z25 | z19 | ((i16 & 3670016) == 1048576);
            objQ = sVar2.Q();
            if (z20) {
                z21 = z13;
                j4 j4Var2 = new j4(z11, list, aVar, str, z21, aVar2, cVar);
                sVar2.o0(j4Var2);
                objQ = j4Var2;
            } else {
                z21 = z13;
                j4 j4Var3 = new j4(z11, list, aVar, str, z21, aVar2, cVar);
                sVar2.o0(j4Var3);
                objQ = j4Var3;
            }
            sVar = sVar2;
            ue.f.a(rVarD2, null, v1Var2, gVarG2, null, null, false, null, (fz.c) objQ, sVar, 24966, 490);
            z15 = z21;
        } else {
            sVar = sVar2;
            sVar.W();
            z15 = z13;
        }
        x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new in.g(list, z11, str, z15, aVar, aVar2, cVar, i11, i12);
        }
    }

    public static final void l(f0 f0Var, fz.a aVar, fz.a aVar2, fz.a aVar3, fz.e eVar, fz.c cVar, l1.n nVar, int i11) {
        l1.s sVar;
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(653948988);
        int i12 = i11 | (sVar2.h(f0Var) ? 4 : 2) | (sVar2.h(aVar) ? 32 : 16) | (sVar2.h(aVar2) ? 256 : 128) | (sVar2.h(aVar3) ? 2048 : 1024) | (sVar2.h(eVar) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE) | (sVar2.h(cVar) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536);
        if (sVar2.T(i12 & 1, (74899 & i12) != 74898)) {
            Object objQ = sVar2.Q();
            l1.g gVar = l1.m.f39353a;
            if (objQ == gVar) {
                objQ = new hh.y(10);
                sVar2.o0(objQ);
            }
            o0.b bVarB = o0.w.b(0, 384, 3, (fz.a) objQ, sVar2);
            Object objQ2 = sVar2.Q();
            if (objQ2 == gVar) {
                objQ2 = l1.t.q(sVar2);
                sVar2.o0(objQ2);
            }
            sVar = sVar2;
            p7.a(null, t1.e.d(-1644474376, new at.o(21, aVar), sVar2), null, null, t1.e.d(131056981, new fp.e(bVarB, f0Var, cVar, 7), sVar2), 0, 0L, 0L, null, t1.e.d(1577275789, new es.h(bVarB, (rz.b0) objQ2, f0Var, aVar2, aVar3, eVar, 3), sVar2), sVar, 805330992, 493);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new bp.f0(f0Var, aVar, aVar2, aVar3, eVar, cVar, i11);
        }
    }

    public static final void m(kv.i0 i0Var, mv.n nVar, fz.a onClickFinish, fz.a onClickStartLearning, l1.n nVar2, int i11) {
        mv.n nVar3;
        int i12;
        mv.n nVar4;
        kotlin.jvm.internal.m.f(onClickFinish, "onClickFinish");
        kotlin.jvm.internal.m.f(onClickStartLearning, "onClickStartLearning");
        l1.s sVar = (l1.s) nVar2;
        sVar.f0(-1441690104);
        int i13 = i11 | (sVar.h(i0Var) ? 4 : 2) | 16 | (sVar.h(onClickFinish) ? 256 : 128) | (sVar.h(onClickStartLearning) ? 2048 : 1024);
        if (sVar.T(i13 & 1, (i13 & 1171) != 1170)) {
            sVar.Y();
            if ((i11 & 1) == 0 || sVar.C()) {
                sVar.d0(-1614864554);
                ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(sVar, LocalViewModelStoreOwner.$stable);
                if (current == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                ViewModel viewModelA = i20.b.a(kotlin.jvm.internal.z.a(mv.n.class), current.getViewModelStore(), null, i20.a.a(current), null, q10.b.a(sVar), null);
                sVar.p(false);
                i12 = i13 & (-113);
                nVar4 = (mv.n) viewModelA;
            } else {
                sVar.W();
                i12 = i13 & (-113);
                nVar4 = nVar;
            }
            sVar.q();
            String str = i0Var.f38748a;
            kv.s0 s0Var = i0Var.f38755h;
            boolean zH = sVar.h(nVar4) | sVar.h(i0Var);
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            vy.d dVar = null;
            if (zH || objQ == gVar) {
                objQ = new h0(0, nVar4, i0Var, dVar);
                sVar.o0(objQ);
            }
            l1.t.g(str, s0Var, (fz.e) objQ, sVar);
            mv.k kVar = (mv.k) l1.t.o(nVar4.H, sVar).getValue();
            if (kotlin.jvm.internal.m.a(kVar, mv.i.f42215a)) {
                sVar.d0(1810260343);
                tv.a.d(0, 1, sVar, null);
                sVar.p(false);
            } else {
                if (!(kVar instanceof mv.j)) {
                    throw nv.p.x(sVar, 1810259004, false);
                }
                sVar.d0(283571334);
                fb fbVar = ((mv.j) kVar).f42223a;
                if (fbVar instanceof db) {
                    sVar.d0(283655065);
                    tv.a.g(((db) fbVar).f49634a, null, sVar, 0, 6);
                    sVar.p(false);
                } else if (kotlin.jvm.internal.m.a(fbVar, eb.f49693a)) {
                    sVar.d0(1810270263);
                    tv.a.d(0, 1, sVar, null);
                    sVar.p(false);
                } else {
                    if (!kotlin.jvm.internal.m.a(fbVar, cb.f49585a)) {
                        throw nv.p.x(sVar, 1810263204, false);
                    }
                    sVar.d0(283886759);
                    boolean zH2 = sVar.h(nVar4);
                    Object objQ2 = sVar.Q();
                    if (zH2 || objQ2 == gVar) {
                        objQ2 = new h(nVar4, 2);
                        sVar.o0(objQ2);
                    }
                    int i14 = i12 & 14;
                    int i15 = i12 >> 3;
                    s(i0Var, onClickFinish, onClickStartLearning, (fz.c) objQ2, sVar, i14 | (i15 & 112) | (i15 & 896));
                    sVar.p(false);
                }
                sVar.p(false);
            }
            nVar3 = nVar4;
        } else {
            sVar.W();
            nVar3 = nVar;
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new bp.t(i0Var, nVar3, onClickFinish, onClickStartLearning, i11, 11);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x004f  */
    /* JADX WARN: Code duplicated, block: B:32:0x0057  */
    /* JADX WARN: Code duplicated, block: B:33:0x005a  */
    /* JADX WARN: Code duplicated, block: B:35:0x005e  */
    /* JADX WARN: Code duplicated, block: B:38:0x0067  */
    /* JADX WARN: Code duplicated, block: B:39:0x0069  */
    /* JADX WARN: Code duplicated, block: B:42:0x0072 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x0074  */
    /* JADX WARN: Code duplicated, block: B:44:0x0076  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:49:0x00df  */
    /* JADX WARN: Code duplicated, block: B:51:? A[RETURN, SYNTHETIC] */
    public static final void n(String str, String str2, boolean z11, fz.a aVar, l1.n nVar, int i11, int i12) {
        int i13;
        boolean z12;
        boolean z13;
        l1.s sVar;
        boolean z14;
        x1 x1VarT;
        boolean z15;
        int i14;
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(1618717802);
        if ((i11 & 6) == 0) {
            i13 = (sVar2.f(str) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= sVar2.f(str2) ? 32 : 16;
        }
        int i15 = i12 & 4;
        if (i15 == 0) {
            if ((i11 & 384) == 0) {
                z12 = z11;
                i13 |= sVar2.g(z12) ? 256 : 128;
            }
            if ((i11 & 3072) != 0) {
                if (sVar2.h(aVar)) {
                    i14 = 2048;
                } else {
                    i14 = 1024;
                }
                i13 |= i14;
            }
            if ((i13 & 1171) != 1170) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (sVar2.T(i13 & 1, z13)) {
                if (i15 != 0) {
                    z15 = true;
                } else {
                    z15 = z12;
                }
                c3 c3Var = v1.f31180a;
                sVar = sVar2;
                iu.k.l(aVar, null, z15, CropImageView.DEFAULT_ASPECT_RATIO, g2.x.c(((s1) sVar2.j(c3Var)).f31021c, 0.5f), 0L, g2.x.c(((s1) sVar2.j(c3Var)).f31017a, 0.22f), CropImageView.DEFAULT_ASPECT_RATIO, d0.n.a(g2.x.c(((s1) sVar2.j(c3Var)).f31017a, 0.28f), 1), t1.e.d(884848940, new o0(str, str2, 0), sVar2), sVar, ((i13 >> 9) & 14) | 805306368 | (i13 & 896), 170);
                z14 = z15;
            } else {
                sVar = sVar2;
                sVar.W();
                z14 = z12;
            }
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new s2(str, str2, z14, aVar, i11, i12);
            }
        }
        i13 |= 384;
        z12 = z11;
        if ((i11 & 3072) != 0) {
            if (sVar2.h(aVar)) {
                i14 = 2048;
            } else {
                i14 = 1024;
            }
            i13 |= i14;
        }
        if ((i13 & 1171) != 1170) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (sVar2.T(i13 & 1, z13)) {
            if (i15 != 0) {
                z15 = true;
            } else {
                z15 = z12;
            }
            c3 c3Var2 = v1.f31180a;
            sVar = sVar2;
            iu.k.l(aVar, null, z15, CropImageView.DEFAULT_ASPECT_RATIO, g2.x.c(((s1) sVar2.j(c3Var2)).f31021c, 0.5f), 0L, g2.x.c(((s1) sVar2.j(c3Var2)).f31017a, 0.22f), CropImageView.DEFAULT_ASPECT_RATIO, d0.n.a(g2.x.c(((s1) sVar2.j(c3Var2)).f31017a, 0.28f), 1), t1.e.d(884848940, new o0(str, str2, 0), sVar2), sVar, ((i13 >> 9) & 14) | 805306368 | (i13 & 896), 170);
            z14 = z15;
        } else {
            sVar = sVar2;
            sVar.W();
            z14 = z12;
        }
        x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new s2(str, str2, z14, aVar, i11, i12);
        }
    }

    public static final void o(final kv.m block, final fz.c playAudio, l1.n nVar, final int i11) {
        int i12;
        final kv.m mVar;
        x1 x1VarT;
        fz.e eVar;
        float f5;
        boolean z11;
        kotlin.jvm.internal.m.f(block, "block");
        List list = block.f38781a;
        kotlin.jvm.internal.m.f(playAudio, "playAudio");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-394287495);
        if ((i11 & 6) == 0) {
            i12 = i11 | (sVar.h(block) ? 4 : 2);
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(playAudio) ? 32 : 16;
        }
        boolean z12 = true;
        if (sVar.T(i12 & 1, (i12 & 19) != 18)) {
            if (!list.isEmpty()) {
                Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        kv.x xVar = (kv.x) it.next();
                        if (kotlin.jvm.internal.m.a(xVar.f38830a.f38729a, xVar.f38831b.f38729a)) {
                            i12 = i12;
                        } else {
                            sVar.d0(507793577);
                            sVar.p(false);
                            float f11 = 8;
                            r0.e eVarD = r0.f.d(f11);
                            float f12 = 16;
                            z1.o oVar = z1.o.f58481a;
                            z1.r rVarE = e2.e(j0.c.B(oVar, f12, f11), 1.0f);
                            c3 c3Var = v1.f31180a;
                            z1.r rVarB = j0.c.B(d0.n.j(d0.n.h(rVarE, g2.x.c(((s1) sVar.j(c3Var)).f31021c, 0.18f), eVarD), 1, g2.x.c(((s1) sVar.j(c3Var)).f31017a, 0.2f), eVarD), f12, 12);
                            j0.u uVarA = j0.t.a(j0.i.g(f11), z1.c.O, sVar, 6);
                            int iHashCode = Long.hashCode(sVar.T);
                            q1 q1VarL = sVar.l();
                            z1.r rVarC = z1.a.c(sVar, rVarB);
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
                            Iterator itO = com.google.android.material.datepicker.d.o(sVar, rVarC, y2.j.f56915d, -1625246258, list);
                            int i13 = 0;
                            while (itO.hasNext()) {
                                Object next = itO.next();
                                int i14 = i13 + 1;
                                if (i13 < 0) {
                                    ns.o.V();
                                    throw null;
                                }
                                kv.x xVar2 = (kv.x) next;
                                z1.r rVarE2 = e2.e(oVar, 1.0f);
                                a2 a2VarA = z1.a(j0.i.f35303a, z1.c.M, sVar, 48);
                                int i15 = i12;
                                Iterator it2 = itO;
                                int iHashCode2 = Long.hashCode(sVar.T);
                                q1 q1VarL2 = sVar.l();
                                z1.r rVarC2 = z1.a.c(sVar, rVarE2);
                                y2.k.J.getClass();
                                y2.i iVar2 = y2.j.f56913b;
                                sVar.h0();
                                if (sVar.S) {
                                    sVar.k(iVar2);
                                } else {
                                    sVar.r0();
                                }
                                l1.t.J(y2.j.f56917f, a2VarA, sVar);
                                l1.t.J(y2.j.f56916e, q1VarL2, sVar);
                                y2.h hVar2 = y2.j.f56918g;
                                if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                                    defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar2);
                                }
                                l1.t.J(y2.j.f56915d, rVarC2, sVar);
                                kv.e0 e0Var = xVar2.f38830a;
                                c2 c2Var = c2.f35266a;
                                z1.o oVar2 = oVar;
                                z1.r rVarA = c2Var.a(oVar2, 2.0f);
                                int i16 = i15 & 112;
                                boolean zH = (i16 == 32 ? z12 : false) | sVar.h(xVar2);
                                Object objQ = sVar.Q();
                                l1.g gVar = l1.m.f39353a;
                                if (zH || objQ == gVar) {
                                    objQ = new n0(playAudio, xVar2, 2);
                                    sVar.o0(objQ);
                                }
                                p(e0Var, false, rVarA, (fz.a) objQ, sVar, 48);
                                j3.y0 y0Var = ((dc) sVar.j(fc.f30256a)).f30175h;
                                c3 c3Var2 = v1.f31180a;
                                List list2 = list;
                                l1.s sVar2 = sVar;
                                float f13 = f11;
                                ua.b("→", c2Var.a(oVar2, 1.0f), g2.x.c(((s1) sVar.j(c3Var2)).f31036s, 0.6f), 0L, null, null, null, 0L, new u3.k(3), 0L, 0, false, 0, 0, y0Var, sVar2, 6, 0, 65016);
                                sVar = sVar2;
                                kv.e0 e0Var2 = xVar2.f38831b;
                                z1.r rVarA2 = c2Var.a(oVar2, 2.0f);
                                boolean zH2 = sVar.h(xVar2) | (i16 == 32);
                                Object objQ2 = sVar.Q();
                                if (zH2 || objQ2 == gVar) {
                                    objQ2 = new n0(playAudio, xVar2, 3);
                                    sVar.o0(objQ2);
                                }
                                p(e0Var2, true, rVarA2, (fz.a) objQ2, sVar, 48);
                                sVar.p(true);
                                if (i13 != ns.o.A(list2)) {
                                    sVar.d0(910963207);
                                    f5 = f13;
                                    k7.g(j0.c.C(oVar2, f5, CropImageView.DEFAULT_ASPECT_RATIO, 2), CropImageView.DEFAULT_ASPECT_RATIO, g2.x.c(((s1) sVar.j(c3Var2)).f31036s, 0.12f), sVar, 6, 2);
                                    z11 = false;
                                } else {
                                    f5 = f13;
                                    z11 = false;
                                    sVar.d0(899919147);
                                }
                                sVar.p(z11);
                                z12 = true;
                                f11 = f5;
                                oVar = oVar2;
                                i13 = i14;
                                i12 = i15;
                                itO = it2;
                                list = list2;
                            }
                            sVar.p(false);
                            sVar.p(true);
                            mVar = block;
                        }
                    }
                }
            }
            int i17 = i12;
            sVar.d0(516960339);
            A(list, playAudio, null, sVar, i17 & 112, 4);
            sVar.p(false);
            x1VarT = sVar.t();
            if (x1VarT != null) {
                final int i18 = 0;
                eVar = new fz.e() { // from class: iv.k0
                    @Override // fz.e
                    public final Object invoke(Object obj, Object obj2) {
                        int i19 = i18;
                        l1.n nVar2 = (l1.n) obj;
                        ((Integer) obj2).intValue();
                        switch (i19) {
                            case 0:
                                a.o(block, playAudio, nVar2, l1.t.M(i11 | 1));
                                break;
                            default:
                                a.o(block, playAudio, nVar2, l1.t.M(i11 | 1));
                                break;
                        }
                        return qy.b0.f48488a;
                    }
                };
                x1VarT.f39502d = eVar;
            }
            return;
        }
        mVar = block;
        sVar.W();
        x1VarT = sVar.t();
        if (x1VarT != null) {
            final int i19 = 1;
            eVar = new fz.e() { // from class: iv.k0
                @Override // fz.e
                public final Object invoke(Object obj, Object obj2) {
                    int i110 = i19;
                    l1.n nVar2 = (l1.n) obj;
                    ((Integer) obj2).intValue();
                    switch (i110) {
                        case 0:
                            a.o(mVar, playAudio, nVar2, l1.t.M(i11 | 1));
                            break;
                        default:
                            a.o(mVar, playAudio, nVar2, l1.t.M(i11 | 1));
                            break;
                    }
                    return qy.b0.f48488a;
                }
            };
            x1VarT.f39502d = eVar;
        }
    }

    public static final void p(kv.e0 e0Var, boolean z11, z1.r rVar, fz.a aVar, l1.n nVar, int i11) {
        long j11;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1435100518);
        int i12 = i11 | (sVar.h(e0Var) ? 4 : 2) | (sVar.f(rVar) ? 256 : 128) | (sVar.h(aVar) ? 2048 : 1024);
        if (sVar.T(i12 & 1, (i12 & 1171) != 1170)) {
            boolean z12 = (i12 & 7168) == 2048;
            Object objQ = sVar.Q();
            if (z12 || objQ == l1.m.f39353a) {
                objQ = new et.p(22, aVar);
                sVar.o0(objQ);
            }
            z1.r rVarC = j0.c.C(iu.k.q((i12 >> 6) & 14, 7, (fz.a) objQ, sVar, rVar, false), CropImageView.DEFAULT_ASPECT_RATIO, 4, 1);
            a2 a2VarA = z1.a(j0.i.f35307e, z1.c.M, sVar, 54);
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
            l1.t.J(y2.j.f56917f, a2VarA, sVar);
            l1.t.J(y2.j.f56916e, q1VarL, sVar);
            y2.h hVar = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
            }
            l1.t.J(y2.j.f56915d, rVarC2, sVar);
            String str = e0Var.f38729a;
            l1.d0 d0Var = ua.f31167a;
            j3.y0 y0Var = (j3.y0) sVar.j(d0Var);
            long jA = j3.A(20);
            n3.s sVar2 = z11 ? n3.s.K : n3.s.f43178t;
            if (z11) {
                sVar.d0(-1741813099);
                j11 = ((s1) sVar.j(v1.f31180a)).f31034q;
                sVar.p(false);
            } else {
                sVar.d0(-1741732530);
                j11 = ((s1) sVar.j(v1.f31180a)).f31036s;
                sVar.p(false);
            }
            ua.b(str, null, 0L, 0L, null, null, null, 0L, new u3.k(3), 0L, 0, false, 0, 0, j3.y0.a(y0Var, j11, jA, sVar2, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), sVar, 0, 0, 65022);
            ua.b(e0Var.f38730b, j0.c.E(z1.o.f58481a, 8, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14), 0L, 0L, null, null, null, 0L, new u3.k(3), 0L, 0, false, 0, 0, j3.y0.a((j3.y0) sVar.j(d0Var), ((s1) sVar.j(v1.f31180a)).f31036s, j3.A(14), null, null, null, 0L, null, null, 0, 0, 0L, null, 16777212), sVar, 48, 0, 65020);
            sVar = sVar;
            sVar.p(true);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new at.d(e0Var, z11, rVar, aVar, i11, 7);
        }
    }

    public static final void q(kv.i0 i0Var, String str, kv.q qVar, fz.c cVar, l1.n nVar, int i11) {
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1920058041);
        int i12 = i11 | (sVar.h(i0Var) ? 4 : 2) | (sVar.f(str) ? 32 : 16) | (sVar.f(qVar) ? 256 : 128) | (sVar.h(cVar) ? 2048 : 1024);
        if (!sVar.T(i12 & 1, (i12 & 1171) != 1170)) {
            sVar.W();
        } else if (qVar instanceof kv.o) {
            sVar.d0(74878473);
            kv.o oVar = (kv.o) qVar;
            v(oVar.f38787a, oVar.f38788b, sVar, 0);
            sVar.p(false);
        } else if (qVar instanceof kv.p) {
            sVar.d0(75044695);
            kv.p pVar = (kv.p) qVar;
            B(pVar.f38801a, pVar.f38802b, pVar.f38803c, sVar, 0);
            sVar.p(false);
        } else if (qVar instanceof kv.n) {
            sVar.d0(75264175);
            kv.n nVar2 = (kv.n) qVar;
            u(nVar2.f38782a, nVar2.f38783b, t1.e.d(1286289794, new fu.n(12, qVar, cVar), sVar), sVar, 384);
            sVar.p(false);
        } else if (qVar instanceof kv.l) {
            sVar.d0(75763306);
            r(i0Var, str, ((kv.l) qVar).f38776a, cVar, sVar, i12 & 7294);
            sVar.p(false);
        } else {
            if (!(qVar instanceof kv.m)) {
                throw nv.p.x(sVar, -1660152999, false);
            }
            sVar.d0(76022404);
            o((kv.m) qVar, cVar, sVar, (i12 >> 6) & 112);
            sVar.p(false);
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new bp.t(i0Var, str, qVar, cVar, i11, 12);
        }
    }

    public static final void r(kv.i0 i0Var, String str, final kv.e0 e0Var, final fz.c cVar, l1.n nVar, int i11) {
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1768732655);
        int i12 = (sVar.h(i0Var) ? 4 : 2) | i11 | (sVar.f(str) ? 32 : 16) | (sVar.h(e0Var) ? 256 : 128) | (sVar.h(cVar) ? 2048 : 1024);
        if (sVar.T(i12 & 1, (i12 & 1171) != 1170)) {
            boolean zEquals = I(i0Var).equals("16");
            l1.g gVar = l1.m.f39353a;
            if (zEquals) {
                sVar.d0(1655964451);
                boolean zH = sVar.h(e0Var) | ((i12 & 7168) == 2048);
                Object objQ = sVar.Q();
                if (zH || objQ == gVar) {
                    final int i13 = 1;
                    objQ = new fz.a() { // from class: iv.g0
                        @Override // fz.a
                        public final Object invoke() {
                            switch (i13) {
                                case 0:
                                    cVar.invoke(e0Var.f38730b);
                                    break;
                                case 1:
                                    cVar.invoke(e0Var.f38730b);
                                    break;
                                default:
                                    cVar.invoke(e0Var.f38730b);
                                    break;
                            }
                            return qy.b0.f48488a;
                        }
                    };
                    sVar.o0(objQ);
                }
                b(e0Var, (fz.a) objQ, sVar, (i12 >> 6) & 14);
                sVar.p(false);
            } else if (ry.l.m0(new String[]{"14", "15"}).contains(I(i0Var))) {
                sVar.d0(1656178537);
                boolean zH2 = sVar.h(e0Var) | ((i12 & 7168) == 2048);
                Object objQ2 = sVar.Q();
                if (zH2 || objQ2 == gVar) {
                    final int i14 = 2;
                    objQ2 = new fz.a() { // from class: iv.g0
                        @Override // fz.a
                        public final Object invoke() {
                            switch (i14) {
                                case 0:
                                    cVar.invoke(e0Var.f38730b);
                                    break;
                                case 1:
                                    cVar.invoke(e0Var.f38730b);
                                    break;
                                default:
                                    cVar.invoke(e0Var.f38730b);
                                    break;
                            }
                            return qy.b0.f48488a;
                        }
                    };
                    sVar.o0(objQ2);
                }
                F(e0Var, (fz.a) objQ2, sVar, (i12 >> 6) & 14);
                sVar.p(false);
            } else {
                sVar.d0(1656361344);
                String str2 = e0Var.f38729a;
                String str3 = e0Var.f38730b;
                boolean zH3 = sVar.h(e0Var) | ((i12 & 7168) == 2048);
                Object objQ3 = sVar.Q();
                if (zH3 || objQ3 == gVar) {
                    final int i15 = 0;
                    objQ3 = new fz.a() { // from class: iv.g0
                        @Override // fz.a
                        public final Object invoke() {
                            switch (i15) {
                                case 0:
                                    cVar.invoke(e0Var.f38730b);
                                    break;
                                case 1:
                                    cVar.invoke(e0Var.f38730b);
                                    break;
                                default:
                                    cVar.invoke(e0Var.f38730b);
                                    break;
                            }
                            return qy.b0.f48488a;
                        }
                    };
                    sVar.o0(objQ3);
                }
                c(str2, str3, false, (fz.a) objQ3, t1.e.d(202242942, new fu.n(11, e0Var, str), sVar), sVar, 24576);
                sVar.p(false);
            }
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new bp.t(i0Var, str, e0Var, cVar, i11, 10);
        }
    }

    public static final void s(kv.i0 i0Var, fz.a aVar, fz.a aVar2, fz.c cVar, l1.n nVar, int i11) {
        int i12;
        fz.c cVar2;
        l1.s sVar;
        y2.h hVar;
        kv.i0 i0Var2 = i0Var;
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(-1874192554);
        if ((i11 & 6) == 0) {
            i12 = (sVar2.h(i0Var2) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar2.h(aVar) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= sVar2.h(aVar2) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar2.h(cVar) ? 2048 : 1024;
        }
        if (sVar2.T(i12 & 1, (i12 & 1171) != 1170)) {
            z1.o oVar = z1.o.f58481a;
            z1.r rVarV = j0.c.v(e2.d(oVar, 1.0f));
            w2.q0 q0VarD = j0.o.d(z1.c.f58463a, false);
            int iHashCode = Long.hashCode(sVar2.T);
            q1 q1VarL = sVar2.l();
            z1.r rVarC = z1.a.c(sVar2, rVarV);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar2.h0();
            if (sVar2.S) {
                sVar2.k(iVar);
            } else {
                sVar2.r0();
            }
            y2.h hVar2 = y2.j.f56917f;
            l1.t.J(hVar2, q0VarD, sVar2);
            y2.h hVar3 = y2.j.f56916e;
            l1.t.J(hVar3, q1VarL, sVar2);
            y2.h hVar4 = y2.j.f56918g;
            if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar2, iHashCode, hVar4);
            }
            y2.h hVar5 = y2.j.f56915d;
            l1.t.J(hVar5, rVarC, sVar2);
            j0.d dVar = j0.i.f35305c;
            z1.h hVar6 = z1.c.O;
            j0.u uVarA = j0.t.a(dVar, hVar6, sVar2, 0);
            int iHashCode2 = Long.hashCode(sVar2.T);
            q1 q1VarL2 = sVar2.l();
            int i13 = i12;
            z1.r rVarC2 = z1.a.c(sVar2, oVar);
            sVar2.h0();
            if (sVar2.S) {
                sVar2.k(iVar);
            } else {
                sVar2.r0();
            }
            l1.t.J(hVar2, uVarA, sVar2);
            l1.t.J(hVar3, q1VarL2, sVar2);
            if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode2))) {
                hVar = hVar4;
                defpackage.e.A(iHashCode2, sVar2, iHashCode2, hVar);
            } else {
                hVar = hVar4;
            }
            l1.t.J(hVar5, rVarC2, sVar2);
            sVar = sVar2;
            y2.h hVar7 = hVar;
            h1.e0.c(t1.e.d(1884568334, new ch.b0(i0Var2, 12), sVar2), null, t1.e.d(-1093633204, new at.o(22, aVar), sVar2), null, CropImageView.DEFAULT_ASPECT_RATIO, null, null, null, sVar, 390, 250);
            j0.c.g(sVar, e2.g(oVar, 10));
            z1.r rVarE = j0.c.E(d0.n.y(d0.n.h(oVar, ((s1) sVar.j(v1.f31180a)).f31033p, g2.f0.f28556b), d0.n.u(sVar), true, 12), CropImageView.DEFAULT_ASPECT_RATIO, j0.f34763c, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13);
            j0.u uVarA2 = j0.t.a(j0.i.g(j0.f34765e), hVar6, sVar, 6);
            int iHashCode3 = Long.hashCode(sVar.T);
            q1 q1VarL3 = sVar.l();
            z1.r rVarC3 = z1.a.c(sVar, rVarE);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar2, uVarA2, sVar);
            l1.t.J(hVar3, q1VarL3, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode3))) {
                defpackage.e.A(iHashCode3, sVar, iHashCode3, hVar7);
            }
            l1.t.J(hVar5, rVarC3, sVar);
            sVar.d0(649594265);
            i0Var2 = i0Var;
            ArrayList arrayList = i0Var2.f38752e;
            int size = arrayList.size();
            int i14 = 0;
            while (i14 < size) {
                Object obj = arrayList.get(i14);
                i14++;
                t(i0Var2, (kv.y) obj, cVar, sVar, (i13 & 14) | ((i13 >> 3) & 896));
            }
            cVar2 = cVar;
            sVar.p(false);
            hh.p0.B(oVar, 72, sVar, true, true);
            j0.a(ub.a.e0(sVar, R.string.start), aVar2, j0.r.f35391a.a(oVar, z1.c.H), null, sVar, (i13 >> 3) & 112, 8);
            sVar.p(true);
        } else {
            cVar2 = cVar;
            sVar = sVar2;
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new cs.a((Object) i0Var2, aVar, (qy.e) aVar2, (qy.e) cVar2, i11, 3);
        }
    }

    public static final void t(kv.i0 i0Var, kv.y yVar, fz.c cVar, l1.n nVar, int i11) {
        int i12;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-1954852802);
        if ((i11 & 6) == 0) {
            i12 = (sVar.h(i0Var) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(yVar) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= sVar.h(cVar) ? 256 : 128;
        }
        if (sVar.T(i12 & 1, (i12 & 147) != 146)) {
            ArrayList arrayListH0 = yVar.f38835d;
            if (arrayListH0.isEmpty()) {
                List listK = ns.o.K(new kv.o(yVar.f38833b, ry.r.f50854a));
                ArrayList arrayList = yVar.f38834c;
                ArrayList arrayList2 = new ArrayList(ry.n.W(arrayList, 10));
                int size = arrayList.size();
                int i13 = 0;
                while (i13 < size) {
                    Object obj = arrayList.get(i13);
                    i13++;
                    arrayList2.add(new kv.l((kv.e0) obj));
                }
                arrayListH0 = ry.m.H0(listK, arrayList2);
            }
            j0.d(e2.e(z1.o.f58481a, 1.0f), t1.e.d(72794833, new br.j(arrayListH0, i0Var, yVar, cVar, 5), sVar), sVar, 54, 0);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new androidx.lifecycle.compose.h(i0Var, yVar, cVar, i11, 14);
        }
    }

    public static final void u(String title, String content, t1.d dVar, l1.n nVar, int i11) {
        kotlin.jvm.internal.m.f(title, "title");
        kotlin.jvm.internal.m.f(content, "content");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-411608086);
        int i12 = (sVar.f(title) ? 4 : 2) | i11 | (sVar.f(content) ? 32 : 16);
        if (sVar.T(i12 & 1, (i12 & 147) != 146)) {
            j0.c(title, j0.c.B(z1.o.f58481a, 16, 8), null, 0.14f, t1.e.d(214903636, new at.p(14, content, dVar), sVar), sVar, (i12 & 14) | 27696, 4);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new fp.e((Object) title, (Object) content, (Object) dVar, i11, 8);
        }
    }

    public static final void v(String text, List list, l1.n nVar, int i11) {
        String str;
        List list2;
        kotlin.jvm.internal.m.f(text, "text");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(424673464);
        int i12 = (sVar.f(text) ? 4 : 2) | i11 | (sVar.h(list) ? 32 : 16);
        if (sVar.T(i12 & 1, (i12 & 19) != 18)) {
            float f5 = j0.f34761a;
            j3.y0 y0Var = ((dc) sVar.j(fc.f30256a)).f30177j;
            float f11 = j0.f34761a;
            str = text;
            list2 = list;
            w(str, list2, y0Var, j0.c.E(z1.o.f58481a, f11, j0.f34762b, f11, CropImageView.DEFAULT_ASPECT_RATIO, 8), sVar, (i12 & 14) | 3072 | (i12 & 112));
        } else {
            str = text;
            list2 = list;
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new fu.n(str, i11, 13, list2);
        }
    }

    public static final void w(final String str, final List list, final j3.y0 y0Var, final z1.r rVar, l1.n nVar, final int i11) {
        int i12;
        List list2;
        l1.s sVar;
        x1 x1VarT;
        fz.e eVar;
        long jB;
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(1907288518);
        int i13 = 2;
        if ((i11 & 6) == 0) {
            i12 = (sVar2.f(str) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            list2 = list;
            i12 |= sVar2.h(list2) ? 32 : 16;
        } else {
            list2 = list;
        }
        if ((i11 & 384) == 0) {
            i12 |= sVar2.f(y0Var) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar2.f(rVar) ? 2048 : 1024;
        }
        if (sVar2.T(i12 & 1, (i12 & 1171) != 1170)) {
            if (list2.isEmpty()) {
                sVar2.d0(1910060601);
                ua.b(str, rVar, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0Var, sVar2, (i12 & 14) | ((i12 >> 6) & 112), (i12 << 12) & 3670016, 65532);
                sVar2.p(false);
                x1VarT = sVar2.t();
                if (x1VarT == null) {
                    return;
                }
                final int i14 = 0;
                eVar = new fz.e() { // from class: iv.l0
                    @Override // fz.e
                    public final Object invoke(Object obj, Object obj2) {
                        switch (i14) {
                            case 0:
                                ((Integer) obj2).getClass();
                                a.w(str, list, y0Var, rVar, (l1.n) obj, l1.t.M(i11 | 1));
                                break;
                            default:
                                ((Integer) obj2).getClass();
                                a.w(str, list, y0Var, rVar, (l1.n) obj, l1.t.M(i11 | 1));
                                break;
                        }
                        return qy.b0.f48488a;
                    }
                };
            } else {
                sVar2.d0(1890368316);
                sVar2.p(false);
                long j11 = ((s1) sVar2.j(v1.f31180a)).f31017a;
                long jE = g2.f0.e(4293212469L);
                long jE2 = g2.f0.e(4280902399L);
                j3.e eVar2 = new j3.e();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    kv.j jVar = (kv.j) it.next();
                    int i15 = r0.f34821a[jVar.f38759c.ordinal()];
                    if (i15 == 1) {
                        jB = j11;
                    } else if (i15 == i13) {
                        jB = jE;
                    } else if (i15 == 3) {
                        jB = jE2;
                    } else {
                        if (i15 != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        jB = y0Var.b();
                    }
                    eVar2.i(new j3.p0(jB, 0L, jVar.f38758b ? n3.s.L : y0Var.f35827a.f35756c, (n3.o) null, (n3.p) null, (n3.i) null, (String) null, 0L, (u3.a) null, (u3.p) null, (q3.b) null, 0L, (u3.l) null, (g2.v0) null, 65530));
                    eVar2.d(jVar.f38757a);
                    eVar2.e();
                    i13 = 2;
                }
                sVar = sVar2;
                ua.c(eVar2.j(), rVar, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, y0Var, sVar, (i12 >> 6) & 112, (i12 << 15) & 29360128, 131068);
            }
            x1VarT.f39502d = eVar;
        }
        sVar = sVar2;
        sVar.W();
        x1VarT = sVar.t();
        if (x1VarT != null) {
            final int i16 = 1;
            eVar = new fz.e() { // from class: iv.l0
                @Override // fz.e
                public final Object invoke(Object obj, Object obj2) {
                    switch (i16) {
                        case 0:
                            ((Integer) obj2).getClass();
                            a.w(str, list, y0Var, rVar, (l1.n) obj, l1.t.M(i11 | 1));
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            a.w(str, list, y0Var, rVar, (l1.n) obj, l1.t.M(i11 | 1));
                            break;
                    }
                    return qy.b0.f48488a;
                }
            };
            x1VarT.f39502d = eVar;
        }
    }

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
    public static final void x(boolean z11, fz.a onClickClose, fz.c loginNow, fz.a onOpenAlphabetChart, fz.a onClickLockedLesson, mv.g0 g0Var, l1.n nVar, int i11) {
        mv.g0 g0Var2;
        int i12;
        mv.g0 g0Var3;
        kv.g0 g0Var4;
        Object x2Var;
        mv.d0 d0Var;
        int i13;
        Boolean bool;
        boolean z12;
        kotlin.jvm.internal.m.f(onClickClose, "onClickClose");
        kotlin.jvm.internal.m.f(loginNow, "loginNow");
        kotlin.jvm.internal.m.f(onOpenAlphabetChart, "onOpenAlphabetChart");
        kotlin.jvm.internal.m.f(onClickLockedLesson, "onClickLockedLesson");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-878872815);
        int i14 = i11 | (sVar.g(z11) ? 4 : 2) | (sVar.h(onClickClose) ? 32 : 16) | (sVar.h(loginNow) ? 256 : 128) | (sVar.h(onOpenAlphabetChart) ? 2048 : 1024) | (sVar.h(onClickLockedLesson) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE) | 65536;
        if (sVar.T(i14 & 1, (74899 & i14) != 74898)) {
            sVar.Y();
            if ((i11 & 1) == 0 || sVar.C()) {
                sVar.d0(-1614864554);
                ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(sVar, LocalViewModelStoreOwner.$stable);
                if (current == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                ViewModel viewModelA = i20.b.a(kotlin.jvm.internal.z.a(mv.g0.class), current.getViewModelStore(), null, i20.a.a(current), null, q10.b.a(sVar), null);
                sVar.p(false);
                i12 = i14 & (-458753);
                g0Var3 = (mv.g0) viewModelA;
            } else {
                sVar.W();
                i12 = i14 & (-458753);
                g0Var3 = g0Var;
            }
            sVar.q();
            l1.b1 b1VarO = l1.t.o(g0Var3.f42211c, sVar);
            Context context = (Context) sVar.j(AndroidCompositionLocals_androidKt.f1200b);
            boolean zF = sVar.f(context) | sVar.f((Configuration) sVar.j(AndroidCompositionLocals_androidKt.f1199a));
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (zF || objQ == gVar) {
                objQ = new kv.a(context);
                sVar.o0(objQ);
            }
            kv.a resolver = (kv.a) objQ;
            mv.e0 e0Var = (mv.e0) b1VarO.getValue();
            if (kotlin.jvm.internal.m.a(e0Var, mv.c0.f42193a)) {
                sVar.d0(1511801792);
                tv.a.d(0, 1, sVar, null);
                sVar.p(false);
            } else {
                if (!(e0Var instanceof mv.d0)) {
                    throw nv.p.x(sVar, 1511809637, false);
                }
                sVar.d0(-378402348);
                mv.d0 d0Var2 = (mv.d0) e0Var;
                boolean zF2 = sVar.f(d0Var2) | sVar.f(resolver);
                Object objQ2 = sVar.Q();
                if (zF2 || objQ2 == gVar) {
                    boolean z13 = d0Var2.f42195a;
                    ArrayList arrayList = d0Var2.f42196b;
                    ArrayList arrayList2 = new ArrayList(ry.n.W(arrayList, 10));
                    int i15 = 0;
                    for (int size = arrayList.size(); i15 < size; size = size) {
                        Object obj = arrayList.get(i15);
                        i15++;
                        arrayList2.add(o00.a.I((kv.j0) obj, resolver));
                    }
                    ArrayList arrayList3 = d0Var2.f42197c;
                    ArrayList arrayList4 = new ArrayList(ry.n.W(arrayList3, 10));
                    int i16 = 0;
                    for (int size2 = arrayList3.size(); i16 < size2; size2 = size2) {
                        Object obj2 = arrayList3.get(i16);
                        i16++;
                        arrayList4.add(o00.a.I((kv.j0) obj2, resolver));
                    }
                    ArrayList arrayList5 = d0Var2.f42198d;
                    ArrayList arrayList6 = new ArrayList(ry.n.W(arrayList5, 10));
                    int size3 = arrayList5.size();
                    int i17 = 0;
                    while (i17 < size3) {
                        Object obj3 = arrayList5.get(i17);
                        i17++;
                        arrayList6.add(o00.a.I((kv.j0) obj3, resolver));
                        arrayList5 = arrayList5;
                    }
                    kv.h0 h0Var = d0Var2.f42199e;
                    if (h0Var != null) {
                        kotlin.jvm.internal.m.f(resolver, "resolver");
                        g0Var4 = new kv.g0(o00.a.I(h0Var.f38746a, resolver), h0Var.f38747b);
                    } else {
                        g0Var4 = null;
                    }
                    String str = d0Var2.f42200f;
                    kv.j0 j0Var = d0Var2.f42201g;
                    kv.i0 i0VarI = j0Var != null ? o00.a.I(j0Var, resolver) : null;
                    kv.j0 j0Var2 = d0Var2.f42202h;
                    objQ2 = new f0(z13, arrayList2, arrayList4, arrayList6, g0Var4, str, i0VarI, j0Var2 != null ? o00.a.I(j0Var2, resolver) : null);
                    sVar.o0(objQ2);
                }
                f0 f0Var = (f0) objQ2;
                j9.v vVarH = cf.x.H(new j9.c0[0], sVar);
                Object objQ3 = sVar.Q();
                if (objQ3 == gVar) {
                    objQ3 = l1.t.B(Boolean.FALSE);
                    sVar.o0(objQ3);
                }
                l1.b1 b1Var = (l1.b1) objQ3;
                Boolean boolValueOf = Boolean.valueOf(d0Var2.f42195a);
                Boolean boolValueOf2 = Boolean.valueOf(z11);
                boolean zH = ((i12 & 14) == 4) | sVar.h(g0Var3) | sVar.h(vVarH) | sVar.h(e0Var);
                Object objQ4 = sVar.Q();
                if (zH || objQ4 == gVar) {
                    d0Var = d0Var2;
                    i13 = 16384;
                    bool = boolValueOf2;
                    z12 = true;
                    x2Var = new x2(z11, g0Var3, vVarH, d0Var, b1Var, (vy.d) null);
                    sVar.o0(x2Var);
                } else {
                    bool = boolValueOf2;
                    x2Var = objQ4;
                    z12 = true;
                    d0Var = d0Var2;
                    i13 = 16384;
                }
                l1.t.g(boolValueOf, bool, (fz.e) x2Var, sVar);
                boolean zH2 = sVar.h(e0Var) | sVar.h(f0Var) | ((i12 & 112) == 32 ? z12 : false) | sVar.h(vVarH) | ((57344 & i12) == i13 ? z12 : false) | sVar.h(g0Var3) | ((i12 & 7168) == 2048 ? z12 : false);
                if ((i12 & 896) != 256) {
                    z12 = false;
                }
                boolean z14 = zH2 | z12;
                Object objQ5 = sVar.Q();
                if (z14 || objQ5 == gVar) {
                    bp.r rVar = new bp.r(f0Var, onClickClose, vVarH, onClickLockedLesson, d0Var, g0Var3, onOpenAlphabetChart, loginNow);
                    sVar.o0(rVar);
                    objQ5 = rVar;
                }
                com.bumptech.glide.e.c(vVarH, "syllable_index", null, null, null, null, null, null, (fz.c) objQ5, sVar, 48);
                sVar.p(false);
            }
            g0Var2 = g0Var3;
        } else {
            sVar.W();
            g0Var2 = g0Var;
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new bt.q1(z11, onClickClose, loginNow, onOpenAlphabetChart, onClickLockedLesson, g0Var2, i11);
        }
    }

    public static final void y(String str, String str2, boolean z11, z1.r rVar, fz.a aVar, l1.n nVar, int i11) {
        int i12;
        l1.s sVar;
        long jC;
        long jC2;
        long jC3;
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(-1688358867);
        if ((i11 & 6) == 0) {
            i12 = i11 | (sVar2.f(str) ? 4 : 2);
        } else {
            i12 = i11;
        }
        int i13 = i12 | (sVar2.f(str2) ? 32 : 16) | (sVar2.f(rVar) ? 2048 : 1024) | (sVar2.h(aVar) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE);
        if (sVar2.T(i13 & 1, (i13 & 9363) != 9362)) {
            float f5 = 1;
            if (z11) {
                sVar2.d0(463353440);
                jC = g2.x.c(((s1) sVar2.j(v1.f31180a)).f31017a, 0.18f);
                sVar2.p(false);
            } else {
                sVar2.d0(463443681);
                jC = g2.x.c(((s1) sVar2.j(v1.f31180a)).A, 0.6f);
                sVar2.p(false);
            }
            d0.v vVarA = d0.n.a(jC, f5);
            if (z11) {
                sVar2.d0(463579647);
                jC2 = g2.x.c(((s1) sVar2.j(v1.f31180a)).f31021c, 0.24f);
                sVar2.p(false);
            } else {
                sVar2.d0(463670012);
                jC2 = ((s1) sVar2.j(v1.f31180a)).f31033p;
                sVar2.p(false);
            }
            if (z11) {
                sVar2.d0(463764872);
                jC3 = g2.x.c(((s1) sVar2.j(v1.f31180a)).f31017a, 0.16f);
                sVar2.p(false);
            } else {
                sVar2.d0(463847177);
                jC3 = g2.x.c(((s1) sVar2.j(v1.f31180a)).A, 0.6f);
                sVar2.p(false);
            }
            sVar = sVar2;
            iu.k.l(aVar, rVar, false, CropImageView.DEFAULT_ASPECT_RATIO, jC2, 0L, jC3, CropImageView.DEFAULT_ASPECT_RATIO, vVarA, t1.e.d(1913374703, new n2(str, z11, str2, 3), sVar2), sVar, ((i13 >> 12) & 14) | 805306368 | ((i13 >> 6) & 112), 172);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new at.q(str, str2, z11, rVar, aVar, i11);
        }
    }

    public static final void z(kv.x xVar, z1.r rVar, fz.c cVar, l1.n nVar, int i11) {
        int i12;
        fz.c cVar2;
        z1.r rVar2;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-1739720341);
        if ((i11 & 6) == 0) {
            i12 = (sVar.h(xVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        int i13 = i12 | 48;
        if ((i11 & 384) == 0) {
            i13 |= sVar.h(cVar) ? 256 : 128;
        }
        if (sVar.T(i13 & 1, (i13 & 147) != 146)) {
            z1.o oVar = z1.o.f58481a;
            z1.r rVarI = e2.i(e2.e(oVar, 1.0f), 56, CropImageView.DEFAULT_ASPECT_RATIO, 2);
            a2 a2VarA = z1.a(j0.i.g(12), z1.c.M, sVar, 54);
            int iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, rVarI);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(y2.j.f56917f, a2VarA, sVar);
            l1.t.J(y2.j.f56916e, q1VarL, sVar);
            y2.h hVar = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
            }
            l1.t.J(y2.j.f56915d, rVarC, sVar);
            kv.e0 e0Var = xVar.f38830a;
            String str = e0Var.f38729a;
            String str2 = e0Var.f38730b;
            c2 c2Var = c2.f35266a;
            z1.r rVarA = c2Var.a(oVar, 2.0f);
            int i14 = i13 & 896;
            boolean zH = (i14 == 256) | sVar.h(xVar);
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (zH || objQ == gVar) {
                objQ = new n0(cVar, xVar, 0);
                sVar.o0(objQ);
            }
            y(str, str2, false, rVarA, (fz.a) objQ, sVar, 384);
            ua.b("→", c2Var.a(oVar, 0.5f), g2.x.c(((s1) sVar.j(v1.f31180a)).f31036s, 0.45f), 0L, null, null, null, 0L, new u3.k(3), 0L, 0, false, 0, 0, ((dc) sVar.j(fc.f30256a)).f30175h, sVar, 6, 0, 65016);
            sVar = sVar;
            String str3 = xVar.f38831b.f38730b;
            z1.r rVarA2 = c2Var.a(oVar, 2.0f);
            boolean zH2 = (i14 == 256) | sVar.h(xVar);
            Object objQ2 = sVar.Q();
            if (zH2 || objQ2 == gVar) {
                cVar2 = cVar;
                objQ2 = new n0(cVar2, xVar, 1);
                sVar.o0(objQ2);
            } else {
                cVar2 = cVar;
            }
            y(BuildConfig.VERSION_NAME, str3, true, rVarA2, (fz.a) objQ2, sVar, 390);
            sVar.p(true);
            rVar2 = oVar;
        } else {
            cVar2 = cVar;
            sVar.W();
            rVar2 = rVar;
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new androidx.lifecycle.compose.h(xVar, rVar2, cVar2, i11, 15);
        }
    }
}
