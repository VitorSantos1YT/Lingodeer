package com.google.firebase.inappmessaging.internal;

import com.google.firebase.abt.AbtException;
import com.google.firebase.abt.AbtExperimentInfo;
import com.google.firebase.abt.FirebaseABTesting;
import com.google.firebase.inappmessaging.ExperimentPayloadProto;
import com.google.firebase.inappmessaging.model.InAppMessage;
import com.google.firebase.inappmessaging.model.MessageType;
import com.google.firebase.inappmessaging.model.ProtoMarshallerClient;
import com.google.firebase.inappmessaging.model.RateLimit;
import com.google.firebase.inappmessaging.model.TriggeredInAppMessage;
import com.google.internal.firebase.inappmessaging.v1.CampaignProto;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class p implements yw.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InAppMessageStreamManager f20250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f20251c;

    public /* synthetic */ p(InAppMessageStreamManager inAppMessageStreamManager, String str, int i11) {
        this.f20249a = i11;
        this.f20250b = inAppMessageStreamManager;
        this.f20251c = str;
    }

    @Override // yw.c
    public final Object apply(Object obj) {
        String strG;
        String strH;
        CampaignProto.ThickContent thickContent = (CampaignProto.ThickContent) obj;
        switch (this.f20249a) {
            case 0:
                InAppMessageStreamManager inAppMessageStreamManager = this.f20250b;
                inAppMessageStreamManager.getClass();
                boolean zEquals = thickContent.J().equals(CampaignProto.ThickContent.PayloadCase.VANILLA_PAYLOAD);
                fx.e eVar = fx.e.f28235a;
                if (zEquals) {
                    strG = thickContent.M().G();
                    strH = thickContent.M().H();
                } else {
                    if (!thickContent.J().equals(CampaignProto.ThickContent.PayloadCase.EXPERIMENTAL_PAYLOAD)) {
                        return eVar;
                    }
                    String strG2 = thickContent.H().G();
                    String strH2 = thickContent.H().H();
                    if (!thickContent.I()) {
                        final AbtIntegrationHelper abtIntegrationHelper = inAppMessageStreamManager.f20023l;
                        final ExperimentPayloadProto.ExperimentPayload experimentPayloadK = thickContent.H().K();
                        abtIntegrationHelper.f19949b.execute(new Runnable() { // from class: com.google.firebase.inappmessaging.internal.a
                            @Override // java.lang.Runnable
                            public final void run() {
                                ExperimentPayloadProto.ExperimentPayload experimentPayload = experimentPayloadK;
                                AbtIntegrationHelper abtIntegrationHelper2 = abtIntegrationHelper;
                                abtIntegrationHelper2.getClass();
                                try {
                                    experimentPayload.toString();
                                    FirebaseABTesting firebaseABTesting = abtIntegrationHelper2.f19948a;
                                    AbtExperimentInfo abtExperimentInfo = new AbtExperimentInfo(experimentPayload.G(), experimentPayload.L(), experimentPayload.J(), new Date(experimentPayload.H()), experimentPayload.K(), experimentPayload.I());
                                    firebaseABTesting.d();
                                    AbtExperimentInfo.d(abtExperimentInfo.c());
                                    ArrayList arrayList = new ArrayList();
                                    HashMap mapC = abtExperimentInfo.c();
                                    mapC.remove("triggerEvent");
                                    arrayList.add(AbtExperimentInfo.a(mapC));
                                    firebaseABTesting.a(arrayList);
                                } catch (AbtException e8) {
                                    e8.getMessage();
                                }
                            }
                        });
                    }
                    strG = strG2;
                    strH = strH2;
                }
                InAppMessage inAppMessageC = ProtoMarshallerClient.c(thickContent.F(), strG, strH, thickContent.I(), thickContent.G());
                if (inAppMessageC.f20321a.equals(MessageType.UNSUPPORTED)) {
                    return eVar;
                }
                TriggeredInAppMessage triggeredInAppMessage = new TriggeredInAppMessage();
                triggeredInAppMessage.f20340a = inAppMessageC;
                triggeredInAppMessage.f20341b = this.f20251c;
                return uw.h.a(triggeredInAppMessage);
            default:
                InAppMessageStreamManager inAppMessageStreamManager2 = this.f20250b;
                inAppMessageStreamManager2.getClass();
                if (thickContent.I() || !this.f20251c.equals("ON_FOREGROUND")) {
                    return uw.h.a(thickContent);
                }
                RateLimiterClient rateLimiterClient = inAppMessageStreamManager2.f20019h;
                RateLimit rateLimit = inAppMessageStreamManager2.f20020i;
                return new fx.k(new fx.h(0, new hx.b(2, new hx.b(1, new fx.o(new fx.g(new fx.k(rateLimiterClient.a().d(uw.h.a(RateLimitProto.RateLimit.G())), new v(rateLimiterClient, rateLimit, 2), 1), new v(rateLimiterClient, rateLimit, 3), 0)), new k(8)), new ax.c(new ix.b(), 0)), new k(9)), new l(thickContent), 1);
        }
    }
}
