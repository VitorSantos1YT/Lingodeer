package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class k1 implements r2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m1 f2500b;

    public /* synthetic */ k1(m1 m1Var, int i11) {
        this.f2499a = i11;
        this.f2500b = m1Var;
    }

    @Override // androidx.recyclerview.widget.r2
    public final int a(View view) {
        int decoratedLeft;
        int i11;
        switch (this.f2499a) {
            case 0:
                n1 n1Var = (n1) view.getLayoutParams();
                decoratedLeft = this.f2500b.getDecoratedLeft(view);
                i11 = ((ViewGroup.MarginLayoutParams) n1Var).leftMargin;
                break;
            default:
                n1 n1Var2 = (n1) view.getLayoutParams();
                decoratedLeft = this.f2500b.getDecoratedTop(view);
                i11 = ((ViewGroup.MarginLayoutParams) n1Var2).topMargin;
                break;
        }
        return decoratedLeft - i11;
    }

    @Override // androidx.recyclerview.widget.r2
    public final int b() {
        switch (this.f2499a) {
            case 0:
                return this.f2500b.getPaddingLeft();
            default:
                return this.f2500b.getPaddingTop();
        }
    }

    @Override // androidx.recyclerview.widget.r2
    public final int c() {
        int width;
        int paddingRight;
        switch (this.f2499a) {
            case 0:
                m1 m1Var = this.f2500b;
                width = m1Var.getWidth();
                paddingRight = m1Var.getPaddingRight();
                break;
            default:
                m1 m1Var2 = this.f2500b;
                width = m1Var2.getHeight();
                paddingRight = m1Var2.getPaddingBottom();
                break;
        }
        return width - paddingRight;
    }

    @Override // androidx.recyclerview.widget.r2
    public final View d(int i11) {
        switch (this.f2499a) {
            case 0:
                break;
        }
        return this.f2500b.getChildAt(i11);
    }

    @Override // androidx.recyclerview.widget.r2
    public final int e(View view) {
        int decoratedRight;
        int i11;
        switch (this.f2499a) {
            case 0:
                n1 n1Var = (n1) view.getLayoutParams();
                decoratedRight = this.f2500b.getDecoratedRight(view);
                i11 = ((ViewGroup.MarginLayoutParams) n1Var).rightMargin;
                break;
            default:
                n1 n1Var2 = (n1) view.getLayoutParams();
                decoratedRight = this.f2500b.getDecoratedBottom(view);
                i11 = ((ViewGroup.MarginLayoutParams) n1Var2).bottomMargin;
                break;
        }
        return decoratedRight + i11;
    }
}
