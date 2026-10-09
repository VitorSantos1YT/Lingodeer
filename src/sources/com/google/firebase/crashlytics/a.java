package com.google.firebase.crashlytics;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.firebase.FirebaseApp;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent;
import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponentDeferredProxy;
import com.google.firebase.crashlytics.internal.DevelopmentPlatformProvider;
import com.google.firebase.crashlytics.internal.RemoteConfigDeferredProxy;
import com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger;
import com.google.firebase.crashlytics.internal.analytics.BlockingAnalyticsEventLogger;
import com.google.firebase.crashlytics.internal.analytics.BreadcrumbAnalyticsEventReceiver;
import com.google.firebase.crashlytics.internal.analytics.CrashlyticsOriginAnalyticsEventLogger;
import com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbHandler;
import com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbSource;
import com.google.firebase.crashlytics.internal.breadcrumbs.DisabledBreadcrumbSource;
import com.google.firebase.crashlytics.internal.common.AppData;
import com.google.firebase.crashlytics.internal.common.BuildIdInfo;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.common.CrashlyticsAppQualitySessionsSubscriber;
import com.google.firebase.crashlytics.internal.common.CrashlyticsCore;
import com.google.firebase.crashlytics.internal.common.DataCollectionArbiter;
import com.google.firebase.crashlytics.internal.common.IdManager;
import com.google.firebase.crashlytics.internal.common.e;
import com.google.firebase.crashlytics.internal.common.g;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers;
import com.google.firebase.crashlytics.internal.network.HttpRequestFactory;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import com.google.firebase.crashlytics.internal.settings.SettingsController;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.remoteconfig.interop.FirebaseRemoteConfigInterop;
import com.google.firebase.sessions.api.FirebaseSessionsDependencies;
import fa.EQx.nuRcCS;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Deferred.DeferredHandler, BreadcrumbSource, AnalyticsEventLogger, ComponentFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f18214a;

    public /* synthetic */ a(Object obj) {
        this.f18214a = obj;
    }

    @Override // com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbSource
    public void a(g gVar) {
        AnalyticsDeferredProxy analyticsDeferredProxy = (AnalyticsDeferredProxy) this.f18214a;
        synchronized (analyticsDeferredProxy) {
            try {
                if (analyticsDeferredProxy.f18205c instanceof DisabledBreadcrumbSource) {
                    analyticsDeferredProxy.f18206d.add(gVar);
                }
                analyticsDeferredProxy.f18205c.a(gVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger
    public void b(Bundle bundle) {
        ((AnalyticsDeferredProxy) this.f18214a).f18204b.b(bundle);
    }

    @Override // com.google.firebase.inject.Deferred.DeferredHandler
    public void h(Provider provider) {
        AnalyticsDeferredProxy analyticsDeferredProxy = (AnalyticsDeferredProxy) this.f18214a;
        AnalyticsConnector analyticsConnector = (AnalyticsConnector) provider.get();
        CrashlyticsOriginAnalyticsEventLogger crashlyticsOriginAnalyticsEventLogger = new CrashlyticsOriginAnalyticsEventLogger(analyticsConnector);
        CrashlyticsAnalyticsListener crashlyticsAnalyticsListener = new CrashlyticsAnalyticsListener();
        AnalyticsConnector.AnalyticsConnectorHandle analyticsConnectorHandleH = analyticsConnector.h("clx", crashlyticsAnalyticsListener);
        if (analyticsConnectorHandleH == null) {
            analyticsConnectorHandleH = analyticsConnector.h("crash", crashlyticsAnalyticsListener);
        }
        if (analyticsConnectorHandleH != null) {
            BreadcrumbAnalyticsEventReceiver breadcrumbAnalyticsEventReceiver = new BreadcrumbAnalyticsEventReceiver();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            BlockingAnalyticsEventLogger blockingAnalyticsEventLogger = new BlockingAnalyticsEventLogger(crashlyticsOriginAnalyticsEventLogger);
            synchronized (analyticsDeferredProxy) {
                try {
                    ArrayList arrayList = analyticsDeferredProxy.f18206d;
                    int size = arrayList.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj = arrayList.get(i11);
                        i11++;
                        breadcrumbAnalyticsEventReceiver.f18228a = (BreadcrumbHandler) obj;
                    }
                    crashlyticsAnalyticsListener.f18208b = breadcrumbAnalyticsEventReceiver;
                    crashlyticsAnalyticsListener.f18207a = blockingAnalyticsEventLogger;
                    analyticsDeferredProxy.f18205c = breadcrumbAnalyticsEventReceiver;
                    analyticsDeferredProxy.f18204b = blockingAnalyticsEventLogger;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // com.google.firebase.components.ComponentFactory
    public Object d(ComponentContainer componentContainer) {
        FirebaseCrashlytics firebaseCrashlytics;
        CrashlyticsRegistrar crashlyticsRegistrar = (CrashlyticsRegistrar) this.f18214a;
        int i11 = CrashlyticsRegistrar.f18209d;
        CrashlyticsWorkers.f18375d.getClass();
        System.currentTimeMillis();
        FirebaseApp firebaseApp = (FirebaseApp) componentContainer.a(FirebaseApp.class);
        FirebaseInstallationsApi firebaseInstallationsApi = (FirebaseInstallationsApi) componentContainer.a(FirebaseInstallationsApi.class);
        Deferred deferredI = componentContainer.i(CrashlyticsNativeComponent.class);
        Deferred deferredI2 = componentContainer.i(AnalyticsConnector.class);
        Deferred deferredI3 = componentContainer.i(FirebaseRemoteConfigInterop.class);
        ExecutorService executorService = (ExecutorService) componentContainer.f(crashlyticsRegistrar.f18210a);
        ExecutorService executorService2 = (ExecutorService) componentContainer.f(crashlyticsRegistrar.f18211b);
        ExecutorService executorService3 = (ExecutorService) componentContainer.f(crashlyticsRegistrar.f18212c);
        firebaseApp.b();
        Context context = firebaseApp.f17714a;
        String packageName = context.getPackageName();
        CrashlyticsWorkers crashlyticsWorkers = new CrashlyticsWorkers(executorService, executorService2);
        FileStore fileStore = new FileStore(context);
        DataCollectionArbiter dataCollectionArbiter = new DataCollectionArbiter(firebaseApp);
        IdManager idManager = new IdManager(context, packageName, firebaseInstallationsApi, dataCollectionArbiter);
        CrashlyticsNativeComponentDeferredProxy crashlyticsNativeComponentDeferredProxy = new CrashlyticsNativeComponentDeferredProxy(deferredI);
        AnalyticsDeferredProxy analyticsDeferredProxy = new AnalyticsDeferredProxy(deferredI2);
        CrashlyticsAppQualitySessionsSubscriber crashlyticsAppQualitySessionsSubscriber = new CrashlyticsAppQualitySessionsSubscriber(dataCollectionArbiter, fileStore);
        FirebaseSessionsDependencies.d(crashlyticsAppQualitySessionsSubscriber);
        CrashlyticsCore crashlyticsCore = new CrashlyticsCore(firebaseApp, idManager, crashlyticsNativeComponentDeferredProxy, dataCollectionArbiter, new a(analyticsDeferredProxy), new a(analyticsDeferredProxy), fileStore, crashlyticsAppQualitySessionsSubscriber, new RemoteConfigDeferredProxy(deferredI3), crashlyticsWorkers);
        firebaseApp.b();
        String str = firebaseApp.f17716c.f17732b;
        int iD = CommonUtils.d(context, "com.google.firebase.crashlytics.mapping_file_id", "string");
        if (iD == 0) {
            iD = CommonUtils.d(context, "com.crashlytics.android.build_id", "string");
        }
        String string = iD != 0 ? context.getResources().getString(iD) : null;
        ArrayList arrayList = new ArrayList();
        int iD2 = CommonUtils.d(context, nuRcCS.wNTD, "array");
        int iD3 = CommonUtils.d(context, "com.google.firebase.crashlytics.build_ids_arch", "array");
        int iD4 = CommonUtils.d(context, "com.google.firebase.crashlytics.build_ids_build_id", "array");
        if (iD2 == 0 || iD3 == 0 || iD4 == 0) {
            String.format("Could not find resources: %d %d %d", Integer.valueOf(iD2), Integer.valueOf(iD3), Integer.valueOf(iD4));
        } else {
            String[] stringArray = context.getResources().getStringArray(iD2);
            String[] stringArray2 = context.getResources().getStringArray(iD3);
            String[] stringArray3 = context.getResources().getStringArray(iD4);
            if (stringArray.length == stringArray3.length && stringArray2.length == stringArray3.length) {
                for (int i12 = 0; i12 < stringArray3.length; i12++) {
                    arrayList.add(new BuildIdInfo(stringArray[i12], stringArray2[i12], stringArray3[i12]));
                }
            } else {
                String.format("Lengths did not match: %d %d %d", Integer.valueOf(stringArray.length), Integer.valueOf(stringArray2.length), Integer.valueOf(stringArray3.length));
            }
        }
        int size = arrayList.size();
        int i13 = 0;
        while (i13 < size) {
            Object obj = arrayList.get(i13);
            i13++;
            String str2 = ((BuildIdInfo) obj).f18244a;
        }
        int i14 = 0;
        try {
            AppData appDataA = AppData.a(context, idManager, str, string, arrayList, new DevelopmentPlatformProvider(context));
            SettingsController settingsControllerA = SettingsController.a(context, str, idManager, new HttpRequestFactory(), appDataA.f18235f, appDataA.f18236g, fileStore, dataCollectionArbiter);
            settingsControllerA.e(crashlyticsWorkers).addOnFailureListener(executorService3, new c3.a(23));
            if (crashlyticsCore.b(appDataA, settingsControllerA)) {
                crashlyticsCore.f18301o.f18376a.a(new e(i14, crashlyticsCore, settingsControllerA));
            }
            firebaseCrashlytics = new FirebaseCrashlytics(crashlyticsCore);
        } catch (PackageManager.NameNotFoundException unused) {
            firebaseCrashlytics = null;
        }
        System.currentTimeMillis();
        return firebaseCrashlytics;
    }
}
