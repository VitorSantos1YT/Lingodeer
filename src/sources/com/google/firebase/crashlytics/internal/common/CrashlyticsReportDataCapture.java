package com.google.firebase.crashlytics.internal.common;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.SensorManager;
import android.os.Environment;
import android.os.StatFs;
import com.google.firebase.crashlytics.internal.ProcessDetailsProvider;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.settings.SettingsController;
import com.google.firebase.crashlytics.internal.stacktrace.MiddleOutFallbackStrategy;
import com.google.firebase.crashlytics.internal.stacktrace.TrimmedThrowableData;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class CrashlyticsReportDataCapture {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final HashMap f18304g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f18305h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f18306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IdManager f18307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AppData f18308c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final MiddleOutFallbackStrategy f18309d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SettingsController f18310e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ProcessDetailsProvider f18311f = ProcessDetailsProvider.f18223a;

    static {
        HashMap map = new HashMap();
        f18304g = map;
        defpackage.e.z(5, map, "armeabi", 6, "armeabi-v7a");
        defpackage.e.z(9, map, "arm64-v8a", 0, "x86");
        map.put("x86_64", 1);
        Locale locale = Locale.US;
        f18305h = "Crashlytics Android SDK/20.0.6";
    }

    public CrashlyticsReportDataCapture(Context context, IdManager idManager, AppData appData, MiddleOutFallbackStrategy middleOutFallbackStrategy, SettingsController settingsController) {
        this.f18306a = context;
        this.f18307b = idManager;
        this.f18308c = appData;
        this.f18309d = middleOutFallbackStrategy;
        this.f18310e = settingsController;
    }

    public static CrashlyticsReport.Session.Event.Application.Execution.Exception c(TrimmedThrowableData trimmedThrowableData, int i11) {
        String str = trimmedThrowableData.f18951b;
        String str2 = trimmedThrowableData.f18950a;
        StackTraceElement[] stackTraceElementArr = trimmedThrowableData.f18952c;
        int i12 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        TrimmedThrowableData trimmedThrowableData2 = trimmedThrowableData.f18953d;
        if (i11 >= 8) {
            TrimmedThrowableData trimmedThrowableData3 = trimmedThrowableData2;
            while (trimmedThrowableData3 != null) {
                trimmedThrowableData3 = trimmedThrowableData3.f18953d;
                i12++;
            }
        }
        CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder builderA = CrashlyticsReport.Session.Event.Application.Execution.Exception.a();
        builderA.f(str);
        builderA.e(str2);
        builderA.c(d(stackTraceElementArr, 4));
        builderA.d(i12);
        if (trimmedThrowableData2 != null && i12 == 0) {
            builderA.b(c(trimmedThrowableData2, i11 + 1));
        }
        return builderA.a();
    }

    public static List d(StackTraceElement[] stackTraceElementArr, int i11) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder builderA = CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.a();
            builderA.c(i11);
            long lineNumber = 0;
            long jMax = stackTraceElement.isNativeMethod() ? Math.max(stackTraceElement.getLineNumber(), 0L) : 0L;
            String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
            String fileName = stackTraceElement.getFileName();
            if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
                lineNumber = stackTraceElement.getLineNumber();
            }
            builderA.e(jMax);
            builderA.f(str);
            builderA.b(fileName);
            builderA.d(lineNumber);
            arrayList.add(builderA.a());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public final List a() {
        CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder builderA = CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.a();
        builderA.b(0L);
        builderA.d(0L);
        AppData appData = this.f18308c;
        builderA.c(appData.f18234e);
        builderA.e(appData.f18231b);
        return Collections.singletonList(builderA.a());
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0041  */
    /* JADX WARN: Code duplicated, block: B:29:0x005f  */
    /* JADX WARN: Code duplicated, block: B:32:0x0066  */
    /* JADX WARN: Code duplicated, block: B:38:0x0096  */
    public final CrashlyticsReport.Session.Event.Device b(int i11) {
        boolean z11;
        Float fValueOf;
        long j11;
        Context context = this.f18306a;
        int i12 = 2;
        try {
            Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (intentRegisterReceiver != null) {
                int intExtra = intentRegisterReceiver.getIntExtra("status", -1);
                z11 = intExtra != -1 && (intExtra == 2 || intExtra == 5);
                try {
                    int intExtra2 = intentRegisterReceiver.getIntExtra("level", -1);
                    int intExtra3 = intentRegisterReceiver.getIntExtra("scale", -1);
                    if (intExtra2 != -1 && intExtra3 != -1) {
                        fValueOf = Float.valueOf(intExtra2 / intExtra3);
                    }
                } catch (IllegalStateException unused) {
                }
                Double dValueOf = fValueOf != null ? Double.valueOf(fValueOf.doubleValue()) : null;
                if (z11 || fValueOf == null) {
                    i12 = 1;
                } else if (fValueOf.floatValue() >= 0.99d) {
                    i12 = 3;
                }
                boolean z12 = CommonUtils.f() && ((SensorManager) context.getSystemService("sensor")).getDefaultSensor(8) != null;
                long jA = CommonUtils.a(context);
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
                j11 = jA - memoryInfo.availMem;
                if (j11 <= 0) {
                    j11 = 0;
                }
                StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
                long blockSize = statFs.getBlockSize();
                long blockCount = (((long) statFs.getBlockCount()) * blockSize) - (blockSize * ((long) statFs.getAvailableBlocks()));
                CrashlyticsReport.Session.Event.Device.Builder builderA = CrashlyticsReport.Session.Event.Device.a();
                builderA.b(dValueOf);
                builderA.c(i12);
                builderA.f(z12);
                builderA.e(i11);
                builderA.g(j11);
                builderA.d(blockCount);
                return builderA.a();
            }
            z11 = false;
        } catch (IllegalStateException unused2) {
        }
        fValueOf = null;
        if (fValueOf != null) {
        }
        if (z11) {
            i12 = 1;
        } else {
            i12 = 1;
        }
        if (CommonUtils.f()) {
        }
        long jA2 = CommonUtils.a(context);
        ActivityManager.MemoryInfo memoryInfo2 = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo2);
        j11 = jA2 - memoryInfo2.availMem;
        if (j11 <= 0) {
            j11 = 0;
        }
        StatFs statFs2 = new StatFs(Environment.getDataDirectory().getPath());
        long blockSize2 = statFs2.getBlockSize();
        long blockCount2 = (((long) statFs2.getBlockCount()) * blockSize2) - (blockSize2 * ((long) statFs2.getAvailableBlocks()));
        CrashlyticsReport.Session.Event.Device.Builder builderA2 = CrashlyticsReport.Session.Event.Device.a();
        builderA2.b(dValueOf);
        builderA2.c(i12);
        builderA2.f(z12);
        builderA2.e(i11);
        builderA2.g(j11);
        builderA2.d(blockCount2);
        return builderA2.a();
    }
}
