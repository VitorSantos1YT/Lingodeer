package h9;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import b0.h2;
import com.google.android.material.card.MaterialCardView;
import com.google.common.collect.ImmutableList;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.object.PdWord;
import com.lingo.lingoskill.object.Phrase;
import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;
import java.io.File;
import java.util.Iterator;
import qp.h1;
import y6.p0;
import y6.q0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f32088b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f32089c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f32090d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f32091e;

    public /* synthetic */ q(Object obj, Object obj2, Object obj3, Object obj4, int i11) {
        this.f32087a = i11;
        this.f32088b = obj;
        this.f32089c = obj2;
        this.f32090d = obj3;
        this.f32091e = obj4;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String strF;
        String string;
        fv.a aVar;
        ColorStateList cardBackgroundColor;
        ColorStateList cardBackgroundColor2;
        int i11 = this.f32087a;
        Object obj = this.f32091e;
        Object obj2 = this.f32090d;
        Object obj3 = this.f32089c;
        Object obj4 = this.f32088b;
        switch (i11) {
            case 0:
                g gVar = (g) obj4;
                p0 p0Var = (p0) obj2;
                p pVar = (p) obj;
                h2 h2Var = (h2) ((y6.j0) obj3);
                if (h2Var.e0(29)) {
                    h2Var.D(h2Var.J().a().e(new q0(p0Var, ImmutableList.u(Integer.valueOf(pVar.f32085b)))).i(pVar.f32084a.f57364b.f57306c, false).a());
                    String str = pVar.f32086c;
                    switch (gVar.f32035c) {
                        case 0:
                            gVar.f32036d.N.f32078b[1] = str;
                            break;
                    }
                    gVar.f32034b.S.dismiss();
                    break;
                }
                break;
            case 1:
                ImageView imageView = (ImageView) obj4;
                th.e eVar = (th.e) obj3;
                PdWord pdWord = (PdWord) obj2;
                fv.c cVar = (fv.c) obj;
                Drawable background = imageView.getBackground();
                kotlin.jvm.internal.m.e(background, "getBackground(...)");
                if (background instanceof AnimationDrawable) {
                    ((AnimationDrawable) background).start();
                }
                int i12 = 2;
                eVar.f52416c = new ci.a0(imageView, i12);
                if (pdWord.getWordStruct() == 1) {
                    strF = xt.b.a().f();
                    Long wordId = pdWord.getWordId();
                    kotlin.jvm.internal.m.e(wordId, "getWordId(...)");
                    long jLongValue = wordId.longValue();
                    int[] iArr = bq.r.f4959a;
                    LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                    StringBuilder sbM = com.google.android.material.datepicker.d.m(jLongValue, "pod-", bq.m.g(cf.x.n().keyLanguage), "-w-yx-");
                    sbM.append(".mp3");
                    string = sbM.toString();
                } else {
                    strF = xt.b.a().f();
                    Long wordId2 = pdWord.getWordId();
                    kotlin.jvm.internal.m.e(wordId2, "getWordId(...)");
                    long jLongValue2 = wordId2.longValue();
                    int[] iArr2 = bq.r.f4959a;
                    LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
                    StringBuilder sbM2 = com.google.android.material.datepicker.d.m(jLongValue2, "pod-", bq.m.g(cf.x.n().keyLanguage), "-w-");
                    sbM2.append(".mp3");
                    string = sbM2.toString();
                }
                String strM = defpackage.e.m(strF, string);
                if (pdWord.getWordStruct() == 1) {
                    Long wordId3 = pdWord.getWordId();
                    kotlin.jvm.internal.m.e(wordId3, "getWordId(...)");
                    String strL = th.j.l(wordId3.longValue());
                    Long wordId4 = pdWord.getWordId();
                    kotlin.jvm.internal.m.e(wordId4, "getWordId(...)");
                    aVar = new fv.a(9L, strL, th.j.k(wordId4.longValue()));
                } else {
                    Long wordId5 = pdWord.getWordId();
                    kotlin.jvm.internal.m.e(wordId5, "getWordId(...)");
                    String strJ = th.j.j(wordId5.longValue());
                    Long wordId6 = pdWord.getWordId();
                    kotlin.jvm.internal.m.e(wordId6, "getWordId(...)");
                    aVar = new fv.a(9L, strJ, th.j.i(wordId6.longValue()));
                }
                eVar.h(strM);
                if (!new File(strM).exists()) {
                    cVar.d(aVar, new fj.a(i12, eVar, strM));
                }
                break;
            default:
                h1 h1Var = (h1) obj4;
                MaterialCardView materialCardView = (MaterialCardView) obj3;
                Phrase phrase = (Phrase) obj2;
                TextView textView = (TextView) obj;
                long j11 = h1Var.f47951p;
                mp.b bVar = h1Var.f47881a;
                Context context = h1Var.f47883c;
                if (j11 == -1) {
                    kotlin.jvm.internal.m.f(context, "context");
                    materialCardView.setCardBackgroundColor(context.getColor(R.color.color_B9D5FD));
                    h1Var.f47951p = phrase.getPhraseId();
                    h1Var.f47950o = materialCardView;
                    materialCardView.setEnabled(false);
                } else if (phrase.getPhraseId() != h1Var.f47951p) {
                    ArgbEvaluator argbEvaluator = new ArgbEvaluator();
                    Integer numValueOf = Integer.valueOf(materialCardView.getCardBackgroundColor().getDefaultColor());
                    kotlin.jvm.internal.m.f(context, "context");
                    ObjectAnimator.ofObject(materialCardView, "cardBackgroundColor", argbEvaluator, numValueOf, Integer.valueOf(context.getColor(R.color.color_FF6666)), Integer.valueOf(context.getColor(R.color.white))).setDuration(300L).start();
                    MaterialCardView materialCardView2 = h1Var.f47950o;
                    ArgbEvaluator argbEvaluator2 = new ArgbEvaluator();
                    MaterialCardView materialCardView3 = h1Var.f47950o;
                    ObjectAnimator.ofObject(materialCardView2, "cardBackgroundColor", argbEvaluator2, (materialCardView3 == null || (cardBackgroundColor = materialCardView3.getCardBackgroundColor()) == null) ? null : Integer.valueOf(cardBackgroundColor.getDefaultColor()), Integer.valueOf(context.getColor(R.color.color_FF6666)), Integer.valueOf(context.getColor(R.color.white))).setDuration(300L).start();
                    MaterialCardView materialCardView4 = h1Var.f47950o;
                    if (materialCardView4 != null) {
                        materialCardView4.setEnabled(true);
                    }
                    h1Var.f47951p = -1L;
                    h1Var.f47950o = null;
                } else {
                    ArgbEvaluator argbEvaluator3 = new ArgbEvaluator();
                    Integer numValueOf2 = Integer.valueOf(materialCardView.getCardBackgroundColor().getDefaultColor());
                    kotlin.jvm.internal.m.f(context, "context");
                    ObjectAnimator.ofObject(materialCardView, "cardBackgroundColor", argbEvaluator3, numValueOf2, Integer.valueOf(context.getColor(R.color.color_43CC93))).setDuration(300L).start();
                    MaterialCardView materialCardView5 = h1Var.f47950o;
                    ArgbEvaluator argbEvaluator4 = new ArgbEvaluator();
                    MaterialCardView materialCardView6 = h1Var.f47950o;
                    ObjectAnimator.ofObject(materialCardView5, "cardBackgroundColor", argbEvaluator4, (materialCardView6 == null || (cardBackgroundColor2 = materialCardView6.getCardBackgroundColor()) == null) ? null : Integer.valueOf(cardBackgroundColor2.getDefaultColor()), Integer.valueOf(context.getColor(R.color.color_43CC93))).setDuration(300L).start();
                    ObjectAnimator.ofObject(textView, "textColor", new ArgbEvaluator(), Integer.valueOf(context.getColor(R.color.primary_black)), Integer.valueOf(context.getColor(R.color.white))).setDuration(300L).start();
                    MaterialCardView materialCardView7 = h1Var.f47950o;
                    ObjectAnimator.ofObject(materialCardView7 != null ? (TextView) materialCardView7.findViewById(R.id.tv_middle) : null, "textColor", new ArgbEvaluator(), Integer.valueOf(context.getColor(R.color.primary_black)), Integer.valueOf(context.getColor(R.color.white))).setDuration(300L).start();
                    materialCardView.setCardElevation(CropImageView.DEFAULT_ASPECT_RATIO);
                    MaterialCardView materialCardView8 = h1Var.f47950o;
                    if (materialCardView8 != null) {
                        materialCardView8.setCardElevation(CropImageView.DEFAULT_ASPECT_RATIO);
                    }
                    materialCardView.setEnabled(false);
                    h1Var.f47951p = -1L;
                    h1Var.f47950o = null;
                    Iterator it = h1Var.f47949n.iterator();
                    kotlin.jvm.internal.m.e(it, "iterator(...)");
                    boolean z11 = true;
                    while (it.hasNext()) {
                        Object next = it.next();
                        kotlin.jvm.internal.m.e(next, "next(...)");
                        if (((CardView) next).isEnabled()) {
                            z11 = false;
                        }
                    }
                    if (z11) {
                        ((jp.p0) bVar).O(5);
                    }
                    LingoSkillApplication lingoSkillApplication3 = LingoSkillApplication.f21665b;
                    if (cf.x.n().isAudioModel) {
                        qy.q qVar = fv.b.f28186a;
                        ((jp.p0) bVar).I(fv.b.x(phrase.getPhraseId(), null, null));
                    }
                }
                break;
        }
    }
}
