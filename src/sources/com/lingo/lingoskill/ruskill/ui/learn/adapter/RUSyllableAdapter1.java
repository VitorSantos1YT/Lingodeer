package com.lingo.lingoskill.ruskill.ui.learn.adapter;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingodeer.R;
import java.util.List;
import kotlin.jvm.internal.m;
import ns.o;
import oz.q;
import oz.x;
import w4.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class RUSyllableAdapter1 extends BaseQuickAdapter<String, BaseViewHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f22008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f22009b;

    public RUSyllableAdapter1(List list, List list2, List list3) {
        super(R.layout.es_syllable_table_item_1, list);
        this.f22008a = list2;
        this.f22009b = list3;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0102  */
    /* JADX WARN: Code duplicated, block: B:37:0x0121  */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void convert(BaseViewHolder helper, String str) {
        String item = str;
        m.f(helper, "helper");
        m.f(item, "item");
        SpannableString spannableString = new SpannableString(item);
        List list = this.f22008a;
        if (list != null && !list.isEmpty()) {
            String str2 = this.mData.size() == list.size() ? (String) list.get(helper.getAdapterPosition()) : (String) list.get(0);
            if (q.v0(item, str2, false)) {
                if (x.k0(item, "[MX]", false)) {
                    Context mContext = this.mContext;
                    m.e(mContext, "mContext");
                    spannableString.setSpan(new ForegroundColorSpan(mContext.getColor(R.color.color_43CC93)), q.I0(item, str2, 0, false, 6), str2.length() + q.I0(item, str2, 0, false, 6), 33);
                } else {
                    int iHashCode = item.hashCode();
                    if (iHashCode != -1386457280) {
                        if (iHashCode != -567451569) {
                            if (iHashCode == 33149558 && item.equals("дядя")) {
                                Context mContext2 = this.mContext;
                                m.e(mContext2, "mContext");
                                spannableString.setSpan(new ForegroundColorSpan(mContext2.getColor(R.color.colorAccent)), q.M0(6, item, str2), str2.length() + q.M0(6, item, str2), 33);
                            }
                        } else if (item.equals("contacto")) {
                            Context mContext3 = this.mContext;
                            m.e(mContext3, "mContext");
                            spannableString.setSpan(new ForegroundColorSpan(mContext3.getColor(R.color.colorAccent)), q.I0(item, str2, 1, false, 4), str2.length() + q.I0(item, str2, 1, false, 4), 33);
                        }
                        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                        if (cf.x.n().keyLanguage == 8 || !o.L("K k", "W w", "Y y").contains(item)) {
                            Context mContext4 = this.mContext;
                            m.e(mContext4, "mContext");
                            spannableString.setSpan(new ForegroundColorSpan(mContext4.getColor(R.color.colorAccent)), q.I0(item, str2, 0, false, 6), str2.length() + q.I0(item, str2, 0, false, 6), 33);
                        } else {
                            Context mContext5 = this.mContext;
                            m.e(mContext5, "mContext");
                            spannableString.setSpan(new ForegroundColorSpan(mContext5.getColor(R.color.second_black)), q.I0(item, str2, 0, false, 6), str2.length() + q.I0(item, str2, 0, false, 6), 33);
                        }
                    } else if (item.equals("bleibt")) {
                        Context mContext6 = this.mContext;
                        m.e(mContext6, "mContext");
                        spannableString.setSpan(new ForegroundColorSpan(mContext6.getColor(R.color.colorAccent)), q.I0(item, str2, 1, false, 4), str2.length() + q.I0(item, str2, 1, false, 4), 33);
                    } else {
                        LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
                        if (cf.x.n().keyLanguage == 8) {
                            Context mContext7 = this.mContext;
                            m.e(mContext7, "mContext");
                            spannableString.setSpan(new ForegroundColorSpan(mContext7.getColor(R.color.colorAccent)), q.I0(item, str2, 0, false, 6), str2.length() + q.I0(item, str2, 0, false, 6), 33);
                        } else {
                            Context mContext8 = this.mContext;
                            m.e(mContext8, "mContext");
                            spannableString.setSpan(new ForegroundColorSpan(mContext8.getColor(R.color.colorAccent)), q.I0(item, str2, 0, false, 6), str2.length() + q.I0(item, str2, 0, false, 6), 33);
                        }
                    }
                }
            }
        }
        helper.setText(R.id.tv_content, spannableString);
        if (o.L("ъ", "ь").contains(item)) {
            c.v(this.mContext, "mContext", R.color.second_black, helper, R.id.tv_content);
            return;
        }
        c.v(this.mContext, "mContext", R.color.primary_black, helper, R.id.tv_content);
        List list2 = this.f22009b;
        if (list2 == null) {
            helper.addOnClickListener(R.id.ll_parent);
            return;
        }
        String str3 = (String) list2.get(helper.getAdapterPosition());
        if (m.a(str3, item)) {
            helper.addOnClickListener(R.id.ll_parent);
        } else if (q.W0(item, new String[]{" "}, 0, 6).contains(str3)) {
            helper.addOnClickListener(R.id.ll_parent);
        }
    }
}
