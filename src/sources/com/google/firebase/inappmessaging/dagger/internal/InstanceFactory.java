package com.google.firebase.inappmessaging.dagger.internal;

import com.google.firebase.inappmessaging.dagger.Lazy;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class InstanceFactory<T> implements Factory<T>, Lazy<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f19718a;

    public InstanceFactory(Object obj) {
        this.f19718a = obj;
    }

    @Override // oy.a
    public final Object get() {
        return this.f19718a;
    }
}
