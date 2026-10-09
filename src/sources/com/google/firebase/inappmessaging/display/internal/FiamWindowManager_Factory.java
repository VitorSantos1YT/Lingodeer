package com.google.firebase.inappmessaging.display.internal;

import com.google.firebase.inappmessaging.display.dagger.internal.Factory;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class FiamWindowManager_Factory implements Factory<FiamWindowManager> {

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class InstanceHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final FiamWindowManager_Factory f19771a = new FiamWindowManager_Factory();

        private InstanceHolder() {
        }
    }

    public static FiamWindowManager_Factory a() {
        return InstanceHolder.f19771a;
    }

    @Override // oy.a
    public final Object get() {
        return new FiamWindowManager();
    }
}
