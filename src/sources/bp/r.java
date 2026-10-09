package bp;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.google.android.flexbox.FlexboxLayout;
import com.lingo.lingoskill.object.Word;
import com.lingo.lingoskill.ui.base.LoginActivity;
import com.lingo.lingoskill.ukrskill.ui.learn.UKRSyllableIntroductionActivity;
import com.lingodeer.R;
import j0.a2;
import j0.e2;
import j0.i1;
import j0.t;
import j0.u;
import j0.z1;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import l1.m;
import l1.n;
import l1.q1;
import l1.s;
import m0.l;
import qy.b0;
import y2.k;
import z1.o;
import z1.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class r implements fz.c {
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4781b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4782c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f4783d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f4784e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f4785f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f4786t;

    public /* synthetic */ r(iv.f0 f0Var, fz.a aVar, j9.v vVar, fz.a aVar2, mv.d0 d0Var, mv.g0 g0Var, fz.a aVar3, fz.c cVar) {
        this.f4780a = 2;
        this.f4782c = f0Var;
        this.K = aVar;
        this.f4783d = vVar;
        this.f4784e = aVar2;
        this.f4781b = d0Var;
        this.f4785f = g0Var;
        this.H = aVar3;
        this.f4786t = cVar;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x012a  */
    @Override // fz.c
    public final Object invoke(Object obj) {
        qp.d5 d5Var;
        int i11 = this.f4780a;
        int i12 = 12;
        int i13 = 7;
        qy.b0 b0Var = qy.b0.f48488a;
        Object obj2 = this.K;
        Object obj3 = this.H;
        Object obj4 = this.f4786t;
        Object obj5 = this.f4785f;
        Object obj6 = this.f4781b;
        Object obj7 = this.f4784e;
        Object obj8 = this.f4783d;
        Object obj9 = this.f4782c;
        final int i14 = 1;
        switch (i11) {
            case 0:
                List list = (List) obj9;
                l0.h LazyColumn = (l0.h) obj;
                kotlin.jvm.internal.m.f(LazyColumn, "$this$LazyColumn");
                LazyColumn.q(list.size(), new av.r(i14, new b0.k2(21), list), new p0(1, list), new t1.d(new a1(list, (Map) obj8, (vt.n0) obj7, list, (l1.b1) obj6, (gp.m) obj5, (fz.c) obj4, (Context) obj3), true, 802480018));
                l0.h.p(LazyColumn, null, new t1.d(new u(0, (fz.a) obj2), true, -1296721907), 3);
                return b0Var;
            case 1:
                final Resources resources = (Resources) obj9;
                final LoginActivity loginActivity = (LoginActivity) obj8;
                final j9.v vVar = (j9.v) obj7;
                final l1.b1 b1Var = (l1.b1) obj6;
                final l1.b1 b1Var2 = (l1.b1) obj5;
                final l1.b1 b1Var3 = (l1.b1) obj4;
                final l1.b1 b1Var4 = (l1.b1) obj3;
                final l1.b1 b1Var5 = (l1.b1) obj2;
                j9.t NavHost = (j9.t) obj;
                int i15 = LoginActivity.Q;
                kotlin.jvm.internal.m.f(NavHost, "$this$NavHost");
                c.a.g(NavHost, "login", null, null, new t1.d(new b2(resources, loginActivity, vVar, 0), true, -888002650), 254);
                c.a.g(NavHost, "email_login", null, null, new t1.d(new fz.g() { // from class: bp.c2
                    @Override // fz.g
                    public final Object f(Object obj10, Object obj11, Object obj12, Object obj13) {
                        l1.b1 b1Var6;
                        l1.b1 b1Var7;
                        l1.g gVar;
                        a0.r composable = (a0.r) obj10;
                        j9.e it = (j9.e) obj11;
                        ((Integer) obj13).getClass();
                        int i16 = LoginActivity.Q;
                        kotlin.jvm.internal.m.f(composable, "$this$composable");
                        kotlin.jvm.internal.m.f(it, "it");
                        Resources resources2 = resources;
                        kotlin.jvm.internal.m.c(resources2);
                        l1.b1 b1Var8 = b1Var;
                        String str = (String) b1Var8.getValue();
                        l1.b1 b1Var9 = b1Var2;
                        String str2 = (String) b1Var9.getValue();
                        l1.b1 b1Var10 = b1Var3;
                        boolean zBooleanValue = ((Boolean) b1Var10.getValue()).booleanValue();
                        l1.b1 b1Var11 = b1Var4;
                        boolean zBooleanValue2 = ((Boolean) b1Var11.getValue()).booleanValue();
                        l1.b1 b1Var12 = b1Var5;
                        boolean zBooleanValue3 = ((Boolean) b1Var12.getValue()).booleanValue();
                        l1.s sVar = (l1.s) ((l1.n) obj12);
                        Object objQ = sVar.Q();
                        l1.g gVar2 = l1.m.f39353a;
                        if (objQ == gVar2) {
                            d2 d2Var = new d2(0, b1Var8, b1Var10, b1Var9, b1Var12);
                            b1Var6 = b1Var10;
                            b1Var9 = b1Var9;
                            sVar.o0(d2Var);
                            gVar2 = gVar2;
                            objQ = d2Var;
                        } else {
                            b1Var6 = b1Var10;
                        }
                        fz.c cVar = (fz.c) objQ;
                        Object objQ2 = sVar.Q();
                        if (objQ2 == gVar2) {
                            l1.b1 b1Var13 = b1Var9;
                            gVar = gVar2;
                            d2 d2Var2 = new d2(1, b1Var13, b1Var11, b1Var8, b1Var12);
                            b1Var7 = b1Var11;
                            b1Var9 = b1Var13;
                            b1Var8 = b1Var8;
                            sVar.o0(d2Var2);
                            objQ2 = d2Var2;
                        } else {
                            b1Var7 = b1Var11;
                            gVar = gVar2;
                        }
                        fz.c cVar2 = (fz.c) objQ2;
                        LoginActivity loginActivity2 = loginActivity;
                        boolean zH = sVar.h(loginActivity2);
                        Object objQ3 = sVar.Q();
                        if (zH || objQ3 == gVar) {
                            objQ3 = new w1(loginActivity2, 0);
                            sVar.o0(objQ3);
                        }
                        fz.a aVar = (fz.a) objQ3;
                        boolean zH2 = sVar.h(loginActivity2);
                        Object objQ4 = sVar.Q();
                        if (zH2 || objQ4 == gVar) {
                            x1 x1Var = new x1(loginActivity2, b1Var8, b1Var9, b1Var6, b1Var7, 0);
                            sVar.o0(x1Var);
                            objQ4 = x1Var;
                        }
                        fz.a aVar2 = (fz.a) objQ4;
                        boolean zH3 = sVar.h(loginActivity2);
                        Object objQ5 = sVar.Q();
                        if (zH3 || objQ5 == gVar) {
                            objQ5 = new w1(loginActivity2, 1);
                            sVar.o0(objQ5);
                        }
                        fz.a aVar3 = (fz.a) objQ5;
                        j9.v vVar2 = vVar;
                        boolean zH4 = sVar.h(vVar2) | sVar.h(loginActivity2);
                        Object objQ6 = sVar.Q();
                        if (zH4 || objQ6 == gVar) {
                            objQ6 = new at.f(3, vVar2, loginActivity2);
                            sVar.o0(objQ6);
                        }
                        fz.a aVar4 = (fz.a) objQ6;
                        boolean zH5 = sVar.h(loginActivity2);
                        Object objQ7 = sVar.Q();
                        if (zH5 || objQ7 == gVar) {
                            objQ7 = new w1(loginActivity2, 2);
                            sVar.o0(objQ7);
                        }
                        fz.a aVar5 = (fz.a) objQ7;
                        boolean zH6 = sVar.h(loginActivity2);
                        Object objQ8 = sVar.Q();
                        if (zH6 || objQ8 == gVar) {
                            objQ8 = new w1(loginActivity2, 3);
                            sVar.o0(objQ8);
                        }
                        uu.a.b(str, str2, zBooleanValue, zBooleanValue2, zBooleanValue3, resources2, cVar, cVar2, aVar, aVar2, aVar3, aVar4, aVar5, (fz.a) objQ8, sVar, 14155776);
                        return qy.b0.f48488a;
                    }
                }, true, -636245297), 254);
                return b0Var;
            case 2:
                iv.f0 f0Var = (iv.f0) obj9;
                j9.v vVar2 = (j9.v) obj8;
                mv.d0 d0Var = (mv.d0) obj6;
                mv.g0 g0Var = (mv.g0) obj5;
                j9.t NavHost2 = (j9.t) obj;
                kotlin.jvm.internal.m.f(NavHost2, "$this$NavHost");
                c.a.g(NavHost2, "syllable_index", null, null, new t1.d(new iv.b0(f0Var, (fz.a) obj2, vVar2, (fz.a) obj7, d0Var, g0Var), true, -1067717291), 254);
                c.a.g(NavHost2, "syllable_intro_overview", new in.c(9), new in.c(10), new t1.d(new gr.u(vVar2, (fz.a) obj3, i14), true, -1552091764), 230);
                c.a.g(NavHost2, "syllable_intro_first", new in.c(11), new in.c(i12), new t1.d(new br.u((Object) f0Var, (Object) d0Var, vVar2, (Object) g0Var, 3), true, 611210445), 230);
                c.a.g(NavHost2, "syllable_handwriting_overview", new in.c(13), new in.c(14), new t1.d(new gr.u(f0Var, vVar2), true, -1520454642), 230);
                c.a.g(NavHost2, "syllable_test", new in.c(i13), new in.c(8), new t1.d(new b2((Object) f0Var, vVar2, obj4, 4), true, 642847567), 230);
                return b0Var;
            case 3:
                qp.d5 d5Var2 = (qp.d5) obj9;
                Word word = (Word) obj8;
                ImageView imageView = (ImageView) obj6;
                TextView textView = (TextView) obj5;
                CardView cardView = (CardView) obj4;
                FlexboxLayout flexboxLayout = (FlexboxLayout) obj3;
                View view = (View) obj2;
                View it = (View) obj;
                kotlin.jvm.internal.m.f(it, "it");
                boolean zT = d5Var2.t(word, (String) obj7);
                Context context = d5Var2.f47883c;
                if (zT) {
                    imageView.setImageResource(R.drawable.ic_word_13_right);
                    kotlin.jvm.internal.m.f(context, "context");
                    imageView.setBackgroundColor(context.getColor(R.color.colorAccent));
                    textView.setTextColor(context.getColor(R.color.colorAccent));
                    cardView.setEnabled(true);
                    if (flexboxLayout.indexOfChild(view) != 1) {
                        LayoutTransition layoutTransition = flexboxLayout.getLayoutTransition();
                        qp.c5 c5Var = new qp.c5(flexboxLayout, view, d5Var2, imageView, cardView, textView, word);
                        d5Var = d5Var2;
                        layoutTransition.addTransitionListener(c5Var);
                    } else {
                        List list2 = d5Var2.f47902k;
                        if (list2 == null) {
                            kotlin.jvm.internal.m.n("itemOptions");
                            throw null;
                        }
                        if (list2.size() == 3) {
                            d5Var2.w(imageView, cardView, textView, word);
                            d5Var = d5Var2;
                        } else {
                            LayoutTransition layoutTransition2 = flexboxLayout.getLayoutTransition();
                            qp.c5 c5Var2 = new qp.c5(flexboxLayout, view, d5Var2, imageView, cardView, textView, word);
                            d5Var = d5Var2;
                            layoutTransition2.addTransitionListener(c5Var2);
                        }
                    }
                    int childCount = flexboxLayout.getChildCount();
                    for (int i16 = 0; i16 < childCount; i16++) {
                        if (i16 != flexboxLayout.indexOfChild(view)) {
                            flexboxLayout.getChildAt(i16).setVisibility(8);
                        }
                    }
                    bq.z.b(view, new qp.a5(d5Var, word, 1));
                    cardView.setTag(Boolean.TRUE);
                    ArrayList arrayList = d5Var.f47903l;
                    if (arrayList == null) {
                        kotlin.jvm.internal.m.n("views");
                        throw null;
                    }
                    int size = arrayList.size();
                    boolean zBooleanValue = true;
                    for (int i17 = 0; i17 < size; i17++) {
                        ArrayList arrayList2 = d5Var.f47903l;
                        if (arrayList2 == null) {
                            kotlin.jvm.internal.m.n("views");
                            throw null;
                        }
                        CardView cardView2 = (CardView) arrayList2.get(i17);
                        Object tag = cardView2.getTag();
                        if (tag != null && (tag instanceof Boolean)) {
                            Object tag2 = cardView2.getTag();
                            kotlin.jvm.internal.m.d(tag2, "null cannot be cast to non-null type kotlin.Boolean");
                            zBooleanValue = ((Boolean) tag2).booleanValue();
                        } else {
                            zBooleanValue = false;
                        }
                    }
                    if (zBooleanValue && !d5Var.f47904n) {
                        ((jp.p0) d5Var.f47881a).O(5);
                        d5Var.f47904n = true;
                    }
                } else {
                    imageView.setImageResource(R.drawable.ic_word_13_wrong);
                    kotlin.jvm.internal.m.f(context, "context");
                    imageView.setBackgroundColor(context.getColor(R.color.color_FF6666));
                    textView.setTextColor(context.getColor(R.color.color_FF6666));
                    view.setEnabled(false);
                    cardView.startAnimation(AnimationUtils.loadAnimation(context, R.anim.anim_shake));
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    dy.j jVar = ky.e.f38937b;
                    th.j.a(qx.h.m(300L, timeUnit, jVar).k(jVar).g(px.b.a()).h(new dm.c(imageView, textView, d5Var2, view, 15), qp.c.X), d5Var2.f47887g);
                }
                return b0Var;
            default:
                List list3 = (List) obj9;
                final UKRSyllableIntroductionActivity uKRSyllableIntroductionActivity = (UKRSyllableIntroductionActivity) obj8;
                final aq.b bVar = (aq.b) obj7;
                final List list4 = (List) obj6;
                final List list5 = (List) obj5;
                m0.j LazyVerticalGrid = (m0.j) obj;
                int i18 = UKRSyllableIntroductionActivity.H;
                kotlin.jvm.internal.m.f(LazyVerticalGrid, "$this$LazyVerticalGrid");
                m0.j.p(LazyVerticalGrid, new vr.a(24), new t1.d(new qu.s(uKRSyllableIntroductionActivity, i13), true, -1496058113), 5);
                LazyVerticalGrid.q(list3.size(), null, null, new qu.m(12, list3), new t1.d(new dl.n(list3, uKRSyllableIntroductionActivity, bVar, 9), true, -1117249557));
                final int i19 = 0;
                m0.j.p(LazyVerticalGrid, new vr.a(25), new t1.d(new fz.f() { // from class: xp.e
                    /* JADX WARN: Code duplicated, block: B:147:0x0326 A[SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:23:0x00e8  */
                    /* JADX WARN: Code duplicated, block: B:24:0x00ec  */
                    /* JADX WARN: Code duplicated, block: B:29:0x0107  */
                    /* JADX WARN: Code duplicated, block: B:33:0x0122  */
                    /* JADX WARN: Code duplicated, block: B:36:0x012b  */
                    /* JADX WARN: Code duplicated, block: B:38:0x012f  */
                    /* JADX WARN: Code duplicated, block: B:42:0x0157  */
                    /* JADX WARN: Code duplicated, block: B:45:0x0160  */
                    /* JADX WARN: Code duplicated, block: B:47:0x0164  */
                    /* JADX WARN: Code duplicated, block: B:51:0x024a  */
                    /* JADX WARN: Code duplicated, block: B:53:0x0252  */
                    /* JADX WARN: Code duplicated, block: B:55:0x0277  */
                    /* JADX WARN: Code duplicated, block: B:56:0x027b  */
                    /* JADX WARN: Code duplicated, block: B:61:0x029c  */
                    /* JADX WARN: Code duplicated, block: B:65:0x02cb  */
                    /* JADX WARN: Code duplicated, block: B:71:0x0302  */
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
                        String str;
                        UKRSyllableIntroductionActivity uKRSyllableIntroductionActivity2;
                        aq.b bVar2;
                        int iHashCode;
                        l1.g gVar;
                        float f5;
                        float f11;
                        List listL;
                        int i21;
                        int i22;
                        final List list6;
                        int iHashCode2;
                        y2.i iVar;
                        y2.h hVar;
                        final aq.b bVar3;
                        boolean zH;
                        Object objQ;
                        boolean zH2;
                        Object objQ2;
                        boolean z11;
                        int i23 = i19;
                        l1.g gVar2 = m.f39353a;
                        final aq.b bVar4 = bVar;
                        List list7 = list4;
                        o oVar = o.f58481a;
                        int i24 = 3;
                        switch (i23) {
                            case 0:
                                l item = (l) obj10;
                                n nVar = (n) obj11;
                                int iIntValue = ((Integer) obj12).intValue();
                                int i25 = UKRSyllableIntroductionActivity.H;
                                z1.i iVar2 = z1.c.L;
                                kotlin.jvm.internal.m.f(item, "$this$item");
                                s sVar = (s) nVar;
                                if (sVar.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    u uVarA = t.a(j0.i.f35305c, z1.c.O, sVar, 0);
                                    int iHashCode3 = Long.hashCode(sVar.T);
                                    q1 q1VarL = sVar.l();
                                    r rVarC = z1.a.c(sVar, oVar);
                                    k.J.getClass();
                                    y2.i iVar3 = y2.j.f56913b;
                                    sVar.h0();
                                    if (sVar.S) {
                                        sVar.k(iVar3);
                                    } else {
                                        sVar.r0();
                                    }
                                    y2.h hVar2 = y2.j.f56917f;
                                    l1.t.J(hVar2, uVarA, sVar);
                                    y2.h hVar3 = y2.j.f56916e;
                                    l1.t.J(hVar3, q1VarL, sVar);
                                    y2.h hVar4 = y2.j.f56918g;
                                    if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode3))) {
                                        defpackage.e.A(iHashCode3, sVar, iHashCode3, hVar4);
                                    }
                                    y2.h hVar5 = y2.j.f56915d;
                                    l1.t.J(hVar5, rVarC, sVar);
                                    String strE0 = ub.a.e0(sVar, R.string.ukr_alp_section_content_4);
                                    UKRSyllableIntroductionActivity uKRSyllableIntroductionActivity3 = uKRSyllableIntroductionActivity;
                                    uKRSyllableIntroductionActivity3.w(strE0, sVar, 0);
                                    j0.c.g(sVar, e2.g(oVar, 8));
                                    a2 a2VarA = z1.a(j0.i.f35303a, iVar2, sVar, 0);
                                    l1.g gVar3 = gVar2;
                                    int iHashCode4 = Long.hashCode(sVar.T);
                                    q1 q1VarL2 = sVar.l();
                                    r rVarC2 = z1.a.c(sVar, oVar);
                                    sVar.h0();
                                    if (sVar.S) {
                                        sVar.k(iVar3);
                                    } else {
                                        sVar.r0();
                                    }
                                    l1.t.J(hVar2, a2VarA, sVar);
                                    l1.t.J(hVar3, q1VarL2, sVar);
                                    if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode4))) {
                                        defpackage.e.A(iHashCode4, sVar, iHashCode4, hVar4);
                                    }
                                    l1.t.J(hVar5, rVarC2, sVar);
                                    String strE1 = ub.a.e0(sVar, R.string.ukr_alp_section_content_5);
                                    float f12 = 1;
                                    r rVarA = j0.c.A(oVar, f12);
                                    if (1.0f <= 0.0d) {
                                        k0.a.a("invalid weight; must be greater than zero");
                                    }
                                    float f13 = 42;
                                    uKRSyllableIntroductionActivity3.u(0, strE1, sVar, e2.g(rVarA.i(new i1(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true)), f13));
                                    String strE2 = ub.a.e0(sVar, R.string.ukr_alp_section_content_6);
                                    r rVarA2 = j0.c.A(oVar, f12);
                                    if (2.0f <= 0.0d) {
                                        k0.a.a("invalid weight; must be greater than zero");
                                    }
                                    uKRSyllableIntroductionActivity3.u(0, strE2, sVar, e2.g(rVarA2.i(new i1(2.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 2.0f, true)), f13));
                                    sVar.p(true);
                                    List listL2 = ns.o.L(ns.o.L(0, 3), ns.o.K(1), ns.o.K(0), ns.o.K(1), ns.o.K(1), ns.o.K(0), ns.o.K(0), ns.o.K(0), ns.o.K(0), ns.o.K(0));
                                    sVar.d0(1197243245);
                                    int i26 = 0;
                                    for (Object obj13 : list7) {
                                        int i27 = i26 + 1;
                                        if (i26 < 0) {
                                            ns.o.V();
                                            throw null;
                                        }
                                        final List list8 = (List) obj13;
                                        a2 a2VarA2 = z1.a(j0.i.f35303a, iVar2, sVar, 0);
                                        int iHashCode5 = Long.hashCode(sVar.T);
                                        q1 q1VarL3 = sVar.l();
                                        r rVarC3 = z1.a.c(sVar, oVar);
                                        k.J.getClass();
                                        y2.i iVar4 = y2.j.f56913b;
                                        sVar.h0();
                                        if (sVar.S) {
                                            sVar.k(iVar4);
                                        } else {
                                            sVar.r0();
                                        }
                                        l1.t.J(y2.j.f56917f, a2VarA2, sVar);
                                        l1.t.J(y2.j.f56916e, q1VarL3, sVar);
                                        y2.h hVar6 = y2.j.f56918g;
                                        if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode5))) {
                                            defpackage.e.A(iHashCode5, sVar, iHashCode5, hVar6);
                                        }
                                        l1.t.J(y2.j.f56915d, rVarC3, sVar);
                                        String str2 = (String) list8.get(0);
                                        String str3 = (String) list8.get(1);
                                        boolean zH3 = sVar.h(bVar4) | sVar.h(list8);
                                        Object objQ3 = sVar.Q();
                                        l1.g gVar4 = gVar3;
                                        if (zH3 || objQ3 == gVar4) {
                                            final int i28 = 0;
                                            objQ3 = new fz.a() { // from class: xp.g
                                                @Override // fz.a
                                                public final Object invoke() {
                                                    int i29 = i28;
                                                    b0 b0Var2 = b0.f48488a;
                                                    List list9 = list8;
                                                    aq.b bVar5 = bVar4;
                                                    switch (i29) {
                                                        case 0:
                                                            int i30 = UKRSyllableIntroductionActivity.H;
                                                            bVar5.a((String) list9.get(2));
                                                            break;
                                                        default:
                                                            int i31 = UKRSyllableIntroductionActivity.H;
                                                            bVar5.a((String) list9.get(2));
                                                            break;
                                                    }
                                                    return b0Var2;
                                                }
                                            };
                                            sVar.o0(objQ3);
                                        }
                                        UKRSyllableIntroductionActivity uKRSyllableIntroductionActivity4 = uKRSyllableIntroductionActivity3;
                                        uKRSyllableIntroductionActivity4.s(str2, str3, (fz.a) objQ3, sVar, 6);
                                        List listSubList = list8.subList(3, list8.size());
                                        List list9 = (List) listL2.get(i26);
                                        boolean zH4 = sVar.h(bVar4);
                                        Object objQ4 = sVar.Q();
                                        if (zH4 || objQ4 == gVar4) {
                                            objQ4 = new h(bVar4, 0);
                                            sVar.o0(objQ4);
                                        }
                                        uKRSyllableIntroductionActivity4.t(listSubList, list9, 2.0f, (fz.c) objQ4, sVar, 3078);
                                        sVar.p(true);
                                        i26 = i27;
                                        gVar3 = gVar4;
                                        uKRSyllableIntroductionActivity3 = uKRSyllableIntroductionActivity4;
                                    }
                                    sVar.p(false);
                                    sVar.p(true);
                                } else {
                                    sVar.W();
                                }
                                return b0.f48488a;
                            default:
                                l item2 = (l) obj10;
                                n nVar2 = (n) obj11;
                                int iIntValue2 = ((Integer) obj12).intValue();
                                int i29 = UKRSyllableIntroductionActivity.H;
                                z1.i iVar5 = z1.c.L;
                                kotlin.jvm.internal.m.f(item2, "$this$item");
                                s sVar2 = (s) nVar2;
                                if (sVar2.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                    u uVarA2 = t.a(j0.i.f35305c, z1.c.O, sVar2, 0);
                                    int iHashCode6 = Long.hashCode(sVar2.T);
                                    q1 q1VarL4 = sVar2.l();
                                    r rVarC4 = z1.a.c(sVar2, oVar);
                                    k.J.getClass();
                                    y2.i iVar6 = y2.j.f56913b;
                                    sVar2.h0();
                                    if (sVar2.S) {
                                        sVar2.k(iVar6);
                                    } else {
                                        sVar2.r0();
                                    }
                                    y2.h hVar7 = y2.j.f56917f;
                                    l1.t.J(hVar7, uVarA2, sVar2);
                                    y2.h hVar8 = y2.j.f56916e;
                                    l1.t.J(hVar8, q1VarL4, sVar2);
                                    y2.h hVar9 = y2.j.f56918g;
                                    if (sVar2.S) {
                                        str = "invalid weight; must be greater than zero";
                                    } else {
                                        str = "invalid weight; must be greater than zero";
                                        if (!kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode6))) {
                                        }
                                        y2.h hVar10 = y2.j.f56915d;
                                        l1.t.J(hVar10, rVarC4, sVar2);
                                        String strE3 = ub.a.e0(sVar2, R.string.ukr_alp_section_content_7);
                                        uKRSyllableIntroductionActivity2 = uKRSyllableIntroductionActivity;
                                        uKRSyllableIntroductionActivity2.w(strE3, sVar2, 0);
                                        j0.c.g(sVar2, e2.g(oVar, 8));
                                        a2 a2VarA3 = z1.a(j0.i.f35303a, iVar5, sVar2, 0);
                                        bVar2 = bVar4;
                                        iHashCode = Long.hashCode(sVar2.T);
                                        q1 q1VarL5 = sVar2.l();
                                        gVar = gVar2;
                                        r rVarC5 = z1.a.c(sVar2, oVar);
                                        sVar2.h0();
                                        if (sVar2.S) {
                                            sVar2.k(iVar6);
                                        } else {
                                            sVar2.r0();
                                        }
                                        l1.t.J(hVar7, a2VarA3, sVar2);
                                        l1.t.J(hVar8, q1VarL5, sVar2);
                                        if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode))) {
                                            defpackage.e.A(iHashCode, sVar2, iHashCode, hVar9);
                                        }
                                        l1.t.J(hVar10, rVarC5, sVar2);
                                        String strE4 = ub.a.e0(sVar2, R.string.ukr_alp_section_content_5);
                                        float f14 = 1;
                                        r rVarA3 = j0.c.A(oVar, f14);
                                        if (1.0f <= 0.0d) {
                                            k0.a.a(str);
                                        }
                                        if (1.0f > Float.MAX_VALUE) {
                                            f5 = Float.MAX_VALUE;
                                        } else {
                                            f5 = 1.0f;
                                        }
                                        r rVarI = rVarA3.i(new i1(f5, true));
                                        float f15 = 42;
                                        uKRSyllableIntroductionActivity2.u(0, strE4, sVar2, e2.g(rVarI, f15));
                                        String strE5 = ub.a.e0(sVar2, R.string.ukr_alp_section_content_6);
                                        r rVarA4 = j0.c.A(oVar, f14);
                                        if (2.0f <= 0.0d) {
                                            k0.a.a(str);
                                        }
                                        if (2.0f > Float.MAX_VALUE) {
                                            f11 = Float.MAX_VALUE;
                                        } else {
                                            f11 = 2.0f;
                                        }
                                        uKRSyllableIntroductionActivity2.u(0, strE5, sVar2, e2.g(rVarA4.i(new i1(f11, true)), f15));
                                        sVar2.p(true);
                                        listL = ns.o.L(ns.o.K(0), ns.o.K(0), ns.o.K(0), ns.o.K(0), ns.o.K(0), ns.o.K(0), ns.o.K(0), ns.o.L(2, 5), ns.o.K(0), ns.o.K(1), ns.o.L(0, 2), ns.o.K(0), ns.o.K(0), ns.o.K(0), ns.o.K(0), ns.o.K(0), ns.o.K(2), ns.o.K(0), ns.o.K(0), ns.o.K(0), ns.o.K(0), ns.o.K(0));
                                        sVar2.d0(229287757);
                                        i21 = 0;
                                        for (Object obj14 : list7) {
                                            i22 = i21 + 1;
                                            if (i21 >= 0) {
                                                ns.o.V();
                                                throw null;
                                            }
                                            list6 = (List) obj14;
                                            a2 a2VarA4 = z1.a(j0.i.f35303a, iVar5, sVar2, 0);
                                            iHashCode2 = Long.hashCode(sVar2.T);
                                            q1 q1VarL6 = sVar2.l();
                                            r rVarC6 = z1.a.c(sVar2, oVar);
                                            k.J.getClass();
                                            iVar = y2.j.f56913b;
                                            sVar2.h0();
                                            if (sVar2.S) {
                                                sVar2.k(iVar);
                                            } else {
                                                sVar2.r0();
                                            }
                                            l1.t.J(y2.j.f56917f, a2VarA4, sVar2);
                                            l1.t.J(y2.j.f56916e, q1VarL6, sVar2);
                                            hVar = y2.j.f56918g;
                                            if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode2))) {
                                                defpackage.e.A(iHashCode2, sVar2, iHashCode2, hVar);
                                            }
                                            l1.t.J(y2.j.f56915d, rVarC6, sVar2);
                                            String str4 = (String) list6.get(0);
                                            String str5 = (String) list6.get(1);
                                            bVar3 = bVar2;
                                            zH = sVar2.h(bVar3) | sVar2.h(list6);
                                            objQ = sVar2.Q();
                                            l1.g gVar5 = gVar;
                                            if (zH || objQ == gVar5) {
                                                final int i30 = 1;
                                                objQ = new fz.a() { // from class: xp.g
                                                    @Override // fz.a
                                                    public final Object invoke() {
                                                        int i210 = i30;
                                                        b0 b0Var2 = b0.f48488a;
                                                        List list10 = list6;
                                                        aq.b bVar5 = bVar3;
                                                        switch (i210) {
                                                            case 0:
                                                                int i31 = UKRSyllableIntroductionActivity.H;
                                                                bVar5.a((String) list10.get(2));
                                                                break;
                                                            default:
                                                                int i32 = UKRSyllableIntroductionActivity.H;
                                                                bVar5.a((String) list10.get(2));
                                                                break;
                                                        }
                                                        return b0Var2;
                                                    }
                                                };
                                                sVar2.o0(objQ);
                                            }
                                            UKRSyllableIntroductionActivity uKRSyllableIntroductionActivity5 = uKRSyllableIntroductionActivity2;
                                            uKRSyllableIntroductionActivity5.s(str4, str5, (fz.a) objQ, sVar2, 6);
                                            List listSubList2 = list6.subList(i24, list6.size());
                                            List list10 = (List) listL.get(i21);
                                            zH2 = sVar2.h(bVar3);
                                            objQ2 = sVar2.Q();
                                            if (!zH2 || objQ2 == gVar5) {
                                                z11 = true;
                                                objQ2 = new h(bVar3, 1);
                                                sVar2.o0(objQ2);
                                            } else {
                                                z11 = true;
                                            }
                                            uKRSyllableIntroductionActivity5.t(listSubList2, list10, 2.0f, (fz.c) objQ2, sVar2, 3078);
                                            sVar2.p(z11);
                                            i21 = i22;
                                            bVar2 = bVar3;
                                            gVar = gVar5;
                                            uKRSyllableIntroductionActivity2 = uKRSyllableIntroductionActivity5;
                                            i24 = 3;
                                        }
                                        sVar2.p(false);
                                        sVar2.p(true);
                                    }
                                    defpackage.e.A(iHashCode6, sVar2, iHashCode6, hVar9);
                                    y2.h hVar11 = y2.j.f56915d;
                                    l1.t.J(hVar11, rVarC4, sVar2);
                                    String strE6 = ub.a.e0(sVar2, R.string.ukr_alp_section_content_7);
                                    uKRSyllableIntroductionActivity2 = uKRSyllableIntroductionActivity;
                                    uKRSyllableIntroductionActivity2.w(strE6, sVar2, 0);
                                    j0.c.g(sVar2, e2.g(oVar, 8));
                                    a2 a2VarA5 = z1.a(j0.i.f35303a, iVar5, sVar2, 0);
                                    bVar2 = bVar4;
                                    iHashCode = Long.hashCode(sVar2.T);
                                    q1 q1VarL7 = sVar2.l();
                                    gVar = gVar2;
                                    r rVarC7 = z1.a.c(sVar2, oVar);
                                    sVar2.h0();
                                    if (sVar2.S) {
                                        sVar2.k(iVar6);
                                    } else {
                                        sVar2.r0();
                                    }
                                    l1.t.J(hVar7, a2VarA5, sVar2);
                                    l1.t.J(hVar8, q1VarL7, sVar2);
                                    if (sVar2.S) {
                                        defpackage.e.A(iHashCode, sVar2, iHashCode, hVar9);
                                    } else {
                                        defpackage.e.A(iHashCode, sVar2, iHashCode, hVar9);
                                    }
                                    l1.t.J(hVar11, rVarC7, sVar2);
                                    String strE7 = ub.a.e0(sVar2, R.string.ukr_alp_section_content_5);
                                    float f16 = 1;
                                    r rVarA5 = j0.c.A(oVar, f16);
                                    if (1.0f <= 0.0d) {
                                        k0.a.a(str);
                                    }
                                    if (1.0f > Float.MAX_VALUE) {
                                        f5 = Float.MAX_VALUE;
                                    } else {
                                        f5 = 1.0f;
                                    }
                                    r rVarI2 = rVarA5.i(new i1(f5, true));
                                    float f17 = 42;
                                    uKRSyllableIntroductionActivity2.u(0, strE7, sVar2, e2.g(rVarI2, f17));
                                    String strE8 = ub.a.e0(sVar2, R.string.ukr_alp_section_content_6);
                                    r rVarA6 = j0.c.A(oVar, f16);
                                    if (2.0f <= 0.0d) {
                                        k0.a.a(str);
                                    }
                                    if (2.0f > Float.MAX_VALUE) {
                                        f11 = Float.MAX_VALUE;
                                    } else {
                                        f11 = 2.0f;
                                    }
                                    uKRSyllableIntroductionActivity2.u(0, strE8, sVar2, e2.g(rVarA6.i(new i1(f11, true)), f17));
                                    sVar2.p(true);
                                    listL = ns.o.L(ns.o.K(0), ns.o.K(0), ns.o.K(0), ns.o.K(0), ns.o.K(0), ns.o.K(0), ns.o.K(0), ns.o.L(2, 5), ns.o.K(0), ns.o.K(1), ns.o.L(0, 2), ns.o.K(0), ns.o.K(0), ns.o.K(0), ns.o.K(0), ns.o.K(0), ns.o.K(2), ns.o.K(0), ns.o.K(0), ns.o.K(0), ns.o.K(0), ns.o.K(0));
                                    sVar2.d0(229287757);
                                    i21 = 0;
                                    while (r1.hasNext()) {
                                        i22 = i21 + 1;
                                        if (i21 >= 0) {
                                            ns.o.V();
                                            throw null;
                                        }
                                        list6 = (List) obj14;
                                        a2 a2VarA6 = z1.a(j0.i.f35303a, iVar5, sVar2, 0);
                                        iHashCode2 = Long.hashCode(sVar2.T);
                                        q1 q1VarL8 = sVar2.l();
                                        r rVarC8 = z1.a.c(sVar2, oVar);
                                        k.J.getClass();
                                        iVar = y2.j.f56913b;
                                        sVar2.h0();
                                        if (sVar2.S) {
                                            sVar2.k(iVar);
                                        } else {
                                            sVar2.r0();
                                        }
                                        l1.t.J(y2.j.f56917f, a2VarA6, sVar2);
                                        l1.t.J(y2.j.f56916e, q1VarL8, sVar2);
                                        hVar = y2.j.f56918g;
                                        if (sVar2.S) {
                                            defpackage.e.A(iHashCode2, sVar2, iHashCode2, hVar);
                                        } else {
                                            defpackage.e.A(iHashCode2, sVar2, iHashCode2, hVar);
                                        }
                                        l1.t.J(y2.j.f56915d, rVarC8, sVar2);
                                        String str6 = (String) list6.get(0);
                                        String str7 = (String) list6.get(1);
                                        bVar3 = bVar2;
                                        zH = sVar2.h(bVar3) | sVar2.h(list6);
                                        objQ = sVar2.Q();
                                        l1.g gVar6 = gVar;
                                        if (zH) {
                                            final int i31 = 1;
                                            objQ = new fz.a() { // from class: xp.g
                                                @Override // fz.a
                                                public final Object invoke() {
                                                    int i210 = i31;
                                                    b0 b0Var2 = b0.f48488a;
                                                    List list11 = list6;
                                                    aq.b bVar5 = bVar3;
                                                    switch (i210) {
                                                        case 0:
                                                            int i32 = UKRSyllableIntroductionActivity.H;
                                                            bVar5.a((String) list11.get(2));
                                                            break;
                                                        default:
                                                            int i33 = UKRSyllableIntroductionActivity.H;
                                                            bVar5.a((String) list11.get(2));
                                                            break;
                                                    }
                                                    return b0Var2;
                                                }
                                            };
                                            sVar2.o0(objQ);
                                        } else {
                                            final int i32 = 1;
                                            objQ = new fz.a() { // from class: xp.g
                                                @Override // fz.a
                                                public final Object invoke() {
                                                    int i210 = i32;
                                                    b0 b0Var2 = b0.f48488a;
                                                    List list11 = list6;
                                                    aq.b bVar5 = bVar3;
                                                    switch (i210) {
                                                        case 0:
                                                            int i33 = UKRSyllableIntroductionActivity.H;
                                                            bVar5.a((String) list11.get(2));
                                                            break;
                                                        default:
                                                            int i34 = UKRSyllableIntroductionActivity.H;
                                                            bVar5.a((String) list11.get(2));
                                                            break;
                                                    }
                                                    return b0Var2;
                                                }
                                            };
                                            sVar2.o0(objQ);
                                        }
                                        UKRSyllableIntroductionActivity uKRSyllableIntroductionActivity6 = uKRSyllableIntroductionActivity2;
                                        uKRSyllableIntroductionActivity6.s(str6, str7, (fz.a) objQ, sVar2, 6);
                                        List listSubList3 = list6.subList(i24, list6.size());
                                        List list11 = (List) listL.get(i21);
                                        zH2 = sVar2.h(bVar3);
                                        objQ2 = sVar2.Q();
                                        if (zH2) {
                                            z11 = true;
                                            objQ2 = new h(bVar3, 1);
                                            sVar2.o0(objQ2);
                                        } else {
                                            z11 = true;
                                            objQ2 = new h(bVar3, 1);
                                            sVar2.o0(objQ2);
                                        }
                                        uKRSyllableIntroductionActivity6.t(listSubList3, list11, 2.0f, (fz.c) objQ2, sVar2, 3078);
                                        sVar2.p(z11);
                                        i21 = i22;
                                        bVar2 = bVar3;
                                        gVar = gVar6;
                                        uKRSyllableIntroductionActivity2 = uKRSyllableIntroductionActivity6;
                                        i24 = 3;
                                    }
                                    sVar2.p(false);
                                    sVar2.p(true);
                                } else {
                                    sVar2.W();
                                }
                                return b0.f48488a;
                        }
                    }
                }, true, -426278616), 5);
                m0.j.p(LazyVerticalGrid, new vr.a(26), new t1.d(new fz.f() { // from class: xp.e
                    /* JADX WARN: Code duplicated, block: B:147:0x0326 A[SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:23:0x00e8  */
                    /* JADX WARN: Code duplicated, block: B:24:0x00ec  */
                    /* JADX WARN: Code duplicated, block: B:29:0x0107  */
                    /* JADX WARN: Code duplicated, block: B:33:0x0122  */
                    /* JADX WARN: Code duplicated, block: B:36:0x012b  */
                    /* JADX WARN: Code duplicated, block: B:38:0x012f  */
                    /* JADX WARN: Code duplicated, block: B:42:0x0157  */
                    /* JADX WARN: Code duplicated, block: B:45:0x0160  */
                    /* JADX WARN: Code duplicated, block: B:47:0x0164  */
                    /* JADX WARN: Code duplicated, block: B:51:0x024a  */
                    /* JADX WARN: Code duplicated, block: B:53:0x0252  */
                    /* JADX WARN: Code duplicated, block: B:55:0x0277  */
                    /* JADX WARN: Code duplicated, block: B:56:0x027b  */
                    /* JADX WARN: Code duplicated, block: B:61:0x029c  */
                    /* JADX WARN: Code duplicated, block: B:65:0x02cb  */
                    /* JADX WARN: Code duplicated, block: B:71:0x0302  */
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
                        String str;
                        UKRSyllableIntroductionActivity uKRSyllableIntroductionActivity2;
                        aq.b bVar2;
                        int iHashCode;
                        l1.g gVar;
                        float f5;
                        float f11;
                        List listL;
                        int i21;
                        int i22;
                        final List list6;
                        int iHashCode2;
                        y2.i iVar;
                        y2.h hVar;
                        final aq.b bVar3;
                        boolean zH;
                        Object objQ;
                        boolean zH2;
                        Object objQ2;
                        boolean z11;
                        int i23 = i14;
                        l1.g gVar2 = m.f39353a;
                        final aq.b bVar4 = bVar;
                        List list7 = list5;
                        o oVar = o.f58481a;
                        int i24 = 3;
                        switch (i23) {
                            case 0:
                                l item = (l) obj10;
                                n nVar = (n) obj11;
                                int iIntValue = ((Integer) obj12).intValue();
                                int i25 = UKRSyllableIntroductionActivity.H;
                                z1.i iVar2 = z1.c.L;
                                kotlin.jvm.internal.m.f(item, "$this$item");
                                s sVar = (s) nVar;
                                if (sVar.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    u uVarA = t.a(j0.i.f35305c, z1.c.O, sVar, 0);
                                    int iHashCode3 = Long.hashCode(sVar.T);
                                    q1 q1VarL = sVar.l();
                                    r rVarC = z1.a.c(sVar, oVar);
                                    k.J.getClass();
                                    y2.i iVar3 = y2.j.f56913b;
                                    sVar.h0();
                                    if (sVar.S) {
                                        sVar.k(iVar3);
                                    } else {
                                        sVar.r0();
                                    }
                                    y2.h hVar2 = y2.j.f56917f;
                                    l1.t.J(hVar2, uVarA, sVar);
                                    y2.h hVar3 = y2.j.f56916e;
                                    l1.t.J(hVar3, q1VarL, sVar);
                                    y2.h hVar4 = y2.j.f56918g;
                                    if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode3))) {
                                        defpackage.e.A(iHashCode3, sVar, iHashCode3, hVar4);
                                    }
                                    y2.h hVar5 = y2.j.f56915d;
                                    l1.t.J(hVar5, rVarC, sVar);
                                    String strE0 = ub.a.e0(sVar, R.string.ukr_alp_section_content_4);
                                    UKRSyllableIntroductionActivity uKRSyllableIntroductionActivity3 = uKRSyllableIntroductionActivity;
                                    uKRSyllableIntroductionActivity3.w(strE0, sVar, 0);
                                    j0.c.g(sVar, e2.g(oVar, 8));
                                    a2 a2VarA = z1.a(j0.i.f35303a, iVar2, sVar, 0);
                                    l1.g gVar3 = gVar2;
                                    int iHashCode4 = Long.hashCode(sVar.T);
                                    q1 q1VarL2 = sVar.l();
                                    r rVarC2 = z1.a.c(sVar, oVar);
                                    sVar.h0();
                                    if (sVar.S) {
                                        sVar.k(iVar3);
                                    } else {
                                        sVar.r0();
                                    }
                                    l1.t.J(hVar2, a2VarA, sVar);
                                    l1.t.J(hVar3, q1VarL2, sVar);
                                    if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode4))) {
                                        defpackage.e.A(iHashCode4, sVar, iHashCode4, hVar4);
                                    }
                                    l1.t.J(hVar5, rVarC2, sVar);
                                    String strE1 = ub.a.e0(sVar, R.string.ukr_alp_section_content_5);
                                    float f12 = 1;
                                    r rVarA = j0.c.A(oVar, f12);
                                    if (1.0f <= 0.0d) {
                                        k0.a.a("invalid weight; must be greater than zero");
                                    }
                                    float f13 = 42;
                                    uKRSyllableIntroductionActivity3.u(0, strE1, sVar, e2.g(rVarA.i(new i1(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true)), f13));
                                    String strE2 = ub.a.e0(sVar, R.string.ukr_alp_section_content_6);
                                    r rVarA2 = j0.c.A(oVar, f12);
                                    if (2.0f <= 0.0d) {
                                        k0.a.a("invalid weight; must be greater than zero");
                                    }
                                    uKRSyllableIntroductionActivity3.u(0, strE2, sVar, e2.g(rVarA2.i(new i1(2.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 2.0f, true)), f13));
                                    sVar.p(true);
                                    List listL2 = ns.o.L(ns.o.L(0, 3), ns.o.K(1), ns.o.K(0), ns.o.K(1), ns.o.K(1), ns.o.K(0), ns.o.K(0), ns.o.K(0), ns.o.K(0), ns.o.K(0));
                                    sVar.d0(1197243245);
                                    int i26 = 0;
                                    for (Object obj13 : list7) {
                                        int i27 = i26 + 1;
                                        if (i26 < 0) {
                                            ns.o.V();
                                            throw null;
                                        }
                                        final List list8 = (List) obj13;
                                        a2 a2VarA2 = z1.a(j0.i.f35303a, iVar2, sVar, 0);
                                        int iHashCode5 = Long.hashCode(sVar.T);
                                        q1 q1VarL3 = sVar.l();
                                        r rVarC3 = z1.a.c(sVar, oVar);
                                        k.J.getClass();
                                        y2.i iVar4 = y2.j.f56913b;
                                        sVar.h0();
                                        if (sVar.S) {
                                            sVar.k(iVar4);
                                        } else {
                                            sVar.r0();
                                        }
                                        l1.t.J(y2.j.f56917f, a2VarA2, sVar);
                                        l1.t.J(y2.j.f56916e, q1VarL3, sVar);
                                        y2.h hVar6 = y2.j.f56918g;
                                        if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode5))) {
                                            defpackage.e.A(iHashCode5, sVar, iHashCode5, hVar6);
                                        }
                                        l1.t.J(y2.j.f56915d, rVarC3, sVar);
                                        String str2 = (String) list8.get(0);
                                        String str3 = (String) list8.get(1);
                                        boolean zH3 = sVar.h(bVar4) | sVar.h(list8);
                                        Object objQ3 = sVar.Q();
                                        l1.g gVar4 = gVar3;
                                        if (zH3 || objQ3 == gVar4) {
                                            final int i28 = 0;
                                            objQ3 = new fz.a() { // from class: xp.g
                                                @Override // fz.a
                                                public final Object invoke() {
                                                    int i210 = i28;
                                                    b0 b0Var2 = b0.f48488a;
                                                    List list11 = list8;
                                                    aq.b bVar5 = bVar4;
                                                    switch (i210) {
                                                        case 0:
                                                            int i33 = UKRSyllableIntroductionActivity.H;
                                                            bVar5.a((String) list11.get(2));
                                                            break;
                                                        default:
                                                            int i34 = UKRSyllableIntroductionActivity.H;
                                                            bVar5.a((String) list11.get(2));
                                                            break;
                                                    }
                                                    return b0Var2;
                                                }
                                            };
                                            sVar.o0(objQ3);
                                        }
                                        UKRSyllableIntroductionActivity uKRSyllableIntroductionActivity4 = uKRSyllableIntroductionActivity3;
                                        uKRSyllableIntroductionActivity4.s(str2, str3, (fz.a) objQ3, sVar, 6);
                                        List listSubList = list8.subList(3, list8.size());
                                        List list9 = (List) listL2.get(i26);
                                        boolean zH4 = sVar.h(bVar4);
                                        Object objQ4 = sVar.Q();
                                        if (zH4 || objQ4 == gVar4) {
                                            objQ4 = new h(bVar4, 0);
                                            sVar.o0(objQ4);
                                        }
                                        uKRSyllableIntroductionActivity4.t(listSubList, list9, 2.0f, (fz.c) objQ4, sVar, 3078);
                                        sVar.p(true);
                                        i26 = i27;
                                        gVar3 = gVar4;
                                        uKRSyllableIntroductionActivity3 = uKRSyllableIntroductionActivity4;
                                    }
                                    sVar.p(false);
                                    sVar.p(true);
                                } else {
                                    sVar.W();
                                }
                                return b0.f48488a;
                            default:
                                l item2 = (l) obj10;
                                n nVar2 = (n) obj11;
                                int iIntValue2 = ((Integer) obj12).intValue();
                                int i29 = UKRSyllableIntroductionActivity.H;
                                z1.i iVar5 = z1.c.L;
                                kotlin.jvm.internal.m.f(item2, "$this$item");
                                s sVar2 = (s) nVar2;
                                if (sVar2.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                    u uVarA2 = t.a(j0.i.f35305c, z1.c.O, sVar2, 0);
                                    int iHashCode6 = Long.hashCode(sVar2.T);
                                    q1 q1VarL4 = sVar2.l();
                                    r rVarC4 = z1.a.c(sVar2, oVar);
                                    k.J.getClass();
                                    y2.i iVar6 = y2.j.f56913b;
                                    sVar2.h0();
                                    if (sVar2.S) {
                                        sVar2.k(iVar6);
                                    } else {
                                        sVar2.r0();
                                    }
                                    y2.h hVar7 = y2.j.f56917f;
                                    l1.t.J(hVar7, uVarA2, sVar2);
                                    y2.h hVar8 = y2.j.f56916e;
                                    l1.t.J(hVar8, q1VarL4, sVar2);
                                    y2.h hVar9 = y2.j.f56918g;
                                    if (sVar2.S) {
                                        str = "invalid weight; must be greater than zero";
                                    } else {
                                        str = "invalid weight; must be greater than zero";
                                        if (!kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode6))) {
                                        }
                                        y2.h hVar11 = y2.j.f56915d;
                                        l1.t.J(hVar11, rVarC4, sVar2);
                                        String strE6 = ub.a.e0(sVar2, R.string.ukr_alp_section_content_7);
                                        uKRSyllableIntroductionActivity2 = uKRSyllableIntroductionActivity;
                                        uKRSyllableIntroductionActivity2.w(strE6, sVar2, 0);
                                        j0.c.g(sVar2, e2.g(oVar, 8));
                                        a2 a2VarA5 = z1.a(j0.i.f35303a, iVar5, sVar2, 0);
                                        bVar2 = bVar4;
                                        iHashCode = Long.hashCode(sVar2.T);
                                        q1 q1VarL7 = sVar2.l();
                                        gVar = gVar2;
                                        r rVarC7 = z1.a.c(sVar2, oVar);
                                        sVar2.h0();
                                        if (sVar2.S) {
                                            sVar2.k(iVar6);
                                        } else {
                                            sVar2.r0();
                                        }
                                        l1.t.J(hVar7, a2VarA5, sVar2);
                                        l1.t.J(hVar8, q1VarL7, sVar2);
                                        if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode))) {
                                            defpackage.e.A(iHashCode, sVar2, iHashCode, hVar9);
                                        }
                                        l1.t.J(hVar11, rVarC7, sVar2);
                                        String strE7 = ub.a.e0(sVar2, R.string.ukr_alp_section_content_5);
                                        float f16 = 1;
                                        r rVarA5 = j0.c.A(oVar, f16);
                                        if (1.0f <= 0.0d) {
                                            k0.a.a(str);
                                        }
                                        if (1.0f > Float.MAX_VALUE) {
                                            f5 = Float.MAX_VALUE;
                                        } else {
                                            f5 = 1.0f;
                                        }
                                        r rVarI2 = rVarA5.i(new i1(f5, true));
                                        float f17 = 42;
                                        uKRSyllableIntroductionActivity2.u(0, strE7, sVar2, e2.g(rVarI2, f17));
                                        String strE8 = ub.a.e0(sVar2, R.string.ukr_alp_section_content_6);
                                        r rVarA6 = j0.c.A(oVar, f16);
                                        if (2.0f <= 0.0d) {
                                            k0.a.a(str);
                                        }
                                        if (2.0f > Float.MAX_VALUE) {
                                            f11 = Float.MAX_VALUE;
                                        } else {
                                            f11 = 2.0f;
                                        }
                                        uKRSyllableIntroductionActivity2.u(0, strE8, sVar2, e2.g(rVarA6.i(new i1(f11, true)), f17));
                                        sVar2.p(true);
                                        listL = ns.o.L(ns.o.K(0), ns.o.K(0), ns.o.K(0), ns.o.K(0), ns.o.K(0), ns.o.K(0), ns.o.K(0), ns.o.L(2, 5), ns.o.K(0), ns.o.K(1), ns.o.L(0, 2), ns.o.K(0), ns.o.K(0), ns.o.K(0), ns.o.K(0), ns.o.K(0), ns.o.K(2), ns.o.K(0), ns.o.K(0), ns.o.K(0), ns.o.K(0), ns.o.K(0));
                                        sVar2.d0(229287757);
                                        i21 = 0;
                                        for (Object obj14 : list7) {
                                            i22 = i21 + 1;
                                            if (i21 >= 0) {
                                                ns.o.V();
                                                throw null;
                                            }
                                            list6 = (List) obj14;
                                            a2 a2VarA6 = z1.a(j0.i.f35303a, iVar5, sVar2, 0);
                                            iHashCode2 = Long.hashCode(sVar2.T);
                                            q1 q1VarL8 = sVar2.l();
                                            r rVarC8 = z1.a.c(sVar2, oVar);
                                            k.J.getClass();
                                            iVar = y2.j.f56913b;
                                            sVar2.h0();
                                            if (sVar2.S) {
                                                sVar2.k(iVar);
                                            } else {
                                                sVar2.r0();
                                            }
                                            l1.t.J(y2.j.f56917f, a2VarA6, sVar2);
                                            l1.t.J(y2.j.f56916e, q1VarL8, sVar2);
                                            hVar = y2.j.f56918g;
                                            if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode2))) {
                                                defpackage.e.A(iHashCode2, sVar2, iHashCode2, hVar);
                                            }
                                            l1.t.J(y2.j.f56915d, rVarC8, sVar2);
                                            String str6 = (String) list6.get(0);
                                            String str7 = (String) list6.get(1);
                                            bVar3 = bVar2;
                                            zH = sVar2.h(bVar3) | sVar2.h(list6);
                                            objQ = sVar2.Q();
                                            l1.g gVar6 = gVar;
                                            if (zH || objQ == gVar6) {
                                                final int i32 = 1;
                                                objQ = new fz.a() { // from class: xp.g
                                                    @Override // fz.a
                                                    public final Object invoke() {
                                                        int i210 = i32;
                                                        b0 b0Var2 = b0.f48488a;
                                                        List list11 = list6;
                                                        aq.b bVar5 = bVar3;
                                                        switch (i210) {
                                                            case 0:
                                                                int i33 = UKRSyllableIntroductionActivity.H;
                                                                bVar5.a((String) list11.get(2));
                                                                break;
                                                            default:
                                                                int i34 = UKRSyllableIntroductionActivity.H;
                                                                bVar5.a((String) list11.get(2));
                                                                break;
                                                        }
                                                        return b0Var2;
                                                    }
                                                };
                                                sVar2.o0(objQ);
                                            }
                                            UKRSyllableIntroductionActivity uKRSyllableIntroductionActivity6 = uKRSyllableIntroductionActivity2;
                                            uKRSyllableIntroductionActivity6.s(str6, str7, (fz.a) objQ, sVar2, 6);
                                            List listSubList3 = list6.subList(i24, list6.size());
                                            List list11 = (List) listL.get(i21);
                                            zH2 = sVar2.h(bVar3);
                                            objQ2 = sVar2.Q();
                                            if (!zH2 || objQ2 == gVar6) {
                                                z11 = true;
                                                objQ2 = new h(bVar3, 1);
                                                sVar2.o0(objQ2);
                                            } else {
                                                z11 = true;
                                            }
                                            uKRSyllableIntroductionActivity6.t(listSubList3, list11, 2.0f, (fz.c) objQ2, sVar2, 3078);
                                            sVar2.p(z11);
                                            i21 = i22;
                                            bVar2 = bVar3;
                                            gVar = gVar6;
                                            uKRSyllableIntroductionActivity2 = uKRSyllableIntroductionActivity6;
                                            i24 = 3;
                                        }
                                        sVar2.p(false);
                                        sVar2.p(true);
                                    }
                                    defpackage.e.A(iHashCode6, sVar2, iHashCode6, hVar9);
                                    y2.h hVar12 = y2.j.f56915d;
                                    l1.t.J(hVar12, rVarC4, sVar2);
                                    String strE9 = ub.a.e0(sVar2, R.string.ukr_alp_section_content_7);
                                    uKRSyllableIntroductionActivity2 = uKRSyllableIntroductionActivity;
                                    uKRSyllableIntroductionActivity2.w(strE9, sVar2, 0);
                                    j0.c.g(sVar2, e2.g(oVar, 8));
                                    a2 a2VarA7 = z1.a(j0.i.f35303a, iVar5, sVar2, 0);
                                    bVar2 = bVar4;
                                    iHashCode = Long.hashCode(sVar2.T);
                                    q1 q1VarL9 = sVar2.l();
                                    gVar = gVar2;
                                    r rVarC9 = z1.a.c(sVar2, oVar);
                                    sVar2.h0();
                                    if (sVar2.S) {
                                        sVar2.k(iVar6);
                                    } else {
                                        sVar2.r0();
                                    }
                                    l1.t.J(hVar7, a2VarA7, sVar2);
                                    l1.t.J(hVar8, q1VarL9, sVar2);
                                    if (sVar2.S) {
                                        defpackage.e.A(iHashCode, sVar2, iHashCode, hVar9);
                                    } else {
                                        defpackage.e.A(iHashCode, sVar2, iHashCode, hVar9);
                                    }
                                    l1.t.J(hVar12, rVarC9, sVar2);
                                    String strE10 = ub.a.e0(sVar2, R.string.ukr_alp_section_content_5);
                                    float f18 = 1;
                                    r rVarA7 = j0.c.A(oVar, f18);
                                    if (1.0f <= 0.0d) {
                                        k0.a.a(str);
                                    }
                                    if (1.0f > Float.MAX_VALUE) {
                                        f5 = Float.MAX_VALUE;
                                    } else {
                                        f5 = 1.0f;
                                    }
                                    r rVarI3 = rVarA7.i(new i1(f5, true));
                                    float f19 = 42;
                                    uKRSyllableIntroductionActivity2.u(0, strE10, sVar2, e2.g(rVarI3, f19));
                                    String strE11 = ub.a.e0(sVar2, R.string.ukr_alp_section_content_6);
                                    r rVarA8 = j0.c.A(oVar, f18);
                                    if (2.0f <= 0.0d) {
                                        k0.a.a(str);
                                    }
                                    if (2.0f > Float.MAX_VALUE) {
                                        f11 = Float.MAX_VALUE;
                                    } else {
                                        f11 = 2.0f;
                                    }
                                    uKRSyllableIntroductionActivity2.u(0, strE11, sVar2, e2.g(rVarA8.i(new i1(f11, true)), f19));
                                    sVar2.p(true);
                                    listL = ns.o.L(ns.o.K(0), ns.o.K(0), ns.o.K(0), ns.o.K(0), ns.o.K(0), ns.o.K(0), ns.o.K(0), ns.o.L(2, 5), ns.o.K(0), ns.o.K(1), ns.o.L(0, 2), ns.o.K(0), ns.o.K(0), ns.o.K(0), ns.o.K(0), ns.o.K(0), ns.o.K(2), ns.o.K(0), ns.o.K(0), ns.o.K(0), ns.o.K(0), ns.o.K(0));
                                    sVar2.d0(229287757);
                                    i21 = 0;
                                    while (r1.hasNext()) {
                                        i22 = i21 + 1;
                                        if (i21 >= 0) {
                                            ns.o.V();
                                            throw null;
                                        }
                                        list6 = (List) obj14;
                                        a2 a2VarA8 = z1.a(j0.i.f35303a, iVar5, sVar2, 0);
                                        iHashCode2 = Long.hashCode(sVar2.T);
                                        q1 q1VarL10 = sVar2.l();
                                        r rVarC10 = z1.a.c(sVar2, oVar);
                                        k.J.getClass();
                                        iVar = y2.j.f56913b;
                                        sVar2.h0();
                                        if (sVar2.S) {
                                            sVar2.k(iVar);
                                        } else {
                                            sVar2.r0();
                                        }
                                        l1.t.J(y2.j.f56917f, a2VarA8, sVar2);
                                        l1.t.J(y2.j.f56916e, q1VarL10, sVar2);
                                        hVar = y2.j.f56918g;
                                        if (sVar2.S) {
                                            defpackage.e.A(iHashCode2, sVar2, iHashCode2, hVar);
                                        } else {
                                            defpackage.e.A(iHashCode2, sVar2, iHashCode2, hVar);
                                        }
                                        l1.t.J(y2.j.f56915d, rVarC10, sVar2);
                                        String str8 = (String) list6.get(0);
                                        String str9 = (String) list6.get(1);
                                        bVar3 = bVar2;
                                        zH = sVar2.h(bVar3) | sVar2.h(list6);
                                        objQ = sVar2.Q();
                                        l1.g gVar7 = gVar;
                                        if (zH) {
                                            final int i33 = 1;
                                            objQ = new fz.a() { // from class: xp.g
                                                @Override // fz.a
                                                public final Object invoke() {
                                                    int i210 = i33;
                                                    b0 b0Var2 = b0.f48488a;
                                                    List list12 = list6;
                                                    aq.b bVar5 = bVar3;
                                                    switch (i210) {
                                                        case 0:
                                                            int i34 = UKRSyllableIntroductionActivity.H;
                                                            bVar5.a((String) list12.get(2));
                                                            break;
                                                        default:
                                                            int i35 = UKRSyllableIntroductionActivity.H;
                                                            bVar5.a((String) list12.get(2));
                                                            break;
                                                    }
                                                    return b0Var2;
                                                }
                                            };
                                            sVar2.o0(objQ);
                                        } else {
                                            final int i34 = 1;
                                            objQ = new fz.a() { // from class: xp.g
                                                @Override // fz.a
                                                public final Object invoke() {
                                                    int i210 = i34;
                                                    b0 b0Var2 = b0.f48488a;
                                                    List list12 = list6;
                                                    aq.b bVar5 = bVar3;
                                                    switch (i210) {
                                                        case 0:
                                                            int i35 = UKRSyllableIntroductionActivity.H;
                                                            bVar5.a((String) list12.get(2));
                                                            break;
                                                        default:
                                                            int i36 = UKRSyllableIntroductionActivity.H;
                                                            bVar5.a((String) list12.get(2));
                                                            break;
                                                    }
                                                    return b0Var2;
                                                }
                                            };
                                            sVar2.o0(objQ);
                                        }
                                        UKRSyllableIntroductionActivity uKRSyllableIntroductionActivity7 = uKRSyllableIntroductionActivity2;
                                        uKRSyllableIntroductionActivity7.s(str8, str9, (fz.a) objQ, sVar2, 6);
                                        List listSubList4 = list6.subList(i24, list6.size());
                                        List list12 = (List) listL.get(i21);
                                        zH2 = sVar2.h(bVar3);
                                        objQ2 = sVar2.Q();
                                        if (zH2) {
                                            z11 = true;
                                            objQ2 = new h(bVar3, 1);
                                            sVar2.o0(objQ2);
                                        } else {
                                            z11 = true;
                                            objQ2 = new h(bVar3, 1);
                                            sVar2.o0(objQ2);
                                        }
                                        uKRSyllableIntroductionActivity7.t(listSubList4, list12, 2.0f, (fz.c) objQ2, sVar2, 3078);
                                        sVar2.p(z11);
                                        i21 = i22;
                                        bVar2 = bVar3;
                                        gVar = gVar7;
                                        uKRSyllableIntroductionActivity2 = uKRSyllableIntroductionActivity7;
                                        i24 = 3;
                                    }
                                    sVar2.p(false);
                                    sVar2.p(true);
                                } else {
                                    sVar2.W();
                                }
                                return b0.f48488a;
                        }
                    }
                }, true, -597118073), 5);
                m0.j.p(LazyVerticalGrid, new vr.a(27), new t1.d(new y(uKRSyllableIntroductionActivity, (List) obj4, (List) obj3, (List) obj2, bVar, 12), true, -767957530), 5);
                return b0Var;
        }
    }

    public /* synthetic */ r(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, int i11) {
        this.f4780a = i11;
        this.f4782c = obj;
        this.f4783d = obj2;
        this.f4784e = obj3;
        this.f4781b = obj4;
        this.f4785f = obj5;
        this.f4786t = obj6;
        this.H = obj7;
        this.K = obj8;
    }
}
