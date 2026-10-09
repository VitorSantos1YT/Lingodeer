package com.google.firebase.inappmessaging.internal;

import com.google.firebase.inappmessaging.dagger.internal.Factory;
import com.google.firebase.inappmessaging.dagger.internal.Provider;
import com.google.firebase.inappmessaging.internal.injection.modules.SystemClockModule_ProvidesSystemClockModuleFactory;
import com.google.firebase.inappmessaging.internal.time.Clock;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class RateLimiterClient_Factory implements Factory<RateLimiterClient> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Provider f20065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Provider f20066b;

    public RateLimiterClient_Factory(Provider provider, SystemClockModule_ProvidesSystemClockModuleFactory systemClockModule_ProvidesSystemClockModuleFactory) {
        this.f20065a = provider;
        this.f20066b = systemClockModule_ProvidesSystemClockModuleFactory;
    }

    @Override // oy.a
    public final Object get() {
        return new RateLimiterClient((ProtoStorageClient) this.f20065a.get(), (Clock) this.f20066b.get());
    }
}
