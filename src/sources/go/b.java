package go;

import ay.g0;
import com.lingo.lingoskill.base.refill.k;
import com.lingo.lingoskill.ruskill.ui.speak.object.RUPodQuesWord;
import com.lingo.lingoskill.ruskill.ui.speak.object.RUPodSentence;
import com.lingo.lingoskill.ruskill.ui.speak.object.RUPodWord;
import oo.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends m<RUPodWord, RUPodQuesWord, RUPodSentence> {
    @Override // oo.m
    public final g0 y() {
        return ep.a.a(r().ruDataDir, "RUPodLesson", new k("http://192.168.31.31:2424/AdminZG/", 0));
    }

    @Override // oo.m
    public final void z() {
        new bm.c(this, 3);
    }
}
