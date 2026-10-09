package com.google.firebase.inappmessaging.internal.injection.modules;

import com.google.firebase.inappmessaging.dagger.internal.Factory;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class GrpcChannelModule_ProvidesServiceHostFactory implements Factory<String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GrpcChannelModule f20214a;

    public GrpcChannelModule_ProvidesServiceHostFactory(GrpcChannelModule grpcChannelModule) {
        this.f20214a = grpcChannelModule;
    }

    @Override // oy.a
    public final Object get() {
        this.f20214a.getClass();
        return "firebaseinappmessaging.googleapis.com";
    }
}
