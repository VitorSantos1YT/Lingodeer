package com.lingo.lingoskill.speak.adapter;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import av.j0;
import bq.r;
import bq.z;
import bt.g7;
import bt.s5;
import cf.x;
import cj.c;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.google.android.flexbox.FlexboxLayout;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.chineseskill.ui.pinyin.widget.WaveView;
import com.lingo.lingoskill.speak.object.PodSentence;
import com.lingodeer.R;
import com.lingodeer.data.model.SerializableTimingResult;
import com.lingodeer.data.model.WordAccuracyScoreTimingResult;
import com.yalantis.ucrop.view.CropImageView;
import ff.h;
import fp.f;
import g2.f0;
import ij.d;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.m;
import n9.q;
import ns.o;
import oo.k0;
import op.a;
import op.b;
import th.e;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class SpeakTryAdapter<T extends b, F extends a, G extends PodSentence<T, F>> extends BaseQuickAdapter<G, BaseViewHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f22014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j0 f22015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k0 f22016c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f22017d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f22018e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public rx.b f22019f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f22020g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ValueAnimator f22021h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f22022i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public d f22023j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final AtomicBoolean f22024k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public q f22025l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpeakTryAdapter(List list, e mPlayer, j0 mRecorder, k0 k0Var, int i11) {
        super(R.layout.item_speak_try, list);
        m.f(mPlayer, "mPlayer");
        m.f(mRecorder, "mRecorder");
        this.f22014a = mPlayer;
        this.f22015b = mRecorder;
        this.f22016c = k0Var;
        this.f22017d = i11;
        this.f22020g = true;
        this.f22024k = new AtomicBoolean(false);
    }

    public static boolean c(FrameLayout frameLayout, String str) {
        if (com.google.android.material.datepicker.d.D(str)) {
            frameLayout.setClickable(true);
            frameLayout.setBackgroundResource(R.drawable.bg_speak_btn_enable);
        } else {
            frameLayout.setClickable(false);
            frameLayout.setBackgroundResource(R.drawable.point_grey);
        }
        return com.google.android.material.datepicker.d.D(str);
    }

    public final void b(FlexboxLayout flexboxLayout, PodSentence podSentence) {
        Double dValueOf;
        int color;
        int color2;
        List<T> words = podSentence.getWords();
        m.e(words, "getWords(...)");
        int i11 = 0;
        int i12 = 0;
        for (Object obj : words) {
            int i13 = i11 + 1;
            if (i11 < 0) {
                o.V();
                throw null;
            }
            b bVar = (b) obj;
            if (i11 < flexboxLayout.getChildCount()) {
                try {
                    if (bVar.getWordType() != 1) {
                        int i14 = i11 - i12;
                        if (i14 < podSentence.getWordScores().size()) {
                            SerializableTimingResult timingResult = podSentence.getWordScores().get(i14).getTimingResult();
                            dValueOf = timingResult != null ? Double.valueOf(timingResult.getAccuracyScore()) : null;
                            if (dValueOf != null) {
                                color2 = f0.E(s5.i(dValueOf.doubleValue()));
                            } else {
                                Context mContext = this.mContext;
                                m.e(mContext, "mContext");
                                color2 = mContext.getColor(R.color.primary_black);
                            }
                            View childAt = flexboxLayout.getChildAt(i11);
                            ((TextView) childAt.findViewById(R.id.tv_top)).setTextColor(color2);
                            ((TextView) childAt.findViewById(R.id.tv_middle)).setTextColor(color2);
                            ((TextView) childAt.findViewById(R.id.tv_bottom)).setTextColor(color2);
                        }
                    } else {
                        int i15 = (i11 - i12) - 1;
                        if (i15 >= 0 && i15 < podSentence.getWordScores().size()) {
                            SerializableTimingResult timingResult2 = podSentence.getWordScores().get(i15).getTimingResult();
                            dValueOf = timingResult2 != null ? Double.valueOf(timingResult2.getAccuracyScore()) : null;
                            if (dValueOf != null) {
                                color = f0.E(s5.i(dValueOf.doubleValue()));
                            } else {
                                Context mContext2 = this.mContext;
                                m.e(mContext2, "mContext");
                                color = mContext2.getColor(R.color.primary_black);
                            }
                            View childAt2 = flexboxLayout.getChildAt(i11);
                            ((TextView) childAt2.findViewById(R.id.tv_top)).setTextColor(color);
                            ((TextView) childAt2.findViewById(R.id.tv_middle)).setTextColor(color);
                            ((TextView) childAt2.findViewById(R.id.tv_bottom)).setTextColor(color);
                        }
                        i12++;
                    }
                } catch (Exception e8) {
                    e8.getMessage();
                }
            }
            i11 = i13;
        }
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void convert(BaseViewHolder helper, Object obj) {
        int i11;
        Double dValueOf;
        int color;
        int color2;
        PodSentence item = (PodSentence) obj;
        m.f(helper, "helper");
        m.f(item, "item");
        FlexboxLayout flexboxLayout = (FlexboxLayout) helper.getView(R.id.fl_sentence);
        m.c(flexboxLayout);
        c cVar = new c(flexboxLayout, this, this.mContext, item.getWords());
        int[] iArr = r.f4959a;
        if (bq.m.F()) {
            cVar.f59274j = 2;
        } else {
            cVar.f59274j = h.l(2.0f);
        }
        cVar.f59278o = true;
        cVar.f59277n = true;
        cVar.d();
        helper.setText(R.id.tv_trans, item.getTrans().getTrans());
        int i12 = 0;
        if (this.f22018e == helper.getAdapterPosition()) {
            View view = helper.itemView;
            Context mContext = this.mContext;
            m.e(mContext, "mContext");
            view.setBackgroundColor(mContext.getColor(R.color.white));
            helper.setGone(R.id.rl_detail, true);
            int i13 = 4;
            if (this.f22020g) {
                View itemView = helper.itemView;
                m.e(itemView, "itemView");
                itemView.postDelayed(new b2.c(i13, itemView, new f(13, helper, this)), 0L);
            }
            FrameLayout frameLayout = (FrameLayout) helper.getView(R.id.fl_play_audio);
            FrameLayout frameLayout2 = (FrameLayout) helper.getView(R.id.fl_recorder);
            FrameLayout frameLayout3 = (FrameLayout) helper.getView(R.id.fl_play_recorder);
            frameLayout.setScaleX(CropImageView.DEFAULT_ASPECT_RATIO);
            frameLayout.setScaleY(CropImageView.DEFAULT_ASPECT_RATIO);
            frameLayout2.setScaleX(CropImageView.DEFAULT_ASPECT_RATIO);
            frameLayout2.setScaleY(CropImageView.DEFAULT_ASPECT_RATIO);
            frameLayout3.setScaleX(CropImageView.DEFAULT_ASPECT_RATIO);
            frameLayout3.setScaleY(CropImageView.DEFAULT_ASPECT_RATIO);
            View itemView2 = helper.itemView;
            m.e(itemView2, "itemView");
            itemView2.postDelayed(new b2.c(i13, itemView2, new androidx.lifecycle.compose.a(frameLayout2, frameLayout, frameLayout3, 16)), 0L);
        } else {
            helper.setGone(R.id.rl_detail, false);
            View view2 = helper.itemView;
            Context mContext2 = this.mContext;
            m.e(mContext2, "mContext");
            view2.setBackgroundColor(mContext2.getColor(R.color.color_F6F6F6));
        }
        TextView textView = (TextView) helper.getView(R.id.tv_speech_score);
        List<WordAccuracyScoreTimingResult> wordScores = item.getWordScores();
        m.e(wordScores, "getWordScores(...)");
        if (wordScores.isEmpty()) {
            textView.setVisibility(8);
        } else {
            List<T> words = item.getWords();
            m.e(words, "getWords(...)");
            int i14 = 0;
            int i15 = 0;
            for (Object obj2 : words) {
                int i16 = i14 + 1;
                if (i14 < 0) {
                    o.V();
                    throw null;
                }
                b bVar = (b) obj2;
                if (i14 < flexboxLayout.getChildCount()) {
                    try {
                        if (bVar.getWordType() != 1) {
                            int i17 = i14 - i15;
                            if (i17 < item.getWordScores().size()) {
                                SerializableTimingResult timingResult = item.getWordScores().get(i17).getTimingResult();
                                dValueOf = timingResult != null ? Double.valueOf(timingResult.getAccuracyScore()) : null;
                                if (dValueOf != null) {
                                    color2 = f0.E(s5.i(dValueOf.doubleValue()));
                                } else {
                                    Context mContext3 = this.mContext;
                                    m.e(mContext3, "mContext");
                                    color2 = mContext3.getColor(R.color.primary_black);
                                }
                                View childAt = flexboxLayout.getChildAt(i14);
                                ((TextView) childAt.findViewById(R.id.tv_top)).setTextColor(color2);
                                ((TextView) childAt.findViewById(R.id.tv_middle)).setTextColor(color2);
                                ((TextView) childAt.findViewById(R.id.tv_bottom)).setTextColor(color2);
                            }
                        } else {
                            int i18 = (i14 - i15) - 1;
                            if (i18 >= 0 && i18 < item.getWordScores().size()) {
                                SerializableTimingResult timingResult2 = item.getWordScores().get(i18).getTimingResult();
                                dValueOf = timingResult2 != null ? Double.valueOf(timingResult2.getAccuracyScore()) : null;
                                if (dValueOf != null) {
                                    color = f0.E(s5.i(dValueOf.doubleValue()));
                                } else {
                                    Context mContext4 = this.mContext;
                                    m.e(mContext4, "mContext");
                                    color = mContext4.getColor(R.color.primary_black);
                                }
                                View childAt2 = flexboxLayout.getChildAt(i14);
                                ((TextView) childAt2.findViewById(R.id.tv_top)).setTextColor(color);
                                ((TextView) childAt2.findViewById(R.id.tv_middle)).setTextColor(color);
                                ((TextView) childAt2.findViewById(R.id.tv_bottom)).setTextColor(color);
                            }
                            i15++;
                        }
                    } catch (Exception e8) {
                        e8.getMessage();
                    }
                }
                i14 = i16;
                i12 = 0;
            }
            textView.setVisibility(i12);
            textView.setTextColor(f0.E(s5.i(item.getSpeechScore())));
            textView.setText(String.valueOf(item.getSpeechScore()));
        }
        View itemView3 = helper.itemView;
        m.e(itemView3, "itemView");
        FrameLayout frameLayout4 = (FrameLayout) itemView3.findViewById(R.id.fl_play_audio);
        FrameLayout frameLayout5 = (FrameLayout) itemView3.findViewById(R.id.fl_recorder);
        FrameLayout frameLayout6 = (FrameLayout) itemView3.findViewById(R.id.fl_play_recorder);
        WaveView waveView = (WaveView) itemView3.findViewById(R.id.wave_view);
        ImageView imageView = (ImageView) itemView3.findViewById(R.id.iv_play_audio);
        ImageView imageView2 = (ImageView) itemView3.findViewById(R.id.iv_play_recorder);
        View viewFindViewById = itemView3.findViewById(R.id.audio_circle);
        View viewFindViewById2 = itemView3.findViewById(R.id.play_recorder_circle);
        String strE = e(item);
        g(itemView3, strE);
        if (this.f22024k.get()) {
            frameLayout5.setBackgroundResource(R.drawable.point_accent);
            frameLayout4.setClickable(false);
            frameLayout6.setClickable(false);
        } else {
            frameLayout5.setBackgroundResource(R.drawable.bg_speak_btn_enable);
            frameLayout4.setClickable(true);
            m.c(frameLayout6);
            c(frameLayout6, strE);
        }
        m.c(frameLayout4);
        z.b(frameLayout4, new dl.d(this, itemView3, strE, frameLayout4, imageView, viewFindViewById, item, 2));
        m.c(frameLayout5);
        z.b(frameLayout5, new dl.d(this, waveView, frameLayout5, frameLayout6, strE, itemView3, item, 3));
        m.c(frameLayout6);
        z.b(frameLayout6, new g7(this, itemView3, strE, frameLayout6, imageView2, viewFindViewById2, 6));
        c(frameLayout6, strE);
        helper.setText(R.id.tv_index, (helper.getAdapterPosition() + 1) + " / " + getData().size());
        helper.itemView.setTag(item);
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        if (x.n().showStoryTrans) {
            i11 = R.id.tv_trans;
            helper.setGone(R.id.tv_trans, true);
        } else {
            i11 = R.id.tv_trans;
            helper.setGone(R.id.tv_trans, false);
        }
        w4.c.v(this.mContext, "mContext", R.color.second_black, helper, i11);
    }

    public final void d() {
        rx.b bVar = this.f22019f;
        if (bVar != null) {
            m.c(bVar);
            bVar.dispose();
        }
        ValueAnimator valueAnimator = this.f22021h;
        if (valueAnimator != null) {
            m.c(valueAnimator);
            valueAnimator.removeAllUpdateListeners();
            ValueAnimator valueAnimator2 = this.f22021h;
            m.c(valueAnimator2);
            valueAnimator2.removeAllListeners();
            ValueAnimator valueAnimator3 = this.f22021h;
            m.c(valueAnimator3);
            valueAnimator3.cancel();
        }
    }

    public abstract String e(PodSentence podSentence);

    public final void f(FlexboxLayout flexboxLayout) {
        rx.b bVar = this.f22019f;
        if (bVar != null) {
            bVar.dispose();
        }
        int childCount = flexboxLayout.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = flexboxLayout.getChildAt(i11);
            TextView textView = (TextView) childAt.findViewById(R.id.tv_top);
            TextView textView2 = (TextView) childAt.findViewById(R.id.tv_middle);
            TextView textView3 = (TextView) childAt.findViewById(R.id.tv_bottom);
            ep.a.z(this.mContext, "mContext", R.color.second_black, textView);
            ep.a.z(this.mContext, "mContext", R.color.primary_black, textView2);
            Context mContext = this.mContext;
            m.e(mContext, "mContext");
            textView3.setTextColor(mContext.getColor(R.color.second_black));
        }
    }

    public final void g(View view, String str) {
        List<WordAccuracyScoreTimingResult> wordScores;
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.fl_play_audio);
        FrameLayout frameLayout2 = (FrameLayout) view.findViewById(R.id.fl_recorder);
        FrameLayout frameLayout3 = (FrameLayout) view.findViewById(R.id.fl_play_recorder);
        WaveView waveView = (WaveView) view.findViewById(R.id.wave_view);
        ImageView imageView = (ImageView) view.findViewById(R.id.iv_play_audio);
        ImageView imageView2 = (ImageView) view.findViewById(R.id.iv_play_recorder);
        View viewFindViewById = view.findViewById(R.id.audio_circle);
        View viewFindViewById2 = view.findViewById(R.id.play_recorder_circle);
        frameLayout.setBackgroundResource(R.drawable.bg_speak_btn_enable);
        frameLayout2.setBackgroundResource(R.drawable.bg_speak_btn_enable);
        frameLayout3.setBackgroundResource(R.drawable.bg_speak_btn_enable);
        waveView.b();
        android.support.v4.media.session.a.H(imageView.getBackground());
        android.support.v4.media.session.a.H(imageView2.getBackground());
        viewFindViewById.setVisibility(8);
        viewFindViewById2.setVisibility(8);
        d dVar = this.f22023j;
        if (dVar != null) {
            dVar.d();
        }
        c(frameLayout3, str);
        rx.b bVar = this.f22019f;
        if (bVar != null) {
            bVar.dispose();
        }
        Object tag = view.getTag();
        PodSentence podSentence = tag instanceof PodSentence ? (PodSentence) tag : null;
        FlexboxLayout flexboxLayout = (FlexboxLayout) view.findViewById(R.id.fl_sentence);
        if (podSentence == null || (wordScores = podSentence.getWordScores()) == null || !(!wordScores.isEmpty())) {
            m.c(flexboxLayout);
            f(flexboxLayout);
        } else {
            m.c(flexboxLayout);
            b(flexboxLayout, podSentence);
        }
    }

    public final void h() {
        e eVar = this.f22014a;
        if (eVar.f()) {
            eVar.n();
        }
        if (!this.f22024k.get()) {
            this.f22015b.f();
        }
        rx.b bVar = this.f22019f;
        if (bVar != null) {
            m.c(bVar);
            bVar.dispose();
            this.f22019f = null;
        }
    }
}
