package hj;

import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class z3 implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f33662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinearLayout f33663b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinearLayout f33664c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e3 f33665d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LinearLayout f33666e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final RecyclerView f33667f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final RecyclerView f33668g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final RecyclerView f33669h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final RecyclerView f33670i;

    public z3(LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, e3 e3Var, LinearLayout linearLayout4, RecyclerView recyclerView, RecyclerView recyclerView2, RecyclerView recyclerView3, RecyclerView recyclerView4) {
        this.f33662a = linearLayout;
        this.f33663b = linearLayout2;
        this.f33664c = linearLayout3;
        this.f33665d = e3Var;
        this.f33666e = linearLayout4;
        this.f33667f = recyclerView;
        this.f33668g = recyclerView2;
        this.f33669h = recyclerView3;
        this.f33670i = recyclerView4;
    }

    @Override // ta.a
    public final View getRoot() {
        return this.f33662a;
    }
}
