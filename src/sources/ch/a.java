package ch;

import aj.uZCn.evRpcb;
import android.content.Context;
import android.content.Intent;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import bp.h1;
import bp.n1;
import bt.z6;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.lingo.course.ui.CourseTestActivity;
import com.lingo.course.ui.CourseTestDialogueActivity;
import com.lingodeer.data.model.CourseLessonPracticeType;
import com.lingodeer.data.model.CoursePracticeType;
import com.lingodeer.data.model.INTENTS;
import l1.b1;
import l1.x1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t1.d f7000a = new t1.d(new at.a(22), false, -1997656422);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final t1.d f7001b = new t1.d(new h1(23), false, -1599136642);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final t1.d f7002c = new t1.d(new at.a(23), false, -1479874062);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final t1.d f7003d = new t1.d(new at.a(24), false, -908321310);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final t1.d f7004e = new t1.d(new at.a(25), false, -76200053);

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
    public static final void a(b1 showGemPurchaseFeature, b1 showRefillGem, mu.x xVar, fz.a loginNow, fz.a goBilling, fz.a purchaseFeature, l1.n nVar, int i11) {
        l1.s sVar;
        mu.x xVar2;
        int i12;
        mu.x xVar3;
        Object yVar;
        f.n nVar2;
        Boolean bool;
        boolean z11;
        Object xVar4;
        Boolean bool2;
        b1 b1Var;
        mu.x xVar5;
        boolean z12;
        boolean z13;
        kotlin.jvm.internal.m.f(showGemPurchaseFeature, "showGemPurchaseFeature");
        kotlin.jvm.internal.m.f(showRefillGem, "showRefillGem");
        kotlin.jvm.internal.m.f(loginNow, "loginNow");
        kotlin.jvm.internal.m.f(goBilling, "goBilling");
        kotlin.jvm.internal.m.f(purchaseFeature, "purchaseFeature");
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(1202537068);
        int i13 = i11 | 128 | (sVar2.h(goBilling) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE) | (sVar2.h(purchaseFeature) ? 131072 : 65536);
        if (sVar2.T(i13 & 1, (74899 & i13) != 74898)) {
            sVar2.Y();
            if ((i11 & 1) == 0 || sVar2.C()) {
                sVar2.d0(-1614864554);
                ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(sVar2, LocalViewModelStoreOwner.$stable);
                if (current == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                ViewModel viewModelA = i20.b.a(kotlin.jvm.internal.z.a(mu.x.class), current.getViewModelStore(), null, i20.a.a(current), null, q10.b.a(sVar2), null);
                sVar2.p(false);
                i12 = i13 & (-897);
                xVar3 = (mu.x) viewModelA;
            } else {
                sVar2.W();
                i12 = i13 & (-897);
                xVar3 = xVar;
            }
            int i14 = i12;
            sVar2.q();
            f.n nVar3 = (f.n) sVar2.j(ju.f.f37369c);
            b1 b1VarO = l1.t.o(xVar3.T, sVar2);
            b1 b1VarO2 = l1.t.o(xVar3.Q, sVar2);
            b1 b1VarO3 = l1.t.o(xVar3.L, sVar2);
            b1 b1VarO4 = l1.t.o(xVar3.R, sVar2);
            Boolean bool3 = (Boolean) b1VarO4.getValue();
            bool3.booleanValue();
            Object value = showGemPurchaseFeature.getValue();
            int i15 = i14 & 458752;
            boolean zF = sVar2.f(b1VarO4) | (i15 == 131072);
            Object objQ = sVar2.Q();
            l1.g gVar = l1.m.f39353a;
            if (zF || objQ == gVar) {
                nVar2 = nVar3;
                bool = bool3;
                yVar = new ad.y(showGemPurchaseFeature, purchaseFeature, b1VarO4, (vy.d) null, 3);
                sVar2.o0(yVar);
            } else {
                nVar2 = nVar3;
                yVar = objQ;
                bool = bool3;
            }
            l1.t.g(bool, value, (fz.e) yVar, sVar2);
            if (((Boolean) b1VarO3.getValue()).booleanValue()) {
                sVar2.d0(460457719);
                z11 = false;
                tv.a.c(sVar2, 0);
            } else {
                z11 = false;
                sVar2.d0(458950902);
            }
            sVar2.p(z11);
            Boolean bool4 = (Boolean) b1VarO2.getValue();
            bool4.booleanValue();
            boolean zF2 = sVar2.f(b1VarO2) | (i15 == 131072) | sVar2.h(xVar3);
            Object objQ2 = sVar2.Q();
            if (zF2 || objQ2 == gVar) {
                mu.x xVar6 = xVar3;
                bool2 = bool4;
                xVar4 = new ad.x(purchaseFeature, showGemPurchaseFeature, xVar6, b1VarO2, null, 6);
                b1Var = showGemPurchaseFeature;
                xVar5 = xVar6;
                sVar2.o0(xVar4);
            } else {
                mu.x xVar7 = xVar3;
                bool2 = bool4;
                xVar4 = objQ2;
                xVar5 = xVar7;
                b1Var = showGemPurchaseFeature;
            }
            l1.t.f((fz.e) xVar4, bool2, sVar2);
            mu.l lVar = (mu.l) b1VarO.getValue();
            if (kotlin.jvm.internal.m.a(lVar, mu.j.f42143a)) {
                sVar2.d0(291960208);
                sVar2.p(false);
                sVar = sVar2;
                xVar5 = xVar5;
            } else {
                if (!(lVar instanceof mu.k)) {
                    throw nv.p.x(sVar2, 291958986, false);
                }
                sVar2.d0(460897578);
                if (((Boolean) b1Var.getValue()).booleanValue()) {
                    sVar2.d0(460933848);
                    mu.k kVar = (mu.k) lVar;
                    int i16 = kVar.f42144a;
                    Object objQ3 = sVar2.Q();
                    if (objQ3 == gVar) {
                        objQ3 = new z6(21, b1Var);
                        sVar2.o0(objQ3);
                    }
                    fz.a aVar = (fz.a) objQ3;
                    boolean zH = sVar2.h(lVar) | sVar2.h(xVar5);
                    Object objQ4 = sVar2.Q();
                    if (zH || objQ4 == gVar) {
                        objQ4 = new androidx.lifecycle.compose.a(kVar, showRefillGem, xVar5, 7);
                        sVar2.o0(objQ4);
                    }
                    fz.a aVar2 = (fz.a) objQ4;
                    boolean z14 = (i14 & 57344) == 16384;
                    Object objQ5 = sVar2.Q();
                    if (z14 || objQ5 == gVar) {
                        objQ5 = new at.r(28, goBilling);
                        sVar2.o0(objQ5);
                    }
                    sVar = sVar2;
                    ku.a.g(i16, aVar, aVar2, (fz.a) objQ5, sVar, 0);
                    z12 = false;
                } else {
                    sVar = sVar2;
                    z12 = false;
                    sVar.d0(458950902);
                }
                sVar.p(z12);
                if (((Boolean) showRefillGem.getValue()).booleanValue()) {
                    sVar.d0(461501737);
                    mu.k kVar2 = (mu.k) lVar;
                    Object objQ6 = sVar.Q();
                    if (objQ6 == gVar) {
                        objQ6 = new z6(22, showRefillGem);
                        sVar.o0(objQ6);
                    }
                    fz.a aVar3 = (fz.a) objQ6;
                    boolean zH2 = sVar.h(xVar5) | sVar.h(nVar2);
                    Object objQ7 = sVar.Q();
                    if (zH2 || objQ7 == gVar) {
                        objQ7 = new i(xVar5, nVar2, loginNow, 0);
                        sVar.o0(objQ7);
                    }
                    ku.a.j(kVar2, aVar3, (fz.c) objQ7, sVar, 8);
                    z13 = false;
                } else {
                    z13 = false;
                    sVar.d0(458950902);
                }
                sVar.p(z13);
                sVar.p(z13);
            }
            xVar2 = xVar5;
        } else {
            sVar = sVar2;
            sVar.W();
            xVar2 = xVar;
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new bp.f0((Object) showGemPurchaseFeature, (Object) showRefillGem, (Object) xVar2, loginNow, goBilling, purchaseFeature, i11, 4);
        }
    }

    public static final void b(fz.a onDismissRequest, fz.a onRestart, fz.a onContinue, l1.n nVar, int i11) {
        int i12;
        kotlin.jvm.internal.m.f(onDismissRequest, "onDismissRequest");
        kotlin.jvm.internal.m.f(onRestart, "onRestart");
        kotlin.jvm.internal.m.f(onContinue, "onContinue");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-1063458145);
        if ((i11 & 48) == 0) {
            i12 = (sVar.h(onRestart) ? 32 : 16) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 384) == 0) {
            i12 |= sVar.h(onContinue) ? 256 : 128;
        }
        if (sVar.T(i12 & 1, (i12 & 147) != 146)) {
            h1.k.d(onDismissRequest, j0.c.A(z1.o.f58481a, 16), new z3.r(3), t1.e.d(-67158567, new n1(3, onRestart, onContinue), sVar), sVar, 3510, 0);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new n0(onDismissRequest, onRestart, onContinue, i11, 0);
        }
    }

    public static final CoursePracticeType c(CourseLessonPracticeType courseLessonPracticeType) {
        kotlin.jvm.internal.m.f(courseLessonPracticeType, "<this>");
        switch (p0.f7084a[courseLessonPracticeType.ordinal()]) {
            case 1:
                return CoursePracticeType.COURSE;
            case 2:
                return CoursePracticeType.COURSE_REDO;
            case 3:
                return CoursePracticeType.COURSE_PRACTICE_COMPREHENSIVE;
            case 4:
                return CoursePracticeType.COURSE_PRACTICE_LISTENING;
            case 5:
                return CoursePracticeType.COURSE_PRACTICE_SPELLING;
            case 6:
                return CoursePracticeType.COURSE_PRACTICE_SPEAKING;
            default:
                return null;
        }
    }

    public static Intent e(Context context, long j11, long j12, String mode) {
        kotlin.jvm.internal.m.f(mode, "mode");
        Intent intent = new Intent(context, (Class<?>) CourseTestDialogueActivity.class);
        intent.putExtra(INTENTS.EXTRA_LONG, j11);
        intent.putExtra(INTENTS.EXTRA_LONG_2, j12);
        intent.putExtra(INTENTS.EXTRA_STRING, mode);
        return intent;
    }

    public static Intent d(Context context, long j11, long j12, int i11, int i12, boolean z11, String mode) {
        kotlin.jvm.internal.m.f(context, "context");
        kotlin.jvm.internal.m.f(mode, "mode");
        Intent intent = new Intent(context, (Class<?>) CourseTestActivity.class);
        intent.putExtra(INTENTS.EXTRA_LONG, j11);
        intent.putExtra(INTENTS.EXTRA_LONG_2, j12);
        intent.putExtra(evRpcb.lth, i11);
        intent.putExtra(INTENTS.EXTRA_INT_2, i12);
        intent.putExtra(INTENTS.EXTRA_BOOLEAN_2, z11);
        intent.putExtra(INTENTS.EXTRA_STRING, mode);
        return intent;
    }
}
