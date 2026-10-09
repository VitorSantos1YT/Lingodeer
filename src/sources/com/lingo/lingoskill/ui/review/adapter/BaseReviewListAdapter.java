package com.lingo.lingoskill.ui.review.adapter;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.lingo.lingoskill.object.ReviewListItem;
import com.lingodeer.R;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class BaseReviewListAdapter extends BaseQuickAdapter<ReviewListItem, BaseViewHolder> {
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void convert(BaseViewHolder helper, ReviewListItem reviewListItem) {
        ReviewListItem item = reviewListItem;
        m.f(helper, "helper");
        m.f(item, "item");
        helper.setImageResource(R.id.iv_icon, item.getDrawableRes());
        helper.setText(R.id.tv_title, item.getTitle());
    }
}
