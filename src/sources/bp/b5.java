package bp;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwnerKt;
import com.lingo.lingoskill.chineseskill.ui.sc.ui.ScDetailActivity;
import com.lingo.lingoskill.object.TravelCategory;
import com.lingo.lingoskill.ui.review.BaseReviewEmptyActivity;
import com.lingo.lingoskill.ui.review.HwFlashCardTestActivity;
import com.lingo.lingoskill.ui.review.OldFlashCardTestActivity;
import com.lingodeer.R;
import com.lingodeer.data.model.INTENTS;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import rt.m9;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class b5 extends ji.e {
    public rx.b N;
    public AnimatorSet O;
    public int P;
    public int Q;
    public final ArrayList R;
    public final AtomicBoolean S;
    public final Object T;
    public final Object U;
    public final Object V;
    public final i.c W;

    public b5() {
        super(x4.f4901a, BuildConfig.VERSION_NAME);
        this.R = new ArrayList();
        this.S = new AtomicBoolean(false);
        z4 z4Var = new z4(this, 0);
        qy.j jVar = qy.j.NONE;
        com.bumptech.glide.d.u(jVar, new b1(3, this, z4Var));
        this.T = com.bumptech.glide.d.u(jVar, new b1(4, this, new z4(this, 1)));
        qy.j jVar2 = qy.j.SYNCHRONIZED;
        this.U = com.bumptech.glide.d.u(jVar2, new z4(this, 2));
        this.V = com.bumptech.glide.d.u(jVar2, new z4(this, 3));
        i.c cVarRegisterForActivityResult = registerForActivityResult(new androidx.fragment.app.e1(4), new app.rive.runtime.kotlin.core.a(this, 10));
        kotlin.jvm.internal.m.e(cVarRegisterForActivityResult, "registerForActivityResult(...)");
        this.W = cVarRegisterForActivityResult;
    }

    @Override // androidx.fragment.app.k0
    public final void onPause() {
        super.onPause();
        this.S.set(false);
        x();
        AnimatorSet animatorSet = this.O;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            animatorSet.end();
            animatorSet.cancel();
        }
    }

    @Override // ji.e, androidx.fragment.app.k0
    public final void onResume() {
        super.onResume();
        AtomicBoolean atomicBoolean = this.S;
        atomicBoolean.set(true);
        if (this.O == null) {
            ArrayList arrayList = new ArrayList();
            ta.a aVar = this.f36400f;
            kotlin.jvm.internal.m.c(aVar);
            ObjectAnimator duration = ObjectAnimator.ofFloat(((hj.x4) aVar).f33584c, "rotation", CropImageView.DEFAULT_ASPECT_RATIO, 360.0f).setDuration(10000L);
            kotlin.jvm.internal.m.e(duration, "setDuration(...)");
            duration.setRepeatCount(-1);
            duration.setInterpolator(new LinearInterpolator());
            ta.a aVar2 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar2);
            ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(((hj.x4) aVar2).f33586e, PropertyValuesHolder.ofFloat("scaleX", 1.1f), PropertyValuesHolder.ofFloat("scaleY", 1.1f));
            kotlin.jvm.internal.m.e(objectAnimatorOfPropertyValuesHolder, "ofPropertyValuesHolder(...)");
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
        if (atomicBoolean.get()) {
            ta.a aVar3 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar3);
            FrameLayout frameLayout = ((hj.x4) aVar3).f33585d;
            frameLayout.postDelayed(new b2.c(4, frameLayout, new av.d(this, 10)), 0L);
        }
        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(this), null, null, new b1.c(this, (vy.d) null, 11), 3);
        if (r().scLanguage > 0) {
            t().d("TravelPhraseTabReview");
        } else {
            t().d("CharacterDrillTabReview");
        }
    }

    @Override // ji.e
    public final void v(Bundle bundle) {
        ta.a aVar = this.f36400f;
        kotlin.jvm.internal.m.c(aVar);
        final int i11 = 0;
        bq.z.b(((hj.x4) aVar).f33583b, new fz.c(this) { // from class: bp.w4

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b5 f4878b;

            {
                this.f4878b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i12 = i11;
                qy.b0 b0Var = qy.b0.f48488a;
                b5 b5Var = this.f4878b;
                View it = (View) obj;
                switch (i12) {
                    case 0:
                        kotlin.jvm.internal.m.f(it, "it");
                        if (b5Var.r().scLanguage <= 0) {
                            b5Var.t().c("jxz_cr_review_click_flashcard", new m9(26));
                            b5Var.startActivity(new Intent(b5Var.requireContext(), (Class<?>) HwFlashCardTestActivity.class));
                        } else {
                            b5Var.t().c("jxz_tv_review_click_flashcard", new m9(26));
                            int i13 = OldFlashCardTestActivity.R;
                            androidx.fragment.app.p0 p0VarRequireActivity = b5Var.requireActivity();
                            kotlin.jvm.internal.m.e(p0VarRequireActivity, "requireActivity(...)");
                            Intent intent = new Intent(p0VarRequireActivity, (Class<?>) OldFlashCardTestActivity.class);
                            intent.putExtra(INTENTS.EXTRA_INT, 3);
                            b5Var.startActivity(new Intent(intent));
                        }
                        break;
                    default:
                        kotlin.jvm.internal.m.f(it, "it");
                        if (b5Var.Q <= 0) {
                            int i14 = BaseReviewEmptyActivity.H;
                            l.m mVar = b5Var.f36398d;
                            kotlin.jvm.internal.m.c(mVar);
                            String string = b5Var.getString(R.string.favorite);
                            kotlin.jvm.internal.m.e(string, "getString(...)");
                            b5Var.startActivity(o00.a.E(mVar, string));
                        } else if (b5Var.r().scLanguage <= 0) {
                            rz.e0.B(LifecycleOwnerKt.getLifecycleScope(b5Var), null, null, new y4(b5Var, null), 3);
                        } else {
                            b5Var.t().c("jxz_tv_review_click_fav", new m9(26));
                            TravelCategory travelCategory = new TravelCategory();
                            travelCategory.setCategoryId(-1L);
                            i.c cVar = b5Var.W;
                            int i15 = ScDetailActivity.P;
                            androidx.fragment.app.p0 p0VarRequireActivity2 = b5Var.requireActivity();
                            kotlin.jvm.internal.m.e(p0VarRequireActivity2, "requireActivity(...)");
                            Intent intent2 = new Intent(p0VarRequireActivity2, (Class<?>) ScDetailActivity.class);
                            intent2.putExtra(INTENTS.EXTRA_OBJECT, travelCategory);
                            cVar.a(intent2);
                        }
                        break;
                }
                return b0Var;
            }
        });
        ta.a aVar2 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar2);
        final int i12 = 1;
        bq.z.b(((hj.x4) aVar2).f33587f, new fz.c(this) { // from class: bp.w4

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b5 f4878b;

            {
                this.f4878b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i13 = i12;
                qy.b0 b0Var = qy.b0.f48488a;
                b5 b5Var = this.f4878b;
                View it = (View) obj;
                switch (i13) {
                    case 0:
                        kotlin.jvm.internal.m.f(it, "it");
                        if (b5Var.r().scLanguage <= 0) {
                            b5Var.t().c("jxz_cr_review_click_flashcard", new m9(26));
                            b5Var.startActivity(new Intent(b5Var.requireContext(), (Class<?>) HwFlashCardTestActivity.class));
                        } else {
                            b5Var.t().c("jxz_tv_review_click_flashcard", new m9(26));
                            int i14 = OldFlashCardTestActivity.R;
                            androidx.fragment.app.p0 p0VarRequireActivity = b5Var.requireActivity();
                            kotlin.jvm.internal.m.e(p0VarRequireActivity, "requireActivity(...)");
                            Intent intent = new Intent(p0VarRequireActivity, (Class<?>) OldFlashCardTestActivity.class);
                            intent.putExtra(INTENTS.EXTRA_INT, 3);
                            b5Var.startActivity(new Intent(intent));
                        }
                        break;
                    default:
                        kotlin.jvm.internal.m.f(it, "it");
                        if (b5Var.Q <= 0) {
                            int i15 = BaseReviewEmptyActivity.H;
                            l.m mVar = b5Var.f36398d;
                            kotlin.jvm.internal.m.c(mVar);
                            String string = b5Var.getString(R.string.favorite);
                            kotlin.jvm.internal.m.e(string, "getString(...)");
                            b5Var.startActivity(o00.a.E(mVar, string));
                        } else if (b5Var.r().scLanguage <= 0) {
                            rz.e0.B(LifecycleOwnerKt.getLifecycleScope(b5Var), null, null, new y4(b5Var, null), 3);
                        } else {
                            b5Var.t().c("jxz_tv_review_click_fav", new m9(26));
                            TravelCategory travelCategory = new TravelCategory();
                            travelCategory.setCategoryId(-1L);
                            i.c cVar = b5Var.W;
                            int i16 = ScDetailActivity.P;
                            androidx.fragment.app.p0 p0VarRequireActivity2 = b5Var.requireActivity();
                            kotlin.jvm.internal.m.e(p0VarRequireActivity2, "requireActivity(...)");
                            Intent intent2 = new Intent(p0VarRequireActivity2, (Class<?>) ScDetailActivity.class);
                            intent2.putExtra(INTENTS.EXTRA_OBJECT, travelCategory);
                            cVar.a(intent2);
                        }
                        break;
                }
                return b0Var;
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
        if (((hj.x4) aVar).f33584c != null) {
            this.P = 0;
            ta.a aVar2 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar2);
            int childCount = ((hj.x4) aVar2).f33585d.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                ta.a aVar3 = this.f36400f;
                kotlin.jvm.internal.m.c(aVar3);
                View childAt = ((hj.x4) aVar3).f33585d.getChildAt(i11);
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
        ((hj.x4) aVar4).f33585d.removeAllViews();
        this.P = 0;
        ArrayList arrayList = this.R;
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
}
