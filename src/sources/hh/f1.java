package hh;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import com.lingo.fluent.ui.base.PdGrammarActivity;
import com.lingo.fluent.ui.base.PdVocabularyActivity;
import com.lingo.fluent.ui.compose.PdFeedStarredActivity;
import com.lingo.fluent.ui.game.WordGameIndexActivity;
import com.yalantis.ucrop.view.CropImageView;
import fa.EQx.nuRcCS;
import hj.n4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import rt.m9;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class f1 extends ji.e {
    public rx.b N;
    public AnimatorSet O;
    public int P;
    public final ArrayList Q;
    public final AtomicBoolean R;

    public f1() {
        super(e1.f32225a, "FluentTabReview");
        this.Q = new ArrayList();
        this.R = new AtomicBoolean(false);
        com.bumptech.glide.d.u(qy.j.NONE, new bp.b1(13, this, new bj.a(this, 16)));
    }

    @Override // androidx.fragment.app.k0
    public final void onPause() {
        super.onPause();
        this.R.set(false);
        x();
        AnimatorSet animatorSet = this.O;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            animatorSet.end();
            animatorSet.cancel();
        }
    }

    @Override // ji.e
    public final void v(Bundle bundle) {
        ta.a aVar = this.f36400f;
        kotlin.jvm.internal.m.c(aVar);
        final int i11 = 0;
        bq.z.b(((n4) aVar).f32987b, new fz.c(this) { // from class: hh.d1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f1 f32221b;

            {
                this.f32221b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                View it = (View) obj;
                switch (i11) {
                    case 0:
                        kotlin.jvm.internal.m.f(it, "it");
                        f1 f1Var = this.f32221b;
                        f1Var.t().c("jxz_fl_review_click_game", new m9(26));
                        f1Var.startActivity(new Intent(f1Var.requireContext(), (Class<?>) WordGameIndexActivity.class));
                        break;
                    case 1:
                        kotlin.jvm.internal.m.f(it, "it");
                        f1 f1Var2 = this.f32221b;
                        f1Var2.t().c("jxz_fl_review_click_word", new m9(26));
                        f1Var2.startActivity(new Intent(f1Var2.requireContext(), (Class<?>) PdVocabularyActivity.class));
                        break;
                    case 2:
                        kotlin.jvm.internal.m.f(it, "it");
                        f1 f1Var3 = this.f32221b;
                        f1Var3.t().c("jxz_fl_review_click_keypoint", new m9(26));
                        f1Var3.startActivity(new Intent(f1Var3.requireContext(), (Class<?>) PdGrammarActivity.class));
                        break;
                    default:
                        kotlin.jvm.internal.m.f(it, "it");
                        f1 f1Var4 = this.f32221b;
                        f1Var4.t().c("jxz_fl_review_click_lessonstarred", new m9(26));
                        f1Var4.startActivity(new Intent(f1Var4.requireContext(), (Class<?>) PdFeedStarredActivity.class));
                        break;
                }
                return qy.b0.f48488a;
            }
        });
        ta.a aVar2 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar2);
        final int i12 = 1;
        bq.z.b(((n4) aVar2).f32993h, new fz.c(this) { // from class: hh.d1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f1 f32221b;

            {
                this.f32221b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                View it = (View) obj;
                switch (i12) {
                    case 0:
                        kotlin.jvm.internal.m.f(it, "it");
                        f1 f1Var = this.f32221b;
                        f1Var.t().c("jxz_fl_review_click_game", new m9(26));
                        f1Var.startActivity(new Intent(f1Var.requireContext(), (Class<?>) WordGameIndexActivity.class));
                        break;
                    case 1:
                        kotlin.jvm.internal.m.f(it, "it");
                        f1 f1Var2 = this.f32221b;
                        f1Var2.t().c("jxz_fl_review_click_word", new m9(26));
                        f1Var2.startActivity(new Intent(f1Var2.requireContext(), (Class<?>) PdVocabularyActivity.class));
                        break;
                    case 2:
                        kotlin.jvm.internal.m.f(it, "it");
                        f1 f1Var3 = this.f32221b;
                        f1Var3.t().c("jxz_fl_review_click_keypoint", new m9(26));
                        f1Var3.startActivity(new Intent(f1Var3.requireContext(), (Class<?>) PdGrammarActivity.class));
                        break;
                    default:
                        kotlin.jvm.internal.m.f(it, "it");
                        f1 f1Var4 = this.f32221b;
                        f1Var4.t().c("jxz_fl_review_click_lessonstarred", new m9(26));
                        f1Var4.startActivity(new Intent(f1Var4.requireContext(), (Class<?>) PdFeedStarredActivity.class));
                        break;
                }
                return qy.b0.f48488a;
            }
        });
        ta.a aVar3 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar3);
        final int i13 = 2;
        bq.z.b(((n4) aVar3).f32991f, new fz.c(this) { // from class: hh.d1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f1 f32221b;

            {
                this.f32221b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                View it = (View) obj;
                switch (i13) {
                    case 0:
                        kotlin.jvm.internal.m.f(it, "it");
                        f1 f1Var = this.f32221b;
                        f1Var.t().c("jxz_fl_review_click_game", new m9(26));
                        f1Var.startActivity(new Intent(f1Var.requireContext(), (Class<?>) WordGameIndexActivity.class));
                        break;
                    case 1:
                        kotlin.jvm.internal.m.f(it, "it");
                        f1 f1Var2 = this.f32221b;
                        f1Var2.t().c("jxz_fl_review_click_word", new m9(26));
                        f1Var2.startActivity(new Intent(f1Var2.requireContext(), (Class<?>) PdVocabularyActivity.class));
                        break;
                    case 2:
                        kotlin.jvm.internal.m.f(it, "it");
                        f1 f1Var3 = this.f32221b;
                        f1Var3.t().c("jxz_fl_review_click_keypoint", new m9(26));
                        f1Var3.startActivity(new Intent(f1Var3.requireContext(), (Class<?>) PdGrammarActivity.class));
                        break;
                    default:
                        kotlin.jvm.internal.m.f(it, "it");
                        f1 f1Var4 = this.f32221b;
                        f1Var4.t().c("jxz_fl_review_click_lessonstarred", new m9(26));
                        f1Var4.startActivity(new Intent(f1Var4.requireContext(), (Class<?>) PdFeedStarredActivity.class));
                        break;
                }
                return qy.b0.f48488a;
            }
        });
        ta.a aVar4 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar4);
        final int i14 = 3;
        bq.z.b(((n4) aVar4).f32992g, new fz.c(this) { // from class: hh.d1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f1 f32221b;

            {
                this.f32221b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                View it = (View) obj;
                switch (i14) {
                    case 0:
                        kotlin.jvm.internal.m.f(it, "it");
                        f1 f1Var = this.f32221b;
                        f1Var.t().c("jxz_fl_review_click_game", new m9(26));
                        f1Var.startActivity(new Intent(f1Var.requireContext(), (Class<?>) WordGameIndexActivity.class));
                        break;
                    case 1:
                        kotlin.jvm.internal.m.f(it, "it");
                        f1 f1Var2 = this.f32221b;
                        f1Var2.t().c("jxz_fl_review_click_word", new m9(26));
                        f1Var2.startActivity(new Intent(f1Var2.requireContext(), (Class<?>) PdVocabularyActivity.class));
                        break;
                    case 2:
                        kotlin.jvm.internal.m.f(it, "it");
                        f1 f1Var3 = this.f32221b;
                        f1Var3.t().c("jxz_fl_review_click_keypoint", new m9(26));
                        f1Var3.startActivity(new Intent(f1Var3.requireContext(), (Class<?>) PdGrammarActivity.class));
                        break;
                    default:
                        kotlin.jvm.internal.m.f(it, "it");
                        f1 f1Var4 = this.f32221b;
                        f1Var4.t().c("jxz_fl_review_click_lessonstarred", new m9(26));
                        f1Var4.startActivity(new Intent(f1Var4.requireContext(), (Class<?>) PdFeedStarredActivity.class));
                        break;
                }
                return qy.b0.f48488a;
            }
        });
    }

    public final void x() {
        rx.b bVar = this.N;
        if (bVar != null && !bVar.b()) {
            bVar.dispose();
        }
        ta.a aVar = this.f36400f;
        kotlin.jvm.internal.m.c(aVar);
        if (((n4) aVar).f32988c != null) {
            this.P = 0;
            ta.a aVar2 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar2);
            int childCount = ((n4) aVar2).f32989d.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                ta.a aVar3 = this.f36400f;
                kotlin.jvm.internal.m.c(aVar3);
                View childAt = ((n4) aVar3).f32989d.getChildAt(i11);
                childAt.clearAnimation();
                childAt.setTranslationX(CropImageView.DEFAULT_ASPECT_RATIO);
                childAt.setTranslationY(CropImageView.DEFAULT_ASPECT_RATIO);
                childAt.setScaleX(1.0f);
                childAt.setScaleY(1.0f);
                childAt.setVisibility(4);
            }
        }
        ta.a aVar4 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar4);
        ((n4) aVar4).f32989d.removeAllViews();
        this.P = 0;
        ArrayList arrayList = this.Q;
        Iterator it = arrayList.iterator();
        kotlin.jvm.internal.m.e(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            kotlin.jvm.internal.m.e(next, "next(...)");
            AnimatorSet animatorSet = (AnimatorSet) next;
            animatorSet.removeAllListeners();
            animatorSet.end();
            animatorSet.cancel();
        }
        arrayList.clear();
    }

    @Override // ji.e, androidx.fragment.app.k0
    public final void onResume() {
        super.onResume();
        AtomicBoolean atomicBoolean = this.R;
        atomicBoolean.set(true);
        if (this.O == null) {
            ArrayList arrayList = new ArrayList();
            ta.a aVar = this.f36400f;
            kotlin.jvm.internal.m.c(aVar);
            ObjectAnimator duration = ObjectAnimator.ofFloat(((n4) aVar).f32988c, "rotation", CropImageView.DEFAULT_ASPECT_RATIO, 360.0f).setDuration(10000L);
            kotlin.jvm.internal.m.e(duration, "setDuration(...)");
            duration.setRepeatCount(-1);
            duration.setInterpolator(new LinearInterpolator());
            ta.a aVar2 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar2);
            ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(((n4) aVar2).f32990e, PropertyValuesHolder.ofFloat("scaleX", 1.1f), PropertyValuesHolder.ofFloat("scaleY", 1.1f));
            kotlin.jvm.internal.m.e(objectAnimatorOfPropertyValuesHolder, nuRcCS.NwLQygmD);
            objectAnimatorOfPropertyValuesHolder.setDuration(1800L);
            objectAnimatorOfPropertyValuesHolder.setRepeatCount(-1);
            objectAnimatorOfPropertyValuesHolder.setRepeatMode(2);
            objectAnimatorOfPropertyValuesHolder.setInterpolator(new LinearInterpolator());
            arrayList.add(duration);
            arrayList.add(objectAnimatorOfPropertyValuesHolder);
            AnimatorSet animatorSet = new AnimatorSet();
            this.O = animatorSet;
            animatorSet.playTogether(arrayList);
        }
        AnimatorSet animatorSet2 = this.O;
        if (animatorSet2 != null) {
            animatorSet2.start();
        }
        x();
        atomicBoolean.get();
        if (!atomicBoolean.get()) {
            return;
        }
        ta.a aVar3 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar3);
        FrameLayout frameLayout = ((n4) aVar3).f32989d;
        frameLayout.postDelayed(new b2.c(4, frameLayout, new o(this, 5)), 0L);
    }
}
