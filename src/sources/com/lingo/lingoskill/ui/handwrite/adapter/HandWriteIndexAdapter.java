package com.lingo.lingoskill.ui.handwrite.adapter;

import android.widget.TextView;
import bq.r;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.lingo.lingoskill.object.CharGroup;
import com.lingodeer.R;
import com.tbruyelle.rxpermissions3.BuildConfig;
import kotlin.jvm.internal.m;
import oz.x;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class HandWriteIndexAdapter extends BaseQuickAdapter<CharGroup, BaseViewHolder> {
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void convert(BaseViewHolder helper, CharGroup charGroup) {
        CharGroup item = charGroup;
        m.f(helper, "helper");
        m.f(item, "item");
        helper.setText(R.id.tv_name, item.getName());
        helper.setText(R.id.tv_desc, item.getDesc());
        TextView textView = (TextView) helper.getView(R.id.tv_desc);
        int[] iArr = r.f4959a;
        m.c(textView);
        bq.m.J(textView);
        int index = item.getIndex();
        if (index == 11) {
            String name = item.getName();
            m.e(name, "getName(...)");
            helper.setText(R.id.tv_name, x.q0(name, "?", BuildConfig.VERSION_NAME));
            helper.setVisible(R.id.iv_part_img, true);
            helper.setImageResource(R.id.iv_part_img, R.drawable.cn_hw_11);
            return;
        }
        if (index != 37) {
            helper.setVisible(R.id.iv_part_img, false);
            return;
        }
        String name2 = item.getName();
        m.e(name2, "getName(...)");
        helper.setText(R.id.tv_name, x.q0(name2, "?", BuildConfig.VERSION_NAME));
        helper.setVisible(R.id.iv_part_img, true);
        helper.setImageResource(R.id.iv_part_img, R.drawable.cn_hw_37);
    }
}
