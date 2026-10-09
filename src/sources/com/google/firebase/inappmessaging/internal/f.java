package com.google.firebase.inappmessaging.internal;

import android.app.Application;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.developers.mobile.targeting.proto.ClientSignalsProto;
import com.google.firebase.FirebaseApp;
import com.google.firebase.inappmessaging.FirebaseInAppMessagingDisplayCallbacks;
import com.google.firebase.inappmessaging.internal.time.Clock;
import com.google.firebase.inappmessaging.model.Action;
import com.google.firebase.inappmessaging.model.InAppMessage;
import com.google.firebase.inappmessaging.model.RateLimit;
import com.google.internal.firebase.inappmessaging.v1.sdkserving.CampaignImpression;
import com.google.internal.firebase.inappmessaging.v1.sdkserving.CampaignImpressionList;
import com.google.internal.firebase.inappmessaging.v1.sdkserving.ClientAppInfo;
import com.google.internal.firebase.inappmessaging.v1.sdkserving.FetchEligibleCampaignsRequest;
import com.google.internal.firebase.inappmessaging.v1.sdkserving.FetchEligibleCampaignsResponse;
import com.google.internal.firebase.inappmessaging.v1.sdkserving.InAppMessagingSdkServingGrpc;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import fr.p3;
import java.util.HashSet;
import java.util.Locale;
import java.util.Objects;
import java.util.TimeZone;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import lw.d1;
import lw.e1;
import r.x2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f implements yw.a, yw.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f20086b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f20087c;

    public /* synthetic */ f(int i11, Object obj, Object obj2) {
        this.f20085a = i11;
        this.f20086b = obj;
        this.f20087c = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:69:0x027b  */
    @Override // yw.c
    public Object apply(Object obj) throws Throwable {
        String str;
        final int i11 = 1;
        final int i12 = 0;
        switch (this.f20085a) {
            case 4:
                final ImpressionStorageClient impressionStorageClient = (ImpressionStorageClient) this.f20086b;
                CampaignImpression campaignImpression = (CampaignImpression) this.f20087c;
                CampaignImpressionList campaignImpressionList = ImpressionStorageClient.f20008c;
                impressionStorageClient.getClass();
                CampaignImpressionList.Builder builderJ = CampaignImpressionList.J((CampaignImpressionList) obj);
                builderJ.n();
                CampaignImpressionList.F((CampaignImpressionList) builderJ.f21266b, campaignImpression);
                final CampaignImpressionList campaignImpressionList2 = (CampaignImpressionList) builderJ.l();
                ProtoStorageClient protoStorageClient = impressionStorageClient.f20009a;
                protoStorageClient.getClass();
                return new dx.d(new t(protoStorageClient, campaignImpressionList2, 0), 1).a(new yw.a() { // from class: com.google.firebase.inappmessaging.internal.j
                    @Override // yw.a
                    public final void run() {
                        int i13 = i12;
                        CampaignImpressionList campaignImpressionList3 = campaignImpressionList2;
                        ImpressionStorageClient impressionStorageClient2 = impressionStorageClient;
                        switch (i13) {
                            case 0:
                                CampaignImpressionList campaignImpressionList4 = ImpressionStorageClient.f20008c;
                                impressionStorageClient2.getClass();
                                impressionStorageClient2.f20010b = uw.h.a(campaignImpressionList3);
                                break;
                            default:
                                CampaignImpressionList campaignImpressionList5 = ImpressionStorageClient.f20008c;
                                impressionStorageClient2.getClass();
                                impressionStorageClient2.f20010b = uw.h.a(campaignImpressionList3);
                                break;
                        }
                    }
                });
            case 5:
                final ImpressionStorageClient impressionStorageClient2 = (ImpressionStorageClient) this.f20086b;
                HashSet hashSet = (HashSet) this.f20087c;
                CampaignImpressionList campaignImpressionList3 = (CampaignImpressionList) obj;
                CampaignImpressionList campaignImpressionList4 = ImpressionStorageClient.f20008c;
                impressionStorageClient2.getClass();
                campaignImpressionList3.toString();
                CampaignImpressionList.Builder builderI = CampaignImpressionList.I();
                for (CampaignImpression campaignImpression2 : campaignImpressionList3.G()) {
                    if (!hashSet.contains(campaignImpression2.H())) {
                        builderI.n();
                        CampaignImpressionList.F((CampaignImpressionList) builderI.f21266b, campaignImpression2);
                    }
                }
                final CampaignImpressionList campaignImpressionList5 = (CampaignImpressionList) builderI.l();
                campaignImpressionList5.toString();
                ProtoStorageClient protoStorageClient2 = impressionStorageClient2.f20009a;
                protoStorageClient2.getClass();
                return new dx.d(new t(protoStorageClient2, campaignImpressionList5, 0), 1).a(new yw.a() { // from class: com.google.firebase.inappmessaging.internal.j
                    @Override // yw.a
                    public final void run() {
                        int i13 = i11;
                        CampaignImpressionList campaignImpressionList6 = campaignImpressionList5;
                        ImpressionStorageClient impressionStorageClient3 = impressionStorageClient2;
                        switch (i13) {
                            case 0:
                                CampaignImpressionList campaignImpressionList7 = ImpressionStorageClient.f20008c;
                                impressionStorageClient3.getClass();
                                impressionStorageClient3.f20010b = uw.h.a(campaignImpressionList6);
                                break;
                            default:
                                CampaignImpressionList campaignImpressionList8 = ImpressionStorageClient.f20008c;
                                impressionStorageClient3.getClass();
                                impressionStorageClient3.f20010b = uw.h.a(campaignImpressionList6);
                                break;
                        }
                    }
                });
            case 6:
                InAppMessageStreamManager inAppMessageStreamManager = (InAppMessageStreamManager) this.f20086b;
                uw.h hVar = (uw.h) this.f20087c;
                CampaignImpressionList campaignImpressionList6 = (CampaignImpressionList) obj;
                if (!inAppMessageStreamManager.f20024n.a()) {
                    FetchEligibleCampaignsResponse.Builder builderJ2 = FetchEligibleCampaignsResponse.J();
                    builderJ2.n();
                    FetchEligibleCampaignsResponse.F((FetchEligibleCampaignsResponse) builderJ2.f21266b, 1L);
                    return uw.h.a((FetchEligibleCampaignsResponse) builderJ2.l());
                }
                k kVar = new k(10);
                hVar.getClass();
                fx.k kVar2 = new fx.k(new fx.g(hVar, kVar, 0), new f(8, inAppMessageStreamManager, campaignImpressionList6), 1);
                FetchEligibleCampaignsResponse.Builder builderJ3 = FetchEligibleCampaignsResponse.J();
                builderJ3.n();
                FetchEligibleCampaignsResponse.F((FetchEligibleCampaignsResponse) builderJ3.f21266b, 1L);
                uw.h hVarD = kVar2.d(uw.h.a((FetchEligibleCampaignsResponse) builderJ3.l()));
                k kVar3 = new k(11);
                p3 p3Var = ax.d.f3263d;
                fx.s sVar = new fx.s(new fx.s(hVarD, kVar3, p3Var), new m(inAppMessageStreamManager, i12), p3Var);
                AnalyticsEventsManager analyticsEventsManager = inAppMessageStreamManager.f20021j;
                Objects.requireNonNull(analyticsEventsManager);
                fx.s sVar2 = new fx.s(sVar, new n(analyticsEventsManager, 0), p3Var);
                TestDeviceHelper testDeviceHelper = inAppMessageStreamManager.f20022k;
                Objects.requireNonNull(testDeviceHelper);
                return new fx.k(new fx.s(new fx.s(sVar2, new n(testDeviceHelper, 1), p3Var), p3Var, new k(12)), new ax.c(fx.e.f28235a, 0), 2);
            case 7:
            default:
                RateLimitProto.RateLimit rateLimit = (RateLimitProto.RateLimit) this.f20086b;
                RateLimit rateLimit2 = (RateLimit) this.f20087c;
                RateLimitProto.Counter counter = (RateLimitProto.Counter) obj;
                RateLimitProto.RateLimit rateLimit3 = RateLimiterClient.f20061d;
                RateLimitProto.Counter.Builder builderM = RateLimitProto.Counter.M(counter);
                builderM.n();
                RateLimitProto.Counter.G((RateLimitProto.Counter) builderM.f21266b);
                long jK = counter.K() + 1;
                builderM.n();
                RateLimitProto.Counter.F((RateLimitProto.Counter) builderM.f21266b, jK);
                RateLimitProto.Counter counter2 = (RateLimitProto.Counter) builderM.l();
                RateLimitProto.RateLimit.Builder builderI2 = RateLimitProto.RateLimit.I(rateLimit);
                String strC = rateLimit2.c();
                strC.getClass();
                builderI2.n();
                RateLimitProto.RateLimit.F((RateLimitProto.RateLimit) builderI2.f21266b).put(strC, counter2);
                return (RateLimitProto.RateLimit) builderI2.l();
            case 8:
                InAppMessageStreamManager inAppMessageStreamManager2 = (InAppMessageStreamManager) this.f20086b;
                CampaignImpressionList campaignImpressionList7 = (CampaignImpressionList) this.f20087c;
                InstallationIdResult installationIdResult = (InstallationIdResult) obj;
                ApiClient apiClient = inAppMessageStreamManager2.f20016e;
                ProviderInstaller providerInstaller = apiClient.f19958e;
                providerInstaller.getClass();
                try {
                    com.google.android.gms.security.ProviderInstaller.a(providerInstaller.f20053a);
                } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException e8) {
                    e8.printStackTrace();
                }
                GrpcClient grpcClient = (GrpcClient) apiClient.f19954a.get();
                FetchEligibleCampaignsRequest.Builder builderK = FetchEligibleCampaignsRequest.K();
                FirebaseApp firebaseApp = apiClient.f19955b;
                firebaseApp.b();
                String str2 = firebaseApp.f17716c.f17735e;
                builderK.n();
                FetchEligibleCampaignsRequest.F((FetchEligibleCampaignsRequest) builderK.f21266b, str2);
                Internal.ProtobufList protobufListG = campaignImpressionList7.G();
                builderK.n();
                FetchEligibleCampaignsRequest.G((FetchEligibleCampaignsRequest) builderK.f21266b, protobufListG);
                ClientSignalsProto.ClientSignals.Builder builderJ4 = ClientSignalsProto.ClientSignals.J();
                String strValueOf = String.valueOf(Build.VERSION.SDK_INT);
                builderJ4.n();
                ClientSignalsProto.ClientSignals.H((ClientSignalsProto.ClientSignals) builderJ4.f21266b, strValueOf);
                String string = Locale.getDefault().toString();
                builderJ4.n();
                ClientSignalsProto.ClientSignals.I((ClientSignalsProto.ClientSignals) builderJ4.f21266b, string);
                String id2 = TimeZone.getDefault().getID();
                builderJ4.n();
                ClientSignalsProto.ClientSignals.G((ClientSignalsProto.ClientSignals) builderJ4.f21266b, id2);
                Application application = apiClient.f19956c;
                try {
                    str = application.getPackageManager().getPackageInfo(application.getPackageName(), 0).versionName;
                } catch (PackageManager.NameNotFoundException e10) {
                    e10.getMessage();
                    str = null;
                }
                if (!TextUtils.isEmpty(str)) {
                    builderJ4.n();
                    ClientSignalsProto.ClientSignals.F((ClientSignalsProto.ClientSignals) builderJ4.f21266b, str);
                }
                ClientSignalsProto.ClientSignals clientSignals = (ClientSignalsProto.ClientSignals) builderJ4.l();
                builderK.n();
                FetchEligibleCampaignsRequest.H((FetchEligibleCampaignsRequest) builderK.f21266b, clientSignals);
                ClientAppInfo.Builder builderI3 = ClientAppInfo.I();
                FirebaseApp firebaseApp2 = apiClient.f19955b;
                firebaseApp2.b();
                String str3 = firebaseApp2.f17716c.f17732b;
                builderI3.n();
                ClientAppInfo.F((ClientAppInfo) builderI3.f21266b, str3);
                String strA = installationIdResult.a();
                builderI3.n();
                ClientAppInfo.G((ClientAppInfo) builderI3.f21266b, strA);
                String strA2 = installationIdResult.b().a();
                builderI3.n();
                ClientAppInfo.H((ClientAppInfo) builderI3.f21266b, strA2);
                ClientAppInfo clientAppInfo = (ClientAppInfo) builderI3.l();
                builderK.n();
                FetchEligibleCampaignsRequest.I((FetchEligibleCampaignsRequest) builderK.f21266b, clientAppInfo);
                FetchEligibleCampaignsRequest fetchEligibleCampaignsRequest = (FetchEligibleCampaignsRequest) builderK.l();
                InAppMessagingSdkServingGrpc.InAppMessagingSdkServingBlockingStub inAppMessagingSdkServingBlockingStub = grpcClient.f20006a;
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                lw.d dVar = (lw.d) inAppMessagingSdkServingBlockingStub.f669a;
                lw.c cVar = (lw.c) inAppMessagingSdkServingBlockingStub.f670b;
                cVar.getClass();
                if (timeUnit == null) {
                    lw.k kVar4 = lw.s.f40453d;
                    throw new NullPointerException("units");
                }
                lw.s sVar3 = new lw.s(timeUnit.toNanos(30000L));
                x2 x2VarB = lw.c.b(cVar);
                x2VarB.f48709a = sVar3;
                InAppMessagingSdkServingGrpc.InAppMessagingSdkServingBlockingStub inAppMessagingSdkServingBlockingStub2 = new InAppMessagingSdkServingGrpc.InAppMessagingSdkServingBlockingStub(dVar, new lw.c(x2VarB));
                lw.d dVar2 = (lw.d) inAppMessagingSdkServingBlockingStub2.f669a;
                e1 e1Var = InAppMessagingSdkServingGrpc.f21130a;
                if (e1Var == null) {
                    synchronized (InAppMessagingSdkServingGrpc.class) {
                        try {
                            e1Var = InAppMessagingSdkServingGrpc.f21130a;
                            if (e1Var == null) {
                                d1 d1Var = d1.UNARY;
                                String strA3 = e1.a("google.internal.firebase.inappmessaging.v1.sdkserving.InAppMessagingSdkServing", "FetchEligibleCampaigns");
                                FetchEligibleCampaignsRequest fetchEligibleCampaignsRequestJ = FetchEligibleCampaignsRequest.J();
                                ExtensionRegistryLite extensionRegistryLite = qw.c.f48461a;
                                e1 e1Var2 = new e1(d1Var, strA3, new qw.b(fetchEligibleCampaignsRequestJ), new qw.b(FetchEligibleCampaignsResponse.G()));
                                InAppMessagingSdkServingGrpc.f21130a = e1Var2;
                                e1Var = e1Var2;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
                lw.c cVar2 = (lw.c) inAppMessagingSdkServingBlockingStub2.f670b;
                Logger logger = rw.f.f50818a;
                rw.d dVar3 = new rw.d();
                x2 x2VarB2 = lw.c.b(cVar2.c(rw.f.f50820c, rw.c.BLOCKING));
                x2VarB2.f48710b = dVar3;
                lw.f fVarF = dVar2.f(e1Var, new lw.c(x2VarB2));
                try {
                    try {
                        rw.b bVarB = rw.f.b(fVarF, fetchEligibleCampaignsRequest);
                        while (!bVarB.isDone()) {
                            try {
                                dVar3.b();
                            } catch (InterruptedException e11) {
                                try {
                                    fVarF.a("Thread interrupted", e11);
                                    i12 = 1;
                                } catch (Error e12) {
                                    e = e12;
                                    rw.f.a(fVarF, e);
                                    throw null;
                                } catch (RuntimeException e13) {
                                    e = e13;
                                    rw.f.a(fVarF, e);
                                    throw null;
                                }
                            }
                        }
                        dVar3.shutdown();
                        Object objC = rw.f.c(bVarB);
                        if (i12 != 0) {
                            Thread.currentThread().interrupt();
                        }
                        FetchEligibleCampaignsResponse fetchEligibleCampaignsResponse = (FetchEligibleCampaignsResponse) objC;
                        long jH = fetchEligibleCampaignsResponse.H();
                        Clock clock = apiClient.f19957d;
                        if (jH >= TimeUnit.MINUTES.toMillis(1L) + clock.a()) {
                            if (fetchEligibleCampaignsResponse.H() <= TimeUnit.DAYS.toMillis(3L) + clock.a()) {
                                return fetchEligibleCampaignsResponse;
                            }
                        }
                        GeneratedMessageLite.Builder builder = (GeneratedMessageLite.Builder) fetchEligibleCampaignsResponse.q(GeneratedMessageLite.MethodToInvoke.NEW_BUILDER, null);
                        builder.p(fetchEligibleCampaignsResponse);
                        FetchEligibleCampaignsResponse.Builder builder2 = (FetchEligibleCampaignsResponse.Builder) builder;
                        long millis = TimeUnit.DAYS.toMillis(1L) + clock.a();
                        builder2.n();
                        FetchEligibleCampaignsResponse.F((FetchEligibleCampaignsResponse) builder2.f21266b, millis);
                        return (FetchEligibleCampaignsResponse) builder2.l();
                    } catch (Throwable th3) {
                        th = th3;
                        if (i11 != 0) {
                            Thread.currentThread().interrupt();
                        }
                        throw th;
                    }
                } catch (Error e14) {
                    e = e14;
                    rw.f.a(fVarF, e);
                    throw null;
                } catch (RuntimeException e15) {
                    e = e15;
                    rw.f.a(fVarF, e);
                    throw null;
                } catch (Throwable th4) {
                    th = th4;
                    i11 = i12;
                    if (i11 != 0) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
                break;
                break;
        }
    }

    @Override // yw.a
    public void run() {
        int i11 = this.f20085a;
        int i12 = 1;
        Object obj = this.f20087c;
        Object obj2 = this.f20086b;
        switch (i11) {
            case 0:
                DisplayCallbacksImpl displayCallbacksImpl = (DisplayCallbacksImpl) obj2;
                FirebaseInAppMessagingDisplayCallbacks.InAppMessagingErrorReason inAppMessagingErrorReason = (FirebaseInAppMessagingDisplayCallbacks.InAppMessagingErrorReason) obj;
                MetricsLoggerClient metricsLoggerClient = displayCallbacksImpl.f19995f;
                InAppMessage inAppMessage = displayCallbacksImpl.f19997h;
                metricsLoggerClient.getClass();
                if (!inAppMessage.f20322b.f20300c) {
                    metricsLoggerClient.f20045c.getId().addOnSuccessListener(metricsLoggerClient.f20049g, new u(metricsLoggerClient, inAppMessage, inAppMessagingErrorReason, i12));
                }
                DeveloperListenerManager developerListenerManager = metricsLoggerClient.f20048f;
                for (DeveloperListenerManager.ErrorsExecutorAndListener errorsExecutorAndListener : developerListenerManager.f19973d.values()) {
                    Executor executor = developerListenerManager.f19970a;
                    errorsExecutorAndListener.getClass();
                    executor.execute(new e(errorsExecutorAndListener, inAppMessage, inAppMessagingErrorReason, 0));
                }
                break;
            case 1:
                DisplayCallbacksImpl displayCallbacksImpl2 = (DisplayCallbacksImpl) obj2;
                FirebaseInAppMessagingDisplayCallbacks.InAppMessagingDismissType inAppMessagingDismissType = (FirebaseInAppMessagingDisplayCallbacks.InAppMessagingDismissType) obj;
                MetricsLoggerClient metricsLoggerClient2 = displayCallbacksImpl2.f19995f;
                InAppMessage inAppMessage2 = displayCallbacksImpl2.f19997h;
                metricsLoggerClient2.getClass();
                int i13 = 2;
                if (!inAppMessage2.f20322b.f20300c) {
                    metricsLoggerClient2.f20045c.getId().addOnSuccessListener(metricsLoggerClient2.f20049g, new u(metricsLoggerClient2, inAppMessage2, inAppMessagingDismissType, i13));
                    metricsLoggerClient2.c(inAppMessage2, "fiam_dismiss", false);
                }
                DeveloperListenerManager developerListenerManager2 = metricsLoggerClient2.f20048f;
                for (DeveloperListenerManager.DismissExecutorAndListener dismissExecutorAndListener : developerListenerManager2.f19972c.values()) {
                    Executor executor2 = developerListenerManager2.f19970a;
                    dismissExecutorAndListener.getClass();
                    executor2.execute(new e(dismissExecutorAndListener, inAppMessage2, 2));
                }
                break;
            case 2:
                DisplayCallbacksImpl displayCallbacksImpl3 = (DisplayCallbacksImpl) obj2;
                Action action = (Action) obj;
                MetricsLoggerClient metricsLoggerClient3 = displayCallbacksImpl3.f19995f;
                InAppMessage inAppMessage3 = displayCallbacksImpl3.f19997h;
                metricsLoggerClient3.getClass();
                if (!inAppMessage3.f20322b.f20300c) {
                    metricsLoggerClient3.f20045c.getId().addOnSuccessListener(metricsLoggerClient3.f20049g, new s(metricsLoggerClient3, inAppMessage3, 1));
                    metricsLoggerClient3.c(inAppMessage3, "fiam_action", true);
                }
                DeveloperListenerManager developerListenerManager3 = metricsLoggerClient3.f20048f;
                for (DeveloperListenerManager.ClicksExecutorAndListener clicksExecutorAndListener : developerListenerManager3.f19971b.values()) {
                    Executor executor3 = developerListenerManager3.f19970a;
                    clicksExecutorAndListener.getClass();
                    executor3.execute(new e(clicksExecutorAndListener, inAppMessage3, action, 1));
                }
                break;
            case 3:
                ((CampaignCacheClient) obj2).f19964d = (FetchEligibleCampaignsResponse) obj;
                break;
            default:
                RateLimiterClient rateLimiterClient = (RateLimiterClient) obj2;
                RateLimitProto.RateLimit rateLimit = RateLimiterClient.f20061d;
                rateLimiterClient.getClass();
                rateLimiterClient.f20064c = uw.h.a((RateLimitProto.RateLimit) obj);
                break;
        }
    }
}
