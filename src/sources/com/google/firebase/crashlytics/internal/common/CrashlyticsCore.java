package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import com.google.firebase.FirebaseApp;
import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponentDeferredProxy;
import com.google.firebase.crashlytics.internal.CrashlyticsRemoteConfigListener;
import com.google.firebase.crashlytics.internal.RemoteConfigDeferredProxy;
import com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbHandler;
import com.google.firebase.crashlytics.internal.common.CrashlyticsController.AnonymousClass1;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers;
import com.google.firebase.crashlytics.internal.metadata.LogFileManager;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import com.google.firebase.crashlytics.internal.send.DataTransportCrashlyticsReportSender;
import com.google.firebase.crashlytics.internal.settings.SettingsController;
import com.google.firebase.crashlytics.internal.stacktrace.MiddleOutFallbackStrategy;
import com.google.firebase.crashlytics.internal.stacktrace.RemoveRepeatsStrategy;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class CrashlyticsCore {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f18288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DataCollectionArbiter f18289b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final OnDemandCounter f18290c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f18291d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CrashlyticsFileMarker f18292e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public CrashlyticsFileMarker f18293f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public CrashlyticsController f18294g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final IdManager f18295h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final FileStore f18296i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final com.google.firebase.crashlytics.a f18297j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final com.google.firebase.crashlytics.a f18298k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final CrashlyticsAppQualitySessionsSubscriber f18299l;
    public final CrashlyticsNativeComponentDeferredProxy m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final RemoteConfigDeferredProxy f18300n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final CrashlyticsWorkers f18301o;

    public CrashlyticsCore(FirebaseApp firebaseApp, IdManager idManager, CrashlyticsNativeComponentDeferredProxy crashlyticsNativeComponentDeferredProxy, DataCollectionArbiter dataCollectionArbiter, com.google.firebase.crashlytics.a aVar, com.google.firebase.crashlytics.a aVar2, FileStore fileStore, CrashlyticsAppQualitySessionsSubscriber crashlyticsAppQualitySessionsSubscriber, RemoteConfigDeferredProxy remoteConfigDeferredProxy, CrashlyticsWorkers crashlyticsWorkers) {
        this.f18289b = dataCollectionArbiter;
        firebaseApp.b();
        this.f18288a = firebaseApp.f17714a;
        this.f18295h = idManager;
        this.m = crashlyticsNativeComponentDeferredProxy;
        this.f18297j = aVar;
        this.f18298k = aVar2;
        this.f18296i = fileStore;
        this.f18299l = crashlyticsAppQualitySessionsSubscriber;
        this.f18300n = remoteConfigDeferredProxy;
        this.f18301o = crashlyticsWorkers;
        this.f18291d = System.currentTimeMillis();
        this.f18290c = new OnDemandCounter();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [com.google.firebase.crashlytics.internal.common.g] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void a(SettingsController settingsController) {
        File file;
        CrashlyticsWorkers.a();
        CrashlyticsWorkers.a();
        CrashlyticsFileMarker crashlyticsFileMarker = this.f18292e;
        crashlyticsFileMarker.getClass();
        try {
            FileStore fileStore = crashlyticsFileMarker.f18303b;
            String str = crashlyticsFileMarker.f18302a;
            fileStore.getClass();
            new File(fileStore.f18882c, str).createNewFile();
        } catch (IOException unused) {
        }
        try {
            try {
                try {
                    this.f18297j.a(new BreadcrumbHandler() { // from class: com.google.firebase.crashlytics.internal.common.g
                        @Override // com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbHandler
                        public final void a(String str2) {
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            CrashlyticsCore crashlyticsCore = this.f18361a;
                            crashlyticsCore.f18301o.f18376a.b(new c(crashlyticsCore, jCurrentTimeMillis - crashlyticsCore.f18291d, str2));
                        }
                    });
                    this.f18294g.f();
                    if (!settingsController.d().f18916b.f18921a) {
                        throw new RuntimeException("Collection of crash reports disabled in Crashlytics settings.");
                    }
                    CrashlyticsController crashlyticsController = this.f18294g;
                    crashlyticsController.getClass();
                    CrashlyticsWorkers.a();
                    CrashlyticsUncaughtExceptionHandler crashlyticsUncaughtExceptionHandler = crashlyticsController.f18272n;
                    if (!(crashlyticsUncaughtExceptionHandler != null && crashlyticsUncaughtExceptionHandler.f18316e.get())) {
                        try {
                            crashlyticsController.b(true, settingsController, true);
                        } catch (Exception unused2) {
                        }
                    }
                    this.f18294g.g(settingsController.c());
                    CrashlyticsWorkers.a();
                    CrashlyticsFileMarker crashlyticsFileMarker2 = this.f18292e;
                    FileStore fileStore2 = crashlyticsFileMarker2.f18303b;
                    String str2 = crashlyticsFileMarker2.f18302a;
                    fileStore2.getClass();
                    file = new File(fileStore2.f18882c, str2);
                    file.delete();
                } catch (Throwable th2) {
                    CrashlyticsWorkers.a();
                    try {
                        CrashlyticsFileMarker crashlyticsFileMarker3 = this.f18292e;
                        FileStore fileStore3 = crashlyticsFileMarker3.f18303b;
                        String str3 = crashlyticsFileMarker3.f18302a;
                        fileStore3.getClass();
                        new File(fileStore3.f18882c, str3).delete();
                    } catch (Exception unused3) {
                    }
                    throw th2;
                }
            } catch (Exception unused4) {
                CrashlyticsWorkers.a();
                CrashlyticsFileMarker crashlyticsFileMarker4 = this.f18292e;
                FileStore fileStore4 = crashlyticsFileMarker4.f18303b;
                String str4 = crashlyticsFileMarker4.f18302a;
                fileStore4.getClass();
                file = new File(fileStore4.f18882c, str4);
            }
        } catch (Exception unused5) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0033  */
    public final boolean b(AppData appData, SettingsController settingsController) {
        boolean z11;
        NetworkInfo activeNetworkInfo;
        Resources resources;
        CrashlyticsWorkers crashlyticsWorkers = this.f18301o;
        FileStore fileStore = this.f18296i;
        Context context = this.f18288a;
        int i11 = 1;
        if (context == null || (resources = context.getResources()) == null) {
            z11 = true;
        } else {
            int iD = CommonUtils.d(context, "com.crashlytics.RequireBuildId", "bool");
            if (iD > 0) {
                z11 = resources.getBoolean(iD);
            } else {
                int iD2 = CommonUtils.d(context, "com.crashlytics.RequireBuildId", "string");
                if (iD2 > 0) {
                    z11 = Boolean.parseBoolean(context.getString(iD2));
                } else {
                    z11 = true;
                }
            }
        }
        String str = appData.f18231b;
        if (z11 && TextUtils.isEmpty(str)) {
            throw new IllegalStateException("The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
        }
        String str2 = new CLSUUID().f18249a;
        try {
            this.f18293f = new CrashlyticsFileMarker("crash_marker", fileStore);
            this.f18292e = new CrashlyticsFileMarker("initialization_marker", fileStore);
            UserMetadata userMetadata = new UserMetadata(str2, fileStore, crashlyticsWorkers);
            LogFileManager logFileManager = new LogFileManager(fileStore);
            MiddleOutFallbackStrategy middleOutFallbackStrategy = new MiddleOutFallbackStrategy(new RemoveRepeatsStrategy(10));
            RemoteConfigDeferredProxy remoteConfigDeferredProxy = this.f18300n;
            remoteConfigDeferredProxy.getClass();
            remoteConfigDeferredProxy.f18224a.a(new app.rive.runtime.kotlin.core.a(new CrashlyticsRemoteConfigListener(userMetadata), 26));
            Context context2 = this.f18288a;
            IdManager idManager = this.f18295h;
            this.f18294g = new CrashlyticsController(this.f18288a, this.f18295h, this.f18289b, this.f18296i, this.f18293f, appData, userMetadata, logFileManager, new SessionReportingCoordinator(new CrashlyticsReportDataCapture(context2, idManager, appData, middleOutFallbackStrategy, settingsController), new CrashlyticsReportPersistence(fileStore, settingsController, this.f18299l), DataTransportCrashlyticsReportSender.a(context2, settingsController, this.f18290c), logFileManager, userMetadata, idManager, this.f18301o), this.m, this.f18298k, this.f18299l, this.f18301o);
            CrashlyticsFileMarker crashlyticsFileMarker = this.f18292e;
            FileStore fileStore2 = crashlyticsFileMarker.f18303b;
            String str3 = crashlyticsFileMarker.f18302a;
            fileStore2.getClass();
            boolean zExists = new File(fileStore2.f18882c, str3).exists();
            try {
                Boolean.TRUE.equals((Boolean) crashlyticsWorkers.f18376a.f18372a.submit(new Callable() { // from class: com.google.firebase.crashlytics.internal.common.f
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        CrashlyticsController crashlyticsController = this.f18360a.f18294g;
                        crashlyticsController.getClass();
                        CrashlyticsWorkers.a();
                        CrashlyticsFileMarker crashlyticsFileMarker2 = crashlyticsController.f18262c;
                        FileStore fileStore3 = crashlyticsFileMarker2.f18303b;
                        String str4 = crashlyticsFileMarker2.f18302a;
                        fileStore3.getClass();
                        boolean z12 = true;
                        if (new File(fileStore3.f18882c, str4).exists()) {
                            FileStore fileStore4 = crashlyticsFileMarker2.f18303b;
                            fileStore4.getClass();
                            new File(fileStore4.f18882c, str4).delete();
                        } else {
                            String strD = crashlyticsController.d();
                            if (strD == null || !crashlyticsController.f18269j.d(strD)) {
                                z12 = false;
                            }
                        }
                        return Boolean.valueOf(z12);
                    }
                }).get(3L, TimeUnit.SECONDS));
            } catch (Exception unused) {
            }
            CrashlyticsController crashlyticsController = this.f18294g;
            Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            crashlyticsController.getClass();
            crashlyticsController.f18264e.f18376a.a(new e(2, crashlyticsController, str2));
            CrashlyticsUncaughtExceptionHandler crashlyticsUncaughtExceptionHandler = new CrashlyticsUncaughtExceptionHandler(crashlyticsController.new AnonymousClass1(), settingsController, defaultUncaughtExceptionHandler, crashlyticsController.f18269j);
            crashlyticsController.f18272n = crashlyticsUncaughtExceptionHandler;
            Thread.setDefaultUncaughtExceptionHandler(crashlyticsUncaughtExceptionHandler);
            if (!zExists || (context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0 && ((activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnectedOrConnecting()))) {
                return true;
            }
            try {
                crashlyticsWorkers.f18376a.f18372a.submit(new e(i11, this, settingsController)).get(3L, TimeUnit.SECONDS);
            } catch (InterruptedException unused2) {
                Thread.currentThread().interrupt();
            } catch (ExecutionException | TimeoutException unused3) {
            }
            return false;
        } catch (Exception unused4) {
            this.f18294g = null;
            return false;
        }
    }
}
