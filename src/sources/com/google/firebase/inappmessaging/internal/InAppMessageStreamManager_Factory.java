package com.google.firebase.inappmessaging.internal;

import com.google.firebase.inappmessaging.dagger.internal.Factory;
import com.google.firebase.inappmessaging.dagger.internal.InstanceFactory;
import com.google.firebase.inappmessaging.dagger.internal.Provider;
import com.google.firebase.inappmessaging.internal.injection.modules.ApiClientModule_ProvidesDataCollectionHelperFactory;
import com.google.firebase.inappmessaging.internal.injection.modules.ApiClientModule_ProvidesFirebaseInstallationsFactory;
import com.google.firebase.inappmessaging.internal.injection.modules.ApiClientModule_ProvidesTestDeviceHelperFactory;
import com.google.firebase.inappmessaging.internal.time.Clock;
import com.google.firebase.inappmessaging.model.RateLimit;
import com.google.firebase.installations.FirebaseInstallationsApi;
import ex.f1;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class InAppMessageStreamManager_Factory implements Factory<InAppMessageStreamManager> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Provider f20027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Provider f20028b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Provider f20029c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Provider f20030d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Provider f20031e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Provider f20032f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Provider f20033g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Provider f20034h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Provider f20035i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Provider f20036j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Provider f20037k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Provider f20038l;
    public final Provider m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final InstanceFactory f20039n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Provider f20040o;

    public InAppMessageStreamManager_Factory(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, Provider provider9, Provider provider10, ApiClientModule_ProvidesTestDeviceHelperFactory apiClientModule_ProvidesTestDeviceHelperFactory, ApiClientModule_ProvidesFirebaseInstallationsFactory apiClientModule_ProvidesFirebaseInstallationsFactory, ApiClientModule_ProvidesDataCollectionHelperFactory apiClientModule_ProvidesDataCollectionHelperFactory, InstanceFactory instanceFactory, Provider provider11) {
        this.f20027a = provider;
        this.f20028b = provider2;
        this.f20029c = provider3;
        this.f20030d = provider4;
        this.f20031e = provider5;
        this.f20032f = provider6;
        this.f20033g = provider7;
        this.f20034h = provider8;
        this.f20035i = provider9;
        this.f20036j = provider10;
        this.f20037k = apiClientModule_ProvidesTestDeviceHelperFactory;
        this.f20038l = apiClientModule_ProvidesFirebaseInstallationsFactory;
        this.m = apiClientModule_ProvidesDataCollectionHelperFactory;
        this.f20039n = instanceFactory;
        this.f20040o = provider11;
    }

    @Override // oy.a
    public final Object get() {
        return new InAppMessageStreamManager((f1) this.f20027a.get(), (f1) this.f20028b.get(), (CampaignCacheClient) this.f20029c.get(), (Clock) this.f20030d.get(), (ApiClient) this.f20031e.get(), (AnalyticsEventsManager) this.f20032f.get(), (Schedulers) this.f20033g.get(), (ImpressionStorageClient) this.f20034h.get(), (RateLimiterClient) this.f20035i.get(), (RateLimit) this.f20036j.get(), (TestDeviceHelper) this.f20037k.get(), (FirebaseInstallationsApi) this.f20038l.get(), (DataCollectionHelper) this.m.get(), (AbtIntegrationHelper) this.f20039n.f19718a, (Executor) this.f20040o.get());
    }
}
