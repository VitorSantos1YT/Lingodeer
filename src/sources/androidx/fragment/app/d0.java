package androidx.fragment.app;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 extends s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k0 f1639a;

    public d0(k0 k0Var) {
        this.f1639a = k0Var;
    }

    @Override // androidx.fragment.app.s0
    public final View b(int i11) {
        k0 k0Var = this.f1639a;
        View view = k0Var.mView;
        if (view != null) {
            return view.findViewById(i11);
        }
        throw new IllegalStateException("Fragment " + k0Var + " does not have a view");
    }

    @Override // androidx.fragment.app.s0
    public final boolean c() {
        return this.f1639a.mView != null;
    }
}
