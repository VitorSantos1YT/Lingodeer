package com.google.firebase.inappmessaging.internal.injection.modules;

import android.app.Application;
import com.google.firebase.inappmessaging.dagger.internal.Factory;
import com.google.firebase.inappmessaging.dagger.internal.Provider;
import com.google.firebase.inappmessaging.internal.ProtoStorageClient;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class ProtoStorageClientModule_ProvidesProtoStorageClientForCampaignFactory implements Factory<ProtoStorageClient> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProtoStorageClientModule f20223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Provider f20224b;

    public ProtoStorageClientModule_ProvidesProtoStorageClientForCampaignFactory(ProtoStorageClientModule protoStorageClientModule, Provider provider) {
        this.f20223a = protoStorageClientModule;
        this.f20224b = provider;
    }

    @Override // oy.a
    public final Object get() {
        Application application = (Application) this.f20224b.get();
        this.f20223a.getClass();
        return new ProtoStorageClient(application, "fiam_eligible_campaigns_cache_file");
    }
}
