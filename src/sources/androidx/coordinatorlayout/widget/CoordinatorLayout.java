package androidx.coordinatorlayout.widget;

import a9.e;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;
import gu.g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import l4.a;
import l4.b;
import l4.c;
import l4.f;
import l4.h;
import ob.i;
import y.t0;
import y4.d;
import z4.h0;
import z4.j0;
import z4.s;
import z4.s0;
import z4.t;
import z4.v1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements s, t {
    public static final String V;
    public static final Class[] W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final ThreadLocal f1377a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final g f1378b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final d f1379c0;
    public boolean H;
    public final int[] K;
    public View L;
    public View M;
    public f N;
    public boolean O;
    public v1 P;
    public boolean Q;
    public Drawable R;
    public ViewGroup.OnHierarchyChangeListener S;
    public l.s T;
    public final e U;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f1380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f1381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f1382c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f1383d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int[] f1384e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f1385f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f1386t;

    static {
        Package r9 = CoordinatorLayout.class.getPackage();
        V = r9 != null ? r9.getName() : null;
        f1378b0 = new g(3);
        W = new Class[]{Context.class, AttributeSet.class};
        f1377a0 = new ThreadLocal();
        f1379c0 = new d(12);
    }

    public CoordinatorLayout(Context context) {
        this(context, null);
    }

    public static void A(View view, int i11) {
        l4.e eVar = (l4.e) view.getLayoutParams();
        int i12 = eVar.f39725j;
        if (i12 != i11) {
            WeakHashMap weakHashMap = s0.f58893a;
            view.offsetTopAndBottom(i11 - i12);
            eVar.f39725j = i11;
        }
    }

    public static Rect k() {
        Rect rect = (Rect) f1379c0.acquire();
        return rect == null ? new Rect() : rect;
    }

    public static void q(int i11, Rect rect, Rect rect2, l4.e eVar, int i12, int i13) {
        int iWidth;
        int iHeight;
        int i14 = eVar.f39718c;
        if (i14 == 0) {
            i14 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i14, i11);
        int i15 = eVar.f39719d;
        if ((i15 & 7) == 0) {
            i15 |= 8388611;
        }
        if ((i15 & 112) == 0) {
            i15 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i15, i11);
        int i16 = absoluteGravity & 7;
        int i17 = absoluteGravity & 112;
        int i18 = absoluteGravity2 & 7;
        int i19 = absoluteGravity2 & 112;
        if (i18 != 1) {
            iWidth = i18 != 5 ? rect.left : rect.right;
        } else {
            iWidth = rect.left + (rect.width() / 2);
        }
        if (i19 != 16) {
            iHeight = i19 != 80 ? rect.top : rect.bottom;
        } else {
            iHeight = rect.top + (rect.height() / 2);
        }
        if (i16 == 1) {
            iWidth -= i12 / 2;
        } else if (i16 != 5) {
            iWidth -= i12;
        }
        if (i17 == 16) {
            iHeight -= i13 / 2;
        } else if (i17 != 80) {
            iHeight -= i13;
        }
        rect2.set(iWidth, iHeight, i12 + iWidth, i13 + iHeight);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static l4.e r(View view) {
        l4.e eVar = (l4.e) view.getLayoutParams();
        if (!eVar.f39717b) {
            if (view instanceof a) {
                eVar.b(((a) view).getBehavior());
                eVar.f39717b = true;
                return eVar;
            }
            c cVar = null;
            for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                cVar = (c) superclass.getAnnotation(c.class);
                if (cVar != null) {
                    break;
                }
            }
            if (cVar != null) {
                try {
                    eVar.b((b) cVar.value().getDeclaredConstructor(null).newInstance(null));
                } catch (Exception unused) {
                    cVar.value().getClass();
                }
            }
            eVar.f39717b = true;
        }
        return eVar;
    }

    public static void z(View view, int i11) {
        l4.e eVar = (l4.e) view.getLayoutParams();
        int i12 = eVar.f39724i;
        if (i12 != i11) {
            WeakHashMap weakHashMap = s0.f58893a;
            view.offsetLeftAndRight(i11 - i12);
            eVar.f39724i = i11;
        }
    }

    public final void B() {
        WeakHashMap weakHashMap = s0.f58893a;
        if (!getFitsSystemWindows()) {
            j0.m(this, null);
            return;
        }
        if (this.T == null) {
            this.T = new l.s(this, 1);
        }
        j0.m(this, this.T);
        setSystemUiVisibility(1280);
    }

    @Override // z4.t
    public final void c(View view, int i11, int i12, int i13, int i14, int i15, int[] iArr) {
        b bVar;
        int childCount = getChildCount();
        int iMax = 0;
        int iMax2 = 0;
        boolean z11 = false;
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = getChildAt(i16);
            if (childAt.getVisibility() != 8) {
                l4.e eVar = (l4.e) childAt.getLayoutParams();
                if (eVar.a(i15) && (bVar = eVar.f39716a) != null) {
                    int[] iArr2 = this.f1384e;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    bVar.r(this, childAt, i12, i13, i14, iArr2);
                    iMax = i13 > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
                    iMax2 = i14 > 0 ? Math.max(iMax2, iArr2[1]) : Math.min(iMax2, iArr2[1]);
                    z11 = true;
                }
            }
        }
        iArr[0] = iArr[0] + iMax;
        iArr[1] = iArr[1] + iMax2;
        if (z11) {
            t(1);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof l4.e) && super.checkLayoutParams(layoutParams);
    }

    @Override // z4.s
    public final void d(View view, int i11, int i12, int i13, int i14, int i15) {
        c(view, i11, i12, i13, i14, 0, this.f1385f);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j11) {
        b bVar = ((l4.e) view.getLayoutParams()).f39716a;
        if (bVar != null) {
            bVar.getClass();
        }
        return super.drawChild(canvas, view, j11);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.R;
        if ((drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState)) {
            invalidate();
        }
    }

    @Override // z4.s
    public final boolean f(View view, View view2, int i11, int i12) {
        int childCount = getChildCount();
        boolean z11 = false;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                l4.e eVar = (l4.e) childAt.getLayoutParams();
                b bVar = eVar.f39716a;
                if (bVar != null) {
                    boolean zV = bVar.v(this, childAt, view, view2, i11, i12);
                    z11 |= zV;
                    if (i12 == 0) {
                        eVar.m = zV;
                    } else if (i12 == 1) {
                        eVar.f39728n = zV;
                    }
                } else if (i12 == 0) {
                    eVar.m = false;
                } else if (i12 == 1) {
                    eVar.f39728n = false;
                }
            }
        }
        return z11;
    }

    @Override // z4.s
    public final void g(View view, View view2, int i11, int i12) {
        e eVar = this.U;
        if (i12 == 1) {
            eVar.f479c = i11;
        } else {
            eVar.f478b = i11;
        }
        this.M = view2;
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            ((l4.e) getChildAt(i13).getLayoutParams()).getClass();
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new l4.e();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new l4.e(getContext(), attributeSet);
    }

    public final List<View> getDependencySortedChildren() {
        x();
        return Collections.unmodifiableList(this.f1380a);
    }

    public final v1 getLastWindowInsets() {
        return this.P;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        e eVar = this.U;
        return eVar.f479c | eVar.f478b;
    }

    public Drawable getStatusBarBackground() {
        return this.R;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    @Override // z4.s
    public final void h(View view, int i11) {
        e eVar = this.U;
        if (i11 == 1) {
            eVar.f479c = 0;
        } else {
            eVar.f478b = 0;
        }
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            l4.e eVar2 = (l4.e) childAt.getLayoutParams();
            if (eVar2.a(i11)) {
                b bVar = eVar2.f39716a;
                if (bVar != null) {
                    bVar.w(this, childAt, view, i11);
                }
                if (i11 == 0) {
                    eVar2.m = false;
                } else if (i11 == 1) {
                    eVar2.f39728n = false;
                }
                eVar2.f39729o = false;
            }
        }
        this.M = null;
    }

    @Override // z4.s
    public final void i(View view, int i11, int i12, int[] iArr, int i13) {
        b bVar;
        int childCount = getChildCount();
        boolean z11 = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                l4.e eVar = (l4.e) childAt.getLayoutParams();
                if (eVar.a(i13) && (bVar = eVar.f39716a) != null) {
                    int[] iArr2 = this.f1384e;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    bVar.q(this, childAt, view, i11, i12, iArr2, i13);
                    iMax = i11 > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
                    iMax2 = i12 > 0 ? Math.max(iMax2, iArr2[1]) : Math.min(iMax2, iArr2[1]);
                    z11 = true;
                }
            }
        }
        iArr[0] = iMax;
        iArr[1] = iMax2;
        if (z11) {
            t(1);
        }
    }

    public final void l(l4.e eVar, Rect rect, int i11, int i12) {
        int width = getWidth();
        int height = getHeight();
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i11) - ((ViewGroup.MarginLayoutParams) eVar).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) eVar).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i12) - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin));
        rect.set(iMax, iMax2, i11 + iMax, i12 + iMax2);
    }

    public final void m(View view) {
        List list = (List) ((t0) this.f1381b.f44814c).get(view);
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i11 = 0; i11 < list.size(); i11++) {
            View view2 = (View) list.get(i11);
            b bVar = ((l4.e) view2.getLayoutParams()).f39716a;
            if (bVar != null) {
                bVar.j(this, view2, view);
            }
        }
    }

    public final void n(View view, Rect rect, boolean z11) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z11) {
            p(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    public final ArrayList o(View view) {
        t0 t0Var = (t0) this.f1381b.f44814c;
        int i11 = t0Var.f56767c;
        ArrayList arrayList = null;
        for (int i12 = 0; i12 < i11; i12++) {
            ArrayList arrayList2 = (ArrayList) t0Var.j(i12);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(t0Var.f(i12));
            }
        }
        ArrayList arrayList3 = this.f1383d;
        arrayList3.clear();
        if (arrayList != null) {
            arrayList3.addAll(arrayList);
        }
        return arrayList3;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        y(false);
        if (this.O) {
            if (this.N == null) {
                this.N = new f(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.N);
        }
        if (this.P == null) {
            WeakHashMap weakHashMap = s0.f58893a;
            if (getFitsSystemWindows()) {
                h0.c(this);
            }
        }
        this.H = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        y(false);
        if (this.O && this.N != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.N);
        }
        View view = this.M;
        if (view != null) {
            h(view, 0);
        }
        this.H = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.Q || this.R == null) {
            return;
        }
        v1 v1Var = this.P;
        int iD = v1Var != null ? v1Var.d() : 0;
        if (iD > 0) {
            this.R.setBounds(0, 0, getWidth(), iD);
            this.R.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            y(true);
        }
        boolean zW = w(motionEvent, 0);
        if (actionMasked != 1 && actionMasked != 3) {
            return zW;
        }
        y(true);
        return zW;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        b bVar;
        WeakHashMap weakHashMap = s0.f58893a;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList = this.f1380a;
        int size = arrayList.size();
        for (int i15 = 0; i15 < size; i15++) {
            View view = (View) arrayList.get(i15);
            if (view.getVisibility() != 8 && ((bVar = ((l4.e) view.getLayoutParams()).f39716a) == null || !bVar.n(this, view, layoutDirection))) {
                u(view, layoutDirection);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:62:0x0106  */
    /* JADX WARN: Code duplicated, block: B:71:0x0126 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:72:0x0128  */
    /* JADX WARN: Code duplicated, block: B:80:0x013f  */
    /* JADX WARN: Code duplicated, block: B:83:0x016f  */
    /* JADX WARN: Code duplicated, block: B:86:0x0177  */
    /* JADX WARN: Code duplicated, block: B:89:0x019e  */
    /* JADX WARN: Code duplicated, block: B:90:0x01a1  */
    @Override // android.view.View
    public final void onMeasure(int i11, int i12) {
        boolean z11;
        int i13;
        ArrayList arrayList;
        int iMax;
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        b bVar;
        int i14;
        View view;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i21;
        boolean z12;
        boolean zO;
        int i22;
        int i23;
        int absoluteGravity;
        CoordinatorLayout coordinatorLayout = this;
        coordinatorLayout.x();
        int childCount = coordinatorLayout.getChildCount();
        int i24 = 0;
        loop0: while (true) {
            if (i24 >= childCount) {
                z11 = false;
                break;
            }
            View childAt = coordinatorLayout.getChildAt(i24);
            t0 t0Var = (t0) coordinatorLayout.f1381b.f44814c;
            int i25 = t0Var.f56767c;
            for (int i26 = 0; i26 < i25; i26++) {
                ArrayList arrayList2 = (ArrayList) t0Var.j(i26);
                if (arrayList2 != null && arrayList2.contains(childAt)) {
                    z11 = true;
                    break loop0;
                }
            }
            i24++;
        }
        if (z11 != coordinatorLayout.O) {
            if (z11) {
                if (coordinatorLayout.H) {
                    if (coordinatorLayout.N == null) {
                        coordinatorLayout.N = new f(coordinatorLayout);
                    }
                    coordinatorLayout.getViewTreeObserver().addOnPreDrawListener(coordinatorLayout.N);
                }
                coordinatorLayout.O = true;
            } else {
                if (coordinatorLayout.H && coordinatorLayout.N != null) {
                    coordinatorLayout.getViewTreeObserver().removeOnPreDrawListener(coordinatorLayout.N);
                }
                coordinatorLayout.O = false;
            }
        }
        int paddingLeft = coordinatorLayout.getPaddingLeft();
        int paddingTop = coordinatorLayout.getPaddingTop();
        int paddingRight = coordinatorLayout.getPaddingRight();
        int paddingBottom = coordinatorLayout.getPaddingBottom();
        WeakHashMap weakHashMap = s0.f58893a;
        int layoutDirection = coordinatorLayout.getLayoutDirection();
        boolean z13 = layoutDirection == 1;
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i12);
        int size2 = View.MeasureSpec.getSize(i12);
        int i27 = paddingLeft + paddingRight;
        int i28 = paddingTop + paddingBottom;
        int suggestedMinimumWidth = coordinatorLayout.getSuggestedMinimumWidth();
        int suggestedMinimumHeight = coordinatorLayout.getSuggestedMinimumHeight();
        boolean z14 = coordinatorLayout.P != null && coordinatorLayout.getFitsSystemWindows();
        ArrayList arrayList3 = coordinatorLayout.f1380a;
        int size3 = arrayList3.size();
        int i29 = 0;
        int iCombineMeasuredStates = 0;
        while (i29 < size3) {
            View view2 = (View) arrayList3.get(i29);
            int i30 = suggestedMinimumWidth;
            if (view2.getVisibility() == 8) {
                arrayList = arrayList3;
                i15 = size3;
                i21 = i29;
                i18 = paddingRight;
                suggestedMinimumWidth = i30;
                z12 = false;
                i16 = paddingLeft;
            } else {
                l4.e eVar = (l4.e) view2.getLayoutParams();
                int i31 = eVar.f39720e;
                if (i31 < 0 || mode == 0) {
                    i13 = suggestedMinimumHeight;
                    arrayList = arrayList3;
                } else {
                    i13 = suggestedMinimumHeight;
                    int[] iArr = coordinatorLayout.K;
                    if (iArr == null) {
                        coordinatorLayout.toString();
                        arrayList = arrayList3;
                    } else {
                        arrayList = arrayList3;
                        if (i31 < 0 || i31 >= iArr.length) {
                            coordinatorLayout.toString();
                        } else {
                            i22 = iArr[i31];
                        }
                        i23 = eVar.f39718c;
                        if (i23 == 0) {
                            i23 = 8388661;
                        }
                        absoluteGravity = Gravity.getAbsoluteGravity(i23, layoutDirection) & 7;
                        if (!(absoluteGravity == 3 || z13) || (absoluteGravity == 5 && z13)) {
                            iMax = Math.max(0, (size - paddingRight) - i22);
                        } else if ((absoluteGravity != 5 && !z13) || (absoluteGravity == 3 && z13)) {
                            iMax = Math.max(0, i22 - paddingLeft);
                        }
                        if (z14 || view2.getFitsSystemWindows()) {
                            iMakeMeasureSpec = i11;
                            iMakeMeasureSpec2 = i12;
                        } else {
                            int iC = coordinatorLayout.P.c() + coordinatorLayout.P.b();
                            int iA = coordinatorLayout.P.a() + coordinatorLayout.P.d();
                            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size - iC, mode);
                            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size2 - iA, mode2);
                        }
                        bVar = eVar.f39716a;
                        if (bVar != null) {
                            int i32 = iMax;
                            int i33 = iMakeMeasureSpec;
                            i15 = size3;
                            i16 = paddingLeft;
                            i17 = i30;
                            int i34 = i13;
                            i18 = paddingRight;
                            i19 = i34;
                            z12 = false;
                            i21 = i29;
                            int i35 = iMakeMeasureSpec2;
                            zO = bVar.o(this, view2, i33, i32, i35);
                            view = view2;
                            iMakeMeasureSpec = i33;
                            iMax = i32;
                            i14 = i35;
                            if (zO) {
                                coordinatorLayout = this;
                            }
                            int iMax2 = Math.max(i17, view.getMeasuredWidth() + i27 + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
                            int iMax3 = Math.max(i19, view.getMeasuredHeight() + i28 + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
                            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                            suggestedMinimumWidth = iMax2;
                            suggestedMinimumHeight = iMax3;
                        } else {
                            int i36 = size3;
                            i14 = iMakeMeasureSpec2;
                            view = view2;
                            i15 = i36;
                            i16 = paddingLeft;
                            i17 = i30;
                            int i37 = i13;
                            i18 = paddingRight;
                            i19 = i37;
                            i21 = i29;
                            z12 = false;
                        }
                        coordinatorLayout = this;
                        coordinatorLayout.measureChildWithMargins(view, iMakeMeasureSpec, iMax, i14, 0);
                        int iMax4 = Math.max(i17, view.getMeasuredWidth() + i27 + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
                        int iMax5 = Math.max(i19, view.getMeasuredHeight() + i28 + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
                        iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                        suggestedMinimumWidth = iMax4;
                        suggestedMinimumHeight = iMax5;
                    }
                    i22 = 0;
                    i23 = eVar.f39718c;
                    if (i23 == 0) {
                        i23 = 8388661;
                    }
                    absoluteGravity = Gravity.getAbsoluteGravity(i23, layoutDirection) & 7;
                    if (absoluteGravity == 3) {
                        if (absoluteGravity != 5) {
                        }
                    } else if (absoluteGravity != 5) {
                    }
                    if (z14) {
                        iMakeMeasureSpec = i11;
                        iMakeMeasureSpec2 = i12;
                    } else {
                        iMakeMeasureSpec = i11;
                        iMakeMeasureSpec2 = i12;
                    }
                    bVar = eVar.f39716a;
                    if (bVar != null) {
                        int i38 = iMax;
                        int i39 = iMakeMeasureSpec;
                        i15 = size3;
                        i16 = paddingLeft;
                        i17 = i30;
                        int i310 = i13;
                        i18 = paddingRight;
                        i19 = i310;
                        z12 = false;
                        i21 = i29;
                        int i311 = iMakeMeasureSpec2;
                        zO = bVar.o(this, view2, i39, i38, i311);
                        view = view2;
                        iMakeMeasureSpec = i39;
                        iMax = i38;
                        i14 = i311;
                        if (zO) {
                            coordinatorLayout = this;
                        }
                        int iMax6 = Math.max(i17, view.getMeasuredWidth() + i27 + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
                        int iMax7 = Math.max(i19, view.getMeasuredHeight() + i28 + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
                        iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                        suggestedMinimumWidth = iMax6;
                        suggestedMinimumHeight = iMax7;
                    } else {
                        int i312 = size3;
                        i14 = iMakeMeasureSpec2;
                        view = view2;
                        i15 = i312;
                        i16 = paddingLeft;
                        i17 = i30;
                        int i313 = i13;
                        i18 = paddingRight;
                        i19 = i313;
                        i21 = i29;
                        z12 = false;
                    }
                    coordinatorLayout = this;
                    coordinatorLayout.measureChildWithMargins(view, iMakeMeasureSpec, iMax, i14, 0);
                    int iMax8 = Math.max(i17, view.getMeasuredWidth() + i27 + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
                    int iMax9 = Math.max(i19, view.getMeasuredHeight() + i28 + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                    suggestedMinimumWidth = iMax8;
                    suggestedMinimumHeight = iMax9;
                }
                iMax = 0;
                if (z14) {
                    iMakeMeasureSpec = i11;
                    iMakeMeasureSpec2 = i12;
                } else {
                    iMakeMeasureSpec = i11;
                    iMakeMeasureSpec2 = i12;
                }
                bVar = eVar.f39716a;
                if (bVar != null) {
                    int i314 = iMax;
                    int i315 = iMakeMeasureSpec;
                    i15 = size3;
                    i16 = paddingLeft;
                    i17 = i30;
                    int i316 = i13;
                    i18 = paddingRight;
                    i19 = i316;
                    z12 = false;
                    i21 = i29;
                    int i317 = iMakeMeasureSpec2;
                    zO = bVar.o(this, view2, i315, i314, i317);
                    view = view2;
                    iMakeMeasureSpec = i315;
                    iMax = i314;
                    i14 = i317;
                    if (zO) {
                        coordinatorLayout = this;
                    }
                    int iMax10 = Math.max(i17, view.getMeasuredWidth() + i27 + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
                    int iMax11 = Math.max(i19, view.getMeasuredHeight() + i28 + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                    suggestedMinimumWidth = iMax10;
                    suggestedMinimumHeight = iMax11;
                } else {
                    int i318 = size3;
                    i14 = iMakeMeasureSpec2;
                    view = view2;
                    i15 = i318;
                    i16 = paddingLeft;
                    i17 = i30;
                    int i319 = i13;
                    i18 = paddingRight;
                    i19 = i319;
                    i21 = i29;
                    z12 = false;
                }
                coordinatorLayout = this;
                coordinatorLayout.measureChildWithMargins(view, iMakeMeasureSpec, iMax, i14, 0);
                int iMax12 = Math.max(i17, view.getMeasuredWidth() + i27 + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
                int iMax13 = Math.max(i19, view.getMeasuredHeight() + i28 + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                suggestedMinimumWidth = iMax12;
                suggestedMinimumHeight = iMax13;
            }
            i29 = i21 + 1;
            size3 = i15;
            paddingLeft = i16;
            paddingRight = i18;
            arrayList3 = arrayList;
        }
        int i40 = iCombineMeasuredStates;
        coordinatorLayout.setMeasuredDimension(View.resolveSizeAndState(suggestedMinimumWidth, i11, (-16777216) & i40), View.resolveSizeAndState(suggestedMinimumHeight, i12, i40 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f5, float f11, boolean z11) {
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                l4.e eVar = (l4.e) childAt.getLayoutParams();
                if (eVar.a(0)) {
                    b bVar = eVar.f39716a;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f5, float f11) {
        b bVar;
        int childCount = getChildCount();
        boolean zP = false;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                l4.e eVar = (l4.e) childAt.getLayoutParams();
                if (eVar.a(0) && (bVar = eVar.f39716a) != null) {
                    zP |= bVar.p(view);
                }
            }
        }
        return zP;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i11, int i12, int[] iArr) {
        i(view, i11, i12, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i11, int i12, int i13, int i14) {
        d(view, i11, i12, i13, i14, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i11) {
        g(view, view2, i11, 0);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof l4.g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        l4.g gVar = (l4.g) parcelable;
        super.onRestoreInstanceState(gVar.f37910a);
        SparseArray sparseArray = gVar.f39733c;
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            int id2 = childAt.getId();
            b bVar = r(childAt).f39716a;
            if (id2 != -1 && bVar != null && (parcelable2 = (Parcelable) sparseArray.get(id2)) != null) {
                bVar.t(childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableU;
        l4.g gVar = new l4.g(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            int id2 = childAt.getId();
            b bVar = ((l4.e) childAt.getLayoutParams()).f39716a;
            if (id2 != -1 && bVar != null && (parcelableU = bVar.u(childAt)) != null) {
                sparseArray.append(id2, parcelableU);
            }
        }
        gVar.f39733c = sparseArray;
        return gVar;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i11) {
        return f(view, view2, i11, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        h(view, 0);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002f  */
    /* JADX WARN: Code duplicated, block: B:15:0x0035 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0037  */
    /* JADX WARN: Code duplicated, block: B:18:0x004a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015 A[PHI: r3
      0x0015: PHI (r3v4 boolean) = (r3v2 boolean), (r3v5 boolean) binds: [B:10:0x0022, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zW;
        boolean zX;
        MotionEvent motionEventObtain;
        int actionMasked = motionEvent.getActionMasked();
        if (this.L == null) {
            zW = w(motionEvent, 1);
            if (!zW) {
                zX = false;
            }
            motionEventObtain = null;
            if (this.L == null) {
                zX |= super.onTouchEvent(motionEvent);
            } else if (zW) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 0);
                super.onTouchEvent(motionEventObtain);
            }
            if (motionEventObtain != null) {
                motionEventObtain.recycle();
            }
            if (actionMasked == 1 && actionMasked != 3) {
                return zX;
            }
            y(false);
            return zX;
        }
        zW = false;
        b bVar = ((l4.e) this.L.getLayoutParams()).f39716a;
        if (bVar != null) {
            zX = bVar.x(this, this.L, motionEvent);
        } else {
            zX = false;
        }
        motionEventObtain = null;
        if (this.L == null) {
            zX |= super.onTouchEvent(motionEvent);
        } else if (zW) {
            long jUptimeMillis2 = SystemClock.uptimeMillis();
            motionEventObtain = MotionEvent.obtain(jUptimeMillis2, jUptimeMillis2, 3, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 0);
            super.onTouchEvent(motionEventObtain);
        }
        if (motionEventObtain != null) {
            motionEventObtain.recycle();
        }
        if (actionMasked == 1) {
        }
        y(false);
        return zX;
    }

    public final void p(View view, Rect rect) {
        ThreadLocal threadLocal = h.f39734a;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal threadLocal2 = h.f39734a;
        Matrix matrix = (Matrix) threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        h.a(this, view, matrix);
        ThreadLocal threadLocal3 = h.f39735b;
        RectF rectF = (RectF) threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z11) {
        b bVar = ((l4.e) view.getLayoutParams()).f39716a;
        if (bVar == null || !bVar.s(this, view, rect, z11)) {
            return super.requestChildRectangleOnScreen(view, rect, z11);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z11) {
        super.requestDisallowInterceptTouchEvent(z11);
        if (!z11 || this.f1386t) {
            return;
        }
        y(false);
        this.f1386t = true;
    }

    public final boolean s(View view, int i11, int i12) {
        d dVar = f1379c0;
        Rect rectK = k();
        p(view, rectK);
        try {
            return rectK.contains(i11, i12);
        } finally {
            rectK.setEmpty();
            dVar.c(rectK);
        }
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z11) {
        super.setFitsSystemWindows(z11);
        B();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.S = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.R;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.R = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.R.setState(getDrawableState());
                }
                Drawable drawable3 = this.R;
                WeakHashMap weakHashMap = s0.f58893a;
                drawable3.setLayoutDirection(getLayoutDirection());
                this.R.setVisible(getVisibility() == 0, false);
                this.R.setCallback(this);
            }
            WeakHashMap weakHashMap2 = s0.f58893a;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarBackgroundColor(int i11) {
        setStatusBarBackground(new ColorDrawable(i11));
    }

    public void setStatusBarBackgroundResource(int i11) {
        setStatusBarBackground(i11 != 0 ? getContext().getDrawable(i11) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i11) {
        super.setVisibility(i11);
        boolean z11 = i11 == 0;
        Drawable drawable = this.R;
        if (drawable == null || drawable.isVisible() == z11) {
            return;
        }
        this.R.setVisible(z11, false);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00de  */
    public final void t(int i11) {
        int i12;
        Rect rect;
        int i13;
        ArrayList arrayList;
        boolean zJ;
        boolean z11;
        boolean z12;
        int width;
        int i14;
        int i15;
        int i16;
        int height;
        int i17;
        int i18;
        int i19;
        l4.e eVar;
        int i21;
        View view;
        b bVar;
        WeakHashMap weakHashMap = s0.f58893a;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList2 = this.f1380a;
        int size = arrayList2.size();
        Rect rectK = k();
        Rect rectK2 = k();
        Rect rectK3 = k();
        int i22 = 0;
        while (true) {
            d dVar = f1379c0;
            if (i22 >= size) {
                Rect rect2 = rectK3;
                rectK.setEmpty();
                dVar.c(rectK);
                rectK2.setEmpty();
                dVar.c(rectK2);
                rect2.setEmpty();
                dVar.c(rect2);
                return;
            }
            View view2 = (View) arrayList2.get(i22);
            l4.e eVar2 = (l4.e) view2.getLayoutParams();
            if (i11 != 0 || view2.getVisibility() != 8) {
                int i23 = 0;
                while (i23 < i22) {
                    if (eVar2.f39727l == ((View) arrayList2.get(i23))) {
                        l4.e eVar3 = (l4.e) view2.getLayoutParams();
                        if (eVar3.f39726k != null) {
                            Rect rectK4 = k();
                            Rect rectK5 = k();
                            l4.e eVar4 = eVar2;
                            Rect rectK6 = k();
                            p(eVar3.f39726k, rectK4);
                            n(view2, rectK5, false);
                            int measuredWidth = view2.getMeasuredWidth();
                            View view3 = view2;
                            int measuredHeight = view3.getMeasuredHeight();
                            eVar = eVar4;
                            i21 = i23;
                            layoutDirection = layoutDirection;
                            view = view3;
                            q(layoutDirection, rectK4, rectK6, eVar3, measuredWidth, measuredHeight);
                            boolean z13 = (rectK6.left == rectK5.left && rectK6.top == rectK5.top) ? false : true;
                            l(eVar3, rectK6, measuredWidth, measuredHeight);
                            int i24 = rectK6.left - rectK5.left;
                            int i25 = rectK6.top - rectK5.top;
                            if (i24 != 0) {
                                WeakHashMap weakHashMap2 = s0.f58893a;
                                view.offsetLeftAndRight(i24);
                            }
                            if (i25 != 0) {
                                WeakHashMap weakHashMap3 = s0.f58893a;
                                view.offsetTopAndBottom(i25);
                            }
                            if (z13 && (bVar = eVar3.f39716a) != null) {
                                bVar.j(this, view, eVar3.f39726k);
                            }
                            rectK4.setEmpty();
                            dVar.c(rectK4);
                            rectK5.setEmpty();
                            dVar.c(rectK5);
                            rectK6.setEmpty();
                            dVar.c(rectK6);
                        } else {
                            eVar = eVar2;
                            i21 = i23;
                            view = view2;
                        }
                    } else {
                        eVar = eVar2;
                        i21 = i23;
                        view = view2;
                    }
                    i23 = i21 + 1;
                    eVar2 = eVar;
                    view2 = view;
                    arrayList2 = arrayList2;
                    size = size;
                    i22 = i22;
                    rectK3 = rectK3;
                }
                ArrayList arrayList3 = arrayList2;
                l4.e eVar5 = eVar2;
                int i26 = size;
                Rect rect3 = rectK3;
                i12 = i22;
                View view4 = view2;
                n(view4, rectK2, true);
                if (eVar5.f39722g != 0 && !rectK2.isEmpty()) {
                    int absoluteGravity = Gravity.getAbsoluteGravity(eVar5.f39722g, layoutDirection);
                    int i27 = absoluteGravity & 112;
                    if (i27 == 48) {
                        rectK.top = Math.max(rectK.top, rectK2.bottom);
                    } else if (i27 == 80) {
                        rectK.bottom = Math.max(rectK.bottom, getHeight() - rectK2.top);
                    }
                    int i28 = absoluteGravity & 7;
                    if (i28 == 3) {
                        rectK.left = Math.max(rectK.left, rectK2.right);
                    } else if (i28 == 5) {
                        rectK.right = Math.max(rectK.right, getWidth() - rectK2.left);
                    }
                }
                if (eVar5.f39723h != 0 && view4.getVisibility() == 0) {
                    WeakHashMap weakHashMap4 = s0.f58893a;
                    if (view4.isLaidOut() && view4.getWidth() > 0 && view4.getHeight() > 0) {
                        l4.e eVar6 = (l4.e) view4.getLayoutParams();
                        b bVar2 = eVar6.f39716a;
                        Rect rectK7 = k();
                        Rect rectK8 = k();
                        rectK8.set(view4.getLeft(), view4.getTop(), view4.getRight(), view4.getBottom());
                        if (bVar2 == null || !bVar2.g(view4, rectK7)) {
                            rectK7.set(rectK8);
                        } else if (!rectK8.contains(rectK7)) {
                            throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + rectK7.toShortString() + " | Bounds:" + rectK8.toShortString());
                        }
                        rectK8.setEmpty();
                        dVar.c(rectK8);
                        if (rectK7.isEmpty()) {
                            rectK7.setEmpty();
                            dVar.c(rectK7);
                        } else {
                            int absoluteGravity2 = Gravity.getAbsoluteGravity(eVar6.f39723h, layoutDirection);
                            if ((absoluteGravity2 & 48) != 48 || (i18 = (rectK7.top - ((ViewGroup.MarginLayoutParams) eVar6).topMargin) - eVar6.f39725j) >= (i19 = rectK.top)) {
                                z11 = false;
                            } else {
                                A(view4, i19 - i18);
                                z11 = true;
                            }
                            if ((absoluteGravity2 & 80) == 80 && (height = ((getHeight() - rectK7.bottom) - ((ViewGroup.MarginLayoutParams) eVar6).bottomMargin) + eVar6.f39725j) < (i17 = rectK.bottom)) {
                                A(view4, height - i17);
                                z11 = true;
                            }
                            if (!z11) {
                                A(view4, 0);
                            }
                            if ((absoluteGravity2 & 3) != 3 || (i15 = (rectK7.left - ((ViewGroup.MarginLayoutParams) eVar6).leftMargin) - eVar6.f39724i) >= (i16 = rectK.left)) {
                                z12 = false;
                            } else {
                                z(view4, i16 - i15);
                                z12 = true;
                            }
                            if ((absoluteGravity2 & 5) == 5 && (width = ((getWidth() - rectK7.right) - ((ViewGroup.MarginLayoutParams) eVar6).rightMargin) + eVar6.f39724i) < (i14 = rectK.right)) {
                                z(view4, width - i14);
                                z12 = true;
                            }
                            if (!z12) {
                                z(view4, 0);
                            }
                            rectK7.setEmpty();
                            dVar.c(rectK7);
                        }
                    }
                }
                if (i11 != 2) {
                    rect = rect3;
                    rect.set(((l4.e) view4.getLayoutParams()).f39730p);
                    if (rect.equals(rectK2)) {
                        arrayList = arrayList3;
                        i13 = i26;
                    } else {
                        ((l4.e) view4.getLayoutParams()).f39730p.set(rectK2);
                    }
                } else {
                    rect = rect3;
                }
                int i29 = i12 + 1;
                i13 = i26;
                while (true) {
                    arrayList = arrayList3;
                    if (i29 >= i13) {
                        break;
                    }
                    View view5 = (View) arrayList.get(i29);
                    l4.e eVar7 = (l4.e) view5.getLayoutParams();
                    b bVar3 = eVar7.f39716a;
                    if (bVar3 != null && bVar3.h(view5, view4)) {
                        if (i11 == 0 && eVar7.f39729o) {
                            eVar7.f39729o = false;
                        } else {
                            if (i11 != 2) {
                                zJ = bVar3.j(this, view5, view4);
                            } else {
                                bVar3.k(this, view4);
                                zJ = true;
                            }
                            if (i11 == 1) {
                                eVar7.f39729o = zJ;
                            }
                        }
                    }
                    i29++;
                    arrayList3 = arrayList;
                }
            } else {
                arrayList = arrayList2;
                i13 = size;
                rect = rectK3;
                i12 = i22;
            }
            i22 = i12 + 1;
            rectK3 = rect;
            size = i13;
            arrayList2 = arrayList;
        }
    }

    public final void u(View view, int i11) {
        int i12;
        l4.e eVar = (l4.e) view.getLayoutParams();
        View view2 = eVar.f39726k;
        if (view2 == null && eVar.f39721f != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        d dVar = f1379c0;
        if (view2 != null) {
            Rect rectK = k();
            Rect rectK2 = k();
            try {
                p(view2, rectK);
                l4.e eVar2 = (l4.e) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                q(i11, rectK, rectK2, eVar2, measuredWidth, measuredHeight);
                l(eVar2, rectK2, measuredWidth, measuredHeight);
                view.layout(rectK2.left, rectK2.top, rectK2.right, rectK2.bottom);
                return;
            } finally {
                rectK.setEmpty();
                dVar.c(rectK);
                rectK2.setEmpty();
                dVar.c(rectK2);
            }
        }
        int i13 = eVar.f39720e;
        if (i13 < 0) {
            l4.e eVar3 = (l4.e) view.getLayoutParams();
            Rect rectK3 = k();
            rectK3.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) eVar3).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) eVar3).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) eVar3).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) eVar3).bottomMargin);
            if (this.P != null) {
                WeakHashMap weakHashMap = s0.f58893a;
                if (getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                    rectK3.left = this.P.b() + rectK3.left;
                    rectK3.top = this.P.d() + rectK3.top;
                    rectK3.right -= this.P.c();
                    rectK3.bottom -= this.P.a();
                }
            }
            Rect rectK4 = k();
            int i14 = eVar3.f39718c;
            if ((i14 & 7) == 0) {
                i14 |= 8388611;
            }
            if ((i14 & 112) == 0) {
                i14 |= 48;
            }
            Gravity.apply(i14, view.getMeasuredWidth(), view.getMeasuredHeight(), rectK3, rectK4, i11);
            view.layout(rectK4.left, rectK4.top, rectK4.right, rectK4.bottom);
            rectK3.setEmpty();
            dVar.c(rectK3);
            rectK4.setEmpty();
            dVar.c(rectK4);
            return;
        }
        l4.e eVar4 = (l4.e) view.getLayoutParams();
        int i15 = eVar4.f39718c;
        if (i15 == 0) {
            i15 = 8388661;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i15, i11);
        int i16 = absoluteGravity & 7;
        int i17 = absoluteGravity & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth2 = view.getMeasuredWidth();
        int measuredHeight2 = view.getMeasuredHeight();
        if (i11 == 1) {
            i13 = width - i13;
        }
        int i18 = 0;
        int[] iArr = this.K;
        if (iArr != null && i13 >= 0 && i13 < iArr.length) {
            i12 = iArr[i13];
        } else {
            toString();
            i12 = 0;
        }
        int i19 = i12 - measuredWidth2;
        if (i16 == 1) {
            i19 += measuredWidth2 / 2;
        } else if (i16 == 5) {
            i19 += measuredWidth2;
        }
        if (i17 == 16) {
            i18 = measuredHeight2 / 2;
        } else if (i17 == 80) {
            i18 = measuredHeight2;
        }
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) eVar4).leftMargin, Math.min(i19, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) eVar4).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) eVar4).topMargin, Math.min(i18, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) eVar4).bottomMargin));
        view.layout(iMax, iMax2, measuredWidth2 + iMax, measuredHeight2 + iMax2);
    }

    public final void v(int i11, int i12, int i13, View view) {
        measureChildWithMargins(view, i11, i12, i13, 0);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.R;
    }

    public final boolean w(MotionEvent motionEvent, int i11) {
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = this.f1382c;
        arrayList.clear();
        boolean zIsChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i12 = childCount - 1; i12 >= 0; i12--) {
            arrayList.add(getChildAt(zIsChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i12) : i12));
        }
        g gVar = f1378b0;
        if (gVar != null) {
            Collections.sort(arrayList, gVar);
        }
        int size = arrayList.size();
        MotionEvent motionEventObtain = null;
        boolean zM = false;
        for (int i13 = 0; i13 < size; i13++) {
            View view = (View) arrayList.get(i13);
            b bVar = ((l4.e) view.getLayoutParams()).f39716a;
            if (zM && actionMasked != 0) {
                if (bVar != null) {
                    if (motionEventObtain == null) {
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 0);
                    }
                    if (i11 == 0) {
                        bVar.m(this, view, motionEventObtain);
                    } else if (i11 == 1) {
                        bVar.x(this, view, motionEventObtain);
                    }
                }
            } else if (!zM && bVar != null) {
                if (i11 == 0) {
                    zM = bVar.m(this, view, motionEvent);
                } else if (i11 == 1) {
                    zM = bVar.x(this, view, motionEvent);
                }
                if (zM) {
                    this.L = view;
                }
            }
        }
        arrayList.clear();
        return zM;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0089 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x007c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x007e  */
    /* JADX WARN: Code duplicated, block: B:34:0x0084  */
    /* JADX WARN: Code duplicated, block: B:37:0x0091  */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:38:0x0095
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    public final void x() {
        /*
            Method dump skipped, instruction units count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.x():void");
    }

    public final void y(boolean z11) {
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            b bVar = ((l4.e) childAt.getLayoutParams()).f39716a;
            if (bVar != null) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 0);
                if (z11) {
                    bVar.m(this, childAt, motionEventObtain);
                } else {
                    bVar.x(this, childAt, motionEventObtain);
                }
                motionEventObtain.recycle();
            }
        }
        for (int i12 = 0; i12 < childCount; i12++) {
            ((l4.e) getChildAt(i12).getLayoutParams()).getClass();
        }
        this.L = null;
        this.f1386t = false;
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.coordinatorLayoutStyle);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof l4.e) {
            return new l4.e((l4.e) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new l4.e((ViewGroup.MarginLayoutParams) layoutParams) : new l4.e(layoutParams);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i11) {
        TypedArray typedArrayObtainStyledAttributes;
        CoordinatorLayout coordinatorLayout;
        Context context2;
        super(context, attributeSet, i11);
        this.f1380a = new ArrayList();
        this.f1381b = new i(5);
        this.f1382c = new ArrayList();
        this.f1383d = new ArrayList();
        this.f1384e = new int[2];
        this.f1385f = new int[2];
        this.U = new e(7);
        int[] iArr = k4.a.f37907a;
        if (i11 == 0) {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, R.style.Widget_Support_CoordinatorLayout);
        } else {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i11, 0);
        }
        TypedArray typedArray = typedArrayObtainStyledAttributes;
        if (Build.VERSION.SDK_INT < 29) {
            coordinatorLayout = this;
            context2 = context;
        } else if (i11 == 0) {
            coordinatorLayout = this;
            context2 = context;
            coordinatorLayout.saveAttributeDataForStyleable(context2, iArr, attributeSet, typedArray, 0, R.style.Widget_Support_CoordinatorLayout);
        } else {
            context2 = context;
            coordinatorLayout = this;
            coordinatorLayout.saveAttributeDataForStyleable(context2, iArr, attributeSet, typedArray, i11, 0);
        }
        int resourceId = typedArray.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context2.getResources();
            int[] intArray = resources.getIntArray(resourceId);
            coordinatorLayout.K = intArray;
            float f5 = resources.getDisplayMetrics().density;
            int length = intArray.length;
            for (int i12 = 0; i12 < length; i12++) {
                int[] iArr2 = coordinatorLayout.K;
                iArr2[i12] = (int) (iArr2[i12] * f5);
            }
        }
        coordinatorLayout.R = typedArray.getDrawable(1);
        typedArray.recycle();
        B();
        super.setOnHierarchyChangeListener(new l4.d(this));
        WeakHashMap weakHashMap = s0.f58893a;
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }
}
