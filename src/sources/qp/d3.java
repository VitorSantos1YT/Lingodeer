package qp;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.object.Sentence;
import com.lingo.lingoskill.object.Word;
import com.lingo.lingoskill.unity.exception.NoSuchElemException;
import com.lingodeer.data.env.Env;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import lt.AJC.PQgum;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class d3 extends d {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public hh.s f47894i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Sentence f47895j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ArrayList f47896k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public b3 f47897l;
    public rx.b m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d3(mp.b view, long j11) {
        super(view, j11);
        kotlin.jvm.internal.m.f(view, "view");
        this.f47896k = new ArrayList();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0039  */
    /* JADX WARN: Code duplicated, block: B:18:0x0067  */
    /* JADX WARN: Code duplicated, block: B:35:0x009b  */
    /* JADX WARN: Code duplicated, block: B:39:0x00cc A[Catch: Exception -> 0x00d4, TRY_LEAVE, TryCatch #0 {Exception -> 0x00d4, blocks: (B:37:0x00a2, B:39:0x00cc), top: B:63:0x00a2 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:51:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:68:0x0116 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0029  */
    /* JADX WARN: Code duplicated, block: B:9:0x0031  */
    public static void s(String str, String str2, ArrayList arrayList) {
        int i11;
        String lowerCase;
        String lowerCase2;
        int length = str2.length();
        int i12 = 0;
        int i13 = 0;
        while (i12 < length) {
            String str3 = String.valueOf(str2.charAt(i12));
            if (kotlin.jvm.internal.m.a(str3, " ")) {
                int[] iArr = bq.r.f4959a;
                if (bq.m.F()) {
                    i13++;
                    i11 = length;
                } else {
                    if (kotlin.jvm.internal.m.a(str3, "́")) {
                        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                        if (cf.x.n().keyLanguage != 10 || cf.x.n().keyLanguage == 22) {
                            i13++;
                            i11 = length;
                        }
                    }
                    i11 = length;
                    if (i12 < str.length() + i13) {
                        kotlin.jvm.internal.m.f(str3, "str");
                        if ((Pattern.matches("\\p{Punct}", str3) && !str3.equals("...") && !str3.equals(" ") && !str3.equals("～")) || str3.equals("-") || str3.equals("'") || str3.equals(" ") || str3.equals("_")) {
                            try {
                                String strValueOf = String.valueOf(str.charAt(i12 - i13));
                                Locale locale = Locale.getDefault();
                                kotlin.jvm.internal.m.e(locale, "getDefault(...)");
                                lowerCase = str3.toLowerCase(locale);
                                kotlin.jvm.internal.m.e(lowerCase, "toLowerCase(...)");
                                Locale locale2 = Locale.getDefault();
                                kotlin.jvm.internal.m.e(locale2, "getDefault(...)");
                                lowerCase2 = strValueOf.toLowerCase(locale2);
                                kotlin.jvm.internal.m.e(lowerCase2, "toLowerCase(...)");
                                if (!lowerCase.equals(lowerCase2)) {
                                    arrayList.add(Integer.valueOf(i12));
                                }
                            } catch (Exception e8) {
                                e8.printStackTrace();
                            }
                        } else {
                            kotlin.jvm.internal.m.f(str3, "str");
                            if ((Pattern.matches("\\p{Punct}", str3) && !str3.equals("...") && !str3.equals(" ") && !str3.equals("～")) || str3.equals("-") || str3.equals("'") || str3.equals(" ") || str3.equals("_")) {
                                arrayList.add(Integer.valueOf(i12));
                            }
                        }
                    } else {
                        kotlin.jvm.internal.m.f(str3, "str");
                        i13 = Pattern.matches("\\p{Punct}", str3) ? i13 + 1 : i13 + 1;
                    }
                }
            } else {
                if (kotlin.jvm.internal.m.a(str3, "́")) {
                    LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
                    if (cf.x.n().keyLanguage != 10) {
                    }
                    i13++;
                    i11 = length;
                }
                i11 = length;
                if (i12 < str.length() + i13) {
                    kotlin.jvm.internal.m.f(str3, "str");
                    if (Pattern.matches("\\p{Punct}", str3)) {
                        kotlin.jvm.internal.m.f(str3, "str");
                        if (Pattern.matches("\\p{Punct}", str3)) {
                        }
                    } else {
                        kotlin.jvm.internal.m.f(str3, "str");
                        if (Pattern.matches("\\p{Punct}", str3)) {
                        }
                    }
                    String strValueOf2 = String.valueOf(str.charAt(i12 - i13));
                    Locale locale3 = Locale.getDefault();
                    kotlin.jvm.internal.m.e(locale3, "getDefault(...)");
                    lowerCase = str3.toLowerCase(locale3);
                    kotlin.jvm.internal.m.e(lowerCase, "toLowerCase(...)");
                    Locale locale4 = Locale.getDefault();
                    kotlin.jvm.internal.m.e(locale4, "getDefault(...)");
                    lowerCase2 = strValueOf2.toLowerCase(locale4);
                    kotlin.jvm.internal.m.e(lowerCase2, "toLowerCase(...)");
                    if (!lowerCase.equals(lowerCase2)) {
                        arrayList.add(Integer.valueOf(i12));
                    }
                } else {
                    kotlin.jvm.internal.m.f(str3, "str");
                    if (Pattern.matches("\\p{Punct}", str3)) {
                    }
                }
            }
            i12++;
            length = i11;
        }
    }

    @Override // hi.a
    public final String b() {
        qy.q qVar = fv.b.f28186a;
        return fv.b.G(r().getSentenceId(), null, null);
    }

    @Override // hi.a
    public final String c() {
        return nv.p.m(this.f47882b, "1;", ";13");
    }

    @Override // qp.d, hi.a
    public final void f() {
        super.f();
        Context context = this.f47883c;
        kotlin.jvm.internal.m.d(context, "null cannot be cast to non-null type android.app.Activity");
        ((FrameLayout) ((Activity) context).findViewById(R.id.content)).getViewTreeObserver().removeOnGlobalLayoutListener(this.f47897l);
        rx.b bVar = this.m;
        if (bVar != null) {
            bVar.dispose();
        }
    }

    @Override // hi.a
    public final List g() {
        ArrayList arrayList = new ArrayList();
        qy.q qVar = fv.b.f28186a;
        arrayList.add(new fv.a(2L, fv.b.H(r().getSentenceId()), fv.b.F(r().getSentenceId())));
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
        this.f47895j = sentenceE;
    }

    @Override // hi.a
    public final void k() {
    }

    @Override // qp.d
    public fz.f n() {
        return c3.f47872a;
    }

    @Override // qp.d
    public final void p() {
        this.f47896k = fr.j3.t(r());
        jp.p0 p0Var = (jp.p0) this.f47881a;
        final int i11 = 0;
        p0Var.O(0);
        final int i12 = 5;
        this.f47894i = new hh.s(this, i12);
        ta.a aVar = this.f47886f;
        kotlin.jvm.internal.m.c(aVar);
        ((hj.d2) aVar).f32482c.addTextChangedListener(this.f47894i);
        ta.a aVar2 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar2);
        ((hj.d2) aVar2).f32482c.requestFocus();
        int[] iArr = bq.r.f4959a;
        ta.a aVar3 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar3);
        EditText editText = ((hj.d2) aVar3).f32482c;
        final int i13 = 1;
        editText.setFocusable(true);
        editText.setFocusableInTouchMode(true);
        editText.requestFocus();
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        kotlin.jvm.internal.m.c(lingoSkillApplication);
        Object systemService = lingoSkillApplication.getSystemService("input_method");
        kotlin.jvm.internal.m.d(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        final int i14 = 2;
        ((InputMethodManager) systemService).showSoftInput(editText, 2);
        ta.a aVar4 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar4);
        TextView textView = ((hj.d2) aVar4).f32487h;
        String translations = r().getTranslations();
        kotlin.jvm.internal.m.e(translations, "getTranslations(...)");
        textView.setText(translations);
        q(zq.c.b(r()));
        ta.a aVar5 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar5);
        bq.z.b(((hj.d2) aVar5).f32481b, new fz.c(this) { // from class: qp.a3

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d3 f47824b;

            {
                this.f47824b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                View it = (View) obj;
                switch (i11) {
                    case 0:
                        kotlin.jvm.internal.m.f(it, "it");
                        d3 d3Var = this.f47824b;
                        Env env = d3Var.f47884d;
                        env.isKeyboard = !env.isKeyboard;
                        env.updateEntry("isKeyboard");
                        ((jp.p0) d3Var.f47881a).A().l();
                        break;
                    case 1:
                        kotlin.jvm.internal.m.f(it, "it");
                        d3 d3Var2 = this.f47824b;
                        mp.b bVar = d3Var2.f47881a;
                        String strB = d3Var2.b();
                        ta.a aVar6 = d3Var2.f47886f;
                        kotlin.jvm.internal.m.c(aVar6);
                        ImageView ivAudio = (ImageView) ((hj.d2) aVar6).f32483d.f32408d;
                        kotlin.jvm.internal.m.e(ivAudio, "ivAudio");
                        ((jp.p0) bVar).H(ivAudio, strB);
                        break;
                    case 2:
                        kotlin.jvm.internal.m.f(it, "it");
                        d3 d3Var3 = this.f47824b;
                        mp.b bVar2 = d3Var3.f47881a;
                        String strB2 = d3Var3.b();
                        ta.a aVar7 = d3Var3.f47886f;
                        kotlin.jvm.internal.m.c(aVar7);
                        ImageView ivAudio2 = (ImageView) ((hj.d2) aVar7).f32483d.f32408d;
                        kotlin.jvm.internal.m.e(ivAudio2, "ivAudio");
                        ((jp.p0) bVar2).H(ivAudio2, strB2);
                        break;
                    case 3:
                        kotlin.jvm.internal.m.f(it, "it");
                        d3 d3Var4 = this.f47824b;
                        ta.a aVar8 = d3Var4.f47886f;
                        kotlin.jvm.internal.m.c(aVar8);
                        ((hj.d2) aVar8).f32486g.setVisibility(4);
                        ta.a aVar9 = d3Var4.f47886f;
                        kotlin.jvm.internal.m.c(aVar9);
                        ((hj.d2) aVar9).f32487h.setVisibility(0);
                        rx.b bVar3 = d3Var4.m;
                        if (bVar3 != null) {
                            bVar3.dispose();
                        }
                        xx.f fVarH = qx.h.m(3L, TimeUnit.SECONDS, ky.e.f38937b).g(px.b.a()).h(new o20.i(d3Var4, 15), c.R);
                        th.j.a(fVarH, d3Var4.f47887g);
                        d3Var4.m = fVarH;
                        break;
                    case 4:
                        kotlin.jvm.internal.m.f(it, "it");
                        d3 d3Var5 = this.f47824b;
                        mp.b bVar4 = d3Var5.f47881a;
                        String strB3 = d3Var5.b();
                        ta.a aVar10 = d3Var5.f47886f;
                        kotlin.jvm.internal.m.c(aVar10);
                        ImageView ivAudioSmall = ((hj.d2) aVar10).f32484e;
                        kotlin.jvm.internal.m.e(ivAudioSmall, "ivAudioSmall");
                        ((jp.p0) bVar4).H(ivAudioSmall, strB3);
                        break;
                    default:
                        kotlin.jvm.internal.m.f(it, "it");
                        d3 d3Var6 = this.f47824b;
                        mp.b bVar5 = d3Var6.f47881a;
                        String strB4 = d3Var6.b();
                        ta.a aVar11 = d3Var6.f47886f;
                        kotlin.jvm.internal.m.c(aVar11);
                        ImageView ivAudioSmall2 = ((hj.d2) aVar11).f32484e;
                        kotlin.jvm.internal.m.e(ivAudioSmall2, "ivAudioSmall");
                        ((jp.p0) bVar5).H(ivAudioSmall2, strB4);
                        break;
                }
                return qy.b0.f48488a;
            }
        });
        Env env = this.f47884d;
        if (env.isAudioModel || cf.x.n().keyLanguage == 11 || cf.x.n().keyLanguage == 12 || cf.x.n().keyLanguage == 13) {
            ta.a aVar6 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar6);
            ((hj.d2) aVar6).f32484e.setVisibility(8);
            if (bq.m.F() && env.isAudioModel) {
                String strB = b();
                ta.a aVar7 = this.f47886f;
                kotlin.jvm.internal.m.c(aVar7);
                p0Var.H((ImageView) ((hj.d2) aVar7).f32483d.f32408d, strB);
                if (!p0Var.Q) {
                    ta.a aVar8 = this.f47886f;
                    kotlin.jvm.internal.m.c(aVar8);
                    LinearLayout rootParent = ((hj.d2) aVar8).f32485f;
                    kotlin.jvm.internal.m.e(rootParent, "rootParent");
                    bq.z.b(rootParent, new fz.c(this) { // from class: qp.a3

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ d3 f47824b;

                        {
                            this.f47824b = this;
                        }

                        @Override // fz.c
                        public final Object invoke(Object obj) {
                            View it = (View) obj;
                            switch (i13) {
                                case 0:
                                    kotlin.jvm.internal.m.f(it, "it");
                                    d3 d3Var = this.f47824b;
                                    Env env2 = d3Var.f47884d;
                                    env2.isKeyboard = !env2.isKeyboard;
                                    env2.updateEntry("isKeyboard");
                                    ((jp.p0) d3Var.f47881a).A().l();
                                    break;
                                case 1:
                                    kotlin.jvm.internal.m.f(it, "it");
                                    d3 d3Var2 = this.f47824b;
                                    mp.b bVar = d3Var2.f47881a;
                                    String strB2 = d3Var2.b();
                                    ta.a aVar9 = d3Var2.f47886f;
                                    kotlin.jvm.internal.m.c(aVar9);
                                    ImageView ivAudio = (ImageView) ((hj.d2) aVar9).f32483d.f32408d;
                                    kotlin.jvm.internal.m.e(ivAudio, "ivAudio");
                                    ((jp.p0) bVar).H(ivAudio, strB2);
                                    break;
                                case 2:
                                    kotlin.jvm.internal.m.f(it, "it");
                                    d3 d3Var3 = this.f47824b;
                                    mp.b bVar2 = d3Var3.f47881a;
                                    String strB3 = d3Var3.b();
                                    ta.a aVar10 = d3Var3.f47886f;
                                    kotlin.jvm.internal.m.c(aVar10);
                                    ImageView ivAudio2 = (ImageView) ((hj.d2) aVar10).f32483d.f32408d;
                                    kotlin.jvm.internal.m.e(ivAudio2, "ivAudio");
                                    ((jp.p0) bVar2).H(ivAudio2, strB3);
                                    break;
                                case 3:
                                    kotlin.jvm.internal.m.f(it, "it");
                                    d3 d3Var4 = this.f47824b;
                                    ta.a aVar11 = d3Var4.f47886f;
                                    kotlin.jvm.internal.m.c(aVar11);
                                    ((hj.d2) aVar11).f32486g.setVisibility(4);
                                    ta.a aVar12 = d3Var4.f47886f;
                                    kotlin.jvm.internal.m.c(aVar12);
                                    ((hj.d2) aVar12).f32487h.setVisibility(0);
                                    rx.b bVar3 = d3Var4.m;
                                    if (bVar3 != null) {
                                        bVar3.dispose();
                                    }
                                    xx.f fVarH = qx.h.m(3L, TimeUnit.SECONDS, ky.e.f38937b).g(px.b.a()).h(new o20.i(d3Var4, 15), c.R);
                                    th.j.a(fVarH, d3Var4.f47887g);
                                    d3Var4.m = fVarH;
                                    break;
                                case 4:
                                    kotlin.jvm.internal.m.f(it, "it");
                                    d3 d3Var5 = this.f47824b;
                                    mp.b bVar4 = d3Var5.f47881a;
                                    String strB4 = d3Var5.b();
                                    ta.a aVar13 = d3Var5.f47886f;
                                    kotlin.jvm.internal.m.c(aVar13);
                                    ImageView ivAudioSmall = ((hj.d2) aVar13).f32484e;
                                    kotlin.jvm.internal.m.e(ivAudioSmall, "ivAudioSmall");
                                    ((jp.p0) bVar4).H(ivAudioSmall, strB4);
                                    break;
                                default:
                                    kotlin.jvm.internal.m.f(it, "it");
                                    d3 d3Var6 = this.f47824b;
                                    mp.b bVar5 = d3Var6.f47881a;
                                    String strB5 = d3Var6.b();
                                    ta.a aVar14 = d3Var6.f47886f;
                                    kotlin.jvm.internal.m.c(aVar14);
                                    ImageView ivAudioSmall2 = ((hj.d2) aVar14).f32484e;
                                    kotlin.jvm.internal.m.e(ivAudioSmall2, "ivAudioSmall");
                                    ((jp.p0) bVar5).H(ivAudioSmall2, strB5);
                                    break;
                            }
                            return qy.b0.f48488a;
                        }
                    });
                }
            }
        }
        final int i15 = 4;
        if (cf.x.n().keyLanguage == 11 || cf.x.n().keyLanguage == 12 || cf.x.n().keyLanguage == 13) {
            ta.a aVar9 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar9);
            ((FrameLayout) ((hj.d2) aVar9).f32483d.f32407c).setVisibility(0);
            ta.a aVar10 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar10);
            ((hj.d2) aVar10).f32487h.setVisibility(4);
            ta.a aVar11 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar11);
            ((hj.d2) aVar11).f32487h.setTextSize(16.0f);
            ta.a aVar12 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar12);
            bq.z.b((ImageView) ((hj.d2) aVar12).f32483d.f32408d, new fz.c(this) { // from class: qp.a3

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ d3 f47824b;

                {
                    this.f47824b = this;
                }

                @Override // fz.c
                public final Object invoke(Object obj) {
                    View it = (View) obj;
                    switch (i14) {
                        case 0:
                            kotlin.jvm.internal.m.f(it, "it");
                            d3 d3Var = this.f47824b;
                            Env env2 = d3Var.f47884d;
                            env2.isKeyboard = !env2.isKeyboard;
                            env2.updateEntry("isKeyboard");
                            ((jp.p0) d3Var.f47881a).A().l();
                            break;
                        case 1:
                            kotlin.jvm.internal.m.f(it, "it");
                            d3 d3Var2 = this.f47824b;
                            mp.b bVar = d3Var2.f47881a;
                            String strB2 = d3Var2.b();
                            ta.a aVar13 = d3Var2.f47886f;
                            kotlin.jvm.internal.m.c(aVar13);
                            ImageView ivAudio = (ImageView) ((hj.d2) aVar13).f32483d.f32408d;
                            kotlin.jvm.internal.m.e(ivAudio, "ivAudio");
                            ((jp.p0) bVar).H(ivAudio, strB2);
                            break;
                        case 2:
                            kotlin.jvm.internal.m.f(it, "it");
                            d3 d3Var3 = this.f47824b;
                            mp.b bVar2 = d3Var3.f47881a;
                            String strB3 = d3Var3.b();
                            ta.a aVar14 = d3Var3.f47886f;
                            kotlin.jvm.internal.m.c(aVar14);
                            ImageView ivAudio2 = (ImageView) ((hj.d2) aVar14).f32483d.f32408d;
                            kotlin.jvm.internal.m.e(ivAudio2, "ivAudio");
                            ((jp.p0) bVar2).H(ivAudio2, strB3);
                            break;
                        case 3:
                            kotlin.jvm.internal.m.f(it, "it");
                            d3 d3Var4 = this.f47824b;
                            ta.a aVar15 = d3Var4.f47886f;
                            kotlin.jvm.internal.m.c(aVar15);
                            ((hj.d2) aVar15).f32486g.setVisibility(4);
                            ta.a aVar16 = d3Var4.f47886f;
                            kotlin.jvm.internal.m.c(aVar16);
                            ((hj.d2) aVar16).f32487h.setVisibility(0);
                            rx.b bVar3 = d3Var4.m;
                            if (bVar3 != null) {
                                bVar3.dispose();
                            }
                            xx.f fVarH = qx.h.m(3L, TimeUnit.SECONDS, ky.e.f38937b).g(px.b.a()).h(new o20.i(d3Var4, 15), c.R);
                            th.j.a(fVarH, d3Var4.f47887g);
                            d3Var4.m = fVarH;
                            break;
                        case 4:
                            kotlin.jvm.internal.m.f(it, "it");
                            d3 d3Var5 = this.f47824b;
                            mp.b bVar4 = d3Var5.f47881a;
                            String strB4 = d3Var5.b();
                            ta.a aVar17 = d3Var5.f47886f;
                            kotlin.jvm.internal.m.c(aVar17);
                            ImageView ivAudioSmall = ((hj.d2) aVar17).f32484e;
                            kotlin.jvm.internal.m.e(ivAudioSmall, "ivAudioSmall");
                            ((jp.p0) bVar4).H(ivAudioSmall, strB4);
                            break;
                        default:
                            kotlin.jvm.internal.m.f(it, "it");
                            d3 d3Var6 = this.f47824b;
                            mp.b bVar5 = d3Var6.f47881a;
                            String strB5 = d3Var6.b();
                            ta.a aVar18 = d3Var6.f47886f;
                            kotlin.jvm.internal.m.c(aVar18);
                            ImageView ivAudioSmall2 = ((hj.d2) aVar18).f32484e;
                            kotlin.jvm.internal.m.e(ivAudioSmall2, "ivAudioSmall");
                            ((jp.p0) bVar5).H(ivAudioSmall2, strB5);
                            break;
                    }
                    return qy.b0.f48488a;
                }
            });
            if (env.isAudioModel) {
                ta.a aVar13 = this.f47886f;
                kotlin.jvm.internal.m.c(aVar13);
                ((FrameLayout) ((hj.d2) aVar13).f32483d.f32407c).setVisibility(0);
                ta.a aVar14 = this.f47886f;
                kotlin.jvm.internal.m.c(aVar14);
                ((hj.d2) aVar14).f32486g.setVisibility(0);
                ta.a aVar15 = this.f47886f;
                kotlin.jvm.internal.m.c(aVar15);
                final int i16 = 3;
                bq.z.b(((hj.d2) aVar15).f32486g, new fz.c(this) { // from class: qp.a3

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ d3 f47824b;

                    {
                        this.f47824b = this;
                    }

                    @Override // fz.c
                    public final Object invoke(Object obj) {
                        View it = (View) obj;
                        switch (i16) {
                            case 0:
                                kotlin.jvm.internal.m.f(it, "it");
                                d3 d3Var = this.f47824b;
                                Env env2 = d3Var.f47884d;
                                env2.isKeyboard = !env2.isKeyboard;
                                env2.updateEntry("isKeyboard");
                                ((jp.p0) d3Var.f47881a).A().l();
                                break;
                            case 1:
                                kotlin.jvm.internal.m.f(it, "it");
                                d3 d3Var2 = this.f47824b;
                                mp.b bVar = d3Var2.f47881a;
                                String strB2 = d3Var2.b();
                                ta.a aVar16 = d3Var2.f47886f;
                                kotlin.jvm.internal.m.c(aVar16);
                                ImageView ivAudio = (ImageView) ((hj.d2) aVar16).f32483d.f32408d;
                                kotlin.jvm.internal.m.e(ivAudio, "ivAudio");
                                ((jp.p0) bVar).H(ivAudio, strB2);
                                break;
                            case 2:
                                kotlin.jvm.internal.m.f(it, "it");
                                d3 d3Var3 = this.f47824b;
                                mp.b bVar2 = d3Var3.f47881a;
                                String strB3 = d3Var3.b();
                                ta.a aVar17 = d3Var3.f47886f;
                                kotlin.jvm.internal.m.c(aVar17);
                                ImageView ivAudio2 = (ImageView) ((hj.d2) aVar17).f32483d.f32408d;
                                kotlin.jvm.internal.m.e(ivAudio2, "ivAudio");
                                ((jp.p0) bVar2).H(ivAudio2, strB3);
                                break;
                            case 3:
                                kotlin.jvm.internal.m.f(it, "it");
                                d3 d3Var4 = this.f47824b;
                                ta.a aVar18 = d3Var4.f47886f;
                                kotlin.jvm.internal.m.c(aVar18);
                                ((hj.d2) aVar18).f32486g.setVisibility(4);
                                ta.a aVar19 = d3Var4.f47886f;
                                kotlin.jvm.internal.m.c(aVar19);
                                ((hj.d2) aVar19).f32487h.setVisibility(0);
                                rx.b bVar3 = d3Var4.m;
                                if (bVar3 != null) {
                                    bVar3.dispose();
                                }
                                xx.f fVarH = qx.h.m(3L, TimeUnit.SECONDS, ky.e.f38937b).g(px.b.a()).h(new o20.i(d3Var4, 15), c.R);
                                th.j.a(fVarH, d3Var4.f47887g);
                                d3Var4.m = fVarH;
                                break;
                            case 4:
                                kotlin.jvm.internal.m.f(it, "it");
                                d3 d3Var5 = this.f47824b;
                                mp.b bVar4 = d3Var5.f47881a;
                                String strB4 = d3Var5.b();
                                ta.a aVar110 = d3Var5.f47886f;
                                kotlin.jvm.internal.m.c(aVar110);
                                ImageView ivAudioSmall = ((hj.d2) aVar110).f32484e;
                                kotlin.jvm.internal.m.e(ivAudioSmall, "ivAudioSmall");
                                ((jp.p0) bVar4).H(ivAudioSmall, strB4);
                                break;
                            default:
                                kotlin.jvm.internal.m.f(it, "it");
                                d3 d3Var6 = this.f47824b;
                                mp.b bVar5 = d3Var6.f47881a;
                                String strB5 = d3Var6.b();
                                ta.a aVar111 = d3Var6.f47886f;
                                kotlin.jvm.internal.m.c(aVar111);
                                ImageView ivAudioSmall2 = ((hj.d2) aVar111).f32484e;
                                kotlin.jvm.internal.m.e(ivAudioSmall2, "ivAudioSmall");
                                ((jp.p0) bVar5).H(ivAudioSmall2, strB5);
                                break;
                        }
                        return qy.b0.f48488a;
                    }
                });
            } else {
                ta.a aVar16 = this.f47886f;
                kotlin.jvm.internal.m.c(aVar16);
                ((FrameLayout) ((hj.d2) aVar16).f32483d.f32407c).setVisibility(8);
                ta.a aVar17 = this.f47886f;
                kotlin.jvm.internal.m.c(aVar17);
                ((hj.d2) aVar17).f32487h.setVisibility(0);
            }
        } else {
            if (bq.m.F()) {
                ta.a aVar18 = this.f47886f;
                kotlin.jvm.internal.m.c(aVar18);
                ((FrameLayout) ((hj.d2) aVar18).f32483d.f32407c).setVisibility(8);
                ta.a aVar19 = this.f47886f;
                kotlin.jvm.internal.m.c(aVar19);
                ((hj.d2) aVar19).f32487h.setVisibility(0);
            } else {
                ta.a aVar20 = this.f47886f;
                kotlin.jvm.internal.m.c(aVar20);
                ((FrameLayout) ((hj.d2) aVar20).f32483d.f32407c).setVisibility(8);
                ta.a aVar21 = this.f47886f;
                kotlin.jvm.internal.m.c(aVar21);
                ((hj.d2) aVar21).f32487h.setVisibility(0);
                ta.a aVar22 = this.f47886f;
                kotlin.jvm.internal.m.c(aVar22);
                ((hj.d2) aVar22).f32484e.setVisibility(0);
                ta.a aVar23 = this.f47886f;
                kotlin.jvm.internal.m.c(aVar23);
                bq.z.b(((hj.d2) aVar23).f32484e, new fz.c(this) { // from class: qp.a3

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ d3 f47824b;

                    {
                        this.f47824b = this;
                    }

                    @Override // fz.c
                    public final Object invoke(Object obj) {
                        View it = (View) obj;
                        switch (i15) {
                            case 0:
                                kotlin.jvm.internal.m.f(it, "it");
                                d3 d3Var = this.f47824b;
                                Env env2 = d3Var.f47884d;
                                env2.isKeyboard = !env2.isKeyboard;
                                env2.updateEntry("isKeyboard");
                                ((jp.p0) d3Var.f47881a).A().l();
                                break;
                            case 1:
                                kotlin.jvm.internal.m.f(it, "it");
                                d3 d3Var2 = this.f47824b;
                                mp.b bVar = d3Var2.f47881a;
                                String strB2 = d3Var2.b();
                                ta.a aVar110 = d3Var2.f47886f;
                                kotlin.jvm.internal.m.c(aVar110);
                                ImageView ivAudio = (ImageView) ((hj.d2) aVar110).f32483d.f32408d;
                                kotlin.jvm.internal.m.e(ivAudio, "ivAudio");
                                ((jp.p0) bVar).H(ivAudio, strB2);
                                break;
                            case 2:
                                kotlin.jvm.internal.m.f(it, "it");
                                d3 d3Var3 = this.f47824b;
                                mp.b bVar2 = d3Var3.f47881a;
                                String strB3 = d3Var3.b();
                                ta.a aVar111 = d3Var3.f47886f;
                                kotlin.jvm.internal.m.c(aVar111);
                                ImageView ivAudio2 = (ImageView) ((hj.d2) aVar111).f32483d.f32408d;
                                kotlin.jvm.internal.m.e(ivAudio2, "ivAudio");
                                ((jp.p0) bVar2).H(ivAudio2, strB3);
                                break;
                            case 3:
                                kotlin.jvm.internal.m.f(it, "it");
                                d3 d3Var4 = this.f47824b;
                                ta.a aVar112 = d3Var4.f47886f;
                                kotlin.jvm.internal.m.c(aVar112);
                                ((hj.d2) aVar112).f32486g.setVisibility(4);
                                ta.a aVar113 = d3Var4.f47886f;
                                kotlin.jvm.internal.m.c(aVar113);
                                ((hj.d2) aVar113).f32487h.setVisibility(0);
                                rx.b bVar3 = d3Var4.m;
                                if (bVar3 != null) {
                                    bVar3.dispose();
                                }
                                xx.f fVarH = qx.h.m(3L, TimeUnit.SECONDS, ky.e.f38937b).g(px.b.a()).h(new o20.i(d3Var4, 15), c.R);
                                th.j.a(fVarH, d3Var4.f47887g);
                                d3Var4.m = fVarH;
                                break;
                            case 4:
                                kotlin.jvm.internal.m.f(it, "it");
                                d3 d3Var5 = this.f47824b;
                                mp.b bVar4 = d3Var5.f47881a;
                                String strB4 = d3Var5.b();
                                ta.a aVar114 = d3Var5.f47886f;
                                kotlin.jvm.internal.m.c(aVar114);
                                ImageView ivAudioSmall = ((hj.d2) aVar114).f32484e;
                                kotlin.jvm.internal.m.e(ivAudioSmall, "ivAudioSmall");
                                ((jp.p0) bVar4).H(ivAudioSmall, strB4);
                                break;
                            default:
                                kotlin.jvm.internal.m.f(it, "it");
                                d3 d3Var6 = this.f47824b;
                                mp.b bVar5 = d3Var6.f47881a;
                                String strB5 = d3Var6.b();
                                ta.a aVar115 = d3Var6.f47886f;
                                kotlin.jvm.internal.m.c(aVar115);
                                ImageView ivAudioSmall2 = ((hj.d2) aVar115).f32484e;
                                kotlin.jvm.internal.m.e(ivAudioSmall2, "ivAudioSmall");
                                ((jp.p0) bVar5).H(ivAudioSmall2, strB5);
                                break;
                        }
                        return qy.b0.f48488a;
                    }
                });
            }
            if (env.isAudioModel && (!p0Var.Q || cf.x.n().keyLanguage == 18 || cf.x.n().keyLanguage == 69)) {
                ta.a aVar24 = this.f47886f;
                kotlin.jvm.internal.m.c(aVar24);
                ((hj.d2) aVar24).f32484e.setVisibility(0);
            } else {
                ta.a aVar25 = this.f47886f;
                kotlin.jvm.internal.m.c(aVar25);
                ((hj.d2) aVar25).f32484e.setVisibility(8);
            }
        }
        if (env.isAudioModel && (bq.m.F() || ry.l.D(new Integer[]{53, 54, 18, 19, 69}, Integer.valueOf(cf.x.n().keyLanguage)))) {
            ta.a aVar26 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar26);
            LinearLayout rootParent2 = ((hj.d2) aVar26).f32485f;
            kotlin.jvm.internal.m.e(rootParent2, "rootParent");
            bq.z.b(rootParent2, new fz.c(this) { // from class: qp.a3

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ d3 f47824b;

                {
                    this.f47824b = this;
                }

                @Override // fz.c
                public final Object invoke(Object obj) {
                    View it = (View) obj;
                    switch (i12) {
                        case 0:
                            kotlin.jvm.internal.m.f(it, "it");
                            d3 d3Var = this.f47824b;
                            Env env2 = d3Var.f47884d;
                            env2.isKeyboard = !env2.isKeyboard;
                            env2.updateEntry("isKeyboard");
                            ((jp.p0) d3Var.f47881a).A().l();
                            break;
                        case 1:
                            kotlin.jvm.internal.m.f(it, "it");
                            d3 d3Var2 = this.f47824b;
                            mp.b bVar = d3Var2.f47881a;
                            String strB2 = d3Var2.b();
                            ta.a aVar110 = d3Var2.f47886f;
                            kotlin.jvm.internal.m.c(aVar110);
                            ImageView ivAudio = (ImageView) ((hj.d2) aVar110).f32483d.f32408d;
                            kotlin.jvm.internal.m.e(ivAudio, "ivAudio");
                            ((jp.p0) bVar).H(ivAudio, strB2);
                            break;
                        case 2:
                            kotlin.jvm.internal.m.f(it, "it");
                            d3 d3Var3 = this.f47824b;
                            mp.b bVar2 = d3Var3.f47881a;
                            String strB3 = d3Var3.b();
                            ta.a aVar111 = d3Var3.f47886f;
                            kotlin.jvm.internal.m.c(aVar111);
                            ImageView ivAudio2 = (ImageView) ((hj.d2) aVar111).f32483d.f32408d;
                            kotlin.jvm.internal.m.e(ivAudio2, "ivAudio");
                            ((jp.p0) bVar2).H(ivAudio2, strB3);
                            break;
                        case 3:
                            kotlin.jvm.internal.m.f(it, "it");
                            d3 d3Var4 = this.f47824b;
                            ta.a aVar112 = d3Var4.f47886f;
                            kotlin.jvm.internal.m.c(aVar112);
                            ((hj.d2) aVar112).f32486g.setVisibility(4);
                            ta.a aVar113 = d3Var4.f47886f;
                            kotlin.jvm.internal.m.c(aVar113);
                            ((hj.d2) aVar113).f32487h.setVisibility(0);
                            rx.b bVar3 = d3Var4.m;
                            if (bVar3 != null) {
                                bVar3.dispose();
                            }
                            xx.f fVarH = qx.h.m(3L, TimeUnit.SECONDS, ky.e.f38937b).g(px.b.a()).h(new o20.i(d3Var4, 15), c.R);
                            th.j.a(fVarH, d3Var4.f47887g);
                            d3Var4.m = fVarH;
                            break;
                        case 4:
                            kotlin.jvm.internal.m.f(it, "it");
                            d3 d3Var5 = this.f47824b;
                            mp.b bVar4 = d3Var5.f47881a;
                            String strB4 = d3Var5.b();
                            ta.a aVar114 = d3Var5.f47886f;
                            kotlin.jvm.internal.m.c(aVar114);
                            ImageView ivAudioSmall = ((hj.d2) aVar114).f32484e;
                            kotlin.jvm.internal.m.e(ivAudioSmall, "ivAudioSmall");
                            ((jp.p0) bVar4).H(ivAudioSmall, strB4);
                            break;
                        default:
                            kotlin.jvm.internal.m.f(it, "it");
                            d3 d3Var6 = this.f47824b;
                            mp.b bVar5 = d3Var6.f47881a;
                            String strB5 = d3Var6.b();
                            ta.a aVar115 = d3Var6.f47886f;
                            kotlin.jvm.internal.m.c(aVar115);
                            ImageView ivAudioSmall2 = ((hj.d2) aVar115).f32484e;
                            kotlin.jvm.internal.m.e(ivAudioSmall2, "ivAudioSmall");
                            ((jp.p0) bVar5).H(ivAudioSmall2, strB5);
                            break;
                    }
                    return qy.b0.f48488a;
                }
            });
            ta.a aVar27 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar27);
            bq.z.a(((hj.d2) aVar27).f32484e, 0L, new lt.e(this, 21));
        }
        ta.a aVar28 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar28);
        EditText editText2 = ((hj.d2) aVar28).f32482c;
        Context context = this.f47883c;
        editText2.setHint(oz.r.g0("\n            " + ff.h.y(context, com.lingodeer.R.string.write_down_the_sentence) + "\n            " + ff.h.y(context, com.lingodeer.R.string.please_install_the_keyboard_of_the_language_first) + "\n            "));
        FrameLayout frameLayout = (FrameLayout) ((Activity) context).findViewById(R.id.content);
        this.f47897l = new b3();
        frameLayout.getViewTreeObserver().removeOnGlobalLayoutListener(this.f47897l);
        frameLayout.getViewTreeObserver().addOnGlobalLayoutListener(this.f47897l);
    }

    public final Sentence r() {
        Sentence sentence = this.f47895j;
        if (sentence != null) {
            return sentence;
        }
        kotlin.jvm.internal.m.n("mModel");
        throw null;
    }

    public final void t(boolean z11) {
        String string;
        try {
            int[] iArr = bq.r.f4959a;
            int i11 = 0;
            if (bq.m.F()) {
                ta.a aVar = this.f47886f;
                kotlin.jvm.internal.m.c(aVar);
                String string2 = ((hj.d2) aVar).f32482c.getText().toString();
                int length = string2.length() - 1;
                int i12 = 0;
                boolean z12 = false;
                while (i12 <= length) {
                    boolean z13 = kotlin.jvm.internal.m.h(string2.charAt(!z12 ? i12 : length), 32) <= 0;
                    if (z12) {
                        if (!z13) {
                            break;
                        } else {
                            length--;
                        }
                    } else if (z13) {
                        i12++;
                    } else {
                        z12 = true;
                    }
                }
                String strQ0 = oz.x.q0(string2.subSequence(i12, length + 1).toString(), " ", BuildConfig.VERSION_NAME);
                Pattern patternCompile = Pattern.compile("[\\p{P}+~$`^=|<>～｀＄＾＋＝｜＜＞￥×]");
                kotlin.jvm.internal.m.e(patternCompile, "compile(...)");
                string = patternCompile.matcher(strQ0).replaceAll(BuildConfig.VERSION_NAME);
                kotlin.jvm.internal.m.e(string, PQgum.qzKELWBfSbtKkne);
            } else {
                ta.a aVar2 = this.f47886f;
                kotlin.jvm.internal.m.c(aVar2);
                String string3 = ((hj.d2) aVar2).f32482c.getText().toString();
                int length2 = string3.length() - 1;
                int i13 = 0;
                boolean z14 = false;
                while (i13 <= length2) {
                    boolean z15 = kotlin.jvm.internal.m.h(string3.charAt(!z14 ? i13 : length2), 32) <= 0;
                    if (z14) {
                        if (!z15) {
                            break;
                        } else {
                            length2--;
                        }
                    } else if (z15) {
                        i13++;
                    } else {
                        z14 = true;
                    }
                }
                string = string3.subSequence(i13, length2 + 1).toString();
            }
            StringBuilder sb2 = new StringBuilder();
            ArrayList arrayList = this.f47896k;
            int size = arrayList.size();
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                Word word = (Word) obj;
                if (word.getWordType() != 1) {
                    LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                    if ((cf.x.n().keyLanguage == 1 || cf.x.n().keyLanguage == 12) && cf.x.n().jsDisPlay == 2) {
                        sb2.append(fr.j3.B(word));
                        sb2.append(" ");
                    } else {
                        sb2.append(fr.j3.B(word));
                    }
                }
            }
            oz.r.g0("\n     " + string + "\n     " + ((Object) sb2) + "\n     ");
            if (z11) {
                return;
            }
            ArrayList arrayList2 = new ArrayList();
            String string4 = sb2.toString();
            kotlin.jvm.internal.m.e(string4, "toString(...)");
            s(string, string4, arrayList2);
            mp.b bVar = this.f47881a;
            kotlin.jvm.internal.m.d(bVar, "null cannot be cast to non-null type com.lingo.lingoskill.ui.learn.BaseLessonTestFragment");
            String string5 = sb2.toString();
            kotlin.jvm.internal.m.e(string5, "toString(...)");
            ((jp.p0) bVar).f36528d0 = new xq.c(string5, this, arrayList2, 29);
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }
}
