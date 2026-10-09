package com.google.firebase.sessions;

import com.google.firebase.sessions.dagger.internal.Factory;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class FirebaseSessionsComponent_MainModule_Companion_TimeProviderFactory implements Factory<TimeProvider> {

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class InstanceHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final FirebaseSessionsComponent_MainModule_Companion_TimeProviderFactory f20899a = new FirebaseSessionsComponent_MainModule_Companion_TimeProviderFactory();

        private InstanceHolder() {
        }
    }

    @Override // oy.a
    public final Object get() {
        FirebaseSessionsComponent.MainModule.f20891a.getClass();
        TimeProviderImpl timeProviderImpl = TimeProviderImpl.f21026a;
        if (timeProviderImpl != null) {
            return timeProviderImpl;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
