package j9;

import a.ar.MFeWs;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import b0.l0;
import com.google.android.flexbox.FlexboxLayout;
import com.google.android.material.card.MaterialCardView;
import com.google.api.Service;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.japanskill.ui.syllable.JPHwCharListActivity;
import com.lingo.lingoskill.object.BaseYintuIntel;
import com.lingo.lingoskill.object.CharGroup;
import com.lingo.lingoskill.object.ReviewNew;
import com.lingo.lingoskill.object.Unit;
import com.lingo.lingoskill.object.YinTu;
import com.lingo.lingoskill.object.YouYin;
import com.lingo.lingoskill.speak.object.PodSelect;
import com.lingo.lingoskill.ui.review.ReviewTestActivity;
import com.lingo.story.ui.StoryActivity;
import com.lingodeer.R;
import com.lingodeer.data.model.CourseQuestionPreference;
import com.lingodeer.data.model.CourseQuestionPreferenceContext;
import com.lingodeer.data.model.INTENTS;
import dt.p4;
import fr.o0;
import hj.x3;
import j3.i0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import jp.p0;
import jp.q0;
import jp.u0;
import km.d1;
import km.f1;
import km.i1;
import km.j1;
import kotlin.NoWhenBranchMatchedException;
import kr.h0;
import kr.j0;
import l1.a2;
import l1.b1;
import l1.b3;
import l1.d2;
import mt.i4;
import n0.x0;
import r.x2;
import rt.c9;
import rt.e3;
import rt.k6;
import rt.l9;
import rt.ue;
import rt.y8;
import vt.n0;
import z4.s0;
import z4.w0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f36200b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f36201c;

    public /* synthetic */ h(int i11, Object obj, Object obj2) {
        this.f36199a = i11;
        this.f36200b = obj;
        this.f36201c = obj2;
    }

    public /* synthetic */ h(fz.c cVar, int i11, String[] strArr) {
        this.f36199a = 25;
        this.f36200b = cVar;
        this.f36201c = strArr;
    }

    /* JADX WARN: Type inference failed for: r2v18, types: [java.lang.Object, qy.h] */
    @Override // fz.c
    public final Object invoke(Object obj) {
        Lifecycle lifecycle;
        CourseQuestionPreferenceContext courseQuestionPreferenceContext;
        int i11 = 6;
        int i12 = 19;
        Throwable th2 = null;
        switch (this.f36199a) {
            case 0:
                q qVar = (q) this.f36200b;
                m9.g gVar = ((v) this.f36201c).f36257b;
                z navOptions = (z) obj;
                kotlin.jvm.internal.m.f(navOptions, "$this$navOptions");
                x xVar = navOptions.f36277a;
                xVar.f36267e = 0;
                xVar.f36268f = 0;
                if (qVar instanceof s) {
                    int i13 = q.f36240e;
                    for (q qVar2 : cf.x.o(qVar)) {
                        q qVarG = gVar.g();
                        if (kotlin.jvm.internal.m.a(qVar2, qVarG != null ? qVarG.f36243c : null)) {
                        }
                    }
                    int i14 = s.f36250t;
                    Iterator it = nz.n.U(gVar.h(), new i0(29)).iterator();
                    if (!it.hasNext()) {
                        throw new NoSuchElementException("Sequence is empty.");
                    }
                    Object next = it.next();
                    while (it.hasNext()) {
                        next = it.next();
                    }
                    navOptions.f36280d = ((q) next).f36242b.f3958a;
                    navOptions.f36282f = false;
                    e0 e0Var = new e0();
                    e0Var.f36195b = true;
                    navOptions.f36282f = e0Var.f36194a;
                    navOptions.f36283g = e0Var.f36195b;
                }
                return qy.b0.f48488a;
            case 1:
                p0 p0Var = (p0) this.f36200b;
                Unit unit = (Unit) this.f36201c;
                if (!p0Var.r().hasClickedTips) {
                    p0Var.r().hasClickedTips = true;
                    p0Var.r().updateEntry("hasClickedTips");
                    ta.a aVar = p0Var.f36400f;
                    kotlin.jvm.internal.m.c(aVar);
                    ((ImageView) ((x3) aVar).f33575h.f32798g).setImageResource(R.drawable.ic_theme_btn_ls);
                }
                LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                if (ry.l.D(new Integer[]{18, 19, 69}, Integer.valueOf(cf.x.n().keyLanguage))) {
                    String description = unit.getDescription();
                    kotlin.jvm.internal.m.e(description, "getDescription(...)");
                    long unitId = unit.getUnitId();
                    int sortIndex = unit.getSortIndex();
                    Bundle bundle = new Bundle();
                    bundle.putString(INTENTS.EXTRA_STRING, description);
                    bundle.putLong(INTENTS.EXTRA_LONG, unitId);
                    bundle.putInt(INTENTS.EXTRA_INT, sortIndex);
                    q0 q0Var = new q0();
                    q0Var.setArguments(bundle);
                    q0Var.u(p0Var.getChildFragmentManager(), "BaseTipsBottomDialogFragment");
                } else {
                    String description2 = unit.getDescription();
                    kotlin.jvm.internal.m.e(description2, "getDescription(...)");
                    long unitId2 = unit.getUnitId();
                    int sortIndex2 = unit.getSortIndex();
                    Bundle bundle2 = new Bundle();
                    bundle2.putString(INTENTS.EXTRA_STRING, description2);
                    bundle2.putLong(INTENTS.EXTRA_LONG, unitId2);
                    bundle2.putInt(INTENTS.EXTRA_INT, sortIndex2);
                    u0 u0Var = new u0();
                    u0Var.setArguments(bundle2);
                    u0Var.u(p0Var.getChildFragmentManager(), "BaseTipsBottomDialogFragment");
                }
                if (p0Var.f36534j0.length() > 0) {
                    p0Var.t().c("jxz_main_click_in_lesson_tips", new jp.i0(p0Var, i11));
                }
                return qy.b0.f48488a;
            case 2:
                StoryActivity storyActivity = (StoryActivity) this.f36200b;
                b1 b1Var = (b1) this.f36201c;
                h0 it2 = (h0) obj;
                int i15 = StoryActivity.N;
                kotlin.jvm.internal.m.f(it2, "it");
                ((kr.p0) storyActivity.M.getValue()).a(new j0(it2));
                b1Var.setValue(Boolean.FALSE);
                return qy.b0.f48488a;
            case 3:
                return new l0(11, (b3) this.f36200b, (k9.i) this.f36201c);
            case 4:
                v vVar = (v) this.f36201c;
                LifecycleOwner owner = (LifecycleOwner) this.f36200b;
                vVar.getClass();
                kotlin.jvm.internal.m.f(owner, "owner");
                m9.g gVar2 = vVar.f36257b;
                p4 p4Var = gVar2.f41086r;
                if (!owner.equals(gVar2.f41082n)) {
                    LifecycleOwner lifecycleOwner = gVar2.f41082n;
                    if (lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
                        lifecycle.removeObserver(p4Var);
                    }
                    gVar2.f41082n = owner;
                    owner.getLifecycle().addObserver(p4Var);
                }
                return new k9.u();
            case 5:
                CharGroup charGroup = (CharGroup) this.f36200b;
                JPHwCharListActivity jPHwCharListActivity = (JPHwCharListActivity) this.f36201c;
                int i16 = JPHwCharListActivity.S;
                kotlin.jvm.internal.m.f((View) obj, "it");
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                for (Long l9 : charGroup.getIds()) {
                    ReviewNew reviewNew = new ReviewNew();
                    reviewNew.setElemType(2);
                    if (ij.i.f34434b == null) {
                        synchronized (ij.i.class) {
                            if (ij.i.f34434b == null) {
                                ij.i.f34434b = new ij.i();
                            }
                            break;
                        }
                    }
                    kotlin.jvm.internal.m.c(ij.i.f34434b);
                    kotlin.jvm.internal.m.c(l9);
                    reviewNew.setCwsId(ij.i.a(l9.longValue(), 2, ((o0) jPHwCharListActivity.l()).f27733a.keyLanguage));
                    arrayList.add(reviewNew);
                }
                if (arrayList.size() > 0) {
                    Intent intent = new Intent(jPHwCharListActivity, (Class<?>) ReviewTestActivity.class);
                    intent.putExtra(INTENTS.EXTRA_INT, 2);
                    intent.putExtra(INTENTS.EXTRA_INT_2, -1);
                    intent.putParcelableArrayListExtra(INTENTS.EXTRA_ARRAY_LIST, arrayList);
                    jPHwCharListActivity.startActivity(intent);
                }
                b7.e0.A(jPHwCharListActivity.m(), "jxz_cr_practice_start");
                return qy.b0.f48488a;
            case 6:
                j1 j1Var = (j1) this.f36200b;
                YouYin youYin = (YouYin) this.f36201c;
                kotlin.jvm.internal.m.f((View) obj, "it");
                a9.i iVar = j1Var.O;
                kotlin.jvm.internal.m.c(iVar);
                qy.q qVar3 = fv.b.f28186a;
                String luoMa = youYin.getLuoMa();
                kotlin.jvm.internal.m.e(luoMa, "getLuoMa(...)");
                iVar.v(fv.b.c(luoMa, null, null));
                return qy.b0.f48488a;
            case 7:
                d1 d1Var = (d1) this.f36200b;
                BaseYintuIntel baseYintuIntel = (BaseYintuIntel) this.f36201c;
                kotlin.jvm.internal.m.f((View) obj, "it");
                a9.i iVar2 = d1Var.O;
                kotlin.jvm.internal.m.c(iVar2);
                qy.q qVar4 = fv.b.f28186a;
                String luoMa2 = baseYintuIntel.getLuoMa();
                kotlin.jvm.internal.m.e(luoMa2, "getLuoMa(...)");
                iVar2.v(fv.b.c(luoMa2, null, null));
                return qy.b0.f48488a;
            case 8:
                f1 f1Var = (f1) this.f36200b;
                YinTu yinTu = (YinTu) this.f36201c;
                kotlin.jvm.internal.m.f((View) obj, "it");
                a9.i iVar3 = f1Var.O;
                kotlin.jvm.internal.m.c(iVar3);
                qy.q qVar5 = fv.b.f28186a;
                String luoMa3 = yinTu.getLuoMa();
                kotlin.jvm.internal.m.e(luoMa3, "getLuoMa(...)");
                iVar3.v(fv.b.c(luoMa3, null, null));
                return qy.b0.f48488a;
            case 9:
                f1 f1Var2 = (f1) this.f36200b;
                YouYin youYin2 = (YouYin) this.f36201c;
                kotlin.jvm.internal.m.f((View) obj, "it");
                a9.i iVar4 = f1Var2.O;
                kotlin.jvm.internal.m.c(iVar4);
                qy.q qVar6 = fv.b.f28186a;
                String luoMa4 = youYin2.getLuoMa();
                kotlin.jvm.internal.m.e(luoMa4, "getLuoMa(...)");
                iVar4.v(fv.b.c(luoMa4, null, null));
                return qy.b0.f48488a;
            case 10:
                f1 f1Var3 = (f1) this.f36200b;
                BaseYintuIntel baseYintuIntel2 = (BaseYintuIntel) this.f36201c;
                kotlin.jvm.internal.m.f((View) obj, "it");
                a9.i iVar5 = f1Var3.O;
                kotlin.jvm.internal.m.c(iVar5);
                qy.q qVar7 = fv.b.f28186a;
                String luoMa5 = baseYintuIntel2.getLuoMa();
                kotlin.jvm.internal.m.e(luoMa5, "getLuoMa(...)");
                iVar5.v(fv.b.c(luoMa5, null, null));
                return qy.b0.f48488a;
            case 11:
                i1 i1Var = (i1) this.f36200b;
                YinTu yinTu2 = (YinTu) this.f36201c;
                kotlin.jvm.internal.m.f((View) obj, "it");
                a9.i iVar6 = i1Var.O;
                kotlin.jvm.internal.m.c(iVar6);
                qy.q qVar8 = fv.b.f28186a;
                String luoMa6 = yinTu2.getLuoMa();
                kotlin.jvm.internal.m.e(luoMa6, "getLuoMa(...)");
                iVar6.v(fv.b.c(luoMa6, null, null));
                return qy.b0.f48488a;
            case 12:
                l1.z zVar = (l1.z) this.f36200b;
                y.j0 j0Var = (y.j0) this.f36201c;
                zVar.z(obj);
                if (j0Var != null) {
                    j0Var.a(obj);
                }
                return qy.b0.f48488a;
            case 13:
                d2 d2Var = (d2) this.f36200b;
                Throwable th3 = (Throwable) this.f36201c;
                Throwable th4 = (Throwable) obj;
                synchronized (d2Var.f39259d) {
                    if (th3 != null) {
                        if (th4 != null) {
                            try {
                                th2 = th4 instanceof CancellationException ? null : th4;
                                if (th2 != null) {
                                    cf.x.b(th3, th2);
                                }
                            } catch (Throwable th5) {
                                throw th5;
                            }
                        }
                        th2 = th3;
                    }
                    d2Var.f39261f = th2;
                    d2Var.f39276v.k(a2.ShutDown);
                }
                return qy.b0.f48488a;
            case 14:
                x2 x2Var = (x2) this.f36200b;
                MaterialCardView materialCardView = (MaterialCardView) this.f36201c;
                kotlin.jvm.internal.m.f((View) obj, MFeWs.fSqPSUSxezcIK);
                PodSelect podSelect = (PodSelect) x2Var.f48713e;
                ArrayList arrayList2 = (ArrayList) x2Var.f48715t;
                Context context = (Context) x2Var.f48709a;
                op.a answerWord = podSelect.getAnswerWord();
                kotlin.jvm.internal.m.e(answerWord, "getAnswerWord(...)");
                ArrayList arrayList3 = (ArrayList) x2Var.f48714f;
                Object tag = materialCardView.getTag();
                kotlin.jvm.internal.m.d(tag, "null cannot be cast to non-null type kotlin.Int");
                boolean zA = kotlin.jvm.internal.m.a(((op.a) arrayList3.get(((Integer) tag).intValue())).getWord(), answerWord.getWord());
                int i17 = R.id.tv_middle;
                int i18 = R.id.tv_top;
                if (zA) {
                    materialCardView.setCardBackgroundColor(context.getColor(R.color.color_43CC93));
                    TextView textView = (TextView) materialCardView.findViewById(R.id.tv_top);
                    TextView textView2 = (TextView) materialCardView.findViewById(R.id.tv_middle);
                    TextView textView3 = (TextView) materialCardView.findViewById(R.id.tv_bottom);
                    textView.setTextColor(context.getColor(R.color.white));
                    textView2.setTextColor(context.getColor(R.color.white));
                    textView3.setTextColor(context.getColor(R.color.white));
                    View childAt = materialCardView.getChildAt(1);
                    kotlin.jvm.internal.m.d(childAt, "null cannot be cast to non-null type android.widget.ImageView");
                    ImageView imageView = (ImageView) childAt;
                    imageView.setVisibility(0);
                    cf.x.L(imageView, R.drawable.ic_redo_penal_check, ColorStateList.valueOf(context.getColor(R.color.white)));
                } else {
                    int size = arrayList2.size();
                    int i19 = 0;
                    while (i19 < size) {
                        Object obj2 = arrayList2.get(i19);
                        i19++;
                        MaterialCardView materialCardView2 = (MaterialCardView) obj2;
                        if (materialCardView2.getTag() != null) {
                            Object tag2 = materialCardView2.getTag();
                            kotlin.jvm.internal.m.d(tag2, "null cannot be cast to non-null type kotlin.Int");
                            if (kotlin.jvm.internal.m.a(((op.a) arrayList3.get(((Integer) tag2).intValue())).getWord(), answerWord.getWord())) {
                                materialCardView.setCardBackgroundColor(context.getColor(R.color.color_FF6666));
                                TextView textView4 = (TextView) materialCardView.findViewById(i18);
                                TextView textView5 = (TextView) materialCardView.findViewById(i17);
                                TextView textView6 = (TextView) materialCardView.findViewById(R.id.tv_bottom);
                                op.a aVar2 = answerWord;
                                textView4.setTextColor(context.getColor(R.color.white));
                                textView5.setTextColor(context.getColor(R.color.white));
                                textView6.setTextColor(context.getColor(R.color.white));
                                TextView textView7 = (TextView) materialCardView2.findViewById(R.id.tv_top);
                                TextView textView8 = (TextView) materialCardView2.findViewById(R.id.tv_middle);
                                TextView textView9 = (TextView) materialCardView2.findViewById(R.id.tv_bottom);
                                textView7.setTextColor(context.getColor(R.color.color_43CC93));
                                textView8.setTextColor(context.getColor(R.color.color_43CC93));
                                textView9.setTextColor(context.getColor(R.color.color_43CC93));
                                View childAt2 = materialCardView2.getChildAt(1);
                                kotlin.jvm.internal.m.d(childAt2, "null cannot be cast to non-null type android.widget.ImageView");
                                ImageView imageView2 = (ImageView) childAt2;
                                imageView2.setVisibility(0);
                                cf.x.L(imageView2, R.drawable.ic_redo_penal_check, ColorStateList.valueOf(context.getColor(R.color.color_43CC93)));
                                answerWord = aVar2;
                                i18 = R.id.tv_top;
                                i17 = R.id.tv_middle;
                            } else {
                                i18 = R.id.tv_top;
                            }
                        } else {
                            i18 = R.id.tv_top;
                        }
                    }
                }
                int size2 = arrayList2.size();
                int i21 = 0;
                while (i21 < size2) {
                    Object obj3 = arrayList2.get(i21);
                    i21++;
                    ((MaterialCardView) obj3).setClickable(false);
                }
                th.j.a(qx.h.m(1000L, TimeUnit.MILLISECONDS, ky.e.f38937b).g(px.b.a()).h(new hd.d(x2Var, 28), lo.a.f40176a), (n9.q) x2Var.f48710b);
                return qy.b0.f48488a;
            case 15:
                lp.k kVar = (lp.k) this.f36200b;
                View view = (View) this.f36201c;
                View view2 = (View) obj;
                kotlin.jvm.internal.m.f(view2, "view");
                FlexboxLayout flexboxLayout = kVar.f40213j;
                lp.k.j(flexboxLayout);
                view2.setEnabled(false);
                int[] iArr = new int[2];
                view2.getLocationOnScreen(iArr);
                View view3 = (View) view2.getTag(R.id.bottom_view);
                int[] iArr2 = new int[2];
                if (view3 != null) {
                    int[] iArr3 = new int[2];
                    view2.getLocationOnScreen(iArr3);
                    view3.getLocationOnScreen(iArr2);
                    w0 w0VarB = s0.b(view3);
                    w0VarB.k(iArr3[0] - iArr2[0]);
                    w0VarB.m(iArr3[1] - iArr2[1]);
                    w0VarB.e(0L);
                    w0VarB.g(null);
                    w0VarB.f(new DecelerateInterpolator());
                    w0VarB.i();
                }
                int[] iArr4 = new int[2];
                ViewParent parent = view.getParent();
                kotlin.jvm.internal.m.d(parent, "null cannot be cast to non-null type android.widget.FrameLayout");
                ((FrameLayout) parent).getLocationOnScreen(iArr4);
                view.setVisibility(0);
                int i22 = iArr4[0] - iArr[0];
                int i23 = iArr4[1] - iArr[1];
                view.bringToFront();
                w0 w0VarB2 = s0.b(view);
                w0VarB2.k(i22);
                w0VarB2.m(i23);
                w0VarB2.e(200L);
                w0VarB2.g(new l.t(view, 6));
                w0VarB2.f(new DecelerateInterpolator());
                w0VarB2.i();
                flexboxLayout.removeView(view2);
                view2.setTag(R.id.bottom_view, null);
                kVar.i();
                return qy.b0.f48488a;
            case 16:
                mi.c cVar = (mi.c) ((oi.c) this.f36200b).f44926b;
                fz.c cVar2 = (fz.c) this.f36201c;
                Boolean bool = (Boolean) obj;
                if (bool != null && bool.booleanValue()) {
                    cVar.g();
                    cVar2.invoke(cVar.e());
                }
                return qy.b0.f48488a;
            case 17:
                m0.v vVar2 = (m0.v) this.f36200b;
                m0.n nVar = (m0.n) this.f36201c;
                m0.u uVarB = vVar2.b(((Integer) obj).intValue());
                int i24 = uVarB.f40633a;
                List list = uVarB.f40634b;
                ArrayList arrayList4 = new ArrayList(list.size());
                int size3 = list.size();
                int i25 = 0;
                for (int i26 = 0; i26 < size3; i26++) {
                    int i27 = (int) ((m0.d) list.get(i26)).f40543a;
                    arrayList4.add(new qy.l(Integer.valueOf(i24), new v3.a(nVar.a(i25, i27))));
                    i24++;
                    i25 += i27;
                }
                return arrayList4;
            case 18:
                m0.n nVar2 = (m0.n) this.f36200b;
                m0.m mVar = (m0.m) this.f36201c;
                int iIntValue = ((Integer) obj).intValue();
                m0.v vVar3 = (m0.v) nVar2.f40580f;
                int i28 = vVar3.f40643i;
                int iE = vVar3.e(iIntValue);
                return mVar.s0(iIntValue, 0, iE, mVar.f40572e, nVar2.a(0, iE));
            case 19:
                fz.e eVar = (fz.e) this.f36200b;
                Object obj4 = this.f36201c;
                String it3 = (String) obj;
                kotlin.jvm.internal.m.f(it3, "it");
                eVar.invoke(obj4, it3);
                return qy.b0.f48488a;
            case 20:
                fz.e eVar2 = (fz.e) this.f36200b;
                ue ueVar = (ue) this.f36201c;
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                eVar2.invoke(Long.valueOf(ueVar.f50510a), bool2);
                return qy.b0.f48488a;
            case 21:
                v vVar4 = (v) this.f36201c;
                b1 b1Var2 = (b1) this.f36200b;
                String result = (String) obj;
                kotlin.jvm.internal.m.f(result, "result");
                b1Var2.setValue(result);
                vVar4.a("finish", new lt.d(i12));
                return qy.b0.f48488a;
            case 22:
                n0 n0Var = (n0) this.f36200b;
                av.n nVar3 = (av.n) this.f36201c;
                wt.c0 rating = (wt.c0) obj;
                kotlin.jvm.internal.m.f(rating, "rating");
                if (((o0) n0Var).f27733a.allowSoundEffect) {
                    int i29 = i4.f41549a[rating.ordinal()];
                    if (i29 == 1) {
                        nVar3.k(R.raw.srs_status_again);
                    } else if (i29 == 2) {
                        nVar3.k(R.raw.srs_status_hard);
                    } else if (i29 == 3) {
                        nVar3.k(R.raw.srs_status_good);
                    } else {
                        if (i29 != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        nVar3.k(R.raw.srs_status_perfect);
                    }
                }
                return qy.b0.f48488a;
            case 23:
                qs.b bVar = (qs.b) this.f36200b;
                l9 l9Var = (l9) this.f36201c;
                CourseQuestionPreference preference = (CourseQuestionPreference) obj;
                kotlin.jvm.internal.m.f(preference, "preference");
                if (bVar != null && (courseQuestionPreferenceContext = bVar.f48312a) != null) {
                    l9Var.a(new c9(courseQuestionPreferenceContext, preference));
                }
                return qy.b0.f48488a;
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                av.n nVar4 = (av.n) this.f36200b;
                e3 e3Var = (e3) this.f36201c;
                l1.j0 DisposableEffect = (l1.j0) obj;
                kotlin.jvm.internal.m.f(DisposableEffect, "$this$DisposableEffect");
                return new l0(13, nVar4, e3Var);
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                fz.c cVar3 = (fz.c) this.f36200b;
                String[] strArr = (String[]) this.f36201c;
                int iIntValue2 = ((Integer) obj).intValue();
                int length = strArr.length;
                cVar3.invoke(Integer.valueOf(length > 0 ? hz.b.l(iIntValue2, 0, length - 1) : 0));
                return qy.b0.f48488a;
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                fz.e eVar3 = (fz.e) this.f36200b;
                y8 y8Var = (y8) this.f36201c;
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                eVar3.invoke(y8Var, bool3);
                return qy.b0.f48488a;
            case 27:
                fz.e eVar4 = (fz.e) this.f36200b;
                k6 k6Var = (k6) this.f36201c;
                String note = (String) obj;
                kotlin.jvm.internal.m.f(note, "note");
                eVar4.invoke(k6Var.f49973d, note);
                return qy.b0.f48488a;
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                fz.f fVar = (fz.f) this.f36200b;
                k6 k6Var2 = (k6) this.f36201c;
                Boolean bool4 = (Boolean) obj;
                bool4.booleanValue();
                fVar.invoke(k6Var2.f49972c.getId(), Long.valueOf(k6Var2.f49972c.getElemId()), bool4);
                return qy.b0.f48488a;
            default:
                x0 x0Var = (x0) this.f36200b;
                Object obj5 = this.f36201c;
                x0Var.f43028c.i(obj5);
                return new l0(14, x0Var, obj5);
        }
    }

    public /* synthetic */ h(v vVar, Object obj, int i11) {
        this.f36199a = i11;
        this.f36201c = vVar;
        this.f36200b = obj;
    }
}
