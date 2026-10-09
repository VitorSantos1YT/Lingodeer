package qp;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class r2 extends ve.i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f48149d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ View f48150e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f48151f;

    public /* synthetic */ r2(Object obj, int i11, View view) {
        this.f48149d = i11;
        this.f48150e = view;
        this.f48151f = obj;
    }

    @Override // z4.x0
    public final void b(View view) {
        switch (this.f48149d) {
            case 0:
                kotlin.jvm.internal.m.f(view, "view");
                this.f48150e.setEnabled(true);
                s2 s2Var = (s2) this.f48151f;
                s2.r(s2Var);
                s2Var.u(true);
                break;
            default:
                kotlin.jvm.internal.m.f(view, "view");
                this.f48150e.setVisibility(4);
                View view2 = (View) this.f48151f;
                view2.setEnabled(true);
                view2.setVisibility(0);
                break;
        }
    }
}
