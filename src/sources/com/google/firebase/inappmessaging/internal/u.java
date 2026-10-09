package com.google.firebase.inappmessaging.internal;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.inappmessaging.CampaignAnalytics;
import com.google.firebase.inappmessaging.DismissType;
import com.google.firebase.inappmessaging.FirebaseInAppMessagingDisplayCallbacks;
import com.google.firebase.inappmessaging.RenderErrorReason;
import com.google.firebase.inappmessaging.model.InAppMessage;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class u implements Deferred.DeferredHandler, OnSuccessListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f20265b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f20266c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f20267d;

    public /* synthetic */ u(Object obj, Object obj2, Object obj3, int i11) {
        this.f20264a = i11;
        this.f20265b = obj;
        this.f20266c = obj2;
        this.f20267d = obj3;
    }

    @Override // com.google.firebase.inject.Deferred.DeferredHandler
    public void h(Provider provider) {
        ProxyAnalyticsConnector.ProxyAnalyticsConnectorHandle proxyAnalyticsConnectorHandle = (ProxyAnalyticsConnector.ProxyAnalyticsConnectorHandle) this.f20265b;
        String str = (String) this.f20266c;
        AnalyticsConnector.AnalyticsConnectorListener analyticsConnectorListener = (AnalyticsConnector.AnalyticsConnectorListener) this.f20267d;
        if (proxyAnalyticsConnectorHandle.f20058b == ProxyAnalyticsConnector.ProxyAnalyticsConnectorHandle.f20056c) {
            return;
        }
        AnalyticsConnector.AnalyticsConnectorHandle analyticsConnectorHandleH = ((AnalyticsConnector) provider.get()).h(str, analyticsConnectorListener);
        proxyAnalyticsConnectorHandle.f20058b = analyticsConnectorHandleH;
        synchronized (proxyAnalyticsConnectorHandle) {
            try {
                if (!proxyAnalyticsConnectorHandle.f20057a.isEmpty()) {
                    analyticsConnectorHandleH.a(proxyAnalyticsConnectorHandle.f20057a);
                    proxyAnalyticsConnectorHandle.f20057a = new HashSet();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        switch (this.f20264a) {
            case 1:
                MetricsLoggerClient metricsLoggerClient = (MetricsLoggerClient) this.f20265b;
                InAppMessage inAppMessage = (InAppMessage) this.f20266c;
                FirebaseInAppMessagingDisplayCallbacks.InAppMessagingErrorReason inAppMessagingErrorReason = (FirebaseInAppMessagingDisplayCallbacks.InAppMessagingErrorReason) this.f20267d;
                hh.c cVar = metricsLoggerClient.f20043a;
                RenderErrorReason renderErrorReason = (RenderErrorReason) MetricsLoggerClient.f20041h.get(inAppMessagingErrorReason);
                CampaignAnalytics.Builder builderA = metricsLoggerClient.a(inAppMessage, (String) obj);
                builderA.n();
                CampaignAnalytics.I((CampaignAnalytics) builderA.f21266b, renderErrorReason);
                cVar.i(((CampaignAnalytics) builderA.l()).n());
                break;
            default:
                MetricsLoggerClient metricsLoggerClient2 = (MetricsLoggerClient) this.f20265b;
                InAppMessage inAppMessage2 = (InAppMessage) this.f20266c;
                FirebaseInAppMessagingDisplayCallbacks.InAppMessagingDismissType inAppMessagingDismissType = (FirebaseInAppMessagingDisplayCallbacks.InAppMessagingDismissType) this.f20267d;
                hh.c cVar2 = metricsLoggerClient2.f20043a;
                DismissType dismissType = (DismissType) MetricsLoggerClient.f20042i.get(inAppMessagingDismissType);
                CampaignAnalytics.Builder builderA2 = metricsLoggerClient2.a(inAppMessage2, (String) obj);
                builderA2.n();
                CampaignAnalytics.H((CampaignAnalytics) builderA2.f21266b, dismissType);
                cVar2.i(((CampaignAnalytics) builderA2.l()).n());
                break;
        }
    }
}
