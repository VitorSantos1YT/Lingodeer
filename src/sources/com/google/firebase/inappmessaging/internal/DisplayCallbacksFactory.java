package com.google.firebase.inappmessaging.internal;

import com.google.firebase.inappmessaging.internal.time.Clock;
import com.google.firebase.inappmessaging.model.RateLimit;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class DisplayCallbacksFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImpressionStorageClient f19975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clock f19976b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Schedulers f19977c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RateLimiterClient f19978d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final RateLimit f19979e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final MetricsLoggerClient f19980f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final DataCollectionHelper f19981g;

    public DisplayCallbacksFactory(ImpressionStorageClient impressionStorageClient, Clock clock, Schedulers schedulers, RateLimiterClient rateLimiterClient, CampaignCacheClient campaignCacheClient, RateLimit rateLimit, MetricsLoggerClient metricsLoggerClient, DataCollectionHelper dataCollectionHelper) {
        this.f19975a = impressionStorageClient;
        this.f19976b = clock;
        this.f19977c = schedulers;
        this.f19978d = rateLimiterClient;
        this.f19979e = rateLimit;
        this.f19980f = metricsLoggerClient;
        this.f19981g = dataCollectionHelper;
    }
}
