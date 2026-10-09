package z4;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Lifecycle f58873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public LifecycleEventObserver f58874b;

    public n(Lifecycle lifecycle, LifecycleEventObserver lifecycleEventObserver) {
        this.f58873a = lifecycle;
        this.f58874b = lifecycleEventObserver;
        lifecycle.addObserver(lifecycleEventObserver);
    }
}
