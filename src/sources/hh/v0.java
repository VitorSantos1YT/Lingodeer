package hh;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.lingo.lingoskill.widget.LollipopFixedWebView;
import com.lingodeer.R;
import fr.j3;
import hj.k6;
import hj.m4;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class v0 extends kotlin.jvm.internal.j implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v0 f32302a = new v0(3, m4.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/lingo/lingoskill/databinding/FragmentPdLearnTipsItemBinding;", 0);

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater p4 = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        kotlin.jvm.internal.m.f(p4, "p0");
        View viewInflate = p4.inflate(R.layout.fragment_pd_learn_tips_item, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i11 = R.id.const_billing;
        View viewQ = j3.q(viewInflate, R.id.const_billing);
        if (viewQ != null) {
            int i12 = R.id.btn_ok;
            MaterialButton materialButton = (MaterialButton) j3.q(viewQ, R.id.btn_ok);
            if (materialButton != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) viewQ;
                int i13 = R.id.const_billing_center;
                if (((ConstraintLayout) j3.q(viewQ, R.id.const_billing_center)) != null) {
                    i13 = R.id.lottie_deer;
                    if (((LottieAnimationView) j3.q(viewQ, R.id.lottie_deer)) != null) {
                        i13 = R.id.tv_billing_title;
                        if (((TextView) j3.q(viewQ, R.id.tv_billing_title)) != null) {
                            k6 k6Var = new k6(constraintLayout, materialButton, constraintLayout, 1);
                            i11 = R.id.frame_tips;
                            if (((MaterialCardView) j3.q(viewInflate, R.id.frame_tips)) != null) {
                                i11 = R.id.iv_fav;
                                ImageView imageView = (ImageView) j3.q(viewInflate, R.id.iv_fav);
                                if (imageView != null) {
                                    i11 = R.id.iv_plus;
                                    ImageView imageView2 = (ImageView) j3.q(viewInflate, R.id.iv_plus);
                                    if (imageView2 != null) {
                                        i11 = R.id.iv_reduse;
                                        ImageView imageView3 = (ImageView) j3.q(viewInflate, R.id.iv_reduse);
                                        if (imageView3 != null) {
                                            i11 = R.id.scroll_view;
                                            if (((NestedScrollView) j3.q(viewInflate, R.id.scroll_view)) != null) {
                                                i11 = R.id.tv_index;
                                                TextView textView = (TextView) j3.q(viewInflate, R.id.tv_index);
                                                if (textView != null) {
                                                    i11 = R.id.tv_title;
                                                    TextView textView2 = (TextView) j3.q(viewInflate, R.id.tv_title);
                                                    if (textView2 != null) {
                                                        i11 = R.id.web_view;
                                                        LollipopFixedWebView lollipopFixedWebView = (LollipopFixedWebView) j3.q(viewInflate, R.id.web_view);
                                                        if (lollipopFixedWebView != null) {
                                                            return new m4((FrameLayout) viewInflate, k6Var, imageView, imageView2, imageView3, textView, textView2, lollipopFixedWebView);
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
                i12 = i13;
            }
            throw new NullPointerException("Missing required view with ID: ".concat(viewQ.getResources().getResourceName(i12)));
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
    }
}
