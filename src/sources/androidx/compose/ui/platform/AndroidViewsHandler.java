package androidx.compose.ui.platform;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import java.util.HashMap;
import v2.a;
import y2.i0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class AndroidViewsHandler extends ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f1205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f1206b;

    public AndroidViewsHandler(Context context) {
        super(context);
        setClipChildren(false);
        this.f1205a = new HashMap();
        this.f1206b = new HashMap();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public final HashMap<AndroidViewHolder, i0> getHolderToLayoutNode() {
        return this.f1205a;
    }

    public final HashMap<i0, AndroidViewHolder> getLayoutNodeToHolder() {
        return this.f1206b;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final /* bridge */ /* synthetic */ ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        for (AndroidViewHolder androidViewHolder : this.f1205a.keySet()) {
            androidViewHolder.layout(androidViewHolder.getLeft(), androidViewHolder.getTop(), androidViewHolder.getRight(), androidViewHolder.getBottom());
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i11, int i12) {
        int i13;
        if (!(View.MeasureSpec.getMode(i11) == 1073741824)) {
            a.a("widthMeasureSpec should be EXACTLY");
        }
        if (!(View.MeasureSpec.getMode(i12) == 1073741824)) {
            a.a("heightMeasureSpec should be EXACTLY");
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i11), View.MeasureSpec.getSize(i12));
        for (AndroidViewHolder androidViewHolder : this.f1205a.keySet()) {
            int i14 = androidViewHolder.f1217a0;
            if (i14 != Integer.MIN_VALUE && (i13 = androidViewHolder.f1219b0) != Integer.MIN_VALUE) {
                androidViewHolder.measure(i14, i13);
            }
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        cleanupLayoutState(this);
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            i0 i0Var = (i0) this.f1205a.get(childAt);
            if (childAt.isLayoutRequested() && i0Var != null) {
                i0.Y(i0Var, false, 7);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
    }
}
