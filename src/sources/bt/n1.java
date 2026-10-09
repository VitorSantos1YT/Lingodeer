package bt;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.airbnb.lottie.LottieAnimationView;
import com.lingo.fluent.object.PdLessonDbHelper;
import com.lingo.lingoskill.object.AckFav;
import com.lingo.lingoskill.object.JPChar;
import com.lingo.lingoskill.object.PdTipsFav;
import com.lingo.lingoskill.object.Word;
import com.lingodeer.R;
import com.lingodeer.course.stroke_order_view_new.old.HwView;
import com.lingodeer.data.env.Env;
import com.lingodeer.data.model.CourseCharacter;
import com.lingodeer.data.model.CourseWord;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class n1 implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f5745b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5746c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f5747d;

    public /* synthetic */ n1(Object obj, Object obj2, boolean z11, int i11) {
        this.f5744a = i11;
        this.f5746c = obj;
        this.f5747d = obj2;
        this.f5745b = z11;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        int i11 = 4;
        int i12 = 0;
        switch (this.f5744a) {
            case 0:
                boolean z11 = this.f5745b;
                rz.b0 b0Var = (rz.b0) this.f5746c;
                jt.h0 h0Var = (jt.h0) this.f5747d;
                CourseWord stem = (CourseWord) obj;
                kotlin.jvm.internal.m.f(stem, "stem");
                if (z11) {
                    rz.e0.B(b0Var, null, null, new t1(h0Var, stem, null, i12), 3);
                }
                return qy.b0.f48488a;
            case 1:
                boolean z12 = this.f5745b;
                rz.b0 b0Var2 = (rz.b0) this.f5746c;
                jt.k0 k0Var = (jt.k0) this.f5747d;
                CourseWord it = (CourseWord) obj;
                kotlin.jvm.internal.m.f(it, "it");
                if (z12) {
                    rz.e0.B(b0Var2, null, null, new b1.c(15, k0Var, it, (vy.d) null), 3);
                }
                return qy.b0.f48488a;
            case 2:
                boolean z13 = this.f5745b;
                rz.b0 b0Var3 = (rz.b0) this.f5746c;
                jt.q1 q1Var = (jt.q1) this.f5747d;
                CourseWord it2 = (CourseWord) obj;
                kotlin.jvm.internal.m.f(it2, "it");
                if (z13) {
                    rz.e0.B(b0Var3, null, null, new b6(q1Var, it2, null, i12), 3);
                }
                return qy.b0.f48488a;
            case 3:
                hh.y0 y0Var = (hh.y0) this.f5746c;
                boolean z14 = this.f5745b;
                String str = (String) this.f5747d;
                List list = uh.a.f52967a;
                if (ry.l.D(c.a.n(), Long.valueOf(y0Var.N)) || z14 || y0Var.N == -1) {
                    cf.x.z();
                    PdLessonDbHelper pdLessonDbHelper = PdLessonDbHelper.INSTANCE;
                    PdTipsFav pdTipsFav = (PdTipsFav) pdLessonDbHelper.pdTipsFavDao().load(str);
                    if (pdTipsFav == null || pdTipsFav.getFav() != 1) {
                        cf.x.z();
                        PdTipsFav pdTipsFav2 = (PdTipsFav) pdLessonDbHelper.pdTipsFavDao().load(str);
                        if (pdTipsFav2 != null) {
                            pdTipsFav2.setFav(1);
                            pdTipsFav2.setTime(Long.valueOf(System.currentTimeMillis()));
                            pdLessonDbHelper.pdTipsFavDao().insertOrReplace(pdTipsFav2);
                        } else {
                            PdTipsFav pdTipsFav3 = new PdTipsFav();
                            pdTipsFav3.setId(str);
                            pdTipsFav3.setFav(1);
                            pdTipsFav3.setTime(Long.valueOf(System.currentTimeMillis()));
                            pdLessonDbHelper.pdTipsFavDao().insertOrReplace(pdTipsFav3);
                        }
                        ta.a aVar = y0Var.f36400f;
                        kotlin.jvm.internal.m.c(aVar);
                        ((hj.m4) aVar).f32930c.setImageResource(R.drawable.ic_pd_word_tag_fav);
                        y0Var.t().c("jxz_fl_add_star_keypoint", new hh.o(y0Var, i11));
                    } else {
                        cf.x.z();
                        PdTipsFav pdTipsFav4 = (PdTipsFav) pdLessonDbHelper.pdTipsFavDao().load(str);
                        if (pdTipsFav4 != null) {
                            pdTipsFav4.setTime(Long.valueOf(System.currentTimeMillis()));
                            pdTipsFav4.setFav(0);
                            pdLessonDbHelper.pdTipsFavDao().insertOrReplace(pdTipsFav4);
                        }
                        ta.a aVar2 = y0Var.f36400f;
                        kotlin.jvm.internal.m.c(aVar2);
                        ((hj.m4) aVar2).f32930c.setImageResource(R.drawable.ic_pd_word_tag_un_fav);
                    }
                    hh.p0.w(21, f10.e.b());
                } else {
                    Context contextRequireContext = y0Var.requireContext();
                    kotlin.jvm.internal.m.e(contextRequireContext, "requireContext(...)");
                    fb.g0.w(contextRequireContext, y0Var, "fl_listen_keypoint_fav");
                }
                return qy.b0.f48488a;
            case 4:
                CourseCharacter courseCharacter = (CourseCharacter) this.f5746c;
                boolean z15 = this.f5745b;
                fz.a aVar3 = (fz.a) this.f5747d;
                HwView view = (HwView) obj;
                kotlin.jvm.internal.m.f(view, "view");
                if (view.getWidth() <= 0 || view.getHeight() <= 0) {
                    ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                    viewTreeObserver.addOnGlobalLayoutListener(new iv.w(view, viewTreeObserver, courseCharacter, z15, aVar3));
                } else {
                    iv.a.H(view, courseCharacter, z15, aVar3);
                }
                return qy.b0.f48488a;
            case 5:
                final j9.e eVar = (j9.e) this.f5746c;
                final boolean z16 = this.f5745b;
                final List list2 = (List) this.f5747d;
                LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: k9.k
                    @Override // androidx.lifecycle.LifecycleEventObserver
                    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                        boolean z17 = z16;
                        List list3 = list2;
                        j9.e eVar2 = eVar;
                        if (z17 && !list3.contains(eVar2)) {
                            list3.add(eVar2);
                        }
                        if (event == Lifecycle.Event.ON_START && !list3.contains(eVar2)) {
                            list3.add(eVar2);
                        }
                        if (event == Lifecycle.Event.ON_STOP) {
                            list3.remove(eVar2);
                        }
                    }
                };
                eVar.H.f41060j.addObserver(lifecycleEventObserver);
                return new b0.l0(10, eVar, lifecycleEventObserver);
            case 6:
                boolean z17 = this.f5745b;
                o0.t tVar = (o0.t) this.f5747d;
                rz.b0 b0Var4 = (rz.b0) this.f5746c;
                g3.b0 b0Var5 = (g3.b0) obj;
                if (z17) {
                    iv.x xVar = new iv.x(tVar, b0Var4, 3);
                    mz.j[] jVarArr = g3.z.f28737a;
                    b0Var5.b(g3.n.f28689y, new g3.a(null, xVar));
                    b0Var5.b(g3.n.A, new g3.a(null, new iv.x(tVar, b0Var4, i11)));
                } else {
                    iv.x xVar2 = new iv.x(tVar, b0Var4, 5);
                    mz.j[] jVarArr2 = g3.z.f28737a;
                    b0Var5.b(g3.n.f28690z, new g3.a(null, xVar2));
                    b0Var5.b(g3.n.B, new g3.a(null, new iv.x(tVar, b0Var4, 6)));
                }
                return qy.b0.f48488a;
            case 7:
                CardView cardView = (CardView) this.f5746c;
                om.j jVar = (om.j) this.f5747d;
                boolean z18 = this.f5745b;
                kotlin.jvm.internal.m.f((View) obj, "it");
                Object tag = cardView.getTag();
                kotlin.jvm.internal.m.d(tag, "null cannot be cast to non-null type com.lingo.lingoskill.object.JPChar");
                JPChar jPChar = (JPChar) tag;
                CardView cardView2 = jVar.M;
                n9.q qVar = jVar.f45601d;
                ArrayList arrayList = jVar.N;
                if (cardView2 != null) {
                    if (z18 && jVar.Q) {
                        jVar.i(jPChar.getDisplayLuoMa());
                    }
                    int size = arrayList.size();
                    for (int i13 = 0; i13 < size; i13++) {
                        ((View) arrayList.get(i13)).setClickable(false);
                    }
                    CardView cardView3 = jVar.M;
                    kotlin.jvm.internal.m.c(cardView3);
                    Object tag2 = cardView3.getTag();
                    kotlin.jvm.internal.m.d(tag2, "null cannot be cast to non-null type com.lingo.lingoskill.object.JPChar");
                    if (jPChar.getId() == ((JPChar) tag2).getId()) {
                        if (!jVar.Q) {
                            jVar.i(jPChar.getZhuyin());
                        }
                        CardView cardView4 = jVar.M;
                        kotlin.jvm.internal.m.c(cardView4);
                        om.j.h(cardView4);
                        om.j.h(cardView);
                        android.support.v4.media.session.a.m(jVar.M);
                        android.support.v4.media.session.a.m(cardView);
                        CardView cardView5 = jVar.M;
                        ArgbEvaluator argbEvaluator = new ArgbEvaluator();
                        CardView cardView6 = jVar.M;
                        kotlin.jvm.internal.m.d(cardView6, "null cannot be cast to non-null type androidx.cardview.widget.CardView");
                        Integer numValueOf = Integer.valueOf(cardView6.getCardBackgroundColor().getDefaultColor());
                        Context context = jVar.H;
                        if (context == null) {
                            kotlin.jvm.internal.m.n("mContext");
                            throw null;
                        }
                        ObjectAnimator.ofObject(cardView5, "cardBackgroundColor", argbEvaluator, numValueOf, Integer.valueOf(context.getColor(R.color.color_E1E9F6))).setDuration(300L).start();
                        ArgbEvaluator argbEvaluator2 = new ArgbEvaluator();
                        CardView cardView7 = jVar.M;
                        kotlin.jvm.internal.m.d(cardView7, "null cannot be cast to non-null type androidx.cardview.widget.CardView");
                        Integer numValueOf2 = Integer.valueOf(cardView7.getCardBackgroundColor().getDefaultColor());
                        Context context2 = jVar.H;
                        if (context2 == null) {
                            kotlin.jvm.internal.m.n("mContext");
                            throw null;
                        }
                        ObjectAnimator.ofObject(cardView, "cardBackgroundColor", argbEvaluator2, numValueOf2, Integer.valueOf(context2.getColor(R.color.color_E1E9F6))).setDuration(300L).start();
                        th.j.a(qx.h.m(400L, TimeUnit.MILLISECONDS, ky.e.f38937b).g(px.b.a()).h(new xq.c(jVar, jPChar, cardView, 25), om.a.f45596t), qVar);
                    } else {
                        CardView cardView8 = jVar.M;
                        kotlin.jvm.internal.m.c(cardView8);
                        Context context3 = jVar.H;
                        if (context3 == null) {
                            kotlin.jvm.internal.m.n("mContext");
                            throw null;
                        }
                        cardView8.startAnimation(AnimationUtils.loadAnimation(context3.getApplicationContext(), R.anim.anim_shake));
                        Context context4 = jVar.H;
                        if (context4 == null) {
                            kotlin.jvm.internal.m.n("mContext");
                            throw null;
                        }
                        cardView.startAnimation(AnimationUtils.loadAnimation(context4.getApplicationContext(), R.anim.anim_shake));
                        om.j.h(cardView);
                        CardView cardView9 = jVar.M;
                        kotlin.jvm.internal.m.c(cardView9);
                        om.j.h(cardView9);
                        ArgbEvaluator argbEvaluator3 = new ArgbEvaluator();
                        Integer numValueOf3 = Integer.valueOf(cardView.getCardBackgroundColor().getDefaultColor());
                        Context context5 = jVar.H;
                        if (context5 == null) {
                            kotlin.jvm.internal.m.n("mContext");
                            throw null;
                        }
                        Integer numValueOf4 = Integer.valueOf(context5.getColor(R.color.color_FF6666));
                        Context context6 = jVar.H;
                        if (context6 == null) {
                            kotlin.jvm.internal.m.n("mContext");
                            throw null;
                        }
                        ObjectAnimator.ofObject(cardView, "cardBackgroundColor", argbEvaluator3, numValueOf3, numValueOf4, Integer.valueOf(context6.getColor(R.color.white))).setDuration(300L).start();
                        CardView cardView10 = jVar.M;
                        ArgbEvaluator argbEvaluator4 = new ArgbEvaluator();
                        CardView cardView11 = jVar.M;
                        kotlin.jvm.internal.m.d(cardView11, "null cannot be cast to non-null type androidx.cardview.widget.CardView");
                        Integer numValueOf5 = Integer.valueOf(cardView11.getCardBackgroundColor().getDefaultColor());
                        Context context7 = jVar.H;
                        if (context7 == null) {
                            kotlin.jvm.internal.m.n("mContext");
                            throw null;
                        }
                        Integer numValueOf6 = Integer.valueOf(context7.getColor(R.color.color_FF6666));
                        Context context8 = jVar.H;
                        if (context8 == null) {
                            kotlin.jvm.internal.m.n("mContext");
                            throw null;
                        }
                        ObjectAnimator.ofObject(cardView10, "cardBackgroundColor", argbEvaluator4, numValueOf5, numValueOf6, Integer.valueOf(context8.getColor(R.color.white))).setDuration(300L).start();
                        jVar.M = null;
                        th.j.a(qx.h.m(400L, TimeUnit.MILLISECONDS, ky.e.f38937b).g(px.b.a()).h(new lp.j(jVar, 5), om.a.H), qVar);
                    }
                } else {
                    jVar.M = cardView;
                    FrameLayout frameLayout = (FrameLayout) cardView.findViewById(R.id.frame_layout);
                    frameLayout.setBackgroundResource(R.drawable.bg_word_model_6_select);
                    frameLayout.setVisibility(0);
                    CardView cardView12 = jVar.M;
                    kotlin.jvm.internal.m.c(cardView12);
                    cardView12.setClickable(false);
                    if (z18 && jVar.Q) {
                        jVar.i(jPChar.getDisplayLuoMa());
                    }
                }
                return qy.b0.f48488a;
            case 8:
                qh.c0 c0Var = (qh.c0) this.f5746c;
                LinearLayout linearLayout = (LinearLayout) this.f5747d;
                boolean z19 = this.f5745b;
                kotlin.jvm.internal.m.f((View) obj, "it");
                c0Var.z();
                c0Var.F(linearLayout, z19, false);
                return qy.b0.f48488a;
            case 9:
                qp.v1 v1Var = (qp.v1) this.f5746c;
                boolean z20 = this.f5745b;
                LottieAnimationView lottieAnimationView = (LottieAnimationView) this.f5747d;
                View v11 = (View) obj;
                kotlin.jvm.internal.m.f(v11, "v");
                View view2 = (View) v1Var.f47818j;
                if (view2 != null) {
                    v1Var.r(view2);
                }
                v1Var.f47818j = v11;
                v1Var.s(v11);
                ((jp.p0) v1Var.f47881a).O(4);
                if (z20 && v1Var.f47884d.showAnim) {
                    int[] iArr = bq.r.f4959a;
                    int i14 = v1Var.m;
                    for (int i15 = 0; i15 < i14; i15++) {
                        View viewFindViewById = v1Var.o().findViewById(w4.c.a(i15, "rl_answer_"));
                        kotlin.jvm.internal.m.e(viewFindViewById, "findViewById(...)");
                        View viewFindViewById2 = ((CardView) viewFindViewById).findViewById(R.id.img_view);
                        kotlin.jvm.internal.m.e(viewFindViewById2, "findViewById(...)");
                        LottieAnimationView lottieAnimationView2 = (LottieAnimationView) viewFindViewById2;
                        lottieAnimationView2.e();
                        lottieAnimationView2.setFrame(0);
                    }
                    lottieAnimationView.h();
                }
                return qy.b0.f48488a;
            case 10:
                CardView cardView13 = (CardView) this.f5746c;
                qp.n4 n4Var = (qp.n4) this.f5747d;
                boolean z21 = this.f5745b;
                kotlin.jvm.internal.m.f((View) obj, "it");
                Object tag3 = cardView13.getTag();
                kotlin.jvm.internal.m.d(tag3, "null cannot be cast to non-null type com.lingo.lingoskill.object.Word");
                Word word = (Word) tag3;
                View view3 = (View) n4Var.f47818j;
                n9.q qVar2 = n4Var.f47887g;
                Env env = n4Var.f47884d;
                Context context9 = n4Var.f47883c;
                if (view3 != null) {
                    if (z21 && n4Var.f48084p && env.isAudioModel) {
                        n4Var.x(word);
                    }
                    ArrayList arrayList2 = n4Var.m;
                    if (arrayList2 == null) {
                        kotlin.jvm.internal.m.n("views");
                        throw null;
                    }
                    int size2 = arrayList2.size();
                    for (int i16 = 0; i16 < size2; i16++) {
                        ArrayList arrayList3 = n4Var.m;
                        if (arrayList3 == null) {
                            kotlin.jvm.internal.m.n("views");
                            throw null;
                        }
                        ((View) arrayList3.get(i16)).setClickable(false);
                    }
                    Object tag4 = view3.getTag();
                    kotlin.jvm.internal.m.d(tag4, "null cannot be cast to non-null type com.lingo.lingoskill.object.Word");
                    if (word.getWordId() == ((Word) tag4).getWordId()) {
                        if (env.isAudioModel && !n4Var.f48084p) {
                            n4Var.x(word);
                        }
                        qp.n4.u(view3);
                        qp.n4.u(cardView13);
                        android.support.v4.media.session.a.m(view3);
                        android.support.v4.media.session.a.m(cardView13);
                        ArgbEvaluator argbEvaluator5 = new ArgbEvaluator();
                        CardView cardView14 = (CardView) view3;
                        Integer numValueOf7 = Integer.valueOf(cardView14.getCardBackgroundColor().getDefaultColor());
                        kotlin.jvm.internal.m.f(context9, "context");
                        ObjectAnimator.ofObject(view3, "cardBackgroundColor", argbEvaluator5, numValueOf7, Integer.valueOf(context9.getColor(R.color.color_E1E9F6))).setDuration(300L).start();
                        ObjectAnimator.ofObject(cardView13, "cardBackgroundColor", new ArgbEvaluator(), Integer.valueOf(cardView14.getCardBackgroundColor().getDefaultColor()), Integer.valueOf(context9.getColor(R.color.color_E1E9F6))).setDuration(300L).start();
                        th.j.a(qx.h.m(400L, TimeUnit.MILLISECONDS, ky.e.f38937b).g(px.b.a()).h(new ob.i(n4Var, word, view3, cardView13, 12), qp.c.U), qVar2);
                    } else {
                        view3.startAnimation(AnimationUtils.loadAnimation(context9, R.anim.anim_shake));
                        cardView13.startAnimation(AnimationUtils.loadAnimation(context9, R.anim.anim_shake));
                        qp.n4.u(cardView13);
                        qp.n4.u(view3);
                        ArgbEvaluator argbEvaluator6 = new ArgbEvaluator();
                        Integer numValueOf8 = Integer.valueOf(cardView13.getCardBackgroundColor().getDefaultColor());
                        kotlin.jvm.internal.m.f(context9, "context");
                        ObjectAnimator.ofObject(cardView13, "cardBackgroundColor", argbEvaluator6, numValueOf8, Integer.valueOf(context9.getColor(R.color.color_FF6666)), Integer.valueOf(context9.getColor(R.color.white))).setDuration(300L).start();
                        ObjectAnimator.ofObject(view3, "cardBackgroundColor", new ArgbEvaluator(), Integer.valueOf(((CardView) view3).getCardBackgroundColor().getDefaultColor()), Integer.valueOf(context9.getColor(R.color.color_FF6666)), Integer.valueOf(context9.getColor(R.color.white))).setDuration(300L).start();
                        n4Var.f47818j = null;
                        th.j.a(qx.h.m(400L, TimeUnit.MILLISECONDS, ky.e.f38937b).g(px.b.a()).h(new lp.b(n4Var, 23), qp.c.V), qVar2);
                    }
                } else {
                    n4Var.f47818j = cardView13;
                    FrameLayout frameLayout2 = (FrameLayout) cardView13.findViewById(R.id.frame_layout);
                    frameLayout2.setBackgroundResource(R.drawable.bg_word_model_6_select);
                    frameLayout2.setVisibility(0);
                    cardView13.setClickable(false);
                    if (z21 && n4Var.f48084p && env.isAudioModel) {
                        n4Var.x(word);
                    }
                }
                return qy.b0.f48488a;
            case 11:
                qp.p4 p4Var = (qp.p4) this.f5746c;
                boolean z22 = this.f5745b;
                LottieAnimationView lottieAnimationView3 = (LottieAnimationView) this.f5747d;
                View v12 = (View) obj;
                kotlin.jvm.internal.m.f(v12, "v");
                View view4 = (View) p4Var.f47818j;
                Env env2 = p4Var.f47884d;
                mp.b bVar = p4Var.f47881a;
                if (view4 != null) {
                    p4Var.r(view4);
                }
                p4Var.f47818j = v12;
                if (env2.isAudioModel) {
                    jp.p0 p0Var = (jp.p0) bVar;
                    if (!p0Var.Q) {
                        Object tag5 = v12.getTag();
                        kotlin.jvm.internal.m.d(tag5, "null cannot be cast to non-null type com.lingo.lingoskill.object.Word");
                        qy.q qVar3 = fv.b.f28186a;
                        String strY = fv.b.Y(((Word) tag5).getWordId(), null, null);
                        if (strY != null) {
                            p0Var.I(strY);
                        }
                    }
                }
                p4Var.s(v12);
                ((jp.p0) bVar).O(4);
                if (z22 && env2.showAnim) {
                    int[] iArr2 = bq.r.f4959a;
                    int i17 = p4Var.m;
                    for (int i18 = 0; i18 < i17; i18++) {
                        View viewFindViewById3 = p4Var.o().findViewById(w4.c.a(i18, "rl_answer_"));
                        kotlin.jvm.internal.m.e(viewFindViewById3, "findViewById(...)");
                        View viewFindViewById4 = ((CardView) viewFindViewById3).findViewById(R.id.img_view);
                        kotlin.jvm.internal.m.e(viewFindViewById4, "findViewById(...)");
                        LottieAnimationView lottieAnimationView4 = (LottieAnimationView) viewFindViewById4;
                        lottieAnimationView4.e();
                        lottieAnimationView4.setFrame(0);
                    }
                    lottieAnimationView3.h();
                }
                return qy.b0.f48488a;
            default:
                boolean z23 = this.f5745b;
                String str2 = (String) this.f5746c;
                tp.h hVar = (tp.h) this.f5747d;
                kotlin.jvm.internal.m.f((View) obj, "it");
                if (!z23) {
                    if (ij.a.f34417b == null) {
                        synchronized (ij.a.class) {
                            if (ij.a.f34417b == null) {
                                ij.a.f34417b = new ij.a();
                            }
                        }
                    }
                    ij.a aVar4 = ij.a.f34417b;
                    kotlin.jvm.internal.m.c(aVar4);
                    ij.n nVar = aVar4.f34418a;
                    AckFav ackFav = (AckFav) nVar.f34447g.load(str2);
                    if (ackFav != null) {
                        ackFav.setIsFav(1);
                    } else {
                        ackFav = new AckFav();
                        ackFav.setId(str2);
                        ackFav.setIsFav(1);
                    }
                    ackFav.setTime(System.currentTimeMillis());
                    nVar.f34447g.insertOrReplace(ackFav);
                    String string = hVar.getString(R.string.added_to_favorites);
                    kotlin.jvm.internal.m.e(string, "getString(...)");
                    ff.h.C(string);
                    f10.e.b().f(new np.b(16));
                    b7.e0.A(hVar.t(), "jxz_review_know_cards_click_fav");
                    ta.a aVar5 = hVar.f36400f;
                    kotlin.jvm.internal.m.c(aVar5);
                    ((hj.g3) aVar5).f32613b.setImageResource(R.drawable.ic_ack_faved);
                    break;
                } else {
                    if (ij.a.f34417b == null) {
                        synchronized (ij.a.class) {
                            if (ij.a.f34417b == null) {
                                ij.a.f34417b = new ij.a();
                            }
                        }
                    }
                    ij.a aVar6 = ij.a.f34417b;
                    kotlin.jvm.internal.m.c(aVar6);
                    ij.n nVar2 = aVar6.f34418a;
                    AckFav ackFav2 = (AckFav) nVar2.f34447g.load(str2);
                    if (ackFav2 != null) {
                        ackFav2.setTime(System.currentTimeMillis());
                        ackFav2.setIsFav(0);
                    }
                    nVar2.f34447g.insertOrReplace(ackFav2);
                    String string2 = hVar.getString(R.string.removed_from_favorites);
                    kotlin.jvm.internal.m.e(string2, "getString(...)");
                    ff.h.C(string2);
                    hh.p0.w(16, f10.e.b());
                    ta.a aVar7 = hVar.f36400f;
                    kotlin.jvm.internal.m.c(aVar7);
                    ((hj.g3) aVar7).f32613b.setImageResource(R.drawable.ic_ack_fav);
                    break;
                }
                return qy.b0.f48488a;
        }
    }

    public /* synthetic */ n1(Object obj, boolean z11, Object obj2, int i11) {
        this.f5744a = i11;
        this.f5746c = obj;
        this.f5745b = z11;
        this.f5747d = obj2;
    }

    public /* synthetic */ n1(boolean z11, Object obj, Object obj2, int i11) {
        this.f5744a = i11;
        this.f5745b = z11;
        this.f5746c = obj;
        this.f5747d = obj2;
    }

    public /* synthetic */ n1(boolean z11, o0.t tVar, rz.b0 b0Var) {
        this.f5744a = 6;
        this.f5745b = z11;
        this.f5747d = tVar;
        this.f5746c = b0Var;
    }
}
