package b0;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.core.content.FileProvider;
import androidx.lifecycle.MutableLiveData;
import androidx.viewpager2.widget.ViewPager2;
import bp.v2;
import bt.i3;
import bt.t3;
import com.chad.library.adapter.base.BaseViewHolder;
import com.google.api.Service;
import com.lingo.fluent.object.PdLessonDbHelper;
import com.lingo.fluent.ui.base.adapter.PdFavAdapter;
import com.lingo.fluent.ui.base.adapter.PdLearnDetailAdapter;
import com.lingo.fluent.ui.base.adapter.PdVocabularyAdapter;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.object.BaseReviewGroup;
import com.lingo.lingoskill.object.PdLesson;
import com.lingo.lingoskill.object.PdLessonFav;
import com.lingo.lingoskill.object.PdLessonFavDao;
import com.lingo.lingoskill.object.PdSentence;
import com.lingo.lingoskill.ui.review.adapter.BaseReviewCateAdapter;
import com.lingodeer.R;
import com.lingodeer.data.model.CourseSentence;
import com.lingodeer.data.model.LoginHistory;
import com.lingodeer.data.model.uistate.LeaderBoardUser;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.UCrop;
import com.yalantis.ucrop.view.CropImageView;
import j0.t;
import j0.u;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.regex.Pattern;
import l1.b3;
import l1.q1;
import mf.sOm.txBUGYhC;
import qy.b0;
import rt.e3;
import rt.ja;
import rt.ka;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3418c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f3419d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f3420e;

    public /* synthetic */ a(int i11, fz.c cVar, Object obj, Object obj2, Object obj3) {
        this.f3416a = i11;
        this.f3417b = obj;
        this.f3419d = cVar;
        this.f3418c = obj2;
        this.f3420e = obj3;
    }

    public /* synthetic */ a(Object obj, Object obj2, Object obj3, Object obj4, int i11) {
        this.f3416a = i11;
        this.f3417b = obj;
        this.f3418c = obj2;
        this.f3419d = obj3;
        this.f3420e = obj4;
    }

    /* JADX WARN: Code duplicated, block: B:132:0x0555  */
    /* JADX WARN: Multi-variable type inference failed */
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
    @Override // fz.c
    public final Object invoke(Object obj) throws IOException {
        Drawable drawable;
        long jB;
        ja jaVar;
        Uri uri;
        int i11 = this.f3416a;
        int i12 = 12;
        int i13 = 10;
        final int i14 = 2;
        final int i15 = 0;
        objArr = 0;
        Object[] objArr = 0;
        final int i16 = 3;
        final int i17 = 1;
        qy.b0 b0Var = qy.b0.f48488a;
        Object obj2 = this.f3420e;
        Object obj3 = this.f3419d;
        Object obj4 = this.f3418c;
        Object obj5 = this.f3417b;
        switch (i11) {
            case 0:
                d dVar = (d) obj5;
                n nVar = (n) obj4;
                fz.c cVar = (fz.c) obj3;
                kotlin.jvm.internal.u uVar = (kotlin.jvm.internal.u) obj2;
                l lVar = (l) obj;
                e.s(lVar, dVar.f3472c);
                l1.k1 k1Var = lVar.f3591e;
                Object objA = d.a(dVar, k1Var.getValue());
                if (!kotlin.jvm.internal.m.a(objA, k1Var.getValue())) {
                    dVar.f3472c.f3614b.setValue(objA);
                    nVar.f3614b.setValue(objA);
                    if (cVar != null) {
                        cVar.invoke(dVar);
                    }
                    lVar.a();
                    uVar.f38357a = true;
                } else if (cVar != null) {
                    cVar.invoke(dVar);
                }
                return b0Var;
            case 1:
                j0 j0Var = (j0) obj4;
                kotlin.jvm.internal.v vVar = (kotlin.jvm.internal.v) obj3;
                rz.b0 b0Var2 = (rz.b0) obj2;
                long jLongValue = ((Long) obj).longValue();
                b3 b3Var = (b3) ((l1.b1) obj5).getValue();
                long jLongValue2 = b3Var != null ? ((Number) b3Var.getValue()).longValue() : jLongValue;
                long j11 = j0Var.f3571c;
                n1.e eVar = j0Var.f3569a;
                if (j11 == Long.MIN_VALUE || vVar.f38358a != e.n(b0Var2.getCoroutineContext())) {
                    j0Var.f3571c = jLongValue;
                    Object[] objArr2 = eVar.f43112a;
                    int i18 = eVar.f43114c;
                    for (int i19 = 0; i19 < i18; i19++) {
                        ((h0) objArr2[i19]).f3556t = true;
                    }
                    vVar.f38358a = e.n(b0Var2.getCoroutineContext());
                }
                float f5 = vVar.f38358a;
                if (f5 == CropImageView.DEFAULT_ASPECT_RATIO) {
                    Object[] objArr3 = eVar.f43112a;
                    int i21 = eVar.f43114c;
                    while (i15 < i21) {
                        h0 h0Var = (h0) objArr3[i15];
                        h0Var.f3553d.setValue(h0Var.f3554e.f3659c);
                        h0Var.f3556t = true;
                        i15++;
                    }
                } else {
                    long j12 = (long) ((jLongValue2 - j0Var.f3571c) / f5);
                    Object[] objArr4 = eVar.f43112a;
                    int i22 = eVar.f43114c;
                    boolean z11 = true;
                    for (int i23 = 0; i23 < i22; i23++) {
                        h0 h0Var2 = (h0) objArr4[i23];
                        if (!h0Var2.f3555f) {
                            h0Var2.K.f3570b.setValue(Boolean.FALSE);
                            if (h0Var2.f3556t) {
                                h0Var2.f3556t = false;
                                h0Var2.H = j12;
                            }
                            long j13 = j12 - h0Var2.H;
                            h0Var2.f3553d.setValue(h0Var2.f3554e.h(j13));
                            h0Var2.f3555f = h0Var2.f3554e.g(j13);
                        }
                        if (!h0Var2.f3555f) {
                            z11 = false;
                        }
                    }
                    j0Var.f3572d.setValue(Boolean.valueOf(!z11));
                }
                return b0Var;
            case 2:
                fz.c cVar2 = (fz.c) obj3;
                l1.b1 b1Var = (l1.b1) obj4;
                l1.b1 b1Var2 = (l1.b1) obj2;
                s0.p0 KeyboardActions = (s0.p0) obj;
                kotlin.jvm.internal.m.f(KeyboardActions, "$this$KeyboardActions");
                e2.l.a((e2.l) obj5);
                if (((String) b1Var.getValue()).length() > 0) {
                    cVar2.invoke((String) b1Var.getValue());
                } else {
                    b1Var2.setValue(Boolean.TRUE);
                }
                return b0Var;
            case 3:
                fz.e eVar2 = (fz.e) obj4;
                l1.b1 b1Var3 = (l1.b1) obj3;
                l1.b1 b1Var4 = (l1.b1) obj2;
                s0.p0 KeyboardActions2 = (s0.p0) obj;
                kotlin.jvm.internal.m.f(KeyboardActions2, "$this$KeyboardActions");
                e2.l.a((e2.l) obj5);
                String str = (String) b1Var3.getValue();
                String str2 = (String) b1Var4.getValue();
                if (str.length() != 0 && str2.length() != 0 && Pattern.compile("^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z0-9-]{2,63}$").matcher(str2).matches()) {
                    eVar2.invoke((String) b1Var3.getValue(), (String) b1Var4.getValue());
                }
                return b0Var;
            case 4:
                v2 v2Var = (v2) obj5;
                kotlin.jvm.internal.m.f((View) obj, "it");
                Bundle bundle = new Bundle();
                jp.a1 a1Var = new jp.a1();
                a1Var.setArguments(bundle);
                a1Var.U = new dm.c((bp.t2) obj4, (LoginHistory) obj3, v2Var, (View) obj2, 2);
                a1Var.u(v2Var.getChildFragmentManager(), "ConfirmRemoveAccountBottomSheetDialogFragment");
                return b0Var;
            case 5:
                rz.b0 b0Var3 = (rz.b0) obj5;
                CourseSentence courseSentence = (CourseSentence) obj4;
                l1.a1 a1Var2 = (l1.a1) obj3;
                l1.b1 b1Var5 = (l1.b1) obj2;
                ht.l it = (ht.l) obj;
                kotlin.jvm.internal.m.f(it, "it");
                if (!(it instanceof ht.a)) {
                    rz.e0.B(b0Var3, null, null, new bt.k1(courseSentence, it, a1Var2, null, 0), 3);
                }
                b1Var5.setValue(it);
                return b0Var;
            case 6:
                ys.d0 d0Var = (ys.d0) obj5;
                ht.o oVar = (ht.o) obj4;
                ot.h hVar = (ot.h) obj3;
                jt.j0 j0Var2 = (jt.j0) obj2;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                if (d0Var != null) {
                    d0Var.b(zBooleanValue, zBooleanValue);
                }
                if (!oVar.f33757e && d0Var != null) {
                    jh.h.m(d0Var, jh.h.q(hVar.f45828a), new ht.h(hVar.f45828a.getVisemedMap()), new i3(j0Var2, 0));
                }
                return b0Var;
            case 7:
                ys.d0 d0Var2 = (ys.d0) obj5;
                jt.k0 k0Var = (jt.k0) obj4;
                ht.o oVar2 = (ht.o) obj3;
                ot.j jVar = (ot.j) obj2;
                ((Boolean) obj).getClass();
                if (d0Var2 != null) {
                    boolean z12 = k0Var.f37005d.getValue() == ht.q.CORRECT;
                    d0Var2.b(z12, z12);
                }
                if (!oVar2.f33757e && d0Var2 != null) {
                    jh.h.m(d0Var2, jh.h.q(jVar.f45858a), new ht.h(jVar.f45858a.getVisemedMap()), new t3(k0Var, 1));
                }
                return b0Var;
            case 8:
                rz.b0 b0Var4 = (rz.b0) obj5;
                jt.x0 x0Var = (jt.x0) obj4;
                CourseSentence courseSentence2 = (CourseSentence) obj3;
                l1.a1 a1Var3 = (l1.a1) obj2;
                ht.l it2 = (ht.l) obj;
                kotlin.jvm.internal.m.f(it2, "it");
                if (!(it2 instanceof ht.a)) {
                    rz.e0.B(b0Var4, null, null, new bt.k1(courseSentence2, it2, a1Var3, null, 1), 3);
                }
                x0Var.f37262h.setValue(it2);
                return b0Var;
            case 9:
                v3.c cVar3 = (v3.c) obj5;
                l1.b1 b1Var6 = (l1.b1) obj2;
                w2.x placeable = (w2.x) obj;
                kotlin.jvm.internal.m.f(placeable, "placeable");
                ((l1.b1) obj4).setValue(Boolean.TRUE);
                ((fz.c) obj3).invoke(new v3.f(cVar3.Q((int) (placeable.m() & 4294967295L))));
                if (placeable.k()) {
                    long jP = placeable.P(0L);
                    b1Var6.setValue(new v3.j((((long) ((int) (Float.intBitsToFloat((int) (jP >> 32)) + (((int) (placeable.m() >> 32)) / 2)))) << 32) | (((long) ((int) (cVar3.e0(4) + Float.intBitsToFloat((int) (jP & 4294967295L)) + ((int) (placeable.m() & 4294967295L))))) & 4294967295L)));
                }
                return b0Var;
            case 10:
                kotlin.jvm.internal.v vVar2 = (kotlin.jvm.internal.v) obj5;
                f0.g1 g1Var = (f0.g1) obj4;
                f0.g2 g2Var = (f0.g2) obj3;
                b1.a aVar = (b1.a) obj2;
                l lVar2 = (l) obj;
                float fFloatValue = ((Number) lVar2.f3591e.getValue()).floatValue() - vVar2.f38358a;
                if (f0.a1.a(fFloatValue)) {
                    if (((Boolean) aVar.invoke(Float.valueOf(vVar2.f38358a))).booleanValue()) {
                        lVar2.a();
                    }
                } else if (f0.a1.a(fFloatValue - g1Var.c(g2Var, fFloatValue))) {
                    vVar2.f38358a += fFloatValue;
                    if (((Boolean) aVar.invoke(Float.valueOf(vVar2.f38358a))).booleanValue()) {
                        lVar2.a();
                    }
                } else {
                    lVar2.a();
                }
                return b0Var;
            case 11:
                bs.a aVar2 = (bs.a) obj5;
                l0.h LazyColumn = (l0.h) obj;
                kotlin.jvm.internal.m.f(LazyColumn, "$this$LazyColumn");
                l0.h.p(LazyColumn, null, new t1.d(new a00.b(aVar2, i12), true, -2045278550), 3);
                l0.h.p(LazyColumn, null, new t1.d(new defpackage.d(aVar2, (String) obj4, (fz.c) obj3, 5), true, -342340319), 3);
                l0.h.p(LazyColumn, null, new t1.d(new bp.u(i13, (fz.a) obj2), true, 234855394), 3);
                return b0Var;
            case 12:
                bs.b bVar = (bs.b) obj5;
                l0.h LazyColumn2 = (l0.h) obj;
                kotlin.jvm.internal.m.f(LazyColumn2, "$this$LazyColumn");
                l0.h.p(LazyColumn2, null, new t1.d(new a00.b(bVar, 13), true, -55055760), 3);
                l0.h.p(LazyColumn2, null, new t1.d(new defpackage.d(bVar, (String) obj4, (fz.c) obj3, 6), true, 1826088153), 3);
                l0.h.p(LazyColumn2, null, new t1.d(new bp.u(11, (fz.a) obj2), true, -176223176), 3);
                return b0Var;
            case 13:
                final bs.d dVar2 = (bs.d) obj5;
                final String str3 = (String) obj4;
                final fz.c cVar4 = (fz.c) obj3;
                l0.h LazyColumn3 = (l0.h) obj;
                kotlin.jvm.internal.m.f(LazyColumn3, "$this$LazyColumn");
                l0.h.p(LazyColumn3, null, new t1.d(new fz.f() { // from class: gs.l
                    @Override // fz.f
                    public final Object invoke(Object obj6, Object obj7, Object obj8) {
                        int i24 = i17;
                        l0.c item = (l0.c) obj6;
                        l1.n nVar2 = (l1.n) obj7;
                        int iIntValue = ((Integer) obj8).intValue();
                        switch (i24) {
                            case 0:
                                kotlin.jvm.internal.m.f(item, "$this$item");
                                l1.s sVar = (l1.s) nVar2;
                                if (sVar.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    dVar2.getClass();
                                    a.l(0, R.string.chinese_tone_yi_desc, 6, 2, sVar, null);
                                } else {
                                    sVar.W();
                                }
                                break;
                            case 1:
                                kotlin.jvm.internal.m.f(item, "$this$item");
                                l1.s sVar2 = (l1.s) nVar2;
                                if (sVar2.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    dVar2.getClass();
                                    a.l(R.string.chinese_tone_yi_subtitle1, 0, 384, 2, sVar2, null);
                                } else {
                                    sVar2.W();
                                }
                                break;
                            case 2:
                                kotlin.jvm.internal.m.f(item, "$this$item");
                                l1.s sVar3 = (l1.s) nVar2;
                                if (sVar3.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    dVar2.getClass();
                                    a.l(R.string.chinese_tone_yi_subtitle2, 0, 0, 6, sVar3, null);
                                } else {
                                    sVar3.W();
                                }
                                break;
                            default:
                                kotlin.jvm.internal.m.f(item, "$this$item");
                                l1.s sVar4 = (l1.s) nVar2;
                                if (sVar4.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    dVar2.getClass();
                                    a.l(R.string.chinese_tone_yi_subtitle3, 0, 0, 6, sVar4, null);
                                } else {
                                    sVar4.W();
                                }
                                break;
                        }
                        return b0.f48488a;
                    }
                }, true, 1074762035), 3);
                l0.h.p(LazyColumn3, null, new t1.d(new fz.f() { // from class: gs.k
                    @Override // fz.f
                    public final Object invoke(Object obj6, Object obj7, Object obj8) {
                        int i24 = i17;
                        l0.c item = (l0.c) obj6;
                        l1.n nVar2 = (l1.n) obj7;
                        int iIntValue = ((Integer) obj8).intValue();
                        switch (i24) {
                            case 0:
                                kotlin.jvm.internal.m.f(item, "$this$item");
                                l1.s sVar = (l1.s) nVar2;
                                if (sVar.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    u uVarA = t.a(j0.i.g(16), z1.c.O, sVar, 6);
                                    int iHashCode = Long.hashCode(sVar.T);
                                    q1 q1VarL = sVar.l();
                                    z1.r rVarC = z1.a.c(sVar, z1.o.f58481a);
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
                                    y2.h hVar2 = y2.j.f56918g;
                                    if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                                        defpackage.e.A(iHashCode, sVar, iHashCode, hVar2);
                                    }
                                    l1.t.J(y2.j.f56915d, rVarC, sVar);
                                    sVar.d0(-1344039322);
                                    for (bs.c cVar5 : dVar2.f5120c) {
                                        boolean zEquals = str3.equals(cVar5.f5117f);
                                        fz.c cVar6 = cVar4;
                                        boolean zF = sVar.f(cVar6) | sVar.f(cVar5);
                                        Object objQ = sVar.Q();
                                        if (zF || objQ == l1.m.f39353a) {
                                            objQ = new j(cVar6, cVar5, 2);
                                            sVar.o0(objQ);
                                        }
                                        a.m(cVar5, zEquals, (fz.a) objQ, sVar, 0);
                                    }
                                    sVar.p(false);
                                    sVar.p(true);
                                } else {
                                    sVar.W();
                                }
                                break;
                            case 1:
                                kotlin.jvm.internal.m.f(item, "$this$item");
                                l1.s sVar2 = (l1.s) nVar2;
                                if (sVar2.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    u uVarA2 = t.a(j0.i.g(16), z1.c.O, sVar2, 6);
                                    int iHashCode2 = Long.hashCode(sVar2.T);
                                    q1 q1VarL2 = sVar2.l();
                                    z1.r rVarC2 = z1.a.c(sVar2, z1.o.f58481a);
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
                                    y2.h hVar3 = y2.j.f56918g;
                                    if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode2))) {
                                        defpackage.e.A(iHashCode2, sVar2, iHashCode2, hVar3);
                                    }
                                    l1.t.J(y2.j.f56915d, rVarC2, sVar2);
                                    sVar2.d0(-1040685079);
                                    for (bs.c cVar7 : dVar2.f5118a) {
                                        boolean zEquals2 = str3.equals(cVar7.f5117f);
                                        fz.c cVar8 = cVar4;
                                        boolean zF2 = sVar2.f(cVar8) | sVar2.f(cVar7);
                                        Object objQ2 = sVar2.Q();
                                        if (zF2 || objQ2 == l1.m.f39353a) {
                                            objQ2 = new j(cVar8, cVar7, 4);
                                            sVar2.o0(objQ2);
                                        }
                                        a.m(cVar7, zEquals2, (fz.a) objQ2, sVar2, 0);
                                    }
                                    sVar2.p(false);
                                    sVar2.p(true);
                                } else {
                                    sVar2.W();
                                }
                                break;
                            default:
                                kotlin.jvm.internal.m.f(item, "$this$item");
                                l1.s sVar3 = (l1.s) nVar2;
                                if (sVar3.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    u uVarA3 = t.a(j0.i.g(16), z1.c.O, sVar3, 6);
                                    int iHashCode3 = Long.hashCode(sVar3.T);
                                    q1 q1VarL3 = sVar3.l();
                                    z1.r rVarC3 = z1.a.c(sVar3, z1.o.f58481a);
                                    y2.k.J.getClass();
                                    y2.i iVar3 = y2.j.f56913b;
                                    sVar3.h0();
                                    if (sVar3.S) {
                                        sVar3.k(iVar3);
                                    } else {
                                        sVar3.r0();
                                    }
                                    l1.t.J(y2.j.f56917f, uVarA3, sVar3);
                                    l1.t.J(y2.j.f56916e, q1VarL3, sVar3);
                                    y2.h hVar4 = y2.j.f56918g;
                                    if (sVar3.S || !kotlin.jvm.internal.m.a(sVar3.Q(), Integer.valueOf(iHashCode3))) {
                                        defpackage.e.A(iHashCode3, sVar3, iHashCode3, hVar4);
                                    }
                                    l1.t.J(y2.j.f56915d, rVarC3, sVar3);
                                    sVar3.d0(-1192362200);
                                    for (bs.c cVar9 : dVar2.f5119b) {
                                        boolean zEquals3 = str3.equals(cVar9.f5117f);
                                        fz.c cVar10 = cVar4;
                                        boolean zF3 = sVar3.f(cVar10) | sVar3.f(cVar9);
                                        Object objQ3 = sVar3.Q();
                                        if (zF3 || objQ3 == l1.m.f39353a) {
                                            objQ3 = new j(cVar10, cVar9, 3);
                                            sVar3.o0(objQ3);
                                        }
                                        a.m(cVar9, zEquals3, (fz.a) objQ3, sVar3, 0);
                                    }
                                    sVar3.p(false);
                                    sVar3.p(true);
                                } else {
                                    sVar3.W();
                                }
                                break;
                        }
                        return b0.f48488a;
                    }
                }, true, -1339061348), 3);
                l0.h.p(LazyColumn3, null, new t1.d(new fz.f() { // from class: gs.l
                    @Override // fz.f
                    public final Object invoke(Object obj6, Object obj7, Object obj8) {
                        int i24 = i14;
                        l0.c item = (l0.c) obj6;
                        l1.n nVar2 = (l1.n) obj7;
                        int iIntValue = ((Integer) obj8).intValue();
                        switch (i24) {
                            case 0:
                                kotlin.jvm.internal.m.f(item, "$this$item");
                                l1.s sVar = (l1.s) nVar2;
                                if (sVar.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    dVar2.getClass();
                                    a.l(0, R.string.chinese_tone_yi_desc, 6, 2, sVar, null);
                                } else {
                                    sVar.W();
                                }
                                break;
                            case 1:
                                kotlin.jvm.internal.m.f(item, "$this$item");
                                l1.s sVar2 = (l1.s) nVar2;
                                if (sVar2.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    dVar2.getClass();
                                    a.l(R.string.chinese_tone_yi_subtitle1, 0, 384, 2, sVar2, null);
                                } else {
                                    sVar2.W();
                                }
                                break;
                            case 2:
                                kotlin.jvm.internal.m.f(item, "$this$item");
                                l1.s sVar3 = (l1.s) nVar2;
                                if (sVar3.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    dVar2.getClass();
                                    a.l(R.string.chinese_tone_yi_subtitle2, 0, 0, 6, sVar3, null);
                                } else {
                                    sVar3.W();
                                }
                                break;
                            default:
                                kotlin.jvm.internal.m.f(item, "$this$item");
                                l1.s sVar4 = (l1.s) nVar2;
                                if (sVar4.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    dVar2.getClass();
                                    a.l(R.string.chinese_tone_yi_subtitle3, 0, 0, 6, sVar4, null);
                                } else {
                                    sVar4.W();
                                }
                                break;
                        }
                        return b0.f48488a;
                    }
                }, true, 953594619), 3);
                l0.h.p(LazyColumn3, null, new t1.d(new fz.f() { // from class: gs.k
                    @Override // fz.f
                    public final Object invoke(Object obj6, Object obj7, Object obj8) {
                        int i24 = i14;
                        l0.c item = (l0.c) obj6;
                        l1.n nVar2 = (l1.n) obj7;
                        int iIntValue = ((Integer) obj8).intValue();
                        switch (i24) {
                            case 0:
                                kotlin.jvm.internal.m.f(item, "$this$item");
                                l1.s sVar = (l1.s) nVar2;
                                if (sVar.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    u uVarA = t.a(j0.i.g(16), z1.c.O, sVar, 6);
                                    int iHashCode = Long.hashCode(sVar.T);
                                    q1 q1VarL = sVar.l();
                                    z1.r rVarC = z1.a.c(sVar, z1.o.f58481a);
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
                                    y2.h hVar2 = y2.j.f56918g;
                                    if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                                        defpackage.e.A(iHashCode, sVar, iHashCode, hVar2);
                                    }
                                    l1.t.J(y2.j.f56915d, rVarC, sVar);
                                    sVar.d0(-1344039322);
                                    for (bs.c cVar5 : dVar2.f5120c) {
                                        boolean zEquals = str3.equals(cVar5.f5117f);
                                        fz.c cVar6 = cVar4;
                                        boolean zF = sVar.f(cVar6) | sVar.f(cVar5);
                                        Object objQ = sVar.Q();
                                        if (zF || objQ == l1.m.f39353a) {
                                            objQ = new j(cVar6, cVar5, 2);
                                            sVar.o0(objQ);
                                        }
                                        a.m(cVar5, zEquals, (fz.a) objQ, sVar, 0);
                                    }
                                    sVar.p(false);
                                    sVar.p(true);
                                } else {
                                    sVar.W();
                                }
                                break;
                            case 1:
                                kotlin.jvm.internal.m.f(item, "$this$item");
                                l1.s sVar2 = (l1.s) nVar2;
                                if (sVar2.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    u uVarA2 = t.a(j0.i.g(16), z1.c.O, sVar2, 6);
                                    int iHashCode2 = Long.hashCode(sVar2.T);
                                    q1 q1VarL2 = sVar2.l();
                                    z1.r rVarC2 = z1.a.c(sVar2, z1.o.f58481a);
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
                                    y2.h hVar3 = y2.j.f56918g;
                                    if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode2))) {
                                        defpackage.e.A(iHashCode2, sVar2, iHashCode2, hVar3);
                                    }
                                    l1.t.J(y2.j.f56915d, rVarC2, sVar2);
                                    sVar2.d0(-1040685079);
                                    for (bs.c cVar7 : dVar2.f5118a) {
                                        boolean zEquals2 = str3.equals(cVar7.f5117f);
                                        fz.c cVar8 = cVar4;
                                        boolean zF2 = sVar2.f(cVar8) | sVar2.f(cVar7);
                                        Object objQ2 = sVar2.Q();
                                        if (zF2 || objQ2 == l1.m.f39353a) {
                                            objQ2 = new j(cVar8, cVar7, 4);
                                            sVar2.o0(objQ2);
                                        }
                                        a.m(cVar7, zEquals2, (fz.a) objQ2, sVar2, 0);
                                    }
                                    sVar2.p(false);
                                    sVar2.p(true);
                                } else {
                                    sVar2.W();
                                }
                                break;
                            default:
                                kotlin.jvm.internal.m.f(item, "$this$item");
                                l1.s sVar3 = (l1.s) nVar2;
                                if (sVar3.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    u uVarA3 = t.a(j0.i.g(16), z1.c.O, sVar3, 6);
                                    int iHashCode3 = Long.hashCode(sVar3.T);
                                    q1 q1VarL3 = sVar3.l();
                                    z1.r rVarC3 = z1.a.c(sVar3, z1.o.f58481a);
                                    y2.k.J.getClass();
                                    y2.i iVar3 = y2.j.f56913b;
                                    sVar3.h0();
                                    if (sVar3.S) {
                                        sVar3.k(iVar3);
                                    } else {
                                        sVar3.r0();
                                    }
                                    l1.t.J(y2.j.f56917f, uVarA3, sVar3);
                                    l1.t.J(y2.j.f56916e, q1VarL3, sVar3);
                                    y2.h hVar4 = y2.j.f56918g;
                                    if (sVar3.S || !kotlin.jvm.internal.m.a(sVar3.Q(), Integer.valueOf(iHashCode3))) {
                                        defpackage.e.A(iHashCode3, sVar3, iHashCode3, hVar4);
                                    }
                                    l1.t.J(y2.j.f56915d, rVarC3, sVar3);
                                    sVar3.d0(-1192362200);
                                    for (bs.c cVar9 : dVar2.f5119b) {
                                        boolean zEquals3 = str3.equals(cVar9.f5117f);
                                        fz.c cVar10 = cVar4;
                                        boolean zF3 = sVar3.f(cVar10) | sVar3.f(cVar9);
                                        Object objQ3 = sVar3.Q();
                                        if (zF3 || objQ3 == l1.m.f39353a) {
                                            objQ3 = new j(cVar10, cVar9, 3);
                                            sVar3.o0(objQ3);
                                        }
                                        a.m(cVar9, zEquals3, (fz.a) objQ3, sVar3, 0);
                                    }
                                    sVar3.p(false);
                                    sVar3.p(true);
                                } else {
                                    sVar3.W();
                                }
                                break;
                        }
                        return b0.f48488a;
                    }
                }, true, -1048716710), 3);
                l0.h.p(LazyColumn3, null, new t1.d(new fz.f() { // from class: gs.l
                    @Override // fz.f
                    public final Object invoke(Object obj6, Object obj7, Object obj8) {
                        int i24 = i16;
                        l0.c item = (l0.c) obj6;
                        l1.n nVar2 = (l1.n) obj7;
                        int iIntValue = ((Integer) obj8).intValue();
                        switch (i24) {
                            case 0:
                                kotlin.jvm.internal.m.f(item, "$this$item");
                                l1.s sVar = (l1.s) nVar2;
                                if (sVar.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    dVar2.getClass();
                                    a.l(0, R.string.chinese_tone_yi_desc, 6, 2, sVar, null);
                                } else {
                                    sVar.W();
                                }
                                break;
                            case 1:
                                kotlin.jvm.internal.m.f(item, "$this$item");
                                l1.s sVar2 = (l1.s) nVar2;
                                if (sVar2.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    dVar2.getClass();
                                    a.l(R.string.chinese_tone_yi_subtitle1, 0, 384, 2, sVar2, null);
                                } else {
                                    sVar2.W();
                                }
                                break;
                            case 2:
                                kotlin.jvm.internal.m.f(item, "$this$item");
                                l1.s sVar3 = (l1.s) nVar2;
                                if (sVar3.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    dVar2.getClass();
                                    a.l(R.string.chinese_tone_yi_subtitle2, 0, 0, 6, sVar3, null);
                                } else {
                                    sVar3.W();
                                }
                                break;
                            default:
                                kotlin.jvm.internal.m.f(item, "$this$item");
                                l1.s sVar4 = (l1.s) nVar2;
                                if (sVar4.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    dVar2.getClass();
                                    a.l(R.string.chinese_tone_yi_subtitle3, 0, 0, 6, sVar4, null);
                                } else {
                                    sVar4.W();
                                }
                                break;
                        }
                        return b0.f48488a;
                    }
                }, true, 1243939257), 3);
                l0.h.p(LazyColumn3, null, new t1.d(new fz.f() { // from class: gs.k
                    @Override // fz.f
                    public final Object invoke(Object obj6, Object obj7, Object obj8) {
                        int i24 = i15;
                        l0.c item = (l0.c) obj6;
                        l1.n nVar2 = (l1.n) obj7;
                        int iIntValue = ((Integer) obj8).intValue();
                        switch (i24) {
                            case 0:
                                kotlin.jvm.internal.m.f(item, "$this$item");
                                l1.s sVar = (l1.s) nVar2;
                                if (sVar.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    u uVarA = t.a(j0.i.g(16), z1.c.O, sVar, 6);
                                    int iHashCode = Long.hashCode(sVar.T);
                                    q1 q1VarL = sVar.l();
                                    z1.r rVarC = z1.a.c(sVar, z1.o.f58481a);
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
                                    y2.h hVar2 = y2.j.f56918g;
                                    if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                                        defpackage.e.A(iHashCode, sVar, iHashCode, hVar2);
                                    }
                                    l1.t.J(y2.j.f56915d, rVarC, sVar);
                                    sVar.d0(-1344039322);
                                    for (bs.c cVar5 : dVar2.f5120c) {
                                        boolean zEquals = str3.equals(cVar5.f5117f);
                                        fz.c cVar6 = cVar4;
                                        boolean zF = sVar.f(cVar6) | sVar.f(cVar5);
                                        Object objQ = sVar.Q();
                                        if (zF || objQ == l1.m.f39353a) {
                                            objQ = new j(cVar6, cVar5, 2);
                                            sVar.o0(objQ);
                                        }
                                        a.m(cVar5, zEquals, (fz.a) objQ, sVar, 0);
                                    }
                                    sVar.p(false);
                                    sVar.p(true);
                                } else {
                                    sVar.W();
                                }
                                break;
                            case 1:
                                kotlin.jvm.internal.m.f(item, "$this$item");
                                l1.s sVar2 = (l1.s) nVar2;
                                if (sVar2.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    u uVarA2 = t.a(j0.i.g(16), z1.c.O, sVar2, 6);
                                    int iHashCode2 = Long.hashCode(sVar2.T);
                                    q1 q1VarL2 = sVar2.l();
                                    z1.r rVarC2 = z1.a.c(sVar2, z1.o.f58481a);
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
                                    y2.h hVar3 = y2.j.f56918g;
                                    if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode2))) {
                                        defpackage.e.A(iHashCode2, sVar2, iHashCode2, hVar3);
                                    }
                                    l1.t.J(y2.j.f56915d, rVarC2, sVar2);
                                    sVar2.d0(-1040685079);
                                    for (bs.c cVar7 : dVar2.f5118a) {
                                        boolean zEquals2 = str3.equals(cVar7.f5117f);
                                        fz.c cVar8 = cVar4;
                                        boolean zF2 = sVar2.f(cVar8) | sVar2.f(cVar7);
                                        Object objQ2 = sVar2.Q();
                                        if (zF2 || objQ2 == l1.m.f39353a) {
                                            objQ2 = new j(cVar8, cVar7, 4);
                                            sVar2.o0(objQ2);
                                        }
                                        a.m(cVar7, zEquals2, (fz.a) objQ2, sVar2, 0);
                                    }
                                    sVar2.p(false);
                                    sVar2.p(true);
                                } else {
                                    sVar2.W();
                                }
                                break;
                            default:
                                kotlin.jvm.internal.m.f(item, "$this$item");
                                l1.s sVar3 = (l1.s) nVar2;
                                if (sVar3.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    u uVarA3 = t.a(j0.i.g(16), z1.c.O, sVar3, 6);
                                    int iHashCode3 = Long.hashCode(sVar3.T);
                                    q1 q1VarL3 = sVar3.l();
                                    z1.r rVarC3 = z1.a.c(sVar3, z1.o.f58481a);
                                    y2.k.J.getClass();
                                    y2.i iVar3 = y2.j.f56913b;
                                    sVar3.h0();
                                    if (sVar3.S) {
                                        sVar3.k(iVar3);
                                    } else {
                                        sVar3.r0();
                                    }
                                    l1.t.J(y2.j.f56917f, uVarA3, sVar3);
                                    l1.t.J(y2.j.f56916e, q1VarL3, sVar3);
                                    y2.h hVar4 = y2.j.f56918g;
                                    if (sVar3.S || !kotlin.jvm.internal.m.a(sVar3.Q(), Integer.valueOf(iHashCode3))) {
                                        defpackage.e.A(iHashCode3, sVar3, iHashCode3, hVar4);
                                    }
                                    l1.t.J(y2.j.f56915d, rVarC3, sVar3);
                                    sVar3.d0(-1192362200);
                                    for (bs.c cVar9 : dVar2.f5119b) {
                                        boolean zEquals3 = str3.equals(cVar9.f5117f);
                                        fz.c cVar10 = cVar4;
                                        boolean zF3 = sVar3.f(cVar10) | sVar3.f(cVar9);
                                        Object objQ3 = sVar3.Q();
                                        if (zF3 || objQ3 == l1.m.f39353a) {
                                            objQ3 = new j(cVar10, cVar9, 3);
                                            sVar3.o0(objQ3);
                                        }
                                        a.m(cVar9, zEquals3, (fz.a) objQ3, sVar3, 0);
                                    }
                                    sVar3.p(false);
                                    sVar3.p(true);
                                } else {
                                    sVar3.W();
                                }
                                break;
                        }
                        return b0.f48488a;
                    }
                }, true, -758372072), 3);
                l0.h.p(LazyColumn3, null, new t1.d(new fz.f() { // from class: gs.l
                    @Override // fz.f
                    public final Object invoke(Object obj6, Object obj7, Object obj8) {
                        int i24 = i15;
                        l0.c item = (l0.c) obj6;
                        l1.n nVar2 = (l1.n) obj7;
                        int iIntValue = ((Integer) obj8).intValue();
                        switch (i24) {
                            case 0:
                                kotlin.jvm.internal.m.f(item, "$this$item");
                                l1.s sVar = (l1.s) nVar2;
                                if (sVar.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    dVar2.getClass();
                                    a.l(0, R.string.chinese_tone_yi_desc, 6, 2, sVar, null);
                                } else {
                                    sVar.W();
                                }
                                break;
                            case 1:
                                kotlin.jvm.internal.m.f(item, "$this$item");
                                l1.s sVar2 = (l1.s) nVar2;
                                if (sVar2.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    dVar2.getClass();
                                    a.l(R.string.chinese_tone_yi_subtitle1, 0, 384, 2, sVar2, null);
                                } else {
                                    sVar2.W();
                                }
                                break;
                            case 2:
                                kotlin.jvm.internal.m.f(item, "$this$item");
                                l1.s sVar3 = (l1.s) nVar2;
                                if (sVar3.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    dVar2.getClass();
                                    a.l(R.string.chinese_tone_yi_subtitle2, 0, 0, 6, sVar3, null);
                                } else {
                                    sVar3.W();
                                }
                                break;
                            default:
                                kotlin.jvm.internal.m.f(item, "$this$item");
                                l1.s sVar4 = (l1.s) nVar2;
                                if (sVar4.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    dVar2.getClass();
                                    a.l(R.string.chinese_tone_yi_subtitle3, 0, 0, 6, sVar4, null);
                                } else {
                                    sVar4.W();
                                }
                                break;
                        }
                        return b0.f48488a;
                    }
                }, true, 1534283895), 3);
                l0.h.p(LazyColumn3, null, new t1.d(new bp.u(i12, (fz.a) obj2), true, -468027434), 3);
                return b0Var;
            case 14:
                EditText editText = (EditText) obj2;
                kotlin.jvm.internal.m.f((View) obj, "it");
                ((ViewPager2) obj5).setVisibility(8);
                ((ImageView) obj4).setVisibility(0);
                ((ImageView) obj3).setVisibility(8);
                editText.setText(BuildConfig.VERSION_NAME);
                editText.clearFocus();
                return b0Var;
            case 15:
                String str4 = (String) obj5;
                PdLesson item = (PdLesson) obj2;
                kotlin.jvm.internal.m.f((View) obj, "it");
                cf.x.z();
                gh.c.e(str4);
                ((ImageView) obj4).setImageResource(R.drawable.ic_pd_word_tag_un_fav);
                a5.j jVar2 = ((PdFavAdapter) obj3).f21625b;
                if (jVar2 != null) {
                    cf.x.z();
                    PdLessonDbHelper pdLessonDbHelper = PdLessonDbHelper.INSTANCE;
                    PdLessonFav pdLessonFav = (PdLessonFav) pdLessonDbHelper.pdLessonFavDao().load(str4);
                    if (pdLessonFav != null) {
                        pdLessonFav.getFav();
                    }
                    kotlin.jvm.internal.m.f(item, "item");
                    hh.f fVar = (hh.f) jVar2.f385b;
                    jh.a aVar3 = fVar.P;
                    String str5 = txBUGYhC.kUYZDd;
                    if (aVar3 == null) {
                        kotlin.jvm.internal.m.n(str5);
                        throw null;
                    }
                    MutableLiveData mutableLiveData = aVar3.f36339b;
                    k10.g gVarQueryBuilder = pdLessonDbHelper.pdLessonFavDao().queryBuilder();
                    org.greenrobot.greendao.d dVar3 = PdLessonFavDao.Properties.Id;
                    int[] iArr = bq.r.f4959a;
                    LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                    gVarQueryBuilder.f(dVar3.e(bq.m.k(cf.x.n().keyLanguage).concat("%")), PdLessonFavDao.Properties.Fav.b(1));
                    gVarQueryBuilder.e(" DESC", PdLessonFavDao.Properties.Time);
                    mutableLiveData.setValue(gVarQueryBuilder.d());
                    jh.a aVar4 = fVar.P;
                    if (aVar4 == null) {
                        kotlin.jvm.internal.m.n(str5);
                        throw null;
                    }
                    aVar4.f36338a.setValue(item);
                }
                return b0Var;
            case 16:
                ImageView imageView = (ImageView) obj3;
                kotlin.jvm.internal.m.f((View) obj, "it");
                View itemView = ((BaseViewHolder) obj4).itemView;
                kotlin.jvm.internal.m.e(itemView, "itemView");
                kotlin.jvm.internal.m.c(imageView);
                ((PdLearnDetailAdapter) obj5).d(itemView, imageView, (PdSentence) obj2, true);
                return b0Var;
            case 17:
                PdVocabularyAdapter pdVocabularyAdapter = (PdVocabularyAdapter) obj5;
                ImageView imageView2 = (ImageView) obj4;
                String str6 = (String) obj3;
                fv.a aVar5 = (fv.a) obj2;
                kotlin.jvm.internal.m.f((View) obj, "it");
                ImageView imageView3 = pdVocabularyAdapter.f21654c;
                th.e eVar3 = pdVocabularyAdapter.f21652a;
                if (imageView3 != null && (drawable = imageView3.getDrawable()) != null && (drawable instanceof AnimationDrawable)) {
                    AnimationDrawable animationDrawable = (AnimationDrawable) drawable;
                    animationDrawable.selectDrawable(0);
                    animationDrawable.stop();
                }
                pdVocabularyAdapter.f21654c = imageView2;
                Drawable drawable2 = imageView2.getDrawable();
                kotlin.jvm.internal.m.e(drawable2, "getDrawable(...)");
                if (drawable2 instanceof AnimationDrawable) {
                    ((AnimationDrawable) drawable2).start();
                }
                ci.a0 a0Var = new ci.a0(imageView2, i16);
                eVar3.getClass();
                eVar3.f52416c = a0Var;
                eVar3.h(str6);
                if (!new File(str6).exists()) {
                    pdVocabularyAdapter.f21655d.d(aVar5, new fj.a(i16, pdVocabularyAdapter, str6));
                }
                return b0Var;
            case 18:
                kr.l lVar3 = (kr.l) obj5;
                fz.c cVar5 = (fz.c) obj3;
                fz.c cVar6 = (fz.c) obj4;
                l0.h LazyColumn4 = (l0.h) obj;
                kotlin.jvm.internal.m.f(LazyColumn4, "$this$LazyColumn");
                l0.h.p(LazyColumn4, null, new t1.d(new br.j(lVar3, cVar5, cVar6, (fz.a) obj2, 6), true, -674074625), 3);
                List list = lVar3.f38516b;
                LazyColumn4.q(list.size(), null, new bp.p0(10, list), new t1.d(new bp.e1(list, cVar5, cVar6, lVar3), true, 2039820996));
                l0.h.p(LazyColumn4, null, jr.a.f36566k, 3);
                return b0Var;
            case 19:
                List list2 = (List) obj5;
                kotlin.jvm.internal.w wVar = (kotlin.jvm.internal.w) obj4;
                List list3 = (List) obj3;
                m0.p pVar = (m0.p) obj2;
                n0.z0 z0Var = (n0.z0) obj;
                w2.n1 n1Var = z0Var.f43046e;
                int iA = n1Var != null ? n1Var.a() : 0;
                int i24 = 0;
                for (int i25 = 0; i25 < iA; i25++) {
                    if (pVar.f40603q == f0.h1.Vertical) {
                        w2.n1 n1Var2 = z0Var.f43046e;
                        jB = (n1Var2 != null ? n1Var2.b(i25) : 0L) & 4294967295L;
                    } else {
                        w2.n1 n1Var3 = z0Var.f43046e;
                        jB = (n1Var3 != null ? n1Var3.b(i25) : 0L) >> 32;
                    }
                    i24 += (int) jB;
                }
                if (list2 != null) {
                    list2.add(Integer.valueOf(i24));
                }
                if (wVar.f38359a != list3.size()) {
                    wVar.f38359a++;
                }
                return b0Var;
            case 20:
                j9.e it3 = (j9.e) obj;
                kotlin.jvm.internal.m.f(it3, "it");
                ((kotlin.jvm.internal.u) obj2).f38357a = true;
                ((m9.g) obj5).a((j9.q) obj4, (Bundle) obj3, it3, ry.r.f50854a);
                return b0Var;
            case 21:
                String it4 = (String) obj;
                kotlin.jvm.internal.m.f(it4, "it");
                ((l1.b1) obj2).setValue(Boolean.TRUE);
                ((fz.a) obj5).invoke();
                ((fz.e) obj4).invoke(obj3, it4);
                return b0Var;
            case 22:
                fz.c cVar7 = (fz.c) obj3;
                l1.b1 b1Var7 = (l1.b1) obj2;
                String it5 = (String) obj;
                kotlin.jvm.internal.m.f(it5, "it");
                ((l1.b1) obj4).setValue(Boolean.TRUE);
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Iterator it6 = ((List) obj5).iterator();
                while (it6.hasNext()) {
                    linkedHashSet.add(((rt.r) it6.next()).f50318a);
                }
                b1Var7.setValue(linkedHashSet);
                cVar7.invoke(it5);
                return b0Var;
            case 23:
                mt.q2 mode = (mt.q2) obj;
                kotlin.jvm.internal.m.f(mode, "mode");
                rz.e0.B((rz.b0) obj5, null, null, new jr.i0((rt.j2) obj4, mode, (j9.v) obj3, (l1.b1) obj2, null, 7), 3);
                return b0Var;
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                e3 e3Var = (e3) obj5;
                l1.b1 b1Var8 = (l1.b1) obj4;
                l1.b1 b1Var9 = (l1.b1) obj3;
                l1.b1 b1Var10 = (l1.b1) obj2;
                ht.o params = (ht.o) obj;
                kotlin.jvm.internal.m.f(params, "params");
                ja jaVarG = e3Var.g(params);
                if (jaVarG != null && ((ka) e3Var.i(params).getValue()).f49982b) {
                    objArr = 1;
                }
                if (jaVarG == null || objArr != 0) {
                    ja jaVarJ = e3Var.j(params);
                    if (jaVarJ != null) {
                        e3Var.G(jaVarJ);
                    }
                } else {
                    if (((Boolean) b1Var8.getValue()).booleanValue()) {
                        ja jaVar2 = (ja) b1Var9.getValue();
                        if (!kotlin.jvm.internal.m.a(jaVar2 != null ? jaVar2.f49927a : null, jaVarG.f49927a) && (jaVar = (ja) b1Var9.getValue()) != null) {
                            e3Var.c(jaVar, "__default_bookmark_folder__");
                        }
                    }
                    b1Var10.setValue(jaVarG);
                }
                return b0Var;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                n0.l0 l0Var = (n0.l0) obj5;
                bq.f fVar2 = new bq.f();
                fVar2.f4944b = (n0.y) obj4;
                fVar2.f4945c = (w2.p1) obj3;
                fVar2.f4946d = (n0.a1) obj2;
                fVar2.f4943a = true;
                l0Var.f42970c = fVar2;
                return new bt.j1(l0Var, 9);
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                LeaderBoardUser leaderBoardUser = (LeaderBoardUser) obj;
                kotlin.jvm.internal.m.f(leaderBoardUser, "leaderBoardUser");
                ((l1.b1) obj5).setValue(leaderBoardUser);
                ((l1.b1) obj4).setValue(Boolean.TRUE);
                rz.e0.B((rz.b0) obj3, null, null, new qu.j((ur.a) obj2, null), 3);
                return b0Var;
            case 27:
                s0.s0 s0Var = (s0.s0) obj5;
                o3.x xVar = (o3.x) obj4;
                o3.w wVar2 = (o3.w) obj3;
                o3.j jVar3 = (o3.j) obj2;
                if (s0Var.b()) {
                    ob.c cVar8 = s0Var.f51169d;
                    s0.w wVar3 = s0Var.f51186v;
                    s0.w wVar4 = s0Var.f51187w;
                    kotlin.jvm.internal.y yVar = new kotlin.jvm.internal.y();
                    pr.a0 a0Var2 = new pr.a0(cVar8, wVar3, yVar, 19);
                    o3.r rVar = xVar.f44707a;
                    rVar.e(wVar2, jVar3, a0Var2, wVar4);
                    o3.c0 c0Var = new o3.c0(xVar, rVar);
                    xVar.f44708b.set(c0Var);
                    yVar.f38361a = c0Var;
                    s0Var.f51170e = c0Var;
                }
                return new s0.c0();
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                CheckBox checkBox = (CheckBox) obj4;
                kotlin.jvm.internal.m.f((View) obj, "it");
                ((BaseReviewGroup) obj5).setChecked(checkBox.isChecked());
                ((BaseReviewCateAdapter) obj3).getClass();
                checkBox.isChecked();
                ((BaseViewHolder) obj2).getAdapterPosition();
                throw null;
            default:
                l1.b1 b1Var11 = (l1.b1) obj5;
                Context context = (Context) obj4;
                g.j jVar4 = (g.j) obj3;
                l1.b1 b1Var12 = (l1.b1) obj2;
                if (((Boolean) obj).booleanValue() && (uri = (Uri) b1Var11.getValue()) != null) {
                    Uri uriD = FileProvider.d(context, context.getPackageName() + ".fileprovider", File.createTempFile("ocr_cropped_", ".jpg", context.getExternalFilesDir(Environment.DIRECTORY_PICTURES)));
                    b1Var12.setValue(uriD);
                    Intent intent = UCrop.of(uri, uriD).getIntent(context);
                    intent.addFlags(1);
                    intent.addFlags(2);
                    jVar4.a(intent);
                }
                return b0Var;
        }
    }

    public /* synthetic */ a(ArrayList arrayList, kotlin.jvm.internal.w wVar, List list, int i11, m0.p pVar) {
        this.f3416a = 19;
        this.f3417b = arrayList;
        this.f3418c = wVar;
        this.f3419d = list;
        this.f3420e = pVar;
    }

    public /* synthetic */ a(kotlin.jvm.internal.u uVar, m9.g gVar, j9.q qVar, Bundle bundle) {
        this.f3416a = 20;
        this.f3420e = uVar;
        this.f3417b = gVar;
        this.f3418c = qVar;
        this.f3419d = bundle;
    }
}
