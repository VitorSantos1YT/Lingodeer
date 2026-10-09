package com.chad.library.adapter.base.callback;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.g2;
import androidx.recyclerview.widget.h0;
import androidx.recyclerview.widget.m1;
import com.chad.library.adapter.base.BaseItemDraggableAdapter;
import com.chad.library.adapter.base.DraggableController;
import com.chad.library.adapter.base.listener.IDraggableListener;
import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;
import java.util.WeakHashMap;
import z4.j0;
import z4.s0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class ItemDragAndSwipeCallback extends h0 {
    private BaseItemDraggableAdapter mBaseItemDraggableAdapter;
    private IDraggableListener mDraggableListener;
    private float mMoveThreshold = 0.1f;
    private float mSwipeThreshold = 0.7f;
    private int mDragMoveFlags = 15;
    private int mSwipeMoveFlags = 32;

    public ItemDragAndSwipeCallback(BaseItemDraggableAdapter baseItemDraggableAdapter) {
        this.mBaseItemDraggableAdapter = baseItemDraggableAdapter;
    }

    private boolean isViewCreateByAdapter(g2 g2Var) {
        int itemViewType = g2Var.getItemViewType();
        return itemViewType == 273 || itemViewType == 546 || itemViewType == 819 || itemViewType == 1365;
    }

    public void clearView(RecyclerView recyclerView, g2 g2Var) {
        View view = g2Var.itemView;
        Object tag = view.getTag(R.id.item_touch_helper_previous_elevation);
        if (tag instanceof Float) {
            float fFloatValue = ((Float) tag).floatValue();
            WeakHashMap weakHashMap = s0.f58893a;
            j0.k(view, fFloatValue);
        }
        view.setTag(R.id.item_touch_helper_previous_elevation, null);
        view.setTranslationX(CropImageView.DEFAULT_ASPECT_RATIO);
        view.setTranslationY(CropImageView.DEFAULT_ASPECT_RATIO);
        if (isViewCreateByAdapter(g2Var)) {
            return;
        }
        if (g2Var.itemView.getTag(R.id.BaseQuickAdapter_dragging_support) != null && ((Boolean) g2Var.itemView.getTag(R.id.BaseQuickAdapter_dragging_support)).booleanValue()) {
            BaseItemDraggableAdapter baseItemDraggableAdapter = this.mBaseItemDraggableAdapter;
            if (baseItemDraggableAdapter != null) {
                baseItemDraggableAdapter.onItemDragEnd(g2Var);
            } else {
                IDraggableListener iDraggableListener = this.mDraggableListener;
                if (iDraggableListener != null) {
                    iDraggableListener.onItemDragEnd(g2Var);
                }
            }
            g2Var.itemView.setTag(R.id.BaseQuickAdapter_dragging_support, Boolean.FALSE);
        }
        if (g2Var.itemView.getTag(R.id.BaseQuickAdapter_swiping_support) == null || !((Boolean) g2Var.itemView.getTag(R.id.BaseQuickAdapter_swiping_support)).booleanValue()) {
            return;
        }
        BaseItemDraggableAdapter baseItemDraggableAdapter2 = this.mBaseItemDraggableAdapter;
        if (baseItemDraggableAdapter2 != null) {
            baseItemDraggableAdapter2.onItemSwipeClear(g2Var);
        } else {
            IDraggableListener iDraggableListener2 = this.mDraggableListener;
            if (iDraggableListener2 != null) {
                iDraggableListener2.onItemSwipeClear(g2Var);
            }
        }
        g2Var.itemView.setTag(R.id.BaseQuickAdapter_swiping_support, Boolean.FALSE);
    }

    public float getMoveThreshold(g2 g2Var) {
        return this.mMoveThreshold;
    }

    @Override // androidx.recyclerview.widget.h0
    public int getMovementFlags(RecyclerView recyclerView, g2 g2Var) {
        return isViewCreateByAdapter(g2Var) ? h0.makeMovementFlags(0, 0) : h0.makeMovementFlags(this.mDragMoveFlags, this.mSwipeMoveFlags);
    }

    public float getSwipeThreshold(g2 g2Var) {
        return this.mSwipeThreshold;
    }

    public boolean isItemViewSwipeEnabled() {
        BaseItemDraggableAdapter baseItemDraggableAdapter = this.mBaseItemDraggableAdapter;
        if (baseItemDraggableAdapter != null) {
            return baseItemDraggableAdapter.isItemSwipeEnable();
        }
        IDraggableListener iDraggableListener = this.mDraggableListener;
        if (iDraggableListener != null) {
            return iDraggableListener.isItemSwipeEnable();
        }
        return false;
    }

    public boolean isLongPressDragEnabled() {
        BaseItemDraggableAdapter baseItemDraggableAdapter = this.mBaseItemDraggableAdapter;
        if (baseItemDraggableAdapter != null) {
            return baseItemDraggableAdapter.isItemDraggable() && !this.mBaseItemDraggableAdapter.hasToggleView();
        }
        IDraggableListener iDraggableListener = this.mDraggableListener;
        return (iDraggableListener == null || !iDraggableListener.isItemDraggable() || this.mDraggableListener.hasToggleView()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.h0
    public void onChildDrawOver(Canvas canvas, RecyclerView recyclerView, g2 g2Var, float f5, float f11, int i11, boolean z11) {
        Canvas canvas2;
        View view = g2Var.itemView;
        if (i11 != 1 || isViewCreateByAdapter(g2Var)) {
            return;
        }
        View view2 = g2Var.itemView;
        canvas.save();
        if (f5 > CropImageView.DEFAULT_ASPECT_RATIO) {
            canvas.clipRect(view2.getLeft(), view2.getTop(), view2.getLeft() + f5, view2.getBottom());
            canvas.translate(view2.getLeft(), view2.getTop());
        } else {
            canvas.clipRect(view2.getRight() + f5, view2.getTop(), view2.getRight(), view2.getBottom());
            canvas.translate(view2.getRight() + f5, view2.getTop());
        }
        BaseItemDraggableAdapter baseItemDraggableAdapter = this.mBaseItemDraggableAdapter;
        if (baseItemDraggableAdapter != null) {
            baseItemDraggableAdapter.onItemSwiping(canvas, g2Var, f5, f11, z11);
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            IDraggableListener iDraggableListener = this.mDraggableListener;
            if (iDraggableListener != null) {
                iDraggableListener.onItemSwiping(canvas2, g2Var, f5, f11, z11);
            }
        }
        canvas2.restore();
    }

    public boolean onMove(RecyclerView recyclerView, g2 g2Var, g2 g2Var2) {
        return g2Var.getItemViewType() == g2Var2.getItemViewType();
    }

    public void onMoved(RecyclerView recyclerView, g2 g2Var, int i11, g2 g2Var2, int i12, int i13, int i14) {
        m1 layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            ((LinearLayoutManager) layoutManager).prepareForDrop(g2Var.itemView, g2Var2.itemView, i13, i14);
        } else {
            if (layoutManager.canScrollHorizontally()) {
                if (layoutManager.getDecoratedLeft(g2Var2.itemView) <= recyclerView.getPaddingLeft()) {
                    recyclerView.scrollToPosition(i12);
                }
                if (layoutManager.getDecoratedRight(g2Var2.itemView) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                    recyclerView.scrollToPosition(i12);
                }
            }
            if (layoutManager.canScrollVertically()) {
                if (layoutManager.getDecoratedTop(g2Var2.itemView) <= recyclerView.getPaddingTop()) {
                    recyclerView.scrollToPosition(i12);
                }
                if (layoutManager.getDecoratedBottom(g2Var2.itemView) >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                    recyclerView.scrollToPosition(i12);
                }
            }
        }
        BaseItemDraggableAdapter baseItemDraggableAdapter = this.mBaseItemDraggableAdapter;
        if (baseItemDraggableAdapter != null) {
            baseItemDraggableAdapter.onItemDragMoving(g2Var, g2Var2);
            return;
        }
        IDraggableListener iDraggableListener = this.mDraggableListener;
        if (iDraggableListener != null) {
            iDraggableListener.onItemDragMoving(g2Var, g2Var2);
        }
    }

    public void onSelectedChanged(g2 g2Var, int i11) {
        if (i11 == 2 && !isViewCreateByAdapter(g2Var)) {
            BaseItemDraggableAdapter baseItemDraggableAdapter = this.mBaseItemDraggableAdapter;
            if (baseItemDraggableAdapter != null) {
                baseItemDraggableAdapter.onItemDragStart(g2Var);
            } else {
                IDraggableListener iDraggableListener = this.mDraggableListener;
                if (iDraggableListener != null) {
                    iDraggableListener.onItemDragStart(g2Var);
                }
            }
            g2Var.itemView.setTag(R.id.BaseQuickAdapter_dragging_support, Boolean.TRUE);
            return;
        }
        if (i11 != 1 || isViewCreateByAdapter(g2Var)) {
            return;
        }
        BaseItemDraggableAdapter baseItemDraggableAdapter2 = this.mBaseItemDraggableAdapter;
        if (baseItemDraggableAdapter2 != null) {
            baseItemDraggableAdapter2.onItemSwipeStart(g2Var);
        } else {
            IDraggableListener iDraggableListener2 = this.mDraggableListener;
            if (iDraggableListener2 != null) {
                iDraggableListener2.onItemSwipeStart(g2Var);
            }
        }
        g2Var.itemView.setTag(R.id.BaseQuickAdapter_swiping_support, Boolean.TRUE);
    }

    public void onSwiped(g2 g2Var, int i11) {
        if (isViewCreateByAdapter(g2Var)) {
            return;
        }
        BaseItemDraggableAdapter baseItemDraggableAdapter = this.mBaseItemDraggableAdapter;
        if (baseItemDraggableAdapter != null) {
            baseItemDraggableAdapter.onItemSwiped(g2Var);
            return;
        }
        IDraggableListener iDraggableListener = this.mDraggableListener;
        if (iDraggableListener != null) {
            iDraggableListener.onItemSwiped(g2Var);
        }
    }

    public void setDragMoveFlags(int i11) {
        this.mDragMoveFlags = i11;
    }

    public void setMoveThreshold(float f5) {
        this.mMoveThreshold = f5;
    }

    public void setSwipeMoveFlags(int i11) {
        this.mSwipeMoveFlags = i11;
    }

    public void setSwipeThreshold(float f5) {
        this.mSwipeThreshold = f5;
    }

    public ItemDragAndSwipeCallback(DraggableController draggableController) {
        this.mDraggableListener = draggableController;
    }
}
