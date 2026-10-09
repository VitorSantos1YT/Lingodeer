package androidx.media3.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import b2.a;
import b7.f0;
import com.google.android.material.motion.c;
import h9.c0;
import h9.i0;
import h9.j0;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class DefaultTimeBar extends View implements j0 {

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final /* synthetic */ int f2163u0 = 0;
    public final Paint H;
    public final Paint K;
    public final Paint L;
    public final Drawable M;
    public final int N;
    public final int O;
    public final int P;
    public final int Q;
    public final int R;
    public final int S;
    public final int T;
    public final int U;
    public final int V;
    public final StringBuilder W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rect f2164a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Formatter f2165a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rect f2166b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final a f2167b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rect f2168c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final CopyOnWriteArraySet f2169c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f2170d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final Point f2171d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Paint f2172e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final float f2173e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Paint f2174f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public int f2175f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public long f2176g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public int f2177h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public Rect f2178i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public final ValueAnimator f2179j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public float f2180k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public boolean f2181l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public boolean f2182m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public long f2183n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public long f2184o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public long f2185p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public long f2186q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f2187r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public long[] f2188s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Paint f2189t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public boolean[] f2190t0;

    public DefaultTimeBar(Context context) {
        this(context, null);
    }

    public static int a(int i11, float f5) {
        return (int) ((i11 * f5) + 0.5f);
    }

    private long getPositionIncrement() {
        long j11 = this.f2176g0;
        if (j11 != -9223372036854775807L) {
            return j11;
        }
        long j12 = this.f2184o0;
        if (j12 == -9223372036854775807L) {
            return 0L;
        }
        return j12 / ((long) this.f2175f0);
    }

    private String getProgressText() {
        return f0.y(this.W, this.f2165a0, this.f2185p0);
    }

    private long getScrubberPosition() {
        Rect rect = this.f2166b;
        if (rect.width() <= 0 || this.f2184o0 == -9223372036854775807L) {
            return 0L;
        }
        return (((long) this.f2170d.width()) * this.f2184o0) / ((long) rect.width());
    }

    public final boolean b(long j11) {
        long j12 = this.f2184o0;
        if (j12 <= 0) {
            return false;
        }
        long j13 = this.f2182m0 ? this.f2183n0 : this.f2185p0;
        long jH = f0.h(j13 + j11, 0L, j12);
        if (jH == j13) {
            return false;
        }
        if (this.f2182m0) {
            f(jH);
        } else {
            c(jH);
        }
        e();
        return true;
    }

    public final void c(long j11) {
        this.f2183n0 = j11;
        this.f2182m0 = true;
        setPressed(true);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        Iterator it = this.f2169c0.iterator();
        while (it.hasNext()) {
            ((i0) it.next()).l(j11);
        }
    }

    public final void d(boolean z11) {
        removeCallbacks(this.f2167b0);
        this.f2182m0 = false;
        setPressed(false);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        invalidate();
        Iterator it = this.f2169c0.iterator();
        while (it.hasNext()) {
            ((i0) it.next()).m(this.f2183n0, z11);
        }
    }

    @Override // android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.M;
        if (drawable != null && drawable.isStateful() && drawable.setState(getDrawableState())) {
            invalidate();
        }
    }

    public final void e() {
        Rect rect = this.f2168c;
        Rect rect2 = this.f2166b;
        rect.set(rect2);
        Rect rect3 = this.f2170d;
        rect3.set(rect2);
        long j11 = this.f2182m0 ? this.f2183n0 : this.f2185p0;
        if (this.f2184o0 > 0) {
            rect.right = Math.min(rect2.left + ((int) ((((long) rect2.width()) * this.f2186q0) / this.f2184o0)), rect2.right);
            rect3.right = Math.min(rect2.left + ((int) ((((long) rect2.width()) * j11) / this.f2184o0)), rect2.right);
        } else {
            int i11 = rect2.left;
            rect.right = i11;
            rect3.right = i11;
        }
        invalidate(this.f2164a);
    }

    public final void f(long j11) {
        if (this.f2183n0 == j11) {
            return;
        }
        this.f2183n0 = j11;
        Iterator it = this.f2169c0.iterator();
        while (it.hasNext()) {
            ((i0) it.next()).c(j11);
        }
    }

    @Override // h9.j0
    public long getPreferredUpdateDelay() {
        int iWidth = (int) (this.f2166b.width() / this.f2173e0);
        if (iWidth == 0) {
            return Long.MAX_VALUE;
        }
        long j11 = this.f2184o0;
        if (j11 == 0 || j11 == -9223372036854775807L) {
            return Long.MAX_VALUE;
        }
        return j11 / ((long) iWidth);
    }

    @Override // android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.M;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        int i11;
        canvas.save();
        Rect rect = this.f2166b;
        int iHeight = rect.height();
        int iCenterY = rect.centerY() - (iHeight / 2);
        int i12 = iCenterY + iHeight;
        long j11 = this.f2184o0;
        Paint paint = this.f2189t;
        Rect rect2 = this.f2170d;
        if (j11 <= 0) {
            canvas2 = canvas;
            canvas2.drawRect(rect.left, iCenterY, rect.right, i12, paint);
        } else {
            Rect rect3 = this.f2168c;
            int i13 = rect3.left;
            int i14 = rect3.right;
            int iMax = Math.max(Math.max(rect.left, i14), rect2.right);
            int i15 = rect.right;
            if (iMax < i15) {
                canvas.drawRect(iMax, iCenterY, i15, i12, paint);
            }
            int iMax2 = Math.max(i13, rect2.right);
            if (i14 > iMax2) {
                canvas.drawRect(iMax2, iCenterY, i14, i12, this.f2174f);
            }
            if (rect2.width() > 0) {
                canvas.drawRect(rect2.left, iCenterY, rect2.right, i12, this.f2172e);
            }
            if (this.f2187r0 != 0) {
                long[] jArr = this.f2188s0;
                jArr.getClass();
                boolean[] zArr = this.f2190t0;
                zArr.getClass();
                int i16 = this.Q;
                int i17 = i16 / 2;
                int i18 = 0;
                int i19 = 0;
                while (i19 < this.f2187r0) {
                    int iMin = Math.min(rect.width() - i16, Math.max(i18, ((int) ((((long) rect.width()) * f0.h(jArr[i19], 0L, this.f2184o0)) / this.f2184o0)) - i17)) + rect.left;
                    int i21 = i19;
                    canvas.drawRect(iMin, iCenterY, iMin + i16, i12, zArr[i19] ? this.K : this.H);
                    i19 = i21 + 1;
                    i18 = i18;
                }
            }
            canvas2 = canvas;
        }
        if (this.f2184o0 > 0) {
            int iG = f0.g(rect2.right, rect2.left, rect.right);
            int iCenterY2 = rect2.centerY();
            Drawable drawable = this.M;
            if (drawable == null) {
                if (this.f2182m0 || isFocused()) {
                    i11 = this.T;
                } else {
                    i11 = isEnabled() ? this.R : this.S;
                }
                canvas2.drawCircle(iG, iCenterY2, (int) ((i11 * this.f2180k0) / 2.0f), this.L);
            } else {
                int intrinsicWidth = ((int) (drawable.getIntrinsicWidth() * this.f2180k0)) / 2;
                int intrinsicHeight = ((int) (drawable.getIntrinsicHeight() * this.f2180k0)) / 2;
                drawable.setBounds(iG - intrinsicWidth, iCenterY2 - intrinsicHeight, iG + intrinsicWidth, iCenterY2 + intrinsicHeight);
                drawable.draw(canvas2);
            }
        }
        canvas2.restore();
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z11, int i11, Rect rect) {
        super.onFocusChanged(z11, i11, rect);
        if (!this.f2182m0 || z11) {
            return;
        }
        d(false);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 4) {
            accessibilityEvent.getText().add(getProgressText());
        }
        accessibilityEvent.setClassName("android.widget.SeekBar");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.SeekBar");
        accessibilityNodeInfo.setContentDescription(getProgressText());
        if (this.f2184o0 <= 0) {
            return;
        }
        accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
        accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:11:0x001a  */
    /* JADX WARN: Code duplicated, block: B:13:0x0025  */
    /* JADX WARN: Code duplicated, block: B:15:0x0029  */
    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i11, KeyEvent keyEvent) {
        if (isEnabled()) {
            long positionIncrement = getPositionIncrement();
            if (i11 != 66) {
                switch (i11) {
                    case 21:
                        positionIncrement = -positionIncrement;
                        if (b(positionIncrement)) {
                            a aVar = this.f2167b0;
                            removeCallbacks(aVar);
                            postDelayed(aVar, 1000L);
                            return true;
                        }
                        break;
                    case 22:
                        if (b(positionIncrement)) {
                            a aVar2 = this.f2167b0;
                            removeCallbacks(aVar2);
                            postDelayed(aVar2, 1000L);
                            return true;
                        }
                        break;
                    case 23:
                        if (this.f2182m0) {
                            d(false);
                            return true;
                        }
                        break;
                }
            } else if (this.f2182m0) {
                d(false);
                return true;
            }
        }
        return super.onKeyDown(i11, keyEvent);
    }

    @Override // android.view.View
    public final void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        int paddingBottom;
        int paddingBottom2;
        Rect rect;
        int i15 = i13 - i11;
        int i16 = i14 - i12;
        int paddingLeft = getPaddingLeft();
        int paddingRight = i15 - getPaddingRight();
        int i17 = this.f2181l0 ? 0 : this.U;
        int i18 = this.P;
        int i19 = this.N;
        int i21 = this.O;
        if (i18 == 1) {
            paddingBottom = (i16 - getPaddingBottom()) - i21;
            paddingBottom2 = ((i16 - getPaddingBottom()) - i19) - Math.max(i17 - (i19 / 2), 0);
        } else {
            paddingBottom = (i16 - i21) / 2;
            paddingBottom2 = (i16 - i19) / 2;
        }
        Rect rect2 = this.f2164a;
        rect2.set(paddingLeft, paddingBottom, paddingRight, i21 + paddingBottom);
        this.f2166b.set(rect2.left + i17, paddingBottom2, rect2.right - i17, i19 + paddingBottom2);
        if (Build.VERSION.SDK_INT >= 29 && ((rect = this.f2178i0) == null || rect.width() != i15 || this.f2178i0.height() != i16)) {
            Rect rect3 = new Rect(0, 0, i15, i16);
            this.f2178i0 = rect3;
            setSystemGestureExclusionRects(Collections.singletonList(rect3));
        }
        e();
    }

    @Override // android.view.View
    public final void onMeasure(int i11, int i12) {
        int mode = View.MeasureSpec.getMode(i12);
        int size = View.MeasureSpec.getSize(i12);
        int i13 = this.O;
        if (mode == 0) {
            size = i13;
        } else if (mode != 1073741824) {
            size = Math.min(i13, size);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i11), size);
        Drawable drawable = this.M;
        if (drawable != null && drawable.isStateful() && drawable.setState(getDrawableState())) {
            invalidate();
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i11) {
        Drawable drawable = this.M;
        if (drawable == null || !drawable.setLayoutDirection(i11)) {
            return;
        }
        invalidate();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x006e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0072  */
    /* JADX WARN: Code duplicated, block: B:27:0x0078  */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (isEnabled() && this.f2184o0 > 0) {
            int x11 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            Point point = this.f2171d0;
            point.set(x11, y10);
            int i11 = point.x;
            int i12 = point.y;
            int action = motionEvent.getAction();
            Rect rect = this.f2166b;
            Rect rect2 = this.f2170d;
            if (action == 0) {
                int i13 = i11;
                if (this.f2164a.contains(i13, i12)) {
                    rect2.right = f0.g(i13, rect.left, rect.right);
                    c(getScrubberPosition());
                    e();
                    invalidate();
                    return true;
                }
            } else if (action == 1) {
                if (this.f2182m0) {
                    d(motionEvent.getAction() == 3);
                    return true;
                }
            } else if (action != 2) {
                if (action == 3) {
                    if (this.f2182m0) {
                        d(motionEvent.getAction() == 3);
                        return true;
                    }
                }
            } else if (this.f2182m0) {
                if (i12 < this.V) {
                    int i14 = this.f2177h0;
                    rect2.right = f0.g(((i11 - i14) / 3) + i14, rect.left, rect.right);
                } else {
                    this.f2177h0 = i11;
                    rect2.right = f0.g(i11, rect.left, rect.right);
                }
                f(getScrubberPosition());
                e();
                invalidate();
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i11, Bundle bundle) {
        if (super.performAccessibilityAction(i11, bundle)) {
            return true;
        }
        if (this.f2184o0 <= 0) {
            return false;
        }
        if (i11 == 8192) {
            if (b(-getPositionIncrement())) {
                d(false);
            }
        } else {
            if (i11 != 4096) {
                return false;
            }
            if (b(getPositionIncrement())) {
                d(false);
            }
        }
        sendAccessibilityEvent(4);
        return true;
    }

    public void setAdMarkerColor(int i11) {
        this.H.setColor(i11);
        invalidate(this.f2164a);
    }

    public void setBufferedColor(int i11) {
        this.f2174f.setColor(i11);
        invalidate(this.f2164a);
    }

    @Override // h9.j0
    public void setBufferedPosition(long j11) {
        if (this.f2186q0 == j11) {
            return;
        }
        this.f2186q0 = j11;
        e();
    }

    @Override // h9.j0
    public void setDuration(long j11) {
        if (this.f2184o0 == j11) {
            return;
        }
        this.f2184o0 = j11;
        if (this.f2182m0 && j11 == -9223372036854775807L) {
            d(true);
        }
        e();
    }

    @Override // android.view.View, h9.j0
    public void setEnabled(boolean z11) {
        super.setEnabled(z11);
        if (!this.f2182m0 || z11) {
            return;
        }
        d(true);
    }

    public void setKeyCountIncrement(int i11) {
        b7.a.d(i11 > 0);
        this.f2175f0 = i11;
        this.f2176g0 = -9223372036854775807L;
    }

    public void setKeyTimeIncrement(long j11) {
        b7.a.d(j11 > 0);
        this.f2175f0 = -1;
        this.f2176g0 = j11;
    }

    public void setPlayedAdMarkerColor(int i11) {
        this.K.setColor(i11);
        invalidate(this.f2164a);
    }

    public void setPlayedColor(int i11) {
        this.f2172e.setColor(i11);
        invalidate(this.f2164a);
    }

    @Override // h9.j0
    public void setPosition(long j11) {
        if (this.f2185p0 == j11) {
            return;
        }
        this.f2185p0 = j11;
        setContentDescription(getProgressText());
        e();
    }

    public void setScrubberColor(int i11) {
        this.L.setColor(i11);
        invalidate(this.f2164a);
    }

    public void setUnplayedColor(int i11) {
        this.f2189t.setColor(i11);
        invalidate(this.f2164a);
    }

    public DefaultTimeBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DefaultTimeBar(Context context, AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, attributeSet, 0);
    }

    public DefaultTimeBar(Context context, AttributeSet attributeSet, int i11, AttributeSet attributeSet2, int i12) {
        super(context, attributeSet, i11);
        this.f2164a = new Rect();
        this.f2166b = new Rect();
        this.f2168c = new Rect();
        this.f2170d = new Rect();
        Paint paint = new Paint();
        this.f2172e = paint;
        Paint paint2 = new Paint();
        this.f2174f = paint2;
        Paint paint3 = new Paint();
        this.f2189t = paint3;
        Paint paint4 = new Paint();
        this.H = paint4;
        Paint paint5 = new Paint();
        this.K = paint5;
        Paint paint6 = new Paint();
        this.L = paint6;
        paint6.setAntiAlias(true);
        this.f2169c0 = new CopyOnWriteArraySet();
        this.f2171d0 = new Point();
        float f5 = context.getResources().getDisplayMetrics().density;
        this.f2173e0 = f5;
        this.V = a(-50, f5);
        int iA = a(4, f5);
        int iA2 = a(26, f5);
        int iA3 = a(4, f5);
        int iA4 = a(12, f5);
        int iA5 = a(0, f5);
        int iA6 = a(16, f5);
        if (attributeSet2 != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, c0.f32017b, i11, i12);
            try {
                Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(10);
                this.M = drawable;
                if (drawable != null) {
                    drawable.setLayoutDirection(getLayoutDirection());
                    iA2 = Math.max(drawable.getMinimumHeight(), iA2);
                }
                this.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, iA);
                this.O = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, iA2);
                this.P = typedArrayObtainStyledAttributes.getInt(2, 0);
                this.Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, iA3);
                this.R = typedArrayObtainStyledAttributes.getDimensionPixelSize(11, iA4);
                this.S = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, iA5);
                this.T = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, iA6);
                int i13 = typedArrayObtainStyledAttributes.getInt(6, -1);
                int i14 = typedArrayObtainStyledAttributes.getInt(7, -1);
                int i15 = typedArrayObtainStyledAttributes.getInt(4, -855638017);
                int i16 = typedArrayObtainStyledAttributes.getInt(13, 872415231);
                int i17 = typedArrayObtainStyledAttributes.getInt(0, -1291845888);
                int i18 = typedArrayObtainStyledAttributes.getInt(5, 872414976);
                paint.setColor(i13);
                paint6.setColor(i14);
                paint2.setColor(i15);
                paint3.setColor(i16);
                paint4.setColor(i17);
                paint5.setColor(i18);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th2) {
                typedArrayObtainStyledAttributes.recycle();
                throw th2;
            }
        } else {
            this.N = iA;
            this.O = iA2;
            this.P = 0;
            this.Q = iA3;
            this.R = iA4;
            this.S = iA5;
            this.T = iA6;
            paint.setColor(-1);
            paint6.setColor(-1);
            paint2.setColor(-855638017);
            paint3.setColor(872415231);
            paint4.setColor(-1291845888);
            paint5.setColor(872414976);
            this.M = null;
        }
        StringBuilder sb2 = new StringBuilder();
        this.W = sb2;
        this.f2165a0 = new Formatter(sb2, Locale.getDefault());
        this.f2167b0 = new a(this, 20);
        Drawable drawable2 = this.M;
        if (drawable2 != null) {
            this.U = (drawable2.getMinimumWidth() + 1) / 2;
        } else {
            this.U = (Math.max(this.S, Math.max(this.R, this.T)) + 1) / 2;
        }
        this.f2180k0 = 1.0f;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f2179j0 = valueAnimator;
        valueAnimator.addUpdateListener(new c(this, 4));
        this.f2184o0 = -9223372036854775807L;
        this.f2176g0 = -9223372036854775807L;
        this.f2175f0 = 20;
        setFocusable(true);
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }
}
