package hj;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.github.ybq.android.spinkit.SpinKitView;
import com.google.android.flexbox.FlexboxLayout;
import com.lingo.lingoskill.widget.RoleWaveView;
import com.lingodeer.R;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class n1 implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f32952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FrameLayout f32953b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FrameLayout f32954c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final FrameLayout f32955d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final FlexboxLayout f32956e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ImageView f32957f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ImageView f32958g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ImageView f32959h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final LottieAnimationView f32960i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ConstraintLayout f32961j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final SpinKitView f32962k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final TextView f32963l;
    public final TextView m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final View f32964n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final View f32965o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final RoleWaveView f32966p;

    public n1(ConstraintLayout constraintLayout, FrameLayout frameLayout, FrameLayout frameLayout2, FrameLayout frameLayout3, FlexboxLayout flexboxLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, LottieAnimationView lottieAnimationView, ConstraintLayout constraintLayout2, SpinKitView spinKitView, TextView textView, TextView textView2, View view, View view2, RoleWaveView roleWaveView) {
        this.f32952a = constraintLayout;
        this.f32953b = frameLayout;
        this.f32954c = frameLayout2;
        this.f32955d = frameLayout3;
        this.f32956e = flexboxLayout;
        this.f32957f = imageView;
        this.f32958g = imageView2;
        this.f32959h = imageView3;
        this.f32960i = lottieAnimationView;
        this.f32961j = constraintLayout2;
        this.f32962k = spinKitView;
        this.f32963l = textView;
        this.m = textView2;
        this.f32964n = view;
        this.f32965o = view2;
        this.f32966p = roleWaveView;
    }

    public static n1 a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(R.layout.cn_challenge_sentence_model_view_7, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        int i11 = R.id.const_main;
        if (((ConstraintLayout) fr.j3.q(viewInflate, R.id.const_main)) != null) {
            i11 = R.id.const_title;
            if (((ConstraintLayout) fr.j3.q(viewInflate, R.id.const_title)) != null) {
                i11 = R.id.fl_audio;
                FrameLayout frameLayout = (FrameLayout) fr.j3.q(viewInflate, R.id.fl_audio);
                if (frameLayout != null) {
                    i11 = R.id.fl_play_recorder;
                    FrameLayout frameLayout2 = (FrameLayout) fr.j3.q(viewInflate, R.id.fl_play_recorder);
                    if (frameLayout2 != null) {
                        i11 = R.id.fl_speak;
                        FrameLayout frameLayout3 = (FrameLayout) fr.j3.q(viewInflate, R.id.fl_speak);
                        if (frameLayout3 != null) {
                            i11 = R.id.flex_sentence;
                            FlexboxLayout flexboxLayout = (FlexboxLayout) fr.j3.q(viewInflate, R.id.flex_sentence);
                            if (flexboxLayout != null) {
                                i11 = R.id.iv_play_recorder;
                                ImageView imageView = (ImageView) fr.j3.q(viewInflate, R.id.iv_play_recorder);
                                if (imageView != null) {
                                    i11 = R.id.iv_player;
                                    ImageView imageView2 = (ImageView) fr.j3.q(viewInflate, R.id.iv_player);
                                    if (imageView2 != null) {
                                        i11 = R.id.iv_recorder;
                                        ImageView imageView3 = (ImageView) fr.j3.q(viewInflate, R.id.iv_recorder);
                                        if (imageView3 != null) {
                                            i11 = R.id.iv_status;
                                            if (((ImageView) fr.j3.q(viewInflate, R.id.iv_status)) != null) {
                                                i11 = R.id.ll_parent;
                                                if (((LinearLayout) fr.j3.q(viewInflate, R.id.ll_parent)) != null) {
                                                    i11 = R.id.lottie_deer;
                                                    LottieAnimationView lottieAnimationView = (LottieAnimationView) fr.j3.q(viewInflate, R.id.lottie_deer);
                                                    if (lottieAnimationView != null) {
                                                        i11 = R.id.lottie_result_deer;
                                                        if (((LottieAnimationView) fr.j3.q(viewInflate, R.id.lottie_result_deer)) != null) {
                                                            ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                                            i11 = R.id.spin_kit;
                                                            SpinKitView spinKitView = (SpinKitView) fr.j3.q(viewInflate, R.id.spin_kit);
                                                            if (spinKitView != null) {
                                                                i11 = R.id.tv_hint;
                                                                TextView textView = (TextView) fr.j3.q(viewInflate, R.id.tv_hint);
                                                                if (textView != null) {
                                                                    i11 = R.id.tv_recognize_sentence;
                                                                    if (((TextView) fr.j3.q(viewInflate, R.id.tv_recognize_sentence)) != null) {
                                                                        i11 = R.id.tv_speech_score;
                                                                        if (((TextView) fr.j3.q(viewInflate, R.id.tv_speech_score)) != null) {
                                                                            i11 = R.id.tv_translation;
                                                                            TextView textView2 = (TextView) fr.j3.q(viewInflate, R.id.tv_translation);
                                                                            if (textView2 != null) {
                                                                                i11 = R.id.view_anima_pos;
                                                                                View viewQ = fr.j3.q(viewInflate, R.id.view_anima_pos);
                                                                                if (viewQ != null) {
                                                                                    i11 = R.id.view_pos;
                                                                                    View viewQ2 = fr.j3.q(viewInflate, R.id.view_pos);
                                                                                    if (viewQ2 != null) {
                                                                                        i11 = R.id.wave_view;
                                                                                        RoleWaveView roleWaveView = (RoleWaveView) fr.j3.q(viewInflate, R.id.wave_view);
                                                                                        if (roleWaveView != null) {
                                                                                            return new n1(constraintLayout, frameLayout, frameLayout2, frameLayout3, flexboxLayout, imageView, imageView2, imageView3, lottieAnimationView, constraintLayout, spinKitView, textView, textView2, viewQ, viewQ2, roleWaveView);
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
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
    }

    @Override // ta.a
    public final View getRoot() {
        return this.f32952a;
    }
}
