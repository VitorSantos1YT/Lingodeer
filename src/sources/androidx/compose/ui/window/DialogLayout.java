package androidx.compose.ui.window;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.Window;
import androidx.compose.ui.platform.AbstractComposeView;
import fz.e;
import java.util.WeakHashMap;
import l1.k1;
import l1.n;
import l1.t;
import l1.x1;
import z3.l;
import z3.p;
import z3.s;
import z4.j0;
import z4.s0;
import z4.u;
import z4.v1;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class DialogLayout extends AbstractComposeView implements s, u {
    public final Window K;
    public final k1 L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;

    public DialogLayout(Context context, Window window) {
        super(context, null, 6, 0);
        this.K = window;
        this.L = t.B(p.f58782a);
        WeakHashMap weakHashMap = s0.f58893a;
        j0.m(this, this);
        s0.s(this, new b(this));
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void a(n nVar, int i11) {
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1735448596);
        int i12 = (sVar.h(this) ? 4 : 2) | i11;
        if (sVar.T(i12 & 1, (i12 & 3) != 2)) {
            ((e) this.L.getValue()).invoke(sVar, 0);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new c(this, i11);
        }
    }

    @Override // z4.u
    public final v1 e(View view, v1 v1Var) {
        if (!this.N) {
            View childAt = getChildAt(0);
            int iMax = Math.max(0, childAt.getLeft());
            int iMax2 = Math.max(0, childAt.getTop());
            int iMax3 = Math.max(0, getWidth() - childAt.getRight());
            int iMax4 = Math.max(0, getHeight() - childAt.getBottom());
            if (iMax != 0 || iMax2 != 0 || iMax3 != 0 || iMax4 != 0) {
                return v1Var.f58905a.n(iMax, iMax2, iMax3, iMax4);
            }
        }
        return v1Var;
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void g(int i11, int i12, int i13, int i14, boolean z11) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int i15 = i13 - i11;
        int i16 = i14 - i12;
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int paddingLeft = (((i15 - measuredWidth) - paddingRight) / 2) + getPaddingLeft();
        int paddingTop = (((i16 - measuredHeight) - paddingBottom) / 2) + getPaddingTop();
        childAt.layout(paddingLeft, paddingTop, measuredWidth + paddingLeft, measuredHeight + paddingTop);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.P;
    }

    @Override // z3.s
    public final Window getWindow() {
        return this.K;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0049  */
    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void h(int i11, int i12) {
        int iA;
        int iMin;
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.h(i11, i12);
            return;
        }
        int size = View.MeasureSpec.getSize(i11);
        int size2 = View.MeasureSpec.getSize(i12);
        int mode = View.MeasureSpec.getMode(i12);
        Window window = this.K;
        if (mode != Integer.MIN_VALUE || this.M || window.getAttributes().height != -2) {
            iA = size2;
        } else if (this.N) {
            int i13 = Build.VERSION.SDK_INT;
            if (i13 < 30) {
                iA = l.f58776a.a(window);
            } else if (i13 < 32) {
                iA = z3.n.f58778a.a(window);
            } else {
                iA = size2;
            }
        } else {
            iA = size2 + 1;
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int i14 = size - paddingRight;
        if (i14 < 0) {
            i14 = 0;
        }
        int i15 = iA - paddingBottom;
        int i16 = i15 >= 0 ? i15 : 0;
        int mode2 = View.MeasureSpec.getMode(i11);
        if (mode2 != 0) {
            i11 = View.MeasureSpec.makeMeasureSpec(i14, Integer.MIN_VALUE);
        }
        if (mode != 0) {
            i12 = View.MeasureSpec.makeMeasureSpec(i16, Integer.MIN_VALUE);
        }
        childAt.measure(i11, i12);
        if (mode2 == Integer.MIN_VALUE) {
            size = Math.min(size, childAt.getMeasuredWidth() + paddingRight);
        } else if (mode2 != 1073741824) {
            size = childAt.getMeasuredWidth() + paddingRight;
        }
        if (mode != Integer.MIN_VALUE) {
            iMin = mode != 1073741824 ? childAt.getMeasuredHeight() + paddingBottom : size2;
        } else {
            iMin = Math.min(size2, childAt.getMeasuredHeight() + paddingBottom);
        }
        setMeasuredDimension(size, iMin);
        if (this.N || childAt.getMeasuredHeight() + paddingBottom <= size2 || window.getAttributes().height != -2) {
            return;
        }
        window.addFlags(Integer.MIN_VALUE);
        if (this.M) {
            return;
        }
        window.setLayout(-1, -1);
    }
}
