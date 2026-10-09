package hj;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class r4 implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f33223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MaterialButton f33224b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RecyclerView f33225c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RecyclerView f33226d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final RecyclerView f33227e;

    public r4(ConstraintLayout constraintLayout, MaterialButton materialButton, RecyclerView recyclerView, RecyclerView recyclerView2, RecyclerView recyclerView3) {
        this.f33223a = constraintLayout;
        this.f33224b = materialButton;
        this.f33225c = recyclerView;
        this.f33226d = recyclerView2;
        this.f33227e = recyclerView3;
    }

    @Override // ta.a
    public final View getRoot() {
        return this.f33223a;
    }
}
