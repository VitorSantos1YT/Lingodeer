package p9;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.c2;
import androidx.recyclerview.widget.g2;
import androidx.recyclerview.widget.j1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class u extends j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Drawable f46700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f46701b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f46702c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v f46703d;

    public u(v vVar) {
        this.f46703d = vVar;
    }

    public final boolean a(View view, RecyclerView recyclerView) {
        g2 childViewHolder = recyclerView.getChildViewHolder(view);
        if (!(childViewHolder instanceof g0) || !((g0) childViewHolder).f46667e) {
            return false;
        }
        boolean z11 = this.f46702c;
        int iIndexOfChild = recyclerView.indexOfChild(view);
        if (iIndexOfChild >= recyclerView.getChildCount() - 1) {
            return z11;
        }
        g2 childViewHolder2 = recyclerView.getChildViewHolder(recyclerView.getChildAt(iIndexOfChild + 1));
        return (childViewHolder2 instanceof g0) && ((g0) childViewHolder2).f46666d;
    }

    @Override // androidx.recyclerview.widget.j1
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, c2 c2Var) {
        if (a(view, recyclerView)) {
            rect.bottom = this.f46701b;
        }
    }

    @Override // androidx.recyclerview.widget.j1
    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, c2 c2Var) {
        if (this.f46700a == null) {
            return;
        }
        int childCount = recyclerView.getChildCount();
        int width = recyclerView.getWidth();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = recyclerView.getChildAt(i11);
            if (a(childAt, recyclerView)) {
                int height = childAt.getHeight() + ((int) childAt.getY());
                this.f46700a.setBounds(0, height, width, this.f46701b + height);
                this.f46700a.draw(canvas);
            }
        }
    }
}
