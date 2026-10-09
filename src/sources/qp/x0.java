package qp;

import android.widget.TextView;
import com.lingo.lingoskill.object.LDCharacter;
import com.lingo.lingoskill.object.Model_Word_010;
import com.lingo.lingoskill.object.Word;
import com.lingo.lingoskill.unity.exception.NoSuchElemException;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class x0 extends x3 {
    @Override // qp.x3, qp.a, hi.a
    public final String c() {
        return nv.p.m(this.f47882b, "2;", ";0");
    }

    @Override // qp.x3, hi.a
    public final List g() {
        ArrayList arrayList = new ArrayList();
        for (Word word : v().getOptionList()) {
            qy.q qVar = fv.b.f28186a;
            String zhuyin = word.getZhuyin();
            kotlin.jvm.internal.m.e(zhuyin, "getZhuyin(...)");
            String strE = fv.b.e(zhuyin);
            String zhuyin2 = word.getZhuyin();
            kotlin.jvm.internal.m.e(zhuyin2, "getZhuyin(...)");
            arrayList.add(new fv.a(1L, strE, fv.b.a(zhuyin2, null, null)));
        }
        return arrayList;
    }

    @Override // qp.x3, hi.a
    public final int i() {
        return 2;
    }

    @Override // qp.x3, hi.a
    public final void j() throws NoSuchElemException {
        LDCharacter lDCharacterLoadFullObject = LDCharacter.loadFullObject(this.f47882b);
        if (lDCharacterLoadFullObject == null) {
            throw new NoSuchElemException();
        }
        Model_Word_010 model_Word_010 = new Model_Word_010();
        List<LDCharacter> optionList = lDCharacterLoadFullObject.getOptionList();
        kotlin.jvm.internal.m.e(optionList, "getOptionList(...)");
        ArrayList arrayList = new ArrayList(ry.n.W(optionList, 10));
        for (LDCharacter lDCharacter : optionList) {
            Word word = new Word();
            word.setWordId(lDCharacter.getCharId());
            word.setWord(lDCharacter.getCharacter());
            word.setZhuyin(lDCharacter.getAudioName());
            word.setTranslations(lDCharacter.getPinyin());
            word.setLuoma(BuildConfig.VERSION_NAME);
            arrayList.add(word);
        }
        Word word2 = new Word();
        word2.setWordId(lDCharacterLoadFullObject.getCharId());
        word2.setWord(lDCharacterLoadFullObject.getCharacter());
        word2.setZhuyin(lDCharacterLoadFullObject.getAudioName());
        word2.setTranslations(lDCharacterLoadFullObject.getPinyin());
        word2.setLuoma(BuildConfig.VERSION_NAME);
        model_Word_010.setOptionList(arrayList);
        model_Word_010.setWord(word2);
        model_Word_010.WordId = word2.getWordId();
        this.f48258k = model_Word_010;
        if (v().getOptionList().size() == 0) {
            throw new NoSuchElemException();
        }
    }

    @Override // qp.x3
    public final String u(Word word) {
        qy.q qVar = fv.b.f28186a;
        String zhuyin = word.getZhuyin();
        kotlin.jvm.internal.m.e(zhuyin, "getZhuyin(...)");
        return fv.b.c(zhuyin, null, null);
    }

    @Override // qp.x3
    public final void x(TextView textView) {
        v10.c.G(textView);
        textView.setTextSize(62.0f);
        textView.postDelayed(new b2.c(4, textView, new w0(textView, 0)), 0L);
    }
}
