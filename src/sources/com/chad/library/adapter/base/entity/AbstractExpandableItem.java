package com.chad.library.adapter.base.entity;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractExpandableItem<T> implements IExpandable<T> {
    protected boolean mExpandable = false;
    protected List<T> mSubItems;

    public void addSubItem(T t6) {
        if (this.mSubItems == null) {
            this.mSubItems = new ArrayList();
        }
        this.mSubItems.add(t6);
    }

    public boolean contains(T t6) {
        List<T> list = this.mSubItems;
        return list != null && list.contains(t6);
    }

    public T getSubItem(int i11) {
        if (!hasSubItem() || i11 >= this.mSubItems.size()) {
            return null;
        }
        return this.mSubItems.get(i11);
    }

    public int getSubItemPosition(T t6) {
        List<T> list = this.mSubItems;
        if (list != null) {
            return list.indexOf(t6);
        }
        return -1;
    }

    @Override // com.chad.library.adapter.base.entity.IExpandable
    public List<T> getSubItems() {
        return this.mSubItems;
    }

    public boolean hasSubItem() {
        List<T> list = this.mSubItems;
        return list != null && list.size() > 0;
    }

    @Override // com.chad.library.adapter.base.entity.IExpandable
    public boolean isExpanded() {
        return this.mExpandable;
    }

    public boolean removeSubItem(T t6) {
        List<T> list = this.mSubItems;
        return list != null && list.remove(t6);
    }

    @Override // com.chad.library.adapter.base.entity.IExpandable
    public void setExpanded(boolean z11) {
        this.mExpandable = z11;
    }

    public void setSubItems(List<T> list) {
        this.mSubItems = list;
    }

    public boolean removeSubItem(int i11) {
        List<T> list = this.mSubItems;
        if (list == null || i11 < 0 || i11 >= list.size()) {
            return false;
        }
        this.mSubItems.remove(i11);
        return true;
    }

    public void addSubItem(int i11, T t6) {
        List<T> list = this.mSubItems;
        if (list != null && i11 >= 0 && i11 < list.size()) {
            this.mSubItems.add(i11, t6);
        } else {
            addSubItem(t6);
        }
    }
}
