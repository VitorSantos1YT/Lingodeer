package com.lingo.lingoskill.koreanskill.ui.syllable.adapter;

import android.graphics.Typeface;
import android.widget.TextView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.lingodeer.R;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class FuyinTableAdapter2 extends BaseQuickAdapter<String, BaseViewHolder> {
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void convert(BaseViewHolder helper, String str) {
        String item = str;
        m.f(helper, "helper");
        m.f(item, "item");
        TextView textView = (TextView) helper.getView(R.id.tv_1);
        textView.setText(item);
        if (helper.getAdapterPosition() < 2) {
            textView.setTypeface(Typeface.DEFAULT_BOLD);
        } else {
            textView.setTypeface(Typeface.DEFAULT);
        }
        if (helper.getAdapterPosition() <= 1 || helper.getAdapterPosition() % 2 != 0) {
            helper.setGone(R.id.iv_audio, false);
            helper.itemView.setClickable(false);
        } else {
            helper.setGone(R.id.iv_audio, true);
            helper.itemView.setClickable(true);
        }
    }
}
