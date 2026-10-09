package qh;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.flexbox.FlexboxLayout;
import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;
import fr.j3;
import hj.e6;
import hj.x5;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d0 implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k0 f47753b;

    public /* synthetic */ d0(k0 k0Var, int i11) {
        this.f47752a = i11;
        this.f47753b = k0Var;
    }

    @Override // fz.a
    public final Object invoke() {
        int i11 = this.f47752a;
        k0 k0Var = this.f47753b;
        switch (i11) {
            case 0:
                ta.a aVar = k0Var.f36400f;
                kotlin.jvm.internal.m.c(aVar);
                ConstraintLayout constraintLayout = ((x5) aVar).f33590a;
                int i12 = R.id.fl_delete;
                FrameLayout frameLayout = (FrameLayout) j3.q(constraintLayout, R.id.fl_delete);
                if (frameLayout != null) {
                    i12 = R.id.fl_submit;
                    FrameLayout frameLayout2 = (FrameLayout) j3.q(constraintLayout, R.id.fl_submit);
                    if (frameLayout2 != null) {
                        i12 = R.id.flex_question_body;
                        FlexboxLayout flexboxLayout = (FlexboxLayout) j3.q(constraintLayout, R.id.flex_question_body);
                        if (flexboxLayout != null) {
                            i12 = R.id.flex_question_options;
                            FlexboxLayout flexboxLayout2 = (FlexboxLayout) j3.q(constraintLayout, R.id.flex_question_options);
                            if (flexboxLayout2 != null) {
                                i12 = R.id.ll_title;
                                LinearLayout linearLayout = (LinearLayout) j3.q(constraintLayout, R.id.ll_title);
                                if (linearLayout != null) {
                                    i12 = R.id.tv_luoma;
                                    TextView textView = (TextView) j3.q(constraintLayout, R.id.tv_luoma);
                                    if (textView != null) {
                                        i12 = R.id.tv_trans;
                                        TextView textView2 = (TextView) j3.q(constraintLayout, R.id.tv_trans);
                                        if (textView2 != null) {
                                            i12 = R.id.tv_zhuyin;
                                            TextView textView3 = (TextView) j3.q(constraintLayout, R.id.tv_zhuyin);
                                            if (textView3 != null) {
                                                return new e6(constraintLayout, frameLayout, frameLayout2, flexboxLayout, flexboxLayout2, linearLayout, textView, textView2, textView3);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(constraintLayout.getResources().getResourceName(i12)));
            default:
                ta.a aVar2 = k0Var.f36400f;
                kotlin.jvm.internal.m.c(aVar2);
                ((x5) aVar2).f33603o.start();
                ta.a aVar3 = k0Var.f36400f;
                kotlin.jvm.internal.m.c(aVar3);
                ImageView imageView = ((x5) aVar3).f33592c;
                ta.a aVar4 = k0Var.f36400f;
                kotlin.jvm.internal.m.c(aVar4);
                imageView.setPivotX(((x5) aVar4).f33592c.getWidth() / 2.0f);
                ta.a aVar5 = k0Var.f36400f;
                kotlin.jvm.internal.m.c(aVar5);
                ImageView imageView2 = ((x5) aVar5).f33592c;
                ta.a aVar6 = k0Var.f36400f;
                kotlin.jvm.internal.m.c(aVar6);
                imageView2.setPivotY(((x5) aVar6).f33592c.getHeight() / 2.0f);
                ta.a aVar7 = k0Var.f36400f;
                kotlin.jvm.internal.m.c(aVar7);
                ObjectAnimator duration = ObjectAnimator.ofPropertyValuesHolder(((x5) aVar7).f33592c, PropertyValuesHolder.ofFloat("translationY", -8.0f, CropImageView.DEFAULT_ASPECT_RATIO, 8.0f), PropertyValuesHolder.ofFloat("rotationY", -3.0f, CropImageView.DEFAULT_ASPECT_RATIO, 3.0f)).setDuration(1000L);
                k0Var.R = duration;
                if (duration != null) {
                    duration.setRepeatMode(2);
                }
                ObjectAnimator objectAnimator = k0Var.R;
                if (objectAnimator != null) {
                    objectAnimator.setRepeatCount(-1);
                }
                ObjectAnimator objectAnimator2 = k0Var.R;
                if (objectAnimator2 != null) {
                    objectAnimator2.start();
                }
                ta.a aVar8 = k0Var.f36400f;
                kotlin.jvm.internal.m.c(aVar8);
                FrameLayout frameLayout3 = ((x5) aVar8).f33599j;
                Context contextRequireContext = k0Var.requireContext();
                kotlin.jvm.internal.m.e(contextRequireContext, "requireContext(...)");
                ObjectAnimator duration2 = ObjectAnimator.ofPropertyValuesHolder(frameLayout3, PropertyValuesHolder.ofFloat("translationX", CropImageView.DEFAULT_ASPECT_RATIO, j3.y(contextRequireContext))).setDuration(240000L);
                k0Var.S = duration2;
                if (duration2 != null) {
                    duration2.setRepeatMode(1);
                }
                ObjectAnimator objectAnimator3 = k0Var.S;
                if (objectAnimator3 != null) {
                    objectAnimator3.setRepeatCount(-1);
                }
                ObjectAnimator objectAnimator4 = k0Var.S;
                if (objectAnimator4 != null) {
                    objectAnimator4.start();
                }
                ta.a aVar9 = k0Var.f36400f;
                kotlin.jvm.internal.m.c(aVar9);
                int childCount = ((x5) aVar9).f33597h.getChildCount();
                for (int i13 = 0; i13 < childCount; i13++) {
                    ta.a aVar10 = k0Var.f36400f;
                    kotlin.jvm.internal.m.c(aVar10);
                    View childAt = ((x5) aVar10).f33597h.getChildAt(i13);
                    kotlin.jvm.internal.m.d(childAt, "null cannot be cast to non-null type android.widget.ImageView");
                    Drawable background = ((ImageView) childAt).getBackground();
                    kotlin.jvm.internal.m.e(background, "getBackground(...)");
                    if (background instanceof AnimationDrawable) {
                        ((AnimationDrawable) background).start();
                    }
                }
                return qy.b0.f48488a;
        }
    }
}
