package com.google.firebase.crashlytics;

import com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger;
import com.google.firebase.crashlytics.internal.analytics.UnavailableAnalyticsEventLogger;
import com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbSource;
import com.google.firebase.crashlytics.internal.breadcrumbs.DisabledBreadcrumbSource;
import com.google.firebase.inject.Deferred;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class AnalyticsDeferredProxy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Deferred f18203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile AnalyticsEventLogger f18204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile BreadcrumbSource f18205c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f18206d;

    public AnalyticsDeferredProxy(Deferred deferred) {
        DisabledBreadcrumbSource disabledBreadcrumbSource = new DisabledBreadcrumbSource();
        UnavailableAnalyticsEventLogger unavailableAnalyticsEventLogger = new UnavailableAnalyticsEventLogger();
        this.f18203a = deferred;
        this.f18205c = disabledBreadcrumbSource;
        this.f18206d = new ArrayList();
        this.f18204b = unavailableAnalyticsEventLogger;
        deferred.a(new a(this));
    }
}
