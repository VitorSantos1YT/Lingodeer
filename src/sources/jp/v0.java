package jp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.button.MaterialButton;
import com.lingo.lingoskill.widget.LollipopFixedWebView;
import com.lingodeer.R;
import com.youth.banner.Banner;
import fr.j3;
import hj.d3;
import hj.i6;
import hj.k6;
import hj.r5;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class v0 extends kotlin.jvm.internal.j implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v0 f36547a = new v0(3, r5.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/lingo/lingoskill/databinding/FragmentTipsBinding;", 0);

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater p4 = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        kotlin.jvm.internal.m.f(p4, "p0");
        View viewInflate = p4.inflate(R.layout.fragment_tips, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i11 = R.id.app_bar;
        View viewQ = j3.q(viewInflate, R.id.app_bar);
        if (viewQ != null) {
            d3.a(viewQ);
            i11 = R.id.fl_loading;
            ConstraintLayout constraintLayout = (ConstraintLayout) j3.q(viewInflate, R.id.fl_loading);
            if (constraintLayout != null) {
                i11 = R.id.include_lesson_test_bug_report;
                View viewQ2 = j3.q(viewInflate, R.id.include_lesson_test_bug_report);
                if (viewQ2 != null) {
                    i6 i6VarA = i6.a(viewQ2);
                    i11 = R.id.include_tips_billing_wall;
                    View viewQ3 = j3.q(viewInflate, R.id.include_tips_billing_wall);
                    if (viewQ3 != null) {
                        int i12 = R.id.btn_ok;
                        MaterialButton materialButton = (MaterialButton) j3.q(viewQ3, R.id.btn_ok);
                        if (materialButton != null) {
                            ConstraintLayout constraintLayout2 = (ConstraintLayout) viewQ3;
                            int i13 = R.id.const_billing_center;
                            if (((ConstraintLayout) j3.q(viewQ3, R.id.const_billing_center)) != null) {
                                i13 = R.id.tv_billing_title;
                                if (((TextView) j3.q(viewQ3, R.id.tv_billing_title)) != null) {
                                    i13 = R.id.view_pager;
                                    if (((Banner) j3.q(viewQ3, R.id.view_pager)) != null) {
                                        k6 k6Var = new k6(constraintLayout2, materialButton, constraintLayout2, 0);
                                        i11 = R.id.iv_plus;
                                        ImageView imageView = (ImageView) j3.q(viewInflate, R.id.iv_plus);
                                        if (imageView != null) {
                                            i11 = R.id.iv_reduse;
                                            ImageView imageView2 = (ImageView) j3.q(viewInflate, R.id.iv_reduse);
                                            if (imageView2 != null) {
                                                i11 = R.id.pb_circle;
                                                LottieAnimationView lottieAnimationView = (LottieAnimationView) j3.q(viewInflate, R.id.pb_circle);
                                                if (lottieAnimationView != null) {
                                                    i11 = R.id.scroll_view;
                                                    NestedScrollView nestedScrollView = (NestedScrollView) j3.q(viewInflate, R.id.scroll_view);
                                                    if (nestedScrollView != null) {
                                                        i11 = R.id.tv_prompt;
                                                        TextView textView = (TextView) j3.q(viewInflate, R.id.tv_prompt);
                                                        if (textView != null) {
                                                            i11 = R.id.web_view;
                                                            LollipopFixedWebView lollipopFixedWebView = (LollipopFixedWebView) j3.q(viewInflate, R.id.web_view);
                                                            if (lollipopFixedWebView != null) {
                                                                return new r5((ConstraintLayout) viewInflate, constraintLayout, i6VarA, k6Var, imageView, imageView2, lottieAnimationView, nestedScrollView, textView, lollipopFixedWebView);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            i12 = i13;
                        }
                        throw new NullPointerException("Missing required view with ID: ".concat(viewQ3.getResources().getResourceName(i12)));
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
    }
}
