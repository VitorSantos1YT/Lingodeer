package com.google.firebase.inappmessaging.internal.injection.modules;

import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.inappmessaging.dagger.internal.Factory;
import com.google.firebase.inappmessaging.dagger.internal.Provider;
import com.google.firebase.inappmessaging.internal.AnalyticsEventsManager;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class AnalyticsEventsModule_ProvidesAnalyticsEventsManagerFactory implements Factory<AnalyticsEventsManager> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AnalyticsEventsModule f20179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Provider f20180b;

    public AnalyticsEventsModule_ProvidesAnalyticsEventsManagerFactory(AnalyticsEventsModule analyticsEventsModule, Provider provider) {
        this.f20179a = analyticsEventsModule;
        this.f20180b = provider;
    }

    @Override // oy.a
    public final Object get() {
        AnalyticsConnector analyticsConnector = (AnalyticsConnector) this.f20180b.get();
        this.f20179a.getClass();
        return new AnalyticsEventsManager(analyticsConnector);
    }
}
