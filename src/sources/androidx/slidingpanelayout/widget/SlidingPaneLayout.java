package androidx.slidingpanelayout.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.yalantis.ucrop.view.CropImageView;
import dm.a;
import hh.p0;
import ia.b;
import ia.f;
import ia.g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.m;
import l5.e;
import r4.d;
import rz.e0;
import rz.z1;
import z4.k0;
import z4.s0;
import z4.v1;
import za.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class SlidingPaneLayout extends ViewGroup {

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final boolean f2690c0;
    public float H;
    public int K;
    public boolean L;
    public int M;
    public float N;
    public float O;
    public final CopyOnWriteArrayList P;
    public final e Q;
    public boolean R;
    public boolean S;
    public final Rect T;
    public final ArrayList U;
    public int V;
    public c W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2691a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final a f2692a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2693b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public b f2694b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Drawable f2695c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Drawable f2696d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f2697e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public View f2698f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f2699t;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class TouchBlocker extends FrameLayout {
        @Override // android.view.View
        public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.View
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            return true;
        }
    }

    static {
        f2690c0 = Build.VERSION.SDK_INT >= 29;
    }

    public SlidingPaneLayout(Context context) {
        this(context, null);
    }

    private d getSystemGestureInsets() {
        if (!f2690c0) {
            return null;
        }
        WeakHashMap weakHashMap = s0.f58893a;
        v1 v1VarA = k0.a(this);
        if (v1VarA != null) {
            return v1VarA.f58905a.k();
        }
        return null;
    }

    private void setFoldingFeatureObserver(b bVar) {
        this.f2694b0 = bVar;
        bVar.getClass();
        a onFoldingFeatureChangeListener = this.f2692a0;
        m.f(onFoldingFeatureChangeListener, "onFoldingFeatureChangeListener");
        bVar.f34283d = onFoldingFeatureChangeListener;
    }

    public final boolean a(View view) {
        if (view == null) {
            return false;
        }
        return this.f2697e && ((ia.e) view.getLayoutParams()).f34291c && this.f2699t > CropImageView.DEFAULT_ASPECT_RATIO;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i11, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() != 1) {
            super.addView(view, i11, layoutParams);
            return;
        }
        TouchBlocker touchBlocker = new TouchBlocker(view.getContext());
        touchBlocker.addView(view);
        super.addView(touchBlocker, i11, layoutParams);
    }

    public final boolean b() {
        WeakHashMap weakHashMap = s0.f58893a;
        return getLayoutDirection() == 1;
    }

    public final boolean c() {
        return !this.f2697e || this.f2699t == CropImageView.DEFAULT_ASPECT_RATIO;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof ia.e) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public final void computeScroll() {
        e eVar = this.Q;
        if (eVar.h()) {
            if (!this.f2697e) {
                eVar.a();
            } else {
                WeakHashMap weakHashMap = s0.f58893a;
                postInvalidateOnAnimation();
            }
        }
    }

    public final void d(float f5) {
        boolean zB = b();
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt != this.f2698f) {
                float f11 = 1.0f - this.H;
                int i12 = this.M;
                this.H = f5;
                int i13 = ((int) (f11 * i12)) - ((int) ((1.0f - f5) * i12));
                if (zB) {
                    i13 = -i13;
                }
                childAt.offsetLeftAndRight(i13);
            }
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i11;
        int right;
        super.draw(canvas);
        Drawable drawable = b() ? this.f2696d : this.f2695c;
        View childAt = getChildCount() > 1 ? getChildAt(1) : null;
        if (childAt == null || drawable == null) {
            return;
        }
        int top = childAt.getTop();
        int bottom = childAt.getBottom();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        if (b()) {
            right = childAt.getRight();
            i11 = intrinsicWidth + right;
        } else {
            int left = childAt.getLeft();
            int i12 = left - intrinsicWidth;
            i11 = left;
            right = i12;
        }
        drawable.setBounds(right, top, i11, bottom);
        drawable.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j11) {
        boolean zB = b() ^ c();
        e eVar = this.Q;
        if (zB) {
            eVar.f39763q = 1;
            d systemGestureInsets = getSystemGestureInsets();
            if (systemGestureInsets != null) {
                eVar.f39761o = Math.max(eVar.f39762p, systemGestureInsets.f48793a);
            }
        } else {
            eVar.f39763q = 2;
            d systemGestureInsets2 = getSystemGestureInsets();
            if (systemGestureInsets2 != null) {
                eVar.f39761o = Math.max(eVar.f39762p, systemGestureInsets2.f48795c);
            }
        }
        ia.e eVar2 = (ia.e) view.getLayoutParams();
        int iSave = canvas.save();
        if (this.f2697e && !eVar2.f34290b && this.f2698f != null) {
            Rect rect = this.T;
            canvas.getClipBounds(rect);
            if (b()) {
                rect.left = Math.max(rect.left, this.f2698f.getRight());
            } else {
                rect.right = Math.min(rect.right, this.f2698f.getLeft());
            }
            canvas.clipRect(rect);
        }
        boolean zDrawChild = super.drawChild(canvas, view, j11);
        canvas.restoreToCount(iSave);
        return zDrawChild;
    }

    public final boolean e(float f5) {
        int paddingLeft;
        if (this.f2697e) {
            boolean zB = b();
            ia.e eVar = (ia.e) this.f2698f.getLayoutParams();
            if (zB) {
                int paddingRight = getPaddingRight() + ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
                paddingLeft = (int) (getWidth() - (((f5 * this.K) + paddingRight) + this.f2698f.getWidth()));
            } else {
                paddingLeft = (int) ((f5 * this.K) + getPaddingLeft() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin);
            }
            View view = this.f2698f;
            if (this.Q.t(view, paddingLeft, view.getTop())) {
                int childCount = getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = getChildAt(i11);
                    if (childAt.getVisibility() == 4) {
                        childAt.setVisibility(0);
                    }
                }
                WeakHashMap weakHashMap = s0.f58893a;
                postInvalidateOnAnimation();
                return true;
            }
        }
        return false;
    }

    public final void f(View view) {
        int left;
        int right;
        int top;
        int bottom;
        View childAt;
        View view2 = view;
        boolean zB = b();
        int width = zB ? getWidth() - getPaddingRight() : getPaddingLeft();
        int paddingLeft = zB ? getPaddingLeft() : getWidth() - getPaddingRight();
        int paddingTop = getPaddingTop();
        int height = getHeight() - getPaddingBottom();
        if (view2 == null || !view2.isOpaque()) {
            left = 0;
            right = 0;
            top = 0;
            bottom = 0;
        } else {
            left = view2.getLeft();
            right = view2.getRight();
            top = view2.getTop();
            bottom = view2.getBottom();
        }
        int childCount = getChildCount();
        int i11 = 0;
        while (i11 < childCount && (childAt = getChildAt(i11)) != view2) {
            if (childAt.getVisibility() != 8) {
                childAt.setVisibility((Math.max(zB ? paddingLeft : width, childAt.getLeft()) < left || Math.max(paddingTop, childAt.getTop()) < top || Math.min(zB ? width : paddingLeft, childAt.getRight()) > right || Math.min(height, childAt.getBottom()) > bottom) ? 0 : 4);
            }
            i11++;
            view2 = view;
            zB = zB;
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        ia.e eVar = new ia.e(-1, -1);
        eVar.f34289a = CropImageView.DEFAULT_ASPECT_RATIO;
        return eVar;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ia.e eVar = new ia.e((ViewGroup.MarginLayoutParams) layoutParams);
            eVar.f34289a = CropImageView.DEFAULT_ASPECT_RATIO;
            return eVar;
        }
        ia.e eVar2 = new ia.e(layoutParams);
        eVar2.f34289a = CropImageView.DEFAULT_ASPECT_RATIO;
        return eVar2;
    }

    @Deprecated
    public int getCoveredFadeColor() {
        return this.f2693b;
    }

    public final int getLockMode() {
        return this.V;
    }

    public int getParallaxDistance() {
        return this.M;
    }

    @Deprecated
    public int getSliderFadeColor() {
        return this.f2691a;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        vy.d dVar;
        Activity activity;
        super.onAttachedToWindow();
        this.S = true;
        if (this.f2694b0 != null) {
            Context context = getContext();
            while (true) {
                dVar = null;
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                } else {
                    if (context instanceof Activity) {
                        activity = (Activity) context;
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            if (activity != null) {
                b bVar = this.f2694b0;
                bVar.getClass();
                z1 z1Var = bVar.f34282c;
                if (z1Var != null) {
                    z1Var.cancel(null);
                }
                bVar.f34282c = e0.B(e0.c(e0.p(bVar.f34281b)), null, null, new gu.b(14, bVar, activity, dVar), 3);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        z1 z1Var;
        super.onDetachedFromWindow();
        this.S = true;
        b bVar = this.f2694b0;
        if (bVar != null && (z1Var = bVar.f34282c) != null) {
            z1Var.cancel(null);
        }
        ArrayList arrayList = this.U;
        if (arrayList.size() > 0) {
            throw p0.e(0, arrayList);
        }
        arrayList.clear();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z11;
        View childAt;
        int actionMasked = motionEvent.getActionMasked();
        boolean z12 = this.f2697e;
        e eVar = this.Q;
        if (!z12 && actionMasked == 0 && getChildCount() > 1 && (childAt = getChildAt(1)) != null) {
            int x11 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            eVar.getClass();
            this.R = e.k(childAt, x11, y10);
        }
        if (!this.f2697e || (this.L && actionMasked != 0)) {
            eVar.b();
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (actionMasked == 3 || actionMasked == 1) {
            eVar.b();
            return false;
        }
        if (actionMasked == 0) {
            this.L = false;
            float x12 = motionEvent.getX();
            float y11 = motionEvent.getY();
            this.N = x12;
            this.O = y11;
            eVar.getClass();
            if (e.k(this.f2698f, (int) x12, (int) y11) && a(this.f2698f)) {
                z11 = true;
            }
            return !eVar.s(motionEvent) || z11;
        }
        if (actionMasked == 2) {
            float x13 = motionEvent.getX();
            float y12 = motionEvent.getY();
            float fAbs = Math.abs(x13 - this.N);
            float fAbs2 = Math.abs(y12 - this.O);
            if (fAbs > eVar.f39749b && fAbs2 > fAbs) {
                eVar.b();
                this.L = true;
                return false;
            }
        }
        z11 = false;
        if (eVar.s(motionEvent)) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00af  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:46:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ec  */
    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        boolean z12;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        c cVar;
        int iWidth;
        ya.b bVar;
        za.b bVar2;
        za.b bVar3 = za.b.f59051d;
        boolean zB = b();
        int i21 = i13 - i11;
        int paddingRight = zB ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = zB ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int childCount = getChildCount();
        if (this.S) {
            this.f2699t = (this.f2697e && this.R) ? CropImageView.DEFAULT_ASPECT_RATIO : 1.0f;
        }
        int i22 = paddingRight;
        int i23 = 0;
        while (i23 < childCount) {
            View childAt = getChildAt(i23);
            if (childAt.getVisibility() == 8) {
                z12 = zB;
            } else {
                ia.e eVar = (ia.e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                if (eVar.f34290b) {
                    int i24 = i21 - paddingLeft;
                    int iMin = (Math.min(paddingRight, i24) - i22) - (((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
                    this.K = iMin;
                    int i25 = zB ? ((ViewGroup.MarginLayoutParams) eVar).rightMargin : ((ViewGroup.MarginLayoutParams) eVar).leftMargin;
                    z12 = zB;
                    eVar.f34291c = (measuredWidth / 2) + ((i22 + i25) + iMin) > i24;
                    float f5 = iMin;
                    int i26 = (int) (this.f2699t * f5);
                    i15 = i25 + i26 + i22;
                    this.f2699t = i26 / f5;
                } else {
                    z12 = zB;
                    if (!this.f2697e || (i16 = this.M) == 0) {
                        i15 = paddingRight;
                    } else {
                        i17 = (int) ((1.0f - this.f2699t) * i16);
                        i15 = paddingRight;
                    }
                    if (z12) {
                        i19 = (i21 - i15) + i17;
                        i18 = i19 - measuredWidth;
                    } else {
                        i18 = i15 - i17;
                        i19 = i18 + measuredWidth;
                    }
                    childAt.layout(i18, paddingTop, i19, childAt.getMeasuredHeight() + paddingTop);
                    cVar = this.W;
                    if (cVar != null) {
                        bVar = cVar.f59059a;
                        if (bVar.b() > bVar.a()) {
                            bVar2 = za.b.f59052e;
                        } else {
                            bVar2 = bVar3;
                        }
                        if (bVar2 == bVar3 || !this.W.a()) {
                            iWidth = 0;
                        } else {
                            iWidth = this.W.f59059a.c().width();
                        }
                    } else {
                        iWidth = 0;
                    }
                    paddingRight = Math.abs(iWidth) + childAt.getWidth() + paddingRight;
                    i22 = i15;
                }
                i17 = 0;
                if (z12) {
                    i19 = (i21 - i15) + i17;
                    i18 = i19 - measuredWidth;
                } else {
                    i18 = i15 - i17;
                    i19 = i18 + measuredWidth;
                }
                childAt.layout(i18, paddingTop, i19, childAt.getMeasuredHeight() + paddingTop);
                cVar = this.W;
                if (cVar != null) {
                    bVar = cVar.f59059a;
                    if (bVar.b() > bVar.a()) {
                        bVar2 = za.b.f59052e;
                    } else {
                        bVar2 = bVar3;
                    }
                    if (bVar2 == bVar3) {
                        iWidth = 0;
                    } else {
                        iWidth = 0;
                    }
                } else {
                    iWidth = 0;
                }
                paddingRight = Math.abs(iWidth) + childAt.getWidth() + paddingRight;
                i22 = i15;
            }
            i23++;
            zB = z12;
        }
        if (this.S) {
            if (this.f2697e && this.M != 0) {
                d(this.f2699t);
            }
            f(this.f2698f);
        }
        this.S = false;
    }

    /* JADX WARN: Code duplicated, block: B:139:0x00e3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:141:0x00e3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x0080 A[PHI: r16
      0x0080: PHI (r16v3 float) = (r16v1 float), (r16v4 float) binds: [B:16:0x0076, B:18:0x007c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x0090 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x0092  */
    /* JADX WARN: Code duplicated, block: B:24:0x0094  */
    /* JADX WARN: Code duplicated, block: B:26:0x009b  */
    /* JADX WARN: Code duplicated, block: B:28:0x009e  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:32:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:35:0x00cf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:42:0x00db  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:91:0x01a9  */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v32 */
    @Override // android.view.View
    public final void onMeasure(int i11, int i12) {
        int paddingTop;
        int iMin;
        int i13;
        int iMax;
        int iMakeMeasureSpec;
        int i14;
        ArrayList arrayList;
        int i15;
        int i16;
        int minimumWidth;
        int iMax2;
        int i17;
        int iMakeMeasureSpec2;
        int measuredHeight;
        boolean z11;
        int i18;
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i12);
        int size2 = View.MeasureSpec.getSize(i12);
        ?? r9 = 0;
        if (mode2 != Integer.MIN_VALUE) {
            iMin = mode2 != 1073741824 ? 0 : (size2 - getPaddingTop()) - getPaddingBottom();
            paddingTop = iMin;
        } else {
            paddingTop = (size2 - getPaddingTop()) - getPaddingBottom();
            iMin = 0;
        }
        int iMax3 = Math.max((size - getPaddingLeft()) - getPaddingRight(), 0);
        int childCount = getChildCount();
        this.f2698f = null;
        int i19 = 0;
        boolean z12 = false;
        int i21 = iMax3;
        float f5 = CropImageView.DEFAULT_ASPECT_RATIO;
        while (true) {
            i13 = 8;
            if (i19 >= childCount) {
                break;
            }
            View childAt = getChildAt(i19);
            ia.e eVar = (ia.e) childAt.getLayoutParams();
            int i22 = iMax3;
            if (childAt.getVisibility() == 8) {
                eVar.f34291c = r9;
            } else {
                float f11 = eVar.f34289a;
                if (f11 > CropImageView.DEFAULT_ASPECT_RATIO) {
                    f5 += f11;
                    if (((ViewGroup.MarginLayoutParams) eVar).width != 0) {
                        iMax2 = Math.max(i22 - (((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin), (int) r9);
                        i17 = ((ViewGroup.MarginLayoutParams) eVar).width;
                        if (i17 == -2) {
                            if (mode == 0) {
                                i18 = mode;
                            } else {
                                i18 = Integer.MIN_VALUE;
                            }
                            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMax2, i18);
                        } else if (i17 == -1) {
                            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMax2, mode);
                        } else {
                            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i17, 1073741824);
                        }
                        childAt.measure(iMakeMeasureSpec2, ViewGroup.getChildMeasureSpec(i12, getPaddingBottom() + getPaddingTop(), ((ViewGroup.MarginLayoutParams) eVar).height));
                        int measuredWidth = childAt.getMeasuredWidth();
                        measuredHeight = childAt.getMeasuredHeight();
                        if (measuredHeight > iMin) {
                            if (mode2 == Integer.MIN_VALUE) {
                                iMin = Math.min(measuredHeight, paddingTop);
                            } else if (mode2 == 0) {
                                iMin = measuredHeight;
                            }
                        }
                        i21 -= measuredWidth;
                        if (i19 != 0) {
                            if (i21 < 0) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            eVar.f34290b = z11;
                            z12 |= z11;
                            if (z11) {
                                this.f2698f = childAt;
                            }
                        }
                    }
                } else {
                    iMax2 = Math.max(i22 - (((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin), (int) r9);
                    i17 = ((ViewGroup.MarginLayoutParams) eVar).width;
                    if (i17 == -2) {
                        if (mode == 0) {
                            i18 = mode;
                        } else {
                            i18 = Integer.MIN_VALUE;
                        }
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMax2, i18);
                    } else if (i17 == -1) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMax2, mode);
                    } else {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i17, 1073741824);
                    }
                    childAt.measure(iMakeMeasureSpec2, ViewGroup.getChildMeasureSpec(i12, getPaddingBottom() + getPaddingTop(), ((ViewGroup.MarginLayoutParams) eVar).height));
                    int measuredWidth2 = childAt.getMeasuredWidth();
                    measuredHeight = childAt.getMeasuredHeight();
                    if (measuredHeight > iMin) {
                        if (mode2 == Integer.MIN_VALUE) {
                            iMin = Math.min(measuredHeight, paddingTop);
                        } else if (mode2 == 0) {
                            iMin = measuredHeight;
                        }
                    }
                    i21 -= measuredWidth2;
                    if (i19 != 0) {
                        if (i21 < 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        eVar.f34290b = z11;
                        z12 |= z11;
                        if (z11) {
                            this.f2698f = childAt;
                        }
                    }
                }
            }
            i19++;
            iMax3 = i22;
            r9 = 0;
        }
        int i23 = iMax3;
        int i24 = 1;
        if (z12 || f5 > CropImageView.DEFAULT_ASPECT_RATIO) {
            int i25 = 0;
            while (i25 < childCount) {
                View childAt2 = getChildAt(i25);
                if (childAt2.getVisibility() == i13) {
                    i14 = i25;
                } else {
                    ia.e eVar2 = (ia.e) childAt2.getLayoutParams();
                    int i26 = ((ViewGroup.MarginLayoutParams) eVar2).width;
                    float f12 = eVar2.f34289a;
                    int measuredWidth3 = (i26 != 0 || f12 <= CropImageView.DEFAULT_ASPECT_RATIO) ? childAt2.getMeasuredWidth() : 0;
                    if (z12) {
                        iMax = i23 - (((ViewGroup.MarginLayoutParams) eVar2).leftMargin + ((ViewGroup.MarginLayoutParams) eVar2).rightMargin);
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
                    } else if (f12 > CropImageView.DEFAULT_ASPECT_RATIO) {
                        iMax = ((int) ((f12 * Math.max(0, i21)) / f5)) + measuredWidth3;
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
                    } else {
                        iMax = measuredWidth3;
                        iMakeMeasureSpec = 0;
                    }
                    int paddingBottom = getPaddingBottom() + getPaddingTop();
                    ia.e eVar3 = (ia.e) childAt2.getLayoutParams();
                    i14 = i25;
                    int iMakeMeasureSpec3 = (((ViewGroup.MarginLayoutParams) eVar3).width != 0 || eVar3.f34289a <= CropImageView.DEFAULT_ASPECT_RATIO) ? View.MeasureSpec.makeMeasureSpec(childAt2.getMeasuredHeight(), 1073741824) : ViewGroup.getChildMeasureSpec(i12, paddingBottom, ((ViewGroup.MarginLayoutParams) eVar3).height);
                    if (measuredWidth3 != iMax) {
                        childAt2.measure(iMakeMeasureSpec, iMakeMeasureSpec3);
                        int measuredHeight2 = childAt2.getMeasuredHeight();
                        if (measuredHeight2 > iMin) {
                            if (mode2 == Integer.MIN_VALUE) {
                                measuredHeight2 = Math.min(measuredHeight2, paddingTop);
                            } else if (mode2 == 0) {
                            }
                            iMin = measuredHeight2;
                        }
                    }
                }
                i25 = i14 + 1;
                i13 = 8;
            }
        }
        c cVar = this.W;
        if (cVar == null || !cVar.a() || this.W.f59059a.c().left == 0 || this.W.f59059a.c().top != 0) {
            arrayList = null;
        } else {
            c cVar2 = this.W;
            int[] iArr = new int[2];
            getLocationInWindow(iArr);
            int i27 = iArr[0];
            Rect rect = new Rect(i27, iArr[1], getWidth() + i27, getWidth() + iArr[1]);
            Rect rect2 = new Rect(cVar2.f59059a.c());
            boolean zIntersect = rect2.intersect(rect);
            if (!(rect2.width() == 0 && rect2.height() == 0) && zIntersect) {
                rect2.offset(-iArr[0], -iArr[1]);
            } else {
                rect2 = null;
            }
            if (rect2 == null) {
                arrayList = null;
            } else {
                Rect rect3 = new Rect(getPaddingLeft(), getPaddingTop(), Math.max(getPaddingLeft(), rect2.left), getHeight() - getPaddingBottom());
                int width = getWidth() - getPaddingRight();
                arrayList = new ArrayList(Arrays.asList(rect3, new Rect(Math.min(width, rect2.right), getPaddingTop(), width, getHeight() - getPaddingBottom())));
            }
        }
        if (arrayList != null && !z12) {
            int i28 = 0;
            while (i28 < childCount) {
                View childAt3 = getChildAt(i28);
                if (childAt3.getVisibility() != 8) {
                    Rect rect4 = (Rect) arrayList.get(i28);
                    ia.e eVar4 = (ia.e) childAt3.getLayoutParams();
                    int i29 = ((ViewGroup.MarginLayoutParams) eVar4).leftMargin + ((ViewGroup.MarginLayoutParams) eVar4).rightMargin;
                    int iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(childAt3.getMeasuredHeight(), 1073741824);
                    childAt3.measure(View.MeasureSpec.makeMeasureSpec(rect4.width(), Integer.MIN_VALUE), iMakeMeasureSpec4);
                    if ((childAt3.getMeasuredWidthAndState() & 16777216) != i24) {
                        boolean z13 = childAt3 instanceof TouchBlocker;
                        if (z13) {
                            i16 = 0;
                            View childAt4 = ((TouchBlocker) childAt3).getChildAt(0);
                            WeakHashMap weakHashMap = s0.f58893a;
                            minimumWidth = childAt4.getMinimumWidth();
                        } else {
                            i16 = 0;
                            WeakHashMap weakHashMap2 = s0.f58893a;
                            minimumWidth = childAt3.getMinimumWidth();
                        }
                        if (minimumWidth != 0) {
                            if (rect4.width() < (z13 ? ((TouchBlocker) childAt3).getChildAt(i16).getMinimumWidth() : childAt3.getMinimumWidth())) {
                            }
                        }
                        childAt3.measure(View.MeasureSpec.makeMeasureSpec(rect4.width(), 1073741824), iMakeMeasureSpec4);
                    }
                    childAt3.measure(View.MeasureSpec.makeMeasureSpec(i23 - i29, 1073741824), iMakeMeasureSpec4);
                    if (i28 != 0) {
                        i15 = 1;
                        eVar4.f34290b = true;
                        this.f2698f = childAt3;
                        z12 = true;
                    }
                    i28++;
                    i24 = i15;
                }
                i15 = 1;
                i28++;
                i24 = i15;
            }
        }
        setMeasuredDimension(size, getPaddingBottom() + getPaddingTop() + iMin);
        this.f2697e = z12;
        e eVar5 = this.Q;
        if (eVar5.f39748a == 0 || z12) {
            return;
        }
        eVar5.a();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        g gVar = (g) parcelable;
        super.onRestoreInstanceState(gVar.f37910a);
        if (gVar.f34292c) {
            if (!this.f2697e) {
                this.R = true;
            }
            if (this.S || e(CropImageView.DEFAULT_ASPECT_RATIO)) {
                this.R = true;
            }
        } else {
            if (!this.f2697e) {
                this.R = false;
            }
            if (this.S || e(1.0f)) {
                this.R = false;
            }
        }
        this.R = gVar.f34292c;
        setLockMode(gVar.f34293d);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        g gVar = new g(super.onSaveInstanceState());
        gVar.f34292c = this.f2697e ? c() : this.R;
        gVar.f34293d = this.V;
        return gVar;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i11, int i12, int i13, int i14) {
        super.onSizeChanged(i11, i12, i13, i14);
        if (i11 != i13) {
            this.S = true;
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f2697e) {
            return super.onTouchEvent(motionEvent);
        }
        e eVar = this.Q;
        eVar.l(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            float x11 = motionEvent.getX();
            float y10 = motionEvent.getY();
            this.N = x11;
            this.O = y10;
            return true;
        }
        if (actionMasked == 1 && a(this.f2698f)) {
            float x12 = motionEvent.getX();
            float y11 = motionEvent.getY();
            float f5 = x12 - this.N;
            float f11 = y11 - this.O;
            int i11 = eVar.f39749b;
            if ((f11 * f11) + (f5 * f5) < i11 * i11 && e.k(this.f2698f, (int) x12, (int) y11)) {
                if (!this.f2697e) {
                    this.R = false;
                }
                if (this.S || e(1.0f)) {
                    this.R = false;
                }
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (view.getParent() instanceof TouchBlocker) {
            super.removeView((View) view.getParent());
        } else {
            super.removeView(view);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        super.requestChildFocus(view, view2);
        if (isInTouchMode() || this.f2697e) {
            return;
        }
        this.R = view == this.f2698f;
    }

    @Deprecated
    public void setCoveredFadeColor(int i11) {
        this.f2693b = i11;
    }

    public final void setLockMode(int i11) {
        this.V = i11;
    }

    @Deprecated
    public void setPanelSlideListener(f fVar) {
        if (fVar != null) {
            this.P.add(fVar);
        }
    }

    public void setParallaxDistance(int i11) {
        this.M = i11;
        requestLayout();
    }

    @Deprecated
    public void setShadowDrawable(Drawable drawable) {
        setShadowDrawableLeft(drawable);
    }

    public void setShadowDrawableLeft(Drawable drawable) {
        this.f2695c = drawable;
    }

    public void setShadowDrawableRight(Drawable drawable) {
        this.f2696d = drawable;
    }

    @Deprecated
    public void setShadowResource(int i11) {
        setShadowDrawableLeft(getResources().getDrawable(i11));
    }

    public void setShadowResourceLeft(int i11) {
        setShadowDrawableLeft(getContext().getDrawable(i11));
    }

    public void setShadowResourceRight(int i11) {
        setShadowDrawableRight(getContext().getDrawable(i11));
    }

    @Deprecated
    public void setSliderFadeColor(int i11) {
        this.f2691a = i11;
    }

    public SlidingPaneLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SlidingPaneLayout(Context context, AttributeSet attributeSet, int i11) {
        Executor aVar;
        super(context, attributeSet, i11);
        this.f2691a = 0;
        this.f2699t = 1.0f;
        this.P = new CopyOnWriteArrayList();
        this.S = true;
        this.T = new Rect();
        this.U = new ArrayList();
        this.f2692a0 = new a(this, 16);
        float f5 = context.getResources().getDisplayMetrics().density;
        setWillNotDraw(false);
        s0.q(this, new ia.c(this));
        setImportantForAccessibility(1);
        e eVar = new e(getContext(), this, new ia.d(this));
        eVar.f39749b = (int) (2.0f * eVar.f39749b);
        this.Q = eVar;
        eVar.f39760n = f5 * 400.0f;
        za.g.f59070a.getClass();
        za.b bVarA = za.f.a(context);
        if (Build.VERSION.SDK_INT >= 28) {
            aVar = o4.b.a(context);
        } else {
            aVar = new o20.a(new Handler(context.getMainLooper()), 2);
        }
        setFoldingFeatureObserver(new b(bVarA, aVar));
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        ia.e eVar = new ia.e(context, attributeSet);
        eVar.f34289a = CropImageView.DEFAULT_ASPECT_RATIO;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ia.e.f34288d);
        eVar.f34289a = typedArrayObtainStyledAttributes.getFloat(0, CropImageView.DEFAULT_ASPECT_RATIO);
        typedArrayObtainStyledAttributes.recycle();
        return eVar;
    }
}
