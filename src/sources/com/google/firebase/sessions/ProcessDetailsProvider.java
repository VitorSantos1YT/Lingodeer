package com.google.firebase.sessions;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import com.google.android.gms.common.util.ProcessUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.m;
import ry.n;
import ry.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class ProcessDetailsProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ProcessDetailsProvider f20927a = new ProcessDetailsProvider();

    private ProcessDetailsProvider() {
    }

    public static ArrayList a(Context context) {
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
            String processName = runningAppProcessInfo.processName;
            m.e(processName, "processName");
            arrayList2.add(new ProcessDetails(runningAppProcessInfo.pid, m.a(runningAppProcessInfo.processName, str), runningAppProcessInfo.importance, processName));
        }
        return arrayList2;
    }

    public static ProcessDetails b(Context context) {
        Object obj;
        String strA;
        m.f(context, "context");
        int iMyPid = Process.myPid();
        ArrayList arrayListA = a(context);
        int size = arrayListA.size();
        int i11 = 0;
        do {
            if (i11 >= size) {
                obj = null;
                break;
            }
            obj = arrayListA.get(i11);
            i11++;
        } while (((ProcessDetails) obj).f20924b != iMyPid);
        ProcessDetails processDetails = (ProcessDetails) obj;
        if (processDetails != null) {
            return processDetails;
        }
        int i12 = Build.VERSION.SDK_INT;
        if (i12 > 33) {
            strA = Process.myProcessName();
            m.e(strA, "myProcessName(...)");
        } else if ((i12 < 28 || (strA = Application.getProcessName()) == null) && (strA = ProcessUtils.a()) == null) {
            strA = com.tbruyelle.rxpermissions3.BuildConfig.VERSION_NAME;
        }
        return new ProcessDetails(iMyPid, false, 0, strA);
    }
}
