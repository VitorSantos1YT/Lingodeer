package com.chad.library.adapter.base;

import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.g2;
import androidx.recyclerview.widget.i0;
import com.chad.library.adapter.base.listener.IDraggableListener;
import com.chad.library.adapter.base.listener.OnItemDragListener;
import com.chad.library.adapter.base.listener.OnItemSwipeListener;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class DraggableController implements IDraggableListener {
    private static final int NO_TOGGLE_VIEW = 0;
    private BaseQuickAdapter mAdapter;
    private i0 mItemTouchHelper;
    private OnItemDragListener mOnItemDragListener;
    private OnItemSwipeListener mOnItemSwipeListener;
    private View.OnLongClickListener mOnToggleViewLongClickListener;
    private View.OnTouchListener mOnToggleViewTouchListener;
    private int mToggleViewId = 0;
    private boolean itemDragEnabled = false;
    private boolean itemSwipeEnabled = false;
    private boolean mDragOnLongPress = true;

    public DraggableController(BaseQuickAdapter baseQuickAdapter) {
        this.mAdapter = baseQuickAdapter;
    }

    public static /* synthetic */ i0 access$000(DraggableController draggableController) {
        draggableController.getClass();
        return null;
    }

    private boolean inRange(int i11) {
        return i11 >= 0 && i11 < this.mAdapter.getData().size();
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
        return g2Var.getAdapterPosition() - this.mAdapter.getHeaderLayoutCount();
    }

    @Override // com.chad.library.adapter.base.listener.IDraggableListener
    public boolean hasToggleView() {
        return this.mToggleViewId != 0;
    }

    public void initView(BaseViewHolder baseViewHolder) {
        baseViewHolder.getItemViewType();
    }

    @Override // com.chad.library.adapter.base.listener.IDraggableListener
    public boolean isItemDraggable() {
        return this.itemDragEnabled;
    }

    @Override // com.chad.library.adapter.base.listener.IDraggableListener
    public boolean isItemSwipeEnable() {
        return this.itemSwipeEnabled;
    }

    @Override // com.chad.library.adapter.base.listener.IDraggableListener
    public void onItemDragEnd(g2 g2Var) {
        OnItemDragListener onItemDragListener = this.mOnItemDragListener;
        if (onItemDragListener == null || !this.itemDragEnabled) {
            return;
        }
        onItemDragListener.onItemDragEnd(g2Var, getViewHolderPosition(g2Var));
    }

    @Override // com.chad.library.adapter.base.listener.IDraggableListener
    public void onItemDragMoving(g2 g2Var, g2 g2Var2) {
        int viewHolderPosition = getViewHolderPosition(g2Var);
        int viewHolderPosition2 = getViewHolderPosition(g2Var2);
        if (inRange(viewHolderPosition) && inRange(viewHolderPosition2)) {
            if (viewHolderPosition < viewHolderPosition2) {
                int i11 = viewHolderPosition;
                while (i11 < viewHolderPosition2) {
                    int i12 = i11 + 1;
                    Collections.swap(this.mAdapter.getData(), i11, i12);
                    i11 = i12;
                }
            } else {
                for (int i13 = viewHolderPosition; i13 > viewHolderPosition2; i13--) {
                    Collections.swap(this.mAdapter.getData(), i13, i13 - 1);
                }
            }
            this.mAdapter.notifyItemMoved(g2Var.getAdapterPosition(), g2Var2.getAdapterPosition());
        }
        OnItemDragListener onItemDragListener = this.mOnItemDragListener;
        if (onItemDragListener == null || !this.itemDragEnabled) {
            return;
        }
        onItemDragListener.onItemDragMoving(g2Var, viewHolderPosition, g2Var2, viewHolderPosition2);
    }

    @Override // com.chad.library.adapter.base.listener.IDraggableListener
    public void onItemDragStart(g2 g2Var) {
        OnItemDragListener onItemDragListener = this.mOnItemDragListener;
        if (onItemDragListener == null || !this.itemDragEnabled) {
            return;
        }
        onItemDragListener.onItemDragStart(g2Var, getViewHolderPosition(g2Var));
    }

    @Override // com.chad.library.adapter.base.listener.IDraggableListener
    public void onItemSwipeClear(g2 g2Var) {
        OnItemSwipeListener onItemSwipeListener = this.mOnItemSwipeListener;
        if (onItemSwipeListener == null || !this.itemSwipeEnabled) {
            return;
        }
        onItemSwipeListener.clearView(g2Var, getViewHolderPosition(g2Var));
    }

    @Override // com.chad.library.adapter.base.listener.IDraggableListener
    public void onItemSwipeStart(g2 g2Var) {
        OnItemSwipeListener onItemSwipeListener = this.mOnItemSwipeListener;
        if (onItemSwipeListener == null || !this.itemSwipeEnabled) {
            return;
        }
        onItemSwipeListener.onItemSwipeStart(g2Var, getViewHolderPosition(g2Var));
    }

    @Override // com.chad.library.adapter.base.listener.IDraggableListener
    public void onItemSwiped(g2 g2Var) {
        OnItemSwipeListener onItemSwipeListener = this.mOnItemSwipeListener;
        if (onItemSwipeListener != null && this.itemSwipeEnabled) {
            onItemSwipeListener.onItemSwiped(g2Var, getViewHolderPosition(g2Var));
        }
        int viewHolderPosition = getViewHolderPosition(g2Var);
        if (inRange(viewHolderPosition)) {
            this.mAdapter.getData().remove(viewHolderPosition);
            this.mAdapter.notifyItemRemoved(g2Var.getAdapterPosition());
        }
    }

    @Override // com.chad.library.adapter.base.listener.IDraggableListener
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
            this.mOnToggleViewLongClickListener = new View.OnLongClickListener() { // from class: com.chad.library.adapter.base.DraggableController.1
                @Override // android.view.View.OnLongClickListener
                public boolean onLongClick(View view) {
                    DraggableController.access$000(DraggableController.this);
                    return true;
                }
            };
        } else {
            this.mOnToggleViewTouchListener = new View.OnTouchListener() { // from class: com.chad.library.adapter.base.DraggableController.2
                @Override // android.view.View.OnTouchListener
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    if (motionEvent.getActionMasked() != 0 || DraggableController.this.mDragOnLongPress) {
                        return false;
                    }
                    DraggableController.access$000(DraggableController.this);
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

    public void enableDragItem(i0 i0Var, int i11, boolean z11) {
        this.itemDragEnabled = true;
        setToggleViewId(i11);
        setToggleDragOnLongPress(z11);
    }
}
