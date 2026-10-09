package hh;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.flexbox.FlexboxLayout;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.object.PdLesson;
import com.lingo.lingoskill.object.PdSentence;
import com.lingo.lingoskill.object.PdWord;
import com.lingodeer.R;
import com.tbruyelle.rxpermissions3.BuildConfig;
import fr.j3;
import hj.j4;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class j0 extends bp.m {
    public PdLesson O;
    public final ArrayList P;
    public final HashMap Q;
    public final HashMap R;
    public final HashMap S;
    public final HashMap T;
    public final th.e U;
    public final Object V;

    public j0() {
        super(g0.f32233a, "FluentWritingExercise");
        this.P = new ArrayList();
        this.Q = new HashMap();
        this.R = new HashMap();
        this.S = new HashMap();
        this.T = new HashMap();
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        kotlin.jvm.internal.m.c(lingoSkillApplication);
        this.U = new th.e(lingoSkillApplication);
        i0 i0Var = new i0(this, 1);
        qy.j jVar = qy.j.NONE;
        com.bumptech.glide.d.u(jVar, new bp.b1(10, this, i0Var));
        this.V = com.bumptech.glide.d.u(jVar, new bp.b1(9, this, new i0(this, 0)));
    }

    public final void A() {
        Iterator it = this.P.iterator();
        kotlin.jvm.internal.m.e(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            kotlin.jvm.internal.m.e(next, "next(...)");
            View view = (View) next;
            EditText editText = (EditText) view.findViewById(R.id.edt_text);
            editText.setOnFocusChangeListener(new f0(this, view, editText, 0));
        }
    }

    public final void B() {
        if (this.f36398d == null) {
            return;
        }
        Context contextRequireContext = requireContext();
        kotlin.jvm.internal.m.e(contextRequireContext, "requireContext(...)");
        lc.d dVar = new lc.d(contextRequireContext);
        lc.d.g(dVar, Integer.valueOf(R.string.are_you_sure_you_want_to_quit), null, 2);
        hz.b.t(dVar, Integer.valueOf(R.layout.dialog_lesson_quit), null, false, 62);
        lc.d.e(dVar, Integer.valueOf(R.string.f22251ok), null, new e0(this, 5), 2);
        lc.d.d(dVar, null, 6);
        dVar.show();
    }

    @Override // bp.m, androidx.fragment.app.k0
    public final void onPause() {
        super.onPause();
        this.U.g();
    }

    @Override // ji.e
    public final void q() {
        this.U.b();
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, qy.h] */
    @Override // ji.e
    public final void v(Bundle bundle) {
        try {
            PdLesson pdLesson = ((jh.o) this.V.getValue()).f36374b;
            if (pdLesson == null) {
                kotlin.jvm.internal.m.n("pdLesson");
                throw null;
            }
            this.O = pdLesson;
            ta.a aVar = this.f36400f;
            kotlin.jvm.internal.m.c(aVar);
            TextView textView = ((j4) aVar).f32777o;
            PdLesson pdLesson2 = this.O;
            if (pdLesson2 == null) {
                kotlin.jvm.internal.m.n("pdLesson");
                throw null;
            }
            textView.setText(pdLesson2.getTitle());
            ta.a aVar2 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar2);
            TextView textView2 = ((j4) aVar2).f32778p;
            PdLesson pdLesson3 = this.O;
            if (pdLesson3 == null) {
                kotlin.jvm.internal.m.n("pdLesson");
                throw null;
            }
            textView2.setText(pdLesson3.getTitleTranslation());
            int[] iArr = bq.r.f4959a;
            ta.a aVar3 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar3);
            bq.m.J(((j4) aVar3).f32777o);
            ta.a aVar4 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar4);
            bq.z.b(((j4) aVar4).f32770g, new e0(this, 0));
            y();
            LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
            if (ry.l.D(new Integer[]{1, 12}, Integer.valueOf(cf.x.n().keyLanguage))) {
                ta.a aVar5 = this.f36400f;
                kotlin.jvm.internal.m.c(aVar5);
                ((j4) aVar5).f32773j.setVisibility(0);
                if (((fr.o0) s()).h()) {
                    ta.a aVar6 = this.f36400f;
                    kotlin.jvm.internal.m.c(aVar6);
                    ((j4) aVar6).f32773j.setImageResource(R.drawable.pd_dictation_switch_zhuyin_jp);
                } else {
                    ta.a aVar7 = this.f36400f;
                    kotlin.jvm.internal.m.c(aVar7);
                    ((j4) aVar7).f32773j.setImageResource(R.drawable.pd_dictation_switih_jp);
                }
                ta.a aVar8 = this.f36400f;
                kotlin.jvm.internal.m.c(aVar8);
                ((j4) aVar8).f32772i.setVisibility(8);
            } else {
                ta.a aVar9 = this.f36400f;
                kotlin.jvm.internal.m.c(aVar9);
                ((j4) aVar9).f32773j.setVisibility(8);
                ta.a aVar10 = this.f36400f;
                kotlin.jvm.internal.m.c(aVar10);
                ((j4) aVar10).f32772i.setVisibility(0);
            }
            ta.a aVar11 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar11);
            bq.z.b(((j4) aVar11).f32773j, new e0(this, 4));
        } catch (Exception e8) {
            e8.printStackTrace();
            requireActivity().finish();
        }
    }

    /* JADX WARN: Code duplicated, block: B:55:0x01ab  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0, types: [java.lang.Throwable] */
    public final void x(PdSentence pdSentence) {
        View viewInflate;
        View view;
        View view2;
        Iterator it;
        boolean z11;
        int i11;
        int i12;
        float fZ;
        int i13;
        Iterator it2;
        String str;
        List listK;
        boolean z12;
        List listT;
        ArrayList arrayList;
        List listK2;
        int i14;
        boolean z13 = false;
        if (pdSentence.getItemType() == PdSentence.MALE) {
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(requireContext());
            ta.a aVar = this.f36400f;
            kotlin.jvm.internal.m.c(aVar);
            viewInflate = layoutInflaterFrom.inflate(R.layout.item_pd_dictation_left, (ViewGroup) ((j4) aVar).f32774k, false);
        } else {
            LayoutInflater layoutInflaterFrom2 = LayoutInflater.from(requireContext());
            ta.a aVar2 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar2);
            viewInflate = layoutInflaterFrom2.inflate(R.layout.item_pd_dictation_right, (ViewGroup) ((j4) aVar2).f32774k, false);
        }
        View view3 = viewInflate;
        ViewGroup viewGroup = (FlexboxLayout) view3.findViewById(R.id.flex_sentence);
        String strF = xt.b.a().f();
        Long sentenceId = pdSentence.getSentenceId();
        kotlin.jvm.internal.m.e(sentenceId, "getSentenceId(...)");
        long jLongValue = sentenceId.longValue();
        int[] iArr = bq.r.f4959a;
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        StringBuilder sbM = com.google.android.material.datepicker.d.m(jLongValue, "pod-", bq.m.g(cf.x.n().keyLanguage), "-s-");
        sbM.append(".mp3");
        bq.z.b(view3, new com.google.accompanist.permissions.a(21, this, defpackage.e.m(strF, sbM.toString())));
        List<PdWord> words = pdSentence.getWords();
        kotlin.jvm.internal.m.e(words, "getWords(...)");
        Iterator it3 = words.iterator();
        int i15 = 0;
        while (true) {
            PdWord pdWord = null;
            int i16 = -1;
            int i17 = 1;
            if (!it3.hasNext()) {
                List<PdWord> words2 = pdSentence.getWords();
                kotlin.jvm.internal.m.e(words2, "getWords(...)");
                Iterator it4 = words2.iterator();
                int i18 = 0;
                while (it4.hasNext()) {
                    Object next = it4.next();
                    int i19 = i18 + 1;
                    if (i18 < 0) {
                        ?? r16 = pdWord;
                        ns.o.V();
                        throw r16;
                    }
                    PdWord pdWord2 = (PdWord) next;
                    pdWord2.getDictationWord();
                    pdWord2.getFlag();
                    PdWord pdWord3 = pdWord;
                    String str2 = "getWord(...)";
                    if (pdWord2.getFlag() != i17) {
                        view2 = view3;
                        it = it4;
                        View viewInflate2 = LayoutInflater.from(getContext()).inflate(R.layout.item_pd_dictation_word_normal, viewGroup, false);
                        View viewFindViewById = viewInflate2.findViewById(R.id.tv_top);
                        kotlin.jvm.internal.m.e(viewFindViewById, "findViewById(...)");
                        View viewFindViewById2 = viewInflate2.findViewById(R.id.tv_middle);
                        kotlin.jvm.internal.m.e(viewFindViewById2, "findViewById(...)");
                        View viewFindViewById3 = viewInflate2.findViewById(R.id.tv_bottom);
                        kotlin.jvm.internal.m.e(viewFindViewById3, "findViewById(...)");
                        th.h.a(pdWord2, (TextView) viewFindViewById, (TextView) viewFindViewById2, (TextView) viewFindViewById3);
                        viewInflate2.setTag(pdWord2);
                        int[] iArr2 = bq.r.f4959a;
                        if (bq.m.F()) {
                            z11 = false;
                            i11 = 1;
                        } else {
                            FlexboxLayout.LayoutParams layoutParams = new FlexboxLayout.LayoutParams(-2, -2);
                            if ((pdWord2.getFlag() != -1 || kotlin.jvm.internal.m.a(pdWord2.getDictationWord(), "_____")) && i19 < pdSentence.getWords().size()) {
                                if (pdSentence.getWords().get(i19).getFlag() == -1 && !kotlin.jvm.internal.m.a(pdSentence.getWords().get(i19).getDictationWord(), "_____") && !kotlin.jvm.internal.m.a(pdSentence.getWords().get(i19).getDictationWord(), " ")) {
                                    LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
                                    if (cf.x.n().keyLanguage != 5 || !ns.o.L(":", ";", "?", "!", "(", "{", "«", "»", "/").contains(pdSentence.getWords().get(i19).getWord())) {
                                        z11 = false;
                                        i12 = 0;
                                        i11 = 1;
                                    }
                                }
                                pdWord2.getDictationWord();
                                ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = i12;
                                viewInflate2.setLayoutParams(layoutParams);
                            }
                            LingoSkillApplication lingoSkillApplication3 = LingoSkillApplication.f21665b;
                            if (cf.x.n().keyLanguage == 5) {
                                List listL = ns.o.L("'", "-", "(", "{");
                                String word = pdWord2.getWord();
                                kotlin.jvm.internal.m.e(word, "getWord(...)");
                                i11 = 1;
                                String strSubstring = word.substring(pdWord2.getWord().length() - 1, pdWord2.getWord().length());
                                kotlin.jvm.internal.m.e(strSubstring, "substring(...)");
                                if (listL.contains(strSubstring)) {
                                    z11 = false;
                                    i12 = 0;
                                } else {
                                    if (i19 < pdSentence.getWords().size()) {
                                        String word2 = pdSentence.getWords().get(i19).getWord();
                                        kotlin.jvm.internal.m.e(word2, "getWord(...)");
                                        z11 = false;
                                        if (oz.x.s0(word2, "-", false)) {
                                            i12 = 0;
                                        }
                                    } else {
                                        z11 = false;
                                    }
                                    Context contextRequireContext = requireContext();
                                    kotlin.jvm.internal.m.e(contextRequireContext, "requireContext(...)");
                                    fZ = j3.Z(4, contextRequireContext);
                                }
                                pdWord2.getDictationWord();
                                ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = i12;
                                viewInflate2.setLayoutParams(layoutParams);
                            } else {
                                z11 = false;
                                i11 = 1;
                                Context contextRequireContext2 = requireContext();
                                kotlin.jvm.internal.m.e(contextRequireContext2, "requireContext(...)");
                                fZ = j3.Z(4, contextRequireContext2);
                            }
                            i12 = (int) fZ;
                            pdWord2.getDictationWord();
                            ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = i12;
                            viewInflate2.setLayoutParams(layoutParams);
                        }
                        viewGroup.addView(viewInflate2);
                    } else if (i19 < pdSentence.getWords().size() && pdSentence.getWords().get(i19).getFlag() == i17) {
                        view2 = view3;
                        it = it4;
                        z11 = z13;
                        i11 = i17;
                    } else {
                        View viewInflate3 = LayoutInflater.from(getContext()).inflate(R.layout.item_pd_dictation_word_edt, viewGroup, z13);
                        EditText editText = (EditText) viewInflate3.findViewById(R.id.edt_text);
                        int[] iArr3 = bq.r.f4959a;
                        kotlin.jvm.internal.m.c(editText);
                        bq.m.I(editText);
                        editText.setShowSoftInputOnFocus(z13);
                        viewGroup.addView(viewInflate3);
                        this.P.add(viewInflate3);
                        ArrayList arrayList2 = new ArrayList();
                        StringBuilder sb2 = new StringBuilder();
                        int i21 = i18;
                        while (i16 < i21) {
                            PdWord pdWord4 = pdSentence.getWords().get(i21);
                            if (pdWord4.getFlag() != i17) {
                                break;
                            }
                            int i22 = i21 - 1;
                            if (i22 >= 0) {
                                PdWord pdWord5 = pdSentence.getWords().get(i22);
                                int[] iArr4 = bq.r.f4959a;
                                if (bq.m.F() || pdWord5.getFlag() != i17) {
                                    i13 = 0;
                                } else {
                                    i13 = i17;
                                }
                            } else {
                                i13 = 0;
                            }
                            LingoSkillApplication lingoSkillApplication4 = LingoSkillApplication.f21665b;
                            int i23 = cf.x.n().keyLanguage;
                            if (i23 != 0) {
                                it2 = it4;
                                if (i23 != i17) {
                                    if (i23 != 2) {
                                        arrayList = new ArrayList();
                                        String word3 = pdWord4.getWord();
                                        kotlin.jvm.internal.m.e(word3, str2);
                                        int length = word3.length();
                                        int i24 = 0;
                                        while (i24 < length) {
                                            String str3 = word3;
                                            String strValueOf = String.valueOf(word3.charAt(i24));
                                            int i25 = i24;
                                            PdWord pdWord6 = new PdWord();
                                            pdWord6.setWord(strValueOf);
                                            arrayList.add(pdWord6);
                                            i24 = i25 + 1;
                                            word3 = str3;
                                        }
                                    } else {
                                        String dictationWord = pdWord4.getDictationWord();
                                        kotlin.jvm.internal.m.e(dictationWord, "getDictationWord(...)");
                                        String string = oz.q.i1(oz.x.q0(dictationWord, " ", BuildConfig.VERSION_NAME)).toString();
                                        ArrayList arrayList3 = new ArrayList();
                                        int length2 = string.length();
                                        int i26 = 0;
                                        while (i26 < length2) {
                                            String str4 = string;
                                            String strValueOf2 = String.valueOf(string.charAt(i26));
                                            int i27 = length2;
                                            PdWord pdWord7 = new PdWord();
                                            pdWord7.setWord(strValueOf2);
                                            arrayList3.add(pdWord7);
                                            i26++;
                                            length2 = i27;
                                            string = str4;
                                        }
                                        arrayList = arrayList3;
                                    }
                                    str = str2;
                                } else {
                                    i13 = i13;
                                    arrayList = new ArrayList();
                                    HashMap map = new HashMap();
                                    int i28 = 0;
                                    while (i28 < 45) {
                                        String str5 = th.j.f52426a[i28];
                                        int i29 = i28;
                                        String dictationWord2 = pdWord4.getDictationWord();
                                        kotlin.jvm.internal.m.e(dictationWord2, "getDictationWord(...)");
                                        View view4 = view3;
                                        String str6 = str2;
                                        int iI0 = oz.q.I0(dictationWord2, str5, 0, false, 6);
                                        if (iI0 != -1) {
                                            map.put(Integer.valueOf(iI0), Integer.valueOf(str5.length()));
                                        }
                                        i28 = i29 + 1;
                                        view3 = view4;
                                        str2 = str6;
                                    }
                                    view3 = view3;
                                    str = str2;
                                    int length3 = pdWord4.getDictationWord().length();
                                    int i30 = 0;
                                    while (i30 < length3) {
                                        Iterator it5 = map.keySet().iterator();
                                        while (true) {
                                            if (!it5.hasNext()) {
                                                i14 = length3;
                                                String strValueOf3 = String.valueOf(pdWord4.getDictationWord().charAt(i30));
                                                PdWord pdWord8 = new PdWord();
                                                pdWord8.setWord(strValueOf3);
                                                pdWord8.setZhuyin(strValueOf3);
                                                arrayList.add(pdWord8);
                                                break;
                                            }
                                            Object next2 = it5.next();
                                            i14 = length3;
                                            kotlin.jvm.internal.m.e(next2, "next(...)");
                                            int iIntValue = ((Number) next2).intValue();
                                            if (i30 >= iIntValue) {
                                                Object obj = map.get(Integer.valueOf(iIntValue));
                                                kotlin.jvm.internal.m.c(obj);
                                                if (i30 < ((Number) obj).intValue() + iIntValue) {
                                                    if (i30 != iIntValue) {
                                                        break;
                                                    }
                                                    String dictationWord3 = pdWord4.getDictationWord();
                                                    kotlin.jvm.internal.m.e(dictationWord3, "getDictationWord(...)");
                                                    Object obj2 = map.get(Integer.valueOf(iIntValue));
                                                    kotlin.jvm.internal.m.c(obj2);
                                                    String strSubstring2 = dictationWord3.substring(iIntValue, ((Number) obj2).intValue() + iIntValue);
                                                    kotlin.jvm.internal.m.e(strSubstring2, "substring(...)");
                                                    PdWord pdWord9 = new PdWord();
                                                    pdWord9.setWord(strSubstring2);
                                                    pdWord9.setZhuyin(strSubstring2);
                                                    arrayList.add(pdWord9);
                                                    break;
                                                }
                                            }
                                            length3 = i14;
                                        }
                                        i30++;
                                        length3 = i14;
                                    }
                                }
                            } else {
                                view3 = view3;
                                it2 = it4;
                                str = str2;
                                i13 = i13;
                                ArrayList arrayList4 = new ArrayList();
                                String luoma = pdWord4.getLuoma();
                                kotlin.jvm.internal.m.e(luoma, "getLuoma(...)");
                                Pattern patternCompile = Pattern.compile(" ");
                                kotlin.jvm.internal.m.e(patternCompile, "compile(...)");
                                oz.q.U0(0);
                                Matcher matcher = patternCompile.matcher(luoma);
                                if (matcher.find()) {
                                    ArrayList arrayList5 = new ArrayList(10);
                                    int iC = 0;
                                    do {
                                        iC = nv.p.c(matcher, luoma, iC, arrayList5);
                                    } while (matcher.find());
                                    nv.p.B(iC, luoma, arrayList5);
                                    listK = arrayList5;
                                } else {
                                    listK = ns.o.K(luoma.toString());
                                }
                                boolean zIsEmpty = listK.isEmpty();
                                List listT2 = ry.r.f50854a;
                                if (zIsEmpty) {
                                    z12 = true;
                                    listT = listT2;
                                    break;
                                }
                                ListIterator listIterator = listK.listIterator(listK.size());
                                while (true) {
                                    if (listIterator.hasPrevious()) {
                                        if (((String) listIterator.previous()).length() != 0) {
                                            z12 = true;
                                            listT = b7.e0.t(listIterator, 1, listK);
                                            break;
                                        }
                                    } else {
                                        z12 = true;
                                        listT = listT2;
                                        break;
                                    }
                                }
                                String[] strArr = (String[]) listT.toArray(new String[0]);
                                if (strArr.length == pdWord4.getWord().length() - 1) {
                                    StringBuilder sb3 = new StringBuilder(pdWord4.getLuoma());
                                    try {
                                        sb3.replace(sb3.length() - 1, sb3.length(), " er");
                                    } catch (Exception e8) {
                                        e8.printStackTrace();
                                    }
                                    String string2 = sb3.toString();
                                    kotlin.jvm.internal.m.e(string2, "toString(...)");
                                    Pattern patternCompile2 = Pattern.compile(" ");
                                    kotlin.jvm.internal.m.e(patternCompile2, "compile(...)");
                                    oz.q.U0(0);
                                    Matcher matcher2 = patternCompile2.matcher(string2);
                                    if (matcher2.find()) {
                                        ArrayList arrayList6 = new ArrayList(10);
                                        int iC2 = 0;
                                        do {
                                            iC2 = nv.p.c(matcher2, string2, iC2, arrayList6);
                                        } while (matcher2.find());
                                        nv.p.B(iC2, string2, arrayList6);
                                        listK2 = arrayList6;
                                    } else {
                                        listK2 = ns.o.K(string2.toString());
                                    }
                                    if (!listK2.isEmpty()) {
                                        ListIterator listIterator2 = listK2.listIterator(listK2.size());
                                        while (listIterator2.hasPrevious()) {
                                            if (((String) listIterator2.previous()).length() != 0) {
                                                listT2 = b7.e0.t(listIterator2, 1, listK2);
                                                break;
                                            }
                                        }
                                    }
                                    strArr = (String[]) listT2.toArray(new String[0]);
                                }
                                String[] strArr2 = strArr;
                                int length4 = pdWord4.getWord().length();
                                for (int i31 = 0; i31 < length4; i31++) {
                                    PdWord pdWord10 = new PdWord();
                                    try {
                                        pdWord10.setLuoma(strArr2[i31] + " ");
                                    } catch (Exception e10) {
                                        e10.printStackTrace();
                                    }
                                    pdWord10.setWord(String.valueOf(pdWord4.getWord().charAt(i31)));
                                    arrayList4.add(pdWord10);
                                }
                                arrayList = arrayList4;
                            }
                            arrayList2.addAll(arrayList);
                            int length5 = pdWord4.getDictationWord().length();
                            while (true) {
                                length5--;
                                if (-1 >= length5) {
                                    break;
                                } else {
                                    sb2.append(pdWord4.getDictationWord().charAt(length5));
                                }
                            }
                            if (i13 != 0) {
                                sb2.append(" ");
                                PdWord pdWord11 = new PdWord();
                                pdWord11.setWord(" ");
                                pdWord11.setZhuyin(" ");
                                pdWord11.setLuoma(" ");
                                arrayList2.add(pdWord11);
                            }
                            i21--;
                            it4 = it2;
                            view3 = view3;
                            str2 = str;
                            i16 = -1;
                            i17 = 1;
                        }
                        view2 = view3;
                        it = it4;
                        this.Q.put(viewInflate3, arrayList2);
                        StringBuilder sb4 = new StringBuilder();
                        Iterator it6 = ry.m.O0(oz.q.h1(sb2)).iterator();
                        while (it6.hasNext()) {
                            sb4.append(((Character) it6.next()).charValue());
                        }
                        PdWord pdWord12 = new PdWord();
                        pdWord12.setWord(sb4.toString());
                        pdWord12.setZhuyin(sb4.toString());
                        pdWord12.setLuoma(sb4.toString());
                        View viewInflate4 = LayoutInflater.from(getContext()).inflate(R.layout.item_pd_dictation_word_key, viewGroup, false);
                        View viewFindViewById4 = viewInflate4.findViewById(R.id.tv_top);
                        kotlin.jvm.internal.m.e(viewFindViewById4, "findViewById(...)");
                        View viewFindViewById5 = viewInflate4.findViewById(R.id.tv_middle);
                        kotlin.jvm.internal.m.e(viewFindViewById5, "findViewById(...)");
                        View viewFindViewById6 = viewInflate4.findViewById(R.id.tv_bottom);
                        kotlin.jvm.internal.m.e(viewFindViewById6, "findViewById(...)");
                        th.h.a(pdWord12, (TextView) viewFindViewById4, (TextView) viewFindViewById5, (TextView) viewFindViewById6);
                        viewInflate4.setBackgroundColor(Color.parseColor("#7FB14A"));
                        viewInflate4.setVisibility(8);
                        viewInflate4.setTag(pdWord12);
                        viewGroup.addView(viewInflate4);
                        this.T.put(viewInflate3, viewInflate4);
                        z11 = false;
                        i11 = 1;
                    }
                    z13 = z11;
                    i18 = i19;
                    pdWord = pdWord3;
                    it4 = it;
                    i17 = i11;
                    view3 = view2;
                    i16 = -1;
                }
                View view5 = view3;
                if (pdSentence.getItemType() == PdSentence.MALE) {
                    ta.a aVar3 = this.f36400f;
                    kotlin.jvm.internal.m.c(aVar3);
                    view = view5;
                    view.setTranslationX(-((j4) aVar3).f32774k.getWidth());
                } else {
                    view = view5;
                    ta.a aVar4 = this.f36400f;
                    kotlin.jvm.internal.m.c(aVar4);
                    view.setTranslationX(((j4) aVar4).f32774k.getWidth());
                }
                ta.a aVar5 = this.f36400f;
                kotlin.jvm.internal.m.c(aVar5);
                ((j4) aVar5).f32774k.addView(view);
                view.postDelayed(new b2.c(4, view, new o(view, 2)), 0L);
                return;
            }
            Object next3 = it3.next();
            int i32 = i15 + 1;
            if (i15 < 0) {
                ns.o.V();
                throw null;
            }
            PdWord pdWord13 = (PdWord) next3;
            if (kotlin.jvm.internal.m.a(pdWord13.getDictationWord(), " ")) {
                int i33 = i15 - 1;
                PdWord pdWord14 = i33 > -1 ? pdSentence.getWords().get(i33) : null;
                if (i32 > 0 && i32 < pdSentence.getWords().size()) {
                    pdWord = pdSentence.getWords().get(i32);
                }
                if (pdWord14 != null && pdWord != null && pdWord14.getFlag() == 1 && pdWord.getFlag() == 1) {
                    pdWord13.setFlag(1);
                }
            }
            i15 = i32;
        }
    }

    public final void y() {
        ta.a aVar = this.f36400f;
        kotlin.jvm.internal.m.c(aVar);
        ((j4) aVar).f32767d.setVisibility(0);
        ta.a aVar2 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar2);
        ((j4) aVar2).f32768e.setVisibility(8);
        this.P.clear();
        this.Q.clear();
        this.R.clear();
        this.S.clear();
        this.T.clear();
        ta.a aVar3 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar3);
        ((j4) aVar3).f32774k.removeAllViews();
        PdLesson pdLesson = this.O;
        if (pdLesson == null) {
            kotlin.jvm.internal.m.n("pdLesson");
            throw null;
        }
        if (pdLesson.getSentences().isEmpty()) {
            requireActivity().finish();
            return;
        }
        PdLesson pdLesson2 = this.O;
        if (pdLesson2 == null) {
            kotlin.jvm.internal.m.n("pdLesson");
            throw null;
        }
        PdSentence pdSentence = pdLesson2.getSentences().get(0);
        kotlin.jvm.internal.m.e(pdSentence, "get(...)");
        x(pdSentence);
        A();
        ta.a aVar4 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar4);
        bq.z.a(((j4) aVar4).f32774k, 0L, new o(this, 1));
        ta.a aVar5 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar5);
        bq.z.b(((j4) aVar5).f32772i, new e0(this, 6));
    }

    public final void z() {
        kotlin.jvm.internal.u uVar = new kotlin.jvm.internal.u();
        ArrayList arrayList = this.P;
        int size = arrayList.size();
        boolean z11 = false;
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
        ta.a aVar = this.f36400f;
        kotlin.jvm.internal.m.c(aVar);
        int childCount = ((j4) aVar).f32774k.getChildCount();
        PdLesson pdLesson = this.O;
        if (pdLesson == null) {
            kotlin.jvm.internal.m.n("pdLesson");
            throw null;
        }
        if (childCount < pdLesson.getSentences().size()) {
            ta.a aVar2 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar2);
            PdLesson pdLesson2 = this.O;
            if (pdLesson2 == null) {
                kotlin.jvm.internal.m.n("pdLesson");
                throw null;
            }
            int size2 = pdLesson2.getSentences().size();
            for (int childCount2 = ((j4) aVar2).f32774k.getChildCount(); childCount2 < size2; childCount2++) {
                PdLesson pdLesson3 = this.O;
                if (pdLesson3 == null) {
                    kotlin.jvm.internal.m.n("pdLesson");
                    throw null;
                }
                Iterator<PdWord> it = pdLesson3.getSentences().get(childCount2).getWords().iterator();
                while (it.hasNext()) {
                    if (it.next().getFlag() == 1) {
                        z11 = true;
                    }
                }
            }
        }
        if (!uVar.f38357a) {
            ta.a aVar3 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar3);
            int childCount3 = ((j4) aVar3).f32774k.getChildCount();
            PdLesson pdLesson4 = this.O;
            if (pdLesson4 == null) {
                kotlin.jvm.internal.m.n("pdLesson");
                throw null;
            }
            if (childCount3 >= pdLesson4.getSentences().size()) {
                ta.a aVar4 = this.f36400f;
                kotlin.jvm.internal.m.c(aVar4);
                ((j4) aVar4).f32776n.setText(getString(R.string.test_check));
                ta.a aVar5 = this.f36400f;
                kotlin.jvm.internal.m.c(aVar5);
                bq.z.b(((j4) aVar5).f32776n, new e0(this, 1));
                return;
            }
        }
        if (z11 || uVar.f38357a) {
            ta.a aVar6 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar6);
            ((j4) aVar6).f32776n.setText(getString(R.string.test_next));
        } else {
            ta.a aVar7 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar7);
            ((j4) aVar7).f32776n.setText(getString(R.string.test_check));
        }
        ta.a aVar8 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar8);
        bq.z.b(((j4) aVar8).f32776n, new com.google.accompanist.permissions.a(20, uVar, this));
    }
}
