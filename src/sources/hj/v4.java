package hj;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class v4 implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f33459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RecyclerView f33460b;

    public v4(ConstraintLayout constraintLayout, RecyclerView recyclerView) {
        this.f33459a = constraintLayout;
        this.f33460b = recyclerView;
    }

    @Override // ta.a
    public final View getRoot() {
        return this.f33459a;
    }
}
