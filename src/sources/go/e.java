package go;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import av.j0;
import com.lingo.lingoskill.ruskill.ui.speak.object.RUPodQuesWord;
import com.lingo.lingoskill.ruskill.ui.speak.object.RUPodSentence;
import com.lingo.lingoskill.ruskill.ui.speak.object.RUPodWord;
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
public final class e extends k0<RUPodWord, RUPodQuesWord, RUPodSentence> {
    @Override // oo.k0
    public final String A(PodSentence podSentence, int i11) {
        RUPodSentence sentence = (RUPodSentence) podSentence;
        m.f(sentence, "sentence");
        q qVar = fv.b.f28186a;
        return fv.b.L(i11, (int) sentence.getSid());
    }

    @Override // oo.k0
    public final SpeakTryAdapter B(final List sentences, final th.e player, final j0 recorder, final int i11) {
        m.f(sentences, "sentences");
        m.f(player, "player");
        m.f(recorder, "recorder");
        return new SpeakTryAdapter<RUPodWord, RUPodQuesWord, RUPodSentence>(sentences, player, recorder, this, i11) { // from class: com.lingo.lingoskill.ruskill.ui.speak.ui.RUSpeakTryFragment$initAdapter$1
            public final /* synthetic */ int m;

            {
                this.m = i11;
            }

            @Override // com.lingo.lingoskill.speak.adapter.SpeakTryAdapter
            public final String e(PodSentence podSentence) {
                RUPodSentence rUPodSentence = (RUPodSentence) podSentence;
                q qVar = b.f28186a;
                m.c(rUPodSentence);
                return b.L(this.m, (int) rUPodSentence.getSid());
            }
        };
    }

    @Override // oo.k0
    public final void E() {
        if (this.X == null) {
            this.X = LayoutInflater.from(this.f36398d).inflate(R.layout.layout_en_speak_setting_dialog, (ViewGroup) null, false);
        }
    }

    @Override // oo.k0
    public final List z(int i11) {
        return hz.b.H(i11);
    }
}
