package com.google.firebase.sessions;

import com.google.firebase.sessions.dagger.internal.Factory;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class FirebaseSessionsComponent_MainModule_Companion_UuidGeneratorFactory implements Factory<UuidGenerator> {

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class InstanceHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final FirebaseSessionsComponent_MainModule_Companion_UuidGeneratorFactory f20900a = new FirebaseSessionsComponent_MainModule_Companion_UuidGeneratorFactory();

        private InstanceHolder() {
        }
    }

    @Override // oy.a
    public final Object get() {
        FirebaseSessionsComponent.MainModule.f20891a.getClass();
        UuidGeneratorImpl uuidGeneratorImpl = UuidGeneratorImpl.f21027a;
        if (uuidGeneratorImpl != null) {
            return uuidGeneratorImpl;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
