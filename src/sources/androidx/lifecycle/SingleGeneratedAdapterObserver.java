package androidx.lifecycle;

import com.google.android.gms.measurement.zfxB.ypOOxsaJG;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class SingleGeneratedAdapterObserver implements LifecycleEventObserver {
    private final GeneratedAdapter generatedAdapter;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
        m.f(source, "source");
        m.f(event, "event");
        this.generatedAdapter.callMethods(source, event, false, null);
        this.generatedAdapter.callMethods(source, event, true, null);
    }

    public SingleGeneratedAdapterObserver(GeneratedAdapter generatedAdapter) {
        m.f(generatedAdapter, ypOOxsaJG.YBx);
        this.generatedAdapter = generatedAdapter;
    }
}
