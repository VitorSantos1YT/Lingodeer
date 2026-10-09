package com.lingo.lingoskill.franchskill.ui.learn.adapter;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.lingodeer.R;
import java.util.List;
import kotlin.jvm.internal.m;
import oz.q;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class FRSyllableAdapter2 extends BaseQuickAdapter<String, BaseViewHolder> {
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void convert(BaseViewHolder helper, String str) {
        String item = str;
        m.f(helper, "helper");
        m.f(item, "item");
        List listW0 = q.W0(item, new String[]{"\t"}, 0, 6);
        helper.setText(R.id.tv_1, (CharSequence) listW0.get(0));
        helper.setText(R.id.tv_2, (CharSequence) listW0.get(1));
        helper.setText(R.id.tv_3, (CharSequence) listW0.get(2));
        helper.setText(R.id.tv_4, (CharSequence) listW0.get(3));
    }
}
