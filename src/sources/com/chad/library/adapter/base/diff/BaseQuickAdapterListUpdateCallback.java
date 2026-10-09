package com.chad.library.adapter.base.diff;

import androidx.recyclerview.widget.s0;
import com.chad.library.adapter.base.BaseQuickAdapter;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class BaseQuickAdapterListUpdateCallback implements s0 {
    private final BaseQuickAdapter mAdapter;

    public BaseQuickAdapterListUpdateCallback(BaseQuickAdapter baseQuickAdapter) {
        this.mAdapter = baseQuickAdapter;
    }

    @Override // androidx.recyclerview.widget.s0
    public void onChanged(int i11, int i12, Object obj) {
        BaseQuickAdapter baseQuickAdapter = this.mAdapter;
        baseQuickAdapter.notifyItemRangeChanged(baseQuickAdapter.getHeaderLayoutCount() + i11, i12, obj);
    }

    @Override // androidx.recyclerview.widget.s0
    public void onInserted(int i11, int i12) {
        BaseQuickAdapter baseQuickAdapter = this.mAdapter;
        baseQuickAdapter.notifyItemRangeInserted(baseQuickAdapter.getHeaderLayoutCount() + i11, i12);
    }

    @Override // androidx.recyclerview.widget.s0
    public void onMoved(int i11, int i12) {
        BaseQuickAdapter baseQuickAdapter = this.mAdapter;
        baseQuickAdapter.notifyItemMoved(baseQuickAdapter.getHeaderLayoutCount() + i11, this.mAdapter.getHeaderLayoutCount() + i12);
    }

    @Override // androidx.recyclerview.widget.s0
    public void onRemoved(int i11, int i12) {
        BaseQuickAdapter baseQuickAdapter = this.mAdapter;
        baseQuickAdapter.notifyItemRangeRemoved(baseQuickAdapter.getHeaderLayoutCount() + i11, i12);
    }
}
