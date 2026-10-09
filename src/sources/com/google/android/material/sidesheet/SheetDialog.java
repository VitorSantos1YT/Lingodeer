package com.google.android.material.sidesheet;

import a5.g;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.motion.MaterialBackOrchestrator;
import com.google.android.material.sidesheet.SheetCallback;
import com.lingodeer.R;
import l.b0;
import l4.e;
import z4.s0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
abstract class SheetDialog<C extends SheetCallback> extends b0 {
    public FrameLayout H;
    public boolean K;
    public boolean L;
    public MaterialBackOrchestrator M;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Sheet f15350f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public FrameLayout f15351t;

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        g();
        super.cancel();
    }

    public abstract void e(Sheet sheet);

    public final void f() {
        if (this.f15351t == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), R.layout.m3_side_sheet_dialog, null);
            this.f15351t = frameLayout;
            FrameLayout frameLayout2 = (FrameLayout) frameLayout.findViewById(R.id.m3_side_sheet);
            this.H = frameLayout2;
            SideSheetBehavior sideSheetBehaviorH = h(frameLayout2);
            this.f15350f = sideSheetBehaviorH;
            e(sideSheetBehaviorH);
            this.M = new MaterialBackOrchestrator(this.f15350f, this.H);
        }
    }

    public Sheet g() {
        if (this.f15350f == null) {
            f();
        }
        return this.f15350f;
    }

    public abstract SideSheetBehavior h(FrameLayout frameLayout);

    public final FrameLayout i(View view, int i11, ViewGroup.LayoutParams layoutParams) {
        f();
        if (this.f15351t == null) {
            f();
        }
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f15351t.findViewById(R.id.coordinator);
        if (i11 != 0 && view == null) {
            view = getLayoutInflater().inflate(i11, (ViewGroup) coordinatorLayout, false);
        }
        if (this.H == null) {
            f();
        }
        FrameLayout frameLayout = this.H;
        frameLayout.removeAllViews();
        if (layoutParams == null) {
            frameLayout.addView(view);
        } else {
            frameLayout.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(R.id.touch_outside).setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.sidesheet.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                SheetDialog sheetDialog = this.f15368a;
                if (sheetDialog.K && sheetDialog.isShowing() && sheetDialog.L) {
                    sheetDialog.cancel();
                }
            }
        });
        if (this.H == null) {
            f();
        }
        s0.q(this.H, new z4.b() { // from class: com.google.android.material.sidesheet.SheetDialog.1
            @Override // z4.b
            public final void d(View view2, g gVar) {
                AccessibilityNodeInfo accessibilityNodeInfo = gVar.f380a;
                this.f58810a.onInitializeAccessibilityNodeInfo(view2, accessibilityNodeInfo);
                if (!SheetDialog.this.K) {
                    accessibilityNodeInfo.setDismissable(false);
                } else {
                    gVar.a(1048576);
                    accessibilityNodeInfo.setDismissable(true);
                }
            }

            @Override // z4.b
            public final boolean g(View view2, int i12, Bundle bundle) {
                if (i12 == 1048576) {
                    SheetDialog sheetDialog = SheetDialog.this;
                    if (sheetDialog.K) {
                        sheetDialog.cancel();
                        return true;
                    }
                }
                return super.g(view2, i12, bundle);
            }
        });
        return this.f15351t;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        FrameLayout frameLayout;
        super.onAttachedToWindow();
        Window window = getWindow();
        if (window != null && (frameLayout = this.H) != null && (frameLayout.getLayoutParams() instanceof e)) {
            window.setWindowAnimations(Gravity.getAbsoluteGravity(((e) this.H.getLayoutParams()).f39718c, this.H.getLayoutDirection()) == 3 ? R.style.Animation_Material3_SideSheetDialog_Left : R.style.Animation_Material3_SideSheetDialog_Right);
        }
        MaterialBackOrchestrator materialBackOrchestrator = this.M;
        if (this.K) {
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
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        MaterialBackOrchestrator materialBackOrchestrator = this.M;
        if (materialBackOrchestrator != null) {
            materialBackOrchestrator.b();
        }
    }

    @Override // f.o, android.app.Dialog
    public final void onStart() {
        super.onStart();
        Sheet sheet = this.f15350f;
        if (sheet == null || sheet.getState() != 5) {
            return;
        }
        this.f15350f.e(3);
    }

    @Override // android.app.Dialog
    public void setCancelable(boolean z11) {
        super.setCancelable(z11);
        if (this.K != z11) {
            this.K = z11;
        }
        if (getWindow() != null) {
            MaterialBackOrchestrator materialBackOrchestrator = this.M;
            if (this.K) {
                materialBackOrchestrator.a(false);
            } else {
                materialBackOrchestrator.b();
            }
        }
    }

    @Override // android.app.Dialog
    public void setCanceledOnTouchOutside(boolean z11) {
        super.setCanceledOnTouchOutside(z11);
        if (z11 && !this.K) {
            this.K = true;
        }
        this.L = z11;
    }

    @Override // l.b0, f.o, android.app.Dialog
    public void setContentView(int i11) {
        super.setContentView(i(null, i11, null));
    }

    @Override // l.b0, f.o, android.app.Dialog
    public void setContentView(View view) {
        super.setContentView(i(view, 0, null));
    }

    @Override // l.b0, f.o, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(i(view, 0, layoutParams));
    }
}
