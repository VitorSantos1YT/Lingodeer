package hj;

import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class f0 implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f32556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinearLayout f32557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RecyclerView f32558c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SwipeRefreshLayout f32559d;

    public f0(LinearLayout linearLayout, LinearLayout linearLayout2, RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout) {
        this.f32556a = linearLayout;
        this.f32557b = linearLayout2;
        this.f32558c = recyclerView;
        this.f32559d = swipeRefreshLayout;
    }

    @Override // ta.a
    public final View getRoot() {
        return this.f32556a;
    }
}
