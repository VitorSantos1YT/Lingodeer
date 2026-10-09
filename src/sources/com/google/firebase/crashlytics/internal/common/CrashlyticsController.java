package com.google.firebase.crashlytics.internal.common;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.Base64;
import android.util.JsonReader;
import com.adjust.sdk.Constants;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent;
import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponentDeferredProxy;
import com.google.firebase.crashlytics.internal.DevelopmentPlatformProvider;
import com.google.firebase.crashlytics.internal.ProcessDetailsProvider;
import com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsTasks;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers;
import com.google.firebase.crashlytics.internal.metadata.EventMetadata;
import com.google.firebase.crashlytics.internal.metadata.LogFileManager;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.model.StaticSessionData;
import com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform;
import com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import com.google.firebase.crashlytics.internal.settings.Settings;
import com.google.firebase.crashlytics.internal.settings.SettingsController;
import com.google.firebase.sessions.api.CrashEventReceiver;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import ko.Zea.ealNNtLp;
import kotlin.jvm.internal.m;
import lf.j0;
import ry.s;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
class CrashlyticsController {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final b f18258r = new b(0);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Charset f18259s = Charset.forName(Constants.ENCODING);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f18260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DataCollectionArbiter f18261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CrashlyticsFileMarker f18262c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final UserMetadata f18263d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CrashlyticsWorkers f18264e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final IdManager f18265f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final FileStore f18266g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AppData f18267h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final LogFileManager f18268i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final CrashlyticsNativeComponent f18269j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final AnalyticsEventLogger f18270k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final CrashlyticsAppQualitySessionsSubscriber f18271l;
    public final SessionReportingCoordinator m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public CrashlyticsUncaughtExceptionHandler f18272n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final TaskCompletionSource f18273o = new TaskCompletionSource();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final TaskCompletionSource f18274p = new TaskCompletionSource();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final TaskCompletionSource f18275q = new TaskCompletionSource();

    /* JADX INFO: renamed from: com.google.firebase.crashlytics.internal.common.CrashlyticsController$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass1 implements CrashlyticsUncaughtExceptionHandler.CrashListener {
        public AnonymousClass1() {
        }

        public final void a(final SettingsController settingsController, final Thread thread, final Throwable th2) {
            final CrashlyticsController crashlyticsController = CrashlyticsController.this;
            synchronized (crashlyticsController) {
                Objects.toString(th2);
                thread.getName();
                CrashEventReceiver.a();
                final long jCurrentTimeMillis = System.currentTimeMillis();
                try {
                    Utils.a(crashlyticsController.f18264e.f18376a.b(new Callable<Task<Void>>() { // from class: com.google.firebase.crashlytics.internal.common.CrashlyticsController.2
                        @Override // java.util.concurrent.Callable
                        public final Task<Void> call() {
                            b bVar = CrashlyticsController.f18258r;
                            long j11 = jCurrentTimeMillis;
                            long j12 = j11 / 1000;
                            CrashlyticsController crashlyticsController2 = CrashlyticsController.this;
                            String strD = crashlyticsController2.d();
                            if (strD == null) {
                                return Tasks.forResult(null);
                            }
                            CrashlyticsFileMarker crashlyticsFileMarker = crashlyticsController2.f18262c;
                            crashlyticsFileMarker.getClass();
                            try {
                                FileStore fileStore = crashlyticsFileMarker.f18303b;
                                String str = crashlyticsFileMarker.f18302a;
                                fileStore.getClass();
                                new File(fileStore.f18882c, str).createNewFile();
                            } catch (IOException unused) {
                            }
                            SessionReportingCoordinator sessionReportingCoordinator = crashlyticsController2.m;
                            sessionReportingCoordinator.getClass();
                            sessionReportingCoordinator.e(th2, thread, "crash", new EventMetadata(s.f50855a, strD, j12), true);
                            crashlyticsController2.getClass();
                            try {
                                FileStore fileStore2 = crashlyticsController2.f18266g;
                                String str2 = ".ae" + j11;
                                fileStore2.getClass();
                                if (!new File(fileStore2.f18882c, str2).createNewFile()) {
                                    throw new IOException("Create new file failed.");
                                }
                            } catch (IOException unused2) {
                            }
                            SettingsController settingsController2 = settingsController;
                            crashlyticsController2.b(false, settingsController2, false);
                            crashlyticsController2.c(new CLSUUID().f18249a, Boolean.FALSE);
                            return !crashlyticsController2.f18261b.a() ? Tasks.forResult(null) : settingsController2.c().onSuccessTask(crashlyticsController2.f18264e.f18376a, new SuccessContinuation<Settings, Void>(strD) { // from class: com.google.firebase.crashlytics.internal.common.CrashlyticsController.2.1
                                @Override // com.google.android.gms.tasks.SuccessContinuation
                                public final Task<Void> then(Settings settings) {
                                    Settings settings2 = settings;
                                    CrashlyticsController crashlyticsController3 = CrashlyticsController.this;
                                    return settings2 == null ? Tasks.forResult(null) : Tasks.whenAll((Task<?>[]) new Task[]{CrashlyticsController.a(crashlyticsController3), crashlyticsController3.m.f(null, crashlyticsController3.f18264e.f18376a)});
                                }
                            });
                        }
                    }));
                } catch (TimeoutException | Exception unused) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.crashlytics.internal.common.CrashlyticsController$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass3 implements SuccessContinuation<Void, Boolean> {
        @Override // com.google.android.gms.tasks.SuccessContinuation
        public final Task<Boolean> then(Void r9) {
            return Tasks.forResult(Boolean.TRUE);
        }
    }

    public CrashlyticsController(Context context, IdManager idManager, DataCollectionArbiter dataCollectionArbiter, FileStore fileStore, CrashlyticsFileMarker crashlyticsFileMarker, AppData appData, UserMetadata userMetadata, LogFileManager logFileManager, SessionReportingCoordinator sessionReportingCoordinator, CrashlyticsNativeComponentDeferredProxy crashlyticsNativeComponentDeferredProxy, com.google.firebase.crashlytics.a aVar, CrashlyticsAppQualitySessionsSubscriber crashlyticsAppQualitySessionsSubscriber, CrashlyticsWorkers crashlyticsWorkers) {
        new AtomicBoolean(false);
        this.f18260a = context;
        this.f18265f = idManager;
        this.f18261b = dataCollectionArbiter;
        this.f18266g = fileStore;
        this.f18262c = crashlyticsFileMarker;
        this.f18267h = appData;
        this.f18263d = userMetadata;
        this.f18268i = logFileManager;
        this.f18269j = crashlyticsNativeComponentDeferredProxy;
        this.f18270k = aVar;
        this.f18271l = crashlyticsAppQualitySessionsSubscriber;
        this.m = sessionReportingCoordinator;
        this.f18264e = crashlyticsWorkers;
    }

    public static Task a(CrashlyticsController crashlyticsController) {
        Task taskCall;
        crashlyticsController.getClass();
        ArrayList arrayList = new ArrayList();
        FileStore fileStore = crashlyticsController.f18266g;
        for (File file : FileStore.e(fileStore.f18882c.listFiles(f18258r))) {
            try {
                final long j11 = Long.parseLong(file.getName().substring(3));
                try {
                    Class.forName("com.google.firebase.crash.FirebaseCrash");
                    taskCall = Tasks.forResult(null);
                } catch (ClassNotFoundException unused) {
                    taskCall = Tasks.call(new ScheduledThreadPoolExecutor(1), new Callable<Void>() { // from class: com.google.firebase.crashlytics.internal.common.CrashlyticsController.5
                        @Override // java.util.concurrent.Callable
                        public final Void call() {
                            Bundle bundle = new Bundle();
                            bundle.putInt("fatal", 1);
                            bundle.putLong("timestamp", j11);
                            CrashlyticsController.this.f18270k.b(bundle);
                            return null;
                        }
                    });
                }
                arrayList.add(taskCall);
            } catch (NumberFormatException unused2) {
                file.getName();
            }
            file.delete();
        }
        return Tasks.whenAll(arrayList);
    }

    public final void c(String str, Boolean bool) {
        Integer num;
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        Locale locale = Locale.US;
        IdManager idManager = this.f18265f;
        String str2 = idManager.f18334c;
        AppData appData = this.f18267h;
        StaticSessionData.AppData appDataB = StaticSessionData.AppData.b(str2, appData.f18235f, appData.f18236g, ((AutoValue_InstallIdProvider_InstallIds) idManager.c()).f18241a, (appData.f18233d != null ? DeliveryMechanism.APP_STORE : DeliveryMechanism.DEVELOPER).a(), appData.f18237h);
        String str3 = Build.VERSION.RELEASE;
        String str4 = Build.VERSION.CODENAME;
        StaticSessionData.OsData osDataA = StaticSessionData.OsData.a(CommonUtils.g());
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        long blockCount = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
        int iOrdinal = CommonUtils.Architecture.a().ordinal();
        String str5 = Build.MODEL;
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        long jA = CommonUtils.a(this.f18260a);
        boolean zF = CommonUtils.f();
        int iC = CommonUtils.c();
        String str6 = Build.MANUFACTURER;
        String str7 = Build.PRODUCT;
        this.f18269j.c(str, jCurrentTimeMillis, StaticSessionData.b(appDataB, osDataA, StaticSessionData.DeviceData.c(iOrdinal, iAvailableProcessors, jA, blockCount, zF, iC)));
        if (bool.booleanValue() && str != null) {
            this.f18263d.f(str);
        }
        this.f18268i.b(str);
        this.f18271l.d(str);
        SessionReportingCoordinator sessionReportingCoordinator = this.m;
        CrashlyticsReportDataCapture crashlyticsReportDataCapture = sessionReportingCoordinator.f18341a;
        CrashlyticsReport.Builder builderA = CrashlyticsReport.a();
        builderA.l("20.0.6");
        AppData appData2 = crashlyticsReportDataCapture.f18308c;
        builderA.h(appData2.f18230a);
        IdManager idManager2 = crashlyticsReportDataCapture.f18307b;
        builderA.i(((AutoValue_InstallIdProvider_InstallIds) idManager2.c()).f18241a);
        builderA.g(((AutoValue_InstallIdProvider_InstallIds) idManager2.c()).f18242b);
        builderA.f(((AutoValue_InstallIdProvider_InstallIds) idManager2.c()).f18243c);
        String str8 = appData2.f18235f;
        builderA.d(str8);
        String str9 = appData2.f18236g;
        builderA.e(str9);
        builderA.k(4);
        CrashlyticsReport.Session.Builder builderA2 = CrashlyticsReport.Session.a();
        builderA2.l(jCurrentTimeMillis);
        builderA2.j(str);
        builderA2.h(CrashlyticsReportDataCapture.f18305h);
        CrashlyticsReport.Session.Application.Builder builderA3 = CrashlyticsReport.Session.Application.a();
        builderA3.e(idManager2.f18334c);
        builderA3.g(str8);
        builderA3.d(str9);
        builderA3.f(((AutoValue_InstallIdProvider_InstallIds) idManager2.c()).f18241a);
        DevelopmentPlatformProvider developmentPlatformProvider = appData2.f18237h;
        builderA3.b(developmentPlatformProvider.a());
        builderA3.c(developmentPlatformProvider.b());
        builderA2.b(builderA3.a());
        CrashlyticsReport.Session.OperatingSystem.Builder builderA4 = CrashlyticsReport.Session.OperatingSystem.a();
        builderA4.d(3);
        builderA4.e(str3);
        builderA4.b(str4);
        builderA4.c(CommonUtils.g());
        builderA2.k(builderA4.a());
        StatFs statFs2 = new StatFs(Environment.getDataDirectory().getPath());
        String str10 = Build.CPU_ABI;
        int iIntValue = 7;
        if (!TextUtils.isEmpty(str10) && (num = (Integer) CrashlyticsReportDataCapture.f18304g.get(str10.toLowerCase(locale))) != null) {
            iIntValue = num.intValue();
        }
        int iAvailableProcessors2 = Runtime.getRuntime().availableProcessors();
        long jA2 = CommonUtils.a(crashlyticsReportDataCapture.f18306a);
        long blockCount2 = ((long) statFs2.getBlockCount()) * ((long) statFs2.getBlockSize());
        boolean zF2 = CommonUtils.f();
        int iC2 = CommonUtils.c();
        CrashlyticsReport.Session.Device.Builder builderA5 = CrashlyticsReport.Session.Device.a();
        builderA5.b(iIntValue);
        builderA5.f(str5);
        builderA5.c(iAvailableProcessors2);
        builderA5.h(jA2);
        builderA5.d(blockCount2);
        builderA5.i(zF2);
        builderA5.j(iC2);
        builderA5.e(str6);
        builderA5.g(str7);
        builderA2.e(builderA5.a());
        builderA2.i(3);
        builderA.m(builderA2.a());
        CrashlyticsReport crashlyticsReportA = builderA.a();
        FileStore fileStore = sessionReportingCoordinator.f18342b.f18877b;
        CrashlyticsReport.Session sessionM = crashlyticsReportA.m();
        if (sessionM == null) {
            return;
        }
        String strI = sessionM.i();
        try {
            CrashlyticsReportPersistence.f18873g.getClass();
            CrashlyticsReportPersistence.f(fileStore.b(strI, "report"), CrashlyticsReportJsonTransform.f18864a.b(crashlyticsReportA));
            File fileB = fileStore.b(strI, "start-time");
            long jK = sessionM.k();
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(fileB), CrashlyticsReportPersistence.f18871e);
            try {
                outputStreamWriter.write(BuildConfig.VERSION_NAME);
                fileB.setLastModified(jK * 1000);
                outputStreamWriter.close();
            } catch (Throwable th2) {
                try {
                    outputStreamWriter.close();
                    throw th2;
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                    throw th2;
                }
            }
        } catch (IOException unused) {
        }
    }

    public final String d() {
        NavigableSet navigableSetC = this.m.f18342b.c();
        if (navigableSetC.isEmpty()) {
            return null;
        }
        return (String) navigableSetC.first();
    }

    public final String e() throws IOException {
        Context context = this.f18260a;
        int iD = CommonUtils.d(context, "com.google.firebase.crashlytics.version_control_info", "string");
        String string = iD == 0 ? null : context.getResources().getString(iD);
        if (string != null) {
            return Base64.encodeToString(string.getBytes(f18259s), 0);
        }
        ClassLoader classLoader = getClass().getClassLoader();
        InputStream resourceAsStream = classLoader == null ? null : classLoader.getResourceAsStream("META-INF/version-control-info.textproto");
        if (resourceAsStream == null) {
            if (resourceAsStream != null) {
                resourceAsStream.close();
            }
            return null;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int i11 = resourceAsStream.read(bArr);
                    if (i11 == -1) {
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        byteArrayOutputStream.close();
                        String strEncodeToString = Base64.encodeToString(byteArray, 0);
                        resourceAsStream.close();
                        return strEncodeToString;
                    }
                    byteArrayOutputStream.write(bArr, 0, i11);
                    try {
                        resourceAsStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (Throwable th5) {
            resourceAsStream.close();
            throw th5;
        }
    }

    public final void f() {
        try {
            String strE = e();
            if (strE != null) {
                try {
                    this.f18263d.e(strE);
                } catch (IllegalArgumentException e8) {
                    Context context = this.f18260a;
                    if (context != null && (context.getApplicationInfo().flags & 2) != 0) {
                        throw e8;
                    }
                }
            }
        } catch (IOException unused) {
        }
    }

    public final void g(final Task task) {
        Task task2;
        Task taskA;
        TaskCompletionSource taskCompletionSource = this.f18273o;
        FileStore fileStore = this.m.f18342b.f18877b;
        if (FileStore.e(fileStore.f18884e.listFiles()).isEmpty() && FileStore.e(fileStore.f18885f.listFiles()).isEmpty() && FileStore.e(fileStore.f18886g.listFiles()).isEmpty()) {
            taskCompletionSource.trySetResult(Boolean.FALSE);
            return;
        }
        DataCollectionArbiter dataCollectionArbiter = this.f18261b;
        if (dataCollectionArbiter.a()) {
            taskCompletionSource.trySetResult(Boolean.FALSE);
            taskA = Tasks.forResult(Boolean.TRUE);
        } else {
            taskCompletionSource.trySetResult(Boolean.TRUE);
            synchronized (dataCollectionArbiter.f18319c) {
                task2 = dataCollectionArbiter.f18320d.getTask();
            }
            taskA = CrashlyticsTasks.a(task2.onSuccessTask(new AnonymousClass3()), this.f18274p.getTask());
        }
        taskA.onSuccessTask(this.f18264e.f18376a, new SuccessContinuation<Boolean, Void>() { // from class: com.google.firebase.crashlytics.internal.common.CrashlyticsController.4
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task<Void> then(Boolean bool) {
                Boolean bool2 = bool;
                boolean zBooleanValue = bool2.booleanValue();
                CrashlyticsController crashlyticsController = CrashlyticsController.this;
                if (zBooleanValue) {
                    boolean zBooleanValue2 = bool2.booleanValue();
                    DataCollectionArbiter dataCollectionArbiter2 = crashlyticsController.f18261b;
                    if (!zBooleanValue2) {
                        dataCollectionArbiter2.getClass();
                        throw new IllegalStateException("An invalid data collection token was used.");
                    }
                    dataCollectionArbiter2.f18323g.trySetResult(null);
                    return task.onSuccessTask(crashlyticsController.f18264e.f18376a, new SuccessContinuation<Settings, Void>() { // from class: com.google.firebase.crashlytics.internal.common.CrashlyticsController.4.1
                        @Override // com.google.android.gms.tasks.SuccessContinuation
                        public final Task<Void> then(Settings settings) {
                            if (settings == null) {
                                return Tasks.forResult(null);
                            }
                            AnonymousClass4 anonymousClass4 = AnonymousClass4.this;
                            CrashlyticsController crashlyticsController2 = CrashlyticsController.this;
                            CrashlyticsController crashlyticsController3 = CrashlyticsController.this;
                            CrashlyticsController.a(crashlyticsController2);
                            crashlyticsController3.m.f(null, crashlyticsController3.f18264e.f18376a);
                            crashlyticsController3.f18275q.trySetResult(null);
                            return Tasks.forResult(null);
                        }
                    });
                }
                FileStore fileStore2 = crashlyticsController.f18266g;
                Iterator it = FileStore.e(fileStore2.f18882c.listFiles(CrashlyticsController.f18258r)).iterator();
                while (it.hasNext()) {
                    ((File) it.next()).delete();
                }
                FileStore fileStore3 = crashlyticsController.m.f18342b.f18877b;
                CrashlyticsReportPersistence.a(FileStore.e(fileStore3.f18884e.listFiles()));
                CrashlyticsReportPersistence.a(FileStore.e(fileStore3.f18885f.listFiles()));
                CrashlyticsReportPersistence.a(FileStore.e(fileStore3.f18886g.listFiles()));
                crashlyticsController.f18275q.trySetResult(null);
                return Tasks.forResult(null);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0092  */
    /* JADX WARN: Code duplicated, block: B:76:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:93:0x034a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6, types: [int] */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r22v0, types: [boolean] */
    public final void b(boolean z11, SettingsController settingsController, boolean z12) {
        boolean z13;
        String str;
        String strSubstring;
        String str2;
        String[] list;
        ApplicationExitInfo next;
        String strC;
        List listUnmodifiableList;
        String str3 = "report";
        CrashlyticsNativeComponent crashlyticsNativeComponent = this.f18269j;
        FileStore fileStore = this.f18266g;
        CrashlyticsWorkers.a();
        SessionReportingCoordinator sessionReportingCoordinator = this.m;
        CrashlyticsReportPersistence crashlyticsReportPersistence = sessionReportingCoordinator.f18342b;
        CrashlyticsReportPersistence crashlyticsReportPersistence2 = sessionReportingCoordinator.f18342b;
        ArrayList arrayList = new ArrayList(crashlyticsReportPersistence.c());
        if (arrayList.size() <= z11) {
            return;
        }
        String str4 = (String) arrayList.get(z11 == true ? 1 : 0);
        if (z12 && settingsController.d().f18916b.f18922b && Build.VERSION.SDK_INT >= 30) {
            List<ApplicationExitInfo> historicalProcessExitReasons = ((ActivityManager) this.f18260a.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
            if (historicalProcessExitReasons.size() != 0) {
                LogFileManager logFileManager = new LogFileManager(fileStore);
                logFileManager.b(str4);
                UserMetadata userMetadataC = UserMetadata.c(str4, fileStore, this.f18264e);
                long jLastModified = crashlyticsReportPersistence2.f18877b.b(str4, "start-time").lastModified();
                Iterator<ApplicationExitInfo> it = historicalProcessExitReasons.iterator();
                do {
                    if (it.hasNext()) {
                        next = it.next();
                        if (next.getTimestamp() < jLastModified) {
                        }
                    }
                    next = null;
                    break;
                } while (next.getReason() != 6);
                if (next != null) {
                    CrashlyticsReportDataCapture crashlyticsReportDataCapture = sessionReportingCoordinator.f18341a;
                    try {
                        InputStream traceInputStream = next.getTraceInputStream();
                        strC = traceInputStream != null ? SessionReportingCoordinator.c(traceInputStream) : null;
                    } catch (IOException e8) {
                        next.toString();
                        e8.toString();
                    }
                    CrashlyticsReport.ApplicationExitInfo.Builder builderA = CrashlyticsReport.ApplicationExitInfo.a();
                    builderA.c(next.getImportance());
                    builderA.e(next.getProcessName());
                    builderA.g(next.getReason());
                    builderA.i(next.getTimestamp());
                    builderA.d(next.getPid());
                    builderA.f(next.getPss());
                    builderA.h(next.getRss());
                    builderA.j(strC);
                    CrashlyticsReport.ApplicationExitInfo applicationExitInfoA = builderA.a();
                    int i11 = crashlyticsReportDataCapture.f18306a.getResources().getConfiguration().orientation;
                    CrashlyticsReport.Session.Event.Builder builderA2 = CrashlyticsReport.Session.Event.a();
                    builderA2.g("anr");
                    builderA2.f(applicationExitInfoA.i());
                    AppData appData = crashlyticsReportDataCapture.f18308c;
                    if (!crashlyticsReportDataCapture.f18310e.d().f18916b.f18923c || appData.f18232c.size() <= 0) {
                        listUnmodifiableList = null;
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        ArrayList arrayList3 = appData.f18232c;
                        int size = arrayList3.size();
                        int i12 = 0;
                        while (i12 < size) {
                            Object obj = arrayList3.get(i12);
                            int i13 = i12 + 1;
                            BuildIdInfo buildIdInfo = (BuildIdInfo) obj;
                            CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.Builder builderA3 = CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.a();
                            builderA3.d(buildIdInfo.f18244a);
                            builderA3.b(buildIdInfo.f18245b);
                            builderA3.c(buildIdInfo.f18246c);
                            arrayList2.add(builderA3.a());
                            arrayList3 = arrayList3;
                            i12 = i13;
                        }
                        listUnmodifiableList = Collections.unmodifiableList(arrayList2);
                    }
                    CrashlyticsReport.ApplicationExitInfo.Builder builderA4 = CrashlyticsReport.ApplicationExitInfo.a();
                    builderA4.c(applicationExitInfoA.c());
                    builderA4.e(applicationExitInfoA.e());
                    builderA4.g(applicationExitInfoA.g());
                    builderA4.i(applicationExitInfoA.i());
                    builderA4.d(applicationExitInfoA.d());
                    builderA4.f(applicationExitInfoA.f());
                    builderA4.h(applicationExitInfoA.h());
                    builderA4.j(applicationExitInfoA.j());
                    builderA4.b(listUnmodifiableList);
                    CrashlyticsReport.ApplicationExitInfo applicationExitInfoA2 = builderA4.a();
                    boolean z14 = applicationExitInfoA2.c() != 100;
                    CrashlyticsReport.Session.Event.Application.Builder builderA5 = CrashlyticsReport.Session.Event.Application.a();
                    builderA5.c(Boolean.valueOf(z14));
                    ProcessDetailsProvider processDetailsProvider = crashlyticsReportDataCapture.f18311f;
                    String processName = applicationExitInfoA2.e();
                    int iD = applicationExitInfoA2.d();
                    int iC = applicationExitInfoA2.c();
                    processDetailsProvider.getClass();
                    m.f(processName, "processName");
                    builderA5.d(ProcessDetailsProvider.a(processDetailsProvider, processName, iD, iC, 8));
                    builderA5.h(i11);
                    CrashlyticsReport.Session.Event.Application.Execution.Builder builderA6 = CrashlyticsReport.Session.Event.Application.Execution.a();
                    builderA6.b(applicationExitInfoA2);
                    CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder builderA7 = CrashlyticsReport.Session.Event.Application.Execution.Signal.a();
                    String str5 = ealNNtLp.KkYJXfapr;
                    builderA7.d(str5);
                    builderA7.c(str5);
                    builderA7.b(0L);
                    builderA6.e(builderA7.a());
                    builderA6.c(crashlyticsReportDataCapture.a());
                    builderA5.f(builderA6.a());
                    builderA2.b(builderA5.a());
                    builderA2.c(crashlyticsReportDataCapture.b(i11));
                    crashlyticsReportPersistence2.d(SessionReportingCoordinator.b(SessionReportingCoordinator.a(builderA2.a(), logFileManager, userMetadataC, Collections.EMPTY_MAP), userMetadataC), str4, true);
                }
            }
        }
        if (z12 && crashlyticsNativeComponent.d(str4)) {
            crashlyticsNativeComponent.a(str4).getClass();
        }
        if (z11 != 0) {
            z13 = false;
            str = (String) arrayList.get(0);
        } else {
            z13 = false;
            this.f18271l.d(null);
            str = null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        FileStore fileStore2 = crashlyticsReportPersistence2.f18877b;
        fileStore2.a(".com.google.firebase.crashlytics");
        File file = fileStore2.f18883d;
        fileStore2.a(".com.google.firebase.crashlytics-ndk");
        if (!fileStore2.f18880a.isEmpty()) {
            fileStore2.a(".com.google.firebase.crashlytics.files.v1");
            final String str6 = ".com.google.firebase.crashlytics.files.v2" + File.pathSeparator;
            File file2 = fileStore2.f18881b;
            if (file2.exists() && (list = file2.list(new FilenameFilter() { // from class: lg.a
                @Override // java.io.FilenameFilter
                public final boolean accept(File file3, String str7) {
                    return str7.startsWith(str6);
                }
            })) != null) {
                int length = list.length;
                for (?? r11 = z13; r11 < length; r11++) {
                    fileStore2.a(list[r11]);
                }
            }
        }
        NavigableSet<String> navigableSetC = crashlyticsReportPersistence2.c();
        if (str != null) {
            navigableSetC.remove(str);
        }
        if (navigableSetC.size() > 8) {
            while (navigableSetC.size() > 8) {
                String str7 = (String) navigableSetC.last();
                FileStore.d(new File(file, str7));
                navigableSetC.remove(str7);
            }
        }
        for (String str8 : navigableSetC) {
            CrashlyticsReportJsonTransform crashlyticsReportJsonTransform = CrashlyticsReportPersistence.f18873g;
            j0 j0Var = CrashlyticsReportPersistence.f18875i;
            File file3 = new File(file, str8);
            file3.mkdirs();
            List<File> listE = FileStore.e(file3.listFiles(j0Var));
            if (listE.isEmpty()) {
                str2 = str3;
            } else {
                Collections.sort(listE);
                ArrayList arrayList4 = new ArrayList();
                boolean z15 = z13;
                for (File file4 : listE) {
                    try {
                        String strE = CrashlyticsReportPersistence.e(file4);
                        crashlyticsReportJsonTransform.getClass();
                        try {
                            JsonReader jsonReader = new JsonReader(new StringReader(strE));
                            try {
                                CrashlyticsReport.Session.Event eventE = CrashlyticsReportJsonTransform.e(jsonReader);
                                jsonReader.close();
                                arrayList4.add(eventE);
                                if (z15) {
                                    z15 = true;
                                } else {
                                    String name = file4.getName();
                                    if (name.startsWith("event") && name.endsWith("_")) {
                                        z15 = true;
                                    } else {
                                        z15 = false;
                                    }
                                }
                            } catch (Throwable th2) {
                                try {
                                    jsonReader.close();
                                } catch (Throwable th3) {
                                    th2.addSuppressed(th3);
                                }
                                throw th2;
                            }
                        } catch (IllegalStateException e10) {
                            throw new IOException(e10);
                        }
                    } catch (IOException unused) {
                        Objects.toString(file4);
                    }
                }
                if (arrayList4.isEmpty()) {
                    str2 = str3;
                } else {
                    String strD = UserMetadata.d(str8, fileStore2);
                    CrashlyticsAppQualitySessionsStore crashlyticsAppQualitySessionsStore = crashlyticsReportPersistence2.f18879d.f18257b;
                    synchronized (crashlyticsAppQualitySessionsStore) {
                        if (Objects.equals(crashlyticsAppQualitySessionsStore.f18254b, str8)) {
                            strSubstring = crashlyticsAppQualitySessionsStore.f18255c;
                        } else {
                            FileStore fileStore3 = crashlyticsAppQualitySessionsStore.f18253a;
                            b bVar = CrashlyticsAppQualitySessionsStore.f18251d;
                            File file5 = new File(fileStore3.f18883d, str8);
                            file5.mkdirs();
                            List listE2 = FileStore.e(file5.listFiles(bVar));
                            strSubstring = listE2.isEmpty() ? null : ((File) Collections.min(listE2, CrashlyticsAppQualitySessionsStore.f18252e)).getName().substring(4);
                        }
                    }
                    str2 = str3;
                    File fileB = fileStore2.b(str8, str2);
                    try {
                        String strE2 = CrashlyticsReportPersistence.e(fileB);
                        crashlyticsReportJsonTransform.getClass();
                        CrashlyticsReport crashlyticsReportO = CrashlyticsReportJsonTransform.i(strE2).p(jCurrentTimeMillis, strD, z15).o(strSubstring);
                        if (crashlyticsReportO.m() == null) {
                            throw new IllegalStateException("Reports without sessions cannot have events added to them.");
                        }
                        CrashlyticsReport.Builder builderN = crashlyticsReportO.n();
                        CrashlyticsReport.Session.Builder builderN2 = crashlyticsReportO.m().n();
                        builderN2.g(arrayList4);
                        builderN.m(builderN2.a());
                        CrashlyticsReport crashlyticsReportA = builderN.a();
                        CrashlyticsReport.Session sessionM = crashlyticsReportA.m();
                        if (sessionM != null) {
                            CrashlyticsReportPersistence.f(z15 ? new File(fileStore2.f18885f, sessionM.i()) : new File(fileStore2.f18884e, sessionM.i()), CrashlyticsReportJsonTransform.f18864a.b(crashlyticsReportA));
                        }
                    } catch (IOException unused2) {
                        Objects.toString(fileB);
                    }
                }
            }
            FileStore.d(new File(file, str8));
            str3 = str2;
            z13 = false;
        }
        Settings.SessionData sessionData = crashlyticsReportPersistence2.f18878c.d().f18915a;
        ArrayList arrayListB = crashlyticsReportPersistence2.b();
        int size2 = arrayListB.size();
        if (size2 <= 4) {
            return;
        }
        Iterator it2 = arrayListB.subList(4, size2).iterator();
        while (it2.hasNext()) {
            ((File) it2.next()).delete();
        }
    }
}
