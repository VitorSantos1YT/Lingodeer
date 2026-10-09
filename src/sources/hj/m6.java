package hj;

import android.view.View;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class m6 implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NestedScrollView f32940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RecyclerView f32941b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NestedScrollView f32942c;

    public m6(NestedScrollView nestedScrollView, RecyclerView recyclerView, NestedScrollView nestedScrollView2) {
        this.f32940a = nestedScrollView;
        this.f32941b = recyclerView;
        this.f32942c = nestedScrollView2;
    }

    @Override // ta.a
    public final View getRoot() {
        return this.f32940a;
    }
}
