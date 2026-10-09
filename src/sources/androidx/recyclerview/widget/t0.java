package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class t0 extends u0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2617d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t0(m1 m1Var, int i11) {
        super(m1Var);
        this.f2617d = i11;
    }

    @Override // androidx.recyclerview.widget.u0
    public final int b(View view) {
        int decoratedRight;
        int i11;
        switch (this.f2617d) {
            case 0:
                n1 n1Var = (n1) view.getLayoutParams();
                decoratedRight = this.f2626a.getDecoratedRight(view);
                i11 = ((ViewGroup.MarginLayoutParams) n1Var).rightMargin;
                break;
            default:
                n1 n1Var2 = (n1) view.getLayoutParams();
                decoratedRight = this.f2626a.getDecoratedBottom(view);
                i11 = ((ViewGroup.MarginLayoutParams) n1Var2).bottomMargin;
                break;
        }
        return decoratedRight + i11;
    }

    @Override // androidx.recyclerview.widget.u0
    public final int c(View view) {
        int decoratedMeasuredWidth;
        int i11;
        switch (this.f2617d) {
            case 0:
                n1 n1Var = (n1) view.getLayoutParams();
                decoratedMeasuredWidth = this.f2626a.getDecoratedMeasuredWidth(view) + ((ViewGroup.MarginLayoutParams) n1Var).leftMargin;
                i11 = ((ViewGroup.MarginLayoutParams) n1Var).rightMargin;
                break;
            default:
                n1 n1Var2 = (n1) view.getLayoutParams();
                decoratedMeasuredWidth = this.f2626a.getDecoratedMeasuredHeight(view) + ((ViewGroup.MarginLayoutParams) n1Var2).topMargin;
                i11 = ((ViewGroup.MarginLayoutParams) n1Var2).bottomMargin;
                break;
        }
        return decoratedMeasuredWidth + i11;
    }

    @Override // androidx.recyclerview.widget.u0
    public final int d(View view) {
        int decoratedMeasuredHeight;
        int i11;
        switch (this.f2617d) {
            case 0:
                n1 n1Var = (n1) view.getLayoutParams();
                decoratedMeasuredHeight = this.f2626a.getDecoratedMeasuredHeight(view) + ((ViewGroup.MarginLayoutParams) n1Var).topMargin;
                i11 = ((ViewGroup.MarginLayoutParams) n1Var).bottomMargin;
                break;
            default:
                n1 n1Var2 = (n1) view.getLayoutParams();
                decoratedMeasuredHeight = this.f2626a.getDecoratedMeasuredWidth(view) + ((ViewGroup.MarginLayoutParams) n1Var2).leftMargin;
                i11 = ((ViewGroup.MarginLayoutParams) n1Var2).rightMargin;
                break;
        }
        return decoratedMeasuredHeight + i11;
    }

    @Override // androidx.recyclerview.widget.u0
    public final int e(View view) {
        int decoratedLeft;
        int i11;
        switch (this.f2617d) {
            case 0:
                n1 n1Var = (n1) view.getLayoutParams();
                decoratedLeft = this.f2626a.getDecoratedLeft(view);
                i11 = ((ViewGroup.MarginLayoutParams) n1Var).leftMargin;
                break;
            default:
                n1 n1Var2 = (n1) view.getLayoutParams();
                decoratedLeft = this.f2626a.getDecoratedTop(view);
                i11 = ((ViewGroup.MarginLayoutParams) n1Var2).topMargin;
                break;
        }
        return decoratedLeft - i11;
    }

    @Override // androidx.recyclerview.widget.u0
    public final int f() {
        switch (this.f2617d) {
            case 0:
                return this.f2626a.getWidth();
            default:
                return this.f2626a.getHeight();
        }
    }

    @Override // androidx.recyclerview.widget.u0
    public final int g() {
        int width;
        int paddingRight;
        switch (this.f2617d) {
            case 0:
                m1 m1Var = this.f2626a;
                width = m1Var.getWidth();
                paddingRight = m1Var.getPaddingRight();
                break;
            default:
                m1 m1Var2 = this.f2626a;
                width = m1Var2.getHeight();
                paddingRight = m1Var2.getPaddingBottom();
                break;
        }
        return width - paddingRight;
    }

    @Override // androidx.recyclerview.widget.u0
    public final int h() {
        switch (this.f2617d) {
            case 0:
                return this.f2626a.getPaddingRight();
            default:
                return this.f2626a.getPaddingBottom();
        }
    }

    @Override // androidx.recyclerview.widget.u0
    public final int i() {
        switch (this.f2617d) {
            case 0:
                return this.f2626a.getWidthMode();
            default:
                return this.f2626a.getHeightMode();
        }
    }

    @Override // androidx.recyclerview.widget.u0
    public final int j() {
        switch (this.f2617d) {
            case 0:
                return this.f2626a.getHeightMode();
            default:
                return this.f2626a.getWidthMode();
        }
    }

    @Override // androidx.recyclerview.widget.u0
    public final int k() {
        switch (this.f2617d) {
            case 0:
                return this.f2626a.getPaddingLeft();
            default:
                return this.f2626a.getPaddingTop();
        }
    }

    @Override // androidx.recyclerview.widget.u0
    public final int l() {
        int width;
        int paddingRight;
        switch (this.f2617d) {
            case 0:
                m1 m1Var = this.f2626a;
                width = m1Var.getWidth() - m1Var.getPaddingLeft();
                paddingRight = m1Var.getPaddingRight();
                break;
            default:
                m1 m1Var2 = this.f2626a;
                width = m1Var2.getHeight() - m1Var2.getPaddingTop();
                paddingRight = m1Var2.getPaddingBottom();
                break;
        }
        return width - paddingRight;
    }

    @Override // androidx.recyclerview.widget.u0
    public final int n(View view) {
        switch (this.f2617d) {
            case 0:
                m1 m1Var = this.f2626a;
                Rect rect = this.f2628c;
                m1Var.getTransformedBoundingBox(view, true, rect);
                return rect.right;
            default:
                m1 m1Var2 = this.f2626a;
                Rect rect2 = this.f2628c;
                m1Var2.getTransformedBoundingBox(view, true, rect2);
                return rect2.bottom;
        }
    }

    @Override // androidx.recyclerview.widget.u0
    public final int o(View view) {
        switch (this.f2617d) {
            case 0:
                m1 m1Var = this.f2626a;
                Rect rect = this.f2628c;
                m1Var.getTransformedBoundingBox(view, true, rect);
                return rect.left;
            default:
                m1 m1Var2 = this.f2626a;
                Rect rect2 = this.f2628c;
                m1Var2.getTransformedBoundingBox(view, true, rect2);
                return rect2.top;
        }
    }

    @Override // androidx.recyclerview.widget.u0
    public final void p(int i11) {
        switch (this.f2617d) {
            case 0:
                this.f2626a.offsetChildrenHorizontal(i11);
                break;
            default:
                this.f2626a.offsetChildrenVertical(i11);
                break;
        }
    }
}
