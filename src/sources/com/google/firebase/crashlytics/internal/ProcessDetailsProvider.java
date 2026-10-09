package com.google.firebase.crashlytics.internal;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.m;
import ry.n;
import ry.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class ProcessDetailsProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ProcessDetailsProvider f18223a = new ProcessDetailsProvider();

    private ProcessDetailsProvider() {
    }

    public static CrashlyticsReport.Session.Event.Application.ProcessDetails a(ProcessDetailsProvider processDetailsProvider, String str, int i11, int i12, int i13) {
        if ((i13 & 4) != 0) {
            i12 = 0;
        }
        processDetailsProvider.getClass();
        CrashlyticsReport.Session.Event.Application.ProcessDetails.Builder builderA = CrashlyticsReport.Session.Event.Application.ProcessDetails.a();
        builderA.e(str);
        builderA.d(i11);
        builderA.c(i12);
        builderA.b(false);
        return builderA.a();
    }

    public static ArrayList b(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        m.f(context, "context");
        int i11 = context.getApplicationInfo().uid;
        String str = context.getApplicationInfo().processName;
        Object systemService = context.getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        if (activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
            runningAppProcesses = r.f50854a;
        }
        ArrayList arrayListO0 = ry.m.o0(runningAppProcesses);
        ArrayList arrayList = new ArrayList();
        int size = arrayListO0.size();
        int i12 = 0;
        int i13 = 0;
        while (i13 < size) {
            Object obj = arrayListO0.get(i13);
            i13++;
            if (((ActivityManager.RunningAppProcessInfo) obj).uid == i11) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(n.W(arrayList, 10));
        int size2 = arrayList.size();
        while (i12 < size2) {
            Object obj2 = arrayList.get(i12);
            i12++;
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) obj2;
            CrashlyticsReport.Session.Event.Application.ProcessDetails.Builder builderA = CrashlyticsReport.Session.Event.Application.ProcessDetails.a();
            builderA.e(runningAppProcessInfo.processName);
            builderA.d(runningAppProcessInfo.pid);
            builderA.c(runningAppProcessInfo.importance);
            builderA.b(m.a(runningAppProcessInfo.processName, str));
            arrayList2.add(builderA.a());
        }
        return arrayList2;
    }

    public final CrashlyticsReport.Session.Event.Application.ProcessDetails c(Context context) {
        Object obj;
        String processName;
        m.f(context, "context");
        int iMyPid = Process.myPid();
        ArrayList arrayListB = b(context);
        int size = arrayListB.size();
        int i11 = 0;
        do {
            if (i11 >= size) {
                obj = null;
                break;
            }
            obj = arrayListB.get(i11);
            i11++;
        } while (((CrashlyticsReport.Session.Event.Application.ProcessDetails) obj).c() != iMyPid);
        CrashlyticsReport.Session.Event.Application.ProcessDetails processDetails = (CrashlyticsReport.Session.Event.Application.ProcessDetails) obj;
        if (processDetails != null) {
            return processDetails;
        }
        int i12 = Build.VERSION.SDK_INT;
        if (i12 > 33) {
            processName = Process.myProcessName();
            m.c(processName);
        } else if (i12 < 28 || (processName = Application.getProcessName()) == null) {
            processName = BuildConfig.VERSION_NAME;
        }
        return a(this, processName, iMyPid, 0, 12);
    }
}
