package hj;

import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class z4 implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameLayout f33671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e3 f33672b;

    public z4(FrameLayout frameLayout, e3 e3Var) {
        this.f33671a = frameLayout;
        this.f33672b = e3Var;
    }

    @Override // ta.a
    public final View getRoot() {
        return this.f33671a;
    }
}
