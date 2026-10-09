package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import r.t2;
import r.x0;
import r.y0;
import z4.w0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {
    public x0 H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TypedValue f939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TypedValue f940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TypedValue f941c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TypedValue f942d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TypedValue f943e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TypedValue f944f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Rect f945t;

    public ContentFrameLayout(Context context) {
        this(context, null);
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f943e == null) {
            this.f943e = new TypedValue();
        }
        return this.f943e;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f944f == null) {
            this.f944f = new TypedValue();
        }
        return this.f944f;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f941c == null) {
            this.f941c = new TypedValue();
        }
        return this.f941c;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f942d == null) {
            this.f942d = new TypedValue();
        }
        return this.f942d;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f939a == null) {
            this.f939a = new TypedValue();
        }
        return this.f939a;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f940b == null) {
            this.f940b = new TypedValue();
        }
        return this.f940b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        x0 x0Var = this.H;
        if (x0Var != null) {
            x0Var.getClass();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        c cVar;
        super.onDetachedFromWindow();
        x0 x0Var = this.H;
        if (x0Var != null) {
            androidx.appcompat.app.b bVar = (androidx.appcompat.app.b) ((a5.j) x0Var).f385b;
            y0 y0Var = bVar.T;
            if (y0Var != null) {
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) y0Var;
                actionBarOverlayLayout.k();
                ActionMenuView actionMenuView = ((t2) actionBarOverlayLayout.f871e).f48654a.f1028a;
                if (actionMenuView != null && (cVar = actionMenuView.V) != null) {
                    cVar.b();
                    r.e eVar = cVar.W;
                    if (eVar != null && eVar.b()) {
                        eVar.f47318i.dismiss();
                    }
                }
            }
            if (bVar.Y != null) {
                bVar.N.getDecorView().removeCallbacks(bVar.Z);
                if (bVar.Y.isShowing()) {
                    try {
                        bVar.Y.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                bVar.Y = null;
            }
            w0 w0Var = bVar.f801a0;
            if (w0Var != null) {
                w0Var.b();
            }
            q.l lVar = bVar.A(0).f39081h;
            if (lVar != null) {
                lVar.c(true);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004e  */
    /* JADX WARN: Code duplicated, block: B:22:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x008a  */
    /* JADX WARN: Code duplicated, block: B:38:0x009d  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:58:0x00de  */
    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i11, int i12) {
        int iMakeMeasureSpec;
        boolean z11;
        int iMakeMeasureSpec2;
        int i13;
        int i14;
        float fraction;
        int i15;
        int i16;
        float fraction2;
        int i17;
        int i18;
        float fraction3;
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        boolean z12 = true;
        boolean z13 = displayMetrics.widthPixels < displayMetrics.heightPixels;
        int mode = View.MeasureSpec.getMode(i11);
        int mode2 = View.MeasureSpec.getMode(i12);
        Rect rect = this.f945t;
        if (mode != Integer.MIN_VALUE) {
            iMakeMeasureSpec = i11;
            z11 = false;
        } else {
            TypedValue typedValue = z13 ? this.f942d : this.f941c;
            if (typedValue == null || (i17 = typedValue.type) == 0) {
                iMakeMeasureSpec = i11;
                z11 = false;
            } else {
                if (i17 == 5) {
                    fraction3 = typedValue.getDimension(displayMetrics);
                } else {
                    if (i17 == 6) {
                        int i19 = displayMetrics.widthPixels;
                        fraction3 = typedValue.getFraction(i19, i19);
                    } else {
                        i18 = 0;
                    }
                    if (i18 > 0) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(i18 - (rect.left + rect.right), View.MeasureSpec.getSize(i11)), 1073741824);
                        z11 = true;
                    } else {
                        iMakeMeasureSpec = i11;
                        z11 = false;
                    }
                }
                i18 = (int) fraction3;
                if (i18 > 0) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(i18 - (rect.left + rect.right), View.MeasureSpec.getSize(i11)), 1073741824);
                    z11 = true;
                } else {
                    iMakeMeasureSpec = i11;
                    z11 = false;
                }
            }
        }
        if (mode2 != Integer.MIN_VALUE) {
            iMakeMeasureSpec2 = i12;
        } else {
            TypedValue typedValue2 = z13 ? this.f943e : this.f944f;
            if (typedValue2 == null || (i15 = typedValue2.type) == 0) {
                iMakeMeasureSpec2 = i12;
            } else {
                if (i15 == 5) {
                    fraction2 = typedValue2.getDimension(displayMetrics);
                } else {
                    if (i15 == 6) {
                        int i21 = displayMetrics.heightPixels;
                        fraction2 = typedValue2.getFraction(i21, i21);
                    } else {
                        i16 = 0;
                    }
                    if (i16 > 0) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.min(i16 - (rect.top + rect.bottom), View.MeasureSpec.getSize(i12)), 1073741824);
                    } else {
                        iMakeMeasureSpec2 = i12;
                    }
                }
                i16 = (int) fraction2;
                if (i16 > 0) {
                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.min(i16 - (rect.top + rect.bottom), View.MeasureSpec.getSize(i12)), 1073741824);
                } else {
                    iMakeMeasureSpec2 = i12;
                }
            }
        }
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec2);
        int measuredWidth = getMeasuredWidth();
        int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        if (z11 || mode != Integer.MIN_VALUE) {
            z12 = false;
        } else {
            TypedValue typedValue3 = z13 ? this.f940b : this.f939a;
            if (typedValue3 == null || (i13 = typedValue3.type) == 0) {
                z12 = false;
            } else {
                if (i13 == 5) {
                    fraction = typedValue3.getDimension(displayMetrics);
                } else {
                    if (i13 == 6) {
                        int i22 = displayMetrics.widthPixels;
                        fraction = typedValue3.getFraction(i22, i22);
                    } else {
                        i14 = 0;
                    }
                    if (i14 > 0) {
                        i14 -= rect.left + rect.right;
                    }
                    if (measuredWidth < i14) {
                        iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i14, 1073741824);
                    } else {
                        z12 = false;
                    }
                }
                i14 = (int) fraction;
                if (i14 > 0) {
                    i14 -= rect.left + rect.right;
                }
                if (measuredWidth < i14) {
                    iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i14, 1073741824);
                } else {
                    z12 = false;
                }
            }
        }
        if (z12) {
            super.onMeasure(iMakeMeasureSpec3, iMakeMeasureSpec2);
        }
    }

    public void setAttachListener(x0 x0Var) {
        this.H = x0Var;
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f945t = new Rect();
    }
}
