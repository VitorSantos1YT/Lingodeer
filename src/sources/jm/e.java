package jm;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import av.j0;
import com.lingo.lingoskill.japanskill.ui.speak.object.JPPodQuesWord;
import com.lingo.lingoskill.japanskill.ui.speak.object.JPPodSentence;
import com.lingo.lingoskill.japanskill.ui.speak.object.JPPodWord;
import com.lingo.lingoskill.speak.adapter.SpeakTryAdapter;
import com.lingo.lingoskill.speak.object.PodSentence;
import com.lingodeer.R;
import fv.b;
import java.util.List;
import kotlin.jvm.internal.m;
import oo.k0;
import qy.q;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class e extends k0<JPPodWord, JPPodQuesWord, JPPodSentence> {
    @Override // oo.k0
    public final String A(PodSentence podSentence, int i11) {
        JPPodSentence sentence = (JPPodSentence) podSentence;
        m.f(sentence, "sentence");
        q qVar = fv.b.f28186a;
        return fv.b.L(i11, (int) sentence.getSid());
    }

    @Override // oo.k0
    public final SpeakTryAdapter B(final List sentences, final th.e player, final j0 recorder, final int i11) {
        m.f(sentences, "sentences");
        m.f(player, "player");
        m.f(recorder, "recorder");
        return new SpeakTryAdapter<JPPodWord, JPPodQuesWord, JPPodSentence>(sentences, player, recorder, this, i11) { // from class: com.lingo.lingoskill.japanskill.ui.speak.ui.JPSpeakTryFragment$initAdapter$1
            public final /* synthetic */ int m;

            {
                this.m = i11;
            }

            @Override // com.lingo.lingoskill.speak.adapter.SpeakTryAdapter
            public final String e(PodSentence podSentence) {
                JPPodSentence jPPodSentence = (JPPodSentence) podSentence;
                q qVar = b.f28186a;
                m.c(jPPodSentence);
                return b.L(this.m, (int) jPPodSentence.getSid());
            }
        };
    }

    @Override // oo.k0
    public final void E() {
        if (this.X == null) {
            this.X = LayoutInflater.from(this.f36398d).inflate(R.layout.layout_js_lesson_test_setting_dialog_2, (ViewGroup) null, false);
        }
        View view = this.X;
        m.c(view);
        RadioGroup radioGroup = (RadioGroup) view.findViewById(R.id.rg_chinese_display);
        radioGroup.setOnCheckedChangeListener(new cn.a(this, 8));
        View childAt = radioGroup.getChildAt(r().jsDisPlay);
        m.d(childAt, "null cannot be cast to non-null type android.widget.RadioButton");
        ((RadioButton) childAt).setChecked(true);
    }

    @Override // oo.k0
    public final List z(int i11) {
        return hz.b.D(i11);
    }
}
