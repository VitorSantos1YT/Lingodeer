package hj;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.media3.ui.PlayerView;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.card.MaterialCardView;
import com.lingodeer.R;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class z5 implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f33674b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ViewGroup f33675c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ImageView f33676d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final View f33677e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final View f33678f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final View f33679g;

    public /* synthetic */ z5(ViewGroup viewGroup, ImageView imageView, ImageView imageView2, View view, View view2, View view3, int i11) {
        this.f33673a = i11;
        this.f33675c = viewGroup;
        this.f33674b = imageView;
        this.f33676d = imageView2;
        this.f33677e = view;
        this.f33678f = view2;
        this.f33679g = view3;
    }

    public static z5 a(View view) {
        int i11 = R.id.const_main;
        if (((ConstraintLayout) fr.j3.q(view, R.id.const_main)) != null) {
            i11 = R.id.iv_audio;
            ImageView imageView = (ImageView) fr.j3.q(view, R.id.iv_audio);
            if (imageView != null) {
                i11 = R.id.lottie_deer;
                LottieAnimationView lottieAnimationView = (LottieAnimationView) fr.j3.q(view, R.id.lottie_deer);
                if (lottieAnimationView != null) {
                    i11 = R.id.lottie_result_deer;
                    LottieAnimationView lottieAnimationView2 = (LottieAnimationView) fr.j3.q(view, R.id.lottie_result_deer);
                    if (lottieAnimationView2 != null) {
                        i11 = R.id.view_anima_pos;
                        View viewQ = fr.j3.q(view, R.id.view_anima_pos);
                        if (viewQ != null) {
                            i11 = R.id.view_pos;
                            View viewQ2 = fr.j3.q(view, R.id.view_pos);
                            if (viewQ2 != null) {
                                return new z5((ConstraintLayout) view, imageView, lottieAnimationView, lottieAnimationView2, viewQ, viewQ2, 0);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    public static z5 b(View view) {
        int i11 = R.id.btn_play;
        ImageView imageView = (ImageView) fr.j3.q(view, R.id.btn_play);
        if (imageView != null) {
            i11 = R.id.btn_slow;
            ImageView imageView2 = (ImageView) fr.j3.q(view, R.id.btn_slow);
            if (imageView2 != null) {
                MaterialCardView materialCardView = (MaterialCardView) view;
                i11 = R.id.exo_player;
                PlayerView playerView = (PlayerView) fr.j3.q(view, R.id.exo_player);
                if (playerView != null) {
                    i11 = R.id.frame_video_overlay;
                    FrameLayout frameLayout = (FrameLayout) fr.j3.q(view, R.id.frame_video_overlay);
                    if (frameLayout != null) {
                        i11 = R.id.ll_control;
                        LinearLayout linearLayout = (LinearLayout) fr.j3.q(view, R.id.ll_control);
                        if (linearLayout != null) {
                            return new z5(materialCardView, imageView, imageView2, playerView, frameLayout, linearLayout, 1);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // ta.a
    public final View getRoot() {
        switch (this.f33673a) {
            case 0:
                return (ConstraintLayout) this.f33675c;
            default:
                return (MaterialCardView) this.f33675c;
        }
    }
}
