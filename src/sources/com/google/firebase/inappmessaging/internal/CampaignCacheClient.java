package com.google.firebase.inappmessaging.internal;

import android.app.Application;
import com.google.firebase.inappmessaging.internal.time.Clock;
import com.google.internal.firebase.inappmessaging.v1.sdkserving.FetchEligibleCampaignsResponse;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class CampaignCacheClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProtoStorageClient f19961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Application f19962b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clock f19963c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public FetchEligibleCampaignsResponse f19964d;

    public CampaignCacheClient(ProtoStorageClient protoStorageClient, Application application, Clock clock) {
        this.f19961a = protoStorageClient;
        this.f19962b = application;
        this.f19963c = clock;
    }
}
