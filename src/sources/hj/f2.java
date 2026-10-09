package hj;

import android.view.View;
import android.widget.LinearLayout;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class f2 implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f32561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d6 f32562b;

    public f2(LinearLayout linearLayout, d6 d6Var) {
        this.f32561a = linearLayout;
        this.f32562b = d6Var;
    }

    @Override // ta.a
    public final View getRoot() {
        return this.f32561a;
    }
}
