package com.google.firebase.inappmessaging.internal;

import com.google.internal.firebase.inappmessaging.v1.sdkserving.FetchEligibleCampaignsResponse;
import java.io.File;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements yw.b, yw.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CampaignCacheClient f20082b;

    public /* synthetic */ c(CampaignCacheClient campaignCacheClient, int i11) {
        this.f20081a = i11;
        this.f20082b = campaignCacheClient;
    }

    @Override // yw.b
    public void accept(Object obj) {
        switch (this.f20081a) {
            case 0:
                this.f20082b.f19964d = (FetchEligibleCampaignsResponse) obj;
                break;
            default:
                this.f20082b.f19964d = null;
                break;
        }
    }

    @Override // yw.d
    public boolean test(Object obj) {
        CampaignCacheClient campaignCacheClient = this.f20082b;
        campaignCacheClient.getClass();
        long jH = ((FetchEligibleCampaignsResponse) obj).H();
        long jA = campaignCacheClient.f19963c.a();
        File file = new File(campaignCacheClient.f19962b.getApplicationContext().getFilesDir(), "fiam_eligible_campaigns_cache_file");
        if (jH != 0) {
            return jA < jH;
        }
        if (file.exists()) {
            return jA < TimeUnit.DAYS.toMillis(1L) + file.lastModified();
        }
        return true;
    }
}
