package com.chad.library.adapter.base;

import android.util.SparseIntArray;
import android.view.ViewGroup;
import com.chad.library.adapter.base.BaseViewHolder;
import com.chad.library.adapter.base.entity.IExpandable;
import com.chad.library.adapter.base.entity.MultiItemEntity;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class BaseMultiItemQuickAdapter<T extends MultiItemEntity, K extends BaseViewHolder> extends BaseQuickAdapter<T, K> {
    private static final int DEFAULT_VIEW_TYPE = -255;
    public static final int TYPE_NOT_FOUND = -404;
    private SparseIntArray layouts;

    public BaseMultiItemQuickAdapter(List<T> list) {
        super(list);
    }

    private int getLayoutId(int i11) {
        return this.layouts.get(i11, -404);
    }

    public void addItemType(int i11, int i12) {
        if (this.layouts == null) {
            this.layouts = new SparseIntArray();
        }
        this.layouts.put(i11, i12);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public int getDefItemViewType(int i11) {
        T t6 = this.mData.get(i11);
        return t6 != null ? t6.getItemType() : DEFAULT_VIEW_TYPE;
    }

    public int getParentPositionInAll(int i11) {
        List<T> data = getData();
        T item = getItem(i11);
        if (!isExpandable((MultiItemEntity) item)) {
            for (int i12 = i11 - 1; i12 >= 0; i12--) {
                if (isExpandable((MultiItemEntity) data.get(i12))) {
                    return i12;
                }
            }
            return -1;
        }
        IExpandable iExpandable = (IExpandable) item;
        for (int i13 = i11 - 1; i13 >= 0; i13--) {
            T t6 = data.get(i13);
            if (isExpandable((MultiItemEntity) t6) && iExpandable.getLevel() > ((IExpandable) t6).getLevel()) {
                return i13;
            }
        }
        return -1;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public K onCreateDefViewHolder(ViewGroup viewGroup, int i11) {
        return createBaseViewHolder(viewGroup, getLayoutId(i11));
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void remove(int i11) {
        List<T> list = this.mData;
        if (list == null || i11 < 0 || i11 >= list.size()) {
            return;
        }
        T t6 = this.mData.get(i11);
        if (t6 instanceof IExpandable) {
            removeAllChild((IExpandable) t6, i11);
        }
        removeDataFromParent(t6);
        super.remove(i11);
    }

    public void removeAllChild(IExpandable iExpandable, int i11) {
        List subItems;
        if (!iExpandable.isExpanded() || (subItems = iExpandable.getSubItems()) == null || subItems.size() == 0) {
            return;
        }
        int size = subItems.size();
        for (int i12 = 0; i12 < size; i12++) {
            remove(i11 + 1);
        }
    }

    public void removeDataFromParent(T t6) {
        IExpandable iExpandable;
        int parentPosition = getParentPosition(t6);
        if (parentPosition < 0 || (iExpandable = (IExpandable) this.mData.get(parentPosition)) == t6) {
            return;
        }
        iExpandable.getSubItems().remove(t6);
    }

    public void setDefaultViewTypeLayout(int i11) {
        addItemType(DEFAULT_VIEW_TYPE, i11);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public boolean isExpandable(MultiItemEntity multiItemEntity) {
        return multiItemEntity != null && (multiItemEntity instanceof IExpandable);
    }
}
