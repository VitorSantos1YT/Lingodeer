package l5;

import aj.i;
import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.OverScroller;
import com.yalantis.ucrop.view.CropImageView;
import java.util.Arrays;
import java.util.WeakHashMap;
import z4.s0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final d f39747x = new d(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f39748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f39749b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float[] f39751d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float[] f39752e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float[] f39753f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float[] f39754g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int[] f39755h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int[] f39756i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int[] f39757j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f39758k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public VelocityTracker f39759l;
    public final float m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f39760n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f39761o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f39762p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f39763q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final OverScroller f39764r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final com.bumptech.glide.d f39765s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public View f39766t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f39767u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ViewGroup f39768v;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f39750c = -1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final i f39769w = new i(this, 6);

    public e(Context context, ViewGroup viewGroup, com.bumptech.glide.d dVar) {
        if (dVar == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f39768v = viewGroup;
        this.f39765s = dVar;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        int i11 = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f39762p = i11;
        this.f39761o = i11;
        this.f39749b = viewConfiguration.getScaledTouchSlop();
        this.m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f39760n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f39764r = new OverScroller(context, f39747x);
    }

    public static boolean k(View view, int i11, int i12) {
        return view != null && i11 >= view.getLeft() && i11 < view.getRight() && i12 >= view.getTop() && i12 < view.getBottom();
    }

    public final void a() {
        b();
        if (this.f39748a == 2) {
            OverScroller overScroller = this.f39764r;
            overScroller.getCurrX();
            overScroller.getCurrY();
            overScroller.abortAnimation();
            this.f39765s.E(this.f39766t, overScroller.getCurrX(), overScroller.getCurrY());
        }
        q(0);
    }

    public final void b() {
        this.f39750c = -1;
        float[] fArr = this.f39751d;
        if (fArr != null) {
            Arrays.fill(fArr, CropImageView.DEFAULT_ASPECT_RATIO);
            Arrays.fill(this.f39752e, CropImageView.DEFAULT_ASPECT_RATIO);
            Arrays.fill(this.f39753f, CropImageView.DEFAULT_ASPECT_RATIO);
            Arrays.fill(this.f39754g, CropImageView.DEFAULT_ASPECT_RATIO);
            Arrays.fill(this.f39755h, 0);
            Arrays.fill(this.f39756i, 0);
            Arrays.fill(this.f39757j, 0);
            this.f39758k = 0;
        }
        VelocityTracker velocityTracker = this.f39759l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f39759l = null;
        }
    }

    public final void c(View view, int i11) {
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = this.f39768v;
        if (parent != viewGroup) {
            throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + viewGroup + ")");
        }
        this.f39766t = view;
        this.f39750c = i11;
        this.f39765s.C(view, i11);
        q(1);
    }

    public final boolean d(float f5, float f11, int i11, int i12) {
        float fAbs = Math.abs(f5);
        float fAbs2 = Math.abs(f11);
        if ((this.f39755h[i11] & i12) != i12 || (this.f39763q & i12) == 0 || (this.f39757j[i11] & i12) == i12 || (this.f39756i[i11] & i12) == i12) {
            return false;
        }
        float f12 = this.f39749b;
        if (fAbs <= f12 && fAbs2 <= f12) {
            return false;
        }
        if (fAbs < fAbs2 * 0.5f) {
            this.f39765s.getClass();
        }
        return (this.f39756i[i11] & i12) == 0 && fAbs > ((float) this.f39749b);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0044 A[RETURN] */
    public final boolean e(View view, float f5, float f11) {
        if (view != null) {
            com.bumptech.glide.d dVar = this.f39765s;
            boolean z11 = dVar.q(view) > 0;
            boolean z12 = dVar.r() > 0;
            if (z11 && z12) {
                float f12 = (f11 * f11) + (f5 * f5);
                int i11 = this.f39749b;
                if (f12 > i11 * i11) {
                    return true;
                }
            } else if (!z11 ? !(!z12 || Math.abs(f11) <= this.f39749b) : Math.abs(f5) > this.f39749b) {
                return true;
            }
        }
        return false;
    }

    public final void f(int i11) {
        float[] fArr = this.f39751d;
        if (fArr != null) {
            int i12 = this.f39758k;
            int i13 = 1 << i11;
            if ((i12 & i13) != 0) {
                fArr[i11] = 0.0f;
                this.f39752e[i11] = 0.0f;
                this.f39753f[i11] = 0.0f;
                this.f39754g[i11] = 0.0f;
                this.f39755h[i11] = 0;
                this.f39756i[i11] = 0;
                this.f39757j[i11] = 0;
                this.f39758k = (~i13) & i12;
            }
        }
    }

    public final int g(int i11, int i12, int i13) {
        if (i11 == 0) {
            return 0;
        }
        int width = this.f39768v.getWidth();
        float f5 = width / 2;
        float fSin = (((float) Math.sin((Math.min(1.0f, Math.abs(i11) / width) - 0.5f) * 0.47123894f)) * f5) + f5;
        int iAbs = Math.abs(i12);
        return Math.min(iAbs > 0 ? Math.round(Math.abs(fSin / iAbs) * 1000.0f) * 4 : (int) (((Math.abs(i11) / i13) + 1.0f) * 256.0f), 600);
    }

    public final boolean h() {
        if (this.f39748a == 2) {
            OverScroller overScroller = this.f39764r;
            boolean zComputeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - this.f39766t.getLeft();
            int top = currY - this.f39766t.getTop();
            if (left != 0) {
                View view = this.f39766t;
                WeakHashMap weakHashMap = s0.f58893a;
                view.offsetLeftAndRight(left);
            }
            if (top != 0) {
                View view2 = this.f39766t;
                WeakHashMap weakHashMap2 = s0.f58893a;
                view2.offsetTopAndBottom(top);
            }
            if (left != 0 || top != 0) {
                this.f39765s.E(this.f39766t, currX, currY);
            }
            if (zComputeScrollOffset && currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                overScroller.abortAnimation();
                zComputeScrollOffset = false;
            }
            if (!zComputeScrollOffset) {
                this.f39768v.post(this.f39769w);
            }
        }
        return this.f39748a == 2;
    }

    public final View i(int i11, int i12) {
        ViewGroup viewGroup = this.f39768v;
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            this.f39765s.getClass();
            View childAt = viewGroup.getChildAt(childCount);
            if (i11 >= childAt.getLeft() && i11 < childAt.getRight() && i12 >= childAt.getTop() && i12 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final boolean j(int i11, int i12, int i13, int i14) {
        float f5;
        float f11;
        float f12;
        float f13;
        int left = this.f39766t.getLeft();
        int top = this.f39766t.getTop();
        int i15 = i11 - left;
        int i16 = i12 - top;
        OverScroller overScroller = this.f39764r;
        if (i15 == 0 && i16 == 0) {
            overScroller.abortAnimation();
            q(0);
            return false;
        }
        View view = this.f39766t;
        int i17 = (int) this.f39760n;
        int i18 = (int) this.m;
        int iAbs = Math.abs(i13);
        if (iAbs < i17) {
            i13 = 0;
        } else if (iAbs > i18) {
            i13 = i13 > 0 ? i18 : -i18;
        }
        int i19 = (int) this.f39760n;
        int iAbs2 = Math.abs(i14);
        if (iAbs2 < i19) {
            i14 = 0;
        } else if (iAbs2 > i18) {
            i14 = i14 > 0 ? i18 : -i18;
        }
        int iAbs3 = Math.abs(i15);
        int iAbs4 = Math.abs(i16);
        int iAbs5 = Math.abs(i13);
        int iAbs6 = Math.abs(i14);
        int i21 = iAbs5 + iAbs6;
        int i22 = iAbs3 + iAbs4;
        if (i13 != 0) {
            f5 = iAbs5;
            f11 = i21;
        } else {
            f5 = iAbs3;
            f11 = i22;
        }
        float f14 = f5 / f11;
        if (i14 != 0) {
            f12 = iAbs6;
            f13 = i21;
        } else {
            f12 = iAbs4;
            f13 = i22;
        }
        float f15 = f12 / f13;
        com.bumptech.glide.d dVar = this.f39765s;
        overScroller.startScroll(left, top, i15, i16, (int) ((g(i16, i14, dVar.r()) * f15) + (g(i15, i13, dVar.q(view)) * f14)));
        q(2);
        return true;
    }

    public final void l(MotionEvent motionEvent) {
        int i11;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            b();
        }
        if (this.f39759l == null) {
            this.f39759l = VelocityTracker.obtain();
        }
        this.f39759l.addMovement(motionEvent);
        com.bumptech.glide.d dVar = this.f39765s;
        int i12 = 0;
        if (actionMasked == 0) {
            float x11 = motionEvent.getX();
            float y10 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View viewI = i((int) x11, (int) y10);
            o(x11, y10, pointerId);
            u(viewI, pointerId);
            if ((this.f39755h[pointerId] & this.f39763q) != 0) {
                dVar.B(pointerId);
                return;
            }
            return;
        }
        if (actionMasked == 1) {
            if (this.f39748a == 1) {
                m();
            }
            b();
            return;
        }
        if (actionMasked != 2) {
            if (actionMasked == 3) {
                if (this.f39748a == 1) {
                    this.f39767u = true;
                    dVar.F(this.f39766t, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO);
                    this.f39767u = false;
                    if (this.f39748a == 1) {
                        q(0);
                    }
                }
                b();
                return;
            }
            if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x12 = motionEvent.getX(actionIndex);
                float y11 = motionEvent.getY(actionIndex);
                o(x12, y11, pointerId2);
                if (this.f39748a != 0) {
                    if (k(this.f39766t, (int) x12, (int) y11)) {
                        u(this.f39766t, pointerId2);
                        return;
                    }
                    return;
                } else {
                    u(i((int) x12, (int) y11), pointerId2);
                    if ((this.f39755h[pointerId2] & this.f39763q) != 0) {
                        dVar.B(pointerId2);
                        return;
                    }
                    return;
                }
            }
            if (actionMasked != 6) {
                return;
            }
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            if (this.f39748a == 1 && pointerId3 == this.f39750c) {
                int pointerCount = motionEvent.getPointerCount();
                while (true) {
                    if (i12 >= pointerCount) {
                        i11 = -1;
                        break;
                    }
                    int pointerId4 = motionEvent.getPointerId(i12);
                    if (pointerId4 != this.f39750c) {
                        View viewI2 = i((int) motionEvent.getX(i12), (int) motionEvent.getY(i12));
                        View view = this.f39766t;
                        if (viewI2 == view && u(view, pointerId4)) {
                            i11 = this.f39750c;
                            break;
                        }
                    }
                    i12++;
                }
                if (i11 == -1) {
                    m();
                }
            }
            f(pointerId3);
            return;
        }
        if (this.f39748a != 1) {
            int pointerCount2 = motionEvent.getPointerCount();
            for (int i13 = 0; i13 < pointerCount2; i13++) {
                int pointerId5 = motionEvent.getPointerId(i13);
                if ((this.f39758k & (1 << pointerId5)) != 0) {
                    float x13 = motionEvent.getX(i13);
                    float y12 = motionEvent.getY(i13);
                    float f5 = x13 - this.f39751d[pointerId5];
                    float f11 = y12 - this.f39752e[pointerId5];
                    n(f5, f11, pointerId5);
                    if (this.f39748a == 1) {
                        break;
                    }
                    View viewI3 = i((int) x13, (int) y12);
                    if (e(viewI3, f5, f11) && u(viewI3, pointerId5)) {
                        break;
                    }
                }
            }
            p(motionEvent);
            return;
        }
        int i14 = this.f39750c;
        if (((this.f39758k & (1 << i14)) != 0 ? 1 : 0) == 0) {
            return;
        }
        int iFindPointerIndex = motionEvent.findPointerIndex(i14);
        float x14 = motionEvent.getX(iFindPointerIndex);
        float y13 = motionEvent.getY(iFindPointerIndex);
        float[] fArr = this.f39753f;
        int i15 = this.f39750c;
        int i16 = (int) (x14 - fArr[i15]);
        int i17 = (int) (y13 - this.f39754g[i15]);
        int left = this.f39766t.getLeft() + i16;
        int top = this.f39766t.getTop() + i17;
        int left2 = this.f39766t.getLeft();
        int top2 = this.f39766t.getTop();
        if (i16 != 0) {
            left = dVar.h(this.f39766t, left);
            WeakHashMap weakHashMap = s0.f58893a;
            this.f39766t.offsetLeftAndRight(left - left2);
        }
        if (i17 != 0) {
            top = dVar.i(this.f39766t, top);
            WeakHashMap weakHashMap2 = s0.f58893a;
            this.f39766t.offsetTopAndBottom(top - top2);
        }
        if (i16 != 0 || i17 != 0) {
            dVar.E(this.f39766t, left, top);
        }
        p(motionEvent);
    }

    public final void m() {
        VelocityTracker velocityTracker = this.f39759l;
        float f5 = this.m;
        velocityTracker.computeCurrentVelocity(1000, f5);
        float xVelocity = this.f39759l.getXVelocity(this.f39750c);
        float f11 = this.f39760n;
        float fAbs = Math.abs(xVelocity);
        if (fAbs < f11) {
            xVelocity = 0.0f;
        } else if (fAbs > f5) {
            xVelocity = xVelocity > CropImageView.DEFAULT_ASPECT_RATIO ? f5 : -f5;
        }
        float yVelocity = this.f39759l.getYVelocity(this.f39750c);
        float f12 = this.f39760n;
        float fAbs2 = Math.abs(yVelocity);
        if (fAbs2 < f12) {
            f5 = 0.0f;
        } else if (fAbs2 <= f5) {
            f5 = yVelocity;
        } else if (yVelocity <= CropImageView.DEFAULT_ASPECT_RATIO) {
            f5 = -f5;
        }
        this.f39767u = true;
        this.f39765s.F(this.f39766t, xVelocity, f5);
        this.f39767u = false;
        if (this.f39748a == 1) {
            q(0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r3v3, types: [com.bumptech.glide.d] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void n(float f5, float f11, int i11) {
        int i12;
        boolean zD = d(f5, f11, i11, 1);
        ?? r9 = zD;
        if (d(f11, f5, i11, 4)) {
            r9 = (zD ? 1 : 0) | 4;
        }
        ?? r11 = r9;
        if (d(f5, f11, i11, 2)) {
            r11 = (r9 == true ? 1 : 0) | 2;
        }
        ?? r12 = r11;
        if (d(f11, f5, i11, 8)) {
            i12 = (r11 == true ? 1 : 0) | 8;
        }
        if (r12 == 0) {
            r12 = i12;
            return;
        }
        r12 = i12;
        int[] iArr = this.f39756i;
        iArr[i11] = (iArr[i11] | r12) == true ? 1 : 0;
        this.f39765s.A(r12, i11);
    }

    public final void o(float f5, float f11, int i11) {
        float[] fArr = this.f39751d;
        if (fArr == null || fArr.length <= i11) {
            int i12 = i11 + 1;
            float[] fArr2 = new float[i12];
            float[] fArr3 = new float[i12];
            float[] fArr4 = new float[i12];
            float[] fArr5 = new float[i12];
            int[] iArr = new int[i12];
            int[] iArr2 = new int[i12];
            int[] iArr3 = new int[i12];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f39752e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f39753f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f39754g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f39755h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f39756i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f39757j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f39751d = fArr2;
            this.f39752e = fArr3;
            this.f39753f = fArr4;
            this.f39754g = fArr5;
            this.f39755h = iArr;
            this.f39756i = iArr2;
            this.f39757j = iArr3;
        }
        float[] fArr9 = this.f39751d;
        this.f39753f[i11] = f5;
        fArr9[i11] = f5;
        float[] fArr10 = this.f39752e;
        this.f39754g[i11] = f11;
        fArr10[i11] = f11;
        int[] iArr7 = this.f39755h;
        int i13 = (int) f5;
        int i14 = (int) f11;
        ViewGroup viewGroup = this.f39768v;
        int i15 = i13 < viewGroup.getLeft() + this.f39761o ? 1 : 0;
        if (i14 < viewGroup.getTop() + this.f39761o) {
            i15 |= 4;
        }
        if (i13 > viewGroup.getRight() - this.f39761o) {
            i15 |= 2;
        }
        if (i14 > viewGroup.getBottom() - this.f39761o) {
            i15 |= 8;
        }
        iArr7[i11] = i15;
        this.f39758k |= 1 << i11;
    }

    public final void p(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i11 = 0; i11 < pointerCount; i11++) {
            int pointerId = motionEvent.getPointerId(i11);
            if ((this.f39758k & (1 << pointerId)) != 0) {
                float x11 = motionEvent.getX(i11);
                float y10 = motionEvent.getY(i11);
                this.f39753f[pointerId] = x11;
                this.f39754g[pointerId] = y10;
            }
        }
    }

    public final void q(int i11) {
        this.f39768v.removeCallbacks(this.f39769w);
        if (this.f39748a != i11) {
            this.f39748a = i11;
            this.f39765s.D(i11);
            if (this.f39748a == 0) {
                this.f39766t = null;
            }
        }
    }

    public final boolean r(int i11, int i12) {
        if (this.f39767u) {
            return j(i11, i12, (int) this.f39759l.getXVelocity(this.f39750c), (int) this.f39759l.getYVelocity(this.f39750c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:62:0x00f5  */
    public final boolean s(MotionEvent motionEvent) {
        View viewI;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            b();
        }
        if (this.f39759l == null) {
            this.f39759l = VelocityTracker.obtain();
        }
        this.f39759l.addMovement(motionEvent);
        com.bumptech.glide.d dVar = this.f39765s;
        if (actionMasked == 0) {
            float x11 = motionEvent.getX();
            float y10 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            o(x11, y10, pointerId);
            View viewI2 = i((int) x11, (int) y10);
            if (viewI2 == this.f39766t && this.f39748a == 2) {
                u(viewI2, pointerId);
            }
            if ((this.f39755h[pointerId] & this.f39763q) != 0) {
                dVar.B(pointerId);
            }
        } else if (actionMasked == 1) {
            b();
        } else if (actionMasked != 2) {
            if (actionMasked == 3) {
                b();
            } else if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x12 = motionEvent.getX(actionIndex);
                float y11 = motionEvent.getY(actionIndex);
                o(x12, y11, pointerId2);
                int i11 = this.f39748a;
                if (i11 == 0) {
                    if ((this.f39755h[pointerId2] & this.f39763q) != 0) {
                        dVar.B(pointerId2);
                    }
                } else if (i11 == 2 && (viewI = i((int) x12, (int) y11)) == this.f39766t) {
                    u(viewI, pointerId2);
                }
            } else if (actionMasked == 6) {
                f(motionEvent.getPointerId(actionIndex));
            }
        } else if (this.f39751d != null && this.f39752e != null) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i12 = 0; i12 < pointerCount; i12++) {
                int pointerId3 = motionEvent.getPointerId(i12);
                if ((this.f39758k & (1 << pointerId3)) != 0) {
                    float x13 = motionEvent.getX(i12);
                    float y12 = motionEvent.getY(i12);
                    float f5 = x13 - this.f39751d[pointerId3];
                    float f11 = y12 - this.f39752e[pointerId3];
                    View viewI3 = i((int) x13, (int) y12);
                    boolean z11 = viewI3 != null && e(viewI3, f5, f11);
                    if (!z11) {
                        n(f5, f11, pointerId3);
                        if (this.f39748a != 1) {
                            break;
                        }
                    } else {
                        int left = viewI3.getLeft();
                        int iH = dVar.h(viewI3, ((int) f5) + left);
                        int top = viewI3.getTop();
                        int i13 = dVar.i(viewI3, ((int) f11) + top);
                        int iQ = dVar.q(viewI3);
                        int iR = dVar.r();
                        if ((iQ == 0 || (iQ > 0 && iH == left)) && (iR == 0 || (iR > 0 && i13 == top))) {
                            break;
                        }
                        n(f5, f11, pointerId3);
                        if (this.f39748a != 1 || (z11 && u(viewI3, pointerId3))) {
                            break;
                        }
                    }
                }
            }
            p(motionEvent);
        }
        return this.f39748a == 1;
    }

    public final boolean t(View view, int i11, int i12) {
        this.f39766t = view;
        this.f39750c = -1;
        boolean zJ = j(i11, i12, 0, 0);
        if (!zJ && this.f39748a == 0 && this.f39766t != null) {
            this.f39766t = null;
        }
        return zJ;
    }

    public final boolean u(View view, int i11) {
        if (view == this.f39766t && this.f39750c == i11) {
            return true;
        }
        if (view == null || !this.f39765s.M(view, i11)) {
            return false;
        }
        this.f39750c = i11;
        c(view, i11);
        return true;
    }
}
