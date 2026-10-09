package wn;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.lifecycle.viewmodel.compose.NP.IMCc;
import av.j0;
import com.lingo.lingoskill.ptskill.ui.speak.object.PTPodQuesWord;
import com.lingo.lingoskill.ptskill.ui.speak.object.PTPodSentence;
import com.lingo.lingoskill.ptskill.ui.speak.object.PTPodWord;
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
public final class e extends k0<PTPodWord, PTPodQuesWord, PTPodSentence> {
    @Override // oo.k0
    public final String A(PodSentence podSentence, int i11) {
        PTPodSentence sentence = (PTPodSentence) podSentence;
        m.f(sentence, "sentence");
        q qVar = fv.b.f28186a;
        return fv.b.L(i11, (int) sentence.getSid());
    }

    @Override // oo.k0
    public final void E() {
        if (this.X == null) {
            this.X = LayoutInflater.from(this.f36398d).inflate(R.layout.layout_en_speak_setting_dialog, (ViewGroup) null, false);
        }
    }

    @Override // oo.k0
    public final List z(int i11) {
        return hz.b.F(i11);
    }

    @Override // oo.k0
    public final SpeakTryAdapter B(final List sentences, final th.e player, final j0 j0Var, final int i11) {
        m.f(sentences, "sentences");
        m.f(player, "player");
        m.f(j0Var, IMCc.Ejop);
        return new SpeakTryAdapter<PTPodWord, PTPodQuesWord, PTPodSentence>(sentences, player, j0Var, this, i11) { // from class: com.lingo.lingoskill.ptskill.ui.speak.ui.PTSpeakTryFragment$initAdapter$1
            public final /* synthetic */ int m;

            {
                this.m = i11;
            }

            @Override // com.lingo.lingoskill.speak.adapter.SpeakTryAdapter
            public final String e(PodSentence podSentence) {
                PTPodSentence pTPodSentence = (PTPodSentence) podSentence;
                q qVar = b.f28186a;
                m.c(pTPodSentence);
                return b.L(this.m, (int) pTPodSentence.getSid());
            }
        };
    }
}
