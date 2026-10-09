package jk;

import ay.g0;
import com.lingo.lingoskill.base.refill.k;
import com.lingo.lingoskill.espanskill.ui.speak.object.ESPodQuesWord;
import com.lingo.lingoskill.espanskill.ui.speak.object.ESPodSentence;
import com.lingo.lingoskill.espanskill.ui.speak.object.ESPodWord;
import oo.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends m<ESPodWord, ESPodQuesWord, ESPodSentence> {
    @Override // oo.m
    public final g0 y() {
        return ep.a.a(r().esDataDir, "ESPodLesson", new k("http://192.168.31.31:2121/AdminZG/", 0));
    }

    @Override // oo.m
    public final void z() {
        new bm.c(this, 4);
    }
}
