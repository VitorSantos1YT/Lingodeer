package com.google.firebase.sessions;

import android.content.Context;
import com.google.android.datatransport.TransportFactory;
import com.google.firebase.FirebaseApp;
import com.google.firebase.annotations.concurrent.Background;
import com.google.firebase.annotations.concurrent.Blocking;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.components.Qualified;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import com.google.firebase.sessions.dagger.internal.DoubleCheck;
import com.google.firebase.sessions.dagger.internal.InstanceFactory;
import com.google.firebase.sessions.dagger.internal.Preconditions;
import com.google.firebase.sessions.settings.LocalOverrideSettings_Factory;
import com.google.firebase.sessions.settings.RemoteSettingsFetcher_Factory;
import com.google.firebase.sessions.settings.RemoteSettings_Factory;
import com.google.firebase.sessions.settings.SessionsSettings_Factory;
import com.google.firebase.sessions.settings.SettingsCacheImpl_Factory;
import java.util.List;
import kotlin.jvm.internal.m;
import ns.o;
import rz.y;
import vy.i;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class FirebaseSessionsRegistrar implements ComponentRegistrar {

    @Deprecated
    public static final String LIBRARY_NAME = "fire-sessions";
    private static final Companion Companion = new Companion(0);
    private static final Qualified<Context> appContext = Qualified.a(Context.class);
    private static final Qualified<FirebaseApp> firebaseApp = Qualified.a(FirebaseApp.class);
    private static final Qualified<FirebaseInstallationsApi> firebaseInstallationsApi = Qualified.a(FirebaseInstallationsApi.class);
    private static final Qualified<y> backgroundDispatcher = new Qualified<>(Background.class, y.class);
    private static final Qualified<y> blockingDispatcher = new Qualified<>(Blocking.class, y.class);
    private static final Qualified<TransportFactory> transportFactory = Qualified.a(TransportFactory.class);
    private static final Qualified<FirebaseSessionsComponent> firebaseSessionsComponent = Qualified.a(FirebaseSessionsComponent.class);

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Companion {
        public /* synthetic */ Companion(int i11) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FirebaseSessions getComponents$lambda$0(ComponentContainer componentContainer) {
        return ((FirebaseSessionsComponent) componentContainer.f(firebaseSessionsComponent)).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FirebaseSessionsComponent getComponents$lambda$1(ComponentContainer componentContainer) {
        DaggerFirebaseSessionsComponent.Builder builder = new DaggerFirebaseSessionsComponent.Builder(0);
        Object objF = componentContainer.f(appContext);
        m.e(objF, "get(...)");
        builder.f20852a = (Context) objF;
        Object objF2 = componentContainer.f(backgroundDispatcher);
        m.e(objF2, "get(...)");
        builder.f20853b = (i) objF2;
        Object objF3 = componentContainer.f(blockingDispatcher);
        m.e(objF3, "get(...)");
        builder.f20854c = (i) objF3;
        Object objF4 = componentContainer.f(firebaseApp);
        m.e(objF4, "get(...)");
        builder.f20855d = (FirebaseApp) objF4;
        Object objF5 = componentContainer.f(firebaseInstallationsApi);
        m.e(objF5, "get(...)");
        builder.f20856e = (FirebaseInstallationsApi) objF5;
        Provider providerB = componentContainer.b(transportFactory);
        m.e(providerB, "getProvider(...)");
        builder.f20857f = providerB;
        Preconditions.a(Context.class, builder.f20852a);
        Preconditions.a(i.class, builder.f20853b);
        Preconditions.a(i.class, builder.f20854c);
        Preconditions.a(FirebaseApp.class, builder.f20855d);
        Preconditions.a(FirebaseInstallationsApi.class, builder.f20856e);
        Preconditions.a(Provider.class, builder.f20857f);
        Context context = builder.f20852a;
        i iVar = builder.f20853b;
        i iVar2 = builder.f20854c;
        FirebaseApp firebaseApp2 = builder.f20855d;
        FirebaseInstallationsApi firebaseInstallationsApi2 = builder.f20856e;
        Provider provider = builder.f20857f;
        DaggerFirebaseSessionsComponent.FirebaseSessionsComponentImpl firebaseSessionsComponentImpl = new DaggerFirebaseSessionsComponent.FirebaseSessionsComponentImpl();
        firebaseSessionsComponentImpl.f20858a = InstanceFactory.a(firebaseApp2);
        InstanceFactory instanceFactoryA = InstanceFactory.a(context);
        firebaseSessionsComponentImpl.f20859b = instanceFactoryA;
        firebaseSessionsComponentImpl.f20860c = DoubleCheck.a(new LocalOverrideSettings_Factory(instanceFactoryA));
        firebaseSessionsComponentImpl.f20861d = DoubleCheck.a(FirebaseSessionsComponent_MainModule_Companion_TimeProviderFactory.InstanceHolder.f20899a);
        firebaseSessionsComponentImpl.f20862e = InstanceFactory.a(firebaseInstallationsApi2);
        firebaseSessionsComponentImpl.f20863f = DoubleCheck.a(new FirebaseSessionsComponent_MainModule_Companion_ApplicationInfoFactory(firebaseSessionsComponentImpl.f20858a));
        InstanceFactory instanceFactoryA2 = InstanceFactory.a(iVar2);
        firebaseSessionsComponentImpl.f20864g = instanceFactoryA2;
        firebaseSessionsComponentImpl.f20865h = DoubleCheck.a(new RemoteSettingsFetcher_Factory(firebaseSessionsComponentImpl.f20863f, instanceFactoryA2));
        firebaseSessionsComponentImpl.f20866i = InstanceFactory.a(iVar);
        com.google.firebase.sessions.dagger.internal.Provider providerA = DoubleCheck.a(new FirebaseSessionsComponent_MainModule_Companion_SessionConfigsDataStoreFactory(firebaseSessionsComponentImpl.f20859b, firebaseSessionsComponentImpl.f20864g));
        firebaseSessionsComponentImpl.f20867j = providerA;
        com.google.firebase.sessions.dagger.internal.Provider providerA2 = DoubleCheck.a(new SettingsCacheImpl_Factory(firebaseSessionsComponentImpl.f20866i, firebaseSessionsComponentImpl.f20861d, providerA));
        firebaseSessionsComponentImpl.f20868k = providerA2;
        com.google.firebase.sessions.dagger.internal.Provider providerA3 = DoubleCheck.a(new RemoteSettings_Factory(firebaseSessionsComponentImpl.f20861d, firebaseSessionsComponentImpl.f20862e, firebaseSessionsComponentImpl.f20863f, firebaseSessionsComponentImpl.f20865h, providerA2));
        firebaseSessionsComponentImpl.f20869l = providerA3;
        firebaseSessionsComponentImpl.m = DoubleCheck.a(new SessionsSettings_Factory(firebaseSessionsComponentImpl.f20860c, providerA3));
        com.google.firebase.sessions.dagger.internal.Provider providerA4 = DoubleCheck.a(FirebaseSessionsComponent_MainModule_Companion_UuidGeneratorFactory.InstanceHolder.f20900a);
        firebaseSessionsComponentImpl.f20870n = providerA4;
        firebaseSessionsComponentImpl.f20871o = DoubleCheck.a(new SessionGenerator_Factory(firebaseSessionsComponentImpl.f20861d, providerA4));
        com.google.firebase.sessions.dagger.internal.Provider providerA5 = DoubleCheck.a(new EventGDTLogger_Factory(InstanceFactory.a(provider)));
        firebaseSessionsComponentImpl.f20872p = providerA5;
        firebaseSessionsComponentImpl.f20873q = DoubleCheck.a(new SessionFirelogPublisherImpl_Factory(firebaseSessionsComponentImpl.f20858a, firebaseSessionsComponentImpl.f20862e, firebaseSessionsComponentImpl.m, providerA5, firebaseSessionsComponentImpl.f20866i));
        com.google.firebase.sessions.dagger.internal.Provider providerA6 = DoubleCheck.a(new SessionDataSerializer_Factory(firebaseSessionsComponentImpl.f20871o));
        firebaseSessionsComponentImpl.f20874r = providerA6;
        firebaseSessionsComponentImpl.f20875s = DoubleCheck.a(new FirebaseSessionsComponent_MainModule_Companion_SessionDataStoreFactory(firebaseSessionsComponentImpl.f20859b, firebaseSessionsComponentImpl.f20864g, providerA6));
        com.google.firebase.sessions.dagger.internal.Provider providerA7 = DoubleCheck.a(new ProcessDataManagerImpl_Factory(firebaseSessionsComponentImpl.f20859b, firebaseSessionsComponentImpl.f20870n));
        firebaseSessionsComponentImpl.f20876t = providerA7;
        com.google.firebase.sessions.dagger.internal.Provider providerA8 = DoubleCheck.a(new SharedSessionRepositoryImpl_Factory(firebaseSessionsComponentImpl.m, firebaseSessionsComponentImpl.f20871o, firebaseSessionsComponentImpl.f20873q, firebaseSessionsComponentImpl.f20861d, firebaseSessionsComponentImpl.f20875s, providerA7, firebaseSessionsComponentImpl.f20866i));
        firebaseSessionsComponentImpl.f20877u = providerA8;
        com.google.firebase.sessions.dagger.internal.Provider providerA9 = DoubleCheck.a(new SessionsActivityLifecycleCallbacks_Factory(providerA8));
        firebaseSessionsComponentImpl.f20878v = providerA9;
        firebaseSessionsComponentImpl.f20879w = DoubleCheck.a(new FirebaseSessions_Factory(firebaseSessionsComponentImpl.f20858a, firebaseSessionsComponentImpl.m, firebaseSessionsComponentImpl.f20866i, providerA9));
        return firebaseSessionsComponentImpl;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<Component<? extends Object>> getComponents() {
        Component.Builder builderB = Component.b(FirebaseSessions.class);
        builderB.f18091a = LIBRARY_NAME;
        builderB.a(Dependency.c(firebaseSessionsComponent));
        builderB.f18096f = new com.google.firebase.remoteconfig.a(2);
        builderB.c(2);
        Component componentB = builderB.b();
        Component.Builder builderB2 = Component.b(FirebaseSessionsComponent.class);
        builderB2.f18091a = "fire-sessions-component";
        builderB2.a(Dependency.c(appContext));
        builderB2.a(Dependency.c(backgroundDispatcher));
        builderB2.a(Dependency.c(blockingDispatcher));
        builderB2.a(Dependency.c(firebaseApp));
        builderB2.a(Dependency.c(firebaseInstallationsApi));
        builderB2.a(new Dependency(transportFactory, 1, 1));
        builderB2.f18096f = new com.google.firebase.remoteconfig.a(3);
        return o.L(componentB, builderB2.b(), LibraryVersionComponent.a(LIBRARY_NAME, "3.0.6"));
    }
}
