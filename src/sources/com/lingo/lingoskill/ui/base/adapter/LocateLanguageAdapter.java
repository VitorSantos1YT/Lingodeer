package com.lingo.lingoskill.ui.base.adapter;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.lingo.lingoskill.object.LocateLanguageItem;
import com.lingodeer.R;
import java.util.Locale;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class LocateLanguageAdapter extends BaseQuickAdapter<LocateLanguageItem, BaseViewHolder> {
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void convert(BaseViewHolder helper, LocateLanguageItem locateLanguageItem) {
        LocateLanguageItem item = locateLanguageItem;
        m.f(helper, "helper");
        m.f(item, "item");
        helper.setText(R.id.tv_title, item.getTitle());
        String upperCase = item.getLocate().toUpperCase(Locale.ROOT);
        m.e(upperCase, "toUpperCase(...)");
        helper.setText(R.id.tv_locate_code, upperCase);
        helper.setGone(R.id.iv_tag_choose, m.a(null, item.getLocate()));
        if (m.a(item.getLocate(), "ar")) {
            ((ConstraintLayout) helper.getView(R.id.const_parent)).setLayoutDirection(1);
        } else {
            ((ConstraintLayout) helper.getView(R.id.const_parent)).setLayoutDirection(0);
        }
    }
}
