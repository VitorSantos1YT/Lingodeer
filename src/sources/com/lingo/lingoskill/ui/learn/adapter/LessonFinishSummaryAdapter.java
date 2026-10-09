package com.lingo.lingoskill.ui.learn.adapter;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import bq.r;
import bq.z;
import cf.x;
import com.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.chad.library.adapter.base.entity.MultiItemEntity;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.object.BaseReviewGroup;
import com.lingo.lingoskill.object.HwCharacter;
import com.lingo.lingoskill.object.LDCharacter;
import com.lingo.lingoskill.object.ReviewNew;
import com.lingo.lingoskill.object.Sentence;
import com.lingo.lingoskill.object.Word;
import com.lingodeer.R;
import fu.j0;
import fv.a;
import fv.b;
import fv.f;
import gr.s;
import ij.c;
import ij.d;
import kotlin.jvm.internal.m;
import kp.j;
import qy.q;
import ry.l;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class LessonFinishSummaryAdapter extends BaseMultiItemQuickAdapter<MultiItemEntity, BaseViewHolder> {
    public static void a(TextView textView) {
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        if (l.D(new Integer[]{2, 13}, Integer.valueOf(x.n().keyLanguage))) {
            if (x.n().koDisPlay == 1) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
            }
        }
    }

    public static void b(ReviewNew reviewNew) {
        Integer testResultInt = reviewNew.getTestResultInt();
        if (testResultInt.intValue() > -0.33f && testResultInt.intValue() > 0.33d) {
            throw null;
        }
        throw null;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void convert(BaseViewHolder helper, Object obj) {
        MultiItemEntity item = (MultiItemEntity) obj;
        m.f(helper, "helper");
        m.f(item, "item");
        int itemType = item.getItemType();
        if (itemType == -1) {
            BaseReviewGroup baseReviewGroup = (BaseReviewGroup) item;
            helper.setText(R.id.tv_count, String.valueOf(baseReviewGroup.getSubItems().size()));
            baseReviewGroup.strength = BaseReviewGroup.getUnitStrength(baseReviewGroup.getSubItems());
            if (m.a(baseReviewGroup.getUnitName(), "weak")) {
                Context mContext = this.mContext;
                m.e(mContext, "mContext");
                helper.setBackgroundColor(R.id.view_level, mContext.getColor(R.color.color_F49E6D));
                helper.setText(R.id.tv_group_name, this.mContext.getString(R.string.weak));
            } else if (m.a(baseReviewGroup.getUnitName(), "good")) {
                Context mContext2 = this.mContext;
                m.e(mContext2, "mContext");
                helper.setBackgroundColor(R.id.view_level, mContext2.getColor(R.color.color_FFC843));
                helper.setText(R.id.tv_group_name, this.mContext.getString(R.string.good));
            } else if (m.a(baseReviewGroup.getUnitName(), "perfect")) {
                Context mContext3 = this.mContext;
                m.e(mContext3, "mContext");
                helper.setBackgroundColor(R.id.view_level, mContext3.getColor(R.color.color_96C952));
                helper.setText(R.id.tv_group_name, this.mContext.getString(R.string.perfect));
            }
            View itemView = helper.itemView;
            m.e(itemView, "itemView");
            z.b(itemView, new j0(helper, baseReviewGroup, this, 16));
            return;
        }
        if (itemType == 0) {
            ReviewNew reviewNew = (ReviewNew) item;
            Word wordH = c.h(reviewNew.getId());
            if (wordH != null) {
                LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                if (l.D(new Integer[]{57, 61, 63, 65}, Integer.valueOf(x.n().keyLanguage))) {
                    helper.setText(R.id.tv_pinyin, wordH.getLuoma());
                } else {
                    helper.setText(R.id.tv_pinyin, wordH.getZhuyin());
                }
                helper.setText(R.id.tv_word, wordH.getWord());
                helper.setText(R.id.tv_trans, wordH.getTranslations());
                int[] iArr = r.f4959a;
                View view = helper.getView(R.id.tv_word);
                m.e(view, "getView(...)");
                bq.m.J((TextView) view);
                View view2 = helper.getView(R.id.tv_pinyin);
                m.e(view2, "getView(...)");
                View view3 = helper.getView(R.id.tv_word);
                m.e(view3, "getView(...)");
                a((TextView) view2);
                View view4 = helper.itemView;
                q qVar = b.f28186a;
                view4.setTag(R.id.tag_dl_entry, new a(2L, b.Z(wordH.getWordId()), b.V(wordH.getWordId())));
                View itemView2 = helper.itemView;
                m.e(itemView2, "itemView");
                z.b(itemView2, new s(this, wordH, 27));
            }
            b(reviewNew);
            throw null;
        }
        if (itemType == 1) {
            ReviewNew reviewNew2 = (ReviewNew) item;
            Sentence sentenceE = c.e(reviewNew2.getId());
            if (sentenceE != null) {
                LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
                if (l.D(new Integer[]{57, 61, 63, 65}, Integer.valueOf(x.n().keyLanguage))) {
                    helper.setText(R.id.tv_pinyin, sentenceE.genLuoma());
                } else {
                    helper.setText(R.id.tv_pinyin, sentenceE.genZhuyin());
                }
                helper.setText(R.id.tv_word, sentenceE.getSentence());
                helper.setText(R.id.tv_trans, sentenceE.getTranslations());
                int[] iArr2 = r.f4959a;
                View view5 = helper.getView(R.id.tv_word);
                m.e(view5, "getView(...)");
                bq.m.J((TextView) view5);
                View view6 = helper.getView(R.id.tv_pinyin);
                m.e(view6, "getView(...)");
                View view7 = helper.getView(R.id.tv_word);
                m.e(view7, "getView(...)");
                a((TextView) view6);
                View view8 = helper.itemView;
                q qVar2 = b.f28186a;
                view8.setTag(R.id.tag_dl_entry, new a(2L, b.H(sentenceE.getSentenceId()), b.F(sentenceE.getSentenceId())));
                View itemView3 = helper.itemView;
                m.e(itemView3, "itemView");
                z.b(itemView3, new s(this, sentenceE, 28));
            }
            b(reviewNew2);
            throw null;
        }
        if (itemType != 2) {
            return;
        }
        ReviewNew reviewNew3 = (ReviewNew) item;
        LingoSkillApplication lingoSkillApplication3 = LingoSkillApplication.f21665b;
        if (l.D(new Integer[]{51, 55, 57, 61, 63, 65}, Integer.valueOf(x.n().keyLanguage))) {
            if (d.f34419e == null) {
                synchronized (d.class) {
                    if (d.f34419e == null) {
                        LingoSkillApplication lingoSkillApplication4 = LingoSkillApplication.f21665b;
                        m.c(lingoSkillApplication4);
                        d.f34419e = new d(lingoSkillApplication4);
                    }
                }
            }
            d dVar = d.f34419e;
            m.c(dVar);
            LDCharacter lDCharacter = (LDCharacter) dVar.n().load(Long.valueOf(reviewNew3.getId()));
            if (lDCharacter != null) {
                lDCharacter.getCharacter();
                lDCharacter.getCharId();
                helper.setText(R.id.tv_pinyin, lDCharacter.getPinyin());
                helper.setText(R.id.tv_word, lDCharacter.getCharacter());
                int[] iArr3 = r.f4959a;
                View view9 = helper.getView(R.id.tv_word);
                m.e(view9, "getView(...)");
                bq.m.J((TextView) view9);
                View view10 = helper.itemView;
                q qVar3 = b.f28186a;
                String audioName = lDCharacter.getAudioName();
                m.e(audioName, "getAudioName(...)");
                String strE = b.e(audioName);
                String audioName2 = lDCharacter.getAudioName();
                m.e(audioName2, "getAudioName(...)");
                view10.setTag(R.id.tag_dl_entry, new a(1L, strE, b.a(audioName2, null, null)));
                View itemView4 = helper.itemView;
                m.e(itemView4, "itemView");
                z.b(itemView4, new s(this, lDCharacter, 29));
            } else {
                reviewNew3.getId();
            }
        } else {
            if (oi.c.f44924t == null) {
                synchronized (oi.c.class) {
                    if (oi.c.f44924t == null) {
                        LingoSkillApplication lingoSkillApplication5 = LingoSkillApplication.f21665b;
                        m.c(lingoSkillApplication5);
                        oi.c.f44924t = new oi.c(lingoSkillApplication5);
                    }
                }
            }
            oi.c cVar = oi.c.f44924t;
            m.c(cVar);
            HwCharacter hwCharacter = (HwCharacter) cVar.g().load(Long.valueOf(reviewNew3.getId()));
            if (hwCharacter != null) {
                helper.setText(R.id.tv_pinyin, hwCharacter.getPinyin());
                helper.setText(R.id.tv_word, hwCharacter.getShowCharacter());
                helper.setText(R.id.tv_trans, hwCharacter.getTranslation());
                View view11 = helper.itemView;
                q qVar4 = f.f28191a;
                String pinyin = hwCharacter.getPinyin();
                m.e(pinyin, "getPinyin(...)");
                String strI = f.i(pinyin);
                String pinyin2 = hwCharacter.getPinyin();
                m.e(pinyin2, "getPinyin(...)");
                view11.setTag(R.id.tag_dl_entry, new a(0L, strI, f.b(pinyin2)));
                View itemView5 = helper.itemView;
                m.e(itemView5, "itemView");
                z.b(itemView5, new j(this, hwCharacter));
            }
        }
        b(reviewNew3);
        throw null;
    }
}
