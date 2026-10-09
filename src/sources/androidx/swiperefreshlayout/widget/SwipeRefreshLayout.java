package androidx.swiperefreshlayout.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.ListView;
import com.yalantis.ucrop.view.CropImageView;
import java.util.WeakHashMap;
import oa.c;
import oa.d;
import oa.e;
import oa.f;
import oa.g;
import oa.h;
import oa.i;
import z4.j0;
import z4.q;
import z4.r;
import z4.s0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class SwipeRefreshLayout extends ViewGroup implements q {

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final int[] f2701n0 = {R.attr.enabled};
    public final r H;
    public final int[] K;
    public final int[] L;
    public boolean M;
    public final int N;
    public int O;
    public float P;
    public float Q;
    public boolean R;
    public int S;
    public final DecelerateInterpolator T;
    public final CircleImageView U;
    public int V;
    public int W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public View f2702a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final int f2703a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public i f2704b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final int f2705b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f2706c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public int f2707c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f2708d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final d f2709d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f2710e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public f f2711e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f2712f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public f f2713f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public g f2714g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public g f2715h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public boolean f2716i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public int f2717j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final e f2718k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public final f f2719l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public final f f2720m0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final a9.e f2721t;

    public SwipeRefreshLayout(Context context) {
        this(context, null);
    }

    private void setColorViewAlpha(int i11) {
        this.U.getBackground().setAlpha(i11);
        this.f2709d0.setAlpha(i11);
    }

    public final boolean a() {
        View view = this.f2702a;
        return view instanceof ListView ? ((ListView) view).canScrollList(-1) : view.canScrollVertically(-1);
    }

    public final void b() {
        if (this.f2702a == null) {
            for (int i11 = 0; i11 < getChildCount(); i11++) {
                View childAt = getChildAt(i11);
                if (!childAt.equals(this.U)) {
                    this.f2702a = childAt;
                    return;
                }
            }
        }
    }

    public final void c(float f5) {
        if (f5 > this.f2710e) {
            g(true, true);
            return;
        }
        this.f2706c = false;
        d dVar = this.f2709d0;
        c cVar = dVar.f44782a;
        cVar.f44765e = CropImageView.DEFAULT_ASPECT_RATIO;
        cVar.f44766f = CropImageView.DEFAULT_ASPECT_RATIO;
        dVar.invalidateSelf();
        a aVar = new a(this);
        this.W = this.O;
        f fVar = this.f2720m0;
        fVar.reset();
        fVar.setDuration(200L);
        fVar.setInterpolator(this.T);
        CircleImageView circleImageView = this.U;
        circleImageView.f2700a = aVar;
        circleImageView.clearAnimation();
        this.U.startAnimation(fVar);
        d dVar2 = this.f2709d0;
        c cVar2 = dVar2.f44782a;
        if (cVar2.f44773n) {
            cVar2.f44773n = false;
        }
        dVar2.invalidateSelf();
    }

    public final void d(float f5) {
        g gVar;
        g gVar2;
        d dVar = this.f2709d0;
        c cVar = dVar.f44782a;
        if (!cVar.f44773n) {
            cVar.f44773n = true;
        }
        dVar.invalidateSelf();
        float fMin = Math.min(1.0f, Math.abs(f5 / this.f2710e));
        float fMax = (((float) Math.max(((double) fMin) - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float fAbs = Math.abs(f5) - this.f2710e;
        int i11 = this.f2707c0;
        if (i11 <= 0) {
            i11 = this.f2705b0;
        }
        float f11 = i11;
        double dMax = Math.max(CropImageView.DEFAULT_ASPECT_RATIO, Math.min(fAbs, f11 * 2.0f) / f11) / 4.0f;
        float fPow = ((float) (dMax - Math.pow(dMax, 2.0d))) * 2.0f;
        int i12 = this.f2703a0 + ((int) ((f11 * fMin) + (f11 * fPow * 2.0f)));
        if (this.U.getVisibility() != 0) {
            this.U.setVisibility(0);
        }
        this.U.setScaleX(1.0f);
        this.U.setScaleY(1.0f);
        if (f5 < this.f2710e) {
            if (this.f2709d0.f44782a.f44779t > 76 && ((gVar2 = this.f2714g0) == null || !gVar2.hasStarted() || gVar2.hasEnded())) {
                g gVar3 = new g(this, this.f2709d0.f44782a.f44779t, 76);
                gVar3.setDuration(300L);
                CircleImageView circleImageView = this.U;
                circleImageView.f2700a = null;
                circleImageView.clearAnimation();
                this.U.startAnimation(gVar3);
                this.f2714g0 = gVar3;
            }
        } else if (this.f2709d0.f44782a.f44779t < 255 && ((gVar = this.f2715h0) == null || !gVar.hasStarted() || gVar.hasEnded())) {
            g gVar4 = new g(this, this.f2709d0.f44782a.f44779t, 255);
            gVar4.setDuration(300L);
            CircleImageView circleImageView2 = this.U;
            circleImageView2.f2700a = null;
            circleImageView2.clearAnimation();
            this.U.startAnimation(gVar4);
            this.f2715h0 = gVar4;
        }
        float fMin2 = Math.min(0.8f, fMax * 0.8f);
        d dVar2 = this.f2709d0;
        c cVar2 = dVar2.f44782a;
        cVar2.f44765e = CropImageView.DEFAULT_ASPECT_RATIO;
        cVar2.f44766f = fMin2;
        dVar2.invalidateSelf();
        float fMin3 = Math.min(1.0f, fMax);
        d dVar3 = this.f2709d0;
        c cVar3 = dVar3.f44782a;
        if (fMin3 != cVar3.f44775p) {
            cVar3.f44775p = fMin3;
        }
        dVar3.invalidateSelf();
        d dVar4 = this.f2709d0;
        dVar4.f44782a.f44767g = ((fPow * 2.0f) + ((fMax * 0.4f) - 0.25f)) * 0.5f;
        dVar4.invalidateSelf();
        setTargetOffsetTopAndBottom(i12 - this.O);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f5, float f11, boolean z11) {
        return this.H.a(f5, f11, z11);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f5, float f11) {
        return this.H.b(f5, f11);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i11, int i12, int[] iArr, int[] iArr2) {
        return this.H.c(i11, i12, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i11, int i12, int i13, int i14, int[] iArr) {
        return this.H.d(i11, i12, i13, i14, iArr, 0, null);
    }

    public final void e(float f5) {
        int i11 = this.W;
        setTargetOffsetTopAndBottom((i11 + ((int) ((this.f2703a0 - i11) * f5))) - this.U.getTop());
    }

    public final void f() {
        this.U.clearAnimation();
        this.f2709d0.stop();
        this.U.setVisibility(8);
        setColorViewAlpha(255);
        setTargetOffsetTopAndBottom(this.f2703a0 - this.O);
        this.O = this.U.getTop();
    }

    public final void g(boolean z11, boolean z12) {
        if (this.f2706c != z11) {
            this.f2716i0 = z12;
            b();
            this.f2706c = z11;
            e eVar = this.f2718k0;
            if (!z11) {
                f fVar = new f(this, 1);
                this.f2713f0 = fVar;
                fVar.setDuration(150L);
                CircleImageView circleImageView = this.U;
                circleImageView.f2700a = eVar;
                circleImageView.clearAnimation();
                this.U.startAnimation(this.f2713f0);
                return;
            }
            this.W = this.O;
            f fVar2 = this.f2719l0;
            fVar2.reset();
            fVar2.setDuration(200L);
            fVar2.setInterpolator(this.T);
            if (eVar != null) {
                this.U.f2700a = eVar;
            }
            this.U.clearAnimation();
            this.U.startAnimation(fVar2);
        }
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i11, int i12) {
        int i13 = this.V;
        if (i13 < 0) {
            return i12;
        }
        if (i12 == i11 - 1) {
            return i13;
        }
        return i12 >= i13 ? i12 + 1 : i12;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        a9.e eVar = this.f2721t;
        return eVar.f479c | eVar.f478b;
    }

    public int getProgressCircleDiameter() {
        return this.f2717j0;
    }

    public int getProgressViewEndOffset() {
        return this.f2705b0;
    }

    public int getProgressViewStartOffset() {
        return this.f2703a0;
    }

    public final void h(float f5) {
        float f11 = this.Q;
        float f12 = f5 - f11;
        float f13 = this.f2708d;
        if (f12 <= f13 || this.R) {
            return;
        }
        this.P = f11 + f13;
        this.R = true;
        this.f2709d0.setAlpha(76);
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.H.f(0);
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.H.f58886d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f();
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0058  */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int iFindPointerIndex;
        b();
        int actionMasked = motionEvent.getActionMasked();
        if (isEnabled() && !a() && !this.f2706c && !this.M) {
            if (actionMasked != 0) {
                if (actionMasked == 1) {
                    this.R = false;
                    this.S = -1;
                } else if (actionMasked == 2) {
                    int i11 = this.S;
                    if (i11 != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i11)) >= 0) {
                        h(motionEvent.getY(iFindPointerIndex));
                    }
                } else if (actionMasked == 3) {
                    this.R = false;
                    this.S = -1;
                } else if (actionMasked == 6) {
                    int actionIndex = motionEvent.getActionIndex();
                    if (motionEvent.getPointerId(actionIndex) == this.S) {
                        this.S = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                    }
                }
                return this.R;
            }
            setTargetOffsetTopAndBottom(this.f2703a0 - this.U.getTop());
            int pointerId = motionEvent.getPointerId(0);
            this.S = pointerId;
            this.R = false;
            int iFindPointerIndex2 = motionEvent.findPointerIndex(pointerId);
            if (iFindPointerIndex2 >= 0) {
                this.Q = motionEvent.getY(iFindPointerIndex2);
                return this.R;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() == 0) {
            return;
        }
        if (this.f2702a == null) {
            b();
        }
        View view = this.f2702a;
        if (view == null) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
        int measuredWidth2 = this.U.getMeasuredWidth();
        int measuredHeight2 = this.U.getMeasuredHeight();
        int i15 = measuredWidth / 2;
        int i16 = measuredWidth2 / 2;
        int i17 = this.O;
        this.U.layout(i15 - i16, i17, i15 + i16, measuredHeight2 + i17);
    }

    @Override // android.view.View
    public final void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        if (this.f2702a == null) {
            b();
        }
        View view = this.f2702a;
        if (view == null) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
        this.U.measure(View.MeasureSpec.makeMeasureSpec(this.f2717j0, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f2717j0, 1073741824));
        this.V = -1;
        for (int i13 = 0; i13 < getChildCount(); i13++) {
            if (getChildAt(i13) == this.U) {
                this.V = i13;
                return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f5, float f11, boolean z11) {
        return this.H.a(f5, f11, z11);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f5, float f11) {
        return this.H.b(f5, f11);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i11, int i12, int[] iArr) {
        if (i12 > 0) {
            float f5 = this.f2712f;
            if (f5 > CropImageView.DEFAULT_ASPECT_RATIO) {
                float f11 = i12;
                if (f11 > f5) {
                    iArr[1] = i12 - ((int) f5);
                    this.f2712f = CropImageView.DEFAULT_ASPECT_RATIO;
                } else {
                    this.f2712f = f5 - f11;
                    iArr[1] = i12;
                }
                d(this.f2712f);
            }
        }
        int i13 = i11 - iArr[0];
        int i14 = i12 - iArr[1];
        int[] iArr2 = this.K;
        if (dispatchNestedPreScroll(i13, i14, iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i11, int i12, int i13, int i14) {
        dispatchNestedScroll(i11, i12, i13, i14, this.L);
        int i15 = i14 + this.L[1];
        if (i15 >= 0 || a()) {
            return;
        }
        float fAbs = this.f2712f + Math.abs(i15);
        this.f2712f = fAbs;
        d(fAbs);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i11) {
        this.f2721t.f478b = i11;
        startNestedScroll(i11 & 2);
        this.f2712f = CropImageView.DEFAULT_ASPECT_RATIO;
        this.M = true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i11) {
        return (!isEnabled() || this.f2706c || (i11 & 2) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        this.f2721t.f478b = 0;
        this.M = false;
        float f5 = this.f2712f;
        if (f5 > CropImageView.DEFAULT_ASPECT_RATIO) {
            c(f5);
            this.f2712f = CropImageView.DEFAULT_ASPECT_RATIO;
        }
        stopNestedScroll();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (isEnabled() && !a() && !this.f2706c && !this.M) {
            if (actionMasked == 0) {
                this.S = motionEvent.getPointerId(0);
                this.R = false;
                return true;
            }
            if (actionMasked == 1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.S);
                if (iFindPointerIndex >= 0) {
                    if (this.R) {
                        float y10 = (motionEvent.getY(iFindPointerIndex) - this.P) * 0.5f;
                        this.R = false;
                        c(y10);
                    }
                    this.S = -1;
                    return false;
                }
            } else if (actionMasked == 2) {
                int iFindPointerIndex2 = motionEvent.findPointerIndex(this.S);
                if (iFindPointerIndex2 >= 0) {
                    float y11 = motionEvent.getY(iFindPointerIndex2);
                    h(y11);
                    if (this.R) {
                        float f5 = (y11 - this.P) * 0.5f;
                        if (f5 > CropImageView.DEFAULT_ASPECT_RATIO) {
                            d(f5);
                        }
                    }
                    return true;
                }
            } else if (actionMasked != 3) {
                if (actionMasked != 5) {
                    if (actionMasked == 6) {
                        int actionIndex = motionEvent.getActionIndex();
                        if (motionEvent.getPointerId(actionIndex) == this.S) {
                            this.S = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                            return true;
                        }
                    }
                    return true;
                }
                int actionIndex2 = motionEvent.getActionIndex();
                if (actionIndex2 >= 0) {
                    this.S = motionEvent.getPointerId(actionIndex2);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z11) {
        View view = this.f2702a;
        if (view != null) {
            WeakHashMap weakHashMap = s0.f58893a;
            if (!j0.h(view)) {
                return;
            }
        }
        super.requestDisallowInterceptTouchEvent(z11);
    }

    public void setAnimationProgress(float f5) {
        this.U.setScaleX(f5);
        this.U.setScaleY(f5);
    }

    @Deprecated
    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(int... iArr) {
        b();
        d dVar = this.f2709d0;
        c cVar = dVar.f44782a;
        cVar.f44769i = iArr;
        cVar.a(0);
        cVar.a(0);
        dVar.invalidateSelf();
    }

    public void setColorSchemeResources(int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i11 = 0; i11 < iArr.length; i11++) {
            iArr2[i11] = context.getColor(iArr[i11]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setDistanceToTriggerSync(int i11) {
        this.f2710e = i11;
    }

    @Override // android.view.View
    public void setEnabled(boolean z11) {
        super.setEnabled(z11);
        if (z11) {
            return;
        }
        f();
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z11) {
        this.H.g(z11);
    }

    public void setOnRefreshListener(i iVar) {
        this.f2704b = iVar;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i11) {
        setProgressBackgroundColorSchemeResource(i11);
    }

    public void setProgressBackgroundColorSchemeColor(int i11) {
        this.U.setBackgroundColor(i11);
    }

    public void setProgressBackgroundColorSchemeResource(int i11) {
        setProgressBackgroundColorSchemeColor(getContext().getColor(i11));
    }

    public void setRefreshing(boolean z11) {
        if (!z11 || this.f2706c == z11) {
            g(z11, false);
            return;
        }
        this.f2706c = z11;
        setTargetOffsetTopAndBottom((this.f2705b0 + this.f2703a0) - this.O);
        this.f2716i0 = false;
        this.U.setVisibility(0);
        this.f2709d0.setAlpha(255);
        f fVar = new f(this, 0);
        this.f2711e0 = fVar;
        fVar.setDuration(this.N);
        e eVar = this.f2718k0;
        if (eVar != null) {
            this.U.f2700a = eVar;
        }
        this.U.clearAnimation();
        this.U.startAnimation(this.f2711e0);
    }

    public void setSize(int i11) {
        if (i11 == 0 || i11 == 1) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (i11 == 0) {
                this.f2717j0 = (int) (displayMetrics.density * 56.0f);
            } else {
                this.f2717j0 = (int) (displayMetrics.density * 40.0f);
            }
            this.U.setImageDrawable(null);
            this.f2709d0.c(i11);
            this.U.setImageDrawable(this.f2709d0);
        }
    }

    public void setSlingshotDistance(int i11) {
        this.f2707c0 = i11;
    }

    public void setTargetOffsetTopAndBottom(int i11) {
        CircleImageView circleImageView = this.U;
        circleImageView.bringToFront();
        WeakHashMap weakHashMap = s0.f58893a;
        circleImageView.offsetTopAndBottom(i11);
        this.O = circleImageView.getTop();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i11) {
        return this.H.h(i11, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        this.H.i(0);
    }

    public SwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2706c = false;
        this.f2710e = -1.0f;
        this.K = new int[2];
        this.L = new int[2];
        this.S = -1;
        this.V = -1;
        this.f2718k0 = new e(this, 0);
        this.f2719l0 = new f(this, 2);
        this.f2720m0 = new f(this, 3);
        this.f2708d = ViewConfiguration.get(context).getScaledTouchSlop();
        this.N = getResources().getInteger(R.integer.config_mediumAnimTime);
        setWillNotDraw(false);
        this.T = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f2717j0 = (int) (displayMetrics.density * 40.0f);
        CircleImageView circleImageView = new CircleImageView(getContext());
        float f5 = circleImageView.getContext().getResources().getDisplayMetrics().density;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        WeakHashMap weakHashMap = s0.f58893a;
        j0.k(circleImageView, f5 * 4.0f);
        shapeDrawable.getPaint().setColor(-328966);
        circleImageView.setBackground(shapeDrawable);
        this.U = circleImageView;
        d dVar = new d(getContext());
        this.f2709d0 = dVar;
        dVar.c(1);
        this.U.setImageDrawable(this.f2709d0);
        this.U.setVisibility(8);
        addView(this.U);
        setChildrenDrawingOrderEnabled(true);
        int i11 = (int) (displayMetrics.density * 64.0f);
        this.f2705b0 = i11;
        this.f2710e = i11;
        this.f2721t = new a9.e(7);
        this.H = new r(this);
        setNestedScrollingEnabled(true);
        int i12 = -this.f2717j0;
        this.O = i12;
        this.f2703a0 = i12;
        e(1.0f);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f2701n0);
        setEnabled(typedArrayObtainStyledAttributes.getBoolean(0, true));
        typedArrayObtainStyledAttributes.recycle();
    }

    public void setOnChildScrollUpCallback(h hVar) {
    }
}
