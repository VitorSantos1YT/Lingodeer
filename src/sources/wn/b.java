package wn;

import ay.g0;
import com.lingo.lingoskill.base.refill.k;
import com.lingo.lingoskill.ptskill.ui.speak.object.PTPodQuesWord;
import com.lingo.lingoskill.ptskill.ui.speak.object.PTPodSentence;
import com.lingo.lingoskill.ptskill.ui.speak.object.PTPodWord;
import oo.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends m<PTPodWord, PTPodQuesWord, PTPodSentence> {
    @Override // oo.m
    public final g0 y() {
        return ep.a.a(r().ptDataDir, "PTPodLesson", new k("http://192.168.31.31:1919/AdminZG/", 0));
    }

    @Override // oo.m
    public final void z() {
        new bm.c(this, 8);
    }
}
