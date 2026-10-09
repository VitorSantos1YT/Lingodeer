package jm;

import ay.g0;
import com.lingo.lingoskill.base.refill.k;
import com.lingo.lingoskill.japanskill.ui.speak.object.JPPodQuesWord;
import com.lingo.lingoskill.japanskill.ui.speak.object.JPPodSentence;
import com.lingo.lingoskill.japanskill.ui.speak.object.JPPodWord;
import oo.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends m<JPPodWord, JPPodQuesWord, JPPodSentence> {
    @Override // oo.m
    public final g0 y() {
        k kVar;
        String str;
        String str2;
        if (r().keyLanguage == 1) {
            kVar = new k("http://192.168.31.31:1818/AdminZG/", 0);
            str = r().jsDataDir;
            str2 = "JPPodLesson";
        } else {
            kVar = new k("http://192.168.31.31:3838/AdminZG/", 0);
            str = r().jpupDataDir;
            str2 = "JPUPPodLesson";
        }
        return ep.a.a(str, str2, kVar);
    }

    @Override // oo.m
    public final void z() {
        new bm.c(this, 5);
    }
}
