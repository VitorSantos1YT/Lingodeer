package gj;

import ay.g0;
import com.lingo.lingoskill.base.refill.k;
import com.lingo.lingoskill.chineseskill.ui.speak.object.CNPodQuesWord;
import com.lingo.lingoskill.chineseskill.ui.speak.object.CNPodSentence;
import com.lingo.lingoskill.chineseskill.ui.speak.object.CNPodWord;
import oo.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends m<CNPodWord, CNPodQuesWord, CNPodSentence> {
    @Override // oo.m
    public final g0 y() {
        k kVar;
        String str;
        String str2;
        if (r().keyLanguage == 0) {
            kVar = new k("http://192.168.31.31:1515/AdminZG/", 0);
            str = r().csDataDir;
            str2 = "PodLesson";
        } else {
            kVar = new k("http://192.168.31.31:3535/AdminZG/", 0);
            str = r().cnupDataDir;
            str2 = "CNUPPodLesson";
        }
        return ep.a.a(str, str2, kVar);
    }

    @Override // oo.m
    public final void z() {
        new bm.c(this, 2);
    }
}
