package com.google.firebase.inappmessaging;

import android.app.Application;
import android.content.Context;
import com.google.android.datatransport.TransportFactory;
import com.google.firebase.FirebaseApp;
import com.google.firebase.abt.component.AbtComponent;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.annotations.concurrent.Background;
import com.google.firebase.annotations.concurrent.Blocking;
import com.google.firebase.annotations.concurrent.Lightweight;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.components.Qualified;
import com.google.firebase.database.android.d;
import com.google.firebase.datatransport.LegacyTransportBackend;
import com.google.firebase.events.Subscriber;
import com.google.firebase.inappmessaging.internal.AbtIntegrationHelper;
import com.google.firebase.inappmessaging.internal.ProgramaticContextualTriggers;
import com.google.firebase.inappmessaging.internal.injection.components.AppComponent;
import com.google.firebase.inappmessaging.internal.injection.components.DaggerAppComponent;
import com.google.firebase.inappmessaging.internal.injection.components.DaggerUniversalComponent;
import com.google.firebase.inappmessaging.internal.injection.components.UniversalComponent;
import com.google.firebase.inappmessaging.internal.injection.modules.AnalyticsEventsModule;
import com.google.firebase.inappmessaging.internal.injection.modules.ApiClientModule;
import com.google.firebase.inappmessaging.internal.injection.modules.AppMeasurementModule;
import com.google.firebase.inappmessaging.internal.injection.modules.ApplicationModule;
import com.google.firebase.inappmessaging.internal.injection.modules.ExecutorsModule;
import com.google.firebase.inappmessaging.internal.injection.modules.GrpcClientModule;
import com.google.firebase.inappmessaging.internal.injection.modules.ProgrammaticContextualTriggerFlowableModule;
import com.google.firebase.inject.Deferred;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class FirebaseInAppMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fiam";
    private Qualified<Executor> backgroundExecutor = new Qualified<>(Background.class, Executor.class);
    private Qualified<Executor> blockingExecutor = new Qualified<>(Blocking.class, Executor.class);
    private Qualified<Executor> lightWeightExecutor = new Qualified<>(Lightweight.class, Executor.class);
    private Qualified<TransportFactory> legacyTransportFactory = new Qualified<>(LegacyTransportBackend.class, TransportFactory.class);

    /* JADX INFO: Access modifiers changed from: private */
    public FirebaseInAppMessaging providesFirebaseInAppMessaging(ComponentContainer componentContainer) {
        FirebaseApp firebaseApp = (FirebaseApp) componentContainer.a(FirebaseApp.class);
        FirebaseInstallationsApi firebaseInstallationsApi = (FirebaseInstallationsApi) componentContainer.a(FirebaseInstallationsApi.class);
        Deferred deferredI = componentContainer.i(AnalyticsConnector.class);
        Subscriber subscriber = (Subscriber) componentContainer.a(Subscriber.class);
        firebaseApp.b();
        Application application = (Application) firebaseApp.f17714a;
        DaggerUniversalComponent.Builder builder = new DaggerUniversalComponent.Builder(0);
        builder.f20143c = new ApplicationModule(application);
        builder.f20150j = new AppMeasurementModule(deferredI, subscriber);
        builder.f20146f = new AnalyticsEventsModule();
        ProgramaticContextualTriggers programaticContextualTriggers = new ProgramaticContextualTriggers();
        ProgrammaticContextualTriggerFlowableModule programmaticContextualTriggerFlowableModule = new ProgrammaticContextualTriggerFlowableModule();
        programmaticContextualTriggerFlowableModule.f20220a = programaticContextualTriggers;
        builder.f20145e = programmaticContextualTriggerFlowableModule;
        builder.f20151k = new ExecutorsModule((Executor) componentContainer.f(this.lightWeightExecutor), (Executor) componentContainer.f(this.backgroundExecutor), (Executor) componentContainer.f(this.blockingExecutor));
        UniversalComponent universalComponentA = builder.a();
        AppComponent.Builder builderA = DaggerAppComponent.a();
        builderA.a(new AbtIntegrationHelper(((AbtComponent) componentContainer.a(AbtComponent.class)).a("fiam"), (Executor) componentContainer.f(this.blockingExecutor)));
        builderA.e(new ApiClientModule(firebaseApp, firebaseInstallationsApi, universalComponentA.o()));
        builderA.d(new GrpcClientModule(firebaseApp));
        builderA.b(universalComponentA);
        builderA.c((TransportFactory) componentContainer.f(this.legacyTransportFactory));
        return builderA.build().a();
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<Component<?>> getComponents() {
        Component.Builder builderB = Component.b(FirebaseInAppMessaging.class);
        builderB.f18091a = LIBRARY_NAME;
        builderB.a(Dependency.d(Context.class));
        builderB.a(Dependency.d(FirebaseInstallationsApi.class));
        builderB.a(Dependency.d(FirebaseApp.class));
        builderB.a(Dependency.d(AbtComponent.class));
        builderB.a(Dependency.a(AnalyticsConnector.class));
        builderB.a(Dependency.c(this.legacyTransportFactory));
        builderB.a(Dependency.d(Subscriber.class));
        builderB.a(Dependency.c(this.backgroundExecutor));
        builderB.a(Dependency.c(this.blockingExecutor));
        builderB.a(Dependency.c(this.lightWeightExecutor));
        builderB.f18096f = new d(this, 2);
        builderB.c(2);
        return Arrays.asList(builderB.b(), LibraryVersionComponent.a(LIBRARY_NAME, "22.0.3"));
    }
}
