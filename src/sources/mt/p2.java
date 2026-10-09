package mt;

import aj.uZCn.evRpcb;
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
import h1.bc;
import h1.dc;
import h1.e8;
import h1.fc;
import h1.i7;
import h1.k7;
import h1.ua;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import rt.r8;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class p2 {
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
    public static final void a(boolean z11, fz.a onBackClick, fz.c loginNow, fz.a onOpenNotificationClick, fz.c onClickBilling, String str, rt.j2 j2Var, l1.n nVar, int i11) {
        rt.j2 j2Var2;
        rt.j2 j2Var3;
        boolean z12;
        kotlin.jvm.internal.m.f(onBackClick, "onBackClick");
        kotlin.jvm.internal.m.f(loginNow, "loginNow");
        kotlin.jvm.internal.m.f(onOpenNotificationClick, "onOpenNotificationClick");
        kotlin.jvm.internal.m.f(onClickBilling, "onClickBilling");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1504337851);
        int i12 = i11 | (sVar.g(z11) ? 4 : 2) | (sVar.h(onBackClick) ? 32 : 16) | (sVar.h(loginNow) ? 256 : 128) | (sVar.h(onOpenNotificationClick) ? 2048 : 1024) | (sVar.h(onClickBilling) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE) | (sVar.f(str) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536) | 524288;
        if (sVar.T(i12 & 1, (599187 & i12) != 599186)) {
            sVar.Y();
            if ((i11 & 1) == 0 || sVar.C()) {
                sVar.d0(-1614864554);
                ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(sVar, LocalViewModelStoreOwner.$stable);
                if (current == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                ViewModel viewModelA = i20.b.a(kotlin.jvm.internal.z.a(rt.j2.class), current.getViewModelStore(), null, i20.a.a(current), null, q10.b.a(sVar), null);
                sVar.p(false);
                j2Var3 = (rt.j2) viewModelA;
            } else {
                sVar.W();
                j2Var3 = j2Var;
            }
            sVar.q();
            j9.v vVarH = cf.x.H(new j9.c0[0], sVar);
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (objQ == gVar) {
                objQ = l1.t.q(sVar);
                sVar.o0(objQ);
            }
            rz.b0 b0Var = (rz.b0) objQ;
            l1.b3 b3VarCollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(j2Var3.S, (LifecycleOwner) null, (Lifecycle.State) null, (vy.i) null, sVar, 0, 7);
            Object objQ2 = sVar.Q();
            if (objQ2 == gVar) {
                objQ2 = l1.t.B(r8.COMPREHENSIVE);
                sVar.o0(objQ2);
            }
            l1.b1 b1Var = (l1.b1) objQ2;
            Object objQ3 = sVar.Q();
            if (objQ3 == gVar) {
                objQ3 = l1.t.B(Boolean.FALSE);
                sVar.o0(objQ3);
            }
            l1.b1 b1Var2 = (l1.b1) objQ3;
            Boolean bool = (Boolean) b3VarCollectAsStateWithLifecycle.getValue();
            bool.getClass();
            Boolean bool2 = (Boolean) b1Var2.getValue();
            bool2.getClass();
            boolean zF = sVar.f(b3VarCollectAsStateWithLifecycle);
            rt.j2 j2Var4 = j2Var3;
            Object objQ4 = sVar.Q();
            vy.d dVar = null;
            if (zF || objQ4 == gVar) {
                objQ4 = new bt.v4(b3VarCollectAsStateWithLifecycle, b1Var2, dVar, 1);
                sVar.o0(objQ4);
            }
            l1.t.g(bool, bool2, (fz.e) objQ4, sVar);
            if (((Boolean) b1Var2.getValue()).booleanValue()) {
                sVar.d0(2041095265);
                Object objQ5 = sVar.Q();
                if (objQ5 == gVar) {
                    objQ5 = new w1(4, b1Var2);
                    sVar.o0(objQ5);
                }
                h1.a6.a((fz.a) objQ5, null, h1.a6.f(6, 2, null, sVar), CropImageView.DEFAULT_ASPECT_RATIO, null, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, 0L, null, null, null, t1.e.d(-2104631869, new u1(onClickBilling, b1Var2, 1), sVar), sVar, 6, 384, 4090);
                sVar = sVar;
                z12 = false;
            } else {
                z12 = false;
                sVar.d0(2033356487);
            }
            sVar.p(z12);
            l1.t.a(ys.e.f57981a.a(onClickBilling), t1.e.d(-1786629381, new bt.f4(vVarH, str, j2Var4, z11, onBackClick, b0Var, onOpenNotificationClick, onClickBilling, loginNow, b1Var, b1Var2), sVar), sVar, 56);
            j2Var2 = j2Var4;
        } else {
            sVar.W();
            j2Var2 = j2Var;
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new es.g(z11, onBackClick, loginNow, onOpenNotificationClick, onClickBilling, str, j2Var2, i11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v20, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v34 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v32 */
    public static final void b(final int i11, final int i12, final List list, final boolean z11, final boolean z12, final boolean z13, final boolean z14, final int i13, final boolean z15, final int i14, final boolean z16, final q2 currentFlashCardPracticeMode, final fz.a onBackClick, final fz.c onStartPracticeMode, final fz.a onCustomizeReviewClick, final fz.a onOpenNotificationClick, final fz.c updatePracticeCount, final fz.c updateShuffleNewReviews, final fz.c cVar, final fz.c updateCurrentFlashCardPracticeMode, final fz.a onClickExplain, final fz.a onClickFutureReview, final fz.a onLockedPracticeModeClick, l1.n nVar, final int i15, final int i16, final int i17) {
        int i18;
        int i19;
        int i21;
        l1.s sVar;
        boolean z17;
        l1.b1 b1Var;
        l1.s sVar2;
        Boolean bool;
        int i22;
        int i23;
        q2 q2Var;
        l1.b1 b1Var2;
        Object obj;
        ?? r9;
        l1.s sVar3;
        ?? r11;
        long jC;
        float f5;
        boolean z18;
        long jC2;
        boolean z19;
        kotlin.jvm.internal.m.f(currentFlashCardPracticeMode, "currentFlashCardPracticeMode");
        kotlin.jvm.internal.m.f(onBackClick, "onBackClick");
        kotlin.jvm.internal.m.f(onStartPracticeMode, "onStartPracticeMode");
        kotlin.jvm.internal.m.f(onCustomizeReviewClick, "onCustomizeReviewClick");
        kotlin.jvm.internal.m.f(onOpenNotificationClick, "onOpenNotificationClick");
        kotlin.jvm.internal.m.f(updatePracticeCount, "updatePracticeCount");
        kotlin.jvm.internal.m.f(updateShuffleNewReviews, "updateShuffleNewReviews");
        kotlin.jvm.internal.m.f(cVar, evRpcb.PonTGGbuWI);
        kotlin.jvm.internal.m.f(updateCurrentFlashCardPracticeMode, "updateCurrentFlashCardPracticeMode");
        kotlin.jvm.internal.m.f(onClickExplain, "onClickExplain");
        kotlin.jvm.internal.m.f(onClickFutureReview, "onClickFutureReview");
        kotlin.jvm.internal.m.f(onLockedPracticeModeClick, "onLockedPracticeModeClick");
        l1.s sVar4 = (l1.s) nVar;
        sVar4.f0(-74018662);
        if ((i15 & 6) == 0) {
            i18 = i15 | (sVar4.d(i11) ? 4 : 2);
        } else {
            i18 = i15;
        }
        if ((i15 & 48) == 0) {
            i18 |= sVar4.d(i12) ? 32 : 16;
        }
        int i24 = i18 | (sVar4.h(list) ? 256 : 128);
        if ((i15 & 3072) == 0) {
            i24 |= sVar4.g(z11) ? 2048 : 1024;
        }
        int i25 = i15 & 24576;
        int i26 = OSSConstants.DEFAULT_BUFFER_SIZE;
        if (i25 == 0) {
            i24 |= sVar4.g(z12) ? 16384 : 8192;
        }
        if ((i15 & 196608) == 0) {
            i24 |= sVar4.g(z13) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536;
        }
        if ((i15 & 1572864) == 0) {
            i24 |= sVar4.g(z14) ? 1048576 : 524288;
        }
        if ((i15 & 12582912) == 0) {
            i24 |= sVar4.d(i13) ? 8388608 : 4194304;
        }
        if ((i15 & 100663296) == 0) {
            i24 |= sVar4.g(z15) ? 67108864 : 33554432;
        }
        if ((i15 & 805306368) == 0) {
            i24 |= sVar4.d(i14) ? 536870912 : 268435456;
        }
        int i27 = i24;
        if ((i16 & 6) == 0) {
            i19 = i16 | (sVar4.g(z16) ? 4 : 2);
        } else {
            i19 = i16;
        }
        if ((i16 & 48) == 0) {
            i19 |= sVar4.d(currentFlashCardPracticeMode.ordinal()) ? 32 : 16;
        }
        if ((i16 & 384) == 0) {
            i19 |= sVar4.h(onBackClick) ? 256 : 128;
        }
        if ((i16 & 3072) == 0) {
            i19 |= sVar4.h(onStartPracticeMode) ? 2048 : 1024;
        }
        if ((i16 & 24576) == 0) {
            if (sVar4.h(onCustomizeReviewClick)) {
                i26 = 16384;
            }
            i19 |= i26;
        }
        if ((i16 & 196608) == 0) {
            i19 |= sVar4.h(onOpenNotificationClick) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536;
        }
        if ((i16 & 1572864) == 0) {
            i19 |= sVar4.h(updatePracticeCount) ? 1048576 : 524288;
        }
        if ((i16 & 12582912) == 0) {
            i19 |= sVar4.h(updateShuffleNewReviews) ? 8388608 : 4194304;
        }
        if ((i16 & 100663296) == 0) {
            i19 |= sVar4.h(cVar) ? 67108864 : 33554432;
        }
        if ((i16 & 805306368) == 0) {
            i19 |= sVar4.h(updateCurrentFlashCardPracticeMode) ? 536870912 : 268435456;
        }
        int i28 = i19;
        if ((i17 & 6) == 0) {
            i21 = i17 | (sVar4.h(onClickExplain) ? 4 : 2);
        } else {
            i21 = i17;
        }
        if ((i17 & 48) == 0) {
            i21 |= sVar4.h(onClickFutureReview) ? 32 : 16;
        }
        if (sVar4.T(i27 & 1, ((i27 & 306783379) == 306783378 && (i28 & 306783379) == 306783378 && (i21 & 147) == 146) ? false : true)) {
            final int i29 = i11 + i12;
            Object objQ = sVar4.Q();
            Object obj2 = l1.m.f39353a;
            if (objQ == obj2) {
                objQ = l1.t.B(Boolean.FALSE);
                sVar4.o0(objQ);
            }
            l1.b1 b1Var3 = (l1.b1) objQ;
            if (((Boolean) b1Var3.getValue()).booleanValue()) {
                sVar4.d0(-1770526738);
                Object objQ2 = sVar4.Q();
                if (objQ2 == obj2) {
                    objQ2 = new w1(8, b1Var3);
                    sVar4.o0(objQ2);
                }
                fz.a aVar = (fz.a) objQ2;
                boolean z20 = (i28 & 458752) == 131072;
                Object objQ3 = sVar4.Q();
                if (z20 || objQ3 == obj2) {
                    objQ3 = new fu.e(9, onOpenNotificationClick, b1Var3);
                    sVar4.o0(objQ3);
                }
                g.A(aVar, (fz.a) objQ3, sVar4, 6);
                z17 = false;
            } else {
                z17 = false;
                sVar4.d0(-1795433688);
            }
            sVar4.p(z17);
            Object objQ4 = sVar4.Q();
            if (objQ4 == obj2) {
                objQ4 = l1.t.B(Boolean.FALSE);
                sVar4.o0(objQ4);
            }
            l1.b1 b1Var4 = (l1.b1) objQ4;
            if (((Boolean) b1Var4.getValue()).booleanValue()) {
                sVar4.d0(-1770140044);
                Object objQ5 = sVar4.Q();
                if (objQ5 == obj2) {
                    objQ5 = new q(29, b1Var4);
                    sVar4.o0(objQ5);
                }
                fz.a aVar2 = (fz.a) objQ5;
                boolean z21 = ((i28 & 3670016) == 1048576) | ((i28 & 29360128) == 8388608) | ((i28 & 234881024) == 67108864);
                Object objQ6 = sVar4.Q();
                if (z21 || objQ6 == obj2) {
                    Object jVar = new br.j(updatePracticeCount, updateShuffleNewReviews, cVar, b1Var4, 10);
                    b1Var = b1Var4;
                    sVar4.o0(jVar);
                    objQ6 = jVar;
                } else {
                    b1Var = b1Var4;
                }
                int i30 = i27 >> 21;
                y3.h(i13, z15, i14, z16, aVar2, (fz.f) objQ6, sVar4, (i30 & 896) | (i30 & 14) | 24576 | (i30 & 112) | ((i28 << 9) & 7168));
                l1.s sVar5 = sVar4;
                sVar5.p(false);
                sVar2 = sVar5;
            } else {
                l1.s sVar6 = sVar4;
                b1Var = b1Var4;
                sVar6.d0(-1795433688);
                sVar6.p(false);
                sVar2 = sVar6;
            }
            Object objQ7 = sVar2.Q();
            if (objQ7 == obj2) {
                objQ7 = l1.t.B(Boolean.FALSE);
                sVar2.o0(objQ7);
            }
            l1.b1 b1Var5 = (l1.b1) objQ7;
            Boolean boolValueOf = Boolean.valueOf(z12);
            boolean z22 = ((i28 & 112) == 32) | ((i27 & 57344) == 16384) | ((i28 & 1879048192) == 536870912);
            Object objQ8 = sVar2.Q();
            vy.d dVar = null;
            if (z22 || objQ8 == obj2) {
                bool = boolValueOf;
                i22 = 2;
                i23 = 6;
                q2Var = currentFlashCardPracticeMode;
                Object l2Var = new l2(z12, q2Var, updateCurrentFlashCardPracticeMode, dVar, 0);
                sVar2.o0(l2Var);
                objQ8 = l2Var;
            } else {
                bool = boolValueOf;
                i22 = 2;
                i23 = 6;
                q2Var = currentFlashCardPracticeMode;
            }
            l1.t.g(bool, q2Var, (fz.e) objQ8, sVar2);
            if (((Boolean) b1Var5.getValue()).booleanValue()) {
                sVar2.d0(-1769143146);
                e8 e8VarF = h1.a6.f(i23, i22, null, sVar2);
                Object objQ9 = sVar2.Q();
                if (objQ9 == obj2) {
                    z19 = false;
                    objQ9 = new w1(0, b1Var5);
                    sVar2.o0(objQ9);
                } else {
                    z19 = false;
                }
                l1.s sVar7 = sVar2;
                b1Var2 = b1Var5;
                r9 = z19;
                obj = obj2;
                h1.a6.a((fz.a) objQ9, null, e8VarF, CropImageView.DEFAULT_ASPECT_RATIO, null, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, 0L, null, null, null, t1.e.d(1664583434, new jr.h(z12, q2Var, updateCurrentFlashCardPracticeMode, onLockedPracticeModeClick, onStartPracticeMode, b1Var5), sVar2), sVar7, 6, 384, 4090);
                sVar3 = sVar7;
            } else {
                b1Var2 = b1Var5;
                obj = obj2;
                r9 = 0;
                sVar2.d0(-1795433688);
                sVar3 = sVar2;
            }
            sVar3.p(r9);
            z1.o oVar = z1.o.f58481a;
            z1.r rVarV = j0.c.v(j0.e2.d(oVar, 1.0f));
            j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, sVar3, r9);
            int iHashCode = Long.hashCode(sVar3.T);
            l1.q1 q1VarL = sVar3.l();
            z1.r rVarC = z1.a.c(sVar3, rVarV);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar3.h0();
            if (sVar3.S) {
                sVar3.k(iVar);
            } else {
                sVar3.r0();
            }
            y2.h hVar = y2.j.f56917f;
            l1.t.J(hVar, uVarA, sVar3);
            y2.h hVar2 = y2.j.f56916e;
            l1.t.J(hVar2, q1VarL, sVar3);
            y2.h hVar3 = y2.j.f56918g;
            if (sVar3.S || !kotlin.jvm.internal.m.a(sVar3.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar3, iHashCode, hVar3);
            }
            y2.h hVar4 = y2.j.f56915d;
            l1.t.J(hVar4, rVarC, sVar3);
            float f11 = bc.f30055a;
            l1.s sVar8 = sVar3;
            l1.b1 b1Var6 = b1Var2;
            iu.k.g(onBackClick, null, g.f41438k0, null, t1.e.d(224481807, new br.b0(z14, onClickFutureReview, z13, onClickExplain, b1Var, b1Var3, 1), sVar8), null, bc.f(g2.x.f28621h, 0L, sVar8, 30), null, sVar8, ((i28 >> 6) & 14) | 24960, 170);
            j0.c.g(sVar8, j0.e2.g(oVar, 36));
            r0.e eVarD = r0.f.d(i29 > 0 ? 12 : 24);
            if (i29 > 0) {
                sVar8.d0(-446942089);
                jC = ((h1.s1) sVar8.j(h1.v1.f31180a)).f31017a;
                r11 = 0;
            } else {
                r11 = 0;
                sVar8.d0(-446940471);
                jC = g2.x.c(((h1.s1) sVar8.j(h1.v1.f31180a)).f31034q, 0.15f);
            }
            sVar8.p(r11);
            float f12 = 16;
            k7.d(j0.e2.e(j0.e2.g(j0.c.A(oVar, f12), 260), 1.0f), eVarD, k7.p(jC, sVar8, r11), null, null, t1.e.d(-1629130110, new fz.f() { // from class: mt.x1
                @Override // fz.f
                public final Object invoke(Object obj3, Object obj4, Object obj5) {
                    long jC3;
                    y2.h hVar5;
                    int i31;
                    y2.h hVar6;
                    y2.i iVar2;
                    y2.h hVar7;
                    j0.d dVar2;
                    long j11;
                    l1.s sVar9;
                    y2.i iVar3;
                    y2.h hVar8;
                    boolean z23;
                    j0.v Card = (j0.v) obj3;
                    l1.n nVar2 = (l1.n) obj4;
                    int iIntValue = ((Integer) obj5).intValue();
                    kotlin.jvm.internal.m.f(Card, "$this$Card");
                    l1.s sVar10 = (l1.s) nVar2;
                    if (sVar10.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                        z1.h hVar9 = z1.c.P;
                        z1.o oVar2 = z1.o.f58481a;
                        z1.r rVarD = j0.e2.d(oVar2, 1.0f);
                        j0.d dVar3 = j0.i.f35305c;
                        j0.u uVarA2 = j0.t.a(dVar3, hVar9, sVar10, 48);
                        int iHashCode2 = Long.hashCode(sVar10.T);
                        l1.q1 q1VarL2 = sVar10.l();
                        z1.r rVarC2 = z1.a.c(sVar10, rVarD);
                        y2.k.J.getClass();
                        y2.i iVar4 = y2.j.f56913b;
                        sVar10.h0();
                        if (sVar10.S) {
                            sVar10.k(iVar4);
                        } else {
                            sVar10.r0();
                        }
                        y2.h hVar10 = y2.j.f56917f;
                        l1.t.J(hVar10, uVarA2, sVar10);
                        y2.h hVar11 = y2.j.f56916e;
                        l1.t.J(hVar11, q1VarL2, sVar10);
                        y2.h hVar12 = y2.j.f56918g;
                        if (sVar10.S || !kotlin.jvm.internal.m.a(sVar10.Q(), Integer.valueOf(iHashCode2))) {
                            defpackage.e.A(iHashCode2, sVar10, iHashCode2, hVar12);
                        }
                        y2.h hVar13 = y2.j.f56915d;
                        l1.t.J(hVar13, rVarC2, sVar10);
                        int i32 = i29;
                        if (i32 > 0) {
                            sVar10.d0(-108556383);
                            jC3 = ((h1.s1) sVar10.j(h1.v1.f31180a)).f31019b;
                        } else {
                            sVar10.d0(-108554696);
                            jC3 = g2.x.c(((h1.s1) sVar10.j(h1.v1.f31180a)).f31034q, 0.6f);
                        }
                        sVar10.p(false);
                        if (i32 > 0) {
                            sVar10.d0(929894730);
                            j0.c.g(sVar10, j0.v.a(oVar2, 1.2f));
                            long j12 = jC3;
                            i31 = i32;
                            hVar5 = hVar11;
                            hVar6 = hVar12;
                            hVar7 = hVar10;
                            dVar2 = dVar3;
                            iVar2 = iVar4;
                            ua.b(String.valueOf(i32), null, j12, fr.j3.A(72), null, n3.s.N, null, 0L, null, 0L, 0, false, 0, 0, null, sVar10, 199680, 0, 131026);
                            ua.b(ub.a.e0(sVar10, R.string.srs_cards_due_for_review), j0.c.C(oVar2, 32, CropImageView.DEFAULT_ASPECT_RATIO, 2), j12, fr.j3.A(22), null, n3.s.L, null, 0L, new u3.k(3), 0L, 0, false, 0, 0, null, sVar10, 199728, 0, 130512);
                            sVar9 = sVar10;
                            j0.c.g(sVar9, j0.v.a(oVar2, 1.0f));
                            sVar9.p(false);
                            j11 = j12;
                        } else {
                            hVar5 = hVar11;
                            i31 = i32;
                            hVar6 = hVar12;
                            iVar2 = iVar4;
                            hVar7 = hVar10;
                            long j13 = jC3;
                            dVar2 = dVar3;
                            sVar10.d0(930673016);
                            j0.c.g(sVar10, j0.v.a(oVar2, 0.95f));
                            ua.b(ub.a.e0(sVar10, R.string.srs_no_reviews_due_title), j0.c.C(oVar2, 48, CropImageView.DEFAULT_ASPECT_RATIO, 2), j13, fr.j3.A(20), null, n3.s.L, null, 0L, new u3.k(3), fr.j3.A(32), 0, false, 0, 0, null, sVar10, 199728, 6, 129488);
                            j0.c.g(sVar10, j0.e2.g(oVar2, 16));
                            j11 = j13;
                            ua.b(ub.a.e0(sVar10, R.string.srs_no_reviews_due_desc), j0.c.C(oVar2, 40, CropImageView.DEFAULT_ASPECT_RATIO, 2), g2.x.c(j13, 0.55f), fr.j3.A(12), null, n3.s.K, null, 0L, new u3.k(3), fr.j3.A(22), 0, false, 0, 0, null, sVar10, 199728, 6, 129488);
                            sVar9 = sVar10;
                            ep.a.C(oVar2, 28, sVar9, false);
                        }
                        z1.r rVarE = j0.e2.e(oVar2, 1.0f);
                        j0.a2 a2VarA = j0.z1.a(j0.i.f35307e, z1.c.L, sVar9, 6);
                        int iHashCode3 = Long.hashCode(sVar9.T);
                        l1.q1 q1VarL3 = sVar9.l();
                        z1.r rVarC3 = z1.a.c(sVar9, rVarE);
                        sVar9.h0();
                        if (sVar9.S) {
                            iVar3 = iVar2;
                            sVar9.k(iVar3);
                        } else {
                            iVar3 = iVar2;
                            sVar9.r0();
                        }
                        y2.h hVar14 = hVar7;
                        l1.t.J(hVar14, a2VarA, sVar9);
                        y2.h hVar15 = hVar5;
                        l1.t.J(hVar15, q1VarL3, sVar9);
                        if (sVar9.S || !kotlin.jvm.internal.m.a(sVar9.Q(), Integer.valueOf(iHashCode3))) {
                            hVar8 = hVar6;
                            defpackage.e.A(iHashCode3, sVar9, iHashCode3, hVar8);
                        } else {
                            hVar8 = hVar6;
                        }
                        l1.t.J(hVar13, rVarC3, sVar9);
                        if (1.0f <= 0.0d) {
                            k0.a.a("invalid weight; must be greater than zero");
                        }
                        j0.i1 i1Var = new j0.i1(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                        j0.u uVarA3 = j0.t.a(dVar2, hVar9, sVar9, 48);
                        int iHashCode4 = Long.hashCode(sVar9.T);
                        l1.q1 q1VarL4 = sVar9.l();
                        z1.r rVarC4 = z1.a.c(sVar9, i1Var);
                        sVar9.h0();
                        if (sVar9.S) {
                            sVar9.k(iVar3);
                        } else {
                            sVar9.r0();
                        }
                        l1.t.J(hVar14, uVarA3, sVar9);
                        l1.t.J(hVar15, q1VarL4, sVar9);
                        if (sVar9.S || !kotlin.jvm.internal.m.a(sVar9.Q(), Integer.valueOf(iHashCode4))) {
                            defpackage.e.A(iHashCode4, sVar9, iHashCode4, hVar8);
                        }
                        l1.t.J(hVar13, rVarC4, sVar9);
                        String strValueOf = String.valueOf(i11);
                        l1.s sVar11 = sVar9;
                        long jA = fr.j3.A(18);
                        n3.s sVar12 = n3.s.N;
                        y2.h hVar16 = hVar8;
                        y2.i iVar5 = iVar3;
                        long j14 = j11;
                        ua.b(strValueOf, null, j14, jA, null, sVar12, null, 0L, null, 0L, 0, false, 0, 0, null, sVar11, 199680, 0, 131026);
                        String strE0 = ub.a.e0(sVar11, R.string.srs_new);
                        long jA2 = fr.j3.A(16);
                        n3.s sVar13 = n3.s.K;
                        float f13 = 16;
                        ua.b(strE0, j0.c.C(oVar2, f13, CropImageView.DEFAULT_ASPECT_RATIO, 2), j14, jA2, null, sVar13, null, 0L, new u3.k(3), 0L, 0, false, 0, 0, null, sVar11, 199728, 0, 130512);
                        sVar11.p(true);
                        if (i31 > 0) {
                            sVar11.d0(-1551833009);
                            k7.n(j0.e2.g(oVar2, 46), CropImageView.DEFAULT_ASPECT_RATIO, 0L, sVar11, 6, 6);
                            z23 = false;
                        } else {
                            z23 = false;
                            sVar11.d0(-1585262138);
                        }
                        sVar11.p(z23);
                        if (1.0f <= 0.0d) {
                            k0.a.a("invalid weight; must be greater than zero");
                        }
                        j0.i1 i1Var2 = new j0.i1(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                        j0.u uVarA4 = j0.t.a(dVar2, hVar9, sVar11, 48);
                        int iHashCode5 = Long.hashCode(sVar11.T);
                        l1.q1 q1VarL5 = sVar11.l();
                        z1.r rVarC5 = z1.a.c(sVar11, i1Var2);
                        sVar11.h0();
                        if (sVar11.S) {
                            sVar11.k(iVar5);
                        } else {
                            sVar11.r0();
                        }
                        l1.t.J(hVar14, uVarA4, sVar11);
                        l1.t.J(hVar15, q1VarL5, sVar11);
                        if (sVar11.S || !kotlin.jvm.internal.m.a(sVar11.Q(), Integer.valueOf(iHashCode5))) {
                            defpackage.e.A(iHashCode5, sVar11, iHashCode5, hVar16);
                        }
                        l1.t.J(hVar13, rVarC5, sVar11);
                        ua.b(String.valueOf(i12), null, j14, fr.j3.A(18), null, sVar12, null, 0L, null, 0L, 0, false, 0, 0, null, sVar11, 199680, 0, 131026);
                        ua.b(ub.a.e0(sVar11, R.string.srs_studied), j0.c.C(oVar2, f13, CropImageView.DEFAULT_ASPECT_RATIO, 2), j14, fr.j3.A(16), null, sVar13, null, 0L, new u3.k(3), 0L, 0, false, 0, 0, null, sVar11, 199728, 0, 130512);
                        sVar11.p(true);
                        sVar11.p(true);
                        j0.c.g(sVar11, j0.v.a(oVar2, 1.0f));
                        sVar11.p(true);
                    } else {
                        sVar10.W();
                    }
                    return qy.b0.f48488a;
                }
            }, sVar8), sVar8, 196614, 24);
            if (i29 > 0) {
                sVar8.d0(-965640748);
                j0.c.g(sVar8, j0.v.a(oVar, 1.0f));
                sVar8.p(false);
                f5 = f12;
            } else {
                sVar8.d0(-965560396);
                z1.r rVarE = j0.c.E(j0.v.a(oVar, 1.0f), CropImageView.DEFAULT_ASPECT_RATIO, 0, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13);
                w2.q0 q0VarD = j0.o.d(z1.c.f58464b, false);
                int iHashCode2 = Long.hashCode(sVar8.T);
                l1.q1 q1VarL2 = sVar8.l();
                z1.r rVarC2 = z1.a.c(sVar8, rVarE);
                sVar8.h0();
                if (sVar8.S) {
                    sVar8.k(iVar);
                } else {
                    sVar8.r0();
                }
                l1.t.J(hVar, q0VarD, sVar8);
                l1.t.J(hVar2, q1VarL2, sVar8);
                if (sVar8.S || !kotlin.jvm.internal.m.a(sVar8.Q(), Integer.valueOf(iHashCode2))) {
                    defpackage.e.A(iHashCode2, sVar8, iHashCode2, hVar3);
                }
                l1.t.J(hVar4, rVarC2, sVar8);
                f5 = f12;
                y3.f(list, j0.e2.e(j0.c.A(oVar, f5), 1.0f), sVar8, ((i27 >> 6) & 14) | 48);
                sVar8.p(true);
                sVar8.p(false);
            }
            boolean z23 = i29 > 0;
            z1.r rVarC3 = j0.c.C(j0.e2.e(oVar, 1.0f), f5, CropImageView.DEFAULT_ASPECT_RATIO, 2);
            Object objQ10 = sVar8.Q();
            if (objQ10 == obj) {
                objQ10 = new w1(1, b1Var6);
                sVar8.o0(objQ10);
            }
            iu.k.e((fz.a) objQ10, rVarC3, z23, 0L, null, g.f41447p0, sVar8, 196662, 24);
            float f13 = f5;
            z1.r rVarG = j0.e2.g(j0.c.C(j0.e2.e(j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, f13, CropImageView.DEFAULT_ASPECT_RATIO, 32, 5), 1.0f), f13, CropImageView.DEFAULT_ASPECT_RATIO, 2), 46);
            j0.v1 v1VarD = j0.c.d(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 3);
            float f14 = 1;
            if (z11) {
                sVar8.d0(-446746153);
                jC2 = ((h1.s1) sVar8.j(h1.v1.f31180a)).f31017a;
                z18 = false;
            } else {
                z18 = false;
                sVar8.d0(-446744535);
                jC2 = g2.x.c(((h1.s1) sVar8.j(h1.v1.f31180a)).f31034q, 0.12f);
            }
            sVar8.p(z18);
            k7.i(onCustomizeReviewClick, rVarG, z11, null, null, d0.n.a(jC2, f14), v1VarD, g.f41449q0, sVar8, ((i28 >> 12) & 14) | 817889328 | ((i27 >> 3) & 896), 312);
            l1.s sVar9 = sVar8;
            sVar9.p(true);
            sVar = sVar9;
        } else {
            l1.s sVar10 = sVar4;
            sVar10.W();
            sVar = sVar10;
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new fz.e() { // from class: mt.y1
                @Override // fz.e
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    int iM = l1.t.M(i15 | 1);
                    int iM2 = l1.t.M(i16);
                    int iM3 = l1.t.M(i17);
                    p2.b(i11, i12, list, z11, z12, z13, z14, i13, z15, i14, z16, currentFlashCardPracticeMode, onBackClick, onStartPracticeMode, onCustomizeReviewClick, onOpenNotificationClick, updatePracticeCount, updateShuffleNewReviews, cVar, updateCurrentFlashCardPracticeMode, onClickExplain, onClickFutureReview, onLockedPracticeModeClick, (l1.n) obj3, iM, iM2, iM3);
                    return qy.b0.f48488a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0276 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:101:0x0278  */
    /* JADX WARN: Code duplicated, block: B:105:0x0284  */
    /* JADX WARN: Code duplicated, block: B:106:0x0288  */
    /* JADX WARN: Code duplicated, block: B:107:0x028d  */
    /* JADX WARN: Code duplicated, block: B:108:0x0292  */
    /* JADX WARN: Code duplicated, block: B:110:0x0299  */
    /* JADX WARN: Code duplicated, block: B:112:0x02a2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:113:0x02a4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:114:0x02a6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:115:0x02a8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:116:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:119:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:120:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:121:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:122:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:123:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:125:0x02cd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:126:0x02cf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:127:0x02d1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:128:0x02d3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:129:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:132:0x02df  */
    /* JADX WARN: Code duplicated, block: B:133:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:134:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:135:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:142:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:144:0x0302  */
    /* JADX WARN: Code duplicated, block: B:145:0x0305  */
    /* JADX WARN: Code duplicated, block: B:147:0x0309  */
    /* JADX WARN: Code duplicated, block: B:149:0x0326  */
    /* JADX WARN: Code duplicated, block: B:151:0x0338  */
    /* JADX WARN: Code duplicated, block: B:152:0x0364  */
    /* JADX WARN: Code duplicated, block: B:154:0x0379  */
    /* JADX WARN: Code duplicated, block: B:158:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:160:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:161:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:166:0x03fa  */
    /* JADX WARN: Code duplicated, block: B:169:0x0468  */
    /* JADX WARN: Code duplicated, block: B:170:0x046c  */
    /* JADX WARN: Code duplicated, block: B:175:0x0487  */
    /* JADX WARN: Code duplicated, block: B:179:0x0497  */
    /* JADX WARN: Code duplicated, block: B:182:0x04a3  */
    /* JADX WARN: Code duplicated, block: B:184:0x04a6  */
    /* JADX WARN: Code duplicated, block: B:188:0x04e1  */
    /* JADX WARN: Code duplicated, block: B:191:0x04eb  */
    /* JADX WARN: Code duplicated, block: B:192:0x04ee  */
    /* JADX WARN: Code duplicated, block: B:195:0x050f  */
    /* JADX WARN: Code duplicated, block: B:198:0x0575  */
    /* JADX WARN: Code duplicated, block: B:199:0x0577  */
    /* JADX WARN: Code duplicated, block: B:206:0x058f  */
    /* JADX WARN: Code duplicated, block: B:208:0x05d3  */
    /* JADX WARN: Code duplicated, block: B:211:0x05dd  */
    /* JADX WARN: Code duplicated, block: B:214:0x027e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:215:0x02ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:216:0x02d9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:219:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0051  */
    /* JADX WARN: Code duplicated, block: B:25:0x0059  */
    /* JADX WARN: Code duplicated, block: B:26:0x005b  */
    /* JADX WARN: Code duplicated, block: B:28:0x005f  */
    /* JADX WARN: Code duplicated, block: B:31:0x0065  */
    /* JADX WARN: Code duplicated, block: B:33:0x006d  */
    /* JADX WARN: Code duplicated, block: B:34:0x0070  */
    /* JADX WARN: Code duplicated, block: B:36:0x0075  */
    /* JADX WARN: Code duplicated, block: B:39:0x007f  */
    /* JADX WARN: Code duplicated, block: B:40:0x0082  */
    /* JADX WARN: Code duplicated, block: B:43:0x0090  */
    /* JADX WARN: Code duplicated, block: B:44:0x0092  */
    /* JADX WARN: Code duplicated, block: B:47:0x009b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:48:0x009d  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:57:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:58:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:62:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:65:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:66:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:70:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:75:0x0124  */
    /* JADX WARN: Code duplicated, block: B:76:0x0128  */
    /* JADX WARN: Code duplicated, block: B:81:0x0149  */
    /* JADX WARN: Code duplicated, block: B:84:0x0226  */
    /* JADX WARN: Code duplicated, block: B:85:0x022a  */
    /* JADX WARN: Code duplicated, block: B:90:0x0245  */
    /* JADX WARN: Code duplicated, block: B:94:0x025b  */
    /* JADX WARN: Code duplicated, block: B:96:0x026f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:97:0x0271 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:98:0x0273  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v12, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v22 */
    public static final void c(boolean z11, q2 q2Var, boolean z12, final fz.c cVar, final fz.a aVar, fz.c cVar2, l1.n nVar, int i11, int i12) {
        boolean z13;
        int i13;
        int i14;
        boolean z14;
        boolean z15;
        l1.s sVar;
        l1.x1 x1VarT;
        boolean z16;
        q2 q2Var2;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z20;
        Object objQ;
        int i15;
        int iHashCode;
        fz.a aVar2;
        y2.h hVar;
        q2 q2Var3;
        int i16;
        l1.s sVar2;
        float f5;
        z1.o oVar;
        float f11;
        int iHashCode2;
        Iterator it;
        l1.s sVar3;
        q2 q2Var4;
        boolean z21;
        boolean zD;
        Object objQ2;
        final q2 q2Var5;
        int[] iArr;
        int i17;
        int i18;
        int i19;
        final int i21;
        int i22;
        int i23;
        final String strE0;
        final boolean z22;
        q2 q2Var6;
        boolean z23;
        boolean z24;
        boolean z25;
        d0.v vVarX;
        d0.v vVar;
        char c11;
        h1.s1 s1Var;
        h1.t0 t0Var;
        h1.t0 t0VarY;
        l1.s sVar4;
        z1.o oVar2;
        int i24;
        float f12;
        l1.s sVar5;
        int iHashCode3;
        fz.a aVar3;
        y2.h hVar2;
        int iHashCode4;
        float f13;
        float f14;
        int i25;
        int i26;
        int i27;
        fz.c cVar3 = cVar2;
        z1.h hVar3 = z1.c.O;
        l1.s sVar6 = (l1.s) nVar;
        sVar6.f0(1464597828);
        int i28 = (sVar6.g(z11) ? 4 : 2) | i11 | (sVar6.d(q2Var.ordinal()) ? 32 : 16);
        int i29 = i12 & 4;
        if (i29 == 0) {
            if ((i11 & 384) == 0) {
                z13 = z12;
                i28 |= sVar6.g(z13) ? 256 : 128;
            }
            if ((i11 & 3072) != 0) {
                if (sVar6.h(cVar)) {
                    i27 = 2048;
                } else {
                    i27 = 1024;
                }
                i28 |= i27;
            }
            if ((i11 & 24576) != 0) {
                if (sVar6.h(aVar)) {
                    i26 = 16384;
                } else {
                    i26 = OSSConstants.DEFAULT_BUFFER_SIZE;
                }
                i28 |= i26;
            }
            if (sVar6.h(cVar3)) {
                i13 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
            } else {
                i13 = 65536;
            }
            i14 = i28 | i13;
            if ((i14 & 74899) != 74898) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (sVar6.T(i14 & 1, z14)) {
                if (i29 != 0) {
                    z16 = true;
                } else {
                    z16 = z13;
                }
                q2 q2Var7 = q2.FLASHCARD;
                List listL = ns.o.L(q2Var7, q2.COMPREHENSIVE, q2.LISTENING, q2.SPEAKING, q2.SPELLING);
                if (!z11 || q2Var == q2Var7) {
                    q2Var2 = q2Var;
                } else {
                    q2Var2 = q2Var7;
                }
                Boolean boolValueOf = Boolean.valueOf(z11);
                if ((i14 & 14) == 4) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if ((i14 & 112) == 32) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                boolean z26 = z17 | z18;
                if ((i14 & 7168) == 2048) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                z20 = z26 | z19;
                objQ = sVar6.Q();
                Object obj = l1.m.f39353a;
                if (!z20 || objQ == obj) {
                    i15 = i14;
                    Object l2Var = new l2(z11, q2Var, cVar, null, 1);
                    sVar6.o0(l2Var);
                    objQ = l2Var;
                } else {
                    i15 = i14;
                }
                l1.t.g(boolValueOf, q2Var, (fz.e) objQ, sVar6);
                z1.o oVar3 = z1.o.f58481a;
                z1.r rVarV = j0.c.v(oVar3);
                j0.u uVarA = j0.t.a(j0.i.f35305c, hVar3, sVar6, 0);
                iHashCode = Long.hashCode(sVar6.T);
                l1.q1 q1VarL = sVar6.l();
                z1.r rVarC = z1.a.c(sVar6, rVarV);
                y2.k.J.getClass();
                aVar2 = y2.j.f56913b;
                sVar6.h0();
                if (sVar6.S) {
                    sVar6.k(aVar2);
                } else {
                    sVar6.r0();
                }
                y2.h hVar4 = y2.j.f56917f;
                l1.t.J(hVar4, uVarA, sVar6);
                y2.h hVar5 = y2.j.f56916e;
                l1.t.J(hVar5, q1VarL, sVar6);
                hVar = y2.j.f56918g;
                if (sVar6.S || !kotlin.jvm.internal.m.a(sVar6.Q(), Integer.valueOf(iHashCode))) {
                    defpackage.e.A(iHashCode, sVar6, iHashCode, hVar);
                }
                y2.h hVar6 = y2.j.f56915d;
                l1.t.J(hVar6, rVarC, sVar6);
                float f15 = 22;
                q2Var3 = q2Var2;
                i16 = 2;
                ua.b(ub.a.e0(sVar6, R.string.review_question_type), j0.e2.e(j0.c.C(j0.c.E(oVar3, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, f15, 7), f15, CropImageView.DEFAULT_ASPECT_RATIO, 2), 1.0f), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a(((dc) sVar6.j(fc.f30256a)).f30175h, 0L, fr.j3.A(16), n3.s.L, null, null, 0L, null, null, 3, 0, 0L, null, 16744441), sVar6, 48, 0, 65532);
                sVar2 = sVar6;
                f5 = 16;
                oVar = oVar3;
                z1.r rVarC2 = q0.c.c(j0.c.C(oVar, f5, CropImageView.DEFAULT_ASPECT_RATIO, 2));
                f11 = 10;
                j0.u uVarA2 = j0.t.a(j0.i.g(f11), hVar3, sVar2, 6);
                iHashCode2 = Long.hashCode(sVar2.T);
                l1.q1 q1VarL2 = sVar2.l();
                z1.r rVarC3 = z1.a.c(sVar2, rVarC2);
                sVar2.h0();
                if (sVar2.S) {
                    sVar2.k(aVar2);
                } else {
                    sVar2.r0();
                }
                l1.t.J(hVar4, uVarA2, sVar2);
                l1.t.J(hVar5, q1VarL2, sVar2);
                if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode2))) {
                    defpackage.e.A(iHashCode2, sVar2, iHashCode2, hVar);
                }
                l1.t.J(hVar6, rVarC3, sVar2);
                sVar2.d0(-1095006093);
                it = listL.iterator();
                sVar3 = sVar2;
                while (it.hasNext()) {
                    q2Var5 = (q2) it.next();
                    iArr = o2.f41720a;
                    i17 = iArr[q2Var5.ordinal()];
                    if (i17 != 1) {
                        i18 = 4;
                        i19 = R.drawable.ic_lesson_redo_comprehensive;
                    } else if (i17 != i16) {
                        i18 = 4;
                        i19 = R.drawable.ic_lesson_redo_listening;
                    } else if (i17 != 3) {
                        i18 = 4;
                        if (i17 != 4) {
                            i19 = R.drawable.ic_lesson_redo_spelling;
                        } else {
                            if (i17 == 5) {
                                throw new NoWhenBranchMatchedException();
                            }
                            i19 = R.drawable.playing_cards_24px;
                        }
                    } else {
                        i18 = 4;
                        i19 = R.drawable.ic_lesson_redo_speaking;
                    }
                    i21 = i19;
                    if (z16) {
                        i25 = iArr[q2Var5.ordinal()];
                        if (i25 != 1) {
                            i23 = R.string.srs_practice_mode_comprehensive;
                        } else if (i25 != i16) {
                            i23 = R.string.srs_practice_mode_listening;
                        } else if (i25 != 3) {
                            i23 = R.string.srs_practice_mode_speaking;
                        } else if (i25 != i18) {
                            i23 = R.string.srs_practice_mode_spelling;
                        } else {
                            if (i25 == 5) {
                                throw new NoWhenBranchMatchedException();
                            }
                            i23 = R.string.srs_practice_mode_flashcard;
                        }
                    } else {
                        i22 = iArr[q2Var5.ordinal()];
                        if (i22 != 1) {
                            i23 = R.string.review_question_type_comprehensive;
                        } else if (i22 != i16) {
                            i23 = R.string.review_question_type_listening;
                        } else if (i22 != 3) {
                            i23 = R.string.review_question_type_speaking;
                        } else if (i22 != i18) {
                            i23 = R.string.review_question_type_spelling;
                        } else {
                            if (i22 == 5) {
                                throw new NoWhenBranchMatchedException();
                            }
                            i23 = R.string.review_question_type_flashcard;
                        }
                    }
                    strE0 = ub.a.e0(sVar3, i23);
                    if (!z11 || q2Var5 == q2.FLASHCARD) {
                        z22 = false;
                    } else {
                        z22 = true;
                    }
                    q2Var6 = q2Var3;
                    if (q2Var6 == q2Var5) {
                        z23 = true;
                    } else {
                        z23 = false;
                    }
                    if (z23) {
                        sVar3.d0(-1094948689);
                        z24 = true;
                        vVarX = d0.n.a(((h1.s1) sVar3.j(h1.v1.f31180a)).f31017a, 1);
                        z25 = 0;
                        sVar3.p(false);
                    } else {
                        z24 = true;
                        z25 = 0;
                        sVar3.d0(-1094944124);
                        vVarX = k7.x(sVar3, 1);
                        sVar3.p(false);
                    }
                    vVar = vVarX;
                    if (z23) {
                        sVar3.d0(-1094941395);
                        l1.v1 v1Var = h1.v1.f31180a;
                        long j11 = ((h1.s1) sVar3.j(v1Var)).f31021c;
                        long j12 = ((h1.s1) sVar3.j(v1Var)).f31034q;
                        l1.s sVar7 = sVar3;
                        c11 = 0;
                        t0VarY = k7.y(j11, j12, sVar7, 12);
                        sVar7.p(z25);
                        sVar4 = sVar7;
                    } else {
                        l1.s sVar8 = sVar3;
                        c11 = 0;
                        sVar8.d0(-1094934908);
                        s1Var = (h1.s1) sVar8.j(h1.v1.f31180a);
                        t0Var = s1Var.O;
                        if (t0Var == null) {
                            k1.c cVar4 = k1.v.f37771a;
                            t0Var = new h1.t0(h1.v1.c(s1Var, cVar4), h1.v1.a(s1Var, h1.v1.c(s1Var, cVar4)), h1.v1.c(s1Var, cVar4), g2.x.c(h1.v1.a(s1Var, h1.v1.c(s1Var, cVar4)), 0.38f));
                            s1Var.O = t0Var;
                        }
                        t0VarY = t0Var;
                        sVar8.p(z25);
                        sVar4 = sVar8;
                    }
                    if (q2Var5 == q2.FLASHCARD) {
                        sVar4.d0(416958528);
                        j0.u uVarA3 = j0.t.a(j0.i.f35305c, hVar3, sVar4, z25);
                        iHashCode3 = Long.hashCode(sVar4.T);
                        l1.q1 q1VarL3 = sVar4.l();
                        z1.r rVarC4 = z1.a.c(sVar4, oVar);
                        y2.k.J.getClass();
                        z1.o oVar4 = oVar;
                        aVar3 = y2.j.f56913b;
                        sVar4.h0();
                        if (sVar4.S) {
                            sVar4.k(aVar3);
                        } else {
                            sVar4.r0();
                        }
                        y2.h hVar7 = y2.j.f56917f;
                        l1.t.J(hVar7, uVarA3, sVar4);
                        y2.h hVar8 = y2.j.f56916e;
                        l1.t.J(hVar8, q1VarL3, sVar4);
                        hVar2 = y2.j.f56918g;
                        if (sVar4.S || !kotlin.jvm.internal.m.a(sVar4.Q(), Integer.valueOf(iHashCode3))) {
                            defpackage.e.A(iHashCode3, sVar4, iHashCode3, hVar2);
                        }
                        y2.h hVar9 = y2.j.f56915d;
                        l1.t.J(hVar9, rVarC4, sVar4);
                        r0.e eVarD = r0.f.d(24);
                        final boolean z27 = z23;
                        t1.d dVarD = t1.e.d(952514903, new fz.f() { // from class: mt.a2
                            @Override // fz.f
                            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                j0.v OutlinedCard = (j0.v) obj2;
                                l1.n nVar2 = (l1.n) obj3;
                                int iIntValue = ((Integer) obj4).intValue();
                                kotlin.jvm.internal.m.f(OutlinedCard, "$this$OutlinedCard");
                                l1.s sVar9 = (l1.s) nVar2;
                                if (sVar9.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    z1.o oVar5 = z1.o.f58481a;
                                    z1.r rVarI = j0.e2.i(oVar5, 100, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                                    g3.k kVar = new g3.k(3);
                                    fz.c cVar5 = cVar;
                                    boolean zF = sVar9.f(cVar5);
                                    q2 q2Var8 = q2Var5;
                                    boolean zD2 = zF | sVar9.d(q2Var8.ordinal());
                                    Object objQ3 = sVar9.Q();
                                    if (zD2 || objQ3 == l1.m.f39353a) {
                                        objQ3 = new c2(cVar5, q2Var8, 2);
                                        sVar9.o0(objQ3);
                                    }
                                    boolean z28 = z27;
                                    z1.r rVarC5 = j0.c.C(q0.c.b(rVarI, z28, false, kVar, (fz.a) objQ3, 10), 12, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                                    j0.a2 a2VarA = j0.z1.a(j0.i.f35303a, z1.c.M, sVar9, 48);
                                    int iHashCode5 = Long.hashCode(sVar9.T);
                                    l1.q1 q1VarL4 = sVar9.l();
                                    z1.r rVarC6 = z1.a.c(sVar9, rVarC5);
                                    y2.k.J.getClass();
                                    y2.i iVar = y2.j.f56913b;
                                    sVar9.h0();
                                    if (sVar9.S) {
                                        sVar9.k(iVar);
                                    } else {
                                        sVar9.r0();
                                    }
                                    y2.h hVar10 = y2.j.f56917f;
                                    l1.t.J(hVar10, a2VarA, sVar9);
                                    y2.h hVar11 = y2.j.f56916e;
                                    l1.t.J(hVar11, q1VarL4, sVar9);
                                    y2.h hVar12 = y2.j.f56918g;
                                    if (sVar9.S || !kotlin.jvm.internal.m.a(sVar9.Q(), Integer.valueOf(iHashCode5))) {
                                        defpackage.e.A(iHashCode5, sVar9, iHashCode5, hVar12);
                                    }
                                    y2.h hVar13 = y2.j.f56915d;
                                    l1.t.J(hVar13, rVarC6, sVar9);
                                    z1.r rVarP = j0.e2.p(oVar5, 40, 50);
                                    l1.c3 c3Var = h1.v1.f31180a;
                                    z1.r rVarH = d0.n.h(rVarP, ((h1.s1) sVar9.j(c3Var)).f31017a, r0.f.d(18));
                                    w2.q0 q0VarD = j0.o.d(z1.c.f58467e, false);
                                    int iHashCode6 = Long.hashCode(sVar9.T);
                                    l1.q1 q1VarL5 = sVar9.l();
                                    z1.r rVarC7 = z1.a.c(sVar9, rVarH);
                                    sVar9.h0();
                                    if (sVar9.S) {
                                        sVar9.k(iVar);
                                    } else {
                                        sVar9.r0();
                                    }
                                    l1.t.J(hVar10, q0VarD, sVar9);
                                    l1.t.J(hVar11, q1VarL5, sVar9);
                                    if (sVar9.S || !kotlin.jvm.internal.m.a(sVar9.Q(), Integer.valueOf(iHashCode6))) {
                                        defpackage.e.A(iHashCode6, sVar9, iHashCode6, hVar12);
                                    }
                                    l1.t.J(hVar13, rVarC7, sVar9);
                                    h1.r4.b(se.k.y(i21, sVar9, 0), null, null, ((h1.s1) sVar9.j(c3Var)).f31019b, sVar9, 48, 4);
                                    sVar9.p(true);
                                    ua.b(strE0, j0.c.E(oVar5, 14, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a((j3.y0) sVar9.j(ua.f31167a), 0L, fr.j3.A(20), n3.s.L, null, null, 0L, null, null, 0, 0, 0L, null, 16777209), sVar9, 48, 0, 65532);
                                    if (1.0f <= 0.0d) {
                                        k0.a.a("invalid weight; must be greater than zero");
                                    }
                                    w4.c.r(1.0f, true, sVar9);
                                    i7.a(z28, null, null, false, null, sVar9, 48, 60);
                                    sVar9.p(true);
                                } else {
                                    sVar9.W();
                                }
                                return qy.b0.f48488a;
                            }
                        }, sVar4);
                        oVar2 = oVar4;
                        l1.s sVar9 = sVar4;
                        f12 = f11;
                        k7.k(null, eVarD, t0VarY, null, vVar, dVarD, sVar9, 196608, 9);
                        sVar5 = sVar9;
                        float f16 = 8;
                        z1.r rVarD = j0.c.D(oVar2, f16, 20, f16, f12);
                        j0.a2 a2VarA = j0.z1.a(j0.i.f35303a, z1.c.M, sVar5, 48);
                        iHashCode4 = Long.hashCode(sVar5.T);
                        l1.q1 q1VarL4 = sVar5.l();
                        z1.r rVarC5 = z1.a.c(sVar5, rVarD);
                        sVar5.h0();
                        if (sVar5.S) {
                            sVar5.k(aVar3);
                        } else {
                            sVar5.r0();
                        }
                        l1.t.J(hVar7, a2VarA, sVar5);
                        l1.t.J(hVar8, q1VarL4, sVar5);
                        if (sVar5.S || !kotlin.jvm.internal.m.a(sVar5.Q(), Integer.valueOf(iHashCode4))) {
                            defpackage.e.A(iHashCode4, sVar5, iHashCode4, hVar2);
                        }
                        l1.t.J(hVar9, rVarC5, sVar5);
                        if (1.0f <= 0.0d) {
                            k0.a.a("invalid weight; must be greater than zero");
                        }
                        if (1.0f > Float.MAX_VALUE) {
                            f13 = Float.MAX_VALUE;
                        } else {
                            f13 = 1.0f;
                        }
                        k7.g(new j0.i1(f13, true), CropImageView.DEFAULT_ASPECT_RATIO, 0L, sVar5, 0, 6);
                        j0.c.g(sVar5, d0.n.h(j0.e2.n(j0.c.C(oVar2, f16, CropImageView.DEFAULT_ASPECT_RATIO, 2), 6), ((h1.s1) sVar5.j(h1.v1.f31180a)).B, r0.f.f48733a));
                        if (1.0f <= 0.0d) {
                            k0.a.a("invalid weight; must be greater than zero");
                        }
                        if (1.0f > Float.MAX_VALUE) {
                            f14 = Float.MAX_VALUE;
                        } else {
                            f14 = 1.0f;
                        }
                        j0.i1 i1Var = new j0.i1(f14, true);
                        i24 = 2;
                        k7.g(i1Var, CropImageView.DEFAULT_ASPECT_RATIO, 0L, sVar5, 0, 6);
                        com.google.android.material.datepicker.d.B(sVar5, true, true, false);
                    } else {
                        oVar2 = oVar;
                        final boolean z28 = z23;
                        i24 = 2;
                        l1.s sVar10 = sVar4;
                        f12 = f11;
                        sVar10.d0(420596595);
                        k7.k(null, r0.f.d(12), t0VarY, null, vVar, t1.e.d(-1439316694, new fz.f() { // from class: mt.b2
                            @Override // fz.f
                            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                z1.r rVarB;
                                j0.v OutlinedCard = (j0.v) obj2;
                                l1.n nVar2 = (l1.n) obj3;
                                int iIntValue = ((Integer) obj4).intValue();
                                kotlin.jvm.internal.m.f(OutlinedCard, "$this$OutlinedCard");
                                l1.s sVar11 = (l1.s) nVar2;
                                if (sVar11.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    z1.o oVar5 = z1.o.f58481a;
                                    z1.r rVarG = j0.e2.g(oVar5, 68);
                                    boolean z29 = z22;
                                    boolean z30 = z28;
                                    if (z29) {
                                        sVar11.d0(-2024897767);
                                        sVar11.p(false);
                                        rVarB = d0.n.o(oVar5, false, null, aVar, 15);
                                    } else {
                                        sVar11.d0(-2024755973);
                                        g3.k kVar = new g3.k(3);
                                        fz.c cVar5 = cVar;
                                        boolean zF = sVar11.f(cVar5);
                                        q2 q2Var8 = q2Var5;
                                        boolean zD2 = zF | sVar11.d(q2Var8.ordinal());
                                        Object objQ3 = sVar11.Q();
                                        if (zD2 || objQ3 == l1.m.f39353a) {
                                            objQ3 = new c2(cVar5, q2Var8, 1);
                                            sVar11.o0(objQ3);
                                        }
                                        rVarB = q0.c.b(oVar5, z30, false, kVar, (fz.a) objQ3, 10);
                                        sVar11.p(false);
                                    }
                                    z1.r rVarC6 = j0.c.C(rVarG.i(rVarB), 12, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                                    j0.a2 a2VarA2 = j0.z1.a(j0.i.f35303a, z1.c.M, sVar11, 48);
                                    int iHashCode5 = Long.hashCode(sVar11.T);
                                    l1.q1 q1VarL5 = sVar11.l();
                                    z1.r rVarC7 = z1.a.c(sVar11, rVarC6);
                                    y2.k.J.getClass();
                                    y2.i iVar = y2.j.f56913b;
                                    sVar11.h0();
                                    if (sVar11.S) {
                                        sVar11.k(iVar);
                                    } else {
                                        sVar11.r0();
                                    }
                                    l1.t.J(y2.j.f56917f, a2VarA2, sVar11);
                                    l1.t.J(y2.j.f56916e, q1VarL5, sVar11);
                                    y2.h hVar10 = y2.j.f56918g;
                                    if (sVar11.S || !kotlin.jvm.internal.m.a(sVar11.Q(), Integer.valueOf(iHashCode5))) {
                                        defpackage.e.A(iHashCode5, sVar11, iHashCode5, hVar10);
                                    }
                                    l1.t.J(y2.j.f56915d, rVarC7, sVar11);
                                    d0.n.c(se.k.y(i21, sVar11, 0), null, null, null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar11, 48, 124);
                                    ua.b(strE0, j0.c.E(oVar5, 14, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a((j3.y0) sVar11.j(ua.f31167a), 0L, fr.j3.A(16), n3.s.L, null, null, 0L, null, null, 0, 0, 0L, null, 16777209), sVar11, 48, 0, 65532);
                                    l1.s sVar12 = sVar11;
                                    if (1.0f <= 0.0d) {
                                        k0.a.a("invalid weight; must be greater than zero");
                                    }
                                    w4.c.r(1.0f, true, sVar12);
                                    if (z29) {
                                        sVar12.d0(277918506);
                                        d0.n.c(se.k.y(R.drawable.ic_lesson_index_pro, sVar12, 0), null, j0.e2.n(oVar5, 26), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar12, 432, 120);
                                        sVar12.p(false);
                                    } else {
                                        sVar12.d0(278248408);
                                        i7.a(z30, null, null, false, null, sVar12, 48, 60);
                                        sVar12 = sVar12;
                                        sVar12.p(false);
                                    }
                                    sVar12.p(true);
                                } else {
                                    sVar11.W();
                                }
                                return qy.b0.f48488a;
                            }
                        }, sVar10), sVar10, 196608, 9);
                        sVar5 = sVar10;
                        sVar5.p(z25);
                    }
                    q2Var3 = q2Var6;
                    i16 = i24;
                    f11 = f12;
                    oVar = oVar2;
                    hVar3 = hVar3;
                    f5 = f5;
                    it = it;
                    sVar3 = sVar5;
                }
                int i30 = i16;
                float f17 = f5;
                z1.o oVar5 = oVar;
                q2Var4 = q2Var3;
                sVar3.p(false);
                sVar3.p(true);
                if ((i15 & 458752) == 131072) {
                    z21 = true;
                } else {
                    z21 = false;
                }
                zD = sVar3.d(q2Var4.ordinal()) | z21;
                objQ2 = sVar3.Q();
                if (!zD || objQ2 == obj) {
                    cVar3 = cVar2;
                    objQ2 = new c2(cVar3, q2Var4, 0);
                    sVar3.o0(objQ2);
                } else {
                    cVar3 = cVar2;
                }
                l1.s sVar11 = sVar3;
                iu.k.e((fz.a) objQ2, j0.e2.e(j0.c.C(j0.c.E(oVar5, CropImageView.DEFAULT_ASPECT_RATIO, 42, CropImageView.DEFAULT_ASPECT_RATIO, f17, 5), 32, CropImageView.DEFAULT_ASPECT_RATIO, i30), 1.0f), false, 0L, null, g.f41451r0, sVar11, 196608, 28);
                l1.s sVar12 = sVar11;
                sVar12.p(true);
                z15 = z16;
                sVar = sVar12;
            } else {
                sVar6.W();
                z15 = z13;
                sVar = sVar6;
            }
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new d2(z11, q2Var, z15, cVar, aVar, cVar3, i11, i12);
            }
        }
        i28 |= 384;
        z13 = z12;
        if ((i11 & 3072) != 0) {
            if (sVar6.h(cVar)) {
                i27 = 2048;
            } else {
                i27 = 1024;
            }
            i28 |= i27;
        }
        if ((i11 & 24576) != 0) {
            if (sVar6.h(aVar)) {
                i26 = 16384;
            } else {
                i26 = OSSConstants.DEFAULT_BUFFER_SIZE;
            }
            i28 |= i26;
        }
        if (sVar6.h(cVar3)) {
            i13 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
        } else {
            i13 = 65536;
        }
        i14 = i28 | i13;
        if ((i14 & 74899) != 74898) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (sVar6.T(i14 & 1, z14)) {
            if (i29 != 0) {
                z16 = true;
            } else {
                z16 = z13;
            }
            q2 q2Var8 = q2.FLASHCARD;
            List listL2 = ns.o.L(q2Var8, q2.COMPREHENSIVE, q2.LISTENING, q2.SPEAKING, q2.SPELLING);
            if (z11) {
                q2Var2 = q2Var;
            } else {
                q2Var2 = q2Var;
            }
            Boolean boolValueOf2 = Boolean.valueOf(z11);
            if ((i14 & 14) == 4) {
                z17 = true;
            } else {
                z17 = false;
            }
            if ((i14 & 112) == 32) {
                z18 = true;
            } else {
                z18 = false;
            }
            boolean z29 = z17 | z18;
            if ((i14 & 7168) == 2048) {
                z19 = true;
            } else {
                z19 = false;
            }
            z20 = z29 | z19;
            objQ = sVar6.Q();
            Object obj2 = l1.m.f39353a;
            if (z20) {
                i15 = i14;
                Object l2Var2 = new l2(z11, q2Var, cVar, null, 1);
                sVar6.o0(l2Var2);
                objQ = l2Var2;
            } else {
                i15 = i14;
                Object l2Var3 = new l2(z11, q2Var, cVar, null, 1);
                sVar6.o0(l2Var3);
                objQ = l2Var3;
            }
            l1.t.g(boolValueOf2, q2Var, (fz.e) objQ, sVar6);
            z1.o oVar6 = z1.o.f58481a;
            z1.r rVarV2 = j0.c.v(oVar6);
            j0.u uVarA4 = j0.t.a(j0.i.f35305c, hVar3, sVar6, 0);
            iHashCode = Long.hashCode(sVar6.T);
            l1.q1 q1VarL5 = sVar6.l();
            z1.r rVarC6 = z1.a.c(sVar6, rVarV2);
            y2.k.J.getClass();
            aVar2 = y2.j.f56913b;
            sVar6.h0();
            if (sVar6.S) {
                sVar6.k(aVar2);
            } else {
                sVar6.r0();
            }
            y2.h hVar10 = y2.j.f56917f;
            l1.t.J(hVar10, uVarA4, sVar6);
            y2.h hVar11 = y2.j.f56916e;
            l1.t.J(hVar11, q1VarL5, sVar6);
            hVar = y2.j.f56918g;
            if (sVar6.S) {
                defpackage.e.A(iHashCode, sVar6, iHashCode, hVar);
            } else {
                defpackage.e.A(iHashCode, sVar6, iHashCode, hVar);
            }
            y2.h hVar12 = y2.j.f56915d;
            l1.t.J(hVar12, rVarC6, sVar6);
            float f18 = 22;
            q2Var3 = q2Var2;
            i16 = 2;
            ua.b(ub.a.e0(sVar6, R.string.review_question_type), j0.e2.e(j0.c.C(j0.c.E(oVar6, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, f18, 7), f18, CropImageView.DEFAULT_ASPECT_RATIO, 2), 1.0f), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a(((dc) sVar6.j(fc.f30256a)).f30175h, 0L, fr.j3.A(16), n3.s.L, null, null, 0L, null, null, 3, 0, 0L, null, 16744441), sVar6, 48, 0, 65532);
            sVar2 = sVar6;
            f5 = 16;
            oVar = oVar6;
            z1.r rVarC7 = q0.c.c(j0.c.C(oVar, f5, CropImageView.DEFAULT_ASPECT_RATIO, 2));
            f11 = 10;
            j0.u uVarA5 = j0.t.a(j0.i.g(f11), hVar3, sVar2, 6);
            iHashCode2 = Long.hashCode(sVar2.T);
            l1.q1 q1VarL6 = sVar2.l();
            z1.r rVarC8 = z1.a.c(sVar2, rVarC7);
            sVar2.h0();
            if (sVar2.S) {
                sVar2.k(aVar2);
            } else {
                sVar2.r0();
            }
            l1.t.J(hVar10, uVarA5, sVar2);
            l1.t.J(hVar11, q1VarL6, sVar2);
            if (sVar2.S) {
                defpackage.e.A(iHashCode2, sVar2, iHashCode2, hVar);
            } else {
                defpackage.e.A(iHashCode2, sVar2, iHashCode2, hVar);
            }
            l1.t.J(hVar12, rVarC8, sVar2);
            sVar2.d0(-1095006093);
            it = listL2.iterator();
            sVar3 = sVar2;
            while (it.hasNext()) {
                q2Var5 = (q2) it.next();
                iArr = o2.f41720a;
                i17 = iArr[q2Var5.ordinal()];
                if (i17 != 1) {
                    i18 = 4;
                    i19 = R.drawable.ic_lesson_redo_comprehensive;
                } else if (i17 != i16) {
                    i18 = 4;
                    i19 = R.drawable.ic_lesson_redo_listening;
                } else if (i17 != 3) {
                    i18 = 4;
                    if (i17 != 4) {
                        i19 = R.drawable.ic_lesson_redo_spelling;
                    } else {
                        if (i17 == 5) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i19 = R.drawable.playing_cards_24px;
                    }
                } else {
                    i18 = 4;
                    i19 = R.drawable.ic_lesson_redo_speaking;
                }
                i21 = i19;
                if (z16) {
                    i25 = iArr[q2Var5.ordinal()];
                    if (i25 != 1) {
                        i23 = R.string.srs_practice_mode_comprehensive;
                    } else if (i25 != i16) {
                        i23 = R.string.srs_practice_mode_listening;
                    } else if (i25 != 3) {
                        i23 = R.string.srs_practice_mode_speaking;
                    } else if (i25 != i18) {
                        i23 = R.string.srs_practice_mode_spelling;
                    } else {
                        if (i25 == 5) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i23 = R.string.srs_practice_mode_flashcard;
                    }
                } else {
                    i22 = iArr[q2Var5.ordinal()];
                    if (i22 != 1) {
                        i23 = R.string.review_question_type_comprehensive;
                    } else if (i22 != i16) {
                        i23 = R.string.review_question_type_listening;
                    } else if (i22 != 3) {
                        i23 = R.string.review_question_type_speaking;
                    } else if (i22 != i18) {
                        i23 = R.string.review_question_type_spelling;
                    } else {
                        if (i22 == 5) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i23 = R.string.review_question_type_flashcard;
                    }
                }
                strE0 = ub.a.e0(sVar3, i23);
                if (z11) {
                    z22 = false;
                } else {
                    z22 = false;
                }
                q2Var6 = q2Var3;
                if (q2Var6 == q2Var5) {
                    z23 = true;
                } else {
                    z23 = false;
                }
                if (z23) {
                    sVar3.d0(-1094948689);
                    z24 = true;
                    vVarX = d0.n.a(((h1.s1) sVar3.j(h1.v1.f31180a)).f31017a, 1);
                    z25 = 0;
                    sVar3.p(false);
                } else {
                    z24 = true;
                    z25 = 0;
                    sVar3.d0(-1094944124);
                    vVarX = k7.x(sVar3, 1);
                    sVar3.p(false);
                }
                vVar = vVarX;
                if (z23) {
                    sVar3.d0(-1094941395);
                    l1.v1 v1Var2 = h1.v1.f31180a;
                    long j13 = ((h1.s1) sVar3.j(v1Var2)).f31021c;
                    long j14 = ((h1.s1) sVar3.j(v1Var2)).f31034q;
                    l1.s sVar13 = sVar3;
                    c11 = 0;
                    t0VarY = k7.y(j13, j14, sVar13, 12);
                    sVar13.p(z25);
                    sVar4 = sVar13;
                } else {
                    l1.s sVar14 = sVar3;
                    c11 = 0;
                    sVar14.d0(-1094934908);
                    s1Var = (h1.s1) sVar14.j(h1.v1.f31180a);
                    t0Var = s1Var.O;
                    if (t0Var == null) {
                        k1.c cVar5 = k1.v.f37771a;
                        t0Var = new h1.t0(h1.v1.c(s1Var, cVar5), h1.v1.a(s1Var, h1.v1.c(s1Var, cVar5)), h1.v1.c(s1Var, cVar5), g2.x.c(h1.v1.a(s1Var, h1.v1.c(s1Var, cVar5)), 0.38f));
                        s1Var.O = t0Var;
                    }
                    t0VarY = t0Var;
                    sVar14.p(z25);
                    sVar4 = sVar14;
                }
                if (q2Var5 == q2.FLASHCARD) {
                    sVar4.d0(416958528);
                    j0.u uVarA6 = j0.t.a(j0.i.f35305c, hVar3, sVar4, z25);
                    iHashCode3 = Long.hashCode(sVar4.T);
                    l1.q1 q1VarL7 = sVar4.l();
                    z1.r rVarC9 = z1.a.c(sVar4, oVar);
                    y2.k.J.getClass();
                    z1.o oVar7 = oVar;
                    aVar3 = y2.j.f56913b;
                    sVar4.h0();
                    if (sVar4.S) {
                        sVar4.k(aVar3);
                    } else {
                        sVar4.r0();
                    }
                    y2.h hVar13 = y2.j.f56917f;
                    l1.t.J(hVar13, uVarA6, sVar4);
                    y2.h hVar14 = y2.j.f56916e;
                    l1.t.J(hVar14, q1VarL7, sVar4);
                    hVar2 = y2.j.f56918g;
                    if (sVar4.S) {
                        defpackage.e.A(iHashCode3, sVar4, iHashCode3, hVar2);
                    } else {
                        defpackage.e.A(iHashCode3, sVar4, iHashCode3, hVar2);
                    }
                    y2.h hVar15 = y2.j.f56915d;
                    l1.t.J(hVar15, rVarC9, sVar4);
                    r0.e eVarD2 = r0.f.d(24);
                    final boolean z210 = z23;
                    t1.d dVarD2 = t1.e.d(952514903, new fz.f() { // from class: mt.a2
                        @Override // fz.f
                        public final Object invoke(Object obj3, Object obj4, Object obj5) {
                            j0.v OutlinedCard = (j0.v) obj3;
                            l1.n nVar2 = (l1.n) obj4;
                            int iIntValue = ((Integer) obj5).intValue();
                            kotlin.jvm.internal.m.f(OutlinedCard, "$this$OutlinedCard");
                            l1.s sVar15 = (l1.s) nVar2;
                            if (sVar15.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                                z1.o oVar8 = z1.o.f58481a;
                                z1.r rVarI = j0.e2.i(oVar8, 100, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                                g3.k kVar = new g3.k(3);
                                fz.c cVar6 = cVar;
                                boolean zF = sVar15.f(cVar6);
                                q2 q2Var9 = q2Var5;
                                boolean zD2 = zF | sVar15.d(q2Var9.ordinal());
                                Object objQ3 = sVar15.Q();
                                if (zD2 || objQ3 == l1.m.f39353a) {
                                    objQ3 = new c2(cVar6, q2Var9, 2);
                                    sVar15.o0(objQ3);
                                }
                                boolean z211 = z210;
                                z1.r rVarC10 = j0.c.C(q0.c.b(rVarI, z211, false, kVar, (fz.a) objQ3, 10), 12, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                                j0.a2 a2VarA2 = j0.z1.a(j0.i.f35303a, z1.c.M, sVar15, 48);
                                int iHashCode5 = Long.hashCode(sVar15.T);
                                l1.q1 q1VarL8 = sVar15.l();
                                z1.r rVarC11 = z1.a.c(sVar15, rVarC10);
                                y2.k.J.getClass();
                                y2.i iVar = y2.j.f56913b;
                                sVar15.h0();
                                if (sVar15.S) {
                                    sVar15.k(iVar);
                                } else {
                                    sVar15.r0();
                                }
                                y2.h hVar16 = y2.j.f56917f;
                                l1.t.J(hVar16, a2VarA2, sVar15);
                                y2.h hVar17 = y2.j.f56916e;
                                l1.t.J(hVar17, q1VarL8, sVar15);
                                y2.h hVar18 = y2.j.f56918g;
                                if (sVar15.S || !kotlin.jvm.internal.m.a(sVar15.Q(), Integer.valueOf(iHashCode5))) {
                                    defpackage.e.A(iHashCode5, sVar15, iHashCode5, hVar18);
                                }
                                y2.h hVar19 = y2.j.f56915d;
                                l1.t.J(hVar19, rVarC11, sVar15);
                                z1.r rVarP = j0.e2.p(oVar8, 40, 50);
                                l1.c3 c3Var = h1.v1.f31180a;
                                z1.r rVarH = d0.n.h(rVarP, ((h1.s1) sVar15.j(c3Var)).f31017a, r0.f.d(18));
                                w2.q0 q0VarD = j0.o.d(z1.c.f58467e, false);
                                int iHashCode6 = Long.hashCode(sVar15.T);
                                l1.q1 q1VarL9 = sVar15.l();
                                z1.r rVarC12 = z1.a.c(sVar15, rVarH);
                                sVar15.h0();
                                if (sVar15.S) {
                                    sVar15.k(iVar);
                                } else {
                                    sVar15.r0();
                                }
                                l1.t.J(hVar16, q0VarD, sVar15);
                                l1.t.J(hVar17, q1VarL9, sVar15);
                                if (sVar15.S || !kotlin.jvm.internal.m.a(sVar15.Q(), Integer.valueOf(iHashCode6))) {
                                    defpackage.e.A(iHashCode6, sVar15, iHashCode6, hVar18);
                                }
                                l1.t.J(hVar19, rVarC12, sVar15);
                                h1.r4.b(se.k.y(i21, sVar15, 0), null, null, ((h1.s1) sVar15.j(c3Var)).f31019b, sVar15, 48, 4);
                                sVar15.p(true);
                                ua.b(strE0, j0.c.E(oVar8, 14, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a((j3.y0) sVar15.j(ua.f31167a), 0L, fr.j3.A(20), n3.s.L, null, null, 0L, null, null, 0, 0, 0L, null, 16777209), sVar15, 48, 0, 65532);
                                if (1.0f <= 0.0d) {
                                    k0.a.a("invalid weight; must be greater than zero");
                                }
                                w4.c.r(1.0f, true, sVar15);
                                i7.a(z211, null, null, false, null, sVar15, 48, 60);
                                sVar15.p(true);
                            } else {
                                sVar15.W();
                            }
                            return qy.b0.f48488a;
                        }
                    }, sVar4);
                    oVar2 = oVar7;
                    l1.s sVar15 = sVar4;
                    f12 = f11;
                    k7.k(null, eVarD2, t0VarY, null, vVar, dVarD2, sVar15, 196608, 9);
                    sVar5 = sVar15;
                    float f19 = 8;
                    z1.r rVarD2 = j0.c.D(oVar2, f19, 20, f19, f12);
                    j0.a2 a2VarA2 = j0.z1.a(j0.i.f35303a, z1.c.M, sVar5, 48);
                    iHashCode4 = Long.hashCode(sVar5.T);
                    l1.q1 q1VarL8 = sVar5.l();
                    z1.r rVarC10 = z1.a.c(sVar5, rVarD2);
                    sVar5.h0();
                    if (sVar5.S) {
                        sVar5.k(aVar3);
                    } else {
                        sVar5.r0();
                    }
                    l1.t.J(hVar13, a2VarA2, sVar5);
                    l1.t.J(hVar14, q1VarL8, sVar5);
                    if (sVar5.S) {
                        defpackage.e.A(iHashCode4, sVar5, iHashCode4, hVar2);
                    } else {
                        defpackage.e.A(iHashCode4, sVar5, iHashCode4, hVar2);
                    }
                    l1.t.J(hVar15, rVarC10, sVar5);
                    if (1.0f <= 0.0d) {
                        k0.a.a("invalid weight; must be greater than zero");
                    }
                    if (1.0f > Float.MAX_VALUE) {
                        f13 = Float.MAX_VALUE;
                    } else {
                        f13 = 1.0f;
                    }
                    k7.g(new j0.i1(f13, true), CropImageView.DEFAULT_ASPECT_RATIO, 0L, sVar5, 0, 6);
                    j0.c.g(sVar5, d0.n.h(j0.e2.n(j0.c.C(oVar2, f19, CropImageView.DEFAULT_ASPECT_RATIO, 2), 6), ((h1.s1) sVar5.j(h1.v1.f31180a)).B, r0.f.f48733a));
                    if (1.0f <= 0.0d) {
                        k0.a.a("invalid weight; must be greater than zero");
                    }
                    if (1.0f > Float.MAX_VALUE) {
                        f14 = Float.MAX_VALUE;
                    } else {
                        f14 = 1.0f;
                    }
                    j0.i1 i1Var2 = new j0.i1(f14, true);
                    i24 = 2;
                    k7.g(i1Var2, CropImageView.DEFAULT_ASPECT_RATIO, 0L, sVar5, 0, 6);
                    com.google.android.material.datepicker.d.B(sVar5, true, true, false);
                } else {
                    oVar2 = oVar;
                    final boolean z211 = z23;
                    i24 = 2;
                    l1.s sVar16 = sVar4;
                    f12 = f11;
                    sVar16.d0(420596595);
                    k7.k(null, r0.f.d(12), t0VarY, null, vVar, t1.e.d(-1439316694, new fz.f() { // from class: mt.b2
                        @Override // fz.f
                        public final Object invoke(Object obj3, Object obj4, Object obj5) {
                            z1.r rVarB;
                            j0.v OutlinedCard = (j0.v) obj3;
                            l1.n nVar2 = (l1.n) obj4;
                            int iIntValue = ((Integer) obj5).intValue();
                            kotlin.jvm.internal.m.f(OutlinedCard, "$this$OutlinedCard");
                            l1.s sVar17 = (l1.s) nVar2;
                            if (sVar17.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                                z1.o oVar8 = z1.o.f58481a;
                                z1.r rVarG = j0.e2.g(oVar8, 68);
                                boolean z212 = z22;
                                boolean z30 = z211;
                                if (z212) {
                                    sVar17.d0(-2024897767);
                                    sVar17.p(false);
                                    rVarB = d0.n.o(oVar8, false, null, aVar, 15);
                                } else {
                                    sVar17.d0(-2024755973);
                                    g3.k kVar = new g3.k(3);
                                    fz.c cVar6 = cVar;
                                    boolean zF = sVar17.f(cVar6);
                                    q2 q2Var9 = q2Var5;
                                    boolean zD2 = zF | sVar17.d(q2Var9.ordinal());
                                    Object objQ3 = sVar17.Q();
                                    if (zD2 || objQ3 == l1.m.f39353a) {
                                        objQ3 = new c2(cVar6, q2Var9, 1);
                                        sVar17.o0(objQ3);
                                    }
                                    rVarB = q0.c.b(oVar8, z30, false, kVar, (fz.a) objQ3, 10);
                                    sVar17.p(false);
                                }
                                z1.r rVarC11 = j0.c.C(rVarG.i(rVarB), 12, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                                j0.a2 a2VarA3 = j0.z1.a(j0.i.f35303a, z1.c.M, sVar17, 48);
                                int iHashCode5 = Long.hashCode(sVar17.T);
                                l1.q1 q1VarL9 = sVar17.l();
                                z1.r rVarC12 = z1.a.c(sVar17, rVarC11);
                                y2.k.J.getClass();
                                y2.i iVar = y2.j.f56913b;
                                sVar17.h0();
                                if (sVar17.S) {
                                    sVar17.k(iVar);
                                } else {
                                    sVar17.r0();
                                }
                                l1.t.J(y2.j.f56917f, a2VarA3, sVar17);
                                l1.t.J(y2.j.f56916e, q1VarL9, sVar17);
                                y2.h hVar16 = y2.j.f56918g;
                                if (sVar17.S || !kotlin.jvm.internal.m.a(sVar17.Q(), Integer.valueOf(iHashCode5))) {
                                    defpackage.e.A(iHashCode5, sVar17, iHashCode5, hVar16);
                                }
                                l1.t.J(y2.j.f56915d, rVarC12, sVar17);
                                d0.n.c(se.k.y(i21, sVar17, 0), null, null, null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar17, 48, 124);
                                ua.b(strE0, j0.c.E(oVar8, 14, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a((j3.y0) sVar17.j(ua.f31167a), 0L, fr.j3.A(16), n3.s.L, null, null, 0L, null, null, 0, 0, 0L, null, 16777209), sVar17, 48, 0, 65532);
                                l1.s sVar18 = sVar17;
                                if (1.0f <= 0.0d) {
                                    k0.a.a("invalid weight; must be greater than zero");
                                }
                                w4.c.r(1.0f, true, sVar18);
                                if (z212) {
                                    sVar18.d0(277918506);
                                    d0.n.c(se.k.y(R.drawable.ic_lesson_index_pro, sVar18, 0), null, j0.e2.n(oVar8, 26), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar18, 432, 120);
                                    sVar18.p(false);
                                } else {
                                    sVar18.d0(278248408);
                                    i7.a(z30, null, null, false, null, sVar18, 48, 60);
                                    sVar18 = sVar18;
                                    sVar18.p(false);
                                }
                                sVar18.p(true);
                            } else {
                                sVar17.W();
                            }
                            return qy.b0.f48488a;
                        }
                    }, sVar16), sVar16, 196608, 9);
                    sVar5 = sVar16;
                    sVar5.p(z25);
                }
                q2Var3 = q2Var6;
                i16 = i24;
                f11 = f12;
                oVar = oVar2;
                hVar3 = hVar3;
                f5 = f5;
                it = it;
                sVar3 = sVar5;
            }
            int i31 = i16;
            float f110 = f5;
            z1.o oVar8 = oVar;
            q2Var4 = q2Var3;
            sVar3.p(false);
            sVar3.p(true);
            if ((i15 & 458752) == 131072) {
                z21 = true;
            } else {
                z21 = false;
            }
            zD = sVar3.d(q2Var4.ordinal()) | z21;
            objQ2 = sVar3.Q();
            if (zD) {
                cVar3 = cVar2;
                objQ2 = new c2(cVar3, q2Var4, 0);
                sVar3.o0(objQ2);
            } else {
                cVar3 = cVar2;
                objQ2 = new c2(cVar3, q2Var4, 0);
                sVar3.o0(objQ2);
            }
            l1.s sVar17 = sVar3;
            iu.k.e((fz.a) objQ2, j0.e2.e(j0.c.C(j0.c.E(oVar8, CropImageView.DEFAULT_ASPECT_RATIO, 42, CropImageView.DEFAULT_ASPECT_RATIO, f110, 5), 32, CropImageView.DEFAULT_ASPECT_RATIO, i31), 1.0f), false, 0L, null, g.f41451r0, sVar17, 196608, 28);
            l1.s sVar18 = sVar17;
            sVar18.p(true);
            z15 = z16;
            sVar = sVar18;
        } else {
            sVar6.W();
            z15 = z13;
            sVar = sVar6;
        }
        x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new d2(z11, q2Var, z15, cVar, aVar, cVar3, i11, i12);
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
    public static final void d(rt.s2 s2Var, boolean z11, fz.c cVar, fz.c cVar2, fz.a aVar, rt.b4 b4Var, l1.n nVar, int i11) {
        rt.b4 b4Var2;
        int i12;
        rt.b4 b4Var3;
        l1.s sVar;
        j9.v vVar;
        boolean z12;
        char c11;
        j9.v vVar2;
        l1.s sVar2;
        rt.b4 b4Var4;
        l1.s sVar3 = (l1.s) nVar;
        sVar3.f0(514704457);
        int i13 = i11 | (sVar3.h(s2Var) ? 4 : 2) | (sVar3.g(z11) ? 32 : 16) | (sVar3.h(cVar) ? 256 : 128) | (sVar3.h(cVar2) ? 2048 : 1024) | (sVar3.h(aVar) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE) | 65536;
        if (sVar3.T(i13 & 1, (74899 & i13) != 74898)) {
            sVar3.Y();
            int i14 = i11 & 1;
            l1.g gVar = l1.m.f39353a;
            if (i14 == 0 || sVar3.C()) {
                boolean zH = sVar3.h(s2Var) | ((i13 & 112) == 32);
                Object objQ = sVar3.Q();
                if (zH || objQ == gVar) {
                    objQ = new bt.w(s2Var, z11, 2);
                    sVar3.o0(objQ);
                }
                fz.a aVar2 = (fz.a) objQ;
                sVar3.d0(-1614864554);
                ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(sVar3, LocalViewModelStoreOwner.$stable);
                if (current == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                ViewModel viewModelA = i20.b.a(kotlin.jvm.internal.z.a(rt.b4.class), current.getViewModelStore(), null, i20.a.a(current), null, q10.b.a(sVar3), aVar2);
                sVar3.p(false);
                rt.b4 b4Var5 = (rt.b4) viewModelA;
                i12 = i13 & (-458753);
                b4Var3 = b4Var5;
            } else {
                sVar3.W();
                i12 = i13 & (-458753);
                b4Var3 = b4Var;
            }
            sVar3.q();
            List list = s2Var.f50370a;
            j9.v vVarH = cf.x.H(new j9.c0[0], sVar3);
            Object objQ2 = sVar3.Q();
            if (objQ2 == gVar) {
                objQ2 = l1.t.B(BuildConfig.VERSION_NAME);
                sVar3.o0(objQ2);
            }
            l1.b1 b1Var = (l1.b1) objQ2;
            Object[] objArr = new Object[0];
            Object objQ3 = sVar3.Q();
            if (objQ3 == gVar) {
                objQ3 = new ju.d(20);
                sVar3.o0(objQ3);
            }
            l1.a1 a1Var = (l1.a1) w1.j.c(objArr, (fz.a) objQ3, sVar3, 48);
            Object[] objArr2 = new Object[0];
            Object objQ4 = sVar3.Q();
            if (objQ4 == gVar) {
                objQ4 = new ju.d(21);
                sVar3.o0(objQ4);
            }
            l1.b1 b1Var2 = (l1.b1) w1.j.c(objArr2, (fz.a) objQ4, sVar3, 48);
            l1.h1 h1Var = (l1.h1) a1Var;
            if (h1Var.l() > 0) {
                sVar3.d0(528568148);
                int iL = h1Var.l();
                boolean zF = sVar3.f(a1Var);
                Object objQ5 = sVar3.Q();
                if (zF || objQ5 == gVar) {
                    objQ5 = new gr.j(a1Var, 3);
                    sVar3.o0(objQ5);
                }
                fz.a aVar3 = (fz.a) objQ5;
                boolean zF2 = sVar3.f(a1Var) | sVar3.h(b4Var3) | sVar3.h(vVarH);
                Object objQ6 = sVar3.Q();
                if (zF2 || objQ6 == gVar) {
                    objQ6 = new l0(b4Var3, vVarH, a1Var, 2);
                    sVar3.o0(objQ6);
                }
                fz.a aVar4 = (fz.a) objQ6;
                boolean zF3 = sVar3.f(a1Var) | sVar3.h(b4Var3) | sVar3.f(b1Var2);
                Object objQ7 = sVar3.Q();
                if (zF3 || objQ7 == gVar) {
                    objQ7 = new l0(b4Var3, a1Var, b1Var2, 3);
                    sVar3.o0(objQ7);
                }
                fz.a aVar5 = (fz.a) objQ7;
                vVar = vVarH;
                z12 = false;
                c11 = 16384;
                y3.s(iL, aVar3, aVar4, aVar5, sVar3, 0);
                sVar = sVar3;
            } else {
                sVar = sVar3;
                vVar = vVarH;
                z12 = false;
                c11 = 16384;
                sVar.d0(507969113);
            }
            sVar.p(z12);
            boolean zH2 = sVar.h(list) | ((i12 & 112) == 32 ? true : z12) | ((57344 & i12) == c11 ? true : z12) | sVar.h(vVar) | ((i12 & 896) == 256 ? true : z12) | sVar.h(b4Var3) | ((i12 & 7168) != 2048 ? z12 : true) | sVar.f(b1Var2) | sVar.f(a1Var);
            Object objQ8 = sVar.Q();
            if (zH2 || objQ8 == gVar) {
                rt.b4 b4Var6 = b4Var3;
                vVar2 = vVar;
                sVar2 = sVar;
                f2 f2Var = new f2(list, z11, aVar, vVar2, cVar, b4Var6, b1Var, cVar2, b1Var2, a1Var);
                b4Var4 = b4Var6;
                sVar2.o0(f2Var);
                objQ8 = f2Var;
            } else {
                b4Var4 = b4Var3;
                vVar2 = vVar;
                sVar2 = sVar;
            }
            sVar3 = sVar2;
            com.bumptech.glide.e.c(vVar2, "review", null, null, null, null, null, null, (fz.c) objQ8, sVar3, 48);
            b4Var2 = b4Var4;
        } else {
            sVar3.W();
            b4Var2 = b4Var;
        }
        l1.x1 x1VarT = sVar3.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new bt.q1(s2Var, z11, cVar, cVar2, aVar, b4Var2, i11, 3);
        }
    }

    public static final void e(fz.a onRetry, l1.n nVar, int i11) {
        fz.a aVar;
        kotlin.jvm.internal.m.f(onRetry, "onRetry");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-681553818);
        int i12 = (sVar.h(onRetry) ? 4 : 2) | i11;
        if (sVar.T(i12 & 1, (i12 & 3) != 2)) {
            z1.o oVar = z1.o.f58481a;
            z1.r rVarC = j0.c.C(j0.e2.d(oVar, 1.0f), 32, CropImageView.DEFAULT_ASPECT_RATIO, 2);
            j0.u uVarA = j0.t.a(j0.i.f35307e, z1.c.P, sVar, 54);
            int iHashCode = Long.hashCode(sVar.T);
            l1.q1 q1VarL = sVar.l();
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
            aVar = onRetry;
            iu.k.e(aVar, j0.e2.e(oVar, 1.0f), false, 0L, null, g.f41436j0, sVar, (i12 & 14) | 196656, 28);
            sVar.p(true);
        } else {
            aVar = onRetry;
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new lt.g(i11, aVar);
        }
    }

    public static final r8 f(q2 q2Var) {
        int i11 = o2.f41720a[q2Var.ordinal()];
        if (i11 == 1) {
            return r8.COMPREHENSIVE;
        }
        if (i11 == 2) {
            return r8.LISTENING;
        }
        if (i11 == 3) {
            return r8.SPEAKING;
        }
        if (i11 == 4) {
            return r8.SPELLING;
        }
        if (i11 == 5) {
            return r8.COMPREHENSIVE;
        }
        throw new NoWhenBranchMatchedException();
    }
}
