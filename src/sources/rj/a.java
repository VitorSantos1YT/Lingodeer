package rj;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import ay.g0;
import com.lingo.lingoskill.base.refill.k;
import com.lingo.lingoskill.deskill.ui.speak.object.DEPodQuesWord;
import com.lingo.lingoskill.deskill.ui.speak.object.DEPodSentence;
import com.lingo.lingoskill.deskill.ui.speak.object.DEPodWord;
import com.lingodeer.R;
import oo.h;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends h<DEPodWord, DEPodQuesWord, DEPodSentence> {
    @Override // oo.h
    public final g0 x() {
        return ep.a.a(r().deDataDir, "DEPodLesson", new k("http://192.168.31.31:1212/AdminZG/", 0));
    }

    @Override // oo.h
    public final void y() {
        new bm.a(this, 6);
    }

    @Override // oo.h
    public final void z() {
        if (this.P == null) {
            this.P = LayoutInflater.from(this.f36398d).inflate(R.layout.layout_en_speak_setting_dialog, (ViewGroup) null, false);
        }
    }
}
