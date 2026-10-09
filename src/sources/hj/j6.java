package hj;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.flexbox.FlexboxLayout;
import com.lingo.lingoskill.widget.GameLife;
import com.lingodeer.R;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class j6 implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32792a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f32793b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImageView f32794c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View f32795d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ViewGroup f32796e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final View f32797f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final View f32798g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final View f32799h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final View f32800i;

    public j6(FrameLayout frameLayout, FrameLayout frameLayout2, FlexboxLayout flexboxLayout, FrameLayout frameLayout3, FrameLayout frameLayout4, ImageView imageView, ImageView imageView2, ProgressBar progressBar) {
        this.f32796e = frameLayout;
        this.f32797f = frameLayout2;
        this.f32798g = flexboxLayout;
        this.f32799h = frameLayout3;
        this.f32800i = frameLayout4;
        this.f32793b = imageView;
        this.f32794c = imageView2;
        this.f32795d = progressBar;
    }

    public static j6 a(View view) {
        int i11 = R.id.fl_play_ctr;
        FrameLayout frameLayout = (FrameLayout) fr.j3.q(view, R.id.fl_play_ctr);
        if (frameLayout != null) {
            i11 = R.id.fl_sentence;
            FlexboxLayout flexboxLayout = (FlexboxLayout) fr.j3.q(view, R.id.fl_sentence);
            if (flexboxLayout != null) {
                FrameLayout frameLayout2 = (FrameLayout) view;
                i11 = R.id.frame_mask;
                FrameLayout frameLayout3 = (FrameLayout) fr.j3.q(view, R.id.frame_mask);
                if (frameLayout3 != null) {
                    i11 = R.id.iv_pic;
                    ImageView imageView = (ImageView) fr.j3.q(view, R.id.iv_pic);
                    if (imageView != null) {
                        i11 = R.id.iv_play_ctr;
                        ImageView imageView2 = (ImageView) fr.j3.q(view, R.id.iv_play_ctr);
                        if (imageView2 != null) {
                            i11 = R.id.progress_bar;
                            ProgressBar progressBar = (ProgressBar) fr.j3.q(view, R.id.progress_bar);
                            if (progressBar != null) {
                                return new j6(frameLayout2, frameLayout, flexboxLayout, frameLayout2, frameLayout3, imageView, imageView2, progressBar);
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
        switch (this.f32792a) {
            case 0:
                return (LinearLayout) this.f32796e;
            case 1:
                return (FrameLayout) this.f32796e;
            default:
                return (ConstraintLayout) this.f32796e;
        }
    }

    public j6(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, LottieAnimationView lottieAnimationView, ConstraintLayout constraintLayout2, TextView textView, TextView textView2) {
        this.f32796e = constraintLayout;
        this.f32793b = imageView;
        this.f32794c = imageView2;
        this.f32798g = imageView3;
        this.f32797f = lottieAnimationView;
        this.f32795d = constraintLayout2;
        this.f32799h = textView;
        this.f32800i = textView2;
    }

    public j6(LinearLayout linearLayout, GameLife gameLife, ImageView imageView, ImageView imageView2, ImageView imageView3, ProgressBar progressBar, TextView textView, TextView textView2) {
        this.f32796e = linearLayout;
        this.f32797f = gameLife;
        this.f32793b = imageView;
        this.f32794c = imageView2;
        this.f32798g = imageView3;
        this.f32795d = progressBar;
        this.f32799h = textView;
        this.f32800i = textView2;
    }
}
