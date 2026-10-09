package cn;

import ay.g0;
import com.lingo.lingoskill.base.refill.k;
import com.lingo.lingoskill.koreanskill.ui.speak.object.KOPodQuesWord;
import com.lingo.lingoskill.koreanskill.ui.speak.object.KOPodSentence;
import com.lingo.lingoskill.koreanskill.ui.speak.object.KOPodWord;
import oo.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends m<KOPodWord, KOPodQuesWord, KOPodSentence> {
    @Override // oo.m
    public final g0 y() {
        k kVar;
        String str;
        String str2;
        if (r().keyLanguage == 2) {
            kVar = new k("http://192.168.31.31:1717/AdminZG/", 0);
            str = r().koDataDir;
            str2 = "KOPodLesson";
        } else {
            kVar = new k("http://192.168.31.31:3737/AdminZG/", 0);
            str = r().krupDataDir;
            str2 = "KRUPPodLesson";
        }
        return ep.a.a(str, str2, kVar);
    }

    @Override // oo.m
    public final void z() {
        new bm.c(this, 1);
    }
}
