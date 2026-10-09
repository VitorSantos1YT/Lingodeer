package com.lingo.lingoskill.ui.review.adapter;

import android.graphics.Typeface;
import android.widget.TextView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.lingo.lingoskill.object.Ack;
import com.lingo.lingoskill.object.Unit;
import com.lingodeer.R;
import ij.c;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class AckCardSearchAdapter extends BaseQuickAdapter<Ack, BaseViewHolder> {
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void convert(BaseViewHolder helper, Ack ack) {
        Ack item = ack;
        m.f(helper, "helper");
        m.f(item, "item");
        Unit unitF = c.f(item.getUnitId(), false);
        String unitName = unitF != null ? unitF.getUnitName() : null;
        TextView textView = (TextView) helper.getView(R.id.tv_unit_name);
        textView.setText(unitName);
        if (item.isSelected()) {
            textView.setTypeface(Typeface.DEFAULT_BOLD);
            helper.setGone(R.id.iv_check, true);
        } else {
            textView.setTypeface(Typeface.DEFAULT);
            helper.setGone(R.id.iv_check, false);
        }
    }
}
