package com.lingo.fluent.ui.base.adapter;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import bq.r;
import bq.z;
import cj.b;
import com.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.google.android.flexbox.FlexboxLayout;
import com.google.android.material.button.MaterialButton;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.object.PdLesson;
import com.lingo.lingoskill.object.PdSentence;
import com.lingo.lingoskill.object.PdWord;
import com.lingodeer.R;
import dm.a;
import fb.g0;
import fr.j3;
import fr.o0;
import fu.j0;
import gr.s;
import hd.d;
import hh.a0;
import hh.c0;
import hh.v;
import hj.i4;
import ih.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.x;
import ky.e;
import ns.o;
import q4.j;
import ry.l;
import rz.e0;
import th.h;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class PdLearnDetailAdapter extends BaseMultiItemQuickAdapter<PdSentence, BaseViewHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f21626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f21627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f21628c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LifecycleOwner f21629d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public View f21630e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ImageView f21631f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public a f21632g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public d f21633h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f21634i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f21635j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f21636k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f21637l;
    public final ArrayList m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f21638n;

    public PdLearnDetailAdapter(int i11, List list, long j11, boolean z11, LifecycleOwner lifecycleOwner) {
        super(list);
        this.f21626a = i11;
        this.f21627b = j11;
        this.f21628c = z11;
        this.f21629d = lifecycleOwner;
        this.f21634i = new ArrayList();
        this.f21635j = new ArrayList();
        this.f21636k = new ArrayList();
        this.f21637l = new ArrayList();
        this.m = new ArrayList();
        this.f21638n = true;
        addItemType(PdSentence.MALE, R.layout.item_pd_learn_detail_adapter_left);
        addItemType(PdSentence.FEMALE, R.layout.item_pd_learn_detail_adapter_right);
    }

    public static void a(PdLearnDetailAdapter pdLearnDetailAdapter, View it) {
        m.f(it, "it");
        Context mContext = pdLearnDetailAdapter.mContext;
        m.e(mContext, "mContext");
        g0.w(mContext, pdLearnDetailAdapter.f21629d, "fl_listen_trans");
    }

    public final void b() {
        Iterator it = this.f21636k.iterator();
        m.e(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            m.e(next, "next(...)");
            View view = (View) next;
            ((ConstraintLayout) view.findViewById(R.id.const_main)).setEnabled(true);
            ((ImageView) view.findViewById(R.id.iv_top)).setEnabled(true);
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0184  */
    public final void c(View view, View itemView, PdWord pdWord, int i11, boolean z11) {
        int iIndexOf;
        int i12;
        long j11;
        ArrayList arrayList;
        m.f(view, "view");
        m.f(itemView, "itemView");
        Iterator it = this.f21635j.iterator();
        m.e(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            m.e(next, "next(...)");
            e((View) next);
        }
        Iterator it2 = this.f21637l.iterator();
        m.e(it2, "iterator(...)");
        while (true) {
            iIndexOf = 0;
            if (!it2.hasNext()) {
                break;
            }
            Object next2 = it2.next();
            m.e(next2, "next(...)");
            Drawable background = ((ImageView) next2).getBackground();
            m.e(background, "getBackground(...)");
            if (background instanceof AnimationDrawable) {
                AnimationDrawable animationDrawable = (AnimationDrawable) background;
                animationDrawable.selectDrawable(0);
                animationDrawable.stop();
            }
        }
        Iterator it3 = this.f21636k.iterator();
        m.e(it3, "iterator(...)");
        while (true) {
            i12 = 1;
            if (!it3.hasNext()) {
                break;
            }
            Object next3 = it3.next();
            m.e(next3, "next(...)");
            View view2 = (View) next3;
            ((ConstraintLayout) view2.findViewById(R.id.const_main)).setEnabled(true);
            ((ImageView) view2.findViewById(R.id.iv_top)).setEnabled(true);
        }
        this.f21630e = view;
        TextView textView = (TextView) view.findViewById(R.id.tv_top);
        TextView textView2 = (TextView) view.findViewById(R.id.tv_middle);
        TextView textView3 = (TextView) view.findViewById(R.id.tv_bottom);
        View viewFindViewById = view.findViewById(R.id.view_line);
        View viewFindViewById2 = view.findViewById(R.id.view_point);
        Resources resources = this.mContext.getResources();
        ThreadLocal threadLocal = j.f47447a;
        textView.setTextColor(resources.getColor(R.color.color_primary, null));
        textView2.setTextColor(this.mContext.getResources().getColor(R.color.color_primary, null));
        textView3.setTextColor(this.mContext.getResources().getColor(R.color.color_primary, null));
        viewFindViewById.setVisibility(4);
        viewFindViewById2.setVisibility(0);
        a aVar = this.f21632g;
        if (aVar != null) {
            c0 c0Var = (c0) aVar.f23485b;
            if (z11) {
                c0Var.z();
            }
            PdLearnDetailAdapter pdLearnDetailAdapter = c0Var.P;
            if (pdLearnDetailAdapter != null && (arrayList = pdLearnDetailAdapter.f21634i) != null) {
                iIndexOf = arrayList.indexOf(pdLearnDetailAdapter.f21630e);
            }
            c0Var.Z = iIndexOf;
            ta.a aVar2 = c0Var.f36400f;
            m.c(aVar2);
            ((i4) aVar2).f32704b.setEnabled(true);
            int height = itemView.getHeight() + ((int) itemView.getY());
            ta.a aVar3 = c0Var.f36400f;
            m.c(aVar3);
            float height2 = height - ((i4) aVar3).f32717p.getHeight();
            Context contextRequireContext = c0Var.requireContext();
            m.e(contextRequireContext, "requireContext(...)");
            int iZ = (int) (j3.Z(162, contextRequireContext) + height2);
            x xVar = new x();
            ta.a aVar4 = c0Var.f36400f;
            m.c(aVar4);
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(((i4) aVar4).f32717p.getScrollY(), iZ);
            valueAnimatorOfInt.addUpdateListener(new a0(c0Var, i12));
            ta.a aVar5 = c0Var.f36400f;
            m.c(aVar5);
            if (((i4) aVar5).f32717p.getScrollY() != 0 || iZ > 0) {
                ta.a aVar6 = c0Var.f36400f;
                m.c(aVar6);
                if (((i4) aVar6).f32717p.getScrollY() == iZ) {
                    j11 = 0;
                } else {
                    j11 = 200;
                }
            } else {
                j11 = 0;
            }
            xVar.f38360a = j11;
            valueAnimatorOfInt.setDuration(j11);
            valueAnimatorOfInt.start();
            e0.B(LifecycleOwnerKt.getLifecycleScope(c0Var), null, null, new b(xVar, c0Var, view, pdWord, i11, (vy.d) null), 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x006a  */
    /* JADX WARN: Code duplicated, block: B:43:0x0268  */
    /* JADX WARN: Code duplicated, block: B:45:0x0271  */
    /* JADX WARN: Code duplicated, block: B:51:0x028c  */
    /* JADX WARN: Code duplicated, block: B:56:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:59:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:61:0x0303  */
    /* JADX WARN: Code duplicated, block: B:66:0x0329  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v7 */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void convert(BaseViewHolder helper, Object obj) {
        boolean z11;
        char c11;
        PdSentence pdSentence;
        int i11;
        PdWord pdWord;
        int i12;
        float fZ;
        List listL;
        String strSubstring;
        String word;
        PdSentence item = (PdSentence) obj;
        m.f(helper, "helper");
        m.f(item, "item");
        FlexboxLayout flexboxLayout = (FlexboxLayout) helper.getView(R.id.flex_sentence);
        ImageView imageView = (ImageView) helper.getView(R.id.iv_audio);
        TextView textView = (TextView) helper.getView(R.id.tv_sentence_trans);
        ?? r9 = 0;
        if (helper.getAdapterPosition() != 0) {
            List list = uh.a.f52967a;
            if (l.D(c.a.n(), Long.valueOf(this.f21627b)) || this.f21628c) {
                textView.setText(item.getTranslation());
                z.b(textView, new c(imageView, 0));
            } else {
                textView.setText(this.mContext.getString(R.string.upgrade_now_to_view_more_translations));
                textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.pd_learn_index_pro, 0);
                z.b(textView, new s(this, 10));
            }
        } else {
            textView.setText(item.getTranslation());
            z.b(textView, new c(imageView, 0));
        }
        this.m.add(textView);
        this.f21636k.add(helper.itemView);
        m.c(imageView);
        z.b(imageView, new b0.a(this, helper, imageView, item, 16));
        View view = helper.getView(R.id.iv_header);
        m.e(view, "getView(...)");
        boolean z12 = true;
        z.b(view, new c(imageView, 1));
        imageView.setTag(R.id.tag_sentence, item);
        imageView.setTag(R.id.tag_item_view, helper.itemView);
        this.f21637l.add(imageView);
        if (flexboxLayout.getChildCount() > 1) {
            flexboxLayout.removeViews(1, flexboxLayout.getChildCount() - 1);
        }
        List<PdWord> words = item.getWords();
        m.e(words, "getWords(...)");
        item.setWords(ry.m.o0(words));
        StringBuilder sb2 = new StringBuilder();
        Iterator<PdWord> it = item.getWords().iterator();
        while (it.hasNext()) {
            sb2.append(it.next().getShowLuoma());
        }
        List<PdWord> words2 = item.getWords();
        m.e(words2, "getWords(...)");
        Iterator it2 = words2.iterator();
        int i13 = 0;
        int i14 = 0;
        while (it2.hasNext()) {
            Object next = it2.next();
            int i15 = i13 + 1;
            if (i13 < 0) {
                o.V();
                throw null;
            }
            PdWord pdWord2 = (PdWord) next;
            View viewInflate = LayoutInflater.from(this.mContext).inflate(R.layout.item_pd_read_word, flexboxLayout, (boolean) r9);
            TextView textView2 = (TextView) viewInflate.findViewById(R.id.tv_top);
            boolean z13 = z12;
            TextView textView3 = (TextView) viewInflate.findViewById(R.id.tv_middle);
            TextView textView4 = (TextView) viewInflate.findViewById(R.id.tv_bottom);
            View viewFindViewById = viewInflate.findViewById(R.id.view_line);
            StringBuilder sb3 = sb2;
            View viewFindViewById2 = viewInflate.findViewById(R.id.view_point);
            viewFindViewById.setVisibility(r9);
            viewFindViewById2.setVisibility(4);
            m.c(pdWord2);
            m.c(textView2);
            m.c(textView3);
            m.c(textView4);
            h.b(pdWord2, textView2, textView3, textView4, 496);
            viewInflate.setTag(pdWord2);
            int flag = pdWord2.getFlag();
            int i16 = 6;
            ArrayList arrayList = this.f21634i;
            if (flag != -1) {
                z.b(viewInflate, new j0(this, helper, pdWord2, i16));
                viewInflate.setTag(R.id.tag_adapter_pos, Integer.valueOf(helper.getAdapterPosition()));
                viewInflate.setTag(R.id.tag_word, pdWord2);
                viewInflate.setTag(R.id.tag_item_view, helper.itemView);
                arrayList.add(viewInflate);
                c11 = R.id.tag_item_view;
            } else {
                c11 = 2143;
                viewFindViewById.setVisibility(8);
            }
            float length = i14 / sb3.length();
            int length2 = i14 + pdWord2.getShowLuoma().length();
            pdWord2.getWord();
            pdWord2.getShowLuoma();
            int iIndexOf = item.getWords().indexOf(pdWord2);
            FlexboxLayout.LayoutParams layoutParams = new FlexboxLayout.LayoutParams(-2, -2);
            int i17 = iIndexOf + 1;
            Iterator it3 = it2;
            if ((pdWord2.getFlag() != -1 || m.a(pdWord2.getShowWord(), "_____")) && i17 < item.getWords().size() && item.getWords().get(i17).getFlag() == -1 && !m.a(item.getWords().get(i17).getShowWord(), "_____") && !m.a(item.getWords().get(i17).getShowWord(), " ")) {
                LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                if (cf.x.n().keyLanguage == 5 && o.L(":", ";", "?", "!", "(", "{", "«", "»", "/").contains(item.getWords().get(i17).getWord())) {
                    LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
                    if (cf.x.n().keyLanguage == 0 || ((o0) xt.b.c()).t() != 2) {
                        int[] iArr = r.f4959a;
                        if (bq.m.F()) {
                            pdSentence = item;
                            i11 = length2;
                            pdWord = pdWord2;
                        }
                        i12 = 0;
                    }
                    if (l.D(new Integer[]{5, 4}, Integer.valueOf(cf.x.n().keyLanguage))) {
                        listL = o.L("'", "-", "(", "{", "¿", "¡");
                        String word2 = pdWord2.getWord();
                        pdSentence = item;
                        m.e(word2, "getWord(...)");
                        i11 = length2;
                        pdWord = pdWord2;
                        strSubstring = word2.substring(pdWord2.getWord().length() - 1, pdWord2.getWord().length());
                        m.e(strSubstring, "substring(...)");
                        if (!listL.contains(strSubstring)) {
                            if (i17 < pdSentence.getWords().size()) {
                                word = pdSentence.getWords().get(i17).getWord();
                                m.e(word, "getWord(...)");
                                if (oz.x.s0(word, "-", false)) {
                                }
                            }
                            Context mContext = this.mContext;
                            m.e(mContext, "mContext");
                            fZ = j3.Z(6, mContext);
                        }
                        i12 = 0;
                    } else {
                        pdSentence = item;
                        i11 = length2;
                        pdWord = pdWord2;
                        Context mContext2 = this.mContext;
                        m.e(mContext2, "mContext");
                        fZ = j3.Z(6, mContext2);
                    }
                    i12 = (int) fZ;
                } else {
                    pdSentence = item;
                    i11 = length2;
                    pdWord = pdWord2;
                    i12 = 0;
                }
            } else {
                LingoSkillApplication lingoSkillApplication3 = LingoSkillApplication.f21665b;
                if (cf.x.n().keyLanguage == 0) {
                    int[] iArr2 = r.f4959a;
                    if (bq.m.F()) {
                        pdSentence = item;
                        i11 = length2;
                        pdWord = pdWord2;
                    }
                    i12 = 0;
                } else {
                    int[] iArr3 = r.f4959a;
                    if (bq.m.F()) {
                        pdSentence = item;
                        i11 = length2;
                        pdWord = pdWord2;
                    }
                    i12 = 0;
                }
                if (l.D(new Integer[]{5, 4}, Integer.valueOf(cf.x.n().keyLanguage))) {
                    listL = o.L("'", "-", "(", "{", "¿", "¡");
                    String word3 = pdWord2.getWord();
                    pdSentence = item;
                    m.e(word3, "getWord(...)");
                    i11 = length2;
                    pdWord = pdWord2;
                    strSubstring = word3.substring(pdWord2.getWord().length() - 1, pdWord2.getWord().length());
                    m.e(strSubstring, "substring(...)");
                    if (!listL.contains(strSubstring)) {
                        if (i17 < pdSentence.getWords().size()) {
                            word = pdSentence.getWords().get(i17).getWord();
                            m.e(word, "getWord(...)");
                            if (oz.x.s0(word, "-", false)) {
                            }
                        }
                        Context mContext3 = this.mContext;
                        m.e(mContext3, "mContext");
                        fZ = j3.Z(6, mContext3);
                    }
                    i12 = 0;
                } else {
                    pdSentence = item;
                    i11 = length2;
                    pdWord = pdWord2;
                    Context mContext4 = this.mContext;
                    m.e(mContext4, "mContext");
                    fZ = j3.Z(6, mContext4);
                }
                i12 = (int) fZ;
            }
            ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = i12;
            viewInflate.setLayoutParams(layoutParams);
            viewInflate.setTag(R.id.tag_start_pos, Float.valueOf(length));
            if (i13 == pdSentence.getWords().size() - 1 && pdWord.getFlag() == -1) {
                Object obj2 = arrayList.get(arrayList.size() - 1);
                m.e(obj2, "get(...)");
                View view2 = (View) obj2;
                Object tag = view2.getTag(R.id.tag_word);
                if (tag != null && (tag instanceof PdWord)) {
                    viewInflate.setTag(R.id.tag_start_pos, view2.getTag(R.id.tag_start_pos));
                }
            }
            this.f21635j.add(viewInflate);
            flexboxLayout.addView(viewInflate);
            z12 = z13;
            i13 = i15;
            sb2 = sb3;
            item = pdSentence;
            it2 = it3;
            i14 = i11;
            r9 = 0;
        }
        if (this.f21638n) {
            if (helper.getAdapterPosition() <= this.f21626a) {
                z11 = false;
                helper.itemView.setVisibility(0);
            } else {
                z11 = false;
                helper.itemView.setVisibility(8);
            }
            if (helper.getAdapterPosition() == getData().size() - 1) {
                this.f21638n = z11;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0179  */
    public final void d(View itemView, ImageView imageView, PdSentence item, boolean z11) {
        long j11;
        Drawable background;
        m.f(itemView, "itemView");
        m.f(item, "item");
        itemView.setVisibility(0);
        ImageView imageView2 = this.f21631f;
        if (imageView2 != null && (background = imageView2.getBackground()) != null && (background instanceof AnimationDrawable)) {
            AnimationDrawable animationDrawable = (AnimationDrawable) background;
            animationDrawable.selectDrawable(0);
            animationDrawable.stop();
        }
        this.f21631f = imageView;
        Drawable background2 = imageView.getBackground();
        m.e(background2, "getBackground(...)");
        if (background2 instanceof AnimationDrawable) {
            ((AnimationDrawable) background2).start();
        }
        Iterator it = this.f21635j.iterator();
        m.e(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            m.e(next, "next(...)");
            e((View) next);
        }
        Iterator it2 = this.f21636k.iterator();
        m.e(it2, "iterator(...)");
        while (it2.hasNext()) {
            Object next2 = it2.next();
            m.e(next2, "next(...)");
            View view = (View) next2;
            ((ConstraintLayout) view.findViewById(R.id.const_main)).setEnabled(true);
            ((ImageView) view.findViewById(R.id.iv_top)).setEnabled(true);
        }
        ((ConstraintLayout) itemView.findViewById(R.id.const_main)).setEnabled(false);
        ((ImageView) itemView.findViewById(R.id.iv_top)).setEnabled(false);
        d dVar = this.f21633h;
        if (dVar != null) {
            c0 c0Var = (c0) dVar.f32187b;
            if (z11) {
                c0Var.z();
            }
            PdLesson pdLesson = c0Var.O;
            if (pdLesson == null) {
                m.n("pdLesson");
                throw null;
            }
            c0Var.Y = pdLesson.getSentences().indexOf(item);
            PopupWindow popupWindow = c0Var.X;
            if (popupWindow != null) {
                popupWindow.dismiss();
            }
            ta.a aVar = c0Var.f36400f;
            m.c(aVar);
            MaterialButton materialButton = ((i4) aVar).f32704b;
            PdLesson pdLesson2 = c0Var.O;
            if (pdLesson2 == null) {
                m.n("pdLesson");
                throw null;
            }
            int iIndexOf = pdLesson2.getSentences().indexOf(item);
            PdLesson pdLesson3 = c0Var.O;
            if (pdLesson3 == null) {
                m.n("pdLesson");
                throw null;
            }
            if (iIndexOf == pdLesson3.getSentences().size() - 1) {
                materialButton.setVisibility(8);
                ta.a aVar2 = c0Var.f36400f;
                m.c(aVar2);
                ((i4) aVar2).f32715n.setVisibility(0);
                ta.a aVar3 = c0Var.f36400f;
                m.c(aVar3);
                z.b(((i4) aVar3).f32705c, new v(c0Var, 11));
            } else {
                materialButton.setEnabled(false);
            }
            int height = itemView.getHeight() + ((int) itemView.getY());
            ta.a aVar4 = c0Var.f36400f;
            m.c(aVar4);
            float height2 = height - ((i4) aVar4).f32717p.getHeight();
            Context contextRequireContext = c0Var.requireContext();
            m.e(contextRequireContext, "requireContext(...)");
            int iZ = (int) (j3.Z(162, contextRequireContext) + height2);
            ta.a aVar5 = c0Var.f36400f;
            m.c(aVar5);
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(((i4) aVar5).f32717p.getScrollY(), iZ);
            valueAnimatorOfInt.addUpdateListener(new a0(c0Var, 0));
            ta.a aVar6 = c0Var.f36400f;
            m.c(aVar6);
            if (((i4) aVar6).f32717p.getScrollY() != 0 || iZ > 0) {
                ta.a aVar7 = c0Var.f36400f;
                m.c(aVar7);
                if (((i4) aVar7).f32717p.getScrollY() == iZ) {
                    j11 = 0;
                } else {
                    j11 = 200;
                }
            } else {
                j11 = 0;
            }
            valueAnimatorOfInt.setDuration(j11);
            valueAnimatorOfInt.start();
            th.j.a(qx.h.m(j11, TimeUnit.MILLISECONDS, e.f38937b).g(px.b.a()).h(new ob.m(c0Var, item, itemView, 12), vx.b.f54316e), c0Var.f36401t);
        }
    }

    public final void e(View view) {
        TextView textView = (TextView) view.findViewById(R.id.tv_top);
        TextView textView2 = (TextView) view.findViewById(R.id.tv_middle);
        TextView textView3 = (TextView) view.findViewById(R.id.tv_bottom);
        View viewFindViewById = view.findViewById(R.id.view_line);
        View viewFindViewById2 = view.findViewById(R.id.view_point);
        Resources resources = this.mContext.getResources();
        ThreadLocal threadLocal = j.f47447a;
        textView.setTextColor(resources.getColor(R.color.second_black, null));
        textView2.setTextColor(this.mContext.getResources().getColor(R.color.second_black, null));
        textView3.setTextColor(this.mContext.getResources().getColor(R.color.second_black, null));
        viewFindViewById2.setVisibility(4);
        Object tag = view.getTag();
        m.d(tag, "null cannot be cast to non-null type com.lingo.lingoskill.object.PdWord");
        if (((PdWord) tag).getFlag() == -1) {
            viewFindViewById.setVisibility(8);
        } else {
            viewFindViewById.setVisibility(0);
        }
    }
}
