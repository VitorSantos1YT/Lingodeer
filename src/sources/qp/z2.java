package qp;

import android.animation.LayoutTransition;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.flexbox.FlexboxLayout;
import com.google.android.gms.internal.stats.RC.ualZoVVCQs;
import com.google.android.gms.measurement.zfxB.ypOOxsaJG;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.object.Sentence;
import com.lingo.lingoskill.object.Word;
import com.lingodeer.R;
import com.lingodeer.data.env.Env;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import l0.Eeqr.HOBXIlHxIkMBEA;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class z2 extends d {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Sentence f48286i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ObjectAnimator f48287j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public hh.s f48288k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f48289l;
    public final ArrayList m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ArrayList f48290n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ArrayList f48291o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ArrayList f48292p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public rx.b f48293q;

    public z2(mp.b bVar, long j11) {
        super(bVar, j11);
        this.f48289l = new ArrayList();
        this.m = new ArrayList();
        this.f48290n = new ArrayList();
        this.f48291o = new ArrayList();
        this.f48292p = new ArrayList();
    }

    public final boolean A() {
        int[] iArr = bq.r.f4959a;
        if (bq.m.F()) {
            return false;
        }
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        return cf.x.n().keyLanguage != 20 && u().getSentWords().get(u().getSentWords().size() - 1).getWordType() == 1;
    }

    public final void B() {
        String strT;
        ta.a aVar = this.f47886f;
        kotlin.jvm.internal.m.c(aVar);
        int visibility = ((hj.c2) aVar).f32452j.getVisibility();
        mp.b bVar = this.f47881a;
        ArrayList arrayList = this.m;
        ArrayList arrayList2 = this.f48289l;
        if (visibility == 0) {
            if (arrayList2.size() == arrayList.size() || ((jp.p0) bVar).Q) {
                x(8);
            } else {
                x(0);
            }
        } else if (arrayList2.size() < arrayList.size() && !((jp.p0) bVar).Q) {
            x(0);
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
            ((hj.c2) aVar2).f32451i.setImageResource(R.drawable.ic_hint_eye);
        } else {
            ta.a aVar3 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar3);
            ((hj.c2) aVar3).f32451i.setImageResource(R.drawable.ic_hint_eye_ls);
        }
    }

    @Override // hi.a
    public String b() {
        qy.q qVar = fv.b.f28186a;
        return fv.b.G(u().getSentenceId(), null, null);
    }

    @Override // hi.a
    public String c() {
        return i() + ";" + this.f47882b + ";13";
    }

    @Override // qp.d, hi.a
    public final void f() {
        super.f();
        ta.a aVar = this.f47886f;
        kotlin.jvm.internal.m.c(aVar);
        ((hj.c2) aVar).f32446d.removeTextChangedListener(this.f48288k);
        ObjectAnimator objectAnimator = this.f48287j;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
        }
        ObjectAnimator objectAnimator2 = this.f48287j;
        if (objectAnimator2 != null) {
            objectAnimator2.cancel();
        }
        rx.b bVar = this.f48293q;
        if (bVar != null) {
            bVar.dispose();
        }
    }

    @Override // hi.a
    public int i() {
        return 1;
    }

    @Override // hi.a
    public void j() {
        Sentence sentenceE = ij.c.e(this.f47882b);
        if (sentenceE == null) {
            throw new IllegalArgumentException();
        }
        this.f48286i = sentenceE;
        this.f48290n.addAll(fr.j3.x(u()));
        this.f48291o.addAll(fr.j3.t(u()));
    }

    @Override // qp.d
    public final fz.f n() {
        return y2.f48272a;
    }

    @Override // qp.d
    public void p() {
        int i11 = 6;
        ((jp.p0) this.f47881a).O(6);
        Context context = this.f47883c;
        kotlin.jvm.internal.m.d(context, "null cannot be cast to non-null type android.app.Activity");
        Window window = ((Activity) context).getWindow();
        int i12 = 3;
        window.setSoftInputMode(3);
        try {
            Method method = EditText.class.getMethod("setShowSoftInputOnFocus", Boolean.TYPE);
            kotlin.jvm.internal.m.e(method, "getMethod(...)");
            method.setAccessible(true);
            ta.a aVar = this.f47886f;
            kotlin.jvm.internal.m.c(aVar);
            method.invoke(((hj.c2) aVar).f32446d, Boolean.FALSE);
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        ta.a aVar2 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar2);
        ((hj.c2) aVar2).f32446d.setFocusable(true);
        ta.a aVar3 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar3);
        ((hj.c2) aVar3).f32446d.setFocusableInTouchMode(true);
        ta.a aVar4 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar4);
        ((hj.c2) aVar4).f32446d.requestFocus();
        TextView textView = (TextView) o().findViewById(R.id.tv_trans);
        String translations = u().getTranslations();
        kotlin.jvm.internal.m.e(translations, "getTranslations(...)");
        textView.setText(translations);
        z();
        y();
        th.j.a(qx.h.m(500L, TimeUnit.MILLISECONDS, ky.e.f38937b).g(px.b.a()).h(new n9.q(this, 17), c.O), this.f47887g);
        View viewFindViewById = o().findViewById(R.id.btn_try);
        kotlin.jvm.internal.m.e(viewFindViewById, "findViewById(...)");
        int i13 = 0;
        bq.z.b(viewFindViewById, new w2(this, i13));
        ef.e.B(o());
        ta.a aVar5 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar5);
        bq.z.b((ImageView) ((hj.c2) aVar5).f32448f.f32408d, new w2(this, 2));
        ta.a aVar6 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar6);
        bq.z.b(((hj.c2) aVar6).f32449g, new w2(this, i12));
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        int i14 = cf.x.n().keyLanguage;
        Env env = this.f47884d;
        if (i14 == 11 || cf.x.n().keyLanguage == 12 || cf.x.n().keyLanguage == 13) {
            ta.a aVar7 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar7);
            ((FrameLayout) ((hj.c2) aVar7).f32448f.f32407c).setVisibility(0);
            ta.a aVar8 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar8);
            int i15 = 4;
            ((hj.c2) aVar8).m.setVisibility(4);
            ta.a aVar9 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar9);
            ((hj.c2) aVar9).m.setTextSize(16.0f);
            ta.a aVar10 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar10);
            ((hj.c2) aVar10).f32449g.setVisibility(8);
            if (env.isAudioModel) {
                ta.a aVar11 = this.f47886f;
                kotlin.jvm.internal.m.c(aVar11);
                ((FrameLayout) ((hj.c2) aVar11).f32448f.f32407c).setVisibility(0);
                ta.a aVar12 = this.f47886f;
                kotlin.jvm.internal.m.c(aVar12);
                ((ImageView) ((hj.c2) aVar12).f32448f.f32408d).performClick();
                ta.a aVar13 = this.f47886f;
                kotlin.jvm.internal.m.c(aVar13);
                ((hj.c2) aVar13).f32454l.setVisibility(0);
                ta.a aVar14 = this.f47886f;
                kotlin.jvm.internal.m.c(aVar14);
                bq.z.b(((hj.c2) aVar14).f32454l, new w2(this, i15));
            } else {
                ta.a aVar15 = this.f47886f;
                kotlin.jvm.internal.m.c(aVar15);
                ((FrameLayout) ((hj.c2) aVar15).f32448f.f32407c).setVisibility(8);
                ta.a aVar16 = this.f47886f;
                kotlin.jvm.internal.m.c(aVar16);
                ((hj.c2) aVar16).m.setVisibility(0);
            }
        } else {
            ta.a aVar17 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar17);
            ((FrameLayout) ((hj.c2) aVar17).f32448f.f32407c).setVisibility(8);
            ta.a aVar18 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar18);
            ((hj.c2) aVar18).m.setVisibility(0);
            ta.a aVar19 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar19);
            ((hj.c2) aVar19).f32449g.setVisibility(0);
            if (env.isAudioModel) {
                ta.a aVar20 = this.f47886f;
                kotlin.jvm.internal.m.c(aVar20);
                ((hj.c2) aVar20).f32449g.setVisibility(0);
                ta.a aVar21 = this.f47886f;
                kotlin.jvm.internal.m.c(aVar21);
                ((hj.c2) aVar21).f32449g.performClick();
            } else {
                ta.a aVar22 = this.f47886f;
                kotlin.jvm.internal.m.c(aVar22);
                ((hj.c2) aVar22).f32449g.setVisibility(8);
            }
        }
        ta.a aVar23 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar23);
        bq.z.b(((hj.c2) aVar23).f32445c, new w2(this, 5));
        ta.a aVar24 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar24);
        bq.z.b(((hj.c2) aVar24).f32451i, new w2(this, i11));
        ta.a aVar25 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar25);
        bq.z.b(((hj.c2) aVar25).f32450h, new w2(this, 7));
        if (ry.l.D(new Integer[]{51, 55}, Integer.valueOf(cf.x.n().keyLanguage))) {
            ta.a aVar26 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar26);
            bq.z.a(((hj.c2) aVar26).f32446d, 0L, new x2(this, i13));
        }
        int[] iArr = bq.r.f4959a;
        ta.a aVar27 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar27);
        bq.m.I(((hj.c2) aVar27).f32446d);
    }

    public final void r() {
        ta.a aVar = this.f47886f;
        kotlin.jvm.internal.m.c(aVar);
        int childCount = ((hj.c2) aVar).f32447e.getChildCount();
        int i11 = 0;
        for (int i12 = 0; i12 < childCount; i12++) {
            ta.a aVar2 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar2);
            View childAt = ((hj.c2) aVar2).f32447e.getChildAt(i12);
            kotlin.jvm.internal.m.d(childAt, "null cannot be cast to non-null type com.google.android.flexbox.FlexboxLayout");
            if (((FlexboxLayout) childAt).getVisibility() == 0) {
                i11++;
            }
        }
        ta.a aVar3 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar3);
        int childCount2 = ((hj.c2) aVar3).f32447e.getChildCount();
        for (int i13 = 0; i13 < childCount2; i13++) {
            ta.a aVar4 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar4);
            View childAt2 = ((hj.c2) aVar4).f32447e.getChildAt(i13);
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
            Editable text = ((hj.c2) aVar).f32446d.getText();
            ArrayList arrayList = this.f48289l;
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
                if (!bq.m.F() && A()) {
                    String upperCase = String.valueOf(text.charAt(0)).toUpperCase(bq.m.p());
                    kotlin.jvm.internal.m.e(upperCase, "toUpperCase(...)");
                    text.replace(0, 1, upperCase);
                }
            }
            int size2 = arrayList.size();
            mp.b bVar = this.f47881a;
            if (size2 > 0) {
                ((jp.p0) bVar).O(4);
            } else {
                ((jp.p0) bVar).O(6);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:18:0x00b4  */
    public final String t() {
        ArrayList arrayList = this.f48289l;
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
        ArrayList arrayList2 = this.f48291o;
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
        Locale locale = Locale.getDefault();
        kotlin.jvm.internal.m.e(locale, "getDefault(...)");
        kotlin.jvm.internal.m.e(strM.toLowerCase(locale), "toLowerCase(...)");
        String strSubstring = strM2.substring(0, strM.length());
        kotlin.jvm.internal.m.e(strSubstring, "substring(...)");
        int[] iArr = bq.r.f4959a;
        kotlin.jvm.internal.m.e(strSubstring.toLowerCase(bq.m.p()), "toLowerCase(...)");
        if (!strM.equals(BuildConfig.VERSION_NAME)) {
            String strSubstring2 = strM2.substring(0, strM.length());
            kotlin.jvm.internal.m.e(strSubstring2, "substring(...)");
            String lowerCase = strSubstring2.toLowerCase(new Locale("tr"));
            kotlin.jvm.internal.m.e(lowerCase, "toLowerCase(...)");
            String lowerCase2 = strM.toLowerCase(new Locale("tr"));
            kotlin.jvm.internal.m.e(lowerCase2, "toLowerCase(...)");
            if (lowerCase.equals(lowerCase2)) {
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
        Sentence sentence = this.f48286i;
        if (sentence != null) {
            return sentence;
        }
        kotlin.jvm.internal.m.n("mModel");
        throw null;
    }

    public float v() {
        return ff.h.x(this.f47883c, 18);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003e  */
    /* JADX WARN: Code duplicated, block: B:12:0x004e  */
    /* JADX WARN: Code duplicated, block: B:18:0x0060  */
    /* JADX WARN: Code duplicated, block: B:9:0x002f  */
    public final void w(int i11, String str) {
        ArrayList arrayList;
        int size;
        ArrayList arrayList2;
        String strB;
        ta.a aVar = this.f47886f;
        kotlin.jvm.internal.m.c(aVar);
        Editable text = ((hj.c2) aVar).f32446d.getText();
        if (i11 == 0) {
            int[] iArr = bq.r.f4959a;
            if (bq.m.F() || !A()) {
                arrayList = this.f48289l;
                size = arrayList.size() - 1;
                arrayList2 = this.f48291o;
                if (size < arrayList2.size()) {
                    strB = fr.j3.B((Word) arrayList2.get(arrayList.size() - 1));
                } else {
                    strB = BuildConfig.VERSION_NAME;
                }
                if (strB.equalsIgnoreCase(str) || strB.equals(str)) {
                    text.insert(i11, str);
                } else {
                    text.insert(i11, strB);
                }
            } else {
                String upperCase = str.toUpperCase(bq.m.p());
                kotlin.jvm.internal.m.e(upperCase, "toUpperCase(...)");
                text.insert(i11, upperCase);
            }
        } else {
            arrayList = this.f48289l;
            size = arrayList.size() - 1;
            arrayList2 = this.f48291o;
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
            int[] iArr2 = bq.r.f4959a;
            if (bq.m.F()) {
                return;
            }
            String lowerCase = String.valueOf(text.charAt(1)).toLowerCase(bq.m.p());
            kotlin.jvm.internal.m.e(lowerCase, "toLowerCase(...)");
            text.replace(1, 2, lowerCase);
        }
    }

    public final void x(int i11) {
        ta.a aVar = this.f47886f;
        kotlin.jvm.internal.m.c(aVar);
        ((hj.c2) aVar).f32451i.setVisibility(i11);
        ta.a aVar2 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar2);
        ((hj.c2) aVar2).f32450h.setVisibility(i11);
        int[] iArr = bq.r.f4959a;
        if (bq.m.F()) {
            return;
        }
        ta.a aVar3 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar3);
        ((hj.c2) aVar3).f32450h.setVisibility(8);
    }

    public void y() {
        if (((jp.p0) this.f47881a).Q) {
            x(8);
        } else {
            x(0);
        }
    }

    public final void z() {
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
                ((hj.c2) aVar).f32446d.setHint(R.string.write_the_sentence_in_hiragana);
                break;
            case 1:
                q(u().getTranslations() + "\n" + ((Object) sb2));
                ta.a aVar2 = this.f47886f;
                kotlin.jvm.internal.m.c(aVar2);
                ((hj.c2) aVar2).f32446d.setHint(R.string.write_the_sentence_in_hiragana);
                break;
            case 2:
                q(u().getTranslations() + "\n" + ((Object) sb2));
                ta.a aVar3 = this.f47886f;
                kotlin.jvm.internal.m.c(aVar3);
                ((hj.c2) aVar3).f32446d.setHint(R.string.write_the_sentence_in_romaji);
                break;
            case 3:
                q(u().getSentence() + "\n" + ((Object) sb2));
                ta.a aVar4 = this.f47886f;
                kotlin.jvm.internal.m.c(aVar4);
                ((hj.c2) aVar4).f32446d.setHint(R.string.write_the_sentence_in_hiragana);
                break;
            case 4:
                q(u().getSentence() + "\n" + ((Object) sb2));
                ta.a aVar5 = this.f47886f;
                kotlin.jvm.internal.m.c(aVar5);
                ((hj.c2) aVar5).f32446d.setHint(R.string.write_the_sentence_in_romaji);
                break;
            case 5:
                q(u().getTranslations() + "\n" + ((Object) sb2));
                ta.a aVar6 = this.f47886f;
                kotlin.jvm.internal.m.c(aVar6);
                ((hj.c2) aVar6).f32446d.setHint(R.string.write_the_sentence_in_hiragana);
                break;
            case 6:
                q(u().getSentence() + "\n" + ((Object) sb2));
                ta.a aVar7 = this.f47886f;
                kotlin.jvm.internal.m.c(aVar7);
                ((hj.c2) aVar7).f32446d.setHint(R.string.write_the_sentence_in_hiragana);
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:39:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:56:0x0203  */
    /* JADX WARN: Code duplicated, block: B:60:0x022e A[Catch: Exception -> 0x023a, TRY_LEAVE, TryCatch #0 {Exception -> 0x023a, blocks: (B:58:0x0208, B:60:0x022e), top: B:100:0x0208 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x024a  */
    /* JADX WARN: Code duplicated, block: B:77:0x025c  */
    /* JADX WARN: Code duplicated, block: B:96:0x0303  */
    @Override // hi.a
    public final boolean a() {
        boolean z11;
        ArrayList arrayList;
        String lowerCase;
        String lowerCase2;
        ta.a aVar = this.f47886f;
        kotlin.jvm.internal.m.c(aVar);
        ta.a aVar2 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar2);
        if (((hj.c2) aVar2).f32446d.getText() == null) {
            return false;
        }
        ta.a aVar3 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar3);
        if (((hj.c2) aVar3).m.getVisibility() == 4) {
            ta.a aVar4 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar4);
            ((hj.c2) aVar4).m.setVisibility(0);
            ta.a aVar5 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar5);
            ((hj.c2) aVar5).f32454l.setVisibility(4);
        }
        ta.a aVar6 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar6);
        String string = ((hj.c2) aVar6).f32446d.getText().toString();
        ArrayList arrayList2 = this.f48291o;
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
        ta.a aVar7 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar7);
        ((hj.c2) aVar7).f32445c.setVisibility(4);
        ta.a aVar8 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar8);
        ((hj.c2) aVar8).f32445c.setClickable(false);
        ta.a aVar9 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar9);
        ((hj.c2) aVar9).f32447e.setVisibility(8);
        x(8);
        ta.a aVar10 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar10);
        ((hj.c2) aVar10).f32446d.setFocusable(false);
        ta.a aVar11 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar11);
        ((hj.c2) aVar11).f32446d.setClickable(false);
        ArrayList arrayList3 = new ArrayList();
        String strQ0 = oz.x.q0(oz.x.q0(oz.x.q0(oz.x.q0(oz.x.q0(oz.x.q0(string, "َّ", "َّ"), "ِّ", "ِّ"), "ُّ", "ُّ"), "ًّ", "ًّ"), "ٍّ", "ٍّ"), "ٌّ", "ٌّ");
        String strQ1 = oz.x.q0(oz.x.q0(oz.x.q0(oz.x.q0(oz.x.q0(oz.x.q0(strM, "َّ", "َّ"), "ِّ", "ِّ"), "ُّ", "ُّ"), "ًّ", "ًّ"), "ٍّ", "ٍّ"), "ٌّ", "ٌّ");
        boolean zEqualsIgnoreCase = strQ0.equalsIgnoreCase(strQ1);
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        int i12 = cf.x.n().keyLanguage;
        String str = ypOOxsaJG.yFygkaegsbg;
        if ((i12 == 2 || cf.x.n().keyLanguage == 13) && cf.x.n().ignoreSpace) {
            int[] iArr = bq.r.f4959a;
            String lowerCase3 = strQ0.toLowerCase(bq.m.p());
            kotlin.jvm.internal.m.e(lowerCase3, str);
            String strQ2 = oz.x.q0(lowerCase3, " ", BuildConfig.VERSION_NAME);
            String lowerCase4 = strQ1.toLowerCase(bq.m.p());
            kotlin.jvm.internal.m.e(lowerCase4, str);
            zEqualsIgnoreCase = strQ2.equals(oz.x.q0(lowerCase4, " ", BuildConfig.VERSION_NAME));
        }
        int i13 = 22;
        int i14 = 10;
        if (!zEqualsIgnoreCase && (cf.x.n().keyLanguage == 10 || cf.x.n().keyLanguage == 22)) {
            strQ1 = oz.x.q0(strQ1, "́", BuildConfig.VERSION_NAME);
        }
        String str2 = strQ1;
        int length = str2.length();
        int i15 = 0;
        int i16 = 0;
        while (i15 < length) {
            String str3 = String.valueOf(str2.charAt(i15));
            if (kotlin.jvm.internal.m.a(str3, "́")) {
                LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
                if (cf.x.n().keyLanguage == i14 || cf.x.n().keyLanguage == i13) {
                    i16++;
                    z11 = zEqualsIgnoreCase;
                } else {
                    z11 = zEqualsIgnoreCase;
                    if (i15 < strQ0.length() + i16) {
                        kotlin.jvm.internal.m.f(str3, "str");
                        if ((Pattern.matches("\\p{Punct}", str3) && !str3.equals("...") && !str3.equals(" ") && !str3.equals("～")) || str3.equals("-") || str3.equals("'") || str3.equals(" ") || str3.equals("_")) {
                            try {
                                String strValueOf = String.valueOf(strQ0.charAt(i15 - i16));
                                int[] iArr2 = bq.r.f4959a;
                                lowerCase = str3.toLowerCase(bq.m.p());
                                kotlin.jvm.internal.m.e(lowerCase, str);
                                lowerCase2 = strValueOf.toLowerCase(bq.m.p());
                                kotlin.jvm.internal.m.e(lowerCase2, str);
                                if (lowerCase.equals(lowerCase2)) {
                                    arrayList = arrayList3;
                                    try {
                                        arrayList.add(Integer.valueOf(i15));
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
                            kotlin.jvm.internal.m.f(str3, "str");
                            if ((Pattern.matches("\\p{Punct}", str3) && !str3.equals("...") && !str3.equals(" ") && !str3.equals("～")) || str3.equals("-") || str3.equals("'") || str3.equals(" ") || str3.equals("_")) {
                                arrayList.add(Integer.valueOf(i15));
                            }
                        }
                    } else {
                        arrayList = arrayList3;
                        kotlin.jvm.internal.m.f(str3, "str");
                        i16 = Pattern.matches("\\p{Punct}", str3) ? i16 + 1 : i16 + 1;
                    }
                }
                arrayList = arrayList3;
            } else {
                z11 = zEqualsIgnoreCase;
                if (i15 < strQ0.length() + i16) {
                    kotlin.jvm.internal.m.f(str3, "str");
                    if (Pattern.matches("\\p{Punct}", str3)) {
                        arrayList = arrayList3;
                        kotlin.jvm.internal.m.f(str3, "str");
                        if (Pattern.matches("\\p{Punct}", str3)) {
                        }
                    } else {
                        arrayList = arrayList3;
                        kotlin.jvm.internal.m.f(str3, "str");
                        if (Pattern.matches("\\p{Punct}", str3)) {
                        }
                    }
                    String strValueOf2 = String.valueOf(strQ0.charAt(i15 - i16));
                    int[] iArr3 = bq.r.f4959a;
                    lowerCase = str3.toLowerCase(bq.m.p());
                    kotlin.jvm.internal.m.e(lowerCase, str);
                    lowerCase2 = strValueOf2.toLowerCase(bq.m.p());
                    kotlin.jvm.internal.m.e(lowerCase2, str);
                    if (lowerCase.equals(lowerCase2)) {
                        arrayList = arrayList3;
                    } else {
                        arrayList = arrayList3;
                        arrayList.add(Integer.valueOf(i15));
                    }
                } else {
                    arrayList = arrayList3;
                    kotlin.jvm.internal.m.f(str3, "str");
                    if (Pattern.matches("\\p{Punct}", str3)) {
                    }
                }
            }
            i15++;
            arrayList3 = arrayList;
            zEqualsIgnoreCase = z11;
            i13 = 22;
            i14 = 10;
        }
        boolean z12 = zEqualsIgnoreCase;
        ArrayList arrayList4 = arrayList3;
        Context context = this.f47883c;
        if (z12) {
            ta.a aVar12 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar12);
            ((hj.c2) aVar12).f32446d.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, context.getDrawable(R.drawable.line_correct));
            ta.a aVar13 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar13);
            ((hj.c2) aVar13).f32446d.setTextColor(context.getColor(R.color.color_43CC93));
        } else {
            LingoSkillApplication lingoSkillApplication3 = LingoSkillApplication.f21665b;
            if (ry.l.D(new Integer[]{51, 55, 57}, Integer.valueOf(cf.x.n().keyLanguage))) {
                ta.a aVar14 = this.f47886f;
                kotlin.jvm.internal.m.c(aVar14);
                ((hj.c2) aVar14).f32446d.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, context.getDrawable(R.drawable.line_correct));
                ta.a aVar15 = this.f47886f;
                kotlin.jvm.internal.m.c(aVar15);
                ((hj.c2) aVar15).f32446d.setTextColor(context.getColor(R.color.color_43CC93));
            } else {
                ta.a aVar16 = this.f47886f;
                kotlin.jvm.internal.m.c(aVar16);
                ((hj.c2) aVar16).f32446d.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, context.getDrawable(R.drawable.line_wrong));
                ta.a aVar17 = this.f47886f;
                kotlin.jvm.internal.m.c(aVar17);
                ((hj.c2) aVar17).f32446d.setTextColor(context.getColor(R.color.color_FF6666));
                if (!ry.l.D(new Integer[]{51, 55, 57}, Integer.valueOf(cf.x.n().keyLanguage))) {
                    mp.b bVar = this.f47881a;
                    kotlin.jvm.internal.m.d(bVar, "null cannot be cast to non-null type com.lingo.lingoskill.ui.learn.BaseLessonTestFragment");
                    ((jp.p0) bVar).f36528d0 = new ob.m(gb.r.N(str2), this, arrayList4, 29);
                }
            }
        }
        if (!z12) {
            LingoSkillApplication lingoSkillApplication4 = LingoSkillApplication.f21665b;
            String checkAnswerPrompt = this.f47884d.checkAnswerPrompt;
            kotlin.jvm.internal.m.e(checkAnswerPrompt, "checkAnswerPrompt");
            String strQ3 = oz.x.q0(checkAnswerPrompt, "userSentence%", strQ0);
            String translations = u().getTranslations();
            kotlin.jvm.internal.m.e(translations, "getTranslations(...)");
            String strQ4 = oz.x.q0(strQ3, "translation%", translations);
            String sentence = u().getSentence();
            kotlin.jvm.internal.m.e(sentence, "getSentence(...)");
            oz.x.q0(strQ4, "correctSentence%", sentence);
        }
        return z12;
    }

    @Override // hi.a
    public List g() {
        ArrayList arrayList = new ArrayList();
        qy.q qVar = fv.b.f28186a;
        arrayList.add(new fv.a(2L, fv.b.H(u().getSentenceId()), fv.b.F(u().getSentenceId())));
        if (!((jp.p0) this.f47881a).Q) {
            int[] iArr = bq.r.f4959a;
            if (bq.m.F()) {
                ArrayList arrayList2 = this.f48290n;
                int size = arrayList2.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList2.get(i11);
                    i11++;
                    Word word = (Word) obj;
                    if (word.getWordType() != 1) {
                        String word2 = word.getWord();
                        String str = HOBXIlHxIkMBEA.NtZRfsYiMTYNXgb;
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
            if (iL2 <= ((hj.c2) aVar).f32447e.getWidth()) {
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
        int childCount = ((hj.c2) aVar2).f32447e.getChildCount();
        for (int i15 = 0; i15 < childCount; i15++) {
            ta.a aVar3 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar3);
            View childAt = ((hj.c2) aVar3).f32447e.getChildAt(i15);
            kotlin.jvm.internal.m.d(childAt, "null cannot be cast to non-null type com.google.android.flexbox.FlexboxLayout");
            ((FlexboxLayout) childAt).removeAllViews();
        }
        ta.a aVar4 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar4);
        ((hj.c2) aVar4).f32447e.removeAllViews();
        int size2 = arrayList2.size();
        int i16 = 0;
        while (i16 < size2) {
            Object obj2 = arrayList2.get(i16);
            i16++;
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f47883c);
            ta.a aVar5 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar5);
            View viewInflate = layoutInflaterFrom.inflate(R.layout.include_flexbox_layout, (ViewGroup) ((hj.c2) aVar5).f32447e, false);
            kotlin.jvm.internal.m.d(viewInflate, "null cannot be cast to non-null type com.google.android.flexbox.FlexboxLayout");
            FlexboxLayout flexboxLayout = (FlexboxLayout) viewInflate;
            Iterator it = ((List) obj2).iterator();
            while (it.hasNext()) {
                flexboxLayout.addView((FrameLayout) it.next());
            }
            ta.a aVar6 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar6);
            ((hj.c2) aVar6).f32447e.addView(flexboxLayout);
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
        ArrayList arrayList4 = this.f48289l;
        int size3 = arrayList4.size();
        String strM = ualZoVVCQs.CGEHvgahyVBvAvs;
        while (i11 < size3) {
            Object obj3 = arrayList4.get(i11);
            i11++;
            Object tag2 = ((FrameLayout) obj3).getTag();
            kotlin.jvm.internal.m.d(tag2, "null cannot be cast to non-null type com.lingo.lingoskill.object.Word");
            strM = defpackage.e.m(strM, fr.j3.B((Word) tag2));
        }
        ta.a aVar7 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar7);
        ((hj.c2) aVar7).f32446d.setText(strM);
        z();
    }
}
