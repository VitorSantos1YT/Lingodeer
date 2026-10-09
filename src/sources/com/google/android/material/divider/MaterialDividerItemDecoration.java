package com.google.android.material.divider;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b1;
import androidx.recyclerview.widget.c2;
import androidx.recyclerview.widget.j1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class MaterialDividerItemDecoration extends j1 {
    @Override // androidx.recyclerview.widget.j1
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, c2 c2Var) {
        rect.set(0, 0, 0, 0);
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        b1 adapter = recyclerView.getAdapter();
        boolean z11 = adapter != null && childAdapterPosition == adapter.getItemCount() - 1;
        if (childAdapterPosition == -1 || z11) {
            return;
        }
        if (recyclerView.getLayoutDirection() == 1) {
            rect.left = 0;
        } else {
            rect.right = 0;
        }
    }

    @Override // androidx.recyclerview.widget.j1
    public final void onDraw(Canvas canvas, RecyclerView recyclerView, c2 c2Var) {
        if (recyclerView.getLayoutManager() == null) {
            return;
        }
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            canvas.clipRect(recyclerView.getPaddingLeft(), recyclerView.getPaddingTop(), recyclerView.getWidth() - recyclerView.getPaddingRight(), recyclerView.getHeight() - recyclerView.getPaddingBottom());
        } else {
            recyclerView.getHeight();
        }
        boolean z11 = recyclerView.getLayoutDirection() == 1;
        int childCount = recyclerView.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = recyclerView.getChildAt(i11);
            int childAdapterPosition = recyclerView.getChildAdapterPosition(childAt);
            b1 adapter = recyclerView.getAdapter();
            boolean z12 = adapter != null && childAdapterPosition == adapter.getItemCount() - 1;
            if (childAdapterPosition != -1 && !z12) {
                recyclerView.getLayoutManager().getDecoratedBoundsWithMargins(childAt, null);
                Math.round(childAt.getTranslationX());
                if (!z11) {
                    throw null;
                }
                throw null;
            }
        }
        canvas.restore();
    }
}
