package qp;

import android.animation.LayoutTransition;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.media3.ui.PlayerView;
import com.google.android.flexbox.FlexboxLayout;
import com.google.logging.type.LogSeverity;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.object.Sentence;
import com.lingo.lingoskill.object.Word;
import com.lingo.lingoskill.unity.exception.NoSuchElemException;
import com.lingodeer.R;
import com.lingodeer.data.env.Env;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import mt.f5;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class p3 extends d {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public f7.a0 f48115i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Sentence f48116j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ObjectAnimator f48117k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public hh.s f48118l;
    public final ArrayList m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ArrayList f48119n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ArrayList f48120o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ArrayList f48121p;

    public p3(mp.b bVar, long j11) {
        super(bVar, j11);
        this.m = new ArrayList();
        this.f48119n = new ArrayList();
        this.f48120o = new ArrayList();
        this.f48121p = new ArrayList();
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0150  */
    /* JADX WARN: Code duplicated, block: B:35:0x016f  */
    /* JADX WARN: Code duplicated, block: B:54:0x01ce A[Catch: Exception -> 0x01d6, TRY_LEAVE, TryCatch #0 {Exception -> 0x01d6, blocks: (B:52:0x01a4, B:54:0x01ce), top: B:83:0x01a4 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x01db  */
    /* JADX WARN: Code duplicated, block: B:60:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:66:0x01f6  */
    @Override // hi.a
    public final boolean a() {
        int i11;
        boolean z11;
        String str;
        int i12;
        String str2;
        String lowerCase;
        String lowerCase2;
        ta.a aVar = this.f47886f;
        kotlin.jvm.internal.m.c(aVar);
        ta.a aVar2 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar2);
        int i13 = 0;
        if (((hj.i2) aVar2).f32689c.getText() == null) {
            return false;
        }
        ta.a aVar3 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar3);
        String string = ((hj.i2) aVar3).f32689c.getText().toString();
        ArrayList arrayList = this.f48121p;
        int size = arrayList.size();
        int i14 = 0;
        String strQ0 = BuildConfig.VERSION_NAME;
        while (i14 < size) {
            Object obj = arrayList.get(i14);
            i14++;
            Word word = (Word) obj;
            if (word.getWordType() != 1) {
                strQ0 = defpackage.e.m(strQ0, fr.j3.B(word));
            }
        }
        ta.a aVar4 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar4);
        ((hj.i2) aVar4).f32688b.setVisibility(4);
        ta.a aVar5 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar5);
        ((hj.i2) aVar5).f32688b.setClickable(false);
        ta.a aVar6 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar6);
        ((hj.i2) aVar6).f32690d.setVisibility(8);
        ta.a aVar7 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar7);
        ((hj.i2) aVar7).f32694h.setVisibility(8);
        ta.a aVar8 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar8);
        ((hj.i2) aVar8).f32689c.setFocusable(false);
        ta.a aVar9 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar9);
        ((hj.i2) aVar9).f32689c.setClickable(false);
        ArrayList arrayList2 = new ArrayList();
        String strN = hh.p0.n("getDefault(...)", string, "toLowerCase(...)");
        Locale locale = Locale.getDefault();
        kotlin.jvm.internal.m.e(locale, "getDefault(...)");
        String lowerCase3 = strQ0.toLowerCase(locale);
        kotlin.jvm.internal.m.e(lowerCase3, "toLowerCase(...)");
        boolean zEquals = strN.equals(lowerCase3);
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        if ((cf.x.n().keyLanguage == 2 || cf.x.n().keyLanguage == 13) && cf.x.n().ignoreSpace) {
            Locale locale2 = Locale.getDefault();
            kotlin.jvm.internal.m.e(locale2, "getDefault(...)");
            String lowerCase4 = string.toLowerCase(locale2);
            kotlin.jvm.internal.m.e(lowerCase4, "toLowerCase(...)");
            String strQ1 = oz.x.q0(lowerCase4, " ", BuildConfig.VERSION_NAME);
            Locale locale3 = Locale.getDefault();
            kotlin.jvm.internal.m.e(locale3, "getDefault(...)");
            String lowerCase5 = strQ0.toLowerCase(locale3);
            kotlin.jvm.internal.m.e(lowerCase5, "toLowerCase(...)");
            zEquals = strQ1.equals(oz.x.q0(lowerCase5, " ", BuildConfig.VERSION_NAME));
        }
        boolean z12 = zEquals;
        String str3 = "́";
        int i15 = 22;
        int i16 = 10;
        if (!z12 && (cf.x.n().keyLanguage == 10 || cf.x.n().keyLanguage == 22)) {
            strQ0 = oz.x.q0(strQ0, "́", BuildConfig.VERSION_NAME);
        }
        int length = strQ0.length();
        int i17 = 0;
        while (i13 < length) {
            String str4 = String.valueOf(strQ0.charAt(i13));
            if (kotlin.jvm.internal.m.a(str4, str3)) {
                LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
                if (cf.x.n().keyLanguage == i16 || cf.x.n().keyLanguage == i15) {
                    i17++;
                    i11 = length;
                    str2 = strQ0;
                    z11 = z12;
                    str = str3;
                } else {
                    i11 = length;
                    z11 = z12;
                    str = str3;
                    i12 = i17;
                    str2 = strQ0;
                    if (i13 < string.length() + i17) {
                        kotlin.jvm.internal.m.f(str4, "str");
                        if ((Pattern.matches("\\p{Punct}", str4) && !str4.equals("...") && !str4.equals(" ") && !str4.equals("～")) || str4.equals("-") || str4.equals("'") || str4.equals(" ") || str4.equals("_")) {
                            try {
                                String strValueOf = String.valueOf(string.charAt(i13 - i12));
                                Locale locale4 = Locale.getDefault();
                                kotlin.jvm.internal.m.e(locale4, "getDefault(...)");
                                lowerCase = str4.toLowerCase(locale4);
                                kotlin.jvm.internal.m.e(lowerCase, "toLowerCase(...)");
                                Locale locale5 = Locale.getDefault();
                                kotlin.jvm.internal.m.e(locale5, "getDefault(...)");
                                lowerCase2 = strValueOf.toLowerCase(locale5);
                                kotlin.jvm.internal.m.e(lowerCase2, "toLowerCase(...)");
                                if (!lowerCase.equals(lowerCase2)) {
                                    arrayList2.add(Integer.valueOf(i13));
                                }
                            } catch (Exception e8) {
                                e8.printStackTrace();
                            }
                        } else {
                            kotlin.jvm.internal.m.f(str4, "str");
                            if ((Pattern.matches("\\p{Punct}", str4) && !str4.equals("...") && !str4.equals(" ") && !str4.equals("～")) || str4.equals("-") || str4.equals("'") || str4.equals(" ") || str4.equals("_")) {
                                arrayList2.add(Integer.valueOf(i13));
                            }
                        }
                        i17 = i12;
                    } else {
                        kotlin.jvm.internal.m.f(str4, "str");
                        i17 = Pattern.matches("\\p{Punct}", str4) ? i12 + 1 : i12 + 1;
                    }
                }
            } else {
                i11 = length;
                z11 = z12;
                str = str3;
                i12 = i17;
                str2 = strQ0;
                if (i13 < string.length() + i17) {
                    kotlin.jvm.internal.m.f(str4, "str");
                    if (Pattern.matches("\\p{Punct}", str4)) {
                        kotlin.jvm.internal.m.f(str4, "str");
                        if (Pattern.matches("\\p{Punct}", str4)) {
                        }
                    } else {
                        kotlin.jvm.internal.m.f(str4, "str");
                        if (Pattern.matches("\\p{Punct}", str4)) {
                        }
                    }
                    String strValueOf2 = String.valueOf(string.charAt(i13 - i12));
                    Locale locale6 = Locale.getDefault();
                    kotlin.jvm.internal.m.e(locale6, "getDefault(...)");
                    lowerCase = str4.toLowerCase(locale6);
                    kotlin.jvm.internal.m.e(lowerCase, "toLowerCase(...)");
                    Locale locale7 = Locale.getDefault();
                    kotlin.jvm.internal.m.e(locale7, "getDefault(...)");
                    lowerCase2 = strValueOf2.toLowerCase(locale7);
                    kotlin.jvm.internal.m.e(lowerCase2, "toLowerCase(...)");
                    if (!lowerCase.equals(lowerCase2)) {
                        arrayList2.add(Integer.valueOf(i13));
                    }
                    i17 = i12;
                } else {
                    kotlin.jvm.internal.m.f(str4, "str");
                    if (Pattern.matches("\\p{Punct}", str4)) {
                    }
                }
            }
            i13++;
            length = i11;
            z12 = z11;
            str3 = str;
            strQ0 = str2;
            i15 = 22;
            i16 = 10;
        }
        String str5 = strQ0;
        boolean z13 = z12;
        Context context = this.f47883c;
        if (z13) {
            ta.a aVar10 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar10);
            ((hj.i2) aVar10).f32689c.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, context.getDrawable(R.drawable.line_correct));
            ta.a aVar11 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar11);
            ((hj.i2) aVar11).f32689c.setTextColor(context.getColor(R.color.color_43CC93));
        } else {
            ta.a aVar12 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar12);
            ((hj.i2) aVar12).f32689c.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, context.getDrawable(R.drawable.line_wrong));
            ta.a aVar13 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar13);
            ((hj.i2) aVar13).f32689c.setTextColor(context.getColor(R.color.color_FF6666));
            mp.b bVar = this.f47881a;
            kotlin.jvm.internal.m.d(bVar, "null cannot be cast to non-null type com.lingo.lingoskill.ui.learn.BaseLessonTestFragment");
            ((jp.p0) bVar).f36528d0 = new m3(str5, this, arrayList2);
        }
        return z13;
    }

    @Override // hi.a
    public final String b() {
        qy.q qVar = fv.b.f28186a;
        Sentence sentence = this.f48116j;
        if (sentence != null) {
            return fv.b.G(sentence.getSentenceId(), null, null);
        }
        kotlin.jvm.internal.m.n("mModel");
        throw null;
    }

    @Override // hi.a
    public final String c() {
        return nv.p.m(this.f47882b, "1;", ";13");
    }

    @Override // qp.d, hi.a
    public final void f() {
        super.f();
        ta.a aVar = this.f47886f;
        kotlin.jvm.internal.m.c(aVar);
        ((hj.i2) aVar).f32689c.removeTextChangedListener(this.f48118l);
        ObjectAnimator objectAnimator = this.f48117k;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        ObjectAnimator objectAnimator2 = this.f48117k;
        if (objectAnimator2 != null) {
            objectAnimator2.removeAllListeners();
        }
        ta.a aVar2 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar2);
        y6.j0 player = ((PlayerView) ((hj.i2) aVar2).f32691e.f33677e).getPlayer();
        if (player != null) {
            player.release();
        }
    }

    @Override // hi.a
    public final List g() {
        ArrayList arrayList = new ArrayList();
        qy.q qVar = fv.b.f28186a;
        Sentence sentence = this.f48116j;
        if (sentence == null) {
            kotlin.jvm.internal.m.n("mModel");
            throw null;
        }
        String strH = fv.b.H(sentence.getSentenceId());
        Sentence sentence2 = this.f48116j;
        if (sentence2 == null) {
            kotlin.jvm.internal.m.n("mModel");
            throw null;
        }
        arrayList.add(new fv.a(2L, strH, fv.b.F(sentence2.getSentenceId())));
        Sentence sentence3 = this.f48116j;
        if (sentence3 == null) {
            kotlin.jvm.internal.m.n("mModel");
            throw null;
        }
        String strJ = fv.b.J(sentence3.getSentenceId());
        Sentence sentence4 = this.f48116j;
        if (sentence4 == null) {
            kotlin.jvm.internal.m.n("mModel");
            throw null;
        }
        arrayList.add(new fv.a(8L, strJ, fv.g.t(sentence4.getSentenceId())));
        if (!((jp.p0) this.f47881a).Q) {
            int[] iArr = bq.r.f4959a;
            if (bq.m.F()) {
                ArrayList arrayList2 = this.f48120o;
                int size = arrayList2.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList2.get(i11);
                    i11++;
                    Word word = (Word) obj;
                    if (word.getWordType() != 1 && !kotlin.jvm.internal.m.a(word.getWord(), " ") && !kotlin.jvm.internal.m.a(word.getWord(), "っ") && !kotlin.jvm.internal.m.a(word.getWord(), "ー") && !kotlin.jvm.internal.m.a(word.getWord(), "ッ")) {
                        qy.q qVar2 = fv.b.f28186a;
                        String luoma = word.getLuoma();
                        kotlin.jvm.internal.m.e(luoma, "getLuoma(...)");
                        String strK0 = fv.b.k0(luoma);
                        String luoma2 = word.getLuoma();
                        kotlin.jvm.internal.m.e(luoma2, "getLuoma(...)");
                        arrayList.add(new fv.a(1L, strK0, fv.b.j0(luoma2)));
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
        Sentence sentenceE = ij.c.e(this.f47882b);
        if (sentenceE == null) {
            throw new NoSuchElemException();
        }
        this.f48116j = sentenceE;
        this.f48120o.addAll(fr.j3.x(sentenceE));
        Sentence sentence = this.f48116j;
        if (sentence == null) {
            kotlin.jvm.internal.m.n("mModel");
            throw null;
        }
        this.f48121p.addAll(fr.j3.t(sentence));
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // hi.a
    public final void k() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new ArrayList());
        ArrayList arrayList3 = this.f48119n;
        int size = arrayList3.size();
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i14 < size) {
            Object obj = arrayList3.get(i14);
            i14++;
            FrameLayout frameLayout = (FrameLayout) obj;
            Object tag = frameLayout.getTag();
            kotlin.jvm.internal.m.d(tag, "null cannot be cast to non-null type com.lingo.lingoskill.object.Word");
            ((TextView) frameLayout.findViewById(R.id.tv_char)).setText(fr.j3.B((Word) tag));
            frameLayout.setLayoutParams(new FlexboxLayout.LayoutParams(-2, ff.h.s(R.dimen.sent_model_13_char_height)));
            frameLayout.measure(0, 0);
            int iL = ff.h.l(8.0f) + frameLayout.getMeasuredWidth() + i12;
            int iL2 = iL - ff.h.l(8.0f);
            ta.a aVar = this.f47886f;
            kotlin.jvm.internal.m.c(aVar);
            if (iL2 <= ((hj.i2) aVar).f32690d.getWidth()) {
                ((List) arrayList2.get(i13)).add(frameLayout);
                i12 = iL;
            } else {
                int iL3 = ff.h.l(8.0f) + frameLayout.getMeasuredWidth();
                i13++;
                arrayList2.add(new ArrayList());
                ((List) arrayList2.get(i13)).add(frameLayout);
                i12 = iL3;
            }
            arrayList.add(frameLayout);
        }
        arrayList3.clear();
        arrayList3.addAll(arrayList);
        ta.a aVar2 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar2);
        int childCount = ((hj.i2) aVar2).f32690d.getChildCount();
        for (int i15 = 0; i15 < childCount; i15++) {
            ta.a aVar3 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar3);
            View childAt = ((hj.i2) aVar3).f32690d.getChildAt(i15);
            kotlin.jvm.internal.m.d(childAt, "null cannot be cast to non-null type com.google.android.flexbox.FlexboxLayout");
            ((FlexboxLayout) childAt).removeAllViews();
        }
        ta.a aVar4 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar4);
        ((hj.i2) aVar4).f32690d.removeAllViews();
        int size2 = arrayList2.size();
        int i16 = 0;
        while (i16 < size2) {
            Object obj2 = arrayList2.get(i16);
            i16++;
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f47883c);
            ta.a aVar5 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar5);
            View viewInflate = layoutInflaterFrom.inflate(R.layout.include_flexbox_layout, (ViewGroup) ((hj.i2) aVar5).f32690d, false);
            kotlin.jvm.internal.m.d(viewInflate, "null cannot be cast to non-null type com.google.android.flexbox.FlexboxLayout");
            FlexboxLayout flexboxLayout = (FlexboxLayout) viewInflate;
            Iterator it = ((List) obj2).iterator();
            while (it.hasNext()) {
                flexboxLayout.addView((FrameLayout) it.next());
            }
            ta.a aVar6 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar6);
            ((hj.i2) aVar6).f32690d.addView(flexboxLayout);
            LayoutTransition layoutTransition = new LayoutTransition();
            layoutTransition.setAnimator(2, null);
            layoutTransition.setAnimator(3, null);
            flexboxLayout.setLayoutTransition(layoutTransition);
            ViewGroup.LayoutParams layoutParams = flexboxLayout.getLayoutParams();
            kotlin.jvm.internal.m.d(layoutParams, "null cannot be cast to non-null type com.google.android.flexbox.FlexboxLayout.LayoutParams");
            FlexboxLayout.LayoutParams layoutParams2 = (FlexboxLayout.LayoutParams) layoutParams;
            layoutParams2.L = true;
            flexboxLayout.setLayoutParams(layoutParams2);
        }
        r();
        ArrayList arrayList4 = this.m;
        int size3 = arrayList4.size();
        String strM = BuildConfig.VERSION_NAME;
        while (i11 < size3) {
            Object obj3 = arrayList4.get(i11);
            i11++;
            Object tag2 = ((FrameLayout) obj3).getTag();
            kotlin.jvm.internal.m.d(tag2, "null cannot be cast to non-null type com.lingo.lingoskill.object.Word");
            strM = defpackage.e.m(strM, fr.j3.B((Word) tag2));
        }
        ta.a aVar7 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar7);
        ((hj.i2) aVar7).f32689c.setText(strM);
        v();
    }

    @Override // qp.d
    public final fz.f n() {
        return n3.f48079a;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0276  */
    /* JADX WARN: Code duplicated, block: B:48:0x028e A[LOOP:4: B:47:0x028c->B:48:0x028e, LOOP_END] */
    @Override // qp.d
    public final void p() throws Throwable {
        ArrayList arrayList;
        ArrayList arrayList2;
        int size;
        int i11;
        int i12;
        int i13;
        int i14;
        ArrayList arrayList3;
        int size2;
        int i15;
        final int i16;
        Throwable th2;
        Throwable th3;
        int size3;
        int i17;
        int i18;
        ta.a aVar = this.f47886f;
        kotlin.jvm.internal.m.c(aVar);
        ViewGroup.LayoutParams layoutParams = ((PlayerView) ((hj.i2) aVar).f32691e.f33677e).getLayoutParams();
        final int i19 = 0;
        if (layoutParams != null) {
            layoutParams.width = 0;
            layoutParams.height = 0;
            ta.a aVar2 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar2);
            ((PlayerView) ((hj.i2) aVar2).f32691e.f33677e).setLayoutParams(layoutParams);
        }
        jp.p0 p0Var = (jp.p0) this.f47881a;
        p0Var.O(0);
        Context context = this.f47883c;
        kotlin.jvm.internal.m.d(context, "null cannot be cast to non-null type android.app.Activity");
        ((Activity) context).getWindow().setSoftInputMode(3);
        try {
            Method method = EditText.class.getMethod("setShowSoftInputOnFocus", Boolean.TYPE);
            kotlin.jvm.internal.m.e(method, "getMethod(...)");
            method.setAccessible(true);
            ta.a aVar3 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar3);
            method.invoke(((hj.i2) aVar3).f32689c, Boolean.FALSE);
            while (true) {
                i14 = R.id.tv_char;
                arrayList3 = this.f48119n;
                if (i13 >= size) {
                    break;
                }
                Object obj = arrayList2.get(i13);
                i13++;
                Word word = (Word) obj;
                LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
                ta.a aVar4 = this.f47886f;
                kotlin.jvm.internal.m.c(aVar4);
                View viewInflate = layoutInflaterFrom.inflate(R.layout.item_sentence_char, (ViewGroup) ((hj.i2) aVar4).f32690d, false);
                kotlin.jvm.internal.m.d(viewInflate, "null cannot be cast to non-null type android.widget.FrameLayout");
                FrameLayout frameLayout = (FrameLayout) viewInflate;
                TextView textView = (TextView) frameLayout.findViewById(R.id.tv_char);
                int[] iArr = bq.r.f4959a;
                kotlin.jvm.internal.m.c(textView);
                bq.m.J(textView);
                textView.setText(fr.j3.B(word));
                frameLayout.setTag(word);
                bq.z.b(frameLayout, new pr.a0(frameLayout, this, word, 8));
                frameLayout.setLayoutParams(new FlexboxLayout.LayoutParams(-2, ff.h.s(R.dimen.sent_model_13_char_height)));
                frameLayout.measure(0, 0);
                int iL = ff.h.l(8.0f) + frameLayout.getMeasuredWidth() + i11;
                int iL2 = iL - ff.h.l(8.0f);
                ta.a aVar5 = this.f47886f;
                kotlin.jvm.internal.m.c(aVar5);
                if (iL2 <= ((hj.i2) aVar5).f32690d.getWidth()) {
                    ((List) arrayList.get(i12)).add(frameLayout);
                    i11 = iL;
                } else {
                    int iL3 = ff.h.l(8.0f) + frameLayout.getMeasuredWidth();
                    i12++;
                    arrayList.add(new ArrayList());
                    ((List) arrayList.get(i12)).add(frameLayout);
                    i11 = iL3;
                }
                arrayList3.add(frameLayout);
            }
            while (true) {
                i16 = 2;
                th2 = null;
                if (i15 >= size2) {
                    break;
                }
                Object obj2 = arrayList.get(i15);
                i15++;
                LayoutInflater layoutInflaterFrom2 = LayoutInflater.from(context);
                ta.a aVar6 = this.f47886f;
                kotlin.jvm.internal.m.c(aVar6);
                View viewInflate2 = layoutInflaterFrom2.inflate(R.layout.include_flexbox_layout, (ViewGroup) ((hj.i2) aVar6).f32690d, false);
                kotlin.jvm.internal.m.d(viewInflate2, "null cannot be cast to non-null type com.google.android.flexbox.FlexboxLayout");
                FlexboxLayout flexboxLayout = (FlexboxLayout) viewInflate2;
                Iterator it = ((List) obj2).iterator();
                while (it.hasNext()) {
                    flexboxLayout.addView((FrameLayout) it.next());
                }
                ta.a aVar7 = this.f47886f;
                kotlin.jvm.internal.m.c(aVar7);
                ((hj.i2) aVar7).f32690d.addView(flexboxLayout);
                LayoutTransition layoutTransition = new LayoutTransition();
                layoutTransition.setAnimator(2, null);
                layoutTransition.setAnimator(3, null);
                flexboxLayout.setLayoutTransition(layoutTransition);
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        ta.a aVar8 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar8);
        ((hj.i2) aVar8).f32689c.setFocusable(true);
        ta.a aVar9 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar9);
        ((hj.i2) aVar9).f32689c.setFocusableInTouchMode(true);
        ta.a aVar10 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar10);
        ((hj.i2) aVar10).f32689c.requestFocus();
        v();
        if (p0Var.Q) {
            ta.a aVar11 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar11);
            ((hj.i2) aVar11).f32694h.setVisibility(8);
        } else {
            ta.a aVar12 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar12);
            ((hj.i2) aVar12).f32694h.setVisibility(0);
        }
        arrayList = new ArrayList();
        arrayList.add(new ArrayList());
        arrayList2 = this.f48120o;
        size = arrayList2.size();
        i11 = 0;
        i12 = 0;
        i13 = 0;
        size2 = arrayList.size();
        i15 = 0;
        this.f48118l = new hh.s(this, 6);
        ta.a aVar13 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar13);
        ((hj.i2) aVar13).f32689c.addTextChangedListener(this.f48118l);
        ta.a aVar14 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar14);
        FlexboxLayout flexboxLayout2 = ((hj.i2) aVar14).f32690d;
        final int i21 = 4;
        flexboxLayout2.postDelayed(new b2.c(4, flexboxLayout2, new lt.e(this, 23)), 0L);
        x();
        Env env = this.f47884d;
        if (env.examCharAudioSwitch && env.isAudioModel && !p0Var.Q) {
            int[] iArr2 = bq.r.f4959a;
            if (bq.m.F()) {
                ta.a aVar15 = this.f47886f;
                kotlin.jvm.internal.m.c(aVar15);
                ((hj.i2) aVar15).f32692f.setImageResource(R.drawable.ic_hint_audio);
                int size4 = arrayList3.size();
                int i22 = 0;
                while (i22 < size4) {
                    Object obj3 = arrayList3.get(i22);
                    i22++;
                    FrameLayout frameLayout2 = (FrameLayout) obj3;
                    TextView textView2 = (TextView) frameLayout2.findViewById(i14);
                    ImageView imageView = (ImageView) frameLayout2.findViewById(R.id.iv_hint_audio);
                    Throwable th4 = th2;
                    if (kotlin.jvm.internal.m.a(textView2.getText().toString(), " ")) {
                        imageView.setVisibility(8);
                    } else {
                        imageView.setVisibility(0);
                    }
                    th2 = th4;
                    i14 = R.id.tv_char;
                }
                th3 = th2;
            } else {
                th3 = null;
                ta.a aVar16 = this.f47886f;
                kotlin.jvm.internal.m.c(aVar16);
                ((hj.i2) aVar16).f32692f.setImageResource(R.drawable.ic_hint_audio_close);
                size3 = arrayList3.size();
                i17 = 0;
                while (i17 < size3) {
                    Object obj4 = arrayList3.get(i17);
                    i17++;
                    ((ImageView) ((FrameLayout) obj4).findViewById(R.id.iv_hint_audio)).setVisibility(8);
                }
            }
        } else {
            th3 = null;
            ta.a aVar17 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar17);
            ((hj.i2) aVar17).f32692f.setImageResource(R.drawable.ic_hint_audio_close);
            size3 = arrayList3.size();
            i17 = 0;
            while (i17 < size3) {
                Object obj5 = arrayList3.get(i17);
                i17++;
                ((ImageView) ((FrameLayout) obj5).findViewById(R.id.iv_hint_audio)).setVisibility(8);
            }
        }
        if (!env.isAudioModel || p0Var.Q) {
            ta.a aVar18 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar18);
            i18 = 8;
            ((hj.i2) aVar18).f32692f.setVisibility(8);
        } else {
            i18 = 8;
        }
        int[] iArr3 = bq.r.f4959a;
        if (!bq.m.F()) {
            ta.a aVar19 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar19);
            ((hj.i2) aVar19).f32692f.setVisibility(i18);
        }
        ef.e.B(o());
        float dimension = context.getResources().getDimension(R.dimen.video_margin_left_right);
        ta.a aVar20 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar20);
        bq.z.a((PlayerView) ((hj.i2) aVar20).f32691e.f33677e, 0L, new f5(this, dimension, 1));
        if (this.f48115i == null) {
            this.f48115i = new f7.n(context).a();
            ta.a aVar21 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar21);
            ((PlayerView) ((hj.i2) aVar21).f32691e.f33677e).setPlayer(this.f48115i);
            f7.a0 a0Var = this.f48115i;
            if (a0Var != null) {
                a0Var.r(true);
            }
        }
        ob.l lVar = new ob.l(context, b7.f0.B(context));
        String strR = xt.b.a().r();
        qy.q qVar = fv.b.f28186a;
        Sentence sentence = this.f48116j;
        if (sentence == null) {
            kotlin.jvm.internal.m.n("mModel");
            throw th3;
        }
        Uri uri = Uri.parse(strR + fv.g.t(sentence.SentenceId));
        hh.c cVar = new hh.c(new x7.k(), 16);
        re.v vVar = new re.v(2);
        y6.x xVarA = y6.x.a(uri);
        xVarA.f57373b.getClass();
        xVarA.f57373b.getClass();
        xVarA.f57373b.getClass();
        p7.v0 v0Var = new p7.v0(xVarA, lVar, cVar, k7.g.f37960a, vVar, 1048576, null);
        f7.a0 a0Var2 = this.f48115i;
        if (a0Var2 != null) {
            a0Var2.G0(v0Var);
        }
        f7.a0 a0Var3 = this.f48115i;
        if (a0Var3 != null) {
            a0Var3.a();
        }
        f7.a0 a0Var4 = this.f48115i;
        if (a0Var4 != null) {
            a0Var4.r(true);
        }
        f7.a0 a0Var5 = this.f48115i;
        if (a0Var5 != null) {
            a0Var5.P.a(new o3(this, i19));
        }
        ta.a aVar22 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar22);
        FrameLayout overlayFrameLayout = ((PlayerView) ((hj.i2) aVar22).f32691e.f33677e).getOverlayFrameLayout();
        if (overlayFrameLayout != null) {
            final int i23 = 3;
            bq.z.b(overlayFrameLayout, new fz.c(this) { // from class: qp.l3

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ p3 f48044b;

                {
                    this.f48044b = this;
                }

                @Override // fz.c
                public final Object invoke(Object obj6) {
                    String strT;
                    int i24 = i23;
                    re.q qVar2 = vx.b.f54316e;
                    int i25 = 0;
                    qy.b0 b0Var = qy.b0.f48488a;
                    p3 p3Var = this.f48044b;
                    View it2 = (View) obj6;
                    switch (i24) {
                        case 0:
                            kotlin.jvm.internal.m.f(it2, "it");
                            Context context2 = p3Var.f47883c;
                            try {
                                strT = p3Var.t();
                            } catch (Exception e10) {
                                e10.printStackTrace();
                                strT = BuildConfig.VERSION_NAME;
                            }
                            if (!strT.equals(BuildConfig.VERSION_NAME)) {
                                ArrayList arrayList4 = p3Var.f48119n;
                                int size5 = arrayList4.size();
                                int i26 = 0;
                                while (i26 < size5) {
                                    Object obj7 = arrayList4.get(i26);
                                    i26++;
                                    FrameLayout frameLayout3 = (FrameLayout) obj7;
                                    Object tag = frameLayout3.getTag();
                                    kotlin.jvm.internal.m.d(tag, "null cannot be cast to non-null type com.lingo.lingoskill.object.Word");
                                    String strB = fr.j3.B((Word) tag);
                                    if (frameLayout3.getVisibility() == 0 && strB.equals(strT)) {
                                        frameLayout3.setScaleX(1.0f);
                                        frameLayout3.setScaleY(1.0f);
                                        LinearInterpolator linearInterpolator = new LinearInterpolator();
                                        kp.g gVar = new kp.g(1);
                                        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(frameLayout3, PropertyValuesHolder.ofFloat("scaleX", 0.8f), PropertyValuesHolder.ofFloat("scaleY", 0.8f));
                                        objectAnimatorOfPropertyValuesHolder.setDuration(LogSeverity.NOTICE_VALUE);
                                        objectAnimatorOfPropertyValuesHolder.setRepeatMode(2);
                                        objectAnimatorOfPropertyValuesHolder.setRepeatCount(3);
                                        objectAnimatorOfPropertyValuesHolder.setInterpolator(linearInterpolator);
                                        objectAnimatorOfPropertyValuesHolder.addListener(gVar);
                                        objectAnimatorOfPropertyValuesHolder.start();
                                        break;
                                    }
                                }
                            } else {
                                ta.a aVar23 = p3Var.f47886f;
                                kotlin.jvm.internal.m.c(aVar23);
                                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(((hj.i2) aVar23).f32693g, "translationX", CropImageView.DEFAULT_ASPECT_RATIO, 15.0f, -15.0f, CropImageView.DEFAULT_ASPECT_RATIO);
                                if (objectAnimatorOfFloat != null) {
                                    objectAnimatorOfFloat.setDuration(300L);
                                    objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
                                    objectAnimatorOfFloat.start();
                                } else {
                                    objectAnimatorOfFloat = null;
                                }
                                p3Var.f48117k = objectAnimatorOfFloat;
                                ta.a aVar24 = p3Var.f47886f;
                                kotlin.jvm.internal.m.c(aVar24);
                                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(((hj.i2) aVar24).f32689c, "translationX", CropImageView.DEFAULT_ASPECT_RATIO, 15.0f, -15.0f, CropImageView.DEFAULT_ASPECT_RATIO);
                                if (objectAnimatorOfFloat2 != null) {
                                    objectAnimatorOfFloat2.setDuration(300L);
                                    objectAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
                                    objectAnimatorOfFloat2.start();
                                } else {
                                    objectAnimatorOfFloat2 = null;
                                }
                                p3Var.f48117k = objectAnimatorOfFloat2;
                                ta.a aVar25 = p3Var.f47886f;
                                kotlin.jvm.internal.m.c(aVar25);
                                ((hj.i2) aVar25).f32689c.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, context2.getApplicationContext().getDrawable(R.drawable.line_wrong));
                                ta.a aVar26 = p3Var.f47886f;
                                kotlin.jvm.internal.m.c(aVar26);
                                ((hj.i2) aVar26).f32689c.setTextColor(context2.getColor(R.color.color_FF6666));
                                th.j.a(qx.h.m(300L, TimeUnit.MILLISECONDS, ky.e.f38937b).g(px.b.a()).h(new o20.i(p3Var, 16), c.S), p3Var.f47887g);
                            }
                            break;
                        case 1:
                            kotlin.jvm.internal.m.f(it2, "it");
                            Env env2 = p3Var.f47884d;
                            ArrayList arrayList5 = p3Var.f48119n;
                            boolean z11 = env2.examCharAudioSwitch;
                            env2.examCharAudioSwitch = !z11;
                            if (!z11) {
                                ta.a aVar27 = p3Var.f47886f;
                                kotlin.jvm.internal.m.c(aVar27);
                                ((hj.i2) aVar27).f32692f.setImageResource(R.drawable.ic_hint_audio);
                                int size6 = arrayList5.size();
                                int i27 = 0;
                                while (i27 < size6) {
                                    Object obj8 = arrayList5.get(i27);
                                    i27++;
                                    FrameLayout frameLayout4 = (FrameLayout) obj8;
                                    TextView textView3 = (TextView) frameLayout4.findViewById(R.id.tv_char);
                                    ImageView imageView2 = (ImageView) frameLayout4.findViewById(R.id.iv_hint_audio);
                                    if (kotlin.jvm.internal.m.a(textView3.getText().toString(), " ")) {
                                        imageView2.setVisibility(8);
                                    } else {
                                        imageView2.setVisibility(0);
                                    }
                                }
                            } else {
                                ta.a aVar28 = p3Var.f47886f;
                                kotlin.jvm.internal.m.c(aVar28);
                                ((hj.i2) aVar28).f32692f.setImageResource(R.drawable.ic_hint_audio_close);
                                int size7 = arrayList5.size();
                                while (i25 < size7) {
                                    Object obj9 = arrayList5.get(i25);
                                    i25++;
                                    ((ImageView) ((FrameLayout) obj9).findViewById(R.id.iv_hint_audio)).setVisibility(8);
                                }
                            }
                            break;
                        case 2:
                            kotlin.jvm.internal.m.f(it2, "it");
                            ta.a aVar29 = p3Var.f47886f;
                            kotlin.jvm.internal.m.c(aVar29);
                            try {
                                p3Var.s(((hj.i2) aVar29).f32689c.getSelectionStart());
                            } catch (Exception e11) {
                                e11.printStackTrace();
                            }
                            p3Var.x();
                            break;
                        case 3:
                            kotlin.jvm.internal.m.f(it2, "it");
                            f7.a0 a0Var6 = p3Var.f48115i;
                            if (a0Var6 == null || !a0Var6.g()) {
                                f7.a0 a0Var7 = p3Var.f48115i;
                                if (a0Var7 != null) {
                                    a0Var7.l0(5, 0L);
                                }
                                th.j.a(qx.h.m(300L, TimeUnit.MILLISECONDS, ky.e.f38937b).g(px.b.a()).h(new n9.q(p3Var, 18), qVar2), p3Var.f47887g);
                                ta.a aVar30 = p3Var.f47886f;
                                kotlin.jvm.internal.m.c(aVar30);
                                ((LinearLayout) ((hj.i2) aVar30).f32691e.f33679g).setVisibility(8);
                                ta.a aVar31 = p3Var.f47886f;
                                kotlin.jvm.internal.m.c(aVar31);
                                ((FrameLayout) ((hj.i2) aVar31).f32691e.f33678f).setVisibility(8);
                            }
                            break;
                        case 4:
                            kotlin.jvm.internal.m.f(it2, "it");
                            f7.a0 a0Var8 = p3Var.f48115i;
                            if (a0Var8 != null) {
                                a0Var8.l0(5, 0L);
                            }
                            qx.h.m(300L, TimeUnit.MILLISECONDS, ky.e.f38937b).g(px.b.a()).h(new o20.w(p3Var, 15), qVar2);
                            ta.a aVar32 = p3Var.f47886f;
                            kotlin.jvm.internal.m.c(aVar32);
                            ((LinearLayout) ((hj.i2) aVar32).f32691e.f33679g).setVisibility(8);
                            ta.a aVar33 = p3Var.f47886f;
                            kotlin.jvm.internal.m.c(aVar33);
                            ((FrameLayout) ((hj.i2) aVar33).f32691e.f33678f).setVisibility(8);
                            break;
                        default:
                            kotlin.jvm.internal.m.f(it2, "it");
                            f7.a0 a0Var9 = p3Var.f48115i;
                            if (a0Var9 != null) {
                                a0Var9.l0(5, 0L);
                            }
                            th.j.a(qx.h.m(300L, TimeUnit.MILLISECONDS, ky.e.f38937b).g(px.b.a()).h(new lp.b(p3Var, 22), qVar2), p3Var.f47887g);
                            ta.a aVar34 = p3Var.f47886f;
                            kotlin.jvm.internal.m.c(aVar34);
                            ((LinearLayout) ((hj.i2) aVar34).f32691e.f33679g).setVisibility(8);
                            ta.a aVar35 = p3Var.f47886f;
                            kotlin.jvm.internal.m.c(aVar35);
                            ((FrameLayout) ((hj.i2) aVar35).f32691e.f33678f).setVisibility(8);
                            break;
                    }
                    return b0Var;
                }
            });
        }
        ta.a aVar23 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar23);
        bq.z.b(((hj.i2) aVar23).f32691e.f33674b, new fz.c(this) { // from class: qp.l3

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p3 f48044b;

            {
                this.f48044b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj6) {
                String strT;
                int i24 = i21;
                re.q qVar2 = vx.b.f54316e;
                int i25 = 0;
                qy.b0 b0Var = qy.b0.f48488a;
                p3 p3Var = this.f48044b;
                View it2 = (View) obj6;
                switch (i24) {
                    case 0:
                        kotlin.jvm.internal.m.f(it2, "it");
                        Context context2 = p3Var.f47883c;
                        try {
                            strT = p3Var.t();
                        } catch (Exception e10) {
                            e10.printStackTrace();
                            strT = BuildConfig.VERSION_NAME;
                        }
                        if (!strT.equals(BuildConfig.VERSION_NAME)) {
                            ArrayList arrayList4 = p3Var.f48119n;
                            int size5 = arrayList4.size();
                            int i26 = 0;
                            while (i26 < size5) {
                                Object obj7 = arrayList4.get(i26);
                                i26++;
                                FrameLayout frameLayout3 = (FrameLayout) obj7;
                                Object tag = frameLayout3.getTag();
                                kotlin.jvm.internal.m.d(tag, "null cannot be cast to non-null type com.lingo.lingoskill.object.Word");
                                String strB = fr.j3.B((Word) tag);
                                if (frameLayout3.getVisibility() == 0 && strB.equals(strT)) {
                                    frameLayout3.setScaleX(1.0f);
                                    frameLayout3.setScaleY(1.0f);
                                    LinearInterpolator linearInterpolator = new LinearInterpolator();
                                    kp.g gVar = new kp.g(1);
                                    ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(frameLayout3, PropertyValuesHolder.ofFloat("scaleX", 0.8f), PropertyValuesHolder.ofFloat("scaleY", 0.8f));
                                    objectAnimatorOfPropertyValuesHolder.setDuration(LogSeverity.NOTICE_VALUE);
                                    objectAnimatorOfPropertyValuesHolder.setRepeatMode(2);
                                    objectAnimatorOfPropertyValuesHolder.setRepeatCount(3);
                                    objectAnimatorOfPropertyValuesHolder.setInterpolator(linearInterpolator);
                                    objectAnimatorOfPropertyValuesHolder.addListener(gVar);
                                    objectAnimatorOfPropertyValuesHolder.start();
                                    break;
                                }
                            }
                        } else {
                            ta.a aVar24 = p3Var.f47886f;
                            kotlin.jvm.internal.m.c(aVar24);
                            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(((hj.i2) aVar24).f32693g, "translationX", CropImageView.DEFAULT_ASPECT_RATIO, 15.0f, -15.0f, CropImageView.DEFAULT_ASPECT_RATIO);
                            if (objectAnimatorOfFloat != null) {
                                objectAnimatorOfFloat.setDuration(300L);
                                objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
                                objectAnimatorOfFloat.start();
                            } else {
                                objectAnimatorOfFloat = null;
                            }
                            p3Var.f48117k = objectAnimatorOfFloat;
                            ta.a aVar25 = p3Var.f47886f;
                            kotlin.jvm.internal.m.c(aVar25);
                            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(((hj.i2) aVar25).f32689c, "translationX", CropImageView.DEFAULT_ASPECT_RATIO, 15.0f, -15.0f, CropImageView.DEFAULT_ASPECT_RATIO);
                            if (objectAnimatorOfFloat2 != null) {
                                objectAnimatorOfFloat2.setDuration(300L);
                                objectAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
                                objectAnimatorOfFloat2.start();
                            } else {
                                objectAnimatorOfFloat2 = null;
                            }
                            p3Var.f48117k = objectAnimatorOfFloat2;
                            ta.a aVar26 = p3Var.f47886f;
                            kotlin.jvm.internal.m.c(aVar26);
                            ((hj.i2) aVar26).f32689c.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, context2.getApplicationContext().getDrawable(R.drawable.line_wrong));
                            ta.a aVar27 = p3Var.f47886f;
                            kotlin.jvm.internal.m.c(aVar27);
                            ((hj.i2) aVar27).f32689c.setTextColor(context2.getColor(R.color.color_FF6666));
                            th.j.a(qx.h.m(300L, TimeUnit.MILLISECONDS, ky.e.f38937b).g(px.b.a()).h(new o20.i(p3Var, 16), c.S), p3Var.f47887g);
                        }
                        break;
                    case 1:
                        kotlin.jvm.internal.m.f(it2, "it");
                        Env env2 = p3Var.f47884d;
                        ArrayList arrayList5 = p3Var.f48119n;
                        boolean z11 = env2.examCharAudioSwitch;
                        env2.examCharAudioSwitch = !z11;
                        if (!z11) {
                            ta.a aVar28 = p3Var.f47886f;
                            kotlin.jvm.internal.m.c(aVar28);
                            ((hj.i2) aVar28).f32692f.setImageResource(R.drawable.ic_hint_audio);
                            int size6 = arrayList5.size();
                            int i27 = 0;
                            while (i27 < size6) {
                                Object obj8 = arrayList5.get(i27);
                                i27++;
                                FrameLayout frameLayout4 = (FrameLayout) obj8;
                                TextView textView3 = (TextView) frameLayout4.findViewById(R.id.tv_char);
                                ImageView imageView2 = (ImageView) frameLayout4.findViewById(R.id.iv_hint_audio);
                                if (kotlin.jvm.internal.m.a(textView3.getText().toString(), " ")) {
                                    imageView2.setVisibility(8);
                                } else {
                                    imageView2.setVisibility(0);
                                }
                            }
                        } else {
                            ta.a aVar29 = p3Var.f47886f;
                            kotlin.jvm.internal.m.c(aVar29);
                            ((hj.i2) aVar29).f32692f.setImageResource(R.drawable.ic_hint_audio_close);
                            int size7 = arrayList5.size();
                            while (i25 < size7) {
                                Object obj9 = arrayList5.get(i25);
                                i25++;
                                ((ImageView) ((FrameLayout) obj9).findViewById(R.id.iv_hint_audio)).setVisibility(8);
                            }
                        }
                        break;
                    case 2:
                        kotlin.jvm.internal.m.f(it2, "it");
                        ta.a aVar210 = p3Var.f47886f;
                        kotlin.jvm.internal.m.c(aVar210);
                        try {
                            p3Var.s(((hj.i2) aVar210).f32689c.getSelectionStart());
                        } catch (Exception e11) {
                            e11.printStackTrace();
                        }
                        p3Var.x();
                        break;
                    case 3:
                        kotlin.jvm.internal.m.f(it2, "it");
                        f7.a0 a0Var6 = p3Var.f48115i;
                        if (a0Var6 == null || !a0Var6.g()) {
                            f7.a0 a0Var7 = p3Var.f48115i;
                            if (a0Var7 != null) {
                                a0Var7.l0(5, 0L);
                            }
                            th.j.a(qx.h.m(300L, TimeUnit.MILLISECONDS, ky.e.f38937b).g(px.b.a()).h(new n9.q(p3Var, 18), qVar2), p3Var.f47887g);
                            ta.a aVar30 = p3Var.f47886f;
                            kotlin.jvm.internal.m.c(aVar30);
                            ((LinearLayout) ((hj.i2) aVar30).f32691e.f33679g).setVisibility(8);
                            ta.a aVar31 = p3Var.f47886f;
                            kotlin.jvm.internal.m.c(aVar31);
                            ((FrameLayout) ((hj.i2) aVar31).f32691e.f33678f).setVisibility(8);
                        }
                        break;
                    case 4:
                        kotlin.jvm.internal.m.f(it2, "it");
                        f7.a0 a0Var8 = p3Var.f48115i;
                        if (a0Var8 != null) {
                            a0Var8.l0(5, 0L);
                        }
                        qx.h.m(300L, TimeUnit.MILLISECONDS, ky.e.f38937b).g(px.b.a()).h(new o20.w(p3Var, 15), qVar2);
                        ta.a aVar32 = p3Var.f47886f;
                        kotlin.jvm.internal.m.c(aVar32);
                        ((LinearLayout) ((hj.i2) aVar32).f32691e.f33679g).setVisibility(8);
                        ta.a aVar33 = p3Var.f47886f;
                        kotlin.jvm.internal.m.c(aVar33);
                        ((FrameLayout) ((hj.i2) aVar33).f32691e.f33678f).setVisibility(8);
                        break;
                    default:
                        kotlin.jvm.internal.m.f(it2, "it");
                        f7.a0 a0Var9 = p3Var.f48115i;
                        if (a0Var9 != null) {
                            a0Var9.l0(5, 0L);
                        }
                        th.j.a(qx.h.m(300L, TimeUnit.MILLISECONDS, ky.e.f38937b).g(px.b.a()).h(new lp.b(p3Var, 22), qVar2), p3Var.f47887g);
                        ta.a aVar34 = p3Var.f47886f;
                        kotlin.jvm.internal.m.c(aVar34);
                        ((LinearLayout) ((hj.i2) aVar34).f32691e.f33679g).setVisibility(8);
                        ta.a aVar35 = p3Var.f47886f;
                        kotlin.jvm.internal.m.c(aVar35);
                        ((FrameLayout) ((hj.i2) aVar35).f32691e.f33678f).setVisibility(8);
                        break;
                }
                return b0Var;
            }
        });
        ta.a aVar24 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar24);
        final int i24 = 5;
        bq.z.b(((hj.i2) aVar24).f32691e.f33676d, new fz.c(this) { // from class: qp.l3

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p3 f48044b;

            {
                this.f48044b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj6) {
                String strT;
                int i25 = i24;
                re.q qVar2 = vx.b.f54316e;
                int i26 = 0;
                qy.b0 b0Var = qy.b0.f48488a;
                p3 p3Var = this.f48044b;
                View it2 = (View) obj6;
                switch (i25) {
                    case 0:
                        kotlin.jvm.internal.m.f(it2, "it");
                        Context context2 = p3Var.f47883c;
                        try {
                            strT = p3Var.t();
                        } catch (Exception e10) {
                            e10.printStackTrace();
                            strT = BuildConfig.VERSION_NAME;
                        }
                        if (!strT.equals(BuildConfig.VERSION_NAME)) {
                            ArrayList arrayList4 = p3Var.f48119n;
                            int size5 = arrayList4.size();
                            int i27 = 0;
                            while (i27 < size5) {
                                Object obj7 = arrayList4.get(i27);
                                i27++;
                                FrameLayout frameLayout3 = (FrameLayout) obj7;
                                Object tag = frameLayout3.getTag();
                                kotlin.jvm.internal.m.d(tag, "null cannot be cast to non-null type com.lingo.lingoskill.object.Word");
                                String strB = fr.j3.B((Word) tag);
                                if (frameLayout3.getVisibility() == 0 && strB.equals(strT)) {
                                    frameLayout3.setScaleX(1.0f);
                                    frameLayout3.setScaleY(1.0f);
                                    LinearInterpolator linearInterpolator = new LinearInterpolator();
                                    kp.g gVar = new kp.g(1);
                                    ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(frameLayout3, PropertyValuesHolder.ofFloat("scaleX", 0.8f), PropertyValuesHolder.ofFloat("scaleY", 0.8f));
                                    objectAnimatorOfPropertyValuesHolder.setDuration(LogSeverity.NOTICE_VALUE);
                                    objectAnimatorOfPropertyValuesHolder.setRepeatMode(2);
                                    objectAnimatorOfPropertyValuesHolder.setRepeatCount(3);
                                    objectAnimatorOfPropertyValuesHolder.setInterpolator(linearInterpolator);
                                    objectAnimatorOfPropertyValuesHolder.addListener(gVar);
                                    objectAnimatorOfPropertyValuesHolder.start();
                                    break;
                                }
                            }
                        } else {
                            ta.a aVar25 = p3Var.f47886f;
                            kotlin.jvm.internal.m.c(aVar25);
                            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(((hj.i2) aVar25).f32693g, "translationX", CropImageView.DEFAULT_ASPECT_RATIO, 15.0f, -15.0f, CropImageView.DEFAULT_ASPECT_RATIO);
                            if (objectAnimatorOfFloat != null) {
                                objectAnimatorOfFloat.setDuration(300L);
                                objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
                                objectAnimatorOfFloat.start();
                            } else {
                                objectAnimatorOfFloat = null;
                            }
                            p3Var.f48117k = objectAnimatorOfFloat;
                            ta.a aVar26 = p3Var.f47886f;
                            kotlin.jvm.internal.m.c(aVar26);
                            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(((hj.i2) aVar26).f32689c, "translationX", CropImageView.DEFAULT_ASPECT_RATIO, 15.0f, -15.0f, CropImageView.DEFAULT_ASPECT_RATIO);
                            if (objectAnimatorOfFloat2 != null) {
                                objectAnimatorOfFloat2.setDuration(300L);
                                objectAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
                                objectAnimatorOfFloat2.start();
                            } else {
                                objectAnimatorOfFloat2 = null;
                            }
                            p3Var.f48117k = objectAnimatorOfFloat2;
                            ta.a aVar27 = p3Var.f47886f;
                            kotlin.jvm.internal.m.c(aVar27);
                            ((hj.i2) aVar27).f32689c.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, context2.getApplicationContext().getDrawable(R.drawable.line_wrong));
                            ta.a aVar28 = p3Var.f47886f;
                            kotlin.jvm.internal.m.c(aVar28);
                            ((hj.i2) aVar28).f32689c.setTextColor(context2.getColor(R.color.color_FF6666));
                            th.j.a(qx.h.m(300L, TimeUnit.MILLISECONDS, ky.e.f38937b).g(px.b.a()).h(new o20.i(p3Var, 16), c.S), p3Var.f47887g);
                        }
                        break;
                    case 1:
                        kotlin.jvm.internal.m.f(it2, "it");
                        Env env2 = p3Var.f47884d;
                        ArrayList arrayList5 = p3Var.f48119n;
                        boolean z11 = env2.examCharAudioSwitch;
                        env2.examCharAudioSwitch = !z11;
                        if (!z11) {
                            ta.a aVar29 = p3Var.f47886f;
                            kotlin.jvm.internal.m.c(aVar29);
                            ((hj.i2) aVar29).f32692f.setImageResource(R.drawable.ic_hint_audio);
                            int size6 = arrayList5.size();
                            int i28 = 0;
                            while (i28 < size6) {
                                Object obj8 = arrayList5.get(i28);
                                i28++;
                                FrameLayout frameLayout4 = (FrameLayout) obj8;
                                TextView textView3 = (TextView) frameLayout4.findViewById(R.id.tv_char);
                                ImageView imageView2 = (ImageView) frameLayout4.findViewById(R.id.iv_hint_audio);
                                if (kotlin.jvm.internal.m.a(textView3.getText().toString(), " ")) {
                                    imageView2.setVisibility(8);
                                } else {
                                    imageView2.setVisibility(0);
                                }
                            }
                        } else {
                            ta.a aVar210 = p3Var.f47886f;
                            kotlin.jvm.internal.m.c(aVar210);
                            ((hj.i2) aVar210).f32692f.setImageResource(R.drawable.ic_hint_audio_close);
                            int size7 = arrayList5.size();
                            while (i26 < size7) {
                                Object obj9 = arrayList5.get(i26);
                                i26++;
                                ((ImageView) ((FrameLayout) obj9).findViewById(R.id.iv_hint_audio)).setVisibility(8);
                            }
                        }
                        break;
                    case 2:
                        kotlin.jvm.internal.m.f(it2, "it");
                        ta.a aVar211 = p3Var.f47886f;
                        kotlin.jvm.internal.m.c(aVar211);
                        try {
                            p3Var.s(((hj.i2) aVar211).f32689c.getSelectionStart());
                        } catch (Exception e11) {
                            e11.printStackTrace();
                        }
                        p3Var.x();
                        break;
                    case 3:
                        kotlin.jvm.internal.m.f(it2, "it");
                        f7.a0 a0Var6 = p3Var.f48115i;
                        if (a0Var6 == null || !a0Var6.g()) {
                            f7.a0 a0Var7 = p3Var.f48115i;
                            if (a0Var7 != null) {
                                a0Var7.l0(5, 0L);
                            }
                            th.j.a(qx.h.m(300L, TimeUnit.MILLISECONDS, ky.e.f38937b).g(px.b.a()).h(new n9.q(p3Var, 18), qVar2), p3Var.f47887g);
                            ta.a aVar30 = p3Var.f47886f;
                            kotlin.jvm.internal.m.c(aVar30);
                            ((LinearLayout) ((hj.i2) aVar30).f32691e.f33679g).setVisibility(8);
                            ta.a aVar31 = p3Var.f47886f;
                            kotlin.jvm.internal.m.c(aVar31);
                            ((FrameLayout) ((hj.i2) aVar31).f32691e.f33678f).setVisibility(8);
                        }
                        break;
                    case 4:
                        kotlin.jvm.internal.m.f(it2, "it");
                        f7.a0 a0Var8 = p3Var.f48115i;
                        if (a0Var8 != null) {
                            a0Var8.l0(5, 0L);
                        }
                        qx.h.m(300L, TimeUnit.MILLISECONDS, ky.e.f38937b).g(px.b.a()).h(new o20.w(p3Var, 15), qVar2);
                        ta.a aVar32 = p3Var.f47886f;
                        kotlin.jvm.internal.m.c(aVar32);
                        ((LinearLayout) ((hj.i2) aVar32).f32691e.f33679g).setVisibility(8);
                        ta.a aVar33 = p3Var.f47886f;
                        kotlin.jvm.internal.m.c(aVar33);
                        ((FrameLayout) ((hj.i2) aVar33).f32691e.f33678f).setVisibility(8);
                        break;
                    default:
                        kotlin.jvm.internal.m.f(it2, "it");
                        f7.a0 a0Var9 = p3Var.f48115i;
                        if (a0Var9 != null) {
                            a0Var9.l0(5, 0L);
                        }
                        th.j.a(qx.h.m(300L, TimeUnit.MILLISECONDS, ky.e.f38937b).g(px.b.a()).h(new lp.b(p3Var, 22), qVar2), p3Var.f47887g);
                        ta.a aVar34 = p3Var.f47886f;
                        kotlin.jvm.internal.m.c(aVar34);
                        ((LinearLayout) ((hj.i2) aVar34).f32691e.f33679g).setVisibility(8);
                        ta.a aVar35 = p3Var.f47886f;
                        kotlin.jvm.internal.m.c(aVar35);
                        ((FrameLayout) ((hj.i2) aVar35).f32691e.f33678f).setVisibility(8);
                        break;
                }
                return b0Var;
            }
        });
        ta.a aVar25 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar25);
        ((LinearLayout) ((hj.i2) aVar25).f32691e.f33679g).setVisibility(8);
        ta.a aVar26 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar26);
        ((FrameLayout) ((hj.i2) aVar26).f32691e.f33678f).setVisibility(8);
        ta.a aVar27 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar27);
        TextView textView3 = ((hj.i2) aVar27).f32695i;
        Sentence sentence2 = this.f48116j;
        if (sentence2 == null) {
            kotlin.jvm.internal.m.n("mModel");
            throw th3;
        }
        textView3.setText(sentence2.getTranslations());
        ta.a aVar28 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar28);
        bq.z.b(((hj.i2) aVar28).f32693g, new fz.c(this) { // from class: qp.l3

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p3 f48044b;

            {
                this.f48044b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj6) {
                String strT;
                int i25 = i19;
                re.q qVar2 = vx.b.f54316e;
                int i26 = 0;
                qy.b0 b0Var = qy.b0.f48488a;
                p3 p3Var = this.f48044b;
                View it2 = (View) obj6;
                switch (i25) {
                    case 0:
                        kotlin.jvm.internal.m.f(it2, "it");
                        Context context2 = p3Var.f47883c;
                        try {
                            strT = p3Var.t();
                        } catch (Exception e10) {
                            e10.printStackTrace();
                            strT = BuildConfig.VERSION_NAME;
                        }
                        if (!strT.equals(BuildConfig.VERSION_NAME)) {
                            ArrayList arrayList4 = p3Var.f48119n;
                            int size5 = arrayList4.size();
                            int i27 = 0;
                            while (i27 < size5) {
                                Object obj7 = arrayList4.get(i27);
                                i27++;
                                FrameLayout frameLayout3 = (FrameLayout) obj7;
                                Object tag = frameLayout3.getTag();
                                kotlin.jvm.internal.m.d(tag, "null cannot be cast to non-null type com.lingo.lingoskill.object.Word");
                                String strB = fr.j3.B((Word) tag);
                                if (frameLayout3.getVisibility() == 0 && strB.equals(strT)) {
                                    frameLayout3.setScaleX(1.0f);
                                    frameLayout3.setScaleY(1.0f);
                                    LinearInterpolator linearInterpolator = new LinearInterpolator();
                                    kp.g gVar = new kp.g(1);
                                    ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(frameLayout3, PropertyValuesHolder.ofFloat("scaleX", 0.8f), PropertyValuesHolder.ofFloat("scaleY", 0.8f));
                                    objectAnimatorOfPropertyValuesHolder.setDuration(LogSeverity.NOTICE_VALUE);
                                    objectAnimatorOfPropertyValuesHolder.setRepeatMode(2);
                                    objectAnimatorOfPropertyValuesHolder.setRepeatCount(3);
                                    objectAnimatorOfPropertyValuesHolder.setInterpolator(linearInterpolator);
                                    objectAnimatorOfPropertyValuesHolder.addListener(gVar);
                                    objectAnimatorOfPropertyValuesHolder.start();
                                    break;
                                }
                            }
                        } else {
                            ta.a aVar29 = p3Var.f47886f;
                            kotlin.jvm.internal.m.c(aVar29);
                            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(((hj.i2) aVar29).f32693g, "translationX", CropImageView.DEFAULT_ASPECT_RATIO, 15.0f, -15.0f, CropImageView.DEFAULT_ASPECT_RATIO);
                            if (objectAnimatorOfFloat != null) {
                                objectAnimatorOfFloat.setDuration(300L);
                                objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
                                objectAnimatorOfFloat.start();
                            } else {
                                objectAnimatorOfFloat = null;
                            }
                            p3Var.f48117k = objectAnimatorOfFloat;
                            ta.a aVar210 = p3Var.f47886f;
                            kotlin.jvm.internal.m.c(aVar210);
                            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(((hj.i2) aVar210).f32689c, "translationX", CropImageView.DEFAULT_ASPECT_RATIO, 15.0f, -15.0f, CropImageView.DEFAULT_ASPECT_RATIO);
                            if (objectAnimatorOfFloat2 != null) {
                                objectAnimatorOfFloat2.setDuration(300L);
                                objectAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
                                objectAnimatorOfFloat2.start();
                            } else {
                                objectAnimatorOfFloat2 = null;
                            }
                            p3Var.f48117k = objectAnimatorOfFloat2;
                            ta.a aVar211 = p3Var.f47886f;
                            kotlin.jvm.internal.m.c(aVar211);
                            ((hj.i2) aVar211).f32689c.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, context2.getApplicationContext().getDrawable(R.drawable.line_wrong));
                            ta.a aVar212 = p3Var.f47886f;
                            kotlin.jvm.internal.m.c(aVar212);
                            ((hj.i2) aVar212).f32689c.setTextColor(context2.getColor(R.color.color_FF6666));
                            th.j.a(qx.h.m(300L, TimeUnit.MILLISECONDS, ky.e.f38937b).g(px.b.a()).h(new o20.i(p3Var, 16), c.S), p3Var.f47887g);
                        }
                        break;
                    case 1:
                        kotlin.jvm.internal.m.f(it2, "it");
                        Env env2 = p3Var.f47884d;
                        ArrayList arrayList5 = p3Var.f48119n;
                        boolean z11 = env2.examCharAudioSwitch;
                        env2.examCharAudioSwitch = !z11;
                        if (!z11) {
                            ta.a aVar213 = p3Var.f47886f;
                            kotlin.jvm.internal.m.c(aVar213);
                            ((hj.i2) aVar213).f32692f.setImageResource(R.drawable.ic_hint_audio);
                            int size6 = arrayList5.size();
                            int i28 = 0;
                            while (i28 < size6) {
                                Object obj8 = arrayList5.get(i28);
                                i28++;
                                FrameLayout frameLayout4 = (FrameLayout) obj8;
                                TextView textView4 = (TextView) frameLayout4.findViewById(R.id.tv_char);
                                ImageView imageView2 = (ImageView) frameLayout4.findViewById(R.id.iv_hint_audio);
                                if (kotlin.jvm.internal.m.a(textView4.getText().toString(), " ")) {
                                    imageView2.setVisibility(8);
                                } else {
                                    imageView2.setVisibility(0);
                                }
                            }
                        } else {
                            ta.a aVar214 = p3Var.f47886f;
                            kotlin.jvm.internal.m.c(aVar214);
                            ((hj.i2) aVar214).f32692f.setImageResource(R.drawable.ic_hint_audio_close);
                            int size7 = arrayList5.size();
                            while (i26 < size7) {
                                Object obj9 = arrayList5.get(i26);
                                i26++;
                                ((ImageView) ((FrameLayout) obj9).findViewById(R.id.iv_hint_audio)).setVisibility(8);
                            }
                        }
                        break;
                    case 2:
                        kotlin.jvm.internal.m.f(it2, "it");
                        ta.a aVar215 = p3Var.f47886f;
                        kotlin.jvm.internal.m.c(aVar215);
                        try {
                            p3Var.s(((hj.i2) aVar215).f32689c.getSelectionStart());
                        } catch (Exception e11) {
                            e11.printStackTrace();
                        }
                        p3Var.x();
                        break;
                    case 3:
                        kotlin.jvm.internal.m.f(it2, "it");
                        f7.a0 a0Var6 = p3Var.f48115i;
                        if (a0Var6 == null || !a0Var6.g()) {
                            f7.a0 a0Var7 = p3Var.f48115i;
                            if (a0Var7 != null) {
                                a0Var7.l0(5, 0L);
                            }
                            th.j.a(qx.h.m(300L, TimeUnit.MILLISECONDS, ky.e.f38937b).g(px.b.a()).h(new n9.q(p3Var, 18), qVar2), p3Var.f47887g);
                            ta.a aVar30 = p3Var.f47886f;
                            kotlin.jvm.internal.m.c(aVar30);
                            ((LinearLayout) ((hj.i2) aVar30).f32691e.f33679g).setVisibility(8);
                            ta.a aVar31 = p3Var.f47886f;
                            kotlin.jvm.internal.m.c(aVar31);
                            ((FrameLayout) ((hj.i2) aVar31).f32691e.f33678f).setVisibility(8);
                        }
                        break;
                    case 4:
                        kotlin.jvm.internal.m.f(it2, "it");
                        f7.a0 a0Var8 = p3Var.f48115i;
                        if (a0Var8 != null) {
                            a0Var8.l0(5, 0L);
                        }
                        qx.h.m(300L, TimeUnit.MILLISECONDS, ky.e.f38937b).g(px.b.a()).h(new o20.w(p3Var, 15), qVar2);
                        ta.a aVar32 = p3Var.f47886f;
                        kotlin.jvm.internal.m.c(aVar32);
                        ((LinearLayout) ((hj.i2) aVar32).f32691e.f33679g).setVisibility(8);
                        ta.a aVar33 = p3Var.f47886f;
                        kotlin.jvm.internal.m.c(aVar33);
                        ((FrameLayout) ((hj.i2) aVar33).f32691e.f33678f).setVisibility(8);
                        break;
                    default:
                        kotlin.jvm.internal.m.f(it2, "it");
                        f7.a0 a0Var9 = p3Var.f48115i;
                        if (a0Var9 != null) {
                            a0Var9.l0(5, 0L);
                        }
                        th.j.a(qx.h.m(300L, TimeUnit.MILLISECONDS, ky.e.f38937b).g(px.b.a()).h(new lp.b(p3Var, 22), qVar2), p3Var.f47887g);
                        ta.a aVar34 = p3Var.f47886f;
                        kotlin.jvm.internal.m.c(aVar34);
                        ((LinearLayout) ((hj.i2) aVar34).f32691e.f33679g).setVisibility(8);
                        ta.a aVar35 = p3Var.f47886f;
                        kotlin.jvm.internal.m.c(aVar35);
                        ((FrameLayout) ((hj.i2) aVar35).f32691e.f33678f).setVisibility(8);
                        break;
                }
                return b0Var;
            }
        });
        ta.a aVar29 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar29);
        final int i25 = 1;
        bq.z.b(((hj.i2) aVar29).f32692f, new fz.c(this) { // from class: qp.l3

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p3 f48044b;

            {
                this.f48044b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj6) {
                String strT;
                int i26 = i25;
                re.q qVar2 = vx.b.f54316e;
                int i27 = 0;
                qy.b0 b0Var = qy.b0.f48488a;
                p3 p3Var = this.f48044b;
                View it2 = (View) obj6;
                switch (i26) {
                    case 0:
                        kotlin.jvm.internal.m.f(it2, "it");
                        Context context2 = p3Var.f47883c;
                        try {
                            strT = p3Var.t();
                        } catch (Exception e10) {
                            e10.printStackTrace();
                            strT = BuildConfig.VERSION_NAME;
                        }
                        if (!strT.equals(BuildConfig.VERSION_NAME)) {
                            ArrayList arrayList4 = p3Var.f48119n;
                            int size5 = arrayList4.size();
                            int i28 = 0;
                            while (i28 < size5) {
                                Object obj7 = arrayList4.get(i28);
                                i28++;
                                FrameLayout frameLayout3 = (FrameLayout) obj7;
                                Object tag = frameLayout3.getTag();
                                kotlin.jvm.internal.m.d(tag, "null cannot be cast to non-null type com.lingo.lingoskill.object.Word");
                                String strB = fr.j3.B((Word) tag);
                                if (frameLayout3.getVisibility() == 0 && strB.equals(strT)) {
                                    frameLayout3.setScaleX(1.0f);
                                    frameLayout3.setScaleY(1.0f);
                                    LinearInterpolator linearInterpolator = new LinearInterpolator();
                                    kp.g gVar = new kp.g(1);
                                    ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(frameLayout3, PropertyValuesHolder.ofFloat("scaleX", 0.8f), PropertyValuesHolder.ofFloat("scaleY", 0.8f));
                                    objectAnimatorOfPropertyValuesHolder.setDuration(LogSeverity.NOTICE_VALUE);
                                    objectAnimatorOfPropertyValuesHolder.setRepeatMode(2);
                                    objectAnimatorOfPropertyValuesHolder.setRepeatCount(3);
                                    objectAnimatorOfPropertyValuesHolder.setInterpolator(linearInterpolator);
                                    objectAnimatorOfPropertyValuesHolder.addListener(gVar);
                                    objectAnimatorOfPropertyValuesHolder.start();
                                    break;
                                }
                            }
                        } else {
                            ta.a aVar210 = p3Var.f47886f;
                            kotlin.jvm.internal.m.c(aVar210);
                            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(((hj.i2) aVar210).f32693g, "translationX", CropImageView.DEFAULT_ASPECT_RATIO, 15.0f, -15.0f, CropImageView.DEFAULT_ASPECT_RATIO);
                            if (objectAnimatorOfFloat != null) {
                                objectAnimatorOfFloat.setDuration(300L);
                                objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
                                objectAnimatorOfFloat.start();
                            } else {
                                objectAnimatorOfFloat = null;
                            }
                            p3Var.f48117k = objectAnimatorOfFloat;
                            ta.a aVar211 = p3Var.f47886f;
                            kotlin.jvm.internal.m.c(aVar211);
                            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(((hj.i2) aVar211).f32689c, "translationX", CropImageView.DEFAULT_ASPECT_RATIO, 15.0f, -15.0f, CropImageView.DEFAULT_ASPECT_RATIO);
                            if (objectAnimatorOfFloat2 != null) {
                                objectAnimatorOfFloat2.setDuration(300L);
                                objectAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
                                objectAnimatorOfFloat2.start();
                            } else {
                                objectAnimatorOfFloat2 = null;
                            }
                            p3Var.f48117k = objectAnimatorOfFloat2;
                            ta.a aVar212 = p3Var.f47886f;
                            kotlin.jvm.internal.m.c(aVar212);
                            ((hj.i2) aVar212).f32689c.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, context2.getApplicationContext().getDrawable(R.drawable.line_wrong));
                            ta.a aVar213 = p3Var.f47886f;
                            kotlin.jvm.internal.m.c(aVar213);
                            ((hj.i2) aVar213).f32689c.setTextColor(context2.getColor(R.color.color_FF6666));
                            th.j.a(qx.h.m(300L, TimeUnit.MILLISECONDS, ky.e.f38937b).g(px.b.a()).h(new o20.i(p3Var, 16), c.S), p3Var.f47887g);
                        }
                        break;
                    case 1:
                        kotlin.jvm.internal.m.f(it2, "it");
                        Env env2 = p3Var.f47884d;
                        ArrayList arrayList5 = p3Var.f48119n;
                        boolean z11 = env2.examCharAudioSwitch;
                        env2.examCharAudioSwitch = !z11;
                        if (!z11) {
                            ta.a aVar214 = p3Var.f47886f;
                            kotlin.jvm.internal.m.c(aVar214);
                            ((hj.i2) aVar214).f32692f.setImageResource(R.drawable.ic_hint_audio);
                            int size6 = arrayList5.size();
                            int i29 = 0;
                            while (i29 < size6) {
                                Object obj8 = arrayList5.get(i29);
                                i29++;
                                FrameLayout frameLayout4 = (FrameLayout) obj8;
                                TextView textView4 = (TextView) frameLayout4.findViewById(R.id.tv_char);
                                ImageView imageView2 = (ImageView) frameLayout4.findViewById(R.id.iv_hint_audio);
                                if (kotlin.jvm.internal.m.a(textView4.getText().toString(), " ")) {
                                    imageView2.setVisibility(8);
                                } else {
                                    imageView2.setVisibility(0);
                                }
                            }
                        } else {
                            ta.a aVar215 = p3Var.f47886f;
                            kotlin.jvm.internal.m.c(aVar215);
                            ((hj.i2) aVar215).f32692f.setImageResource(R.drawable.ic_hint_audio_close);
                            int size7 = arrayList5.size();
                            while (i27 < size7) {
                                Object obj9 = arrayList5.get(i27);
                                i27++;
                                ((ImageView) ((FrameLayout) obj9).findViewById(R.id.iv_hint_audio)).setVisibility(8);
                            }
                        }
                        break;
                    case 2:
                        kotlin.jvm.internal.m.f(it2, "it");
                        ta.a aVar216 = p3Var.f47886f;
                        kotlin.jvm.internal.m.c(aVar216);
                        try {
                            p3Var.s(((hj.i2) aVar216).f32689c.getSelectionStart());
                        } catch (Exception e11) {
                            e11.printStackTrace();
                        }
                        p3Var.x();
                        break;
                    case 3:
                        kotlin.jvm.internal.m.f(it2, "it");
                        f7.a0 a0Var6 = p3Var.f48115i;
                        if (a0Var6 == null || !a0Var6.g()) {
                            f7.a0 a0Var7 = p3Var.f48115i;
                            if (a0Var7 != null) {
                                a0Var7.l0(5, 0L);
                            }
                            th.j.a(qx.h.m(300L, TimeUnit.MILLISECONDS, ky.e.f38937b).g(px.b.a()).h(new n9.q(p3Var, 18), qVar2), p3Var.f47887g);
                            ta.a aVar30 = p3Var.f47886f;
                            kotlin.jvm.internal.m.c(aVar30);
                            ((LinearLayout) ((hj.i2) aVar30).f32691e.f33679g).setVisibility(8);
                            ta.a aVar31 = p3Var.f47886f;
                            kotlin.jvm.internal.m.c(aVar31);
                            ((FrameLayout) ((hj.i2) aVar31).f32691e.f33678f).setVisibility(8);
                        }
                        break;
                    case 4:
                        kotlin.jvm.internal.m.f(it2, "it");
                        f7.a0 a0Var8 = p3Var.f48115i;
                        if (a0Var8 != null) {
                            a0Var8.l0(5, 0L);
                        }
                        qx.h.m(300L, TimeUnit.MILLISECONDS, ky.e.f38937b).g(px.b.a()).h(new o20.w(p3Var, 15), qVar2);
                        ta.a aVar32 = p3Var.f47886f;
                        kotlin.jvm.internal.m.c(aVar32);
                        ((LinearLayout) ((hj.i2) aVar32).f32691e.f33679g).setVisibility(8);
                        ta.a aVar33 = p3Var.f47886f;
                        kotlin.jvm.internal.m.c(aVar33);
                        ((FrameLayout) ((hj.i2) aVar33).f32691e.f33678f).setVisibility(8);
                        break;
                    default:
                        kotlin.jvm.internal.m.f(it2, "it");
                        f7.a0 a0Var9 = p3Var.f48115i;
                        if (a0Var9 != null) {
                            a0Var9.l0(5, 0L);
                        }
                        th.j.a(qx.h.m(300L, TimeUnit.MILLISECONDS, ky.e.f38937b).g(px.b.a()).h(new lp.b(p3Var, 22), qVar2), p3Var.f47887g);
                        ta.a aVar34 = p3Var.f47886f;
                        kotlin.jvm.internal.m.c(aVar34);
                        ((LinearLayout) ((hj.i2) aVar34).f32691e.f33679g).setVisibility(8);
                        ta.a aVar35 = p3Var.f47886f;
                        kotlin.jvm.internal.m.c(aVar35);
                        ((FrameLayout) ((hj.i2) aVar35).f32691e.f33678f).setVisibility(8);
                        break;
                }
                return b0Var;
            }
        });
        ta.a aVar30 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar30);
        bq.z.b(((hj.i2) aVar30).f32688b, new fz.c(this) { // from class: qp.l3

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p3 f48044b;

            {
                this.f48044b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj6) {
                String strT;
                int i26 = i16;
                re.q qVar2 = vx.b.f54316e;
                int i27 = 0;
                qy.b0 b0Var = qy.b0.f48488a;
                p3 p3Var = this.f48044b;
                View it2 = (View) obj6;
                switch (i26) {
                    case 0:
                        kotlin.jvm.internal.m.f(it2, "it");
                        Context context2 = p3Var.f47883c;
                        try {
                            strT = p3Var.t();
                        } catch (Exception e10) {
                            e10.printStackTrace();
                            strT = BuildConfig.VERSION_NAME;
                        }
                        if (!strT.equals(BuildConfig.VERSION_NAME)) {
                            ArrayList arrayList4 = p3Var.f48119n;
                            int size5 = arrayList4.size();
                            int i28 = 0;
                            while (i28 < size5) {
                                Object obj7 = arrayList4.get(i28);
                                i28++;
                                FrameLayout frameLayout3 = (FrameLayout) obj7;
                                Object tag = frameLayout3.getTag();
                                kotlin.jvm.internal.m.d(tag, "null cannot be cast to non-null type com.lingo.lingoskill.object.Word");
                                String strB = fr.j3.B((Word) tag);
                                if (frameLayout3.getVisibility() == 0 && strB.equals(strT)) {
                                    frameLayout3.setScaleX(1.0f);
                                    frameLayout3.setScaleY(1.0f);
                                    LinearInterpolator linearInterpolator = new LinearInterpolator();
                                    kp.g gVar = new kp.g(1);
                                    ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(frameLayout3, PropertyValuesHolder.ofFloat("scaleX", 0.8f), PropertyValuesHolder.ofFloat("scaleY", 0.8f));
                                    objectAnimatorOfPropertyValuesHolder.setDuration(LogSeverity.NOTICE_VALUE);
                                    objectAnimatorOfPropertyValuesHolder.setRepeatMode(2);
                                    objectAnimatorOfPropertyValuesHolder.setRepeatCount(3);
                                    objectAnimatorOfPropertyValuesHolder.setInterpolator(linearInterpolator);
                                    objectAnimatorOfPropertyValuesHolder.addListener(gVar);
                                    objectAnimatorOfPropertyValuesHolder.start();
                                    break;
                                }
                            }
                        } else {
                            ta.a aVar210 = p3Var.f47886f;
                            kotlin.jvm.internal.m.c(aVar210);
                            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(((hj.i2) aVar210).f32693g, "translationX", CropImageView.DEFAULT_ASPECT_RATIO, 15.0f, -15.0f, CropImageView.DEFAULT_ASPECT_RATIO);
                            if (objectAnimatorOfFloat != null) {
                                objectAnimatorOfFloat.setDuration(300L);
                                objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
                                objectAnimatorOfFloat.start();
                            } else {
                                objectAnimatorOfFloat = null;
                            }
                            p3Var.f48117k = objectAnimatorOfFloat;
                            ta.a aVar211 = p3Var.f47886f;
                            kotlin.jvm.internal.m.c(aVar211);
                            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(((hj.i2) aVar211).f32689c, "translationX", CropImageView.DEFAULT_ASPECT_RATIO, 15.0f, -15.0f, CropImageView.DEFAULT_ASPECT_RATIO);
                            if (objectAnimatorOfFloat2 != null) {
                                objectAnimatorOfFloat2.setDuration(300L);
                                objectAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
                                objectAnimatorOfFloat2.start();
                            } else {
                                objectAnimatorOfFloat2 = null;
                            }
                            p3Var.f48117k = objectAnimatorOfFloat2;
                            ta.a aVar212 = p3Var.f47886f;
                            kotlin.jvm.internal.m.c(aVar212);
                            ((hj.i2) aVar212).f32689c.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, context2.getApplicationContext().getDrawable(R.drawable.line_wrong));
                            ta.a aVar213 = p3Var.f47886f;
                            kotlin.jvm.internal.m.c(aVar213);
                            ((hj.i2) aVar213).f32689c.setTextColor(context2.getColor(R.color.color_FF6666));
                            th.j.a(qx.h.m(300L, TimeUnit.MILLISECONDS, ky.e.f38937b).g(px.b.a()).h(new o20.i(p3Var, 16), c.S), p3Var.f47887g);
                        }
                        break;
                    case 1:
                        kotlin.jvm.internal.m.f(it2, "it");
                        Env env2 = p3Var.f47884d;
                        ArrayList arrayList5 = p3Var.f48119n;
                        boolean z11 = env2.examCharAudioSwitch;
                        env2.examCharAudioSwitch = !z11;
                        if (!z11) {
                            ta.a aVar214 = p3Var.f47886f;
                            kotlin.jvm.internal.m.c(aVar214);
                            ((hj.i2) aVar214).f32692f.setImageResource(R.drawable.ic_hint_audio);
                            int size6 = arrayList5.size();
                            int i29 = 0;
                            while (i29 < size6) {
                                Object obj8 = arrayList5.get(i29);
                                i29++;
                                FrameLayout frameLayout4 = (FrameLayout) obj8;
                                TextView textView4 = (TextView) frameLayout4.findViewById(R.id.tv_char);
                                ImageView imageView2 = (ImageView) frameLayout4.findViewById(R.id.iv_hint_audio);
                                if (kotlin.jvm.internal.m.a(textView4.getText().toString(), " ")) {
                                    imageView2.setVisibility(8);
                                } else {
                                    imageView2.setVisibility(0);
                                }
                            }
                        } else {
                            ta.a aVar215 = p3Var.f47886f;
                            kotlin.jvm.internal.m.c(aVar215);
                            ((hj.i2) aVar215).f32692f.setImageResource(R.drawable.ic_hint_audio_close);
                            int size7 = arrayList5.size();
                            while (i27 < size7) {
                                Object obj9 = arrayList5.get(i27);
                                i27++;
                                ((ImageView) ((FrameLayout) obj9).findViewById(R.id.iv_hint_audio)).setVisibility(8);
                            }
                        }
                        break;
                    case 2:
                        kotlin.jvm.internal.m.f(it2, "it");
                        ta.a aVar216 = p3Var.f47886f;
                        kotlin.jvm.internal.m.c(aVar216);
                        try {
                            p3Var.s(((hj.i2) aVar216).f32689c.getSelectionStart());
                        } catch (Exception e11) {
                            e11.printStackTrace();
                        }
                        p3Var.x();
                        break;
                    case 3:
                        kotlin.jvm.internal.m.f(it2, "it");
                        f7.a0 a0Var6 = p3Var.f48115i;
                        if (a0Var6 == null || !a0Var6.g()) {
                            f7.a0 a0Var7 = p3Var.f48115i;
                            if (a0Var7 != null) {
                                a0Var7.l0(5, 0L);
                            }
                            th.j.a(qx.h.m(300L, TimeUnit.MILLISECONDS, ky.e.f38937b).g(px.b.a()).h(new n9.q(p3Var, 18), qVar2), p3Var.f47887g);
                            ta.a aVar31 = p3Var.f47886f;
                            kotlin.jvm.internal.m.c(aVar31);
                            ((LinearLayout) ((hj.i2) aVar31).f32691e.f33679g).setVisibility(8);
                            ta.a aVar32 = p3Var.f47886f;
                            kotlin.jvm.internal.m.c(aVar32);
                            ((FrameLayout) ((hj.i2) aVar32).f32691e.f33678f).setVisibility(8);
                        }
                        break;
                    case 4:
                        kotlin.jvm.internal.m.f(it2, "it");
                        f7.a0 a0Var8 = p3Var.f48115i;
                        if (a0Var8 != null) {
                            a0Var8.l0(5, 0L);
                        }
                        qx.h.m(300L, TimeUnit.MILLISECONDS, ky.e.f38937b).g(px.b.a()).h(new o20.w(p3Var, 15), qVar2);
                        ta.a aVar33 = p3Var.f47886f;
                        kotlin.jvm.internal.m.c(aVar33);
                        ((LinearLayout) ((hj.i2) aVar33).f32691e.f33679g).setVisibility(8);
                        ta.a aVar34 = p3Var.f47886f;
                        kotlin.jvm.internal.m.c(aVar34);
                        ((FrameLayout) ((hj.i2) aVar34).f32691e.f33678f).setVisibility(8);
                        break;
                    default:
                        kotlin.jvm.internal.m.f(it2, "it");
                        f7.a0 a0Var9 = p3Var.f48115i;
                        if (a0Var9 != null) {
                            a0Var9.l0(5, 0L);
                        }
                        th.j.a(qx.h.m(300L, TimeUnit.MILLISECONDS, ky.e.f38937b).g(px.b.a()).h(new lp.b(p3Var, 22), qVar2), p3Var.f47887g);
                        ta.a aVar35 = p3Var.f47886f;
                        kotlin.jvm.internal.m.c(aVar35);
                        ((LinearLayout) ((hj.i2) aVar35).f32691e.f33679g).setVisibility(8);
                        ta.a aVar36 = p3Var.f47886f;
                        kotlin.jvm.internal.m.c(aVar36);
                        ((FrameLayout) ((hj.i2) aVar36).f32691e.f33678f).setVisibility(8);
                        break;
                }
                return b0Var;
            }
        });
        ta.a aVar31 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar31);
        bq.m.I(((hj.i2) aVar31).f32689c);
    }

    public final void r() {
        ta.a aVar = this.f47886f;
        kotlin.jvm.internal.m.c(aVar);
        int childCount = ((hj.i2) aVar).f32690d.getChildCount();
        int i11 = 0;
        for (int i12 = 0; i12 < childCount; i12++) {
            ta.a aVar2 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar2);
            View childAt = ((hj.i2) aVar2).f32690d.getChildAt(i12);
            kotlin.jvm.internal.m.d(childAt, "null cannot be cast to non-null type com.google.android.flexbox.FlexboxLayout");
            if (((FlexboxLayout) childAt).getVisibility() == 0) {
                i11++;
            }
        }
        ta.a aVar3 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar3);
        int childCount2 = ((hj.i2) aVar3).f32690d.getChildCount();
        for (int i13 = 0; i13 < childCount2; i13++) {
            ta.a aVar4 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar4);
            View childAt2 = ((hj.i2) aVar4).f32690d.getChildAt(i13);
            kotlin.jvm.internal.m.d(childAt2, "null cannot be cast to non-null type com.google.android.flexbox.FlexboxLayout");
            FlexboxLayout flexboxLayout = (FlexboxLayout) childAt2;
            int childCount3 = flexboxLayout.getChildCount();
            boolean z11 = true;
            for (int i14 = 0; i14 < childCount3; i14++) {
                View childAt3 = flexboxLayout.getChildAt(i14);
                kotlin.jvm.internal.m.d(childAt3, "null cannot be cast to non-null type android.widget.FrameLayout");
                if (((FrameLayout) childAt3).getVisibility() == 0) {
                    z11 = false;
                }
            }
            if (!z11) {
                flexboxLayout.setVisibility(0);
            } else if (i11 > 2) {
                flexboxLayout.setVisibility(8);
            }
        }
    }

    public final void s(int i11) {
        if (i11 > 0) {
            ta.a aVar = this.f47886f;
            kotlin.jvm.internal.m.c(aVar);
            Editable text = ((hj.i2) aVar).f32689c.getText();
            ArrayList arrayList = this.m;
            int size = arrayList.size();
            int length = 0;
            for (int i12 = 0; i12 < size; i12++) {
                FrameLayout frameLayout = (FrameLayout) arrayList.get(i12);
                Object tag = frameLayout.getTag();
                kotlin.jvm.internal.m.d(tag, "null cannot be cast to non-null type com.lingo.lingoskill.object.Word");
                String strB = fr.j3.B((Word) tag);
                if (i11 > length && i11 <= strB.length() + length) {
                    text.delete(length, strB.length() + length);
                    frameLayout.setVisibility(0);
                    frameLayout.setClickable(true);
                    arrayList.remove(frameLayout);
                    r();
                    break;
                }
                length += strB.length();
            }
            kotlin.jvm.internal.m.c(text);
            if (text.length() > 0) {
                int[] iArr = bq.r.f4959a;
                if (bq.m.F()) {
                    return;
                }
                String upperCase = String.valueOf(text.charAt(0)).toUpperCase(bq.m.p());
                kotlin.jvm.internal.m.e(upperCase, "toUpperCase(...)");
                text.replace(0, 1, upperCase);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0065  */
    /* JADX WARN: Code duplicated, block: B:18:0x0070  */
    public final String t() {
        ArrayList arrayList = this.m;
        int size = arrayList.size();
        String strM = BuildConfig.VERSION_NAME;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            Object tag = ((FrameLayout) obj).getTag();
            kotlin.jvm.internal.m.d(tag, "null cannot be cast to non-null type com.lingo.lingoskill.object.Word");
            strM = defpackage.e.m(strM, fr.j3.B((Word) tag));
        }
        ArrayList arrayList2 = this.f48121p;
        int size2 = arrayList2.size();
        String strM2 = BuildConfig.VERSION_NAME;
        int i12 = 0;
        while (i12 < size2) {
            Object obj2 = arrayList2.get(i12);
            i12++;
            Word word = (Word) obj2;
            if (word.getWordType() != 1) {
                strM2 = defpackage.e.m(strM2, fr.j3.B(word));
            }
        }
        if (!kotlin.jvm.internal.m.a(strM, BuildConfig.VERSION_NAME)) {
            String strSubstring = strM2.substring(0, strM.length());
            kotlin.jvm.internal.m.e(strSubstring, "substring(...)");
            if (strSubstring.equals(strM)) {
                if (arrayList2.size() != arrayList.size()) {
                    return fr.j3.B((Word) arrayList2.get(arrayList.size()));
                }
            }
        } else if (arrayList2.size() != arrayList.size()) {
            return fr.j3.B((Word) arrayList2.get(arrayList.size()));
        }
        return BuildConfig.VERSION_NAME;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x002e  */
    public final void u(int i11, String str) {
        ta.a aVar = this.f47886f;
        kotlin.jvm.internal.m.c(aVar);
        Editable text = ((hj.i2) aVar).f32689c.getText();
        if (i11 == 0) {
            int[] iArr = bq.r.f4959a;
            if (bq.m.F() || !w()) {
                text.insert(i11, str);
            } else {
                String upperCase = str.toUpperCase(bq.m.p());
                kotlin.jvm.internal.m.e(upperCase, "toUpperCase(...)");
                text.insert(i11, upperCase);
            }
        } else {
            text.insert(i11, str);
        }
        if (text.length() > 1) {
            int[] iArr2 = bq.r.f4959a;
            if (bq.m.F()) {
                return;
            }
            text.replace(1, 2, hh.p0.n("getDefault(...)", String.valueOf(text.charAt(1)), "toLowerCase(...)"));
        }
    }

    public final void v() {
        Env env;
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        if (cf.x.n().keyLanguage != 1 && cf.x.n().keyLanguage != 12) {
            Sentence sentence = this.f48116j;
            if (sentence != null) {
                q(zq.c.b(sentence));
                return;
            } else {
                kotlin.jvm.internal.m.n("mModel");
                throw null;
            }
        }
        StringBuilder sb2 = new StringBuilder();
        Sentence sentence2 = this.f48116j;
        if (sentence2 == null) {
            kotlin.jvm.internal.m.n("mModel");
            throw null;
        }
        Iterator<Word> it = sentence2.getSentWords().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            env = this.f47884d;
            if (!zHasNext) {
                break;
            }
            Word next = it.next();
            int i11 = env.jsDisPlay;
            if (i11 == 2 || i11 == 4) {
                String luoma = next.getLuoma();
                kotlin.jvm.internal.m.e(luoma, "getLuoma(...)");
                sb2.append(oz.x.q0(luoma, " ", BuildConfig.VERSION_NAME));
                sb2.append(" ");
            } else {
                sb2.append(next.getZhuyin());
            }
        }
        switch (env.jsDisPlay) {
            case 0:
                Sentence sentence3 = this.f48116j;
                if (sentence3 == null) {
                    kotlin.jvm.internal.m.n("mModel");
                    throw null;
                }
                q(sentence3.getSentence() + "\n" + ((Object) sb2));
                ta.a aVar = this.f47886f;
                kotlin.jvm.internal.m.c(aVar);
                ((hj.i2) aVar).f32689c.setHint(R.string.write_the_sentence_in_hiragana);
                return;
            case 1:
                Sentence sentence4 = this.f48116j;
                if (sentence4 == null) {
                    kotlin.jvm.internal.m.n("mModel");
                    throw null;
                }
                q(sentence4.getTranslations() + "\n" + ((Object) sb2));
                ta.a aVar2 = this.f47886f;
                kotlin.jvm.internal.m.c(aVar2);
                ((hj.i2) aVar2).f32689c.setHint(R.string.write_the_sentence_in_hiragana);
                return;
            case 2:
                Sentence sentence5 = this.f48116j;
                if (sentence5 == null) {
                    kotlin.jvm.internal.m.n("mModel");
                    throw null;
                }
                q(sentence5.getTranslations() + "\n" + ((Object) sb2));
                ta.a aVar3 = this.f47886f;
                kotlin.jvm.internal.m.c(aVar3);
                ((hj.i2) aVar3).f32689c.setHint(R.string.write_the_sentence_in_romaji);
                return;
            case 3:
                Sentence sentence6 = this.f48116j;
                if (sentence6 == null) {
                    kotlin.jvm.internal.m.n("mModel");
                    throw null;
                }
                q(sentence6.getSentence() + "\n" + ((Object) sb2));
                ta.a aVar4 = this.f47886f;
                kotlin.jvm.internal.m.c(aVar4);
                ((hj.i2) aVar4).f32689c.setHint(R.string.write_the_sentence_in_hiragana);
                return;
            case 4:
                Sentence sentence7 = this.f48116j;
                if (sentence7 == null) {
                    kotlin.jvm.internal.m.n("mModel");
                    throw null;
                }
                q(sentence7.getSentence() + "\n" + ((Object) sb2));
                ta.a aVar5 = this.f47886f;
                kotlin.jvm.internal.m.c(aVar5);
                ((hj.i2) aVar5).f32689c.setHint(R.string.write_the_sentence_in_romaji);
                return;
            case 5:
                Sentence sentence8 = this.f48116j;
                if (sentence8 == null) {
                    kotlin.jvm.internal.m.n("mModel");
                    throw null;
                }
                q(sentence8.getTranslations() + "\n" + ((Object) sb2));
                ta.a aVar6 = this.f47886f;
                kotlin.jvm.internal.m.c(aVar6);
                ((hj.i2) aVar6).f32689c.setHint(R.string.write_the_sentence_in_hiragana);
                return;
            case 6:
                Sentence sentence9 = this.f48116j;
                if (sentence9 == null) {
                    kotlin.jvm.internal.m.n("mModel");
                    throw null;
                }
                q(sentence9.getSentence() + "\n" + ((Object) sb2));
                ta.a aVar7 = this.f47886f;
                kotlin.jvm.internal.m.c(aVar7);
                ((hj.i2) aVar7).f32689c.setHint(R.string.write_the_sentence_in_hiragana);
                return;
            default:
                return;
        }
    }

    public final boolean w() {
        int[] iArr = bq.r.f4959a;
        if (bq.m.F()) {
            return false;
        }
        Sentence sentence = this.f48116j;
        if (sentence == null) {
            kotlin.jvm.internal.m.n("mModel");
            throw null;
        }
        List<Word> sentWords = sentence.getSentWords();
        Sentence sentence2 = this.f48116j;
        if (sentence2 != null) {
            return sentWords.get(sentence2.getSentWords().size() - 1).getWordType() == 1;
        }
        kotlin.jvm.internal.m.n("mModel");
        throw null;
    }

    public final void x() {
        String strT;
        if (this.m.size() == this.f48119n.size() || ((jp.p0) this.f47881a).Q) {
            ta.a aVar = this.f47886f;
            kotlin.jvm.internal.m.c(aVar);
            ((hj.i2) aVar).f32694h.setVisibility(8);
        } else {
            ta.a aVar2 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar2);
            ((hj.i2) aVar2).f32694h.setVisibility(0);
        }
        try {
            strT = t();
        } catch (Exception e8) {
            e8.printStackTrace();
            strT = BuildConfig.VERSION_NAME;
        }
        if (strT.equals(BuildConfig.VERSION_NAME)) {
            ta.a aVar3 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar3);
            ((hj.i2) aVar3).f32693g.setImageResource(R.drawable.ic_hint_eye);
        } else {
            ta.a aVar4 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar4);
            ((hj.i2) aVar4).f32693g.setImageResource(R.drawable.ic_hint_eye_ls);
        }
    }
}
