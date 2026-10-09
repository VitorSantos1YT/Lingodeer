package wk;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.lingo.lingoskill.franchskill.ui.speak.object.FRPodQuesWord;
import com.lingo.lingoskill.franchskill.ui.speak.object.FRPodSentence;
import com.lingo.lingoskill.franchskill.ui.speak.object.FRPodWord;
import com.lingodeer.R;
import java.util.List;
import oo.d0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class d extends d0<FRPodWord, FRPodQuesWord, FRPodSentence> {
    @Override // oo.d0
    public final void A() {
        if (this.V == null) {
            this.V = LayoutInflater.from(this.f36398d).inflate(R.layout.layout_en_speak_setting_dialog, (ViewGroup) null, false);
        }
    }

    @Override // oo.d0
    public final List x(int i11) {
        return hz.b.B(i11);
    }
}
