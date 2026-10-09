package dl;

import a0.l1;
import a0.m1;
import a0.y;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.lifecycle.ViewModelKt;
import androidx.viewpager2.widget.ViewPager2;
import app.rive.runtime.kotlin.RiveAnimationView;
import ay.p;
import bp.b2;
import bp.p0;
import cf.x;
import com.google.android.flexbox.FlexboxLayout;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.chineseskill.ui.pinyin.widget.WaveView;
import com.lingo.lingoskill.grkskill.ui.learn.GRKSyllableIntroductionActivity;
import com.lingo.lingoskill.hindiskill.ui.learn.HINDISyllableIntroductionActivity;
import com.lingo.lingoskill.speak.adapter.SpeakTryAdapter;
import com.lingo.lingoskill.speak.object.PodSentence;
import com.lingodeer.R;
import com.lingodeer.data.env.Env;
import com.lingodeer.data.model.CoursePracticeType;
import com.lingodeer.data.model.WordAccuracyScoreTimingResult;
import com.lingodeer.data.model.uistate.WordSentenceCharacterType;
import com.tbruyelle.rxpermissions3.RxPermissions;
import com.yalantis.ucrop.view.CropImageView;
import d0.y1;
import j0.a2;
import j0.e2;
import j0.t;
import j0.u;
import j0.z1;
import j9.a0;
import j9.v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.m;
import l1.b1;
import l1.b3;
import l1.n;
import l1.q1;
import l1.s;
import m0.l;
import mt.b6;
import mt.c4;
import oo.k0;
import qy.b0;
import r.x2;
import rt.bb;
import rt.f8;
import rt.g8;
import rt.k6;
import rt.l0;
import rt.l9;
import rt.mb;
import rt.na;
import rt.oa;
import rt.qa;
import rt.ta;
import y.c0;
import z1.o;
import z1.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d implements fz.c {
    public final /* synthetic */ Object H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f23443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f23444c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f23445d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f23446e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f23447f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f23448t;

    public /* synthetic */ d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i11) {
        this.f23442a = i11;
        this.f23443b = obj;
        this.f23444c = obj2;
        this.f23445d = obj3;
        this.f23446e = obj4;
        this.f23447f = obj5;
        this.f23448t = obj6;
        this.H = obj7;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0184  */
    /* JADX WARN: Code duplicated, block: B:34:0x0192 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0194  */
    /* JADX WARN: Code duplicated, block: B:36:0x0198  */
    @Override // fz.c
    public final Object invoke(Object obj) {
        float f5;
        boolean z11;
        k6 k6Var;
        boolean z12;
        int i11 = this.f23442a;
        int i12 = 3;
        Object obj2 = null;
        b0 b0Var = b0.f48488a;
        char c11 = 1;
        char c12 = 1;
        Object obj3 = this.H;
        Object obj4 = this.f23448t;
        Object obj5 = this.f23447f;
        Object obj6 = this.f23446e;
        Object obj7 = this.f23445d;
        Object obj8 = this.f23444c;
        Object obj9 = this.f23443b;
        switch (i11) {
            case 0:
                List list = (List) obj9;
                final GRKSyllableIntroductionActivity gRKSyllableIntroductionActivity = (GRKSyllableIntroductionActivity) obj4;
                final gl.a aVar = (gl.a) obj3;
                final List list2 = (List) obj8;
                final List list3 = (List) obj7;
                final List list4 = (List) obj6;
                final List list5 = (List) obj5;
                m0.j LazyVerticalGrid = (m0.j) obj;
                int i13 = GRKSyllableIntroductionActivity.H;
                kotlin.jvm.internal.m.f(LazyVerticalGrid, "$this$LazyVerticalGrid");
                m0.j.p(LazyVerticalGrid, new y1(4), new t1.d(new a00.b(gRKSyllableIntroductionActivity, 9), true, -1313746953), 5);
                LazyVerticalGrid.q(list.size(), null, null, new p0(2, list), new t1.d(new n(list, gRKSyllableIntroductionActivity, aVar, 0), true, -1117249557));
                final int i14 = 0;
                m0.j.p(LazyVerticalGrid, new y1(5), new t1.d(new fz.f() { // from class: dl.f
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v1, types: [com.lingo.lingoskill.grkskill.ui.learn.GRKSyllableIntroductionActivity] */
                    /* JADX WARN: Type inference failed for: r14v5, types: [l1.n, l1.s] */
                    /* JADX WARN: Type inference failed for: r15v16, types: [boolean] */
                    /* JADX WARN: Type inference failed for: r15v17, types: [boolean, int] */
                    /* JADX WARN: Type inference failed for: r15v2 */
                    /* JADX WARN: Type inference failed for: r15v20 */
                    /* JADX WARN: Type inference failed for: r15v24 */
                    /* JADX WARN: Type inference failed for: r15v3, types: [boolean, int] */
                    /* JADX WARN: Type inference failed for: r15v5 */
                    /* JADX WARN: Type inference failed for: r24v1, types: [com.lingo.lingoskill.grkskill.ui.learn.GRKSyllableIntroductionActivity] */
                    /* JADX WARN: Type inference failed for: r3v2, types: [l1.n, l1.s] */
                    /* JADX WARN: Type inference failed for: r3v6, types: [com.lingo.lingoskill.grkskill.ui.learn.GRKSyllableIntroductionActivity] */
                    /* JADX WARN: Type inference failed for: r4v12 */
                    /* JADX WARN: Type inference failed for: r4v25 */
                    /* JADX WARN: Type inference failed for: r4v5, types: [com.lingo.lingoskill.grkskill.ui.learn.GRKSyllableIntroductionActivity] */
                    /* JADX WARN: Type inference failed for: r4v6 */
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
                    @Override // fz.f
                    public final Object invoke(Object obj10, Object obj11, Object obj12) {
                        boolean z13;
                        final int i15;
                        Object obj13;
                        int i16 = i14;
                        b0 b0Var2 = b0.f48488a;
                        Object obj14 = l1.m.f39353a;
                        final gl.a aVar2 = aVar;
                        List<List> list6 = list3;
                        List<List> list7 = list2;
                        o oVar = o.f58481a;
                        int i17 = 0;
                        switch (i16) {
                            case 0:
                                m0.l item = (m0.l) obj10;
                                l1.n nVar = (l1.n) obj11;
                                int iIntValue = ((Integer) obj12).intValue();
                                int i18 = GRKSyllableIntroductionActivity.H;
                                z1.i iVar = z1.c.L;
                                kotlin.jvm.internal.m.f(item, "$this$item");
                                ?? r9 = (s) nVar;
                                if (r9.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    u uVarA = t.a(j0.i.f35305c, z1.c.O, r9, 0);
                                    int iHashCode = Long.hashCode(r9.T);
                                    q1 q1VarL = r9.l();
                                    r rVarC = z1.a.c(r9, oVar);
                                    y2.k.J.getClass();
                                    y2.i iVar2 = y2.j.f56913b;
                                    r9.h0();
                                    if (r9.S) {
                                        r9.k(iVar2);
                                    } else {
                                        r9.r0();
                                    }
                                    l1.t.J(y2.j.f56917f, uVarA, r9);
                                    l1.t.J(y2.j.f56916e, q1VarL, r9);
                                    y2.h hVar = y2.j.f56918g;
                                    if (r9.S || !kotlin.jvm.internal.m.a(r9.Q(), Integer.valueOf(iHashCode))) {
                                        defpackage.e.A(iHashCode, r9, iHashCode, hVar);
                                    }
                                    l1.t.J(y2.j.f56915d, rVarC, r9);
                                    String strE0 = ub.a.e0(r9, R.string.grk_alp_section_content_3);
                                    ?? r11 = gRKSyllableIntroductionActivity;
                                    r11.v(strE0, r9, 0);
                                    j0.c.g(r9, e2.g(oVar, 8));
                                    r9.d0(304584760);
                                    ?? r12 = r11;
                                    for (final List list8 : list7) {
                                        a2 a2VarA = z1.a(j0.i.f35303a, iVar, r9, 0);
                                        int iHashCode2 = Long.hashCode(r9.T);
                                        q1 q1VarL2 = r9.l();
                                        r rVarC2 = z1.a.c(r9, oVar);
                                        y2.k.J.getClass();
                                        y2.i iVar3 = y2.j.f56913b;
                                        r9.h0();
                                        if (r9.S) {
                                            r9.k(iVar3);
                                        } else {
                                            r9.r0();
                                        }
                                        l1.t.J(y2.j.f56917f, a2VarA, r9);
                                        l1.t.J(y2.j.f56916e, q1VarL2, r9);
                                        y2.h hVar2 = y2.j.f56918g;
                                        if (r9.S || !kotlin.jvm.internal.m.a(r9.Q(), Integer.valueOf(iHashCode2))) {
                                            defpackage.e.A(iHashCode2, r9, iHashCode2, hVar2);
                                        }
                                        l1.t.J(y2.j.f56915d, rVarC2, r9);
                                        String str = (String) list8.get(0);
                                        String str2 = (String) list8.get(1);
                                        boolean zH = r9.h(aVar2) | r9.h(list8);
                                        Object objQ = r9.Q();
                                        Object obj15 = objQ;
                                        if (zH || objQ == obj14) {
                                            final int i19 = 0;
                                            fz.a aVar3 = new fz.a() { // from class: dl.k
                                                @Override // fz.a
                                                public final Object invoke() {
                                                    int i21 = i19;
                                                    b0 b0Var3 = b0.f48488a;
                                                    List list9 = list8;
                                                    gl.a aVar4 = aVar2;
                                                    switch (i21) {
                                                        case 0:
                                                            int i22 = GRKSyllableIntroductionActivity.H;
                                                            aVar4.a((String) list9.get(1));
                                                            break;
                                                        case 1:
                                                            int i23 = GRKSyllableIntroductionActivity.H;
                                                            aVar4.a((String) list9.get(0));
                                                            break;
                                                        case 2:
                                                            int i24 = GRKSyllableIntroductionActivity.H;
                                                            aVar4.a((String) list9.get(0));
                                                            break;
                                                        default:
                                                            int i25 = GRKSyllableIntroductionActivity.H;
                                                            aVar4.a((String) list9.get(1));
                                                            break;
                                                    }
                                                    return b0Var3;
                                                }
                                            };
                                            r9.o0(aVar3);
                                            obj15 = aVar3;
                                        }
                                        ?? r24 = r12;
                                        r24.s(str, str2, (fz.a) obj15, r9, 6);
                                        List listSubList = list8.subList(2, list8.size());
                                        boolean zH2 = r9.h(aVar2);
                                        Object objQ2 = r9.Q();
                                        if (zH2 || objQ2 == obj14) {
                                            final int i21 = 0;
                                            objQ2 = new fz.c() { // from class: dl.l
                                                @Override // fz.c
                                                public final Object invoke(Object obj16) {
                                                    int i22 = i21;
                                                    b0 b0Var3 = b0.f48488a;
                                                    gl.a aVar4 = aVar2;
                                                    String it = (String) obj16;
                                                    switch (i22) {
                                                        case 0:
                                                            int i23 = GRKSyllableIntroductionActivity.H;
                                                            kotlin.jvm.internal.m.f(it, "it");
                                                            aVar4.a(it);
                                                            break;
                                                        case 1:
                                                            int i24 = GRKSyllableIntroductionActivity.H;
                                                            kotlin.jvm.internal.m.f(it, "it");
                                                            aVar4.a(it);
                                                            break;
                                                        case 2:
                                                            int i25 = GRKSyllableIntroductionActivity.H;
                                                            kotlin.jvm.internal.m.f(it, "it");
                                                            aVar4.a(it);
                                                            break;
                                                        default:
                                                            int i26 = GRKSyllableIntroductionActivity.H;
                                                            kotlin.jvm.internal.m.f(it, "it");
                                                            aVar4.a(it);
                                                            break;
                                                    }
                                                    return b0Var3;
                                                }
                                            };
                                            r9.o0(objQ2);
                                        }
                                        r24.t(listSubList, (fz.c) objQ2, r9, 6);
                                        r9.p(true);
                                        r12 = r24;
                                    }
                                    ?? r13 = r12;
                                    ?? r15 = 0;
                                    r9.p(false);
                                    r13.u(ub.a.e0(r9, R.string.grk_alp_section_content_4), r9, 0);
                                    r9.d0(304602104);
                                    for (final List list9 : list6) {
                                        a2 a2VarA2 = z1.a(j0.i.f35303a, iVar, r9, r15);
                                        int iHashCode3 = Long.hashCode(r9.T);
                                        q1 q1VarL3 = r9.l();
                                        r rVarC3 = z1.a.c(r9, oVar);
                                        y2.k.J.getClass();
                                        y2.i iVar4 = y2.j.f56913b;
                                        r9.h0();
                                        if (r9.S) {
                                            r9.k(iVar4);
                                        } else {
                                            r9.r0();
                                        }
                                        l1.t.J(y2.j.f56917f, a2VarA2, r9);
                                        l1.t.J(y2.j.f56916e, q1VarL3, r9);
                                        y2.h hVar3 = y2.j.f56918g;
                                        if (r9.S || !kotlin.jvm.internal.m.a(r9.Q(), Integer.valueOf(iHashCode3))) {
                                            defpackage.e.A(iHashCode3, r9, iHashCode3, hVar3);
                                        }
                                        l1.t.J(y2.j.f56915d, rVarC3, r9);
                                        String str3 = (String) list9.get(0);
                                        String str4 = (String) list9.get(1);
                                        boolean zH3 = r9.h(aVar2) | r9.h(list9);
                                        Object objQ3 = r9.Q();
                                        Object obj16 = objQ3;
                                        if (zH3 || objQ3 == obj14) {
                                            final int i22 = 1;
                                            fz.a aVar4 = new fz.a() { // from class: dl.k
                                                @Override // fz.a
                                                public final Object invoke() {
                                                    int i23 = i22;
                                                    b0 b0Var3 = b0.f48488a;
                                                    List list10 = list9;
                                                    gl.a aVar5 = aVar2;
                                                    switch (i23) {
                                                        case 0:
                                                            int i24 = GRKSyllableIntroductionActivity.H;
                                                            aVar5.a((String) list10.get(1));
                                                            break;
                                                        case 1:
                                                            int i25 = GRKSyllableIntroductionActivity.H;
                                                            aVar5.a((String) list10.get(0));
                                                            break;
                                                        case 2:
                                                            int i26 = GRKSyllableIntroductionActivity.H;
                                                            aVar5.a((String) list10.get(0));
                                                            break;
                                                        default:
                                                            int i27 = GRKSyllableIntroductionActivity.H;
                                                            aVar5.a((String) list10.get(1));
                                                            break;
                                                    }
                                                    return b0Var3;
                                                }
                                            };
                                            r9.o0(aVar4);
                                            obj16 = aVar4;
                                        }
                                        r13.s(str3, str4, (fz.a) obj16, r9, 6);
                                        List listSubList2 = list9.subList(2, list9.size());
                                        boolean zH4 = r9.h(aVar2);
                                        Object objQ4 = r9.Q();
                                        if (zH4 || objQ4 == obj14) {
                                            z13 = true;
                                            final boolean z14 = true ? 1 : 0;
                                            objQ4 = new fz.c() { // from class: dl.l
                                                @Override // fz.c
                                                public final Object invoke(Object obj17) {
                                                    int i23 = z14;
                                                    b0 b0Var3 = b0.f48488a;
                                                    gl.a aVar5 = aVar2;
                                                    String it = (String) obj17;
                                                    switch (i23) {
                                                        case 0:
                                                            int i24 = GRKSyllableIntroductionActivity.H;
                                                            kotlin.jvm.internal.m.f(it, "it");
                                                            aVar5.a(it);
                                                            break;
                                                        case 1:
                                                            int i25 = GRKSyllableIntroductionActivity.H;
                                                            kotlin.jvm.internal.m.f(it, "it");
                                                            aVar5.a(it);
                                                            break;
                                                        case 2:
                                                            int i26 = GRKSyllableIntroductionActivity.H;
                                                            kotlin.jvm.internal.m.f(it, "it");
                                                            aVar5.a(it);
                                                            break;
                                                        default:
                                                            int i27 = GRKSyllableIntroductionActivity.H;
                                                            kotlin.jvm.internal.m.f(it, "it");
                                                            aVar5.a(it);
                                                            break;
                                                    }
                                                    return b0Var3;
                                                }
                                            };
                                            r9.o0(objQ4);
                                        } else {
                                            z13 = true;
                                        }
                                        r13.t(listSubList2, (fz.c) objQ4, r9, 6);
                                        r9.p(z13);
                                        r15 = 0;
                                    }
                                    r9.p(r15);
                                    r9.p(true);
                                } else {
                                    r9.W();
                                }
                                break;
                            default:
                                m0.l item2 = (m0.l) obj10;
                                l1.n nVar2 = (l1.n) obj11;
                                int iIntValue2 = ((Integer) obj12).intValue();
                                int i23 = GRKSyllableIntroductionActivity.H;
                                z1.i iVar5 = z1.c.L;
                                kotlin.jvm.internal.m.f(item2, "$this$item");
                                ?? r14 = (s) nVar2;
                                if (r14.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                    u uVarA2 = t.a(j0.i.f35305c, z1.c.O, r14, 0);
                                    int iHashCode4 = Long.hashCode(r14.T);
                                    q1 q1VarL4 = r14.l();
                                    r rVarC4 = z1.a.c(r14, oVar);
                                    y2.k.J.getClass();
                                    y2.i iVar6 = y2.j.f56913b;
                                    r14.h0();
                                    if (r14.S) {
                                        r14.k(iVar6);
                                    } else {
                                        r14.r0();
                                    }
                                    l1.t.J(y2.j.f56917f, uVarA2, r14);
                                    l1.t.J(y2.j.f56916e, q1VarL4, r14);
                                    y2.h hVar4 = y2.j.f56918g;
                                    if (r14.S || !kotlin.jvm.internal.m.a(r14.Q(), Integer.valueOf(iHashCode4))) {
                                        defpackage.e.A(iHashCode4, r14, iHashCode4, hVar4);
                                    }
                                    l1.t.J(y2.j.f56915d, rVarC4, r14);
                                    String strE1 = ub.a.e0(r14, R.string.grk_alp_section_content_5);
                                    ?? r16 = gRKSyllableIntroductionActivity;
                                    r16.v(strE1, r14, 0);
                                    j0.c.g(r14, e2.g(oVar, 8));
                                    r14.d0(-663376073);
                                    Iterator it = list7.iterator();
                                    while (it.hasNext()) {
                                        final List list10 = (List) it.next();
                                        a2 a2VarA3 = z1.a(j0.i.f35303a, iVar5, r14, i17);
                                        int iHashCode5 = Long.hashCode(r14.T);
                                        q1 q1VarL5 = r14.l();
                                        r rVarC5 = z1.a.c(r14, oVar);
                                        y2.k.J.getClass();
                                        y2.i iVar7 = y2.j.f56913b;
                                        r14.h0();
                                        Iterator it2 = it;
                                        if (r14.S) {
                                            r14.k(iVar7);
                                        } else {
                                            r14.r0();
                                        }
                                        l1.t.J(y2.j.f56917f, a2VarA3, r14);
                                        l1.t.J(y2.j.f56916e, q1VarL5, r14);
                                        y2.h hVar5 = y2.j.f56918g;
                                        if (r14.S || !kotlin.jvm.internal.m.a(r14.Q(), Integer.valueOf(iHashCode5))) {
                                            defpackage.e.A(iHashCode5, r14, iHashCode5, hVar5);
                                        }
                                        l1.t.J(y2.j.f56915d, rVarC5, r14);
                                        String str5 = (String) list10.get(0);
                                        String str6 = (String) list10.get(1);
                                        boolean zH5 = r14.h(aVar2) | r14.h(list10);
                                        Object objQ5 = r14.Q();
                                        if (zH5 || objQ5 == obj14) {
                                            i15 = 2;
                                            fz.a aVar5 = new fz.a() { // from class: dl.k
                                                @Override // fz.a
                                                public final Object invoke() {
                                                    int i24 = i15;
                                                    b0 b0Var3 = b0.f48488a;
                                                    List list11 = list10;
                                                    gl.a aVar6 = aVar2;
                                                    switch (i24) {
                                                        case 0:
                                                            int i25 = GRKSyllableIntroductionActivity.H;
                                                            aVar6.a((String) list11.get(1));
                                                            break;
                                                        case 1:
                                                            int i26 = GRKSyllableIntroductionActivity.H;
                                                            aVar6.a((String) list11.get(0));
                                                            break;
                                                        case 2:
                                                            int i27 = GRKSyllableIntroductionActivity.H;
                                                            aVar6.a((String) list11.get(0));
                                                            break;
                                                        default:
                                                            int i28 = GRKSyllableIntroductionActivity.H;
                                                            aVar6.a((String) list11.get(1));
                                                            break;
                                                    }
                                                    return b0Var3;
                                                }
                                            };
                                            r14.o0(aVar5);
                                            obj13 = aVar5;
                                        } else {
                                            i15 = 2;
                                            obj13 = objQ5;
                                        }
                                        r16.s(str5, str6, (fz.a) obj13, r14, 6);
                                        List listSubList3 = list10.subList(i15, list10.size());
                                        boolean zH6 = r14.h(aVar2);
                                        Object objQ6 = r14.Q();
                                        if (zH6 || objQ6 == obj14) {
                                            objQ6 = new fz.c() { // from class: dl.l
                                                @Override // fz.c
                                                public final Object invoke(Object obj17) {
                                                    int i24 = i15;
                                                    b0 b0Var3 = b0.f48488a;
                                                    gl.a aVar6 = aVar2;
                                                    String it3 = (String) obj17;
                                                    switch (i24) {
                                                        case 0:
                                                            int i25 = GRKSyllableIntroductionActivity.H;
                                                            kotlin.jvm.internal.m.f(it3, "it");
                                                            aVar6.a(it3);
                                                            break;
                                                        case 1:
                                                            int i26 = GRKSyllableIntroductionActivity.H;
                                                            kotlin.jvm.internal.m.f(it3, "it");
                                                            aVar6.a(it3);
                                                            break;
                                                        case 2:
                                                            int i27 = GRKSyllableIntroductionActivity.H;
                                                            kotlin.jvm.internal.m.f(it3, "it");
                                                            aVar6.a(it3);
                                                            break;
                                                        default:
                                                            int i28 = GRKSyllableIntroductionActivity.H;
                                                            kotlin.jvm.internal.m.f(it3, "it");
                                                            aVar6.a(it3);
                                                            break;
                                                    }
                                                    return b0Var3;
                                                }
                                            };
                                            r14.o0(objQ6);
                                        }
                                        r16.t(listSubList3, (fz.c) objQ6, r14, 6);
                                        r14.p(true);
                                        it = it2;
                                        i17 = 0;
                                    }
                                    ?? r17 = i17;
                                    r14.p(r17);
                                    r16.q(ub.a.e0(r14, R.string.grk_alp_section_content_6), r14, r17 == true ? 1 : 0);
                                    r16.u(ub.a.e0(r14, R.string.grk_alp_section_content_7), r14, r17 == true ? 1 : 0);
                                    r14.d0(-663355721);
                                    ?? r18 = r17;
                                    for (final List list11 : list6) {
                                        a2 a2VarA4 = z1.a(j0.i.f35303a, iVar5, r14, r18);
                                        int iHashCode6 = Long.hashCode(r14.T);
                                        q1 q1VarL6 = r14.l();
                                        r rVarC6 = z1.a.c(r14, oVar);
                                        y2.k.J.getClass();
                                        y2.i iVar8 = y2.j.f56913b;
                                        r14.h0();
                                        if (r14.S) {
                                            r14.k(iVar8);
                                        } else {
                                            r14.r0();
                                        }
                                        l1.t.J(y2.j.f56917f, a2VarA4, r14);
                                        l1.t.J(y2.j.f56916e, q1VarL6, r14);
                                        y2.h hVar6 = y2.j.f56918g;
                                        if (r14.S || !kotlin.jvm.internal.m.a(r14.Q(), Integer.valueOf(iHashCode6))) {
                                            defpackage.e.A(iHashCode6, r14, iHashCode6, hVar6);
                                        }
                                        l1.t.J(y2.j.f56915d, rVarC6, r14);
                                        String str7 = (String) list11.get(0);
                                        String str8 = (String) list11.get(1);
                                        boolean zH7 = r14.h(aVar2) | r14.h(list11);
                                        Object objQ7 = r14.Q();
                                        final int i24 = 3;
                                        Object obj17 = objQ7;
                                        if (zH7 || objQ7 == obj14) {
                                            fz.a aVar6 = new fz.a() { // from class: dl.k
                                                @Override // fz.a
                                                public final Object invoke() {
                                                    int i25 = i24;
                                                    b0 b0Var3 = b0.f48488a;
                                                    List list12 = list11;
                                                    gl.a aVar7 = aVar2;
                                                    switch (i25) {
                                                        case 0:
                                                            int i26 = GRKSyllableIntroductionActivity.H;
                                                            aVar7.a((String) list12.get(1));
                                                            break;
                                                        case 1:
                                                            int i27 = GRKSyllableIntroductionActivity.H;
                                                            aVar7.a((String) list12.get(0));
                                                            break;
                                                        case 2:
                                                            int i28 = GRKSyllableIntroductionActivity.H;
                                                            aVar7.a((String) list12.get(0));
                                                            break;
                                                        default:
                                                            int i29 = GRKSyllableIntroductionActivity.H;
                                                            aVar7.a((String) list12.get(1));
                                                            break;
                                                    }
                                                    return b0Var3;
                                                }
                                            };
                                            r14.o0(aVar6);
                                            obj17 = aVar6;
                                        }
                                        r16.s(str7, str8, (fz.a) obj17, r14, 6);
                                        List listSubList4 = list11.subList(2, list11.size());
                                        boolean zH8 = r14.h(aVar2);
                                        Object objQ8 = r14.Q();
                                        if (zH8 || objQ8 == obj14) {
                                            objQ8 = new fz.c() { // from class: dl.l
                                                @Override // fz.c
                                                public final Object invoke(Object obj18) {
                                                    int i25 = i24;
                                                    b0 b0Var3 = b0.f48488a;
                                                    gl.a aVar7 = aVar2;
                                                    String it3 = (String) obj18;
                                                    switch (i25) {
                                                        case 0:
                                                            int i26 = GRKSyllableIntroductionActivity.H;
                                                            kotlin.jvm.internal.m.f(it3, "it");
                                                            aVar7.a(it3);
                                                            break;
                                                        case 1:
                                                            int i27 = GRKSyllableIntroductionActivity.H;
                                                            kotlin.jvm.internal.m.f(it3, "it");
                                                            aVar7.a(it3);
                                                            break;
                                                        case 2:
                                                            int i28 = GRKSyllableIntroductionActivity.H;
                                                            kotlin.jvm.internal.m.f(it3, "it");
                                                            aVar7.a(it3);
                                                            break;
                                                        default:
                                                            int i29 = GRKSyllableIntroductionActivity.H;
                                                            kotlin.jvm.internal.m.f(it3, "it");
                                                            aVar7.a(it3);
                                                            break;
                                                    }
                                                    return b0Var3;
                                                }
                                            };
                                            r14.o0(objQ8);
                                        }
                                        r16.t(listSubList4, (fz.c) objQ8, r14, 6);
                                        r14.p(true);
                                        r18 = 0;
                                    }
                                    r14.p(r18);
                                    r14.p(true);
                                } else {
                                    r14.W();
                                }
                                break;
                        }
                        return b0Var2;
                    }
                }, true, -243967456), 5);
                final int i15 = 1;
                m0.j.p(LazyVerticalGrid, new y1(6), new t1.d(new fz.f() { // from class: dl.f
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v1, types: [com.lingo.lingoskill.grkskill.ui.learn.GRKSyllableIntroductionActivity] */
                    /* JADX WARN: Type inference failed for: r14v5, types: [l1.n, l1.s] */
                    /* JADX WARN: Type inference failed for: r15v16, types: [boolean] */
                    /* JADX WARN: Type inference failed for: r15v17, types: [boolean, int] */
                    /* JADX WARN: Type inference failed for: r15v2 */
                    /* JADX WARN: Type inference failed for: r15v20 */
                    /* JADX WARN: Type inference failed for: r15v24 */
                    /* JADX WARN: Type inference failed for: r15v3, types: [boolean, int] */
                    /* JADX WARN: Type inference failed for: r15v5 */
                    /* JADX WARN: Type inference failed for: r24v1, types: [com.lingo.lingoskill.grkskill.ui.learn.GRKSyllableIntroductionActivity] */
                    /* JADX WARN: Type inference failed for: r3v2, types: [l1.n, l1.s] */
                    /* JADX WARN: Type inference failed for: r3v6, types: [com.lingo.lingoskill.grkskill.ui.learn.GRKSyllableIntroductionActivity] */
                    /* JADX WARN: Type inference failed for: r4v12 */
                    /* JADX WARN: Type inference failed for: r4v25 */
                    /* JADX WARN: Type inference failed for: r4v5, types: [com.lingo.lingoskill.grkskill.ui.learn.GRKSyllableIntroductionActivity] */
                    /* JADX WARN: Type inference failed for: r4v6 */
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
                    @Override // fz.f
                    public final Object invoke(Object obj10, Object obj11, Object obj12) {
                        boolean z13;
                        final int i16;
                        Object obj13;
                        int i17 = i15;
                        b0 b0Var2 = b0.f48488a;
                        Object obj14 = l1.m.f39353a;
                        final gl.a aVar2 = aVar;
                        List<List> list6 = list5;
                        List<List> list7 = list4;
                        o oVar = o.f58481a;
                        int i18 = 0;
                        switch (i17) {
                            case 0:
                                m0.l item = (m0.l) obj10;
                                l1.n nVar = (l1.n) obj11;
                                int iIntValue = ((Integer) obj12).intValue();
                                int i19 = GRKSyllableIntroductionActivity.H;
                                z1.i iVar = z1.c.L;
                                kotlin.jvm.internal.m.f(item, "$this$item");
                                ?? r9 = (s) nVar;
                                if (r9.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    u uVarA = t.a(j0.i.f35305c, z1.c.O, r9, 0);
                                    int iHashCode = Long.hashCode(r9.T);
                                    q1 q1VarL = r9.l();
                                    r rVarC = z1.a.c(r9, oVar);
                                    y2.k.J.getClass();
                                    y2.i iVar2 = y2.j.f56913b;
                                    r9.h0();
                                    if (r9.S) {
                                        r9.k(iVar2);
                                    } else {
                                        r9.r0();
                                    }
                                    l1.t.J(y2.j.f56917f, uVarA, r9);
                                    l1.t.J(y2.j.f56916e, q1VarL, r9);
                                    y2.h hVar = y2.j.f56918g;
                                    if (r9.S || !kotlin.jvm.internal.m.a(r9.Q(), Integer.valueOf(iHashCode))) {
                                        defpackage.e.A(iHashCode, r9, iHashCode, hVar);
                                    }
                                    l1.t.J(y2.j.f56915d, rVarC, r9);
                                    String strE0 = ub.a.e0(r9, R.string.grk_alp_section_content_3);
                                    ?? r11 = gRKSyllableIntroductionActivity;
                                    r11.v(strE0, r9, 0);
                                    j0.c.g(r9, e2.g(oVar, 8));
                                    r9.d0(304584760);
                                    ?? r12 = r11;
                                    for (final List list8 : list7) {
                                        a2 a2VarA = z1.a(j0.i.f35303a, iVar, r9, 0);
                                        int iHashCode2 = Long.hashCode(r9.T);
                                        q1 q1VarL2 = r9.l();
                                        r rVarC2 = z1.a.c(r9, oVar);
                                        y2.k.J.getClass();
                                        y2.i iVar3 = y2.j.f56913b;
                                        r9.h0();
                                        if (r9.S) {
                                            r9.k(iVar3);
                                        } else {
                                            r9.r0();
                                        }
                                        l1.t.J(y2.j.f56917f, a2VarA, r9);
                                        l1.t.J(y2.j.f56916e, q1VarL2, r9);
                                        y2.h hVar2 = y2.j.f56918g;
                                        if (r9.S || !kotlin.jvm.internal.m.a(r9.Q(), Integer.valueOf(iHashCode2))) {
                                            defpackage.e.A(iHashCode2, r9, iHashCode2, hVar2);
                                        }
                                        l1.t.J(y2.j.f56915d, rVarC2, r9);
                                        String str = (String) list8.get(0);
                                        String str2 = (String) list8.get(1);
                                        boolean zH = r9.h(aVar2) | r9.h(list8);
                                        Object objQ = r9.Q();
                                        Object obj15 = objQ;
                                        if (zH || objQ == obj14) {
                                            final int i110 = 0;
                                            fz.a aVar3 = new fz.a() { // from class: dl.k
                                                @Override // fz.a
                                                public final Object invoke() {
                                                    int i25 = i110;
                                                    b0 b0Var3 = b0.f48488a;
                                                    List list12 = list8;
                                                    gl.a aVar7 = aVar2;
                                                    switch (i25) {
                                                        case 0:
                                                            int i26 = GRKSyllableIntroductionActivity.H;
                                                            aVar7.a((String) list12.get(1));
                                                            break;
                                                        case 1:
                                                            int i27 = GRKSyllableIntroductionActivity.H;
                                                            aVar7.a((String) list12.get(0));
                                                            break;
                                                        case 2:
                                                            int i28 = GRKSyllableIntroductionActivity.H;
                                                            aVar7.a((String) list12.get(0));
                                                            break;
                                                        default:
                                                            int i29 = GRKSyllableIntroductionActivity.H;
                                                            aVar7.a((String) list12.get(1));
                                                            break;
                                                    }
                                                    return b0Var3;
                                                }
                                            };
                                            r9.o0(aVar3);
                                            obj15 = aVar3;
                                        }
                                        ?? r24 = r12;
                                        r24.s(str, str2, (fz.a) obj15, r9, 6);
                                        List listSubList = list8.subList(2, list8.size());
                                        boolean zH2 = r9.h(aVar2);
                                        Object objQ2 = r9.Q();
                                        if (zH2 || objQ2 == obj14) {
                                            final int i21 = 0;
                                            objQ2 = new fz.c() { // from class: dl.l
                                                @Override // fz.c
                                                public final Object invoke(Object obj18) {
                                                    int i25 = i21;
                                                    b0 b0Var3 = b0.f48488a;
                                                    gl.a aVar7 = aVar2;
                                                    String it3 = (String) obj18;
                                                    switch (i25) {
                                                        case 0:
                                                            int i26 = GRKSyllableIntroductionActivity.H;
                                                            kotlin.jvm.internal.m.f(it3, "it");
                                                            aVar7.a(it3);
                                                            break;
                                                        case 1:
                                                            int i27 = GRKSyllableIntroductionActivity.H;
                                                            kotlin.jvm.internal.m.f(it3, "it");
                                                            aVar7.a(it3);
                                                            break;
                                                        case 2:
                                                            int i28 = GRKSyllableIntroductionActivity.H;
                                                            kotlin.jvm.internal.m.f(it3, "it");
                                                            aVar7.a(it3);
                                                            break;
                                                        default:
                                                            int i29 = GRKSyllableIntroductionActivity.H;
                                                            kotlin.jvm.internal.m.f(it3, "it");
                                                            aVar7.a(it3);
                                                            break;
                                                    }
                                                    return b0Var3;
                                                }
                                            };
                                            r9.o0(objQ2);
                                        }
                                        r24.t(listSubList, (fz.c) objQ2, r9, 6);
                                        r9.p(true);
                                        r12 = r24;
                                    }
                                    ?? r13 = r12;
                                    ?? r15 = 0;
                                    r9.p(false);
                                    r13.u(ub.a.e0(r9, R.string.grk_alp_section_content_4), r9, 0);
                                    r9.d0(304602104);
                                    for (final List list9 : list6) {
                                        a2 a2VarA2 = z1.a(j0.i.f35303a, iVar, r9, r15);
                                        int iHashCode3 = Long.hashCode(r9.T);
                                        q1 q1VarL3 = r9.l();
                                        r rVarC3 = z1.a.c(r9, oVar);
                                        y2.k.J.getClass();
                                        y2.i iVar4 = y2.j.f56913b;
                                        r9.h0();
                                        if (r9.S) {
                                            r9.k(iVar4);
                                        } else {
                                            r9.r0();
                                        }
                                        l1.t.J(y2.j.f56917f, a2VarA2, r9);
                                        l1.t.J(y2.j.f56916e, q1VarL3, r9);
                                        y2.h hVar3 = y2.j.f56918g;
                                        if (r9.S || !kotlin.jvm.internal.m.a(r9.Q(), Integer.valueOf(iHashCode3))) {
                                            defpackage.e.A(iHashCode3, r9, iHashCode3, hVar3);
                                        }
                                        l1.t.J(y2.j.f56915d, rVarC3, r9);
                                        String str3 = (String) list9.get(0);
                                        String str4 = (String) list9.get(1);
                                        boolean zH3 = r9.h(aVar2) | r9.h(list9);
                                        Object objQ3 = r9.Q();
                                        Object obj16 = objQ3;
                                        if (zH3 || objQ3 == obj14) {
                                            final int i22 = 1;
                                            fz.a aVar4 = new fz.a() { // from class: dl.k
                                                @Override // fz.a
                                                public final Object invoke() {
                                                    int i25 = i22;
                                                    b0 b0Var3 = b0.f48488a;
                                                    List list12 = list9;
                                                    gl.a aVar7 = aVar2;
                                                    switch (i25) {
                                                        case 0:
                                                            int i26 = GRKSyllableIntroductionActivity.H;
                                                            aVar7.a((String) list12.get(1));
                                                            break;
                                                        case 1:
                                                            int i27 = GRKSyllableIntroductionActivity.H;
                                                            aVar7.a((String) list12.get(0));
                                                            break;
                                                        case 2:
                                                            int i28 = GRKSyllableIntroductionActivity.H;
                                                            aVar7.a((String) list12.get(0));
                                                            break;
                                                        default:
                                                            int i29 = GRKSyllableIntroductionActivity.H;
                                                            aVar7.a((String) list12.get(1));
                                                            break;
                                                    }
                                                    return b0Var3;
                                                }
                                            };
                                            r9.o0(aVar4);
                                            obj16 = aVar4;
                                        }
                                        r13.s(str3, str4, (fz.a) obj16, r9, 6);
                                        List listSubList2 = list9.subList(2, list9.size());
                                        boolean zH4 = r9.h(aVar2);
                                        Object objQ4 = r9.Q();
                                        if (zH4 || objQ4 == obj14) {
                                            z13 = true;
                                            final int z14 = true ? 1 : 0;
                                            objQ4 = new fz.c() { // from class: dl.l
                                                @Override // fz.c
                                                public final Object invoke(Object obj18) {
                                                    int i25 = z14;
                                                    b0 b0Var3 = b0.f48488a;
                                                    gl.a aVar7 = aVar2;
                                                    String it3 = (String) obj18;
                                                    switch (i25) {
                                                        case 0:
                                                            int i26 = GRKSyllableIntroductionActivity.H;
                                                            kotlin.jvm.internal.m.f(it3, "it");
                                                            aVar7.a(it3);
                                                            break;
                                                        case 1:
                                                            int i27 = GRKSyllableIntroductionActivity.H;
                                                            kotlin.jvm.internal.m.f(it3, "it");
                                                            aVar7.a(it3);
                                                            break;
                                                        case 2:
                                                            int i28 = GRKSyllableIntroductionActivity.H;
                                                            kotlin.jvm.internal.m.f(it3, "it");
                                                            aVar7.a(it3);
                                                            break;
                                                        default:
                                                            int i29 = GRKSyllableIntroductionActivity.H;
                                                            kotlin.jvm.internal.m.f(it3, "it");
                                                            aVar7.a(it3);
                                                            break;
                                                    }
                                                    return b0Var3;
                                                }
                                            };
                                            r9.o0(objQ4);
                                        } else {
                                            z13 = true;
                                        }
                                        r13.t(listSubList2, (fz.c) objQ4, r9, 6);
                                        r9.p(z13);
                                        r15 = 0;
                                    }
                                    r9.p(r15);
                                    r9.p(true);
                                } else {
                                    r9.W();
                                }
                                break;
                            default:
                                m0.l item2 = (m0.l) obj10;
                                l1.n nVar2 = (l1.n) obj11;
                                int iIntValue2 = ((Integer) obj12).intValue();
                                int i23 = GRKSyllableIntroductionActivity.H;
                                z1.i iVar5 = z1.c.L;
                                kotlin.jvm.internal.m.f(item2, "$this$item");
                                ?? r14 = (s) nVar2;
                                if (r14.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                    u uVarA2 = t.a(j0.i.f35305c, z1.c.O, r14, 0);
                                    int iHashCode4 = Long.hashCode(r14.T);
                                    q1 q1VarL4 = r14.l();
                                    r rVarC4 = z1.a.c(r14, oVar);
                                    y2.k.J.getClass();
                                    y2.i iVar6 = y2.j.f56913b;
                                    r14.h0();
                                    if (r14.S) {
                                        r14.k(iVar6);
                                    } else {
                                        r14.r0();
                                    }
                                    l1.t.J(y2.j.f56917f, uVarA2, r14);
                                    l1.t.J(y2.j.f56916e, q1VarL4, r14);
                                    y2.h hVar4 = y2.j.f56918g;
                                    if (r14.S || !kotlin.jvm.internal.m.a(r14.Q(), Integer.valueOf(iHashCode4))) {
                                        defpackage.e.A(iHashCode4, r14, iHashCode4, hVar4);
                                    }
                                    l1.t.J(y2.j.f56915d, rVarC4, r14);
                                    String strE1 = ub.a.e0(r14, R.string.grk_alp_section_content_5);
                                    ?? r16 = gRKSyllableIntroductionActivity;
                                    r16.v(strE1, r14, 0);
                                    j0.c.g(r14, e2.g(oVar, 8));
                                    r14.d0(-663376073);
                                    Iterator it = list7.iterator();
                                    while (it.hasNext()) {
                                        final List list10 = (List) it.next();
                                        a2 a2VarA3 = z1.a(j0.i.f35303a, iVar5, r14, i18);
                                        int iHashCode5 = Long.hashCode(r14.T);
                                        q1 q1VarL5 = r14.l();
                                        r rVarC5 = z1.a.c(r14, oVar);
                                        y2.k.J.getClass();
                                        y2.i iVar7 = y2.j.f56913b;
                                        r14.h0();
                                        Iterator it2 = it;
                                        if (r14.S) {
                                            r14.k(iVar7);
                                        } else {
                                            r14.r0();
                                        }
                                        l1.t.J(y2.j.f56917f, a2VarA3, r14);
                                        l1.t.J(y2.j.f56916e, q1VarL5, r14);
                                        y2.h hVar5 = y2.j.f56918g;
                                        if (r14.S || !kotlin.jvm.internal.m.a(r14.Q(), Integer.valueOf(iHashCode5))) {
                                            defpackage.e.A(iHashCode5, r14, iHashCode5, hVar5);
                                        }
                                        l1.t.J(y2.j.f56915d, rVarC5, r14);
                                        String str5 = (String) list10.get(0);
                                        String str6 = (String) list10.get(1);
                                        boolean zH5 = r14.h(aVar2) | r14.h(list10);
                                        Object objQ5 = r14.Q();
                                        if (zH5 || objQ5 == obj14) {
                                            i16 = 2;
                                            fz.a aVar5 = new fz.a() { // from class: dl.k
                                                @Override // fz.a
                                                public final Object invoke() {
                                                    int i25 = i16;
                                                    b0 b0Var3 = b0.f48488a;
                                                    List list12 = list10;
                                                    gl.a aVar7 = aVar2;
                                                    switch (i25) {
                                                        case 0:
                                                            int i26 = GRKSyllableIntroductionActivity.H;
                                                            aVar7.a((String) list12.get(1));
                                                            break;
                                                        case 1:
                                                            int i27 = GRKSyllableIntroductionActivity.H;
                                                            aVar7.a((String) list12.get(0));
                                                            break;
                                                        case 2:
                                                            int i28 = GRKSyllableIntroductionActivity.H;
                                                            aVar7.a((String) list12.get(0));
                                                            break;
                                                        default:
                                                            int i29 = GRKSyllableIntroductionActivity.H;
                                                            aVar7.a((String) list12.get(1));
                                                            break;
                                                    }
                                                    return b0Var3;
                                                }
                                            };
                                            r14.o0(aVar5);
                                            obj13 = aVar5;
                                        } else {
                                            i16 = 2;
                                            obj13 = objQ5;
                                        }
                                        r16.s(str5, str6, (fz.a) obj13, r14, 6);
                                        List listSubList3 = list10.subList(i16, list10.size());
                                        boolean zH6 = r14.h(aVar2);
                                        Object objQ6 = r14.Q();
                                        if (zH6 || objQ6 == obj14) {
                                            objQ6 = new fz.c() { // from class: dl.l
                                                @Override // fz.c
                                                public final Object invoke(Object obj18) {
                                                    int i25 = i16;
                                                    b0 b0Var3 = b0.f48488a;
                                                    gl.a aVar7 = aVar2;
                                                    String it3 = (String) obj18;
                                                    switch (i25) {
                                                        case 0:
                                                            int i26 = GRKSyllableIntroductionActivity.H;
                                                            kotlin.jvm.internal.m.f(it3, "it");
                                                            aVar7.a(it3);
                                                            break;
                                                        case 1:
                                                            int i27 = GRKSyllableIntroductionActivity.H;
                                                            kotlin.jvm.internal.m.f(it3, "it");
                                                            aVar7.a(it3);
                                                            break;
                                                        case 2:
                                                            int i28 = GRKSyllableIntroductionActivity.H;
                                                            kotlin.jvm.internal.m.f(it3, "it");
                                                            aVar7.a(it3);
                                                            break;
                                                        default:
                                                            int i29 = GRKSyllableIntroductionActivity.H;
                                                            kotlin.jvm.internal.m.f(it3, "it");
                                                            aVar7.a(it3);
                                                            break;
                                                    }
                                                    return b0Var3;
                                                }
                                            };
                                            r14.o0(objQ6);
                                        }
                                        r16.t(listSubList3, (fz.c) objQ6, r14, 6);
                                        r14.p(true);
                                        it = it2;
                                        i18 = 0;
                                    }
                                    ?? r17 = i18;
                                    r14.p(r17);
                                    r16.q(ub.a.e0(r14, R.string.grk_alp_section_content_6), r14, r17 == true ? 1 : 0);
                                    r16.u(ub.a.e0(r14, R.string.grk_alp_section_content_7), r14, r17 == true ? 1 : 0);
                                    r14.d0(-663355721);
                                    ?? r18 = r17;
                                    for (final List list11 : list6) {
                                        a2 a2VarA4 = z1.a(j0.i.f35303a, iVar5, r14, r18);
                                        int iHashCode6 = Long.hashCode(r14.T);
                                        q1 q1VarL6 = r14.l();
                                        r rVarC6 = z1.a.c(r14, oVar);
                                        y2.k.J.getClass();
                                        y2.i iVar8 = y2.j.f56913b;
                                        r14.h0();
                                        if (r14.S) {
                                            r14.k(iVar8);
                                        } else {
                                            r14.r0();
                                        }
                                        l1.t.J(y2.j.f56917f, a2VarA4, r14);
                                        l1.t.J(y2.j.f56916e, q1VarL6, r14);
                                        y2.h hVar6 = y2.j.f56918g;
                                        if (r14.S || !kotlin.jvm.internal.m.a(r14.Q(), Integer.valueOf(iHashCode6))) {
                                            defpackage.e.A(iHashCode6, r14, iHashCode6, hVar6);
                                        }
                                        l1.t.J(y2.j.f56915d, rVarC6, r14);
                                        String str7 = (String) list11.get(0);
                                        String str8 = (String) list11.get(1);
                                        boolean zH7 = r14.h(aVar2) | r14.h(list11);
                                        Object objQ7 = r14.Q();
                                        final int i24 = 3;
                                        Object obj17 = objQ7;
                                        if (zH7 || objQ7 == obj14) {
                                            fz.a aVar6 = new fz.a() { // from class: dl.k
                                                @Override // fz.a
                                                public final Object invoke() {
                                                    int i25 = i24;
                                                    b0 b0Var3 = b0.f48488a;
                                                    List list12 = list11;
                                                    gl.a aVar7 = aVar2;
                                                    switch (i25) {
                                                        case 0:
                                                            int i26 = GRKSyllableIntroductionActivity.H;
                                                            aVar7.a((String) list12.get(1));
                                                            break;
                                                        case 1:
                                                            int i27 = GRKSyllableIntroductionActivity.H;
                                                            aVar7.a((String) list12.get(0));
                                                            break;
                                                        case 2:
                                                            int i28 = GRKSyllableIntroductionActivity.H;
                                                            aVar7.a((String) list12.get(0));
                                                            break;
                                                        default:
                                                            int i29 = GRKSyllableIntroductionActivity.H;
                                                            aVar7.a((String) list12.get(1));
                                                            break;
                                                    }
                                                    return b0Var3;
                                                }
                                            };
                                            r14.o0(aVar6);
                                            obj17 = aVar6;
                                        }
                                        r16.s(str7, str8, (fz.a) obj17, r14, 6);
                                        List listSubList4 = list11.subList(2, list11.size());
                                        boolean zH8 = r14.h(aVar2);
                                        Object objQ8 = r14.Q();
                                        if (zH8 || objQ8 == obj14) {
                                            objQ8 = new fz.c() { // from class: dl.l
                                                @Override // fz.c
                                                public final Object invoke(Object obj18) {
                                                    int i25 = i24;
                                                    b0 b0Var3 = b0.f48488a;
                                                    gl.a aVar7 = aVar2;
                                                    String it3 = (String) obj18;
                                                    switch (i25) {
                                                        case 0:
                                                            int i26 = GRKSyllableIntroductionActivity.H;
                                                            kotlin.jvm.internal.m.f(it3, "it");
                                                            aVar7.a(it3);
                                                            break;
                                                        case 1:
                                                            int i27 = GRKSyllableIntroductionActivity.H;
                                                            kotlin.jvm.internal.m.f(it3, "it");
                                                            aVar7.a(it3);
                                                            break;
                                                        case 2:
                                                            int i28 = GRKSyllableIntroductionActivity.H;
                                                            kotlin.jvm.internal.m.f(it3, "it");
                                                            aVar7.a(it3);
                                                            break;
                                                        default:
                                                            int i29 = GRKSyllableIntroductionActivity.H;
                                                            kotlin.jvm.internal.m.f(it3, "it");
                                                            aVar7.a(it3);
                                                            break;
                                                    }
                                                    return b0Var3;
                                                }
                                            };
                                            r14.o0(objQ8);
                                        }
                                        r16.t(listSubList4, (fz.c) objQ8, r14, 6);
                                        r14.p(true);
                                        r18 = 0;
                                    }
                                    r14.p(r18);
                                    r14.p(true);
                                } else {
                                    r14.W();
                                }
                                break;
                        }
                        return b0Var2;
                    }
                }, true, -414806913), 5);
                return b0Var;
            case 1:
                View view = (View) obj8;
                ImageView imageView = (ImageView) obj7;
                ImageView imageView2 = (ImageView) obj6;
                ViewPager2 viewPager2 = (ViewPager2) obj5;
                EditText editText = (EditText) obj4;
                View it = (View) obj;
                kotlin.jvm.internal.m.f(it, "it");
                kotlin.jvm.internal.m.c(view);
                kotlin.jvm.internal.m.c(imageView);
                kotlin.jvm.internal.m.c(imageView2);
                kotlin.jvm.internal.m.c(viewPager2);
                kotlin.jvm.internal.m.c(editText);
                ((hh.t) obj9).v(view, imageView, imageView2, viewPager2, editText, (ArrayList) obj3);
                return b0Var;
            case 2:
                SpeakTryAdapter speakTryAdapter = (SpeakTryAdapter) obj9;
                View view2 = (View) obj8;
                String str = (String) obj7;
                View view3 = (View) obj4;
                PodSentence podSentence = (PodSentence) obj3;
                View it2 = (View) obj;
                kotlin.jvm.internal.m.f(it2, "it");
                speakTryAdapter.h();
                th.e eVar = speakTryAdapter.f22014a;
                speakTryAdapter.g(view2, str);
                ((FrameLayout) obj6).setBackgroundResource(R.drawable.point_accent);
                android.support.v4.media.session.a.K(((ImageView) obj5).getBackground());
                view3.setVisibility(0);
                ij.d dVar = speakTryAdapter.f22023j;
                if (dVar != null) {
                    dVar.d();
                }
                ij.d dVar2 = new ij.d(23);
                dVar2.f34423d = view3;
                dVar2.f34421b = 2000;
                dVar2.E();
                speakTryAdapter.f22023j = dVar2;
                xq.c cVar = new xq.c(speakTryAdapter, view2, str, 13);
                eVar.getClass();
                eVar.f52416c = cVar;
                String strO = xt.b.a().o();
                LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                Env envN = x.n();
                int i16 = speakTryAdapter.f22017d;
                kotlin.jvm.internal.m.c(podSentence);
                String strM = md.a.m(envN, i16, podSentence.getSid());
                kotlin.jvm.internal.m.c(strM);
                String strM2 = defpackage.e.m(strO, strM);
                eVar.m(x.n().audioSpeed / 100.0f, false);
                eVar.h(strM2);
                View viewFindViewById = view2.findViewById(R.id.fl_sentence);
                kotlin.jvm.internal.m.e(viewFindViewById, "findViewById(...)");
                FlexboxLayout flexboxLayout = (FlexboxLayout) viewFindViewById;
                rx.b bVar = speakTryAdapter.f22019f;
                if (bVar != null) {
                    bVar.dispose();
                }
                List<WordAccuracyScoreTimingResult> wordScores = podSentence.getWordScores();
                boolean z13 = wordScores != null && (wordScores.isEmpty() ^ true);
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                dy.j jVar = ky.e.f38937b;
                p pVarG = qx.h.d(150L, 150L, timeUnit, jVar).k(jVar).g(px.b.a());
                bq.f fVar = new bq.f();
                fVar.f4944b = speakTryAdapter;
                fVar.f4945c = flexboxLayout;
                fVar.f4946d = podSentence;
                fVar.f4943a = z13;
                speakTryAdapter.f22019f = pVarG.h(fVar, io.b.f34497b);
                return b0Var;
            case 3:
                SpeakTryAdapter speakTryAdapter2 = (SpeakTryAdapter) obj9;
                View it3 = (View) obj;
                kotlin.jvm.internal.m.f(it3, "it");
                x2 x2Var = new x2();
                x2Var.f48709a = speakTryAdapter2;
                x2Var.f48711c = (WaveView) obj8;
                x2Var.f48712d = (FrameLayout) obj7;
                x2Var.f48713e = (FrameLayout) obj6;
                x2Var.f48714f = (String) obj5;
                x2Var.f48710b = (View) obj4;
                x2Var.f48715t = (PodSentence) obj3;
                k0 k0Var = speakTryAdapter2.f22016c;
                RxPermissions rxPermissions = new RxPermissions(k0Var.requireActivity());
                Context contextRequireContext = k0Var.requireContext();
                kotlin.jvm.internal.m.e(contextRequireContext, "requireContext(...)");
                rxPermissions.setLogging(true);
                if (rxPermissions.isGranted("android.permission.RECORD_AUDIO") && rxPermissions.isGranted("android.permission.RECORD_AUDIO")) {
                    x2Var.m();
                } else {
                    rxPermissions.request("android.permission.RECORD_AUDIO").h(new xq.c(x2Var, contextRequireContext, rxPermissions, 17), vx.b.f54316e);
                }
                return b0Var;
            case 4:
                List list6 = (List) obj9;
                final HINDISyllableIntroductionActivity hINDISyllableIntroductionActivity = (HINDISyllableIntroductionActivity) obj4;
                ml.a aVar2 = (ml.a) obj3;
                m0.j LazyVerticalGrid2 = (m0.j) obj;
                int i17 = HINDISyllableIntroductionActivity.K;
                kotlin.jvm.internal.m.f(LazyVerticalGrid2, "$this$LazyVerticalGrid");
                final int i18 = 0;
                m0.j.p(LazyVerticalGrid2, new a0(4), new t1.d(new fz.f() { // from class: jl.g
                    @Override // fz.f
                    public final Object invoke(Object obj10, Object obj11, Object obj12) {
                        int i19 = i18;
                        b0 b0Var2 = b0.f48488a;
                        o oVar = o.f58481a;
                        HINDISyllableIntroductionActivity hINDISyllableIntroductionActivity2 = hINDISyllableIntroductionActivity;
                        l item = (l) obj10;
                        n nVar = (n) obj11;
                        int iIntValue = ((Integer) obj12).intValue();
                        switch (i19) {
                            case 0:
                                int i21 = HINDISyllableIntroductionActivity.K;
                                m.f(item, "$this$item");
                                s sVar = (s) nVar;
                                if (!sVar.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    sVar.W();
                                } else {
                                    u uVarA = t.a(j0.i.f35305c, z1.c.O, sVar, 0);
                                    int iHashCode = Long.hashCode(sVar.T);
                                    q1 q1VarL = sVar.l();
                                    r rVarC = z1.a.c(sVar, oVar);
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
                                    if (sVar.S || !m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                                        defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                                    }
                                    l1.t.J(y2.j.f56915d, rVarC, sVar);
                                    hINDISyllableIntroductionActivity2.q(ub.a.e0(sVar, R.string.hindi_alp_section_content_1), sVar, 0);
                                    hINDISyllableIntroductionActivity2.q(ub.a.e0(sVar, R.string.hindi_alp_section_content_2), sVar, 0);
                                    hINDISyllableIntroductionActivity2.v(ub.a.e0(sVar, R.string.hindi_alp_section_content_3), sVar, 0);
                                    ep.a.C(oVar, 8, sVar, true);
                                }
                                break;
                            default:
                                int i22 = HINDISyllableIntroductionActivity.K;
                                m.f(item, "$this$item");
                                s sVar2 = (s) nVar;
                                if (!sVar2.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    sVar2.W();
                                } else {
                                    u uVarA2 = t.a(j0.i.f35305c, z1.c.O, sVar2, 0);
                                    int iHashCode2 = Long.hashCode(sVar2.T);
                                    q1 q1VarL2 = sVar2.l();
                                    r rVarC2 = z1.a.c(sVar2, oVar);
                                    y2.k.J.getClass();
                                    y2.i iVar2 = y2.j.f56913b;
                                    sVar2.h0();
                                    if (sVar2.S) {
                                        sVar2.k(iVar2);
                                    } else {
                                        sVar2.r0();
                                    }
                                    l1.t.J(y2.j.f56917f, uVarA2, sVar2);
                                    l1.t.J(y2.j.f56916e, q1VarL2, sVar2);
                                    y2.h hVar2 = y2.j.f56918g;
                                    if (sVar2.S || !m.a(sVar2.Q(), Integer.valueOf(iHashCode2))) {
                                        defpackage.e.A(iHashCode2, sVar2, iHashCode2, hVar2);
                                    }
                                    l1.t.J(y2.j.f56915d, rVarC2, sVar2);
                                    hINDISyllableIntroductionActivity2.v(ub.a.e0(sVar2, R.string.hindi_alp_section_content_4), sVar2, 0);
                                    ep.a.C(oVar, 8, sVar2, true);
                                }
                                break;
                        }
                        return b0Var2;
                    }
                }, true, 624018515), 5);
                m0.j.p(LazyVerticalGrid2, new a0(7), new t1.d(new jl.f((List) obj8, hINDISyllableIntroductionActivity, aVar2), true, -1799285380), 5);
                a0 a0Var = new a0(8);
                final char c13 = c12 == true ? 1 : 0;
                m0.j.p(LazyVerticalGrid2, a0Var, new t1.d(new fz.f() { // from class: jl.g
                    @Override // fz.f
                    public final Object invoke(Object obj10, Object obj11, Object obj12) {
                        int i19 = c13;
                        b0 b0Var2 = b0.f48488a;
                        o oVar = o.f58481a;
                        HINDISyllableIntroductionActivity hINDISyllableIntroductionActivity2 = hINDISyllableIntroductionActivity;
                        l item = (l) obj10;
                        n nVar = (n) obj11;
                        int iIntValue = ((Integer) obj12).intValue();
                        switch (i19) {
                            case 0:
                                int i21 = HINDISyllableIntroductionActivity.K;
                                m.f(item, "$this$item");
                                s sVar = (s) nVar;
                                if (!sVar.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    sVar.W();
                                } else {
                                    u uVarA = t.a(j0.i.f35305c, z1.c.O, sVar, 0);
                                    int iHashCode = Long.hashCode(sVar.T);
                                    q1 q1VarL = sVar.l();
                                    r rVarC = z1.a.c(sVar, oVar);
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
                                    if (sVar.S || !m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                                        defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                                    }
                                    l1.t.J(y2.j.f56915d, rVarC, sVar);
                                    hINDISyllableIntroductionActivity2.q(ub.a.e0(sVar, R.string.hindi_alp_section_content_1), sVar, 0);
                                    hINDISyllableIntroductionActivity2.q(ub.a.e0(sVar, R.string.hindi_alp_section_content_2), sVar, 0);
                                    hINDISyllableIntroductionActivity2.v(ub.a.e0(sVar, R.string.hindi_alp_section_content_3), sVar, 0);
                                    ep.a.C(oVar, 8, sVar, true);
                                }
                                break;
                            default:
                                int i22 = HINDISyllableIntroductionActivity.K;
                                m.f(item, "$this$item");
                                s sVar2 = (s) nVar;
                                if (!sVar2.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    sVar2.W();
                                } else {
                                    u uVarA2 = t.a(j0.i.f35305c, z1.c.O, sVar2, 0);
                                    int iHashCode2 = Long.hashCode(sVar2.T);
                                    q1 q1VarL2 = sVar2.l();
                                    r rVarC2 = z1.a.c(sVar2, oVar);
                                    y2.k.J.getClass();
                                    y2.i iVar2 = y2.j.f56913b;
                                    sVar2.h0();
                                    if (sVar2.S) {
                                        sVar2.k(iVar2);
                                    } else {
                                        sVar2.r0();
                                    }
                                    l1.t.J(y2.j.f56917f, uVarA2, sVar2);
                                    l1.t.J(y2.j.f56916e, q1VarL2, sVar2);
                                    y2.h hVar2 = y2.j.f56918g;
                                    if (sVar2.S || !m.a(sVar2.Q(), Integer.valueOf(iHashCode2))) {
                                        defpackage.e.A(iHashCode2, sVar2, iHashCode2, hVar2);
                                    }
                                    l1.t.J(y2.j.f56915d, rVarC2, sVar2);
                                    hINDISyllableIntroductionActivity2.v(ub.a.e0(sVar2, R.string.hindi_alp_section_content_4), sVar2, 0);
                                    ep.a.C(oVar, 8, sVar2, true);
                                }
                                break;
                        }
                        return b0Var2;
                    }
                }, true, -1935312677), 5);
                int i19 = 2;
                LazyVerticalGrid2.q(list6.size(), null, null, new p0(9, list6), new t1.d(new n(list6, hINDISyllableIntroductionActivity, aVar2, i19), true, -1117249557));
                m0.j.p(LazyVerticalGrid2, new a0(9), new t1.d(new jl.f(hINDISyllableIntroductionActivity, (List) obj7, aVar2, i19), true, -2071339974), 5);
                m0.j.p(LazyVerticalGrid2, new a0(10), new t1.d(new jl.f(hINDISyllableIntroductionActivity, (List) obj6, aVar2, i12), true, 2087600025), 5);
                m0.j.p(LazyVerticalGrid2, new a0(5), new t1.d(new jl.f(hINDISyllableIntroductionActivity, (List) obj5, aVar2, 0), true, 1951572728), 5);
                m0.j.p(LazyVerticalGrid2, new a0(6), new t1.d(new jl.d(hINDISyllableIntroductionActivity, aVar2, c11 == true ? 1 : 0), true, 1815545431), 5);
                return b0Var;
            case 5:
                c0 c0Var = (c0) obj9;
                k9.i iVar = (k9.i) obj8;
                fz.c cVar2 = (fz.c) obj7;
                fz.c cVar3 = (fz.c) obj6;
                fz.c cVar4 = (fz.c) obj5;
                b1 b1Var = (b1) obj3;
                y yVar = (y) obj;
                if (!((List) ((b3) obj4).getValue()).contains(yVar.a())) {
                    l1 l1Var = l1.f131b;
                    m1 m1Var = m1.f141b;
                    int i21 = a0.o.f152b;
                    return new a0.p0(l1Var, m1Var);
                }
                String str2 = ((j9.e) yVar.a()).f36192f;
                int iB = c0Var.b(str2);
                if (iB >= 0) {
                    f5 = c0Var.f56672c[iB];
                } else {
                    c0Var.d(str2, CropImageView.DEFAULT_ASPECT_RATIO);
                    f5 = 0.0f;
                }
                if (!kotlin.jvm.internal.m.a(((j9.e) yVar.c()).f36192f, ((j9.e) yVar.a()).f36192f)) {
                    f5 = (((Boolean) iVar.f37982c.getValue()).booleanValue() || ((Boolean) b1Var.getValue()).booleanValue()) ? f5 - 1.0f : f5 + 1.0f;
                }
                c0Var.d(((j9.e) yVar.c()).f36192f, f5);
                return new a0.p0((l1) cVar2.invoke(yVar), (m1) cVar3.invoke(yVar), f5, (a0.z1) cVar4.invoke(yVar));
            case 6:
                final rz.b0 b0Var2 = (rz.b0) obj9;
                final b1 b1Var2 = (b1) obj8;
                final b1 b1Var3 = (b1) obj7;
                final b1 b1Var4 = (b1) obj6;
                final b1 b1Var5 = (b1) obj5;
                final b1 b1Var6 = (b1) obj4;
                final b1 b1Var7 = (b1) obj3;
                final RiveAnimationView riveView = (RiveAnimationView) obj;
                kotlin.jvm.internal.m.f(riveView, "riveView");
                final int scaledTouchSlop = ViewConfiguration.get(riveView.getContext()).getScaledTouchSlop();
                riveView.setOnTouchListener(new View.OnTouchListener() { // from class: mt.u3
                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view4, MotionEvent motionEvent) {
                        if (((Boolean) b1Var2.getValue()).booleanValue()) {
                            int action = motionEvent.getAction();
                            RiveAnimationView riveAnimationView = riveView;
                            l1.b1 b1Var8 = b1Var3;
                            l1.b1 b1Var9 = b1Var4;
                            l1.b1 b1Var10 = b1Var5;
                            if (action == 0) {
                                long jCurrentTimeMillis = System.currentTimeMillis();
                                if (jCurrentTimeMillis - ((Number) b1Var8.getValue()).longValue() < 1300) {
                                    b1Var10.setValue(Boolean.FALSE);
                                    return true;
                                }
                                b1Var9.setValue(Long.valueOf(jCurrentTimeMillis));
                                riveAnimationView.setBooleanState("InLesson", "Boolean 1", true);
                                b1Var10.setValue(Boolean.TRUE);
                                return true;
                            }
                            if (action == 1) {
                                rz.e0.B(b0Var2, null, null, new b0.x0(b1Var10, b1Var6, b1Var8, b1Var9, b1Var7, (vy.d) null, 18), 3);
                                return true;
                            }
                            if (action == 2) {
                                float x11 = motionEvent.getX();
                                int i22 = scaledTouchSlop;
                                float f11 = -i22;
                                boolean z14 = x11 >= f11 && motionEvent.getX() <= ((float) (view4.getWidth() + i22));
                                boolean z15 = motionEvent.getY() >= f11 && motionEvent.getY() <= ((float) (view4.getHeight() + i22));
                                if ((!z14 || !z15) && ((Boolean) b1Var10.getValue()).booleanValue()) {
                                    b1Var10.setValue(Boolean.FALSE);
                                    riveAnimationView.setBooleanState("InLesson", "Boolean 1", false);
                                }
                            } else {
                                if (action == 3) {
                                    b1Var10.setValue(Boolean.FALSE);
                                    riveAnimationView.setBooleanState("InLesson", "Boolean 1", false);
                                    return true;
                                }
                                if (action == 4 && ((Boolean) b1Var10.getValue()).booleanValue()) {
                                    b1Var10.setValue(Boolean.FALSE);
                                    riveAnimationView.setBooleanState("InLesson", "Boolean 1", false);
                                    return true;
                                }
                            }
                        }
                        return true;
                    }
                });
                return b0Var;
            case 7:
                List list7 = (List) obj9;
                g8 g8Var = (g8) obj8;
                fz.c cVar5 = (fz.c) obj7;
                b1 b1Var8 = (b1) obj6;
                b1 b1Var9 = (b1) obj5;
                b1 b1Var10 = (b1) obj4;
                b1 b1Var11 = (b1) obj3;
                WordSentenceCharacterType contentType = (WordSentenceCharacterType) obj;
                kotlin.jvm.internal.m.f(contentType, "contentType");
                if (list7.isEmpty()) {
                    z11 = false;
                } else {
                    Iterator it4 = list7.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            z11 = false;
                        } else if (!((l0) it4.next()).f50006e) {
                            z11 = true;
                        }
                    }
                }
                nz.g gVar = new nz.g(nz.n.T(ry.m.g0(((f8) g8Var).f49746e), new b6(0)));
                while (gVar.hasNext()) {
                    Object next = gVar.next();
                    if (((k6) next).f49973d.equals(contentType)) {
                        obj2 = next;
                        k6Var = (k6) obj2;
                        if (k6Var == null && k6Var.f49974e) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (z12 && z11) {
                            b1Var8.setValue(contentType);
                            b1Var9.setValue(Boolean.FALSE);
                        } else if (z12) {
                            cVar5.invoke(contentType);
                        } else {
                            cVar5.invoke(contentType);
                            b1Var10.setValue(contentType);
                            b1Var11.setValue(Boolean.TRUE);
                        }
                        return b0Var;
                    }
                }
                k6Var = (k6) obj2;
                if (k6Var == null) {
                    z12 = false;
                } else {
                    z12 = false;
                }
                if (z12) {
                    if (z12) {
                        cVar5.invoke(contentType);
                    } else {
                        cVar5.invoke(contentType);
                        b1Var10.setValue(contentType);
                        b1Var11.setValue(Boolean.TRUE);
                    }
                } else if (z12) {
                    cVar5.invoke(contentType);
                } else {
                    cVar5.invoke(contentType);
                    b1Var10.setValue(contentType);
                    b1Var11.setValue(Boolean.TRUE);
                }
                return b0Var;
            case 8:
                l0.h LazyColumn = (l0.h) obj;
                kotlin.jvm.internal.m.f(LazyColumn, "$this$LazyColumn");
                l0.h.p(LazyColumn, null, new t1.d(new ei.l((hu.j) obj9, (b1) obj8, (b1) obj7, (fz.a) obj6, (fz.a) obj5, (fz.a) obj4, (fz.a) obj3, 5), true, -1906799089), 3);
                return b0Var;
            case 9:
                final bb bbVar = (bb) obj9;
                final fz.a aVar3 = (fz.a) obj8;
                final v vVar = (v) obj7;
                final b3 b3Var = (b3) obj6;
                final b3 b3Var2 = (b3) obj5;
                j9.t NavHost = (j9.t) obj;
                kotlin.jvm.internal.m.f(NavHost, "$this$NavHost");
                final int i22 = 0;
                c.a.g(NavHost, "course_dialogue_speaking", null, null, new t1.d(new fz.g() { // from class: ys.h0
                    @Override // fz.g
                    public final Object f(Object obj10, Object obj11, Object obj12, Object obj13) {
                        a0.r rVar = (a0.r) obj10;
                        j9.e eVar2 = (j9.e) obj11;
                        l1.n nVar = (l1.n) obj12;
                        Integer num = (Integer) obj13;
                        switch (i22) {
                            case 0:
                                ep.a.A(num, rVar, "$this$composable", eVar2, "it");
                                l1.s sVar = (l1.s) nVar;
                                final bb bbVar2 = bbVar;
                                boolean zH = sVar.h(bbVar2);
                                Object objQ = sVar.Q();
                                if (zH || objQ == l1.m.f39353a) {
                                    final int i23 = 1;
                                    objQ = new fz.c() { // from class: ys.i0
                                        @Override // fz.c
                                        public final Object invoke(Object obj14) {
                                            int i24 = i23;
                                            long jLongValue = ((Long) obj14).longValue();
                                            switch (i24) {
                                                case 0:
                                                    bb bbVar3 = bbVar2;
                                                    rz.e0.B(ViewModelKt.getViewModelScope(bbVar3), null, null, new f0.z1(2, jLongValue, bbVar3, null), 3);
                                                    break;
                                                default:
                                                    bb bbVar4 = bbVar2;
                                                    rz.e0.B(ViewModelKt.getViewModelScope(bbVar4), null, null, new f0.z1(2, jLongValue, bbVar4, null), 3);
                                                    break;
                                            }
                                            return qy.b0.f48488a;
                                        }
                                    };
                                    sVar.o0(objQ);
                                }
                                final int i24 = 1;
                                final fz.a aVar4 = aVar3;
                                final j9.v vVar2 = vVar;
                                final l1.b3 b3Var3 = b3Var;
                                final l1.b3 b3Var4 = b3Var2;
                                o3.a((fz.c) objQ, null, t1.e.d(-205568554, new fz.e() { // from class: ys.j0
                                    @Override // fz.e
                                    public final Object invoke(Object obj14, Object obj15) {
                                        switch (i24) {
                                            case 0:
                                                l1.n nVar2 = (l1.n) obj14;
                                                int iIntValue = ((Integer) obj15).intValue();
                                                l1.s sVar2 = (l1.s) nVar2;
                                                if (sVar2.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                                                    ta taVar = (ta) b3Var3.getValue();
                                                    CoursePracticeType coursePracticeType = CoursePracticeType.COURSE_DIALOG_PRACTICE;
                                                    qa qaVar = (qa) b3Var4.getValue();
                                                    final bb bbVar3 = bbVar2;
                                                    boolean zH2 = sVar2.h(bbVar3);
                                                    Object objQ2 = sVar2.Q();
                                                    l1.g gVar2 = l1.m.f39353a;
                                                    if (zH2 || objQ2 == gVar2) {
                                                        c4 c4Var = new c4(1, bbVar3, bb.class, "updateRuntimeState", "updateRuntimeState(Lcom/lingodeer/course/viewmodels/CourseTestDialogueRuntimeState;)V", 0, 23);
                                                        sVar2.o0(c4Var);
                                                        objQ2 = c4Var;
                                                    }
                                                    fz.c cVar6 = (fz.c) ((mz.e) objQ2);
                                                    boolean zH3 = sVar2.h(bbVar3);
                                                    Object objQ3 = sVar2.Q();
                                                    if (zH3 || objQ3 == gVar2) {
                                                        final int i25 = 1;
                                                        objQ3 = new fz.a() { // from class: ys.f0
                                                            @Override // fz.a
                                                            public final Object invoke() {
                                                                switch (i25) {
                                                                    case 0:
                                                                        bbVar3.c(oa.f50210a);
                                                                        break;
                                                                    default:
                                                                        bbVar3.c(na.f50145a);
                                                                        break;
                                                                }
                                                                return qy.b0.f48488a;
                                                            }
                                                        };
                                                        sVar2.o0(objQ3);
                                                    }
                                                    fz.a aVar5 = (fz.a) objQ3;
                                                    fz.a aVar6 = aVar4;
                                                    boolean zF = sVar2.f(aVar6);
                                                    Object objQ4 = sVar2.Q();
                                                    if (zF || objQ4 == gVar2) {
                                                        objQ4 = new xu.r1(20, aVar6);
                                                        sVar2.o0(objQ4);
                                                    }
                                                    fz.a aVar7 = (fz.a) objQ4;
                                                    j9.v vVar3 = vVar2;
                                                    boolean zH4 = sVar2.h(vVar3);
                                                    Object objQ5 = sVar2.Q();
                                                    if (zH4 || objQ5 == gVar2) {
                                                        objQ5 = new j9.g(vVar3, 24);
                                                        sVar2.o0(objQ5);
                                                    }
                                                    a.p(taVar, coursePracticeType, qaVar, cVar6, aVar5, aVar7, (fz.a) objQ5, sVar2, 48);
                                                } else {
                                                    sVar2.W();
                                                }
                                                break;
                                            default:
                                                l1.n nVar3 = (l1.n) obj14;
                                                int iIntValue2 = ((Integer) obj15).intValue();
                                                l1.s sVar3 = (l1.s) nVar3;
                                                if (sVar3.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                                    ta taVar2 = (ta) b3Var3.getValue();
                                                    CoursePracticeType coursePracticeType2 = CoursePracticeType.COURSE_DIALOG_SPEAKING;
                                                    qa qaVar2 = (qa) b3Var4.getValue();
                                                    final bb bbVar4 = bbVar2;
                                                    boolean zH5 = sVar3.h(bbVar4);
                                                    Object objQ6 = sVar3.Q();
                                                    l1.g gVar3 = l1.m.f39353a;
                                                    if (zH5 || objQ6 == gVar3) {
                                                        c4 c4Var2 = new c4(1, bbVar4, bb.class, "updateRuntimeState", "updateRuntimeState(Lcom/lingodeer/course/viewmodels/CourseTestDialogueRuntimeState;)V", 0, 22);
                                                        sVar3.o0(c4Var2);
                                                        objQ6 = c4Var2;
                                                    }
                                                    fz.c cVar7 = (fz.c) ((mz.e) objQ6);
                                                    boolean zH6 = sVar3.h(bbVar4);
                                                    Object objQ7 = sVar3.Q();
                                                    if (zH6 || objQ7 == gVar3) {
                                                        final int i26 = 0;
                                                        objQ7 = new fz.a() { // from class: ys.f0
                                                            @Override // fz.a
                                                            public final Object invoke() {
                                                                switch (i26) {
                                                                    case 0:
                                                                        bbVar4.c(oa.f50210a);
                                                                        break;
                                                                    default:
                                                                        bbVar4.c(na.f50145a);
                                                                        break;
                                                                }
                                                                return qy.b0.f48488a;
                                                            }
                                                        };
                                                        sVar3.o0(objQ7);
                                                    }
                                                    fz.a aVar8 = (fz.a) objQ7;
                                                    fz.a aVar9 = aVar4;
                                                    boolean zF2 = sVar3.f(aVar9);
                                                    Object objQ8 = sVar3.Q();
                                                    if (zF2 || objQ8 == gVar3) {
                                                        objQ8 = new xu.r1(19, aVar9);
                                                        sVar3.o0(objQ8);
                                                    }
                                                    fz.a aVar10 = (fz.a) objQ8;
                                                    j9.v vVar4 = vVar2;
                                                    boolean zH7 = sVar3.h(vVar4);
                                                    Object objQ9 = sVar3.Q();
                                                    if (zH7 || objQ9 == gVar3) {
                                                        objQ9 = new j9.g(vVar4, 23);
                                                        sVar3.o0(objQ9);
                                                    }
                                                    a.p(taVar2, coursePracticeType2, qaVar2, cVar7, aVar8, aVar10, (fz.a) objQ9, sVar3, 48);
                                                } else {
                                                    sVar3.W();
                                                }
                                                break;
                                        }
                                        return qy.b0.f48488a;
                                    }
                                }, sVar), sVar, 384);
                                break;
                            default:
                                ep.a.A(num, rVar, "$this$composable", eVar2, "it");
                                l1.s sVar2 = (l1.s) nVar;
                                final bb bbVar3 = bbVar;
                                boolean zH2 = sVar2.h(bbVar3);
                                Object objQ2 = sVar2.Q();
                                if (zH2 || objQ2 == l1.m.f39353a) {
                                    final int i25 = 0;
                                    objQ2 = new fz.c() { // from class: ys.i0
                                        @Override // fz.c
                                        public final Object invoke(Object obj14) {
                                            int i26 = i25;
                                            long jLongValue = ((Long) obj14).longValue();
                                            switch (i26) {
                                                case 0:
                                                    bb bbVar4 = bbVar3;
                                                    rz.e0.B(ViewModelKt.getViewModelScope(bbVar4), null, null, new f0.z1(2, jLongValue, bbVar4, null), 3);
                                                    break;
                                                default:
                                                    bb bbVar5 = bbVar3;
                                                    rz.e0.B(ViewModelKt.getViewModelScope(bbVar5), null, null, new f0.z1(2, jLongValue, bbVar5, null), 3);
                                                    break;
                                            }
                                            return qy.b0.f48488a;
                                        }
                                    };
                                    sVar2.o0(objQ2);
                                }
                                final int i26 = 0;
                                final fz.a aVar5 = aVar3;
                                final j9.v vVar3 = vVar;
                                final l1.b3 b3Var5 = b3Var;
                                final l1.b3 b3Var6 = b3Var2;
                                o3.a((fz.c) objQ2, null, t1.e.d(-1650034483, new fz.e() { // from class: ys.j0
                                    @Override // fz.e
                                    public final Object invoke(Object obj14, Object obj15) {
                                        switch (i26) {
                                            case 0:
                                                l1.n nVar2 = (l1.n) obj14;
                                                int iIntValue = ((Integer) obj15).intValue();
                                                l1.s sVar3 = (l1.s) nVar2;
                                                if (sVar3.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                                                    ta taVar = (ta) b3Var5.getValue();
                                                    CoursePracticeType coursePracticeType = CoursePracticeType.COURSE_DIALOG_PRACTICE;
                                                    qa qaVar = (qa) b3Var6.getValue();
                                                    final bb bbVar4 = bbVar3;
                                                    boolean zH3 = sVar3.h(bbVar4);
                                                    Object objQ3 = sVar3.Q();
                                                    l1.g gVar2 = l1.m.f39353a;
                                                    if (zH3 || objQ3 == gVar2) {
                                                        c4 c4Var = new c4(1, bbVar4, bb.class, "updateRuntimeState", "updateRuntimeState(Lcom/lingodeer/course/viewmodels/CourseTestDialogueRuntimeState;)V", 0, 23);
                                                        sVar3.o0(c4Var);
                                                        objQ3 = c4Var;
                                                    }
                                                    fz.c cVar6 = (fz.c) ((mz.e) objQ3);
                                                    boolean zH4 = sVar3.h(bbVar4);
                                                    Object objQ4 = sVar3.Q();
                                                    if (zH4 || objQ4 == gVar2) {
                                                        final int i27 = 1;
                                                        objQ4 = new fz.a() { // from class: ys.f0
                                                            @Override // fz.a
                                                            public final Object invoke() {
                                                                switch (i27) {
                                                                    case 0:
                                                                        bbVar4.c(oa.f50210a);
                                                                        break;
                                                                    default:
                                                                        bbVar4.c(na.f50145a);
                                                                        break;
                                                                }
                                                                return qy.b0.f48488a;
                                                            }
                                                        };
                                                        sVar3.o0(objQ4);
                                                    }
                                                    fz.a aVar6 = (fz.a) objQ4;
                                                    fz.a aVar7 = aVar5;
                                                    boolean zF = sVar3.f(aVar7);
                                                    Object objQ5 = sVar3.Q();
                                                    if (zF || objQ5 == gVar2) {
                                                        objQ5 = new xu.r1(20, aVar7);
                                                        sVar3.o0(objQ5);
                                                    }
                                                    fz.a aVar8 = (fz.a) objQ5;
                                                    j9.v vVar4 = vVar3;
                                                    boolean zH5 = sVar3.h(vVar4);
                                                    Object objQ6 = sVar3.Q();
                                                    if (zH5 || objQ6 == gVar2) {
                                                        objQ6 = new j9.g(vVar4, 24);
                                                        sVar3.o0(objQ6);
                                                    }
                                                    a.p(taVar, coursePracticeType, qaVar, cVar6, aVar6, aVar8, (fz.a) objQ6, sVar3, 48);
                                                } else {
                                                    sVar3.W();
                                                }
                                                break;
                                            default:
                                                l1.n nVar3 = (l1.n) obj14;
                                                int iIntValue2 = ((Integer) obj15).intValue();
                                                l1.s sVar4 = (l1.s) nVar3;
                                                if (sVar4.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                                    ta taVar2 = (ta) b3Var5.getValue();
                                                    CoursePracticeType coursePracticeType2 = CoursePracticeType.COURSE_DIALOG_SPEAKING;
                                                    qa qaVar2 = (qa) b3Var6.getValue();
                                                    final bb bbVar5 = bbVar3;
                                                    boolean zH6 = sVar4.h(bbVar5);
                                                    Object objQ7 = sVar4.Q();
                                                    l1.g gVar3 = l1.m.f39353a;
                                                    if (zH6 || objQ7 == gVar3) {
                                                        c4 c4Var2 = new c4(1, bbVar5, bb.class, "updateRuntimeState", "updateRuntimeState(Lcom/lingodeer/course/viewmodels/CourseTestDialogueRuntimeState;)V", 0, 22);
                                                        sVar4.o0(c4Var2);
                                                        objQ7 = c4Var2;
                                                    }
                                                    fz.c cVar7 = (fz.c) ((mz.e) objQ7);
                                                    boolean zH7 = sVar4.h(bbVar5);
                                                    Object objQ8 = sVar4.Q();
                                                    if (zH7 || objQ8 == gVar3) {
                                                        final int i28 = 0;
                                                        objQ8 = new fz.a() { // from class: ys.f0
                                                            @Override // fz.a
                                                            public final Object invoke() {
                                                                switch (i28) {
                                                                    case 0:
                                                                        bbVar5.c(oa.f50210a);
                                                                        break;
                                                                    default:
                                                                        bbVar5.c(na.f50145a);
                                                                        break;
                                                                }
                                                                return qy.b0.f48488a;
                                                            }
                                                        };
                                                        sVar4.o0(objQ8);
                                                    }
                                                    fz.a aVar9 = (fz.a) objQ8;
                                                    fz.a aVar10 = aVar5;
                                                    boolean zF2 = sVar4.f(aVar10);
                                                    Object objQ9 = sVar4.Q();
                                                    if (zF2 || objQ9 == gVar3) {
                                                        objQ9 = new xu.r1(19, aVar10);
                                                        sVar4.o0(objQ9);
                                                    }
                                                    fz.a aVar11 = (fz.a) objQ9;
                                                    j9.v vVar5 = vVar3;
                                                    boolean zH8 = sVar4.h(vVar5);
                                                    Object objQ10 = sVar4.Q();
                                                    if (zH8 || objQ10 == gVar3) {
                                                        objQ10 = new j9.g(vVar5, 23);
                                                        sVar4.o0(objQ10);
                                                    }
                                                    a.p(taVar2, coursePracticeType2, qaVar2, cVar7, aVar9, aVar11, (fz.a) objQ10, sVar4, 48);
                                                } else {
                                                    sVar4.W();
                                                }
                                                break;
                                        }
                                        return qy.b0.f48488a;
                                    }
                                }, sVar2), sVar2, 384);
                                break;
                        }
                        return qy.b0.f48488a;
                    }
                }, true, 2116459066), 254);
                final int i23 = 1;
                c.a.g(NavHost, "course_dialogue_practice", null, null, new t1.d(new fz.g() { // from class: ys.h0
                    @Override // fz.g
                    public final Object f(Object obj10, Object obj11, Object obj12, Object obj13) {
                        a0.r rVar = (a0.r) obj10;
                        j9.e eVar2 = (j9.e) obj11;
                        l1.n nVar = (l1.n) obj12;
                        Integer num = (Integer) obj13;
                        switch (i23) {
                            case 0:
                                ep.a.A(num, rVar, "$this$composable", eVar2, "it");
                                l1.s sVar = (l1.s) nVar;
                                final bb bbVar2 = bbVar;
                                boolean zH = sVar.h(bbVar2);
                                Object objQ = sVar.Q();
                                if (zH || objQ == l1.m.f39353a) {
                                    final int i24 = 1;
                                    objQ = new fz.c() { // from class: ys.i0
                                        @Override // fz.c
                                        public final Object invoke(Object obj14) {
                                            int i26 = i24;
                                            long jLongValue = ((Long) obj14).longValue();
                                            switch (i26) {
                                                case 0:
                                                    bb bbVar4 = bbVar2;
                                                    rz.e0.B(ViewModelKt.getViewModelScope(bbVar4), null, null, new f0.z1(2, jLongValue, bbVar4, null), 3);
                                                    break;
                                                default:
                                                    bb bbVar5 = bbVar2;
                                                    rz.e0.B(ViewModelKt.getViewModelScope(bbVar5), null, null, new f0.z1(2, jLongValue, bbVar5, null), 3);
                                                    break;
                                            }
                                            return qy.b0.f48488a;
                                        }
                                    };
                                    sVar.o0(objQ);
                                }
                                final int i25 = 1;
                                final fz.a aVar4 = aVar3;
                                final j9.v vVar2 = vVar;
                                final l1.b3 b3Var3 = b3Var;
                                final l1.b3 b3Var4 = b3Var2;
                                o3.a((fz.c) objQ, null, t1.e.d(-205568554, new fz.e() { // from class: ys.j0
                                    @Override // fz.e
                                    public final Object invoke(Object obj14, Object obj15) {
                                        switch (i25) {
                                            case 0:
                                                l1.n nVar2 = (l1.n) obj14;
                                                int iIntValue = ((Integer) obj15).intValue();
                                                l1.s sVar3 = (l1.s) nVar2;
                                                if (sVar3.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                                                    ta taVar = (ta) b3Var3.getValue();
                                                    CoursePracticeType coursePracticeType = CoursePracticeType.COURSE_DIALOG_PRACTICE;
                                                    qa qaVar = (qa) b3Var4.getValue();
                                                    final bb bbVar4 = bbVar2;
                                                    boolean zH3 = sVar3.h(bbVar4);
                                                    Object objQ3 = sVar3.Q();
                                                    l1.g gVar2 = l1.m.f39353a;
                                                    if (zH3 || objQ3 == gVar2) {
                                                        c4 c4Var = new c4(1, bbVar4, bb.class, "updateRuntimeState", "updateRuntimeState(Lcom/lingodeer/course/viewmodels/CourseTestDialogueRuntimeState;)V", 0, 23);
                                                        sVar3.o0(c4Var);
                                                        objQ3 = c4Var;
                                                    }
                                                    fz.c cVar6 = (fz.c) ((mz.e) objQ3);
                                                    boolean zH4 = sVar3.h(bbVar4);
                                                    Object objQ4 = sVar3.Q();
                                                    if (zH4 || objQ4 == gVar2) {
                                                        final int i27 = 1;
                                                        objQ4 = new fz.a() { // from class: ys.f0
                                                            @Override // fz.a
                                                            public final Object invoke() {
                                                                switch (i27) {
                                                                    case 0:
                                                                        bbVar4.c(oa.f50210a);
                                                                        break;
                                                                    default:
                                                                        bbVar4.c(na.f50145a);
                                                                        break;
                                                                }
                                                                return qy.b0.f48488a;
                                                            }
                                                        };
                                                        sVar3.o0(objQ4);
                                                    }
                                                    fz.a aVar6 = (fz.a) objQ4;
                                                    fz.a aVar7 = aVar4;
                                                    boolean zF = sVar3.f(aVar7);
                                                    Object objQ5 = sVar3.Q();
                                                    if (zF || objQ5 == gVar2) {
                                                        objQ5 = new xu.r1(20, aVar7);
                                                        sVar3.o0(objQ5);
                                                    }
                                                    fz.a aVar8 = (fz.a) objQ5;
                                                    j9.v vVar4 = vVar2;
                                                    boolean zH5 = sVar3.h(vVar4);
                                                    Object objQ6 = sVar3.Q();
                                                    if (zH5 || objQ6 == gVar2) {
                                                        objQ6 = new j9.g(vVar4, 24);
                                                        sVar3.o0(objQ6);
                                                    }
                                                    a.p(taVar, coursePracticeType, qaVar, cVar6, aVar6, aVar8, (fz.a) objQ6, sVar3, 48);
                                                } else {
                                                    sVar3.W();
                                                }
                                                break;
                                            default:
                                                l1.n nVar3 = (l1.n) obj14;
                                                int iIntValue2 = ((Integer) obj15).intValue();
                                                l1.s sVar4 = (l1.s) nVar3;
                                                if (sVar4.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                                    ta taVar2 = (ta) b3Var3.getValue();
                                                    CoursePracticeType coursePracticeType2 = CoursePracticeType.COURSE_DIALOG_SPEAKING;
                                                    qa qaVar2 = (qa) b3Var4.getValue();
                                                    final bb bbVar5 = bbVar2;
                                                    boolean zH6 = sVar4.h(bbVar5);
                                                    Object objQ7 = sVar4.Q();
                                                    l1.g gVar3 = l1.m.f39353a;
                                                    if (zH6 || objQ7 == gVar3) {
                                                        c4 c4Var2 = new c4(1, bbVar5, bb.class, "updateRuntimeState", "updateRuntimeState(Lcom/lingodeer/course/viewmodels/CourseTestDialogueRuntimeState;)V", 0, 22);
                                                        sVar4.o0(c4Var2);
                                                        objQ7 = c4Var2;
                                                    }
                                                    fz.c cVar7 = (fz.c) ((mz.e) objQ7);
                                                    boolean zH7 = sVar4.h(bbVar5);
                                                    Object objQ8 = sVar4.Q();
                                                    if (zH7 || objQ8 == gVar3) {
                                                        final int i28 = 0;
                                                        objQ8 = new fz.a() { // from class: ys.f0
                                                            @Override // fz.a
                                                            public final Object invoke() {
                                                                switch (i28) {
                                                                    case 0:
                                                                        bbVar5.c(oa.f50210a);
                                                                        break;
                                                                    default:
                                                                        bbVar5.c(na.f50145a);
                                                                        break;
                                                                }
                                                                return qy.b0.f48488a;
                                                            }
                                                        };
                                                        sVar4.o0(objQ8);
                                                    }
                                                    fz.a aVar9 = (fz.a) objQ8;
                                                    fz.a aVar10 = aVar4;
                                                    boolean zF2 = sVar4.f(aVar10);
                                                    Object objQ9 = sVar4.Q();
                                                    if (zF2 || objQ9 == gVar3) {
                                                        objQ9 = new xu.r1(19, aVar10);
                                                        sVar4.o0(objQ9);
                                                    }
                                                    fz.a aVar11 = (fz.a) objQ9;
                                                    j9.v vVar5 = vVar2;
                                                    boolean zH8 = sVar4.h(vVar5);
                                                    Object objQ10 = sVar4.Q();
                                                    if (zH8 || objQ10 == gVar3) {
                                                        objQ10 = new j9.g(vVar5, 23);
                                                        sVar4.o0(objQ10);
                                                    }
                                                    a.p(taVar2, coursePracticeType2, qaVar2, cVar7, aVar9, aVar11, (fz.a) objQ10, sVar4, 48);
                                                } else {
                                                    sVar4.W();
                                                }
                                                break;
                                        }
                                        return qy.b0.f48488a;
                                    }
                                }, sVar), sVar, 384);
                                break;
                            default:
                                ep.a.A(num, rVar, "$this$composable", eVar2, "it");
                                l1.s sVar2 = (l1.s) nVar;
                                final bb bbVar3 = bbVar;
                                boolean zH2 = sVar2.h(bbVar3);
                                Object objQ2 = sVar2.Q();
                                if (zH2 || objQ2 == l1.m.f39353a) {
                                    final int i26 = 0;
                                    objQ2 = new fz.c() { // from class: ys.i0
                                        @Override // fz.c
                                        public final Object invoke(Object obj14) {
                                            int i27 = i26;
                                            long jLongValue = ((Long) obj14).longValue();
                                            switch (i27) {
                                                case 0:
                                                    bb bbVar4 = bbVar3;
                                                    rz.e0.B(ViewModelKt.getViewModelScope(bbVar4), null, null, new f0.z1(2, jLongValue, bbVar4, null), 3);
                                                    break;
                                                default:
                                                    bb bbVar5 = bbVar3;
                                                    rz.e0.B(ViewModelKt.getViewModelScope(bbVar5), null, null, new f0.z1(2, jLongValue, bbVar5, null), 3);
                                                    break;
                                            }
                                            return qy.b0.f48488a;
                                        }
                                    };
                                    sVar2.o0(objQ2);
                                }
                                final int i27 = 0;
                                final fz.a aVar5 = aVar3;
                                final j9.v vVar3 = vVar;
                                final l1.b3 b3Var5 = b3Var;
                                final l1.b3 b3Var6 = b3Var2;
                                o3.a((fz.c) objQ2, null, t1.e.d(-1650034483, new fz.e() { // from class: ys.j0
                                    @Override // fz.e
                                    public final Object invoke(Object obj14, Object obj15) {
                                        switch (i27) {
                                            case 0:
                                                l1.n nVar2 = (l1.n) obj14;
                                                int iIntValue = ((Integer) obj15).intValue();
                                                l1.s sVar3 = (l1.s) nVar2;
                                                if (sVar3.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                                                    ta taVar = (ta) b3Var5.getValue();
                                                    CoursePracticeType coursePracticeType = CoursePracticeType.COURSE_DIALOG_PRACTICE;
                                                    qa qaVar = (qa) b3Var6.getValue();
                                                    final bb bbVar4 = bbVar3;
                                                    boolean zH3 = sVar3.h(bbVar4);
                                                    Object objQ3 = sVar3.Q();
                                                    l1.g gVar2 = l1.m.f39353a;
                                                    if (zH3 || objQ3 == gVar2) {
                                                        c4 c4Var = new c4(1, bbVar4, bb.class, "updateRuntimeState", "updateRuntimeState(Lcom/lingodeer/course/viewmodels/CourseTestDialogueRuntimeState;)V", 0, 23);
                                                        sVar3.o0(c4Var);
                                                        objQ3 = c4Var;
                                                    }
                                                    fz.c cVar6 = (fz.c) ((mz.e) objQ3);
                                                    boolean zH4 = sVar3.h(bbVar4);
                                                    Object objQ4 = sVar3.Q();
                                                    if (zH4 || objQ4 == gVar2) {
                                                        final int i28 = 1;
                                                        objQ4 = new fz.a() { // from class: ys.f0
                                                            @Override // fz.a
                                                            public final Object invoke() {
                                                                switch (i28) {
                                                                    case 0:
                                                                        bbVar4.c(oa.f50210a);
                                                                        break;
                                                                    default:
                                                                        bbVar4.c(na.f50145a);
                                                                        break;
                                                                }
                                                                return qy.b0.f48488a;
                                                            }
                                                        };
                                                        sVar3.o0(objQ4);
                                                    }
                                                    fz.a aVar6 = (fz.a) objQ4;
                                                    fz.a aVar7 = aVar5;
                                                    boolean zF = sVar3.f(aVar7);
                                                    Object objQ5 = sVar3.Q();
                                                    if (zF || objQ5 == gVar2) {
                                                        objQ5 = new xu.r1(20, aVar7);
                                                        sVar3.o0(objQ5);
                                                    }
                                                    fz.a aVar8 = (fz.a) objQ5;
                                                    j9.v vVar4 = vVar3;
                                                    boolean zH5 = sVar3.h(vVar4);
                                                    Object objQ6 = sVar3.Q();
                                                    if (zH5 || objQ6 == gVar2) {
                                                        objQ6 = new j9.g(vVar4, 24);
                                                        sVar3.o0(objQ6);
                                                    }
                                                    a.p(taVar, coursePracticeType, qaVar, cVar6, aVar6, aVar8, (fz.a) objQ6, sVar3, 48);
                                                } else {
                                                    sVar3.W();
                                                }
                                                break;
                                            default:
                                                l1.n nVar3 = (l1.n) obj14;
                                                int iIntValue2 = ((Integer) obj15).intValue();
                                                l1.s sVar4 = (l1.s) nVar3;
                                                if (sVar4.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                                    ta taVar2 = (ta) b3Var5.getValue();
                                                    CoursePracticeType coursePracticeType2 = CoursePracticeType.COURSE_DIALOG_SPEAKING;
                                                    qa qaVar2 = (qa) b3Var6.getValue();
                                                    final bb bbVar5 = bbVar3;
                                                    boolean zH6 = sVar4.h(bbVar5);
                                                    Object objQ7 = sVar4.Q();
                                                    l1.g gVar3 = l1.m.f39353a;
                                                    if (zH6 || objQ7 == gVar3) {
                                                        c4 c4Var2 = new c4(1, bbVar5, bb.class, "updateRuntimeState", "updateRuntimeState(Lcom/lingodeer/course/viewmodels/CourseTestDialogueRuntimeState;)V", 0, 22);
                                                        sVar4.o0(c4Var2);
                                                        objQ7 = c4Var2;
                                                    }
                                                    fz.c cVar7 = (fz.c) ((mz.e) objQ7);
                                                    boolean zH7 = sVar4.h(bbVar5);
                                                    Object objQ8 = sVar4.Q();
                                                    if (zH7 || objQ8 == gVar3) {
                                                        final int i29 = 0;
                                                        objQ8 = new fz.a() { // from class: ys.f0
                                                            @Override // fz.a
                                                            public final Object invoke() {
                                                                switch (i29) {
                                                                    case 0:
                                                                        bbVar5.c(oa.f50210a);
                                                                        break;
                                                                    default:
                                                                        bbVar5.c(na.f50145a);
                                                                        break;
                                                                }
                                                                return qy.b0.f48488a;
                                                            }
                                                        };
                                                        sVar4.o0(objQ8);
                                                    }
                                                    fz.a aVar9 = (fz.a) objQ8;
                                                    fz.a aVar10 = aVar5;
                                                    boolean zF2 = sVar4.f(aVar10);
                                                    Object objQ9 = sVar4.Q();
                                                    if (zF2 || objQ9 == gVar3) {
                                                        objQ9 = new xu.r1(19, aVar10);
                                                        sVar4.o0(objQ9);
                                                    }
                                                    fz.a aVar11 = (fz.a) objQ9;
                                                    j9.v vVar5 = vVar3;
                                                    boolean zH8 = sVar4.h(vVar5);
                                                    Object objQ10 = sVar4.Q();
                                                    if (zH8 || objQ10 == gVar3) {
                                                        objQ10 = new j9.g(vVar5, 23);
                                                        sVar4.o0(objQ10);
                                                    }
                                                    a.p(taVar2, coursePracticeType2, qaVar2, cVar7, aVar9, aVar11, (fz.a) objQ10, sVar4, 48);
                                                } else {
                                                    sVar4.W();
                                                }
                                                break;
                                        }
                                        return qy.b0.f48488a;
                                    }
                                }, sVar2), sVar2, 384);
                                break;
                        }
                        return qy.b0.f48488a;
                    }
                }, true, 730481713), 254);
                c.a.g(NavHost, "course_dialogue_finish", null, null, new t1.d(new br.u(bbVar, (CoursePracticeType) obj4, aVar3, (fz.c) obj3, 10), true, -2011398222), 254);
                return b0Var;
            default:
                mb mbVar = (mb) obj9;
                j9.t NavHost2 = (j9.t) obj;
                kotlin.jvm.internal.m.f(NavHost2, "$this$NavHost");
                c.a.g(NavHost2, "course_test", null, null, new t1.d(new fu.d(mbVar, (l9) obj8, (fz.c) obj7, (fz.a) obj6, (v) obj5, 6), true, -1143872312), 254);
                c.a.g(NavHost2, "course_test_finish", null, null, new t1.d(new b2(mbVar, (fz.a) obj4, (fz.c) obj3, 16), true, 1837689649), 254);
                return b0Var;
        }
    }

    public /* synthetic */ d(List list, GRKSyllableIntroductionActivity gRKSyllableIntroductionActivity, gl.a aVar, List list2, List list3, List list4, List list5) {
        this.f23442a = 0;
        this.f23443b = list;
        this.f23448t = gRKSyllableIntroductionActivity;
        this.H = aVar;
        this.f23444c = list2;
        this.f23445d = list3;
        this.f23446e = list4;
        this.f23447f = list5;
    }

    public /* synthetic */ d(List list, HINDISyllableIntroductionActivity hINDISyllableIntroductionActivity, List list2, ml.a aVar, List list3, List list4, List list5) {
        this.f23442a = 4;
        this.f23443b = list;
        this.f23448t = hINDISyllableIntroductionActivity;
        this.f23444c = list2;
        this.H = aVar;
        this.f23445d = list3;
        this.f23446e = list4;
        this.f23447f = list5;
    }
}
