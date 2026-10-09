package qp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.github.ybq.android.spinkit.SpinKitView;
import com.google.android.flexbox.FlexboxLayout;
import com.google.android.material.card.MaterialCardView;
import com.lingo.lingoskill.widget.RoleWaveView;
import com.lingodeer.R;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e2 extends kotlin.jvm.internal.j implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e2 f47910a = new e2(3, hj.n2.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/lingo/lingoskill/databinding/CnSentenceModelView7Binding;", 0);

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater p4 = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        kotlin.jvm.internal.m.f(p4, "p0");
        View viewInflate = p4.inflate(R.layout.cn_sentence_model_view_7, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i11 = R.id.card_sentence;
        if (((MaterialCardView) fr.j3.q(viewInflate, R.id.card_sentence)) != null) {
            i11 = R.id.fl_audio;
            FrameLayout frameLayout = (FrameLayout) fr.j3.q(viewInflate, R.id.fl_audio);
            if (frameLayout != null) {
                i11 = R.id.fl_play_recorder;
                FrameLayout frameLayout2 = (FrameLayout) fr.j3.q(viewInflate, R.id.fl_play_recorder);
                if (frameLayout2 != null) {
                    i11 = R.id.fl_speak;
                    FrameLayout frameLayout3 = (FrameLayout) fr.j3.q(viewInflate, R.id.fl_speak);
                    if (frameLayout3 != null) {
                        i11 = R.id.flex_container;
                        FlexboxLayout flexboxLayout = (FlexboxLayout) fr.j3.q(viewInflate, R.id.flex_container);
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
                                                            i11 = R.id.tv_trans;
                                                            TextView textView2 = (TextView) fr.j3.q(viewInflate, R.id.tv_trans);
                                                            if (textView2 != null) {
                                                                i11 = R.id.wave_view;
                                                                RoleWaveView roleWaveView = (RoleWaveView) fr.j3.q(viewInflate, R.id.wave_view);
                                                                if (roleWaveView != null) {
                                                                    return new hj.n2(constraintLayout, frameLayout, frameLayout2, frameLayout3, flexboxLayout, imageView, imageView2, imageView3, constraintLayout, spinKitView, textView, textView2, roleWaveView);
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
