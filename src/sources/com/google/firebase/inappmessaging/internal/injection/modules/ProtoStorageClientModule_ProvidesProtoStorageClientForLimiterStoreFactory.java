package com.google.firebase.inappmessaging.internal.injection.modules;

import android.app.Application;
import com.google.firebase.inappmessaging.dagger.internal.Factory;
import com.google.firebase.inappmessaging.dagger.internal.Provider;
import com.google.firebase.inappmessaging.internal.ProtoStorageClient;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class ProtoStorageClientModule_ProvidesProtoStorageClientForLimiterStoreFactory implements Factory<ProtoStorageClient> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProtoStorageClientModule f20227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Provider f20228b;

    public ProtoStorageClientModule_ProvidesProtoStorageClientForLimiterStoreFactory(ProtoStorageClientModule protoStorageClientModule, Provider provider) {
        this.f20227a = protoStorageClientModule;
        this.f20228b = provider;
    }

    @Override // oy.a
    public final Object get() {
        Application application = (Application) this.f20228b.get();
        this.f20227a.getClass();
        return new ProtoStorageClient(application, "rate_limit_store_file");
    }
}
