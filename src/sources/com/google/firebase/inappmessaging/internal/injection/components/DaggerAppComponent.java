package com.google.firebase.inappmessaging.internal.injection.components;

import android.app.Application;
import com.google.android.datatransport.TransportFactory;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.events.Subscriber;
import com.google.firebase.inappmessaging.FirebaseInAppMessaging;
import com.google.firebase.inappmessaging.FirebaseInAppMessaging_Factory;
import com.google.firebase.inappmessaging.dagger.internal.DoubleCheck;
import com.google.firebase.inappmessaging.dagger.internal.InstanceFactory;
import com.google.firebase.inappmessaging.dagger.internal.Preconditions;
import com.google.firebase.inappmessaging.dagger.internal.Provider;
import com.google.firebase.inappmessaging.internal.AbtIntegrationHelper;
import com.google.firebase.inappmessaging.internal.AnalyticsEventsManager;
import com.google.firebase.inappmessaging.internal.CampaignCacheClient;
import com.google.firebase.inappmessaging.internal.DeveloperListenerManager;
import com.google.firebase.inappmessaging.internal.DisplayCallbacksFactory_Factory;
import com.google.firebase.inappmessaging.internal.GrpcClient_Factory;
import com.google.firebase.inappmessaging.internal.ImpressionStorageClient;
import com.google.firebase.inappmessaging.internal.InAppMessageStreamManager_Factory;
import com.google.firebase.inappmessaging.internal.ProgramaticContextualTriggers;
import com.google.firebase.inappmessaging.internal.ProviderInstaller;
import com.google.firebase.inappmessaging.internal.RateLimiterClient;
import com.google.firebase.inappmessaging.internal.Schedulers;
import com.google.firebase.inappmessaging.internal.injection.modules.ApiClientModule;
import com.google.firebase.inappmessaging.internal.injection.modules.ApiClientModule_ProvidesApiClientFactory;
import com.google.firebase.inappmessaging.internal.injection.modules.ApiClientModule_ProvidesDataCollectionHelperFactory;
import com.google.firebase.inappmessaging.internal.injection.modules.ApiClientModule_ProvidesFirebaseAppFactory;
import com.google.firebase.inappmessaging.internal.injection.modules.ApiClientModule_ProvidesFirebaseInstallationsFactory;
import com.google.firebase.inappmessaging.internal.injection.modules.ApiClientModule_ProvidesSharedPreferencesUtilsFactory;
import com.google.firebase.inappmessaging.internal.injection.modules.ApiClientModule_ProvidesTestDeviceHelperFactory;
import com.google.firebase.inappmessaging.internal.injection.modules.GrpcClientModule;
import com.google.firebase.inappmessaging.internal.injection.modules.GrpcClientModule_ProvidesApiKeyHeadersFactory;
import com.google.firebase.inappmessaging.internal.injection.modules.GrpcClientModule_ProvidesInAppMessagingSdkServingStubFactory;
import com.google.firebase.inappmessaging.internal.injection.modules.TransportClientModule_ProvidesMetricsLoggerClientFactory;
import com.google.firebase.inappmessaging.internal.time.Clock;
import com.google.firebase.inappmessaging.model.RateLimit;
import ex.f1;
import java.util.concurrent.Executor;
import lw.d;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class DaggerAppComponent {

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class AppComponentImpl implements AppComponent {
        public final Provider A;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UniversalComponent f20093a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Provider f20094b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Provider f20095c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Provider f20096d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Provider f20097e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final Provider f20098f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Provider f20099g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Provider f20100h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final Provider f20101i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final Provider f20102j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final Provider f20103k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final Provider f20104l;
        public final Provider m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final Provider f20105n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final Provider f20106o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final Provider f20107p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final ApiClientModule_ProvidesFirebaseInstallationsFactory f20108q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final Provider f20109r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final ApiClientModule_ProvidesDataCollectionHelperFactory f20110s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final Provider f20111t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final Provider f20112u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final Provider f20113v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final Provider f20114w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final Provider f20115x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final Provider f20116y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final Provider f20117z;

        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        public static final class AnalyticsConnectorProvider implements Provider<AnalyticsConnector> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final UniversalComponent f20118a;

            public AnalyticsConnectorProvider(UniversalComponent universalComponent) {
                this.f20118a = universalComponent;
            }

            @Override // oy.a
            public final Object get() {
                AnalyticsConnector analyticsConnectorR = this.f20118a.r();
                Preconditions.b(analyticsConnectorR);
                return analyticsConnectorR;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        public static final class AnalyticsEventsManagerProvider implements Provider<AnalyticsEventsManager> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final UniversalComponent f20119a;

            public AnalyticsEventsManagerProvider(UniversalComponent universalComponent) {
                this.f20119a = universalComponent;
            }

            @Override // oy.a
            public final Object get() {
                AnalyticsEventsManager analyticsEventsManagerE = this.f20119a.e();
                Preconditions.b(analyticsEventsManagerE);
                return analyticsEventsManagerE;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        public static final class AppForegroundEventFlowableProvider implements Provider<f1> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final UniversalComponent f20120a;

            public AppForegroundEventFlowableProvider(UniversalComponent universalComponent) {
                this.f20120a = universalComponent;
            }

            @Override // oy.a
            public final Object get() {
                f1 f1VarN = this.f20120a.n();
                Preconditions.b(f1VarN);
                return f1VarN;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        public static final class AppForegroundRateLimitProvider implements Provider<RateLimit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final UniversalComponent f20121a;

            public AppForegroundRateLimitProvider(UniversalComponent universalComponent) {
                this.f20121a = universalComponent;
            }

            @Override // oy.a
            public final Object get() {
                return this.f20121a.d();
            }
        }

        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        public static final class ApplicationProvider implements Provider<Application> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final UniversalComponent f20122a;

            public ApplicationProvider(UniversalComponent universalComponent) {
                this.f20122a = universalComponent;
            }

            @Override // oy.a
            public final Object get() {
                Application applicationA = this.f20122a.a();
                Preconditions.b(applicationA);
                return applicationA;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        public static final class BlockingExecutorProvider implements Provider<Executor> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final UniversalComponent f20123a;

            public BlockingExecutorProvider(UniversalComponent universalComponent) {
                this.f20123a = universalComponent;
            }

            @Override // oy.a
            public final Object get() {
                Executor executorC = this.f20123a.c();
                Preconditions.b(executorC);
                return executorC;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        public static final class CampaignCacheClientProvider implements Provider<CampaignCacheClient> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final UniversalComponent f20124a;

            public CampaignCacheClientProvider(UniversalComponent universalComponent) {
                this.f20124a = universalComponent;
            }

            @Override // oy.a
            public final Object get() {
                CampaignCacheClient campaignCacheClientJ = this.f20124a.j();
                Preconditions.b(campaignCacheClientJ);
                return campaignCacheClientJ;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        public static final class ClockProvider implements Provider<Clock> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final UniversalComponent f20125a;

            public ClockProvider(UniversalComponent universalComponent) {
                this.f20125a = universalComponent;
            }

            @Override // oy.a
            public final Object get() {
                return this.f20125a.o();
            }
        }

        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        public static final class DeveloperListenerManagerProvider implements Provider<DeveloperListenerManager> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final UniversalComponent f20126a;

            public DeveloperListenerManagerProvider(UniversalComponent universalComponent) {
                this.f20126a = universalComponent;
            }

            @Override // oy.a
            public final Object get() {
                DeveloperListenerManager developerListenerManagerG = this.f20126a.g();
                Preconditions.b(developerListenerManagerG);
                return developerListenerManagerG;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        public static final class FirebaseEventsSubscriberProvider implements Provider<Subscriber> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final UniversalComponent f20127a;

            public FirebaseEventsSubscriberProvider(UniversalComponent universalComponent) {
                this.f20127a = universalComponent;
            }

            @Override // oy.a
            public final Object get() {
                Subscriber subscriberF = this.f20127a.f();
                Preconditions.b(subscriberF);
                return subscriberF;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        public static final class GRPCChannelProvider implements Provider<d> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final UniversalComponent f20128a;

            public GRPCChannelProvider(UniversalComponent universalComponent) {
                this.f20128a = universalComponent;
            }

            @Override // oy.a
            public final Object get() {
                d dVarQ = this.f20128a.q();
                Preconditions.b(dVarQ);
                return dVarQ;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        public static final class ImpressionStorageClientProvider implements Provider<ImpressionStorageClient> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final UniversalComponent f20129a;

            public ImpressionStorageClientProvider(UniversalComponent universalComponent) {
                this.f20129a = universalComponent;
            }

            @Override // oy.a
            public final Object get() {
                ImpressionStorageClient impressionStorageClientH = this.f20129a.h();
                Preconditions.b(impressionStorageClientH);
                return impressionStorageClientH;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        public static final class LightWeightExecutorProvider implements Provider<Executor> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final UniversalComponent f20130a;

            public LightWeightExecutorProvider(UniversalComponent universalComponent) {
                this.f20130a = universalComponent;
            }

            @Override // oy.a
            public final Object get() {
                Executor executorK = this.f20130a.k();
                Preconditions.b(executorK);
                return executorK;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        public static final class ProgrammaticContextualTriggerFlowableProvider implements Provider<f1> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final UniversalComponent f20131a;

            public ProgrammaticContextualTriggerFlowableProvider(UniversalComponent universalComponent) {
                this.f20131a = universalComponent;
            }

            @Override // oy.a
            public final Object get() {
                f1 f1VarP = this.f20131a.p();
                Preconditions.b(f1VarP);
                return f1VarP;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        public static final class ProgrammaticContextualTriggersProvider implements Provider<ProgramaticContextualTriggers> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final UniversalComponent f20132a;

            public ProgrammaticContextualTriggersProvider(UniversalComponent universalComponent) {
                this.f20132a = universalComponent;
            }

            @Override // oy.a
            public final Object get() {
                ProgramaticContextualTriggers programaticContextualTriggersB = this.f20132a.b();
                Preconditions.b(programaticContextualTriggersB);
                return programaticContextualTriggersB;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        public static final class ProviderInstallerProvider implements Provider<ProviderInstaller> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final UniversalComponent f20133a;

            public ProviderInstallerProvider(UniversalComponent universalComponent) {
                this.f20133a = universalComponent;
            }

            @Override // oy.a
            public final Object get() {
                ProviderInstaller providerInstallerL = this.f20133a.l();
                Preconditions.b(providerInstallerL);
                return providerInstallerL;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        public static final class RateLimiterClientProvider implements Provider<RateLimiterClient> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final UniversalComponent f20134a;

            public RateLimiterClientProvider(UniversalComponent universalComponent) {
                this.f20134a = universalComponent;
            }

            @Override // oy.a
            public final Object get() {
                RateLimiterClient rateLimiterClientM = this.f20134a.m();
                Preconditions.b(rateLimiterClientM);
                return rateLimiterClientM;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        public static final class SchedulersProvider implements Provider<Schedulers> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final UniversalComponent f20135a;

            public SchedulersProvider(UniversalComponent universalComponent) {
                this.f20135a = universalComponent;
            }

            @Override // oy.a
            public final Object get() {
                Schedulers schedulersI = this.f20135a.i();
                Preconditions.b(schedulersI);
                return schedulersI;
            }
        }

        public AppComponentImpl(ApiClientModule apiClientModule, GrpcClientModule grpcClientModule, UniversalComponent universalComponent, AbtIntegrationHelper abtIntegrationHelper, TransportFactory transportFactory) {
            this.f20093a = universalComponent;
            this.f20094b = new AppForegroundEventFlowableProvider(universalComponent);
            this.f20095c = new ProgrammaticContextualTriggerFlowableProvider(universalComponent);
            this.f20096d = new CampaignCacheClientProvider(universalComponent);
            this.f20097e = new ClockProvider(universalComponent);
            GRPCChannelProvider gRPCChannelProvider = new GRPCChannelProvider(universalComponent);
            this.f20098f = gRPCChannelProvider;
            Provider providerA = DoubleCheck.a(new GrpcClientModule_ProvidesInAppMessagingSdkServingStubFactory(grpcClientModule, gRPCChannelProvider, new GrpcClientModule_ProvidesApiKeyHeadersFactory(grpcClientModule)));
            this.f20099g = providerA;
            Provider providerA2 = DoubleCheck.a(new GrpcClient_Factory(providerA));
            this.f20100h = providerA2;
            ApplicationProvider applicationProvider = new ApplicationProvider(universalComponent);
            this.f20101i = applicationProvider;
            ProviderInstallerProvider providerInstallerProvider = new ProviderInstallerProvider(universalComponent);
            this.f20102j = providerInstallerProvider;
            Provider providerA3 = DoubleCheck.a(new ApiClientModule_ProvidesApiClientFactory(apiClientModule, providerA2, applicationProvider, providerInstallerProvider));
            this.f20103k = providerA3;
            AnalyticsEventsManagerProvider analyticsEventsManagerProvider = new AnalyticsEventsManagerProvider(universalComponent);
            this.f20104l = analyticsEventsManagerProvider;
            SchedulersProvider schedulersProvider = new SchedulersProvider(universalComponent);
            this.m = schedulersProvider;
            ImpressionStorageClientProvider impressionStorageClientProvider = new ImpressionStorageClientProvider(universalComponent);
            this.f20105n = impressionStorageClientProvider;
            RateLimiterClientProvider rateLimiterClientProvider = new RateLimiterClientProvider(universalComponent);
            this.f20106o = rateLimiterClientProvider;
            AppForegroundRateLimitProvider appForegroundRateLimitProvider = new AppForegroundRateLimitProvider(universalComponent);
            this.f20107p = appForegroundRateLimitProvider;
            ApiClientModule_ProvidesSharedPreferencesUtilsFactory apiClientModule_ProvidesSharedPreferencesUtilsFactory = new ApiClientModule_ProvidesSharedPreferencesUtilsFactory(apiClientModule);
            ApiClientModule_ProvidesTestDeviceHelperFactory apiClientModule_ProvidesTestDeviceHelperFactory = new ApiClientModule_ProvidesTestDeviceHelperFactory(apiClientModule, apiClientModule_ProvidesSharedPreferencesUtilsFactory);
            ApiClientModule_ProvidesFirebaseInstallationsFactory apiClientModule_ProvidesFirebaseInstallationsFactory = new ApiClientModule_ProvidesFirebaseInstallationsFactory(apiClientModule);
            this.f20108q = apiClientModule_ProvidesFirebaseInstallationsFactory;
            FirebaseEventsSubscriberProvider firebaseEventsSubscriberProvider = new FirebaseEventsSubscriberProvider(universalComponent);
            this.f20109r = firebaseEventsSubscriberProvider;
            ApiClientModule_ProvidesDataCollectionHelperFactory apiClientModule_ProvidesDataCollectionHelperFactory = new ApiClientModule_ProvidesDataCollectionHelperFactory(apiClientModule, apiClientModule_ProvidesSharedPreferencesUtilsFactory, firebaseEventsSubscriberProvider);
            this.f20110s = apiClientModule_ProvidesDataCollectionHelperFactory;
            if (abtIntegrationHelper == null) {
                throw new NullPointerException("instance cannot be null");
            }
            InstanceFactory instanceFactory = new InstanceFactory(abtIntegrationHelper);
            BlockingExecutorProvider blockingExecutorProvider = new BlockingExecutorProvider(universalComponent);
            this.f20111t = blockingExecutorProvider;
            this.f20112u = DoubleCheck.a(new InAppMessageStreamManager_Factory(this.f20094b, this.f20095c, this.f20096d, this.f20097e, providerA3, analyticsEventsManagerProvider, schedulersProvider, impressionStorageClientProvider, rateLimiterClientProvider, appForegroundRateLimitProvider, apiClientModule_ProvidesTestDeviceHelperFactory, apiClientModule_ProvidesFirebaseInstallationsFactory, apiClientModule_ProvidesDataCollectionHelperFactory, instanceFactory, blockingExecutorProvider));
            this.f20113v = new ProgrammaticContextualTriggersProvider(universalComponent);
            ApiClientModule_ProvidesFirebaseAppFactory apiClientModule_ProvidesFirebaseAppFactory = new ApiClientModule_ProvidesFirebaseAppFactory(apiClientModule);
            if (transportFactory == null) {
                throw new NullPointerException("instance cannot be null");
            }
            InstanceFactory instanceFactory2 = new InstanceFactory(transportFactory);
            AnalyticsConnectorProvider analyticsConnectorProvider = new AnalyticsConnectorProvider(universalComponent);
            this.f20114w = analyticsConnectorProvider;
            DeveloperListenerManagerProvider developerListenerManagerProvider = new DeveloperListenerManagerProvider(universalComponent);
            this.f20115x = developerListenerManagerProvider;
            Provider providerA4 = DoubleCheck.a(new TransportClientModule_ProvidesMetricsLoggerClientFactory(apiClientModule_ProvidesFirebaseAppFactory, instanceFactory2, analyticsConnectorProvider, this.f20108q, this.f20097e, developerListenerManagerProvider, this.f20111t));
            this.f20116y = providerA4;
            Provider provider = this.f20105n;
            Provider provider2 = this.f20097e;
            Provider provider3 = this.m;
            Provider provider4 = this.f20106o;
            Provider provider5 = this.f20096d;
            Provider provider6 = this.f20107p;
            ApiClientModule_ProvidesDataCollectionHelperFactory apiClientModule_ProvidesDataCollectionHelperFactory2 = this.f20110s;
            DisplayCallbacksFactory_Factory displayCallbacksFactory_Factory = new DisplayCallbacksFactory_Factory(provider, provider2, provider3, provider4, provider5, provider6, providerA4, apiClientModule_ProvidesDataCollectionHelperFactory2);
            LightWeightExecutorProvider lightWeightExecutorProvider = new LightWeightExecutorProvider(universalComponent);
            this.f20117z = lightWeightExecutorProvider;
            this.A = DoubleCheck.a(new FirebaseInAppMessaging_Factory(this.f20112u, this.f20113v, apiClientModule_ProvidesDataCollectionHelperFactory2, this.f20108q, displayCallbacksFactory_Factory, this.f20115x, lightWeightExecutorProvider));
        }

        @Override // com.google.firebase.inappmessaging.internal.injection.components.AppComponent
        public final FirebaseInAppMessaging a() {
            return (FirebaseInAppMessaging) this.A.get();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Builder implements AppComponent.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public AbtIntegrationHelper f20136a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ApiClientModule f20137b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public GrpcClientModule f20138c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public UniversalComponent f20139d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public TransportFactory f20140e;

        private Builder() {
        }

        @Override // com.google.firebase.inappmessaging.internal.injection.components.AppComponent.Builder
        public final AppComponent.Builder a(AbtIntegrationHelper abtIntegrationHelper) {
            this.f20136a = abtIntegrationHelper;
            return this;
        }

        @Override // com.google.firebase.inappmessaging.internal.injection.components.AppComponent.Builder
        public final AppComponent.Builder b(UniversalComponent universalComponent) {
            this.f20139d = universalComponent;
            return this;
        }

        @Override // com.google.firebase.inappmessaging.internal.injection.components.AppComponent.Builder
        public final AppComponent build() {
            Preconditions.a(AbtIntegrationHelper.class, this.f20136a);
            Preconditions.a(ApiClientModule.class, this.f20137b);
            Preconditions.a(GrpcClientModule.class, this.f20138c);
            Preconditions.a(UniversalComponent.class, this.f20139d);
            Preconditions.a(TransportFactory.class, this.f20140e);
            return new AppComponentImpl(this.f20137b, this.f20138c, this.f20139d, this.f20136a, this.f20140e);
        }

        @Override // com.google.firebase.inappmessaging.internal.injection.components.AppComponent.Builder
        public final AppComponent.Builder c(TransportFactory transportFactory) {
            transportFactory.getClass();
            this.f20140e = transportFactory;
            return this;
        }

        @Override // com.google.firebase.inappmessaging.internal.injection.components.AppComponent.Builder
        public final AppComponent.Builder d(GrpcClientModule grpcClientModule) {
            this.f20138c = grpcClientModule;
            return this;
        }

        @Override // com.google.firebase.inappmessaging.internal.injection.components.AppComponent.Builder
        public final AppComponent.Builder e(ApiClientModule apiClientModule) {
            this.f20137b = apiClientModule;
            return this;
        }

        public /* synthetic */ Builder(int i11) {
            this();
        }
    }

    private DaggerAppComponent() {
    }

    public static AppComponent.Builder a() {
        return new Builder(0);
    }
}
