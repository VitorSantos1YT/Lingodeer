package com.google.firebase.inappmessaging.internal.injection.modules;

import android.app.Application;
import com.google.firebase.inappmessaging.dagger.internal.Factory;
import com.google.firebase.inappmessaging.dagger.internal.Provider;
import com.google.firebase.inappmessaging.internal.ProtoStorageClient;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class ProtoStorageClientModule_ProvidesProtoStorageClientForImpressionStoreFactory implements Factory<ProtoStorageClient> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProtoStorageClientModule f20225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Provider f20226b;

    public ProtoStorageClientModule_ProvidesProtoStorageClientForImpressionStoreFactory(ProtoStorageClientModule protoStorageClientModule, Provider provider) {
        this.f20225a = protoStorageClientModule;
        this.f20226b = provider;
    }

    @Override // oy.a
    public final Object get() {
        Application application = (Application) this.f20226b.get();
        this.f20225a.getClass();
        return new ProtoStorageClient(application, "fiam_impressions_store_file");
    }
}
