package f;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements LifecycleEventObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f26145a;

    public g(n nVar) {
        this.f26145a = nVar;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
        kotlin.jvm.internal.m.f(source, "source");
        kotlin.jvm.internal.m.f(event, "event");
        n nVar = this.f26145a;
        n.access$ensureViewModelStore(nVar);
        nVar.getLifecycle().removeObserver(this);
    }
}
