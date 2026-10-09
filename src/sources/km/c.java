package km;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.button.MaterialButton;
import com.lingodeer.R;
import fr.j3;
import hj.b4;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c extends kotlin.jvm.internal.j implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f38163a = new c(3, b4.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/lingo/lingoskill/databinding/FragmentLessonTestFinish3Binding;", 0);

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater p4 = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        kotlin.jvm.internal.m.f(p4, "p0");
        View viewInflate = p4.inflate(R.layout.fragment_lesson_test_finish_3, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i11 = R.id.btn_continue;
        MaterialButton materialButton = (MaterialButton) j3.q(viewInflate, R.id.btn_continue);
        if (materialButton != null) {
            i11 = R.id.btn_exam;
            if (((MaterialButton) j3.q(viewInflate, R.id.btn_exam)) != null) {
                i11 = R.id.btn_next;
                MaterialButton materialButton2 = (MaterialButton) j3.q(viewInflate, R.id.btn_next);
                if (materialButton2 != null) {
                    i11 = R.id.btn_redo;
                    if (((MaterialButton) j3.q(viewInflate, R.id.btn_redo)) != null) {
                        i11 = R.id.finish_amin;
                        LottieAnimationView lottieAnimationView = (LottieAnimationView) j3.q(viewInflate, R.id.finish_amin);
                        if (lottieAnimationView != null) {
                            i11 = R.id.frame_cup;
                            FrameLayout frameLayout = (FrameLayout) j3.q(viewInflate, R.id.frame_cup);
                            if (frameLayout != null) {
                                i11 = R.id.iv_clear;
                                ImageView imageView = (ImageView) j3.q(viewInflate, R.id.iv_clear);
                                if (imageView != null) {
                                    i11 = R.id.iv_cup;
                                    ImageView imageView2 = (ImageView) j3.q(viewInflate, R.id.iv_cup);
                                    if (imageView2 != null) {
                                        i11 = R.id.iv_cup_bg;
                                        ImageView imageView3 = (ImageView) j3.q(viewInflate, R.id.iv_cup_bg);
                                        if (imageView3 != null) {
                                            i11 = R.id.iv_cup_star;
                                            ImageView imageView4 = (ImageView) j3.q(viewInflate, R.id.iv_cup_star);
                                            if (imageView4 != null) {
                                                i11 = R.id.iv_tag;
                                                if (((ImageView) j3.q(viewInflate, R.id.iv_tag)) != null) {
                                                    i11 = R.id.ll_btm_btn_parent;
                                                    if (((LinearLayout) j3.q(viewInflate, R.id.ll_btm_btn_parent)) != null) {
                                                        i11 = R.id.ll_star_parent;
                                                        LinearLayout linearLayout = (LinearLayout) j3.q(viewInflate, R.id.ll_star_parent);
                                                        if (linearLayout != null) {
                                                            i11 = R.id.status_bar_view;
                                                            View viewQ = j3.q(viewInflate, R.id.status_bar_view);
                                                            if (viewQ != null) {
                                                                i11 = R.id.tv_extra_desc;
                                                                if (((TextView) j3.q(viewInflate, R.id.tv_extra_desc)) != null) {
                                                                    i11 = R.id.tv_success;
                                                                    TextView textView = (TextView) j3.q(viewInflate, R.id.tv_success);
                                                                    if (textView != null) {
                                                                        i11 = R.id.tv_xp;
                                                                        TextView textView2 = (TextView) j3.q(viewInflate, R.id.tv_xp);
                                                                        if (textView2 != null) {
                                                                            return new b4((ConstraintLayout) viewInflate, materialButton, materialButton2, lottieAnimationView, frameLayout, imageView, imageView2, imageView3, imageView4, linearLayout, viewQ, textView, textView2);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
    }
}
