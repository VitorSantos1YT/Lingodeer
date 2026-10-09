package androidx.compose.ui.platform;

import a0.h;
import android.content.Context;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import com.lingodeer.R;
import fz.a;
import h1.t5;
import java.lang.ref.WeakReference;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.y;
import l1.a2;
import l1.d2;
import l1.f;
import l1.g;
import l1.n;
import l1.w;
import l1.w0;
import qy.q;
import rz.b1;
import rz.e0;
import t1.d;
import vy.i;
import vy.j;
import xg.b;
import y2.t1;
import z1.c;
import z1.s;
import z2.b3;
import z2.e3;
import z2.l2;
import z2.m2;
import z2.n2;
import z2.p0;
import z2.s2;
import z2.t2;
import z2.w2;
import z2.x2;
import z2.y0;
import z2.y1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractComposeView extends ViewGroup {
    public boolean H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WeakReference f1144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public IBinder f1145b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b3 f1146c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public w f1147d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a f1148e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f1149f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f1150t;

    public AbstractComposeView(Context context) {
        this(context, null, 6, 0);
    }

    private final void setParentContext(w wVar) {
        if (this.f1147d != wVar) {
            this.f1147d = wVar;
            if (wVar != null) {
                this.f1144a = null;
            }
            b3 b3Var = this.f1146c;
            if (b3Var != null) {
                b3Var.dispose();
                this.f1146c = null;
                if (isAttachedToWindow()) {
                    f();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.f1145b != iBinder) {
            this.f1145b = iBinder;
            this.f1144a = null;
        }
    }

    public abstract void a(n nVar, int i11);

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        b();
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i11, ViewGroup.LayoutParams layoutParams) {
        b();
        return super.addViewInLayout(view, i11, layoutParams);
    }

    public final void b() {
        if (this.f1150t) {
            return;
        }
        throw new UnsupportedOperationException("Cannot add views to " + getClass().getSimpleName() + "; only Compose content is supported");
    }

    public final void c() {
        if (this.f1147d == null && !isAttachedToWindow()) {
            throw new IllegalStateException("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.");
        }
        f();
    }

    public final void d() {
        b3 b3Var = this.f1146c;
        if (b3Var != null) {
            b3Var.dispose();
        }
        this.f1146c = null;
        requestLayout();
    }

    public final void f() {
        if (this.f1146c == null) {
            try {
                this.f1150t = true;
                this.f1146c = e3.a(this, i(), new d(new h(this, 9), true, -656146368));
            } finally {
                this.f1150t = false;
            }
        }
    }

    public void g(int i11, int i12, int i13, int i14, boolean z11) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i13 - i11) - getPaddingRight(), (i14 - i12) - getPaddingBottom());
        }
    }

    /* JADX INFO: renamed from: getAutoClearFocusBehavior-4UtRPd4, reason: not valid java name */
    public final int m0getAutoClearFocusBehavior4UtRPd4() {
        Object tag = getTag(R.id.auto_clear_focus_behavior_tag);
        y0 y0Var = tag instanceof y0 ? (y0) tag : null;
        if (y0Var != null) {
            return y0Var.f58728a;
        }
        return 1;
    }

    public final boolean getHasComposition() {
        return this.f1146c != null;
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.f1149f;
    }

    public void h(int i11, int i12) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i11, i12);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i11) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i11)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i12) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i12)));
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + childAt.getMeasuredWidth(), getPaddingBottom() + getPaddingTop() + childAt.getMeasuredHeight());
    }

    public final w i() {
        d2 d2Var;
        i iVar;
        f fVar;
        Object objX;
        w wVarB = this.f1147d;
        if (wVarB == null) {
            wVarB = x2.b(this);
            if (wVarB == null) {
                ViewParent parent = getParent();
                while (true) {
                    if (wVarB != null || !(objX instanceof View)) {
                        objX = parent;
                        break;
                    }
                    objX = parent;
                    View view = (View) objX;
                    wVarB = x2.b(view);
                    objX = c.a.x(view);
                }
            }
            boolean z11 = false;
            if (wVarB != null) {
                w wVar = (!(wVarB instanceof d2) || ((a2) ((d2) wVarB).f39276v.getValue()).compareTo(a2.ShuttingDown) > 0) ? wVarB : null;
                if (wVar != null) {
                    this.f1144a = new WeakReference(wVar);
                }
            } else {
                wVarB = null;
            }
            if (wVarB == null) {
                WeakReference weakReference = this.f1144a;
                if (weakReference == null || (wVarB = (w) weakReference.get()) == null || ((wVarB instanceof d2) && ((a2) ((d2) wVarB).f39276v.getValue()).compareTo(a2.ShuttingDown) <= 0)) {
                    wVarB = null;
                }
                if (wVarB == null) {
                    if (!isAttachedToWindow()) {
                        v2.a.b("Cannot locate windowRecomposer; View " + this + " is not attached to a window");
                    }
                    View view2 = this;
                    Object parent2 = getParent();
                    while (parent2 instanceof View) {
                        View view3 = (View) parent2;
                        if (view3.getId() == 16908290) {
                            break;
                        }
                        view2 = view3;
                        parent2 = view3.getParent();
                    }
                    w wVarB2 = x2.b(view2);
                    if (wVarB2 == null) {
                        ((s2) t2.f58673a.get()).getClass();
                        i iVar2 = j.f54321a;
                        q qVar = p0.M;
                        if (Looper.myLooper() == Looper.getMainLooper()) {
                            iVar = (i) p0.M.getValue();
                        } else {
                            iVar = (i) p0.N.get();
                            if (iVar == null) {
                                throw new IllegalStateException("no AndroidUiDispatcher for this thread");
                            }
                        }
                        i iVarPlus = iVar.plus(iVar2);
                        w0 w0Var = (w0) iVarPlus.get(g.f39299c);
                        if (w0Var != null) {
                            fVar = new f(w0Var);
                            bq.f fVar2 = (bq.f) fVar.f39290c;
                            synchronized (fVar2.f4944b) {
                                fVar2.f4943a = false;
                            }
                        } else {
                            fVar = null;
                        }
                        y yVar = new y();
                        i y1Var = (s) iVarPlus.get(c.R);
                        if (y1Var == null) {
                            y1Var = new y1();
                            yVar.f38361a = y1Var;
                        }
                        if (fVar != null) {
                            iVar2 = fVar;
                        }
                        i iVarPlus2 = iVarPlus.plus(iVar2).plus(y1Var);
                        d2Var = new d2(iVarPlus2);
                        synchronized (d2Var.f39259d) {
                            d2Var.f39275u = true;
                        }
                        wz.d dVarC = e0.c(iVarPlus2);
                        LifecycleOwner lifecycleOwner = ViewTreeLifecycleOwner.get(view2);
                        Lifecycle lifecycle = lifecycleOwner != null ? lifecycleOwner.getLifecycle() : null;
                        if (lifecycle == null) {
                            v2.a.c("ViewTreeLifecycleOwner not found from " + view2);
                            throw new KotlinNothingValueException();
                        }
                        view2.addOnAttachStateChangeListener(new cb.j(d2Var, 2, view2));
                        lifecycle.addObserver(new w2(dVarC, fVar, d2Var, yVar, view2));
                        view2.setTag(R.id.androidx_compose_ui_view_composition_context, d2Var);
                        b1 b1Var = b1.f50869a;
                        Handler handler = view2.getHandler();
                        int i11 = sz.d.f51962a;
                        view2.addOnAttachStateChangeListener(new g2.f(e0.B(b1Var, new sz.c(handler, "windowRecomposer cleanup", false).f51961d, null, new b(9, d2Var, view2, z11 ? 1 : 0), 2), 3));
                    } else {
                        if (!(wVarB2 instanceof d2)) {
                            throw new IllegalStateException("root viewTreeParentCompositionContext is not a Recomposer");
                        }
                        d2Var = (d2) wVarB2;
                    }
                    d2 d2Var2 = ((a2) d2Var.f39276v.getValue()).compareTo(a2.ShuttingDown) > 0 ? d2Var : null;
                    if (d2Var2 != null) {
                        this.f1144a = new WeakReference(d2Var2);
                    }
                    return d2Var;
                }
            }
        }
        return wVarB;
    }

    @Override // android.view.ViewGroup
    public final boolean isTransitionGroup() {
        return !this.H || super.isTransitionGroup();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setPreviousAttachedWindowToken(getWindowToken());
        if (getShouldCreateCompositionOnAttachedToWindow()) {
            f();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        g(i11, i12, i13, i14, z11);
    }

    @Override // android.view.View
    public final void onMeasure(int i11, int i12) {
        f();
        h(i11, i12);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i11) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.setLayoutDirection(i11);
        }
    }

    /* JADX INFO: renamed from: setAutoClearFocusBehavior-17tfJxM, reason: not valid java name */
    public final void m1setAutoClearFocusBehavior17tfJxM(int i11) {
        setTag(R.id.auto_clear_focus_behavior_tag, new y0(i11));
    }

    public final void setParentCompositionContext(w wVar) {
        setParentContext(wVar);
    }

    public final void setShowLayoutBounds(boolean z11) {
        this.f1149f = z11;
        KeyEvent.Callback childAt = getChildAt(0);
        if (childAt != null) {
            ((t1) childAt).setShowLayoutBounds(z11);
        }
    }

    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean z11) {
        super.setTransitionGroup(z11);
        this.H = true;
    }

    public final void setViewCompositionStrategy(n2 n2Var) {
        a aVar = this.f1148e;
        if (aVar != null) {
            aVar.invoke();
        }
        this.f1148e = n2Var.a(this);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public AbstractComposeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    public AbstractComposeView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        setClipChildren(false);
        setClipToPadding(false);
        setImportantForAccessibility(1);
        l2 l2Var = new l2(this, 1);
        addOnAttachStateChangeListener(l2Var);
        m2 m2Var = new m2(this);
        android.support.v4.media.session.a.u(this).f36060a.add(m2Var);
        this.f1148e = new t5(this, l2Var, m2Var, 4);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i11) {
        b();
        super.addView(view, i11);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i11, ViewGroup.LayoutParams layoutParams, boolean z11) {
        b();
        return super.addViewInLayout(view, i11, layoutParams, z11);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i11, int i12) {
        b();
        super.addView(view, i11, i12);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        b();
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i11, ViewGroup.LayoutParams layoutParams) {
        b();
        super.addView(view, i11, layoutParams);
    }

    public /* synthetic */ AbstractComposeView(Context context, AttributeSet attributeSet, int i11, int i12) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, 0);
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }
}
