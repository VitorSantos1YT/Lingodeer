package androidx.recyclerview.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m1 {
    boolean mAutoMeasure;
    f mChildHelper;
    private int mHeight;
    private int mHeightMode;
    s2 mHorizontalBoundCheck;
    private final r2 mHorizontalBoundCheckCallback;
    boolean mIsAttachedToWindow;
    private boolean mItemPrefetchEnabled;
    private boolean mMeasurementCacheEnabled;
    int mPrefetchMaxCountObserved;
    boolean mPrefetchMaxObservedInInitialPrefetch;
    RecyclerView mRecyclerView;
    boolean mRequestedSimpleAnimations;
    b2 mSmoothScroller;
    s2 mVerticalBoundCheck;
    private final r2 mVerticalBoundCheckCallback;
    private int mWidth;
    private int mWidthMode;

    public m1() {
        k1 k1Var = new k1(this, 0);
        this.mHorizontalBoundCheckCallback = k1Var;
        k1 k1Var2 = new k1(this, 1);
        this.mVerticalBoundCheckCallback = k1Var2;
        this.mHorizontalBoundCheck = new s2(k1Var);
        this.mVerticalBoundCheck = new s2(k1Var2);
        this.mRequestedSimpleAnimations = false;
        this.mIsAttachedToWindow = false;
        this.mAutoMeasure = false;
        this.mMeasurementCacheEnabled = true;
        this.mItemPrefetchEnabled = true;
    }

    public static int chooseSize(int i11, int i12, int i13) {
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        if (mode != Integer.MIN_VALUE) {
            return mode != 1073741824 ? Math.max(i12, i13) : size;
        }
        return Math.min(size, Math.max(i12, i13));
    }

    /* JADX WARN: Code duplicated, block: B:5:0x000c A[PHI: r3
      0x000c: PHI (r3v5 int) = (r3v0 int), (r3v2 int), (r3v0 int) binds: [B:7:0x0010, B:11:0x0016, B:4:0x000a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:6:0x000e  */
    @Deprecated
    public static int getChildMeasureSpec(int i11, int i12, int i13, boolean z11) {
        int i14 = i11 - i12;
        int i15 = 0;
        int iMax = Math.max(0, i14);
        if (z11) {
            if (i13 >= 0) {
                i15 = 1073741824;
            } else {
                i13 = 0;
            }
        } else if (i13 >= 0) {
            i15 = 1073741824;
        } else if (i13 == -1) {
            i13 = iMax;
            i15 = 1073741824;
        } else if (i13 == -2) {
            i15 = Integer.MIN_VALUE;
            i13 = iMax;
        } else {
            i13 = 0;
        }
        return View.MeasureSpec.makeMeasureSpec(i13, i15);
    }

    public static RecyclerView$LayoutManager$Properties getProperties(Context context, AttributeSet attributeSet, int i11, int i12) {
        RecyclerView$LayoutManager$Properties recyclerView$LayoutManager$Properties = new RecyclerView$LayoutManager$Properties();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, v9.a.f53805a, i11, i12);
        recyclerView$LayoutManager$Properties.orientation = typedArrayObtainStyledAttributes.getInt(0, 1);
        recyclerView$LayoutManager$Properties.spanCount = typedArrayObtainStyledAttributes.getInt(10, 1);
        recyclerView$LayoutManager$Properties.reverseLayout = typedArrayObtainStyledAttributes.getBoolean(9, false);
        recyclerView$LayoutManager$Properties.stackFromEnd = typedArrayObtainStyledAttributes.getBoolean(11, false);
        typedArrayObtainStyledAttributes.recycle();
        return recyclerView$LayoutManager$Properties;
    }

    public static boolean l(int i11, int i12, int i13) {
        int mode = View.MeasureSpec.getMode(i12);
        int size = View.MeasureSpec.getSize(i12);
        if (i13 > 0 && i11 != i13) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i11;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i11;
        }
        return true;
    }

    public void addDisappearingView(View view) {
        addDisappearingView(view, -1);
    }

    public void addView(View view) {
        addView(view, -1);
    }

    public void assertInLayoutOrScroll(String str) {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            recyclerView.assertInLayoutOrScroll(str);
        }
    }

    public void assertNotInLayoutOrScroll(String str) {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            recyclerView.assertNotInLayoutOrScroll(str);
        }
    }

    public void attachView(View view, int i11, n1 n1Var) {
        g2 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (childViewHolderInt.isRemoved()) {
            y.t0 t0Var = this.mRecyclerView.mViewInfoStore.f2641a;
            t2 t2VarA = (t2) t0Var.get(childViewHolderInt);
            if (t2VarA == null) {
                t2VarA = t2.a();
                t0Var.put(childViewHolderInt, t2VarA);
            }
            t2VarA.f2622a |= 1;
        } else {
            this.mRecyclerView.mViewInfoStore.c(childViewHolderInt);
        }
        this.mChildHelper.b(view, i11, n1Var, childViewHolderInt.isRemoved());
    }

    public void calculateItemDecorationsForChild(View view, Rect rect) {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.getItemDecorInsetsForChild(view));
        }
    }

    public abstract boolean canScrollHorizontally();

    public abstract boolean canScrollVertically();

    public boolean checkLayoutParams(n1 n1Var) {
        return n1Var != null;
    }

    public abstract int computeHorizontalScrollExtent(c2 c2Var);

    public abstract int computeHorizontalScrollOffset(c2 c2Var);

    public abstract int computeHorizontalScrollRange(c2 c2Var);

    public abstract int computeVerticalScrollExtent(c2 c2Var);

    public abstract int computeVerticalScrollOffset(c2 c2Var);

    public abstract int computeVerticalScrollRange(c2 c2Var);

    public void detachAndScrapAttachedViews(u1 u1Var) {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            m(u1Var, childCount, getChildAt(childCount));
        }
    }

    public void detachAndScrapView(View view, u1 u1Var) {
        m(u1Var, this.mChildHelper.j(view), view);
    }

    public void detachAndScrapViewAt(int i11, u1 u1Var) {
        m(u1Var, i11, getChildAt(i11));
    }

    public void detachView(View view) {
        int iJ = this.mChildHelper.j(view);
        if (iJ >= 0) {
            this.mChildHelper.c(iJ);
        }
    }

    public void detachViewAt(int i11) {
        getChildAt(i11);
        this.mChildHelper.c(i11);
    }

    public void dispatchAttachedToWindow(RecyclerView recyclerView) {
        this.mIsAttachedToWindow = true;
        onAttachedToWindow(recyclerView);
    }

    public void dispatchDetachedFromWindow(RecyclerView recyclerView, u1 u1Var) {
        this.mIsAttachedToWindow = false;
        onDetachedFromWindow(recyclerView, u1Var);
    }

    public void endAnimation(View view) {
        i1 i1Var = this.mRecyclerView.mItemAnimator;
        if (i1Var != null) {
            i1Var.d(RecyclerView.getChildViewHolderInt(view));
        }
    }

    public View findContainingItemView(View view) {
        View viewFindContainingItemView;
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView == null || (viewFindContainingItemView = recyclerView.findContainingItemView(view)) == null || this.mChildHelper.f2449c.contains(viewFindContainingItemView)) {
            return null;
        }
        return viewFindContainingItemView;
    }

    public View findViewByPosition(int i11) {
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            g2 childViewHolderInt = RecyclerView.getChildViewHolderInt(childAt);
            if (childViewHolderInt != null && childViewHolderInt.getLayoutPosition() == i11 && !childViewHolderInt.shouldIgnore() && (this.mRecyclerView.mState.f2430g || !childViewHolderInt.isRemoved())) {
                return childAt;
            }
        }
        return null;
    }

    public abstract n1 generateDefaultLayoutParams();

    public n1 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof n1) {
            return new n1((n1) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new n1((ViewGroup.MarginLayoutParams) layoutParams) : new n1(layoutParams);
    }

    public int getBaseline() {
        return -1;
    }

    public int getBottomDecorationHeight(View view) {
        return ((n1) view.getLayoutParams()).f2547b.bottom;
    }

    public View getChildAt(int i11) {
        f fVar = this.mChildHelper;
        if (fVar != null) {
            return fVar.d(i11);
        }
        return null;
    }

    public int getChildCount() {
        f fVar = this.mChildHelper;
        if (fVar != null) {
            return fVar.e();
        }
        return 0;
    }

    public boolean getClipToPadding() {
        RecyclerView recyclerView = this.mRecyclerView;
        return recyclerView != null && recyclerView.mClipToPadding;
    }

    public int getColumnCountForAccessibility(u1 u1Var, c2 c2Var) {
        return -1;
    }

    public int getDecoratedBottom(View view) {
        return getBottomDecorationHeight(view) + view.getBottom();
    }

    public void getDecoratedBoundsWithMargins(View view, Rect rect) {
        RecyclerView.getDecoratedBoundsWithMarginsInt(view, rect);
    }

    public int getDecoratedLeft(View view) {
        return view.getLeft() - getLeftDecorationWidth(view);
    }

    public int getDecoratedMeasuredHeight(View view) {
        Rect rect = ((n1) view.getLayoutParams()).f2547b;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    public int getDecoratedMeasuredWidth(View view) {
        Rect rect = ((n1) view.getLayoutParams()).f2547b;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    public int getDecoratedRight(View view) {
        return getRightDecorationWidth(view) + view.getRight();
    }

    public int getDecoratedTop(View view) {
        return view.getTop() - getTopDecorationHeight(view);
    }

    public View getFocusedChild() {
        View focusedChild;
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.mChildHelper.f2449c.contains(focusedChild)) {
            return null;
        }
        return focusedChild;
    }

    public int getHeight() {
        return this.mHeight;
    }

    public int getHeightMode() {
        return this.mHeightMode;
    }

    public int getItemCount() {
        RecyclerView recyclerView = this.mRecyclerView;
        b1 adapter = recyclerView != null ? recyclerView.getAdapter() : null;
        if (adapter != null) {
            return adapter.getItemCount();
        }
        return 0;
    }

    public int getItemViewType(View view) {
        return RecyclerView.getChildViewHolderInt(view).getItemViewType();
    }

    public int getLayoutDirection() {
        RecyclerView recyclerView = this.mRecyclerView;
        WeakHashMap weakHashMap = z4.s0.f58893a;
        return recyclerView.getLayoutDirection();
    }

    public int getLeftDecorationWidth(View view) {
        return ((n1) view.getLayoutParams()).f2547b.left;
    }

    public int getMinimumHeight() {
        RecyclerView recyclerView = this.mRecyclerView;
        WeakHashMap weakHashMap = z4.s0.f58893a;
        return recyclerView.getMinimumHeight();
    }

    public int getMinimumWidth() {
        RecyclerView recyclerView = this.mRecyclerView;
        WeakHashMap weakHashMap = z4.s0.f58893a;
        return recyclerView.getMinimumWidth();
    }

    public int getPaddingBottom() {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public int getPaddingEnd() {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView == null) {
            return 0;
        }
        WeakHashMap weakHashMap = z4.s0.f58893a;
        return recyclerView.getPaddingEnd();
    }

    public int getPaddingLeft() {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public int getPaddingRight() {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public int getPaddingStart() {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView == null) {
            return 0;
        }
        WeakHashMap weakHashMap = z4.s0.f58893a;
        return recyclerView.getPaddingStart();
    }

    public int getPaddingTop() {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public int getPosition(View view) {
        return ((n1) view.getLayoutParams()).f2546a.getLayoutPosition();
    }

    public int getRightDecorationWidth(View view) {
        return ((n1) view.getLayoutParams()).f2547b.right;
    }

    public int getRowCountForAccessibility(u1 u1Var, c2 c2Var) {
        return -1;
    }

    public int getSelectionModeForAccessibility(u1 u1Var, c2 c2Var) {
        return 0;
    }

    public int getTopDecorationHeight(View view) {
        return ((n1) view.getLayoutParams()).f2547b.top;
    }

    public void getTransformedBoundingBox(View view, boolean z11, Rect rect) {
        Matrix matrix;
        if (z11) {
            Rect rect2 = ((n1) view.getLayoutParams()).f2547b;
            rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        } else {
            rect.set(0, 0, view.getWidth(), view.getHeight());
        }
        if (this.mRecyclerView != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.mRecyclerView.mTempRectF;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public int getWidth() {
        return this.mWidth;
    }

    public int getWidthMode() {
        return this.mWidthMode;
    }

    public boolean hasFlexibleChildInBothOrientations() {
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            ViewGroup.LayoutParams layoutParams = getChildAt(i11).getLayoutParams();
            if (layoutParams.width < 0 && layoutParams.height < 0) {
                return true;
            }
        }
        return false;
    }

    public boolean hasFocus() {
        RecyclerView recyclerView = this.mRecyclerView;
        return recyclerView != null && recyclerView.hasFocus();
    }

    public void ignoreView(View view) {
        ViewParent parent = view.getParent();
        RecyclerView recyclerView = this.mRecyclerView;
        if (parent != recyclerView || recyclerView.indexOfChild(view) == -1) {
            throw new IllegalArgumentException(defpackage.e.j(this.mRecyclerView, new StringBuilder("View should be fully attached to be ignored")));
        }
        g2 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        childViewHolderInt.addFlags(128);
        this.mRecyclerView.mViewInfoStore.d(childViewHolderInt);
    }

    public boolean isAttachedToWindow() {
        return this.mIsAttachedToWindow;
    }

    public abstract boolean isAutoMeasureEnabled();

    public boolean isFocused() {
        RecyclerView recyclerView = this.mRecyclerView;
        return recyclerView != null && recyclerView.isFocused();
    }

    public final boolean isItemPrefetchEnabled() {
        return this.mItemPrefetchEnabled;
    }

    public boolean isLayoutHierarchical(u1 u1Var, c2 c2Var) {
        return false;
    }

    public boolean isMeasurementCacheEnabled() {
        return this.mMeasurementCacheEnabled;
    }

    public boolean isSmoothScrolling() {
        b2 b2Var = this.mSmoothScroller;
        return b2Var != null && b2Var.isRunning();
    }

    public boolean isViewPartiallyVisible(View view, boolean z11, boolean z12) {
        boolean z13 = this.mHorizontalBoundCheck.b(view) && this.mVerticalBoundCheck.b(view);
        return z11 ? z13 : !z13;
    }

    public final void k(View view, int i11, boolean z11) {
        g2 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (z11 || childViewHolderInt.isRemoved()) {
            y.t0 t0Var = this.mRecyclerView.mViewInfoStore.f2641a;
            t2 t2VarA = (t2) t0Var.get(childViewHolderInt);
            if (t2VarA == null) {
                t2VarA = t2.a();
                t0Var.put(childViewHolderInt, t2VarA);
            }
            t2VarA.f2622a |= 1;
        } else {
            this.mRecyclerView.mViewInfoStore.c(childViewHolderInt);
        }
        n1 n1Var = (n1) view.getLayoutParams();
        if (childViewHolderInt.wasReturnedFromScrap() || childViewHolderInt.isScrap()) {
            if (childViewHolderInt.isScrap()) {
                childViewHolderInt.unScrap();
            } else {
                childViewHolderInt.clearReturnedFromScrapFlag();
            }
            this.mChildHelper.b(view, i11, view.getLayoutParams(), false);
        } else if (view.getParent() == this.mRecyclerView) {
            int iJ = this.mChildHelper.j(view);
            if (i11 == -1) {
                i11 = this.mChildHelper.e();
            }
            if (iJ == -1) {
                StringBuilder sb2 = new StringBuilder("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:");
                sb2.append(this.mRecyclerView.indexOfChild(view));
                throw new IllegalStateException(defpackage.e.j(this.mRecyclerView, sb2));
            }
            if (iJ != i11) {
                this.mRecyclerView.mLayout.moveView(iJ, i11);
            }
        } else {
            this.mChildHelper.a(view, i11, false);
            n1Var.f2548c = true;
            b2 b2Var = this.mSmoothScroller;
            if (b2Var != null && b2Var.isRunning()) {
                this.mSmoothScroller.onChildAttachedToWindow(view);
            }
        }
        if (n1Var.f2549d) {
            childViewHolderInt.itemView.invalidate();
            n1Var.f2549d = false;
        }
    }

    public void layoutDecorated(View view, int i11, int i12, int i13, int i14) {
        Rect rect = ((n1) view.getLayoutParams()).f2547b;
        view.layout(i11 + rect.left, i12 + rect.top, i13 - rect.right, i14 - rect.bottom);
    }

    public void layoutDecoratedWithMargins(View view, int i11, int i12, int i13, int i14) {
        n1 n1Var = (n1) view.getLayoutParams();
        Rect rect = n1Var.f2547b;
        view.layout(i11 + rect.left + ((ViewGroup.MarginLayoutParams) n1Var).leftMargin, i12 + rect.top + ((ViewGroup.MarginLayoutParams) n1Var).topMargin, (i13 - rect.right) - ((ViewGroup.MarginLayoutParams) n1Var).rightMargin, (i14 - rect.bottom) - ((ViewGroup.MarginLayoutParams) n1Var).bottomMargin);
    }

    public final void m(u1 u1Var, int i11, View view) {
        g2 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (childViewHolderInt.shouldIgnore()) {
            return;
        }
        if (childViewHolderInt.isInvalid() && !childViewHolderInt.isRemoved() && !this.mRecyclerView.mAdapter.hasStableIds()) {
            removeViewAt(i11);
            u1Var.k(childViewHolderInt);
        } else {
            detachViewAt(i11);
            u1Var.l(view);
            this.mRecyclerView.mViewInfoStore.c(childViewHolderInt);
        }
    }

    public void measureChild(View view, int i11, int i12) {
        n1 n1Var = (n1) view.getLayoutParams();
        Rect itemDecorInsetsForChild = this.mRecyclerView.getItemDecorInsetsForChild(view);
        int i13 = itemDecorInsetsForChild.left + itemDecorInsetsForChild.right + i11;
        int i14 = itemDecorInsetsForChild.top + itemDecorInsetsForChild.bottom + i12;
        int childMeasureSpec = getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingRight() + getPaddingLeft() + i13, ((ViewGroup.MarginLayoutParams) n1Var).width, canScrollHorizontally());
        int childMeasureSpec2 = getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingBottom() + getPaddingTop() + i14, ((ViewGroup.MarginLayoutParams) n1Var).height, canScrollVertically());
        if (shouldMeasureChild(view, childMeasureSpec, childMeasureSpec2, n1Var)) {
            view.measure(childMeasureSpec, childMeasureSpec2);
        }
    }

    public void measureChildWithMargins(View view, int i11, int i12) {
        n1 n1Var = (n1) view.getLayoutParams();
        Rect itemDecorInsetsForChild = this.mRecyclerView.getItemDecorInsetsForChild(view);
        int i13 = itemDecorInsetsForChild.left + itemDecorInsetsForChild.right + i11;
        int i14 = itemDecorInsetsForChild.top + itemDecorInsetsForChild.bottom + i12;
        int childMeasureSpec = getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingRight() + getPaddingLeft() + ((ViewGroup.MarginLayoutParams) n1Var).leftMargin + ((ViewGroup.MarginLayoutParams) n1Var).rightMargin + i13, ((ViewGroup.MarginLayoutParams) n1Var).width, canScrollHorizontally());
        int childMeasureSpec2 = getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingBottom() + getPaddingTop() + ((ViewGroup.MarginLayoutParams) n1Var).topMargin + ((ViewGroup.MarginLayoutParams) n1Var).bottomMargin + i14, ((ViewGroup.MarginLayoutParams) n1Var).height, canScrollVertically());
        if (shouldMeasureChild(view, childMeasureSpec, childMeasureSpec2, n1Var)) {
            view.measure(childMeasureSpec, childMeasureSpec2);
        }
    }

    public void moveView(int i11, int i12) {
        View childAt = getChildAt(i11);
        if (childAt != null) {
            detachViewAt(i11);
            attachView(childAt, i12);
        } else {
            throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i11 + this.mRecyclerView.toString());
        }
    }

    public void offsetChildrenHorizontal(int i11) {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            recyclerView.offsetChildrenHorizontal(i11);
        }
    }

    public void offsetChildrenVertical(int i11) {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            recyclerView.offsetChildrenVertical(i11);
        }
    }

    public boolean onAddFocusables(RecyclerView recyclerView, ArrayList<View> arrayList, int i11, int i12) {
        return false;
    }

    @Deprecated
    public void onDetachedFromWindow(RecyclerView recyclerView) {
    }

    public abstract void onDetachedFromWindow(RecyclerView recyclerView, u1 u1Var);

    public View onFocusSearchFailed(View view, int i11, u1 u1Var, c2 c2Var) {
        return null;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.mRecyclerView;
        onInitializeAccessibilityEvent(recyclerView.mRecycler, recyclerView.mState, accessibilityEvent);
    }

    public void onInitializeAccessibilityNodeInfo(a5.g gVar) {
        RecyclerView recyclerView = this.mRecyclerView;
        onInitializeAccessibilityNodeInfo(recyclerView.mRecycler, recyclerView.mState, gVar);
    }

    public void onInitializeAccessibilityNodeInfoForItem(View view, a5.g gVar) {
        g2 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (childViewHolderInt == null || childViewHolderInt.isRemoved()) {
            return;
        }
        f fVar = this.mChildHelper;
        if (fVar.f2449c.contains(childViewHolderInt.itemView)) {
            return;
        }
        RecyclerView recyclerView = this.mRecyclerView;
        onInitializeAccessibilityNodeInfoForItem(recyclerView.mRecycler, recyclerView.mState, view, gVar);
    }

    public View onInterceptFocusSearch(View view, int i11) {
        return null;
    }

    public void onItemsUpdated(RecyclerView recyclerView, int i11, int i12) {
    }

    public abstract void onLayoutChildren(u1 u1Var, c2 c2Var);

    public abstract void onLayoutCompleted(c2 c2Var);

    public void onMeasure(u1 u1Var, c2 c2Var, int i11, int i12) {
        this.mRecyclerView.defaultOnMeasure(i11, i12);
    }

    @Deprecated
    public boolean onRequestChildFocus(RecyclerView recyclerView, View view, View view2) {
        return isSmoothScrolling() || recyclerView.isComputingLayout();
    }

    public Parcelable onSaveInstanceState() {
        return null;
    }

    public void onSmoothScrollerStopped(b2 b2Var) {
        if (this.mSmoothScroller == b2Var) {
            this.mSmoothScroller = null;
        }
    }

    public boolean performAccessibilityAction(int i11, Bundle bundle) {
        RecyclerView recyclerView = this.mRecyclerView;
        return performAccessibilityAction(recyclerView.mRecycler, recyclerView.mState, i11, bundle);
    }

    public boolean performAccessibilityActionForItem(u1 u1Var, c2 c2Var, View view, int i11, Bundle bundle) {
        return false;
    }

    public void postOnAnimation(Runnable runnable) {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            WeakHashMap weakHashMap = z4.s0.f58893a;
            recyclerView.postOnAnimation(runnable);
        }
    }

    public void removeAllViews() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            f fVar = this.mChildHelper;
            int iF = fVar.f(childCount);
            y0 y0Var = fVar.f2447a;
            View childAt = y0Var.f2652a.getChildAt(iF);
            if (childAt != null) {
                if (fVar.f2448b.I(iF)) {
                    fVar.k(childAt);
                }
                y0Var.b(iF);
            }
        }
    }

    public void removeAndRecycleAllViews(u1 u1Var) {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (!RecyclerView.getChildViewHolderInt(getChildAt(childCount)).shouldIgnore()) {
                removeAndRecycleViewAt(childCount, u1Var);
            }
        }
    }

    public void removeAndRecycleScrapInt(u1 u1Var) {
        ArrayList arrayList = u1Var.f2629a;
        int size = arrayList.size();
        for (int i11 = size - 1; i11 >= 0; i11--) {
            View view = ((g2) arrayList.get(i11)).itemView;
            g2 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (!childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.setIsRecyclable(false);
                if (childViewHolderInt.isTmpDetached()) {
                    this.mRecyclerView.removeDetachedView(view, false);
                }
                i1 i1Var = this.mRecyclerView.mItemAnimator;
                if (i1Var != null) {
                    i1Var.d(childViewHolderInt);
                }
                childViewHolderInt.setIsRecyclable(true);
                g2 childViewHolderInt2 = RecyclerView.getChildViewHolderInt(view);
                childViewHolderInt2.mScrapContainer = null;
                childViewHolderInt2.mInChangeScrap = false;
                childViewHolderInt2.clearReturnedFromScrapFlag();
                u1Var.k(childViewHolderInt2);
            }
        }
        arrayList.clear();
        ArrayList arrayList2 = u1Var.f2630b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.mRecyclerView.invalidate();
        }
    }

    public void removeAndRecycleView(View view, u1 u1Var) {
        removeView(view);
        u1Var.j(view);
    }

    public void removeAndRecycleViewAt(int i11, u1 u1Var) {
        View childAt = getChildAt(i11);
        removeViewAt(i11);
        u1Var.j(childAt);
    }

    public boolean removeCallbacks(Runnable runnable) {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            return recyclerView.removeCallbacks(runnable);
        }
        return false;
    }

    public void removeDetachedView(View view) {
        this.mRecyclerView.removeDetachedView(view, false);
    }

    public void removeView(View view) {
        f fVar = this.mChildHelper;
        y0 y0Var = fVar.f2447a;
        int iIndexOfChild = y0Var.f2652a.indexOfChild(view);
        if (iIndexOfChild < 0) {
            return;
        }
        if (fVar.f2448b.I(iIndexOfChild)) {
            fVar.k(view);
        }
        y0Var.b(iIndexOfChild);
    }

    public void removeViewAt(int i11) {
        if (getChildAt(i11) != null) {
            f fVar = this.mChildHelper;
            int iF = fVar.f(i11);
            y0 y0Var = fVar.f2447a;
            View childAt = y0Var.f2652a.getChildAt(iF);
            if (childAt == null) {
                return;
            }
            if (fVar.f2448b.I(iF)) {
                fVar.k(childAt);
            }
            y0Var.b(iF);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:33:0x00be  */
    /* JADX WARN: Code duplicated, block: B:34:0x00c2  */
    public boolean requestChildRectangleOnScreen(RecyclerView recyclerView, View view, Rect rect, boolean z11, boolean z12) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int height = getHeight() - getPaddingBottom();
        int left = (view.getLeft() + rect.left) - view.getScrollX();
        int top = (view.getTop() + rect.top) - view.getScrollY();
        int iWidth = rect.width() + left;
        int iHeight = rect.height() + top;
        int i11 = left - paddingLeft;
        int iMin = Math.min(0, i11);
        int i12 = top - paddingTop;
        int iMin2 = Math.min(0, i12);
        int i13 = iWidth - width;
        int iMax = Math.max(0, i13);
        int iMax2 = Math.max(0, iHeight - height);
        if (getLayoutDirection() != 1) {
            if (iMin == 0) {
                iMin = Math.min(i11, iMax);
            }
            iMax = iMin;
        } else if (iMax == 0) {
            iMax = Math.max(iMin, i13);
        }
        if (iMin2 == 0) {
            iMin2 = Math.min(i12, iMax2);
        }
        int[] iArr = {iMax, iMin2};
        int i14 = iArr[0];
        int i15 = iArr[1];
        if (z12) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild != null) {
                int paddingLeft2 = getPaddingLeft();
                int paddingTop2 = getPaddingTop();
                int width2 = getWidth() - getPaddingRight();
                int height2 = getHeight() - getPaddingBottom();
                Rect rect2 = this.mRecyclerView.mTempRect;
                getDecoratedBoundsWithMargins(focusedChild, rect2);
                if (rect2.left - i14 < width2 && rect2.right - i14 > paddingLeft2 && rect2.top - i15 < height2 && rect2.bottom - i15 > paddingTop2) {
                    if (i14 == 0) {
                    }
                    if (z11) {
                        recyclerView.scrollBy(i14, i15);
                    } else {
                        recyclerView.smoothScrollBy(i14, i15);
                    }
                    return true;
                }
            }
        } else if (i14 == 0 || i15 != 0) {
            if (z11) {
                recyclerView.scrollBy(i14, i15);
            } else {
                recyclerView.smoothScrollBy(i14, i15);
            }
            return true;
        }
        return false;
    }

    public void requestLayout() {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public void requestSimpleAnimationsInNextLayout() {
        this.mRequestedSimpleAnimations = true;
    }

    public abstract int scrollHorizontallyBy(int i11, u1 u1Var, c2 c2Var);

    public abstract void scrollToPosition(int i11);

    public abstract int scrollVerticallyBy(int i11, u1 u1Var, c2 c2Var);

    @Deprecated
    public void setAutoMeasureEnabled(boolean z11) {
        this.mAutoMeasure = z11;
    }

    public void setExactMeasureSpecsFrom(RecyclerView recyclerView) {
        setMeasureSpecs(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    public final void setItemPrefetchEnabled(boolean z11) {
        if (z11 != this.mItemPrefetchEnabled) {
            this.mItemPrefetchEnabled = z11;
            this.mPrefetchMaxCountObserved = 0;
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.mRecycler.o();
            }
        }
    }

    public void setMeasureSpecs(int i11, int i12) {
        this.mWidth = View.MeasureSpec.getSize(i11);
        int mode = View.MeasureSpec.getMode(i11);
        this.mWidthMode = mode;
        if (mode == 0 && !RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
            this.mWidth = 0;
        }
        this.mHeight = View.MeasureSpec.getSize(i12);
        int mode2 = View.MeasureSpec.getMode(i12);
        this.mHeightMode = mode2;
        if (mode2 != 0 || RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
            return;
        }
        this.mHeight = 0;
    }

    public void setMeasuredDimension(Rect rect, int i11, int i12) {
        setMeasuredDimension(chooseSize(i11, getPaddingRight() + getPaddingLeft() + rect.width(), getMinimumWidth()), chooseSize(i12, getPaddingBottom() + getPaddingTop() + rect.height(), getMinimumHeight()));
    }

    public void setMeasuredDimensionFromChildren(int i11, int i12) {
        int childCount = getChildCount();
        if (childCount == 0) {
            this.mRecyclerView.defaultOnMeasure(i11, i12);
            return;
        }
        int i13 = Integer.MIN_VALUE;
        int i14 = Integer.MAX_VALUE;
        int i15 = Integer.MIN_VALUE;
        int i16 = Integer.MAX_VALUE;
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = getChildAt(i17);
            Rect rect = this.mRecyclerView.mTempRect;
            getDecoratedBoundsWithMargins(childAt, rect);
            int i18 = rect.left;
            if (i18 < i16) {
                i16 = i18;
            }
            int i19 = rect.right;
            if (i19 > i13) {
                i13 = i19;
            }
            int i21 = rect.top;
            if (i21 < i14) {
                i14 = i21;
            }
            int i22 = rect.bottom;
            if (i22 > i15) {
                i15 = i22;
            }
        }
        this.mRecyclerView.mTempRect.set(i16, i14, i13, i15);
        setMeasuredDimension(this.mRecyclerView.mTempRect, i11, i12);
    }

    public void setMeasurementCacheEnabled(boolean z11) {
        this.mMeasurementCacheEnabled = z11;
    }

    public void setRecyclerView(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.mRecyclerView = null;
            this.mChildHelper = null;
            this.mWidth = 0;
            this.mHeight = 0;
        } else {
            this.mRecyclerView = recyclerView;
            this.mChildHelper = recyclerView.mChildHelper;
            this.mWidth = recyclerView.getWidth();
            this.mHeight = recyclerView.getHeight();
        }
        this.mWidthMode = 1073741824;
        this.mHeightMode = 1073741824;
    }

    public boolean shouldMeasureChild(View view, int i11, int i12, n1 n1Var) {
        return (!view.isLayoutRequested() && this.mMeasurementCacheEnabled && l(view.getWidth(), i11, ((ViewGroup.MarginLayoutParams) n1Var).width) && l(view.getHeight(), i12, ((ViewGroup.MarginLayoutParams) n1Var).height)) ? false : true;
    }

    public boolean shouldMeasureTwice() {
        return false;
    }

    public boolean shouldReMeasureChild(View view, int i11, int i12, n1 n1Var) {
        return (this.mMeasurementCacheEnabled && l(view.getMeasuredWidth(), i11, ((ViewGroup.MarginLayoutParams) n1Var).width) && l(view.getMeasuredHeight(), i12, ((ViewGroup.MarginLayoutParams) n1Var).height)) ? false : true;
    }

    public abstract void smoothScrollToPosition(RecyclerView recyclerView, c2 c2Var, int i11);

    public void startSmoothScroll(b2 b2Var) {
        b2 b2Var2 = this.mSmoothScroller;
        if (b2Var2 != null && b2Var != b2Var2 && b2Var2.isRunning()) {
            this.mSmoothScroller.stop();
        }
        this.mSmoothScroller = b2Var;
        b2Var.start(this.mRecyclerView, this);
    }

    public void stopIgnoringView(View view) {
        g2 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        childViewHolderInt.stopIgnoring();
        childViewHolderInt.resetInternal();
        childViewHolderInt.addFlags(4);
    }

    public void stopSmoothScroller() {
        b2 b2Var = this.mSmoothScroller;
        if (b2Var != null) {
            b2Var.stop();
        }
    }

    public boolean supportsPredictiveItemAnimations() {
        return false;
    }

    public void addDisappearingView(View view, int i11) {
        k(view, i11, true);
    }

    public void addView(View view, int i11) {
        k(view, i11, false);
    }

    public void onInitializeAccessibilityEvent(u1 u1Var, c2 c2Var, AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView == null || accessibilityEvent == null) {
            return;
        }
        boolean z11 = true;
        if (!recyclerView.canScrollVertically(1) && !this.mRecyclerView.canScrollVertically(-1) && !this.mRecyclerView.canScrollHorizontally(-1) && !this.mRecyclerView.canScrollHorizontally(1)) {
            z11 = false;
        }
        accessibilityEvent.setScrollable(z11);
        b1 b1Var = this.mRecyclerView.mAdapter;
        if (b1Var != null) {
            accessibilityEvent.setItemCount(b1Var.getItemCount());
        }
    }

    public void onInitializeAccessibilityNodeInfo(u1 u1Var, c2 c2Var, a5.g gVar) {
        if (this.mRecyclerView.canScrollVertically(-1) || this.mRecyclerView.canScrollHorizontally(-1)) {
            gVar.a(OSSConstants.DEFAULT_BUFFER_SIZE);
            gVar.u(true);
        }
        if (this.mRecyclerView.canScrollVertically(1) || this.mRecyclerView.canScrollHorizontally(1)) {
            gVar.a(4096);
            gVar.u(true);
        }
        gVar.n(hd.d.v(getRowCountForAccessibility(u1Var, c2Var), getColumnCountForAccessibility(u1Var, c2Var), getSelectionModeForAccessibility(u1Var, c2Var), isLayoutHierarchical(u1Var, c2Var)));
    }

    public void onItemsUpdated(RecyclerView recyclerView, int i11, int i12, Object obj) {
        onItemsUpdated(recyclerView, i11, i12);
    }

    public boolean onRequestChildFocus(RecyclerView recyclerView, c2 c2Var, View view, View view2) {
        return onRequestChildFocus(recyclerView, view, view2);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0067 A[PHI: r9
      0x0067: PHI (r9v8 int) = (r9v5 int), (r9v11 int) binds: [B:29:0x0084, B:20:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
    public boolean performAccessibilityAction(u1 u1Var, c2 c2Var, int i11, Bundle bundle) {
        int paddingTop;
        int paddingLeft;
        int i12;
        int i13;
        if (this.mRecyclerView == null) {
            return false;
        }
        int height = getHeight();
        int width = getWidth();
        Rect rect = new Rect();
        if (this.mRecyclerView.getMatrix().isIdentity() && this.mRecyclerView.getGlobalVisibleRect(rect)) {
            height = rect.height();
            width = rect.width();
        }
        if (i11 == 4096) {
            paddingTop = this.mRecyclerView.canScrollVertically(1) ? (height - getPaddingTop()) - getPaddingBottom() : 0;
            if (this.mRecyclerView.canScrollHorizontally(1)) {
                paddingLeft = (width - getPaddingLeft()) - getPaddingRight();
                i12 = paddingTop;
                i13 = paddingLeft;
            } else {
                i12 = paddingTop;
                i13 = 0;
            }
        } else if (i11 != 8192) {
            i13 = 0;
            i12 = 0;
        } else {
            paddingTop = this.mRecyclerView.canScrollVertically(-1) ? -((height - getPaddingTop()) - getPaddingBottom()) : 0;
            if (this.mRecyclerView.canScrollHorizontally(-1)) {
                paddingLeft = -((width - getPaddingLeft()) - getPaddingRight());
                i12 = paddingTop;
                i13 = paddingLeft;
            } else {
                i12 = paddingTop;
                i13 = 0;
            }
        }
        if (i12 == 0 && i13 == 0) {
            return false;
        }
        this.mRecyclerView.smoothScrollBy(i13, i12, null, Integer.MIN_VALUE, true);
        return true;
    }

    public boolean performAccessibilityActionForItem(View view, int i11, Bundle bundle) {
        RecyclerView recyclerView = this.mRecyclerView;
        return performAccessibilityActionForItem(recyclerView.mRecycler, recyclerView.mState, view, i11, bundle);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001a  */
    /* JADX WARN: Code duplicated, block: B:14:0x0022  */
    /* JADX WARN: Code duplicated, block: B:5:0x0010  */
    public static int getChildMeasureSpec(int i11, int i12, int i13, int i14, boolean z11) {
        int iMax = Math.max(0, i11 - i13);
        if (z11) {
            if (i14 >= 0) {
                i12 = 1073741824;
            } else if (i14 != -1 || (i12 != Integer.MIN_VALUE && (i12 == 0 || i12 != 1073741824))) {
                i12 = 0;
                i14 = 0;
            } else {
                i14 = iMax;
            }
        } else if (i14 >= 0) {
            i12 = 1073741824;
        } else if (i14 == -1) {
            i14 = iMax;
        } else if (i14 != -2) {
            i12 = 0;
            i14 = 0;
        } else if (i12 == Integer.MIN_VALUE || i12 == 1073741824) {
            i14 = iMax;
            i12 = Integer.MIN_VALUE;
        } else {
            i14 = iMax;
            i12 = 0;
        }
        return View.MeasureSpec.makeMeasureSpec(i14, i12);
    }

    public n1 generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new n1(context, attributeSet);
    }

    public void onInitializeAccessibilityNodeInfoForItem(u1 u1Var, c2 c2Var, View view, a5.g gVar) {
    }

    public void setMeasuredDimension(int i11, int i12) {
        this.mRecyclerView.setMeasuredDimension(i11, i12);
    }

    public void attachView(View view, int i11) {
        attachView(view, i11, (n1) view.getLayoutParams());
    }

    public void attachView(View view) {
        attachView(view, -1);
    }

    public void onAttachedToWindow(RecyclerView recyclerView) {
    }

    public void onItemsChanged(RecyclerView recyclerView) {
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
    }

    public void onScrollStateChanged(int i11) {
    }

    public boolean requestChildRectangleOnScreen(RecyclerView recyclerView, View view, Rect rect, boolean z11) {
        return requestChildRectangleOnScreen(recyclerView, view, rect, z11, false);
    }

    public void collectInitialPrefetchPositions(int i11, l1 l1Var) {
    }

    public void onAdapterChanged(b1 b1Var, b1 b1Var2) {
    }

    public void onItemsAdded(RecyclerView recyclerView, int i11, int i12) {
    }

    public void onItemsRemoved(RecyclerView recyclerView, int i11, int i12) {
    }

    public void collectAdjacentPrefetchPositions(int i11, int i12, c2 c2Var, l1 l1Var) {
    }

    public void onItemsMoved(RecyclerView recyclerView, int i11, int i12, int i13) {
    }
}
