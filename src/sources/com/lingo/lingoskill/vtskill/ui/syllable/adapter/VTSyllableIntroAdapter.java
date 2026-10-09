package com.lingo.lingoskill.vtskill.ui.syllable.adapter;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.lingodeer.R;
import kotlin.jvm.internal.m;
import w4.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class VTSyllableIntroAdapter extends BaseQuickAdapter<String, BaseViewHolder> {
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void convert(BaseViewHolder helper, String str) {
        String item = str;
        m.f(helper, "helper");
        m.f(item, "item");
        helper.setText(R.id.tv_content, item);
        int iHashCode = item.hashCode();
        if (iHashCode == 3738 ? item.equals("uo") : iHashCode == 115555 ? item.equals("uao") : iHashCode == 116422 ? item.equals("uyê") : iHashCode == 103989951 && item.equals("iê/yê")) {
            c.v(this.mContext, "mContext", R.color.color_D8D8D8, helper, R.id.tv_content);
        } else {
            c.v(this.mContext, "mContext", R.color.primary_black, helper, R.id.tv_content);
        }
    }
}
