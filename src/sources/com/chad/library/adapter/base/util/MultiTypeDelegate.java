package com.chad.library.adapter.base.util;

import android.util.SparseIntArray;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class MultiTypeDelegate<T> {
    private static final int DEFAULT_VIEW_TYPE = -255;
    private boolean autoMode;
    private SparseIntArray layouts;
    private boolean selfMode;

    public MultiTypeDelegate(SparseIntArray sparseIntArray) {
        this.layouts = sparseIntArray;
    }

    private void addItemType(int i11, int i12) {
        if (this.layouts == null) {
            this.layouts = new SparseIntArray();
        }
        this.layouts.put(i11, i12);
    }

    private void checkMode(boolean z11) {
        if (z11) {
            throw new IllegalArgumentException("Don't mess two register mode");
        }
    }

    public final int getDefItemViewType(List<T> list, int i11) {
        T t6 = list.get(i11);
        return t6 != null ? getItemType(t6) : DEFAULT_VIEW_TYPE;
    }

    public abstract int getItemType(T t6);

    public final int getLayoutId(int i11) {
        return this.layouts.get(i11, -404);
    }

    public MultiTypeDelegate registerItemType(int i11, int i12) {
        this.selfMode = true;
        checkMode(this.autoMode);
        addItemType(i11, i12);
        return this;
    }

    public MultiTypeDelegate registerItemTypeAutoIncrease(int... iArr) {
        this.autoMode = true;
        checkMode(this.selfMode);
        for (int i11 = 0; i11 < iArr.length; i11++) {
            addItemType(i11, iArr[i11]);
        }
        return this;
    }

    public MultiTypeDelegate() {
    }
}
