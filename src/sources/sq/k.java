package sq;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.c2;
import androidx.recyclerview.widget.e0;
import androidx.recyclerview.widget.j1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class k extends j1 {
    @Override // androidx.recyclerview.widget.j1
    public final void getItemOffsets(Rect outRect, View view, RecyclerView recyclerView, c2 state) {
        kotlin.jvm.internal.m.f(outRect, "outRect");
        kotlin.jvm.internal.m.f(state, "state");
        super.getItemOffsets(outRect, view, recyclerView, state);
        if (recyclerView.getChildAdapterPosition(view) > 3) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            kotlin.jvm.internal.m.d(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager.LayoutParams");
            ((ViewGroup.MarginLayoutParams) ((e0) layoutParams)).topMargin = ff.h.l(2.0f);
        }
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        kotlin.jvm.internal.m.d(layoutParams2, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager.LayoutParams");
        ((ViewGroup.MarginLayoutParams) ((e0) layoutParams2)).leftMargin = ff.h.l(2.0f);
    }
}
