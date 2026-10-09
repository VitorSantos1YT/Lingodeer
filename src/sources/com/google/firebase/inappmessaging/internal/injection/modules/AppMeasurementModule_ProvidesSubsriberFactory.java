package com.google.firebase.inappmessaging.internal.injection.modules;

import com.google.firebase.events.Subscriber;
import com.google.firebase.inappmessaging.dagger.internal.Factory;
import com.google.firebase.inappmessaging.dagger.internal.Preconditions;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class AppMeasurementModule_ProvidesSubsriberFactory implements Factory<Subscriber> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AppMeasurementModule f20199a;

    public AppMeasurementModule_ProvidesSubsriberFactory(AppMeasurementModule appMeasurementModule) {
        this.f20199a = appMeasurementModule;
    }

    @Override // oy.a
    public final Object get() {
        Subscriber subscriber = this.f20199a.f20197b;
        Preconditions.c(subscriber);
        return subscriber;
    }
}
