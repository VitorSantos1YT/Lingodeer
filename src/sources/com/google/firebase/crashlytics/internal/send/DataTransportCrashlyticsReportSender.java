package com.google.firebase.crashlytics.internal.send;

import android.content.Context;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.Transformer;
import com.google.android.datatransport.TransportFactory;
import com.google.android.datatransport.cct.CCTDestination;
import com.google.android.datatransport.runtime.TransportRuntime;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId;
import com.google.firebase.crashlytics.internal.common.OnDemandCounter;
import com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform;
import com.google.firebase.crashlytics.internal.send.ReportQueue.ReportRunnable;
import com.google.firebase.crashlytics.internal.settings.SettingsController;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class DataTransportCrashlyticsReportSender {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final CrashlyticsReportJsonTransform f18887c = new CrashlyticsReportJsonTransform();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f18888d = c("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f18889e = c("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c3.a f18890f = new c3.a(24);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReportQueue f18891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Transformer f18892b;

    public DataTransportCrashlyticsReportSender(ReportQueue reportQueue, Transformer transformer) {
        this.f18891a = reportQueue;
        this.f18892b = transformer;
    }

    public static DataTransportCrashlyticsReportSender a(Context context, SettingsController settingsController, OnDemandCounter onDemandCounter) {
        TransportRuntime.b(context);
        TransportFactory transportFactoryC = TransportRuntime.a().c(new CCTDestination(f18888d, f18889e));
        Encoding encoding = new Encoding("json");
        c3.a aVar = f18890f;
        return new DataTransportCrashlyticsReportSender(new ReportQueue(transportFactoryC.b("FIREBASE_CRASHLYTICS_REPORT", encoding, aVar), settingsController.d(), onDemandCounter), aVar);
    }

    public static String c(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb2 = new StringBuilder(str2.length() + str.length());
        for (int i11 = 0; i11 < str.length(); i11++) {
            sb2.append(str.charAt(i11));
            if (str2.length() > i11) {
                sb2.append(str2.charAt(i11));
            }
        }
        return sb2.toString();
    }

    public final Task b(CrashlyticsReportWithSessionId crashlyticsReportWithSessionId, boolean z11) {
        TaskCompletionSource taskCompletionSource;
        ReportQueue reportQueue = this.f18891a;
        synchronized (reportQueue.f18898f) {
            try {
                taskCompletionSource = new TaskCompletionSource();
                if (z11) {
                    reportQueue.f18901i.f18339a.getAndIncrement();
                    if (reportQueue.f18898f.size() < reportQueue.f18897e) {
                        reportQueue.f18898f.size();
                        reportQueue.f18899g.execute(reportQueue.new ReportRunnable(crashlyticsReportWithSessionId, taskCompletionSource));
                        taskCompletionSource.trySetResult(crashlyticsReportWithSessionId);
                    } else {
                        reportQueue.a();
                        reportQueue.f18901i.f18340b.getAndIncrement();
                        taskCompletionSource.trySetResult(crashlyticsReportWithSessionId);
                    }
                } else {
                    reportQueue.b(crashlyticsReportWithSessionId, taskCompletionSource);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return taskCompletionSource.getTask();
    }
}
