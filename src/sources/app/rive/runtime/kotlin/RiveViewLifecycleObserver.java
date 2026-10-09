package app.rive.runtime.kotlin;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import app.rive.runtime.kotlin.core.RefCount;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class RiveViewLifecycleObserver implements DefaultLifecycleObserver {
    public static final int $stable = 8;
    private final List<RefCount> dependencies;

    public RiveViewLifecycleObserver(List<RefCount> dependencies) {
        m.f(dependencies, "dependencies");
        this.dependencies = dependencies;
    }

    public final List<RefCount> getDependencies() {
        return this.dependencies;
    }

    public final void insert(RefCount dependency) {
        m.f(dependency, "dependency");
        this.dependencies.add(dependency);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onCreate(LifecycleOwner owner) {
        m.f(owner, "owner");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(LifecycleOwner owner) {
        m.f(owner, "owner");
        Iterator<T> it = this.dependencies.iterator();
        while (it.hasNext()) {
            ((RefCount) it.next()).release();
        }
        owner.getLifecycle().removeObserver(this);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onPause(LifecycleOwner owner) {
        m.f(owner, "owner");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onResume(LifecycleOwner owner) {
        m.f(owner, "owner");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(LifecycleOwner owner) {
        m.f(owner, "owner");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(LifecycleOwner owner) {
        m.f(owner, "owner");
    }

    public final boolean remove(RefCount dependency) {
        m.f(dependency, "dependency");
        return this.dependencies.remove(dependency);
    }
}
