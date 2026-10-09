package com.lingo.lingoskill.japanskill.ui.syllable.adapter;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.lingo.lingoskill.object.CharGroup;
import com.lingodeer.R;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class JPHwCharGroupAdapter extends BaseQuickAdapter<CharGroup, BaseViewHolder> {
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void convert(BaseViewHolder helper, CharGroup charGroup) {
        CharGroup item = charGroup;
        m.f(helper, "helper");
        m.f(item, "item");
        helper.setText(R.id.tv_name, item.getName());
        helper.setText(R.id.tv_desc, item.getDesc());
    }
}
