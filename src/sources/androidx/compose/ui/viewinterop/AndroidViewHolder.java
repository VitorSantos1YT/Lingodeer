package androidx.compose.ui.viewinterop;

import a9.e;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.Region;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import com.lingodeer.R;
import da.g;
import fz.c;
import g2.f0;
import java.util.LinkedHashMap;
import l1.j;
import l1.q;
import ot.h0;
import r2.d;
import r2.i;
import rt.qf;
import rz.e0;
import s2.a0;
import s2.z;
import y.p0;
import y2.i0;
import y2.t1;
import y2.u1;
import y2.v;
import y3.b;
import y3.f;
import y3.h;
import z1.o;
import z1.r;
import z2.g0;
import z2.x2;
import z4.j0;
import z4.s0;
import z4.s1;
import z4.t;
import z4.u;
import z4.v1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class AndroidViewHolder extends ViewGroup implements t, j, u1, u {

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final /* synthetic */ int f1215f0 = 0;
    public r H;
    public c K;
    public v3.c L;
    public c M;
    public LifecycleOwner N;
    public g O;
    public final int[] P;
    public long Q;
    public v1 R;
    public c S;
    public final f T;
    public final f U;
    public c V;
    public final int[] W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f1216a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public int f1217a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f1218b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public int f1219b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t1 f1220c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final e f1221c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public fz.a f1222d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public boolean f1223d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f1224e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final i0 f1225e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public fz.a f1226f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public fz.a f1227t;

    public AndroidViewHolder(Context context, q qVar, int i11, d dVar, View view, t1 t1Var) {
        super(context);
        this.f1216a = dVar;
        this.f1218b = view;
        this.f1220c = t1Var;
        LinkedHashMap linkedHashMap = x2.f58726a;
        setTag(R.id.androidx_compose_ui_view_composition_context, qVar);
        int i12 = 0;
        setSaveFromParentEnabled(false);
        addView(view);
        ViewFactoryHolder viewFactoryHolder = (ViewFactoryHolder) this;
        s0.s(this, new y3.a(viewFactoryHolder));
        j0.m(this, this);
        this.f1222d = y3.e.f57064d;
        this.f1226f = y3.e.f57063c;
        this.f1227t = y3.e.f57062b;
        o oVar = o.f58481a;
        this.H = oVar;
        this.L = com.bumptech.glide.g.a();
        int i13 = 2;
        this.P = new int[2];
        this.Q = 0L;
        this.T = new f(viewFactoryHolder, 1);
        this.U = new f(viewFactoryHolder, i12);
        this.W = new int[2];
        this.f1217a0 = Integer.MIN_VALUE;
        this.f1219b0 = Integer.MIN_VALUE;
        this.f1221c0 = new e(7);
        i0 i0Var = new i0(3);
        i0Var.R = viewFactoryHolder;
        r rVarB = g3.r.b(r2.f.a(oVar, h.f57068a, dVar), true, b.f57054d);
        z zVar = new z();
        zVar.f51373a = new a0(viewFactoryHolder, 0);
        av.t tVar = new av.t();
        av.t tVar2 = zVar.f51374b;
        if (tVar2 != null) {
            tVar2.f3195b = null;
        }
        zVar.f51374b = tVar;
        tVar.f3195b = zVar;
        setOnRequestDisallowInterceptTouchEvent$ui(tVar);
        r rVarI = w2.a0.m(d2.h.d(rVarB.i(zVar), new a0.j(viewFactoryHolder, i0Var, viewFactoryHolder, 15)), new y3.c(viewFactoryHolder, i0Var, i13)).i(new a(new a0(viewFactoryHolder, 2)));
        i0Var.g0(this.H.i(rVarI));
        this.K = new a0.e(25, i0Var, rVarI);
        i0Var.c0(this.L);
        this.M = new p0(i0Var, 4);
        i0Var.f56899p0 = new y3.c(viewFactoryHolder, i0Var, i12);
        i0Var.f56900q0 = new a0(viewFactoryHolder, 1);
        i0Var.f0(new y3.d(viewFactoryHolder, i0Var));
        this.f1225e0 = i0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final y2.v1 getSnapshotObserver() {
        if (!isAttachedToWindow()) {
            v2.a.b("Expected AndroidViewHolder to be attached when observing reads.");
        }
        return this.f1220c.getSnapshotObserver();
    }

    public static final int l(ViewFactoryHolder viewFactoryHolder, int i11, int i12, int i13) {
        if (i13 >= 0 || i11 == i12) {
            return View.MeasureSpec.makeMeasureSpec(hz.b.l(i13, i11, i12), 1073741824);
        }
        if (i13 != -2 || i12 == Integer.MAX_VALUE) {
            return (i13 != -1 || i12 == Integer.MAX_VALUE) ? View.MeasureSpec.makeMeasureSpec(0, 0) : View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
        }
        return View.MeasureSpec.makeMeasureSpec(i12, Integer.MIN_VALUE);
    }

    public static r4.d m(r4.d dVar, int i11, int i12, int i13, int i14) {
        int i15 = dVar.f48793a - i11;
        if (i15 < 0) {
            i15 = 0;
        }
        int i16 = dVar.f48794b - i12;
        if (i16 < 0) {
            i16 = 0;
        }
        int i17 = dVar.f48795c - i13;
        if (i17 < 0) {
            i17 = 0;
        }
        int i18 = dVar.f48796d - i14;
        return r4.d.c(i15, i16, i17, i18 >= 0 ? i18 : 0);
    }

    @Override // l1.j
    public final void a() {
        this.f1227t.invoke();
    }

    @Override // l1.j
    public final void b() {
        this.f1226f.invoke();
        removeAllViewsInLayout();
    }

    @Override // z4.t
    public final void c(View view, int i11, int i12, int i13, int i14, int i15, int[] iArr) {
        if (this.f1218b.isNestedScrollingEnabled()) {
            float f5 = i11;
            float f11 = -1;
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f5 * f11)) << 32) | (((long) Float.floatToRawIntBits(i12 * f11)) & 4294967295L);
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(i13 * f11)) << 32) | (((long) Float.floatToRawIntBits(i14 * f11)) & 4294967295L);
            int i16 = i15 == 0 ? 1 : 2;
            i iVar = this.f1216a.f48749a;
            i iVar2 = null;
            if (iVar != null && iVar.P) {
                iVar2 = (i) y2.f.j(iVar);
            }
            i iVar3 = iVar2;
            long jX = iVar3 != null ? iVar3.x(jFloatToRawIntBits, i16, jFloatToRawIntBits2) : 0L;
            iArr[0] = g0.q(Float.intBitsToFloat((int) (jX >> 32)));
            iArr[1] = g0.q(Float.intBitsToFloat((int) (jX & 4294967295L)));
        }
    }

    @Override // z4.s
    public final void d(View view, int i11, int i12, int i13, int i14, int i15) {
        if (this.f1218b.isNestedScrollingEnabled()) {
            float f5 = -1;
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(i11 * f5)) << 32) | (((long) Float.floatToRawIntBits(i12 * f5)) & 4294967295L);
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(i13 * f5)) << 32) | (((long) Float.floatToRawIntBits(i14 * f5)) & 4294967295L);
            int i16 = i15 == 0 ? 1 : 2;
            i iVar = this.f1216a.f48749a;
            i iVar2 = null;
            if (iVar != null && iVar.P) {
                iVar2 = (i) y2.f.j(iVar);
            }
            if (iVar2 != null) {
                iVar2.x(jFloatToRawIntBits, i16, jFloatToRawIntBits2);
            }
        }
    }

    @Override // z4.u
    public final v1 e(View view, v1 v1Var) {
        this.R = new v1(v1Var);
        return n(v1Var);
    }

    @Override // z4.s
    public final boolean f(View view, View view2, int i11, int i12) {
        return ((i11 & 2) == 0 && (i11 & 1) == 0) ? false : true;
    }

    @Override // z4.s
    public final void g(View view, View view2, int i11, int i12) {
        e eVar = this.f1221c0;
        if (i12 == 1) {
            eVar.f479c = i11;
        } else {
            eVar.f478b = i11;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean gatherTransparentRegion(Region region) {
        if (region == null) {
            return true;
        }
        int[] iArr = this.W;
        getLocationInWindow(iArr);
        int i11 = iArr[0];
        region.op(i11, iArr[1], getWidth() + i11, getHeight() + iArr[1], Region.Op.DIFFERENCE);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return getClass().getName();
    }

    public final v3.c getDensity() {
        return this.L;
    }

    public final View getInteropView() {
        return this.f1218b;
    }

    public final i0 getLayoutNode() {
        return this.f1225e0;
    }

    @Override // android.view.View
    public ViewGroup.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams layoutParams = this.f1218b.getLayoutParams();
        return layoutParams == null ? new ViewGroup.LayoutParams(-1, -1) : layoutParams;
    }

    public final LifecycleOwner getLifecycleOwner() {
        return this.N;
    }

    public final r getModifier() {
        return this.H;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        e eVar = this.f1221c0;
        return eVar.f479c | eVar.f478b;
    }

    public final c getOnDensityChanged$ui() {
        return this.M;
    }

    public final c getOnModifierChanged$ui() {
        return this.K;
    }

    public final c getOnRequestDisallowInterceptTouchEvent$ui() {
        return this.V;
    }

    public final fz.a getRelease() {
        return this.f1227t;
    }

    public final fz.a getReset() {
        return this.f1226f;
    }

    public final g getSavedStateRegistryOwner() {
        return this.O;
    }

    public final fz.a getUpdate() {
        return this.f1222d;
    }

    public final View getView() {
        return this.f1218b;
    }

    @Override // z4.s
    public final void h(View view, int i11) {
        e eVar = this.f1221c0;
        if (i11 == 1) {
            eVar.f479c = 0;
        } else {
            eVar.f478b = 0;
        }
    }

    @Override // z4.s
    public final void i(View view, int i11, int i12, int[] iArr, int i13) {
        if (this.f1218b.isNestedScrollingEnabled()) {
            float f5 = i11;
            float f11 = -1;
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f5 * f11)) << 32) | (((long) Float.floatToRawIntBits(i12 * f11)) & 4294967295L);
            int i14 = i13 == 0 ? 1 : 2;
            i iVar = this.f1216a.f48749a;
            i iVar2 = null;
            if (iVar != null && iVar.P) {
                iVar2 = (i) y2.f.j(iVar);
            }
            long jM = iVar2 != null ? iVar2.M(i14, jFloatToRawIntBits) : 0L;
            iArr[0] = g0.q(Float.intBitsToFloat((int) (jM >> 32)));
            iArr[1] = g0.q(Float.intBitsToFloat((int) (jM & 4294967295L)));
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        super.invalidateChildInParent(iArr, rect);
        if (!this.f1223d0) {
            this.f1225e0.D();
            return null;
        }
        this.f1218b.postOnAnimation(new qf(3, this.U));
        return null;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f1218b.isNestedScrollingEnabled();
    }

    @Override // l1.j
    public final void j() {
        View view = this.f1218b;
        if (view.getParent() != this) {
            addView(view);
        } else {
            this.f1226f.invoke();
        }
    }

    public final v1 n(v1 v1Var) {
        s1 s1Var = v1Var.f58905a;
        r4.d dVarG = s1Var.g(-1);
        r4.d dVar = r4.d.f48792e;
        if (!dVarG.equals(dVar) || !s1Var.h(-9).equals(dVar) || s1Var.f() != null) {
            v vVar = (v) this.f1225e0.f56892i0.f50086d;
            if (vVar.f57011t0.P) {
                long jB = ew.a.B(vVar.P(0L));
                int i11 = (int) (jB >> 32);
                if (i11 < 0) {
                    i11 = 0;
                }
                int i12 = (int) (jB & 4294967295L);
                if (i12 < 0) {
                    i12 = 0;
                }
                long jM = w2.a0.h(vVar).m();
                int i13 = (int) (jM >> 32);
                int i14 = (int) (jM & 4294967295L);
                long j11 = vVar.f54503c;
                long jB2 = ew.a.B(vVar.P((((long) Float.floatToRawIntBits((int) (j11 >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (j11 & 4294967295L))) & 4294967295L)));
                int i15 = i13 - ((int) (jB2 >> 32));
                if (i15 < 0) {
                    i15 = 0;
                }
                int i16 = i14 - ((int) (4294967295L & jB2));
                int i17 = i16 >= 0 ? i16 : 0;
                if (i11 != 0 || i12 != 0 || i15 != 0 || i17 != 0) {
                    return v1Var.f58905a.n(i11, i12, i15, i17);
                }
            }
        }
        return v1Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.T.invoke();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        if (!this.f1223d0) {
            this.f1225e0.D();
        } else {
            this.f1218b.postOnAnimation(new qf(3, this.U));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getSnapshotObserver().f57019a.b(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        this.f1218b.layout(0, 0, i13 - i11, i14 - i12);
    }

    @Override // android.view.View
    public final void onMeasure(int i11, int i12) {
        View view = this.f1218b;
        if (view.getParent() != this) {
            setMeasuredDimension(View.MeasureSpec.getSize(i11), View.MeasureSpec.getSize(i12));
            return;
        }
        if (view.getVisibility() == 8) {
            setMeasuredDimension(0, 0);
            return;
        }
        view.measure(i11, i12);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
        this.f1217a0 = i11;
        this.f1219b0 = i12;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f5, float f11, boolean z11) {
        if (!this.f1218b.isNestedScrollingEnabled()) {
            return false;
        }
        e0.B(this.f1216a.c(), null, null, new h0(z11, this, gb.r.b(f5 * (-1.0f), f11 * (-1.0f)), null), 3);
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f5, float f11) {
        if (!this.f1218b.isNestedScrollingEnabled()) {
            return false;
        }
        e0.B(this.f1216a.c(), null, null, new ar.b(this, gb.r.b(f5 * (-1.0f), f11 * (-1.0f)), (vy.d) null, 8), 3);
        return false;
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i11) {
        super.onWindowVisibilityChanged(i11);
    }

    @Override // y2.u1
    public final boolean r() {
        return isAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z11) {
        c cVar = this.S;
        if (cVar == null) {
            return true;
        }
        cVar.invoke(rect != null ? f0.F(rect) : null);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z11) {
        c cVar = this.V;
        if (cVar != null) {
            cVar.invoke(Boolean.valueOf(z11));
        }
        super.requestDisallowInterceptTouchEvent(z11);
    }

    public final void setDensity(v3.c cVar) {
        if (cVar != this.L) {
            this.L = cVar;
            c cVar2 = this.M;
            if (cVar2 != null) {
                cVar2.invoke(cVar);
            }
        }
    }

    public final void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
        if (lifecycleOwner != this.N) {
            this.N = lifecycleOwner;
            ViewTreeLifecycleOwner.set(this, lifecycleOwner);
        }
    }

    public final void setModifier(r rVar) {
        if (rVar != this.H) {
            this.H = rVar;
            c cVar = this.K;
            if (cVar != null) {
                cVar.invoke(rVar);
            }
        }
    }

    public final void setOnDensityChanged$ui(c cVar) {
        this.M = cVar;
    }

    public final void setOnModifierChanged$ui(c cVar) {
        this.K = cVar;
    }

    public final void setOnRequestDisallowInterceptTouchEvent$ui(c cVar) {
        this.V = cVar;
    }

    public final void setRelease(fz.a aVar) {
        this.f1227t = aVar;
    }

    public final void setReset(fz.a aVar) {
        this.f1226f = aVar;
    }

    public final void setSavedStateRegistryOwner(g gVar) {
        if (gVar != this.O) {
            this.O = gVar;
            fb.g0.B(this, gVar);
        }
    }

    public final void setUpdate(fz.a aVar) {
        this.f1222d = aVar;
        this.f1224e = true;
        this.T.invoke();
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }
}
