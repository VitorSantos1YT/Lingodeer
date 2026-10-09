package com.google.firebase.inappmessaging.internal;

import com.google.firebase.inappmessaging.dagger.internal.Factory;
import com.google.firebase.inappmessaging.dagger.internal.Provider;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class ImpressionStorageClient_Factory implements Factory<ImpressionStorageClient> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Provider f20011a;

    public ImpressionStorageClient_Factory(Provider provider) {
        this.f20011a = provider;
    }

    @Override // oy.a
    public final Object get() {
        return new ImpressionStorageClient((ProtoStorageClient) this.f20011a.get());
    }
}
