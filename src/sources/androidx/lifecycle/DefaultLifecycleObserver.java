package androidx.lifecycle;

import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public interface DefaultLifecycleObserver extends LifecycleObserver {
    default void onCreate(LifecycleOwner owner) {
        m.f(owner, "owner");
    }

    default void onDestroy(LifecycleOwner owner) {
        m.f(owner, "owner");
    }

    default void onPause(LifecycleOwner owner) {
        m.f(owner, "owner");
    }

    default void onResume(LifecycleOwner owner) {
        m.f(owner, "owner");
    }

    default void onStart(LifecycleOwner owner) {
        m.f(owner, "owner");
    }

    default void onStop(LifecycleOwner owner) {
        m.f(owner, "owner");
    }
}
