package hj;

import android.view.View;
import android.widget.LinearLayout;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class t2 implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f33325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d3 f33326b;

    public t2(LinearLayout linearLayout, d3 d3Var) {
        this.f33325a = linearLayout;
        this.f33326b = d3Var;
    }

    @Override // ta.a
    public final View getRoot() {
        return this.f33325a;
    }
}
