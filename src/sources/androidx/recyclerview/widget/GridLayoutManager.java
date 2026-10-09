package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import com.google.firebase.annotations.jjzf.kHfjNGauVgdF;
import com.yalantis.ucrop.view.CropImageView;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {
    public final Rect H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f2384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f2386c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View[] f2387d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SparseIntArray f2388e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final SparseIntArray f2389f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public f0 f2390t;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        this.f2384a = false;
        this.f2385b = -1;
        this.f2388e = new SparseIntArray();
        this.f2389f = new SparseIntArray();
        this.f2390t = new d0();
        this.H = new Rect();
        I(m1.getProperties(context, attributeSet, i11, i12).spanCount);
    }

    public final void B(int i11) {
        int i12;
        int[] iArr = this.f2386c;
        int i13 = this.f2385b;
        if (iArr == null || iArr.length != i13 + 1 || iArr[iArr.length - 1] != i11) {
            iArr = new int[i13 + 1];
        }
        int i14 = 0;
        iArr[0] = 0;
        int i15 = i11 / i13;
        int i16 = i11 % i13;
        int i17 = 0;
        for (int i18 = 1; i18 <= i13; i18++) {
            i14 += i16;
            if (i14 <= 0 || i13 - i14 >= i16) {
                i12 = i15;
            } else {
                i12 = i15 + 1;
                i14 -= i13;
            }
            i17 += i12;
            iArr[i18] = i17;
        }
        this.f2386c = iArr;
    }

    public final void C() {
        View[] viewArr = this.f2387d;
        if (viewArr == null || viewArr.length != this.f2385b) {
            this.f2387d = new View[this.f2385b];
        }
    }

    public final int D(int i11, int i12) {
        if (this.mOrientation != 1 || !isLayoutRTL()) {
            int[] iArr = this.f2386c;
            return iArr[i12 + i11] - iArr[i11];
        }
        int[] iArr2 = this.f2386c;
        int i13 = this.f2385b;
        return iArr2[i13 - i11] - iArr2[(i13 - i11) - i12];
    }

    public final int E(int i11, u1 u1Var, c2 c2Var) {
        if (!c2Var.f2430g) {
            return this.f2390t.getCachedSpanGroupIndex(i11, this.f2385b);
        }
        int iB = u1Var.b(i11);
        if (iB == -1) {
            return 0;
        }
        return this.f2390t.getCachedSpanGroupIndex(iB, this.f2385b);
    }

    public final int F(int i11, u1 u1Var, c2 c2Var) {
        if (!c2Var.f2430g) {
            return this.f2390t.getCachedSpanIndex(i11, this.f2385b);
        }
        int i12 = this.f2389f.get(i11, -1);
        if (i12 != -1) {
            return i12;
        }
        int iB = u1Var.b(i11);
        if (iB == -1) {
            return 0;
        }
        return this.f2390t.getCachedSpanIndex(iB, this.f2385b);
    }

    public final int G(int i11, u1 u1Var, c2 c2Var) {
        if (!c2Var.f2430g) {
            return this.f2390t.getSpanSize(i11);
        }
        int i12 = this.f2388e.get(i11, -1);
        if (i12 != -1) {
            return i12;
        }
        int iB = u1Var.b(i11);
        if (iB == -1) {
            return 1;
        }
        return this.f2390t.getSpanSize(iB);
    }

    public final void H(View view, int i11, boolean z11) {
        int childMeasureSpec;
        int childMeasureSpec2;
        e0 e0Var = (e0) view.getLayoutParams();
        Rect rect = e0Var.f2547b;
        int i12 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) e0Var).topMargin + ((ViewGroup.MarginLayoutParams) e0Var).bottomMargin;
        int i13 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) e0Var).leftMargin + ((ViewGroup.MarginLayoutParams) e0Var).rightMargin;
        int iD = D(e0Var.f2445e, e0Var.f2446f);
        if (this.mOrientation == 1) {
            childMeasureSpec2 = m1.getChildMeasureSpec(iD, i11, i13, ((ViewGroup.MarginLayoutParams) e0Var).width, false);
            childMeasureSpec = m1.getChildMeasureSpec(this.mOrientationHelper.l(), getHeightMode(), i12, ((ViewGroup.MarginLayoutParams) e0Var).height, true);
        } else {
            int childMeasureSpec3 = m1.getChildMeasureSpec(iD, i11, i12, ((ViewGroup.MarginLayoutParams) e0Var).height, false);
            int childMeasureSpec4 = m1.getChildMeasureSpec(this.mOrientationHelper.l(), getWidthMode(), i13, ((ViewGroup.MarginLayoutParams) e0Var).width, true);
            childMeasureSpec = childMeasureSpec3;
            childMeasureSpec2 = childMeasureSpec4;
        }
        n1 n1Var = (n1) view.getLayoutParams();
        if (z11 ? shouldReMeasureChild(view, childMeasureSpec2, childMeasureSpec, n1Var) : shouldMeasureChild(view, childMeasureSpec2, childMeasureSpec, n1Var)) {
            view.measure(childMeasureSpec2, childMeasureSpec);
        }
    }

    public final void I(int i11) {
        if (i11 == this.f2385b) {
            return;
        }
        this.f2384a = true;
        if (i11 < 1) {
            throw new IllegalArgumentException(nv.p.j(i11, "Span count should be at least 1. Provided "));
        }
        this.f2385b = i11;
        this.f2390t.invalidateSpanIndexCache();
        requestLayout();
    }

    public final void J() {
        int height;
        int paddingTop;
        if (getOrientation() == 1) {
            height = getWidth() - getPaddingRight();
            paddingTop = getPaddingLeft();
        } else {
            height = getHeight() - getPaddingBottom();
            paddingTop = getPaddingTop();
        }
        B(height - paddingTop);
    }

    @Override // androidx.recyclerview.widget.m1
    public final boolean checkLayoutParams(n1 n1Var) {
        return n1Var instanceof e0;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void collectPrefetchPositionsForLayoutState(c2 c2Var, o0 o0Var, l1 l1Var) {
        int i11;
        int spanSize = this.f2385b;
        for (int i12 = 0; i12 < this.f2385b && (i11 = o0Var.f2560d) >= 0 && i11 < c2Var.b() && spanSize > 0; i12++) {
            int i13 = o0Var.f2560d;
            ((a0) l1Var).a(i13, Math.max(0, o0Var.f2563g));
            spanSize -= this.f2390t.getSpanSize(i13);
            o0Var.f2560d += o0Var.f2561e;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final View findReferenceChild(u1 u1Var, c2 c2Var, boolean z11, boolean z12) {
        int i11;
        int childCount;
        int childCount2 = getChildCount();
        int i12 = 1;
        if (z12) {
            childCount = getChildCount() - 1;
            i11 = -1;
            i12 = -1;
        } else {
            i11 = childCount2;
            childCount = 0;
        }
        int iB = c2Var.b();
        ensureLayoutState();
        int iK = this.mOrientationHelper.k();
        int iG = this.mOrientationHelper.g();
        View view = null;
        View view2 = null;
        while (childCount != i11) {
            View childAt = getChildAt(childCount);
            int position = getPosition(childAt);
            if (position >= 0 && position < iB && F(position, u1Var, c2Var) == 0) {
                if (((n1) childAt.getLayoutParams()).f2546a.isRemoved()) {
                    if (view2 == null) {
                        view2 = childAt;
                    }
                } else {
                    if (this.mOrientationHelper.e(childAt) < iG && this.mOrientationHelper.b(childAt) >= iK) {
                        return childAt;
                    }
                    if (view == null) {
                        view = childAt;
                    }
                }
            }
            childCount += i12;
        }
        return view != null ? view : view2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.m1
    public final n1 generateDefaultLayoutParams() {
        return this.mOrientation == 0 ? new e0(-2, -1) : new e0(-1, -2);
    }

    @Override // androidx.recyclerview.widget.m1
    public final n1 generateLayoutParams(Context context, AttributeSet attributeSet) {
        e0 e0Var = new e0(context, attributeSet);
        e0Var.f2445e = -1;
        e0Var.f2446f = 0;
        return e0Var;
    }

    @Override // androidx.recyclerview.widget.m1
    public final int getColumnCountForAccessibility(u1 u1Var, c2 c2Var) {
        if (this.mOrientation == 1) {
            return this.f2385b;
        }
        if (c2Var.b() < 1) {
            return 0;
        }
        return E(c2Var.b() - 1, u1Var, c2Var) + 1;
    }

    @Override // androidx.recyclerview.widget.m1
    public final int getRowCountForAccessibility(u1 u1Var, c2 c2Var) {
        if (this.mOrientation == 0) {
            return this.f2385b;
        }
        if (c2Var.b() < 1) {
            return 0;
        }
        return E(c2Var.b() - 1, u1Var, c2Var) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void layoutChunk(u1 u1Var, c2 c2Var, o0 o0Var, n0 n0Var) {
        int i11;
        int i12;
        int i13;
        int iD;
        int paddingLeft;
        int paddingTop;
        int iD2;
        int childMeasureSpec;
        int childMeasureSpec2;
        boolean z11;
        int i14;
        View viewB;
        int iJ = this.mOrientationHelper.j();
        boolean z12 = iJ != 1073741824;
        int i15 = getChildCount() > 0 ? this.f2386c[this.f2385b] : 0;
        if (z12) {
            J();
        }
        boolean z13 = o0Var.f2561e == 1;
        int iF = this.f2385b;
        if (!z13) {
            iF = F(o0Var.f2560d, u1Var, c2Var) + G(o0Var.f2560d, u1Var, c2Var);
        }
        int i16 = 0;
        while (i16 < this.f2385b && (i14 = o0Var.f2560d) >= 0 && i14 < c2Var.b() && iF > 0) {
            int i17 = o0Var.f2560d;
            int iG = G(i17, u1Var, c2Var);
            if (iG > this.f2385b) {
                throw new IllegalArgumentException(hh.p0.i(this.f2385b, " spans.", w4.c.k("Item at position ", i17, " requires ", iG, " spans but GridLayoutManager has only ")));
            }
            iF -= iG;
            if (iF < 0 || (viewB = o0Var.b(u1Var)) == null) {
                break;
            }
            this.f2387d[i16] = viewB;
            i16++;
        }
        if (i16 == 0) {
            n0Var.f2543b = true;
            return;
        }
        if (z13) {
            i13 = 1;
            i12 = i16;
            i11 = 0;
        } else {
            i11 = i16 - 1;
            i12 = -1;
            i13 = -1;
        }
        int i18 = 0;
        while (i11 != i12) {
            View view = this.f2387d[i11];
            e0 e0Var = (e0) view.getLayoutParams();
            int iG2 = G(getPosition(view), u1Var, c2Var);
            e0Var.f2446f = iG2;
            e0Var.f2445e = i18;
            i18 += iG2;
            i11 += i13;
        }
        float f5 = CropImageView.DEFAULT_ASPECT_RATIO;
        int i19 = 0;
        for (int i21 = 0; i21 < i16; i21++) {
            View view2 = this.f2387d[i21];
            if (o0Var.f2567k != null) {
                z11 = false;
                if (z13) {
                    addDisappearingView(view2);
                } else {
                    addDisappearingView(view2, 0);
                }
            } else if (z13) {
                addView(view2);
                z11 = false;
            } else {
                z11 = false;
                addView(view2, 0);
            }
            calculateItemDecorationsForChild(view2, this.H);
            H(view2, iJ, z11);
            int iC = this.mOrientationHelper.c(view2);
            if (iC > i19) {
                i19 = iC;
            }
            float fD = (this.mOrientationHelper.d(view2) * 1.0f) / ((e0) view2.getLayoutParams()).f2446f;
            if (fD > f5) {
                f5 = fD;
            }
        }
        if (z12) {
            B(Math.max(Math.round(f5 * this.f2385b), i15));
            i19 = 0;
            for (int i22 = 0; i22 < i16; i22++) {
                View view3 = this.f2387d[i22];
                H(view3, 1073741824, true);
                int iC2 = this.mOrientationHelper.c(view3);
                if (iC2 > i19) {
                    i19 = iC2;
                }
            }
        }
        for (int i23 = 0; i23 < i16; i23++) {
            View view4 = this.f2387d[i23];
            if (this.mOrientationHelper.c(view4) != i19) {
                e0 e0Var2 = (e0) view4.getLayoutParams();
                Rect rect = e0Var2.f2547b;
                int i24 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) e0Var2).topMargin + ((ViewGroup.MarginLayoutParams) e0Var2).bottomMargin;
                int i25 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) e0Var2).leftMargin + ((ViewGroup.MarginLayoutParams) e0Var2).rightMargin;
                int iD3 = D(e0Var2.f2445e, e0Var2.f2446f);
                if (this.mOrientation == 1) {
                    childMeasureSpec2 = m1.getChildMeasureSpec(iD3, 1073741824, i25, ((ViewGroup.MarginLayoutParams) e0Var2).width, false);
                    childMeasureSpec = View.MeasureSpec.makeMeasureSpec(i19 - i24, 1073741824);
                } else {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i19 - i25, 1073741824);
                    childMeasureSpec = m1.getChildMeasureSpec(iD3, 1073741824, i24, ((ViewGroup.MarginLayoutParams) e0Var2).height, false);
                    childMeasureSpec2 = iMakeMeasureSpec;
                }
                if (shouldReMeasureChild(view4, childMeasureSpec2, childMeasureSpec, (n1) view4.getLayoutParams())) {
                    view4.measure(childMeasureSpec2, childMeasureSpec);
                }
            }
        }
        n0Var.f2542a = i19;
        if (this.mOrientation != 1) {
            if (o0Var.f2562f == -1) {
                int i26 = o0Var.f2558b;
                paddingLeft = i26 - i19;
                iD = i26;
            } else {
                int i27 = o0Var.f2558b;
                iD = i27 + i19;
                paddingLeft = i27;
            }
            paddingTop = 0;
            iD2 = 0;
        } else if (o0Var.f2562f == -1) {
            iD2 = o0Var.f2558b;
            paddingTop = iD2 - i19;
            paddingLeft = 0;
            iD = 0;
        } else {
            int i28 = o0Var.f2558b;
            paddingTop = i28;
            iD = 0;
            iD2 = i28 + i19;
            paddingLeft = 0;
        }
        for (int i29 = 0; i29 < i16; i29++) {
            View view5 = this.f2387d[i29];
            e0 e0Var3 = (e0) view5.getLayoutParams();
            if (this.mOrientation != 1) {
                paddingTop = getPaddingTop() + this.f2386c[e0Var3.f2445e];
                iD2 = this.mOrientationHelper.d(view5) + paddingTop;
            } else if (isLayoutRTL()) {
                iD = this.f2386c[this.f2385b - e0Var3.f2445e] + getPaddingLeft();
                paddingLeft = iD - this.mOrientationHelper.d(view5);
            } else {
                paddingLeft = getPaddingLeft() + this.f2386c[e0Var3.f2445e];
                iD = this.mOrientationHelper.d(view5) + paddingLeft;
            }
            int i30 = iD;
            int i31 = paddingLeft;
            int i32 = iD2;
            layoutDecoratedWithMargins(view5, i31, paddingTop, i30, i32);
            paddingLeft = i31;
            iD = i30;
            iD2 = i32;
            if (e0Var3.f2546a.isRemoved() || e0Var3.f2546a.isUpdated()) {
                n0Var.f2544c = true;
            }
            n0Var.f2545d = view5.hasFocusable() | n0Var.f2545d;
        }
        Arrays.fill(this.f2387d, (Object) null);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void onAnchorReady(u1 u1Var, c2 c2Var, m0 m0Var, int i11) {
        super.onAnchorReady(u1Var, c2Var, m0Var, i11);
        J();
        if (c2Var.b() > 0 && !c2Var.f2430g) {
            boolean z11 = i11 == 1;
            int iF = F(m0Var.f2535b, u1Var, c2Var);
            if (z11) {
                while (iF > 0) {
                    int i12 = m0Var.f2535b;
                    if (i12 <= 0) {
                        break;
                    }
                    int i13 = i12 - 1;
                    m0Var.f2535b = i13;
                    iF = F(i13, u1Var, c2Var);
                }
            } else {
                int iB = c2Var.b() - 1;
                int i14 = m0Var.f2535b;
                while (i14 < iB) {
                    int i15 = i14 + 1;
                    int iF2 = F(i15, u1Var, c2Var);
                    if (iF2 <= iF) {
                        break;
                    }
                    i14 = i15;
                    iF = iF2;
                }
                m0Var.f2535b = i14;
            }
        }
        C();
    }

    /* JADX WARN: Code duplicated, block: B:72:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:73:0x0111  */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00d3, code lost:
    
        if (r13 == (r2 > r15)) goto L47;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.m1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onFocusSearchFailed(android.view.View r24, int r25, androidx.recyclerview.widget.u1 r26, androidx.recyclerview.widget.c2 r27) {
        /*
            Method dump skipped, instruction units count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.onFocusSearchFailed(android.view.View, int, androidx.recyclerview.widget.u1, androidx.recyclerview.widget.c2):android.view.View");
    }

    @Override // androidx.recyclerview.widget.m1
    public final void onInitializeAccessibilityNodeInfo(u1 u1Var, c2 c2Var, a5.g gVar) {
        super.onInitializeAccessibilityNodeInfo(u1Var, c2Var, gVar);
        gVar.m(GridView.class.getName());
    }

    @Override // androidx.recyclerview.widget.m1
    public final void onInitializeAccessibilityNodeInfoForItem(u1 u1Var, c2 c2Var, View view, a5.g gVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof e0)) {
            super.onInitializeAccessibilityNodeInfoForItem(view, gVar);
            return;
        }
        e0 e0Var = (e0) layoutParams;
        int iE = E(e0Var.f2546a.getLayoutPosition(), u1Var, c2Var);
        if (this.mOrientation == 0) {
            gVar.o(a5.f.o(e0Var.f2445e, e0Var.f2446f, iE, 1, false, false));
        } else {
            gVar.o(a5.f.o(iE, 1, e0Var.f2445e, e0Var.f2446f, false, false));
        }
    }

    @Override // androidx.recyclerview.widget.m1
    public final void onItemsAdded(RecyclerView recyclerView, int i11, int i12) {
        this.f2390t.invalidateSpanIndexCache();
        this.f2390t.invalidateSpanGroupIndexCache();
    }

    @Override // androidx.recyclerview.widget.m1
    public final void onItemsChanged(RecyclerView recyclerView) {
        this.f2390t.invalidateSpanIndexCache();
        this.f2390t.invalidateSpanGroupIndexCache();
    }

    @Override // androidx.recyclerview.widget.m1
    public final void onItemsMoved(RecyclerView recyclerView, int i11, int i12, int i13) {
        this.f2390t.invalidateSpanIndexCache();
        this.f2390t.invalidateSpanGroupIndexCache();
    }

    @Override // androidx.recyclerview.widget.m1
    public final void onItemsRemoved(RecyclerView recyclerView, int i11, int i12) {
        this.f2390t.invalidateSpanIndexCache();
        this.f2390t.invalidateSpanGroupIndexCache();
    }

    @Override // androidx.recyclerview.widget.m1
    public final void onItemsUpdated(RecyclerView recyclerView, int i11, int i12, Object obj) {
        this.f2390t.invalidateSpanIndexCache();
        this.f2390t.invalidateSpanGroupIndexCache();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.m1
    public final void onLayoutChildren(u1 u1Var, c2 c2Var) {
        boolean z11 = c2Var.f2430g;
        SparseIntArray sparseIntArray = this.f2389f;
        SparseIntArray sparseIntArray2 = this.f2388e;
        if (z11) {
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                e0 e0Var = (e0) getChildAt(i11).getLayoutParams();
                int layoutPosition = e0Var.f2546a.getLayoutPosition();
                sparseIntArray2.put(layoutPosition, e0Var.f2446f);
                sparseIntArray.put(layoutPosition, e0Var.f2445e);
            }
        }
        super.onLayoutChildren(u1Var, c2Var);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.m1
    public final void onLayoutCompleted(c2 c2Var) {
        super.onLayoutCompleted(c2Var);
        this.f2384a = false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.m1
    public final int scrollHorizontallyBy(int i11, u1 u1Var, c2 c2Var) {
        J();
        C();
        return super.scrollHorizontallyBy(i11, u1Var, c2Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.m1
    public final int scrollVerticallyBy(int i11, u1 u1Var, c2 c2Var) {
        J();
        C();
        return super.scrollVerticallyBy(i11, u1Var, c2Var);
    }

    @Override // androidx.recyclerview.widget.m1
    public final void setMeasuredDimension(Rect rect, int i11, int i12) {
        int iChooseSize;
        int iChooseSize2;
        if (this.f2386c == null) {
            super.setMeasuredDimension(rect, i11, i12);
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (this.mOrientation == 1) {
            iChooseSize2 = m1.chooseSize(i12, rect.height() + paddingBottom, getMinimumHeight());
            int[] iArr = this.f2386c;
            iChooseSize = m1.chooseSize(i11, iArr[iArr.length - 1] + paddingRight, getMinimumWidth());
        } else {
            iChooseSize = m1.chooseSize(i11, rect.width() + paddingRight, getMinimumWidth());
            int[] iArr2 = this.f2386c;
            iChooseSize2 = m1.chooseSize(i12, iArr2[iArr2.length - 1] + paddingBottom, getMinimumHeight());
        }
        setMeasuredDimension(iChooseSize, iChooseSize2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.m1
    public final boolean supportsPredictiveItemAnimations() {
        return this.mPendingSavedState == null && !this.f2384a;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void setStackFromEnd(boolean z11) {
        if (z11) {
            throw new UnsupportedOperationException(kHfjNGauVgdF.PXwGho);
        }
        super.setStackFromEnd(false);
    }

    @Override // androidx.recyclerview.widget.m1
    public final n1 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            e0 e0Var = new e0((ViewGroup.MarginLayoutParams) layoutParams);
            e0Var.f2445e = -1;
            e0Var.f2446f = 0;
            return e0Var;
        }
        e0 e0Var2 = new e0(layoutParams);
        e0Var2.f2445e = -1;
        e0Var2.f2446f = 0;
        return e0Var2;
    }

    public GridLayoutManager(int i11, int i12) {
        super(1);
        this.f2384a = false;
        this.f2385b = -1;
        this.f2388e = new SparseIntArray();
        this.f2389f = new SparseIntArray();
        this.f2390t = new d0();
        this.H = new Rect();
        I(i11);
    }

    public GridLayoutManager(int i11) {
        super(1);
        this.f2384a = false;
        this.f2385b = -1;
        this.f2388e = new SparseIntArray();
        this.f2389f = new SparseIntArray();
        this.f2390t = new d0();
        this.H = new Rect();
        I(i11);
    }
}
