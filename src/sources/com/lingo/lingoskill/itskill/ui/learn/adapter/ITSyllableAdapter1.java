package com.lingo.lingoskill.itskill.ui.learn.adapter;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.lingodeer.R;
import java.util.List;
import kotlin.jvm.internal.m;
import ns.o;
import oz.q;
import oz.x;
import w4.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class ITSyllableAdapter1 extends BaseQuickAdapter<String, BaseViewHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f21897a;

    public ITSyllableAdapter1(List list, List list2) {
        super(R.layout.es_syllable_table_item_1, list);
        this.f21897a = list2;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void convert(BaseViewHolder helper, String str) {
        String item = str;
        m.f(helper, "helper");
        m.f(item, "item");
        SpannableString spannableString = new SpannableString(item);
        List list = this.f21897a;
        if (list != null && !list.isEmpty()) {
            String str2 = this.mData.size() == list.size() ? (String) list.get(helper.getAdapterPosition()) : (String) list.get(0);
            if (q.v0(item, str2, false)) {
                if (x.s0(item, "nono", false) && str2.equals("n")) {
                    Context mContext = this.mContext;
                    m.e(mContext, "mContext");
                    spannableString.setSpan(new ForegroundColorSpan(mContext.getColor(R.color.colorAccent)), q.I0(item, str2, 0, false, 6) + 2, str2.length() + q.I0(item, str2, 0, false, 6) + 2, 33);
                } else {
                    Context mContext2 = this.mContext;
                    m.e(mContext2, "mContext");
                    spannableString.setSpan(new ForegroundColorSpan(mContext2.getColor(R.color.colorAccent)), q.I0(item, str2, 0, false, 6), str2.length() + q.I0(item, str2, 0, false, 6), 33);
                }
            }
        }
        if (o.L("J j", "K k", "W w", "X x", "Y y").contains(item)) {
            c.v(this.mContext, "mContext", R.color.second_black, helper, R.id.tv_content);
        } else {
            c.v(this.mContext, "mContext", R.color.primary_black, helper, R.id.tv_content);
        }
        helper.setText(R.id.tv_content, spannableString);
        helper.addOnClickListener(R.id.tv_content);
    }
}
