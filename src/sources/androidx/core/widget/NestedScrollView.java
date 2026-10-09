package androidx.core.widget;

import a5.b;
import a9.e;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.InputDevice;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.yalantis.ucrop.view.CropImageView;
import e5.g;
import e5.h;
import e5.j;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import ue.f;
import z4.c0;
import z4.d0;
import z4.i;
import z4.q;
import z4.r;
import z4.s0;
import z4.t;
import z4.t0;
import z4.z;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements t, q {

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final float f1423h0 = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final g f1424i0 = new g(0);

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final int[] f1425j0 = {R.attr.fillViewport};
    public int H;
    public boolean K;
    public boolean L;
    public View M;
    public boolean N;
    public VelocityTracker O;
    public boolean P;
    public boolean Q;
    public final int R;
    public final int S;
    public final int T;
    public int U;
    public final int[] V;
    public final int[] W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f1426a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public int f1427a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f1428b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public int f1429b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rect f1430c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public j f1431c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final OverScroller f1432d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final e f1433d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final EdgeEffect f1434e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final r f1435e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final EdgeEffect f1436f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public float f1437f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public final i f1438g0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public z f1439t;

    public NestedScrollView(Context context) {
        this(context, null);
    }

    private z getScrollFeedbackProvider() {
        if (this.f1439t == null) {
            this.f1439t = new z(this);
        }
        return this.f1439t;
    }

    public static boolean m(View view, NestedScrollView nestedScrollView) {
        if (view == nestedScrollView) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && m((View) parent, nestedScrollView);
    }

    public final boolean a(int i11) {
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View view = viewFindFocus;
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, view, i11);
        int maxScrollAmount = getMaxScrollAmount();
        if (viewFindNextFocus == null || !n(viewFindNextFocus, maxScrollAmount, getHeight())) {
            if (i11 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i11 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i11 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            t(maxScrollAmount, -1, null, 0, 1, true);
        } else {
            Rect rect = this.f1430c;
            viewFindNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(viewFindNextFocus, rect);
            t(b(rect), -1, null, 0, 1, true);
            viewFindNextFocus.requestFocus(i11);
        }
        if (view != null && view.isFocused() && !n(view, 0, getHeight())) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(OSSConstants.DEFAULT_STREAM_BUFFER_SIZE);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    public final int b(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i11 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i12 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i11 - verticalFadingEdgeLength : i11;
        int i13 = rect.bottom;
        if (i13 > i12 && rect.top > scrollY) {
            return Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i12, (childAt.getBottom() + layoutParams.bottomMargin) - i11);
        }
        if (rect.top >= scrollY || i13 >= i12) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i12 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    @Override // z4.t
    public final void c(View view, int i11, int i12, int i13, int i14, int i15, int[] iArr) {
        o(i14, i15, iArr);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0083  */
    /* JADX WARN: Code duplicated, block: B:23:0x0092  */
    /* JADX WARN: Code duplicated, block: B:24:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:26:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:30:0x00c5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:33:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:34:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:36:0x00de  */
    /* JADX WARN: Code duplicated, block: B:40:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:42:0x00fc  */
    @Override // android.view.View
    public final void computeScroll() {
        int iRound;
        int[] iArr;
        int i11;
        int scrollRange;
        int i12;
        int overScrollMode;
        if (this.f1432d.isFinished()) {
            return;
        }
        this.f1432d.computeScrollOffset();
        int currY = this.f1432d.getCurrY();
        int i13 = currY - this.f1429b0;
        int height = getHeight();
        EdgeEffect edgeEffect = this.f1434e;
        EdgeEffect edgeEffect2 = this.f1436f;
        if (i13 <= 0 || f.t(edgeEffect) == CropImageView.DEFAULT_ASPECT_RATIO) {
            if (i13 < 0 && f.t(edgeEffect2) != CropImageView.DEFAULT_ASPECT_RATIO) {
                float f5 = height;
                iRound = Math.round(f.z(edgeEffect2, (i13 * 4.0f) / f5, 0.5f) * (f5 / 4.0f));
                if (iRound != i13) {
                    edgeEffect2.finish();
                }
            }
            this.f1429b0 = currY;
            iArr = this.W;
            iArr[1] = 0;
            e(0, i13, iArr, null, 1);
            i11 = i13 - iArr[1];
            scrollRange = getScrollRange();
            if (Build.VERSION.SDK_INT >= 35) {
                h.a(this, Math.abs(this.f1432d.getCurrVelocity()));
            }
            if (i11 != 0) {
                int scrollY = getScrollY();
                q(i11, getScrollX(), scrollY, scrollRange);
                int scrollY2 = getScrollY() - scrollY;
                int i14 = i11 - scrollY2;
                iArr[1] = 0;
                i12 = 1;
                this.f1435e0.d(0, scrollY2, 0, i14, this.V, 1, iArr);
                i11 = i14 - iArr[1];
            } else {
                i12 = 1;
            }
            if (i11 != 0) {
                overScrollMode = getOverScrollMode();
                if (overScrollMode != 0 || (overScrollMode == i12 && scrollRange > 0)) {
                    if (i11 < 0) {
                        if (edgeEffect.isFinished()) {
                            edgeEffect.onAbsorb((int) this.f1432d.getCurrVelocity());
                        }
                    } else if (edgeEffect2.isFinished()) {
                        edgeEffect2.onAbsorb((int) this.f1432d.getCurrVelocity());
                    }
                }
                this.f1432d.abortAnimation();
                x(i12);
            }
            if (this.f1432d.isFinished()) {
                x(i12);
            } else {
                postInvalidateOnAnimation();
            }
        }
        iRound = Math.round(f.z(edgeEffect, ((-i13) * 4.0f) / height, 0.5f) * ((-height) / 4.0f));
        if (iRound != i13) {
            edgeEffect.finish();
        }
        i13 -= iRound;
        this.f1429b0 = currY;
        iArr = this.W;
        iArr[1] = 0;
        e(0, i13, iArr, null, 1);
        i11 = i13 - iArr[1];
        scrollRange = getScrollRange();
        if (Build.VERSION.SDK_INT >= 35) {
            h.a(this, Math.abs(this.f1432d.getCurrVelocity()));
        }
        if (i11 != 0) {
            int scrollY3 = getScrollY();
            q(i11, getScrollX(), scrollY3, scrollRange);
            int scrollY4 = getScrollY() - scrollY3;
            int i15 = i11 - scrollY4;
            iArr[1] = 0;
            i12 = 1;
            this.f1435e0.d(0, scrollY4, 0, i15, this.V, 1, iArr);
            i11 = i15 - iArr[1];
        } else {
            i12 = 1;
        }
        if (i11 != 0) {
            overScrollMode = getOverScrollMode();
            if (overScrollMode != 0) {
                if (i11 < 0) {
                    if (edgeEffect.isFinished()) {
                        edgeEffect.onAbsorb((int) this.f1432d.getCurrVelocity());
                    }
                } else if (edgeEffect2.isFinished()) {
                    edgeEffect2.onAbsorb((int) this.f1432d.getCurrVelocity());
                }
            } else if (i11 < 0) {
                if (edgeEffect.isFinished()) {
                    edgeEffect.onAbsorb((int) this.f1432d.getCurrVelocity());
                }
            } else if (edgeEffect2.isFinished()) {
                edgeEffect2.onAbsorb((int) this.f1432d.getCurrVelocity());
            }
            this.f1432d.abortAnimation();
            x(i12);
        }
        if (this.f1432d.isFinished()) {
            postInvalidateOnAnimation();
        } else {
            x(i12);
        }
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int iMax = Math.max(0, bottom - height);
        if (scrollY < 0) {
            return bottom - scrollY;
        }
        return scrollY > iMax ? (scrollY - iMax) + bottom : bottom;
    }

    @Override // z4.s
    public final void d(View view, int i11, int i12, int i13, int i14, int i15) {
        o(i14, i15, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || j(keyEvent);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f5, float f11, boolean z11) {
        return this.f1435e0.a(f5, f11, z11);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f5, float f11) {
        return this.f1435e0.b(f5, f11);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i11, int i12, int[] iArr, int[] iArr2) {
        return this.f1435e0.c(i11, i12, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i11, int i12, int i13, int i14, int[] iArr) {
        return this.f1435e0.d(i11, i12, i13, i14, iArr, 0, null);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int paddingLeft;
        super.draw(canvas);
        int scrollY = getScrollY();
        EdgeEffect edgeEffect = this.f1434e;
        int paddingLeft2 = 0;
        if (!edgeEffect.isFinished()) {
            int iSave = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int iMin = Math.min(0, scrollY);
            if (getClipToPadding()) {
                width -= getPaddingRight() + getPaddingLeft();
                paddingLeft = getPaddingLeft();
            } else {
                paddingLeft = 0;
            }
            if (getClipToPadding()) {
                height -= getPaddingBottom() + getPaddingTop();
                iMin += getPaddingTop();
            }
            canvas.translate(paddingLeft, iMin);
            edgeEffect.setSize(width, height);
            if (edgeEffect.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect2 = this.f1436f;
        if (edgeEffect2.isFinished()) {
            return;
        }
        int iSave2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int iMax = Math.max(getScrollRange(), scrollY) + height2;
        if (getClipToPadding()) {
            width2 -= getPaddingRight() + getPaddingLeft();
            paddingLeft2 = getPaddingLeft();
        }
        if (getClipToPadding()) {
            height2 -= getPaddingBottom() + getPaddingTop();
            iMax -= getPaddingBottom();
        }
        canvas.translate(paddingLeft2 - width2, iMax);
        canvas.rotate(180.0f, width2, CropImageView.DEFAULT_ASPECT_RATIO);
        edgeEffect2.setSize(width2, height2);
        if (edgeEffect2.draw(canvas)) {
            postInvalidateOnAnimation();
        }
        canvas.restoreToCount(iSave2);
    }

    public final boolean e(int i11, int i12, int[] iArr, int[] iArr2, int i13) {
        return this.f1435e0.c(i11, i12, iArr, null, i13);
    }

    @Override // z4.s
    public final boolean f(View view, View view2, int i11, int i12) {
        return (i11 & 2) != 0;
    }

    @Override // z4.s
    public final void g(View view, View view2, int i11, int i12) {
        e eVar = this.f1433d0;
        if (i12 == 1) {
            eVar.f479c = i11;
        } else {
            eVar.f478b = i11;
        }
        this.f1435e0.h(2, i12);
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return CropImageView.DEFAULT_ASPECT_RATIO;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        e eVar = this.f1433d0;
        return eVar.f479c | eVar.f478b;
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return CropImageView.DEFAULT_ASPECT_RATIO;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public float getVerticalScrollFactorCompat() {
        if (this.f1437f0 == CropImageView.DEFAULT_ASPECT_RATIO) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.f1437f0 = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f1437f0;
    }

    @Override // z4.s
    public final void h(View view, int i11) {
        e eVar = this.f1433d0;
        if (i11 == 1) {
            eVar.f479c = 0;
        } else {
            eVar.f478b = 0;
        }
        x(i11);
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.f1435e0.f(0);
    }

    @Override // z4.s
    public final void i(View view, int i11, int i12, int[] iArr, int i13) {
        e(i11, i12, iArr, null, i13);
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f1435e0.f58886d;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0098  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ab  */
    public final boolean j(KeyEvent keyEvent) {
        View viewFindFocus;
        View viewFindNextFocus;
        this.f1430c.setEmpty();
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                if (keyEvent.getAction() == 0) {
                    int keyCode = keyEvent.getKeyCode();
                    if (keyCode == 19) {
                        return keyEvent.isAltPressed() ? l(33) : a(33);
                    }
                    if (keyCode == 20) {
                        return keyEvent.isAltPressed() ? l(130) : a(130);
                    }
                    if (keyCode == 62) {
                        r(keyEvent.isShiftPressed() ? 33 : 130);
                        return false;
                    }
                    if (keyCode == 92) {
                        return l(33);
                    }
                    if (keyCode == 93) {
                        return l(130);
                    }
                    if (keyCode == 122) {
                        r(33);
                        return false;
                    }
                    if (keyCode == 123) {
                        r(130);
                        return false;
                    }
                }
            } else if (isFocused() && keyEvent.getKeyCode() != 4) {
                viewFindFocus = findFocus();
                if (viewFindFocus == this) {
                    viewFindFocus = null;
                }
                viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, 130);
                if (viewFindNextFocus == null && viewFindNextFocus != this && viewFindNextFocus.requestFocus(130)) {
                    return true;
                }
            }
        } else if (isFocused()) {
            viewFindFocus = findFocus();
            if (viewFindFocus == this) {
                viewFindFocus = null;
            }
            viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, 130);
            if (viewFindNextFocus == null) {
            }
        }
        return false;
    }

    public final void k(int i11) {
        if (getChildCount() > 0) {
            this.f1432d.fling(getScrollX(), getScrollY(), 0, i11, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            this.f1435e0.h(2, 1);
            this.f1429b0 = getScrollY();
            postInvalidateOnAnimation();
            if (Build.VERSION.SDK_INT >= 35) {
                h.a(this, Math.abs(this.f1432d.getCurrVelocity()));
            }
        }
    }

    public final boolean l(int i11) {
        int childCount;
        boolean z11 = i11 == 130;
        int height = getHeight();
        Rect rect = this.f1430c;
        rect.top = 0;
        rect.bottom = height;
        if (z11 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            rect.bottom = paddingBottom;
            rect.top = paddingBottom - height;
        }
        return s(i11, rect.top, rect.bottom);
    }

    @Override // android.view.ViewGroup
    public final void measureChild(View view, int i11, int i12) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i11, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i11, int i12, int i13, int i14) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i11, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i12, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public final boolean n(View view, int i11, int i12) {
        Rect rect = this.f1430c;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        return rect.bottom + i11 >= getScrollY() && rect.top - i11 <= getScrollY() + i12;
    }

    public final void o(int i11, int i12, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i11);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f1435e0.d(0, scrollY2, 0, i11 - scrollY2, null, i12, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.L = false;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:49:0x00df  */
    /* JADX WARN: Code duplicated, block: B:70:0x012a  */
    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f5;
        int i11;
        int width;
        int i12;
        int scaledMinimumFlingVelocity;
        int scaledMaximumFlingVelocity;
        boolean z11;
        NestedScrollView nestedScrollView;
        float yVelocity;
        NestedScrollView nestedScrollView2;
        float f11;
        long j11;
        float fSqrt;
        int i13;
        if (motionEvent.getAction() != 8 || this.N) {
            return false;
        }
        if ((motionEvent.getSource() & 2) == 2) {
            float axisValue = motionEvent.getAxisValue(9);
            width = (int) motionEvent.getX();
            i11 = 9;
            f5 = axisValue;
        } else if ((motionEvent.getSource() & 4194304) == 4194304) {
            float axisValue2 = motionEvent.getAxisValue(26);
            width = getWidth() / 2;
            f5 = axisValue2;
            i11 = 26;
        } else {
            f5 = 0.0f;
            i11 = 0;
            width = 0;
        }
        if (f5 == CropImageView.DEFAULT_ASPECT_RATIO) {
            return false;
        }
        t(-((int) (getVerticalScrollFactorCompat() * f5)), i11, motionEvent, width, 1, (motionEvent.getSource() & 8194) == 8194);
        if (i11 != 0) {
            i iVar = this.f1438g0;
            NestedScrollView nestedScrollView3 = (NestedScrollView) iVar.f58848b.f385b;
            int[] iArr = iVar.f58854h;
            int source = motionEvent.getSource();
            int deviceId = motionEvent.getDeviceId();
            int i14 = 1;
            if (iVar.f58852f == source && iVar.f58853g == deviceId && iVar.f58851e == i11) {
                z11 = false;
                i12 = 0;
            } else {
                Context context = iVar.f58847a;
                ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
                int deviceId2 = motionEvent.getDeviceId();
                i12 = 0;
                int source2 = motionEvent.getSource();
                int i15 = Build.VERSION.SDK_INT;
                if (i15 >= 34) {
                    Method method = t0.f58901a;
                    scaledMinimumFlingVelocity = b.h(viewConfiguration, deviceId2, i11, source2);
                } else {
                    Method method2 = t0.f58901a;
                    InputDevice device = InputDevice.getDevice(deviceId2);
                    if (device == null || device.getMotionRange(i11, source2) == null) {
                        scaledMinimumFlingVelocity = Integer.MAX_VALUE;
                    } else {
                        Resources resources = context.getResources();
                        int identifier = (source2 == 4194304 && i11 == 26) ? resources.getIdentifier("config_viewMinRotaryEncoderFlingVelocity", "dimen", "android") : -1;
                        Objects.requireNonNull(viewConfiguration);
                        if (identifier == -1) {
                            scaledMinimumFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
                        } else if (identifier == 0 || (scaledMinimumFlingVelocity = resources.getDimensionPixelSize(identifier)) < 0) {
                            scaledMinimumFlingVelocity = Integer.MAX_VALUE;
                        }
                    }
                }
                iArr[0] = scaledMinimumFlingVelocity;
                int deviceId3 = motionEvent.getDeviceId();
                int source3 = motionEvent.getSource();
                if (i15 >= 34) {
                    scaledMaximumFlingVelocity = b.g(viewConfiguration, deviceId3, i11, source3);
                } else {
                    InputDevice device2 = InputDevice.getDevice(deviceId3);
                    if (device2 == null || device2.getMotionRange(i11, source3) == null) {
                        scaledMaximumFlingVelocity = Integer.MIN_VALUE;
                    } else {
                        Resources resources2 = context.getResources();
                        int identifier2 = (source3 == 4194304 && i11 == 26) ? resources2.getIdentifier("config_viewMaxRotaryEncoderFlingVelocity", "dimen", "android") : -1;
                        Objects.requireNonNull(viewConfiguration);
                        if (identifier2 == -1) {
                            scaledMaximumFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
                        } else if (identifier2 == 0 || (scaledMaximumFlingVelocity = resources2.getDimensionPixelSize(identifier2)) < 0) {
                            scaledMaximumFlingVelocity = Integer.MIN_VALUE;
                        }
                    }
                }
                iArr[1] = scaledMaximumFlingVelocity;
                iVar.f58852f = source;
                iVar.f58853g = deviceId;
                iVar.f58851e = i11;
                z11 = true;
            }
            if (iArr[i12] == Integer.MAX_VALUE) {
                VelocityTracker velocityTracker = iVar.f58849c;
                if (velocityTracker == null) {
                    return true;
                }
                velocityTracker.recycle();
                iVar.f58849c = null;
                return true;
            }
            if (iVar.f58849c == null) {
                iVar.f58849c = VelocityTracker.obtain();
            }
            VelocityTracker velocityTracker2 = iVar.f58849c;
            Map map = c0.f58816a;
            velocityTracker2.addMovement(motionEvent);
            int i16 = 20;
            if (Build.VERSION.SDK_INT < 34 && motionEvent.getSource() == 4194304) {
                Map map2 = c0.f58816a;
                if (!map2.containsKey(velocityTracker2)) {
                    map2.put(velocityTracker2, new d0());
                }
                d0 d0Var = (d0) map2.get(velocityTracker2);
                long[] jArr = d0Var.f58818b;
                long eventTime = motionEvent.getEventTime();
                if (d0Var.f58820d != 0 && eventTime - jArr[d0Var.f58821e] > 40) {
                    d0Var.f58820d = i12;
                    d0Var.f58819c = CropImageView.DEFAULT_ASPECT_RATIO;
                }
                int i17 = (d0Var.f58821e + 1) % 20;
                d0Var.f58821e = i17;
                int i18 = d0Var.f58820d;
                if (i18 != 20) {
                    d0Var.f58820d = i18 + 1;
                }
                d0Var.f58817a[i17] = motionEvent.getAxisValue(26);
                jArr[d0Var.f58821e] = eventTime;
            }
            velocityTracker2.computeCurrentVelocity(1000, Float.MAX_VALUE);
            d0 d0Var2 = (d0) c0.f58816a.get(velocityTracker2);
            if (d0Var2 != null) {
                float[] fArr = d0Var2.f58817a;
                long[] jArr2 = d0Var2.f58818b;
                int i19 = d0Var2.f58820d;
                if (i19 < 2) {
                    nestedScrollView = nestedScrollView3;
                    i13 = 1000;
                    fSqrt = CropImageView.DEFAULT_ASPECT_RATIO;
                } else {
                    int i21 = d0Var2.f58821e;
                    int i22 = ((i21 + 20) - (i19 - 1)) % 20;
                    long j12 = jArr2[i21];
                    while (true) {
                        j11 = jArr2[i22];
                        if (j12 - j11 <= 100) {
                            break;
                        }
                        d0Var2.f58820d--;
                        i22 = (i22 + 1) % 20;
                    }
                    int i23 = d0Var2.f58820d;
                    if (i23 < 2) {
                        nestedScrollView = nestedScrollView3;
                        i13 = 1000;
                        fSqrt = CropImageView.DEFAULT_ASPECT_RATIO;
                    } else if (i23 == 2) {
                        int i24 = (i22 + 1) % 20;
                        long j13 = jArr2[i24];
                        if (j11 == j13) {
                            nestedScrollView = nestedScrollView3;
                            i13 = 1000;
                            fSqrt = CropImageView.DEFAULT_ASPECT_RATIO;
                        } else {
                            nestedScrollView = nestedScrollView3;
                            i13 = 1000;
                            fSqrt = fArr[i24] / (j13 - j11);
                        }
                    } else {
                        float f12 = CropImageView.DEFAULT_ASPECT_RATIO;
                        int i25 = 0;
                        int i26 = 0;
                        while (true) {
                            if (i25 >= d0Var2.f58820d - 1) {
                                break;
                            }
                            int i27 = i25 + i22;
                            long j14 = jArr2[i27 % 20];
                            int i28 = (i27 + 1) % i16;
                            if (jArr2[i28] != j14) {
                                i26++;
                                float fSqrt2 = (f12 < CropImageView.DEFAULT_ASPECT_RATIO ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(f12) * 2.0f));
                                float f13 = fArr[i28] / (jArr2[i28] - j14);
                                float fAbs = (Math.abs(f13) * (f13 - fSqrt2)) + f12;
                                if (i26 == i14) {
                                    fAbs *= 0.5f;
                                }
                                f12 = fAbs;
                            }
                            i25++;
                            nestedScrollView3 = nestedScrollView3;
                            i16 = 20;
                            i14 = 1;
                        }
                        nestedScrollView = nestedScrollView3;
                        fSqrt = ((float) Math.sqrt(Math.abs(f12) * 2.0f)) * (f12 < CropImageView.DEFAULT_ASPECT_RATIO ? -1.0f : 1.0f);
                        i13 = 1000;
                    }
                }
                float f14 = fSqrt * i13;
                d0Var2.f58819c = f14;
                if (f14 < (-Math.abs((float) r6))) {
                    d0Var2.f58819c = -Math.abs(Float.MAX_VALUE);
                } else if (d0Var2.f58819c > Math.abs((float) r6)) {
                    d0Var2.f58819c = Math.abs((float) r6);
                }
            } else {
                nestedScrollView = nestedScrollView3;
            }
            if (Build.VERSION.SDK_INT >= 34) {
                yVelocity = b.d(velocityTracker2, i11);
            } else if (i11 == 0) {
                yVelocity = velocityTracker2.getXVelocity();
            } else if (i11 == 1) {
                yVelocity = velocityTracker2.getYVelocity();
            } else {
                d0 d0Var3 = (d0) c0.f58816a.get(velocityTracker2);
                yVelocity = (d0Var3 == null || i11 != 26) ? CropImageView.DEFAULT_ASPECT_RATIO : d0Var3.f58819c;
            }
            float f15 = yVelocity * (-nestedScrollView.getVerticalScrollFactorCompat());
            float fSignum = Math.signum(f15);
            if (z11 || !(fSignum == Math.signum(iVar.f58850d) || fSignum == CropImageView.DEFAULT_ASPECT_RATIO)) {
                nestedScrollView2 = nestedScrollView;
                nestedScrollView2.f1432d.abortAnimation();
            } else {
                nestedScrollView2 = nestedScrollView;
            }
            if (Math.abs(f15) >= iArr[0]) {
                int i29 = iArr[1];
                float fMax = Math.max(-i29, Math.min(f15, i29));
                if (fMax == CropImageView.DEFAULT_ASPECT_RATIO) {
                    f11 = 0.0f;
                } else {
                    nestedScrollView2.f1432d.abortAnimation();
                    nestedScrollView2.k((int) fMax);
                    f11 = fMax;
                }
                iVar.f58850d = f11;
                return true;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x006b  */
    /* JADX WARN: Code duplicated, block: B:36:0x0073  */
    /* JADX WARN: Code duplicated, block: B:39:0x008f  */
    /* JADX WARN: Code duplicated, block: B:62:0x0101  */
    /* JADX WARN: Code duplicated, block: B:70:0x0117  */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        VelocityTracker velocityTracker2;
        int iFindPointerIndex;
        int action = motionEvent.getAction();
        boolean z11 = true;
        if (action == 2 && this.N) {
            return true;
        }
        int i11 = action & 255;
        if (i11 == 0) {
            int y10 = (int) motionEvent.getY();
            int x11 = (int) motionEvent.getX();
            if (getChildCount() > 0) {
                int scrollY = getScrollY();
                View childAt = getChildAt(0);
                if (y10 < childAt.getTop() - scrollY || y10 >= childAt.getBottom() - scrollY || x11 < childAt.getLeft() || x11 >= childAt.getRight()) {
                    if (!w(motionEvent) && this.f1432d.isFinished()) {
                        z11 = false;
                    }
                    this.N = z11;
                    velocityTracker = this.O;
                    if (velocityTracker != null) {
                        velocityTracker.recycle();
                        this.O = null;
                    }
                } else {
                    this.H = y10;
                    this.U = motionEvent.getPointerId(0);
                    VelocityTracker velocityTracker3 = this.O;
                    if (velocityTracker3 == null) {
                        this.O = VelocityTracker.obtain();
                    } else {
                        velocityTracker3.clear();
                    }
                    this.O.addMovement(motionEvent);
                    this.f1432d.computeScrollOffset();
                    if (!w(motionEvent) && this.f1432d.isFinished()) {
                        z11 = false;
                    }
                    this.N = z11;
                    this.f1435e0.h(2, 0);
                }
            } else {
                if (!w(motionEvent)) {
                    z11 = false;
                }
                this.N = z11;
                velocityTracker = this.O;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.O = null;
                }
            }
        } else if (i11 == 1) {
            this.N = false;
            this.U = -1;
            velocityTracker2 = this.O;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.O = null;
            }
            if (this.f1432d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            x(0);
        } else if (i11 == 2) {
            int i12 = this.U;
            if (i12 != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i12)) != -1) {
                int y11 = (int) motionEvent.getY(iFindPointerIndex);
                if (Math.abs(y11 - this.H) > this.R && (2 & getNestedScrollAxes()) == 0) {
                    this.N = true;
                    this.H = y11;
                    if (this.O == null) {
                        this.O = VelocityTracker.obtain();
                    }
                    this.O.addMovement(motionEvent);
                    this.f1427a0 = 0;
                    ViewParent parent = getParent();
                    if (parent != null) {
                        parent.requestDisallowInterceptTouchEvent(true);
                    }
                }
            }
        } else if (i11 == 3) {
            this.N = false;
            this.U = -1;
            velocityTracker2 = this.O;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.O = null;
            }
            if (this.f1432d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            x(0);
        } else if (i11 == 6) {
            p(motionEvent);
        }
        return this.N;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        int measuredHeight;
        super.onLayout(z11, i11, i12, i13, i14);
        int i15 = 0;
        this.K = false;
        View view = this.M;
        if (view != null && m(view, this)) {
            View view2 = this.M;
            Rect rect = this.f1430c;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int iB = b(rect);
            if (iB != 0) {
                scrollBy(0, iB);
            }
        }
        this.M = null;
        if (!this.L) {
            if (this.f1431c0 != null) {
                scrollTo(getScrollX(), this.f1431c0.f24855a);
                this.f1431c0 = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                measuredHeight = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                measuredHeight = 0;
            }
            int paddingTop = ((i14 - i12) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            if (paddingTop < measuredHeight && scrollY >= 0) {
                i15 = paddingTop + scrollY > measuredHeight ? measuredHeight - paddingTop : scrollY;
            }
            if (i15 != scrollY) {
                scrollTo(getScrollX(), i15);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.L = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        if (this.P && View.MeasureSpec.getMode(i12) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i11, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f5, float f11, boolean z11) {
        if (z11) {
            return false;
        }
        dispatchNestedFling(CropImageView.DEFAULT_ASPECT_RATIO, f11, true);
        k((int) f11);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f5, float f11) {
        return this.f1435e0.b(f5, f11);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i11, int i12, int[] iArr) {
        e(i11, i12, iArr, null, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i11, int i12, int i13, int i14) {
        o(i14, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i11) {
        g(view, view2, i11, 0);
    }

    @Override // android.view.View
    public final void onOverScrolled(int i11, int i12, boolean z11, boolean z12) {
        super.scrollTo(i11, i12);
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i11, Rect rect) {
        if (i11 == 2) {
            i11 = 130;
        } else if (i11 == 1) {
            i11 = 33;
        }
        View viewFindNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i11) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i11);
        if (viewFindNextFocus != null && n(viewFindNextFocus, 0, getHeight())) {
            return viewFindNextFocus.requestFocus(i11, rect);
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof j)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        j jVar = (j) parcelable;
        super.onRestoreInstanceState(jVar.getSuperState());
        this.f1431c0 = jVar;
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        j jVar = new j(super.onSaveInstanceState());
        jVar.f24855a = getScrollY();
        return jVar;
    }

    @Override // android.view.View
    public void onScrollChanged(int i11, int i12, int i13, int i14) {
        super.onScrollChanged(i11, i12, i13, i14);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i11, int i12, int i13, int i14) {
        super.onSizeChanged(i11, i12, i13, i14);
        View viewFindFocus = findFocus();
        if (viewFindFocus == null || this == viewFindFocus || !n(viewFindFocus, 0, i14)) {
            return;
        }
        Rect rect = this.f1430c;
        viewFindFocus.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(viewFindFocus, rect);
        int iB = b(rect);
        if (iB != 0) {
            if (this.Q) {
                v(0, iB, false);
            } else {
                scrollBy(0, iB);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i11) {
        return f(view, view2, i11, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        h(view, 0);
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0106  */
    /* JADX WARN: Code duplicated, block: B:56:0x011c  */
    /* JADX WARN: Code duplicated, block: B:59:0x0123  */
    /* JADX WARN: Code duplicated, block: B:60:0x0127  */
    /* JADX WARN: Code duplicated, block: B:63:0x012e  */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        float fZ;
        int iRound;
        int i11;
        ViewParent parent2;
        if (this.O == null) {
            this.O = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1427a0 = 0;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        float f5 = this.f1427a0;
        float f11 = CropImageView.DEFAULT_ASPECT_RATIO;
        motionEventObtain.offsetLocation(CropImageView.DEFAULT_ASPECT_RATIO, f5);
        r rVar = this.f1435e0;
        if (actionMasked != 0) {
            EdgeEffect edgeEffect = this.f1434e;
            EdgeEffect edgeEffect2 = this.f1436f;
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.O;
                velocityTracker.computeCurrentVelocity(1000, this.T);
                int yVelocity = (int) velocityTracker.getYVelocity(this.U);
                if (Math.abs(yVelocity) >= this.S) {
                    if (f.t(edgeEffect) != CropImageView.DEFAULT_ASPECT_RATIO) {
                        if (u(edgeEffect, yVelocity)) {
                            edgeEffect.onAbsorb(yVelocity);
                        } else {
                            k(-yVelocity);
                        }
                    } else if (f.t(edgeEffect2) != CropImageView.DEFAULT_ASPECT_RATIO) {
                        int i12 = -yVelocity;
                        if (u(edgeEffect2, i12)) {
                            edgeEffect2.onAbsorb(i12);
                        } else {
                            k(i12);
                        }
                    } else {
                        int i13 = -yVelocity;
                        float f12 = i13;
                        if (!rVar.b(CropImageView.DEFAULT_ASPECT_RATIO, f12)) {
                            dispatchNestedFling(CropImageView.DEFAULT_ASPECT_RATIO, f12, true);
                            k(i13);
                        }
                    }
                } else if (this.f1432d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.U = -1;
                this.N = false;
                VelocityTracker velocityTracker2 = this.O;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.O = null;
                }
                x(0);
                edgeEffect.onRelease();
                edgeEffect2.onRelease();
            } else if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.U);
                if (iFindPointerIndex != -1) {
                    int y10 = (int) motionEvent.getY(iFindPointerIndex);
                    int i14 = this.H - y10;
                    float x11 = motionEvent.getX(iFindPointerIndex) / getWidth();
                    float height = i14 / getHeight();
                    if (f.t(edgeEffect) != CropImageView.DEFAULT_ASPECT_RATIO) {
                        fZ = -f.z(edgeEffect, -height, x11);
                        if (f.t(edgeEffect) == CropImageView.DEFAULT_ASPECT_RATIO) {
                            edgeEffect.onRelease();
                        }
                    } else if (f.t(edgeEffect2) != CropImageView.DEFAULT_ASPECT_RATIO) {
                        fZ = f.z(edgeEffect2, height, 1.0f - x11);
                        if (f.t(edgeEffect2) == CropImageView.DEFAULT_ASPECT_RATIO) {
                            edgeEffect2.onRelease();
                        }
                    } else {
                        iRound = Math.round(f11 * getHeight());
                        if (iRound != 0) {
                            invalidate();
                        }
                        i11 = i14 - iRound;
                        if (!this.N && Math.abs(i11) > this.R) {
                            parent2 = getParent();
                            if (parent2 != null) {
                                parent2.requestDisallowInterceptTouchEvent(true);
                            }
                            this.N = true;
                            if (i11 > 0) {
                                i11 -= this.R;
                            } else {
                                i11 += this.R;
                            }
                        }
                        if (this.N) {
                            int iT = t(i11, 1, motionEvent, (int) motionEvent.getX(iFindPointerIndex), 0, false);
                            this.H = y10 - iT;
                            this.f1427a0 += iT;
                        }
                    }
                    f11 = fZ;
                    iRound = Math.round(f11 * getHeight());
                    if (iRound != 0) {
                        invalidate();
                    }
                    i11 = i14 - iRound;
                    if (!this.N) {
                        parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.N = true;
                        if (i11 > 0) {
                            i11 -= this.R;
                        } else {
                            i11 += this.R;
                        }
                    }
                    if (this.N) {
                        int iT2 = t(i11, 1, motionEvent, (int) motionEvent.getX(iFindPointerIndex), 0, false);
                        this.H = y10 - iT2;
                        this.f1427a0 += iT2;
                    }
                }
            } else if (actionMasked == 3) {
                if (this.N && getChildCount() > 0) {
                    if (this.f1432d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                        postInvalidateOnAnimation();
                    }
                }
                this.U = -1;
                this.N = false;
                VelocityTracker velocityTracker3 = this.O;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.O = null;
                }
                x(0);
                edgeEffect.onRelease();
                edgeEffect2.onRelease();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.H = (int) motionEvent.getY(actionIndex);
                this.U = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                p(motionEvent);
                this.H = (int) motionEvent.getY(motionEvent.findPointerIndex(this.U));
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            if (this.N && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f1432d.isFinished()) {
                this.f1432d.abortAnimation();
                x(1);
            }
            int y11 = (int) motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            this.H = y11;
            this.U = pointerId;
            rVar.h(2, 0);
        }
        VelocityTracker velocityTracker4 = this.O;
        if (velocityTracker4 != null) {
            velocityTracker4.addMovement(motionEventObtain);
        }
        motionEventObtain.recycle();
        return true;
    }

    public final void p(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.U) {
            int i11 = actionIndex == 0 ? 1 : 0;
            this.H = (int) motionEvent.getY(i11);
            this.U = motionEvent.getPointerId(i11);
            VelocityTracker velocityTracker = this.O;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public final boolean q(int i11, int i12, int i13, int i14) {
        int i15;
        boolean z11;
        int i16;
        boolean z12;
        getOverScrollMode();
        super.computeHorizontalScrollRange();
        super.computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        super.computeVerticalScrollExtent();
        int i17 = i13 + i11;
        if (i12 <= 0 && i12 >= 0) {
            i15 = i12;
            z11 = false;
        } else {
            i15 = 0;
            z11 = true;
        }
        if (i17 <= i14) {
            if (i17 < 0) {
                i16 = 0;
            } else {
                i16 = i17;
                z12 = false;
            }
            if (z12 && !this.f1435e0.f(1)) {
                this.f1432d.springBack(i15, i16, 0, 0, 0, getScrollRange());
            }
            super.scrollTo(i15, i16);
            return !z11 || z12;
        }
        i16 = i14;
        z12 = true;
        if (z12) {
            this.f1432d.springBack(i15, i16, 0, 0, 0, getScrollRange());
        }
        super.scrollTo(i15, i16);
        if (z11) {
        }
    }

    public final void r(int i11) {
        boolean z11 = i11 == 130;
        int height = getHeight();
        Rect rect = this.f1430c;
        if (z11) {
            rect.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
                if (rect.top + height > paddingBottom) {
                    rect.top = paddingBottom - height;
                }
            }
        } else {
            int scrollY = getScrollY() - height;
            rect.top = scrollY;
            if (scrollY < 0) {
                rect.top = 0;
            }
        }
        int i12 = rect.top;
        int i13 = height + i12;
        rect.bottom = i13;
        s(i11, i12, i13);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (this.K) {
            this.M = view2;
        } else {
            Rect rect = this.f1430c;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int iB = b(rect);
            if (iB != 0) {
                scrollBy(0, iB);
            }
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z11) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int iB = b(rect);
        boolean z12 = iB != 0;
        if (z12) {
            if (z11) {
                scrollBy(0, iB);
                return z12;
            }
            v(0, iB, false);
        }
        return z12;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z11) {
        VelocityTracker velocityTracker;
        if (z11 && (velocityTracker = this.O) != null) {
            velocityTracker.recycle();
            this.O = null;
        }
        super.requestDisallowInterceptTouchEvent(z11);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.K = true;
        super.requestLayout();
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0068  */
    public final boolean s(int i11, int i12, int i13) {
        boolean z11;
        int height = getHeight();
        int scrollY = getScrollY();
        int i14 = height + scrollY;
        boolean z12 = i11 == 33;
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z13 = false;
        for (int i15 = 0; i15 < size; i15++) {
            View view2 = focusables.get(i15);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i12 < bottom && top < i13) {
                boolean z14 = i12 < top && bottom < i13;
                if (view == null) {
                    view = view2;
                    z13 = z14;
                } else {
                    boolean z15 = (z12 && top < view.getTop()) || (!z12 && bottom > view.getBottom());
                    if (z13) {
                        if (z14 && z15) {
                            view = view2;
                        }
                    } else if (z14) {
                        view = view2;
                        z13 = true;
                    } else if (z15) {
                        view = view2;
                    }
                }
            }
        }
        View view3 = view == null ? this : view;
        if (i12 < scrollY || i13 > i14) {
            t(z12 ? i12 - scrollY : i13 - i14, -1, null, 0, 1, true);
            z11 = true;
        } else {
            z11 = false;
        }
        if (view3 != findFocus()) {
            view3.requestFocus(i11);
        }
        return z11;
    }

    @Override // android.view.View
    public final void scrollTo(int i11, int i12) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (width >= width2 || i11 < 0) {
                i11 = 0;
            } else if (width + i11 > width2) {
                i11 = width2 - width;
            }
            if (height >= height2 || i12 < 0) {
                i12 = 0;
            } else if (height + i12 > height2) {
                i12 = height2 - height;
            }
            if (i11 == getScrollX() && i12 == getScrollY()) {
                return;
            }
            super.scrollTo(i11, i12);
        }
    }

    public void setFillViewport(boolean z11) {
        if (z11 != this.P) {
            this.P = z11;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z11) {
        this.f1435e0.g(z11);
    }

    public void setSmoothScrollingEnabled(boolean z11) {
        this.Q = z11;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i11) {
        return this.f1435e0.h(i11, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        x(0);
    }

    /* JADX WARN: Code duplicated, block: B:52:0x0118  */
    /* JADX WARN: Code duplicated, block: B:59:0x0129  */
    public final int t(int i11, int i12, MotionEvent motionEvent, int i13, int i14, boolean z11) {
        int i15;
        int i16;
        boolean z12;
        boolean z13;
        VelocityTracker velocityTracker;
        r rVar = this.f1435e0;
        if (i14 == 1) {
            rVar.h(2, i14);
        }
        boolean zC = this.f1435e0.c(0, i11, this.W, this.V, i14);
        int[] iArr = this.V;
        int[] iArr2 = this.W;
        if (zC) {
            i15 = i11 - iArr2[1];
            i16 = iArr[1];
        } else {
            i15 = i11;
            i16 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        int overScrollMode = getOverScrollMode();
        boolean z14 = (overScrollMode == 0 || (overScrollMode == 1 && getScrollRange() > 0)) && !z11;
        boolean z15 = q(i15, 0, scrollY, scrollRange) && !rVar.f(i14);
        int scrollY2 = getScrollY() - scrollY;
        if (motionEvent != null && scrollY2 != 0) {
            getScrollFeedbackProvider().f58921a.onScrollProgress(motionEvent.getDeviceId(), motionEvent.getSource(), i12, scrollY2);
        }
        iArr2[1] = 0;
        this.f1435e0.d(0, scrollY2, 0, i15 - scrollY2, this.V, i14, iArr2);
        int i17 = i16 + iArr[1];
        int i18 = i15 - iArr2[1];
        int i19 = scrollY + i18;
        EdgeEffect edgeEffect = this.f1436f;
        EdgeEffect edgeEffect2 = this.f1434e;
        if (i19 >= 0) {
            if (i19 > scrollRange && z14) {
                f.z(edgeEffect, i18 / getHeight(), 1.0f - (i13 / getWidth()));
                if (motionEvent != null) {
                    z12 = false;
                    getScrollFeedbackProvider().f58921a.onScrollLimit(motionEvent.getDeviceId(), motionEvent.getSource(), i12, false);
                } else {
                    z12 = false;
                }
                if (!edgeEffect2.isFinished()) {
                    edgeEffect2.onRelease();
                }
            }
            if (edgeEffect2.isFinished() || !edgeEffect.isFinished()) {
                postInvalidateOnAnimation();
                z13 = z12;
            } else {
                z13 = z15;
            }
            if (z13 && i14 == 0 && (velocityTracker = this.O) != null) {
                velocityTracker.clear();
            }
            if (i14 == 1) {
                x(i14);
                edgeEffect2.onRelease();
                edgeEffect.onRelease();
            }
            return i17;
        }
        if (z14) {
            f.z(edgeEffect2, (-i18) / getHeight(), i13 / getWidth());
            if (motionEvent != null) {
                getScrollFeedbackProvider().f58921a.onScrollLimit(motionEvent.getDeviceId(), motionEvent.getSource(), i12, true);
            }
            if (!edgeEffect.isFinished()) {
                edgeEffect.onRelease();
            }
        }
        z12 = false;
        if (edgeEffect2.isFinished()) {
            postInvalidateOnAnimation();
            z13 = z12;
        } else {
            postInvalidateOnAnimation();
            z13 = z12;
        }
        if (z13) {
            velocityTracker.clear();
        }
        if (i14 == 1) {
            x(i14);
            edgeEffect2.onRelease();
            edgeEffect.onRelease();
        }
        return i17;
    }

    public final boolean u(EdgeEffect edgeEffect, int i11) {
        if (i11 > 0) {
            return true;
        }
        float fT = f.t(edgeEffect) * getHeight();
        float fAbs = Math.abs(-i11) * 0.35f;
        float f5 = this.f1426a * 0.015f;
        double dLog = Math.log(fAbs / f5);
        double d5 = f1423h0;
        return ((float) (Math.exp((d5 / (d5 - 1.0d)) * dLog) * ((double) f5))) < fT;
    }

    public final void v(int i11, int i12, boolean z11) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f1428b > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int iMax = Math.max(0, Math.min(i12 + scrollY, Math.max(0, height - height2))) - scrollY;
            this.f1432d.startScroll(getScrollX(), scrollY, 0, iMax, 250);
            if (z11) {
                this.f1435e0.h(2, 1);
            } else {
                x(1);
            }
            this.f1429b0 = getScrollY();
            postInvalidateOnAnimation();
        } else {
            if (!this.f1432d.isFinished()) {
                this.f1432d.abortAnimation();
                x(1);
            }
            scrollBy(i11, i12);
        }
        this.f1428b = AnimationUtils.currentAnimationTimeMillis();
    }

    public final boolean w(MotionEvent motionEvent) {
        boolean z11;
        EdgeEffect edgeEffect = this.f1434e;
        if (f.t(edgeEffect) != CropImageView.DEFAULT_ASPECT_RATIO) {
            f.z(edgeEffect, CropImageView.DEFAULT_ASPECT_RATIO, motionEvent.getX() / getWidth());
            z11 = true;
        } else {
            z11 = false;
        }
        EdgeEffect edgeEffect2 = this.f1436f;
        if (f.t(edgeEffect2) == CropImageView.DEFAULT_ASPECT_RATIO) {
            return z11;
        }
        f.z(edgeEffect2, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    public final void x(int i11) {
        this.f1435e0.i(i11);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.lingodeer.R.attr.nestedScrollViewStyle);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i11) {
        EdgeEffect edgeEffect;
        EdgeEffect edgeEffect2;
        super(context, attributeSet, i11);
        this.f1430c = new Rect();
        this.K = true;
        this.L = false;
        this.M = null;
        this.N = false;
        this.Q = true;
        this.U = -1;
        this.V = new int[2];
        this.W = new int[2];
        this.f1438g0 = new i(getContext(), new a5.j(this, 10));
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 31) {
            edgeEffect = e5.e.a(context, attributeSet);
        } else {
            edgeEffect = new EdgeEffect(context);
        }
        this.f1434e = edgeEffect;
        if (i12 >= 31) {
            edgeEffect2 = e5.e.a(context, attributeSet);
        } else {
            edgeEffect2 = new EdgeEffect(context);
        }
        this.f1436f = edgeEffect2;
        this.f1426a = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.f1432d = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.R = viewConfiguration.getScaledTouchSlop();
        this.S = viewConfiguration.getScaledMinimumFlingVelocity();
        this.T = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f1425j0, i11, 0);
        setFillViewport(typedArrayObtainStyledAttributes.getBoolean(0, false));
        typedArrayObtainStyledAttributes.recycle();
        this.f1433d0 = new e(7);
        this.f1435e0 = new r(this);
        setNestedScrollingEnabled(true);
        s0.q(this, f1424i0);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i11) {
        if (getChildCount() <= 0) {
            super.addView(view, i11);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i11, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i11, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void setOnScrollChangeListener(e5.i iVar) {
    }
}
