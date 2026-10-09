package androidx.compose.ui.window;

import a0.h;
import android.graphics.Rect;
import android.os.Build;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;
import fz.e;
import h1.g5;
import h1.l5;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import l1.d0;
import l1.g0;
import l1.k1;
import l1.n;
import l1.s;
import l1.t;
import l1.x1;
import v3.k;
import v3.l;
import v3.m;
import w2.l1;
import x1.u;
import z3.i;
import z3.q;
import z3.v;
import z3.w;
import z3.x;
import z3.y;
import z3.z;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class PopupLayout extends AbstractComposeView {
    public fz.a K;
    public z L;
    public String M;
    public final View N;
    public final boolean O;
    public final x P;
    public final WindowManager Q;
    public final WindowManager.LayoutParams R;
    public y S;
    public m T;
    public final k1 U;
    public final k1 V;
    public k W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final g0 f1235a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Rect f1236b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final u f1237c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public g5 f1238d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final k1 f1239e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public boolean f1240f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public final int[] f1241g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PopupLayout(fz.a aVar, z zVar, String str, View view, v3.c cVar, y yVar, UUID uuid, boolean z11) {
        super(view.getContext(), null, 6, 0);
        x wVar = Build.VERSION.SDK_INT >= 29 ? new w() : new x();
        this.K = aVar;
        this.L = zVar;
        this.M = str;
        this.N = view;
        this.O = z11;
        this.P = wVar;
        Object systemService = view.getContext().getSystemService("window");
        kotlin.jvm.internal.m.d(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.Q = (WindowManager) systemService;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        z zVar2 = this.L;
        boolean zC = z3.k.c(view);
        boolean z12 = zVar2.f58798b;
        int i11 = zVar2.f58797a;
        if (z12 && zC) {
            i11 |= OSSConstants.DEFAULT_BUFFER_SIZE;
        } else if (z12 && !zC) {
            i11 &= -8193;
        }
        layoutParams.flags = i11;
        layoutParams.type = 1002;
        layoutParams.token = view.getApplicationWindowToken();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(view.getContext().getResources().getString(R.string.default_popup_window_title));
        this.R = layoutParams;
        this.S = yVar;
        this.T = m.Ltr;
        this.U = t.B(null);
        this.V = t.B(null);
        this.f1235a0 = t.s(new l1(this, 10));
        this.f1236b0 = new Rect();
        this.f1237c0 = new u(new i(this, 2));
        setId(android.R.id.content);
        ViewTreeLifecycleOwner.set(this, ViewTreeLifecycleOwner.get(view));
        ViewTreeViewModelStoreOwner.set(this, ViewTreeViewModelStoreOwner.get(view));
        fb.g0.B(this, fb.g0.p(view));
        setTag(R.id.compose_view_saveable_id_tag, "Popup:" + uuid);
        setClipChildren(false);
        setElevation(cVar.e0((float) 8));
        setOutlineProvider(new l5(4));
        this.f1239e0 = t.B(q.f58783a);
        this.f1241g0 = new int[2];
    }

    private final e getContent() {
        return (e) this.f1239e0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final w2.x getParentLayoutCoordinates() {
        return (w2.x) this.V.getValue();
    }

    private final k getVisibleDisplayBounds() {
        this.P.getClass();
        View view = this.N;
        Rect rect = this.f1236b0;
        view.getWindowVisibleDisplayFrame(rect);
        d0 d0Var = z3.k.f58774a;
        return new k(rect.left, rect.top, rect.right, rect.bottom);
    }

    private final void setContent(e eVar) {
        this.f1239e0.setValue(eVar);
    }

    private final void setParentLayoutCoordinates(w2.x xVar) {
        this.V.setValue(xVar);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void a(n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.f0(-857613600);
        int i12 = (sVar.h(this) ? 4 : 2) | i11;
        if (sVar.T(i12 & 1, (i12 & 3) != 2)) {
            getContent().invoke(sVar, 0);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new h(this, i11, 11);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.L.f58799c) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getKeyCode() == 4 || keyEvent.getKeyCode() == 111) {
            KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
            if (keyDispatcherState == null) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                keyDispatcherState.startTracking(keyEvent, this);
                return true;
            }
            if (keyEvent.getAction() == 1 && keyDispatcherState.isTracking(keyEvent) && !keyEvent.isCanceled()) {
                fz.a aVar = this.K;
                if (aVar != null) {
                    aVar.invoke();
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void g(int i11, int i12, int i13, int i14, boolean z11) {
        View childAt;
        super.g(i11, i12, i13, i14, z11);
        if (this.L.f58802f || (childAt = getChildAt(0)) == null) {
            return;
        }
        int measuredWidth = childAt.getMeasuredWidth();
        WindowManager.LayoutParams layoutParams = this.R;
        layoutParams.width = measuredWidth;
        layoutParams.height = childAt.getMeasuredHeight();
        this.P.getClass();
        this.Q.updateViewLayout(this, layoutParams);
    }

    public final boolean getCanCalculatePosition() {
        return ((Boolean) this.f1235a0.getValue()).booleanValue();
    }

    public final WindowManager.LayoutParams getParams$ui() {
        return this.R;
    }

    public final m getParentLayoutDirection() {
        return this.T;
    }

    /* JADX INFO: renamed from: getPopupContentSize-bOM6tXw, reason: not valid java name */
    public final l m7getPopupContentSizebOM6tXw() {
        return (l) this.U.getValue();
    }

    public final y getPositionProvider() {
        return this.S;
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f1240f0;
    }

    public final String getTestTag() {
        return this.M;
    }

    public /* bridge */ /* synthetic */ View getViewRoot() {
        return null;
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void h(int i11, int i12) {
        if (this.L.f58802f) {
            super.h(i11, i12);
        } else {
            k visibleDisplayBounds = getVisibleDisplayBounds();
            super.h(View.MeasureSpec.makeMeasureSpec(visibleDisplayBounds.d(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(visibleDisplayBounds.b(), Integer.MIN_VALUE));
        }
    }

    public final void k(l1.w wVar, e eVar) {
        setParentCompositionContext(wVar);
        setContent(eVar);
        this.f1240f0 = true;
    }

    public final void l(fz.a aVar, z zVar, String str, m mVar) {
        this.K = aVar;
        this.M = str;
        if (!kotlin.jvm.internal.m.a(this.L, zVar)) {
            boolean z11 = zVar.f58802f;
            WindowManager.LayoutParams layoutParams = this.R;
            if (z11 && !this.L.f58802f) {
                layoutParams.width = -2;
                layoutParams.height = -2;
            }
            this.L = zVar;
            boolean zC = z3.k.c(this.N);
            boolean z12 = zVar.f58798b;
            int i11 = zVar.f58797a;
            if (z12 && zC) {
                i11 |= OSSConstants.DEFAULT_BUFFER_SIZE;
            } else if (z12 && !zC) {
                i11 &= -8193;
            }
            layoutParams.flags = i11;
            this.P.getClass();
            this.Q.updateViewLayout(this, layoutParams);
        }
        int i12 = z3.u.f58791a[mVar.ordinal()];
        int i13 = 1;
        if (i12 == 1) {
            i13 = 0;
        } else if (i12 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        super.setLayoutDirection(i13);
    }

    public final void m() {
        w2.x parentLayoutCoordinates = getParentLayoutCoordinates();
        if (parentLayoutCoordinates != null) {
            if (!parentLayoutCoordinates.k()) {
                parentLayoutCoordinates = null;
            }
            if (parentLayoutCoordinates == null) {
                return;
            }
            long jM = parentLayoutCoordinates.m();
            long jX = this.O ? parentLayoutCoordinates.x(0L) : parentLayoutCoordinates.c(0L);
            k kVarB = fb.g0.b((((long) Math.round(Float.intBitsToFloat((int) (jX >> 32)))) << 32) | (4294967295L & ((long) Math.round(Float.intBitsToFloat((int) (jX & 4294967295L))))), jM);
            if (kVarB.equals(this.W)) {
                return;
            }
            this.W = kVarB;
            o();
        }
    }

    public final void n(w2.x xVar) {
        setParentLayoutCoordinates(xVar);
        m();
    }

    public final void o() {
        l lVarM7getPopupContentSizebOM6tXw;
        k kVar = this.W;
        if (kVar == null || (lVarM7getPopupContentSizebOM6tXw = m7getPopupContentSizebOM6tXw()) == null) {
            return;
        }
        long j11 = lVarM7getPopupContentSizebOM6tXw.f53498a;
        k visibleDisplayBounds = getVisibleDisplayBounds();
        long jB = (((long) visibleDisplayBounds.b()) & 4294967295L) | (((long) visibleDisplayBounds.d()) << 32);
        kotlin.jvm.internal.x xVar = new kotlin.jvm.internal.x();
        xVar.f38360a = 0L;
        this.f1237c0.d(this, z3.c.f58747t, new v(xVar, this, kVar, jB, j11));
        long j12 = xVar.f38360a;
        WindowManager.LayoutParams layoutParams = this.R;
        layoutParams.x = (int) (j12 >> 32);
        layoutParams.y = (int) (j12 & 4294967295L);
        boolean z11 = this.L.f58801e;
        x xVar2 = this.P;
        if (z11) {
            xVar2.a(this, (int) (jB >> 32), (int) (jB & 4294967295L));
        }
        xVar2.getClass();
        this.Q.updateViewLayout(this, layoutParams);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f1237c0.e();
        if (!this.L.f58799c || Build.VERSION.SDK_INT < 33) {
            return;
        }
        if (this.f1238d0 == null) {
            this.f1238d0 = new g5(1, this.K);
        }
        a5.e.k(this, this.f1238d0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        u uVar = this.f1237c0;
        ui.k kVar = uVar.f55731h;
        if (kVar != null) {
            kVar.b();
        }
        uVar.a();
        if (Build.VERSION.SDK_INT >= 33) {
            a5.e.l(this, this.f1238d0);
        }
        this.f1238d0 = null;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.L.f58800d) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && (motionEvent.getX() < CropImageView.DEFAULT_ASPECT_RATIO || motionEvent.getX() >= getWidth() || motionEvent.getY() < CropImageView.DEFAULT_ASPECT_RATIO || motionEvent.getY() >= getHeight())) {
            fz.a aVar = this.K;
            if (aVar != null) {
                aVar.invoke();
            }
            return true;
        }
        if (motionEvent == null || motionEvent.getAction() != 4) {
            return super.onTouchEvent(motionEvent);
        }
        fz.a aVar2 = this.K;
        if (aVar2 != null) {
            aVar2.invoke();
        }
        return true;
    }

    public final void setParentLayoutDirection(m mVar) {
        this.T = mVar;
    }

    /* JADX INFO: renamed from: setPopupContentSize-fhxjrPA, reason: not valid java name */
    public final void m8setPopupContentSizefhxjrPA(l lVar) {
        this.U.setValue(lVar);
    }

    public final void setPositionProvider(y yVar) {
        this.S = yVar;
    }

    public final void setTestTag(String str) {
        this.M = str;
    }

    public static /* synthetic */ void getParams$ui$annotations() {
    }

    public AbstractComposeView getSubCompositionView() {
        return this;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i11) {
    }
}
