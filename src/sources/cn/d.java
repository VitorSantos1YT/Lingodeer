package cn;

import com.lingo.lingoskill.koreanskill.ui.speak.object.KOPodQuesWord;
import com.lingo.lingoskill.koreanskill.ui.speak.object.KOPodSentence;
import com.lingo.lingoskill.koreanskill.ui.speak.object.KOPodWord;
import com.lingo.lingoskill.speak.object.PodSentence;
import java.util.List;
import kotlin.jvm.internal.m;
import oo.t;
import qy.q;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class d extends t<KOPodWord, KOPodQuesWord, KOPodSentence> {
    @Override // oo.t
    public final String A() {
        q qVar = fv.b.f28186a;
        return fv.b.M(this.Q);
    }

    @Override // oo.t
    public final String B() {
        q qVar = fv.b.f28186a;
        int i11 = this.Q;
        String uid = r().uid;
        m.e(uid, "uid");
        return fv.b.N(i11, uid);
    }

    @Override // oo.t
    public final List y(int i11) {
        return hz.b.E(i11);
    }

    @Override // oo.t
    public final String z(PodSentence podSentence, int i11) {
        KOPodSentence sentence = (KOPodSentence) podSentence;
        m.f(sentence, "sentence");
        q qVar = fv.b.f28186a;
        return fv.b.L(i11, (int) sentence.getSid());
    }
}
