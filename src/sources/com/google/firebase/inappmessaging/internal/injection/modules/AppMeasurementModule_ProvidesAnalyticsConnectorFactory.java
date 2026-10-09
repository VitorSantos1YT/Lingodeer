package com.google.firebase.inappmessaging.internal.injection.modules;

import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.inappmessaging.dagger.internal.Factory;
import com.google.firebase.inappmessaging.dagger.internal.Preconditions;
import com.google.firebase.inappmessaging.internal.ProxyAnalyticsConnector;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class AppMeasurementModule_ProvidesAnalyticsConnectorFactory implements Factory<AnalyticsConnector> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AppMeasurementModule f20198a;

    public AppMeasurementModule_ProvidesAnalyticsConnectorFactory(AppMeasurementModule appMeasurementModule) {
        this.f20198a = appMeasurementModule;
    }

    @Override // oy.a
    public final Object get() {
        ProxyAnalyticsConnector proxyAnalyticsConnector = this.f20198a.f20196a;
        Preconditions.c(proxyAnalyticsConnector);
        return proxyAnalyticsConnector;
    }
}
