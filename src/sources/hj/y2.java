package hj;

import android.view.View;
import android.widget.LinearLayout;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class y2 implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f33614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e3 f33615b;

    public y2(LinearLayout linearLayout, e3 e3Var) {
        this.f33614a = linearLayout;
        this.f33615b = e3Var;
    }

    @Override // ta.a
    public final View getRoot() {
        return this.f33614a;
    }
}
