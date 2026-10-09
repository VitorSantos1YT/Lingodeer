package hj;

import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class w4 implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f33521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e3 f33522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RecyclerView f33523c;

    public w4(LinearLayout linearLayout, e3 e3Var, RecyclerView recyclerView) {
        this.f33521a = linearLayout;
        this.f33522b = e3Var;
        this.f33523c = recyclerView;
    }

    @Override // ta.a
    public final View getRoot() {
        return this.f33521a;
    }
}
