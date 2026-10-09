package com.google.firebase.inappmessaging.internal.injection.modules;

import com.google.firebase.events.Subscriber;
import com.google.firebase.inappmessaging.dagger.Module;
import com.google.firebase.inappmessaging.internal.ProxyAnalyticsConnector;
import com.google.firebase.inappmessaging.internal.n;
import com.google.firebase.inject.Deferred;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@Module
public class AppMeasurementModule {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProxyAnalyticsConnector f20196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Subscriber f20197b;

    public AppMeasurementModule(Deferred deferred, Subscriber subscriber) {
        ProxyAnalyticsConnector proxyAnalyticsConnector = new ProxyAnalyticsConnector();
        proxyAnalyticsConnector.f20055a = deferred;
        deferred.a(new n(proxyAnalyticsConnector, 3));
        this.f20196a = proxyAnalyticsConnector;
        this.f20197b = subscriber;
    }
}
