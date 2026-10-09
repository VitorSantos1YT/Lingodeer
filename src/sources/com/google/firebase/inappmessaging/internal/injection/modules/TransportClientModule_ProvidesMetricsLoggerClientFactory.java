package com.google.firebase.inappmessaging.internal.injection.modules;

import com.google.android.datatransport.TransportFactory;
import com.google.firebase.FirebaseApp;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.inappmessaging.dagger.internal.Factory;
import com.google.firebase.inappmessaging.dagger.internal.InstanceFactory;
import com.google.firebase.inappmessaging.dagger.internal.Provider;
import com.google.firebase.inappmessaging.internal.DeveloperListenerManager;
import com.google.firebase.inappmessaging.internal.MetricsLoggerClient;
import com.google.firebase.inappmessaging.internal.time.Clock;
import com.google.firebase.installations.FirebaseInstallationsApi;
import hh.c;
import java.util.concurrent.Executor;
import nf.f;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class TransportClientModule_ProvidesMetricsLoggerClientFactory implements Factory<MetricsLoggerClient> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Provider f20233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InstanceFactory f20234b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Provider f20235c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Provider f20236d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Provider f20237e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Provider f20238f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Provider f20239g;

    public TransportClientModule_ProvidesMetricsLoggerClientFactory(ApiClientModule_ProvidesFirebaseAppFactory apiClientModule_ProvidesFirebaseAppFactory, InstanceFactory instanceFactory, Provider provider, ApiClientModule_ProvidesFirebaseInstallationsFactory apiClientModule_ProvidesFirebaseInstallationsFactory, Provider provider2, Provider provider3, Provider provider4) {
        this.f20233a = apiClientModule_ProvidesFirebaseAppFactory;
        this.f20234b = instanceFactory;
        this.f20235c = provider;
        this.f20236d = apiClientModule_ProvidesFirebaseInstallationsFactory;
        this.f20237e = provider2;
        this.f20238f = provider3;
        this.f20239g = provider4;
    }

    @Override // oy.a
    public final Object get() {
        FirebaseApp firebaseApp = (FirebaseApp) this.f20233a.get();
        TransportFactory transportFactory = (TransportFactory) this.f20234b.f19718a;
        return new MetricsLoggerClient(new c(transportFactory.a(new f(1)), 13), (AnalyticsConnector) this.f20235c.get(), firebaseApp, (FirebaseInstallationsApi) this.f20236d.get(), (Clock) this.f20237e.get(), (DeveloperListenerManager) this.f20238f.get(), (Executor) this.f20239g.get());
    }
}
