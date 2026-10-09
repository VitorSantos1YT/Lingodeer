package androidx.lifecycle;

import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class LiveDataKt {
    @qy.c
    public static final <T> Observer<T> observe(LiveData<T> liveData, LifecycleOwner owner, final fz.c onChanged) {
        m.f(liveData, "<this>");
        m.f(owner, "owner");
        m.f(onChanged, "onChanged");
        Observer<T> observer = new Observer() { // from class: androidx.lifecycle.LiveDataKt$observe$wrappedObserver$1
            @Override // androidx.lifecycle.Observer
            public final void onChanged(T t6) {
                onChanged.invoke(t6);
            }
        };
        liveData.observe(owner, observer);
        return observer;
    }
}
