package qp;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import bt.g7;
import com.google.api.Service;
import com.lingo.lingoskill.object.Word;
import com.lingodeer.R;
import com.lingodeer.data.model.CourseUnit;
import com.lingodeer.database.CharacterStrokeDatabase;
import com.tbruyelle.rxpermissions3.RxPermissions;
import com.yalantis.ucrop.view.CropImageView;
import h1.n8;
import j$.time.LocalDate;
import j$.time.chrono.ChronoLocalDate;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import pt.ImS.aYZzTH;
import rt.j6;
import rt.x8;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class n2 implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f48076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f48077b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f48078c;

    public /* synthetic */ n2(int i11, Object obj, Object obj2) {
        this.f48076a = i11;
        this.f48077b = obj;
        this.f48078c = obj2;
    }

    public /* synthetic */ n2(s0.q1 q1Var, j3.f fVar, s0.t0 t0Var) {
        this.f48076a = 15;
        this.f48077b = fVar;
        this.f48078c = t0Var;
    }

    /* JADX WARN: Code duplicated, block: B:109:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:210:0x0510 A[PHI: r0
      0x0510: PHI (r0v56 java.util.List) = (r0v55 java.util.List), (r0v61 java.util.List) binds: [B:212:0x051e, B:208:0x050d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [vy.d] */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v6, types: [android.widget.ImageView, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5, types: [jp.p0] */
    @Override // fz.c
    public final Object invoke(Object obj) {
        List list;
        j3.v0 v0VarB;
        j3.v0 v0VarB2;
        j3.v0 v0VarB3;
        j3.u0 u0Var;
        g2.k kVarI;
        j3.t0 t0Var;
        int i11 = this.f48076a;
        int i12 = 16;
        float fMin = CropImageView.DEFAULT_ASPECT_RATIO;
        int i13 = 4;
        int i14 = 3;
        ?? r12 = 0;
        p0VarC = null;
        j3.p0 p0VarC = null;
        int i15 = 0;
        switch (i11) {
            case 0:
                FrameLayout frameLayout = (FrameLayout) this.f48077b;
                s2 s2Var = (s2) this.f48078c;
                View view = (View) frameLayout.getTag(R.id.tag_view);
                if (view != null) {
                    s2Var.u(false);
                    frameLayout.setTag(R.id.tag_view, null);
                    mp.b bVar = s2Var.f47881a;
                    if (bVar != null) {
                        if (s2Var.f47884d.isAudioModel) {
                            boolean z11 = ((jp.p0) bVar).Q;
                        }
                        try {
                            Object tag = view.getTag();
                            kotlin.jvm.internal.m.d(tag, "null cannot be cast to non-null type com.lingo.lingoskill.object.Word");
                            Word word = (Word) tag;
                            TextView textView = (TextView) view.findViewById(R.id.tv_middle);
                            if (!kotlin.jvm.internal.m.a(word.getWord(), textView.getText().toString())) {
                                View viewFindViewById = view.findViewById(R.id.tv_top);
                                kotlin.jvm.internal.m.e(viewFindViewById, "findViewById(...)");
                                View viewFindViewById2 = view.findViewById(R.id.tv_bottom);
                                kotlin.jvm.internal.m.e(viewFindViewById2, "findViewById(...)");
                                s2Var.v(word, (TextView) viewFindViewById, textView, (TextView) viewFindViewById2);
                            }
                        } catch (Exception e8) {
                            e8.printStackTrace();
                        }
                        view.clearAnimation();
                        view.bringToFront();
                        Object tag2 = view.getTag(R.id.tag_view);
                        kotlin.jvm.internal.m.d(tag2, "null cannot be cast to non-null type android.view.View");
                        View view2 = (View) tag2;
                        View viewFindViewById3 = view2.findViewById(R.id.card_item);
                        kotlin.jvm.internal.m.e(viewFindViewById3, "findViewById(...)");
                        CardView cardView = (CardView) viewFindViewById3;
                        cardView.setVisibility(0);
                        view2.postDelayed(new b2.c(i13, view2, new bp.x1(view, view2, s2Var, cardView, frameLayout, 13)), 0L);
                    }
                    break;
                }
                return qy.b0.f48488a;
            case 1:
                s3 s3Var = (s3) this.f48077b;
                String str = (String) this.f48078c;
                View it = (View) obj;
                kotlin.jvm.internal.m.f(it, "it");
                mp.b bVar2 = s3Var.f47881a;
                hj.e3 e3Var = s3Var.f48193p;
                r12 = e3Var != null ? (ImageView) e3Var.f32525d : 0;
                kotlin.jvm.internal.m.c(r12);
                ((jp.p0) bVar2).H(r12, str);
                return qy.b0.f48488a;
            case 2:
                View view3 = (View) this.f48077b;
                j4 j4Var = (j4) this.f48078c;
                View it2 = (View) obj;
                kotlin.jvm.internal.m.f(it2, "it");
                View view4 = (View) view3.getTag(R.id.bottom_view);
                if (view4 != null) {
                    ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view4, "translationX", CropImageView.DEFAULT_ASPECT_RATIO);
                    ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view4, "translationY", CropImageView.DEFAULT_ASPECT_RATIO);
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat2);
                    animatorSet.setDuration(200L);
                    animatorSet.addListener(new qa.p(i14, view4, j4Var));
                    animatorSet.setInterpolator(new DecelerateInterpolator());
                    animatorSet.start();
                    ((jp.p0) j4Var.f47881a).O(0);
                }
                view3.setTag(R.id.bottom_view, null);
                return qy.b0.f48488a;
            case 3:
                n4 n4Var = (n4) this.f48077b;
                Word word2 = (Word) this.f48078c;
                View it3 = (View) obj;
                kotlin.jvm.internal.m.f(it3, "it");
                if (n4Var.f47884d.isAudioModel) {
                    n4Var.x(word2);
                }
                return qy.b0.f48488a;
            case 4:
                View view5 = (View) this.f48077b;
                t4 t4Var = (t4) this.f48078c;
                kotlin.jvm.internal.m.f((View) obj, aYZzTH.CKViVc);
                Object tag3 = view5.getTag(R.id.bottom_view);
                if (tag3 != null) {
                    View view6 = (View) tag3;
                    ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(view6, "translationX", CropImageView.DEFAULT_ASPECT_RATIO);
                    ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(view6, "translationY", CropImageView.DEFAULT_ASPECT_RATIO);
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    animatorSet2.play(objectAnimatorOfFloat3).with(objectAnimatorOfFloat4);
                    animatorSet2.setDuration(200L);
                    animatorSet2.addListener(new qa.p(i13, view6, t4Var));
                    animatorSet2.setInterpolator(new DecelerateInterpolator());
                    animatorSet2.start();
                    ((jp.p0) t4Var.f47881a).O(0);
                }
                view5.setTag(R.id.bottom_view, null);
                return qy.b0.f48488a;
            case 5:
                mu.x xVar = (mu.x) this.f48077b;
                f.n nVar = (f.n) this.f48078c;
                mu.i it4 = (mu.i) obj;
                kotlin.jvm.internal.m.f(it4, "it");
                xVar.b(nVar, it4, new ju.d(25));
                return qy.b0.f48488a;
            case 6:
                tu.h hVar = (tu.h) this.f48077b;
                fz.c cVar = (fz.c) this.f48078c;
                m0.j LazyVerticalGrid = (m0.j) obj;
                kotlin.jvm.internal.m.f(LazyVerticalGrid, "$this$LazyVerticalGrid");
                ArrayList arrayList = ((tu.g) hVar).f52569d;
                LazyVerticalGrid.q(arrayList.size(), new av.r(i12, new ot.f2(i12), arrayList), null, new bp.d1(6, arrayList), new t1.d(new qu.u(i15, arrayList, cVar), true, -1117249557));
                return qy.b0.f48488a;
            case 7:
                rq.i iVar = (rq.i) this.f48077b;
                CardView cardView2 = (CardView) this.f48078c;
                View it5 = (View) obj;
                kotlin.jvm.internal.m.f(it5, "it");
                iVar.f49388l = cardView2;
                if (iVar.a()) {
                    CardView cardView3 = iVar.f49388l;
                    kotlin.jvm.internal.m.c(cardView3);
                    ArrayList arrayList2 = iVar.f49387k;
                    if (arrayList2 == null) {
                        kotlin.jvm.internal.m.n("options");
                        throw null;
                    }
                    int size = arrayList2.size();
                    for (int i16 = 0; i16 < size; i16++) {
                        int iA = w4.c.a(i16, "rl_answer_");
                        View view7 = iVar.f49362f;
                        if (view7 == null) {
                            kotlin.jvm.internal.m.n("view");
                            throw null;
                        }
                        View viewFindViewById4 = view7.findViewById(iA);
                        kotlin.jvm.internal.m.e(viewFindViewById4, "findViewById(...)");
                        CardView cardView4 = (CardView) viewFindViewById4;
                        Object tag4 = cardView4.getTag();
                        kotlin.jvm.internal.m.d(tag4, "null cannot be cast to non-null type com.lingo.lingoskill.vtskill.ui.syllable.object.VTSyllableElem");
                        if (!((pq.a) tag4).equals(iVar.f49358b)) {
                            cardView4.setVisibility(4);
                        }
                        cardView4.setClickable(false);
                    }
                    FrameLayout frameLayout2 = (FrameLayout) cardView3.findViewById(R.id.frame_layout);
                    ImageView imageView = (ImageView) cardView3.findViewById(R.id.img_tick);
                    frameLayout2.setBackgroundResource(R.drawable.bg_word_model_correct);
                    imageView.setImageResource(R.drawable.ic_word_select_correct);
                    frameLayout2.setVisibility(0);
                    int[] iArr = new int[2];
                    cardView3.getLocationOnScreen(iArr);
                    ta.a aVar = iVar.f49363g;
                    kotlin.jvm.internal.m.c(aVar);
                    int[] iArr2 = {((((hj.y1) aVar).f33613c.getWidth() / 2) + i) - (cardView3.getWidth() / 2), ((((hj.y1) aVar).f33613c.getHeight() / 2) + i) - (cardView3.getHeight() / 2)};
                    ((hj.y1) aVar).f33613c.getLocationOnScreen(iArr2);
                    int i17 = iArr2[0];
                    ta.a aVar2 = iVar.f49363g;
                    kotlin.jvm.internal.m.c(aVar2);
                    int i18 = iArr2[1];
                    ta.a aVar3 = iVar.f49363g;
                    kotlin.jvm.internal.m.c(aVar3);
                    ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(cardView3, "translationX", iArr2[0] - iArr[0]);
                    ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(cardView3, "translationY", iArr2[1] - iArr[1]);
                    AnimatorSet animatorSet3 = new AnimatorSet();
                    iVar.f49391p = animatorSet3;
                    AnimatorSet.Builder builderPlay = animatorSet3.play(objectAnimatorOfFloat5);
                    if (builderPlay != null) {
                        builderPlay.with(objectAnimatorOfFloat6);
                    }
                    AnimatorSet animatorSet4 = iVar.f49391p;
                    if (animatorSet4 != null) {
                        animatorSet4.setDuration(500L);
                    }
                    AnimatorSet animatorSet5 = iVar.f49391p;
                    if (animatorSet5 != null) {
                        animatorSet5.addListener(new om.l(imageView, iVar, cardView3));
                    }
                    AnimatorSet animatorSet6 = iVar.f49391p;
                    if (animatorSet6 != null) {
                        animatorSet6.start();
                    }
                } else {
                    CardView cardView5 = iVar.f49388l;
                    kotlin.jvm.internal.m.c(cardView5);
                    FrameLayout frameLayout3 = (FrameLayout) cardView5.findViewById(R.id.frame_layout);
                    ImageView imageView2 = (ImageView) cardView5.findViewById(R.id.img_tick);
                    frameLayout3.setBackgroundResource(R.drawable.bg_word_model_wrong);
                    imageView2.setImageResource(R.drawable.ic_word_select_wrong);
                    frameLayout3.setVisibility(0);
                    cardView5.startAnimation(AnimationUtils.loadAnimation(iVar.f49359c, R.anim.anim_shake));
                    if (!iVar.m) {
                        iVar.m = true;
                    }
                }
                return qy.b0.f48488a;
            case 8:
                LocalDate localDate = (LocalDate) this.f48077b;
                LocalDate localDate2 = (LocalDate) this.f48078c;
                LocalDate it6 = (LocalDate) obj;
                kotlin.jvm.internal.m.f(it6, "it");
                return Boolean.valueOf(it6.compareTo((ChronoLocalDate) localDate) >= 0 && it6.compareTo((ChronoLocalDate) localDate2) <= 0);
            case 9:
                rt.w4 w4Var = (rt.w4) this.f48077b;
                rt.z4 z4Var = (rt.z4) this.f48078c;
                rt.d5 unit = (rt.d5) obj;
                List listH0 = ry.r.f50854a;
                kotlin.jvm.internal.m.f(unit, "unit");
                long j11 = unit.f49613a;
                int i19 = rt.q4.f50284a[w4Var.ordinal()];
                if (i19 == 1) {
                    list = (List) z4Var.f50761b.get(Long.valueOf(j11));
                    if (list != null) {
                        listH0 = list;
                    }
                } else if (i19 == 2) {
                    list = (List) z4Var.f50762c.get(Long.valueOf(j11));
                    if (list != null) {
                        listH0 = list;
                    }
                } else {
                    if (i19 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    List list2 = (List) z4Var.f50761b.get(Long.valueOf(j11));
                    if (list2 == null) {
                        list2 = listH0;
                    }
                    List list3 = (List) z4Var.f50762c.get(Long.valueOf(j11));
                    if (list3 != null) {
                        listH0 = list3;
                    }
                    listH0 = ry.m.H0(list2, listH0);
                }
                return nz.n.W(ry.m.g0(listH0), new ot.e2(unit, 21));
            case 10:
                Set set = (Set) this.f48077b;
                LinkedHashMap linkedHashMap = (LinkedHashMap) this.f48078c;
                CourseUnit courseUnit = (CourseUnit) obj;
                kotlin.jvm.internal.m.f(courseUnit, "courseUnit");
                Set set2 = set;
                int iW = ry.x.W(ry.n.W(set2, 10));
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(iW >= 16 ? iW : 16);
                for (Object obj2 : set2) {
                    Collection collection = (List) linkedHashMap.get(new qy.l(Long.valueOf(courseUnit.getUnitId()), Integer.valueOf(((x8) obj2).a())));
                    if (collection == null) {
                        collection = ry.r.f50854a;
                    }
                    linkedHashMap2.put(obj2, collection);
                }
                return new j6(courseUnit, linkedHashMap2);
            case 11:
                o3.w wVar = (o3.w) this.f48077b;
                fz.c cVar2 = (fz.c) this.f48078c;
                o3.w wVar2 = (o3.w) obj;
                if (!kotlin.jvm.internal.m.a(wVar, wVar2)) {
                    cVar2.invoke(wVar2);
                }
                return qy.b0.f48488a;
            case 12:
                l1.b1 b1Var = (l1.b1) this.f48077b;
                g7 g7Var = (g7) this.f48078c;
                f2.b bVar3 = (f2.b) obj;
                j3.u0 u0Var2 = (j3.u0) b1Var.getValue();
                if (u0Var2 != null) {
                    g7Var.invoke(Integer.valueOf(u0Var2.f35798b.g(bVar3.f26570a)));
                }
                return qy.b0.f48488a;
            case 13:
                w2.f1 f1Var = (w2.f1) obj;
                ArrayList arrayListN = s0.o0.n((List) this.f48077b, (fz.a) ((n8) this.f48078c).f30742b);
                if (arrayListN != null) {
                    int size2 = arrayListN.size();
                    while (i15 < size2) {
                        qy.l lVar = (qy.l) arrayListN.get(i15);
                        w2.g1 g1Var = (w2.g1) lVar.f48495a;
                        fz.a aVar4 = (fz.a) lVar.f48496b;
                        w2.f1.i(f1Var, g1Var, aVar4 != null ? ((v3.j) aVar4.invoke()).f53492a : 0L);
                        i15++;
                    }
                }
                return qy.b0.f48488a;
            case 14:
                return new b0.l0(15, (l1.b1) this.f48077b, (h0.i) this.f48078c);
            case 15:
                j3.f fVar = (j3.f) this.f48077b;
                l1.h1 h1Var = ((s0.t0) this.f48078c).f51195b;
                s0.w0 w0Var = (s0.w0) obj;
                j3.w wVar3 = (j3.w) fVar.f35689a;
                j3.v0 v0VarB4 = wVar3.b();
                j3.p0 p0Var = v0VarB4 != null ? v0VarB4.f35805a : null;
                j3.p0 p0VarC2 = ((h1Var.l() & 1) == 0 || (v0VarB3 = wVar3.b()) == null) ? null : v0VarB3.f35806b;
                if (p0Var != null) {
                    p0VarC2 = p0Var.c(p0VarC2);
                }
                j3.p0 p0VarC3 = ((2 & h1Var.l()) == 0 || (v0VarB2 = wVar3.b()) == null) ? null : v0VarB2.f35807c;
                if (p0VarC2 != null) {
                    p0VarC3 = p0VarC2.c(p0VarC3);
                }
                if ((h1Var.l() & 4) != 0 && (v0VarB = wVar3.b()) != null) {
                    p0VarC = v0VarB.f35808d;
                }
                if (p0VarC3 != null) {
                    p0VarC = p0VarC3.c(p0VarC);
                }
                kotlin.jvm.internal.u uVar = new kotlin.jvm.internal.u();
                j3.h hVar2 = w0Var.f51244a;
                pr.a0 a0Var = new pr.a0(uVar, fVar, p0VarC, 18);
                hVar2.getClass();
                j3.e eVar = new j3.e(hVar2);
                ArrayList arrayList3 = eVar.f35685c;
                int size3 = arrayList3.size();
                while (i15 < size3) {
                    j3.f fVar2 = (j3.f) a0Var.invoke(((j3.d) arrayList3.get(i15)).a(Integer.MIN_VALUE));
                    arrayList3.set(i15, new j3.d(fVar2.f35690b, fVar2.f35691c, fVar2.f35689a, fVar2.f35692d));
                    i15++;
                }
                w0Var.f51245b = eVar.j();
                return qy.b0.f48488a;
            case 16:
                s0.q1 q1Var = (s0.q1) this.f48077b;
                j3.f fVar3 = (j3.f) this.f48078c;
                g2.t0 t0Var2 = (g2.t0) obj;
                j3.h hVar3 = q1Var.f51144b;
                l1.k1 k1Var = q1Var.f51143a;
                j3.u0 u0Var3 = (j3.u0) k1Var.getValue();
                if (kotlin.jvm.internal.m.a(hVar3, (u0Var3 == null || (t0Var = u0Var3.f35797a) == null) ? null : t0Var.f35784a) && (u0Var = (j3.u0) k1Var.getValue()) != null) {
                    j3.x xVar2 = u0Var.f35798b;
                    j3.f fVarC = s0.q1.c(fVar3, u0Var);
                    if (fVarC == null) {
                        kVarI = null;
                    } else {
                        int i21 = fVarC.f35691c;
                        int i22 = fVarC.f35690b;
                        kVarI = u0Var.i(i22, i21);
                        f2.c cVarB = u0Var.b(i22);
                        int i23 = i21 - 1;
                        f2.c cVarB2 = u0Var.b(i23);
                        if (xVar2.d(i22) == xVar2.d(i23)) {
                            fMin = Math.min(cVarB2.f26572a, cVarB.f26572a);
                        }
                        kVarI.m(((((long) Float.floatToRawIntBits(fMin)) << 32) | (((long) Float.floatToRawIntBits(cVarB.f26573b)) & 4294967295L)) ^ (-9223372034707292160L));
                    }
                } else {
                    kVarI = null;
                }
                s0.p1 p1Var = kVarI != null ? new s0.p1(kVarI) : null;
                if (p1Var != null) {
                    t0Var2.l(p1Var);
                    t0Var2.e(true);
                }
                return qy.b0.f48488a;
            case 17:
                List list4 = (List) this.f48077b;
                List list5 = (List) this.f48078c;
                w2.f1 f1Var2 = (w2.f1) obj;
                if (list4 != null) {
                    int size4 = list4.size();
                    for (int i24 = 0; i24 < size4; i24++) {
                        qy.l lVar2 = (qy.l) list4.get(i24);
                        w2.f1.i(f1Var2, (w2.g1) lVar2.f48495a, ((v3.j) lVar2.f48496b).f53492a);
                    }
                }
                if (list5 != null) {
                    int size5 = list5.size();
                    while (i15 < size5) {
                        qy.l lVar3 = (qy.l) list5.get(i15);
                        w2.g1 g1Var2 = (w2.g1) lVar3.f48495a;
                        fz.a aVar5 = (fz.a) lVar3.f48496b;
                        w2.f1.i(f1Var2, g1Var2, aVar5 != null ? ((v3.j) aVar5.invoke()).f53492a : 0L);
                        i15++;
                    }
                }
                return qy.b0.f48488a;
            case 18:
                si.d dVar = (si.d) this.f48077b;
                String str2 = (String) this.f48078c;
                View it7 = (View) obj;
                kotlin.jvm.internal.m.f(it7, "it");
                jp.p0 p0Var2 = (jp.p0) dVar.f47881a;
                p0Var2.getClass();
                rz.e0.B(LifecycleOwnerKt.getLifecycleScope(p0Var2), null, null, new si.c(dVar, str2, r12, i15), 3);
                return qy.b0.f48488a;
            case 19:
                View view8 = (View) this.f48077b;
                sq.l lVar4 = (sq.l) this.f48078c;
                View it8 = (View) obj;
                kotlin.jvm.internal.m.f(it8, "it");
                int id2 = view8.getId();
                if (id2 == R.id.tv_1 || id2 == R.id.ll_1) {
                    lVar4.y("n");
                } else if (id2 == R.id.tv_2 || id2 == R.id.ll_2) {
                    lVar4.y("ăn");
                } else if (id2 == R.id.tv_3 || id2 == R.id.ll_3) {
                    lVar4.y("ạ");
                } else if (id2 == R.id.tv_tone_1) {
                    lVar4.y("a");
                } else if (id2 == R.id.tv_tone_2) {
                    lVar4.y("à");
                } else if (id2 == R.id.tv_tone_3) {
                    lVar4.y("ã");
                } else if (id2 == R.id.tv_tone_4) {
                    lVar4.y("ả");
                } else if (id2 == R.id.tv_tone_5) {
                    lVar4.y("á");
                } else if (id2 == R.id.tv_tone_6) {
                    lVar4.y("ạ");
                }
                return qy.b0.f48488a;
            case 20:
                ((sz.c) this.f48077b).f51958a.removeCallbacks((pb.b) this.f48078c);
                return qy.b0.f48488a;
            case 21:
                tp.h hVar4 = (tp.h) this.f48077b;
                String str3 = (String) this.f48078c;
                View it9 = (View) obj;
                kotlin.jvm.internal.m.f(it9, "it");
                r rVar = new r(i13, hVar4, str3);
                RxPermissions rxPermissions = new RxPermissions(hVar4.requireActivity());
                l.m mVar = hVar4.f36398d;
                kotlin.jvm.internal.m.c(mVar);
                if (rxPermissions.isGranted("android.permission.WRITE_EXTERNAL_STORAGE")) {
                    rVar.m();
                } else {
                    rxPermissions.request("android.permission.WRITE_EXTERNAL_STORAGE").h(new ob.m(rVar, mVar, rxPermissions, 17), vx.b.f54316e);
                }
                return qy.b0.f48488a;
            case 22:
                zr.b bVar4 = (zr.b) this.f48077b;
                Context context = (Context) this.f48078c;
                Uri uri = (Uri) obj;
                kotlin.jvm.internal.m.f(uri, "uri");
                kotlin.jvm.internal.m.f(context, "context");
                rz.e0.B(ViewModelKt.getViewModelScope(bVar4), null, null, new zr.a(bVar4, context, uri, null), 3);
                return qy.b0.f48488a;
            case 23:
                vt.d0 d0Var = (vt.d0) this.f48077b;
                vt.b0 b0Var = (vt.b0) this.f48078c;
                File dbFile = (File) obj;
                kotlin.jvm.internal.m.f(dbFile, "dbFile");
                re.g0 g0Var = CharacterStrokeDatabase.f22329l;
                Context context2 = d0Var.f54211a;
                String str4 = b0Var.f54179a;
                LinkedHashMap linkedHashMap3 = CharacterStrokeDatabase.m;
                CharacterStrokeDatabase characterStrokeDatabase = (CharacterStrokeDatabase) linkedHashMap3.get(str4);
                if (characterStrokeDatabase == null) {
                    synchronized (g0Var) {
                        characterStrokeDatabase = (CharacterStrokeDatabase) linkedHashMap3.get(str4);
                        if (characterStrokeDatabase == null) {
                            CharacterStrokeDatabase characterStrokeDatabaseI = re.g0.i(context2, str4, dbFile);
                            linkedHashMap3.put(str4, characterStrokeDatabaseI);
                            characterStrokeDatabase = characterStrokeDatabaseI;
                        }
                    }
                }
                return characterStrokeDatabase;
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                rz.e0.B((rz.b0) this.f48077b, null, null, new ei.p((o0.b) this.f48078c, ((Integer) obj).intValue(), r12, i14), 3);
                return qy.b0.f48488a;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                fz.c cVar3 = (fz.c) this.f48077b;
                String str5 = (String) this.f48078c;
                s0.p0 KeyboardActions = (s0.p0) obj;
                kotlin.jvm.internal.m.f(KeyboardActions, "$this$KeyboardActions");
                cVar3.invoke(str5);
                return qy.b0.f48488a;
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                z2.i2 i2Var = (z2.i2) this.f48077b;
                l1.b1 b1Var2 = (l1.b1) this.f48078c;
                if (i2Var != null) {
                    ((z2.h1) i2Var).a();
                }
                b1Var2.setValue(Boolean.FALSE);
                return qy.b0.f48488a;
            case 27:
                ((fz.c) this.f48077b).invoke(Integer.valueOf(hz.b.l(hz.b.Q(((Float) obj).floatValue()), 0, ry.l.X((Integer[]) this.f48078c))));
                return qy.b0.f48488a;
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                fz.e eVar2 = (fz.e) this.f48077b;
                ht.o oVar = (ht.o) this.f48078c;
                String note = (String) obj;
                kotlin.jvm.internal.m.f(note, "note");
                eVar2.invoke(oVar, note);
                return qy.b0.f48488a;
            default:
                View view9 = (View) this.f48077b;
                zi.i iVar2 = (zi.i) this.f48078c;
                View it10 = (View) obj;
                kotlin.jvm.internal.m.f(it10, "it");
                View view10 = (View) view9.getTag(R.id.bottom_view);
                if (view10 != null) {
                    iVar2.p(view10);
                    view9.setTag(R.id.bottom_view, null);
                    view9.setTag(R.id.tag_pinyin, null);
                }
                return qy.b0.f48488a;
        }
    }
}
