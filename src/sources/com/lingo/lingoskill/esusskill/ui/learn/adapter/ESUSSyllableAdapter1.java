package com.lingo.lingoskill.esusskill.ui.learn.adapter;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingodeer.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.m;
import ns.o;
import oz.q;
import oz.x;
import w4.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class ESUSSyllableAdapter1 extends BaseQuickAdapter<String, BaseViewHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f21853a;

    public ESUSSyllableAdapter1(ArrayList arrayList, List list) {
        super(R.layout.es_syllable_table_item_1, list);
        this.f21853a = arrayList;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void convert(BaseViewHolder helper, String str) {
        String item = str;
        m.f(helper, "helper");
        m.f(item, "item");
        SpannableString spannableString = new SpannableString(item);
        List list = this.f21853a;
        if (list != null && !list.isEmpty()) {
            String str2 = this.mData.size() == list.size() ? (String) list.get(helper.getAdapterPosition()) : (String) list.get(0);
            if (q.v0(item, str2, false)) {
                if (x.k0(item, "[MX]", false)) {
                    Context mContext = this.mContext;
                    m.e(mContext, "mContext");
                    spannableString.setSpan(new ForegroundColorSpan(mContext.getColor(R.color.color_43CC93)), q.I0(item, str2, 0, false, 6), str2.length() + q.I0(item, str2, 0, false, 6), 33);
                } else if (item.equals("bleibt") || item.equals("contacto")) {
                    Context mContext2 = this.mContext;
                    m.e(mContext2, "mContext");
                    spannableString.setSpan(new ForegroundColorSpan(mContext2.getColor(R.color.colorAccent)), q.I0(item, str2, 1, false, 4), str2.length() + q.I0(item, str2, 1, false, 4), 33);
                } else {
                    LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                    if (cf.x.n().keyLanguage == 8 && o.L("K k", "W w", "Y y").contains(item)) {
                        Context mContext3 = this.mContext;
                        m.e(mContext3, "mContext");
                        spannableString.setSpan(new ForegroundColorSpan(mContext3.getColor(R.color.second_black)), q.I0(item, str2, 0, false, 6), str2.length() + q.I0(item, str2, 0, false, 6), 33);
                    } else {
                        Context mContext4 = this.mContext;
                        m.e(mContext4, "mContext");
                        spannableString.setSpan(new ForegroundColorSpan(mContext4.getColor(R.color.colorAccent)), q.I0(item, str2, 0, false, 6), str2.length() + q.I0(item, str2, 0, false, 6), 33);
                    }
                }
            }
        }
        if (o.L("CH ch", "LL ll", "Ñ ñ").contains(item)) {
            c.v(this.mContext, "mContext", R.color.colorAccent, helper, R.id.tv_content);
        } else {
            c.v(this.mContext, "mContext", R.color.primary_black, helper, R.id.tv_content);
        }
        helper.setText(R.id.tv_content, spannableString);
        helper.addOnClickListener(R.id.ll_parent);
    }
}
