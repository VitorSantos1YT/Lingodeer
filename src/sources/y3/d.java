package y3;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import androidx.compose.ui.viewinterop.ViewFactoryHolder;
import java.util.List;
import w2.q0;
import w2.r0;
import w2.s0;
import y2.i0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewFactoryHolder f57060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i0 f57061b;

    public d(ViewFactoryHolder viewFactoryHolder, i0 i0Var) {
        this.f57060a = viewFactoryHolder;
        this.f57061b = i0Var;
    }

    @Override // w2.q0
    public final int a(w2.s sVar, List list, int i11) {
        ViewFactoryHolder viewFactoryHolder = this.f57060a;
        ViewGroup.LayoutParams layoutParams = viewFactoryHolder.getLayoutParams();
        kotlin.jvm.internal.m.c(layoutParams);
        viewFactoryHolder.measure(AndroidViewHolder.l(viewFactoryHolder, 0, i11, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
        return viewFactoryHolder.getMeasuredHeight();
    }

    @Override // w2.q0
    public final r0 e(s0 s0Var, List list, long j11) {
        ViewFactoryHolder viewFactoryHolder = this.f57060a;
        int childCount = viewFactoryHolder.getChildCount();
        ry.s sVar = ry.s.f50855a;
        if (childCount == 0) {
            return s0Var.q0(v3.a.j(j11), v3.a.i(j11), sVar, b.f57053c);
        }
        if (v3.a.j(j11) != 0) {
            viewFactoryHolder.getChildAt(0).setMinimumWidth(v3.a.j(j11));
        }
        if (v3.a.i(j11) != 0) {
            viewFactoryHolder.getChildAt(0).setMinimumHeight(v3.a.i(j11));
        }
        int iJ = v3.a.j(j11);
        int iH = v3.a.h(j11);
        ViewGroup.LayoutParams layoutParams = viewFactoryHolder.getLayoutParams();
        kotlin.jvm.internal.m.c(layoutParams);
        int iL = AndroidViewHolder.l(viewFactoryHolder, iJ, iH, layoutParams.width);
        int i11 = v3.a.i(j11);
        int iG = v3.a.g(j11);
        ViewGroup.LayoutParams layoutParams2 = viewFactoryHolder.getLayoutParams();
        kotlin.jvm.internal.m.c(layoutParams2);
        viewFactoryHolder.measure(iL, AndroidViewHolder.l(viewFactoryHolder, i11, iG, layoutParams2.height));
        return s0Var.q0(viewFactoryHolder.getMeasuredWidth(), viewFactoryHolder.getMeasuredHeight(), sVar, new c(viewFactoryHolder, this.f57061b, 1));
    }

    @Override // w2.q0
    public final int f(w2.s sVar, List list, int i11) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewFactoryHolder viewFactoryHolder = this.f57060a;
        ViewGroup.LayoutParams layoutParams = viewFactoryHolder.getLayoutParams();
        kotlin.jvm.internal.m.c(layoutParams);
        viewFactoryHolder.measure(iMakeMeasureSpec, AndroidViewHolder.l(viewFactoryHolder, 0, i11, layoutParams.height));
        return viewFactoryHolder.getMeasuredWidth();
    }

    @Override // w2.q0
    public final int h(w2.s sVar, List list, int i11) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewFactoryHolder viewFactoryHolder = this.f57060a;
        ViewGroup.LayoutParams layoutParams = viewFactoryHolder.getLayoutParams();
        kotlin.jvm.internal.m.c(layoutParams);
        viewFactoryHolder.measure(iMakeMeasureSpec, AndroidViewHolder.l(viewFactoryHolder, 0, i11, layoutParams.height));
        return viewFactoryHolder.getMeasuredWidth();
    }

    @Override // w2.q0
    public final int i(w2.s sVar, List list, int i11) {
        ViewFactoryHolder viewFactoryHolder = this.f57060a;
        ViewGroup.LayoutParams layoutParams = viewFactoryHolder.getLayoutParams();
        kotlin.jvm.internal.m.c(layoutParams);
        viewFactoryHolder.measure(AndroidViewHolder.l(viewFactoryHolder, 0, i11, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
        return viewFactoryHolder.getMeasuredHeight();
    }
}
