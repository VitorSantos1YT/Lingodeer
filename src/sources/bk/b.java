package bk;

import androidx.lifecycle.j;
import com.bumptech.glide.d;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.object.Word;
import com.tbruyelle.rxpermissions3.BuildConfig;
import fz.f;
import hj.d2;
import java.util.Iterator;
import java.util.Locale;
import java.util.regex.Pattern;
import kotlin.jvm.internal.m;
import nv.p;
import oz.x;
import qp.d3;
import qy.q;
import w4.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends d3 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final q f4457n;

    public b(mp.b bVar, long j11) {
        super(bVar, j11);
        this.f4457n = d.v(new j(8));
    }

    @Override // hi.a
    public final boolean a() {
        Iterator<Word> it;
        b bVar = this;
        ta.a aVar = bVar.f47886f;
        m.c(aVar);
        dk.a aVar2 = (dk.a) bVar.f4457n.getValue();
        ta.a aVar3 = bVar.f47886f;
        m.c(aVar3);
        String strQ0 = x.q0(oz.q.i1(((d2) aVar3).f32482c.getText().toString()).toString(), "’", "'");
        Locale locale = Locale.getDefault();
        m.e(locale, "getDefault(...)");
        String lowerCase = strQ0.toLowerCase(locale);
        m.e(lowerCase, "toLowerCase(...)");
        String strQ1 = x.q0(p.s("[\\p{P}+~$`^=|<>～｀＄＾＋＝｜＜＞￥×]", "compile(...)", aVar2.a(lowerCase), BuildConfig.VERSION_NAME, "replaceAll(...)"), " ", BuildConfig.VERSION_NAME);
        Iterator<Word> it2 = bVar.r().getSentWords().iterator();
        while (it2.hasNext()) {
            Word next = it2.next();
            if (next.getWordType() != 1) {
                String word = next.getWord();
                int iB = c.b(1, word, "getWord(...)");
                int i11 = 0;
                boolean z11 = false;
                while (true) {
                    it = it2;
                    if (i11 > iB) {
                        break;
                    }
                    boolean z12 = m.h(word.charAt(!z11 ? i11 : iB), 32) <= 0;
                    if (z11) {
                        if (!z12) {
                            break;
                        }
                        iB--;
                    } else if (z12) {
                        i11++;
                    } else {
                        z11 = true;
                    }
                    it2 = it;
                }
                String strG = c.g(word, iB, 1, i11);
                Locale locale2 = Locale.getDefault();
                m.e(locale2, "getDefault(...)");
                String lowerCase2 = strG.toLowerCase(locale2);
                m.e(lowerCase2, "toLowerCase(...)");
                String strS = p.s("[\\p{P}+~$`^=|<>～｀＄＾＋＝｜＜＞￥×]", "compile(...)", x.q0(aVar2.a(x.q0(lowerCase2, "’", "'")), " ", BuildConfig.VERSION_NAME), BuildConfig.VERSION_NAME, "replaceAll(...)");
                if (!x.s0(strQ1, strS, false)) {
                    t(false);
                    LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                    String checkAnswerPrompt = this.f47884d.checkAnswerPrompt;
                    m.e(checkAnswerPrompt, "checkAnswerPrompt");
                    String strQ2 = x.q0(checkAnswerPrompt, "userSentence%", strQ1);
                    String translations = r().getTranslations();
                    m.e(translations, "getTranslations(...)");
                    String strQ3 = x.q0(strQ2, "translation%", translations);
                    String sentence = r().getSentence();
                    m.e(sentence, "getSentence(...)");
                    x.q0(strQ3, "correctSentence%", sentence);
                    return false;
                }
                Pattern patternCompile = Pattern.compile(strS);
                m.e(patternCompile, "compile(...)");
                strQ1 = patternCompile.matcher(strQ1).replaceFirst(BuildConfig.VERSION_NAME);
                m.e(strQ1, "replaceFirst(...)");
                bVar = this;
                it2 = it;
            }
        }
        b bVar2 = bVar;
        boolean z13 = strQ1.length() == 0;
        bVar2.t(z13);
        return z13;
    }

    @Override // qp.d3, qp.d
    public final f n() {
        return a.f4456a;
    }
}
