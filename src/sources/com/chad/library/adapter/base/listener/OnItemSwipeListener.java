package com.chad.library.adapter.base.listener;

import android.graphics.Canvas;
import androidx.recyclerview.widget.g2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public interface OnItemSwipeListener {
    void clearView(g2 g2Var, int i11);

    void onItemSwipeMoving(Canvas canvas, g2 g2Var, float f5, float f11, boolean z11);

    void onItemSwipeStart(g2 g2Var, int i11);

    void onItemSwiped(g2 g2Var, int i11);
}
