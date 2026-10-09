package com.lingo.fluent.ui.base.adapter;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.LinearLayoutManager;
import bq.r;
import bq.z;
import bt.g7;
import cf.x;
import ci.h0;
import ci.m0;
import com.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.google.android.flexbox.FlexboxLayout;
import com.lingo.fluent.widget.WaveView;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.object.PdSentence;
import com.lingo.lingoskill.object.PdWord;
import com.lingodeer.R;
import com.tbruyelle.rxpermissions3.RxPermissions;
import com.yalantis.ucrop.view.CropImageView;
import ep.a;
import fr.j3;
import fr.o0;
import fu.j0;
import gr.s;
import hd.d;
import java.io.File;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import l.m;
import n9.q;
import ns.o;
import qx.h;
import ry.l;
import th.e;
import th.g;
import th.j;
import vx.b;
import xq.c;
import xx.f;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class PdLearnSpeakAdapter extends BaseMultiItemQuickAdapter<PdSentence, BaseViewHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f21639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f21640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinearLayoutManager f21641c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ImageView f21642d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final NestedScrollView f21643e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e f21644f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final g f21645g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f21646h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AtomicBoolean f21647i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public AtomicBoolean f21648j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ConstraintLayout f21649k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public f f21650l;
    public final LinkedHashSet m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public d f21651n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PdLearnSpeakAdapter(List list, q dispose, m activity, LinearLayoutManager linearLayoutManager, ImageView imageView, NestedScrollView nestedScrollView) {
        super(list);
        kotlin.jvm.internal.m.f(dispose, "dispose");
        kotlin.jvm.internal.m.f(activity, "activity");
        this.f21639a = dispose;
        this.f21640b = activity;
        this.f21641c = linearLayoutManager;
        this.f21642d = imageView;
        this.f21643e = nestedScrollView;
        this.f21647i = new AtomicBoolean(true);
        this.f21648j = new AtomicBoolean(true);
        this.m = new LinkedHashSet();
        addItemType(PdSentence.MALE, R.layout.item_pd_speak_adapter_left);
        addItemType(PdSentence.FEMALE, R.layout.item_pd_speak_adapter_right);
        this.f21644f = new e(activity);
        this.f21645g = new g();
        j(false);
        z.b(imageView, new s(this, 11));
    }

    public static void a(PdLearnSpeakAdapter pdLearnSpeakAdapter, WaveView waveView, ImageView imageView, String str, ImageView imageView2, PdSentence pdSentence, View it) {
        kotlin.jvm.internal.m.f(it, "it");
        pdLearnSpeakAdapter.j(false);
        LinkedHashSet linkedHashSet = pdLearnSpeakAdapter.m;
        if (pdLearnSpeakAdapter.f21648j.get()) {
            ob.m mVar = new ob.m(pdLearnSpeakAdapter, waveView, str, 13);
            RxPermissions rxPermissions = new RxPermissions(pdLearnSpeakAdapter.f21640b);
            Context mContext = pdLearnSpeakAdapter.mContext;
            kotlin.jvm.internal.m.e(mContext, "mContext");
            rxPermissions.setLogging(true);
            if (rxPermissions.isGranted("android.permission.RECORD_AUDIO") && rxPermissions.isGranted("android.permission.RECORD_AUDIO")) {
                mVar.m();
                return;
            } else {
                rxPermissions.request("android.permission.RECORD_AUDIO").h(new c(mVar, mContext, rxPermissions, 17), b.f54316e);
                return;
            }
        }
        waveView.stopImmediately();
        pdLearnSpeakAdapter.f21645g.f52420a = false;
        Drawable drawable = imageView.getDrawable();
        kotlin.jvm.internal.m.e(drawable, "getDrawable(...)");
        if (drawable instanceof AnimationDrawable) {
            AnimationDrawable animationDrawable = (AnimationDrawable) drawable;
            animationDrawable.selectDrawable(0);
            animationDrawable.stop();
        }
        boolean zD = com.google.android.material.datepicker.d.D(str);
        if (zD) {
            imageView2.setImageResource(R.drawable.ic_pd_learn_speak_play_recorder_ls);
        } else {
            imageView2.setImageResource(R.drawable.ic_pd_learn_speak_play_recorder_grey);
        }
        if (zD && !linkedHashSet.contains(pdSentence.getSentenceId())) {
            Long sentenceId = pdSentence.getSentenceId();
            kotlin.jvm.internal.m.e(sentenceId, "getSentenceId(...)");
            linkedHashSet.add(sentenceId);
            pdLearnSpeakAdapter.f();
        }
        pdLearnSpeakAdapter.i(imageView2, str);
        pdLearnSpeakAdapter.f21648j = new AtomicBoolean(true);
    }

    public static void b(PdLearnSpeakAdapter pdLearnSpeakAdapter, ConstraintLayout constraintLayout, LinearLayout linearLayout, FlexboxLayout flexboxLayout, PdSentence pdSentence, BaseViewHolder baseViewHolder, View it) {
        ImageView imageView;
        LinearLayout linearLayout2;
        kotlin.jvm.internal.m.f(it, "it");
        if (kotlin.jvm.internal.m.a(pdLearnSpeakAdapter.f21649k, constraintLayout)) {
            return;
        }
        int adapterPosition = baseViewHolder.getAdapterPosition();
        LinkedHashSet linkedHashSet = pdLearnSpeakAdapter.m;
        pdLearnSpeakAdapter.f21646h = adapterPosition;
        pdLearnSpeakAdapter.f21648j = new AtomicBoolean(true);
        pdLearnSpeakAdapter.f21644f.n();
        int i11 = 0;
        pdLearnSpeakAdapter.f21645g.f52420a = false;
        ConstraintLayout constraintLayout2 = pdLearnSpeakAdapter.f21649k;
        if (constraintLayout2 != null) {
            Context mContext = pdLearnSpeakAdapter.mContext;
            kotlin.jvm.internal.m.e(mContext, "mContext");
            constraintLayout2.setBackgroundColor(mContext.getColor(R.color.color_F6F6F6));
        }
        ConstraintLayout constraintLayout3 = pdLearnSpeakAdapter.f21649k;
        if (constraintLayout3 != null && (linearLayout2 = (LinearLayout) constraintLayout3.findViewById(R.id.ll_control)) != null) {
            linearLayout2.setVisibility(8);
        }
        ConstraintLayout constraintLayout4 = pdLearnSpeakAdapter.f21649k;
        if (constraintLayout4 != null && (imageView = (ImageView) constraintLayout4.findViewById(R.id.iv_role)) != null) {
            imageView.setVisibility(8);
        }
        ConstraintLayout constraintLayout5 = pdLearnSpeakAdapter.f21649k;
        Object tag = constraintLayout5 != null ? constraintLayout5.getTag() : null;
        int i12 = R.id.tv_top;
        if (tag != null) {
            ConstraintLayout constraintLayout6 = pdLearnSpeakAdapter.f21649k;
            Object tag2 = constraintLayout6 != null ? constraintLayout6.getTag() : null;
            kotlin.jvm.internal.m.d(tag2, "null cannot be cast to non-null type com.lingo.lingoskill.object.PdSentence");
            PdSentence pdSentence2 = (PdSentence) tag2;
            ConstraintLayout constraintLayout7 = pdLearnSpeakAdapter.f21649k;
            FlexboxLayout flexboxLayout2 = constraintLayout7 != null ? (FlexboxLayout) constraintLayout7.findViewById(R.id.flex_sentence) : null;
            if (flexboxLayout2 != null) {
                if (pdSentence2.getItemType() == PdSentence.MALE) {
                    flexboxLayout2.setJustifyContent(2);
                } else {
                    flexboxLayout2.setJustifyContent(2);
                }
                int childCount = flexboxLayout2.getChildCount();
                int i13 = 0;
                while (i13 < childCount) {
                    a.z(pdLearnSpeakAdapter.mContext, "mContext", R.color.second_black, (TextView) flexboxLayout2.getChildAt(i13).findViewById(i12));
                    a.z(pdLearnSpeakAdapter.mContext, "mContext", R.color.second_black, (TextView) flexboxLayout2.getChildAt(i13).findViewById(R.id.tv_middle));
                    TextView textView = (TextView) flexboxLayout2.getChildAt(i13).findViewById(R.id.tv_bottom);
                    Context mContext2 = pdLearnSpeakAdapter.mContext;
                    kotlin.jvm.internal.m.e(mContext2, "mContext");
                    textView.setTextColor(mContext2.getColor(R.color.second_black));
                    i13++;
                    i12 = R.id.tv_top;
                }
            }
        }
        linearLayout.setVisibility(0);
        pdLearnSpeakAdapter.f21649k = constraintLayout;
        Context mContext3 = pdLearnSpeakAdapter.mContext;
        kotlin.jvm.internal.m.e(mContext3, "mContext");
        constraintLayout.setBackgroundColor(mContext3.getColor(R.color.white));
        flexboxLayout.setJustifyContent(2);
        int childCount2 = flexboxLayout.getChildCount();
        for (int i14 = 0; i14 < childCount2; i14++) {
            a.z(pdLearnSpeakAdapter.mContext, "mContext", R.color.second_black, (TextView) flexboxLayout.getChildAt(i14).findViewById(R.id.tv_top));
            a.z(pdLearnSpeakAdapter.mContext, "mContext", R.color.primary_black, (TextView) flexboxLayout.getChildAt(i14).findViewById(R.id.tv_middle));
            TextView textView2 = (TextView) flexboxLayout.getChildAt(i14).findViewById(R.id.tv_bottom);
            Context mContext4 = pdLearnSpeakAdapter.mContext;
            kotlin.jvm.internal.m.e(mContext4, "mContext");
            textView2.setTextColor(mContext4.getColor(R.color.second_black));
        }
        ImageView imageView2 = (ImageView) linearLayout.findViewById(R.id.img_normal_play);
        ImageView imageView3 = (ImageView) linearLayout.findViewById(R.id.img_record);
        ImageView imageView4 = (ImageView) linearLayout.findViewById(R.id.iv_play_recorder);
        ConstraintLayout constraintLayout8 = pdLearnSpeakAdapter.f21649k;
        ImageView imageView5 = constraintLayout8 != null ? (ImageView) constraintLayout8.findViewById(R.id.iv_role) : null;
        WaveView waveView = (WaveView) linearLayout.findViewById(R.id.wave_view);
        if (imageView5 != null) {
            imageView5.setVisibility(8);
        }
        Drawable drawable = imageView2.getDrawable();
        kotlin.jvm.internal.m.e(drawable, "getDrawable(...)");
        if (drawable instanceof AnimationDrawable) {
            AnimationDrawable animationDrawable = (AnimationDrawable) drawable;
            animationDrawable.selectDrawable(0);
            animationDrawable.stop();
        }
        Drawable drawable2 = imageView3.getDrawable();
        kotlin.jvm.internal.m.e(drawable2, "getDrawable(...)");
        if (drawable2 instanceof AnimationDrawable) {
            AnimationDrawable animationDrawable2 = (AnimationDrawable) drawable2;
            animationDrawable2.selectDrawable(0);
            animationDrawable2.stop();
        }
        Drawable drawable3 = imageView4.getDrawable();
        kotlin.jvm.internal.m.e(drawable3, "getDrawable(...)");
        if (drawable3 instanceof AnimationDrawable) {
            AnimationDrawable animationDrawable3 = (AnimationDrawable) drawable3;
            animationDrawable3.selectDrawable(0);
            animationDrawable3.stop();
        }
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        String str = x.n().tempDir;
        int[] iArr = r.f4959a;
        String str2 = str + bq.m.r(x.n().keyLanguage) + "_recording_" + pdSentence.getSentenceId() + ".pcm";
        boolean zD = com.google.android.material.datepicker.d.D(str2);
        if (zD) {
            imageView4.setImageResource(R.drawable.ic_pd_learn_speak_play_recorder_ls);
        } else {
            imageView4.setImageResource(R.drawable.ic_pd_learn_speak_play_recorder_grey);
        }
        if (zD && !linkedHashSet.contains(pdSentence.getSentenceId())) {
            Long sentenceId = pdSentence.getSentenceId();
            kotlin.jvm.internal.m.e(sentenceId, "getSentenceId(...)");
            linkedHashSet.add(sentenceId);
            pdLearnSpeakAdapter.f();
        }
        z.b(imageView4, new j0(str2, pdLearnSpeakAdapter, imageView4, 7));
        ImageView[] imageViewArr = {imageView2, imageView3, imageView4};
        long j11 = 0;
        while (true) {
            int i15 = 4;
            if (i11 >= 3) {
                z.b(imageView2, new j0(pdLearnSpeakAdapter, imageView2, pdSentence, 8));
                z.b(imageView3, new g7(pdLearnSpeakAdapter, waveView, imageView3, str2, imageView4, pdSentence, 5));
                imageView2.performClick();
                constraintLayout.postDelayed(new b2.c(i15, constraintLayout, new fp.f(12, pdLearnSpeakAdapter, constraintLayout)), 0L);
                return;
            }
            ImageView imageView6 = imageViewArr[i11];
            imageView6.setScaleX(CropImageView.DEFAULT_ASPECT_RATIO);
            imageView6.setScaleY(CropImageView.DEFAULT_ASPECT_RATIO);
            imageView6.setVisibility(4);
            j.a(h.m(j11, TimeUnit.MILLISECONDS, ky.e.f38937b).g(px.b.a()).h(new h0(imageView6), b.f54316e), pdLearnSpeakAdapter.f21639a);
            j11 += 100;
            i11++;
        }
    }

    public static final void d(PdLearnSpeakAdapter pdLearnSpeakAdapter, WaveView waveView) {
        waveView.setDuration(2500L);
        Context mContext = pdLearnSpeakAdapter.mContext;
        kotlin.jvm.internal.m.e(mContext, "mContext");
        waveView.setInitialRadius(j3.Z(24, mContext));
        waveView.setStyle(Paint.Style.FILL);
        waveView.setSpeed(500);
        Context mContext2 = pdLearnSpeakAdapter.mContext;
        kotlin.jvm.internal.m.e(mContext2, "mContext");
        waveView.setColor(mContext2.getColor(R.color.color_primary));
        Context mContext3 = pdLearnSpeakAdapter.mContext;
        kotlin.jvm.internal.m.e(mContext3, "mContext");
        waveView.setMaxRadius(j3.Z(35, mContext3));
        waveView.setInterpolator(new AccelerateDecelerateInterpolator());
        waveView.start();
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0107  */
    /* JADX WARN: Code duplicated, block: B:33:0x018f  */
    /* JADX WARN: Code duplicated, block: B:36:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:38:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:43:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:8:0x008b  */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void convert(BaseViewHolder helper, Object obj) {
        List<PdWord> list;
        int i11;
        char c11;
        float fZ;
        List listL;
        String strSubstring;
        String word;
        PdSentence item = (PdSentence) obj;
        kotlin.jvm.internal.m.f(helper, "helper");
        kotlin.jvm.internal.m.f(item, "item");
        FlexboxLayout flexboxLayout = (FlexboxLayout) helper.getView(R.id.flex_sentence);
        LinearLayout linearLayout = (LinearLayout) helper.getView(R.id.ll_control);
        ConstraintLayout constraintLayout = (ConstraintLayout) helper.getView(R.id.item_view);
        ImageView imageView = (ImageView) helper.getView(R.id.iv_role);
        ((TextView) helper.getView(R.id.tv_trans)).setText(item.getTranslation());
        constraintLayout.setTag(item);
        Context context = this.mContext;
        List<PdWord> words = item.getWords();
        kotlin.jvm.internal.m.c(context);
        kotlin.jvm.internal.m.c(words);
        kotlin.jvm.internal.m.c(flexboxLayout);
        ih.d dVar = new ih.d();
        dVar.f52411g = 8;
        dVar.f52405a = context;
        dVar.f52406b = words;
        dVar.f52407c = flexboxLayout;
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        boolean z11 = false;
        if (x.n().keyLanguage == 0 && ((o0) xt.b.c()).t() == 2) {
            dVar.f52411g = 4;
        } else {
            int[] iArr = r.f4959a;
            if (bq.m.F()) {
                dVar.f52411g = 0;
            } else {
                dVar.f52411g = 4;
            }
        }
        Context mContext = this.mContext;
        kotlin.jvm.internal.m.e(mContext, "mContext");
        int color = mContext.getColor(R.color.second_black);
        Context mContext2 = this.mContext;
        kotlin.jvm.internal.m.e(mContext2, "mContext");
        int color2 = mContext2.getColor(R.color.second_black);
        Context mContext3 = this.mContext;
        kotlin.jvm.internal.m.e(mContext3, "mContext");
        int color3 = mContext3.getColor(R.color.second_black);
        dVar.f52408d = color;
        dVar.f52409e = color2;
        dVar.f52410f = color3;
        boolean z12 = true;
        dVar.f52412h = true;
        flexboxLayout.removeAllViews();
        int size = words.size();
        int i12 = 0;
        while (true) {
            boolean z13 = z12;
            if (i12 >= size) {
                break;
            }
            PdWord pdWord = words.get(i12);
            View viewInflate = LayoutInflater.from(dVar.f52405a).inflate(R.layout.item_word_framlayout, flexboxLayout, z11);
            kotlin.jvm.internal.m.d(viewInflate, "null cannot be cast to non-null type android.widget.FrameLayout");
            View view = (FrameLayout) viewInflate;
            Context context2 = dVar.f52405a;
            List list2 = dVar.f52406b;
            FlexboxLayout.LayoutParams layoutParams = new FlexboxLayout.LayoutParams(-2, -2);
            i12++;
            ConstraintLayout constraintLayout2 = constraintLayout;
            PdSentence pdSentence = item;
            if ((pdWord.getFlag() != -1 || kotlin.jvm.internal.m.a(pdWord.getShowWord(), "_____")) && i12 < list2.size() && ((PdWord) list2.get(i12)).getFlag() == -1 && !o.L(" ", "_____").contains(((PdWord) list2.get(i12)).getShowWord())) {
                LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
                if (x.n().keyLanguage == 5 && o.L(":", ";", "?", "!", "(", "{", "«", "»", "/").contains(((PdWord) list2.get(i12)).getWord())) {
                    LingoSkillApplication lingoSkillApplication3 = LingoSkillApplication.f21665b;
                    if (l.D(new Integer[]{5, 4}, Integer.valueOf(x.n().keyLanguage))) {
                        listL = o.L("'", "-", "(", "{", "¿", "¡");
                        String word2 = pdWord.getWord();
                        kotlin.jvm.internal.m.e(word2, "getWord(...)");
                        list = words;
                        strSubstring = word2.substring(pdWord.getWord().length() - 1, pdWord.getWord().length());
                        kotlin.jvm.internal.m.e(strSubstring, "substring(...)");
                        if (!listL.contains(strSubstring)) {
                            if (i12 < list2.size()) {
                                word = ((PdWord) list2.get(i12)).getWord();
                                kotlin.jvm.internal.m.e(word, "getWord(...)");
                                if (oz.x.s0(word, "-", false)) {
                                }
                            }
                            fZ = j3.Z(Integer.valueOf(dVar.f52411g), context2);
                        }
                    } else {
                        list = words;
                        fZ = j3.Z(Integer.valueOf(dVar.f52411g), context2);
                    }
                    i11 = (int) fZ;
                } else {
                    list = words;
                }
                i11 = 0;
            } else {
                LingoSkillApplication lingoSkillApplication4 = LingoSkillApplication.f21665b;
                if (l.D(new Integer[]{5, 4}, Integer.valueOf(x.n().keyLanguage))) {
                    listL = o.L("'", "-", "(", "{", "¿", "¡");
                    String word3 = pdWord.getWord();
                    kotlin.jvm.internal.m.e(word3, "getWord(...)");
                    list = words;
                    strSubstring = word3.substring(pdWord.getWord().length() - 1, pdWord.getWord().length());
                    kotlin.jvm.internal.m.e(strSubstring, "substring(...)");
                    if (!listL.contains(strSubstring)) {
                        if (i12 < list2.size()) {
                            word = ((PdWord) list2.get(i12)).getWord();
                            kotlin.jvm.internal.m.e(word, "getWord(...)");
                            if (oz.x.s0(word, "-", false)) {
                            }
                        }
                        fZ = j3.Z(Integer.valueOf(dVar.f52411g), context2);
                    }
                    i11 = 0;
                } else {
                    list = words;
                    fZ = j3.Z(Integer.valueOf(dVar.f52411g), context2);
                }
                i11 = (int) fZ;
            }
            ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = i11;
            view.setLayoutParams(layoutParams);
            TextView textView = (TextView) view.findViewById(R.id.tv_top);
            TextView textView2 = (TextView) view.findViewById(R.id.tv_middle);
            TextView textView3 = (TextView) view.findViewById(R.id.tv_bottom);
            textView3.setVisibility(8);
            textView.setVisibility(8);
            int i13 = dVar.f52408d;
            if (i13 != 0) {
                textView.setTextColor(i13);
            } else {
                textView.setTextColor(j3.G(context2, R.color.second_black));
            }
            int i14 = dVar.f52409e;
            if (i14 != 0) {
                textView2.setTextColor(i14);
            } else {
                textView2.setTextColor(j3.G(context2, R.color.primary_black));
            }
            int i15 = dVar.f52410f;
            if (i15 != 0) {
                textView3.setTextColor(i15);
                c11 = 1158;
            } else {
                c11 = 1158;
                textView3.setTextColor(j3.G(context2, R.color.second_black));
            }
            kotlin.jvm.internal.m.c(textView2);
            th.h.b(pdWord, textView, textView2, textView3, 496);
            textView2.getText().toString();
            view.setTag(pdWord);
            flexboxLayout.addView(view);
            z12 = z13;
            constraintLayout = constraintLayout2;
            words = list;
            item = pdSentence;
            z11 = false;
        }
        ConstraintLayout constraintLayout3 = constraintLayout;
        PdSentence pdSentence2 = item;
        FlexboxLayout flexboxLayout2 = dVar.f52407c;
        int childCount = flexboxLayout2.getChildCount();
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = flexboxLayout2.getChildAt(i16);
            kotlin.jvm.internal.m.d(childAt, "null cannot be cast to non-null type android.widget.FrameLayout");
            FrameLayout frameLayout = (FrameLayout) childAt;
            Object tag = frameLayout.getTag();
            kotlin.jvm.internal.m.d(tag, "null cannot be cast to non-null type com.lingo.lingoskill.object.PdWord");
            PdWord pdWord2 = (PdWord) tag;
            if (dVar.f52412h) {
                frameLayout.setClickable(false);
            } else if (pdWord2.getFlag() != -1) {
                z.b(frameLayout, new s0.a(7, dVar, pdWord2));
            }
        }
        linearLayout.setVisibility(8);
        imageView.setVisibility(8);
        z.b(constraintLayout3, new g7(this, constraintLayout3, linearLayout, flexboxLayout, pdSentence2, helper, 4));
    }

    public final void e() {
        LinkedHashSet linkedHashSet = this.m;
        linkedHashSet.clear();
        Collection<PdSentence> mData = this.mData;
        kotlin.jvm.internal.m.e(mData, "mData");
        for (PdSentence pdSentence : mData) {
            LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
            String str = x.n().tempDir;
            int[] iArr = r.f4959a;
            if (com.google.android.material.datepicker.d.D(str + bq.m.r(x.n().keyLanguage) + "_recording_" + pdSentence.getSentenceId() + ".pcm")) {
                Long sentenceId = pdSentence.getSentenceId();
                kotlin.jvm.internal.m.e(sentenceId, "getSentenceId(...)");
                linkedHashSet.add(sentenceId);
            }
        }
        f();
    }

    public final void f() {
        Button button;
        boolean z11 = this.m.size() >= this.mData.size();
        d dVar = this.f21651n;
        if (dVar == null || (button = ((hh.o0) dVar.f32187b).R) == null) {
            return;
        }
        button.setEnabled(z11);
    }

    public final boolean g() {
        return this.m.size() >= this.mData.size();
    }

    public final void h() {
        f fVar = this.f21650l;
        if (fVar != null) {
            ux.b.a(fVar);
        }
        e eVar = this.f21644f;
        eVar.a();
        eVar.n();
        g gVar = this.f21645g;
        gVar.f52420a = false;
        gVar.a();
        ConstraintLayout constraintLayout = this.f21649k;
        if (constraintLayout != null) {
            this.f21648j.set(true);
            Drawable drawable = ((ImageView) constraintLayout.findViewById(R.id.img_normal_play)).getDrawable();
            kotlin.jvm.internal.m.e(drawable, "getDrawable(...)");
            if (drawable instanceof AnimationDrawable) {
                AnimationDrawable animationDrawable = (AnimationDrawable) drawable;
                animationDrawable.selectDrawable(0);
                animationDrawable.stop();
            }
            Drawable drawable2 = ((ImageView) constraintLayout.findViewById(R.id.img_record)).getDrawable();
            kotlin.jvm.internal.m.e(drawable2, "getDrawable(...)");
            if (drawable2 instanceof AnimationDrawable) {
                AnimationDrawable animationDrawable2 = (AnimationDrawable) drawable2;
                animationDrawable2.selectDrawable(0);
                animationDrawable2.stop();
            }
            Drawable drawable3 = ((ImageView) constraintLayout.findViewById(R.id.iv_play_recorder)).getDrawable();
            kotlin.jvm.internal.m.e(drawable3, "getDrawable(...)");
            if (drawable3 instanceof AnimationDrawable) {
                AnimationDrawable animationDrawable3 = (AnimationDrawable) drawable3;
                animationDrawable3.selectDrawable(0);
                animationDrawable3.stop();
            }
            ((WaveView) constraintLayout.findViewById(R.id.wave_view)).stopImmediately();
        }
    }

    public final void i(ImageView imageView, String filePath) {
        h();
        Drawable drawable = imageView.getDrawable();
        kotlin.jvm.internal.m.e(drawable, "getDrawable(...)");
        if (drawable instanceof AnimationDrawable) {
            ((AnimationDrawable) drawable).start();
        }
        g gVar = this.f21645g;
        gVar.getClass();
        kotlin.jvm.internal.m.f(filePath, "filePath");
        File file = new File(filePath);
        if (file.exists()) {
            gVar.f52421b = true;
            new Thread(new pb.b(9, file, gVar)).start();
        } else {
            m0 m0Var = gVar.f52422c;
            if (m0Var != null) {
                Drawable drawable2 = m0Var.f7145b.getDrawable();
                kotlin.jvm.internal.m.e(drawable2, "getDrawable(...)");
                if (drawable2 instanceof AnimationDrawable) {
                    AnimationDrawable animationDrawable = (AnimationDrawable) drawable2;
                    animationDrawable.selectDrawable(0);
                    animationDrawable.stop();
                }
            }
        }
        gVar.f52422c = new m0(imageView, 1);
    }

    public final void j(boolean z11) {
        ImageView imageView = this.f21642d;
        AtomicBoolean atomicBoolean = this.f21647i;
        if (!z11) {
            atomicBoolean.set(false);
            imageView.setImageResource(R.drawable.pd_learn_auto_play_play);
            f fVar = this.f21650l;
            if (fVar != null) {
                ux.b.a(fVar);
                return;
            }
            return;
        }
        atomicBoolean.set(true);
        imageView.setImageResource(R.drawable.pd_learn_auto_play_pause);
        if (this.f21644f.f()) {
            return;
        }
        int i11 = this.f21646h + 1;
        this.f21646h = i11;
        if (i11 >= getData().size()) {
            this.f21646h = 0;
        }
        View childAt = this.f21641c.getChildAt(this.f21646h);
        if (childAt != null) {
            childAt.performClick();
        }
    }
}
