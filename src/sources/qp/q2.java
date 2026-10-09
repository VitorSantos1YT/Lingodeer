package qp;

import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class q2 extends ve.i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s2 f48135d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ View f48136e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ CardView f48137f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ View f48138g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ View f48139h;

    public q2(s2 s2Var, View view, CardView cardView, View view2, View view3) {
        this.f48135d = s2Var;
        this.f48136e = view;
        this.f48137f = cardView;
        this.f48138g = view2;
        this.f48139h = view3;
    }

    @Override // z4.x0
    public final void b(View view) {
        kotlin.jvm.internal.m.f(view, "view");
        s2 s2Var = this.f48135d;
        ta.a aVar = s2Var.f47886f;
        kotlin.jvm.internal.m.c(aVar);
        this.f48136e.setVisibility(8);
        this.f48137f.setVisibility(0);
        this.f48138g.setEnabled(true);
        s2.r(s2Var);
        View view2 = this.f48139h;
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        layoutParams.width = ff.h.l(36.0f);
        view2.setLayoutParams(layoutParams);
        view2.requestLayout();
        h hVar = s2Var.m;
        if (hVar != null) {
            hVar.a();
        }
        view2.postDelayed(new b2.c(4, view2, new l2(s2Var, 3)), 0L);
    }
}
