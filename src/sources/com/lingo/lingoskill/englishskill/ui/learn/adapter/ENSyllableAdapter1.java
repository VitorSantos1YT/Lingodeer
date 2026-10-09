package com.lingo.lingoskill.englishskill.ui.learn.adapter;

import android.text.SpannableString;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.lingodeer.R;
import kotlin.jvm.internal.m;
import ns.o;
import w4.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class ENSyllableAdapter1 extends BaseQuickAdapter<String, BaseViewHolder> {
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void convert(BaseViewHolder helper, String str) {
        String item = str;
        m.f(helper, "helper");
        m.f(item, "item");
        helper.setText(R.id.tv_content, new SpannableString(item));
        if (o.L("ъ", "ь").contains(item)) {
            c.v(this.mContext, "mContext", R.color.second_black, helper, R.id.tv_content);
        } else {
            c.v(this.mContext, "mContext", R.color.primary_black, helper, R.id.tv_content);
            helper.addOnClickListener(R.id.ll_parent);
        }
    }
}
