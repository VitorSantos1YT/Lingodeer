package com.lingo.lingoskill.ui.review.adapter;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import ay.x;
import bq.r;
import cj.d;
import com.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.lingo.lingoskill.object.HwCharacter;
import com.lingo.lingoskill.object.ReviewNew;
import com.lingo.lingoskill.object.Sentence;
import com.lingo.lingoskill.object.Word;
import com.lingodeer.R;
import fv.a;
import fv.b;
import fv.f;
import ij.g;
import ij.i;
import kotlin.jvm.internal.m;
import ky.e;
import qp.o2;
import qy.q;
import th.j;
import zq.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class BaseLessonUnitReviewELemAdapter extends BaseMultiItemQuickAdapter<ReviewNew, BaseViewHolder> {
    public static void a(HwCharacter hwCharacter, BaseViewHolder baseViewHolder) {
        if (hwCharacter == null) {
            baseViewHolder.itemView.setVisibility(8);
            return;
        }
        Word word = new Word();
        word.setWord(hwCharacter.getShowCharacter());
        word.setZhuyin(hwCharacter.getPinyin());
        word.setLuoma(word.getLuoma());
        TextView textView = (TextView) baseViewHolder.getView(R.id.tv_top);
        TextView textView2 = (TextView) baseViewHolder.getView(R.id.tv_middle);
        TextView textView3 = (TextView) baseViewHolder.getView(R.id.tv_bottom);
        m.c(textView);
        m.c(textView2);
        m.c(textView3);
        c.e(word, textView, textView2, textView3, false);
        baseViewHolder.setText(R.id.txt_trans, hwCharacter.getTranslation());
        View view = baseViewHolder.getView(R.id.ll_parent);
        q qVar = f.f28191a;
        String pinyin = hwCharacter.getPinyin();
        m.e(pinyin, "getPinyin(...)");
        String strI = f.i(pinyin);
        String pinyin2 = hwCharacter.getPinyin();
        m.e(pinyin2, "getPinyin(...)");
        view.setTag(new a(0L, strI, f.b(pinyin2)));
    }

    public static void b(Sentence sentence, ReviewNew reviewNew, BaseViewHolder baseViewHolder) {
        if (sentence == null) {
            if (i.f34434b == null) {
                synchronized (i.class) {
                    if (i.f34434b == null) {
                        i.f34434b = new i();
                    }
                }
            }
            i iVar = i.f34434b;
            m.c(iVar);
            String cwsId = reviewNew.getCwsId();
            m.e(cwsId, "getCwsId(...)");
            iVar.f34435a.f34448h.deleteByKey(cwsId);
            baseViewHolder.itemView.setVisibility(8);
            return;
        }
        baseViewHolder.itemView.setVisibility(0);
        baseViewHolder.setText(R.id.txt_pinyin, sentence.genZhuyin());
        baseViewHolder.setText(R.id.txt_sent, sentence.getSentence());
        int[] iArr = r.f4959a;
        View view = baseViewHolder.getView(R.id.txt_sent);
        m.e(view, "getView(...)");
        bq.m.J((TextView) view);
        String strGenZhuyin = sentence.genZhuyin();
        m.e(strGenZhuyin, "genZhuyin(...)");
        int length = strGenZhuyin.length() - 1;
        int i11 = 0;
        boolean z11 = false;
        while (i11 <= length) {
            boolean z12 = m.h(strGenZhuyin.charAt(!z11 ? i11 : length), 32) <= 0;
            if (z11) {
                if (!z12) {
                    break;
                } else {
                    length--;
                }
            } else if (z12) {
                i11++;
            } else {
                z11 = true;
            }
        }
        if (TextUtils.isEmpty(strGenZhuyin.subSequence(i11, length + 1).toString())) {
            baseViewHolder.setVisible(R.id.txt_pinyin, false);
        } else {
            baseViewHolder.setVisible(R.id.txt_pinyin, true);
        }
        View view2 = baseViewHolder.getView(R.id.ll_parent);
        q qVar = b.f28186a;
        view2.setTag(new a(2L, b.H(sentence.getSentenceId()), b.F(sentence.getSentenceId())));
    }

    public static void c(Word word, ReviewNew reviewNew, BaseViewHolder baseViewHolder) {
        if (word == null || word.getWordType() == 1) {
            if (i.f34434b == null) {
                synchronized (i.class) {
                    if (i.f34434b == null) {
                        i.f34434b = new i();
                    }
                }
            }
            i iVar = i.f34434b;
            m.c(iVar);
            String cwsId = reviewNew.getCwsId();
            m.e(cwsId, "getCwsId(...)");
            iVar.f34435a.f34448h.deleteByKey(cwsId);
            baseViewHolder.itemView.setVisibility(8);
            return;
        }
        baseViewHolder.itemView.setVisibility(0);
        TextView textView = (TextView) baseViewHolder.getView(R.id.tv_top);
        TextView textView2 = (TextView) baseViewHolder.getView(R.id.tv_middle);
        TextView textView3 = (TextView) baseViewHolder.getView(R.id.tv_bottom);
        m.c(textView);
        m.c(textView2);
        m.c(textView3);
        c.e(word, textView, textView2, textView3, false);
        int[] iArr = r.f4959a;
        if (!bq.m.F() && !TextUtils.isEmpty(word.getPos())) {
            textView3.setVisibility(0);
            textView3.setText(word.getPos());
        }
        baseViewHolder.setText(R.id.txt_trans, word.getTranslations());
        View view = baseViewHolder.getView(R.id.ll_parent);
        q qVar = b.f28186a;
        view.setTag(new a(2L, b.Z(word.getWordId()), b.V(word.getWordId())));
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void convert(BaseViewHolder helper, Object obj) {
        ReviewNew item = (ReviewNew) obj;
        m.f(helper, "helper");
        m.f(item, "item");
        Integer elemType = item.getElemType();
        re.q qVar = vx.b.f54316e;
        if (elemType != null && elemType.intValue() == 0) {
            Word word = item.getWord();
            if (word == null) {
                j.a(new x(new g(item, 1)).k(e.f38937b).g(px.b.a()).h(new qp.r(this, item, helper), qVar), null);
            } else {
                c(word, item, helper);
            }
        } else if (elemType != null && elemType.intValue() == 1) {
            Sentence sentence = item.getSentence();
            if (sentence == null) {
                j.a(new x(new g(item, 2)).k(e.f38937b).g(px.b.a()).h(new o2(this, item, helper), qVar), null);
            } else {
                b(sentence, item, helper);
            }
        } else if (elemType != null && elemType.intValue() == 2) {
            HwCharacter character = item.getCharacter();
            if (character == null) {
                j.a(new x(new g(item, 3)).k(e.f38937b).g(px.b.a()).h(new d(this, helper), qVar), null);
            } else {
                a(character, helper);
            }
        }
        helper.setVisible(R.id.red_point, false);
        int rememberLevelInt = item.getRememberLevelInt();
        if (rememberLevelInt == -1) {
            Context mContext = this.mContext;
            m.e(mContext, "mContext");
            helper.setBackgroundColor(R.id.view_srs, mContext.getColor(R.color.color_F49E6D));
        } else if (rememberLevelInt == 0) {
            Context mContext2 = this.mContext;
            m.e(mContext2, "mContext");
            helper.setBackgroundColor(R.id.view_srs, mContext2.getColor(R.color.color_FFC843));
        } else if (rememberLevelInt == 1) {
            Context mContext3 = this.mContext;
            m.e(mContext3, "mContext");
            helper.setBackgroundColor(R.id.view_srs, mContext3.getColor(R.color.color_96C952));
        }
        helper.addOnClickListener(R.id.ll_parent);
    }
}
