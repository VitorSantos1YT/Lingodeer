package com.google.firebase.inappmessaging.internal;

import com.google.firebase.inappmessaging.dagger.internal.Factory;
import com.google.firebase.inappmessaging.dagger.internal.Provider;
import com.google.firebase.inappmessaging.internal.injection.modules.ApiClientModule_ProvidesDataCollectionHelperFactory;
import com.google.firebase.inappmessaging.internal.time.Clock;
import com.google.firebase.inappmessaging.model.RateLimit;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class DisplayCallbacksFactory_Factory implements Factory<DisplayCallbacksFactory> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Provider f19982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Provider f19983b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Provider f19984c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Provider f19985d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Provider f19986e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Provider f19987f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Provider f19988g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Provider f19989h;

    public DisplayCallbacksFactory_Factory(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, ApiClientModule_ProvidesDataCollectionHelperFactory apiClientModule_ProvidesDataCollectionHelperFactory) {
        this.f19982a = provider;
        this.f19983b = provider2;
        this.f19984c = provider3;
        this.f19985d = provider4;
        this.f19986e = provider5;
        this.f19987f = provider6;
        this.f19988g = provider7;
        this.f19989h = apiClientModule_ProvidesDataCollectionHelperFactory;
    }

    @Override // oy.a
    public final Object get() {
        return new DisplayCallbacksFactory((ImpressionStorageClient) this.f19982a.get(), (Clock) this.f19983b.get(), (Schedulers) this.f19984c.get(), (RateLimiterClient) this.f19985d.get(), (CampaignCacheClient) this.f19986e.get(), (RateLimit) this.f19987f.get(), (MetricsLoggerClient) this.f19988g.get(), (DataCollectionHelper) this.f19989h.get());
    }
}
