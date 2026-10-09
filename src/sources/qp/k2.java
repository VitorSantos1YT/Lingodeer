package qp;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.flexbox.FlexboxLayout;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.object.Model_Sentence_090;
import com.lingo.lingoskill.object.Sentence;
import com.lingo.lingoskill.object.Word;
import com.lingo.lingoskill.unity.exception.NoSuchElemException;
import com.lingodeer.R;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class k2 extends d {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Model_Sentence_090 f48008i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f48009j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final HashMap f48010k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final HashMap f48011l;
    public final HashMap m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final HashMap f48012n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f48013o;

    public k2(mp.b bVar, long j11) {
        super(bVar, j11);
        this.f48009j = new ArrayList();
        this.f48010k = new HashMap();
        this.f48011l = new HashMap();
        this.m = new HashMap();
        this.f48012n = new HashMap();
    }

    @Override // hi.a
    public final boolean a() {
        Iterator it = this.f48009j.iterator();
        kotlin.jvm.internal.m.e(it, "iterator(...)");
        boolean z11 = true;
        while (it.hasNext()) {
            Object next = it.next();
            kotlin.jvm.internal.m.e(next, "next(...)");
            View view = (View) next;
            View view2 = (View) this.f48012n.get(view);
            if (view2 != null) {
                EditText editText = (EditText) view.findViewById(R.id.edt_text);
                editText.clearFocus();
                editText.setEnabled(false);
                Object tag = view2.getTag();
                kotlin.jvm.internal.m.d(tag, "null cannot be cast to non-null type com.lingo.lingoskill.object.Word");
                String strQ0 = oz.x.q0(editText.getText().toString(), " ", BuildConfig.VERSION_NAME);
                String word = ((Word) tag).getWord();
                kotlin.jvm.internal.m.e(word, "getWord(...)");
                boolean zEquals = strQ0.equals(oz.x.q0(word, " ", BuildConfig.VERSION_NAME));
                Context context = this.f47883c;
                if (zEquals) {
                    editText.setBackgroundTintList(ColorStateList.valueOf(fr.j3.G(context, R.color.color_43CC93)));
                    editText.setTextColor(context.getColor(R.color.color_43CC93));
                } else {
                    view2.setVisibility(0);
                    editText.setBackgroundTintList(ColorStateList.valueOf(fr.j3.G(context, R.color.color_FF6666)));
                    editText.setTextColor(context.getColor(R.color.color_FF6666));
                    z11 = false;
                }
            }
        }
        return z11;
    }

    @Override // hi.a
    public final String b() {
        qy.q qVar = fv.b.f28186a;
        Model_Sentence_090 model_Sentence_090 = this.f48008i;
        if (model_Sentence_090 != null) {
            return fv.b.G(model_Sentence_090.getSentenceId(), null, null);
        }
        kotlin.jvm.internal.m.n("mModel");
        throw null;
    }

    @Override // hi.a
    public final String c() {
        return nv.p.m(this.f47882b, "1;", ";9");
    }

    @Override // hi.a
    public final List g() {
        ArrayList arrayList = new ArrayList();
        qy.q qVar = fv.b.f28186a;
        Model_Sentence_090 model_Sentence_090 = this.f48008i;
        if (model_Sentence_090 == null) {
            kotlin.jvm.internal.m.n("mModel");
            throw null;
        }
        String strH = fv.b.H(model_Sentence_090.getSentenceId());
        Model_Sentence_090 model_Sentence_091 = this.f48008i;
        if (model_Sentence_091 == null) {
            kotlin.jvm.internal.m.n("mModel");
            throw null;
        }
        arrayList.add(new fv.a(2L, strH, fv.b.F(model_Sentence_091.getSentenceId())));
        if (!((jp.p0) this.f47881a).Q) {
            Model_Sentence_090 model_Sentence_092 = this.f48008i;
            if (model_Sentence_092 == null) {
                kotlin.jvm.internal.m.n("mModel");
                throw null;
            }
            for (Word word : model_Sentence_092.getSentence().getSentWords()) {
                if (word.getWordType() != 1) {
                    LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                    if ((cf.x.n().keyLanguage != 5 && cf.x.n().keyLanguage != 15) || (word.getWordId() != 1858 && word.getWordId() != 544)) {
                        qy.q qVar2 = fv.b.f28186a;
                        arrayList.add(new fv.a(2L, fv.b.Z(word.getWordId()), fv.b.V(word.getWordId())));
                    }
                }
            }
        }
        return arrayList;
    }

    @Override // hi.a
    public final int i() {
        return 1;
    }

    @Override // hi.a
    public final void j() throws NoSuchElemException {
        Model_Sentence_090 model_Sentence_090LoadFullObject = Model_Sentence_090.loadFullObject(this.f47882b);
        if (model_Sentence_090LoadFullObject == null) {
            throw new NoSuchElemException();
        }
        this.f48008i = model_Sentence_090LoadFullObject;
    }

    @Override // hi.a
    public final void k() {
        throw new qy.k("An operation is not implemented: Not yet implemented");
    }

    @Override // qp.d
    public final fz.f n() {
        return j2.f47996a;
    }

    @Override // qp.d
    public final void p() {
        HashMap map;
        Iterator it;
        String str;
        int i11;
        float fZ;
        ArrayList arrayList = this.f48009j;
        arrayList.clear();
        HashMap map2 = this.f48010k;
        map2.clear();
        this.f48011l.clear();
        this.m.clear();
        HashMap map3 = this.f48012n;
        map3.clear();
        ta.a aVar = this.f47886f;
        kotlin.jvm.internal.m.c(aVar);
        TextView textView = ((hj.p2) aVar).f33086f;
        Model_Sentence_090 model_Sentence_090 = this.f48008i;
        String str2 = "mModel";
        if (model_Sentence_090 == null) {
            kotlin.jvm.internal.m.n("mModel");
            throw null;
        }
        textView.setText(model_Sentence_090.getSentence().getTranslations());
        Model_Sentence_090 model_Sentence_091 = this.f48008i;
        if (model_Sentence_091 == null) {
            kotlin.jvm.internal.m.n("mModel");
            throw null;
        }
        Sentence sentence = model_Sentence_091.getSentence();
        kotlin.jvm.internal.m.e(sentence, "getSentence(...)");
        q(zq.c.b(sentence));
        ta.a aVar2 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar2);
        ViewGroup viewGroup = ((hj.p2) aVar2).f33083c;
        Model_Sentence_090 model_Sentence_092 = this.f48008i;
        if (model_Sentence_092 == null) {
            kotlin.jvm.internal.m.n("mModel");
            throw null;
        }
        List<Word> stemList = model_Sentence_092.getStemList();
        kotlin.jvm.internal.m.e(stemList, "getStemList(...)");
        Iterator it2 = stemList.iterator();
        boolean z11 = false;
        int i12 = 0;
        while (true) {
            boolean zHasNext = it2.hasNext();
            Context context = this.f47883c;
            if (!zHasNext) {
                Iterator it3 = arrayList.iterator();
                kotlin.jvm.internal.m.e(it3, "iterator(...)");
                while (it3.hasNext()) {
                    Object next = it3.next();
                    kotlin.jvm.internal.m.e(next, "next(...)");
                    View view = (View) next;
                    EditText editText = (EditText) view.findViewById(R.id.edt_text);
                    editText.setOnFocusChangeListener(new hh.f0(this, view, editText, 1));
                }
                LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
                ta.a aVar3 = this.f47886f;
                kotlin.jvm.internal.m.c(aVar3);
                View viewInflate = layoutInflaterFrom.inflate(R.layout.include_iv_audio, (ViewGroup) ((hj.p2) aVar3).f33083c, false);
                kotlin.jvm.internal.m.d(viewInflate, "null cannot be cast to non-null type android.widget.ImageView");
                ImageView imageView = (ImageView) viewInflate;
                ta.a aVar4 = this.f47886f;
                kotlin.jvm.internal.m.c(aVar4);
                ((hj.p2) aVar4).f33083c.addView(imageView, 0);
                if (!this.f47884d.isAudioModel || ((jp.p0) this.f47881a).Q) {
                    imageView.setVisibility(8);
                } else {
                    bq.z.b(imageView, new n0.w0(27, this, imageView));
                    ta.a aVar5 = this.f47886f;
                    kotlin.jvm.internal.m.c(aVar5);
                    bq.z.b(((hj.p2) aVar5).f33086f, new ih.c(imageView, 7));
                }
                ta.a aVar6 = this.f47886f;
                kotlin.jvm.internal.m.c(aVar6);
                FlexboxLayout flexboxLayout = ((hj.p2) aVar6).f33082b;
                flexboxLayout.postDelayed(new b2.c(4, flexboxLayout, new lt.e(this, 20)), 0L);
                return;
            }
            Object next2 = it2.next();
            int i13 = i12 + 1;
            if (i12 < 0) {
                ns.o.V();
                throw null;
            }
            Word word = (Word) next2;
            if (kotlin.jvm.internal.m.a(word.getWord(), "_____")) {
                View viewInflate2 = LayoutInflater.from(context).inflate(R.layout.item_pd_dictation_word_edt, viewGroup, z11);
                EditText editText2 = (EditText) viewInflate2.findViewById(R.id.edt_text);
                int[] iArr = bq.r.f4959a;
                kotlin.jvm.internal.m.c(editText2);
                bq.m.I(editText2);
                editText2.setShowSoftInputOnFocus(z11);
                viewGroup.addView(viewInflate2);
                arrayList.add(viewInflate2);
                ArrayList arrayList2 = new ArrayList();
                StringBuilder sb2 = new StringBuilder();
                Model_Sentence_090 model_Sentence_093 = this.f48008i;
                if (model_Sentence_093 == null) {
                    kotlin.jvm.internal.m.n(str2);
                    throw null;
                }
                Word word2 = model_Sentence_093.getOptionList().get(this.f48013o);
                kotlin.jvm.internal.m.c(word2);
                arrayList2.addAll(qi.b.h(word2));
                for (int length = word2.getWord().length() - 1; -1 < length; length--) {
                    sb2.append(word2.getWord().charAt(length));
                }
                map2.put(viewInflate2, arrayList2);
                StringBuilder sb3 = new StringBuilder();
                Iterator it4 = ry.m.O0(oz.q.h1(sb2)).iterator();
                while (it4.hasNext()) {
                    sb3.append(((Character) it4.next()).charValue());
                }
                Word word3 = new Word();
                word3.setWord(sb3.toString());
                word3.setZhuyin(sb3.toString());
                word3.setLuoma(sb3.toString());
                View viewInflate3 = LayoutInflater.from(context).inflate(R.layout.item_pd_dictation_word_key, viewGroup, false);
                View viewFindViewById = viewInflate3.findViewById(R.id.tv_top);
                kotlin.jvm.internal.m.e(viewFindViewById, "findViewById(...)");
                View viewFindViewById2 = viewInflate3.findViewById(R.id.tv_middle);
                kotlin.jvm.internal.m.e(viewFindViewById2, "findViewById(...)");
                View viewFindViewById3 = viewInflate3.findViewById(R.id.tv_bottom);
                kotlin.jvm.internal.m.e(viewFindViewById3, "findViewById(...)");
                zq.c.e(word3, (TextView) viewFindViewById, (TextView) viewFindViewById2, (TextView) viewFindViewById3, false);
                viewInflate3.setBackgroundColor(Color.parseColor("#7FB14A"));
                viewInflate3.setVisibility(8);
                viewInflate3.setTag(word3);
                viewGroup.addView(viewInflate3);
                map3.put(viewInflate2, viewInflate3);
                this.f48013o++;
                map2 = map2;
                map = map3;
                it = it2;
                str = str2;
            } else {
                View viewInflate4 = LayoutInflater.from(context).inflate(R.layout.item_pd_dictation_word_normal, viewGroup, false);
                View viewFindViewById4 = viewInflate4.findViewById(R.id.tv_top);
                kotlin.jvm.internal.m.e(viewFindViewById4, "findViewById(...)");
                View viewFindViewById5 = viewInflate4.findViewById(R.id.tv_middle);
                kotlin.jvm.internal.m.e(viewFindViewById5, "findViewById(...)");
                View viewFindViewById6 = viewInflate4.findViewById(R.id.tv_bottom);
                kotlin.jvm.internal.m.e(viewFindViewById6, "findViewById(...)");
                zq.c.e(word, (TextView) viewFindViewById4, (TextView) viewFindViewById5, (TextView) viewFindViewById6, false);
                viewInflate4.setTag(word);
                int[] iArr2 = bq.r.f4959a;
                if (bq.m.F()) {
                    map = map3;
                    it = it2;
                    str = str2;
                } else {
                    Model_Sentence_090 model_Sentence_094 = this.f48008i;
                    if (model_Sentence_094 == null) {
                        kotlin.jvm.internal.m.n(str2);
                        throw null;
                    }
                    List<Word> stemList2 = model_Sentence_094.getStemList();
                    kotlin.jvm.internal.m.e(stemList2, "getStemList(...)");
                    FlexboxLayout.LayoutParams layoutParams = new FlexboxLayout.LayoutParams(-2, -2);
                    if ((word.getWordType() != 1 || kotlin.jvm.internal.m.a(word.getWord(), "_____")) && i13 < stemList2.size() && stemList2.get(i13).getWordType() == 1 && !kotlin.jvm.internal.m.a(stemList2.get(i13).getWord(), "_____") && !kotlin.jvm.internal.m.a(stemList2.get(i13).getWord(), " ")) {
                        map = map3;
                        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                        if (!ry.l.D(new Integer[]{5, 15, 53, 54}, Integer.valueOf(cf.x.n().keyLanguage)) || !ns.o.L(":", ";", "?", "!", "(", "{", "«", "»", "/").contains(stemList2.get(i13).getWord())) {
                            it = it2;
                            str = str2;
                        }
                        i11 = 0;
                        word.getWord();
                        ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = i11;
                        viewInflate4.setLayoutParams(layoutParams);
                    } else {
                        map = map3;
                    }
                    LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
                    if (cf.x.n().keyLanguage == 5) {
                        List listL = ns.o.L("'", "-", "(", "{");
                        String word4 = word.getWord();
                        kotlin.jvm.internal.m.e(word4, "getWord(...)");
                        it = it2;
                        str = str2;
                        String strSubstring = word4.substring(word.getWord().length() - 1, word.getWord().length());
                        kotlin.jvm.internal.m.e(strSubstring, "substring(...)");
                        if (!listL.contains(strSubstring)) {
                            if (i13 < stemList2.size()) {
                                String word5 = stemList2.get(i13).getWord();
                                kotlin.jvm.internal.m.e(word5, "getWord(...)");
                                if (oz.x.s0(word5, "-", false)) {
                                }
                                word.getWord();
                                ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = i11;
                                viewInflate4.setLayoutParams(layoutParams);
                            }
                            fZ = fr.j3.Z(4, context);
                        }
                        i11 = 0;
                        word.getWord();
                        ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = i11;
                        viewInflate4.setLayoutParams(layoutParams);
                    } else {
                        it = it2;
                        str = str2;
                        fZ = fr.j3.Z(4, context);
                    }
                    i11 = (int) fZ;
                    word.getWord();
                    ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = i11;
                    viewInflate4.setLayoutParams(layoutParams);
                }
                viewGroup.addView(viewInflate4);
            }
            i12 = i13;
            str2 = str;
            map2 = map2;
            it2 = it;
            map3 = map;
            arrayList = arrayList;
            z11 = false;
        }
    }

    public final void r() {
        kotlin.jvm.internal.u uVar = new kotlin.jvm.internal.u();
        ArrayList arrayList = this.f48009j;
        int size = arrayList.size();
        int i11 = 0;
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            int i13 = i11 + 1;
            if (i11 < 0) {
                ns.o.V();
                throw null;
            }
            if (((EditText) ((View) obj).findViewById(R.id.edt_text)).length() == 0) {
                uVar.f38357a = true;
            }
            i11 = i13;
        }
        boolean z11 = uVar.f38357a;
        Context context = this.f47883c;
        if (z11) {
            ta.a aVar = this.f47886f;
            kotlin.jvm.internal.m.c(aVar);
            ((hj.p2) aVar).f33085e.setText(context.getString(R.string.test_next));
            ta.a aVar2 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar2);
            bq.z.b(((hj.p2) aVar2).f33085e, new n0.w0(28, this, uVar));
            return;
        }
        ta.a aVar3 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar3);
        ((hj.p2) aVar3).f33085e.setText(context.getString(R.string.test_check));
        ta.a aVar4 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar4);
        bq.z.b(((hj.p2) aVar4).f33085e, new ot.e2(this, 10));
    }
}
