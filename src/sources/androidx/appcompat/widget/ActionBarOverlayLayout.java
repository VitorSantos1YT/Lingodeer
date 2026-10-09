package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import com.lingodeer.R;
import java.util.WeakHashMap;
import l.m0;
import q.u;
import r.o2;
import r.t2;
import r.y0;
import r.z0;
import z4.h0;
import z4.h1;
import z4.i1;
import z4.j0;
import z4.j1;
import z4.k1;
import z4.l1;
import z4.s;
import z4.s0;
import z4.s1;
import z4.t;
import z4.v1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements y0, s, t {

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final int[] f860h0 = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final v1 f861i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final Rect f862j0;
    public boolean H;
    public boolean K;
    public boolean L;
    public int M;
    public int N;
    public final Rect O;
    public final Rect P;
    public final Rect Q;
    public final Rect R;
    public v1 S;
    public v1 T;
    public v1 U;
    public v1 V;
    public r.c W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f863a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public OverScroller f864a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f865b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public ViewPropertyAnimator f866b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ContentFrameLayout f867c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final gi.g f868c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ActionBarContainer f869d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final r.b f870d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public z0 f871e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final r.b f872e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Drawable f873f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public final a9.e f874f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public final NoSystemUiLayoutFlagView f875g0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f876t;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class NoSystemUiLayoutFlagView extends View {
        @Override // android.view.View
        public final int getWindowSystemUiVisibility() {
            return 0;
        }
    }

    static {
        l1 i1Var;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 34) {
            i1Var = new k1();
        } else if (i11 >= 30) {
            i1Var = new j1();
        } else {
            i1Var = i11 >= 29 ? new i1() : new h1();
        }
        i1Var.g(r4.d.c(0, 1, 0, 1));
        f861i0 = i1Var.b();
        f862j0 = new Rect();
    }

    public ActionBarOverlayLayout(Context context) {
        this(context, null);
    }

    public static boolean a(View view, Rect rect, boolean z11) {
        boolean z12;
        r.d dVar = (r.d) view.getLayoutParams();
        int i11 = ((ViewGroup.MarginLayoutParams) dVar).leftMargin;
        int i12 = rect.left;
        if (i11 != i12) {
            ((ViewGroup.MarginLayoutParams) dVar).leftMargin = i12;
            z12 = true;
        } else {
            z12 = false;
        }
        int i13 = ((ViewGroup.MarginLayoutParams) dVar).topMargin;
        int i14 = rect.top;
        if (i13 != i14) {
            ((ViewGroup.MarginLayoutParams) dVar).topMargin = i14;
            z12 = true;
        }
        int i15 = ((ViewGroup.MarginLayoutParams) dVar).rightMargin;
        int i16 = rect.right;
        if (i15 != i16) {
            ((ViewGroup.MarginLayoutParams) dVar).rightMargin = i16;
            z12 = true;
        }
        if (z11) {
            int i17 = ((ViewGroup.MarginLayoutParams) dVar).bottomMargin;
            int i18 = rect.bottom;
            if (i17 != i18) {
                ((ViewGroup.MarginLayoutParams) dVar).bottomMargin = i18;
                return true;
            }
        }
        return z12;
    }

    public final void b() {
        removeCallbacks(this.f870d0);
        removeCallbacks(this.f872e0);
        ViewPropertyAnimator viewPropertyAnimator = this.f866b0;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    @Override // z4.t
    public final void c(View view, int i11, int i12, int i13, int i14, int i15, int[] iArr) {
        d(view, i11, i12, i13, i14, i15);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof r.d;
    }

    @Override // z4.s
    public final void d(View view, int i11, int i12, int i13, int i14, int i15) {
        if (i15 == 0) {
            onNestedScroll(view, i11, i12, i13, i14);
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int translationY;
        super.draw(canvas);
        if (this.f873f != null) {
            if (this.f869d.getVisibility() == 0) {
                translationY = (int) (this.f869d.getTranslationY() + this.f869d.getBottom() + 0.5f);
            } else {
                translationY = 0;
            }
            this.f873f.setBounds(0, translationY, getWidth(), this.f873f.getIntrinsicHeight() + translationY);
            this.f873f.draw(canvas);
        }
    }

    public final void e(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f860h0);
        this.f863a = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.f873f = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.f864a0 = new OverScroller(context);
    }

    @Override // z4.s
    public final boolean f(View view, View view2, int i11, int i12) {
        return i12 == 0 && onStartNestedScroll(view, view2, i11);
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // z4.s
    public final void g(View view, View view2, int i11, int i12) {
        if (i12 == 0) {
            onNestedScrollAccepted(view, view2, i11);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new r.d(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new r.d(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f869d;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        a9.e eVar = this.f874f0;
        return eVar.f479c | eVar.f478b;
    }

    public CharSequence getTitle() {
        k();
        return ((t2) this.f871e).f48654a.getTitle();
    }

    @Override // z4.s
    public final void h(View view, int i11) {
        if (i11 == 0) {
            onStopNestedScroll(view);
        }
    }

    public final void j(int i11) {
        k();
        if (i11 == 2) {
            this.f871e.getClass();
        } else if (i11 == 5) {
            this.f871e.getClass();
        } else {
            if (i11 != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    public final void k() {
        z0 wrapper;
        if (this.f867c == null) {
            this.f867c = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.f869d = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback callbackFindViewById = findViewById(R.id.action_bar);
            if (callbackFindViewById instanceof z0) {
                wrapper = (z0) callbackFindViewById;
            } else {
                if (!(callbackFindViewById instanceof Toolbar)) {
                    throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById.getClass().getSimpleName()));
                }
                wrapper = ((Toolbar) callbackFindViewById).getWrapper();
            }
            this.f871e = wrapper;
        }
    }

    public final void l(Menu menu, u uVar) {
        k();
        t2 t2Var = (t2) this.f871e;
        Toolbar toolbar = t2Var.f48654a;
        if (t2Var.m == null) {
            c cVar = new c(toolbar.getContext());
            t2Var.m = cVar;
            cVar.K = R.id.action_menu_presenter;
        }
        c cVar2 = t2Var.m;
        cVar2.f1072e = uVar;
        q.l lVar = (q.l) menu;
        if (lVar == null && toolbar.f1028a == null) {
            return;
        }
        toolbar.f();
        q.l lVar2 = toolbar.f1028a.R;
        if (lVar2 == lVar) {
            return;
        }
        if (lVar2 != null) {
            lVar2.r(toolbar.f1050q0);
            lVar2.r(toolbar.f1051r0);
        }
        if (toolbar.f1051r0 == null) {
            toolbar.f1051r0 = new o2(toolbar);
        }
        cVar2.T = true;
        if (lVar != null) {
            lVar.b(cVar2, toolbar.L);
            lVar.b(toolbar.f1051r0, toolbar.L);
        } else {
            cVar2.j(toolbar.L, null);
            toolbar.f1051r0.j(toolbar.L, null);
            cVar2.c(true);
            toolbar.f1051r0.c(true);
        }
        toolbar.f1028a.setPopupTheme(toolbar.M);
        toolbar.f1028a.setPresenter(cVar2);
        toolbar.f1050q0 = cVar2;
        toolbar.w();
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        k();
        v1 v1VarH = v1.h(this, windowInsets);
        boolean zA = a(this.f869d, new Rect(v1VarH.b(), v1VarH.d(), v1VarH.c(), v1VarH.a()), false);
        WeakHashMap weakHashMap = s0.f58893a;
        Rect rect = this.O;
        j0.b(this, v1VarH, rect);
        int i11 = rect.left;
        int i12 = rect.top;
        int i13 = rect.right;
        int i14 = rect.bottom;
        s1 s1Var = v1VarH.f58905a;
        v1 v1VarN = s1Var.n(i11, i12, i13, i14);
        this.S = v1VarN;
        boolean z11 = true;
        if (!this.T.equals(v1VarN)) {
            this.T = this.S;
            zA = true;
        }
        Rect rect2 = this.P;
        if (rect2.equals(rect)) {
            z11 = zA;
        } else {
            rect2.set(rect);
        }
        if (z11) {
            requestLayout();
        }
        return s1Var.a().f58905a.c().f58905a.b().g();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        e(getContext());
        WeakHashMap weakHashMap = s0.f58893a;
        h0.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            if (childAt.getVisibility() != 8) {
                r.d dVar = (r.d) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i16 = ((ViewGroup.MarginLayoutParams) dVar).leftMargin + paddingLeft;
                int i17 = ((ViewGroup.MarginLayoutParams) dVar).topMargin + paddingTop;
                childAt.layout(i16, i17, measuredWidth + i16, measuredHeight + i17);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:24:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:25:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:27:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:28:0x00df  */
    /* JADX WARN: Code duplicated, block: B:30:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:31:0x00e9  */
    @Override // android.view.View
    public final void onMeasure(int i11, int i12) {
        int measuredHeight;
        v1 v1Var;
        int i13;
        l1 h1Var;
        k();
        measureChildWithMargins(this.f869d, i11, 0, i12, 0);
        r.d dVar = (r.d) this.f869d.getLayoutParams();
        int iMax = Math.max(0, this.f869d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) dVar).leftMargin + ((ViewGroup.MarginLayoutParams) dVar).rightMargin);
        int iMax2 = Math.max(0, this.f869d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) dVar).topMargin + ((ViewGroup.MarginLayoutParams) dVar).bottomMargin);
        int iCombineMeasuredStates = View.combineMeasuredStates(0, this.f869d.getMeasuredState());
        WeakHashMap weakHashMap = s0.f58893a;
        boolean z11 = (getWindowSystemUiVisibility() & 256) != 0;
        if (z11) {
            measuredHeight = this.f863a;
            if (this.H && this.f869d.getTabContainer() != null) {
                measuredHeight += this.f863a;
            }
        } else {
            measuredHeight = this.f869d.getVisibility() != 8 ? this.f869d.getMeasuredHeight() : 0;
        }
        Rect rect = this.O;
        Rect rect2 = this.Q;
        rect2.set(rect);
        this.U = this.S;
        if (this.f876t || z11) {
            r4.d dVarC = r4.d.c(this.U.b(), this.U.d() + measuredHeight, this.U.c(), this.U.a());
            v1Var = this.U;
            i13 = Build.VERSION.SDK_INT;
            if (i13 >= 34) {
                h1Var = new k1(v1Var);
            } else if (i13 >= 30) {
                h1Var = new j1(v1Var);
            } else if (i13 >= 29) {
                h1Var = new i1(v1Var);
            } else {
                h1Var = new h1(v1Var);
            }
            h1Var.g(dVarC);
            this.U = h1Var.b();
        } else {
            NoSystemUiLayoutFlagView noSystemUiLayoutFlagView = this.f875g0;
            v1 v1Var2 = f861i0;
            Rect rect3 = this.R;
            j0.b(noSystemUiLayoutFlagView, v1Var2, rect3);
            if (rect3.equals(f862j0)) {
                r4.d dVarC2 = r4.d.c(this.U.b(), this.U.d() + measuredHeight, this.U.c(), this.U.a());
                v1Var = this.U;
                i13 = Build.VERSION.SDK_INT;
                if (i13 >= 34) {
                    h1Var = new k1(v1Var);
                } else if (i13 >= 30) {
                    h1Var = new j1(v1Var);
                } else if (i13 >= 29) {
                    h1Var = new i1(v1Var);
                } else {
                    h1Var = new h1(v1Var);
                }
                h1Var.g(dVarC2);
                this.U = h1Var.b();
            } else {
                rect2.top += measuredHeight;
                rect2.bottom = rect2.bottom;
                this.U = this.U.f58905a.n(0, measuredHeight, 0, 0);
            }
        }
        a(this.f867c, rect2, true);
        if (!this.V.equals(this.U)) {
            v1 v1Var3 = this.U;
            this.V = v1Var3;
            s0.c(this.f867c, v1Var3);
        }
        measureChildWithMargins(this.f867c, i11, 0, i12, 0);
        r.d dVar2 = (r.d) this.f867c.getLayoutParams();
        int iMax3 = Math.max(iMax, this.f867c.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) dVar2).leftMargin + ((ViewGroup.MarginLayoutParams) dVar2).rightMargin);
        int iMax4 = Math.max(iMax2, this.f867c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) dVar2).topMargin + ((ViewGroup.MarginLayoutParams) dVar2).bottomMargin);
        int iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f867c.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + iMax3, getSuggestedMinimumWidth()), i11, iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + iMax4, getSuggestedMinimumHeight()), i12, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f5, float f11, boolean z11) {
        if (!this.K || !z11) {
            return false;
        }
        this.f864a0.fling(0, 0, 0, (int) f11, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f864a0.getFinalY() > this.f869d.getHeight()) {
            b();
            this.f872e0.run();
        } else {
            b();
            this.f870d0.run();
        }
        this.L = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f5, float f11) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i11, int i12, int i13, int i14) {
        int i15 = this.M + i12;
        this.M = i15;
        setActionBarHideOffset(i15);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i11) {
        m0 m0Var;
        p.l lVar;
        this.f874f0.f478b = i11;
        this.M = getActionBarHideOffset();
        b();
        r.c cVar = this.W;
        if (cVar == null || (lVar = (m0Var = (m0) cVar).f39052s) == null) {
            return;
        }
        lVar.a();
        m0Var.f39052s = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i11) {
        if ((i11 & 2) == 0 || this.f869d.getVisibility() != 0) {
            return false;
        }
        return this.K;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.K || this.L) {
            return;
        }
        if (this.M <= this.f869d.getHeight()) {
            b();
            postDelayed(this.f870d0, 600L);
        } else {
            b();
            postDelayed(this.f872e0, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i11) {
        super.onWindowSystemUiVisibilityChanged(i11);
        k();
        int i12 = this.N ^ i11;
        this.N = i11;
        boolean z11 = (i11 & 4) == 0;
        boolean z12 = (i11 & 256) != 0;
        r.c cVar = this.W;
        if (cVar != null) {
            m0 m0Var = (m0) cVar;
            m0Var.f39048o = !z12;
            if (z11 || !z12) {
                if (m0Var.f39049p) {
                    m0Var.f39049p = false;
                    m0Var.z(true);
                }
            } else if (!m0Var.f39049p) {
                m0Var.f39049p = true;
                m0Var.z(true);
            }
        }
        if ((i12 & 256) == 0 || this.W == null) {
            return;
        }
        WeakHashMap weakHashMap = s0.f58893a;
        h0.c(this);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i11) {
        super.onWindowVisibilityChanged(i11);
        this.f865b = i11;
        r.c cVar = this.W;
        if (cVar != null) {
            ((m0) cVar).f39047n = i11;
        }
    }

    public void setActionBarHideOffset(int i11) {
        b();
        this.f869d.setTranslationY(-Math.max(0, Math.min(i11, this.f869d.getHeight())));
    }

    public void setActionBarVisibilityCallback(r.c cVar) {
        this.W = cVar;
        if (getWindowToken() != null) {
            ((m0) this.W).f39047n = this.f865b;
            int i11 = this.N;
            if (i11 != 0) {
                onWindowSystemUiVisibilityChanged(i11);
                WeakHashMap weakHashMap = s0.f58893a;
                h0.c(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z11) {
        this.H = z11;
    }

    public void setHideOnContentScrollEnabled(boolean z11) {
        if (z11 != this.K) {
            this.K = z11;
            if (z11) {
                return;
            }
            b();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i11) {
        k();
        t2 t2Var = (t2) this.f871e;
        t2Var.f48657d = i11 != 0 ? jh.h.k(t2Var.f48654a.getContext(), i11) : null;
        t2Var.c();
    }

    public void setLogo(int i11) {
        k();
        t2 t2Var = (t2) this.f871e;
        t2Var.f48658e = i11 != 0 ? jh.h.k(t2Var.f48654a.getContext(), i11) : null;
        t2Var.c();
    }

    public void setOverlayMode(boolean z11) {
        this.f876t = z11;
    }

    @Override // r.y0
    public void setWindowCallback(Window.Callback callback) {
        k();
        ((t2) this.f871e).f48664k = callback;
    }

    @Override // r.y0
    public void setWindowTitle(CharSequence charSequence) {
        k();
        t2 t2Var = (t2) this.f871e;
        if (t2Var.f48660g) {
            return;
        }
        Toolbar toolbar = t2Var.f48654a;
        t2Var.f48661h = charSequence;
        if ((t2Var.f48655b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (t2Var.f48660g) {
                s0.r(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f865b = 0;
        this.O = new Rect();
        this.P = new Rect();
        this.Q = new Rect();
        this.R = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        v1 v1Var = v1.f58904b;
        this.S = v1Var;
        this.T = v1Var;
        this.U = v1Var;
        this.V = v1Var;
        this.f868c0 = new gi.g(this, 5);
        this.f870d0 = new r.b(this, 0);
        this.f872e0 = new r.b(this, 1);
        e(context);
        this.f874f0 = new a9.e(7);
        NoSystemUiLayoutFlagView noSystemUiLayoutFlagView = new NoSystemUiLayoutFlagView(context);
        noSystemUiLayoutFlagView.setWillNotDraw(true);
        this.f875g0 = noSystemUiLayoutFlagView;
        addView(noSystemUiLayoutFlagView);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new r.d(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        k();
        t2 t2Var = (t2) this.f871e;
        t2Var.f48657d = drawable;
        t2Var.c();
    }

    public void setShowingForActionMode(boolean z11) {
    }

    public void setUiOptions(int i11) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i11, int i12, int[] iArr) {
    }

    @Override // z4.s
    public final void i(View view, int i11, int i12, int[] iArr, int i13) {
    }
}
