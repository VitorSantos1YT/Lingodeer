package ys;

import am.rVFB.LwKl;
import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.lingodeer.R;
import com.lingodeer.data.model.CoursePracticeType;
import com.yalantis.ucrop.view.CropImageView;
import dt.y3;
import h1.a6;
import java.util.WeakHashMap;
import rt.dd;
import rt.gc;
import rt.h9;
import rt.l9;
import rt.qc;
import rt.rc;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class p2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f58208a = 400;

    public static final void a(int i11, int i12, fz.a updateScriptShortcutDisplay, l1.n nVar) {
        int i13;
        kotlin.jvm.internal.m.f(updateScriptShortcutDisplay, "updateScriptShortcutDisplay");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-1541998318);
        int i14 = (sVar.d(i11) ? 4 : 2) | i12 | (sVar.h(updateScriptShortcutDisplay) ? 32 : 16);
        if (sVar.T(i14 & 1, (i14 & 19) != 18)) {
            if (i11 != -1) {
                sVar.d0(1298490775);
                if (i11 == 2) {
                    sVar.d0(-96656913);
                    i13 = ry.l.D(new Integer[]{12, 1}, Integer.valueOf(((Number) sVar.j(ju.f.f37370d)).intValue())) ? R.drawable.course_script_display_2 : R.drawable.course_script_display_two_lines_2;
                    sVar.p(false);
                } else if (i11 != 3) {
                    sVar.d0(-96646961);
                    i13 = ry.l.D(new Integer[]{12, 1}, Integer.valueOf(((Number) sVar.j(ju.f.f37370d)).intValue())) ? R.drawable.course_script_display_1 : R.drawable.course_script_display_two_lines_1;
                    sVar.p(false);
                } else {
                    sVar.d0(-96648823);
                    sVar.p(false);
                    i13 = R.drawable.course_script_display_3;
                }
                k2.b bVarY = se.k.y(i13, sVar, 0);
                boolean z11 = (i14 & 112) == 32;
                Object objQ = sVar.Q();
                if (z11 || objQ == l1.m.f39353a) {
                    objQ = new k2(0, updateScriptShortcutDisplay);
                    sVar.o0(objQ);
                }
                d0.n.c(bVarY, null, j0.e2.n(iu.k.q(6, 7, (fz.a) objQ, sVar, z1.o.f58481a, false), 27), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar, 48, 120);
            } else {
                sVar.d0(1256057200);
            }
            sVar.p(false);
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new fu.m(i11, updateScriptShortcutDisplay, i12, 9);
        }
    }

    public static final void b(String title, fz.a onDismissRequest, fz.a onConfirm, l1.n nVar, int i11) {
        l1.s sVar;
        kotlin.jvm.internal.m.f(title, "title");
        kotlin.jvm.internal.m.f(onDismissRequest, "onDismissRequest");
        kotlin.jvm.internal.m.f(onConfirm, "onConfirm");
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(-2074704468);
        int i12 = i11 | (sVar2.f(title) ? 4 : 2) | (sVar2.h(onConfirm) ? 256 : 128);
        if (sVar2.T(i12 & 1, (i12 & 147) != 146)) {
            sVar = sVar2;
            a6.a(onDismissRequest, null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, 0L, null, null, null, t1.e.d(1025841071, new defpackage.d(title, onDismissRequest, onConfirm, 21), sVar2), sVar, 6, 384, 4094);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new bp.c0(title, onDismissRequest, onConfirm, i11);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0224  */
    /* JADX WARN: Code duplicated, block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x007a  */
    /* JADX WARN: Code duplicated, block: B:32:0x007d  */
    /* JADX WARN: Code duplicated, block: B:35:0x0086  */
    /* JADX WARN: Code duplicated, block: B:36:0x0089  */
    /* JADX WARN: Code duplicated, block: B:39:0x0092  */
    /* JADX WARN: Code duplicated, block: B:40:0x0095  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:53:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:56:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:59:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:61:0x012a  */
    /* JADX WARN: Code duplicated, block: B:63:0x0150  */
    /* JADX WARN: Code duplicated, block: B:64:0x0152  */
    /* JADX WARN: Code duplicated, block: B:66:0x0155  */
    /* JADX WARN: Code duplicated, block: B:68:0x015b  */
    /* JADX WARN: Code duplicated, block: B:71:0x016c  */
    /* JADX WARN: Code duplicated, block: B:74:0x0195  */
    /* JADX WARN: Code duplicated, block: B:75:0x0198  */
    /* JADX WARN: Code duplicated, block: B:78:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:79:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:82:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:83:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:87:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:93:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:95:0x0208  */
    /* JADX WARN: Code duplicated, block: B:97:0x020e  */
    /* JADX WARN: Code duplicated, block: B:99:0x0214  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void c(final q2 q2Var, dd ddVar, l9 l9Var, final fz.a onClickClose, fz.c cVar, fz.c cVar2, final fz.a finish, final fz.c loginNow, final fz.c onClickBilling, l1.n nVar, final int i11, final int i12) {
        fz.c cVar3;
        int i13;
        fz.c cVar4;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z11;
        l1.s sVar;
        final dd ddVar2;
        final fz.c cVar5;
        final fz.c cVar6;
        final l9 l9Var2;
        l1.x1 x1VarT;
        int i18;
        l1.g gVar;
        boolean zH;
        Object objQ;
        fz.a aVar;
        LocalViewModelStoreOwner localViewModelStoreOwner;
        int i19;
        ViewModelStoreOwner current;
        dd ddVar3;
        ViewModelStoreOwner current2;
        l9 l9Var3;
        int i21;
        fz.c cVar7;
        fz.c cVar8;
        dd ddVar4;
        Object objQ2;
        j9.v vVarH;
        l1.b1 b1VarH;
        l1.b1 b1VarH2;
        dd ddVar5;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean zF;
        Object objQ3;
        kotlin.jvm.internal.m.f(onClickClose, "onClickClose");
        kotlin.jvm.internal.m.f(finish, "finish");
        kotlin.jvm.internal.m.f(loginNow, "loginNow");
        kotlin.jvm.internal.m.f(onClickBilling, "onClickBilling");
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(-1881879088);
        int i22 = i11 | (sVar2.h(q2Var) ? 4 : 2) | 144 | (sVar2.h(onClickClose) ? 2048 : 1024);
        int i23 = i12 & 16;
        if (i23 != 0) {
            i13 = i22 | 24576;
            cVar3 = cVar;
        } else {
            cVar3 = cVar;
            i13 = i22 | (sVar2.h(cVar3) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE);
        }
        int i24 = i12 & 32;
        if (i24 == 0) {
            if ((i11 & 196608) == 0) {
                cVar4 = cVar2;
                i13 |= sVar2.h(cVar4) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536;
            }
            if (sVar2.h(finish)) {
                i14 = 1048576;
            } else {
                i14 = 524288;
            }
            int i25 = i13 | i14;
            if (sVar2.h(loginNow)) {
                i15 = 8388608;
            } else {
                i15 = 4194304;
            }
            int i26 = i25 | i15;
            if (sVar2.h(onClickBilling)) {
                i16 = 67108864;
            } else {
                i16 = 33554432;
            }
            i17 = i26 | i16;
            if ((38347923 & i17) != 38347922) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (sVar2.T(i17 & 1, z11)) {
                sVar2.Y();
                i18 = i11 & 1;
                gVar = l1.m.f39353a;
                if (i18 != 0 || sVar2.C()) {
                    zH = sVar2.h(q2Var);
                    objQ = sVar2.Q();
                    if (zH || objQ == gVar) {
                        objQ = new xa.a(q2Var, 11);
                        sVar2.o0(objQ);
                    }
                    aVar = (fz.a) objQ;
                    sVar2.d0(-1614864554);
                    localViewModelStoreOwner = LocalViewModelStoreOwner.INSTANCE;
                    i19 = LocalViewModelStoreOwner.$stable;
                    current = localViewModelStoreOwner.getCurrent(sVar2, i19);
                    if (current == null) {
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    }
                    ViewModel viewModelA = i20.b.a(kotlin.jvm.internal.z.a(dd.class), current.getViewModelStore(), null, i20.a.a(current), null, q10.b.a(sVar2), aVar);
                    sVar2.p(false);
                    ddVar3 = (dd) viewModelA;
                    sVar2.d0(-1614864554);
                    current2 = localViewModelStoreOwner.getCurrent(sVar2, i19);
                    if (current2 == null) {
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    }
                    ViewModel viewModelA2 = i20.b.a(kotlin.jvm.internal.z.a(l9.class), current2.getViewModelStore(), null, i20.a.a(current2), null, q10.b.a(sVar2), null);
                    sVar2.p(false);
                    l9Var3 = (l9) viewModelA2;
                    i21 = i17 & (-1009);
                    if (i23 != 0) {
                        cVar7 = null;
                    } else {
                        cVar7 = cVar3;
                    }
                    if (i24 != 0) {
                        objQ2 = sVar2.Q();
                        if (objQ2 == gVar) {
                            objQ2 = new xt.r(29);
                            sVar2.o0(objQ2);
                        }
                        cVar8 = (fz.c) objQ2;
                    } else {
                        cVar8 = cVar4;
                    }
                    ddVar4 = ddVar3;
                } else {
                    sVar2.W();
                    i21 = i17 & (-1009);
                    ddVar4 = ddVar;
                    l9Var3 = l9Var;
                    cVar7 = cVar3;
                    cVar8 = cVar4;
                }
                sVar2.q();
                vVarH = cf.x.H(new j9.c0[0], sVar2);
                b1VarH = l1.t.H(cVar7, sVar2);
                b1VarH2 = l1.t.H(cVar8, sVar2);
                boolean zH2 = sVar2.h(ddVar4) | sVar2.h(l9Var3);
                ddVar5 = ddVar4;
                if ((i21 & 234881024) == 67108864) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                boolean zH3 = zH2 | z12 | sVar2.h(q2Var);
                if ((i21 & 7168) == 2048) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                boolean zH4 = zH3 | z13 | sVar2.h(vVarH);
                if ((29360128 & i21) == 8388608) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                zF = zH4 | z14 | ((i21 & 3670016) == 1048576) | sVar2.f(b1VarH) | sVar2.f(b1VarH2);
                objQ3 = sVar2.Q();
                if (zF || objQ3 == gVar) {
                    in.i iVar = new in.i(ddVar5, l9Var3, onClickBilling, q2Var, onClickClose, vVarH, loginNow, finish, b1VarH, b1VarH2, 2);
                    sVar2.o0(iVar);
                    objQ3 = iVar;
                }
                com.bumptech.glide.e.c(vVarH, "course_test", null, null, null, null, null, null, (fz.c) objQ3, sVar2, 48);
                sVar = sVar2;
                l9Var2 = l9Var3;
                cVar5 = cVar7;
                cVar6 = cVar8;
                ddVar2 = ddVar5;
            } else {
                sVar = sVar2;
                sVar.W();
                ddVar2 = ddVar;
                cVar5 = cVar3;
                cVar6 = cVar4;
                l9Var2 = l9Var;
            }
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new fz.e() { // from class: ys.m2
                    @Override // fz.e
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        p2.c(q2Var, ddVar2, l9Var2, onClickClose, cVar5, cVar6, finish, loginNow, onClickBilling, (l1.n) obj, l1.t.M(i11 | 1), i12);
                        return qy.b0.f48488a;
                    }
                };
            }
        }
        i13 |= 196608;
        cVar4 = cVar2;
        if (sVar2.h(finish)) {
            i14 = 1048576;
        } else {
            i14 = 524288;
        }
        int i27 = i13 | i14;
        if (sVar2.h(loginNow)) {
            i15 = 8388608;
        } else {
            i15 = 4194304;
        }
        int i28 = i27 | i15;
        if (sVar2.h(onClickBilling)) {
            i16 = 67108864;
        } else {
            i16 = 33554432;
        }
        i17 = i28 | i16;
        if ((38347923 & i17) != 38347922) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (sVar2.T(i17 & 1, z11)) {
            sVar2.Y();
            i18 = i11 & 1;
            gVar = l1.m.f39353a;
            if (i18 != 0) {
                zH = sVar2.h(q2Var);
                objQ = sVar2.Q();
                if (zH) {
                    objQ = new xa.a(q2Var, 11);
                    sVar2.o0(objQ);
                } else {
                    objQ = new xa.a(q2Var, 11);
                    sVar2.o0(objQ);
                }
                aVar = (fz.a) objQ;
                sVar2.d0(-1614864554);
                localViewModelStoreOwner = LocalViewModelStoreOwner.INSTANCE;
                i19 = LocalViewModelStoreOwner.$stable;
                current = localViewModelStoreOwner.getCurrent(sVar2, i19);
                if (current == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                ViewModel viewModelA3 = i20.b.a(kotlin.jvm.internal.z.a(dd.class), current.getViewModelStore(), null, i20.a.a(current), null, q10.b.a(sVar2), aVar);
                sVar2.p(false);
                ddVar3 = (dd) viewModelA3;
                sVar2.d0(-1614864554);
                current2 = localViewModelStoreOwner.getCurrent(sVar2, i19);
                if (current2 == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                ViewModel viewModelA4 = i20.b.a(kotlin.jvm.internal.z.a(l9.class), current2.getViewModelStore(), null, i20.a.a(current2), null, q10.b.a(sVar2), null);
                sVar2.p(false);
                l9Var3 = (l9) viewModelA4;
                i21 = i17 & (-1009);
                if (i23 != 0) {
                    cVar7 = null;
                } else {
                    cVar7 = cVar3;
                }
                if (i24 != 0) {
                    objQ2 = sVar2.Q();
                    if (objQ2 == gVar) {
                        objQ2 = new xt.r(29);
                        sVar2.o0(objQ2);
                    }
                    cVar8 = (fz.c) objQ2;
                } else {
                    cVar8 = cVar4;
                }
                ddVar4 = ddVar3;
            } else {
                zH = sVar2.h(q2Var);
                objQ = sVar2.Q();
                if (zH) {
                    objQ = new xa.a(q2Var, 11);
                    sVar2.o0(objQ);
                } else {
                    objQ = new xa.a(q2Var, 11);
                    sVar2.o0(objQ);
                }
                aVar = (fz.a) objQ;
                sVar2.d0(-1614864554);
                localViewModelStoreOwner = LocalViewModelStoreOwner.INSTANCE;
                i19 = LocalViewModelStoreOwner.$stable;
                current = localViewModelStoreOwner.getCurrent(sVar2, i19);
                if (current == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                ViewModel viewModelA5 = i20.b.a(kotlin.jvm.internal.z.a(dd.class), current.getViewModelStore(), null, i20.a.a(current), null, q10.b.a(sVar2), aVar);
                sVar2.p(false);
                ddVar3 = (dd) viewModelA5;
                sVar2.d0(-1614864554);
                current2 = localViewModelStoreOwner.getCurrent(sVar2, i19);
                if (current2 == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                ViewModel viewModelA6 = i20.b.a(kotlin.jvm.internal.z.a(l9.class), current2.getViewModelStore(), null, i20.a.a(current2), null, q10.b.a(sVar2), null);
                sVar2.p(false);
                l9Var3 = (l9) viewModelA6;
                i21 = i17 & (-1009);
                if (i23 != 0) {
                    cVar7 = null;
                } else {
                    cVar7 = cVar3;
                }
                if (i24 != 0) {
                    objQ2 = sVar2.Q();
                    if (objQ2 == gVar) {
                        objQ2 = new xt.r(29);
                        sVar2.o0(objQ2);
                    }
                    cVar8 = (fz.c) objQ2;
                } else {
                    cVar8 = cVar4;
                }
                ddVar4 = ddVar3;
            }
            sVar2.q();
            vVarH = cf.x.H(new j9.c0[0], sVar2);
            b1VarH = l1.t.H(cVar7, sVar2);
            b1VarH2 = l1.t.H(cVar8, sVar2);
            boolean zH5 = sVar2.h(ddVar4) | sVar2.h(l9Var3);
            ddVar5 = ddVar4;
            if ((i21 & 234881024) == 67108864) {
                z12 = true;
            } else {
                z12 = false;
            }
            boolean zH6 = zH5 | z12 | sVar2.h(q2Var);
            if ((i21 & 7168) == 2048) {
                z13 = true;
            } else {
                z13 = false;
            }
            boolean zH7 = zH6 | z13 | sVar2.h(vVarH);
            if ((29360128 & i21) == 8388608) {
                z14 = true;
            } else {
                z14 = false;
            }
            zF = zH7 | z14 | ((i21 & 3670016) == 1048576) | sVar2.f(b1VarH) | sVar2.f(b1VarH2);
            objQ3 = sVar2.Q();
            if (zF) {
                in.i iVar2 = new in.i(ddVar5, l9Var3, onClickBilling, q2Var, onClickClose, vVarH, loginNow, finish, b1VarH, b1VarH2, 2);
                sVar2.o0(iVar2);
                objQ3 = iVar2;
            } else {
                in.i iVar3 = new in.i(ddVar5, l9Var3, onClickBilling, q2Var, onClickClose, vVarH, loginNow, finish, b1VarH, b1VarH2, 2);
                sVar2.o0(iVar3);
                objQ3 = iVar3;
            }
            com.bumptech.glide.e.c(vVarH, "course_test", null, null, null, null, null, null, (fz.c) objQ3, sVar2, 48);
            sVar = sVar2;
            l9Var2 = l9Var3;
            cVar5 = cVar7;
            cVar6 = cVar8;
            ddVar2 = ddVar5;
        } else {
            sVar = sVar2;
            sVar.W();
            ddVar2 = ddVar;
            cVar5 = cVar3;
            cVar6 = cVar4;
            l9Var2 = l9Var;
        }
        x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new fz.e() { // from class: ys.m2
                @Override // fz.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    p2.c(q2Var, ddVar2, l9Var2, onClickClose, cVar5, cVar6, finish, loginNow, onClickBilling, (l1.n) obj, l1.t.M(i11 | 1), i12);
                    return qy.b0.f48488a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:153:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:156:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:158:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:161:0x0304  */
    /* JADX WARN: Code duplicated, block: B:162:0x0306  */
    /* JADX WARN: Code duplicated, block: B:168:0x0313  */
    /* JADX WARN: Code duplicated, block: B:171:0x032b  */
    /* JADX WARN: Code duplicated, block: B:172:0x032d  */
    /* JADX WARN: Code duplicated, block: B:178:0x033b  */
    /* JADX WARN: Code duplicated, block: B:181:0x034e  */
    /* JADX WARN: Code duplicated, block: B:182:0x0350  */
    /* JADX WARN: Code duplicated, block: B:188:0x035d  */
    /* JADX WARN: Code duplicated, block: B:191:0x0395  */
    /* JADX WARN: Code duplicated, block: B:194:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:197:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:203:0x03d8  */
    /* JADX WARN: Code duplicated, block: B:206:0x03df  */
    /* JADX WARN: Code duplicated, block: B:209:0x03f2  */
    /* JADX WARN: Code duplicated, block: B:212:0x0403  */
    /* JADX WARN: Code duplicated, block: B:213:0x0405  */
    /* JADX WARN: Code duplicated, block: B:216:0x040c  */
    /* JADX WARN: Code duplicated, block: B:217:0x040e  */
    /* JADX WARN: Code duplicated, block: B:220:0x0416  */
    /* JADX WARN: Code duplicated, block: B:221:0x0418  */
    /* JADX WARN: Code duplicated, block: B:224:0x0420  */
    /* JADX WARN: Code duplicated, block: B:225:0x0422  */
    /* JADX WARN: Code duplicated, block: B:229:0x042c  */
    /* JADX WARN: Code duplicated, block: B:234:0x0469  */
    /* JADX WARN: Code duplicated, block: B:237:0x0484  */
    /* JADX WARN: Code duplicated, block: B:240:0x049c  */
    /* JADX WARN: Code duplicated, block: B:243:0x04a9  */
    /* JADX WARN: Code duplicated, block: B:246:0x04b1  */
    /* JADX WARN: Code duplicated, block: B:247:0x04b4  */
    /* JADX WARN: Code duplicated, block: B:265:0x0514  */
    /* JADX WARN: Code duplicated, block: B:268:0x0552  */
    /* JADX WARN: Code duplicated, block: B:269:0x0554  */
    /* JADX WARN: Code duplicated, block: B:273:0x055e  */
    /* JADX WARN: Code duplicated, block: B:276:0x0572  */
    /* JADX WARN: Code duplicated, block: B:277:0x0574  */
    /* JADX WARN: Code duplicated, block: B:281:0x057e  */
    /* JADX WARN: Code duplicated, block: B:284:0x0593  */
    /* JADX WARN: Code duplicated, block: B:285:0x0595  */
    /* JADX WARN: Code duplicated, block: B:289:0x059f  */
    /* JADX WARN: Code duplicated, block: B:292:0x05b1  */
    /* JADX WARN: Code duplicated, block: B:293:0x05b4  */
    /* JADX WARN: Code duplicated, block: B:297:0x05bd  */
    /* JADX WARN: Code duplicated, block: B:300:0x05d3  */
    /* JADX WARN: Code duplicated, block: B:306:0x05e1  */
    public static final void d(final rc uiState, final gc progressUiState, final h9 settingsUiState, final qs.b bVar, final CoursePracticeType practiceType, final long j11, final fz.c bookmarkUiStateFor, final fz.e bookmarkUiStateForItem, final fz.c onToggleBookmarkFor, final fz.f fVar, final fz.c knowledgeNoteUiStateFor, final fz.e onSaveKnowledgeNoteFor, final fz.c onConfirmSettings, final fz.e onConfirmQuestionPreference, final fz.c onResetQuestionPreference, final fz.e onChecked, final fz.e onWordMatchFailed, final fz.e onWordMatchSuccess, final fz.a onShowNext, final fz.c onSkip, final fz.a aVar, final fz.a onClickClose, final fz.a showFinishScreen, final fz.c onClickBilling, l1.n nVar, final int i11) {
        l1.s sVar;
        Object objQ;
        l1.b1 b1Var;
        l1.s sVar2;
        l1.g gVar;
        boolean z11;
        int i12;
        Object objQ2;
        l1.b1 b1Var2;
        l1.b1 b1Var3;
        int i13;
        Object objQ3;
        Object objQ4;
        l1.b1 b1Var4;
        qc qcVar;
        long j12;
        char c11;
        boolean z12;
        l1.s sVar3;
        boolean z13;
        int i14;
        l1.s sVar4;
        boolean z14;
        boolean z15;
        Object objQ5;
        boolean z16;
        Object objQ6;
        boolean z17;
        Object objQ7;
        boolean z18;
        Object objQ8;
        Object objQ9;
        boolean z19;
        Object objQ10;
        Object objQ11;
        boolean z20;
        boolean z21;
        boolean z22;
        boolean z23;
        boolean z24;
        Object objQ12;
        int i15;
        Object objQ13;
        boolean z25;
        Object objQ14;
        boolean z26;
        boolean z27;
        Object objQ15;
        boolean z28;
        Object objQ16;
        ot.j1 j1Var;
        kotlin.jvm.internal.m.f(uiState, "uiState");
        kotlin.jvm.internal.m.f(progressUiState, "progressUiState");
        kotlin.jvm.internal.m.f(settingsUiState, "settingsUiState");
        kotlin.jvm.internal.m.f(practiceType, "practiceType");
        kotlin.jvm.internal.m.f(bookmarkUiStateFor, "bookmarkUiStateFor");
        kotlin.jvm.internal.m.f(bookmarkUiStateForItem, "bookmarkUiStateForItem");
        kotlin.jvm.internal.m.f(onToggleBookmarkFor, "onToggleBookmarkFor");
        kotlin.jvm.internal.m.f(fVar, LwKl.HLJuvHHQbeNB);
        kotlin.jvm.internal.m.f(knowledgeNoteUiStateFor, "knowledgeNoteUiStateFor");
        kotlin.jvm.internal.m.f(onSaveKnowledgeNoteFor, "onSaveKnowledgeNoteFor");
        kotlin.jvm.internal.m.f(onConfirmSettings, "onConfirmSettings");
        kotlin.jvm.internal.m.f(onConfirmQuestionPreference, "onConfirmQuestionPreference");
        kotlin.jvm.internal.m.f(onResetQuestionPreference, "onResetQuestionPreference");
        kotlin.jvm.internal.m.f(onChecked, "onChecked");
        kotlin.jvm.internal.m.f(onWordMatchFailed, "onWordMatchFailed");
        kotlin.jvm.internal.m.f(onWordMatchSuccess, "onWordMatchSuccess");
        kotlin.jvm.internal.m.f(onShowNext, "onShowNext");
        kotlin.jvm.internal.m.f(onSkip, "onSkip");
        kotlin.jvm.internal.m.f(onClickClose, "onClickClose");
        kotlin.jvm.internal.m.f(showFinishScreen, "showFinishScreen");
        kotlin.jvm.internal.m.f(onClickBilling, "onClickBilling");
        l1.s sVar5 = (l1.s) nVar;
        sVar5.f0(-2083024692);
        int i16 = i11 | (sVar5.f(uiState) ? 4 : 2) | (sVar5.f(progressUiState) ? 32 : 16) | (sVar5.f(settingsUiState) ? 256 : 128) | (sVar5.h(bVar) ? 2048 : 1024);
        boolean zD = sVar5.d(practiceType.ordinal());
        int i17 = OSSConstants.DEFAULT_BUFFER_SIZE;
        int i18 = i16 | (zD ? 16384 : 8192) | (sVar5.e(j11) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536) | (sVar5.h(bookmarkUiStateFor) ? 1048576 : 524288) | (sVar5.h(bookmarkUiStateForItem) ? 8388608 : 4194304) | (sVar5.h(onToggleBookmarkFor) ? 67108864 : 33554432) | (sVar5.h(fVar) ? 536870912 : 268435456);
        int i19 = (sVar5.h(knowledgeNoteUiStateFor) ? 4 : 2) | (sVar5.h(onSaveKnowledgeNoteFor) ? 32 : 16) | (sVar5.h(onConfirmSettings) ? 256 : 128) | (sVar5.h(onConfirmQuestionPreference) ? 2048 : 1024);
        if (sVar5.h(onResetQuestionPreference)) {
            i17 = 16384;
        }
        int i21 = i19 | i17 | (sVar5.h(onChecked) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536) | (sVar5.h(onWordMatchFailed) ? 1048576 : 524288) | (sVar5.h(onWordMatchSuccess) ? 8388608 : 4194304) | (sVar5.h(onShowNext) ? 67108864 : 33554432) | (sVar5.h(onSkip) ? 536870912 : 268435456);
        int i22 = (sVar5.h(aVar) ? (char) 4 : (char) 2) | (sVar5.h(onClickClose) ? ' ' : (char) 16) | (sVar5.h(showFinishScreen) ? (char) 256 : (char) 128) | (sVar5.h(onClickBilling) ? (char) 2048 : (char) 1024);
        if (sVar5.T(i18 & 1, ((i18 & 306783379) == 306783378 && (i21 & 306783379) == 306783378 && (i22 & 1171) == 1170) ? false : true)) {
            sVar5.Y();
            if ((i11 & 1) != 0 && !sVar5.C()) {
                sVar5.W();
            }
            sVar5.q();
            Object objQ17 = sVar5.Q();
            l1.g gVar2 = l1.m.f39353a;
            if (objQ17 == gVar2) {
                objQ17 = l1.t.B(Boolean.FALSE);
                sVar5.o0(objQ17);
            }
            l1.b1 b1Var5 = (l1.b1) objQ17;
            v3.c cVar = (v3.c) sVar5.j(z2.g1.f58547h);
            sVar5.d0(-331921784);
            WeakHashMap weakHashMap = j0.o2.f35353v;
            float fQ = cVar.Q(j0.b.e(sVar5).f35356c.e().f48796d);
            sVar5.p(false);
            boolean z29 = (v3.f.a(fQ, (float) 0) > 0) && v3.f.a(((float) ((Configuration) sVar5.j(AndroidCompositionLocals_androidKt.f1199a)).screenHeightDp) - fQ, f58208a) < 0;
            boolean z30 = uiState instanceof qc;
            qc qcVar2 = z30 ? (qc) uiState : null;
            ht.o oVarA = (qcVar2 == null || (j1Var = qcVar2.f50301a) == null) ? null : j1Var.a();
            if (z29 && oVarA != null) {
                int i23 = oVarA.f33753a;
                int i24 = oVarA.f33755c;
                boolean z31 = (i23 == 1 && i24 == 13) || (i23 == 0 && (i24 == 5 || i24 == 9 || i24 == 10));
                objQ = sVar5.Q();
                if (objQ == gVar2) {
                    objQ = l1.t.B(Boolean.FALSE);
                    sVar5.o0(objQ);
                }
                b1Var = (l1.b1) objQ;
                if (((Boolean) b1Var.getValue()).booleanValue()) {
                    sVar5.d0(-1698995786);
                    objQ13 = sVar5.Q();
                    if (objQ13 == gVar2) {
                        objQ13 = new d1(10, b1Var);
                        sVar5.o0(objQ13);
                    }
                    fz.a aVar2 = (fz.a) objQ13;
                    if ((i21 & 896) == 256) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    objQ14 = sVar5.Q();
                    if (z25 || objQ14 == gVar2) {
                        objQ14 = new xu.n1(onConfirmSettings, 10);
                        sVar5.o0(objQ14);
                    }
                    fz.c cVar2 = (fz.c) objQ14;
                    boolean zH = sVar5.h(bVar);
                    if ((i21 & 7168) == 2048) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    z27 = zH | z26;
                    objQ15 = sVar5.Q();
                    if (z27 || objQ15 == gVar2) {
                        objQ15 = new d2(bVar, onConfirmQuestionPreference, 1);
                        sVar5.o0(objQ15);
                    }
                    fz.c cVar3 = (fz.c) objQ15;
                    if ((i21 & 57344) == 16384) {
                        z28 = true;
                    } else {
                        z28 = false;
                    }
                    objQ16 = sVar5.Q();
                    if (z28 || objQ16 == gVar2) {
                        objQ16 = new xu.n1(onResetQuestionPreference, 11);
                        sVar5.o0(objQ16);
                    }
                    int i25 = i18 >> 6;
                    gVar = gVar2;
                    z11 = false;
                    i12 = 2048;
                    a.w(settingsUiState, bVar, false, false, aVar2, cVar2, cVar3, (fz.c) objQ16, sVar5, (i25 & 14) | 24576 | (i25 & 112), 12);
                    sVar2 = sVar5;
                } else {
                    sVar2 = sVar5;
                    gVar = gVar2;
                    z11 = false;
                    i12 = 2048;
                    sVar2.d0(-1728605002);
                }
                sVar2.p(z11);
                objQ2 = sVar2.Q();
                if (objQ2 == gVar) {
                    objQ2 = l1.t.B(Boolean.FALSE);
                    sVar2.o0(objQ2);
                }
                b1Var2 = (l1.b1) objQ2;
                if (((Boolean) b1Var2.getValue()).booleanValue()) {
                    sVar2.d0(-1698209936);
                    if (practiceType != CoursePracticeType.COURSE_REVIEW_WORD_SENT || practiceType == CoursePracticeType.CHARACTER_DRILL) {
                        z19 = true;
                    } else {
                        z19 = z11;
                    }
                    objQ10 = sVar2.Q();
                    if (objQ10 == gVar) {
                        objQ10 = new d1(11, b1Var2);
                        sVar2.o0(objQ10);
                    }
                    fz.a aVar3 = (fz.a) objQ10;
                    objQ11 = sVar2.Q();
                    if (objQ11 == gVar) {
                        objQ11 = new d1(12, b1Var2);
                        sVar2.o0(objQ11);
                    }
                    fz.a aVar4 = (fz.a) objQ11;
                    if ((i18 & 57344) == 16384) {
                        z20 = true;
                    } else {
                        z20 = z11;
                    }
                    if ((i18 & 112) != 32) {
                        z21 = z11;
                    } else {
                        z21 = true;
                    }
                    boolean z32 = z20 | z21;
                    if ((r20 & 896) == 256) {
                        z22 = true;
                    } else {
                        z22 = z11;
                    }
                    boolean z33 = z32 | z22;
                    if ((r20 & 112) == 32) {
                        z23 = true;
                    } else {
                        z23 = z11;
                    }
                    z24 = z33 | z23;
                    objQ12 = sVar2.Q();
                    if (!z24 || objQ12 == gVar) {
                        i15 = r20;
                        bp.x1 x1Var = new bp.x1(practiceType, progressUiState, showFinishScreen, onClickClose, b1Var2);
                        b1Var3 = b1Var2;
                        sVar2.o0(x1Var);
                        objQ12 = x1Var;
                    } else {
                        i15 = i22;
                        b1Var3 = b1Var2;
                    }
                    i13 = i15;
                    tv.a.i(z19, aVar3, aVar4, (fz.a) objQ12, sVar2, 432);
                } else {
                    onChecked = onChecked;
                    b1Var = b1Var;
                    b1Var3 = b1Var2;
                    i12 = i12;
                    i13 = r20;
                    sVar2.d0(-1728605002);
                }
                sVar2.p(z11);
                objQ3 = sVar2.Q();
                if (objQ3 == gVar) {
                    objQ3 = new d1(13, b1Var3);
                    sVar2.o0(objQ3);
                }
                se.i.a(z11, (fz.a) objQ3, sVar2, 48, 1);
                objQ4 = sVar2.Q();
                if (objQ4 == gVar) {
                    objQ4 = l1.t.B(Boolean.FALSE);
                    sVar2.o0(objQ4);
                }
                b1Var4 = (l1.b1) objQ4;
                qcVar = z30 ? (qc) uiState : null;
                if (qcVar != null) {
                    j12 = qcVar.f50303c;
                } else {
                    j12 = -1;
                }
                if (((Boolean) b1Var4.getValue()).booleanValue() || j12 <= 0) {
                    c11 = '0';
                    z12 = true;
                    sVar3 = sVar2;
                    z13 = false;
                    sVar3.d0(-1728605002);
                } else {
                    sVar2.d0(-1697238179);
                    Object objQ18 = sVar2.Q();
                    if (objQ18 == gVar) {
                        objQ18 = new d1(14, b1Var4);
                        sVar2.o0(objQ18);
                    }
                    fz.a aVar5 = (fz.a) objQ18;
                    boolean z34 = (i13 & 7168) == i12;
                    Object objQ19 = sVar2.Q();
                    if (z34 || objQ19 == gVar) {
                        objQ19 = new xu.w0(onClickBilling, 15);
                        sVar2.o0(objQ19);
                    }
                    fz.a aVar6 = (fz.a) objQ19;
                    c11 = '0';
                    z12 = true;
                    j3.c(j12, aVar5, aVar6, sVar2, 48);
                    sVar3 = sVar2;
                    z13 = false;
                }
                sVar3.p(z13);
                i14 = i13;
                sVar4 = sVar3;
                z14 = z13;
                t1.d dVarD = t1.e.d(1893965181, new bt.h(z31, progressUiState, uiState, b1Var5, b1Var3, practiceType, settingsUiState, aVar, b1Var4, b1Var), sVar4);
                if ((i21 & 458752) == 131072) {
                    z15 = true;
                } else {
                    z15 = z14;
                }
                objQ5 = sVar4.Q();
                if (z15 || objQ5 == gVar) {
                    objQ5 = new pr.y(26, onChecked, b1Var5);
                    sVar4.o0(objQ5);
                }
                fz.e eVar = (fz.e) objQ5;
                if ((i21 & 234881024) == 67108864) {
                    z16 = true;
                } else {
                    z16 = z14;
                }
                objQ6 = sVar4.Q();
                if (z16 || objQ6 == gVar) {
                    objQ6 = new xu.e1(4, onShowNext, b1Var5);
                    sVar4.o0(objQ6);
                }
                fz.a aVar7 = (fz.a) objQ6;
                if ((i21 & 1879048192) == 536870912) {
                    z17 = true;
                } else {
                    z17 = z14;
                }
                objQ7 = sVar4.Q();
                if (z17 || objQ7 == gVar) {
                    objQ7 = new y3(onSkip, b1Var5, 20);
                    sVar4.o0(objQ7);
                }
                fz.c cVar4 = (fz.c) objQ7;
                if ((i18 & 112) != 32) {
                    z18 = z14;
                } else {
                    z18 = true;
                }
                objQ8 = sVar4.Q();
                if (z18 || objQ8 == gVar) {
                    objQ8 = new xa.a(progressUiState, 10);
                    sVar4.o0(objQ8);
                }
                fz.a aVar8 = (fz.a) objQ8;
                if ((i14 & 896) == 256) {
                    z14 = true;
                }
                objQ9 = sVar4.Q();
                if (z14 || objQ9 == gVar) {
                    objQ9 = new k2(1, showFinishScreen);
                    sVar4.o0(objQ9);
                }
                int i26 = i18 >> 3;
                int i27 = i21 >> 12;
                a.n(uiState, settingsUiState, true, false, j11, bookmarkUiStateFor, onToggleBookmarkFor, bookmarkUiStateForItem, fVar, knowledgeNoteUiStateFor, onSaveKnowledgeNoteFor, dVarD, onWordMatchFailed, onWordMatchSuccess, eVar, aVar7, cVar4, aVar8, (fz.a) objQ9, sVar4, (458752 & i26) | (i18 & 14) | 384 | (i26 & 112) | (i26 & 57344) | (3670016 & (i18 >> 6)) | (i18 & 29360128) | (234881024 & i26) | ((i21 << 27) & 1879048192), ((i21 >> 3) & 14) | 48 | (i27 & 896) | (i27 & 7168), 8);
                sVar = sVar4;
            }
            objQ = sVar5.Q();
            if (objQ == gVar2) {
                objQ = l1.t.B(Boolean.FALSE);
                sVar5.o0(objQ);
            }
            b1Var = (l1.b1) objQ;
            if (((Boolean) b1Var.getValue()).booleanValue()) {
                sVar5.d0(-1698995786);
                objQ13 = sVar5.Q();
                if (objQ13 == gVar2) {
                    objQ13 = new d1(10, b1Var);
                    sVar5.o0(objQ13);
                }
                fz.a aVar9 = (fz.a) objQ13;
                if ((i21 & 896) == 256) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                objQ14 = sVar5.Q();
                if (z25) {
                    objQ14 = new xu.n1(onConfirmSettings, 10);
                    sVar5.o0(objQ14);
                } else {
                    objQ14 = new xu.n1(onConfirmSettings, 10);
                    sVar5.o0(objQ14);
                }
                fz.c cVar5 = (fz.c) objQ14;
                boolean zH2 = sVar5.h(bVar);
                if ((i21 & 7168) == 2048) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                z27 = zH2 | z26;
                objQ15 = sVar5.Q();
                if (z27) {
                    objQ15 = new d2(bVar, onConfirmQuestionPreference, 1);
                    sVar5.o0(objQ15);
                } else {
                    objQ15 = new d2(bVar, onConfirmQuestionPreference, 1);
                    sVar5.o0(objQ15);
                }
                fz.c cVar6 = (fz.c) objQ15;
                if ((i21 & 57344) == 16384) {
                    z28 = true;
                } else {
                    z28 = false;
                }
                objQ16 = sVar5.Q();
                if (z28) {
                    objQ16 = new xu.n1(onResetQuestionPreference, 11);
                    sVar5.o0(objQ16);
                } else {
                    objQ16 = new xu.n1(onResetQuestionPreference, 11);
                    sVar5.o0(objQ16);
                }
                int i28 = i18 >> 6;
                gVar = gVar2;
                z11 = false;
                i12 = 2048;
                a.w(settingsUiState, bVar, false, false, aVar9, cVar5, cVar6, (fz.c) objQ16, sVar5, (i28 & 14) | 24576 | (i28 & 112), 12);
                sVar2 = sVar5;
            } else {
                sVar2 = sVar5;
                gVar = gVar2;
                z11 = false;
                i12 = 2048;
                sVar2.d0(-1728605002);
            }
            sVar2.p(z11);
            objQ2 = sVar2.Q();
            if (objQ2 == gVar) {
                objQ2 = l1.t.B(Boolean.FALSE);
                sVar2.o0(objQ2);
            }
            b1Var2 = (l1.b1) objQ2;
            if (((Boolean) b1Var2.getValue()).booleanValue()) {
                sVar2.d0(-1698209936);
                if (practiceType != CoursePracticeType.COURSE_REVIEW_WORD_SENT) {
                    z19 = true;
                } else {
                    z19 = true;
                }
                objQ10 = sVar2.Q();
                if (objQ10 == gVar) {
                    objQ10 = new d1(11, b1Var2);
                    sVar2.o0(objQ10);
                }
                fz.a aVar10 = (fz.a) objQ10;
                objQ11 = sVar2.Q();
                if (objQ11 == gVar) {
                    objQ11 = new d1(12, b1Var2);
                    sVar2.o0(objQ11);
                }
                fz.a aVar11 = (fz.a) objQ11;
                if ((i18 & 57344) == 16384) {
                    z20 = true;
                } else {
                    z20 = z11;
                }
                if ((i18 & 112) != 32) {
                    z21 = z11;
                } else {
                    z21 = true;
                }
                boolean z35 = z20 | z21;
                if ((r20 & 896) == 256) {
                    z22 = true;
                } else {
                    z22 = z11;
                }
                boolean z36 = z35 | z22;
                if ((r20 & 112) == 32) {
                    z23 = true;
                } else {
                    z23 = z11;
                }
                z24 = z36 | z23;
                objQ12 = sVar2.Q();
                if (z24) {
                    i15 = r20;
                    bp.x1 x1Var2 = new bp.x1(practiceType, progressUiState, showFinishScreen, onClickClose, b1Var2);
                    b1Var3 = b1Var2;
                    sVar2.o0(x1Var2);
                    objQ12 = x1Var2;
                } else {
                    i15 = r20;
                    bp.x1 x1Var3 = new bp.x1(practiceType, progressUiState, showFinishScreen, onClickClose, b1Var2);
                    b1Var3 = b1Var2;
                    sVar2.o0(x1Var3);
                    objQ12 = x1Var3;
                }
                i13 = i15;
                tv.a.i(z19, aVar10, aVar11, (fz.a) objQ12, sVar2, 432);
            } else {
                onChecked = onChecked;
                b1Var = b1Var;
                b1Var3 = b1Var2;
                i12 = i12;
                i13 = r20;
                sVar2.d0(-1728605002);
            }
            sVar2.p(z11);
            objQ3 = sVar2.Q();
            if (objQ3 == gVar) {
                objQ3 = new d1(13, b1Var3);
                sVar2.o0(objQ3);
            }
            se.i.a(z11, (fz.a) objQ3, sVar2, 48, 1);
            objQ4 = sVar2.Q();
            if (objQ4 == gVar) {
                objQ4 = l1.t.B(Boolean.FALSE);
                sVar2.o0(objQ4);
            }
            b1Var4 = (l1.b1) objQ4;
            qcVar = z30 ? (qc) uiState : null;
            if (qcVar != null) {
                j12 = qcVar.f50303c;
            } else {
                j12 = -1;
            }
            if (((Boolean) b1Var4.getValue()).booleanValue()) {
                c11 = '0';
                z12 = true;
                sVar3 = sVar2;
                z13 = false;
                sVar3.d0(-1728605002);
            } else {
                c11 = '0';
                z12 = true;
                sVar3 = sVar2;
                z13 = false;
                sVar3.d0(-1728605002);
            }
            sVar3.p(z13);
            i14 = i13;
            sVar4 = sVar3;
            z14 = z13;
            t1.d dVarD2 = t1.e.d(1893965181, new bt.h(z31, progressUiState, uiState, b1Var5, b1Var3, practiceType, settingsUiState, aVar, b1Var4, b1Var), sVar4);
            if ((i21 & 458752) == 131072) {
                z15 = true;
            } else {
                z15 = z14;
            }
            objQ5 = sVar4.Q();
            if (z15) {
                objQ5 = new pr.y(26, onChecked, b1Var5);
                sVar4.o0(objQ5);
            } else {
                objQ5 = new pr.y(26, onChecked, b1Var5);
                sVar4.o0(objQ5);
            }
            fz.e eVar2 = (fz.e) objQ5;
            if ((i21 & 234881024) == 67108864) {
                z16 = true;
            } else {
                z16 = z14;
            }
            objQ6 = sVar4.Q();
            if (z16) {
                objQ6 = new xu.e1(4, onShowNext, b1Var5);
                sVar4.o0(objQ6);
            } else {
                objQ6 = new xu.e1(4, onShowNext, b1Var5);
                sVar4.o0(objQ6);
            }
            fz.a aVar12 = (fz.a) objQ6;
            if ((i21 & 1879048192) == 536870912) {
                z17 = true;
            } else {
                z17 = z14;
            }
            objQ7 = sVar4.Q();
            if (z17) {
                objQ7 = new y3(onSkip, b1Var5, 20);
                sVar4.o0(objQ7);
            } else {
                objQ7 = new y3(onSkip, b1Var5, 20);
                sVar4.o0(objQ7);
            }
            fz.c cVar7 = (fz.c) objQ7;
            if ((i18 & 112) != 32) {
                z18 = z14;
            } else {
                z18 = true;
            }
            objQ8 = sVar4.Q();
            if (z18) {
                objQ8 = new xa.a(progressUiState, 10);
                sVar4.o0(objQ8);
            } else {
                objQ8 = new xa.a(progressUiState, 10);
                sVar4.o0(objQ8);
            }
            fz.a aVar13 = (fz.a) objQ8;
            if ((i14 & 896) == 256) {
                z14 = true;
            }
            objQ9 = sVar4.Q();
            if (z14) {
                objQ9 = new k2(1, showFinishScreen);
                sVar4.o0(objQ9);
            } else {
                objQ9 = new k2(1, showFinishScreen);
                sVar4.o0(objQ9);
            }
            int i29 = i18 >> 3;
            int i210 = i21 >> 12;
            a.n(uiState, settingsUiState, true, false, j11, bookmarkUiStateFor, onToggleBookmarkFor, bookmarkUiStateForItem, fVar, knowledgeNoteUiStateFor, onSaveKnowledgeNoteFor, dVarD2, onWordMatchFailed, onWordMatchSuccess, eVar2, aVar12, cVar7, aVar13, (fz.a) objQ9, sVar4, (458752 & i29) | (i18 & 14) | 384 | (i29 & 112) | (i29 & 57344) | (3670016 & (i18 >> 6)) | (i18 & 29360128) | (234881024 & i29) | ((i21 << 27) & 1879048192), ((i21 >> 3) & 14) | 48 | (i210 & 896) | (i210 & 7168), 8);
            sVar = sVar4;
        } else {
            sVar = sVar5;
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new fz.e(progressUiState, settingsUiState, bVar, practiceType, j11, bookmarkUiStateFor, bookmarkUiStateForItem, onToggleBookmarkFor, fVar, knowledgeNoteUiStateFor, onSaveKnowledgeNoteFor, onConfirmSettings, onConfirmQuestionPreference, onResetQuestionPreference, onChecked, onWordMatchFailed, onWordMatchSuccess, onShowNext, onSkip, aVar, onClickClose, showFinishScreen, onClickBilling, i11) { // from class: ys.l2
                public final /* synthetic */ fz.e H;
                public final /* synthetic */ fz.c K;
                public final /* synthetic */ fz.f L;
                public final /* synthetic */ fz.c M;
                public final /* synthetic */ fz.e N;
                public final /* synthetic */ fz.c O;
                public final /* synthetic */ fz.e P;
                public final /* synthetic */ fz.c Q;
                public final /* synthetic */ fz.e R;
                public final /* synthetic */ fz.e S;
                public final /* synthetic */ fz.e T;
                public final /* synthetic */ fz.a U;
                public final /* synthetic */ fz.c V;
                public final /* synthetic */ fz.a W;
                public final /* synthetic */ fz.a X;
                public final /* synthetic */ fz.a Y;
                public final /* synthetic */ fz.c Z;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ gc f58136b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ h9 f58137c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ qs.b f58138d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ CoursePracticeType f58139e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ long f58140f;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public final /* synthetic */ fz.c f58141t;

                @Override // fz.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM = l1.t.M(1);
                    p2.d(this.f58135a, this.f58136b, this.f58137c, this.f58138d, this.f58139e, this.f58140f, this.f58141t, this.H, this.K, this.L, this.M, this.N, this.O, this.P, this.Q, this.R, this.S, this.T, this.U, this.V, this.W, this.X, this.Y, this.Z, (l1.n) obj, iM);
                    return qy.b0.f48488a;
                }
            };
        }
    }
}
