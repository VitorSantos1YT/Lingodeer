package com.youth.banner.itemdecoration;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.c2;
import androidx.recyclerview.widget.j1;
import androidx.recyclerview.widget.m1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public class MarginDecoration extends j1 {
    private int mMarginPx;

    public MarginDecoration(int i11) {
        this.mMarginPx = i11;
    }

    private LinearLayoutManager requireLinearLayoutManager(RecyclerView recyclerView) {
        m1 layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            return (LinearLayoutManager) layoutManager;
        }
        throw new IllegalStateException("The layoutManager must be LinearLayoutManager");
    }

    @Override // androidx.recyclerview.widget.j1
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, c2 c2Var) {
        if (requireLinearLayoutManager(recyclerView).getOrientation() == 1) {
            int i11 = this.mMarginPx;
            rect.top = i11;
            rect.bottom = i11;
        } else {
            int i12 = this.mMarginPx;
            rect.left = i12;
            rect.right = i12;
        }
    }
}
