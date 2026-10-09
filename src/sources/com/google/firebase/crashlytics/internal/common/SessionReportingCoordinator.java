package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.internal.ProcessDetailsProvider;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers;
import com.google.firebase.crashlytics.internal.metadata.EventMetadata;
import com.google.firebase.crashlytics.internal.metadata.LogFileManager;
import com.google.firebase.crashlytics.internal.metadata.RolloutAssignment;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform;
import com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence;
import com.google.firebase.crashlytics.internal.send.DataTransportCrashlyticsReportSender;
import com.google.firebase.crashlytics.internal.stacktrace.MiddleOutFallbackStrategy;
import com.google.firebase.crashlytics.internal.stacktrace.TrimmedThrowableData;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Stack;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class SessionReportingCoordinator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CrashlyticsReportDataCapture f18341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CrashlyticsReportPersistence f18342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DataTransportCrashlyticsReportSender f18343c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LogFileManager f18344d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final UserMetadata f18345e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final IdManager f18346f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final CrashlyticsWorkers f18347g;

    public SessionReportingCoordinator(CrashlyticsReportDataCapture crashlyticsReportDataCapture, CrashlyticsReportPersistence crashlyticsReportPersistence, DataTransportCrashlyticsReportSender dataTransportCrashlyticsReportSender, LogFileManager logFileManager, UserMetadata userMetadata, IdManager idManager, CrashlyticsWorkers crashlyticsWorkers) {
        this.f18341a = crashlyticsReportDataCapture;
        this.f18342b = crashlyticsReportPersistence;
        this.f18343c = dataTransportCrashlyticsReportSender;
        this.f18344d = logFileManager;
        this.f18345e = userMetadata;
        this.f18346f = idManager;
        this.f18347g = crashlyticsWorkers;
    }

    public static CrashlyticsReport.Session.Event a(CrashlyticsReport.Session.Event event, LogFileManager logFileManager, UserMetadata userMetadata, Map map) {
        CrashlyticsReport.Session.Event.Builder builderH = event.h();
        String strA = logFileManager.a();
        if (strA != null) {
            CrashlyticsReport.Session.Event.Log.Builder builderA = CrashlyticsReport.Session.Event.Log.a();
            builderA.b(strA);
            builderH.d(builderA.a());
        }
        List listD = d(userMetadata.a(map));
        List listD2 = d(userMetadata.b());
        if (!listD.isEmpty() || !listD2.isEmpty()) {
            CrashlyticsReport.Session.Event.Application.Builder builderI = event.b().i();
            builderI.e(listD);
            builderI.g(listD2);
            builderH.b(builderI.a());
        }
        return builderH.a();
    }

    public static CrashlyticsReport.Session.Event b(CrashlyticsReport.Session.Event event, UserMetadata userMetadata) {
        List listA = userMetadata.f18436f.a();
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < listA.size(); i11++) {
            RolloutAssignment rolloutAssignment = (RolloutAssignment) listA.get(i11);
            rolloutAssignment.getClass();
            CrashlyticsReport.Session.Event.RolloutAssignment.Builder builderA = CrashlyticsReport.Session.Event.RolloutAssignment.a();
            CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant.Builder builderA2 = CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant.a();
            builderA2.c(rolloutAssignment.f());
            builderA2.b(rolloutAssignment.d());
            builderA.d(builderA2.a());
            builderA.b(rolloutAssignment.b());
            builderA.c(rolloutAssignment.c());
            builderA.e(rolloutAssignment.e());
            arrayList.add(builderA.a());
        }
        if (arrayList.isEmpty()) {
            return event;
        }
        CrashlyticsReport.Session.Event.Builder builderH = event.h();
        CrashlyticsReport.Session.Event.RolloutsState.Builder builderA3 = CrashlyticsReport.Session.Event.RolloutsState.a();
        builderA3.b(arrayList);
        builderH.e(builderA3.a());
        return builderH.a();
    }

    public static String c(InputStream inputStream) throws IOException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[OSSConstants.DEFAULT_BUFFER_SIZE];
                while (true) {
                    int i11 = bufferedInputStream.read(bArr);
                    if (i11 == -1) {
                        String string = byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
                        byteArrayOutputStream.close();
                        bufferedInputStream.close();
                        return string;
                    }
                    byteArrayOutputStream.write(bArr, 0, i11);
                    try {
                        bufferedInputStream.close();
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
            bufferedInputStream.close();
            throw th5;
        }
    }

    public static List d(Map map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry entry : map.entrySet()) {
            CrashlyticsReport.CustomAttribute.Builder builderA = CrashlyticsReport.CustomAttribute.a();
            builderA.b((String) entry.getKey());
            builderA.c((String) entry.getValue());
            arrayList.add(builderA.a());
        }
        Collections.sort(arrayList, new a(1));
        return Collections.unmodifiableList(arrayList);
    }

    public final void e(Throwable th2, Thread thread, String str, EventMetadata eventMetadata, boolean z11) {
        boolean zEquals = str.equals("crash");
        long j11 = eventMetadata.f18396b;
        CrashlyticsReportDataCapture crashlyticsReportDataCapture = this.f18341a;
        Context context = crashlyticsReportDataCapture.f18306a;
        int i11 = context.getResources().getConfiguration().orientation;
        MiddleOutFallbackStrategy middleOutFallbackStrategy = crashlyticsReportDataCapture.f18309d;
        Stack stack = new Stack();
        for (Throwable cause = th2; cause != null; cause = cause.getCause()) {
            stack.push(cause);
        }
        TrimmedThrowableData trimmedThrowableData = null;
        while (!stack.isEmpty()) {
            Throwable th3 = (Throwable) stack.pop();
            trimmedThrowableData = new TrimmedThrowableData(th3.getLocalizedMessage(), th3.getClass().getName(), middleOutFallbackStrategy.a(th3.getStackTrace()), trimmedThrowableData);
        }
        CrashlyticsReport.Session.Event.Builder builderA = CrashlyticsReport.Session.Event.a();
        builderA.g(str);
        builderA.f(j11);
        CrashlyticsReport.Session.Event.Application.ProcessDetails processDetailsC = crashlyticsReportDataCapture.f18311f.c(context);
        Boolean boolValueOf = processDetailsC.b() > 0 ? Boolean.valueOf(processDetailsC.b() != 100) : null;
        CrashlyticsReport.Session.Event.Application.Builder builderA2 = CrashlyticsReport.Session.Event.Application.a();
        builderA2.c(boolValueOf);
        builderA2.d(processDetailsC);
        builderA2.b(ProcessDetailsProvider.b(context));
        builderA2.h(i11);
        CrashlyticsReport.Session.Event.Application.Execution.Builder builderA3 = CrashlyticsReport.Session.Event.Application.Execution.a();
        ArrayList arrayList = new ArrayList();
        StackTraceElement[] stackTraceElementArr = trimmedThrowableData.f18952c;
        CrashlyticsReport.Session.Event.Application.Execution.Thread.Builder builderA4 = CrashlyticsReport.Session.Event.Application.Execution.Thread.a();
        builderA4.d(thread.getName());
        builderA4.c(4);
        builderA4.b(CrashlyticsReportDataCapture.d(stackTraceElementArr, 4));
        arrayList.add(builderA4.a());
        if (z11) {
            for (Map.Entry<Thread, StackTraceElement[]> entry : Thread.getAllStackTraces().entrySet()) {
                Thread key = entry.getKey();
                if (!key.equals(thread)) {
                    StackTraceElement[] stackTraceElementArrA = middleOutFallbackStrategy.a(entry.getValue());
                    CrashlyticsReport.Session.Event.Application.Execution.Thread.Builder builderA5 = CrashlyticsReport.Session.Event.Application.Execution.Thread.a();
                    builderA5.d(key.getName());
                    builderA5.c(0);
                    builderA5.b(CrashlyticsReportDataCapture.d(stackTraceElementArrA, 0));
                    arrayList.add(builderA5.a());
                }
            }
        }
        builderA3.f(Collections.unmodifiableList(arrayList));
        builderA3.d(CrashlyticsReportDataCapture.c(trimmedThrowableData, 0));
        CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder builderA6 = CrashlyticsReport.Session.Event.Application.Execution.Signal.a();
        builderA6.d("0");
        builderA6.c("0");
        builderA6.b(0L);
        builderA3.e(builderA6.a());
        builderA3.c(crashlyticsReportDataCapture.a());
        builderA2.f(builderA3.a());
        builderA.b(builderA2.a());
        builderA.c(crashlyticsReportDataCapture.b(i11));
        CrashlyticsReport.Session.Event eventA = builderA.a();
        Map map = eventMetadata.f18397c;
        LogFileManager logFileManager = this.f18344d;
        UserMetadata userMetadata = this.f18345e;
        CrashlyticsReport.Session.Event eventB = b(a(eventA, logFileManager, userMetadata, map), userMetadata);
        if (z11) {
            this.f18342b.d(eventB, eventMetadata.f18395a, zEquals);
        } else {
            this.f18347g.f18377b.a(new i(this, eventB, eventMetadata, zEquals));
        }
    }

    public final Task f(String str, Executor executor) {
        ArrayList arrayListB = this.f18342b.b();
        ArrayList arrayList = new ArrayList();
        int size = arrayListB.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayListB.get(i11);
            i11++;
            File file = (File) obj;
            try {
                CrashlyticsReportJsonTransform crashlyticsReportJsonTransform = CrashlyticsReportPersistence.f18873g;
                String strE = CrashlyticsReportPersistence.e(file);
                crashlyticsReportJsonTransform.getClass();
                arrayList.add(new AutoValue_CrashlyticsReportWithSessionId(CrashlyticsReportJsonTransform.i(strE), file.getName(), file));
            } catch (IOException unused) {
                Objects.toString(file);
                file.delete();
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int size2 = arrayList.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj2 = arrayList.get(i12);
            i12++;
            CrashlyticsReportWithSessionId autoValue_CrashlyticsReportWithSessionId = (CrashlyticsReportWithSessionId) obj2;
            if (str == null || str.equals(autoValue_CrashlyticsReportWithSessionId.c())) {
                if (autoValue_CrashlyticsReportWithSessionId.a().g() == null || autoValue_CrashlyticsReportWithSessionId.a().f() == null) {
                    FirebaseInstallationId firebaseInstallationIdB = this.f18346f.b(true);
                    CrashlyticsReport crashlyticsReportA = autoValue_CrashlyticsReportWithSessionId.a();
                    String str2 = firebaseInstallationIdB.f18328a;
                    CrashlyticsReport.Builder builderN = crashlyticsReportA.n();
                    builderN.g(str2);
                    CrashlyticsReport crashlyticsReportA2 = builderN.a();
                    String str3 = firebaseInstallationIdB.f18329b;
                    CrashlyticsReport.Builder builderN2 = crashlyticsReportA2.n();
                    builderN2.f(str3);
                    autoValue_CrashlyticsReportWithSessionId = new AutoValue_CrashlyticsReportWithSessionId(builderN2.a(), autoValue_CrashlyticsReportWithSessionId.c(), autoValue_CrashlyticsReportWithSessionId.b());
                }
                arrayList2.add(this.f18343c.b(autoValue_CrashlyticsReportWithSessionId, str != null).continueWith(executor, new j()));
            }
        }
        return Tasks.whenAll(arrayList2);
    }
}
