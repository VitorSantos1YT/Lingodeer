package androidx.drawerlayout.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import com.yalantis.ucrop.view.CropImageView;
import e5.g;
import ep.a;
import java.util.ArrayList;
import java.util.WeakHashMap;
import l5.e;
import o20.w;
import r4.d;
import t5.b;
import t5.c;
import t5.f;
import z4.j0;
import z4.s0;
import z4.v1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class DrawerLayout extends ViewGroup {

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final int[] f1582i0 = {R.attr.colorPrimaryDark};

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final int[] f1583j0 = {R.attr.layout_gravity};

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final boolean f1584k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final boolean f1585l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final boolean f1586m0;
    public final e H;
    public final f K;
    public final f L;
    public int M;
    public boolean N;
    public boolean O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public boolean T;
    public b U;
    public ArrayList V;
    public float W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f1587a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public float f1588a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f1589b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public Drawable f1590b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f1591c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public WindowInsets f1592c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1593d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public boolean f1594d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f1595e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final ArrayList f1596e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Paint f1597f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public Rect f1598f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public Matrix f1599g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final w f1600h0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e f1601t;

    static {
        int i11 = Build.VERSION.SDK_INT;
        f1584k0 = true;
        f1585l0 = true;
        f1586m0 = i11 >= 29;
    }

    public DrawerLayout(Context context) {
        this(context, null);
    }

    public static boolean h(View view) {
        WeakHashMap weakHashMap = s0.f58893a;
        return (view.getImportantForAccessibility() == 4 || view.getImportantForAccessibility() == 2) ? false : true;
    }

    public static boolean i(View view) {
        return ((c) view.getLayoutParams()).f52036a == 0;
    }

    public static boolean j(View view) {
        if (k(view)) {
            return (((c) view.getLayoutParams()).f52039d & 1) == 1;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public static boolean k(View view) {
        int i11 = ((c) view.getLayoutParams()).f52036a;
        WeakHashMap weakHashMap = s0.f58893a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i11, view.getLayoutDirection());
        return ((absoluteGravity & 3) == 0 && (absoluteGravity & 5) == 0) ? false : true;
    }

    public final boolean a(View view, int i11) {
        return (g(view) & i11) == i11;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i11, int i12) {
        ArrayList arrayList2;
        if (getDescendantFocusability() == 393216) {
            return;
        }
        int childCount = getChildCount();
        int i13 = 0;
        boolean z11 = false;
        while (true) {
            arrayList2 = this.f1596e0;
            if (i13 >= childCount) {
                break;
            }
            View childAt = getChildAt(i13);
            if (!k(childAt)) {
                arrayList2.add(childAt);
            } else if (j(childAt)) {
                childAt.addFocusables(arrayList, i11, i12);
                z11 = true;
            }
            i13++;
        }
        if (!z11) {
            int size = arrayList2.size();
            for (int i14 = 0; i14 < size; i14++) {
                View view = (View) arrayList2.get(i14);
                if (view.getVisibility() == 0) {
                    view.addFocusables(arrayList, i11, i12);
                }
            }
        }
        arrayList2.clear();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i11, ViewGroup.LayoutParams layoutParams) {
        View childAt;
        super.addView(view, i11, layoutParams);
        int childCount = getChildCount();
        int i12 = 0;
        while (true) {
            if (i12 >= childCount) {
                childAt = null;
                break;
            }
            childAt = getChildAt(i12);
            if ((((c) childAt.getLayoutParams()).f52039d & 1) == 1) {
                break;
            } else {
                i12++;
            }
        }
        if (childAt != null || k(view)) {
            WeakHashMap weakHashMap = s0.f58893a;
            view.setImportantForAccessibility(4);
        } else {
            WeakHashMap weakHashMap2 = s0.f58893a;
            view.setImportantForAccessibility(1);
        }
        if (f1584k0) {
            return;
        }
        s0.q(view, this.f1587a);
    }

    public final void b(View view, boolean z11) {
        if (!k(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        c cVar = (c) view.getLayoutParams();
        if (this.O) {
            cVar.f52037b = CropImageView.DEFAULT_ASPECT_RATIO;
            cVar.f52039d = 0;
        } else if (z11) {
            cVar.f52039d |= 4;
            if (a(view, 3)) {
                this.f1601t.t(view, -view.getWidth(), view.getTop());
            } else {
                this.H.t(view, getWidth(), view.getTop());
            }
        } else {
            float f5 = ((c) view.getLayoutParams()).f52037b;
            float width = view.getWidth();
            int i11 = ((int) (width * CropImageView.DEFAULT_ASPECT_RATIO)) - ((int) (f5 * width));
            if (!a(view, 3)) {
                i11 = -i11;
            }
            view.offsetLeftAndRight(i11);
            n(view, CropImageView.DEFAULT_ASPECT_RATIO);
            q(view, 0);
            view.setVisibility(4);
        }
        invalidate();
    }

    public final void c(boolean z11) {
        int childCount = getChildCount();
        boolean zT = false;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            c cVar = (c) childAt.getLayoutParams();
            if (k(childAt) && (!z11 || cVar.f52038c)) {
                zT |= a(childAt, 3) ? this.f1601t.t(childAt, -childAt.getWidth(), childAt.getTop()) : this.H.t(childAt, getWidth(), childAt.getTop());
                cVar.f52038c = false;
            }
        }
        f fVar = this.K;
        fVar.f52048d.removeCallbacks(fVar.f52047c);
        f fVar2 = this.L;
        fVar2.f52048d.removeCallbacks(fVar2.f52047c);
        if (zT) {
            invalidate();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof c) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public final void computeScroll() {
        int childCount = getChildCount();
        float fMax = CropImageView.DEFAULT_ASPECT_RATIO;
        for (int i11 = 0; i11 < childCount; i11++) {
            fMax = Math.max(fMax, ((c) getChildAt(i11).getLayoutParams()).f52037b);
        }
        this.f1595e = fMax;
        boolean zH = this.f1601t.h();
        boolean zH2 = this.H.h();
        if (zH || zH2) {
            WeakHashMap weakHashMap = s0.f58893a;
            postInvalidateOnAnimation();
        }
    }

    public final View d(int i11) {
        WeakHashMap weakHashMap = s0.f58893a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i11, getLayoutDirection()) & 7;
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if ((g(childAt) & 7) == absoluteGravity) {
                return childAt;
            }
        }
        return null;
    }

    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        boolean zDispatchGenericMotionEvent;
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.f1595e <= CropImageView.DEFAULT_ASPECT_RATIO) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int childCount = getChildCount();
        if (childCount == 0) {
            return false;
        }
        float x11 = motionEvent.getX();
        float y10 = motionEvent.getY();
        for (int i11 = childCount - 1; i11 >= 0; i11--) {
            View childAt = getChildAt(i11);
            if (this.f1598f0 == null) {
                this.f1598f0 = new Rect();
            }
            childAt.getHitRect(this.f1598f0);
            if (this.f1598f0.contains((int) x11, (int) y10) && !i(childAt)) {
                if (childAt.getMatrix().isIdentity()) {
                    float scrollX = getScrollX() - childAt.getLeft();
                    float scrollY = getScrollY() - childAt.getTop();
                    motionEvent.offsetLocation(scrollX, scrollY);
                    zDispatchGenericMotionEvent = childAt.dispatchGenericMotionEvent(motionEvent);
                    motionEvent.offsetLocation(-scrollX, -scrollY);
                } else {
                    float scrollX2 = getScrollX() - childAt.getLeft();
                    float scrollY2 = getScrollY() - childAt.getTop();
                    MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                    motionEventObtain.offsetLocation(scrollX2, scrollY2);
                    Matrix matrix = childAt.getMatrix();
                    if (!matrix.isIdentity()) {
                        if (this.f1599g0 == null) {
                            this.f1599g0 = new Matrix();
                        }
                        matrix.invert(this.f1599g0);
                        motionEventObtain.transform(this.f1599g0);
                    }
                    zDispatchGenericMotionEvent = childAt.dispatchGenericMotionEvent(motionEventObtain);
                    motionEventObtain.recycle();
                }
                if (zDispatchGenericMotionEvent) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j11) {
        Drawable background;
        int height = getHeight();
        boolean zI = i(view);
        int width = getWidth();
        int iSave = canvas.save();
        int i11 = 0;
        if (zI) {
            int childCount = getChildCount();
            int i12 = 0;
            for (int i13 = 0; i13 < childCount; i13++) {
                View childAt = getChildAt(i13);
                if (childAt != view && childAt.getVisibility() == 0 && (background = childAt.getBackground()) != null && background.getOpacity() == -1 && k(childAt) && childAt.getHeight() >= height) {
                    if (a(childAt, 3)) {
                        int right = childAt.getRight();
                        if (right > i12) {
                            i12 = right;
                        }
                    } else {
                        int left = childAt.getLeft();
                        if (left < width) {
                            width = left;
                        }
                    }
                }
            }
            canvas.clipRect(i12, 0, width, getHeight());
            i11 = i12;
        }
        boolean zDrawChild = super.drawChild(canvas, view, j11);
        canvas.restoreToCount(iSave);
        float f5 = this.f1595e;
        if (f5 > CropImageView.DEFAULT_ASPECT_RATIO && zI) {
            int i14 = this.f1593d;
            Paint paint = this.f1597f;
            paint.setColor((((int) ((((-16777216) & i14) >>> 24) * f5)) << 24) | (i14 & 16777215));
            canvas.drawRect(i11, CropImageView.DEFAULT_ASPECT_RATIO, width, getHeight(), paint);
        }
        return zDrawChild;
    }

    public final View e() {
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (k(childAt)) {
                if (!k(childAt)) {
                    throw new IllegalArgumentException("View " + childAt + " is not a drawer");
                }
                if (((c) childAt.getLayoutParams()).f52037b > CropImageView.DEFAULT_ASPECT_RATIO) {
                    return childAt;
                }
            }
        }
        return null;
    }

    public final int f(View view) {
        if (!k(view)) {
            throw new IllegalArgumentException("View " + view + " is not a drawer");
        }
        int i11 = ((c) view.getLayoutParams()).f52036a;
        WeakHashMap weakHashMap = s0.f58893a;
        int layoutDirection = getLayoutDirection();
        if (i11 == 3) {
            int i12 = this.P;
            if (i12 != 3) {
                return i12;
            }
            int i13 = layoutDirection == 0 ? this.R : this.S;
            if (i13 != 3) {
                return i13;
            }
            return 0;
        }
        if (i11 == 5) {
            int i14 = this.Q;
            if (i14 != 3) {
                return i14;
            }
            int i15 = layoutDirection == 0 ? this.S : this.R;
            if (i15 != 3) {
                return i15;
            }
            return 0;
        }
        if (i11 == 8388611) {
            int i16 = this.R;
            if (i16 != 3) {
                return i16;
            }
            int i17 = layoutDirection == 0 ? this.P : this.Q;
            if (i17 != 3) {
                return i17;
            }
            return 0;
        }
        if (i11 != 8388613) {
            return 0;
        }
        int i18 = this.S;
        if (i18 != 3) {
            return i18;
        }
        int i19 = layoutDirection == 0 ? this.Q : this.P;
        if (i19 != 3) {
            return i19;
        }
        return 0;
    }

    public final int g(View view) {
        int i11 = ((c) view.getLayoutParams()).f52036a;
        WeakHashMap weakHashMap = s0.f58893a;
        return Gravity.getAbsoluteGravity(i11, getLayoutDirection());
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        c cVar = new c(-1, -1);
        cVar.f52036a = 0;
        return cVar;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof c) {
            c cVar = (c) layoutParams;
            c cVar2 = new c(cVar);
            cVar2.f52036a = 0;
            cVar2.f52036a = cVar.f52036a;
            return cVar2;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            c cVar3 = new c((ViewGroup.MarginLayoutParams) layoutParams);
            cVar3.f52036a = 0;
            return cVar3;
        }
        c cVar4 = new c(layoutParams);
        cVar4.f52036a = 0;
        return cVar4;
    }

    public float getDrawerElevation() {
        return f1585l0 ? this.f1589b : CropImageView.DEFAULT_ASPECT_RATIO;
    }

    public Drawable getStatusBarBackgroundDrawable() {
        return this.f1590b0;
    }

    public final void l(View view) {
        if (!k(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        c cVar = (c) view.getLayoutParams();
        if (this.O) {
            cVar.f52037b = 1.0f;
            cVar.f52039d = 1;
            p(view, true);
            o(view);
        } else {
            cVar.f52039d |= 2;
            if (a(view, 3)) {
                this.f1601t.t(view, 0, view.getTop());
            } else {
                this.H.t(view, getWidth() - view.getWidth(), view.getTop());
            }
        }
        invalidate();
    }

    public final void m(int i11, int i12) {
        View viewD;
        WeakHashMap weakHashMap = s0.f58893a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i12, getLayoutDirection());
        if (i12 == 3) {
            this.P = i11;
        } else if (i12 == 5) {
            this.Q = i11;
        } else if (i12 == 8388611) {
            this.R = i11;
        } else if (i12 == 8388613) {
            this.S = i11;
        }
        if (i11 != 0) {
            (absoluteGravity == 3 ? this.f1601t : this.H).b();
        }
        if (i11 != 1) {
            if (i11 == 2 && (viewD = d(absoluteGravity)) != null) {
                l(viewD);
                return;
            }
            return;
        }
        View viewD2 = d(absoluteGravity);
        if (viewD2 != null) {
            b(viewD2, true);
        }
    }

    public final void n(View view, float f5) {
        c cVar = (c) view.getLayoutParams();
        if (f5 == cVar.f52037b) {
            return;
        }
        cVar.f52037b = f5;
        ArrayList arrayList = this.V;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((b) this.V.get(size)).getClass();
            }
        }
    }

    public final void o(View view) {
        a5.c cVar = a5.c.f367n;
        s0.n(view, cVar.a());
        s0.j(view, 0);
        if (!j(view) || f(view) == 2) {
            return;
        }
        s0.o(view, cVar, null, this.f1600h0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.O = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.O = true;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f1594d0 || this.f1590b0 == null) {
            return;
        }
        WindowInsets windowInsets = this.f1592c0;
        int systemWindowInsetTop = windowInsets != null ? windowInsets.getSystemWindowInsetTop() : 0;
        if (systemWindowInsetTop > 0) {
            this.f1590b0.setBounds(0, 0, getWidth(), systemWindowInsetTop);
            this.f1590b0.draw(canvas);
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x005e  */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z11;
        View viewI;
        int actionMasked = motionEvent.getActionMasked();
        e eVar = this.f1601t;
        boolean zS = eVar.s(motionEvent) | this.H.s(motionEvent);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                c(true);
                this.T = false;
            } else if (actionMasked == 2) {
                int length = eVar.f39751d.length;
                for (int i11 = 0; i11 < length; i11++) {
                    if ((eVar.f39758k & (1 << i11)) != 0) {
                        float f5 = eVar.f39753f[i11] - eVar.f39751d[i11];
                        float f11 = eVar.f39754g[i11] - eVar.f39752e[i11];
                        float f12 = (f11 * f11) + (f5 * f5);
                        int i12 = eVar.f39749b;
                        if (f12 > i12 * i12) {
                            f fVar = this.K;
                            fVar.f52048d.removeCallbacks(fVar.f52047c);
                            f fVar2 = this.L;
                            fVar2.f52048d.removeCallbacks(fVar2.f52047c);
                            break;
                        }
                    }
                }
            } else if (actionMasked == 3) {
                c(true);
                this.T = false;
            }
            z11 = false;
        } else {
            float x11 = motionEvent.getX();
            float y10 = motionEvent.getY();
            this.W = x11;
            this.f1588a0 = y10;
            z11 = this.f1595e > CropImageView.DEFAULT_ASPECT_RATIO && (viewI = eVar.i((int) x11, (int) y10)) != null && i(viewI);
            this.T = false;
        }
        if (!zS && !z11) {
            int childCount = getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                if (!((c) getChildAt(i13).getLayoutParams()).f52038c) {
                }
            }
            if (!this.T) {
                return false;
            }
        }
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i11, KeyEvent keyEvent) {
        if (i11 != 4 || e() == null) {
            return super.onKeyDown(i11, keyEvent);
        }
        keyEvent.startTracking();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (i11 != 4) {
            return super.onKeyUp(i11, keyEvent);
        }
        View viewE = e();
        if (viewE != null && f(viewE) == 0) {
            c(false);
        }
        return viewE != null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        WindowInsets rootWindowInsets;
        float f5;
        int i15;
        boolean z12 = true;
        this.N = true;
        int i16 = i13 - i11;
        int childCount = getChildCount();
        int i17 = 0;
        while (i17 < childCount) {
            View childAt = getChildAt(i17);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                if (i(childAt)) {
                    int i18 = ((ViewGroup.MarginLayoutParams) cVar).leftMargin;
                    childAt.layout(i18, ((ViewGroup.MarginLayoutParams) cVar).topMargin, childAt.getMeasuredWidth() + i18, childAt.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) cVar).topMargin);
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (a(childAt, 3)) {
                        float f11 = measuredWidth;
                        i15 = (-measuredWidth) + ((int) (cVar.f52037b * f11));
                        f5 = (measuredWidth + i15) / f11;
                    } else {
                        float f12 = measuredWidth;
                        int i19 = i16 - ((int) (cVar.f52037b * f12));
                        f5 = (i16 - i19) / f12;
                        i15 = i19;
                    }
                    boolean z13 = f5 != cVar.f52037b ? z12 : false;
                    int i21 = cVar.f52036a & 112;
                    if (i21 == 16) {
                        int i22 = i14 - i12;
                        int i23 = (i22 - measuredHeight) / 2;
                        int i24 = ((ViewGroup.MarginLayoutParams) cVar).topMargin;
                        if (i23 < i24) {
                            i23 = i24;
                        } else {
                            int i25 = i23 + measuredHeight;
                            int i26 = i22 - ((ViewGroup.MarginLayoutParams) cVar).bottomMargin;
                            if (i25 > i26) {
                                i23 = i26 - measuredHeight;
                            }
                        }
                        childAt.layout(i15, i23, measuredWidth + i15, measuredHeight + i23);
                    } else if (i21 != 80) {
                        int i27 = ((ViewGroup.MarginLayoutParams) cVar).topMargin;
                        childAt.layout(i15, i27, measuredWidth + i15, measuredHeight + i27);
                    } else {
                        int i28 = i14 - i12;
                        childAt.layout(i15, (i28 - ((ViewGroup.MarginLayoutParams) cVar).bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i15, i28 - ((ViewGroup.MarginLayoutParams) cVar).bottomMargin);
                    }
                    if (z13) {
                        n(childAt, f5);
                    }
                    int i29 = cVar.f52037b > CropImageView.DEFAULT_ASPECT_RATIO ? 0 : 4;
                    if (childAt.getVisibility() != i29) {
                        childAt.setVisibility(i29);
                    }
                }
            }
            i17++;
            z12 = true;
        }
        if (f1586m0 && (rootWindowInsets = getRootWindowInsets()) != null) {
            d dVarK = v1.h(null, rootWindowInsets).f58905a.k();
            e eVar = this.f1601t;
            eVar.f39761o = Math.max(eVar.f39762p, dVarK.f48793a);
            e eVar2 = this.H;
            eVar2.f39761o = Math.max(eVar2.f39762p, dVarK.f48795c);
        }
        this.N = false;
        this.O = false;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0038  */
    @Override // android.view.View
    public final void onMeasure(int i11, int i12) {
        boolean z11;
        int mode = View.MeasureSpec.getMode(i11);
        int mode2 = View.MeasureSpec.getMode(i12);
        int size = View.MeasureSpec.getSize(i11);
        int size2 = View.MeasureSpec.getSize(i12);
        if (mode != 1073741824 || mode2 != 1073741824) {
            if (!isInEditMode()) {
                throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
            }
            if (mode == 0) {
                size = 300;
            }
            if (mode2 == 0) {
                size2 = 300;
            }
        }
        setMeasuredDimension(size, size2);
        if (this.f1592c0 != null) {
            WeakHashMap weakHashMap = s0.f58893a;
            if (getFitsSystemWindows()) {
                z11 = true;
            } else {
                z11 = false;
            }
        } else {
            z11 = false;
        }
        WeakHashMap weakHashMap2 = s0.f58893a;
        int layoutDirection = getLayoutDirection();
        int childCount = getChildCount();
        boolean z12 = false;
        boolean z13 = false;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                if (z11) {
                    int absoluteGravity = Gravity.getAbsoluteGravity(cVar.f52036a, layoutDirection);
                    if (childAt.getFitsSystemWindows()) {
                        WindowInsets windowInsetsReplaceSystemWindowInsets = this.f1592c0;
                        if (absoluteGravity == 3) {
                            windowInsetsReplaceSystemWindowInsets = windowInsetsReplaceSystemWindowInsets.replaceSystemWindowInsets(windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetLeft(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop(), 0, windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom());
                        } else if (absoluteGravity == 5) {
                            windowInsetsReplaceSystemWindowInsets = windowInsetsReplaceSystemWindowInsets.replaceSystemWindowInsets(0, windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetRight(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom());
                        }
                        childAt.dispatchApplyWindowInsets(windowInsetsReplaceSystemWindowInsets);
                    } else {
                        WindowInsets windowInsetsReplaceSystemWindowInsets2 = this.f1592c0;
                        if (absoluteGravity == 3) {
                            windowInsetsReplaceSystemWindowInsets2 = windowInsetsReplaceSystemWindowInsets2.replaceSystemWindowInsets(windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetLeft(), windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetTop(), 0, windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetBottom());
                        } else if (absoluteGravity == 5) {
                            windowInsetsReplaceSystemWindowInsets2 = windowInsetsReplaceSystemWindowInsets2.replaceSystemWindowInsets(0, windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetTop(), windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetRight(), windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetBottom());
                        }
                        ((ViewGroup.MarginLayoutParams) cVar).leftMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetLeft();
                        ((ViewGroup.MarginLayoutParams) cVar).topMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetTop();
                        ((ViewGroup.MarginLayoutParams) cVar).rightMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetRight();
                        ((ViewGroup.MarginLayoutParams) cVar).bottomMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetBottom();
                    }
                }
                if (i(childAt)) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((size - ((ViewGroup.MarginLayoutParams) cVar).leftMargin) - ((ViewGroup.MarginLayoutParams) cVar).rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec((size2 - ((ViewGroup.MarginLayoutParams) cVar).topMargin) - ((ViewGroup.MarginLayoutParams) cVar).bottomMargin, 1073741824));
                } else {
                    if (!k(childAt)) {
                        throw new IllegalStateException("Child " + childAt + " at index " + i13 + " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
                    }
                    if (f1585l0) {
                        float fE = j0.e(childAt);
                        float f5 = this.f1589b;
                        if (fE != f5) {
                            j0.k(childAt, f5);
                        }
                    }
                    int iG = g(childAt);
                    int i14 = iG & 7;
                    boolean z14 = i14 == 3;
                    if ((z14 && z12) || (!z14 && z13)) {
                        throw new IllegalStateException(a.k(new StringBuilder("Child drawer has absolute gravity "), (iG & 3) != 3 ? (iG & 5) == 5 ? "RIGHT" : Integer.toHexString(i14) : "LEFT", " but this DrawerLayout already has a drawer view along that edge"));
                    }
                    if (z14) {
                        z12 = true;
                    } else {
                        z13 = true;
                    }
                    childAt.measure(ViewGroup.getChildMeasureSpec(i11, this.f1591c + ((ViewGroup.MarginLayoutParams) cVar).leftMargin + ((ViewGroup.MarginLayoutParams) cVar).rightMargin, ((ViewGroup.MarginLayoutParams) cVar).width), ViewGroup.getChildMeasureSpec(i12, ((ViewGroup.MarginLayoutParams) cVar).topMargin + ((ViewGroup.MarginLayoutParams) cVar).bottomMargin, ((ViewGroup.MarginLayoutParams) cVar).height));
                }
            }
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        View viewD;
        if (!(parcelable instanceof t5.d)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        t5.d dVar = (t5.d) parcelable;
        super.onRestoreInstanceState(dVar.f37910a);
        int i11 = dVar.f52040c;
        if (i11 != 0 && (viewD = d(i11)) != null) {
            l(viewD);
        }
        int i12 = dVar.f52041d;
        if (i12 != 3) {
            m(i12, 3);
        }
        int i13 = dVar.f52042e;
        if (i13 != 3) {
            m(i13, 5);
        }
        int i14 = dVar.f52043f;
        if (i14 != 3) {
            m(i14, 8388611);
        }
        int i15 = dVar.f52044t;
        if (i15 != 3) {
            m(i15, 8388613);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i11) {
        if (f1585l0) {
            return;
        }
        WeakHashMap weakHashMap = s0.f58893a;
        getLayoutDirection();
        getLayoutDirection();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        t5.d dVar = new t5.d(super.onSaveInstanceState());
        dVar.f52040c = 0;
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            c cVar = (c) getChildAt(i11).getLayoutParams();
            int i12 = cVar.f52039d;
            boolean z11 = i12 == 1;
            boolean z12 = i12 == 2;
            if (z11 || z12) {
                dVar.f52040c = cVar.f52036a;
                break;
            }
        }
        dVar.f52041d = this.P;
        dVar.f52042e = this.Q;
        dVar.f52043f = this.R;
        dVar.f52044t = this.S;
        return dVar;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006b  */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z11;
        View childAt;
        e eVar = this.f1601t;
        eVar.l(motionEvent);
        this.H.l(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            float x11 = motionEvent.getX();
            float y10 = motionEvent.getY();
            this.W = x11;
            this.f1588a0 = y10;
            this.T = false;
            return true;
        }
        if (action != 1) {
            if (action != 3) {
                return true;
            }
            c(true);
            this.T = false;
            return true;
        }
        float x12 = motionEvent.getX();
        float y11 = motionEvent.getY();
        View viewI = eVar.i((int) x12, (int) y11);
        if (viewI != null && i(viewI)) {
            float f5 = x12 - this.W;
            float f11 = y11 - this.f1588a0;
            int i11 = eVar.f39749b;
            if ((f11 * f11) + (f5 * f5) < i11 * i11) {
                int childCount = getChildCount();
                int i12 = 0;
                while (true) {
                    if (i12 >= childCount) {
                        childAt = null;
                        break;
                    }
                    childAt = getChildAt(i12);
                    if ((((c) childAt.getLayoutParams()).f52039d & 1) == 1) {
                        break;
                    }
                    i12++;
                }
                z11 = childAt == null || f(childAt) == 2;
            }
        }
        c(z11);
        return true;
    }

    public final void p(View view, boolean z11) {
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if ((z11 || k(childAt)) && !(z11 && childAt == view)) {
                WeakHashMap weakHashMap = s0.f58893a;
                childAt.setImportantForAccessibility(4);
            } else {
                WeakHashMap weakHashMap2 = s0.f58893a;
                childAt.setImportantForAccessibility(1);
            }
        }
    }

    public final void q(View view, int i11) {
        int i12;
        View rootView;
        int i13 = this.f1601t.f39748a;
        int i14 = this.H.f39748a;
        if (i13 == 1 || i14 == 1) {
            i12 = 1;
        } else {
            i12 = 2;
            if (i13 != 2 && i14 != 2) {
                i12 = 0;
            }
        }
        if (view != null && i11 == 0) {
            float f5 = ((c) view.getLayoutParams()).f52037b;
            if (f5 == CropImageView.DEFAULT_ASPECT_RATIO) {
                c cVar = (c) view.getLayoutParams();
                if ((cVar.f52039d & 1) == 1) {
                    cVar.f52039d = 0;
                    ArrayList arrayList = this.V;
                    if (arrayList != null) {
                        for (int size = arrayList.size() - 1; size >= 0; size--) {
                            ((b) this.V.get(size)).b(view);
                        }
                    }
                    p(view, false);
                    o(view);
                    if (hasWindowFocus() && (rootView = getRootView()) != null) {
                        rootView.sendAccessibilityEvent(32);
                    }
                }
            } else if (f5 == 1.0f) {
                c cVar2 = (c) view.getLayoutParams();
                if ((cVar2.f52039d & 1) == 0) {
                    cVar2.f52039d = 1;
                    ArrayList arrayList2 = this.V;
                    if (arrayList2 != null) {
                        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                            ((b) this.V.get(size2)).a(view);
                        }
                    }
                    p(view, true);
                    o(view);
                    if (hasWindowFocus()) {
                        sendAccessibilityEvent(32);
                    }
                }
            }
        }
        if (i12 != this.M) {
            this.M = i12;
            ArrayList arrayList3 = this.V;
            if (arrayList3 != null) {
                for (int size3 = arrayList3.size() - 1; size3 >= 0; size3--) {
                    ((b) this.V.get(size3)).getClass();
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z11) {
        super.requestDisallowInterceptTouchEvent(z11);
        if (z11) {
            c(true);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.N) {
            return;
        }
        super.requestLayout();
    }

    public void setDrawerElevation(float f5) {
        this.f1589b = f5;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (k(childAt)) {
                float f11 = this.f1589b;
                WeakHashMap weakHashMap = s0.f58893a;
                j0.k(childAt, f11);
            }
        }
    }

    @Deprecated
    public void setDrawerListener(b bVar) {
        ArrayList arrayList;
        b bVar2 = this.U;
        if (bVar2 != null && (arrayList = this.V) != null) {
            arrayList.remove(bVar2);
        }
        if (bVar != null) {
            if (this.V == null) {
                this.V = new ArrayList();
            }
            this.V.add(bVar);
        }
        this.U = bVar;
    }

    public void setDrawerLockMode(int i11) {
        m(i11, 3);
        m(i11, 5);
    }

    public void setScrimColor(int i11) {
        this.f1593d = i11;
        invalidate();
    }

    public void setStatusBarBackground(Drawable drawable) {
        this.f1590b0 = drawable;
        invalidate();
    }

    public void setStatusBarBackgroundColor(int i11) {
        this.f1590b0 = new ColorDrawable(i11);
        invalidate();
    }

    public DrawerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.lingodeer.R.attr.drawerLayoutStyle);
    }

    public DrawerLayout(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f1587a = new g(1);
        this.f1593d = -1728053248;
        this.f1597f = new Paint();
        this.O = true;
        this.P = 3;
        this.Q = 3;
        this.R = 3;
        this.S = 3;
        this.f1600h0 = new w(this, 24);
        setDescendantFocusability(262144);
        float f5 = getResources().getDisplayMetrics().density;
        this.f1591c = (int) ((64.0f * f5) + 0.5f);
        float f11 = f5 * 400.0f;
        f fVar = new f(this, 3);
        this.K = fVar;
        f fVar2 = new f(this, 5);
        this.L = fVar2;
        e eVar = new e(getContext(), this, fVar);
        eVar.f39749b = (int) (eVar.f39749b * 1.0f);
        this.f1601t = eVar;
        eVar.f39763q = 1;
        eVar.f39760n = f11;
        fVar.f52046b = eVar;
        e eVar2 = new e(getContext(), this, fVar2);
        eVar2.f39749b = (int) (1.0f * eVar2.f39749b);
        this.H = eVar2;
        eVar2.f39763q = 2;
        eVar2.f39760n = f11;
        fVar2.f52046b = eVar2;
        setFocusableInTouchMode(true);
        WeakHashMap weakHashMap = s0.f58893a;
        setImportantForAccessibility(1);
        s0.q(this, new ia.c(this));
        setMotionEventSplittingEnabled(false);
        if (getFitsSystemWindows()) {
            setOnApplyWindowInsetsListener(new t5.a());
            setSystemUiVisibility(1280);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(f1582i0);
            try {
                this.f1590b0 = typedArrayObtainStyledAttributes.getDrawable(0);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th2) {
                typedArrayObtainStyledAttributes.recycle();
                throw th2;
            }
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, s5.a.f51385a, i11, 0);
        try {
            if (typedArrayObtainStyledAttributes2.hasValue(0)) {
                this.f1589b = typedArrayObtainStyledAttributes2.getDimension(0, CropImageView.DEFAULT_ASPECT_RATIO);
            } else {
                this.f1589b = getResources().getDimension(com.lingodeer.R.dimen.def_drawer_elevation);
            }
            typedArrayObtainStyledAttributes2.recycle();
            this.f1596e0 = new ArrayList();
        } catch (Throwable th3) {
            typedArrayObtainStyledAttributes2.recycle();
            throw th3;
        }
    }

    public void setStatusBarBackground(int i11) {
        this.f1590b0 = i11 != 0 ? getContext().getDrawable(i11) : null;
        invalidate();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        c cVar = new c(context, attributeSet);
        cVar.f52036a = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f1583j0);
        cVar.f52036a = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        return cVar;
    }
}
