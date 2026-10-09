package com.lingo.lingoskill.japanskill.ui.syllable.adapter;

import android.text.TextUtils;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.lingo.lingoskill.object.BaseYintuIntel;
import com.lingodeer.R;
import kotlin.jvm.internal.m;
import w4.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class FiftySoundTipAdapter5<T extends BaseYintuIntel> extends BaseQuickAdapter<T, BaseViewHolder> {
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void convert(BaseViewHolder helper, Object obj) {
        BaseYintuIntel item = (BaseYintuIntel) obj;
        m.f(helper, "helper");
        m.f(item, "item");
        helper.setText(R.id.tv_top, item.getPing());
        if (TextUtils.isEmpty(item.getPian())) {
            c.v(this.mContext, "mContext", R.color.colorAccent, helper, R.id.tv_top);
            c.v(this.mContext, "mContext", R.color.colorAccent, helper, R.id.tv_bottom);
            helper.setText(R.id.tv_bottom, item.getLuoMa());
            helper.itemView.setClickable(false);
            return;
        }
        c.v(this.mContext, "mContext", R.color.primary_black, helper, R.id.tv_top);
        c.v(this.mContext, "mContext", R.color.second_black, helper, R.id.tv_bottom);
        helper.setText(R.id.tv_bottom, item.getPian() + " " + item.getLuoMa());
        helper.itemView.setClickable(true);
    }
}
