package com.chad.library.adapter.base;

import android.util.SparseIntArray;
import android.view.ViewGroup;
import com.chad.library.adapter.base.BaseViewHolder;
import com.chad.library.adapter.base.entity.IExpandable;
import com.chad.library.adapter.base.entity.SectionMultiEntity;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class BaseSectionMultiItemQuickAdapter<T extends SectionMultiEntity, K extends BaseViewHolder> extends BaseQuickAdapter<T, K> {
    private static final int DEFAULT_VIEW_TYPE = -255;
    protected static final int SECTION_HEADER_VIEW = 1092;
    public static final int TYPE_NOT_FOUND = -404;
    private SparseIntArray layouts;
    protected int mSectionHeadResId;

    public BaseSectionMultiItemQuickAdapter(int i11, List<T> list) {
        super(list);
        this.mSectionHeadResId = i11;
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

    public abstract void convertHead(K k11, T t6);

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public int getDefItemViewType(int i11) {
        T t6 = this.mData.get(i11);
        if (t6 != null) {
            return t6.isHeader ? SECTION_HEADER_VIEW : t6.getItemType();
        }
        return DEFAULT_VIEW_TYPE;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public boolean isFixedViewType(int i11) {
        return super.isFixedViewType(i11) || i11 == SECTION_HEADER_VIEW;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public K onCreateDefViewHolder(ViewGroup viewGroup, int i11) {
        return i11 == SECTION_HEADER_VIEW ? createBaseViewHolder(getItemView(this.mSectionHeadResId, viewGroup)) : createBaseViewHolder(viewGroup, getLayoutId(i11));
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
        int parentPosition = getParentPosition(t6);
        if (parentPosition >= 0) {
            ((IExpandable) this.mData.get(parentPosition)).getSubItems().remove(t6);
        }
    }

    public void setDefaultViewTypeLayout(int i11) {
        addItemType(DEFAULT_VIEW_TYPE, i11);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter, androidx.recyclerview.widget.b1
    public void onBindViewHolder(K k11, int i11) {
        if (k11.getItemViewType() != SECTION_HEADER_VIEW) {
            super.onBindViewHolder((BaseViewHolder) k11, i11);
        } else {
            setFullSpan(k11);
            convertHead(k11, getItem(i11 - getHeaderLayoutCount()));
        }
    }
}
