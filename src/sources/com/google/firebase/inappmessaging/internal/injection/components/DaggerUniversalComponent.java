package com.google.firebase.inappmessaging.internal.injection.components;

import android.app.Application;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.events.Subscriber;
import com.google.firebase.inappmessaging.dagger.internal.DoubleCheck;
import com.google.firebase.inappmessaging.dagger.internal.Preconditions;
import com.google.firebase.inappmessaging.dagger.internal.Provider;
import com.google.firebase.inappmessaging.internal.AnalyticsEventsManager;
import com.google.firebase.inappmessaging.internal.CampaignCacheClient;
import com.google.firebase.inappmessaging.internal.CampaignCacheClient_Factory;
import com.google.firebase.inappmessaging.internal.DeveloperListenerManager;
import com.google.firebase.inappmessaging.internal.ImpressionStorageClient;
import com.google.firebase.inappmessaging.internal.ImpressionStorageClient_Factory;
import com.google.firebase.inappmessaging.internal.ProgramaticContextualTriggers;
import com.google.firebase.inappmessaging.internal.ProviderInstaller;
import com.google.firebase.inappmessaging.internal.ProviderInstaller_Factory;
import com.google.firebase.inappmessaging.internal.RateLimiterClient;
import com.google.firebase.inappmessaging.internal.RateLimiterClient_Factory;
import com.google.firebase.inappmessaging.internal.Schedulers;
import com.google.firebase.inappmessaging.internal.Schedulers_Factory;
import com.google.firebase.inappmessaging.internal.injection.modules.AnalyticsEventsModule;
import com.google.firebase.inappmessaging.internal.injection.modules.AnalyticsEventsModule_ProvidesAnalyticsConnectorEventsFactory;
import com.google.firebase.inappmessaging.internal.injection.modules.AnalyticsEventsModule_ProvidesAnalyticsEventsManagerFactory;
import com.google.firebase.inappmessaging.internal.injection.modules.AppMeasurementModule;
import com.google.firebase.inappmessaging.internal.injection.modules.AppMeasurementModule_ProvidesAnalyticsConnectorFactory;
import com.google.firebase.inappmessaging.internal.injection.modules.AppMeasurementModule_ProvidesSubsriberFactory;
import com.google.firebase.inappmessaging.internal.injection.modules.ApplicationModule;
import com.google.firebase.inappmessaging.internal.injection.modules.ApplicationModule_DeveloperListenerManagerFactory;
import com.google.firebase.inappmessaging.internal.injection.modules.ApplicationModule_ProvidesApplicationFactory;
import com.google.firebase.inappmessaging.internal.injection.modules.ExecutorsModule;
import com.google.firebase.inappmessaging.internal.injection.modules.ExecutorsModule_ProvidesBackgroundExecutorFactory;
import com.google.firebase.inappmessaging.internal.injection.modules.ExecutorsModule_ProvidesBlockingExecutorFactory;
import com.google.firebase.inappmessaging.internal.injection.modules.ExecutorsModule_ProvidesLightWeightExecutorFactory;
import com.google.firebase.inappmessaging.internal.injection.modules.ForegroundFlowableModule;
import com.google.firebase.inappmessaging.internal.injection.modules.ForegroundFlowableModule_ProvidesAppForegroundEventStreamFactory;
import com.google.firebase.inappmessaging.internal.injection.modules.GrpcChannelModule;
import com.google.firebase.inappmessaging.internal.injection.modules.GrpcChannelModule_ProvidesGrpcChannelFactory;
import com.google.firebase.inappmessaging.internal.injection.modules.GrpcChannelModule_ProvidesServiceHostFactory;
import com.google.firebase.inappmessaging.internal.injection.modules.ProgrammaticContextualTriggerFlowableModule;
import com.google.firebase.inappmessaging.internal.injection.modules.ProgrammaticContextualTriggerFlowableModule_ProvidesProgramaticContextualTriggerStreamFactory;
import com.google.firebase.inappmessaging.internal.injection.modules.ProgrammaticContextualTriggerFlowableModule_ProvidesProgramaticContextualTriggersFactory;
import com.google.firebase.inappmessaging.internal.injection.modules.ProtoStorageClientModule;
import com.google.firebase.inappmessaging.internal.injection.modules.ProtoStorageClientModule_ProvidesProtoStorageClientForCampaignFactory;
import com.google.firebase.inappmessaging.internal.injection.modules.ProtoStorageClientModule_ProvidesProtoStorageClientForImpressionStoreFactory;
import com.google.firebase.inappmessaging.internal.injection.modules.ProtoStorageClientModule_ProvidesProtoStorageClientForLimiterStoreFactory;
import com.google.firebase.inappmessaging.internal.injection.modules.RateLimitModule;
import com.google.firebase.inappmessaging.internal.injection.modules.RateLimitModule_ProvidesAppForegroundRateLimitFactory;
import com.google.firebase.inappmessaging.internal.injection.modules.SchedulerModule;
import com.google.firebase.inappmessaging.internal.injection.modules.SchedulerModule_ProvidesComputeSchedulerFactory;
import com.google.firebase.inappmessaging.internal.injection.modules.SchedulerModule_ProvidesIOSchedulerFactory;
import com.google.firebase.inappmessaging.internal.injection.modules.SchedulerModule_ProvidesMainThreadSchedulerFactory;
import com.google.firebase.inappmessaging.internal.injection.modules.SystemClockModule;
import com.google.firebase.inappmessaging.internal.injection.modules.SystemClockModule_ProvidesSystemClockModuleFactory;
import com.google.firebase.inappmessaging.internal.time.SystemClock;
import com.google.firebase.inappmessaging.model.ProtoMarshallerClient_Factory;
import com.google.firebase.inappmessaging.model.RateLimit;
import ex.f1;
import java.util.concurrent.Executor;
import lw.d;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class DaggerUniversalComponent {

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public GrpcChannelModule f20141a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public SchedulerModule f20142b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ApplicationModule f20143c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public ForegroundFlowableModule f20144d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public ProgrammaticContextualTriggerFlowableModule f20145e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public AnalyticsEventsModule f20146f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public ProtoStorageClientModule f20147g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public SystemClockModule f20148h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public RateLimitModule f20149i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public AppMeasurementModule f20150j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public ExecutorsModule f20151k;

        public /* synthetic */ Builder(int i11) {
            this();
        }

        public final UniversalComponent a() {
            if (this.f20141a == null) {
                this.f20141a = new GrpcChannelModule();
            }
            if (this.f20142b == null) {
                this.f20142b = new SchedulerModule();
            }
            Preconditions.a(ApplicationModule.class, this.f20143c);
            if (this.f20144d == null) {
                this.f20144d = new ForegroundFlowableModule();
            }
            Preconditions.a(ProgrammaticContextualTriggerFlowableModule.class, this.f20145e);
            if (this.f20146f == null) {
                this.f20146f = new AnalyticsEventsModule();
            }
            if (this.f20147g == null) {
                this.f20147g = new ProtoStorageClientModule();
            }
            if (this.f20148h == null) {
                this.f20148h = new SystemClockModule();
            }
            if (this.f20149i == null) {
                this.f20149i = new RateLimitModule();
            }
            Preconditions.a(AppMeasurementModule.class, this.f20150j);
            Preconditions.a(ExecutorsModule.class, this.f20151k);
            return new UniversalComponentImpl(this.f20141a, this.f20142b, this.f20143c, this.f20144d, this.f20145e, this.f20146f, this.f20147g, this.f20148h, this.f20149i, this.f20150j, this.f20151k);
        }

        private Builder() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class UniversalComponentImpl implements UniversalComponent {
        public final Provider A;
        public final Provider B;
        public final Provider C;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SystemClockModule f20152a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final RateLimitModule f20153b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Provider f20154c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Provider f20155d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Provider f20156e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final Provider f20157f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Provider f20158g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Provider f20159h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final Provider f20160i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final Provider f20161j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final Provider f20162k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final Provider f20163l;
        public final Provider m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final Provider f20164n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final Provider f20165o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final Provider f20166p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final Provider f20167q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final Provider f20168r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final SystemClockModule_ProvidesSystemClockModuleFactory f20169s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final Provider f20170t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final Provider f20171u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final Provider f20172v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final Provider f20173w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final Provider f20174x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final Provider f20175y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final Provider f20176z;

        public UniversalComponentImpl(GrpcChannelModule grpcChannelModule, SchedulerModule schedulerModule, ApplicationModule applicationModule, ForegroundFlowableModule foregroundFlowableModule, ProgrammaticContextualTriggerFlowableModule programmaticContextualTriggerFlowableModule, AnalyticsEventsModule analyticsEventsModule, ProtoStorageClientModule protoStorageClientModule, SystemClockModule systemClockModule, RateLimitModule rateLimitModule, AppMeasurementModule appMeasurementModule, ExecutorsModule executorsModule) {
            this.f20152a = systemClockModule;
            this.f20153b = rateLimitModule;
            Provider providerA = DoubleCheck.a(new ApplicationModule_ProvidesApplicationFactory(applicationModule));
            this.f20154c = providerA;
            this.f20155d = DoubleCheck.a(new ProviderInstaller_Factory(providerA));
            Provider providerA2 = DoubleCheck.a(new GrpcChannelModule_ProvidesServiceHostFactory(grpcChannelModule));
            this.f20156e = providerA2;
            this.f20157f = DoubleCheck.a(new GrpcChannelModule_ProvidesGrpcChannelFactory(grpcChannelModule, providerA2));
            this.f20158g = DoubleCheck.a(new SchedulerModule_ProvidesIOSchedulerFactory(schedulerModule));
            this.f20159h = DoubleCheck.a(new SchedulerModule_ProvidesComputeSchedulerFactory(schedulerModule));
            Provider providerA3 = DoubleCheck.a(new SchedulerModule_ProvidesMainThreadSchedulerFactory(schedulerModule));
            this.f20160i = providerA3;
            this.f20161j = DoubleCheck.a(new Schedulers_Factory(this.f20158g, this.f20159h, providerA3));
            this.f20162k = DoubleCheck.a(new ForegroundFlowableModule_ProvidesAppForegroundEventStreamFactory(foregroundFlowableModule, this.f20154c));
            this.f20163l = DoubleCheck.a(new ProgrammaticContextualTriggerFlowableModule_ProvidesProgramaticContextualTriggerStreamFactory(programmaticContextualTriggerFlowableModule));
            this.m = DoubleCheck.a(new ProgrammaticContextualTriggerFlowableModule_ProvidesProgramaticContextualTriggersFactory(programmaticContextualTriggerFlowableModule));
            Provider providerA4 = DoubleCheck.a(new AppMeasurementModule_ProvidesAnalyticsConnectorFactory(appMeasurementModule));
            this.f20164n = providerA4;
            Provider providerA5 = DoubleCheck.a(new AnalyticsEventsModule_ProvidesAnalyticsEventsManagerFactory(analyticsEventsModule, providerA4));
            this.f20165o = providerA5;
            this.f20166p = DoubleCheck.a(new AnalyticsEventsModule_ProvidesAnalyticsConnectorEventsFactory(analyticsEventsModule, providerA5));
            this.f20167q = DoubleCheck.a(new AppMeasurementModule_ProvidesSubsriberFactory(appMeasurementModule));
            Provider providerA6 = DoubleCheck.a(new ProtoStorageClientModule_ProvidesProtoStorageClientForCampaignFactory(protoStorageClientModule, this.f20154c));
            this.f20168r = providerA6;
            SystemClockModule_ProvidesSystemClockModuleFactory systemClockModule_ProvidesSystemClockModuleFactory = new SystemClockModule_ProvidesSystemClockModuleFactory(systemClockModule);
            this.f20169s = systemClockModule_ProvidesSystemClockModuleFactory;
            this.f20170t = DoubleCheck.a(new CampaignCacheClient_Factory(providerA6, this.f20154c, systemClockModule_ProvidesSystemClockModuleFactory));
            Provider providerA7 = DoubleCheck.a(new ProtoStorageClientModule_ProvidesProtoStorageClientForImpressionStoreFactory(protoStorageClientModule, this.f20154c));
            this.f20171u = providerA7;
            this.f20172v = DoubleCheck.a(new ImpressionStorageClient_Factory(providerA7));
            this.f20173w = DoubleCheck.a(ProtoMarshallerClient_Factory.a());
            Provider providerA8 = DoubleCheck.a(new ProtoStorageClientModule_ProvidesProtoStorageClientForLimiterStoreFactory(protoStorageClientModule, this.f20154c));
            this.f20174x = providerA8;
            this.f20175y = DoubleCheck.a(new RateLimiterClient_Factory(providerA8, this.f20169s));
            Provider providerA9 = DoubleCheck.a(new ExecutorsModule_ProvidesBackgroundExecutorFactory(executorsModule));
            this.f20176z = providerA9;
            this.A = DoubleCheck.a(new ApplicationModule_DeveloperListenerManagerFactory(applicationModule, providerA9));
            this.B = DoubleCheck.a(new ExecutorsModule_ProvidesLightWeightExecutorFactory(executorsModule));
            this.C = DoubleCheck.a(new ExecutorsModule_ProvidesBlockingExecutorFactory(executorsModule));
        }

        @Override // com.google.firebase.inappmessaging.internal.injection.components.UniversalComponent
        public final Application a() {
            return (Application) this.f20154c.get();
        }

        @Override // com.google.firebase.inappmessaging.internal.injection.components.UniversalComponent
        public final ProgramaticContextualTriggers b() {
            return (ProgramaticContextualTriggers) this.m.get();
        }

        @Override // com.google.firebase.inappmessaging.internal.injection.components.UniversalComponent
        public final Executor c() {
            return (Executor) this.C.get();
        }

        @Override // com.google.firebase.inappmessaging.internal.injection.components.UniversalComponent
        public final RateLimit d() {
            return RateLimitModule_ProvidesAppForegroundRateLimitFactory.a(this.f20153b);
        }

        @Override // com.google.firebase.inappmessaging.internal.injection.components.UniversalComponent
        public final AnalyticsEventsManager e() {
            return (AnalyticsEventsManager) this.f20165o.get();
        }

        @Override // com.google.firebase.inappmessaging.internal.injection.components.UniversalComponent
        public final Subscriber f() {
            return (Subscriber) this.f20167q.get();
        }

        @Override // com.google.firebase.inappmessaging.internal.injection.components.UniversalComponent
        public final DeveloperListenerManager g() {
            return (DeveloperListenerManager) this.A.get();
        }

        @Override // com.google.firebase.inappmessaging.internal.injection.components.UniversalComponent
        public final ImpressionStorageClient h() {
            return (ImpressionStorageClient) this.f20172v.get();
        }

        @Override // com.google.firebase.inappmessaging.internal.injection.components.UniversalComponent
        public final Schedulers i() {
            return (Schedulers) this.f20161j.get();
        }

        @Override // com.google.firebase.inappmessaging.internal.injection.components.UniversalComponent
        public final CampaignCacheClient j() {
            return (CampaignCacheClient) this.f20170t.get();
        }

        @Override // com.google.firebase.inappmessaging.internal.injection.components.UniversalComponent
        public final Executor k() {
            return (Executor) this.B.get();
        }

        @Override // com.google.firebase.inappmessaging.internal.injection.components.UniversalComponent
        public final ProviderInstaller l() {
            return (ProviderInstaller) this.f20155d.get();
        }

        @Override // com.google.firebase.inappmessaging.internal.injection.components.UniversalComponent
        public final RateLimiterClient m() {
            return (RateLimiterClient) this.f20175y.get();
        }

        @Override // com.google.firebase.inappmessaging.internal.injection.components.UniversalComponent
        public final f1 n() {
            return (f1) this.f20162k.get();
        }

        @Override // com.google.firebase.inappmessaging.internal.injection.components.UniversalComponent
        public final SystemClock o() {
            this.f20152a.getClass();
            return new SystemClock();
        }

        @Override // com.google.firebase.inappmessaging.internal.injection.components.UniversalComponent
        public final f1 p() {
            return (f1) this.f20163l.get();
        }

        @Override // com.google.firebase.inappmessaging.internal.injection.components.UniversalComponent
        public final d q() {
            return (d) this.f20157f.get();
        }

        @Override // com.google.firebase.inappmessaging.internal.injection.components.UniversalComponent
        public final AnalyticsConnector r() {
            return (AnalyticsConnector) this.f20164n.get();
        }
    }

    private DaggerUniversalComponent() {
    }
}
