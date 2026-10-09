package wk;

import ay.g0;
import com.lingo.lingoskill.base.refill.k;
import com.lingo.lingoskill.franchskill.ui.speak.object.FRPodQuesWord;
import com.lingo.lingoskill.franchskill.ui.speak.object.FRPodSentence;
import com.lingo.lingoskill.franchskill.ui.speak.object.FRPodWord;
import oo.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends m<FRPodWord, FRPodQuesWord, FRPodSentence> {
    @Override // oo.m
    public final g0 y() {
        return ep.a.a(r().frDataDir, "FRPodLesson", new k("http://192.168.31.31:2323/AdminZG/", 0));
    }

    @Override // oo.m
    public final void z() {
        new bm.c(this, 7);
    }
}
