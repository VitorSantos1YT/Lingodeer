package com.google.firebase.inappmessaging.internal;

import android.app.Application;
import com.google.firebase.inappmessaging.dagger.internal.Factory;
import com.google.firebase.inappmessaging.dagger.internal.Provider;
import com.google.firebase.inappmessaging.internal.injection.modules.SystemClockModule_ProvidesSystemClockModuleFactory;
import com.google.firebase.inappmessaging.internal.time.Clock;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class CampaignCacheClient_Factory implements Factory<CampaignCacheClient> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Provider f19965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Provider f19966b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SystemClockModule_ProvidesSystemClockModuleFactory f19967c;

    public CampaignCacheClient_Factory(Provider provider, Provider provider2, SystemClockModule_ProvidesSystemClockModuleFactory systemClockModule_ProvidesSystemClockModuleFactory) {
        this.f19965a = provider;
        this.f19966b = provider2;
        this.f19967c = systemClockModule_ProvidesSystemClockModuleFactory;
    }

    @Override // oy.a
    public final Object get() {
        return new CampaignCacheClient((ProtoStorageClient) this.f19965a.get(), (Application) this.f19966b.get(), (Clock) this.f19967c.get());
    }
}
