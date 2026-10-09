package ci;

import android.animation.LayoutTransition;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.os.Bundle;
import android.view.animation.AccelerateInterpolator;
import androidx.lifecycle.LifecycleOwnerKt;
import com.google.android.material.button.MaterialButton;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingodeer.R;
import com.lingodeer.data.model.INTENTS;
import com.lingodeer.data.model.LearnType;
import com.yalantis.ucrop.view.CropImageView;
import hj.q5;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class v extends bp.n {
    public int P;

    public v() {
        super(t.f7153a, "AlphabetLessonPractice");
        LearnType learnType = LearnType.LEARN;
    }

    @Override // ji.e
    public final void v(Bundle bundle) {
        this.P = requireArguments().getInt(INTENTS.EXTRA_INT);
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(null, PropertyValuesHolder.ofFloat("translationX", CropImageView.DEFAULT_ASPECT_RATIO, -b7.e0.f(LingoSkillApplication.f21665b).widthPixels), PropertyValuesHolder.ofFloat("translationY", CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO));
        kotlin.jvm.internal.m.e(objectAnimatorOfPropertyValuesHolder, "ofPropertyValuesHolder(...)");
        objectAnimatorOfPropertyValuesHolder.setDuration(500L);
        objectAnimatorOfPropertyValuesHolder.setInterpolator(new AccelerateInterpolator());
        ObjectAnimator objectAnimatorOfPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(null, PropertyValuesHolder.ofFloat("translationX", b7.e0.f(LingoSkillApplication.f21665b).widthPixels, CropImageView.DEFAULT_ASPECT_RATIO), PropertyValuesHolder.ofFloat("translationY", CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO));
        kotlin.jvm.internal.m.e(objectAnimatorOfPropertyValuesHolder2, "ofPropertyValuesHolder(...)");
        objectAnimatorOfPropertyValuesHolder2.setDuration(500L);
        objectAnimatorOfPropertyValuesHolder2.setStartDelay(500L);
        objectAnimatorOfPropertyValuesHolder2.setInterpolator(new AccelerateInterpolator());
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setAnimator(2, objectAnimatorOfPropertyValuesHolder2);
        layoutTransition.setAnimator(3, objectAnimatorOfPropertyValuesHolder);
        ta.a aVar = this.f36400f;
        kotlin.jvm.internal.m.c(aVar);
        ((q5) aVar).f33168c.setLayoutTransition(layoutTransition);
        rz.e0.B(LifecycleOwnerKt.getLifecycleScope(this), null, null, new u(this, null, 0), 3);
    }

    public final void x(int i11) {
        if (i11 == 0) {
            ta.a aVar = this.f36400f;
            kotlin.jvm.internal.m.c(aVar);
            ((q5) aVar).f33167b.setVisibility(0);
            ii.a aVar2 = this.N;
            kotlin.jvm.internal.m.c(aVar2);
            if (((mm.a) aVar2).b()) {
                ta.a aVar3 = this.f36400f;
                kotlin.jvm.internal.m.c(aVar3);
                ((q5) aVar3).f33167b.setText(R.string.test_finish);
            } else {
                ta.a aVar4 = this.f36400f;
                kotlin.jvm.internal.m.c(aVar4);
                ((q5) aVar4).f33167b.setText(R.string.test_next);
            }
            ta.a aVar5 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar5);
            ((q5) aVar5).f33167b.setEnabled(false);
            ta.a aVar6 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar6);
            MaterialButton materialButton = ((q5) aVar6).f33167b;
            Context contextRequireContext = requireContext();
            kotlin.jvm.internal.m.e(contextRequireContext, "requireContext(...)");
            materialButton.setTextColor(contextRequireContext.getColor(R.color.color_AFAFAF));
            return;
        }
        if (i11 == 1) {
            ta.a aVar7 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar7);
            ((q5) aVar7).f33167b.setVisibility(8);
            return;
        }
        if (i11 != 2) {
            return;
        }
        ta.a aVar8 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar8);
        ((q5) aVar8).f33167b.setVisibility(0);
        ii.a aVar9 = this.N;
        kotlin.jvm.internal.m.c(aVar9);
        if (((mm.a) aVar9).b()) {
            ta.a aVar10 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar10);
            ((q5) aVar10).f33167b.setText(R.string.test_finish);
        } else {
            ta.a aVar11 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar11);
            ((q5) aVar11).f33167b.setText(R.string.test_next);
        }
        ta.a aVar12 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar12);
        ((q5) aVar12).f33167b.setEnabled(true);
        ta.a aVar13 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar13);
        MaterialButton materialButton2 = ((q5) aVar13).f33167b;
        Context contextRequireContext2 = requireContext();
        kotlin.jvm.internal.m.e(contextRequireContext2, "requireContext(...)");
        materialButton2.setTextColor(contextRequireContext2.getColor(R.color.white));
        ta.a aVar14 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar14);
        bq.z.b(((q5) aVar14).f33167b, new s(this, 0));
    }
}
