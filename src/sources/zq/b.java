package zq;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import au.a1;
import bq.r;
import bq.z;
import cf.x;
import com.google.android.flexbox.FlexboxLayout;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.object.Word;
import com.lingo.lingoskill.ruskill.ui.learn.mr.OCBJEWZHh;
import com.lingodeer.R;
import fa.EQx.nuRcCS;
import ff.h;
import fr.j3;
import hh.p0;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import kotlin.jvm.internal.m;
import ns.o;
import nv.p;
import oz.q;
import ry.l;
import vf.eq.EHjhWcesDUIsIw;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class b {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String[] f59264t = {".", "!", "?", "!!!", "..."};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f59265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f59266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FlexboxLayout f59267c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f59268d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f59269e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f59270f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f59271g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f59272h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f59273i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f59274j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public PopupWindow f59275k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f59276l;
    public a m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f59277n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f59278o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f59279p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f59280q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f59281r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f59282s;

    public b(Context context, List words, FlexboxLayout flexboxLayout) {
        m.f(context, "context");
        m.f(words, "words");
        m.f(flexboxLayout, "flexboxLayout");
        this.f59274j = 8;
        this.f59276l = -1;
        this.f59278o = true;
        this.f59265a = context;
        this.f59279p = null;
        this.f59266b = words;
        this.f59267c = flexboxLayout;
    }

    public final void a() {
        xa.a aVar = new xa.a(this, 13);
        FlexboxLayout flexboxLayout = this.f59267c;
        m.f(flexboxLayout, "<this>");
        flexboxLayout.postDelayed(new b2.c(4, flexboxLayout, aVar), 0L);
    }

    public final void b() {
        PopupWindow popupWindow;
        PopupWindow popupWindow2 = this.f59275k;
        if (popupWindow2 == null || popupWindow2 == null || !popupWindow2.isShowing() || (popupWindow = this.f59275k) == null) {
            return;
        }
        popupWindow.dismiss();
    }

    public abstract String c(Word word);

    public final void f(int i11, TextView textView, String str) {
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        if (x.n().keyLanguage == 0 || x.n().keyLanguage == 1 || x.n().keyLanguage == 2 || x.n().keyLanguage == 51) {
            return;
        }
        List list = this.f59266b;
        if (i11 == 0 && ((Word) list.get(i11)).getWordType() != 1 && !m.a(((Word) list.get(i11)).getWord(), "_____") && p0.C((Word) p.g(1, list), "getWord(...)")) {
            String strSubstring = str.substring(0, 1);
            m.e(strSubstring, "substring(...)");
            int[] iArr = r.f4959a;
            String strM = p0.m(strSubstring, "toUpperCase(...)");
            String strSubstring2 = str.substring(1);
            m.e(strSubstring2, "substring(...)");
            String strConcat = strM.concat(strSubstring2);
            if (x.n().keyLanguage == 65 && oz.x.s0(strConcat, "Έ", false)) {
                strConcat = " ".concat(strConcat);
            }
            textView.setText(strConcat);
            return;
        }
        if (i11 == 1 && ((Word) list.get(0)).getWordType() == 1 && !m.a(((Word) list.get(0)).getWord(), "_____") && ((Word) list.get(i11)).getWordType() != 1 && !m.a(((Word) list.get(i11)).getWord(), "_____") && ((Word) p.g(1, list)).getWordType() == 1 && !m.a(((Word) p.g(1, list)).getWord(), "_____")) {
            String strSubstring3 = str.substring(0, 1);
            m.e(strSubstring3, "substring(...)");
            int[] iArr2 = r.f4959a;
            String strM2 = p0.m(strSubstring3, "toUpperCase(...)");
            String strSubstring4 = str.substring(1);
            m.e(strSubstring4, "substring(...)");
            textView.setText(strM2.concat(strSubstring4));
            return;
        }
        if (i11 > 0) {
            Word word = (Word) list.get(i11 - 1);
            if (p0.C(word, "getWord(...)") && x.n().keyLanguage != 0 && x.n().keyLanguage != 1 && x.n().keyLanguage != 2 && ((Word) list.get(i11)).getWordType() != 1 && !m.a(((Word) list.get(i11)).getWord(), "_____") && p0.C((Word) p.g(1, list), "getWord(...)")) {
                String strSubstring5 = str.substring(0, 1);
                m.e(strSubstring5, "substring(...)");
                int[] iArr3 = r.f4959a;
                String strM3 = p0.m(strSubstring5, "toUpperCase(...)");
                String strSubstring6 = str.substring(1);
                m.e(strSubstring6, "substring(...)");
                textView.setText(strM3.concat(strSubstring6));
                return;
            }
            if (i11 <= 1 || word.getWordType() != 1 || m.a(word.getWord(), "_____") || !p0.C((Word) list.get(i11 - 2), "getWord(...)") || x.n().keyLanguage == 0 || x.n().keyLanguage == 1 || x.n().keyLanguage == 2 || ((Word) list.get(i11)).getWordType() == 1 || m.a(((Word) list.get(i11)).getWord(), "_____") || !p0.C((Word) p.g(1, list), "getWord(...)")) {
                return;
            }
            String strSubstring7 = str.substring(0, 1);
            m.e(strSubstring7, "substring(...)");
            int[] iArr4 = r.f4959a;
            String strM4 = p0.m(strSubstring7, "toUpperCase(...)");
            String strSubstring8 = str.substring(1);
            m.e(strSubstring8, "substring(...)");
            textView.setText(strM4.concat(strSubstring8));
        }
    }

    public final void g(FrameLayout frameLayout, Word word) {
        List listK;
        String str = this.f59279p;
        if (str == null || TextUtils.isEmpty(str)) {
            return;
        }
        int i11 = 0;
        Matcher matcherW = p.w(0, ";", "compile(...)", str);
        if (matcherW.find()) {
            ArrayList arrayList = new ArrayList(10);
            int iC = 0;
            do {
                iC = p.c(matcherW, str, iC, arrayList);
            } while (matcherW.find());
            p.B(iC, str, arrayList);
            listK = arrayList;
        } else {
            listK = o.K(str.toString());
        }
        Object[] array = listK.toArray(new String[0]);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : array) {
            if (q.i1((String) obj).toString().length() > 0) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList2.size();
        while (i11 < size) {
            Object obj2 = arrayList2.get(i11);
            i11++;
            Long lValueOf = Long.valueOf((String) obj2);
            m.e(lValueOf, "valueOf(...)");
            arrayList3.add(lValueOf);
        }
        word.getWordId();
        if (arrayList3.contains(Long.valueOf(word.getWordId()))) {
            View viewFindViewById = frameLayout.findViewById(R.id.ll_item);
            m.e(viewFindViewById, "findViewById(...)");
            ((LinearLayout) viewFindViewById).setBackgroundResource(R.drawable.lesson_test_title_underline);
            View viewFindViewById2 = frameLayout.findViewById(R.id.tv_top);
            m.e(viewFindViewById2, "findViewById(...)");
            View viewFindViewById3 = frameLayout.findViewById(R.id.tv_middle);
            m.e(viewFindViewById3, "findViewById(...)");
            View viewFindViewById4 = frameLayout.findViewById(R.id.tv_bottom);
            m.e(viewFindViewById4, "findViewById(...)");
            Context context = this.f59265a;
            m.f(context, "context");
            ((TextView) viewFindViewById2).setTextColor(context.getColor(R.color.colorAccent));
            ((TextView) viewFindViewById3).setTextColor(context.getColor(R.color.colorAccent));
            ((TextView) viewFindViewById4).setTextColor(context.getColor(R.color.colorAccent));
        }
    }

    public abstract void h(Word word, TextView textView, TextView textView2, TextView textView3);

    /* JADX WARN: Code duplicated, block: B:102:0x035b  */
    /* JADX WARN: Code duplicated, block: B:103:0x035e  */
    /* JADX WARN: Code duplicated, block: B:106:0x0395  */
    /* JADX WARN: Code duplicated, block: B:108:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:110:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:112:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:115:0x03ce  */
    /* JADX WARN: Code duplicated, block: B:117:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:119:0x03f2  */
    /* JADX WARN: Code duplicated, block: B:121:0x03ff  */
    /* JADX WARN: Code duplicated, block: B:124:0x0408  */
    /* JADX WARN: Code duplicated, block: B:126:0x041d  */
    /* JADX WARN: Code duplicated, block: B:128:0x042c  */
    /* JADX WARN: Code duplicated, block: B:132:0x043f  */
    /* JADX WARN: Code duplicated, block: B:133:0x0443  */
    /* JADX WARN: Code duplicated, block: B:136:0x0451  */
    /* JADX WARN: Code duplicated, block: B:137:0x0455  */
    /* JADX WARN: Code duplicated, block: B:140:0x0466  */
    /* JADX WARN: Code duplicated, block: B:141:0x046a  */
    /* JADX WARN: Code duplicated, block: B:144:0x0478  */
    /* JADX WARN: Code duplicated, block: B:147:0x04b5  */
    /* JADX WARN: Code duplicated, block: B:165:0x04d2 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x0103 A[PHI: r19 r23
      0x0103: PHI (r19v5 java.lang.Integer) = (r19v3 java.lang.Integer), (r19v3 java.lang.Integer), (r19v3 java.lang.Integer), (r19v6 java.lang.Integer) binds: [B:24:0x0101, B:22:0x00f9, B:18:0x00d7, B:12:0x00ae] A[DONT_GENERATE, DONT_INLINE]
      0x0103: PHI (r23v3 java.lang.Integer) = (r23v1 java.lang.Integer), (r23v1 java.lang.Integer), (r23v1 java.lang.Integer), (r23v4 java.lang.Integer) binds: [B:24:0x0101, B:22:0x00f9, B:18:0x00d7, B:12:0x00ae] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:27:0x010c  */
    /* JADX WARN: Code duplicated, block: B:29:0x0123  */
    /* JADX WARN: Code duplicated, block: B:31:0x0133  */
    /* JADX WARN: Code duplicated, block: B:33:0x0140  */
    /* JADX WARN: Code duplicated, block: B:82:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:84:0x0302  */
    /* JADX WARN: Code duplicated, block: B:99:0x0352  */
    /* JADX WARN: Instruction removed from duplicated block: B:106:0x0395, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:115:0x03ce, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:124:0x0408, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:27:0x010c, please report this as an issue */
    public final void d() {
        Integer num;
        Integer num2;
        FlexboxLayout.LayoutParams layoutParams;
        String str;
        int i11;
        TextView textView;
        TextView textView2;
        TextView textView3;
        int i12;
        String str2;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int iU;
        float fZ;
        int iU2;
        float fZ2;
        int iU3;
        float fZ3;
        String word;
        TextView textView4;
        int i18;
        int i19;
        int iU4;
        float fZ4;
        Integer num3 = 51;
        Integer num4 = 55;
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        boolean zD = l.D(new Integer[]{num3, num4}, Integer.valueOf(x.n().keyLanguage));
        int i21 = 1;
        boolean z11 = false;
        ViewGroup viewGroup = this.f59267c;
        if (zD) {
            viewGroup.setLayoutDirection(1);
        } else {
            viewGroup.setLayoutDirection(0);
        }
        viewGroup.removeAllViews();
        List list = this.f59266b;
        int size = list.size();
        int i22 = 0;
        while (i22 < size) {
            Word word2 = (Word) list.get(i22);
            Context context = this.f59265a;
            View viewInflate = LayoutInflater.from(context).inflate(R.layout.item_word_framlayout, viewGroup, z11);
            m.d(viewInflate, "null cannot be cast to non-null type android.widget.FrameLayout");
            View view = (FrameLayout) viewInflate;
            int i23 = i21;
            boolean z12 = z11;
            Integer num5 = 2;
            int i24 = size;
            Integer[] numArr = {Integer.valueOf(i23), 12};
            LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
            ViewGroup viewGroup2 = viewGroup;
            if (l.D(numArr, Integer.valueOf(x.n().keyLanguage))) {
                num = num3;
                num2 = num4;
                if (x.n().jsDisPlay == 2) {
                    textView4 = new TextView(context);
                    i18 = this.f59269e;
                    if (i18 != 0) {
                        m.f(context, "context");
                        iU4 = h.u("sp_" + i18);
                        if (iU4 != 0) {
                            LingoSkillApplication lingoSkillApplication3 = LingoSkillApplication.f21665b;
                            m.c(lingoSkillApplication3);
                            fZ4 = lingoSkillApplication3.getResources().getDimension(iU4);
                        } else {
                            fZ4 = j3.Z(Integer.valueOf(i18), context);
                        }
                        i19 = z12 ? 1 : 0;
                        textView4.setTextSize(i19 == true ? 1 : 0, fZ4);
                    } else {
                        i19 = z12 ? 1 : 0;
                        h.L(context, textView4, 20);
                    }
                    textView4.setText(" ");
                    textView4.measure(i19, i19);
                    Integer numValueOf = Integer.valueOf(textView4.getMeasuredWidth());
                    m.f(context, "context");
                    this.f59274j = (int) (numValueOf.floatValue() / context.getResources().getDisplayMetrics().density);
                }
                layoutParams = new FlexboxLayout.LayoutParams(-2, -2);
                int i25 = i22 + 1;
                int i26 = i22;
                if ((word2.getWordType() != i23 && !m.a(word2.getWord(), "_____")) || i25 >= list.size() || ((Word) list.get(i25)).getWordType() != 1 || m.a(((Word) list.get(i25)).getWord(), "_____") || m.a(((Word) list.get(i25)).getWord(), " ") || (l.D(new Integer[]{5, 15, 53, 54}, Integer.valueOf(x.n().keyLanguage)) && o.L(":", nuRcCS.SnBn, "?", "!", "(", "{", "«", "»", "/").contains(((Word) list.get(i25)).getWord()))) {
                    int iL = h.l(this.f59274j);
                    if (m.a(word2.getWord(), "\"")) {
                        int i27 = this.f59282s + 1;
                        this.f59282s = i27;
                        if (i27 % 2 != 0) {
                            iL = 0;
                        }
                    }
                    String word3 = word2.getWord();
                    m.e(word3, "getWord(...)");
                    int i28 = iL;
                    str = "sp_";
                    if (!oz.x.k0(word3, "'", false) || m.a(word2.getWord(), "po'")) {
                        if (l.D(new Integer[]{5, 15, 53, 54}, Integer.valueOf(x.n().keyLanguage))) {
                            if (word2.getWordType() != 1 || i25 >= list.size() || ((Word) list.get(i25)).getWordType() != 1 || m.a(((Word) list.get(i25)).getWord(), "_____")) {
                                String word4 = word2.getWord();
                                m.e(word4, "getWord(...)");
                                if (word4.length() > 0) {
                                    List listL = o.L("'", "-", "(", EHjhWcesDUIsIw.KkLJLpyyma);
                                    String word5 = word2.getWord();
                                    m.e(word5, "getWord(...)");
                                    String strSubstring = word5.substring(word2.getWord().length() - 1, word2.getWord().length());
                                    m.e(strSubstring, "substring(...)");
                                    if (!listL.contains(strSubstring)) {
                                        if (i25 < list.size()) {
                                            word = ((Word) list.get(i25)).getWord();
                                            m.e(word, "getWord(...)");
                                            if (oz.x.s0(word, "-", false)) {
                                            }
                                        }
                                        i11 = i28;
                                    }
                                } else {
                                    if (i25 < list.size()) {
                                        word = ((Word) list.get(i25)).getWord();
                                        m.e(word, "getWord(...)");
                                        if (oz.x.s0(word, "-", false)) {
                                        }
                                    }
                                    i11 = i28;
                                }
                            } else if (o.L(":", ";", "?", "!", "(", "{", "«", "»", "/").contains(((Word) list.get(i25)).getWord())) {
                                i11 = i28;
                            }
                        } else if (!m.a(word2.getWord(), "¿") && !m.a(word2.getWord(), "¡") && (x.n().keyLanguage != 11 || (word2.getWordId() != 216 && word2.getWordId() != 217))) {
                            i11 = i28;
                        }
                    }
                    if (viewGroup2.getLayoutDirection() == 1) {
                        ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = i11;
                    } else {
                        ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = i11;
                    }
                    view.setLayoutParams(layoutParams);
                    View viewFindViewById = view.findViewById(R.id.tv_top);
                    m.e(viewFindViewById, "findViewById(...)");
                    textView = (TextView) viewFindViewById;
                    View viewFindViewById2 = view.findViewById(R.id.tv_middle);
                    m.e(viewFindViewById2, "findViewById(...)");
                    textView2 = (TextView) viewFindViewById2;
                    View viewFindViewById3 = view.findViewById(R.id.tv_bottom);
                    m.e(viewFindViewById3, "findViewById(...)");
                    textView3 = (TextView) viewFindViewById3;
                    textView3.setVisibility(8);
                    textView.setVisibility(8);
                    i12 = this.f59268d;
                    if (i12 != 0) {
                        m.f(context, "context");
                        str2 = str;
                        iU3 = h.u(str2 + i12);
                        if (iU3 != 0) {
                            LingoSkillApplication lingoSkillApplication4 = LingoSkillApplication.f21665b;
                            m.c(lingoSkillApplication4);
                            fZ3 = lingoSkillApplication4.getResources().getDimension(iU3);
                        } else {
                            fZ3 = j3.Z(Integer.valueOf(i12), context);
                        }
                        textView.setTextSize(0, fZ3);
                    } else {
                        str2 = str;
                    }
                    i13 = this.f59269e;
                    if (i13 != 0) {
                        m.f(context, "context");
                        iU2 = h.u(str2 + i13);
                        if (iU2 != 0) {
                            LingoSkillApplication lingoSkillApplication5 = LingoSkillApplication.f21665b;
                            m.c(lingoSkillApplication5);
                            fZ2 = lingoSkillApplication5.getResources().getDimension(iU2);
                        } else {
                            fZ2 = j3.Z(Integer.valueOf(i13), context);
                        }
                        textView2.setTextSize(0, fZ2);
                    } else {
                        h.L(context, textView2, 20);
                    }
                    i14 = this.f59270f;
                    if (i14 != 0) {
                        m.f(context, "context");
                        iU = h.u(str2 + i14);
                        if (iU != 0) {
                            LingoSkillApplication lingoSkillApplication6 = LingoSkillApplication.f21665b;
                            m.c(lingoSkillApplication6);
                            fZ = lingoSkillApplication6.getResources().getDimension(iU);
                        } else {
                            fZ = j3.Z(Integer.valueOf(i14), context);
                        }
                        textView3.setTextSize(0, fZ);
                    }
                    i15 = this.f59271g;
                    if (i15 != 0) {
                        textView.setTextColor(i15);
                    } else {
                        m.f(context, "context");
                        textView.setTextColor(context.getColor(R.color.second_black));
                    }
                    i16 = this.f59272h;
                    if (i16 != 0) {
                        textView2.setTextColor(i16);
                    } else {
                        m.f(context, "context");
                        textView2.setTextColor(context.getColor(R.color.primary_black));
                    }
                    i17 = this.f59273i;
                    if (i17 != 0) {
                        textView3.setTextColor(i17);
                    } else {
                        m.f(context, "context");
                        textView3.setTextColor(context.getColor(R.color.second_black));
                    }
                    if (this.f59281r) {
                        textView.setShadowLayer(3.0f, 1.0f, 1.0f, this.f59280q);
                        textView2.setShadowLayer(3.0f, 1.0f, 1.0f, this.f59280q);
                        textView3.setShadowLayer(3.0f, 1.0f, 1.0f, this.f59280q);
                    }
                    h(word2, textView, textView2, textView3);
                    f(i26, textView2, textView2.getText().toString());
                    num3 = num;
                    num4 = num2;
                    if (!l.D(new Integer[]{num3, num4}, Integer.valueOf(x.n().keyLanguage)) && textView2.getPaddingTop() == 0) {
                        Integer num6 = num5;
                        textView2.setPadding(textView2.getPaddingLeft(), (int) j3.Z(num6, context), textView2.getPaddingRight(), (int) j3.Z(num6, context));
                    }
                    view.setTag(word2);
                    viewGroup2.addView(view);
                    viewGroup = viewGroup2;
                    i22 = i25;
                    size = i24;
                    i21 = 1;
                    z11 = false;
                }
                i11 = 0;
                if (viewGroup2.getLayoutDirection() == 1) {
                    ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = i11;
                } else {
                    ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = i11;
                }
                view.setLayoutParams(layoutParams);
                View viewFindViewById4 = view.findViewById(R.id.tv_top);
                m.e(viewFindViewById4, "findViewById(...)");
                textView = (TextView) viewFindViewById4;
                View viewFindViewById5 = view.findViewById(R.id.tv_middle);
                m.e(viewFindViewById5, "findViewById(...)");
                textView2 = (TextView) viewFindViewById5;
                View viewFindViewById6 = view.findViewById(R.id.tv_bottom);
                m.e(viewFindViewById6, "findViewById(...)");
                textView3 = (TextView) viewFindViewById6;
                textView3.setVisibility(8);
                textView.setVisibility(8);
                i12 = this.f59268d;
                if (i12 != 0) {
                    m.f(context, "context");
                    str2 = str;
                    iU3 = h.u(str2 + i12);
                    if (iU3 != 0) {
                        LingoSkillApplication lingoSkillApplication7 = LingoSkillApplication.f21665b;
                        m.c(lingoSkillApplication7);
                        fZ3 = lingoSkillApplication7.getResources().getDimension(iU3);
                    } else {
                        fZ3 = j3.Z(Integer.valueOf(i12), context);
                    }
                    textView.setTextSize(0, fZ3);
                } else {
                    str2 = str;
                }
                i13 = this.f59269e;
                if (i13 != 0) {
                    m.f(context, "context");
                    iU2 = h.u(str2 + i13);
                    if (iU2 != 0) {
                        LingoSkillApplication lingoSkillApplication8 = LingoSkillApplication.f21665b;
                        m.c(lingoSkillApplication8);
                        fZ2 = lingoSkillApplication8.getResources().getDimension(iU2);
                    } else {
                        fZ2 = j3.Z(Integer.valueOf(i13), context);
                    }
                    textView2.setTextSize(0, fZ2);
                } else {
                    h.L(context, textView2, 20);
                }
                i14 = this.f59270f;
                if (i14 != 0) {
                    m.f(context, "context");
                    iU = h.u(str2 + i14);
                    if (iU != 0) {
                        LingoSkillApplication lingoSkillApplication9 = LingoSkillApplication.f21665b;
                        m.c(lingoSkillApplication9);
                        fZ = lingoSkillApplication9.getResources().getDimension(iU);
                    } else {
                        fZ = j3.Z(Integer.valueOf(i14), context);
                    }
                    textView3.setTextSize(0, fZ);
                }
                i15 = this.f59271g;
                if (i15 != 0) {
                    textView.setTextColor(i15);
                } else {
                    m.f(context, "context");
                    textView.setTextColor(context.getColor(R.color.second_black));
                }
                i16 = this.f59272h;
                if (i16 != 0) {
                    textView2.setTextColor(i16);
                } else {
                    m.f(context, "context");
                    textView2.setTextColor(context.getColor(R.color.primary_black));
                }
                i17 = this.f59273i;
                if (i17 != 0) {
                    textView3.setTextColor(i17);
                } else {
                    m.f(context, "context");
                    textView3.setTextColor(context.getColor(R.color.second_black));
                }
                if (this.f59281r) {
                    textView.setShadowLayer(3.0f, 1.0f, 1.0f, this.f59280q);
                    textView2.setShadowLayer(3.0f, 1.0f, 1.0f, this.f59280q);
                    textView3.setShadowLayer(3.0f, 1.0f, 1.0f, this.f59280q);
                }
                h(word2, textView, textView2, textView3);
                f(i26, textView2, textView2.getText().toString());
                num3 = num;
                num4 = num2;
                if (!l.D(new Integer[]{num3, num4}, Integer.valueOf(x.n().keyLanguage))) {
                }
                view.setTag(word2);
                viewGroup2.addView(view);
                viewGroup = viewGroup2;
                i22 = i25;
                size = i24;
                i21 = 1;
                z11 = false;
            } else {
                num = num3;
                num2 = num4;
            }
            if ((l.D(new Integer[]{Integer.valueOf(z12 ? 1 : 0), 11}, Integer.valueOf(x.n().keyLanguage)) && x.n().csDisplay == 0) || (l.D(new Integer[]{num5, 13}, Integer.valueOf(x.n().keyLanguage)) && x.n().koDisPlay == 0)) {
                textView4 = new TextView(context);
                i18 = this.f59269e;
                if (i18 != 0) {
                    m.f(context, "context");
                    iU4 = h.u("sp_" + i18);
                    if (iU4 != 0) {
                        LingoSkillApplication lingoSkillApplication10 = LingoSkillApplication.f21665b;
                        m.c(lingoSkillApplication10);
                        fZ4 = lingoSkillApplication10.getResources().getDimension(iU4);
                    } else {
                        fZ4 = j3.Z(Integer.valueOf(i18), context);
                    }
                    i19 = z12 ? 1 : 0;
                    textView4.setTextSize(i19 == true ? 1 : 0, fZ4);
                } else {
                    i19 = z12 ? 1 : 0;
                    h.L(context, textView4, 20);
                }
                textView4.setText(" ");
                textView4.measure(i19, i19);
                Integer numValueOf2 = Integer.valueOf(textView4.getMeasuredWidth());
                m.f(context, "context");
                this.f59274j = (int) (numValueOf2.floatValue() / context.getResources().getDisplayMetrics().density);
            } else {
                int[] iArr = r.f4959a;
                if (bq.m.F()) {
                    num5 = num5;
                } else {
                    textView4 = new TextView(context);
                    i18 = this.f59269e;
                    if (i18 != 0) {
                        m.f(context, "context");
                        iU4 = h.u("sp_" + i18);
                        if (iU4 != 0) {
                            LingoSkillApplication lingoSkillApplication11 = LingoSkillApplication.f21665b;
                            m.c(lingoSkillApplication11);
                            fZ4 = lingoSkillApplication11.getResources().getDimension(iU4);
                        } else {
                            fZ4 = j3.Z(Integer.valueOf(i18), context);
                        }
                        i19 = z12 ? 1 : 0;
                        textView4.setTextSize(i19 == true ? 1 : 0, fZ4);
                    } else {
                        i19 = z12 ? 1 : 0;
                        h.L(context, textView4, 20);
                    }
                    textView4.setText(" ");
                    textView4.measure(i19, i19);
                    Integer numValueOf3 = Integer.valueOf(textView4.getMeasuredWidth());
                    m.f(context, "context");
                    this.f59274j = (int) (numValueOf3.floatValue() / context.getResources().getDisplayMetrics().density);
                }
            }
            layoutParams = new FlexboxLayout.LayoutParams(-2, -2);
            int i29 = i22 + 1;
            int i210 = i22;
            str = word2.getWordType() != i23 ? "sp_" : "sp_";
            i11 = 0;
            if (viewGroup2.getLayoutDirection() == 1) {
                ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = i11;
            } else {
                ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = i11;
            }
            view.setLayoutParams(layoutParams);
            View viewFindViewById7 = view.findViewById(R.id.tv_top);
            m.e(viewFindViewById7, "findViewById(...)");
            textView = (TextView) viewFindViewById7;
            View viewFindViewById8 = view.findViewById(R.id.tv_middle);
            m.e(viewFindViewById8, "findViewById(...)");
            textView2 = (TextView) viewFindViewById8;
            View viewFindViewById9 = view.findViewById(R.id.tv_bottom);
            m.e(viewFindViewById9, "findViewById(...)");
            textView3 = (TextView) viewFindViewById9;
            textView3.setVisibility(8);
            textView.setVisibility(8);
            i12 = this.f59268d;
            if (i12 != 0) {
                m.f(context, "context");
                str2 = str;
                iU3 = h.u(str2 + i12);
                if (iU3 != 0) {
                    LingoSkillApplication lingoSkillApplication12 = LingoSkillApplication.f21665b;
                    m.c(lingoSkillApplication12);
                    fZ3 = lingoSkillApplication12.getResources().getDimension(iU3);
                } else {
                    fZ3 = j3.Z(Integer.valueOf(i12), context);
                }
                textView.setTextSize(0, fZ3);
            } else {
                str2 = str;
            }
            i13 = this.f59269e;
            if (i13 != 0) {
                m.f(context, "context");
                iU2 = h.u(str2 + i13);
                if (iU2 != 0) {
                    LingoSkillApplication lingoSkillApplication13 = LingoSkillApplication.f21665b;
                    m.c(lingoSkillApplication13);
                    fZ2 = lingoSkillApplication13.getResources().getDimension(iU2);
                } else {
                    fZ2 = j3.Z(Integer.valueOf(i13), context);
                }
                textView2.setTextSize(0, fZ2);
            } else {
                h.L(context, textView2, 20);
            }
            i14 = this.f59270f;
            if (i14 != 0) {
                m.f(context, "context");
                iU = h.u(str2 + i14);
                if (iU != 0) {
                    LingoSkillApplication lingoSkillApplication14 = LingoSkillApplication.f21665b;
                    m.c(lingoSkillApplication14);
                    fZ = lingoSkillApplication14.getResources().getDimension(iU);
                } else {
                    fZ = j3.Z(Integer.valueOf(i14), context);
                }
                textView3.setTextSize(0, fZ);
            }
            i15 = this.f59271g;
            if (i15 != 0) {
                textView.setTextColor(i15);
            } else {
                m.f(context, "context");
                textView.setTextColor(context.getColor(R.color.second_black));
            }
            i16 = this.f59272h;
            if (i16 != 0) {
                textView2.setTextColor(i16);
            } else {
                m.f(context, "context");
                textView2.setTextColor(context.getColor(R.color.primary_black));
            }
            i17 = this.f59273i;
            if (i17 != 0) {
                textView3.setTextColor(i17);
            } else {
                m.f(context, "context");
                textView3.setTextColor(context.getColor(R.color.second_black));
            }
            if (this.f59281r) {
                textView.setShadowLayer(3.0f, 1.0f, 1.0f, this.f59280q);
                textView2.setShadowLayer(3.0f, 1.0f, 1.0f, this.f59280q);
                textView3.setShadowLayer(3.0f, 1.0f, 1.0f, this.f59280q);
            }
            h(word2, textView, textView2, textView3);
            f(i210, textView2, textView2.getText().toString());
            num3 = num;
            num4 = num2;
            if (!l.D(new Integer[]{num3, num4}, Integer.valueOf(x.n().keyLanguage))) {
            }
            view.setTag(word2);
            viewGroup2.addView(view);
            viewGroup = viewGroup2;
            i22 = i29;
            size = i24;
            i21 = 1;
            z11 = false;
        }
        ViewGroup viewGroup3 = viewGroup;
        int childCount = viewGroup3.getChildCount();
        for (int i30 = 0; i30 < childCount; i30++) {
            View childAt = viewGroup3.getChildAt(i30);
            m.d(childAt, "null cannot be cast to non-null type android.widget.FrameLayout");
            FrameLayout frameLayout = (FrameLayout) childAt;
            Object tag = frameLayout.getTag();
            m.d(tag, "null cannot be cast to non-null type com.lingo.lingoskill.object.Word");
            Word word6 = (Word) tag;
            if (this.f59277n) {
                frameLayout.setClickable(false);
            } else {
                g(frameLayout, word6);
                if (word6.getWordType() != 1) {
                    z.b(frameLayout, new a1(this, i30, word6, frameLayout));
                }
            }
        }
        a();
    }

    public final void e() {
        ArrayList arrayList = new ArrayList();
        FlexboxLayout flexboxLayout = this.f59267c;
        int childCount = flexboxLayout.getChildCount();
        int i11 = 0;
        int i12 = 0;
        while (i11 < childCount) {
            View childAt = flexboxLayout.getChildAt(i11);
            m.e(childAt, "getChildAt(...)");
            if (childAt instanceof FrameLayout) {
                View childAt2 = flexboxLayout.getChildAt(i11);
                m.d(childAt2, OCBJEWZHh.pBHunT);
                FrameLayout frameLayout = (FrameLayout) childAt2;
                int i13 = i11 - i12;
                Object tag = frameLayout.getTag();
                m.d(tag, "null cannot be cast to non-null type com.lingo.lingoskill.object.Word");
                Word word = (Word) tag;
                View viewFindViewById = frameLayout.findViewById(R.id.tv_top);
                m.e(viewFindViewById, "findViewById(...)");
                TextView textView = (TextView) viewFindViewById;
                View viewFindViewById2 = frameLayout.findViewById(R.id.tv_middle);
                m.e(viewFindViewById2, "findViewById(...)");
                TextView textView2 = (TextView) viewFindViewById2;
                View viewFindViewById3 = frameLayout.findViewById(R.id.tv_bottom);
                m.e(viewFindViewById3, "findViewById(...)");
                TextView textView3 = (TextView) viewFindViewById3;
                int i14 = this.f59271g;
                Context context = this.f59265a;
                if (i14 != 0) {
                    textView.setTextColor(i14);
                } else {
                    m.f(context, "context");
                    textView.setTextColor(context.getColor(R.color.second_black));
                }
                int i15 = this.f59272h;
                if (i15 != 0) {
                    textView2.setTextColor(i15);
                } else {
                    m.f(context, "context");
                    textView2.setTextColor(context.getColor(R.color.primary_black));
                }
                int i16 = this.f59273i;
                if (i16 != 0) {
                    textView3.setTextColor(i16);
                } else {
                    m.f(context, "context");
                    textView3.setTextColor(context.getColor(R.color.second_black));
                }
                textView3.setVisibility(8);
                textView.setVisibility(8);
                h(word, textView, textView2, textView3);
                f(i13, textView2, textView2.getText().toString());
                if (frameLayout.getTag(R.id.tag_punch) != null) {
                    Object tag2 = frameLayout.getTag(R.id.tag_punch);
                    m.d(tag2, "null cannot be cast to non-null type com.lingo.lingoskill.object.Word");
                    CharSequence text = textView2.getText();
                    textView2.setText(((Object) text) + ((Word) tag2).getWord());
                }
                arrayList.add(frameLayout);
                Object tag3 = frameLayout.getTag();
                m.d(tag3, "null cannot be cast to non-null type com.lingo.lingoskill.object.Word");
                g(frameLayout, (Word) tag3);
            } else {
                flexboxLayout = flexboxLayout;
                i12++;
            }
            i11++;
            flexboxLayout = flexboxLayout;
        }
        a();
    }

    public b(Context context, String str, List words, FlexboxLayout flexboxLayout) {
        m.f(context, "context");
        m.f(words, "words");
        this.f59274j = 8;
        this.f59276l = -1;
        this.f59278o = true;
        this.f59265a = context;
        this.f59279p = str;
        this.f59266b = words;
        this.f59267c = flexboxLayout;
    }
}
