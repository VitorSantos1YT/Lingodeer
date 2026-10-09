package qp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.flexbox.FlexboxLayout;
import com.lingo.lingoskill.chineseskill.ui.pinyin.widget.WaveView;
import com.lingo.lingoskill.widget.SlowPlaySwitchBtn;
import com.lingodeer.R;
import hj.b6;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class k1 extends kotlin.jvm.internal.j implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k1 f48007a = new k1(3, hj.z1.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/lingo/lingoskill/databinding/CnSentenceModelView0Binding;", 0);

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater p4 = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        kotlin.jvm.internal.m.f(p4, "p0");
        View viewInflate = p4.inflate(R.layout.cn_sentence_model_view_0, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i11 = R.id.fl_play_recorder;
        FrameLayout frameLayout = (FrameLayout) fr.j3.q(viewInflate, R.id.fl_play_recorder);
        if (frameLayout != null) {
            i11 = R.id.fl_recorder;
            FrameLayout frameLayout2 = (FrameLayout) fr.j3.q(viewInflate, R.id.fl_recorder);
            if (frameLayout2 != null) {
                i11 = R.id.flex_container;
                FlexboxLayout flexboxLayout = (FlexboxLayout) fr.j3.q(viewInflate, R.id.flex_container);
                if (flexboxLayout != null) {
                    i11 = R.id.frame_next;
                    FrameLayout frameLayout3 = (FrameLayout) fr.j3.q(viewInflate, R.id.frame_next);
                    if (frameLayout3 != null) {
                        i11 = R.id.frame_pre;
                        FrameLayout frameLayout4 = (FrameLayout) fr.j3.q(viewInflate, R.id.frame_pre);
                        if (frameLayout4 != null) {
                            i11 = R.id.include_deer_audio;
                            View viewQ = fr.j3.q(viewInflate, R.id.include_deer_audio);
                            if (viewQ != null) {
                                b6 b6VarA = b6.a(viewQ);
                                i11 = R.id.iv_play_recorder;
                                ImageView imageView = (ImageView) fr.j3.q(viewInflate, R.id.iv_play_recorder);
                                if (imageView != null) {
                                    i11 = R.id.iv_recorder;
                                    if (((ImageView) fr.j3.q(viewInflate, R.id.iv_recorder)) != null) {
                                        i11 = R.id.ll_control;
                                        if (((LinearLayout) fr.j3.q(viewInflate, R.id.ll_control)) != null) {
                                            i11 = R.id.ll_parent;
                                            if (((LinearLayout) fr.j3.q(viewInflate, R.id.ll_parent)) != null) {
                                                i11 = R.id.play_recorder_circle;
                                                View viewQ2 = fr.j3.q(viewInflate, R.id.play_recorder_circle);
                                                if (viewQ2 != null) {
                                                    LinearLayout linearLayout = (LinearLayout) viewInflate;
                                                    i11 = R.id.sps_btn;
                                                    SlowPlaySwitchBtn slowPlaySwitchBtn = (SlowPlaySwitchBtn) fr.j3.q(viewInflate, R.id.sps_btn);
                                                    if (slowPlaySwitchBtn != null) {
                                                        i11 = R.id.tv_press_prompt;
                                                        TextView textView = (TextView) fr.j3.q(viewInflate, R.id.tv_press_prompt);
                                                        if (textView != null) {
                                                            i11 = R.id.tv_trans;
                                                            TextView textView2 = (TextView) fr.j3.q(viewInflate, R.id.tv_trans);
                                                            if (textView2 != null) {
                                                                i11 = R.id.wave_view;
                                                                WaveView waveView = (WaveView) fr.j3.q(viewInflate, R.id.wave_view);
                                                                if (waveView != null) {
                                                                    return new hj.z1(linearLayout, frameLayout, frameLayout2, flexboxLayout, frameLayout3, frameLayout4, b6VarA, imageView, viewQ2, linearLayout, slowPlaySwitchBtn, textView, textView2, waveView);
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
