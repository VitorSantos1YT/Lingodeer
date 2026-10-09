package xu;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.lingodeer.R;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import dt.y3;
import fr.j3;
import h1.k7;
import h1.r4;
import h1.r9;
import h1.ua;
import j0.e2;
import java.util.Iterator;
import l1.b3;
import zu.c2;
import zu.d2;
import zu.i2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class q1 {
    public static final void a(fz.a aVar, fz.a aVar2, l1.n nVar, int i11) {
        l1.s sVar;
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(1528188016);
        int i12 = i11 | (sVar2.h(aVar2) ? 32 : 16);
        if (sVar2.T(i12 & 1, (i12 & 19) != 18)) {
            sVar = sVar2;
            k7.a(aVar, t1.e.d(-1701985608, new nv.y(22, aVar2), sVar2), null, t1.e.d(-1213938502, new nv.y(23, aVar), sVar2), c.f56345e0, t1.e.d(1665615805, new dt.t0(((Number) sVar2.j(ju.f.f37370d)).intValue(), 6, (byte) 0), sVar2), null, 0L, 0L, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar, 1772598, 16276);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new bp.n1(i11, 8, aVar, aVar2);
        }
    }

    public static final void b(int i11, String title, l1.n nVar, z1.r rVar) {
        l1.s sVar;
        kotlin.jvm.internal.m.f(title, "title");
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(-1956916784);
        int i12 = (sVar2.d(R.drawable.account_about_us) ? 4 : 2) | i11 | (sVar2.f(title) ? 32 : 16) | (sVar2.f(rVar) ? 2048 : 1024);
        if (sVar2.T(i12 & 1, (i12 & 1171) != 1170)) {
            Context context = (Context) sVar2.j(AndroidCompositionLocals_androidKt.f1200b);
            j0.a2 a2VarA = j0.z1.a(j0.i.f35303a, z1.c.M, sVar2, 48);
            int iHashCode = Long.hashCode(sVar2.T);
            l1.q1 q1VarL = sVar2.l();
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
            sVar2.d0(476436277);
            k2.b bVarY = se.k.y(R.drawable.account_about_us, sVar2, i12 & 14);
            z1.o oVar = z1.o.f58481a;
            d0.n.c(bVarY, null, e2.n(j0.c.E(oVar, 16, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14), 20), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar2, 432, 120);
            sVar2.p(false);
            z1.r rVarE = j0.c.E(oVar, 14, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14);
            if (1.0f <= 0.0d) {
                k0.a.a("invalid weight; must be greater than zero");
            }
            k(14 & (i12 >> 3), 0, title, sVar2, w4.c.p(1.0f, true, rVarE));
            i(48, 0, "v".concat(ks.b.c(context)), sVar2, j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 12, CropImageView.DEFAULT_ASPECT_RATIO, 11));
            sVar2.d0(476986217);
            r4.b(se.k.y(R.drawable.keyboard_arrow_right_24px, sVar2, 0), null, j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 16, CropImageView.DEFAULT_ASPECT_RATIO, 11), g2.f0.e(4291480266L), sVar2, 3504, 0);
            sVar = sVar2;
            sVar.p(false);
            sVar.p(true);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new br.a(title, rVar, i11, 10);
        }
    }

    public static final void c(int i11, String title, String subTitle, z1.r modifier, l1.n nVar, int i12) {
        String str;
        l1.s sVar;
        kotlin.jvm.internal.m.f(title, "title");
        kotlin.jvm.internal.m.f(subTitle, "subTitle");
        kotlin.jvm.internal.m.f(modifier, "modifier");
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(1657208837);
        int i13 = i12 | (sVar2.d(i11) ? 4 : 2) | (sVar2.f(title) ? 32 : 16) | (sVar2.f(subTitle) ? 256 : 128) | (sVar2.f(modifier) ? 2048 : 1024);
        if (sVar2.T(i13 & 1, (i13 & 1171) != 1170)) {
            z1.i iVar = z1.c.M;
            j0.b bVar = j0.i.f35303a;
            j0.a2 a2VarA = j0.z1.a(bVar, iVar, sVar2, 48);
            int iHashCode = Long.hashCode(sVar2.T);
            l1.q1 q1VarL = sVar2.l();
            z1.r rVarC = z1.a.c(sVar2, modifier);
            y2.k.J.getClass();
            y2.i iVar2 = y2.j.f56913b;
            sVar2.h0();
            if (sVar2.S) {
                sVar2.k(iVar2);
            } else {
                sVar2.r0();
            }
            y2.h hVar = y2.j.f56917f;
            l1.t.J(hVar, a2VarA, sVar2);
            y2.h hVar2 = y2.j.f56916e;
            l1.t.J(hVar2, q1VarL, sVar2);
            y2.h hVar3 = y2.j.f56918g;
            if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar2, iHashCode, hVar3);
            }
            y2.h hVar4 = y2.j.f56915d;
            l1.t.J(hVar4, rVarC, sVar2);
            float f5 = 16;
            z1.o oVar = z1.o.f58481a;
            z1.r rVarC2 = j0.c.C(oVar, f5, CropImageView.DEFAULT_ASPECT_RATIO, 2);
            if (1.0f <= 0.0d) {
                k0.a.a("invalid weight; must be greater than zero");
            }
            z1.r rVarP = w4.c.p(1.0f, true, rVarC2);
            j0.u uVarA = j0.t.a(j0.i.f35307e, z1.c.O, sVar2, 6);
            int iHashCode2 = Long.hashCode(sVar2.T);
            l1.q1 q1VarL2 = sVar2.l();
            z1.r rVarC3 = z1.a.c(sVar2, rVarP);
            sVar2.h0();
            if (sVar2.S) {
                sVar2.k(iVar2);
            } else {
                sVar2.r0();
            }
            l1.t.J(hVar, uVarA, sVar2);
            l1.t.J(hVar2, q1VarL2, sVar2);
            if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode2))) {
                defpackage.e.A(iHashCode2, sVar2, iHashCode2, hVar3);
            }
            l1.t.J(hVar4, rVarC3, sVar2);
            j0.a2 a2VarA2 = j0.z1.a(bVar, iVar, sVar2, 48);
            int iHashCode3 = Long.hashCode(sVar2.T);
            l1.q1 q1VarL3 = sVar2.l();
            z1.r rVarC4 = z1.a.c(sVar2, oVar);
            sVar2.h0();
            if (sVar2.S) {
                sVar2.k(iVar2);
            } else {
                sVar2.r0();
            }
            l1.t.J(hVar, a2VarA2, sVar2);
            l1.t.J(hVar2, q1VarL3, sVar2);
            if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode3))) {
                defpackage.e.A(iHashCode3, sVar2, iHashCode3, hVar3);
            }
            l1.t.J(hVar4, rVarC4, sVar2);
            float f11 = 20;
            d0.n.c(se.k.y(i11, sVar2, i13 & 14), null, e2.n(oVar, f11), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar2, 432, 120);
            float f12 = 14;
            k(((i13 >> 3) & 14) | 48, 0, title, sVar2, j0.c.E(oVar, f12, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14));
            sVar2.p(true);
            j0.a2 a2VarA3 = j0.z1.a(bVar, iVar, sVar2, 48);
            int iHashCode4 = Long.hashCode(sVar2.T);
            l1.q1 q1VarL4 = sVar2.l();
            z1.r rVarC5 = z1.a.c(sVar2, oVar);
            sVar2.h0();
            if (sVar2.S) {
                sVar2.k(iVar2);
            } else {
                sVar2.r0();
            }
            l1.t.J(hVar, a2VarA3, sVar2);
            l1.t.J(hVar2, q1VarL4, sVar2);
            if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode4))) {
                defpackage.e.A(iHashCode4, sVar2, iHashCode4, hVar3);
            }
            l1.t.J(hVar4, rVarC5, sVar2);
            j0.c.g(sVar2, e2.n(oVar, f11));
            str = subTitle;
            i(((i13 >> 6) & 14) | 48, 0, str, sVar2, j0.c.E(oVar, f12, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14));
            sVar2.p(true);
            sVar2.p(true);
            r4.b(se.k.y(R.drawable.keyboard_arrow_right_24px, sVar2, 0), null, j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, f5, CropImageView.DEFAULT_ASPECT_RATIO, 11), g2.f0.e(4291480266L), sVar2, 3504, 0);
            sVar = sVar2;
            sVar.p(true);
        } else {
            str = subTitle;
            sVar = sVar2;
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new bp.o1(i11, title, str, modifier, i12, 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v3 */
    public static final void d(int i11, String title, boolean z11, z1.r rVar, l1.n nVar, int i12) {
        l1.s sVar;
        ?? r15;
        boolean z12;
        l1.s sVar2;
        l1.s sVar3;
        kotlin.jvm.internal.m.f(title, "title");
        l1.s sVar4 = (l1.s) nVar;
        sVar4.f0(-1070127293);
        int i13 = i12 | (sVar4.d(i11) ? 4 : 2);
        if ((i12 & 48) == 0) {
            i13 |= sVar4.f(title) ? 32 : 16;
        }
        int i14 = i13 | (sVar4.f(rVar) ? 2048 : 1024);
        if (sVar4.T(i14 & 1, (i14 & 1171) != 1170)) {
            j0.a2 a2VarA = j0.z1.a(j0.i.f35303a, z1.c.M, sVar4, 48);
            int iHashCode = Long.hashCode(sVar4.T);
            l1.q1 q1VarL = sVar4.l();
            z1.r rVarC = z1.a.c(sVar4, rVar);
            y2.k.J.getClass();
            fz.a aVar = y2.j.f56913b;
            sVar4.h0();
            if (sVar4.S) {
                sVar4.k(aVar);
            } else {
                sVar4.r0();
            }
            l1.t.J(y2.j.f56917f, a2VarA, sVar4);
            l1.t.J(y2.j.f56916e, q1VarL, sVar4);
            y2.h hVar = y2.j.f56918g;
            if (sVar4.S || !kotlin.jvm.internal.m.a(sVar4.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar4, iHashCode, hVar);
            }
            l1.t.J(y2.j.f56915d, rVarC, sVar4);
            z1.o oVar = z1.o.f58481a;
            if (i11 == 0) {
                sVar4.d0(-1430575192);
                float f5 = 20;
                j0.c.g(sVar4, e2.n(j0.c.E(oVar, f5, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14), f5));
                sVar4.p(false);
                z12 = true;
                r15 = 0;
                sVar2 = sVar4;
            } else {
                sVar4.d0(-1430420254);
                l1.s sVar5 = sVar4;
                r15 = 0;
                z12 = true;
                d0.n.c(se.k.y(i11, sVar4, i14 & 14), null, e2.n(j0.c.E(oVar, 16, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14), 20), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar5, 432, 120);
                sVar5.p(false);
                sVar2 = sVar5;
            }
            z1.r rVarE = j0.c.E(oVar, 14, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14);
            if (1.0f <= 0.0d) {
                k0.a.a("invalid weight; must be greater than zero");
            }
            k((i14 >> 3) & 14, r15, title, sVar2, w4.c.p(1.0f, z12, rVarE));
            if (z11) {
                sVar2.d0(-1429998282);
                l1.s sVar6 = sVar2;
                r4.b(se.k.y(R.drawable.keyboard_arrow_right_24px, sVar2, r15), null, j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 16, CropImageView.DEFAULT_ASPECT_RATIO, 11), g2.f0.e(4291480266L), sVar6, 3504, 0);
                sVar3 = sVar6;
            } else {
                sVar2.d0(-1463263173);
                sVar3 = sVar2;
            }
            sVar3.p(r15);
            sVar3.p(z12);
            sVar = sVar3;
        } else {
            l1.s sVar7 = sVar4;
            sVar7.W();
            sVar = sVar7;
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new dt.i(i11, title, z11, rVar, i12);
        }
    }

    public static final void e(String title, String[] radioOptions, int i11, fz.a onDismissRequest, fz.c onConfirmation, l1.n nVar, int i12) {
        int i13;
        l1.s sVar;
        kotlin.jvm.internal.m.f(title, "title");
        kotlin.jvm.internal.m.f(radioOptions, "radioOptions");
        kotlin.jvm.internal.m.f(onDismissRequest, "onDismissRequest");
        kotlin.jvm.internal.m.f(onConfirmation, "onConfirmation");
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(2145315188);
        if ((i12 & 6) == 0) {
            i13 = (sVar2.f(title) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 48) == 0) {
            i13 |= sVar2.h(radioOptions) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i13 |= sVar2.d(i11) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i13 |= sVar2.h(onDismissRequest) ? 2048 : 1024;
        }
        if ((i12 & 24576) == 0) {
            i13 |= sVar2.h(onConfirmation) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE;
        }
        if (sVar2.T(i13 & 1, (i13 & 9363) != 9362)) {
            Object objQ = sVar2.Q();
            if (objQ == l1.m.f39353a) {
                objQ = l1.t.B(radioOptions[i11]);
                sVar2.o0(objQ);
            }
            l1.b1 b1Var = (l1.b1) objQ;
            String str = (String) b1Var.i();
            sVar = sVar2;
            k7.a(onDismissRequest, t1.e.d(-795845188, new o1(onConfirmation, radioOptions, str), sVar2), null, t1.e.d(1711252286, new nv.y(21, onDismissRequest), sVar2), t1.e.d(-76617536, new m1(title, 2), sVar2), t1.e.d(-970552447, new o1(radioOptions, str, b1Var.a()), sVar2), null, 0L, 0L, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar, ((i13 >> 9) & 14) | 1772592, 16276);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new bp.z(title, radioOptions, i11, onDismissRequest, onConfirmation, i12);
        }
    }

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
    public static final void f(fz.a onClickClose, fz.a navigationToReminder, fz.c navigationToAccount, fz.a clearCache, fz.a onClickLanguageLearning, fz.a onClickHelpCenter, fz.a onClickContactUs, fz.a onClickAboutUs, fz.a onClickDebug, fz.a aVar, i2 i2Var, l1.n nVar, int i11) {
        i2 i2Var2;
        i2 i2Var3;
        kotlin.jvm.internal.m.f(onClickClose, "onClickClose");
        kotlin.jvm.internal.m.f(navigationToReminder, "navigationToReminder");
        kotlin.jvm.internal.m.f(navigationToAccount, "navigationToAccount");
        kotlin.jvm.internal.m.f(clearCache, "clearCache");
        kotlin.jvm.internal.m.f(onClickLanguageLearning, "onClickLanguageLearning");
        kotlin.jvm.internal.m.f(onClickHelpCenter, "onClickHelpCenter");
        kotlin.jvm.internal.m.f(onClickContactUs, "onClickContactUs");
        kotlin.jvm.internal.m.f(onClickAboutUs, "onClickAboutUs");
        kotlin.jvm.internal.m.f(onClickDebug, "onClickDebug");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-2043252251);
        int i12 = i11 | (sVar.h(onClickClose) ? 4 : 2) | (sVar.h(navigationToReminder) ? 32 : 16) | (sVar.h(navigationToAccount) ? 256 : 128) | (sVar.h(clearCache) ? 2048 : 1024) | (sVar.h(onClickHelpCenter) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536) | (sVar.h(onClickContactUs) ? 1048576 : 524288) | (sVar.h(onClickAboutUs) ? 8388608 : 4194304) | (sVar.h(onClickDebug) ? 67108864 : 33554432) | (sVar.h(aVar) ? 536870912 : 268435456);
        if (sVar.T(i12 & 1, (306783379 & i12) != 306783378)) {
            sVar.Y();
            if ((i11 & 1) == 0 || sVar.C()) {
                sVar.d0(-1614864554);
                ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(sVar, LocalViewModelStoreOwner.$stable);
                if (current == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                ViewModel viewModelA = i20.b.a(kotlin.jvm.internal.z.a(i2.class), current.getViewModelStore(), null, i20.a.a(current), null, q10.b.a(sVar), null);
                sVar.p(false);
                i2Var3 = (i2) viewModelA;
            } else {
                sVar.W();
                i2Var3 = i2Var;
            }
            sVar.q();
            final i2 i2Var4 = i2Var3;
            b3 b3VarCollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(i2Var3.L, (LifecycleOwner) null, (Lifecycle.State) null, (vy.i) null, sVar, 0, 7);
            b3 b3VarCollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(i2Var4.f59452t, (LifecycleOwner) null, (Lifecycle.State) null, (vy.i) null, sVar, 0, 7);
            b3 b3VarCollectAsStateWithLifecycle3 = FlowExtKt.collectAsStateWithLifecycle(i2Var4.K, (LifecycleOwner) null, (Lifecycle.State) null, (vy.i) null, sVar, 0, 7);
            Context context = (Context) sVar.j(AndroidCompositionLocals_androidKt.f1200b);
            if (((Boolean) b3VarCollectAsStateWithLifecycle2.getValue()).booleanValue()) {
                sVar.d0(2044428574);
                tv.a.c(sVar, 0);
            } else {
                sVar.d0(2040321725);
            }
            sVar.p(false);
            Integer num = (Integer) b3VarCollectAsStateWithLifecycle3.getValue();
            boolean zF = sVar.f(b3VarCollectAsStateWithLifecycle3) | sVar.h(context) | sVar.h(i2Var4);
            Object objQ = sVar.Q();
            vy.d dVar = null;
            l1.g gVar = l1.m.f39353a;
            if (zF || objQ == gVar) {
                objQ = new qg.e(b3VarCollectAsStateWithLifecycle3, context, i2Var4, dVar, 7);
                sVar.o0(objQ);
            }
            l1.t.f((fz.e) objQ, num, sVar);
            zu.e2 e2Var = (zu.e2) b3VarCollectAsStateWithLifecycle.getValue();
            if (kotlin.jvm.internal.m.a(e2Var, c2.f59387a)) {
                sVar.d0(-765323660);
                tv.a.d(0, 1, sVar, 0);
                sVar.p(false);
            } else {
                if (!(e2Var instanceof d2)) {
                    throw nv.p.x(sVar, -765322011, false);
                }
                sVar.d0(2044944259);
                d2 d2Var = (d2) e2Var;
                boolean z11 = d2Var.f59390a;
                int i13 = d2Var.f59391b;
                int i14 = d2Var.f59393d;
                int i15 = d2Var.f59394e;
                boolean z12 = d2Var.f59395f;
                int i16 = d2Var.f59396g;
                String str = d2Var.f59397h;
                boolean z13 = d2Var.f59398i;
                boolean z14 = d2Var.f59399j;
                boolean z15 = d2Var.f59400k;
                boolean z16 = d2Var.f59401l;
                boolean z17 = d2Var.m;
                boolean z18 = d2Var.f59402n;
                int i17 = d2Var.f59403o;
                boolean z19 = d2Var.f59404p;
                boolean z20 = d2Var.f59405q;
                boolean z21 = d2Var.f59406r;
                boolean zH = sVar.h(i2Var4);
                Object objQ2 = sVar.Q();
                if (zH || objQ2 == gVar) {
                    final int i18 = 0;
                    objQ2 = new fz.c() { // from class: xu.j1
                        @Override // fz.c
                        public final Object invoke(Object obj) {
                            switch (i18) {
                                case 0:
                                    i2Var4.a(new zu.v1(((Integer) obj).intValue()));
                                    break;
                                case 1:
                                    i2Var4.a(new zu.u1(((Integer) obj).intValue()));
                                    break;
                                case 2:
                                    i2Var4.a(new zu.t1(((Boolean) obj).booleanValue()));
                                    break;
                                case 3:
                                    i2Var4.a(new zu.a2(((Integer) obj).intValue()));
                                    break;
                                case 4:
                                    i2Var4.a(new zu.x1(((Boolean) obj).booleanValue()));
                                    break;
                                case 5:
                                    i2Var4.a(new zu.p1(((Boolean) obj).booleanValue()));
                                    break;
                                case 6:
                                    i2Var4.a(new zu.r1(((Boolean) obj).booleanValue()));
                                    break;
                                case 7:
                                    i2Var4.a(new zu.s1(((Boolean) obj).booleanValue()));
                                    break;
                                case 8:
                                    i2Var4.a(new zu.y1(((Boolean) obj).booleanValue()));
                                    break;
                                case 9:
                                    i2Var4.a(new zu.q1(((Boolean) obj).booleanValue()));
                                    break;
                                case 10:
                                    int iIntValue = ((Integer) obj).intValue();
                                    i2Var4.a(new zu.z1(iIntValue));
                                    if (iIntValue == 0) {
                                        androidx.appcompat.app.a.l(1);
                                    } else if (iIntValue == 1) {
                                        androidx.appcompat.app.a.l(2);
                                    } else if (iIntValue == 2) {
                                        androidx.appcompat.app.a.l(-1);
                                    }
                                    return qy.b0.f48488a;
                                case 11:
                                    i2Var4.a(new zu.o1(((Boolean) obj).booleanValue()));
                                    break;
                                default:
                                    i2Var4.a(new zu.w1(((Boolean) obj).booleanValue()));
                                    break;
                            }
                            return qy.b0.f48488a;
                        }
                    };
                    sVar.o0(objQ2);
                }
                fz.c cVar = (fz.c) objQ2;
                boolean zH2 = sVar.h(i2Var4);
                Object objQ3 = sVar.Q();
                if (zH2 || objQ3 == gVar) {
                    final int i19 = 1;
                    objQ3 = new fz.c() { // from class: xu.j1
                        @Override // fz.c
                        public final Object invoke(Object obj) {
                            switch (i19) {
                                case 0:
                                    i2Var4.a(new zu.v1(((Integer) obj).intValue()));
                                    break;
                                case 1:
                                    i2Var4.a(new zu.u1(((Integer) obj).intValue()));
                                    break;
                                case 2:
                                    i2Var4.a(new zu.t1(((Boolean) obj).booleanValue()));
                                    break;
                                case 3:
                                    i2Var4.a(new zu.a2(((Integer) obj).intValue()));
                                    break;
                                case 4:
                                    i2Var4.a(new zu.x1(((Boolean) obj).booleanValue()));
                                    break;
                                case 5:
                                    i2Var4.a(new zu.p1(((Boolean) obj).booleanValue()));
                                    break;
                                case 6:
                                    i2Var4.a(new zu.r1(((Boolean) obj).booleanValue()));
                                    break;
                                case 7:
                                    i2Var4.a(new zu.s1(((Boolean) obj).booleanValue()));
                                    break;
                                case 8:
                                    i2Var4.a(new zu.y1(((Boolean) obj).booleanValue()));
                                    break;
                                case 9:
                                    i2Var4.a(new zu.q1(((Boolean) obj).booleanValue()));
                                    break;
                                case 10:
                                    int iIntValue = ((Integer) obj).intValue();
                                    i2Var4.a(new zu.z1(iIntValue));
                                    if (iIntValue == 0) {
                                        androidx.appcompat.app.a.l(1);
                                    } else if (iIntValue == 1) {
                                        androidx.appcompat.app.a.l(2);
                                    } else if (iIntValue == 2) {
                                        androidx.appcompat.app.a.l(-1);
                                    }
                                    return qy.b0.f48488a;
                                case 11:
                                    i2Var4.a(new zu.o1(((Boolean) obj).booleanValue()));
                                    break;
                                default:
                                    i2Var4.a(new zu.w1(((Boolean) obj).booleanValue()));
                                    break;
                            }
                            return qy.b0.f48488a;
                        }
                    };
                    sVar.o0(objQ3);
                }
                fz.c cVar2 = (fz.c) objQ3;
                boolean zH3 = sVar.h(i2Var4);
                Object objQ4 = sVar.Q();
                if (zH3 || objQ4 == gVar) {
                    final int i21 = 2;
                    objQ4 = new fz.c() { // from class: xu.j1
                        @Override // fz.c
                        public final Object invoke(Object obj) {
                            switch (i21) {
                                case 0:
                                    i2Var4.a(new zu.v1(((Integer) obj).intValue()));
                                    break;
                                case 1:
                                    i2Var4.a(new zu.u1(((Integer) obj).intValue()));
                                    break;
                                case 2:
                                    i2Var4.a(new zu.t1(((Boolean) obj).booleanValue()));
                                    break;
                                case 3:
                                    i2Var4.a(new zu.a2(((Integer) obj).intValue()));
                                    break;
                                case 4:
                                    i2Var4.a(new zu.x1(((Boolean) obj).booleanValue()));
                                    break;
                                case 5:
                                    i2Var4.a(new zu.p1(((Boolean) obj).booleanValue()));
                                    break;
                                case 6:
                                    i2Var4.a(new zu.r1(((Boolean) obj).booleanValue()));
                                    break;
                                case 7:
                                    i2Var4.a(new zu.s1(((Boolean) obj).booleanValue()));
                                    break;
                                case 8:
                                    i2Var4.a(new zu.y1(((Boolean) obj).booleanValue()));
                                    break;
                                case 9:
                                    i2Var4.a(new zu.q1(((Boolean) obj).booleanValue()));
                                    break;
                                case 10:
                                    int iIntValue = ((Integer) obj).intValue();
                                    i2Var4.a(new zu.z1(iIntValue));
                                    if (iIntValue == 0) {
                                        androidx.appcompat.app.a.l(1);
                                    } else if (iIntValue == 1) {
                                        androidx.appcompat.app.a.l(2);
                                    } else if (iIntValue == 2) {
                                        androidx.appcompat.app.a.l(-1);
                                    }
                                    return qy.b0.f48488a;
                                case 11:
                                    i2Var4.a(new zu.o1(((Boolean) obj).booleanValue()));
                                    break;
                                default:
                                    i2Var4.a(new zu.w1(((Boolean) obj).booleanValue()));
                                    break;
                            }
                            return qy.b0.f48488a;
                        }
                    };
                    sVar.o0(objQ4);
                }
                fz.c cVar3 = (fz.c) objQ4;
                boolean zH4 = sVar.h(i2Var4);
                Object objQ5 = sVar.Q();
                if (zH4 || objQ5 == gVar) {
                    final int i22 = 3;
                    objQ5 = new fz.c() { // from class: xu.j1
                        @Override // fz.c
                        public final Object invoke(Object obj) {
                            switch (i22) {
                                case 0:
                                    i2Var4.a(new zu.v1(((Integer) obj).intValue()));
                                    break;
                                case 1:
                                    i2Var4.a(new zu.u1(((Integer) obj).intValue()));
                                    break;
                                case 2:
                                    i2Var4.a(new zu.t1(((Boolean) obj).booleanValue()));
                                    break;
                                case 3:
                                    i2Var4.a(new zu.a2(((Integer) obj).intValue()));
                                    break;
                                case 4:
                                    i2Var4.a(new zu.x1(((Boolean) obj).booleanValue()));
                                    break;
                                case 5:
                                    i2Var4.a(new zu.p1(((Boolean) obj).booleanValue()));
                                    break;
                                case 6:
                                    i2Var4.a(new zu.r1(((Boolean) obj).booleanValue()));
                                    break;
                                case 7:
                                    i2Var4.a(new zu.s1(((Boolean) obj).booleanValue()));
                                    break;
                                case 8:
                                    i2Var4.a(new zu.y1(((Boolean) obj).booleanValue()));
                                    break;
                                case 9:
                                    i2Var4.a(new zu.q1(((Boolean) obj).booleanValue()));
                                    break;
                                case 10:
                                    int iIntValue = ((Integer) obj).intValue();
                                    i2Var4.a(new zu.z1(iIntValue));
                                    if (iIntValue == 0) {
                                        androidx.appcompat.app.a.l(1);
                                    } else if (iIntValue == 1) {
                                        androidx.appcompat.app.a.l(2);
                                    } else if (iIntValue == 2) {
                                        androidx.appcompat.app.a.l(-1);
                                    }
                                    return qy.b0.f48488a;
                                case 11:
                                    i2Var4.a(new zu.o1(((Boolean) obj).booleanValue()));
                                    break;
                                default:
                                    i2Var4.a(new zu.w1(((Boolean) obj).booleanValue()));
                                    break;
                            }
                            return qy.b0.f48488a;
                        }
                    };
                    sVar.o0(objQ5);
                }
                fz.c cVar4 = (fz.c) objQ5;
                boolean z22 = (i12 & 112) == 32;
                Object objQ6 = sVar.Q();
                if (z22 || objQ6 == gVar) {
                    objQ6 = new wo.c(19, navigationToReminder);
                    sVar.o0(objQ6);
                }
                fz.a aVar2 = (fz.a) objQ6;
                boolean zH5 = ((i12 & 896) == 256) | sVar.h(e2Var);
                Object objQ7 = sVar.Q();
                if (zH5 || objQ7 == gVar) {
                    objQ7 = new pv.c(24, navigationToAccount, d2Var);
                    sVar.o0(objQ7);
                }
                fz.a aVar3 = (fz.a) objQ7;
                boolean zH6 = sVar.h(i2Var4);
                Object objQ8 = sVar.Q();
                if (zH6 || objQ8 == gVar) {
                    final int i23 = 4;
                    objQ8 = new fz.c() { // from class: xu.j1
                        @Override // fz.c
                        public final Object invoke(Object obj) {
                            switch (i23) {
                                case 0:
                                    i2Var4.a(new zu.v1(((Integer) obj).intValue()));
                                    break;
                                case 1:
                                    i2Var4.a(new zu.u1(((Integer) obj).intValue()));
                                    break;
                                case 2:
                                    i2Var4.a(new zu.t1(((Boolean) obj).booleanValue()));
                                    break;
                                case 3:
                                    i2Var4.a(new zu.a2(((Integer) obj).intValue()));
                                    break;
                                case 4:
                                    i2Var4.a(new zu.x1(((Boolean) obj).booleanValue()));
                                    break;
                                case 5:
                                    i2Var4.a(new zu.p1(((Boolean) obj).booleanValue()));
                                    break;
                                case 6:
                                    i2Var4.a(new zu.r1(((Boolean) obj).booleanValue()));
                                    break;
                                case 7:
                                    i2Var4.a(new zu.s1(((Boolean) obj).booleanValue()));
                                    break;
                                case 8:
                                    i2Var4.a(new zu.y1(((Boolean) obj).booleanValue()));
                                    break;
                                case 9:
                                    i2Var4.a(new zu.q1(((Boolean) obj).booleanValue()));
                                    break;
                                case 10:
                                    int iIntValue = ((Integer) obj).intValue();
                                    i2Var4.a(new zu.z1(iIntValue));
                                    if (iIntValue == 0) {
                                        androidx.appcompat.app.a.l(1);
                                    } else if (iIntValue == 1) {
                                        androidx.appcompat.app.a.l(2);
                                    } else if (iIntValue == 2) {
                                        androidx.appcompat.app.a.l(-1);
                                    }
                                    return qy.b0.f48488a;
                                case 11:
                                    i2Var4.a(new zu.o1(((Boolean) obj).booleanValue()));
                                    break;
                                default:
                                    i2Var4.a(new zu.w1(((Boolean) obj).booleanValue()));
                                    break;
                            }
                            return qy.b0.f48488a;
                        }
                    };
                    sVar.o0(objQ8);
                }
                fz.c cVar5 = (fz.c) objQ8;
                boolean zH7 = sVar.h(i2Var4);
                Object objQ9 = sVar.Q();
                if (zH7 || objQ9 == gVar) {
                    final int i24 = 5;
                    objQ9 = new fz.c() { // from class: xu.j1
                        @Override // fz.c
                        public final Object invoke(Object obj) {
                            switch (i24) {
                                case 0:
                                    i2Var4.a(new zu.v1(((Integer) obj).intValue()));
                                    break;
                                case 1:
                                    i2Var4.a(new zu.u1(((Integer) obj).intValue()));
                                    break;
                                case 2:
                                    i2Var4.a(new zu.t1(((Boolean) obj).booleanValue()));
                                    break;
                                case 3:
                                    i2Var4.a(new zu.a2(((Integer) obj).intValue()));
                                    break;
                                case 4:
                                    i2Var4.a(new zu.x1(((Boolean) obj).booleanValue()));
                                    break;
                                case 5:
                                    i2Var4.a(new zu.p1(((Boolean) obj).booleanValue()));
                                    break;
                                case 6:
                                    i2Var4.a(new zu.r1(((Boolean) obj).booleanValue()));
                                    break;
                                case 7:
                                    i2Var4.a(new zu.s1(((Boolean) obj).booleanValue()));
                                    break;
                                case 8:
                                    i2Var4.a(new zu.y1(((Boolean) obj).booleanValue()));
                                    break;
                                case 9:
                                    i2Var4.a(new zu.q1(((Boolean) obj).booleanValue()));
                                    break;
                                case 10:
                                    int iIntValue = ((Integer) obj).intValue();
                                    i2Var4.a(new zu.z1(iIntValue));
                                    if (iIntValue == 0) {
                                        androidx.appcompat.app.a.l(1);
                                    } else if (iIntValue == 1) {
                                        androidx.appcompat.app.a.l(2);
                                    } else if (iIntValue == 2) {
                                        androidx.appcompat.app.a.l(-1);
                                    }
                                    return qy.b0.f48488a;
                                case 11:
                                    i2Var4.a(new zu.o1(((Boolean) obj).booleanValue()));
                                    break;
                                default:
                                    i2Var4.a(new zu.w1(((Boolean) obj).booleanValue()));
                                    break;
                            }
                            return qy.b0.f48488a;
                        }
                    };
                    sVar.o0(objQ9);
                }
                fz.c cVar6 = (fz.c) objQ9;
                boolean zH8 = sVar.h(i2Var4);
                Object objQ10 = sVar.Q();
                if (zH8 || objQ10 == gVar) {
                    final int i25 = 6;
                    objQ10 = new fz.c() { // from class: xu.j1
                        @Override // fz.c
                        public final Object invoke(Object obj) {
                            switch (i25) {
                                case 0:
                                    i2Var4.a(new zu.v1(((Integer) obj).intValue()));
                                    break;
                                case 1:
                                    i2Var4.a(new zu.u1(((Integer) obj).intValue()));
                                    break;
                                case 2:
                                    i2Var4.a(new zu.t1(((Boolean) obj).booleanValue()));
                                    break;
                                case 3:
                                    i2Var4.a(new zu.a2(((Integer) obj).intValue()));
                                    break;
                                case 4:
                                    i2Var4.a(new zu.x1(((Boolean) obj).booleanValue()));
                                    break;
                                case 5:
                                    i2Var4.a(new zu.p1(((Boolean) obj).booleanValue()));
                                    break;
                                case 6:
                                    i2Var4.a(new zu.r1(((Boolean) obj).booleanValue()));
                                    break;
                                case 7:
                                    i2Var4.a(new zu.s1(((Boolean) obj).booleanValue()));
                                    break;
                                case 8:
                                    i2Var4.a(new zu.y1(((Boolean) obj).booleanValue()));
                                    break;
                                case 9:
                                    i2Var4.a(new zu.q1(((Boolean) obj).booleanValue()));
                                    break;
                                case 10:
                                    int iIntValue = ((Integer) obj).intValue();
                                    i2Var4.a(new zu.z1(iIntValue));
                                    if (iIntValue == 0) {
                                        androidx.appcompat.app.a.l(1);
                                    } else if (iIntValue == 1) {
                                        androidx.appcompat.app.a.l(2);
                                    } else if (iIntValue == 2) {
                                        androidx.appcompat.app.a.l(-1);
                                    }
                                    return qy.b0.f48488a;
                                case 11:
                                    i2Var4.a(new zu.o1(((Boolean) obj).booleanValue()));
                                    break;
                                default:
                                    i2Var4.a(new zu.w1(((Boolean) obj).booleanValue()));
                                    break;
                            }
                            return qy.b0.f48488a;
                        }
                    };
                    sVar.o0(objQ10);
                }
                fz.c cVar7 = (fz.c) objQ10;
                boolean zH9 = sVar.h(i2Var4);
                Object objQ11 = sVar.Q();
                if (zH9 || objQ11 == gVar) {
                    final int i26 = 7;
                    objQ11 = new fz.c() { // from class: xu.j1
                        @Override // fz.c
                        public final Object invoke(Object obj) {
                            switch (i26) {
                                case 0:
                                    i2Var4.a(new zu.v1(((Integer) obj).intValue()));
                                    break;
                                case 1:
                                    i2Var4.a(new zu.u1(((Integer) obj).intValue()));
                                    break;
                                case 2:
                                    i2Var4.a(new zu.t1(((Boolean) obj).booleanValue()));
                                    break;
                                case 3:
                                    i2Var4.a(new zu.a2(((Integer) obj).intValue()));
                                    break;
                                case 4:
                                    i2Var4.a(new zu.x1(((Boolean) obj).booleanValue()));
                                    break;
                                case 5:
                                    i2Var4.a(new zu.p1(((Boolean) obj).booleanValue()));
                                    break;
                                case 6:
                                    i2Var4.a(new zu.r1(((Boolean) obj).booleanValue()));
                                    break;
                                case 7:
                                    i2Var4.a(new zu.s1(((Boolean) obj).booleanValue()));
                                    break;
                                case 8:
                                    i2Var4.a(new zu.y1(((Boolean) obj).booleanValue()));
                                    break;
                                case 9:
                                    i2Var4.a(new zu.q1(((Boolean) obj).booleanValue()));
                                    break;
                                case 10:
                                    int iIntValue = ((Integer) obj).intValue();
                                    i2Var4.a(new zu.z1(iIntValue));
                                    if (iIntValue == 0) {
                                        androidx.appcompat.app.a.l(1);
                                    } else if (iIntValue == 1) {
                                        androidx.appcompat.app.a.l(2);
                                    } else if (iIntValue == 2) {
                                        androidx.appcompat.app.a.l(-1);
                                    }
                                    return qy.b0.f48488a;
                                case 11:
                                    i2Var4.a(new zu.o1(((Boolean) obj).booleanValue()));
                                    break;
                                default:
                                    i2Var4.a(new zu.w1(((Boolean) obj).booleanValue()));
                                    break;
                            }
                            return qy.b0.f48488a;
                        }
                    };
                    sVar.o0(objQ11);
                }
                fz.c cVar8 = (fz.c) objQ11;
                boolean zH10 = sVar.h(i2Var4);
                Object objQ12 = sVar.Q();
                if (zH10 || objQ12 == gVar) {
                    final int i27 = 8;
                    objQ12 = new fz.c() { // from class: xu.j1
                        @Override // fz.c
                        public final Object invoke(Object obj) {
                            switch (i27) {
                                case 0:
                                    i2Var4.a(new zu.v1(((Integer) obj).intValue()));
                                    break;
                                case 1:
                                    i2Var4.a(new zu.u1(((Integer) obj).intValue()));
                                    break;
                                case 2:
                                    i2Var4.a(new zu.t1(((Boolean) obj).booleanValue()));
                                    break;
                                case 3:
                                    i2Var4.a(new zu.a2(((Integer) obj).intValue()));
                                    break;
                                case 4:
                                    i2Var4.a(new zu.x1(((Boolean) obj).booleanValue()));
                                    break;
                                case 5:
                                    i2Var4.a(new zu.p1(((Boolean) obj).booleanValue()));
                                    break;
                                case 6:
                                    i2Var4.a(new zu.r1(((Boolean) obj).booleanValue()));
                                    break;
                                case 7:
                                    i2Var4.a(new zu.s1(((Boolean) obj).booleanValue()));
                                    break;
                                case 8:
                                    i2Var4.a(new zu.y1(((Boolean) obj).booleanValue()));
                                    break;
                                case 9:
                                    i2Var4.a(new zu.q1(((Boolean) obj).booleanValue()));
                                    break;
                                case 10:
                                    int iIntValue = ((Integer) obj).intValue();
                                    i2Var4.a(new zu.z1(iIntValue));
                                    if (iIntValue == 0) {
                                        androidx.appcompat.app.a.l(1);
                                    } else if (iIntValue == 1) {
                                        androidx.appcompat.app.a.l(2);
                                    } else if (iIntValue == 2) {
                                        androidx.appcompat.app.a.l(-1);
                                    }
                                    return qy.b0.f48488a;
                                case 11:
                                    i2Var4.a(new zu.o1(((Boolean) obj).booleanValue()));
                                    break;
                                default:
                                    i2Var4.a(new zu.w1(((Boolean) obj).booleanValue()));
                                    break;
                            }
                            return qy.b0.f48488a;
                        }
                    };
                    sVar.o0(objQ12);
                }
                fz.c cVar9 = (fz.c) objQ12;
                boolean zH11 = sVar.h(i2Var4);
                Object objQ13 = sVar.Q();
                if (zH11 || objQ13 == gVar) {
                    final int i28 = 9;
                    objQ13 = new fz.c() { // from class: xu.j1
                        @Override // fz.c
                        public final Object invoke(Object obj) {
                            switch (i28) {
                                case 0:
                                    i2Var4.a(new zu.v1(((Integer) obj).intValue()));
                                    break;
                                case 1:
                                    i2Var4.a(new zu.u1(((Integer) obj).intValue()));
                                    break;
                                case 2:
                                    i2Var4.a(new zu.t1(((Boolean) obj).booleanValue()));
                                    break;
                                case 3:
                                    i2Var4.a(new zu.a2(((Integer) obj).intValue()));
                                    break;
                                case 4:
                                    i2Var4.a(new zu.x1(((Boolean) obj).booleanValue()));
                                    break;
                                case 5:
                                    i2Var4.a(new zu.p1(((Boolean) obj).booleanValue()));
                                    break;
                                case 6:
                                    i2Var4.a(new zu.r1(((Boolean) obj).booleanValue()));
                                    break;
                                case 7:
                                    i2Var4.a(new zu.s1(((Boolean) obj).booleanValue()));
                                    break;
                                case 8:
                                    i2Var4.a(new zu.y1(((Boolean) obj).booleanValue()));
                                    break;
                                case 9:
                                    i2Var4.a(new zu.q1(((Boolean) obj).booleanValue()));
                                    break;
                                case 10:
                                    int iIntValue = ((Integer) obj).intValue();
                                    i2Var4.a(new zu.z1(iIntValue));
                                    if (iIntValue == 0) {
                                        androidx.appcompat.app.a.l(1);
                                    } else if (iIntValue == 1) {
                                        androidx.appcompat.app.a.l(2);
                                    } else if (iIntValue == 2) {
                                        androidx.appcompat.app.a.l(-1);
                                    }
                                    return qy.b0.f48488a;
                                case 11:
                                    i2Var4.a(new zu.o1(((Boolean) obj).booleanValue()));
                                    break;
                                default:
                                    i2Var4.a(new zu.w1(((Boolean) obj).booleanValue()));
                                    break;
                            }
                            return qy.b0.f48488a;
                        }
                    };
                    sVar.o0(objQ13);
                }
                fz.c cVar10 = (fz.c) objQ13;
                boolean zH12 = sVar.h(i2Var4);
                Object objQ14 = sVar.Q();
                if (zH12 || objQ14 == gVar) {
                    final int i29 = 10;
                    objQ14 = new fz.c() { // from class: xu.j1
                        @Override // fz.c
                        public final Object invoke(Object obj) {
                            switch (i29) {
                                case 0:
                                    i2Var4.a(new zu.v1(((Integer) obj).intValue()));
                                    break;
                                case 1:
                                    i2Var4.a(new zu.u1(((Integer) obj).intValue()));
                                    break;
                                case 2:
                                    i2Var4.a(new zu.t1(((Boolean) obj).booleanValue()));
                                    break;
                                case 3:
                                    i2Var4.a(new zu.a2(((Integer) obj).intValue()));
                                    break;
                                case 4:
                                    i2Var4.a(new zu.x1(((Boolean) obj).booleanValue()));
                                    break;
                                case 5:
                                    i2Var4.a(new zu.p1(((Boolean) obj).booleanValue()));
                                    break;
                                case 6:
                                    i2Var4.a(new zu.r1(((Boolean) obj).booleanValue()));
                                    break;
                                case 7:
                                    i2Var4.a(new zu.s1(((Boolean) obj).booleanValue()));
                                    break;
                                case 8:
                                    i2Var4.a(new zu.y1(((Boolean) obj).booleanValue()));
                                    break;
                                case 9:
                                    i2Var4.a(new zu.q1(((Boolean) obj).booleanValue()));
                                    break;
                                case 10:
                                    int iIntValue = ((Integer) obj).intValue();
                                    i2Var4.a(new zu.z1(iIntValue));
                                    if (iIntValue == 0) {
                                        androidx.appcompat.app.a.l(1);
                                    } else if (iIntValue == 1) {
                                        androidx.appcompat.app.a.l(2);
                                    } else if (iIntValue == 2) {
                                        androidx.appcompat.app.a.l(-1);
                                    }
                                    return qy.b0.f48488a;
                                case 11:
                                    i2Var4.a(new zu.o1(((Boolean) obj).booleanValue()));
                                    break;
                                default:
                                    i2Var4.a(new zu.w1(((Boolean) obj).booleanValue()));
                                    break;
                            }
                            return qy.b0.f48488a;
                        }
                    };
                    sVar.o0(objQ14);
                }
                fz.c cVar11 = (fz.c) objQ14;
                boolean zH13 = sVar.h(i2Var4);
                Object objQ15 = sVar.Q();
                if (zH13 || objQ15 == gVar) {
                    final int i30 = 11;
                    objQ15 = new fz.c() { // from class: xu.j1
                        @Override // fz.c
                        public final Object invoke(Object obj) {
                            switch (i30) {
                                case 0:
                                    i2Var4.a(new zu.v1(((Integer) obj).intValue()));
                                    break;
                                case 1:
                                    i2Var4.a(new zu.u1(((Integer) obj).intValue()));
                                    break;
                                case 2:
                                    i2Var4.a(new zu.t1(((Boolean) obj).booleanValue()));
                                    break;
                                case 3:
                                    i2Var4.a(new zu.a2(((Integer) obj).intValue()));
                                    break;
                                case 4:
                                    i2Var4.a(new zu.x1(((Boolean) obj).booleanValue()));
                                    break;
                                case 5:
                                    i2Var4.a(new zu.p1(((Boolean) obj).booleanValue()));
                                    break;
                                case 6:
                                    i2Var4.a(new zu.r1(((Boolean) obj).booleanValue()));
                                    break;
                                case 7:
                                    i2Var4.a(new zu.s1(((Boolean) obj).booleanValue()));
                                    break;
                                case 8:
                                    i2Var4.a(new zu.y1(((Boolean) obj).booleanValue()));
                                    break;
                                case 9:
                                    i2Var4.a(new zu.q1(((Boolean) obj).booleanValue()));
                                    break;
                                case 10:
                                    int iIntValue = ((Integer) obj).intValue();
                                    i2Var4.a(new zu.z1(iIntValue));
                                    if (iIntValue == 0) {
                                        androidx.appcompat.app.a.l(1);
                                    } else if (iIntValue == 1) {
                                        androidx.appcompat.app.a.l(2);
                                    } else if (iIntValue == 2) {
                                        androidx.appcompat.app.a.l(-1);
                                    }
                                    return qy.b0.f48488a;
                                case 11:
                                    i2Var4.a(new zu.o1(((Boolean) obj).booleanValue()));
                                    break;
                                default:
                                    i2Var4.a(new zu.w1(((Boolean) obj).booleanValue()));
                                    break;
                            }
                            return qy.b0.f48488a;
                        }
                    };
                    sVar.o0(objQ15);
                }
                fz.c cVar12 = (fz.c) objQ15;
                boolean zH14 = sVar.h(i2Var4);
                Object objQ16 = sVar.Q();
                if (zH14 || objQ16 == gVar) {
                    final int i31 = 12;
                    objQ16 = new fz.c() { // from class: xu.j1
                        @Override // fz.c
                        public final Object invoke(Object obj) {
                            switch (i31) {
                                case 0:
                                    i2Var4.a(new zu.v1(((Integer) obj).intValue()));
                                    break;
                                case 1:
                                    i2Var4.a(new zu.u1(((Integer) obj).intValue()));
                                    break;
                                case 2:
                                    i2Var4.a(new zu.t1(((Boolean) obj).booleanValue()));
                                    break;
                                case 3:
                                    i2Var4.a(new zu.a2(((Integer) obj).intValue()));
                                    break;
                                case 4:
                                    i2Var4.a(new zu.x1(((Boolean) obj).booleanValue()));
                                    break;
                                case 5:
                                    i2Var4.a(new zu.p1(((Boolean) obj).booleanValue()));
                                    break;
                                case 6:
                                    i2Var4.a(new zu.r1(((Boolean) obj).booleanValue()));
                                    break;
                                case 7:
                                    i2Var4.a(new zu.s1(((Boolean) obj).booleanValue()));
                                    break;
                                case 8:
                                    i2Var4.a(new zu.y1(((Boolean) obj).booleanValue()));
                                    break;
                                case 9:
                                    i2Var4.a(new zu.q1(((Boolean) obj).booleanValue()));
                                    break;
                                case 10:
                                    int iIntValue = ((Integer) obj).intValue();
                                    i2Var4.a(new zu.z1(iIntValue));
                                    if (iIntValue == 0) {
                                        androidx.appcompat.app.a.l(1);
                                    } else if (iIntValue == 1) {
                                        androidx.appcompat.app.a.l(2);
                                    } else if (iIntValue == 2) {
                                        androidx.appcompat.app.a.l(-1);
                                    }
                                    return qy.b0.f48488a;
                                case 11:
                                    i2Var4.a(new zu.o1(((Boolean) obj).booleanValue()));
                                    break;
                                default:
                                    i2Var4.a(new zu.w1(((Boolean) obj).booleanValue()));
                                    break;
                            }
                            return qy.b0.f48488a;
                        }
                    };
                    sVar.o0(objQ16);
                }
                fz.c cVar13 = (fz.c) objQ16;
                boolean zH15 = sVar.h(i2Var4);
                Object objQ17 = sVar.Q();
                if (zH15 || objQ17 == gVar) {
                    objQ17 = new xa.a(i2Var4, 6);
                    sVar.o0(objQ17);
                }
                fz.a aVar4 = (fz.a) objQ17;
                boolean z23 = (i12 & 7168) == 2048;
                Object objQ18 = sVar.Q();
                if (z23 || objQ18 == gVar) {
                    objQ18 = new wo.c(29, clearCache);
                    sVar.o0(objQ18);
                }
                g(z11, i13, i14, i15, z12, i16, str, z13, z14, z15, z16, z17, z18, i17, z19, z20, z21, onClickClose, cVar, cVar2, cVar3, cVar4, aVar2, aVar3, cVar5, cVar6, cVar7, cVar8, cVar9, cVar10, cVar11, cVar12, cVar13, aVar4, onClickLanguageLearning, onClickHelpCenter, onClickContactUs, onClickAboutUs, onClickDebug, (fz.a) objQ18, aVar, sVar, 0, (i12 << 21) & 29360128, i12 & 268427264, (i12 >> 27) & 14);
                sVar = sVar;
                sVar.p(false);
            }
            i2Var2 = i2Var4;
        } else {
            sVar.W();
            i2Var2 = i2Var;
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new fs.g(onClickClose, navigationToReminder, navigationToAccount, clearCache, onClickLanguageLearning, onClickHelpCenter, onClickContactUs, onClickAboutUs, onClickDebug, aVar, i2Var2, i11);
        }
    }

    /* JADX WARN: Code duplicated, block: B:266:0x0405  */
    /* JADX WARN: Code duplicated, block: B:268:0x040d  */
    /* JADX WARN: Code duplicated, block: B:270:0x0418  */
    /* JADX WARN: Code duplicated, block: B:272:0x0423  */
    /* JADX WARN: Code duplicated, block: B:274:0x042b  */
    /* JADX WARN: Code duplicated, block: B:276:0x0436  */
    /* JADX WARN: Code duplicated, block: B:278:0x0441  */
    /* JADX WARN: Code duplicated, block: B:280:0x0449  */
    /* JADX WARN: Code duplicated, block: B:282:0x0454  */
    /* JADX WARN: Code duplicated, block: B:312:0x0502  */
    /* JADX WARN: Code duplicated, block: B:319:0x0535  */
    /* JADX WARN: Code duplicated, block: B:321:0x0561  */
    /* JADX WARN: Code duplicated, block: B:323:0x0570  */
    /* JADX WARN: Code duplicated, block: B:326:0x057f  */
    /* JADX WARN: Code duplicated, block: B:329:0x0593  */
    /* JADX WARN: Code duplicated, block: B:330:0x0595  */
    /* JADX WARN: Code duplicated, block: B:334:0x059e  */
    /* JADX WARN: Code duplicated, block: B:337:0x05c4  */
    /* JADX WARN: Code duplicated, block: B:340:0x05d6  */
    /* JADX WARN: Code duplicated, block: B:353:0x0613  */
    /* JADX WARN: Code duplicated, block: B:356:0x062b  */
    /* JADX WARN: Code duplicated, block: B:358:0x063e  */
    /* JADX WARN: Code duplicated, block: B:361:0x0652  */
    /* JADX WARN: Code duplicated, block: B:362:0x0654  */
    /* JADX WARN: Code duplicated, block: B:365:0x065b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:366:0x065d  */
    /* JADX WARN: Code duplicated, block: B:369:0x0681  */
    /* JADX WARN: Code duplicated, block: B:372:0x0691  */
    /* JADX WARN: Code duplicated, block: B:375:0x06af  */
    /* JADX WARN: Code duplicated, block: B:377:0x06c2  */
    /* JADX WARN: Code duplicated, block: B:380:0x06d5  */
    /* JADX WARN: Code duplicated, block: B:381:0x06d7  */
    /* JADX WARN: Code duplicated, block: B:384:0x06de A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:385:0x06e0  */
    /* JADX WARN: Code duplicated, block: B:387:0x070a  */
    /* JADX WARN: Code duplicated, block: B:390:0x0722  */
    /* JADX WARN: Code duplicated, block: B:393:0x0739  */
    /* JADX WARN: Code duplicated, block: B:395:0x0753  */
    /* JADX WARN: Code duplicated, block: B:396:0x0760  */
    /* JADX WARN: Code duplicated, block: B:399:0x076c  */
    /* JADX WARN: Code duplicated, block: B:400:0x076e  */
    /* JADX WARN: Code duplicated, block: B:403:0x0775 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:404:0x0777  */
    /* JADX WARN: Code duplicated, block: B:407:0x0790  */
    /* JADX WARN: Code duplicated, block: B:410:0x07a0  */
    /* JADX WARN: Code duplicated, block: B:413:0x07b7  */
    /* JADX WARN: Code duplicated, block: B:415:0x07c3  */
    /* JADX WARN: Code duplicated, block: B:416:0x07d0  */
    /* JADX WARN: Code duplicated, block: B:419:0x07da  */
    /* JADX WARN: Code duplicated, block: B:420:0x07dc  */
    /* JADX WARN: Code duplicated, block: B:423:0x07e3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:424:0x07e5  */
    /* JADX WARN: Code duplicated, block: B:427:0x07f9  */
    /* JADX WARN: Code duplicated, block: B:430:0x0846  */
    /* JADX WARN: Code duplicated, block: B:431:0x084a  */
    /* JADX WARN: Code duplicated, block: B:434:0x085d  */
    /* JADX WARN: Code duplicated, block: B:436:0x086b  */
    public static final void g(final boolean z11, final int i11, final int i12, final int i13, final boolean z12, final int i14, final String membershipType, final boolean z13, final boolean z14, final boolean z15, final boolean z16, final boolean z17, final boolean z18, final int i15, final boolean z19, final boolean z20, final boolean z21, final fz.a onClickClose, final fz.c updateScriptStyle, final fz.c updateRomajiSystem, final fz.c updateRedoWeakItems, final fz.c updateVoicePack, final fz.a navigationToReminder, final fz.a navigationToAccount, final fz.c updateSoundEffect, final fz.c updateAnimation, final fz.c updateNativeSpeakerVideos, final fz.c updateRankingEnable, final fz.c updateStreakEnable, final fz.c updateHideProfile, final fz.c updateThemeMode, final fz.c updateAllowAlternativeAnswers, final fz.c updateShowMistakeExplain, final fz.a onResetCoursePreferences, final fz.a onClickLanguageLearning, final fz.a onClickHelpCenter, final fz.a onClickContactUs, final fz.a onClickAboutUs, final fz.a onClickDebug, final fz.a clearCache, final fz.a aVar, l1.n nVar, final int i16, final int i17, final int i18, final int i19) {
        int i21;
        int i22;
        fz.a aVar2;
        int i23;
        l1.s sVar;
        int i24;
        int i25;
        String[] strArrD;
        l1.s sVar2;
        String[] strArr;
        int i26;
        boolean z22;
        String[] strArrD2;
        String[] strArr2;
        String[] strArr3;
        boolean z23;
        int i27;
        Object objQ;
        final l1.b1 b1Var;
        boolean z24;
        int i28;
        int i29;
        String[] strArrD3;
        final String[] strArr4;
        boolean z25;
        Object objQ2;
        final l1.b1 b1Var2;
        final String[] strArrC0;
        Object objQ3;
        final l1.b1 b1Var3;
        boolean z26;
        Object objQ4;
        final l1.b1 b1Var4;
        boolean z27;
        int iHashCode;
        y2.i iVar;
        y2.h hVar;
        Object objQ5;
        boolean z28;
        Object objQ6;
        Object objQ7;
        boolean z29;
        Object objQ8;
        Object objQ9;
        boolean z30;
        Object objQ10;
        Object objQ11;
        boolean z31;
        Object objQ12;
        int i30;
        int i31;
        Object objQ13;
        boolean z32;
        Object objQ14;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        kotlin.jvm.internal.m.f(membershipType, "membershipType");
        kotlin.jvm.internal.m.f(onClickClose, "onClickClose");
        kotlin.jvm.internal.m.f(updateScriptStyle, "updateScriptStyle");
        kotlin.jvm.internal.m.f(updateRomajiSystem, "updateRomajiSystem");
        kotlin.jvm.internal.m.f(updateRedoWeakItems, "updateRedoWeakItems");
        kotlin.jvm.internal.m.f(updateVoicePack, "updateVoicePack");
        kotlin.jvm.internal.m.f(navigationToReminder, "navigationToReminder");
        kotlin.jvm.internal.m.f(navigationToAccount, "navigationToAccount");
        kotlin.jvm.internal.m.f(updateSoundEffect, "updateSoundEffect");
        kotlin.jvm.internal.m.f(updateAnimation, "updateAnimation");
        kotlin.jvm.internal.m.f(updateNativeSpeakerVideos, "updateNativeSpeakerVideos");
        kotlin.jvm.internal.m.f(updateRankingEnable, "updateRankingEnable");
        kotlin.jvm.internal.m.f(updateStreakEnable, "updateStreakEnable");
        kotlin.jvm.internal.m.f(updateHideProfile, "updateHideProfile");
        kotlin.jvm.internal.m.f(updateThemeMode, "updateThemeMode");
        kotlin.jvm.internal.m.f(updateAllowAlternativeAnswers, "updateAllowAlternativeAnswers");
        kotlin.jvm.internal.m.f(updateShowMistakeExplain, "updateShowMistakeExplain");
        kotlin.jvm.internal.m.f(onResetCoursePreferences, "onResetCoursePreferences");
        kotlin.jvm.internal.m.f(onClickLanguageLearning, "onClickLanguageLearning");
        kotlin.jvm.internal.m.f(onClickHelpCenter, "onClickHelpCenter");
        kotlin.jvm.internal.m.f(onClickContactUs, "onClickContactUs");
        kotlin.jvm.internal.m.f(onClickAboutUs, "onClickAboutUs");
        kotlin.jvm.internal.m.f(onClickDebug, "onClickDebug");
        kotlin.jvm.internal.m.f(clearCache, "clearCache");
        l1.s sVar3 = (l1.s) nVar;
        sVar3.f0(-67103469);
        int i38 = i16 | (sVar3.g(z11) ? 4 : 2) | (sVar3.d(i11) ? 32 : 16) | (sVar3.d(i12) ? 256 : 128) | (sVar3.d(i13) ? 2048 : 1024);
        boolean zG = sVar3.g(z12);
        int i39 = OSSConstants.DEFAULT_BUFFER_SIZE;
        int i40 = i38 | (zG ? 16384 : 8192) | (sVar3.d(i14) ? 131072 : 65536) | (sVar3.g(z13) ? 8388608 : 4194304) | (sVar3.g(z14) ? 67108864 : 33554432) | (sVar3.g(z15) ? 536870912 : 268435456);
        if ((i17 & 6) == 0) {
            i21 = i17 | (sVar3.g(z16) ? 4 : 2);
        } else {
            i21 = i17;
        }
        if ((i17 & 48) == 0) {
            i21 |= sVar3.g(z17) ? 32 : 16;
        }
        if ((i17 & 384) == 0) {
            i21 |= sVar3.g(z18) ? 256 : 128;
        }
        if ((i17 & 3072) == 0) {
            i21 |= sVar3.d(i15) ? 2048 : 1024;
        }
        if ((i17 & 24576) == 0) {
            i21 |= sVar3.g(z19) ? 16384 : 8192;
        }
        if ((i17 & 196608) == 0) {
            i21 |= sVar3.g(z20) ? 131072 : 65536;
        }
        if ((i17 & 1572864) == 0) {
            i21 |= sVar3.g(z21) ? 1048576 : 524288;
        }
        if ((i17 & 12582912) == 0) {
            i21 |= sVar3.h(onClickClose) ? 8388608 : 4194304;
        }
        if ((i17 & 100663296) == 0) {
            i21 |= sVar3.h(updateScriptStyle) ? 67108864 : 33554432;
        }
        if ((i17 & 805306368) == 0) {
            i21 |= sVar3.h(updateRomajiSystem) ? 536870912 : 268435456;
        }
        int i41 = i21;
        int i42 = (sVar3.h(updateRedoWeakItems) ? (char) 4 : (char) 2) | (sVar3.h(updateVoicePack) ? ' ' : (char) 16) | (sVar3.h(navigationToReminder) ? 256 : 128) | (sVar3.h(navigationToAccount) ? 2048 : 1024) | (sVar3.h(updateSoundEffect) ? 16384 : 8192) | (sVar3.h(updateAnimation) ? 131072 : 65536) | (sVar3.h(updateNativeSpeakerVideos) ? 1048576 : 524288) | (sVar3.h(updateRankingEnable) ? 8388608 : 4194304) | (sVar3.h(updateStreakEnable) ? 67108864 : 33554432) | (sVar3.h(updateHideProfile) ? 536870912 : 268435456);
        if ((i18 & 6) == 0) {
            i22 = i18 | (sVar3.h(updateThemeMode) ? 4 : 2);
        } else {
            i22 = i18;
        }
        if ((i18 & 48) == 0) {
            i22 |= sVar3.h(updateAllowAlternativeAnswers) ? 32 : 16;
        }
        if ((i18 & 384) == 0) {
            i22 |= sVar3.h(updateShowMistakeExplain) ? 256 : 128;
        }
        if ((i18 & 3072) == 0) {
            aVar2 = onResetCoursePreferences;
            i22 |= sVar3.h(aVar2) ? 2048 : 1024;
        } else {
            aVar2 = onResetCoursePreferences;
        }
        if ((i18 & 24576) == 0) {
            if (sVar3.h(onClickLanguageLearning)) {
                i39 = 16384;
            }
            i22 |= i39;
        }
        if ((i18 & 196608) == 0) {
            i22 |= sVar3.h(onClickHelpCenter) ? 131072 : 65536;
        }
        if ((i18 & 1572864) == 0) {
            i22 |= sVar3.h(onClickContactUs) ? 1048576 : 524288;
        }
        if ((i18 & 12582912) == 0) {
            i22 |= sVar3.h(onClickAboutUs) ? 8388608 : 4194304;
        }
        if ((i18 & 100663296) == 0) {
            i22 |= sVar3.h(onClickDebug) ? 67108864 : 33554432;
        }
        if ((i18 & 805306368) == 0) {
            i22 |= sVar3.h(clearCache) ? 536870912 : 268435456;
        }
        int i43 = i22;
        if ((i19 & 6) == 0) {
            i23 = i19 | (sVar3.h(aVar) ? 4 : 2);
        } else {
            i23 = i19;
        }
        if (sVar3.T(i40 & 1, ((i40 & 306259091) == 306259090 && (i41 & 306783379) == 306783378 && (i42 & 306783379) == 306783378 && (i43 & 306783379) == 306783378 && (i23 & 3) == 2) ? false : true)) {
            Object objQ15 = sVar3.Q();
            l1.g gVar = l1.m.f39353a;
            if (objQ15 == gVar) {
                objQ15 = l1.t.B(Boolean.FALSE);
                sVar3.o0(objQ15);
            }
            final l1.b1 b1Var5 = (l1.b1) objQ15;
            if (i11 == 0) {
                sVar3.d0(-61871220);
                if (z11) {
                    i24 = -61870841;
                    i25 = R.array.pd_cn_display_item;
                } else {
                    i24 = -61868988;
                    i25 = R.array.cn_display_item;
                }
                strArrD = hh.p0.D(sVar3, i24, i25, sVar3, false);
                sVar3.p(false);
            } else if (i11 == 1) {
                sVar3.d0(-61866062);
                if (z11) {
                    i32 = -61865689;
                    i33 = R.array.pd_jp_display_item;
                } else {
                    i32 = -61863830;
                    i33 = R.array.japanese_display_item;
                }
                strArrD = hh.p0.D(sVar3, i32, i33, sVar3, false);
                sVar3.p(false);
            } else if (i11 == 2) {
                sVar3.d0(-61860720);
                if (z11) {
                    i34 = -61860345;
                    i35 = R.array.pd_kr_display_item;
                } else {
                    i34 = -61858488;
                    i35 = R.array.korean_display_item;
                }
                strArrD = hh.p0.D(sVar3, i34, i35, sVar3, false);
                sVar3.p(false);
            } else {
                if (i11 == 51 || i11 == 55) {
                    i36 = -61855515;
                    i37 = R.array.ara_display_item;
                } else if (i11 == 57) {
                    i36 = -61848122;
                    i37 = R.array.thai_display_item;
                } else if (i11 == 61) {
                    i36 = -61853017;
                    i37 = R.array.hindi_display_item;
                } else if (i11 != 65) {
                    switch (i11) {
                        case 11:
                            sVar3.d0(-61871220);
                            if (z11) {
                                i24 = -61870841;
                                i25 = R.array.pd_cn_display_item;
                            } else {
                                i24 = -61868988;
                                i25 = R.array.cn_display_item;
                            }
                            strArrD = hh.p0.D(sVar3, i24, i25, sVar3, false);
                            sVar3.p(false);
                            break;
                        case 12:
                            sVar3.d0(-61866062);
                            if (z11) {
                                i32 = -61865689;
                                i33 = R.array.pd_jp_display_item;
                            } else {
                                i32 = -61863830;
                                i33 = R.array.japanese_display_item;
                            }
                            strArrD = hh.p0.D(sVar3, i32, i33, sVar3, false);
                            sVar3.p(false);
                            break;
                        case 13:
                            sVar3.d0(-61860720);
                            if (z11) {
                                i34 = -61860345;
                                i35 = R.array.pd_kr_display_item;
                            } else {
                                i34 = -61858488;
                                i35 = R.array.korean_display_item;
                            }
                            strArrD = hh.p0.D(sVar3, i34, i35, sVar3, false);
                            sVar3.p(false);
                            break;
                        default:
                            sVar3.d0(-61845985);
                            sVar3.p(false);
                            strArrD = new String[0];
                            break;
                    }
                } else {
                    i36 = -61850555;
                    i37 = R.array.grk_display_item;
                }
                strArrD = hh.p0.D(sVar3, i36, i37, sVar3, false);
            }
            String[] strArr5 = strArrD;
            if (((Boolean) b1Var5.getValue()).booleanValue()) {
                sVar3.d0(-1917164866);
                String strM = m(sVar3, i11);
                Object objQ16 = sVar3.Q();
                if (objQ16 == gVar) {
                    objQ16 = new m(13, b1Var5);
                    sVar3.o0(objQ16);
                }
                fz.a aVar3 = (fz.a) objQ16;
                boolean z33 = (i41 & 234881024) == 67108864;
                Object objQ17 = sVar3.Q();
                if (z33 || objQ17 == gVar) {
                    objQ17 = new y3(updateScriptStyle, b1Var5, 12);
                    sVar3.o0(objQ17);
                }
                i26 = i40;
                e(strM, strArr5, i12, aVar3, (fz.c) objQ17, sVar3, (i26 & 896) | 3072);
                strArr = strArr5;
                sVar2 = sVar3;
            } else {
                sVar2 = sVar3;
                strArr = strArr5;
                i26 = i40;
                sVar2.d0(-1927970257);
            }
            sVar2.p(false);
            Object objQ18 = sVar2.Q();
            if (objQ18 == gVar) {
                objQ18 = l1.t.B(Boolean.FALSE);
                sVar2.o0(objQ18);
            }
            final l1.b1 b1Var6 = (l1.b1) objQ18;
            int i44 = 11;
            if (i11 != 0) {
                if (i11 == 1) {
                    i44 = 11;
                    strArr = strArr;
                    strArrD2 = hh.p0.D(sVar2, -61824375, R.array.js_luoma_system_item, sVar2, false);
                } else if (i11 == 11) {
                    z22 = false;
                } else if (i11 != 12) {
                    sVar2.d0(-61822113);
                    sVar2.p(false);
                    i44 = 11;
                    strArrD2 = new String[0];
                    strArr = strArr;
                } else {
                    i44 = 11;
                    strArr = strArr;
                    strArrD2 = hh.p0.D(sVar2, -61824375, R.array.js_luoma_system_item, sVar2, false);
                }
                strArr2 = strArrD2;
                if (((Boolean) b1Var6.getValue()).booleanValue()) {
                    sVar2.d0(-1916417270);
                    i27 = 1879048192;
                    if (ry.l.D(new Integer[]{Integer.valueOf(i44), 0}, Integer.valueOf(((Number) sVar2.j(ju.f.f37370d)).intValue()))) {
                        i30 = -1916345443;
                        i31 = R.string.character_system;
                    } else {
                        i30 = -1916258240;
                        i31 = R.string.romaji_system;
                    }
                    String strM2 = ep.a.m(sVar2, i30, i31, sVar2, false);
                    objQ13 = sVar2.Q();
                    if (objQ13 == gVar) {
                        objQ13 = new m(14, b1Var6);
                        sVar2.o0(objQ13);
                    }
                    fz.a aVar4 = (fz.a) objQ13;
                    if ((i41 & 1879048192) == 536870912) {
                        z32 = true;
                    } else {
                        z32 = false;
                    }
                    objQ14 = sVar2.Q();
                    if (z32 || objQ14 == gVar) {
                        objQ14 = new y3(updateRomajiSystem, b1Var6, 13);
                        sVar2.o0(objQ14);
                    }
                    e(strM2, strArr2, i13, aVar4, (fz.c) objQ14, sVar2, ((i26 >> 3) & 896) | 3072);
                    strArr3 = strArr2;
                    z23 = false;
                } else {
                    strArr3 = strArr2;
                    z23 = false;
                    i27 = 1879048192;
                    sVar2.d0(-1927970257);
                }
                sVar2.p(z23);
                objQ = sVar2.Q();
                if (objQ == gVar) {
                    objQ = l1.t.B(Boolean.FALSE);
                    sVar2.o0(objQ);
                }
                b1Var = (l1.b1) objQ;
                if (i11 != 8 || i11 == 17) {
                    z24 = false;
                    i28 = -61794875;
                    i29 = R.array.pt_mf_audio_item;
                } else {
                    if (i11 == 47 || i11 == 48) {
                        z24 = false;
                        i28 = -61797785;
                        i29 = R.array.esus_mf_audio_item;
                    } else {
                        b1Var6 = b1Var6;
                        strArr3 = strArr3;
                        strArrD3 = hh.p0.D(sVar2, -61792731, R.array.js_mf_audio_item, sVar2, false);
                    }
                    strArr4 = strArrD3;
                    if (((Boolean) b1Var.getValue()).booleanValue()) {
                        sVar2.d0(-1915478993);
                        String strE0 = ub.a.e0(sVar2, R.string.mf_audio_switch);
                        objQ11 = sVar2.Q();
                        if (objQ11 == gVar) {
                            objQ11 = new m(15, b1Var);
                            sVar2.o0(objQ11);
                        }
                        fz.a aVar5 = (fz.a) objQ11;
                        if ((i42 & 112) == 32) {
                            z31 = true;
                        } else {
                            z31 = false;
                        }
                        objQ12 = sVar2.Q();
                        if (z31 || objQ12 == gVar) {
                            objQ12 = new y3(updateVoicePack, b1Var, 14);
                            sVar2.o0(objQ12);
                        }
                        e(strE0, strArr4, i14, aVar5, (fz.c) objQ12, sVar2, ((i26 >> 9) & 896) | 3072);
                        z25 = false;
                    } else {
                        z25 = false;
                        sVar2.d0(-1927970257);
                    }
                    sVar2.p(z25);
                    objQ2 = sVar2.Q();
                    if (objQ2 == gVar) {
                        objQ2 = l1.t.B(Boolean.FALSE);
                        sVar2.o0(objQ2);
                    }
                    b1Var2 = (l1.b1) objQ2;
                    strArrC0 = ub.a.c0(sVar2, R.array.theme_settings_item);
                    if (((Boolean) b1Var2.getValue()).booleanValue()) {
                        sVar2.d0(-1914921799);
                        String strE1 = ub.a.e0(sVar2, R.string.theme);
                        objQ9 = sVar2.Q();
                        if (objQ9 == gVar) {
                            objQ9 = new m(16, b1Var2);
                            sVar2.o0(objQ9);
                        }
                        fz.a aVar6 = (fz.a) objQ9;
                        if ((i43 & 14) == 4) {
                            z30 = true;
                        } else {
                            z30 = false;
                        }
                        objQ10 = sVar2.Q();
                        if (z30 || objQ10 == gVar) {
                            objQ10 = new y3(updateThemeMode, b1Var2, 15);
                            sVar2.o0(objQ10);
                        }
                        e(strE1, strArrC0, i15, aVar6, (fz.c) objQ10, sVar2, ((i41 >> 3) & 896) | 3072);
                        sVar2.p(false);
                    } else {
                        sVar2.d0(-1927970257);
                        sVar2.p(false);
                    }
                    objQ3 = sVar2.Q();
                    if (objQ3 == gVar) {
                        objQ3 = l1.t.B(Boolean.FALSE);
                        sVar2.o0(objQ3);
                    }
                    b1Var3 = (l1.b1) objQ3;
                    if (((Boolean) b1Var3.getValue()).booleanValue()) {
                        sVar2.d0(-1914452490);
                        String strE2 = ub.a.e0(sVar2, R.string.warnings);
                        String strE3 = ub.a.e0(sVar2, R.string.erase_cache_warn);
                        objQ7 = sVar2.Q();
                        if (objQ7 == gVar) {
                            objQ7 = new m(17, b1Var3);
                            sVar2.o0(objQ7);
                        }
                        fz.a aVar7 = (fz.a) objQ7;
                        if ((i43 & i27) == 536870912) {
                            z29 = true;
                        } else {
                            z29 = false;
                        }
                        objQ8 = sVar2.Q();
                        if (z29 || objQ8 == gVar) {
                            objQ8 = new e1(1, clearCache, b1Var3);
                            sVar2.o0(objQ8);
                        }
                        l(strE2, strE3, aVar7, (fz.a) objQ8, sVar2, 384);
                        z26 = false;
                    } else {
                        b1Var2 = b1Var2;
                        z26 = false;
                        sVar2.d0(-1927970257);
                    }
                    sVar2.p(z26);
                    objQ4 = sVar2.Q();
                    if (objQ4 == gVar) {
                        objQ4 = l1.t.B(Boolean.FALSE);
                        sVar2.o0(objQ4);
                    }
                    b1Var4 = (l1.b1) objQ4;
                    if (((Boolean) b1Var4.getValue()).booleanValue()) {
                        sVar2.d0(-1913961636);
                        objQ5 = sVar2.Q();
                        if (objQ5 == gVar) {
                            objQ5 = new m(12, b1Var4);
                            sVar2.o0(objQ5);
                        }
                        fz.a aVar8 = (fz.a) objQ5;
                        if ((i43 & 7168) == 2048) {
                            z28 = true;
                        } else {
                            z28 = false;
                        }
                        objQ6 = sVar2.Q();
                        if (z28 || objQ6 == gVar) {
                            objQ6 = new e1(2, aVar2, b1Var4);
                            sVar2.o0(objQ6);
                        }
                        a(aVar8, (fz.a) objQ6, sVar2, 6);
                        z27 = false;
                    } else {
                        b1Var3 = b1Var3;
                        z27 = false;
                        sVar2.d0(-1927970257);
                    }
                    sVar2.p(z27);
                    long j11 = ((h1.s1) sVar2.j(h1.v1.f31180a)).f31031n;
                    g2.r0 r0Var = g2.f0.f28556b;
                    z1.o oVar = z1.o.f58481a;
                    z1.r rVarV = j0.c.v(e2.d(d0.n.h(oVar, j11, r0Var), 1.0f));
                    j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, sVar2, 0);
                    iHashCode = Long.hashCode(sVar2.T);
                    l1.q1 q1VarL = sVar2.l();
                    z1.r rVarC = z1.a.c(sVar2, rVarV);
                    y2.k.J.getClass();
                    iVar = y2.j.f56913b;
                    sVar2.h0();
                    if (sVar2.S) {
                        sVar2.k(iVar);
                    } else {
                        sVar2.r0();
                    }
                    l1.t.J(y2.j.f56917f, uVarA, sVar2);
                    l1.t.J(y2.j.f56916e, q1VarL, sVar2);
                    hVar = y2.j.f56918g;
                    if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode))) {
                        defpackage.e.A(iHashCode, sVar2, iHashCode, hVar);
                    }
                    l1.t.J(y2.j.f56915d, rVarC, sVar2);
                    iu.k.g(onClickClose, null, c.f56339b0, null, null, null, null, null, sVar2, ((i41 >> 21) & 14) | 384, 250);
                    k7.g(null, 10, g2.x.f28621h, sVar2, 432, 1);
                    l1.s sVar4 = sVar2;
                    final String[] strArr6 = strArr;
                    final String[] strArr7 = strArr3;
                    k7.d(d0.n.y(e2.d(oVar, 1.0f), d0.n.u(sVar2), true, 12), r0.f.d(0), null, null, null, t1.e.d(1781971499, new fz.f() { // from class: xu.k1
                        @Override // fz.f
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            int i45;
                            int i46;
                            int i47;
                            int i48;
                            j0.v Card = (j0.v) obj;
                            l1.n nVar2 = (l1.n) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            kotlin.jvm.internal.m.f(Card, "$this$Card");
                            l1.s sVar5 = (l1.s) nVar2;
                            if (sVar5.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                                String strE4 = ub.a.e0(sVar5, R.string.account);
                                float f5 = 16;
                                z1.o oVar2 = z1.o.f58481a;
                                q1.h(48, strE4, sVar5, j0.c.E(j0.c.C(oVar2, f5, CropImageView.DEFAULT_ASPECT_RATIO, 2), CropImageView.DEFAULT_ASPECT_RATIO, f5, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13));
                                String strE5 = ub.a.e0(sVar5, R.string.manage_account);
                                float f11 = 52;
                                z1.r rVarI = e2.i(oVar2, f11, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                                fz.a aVar9 = navigationToAccount;
                                boolean zF = sVar5.f(aVar9);
                                Object objQ19 = sVar5.Q();
                                l1.g gVar2 = l1.m.f39353a;
                                if (zF || objQ19 == gVar2) {
                                    objQ19 = new wo.c(20, aVar9);
                                    sVar5.o0(objQ19);
                                }
                                q1.d(R.drawable.me_settings_manage_account, strE5, true, d0.n.o(rVarI, false, null, (fz.a) objQ19, 15), sVar5, 384);
                                k7.g(j0.c.C(oVar2, f5, CropImageView.DEFAULT_ASPECT_RATIO, 2), CropImageView.DEFAULT_ASPECT_RATIO, 0L, sVar5, 6, 6);
                                float f12 = f5;
                                q1.h(48, ub.a.e0(sVar5, R.string.learning_preferences), sVar5, j0.c.E(j0.c.C(oVar2, f5, CropImageView.DEFAULT_ASPECT_RATIO, 2), CropImageView.DEFAULT_ASPECT_RATIO, f5, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13));
                                String strE6 = ub.a.e0(sVar5, R.string.sound_effect);
                                z1.r rVarI2 = e2.i(oVar2, f11, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                                fz.c cVar = updateSoundEffect;
                                boolean zF2 = sVar5.f(cVar);
                                Object objQ20 = sVar5.Q();
                                if (zF2 || objQ20 == gVar2) {
                                    objQ20 = new uu.b(cVar, 29);
                                    sVar5.o0(objQ20);
                                }
                                q1.j(R.drawable.me_settings_sound_effect, strE6, z13, rVarI2, null, (fz.c) objQ20, sVar5, 3072);
                                String strE7 = ub.a.e0(sVar5, R.string.animation);
                                z1.r rVarI3 = e2.i(oVar2, f11, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                                fz.c cVar2 = updateAnimation;
                                boolean zF3 = sVar5.f(cVar2);
                                Object objQ21 = sVar5.Q();
                                if (zF3 || objQ21 == gVar2) {
                                    objQ21 = new n1(cVar2, 0);
                                    sVar5.o0(objQ21);
                                }
                                q1.j(R.drawable.me_settings_animation, strE7, z14, rVarI3, null, (fz.c) objQ21, sVar5, 3072);
                                l1.s sVar6 = sVar5;
                                if (xt.d.j(((Number) sVar6.j(ju.f.f37370d)).intValue())) {
                                    sVar6.d0(918858855);
                                    String strE8 = ub.a.e0(sVar6, R.string.native_speaker_videos);
                                    z1.r rVarI4 = e2.i(oVar2, f11, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                                    fz.c cVar3 = updateNativeSpeakerVideos;
                                    boolean zF4 = sVar6.f(cVar3);
                                    Object objQ22 = sVar6.Q();
                                    if (zF4 || objQ22 == gVar2) {
                                        objQ22 = new n1(cVar3, 1);
                                        sVar6.o0(objQ22);
                                    }
                                    q1.j(2131232683, strE8, z15, rVarI4, null, (fz.c) objQ22, sVar6, 3072);
                                    sVar6 = sVar6;
                                } else {
                                    sVar6.d0(902198711);
                                }
                                sVar6.p(false);
                                String strE9 = ub.a.e0(sVar6, R.string.redo_weak_items);
                                z1.r rVarI5 = e2.i(oVar2, f11, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                                fz.c cVar4 = updateRedoWeakItems;
                                boolean zF5 = sVar6.f(cVar4);
                                Object objQ23 = sVar6.Q();
                                if (zF5 || objQ23 == gVar2) {
                                    objQ23 = new n1(cVar4, 2);
                                    sVar6.o0(objQ23);
                                }
                                l1.s sVar7 = sVar6;
                                q1.j(R.drawable.me_settings_redo_weak_items, strE9, z12, rVarI5, null, (fz.c) objQ23, sVar7, 3072);
                                l1.s sVar8 = sVar7;
                                sVar8.d0(-1217258224);
                                for (Iterator it = ns.o.K(i1.COURSE_PREFERENCES_RESET).iterator(); it.hasNext(); it = it) {
                                    if (p1.f56502a[((i1) it.next()).ordinal()] != 1) {
                                        throw nv.p.x(sVar8, -1328133059, false);
                                    }
                                    sVar8.d0(1777636948);
                                    String strE10 = ub.a.e0(sVar8, R.string.course_preferences_reset);
                                    z1.r rVarI6 = e2.i(oVar2, f11, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                                    Object objQ24 = sVar8.Q();
                                    if (objQ24 == gVar2) {
                                        objQ24 = new m(20, b1Var4);
                                        sVar8.o0(objQ24);
                                    }
                                    q1.d(R.drawable.account_reset_progress, strE10, true, d0.n.o(rVarI6, false, null, (fz.a) objQ24, 15), sVar8, 384);
                                    sVar8.p(false);
                                }
                                sVar8.p(false);
                                int i49 = i14;
                                if (i49 != -1) {
                                    sVar8.d0(920460532);
                                    String strE11 = ub.a.e0(sVar8, R.string.mf_audio_switch);
                                    String str = strArr4[i49];
                                    z1.r rVarI7 = e2.i(oVar2, 67, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                                    Object objQ25 = sVar8.Q();
                                    if (objQ25 == gVar2) {
                                        objQ25 = new m(21, b1Var);
                                        sVar8.o0(objQ25);
                                    }
                                    i45 = 67;
                                    q1.c(R.drawable.me_settings_voice_pack, strE11, str, d0.n.o(rVarI7, false, null, (fz.a) objQ25, 15), sVar8, 0);
                                } else {
                                    i45 = 67;
                                    sVar8.d0(902198711);
                                }
                                sVar8.p(false);
                                int i50 = i12;
                                if (i50 != -1) {
                                    sVar8.d0(920944101);
                                    String strM3 = q1.m(sVar8, i11);
                                    String str2 = strArr6[i50];
                                    z1.r rVarI8 = e2.i(oVar2, i45, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                                    Object objQ26 = sVar8.Q();
                                    if (objQ26 == gVar2) {
                                        objQ26 = new m(22, b1Var5);
                                        sVar8.o0(objQ26);
                                    }
                                    q1.c(R.drawable.me_settings_script_style, strM3, str2, d0.n.o(rVarI8, false, null, (fz.a) objQ26, 15), sVar8, 0);
                                } else {
                                    sVar8.d0(902198711);
                                }
                                sVar8.p(false);
                                int i51 = i13;
                                if (i51 != -1) {
                                    sVar8.d0(921418246);
                                    if (ry.l.D(new Integer[]{11, 0}, Integer.valueOf(((Number) sVar8.j(ju.f.f37370d)).intValue()))) {
                                        i47 = 921555917;
                                        i48 = R.string.character_system;
                                    } else {
                                        i47 = 921666928;
                                        i48 = R.string.romaji_system;
                                    }
                                    String strM4 = ep.a.m(sVar8, i47, i48, sVar8, false);
                                    String str3 = strArr7[i51];
                                    z1.r rVarI9 = e2.i(oVar2, 67, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                                    Object objQ27 = sVar8.Q();
                                    if (objQ27 == gVar2) {
                                        objQ27 = new m(23, b1Var6);
                                        sVar8.o0(objQ27);
                                    }
                                    q1.c(R.drawable.me_settings_romaji_system, strM4, str3, d0.n.o(rVarI9, false, null, (fz.a) objQ27, 15), sVar8, 0);
                                } else {
                                    sVar8.d0(902198711);
                                }
                                sVar8.p(false);
                                if (z21) {
                                    sVar8.d0(922120706);
                                    k7.g(j0.c.C(oVar2, f12, CropImageView.DEFAULT_ASPECT_RATIO, 2), CropImageView.DEFAULT_ASPECT_RATIO, 0L, sVar8, 6, 6);
                                    q1.h(48, ub.a.e0(sVar8, R.string.ai_features), sVar8, j0.c.E(j0.c.C(oVar2, f12, CropImageView.DEFAULT_ASPECT_RATIO, 2), CropImageView.DEFAULT_ASPECT_RATIO, f12, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13));
                                    String strE12 = ub.a.e0(sVar8, R.string.accept_alternative_answers);
                                    z1.r rVarI10 = e2.i(oVar2, f11, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                                    fz.c cVar5 = updateAllowAlternativeAnswers;
                                    boolean zF6 = sVar8.f(cVar5);
                                    Object objQ28 = sVar8.Q();
                                    if (zF6 || objQ28 == gVar2) {
                                        f12 = f12;
                                        objQ28 = new n1(cVar5, 3);
                                        sVar8.o0(objQ28);
                                    }
                                    i46 = 48;
                                    q1.j(R.drawable.me_settings_ai_alternative_answers, strE12, z19, rVarI10, null, (fz.c) objQ28, sVar8, 3072);
                                    String strE13 = ub.a.e0(sVar8, R.string.mistake_explanation);
                                    z1.r rVarI11 = e2.i(oVar2, f11, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                                    fz.c cVar6 = updateShowMistakeExplain;
                                    boolean zF7 = sVar8.f(cVar6);
                                    Object objQ29 = sVar8.Q();
                                    if (zF7 || objQ29 == gVar2) {
                                        objQ29 = new uu.b(cVar6, 25);
                                        sVar8.o0(objQ29);
                                    }
                                    q1.j(R.drawable.me_settings_ai_mistake_explain, strE13, z20, rVarI11, null, (fz.c) objQ29, sVar8, 3072);
                                    sVar8 = sVar8;
                                } else {
                                    i46 = 48;
                                    sVar8.d0(902198711);
                                }
                                sVar8.p(false);
                                k7.g(j0.c.C(oVar2, f12, CropImageView.DEFAULT_ASPECT_RATIO, 2), CropImageView.DEFAULT_ASPECT_RATIO, 0L, sVar8, 6, 6);
                                float f13 = f12;
                                q1.h(i46, ub.a.e0(sVar8, R.string.others), sVar8, j0.c.E(j0.c.C(oVar2, f12, CropImageView.DEFAULT_ASPECT_RATIO, 2), CropImageView.DEFAULT_ASPECT_RATIO, f13, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13));
                                String strE14 = ub.a.e0(sVar8, R.string.streak_notification);
                                z1.r rVarI12 = e2.i(oVar2, f11, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                                fz.c cVar7 = updateStreakEnable;
                                boolean zF8 = sVar8.f(cVar7);
                                Object objQ30 = sVar8.Q();
                                if (zF8 || objQ30 == gVar2) {
                                    objQ30 = new uu.b(cVar7, 26);
                                    sVar8.o0(objQ30);
                                }
                                l1.s sVar9 = sVar8;
                                q1.j(R.drawable.me_settings_streak_notification, strE14, z17, rVarI12, null, (fz.c) objQ30, sVar9, 3072);
                                String strE15 = ub.a.e0(sVar9, R.string.ranking);
                                z1.r rVarI13 = e2.i(oVar2, f11, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                                fz.c cVar8 = updateRankingEnable;
                                boolean zF9 = sVar9.f(cVar8);
                                Object objQ31 = sVar9.Q();
                                if (zF9 || objQ31 == gVar2) {
                                    objQ31 = new uu.b(cVar8, 27);
                                    sVar9.o0(objQ31);
                                }
                                q1.j(R.drawable.me_settings_ranking, strE15, z16, rVarI13, null, (fz.c) objQ31, sVar9, 3072);
                                String strE16 = ub.a.e0(sVar9, R.string.hide_my_profile);
                                z1.r rVarI14 = e2.i(oVar2, f11, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                                fz.c cVar9 = updateHideProfile;
                                boolean zF10 = sVar9.f(cVar9);
                                Object objQ32 = sVar9.Q();
                                if (zF10 || objQ32 == gVar2) {
                                    objQ32 = new uu.b(cVar9, 28);
                                    sVar9.o0(objQ32);
                                }
                                q1.j(R.drawable.me_settings_hide_profile, strE16, z18, rVarI14, null, (fz.c) objQ32, sVar9, 3072);
                                String strE17 = ub.a.e0(sVar9, R.string.reminders);
                                z1.r rVarI15 = e2.i(oVar2, f11, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                                fz.a aVar10 = navigationToReminder;
                                boolean zF11 = sVar9.f(aVar10);
                                Object objQ33 = sVar9.Q();
                                if (zF11 || objQ33 == gVar2) {
                                    objQ33 = new wo.c(21, aVar10);
                                    sVar9.o0(objQ33);
                                }
                                q1.d(R.drawable.me_settings_reminder, strE17, true, d0.n.o(rVarI15, false, null, (fz.a) objQ33, 15), sVar9, 384);
                                sVar9.d0(902198711);
                                sVar9.p(false);
                                String strE18 = ub.a.e0(sVar9, R.string.theme);
                                String str4 = strArrC0[i15];
                                float f14 = 67;
                                z1.r rVarI16 = e2.i(oVar2, f14, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                                Object objQ34 = sVar9.Q();
                                if (objQ34 == gVar2) {
                                    objQ34 = new m(18, b1Var2);
                                    sVar9.o0(objQ34);
                                }
                                q1.c(R.drawable.me_settings_theme, strE18, str4, d0.n.o(rVarI16, false, null, (fz.a) objQ34, 15), sVar9, 0);
                                String strE19 = ub.a.e0(sVar9, R.string.offline_learning);
                                z1.r rVarI17 = e2.i(oVar2, f11, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                                fz.a aVar11 = aVar;
                                boolean zF12 = sVar9.f(aVar11);
                                Object objQ35 = sVar9.Q();
                                if (zF12 || objQ35 == gVar2) {
                                    objQ35 = new wo.c(22, aVar11);
                                    sVar9.o0(objQ35);
                                }
                                q1.d(R.drawable.backup_download_offline_learning, strE19, true, d0.n.o(rVarI17, false, null, (fz.a) objQ35, 15), sVar9, 384);
                                String strE20 = ub.a.e0(sVar9, R.string.clear_cache_data);
                                z1.r rVarI18 = e2.i(oVar2, f11, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                                Object objQ36 = sVar9.Q();
                                if (objQ36 == gVar2) {
                                    objQ36 = new m(19, b1Var3);
                                    sVar9.o0(objQ36);
                                }
                                q1.d(R.drawable.me_settings_clear_cache, strE20, false, iu.k.q(24582, 7, (fz.a) objQ36, sVar9, rVarI18, false), sVar9, 384);
                                String strE21 = ub.a.e0(sVar9, R.string.app_language_courses);
                                z1.r rVarI19 = e2.i(oVar2, f14, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                                fz.a aVar12 = onClickLanguageLearning;
                                boolean zF13 = sVar9.f(aVar12);
                                Object objQ37 = sVar9.Q();
                                if (zF13 || objQ37 == gVar2) {
                                    objQ37 = new wo.c(23, aVar12);
                                    sVar9.o0(objQ37);
                                }
                                q1.d(R.drawable.account_language_learning, strE21, false, d0.n.o(rVarI19, false, null, (fz.a) objQ37, 15), sVar9, 384);
                                k7.g(j0.c.C(oVar2, f13, CropImageView.DEFAULT_ASPECT_RATIO, 2), CropImageView.DEFAULT_ASPECT_RATIO, 0L, sVar9, 6, 6);
                                q1.h(i46, ub.a.e0(sVar9, R.string.support), sVar9, j0.c.E(j0.c.C(oVar2, f13, CropImageView.DEFAULT_ASPECT_RATIO, 2), CropImageView.DEFAULT_ASPECT_RATIO, f13, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13));
                                String strE22 = ub.a.e0(sVar9, R.string.faq);
                                z1.r rVarI20 = e2.i(oVar2, f11, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                                fz.a aVar13 = onClickHelpCenter;
                                boolean zF14 = sVar9.f(aVar13);
                                Object objQ38 = sVar9.Q();
                                if (zF14 || objQ38 == gVar2) {
                                    objQ38 = new wo.c(24, aVar13);
                                    sVar9.o0(objQ38);
                                }
                                q1.d(R.drawable.account_help_center, strE22, true, iu.k.q(6, 7, (fz.a) objQ38, sVar9, rVarI20, false), sVar9, 384);
                                String strE23 = ub.a.e0(sVar9, R.string.contact_us);
                                z1.r rVarI21 = e2.i(oVar2, f11, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                                fz.a aVar14 = onClickContactUs;
                                boolean zF15 = sVar9.f(aVar14);
                                Object objQ39 = sVar9.Q();
                                if (zF15 || objQ39 == gVar2) {
                                    objQ39 = new wo.c(25, aVar14);
                                    sVar9.o0(objQ39);
                                }
                                q1.d(R.drawable.account_contact_us, strE23, true, iu.k.q(6, 7, (fz.a) objQ39, sVar9, rVarI21, false), sVar9, 384);
                                String strE24 = ub.a.e0(sVar9, R.string.about_lingodeer);
                                z1.r rVarI22 = e2.i(oVar2, f11, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                                fz.a aVar15 = onClickAboutUs;
                                boolean zF16 = sVar9.f(aVar15);
                                Object objQ40 = sVar9.Q();
                                if (zF16 || objQ40 == gVar2) {
                                    objQ40 = new wo.c(26, aVar15);
                                    sVar9.o0(objQ40);
                                }
                                l1.s sVar10 = sVar9;
                                q1.b(384, strE24, sVar10, iu.k.q(6, 7, (fz.a) objQ40, sVar9, rVarI22, false));
                                if (((Boolean) sVar10.j(ju.f.f37375i)).booleanValue()) {
                                    sVar10.d0(928535753);
                                    z1.r rVarI23 = e2.i(oVar2, f11, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                                    fz.a aVar16 = onClickDebug;
                                    boolean zF17 = sVar10.f(aVar16);
                                    Object objQ41 = sVar10.Q();
                                    if (zF17 || objQ41 == gVar2) {
                                        objQ41 = new wo.c(27, aVar16);
                                        sVar10.o0(objQ41);
                                    }
                                    z1.r rVarQ = iu.k.q(6, 7, (fz.a) objQ41, sVar10, rVarI23, false);
                                    sVar10 = sVar10;
                                    q1.d(R.drawable.account_about_us, "Debug", true, rVarQ, sVar10, 432);
                                } else {
                                    sVar10.d0(902198711);
                                }
                                sVar10.p(false);
                            } else {
                                sVar5.W();
                            }
                            return qy.b0.f48488a;
                        }
                    }, sVar4), sVar4, 196608, 28);
                    sVar = sVar4;
                    sVar.p(true);
                }
                strArrD3 = hh.p0.D(sVar2, i28, i29, sVar2, z24);
                strArr4 = strArrD3;
                if (((Boolean) b1Var.getValue()).booleanValue()) {
                    sVar2.d0(-1915478993);
                    String strE4 = ub.a.e0(sVar2, R.string.mf_audio_switch);
                    objQ11 = sVar2.Q();
                    if (objQ11 == gVar) {
                        objQ11 = new m(15, b1Var);
                        sVar2.o0(objQ11);
                    }
                    fz.a aVar9 = (fz.a) objQ11;
                    if ((i42 & 112) == 32) {
                        z31 = true;
                    } else {
                        z31 = false;
                    }
                    objQ12 = sVar2.Q();
                    if (z31) {
                        objQ12 = new y3(updateVoicePack, b1Var, 14);
                        sVar2.o0(objQ12);
                    } else {
                        objQ12 = new y3(updateVoicePack, b1Var, 14);
                        sVar2.o0(objQ12);
                    }
                    e(strE4, strArr4, i14, aVar9, (fz.c) objQ12, sVar2, ((i26 >> 9) & 896) | 3072);
                    z25 = false;
                } else {
                    z25 = false;
                    sVar2.d0(-1927970257);
                }
                sVar2.p(z25);
                objQ2 = sVar2.Q();
                if (objQ2 == gVar) {
                    objQ2 = l1.t.B(Boolean.FALSE);
                    sVar2.o0(objQ2);
                }
                b1Var2 = (l1.b1) objQ2;
                strArrC0 = ub.a.c0(sVar2, R.array.theme_settings_item);
                if (((Boolean) b1Var2.getValue()).booleanValue()) {
                    sVar2.d0(-1914921799);
                    String strE5 = ub.a.e0(sVar2, R.string.theme);
                    objQ9 = sVar2.Q();
                    if (objQ9 == gVar) {
                        objQ9 = new m(16, b1Var2);
                        sVar2.o0(objQ9);
                    }
                    fz.a aVar10 = (fz.a) objQ9;
                    if ((i43 & 14) == 4) {
                        z30 = true;
                    } else {
                        z30 = false;
                    }
                    objQ10 = sVar2.Q();
                    if (z30) {
                        objQ10 = new y3(updateThemeMode, b1Var2, 15);
                        sVar2.o0(objQ10);
                    } else {
                        objQ10 = new y3(updateThemeMode, b1Var2, 15);
                        sVar2.o0(objQ10);
                    }
                    e(strE5, strArrC0, i15, aVar10, (fz.c) objQ10, sVar2, ((i41 >> 3) & 896) | 3072);
                    sVar2.p(false);
                } else {
                    sVar2.d0(-1927970257);
                    sVar2.p(false);
                }
                objQ3 = sVar2.Q();
                if (objQ3 == gVar) {
                    objQ3 = l1.t.B(Boolean.FALSE);
                    sVar2.o0(objQ3);
                }
                b1Var3 = (l1.b1) objQ3;
                if (((Boolean) b1Var3.getValue()).booleanValue()) {
                    sVar2.d0(-1914452490);
                    String strE6 = ub.a.e0(sVar2, R.string.warnings);
                    String strE7 = ub.a.e0(sVar2, R.string.erase_cache_warn);
                    objQ7 = sVar2.Q();
                    if (objQ7 == gVar) {
                        objQ7 = new m(17, b1Var3);
                        sVar2.o0(objQ7);
                    }
                    fz.a aVar11 = (fz.a) objQ7;
                    if ((i43 & i27) == 536870912) {
                        z29 = true;
                    } else {
                        z29 = false;
                    }
                    objQ8 = sVar2.Q();
                    if (z29) {
                        objQ8 = new e1(1, clearCache, b1Var3);
                        sVar2.o0(objQ8);
                    } else {
                        objQ8 = new e1(1, clearCache, b1Var3);
                        sVar2.o0(objQ8);
                    }
                    l(strE6, strE7, aVar11, (fz.a) objQ8, sVar2, 384);
                    z26 = false;
                } else {
                    b1Var2 = b1Var2;
                    z26 = false;
                    sVar2.d0(-1927970257);
                }
                sVar2.p(z26);
                objQ4 = sVar2.Q();
                if (objQ4 == gVar) {
                    objQ4 = l1.t.B(Boolean.FALSE);
                    sVar2.o0(objQ4);
                }
                b1Var4 = (l1.b1) objQ4;
                if (((Boolean) b1Var4.getValue()).booleanValue()) {
                    sVar2.d0(-1913961636);
                    objQ5 = sVar2.Q();
                    if (objQ5 == gVar) {
                        objQ5 = new m(12, b1Var4);
                        sVar2.o0(objQ5);
                    }
                    fz.a aVar12 = (fz.a) objQ5;
                    if ((i43 & 7168) == 2048) {
                        z28 = true;
                    } else {
                        z28 = false;
                    }
                    objQ6 = sVar2.Q();
                    if (z28) {
                        objQ6 = new e1(2, aVar2, b1Var4);
                        sVar2.o0(objQ6);
                    } else {
                        objQ6 = new e1(2, aVar2, b1Var4);
                        sVar2.o0(objQ6);
                    }
                    a(aVar12, (fz.a) objQ6, sVar2, 6);
                    z27 = false;
                } else {
                    b1Var3 = b1Var3;
                    z27 = false;
                    sVar2.d0(-1927970257);
                }
                sVar2.p(z27);
                long j12 = ((h1.s1) sVar2.j(h1.v1.f31180a)).f31031n;
                g2.r0 r0Var2 = g2.f0.f28556b;
                z1.o oVar2 = z1.o.f58481a;
                z1.r rVarV2 = j0.c.v(e2.d(d0.n.h(oVar2, j12, r0Var2), 1.0f));
                j0.u uVarA2 = j0.t.a(j0.i.f35305c, z1.c.O, sVar2, 0);
                iHashCode = Long.hashCode(sVar2.T);
                l1.q1 q1VarL2 = sVar2.l();
                z1.r rVarC2 = z1.a.c(sVar2, rVarV2);
                y2.k.J.getClass();
                iVar = y2.j.f56913b;
                sVar2.h0();
                if (sVar2.S) {
                    sVar2.k(iVar);
                } else {
                    sVar2.r0();
                }
                l1.t.J(y2.j.f56917f, uVarA2, sVar2);
                l1.t.J(y2.j.f56916e, q1VarL2, sVar2);
                hVar = y2.j.f56918g;
                if (sVar2.S) {
                    defpackage.e.A(iHashCode, sVar2, iHashCode, hVar);
                } else {
                    defpackage.e.A(iHashCode, sVar2, iHashCode, hVar);
                }
                l1.t.J(y2.j.f56915d, rVarC2, sVar2);
                iu.k.g(onClickClose, null, c.f56339b0, null, null, null, null, null, sVar2, ((i41 >> 21) & 14) | 384, 250);
                k7.g(null, 10, g2.x.f28621h, sVar2, 432, 1);
                l1.s sVar5 = sVar2;
                final String[] strArr8 = strArr;
                final String[] strArr9 = strArr3;
                k7.d(d0.n.y(e2.d(oVar2, 1.0f), d0.n.u(sVar2), true, 12), r0.f.d(0), null, null, null, t1.e.d(1781971499, new fz.f() { // from class: xu.k1
                    @Override // fz.f
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int i45;
                        int i46;
                        int i47;
                        int i48;
                        j0.v Card = (j0.v) obj;
                        l1.n nVar2 = (l1.n) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        kotlin.jvm.internal.m.f(Card, "$this$Card");
                        l1.s sVar6 = (l1.s) nVar2;
                        if (sVar6.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                            String strE8 = ub.a.e0(sVar6, R.string.account);
                            float f5 = 16;
                            z1.o oVar3 = z1.o.f58481a;
                            q1.h(48, strE8, sVar6, j0.c.E(j0.c.C(oVar3, f5, CropImageView.DEFAULT_ASPECT_RATIO, 2), CropImageView.DEFAULT_ASPECT_RATIO, f5, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13));
                            String strE9 = ub.a.e0(sVar6, R.string.manage_account);
                            float f11 = 52;
                            z1.r rVarI = e2.i(oVar3, f11, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                            fz.a aVar13 = navigationToAccount;
                            boolean zF = sVar6.f(aVar13);
                            Object objQ19 = sVar6.Q();
                            l1.g gVar2 = l1.m.f39353a;
                            if (zF || objQ19 == gVar2) {
                                objQ19 = new wo.c(20, aVar13);
                                sVar6.o0(objQ19);
                            }
                            q1.d(R.drawable.me_settings_manage_account, strE9, true, d0.n.o(rVarI, false, null, (fz.a) objQ19, 15), sVar6, 384);
                            k7.g(j0.c.C(oVar3, f5, CropImageView.DEFAULT_ASPECT_RATIO, 2), CropImageView.DEFAULT_ASPECT_RATIO, 0L, sVar6, 6, 6);
                            float f12 = f5;
                            q1.h(48, ub.a.e0(sVar6, R.string.learning_preferences), sVar6, j0.c.E(j0.c.C(oVar3, f5, CropImageView.DEFAULT_ASPECT_RATIO, 2), CropImageView.DEFAULT_ASPECT_RATIO, f5, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13));
                            String strE10 = ub.a.e0(sVar6, R.string.sound_effect);
                            z1.r rVarI2 = e2.i(oVar3, f11, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                            fz.c cVar = updateSoundEffect;
                            boolean zF2 = sVar6.f(cVar);
                            Object objQ20 = sVar6.Q();
                            if (zF2 || objQ20 == gVar2) {
                                objQ20 = new uu.b(cVar, 29);
                                sVar6.o0(objQ20);
                            }
                            q1.j(R.drawable.me_settings_sound_effect, strE10, z13, rVarI2, null, (fz.c) objQ20, sVar6, 3072);
                            String strE11 = ub.a.e0(sVar6, R.string.animation);
                            z1.r rVarI3 = e2.i(oVar3, f11, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                            fz.c cVar2 = updateAnimation;
                            boolean zF3 = sVar6.f(cVar2);
                            Object objQ21 = sVar6.Q();
                            if (zF3 || objQ21 == gVar2) {
                                objQ21 = new n1(cVar2, 0);
                                sVar6.o0(objQ21);
                            }
                            q1.j(R.drawable.me_settings_animation, strE11, z14, rVarI3, null, (fz.c) objQ21, sVar6, 3072);
                            l1.s sVar7 = sVar6;
                            if (xt.d.j(((Number) sVar7.j(ju.f.f37370d)).intValue())) {
                                sVar7.d0(918858855);
                                String strE12 = ub.a.e0(sVar7, R.string.native_speaker_videos);
                                z1.r rVarI4 = e2.i(oVar3, f11, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                                fz.c cVar3 = updateNativeSpeakerVideos;
                                boolean zF4 = sVar7.f(cVar3);
                                Object objQ22 = sVar7.Q();
                                if (zF4 || objQ22 == gVar2) {
                                    objQ22 = new n1(cVar3, 1);
                                    sVar7.o0(objQ22);
                                }
                                q1.j(2131232683, strE12, z15, rVarI4, null, (fz.c) objQ22, sVar7, 3072);
                                sVar7 = sVar7;
                            } else {
                                sVar7.d0(902198711);
                            }
                            sVar7.p(false);
                            String strE13 = ub.a.e0(sVar7, R.string.redo_weak_items);
                            z1.r rVarI5 = e2.i(oVar3, f11, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                            fz.c cVar4 = updateRedoWeakItems;
                            boolean zF5 = sVar7.f(cVar4);
                            Object objQ23 = sVar7.Q();
                            if (zF5 || objQ23 == gVar2) {
                                objQ23 = new n1(cVar4, 2);
                                sVar7.o0(objQ23);
                            }
                            l1.s sVar8 = sVar7;
                            q1.j(R.drawable.me_settings_redo_weak_items, strE13, z12, rVarI5, null, (fz.c) objQ23, sVar8, 3072);
                            l1.s sVar9 = sVar8;
                            sVar9.d0(-1217258224);
                            for (Iterator it = ns.o.K(i1.COURSE_PREFERENCES_RESET).iterator(); it.hasNext(); it = it) {
                                if (p1.f56502a[((i1) it.next()).ordinal()] != 1) {
                                    throw nv.p.x(sVar9, -1328133059, false);
                                }
                                sVar9.d0(1777636948);
                                String strE14 = ub.a.e0(sVar9, R.string.course_preferences_reset);
                                z1.r rVarI6 = e2.i(oVar3, f11, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                                Object objQ24 = sVar9.Q();
                                if (objQ24 == gVar2) {
                                    objQ24 = new m(20, b1Var4);
                                    sVar9.o0(objQ24);
                                }
                                q1.d(R.drawable.account_reset_progress, strE14, true, d0.n.o(rVarI6, false, null, (fz.a) objQ24, 15), sVar9, 384);
                                sVar9.p(false);
                            }
                            sVar9.p(false);
                            int i49 = i14;
                            if (i49 != -1) {
                                sVar9.d0(920460532);
                                String strE15 = ub.a.e0(sVar9, R.string.mf_audio_switch);
                                String str = strArr4[i49];
                                z1.r rVarI7 = e2.i(oVar3, 67, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                                Object objQ25 = sVar9.Q();
                                if (objQ25 == gVar2) {
                                    objQ25 = new m(21, b1Var);
                                    sVar9.o0(objQ25);
                                }
                                i45 = 67;
                                q1.c(R.drawable.me_settings_voice_pack, strE15, str, d0.n.o(rVarI7, false, null, (fz.a) objQ25, 15), sVar9, 0);
                            } else {
                                i45 = 67;
                                sVar9.d0(902198711);
                            }
                            sVar9.p(false);
                            int i50 = i12;
                            if (i50 != -1) {
                                sVar9.d0(920944101);
                                String strM3 = q1.m(sVar9, i11);
                                String str2 = strArr8[i50];
                                z1.r rVarI8 = e2.i(oVar3, i45, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                                Object objQ26 = sVar9.Q();
                                if (objQ26 == gVar2) {
                                    objQ26 = new m(22, b1Var5);
                                    sVar9.o0(objQ26);
                                }
                                q1.c(R.drawable.me_settings_script_style, strM3, str2, d0.n.o(rVarI8, false, null, (fz.a) objQ26, 15), sVar9, 0);
                            } else {
                                sVar9.d0(902198711);
                            }
                            sVar9.p(false);
                            int i51 = i13;
                            if (i51 != -1) {
                                sVar9.d0(921418246);
                                if (ry.l.D(new Integer[]{11, 0}, Integer.valueOf(((Number) sVar9.j(ju.f.f37370d)).intValue()))) {
                                    i47 = 921555917;
                                    i48 = R.string.character_system;
                                } else {
                                    i47 = 921666928;
                                    i48 = R.string.romaji_system;
                                }
                                String strM4 = ep.a.m(sVar9, i47, i48, sVar9, false);
                                String str3 = strArr9[i51];
                                z1.r rVarI9 = e2.i(oVar3, 67, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                                Object objQ27 = sVar9.Q();
                                if (objQ27 == gVar2) {
                                    objQ27 = new m(23, b1Var6);
                                    sVar9.o0(objQ27);
                                }
                                q1.c(R.drawable.me_settings_romaji_system, strM4, str3, d0.n.o(rVarI9, false, null, (fz.a) objQ27, 15), sVar9, 0);
                            } else {
                                sVar9.d0(902198711);
                            }
                            sVar9.p(false);
                            if (z21) {
                                sVar9.d0(922120706);
                                k7.g(j0.c.C(oVar3, f12, CropImageView.DEFAULT_ASPECT_RATIO, 2), CropImageView.DEFAULT_ASPECT_RATIO, 0L, sVar9, 6, 6);
                                q1.h(48, ub.a.e0(sVar9, R.string.ai_features), sVar9, j0.c.E(j0.c.C(oVar3, f12, CropImageView.DEFAULT_ASPECT_RATIO, 2), CropImageView.DEFAULT_ASPECT_RATIO, f12, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13));
                                String strE16 = ub.a.e0(sVar9, R.string.accept_alternative_answers);
                                z1.r rVarI10 = e2.i(oVar3, f11, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                                fz.c cVar5 = updateAllowAlternativeAnswers;
                                boolean zF6 = sVar9.f(cVar5);
                                Object objQ28 = sVar9.Q();
                                if (zF6 || objQ28 == gVar2) {
                                    f12 = f12;
                                    objQ28 = new n1(cVar5, 3);
                                    sVar9.o0(objQ28);
                                }
                                i46 = 48;
                                q1.j(R.drawable.me_settings_ai_alternative_answers, strE16, z19, rVarI10, null, (fz.c) objQ28, sVar9, 3072);
                                String strE17 = ub.a.e0(sVar9, R.string.mistake_explanation);
                                z1.r rVarI11 = e2.i(oVar3, f11, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                                fz.c cVar6 = updateShowMistakeExplain;
                                boolean zF7 = sVar9.f(cVar6);
                                Object objQ29 = sVar9.Q();
                                if (zF7 || objQ29 == gVar2) {
                                    objQ29 = new uu.b(cVar6, 25);
                                    sVar9.o0(objQ29);
                                }
                                q1.j(R.drawable.me_settings_ai_mistake_explain, strE17, z20, rVarI11, null, (fz.c) objQ29, sVar9, 3072);
                                sVar9 = sVar9;
                            } else {
                                i46 = 48;
                                sVar9.d0(902198711);
                            }
                            sVar9.p(false);
                            k7.g(j0.c.C(oVar3, f12, CropImageView.DEFAULT_ASPECT_RATIO, 2), CropImageView.DEFAULT_ASPECT_RATIO, 0L, sVar9, 6, 6);
                            float f13 = f12;
                            q1.h(i46, ub.a.e0(sVar9, R.string.others), sVar9, j0.c.E(j0.c.C(oVar3, f12, CropImageView.DEFAULT_ASPECT_RATIO, 2), CropImageView.DEFAULT_ASPECT_RATIO, f13, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13));
                            String strE18 = ub.a.e0(sVar9, R.string.streak_notification);
                            z1.r rVarI12 = e2.i(oVar3, f11, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                            fz.c cVar7 = updateStreakEnable;
                            boolean zF8 = sVar9.f(cVar7);
                            Object objQ30 = sVar9.Q();
                            if (zF8 || objQ30 == gVar2) {
                                objQ30 = new uu.b(cVar7, 26);
                                sVar9.o0(objQ30);
                            }
                            l1.s sVar10 = sVar9;
                            q1.j(R.drawable.me_settings_streak_notification, strE18, z17, rVarI12, null, (fz.c) objQ30, sVar10, 3072);
                            String strE19 = ub.a.e0(sVar10, R.string.ranking);
                            z1.r rVarI13 = e2.i(oVar3, f11, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                            fz.c cVar8 = updateRankingEnable;
                            boolean zF9 = sVar10.f(cVar8);
                            Object objQ31 = sVar10.Q();
                            if (zF9 || objQ31 == gVar2) {
                                objQ31 = new uu.b(cVar8, 27);
                                sVar10.o0(objQ31);
                            }
                            q1.j(R.drawable.me_settings_ranking, strE19, z16, rVarI13, null, (fz.c) objQ31, sVar10, 3072);
                            String strE110 = ub.a.e0(sVar10, R.string.hide_my_profile);
                            z1.r rVarI14 = e2.i(oVar3, f11, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                            fz.c cVar9 = updateHideProfile;
                            boolean zF10 = sVar10.f(cVar9);
                            Object objQ32 = sVar10.Q();
                            if (zF10 || objQ32 == gVar2) {
                                objQ32 = new uu.b(cVar9, 28);
                                sVar10.o0(objQ32);
                            }
                            q1.j(R.drawable.me_settings_hide_profile, strE110, z18, rVarI14, null, (fz.c) objQ32, sVar10, 3072);
                            String strE111 = ub.a.e0(sVar10, R.string.reminders);
                            z1.r rVarI15 = e2.i(oVar3, f11, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                            fz.a aVar14 = navigationToReminder;
                            boolean zF11 = sVar10.f(aVar14);
                            Object objQ33 = sVar10.Q();
                            if (zF11 || objQ33 == gVar2) {
                                objQ33 = new wo.c(21, aVar14);
                                sVar10.o0(objQ33);
                            }
                            q1.d(R.drawable.me_settings_reminder, strE111, true, d0.n.o(rVarI15, false, null, (fz.a) objQ33, 15), sVar10, 384);
                            sVar10.d0(902198711);
                            sVar10.p(false);
                            String strE112 = ub.a.e0(sVar10, R.string.theme);
                            String str4 = strArrC0[i15];
                            float f14 = 67;
                            z1.r rVarI16 = e2.i(oVar3, f14, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                            Object objQ34 = sVar10.Q();
                            if (objQ34 == gVar2) {
                                objQ34 = new m(18, b1Var2);
                                sVar10.o0(objQ34);
                            }
                            q1.c(R.drawable.me_settings_theme, strE112, str4, d0.n.o(rVarI16, false, null, (fz.a) objQ34, 15), sVar10, 0);
                            String strE113 = ub.a.e0(sVar10, R.string.offline_learning);
                            z1.r rVarI17 = e2.i(oVar3, f11, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                            fz.a aVar15 = aVar;
                            boolean zF12 = sVar10.f(aVar15);
                            Object objQ35 = sVar10.Q();
                            if (zF12 || objQ35 == gVar2) {
                                objQ35 = new wo.c(22, aVar15);
                                sVar10.o0(objQ35);
                            }
                            q1.d(R.drawable.backup_download_offline_learning, strE113, true, d0.n.o(rVarI17, false, null, (fz.a) objQ35, 15), sVar10, 384);
                            String strE20 = ub.a.e0(sVar10, R.string.clear_cache_data);
                            z1.r rVarI18 = e2.i(oVar3, f11, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                            Object objQ36 = sVar10.Q();
                            if (objQ36 == gVar2) {
                                objQ36 = new m(19, b1Var3);
                                sVar10.o0(objQ36);
                            }
                            q1.d(R.drawable.me_settings_clear_cache, strE20, false, iu.k.q(24582, 7, (fz.a) objQ36, sVar10, rVarI18, false), sVar10, 384);
                            String strE21 = ub.a.e0(sVar10, R.string.app_language_courses);
                            z1.r rVarI19 = e2.i(oVar3, f14, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                            fz.a aVar16 = onClickLanguageLearning;
                            boolean zF13 = sVar10.f(aVar16);
                            Object objQ37 = sVar10.Q();
                            if (zF13 || objQ37 == gVar2) {
                                objQ37 = new wo.c(23, aVar16);
                                sVar10.o0(objQ37);
                            }
                            q1.d(R.drawable.account_language_learning, strE21, false, d0.n.o(rVarI19, false, null, (fz.a) objQ37, 15), sVar10, 384);
                            k7.g(j0.c.C(oVar3, f13, CropImageView.DEFAULT_ASPECT_RATIO, 2), CropImageView.DEFAULT_ASPECT_RATIO, 0L, sVar10, 6, 6);
                            q1.h(i46, ub.a.e0(sVar10, R.string.support), sVar10, j0.c.E(j0.c.C(oVar3, f13, CropImageView.DEFAULT_ASPECT_RATIO, 2), CropImageView.DEFAULT_ASPECT_RATIO, f13, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13));
                            String strE22 = ub.a.e0(sVar10, R.string.faq);
                            z1.r rVarI20 = e2.i(oVar3, f11, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                            fz.a aVar17 = onClickHelpCenter;
                            boolean zF14 = sVar10.f(aVar17);
                            Object objQ38 = sVar10.Q();
                            if (zF14 || objQ38 == gVar2) {
                                objQ38 = new wo.c(24, aVar17);
                                sVar10.o0(objQ38);
                            }
                            q1.d(R.drawable.account_help_center, strE22, true, iu.k.q(6, 7, (fz.a) objQ38, sVar10, rVarI20, false), sVar10, 384);
                            String strE23 = ub.a.e0(sVar10, R.string.contact_us);
                            z1.r rVarI21 = e2.i(oVar3, f11, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                            fz.a aVar18 = onClickContactUs;
                            boolean zF15 = sVar10.f(aVar18);
                            Object objQ39 = sVar10.Q();
                            if (zF15 || objQ39 == gVar2) {
                                objQ39 = new wo.c(25, aVar18);
                                sVar10.o0(objQ39);
                            }
                            q1.d(R.drawable.account_contact_us, strE23, true, iu.k.q(6, 7, (fz.a) objQ39, sVar10, rVarI21, false), sVar10, 384);
                            String strE24 = ub.a.e0(sVar10, R.string.about_lingodeer);
                            z1.r rVarI22 = e2.i(oVar3, f11, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                            fz.a aVar19 = onClickAboutUs;
                            boolean zF16 = sVar10.f(aVar19);
                            Object objQ40 = sVar10.Q();
                            if (zF16 || objQ40 == gVar2) {
                                objQ40 = new wo.c(26, aVar19);
                                sVar10.o0(objQ40);
                            }
                            l1.s sVar11 = sVar10;
                            q1.b(384, strE24, sVar11, iu.k.q(6, 7, (fz.a) objQ40, sVar10, rVarI22, false));
                            if (((Boolean) sVar11.j(ju.f.f37375i)).booleanValue()) {
                                sVar11.d0(928535753);
                                z1.r rVarI23 = e2.i(oVar3, f11, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                                fz.a aVar110 = onClickDebug;
                                boolean zF17 = sVar11.f(aVar110);
                                Object objQ41 = sVar11.Q();
                                if (zF17 || objQ41 == gVar2) {
                                    objQ41 = new wo.c(27, aVar110);
                                    sVar11.o0(objQ41);
                                }
                                z1.r rVarQ = iu.k.q(6, 7, (fz.a) objQ41, sVar11, rVarI23, false);
                                sVar11 = sVar11;
                                q1.d(R.drawable.account_about_us, "Debug", true, rVarQ, sVar11, 432);
                            } else {
                                sVar11.d0(902198711);
                            }
                            sVar11.p(false);
                        } else {
                            sVar6.W();
                        }
                        return qy.b0.f48488a;
                    }
                }, sVar5), sVar5, 196608, 28);
                sVar = sVar5;
                sVar.p(true);
            } else {
                z22 = false;
            }
            strArrD2 = hh.p0.D(sVar2, -61827414, R.array.character_system_item, sVar2, z22);
            strArr2 = strArrD2;
            if (((Boolean) b1Var6.getValue()).booleanValue()) {
                sVar2.d0(-1916417270);
                i27 = 1879048192;
                if (ry.l.D(new Integer[]{Integer.valueOf(i44), 0}, Integer.valueOf(((Number) sVar2.j(ju.f.f37370d)).intValue()))) {
                    i30 = -1916345443;
                    i31 = R.string.character_system;
                } else {
                    i30 = -1916258240;
                    i31 = R.string.romaji_system;
                }
                String strM3 = ep.a.m(sVar2, i30, i31, sVar2, false);
                objQ13 = sVar2.Q();
                if (objQ13 == gVar) {
                    objQ13 = new m(14, b1Var6);
                    sVar2.o0(objQ13);
                }
                fz.a aVar13 = (fz.a) objQ13;
                if ((i41 & 1879048192) == 536870912) {
                    z32 = true;
                } else {
                    z32 = false;
                }
                objQ14 = sVar2.Q();
                if (z32) {
                    objQ14 = new y3(updateRomajiSystem, b1Var6, 13);
                    sVar2.o0(objQ14);
                } else {
                    objQ14 = new y3(updateRomajiSystem, b1Var6, 13);
                    sVar2.o0(objQ14);
                }
                e(strM3, strArr2, i13, aVar13, (fz.c) objQ14, sVar2, ((i26 >> 3) & 896) | 3072);
                strArr3 = strArr2;
                z23 = false;
            } else {
                strArr3 = strArr2;
                z23 = false;
                i27 = 1879048192;
                sVar2.d0(-1927970257);
            }
            sVar2.p(z23);
            objQ = sVar2.Q();
            if (objQ == gVar) {
                objQ = l1.t.B(Boolean.FALSE);
                sVar2.o0(objQ);
            }
            b1Var = (l1.b1) objQ;
            if (i11 != 8) {
                z24 = false;
                i28 = -61794875;
                i29 = R.array.pt_mf_audio_item;
                strArrD3 = hh.p0.D(sVar2, i28, i29, sVar2, z24);
            } else {
                z24 = false;
                i28 = -61794875;
                i29 = R.array.pt_mf_audio_item;
                strArrD3 = hh.p0.D(sVar2, i28, i29, sVar2, z24);
            }
            strArr4 = strArrD3;
            if (((Boolean) b1Var.getValue()).booleanValue()) {
                sVar2.d0(-1915478993);
                String strE8 = ub.a.e0(sVar2, R.string.mf_audio_switch);
                objQ11 = sVar2.Q();
                if (objQ11 == gVar) {
                    objQ11 = new m(15, b1Var);
                    sVar2.o0(objQ11);
                }
                fz.a aVar14 = (fz.a) objQ11;
                if ((i42 & 112) == 32) {
                    z31 = true;
                } else {
                    z31 = false;
                }
                objQ12 = sVar2.Q();
                if (z31) {
                    objQ12 = new y3(updateVoicePack, b1Var, 14);
                    sVar2.o0(objQ12);
                } else {
                    objQ12 = new y3(updateVoicePack, b1Var, 14);
                    sVar2.o0(objQ12);
                }
                e(strE8, strArr4, i14, aVar14, (fz.c) objQ12, sVar2, ((i26 >> 9) & 896) | 3072);
                z25 = false;
            } else {
                z25 = false;
                sVar2.d0(-1927970257);
            }
            sVar2.p(z25);
            objQ2 = sVar2.Q();
            if (objQ2 == gVar) {
                objQ2 = l1.t.B(Boolean.FALSE);
                sVar2.o0(objQ2);
            }
            b1Var2 = (l1.b1) objQ2;
            strArrC0 = ub.a.c0(sVar2, R.array.theme_settings_item);
            if (((Boolean) b1Var2.getValue()).booleanValue()) {
                sVar2.d0(-1914921799);
                String strE9 = ub.a.e0(sVar2, R.string.theme);
                objQ9 = sVar2.Q();
                if (objQ9 == gVar) {
                    objQ9 = new m(16, b1Var2);
                    sVar2.o0(objQ9);
                }
                fz.a aVar15 = (fz.a) objQ9;
                if ((i43 & 14) == 4) {
                    z30 = true;
                } else {
                    z30 = false;
                }
                objQ10 = sVar2.Q();
                if (z30) {
                    objQ10 = new y3(updateThemeMode, b1Var2, 15);
                    sVar2.o0(objQ10);
                } else {
                    objQ10 = new y3(updateThemeMode, b1Var2, 15);
                    sVar2.o0(objQ10);
                }
                e(strE9, strArrC0, i15, aVar15, (fz.c) objQ10, sVar2, ((i41 >> 3) & 896) | 3072);
                sVar2.p(false);
            } else {
                sVar2.d0(-1927970257);
                sVar2.p(false);
            }
            objQ3 = sVar2.Q();
            if (objQ3 == gVar) {
                objQ3 = l1.t.B(Boolean.FALSE);
                sVar2.o0(objQ3);
            }
            b1Var3 = (l1.b1) objQ3;
            if (((Boolean) b1Var3.getValue()).booleanValue()) {
                sVar2.d0(-1914452490);
                String strE10 = ub.a.e0(sVar2, R.string.warnings);
                String strE11 = ub.a.e0(sVar2, R.string.erase_cache_warn);
                objQ7 = sVar2.Q();
                if (objQ7 == gVar) {
                    objQ7 = new m(17, b1Var3);
                    sVar2.o0(objQ7);
                }
                fz.a aVar16 = (fz.a) objQ7;
                if ((i43 & i27) == 536870912) {
                    z29 = true;
                } else {
                    z29 = false;
                }
                objQ8 = sVar2.Q();
                if (z29) {
                    objQ8 = new e1(1, clearCache, b1Var3);
                    sVar2.o0(objQ8);
                } else {
                    objQ8 = new e1(1, clearCache, b1Var3);
                    sVar2.o0(objQ8);
                }
                l(strE10, strE11, aVar16, (fz.a) objQ8, sVar2, 384);
                z26 = false;
            } else {
                b1Var2 = b1Var2;
                z26 = false;
                sVar2.d0(-1927970257);
            }
            sVar2.p(z26);
            objQ4 = sVar2.Q();
            if (objQ4 == gVar) {
                objQ4 = l1.t.B(Boolean.FALSE);
                sVar2.o0(objQ4);
            }
            b1Var4 = (l1.b1) objQ4;
            if (((Boolean) b1Var4.getValue()).booleanValue()) {
                sVar2.d0(-1913961636);
                objQ5 = sVar2.Q();
                if (objQ5 == gVar) {
                    objQ5 = new m(12, b1Var4);
                    sVar2.o0(objQ5);
                }
                fz.a aVar17 = (fz.a) objQ5;
                if ((i43 & 7168) == 2048) {
                    z28 = true;
                } else {
                    z28 = false;
                }
                objQ6 = sVar2.Q();
                if (z28) {
                    objQ6 = new e1(2, aVar2, b1Var4);
                    sVar2.o0(objQ6);
                } else {
                    objQ6 = new e1(2, aVar2, b1Var4);
                    sVar2.o0(objQ6);
                }
                a(aVar17, (fz.a) objQ6, sVar2, 6);
                z27 = false;
            } else {
                b1Var3 = b1Var3;
                z27 = false;
                sVar2.d0(-1927970257);
            }
            sVar2.p(z27);
            long j13 = ((h1.s1) sVar2.j(h1.v1.f31180a)).f31031n;
            g2.r0 r0Var3 = g2.f0.f28556b;
            z1.o oVar3 = z1.o.f58481a;
            z1.r rVarV3 = j0.c.v(e2.d(d0.n.h(oVar3, j13, r0Var3), 1.0f));
            j0.u uVarA3 = j0.t.a(j0.i.f35305c, z1.c.O, sVar2, 0);
            iHashCode = Long.hashCode(sVar2.T);
            l1.q1 q1VarL3 = sVar2.l();
            z1.r rVarC3 = z1.a.c(sVar2, rVarV3);
            y2.k.J.getClass();
            iVar = y2.j.f56913b;
            sVar2.h0();
            if (sVar2.S) {
                sVar2.k(iVar);
            } else {
                sVar2.r0();
            }
            l1.t.J(y2.j.f56917f, uVarA3, sVar2);
            l1.t.J(y2.j.f56916e, q1VarL3, sVar2);
            hVar = y2.j.f56918g;
            if (sVar2.S) {
                defpackage.e.A(iHashCode, sVar2, iHashCode, hVar);
            } else {
                defpackage.e.A(iHashCode, sVar2, iHashCode, hVar);
            }
            l1.t.J(y2.j.f56915d, rVarC3, sVar2);
            iu.k.g(onClickClose, null, c.f56339b0, null, null, null, null, null, sVar2, ((i41 >> 21) & 14) | 384, 250);
            k7.g(null, 10, g2.x.f28621h, sVar2, 432, 1);
            l1.s sVar6 = sVar2;
            final String[] strArr10 = strArr;
            final String[] strArr11 = strArr3;
            k7.d(d0.n.y(e2.d(oVar3, 1.0f), d0.n.u(sVar2), true, 12), r0.f.d(0), null, null, null, t1.e.d(1781971499, new fz.f() { // from class: xu.k1
                @Override // fz.f
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i45;
                    int i46;
                    int i47;
                    int i48;
                    j0.v Card = (j0.v) obj;
                    l1.n nVar2 = (l1.n) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    kotlin.jvm.internal.m.f(Card, "$this$Card");
                    l1.s sVar7 = (l1.s) nVar2;
                    if (sVar7.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                        String strE12 = ub.a.e0(sVar7, R.string.account);
                        float f5 = 16;
                        z1.o oVar4 = z1.o.f58481a;
                        q1.h(48, strE12, sVar7, j0.c.E(j0.c.C(oVar4, f5, CropImageView.DEFAULT_ASPECT_RATIO, 2), CropImageView.DEFAULT_ASPECT_RATIO, f5, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13));
                        String strE13 = ub.a.e0(sVar7, R.string.manage_account);
                        float f11 = 52;
                        z1.r rVarI = e2.i(oVar4, f11, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                        fz.a aVar18 = navigationToAccount;
                        boolean zF = sVar7.f(aVar18);
                        Object objQ19 = sVar7.Q();
                        l1.g gVar2 = l1.m.f39353a;
                        if (zF || objQ19 == gVar2) {
                            objQ19 = new wo.c(20, aVar18);
                            sVar7.o0(objQ19);
                        }
                        q1.d(R.drawable.me_settings_manage_account, strE13, true, d0.n.o(rVarI, false, null, (fz.a) objQ19, 15), sVar7, 384);
                        k7.g(j0.c.C(oVar4, f5, CropImageView.DEFAULT_ASPECT_RATIO, 2), CropImageView.DEFAULT_ASPECT_RATIO, 0L, sVar7, 6, 6);
                        float f12 = f5;
                        q1.h(48, ub.a.e0(sVar7, R.string.learning_preferences), sVar7, j0.c.E(j0.c.C(oVar4, f5, CropImageView.DEFAULT_ASPECT_RATIO, 2), CropImageView.DEFAULT_ASPECT_RATIO, f5, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13));
                        String strE14 = ub.a.e0(sVar7, R.string.sound_effect);
                        z1.r rVarI2 = e2.i(oVar4, f11, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                        fz.c cVar = updateSoundEffect;
                        boolean zF2 = sVar7.f(cVar);
                        Object objQ20 = sVar7.Q();
                        if (zF2 || objQ20 == gVar2) {
                            objQ20 = new uu.b(cVar, 29);
                            sVar7.o0(objQ20);
                        }
                        q1.j(R.drawable.me_settings_sound_effect, strE14, z13, rVarI2, null, (fz.c) objQ20, sVar7, 3072);
                        String strE15 = ub.a.e0(sVar7, R.string.animation);
                        z1.r rVarI3 = e2.i(oVar4, f11, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                        fz.c cVar2 = updateAnimation;
                        boolean zF3 = sVar7.f(cVar2);
                        Object objQ21 = sVar7.Q();
                        if (zF3 || objQ21 == gVar2) {
                            objQ21 = new n1(cVar2, 0);
                            sVar7.o0(objQ21);
                        }
                        q1.j(R.drawable.me_settings_animation, strE15, z14, rVarI3, null, (fz.c) objQ21, sVar7, 3072);
                        l1.s sVar8 = sVar7;
                        if (xt.d.j(((Number) sVar8.j(ju.f.f37370d)).intValue())) {
                            sVar8.d0(918858855);
                            String strE16 = ub.a.e0(sVar8, R.string.native_speaker_videos);
                            z1.r rVarI4 = e2.i(oVar4, f11, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                            fz.c cVar3 = updateNativeSpeakerVideos;
                            boolean zF4 = sVar8.f(cVar3);
                            Object objQ22 = sVar8.Q();
                            if (zF4 || objQ22 == gVar2) {
                                objQ22 = new n1(cVar3, 1);
                                sVar8.o0(objQ22);
                            }
                            q1.j(2131232683, strE16, z15, rVarI4, null, (fz.c) objQ22, sVar8, 3072);
                            sVar8 = sVar8;
                        } else {
                            sVar8.d0(902198711);
                        }
                        sVar8.p(false);
                        String strE17 = ub.a.e0(sVar8, R.string.redo_weak_items);
                        z1.r rVarI5 = e2.i(oVar4, f11, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                        fz.c cVar4 = updateRedoWeakItems;
                        boolean zF5 = sVar8.f(cVar4);
                        Object objQ23 = sVar8.Q();
                        if (zF5 || objQ23 == gVar2) {
                            objQ23 = new n1(cVar4, 2);
                            sVar8.o0(objQ23);
                        }
                        l1.s sVar9 = sVar8;
                        q1.j(R.drawable.me_settings_redo_weak_items, strE17, z12, rVarI5, null, (fz.c) objQ23, sVar9, 3072);
                        l1.s sVar10 = sVar9;
                        sVar10.d0(-1217258224);
                        for (Iterator it = ns.o.K(i1.COURSE_PREFERENCES_RESET).iterator(); it.hasNext(); it = it) {
                            if (p1.f56502a[((i1) it.next()).ordinal()] != 1) {
                                throw nv.p.x(sVar10, -1328133059, false);
                            }
                            sVar10.d0(1777636948);
                            String strE18 = ub.a.e0(sVar10, R.string.course_preferences_reset);
                            z1.r rVarI6 = e2.i(oVar4, f11, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                            Object objQ24 = sVar10.Q();
                            if (objQ24 == gVar2) {
                                objQ24 = new m(20, b1Var4);
                                sVar10.o0(objQ24);
                            }
                            q1.d(R.drawable.account_reset_progress, strE18, true, d0.n.o(rVarI6, false, null, (fz.a) objQ24, 15), sVar10, 384);
                            sVar10.p(false);
                        }
                        sVar10.p(false);
                        int i49 = i14;
                        if (i49 != -1) {
                            sVar10.d0(920460532);
                            String strE19 = ub.a.e0(sVar10, R.string.mf_audio_switch);
                            String str = strArr4[i49];
                            z1.r rVarI7 = e2.i(oVar4, 67, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                            Object objQ25 = sVar10.Q();
                            if (objQ25 == gVar2) {
                                objQ25 = new m(21, b1Var);
                                sVar10.o0(objQ25);
                            }
                            i45 = 67;
                            q1.c(R.drawable.me_settings_voice_pack, strE19, str, d0.n.o(rVarI7, false, null, (fz.a) objQ25, 15), sVar10, 0);
                        } else {
                            i45 = 67;
                            sVar10.d0(902198711);
                        }
                        sVar10.p(false);
                        int i50 = i12;
                        if (i50 != -1) {
                            sVar10.d0(920944101);
                            String strM4 = q1.m(sVar10, i11);
                            String str2 = strArr10[i50];
                            z1.r rVarI8 = e2.i(oVar4, i45, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                            Object objQ26 = sVar10.Q();
                            if (objQ26 == gVar2) {
                                objQ26 = new m(22, b1Var5);
                                sVar10.o0(objQ26);
                            }
                            q1.c(R.drawable.me_settings_script_style, strM4, str2, d0.n.o(rVarI8, false, null, (fz.a) objQ26, 15), sVar10, 0);
                        } else {
                            sVar10.d0(902198711);
                        }
                        sVar10.p(false);
                        int i51 = i13;
                        if (i51 != -1) {
                            sVar10.d0(921418246);
                            if (ry.l.D(new Integer[]{11, 0}, Integer.valueOf(((Number) sVar10.j(ju.f.f37370d)).intValue()))) {
                                i47 = 921555917;
                                i48 = R.string.character_system;
                            } else {
                                i47 = 921666928;
                                i48 = R.string.romaji_system;
                            }
                            String strM5 = ep.a.m(sVar10, i47, i48, sVar10, false);
                            String str3 = strArr11[i51];
                            z1.r rVarI9 = e2.i(oVar4, 67, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                            Object objQ27 = sVar10.Q();
                            if (objQ27 == gVar2) {
                                objQ27 = new m(23, b1Var6);
                                sVar10.o0(objQ27);
                            }
                            q1.c(R.drawable.me_settings_romaji_system, strM5, str3, d0.n.o(rVarI9, false, null, (fz.a) objQ27, 15), sVar10, 0);
                        } else {
                            sVar10.d0(902198711);
                        }
                        sVar10.p(false);
                        if (z21) {
                            sVar10.d0(922120706);
                            k7.g(j0.c.C(oVar4, f12, CropImageView.DEFAULT_ASPECT_RATIO, 2), CropImageView.DEFAULT_ASPECT_RATIO, 0L, sVar10, 6, 6);
                            q1.h(48, ub.a.e0(sVar10, R.string.ai_features), sVar10, j0.c.E(j0.c.C(oVar4, f12, CropImageView.DEFAULT_ASPECT_RATIO, 2), CropImageView.DEFAULT_ASPECT_RATIO, f12, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13));
                            String strE110 = ub.a.e0(sVar10, R.string.accept_alternative_answers);
                            z1.r rVarI10 = e2.i(oVar4, f11, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                            fz.c cVar5 = updateAllowAlternativeAnswers;
                            boolean zF6 = sVar10.f(cVar5);
                            Object objQ28 = sVar10.Q();
                            if (zF6 || objQ28 == gVar2) {
                                f12 = f12;
                                objQ28 = new n1(cVar5, 3);
                                sVar10.o0(objQ28);
                            }
                            i46 = 48;
                            q1.j(R.drawable.me_settings_ai_alternative_answers, strE110, z19, rVarI10, null, (fz.c) objQ28, sVar10, 3072);
                            String strE111 = ub.a.e0(sVar10, R.string.mistake_explanation);
                            z1.r rVarI11 = e2.i(oVar4, f11, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                            fz.c cVar6 = updateShowMistakeExplain;
                            boolean zF7 = sVar10.f(cVar6);
                            Object objQ29 = sVar10.Q();
                            if (zF7 || objQ29 == gVar2) {
                                objQ29 = new uu.b(cVar6, 25);
                                sVar10.o0(objQ29);
                            }
                            q1.j(R.drawable.me_settings_ai_mistake_explain, strE111, z20, rVarI11, null, (fz.c) objQ29, sVar10, 3072);
                            sVar10 = sVar10;
                        } else {
                            i46 = 48;
                            sVar10.d0(902198711);
                        }
                        sVar10.p(false);
                        k7.g(j0.c.C(oVar4, f12, CropImageView.DEFAULT_ASPECT_RATIO, 2), CropImageView.DEFAULT_ASPECT_RATIO, 0L, sVar10, 6, 6);
                        float f13 = f12;
                        q1.h(i46, ub.a.e0(sVar10, R.string.others), sVar10, j0.c.E(j0.c.C(oVar4, f12, CropImageView.DEFAULT_ASPECT_RATIO, 2), CropImageView.DEFAULT_ASPECT_RATIO, f13, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13));
                        String strE112 = ub.a.e0(sVar10, R.string.streak_notification);
                        z1.r rVarI12 = e2.i(oVar4, f11, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                        fz.c cVar7 = updateStreakEnable;
                        boolean zF8 = sVar10.f(cVar7);
                        Object objQ30 = sVar10.Q();
                        if (zF8 || objQ30 == gVar2) {
                            objQ30 = new uu.b(cVar7, 26);
                            sVar10.o0(objQ30);
                        }
                        l1.s sVar11 = sVar10;
                        q1.j(R.drawable.me_settings_streak_notification, strE112, z17, rVarI12, null, (fz.c) objQ30, sVar11, 3072);
                        String strE113 = ub.a.e0(sVar11, R.string.ranking);
                        z1.r rVarI13 = e2.i(oVar4, f11, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                        fz.c cVar8 = updateRankingEnable;
                        boolean zF9 = sVar11.f(cVar8);
                        Object objQ31 = sVar11.Q();
                        if (zF9 || objQ31 == gVar2) {
                            objQ31 = new uu.b(cVar8, 27);
                            sVar11.o0(objQ31);
                        }
                        q1.j(R.drawable.me_settings_ranking, strE113, z16, rVarI13, null, (fz.c) objQ31, sVar11, 3072);
                        String strE114 = ub.a.e0(sVar11, R.string.hide_my_profile);
                        z1.r rVarI14 = e2.i(oVar4, f11, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                        fz.c cVar9 = updateHideProfile;
                        boolean zF10 = sVar11.f(cVar9);
                        Object objQ32 = sVar11.Q();
                        if (zF10 || objQ32 == gVar2) {
                            objQ32 = new uu.b(cVar9, 28);
                            sVar11.o0(objQ32);
                        }
                        q1.j(R.drawable.me_settings_hide_profile, strE114, z18, rVarI14, null, (fz.c) objQ32, sVar11, 3072);
                        String strE115 = ub.a.e0(sVar11, R.string.reminders);
                        z1.r rVarI15 = e2.i(oVar4, f11, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                        fz.a aVar19 = navigationToReminder;
                        boolean zF11 = sVar11.f(aVar19);
                        Object objQ33 = sVar11.Q();
                        if (zF11 || objQ33 == gVar2) {
                            objQ33 = new wo.c(21, aVar19);
                            sVar11.o0(objQ33);
                        }
                        q1.d(R.drawable.me_settings_reminder, strE115, true, d0.n.o(rVarI15, false, null, (fz.a) objQ33, 15), sVar11, 384);
                        sVar11.d0(902198711);
                        sVar11.p(false);
                        String strE116 = ub.a.e0(sVar11, R.string.theme);
                        String str4 = strArrC0[i15];
                        float f14 = 67;
                        z1.r rVarI16 = e2.i(oVar4, f14, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                        Object objQ34 = sVar11.Q();
                        if (objQ34 == gVar2) {
                            objQ34 = new m(18, b1Var2);
                            sVar11.o0(objQ34);
                        }
                        q1.c(R.drawable.me_settings_theme, strE116, str4, d0.n.o(rVarI16, false, null, (fz.a) objQ34, 15), sVar11, 0);
                        String strE117 = ub.a.e0(sVar11, R.string.offline_learning);
                        z1.r rVarI17 = e2.i(oVar4, f11, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                        fz.a aVar110 = aVar;
                        boolean zF12 = sVar11.f(aVar110);
                        Object objQ35 = sVar11.Q();
                        if (zF12 || objQ35 == gVar2) {
                            objQ35 = new wo.c(22, aVar110);
                            sVar11.o0(objQ35);
                        }
                        q1.d(R.drawable.backup_download_offline_learning, strE117, true, d0.n.o(rVarI17, false, null, (fz.a) objQ35, 15), sVar11, 384);
                        String strE20 = ub.a.e0(sVar11, R.string.clear_cache_data);
                        z1.r rVarI18 = e2.i(oVar4, f11, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                        Object objQ36 = sVar11.Q();
                        if (objQ36 == gVar2) {
                            objQ36 = new m(19, b1Var3);
                            sVar11.o0(objQ36);
                        }
                        q1.d(R.drawable.me_settings_clear_cache, strE20, false, iu.k.q(24582, 7, (fz.a) objQ36, sVar11, rVarI18, false), sVar11, 384);
                        String strE21 = ub.a.e0(sVar11, R.string.app_language_courses);
                        z1.r rVarI19 = e2.i(oVar4, f14, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                        fz.a aVar111 = onClickLanguageLearning;
                        boolean zF13 = sVar11.f(aVar111);
                        Object objQ37 = sVar11.Q();
                        if (zF13 || objQ37 == gVar2) {
                            objQ37 = new wo.c(23, aVar111);
                            sVar11.o0(objQ37);
                        }
                        q1.d(R.drawable.account_language_learning, strE21, false, d0.n.o(rVarI19, false, null, (fz.a) objQ37, 15), sVar11, 384);
                        k7.g(j0.c.C(oVar4, f13, CropImageView.DEFAULT_ASPECT_RATIO, 2), CropImageView.DEFAULT_ASPECT_RATIO, 0L, sVar11, 6, 6);
                        q1.h(i46, ub.a.e0(sVar11, R.string.support), sVar11, j0.c.E(j0.c.C(oVar4, f13, CropImageView.DEFAULT_ASPECT_RATIO, 2), CropImageView.DEFAULT_ASPECT_RATIO, f13, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13));
                        String strE22 = ub.a.e0(sVar11, R.string.faq);
                        z1.r rVarI20 = e2.i(oVar4, f11, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                        fz.a aVar112 = onClickHelpCenter;
                        boolean zF14 = sVar11.f(aVar112);
                        Object objQ38 = sVar11.Q();
                        if (zF14 || objQ38 == gVar2) {
                            objQ38 = new wo.c(24, aVar112);
                            sVar11.o0(objQ38);
                        }
                        q1.d(R.drawable.account_help_center, strE22, true, iu.k.q(6, 7, (fz.a) objQ38, sVar11, rVarI20, false), sVar11, 384);
                        String strE23 = ub.a.e0(sVar11, R.string.contact_us);
                        z1.r rVarI21 = e2.i(oVar4, f11, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                        fz.a aVar113 = onClickContactUs;
                        boolean zF15 = sVar11.f(aVar113);
                        Object objQ39 = sVar11.Q();
                        if (zF15 || objQ39 == gVar2) {
                            objQ39 = new wo.c(25, aVar113);
                            sVar11.o0(objQ39);
                        }
                        q1.d(R.drawable.account_contact_us, strE23, true, iu.k.q(6, 7, (fz.a) objQ39, sVar11, rVarI21, false), sVar11, 384);
                        String strE24 = ub.a.e0(sVar11, R.string.about_lingodeer);
                        z1.r rVarI22 = e2.i(oVar4, f11, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                        fz.a aVar114 = onClickAboutUs;
                        boolean zF16 = sVar11.f(aVar114);
                        Object objQ40 = sVar11.Q();
                        if (zF16 || objQ40 == gVar2) {
                            objQ40 = new wo.c(26, aVar114);
                            sVar11.o0(objQ40);
                        }
                        l1.s sVar12 = sVar11;
                        q1.b(384, strE24, sVar12, iu.k.q(6, 7, (fz.a) objQ40, sVar11, rVarI22, false));
                        if (((Boolean) sVar12.j(ju.f.f37375i)).booleanValue()) {
                            sVar12.d0(928535753);
                            z1.r rVarI23 = e2.i(oVar4, f11, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                            fz.a aVar115 = onClickDebug;
                            boolean zF17 = sVar12.f(aVar115);
                            Object objQ41 = sVar12.Q();
                            if (zF17 || objQ41 == gVar2) {
                                objQ41 = new wo.c(27, aVar115);
                                sVar12.o0(objQ41);
                            }
                            z1.r rVarQ = iu.k.q(6, 7, (fz.a) objQ41, sVar12, rVarI23, false);
                            sVar12 = sVar12;
                            q1.d(R.drawable.account_about_us, "Debug", true, rVarQ, sVar12, 432);
                        } else {
                            sVar12.d0(902198711);
                        }
                        sVar12.p(false);
                    } else {
                        sVar7.W();
                    }
                    return qy.b0.f48488a;
                }
            }, sVar6), sVar6, 196608, 28);
            sVar = sVar6;
            sVar.p(true);
        } else {
            sVar = sVar3;
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new fz.e(z11, i11, i12, i13, z12, i14, membershipType, z13, z14, z15, z16, z17, z18, i15, z19, z20, z21, onClickClose, updateScriptStyle, updateRomajiSystem, updateRedoWeakItems, updateVoicePack, navigationToReminder, navigationToAccount, updateSoundEffect, updateAnimation, updateNativeSpeakerVideos, updateRankingEnable, updateStreakEnable, updateHideProfile, updateThemeMode, updateAllowAlternativeAnswers, updateShowMistakeExplain, onResetCoursePreferences, onClickLanguageLearning, onClickHelpCenter, onClickContactUs, onClickAboutUs, onClickDebug, clearCache, aVar, i16, i17, i18, i19) { // from class: xu.l1
                public final /* synthetic */ boolean H;
                public final /* synthetic */ boolean K;
                public final /* synthetic */ boolean L;
                public final /* synthetic */ boolean M;
                public final /* synthetic */ boolean N;
                public final /* synthetic */ boolean O;
                public final /* synthetic */ int P;
                public final /* synthetic */ boolean Q;
                public final /* synthetic */ boolean R;
                public final /* synthetic */ boolean S;
                public final /* synthetic */ fz.a T;
                public final /* synthetic */ fz.c U;
                public final /* synthetic */ fz.c V;
                public final /* synthetic */ fz.c W;
                public final /* synthetic */ fz.c X;
                public final /* synthetic */ fz.a Y;
                public final /* synthetic */ fz.a Z;

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ boolean f56448a;

                /* JADX INFO: renamed from: a0, reason: collision with root package name */
                public final /* synthetic */ fz.c f56449a0;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ int f56450b;

                /* JADX INFO: renamed from: b0, reason: collision with root package name */
                public final /* synthetic */ fz.c f56451b0;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ int f56452c;

                /* JADX INFO: renamed from: c0, reason: collision with root package name */
                public final /* synthetic */ fz.c f56453c0;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ int f56454d;

                /* JADX INFO: renamed from: d0, reason: collision with root package name */
                public final /* synthetic */ fz.c f56455d0;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ boolean f56456e;

                /* JADX INFO: renamed from: e0, reason: collision with root package name */
                public final /* synthetic */ fz.c f56457e0;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ int f56458f;

                /* JADX INFO: renamed from: f0, reason: collision with root package name */
                public final /* synthetic */ fz.c f56459f0;

                /* JADX INFO: renamed from: g0, reason: collision with root package name */
                public final /* synthetic */ fz.c f56460g0;

                /* JADX INFO: renamed from: h0, reason: collision with root package name */
                public final /* synthetic */ fz.c f56461h0;

                /* JADX INFO: renamed from: i0, reason: collision with root package name */
                public final /* synthetic */ fz.c f56462i0;

                /* JADX INFO: renamed from: j0, reason: collision with root package name */
                public final /* synthetic */ fz.a f56463j0;

                /* JADX INFO: renamed from: k0, reason: collision with root package name */
                public final /* synthetic */ fz.a f56464k0;

                /* JADX INFO: renamed from: l0, reason: collision with root package name */
                public final /* synthetic */ fz.a f56465l0;

                /* JADX INFO: renamed from: m0, reason: collision with root package name */
                public final /* synthetic */ fz.a f56466m0;

                /* JADX INFO: renamed from: n0, reason: collision with root package name */
                public final /* synthetic */ fz.a f56467n0;

                /* JADX INFO: renamed from: o0, reason: collision with root package name */
                public final /* synthetic */ fz.a f56468o0;

                /* JADX INFO: renamed from: p0, reason: collision with root package name */
                public final /* synthetic */ fz.a f56469p0;

                /* JADX INFO: renamed from: q0, reason: collision with root package name */
                public final /* synthetic */ fz.a f56470q0;

                /* JADX INFO: renamed from: r0, reason: collision with root package name */
                public final /* synthetic */ int f56471r0;

                /* JADX INFO: renamed from: s0, reason: collision with root package name */
                public final /* synthetic */ int f56472s0;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public final /* synthetic */ String f56473t;

                /* JADX INFO: renamed from: t0, reason: collision with root package name */
                public final /* synthetic */ int f56474t0;

                {
                    this.f56471r0 = i17;
                    this.f56472s0 = i18;
                    this.f56474t0 = i19;
                }

                @Override // fz.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM = l1.t.M(1);
                    int iM2 = l1.t.M(this.f56471r0);
                    int iM3 = l1.t.M(this.f56472s0);
                    int iM4 = l1.t.M(this.f56474t0);
                    q1.g(this.f56448a, this.f56450b, this.f56452c, this.f56454d, this.f56456e, this.f56458f, this.f56473t, this.H, this.K, this.L, this.M, this.N, this.O, this.P, this.Q, this.R, this.S, this.T, this.U, this.V, this.W, this.X, this.Y, this.Z, this.f56449a0, this.f56451b0, this.f56453c0, this.f56455d0, this.f56457e0, this.f56459f0, this.f56460g0, this.f56461h0, this.f56462i0, this.f56463j0, this.f56464k0, this.f56465l0, this.f56466m0, this.f56467n0, this.f56468o0, this.f56469p0, this.f56470q0, (l1.n) obj, iM, iM2, iM3, iM4);
                    return qy.b0.f48488a;
                }
            };
        }
    }

    public static final void h(int i11, String text, l1.n nVar, z1.r modifier) {
        l1.s sVar;
        kotlin.jvm.internal.m.f(text, "text");
        kotlin.jvm.internal.m.f(modifier, "modifier");
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(1140072460);
        int i12 = (sVar2.f(text) ? 4 : 2) | i11;
        if (sVar2.T(i12 & 1, (i12 & 19) != 18)) {
            sVar = sVar2;
            ua.b(text, modifier, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a((j3.y0) sVar2.j(ua.f31167a), ((h1.s1) sVar2.j(h1.v1.f31180a)).f31017a, j3.A(14), n3.s.H, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), sVar, i12 & 126, 0, 65532);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new br.a(text, modifier, i11, 9);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0044  */
    /* JADX WARN: Code duplicated, block: B:24:0x0046  */
    /* JADX WARN: Code duplicated, block: B:27:0x004f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x0051  */
    /* JADX WARN: Code duplicated, block: B:29:0x0054  */
    /* JADX WARN: Code duplicated, block: B:31:0x00be  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:36:? A[RETURN, SYNTHETIC] */
    public static final void i(int i11, int i12, String text, l1.n nVar, z1.r rVar) {
        int i13;
        z1.r rVar2;
        boolean z11;
        l1.s sVar;
        z1.r rVar3;
        l1.x1 x1VarT;
        z1.r rVar4;
        kotlin.jvm.internal.m.f(text, "text");
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(-511638041);
        if ((i11 & 6) == 0) {
            i13 = i11 | (sVar2.f(text) ? 4 : 2);
        } else {
            i13 = i11;
        }
        int i14 = i12 & 2;
        if (i14 == 0) {
            if ((i11 & 48) == 0) {
                rVar2 = rVar;
                i13 |= sVar2.f(rVar2) ? 32 : 16;
            }
            if ((i13 & 19) != 18) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (sVar2.T(i13 & 1, z11)) {
                if (i14 != 0) {
                    rVar4 = z1.o.f58481a;
                } else {
                    rVar4 = rVar2;
                }
                sVar = sVar2;
                ua.b(text, d2.h.a(rVar4, 0.8f), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a((j3.y0) sVar2.j(ua.f31167a), ((h1.s1) sVar2.j(h1.v1.f31180a)).f31036s, j3.A(12), n3.s.f43178t, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), sVar, i13 & 14, 0, 65532);
                rVar3 = rVar4;
            } else {
                sVar = sVar2;
                sVar.W();
                rVar3 = rVar2;
            }
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new bt.z(text, rVar3, i11, i12, 7);
            }
        }
        i13 |= 48;
        rVar2 = rVar;
        if ((i13 & 19) != 18) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (sVar2.T(i13 & 1, z11)) {
            if (i14 != 0) {
                rVar4 = z1.o.f58481a;
            } else {
                rVar4 = rVar2;
            }
            sVar = sVar2;
            ua.b(text, d2.h.a(rVar4, 0.8f), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a((j3.y0) sVar2.j(ua.f31167a), ((h1.s1) sVar2.j(h1.v1.f31180a)).f31036s, j3.A(12), n3.s.f43178t, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), sVar, i13 & 14, 0, 65532);
            rVar3 = rVar4;
        } else {
            sVar = sVar2;
            sVar.W();
            rVar3 = rVar2;
        }
        x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new bt.z(text, rVar3, i11, i12, 7);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v9 */
    public static final void j(int i11, String title, boolean z11, z1.r rVar, String str, fz.c onCheckChange, l1.n nVar, int i12) {
        String str2;
        String str3;
        l1.s sVar;
        y2.h hVar;
        y2.h hVar2;
        boolean z12;
        y2.h hVar3;
        fz.a aVar;
        l1.s sVar2;
        l1.s sVar3;
        ?? r9;
        kotlin.jvm.internal.m.f(title, "title");
        kotlin.jvm.internal.m.f(onCheckChange, "onCheckChange");
        l1.s sVar4 = (l1.s) nVar;
        sVar4.f0(-1649193762);
        int i13 = i12 | (sVar4.d(i11) ? 4 : 2) | (sVar4.f(title) ? 32 : 16) | (sVar4.g(z11) ? 256 : 128) | 24576 | (sVar4.h(onCheckChange) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536);
        if (sVar4.T(i13 & 1, (74899 & i13) != 74898)) {
            j0.a2 a2VarA = j0.z1.a(j0.i.f35303a, z1.c.M, sVar4, 48);
            int iHashCode = Long.hashCode(sVar4.T);
            l1.q1 q1VarL = sVar4.l();
            z1.r rVarC = z1.a.c(sVar4, rVar);
            y2.k.J.getClass();
            fz.a aVar2 = y2.j.f56913b;
            sVar4.h0();
            if (sVar4.S) {
                sVar4.k(aVar2);
            } else {
                sVar4.r0();
            }
            y2.h hVar4 = y2.j.f56917f;
            l1.t.J(hVar4, a2VarA, sVar4);
            y2.h hVar5 = y2.j.f56916e;
            l1.t.J(hVar5, q1VarL, sVar4);
            y2.h hVar6 = y2.j.f56918g;
            if (sVar4.S || !kotlin.jvm.internal.m.a(sVar4.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar4, iHashCode, hVar6);
            }
            y2.h hVar7 = y2.j.f56915d;
            l1.t.J(hVar7, rVarC, sVar4);
            z1.o oVar = z1.o.f58481a;
            if (i11 == 0) {
                sVar4.d0(1369532106);
                float f5 = 20;
                j0.c.g(sVar4, e2.n(j0.c.E(oVar, f5, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14), f5));
                sVar4.p(false);
                i13 = i13;
                hVar = hVar5;
                sVar3 = sVar4;
                hVar2 = hVar4;
                r9 = 0;
                hVar3 = hVar6;
                aVar = aVar2;
            } else {
                if (i11 != -1) {
                    sVar4.d0(1369713487);
                    l1.s sVar5 = sVar4;
                    hVar = hVar5;
                    hVar2 = hVar4;
                    aVar = aVar2;
                    hVar3 = hVar6;
                    z12 = false;
                    d0.n.c(se.k.y(i11, sVar4, i13 & 14), null, e2.n(j0.c.E(oVar, 16, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14), 20), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar5, 432, 120);
                    sVar2 = sVar5;
                } else {
                    hVar = hVar5;
                    l1.s sVar6 = sVar4;
                    hVar2 = hVar4;
                    z12 = false;
                    hVar3 = hVar6;
                    aVar = aVar2;
                    sVar6.d0(1339438856);
                    sVar2 = sVar6;
                }
                sVar2.p(z12);
                r9 = z12;
                sVar3 = sVar2;
            }
            z1.r rVarE = j0.c.E(oVar, 14, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14);
            if (1.0f <= 0.0d) {
                k0.a.a("invalid weight; must be greater than zero");
            }
            z1.r rVarP = w4.c.p(1.0f, true, rVarE);
            j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, sVar3, r9);
            int iHashCode2 = Long.hashCode(sVar3.T);
            l1.q1 q1VarL2 = sVar3.l();
            z1.r rVarC2 = z1.a.c(sVar3, rVarP);
            sVar3.h0();
            if (sVar3.S) {
                sVar3.k(aVar);
            } else {
                sVar3.r0();
            }
            l1.t.J(hVar2, uVarA, sVar3);
            l1.t.J(hVar, q1VarL2, sVar3);
            if (sVar3.S || !kotlin.jvm.internal.m.a(sVar3.Q(), Integer.valueOf(iHashCode2))) {
                defpackage.e.A(iHashCode2, sVar3, iHashCode2, hVar3);
            }
            l1.t.J(hVar7, rVarC2, sVar3);
            str2 = title;
            k((i13 >> 3) & 14, 2, str2, sVar3, null);
            if (BuildConfig.VERSION_NAME.length() > 0) {
                sVar3.d0(1263363672);
                i(6, 2, BuildConfig.VERSION_NAME, sVar3, null);
            } else {
                sVar3.d0(1232622398);
            }
            sVar3.p(r9);
            sVar3.p(true);
            r9.a(z11, onCheckChange, j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 16, CropImageView.DEFAULT_ASPECT_RATIO, 11), false, null, sVar3, ((i13 >> 6) & 14) | 384 | ((i13 >> 12) & 112), 120);
            sVar3.p(true);
            str3 = BuildConfig.VERSION_NAME;
            sVar = sVar3;
        } else {
            str2 = title;
            l1.s sVar7 = sVar4;
            sVar7.W();
            str3 = str;
            sVar = sVar7;
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new at.q(i11, str2, z11, rVar, str3, onCheckChange, i12);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0045  */
    /* JADX WARN: Code duplicated, block: B:24:0x0047  */
    /* JADX WARN: Code duplicated, block: B:27:0x0050 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x0052  */
    /* JADX WARN: Code duplicated, block: B:29:0x0055  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:36:? A[RETURN, SYNTHETIC] */
    public static final void k(int i11, int i12, String text, l1.n nVar, z1.r rVar) {
        int i13;
        z1.r rVar2;
        boolean z11;
        l1.s sVar;
        z1.r rVar3;
        l1.x1 x1VarT;
        z1.r rVar4;
        kotlin.jvm.internal.m.f(text, "text");
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(-1757207687);
        if ((i11 & 6) == 0) {
            i13 = i11 | (sVar2.f(text) ? 4 : 2);
        } else {
            i13 = i11;
        }
        int i14 = i12 & 2;
        if (i14 == 0) {
            if ((i11 & 48) == 0) {
                rVar2 = rVar;
                i13 |= sVar2.f(rVar2) ? 32 : 16;
            }
            if ((i13 & 19) != 18) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (sVar2.T(i13 & 1, z11)) {
                if (i14 != 0) {
                    rVar4 = z1.o.f58481a;
                } else {
                    rVar4 = rVar2;
                }
                sVar = sVar2;
                z1.r rVar5 = rVar4;
                ua.b(text, rVar5, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a((j3.y0) sVar2.j(ua.f31167a), ((h1.s1) sVar2.j(h1.v1.f31180a)).f31032o, j3.A(16), n3.s.H, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), sVar, i13 & 126, 0, 65532);
                rVar3 = rVar5;
            } else {
                sVar = sVar2;
                sVar.W();
                rVar3 = rVar2;
            }
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new bt.z(text, rVar3, i11, i12, 6);
            }
        }
        i13 |= 48;
        rVar2 = rVar;
        if ((i13 & 19) != 18) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (sVar2.T(i13 & 1, z11)) {
            if (i14 != 0) {
                rVar4 = z1.o.f58481a;
            } else {
                rVar4 = rVar2;
            }
            sVar = sVar2;
            z1.r rVar6 = rVar4;
            ua.b(text, rVar6, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a((j3.y0) sVar2.j(ua.f31167a), ((h1.s1) sVar2.j(h1.v1.f31180a)).f31032o, j3.A(16), n3.s.H, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), sVar, i13 & 126, 0, 65532);
            rVar3 = rVar6;
        } else {
            sVar = sVar2;
            sVar.W();
            rVar3 = rVar2;
        }
        x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new bt.z(text, rVar3, i11, i12, 6);
        }
    }

    public static final void l(String dialogTitle, String dialogText, fz.a onDismissRequest, fz.a onConfirmation, l1.n nVar, int i11) {
        l1.s sVar;
        kotlin.jvm.internal.m.f(dialogTitle, "dialogTitle");
        kotlin.jvm.internal.m.f(dialogText, "dialogText");
        kotlin.jvm.internal.m.f(onDismissRequest, "onDismissRequest");
        kotlin.jvm.internal.m.f(onConfirmation, "onConfirmation");
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(-2017182785);
        int i12 = i11 | (sVar2.f(dialogTitle) ? 4 : 2) | (sVar2.f(dialogText) ? 32 : 16) | (sVar2.h(onConfirmation) ? 2048 : 1024);
        if (sVar2.T(i12 & 1, (i12 & 1171) != 1170)) {
            sVar = sVar2;
            k7.a(onDismissRequest, t1.e.d(-963344889, new nv.y(19, onConfirmation), sVar2), null, t1.e.d(-599878391, new nv.y(20, onDismissRequest), sVar2), t1.e.d(-236411893, new m1(dialogTitle, 0), sVar2), t1.e.d(-54678644, new m1(dialogText, 1), sVar2), null, 0L, 0L, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar, 1772598, 16276);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new pr.t(dialogTitle, dialogText, onDismissRequest, onConfirmation, i11);
        }
    }

    public static final String m(l1.n nVar, int i11) {
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 51 || i11 == 55) {
                        l1.s sVar = (l1.s) nVar;
                        return ep.a.m(sVar, -1986145568, R.string.ara_display, sVar, false);
                    }
                    if (i11 == 57) {
                        l1.s sVar2 = (l1.s) nVar;
                        return ep.a.m(sVar2, -1986143039, R.string.thai_display, sVar2, false);
                    }
                    if (i11 == 61) {
                        l1.s sVar3 = (l1.s) nVar;
                        return ep.a.m(sVar3, -1986140446, R.string.hindi_display, sVar3, false);
                    }
                    if (i11 == 65) {
                        l1.s sVar4 = (l1.s) nVar;
                        return ep.a.m(sVar4, -1986137886, R.string.greek_display, sVar4, false);
                    }
                    switch (i11) {
                        case 11:
                            break;
                        case 12:
                            break;
                        case 13:
                            break;
                        default:
                            l1.s sVar5 = (l1.s) nVar;
                            sVar5.d0(-1440662541);
                            sVar5.p(false);
                            return BuildConfig.VERSION_NAME;
                    }
                }
                l1.s sVar6 = (l1.s) nVar;
                return ep.a.m(sVar6, -1986148605, R.string.korean_display, sVar6, false);
            }
            l1.s sVar7 = (l1.s) nVar;
            return ep.a.m(sVar7, -1986151707, R.string.japanese_display, sVar7, false);
        }
        l1.s sVar8 = (l1.s) nVar;
        return ep.a.m(sVar8, -1986154780, R.string.chinese_display, sVar8, false);
    }
}
