package androidx.viewpager.widget;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;
import l5.d;
import nv.p;
import p9.e0;
import py.b;
import ua.a;
import ua.e;
import ua.f;
import ua.g;
import ua.h;
import ua.i;
import ua.j;
import ua.k;
import ua.l;
import z4.j0;
import z4.s0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class ViewPager extends ViewGroup {
    public static final int[] G0 = {R.attr.layout_gravity};
    public static final e H0 = new e(0);
    public static final d I0 = new d(1);
    public static final e J0 = new e(1);
    public k A0;
    public int B0;
    public int C0;
    public ArrayList D0;
    public final b E0;
    public int F0;
    public Parcelable H;
    public ClassLoader K;
    public Scroller L;
    public boolean M;
    public i5.b N;
    public int O;
    public Drawable P;
    public int Q;
    public int R;
    public float S;
    public float T;
    public int U;
    public boolean V;
    public boolean W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2742a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public boolean f2743a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f2744b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public int f2745b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f2746c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public boolean f2747c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f2748d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public boolean f2749d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a f2750e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public int f2751e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f2752f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public int f2753f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public int f2754g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public float f2755h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public float f2756i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public float f2757j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public float f2758k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public int f2759l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public VelocityTracker f2760m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public int f2761n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public int f2762o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f2763p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f2764q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public EdgeEffect f2765r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public EdgeEffect f2766s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f2767t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public boolean f2768t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public boolean f2769u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public int f2770v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public ArrayList f2771w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public j f2772x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public j f2773y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public ArrayList f2774z0;

    public ViewPager(Context context) {
        super(context);
        this.f2744b = new ArrayList();
        this.f2746c = new g();
        this.f2748d = new Rect();
        this.f2767t = -1;
        this.H = null;
        this.K = null;
        this.S = -3.4028235E38f;
        this.T = Float.MAX_VALUE;
        this.f2745b0 = 1;
        this.f2759l0 = -1;
        this.f2768t0 = true;
        this.E0 = new b(this, 5);
        this.F0 = 0;
        k();
    }

    public static boolean c(int i11, int i12, int i13, View view, boolean z11) {
        int i14;
        if (!(view instanceof ViewGroup)) {
            return z11 ? false : false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int scrollX = view.getScrollX();
        int scrollY = view.getScrollY();
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            int i15 = i12 + scrollX;
            if (i15 < childAt.getLeft() || i15 >= childAt.getRight() || (i14 = i13 + scrollY) < childAt.getTop() || i14 >= childAt.getBottom() || !c(i11, i15 - childAt.getLeft(), i14 - childAt.getTop(), childAt, true)) {
            }
        }
        if (z11 || !view.canScrollHorizontally(-i11)) {
        }
        return true;
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void setScrollingCacheEnabled(boolean z11) {
        if (this.W != z11) {
            this.W = z11;
        }
    }

    public final g a(int i11, int i12) {
        g gVar = new g();
        gVar.f52889b = i11;
        gVar.f52888a = this.f2750e.d(this, i11);
        this.f2750e.getClass();
        gVar.f52891d = 1.0f;
        ArrayList arrayList = this.f2744b;
        if (i12 < 0 || i12 >= arrayList.size()) {
            arrayList.add(gVar);
            return gVar;
        }
        arrayList.add(i12, gVar);
        return gVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i11, int i12) {
        g gVarH;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i13 = 0; i13 < getChildCount(); i13++) {
                View childAt = getChildAt(i13);
                if (childAt.getVisibility() == 0 && (gVarH = h(childAt)) != null && gVarH.f52889b == this.f2752f) {
                    childAt.addFocusables(arrayList, i11, i12);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if ((i12 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
                return;
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addTouchables(ArrayList arrayList) {
        g gVarH;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() == 0 && (gVarH = h(childAt)) != null && gVarH.f52889b == this.f2752f) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i11, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateDefaultLayoutParams();
        }
        h hVar = (h) layoutParams;
        boolean z11 = hVar.f52893a | (view.getClass().getAnnotation(f.class) != null);
        hVar.f52893a = z11;
        if (!this.V) {
            super.addView(view, i11, layoutParams);
        } else {
            if (z11) {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
            hVar.f52896d = true;
            addViewInLayout(view, i11, layoutParams);
        }
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0095  */
    public final boolean b(int i11) {
        boolean zRequestFocus;
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
            break;
        }
        if (viewFindFocus != null) {
            ViewParent parent = viewFindFocus.getParent();
            while (true) {
                if (!(parent instanceof ViewGroup)) {
                    for (ViewParent parent2 = viewFindFocus.getParent(); parent2 instanceof ViewGroup; parent2 = parent2.getParent()) {
                    }
                    viewFindFocus = null;
                    break;
                }
                if (parent == this) {
                    break;
                }
                parent = parent.getParent();
            }
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i11);
        boolean z11 = true;
        boolean zN = false;
        if (viewFindNextFocus != null && viewFindNextFocus != viewFindFocus) {
            Rect rect = this.f2748d;
            if (i11 == 17) {
                int i12 = g(viewFindNextFocus, rect).left;
                int i13 = g(viewFindFocus, rect).left;
                if (viewFindFocus == null || i12 < i13) {
                    zRequestFocus = viewFindNextFocus.requestFocus();
                } else {
                    int i14 = this.f2752f;
                    if (i14 > 0) {
                        this.f2743a0 = false;
                        v(i14 - 1, 0, true, false);
                    } else {
                        z11 = false;
                    }
                    zN = z11;
                }
            } else if (i11 == 66) {
                zRequestFocus = (viewFindFocus == null || g(viewFindNextFocus, rect).left > g(viewFindFocus, rect).left) ? viewFindNextFocus.requestFocus() : n();
            }
            zN = zRequestFocus;
        } else if (i11 == 17 || i11 == 1) {
            int i15 = this.f2752f;
            if (i15 > 0) {
                this.f2743a0 = false;
                v(i15 - 1, 0, true, false);
            } else {
                z11 = false;
            }
            zN = z11;
        } else if (i11 == 66 || i11 == 2) {
            zN = n();
        }
        if (zN) {
            playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i11));
        }
        return zN;
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i11) {
        if (this.f2750e == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        if (i11 < 0) {
            return scrollX > ((int) (((float) clientWidth) * this.S));
        }
        return i11 > 0 && scrollX < ((int) (((float) clientWidth) * this.T));
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof h) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public final void computeScroll() {
        this.M = true;
        if (this.L.isFinished() || !this.L.computeScrollOffset()) {
            d(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.L.getCurrX();
        int currY = this.L.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!o(currX)) {
                this.L.abortAnimation();
                scrollTo(0, currY);
            }
        }
        WeakHashMap weakHashMap = s0.f58893a;
        postInvalidateOnAnimation();
    }

    public final void d(boolean z11) {
        boolean z12 = this.F0 == 2;
        if (z12) {
            setScrollingCacheEnabled(false);
            if (!this.L.isFinished()) {
                this.L.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.L.getCurrX();
                int currY = this.L.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        o(currX);
                    }
                }
            }
        }
        this.f2743a0 = false;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f2744b;
            if (i11 >= arrayList.size()) {
                break;
            }
            g gVar = (g) arrayList.get(i11);
            if (gVar.f52890c) {
                gVar.f52890c = false;
                z12 = true;
            }
            i11++;
        }
        if (z12) {
            b bVar = this.E0;
            if (!z11) {
                bVar.run();
            } else {
                WeakHashMap weakHashMap = s0.f58893a;
                postOnAnimation(bVar);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0061  */
    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean zB;
        if (!super.dispatchKeyEvent(keyEvent)) {
            if (keyEvent.getAction() != 0) {
                zB = false;
            } else {
                int keyCode = keyEvent.getKeyCode();
                if (keyCode != 21) {
                    if (keyCode == 22) {
                        zB = keyEvent.hasModifiers(2) ? n() : b(66);
                    } else if (keyCode != 61) {
                        zB = false;
                    } else if (keyEvent.hasNoModifiers()) {
                        zB = b(2);
                    } else if (keyEvent.hasModifiers(1)) {
                        zB = b(1);
                    } else {
                        zB = false;
                    }
                } else if (keyEvent.hasModifiers(2)) {
                    int i11 = this.f2752f;
                    if (i11 > 0) {
                        this.f2743a0 = false;
                        v(i11 - 1, 0, true, false);
                        zB = true;
                    } else {
                        zB = false;
                    }
                } else {
                    zB = b(17);
                }
            }
            if (!zB) {
                return false;
            }
        }
        return true;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        g gVarH;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() == 0 && (gVarH = h(childAt)) != null && gVarH.f52889b == this.f2752f && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        a aVar;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean zDraw = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (aVar = this.f2750e) != null && aVar.c() > 1)) {
            if (!this.f2765r0.isFinished()) {
                int iSave = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate(getPaddingTop() + (-height), this.S * width);
                this.f2765r0.setSize(height, width);
                zDraw = this.f2765r0.draw(canvas);
                canvas.restoreToCount(iSave);
            }
            if (!this.f2766s0.isFinished()) {
                int iSave2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.T + 1.0f)) * width2);
                this.f2766s0.setSize(height2, width2);
                zDraw |= this.f2766s0.draw(canvas);
                canvas.restoreToCount(iSave2);
            }
        } else {
            this.f2765r0.finish();
            this.f2766s0.finish();
        }
        if (zDraw) {
            WeakHashMap weakHashMap = s0.f58893a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.P;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    public final void e() {
        int iC = this.f2750e.c();
        this.f2742a = iC;
        ArrayList arrayList = this.f2744b;
        boolean z11 = arrayList.size() < (this.f2745b0 * 2) + 1 && arrayList.size() < iC;
        int i11 = this.f2752f;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            g gVar = (g) arrayList.get(i12);
            a aVar = this.f2750e;
            Object obj = gVar.f52888a;
            aVar.getClass();
        }
        Collections.sort(arrayList, H0);
        if (z11) {
            int childCount = getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                h hVar = (h) getChildAt(i13).getLayoutParams();
                if (!hVar.f52893a) {
                    hVar.f52895c = CropImageView.DEFAULT_ASPECT_RATIO;
                }
            }
            v(i11, 0, false, true);
            requestLayout();
        }
    }

    public final void f(int i11) {
        j jVar = this.f2772x0;
        if (jVar != null) {
            jVar.onPageSelected(i11);
        }
        ArrayList arrayList = this.f2771w0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i12 = 0; i12 < size; i12++) {
                j jVar2 = (j) this.f2771w0.get(i12);
                if (jVar2 != null) {
                    jVar2.onPageSelected(i11);
                }
            }
        }
        j jVar3 = this.f2773y0;
        if (jVar3 != null) {
            jVar3.onPageSelected(i11);
        }
    }

    public final Rect g(View view, Rect rect) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left = viewGroup.getLeft() + rect.left;
            rect.right = viewGroup.getRight() + rect.right;
            rect.top = viewGroup.getTop() + rect.top;
            rect.bottom = viewGroup.getBottom() + rect.bottom;
            parent = viewGroup.getParent();
        }
        return rect;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        h hVar = new h(-1, -1);
        hVar.f52895c = CropImageView.DEFAULT_ASPECT_RATIO;
        return hVar;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public a getAdapter() {
        return this.f2750e;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i11, int i12) {
        if (this.C0 == 2) {
            i12 = (i11 - 1) - i12;
        }
        return ((h) ((View) this.D0.get(i12)).getLayoutParams()).f52898f;
    }

    public int getCurrentItem() {
        return this.f2752f;
    }

    public int getOffscreenPageLimit() {
        return this.f2745b0;
    }

    public int getPageMargin() {
        return this.O;
    }

    public final g h(View view) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f2744b;
            if (i11 >= arrayList.size()) {
                return null;
            }
            g gVar = (g) arrayList.get(i11);
            if (this.f2750e.e(view, gVar.f52888a)) {
                return gVar;
            }
            i11++;
        }
    }

    public final g i() {
        g gVar;
        int i11;
        int clientWidth = getClientWidth();
        float f5 = CropImageView.DEFAULT_ASPECT_RATIO;
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
        float f11 = clientWidth > 0 ? this.O / clientWidth : 0.0f;
        int i12 = 0;
        boolean z11 = true;
        g gVar2 = null;
        int i13 = -1;
        float f12 = 0.0f;
        while (true) {
            ArrayList arrayList = this.f2744b;
            if (i12 >= arrayList.size()) {
                break;
            }
            g gVar3 = (g) arrayList.get(i12);
            if (z11 || gVar3.f52889b == (i11 = i13 + 1)) {
                gVar = gVar3;
            } else {
                float f13 = f5 + f12 + f11;
                g gVar4 = this.f2746c;
                gVar4.f52892e = f13;
                gVar4.f52889b = i11;
                this.f2750e.getClass();
                gVar4.f52891d = 1.0f;
                i12--;
                gVar = gVar4;
            }
            f5 = gVar.f52892e;
            float f14 = gVar.f52891d + f5 + f11;
            if (!z11 && scrollX < f5) {
                break;
            }
            if (scrollX < f14 || i12 == arrayList.size() - 1) {
                return gVar;
            }
            int i14 = gVar.f52889b;
            float f15 = gVar.f52891d;
            i12++;
            g gVar5 = gVar;
            i13 = i14;
            f12 = f15;
            gVar2 = gVar5;
            z11 = false;
        }
        return gVar2;
    }

    public final g j(int i11) {
        int i12 = 0;
        while (true) {
            ArrayList arrayList = this.f2744b;
            if (i12 >= arrayList.size()) {
                return null;
            }
            g gVar = (g) arrayList.get(i12);
            if (gVar.f52889b == i11) {
                return gVar;
            }
            i12++;
        }
    }

    public final void k() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.L = new Scroller(context, I0);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f5 = context.getResources().getDisplayMetrics().density;
        this.f2754g0 = viewConfiguration.getScaledPagingTouchSlop();
        this.f2761n0 = (int) (400.0f * f5);
        this.f2762o0 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f2765r0 = new EdgeEffect(context);
        this.f2766s0 = new EdgeEffect(context);
        this.f2763p0 = (int) (25.0f * f5);
        this.f2764q0 = (int) (2.0f * f5);
        this.f2751e0 = (int) (f5 * 16.0f);
        s0.q(this, new e0(this, 1));
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        j0.m(this, new qp.b(this));
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0065  */
    public final void l(int i11, float f5, int i12) {
        int iMax;
        int width;
        int left;
        if (this.f2770v0 > 0) {
            int scrollX = getScrollX();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int width2 = getWidth();
            int childCount = getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                View childAt = getChildAt(i13);
                h hVar = (h) childAt.getLayoutParams();
                if (hVar.f52893a) {
                    int i14 = hVar.f52894b & 7;
                    if (i14 != 1) {
                        if (i14 == 3) {
                            width = childAt.getWidth() + paddingLeft;
                        } else if (i14 != 5) {
                            width = paddingLeft;
                        } else {
                            iMax = (width2 - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                        }
                        left = (paddingLeft + scrollX) - childAt.getLeft();
                        if (left != 0) {
                            childAt.offsetLeftAndRight(left);
                        }
                        paddingLeft = width;
                    } else {
                        iMax = Math.max((width2 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    }
                    int i15 = iMax;
                    width = paddingLeft;
                    paddingLeft = i15;
                    left = (paddingLeft + scrollX) - childAt.getLeft();
                    if (left != 0) {
                        childAt.offsetLeftAndRight(left);
                    }
                    paddingLeft = width;
                }
            }
        }
        j jVar = this.f2772x0;
        if (jVar != null) {
            jVar.b(i11, f5);
        }
        ArrayList arrayList = this.f2771w0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i16 = 0; i16 < size; i16++) {
                j jVar2 = (j) this.f2771w0.get(i16);
                if (jVar2 != null) {
                    jVar2.b(i11, f5);
                }
            }
        }
        j jVar3 = this.f2773y0;
        if (jVar3 != null) {
            jVar3.b(i11, f5);
        }
        if (this.A0 != null) {
            getScrollX();
            int childCount2 = getChildCount();
            for (int i17 = 0; i17 < childCount2; i17++) {
                View childAt2 = getChildAt(i17);
                if (!((h) childAt2.getLayoutParams()).f52893a) {
                    childAt2.getLeft();
                    getClientWidth();
                    this.A0.h(childAt2);
                }
            }
        }
        this.f2769u0 = true;
    }

    public final void m(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f2759l0) {
            int i11 = actionIndex == 0 ? 1 : 0;
            this.f2755h0 = motionEvent.getX(i11);
            this.f2759l0 = motionEvent.getPointerId(i11);
            VelocityTracker velocityTracker = this.f2760m0;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public final boolean n() {
        a aVar = this.f2750e;
        if (aVar == null || this.f2752f >= aVar.c() - 1) {
            return false;
        }
        int i11 = this.f2752f + 1;
        this.f2743a0 = false;
        v(i11, 0, true, false);
        return true;
    }

    public final boolean o(int i11) {
        if (this.f2744b.size() == 0) {
            if (!this.f2768t0) {
                this.f2769u0 = false;
                l(0, CropImageView.DEFAULT_ASPECT_RATIO, 0);
                if (!this.f2769u0) {
                    throw new IllegalStateException("onPageScrolled did not call superclass implementation");
                }
            }
            return false;
        }
        g gVarI = i();
        int clientWidth = getClientWidth();
        int i12 = this.O;
        int i13 = clientWidth + i12;
        float f5 = clientWidth;
        int i14 = gVarI.f52889b;
        float f11 = ((i11 / f5) - gVarI.f52892e) / (gVarI.f52891d + (i12 / f5));
        this.f2769u0 = false;
        l(i14, f11, (int) (i13 * f11));
        if (this.f2769u0) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f2768t0 = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.E0);
        Scroller scroller = this.L;
        if (scroller != null && !scroller.isFinished()) {
            this.L.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i11;
        float f5;
        super.onDraw(canvas);
        if (this.O <= 0 || this.P == null) {
            return;
        }
        ArrayList arrayList = this.f2744b;
        if (arrayList.size() <= 0 || this.f2750e == null) {
            return;
        }
        int scrollX = getScrollX();
        int width = getWidth();
        float f11 = width;
        float f12 = this.O / f11;
        int i12 = 0;
        g gVar = (g) arrayList.get(0);
        float f13 = gVar.f52892e;
        int size = arrayList.size();
        int i13 = gVar.f52889b;
        int i14 = ((g) arrayList.get(size - 1)).f52889b;
        while (i13 < i14) {
            while (true) {
                i11 = gVar.f52889b;
                if (i13 <= i11 || i12 >= size) {
                    break;
                }
                i12++;
                gVar = (g) arrayList.get(i12);
            }
            if (i13 == i11) {
                float f14 = gVar.f52892e;
                float f15 = gVar.f52891d;
                f5 = (f14 + f15) * f11;
                f13 = f14 + f15 + f12;
            } else {
                this.f2750e.getClass();
                f5 = (f13 + 1.0f) * f11;
                f13 = 1.0f + f12 + f13;
            }
            if (this.O + f5 > scrollX) {
                this.P.setBounds(Math.round(f5), this.Q, Math.round(this.O + f5), this.R);
                this.P.draw(canvas);
            }
            if (f5 > scrollX + width) {
                return;
            }
            i13++;
            arrayList = arrayList;
            scrollX = scrollX;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            t();
            return false;
        }
        if (action != 0) {
            if (this.f2747c0) {
                return true;
            }
            if (this.f2749d0) {
                return false;
            }
        }
        if (action == 0) {
            float x11 = motionEvent.getX();
            this.f2757j0 = x11;
            this.f2755h0 = x11;
            float y10 = motionEvent.getY();
            this.f2758k0 = y10;
            this.f2756i0 = y10;
            this.f2759l0 = motionEvent.getPointerId(0);
            this.f2749d0 = false;
            this.M = true;
            this.L.computeScrollOffset();
            if (this.F0 != 2 || Math.abs(this.L.getFinalX() - this.L.getCurrX()) <= this.f2764q0) {
                d(false);
                this.f2747c0 = false;
            } else {
                this.L.abortAnimation();
                this.f2743a0 = false;
                q();
                this.f2747c0 = true;
                ViewParent parent = getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                setScrollState(1);
            }
        } else if (action == 2) {
            int i11 = this.f2759l0;
            if (i11 != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i11);
                float x12 = motionEvent.getX(iFindPointerIndex);
                float f5 = x12 - this.f2755h0;
                float fAbs = Math.abs(f5);
                float y11 = motionEvent.getY(iFindPointerIndex);
                float fAbs2 = Math.abs(y11 - this.f2758k0);
                if (f5 != CropImageView.DEFAULT_ASPECT_RATIO) {
                    float f11 = this.f2755h0;
                    if ((f11 >= this.f2753f0 || f5 <= CropImageView.DEFAULT_ASPECT_RATIO) && ((f11 <= getWidth() - this.f2753f0 || f5 >= CropImageView.DEFAULT_ASPECT_RATIO) && c((int) f5, (int) x12, (int) y11, this, false))) {
                        this.f2755h0 = x12;
                        this.f2756i0 = y11;
                        this.f2749d0 = true;
                        return false;
                    }
                }
                float f12 = this.f2754g0;
                if (fAbs > f12 && fAbs * 0.5f > fAbs2) {
                    this.f2747c0 = true;
                    ViewParent parent2 = getParent();
                    if (parent2 != null) {
                        parent2.requestDisallowInterceptTouchEvent(true);
                    }
                    setScrollState(1);
                    float f13 = this.f2757j0;
                    float f14 = this.f2754g0;
                    this.f2755h0 = f5 > CropImageView.DEFAULT_ASPECT_RATIO ? f13 + f14 : f13 - f14;
                    this.f2756i0 = y11;
                    setScrollingCacheEnabled(true);
                } else if (fAbs2 > f12) {
                    this.f2749d0 = true;
                }
                if (this.f2747c0 && p(x12)) {
                    WeakHashMap weakHashMap = s0.f58893a;
                    postInvalidateOnAnimation();
                }
            }
        } else if (action == 6) {
            m(motionEvent);
        }
        if (this.f2760m0 == null) {
            this.f2760m0 = VelocityTracker.obtain();
        }
        this.f2760m0.addMovement(motionEvent);
        return this.f2747c0;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0072  */
    /* JADX WARN: Code duplicated, block: B:24:0x0076  */
    /* JADX WARN: Code duplicated, block: B:26:0x007a  */
    /* JADX WARN: Code duplicated, block: B:27:0x007c  */
    /* JADX WARN: Code duplicated, block: B:29:0x008e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0094  */
    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        boolean z12;
        g gVarH;
        int iMax;
        int measuredWidth;
        int iMax2;
        int measuredHeight;
        int childCount = getChildCount();
        int i15 = i13 - i11;
        int i16 = i14 - i12;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollX = getScrollX();
        int i17 = 0;
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt = getChildAt(i18);
            if (childAt.getVisibility() != 8) {
                h hVar = (h) childAt.getLayoutParams();
                if (hVar.f52893a) {
                    int i19 = hVar.f52894b;
                    int i21 = i19 & 7;
                    int i22 = i19 & 112;
                    if (i21 != 1) {
                        if (i21 == 3) {
                            measuredWidth = childAt.getMeasuredWidth() + paddingLeft;
                        } else if (i21 != 5) {
                            measuredWidth = paddingLeft;
                        } else {
                            iMax = (i15 - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                        }
                        if (i22 != 16) {
                            if (i22 != 48) {
                                measuredHeight = childAt.getMeasuredHeight() + paddingTop;
                            } else if (i22 != 80) {
                                measuredHeight = paddingTop;
                            } else {
                                iMax2 = (i16 - paddingBottom) - childAt.getMeasuredHeight();
                                paddingBottom += childAt.getMeasuredHeight();
                            }
                            int i23 = paddingLeft + scrollX;
                            childAt.layout(i23, paddingTop, childAt.getMeasuredWidth() + i23, childAt.getMeasuredHeight() + paddingTop);
                            i17++;
                            paddingTop = measuredHeight;
                            paddingLeft = measuredWidth;
                        } else {
                            iMax2 = Math.max((i16 - childAt.getMeasuredHeight()) / 2, paddingTop);
                        }
                        int i24 = iMax2;
                        measuredHeight = paddingTop;
                        paddingTop = i24;
                        int i25 = paddingLeft + scrollX;
                        childAt.layout(i25, paddingTop, childAt.getMeasuredWidth() + i25, childAt.getMeasuredHeight() + paddingTop);
                        i17++;
                        paddingTop = measuredHeight;
                        paddingLeft = measuredWidth;
                    } else {
                        iMax = Math.max((i15 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    }
                    int i26 = iMax;
                    measuredWidth = paddingLeft;
                    paddingLeft = i26;
                    if (i22 != 16) {
                        if (i22 != 48) {
                            measuredHeight = childAt.getMeasuredHeight() + paddingTop;
                        } else if (i22 != 80) {
                            measuredHeight = paddingTop;
                        } else {
                            iMax2 = (i16 - paddingBottom) - childAt.getMeasuredHeight();
                            paddingBottom += childAt.getMeasuredHeight();
                        }
                        int i27 = paddingLeft + scrollX;
                        childAt.layout(i27, paddingTop, childAt.getMeasuredWidth() + i27, childAt.getMeasuredHeight() + paddingTop);
                        i17++;
                        paddingTop = measuredHeight;
                        paddingLeft = measuredWidth;
                    } else {
                        iMax2 = Math.max((i16 - childAt.getMeasuredHeight()) / 2, paddingTop);
                    }
                    int i28 = iMax2;
                    measuredHeight = paddingTop;
                    paddingTop = i28;
                    int i29 = paddingLeft + scrollX;
                    childAt.layout(i29, paddingTop, childAt.getMeasuredWidth() + i29, childAt.getMeasuredHeight() + paddingTop);
                    i17++;
                    paddingTop = measuredHeight;
                    paddingLeft = measuredWidth;
                }
            }
        }
        int i30 = (i15 - paddingLeft) - paddingRight;
        for (int i31 = 0; i31 < childCount; i31++) {
            View childAt2 = getChildAt(i31);
            if (childAt2.getVisibility() != 8) {
                h hVar2 = (h) childAt2.getLayoutParams();
                if (!hVar2.f52893a && (gVarH = h(childAt2)) != null) {
                    float f5 = i30;
                    int i32 = ((int) (gVarH.f52892e * f5)) + paddingLeft;
                    if (hVar2.f52896d) {
                        hVar2.f52896d = false;
                        childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (f5 * hVar2.f52895c), 1073741824), View.MeasureSpec.makeMeasureSpec((i16 - paddingTop) - paddingBottom, 1073741824));
                    }
                    childAt2.layout(i32, paddingTop, childAt2.getMeasuredWidth() + i32, childAt2.getMeasuredHeight() + paddingTop);
                }
            }
        }
        this.Q = paddingTop;
        this.R = i16 - paddingBottom;
        this.f2770v0 = i17;
        if (this.f2768t0) {
            z12 = false;
            u(this.f2752f, 0, false, false);
        } else {
            z12 = false;
        }
        this.f2768t0 = z12;
    }

    @Override // android.view.View
    public final void onMeasure(int i11, int i12) {
        h hVar;
        h hVar2;
        int i13;
        setMeasuredDimension(View.getDefaultSize(0, i11), View.getDefaultSize(0, i12));
        int measuredWidth = getMeasuredWidth();
        this.f2753f0 = Math.min(measuredWidth / 10, this.f2751e0);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i14 = 0;
        while (true) {
            boolean z11 = true;
            int i15 = 1073741824;
            if (i14 >= childCount) {
                break;
            }
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8 && (hVar2 = (h) childAt.getLayoutParams()) != null && hVar2.f52893a) {
                int i16 = hVar2.f52894b;
                int i17 = i16 & 7;
                int i18 = i16 & 112;
                boolean z12 = i18 == 48 || i18 == 80;
                if (i17 != 3 && i17 != 5) {
                    z11 = false;
                }
                int i19 = Integer.MIN_VALUE;
                if (z12) {
                    i13 = Integer.MIN_VALUE;
                    i19 = 1073741824;
                } else {
                    i13 = z11 ? 1073741824 : Integer.MIN_VALUE;
                }
                int i21 = ((ViewGroup.LayoutParams) hVar2).width;
                if (i21 != -2) {
                    if (i21 == -1) {
                        i21 = paddingLeft;
                    }
                    i19 = 1073741824;
                } else {
                    i21 = paddingLeft;
                }
                int i22 = ((ViewGroup.LayoutParams) hVar2).height;
                if (i22 == -2) {
                    i22 = measuredHeight;
                    i15 = i13;
                } else if (i22 == -1) {
                    i22 = measuredHeight;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i21, i19), View.MeasureSpec.makeMeasureSpec(i22, i15));
                if (z12) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z11) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i14++;
        }
        View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.U = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.V = true;
        q();
        this.V = false;
        int childCount2 = getChildCount();
        for (int i23 = 0; i23 < childCount2; i23++) {
            View childAt2 = getChildAt(i23);
            if (childAt2.getVisibility() != 8 && ((hVar = (h) childAt2.getLayoutParams()) == null || !hVar.f52893a)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * hVar.f52895c), 1073741824), this.U);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i11, Rect rect) {
        int i12;
        int i13;
        int i14;
        g gVarH;
        int childCount = getChildCount();
        if ((i11 & 2) != 0) {
            i13 = childCount;
            i12 = 0;
            i14 = 1;
        } else {
            i12 = childCount - 1;
            i13 = -1;
            i14 = -1;
        }
        while (i12 != i13) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() == 0 && (gVarH = h(childAt)) != null && gVarH.f52889b == this.f2752f && childAt.requestFocus(i11, rect)) {
                return true;
            }
            i12 += i14;
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof l)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        l lVar = (l) parcelable;
        ClassLoader classLoader = lVar.f52901e;
        super.onRestoreInstanceState(lVar.f37910a);
        a aVar = this.f2750e;
        if (aVar != null) {
            aVar.f(lVar.f52900d, classLoader);
            v(lVar.f52899c, 0, false, true);
        } else {
            this.f2767t = lVar.f52899c;
            this.H = lVar.f52900d;
            this.K = classLoader;
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        l lVar = new l(super.onSaveInstanceState());
        lVar.f52899c = this.f2752f;
        a aVar = this.f2750e;
        if (aVar != null) {
            lVar.f52900d = aVar.g();
        }
        return lVar;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i11, int i12, int i13, int i14) {
        super.onSizeChanged(i11, i12, i13, i14);
        if (i11 != i13) {
            int i15 = this.O;
            s(i11, i13, i15, i15);
        }
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00de  */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        a aVar;
        boolean zT = false;
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (aVar = this.f2750e) == null || aVar.c() == 0) {
            return false;
        }
        if (this.f2760m0 == null) {
            this.f2760m0 = VelocityTracker.obtain();
        }
        this.f2760m0.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.L.abortAnimation();
            this.f2743a0 = false;
            q();
            float x11 = motionEvent.getX();
            this.f2757j0 = x11;
            this.f2755h0 = x11;
            float y10 = motionEvent.getY();
            this.f2758k0 = y10;
            this.f2756i0 = y10;
            this.f2759l0 = motionEvent.getPointerId(0);
        } else if (action != 1) {
            if (action != 2) {
                if (action != 3) {
                    if (action == 5) {
                        int actionIndex = motionEvent.getActionIndex();
                        this.f2755h0 = motionEvent.getX(actionIndex);
                        this.f2759l0 = motionEvent.getPointerId(actionIndex);
                    } else if (action == 6) {
                        m(motionEvent);
                        this.f2755h0 = motionEvent.getX(motionEvent.findPointerIndex(this.f2759l0));
                    }
                } else if (this.f2747c0) {
                    u(this.f2752f, 0, true, false);
                    zT = t();
                }
            } else if (!this.f2747c0) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f2759l0);
                if (iFindPointerIndex == -1) {
                    zT = t();
                } else {
                    float x12 = motionEvent.getX(iFindPointerIndex);
                    float fAbs = Math.abs(x12 - this.f2755h0);
                    float y11 = motionEvent.getY(iFindPointerIndex);
                    float fAbs2 = Math.abs(y11 - this.f2756i0);
                    if (fAbs > this.f2754g0 && fAbs > fAbs2) {
                        this.f2747c0 = true;
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                        float f5 = this.f2757j0;
                        this.f2755h0 = x12 - f5 > CropImageView.DEFAULT_ASPECT_RATIO ? f5 + this.f2754g0 : f5 - this.f2754g0;
                        this.f2756i0 = y11;
                        setScrollState(1);
                        setScrollingCacheEnabled(true);
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                    if (this.f2747c0) {
                        zT = p(motionEvent.getX(motionEvent.findPointerIndex(this.f2759l0)));
                    }
                }
            } else if (this.f2747c0) {
                zT = p(motionEvent.getX(motionEvent.findPointerIndex(this.f2759l0)));
            }
        } else if (this.f2747c0) {
            VelocityTracker velocityTracker = this.f2760m0;
            velocityTracker.computeCurrentVelocity(1000, this.f2762o0);
            int xVelocity = (int) velocityTracker.getXVelocity(this.f2759l0);
            this.f2743a0 = true;
            int clientWidth = getClientWidth();
            int scrollX = getScrollX();
            g gVarI = i();
            float f11 = clientWidth;
            float f12 = this.O / f11;
            int iMax = gVarI.f52889b;
            float f13 = ((scrollX / f11) - gVarI.f52892e) / (gVarI.f52891d + f12);
            if (Math.abs((int) (motionEvent.getX(motionEvent.findPointerIndex(this.f2759l0)) - this.f2757j0)) <= this.f2763p0 || Math.abs(xVelocity) <= this.f2761n0) {
                iMax += (int) (f13 + (iMax >= this.f2752f ? 0.4f : 0.6f));
            } else if (xVelocity <= 0) {
                iMax++;
            }
            ArrayList arrayList = this.f2744b;
            if (arrayList.size() > 0) {
                iMax = Math.max(((g) arrayList.get(0)).f52889b, Math.min(iMax, ((g) p.f(1, arrayList)).f52889b));
            }
            v(iMax, xVelocity, true, true);
            zT = t();
        }
        if (zT) {
            WeakHashMap weakHashMap = s0.f58893a;
            postInvalidateOnAnimation();
        }
        return true;
    }

    public final boolean p(float f5) {
        boolean z11;
        boolean z12;
        float f11 = this.f2755h0 - f5;
        this.f2755h0 = f5;
        float scrollX = getScrollX() + f11;
        float clientWidth = getClientWidth();
        float f12 = this.S * clientWidth;
        float f13 = this.T * clientWidth;
        ArrayList arrayList = this.f2744b;
        boolean z13 = false;
        g gVar = (g) arrayList.get(0);
        g gVar2 = (g) p.f(1, arrayList);
        if (gVar.f52889b != 0) {
            f12 = gVar.f52892e * clientWidth;
            z11 = false;
        } else {
            z11 = true;
        }
        if (gVar2.f52889b != this.f2750e.c() - 1) {
            f13 = gVar2.f52892e * clientWidth;
            z12 = false;
        } else {
            z12 = true;
        }
        if (scrollX < f12) {
            if (z11) {
                this.f2765r0.onPull(Math.abs(f12 - scrollX) / clientWidth);
                z13 = true;
            }
            scrollX = f12;
        } else if (scrollX > f13) {
            if (z12) {
                this.f2766s0.onPull(Math.abs(scrollX - f13) / clientWidth);
                z13 = true;
            }
            scrollX = f13;
        }
        int i11 = (int) scrollX;
        this.f2755h0 = (scrollX - i11) + this.f2755h0;
        scrollTo(i11, getScrollY());
        o(i11);
        return z13;
    }

    public final void q() {
        r(this.f2752f);
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00c7 A[PHI: r7 r11 r15
      0x00c7: PHI (r7v16 int) = (r7v15 int), (r7v5 int), (r7v19 int) binds: [B:64:0x00eb, B:61:0x00d7, B:52:0x00be] A[DONT_GENERATE, DONT_INLINE]
      0x00c7: PHI (r11v32 int) = (r11v1 int), (r11v31 int), (r11v35 int) binds: [B:64:0x00eb, B:61:0x00d7, B:52:0x00be] A[DONT_GENERATE, DONT_INLINE]
      0x00c7: PHI (r15v6 float) = (r15v4 float), (r15v5 float), (r15v3 float) binds: [B:64:0x00eb, B:61:0x00d7, B:52:0x00be] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:90:0x0149 A[PHI: r3 r12
      0x0149: PHI (r3v20 float) = (r3v18 float), (r3v19 float), (r3v17 float) binds: [B:98:0x0170, B:95:0x015a, B:88:0x0140] A[DONT_GENERATE, DONT_INLINE]
      0x0149: PHI (r12v25 int) = (r12v23 int), (r12v24 int), (r12v22 int) binds: [B:98:0x0170, B:95:0x015a, B:88:0x0140] A[DONT_GENERATE, DONT_INLINE]] */
    public final void r(int i11) {
        g gVarJ;
        String hexString;
        ArrayList arrayList;
        g gVarA;
        float f5;
        g gVarH;
        g gVarH2;
        int i12;
        int i13;
        g gVar;
        g gVar2;
        g gVar3;
        int i14 = this.f2752f;
        if (i14 != i11) {
            gVarJ = j(i14);
            this.f2752f = i11;
        } else {
            gVarJ = null;
        }
        if (this.f2750e == null) {
            x();
            return;
        }
        if (this.f2743a0) {
            x();
            return;
        }
        if (getWindowToken() == null) {
            return;
        }
        this.f2750e.i(this);
        int i15 = this.f2745b0;
        int iMax = Math.max(0, this.f2752f - i15);
        int iC = this.f2750e.c();
        int iMin = Math.min(iC - 1, this.f2752f + i15);
        if (iC != this.f2742a) {
            try {
                hexString = getResources().getResourceName(getId());
            } catch (Resources.NotFoundException unused) {
                hexString = Integer.toHexString(getId());
            }
            StringBuilder sb2 = new StringBuilder("The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: ");
            ep.a.v(this.f2742a, iC, ", found: ", " Pager id: ", sb2);
            sb2.append(hexString);
            sb2.append(" Pager class: ");
            sb2.append(getClass());
            sb2.append(" Problematic adapter: ");
            sb2.append(this.f2750e.getClass());
            throw new IllegalStateException(sb2.toString());
        }
        int i16 = 0;
        while (true) {
            arrayList = this.f2744b;
            if (i16 < arrayList.size()) {
                gVarA = (g) arrayList.get(i16);
                int i17 = gVarA.f52889b;
                int i18 = this.f2752f;
                if (i17 >= i18) {
                    if (i17 != i18) {
                        break;
                    } else {
                        break;
                    }
                }
                i16++;
            }
            gVarA = null;
            break;
        }
        if (gVarA == null && iC > 0) {
            gVarA = a(this.f2752f, i16);
        }
        if (gVarA != null) {
            int i19 = i16 - 1;
            g gVar4 = i19 >= 0 ? (g) arrayList.get(i19) : null;
            int clientWidth = getClientWidth();
            float paddingLeft = clientWidth <= 0 ? CropImageView.DEFAULT_ASPECT_RATIO : (getPaddingLeft() / clientWidth) + (2.0f - gVarA.f52891d);
            float f11 = CropImageView.DEFAULT_ASPECT_RATIO;
            for (int i21 = this.f2752f - 1; i21 >= 0; i21--) {
                if (f11 < paddingLeft || i21 >= iMax) {
                    if (gVar4 == null || i21 != gVar4.f52889b) {
                        f11 += a(i21, i19 + 1).f52891d;
                        i16++;
                        if (i19 >= 0) {
                            gVar3 = (g) arrayList.get(i19);
                        } else {
                            gVar3 = null;
                        }
                    } else {
                        f11 += gVar4.f52891d;
                        i19--;
                        if (i19 >= 0) {
                            gVar3 = (g) arrayList.get(i19);
                        } else {
                            gVar3 = null;
                        }
                    }
                    gVar4 = gVar3;
                } else {
                    if (gVar4 == null) {
                        break;
                    }
                    if (i21 == gVar4.f52889b && !gVar4.f52890c) {
                        arrayList.remove(i19);
                        this.f2750e.a(this, i21, gVar4.f52888a);
                        i19--;
                        i16--;
                        if (i19 >= 0) {
                            gVar3 = (g) arrayList.get(i19);
                        } else {
                            gVar3 = null;
                        }
                        gVar4 = gVar3;
                    }
                }
            }
            f5 = CropImageView.DEFAULT_ASPECT_RATIO;
            float f12 = gVarA.f52891d;
            int i22 = i16 + 1;
            if (f12 < 2.0f) {
                g gVar5 = i22 < arrayList.size() ? (g) arrayList.get(i22) : null;
                float paddingRight = clientWidth <= 0 ? 0.0f : (getPaddingRight() / clientWidth) + 2.0f;
                int i23 = i22;
                for (int i24 = this.f2752f + 1; i24 < iC; i24++) {
                    if (f12 >= paddingRight && i24 > iMin) {
                        if (gVar5 == null) {
                            break;
                        }
                        if (i24 == gVar5.f52889b && !gVar5.f52890c) {
                            arrayList.remove(i23);
                            this.f2750e.a(this, i24, gVar5.f52888a);
                            if (i23 < arrayList.size()) {
                                gVar5 = (g) arrayList.get(i23);
                            } else {
                                gVar5 = null;
                            }
                        }
                    } else if (gVar5 == null || i24 != gVar5.f52889b) {
                        g gVarA2 = a(i24, i23);
                        i23++;
                        f12 += gVarA2.f52891d;
                        if (i23 < arrayList.size()) {
                            gVar5 = (g) arrayList.get(i23);
                        } else {
                            gVar5 = null;
                        }
                    } else {
                        f12 += gVar5.f52891d;
                        i23++;
                        if (i23 < arrayList.size()) {
                            gVar5 = (g) arrayList.get(i23);
                        } else {
                            gVar5 = null;
                        }
                    }
                }
            }
            int iC2 = this.f2750e.c();
            int clientWidth2 = getClientWidth();
            float f13 = clientWidth2 > 0 ? this.O / clientWidth2 : 0.0f;
            if (gVarJ != null) {
                int i25 = gVarJ.f52889b;
                int i26 = gVarA.f52889b;
                if (i25 < i26) {
                    float f14 = gVarJ.f52892e + gVarJ.f52891d + f13;
                    int i27 = i25 + 1;
                    int i28 = 0;
                    while (i27 <= gVarA.f52889b && i28 < arrayList.size()) {
                        Object obj = arrayList.get(i28);
                        while (true) {
                            gVar2 = (g) obj;
                            if (i27 <= gVar2.f52889b || i28 >= arrayList.size() - 1) {
                                break;
                            }
                            i28++;
                            obj = arrayList.get(i28);
                        }
                        while (i27 < gVar2.f52889b) {
                            this.f2750e.getClass();
                            f14 += 1.0f + f13;
                            i27++;
                        }
                        gVar2.f52892e = f14;
                        f14 += gVar2.f52891d + f13;
                        i27++;
                    }
                } else if (i25 > i26) {
                    int size = arrayList.size() - 1;
                    float f15 = gVarJ.f52892e;
                    while (true) {
                        i25--;
                        if (i25 < gVarA.f52889b || size < 0) {
                            break;
                        }
                        Object obj2 = arrayList.get(size);
                        while (true) {
                            gVar = (g) obj2;
                            if (i25 >= gVar.f52889b || size <= 0) {
                                break;
                            }
                            size--;
                            obj2 = arrayList.get(size);
                        }
                        while (i25 > gVar.f52889b) {
                            this.f2750e.getClass();
                            f15 -= 1.0f + f13;
                            i25--;
                        }
                        f15 -= gVar.f52891d + f13;
                        gVar.f52892e = f15;
                    }
                }
            }
            int size2 = arrayList.size();
            float f16 = gVarA.f52892e;
            int i29 = gVarA.f52889b;
            int i30 = i29 - 1;
            this.S = i29 == 0 ? f16 : -3.4028235E38f;
            int i31 = iC2 - 1;
            this.T = i29 == i31 ? (gVarA.f52891d + f16) - 1.0f : Float.MAX_VALUE;
            int i32 = i16 - 1;
            while (i32 >= 0) {
                g gVar6 = (g) arrayList.get(i32);
                while (true) {
                    i13 = gVar6.f52889b;
                    if (i30 <= i13) {
                        break;
                    }
                    i30--;
                    this.f2750e.getClass();
                    f16 -= 1.0f + f13;
                }
                f16 -= gVar6.f52891d + f13;
                gVar6.f52892e = f16;
                if (i13 == 0) {
                    this.S = f16;
                }
                i32--;
                i30--;
            }
            float f17 = gVarA.f52892e + gVarA.f52891d + f13;
            int i33 = gVarA.f52889b;
            while (true) {
                i33++;
                if (i22 >= size2) {
                    break;
                }
                g gVar7 = (g) arrayList.get(i22);
                while (true) {
                    i12 = gVar7.f52889b;
                    if (i33 >= i12) {
                        break;
                    }
                    i33++;
                    this.f2750e.getClass();
                    f17 += 1.0f + f13;
                }
                if (i12 == i31) {
                    this.T = (gVar7.f52891d + f17) - 1.0f;
                }
                gVar7.f52892e = f17;
                f17 += gVar7.f52891d + f13;
                i22++;
            }
            this.f2750e.h(gVarA.f52888a);
        } else {
            f5 = CropImageView.DEFAULT_ASPECT_RATIO;
        }
        this.f2750e.b();
        int childCount = getChildCount();
        for (int i34 = 0; i34 < childCount; i34++) {
            View childAt = getChildAt(i34);
            h hVar = (h) childAt.getLayoutParams();
            hVar.f52898f = i34;
            if (!hVar.f52893a && hVar.f52895c == f5 && (gVarH2 = h(childAt)) != null) {
                hVar.f52895c = gVarH2.f52891d;
                hVar.f52897e = gVarH2.f52889b;
            }
        }
        x();
        if (hasFocus()) {
            View viewFindFocus = findFocus();
            if (viewFindFocus == null) {
                gVarH = null;
                break;
            }
            while (true) {
                Object parent = viewFindFocus.getParent();
                if (parent == this) {
                    gVarH = h(viewFindFocus);
                    break;
                } else {
                    if (parent == null || !(parent instanceof View)) {
                        gVarH = null;
                        break;
                    }
                    viewFindFocus = (View) parent;
                }
            }
            if (gVarH == null || gVarH.f52889b != this.f2752f) {
                for (int i35 = 0; i35 < getChildCount(); i35++) {
                    View childAt2 = getChildAt(i35);
                    g gVarH3 = h(childAt2);
                    if (gVarH3 != null && gVarH3.f52889b == this.f2752f && childAt2.requestFocus(2)) {
                        return;
                    }
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (this.V) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public final void s(int i11, int i12, int i13, int i14) {
        if (i12 > 0 && !this.f2744b.isEmpty()) {
            if (!this.L.isFinished()) {
                this.L.setFinalX(getCurrentItem() * getClientWidth());
                return;
            } else {
                scrollTo((int) ((getScrollX() / (((i12 - getPaddingLeft()) - getPaddingRight()) + i14)) * (((i11 - getPaddingLeft()) - getPaddingRight()) + i13)), getScrollY());
                return;
            }
        }
        g gVarJ = j(this.f2752f);
        int iMin = (int) ((gVarJ != null ? Math.min(gVarJ.f52892e, this.T) : CropImageView.DEFAULT_ASPECT_RATIO) * ((i11 - getPaddingLeft()) - getPaddingRight()));
        if (iMin != getScrollX()) {
            d(false);
            scrollTo(iMin, getScrollY());
        }
    }

    public void setAdapter(a aVar) {
        ArrayList arrayList = this.f2744b;
        a aVar2 = this.f2750e;
        if (aVar2 != null) {
            synchronized (aVar2) {
            }
            this.f2750e.i(this);
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                g gVar = (g) arrayList.get(i11);
                this.f2750e.a(this, gVar.f52889b, gVar.f52888a);
            }
            this.f2750e.b();
            arrayList.clear();
            int i12 = 0;
            while (i12 < getChildCount()) {
                if (!((h) getChildAt(i12).getLayoutParams()).f52893a) {
                    removeViewAt(i12);
                    i12--;
                }
                i12++;
            }
            this.f2752f = 0;
            scrollTo(0, 0);
        }
        a aVar3 = this.f2750e;
        this.f2750e = aVar;
        this.f2742a = 0;
        if (aVar != null) {
            if (this.N == null) {
                this.N = new i5.b(this, 2);
            }
            synchronized (this.f2750e) {
            }
            this.f2743a0 = false;
            boolean z11 = this.f2768t0;
            this.f2768t0 = true;
            this.f2742a = this.f2750e.c();
            if (this.f2767t >= 0) {
                this.f2750e.f(this.H, this.K);
                v(this.f2767t, 0, false, true);
                this.f2767t = -1;
                this.H = null;
                this.K = null;
            } else if (z11) {
                requestLayout();
            } else {
                q();
            }
        }
        ArrayList arrayList2 = this.f2774z0;
        if (arrayList2 == null || arrayList2.isEmpty()) {
            return;
        }
        int size = this.f2774z0.size();
        for (int i13 = 0; i13 < size; i13++) {
            ((i) this.f2774z0.get(i13)).a(this, aVar3, aVar);
        }
    }

    public void setCurrentItem(int i11) {
        this.f2743a0 = false;
        v(i11, 0, !this.f2768t0, false);
    }

    public void setOffscreenPageLimit(int i11) {
        if (i11 < 1) {
            i11 = 1;
        }
        if (i11 != this.f2745b0) {
            this.f2745b0 = i11;
            q();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(j jVar) {
        this.f2772x0 = jVar;
    }

    public void setPageMargin(int i11) {
        int i12 = this.O;
        this.O = i11;
        int width = getWidth();
        s(width, width, i11, i12);
        requestLayout();
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.P = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setScrollState(int i11) {
        if (this.F0 == i11) {
            return;
        }
        this.F0 = i11;
        if (this.A0 != null) {
            boolean z11 = i11 != 0;
            int childCount = getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                getChildAt(i12).setLayerType(z11 ? this.B0 : 0, null);
            }
        }
        j jVar = this.f2772x0;
        if (jVar != null) {
            jVar.onPageScrollStateChanged(i11);
        }
        ArrayList arrayList = this.f2771w0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i13 = 0; i13 < size; i13++) {
                j jVar2 = (j) this.f2771w0.get(i13);
                if (jVar2 != null) {
                    jVar2.onPageScrollStateChanged(i11);
                }
            }
        }
        j jVar3 = this.f2773y0;
        if (jVar3 != null) {
            jVar3.onPageScrollStateChanged(i11);
        }
    }

    public final boolean t() {
        this.f2759l0 = -1;
        this.f2747c0 = false;
        this.f2749d0 = false;
        VelocityTracker velocityTracker = this.f2760m0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f2760m0 = null;
        }
        this.f2765r0.onRelease();
        this.f2766s0.onRelease();
        return this.f2765r0.isFinished() || this.f2766s0.isFinished();
    }

    public final void u(int i11, int i12, boolean z11, boolean z12) {
        int iMax;
        int scrollX;
        int iAbs;
        g gVarJ = j(i11);
        if (gVarJ != null) {
            iMax = (int) (Math.max(this.S, Math.min(gVarJ.f52892e, this.T)) * getClientWidth());
        } else {
            iMax = 0;
        }
        if (!z11) {
            if (z12) {
                f(i11);
            }
            d(false);
            scrollTo(iMax, 0);
            o(iMax);
            return;
        }
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
        } else {
            Scroller scroller = this.L;
            if (scroller == null || scroller.isFinished()) {
                scrollX = getScrollX();
            } else {
                scrollX = this.M ? this.L.getCurrX() : this.L.getStartX();
                this.L.abortAnimation();
                setScrollingCacheEnabled(false);
            }
            int i13 = scrollX;
            int scrollY = getScrollY();
            int i14 = iMax - i13;
            int i15 = 0 - scrollY;
            if (i14 == 0 && i15 == 0) {
                d(false);
                q();
                setScrollState(0);
            } else {
                setScrollingCacheEnabled(true);
                setScrollState(2);
                int clientWidth = getClientWidth();
                int i16 = clientWidth / 2;
                float f5 = clientWidth;
                float f11 = i16;
                float fSin = (((float) Math.sin((Math.min(1.0f, (Math.abs(i14) * 1.0f) / f5) - 0.5f) * 0.47123894f)) * f11) + f11;
                int iAbs2 = Math.abs(i12);
                if (iAbs2 > 0) {
                    iAbs = Math.round(Math.abs(fSin / iAbs2) * 1000.0f) * 4;
                } else {
                    this.f2750e.getClass();
                    iAbs = (int) (((Math.abs(i14) / ((f5 * 1.0f) + this.O)) + 1.0f) * 100.0f);
                }
                int iMin = Math.min(iAbs, 600);
                this.M = false;
                this.L.startScroll(i13, scrollY, i14, i15, iMin);
                WeakHashMap weakHashMap = s0.f58893a;
                postInvalidateOnAnimation();
            }
        }
        if (z12) {
            f(i11);
        }
    }

    public final void v(int i11, int i12, boolean z11, boolean z12) {
        a aVar = this.f2750e;
        if (aVar == null || aVar.c() <= 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        ArrayList arrayList = this.f2744b;
        if (!z12 && this.f2752f == i11 && arrayList.size() != 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (i11 < 0) {
            i11 = 0;
        } else if (i11 >= this.f2750e.c()) {
            i11 = this.f2750e.c() - 1;
        }
        int i13 = this.f2745b0;
        int i14 = this.f2752f;
        if (i11 > i14 + i13 || i11 < i14 - i13) {
            for (int i15 = 0; i15 < arrayList.size(); i15++) {
                ((g) arrayList.get(i15)).f52890c = true;
            }
        }
        boolean z13 = this.f2752f != i11;
        if (!this.f2768t0) {
            r(i11);
            u(i11, i12, z11, z13);
        } else {
            this.f2752f = i11;
            if (z13) {
                f(i11);
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.P;
    }

    public final void w(k kVar) {
        boolean z11 = this.A0 == null;
        this.A0 = kVar;
        setChildrenDrawingOrderEnabled(true);
        this.C0 = 1;
        this.B0 = 2;
        if (z11) {
            q();
        }
    }

    public final void x() {
        if (this.C0 != 0) {
            ArrayList arrayList = this.D0;
            if (arrayList == null) {
                this.D0 = new ArrayList();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                this.D0.add(getChildAt(i11));
            }
            Collections.sort(this.D0, J0);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        h hVar = new h(context, attributeSet);
        hVar.f52895c = CropImageView.DEFAULT_ASPECT_RATIO;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, G0);
        hVar.f52894b = typedArrayObtainStyledAttributes.getInteger(0, 48);
        typedArrayObtainStyledAttributes.recycle();
        return hVar;
    }

    public void setPageMarginDrawable(int i11) {
        setPageMarginDrawable(getContext().getDrawable(i11));
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2744b = new ArrayList();
        this.f2746c = new g();
        this.f2748d = new Rect();
        this.f2767t = -1;
        this.H = null;
        this.K = null;
        this.S = -3.4028235E38f;
        this.T = Float.MAX_VALUE;
        this.f2745b0 = 1;
        this.f2759l0 = -1;
        this.f2768t0 = true;
        this.E0 = new b(this, 5);
        this.F0 = 0;
        k();
    }
}
