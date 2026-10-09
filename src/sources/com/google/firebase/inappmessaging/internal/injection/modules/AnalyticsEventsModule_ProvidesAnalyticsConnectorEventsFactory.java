package com.google.firebase.inappmessaging.internal.injection.modules;

import com.google.firebase.inappmessaging.dagger.internal.Factory;
import com.google.firebase.inappmessaging.dagger.internal.Preconditions;
import com.google.firebase.inappmessaging.dagger.internal.Provider;
import com.google.firebase.inappmessaging.internal.AnalyticsEventsManager;
import ex.f1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class AnalyticsEventsModule_ProvidesAnalyticsConnectorEventsFactory implements Factory<f1> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AnalyticsEventsModule f20177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Provider f20178b;

    public AnalyticsEventsModule_ProvidesAnalyticsConnectorEventsFactory(AnalyticsEventsModule analyticsEventsModule, Provider provider) {
        this.f20177a = analyticsEventsModule;
        this.f20178b = provider;
    }

    @Override // oy.a
    public final Object get() {
        AnalyticsEventsManager analyticsEventsManager = (AnalyticsEventsManager) this.f20178b.get();
        this.f20177a.getClass();
        f1 f1Var = analyticsEventsManager.f19951b;
        Preconditions.c(f1Var);
        return f1Var;
    }
}
