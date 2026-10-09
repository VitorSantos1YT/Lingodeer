package hj;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.lingodeer.R;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class a6 implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f32356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ViewGroup f32357c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View f32358d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final View f32359e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final View f32360f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final View f32361g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final View f32362h;

    public /* synthetic */ a6(ViewGroup viewGroup, View view, View view2, View view3, TextView textView, View view4, View view5, int i11) {
        this.f32355a = i11;
        this.f32357c = viewGroup;
        this.f32358d = view;
        this.f32359e = view2;
        this.f32360f = view3;
        this.f32356b = textView;
        this.f32361g = view4;
        this.f32362h = view5;
    }

    public static a6 a(View view) {
        int i11 = R.id.const_main;
        if (((ConstraintLayout) fr.j3.q(view, R.id.const_main)) != null) {
            i11 = R.id.fl_audio;
            if (((FrameLayout) fr.j3.q(view, R.id.fl_audio)) != null) {
                i11 = R.id.iv_audio;
                ImageView imageView = (ImageView) fr.j3.q(view, R.id.iv_audio);
                if (imageView != null) {
                    i11 = R.id.lottie_deer;
                    LottieAnimationView lottieAnimationView = (LottieAnimationView) fr.j3.q(view, R.id.lottie_deer);
                    if (lottieAnimationView != null) {
                        i11 = R.id.lottie_result_deer;
                        LottieAnimationView lottieAnimationView2 = (LottieAnimationView) fr.j3.q(view, R.id.lottie_result_deer);
                        if (lottieAnimationView2 != null) {
                            i11 = R.id.tv_translation;
                            TextView textView = (TextView) fr.j3.q(view, R.id.tv_translation);
                            if (textView != null) {
                                i11 = R.id.view_anima_pos;
                                View viewQ = fr.j3.q(view, R.id.view_anima_pos);
                                if (viewQ != null) {
                                    i11 = R.id.view_pos;
                                    View viewQ2 = fr.j3.q(view, R.id.view_pos);
                                    if (viewQ2 != null) {
                                        return new a6((ConstraintLayout) view, imageView, lottieAnimationView, lottieAnimationView2, textView, viewQ, viewQ2, 0);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    public static a6 b(View view) {
        int i11 = R.id.ll_a;
        LinearLayout linearLayout = (LinearLayout) fr.j3.q(view, R.id.ll_a);
        if (linearLayout != null) {
            i11 = R.id.ll_a_luoma;
            LinearLayout linearLayout2 = (LinearLayout) fr.j3.q(view, R.id.ll_a_luoma);
            if (linearLayout2 != null) {
                i11 = R.id.ll_a_pian;
                LinearLayout linearLayout3 = (LinearLayout) fr.j3.q(view, R.id.ll_a_pian);
                if (linearLayout3 != null) {
                    i11 = R.id.tv_a;
                    TextView textView = (TextView) fr.j3.q(view, R.id.tv_a);
                    if (textView != null) {
                        i11 = R.id.tv_a_luoma;
                        TextView textView2 = (TextView) fr.j3.q(view, R.id.tv_a_luoma);
                        if (textView2 != null) {
                            i11 = R.id.tv_a_pian;
                            TextView textView3 = (TextView) fr.j3.q(view, R.id.tv_a_pian);
                            if (textView3 != null) {
                                return new a6((LinearLayout) view, linearLayout, linearLayout2, linearLayout3, textView, textView2, textView3, 1);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // ta.a
    public final View getRoot() {
        switch (this.f32355a) {
            case 0:
                return (ConstraintLayout) this.f32357c;
            default:
                return (LinearLayout) this.f32357c;
        }
    }
}
