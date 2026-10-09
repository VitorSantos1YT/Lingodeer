package com.google.firebase.inappmessaging.internal;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.inappmessaging.CampaignAnalytics;
import com.google.firebase.inappmessaging.EventType;
import com.google.firebase.inappmessaging.model.InAppMessage;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class s implements OnSuccessListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MetricsLoggerClient f20259b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InAppMessage f20260c;

    public /* synthetic */ s(MetricsLoggerClient metricsLoggerClient, InAppMessage inAppMessage, int i11) {
        this.f20258a = i11;
        this.f20259b = metricsLoggerClient;
        this.f20260c = inAppMessage;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        String str = (String) obj;
        switch (this.f20258a) {
            case 0:
                MetricsLoggerClient metricsLoggerClient = this.f20259b;
                hh.c cVar = metricsLoggerClient.f20043a;
                EventType eventType = EventType.IMPRESSION_EVENT_TYPE;
                CampaignAnalytics.Builder builderA = metricsLoggerClient.a(this.f20260c, str);
                builderA.n();
                CampaignAnalytics.G((CampaignAnalytics) builderA.f21266b, eventType);
                cVar.i(((CampaignAnalytics) builderA.l()).n());
                break;
            default:
                MetricsLoggerClient metricsLoggerClient2 = this.f20259b;
                hh.c cVar2 = metricsLoggerClient2.f20043a;
                EventType eventType2 = EventType.CLICK_EVENT_TYPE;
                CampaignAnalytics.Builder builderA2 = metricsLoggerClient2.a(this.f20260c, str);
                builderA2.n();
                CampaignAnalytics.G((CampaignAnalytics) builderA2.f21266b, eventType2);
                cVar2.i(((CampaignAnalytics) builderA2.l()).n());
                break;
        }
    }
}
