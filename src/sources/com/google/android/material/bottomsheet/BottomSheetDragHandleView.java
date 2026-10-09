package com.google.android.material.bottomsheet;

import a5.c;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.appcompat.widget.AppCompatImageView;
import app.rive.runtime.kotlin.core.a;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import com.lingodeer.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import l4.b;
import l4.e;
import z4.s0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class BottomSheetDragHandleView extends AppCompatImageView implements AccessibilityManager.AccessibilityStateChangeListener {
    public static final /* synthetic */ int L = 0;
    public final String H;
    public final BottomSheetBehavior.BottomSheetCallback K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AccessibilityManager f14033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public BottomSheetBehavior f14034b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final GestureDetector f14035c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f14036d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f14037e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f14038f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f14039t;

    public BottomSheetDragHandleView(Context context) {
        this(context, null);
    }

    private void setBottomSheetBehavior(BottomSheetBehavior<?> bottomSheetBehavior) {
        BottomSheetBehavior bottomSheetBehavior2 = this.f14034b;
        BottomSheetBehavior.BottomSheetCallback bottomSheetCallback = this.K;
        if (bottomSheetBehavior2 != null) {
            bottomSheetBehavior2.C0.remove(bottomSheetCallback);
            this.f14034b.K(null);
            this.f14034b.A0 = null;
        }
        this.f14034b = bottomSheetBehavior;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.K(this);
            BottomSheetBehavior bottomSheetBehavior3 = this.f14034b;
            bottomSheetBehavior3.getClass();
            bottomSheetBehavior3.A0 = new WeakReference(this);
            d(this.f14034b.f13991p0);
            ArrayList arrayList = this.f14034b.C0;
            if (!arrayList.contains(bottomSheetCallback)) {
                arrayList.add(bottomSheetCallback);
            }
        }
        setClickable(this.f14034b != null);
    }

    public final boolean c() {
        BottomSheetBehavior bottomSheetBehavior = this.f14034b;
        if (bottomSheetBehavior == null) {
            return false;
        }
        boolean z11 = bottomSheetBehavior.f13972b;
        int i11 = bottomSheetBehavior.f13991p0;
        int i12 = 6;
        int i13 = 3;
        if (i11 == 4) {
            if (z11) {
                i12 = i13;
            }
        } else if (i11 != 3) {
            if (!this.f14036d) {
                i13 = 4;
            }
            i12 = i13;
        } else if (z11) {
            i12 = 4;
        }
        bottomSheetBehavior.e(i12);
        return true;
    }

    public final void d(int i11) {
        if (i11 == 4) {
            this.f14036d = true;
        } else if (i11 == 3) {
            this.f14036d = false;
        }
        s0.o(this, c.f361g, this.f14036d ? this.f14039t : this.H, new a(this, 21));
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        BottomSheetBehavior<?> bottomSheetBehavior;
        super.onAttachedToWindow();
        View view = this;
        while (true) {
            Object parent = view.getParent();
            bottomSheetBehavior = null;
            view = parent instanceof View ? (View) parent : null;
            if (view == null) {
                break;
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof e) {
                b bVar = ((e) layoutParams).f39716a;
                if (bVar instanceof BottomSheetBehavior) {
                    bottomSheetBehavior = (BottomSheetBehavior) bVar;
                    break;
                }
            }
        }
        setBottomSheetBehavior(bottomSheetBehavior);
        AccessibilityManager accessibilityManager = this.f14033a;
        if (accessibilityManager != null) {
            accessibilityManager.addAccessibilityStateChangeListener(this);
            accessibilityManager.isEnabled();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        AccessibilityManager accessibilityManager = this.f14033a;
        if (accessibilityManager != null) {
            accessibilityManager.removeAccessibilityStateChangeListener(this);
        }
        setBottomSheetBehavior(null);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return (this.f14038f || this.f14037e) ? super.onTouchEvent(motionEvent) : this.f14035c.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f14038f = onClickListener != null;
        super.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.f14037e = onTouchListener != null;
        super.setOnTouchListener(onTouchListener);
    }

    public BottomSheetDragHandleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.bottomSheetDragHandleStyle);
    }

    public BottomSheetDragHandleView(Context context, AttributeSet attributeSet, int i11) {
        super(MaterialThemeOverlay.a(context, attributeSet, i11, R.style.Widget_Material3_BottomSheet_DragHandle), attributeSet, i11);
        this.f14037e = false;
        this.f14038f = false;
        this.f14039t = getResources().getString(R.string.bottomsheet_action_expand);
        this.H = getResources().getString(R.string.bottomsheet_action_collapse);
        this.K = new BottomSheetBehavior.BottomSheetCallback() { // from class: com.google.android.material.bottomsheet.BottomSheetDragHandleView.1
            @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
            public final void c(View view, int i12) {
                int i13 = BottomSheetDragHandleView.L;
                BottomSheetDragHandleView.this.d(i12);
            }

            @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
            public final void b(View view) {
            }
        };
        GestureDetector.SimpleOnGestureListener simpleOnGestureListener = new GestureDetector.SimpleOnGestureListener() { // from class: com.google.android.material.bottomsheet.BottomSheetDragHandleView.2
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public final boolean onDoubleTap(MotionEvent motionEvent) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetDragHandleView.this.f14034b;
                if (bottomSheetBehavior == null || !bottomSheetBehavior.f13986k0) {
                    return super.onDoubleTap(motionEvent);
                }
                bottomSheetBehavior.e(5);
                return true;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public final boolean onDown(MotionEvent motionEvent) {
                return BottomSheetDragHandleView.this.isClickable();
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                int i12 = BottomSheetDragHandleView.L;
                return BottomSheetDragHandleView.this.c();
            }
        };
        Context context2 = getContext();
        this.f14035c = new GestureDetector(context2, simpleOnGestureListener, new Handler(Looper.getMainLooper()));
        this.f14033a = (AccessibilityManager) context2.getSystemService("accessibility");
        s0.q(this, new z4.b() { // from class: com.google.android.material.bottomsheet.BottomSheetDragHandleView.3
            @Override // z4.b
            public final void e(View view, AccessibilityEvent accessibilityEvent) {
                super.e(view, accessibilityEvent);
                if (accessibilityEvent.getEventType() == 1) {
                    int i12 = BottomSheetDragHandleView.L;
                    BottomSheetDragHandleView.this.c();
                }
            }
        });
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z11) {
    }
}
