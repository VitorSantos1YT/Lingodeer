package qp;

import android.content.Context;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.lingo.lingoskill.object.LDCharacter;
import com.lingo.lingoskill.object.Model_Word_010;
import com.lingo.lingoskill.object.Sentence;
import com.lingo.lingoskill.object.Word;
import com.lingo.lingoskill.unity.exception.NoSuchElemException;
import com.lingodeer.R;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class b1 extends z2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f47842r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b1(mp.b bVar, long j11, int i11) {
        super(bVar, j11);
        this.f47842r = i11;
    }

    @Override // qp.z2, hi.a
    public final String b() {
        int i11 = this.f47842r;
        long j11 = this.f47882b;
        switch (i11) {
            case 0:
                qy.q qVar = fv.b.f28186a;
                String strGenZhuyin = u().genZhuyin();
                kotlin.jvm.internal.m.e(strGenZhuyin, "genZhuyin(...)");
                return fv.b.c(strGenZhuyin, null, null);
            case 1:
                qy.q qVar2 = fv.b.f28186a;
                return fv.b.Y(j11, null, null);
            default:
                qy.q qVar3 = fv.b.f28186a;
                return fv.b.Y(j11, null, null);
        }
    }

    @Override // qp.z2, hi.a
    public final String c() {
        switch (this.f47842r) {
            case 0:
                return nv.p.m(this.f47882b, "2;", ";3");
            case 1:
                return nv.p.m(this.f47882b, "0;", ";5");
            default:
                return nv.p.m(this.f47882b, "0;", ";10");
        }
    }

    @Override // qp.z2, hi.a
    public final List g() {
        int i11 = this.f47842r;
        long j11 = this.f47882b;
        switch (i11) {
            case 0:
                ArrayList arrayList = new ArrayList();
                qy.q qVar = fv.b.f28186a;
                String strGenZhuyin = u().genZhuyin();
                kotlin.jvm.internal.m.e(strGenZhuyin, "genZhuyin(...)");
                String strE = fv.b.e(strGenZhuyin);
                String strGenZhuyin2 = u().genZhuyin();
                kotlin.jvm.internal.m.e(strGenZhuyin2, "genZhuyin(...)");
                arrayList.add(new fv.a(1L, strE, fv.b.a(strGenZhuyin2, null, null)));
                return arrayList;
            case 1:
                ArrayList arrayList2 = new ArrayList();
                qy.q qVar2 = fv.b.f28186a;
                arrayList2.add(new fv.a(2L, fv.b.Z(j11), fv.b.V(j11)));
                return arrayList2;
            default:
                ArrayList arrayList3 = new ArrayList();
                qy.q qVar3 = fv.b.f28186a;
                arrayList3.add(new fv.a(2L, fv.b.Z(j11), fv.b.V(j11)));
                return arrayList3;
        }
    }

    @Override // qp.z2, hi.a
    public final int i() {
        switch (this.f47842r) {
            case 0:
                return 2;
            case 1:
                return 0;
            default:
                return 0;
        }
    }

    @Override // qp.z2, hi.a
    public final void j() throws NoSuchElemException {
        switch (this.f47842r) {
            case 0:
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
                Word word3 = model_Word_010.getWord();
                Sentence sentence = new Sentence();
                sentence.setSentence(word3.getWord());
                sentence.setTranslations(word3.getTranslations());
                sentence.setSentWords(ns.o.K(word3));
                this.f48286i = sentence;
                this.f48291o.addAll(qi.b.h(word3));
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(qi.b.h(word3));
                Collections.shuffle(arrayList2);
                this.f48290n.addAll(arrayList2);
                return;
            case 1:
                Model_Word_010 model_Word_010LoadFullObject = Model_Word_010.loadFullObject(this.f47882b);
                if (model_Word_010LoadFullObject == null) {
                    throw new IllegalArgumentException();
                }
                Word word4 = model_Word_010LoadFullObject.getWord();
                Sentence sentence2 = new Sentence();
                sentence2.setSentence(word4.getWord());
                sentence2.setTranslations(word4.getTranslations());
                sentence2.setSentWords(ns.o.K(word4));
                this.f48286i = sentence2;
                ArrayList arrayList3 = new ArrayList();
                String word5 = word4.getWord();
                kotlin.jvm.internal.m.e(word5, "getWord(...)");
                List listW0 = oz.q.W0(word5, new String[]{" "}, 0, 6);
                int i11 = 0;
                for (Object obj : listW0) {
                    int i12 = i11 + 1;
                    if (i11 < 0) {
                        ns.o.V();
                        throw null;
                    }
                    String str = (String) obj;
                    ArrayList arrayList4 = new ArrayList();
                    int length = str.length();
                    for (int i13 = 0; i13 < length; i13++) {
                        String.valueOf(str.charAt(i13));
                        String strValueOf = String.valueOf(str.charAt(i13));
                        Word word6 = new Word();
                        word6.setWord(strValueOf);
                        arrayList4.add(word6);
                    }
                    ArrayList arrayList5 = this.f48291o;
                    arrayList5.addAll(arrayList4);
                    arrayList3.addAll(ns.o.S(arrayList4));
                    if (i11 != listW0.size() - 1) {
                        Word word7 = new Word();
                        word7.setWord(" ");
                        arrayList5.add(word7);
                        arrayList3.add(word7);
                    }
                    i11 = i12;
                }
                this.f48290n.addAll(arrayList3);
                return;
            default:
                Model_Word_010 model_Word_010LoadFullObject2 = Model_Word_010.loadFullObject(this.f47882b);
                if (model_Word_010LoadFullObject2 == null) {
                    throw new IllegalArgumentException();
                }
                Word word8 = model_Word_010LoadFullObject2.getWord();
                Sentence sentence3 = new Sentence();
                sentence3.setSentence(word8.getWord());
                sentence3.setTranslations(word8.getTranslations());
                sentence3.setSentWords(ns.o.K(word8));
                this.f48286i = sentence3;
                ArrayList arrayList6 = new ArrayList();
                String word9 = word8.getWord();
                kotlin.jvm.internal.m.e(word9, "getWord(...)");
                List listW1 = oz.q.W0(word9, new String[]{" "}, 0, 6);
                int i14 = 0;
                for (Object obj2 : listW1) {
                    int i15 = i14 + 1;
                    if (i14 < 0) {
                        ns.o.V();
                        throw null;
                    }
                    String str2 = (String) obj2;
                    ArrayList arrayList7 = new ArrayList();
                    int length2 = str2.length();
                    for (int i16 = 0; i16 < length2; i16++) {
                        String.valueOf(str2.charAt(i16));
                        String strValueOf2 = String.valueOf(str2.charAt(i16));
                        Word word10 = new Word();
                        word10.setWord(strValueOf2);
                        arrayList7.add(word10);
                    }
                    ArrayList arrayList8 = this.f48291o;
                    arrayList8.addAll(arrayList7);
                    arrayList6.addAll(ns.o.S(arrayList7));
                    if (i14 != listW1.size() - 1) {
                        Word word11 = new Word();
                        word11.setWord(" ");
                        arrayList8.add(word11);
                        arrayList6.add(word11);
                    }
                    i14 = i15;
                }
                this.f48290n.addAll(arrayList6);
                return;
        }
    }

    @Override // qp.z2, qp.d
    public final void p() {
        switch (this.f47842r) {
            case 0:
                super.p();
                ta.a aVar = this.f47886f;
                kotlin.jvm.internal.m.c(aVar);
                ((FrameLayout) ((hj.c2) aVar).f32448f.f32407c).setVisibility(0);
                ta.a aVar2 = this.f47886f;
                kotlin.jvm.internal.m.c(aVar2);
                ((hj.c2) aVar2).m.setVisibility(8);
                ta.a aVar3 = this.f47886f;
                kotlin.jvm.internal.m.c(aVar3);
                ((hj.c2) aVar3).f32449g.setVisibility(8);
                ta.a aVar4 = this.f47886f;
                kotlin.jvm.internal.m.c(aVar4);
                ((hj.c2) aVar4).f32446d.setHint(this.f47883c.getString(R.string.please_type_the_word));
                ta.a aVar5 = this.f47886f;
                kotlin.jvm.internal.m.c(aVar5);
                EditText editText = ((hj.c2) aVar5).f32446d;
                final int i11 = 0;
                editText.postDelayed(new b2.c(4, editText, new fz.a(this) { // from class: qp.a1

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ b1 f47821b;

                    {
                        this.f47821b = this;
                    }

                    @Override // fz.a
                    public final Object invoke() {
                        switch (i11) {
                            case 0:
                                b1 b1Var = this.f47821b;
                                Context context = b1Var.f47883c;
                                ta.a aVar6 = b1Var.f47886f;
                                kotlin.jvm.internal.m.c(aVar6);
                                ff.h.L(context, ((hj.c2) aVar6).f32446d, 24);
                                break;
                            default:
                                ta.a aVar7 = this.f47821b.f47886f;
                                kotlin.jvm.internal.m.c(aVar7);
                                ((ImageView) ((hj.c2) aVar7).f32448f.f32408d).performClick();
                                break;
                        }
                        return qy.b0.f48488a;
                    }
                }), 0L);
                ta.a aVar6 = this.f47886f;
                kotlin.jvm.internal.m.c(aVar6);
                ImageView imageView = (ImageView) ((hj.c2) aVar6).f32448f.f32408d;
                final int i12 = 1;
                imageView.postDelayed(new b2.c(4, imageView, new fz.a(this) { // from class: qp.a1

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ b1 f47821b;

                    {
                        this.f47821b = this;
                    }

                    @Override // fz.a
                    public final Object invoke() {
                        switch (i12) {
                            case 0:
                                b1 b1Var = this.f47821b;
                                Context context = b1Var.f47883c;
                                ta.a aVar7 = b1Var.f47886f;
                                kotlin.jvm.internal.m.c(aVar7);
                                ff.h.L(context, ((hj.c2) aVar7).f32446d, 24);
                                break;
                            default:
                                ta.a aVar8 = this.f47821b.f47886f;
                                kotlin.jvm.internal.m.c(aVar8);
                                ((ImageView) ((hj.c2) aVar8).f32448f.f32408d).performClick();
                                break;
                        }
                        return qy.b0.f48488a;
                    }
                }), 0L);
                break;
            case 1:
                super.p();
                ta.a aVar7 = this.f47886f;
                kotlin.jvm.internal.m.c(aVar7);
                ((FrameLayout) ((hj.c2) aVar7).f32448f.f32407c).setVisibility(0);
                ta.a aVar8 = this.f47886f;
                kotlin.jvm.internal.m.c(aVar8);
                ((hj.c2) aVar8).m.setVisibility(8);
                ta.a aVar9 = this.f47886f;
                kotlin.jvm.internal.m.c(aVar9);
                ((hj.c2) aVar9).f32449g.setVisibility(8);
                ta.a aVar10 = this.f47886f;
                kotlin.jvm.internal.m.c(aVar10);
                ((hj.c2) aVar10).f32446d.setHint(this.f47883c.getString(R.string.please_type_the_word));
                ta.a aVar11 = this.f47886f;
                kotlin.jvm.internal.m.c(aVar11);
                ((ImageView) ((hj.c2) aVar11).f32448f.f32408d).performClick();
                break;
            default:
                super.p();
                ta.a aVar12 = this.f47886f;
                kotlin.jvm.internal.m.c(aVar12);
                ((hj.c2) aVar12).f32446d.setHint(this.f47883c.getString(R.string.please_type_the_word));
                break;
        }
    }

    @Override // qp.z2
    public float v() {
        switch (this.f47842r) {
            case 0:
                return ff.h.x(this.f47883c, 22);
            default:
                return super.v();
        }
    }

    @Override // qp.z2
    public final void y() {
        switch (this.f47842r) {
            case 0:
                ta.a aVar = this.f47886f;
                kotlin.jvm.internal.m.c(aVar);
                ((hj.c2) aVar).f32450h.setVisibility(8);
                ta.a aVar2 = this.f47886f;
                kotlin.jvm.internal.m.c(aVar2);
                ((hj.c2) aVar2).f32444b.setVisibility(8);
                break;
            case 1:
                ta.a aVar3 = this.f47886f;
                kotlin.jvm.internal.m.c(aVar3);
                ((hj.c2) aVar3).f32450h.setVisibility(8);
                ta.a aVar4 = this.f47886f;
                kotlin.jvm.internal.m.c(aVar4);
                ((hj.c2) aVar4).f32444b.setVisibility(8);
                break;
            default:
                ta.a aVar5 = this.f47886f;
                kotlin.jvm.internal.m.c(aVar5);
                ((hj.c2) aVar5).f32450h.setVisibility(8);
                ta.a aVar6 = this.f47886f;
                kotlin.jvm.internal.m.c(aVar6);
                ((hj.c2) aVar6).f32444b.setVisibility(8);
                break;
        }
    }
}
