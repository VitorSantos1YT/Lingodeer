package hj;

import android.view.View;
import android.widget.LinearLayout;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class o1 implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f33009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a6 f33010b;

    public o1(LinearLayout linearLayout, a6 a6Var) {
        this.f33009a = linearLayout;
        this.f33010b = a6Var;
    }

    @Override // ta.a
    public final View getRoot() {
        return this.f33009a;
    }
}
