package androidx.recyclerview.widget;

import android.graphics.PointF;
import android.view.View;
import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class w0 extends k2 {
    private static final int MAX_SCROLL_ON_FLING_DURATION = 100;
    private u0 mHorizontalHelper;
    private u0 mVerticalHelper;

    public static int a(View view, u0 u0Var) {
        return ((u0Var.c(view) / 2) + u0Var.e(view)) - ((u0Var.l() / 2) + u0Var.k());
    }

    public static View b(m1 m1Var, u0 u0Var) {
        int childCount = m1Var.getChildCount();
        View view = null;
        if (childCount == 0) {
            return null;
        }
        int iL = (u0Var.l() / 2) + u0Var.k();
        int i11 = Integer.MAX_VALUE;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = m1Var.getChildAt(i12);
            int iAbs = Math.abs(((u0Var.c(childAt) / 2) + u0Var.e(childAt)) - iL);
            if (iAbs < i11) {
                view = childAt;
                i11 = iAbs;
            }
        }
        return view;
    }

    public final u0 c(m1 m1Var) {
        u0 u0Var = this.mHorizontalHelper;
        if (u0Var == null || u0Var.f2626a != m1Var) {
            this.mHorizontalHelper = new t0(m1Var, 0);
        }
        return this.mHorizontalHelper;
    }

    @Override // androidx.recyclerview.widget.k2
    public int[] calculateDistanceToFinalSnap(m1 m1Var, View view) {
        int[] iArr = new int[2];
        if (m1Var.canScrollHorizontally()) {
            iArr[0] = a(view, c(m1Var));
        } else {
            iArr[0] = 0;
        }
        if (m1Var.canScrollVertically()) {
            iArr[1] = a(view, d(m1Var));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    @Override // androidx.recyclerview.widget.k2
    public b2 createScroller(m1 m1Var) {
        if (m1Var instanceof a2) {
            return new v0(this, this.mRecyclerView.getContext(), 0);
        }
        return null;
    }

    public final u0 d(m1 m1Var) {
        u0 u0Var = this.mVerticalHelper;
        if (u0Var == null || u0Var.f2626a != m1Var) {
            this.mVerticalHelper = new t0(m1Var, 1);
        }
        return this.mVerticalHelper;
    }

    @Override // androidx.recyclerview.widget.k2
    public View findSnapView(m1 m1Var) {
        if (m1Var.canScrollVertically()) {
            return b(m1Var, d(m1Var));
        }
        if (m1Var.canScrollHorizontally()) {
            return b(m1Var, c(m1Var));
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.k2
    public int findTargetSnapPosition(m1 m1Var, int i11, int i12) {
        PointF pointFComputeScrollVectorForPosition;
        int itemCount = m1Var.getItemCount();
        if (itemCount != 0) {
            View view = null;
            u0 u0VarD = m1Var.canScrollVertically() ? d(m1Var) : m1Var.canScrollHorizontally() ? c(m1Var) : null;
            if (u0VarD != null) {
                int childCount = m1Var.getChildCount();
                boolean z11 = false;
                int i13 = Integer.MAX_VALUE;
                int i14 = Integer.MIN_VALUE;
                View view2 = null;
                for (int i15 = 0; i15 < childCount; i15++) {
                    View childAt = m1Var.getChildAt(i15);
                    if (childAt != null) {
                        int iA = a(childAt, u0VarD);
                        if (iA <= 0 && iA > i14) {
                            view2 = childAt;
                            i14 = iA;
                        }
                        if (iA >= 0 && iA < i13) {
                            view = childAt;
                            i13 = iA;
                        }
                    }
                }
                boolean z12 = !m1Var.canScrollHorizontally() ? i12 <= 0 : i11 <= 0;
                if (z12 && view != null) {
                    return m1Var.getPosition(view);
                }
                if (!z12 && view2 != null) {
                    return m1Var.getPosition(view2);
                }
                if (z12) {
                    view = view2;
                }
                if (view != null) {
                    int position = m1Var.getPosition(view);
                    int itemCount2 = m1Var.getItemCount();
                    if ((m1Var instanceof a2) && (pointFComputeScrollVectorForPosition = ((a2) m1Var).computeScrollVectorForPosition(itemCount2 - 1)) != null && (pointFComputeScrollVectorForPosition.x < CropImageView.DEFAULT_ASPECT_RATIO || pointFComputeScrollVectorForPosition.y < CropImageView.DEFAULT_ASPECT_RATIO)) {
                        z11 = true;
                    }
                    int i16 = position + (z11 == z12 ? -1 : 1);
                    if (i16 >= 0 && i16 < itemCount) {
                        return i16;
                    }
                }
            }
        }
        return -1;
    }
}
