package com.chad.library.adapter.base.diff;

import androidx.recyclerview.widget.u;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class BaseQuickDiffCallback<T> extends u {
    private List<T> newList;
    private List<T> oldList;

    public BaseQuickDiffCallback(List<T> list) {
        this.newList = list == null ? new ArrayList<>() : list;
    }

    @Override // androidx.recyclerview.widget.u
    public boolean areContentsTheSame(int i11, int i12) {
        return areContentsTheSame(this.oldList.get(i11), this.newList.get(i12));
    }

    public abstract boolean areContentsTheSame(T t6, T t8);

    @Override // androidx.recyclerview.widget.u
    public boolean areItemsTheSame(int i11, int i12) {
        return areItemsTheSame(this.oldList.get(i11), this.newList.get(i12));
    }

    public abstract boolean areItemsTheSame(T t6, T t8);

    public Object getChangePayload(T t6, T t8) {
        return null;
    }

    public List<T> getNewList() {
        return this.newList;
    }

    @Override // androidx.recyclerview.widget.u
    public int getNewListSize() {
        return this.newList.size();
    }

    public List<T> getOldList() {
        return this.oldList;
    }

    @Override // androidx.recyclerview.widget.u
    public int getOldListSize() {
        return this.oldList.size();
    }

    public void setOldList(List<T> list) {
        if (list == null) {
            list = new ArrayList<>();
        }
        this.oldList = list;
    }

    @Override // androidx.recyclerview.widget.u
    public Object getChangePayload(int i11, int i12) {
        return getChangePayload(this.oldList.get(i11), this.newList.get(i12));
    }
}
