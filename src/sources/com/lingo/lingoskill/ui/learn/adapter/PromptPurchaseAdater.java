package com.lingo.lingoskill.ui.learn.adapter;

import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.lingodeer.R;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class PromptPurchaseAdater extends BaseQuickAdapter<Integer, BaseViewHolder> {
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void convert(BaseViewHolder helper, Integer num) {
        int iIntValue = num.intValue();
        m.f(helper, "helper");
        LottieAnimationView lottieAnimationView = (LottieAnimationView) helper.getView(R.id.lav_deer);
        lottieAnimationView.setAnimation(iIntValue);
        lottieAnimationView.setRepeatCount(-1);
        lottieAnimationView.h();
        TextView textView = (TextView) helper.getView(R.id.tv_title);
        TextView textView2 = (TextView) helper.getView(R.id.tv_desc);
        if (iIntValue == R.raw.purchase_deer_1) {
            textView.setText(this.mContext.getString(R.string.dialog_purchase_title_1));
            textView2.setText(this.mContext.getString(R.string.dialog_purchase_title_desc_1));
            return;
        }
        if (iIntValue == R.raw.purchase_deer_2) {
            textView.setText(this.mContext.getString(R.string.dialog_purchase_title_2));
            textView2.setText(this.mContext.getString(R.string.dialog_purchase_title_desc_2));
            return;
        }
        if (iIntValue == R.raw.purchase_deer_3) {
            textView.setText(this.mContext.getString(R.string.dialog_purchase_title_3));
            textView2.setText(this.mContext.getString(R.string.dialog_purchase_title_desc_3));
        } else if (iIntValue == R.raw.purchase_deer_4) {
            textView.setText(this.mContext.getString(R.string.dialog_purchase_title_4));
            textView2.setText(this.mContext.getString(R.string.dialog_purchase_title_desc_4));
        } else if (iIntValue == R.raw.purchase_deer_5) {
            textView.setText(this.mContext.getString(R.string.dialog_purchase_title_5));
            textView2.setText(this.mContext.getString(R.string.dialog_purchase_title_desc_5));
        }
    }
}
