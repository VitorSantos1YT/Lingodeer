package hj;

import android.view.View;
import android.widget.LinearLayout;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class o2 implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f33011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d6 f33012b;

    public o2(LinearLayout linearLayout, d6 d6Var) {
        this.f33011a = linearLayout;
        this.f33012b = d6Var;
    }

    @Override // ta.a
    public final View getRoot() {
        return this.f33011a;
    }
}
