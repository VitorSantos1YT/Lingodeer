package com.chad.library.adapter.base.provider;

import android.content.Context;
import com.chad.library.adapter.base.BaseViewHolder;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class BaseItemProvider<T, V extends BaseViewHolder> {
    public Context mContext;
    public List<T> mData;

    public abstract void convert(V v11, T t6, int i11);

    public abstract int layout();

    public boolean onLongClick(V v11, T t6, int i11) {
        return false;
    }

    public abstract int viewType();

    public void onClick(V v11, T t6, int i11) {
    }

    public void convertPayloads(V v11, T t6, int i11, List<Object> list) {
    }
}
