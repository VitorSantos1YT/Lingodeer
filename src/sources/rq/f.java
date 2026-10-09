package rq;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.lingo.lingoskill.chineseskill.ui.pinyin.widget.WaveView;
import com.lingodeer.R;
import fr.j3;
import hj.d3;
import hj.w1;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f extends j implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f49374a = new f(3, w1.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/lingo/lingoskill/databinding/CnPinyinTestModel01NewBinding;", 0);

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater p4 = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        m.f(p4, "p0");
        View viewInflate = p4.inflate(R.layout.cn_pinyin_test_model_01_new, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i11 = R.id.fl_play_recorder;
        FrameLayout frameLayout = (FrameLayout) j3.q(viewInflate, R.id.fl_play_recorder);
        if (frameLayout != null) {
            i11 = R.id.fl_recorder;
            FrameLayout frameLayout2 = (FrameLayout) j3.q(viewInflate, R.id.fl_recorder);
            if (frameLayout2 != null) {
                i11 = R.id.include_iv_audio;
                View viewQ = j3.q(viewInflate, R.id.include_iv_audio);
                if (viewQ != null) {
                    ImageView imageView = (ImageView) viewQ;
                    d3 d3Var = new d3(imageView, 3, imageView);
                    i11 = R.id.item_char_1;
                    ConstraintLayout constraintLayout = (ConstraintLayout) j3.q(viewInflate, R.id.item_char_1);
                    if (constraintLayout != null) {
                        i11 = R.id.item_char_2;
                        ConstraintLayout constraintLayout2 = (ConstraintLayout) j3.q(viewInflate, R.id.item_char_2);
                        if (constraintLayout2 != null) {
                            i11 = R.id.iv_play_recorder;
                            ImageView imageView2 = (ImageView) j3.q(viewInflate, R.id.iv_play_recorder);
                            if (imageView2 != null) {
                                i11 = R.id.iv_recorder;
                                if (((ImageView) j3.q(viewInflate, R.id.iv_recorder)) != null) {
                                    i11 = R.id.play_recorder_circle;
                                    View viewQ2 = j3.q(viewInflate, R.id.play_recorder_circle);
                                    if (viewQ2 != null) {
                                        i11 = R.id.tv_char_1;
                                        TextView textView = (TextView) j3.q(viewInflate, R.id.tv_char_1);
                                        if (textView != null) {
                                            i11 = R.id.tv_char_2;
                                            TextView textView2 = (TextView) j3.q(viewInflate, R.id.tv_char_2);
                                            if (textView2 != null) {
                                                i11 = R.id.view_line_1;
                                                View viewQ3 = j3.q(viewInflate, R.id.view_line_1);
                                                if (viewQ3 != null) {
                                                    i11 = R.id.view_line_2;
                                                    View viewQ4 = j3.q(viewInflate, R.id.view_line_2);
                                                    if (viewQ4 != null) {
                                                        i11 = R.id.wave_view;
                                                        WaveView waveView = (WaveView) j3.q(viewInflate, R.id.wave_view);
                                                        if (waveView != null) {
                                                            return new w1((ConstraintLayout) viewInflate, frameLayout, frameLayout2, d3Var, constraintLayout, constraintLayout2, imageView2, viewQ2, textView, textView2, viewQ3, viewQ4, waveView);
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
