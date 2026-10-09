package gc;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import rz.g1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements DefaultLifecycleObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Lifecycle f28980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g1 f28981b;

    public a(Lifecycle lifecycle, g1 g1Var) {
        this.f28980a = lifecycle;
        this.f28981b = g1Var;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        this.f28981b.cancel(null);
    }
}
