package com.chad.library.adapter.base.listener;

import android.graphics.Canvas;
import androidx.recyclerview.widget.g2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public interface IDraggableListener {
    boolean hasToggleView();

    boolean isItemDraggable();

    boolean isItemSwipeEnable();

    void onItemDragEnd(g2 g2Var);

    void onItemDragMoving(g2 g2Var, g2 g2Var2);

    void onItemDragStart(g2 g2Var);

    void onItemSwipeClear(g2 g2Var);

    void onItemSwipeStart(g2 g2Var);

    void onItemSwiped(g2 g2Var);

    void onItemSwiping(Canvas canvas, g2 g2Var, float f5, float f11, boolean z11);
}
