package com.google.android.material.bottomsheet;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.media.session.a;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import cf.x;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.motion.MaterialBackOrchestrator;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.lingodeer.R;
import java.util.ArrayList;
import java.util.WeakHashMap;
import l.b0;
import tp.g;
import z4.a2;
import z4.b;
import z4.j0;
import z4.s0;
import z4.u;
import z4.v1;
import z4.w1;
import z4.x1;
import z4.y1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class BottomSheetDialog extends b0 {
    public CoordinatorLayout H;
    public FrameLayout K;
    public boolean L;
    public boolean M;
    public boolean N;
    public EdgeToEdgeCallback O;
    public boolean P;
    public MaterialBackOrchestrator Q;
    public BottomSheetBehavior.BottomSheetCallback R;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public BottomSheetBehavior f14023f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public FrameLayout f14024t;

    /* JADX INFO: renamed from: com.google.android.material.bottomsheet.BottomSheetDialog$4, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass4 implements View.OnTouchListener {
        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class EdgeToEdgeCallback extends BottomSheetBehavior.BottomSheetCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Boolean f14029a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final v1 f14030b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Window f14031c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f14032d;

        public EdgeToEdgeCallback(View view, v1 v1Var) {
            this.f14030b = v1Var;
            MaterialShapeDrawable materialShapeDrawable = BottomSheetBehavior.E(view).K;
            ColorStateList backgroundTintList = materialShapeDrawable != null ? materialShapeDrawable.f15200b.f15217d : view.getBackgroundTintList();
            if (backgroundTintList != null) {
                this.f14029a = Boolean.valueOf(MaterialColors.e(backgroundTintList.getDefaultColor()));
                return;
            }
            ColorStateList colorStateListD = DrawableUtils.d(view.getBackground());
            Integer numValueOf = colorStateListD != null ? Integer.valueOf(colorStateListD.getDefaultColor()) : null;
            if (numValueOf != null) {
                this.f14029a = Boolean.valueOf(MaterialColors.e(numValueOf.intValue()));
            } else {
                this.f14029a = null;
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public final void a(View view) {
            d(view);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public final void b(View view) {
            d(view);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public final void c(View view, int i11) {
            d(view);
        }

        public final void d(View view) {
            x x1Var;
            x x1Var2;
            int top = view.getTop();
            v1 v1Var = this.f14030b;
            if (top < v1Var.d()) {
                Window window = this.f14031c;
                if (window != null) {
                    Boolean bool = this.f14029a;
                    boolean zBooleanValue = bool == null ? this.f14032d : bool.booleanValue();
                    g gVar = new g(window.getDecorView());
                    int i11 = Build.VERSION.SDK_INT;
                    if (i11 >= 35) {
                        x1Var2 = new a2(window, gVar);
                    } else if (i11 >= 30) {
                        x1Var2 = new y1(window, gVar);
                    } else {
                        x1Var2 = i11 >= 26 ? new x1(window, gVar) : new w1(window, gVar);
                    }
                    x1Var2.K(zBooleanValue);
                }
                view.setPadding(view.getPaddingLeft(), v1Var.d() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
                return;
            }
            if (view.getTop() != 0) {
                Window window2 = this.f14031c;
                if (window2 != null) {
                    boolean z11 = this.f14032d;
                    g gVar2 = new g(window2.getDecorView());
                    int i12 = Build.VERSION.SDK_INT;
                    if (i12 >= 35) {
                        x1Var = new a2(window2, gVar2);
                    } else if (i12 >= 30) {
                        x1Var = new y1(window2, gVar2);
                    } else {
                        x1Var = i12 >= 26 ? new x1(window2, gVar2) : new w1(window2, gVar2);
                    }
                    x1Var.K(z11);
                }
                view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
            }
        }

        public final void e(Window window) {
            x x1Var;
            if (this.f14031c == window) {
                return;
            }
            this.f14031c = window;
            if (window != null) {
                g gVar = new g(window.getDecorView());
                int i11 = Build.VERSION.SDK_INT;
                if (i11 >= 35) {
                    x1Var = new a2(window, gVar);
                } else if (i11 >= 30) {
                    x1Var = new y1(window, gVar);
                } else {
                    x1Var = i11 >= 26 ? new x1(window, gVar) : new w1(window, gVar);
                }
                this.f14032d = x1Var.u();
            }
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
        if (this.f14023f == null) {
            e();
        }
        super.cancel();
    }

    public final void e() {
        if (this.f14024t == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), R.layout.design_bottom_sheet_dialog, null);
            this.f14024t = frameLayout;
            this.H = (CoordinatorLayout) frameLayout.findViewById(R.id.coordinator);
            FrameLayout frameLayout2 = (FrameLayout) this.f14024t.findViewById(R.id.design_bottom_sheet);
            this.K = frameLayout2;
            BottomSheetBehavior bottomSheetBehaviorE = BottomSheetBehavior.E(frameLayout2);
            this.f14023f = bottomSheetBehaviorE;
            BottomSheetBehavior.BottomSheetCallback bottomSheetCallback = this.R;
            ArrayList arrayList = bottomSheetBehaviorE.C0;
            if (!arrayList.contains(bottomSheetCallback)) {
                arrayList.add(bottomSheetCallback);
            }
            this.f14023f.L(this.L);
            this.Q = new MaterialBackOrchestrator(this.f14023f, this.K);
        }
    }

    public final FrameLayout f(View view, int i11, ViewGroup.LayoutParams layoutParams) {
        e();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f14024t.findViewById(R.id.coordinator);
        if (i11 != 0 && view == null) {
            view = getLayoutInflater().inflate(i11, (ViewGroup) coordinatorLayout, false);
        }
        if (this.P) {
            FrameLayout frameLayout = this.f14024t;
            u uVar = new u() { // from class: com.google.android.material.bottomsheet.BottomSheetDialog.1
                @Override // z4.u
                public final v1 e(View view2, v1 v1Var) {
                    BottomSheetDialog bottomSheetDialog = BottomSheetDialog.this;
                    EdgeToEdgeCallback edgeToEdgeCallback = bottomSheetDialog.O;
                    if (edgeToEdgeCallback != null) {
                        bottomSheetDialog.f14023f.C0.remove(edgeToEdgeCallback);
                    }
                    EdgeToEdgeCallback edgeToEdgeCallback2 = new EdgeToEdgeCallback(bottomSheetDialog.K, v1Var);
                    bottomSheetDialog.O = edgeToEdgeCallback2;
                    edgeToEdgeCallback2.e(bottomSheetDialog.getWindow());
                    BottomSheetBehavior bottomSheetBehavior = bottomSheetDialog.f14023f;
                    EdgeToEdgeCallback edgeToEdgeCallback3 = bottomSheetDialog.O;
                    ArrayList arrayList = bottomSheetBehavior.C0;
                    if (!arrayList.contains(edgeToEdgeCallback3)) {
                        arrayList.add(edgeToEdgeCallback3);
                    }
                    return v1Var;
                }
            };
            WeakHashMap weakHashMap = s0.f58893a;
            j0.m(frameLayout, uVar);
        }
        this.K.removeAllViews();
        if (layoutParams == null) {
            this.K.addView(view);
        } else {
            this.K.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(R.id.touch_outside).setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.bottomsheet.BottomSheetDialog.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                BottomSheetDialog bottomSheetDialog = BottomSheetDialog.this;
                if (bottomSheetDialog.L && bottomSheetDialog.isShowing()) {
                    if (!bottomSheetDialog.N) {
                        TypedArray typedArrayObtainStyledAttributes = bottomSheetDialog.getContext().obtainStyledAttributes(new int[]{android.R.attr.windowCloseOnTouchOutside});
                        bottomSheetDialog.M = typedArrayObtainStyledAttributes.getBoolean(0, true);
                        typedArrayObtainStyledAttributes.recycle();
                        bottomSheetDialog.N = true;
                    }
                    if (bottomSheetDialog.M) {
                        bottomSheetDialog.cancel();
                    }
                }
            }
        });
        s0.q(this.K, new b() { // from class: com.google.android.material.bottomsheet.BottomSheetDialog.3
            @Override // z4.b
            public final void d(View view2, a5.g gVar) {
                AccessibilityNodeInfo accessibilityNodeInfo = gVar.f380a;
                this.f58810a.onInitializeAccessibilityNodeInfo(view2, accessibilityNodeInfo);
                if (!BottomSheetDialog.this.L) {
                    accessibilityNodeInfo.setDismissable(false);
                } else {
                    gVar.a(1048576);
                    accessibilityNodeInfo.setDismissable(true);
                }
            }

            @Override // z4.b
            public final boolean g(View view2, int i12, Bundle bundle) {
                if (i12 == 1048576) {
                    BottomSheetDialog bottomSheetDialog = BottomSheetDialog.this;
                    if (bottomSheetDialog.L) {
                        bottomSheetDialog.cancel();
                        return true;
                    }
                }
                return super.g(view2, i12, bundle);
            }
        });
        this.K.setOnTouchListener(new AnonymousClass4());
        return this.f14024t;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Window window = getWindow();
        if (window != null) {
            boolean z11 = this.P && Color.alpha(window.getNavigationBarColor()) < 255;
            FrameLayout frameLayout = this.f14024t;
            if (frameLayout != null) {
                frameLayout.setFitsSystemWindows(!z11);
            }
            CoordinatorLayout coordinatorLayout = this.H;
            if (coordinatorLayout != null) {
                coordinatorLayout.setFitsSystemWindows(!z11);
            }
            a.I(window, !z11);
            EdgeToEdgeCallback edgeToEdgeCallback = this.O;
            if (edgeToEdgeCallback != null) {
                edgeToEdgeCallback.e(window);
            }
        }
        MaterialBackOrchestrator materialBackOrchestrator = this.Q;
        if (materialBackOrchestrator == null) {
            return;
        }
        if (this.L) {
            materialBackOrchestrator.a(false);
        } else {
            materialBackOrchestrator.b();
        }
    }

    @Override // l.b0, f.o, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setStatusBarColor(0);
            window.addFlags(Integer.MIN_VALUE);
            window.setLayout(-1, -1);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        EdgeToEdgeCallback edgeToEdgeCallback = this.O;
        if (edgeToEdgeCallback != null) {
            edgeToEdgeCallback.e(null);
        }
        MaterialBackOrchestrator materialBackOrchestrator = this.Q;
        if (materialBackOrchestrator != null) {
            materialBackOrchestrator.b();
        }
    }

    @Override // f.o, android.app.Dialog
    public final void onStart() {
        super.onStart();
        BottomSheetBehavior bottomSheetBehavior = this.f14023f;
        if (bottomSheetBehavior == null || bottomSheetBehavior.f13991p0 != 5) {
            return;
        }
        bottomSheetBehavior.e(4);
    }

    @Override // android.app.Dialog
    public final void setCancelable(boolean z11) {
        MaterialBackOrchestrator materialBackOrchestrator;
        super.setCancelable(z11);
        if (this.L != z11) {
            this.L = z11;
            BottomSheetBehavior bottomSheetBehavior = this.f14023f;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.L(z11);
            }
            if (getWindow() == null || (materialBackOrchestrator = this.Q) == null) {
                return;
            }
            if (this.L) {
                materialBackOrchestrator.a(false);
            } else {
                materialBackOrchestrator.b();
            }
        }
    }

    @Override // android.app.Dialog
    public final void setCanceledOnTouchOutside(boolean z11) {
        super.setCanceledOnTouchOutside(z11);
        if (z11 && !this.L) {
            this.L = true;
        }
        this.M = z11;
        this.N = true;
    }

    @Override // l.b0, f.o, android.app.Dialog
    public final void setContentView(int i11) {
        super.setContentView(f(null, i11, null));
    }

    @Override // l.b0, f.o, android.app.Dialog
    public final void setContentView(View view) {
        super.setContentView(f(view, 0, null));
    }

    @Override // l.b0, f.o, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(f(view, 0, layoutParams));
    }
}
