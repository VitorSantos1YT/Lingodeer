package fi;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.lingo.lingoskill.chineseskill.ui.pinyin.widget.WaveView;
import com.lingodeer.R;
import fr.j3;
import hj.b6;
import hj.h1;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f extends kotlin.jvm.internal.j implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f27304a = new f(3, h1.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/lingo/lingoskill/databinding/ArSyllableTestModel01Binding;", 0);

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater p4 = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        m.f(p4, "p0");
        View viewInflate = p4.inflate(R.layout.ar_syllable_test_model_01, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i11 = R.id.frame_top;
        if (((FrameLayout) j3.q(viewInflate, R.id.frame_top)) != null) {
            i11 = R.id.include_deer_audio;
            View viewQ = j3.q(viewInflate, R.id.include_deer_audio);
            if (viewQ != null) {
                b6 b6VarA = b6.a(viewQ);
                i11 = R.id.tv_bottom_luoma;
                TextView textView = (TextView) j3.q(viewInflate, R.id.tv_bottom_luoma);
                if (textView != null) {
                    i11 = R.id.tv_bottom_pinyin;
                    TextView textView2 = (TextView) j3.q(viewInflate, R.id.tv_bottom_pinyin);
                    if (textView2 != null) {
                        i11 = R.id.tv_btm_char;
                        TextView textView3 = (TextView) j3.q(viewInflate, R.id.tv_btm_char);
                        if (textView3 != null) {
                            i11 = R.id.tv_btm_luoma;
                            TextView textView4 = (TextView) j3.q(viewInflate, R.id.tv_btm_luoma);
                            if (textView4 != null) {
                                i11 = R.id.wave_view;
                                WaveView waveView = (WaveView) j3.q(viewInflate, R.id.wave_view);
                                if (waveView != null) {
                                    return new h1((LinearLayout) viewInflate, b6VarA, textView, textView2, textView3, textView4, waveView);
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
