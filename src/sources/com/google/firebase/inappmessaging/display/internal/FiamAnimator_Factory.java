package com.google.firebase.inappmessaging.display.internal;

import com.google.firebase.inappmessaging.display.dagger.internal.Factory;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class FiamAnimator_Factory implements Factory<FiamAnimator> {

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class InstanceHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final FiamAnimator_Factory f19761a = new FiamAnimator_Factory();

        private InstanceHolder() {
        }
    }

    public static FiamAnimator_Factory a() {
        return InstanceHolder.f19761a;
    }

    @Override // oy.a
    public final Object get() {
        return new FiamAnimator();
    }
}
