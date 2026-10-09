package com.chad.library.adapter.base.util;

import android.util.SparseArray;
import com.chad.library.adapter.base.provider.BaseItemProvider;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class ProviderDelegate {
    private SparseArray<BaseItemProvider> mItemProviders = new SparseArray<>();

    public SparseArray<BaseItemProvider> getItemProviders() {
        return this.mItemProviders;
    }

    public void registerProvider(BaseItemProvider baseItemProvider) {
        if (baseItemProvider == null) {
            throw new ItemProviderException("ItemProvider can not be null");
        }
        int iViewType = baseItemProvider.viewType();
        if (this.mItemProviders.get(iViewType) == null) {
            this.mItemProviders.put(iViewType, baseItemProvider);
        }
    }
}
