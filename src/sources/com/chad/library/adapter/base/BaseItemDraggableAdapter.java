package com.chad.library.adapter.base;

import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.g2;
import androidx.recyclerview.widget.i0;
import com.chad.library.adapter.base.BaseViewHolder;
import com.chad.library.adapter.base.listener.OnItemDragListener;
import com.chad.library.adapter.base.listener.OnItemSwipeListener;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class BaseItemDraggableAdapter<T, K extends BaseViewHolder> extends BaseQuickAdapter<T, K> {
    private static final String ERROR_NOT_SAME_ITEMTOUCHHELPER = "Item drag and item swipe should pass the same ItemTouchHelper";
    private static final int NO_TOGGLE_VIEW = 0;
    protected boolean itemDragEnabled;
    protected boolean itemSwipeEnabled;
    protected boolean mDragOnLongPress;
    protected i0 mItemTouchHelper;
    protected OnItemDragListener mOnItemDragListener;
    protected OnItemSwipeListener mOnItemSwipeListener;
    protected View.OnLongClickListener mOnToggleViewLongClickListener;
    protected View.OnTouchListener mOnToggleViewTouchListener;
    protected int mToggleViewId;

    public BaseItemDraggableAdapter(List<T> list) {
        super(list);
        this.mToggleViewId = 0;
        this.itemDragEnabled = false;
        this.itemSwipeEnabled = false;
        this.mDragOnLongPress = true;
    }

    private boolean inRange(int i11) {
        return i11 >= 0 && i11 < this.mData.size();
    }

    public void disableDragItem() {
        this.itemDragEnabled = false;
    }

    public void disableSwipeItem() {
        this.itemSwipeEnabled = false;
    }

    public void enableDragItem(i0 i0Var) {
        enableDragItem(i0Var, 0, true);
    }

    public void enableSwipeItem() {
        this.itemSwipeEnabled = true;
    }

    public int getViewHolderPosition(g2 g2Var) {
        return g2Var.getAdapterPosition() - getHeaderLayoutCount();
    }

    public boolean hasToggleView() {
        return this.mToggleViewId != 0;
    }

    public boolean isItemDraggable() {
        return this.itemDragEnabled;
    }

    public boolean isItemSwipeEnable() {
        return this.itemSwipeEnabled;
    }

    public void onItemDragEnd(g2 g2Var) {
        OnItemDragListener onItemDragListener = this.mOnItemDragListener;
        if (onItemDragListener == null || !this.itemDragEnabled) {
            return;
        }
        onItemDragListener.onItemDragEnd(g2Var, getViewHolderPosition(g2Var));
    }

    public void onItemDragMoving(g2 g2Var, g2 g2Var2) {
        int viewHolderPosition = getViewHolderPosition(g2Var);
        int viewHolderPosition2 = getViewHolderPosition(g2Var2);
        if (inRange(viewHolderPosition) && inRange(viewHolderPosition2)) {
            if (viewHolderPosition < viewHolderPosition2) {
                int i11 = viewHolderPosition;
                while (i11 < viewHolderPosition2) {
                    int i12 = i11 + 1;
                    Collections.swap(this.mData, i11, i12);
                    i11 = i12;
                }
            } else {
                for (int i13 = viewHolderPosition; i13 > viewHolderPosition2; i13--) {
                    Collections.swap(this.mData, i13, i13 - 1);
                }
            }
            notifyItemMoved(g2Var.getAdapterPosition(), g2Var2.getAdapterPosition());
        }
        OnItemDragListener onItemDragListener = this.mOnItemDragListener;
        if (onItemDragListener == null || !this.itemDragEnabled) {
            return;
        }
        onItemDragListener.onItemDragMoving(g2Var, viewHolderPosition, g2Var2, viewHolderPosition2);
    }

    public void onItemDragStart(g2 g2Var) {
        OnItemDragListener onItemDragListener = this.mOnItemDragListener;
        if (onItemDragListener == null || !this.itemDragEnabled) {
            return;
        }
        onItemDragListener.onItemDragStart(g2Var, getViewHolderPosition(g2Var));
    }

    public void onItemSwipeClear(g2 g2Var) {
        OnItemSwipeListener onItemSwipeListener = this.mOnItemSwipeListener;
        if (onItemSwipeListener == null || !this.itemSwipeEnabled) {
            return;
        }
        onItemSwipeListener.clearView(g2Var, getViewHolderPosition(g2Var));
    }

    public void onItemSwipeStart(g2 g2Var) {
        OnItemSwipeListener onItemSwipeListener = this.mOnItemSwipeListener;
        if (onItemSwipeListener == null || !this.itemSwipeEnabled) {
            return;
        }
        onItemSwipeListener.onItemSwipeStart(g2Var, getViewHolderPosition(g2Var));
    }

    public void onItemSwiped(g2 g2Var) {
        int viewHolderPosition = getViewHolderPosition(g2Var);
        if (inRange(viewHolderPosition)) {
            this.mData.remove(viewHolderPosition);
            notifyItemRemoved(g2Var.getAdapterPosition());
            OnItemSwipeListener onItemSwipeListener = this.mOnItemSwipeListener;
            if (onItemSwipeListener == null || !this.itemSwipeEnabled) {
                return;
            }
            onItemSwipeListener.onItemSwiped(g2Var, viewHolderPosition);
        }
    }

    public void onItemSwiping(Canvas canvas, g2 g2Var, float f5, float f11, boolean z11) {
        OnItemSwipeListener onItemSwipeListener = this.mOnItemSwipeListener;
        if (onItemSwipeListener == null || !this.itemSwipeEnabled) {
            return;
        }
        onItemSwipeListener.onItemSwipeMoving(canvas, g2Var, f5, f11, z11);
    }

    public void setOnItemDragListener(OnItemDragListener onItemDragListener) {
        this.mOnItemDragListener = onItemDragListener;
    }

    public void setOnItemSwipeListener(OnItemSwipeListener onItemSwipeListener) {
        this.mOnItemSwipeListener = onItemSwipeListener;
    }

    public void setToggleDragOnLongPress(boolean z11) {
        this.mDragOnLongPress = z11;
        if (z11) {
            this.mOnToggleViewTouchListener = null;
            this.mOnToggleViewLongClickListener = new View.OnLongClickListener() { // from class: com.chad.library.adapter.base.BaseItemDraggableAdapter.1
                @Override // android.view.View.OnLongClickListener
                public boolean onLongClick(View view) {
                    BaseItemDraggableAdapter.this.getClass();
                    return true;
                }
            };
        } else {
            this.mOnToggleViewTouchListener = new View.OnTouchListener() { // from class: com.chad.library.adapter.base.BaseItemDraggableAdapter.2
                @Override // android.view.View.OnTouchListener
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    if (motionEvent.getActionMasked() != 0) {
                        return false;
                    }
                    BaseItemDraggableAdapter baseItemDraggableAdapter = BaseItemDraggableAdapter.this;
                    if (baseItemDraggableAdapter.mDragOnLongPress) {
                        return false;
                    }
                    baseItemDraggableAdapter.getClass();
                    return true;
                }
            };
            this.mOnToggleViewLongClickListener = null;
        }
    }

    public void setToggleViewId(int i11) {
        this.mToggleViewId = i11;
    }

    public void enableDragItem(i0 i0Var, int i11) {
        enableDragItem(i0Var, i11, true);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter, androidx.recyclerview.widget.b1
    public void onBindViewHolder(K k11, int i11) {
        super.onBindViewHolder((BaseViewHolder) k11, i11);
        k11.getItemViewType();
    }

    public void enableDragItem(i0 i0Var, int i11, boolean z11) {
        this.itemDragEnabled = true;
        setToggleViewId(i11);
        setToggleDragOnLongPress(z11);
    }

    public BaseItemDraggableAdapter(int i11, List<T> list) {
        super(i11, list);
        this.mToggleViewId = 0;
        this.itemDragEnabled = false;
        this.itemSwipeEnabled = false;
        this.mDragOnLongPress = true;
    }
}
