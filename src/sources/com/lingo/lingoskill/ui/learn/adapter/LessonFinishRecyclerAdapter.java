package com.lingo.lingoskill.ui.learn.adapter;

import android.view.View;
import cf.x;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.object.HwCharacter;
import com.lingo.lingoskill.object.LDCharacter;
import com.lingo.lingoskill.object.Sentence;
import com.lingo.lingoskill.object.Word;
import com.lingodeer.R;
import com.lingodeer.data.model.ReviewStatus;
import com.lingodeer.data.model.ReviewStatusKt;
import fv.a;
import fv.b;
import ij.c;
import ij.d;
import kotlin.jvm.internal.m;
import qy.q;
import ry.l;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class LessonFinishRecyclerAdapter extends BaseQuickAdapter<ReviewStatus, BaseViewHolder> {
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void convert(BaseViewHolder helper, ReviewStatus reviewStatus) {
        ReviewStatus item = reviewStatus;
        m.f(helper, "helper");
        m.f(item, "item");
        int elemType = item.getElemType();
        if (elemType == 0) {
            Word wordH = c.h(item.getElemId());
            if (wordH != null) {
                LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                if (l.D(new Integer[]{57, 61, 63, 65}, Integer.valueOf(x.n().keyLanguage))) {
                    helper.setText(R.id.tv_pinyin, wordH.getLuoma());
                } else {
                    helper.setText(R.id.tv_pinyin, wordH.getZhuyin());
                }
                helper.setText(R.id.tv_word, wordH.getWord());
                helper.setText(R.id.tv_trans, wordH.getTranslations());
                View view = helper.itemView;
                q qVar = b.f28186a;
                view.setTag(R.id.tag_dl_entry, new a(2L, b.Z(wordH.getWordId()), b.V(wordH.getWordId())));
            }
        } else if (elemType == 1) {
            Sentence sentenceE = c.e(item.getElemId());
            m.c(sentenceE);
            LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
            if (l.D(new Integer[]{57, 61, 63, 65}, Integer.valueOf(x.n().keyLanguage))) {
                helper.setText(R.id.tv_pinyin, sentenceE.genLuoma());
            } else {
                helper.setText(R.id.tv_pinyin, sentenceE.genZhuyin());
            }
            helper.setText(R.id.tv_word, sentenceE.getSentence());
            helper.setText(R.id.tv_trans, sentenceE.getTranslations());
            View view2 = helper.itemView;
            q qVar2 = b.f28186a;
            view2.setTag(R.id.tag_dl_entry, new a(2L, b.H(sentenceE.getSentenceId()), b.F(sentenceE.getSentenceId())));
        } else if (elemType == 2) {
            LingoSkillApplication lingoSkillApplication3 = LingoSkillApplication.f21665b;
            if (l.D(new Integer[]{0, 11}, Integer.valueOf(x.n().keyLanguage))) {
                if (oi.c.f44924t == null) {
                    synchronized (oi.c.class) {
                        if (oi.c.f44924t == null) {
                            LingoSkillApplication lingoSkillApplication4 = LingoSkillApplication.f21665b;
                            m.c(lingoSkillApplication4);
                            oi.c.f44924t = new oi.c(lingoSkillApplication4);
                        }
                    }
                }
                oi.c cVar = oi.c.f44924t;
                m.c(cVar);
                HwCharacter hwCharacter = (HwCharacter) cVar.g().load(Long.valueOf(item.getElemId()));
                if (hwCharacter != null) {
                    helper.setText(R.id.tv_pinyin, hwCharacter.getPinyin());
                    helper.setText(R.id.tv_word, hwCharacter.getShowCharacter());
                    helper.setText(R.id.tv_trans, hwCharacter.getTranslation());
                }
            } else if (l.D(new Integer[]{51, 55, 57}, Integer.valueOf(x.n().keyLanguage))) {
                if (d.f34419e == null) {
                    synchronized (d.class) {
                        if (d.f34419e == null) {
                            LingoSkillApplication lingoSkillApplication5 = LingoSkillApplication.f21665b;
                            m.c(lingoSkillApplication5);
                            d.f34419e = new d(lingoSkillApplication5);
                        }
                    }
                }
                d dVar = d.f34419e;
                m.c(dVar);
                LDCharacter lDCharacter = (LDCharacter) dVar.n().load(Long.valueOf(item.getElemId()));
                if (lDCharacter != null) {
                    helper.setText(R.id.tv_pinyin, lDCharacter.getPinyin());
                    helper.setText(R.id.tv_word, lDCharacter.getCharacter());
                }
            } else {
                if (dm.c.f23488f == null) {
                    synchronized (dm.c.class) {
                        if (dm.c.f23488f == null) {
                            LingoSkillApplication lingoSkillApplication6 = LingoSkillApplication.f21665b;
                            m.c(lingoSkillApplication6);
                            dm.c.f23488f = new dm.c(lingoSkillApplication6);
                        }
                    }
                }
                dm.c cVar2 = dm.c.f23488f;
                m.c(cVar2);
                HwCharacter hwCharacter2 = (HwCharacter) cVar2.f().load(Long.valueOf(item.getElemId()));
                if (hwCharacter2 != null) {
                    helper.setText(R.id.tv_pinyin, hwCharacter2.getPinyin());
                    helper.setText(R.id.tv_word, hwCharacter2.getCharacter());
                    helper.setText(R.id.tv_trans, hwCharacter2.getTranslation());
                    View view3 = helper.itemView;
                    q qVar3 = b.f28186a;
                    String pinyin = hwCharacter2.getPinyin();
                    m.e(pinyin, "getPinyin(...)");
                    String strK0 = b.k0(pinyin);
                    String pinyin2 = hwCharacter2.getPinyin();
                    m.e(pinyin2, "getPinyin(...)");
                    view3.setTag(R.id.tag_dl_entry, new a(0L, strK0, b.j0(pinyin2)));
                }
            }
        }
        int iLevel = ReviewStatusKt.level(item);
        if (iLevel > -0.33f && iLevel > 0.33d) {
            throw null;
        }
        throw null;
    }
}
