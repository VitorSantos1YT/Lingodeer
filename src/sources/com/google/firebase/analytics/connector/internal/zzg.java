package com.google.firebase.analytics.connector.internal;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzg implements zza {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AnalyticsConnector.AnalyticsConnectorListener f17795a;

    public zzg(AppMeasurementSdk appMeasurementSdk, AnalyticsConnector.AnalyticsConnectorListener analyticsConnectorListener) {
        this.f17795a = analyticsConnectorListener;
        appMeasurementSdk.f12596a.k(new zzf(this));
    }

    @Override // com.google.firebase.analytics.connector.internal.zza
    public final void a(Set set) {
    }
}
