package qp;

import android.animation.LayoutTransition;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.flexbox.FlexboxLayout;
import com.google.type.bACG.scNRoQgKSYX;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.object.Sentence;
import com.lingo.lingoskill.object.Word;
import com.lingodeer.R;
import com.lingodeer.data.env.Env;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class b0 extends d {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Sentence f47834i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ObjectAnimator f47835j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public hh.s f47836k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f47837l;
    public final ArrayList m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ArrayList f47838n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ArrayList f47839o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ArrayList f47840p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final List f47841q;

    public b0(mp.b bVar, long j11) {
        super(bVar, j11);
        this.f47837l = new ArrayList();
        this.m = new ArrayList();
        this.f47838n = new ArrayList();
        this.f47839o = new ArrayList();
        this.f47840p = new ArrayList();
        int[] iArr = bq.r.f4959a;
        this.f47841q = bq.m.b();
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0190  */
    /* JADX WARN: Code duplicated, block: B:37:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:54:0x01df  */
    /* JADX WARN: Code duplicated, block: B:58:0x020e A[Catch: Exception -> 0x021a, TRY_LEAVE, TryCatch #0 {Exception -> 0x021a, blocks: (B:56:0x01e4, B:58:0x020e), top: B:104:0x01e4 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x022a  */
    /* JADX WARN: Code duplicated, block: B:75:0x023c  */
    /* JADX WARN: Code duplicated, block: B:94:0x02e8  */
    @Override // hi.a
    public final boolean a() {
        boolean z11;
        String str;
        String str2;
        ArrayList arrayList;
        String lowerCase;
        String lowerCase2;
        ta.a aVar = this.f47886f;
        kotlin.jvm.internal.m.c(aVar);
        ta.a aVar2 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar2);
        if (((hj.i1) aVar2).f32681d.getText() == null) {
            return false;
        }
        ta.a aVar3 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar3);
        String string = ((hj.i1) aVar3).f32681d.getText().toString();
        ArrayList arrayList2 = this.f47839o;
        int size = arrayList2.size();
        int i11 = 0;
        String strM = BuildConfig.VERSION_NAME;
        while (i11 < size) {
            Object obj = arrayList2.get(i11);
            i11++;
            Word word = (Word) obj;
            if (word.getWordType() != 1) {
                strM = defpackage.e.m(strM, fr.j3.B(word));
            }
        }
        ta.a aVar4 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar4);
        ((hj.i1) aVar4).f32679b.setVisibility(4);
        ta.a aVar5 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar5);
        ((hj.i1) aVar5).f32679b.setClickable(false);
        ta.a aVar6 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar6);
        ((hj.i1) aVar6).f32682e.setVisibility(8);
        w(8);
        ta.a aVar7 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar7);
        ((hj.i1) aVar7).f32681d.setFocusable(false);
        ta.a aVar8 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar8);
        ((hj.i1) aVar8).f32681d.setClickable(false);
        ArrayList arrayList3 = new ArrayList();
        String strQ0 = oz.x.q0(oz.x.q0(oz.x.q0(oz.x.q0(oz.x.q0(oz.x.q0(string, "َّ", "َّ"), "ِّ", "ِّ"), "ُّ", "ُّ"), "ًّ", "ًّ"), "ٍّ", "ٍّ"), "ٌّ", "ٌّ");
        String strQ1 = oz.x.q0(oz.x.q0(oz.x.q0(oz.x.q0(oz.x.q0(oz.x.q0(strM, "َّ", "َّ"), "ِّ", "ِّ"), "ُّ", "ُّ"), "ًّ", "ًّ"), "ٍّ", "ٍّ"), "ٌّ", "ٌّ");
        boolean zEqualsIgnoreCase = strQ0.equalsIgnoreCase(strQ1);
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        if ((cf.x.n().keyLanguage == 2 || cf.x.n().keyLanguage == 13) && cf.x.n().ignoreSpace) {
            Locale locale = Locale.getDefault();
            kotlin.jvm.internal.m.e(locale, "getDefault(...)");
            String lowerCase3 = strQ0.toLowerCase(locale);
            kotlin.jvm.internal.m.e(lowerCase3, "toLowerCase(...)");
            String strQ2 = oz.x.q0(lowerCase3, " ", BuildConfig.VERSION_NAME);
            Locale locale2 = Locale.getDefault();
            kotlin.jvm.internal.m.e(locale2, "getDefault(...)");
            String lowerCase4 = strQ1.toLowerCase(locale2);
            kotlin.jvm.internal.m.e(lowerCase4, "toLowerCase(...)");
            zEqualsIgnoreCase = strQ2.equals(oz.x.q0(lowerCase4, " ", BuildConfig.VERSION_NAME));
        }
        String str3 = "́";
        int i12 = 22;
        int i13 = 10;
        if (!zEqualsIgnoreCase && (cf.x.n().keyLanguage == 10 || cf.x.n().keyLanguage == 22)) {
            strQ1 = oz.x.q0(strQ1, "́", BuildConfig.VERSION_NAME);
        }
        String str4 = strQ1;
        int length = str4.length();
        int i14 = 0;
        int i15 = 0;
        while (i14 < length) {
            String str5 = String.valueOf(str4.charAt(i14));
            if (kotlin.jvm.internal.m.a(str5, str3)) {
                LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
                if (cf.x.n().keyLanguage == i13 || cf.x.n().keyLanguage == i12) {
                    i15++;
                    z11 = zEqualsIgnoreCase;
                    str = str3;
                    str2 = str4;
                } else {
                    z11 = zEqualsIgnoreCase;
                    str = str3;
                    str2 = str4;
                    if (i14 < strQ0.length() + i15) {
                        kotlin.jvm.internal.m.f(str5, "str");
                        if ((Pattern.matches("\\p{Punct}", str5) && !str5.equals("...") && !str5.equals(" ") && !str5.equals("～")) || str5.equals("-") || str5.equals("'") || str5.equals(" ") || str5.equals("_")) {
                            try {
                                String strValueOf = String.valueOf(strQ0.charAt(i14 - i15));
                                Locale locale3 = Locale.getDefault();
                                kotlin.jvm.internal.m.e(locale3, "getDefault(...)");
                                lowerCase = str5.toLowerCase(locale3);
                                kotlin.jvm.internal.m.e(lowerCase, "toLowerCase(...)");
                                Locale locale4 = Locale.getDefault();
                                kotlin.jvm.internal.m.e(locale4, "getDefault(...)");
                                lowerCase2 = strValueOf.toLowerCase(locale4);
                                kotlin.jvm.internal.m.e(lowerCase2, "toLowerCase(...)");
                                if (lowerCase.equals(lowerCase2)) {
                                    arrayList = arrayList3;
                                    try {
                                        arrayList.add(Integer.valueOf(i14));
                                    } catch (Exception e8) {
                                        e = e8;
                                        e.printStackTrace();
                                    }
                                }
                            } catch (Exception e10) {
                                e = e10;
                                arrayList = arrayList3;
                            }
                        } else {
                            arrayList = arrayList3;
                            kotlin.jvm.internal.m.f(str5, "str");
                            if ((Pattern.matches("\\p{Punct}", str5) && !str5.equals("...") && !str5.equals(" ") && !str5.equals("～")) || str5.equals("-") || str5.equals("'") || str5.equals(" ") || str5.equals("_")) {
                                arrayList.add(Integer.valueOf(i14));
                            }
                        }
                    } else {
                        arrayList = arrayList3;
                        kotlin.jvm.internal.m.f(str5, "str");
                        i15 = Pattern.matches("\\p{Punct}", str5) ? i15 + 1 : i15 + 1;
                    }
                }
                arrayList = arrayList3;
            } else {
                z11 = zEqualsIgnoreCase;
                str = str3;
                str2 = str4;
                if (i14 < strQ0.length() + i15) {
                    kotlin.jvm.internal.m.f(str5, "str");
                    if (Pattern.matches("\\p{Punct}", str5)) {
                        arrayList = arrayList3;
                        kotlin.jvm.internal.m.f(str5, "str");
                        if (Pattern.matches("\\p{Punct}", str5)) {
                        }
                    } else {
                        arrayList = arrayList3;
                        kotlin.jvm.internal.m.f(str5, "str");
                        if (Pattern.matches("\\p{Punct}", str5)) {
                        }
                    }
                    String strValueOf2 = String.valueOf(strQ0.charAt(i14 - i15));
                    Locale locale5 = Locale.getDefault();
                    kotlin.jvm.internal.m.e(locale5, "getDefault(...)");
                    lowerCase = str5.toLowerCase(locale5);
                    kotlin.jvm.internal.m.e(lowerCase, "toLowerCase(...)");
                    Locale locale6 = Locale.getDefault();
                    kotlin.jvm.internal.m.e(locale6, "getDefault(...)");
                    lowerCase2 = strValueOf2.toLowerCase(locale6);
                    kotlin.jvm.internal.m.e(lowerCase2, "toLowerCase(...)");
                    if (lowerCase.equals(lowerCase2)) {
                        arrayList = arrayList3;
                    } else {
                        arrayList = arrayList3;
                        arrayList.add(Integer.valueOf(i14));
                    }
                } else {
                    arrayList = arrayList3;
                    kotlin.jvm.internal.m.f(str5, "str");
                    if (Pattern.matches("\\p{Punct}", str5)) {
                    }
                }
            }
            i14++;
            arrayList3 = arrayList;
            zEqualsIgnoreCase = z11;
            str3 = str;
            str4 = str2;
            i12 = 22;
            i13 = 10;
        }
        boolean z12 = zEqualsIgnoreCase;
        String str6 = str4;
        ArrayList arrayList4 = arrayList3;
        Context context = this.f47883c;
        if (z12) {
            ta.a aVar9 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar9);
            ((hj.i1) aVar9).f32681d.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, context.getDrawable(R.drawable.line_correct));
            ta.a aVar10 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar10);
            ((hj.i1) aVar10).f32681d.setTextColor(context.getColor(R.color.color_43CC93));
        } else {
            LingoSkillApplication lingoSkillApplication3 = LingoSkillApplication.f21665b;
            if (ry.l.D(new Integer[]{51, 55}, Integer.valueOf(cf.x.n().keyLanguage))) {
                ta.a aVar11 = this.f47886f;
                kotlin.jvm.internal.m.c(aVar11);
                ((hj.i1) aVar11).f32681d.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, context.getDrawable(R.drawable.line_correct));
                ta.a aVar12 = this.f47886f;
                kotlin.jvm.internal.m.c(aVar12);
                ((hj.i1) aVar12).f32681d.setTextColor(context.getColor(R.color.color_43CC93));
            } else {
                ta.a aVar13 = this.f47886f;
                kotlin.jvm.internal.m.c(aVar13);
                ((hj.i1) aVar13).f32681d.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, context.getDrawable(R.drawable.line_wrong));
                ta.a aVar14 = this.f47886f;
                kotlin.jvm.internal.m.c(aVar14);
                ((hj.i1) aVar14).f32681d.setTextColor(context.getColor(R.color.color_FF6666));
                if (!ry.l.D(new Integer[]{51, 55}, Integer.valueOf(cf.x.n().keyLanguage))) {
                    mp.b bVar = this.f47881a;
                    kotlin.jvm.internal.m.d(bVar, "null cannot be cast to non-null type com.lingo.lingoskill.ui.learn.BaseLessonTestFragment");
                    ((jp.p0) bVar).f36528d0 = new xq.c(gb.r.N(str6), this, arrayList4, 28);
                }
            }
        }
        ta.a aVar15 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar15);
        ((LottieAnimationView) ((hj.i1) aVar15).f32680c.f32359e).e();
        ta.a aVar16 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar16);
        ((LottieAnimationView) ((hj.i1) aVar16).f32680c.f32359e).setRepeatCount(0);
        List list = this.f47841q;
        if (z12) {
            ta.a aVar17 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar17);
            LottieAnimationView lottieAnimationView = (LottieAnimationView) ((hj.i1) aVar17).f32680c.f32360f;
            Collection collection = (Collection) list.get(1);
            jz.d dVar = jz.e.f37397a;
            lottieAnimationView.setAnimation(((Number) ry.m.I0(collection)).intValue());
        } else {
            ta.a aVar18 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar18);
            LottieAnimationView lottieAnimationView2 = (LottieAnimationView) ((hj.i1) aVar18).f32680c.f32360f;
            Collection collection2 = (Collection) list.get(2);
            jz.d dVar2 = jz.e.f37397a;
            lottieAnimationView2.setAnimation(((Number) ry.m.I0(collection2)).intValue());
        }
        if (this.f47884d.showAnim) {
            ta.a aVar19 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar19);
            ((LottieAnimationView) ((hj.i1) aVar19).f32680c.f32360f).d(new f(this, 2));
        } else {
            ta.a aVar20 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar20);
            ((LottieAnimationView) ((hj.i1) aVar20).f32680c.f32359e).e();
        }
        return z12;
    }

    @Override // hi.a
    public final String b() {
        qy.q qVar = fv.b.f28186a;
        return fv.b.G(u().getSentenceId(), null, null);
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
        ((hj.i1) aVar).f32681d.removeTextChangedListener(this.f47836k);
        ObjectAnimator objectAnimator = this.f47835j;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
        }
        ObjectAnimator objectAnimator2 = this.f47835j;
        if (objectAnimator2 != null) {
            objectAnimator2.cancel();
        }
    }

    @Override // hi.a
    public final int i() {
        return 1;
    }

    @Override // hi.a
    public final void j() {
        Sentence sentenceE = ij.c.e(this.f47882b);
        if (sentenceE == null) {
            throw new IllegalArgumentException();
        }
        this.f47834i = sentenceE;
        this.f47838n.addAll(fr.j3.x(u()));
        this.f47839o.addAll(fr.j3.t(u()));
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
        ArrayList arrayList3 = this.m;
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
            if (iL2 <= ((hj.i1) aVar).f32682e.getWidth()) {
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
        int childCount = ((hj.i1) aVar2).f32682e.getChildCount();
        for (int i15 = 0; i15 < childCount; i15++) {
            ta.a aVar3 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar3);
            View childAt = ((hj.i1) aVar3).f32682e.getChildAt(i15);
            kotlin.jvm.internal.m.d(childAt, "null cannot be cast to non-null type com.google.android.flexbox.FlexboxLayout");
            ((FlexboxLayout) childAt).removeAllViews();
        }
        ta.a aVar4 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar4);
        ((hj.i1) aVar4).f32682e.removeAllViews();
        int size2 = arrayList2.size();
        int i16 = 0;
        while (i16 < size2) {
            Object obj2 = arrayList2.get(i16);
            i16++;
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f47883c);
            ta.a aVar5 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar5);
            View viewInflate = layoutInflaterFrom.inflate(R.layout.include_flexbox_layout, (ViewGroup) ((hj.i1) aVar5).f32682e, false);
            kotlin.jvm.internal.m.d(viewInflate, "null cannot be cast to non-null type com.google.android.flexbox.FlexboxLayout");
            FlexboxLayout flexboxLayout = (FlexboxLayout) viewInflate;
            Iterator it = ((List) obj2).iterator();
            while (it.hasNext()) {
                flexboxLayout.addView((FrameLayout) it.next());
            }
            ta.a aVar6 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar6);
            ((hj.i1) aVar6).f32682e.addView(flexboxLayout);
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
        ArrayList arrayList4 = this.f47837l;
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
        ((hj.i1) aVar7).f32681d.setText(strM);
        x();
    }

    @Override // qp.d
    public final fz.f n() {
        return a0.f47819a;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x015b  */
    @Override // qp.d
    public final void p() {
        jp.p0 p0Var = (jp.p0) this.f47881a;
        p0Var.O(6);
        Context context = this.f47883c;
        kotlin.jvm.internal.m.d(context, "null cannot be cast to non-null type android.app.Activity");
        final int i11 = 3;
        ((Activity) context).getWindow().setSoftInputMode(3);
        final int i12 = 1;
        try {
            Method method = EditText.class.getMethod("setShowSoftInputOnFocus", Boolean.TYPE);
            kotlin.jvm.internal.m.e(method, "getMethod(...)");
            method.setAccessible(true);
            ta.a aVar = this.f47886f;
            kotlin.jvm.internal.m.c(aVar);
            method.invoke(((hj.i1) aVar).f32681d, Boolean.FALSE);
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        ta.a aVar2 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar2);
        ((hj.i1) aVar2).f32681d.setFocusable(true);
        ta.a aVar3 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar3);
        ((hj.i1) aVar3).f32681d.setFocusableInTouchMode(true);
        ta.a aVar4 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar4);
        ((hj.i1) aVar4).f32681d.requestFocus();
        TextView textView = (TextView) o().findViewById(R.id.tv_translation);
        String translations = u().getTranslations();
        kotlin.jvm.internal.m.e(translations, "getTranslations(...)");
        textView.setText(translations);
        x();
        final int i13 = 0;
        if (p0Var.Q) {
            w(8);
        } else {
            w(0);
        }
        th.j.a(qx.h.m(500L, TimeUnit.MILLISECONDS, ky.e.f38937b).g(px.b.a()).h(new o20.w(this, 9), c.f47863e), this.f47887g);
        View viewFindViewById = o().findViewById(R.id.btn_try);
        kotlin.jvm.internal.m.e(viewFindViewById, "findViewById(...)");
        bq.z.b(viewFindViewById, new fz.c(this) { // from class: qp.y

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b0 f48266b;

            {
                this.f48266b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                String strT;
                int i14 = i13;
                int i15 = 0;
                qy.b0 b0Var = qy.b0.f48488a;
                b0 b0Var2 = this.f48266b;
                View it = (View) obj;
                switch (i14) {
                    case 0:
                        kotlin.jvm.internal.m.f(it, "it");
                        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                        cf.x.n().isKeyboard = !cf.x.n().isKeyboard;
                        cf.x.n().updateEntry("isKeyboard");
                        ((jp.p0) b0Var2.f47881a).A().l();
                        break;
                    case 1:
                        kotlin.jvm.internal.m.f(it, "it");
                        mp.b bVar = b0Var2.f47881a;
                        String strB = b0Var2.b();
                        ta.a aVar5 = b0Var2.f47886f;
                        kotlin.jvm.internal.m.c(aVar5);
                        ImageView ivAudio = (ImageView) ((hj.i1) aVar5).f32680c.f32358d;
                        kotlin.jvm.internal.m.e(ivAudio, "ivAudio");
                        ((jp.p0) bVar).H(ivAudio, strB);
                        break;
                    case 2:
                        kotlin.jvm.internal.m.f(it, "it");
                        mp.b bVar2 = b0Var2.f47881a;
                        String strB2 = b0Var2.b();
                        ta.a aVar6 = b0Var2.f47886f;
                        kotlin.jvm.internal.m.c(aVar6);
                        ImageView ivAudio2 = (ImageView) ((hj.i1) aVar6).f32680c.f32358d;
                        kotlin.jvm.internal.m.e(ivAudio2, "ivAudio");
                        ((jp.p0) bVar2).H(ivAudio2, strB2);
                        break;
                    case 3:
                        kotlin.jvm.internal.m.f(it, "it");
                        ArrayList arrayList = b0Var2.f47840p;
                        Context context2 = b0Var2.f47883c;
                        try {
                            strT = b0Var2.t();
                        } catch (Exception e10) {
                            e10.printStackTrace();
                            strT = BuildConfig.VERSION_NAME;
                        }
                        if (!strT.equals(BuildConfig.VERSION_NAME)) {
                            ArrayList arrayList2 = b0Var2.m;
                            int size = arrayList2.size();
                            int i16 = 0;
                            while (i16 < size) {
                                Object obj2 = arrayList2.get(i16);
                                i16++;
                                FrameLayout frameLayout = (FrameLayout) obj2;
                                Object tag = frameLayout.getTag();
                                kotlin.jvm.internal.m.d(tag, "null cannot be cast to non-null type com.lingo.lingoskill.object.Word");
                                String strB3 = fr.j3.B((Word) tag);
                                if (frameLayout.getVisibility() == 0 && strB3.equalsIgnoreCase(strT)) {
                                    frameLayout.setScaleX(1.0f);
                                    frameLayout.setScaleY(1.0f);
                                    Iterator it2 = arrayList.iterator();
                                    kotlin.jvm.internal.m.e(it2, "iterator(...)");
                                    while (it2.hasNext()) {
                                        Object next = it2.next();
                                        kotlin.jvm.internal.m.e(next, "next(...)");
                                        ((ValueAnimator) next).cancel();
                                    }
                                    arrayList.clear();
                                    ValueAnimator valueAnimatorOfArgb = ValueAnimator.ofArgb(fr.j3.G(context2, R.color.white), context2.getColor(R.color.colorAccent));
                                    valueAnimatorOfArgb.addUpdateListener(new x(frameLayout, 0));
                                    valueAnimatorOfArgb.setDuration(600L);
                                    valueAnimatorOfArgb.start();
                                    arrayList.add(valueAnimatorOfArgb);
                                    ValueAnimator valueAnimatorOfArgb2 = ValueAnimator.ofArgb(context2.getColor(R.color.primary_black), context2.getColor(R.color.white));
                                    valueAnimatorOfArgb2.addUpdateListener(new x(frameLayout, 1));
                                    valueAnimatorOfArgb2.setDuration(600L);
                                    valueAnimatorOfArgb2.start();
                                    arrayList.add(valueAnimatorOfArgb2);
                                    ValueAnimator valueAnimatorOfArgb3 = ValueAnimator.ofArgb(context2.getColor(R.color.colorAccent), context2.getColor(R.color.white));
                                    valueAnimatorOfArgb3.addUpdateListener(new x(frameLayout, 2));
                                    valueAnimatorOfArgb3.setStartDelay(1000L);
                                    valueAnimatorOfArgb3.setDuration(600L);
                                    valueAnimatorOfArgb3.start();
                                    arrayList.add(valueAnimatorOfArgb3);
                                    ValueAnimator valueAnimatorOfArgb4 = ValueAnimator.ofArgb(context2.getColor(R.color.white), context2.getColor(R.color.primary_black));
                                    valueAnimatorOfArgb4.addUpdateListener(new x(frameLayout, 3));
                                    valueAnimatorOfArgb4.setStartDelay(1000L);
                                    valueAnimatorOfArgb4.setDuration(600L);
                                    valueAnimatorOfArgb4.start();
                                    arrayList.add(valueAnimatorOfArgb4);
                                    break;
                                }
                            }
                        } else {
                            ta.a aVar7 = b0Var2.f47886f;
                            kotlin.jvm.internal.m.c(aVar7);
                            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(((hj.i1) aVar7).f32684g, "translationX", CropImageView.DEFAULT_ASPECT_RATIO, 15.0f, -15.0f, CropImageView.DEFAULT_ASPECT_RATIO);
                            if (objectAnimatorOfFloat != null) {
                                objectAnimatorOfFloat.setDuration(300L);
                                objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
                                objectAnimatorOfFloat.start();
                                ta.a aVar8 = b0Var2.f47886f;
                                kotlin.jvm.internal.m.c(aVar8);
                                b0Var2.f47835j = ObjectAnimator.ofFloat(((hj.i1) aVar8).f32681d, "translationX", CropImageView.DEFAULT_ASPECT_RATIO, 15.0f, -15.0f, CropImageView.DEFAULT_ASPECT_RATIO);
                                objectAnimatorOfFloat.setDuration(300L);
                                objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
                                objectAnimatorOfFloat.start();
                            } else {
                                objectAnimatorOfFloat = null;
                            }
                            b0Var2.f47835j = objectAnimatorOfFloat;
                            ta.a aVar9 = b0Var2.f47886f;
                            kotlin.jvm.internal.m.c(aVar9);
                            ((hj.i1) aVar9).f32681d.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, context2.getApplicationContext().getDrawable(R.drawable.line_wrong));
                            ta.a aVar10 = b0Var2.f47886f;
                            kotlin.jvm.internal.m.c(aVar10);
                            ((hj.i1) aVar10).f32681d.setTextColor(context2.getColor(R.color.color_FF6666));
                            th.j.a(qx.h.m(300L, TimeUnit.MILLISECONDS, ky.e.f38937b).g(px.b.a()).h(new lp.b(b0Var2, 16), c.f47864f), b0Var2.f47887g);
                        }
                        break;
                    case 4:
                        kotlin.jvm.internal.m.f(it, "it");
                        Env env = b0Var2.f47884d;
                        ArrayList arrayList3 = b0Var2.m;
                        boolean z11 = env.examCharAudioSwitch;
                        env.examCharAudioSwitch = !z11;
                        if (!z11) {
                            ta.a aVar11 = b0Var2.f47886f;
                            kotlin.jvm.internal.m.c(aVar11);
                            ((hj.i1) aVar11).f32683f.setImageResource(R.drawable.ic_hint_audio);
                            int size2 = arrayList3.size();
                            int i17 = 0;
                            while (i17 < size2) {
                                Object obj3 = arrayList3.get(i17);
                                i17++;
                                FrameLayout frameLayout2 = (FrameLayout) obj3;
                                TextView textView2 = (TextView) frameLayout2.findViewById(R.id.tv_char);
                                ImageView imageView = (ImageView) frameLayout2.findViewById(R.id.iv_hint_audio);
                                if (kotlin.jvm.internal.m.a(textView2.getText().toString(), " ")) {
                                    imageView.setVisibility(8);
                                } else {
                                    imageView.setVisibility(0);
                                }
                            }
                        } else {
                            ta.a aVar12 = b0Var2.f47886f;
                            kotlin.jvm.internal.m.c(aVar12);
                            ((hj.i1) aVar12).f32683f.setImageResource(R.drawable.ic_hint_audio_close);
                            int size3 = arrayList3.size();
                            while (i15 < size3) {
                                Object obj4 = arrayList3.get(i15);
                                i15++;
                                ((ImageView) ((FrameLayout) obj4).findViewById(R.id.iv_hint_audio)).setVisibility(8);
                            }
                        }
                        break;
                    default:
                        kotlin.jvm.internal.m.f(it, "it");
                        ta.a aVar13 = b0Var2.f47886f;
                        kotlin.jvm.internal.m.c(aVar13);
                        try {
                            b0Var2.s(((hj.i1) aVar13).f32681d.getSelectionStart());
                        } catch (Exception e11) {
                            e11.printStackTrace();
                        }
                        b0Var2.z();
                        break;
                }
                return b0Var;
            }
        });
        ef.e.B(o());
        ta.a aVar5 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar5);
        bq.z.b((ImageView) ((hj.i1) aVar5).f32680c.f32358d, new fz.c(this) { // from class: qp.y

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b0 f48266b;

            {
                this.f48266b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                String strT;
                int i14 = i12;
                int i15 = 0;
                qy.b0 b0Var = qy.b0.f48488a;
                b0 b0Var2 = this.f48266b;
                View it = (View) obj;
                switch (i14) {
                    case 0:
                        kotlin.jvm.internal.m.f(it, "it");
                        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                        cf.x.n().isKeyboard = !cf.x.n().isKeyboard;
                        cf.x.n().updateEntry("isKeyboard");
                        ((jp.p0) b0Var2.f47881a).A().l();
                        break;
                    case 1:
                        kotlin.jvm.internal.m.f(it, "it");
                        mp.b bVar = b0Var2.f47881a;
                        String strB = b0Var2.b();
                        ta.a aVar6 = b0Var2.f47886f;
                        kotlin.jvm.internal.m.c(aVar6);
                        ImageView ivAudio = (ImageView) ((hj.i1) aVar6).f32680c.f32358d;
                        kotlin.jvm.internal.m.e(ivAudio, "ivAudio");
                        ((jp.p0) bVar).H(ivAudio, strB);
                        break;
                    case 2:
                        kotlin.jvm.internal.m.f(it, "it");
                        mp.b bVar2 = b0Var2.f47881a;
                        String strB2 = b0Var2.b();
                        ta.a aVar7 = b0Var2.f47886f;
                        kotlin.jvm.internal.m.c(aVar7);
                        ImageView ivAudio2 = (ImageView) ((hj.i1) aVar7).f32680c.f32358d;
                        kotlin.jvm.internal.m.e(ivAudio2, "ivAudio");
                        ((jp.p0) bVar2).H(ivAudio2, strB2);
                        break;
                    case 3:
                        kotlin.jvm.internal.m.f(it, "it");
                        ArrayList arrayList = b0Var2.f47840p;
                        Context context2 = b0Var2.f47883c;
                        try {
                            strT = b0Var2.t();
                        } catch (Exception e10) {
                            e10.printStackTrace();
                            strT = BuildConfig.VERSION_NAME;
                        }
                        if (!strT.equals(BuildConfig.VERSION_NAME)) {
                            ArrayList arrayList2 = b0Var2.m;
                            int size = arrayList2.size();
                            int i16 = 0;
                            while (i16 < size) {
                                Object obj2 = arrayList2.get(i16);
                                i16++;
                                FrameLayout frameLayout = (FrameLayout) obj2;
                                Object tag = frameLayout.getTag();
                                kotlin.jvm.internal.m.d(tag, "null cannot be cast to non-null type com.lingo.lingoskill.object.Word");
                                String strB3 = fr.j3.B((Word) tag);
                                if (frameLayout.getVisibility() == 0 && strB3.equalsIgnoreCase(strT)) {
                                    frameLayout.setScaleX(1.0f);
                                    frameLayout.setScaleY(1.0f);
                                    Iterator it2 = arrayList.iterator();
                                    kotlin.jvm.internal.m.e(it2, "iterator(...)");
                                    while (it2.hasNext()) {
                                        Object next = it2.next();
                                        kotlin.jvm.internal.m.e(next, "next(...)");
                                        ((ValueAnimator) next).cancel();
                                    }
                                    arrayList.clear();
                                    ValueAnimator valueAnimatorOfArgb = ValueAnimator.ofArgb(fr.j3.G(context2, R.color.white), context2.getColor(R.color.colorAccent));
                                    valueAnimatorOfArgb.addUpdateListener(new x(frameLayout, 0));
                                    valueAnimatorOfArgb.setDuration(600L);
                                    valueAnimatorOfArgb.start();
                                    arrayList.add(valueAnimatorOfArgb);
                                    ValueAnimator valueAnimatorOfArgb2 = ValueAnimator.ofArgb(context2.getColor(R.color.primary_black), context2.getColor(R.color.white));
                                    valueAnimatorOfArgb2.addUpdateListener(new x(frameLayout, 1));
                                    valueAnimatorOfArgb2.setDuration(600L);
                                    valueAnimatorOfArgb2.start();
                                    arrayList.add(valueAnimatorOfArgb2);
                                    ValueAnimator valueAnimatorOfArgb3 = ValueAnimator.ofArgb(context2.getColor(R.color.colorAccent), context2.getColor(R.color.white));
                                    valueAnimatorOfArgb3.addUpdateListener(new x(frameLayout, 2));
                                    valueAnimatorOfArgb3.setStartDelay(1000L);
                                    valueAnimatorOfArgb3.setDuration(600L);
                                    valueAnimatorOfArgb3.start();
                                    arrayList.add(valueAnimatorOfArgb3);
                                    ValueAnimator valueAnimatorOfArgb4 = ValueAnimator.ofArgb(context2.getColor(R.color.white), context2.getColor(R.color.primary_black));
                                    valueAnimatorOfArgb4.addUpdateListener(new x(frameLayout, 3));
                                    valueAnimatorOfArgb4.setStartDelay(1000L);
                                    valueAnimatorOfArgb4.setDuration(600L);
                                    valueAnimatorOfArgb4.start();
                                    arrayList.add(valueAnimatorOfArgb4);
                                    break;
                                }
                            }
                        } else {
                            ta.a aVar8 = b0Var2.f47886f;
                            kotlin.jvm.internal.m.c(aVar8);
                            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(((hj.i1) aVar8).f32684g, "translationX", CropImageView.DEFAULT_ASPECT_RATIO, 15.0f, -15.0f, CropImageView.DEFAULT_ASPECT_RATIO);
                            if (objectAnimatorOfFloat != null) {
                                objectAnimatorOfFloat.setDuration(300L);
                                objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
                                objectAnimatorOfFloat.start();
                                ta.a aVar9 = b0Var2.f47886f;
                                kotlin.jvm.internal.m.c(aVar9);
                                b0Var2.f47835j = ObjectAnimator.ofFloat(((hj.i1) aVar9).f32681d, "translationX", CropImageView.DEFAULT_ASPECT_RATIO, 15.0f, -15.0f, CropImageView.DEFAULT_ASPECT_RATIO);
                                objectAnimatorOfFloat.setDuration(300L);
                                objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
                                objectAnimatorOfFloat.start();
                            } else {
                                objectAnimatorOfFloat = null;
                            }
                            b0Var2.f47835j = objectAnimatorOfFloat;
                            ta.a aVar10 = b0Var2.f47886f;
                            kotlin.jvm.internal.m.c(aVar10);
                            ((hj.i1) aVar10).f32681d.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, context2.getApplicationContext().getDrawable(R.drawable.line_wrong));
                            ta.a aVar11 = b0Var2.f47886f;
                            kotlin.jvm.internal.m.c(aVar11);
                            ((hj.i1) aVar11).f32681d.setTextColor(context2.getColor(R.color.color_FF6666));
                            th.j.a(qx.h.m(300L, TimeUnit.MILLISECONDS, ky.e.f38937b).g(px.b.a()).h(new lp.b(b0Var2, 16), c.f47864f), b0Var2.f47887g);
                        }
                        break;
                    case 4:
                        kotlin.jvm.internal.m.f(it, "it");
                        Env env = b0Var2.f47884d;
                        ArrayList arrayList3 = b0Var2.m;
                        boolean z11 = env.examCharAudioSwitch;
                        env.examCharAudioSwitch = !z11;
                        if (!z11) {
                            ta.a aVar12 = b0Var2.f47886f;
                            kotlin.jvm.internal.m.c(aVar12);
                            ((hj.i1) aVar12).f32683f.setImageResource(R.drawable.ic_hint_audio);
                            int size2 = arrayList3.size();
                            int i17 = 0;
                            while (i17 < size2) {
                                Object obj3 = arrayList3.get(i17);
                                i17++;
                                FrameLayout frameLayout2 = (FrameLayout) obj3;
                                TextView textView2 = (TextView) frameLayout2.findViewById(R.id.tv_char);
                                ImageView imageView = (ImageView) frameLayout2.findViewById(R.id.iv_hint_audio);
                                if (kotlin.jvm.internal.m.a(textView2.getText().toString(), " ")) {
                                    imageView.setVisibility(8);
                                } else {
                                    imageView.setVisibility(0);
                                }
                            }
                        } else {
                            ta.a aVar13 = b0Var2.f47886f;
                            kotlin.jvm.internal.m.c(aVar13);
                            ((hj.i1) aVar13).f32683f.setImageResource(R.drawable.ic_hint_audio_close);
                            int size3 = arrayList3.size();
                            while (i15 < size3) {
                                Object obj4 = arrayList3.get(i15);
                                i15++;
                                ((ImageView) ((FrameLayout) obj4).findViewById(R.id.iv_hint_audio)).setVisibility(8);
                            }
                        }
                        break;
                    default:
                        kotlin.jvm.internal.m.f(it, "it");
                        ta.a aVar14 = b0Var2.f47886f;
                        kotlin.jvm.internal.m.c(aVar14);
                        try {
                            b0Var2.s(((hj.i1) aVar14).f32681d.getSelectionStart());
                        } catch (Exception e11) {
                            e11.printStackTrace();
                        }
                        b0Var2.z();
                        break;
                }
                return b0Var;
            }
        });
        ta.a aVar6 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar6);
        bq.z.b(((hj.i1) aVar6).f32684g, new fz.c(this) { // from class: qp.y

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b0 f48266b;

            {
                this.f48266b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                String strT;
                int i14 = i11;
                int i15 = 0;
                qy.b0 b0Var = qy.b0.f48488a;
                b0 b0Var2 = this.f48266b;
                View it = (View) obj;
                switch (i14) {
                    case 0:
                        kotlin.jvm.internal.m.f(it, "it");
                        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                        cf.x.n().isKeyboard = !cf.x.n().isKeyboard;
                        cf.x.n().updateEntry("isKeyboard");
                        ((jp.p0) b0Var2.f47881a).A().l();
                        break;
                    case 1:
                        kotlin.jvm.internal.m.f(it, "it");
                        mp.b bVar = b0Var2.f47881a;
                        String strB = b0Var2.b();
                        ta.a aVar7 = b0Var2.f47886f;
                        kotlin.jvm.internal.m.c(aVar7);
                        ImageView ivAudio = (ImageView) ((hj.i1) aVar7).f32680c.f32358d;
                        kotlin.jvm.internal.m.e(ivAudio, "ivAudio");
                        ((jp.p0) bVar).H(ivAudio, strB);
                        break;
                    case 2:
                        kotlin.jvm.internal.m.f(it, "it");
                        mp.b bVar2 = b0Var2.f47881a;
                        String strB2 = b0Var2.b();
                        ta.a aVar8 = b0Var2.f47886f;
                        kotlin.jvm.internal.m.c(aVar8);
                        ImageView ivAudio2 = (ImageView) ((hj.i1) aVar8).f32680c.f32358d;
                        kotlin.jvm.internal.m.e(ivAudio2, "ivAudio");
                        ((jp.p0) bVar2).H(ivAudio2, strB2);
                        break;
                    case 3:
                        kotlin.jvm.internal.m.f(it, "it");
                        ArrayList arrayList = b0Var2.f47840p;
                        Context context2 = b0Var2.f47883c;
                        try {
                            strT = b0Var2.t();
                        } catch (Exception e10) {
                            e10.printStackTrace();
                            strT = BuildConfig.VERSION_NAME;
                        }
                        if (!strT.equals(BuildConfig.VERSION_NAME)) {
                            ArrayList arrayList2 = b0Var2.m;
                            int size = arrayList2.size();
                            int i16 = 0;
                            while (i16 < size) {
                                Object obj2 = arrayList2.get(i16);
                                i16++;
                                FrameLayout frameLayout = (FrameLayout) obj2;
                                Object tag = frameLayout.getTag();
                                kotlin.jvm.internal.m.d(tag, "null cannot be cast to non-null type com.lingo.lingoskill.object.Word");
                                String strB3 = fr.j3.B((Word) tag);
                                if (frameLayout.getVisibility() == 0 && strB3.equalsIgnoreCase(strT)) {
                                    frameLayout.setScaleX(1.0f);
                                    frameLayout.setScaleY(1.0f);
                                    Iterator it2 = arrayList.iterator();
                                    kotlin.jvm.internal.m.e(it2, "iterator(...)");
                                    while (it2.hasNext()) {
                                        Object next = it2.next();
                                        kotlin.jvm.internal.m.e(next, "next(...)");
                                        ((ValueAnimator) next).cancel();
                                    }
                                    arrayList.clear();
                                    ValueAnimator valueAnimatorOfArgb = ValueAnimator.ofArgb(fr.j3.G(context2, R.color.white), context2.getColor(R.color.colorAccent));
                                    valueAnimatorOfArgb.addUpdateListener(new x(frameLayout, 0));
                                    valueAnimatorOfArgb.setDuration(600L);
                                    valueAnimatorOfArgb.start();
                                    arrayList.add(valueAnimatorOfArgb);
                                    ValueAnimator valueAnimatorOfArgb2 = ValueAnimator.ofArgb(context2.getColor(R.color.primary_black), context2.getColor(R.color.white));
                                    valueAnimatorOfArgb2.addUpdateListener(new x(frameLayout, 1));
                                    valueAnimatorOfArgb2.setDuration(600L);
                                    valueAnimatorOfArgb2.start();
                                    arrayList.add(valueAnimatorOfArgb2);
                                    ValueAnimator valueAnimatorOfArgb3 = ValueAnimator.ofArgb(context2.getColor(R.color.colorAccent), context2.getColor(R.color.white));
                                    valueAnimatorOfArgb3.addUpdateListener(new x(frameLayout, 2));
                                    valueAnimatorOfArgb3.setStartDelay(1000L);
                                    valueAnimatorOfArgb3.setDuration(600L);
                                    valueAnimatorOfArgb3.start();
                                    arrayList.add(valueAnimatorOfArgb3);
                                    ValueAnimator valueAnimatorOfArgb4 = ValueAnimator.ofArgb(context2.getColor(R.color.white), context2.getColor(R.color.primary_black));
                                    valueAnimatorOfArgb4.addUpdateListener(new x(frameLayout, 3));
                                    valueAnimatorOfArgb4.setStartDelay(1000L);
                                    valueAnimatorOfArgb4.setDuration(600L);
                                    valueAnimatorOfArgb4.start();
                                    arrayList.add(valueAnimatorOfArgb4);
                                    break;
                                }
                            }
                        } else {
                            ta.a aVar9 = b0Var2.f47886f;
                            kotlin.jvm.internal.m.c(aVar9);
                            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(((hj.i1) aVar9).f32684g, "translationX", CropImageView.DEFAULT_ASPECT_RATIO, 15.0f, -15.0f, CropImageView.DEFAULT_ASPECT_RATIO);
                            if (objectAnimatorOfFloat != null) {
                                objectAnimatorOfFloat.setDuration(300L);
                                objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
                                objectAnimatorOfFloat.start();
                                ta.a aVar10 = b0Var2.f47886f;
                                kotlin.jvm.internal.m.c(aVar10);
                                b0Var2.f47835j = ObjectAnimator.ofFloat(((hj.i1) aVar10).f32681d, "translationX", CropImageView.DEFAULT_ASPECT_RATIO, 15.0f, -15.0f, CropImageView.DEFAULT_ASPECT_RATIO);
                                objectAnimatorOfFloat.setDuration(300L);
                                objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
                                objectAnimatorOfFloat.start();
                            } else {
                                objectAnimatorOfFloat = null;
                            }
                            b0Var2.f47835j = objectAnimatorOfFloat;
                            ta.a aVar11 = b0Var2.f47886f;
                            kotlin.jvm.internal.m.c(aVar11);
                            ((hj.i1) aVar11).f32681d.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, context2.getApplicationContext().getDrawable(R.drawable.line_wrong));
                            ta.a aVar12 = b0Var2.f47886f;
                            kotlin.jvm.internal.m.c(aVar12);
                            ((hj.i1) aVar12).f32681d.setTextColor(context2.getColor(R.color.color_FF6666));
                            th.j.a(qx.h.m(300L, TimeUnit.MILLISECONDS, ky.e.f38937b).g(px.b.a()).h(new lp.b(b0Var2, 16), c.f47864f), b0Var2.f47887g);
                        }
                        break;
                    case 4:
                        kotlin.jvm.internal.m.f(it, "it");
                        Env env = b0Var2.f47884d;
                        ArrayList arrayList3 = b0Var2.m;
                        boolean z11 = env.examCharAudioSwitch;
                        env.examCharAudioSwitch = !z11;
                        if (!z11) {
                            ta.a aVar13 = b0Var2.f47886f;
                            kotlin.jvm.internal.m.c(aVar13);
                            ((hj.i1) aVar13).f32683f.setImageResource(R.drawable.ic_hint_audio);
                            int size2 = arrayList3.size();
                            int i17 = 0;
                            while (i17 < size2) {
                                Object obj3 = arrayList3.get(i17);
                                i17++;
                                FrameLayout frameLayout2 = (FrameLayout) obj3;
                                TextView textView2 = (TextView) frameLayout2.findViewById(R.id.tv_char);
                                ImageView imageView = (ImageView) frameLayout2.findViewById(R.id.iv_hint_audio);
                                if (kotlin.jvm.internal.m.a(textView2.getText().toString(), " ")) {
                                    imageView.setVisibility(8);
                                } else {
                                    imageView.setVisibility(0);
                                }
                            }
                        } else {
                            ta.a aVar14 = b0Var2.f47886f;
                            kotlin.jvm.internal.m.c(aVar14);
                            ((hj.i1) aVar14).f32683f.setImageResource(R.drawable.ic_hint_audio_close);
                            int size3 = arrayList3.size();
                            while (i15 < size3) {
                                Object obj4 = arrayList3.get(i15);
                                i15++;
                                ((ImageView) ((FrameLayout) obj4).findViewById(R.id.iv_hint_audio)).setVisibility(8);
                            }
                        }
                        break;
                    default:
                        kotlin.jvm.internal.m.f(it, "it");
                        ta.a aVar15 = b0Var2.f47886f;
                        kotlin.jvm.internal.m.c(aVar15);
                        try {
                            b0Var2.s(((hj.i1) aVar15).f32681d.getSelectionStart());
                        } catch (Exception e11) {
                            e11.printStackTrace();
                        }
                        b0Var2.z();
                        break;
                }
                return b0Var;
            }
        });
        ta.a aVar7 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar7);
        final int i14 = 4;
        bq.z.b(((hj.i1) aVar7).f32683f, new fz.c(this) { // from class: qp.y

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b0 f48266b;

            {
                this.f48266b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                String strT;
                int i15 = i14;
                int i16 = 0;
                qy.b0 b0Var = qy.b0.f48488a;
                b0 b0Var2 = this.f48266b;
                View it = (View) obj;
                switch (i15) {
                    case 0:
                        kotlin.jvm.internal.m.f(it, "it");
                        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                        cf.x.n().isKeyboard = !cf.x.n().isKeyboard;
                        cf.x.n().updateEntry("isKeyboard");
                        ((jp.p0) b0Var2.f47881a).A().l();
                        break;
                    case 1:
                        kotlin.jvm.internal.m.f(it, "it");
                        mp.b bVar = b0Var2.f47881a;
                        String strB = b0Var2.b();
                        ta.a aVar8 = b0Var2.f47886f;
                        kotlin.jvm.internal.m.c(aVar8);
                        ImageView ivAudio = (ImageView) ((hj.i1) aVar8).f32680c.f32358d;
                        kotlin.jvm.internal.m.e(ivAudio, "ivAudio");
                        ((jp.p0) bVar).H(ivAudio, strB);
                        break;
                    case 2:
                        kotlin.jvm.internal.m.f(it, "it");
                        mp.b bVar2 = b0Var2.f47881a;
                        String strB2 = b0Var2.b();
                        ta.a aVar9 = b0Var2.f47886f;
                        kotlin.jvm.internal.m.c(aVar9);
                        ImageView ivAudio2 = (ImageView) ((hj.i1) aVar9).f32680c.f32358d;
                        kotlin.jvm.internal.m.e(ivAudio2, "ivAudio");
                        ((jp.p0) bVar2).H(ivAudio2, strB2);
                        break;
                    case 3:
                        kotlin.jvm.internal.m.f(it, "it");
                        ArrayList arrayList = b0Var2.f47840p;
                        Context context2 = b0Var2.f47883c;
                        try {
                            strT = b0Var2.t();
                        } catch (Exception e10) {
                            e10.printStackTrace();
                            strT = BuildConfig.VERSION_NAME;
                        }
                        if (!strT.equals(BuildConfig.VERSION_NAME)) {
                            ArrayList arrayList2 = b0Var2.m;
                            int size = arrayList2.size();
                            int i17 = 0;
                            while (i17 < size) {
                                Object obj2 = arrayList2.get(i17);
                                i17++;
                                FrameLayout frameLayout = (FrameLayout) obj2;
                                Object tag = frameLayout.getTag();
                                kotlin.jvm.internal.m.d(tag, "null cannot be cast to non-null type com.lingo.lingoskill.object.Word");
                                String strB3 = fr.j3.B((Word) tag);
                                if (frameLayout.getVisibility() == 0 && strB3.equalsIgnoreCase(strT)) {
                                    frameLayout.setScaleX(1.0f);
                                    frameLayout.setScaleY(1.0f);
                                    Iterator it2 = arrayList.iterator();
                                    kotlin.jvm.internal.m.e(it2, "iterator(...)");
                                    while (it2.hasNext()) {
                                        Object next = it2.next();
                                        kotlin.jvm.internal.m.e(next, "next(...)");
                                        ((ValueAnimator) next).cancel();
                                    }
                                    arrayList.clear();
                                    ValueAnimator valueAnimatorOfArgb = ValueAnimator.ofArgb(fr.j3.G(context2, R.color.white), context2.getColor(R.color.colorAccent));
                                    valueAnimatorOfArgb.addUpdateListener(new x(frameLayout, 0));
                                    valueAnimatorOfArgb.setDuration(600L);
                                    valueAnimatorOfArgb.start();
                                    arrayList.add(valueAnimatorOfArgb);
                                    ValueAnimator valueAnimatorOfArgb2 = ValueAnimator.ofArgb(context2.getColor(R.color.primary_black), context2.getColor(R.color.white));
                                    valueAnimatorOfArgb2.addUpdateListener(new x(frameLayout, 1));
                                    valueAnimatorOfArgb2.setDuration(600L);
                                    valueAnimatorOfArgb2.start();
                                    arrayList.add(valueAnimatorOfArgb2);
                                    ValueAnimator valueAnimatorOfArgb3 = ValueAnimator.ofArgb(context2.getColor(R.color.colorAccent), context2.getColor(R.color.white));
                                    valueAnimatorOfArgb3.addUpdateListener(new x(frameLayout, 2));
                                    valueAnimatorOfArgb3.setStartDelay(1000L);
                                    valueAnimatorOfArgb3.setDuration(600L);
                                    valueAnimatorOfArgb3.start();
                                    arrayList.add(valueAnimatorOfArgb3);
                                    ValueAnimator valueAnimatorOfArgb4 = ValueAnimator.ofArgb(context2.getColor(R.color.white), context2.getColor(R.color.primary_black));
                                    valueAnimatorOfArgb4.addUpdateListener(new x(frameLayout, 3));
                                    valueAnimatorOfArgb4.setStartDelay(1000L);
                                    valueAnimatorOfArgb4.setDuration(600L);
                                    valueAnimatorOfArgb4.start();
                                    arrayList.add(valueAnimatorOfArgb4);
                                    break;
                                }
                            }
                        } else {
                            ta.a aVar10 = b0Var2.f47886f;
                            kotlin.jvm.internal.m.c(aVar10);
                            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(((hj.i1) aVar10).f32684g, "translationX", CropImageView.DEFAULT_ASPECT_RATIO, 15.0f, -15.0f, CropImageView.DEFAULT_ASPECT_RATIO);
                            if (objectAnimatorOfFloat != null) {
                                objectAnimatorOfFloat.setDuration(300L);
                                objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
                                objectAnimatorOfFloat.start();
                                ta.a aVar11 = b0Var2.f47886f;
                                kotlin.jvm.internal.m.c(aVar11);
                                b0Var2.f47835j = ObjectAnimator.ofFloat(((hj.i1) aVar11).f32681d, "translationX", CropImageView.DEFAULT_ASPECT_RATIO, 15.0f, -15.0f, CropImageView.DEFAULT_ASPECT_RATIO);
                                objectAnimatorOfFloat.setDuration(300L);
                                objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
                                objectAnimatorOfFloat.start();
                            } else {
                                objectAnimatorOfFloat = null;
                            }
                            b0Var2.f47835j = objectAnimatorOfFloat;
                            ta.a aVar12 = b0Var2.f47886f;
                            kotlin.jvm.internal.m.c(aVar12);
                            ((hj.i1) aVar12).f32681d.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, context2.getApplicationContext().getDrawable(R.drawable.line_wrong));
                            ta.a aVar13 = b0Var2.f47886f;
                            kotlin.jvm.internal.m.c(aVar13);
                            ((hj.i1) aVar13).f32681d.setTextColor(context2.getColor(R.color.color_FF6666));
                            th.j.a(qx.h.m(300L, TimeUnit.MILLISECONDS, ky.e.f38937b).g(px.b.a()).h(new lp.b(b0Var2, 16), c.f47864f), b0Var2.f47887g);
                        }
                        break;
                    case 4:
                        kotlin.jvm.internal.m.f(it, "it");
                        Env env = b0Var2.f47884d;
                        ArrayList arrayList3 = b0Var2.m;
                        boolean z11 = env.examCharAudioSwitch;
                        env.examCharAudioSwitch = !z11;
                        if (!z11) {
                            ta.a aVar14 = b0Var2.f47886f;
                            kotlin.jvm.internal.m.c(aVar14);
                            ((hj.i1) aVar14).f32683f.setImageResource(R.drawable.ic_hint_audio);
                            int size2 = arrayList3.size();
                            int i18 = 0;
                            while (i18 < size2) {
                                Object obj3 = arrayList3.get(i18);
                                i18++;
                                FrameLayout frameLayout2 = (FrameLayout) obj3;
                                TextView textView2 = (TextView) frameLayout2.findViewById(R.id.tv_char);
                                ImageView imageView = (ImageView) frameLayout2.findViewById(R.id.iv_hint_audio);
                                if (kotlin.jvm.internal.m.a(textView2.getText().toString(), " ")) {
                                    imageView.setVisibility(8);
                                } else {
                                    imageView.setVisibility(0);
                                }
                            }
                        } else {
                            ta.a aVar15 = b0Var2.f47886f;
                            kotlin.jvm.internal.m.c(aVar15);
                            ((hj.i1) aVar15).f32683f.setImageResource(R.drawable.ic_hint_audio_close);
                            int size3 = arrayList3.size();
                            while (i16 < size3) {
                                Object obj4 = arrayList3.get(i16);
                                i16++;
                                ((ImageView) ((FrameLayout) obj4).findViewById(R.id.iv_hint_audio)).setVisibility(8);
                            }
                        }
                        break;
                    default:
                        kotlin.jvm.internal.m.f(it, "it");
                        ta.a aVar16 = b0Var2.f47886f;
                        kotlin.jvm.internal.m.c(aVar16);
                        try {
                            b0Var2.s(((hj.i1) aVar16).f32681d.getSelectionStart());
                        } catch (Exception e11) {
                            e11.printStackTrace();
                        }
                        b0Var2.z();
                        break;
                }
                return b0Var;
            }
        });
        ta.a aVar8 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar8);
        final int i15 = 5;
        bq.z.b(((hj.i1) aVar8).f32679b, new fz.c(this) { // from class: qp.y

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b0 f48266b;

            {
                this.f48266b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                String strT;
                int i16 = i15;
                int i17 = 0;
                qy.b0 b0Var = qy.b0.f48488a;
                b0 b0Var2 = this.f48266b;
                View it = (View) obj;
                switch (i16) {
                    case 0:
                        kotlin.jvm.internal.m.f(it, "it");
                        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                        cf.x.n().isKeyboard = !cf.x.n().isKeyboard;
                        cf.x.n().updateEntry("isKeyboard");
                        ((jp.p0) b0Var2.f47881a).A().l();
                        break;
                    case 1:
                        kotlin.jvm.internal.m.f(it, "it");
                        mp.b bVar = b0Var2.f47881a;
                        String strB = b0Var2.b();
                        ta.a aVar9 = b0Var2.f47886f;
                        kotlin.jvm.internal.m.c(aVar9);
                        ImageView ivAudio = (ImageView) ((hj.i1) aVar9).f32680c.f32358d;
                        kotlin.jvm.internal.m.e(ivAudio, "ivAudio");
                        ((jp.p0) bVar).H(ivAudio, strB);
                        break;
                    case 2:
                        kotlin.jvm.internal.m.f(it, "it");
                        mp.b bVar2 = b0Var2.f47881a;
                        String strB2 = b0Var2.b();
                        ta.a aVar10 = b0Var2.f47886f;
                        kotlin.jvm.internal.m.c(aVar10);
                        ImageView ivAudio2 = (ImageView) ((hj.i1) aVar10).f32680c.f32358d;
                        kotlin.jvm.internal.m.e(ivAudio2, "ivAudio");
                        ((jp.p0) bVar2).H(ivAudio2, strB2);
                        break;
                    case 3:
                        kotlin.jvm.internal.m.f(it, "it");
                        ArrayList arrayList = b0Var2.f47840p;
                        Context context2 = b0Var2.f47883c;
                        try {
                            strT = b0Var2.t();
                        } catch (Exception e10) {
                            e10.printStackTrace();
                            strT = BuildConfig.VERSION_NAME;
                        }
                        if (!strT.equals(BuildConfig.VERSION_NAME)) {
                            ArrayList arrayList2 = b0Var2.m;
                            int size = arrayList2.size();
                            int i18 = 0;
                            while (i18 < size) {
                                Object obj2 = arrayList2.get(i18);
                                i18++;
                                FrameLayout frameLayout = (FrameLayout) obj2;
                                Object tag = frameLayout.getTag();
                                kotlin.jvm.internal.m.d(tag, "null cannot be cast to non-null type com.lingo.lingoskill.object.Word");
                                String strB3 = fr.j3.B((Word) tag);
                                if (frameLayout.getVisibility() == 0 && strB3.equalsIgnoreCase(strT)) {
                                    frameLayout.setScaleX(1.0f);
                                    frameLayout.setScaleY(1.0f);
                                    Iterator it2 = arrayList.iterator();
                                    kotlin.jvm.internal.m.e(it2, "iterator(...)");
                                    while (it2.hasNext()) {
                                        Object next = it2.next();
                                        kotlin.jvm.internal.m.e(next, "next(...)");
                                        ((ValueAnimator) next).cancel();
                                    }
                                    arrayList.clear();
                                    ValueAnimator valueAnimatorOfArgb = ValueAnimator.ofArgb(fr.j3.G(context2, R.color.white), context2.getColor(R.color.colorAccent));
                                    valueAnimatorOfArgb.addUpdateListener(new x(frameLayout, 0));
                                    valueAnimatorOfArgb.setDuration(600L);
                                    valueAnimatorOfArgb.start();
                                    arrayList.add(valueAnimatorOfArgb);
                                    ValueAnimator valueAnimatorOfArgb2 = ValueAnimator.ofArgb(context2.getColor(R.color.primary_black), context2.getColor(R.color.white));
                                    valueAnimatorOfArgb2.addUpdateListener(new x(frameLayout, 1));
                                    valueAnimatorOfArgb2.setDuration(600L);
                                    valueAnimatorOfArgb2.start();
                                    arrayList.add(valueAnimatorOfArgb2);
                                    ValueAnimator valueAnimatorOfArgb3 = ValueAnimator.ofArgb(context2.getColor(R.color.colorAccent), context2.getColor(R.color.white));
                                    valueAnimatorOfArgb3.addUpdateListener(new x(frameLayout, 2));
                                    valueAnimatorOfArgb3.setStartDelay(1000L);
                                    valueAnimatorOfArgb3.setDuration(600L);
                                    valueAnimatorOfArgb3.start();
                                    arrayList.add(valueAnimatorOfArgb3);
                                    ValueAnimator valueAnimatorOfArgb4 = ValueAnimator.ofArgb(context2.getColor(R.color.white), context2.getColor(R.color.primary_black));
                                    valueAnimatorOfArgb4.addUpdateListener(new x(frameLayout, 3));
                                    valueAnimatorOfArgb4.setStartDelay(1000L);
                                    valueAnimatorOfArgb4.setDuration(600L);
                                    valueAnimatorOfArgb4.start();
                                    arrayList.add(valueAnimatorOfArgb4);
                                    break;
                                }
                            }
                        } else {
                            ta.a aVar11 = b0Var2.f47886f;
                            kotlin.jvm.internal.m.c(aVar11);
                            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(((hj.i1) aVar11).f32684g, "translationX", CropImageView.DEFAULT_ASPECT_RATIO, 15.0f, -15.0f, CropImageView.DEFAULT_ASPECT_RATIO);
                            if (objectAnimatorOfFloat != null) {
                                objectAnimatorOfFloat.setDuration(300L);
                                objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
                                objectAnimatorOfFloat.start();
                                ta.a aVar12 = b0Var2.f47886f;
                                kotlin.jvm.internal.m.c(aVar12);
                                b0Var2.f47835j = ObjectAnimator.ofFloat(((hj.i1) aVar12).f32681d, "translationX", CropImageView.DEFAULT_ASPECT_RATIO, 15.0f, -15.0f, CropImageView.DEFAULT_ASPECT_RATIO);
                                objectAnimatorOfFloat.setDuration(300L);
                                objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
                                objectAnimatorOfFloat.start();
                            } else {
                                objectAnimatorOfFloat = null;
                            }
                            b0Var2.f47835j = objectAnimatorOfFloat;
                            ta.a aVar13 = b0Var2.f47886f;
                            kotlin.jvm.internal.m.c(aVar13);
                            ((hj.i1) aVar13).f32681d.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, context2.getApplicationContext().getDrawable(R.drawable.line_wrong));
                            ta.a aVar14 = b0Var2.f47886f;
                            kotlin.jvm.internal.m.c(aVar14);
                            ((hj.i1) aVar14).f32681d.setTextColor(context2.getColor(R.color.color_FF6666));
                            th.j.a(qx.h.m(300L, TimeUnit.MILLISECONDS, ky.e.f38937b).g(px.b.a()).h(new lp.b(b0Var2, 16), c.f47864f), b0Var2.f47887g);
                        }
                        break;
                    case 4:
                        kotlin.jvm.internal.m.f(it, "it");
                        Env env = b0Var2.f47884d;
                        ArrayList arrayList3 = b0Var2.m;
                        boolean z11 = env.examCharAudioSwitch;
                        env.examCharAudioSwitch = !z11;
                        if (!z11) {
                            ta.a aVar15 = b0Var2.f47886f;
                            kotlin.jvm.internal.m.c(aVar15);
                            ((hj.i1) aVar15).f32683f.setImageResource(R.drawable.ic_hint_audio);
                            int size2 = arrayList3.size();
                            int i19 = 0;
                            while (i19 < size2) {
                                Object obj3 = arrayList3.get(i19);
                                i19++;
                                FrameLayout frameLayout2 = (FrameLayout) obj3;
                                TextView textView2 = (TextView) frameLayout2.findViewById(R.id.tv_char);
                                ImageView imageView = (ImageView) frameLayout2.findViewById(R.id.iv_hint_audio);
                                if (kotlin.jvm.internal.m.a(textView2.getText().toString(), " ")) {
                                    imageView.setVisibility(8);
                                } else {
                                    imageView.setVisibility(0);
                                }
                            }
                        } else {
                            ta.a aVar16 = b0Var2.f47886f;
                            kotlin.jvm.internal.m.c(aVar16);
                            ((hj.i1) aVar16).f32683f.setImageResource(R.drawable.ic_hint_audio_close);
                            int size3 = arrayList3.size();
                            while (i17 < size3) {
                                Object obj4 = arrayList3.get(i17);
                                i17++;
                                ((ImageView) ((FrameLayout) obj4).findViewById(R.id.iv_hint_audio)).setVisibility(8);
                            }
                        }
                        break;
                    default:
                        kotlin.jvm.internal.m.f(it, "it");
                        ta.a aVar17 = b0Var2.f47886f;
                        kotlin.jvm.internal.m.c(aVar17);
                        try {
                            b0Var2.s(((hj.i1) aVar17).f32681d.getSelectionStart());
                        } catch (Exception e11) {
                            e11.printStackTrace();
                        }
                        b0Var2.z();
                        break;
                }
                return b0Var;
            }
        });
        Env env = this.f47884d;
        if (!env.isAudioModel || p0Var.Q) {
            ta.a aVar9 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar9);
            ((ImageView) ((hj.i1) aVar9).f32680c.f32358d).setVisibility(8);
            ta.a aVar10 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar10);
            ((hj.i1) aVar10).f32683f.setVisibility(8);
        } else {
            int[] iArr = bq.r.f4959a;
            if (bq.m.F()) {
                ta.a aVar11 = this.f47886f;
                kotlin.jvm.internal.m.c(aVar11);
                ConstraintLayout rootParent = ((hj.i1) aVar11).f32686i;
                kotlin.jvm.internal.m.e(rootParent, "rootParent");
                final int i16 = 2;
                bq.z.b(rootParent, new fz.c(this) { // from class: qp.y

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ b0 f48266b;

                    {
                        this.f48266b = this;
                    }

                    @Override // fz.c
                    public final Object invoke(Object obj) {
                        String strT;
                        int i17 = i16;
                        int i18 = 0;
                        qy.b0 b0Var = qy.b0.f48488a;
                        b0 b0Var2 = this.f48266b;
                        View it = (View) obj;
                        switch (i17) {
                            case 0:
                                kotlin.jvm.internal.m.f(it, "it");
                                LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                                cf.x.n().isKeyboard = !cf.x.n().isKeyboard;
                                cf.x.n().updateEntry("isKeyboard");
                                ((jp.p0) b0Var2.f47881a).A().l();
                                break;
                            case 1:
                                kotlin.jvm.internal.m.f(it, "it");
                                mp.b bVar = b0Var2.f47881a;
                                String strB = b0Var2.b();
                                ta.a aVar12 = b0Var2.f47886f;
                                kotlin.jvm.internal.m.c(aVar12);
                                ImageView ivAudio = (ImageView) ((hj.i1) aVar12).f32680c.f32358d;
                                kotlin.jvm.internal.m.e(ivAudio, "ivAudio");
                                ((jp.p0) bVar).H(ivAudio, strB);
                                break;
                            case 2:
                                kotlin.jvm.internal.m.f(it, "it");
                                mp.b bVar2 = b0Var2.f47881a;
                                String strB2 = b0Var2.b();
                                ta.a aVar13 = b0Var2.f47886f;
                                kotlin.jvm.internal.m.c(aVar13);
                                ImageView ivAudio2 = (ImageView) ((hj.i1) aVar13).f32680c.f32358d;
                                kotlin.jvm.internal.m.e(ivAudio2, "ivAudio");
                                ((jp.p0) bVar2).H(ivAudio2, strB2);
                                break;
                            case 3:
                                kotlin.jvm.internal.m.f(it, "it");
                                ArrayList arrayList = b0Var2.f47840p;
                                Context context2 = b0Var2.f47883c;
                                try {
                                    strT = b0Var2.t();
                                } catch (Exception e10) {
                                    e10.printStackTrace();
                                    strT = BuildConfig.VERSION_NAME;
                                }
                                if (!strT.equals(BuildConfig.VERSION_NAME)) {
                                    ArrayList arrayList2 = b0Var2.m;
                                    int size = arrayList2.size();
                                    int i19 = 0;
                                    while (i19 < size) {
                                        Object obj2 = arrayList2.get(i19);
                                        i19++;
                                        FrameLayout frameLayout = (FrameLayout) obj2;
                                        Object tag = frameLayout.getTag();
                                        kotlin.jvm.internal.m.d(tag, "null cannot be cast to non-null type com.lingo.lingoskill.object.Word");
                                        String strB3 = fr.j3.B((Word) tag);
                                        if (frameLayout.getVisibility() == 0 && strB3.equalsIgnoreCase(strT)) {
                                            frameLayout.setScaleX(1.0f);
                                            frameLayout.setScaleY(1.0f);
                                            Iterator it2 = arrayList.iterator();
                                            kotlin.jvm.internal.m.e(it2, "iterator(...)");
                                            while (it2.hasNext()) {
                                                Object next = it2.next();
                                                kotlin.jvm.internal.m.e(next, "next(...)");
                                                ((ValueAnimator) next).cancel();
                                            }
                                            arrayList.clear();
                                            ValueAnimator valueAnimatorOfArgb = ValueAnimator.ofArgb(fr.j3.G(context2, R.color.white), context2.getColor(R.color.colorAccent));
                                            valueAnimatorOfArgb.addUpdateListener(new x(frameLayout, 0));
                                            valueAnimatorOfArgb.setDuration(600L);
                                            valueAnimatorOfArgb.start();
                                            arrayList.add(valueAnimatorOfArgb);
                                            ValueAnimator valueAnimatorOfArgb2 = ValueAnimator.ofArgb(context2.getColor(R.color.primary_black), context2.getColor(R.color.white));
                                            valueAnimatorOfArgb2.addUpdateListener(new x(frameLayout, 1));
                                            valueAnimatorOfArgb2.setDuration(600L);
                                            valueAnimatorOfArgb2.start();
                                            arrayList.add(valueAnimatorOfArgb2);
                                            ValueAnimator valueAnimatorOfArgb3 = ValueAnimator.ofArgb(context2.getColor(R.color.colorAccent), context2.getColor(R.color.white));
                                            valueAnimatorOfArgb3.addUpdateListener(new x(frameLayout, 2));
                                            valueAnimatorOfArgb3.setStartDelay(1000L);
                                            valueAnimatorOfArgb3.setDuration(600L);
                                            valueAnimatorOfArgb3.start();
                                            arrayList.add(valueAnimatorOfArgb3);
                                            ValueAnimator valueAnimatorOfArgb4 = ValueAnimator.ofArgb(context2.getColor(R.color.white), context2.getColor(R.color.primary_black));
                                            valueAnimatorOfArgb4.addUpdateListener(new x(frameLayout, 3));
                                            valueAnimatorOfArgb4.setStartDelay(1000L);
                                            valueAnimatorOfArgb4.setDuration(600L);
                                            valueAnimatorOfArgb4.start();
                                            arrayList.add(valueAnimatorOfArgb4);
                                            break;
                                        }
                                    }
                                } else {
                                    ta.a aVar14 = b0Var2.f47886f;
                                    kotlin.jvm.internal.m.c(aVar14);
                                    ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(((hj.i1) aVar14).f32684g, "translationX", CropImageView.DEFAULT_ASPECT_RATIO, 15.0f, -15.0f, CropImageView.DEFAULT_ASPECT_RATIO);
                                    if (objectAnimatorOfFloat != null) {
                                        objectAnimatorOfFloat.setDuration(300L);
                                        objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
                                        objectAnimatorOfFloat.start();
                                        ta.a aVar15 = b0Var2.f47886f;
                                        kotlin.jvm.internal.m.c(aVar15);
                                        b0Var2.f47835j = ObjectAnimator.ofFloat(((hj.i1) aVar15).f32681d, "translationX", CropImageView.DEFAULT_ASPECT_RATIO, 15.0f, -15.0f, CropImageView.DEFAULT_ASPECT_RATIO);
                                        objectAnimatorOfFloat.setDuration(300L);
                                        objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
                                        objectAnimatorOfFloat.start();
                                    } else {
                                        objectAnimatorOfFloat = null;
                                    }
                                    b0Var2.f47835j = objectAnimatorOfFloat;
                                    ta.a aVar16 = b0Var2.f47886f;
                                    kotlin.jvm.internal.m.c(aVar16);
                                    ((hj.i1) aVar16).f32681d.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, context2.getApplicationContext().getDrawable(R.drawable.line_wrong));
                                    ta.a aVar17 = b0Var2.f47886f;
                                    kotlin.jvm.internal.m.c(aVar17);
                                    ((hj.i1) aVar17).f32681d.setTextColor(context2.getColor(R.color.color_FF6666));
                                    th.j.a(qx.h.m(300L, TimeUnit.MILLISECONDS, ky.e.f38937b).g(px.b.a()).h(new lp.b(b0Var2, 16), c.f47864f), b0Var2.f47887g);
                                }
                                break;
                            case 4:
                                kotlin.jvm.internal.m.f(it, "it");
                                Env env2 = b0Var2.f47884d;
                                ArrayList arrayList3 = b0Var2.m;
                                boolean z11 = env2.examCharAudioSwitch;
                                env2.examCharAudioSwitch = !z11;
                                if (!z11) {
                                    ta.a aVar18 = b0Var2.f47886f;
                                    kotlin.jvm.internal.m.c(aVar18);
                                    ((hj.i1) aVar18).f32683f.setImageResource(R.drawable.ic_hint_audio);
                                    int size2 = arrayList3.size();
                                    int i110 = 0;
                                    while (i110 < size2) {
                                        Object obj3 = arrayList3.get(i110);
                                        i110++;
                                        FrameLayout frameLayout2 = (FrameLayout) obj3;
                                        TextView textView2 = (TextView) frameLayout2.findViewById(R.id.tv_char);
                                        ImageView imageView = (ImageView) frameLayout2.findViewById(R.id.iv_hint_audio);
                                        if (kotlin.jvm.internal.m.a(textView2.getText().toString(), " ")) {
                                            imageView.setVisibility(8);
                                        } else {
                                            imageView.setVisibility(0);
                                        }
                                    }
                                } else {
                                    ta.a aVar19 = b0Var2.f47886f;
                                    kotlin.jvm.internal.m.c(aVar19);
                                    ((hj.i1) aVar19).f32683f.setImageResource(R.drawable.ic_hint_audio_close);
                                    int size3 = arrayList3.size();
                                    while (i18 < size3) {
                                        Object obj4 = arrayList3.get(i18);
                                        i18++;
                                        ((ImageView) ((FrameLayout) obj4).findViewById(R.id.iv_hint_audio)).setVisibility(8);
                                    }
                                }
                                break;
                            default:
                                kotlin.jvm.internal.m.f(it, "it");
                                ta.a aVar110 = b0Var2.f47886f;
                                kotlin.jvm.internal.m.c(aVar110);
                                try {
                                    b0Var2.s(((hj.i1) aVar110).f32681d.getSelectionStart());
                                } catch (Exception e11) {
                                    e11.printStackTrace();
                                }
                                b0Var2.z();
                                break;
                        }
                        return b0Var;
                    }
                });
                ta.a aVar12 = this.f47886f;
                kotlin.jvm.internal.m.c(aVar12);
                bq.z.a((ImageView) ((hj.i1) aVar12).f32680c.f32358d, 0L, new z(this, i13));
            } else {
                LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                if (ry.l.D(new Integer[]{53, 54}, Integer.valueOf(cf.x.n().keyLanguage))) {
                    ta.a aVar13 = this.f47886f;
                    kotlin.jvm.internal.m.c(aVar13);
                    ConstraintLayout rootParent2 = ((hj.i1) aVar13).f32686i;
                    kotlin.jvm.internal.m.e(rootParent2, "rootParent");
                    final int i17 = 2;
                    bq.z.b(rootParent2, new fz.c(this) { // from class: qp.y

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ b0 f48266b;

                        {
                            this.f48266b = this;
                        }

                        @Override // fz.c
                        public final Object invoke(Object obj) {
                            String strT;
                            int i18 = i17;
                            int i19 = 0;
                            qy.b0 b0Var = qy.b0.f48488a;
                            b0 b0Var2 = this.f48266b;
                            View it = (View) obj;
                            switch (i18) {
                                case 0:
                                    kotlin.jvm.internal.m.f(it, "it");
                                    LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
                                    cf.x.n().isKeyboard = !cf.x.n().isKeyboard;
                                    cf.x.n().updateEntry("isKeyboard");
                                    ((jp.p0) b0Var2.f47881a).A().l();
                                    break;
                                case 1:
                                    kotlin.jvm.internal.m.f(it, "it");
                                    mp.b bVar = b0Var2.f47881a;
                                    String strB = b0Var2.b();
                                    ta.a aVar14 = b0Var2.f47886f;
                                    kotlin.jvm.internal.m.c(aVar14);
                                    ImageView ivAudio = (ImageView) ((hj.i1) aVar14).f32680c.f32358d;
                                    kotlin.jvm.internal.m.e(ivAudio, "ivAudio");
                                    ((jp.p0) bVar).H(ivAudio, strB);
                                    break;
                                case 2:
                                    kotlin.jvm.internal.m.f(it, "it");
                                    mp.b bVar2 = b0Var2.f47881a;
                                    String strB2 = b0Var2.b();
                                    ta.a aVar15 = b0Var2.f47886f;
                                    kotlin.jvm.internal.m.c(aVar15);
                                    ImageView ivAudio2 = (ImageView) ((hj.i1) aVar15).f32680c.f32358d;
                                    kotlin.jvm.internal.m.e(ivAudio2, "ivAudio");
                                    ((jp.p0) bVar2).H(ivAudio2, strB2);
                                    break;
                                case 3:
                                    kotlin.jvm.internal.m.f(it, "it");
                                    ArrayList arrayList = b0Var2.f47840p;
                                    Context context2 = b0Var2.f47883c;
                                    try {
                                        strT = b0Var2.t();
                                    } catch (Exception e10) {
                                        e10.printStackTrace();
                                        strT = BuildConfig.VERSION_NAME;
                                    }
                                    if (!strT.equals(BuildConfig.VERSION_NAME)) {
                                        ArrayList arrayList2 = b0Var2.m;
                                        int size = arrayList2.size();
                                        int i110 = 0;
                                        while (i110 < size) {
                                            Object obj2 = arrayList2.get(i110);
                                            i110++;
                                            FrameLayout frameLayout = (FrameLayout) obj2;
                                            Object tag = frameLayout.getTag();
                                            kotlin.jvm.internal.m.d(tag, "null cannot be cast to non-null type com.lingo.lingoskill.object.Word");
                                            String strB3 = fr.j3.B((Word) tag);
                                            if (frameLayout.getVisibility() == 0 && strB3.equalsIgnoreCase(strT)) {
                                                frameLayout.setScaleX(1.0f);
                                                frameLayout.setScaleY(1.0f);
                                                Iterator it2 = arrayList.iterator();
                                                kotlin.jvm.internal.m.e(it2, "iterator(...)");
                                                while (it2.hasNext()) {
                                                    Object next = it2.next();
                                                    kotlin.jvm.internal.m.e(next, "next(...)");
                                                    ((ValueAnimator) next).cancel();
                                                }
                                                arrayList.clear();
                                                ValueAnimator valueAnimatorOfArgb = ValueAnimator.ofArgb(fr.j3.G(context2, R.color.white), context2.getColor(R.color.colorAccent));
                                                valueAnimatorOfArgb.addUpdateListener(new x(frameLayout, 0));
                                                valueAnimatorOfArgb.setDuration(600L);
                                                valueAnimatorOfArgb.start();
                                                arrayList.add(valueAnimatorOfArgb);
                                                ValueAnimator valueAnimatorOfArgb2 = ValueAnimator.ofArgb(context2.getColor(R.color.primary_black), context2.getColor(R.color.white));
                                                valueAnimatorOfArgb2.addUpdateListener(new x(frameLayout, 1));
                                                valueAnimatorOfArgb2.setDuration(600L);
                                                valueAnimatorOfArgb2.start();
                                                arrayList.add(valueAnimatorOfArgb2);
                                                ValueAnimator valueAnimatorOfArgb3 = ValueAnimator.ofArgb(context2.getColor(R.color.colorAccent), context2.getColor(R.color.white));
                                                valueAnimatorOfArgb3.addUpdateListener(new x(frameLayout, 2));
                                                valueAnimatorOfArgb3.setStartDelay(1000L);
                                                valueAnimatorOfArgb3.setDuration(600L);
                                                valueAnimatorOfArgb3.start();
                                                arrayList.add(valueAnimatorOfArgb3);
                                                ValueAnimator valueAnimatorOfArgb4 = ValueAnimator.ofArgb(context2.getColor(R.color.white), context2.getColor(R.color.primary_black));
                                                valueAnimatorOfArgb4.addUpdateListener(new x(frameLayout, 3));
                                                valueAnimatorOfArgb4.setStartDelay(1000L);
                                                valueAnimatorOfArgb4.setDuration(600L);
                                                valueAnimatorOfArgb4.start();
                                                arrayList.add(valueAnimatorOfArgb4);
                                                break;
                                            }
                                        }
                                    } else {
                                        ta.a aVar16 = b0Var2.f47886f;
                                        kotlin.jvm.internal.m.c(aVar16);
                                        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(((hj.i1) aVar16).f32684g, "translationX", CropImageView.DEFAULT_ASPECT_RATIO, 15.0f, -15.0f, CropImageView.DEFAULT_ASPECT_RATIO);
                                        if (objectAnimatorOfFloat != null) {
                                            objectAnimatorOfFloat.setDuration(300L);
                                            objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
                                            objectAnimatorOfFloat.start();
                                            ta.a aVar17 = b0Var2.f47886f;
                                            kotlin.jvm.internal.m.c(aVar17);
                                            b0Var2.f47835j = ObjectAnimator.ofFloat(((hj.i1) aVar17).f32681d, "translationX", CropImageView.DEFAULT_ASPECT_RATIO, 15.0f, -15.0f, CropImageView.DEFAULT_ASPECT_RATIO);
                                            objectAnimatorOfFloat.setDuration(300L);
                                            objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
                                            objectAnimatorOfFloat.start();
                                        } else {
                                            objectAnimatorOfFloat = null;
                                        }
                                        b0Var2.f47835j = objectAnimatorOfFloat;
                                        ta.a aVar18 = b0Var2.f47886f;
                                        kotlin.jvm.internal.m.c(aVar18);
                                        ((hj.i1) aVar18).f32681d.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, context2.getApplicationContext().getDrawable(R.drawable.line_wrong));
                                        ta.a aVar19 = b0Var2.f47886f;
                                        kotlin.jvm.internal.m.c(aVar19);
                                        ((hj.i1) aVar19).f32681d.setTextColor(context2.getColor(R.color.color_FF6666));
                                        th.j.a(qx.h.m(300L, TimeUnit.MILLISECONDS, ky.e.f38937b).g(px.b.a()).h(new lp.b(b0Var2, 16), c.f47864f), b0Var2.f47887g);
                                    }
                                    break;
                                case 4:
                                    kotlin.jvm.internal.m.f(it, "it");
                                    Env env2 = b0Var2.f47884d;
                                    ArrayList arrayList3 = b0Var2.m;
                                    boolean z11 = env2.examCharAudioSwitch;
                                    env2.examCharAudioSwitch = !z11;
                                    if (!z11) {
                                        ta.a aVar110 = b0Var2.f47886f;
                                        kotlin.jvm.internal.m.c(aVar110);
                                        ((hj.i1) aVar110).f32683f.setImageResource(R.drawable.ic_hint_audio);
                                        int size2 = arrayList3.size();
                                        int i111 = 0;
                                        while (i111 < size2) {
                                            Object obj3 = arrayList3.get(i111);
                                            i111++;
                                            FrameLayout frameLayout2 = (FrameLayout) obj3;
                                            TextView textView2 = (TextView) frameLayout2.findViewById(R.id.tv_char);
                                            ImageView imageView = (ImageView) frameLayout2.findViewById(R.id.iv_hint_audio);
                                            if (kotlin.jvm.internal.m.a(textView2.getText().toString(), " ")) {
                                                imageView.setVisibility(8);
                                            } else {
                                                imageView.setVisibility(0);
                                            }
                                        }
                                    } else {
                                        ta.a aVar111 = b0Var2.f47886f;
                                        kotlin.jvm.internal.m.c(aVar111);
                                        ((hj.i1) aVar111).f32683f.setImageResource(R.drawable.ic_hint_audio_close);
                                        int size3 = arrayList3.size();
                                        while (i19 < size3) {
                                            Object obj4 = arrayList3.get(i19);
                                            i19++;
                                            ((ImageView) ((FrameLayout) obj4).findViewById(R.id.iv_hint_audio)).setVisibility(8);
                                        }
                                    }
                                    break;
                                default:
                                    kotlin.jvm.internal.m.f(it, "it");
                                    ta.a aVar112 = b0Var2.f47886f;
                                    kotlin.jvm.internal.m.c(aVar112);
                                    try {
                                        b0Var2.s(((hj.i1) aVar112).f32681d.getSelectionStart());
                                    } catch (Exception e11) {
                                        e11.printStackTrace();
                                    }
                                    b0Var2.z();
                                    break;
                            }
                            return b0Var;
                        }
                    });
                    ta.a aVar14 = this.f47886f;
                    kotlin.jvm.internal.m.c(aVar14);
                    bq.z.a((ImageView) ((hj.i1) aVar14).f32680c.f32358d, 0L, new z(this, i13));
                }
            }
        }
        ta.a aVar15 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar15);
        LottieAnimationView lottieAnimationView = (LottieAnimationView) ((hj.i1) aVar15).f32680c.f32359e;
        Collection collection = (Collection) this.f47841q.get(0);
        jz.d dVar = jz.e.f37397a;
        lottieAnimationView.setAnimation(((Number) ry.m.I0(collection)).intValue());
        ta.a aVar16 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar16);
        ((LottieAnimationView) ((hj.i1) aVar16).f32680c.f32359e).setRepeatCount(-1);
        if (env.showAnim) {
            ta.a aVar17 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar17);
            ((LottieAnimationView) ((hj.i1) aVar17).f32680c.f32359e).h();
        } else {
            ta.a aVar18 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar18);
            ((LottieAnimationView) ((hj.i1) aVar18).f32680c.f32359e).e();
        }
        LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
        if (ry.l.D(new Integer[]{51, 55}, Integer.valueOf(cf.x.n().keyLanguage))) {
            ta.a aVar19 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar19);
            ff.h.L(context, ((hj.i1) aVar19).f32681d, 18);
        }
    }

    public final void r() {
        ta.a aVar = this.f47886f;
        kotlin.jvm.internal.m.c(aVar);
        int childCount = ((hj.i1) aVar).f32682e.getChildCount();
        int i11 = 0;
        for (int i12 = 0; i12 < childCount; i12++) {
            ta.a aVar2 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar2);
            View childAt = ((hj.i1) aVar2).f32682e.getChildAt(i12);
            kotlin.jvm.internal.m.d(childAt, "null cannot be cast to non-null type com.google.android.flexbox.FlexboxLayout");
            if (((FlexboxLayout) childAt).getVisibility() == 0) {
                i11++;
            }
        }
        ta.a aVar3 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar3);
        int childCount2 = ((hj.i1) aVar3).f32682e.getChildCount();
        for (int i13 = 0; i13 < childCount2; i13++) {
            ta.a aVar4 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar4);
            View childAt2 = ((hj.i1) aVar4).f32682e.getChildAt(i13);
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
            Editable text = ((hj.i1) aVar).f32681d.getText();
            ArrayList arrayList = this.f47837l;
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

    /* JADX WARN: Code duplicated, block: B:15:0x007b  */
    /* JADX WARN: Code duplicated, block: B:18:0x0086  */
    public final String t() {
        ArrayList arrayList = this.f47837l;
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
        ArrayList arrayList2 = this.f47839o;
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
            String strN = hh.p0.n("getDefault(...)", strSubstring, "toLowerCase(...)");
            Locale locale = Locale.getDefault();
            kotlin.jvm.internal.m.e(locale, "getDefault(...)");
            String lowerCase = strM.toLowerCase(locale);
            kotlin.jvm.internal.m.e(lowerCase, "toLowerCase(...)");
            if (strN.equals(lowerCase)) {
                if (arrayList2.size() != arrayList.size()) {
                    return fr.j3.B((Word) arrayList2.get(arrayList.size()));
                }
            }
        } else if (arrayList2.size() != arrayList.size()) {
            return fr.j3.B((Word) arrayList2.get(arrayList.size()));
        }
        return BuildConfig.VERSION_NAME;
    }

    public final Sentence u() {
        Sentence sentence = this.f47834i;
        if (sentence != null) {
            return sentence;
        }
        kotlin.jvm.internal.m.n("mModel");
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003e  */
    /* JADX WARN: Code duplicated, block: B:12:0x004e  */
    /* JADX WARN: Code duplicated, block: B:18:0x006d  */
    /* JADX WARN: Code duplicated, block: B:9:0x002f  */
    public final void v(int i11, String str) {
        ArrayList arrayList;
        int size;
        ArrayList arrayList2;
        String strB;
        ta.a aVar = this.f47886f;
        kotlin.jvm.internal.m.c(aVar);
        Editable text = ((hj.i1) aVar).f32681d.getText();
        if (i11 == 0) {
            int[] iArr = bq.r.f4959a;
            if (bq.m.F() || !y()) {
                arrayList = this.f47837l;
                size = arrayList.size() - 1;
                arrayList2 = this.f47839o;
                if (size < arrayList2.size()) {
                    strB = fr.j3.B((Word) arrayList2.get(arrayList.size() - 1));
                } else {
                    strB = BuildConfig.VERSION_NAME;
                }
                if (strB.equalsIgnoreCase(str) || strB.equals(str)) {
                    text.insert(i11, str);
                } else {
                    int[] iArr2 = bq.r.f4959a;
                    String upperCase = str.toUpperCase(bq.m.p());
                    kotlin.jvm.internal.m.e(upperCase, "toUpperCase(...)");
                    text.insert(i11, upperCase);
                }
            } else {
                String upperCase2 = str.toUpperCase(bq.m.p());
                kotlin.jvm.internal.m.e(upperCase2, "toUpperCase(...)");
                text.insert(i11, upperCase2);
            }
        } else {
            arrayList = this.f47837l;
            size = arrayList.size() - 1;
            arrayList2 = this.f47839o;
            if (size < arrayList2.size()) {
                strB = fr.j3.B((Word) arrayList2.get(arrayList.size() - 1));
            } else {
                strB = BuildConfig.VERSION_NAME;
            }
            if (strB.equalsIgnoreCase(str)) {
                text.insert(i11, str);
            } else {
                text.insert(i11, str);
            }
        }
        if (text.length() > 1) {
            int[] iArr3 = bq.r.f4959a;
            if (bq.m.F()) {
                return;
            }
            String lowerCase = String.valueOf(text.charAt(1)).toLowerCase(bq.m.p());
            kotlin.jvm.internal.m.e(lowerCase, "toLowerCase(...)");
            text.replace(1, 2, lowerCase);
        }
    }

    public final void w(int i11) {
        ta.a aVar = this.f47886f;
        kotlin.jvm.internal.m.c(aVar);
        ((hj.i1) aVar).f32684g.setVisibility(i11);
        ta.a aVar2 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar2);
        ((hj.i1) aVar2).f32683f.setVisibility(i11);
        int[] iArr = bq.r.f4959a;
        if (bq.m.F()) {
            return;
        }
        ta.a aVar3 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar3);
        ((hj.i1) aVar3).f32683f.setVisibility(8);
    }

    public final void x() {
        Env env;
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        if (cf.x.n().keyLanguage != 1 && cf.x.n().keyLanguage != 12) {
            q(zq.c.b(u()));
        }
        StringBuilder sb2 = new StringBuilder();
        Iterator<Word> it = u().getSentWords().iterator();
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
                q(u().getSentence() + "\n" + ((Object) sb2));
                ta.a aVar = this.f47886f;
                kotlin.jvm.internal.m.c(aVar);
                ((hj.i1) aVar).f32681d.setHint(R.string.write_the_sentence_in_hiragana);
                break;
            case 1:
                q(u().getTranslations() + "\n" + ((Object) sb2));
                ta.a aVar2 = this.f47886f;
                kotlin.jvm.internal.m.c(aVar2);
                ((hj.i1) aVar2).f32681d.setHint(R.string.write_the_sentence_in_hiragana);
                break;
            case 2:
                q(u().getTranslations() + "\n" + ((Object) sb2));
                ta.a aVar3 = this.f47886f;
                kotlin.jvm.internal.m.c(aVar3);
                ((hj.i1) aVar3).f32681d.setHint(R.string.write_the_sentence_in_romaji);
                break;
            case 3:
                q(u().getSentence() + "\n" + ((Object) sb2));
                ta.a aVar4 = this.f47886f;
                kotlin.jvm.internal.m.c(aVar4);
                ((hj.i1) aVar4).f32681d.setHint(R.string.write_the_sentence_in_hiragana);
                break;
            case 4:
                q(u().getSentence() + "\n" + ((Object) sb2));
                ta.a aVar5 = this.f47886f;
                kotlin.jvm.internal.m.c(aVar5);
                ((hj.i1) aVar5).f32681d.setHint(R.string.write_the_sentence_in_romaji);
                break;
            case 5:
                q(u().getTranslations() + "\n" + ((Object) sb2));
                ta.a aVar6 = this.f47886f;
                kotlin.jvm.internal.m.c(aVar6);
                ((hj.i1) aVar6).f32681d.setHint(R.string.write_the_sentence_in_hiragana);
                break;
            case 6:
                q(u().getSentence() + "\n" + ((Object) sb2));
                ta.a aVar7 = this.f47886f;
                kotlin.jvm.internal.m.c(aVar7);
                ((hj.i1) aVar7).f32681d.setHint(R.string.write_the_sentence_in_hiragana);
                break;
        }
    }

    public final boolean y() {
        int[] iArr = bq.r.f4959a;
        if (bq.m.F()) {
            return false;
        }
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        return cf.x.n().keyLanguage != 20 && u().getSentWords().get(u().getSentWords().size() - 1).getWordType() == 1;
    }

    public final void z() {
        String strT;
        ta.a aVar = this.f47886f;
        kotlin.jvm.internal.m.c(aVar);
        if (((hj.i1) aVar).f32685h.getVisibility() == 0) {
            if (this.f47837l.size() == this.m.size() || ((jp.p0) this.f47881a).Q) {
                w(8);
            } else {
                w(0);
            }
        }
        try {
            strT = t();
        } catch (Exception e8) {
            e8.printStackTrace();
            strT = BuildConfig.VERSION_NAME;
        }
        if (strT.equals(BuildConfig.VERSION_NAME)) {
            ta.a aVar2 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar2);
            ((hj.i1) aVar2).f32684g.setImageResource(R.drawable.ic_hint_eye);
        } else {
            ta.a aVar3 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar3);
            ((hj.i1) aVar3).f32684g.setImageResource(R.drawable.ic_hint_eye_ls);
        }
    }

    @Override // hi.a
    public final List g() {
        ArrayList arrayList = new ArrayList();
        qy.q qVar = fv.b.f28186a;
        arrayList.add(new fv.a(2L, fv.b.H(u().getSentenceId()), fv.b.F(u().getSentenceId())));
        if (!((jp.p0) this.f47881a).Q) {
            int[] iArr = bq.r.f4959a;
            if (bq.m.F()) {
                ArrayList arrayList2 = this.f47838n;
                int size = arrayList2.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList2.get(i11);
                    i11++;
                    Word word = (Word) obj;
                    if (word.getWordType() != 1) {
                        String word2 = word.getWord();
                        String str = scNRoQgKSYX.yEqr;
                        if (!kotlin.jvm.internal.m.a(word2, str) && !kotlin.jvm.internal.m.a(word.getWord(), "っ") && !kotlin.jvm.internal.m.a(word.getWord(), "ー") && !kotlin.jvm.internal.m.a(word.getWord(), "ッ") && !kotlin.jvm.internal.m.a(word.getLuoma(), str)) {
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
        }
        return arrayList;
    }
}
