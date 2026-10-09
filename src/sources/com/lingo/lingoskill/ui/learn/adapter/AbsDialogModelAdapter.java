package com.lingo.lingoskill.ui.learn.adapter;

import a5.f;
import a5.j;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import b7.e0;
import bq.r;
import bq.z;
import com.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.google.android.flexbox.FlexboxLayout;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.object.DaoSession;
import com.lingo.lingoskill.object.Model_Sentence_000;
import com.lingo.lingoskill.object.Model_Sentence_000Dao;
import com.lingo.lingoskill.object.Model_Sentence_010;
import com.lingo.lingoskill.object.Model_Sentence_030;
import com.lingo.lingoskill.object.Model_Sentence_050;
import com.lingo.lingoskill.object.Model_Sentence_100;
import com.lingo.lingoskill.object.Sentence;
import com.lingo.lingoskill.object.Word;
import com.lingo.lingoskill.ui.learn.adapter.AbsDialogModelAdapter;
import com.lingodeer.R;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import ff.h;
import fu.j0;
import hh.b0;
import hh.p0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import jp.d;
import jp.g;
import jp.i;
import kotlin.jvm.internal.m;
import n9.q;
import ns.o;
import nv.p;
import oz.x;
import pt.ImS.aYZzTH;
import r.x2;
import re.g0;
import re.v;
import rx.b;
import se.k;
import th.e;
import va.a;
import w4.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class AbsDialogModelAdapter extends BaseMultiItemQuickAdapter<Sentence, BaseViewHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public View f22052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ImageView f22053b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f22054c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public d f22055d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public j f22056e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final q f22057f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f22058g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f22059h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public f f22060i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f22061j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbsDialogModelAdapter(ArrayList data) {
        super(data);
        m.f(data, "data");
        this.f22057f = new q(29, false);
        this.f22058g = new ArrayList();
        this.f22059h = new ArrayList();
        addItemType(2, R.layout.item_dialog_adapter_male);
        addItemType(3, R.layout.item_dialog_adapter_female);
        addItemType(1, R.layout.item_dialog_adapter_p);
    }

    public static void a(AbsDialogModelAdapter absDialogModelAdapter, BaseViewHolder baseViewHolder, Word word, View itemView) {
        PopupWindow popupWindow;
        int i11;
        m.f(itemView, "itemView");
        if (absDialogModelAdapter.f22061j || m.a(itemView.getTag(R.id.tag_is_invisiable), Boolean.TRUE)) {
            return;
        }
        m.e(baseViewHolder.itemView, "itemView");
        baseViewHolder.getAdapterPosition();
        d dVar = absDialogModelAdapter.f22055d;
        if (dVar != null) {
            i iVar = dVar.f36460a;
            b bVar = iVar.f36488r;
            e eVar = iVar.f36493w;
            if (bVar != null) {
                bVar.dispose();
            }
            qy.q qVar = fv.b.f28186a;
            String strY = fv.b.Y(word.getWordId(), null, null);
            eVar.m(iVar.f47884d.audioSpeed / 100.0f, false);
            eVar.h(strY);
            PopupWindow popupWindow2 = iVar.f36487q;
            if (popupWindow2 != null) {
                popupWindow2.dismiss();
            }
            Context context = iVar.f47883c;
            m.f(context, "context");
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
            String explanation = word.getExplanation();
            int iB = c.b(1, explanation, "getExplanation(...)");
            int i12 = 0;
            boolean z11 = false;
            while (i12 <= iB) {
                boolean z12 = m.h(explanation.charAt(!z11 ? i12 : iB), 32) <= 0;
                if (z11) {
                    if (!z12) {
                        break;
                    } else {
                        iB--;
                    }
                } else if (z12) {
                    i12++;
                } else {
                    z11 = true;
                }
            }
            boolean zIsEmpty = TextUtils.isEmpty(explanation.subSequence(i12, iB + 1).toString());
            int i13 = 2;
            int i14 = 3;
            if (zIsEmpty) {
                View viewInflate = layoutInflaterFrom.inflate(R.layout.pop_detail, (ViewGroup) null, false);
                m.e(viewInflate, "inflate(...)");
                TextView textView = (TextView) viewInflate.findViewById(R.id.tv_trans);
                TextView textView2 = (TextView) viewInflate.findViewById(R.id.tv_pos);
                View viewFindViewById = viewInflate.findViewById(R.id.view_line);
                String translations = word.getTranslations();
                m.e(translations, "getTranslations(...)");
                textView.setText(x.q0(translations, ";", "\n"));
                textView2.setVisibility(8);
                viewFindViewById.setVisibility(8);
                popupWindow = new PopupWindow(viewInflate, -2, -2, true);
                viewInflate.getViewTreeObserver().addOnGlobalLayoutListener(new b0(viewInflate, itemView, i14));
                popupWindow.setBackgroundDrawable(new ColorDrawable(0));
                popupWindow.setWidth(h.l(150.0f));
                popupWindow.setOutsideTouchable(true);
                popupWindow.setFocusable(false);
            } else {
                View viewInflate2 = layoutInflaterFrom.inflate(R.layout.pop_grammar_detail_web_view, (ViewGroup) null, false);
                m.e(viewInflate2, "inflate(...)");
                WebView webView = (WebView) viewInflate2.findViewById(R.id.web_view);
                ProgressBar progressBar = (ProgressBar) viewInflate2.findViewById(R.id.progress_bar);
                ImageView imageView = (ImageView) viewInflate2.findViewById(R.id.iv_plus);
                ImageView imageView2 = (ImageView) viewInflate2.findViewById(R.id.iv_reduse);
                if ((context.getResources().getConfiguration().uiMode & 48) != 16) {
                    if (k.s("ALGORITHMIC_DARKENING")) {
                        a.b(webView.getSettings());
                    }
                    if (k.s("FORCE_DARK")) {
                        a.c(webView.getSettings());
                    }
                }
                m.c(imageView);
                z.b(imageView, new sp.a(webView, i13));
                m.c(imageView2);
                z.b(imageView2, new sp.a(webView, i14));
                m.c(webView);
                String explanation2 = word.getExplanation();
                m.e(explanation2, "getExplanation(...)");
                LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                String str = cf.x.n().themeStyle == 3 ? "#878787" : "#E1E9F6";
                StringBuilder sb2 = new StringBuilder();
                sb2.append("<html>\n<body bgcolor=\"" + str + "\" style=\"font-size:14px;\">\n");
                sb2.append(explanation2);
                sb2.append("</body>\n</html>");
                webView.setWebViewClient(new sp.c(progressBar, 1));
                String string = sb2.toString();
                m.e(string, "toString(...)");
                webView.loadDataWithBaseURL(null, x.q0(string, "<td>", "<td style=\"font-size:14px;\">"), "text/html", "utf-8", null);
                TextView textView3 = (TextView) viewInflate2.findViewById(R.id.tv_trans);
                LinearLayout linearLayout = (LinearLayout) viewInflate2.findViewById(R.id.ll_grammar_detail);
                if (!m.a(word.getWord(), word.getZhuyin()) && !TextUtils.isEmpty(word.getZhuyin())) {
                    textView3.setText(c.h(word.getWord(), "/", word.getZhuyin(), " : ", word.getTranslations()));
                } else if (cf.x.n().keyLanguage == 5 || cf.x.n().keyLanguage == 4 || cf.x.n().keyLanguage == 6 || cf.x.n().keyLanguage == 8) {
                    textView3.setText(word.getTranslations());
                } else {
                    textView3.setText(word.getWord() + " : " + word.getTranslations());
                }
                popupWindow = new PopupWindow(viewInflate2, e0.f(LingoSkillApplication.f21665b).widthPixels - h.l(80.0f), h.l(300.0f), true);
                viewInflate2.getViewTreeObserver().addOnGlobalLayoutListener(new b0(viewInflate2, itemView, 4));
                popupWindow.setBackgroundDrawable(new ColorDrawable(0));
                View viewFindViewById2 = viewInflate2.findViewById(R.id.btn_ok);
                m.e(viewFindViewById2, "findViewById(...)");
                z.b(viewFindViewById2, new qh.j(popupWindow, i14));
                popupWindow.setOutsideTouchable(true);
                popupWindow.setFocusable(false);
                linearLayout.setVisibility(0);
            }
            popupWindow.setTouchable(true);
            iVar.f36487q = popupWindow;
            int width = (itemView.getWidth() / 2) - (popupWindow.getWidth() / 2);
            if (TextUtils.isEmpty(word.getExplanation())) {
                i11 = 0;
                popupWindow.showAsDropDown(itemView, width, 0);
            } else {
                i11 = 0;
                int[] iArr = new int[2];
                itemView.getLocationOnScreen(iArr);
                popupWindow.showAsDropDown(itemView, h.l(40.0f) - iArr[0], 0);
            }
            popupWindow.setOnDismissListener(new jp.b(iVar, i11, itemView));
        }
        absDialogModelAdapter.m(absDialogModelAdapter.f22052a);
        ImageView imageView3 = absDialogModelAdapter.f22053b;
        if (imageView3 != null) {
            Drawable background = imageView3.getBackground();
            m.e(background, "getBackground(...)");
            if (background instanceof AnimationDrawable) {
                AnimationDrawable animationDrawable = (AnimationDrawable) background;
                animationDrawable.selectDrawable(0);
                animationDrawable.stop();
            }
        }
        absDialogModelAdapter.k(absDialogModelAdapter.f22054c);
        absDialogModelAdapter.f22052a = itemView;
        TextView textView4 = (TextView) itemView.findViewById(R.id.tv_top);
        TextView textView5 = (TextView) itemView.findViewById(R.id.tv_middle);
        TextView textView6 = (TextView) itemView.findViewById(R.id.tv_bottom);
        View viewFindViewById3 = itemView.findViewById(R.id.view_line);
        View viewFindViewById4 = itemView.findViewById(R.id.view_point);
        Resources resources = absDialogModelAdapter.mContext.getResources();
        ThreadLocal threadLocal = q4.j.f47447a;
        textView4.setTextColor(resources.getColor(R.color.color_primary, null));
        textView5.setTextColor(absDialogModelAdapter.mContext.getResources().getColor(R.color.color_primary, null));
        textView6.setTextColor(absDialogModelAdapter.mContext.getResources().getColor(R.color.color_primary, null));
        viewFindViewById3.setVisibility(4);
        viewFindViewById4.setVisibility(0);
    }

    public static final void b(AbsDialogModelAdapter absDialogModelAdapter, FlexboxLayout flexboxLayout) {
        flexboxLayout.setVisibility(8);
        int childCount = flexboxLayout.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            CardView cardView = (CardView) flexboxLayout.getChildAt(i11).findViewById(R.id.card_item);
            if (cardView != null) {
                cardView.setCardElevation(CropImageView.DEFAULT_ASPECT_RATIO);
                TextView textView = (TextView) cardView.findViewById(R.id.tv_middle);
                if (cardView.isEnabled()) {
                    ArgbEvaluator argbEvaluator = new ArgbEvaluator();
                    Context mContext = absDialogModelAdapter.mContext;
                    m.e(mContext, "mContext");
                    Integer numValueOf = Integer.valueOf(mContext.getColor(R.color.white));
                    Context mContext2 = absDialogModelAdapter.mContext;
                    m.e(mContext2, "mContext");
                    ObjectAnimator.ofObject(cardView, "cardBackgroundColor", argbEvaluator, numValueOf, Integer.valueOf(mContext2.getColor(R.color.color_D6D6D6))).setDuration(300L).start();
                    ArgbEvaluator argbEvaluator2 = new ArgbEvaluator();
                    Context mContext3 = absDialogModelAdapter.mContext;
                    m.e(mContext3, "mContext");
                    Integer numValueOf2 = Integer.valueOf(mContext3.getColor(R.color.primary_black));
                    Context mContext4 = absDialogModelAdapter.mContext;
                    m.e(mContext4, "mContext");
                    ObjectAnimator.ofObject(textView, "textColor", argbEvaluator2, numValueOf2, Integer.valueOf(mContext4.getColor(R.color.second_black))).setDuration(300L).start();
                    cardView.setEnabled(false);
                }
            }
        }
        f fVar = absDialogModelAdapter.f22060i;
        if (fVar != null) {
            fVar.q();
        }
    }

    public static final void d(AbsDialogModelAdapter absDialogModelAdapter, FlexboxLayout flexboxLayout) {
        ImageView imageView = (ImageView) flexboxLayout.findViewById(R.id.iv_audio);
        if (imageView != null) {
            Drawable background = imageView.getBackground();
            m.e(background, "getBackground(...)");
            if (background instanceof AnimationDrawable) {
                AnimationDrawable animationDrawable = (AnimationDrawable) background;
                animationDrawable.selectDrawable(0);
                animationDrawable.stop();
            }
            imageView.setBackgroundResource(R.drawable.ic_pinyin_audio_grey_ls);
            imageView.setEnabled(false);
        }
    }

    public static final void e(AbsDialogModelAdapter absDialogModelAdapter, CardView cardView, TextView textView, TextView textView2) {
        cardView.setEnabled(false);
        cardView.setCardElevation(CropImageView.DEFAULT_ASPECT_RATIO);
        Context mContext = absDialogModelAdapter.mContext;
        m.e(mContext, "mContext");
        cardView.setCardBackgroundColor(mContext.getColor(R.color.color_D6D6D6));
        ArgbEvaluator argbEvaluator = new ArgbEvaluator();
        Context mContext2 = absDialogModelAdapter.mContext;
        m.e(mContext2, "mContext");
        Integer numValueOf = Integer.valueOf(mContext2.getColor(R.color.white));
        Context mContext3 = absDialogModelAdapter.mContext;
        m.e(mContext3, "mContext");
        Integer numValueOf2 = Integer.valueOf(mContext3.getColor(R.color.color_43CC93));
        Context mContext4 = absDialogModelAdapter.mContext;
        m.e(mContext4, "mContext");
        ObjectAnimator.ofObject(cardView, "cardBackgroundColor", argbEvaluator, numValueOf, numValueOf2, Integer.valueOf(mContext4.getColor(R.color.color_D6D6D6))).setDuration(300L).start();
        ArgbEvaluator argbEvaluator2 = new ArgbEvaluator();
        Context mContext5 = absDialogModelAdapter.mContext;
        m.e(mContext5, "mContext");
        Integer numValueOf3 = Integer.valueOf(mContext5.getColor(R.color.primary_black));
        Context mContext6 = absDialogModelAdapter.mContext;
        m.e(mContext6, "mContext");
        Integer numValueOf4 = Integer.valueOf(mContext6.getColor(R.color.white));
        Context mContext7 = absDialogModelAdapter.mContext;
        m.e(mContext7, "mContext");
        ObjectAnimator.ofObject(textView, "textColor", argbEvaluator2, numValueOf3, numValueOf4, Integer.valueOf(mContext7.getColor(R.color.color_D6D6D6))).setDuration(300L).start();
        ArgbEvaluator argbEvaluator3 = new ArgbEvaluator();
        Context mContext8 = absDialogModelAdapter.mContext;
        m.e(mContext8, "mContext");
        Integer numValueOf5 = Integer.valueOf(mContext8.getColor(R.color.second_black));
        Context mContext9 = absDialogModelAdapter.mContext;
        m.e(mContext9, "mContext");
        Integer numValueOf6 = Integer.valueOf(mContext9.getColor(R.color.white));
        Context mContext10 = absDialogModelAdapter.mContext;
        m.e(mContext10, "mContext");
        ObjectAnimator.ofObject(textView2, "textColor", argbEvaluator3, numValueOf5, numValueOf6, Integer.valueOf(mContext10.getColor(R.color.color_D6D6D6))).setDuration(300L).start();
    }

    public static final void f(AbsDialogModelAdapter absDialogModelAdapter, CardView cardView) {
        ArgbEvaluator argbEvaluator = new ArgbEvaluator();
        Context mContext = absDialogModelAdapter.mContext;
        m.e(mContext, "mContext");
        Integer numValueOf = Integer.valueOf(mContext.getColor(R.color.white));
        Context mContext2 = absDialogModelAdapter.mContext;
        m.e(mContext2, "mContext");
        Integer numValueOf2 = Integer.valueOf(mContext2.getColor(R.color.color_FF6666));
        Context mContext3 = absDialogModelAdapter.mContext;
        m.e(mContext3, "mContext");
        ObjectAnimator.ofObject(cardView, "cardBackgroundColor", argbEvaluator, numValueOf, numValueOf2, Integer.valueOf(mContext3.getColor(R.color.white))).setDuration(300L).start();
    }

    public static final void g(AbsDialogModelAdapter absDialogModelAdapter, View view, Word word) {
        TextView textView = (TextView) view.findViewById(R.id.tv_top);
        TextView textView2 = (TextView) view.findViewById(R.id.tv_middle);
        TextView textView3 = (TextView) view.findViewById(R.id.tv_bottom);
        textView3.setVisibility(8);
        textView.setVisibility(8);
        view.setTag(word);
        absDialogModelAdapter.f22059h.add(view);
        m.c(textView2);
        zq.c.e(word, textView, textView2, textView3, false);
    }

    public static final void h(AbsDialogModelAdapter absDialogModelAdapter, CardView cardView, FlexboxLayout flexboxLayout) {
        flexboxLayout.setVisibility(8);
        cardView.setEnabled(false);
        ArgbEvaluator argbEvaluator = new ArgbEvaluator();
        Context mContext = absDialogModelAdapter.mContext;
        m.e(mContext, "mContext");
        Integer numValueOf = Integer.valueOf(mContext.getColor(R.color.transparent));
        Context mContext2 = absDialogModelAdapter.mContext;
        m.e(mContext2, "mContext");
        ObjectAnimator.ofObject(cardView, "cardBackgroundColor", argbEvaluator, numValueOf, Integer.valueOf(mContext2.getColor(R.color.color_E1E9F6))).setDuration(300L).start();
        ((ImageView) cardView.findViewById(R.id.iv_word_tick)).setImageResource(R.drawable.ic_word_status_correct);
        ((LinearLayout) cardView.findViewById(R.id.ll_word_info)).setBackgroundResource(0);
        ImageView imageView = (ImageView) cardView.findViewById(R.id.iv_sentence_more);
        m.c(imageView);
        Context mContext3 = absDialogModelAdapter.mContext;
        m.e(mContext3, "mContext");
        cf.x.L(imageView, R.drawable.ic_sentence_right_more, ColorStateList.valueOf(mContext3.getColor(R.color.white)));
        f fVar = absDialogModelAdapter.f22060i;
        if (fVar != null) {
            fVar.q();
        }
        int childCount = flexboxLayout.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = flexboxLayout.getChildAt(i11);
            if (!m.a(childAt, cardView)) {
                childAt.setEnabled(false);
                FlexboxLayout flexboxLayout2 = (FlexboxLayout) childAt.findViewById(R.id.flex_container);
                if (flexboxLayout2 != null) {
                    int childCount2 = flexboxLayout2.getChildCount();
                    for (int i12 = 0; i12 < childCount2; i12++) {
                        View childAt2 = flexboxLayout2.getChildAt(i12);
                        if (childAt2 != null) {
                            ep.a.z(absDialogModelAdapter.mContext, "mContext", R.color.second_black, (TextView) childAt2.findViewById(R.id.tv_middle));
                        }
                    }
                }
            }
        }
    }

    public static final void i(AbsDialogModelAdapter absDialogModelAdapter, CardView cardView) {
        ((ImageView) cardView.findViewById(R.id.iv_word_tick)).setImageResource(R.drawable.ic_word_status_wrong);
        cardView.setEnabled(false);
        FlexboxLayout flexboxLayout = (FlexboxLayout) cardView.findViewById(R.id.flex_container);
        if (flexboxLayout != null) {
            int childCount = flexboxLayout.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = flexboxLayout.getChildAt(i11);
                if (childAt != null) {
                    ep.a.z(absDialogModelAdapter.mContext, "mContext", R.color.second_black, (TextView) childAt.findViewById(R.id.tv_middle));
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0030  */
    public static final void j(AbsDialogModelAdapter absDialogModelAdapter, CardView cardView, List list) {
        View viewFindViewById = cardView.findViewById(R.id.flex_container);
        m.e(viewFindViewById, "findViewById(...)");
        Context context = absDialogModelAdapter.mContext;
        m.c(context);
        cj.c cVar = new cj.c(context, list, (FlexboxLayout) viewFindViewById, 3);
        int[] iArr = r.f4959a;
        if (bq.m.F()) {
            LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
            if (cf.x.n().csDisplay == 0) {
                cVar.f59274j = h.l(2.0f);
            } else {
                cVar.f59274j = 2;
            }
        } else {
            cVar.f59274j = h.l(2.0f);
        }
        cVar.f59268d = 10;
        cVar.f59269e = 18;
        cVar.f59270f = 10;
        cVar.f59277n = true;
        cVar.d();
        absDialogModelAdapter.f22058g.add(cVar);
    }

    public static void n(int i11, List list, TextView textView) {
        String string = textView.getText().toString();
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        if (cf.x.n().keyLanguage == 0 || cf.x.n().keyLanguage == 1 || cf.x.n().keyLanguage == 2) {
            return;
        }
        if (i11 == 0 && ((Word) list.get(i11)).getWordType() != 1 && !m.a(((Word) list.get(i11)).getWord(), "_____") && p0.C((Word) p.g(1, list), "getWord(...)")) {
            String strSubstring = string.substring(0, 1);
            m.e(strSubstring, "substring(...)");
            int[] iArr = r.f4959a;
            String strM = p0.m(strSubstring, "toUpperCase(...)");
            String strSubstring2 = string.substring(1);
            m.e(strSubstring2, "substring(...)");
            textView.setText(strM.concat(strSubstring2));
            return;
        }
        if (i11 == 1 && ((Word) list.get(0)).getWordType() == 1 && !m.a(((Word) list.get(0)).getWord(), "_____") && ((Word) list.get(i11)).getWordType() != 1 && !m.a(((Word) list.get(i11)).getWord(), "_____") && ((Word) p.g(1, list)).getWordType() == 1 && !m.a(((Word) p.g(1, list)).getWord(), "_____")) {
            String strSubstring3 = string.substring(0, 1);
            m.e(strSubstring3, "substring(...)");
            int[] iArr2 = r.f4959a;
            String strM2 = p0.m(strSubstring3, "toUpperCase(...)");
            String strSubstring4 = string.substring(1);
            m.e(strSubstring4, "substring(...)");
            textView.setText(strM2.concat(strSubstring4));
            return;
        }
        if (i11 > 0) {
            Word word = (Word) list.get(i11 - 1);
            if (p0.C(word, "getWord(...)") && cf.x.n().keyLanguage != 0 && cf.x.n().keyLanguage != 1 && cf.x.n().keyLanguage != 2 && ((Word) list.get(i11)).getWordType() != 1 && !m.a(((Word) list.get(i11)).getWord(), "_____") && p0.C((Word) p.g(1, list), "getWord(...)")) {
                String strSubstring5 = string.substring(0, 1);
                m.e(strSubstring5, "substring(...)");
                int[] iArr3 = r.f4959a;
                String strM3 = p0.m(strSubstring5, "toUpperCase(...)");
                String strSubstring6 = string.substring(1);
                m.e(strSubstring6, "substring(...)");
                textView.setText(strM3.concat(strSubstring6));
                return;
            }
            if (i11 <= 1 || word.getWordType() != 1 || m.a(word.getWord(), "_____") || !p0.C((Word) list.get(i11 - 2), "getWord(...)") || cf.x.n().keyLanguage == 0 || cf.x.n().keyLanguage == 1 || cf.x.n().keyLanguage == 2 || ((Word) list.get(i11)).getWordType() == 1 || m.a(((Word) list.get(i11)).getWord(), "_____") || !p0.C((Word) p.g(1, list), "getWord(...)")) {
                return;
            }
            String strSubstring7 = string.substring(0, 1);
            m.e(strSubstring7, "substring(...)");
            int[] iArr4 = r.f4959a;
            String strM4 = p0.m(strSubstring7, "toUpperCase(...)");
            String strSubstring8 = string.substring(1);
            m.e(strSubstring8, "substring(...)");
            textView.setText(strM4.concat(strSubstring8));
        }
    }

    /* JADX WARN: Code duplicated, block: B:57:0x0281  */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void convert(BaseViewHolder baseViewHolder, Object obj) {
        BaseViewHolder baseViewHolder2;
        BaseViewHolder helper = baseViewHolder;
        Sentence item = (Sentence) obj;
        m.f(helper, "helper");
        m.f(item, "item");
        final int i11 = 3;
        final int i12 = 1;
        if (item.getItemType() == 1) {
            TextView textView = (TextView) helper.getView(R.id.tv_sentence_trans);
            LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
            if (cf.x.n().locateLanguage == 3) {
                String sentence = item.getSentence();
                m.e(sentence, "getSentence(...)");
                textView.setText(x.q0(sentence, "P:", BuildConfig.VERSION_NAME));
            } else {
                String translations = item.getTranslations();
                m.e(translations, "getTranslations(...)");
                textView.setText(x.q0(translations, "P:", BuildConfig.VERSION_NAME));
            }
            helper.itemView.setTag(item);
            return;
        }
        FlexboxLayout flexboxLayout = (FlexboxLayout) helper.getView(R.id.flex_sentence);
        final ImageView imageView = (ImageView) helper.getView(R.id.iv_audio);
        TextView textView2 = (TextView) helper.getView(R.id.tv_sentence_trans);
        textView2.setText(item.getTranslations());
        final int i13 = 0;
        z.b(textView2, new fz.c(this) { // from class: kp.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AbsDialogModelAdapter f38372b;

            {
                this.f38372b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj2) {
                View it = (View) obj2;
                switch (i13) {
                    case 0:
                        m.f(it, "it");
                        if (!this.f38372b.f22061j) {
                            imageView.performClick();
                        }
                        break;
                    default:
                        m.f(it, "it");
                        if (!this.f38372b.f22061j) {
                            imageView.performClick();
                        }
                        break;
                }
                return qy.b0.f48488a;
            }
        });
        m.c(imageView);
        z.b(imageView, new j0(this, helper, item, 13));
        if (item.getItemType() != 1) {
            View view = helper.getView(R.id.iv_header);
            m.e(view, "getView(...)");
            z.b(view, new fz.c(this) { // from class: kp.b

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ AbsDialogModelAdapter f38372b;

                {
                    this.f38372b = this;
                }

                @Override // fz.c
                public final Object invoke(Object obj2) {
                    View it = (View) obj2;
                    switch (i12) {
                        case 0:
                            m.f(it, "it");
                            if (!this.f38372b.f22061j) {
                                imageView.performClick();
                            }
                            break;
                        default:
                            m.f(it, "it");
                            if (!this.f38372b.f22061j) {
                                imageView.performClick();
                            }
                            break;
                    }
                    return qy.b0.f48488a;
                }
            });
        }
        imageView.setTag(R.id.tag_sentence, item);
        imageView.setTag(R.id.tag_item_view, helper.itemView);
        if (flexboxLayout.getChildCount() > 1) {
            flexboxLayout.removeViews(1, flexboxLayout.getChildCount() - 1);
        }
        StringBuilder sb2 = new StringBuilder();
        Iterator<Word> it = item.getSentWordsNOMF().iterator();
        while (it.hasNext()) {
            sb2.append(it.next().getWord());
        }
        List<Word> sentWordsNOMF = item.getSentWordsNOMF();
        m.e(sentWordsNOMF, "getSentWordsNOMF(...)");
        int i14 = 0;
        int length = 0;
        for (Object obj2 : sentWordsNOMF) {
            int i15 = i14 + 1;
            if (i14 < 0) {
                o.V();
                throw null;
            }
            Word word = (Word) obj2;
            m.c(word);
            View viewP = p(flexboxLayout, word, item, helper, i14);
            float length2 = length / sb2.length();
            length += word.getWord().length();
            word.getWord();
            viewP.setTag(R.id.tag_start_pos, Float.valueOf(length2));
            flexboxLayout.addView(viewP);
            int iO = o(i14, word, item);
            int[] iArr = r.f4959a;
            if (bq.m.F()) {
                baseViewHolder2 = baseViewHolder;
                ViewGroup.LayoutParams layoutParams = viewP.getLayoutParams();
                m.d(layoutParams, "null cannot be cast to non-null type com.google.android.flexbox.FlexboxLayout.LayoutParams");
                FlexboxLayout.LayoutParams layoutParams2 = (FlexboxLayout.LayoutParams) layoutParams;
                ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin = iO;
                viewP.setLayoutParams(layoutParams2);
            } else if (iO != 0) {
                Word word2 = new Word();
                word2.setWord(" ");
                word2.setWordType(1);
                baseViewHolder2 = baseViewHolder;
                flexboxLayout.addView(p(flexboxLayout, word2, item, baseViewHolder, -1));
            } else {
                baseViewHolder2 = baseViewHolder;
            }
            helper = baseViewHolder2;
            i14 = i15;
        }
        BaseViewHolder baseViewHolder3 = helper;
        baseViewHolder3.itemView.setTag(item);
        final qi.a model = item.getModel();
        if (model == null || item.isHasChecked()) {
            baseViewHolder3.setGone(R.id.fl_question_options, false);
        } else {
            View itemView = baseViewHolder3.itemView;
            m.e(itemView, "itemView");
            FrameLayout frameLayout = (FrameLayout) itemView.findViewById(R.id.fl_question_options);
            frameLayout.removeAllViews();
            frameLayout.setVisibility(0);
            f fVar = this.f22060i;
            if (fVar != null) {
                ((i) fVar.f378b).x(0);
            }
            int i16 = model.f47800c;
            int i17 = 18;
            re.q qVar = vx.b.f54316e;
            q qVar2 = this.f22057f;
            if (i16 == 1) {
                FrameLayout frameLayout2 = (FrameLayout) itemView.findViewById(R.id.fl_question_options);
                View viewInflate = LayoutInflater.from(this.mContext).inflate(R.layout.include_dialog_model_01, (ViewGroup) frameLayout2, false);
                m.d(viewInflate, "null cannot be cast to non-null type com.google.android.flexbox.FlexboxLayout");
                FlexboxLayout flexboxLayout2 = (FlexboxLayout) viewInflate;
                int i18 = 9;
                th.j.a(new ay.r(new ay.x(new Callable() { // from class: kp.a
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        switch (i11) {
                            case 0:
                                Sentence sentenceE = ij.c.e(model.f47799b);
                                m.c(sentenceE);
                                return sentenceE;
                            case 1:
                                return Model_Sentence_050.loadFullObject(model.f47799b);
                            case 2:
                                return Model_Sentence_100.loadFullObject(model.f47799b);
                            case 3:
                                return Model_Sentence_010.loadFullObject(model.f47799b);
                            case 4:
                                return Model_Sentence_030.loadFullObject(model.f47799b);
                            default:
                                qi.a aVar = model;
                                if (ij.d.f34419e == null) {
                                    synchronized (ij.d.class) {
                                        if (ij.d.f34419e == null) {
                                            LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
                                            m.c(lingoSkillApplication2);
                                            ij.d.f34419e = new ij.d(lingoSkillApplication2);
                                        }
                                        break;
                                    }
                                }
                                ij.d dVar = ij.d.f34419e;
                                m.c(dVar);
                                Model_Sentence_000Dao model_Sentence_000Dao = ((DaoSession) dVar.f34423d).getModel_Sentence_000Dao();
                                m.e(model_Sentence_000Dao, "getModel_Sentence_000Dao(...)");
                                k10.g gVarQueryBuilder = model_Sentence_000Dao.queryBuilder();
                                gVarQueryBuilder.f(Model_Sentence_000Dao.Properties.SentenceId.b(Long.valueOf(aVar.f47799b)), new k10.h[0]);
                                gVarQueryBuilder.f37855f = 1;
                                return (Model_Sentence_000) gVarQueryBuilder.d().get(0);
                        }
                    }
                }).k(ky.e.f38937b).g(px.b.a()), new g0(i18), new re.e0(i18), new v(i18)).h(new ob.m(itemView, this, flexboxLayout2, i17), qVar), qVar2);
                frameLayout2.addView(flexboxLayout2);
            } else if (i16 != 10) {
                final int i19 = 4;
                if (i16 == 3) {
                    ArrayList arrayList = new ArrayList();
                    FrameLayout frameLayout3 = (FrameLayout) itemView.findViewById(R.id.fl_question_options);
                    View viewInflate2 = LayoutInflater.from(this.mContext).inflate(R.layout.include_dialog_model_01, (ViewGroup) frameLayout3, false);
                    m.d(viewInflate2, "null cannot be cast to non-null type com.google.android.flexbox.FlexboxLayout");
                    FlexboxLayout flexboxLayout3 = (FlexboxLayout) viewInflate2;
                    th.j.a(new ay.x(new Callable() { // from class: kp.a
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            switch (i19) {
                                case 0:
                                    Sentence sentenceE = ij.c.e(model.f47799b);
                                    m.c(sentenceE);
                                    return sentenceE;
                                case 1:
                                    return Model_Sentence_050.loadFullObject(model.f47799b);
                                case 2:
                                    return Model_Sentence_100.loadFullObject(model.f47799b);
                                case 3:
                                    return Model_Sentence_010.loadFullObject(model.f47799b);
                                case 4:
                                    return Model_Sentence_030.loadFullObject(model.f47799b);
                                default:
                                    qi.a aVar = model;
                                    if (ij.d.f34419e == null) {
                                        synchronized (ij.d.class) {
                                            if (ij.d.f34419e == null) {
                                                LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
                                                m.c(lingoSkillApplication2);
                                                ij.d.f34419e = new ij.d(lingoSkillApplication2);
                                            }
                                            break;
                                        }
                                    }
                                    ij.d dVar = ij.d.f34419e;
                                    m.c(dVar);
                                    Model_Sentence_000Dao model_Sentence_000Dao = ((DaoSession) dVar.f34423d).getModel_Sentence_000Dao();
                                    m.e(model_Sentence_000Dao, "getModel_Sentence_000Dao(...)");
                                    k10.g gVarQueryBuilder = model_Sentence_000Dao.queryBuilder();
                                    gVarQueryBuilder.f(Model_Sentence_000Dao.Properties.SentenceId.b(Long.valueOf(aVar.f47799b)), new k10.h[0]);
                                    gVarQueryBuilder.f37855f = 1;
                                    return (Model_Sentence_000) gVarQueryBuilder.d().get(0);
                            }
                        }
                    }).k(ky.e.f38937b).g(px.b.a()).h(new kp.d(itemView, arrayList, this, flexboxLayout3), qVar), qVar2);
                    frameLayout3.addView(flexboxLayout3);
                } else if (i16 != 4) {
                    final int i21 = 5;
                    if (i16 == 5) {
                        ArrayList arrayList2 = new ArrayList();
                        FrameLayout frameLayout4 = (FrameLayout) itemView.findViewById(R.id.fl_question_options);
                        View viewInflate3 = LayoutInflater.from(this.mContext).inflate(R.layout.include_dialog_model_01, (ViewGroup) frameLayout4, false);
                        m.d(viewInflate3, "null cannot be cast to non-null type com.google.android.flexbox.FlexboxLayout");
                        FlexboxLayout flexboxLayout4 = (FlexboxLayout) viewInflate3;
                        th.j.a(new ay.x(new Callable() { // from class: kp.a
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                switch (i12) {
                                    case 0:
                                        Sentence sentenceE = ij.c.e(model.f47799b);
                                        m.c(sentenceE);
                                        return sentenceE;
                                    case 1:
                                        return Model_Sentence_050.loadFullObject(model.f47799b);
                                    case 2:
                                        return Model_Sentence_100.loadFullObject(model.f47799b);
                                    case 3:
                                        return Model_Sentence_010.loadFullObject(model.f47799b);
                                    case 4:
                                        return Model_Sentence_030.loadFullObject(model.f47799b);
                                    default:
                                        qi.a aVar = model;
                                        if (ij.d.f34419e == null) {
                                            synchronized (ij.d.class) {
                                                if (ij.d.f34419e == null) {
                                                    LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
                                                    m.c(lingoSkillApplication2);
                                                    ij.d.f34419e = new ij.d(lingoSkillApplication2);
                                                }
                                                break;
                                            }
                                        }
                                        ij.d dVar = ij.d.f34419e;
                                        m.c(dVar);
                                        Model_Sentence_000Dao model_Sentence_000Dao = ((DaoSession) dVar.f34423d).getModel_Sentence_000Dao();
                                        m.e(model_Sentence_000Dao, "getModel_Sentence_000Dao(...)");
                                        k10.g gVarQueryBuilder = model_Sentence_000Dao.queryBuilder();
                                        gVarQueryBuilder.f(Model_Sentence_000Dao.Properties.SentenceId.b(Long.valueOf(aVar.f47799b)), new k10.h[0]);
                                        gVarQueryBuilder.f37855f = 1;
                                        return (Model_Sentence_000) gVarQueryBuilder.d().get(0);
                                }
                            }
                        }).k(ky.e.f38937b).g(px.b.a()).h(new dm.c(this, flexboxLayout4, itemView, arrayList2, 6), qVar), qVar2);
                        frameLayout4.addView(flexboxLayout4);
                    } else if (i16 == 13) {
                        HashMap map = new HashMap();
                        HashMap map2 = new HashMap();
                        ArrayList arrayList3 = new ArrayList();
                        FrameLayout frameLayout5 = (FrameLayout) itemView.findViewById(R.id.fl_question_options);
                        View viewInflate4 = LayoutInflater.from(this.mContext).inflate(R.layout.include_dialog_model_13, (ViewGroup) frameLayout5, false);
                        FlexboxLayout flexboxLayout5 = (FlexboxLayout) viewInflate4.findViewById(R.id.flex_options);
                        FlexboxLayout flexboxLayout6 = (FlexboxLayout) itemView.findViewById(R.id.flex_sentence);
                        ay.p pVarG = new ay.x(new Callable() { // from class: kp.a
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                switch (i13) {
                                    case 0:
                                        Sentence sentenceE = ij.c.e(model.f47799b);
                                        m.c(sentenceE);
                                        return sentenceE;
                                    case 1:
                                        return Model_Sentence_050.loadFullObject(model.f47799b);
                                    case 2:
                                        return Model_Sentence_100.loadFullObject(model.f47799b);
                                    case 3:
                                        return Model_Sentence_010.loadFullObject(model.f47799b);
                                    case 4:
                                        return Model_Sentence_030.loadFullObject(model.f47799b);
                                    default:
                                        qi.a aVar = model;
                                        if (ij.d.f34419e == null) {
                                            synchronized (ij.d.class) {
                                                if (ij.d.f34419e == null) {
                                                    LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
                                                    m.c(lingoSkillApplication2);
                                                    ij.d.f34419e = new ij.d(lingoSkillApplication2);
                                                }
                                                break;
                                            }
                                        }
                                        ij.d dVar = ij.d.f34419e;
                                        m.c(dVar);
                                        Model_Sentence_000Dao model_Sentence_000Dao = ((DaoSession) dVar.f34423d).getModel_Sentence_000Dao();
                                        m.e(model_Sentence_000Dao, "getModel_Sentence_000Dao(...)");
                                        k10.g gVarQueryBuilder = model_Sentence_000Dao.queryBuilder();
                                        gVarQueryBuilder.f(Model_Sentence_000Dao.Properties.SentenceId.b(Long.valueOf(aVar.f47799b)), new k10.h[0]);
                                        gVarQueryBuilder.f37855f = 1;
                                        return (Model_Sentence_000) gVarQueryBuilder.d().get(0);
                                }
                            }
                        }).k(ky.e.f38937b).g(px.b.a());
                        x2 x2Var = new x2();
                        x2Var.f48709a = this;
                        x2Var.f48711c = flexboxLayout5;
                        x2Var.f48710b = viewInflate4;
                        x2Var.f48712d = flexboxLayout6;
                        x2Var.f48713e = map;
                        x2Var.f48714f = map2;
                        x2Var.f48715t = arrayList3;
                        th.j.a(pVarG.h(x2Var, qVar), qVar2);
                        frameLayout5.addView(viewInflate4);
                    } else if (i16 == 14) {
                        FrameLayout frameLayout6 = (FrameLayout) itemView.findViewById(R.id.fl_question_options);
                        View viewInflate5 = LayoutInflater.from(this.mContext).inflate(R.layout.include_dialog_model_14, (ViewGroup) frameLayout6, false);
                        TextView textView3 = (TextView) viewInflate5.findViewById(R.id.tv_sentence_explain);
                        frameLayout6.addView(viewInflate5);
                        th.j.a(new ay.x(new Callable() { // from class: kp.a
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                switch (i21) {
                                    case 0:
                                        Sentence sentenceE = ij.c.e(model.f47799b);
                                        m.c(sentenceE);
                                        return sentenceE;
                                    case 1:
                                        return Model_Sentence_050.loadFullObject(model.f47799b);
                                    case 2:
                                        return Model_Sentence_100.loadFullObject(model.f47799b);
                                    case 3:
                                        return Model_Sentence_010.loadFullObject(model.f47799b);
                                    case 4:
                                        return Model_Sentence_030.loadFullObject(model.f47799b);
                                    default:
                                        qi.a aVar = model;
                                        if (ij.d.f34419e == null) {
                                            synchronized (ij.d.class) {
                                                if (ij.d.f34419e == null) {
                                                    LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
                                                    m.c(lingoSkillApplication2);
                                                    ij.d.f34419e = new ij.d(lingoSkillApplication2);
                                                }
                                                break;
                                            }
                                        }
                                        ij.d dVar = ij.d.f34419e;
                                        m.c(dVar);
                                        Model_Sentence_000Dao model_Sentence_000Dao = ((DaoSession) dVar.f34423d).getModel_Sentence_000Dao();
                                        m.e(model_Sentence_000Dao, "getModel_Sentence_000Dao(...)");
                                        k10.g gVarQueryBuilder = model_Sentence_000Dao.queryBuilder();
                                        gVarQueryBuilder.f(Model_Sentence_000Dao.Properties.SentenceId.b(Long.valueOf(aVar.f47799b)), new k10.h[0]);
                                        gVarQueryBuilder.f37855f = 1;
                                        return (Model_Sentence_000) gVarQueryBuilder.d().get(0);
                                }
                            }
                        }).k(ky.e.f38937b).g(px.b.a()).h(new b1.p(i17, textView3, this), new ob.c(i17, textView3, this)), qVar2);
                    }
                } else {
                    ArrayList arrayList4 = new ArrayList();
                    FrameLayout frameLayout7 = (FrameLayout) itemView.findViewById(R.id.fl_question_options);
                    View viewInflate6 = LayoutInflater.from(this.mContext).inflate(R.layout.include_dialog_model_01, (ViewGroup) frameLayout7, false);
                    m.d(viewInflate6, "null cannot be cast to non-null type com.google.android.flexbox.FlexboxLayout");
                    FlexboxLayout flexboxLayout7 = (FlexboxLayout) viewInflate6;
                    th.j.a(new ay.x(new Callable() { // from class: kp.a
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            switch (i12) {
                                case 0:
                                    Sentence sentenceE = ij.c.e(model.f47799b);
                                    m.c(sentenceE);
                                    return sentenceE;
                                case 1:
                                    return Model_Sentence_050.loadFullObject(model.f47799b);
                                case 2:
                                    return Model_Sentence_100.loadFullObject(model.f47799b);
                                case 3:
                                    return Model_Sentence_010.loadFullObject(model.f47799b);
                                case 4:
                                    return Model_Sentence_030.loadFullObject(model.f47799b);
                                default:
                                    qi.a aVar = model;
                                    if (ij.d.f34419e == null) {
                                        synchronized (ij.d.class) {
                                            if (ij.d.f34419e == null) {
                                                LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
                                                m.c(lingoSkillApplication2);
                                                ij.d.f34419e = new ij.d(lingoSkillApplication2);
                                            }
                                            break;
                                        }
                                    }
                                    ij.d dVar = ij.d.f34419e;
                                    m.c(dVar);
                                    Model_Sentence_000Dao model_Sentence_000Dao = ((DaoSession) dVar.f34423d).getModel_Sentence_000Dao();
                                    m.e(model_Sentence_000Dao, "getModel_Sentence_000Dao(...)");
                                    k10.g gVarQueryBuilder = model_Sentence_000Dao.queryBuilder();
                                    gVarQueryBuilder.f(Model_Sentence_000Dao.Properties.SentenceId.b(Long.valueOf(aVar.f47799b)), new k10.h[0]);
                                    gVarQueryBuilder.f37855f = 1;
                                    return (Model_Sentence_000) gVarQueryBuilder.d().get(0);
                            }
                        }
                    }).k(ky.e.f38937b).g(px.b.a()).h(new dm.c(this, flexboxLayout7, itemView, arrayList4, 6), qVar), qVar2);
                    frameLayout7.addView(flexboxLayout7);
                }
            } else {
                ArrayList arrayList5 = new ArrayList();
                FrameLayout frameLayout8 = (FrameLayout) itemView.findViewById(R.id.fl_question_options);
                View viewInflate7 = LayoutInflater.from(this.mContext).inflate(R.layout.include_dialog_model_01, (ViewGroup) frameLayout8, false);
                m.d(viewInflate7, "null cannot be cast to non-null type com.google.android.flexbox.FlexboxLayout");
                FlexboxLayout flexboxLayout8 = (FlexboxLayout) viewInflate7;
                final int i22 = 2;
                th.j.a(new ay.x(new Callable() { // from class: kp.a
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        switch (i22) {
                            case 0:
                                Sentence sentenceE = ij.c.e(model.f47799b);
                                m.c(sentenceE);
                                return sentenceE;
                            case 1:
                                return Model_Sentence_050.loadFullObject(model.f47799b);
                            case 2:
                                return Model_Sentence_100.loadFullObject(model.f47799b);
                            case 3:
                                return Model_Sentence_010.loadFullObject(model.f47799b);
                            case 4:
                                return Model_Sentence_030.loadFullObject(model.f47799b);
                            default:
                                qi.a aVar = model;
                                if (ij.d.f34419e == null) {
                                    synchronized (ij.d.class) {
                                        if (ij.d.f34419e == null) {
                                            LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
                                            m.c(lingoSkillApplication2);
                                            ij.d.f34419e = new ij.d(lingoSkillApplication2);
                                        }
                                        break;
                                    }
                                }
                                ij.d dVar = ij.d.f34419e;
                                m.c(dVar);
                                Model_Sentence_000Dao model_Sentence_000Dao = ((DaoSession) dVar.f34423d).getModel_Sentence_000Dao();
                                m.e(model_Sentence_000Dao, "getModel_Sentence_000Dao(...)");
                                k10.g gVarQueryBuilder = model_Sentence_000Dao.queryBuilder();
                                gVarQueryBuilder.f(Model_Sentence_000Dao.Properties.SentenceId.b(Long.valueOf(aVar.f47799b)), new k10.h[0]);
                                gVarQueryBuilder.f37855f = 1;
                                return (Model_Sentence_000) gVarQueryBuilder.d().get(0);
                        }
                    }
                }).k(ky.e.f38937b).g(px.b.a()).h(new kp.d(this, flexboxLayout8, itemView, arrayList5), qVar), qVar2);
                frameLayout8.addView(flexboxLayout8);
            }
        }
        ef.e.B(baseViewHolder3.itemView);
    }

    public final void k(View view) {
        if (view != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(R.id.const_main);
            if (constraintLayout != null) {
                constraintLayout.setEnabled(true);
            }
            ImageView imageView = (ImageView) view.findViewById(R.id.iv_top);
            if (imageView != null) {
                imageView.setEnabled(true);
            }
            FlexboxLayout flexboxLayout = (FlexboxLayout) view.findViewById(R.id.flex_sentence);
            if (flexboxLayout != null) {
                int childCount = flexboxLayout.getChildCount();
                for (int i11 = 1; i11 < childCount; i11++) {
                    m(flexboxLayout.getChildAt(i11));
                }
            }
        }
    }

    public final void l(View itemView, Sentence item) {
        m.f(itemView, "itemView");
        m.f(item, "item");
        this.mData.indexOf(item);
        if (item.getItemType() == 1) {
            return;
        }
        j jVar = this.f22056e;
        if (jVar != null) {
            i iVar = (i) jVar.f385b;
            PopupWindow popupWindow = iVar.f36487q;
            ArrayList arrayList = iVar.f36485o;
            if (popupWindow != null) {
                popupWindow.dismiss();
            }
            int iIndexOf = arrayList.indexOf(item);
            iVar.w(iIndexOf);
            if ((item.isHasChecked() || item.getModel() == null) && arrayList.size() - 1 == iIndexOf && !iVar.f36492v) {
                iVar.x(0);
            }
            if (item.getModel() == null || item.isHasChecked()) {
                b bVar = iVar.f36488r;
                if (bVar != null) {
                    bVar.dispose();
                }
                th.j.a(qx.h.m(300L, TimeUnit.MILLISECONDS, ky.e.f38937b).g(px.b.a()).h(new g(item, iVar, itemView, iIndexOf), jp.h.f36476c), iVar.f47887g);
            }
        }
        ImageView imageView = (ImageView) itemView.findViewById(R.id.iv_audio);
        itemView.setVisibility(0);
        ImageView imageView2 = this.f22053b;
        if (imageView2 != null) {
            Drawable background = imageView2.getBackground();
            m.e(background, "getBackground(...)");
            if (background instanceof AnimationDrawable) {
                AnimationDrawable animationDrawable = (AnimationDrawable) background;
                animationDrawable.selectDrawable(0);
                animationDrawable.stop();
            }
        }
        m(this.f22052a);
        k(this.f22054c);
        this.f22053b = imageView;
        this.f22054c = itemView;
        ConstraintLayout constraintLayout = (ConstraintLayout) itemView.findViewById(R.id.const_main);
        if (constraintLayout != null) {
            constraintLayout.setEnabled(false);
        }
        ImageView imageView3 = (ImageView) itemView.findViewById(R.id.iv_top);
        if (imageView3 != null) {
            imageView3.setEnabled(false);
        }
        Drawable background2 = imageView.getBackground();
        m.e(background2, "getBackground(...)");
        if (background2 instanceof AnimationDrawable) {
            ((AnimationDrawable) background2).start();
        }
    }

    public final View p(FlexboxLayout flexboxLayout, Word word, Sentence sentence, BaseViewHolder baseViewHolder, int i11) {
        View viewInflate = LayoutInflater.from(this.mContext).inflate(R.layout.item_dialog_word, (ViewGroup) flexboxLayout, false);
        TextView textView = (TextView) viewInflate.findViewById(R.id.tv_top);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.tv_middle);
        TextView textView3 = (TextView) viewInflate.findViewById(R.id.tv_bottom);
        View viewFindViewById = viewInflate.findViewById(R.id.view_line);
        View viewFindViewById2 = viewInflate.findViewById(R.id.view_point);
        viewFindViewById.setVisibility(0);
        viewFindViewById2.setVisibility(4);
        m.c(textView);
        m.c(textView2);
        m.c(textView3);
        zq.c.e(word, textView, textView2, textView3, false);
        if (i11 != -1) {
            List<Word> sentWordsNOMF = sentence.getSentWordsNOMF();
            m.e(sentWordsNOMF, "getSentWordsNOMF(...)");
            n(i11, sentWordsNOMF, textView2);
        }
        viewInflate.setTag(word);
        if (word.getWordType() == 1) {
            viewFindViewById.setVisibility(8);
            return viewInflate;
        }
        z.b(viewInflate, new j0(this, baseViewHolder, word, 14));
        viewInflate.setTag(R.id.tag_adapter_pos, Integer.valueOf(baseViewHolder.getAdapterPosition()));
        viewInflate.setTag(R.id.tag_word, word);
        viewInflate.setTag(R.id.tag_item_view, baseViewHolder.itemView);
        return viewInflate;
    }

    public final void m(View view) {
        if (view != null) {
            TextView textView = (TextView) view.findViewById(R.id.tv_top);
            TextView textView2 = (TextView) view.findViewById(R.id.tv_middle);
            TextView textView3 = (TextView) view.findViewById(R.id.tv_bottom);
            View viewFindViewById = view.findViewById(R.id.view_line);
            View viewFindViewById2 = view.findViewById(R.id.view_point);
            if (!m.a(view.getTag(R.id.tag_is_invisiable), Boolean.TRUE)) {
                Resources resources = this.mContext.getResources();
                ThreadLocal threadLocal = q4.j.f47447a;
                textView.setTextColor(resources.getColor(R.color.second_black, null));
                textView2.setTextColor(this.mContext.getResources().getColor(R.color.primary_black, null));
                textView3.setTextColor(this.mContext.getResources().getColor(R.color.second_black, null));
            }
            viewFindViewById2.setVisibility(4);
            Object tag = view.getTag();
            m.d(tag, aYZzTH.socBqgonQkCTb);
            if (((Word) tag).getWordType() == 1) {
                viewFindViewById.setVisibility(8);
            } else {
                viewFindViewById.setVisibility(0);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:31:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:33:0x0107  */
    /* JADX WARN: Code duplicated, block: B:35:0x011d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0123  */
    /* JADX WARN: Code duplicated, block: B:44:0x016d  */
    /* JADX WARN: Code duplicated, block: B:46:0x017e  */
    /* JADX WARN: Code duplicated, block: B:49:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:51:0x01be  */
    /* JADX WARN: Code duplicated, block: B:57:0x01e1  */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x01d3, code lost:
    
        if (oz.x.s0(r1, "-", false) != false) goto L58;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int o(int r22, com.lingo.lingoskill.object.Word r23, com.lingo.lingoskill.object.Sentence r24) {
        /*
            Method dump skipped, instruction units count: 492
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lingo.lingoskill.ui.learn.adapter.AbsDialogModelAdapter.o(int, com.lingo.lingoskill.object.Word, com.lingo.lingoskill.object.Sentence):int");
    }
}
