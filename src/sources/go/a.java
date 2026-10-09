package go;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import ay.g0;
import com.lingo.lingoskill.base.refill.k;
import com.lingo.lingoskill.ruskill.ui.speak.object.RUPodQuesWord;
import com.lingo.lingoskill.ruskill.ui.speak.object.RUPodSentence;
import com.lingo.lingoskill.ruskill.ui.speak.object.RUPodWord;
import com.lingodeer.R;
import oo.h;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends h<RUPodWord, RUPodQuesWord, RUPodSentence> {
    @Override // oo.h
    public final g0 x() {
        return ep.a.a(r().ruDataDir, "RUPodLesson", new k("http://192.168.31.31:2424/AdminZG/", 0));
    }

    @Override // oo.h
    public final void y() {
        new bm.a(this, 3);
    }

    @Override // oo.h
    public final void z() {
        if (this.P == null) {
            this.P = LayoutInflater.from(this.f36398d).inflate(R.layout.layout_en_speak_setting_dialog, (ViewGroup) null, false);
        }
    }
}
