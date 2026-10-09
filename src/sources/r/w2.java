package r;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.widget.TextView;
import com.lingodeer.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class w2 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {
    public static w2 M;
    public static w2 N;
    public x2 H;
    public boolean K;
    public boolean L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f48697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CharSequence f48698b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f48699c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v2 f48700d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final v2 f48701e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f48702f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f48703t;

    /* JADX WARN: Type inference failed for: r0v0, types: [r.v2] */
    /* JADX WARN: Type inference failed for: r0v1, types: [r.v2] */
    public w2(View view, CharSequence charSequence) {
        final int i11 = 0;
        this.f48700d = new Runnable(this) { // from class: r.v2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ w2 f48682b;

            {
                this.f48682b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        this.f48682b.c(false);
                        break;
                    default:
                        this.f48682b.a();
                        break;
                }
            }
        };
        final int i12 = 1;
        this.f48701e = new Runnable(this) { // from class: r.v2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ w2 f48682b;

            {
                this.f48682b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        this.f48682b.c(false);
                        break;
                    default:
                        this.f48682b.a();
                        break;
                }
            }
        };
        this.f48697a = view;
        this.f48698b = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = z4.t0.f58901a;
        this.f48699c = Build.VERSION.SDK_INT >= 28 ? a2.l.s(viewConfiguration) : viewConfiguration.getScaledTouchSlop() / 2;
        this.L = true;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void b(w2 w2Var) {
        w2 w2Var2 = M;
        if (w2Var2 != null) {
            w2Var2.f48697a.removeCallbacks(w2Var2.f48700d);
        }
        M = w2Var;
        if (w2Var != null) {
            w2Var.f48697a.postDelayed(w2Var.f48700d, ViewConfiguration.getLongPressTimeout());
        }
    }

    public final void a() {
        w2 w2Var = N;
        View view = this.f48697a;
        if (w2Var == this) {
            N = null;
            x2 x2Var = this.H;
            if (x2Var != null) {
                View view2 = (View) x2Var.f48710b;
                if (view2.getParent() != null) {
                    ((WindowManager) ((Context) x2Var.f48709a).getSystemService("window")).removeView(view2);
                }
                this.H = null;
                this.L = true;
                view.removeOnAttachStateChangeListener(this);
            }
        }
        if (M == this) {
            b(null);
        }
        view.removeCallbacks(this.f48701e);
    }

    public final void c(boolean z11) {
        int height;
        int i11;
        int i12;
        int i13;
        long longPressTimeout;
        long j11;
        long j12;
        View view = this.f48697a;
        if (view.isAttachedToWindow()) {
            b(null);
            w2 w2Var = N;
            if (w2Var != null) {
                w2Var.a();
            }
            N = this;
            this.K = z11;
            Context context = view.getContext();
            x2 x2Var = new x2();
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            x2Var.f48712d = layoutParams;
            x2Var.f48713e = new Rect();
            x2Var.f48714f = new int[2];
            x2Var.f48715t = new int[2];
            x2Var.f48709a = context;
            View viewInflate = LayoutInflater.from(context).inflate(R.layout.abc_tooltip, (ViewGroup) null);
            x2Var.f48710b = viewInflate;
            x2Var.f48711c = (TextView) viewInflate.findViewById(R.id.message);
            layoutParams.setTitle(x2.class.getSimpleName());
            layoutParams.packageName = context.getPackageName();
            layoutParams.type = 1002;
            layoutParams.width = -2;
            layoutParams.height = -2;
            layoutParams.format = -3;
            layoutParams.windowAnimations = R.style.Animation_AppCompat_Tooltip;
            layoutParams.flags = 24;
            View view2 = (View) x2Var.f48710b;
            Context context2 = (Context) x2Var.f48709a;
            this.H = x2Var;
            int width = this.f48702f;
            int i14 = this.f48703t;
            boolean z12 = this.K;
            WindowManager.LayoutParams layoutParams2 = (WindowManager.LayoutParams) x2Var.f48712d;
            if (view2.getParent() != null && view2.getParent() != null) {
                ((WindowManager) context2.getSystemService("window")).removeView(view2);
            }
            ((TextView) x2Var.f48711c).setText(this.f48698b);
            int[] iArr = (int[]) x2Var.f48715t;
            int[] iArr2 = (int[]) x2Var.f48714f;
            Rect rect = (Rect) x2Var.f48713e;
            layoutParams2.token = view.getApplicationWindowToken();
            int dimensionPixelOffset = context2.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
            if (view.getWidth() < dimensionPixelOffset) {
                width = view.getWidth() / 2;
            }
            if (view.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = context2.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
                height = i14 + dimensionPixelOffset2;
                i11 = i14 - dimensionPixelOffset2;
            } else {
                height = view.getHeight();
                i11 = 0;
            }
            layoutParams2.gravity = 49;
            int dimensionPixelOffset3 = context2.getResources().getDimensionPixelOffset(z12 ? R.dimen.tooltip_y_offset_touch : R.dimen.tooltip_y_offset_non_touch);
            View rootView = view.getRootView();
            ViewGroup.LayoutParams layoutParams3 = rootView.getLayoutParams();
            int i15 = width;
            if (!(layoutParams3 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams3).type != 2) {
                for (Context context3 = view.getContext(); context3 instanceof ContextWrapper; context3 = ((ContextWrapper) context3).getBaseContext()) {
                    if (context3 instanceof Activity) {
                        rootView = ((Activity) context3).getWindow().getDecorView();
                        break;
                    }
                }
            }
            if (rootView == null) {
                i13 = 1;
            } else {
                rootView.getWindowVisibleDisplayFrame(rect);
                if (rect.left >= 0 || rect.top >= 0) {
                    i12 = 0;
                    i13 = 1;
                } else {
                    Resources resources = context2.getResources();
                    i13 = 1;
                    int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
                    int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    i12 = 0;
                    rect.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                rootView.getLocationOnScreen(iArr);
                view.getLocationOnScreen(iArr2);
                int i16 = iArr2[i12] - iArr[i12];
                iArr2[i12] = i16;
                iArr2[i13] = iArr2[i13] - iArr[i13];
                layoutParams2.x = (i16 + i15) - (rootView.getWidth() / 2);
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i12, i12);
                view2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredHeight = view2.getMeasuredHeight();
                int i17 = iArr2[i13];
                int i18 = ((i17 + i11) - dimensionPixelOffset3) - measuredHeight;
                int i19 = i17 + height + dimensionPixelOffset3;
                if (z12) {
                    if (i18 >= 0) {
                        layoutParams2.y = i18;
                    } else {
                        layoutParams2.y = i19;
                    }
                } else if (measuredHeight + i19 <= rect.height()) {
                    layoutParams2.y = i19;
                } else {
                    layoutParams2.y = i18;
                }
            }
            ((WindowManager) context2.getSystemService("window")).addView(view2, layoutParams2);
            view.addOnAttachStateChangeListener(this);
            if (this.K) {
                j12 = 2500;
            } else {
                WeakHashMap weakHashMap = z4.s0.f58893a;
                if ((view.getWindowSystemUiVisibility() & 1) == i13) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j11 = 3000;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j11 = 15000;
                }
                j12 = j11 - longPressTimeout;
            }
            v2 v2Var = this.f48701e;
            view.removeCallbacks(v2Var);
            view.postDelayed(v2Var, j12);
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0066  */
    @Override // android.view.View.OnHoverListener
    public final boolean onHover(View view, MotionEvent motionEvent) {
        if (this.H == null || !this.K) {
            View view2 = this.f48697a;
            AccessibilityManager accessibilityManager = (AccessibilityManager) view2.getContext().getSystemService("accessibility");
            if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled()) {
                int action = motionEvent.getAction();
                if (action != 7) {
                    if (action == 10) {
                        this.L = true;
                        a();
                        return false;
                    }
                } else if (view2.isEnabled() && this.H == null) {
                    int x11 = (int) motionEvent.getX();
                    int y10 = (int) motionEvent.getY();
                    if (this.L) {
                        this.f48702f = x11;
                        this.f48703t = y10;
                        this.L = false;
                        b(this);
                    } else {
                        int iAbs = Math.abs(x11 - this.f48702f);
                        int i11 = this.f48699c;
                        if (iAbs > i11 || Math.abs(y10 - this.f48703t) > i11) {
                            this.f48702f = x11;
                            this.f48703t = y10;
                            this.L = false;
                            b(this);
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.f48702f = view.getWidth() / 2;
        this.f48703t = view.getHeight() / 2;
        c(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        a();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
