package com.lingo.lingoskill.ui.review.adapter;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.CheckBox;
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
import com.lingo.lingoskill.object.ReviewNew;
import com.lingo.lingoskill.object.Sentence;
import com.lingo.lingoskill.object.Word;
import com.lingodeer.R;
import com.tbruyelle.rxpermissions3.BuildConfig;
import fv.b;
import ij.g;
import java.util.Iterator;
import kotlin.jvm.internal.m;
import ky.e;
import ob.i;
import pr.a0;
import qy.q;
import th.j;
import up.a;
import zq.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class BaseReviewCateAdapter extends BaseMultiItemQuickAdapter<MultiItemEntity, BaseViewHolder> {
    public static void b(CheckBox checkBox) {
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        if (x.n().reviewCateSortBy == 2 || x.n().reviewCateSortBy == 3 || x.n().reviewCateSortBy == 4) {
            checkBox.setEnabled(false);
            checkBox.setClickable(false);
        } else {
            checkBox.setEnabled(true);
            checkBox.setClickable(true);
        }
    }

    public final void a(HwCharacter hwCharacter, BaseViewHolder baseViewHolder, ReviewNew reviewNew, CheckBox checkBox) {
        if (hwCharacter == null) {
            baseViewHolder.itemView.setVisibility(8);
            return;
        }
        baseViewHolder.itemView.setVisibility(0);
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
        View itemView = baseViewHolder.itemView;
        m.e(itemView, "itemView");
        z.b(itemView, new a(this, baseViewHolder, 0));
        View view = baseViewHolder.itemView;
        q qVar = b.f28186a;
        String pinyin = hwCharacter.getPinyin();
        m.e(pinyin, "getPinyin(...)");
        String strK0 = b.k0(pinyin);
        String pinyin2 = hwCharacter.getPinyin();
        m.e(pinyin2, "getPinyin(...)");
        view.setTag(new fv.a(0L, strK0, b.j0(pinyin2)));
        c(baseViewHolder, reviewNew);
        b(checkBox);
    }

    public final void c(BaseViewHolder baseViewHolder, ReviewNew reviewNew) {
        baseViewHolder.setVisible(R.id.red_point, false);
        int rememberLevelInt = reviewNew.getRememberLevelInt();
        if (rememberLevelInt == -1) {
            Context mContext = this.mContext;
            m.e(mContext, "mContext");
            baseViewHolder.setBackgroundColor(R.id.view_srs, mContext.getColor(R.color.color_F49E6D));
        } else if (rememberLevelInt == 0) {
            Context mContext2 = this.mContext;
            m.e(mContext2, "mContext");
            baseViewHolder.setBackgroundColor(R.id.view_srs, mContext2.getColor(R.color.color_FFC843));
        } else {
            if (rememberLevelInt != 1) {
                return;
            }
            Context mContext3 = this.mContext;
            m.e(mContext3, "mContext");
            baseViewHolder.setBackgroundColor(R.id.view_srs, mContext3.getColor(R.color.color_96C952));
        }
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void convert(BaseViewHolder helper, Object obj) {
        MultiItemEntity item = (MultiItemEntity) obj;
        m.f(helper, "helper");
        m.f(item, "item");
        int itemType = item.getItemType();
        if (itemType != -1) {
            re.q qVar = vx.b.f54316e;
            if (itemType == 0) {
                final ReviewNew reviewNew = (ReviewNew) item;
                final CheckBox checkBox = (CheckBox) helper.getView(R.id.check_item);
                checkBox.setChecked(reviewNew.isChecked());
                final int i11 = 0;
                z.b(checkBox, new fz.c() { // from class: up.b
                    @Override // fz.c
                    public final Object invoke(Object obj2) {
                        View it = (View) obj2;
                        switch (i11) {
                            case 0:
                                m.f(it, "it");
                                CheckBox checkBox2 = checkBox;
                                reviewNew.setChecked(checkBox2.isChecked());
                                this.getClass();
                                checkBox2.isChecked();
                                throw null;
                            case 1:
                                m.f(it, "it");
                                CheckBox checkBox3 = checkBox;
                                reviewNew.setChecked(checkBox3.isChecked());
                                this.getClass();
                                checkBox3.isChecked();
                                throw null;
                            default:
                                m.f(it, "it");
                                CheckBox checkBox4 = checkBox;
                                reviewNew.setChecked(checkBox4.isChecked());
                                this.getClass();
                                checkBox4.isChecked();
                                throw null;
                        }
                    }
                });
                Word word = reviewNew.getWord();
                if (word == null) {
                    j.a(new ay.x(new g(reviewNew, this, 4)).k(e.f38937b).g(px.b.a()).h(new i(this, reviewNew, helper, checkBox, 15), qVar), null);
                    return;
                } else {
                    e(word, reviewNew, helper, checkBox);
                    return;
                }
            }
            if (itemType == 1) {
                final ReviewNew reviewNew2 = (ReviewNew) item;
                final CheckBox checkBox2 = (CheckBox) helper.getView(R.id.check_item);
                checkBox2.setChecked(reviewNew2.isChecked());
                final int i12 = 1;
                z.b(checkBox2, new fz.c() { // from class: up.b
                    @Override // fz.c
                    public final Object invoke(Object obj2) {
                        View it = (View) obj2;
                        switch (i12) {
                            case 0:
                                m.f(it, "it");
                                CheckBox checkBox3 = checkBox2;
                                reviewNew2.setChecked(checkBox3.isChecked());
                                this.getClass();
                                checkBox3.isChecked();
                                throw null;
                            case 1:
                                m.f(it, "it");
                                CheckBox checkBox4 = checkBox2;
                                reviewNew2.setChecked(checkBox4.isChecked());
                                this.getClass();
                                checkBox4.isChecked();
                                throw null;
                            default:
                                m.f(it, "it");
                                CheckBox checkBox5 = checkBox2;
                                reviewNew2.setChecked(checkBox5.isChecked());
                                this.getClass();
                                checkBox5.isChecked();
                                throw null;
                        }
                    }
                });
                Sentence sentence = reviewNew2.getSentence();
                if (sentence == null) {
                    j.a(new ay.x(new g(reviewNew2, this, 5)).k(e.f38937b).g(px.b.a()).h(new up.c(this, helper, reviewNew2, checkBox2, 1), qVar), null);
                    return;
                } else {
                    d(sentence, helper, reviewNew2, checkBox2);
                    return;
                }
            }
            if (itemType != 2) {
                return;
            }
            final ReviewNew reviewNew3 = (ReviewNew) item;
            final CheckBox checkBox3 = (CheckBox) helper.getView(R.id.check_item);
            checkBox3.setChecked(reviewNew3.isChecked());
            final int i13 = 2;
            z.b(checkBox3, new fz.c() { // from class: up.b
                @Override // fz.c
                public final Object invoke(Object obj2) {
                    View it = (View) obj2;
                    switch (i13) {
                        case 0:
                            m.f(it, "it");
                            CheckBox checkBox4 = checkBox3;
                            reviewNew3.setChecked(checkBox4.isChecked());
                            this.getClass();
                            checkBox4.isChecked();
                            throw null;
                        case 1:
                            m.f(it, "it");
                            CheckBox checkBox5 = checkBox3;
                            reviewNew3.setChecked(checkBox5.isChecked());
                            this.getClass();
                            checkBox5.isChecked();
                            throw null;
                        default:
                            m.f(it, "it");
                            CheckBox checkBox6 = checkBox3;
                            reviewNew3.setChecked(checkBox6.isChecked());
                            this.getClass();
                            checkBox6.isChecked();
                            throw null;
                    }
                }
            });
            HwCharacter character = reviewNew3.getCharacter();
            if (character == null) {
                j.a(new ay.x(new g(reviewNew3, 6)).k(e.f38937b).g(px.b.a()).h(new up.c(this, helper, reviewNew3, checkBox3, 0), qVar), null);
                return;
            } else {
                a(character, helper, reviewNew3, checkBox3);
                return;
            }
        }
        BaseReviewGroup baseReviewGroup = (BaseReviewGroup) item;
        CheckBox checkBox4 = (CheckBox) helper.getView(R.id.check_box);
        helper.setText(R.id.txt_unit_name, baseReviewGroup.getUnitName());
        baseReviewGroup.strength = BaseReviewGroup.getUnitStrength(baseReviewGroup.getSubItems());
        helper.setText(R.id.txt_unStudy_num, BuildConfig.VERSION_NAME);
        float f5 = baseReviewGroup.strength;
        if (f5 <= -0.33f) {
            Context mContext = this.mContext;
            m.e(mContext, "mContext");
            helper.setBackgroundColor(R.id.view_srs_group, mContext.getColor(R.color.color_F49E6D));
        } else if (f5 <= 0.33f) {
            Context mContext2 = this.mContext;
            m.e(mContext2, "mContext");
            helper.setBackgroundColor(R.id.view_srs_group, mContext2.getColor(R.color.color_FFC843));
        } else if (f5 <= 1.0f) {
            Context mContext3 = this.mContext;
            m.e(mContext3, "mContext");
            helper.setBackgroundColor(R.id.view_srs_group, mContext3.getColor(R.color.color_96C952));
        }
        View itemView = helper.itemView;
        m.e(itemView, "itemView");
        z.b(itemView, new a0(helper, baseReviewGroup, this, 22));
        helper.itemView.findViewById(R.id.view_srs_group).setVisibility(0);
        int size = baseReviewGroup.getSubItems().size();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(size);
        helper.setText(R.id.tv_sent_count, sb2.toString());
        TextView textView = (TextView) helper.getView(R.id.tv_select_count);
        Iterator<ReviewNew> it = baseReviewGroup.getSubItems().iterator();
        int i14 = 0;
        while (it.hasNext()) {
            if (it.next().isChecked()) {
                i14++;
            }
        }
        if (i14 > 0) {
            textView.setVisibility(0);
            textView.setText("(" + i14 + ")");
            String string = textView.getText().toString();
            SpannableString spannableString = new SpannableString(textView.getText());
            Context mContext4 = this.mContext;
            m.e(mContext4, "mContext");
            spannableString.setSpan(new ForegroundColorSpan(mContext4.getColor(R.color.colorAccent)), oz.q.I0(string, "(", 0, false, 6) + 1, String.valueOf(i14).length() + oz.q.I0(string, String.valueOf(i14), 0, false, 6), 33);
            textView.setText(spannableString);
        } else {
            textView.setVisibility(8);
        }
        m.c(checkBox4);
        z.b(checkBox4, new b0.a(baseReviewGroup, checkBox4, this, helper, 28));
        checkBox4.setChecked(baseReviewGroup.isChecked());
        b(checkBox4);
    }

    public final void d(Sentence sentence, BaseViewHolder baseViewHolder, ReviewNew reviewNew, CheckBox checkBox) {
        if (sentence == null) {
            if (ij.i.f34434b == null) {
                synchronized (ij.i.class) {
                    if (ij.i.f34434b == null) {
                        ij.i.f34434b = new ij.i();
                    }
                }
            }
            ij.i iVar = ij.i.f34434b;
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
        View itemView = baseViewHolder.itemView;
        m.e(itemView, "itemView");
        z.b(itemView, new a(this, baseViewHolder, 1));
        View view = baseViewHolder.itemView;
        q qVar = b.f28186a;
        view.setTag(new fv.a(2L, b.H(sentence.getSentenceId()), b.F(sentence.getSentenceId())));
        c(baseViewHolder, reviewNew);
        b(checkBox);
    }

    public final void e(Word word, ReviewNew reviewNew, BaseViewHolder baseViewHolder, CheckBox checkBox) {
        if (word == null || word.getWordType() == 1) {
            if (ij.i.f34434b == null) {
                synchronized (ij.i.class) {
                    if (ij.i.f34434b == null) {
                        ij.i.f34434b = new ij.i();
                    }
                }
            }
            ij.i iVar = ij.i.f34434b;
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
        View itemView = baseViewHolder.itemView;
        m.e(itemView, "itemView");
        z.b(itemView, new a(this, baseViewHolder, 2));
        View view = baseViewHolder.itemView;
        q qVar = b.f28186a;
        view.setTag(new fv.a(2L, b.Z(word.getWordId()), b.V(word.getWordId())));
        baseViewHolder.itemView.setTag(R.id.tag_word, word);
        c(baseViewHolder, reviewNew);
        b(checkBox);
    }
}
