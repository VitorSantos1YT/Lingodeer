package com.google.android.flexbox;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.c2;
import androidx.recyclerview.widget.j1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class FlexboxItemDecoration extends j1 {
    @Override // androidx.recyclerview.widget.j1
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, c2 c2Var) {
        if (recyclerView.getChildAdapterPosition(view) == 0) {
            return;
        }
        rect.set(0, 0, 0, 0);
    }

    @Override // androidx.recyclerview.widget.j1
    public final void onDraw(Canvas canvas, RecyclerView recyclerView, c2 c2Var) {
    }
}
