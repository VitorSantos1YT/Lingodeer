package androidx.fragment.app;

import android.os.Bundle;
import androidx.lifecycle.SavedStateHandleSupport;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 extends i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k0 f1630a;

    public c0(k0 k0Var) {
        this.f1630a = k0Var;
    }

    @Override // androidx.fragment.app.i0
    public final void a() {
        k0 k0Var = this.f1630a;
        k0Var.mSavedStateRegistryController.f23339a.a();
        SavedStateHandleSupport.enableSavedStateHandles(k0Var);
        Bundle bundle = k0Var.mSavedFragmentState;
        k0Var.mSavedStateRegistryController.a(bundle != null ? bundle.getBundle("registryState") : null);
    }
}
