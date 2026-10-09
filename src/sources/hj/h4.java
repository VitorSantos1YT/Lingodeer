package hj;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class h4 implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f32658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RecyclerView f32659b;

    public h4(ConstraintLayout constraintLayout, RecyclerView recyclerView) {
        this.f32658a = constraintLayout;
        this.f32659b = recyclerView;
    }

    @Override // ta.a
    public final View getRoot() {
        return this.f32658a;
    }
}
