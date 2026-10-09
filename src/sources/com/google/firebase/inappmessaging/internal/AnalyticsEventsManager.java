package com.google.firebase.inappmessaging.internal;

import com.google.firebase.analytics.connector.AnalyticsConnector;
import ex.f1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class AnalyticsEventsManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AnalyticsConnector f19950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f1 f19951b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AnalyticsConnector.AnalyticsConnectorHandle f19952c;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public class AnalyticsFlowableSubscriber implements uw.f {
        public AnalyticsFlowableSubscriber() {
        }

        @Override // uw.f
        public final void g(ex.k kVar) {
            AnalyticsEventsManager analyticsEventsManager = AnalyticsEventsManager.this;
            AnalyticsConnector analyticsConnector = analyticsEventsManager.f19950a;
            FiamAnalyticsConnectorListener fiamAnalyticsConnectorListener = new FiamAnalyticsConnectorListener();
            fiamAnalyticsConnectorListener.f20000a = kVar;
            analyticsEventsManager.f19952c = analyticsConnector.h("fiam", fiamAnalyticsConnectorListener);
        }
    }

    public AnalyticsEventsManager(AnalyticsConnector analyticsConnector) {
        this.f19950a = analyticsConnector;
        AnalyticsFlowableSubscriber analyticsFlowableSubscriber = new AnalyticsFlowableSubscriber();
        uw.a aVar = uw.a.BUFFER;
        int i11 = uw.d.f53244a;
        ax.d.a(aVar, "mode is null");
        f1 f1VarC = new ex.r(0, analyticsFlowableSubscriber, aVar).c();
        this.f19951b = f1VarC;
        f1VarC.f();
    }
}
