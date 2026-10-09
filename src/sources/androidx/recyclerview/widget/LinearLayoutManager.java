package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.yalantis.ucrop.view.CropImageView;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class LinearLayoutManager extends m1 implements a2 {
    static final boolean DEBUG = false;
    public static final int HORIZONTAL = 0;
    public static final int INVALID_OFFSET = Integer.MIN_VALUE;
    private static final float MAX_SCROLL_FACTOR = 0.33333334f;
    private static final String TAG = "LinearLayoutManager";
    public static final int VERTICAL = 1;
    final m0 mAnchorInfo;
    private int mInitialPrefetchItemCount;
    private boolean mLastStackFromEnd;
    private final n0 mLayoutChunkResult;
    private o0 mLayoutState;
    int mOrientation;
    u0 mOrientationHelper;
    q0 mPendingSavedState;
    int mPendingScrollPosition;
    int mPendingScrollPositionOffset;
    private boolean mRecycleChildrenOnDetach;
    private int[] mReusableIntPair;
    private boolean mReverseLayout;
    boolean mShouldReverseLayout;
    private boolean mSmoothScrollbarEnabled;
    private boolean mStackFromEnd;

    public LinearLayoutManager(int i11) {
        this.mOrientation = 1;
        this.mReverseLayout = false;
        this.mShouldReverseLayout = false;
        this.mStackFromEnd = false;
        this.mSmoothScrollbarEnabled = true;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mPendingSavedState = null;
        this.mAnchorInfo = new m0();
        this.mLayoutChunkResult = new n0();
        this.mInitialPrefetchItemCount = 2;
        this.mReusableIntPair = new int[2];
        setOrientation(i11);
        setReverseLayout(false);
    }

    public final void A(int i11, int i12) {
        this.mLayoutState.f2559c = i12 - this.mOrientationHelper.k();
        o0 o0Var = this.mLayoutState;
        o0Var.f2560d = i11;
        o0Var.f2561e = this.mShouldReverseLayout ? 1 : -1;
        o0Var.f2562f = -1;
        o0Var.f2558b = i12;
        o0Var.f2563g = Integer.MIN_VALUE;
    }

    @Override // androidx.recyclerview.widget.m1
    public void assertNotInLayoutOrScroll(String str) {
        if (this.mPendingSavedState == null) {
            super.assertNotInLayoutOrScroll(str);
        }
    }

    public void calculateExtraLayoutSpace(c2 c2Var, int[] iArr) {
        int i11;
        int extraLayoutSpace = getExtraLayoutSpace(c2Var);
        if (this.mLayoutState.f2562f == -1) {
            i11 = 0;
        } else {
            i11 = extraLayoutSpace;
            extraLayoutSpace = 0;
        }
        iArr[0] = extraLayoutSpace;
        iArr[1] = i11;
    }

    @Override // androidx.recyclerview.widget.m1
    public boolean canScrollHorizontally() {
        return this.mOrientation == 0;
    }

    @Override // androidx.recyclerview.widget.m1
    public boolean canScrollVertically() {
        return this.mOrientation == 1;
    }

    @Override // androidx.recyclerview.widget.m1
    public void collectAdjacentPrefetchPositions(int i11, int i12, c2 c2Var, l1 l1Var) {
        if (this.mOrientation != 0) {
            i11 = i12;
        }
        if (getChildCount() == 0 || i11 == 0) {
            return;
        }
        ensureLayoutState();
        y(i11 > 0 ? 1 : -1, Math.abs(i11), true, c2Var);
        collectPrefetchPositionsForLayoutState(c2Var, this.mLayoutState, l1Var);
    }

    @Override // androidx.recyclerview.widget.m1
    public void collectInitialPrefetchPositions(int i11, l1 l1Var) {
        boolean z11;
        int i12;
        q0 q0Var = this.mPendingSavedState;
        if (q0Var == null || (i12 = q0Var.f2591a) < 0) {
            x();
            z11 = this.mShouldReverseLayout;
            i12 = this.mPendingScrollPosition;
            if (i12 == -1) {
                i12 = z11 ? i11 - 1 : 0;
            }
        } else {
            z11 = q0Var.f2593c;
        }
        int i13 = z11 ? -1 : 1;
        for (int i14 = 0; i14 < this.mInitialPrefetchItemCount && i12 >= 0 && i12 < i11; i14++) {
            ((a0) l1Var).a(i12, 0);
            i12 += i13;
        }
    }

    public void collectPrefetchPositionsForLayoutState(c2 c2Var, o0 o0Var, l1 l1Var) {
        int i11 = o0Var.f2560d;
        if (i11 < 0 || i11 >= c2Var.b()) {
            return;
        }
        ((a0) l1Var).a(i11, Math.max(0, o0Var.f2563g));
    }

    @Override // androidx.recyclerview.widget.m1
    public int computeHorizontalScrollExtent(c2 c2Var) {
        return n(c2Var);
    }

    @Override // androidx.recyclerview.widget.m1
    public int computeHorizontalScrollOffset(c2 c2Var) {
        return o(c2Var);
    }

    @Override // androidx.recyclerview.widget.m1
    public int computeHorizontalScrollRange(c2 c2Var) {
        return p(c2Var);
    }

    @Override // androidx.recyclerview.widget.a2
    public PointF computeScrollVectorForPosition(int i11) {
        if (getChildCount() == 0) {
            return null;
        }
        int i12 = (i11 < getPosition(getChildAt(0))) != this.mShouldReverseLayout ? -1 : 1;
        return this.mOrientation == 0 ? new PointF(i12, CropImageView.DEFAULT_ASPECT_RATIO) : new PointF(CropImageView.DEFAULT_ASPECT_RATIO, i12);
    }

    @Override // androidx.recyclerview.widget.m1
    public int computeVerticalScrollExtent(c2 c2Var) {
        return n(c2Var);
    }

    @Override // androidx.recyclerview.widget.m1
    public int computeVerticalScrollOffset(c2 c2Var) {
        return o(c2Var);
    }

    @Override // androidx.recyclerview.widget.m1
    public int computeVerticalScrollRange(c2 c2Var) {
        return p(c2Var);
    }

    public int convertFocusDirectionToLayoutDirection(int i11) {
        if (i11 == 1) {
            return (this.mOrientation != 1 && isLayoutRTL()) ? 1 : -1;
        }
        if (i11 == 2) {
            return (this.mOrientation != 1 && isLayoutRTL()) ? -1 : 1;
        }
        if (i11 == 17) {
            return this.mOrientation == 0 ? -1 : Integer.MIN_VALUE;
        }
        if (i11 == 33) {
            return this.mOrientation == 1 ? -1 : Integer.MIN_VALUE;
        }
        if (i11 != 66) {
            return (i11 == 130 && this.mOrientation == 1) ? 1 : Integer.MIN_VALUE;
        }
        return this.mOrientation == 0 ? 1 : Integer.MIN_VALUE;
    }

    public o0 createLayoutState() {
        o0 o0Var = new o0();
        o0Var.f2557a = true;
        o0Var.f2564h = 0;
        o0Var.f2565i = 0;
        o0Var.f2567k = null;
        return o0Var;
    }

    public void ensureLayoutState() {
        if (this.mLayoutState == null) {
            this.mLayoutState = createLayoutState();
        }
    }

    public int fill(u1 u1Var, o0 o0Var, c2 c2Var, boolean z11) {
        int i11;
        int i12 = o0Var.f2559c;
        int i13 = o0Var.f2563g;
        if (i13 != Integer.MIN_VALUE) {
            if (i12 < 0) {
                o0Var.f2563g = i13 + i12;
            }
            v(u1Var, o0Var);
        }
        int i14 = o0Var.f2559c + o0Var.f2564h;
        n0 n0Var = this.mLayoutChunkResult;
        while (true) {
            if ((!o0Var.f2568l && i14 <= 0) || (i11 = o0Var.f2560d) < 0 || i11 >= c2Var.b()) {
                break;
            }
            n0Var.f2542a = 0;
            n0Var.f2543b = false;
            n0Var.f2544c = false;
            n0Var.f2545d = false;
            layoutChunk(u1Var, c2Var, o0Var, n0Var);
            if (!n0Var.f2543b) {
                int i15 = o0Var.f2558b;
                int i16 = n0Var.f2542a;
                o0Var.f2558b = (o0Var.f2562f * i16) + i15;
                if (!n0Var.f2544c || o0Var.f2567k != null || !c2Var.f2430g) {
                    o0Var.f2559c -= i16;
                    i14 -= i16;
                }
                int i17 = o0Var.f2563g;
                if (i17 != Integer.MIN_VALUE) {
                    int i18 = i17 + i16;
                    o0Var.f2563g = i18;
                    int i19 = o0Var.f2559c;
                    if (i19 < 0) {
                        o0Var.f2563g = i18 + i19;
                    }
                    v(u1Var, o0Var);
                }
                if (z11 && n0Var.f2545d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i12 - o0Var.f2559c;
    }

    public int findFirstCompletelyVisibleItemPosition() {
        View viewFindOneVisibleChild = findOneVisibleChild(0, getChildCount(), true, false);
        if (viewFindOneVisibleChild == null) {
            return -1;
        }
        return getPosition(viewFindOneVisibleChild);
    }

    public View findFirstVisibleChildClosestToEnd(boolean z11, boolean z12) {
        return this.mShouldReverseLayout ? findOneVisibleChild(0, getChildCount(), z11, z12) : findOneVisibleChild(getChildCount() - 1, -1, z11, z12);
    }

    public View findFirstVisibleChildClosestToStart(boolean z11, boolean z12) {
        return this.mShouldReverseLayout ? findOneVisibleChild(getChildCount() - 1, -1, z11, z12) : findOneVisibleChild(0, getChildCount(), z11, z12);
    }

    public int findFirstVisibleItemPosition() {
        View viewFindOneVisibleChild = findOneVisibleChild(0, getChildCount(), false, true);
        if (viewFindOneVisibleChild == null) {
            return -1;
        }
        return getPosition(viewFindOneVisibleChild);
    }

    public int findLastCompletelyVisibleItemPosition() {
        View viewFindOneVisibleChild = findOneVisibleChild(getChildCount() - 1, -1, true, false);
        if (viewFindOneVisibleChild == null) {
            return -1;
        }
        return getPosition(viewFindOneVisibleChild);
    }

    public int findLastVisibleItemPosition() {
        View viewFindOneVisibleChild = findOneVisibleChild(getChildCount() - 1, -1, false, true);
        if (viewFindOneVisibleChild == null) {
            return -1;
        }
        return getPosition(viewFindOneVisibleChild);
    }

    public View findOnePartiallyOrCompletelyInvisibleChild(int i11, int i12) {
        int i13;
        int i14;
        ensureLayoutState();
        if (i12 <= i11 && i12 >= i11) {
            return getChildAt(i11);
        }
        if (this.mOrientationHelper.e(getChildAt(i11)) < this.mOrientationHelper.k()) {
            i13 = 16644;
            i14 = 16388;
        } else {
            i13 = 4161;
            i14 = 4097;
        }
        return this.mOrientation == 0 ? this.mHorizontalBoundCheck.a(i11, i12, i13, i14) : this.mVerticalBoundCheck.a(i11, i12, i13, i14);
    }

    public View findOneVisibleChild(int i11, int i12, boolean z11, boolean z12) {
        ensureLayoutState();
        int i13 = z11 ? 24579 : 320;
        int i14 = z12 ? 320 : 0;
        return this.mOrientation == 0 ? this.mHorizontalBoundCheck.a(i11, i12, i13, i14) : this.mVerticalBoundCheck.a(i11, i12, i13, i14);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0075  */
    /* JADX WARN: Code duplicated, block: B:35:0x0079  */
    public View findReferenceChild(u1 u1Var, c2 c2Var, boolean z11, boolean z12) {
        int i11;
        int childCount;
        int i12;
        ensureLayoutState();
        int childCount2 = getChildCount();
        if (z12) {
            childCount = getChildCount() - 1;
            i11 = -1;
            i12 = -1;
        } else {
            i11 = childCount2;
            childCount = 0;
            i12 = 1;
        }
        int iB = c2Var.b();
        int iK = this.mOrientationHelper.k();
        int iG = this.mOrientationHelper.g();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (childCount != i11) {
            View childAt = getChildAt(childCount);
            int position = getPosition(childAt);
            int iE = this.mOrientationHelper.e(childAt);
            int iB2 = this.mOrientationHelper.b(childAt);
            if (position >= 0 && position < iB) {
                if (!((n1) childAt.getLayoutParams()).f2546a.isRemoved()) {
                    boolean z13 = iB2 <= iK && iE < iK;
                    boolean z14 = iE >= iG && iB2 > iG;
                    if (!z13 && !z14) {
                        return childAt;
                    }
                    if (z11) {
                        if (z14) {
                            view2 = childAt;
                        } else if (view == null) {
                            view = childAt;
                        }
                    } else if (z13) {
                        view2 = childAt;
                    } else if (view == null) {
                        view = childAt;
                    }
                } else if (view3 == null) {
                    view3 = childAt;
                }
            }
            childCount += i12;
        }
        if (view != null) {
            return view;
        }
        return view2 != null ? view2 : view3;
    }

    @Override // androidx.recyclerview.widget.m1
    public View findViewByPosition(int i11) {
        int childCount = getChildCount();
        if (childCount == 0) {
            return null;
        }
        int position = i11 - getPosition(getChildAt(0));
        if (position >= 0 && position < childCount) {
            View childAt = getChildAt(position);
            if (getPosition(childAt) == i11) {
                return childAt;
            }
        }
        return super.findViewByPosition(i11);
    }

    @Override // androidx.recyclerview.widget.m1
    public n1 generateDefaultLayoutParams() {
        return new n1(-2, -2);
    }

    @Deprecated
    public int getExtraLayoutSpace(c2 c2Var) {
        if (c2Var.f2424a != -1) {
            return this.mOrientationHelper.l();
        }
        return 0;
    }

    public int getInitialPrefetchItemCount() {
        return this.mInitialPrefetchItemCount;
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public boolean getRecycleChildrenOnDetach() {
        return this.mRecycleChildrenOnDetach;
    }

    public boolean getReverseLayout() {
        return this.mReverseLayout;
    }

    public boolean getStackFromEnd() {
        return this.mStackFromEnd;
    }

    @Override // androidx.recyclerview.widget.m1
    public boolean isAutoMeasureEnabled() {
        return true;
    }

    public boolean isLayoutRTL() {
        return getLayoutDirection() == 1;
    }

    public boolean isSmoothScrollbarEnabled() {
        return this.mSmoothScrollbarEnabled;
    }

    public void layoutChunk(u1 u1Var, c2 c2Var, o0 o0Var, n0 n0Var) {
        int iD;
        int i11;
        int i12;
        int i13;
        int paddingLeft;
        int iD2;
        int i14;
        int i15;
        View viewB = o0Var.b(u1Var);
        if (viewB == null) {
            n0Var.f2543b = true;
            return;
        }
        n1 n1Var = (n1) viewB.getLayoutParams();
        if (o0Var.f2567k == null) {
            if (this.mShouldReverseLayout == (o0Var.f2562f == -1)) {
                addView(viewB);
            } else {
                addView(viewB, 0);
            }
        } else {
            if (this.mShouldReverseLayout == (o0Var.f2562f == -1)) {
                addDisappearingView(viewB);
            } else {
                addDisappearingView(viewB, 0);
            }
        }
        measureChildWithMargins(viewB, 0, 0);
        n0Var.f2542a = this.mOrientationHelper.c(viewB);
        if (this.mOrientation == 1) {
            if (isLayoutRTL()) {
                iD2 = getWidth() - getPaddingRight();
                paddingLeft = iD2 - this.mOrientationHelper.d(viewB);
            } else {
                paddingLeft = getPaddingLeft();
                iD2 = this.mOrientationHelper.d(viewB) + paddingLeft;
            }
            if (o0Var.f2562f == -1) {
                i15 = o0Var.f2558b;
                i14 = i15 - n0Var.f2542a;
            } else {
                i14 = o0Var.f2558b;
                i15 = n0Var.f2542a + i14;
            }
            int i16 = paddingLeft;
            i13 = i14;
            i12 = i16;
            iD = i15;
            i11 = iD2;
        } else {
            int paddingTop = getPaddingTop();
            iD = this.mOrientationHelper.d(viewB) + paddingTop;
            if (o0Var.f2562f == -1) {
                int i17 = o0Var.f2558b;
                i12 = i17 - n0Var.f2542a;
                i11 = i17;
            } else {
                int i18 = o0Var.f2558b;
                i11 = n0Var.f2542a + i18;
                i12 = i18;
            }
            i13 = paddingTop;
        }
        layoutDecoratedWithMargins(viewB, i12, i13, i11, iD);
        if (n1Var.f2546a.isRemoved() || n1Var.f2546a.isUpdated()) {
            n0Var.f2544c = true;
        }
        n0Var.f2545d = viewB.hasFocusable();
    }

    public final int n(c2 c2Var) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return u.b(c2Var, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled);
    }

    public final int o(c2 c2Var) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return u.c(c2Var, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled, this.mShouldReverseLayout);
    }

    @Override // androidx.recyclerview.widget.m1
    public void onDetachedFromWindow(RecyclerView recyclerView, u1 u1Var) {
        onDetachedFromWindow(recyclerView);
        if (this.mRecycleChildrenOnDetach) {
            removeAndRecycleAllViews(u1Var);
            u1Var.f2629a.clear();
            u1Var.h();
        }
    }

    @Override // androidx.recyclerview.widget.m1
    public View onFocusSearchFailed(View view, int i11, u1 u1Var, c2 c2Var) {
        int iConvertFocusDirectionToLayoutDirection;
        View viewFindOnePartiallyOrCompletelyInvisibleChild;
        x();
        if (getChildCount() != 0 && (iConvertFocusDirectionToLayoutDirection = convertFocusDirectionToLayoutDirection(i11)) != Integer.MIN_VALUE) {
            ensureLayoutState();
            y(iConvertFocusDirectionToLayoutDirection, (int) (this.mOrientationHelper.l() * MAX_SCROLL_FACTOR), false, c2Var);
            o0 o0Var = this.mLayoutState;
            o0Var.f2563g = Integer.MIN_VALUE;
            o0Var.f2557a = false;
            fill(u1Var, o0Var, c2Var, true);
            if (iConvertFocusDirectionToLayoutDirection == -1) {
                viewFindOnePartiallyOrCompletelyInvisibleChild = this.mShouldReverseLayout ? findOnePartiallyOrCompletelyInvisibleChild(getChildCount() - 1, -1) : findOnePartiallyOrCompletelyInvisibleChild(0, getChildCount());
            } else {
                viewFindOnePartiallyOrCompletelyInvisibleChild = this.mShouldReverseLayout ? findOnePartiallyOrCompletelyInvisibleChild(0, getChildCount()) : findOnePartiallyOrCompletelyInvisibleChild(getChildCount() - 1, -1);
            }
            View viewT = iConvertFocusDirectionToLayoutDirection == -1 ? t() : s();
            if (!viewT.hasFocusable()) {
                return viewFindOnePartiallyOrCompletelyInvisibleChild;
            }
            if (viewFindOnePartiallyOrCompletelyInvisibleChild != null) {
                return viewT;
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.m1
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            accessibilityEvent.setFromIndex(findFirstVisibleItemPosition());
            accessibilityEvent.setToIndex(findLastVisibleItemPosition());
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x01e0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:105:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:107:0x01e7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:109:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:111:0x01ee A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:112:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:114:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:116:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:118:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:119:0x0205  */
    /* JADX WARN: Code duplicated, block: B:83:0x0175  */
    /* JADX WARN: Code duplicated, block: B:85:0x017b  */
    /* JADX WARN: Code duplicated, block: B:92:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:95:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:99:0x01c0  */
    @Override // androidx.recyclerview.widget.m1
    public void onLayoutChildren(u1 u1Var, c2 c2Var) {
        int iB;
        View focusedChild;
        boolean z11;
        boolean z12;
        View viewFindReferenceChild;
        int iE;
        int iB2;
        int iK;
        int iG;
        boolean z13;
        boolean z14;
        n1 n1Var;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int iQ;
        int i16;
        View viewFindViewByPosition;
        int iE2;
        int iG2;
        int i17;
        int i18 = -1;
        if (!(this.mPendingSavedState == null && this.mPendingScrollPosition == -1) && c2Var.b() == 0) {
            removeAndRecycleAllViews(u1Var);
            return;
        }
        q0 q0Var = this.mPendingSavedState;
        if (q0Var != null && (i17 = q0Var.f2591a) >= 0) {
            this.mPendingScrollPosition = i17;
        }
        ensureLayoutState();
        this.mLayoutState.f2557a = false;
        x();
        View focusedChild2 = getFocusedChild();
        m0 m0Var = this.mAnchorInfo;
        if (!m0Var.f2538e || this.mPendingScrollPosition != -1 || this.mPendingSavedState != null) {
            m0Var.d();
            m0 m0Var2 = this.mAnchorInfo;
            m0Var2.f2537d = this.mShouldReverseLayout ^ this.mStackFromEnd;
            if (c2Var.f2430g || (i11 = this.mPendingScrollPosition) == -1) {
                if (getChildCount() != 0) {
                    focusedChild = getFocusedChild();
                    if (focusedChild != null) {
                        n1Var = (n1) focusedChild.getLayoutParams();
                        if (!n1Var.f2546a.isRemoved() || n1Var.f2546a.getLayoutPosition() < 0 || n1Var.f2546a.getLayoutPosition() >= c2Var.b()) {
                            z11 = this.mLastStackFromEnd;
                            z12 = this.mStackFromEnd;
                            if (z11 == z12 || (viewFindReferenceChild = findReferenceChild(u1Var, c2Var, m0Var2.f2537d, z12)) == null) {
                                m0Var2.a();
                                if (this.mStackFromEnd) {
                                    iB = c2Var.b() - 1;
                                } else {
                                    iB = 0;
                                }
                                m0Var2.f2535b = iB;
                            } else {
                                m0Var2.b(viewFindReferenceChild, getPosition(viewFindReferenceChild));
                                if (!c2Var.f2430g && supportsPredictiveItemAnimations()) {
                                    iE = this.mOrientationHelper.e(viewFindReferenceChild);
                                    iB2 = this.mOrientationHelper.b(viewFindReferenceChild);
                                    iK = this.mOrientationHelper.k();
                                    iG = this.mOrientationHelper.g();
                                    if (iB2 <= iK || iE >= iK) {
                                        z13 = false;
                                    } else {
                                        z13 = true;
                                    }
                                    if (iE >= iG || iB2 <= iG) {
                                        z14 = false;
                                    } else {
                                        z14 = true;
                                    }
                                    if (z13 || z14) {
                                        if (m0Var2.f2537d) {
                                            iK = iG;
                                        }
                                        m0Var2.f2536c = iK;
                                    }
                                }
                            }
                        } else {
                            m0Var2.c(focusedChild, getPosition(focusedChild));
                        }
                    } else {
                        z11 = this.mLastStackFromEnd;
                        z12 = this.mStackFromEnd;
                        if (z11 == z12) {
                            m0Var2.a();
                            if (this.mStackFromEnd) {
                                iB = c2Var.b() - 1;
                            } else {
                                iB = 0;
                            }
                            m0Var2.f2535b = iB;
                        } else {
                            m0Var2.b(viewFindReferenceChild, getPosition(viewFindReferenceChild));
                            if (!c2Var.f2430g) {
                                iE = this.mOrientationHelper.e(viewFindReferenceChild);
                                iB2 = this.mOrientationHelper.b(viewFindReferenceChild);
                                iK = this.mOrientationHelper.k();
                                iG = this.mOrientationHelper.g();
                                if (iB2 <= iK) {
                                    z13 = false;
                                } else {
                                    z13 = false;
                                }
                                if (iE >= iG) {
                                    z14 = false;
                                } else {
                                    z14 = false;
                                }
                                if (z13) {
                                    if (m0Var2.f2537d) {
                                        iK = iG;
                                    }
                                    m0Var2.f2536c = iK;
                                } else {
                                    if (m0Var2.f2537d) {
                                        iK = iG;
                                    }
                                    m0Var2.f2536c = iK;
                                }
                            }
                        }
                    }
                } else {
                    m0Var2.a();
                    if (this.mStackFromEnd) {
                        iB = c2Var.b() - 1;
                    } else {
                        iB = 0;
                    }
                    m0Var2.f2535b = iB;
                }
            } else if (i11 < 0 || i11 >= c2Var.b()) {
                this.mPendingScrollPosition = -1;
                this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
                if (getChildCount() != 0) {
                    focusedChild = getFocusedChild();
                    if (focusedChild != null) {
                        n1Var = (n1) focusedChild.getLayoutParams();
                        if (n1Var.f2546a.isRemoved()) {
                            z11 = this.mLastStackFromEnd;
                            z12 = this.mStackFromEnd;
                            if (z11 == z12) {
                                m0Var2.a();
                                if (this.mStackFromEnd) {
                                    iB = c2Var.b() - 1;
                                } else {
                                    iB = 0;
                                }
                                m0Var2.f2535b = iB;
                            } else {
                                m0Var2.b(viewFindReferenceChild, getPosition(viewFindReferenceChild));
                                if (!c2Var.f2430g) {
                                    iE = this.mOrientationHelper.e(viewFindReferenceChild);
                                    iB2 = this.mOrientationHelper.b(viewFindReferenceChild);
                                    iK = this.mOrientationHelper.k();
                                    iG = this.mOrientationHelper.g();
                                    if (iB2 <= iK) {
                                        z13 = false;
                                    } else {
                                        z13 = false;
                                    }
                                    if (iE >= iG) {
                                        z14 = false;
                                    } else {
                                        z14 = false;
                                    }
                                    if (z13) {
                                        if (m0Var2.f2537d) {
                                            iK = iG;
                                        }
                                        m0Var2.f2536c = iK;
                                    } else {
                                        if (m0Var2.f2537d) {
                                            iK = iG;
                                        }
                                        m0Var2.f2536c = iK;
                                    }
                                }
                            }
                        } else {
                            z11 = this.mLastStackFromEnd;
                            z12 = this.mStackFromEnd;
                            if (z11 == z12) {
                                m0Var2.a();
                                if (this.mStackFromEnd) {
                                    iB = c2Var.b() - 1;
                                } else {
                                    iB = 0;
                                }
                                m0Var2.f2535b = iB;
                            } else {
                                m0Var2.b(viewFindReferenceChild, getPosition(viewFindReferenceChild));
                                if (!c2Var.f2430g) {
                                    iE = this.mOrientationHelper.e(viewFindReferenceChild);
                                    iB2 = this.mOrientationHelper.b(viewFindReferenceChild);
                                    iK = this.mOrientationHelper.k();
                                    iG = this.mOrientationHelper.g();
                                    if (iB2 <= iK) {
                                        z13 = false;
                                    } else {
                                        z13 = false;
                                    }
                                    if (iE >= iG) {
                                        z14 = false;
                                    } else {
                                        z14 = false;
                                    }
                                    if (z13) {
                                        if (m0Var2.f2537d) {
                                            iK = iG;
                                        }
                                        m0Var2.f2536c = iK;
                                    } else {
                                        if (m0Var2.f2537d) {
                                            iK = iG;
                                        }
                                        m0Var2.f2536c = iK;
                                    }
                                }
                            }
                        }
                    } else {
                        z11 = this.mLastStackFromEnd;
                        z12 = this.mStackFromEnd;
                        if (z11 == z12) {
                            m0Var2.a();
                            if (this.mStackFromEnd) {
                                iB = c2Var.b() - 1;
                            } else {
                                iB = 0;
                            }
                            m0Var2.f2535b = iB;
                        } else {
                            m0Var2.b(viewFindReferenceChild, getPosition(viewFindReferenceChild));
                            if (!c2Var.f2430g) {
                                iE = this.mOrientationHelper.e(viewFindReferenceChild);
                                iB2 = this.mOrientationHelper.b(viewFindReferenceChild);
                                iK = this.mOrientationHelper.k();
                                iG = this.mOrientationHelper.g();
                                if (iB2 <= iK) {
                                    z13 = false;
                                } else {
                                    z13 = false;
                                }
                                if (iE >= iG) {
                                    z14 = false;
                                } else {
                                    z14 = false;
                                }
                                if (z13) {
                                    if (m0Var2.f2537d) {
                                        iK = iG;
                                    }
                                    m0Var2.f2536c = iK;
                                } else {
                                    if (m0Var2.f2537d) {
                                        iK = iG;
                                    }
                                    m0Var2.f2536c = iK;
                                }
                            }
                        }
                    }
                } else {
                    m0Var2.a();
                    if (this.mStackFromEnd) {
                        iB = c2Var.b() - 1;
                    } else {
                        iB = 0;
                    }
                    m0Var2.f2535b = iB;
                }
            } else {
                int i19 = this.mPendingScrollPosition;
                m0Var2.f2535b = i19;
                q0 q0Var2 = this.mPendingSavedState;
                if (q0Var2 != null && q0Var2.f2591a >= 0) {
                    boolean z15 = q0Var2.f2593c;
                    m0Var2.f2537d = z15;
                    if (z15) {
                        m0Var2.f2536c = this.mOrientationHelper.g() - this.mPendingSavedState.f2592b;
                    } else {
                        m0Var2.f2536c = this.mOrientationHelper.k() + this.mPendingSavedState.f2592b;
                    }
                } else if (this.mPendingScrollPositionOffset == Integer.MIN_VALUE) {
                    View viewFindViewByPosition2 = findViewByPosition(i19);
                    if (viewFindViewByPosition2 == null) {
                        if (getChildCount() > 0) {
                            m0Var2.f2537d = (this.mPendingScrollPosition < getPosition(getChildAt(0))) == this.mShouldReverseLayout;
                        }
                        m0Var2.a();
                    } else if (this.mOrientationHelper.c(viewFindViewByPosition2) > this.mOrientationHelper.l()) {
                        m0Var2.a();
                    } else if (this.mOrientationHelper.e(viewFindViewByPosition2) - this.mOrientationHelper.k() < 0) {
                        m0Var2.f2536c = this.mOrientationHelper.k();
                        m0Var2.f2537d = false;
                    } else if (this.mOrientationHelper.g() - this.mOrientationHelper.b(viewFindViewByPosition2) < 0) {
                        m0Var2.f2536c = this.mOrientationHelper.g();
                        m0Var2.f2537d = true;
                    } else {
                        m0Var2.f2536c = m0Var2.f2537d ? this.mOrientationHelper.m() + this.mOrientationHelper.b(viewFindViewByPosition2) : this.mOrientationHelper.e(viewFindViewByPosition2);
                    }
                } else {
                    boolean z16 = this.mShouldReverseLayout;
                    m0Var2.f2537d = z16;
                    if (z16) {
                        m0Var2.f2536c = this.mOrientationHelper.g() - this.mPendingScrollPositionOffset;
                    } else {
                        m0Var2.f2536c = this.mOrientationHelper.k() + this.mPendingScrollPositionOffset;
                    }
                }
            }
            this.mAnchorInfo.f2538e = true;
        } else if (focusedChild2 != null && (this.mOrientationHelper.e(focusedChild2) >= this.mOrientationHelper.g() || this.mOrientationHelper.b(focusedChild2) <= this.mOrientationHelper.k())) {
            this.mAnchorInfo.c(focusedChild2, getPosition(focusedChild2));
        }
        o0 o0Var = this.mLayoutState;
        o0Var.f2562f = o0Var.f2566j >= 0 ? 1 : -1;
        int[] iArr = this.mReusableIntPair;
        iArr[0] = 0;
        iArr[1] = 0;
        calculateExtraLayoutSpace(c2Var, iArr);
        int iK2 = this.mOrientationHelper.k() + Math.max(0, this.mReusableIntPair[0]);
        int iH = this.mOrientationHelper.h() + Math.max(0, this.mReusableIntPair[1]);
        if (c2Var.f2430g && (i16 = this.mPendingScrollPosition) != -1 && this.mPendingScrollPositionOffset != Integer.MIN_VALUE && (viewFindViewByPosition = findViewByPosition(i16)) != null) {
            if (this.mShouldReverseLayout) {
                iG2 = this.mOrientationHelper.g() - this.mOrientationHelper.b(viewFindViewByPosition);
                iE2 = this.mPendingScrollPositionOffset;
            } else {
                iE2 = this.mOrientationHelper.e(viewFindViewByPosition) - this.mOrientationHelper.k();
                iG2 = this.mPendingScrollPositionOffset;
            }
            int i21 = iG2 - iE2;
            if (i21 > 0) {
                iK2 += i21;
            } else {
                iH -= i21;
            }
        }
        m0 m0Var3 = this.mAnchorInfo;
        if (!m0Var3.f2537d ? !this.mShouldReverseLayout : this.mShouldReverseLayout) {
            i18 = 1;
        }
        onAnchorReady(u1Var, c2Var, m0Var3, i18);
        detachAndScrapAttachedViews(u1Var);
        this.mLayoutState.f2568l = resolveIsInfinite();
        this.mLayoutState.getClass();
        this.mLayoutState.f2565i = 0;
        m0 m0Var4 = this.mAnchorInfo;
        if (m0Var4.f2537d) {
            A(m0Var4.f2535b, m0Var4.f2536c);
            o0 o0Var2 = this.mLayoutState;
            o0Var2.f2564h = iK2;
            fill(u1Var, o0Var2, c2Var, false);
            o0 o0Var3 = this.mLayoutState;
            i13 = o0Var3.f2558b;
            int i22 = o0Var3.f2560d;
            int i23 = o0Var3.f2559c;
            if (i23 > 0) {
                iH += i23;
            }
            m0 m0Var5 = this.mAnchorInfo;
            z(m0Var5.f2535b, m0Var5.f2536c);
            o0 o0Var4 = this.mLayoutState;
            o0Var4.f2564h = iH;
            o0Var4.f2560d += o0Var4.f2561e;
            fill(u1Var, o0Var4, c2Var, false);
            o0 o0Var5 = this.mLayoutState;
            i12 = o0Var5.f2558b;
            int i24 = o0Var5.f2559c;
            if (i24 > 0) {
                A(i22, i13);
                o0 o0Var6 = this.mLayoutState;
                o0Var6.f2564h = i24;
                fill(u1Var, o0Var6, c2Var, false);
                i13 = this.mLayoutState.f2558b;
            }
        } else {
            z(m0Var4.f2535b, m0Var4.f2536c);
            o0 o0Var7 = this.mLayoutState;
            o0Var7.f2564h = iH;
            fill(u1Var, o0Var7, c2Var, false);
            o0 o0Var8 = this.mLayoutState;
            i12 = o0Var8.f2558b;
            int i25 = o0Var8.f2560d;
            int i26 = o0Var8.f2559c;
            if (i26 > 0) {
                iK2 += i26;
            }
            m0 m0Var6 = this.mAnchorInfo;
            A(m0Var6.f2535b, m0Var6.f2536c);
            o0 o0Var9 = this.mLayoutState;
            o0Var9.f2564h = iK2;
            o0Var9.f2560d += o0Var9.f2561e;
            fill(u1Var, o0Var9, c2Var, false);
            o0 o0Var10 = this.mLayoutState;
            int i27 = o0Var10.f2558b;
            int i28 = o0Var10.f2559c;
            if (i28 > 0) {
                z(i25, i12);
                o0 o0Var11 = this.mLayoutState;
                o0Var11.f2564h = i28;
                fill(u1Var, o0Var11, c2Var, false);
                i12 = this.mLayoutState.f2558b;
            }
            i13 = i27;
        }
        if (getChildCount() > 0) {
            if (this.mShouldReverseLayout ^ this.mStackFromEnd) {
                int iQ2 = q(i12, u1Var, c2Var, true);
                i14 = i13 + iQ2;
                i15 = i12 + iQ2;
                iQ = r(i14, u1Var, c2Var, false);
            } else {
                int iR = r(i13, u1Var, c2Var, true);
                i14 = i13 + iR;
                i15 = i12 + iR;
                iQ = q(i15, u1Var, c2Var, false);
            }
            i13 = i14 + iQ;
            i12 = i15 + iQ;
        }
        if (c2Var.f2434k && getChildCount() != 0 && !c2Var.f2430g && supportsPredictiveItemAnimations()) {
            List list = u1Var.f2632d;
            int size = list.size();
            int position = getPosition(getChildAt(0));
            int iC = 0;
            int iC2 = 0;
            for (int i29 = 0; i29 < size; i29++) {
                g2 g2Var = (g2) list.get(i29);
                if (!g2Var.isRemoved()) {
                    if ((g2Var.getLayoutPosition() < position) != this.mShouldReverseLayout) {
                        iC += this.mOrientationHelper.c(g2Var.itemView);
                    } else {
                        iC2 += this.mOrientationHelper.c(g2Var.itemView);
                    }
                }
            }
            this.mLayoutState.f2567k = list;
            if (iC > 0) {
                A(getPosition(t()), i13);
                o0 o0Var12 = this.mLayoutState;
                o0Var12.f2564h = iC;
                o0Var12.f2559c = 0;
                o0Var12.a(null);
                fill(u1Var, this.mLayoutState, c2Var, false);
            }
            if (iC2 > 0) {
                z(getPosition(s()), i12);
                o0 o0Var13 = this.mLayoutState;
                o0Var13.f2564h = iC2;
                o0Var13.f2559c = 0;
                o0Var13.a(null);
                fill(u1Var, this.mLayoutState, c2Var, false);
            }
            this.mLayoutState.f2567k = null;
        }
        if (c2Var.f2430g) {
            this.mAnchorInfo.d();
        } else {
            u0 u0Var = this.mOrientationHelper;
            u0Var.f2627b = u0Var.l();
        }
        this.mLastStackFromEnd = this.mStackFromEnd;
    }

    @Override // androidx.recyclerview.widget.m1
    public void onLayoutCompleted(c2 c2Var) {
        this.mPendingSavedState = null;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mAnchorInfo.d();
    }

    @Override // androidx.recyclerview.widget.m1
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof q0) {
            q0 q0Var = (q0) parcelable;
            this.mPendingSavedState = q0Var;
            if (this.mPendingScrollPosition != -1) {
                q0Var.f2591a = -1;
            }
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.m1
    public Parcelable onSaveInstanceState() {
        q0 q0Var = this.mPendingSavedState;
        if (q0Var != null) {
            q0 q0Var2 = new q0();
            q0Var2.f2591a = q0Var.f2591a;
            q0Var2.f2592b = q0Var.f2592b;
            q0Var2.f2593c = q0Var.f2593c;
            return q0Var2;
        }
        q0 q0Var3 = new q0();
        if (getChildCount() <= 0) {
            q0Var3.f2591a = -1;
            return q0Var3;
        }
        ensureLayoutState();
        boolean z11 = this.mLastStackFromEnd ^ this.mShouldReverseLayout;
        q0Var3.f2593c = z11;
        if (z11) {
            View viewS = s();
            q0Var3.f2592b = this.mOrientationHelper.g() - this.mOrientationHelper.b(viewS);
            q0Var3.f2591a = getPosition(viewS);
            return q0Var3;
        }
        View viewT = t();
        q0Var3.f2591a = getPosition(viewT);
        q0Var3.f2592b = this.mOrientationHelper.e(viewT) - this.mOrientationHelper.k();
        return q0Var3;
    }

    public final int p(c2 c2Var) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return u.d(c2Var, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled);
    }

    public void prepareForDrop(View view, View view2, int i11, int i12) {
        assertNotInLayoutOrScroll("Cannot drop a view during a scroll or layout calculation");
        ensureLayoutState();
        x();
        int position = getPosition(view);
        int position2 = getPosition(view2);
        byte b3 = position < position2 ? (byte) 1 : (byte) -1;
        if (this.mShouldReverseLayout) {
            if (b3 == 1) {
                scrollToPositionWithOffset(position2, this.mOrientationHelper.g() - (this.mOrientationHelper.c(view) + this.mOrientationHelper.e(view2)));
                return;
            } else {
                scrollToPositionWithOffset(position2, this.mOrientationHelper.g() - this.mOrientationHelper.b(view2));
                return;
            }
        }
        if (b3 == -1) {
            scrollToPositionWithOffset(position2, this.mOrientationHelper.e(view2));
        } else {
            scrollToPositionWithOffset(position2, this.mOrientationHelper.b(view2) - this.mOrientationHelper.c(view));
        }
    }

    public final int q(int i11, u1 u1Var, c2 c2Var, boolean z11) {
        int iG;
        int iG2 = this.mOrientationHelper.g() - i11;
        if (iG2 <= 0) {
            return 0;
        }
        int i12 = -scrollBy(-iG2, u1Var, c2Var);
        int i13 = i11 + i12;
        if (!z11 || (iG = this.mOrientationHelper.g() - i13) <= 0) {
            return i12;
        }
        this.mOrientationHelper.p(iG);
        return iG + i12;
    }

    public final int r(int i11, u1 u1Var, c2 c2Var, boolean z11) {
        int iK;
        int iK2 = i11 - this.mOrientationHelper.k();
        if (iK2 <= 0) {
            return 0;
        }
        int i12 = -scrollBy(iK2, u1Var, c2Var);
        int i13 = i11 + i12;
        if (!z11 || (iK = i13 - this.mOrientationHelper.k()) <= 0) {
            return i12;
        }
        this.mOrientationHelper.p(-iK);
        return i12 - iK;
    }

    public boolean resolveIsInfinite() {
        return this.mOrientationHelper.i() == 0 && this.mOrientationHelper.f() == 0;
    }

    public final View s() {
        return getChildAt(this.mShouldReverseLayout ? 0 : getChildCount() - 1);
    }

    public int scrollBy(int i11, u1 u1Var, c2 c2Var) {
        if (getChildCount() == 0 || i11 == 0) {
            return 0;
        }
        ensureLayoutState();
        this.mLayoutState.f2557a = true;
        int i12 = i11 > 0 ? 1 : -1;
        int iAbs = Math.abs(i11);
        y(i12, iAbs, true, c2Var);
        o0 o0Var = this.mLayoutState;
        int iFill = fill(u1Var, o0Var, c2Var, false) + o0Var.f2563g;
        if (iFill < 0) {
            return 0;
        }
        if (iAbs > iFill) {
            i11 = i12 * iFill;
        }
        this.mOrientationHelper.p(-i11);
        this.mLayoutState.f2566j = i11;
        return i11;
    }

    @Override // androidx.recyclerview.widget.m1
    public int scrollHorizontallyBy(int i11, u1 u1Var, c2 c2Var) {
        if (this.mOrientation == 1) {
            return 0;
        }
        return scrollBy(i11, u1Var, c2Var);
    }

    @Override // androidx.recyclerview.widget.m1
    public void scrollToPosition(int i11) {
        this.mPendingScrollPosition = i11;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        q0 q0Var = this.mPendingSavedState;
        if (q0Var != null) {
            q0Var.f2591a = -1;
        }
        requestLayout();
    }

    public void scrollToPositionWithOffset(int i11, int i12) {
        this.mPendingScrollPosition = i11;
        this.mPendingScrollPositionOffset = i12;
        q0 q0Var = this.mPendingSavedState;
        if (q0Var != null) {
            q0Var.f2591a = -1;
        }
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.m1
    public int scrollVerticallyBy(int i11, u1 u1Var, c2 c2Var) {
        if (this.mOrientation == 0) {
            return 0;
        }
        return scrollBy(i11, u1Var, c2Var);
    }

    public void setInitialPrefetchItemCount(int i11) {
        this.mInitialPrefetchItemCount = i11;
    }

    public void setOrientation(int i11) {
        if (i11 != 0 && i11 != 1) {
            throw new IllegalArgumentException(nv.p.j(i11, "invalid orientation:"));
        }
        assertNotInLayoutOrScroll(null);
        if (i11 != this.mOrientation || this.mOrientationHelper == null) {
            u0 u0VarA = u0.a(this, i11);
            this.mOrientationHelper = u0VarA;
            this.mAnchorInfo.f2534a = u0VarA;
            this.mOrientation = i11;
            requestLayout();
        }
    }

    public void setRecycleChildrenOnDetach(boolean z11) {
        this.mRecycleChildrenOnDetach = z11;
    }

    public void setReverseLayout(boolean z11) {
        assertNotInLayoutOrScroll(null);
        if (z11 == this.mReverseLayout) {
            return;
        }
        this.mReverseLayout = z11;
        requestLayout();
    }

    public void setSmoothScrollbarEnabled(boolean z11) {
        this.mSmoothScrollbarEnabled = z11;
    }

    public void setStackFromEnd(boolean z11) {
        assertNotInLayoutOrScroll(null);
        if (this.mStackFromEnd == z11) {
            return;
        }
        this.mStackFromEnd = z11;
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.m1
    public boolean shouldMeasureTwice() {
        return (getHeightMode() == 1073741824 || getWidthMode() == 1073741824 || !hasFlexibleChildInBothOrientations()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.m1
    public void smoothScrollToPosition(RecyclerView recyclerView, c2 c2Var, int i11) {
        r0 r0Var = new r0(recyclerView.getContext());
        r0Var.setTargetPosition(i11);
        startSmoothScroll(r0Var);
    }

    @Override // androidx.recyclerview.widget.m1
    public boolean supportsPredictiveItemAnimations() {
        return this.mPendingSavedState == null && this.mLastStackFromEnd == this.mStackFromEnd;
    }

    public final View t() {
        return getChildAt(this.mShouldReverseLayout ? getChildCount() - 1 : 0);
    }

    public final void u() {
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            getPosition(childAt);
            this.mOrientationHelper.e(childAt);
        }
    }

    public final void v(u1 u1Var, o0 o0Var) {
        if (!o0Var.f2557a || o0Var.f2568l) {
            return;
        }
        int i11 = o0Var.f2563g;
        int i12 = o0Var.f2565i;
        if (o0Var.f2562f == -1) {
            int childCount = getChildCount();
            if (i11 < 0) {
                return;
            }
            int iF = (this.mOrientationHelper.f() - i11) + i12;
            if (this.mShouldReverseLayout) {
                for (int i13 = 0; i13 < childCount; i13++) {
                    View childAt = getChildAt(i13);
                    if (this.mOrientationHelper.e(childAt) < iF || this.mOrientationHelper.o(childAt) < iF) {
                        w(u1Var, 0, i13);
                        return;
                    }
                }
                return;
            }
            int i14 = childCount - 1;
            for (int i15 = i14; i15 >= 0; i15--) {
                View childAt2 = getChildAt(i15);
                if (this.mOrientationHelper.e(childAt2) < iF || this.mOrientationHelper.o(childAt2) < iF) {
                    w(u1Var, i14, i15);
                    return;
                }
            }
            return;
        }
        if (i11 < 0) {
            return;
        }
        int i16 = i11 - i12;
        int childCount2 = getChildCount();
        if (!this.mShouldReverseLayout) {
            for (int i17 = 0; i17 < childCount2; i17++) {
                View childAt3 = getChildAt(i17);
                if (this.mOrientationHelper.b(childAt3) > i16 || this.mOrientationHelper.n(childAt3) > i16) {
                    w(u1Var, 0, i17);
                    return;
                }
            }
            return;
        }
        int i18 = childCount2 - 1;
        for (int i19 = i18; i19 >= 0; i19--) {
            View childAt4 = getChildAt(i19);
            if (this.mOrientationHelper.b(childAt4) > i16 || this.mOrientationHelper.n(childAt4) > i16) {
                w(u1Var, i18, i19);
                return;
            }
        }
    }

    public void validateChildOrder() {
        getChildCount();
        if (getChildCount() < 1) {
            return;
        }
        int position = getPosition(getChildAt(0));
        int iE = this.mOrientationHelper.e(getChildAt(0));
        if (this.mShouldReverseLayout) {
            for (int i11 = 1; i11 < getChildCount(); i11++) {
                View childAt = getChildAt(i11);
                int position2 = getPosition(childAt);
                int iE2 = this.mOrientationHelper.e(childAt);
                if (position2 < position) {
                    u();
                    StringBuilder sb2 = new StringBuilder("detected invalid position. loc invalid? ");
                    sb2.append(iE2 < iE);
                    throw new RuntimeException(sb2.toString());
                }
                if (iE2 > iE) {
                    u();
                    throw new RuntimeException("detected invalid location");
                }
            }
            return;
        }
        for (int i12 = 1; i12 < getChildCount(); i12++) {
            View childAt2 = getChildAt(i12);
            int position3 = getPosition(childAt2);
            int iE3 = this.mOrientationHelper.e(childAt2);
            if (position3 < position) {
                u();
                StringBuilder sb3 = new StringBuilder("detected invalid position. loc invalid? ");
                sb3.append(iE3 < iE);
                throw new RuntimeException(sb3.toString());
            }
            if (iE3 < iE) {
                u();
                throw new RuntimeException("detected invalid location");
            }
        }
    }

    public final void w(u1 u1Var, int i11, int i12) {
        if (i11 == i12) {
            return;
        }
        if (i12 <= i11) {
            while (i11 > i12) {
                removeAndRecycleViewAt(i11, u1Var);
                i11--;
            }
        } else {
            for (int i13 = i12 - 1; i13 >= i11; i13--) {
                removeAndRecycleViewAt(i13, u1Var);
            }
        }
    }

    public final void x() {
        if (this.mOrientation == 1 || !isLayoutRTL()) {
            this.mShouldReverseLayout = this.mReverseLayout;
        } else {
            this.mShouldReverseLayout = !this.mReverseLayout;
        }
    }

    public final void y(int i11, int i12, boolean z11, c2 c2Var) {
        int iK;
        this.mLayoutState.f2568l = resolveIsInfinite();
        this.mLayoutState.f2562f = i11;
        int[] iArr = this.mReusableIntPair;
        iArr[0] = 0;
        iArr[1] = 0;
        calculateExtraLayoutSpace(c2Var, iArr);
        int iMax = Math.max(0, this.mReusableIntPair[0]);
        int iMax2 = Math.max(0, this.mReusableIntPair[1]);
        boolean z12 = i11 == 1;
        o0 o0Var = this.mLayoutState;
        int i13 = z12 ? iMax2 : iMax;
        o0Var.f2564h = i13;
        if (!z12) {
            iMax = iMax2;
        }
        o0Var.f2565i = iMax;
        if (z12) {
            o0Var.f2564h = this.mOrientationHelper.h() + i13;
            View viewS = s();
            o0 o0Var2 = this.mLayoutState;
            o0Var2.f2561e = this.mShouldReverseLayout ? -1 : 1;
            int position = getPosition(viewS);
            o0 o0Var3 = this.mLayoutState;
            o0Var2.f2560d = position + o0Var3.f2561e;
            o0Var3.f2558b = this.mOrientationHelper.b(viewS);
            iK = this.mOrientationHelper.b(viewS) - this.mOrientationHelper.g();
        } else {
            View viewT = t();
            o0 o0Var4 = this.mLayoutState;
            o0Var4.f2564h = this.mOrientationHelper.k() + o0Var4.f2564h;
            o0 o0Var5 = this.mLayoutState;
            o0Var5.f2561e = this.mShouldReverseLayout ? 1 : -1;
            int position2 = getPosition(viewT);
            o0 o0Var6 = this.mLayoutState;
            o0Var5.f2560d = position2 + o0Var6.f2561e;
            o0Var6.f2558b = this.mOrientationHelper.e(viewT);
            iK = (-this.mOrientationHelper.e(viewT)) + this.mOrientationHelper.k();
        }
        o0 o0Var7 = this.mLayoutState;
        o0Var7.f2559c = i12;
        if (z11) {
            o0Var7.f2559c = i12 - iK;
        }
        o0Var7.f2563g = iK;
    }

    public final void z(int i11, int i12) {
        this.mLayoutState.f2559c = this.mOrientationHelper.g() - i12;
        o0 o0Var = this.mLayoutState;
        o0Var.f2561e = this.mShouldReverseLayout ? -1 : 1;
        o0Var.f2560d = i11;
        o0Var.f2562f = 1;
        o0Var.f2558b = i12;
        o0Var.f2563g = Integer.MIN_VALUE;
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i11, int i12) {
        this.mOrientation = 1;
        this.mReverseLayout = false;
        this.mShouldReverseLayout = false;
        this.mStackFromEnd = false;
        this.mSmoothScrollbarEnabled = true;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mPendingSavedState = null;
        this.mAnchorInfo = new m0();
        this.mLayoutChunkResult = new n0();
        this.mInitialPrefetchItemCount = 2;
        this.mReusableIntPair = new int[2];
        RecyclerView$LayoutManager$Properties properties = m1.getProperties(context, attributeSet, i11, i12);
        setOrientation(properties.orientation);
        setReverseLayout(properties.reverseLayout);
        setStackFromEnd(properties.stackFromEnd);
    }

    public void onAnchorReady(u1 u1Var, c2 c2Var, m0 m0Var, int i11) {
    }
}
