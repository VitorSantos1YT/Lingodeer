package pb;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import fb.g0;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i {
    static {
        kotlin.jvm.internal.m.e(fb.l.c("ProcessUtils"), "tagWithPrefix(\"ProcessUtils\")");
    }

    public static final boolean a(Context context, fb.c configuration) {
        String strB;
        Object next;
        kotlin.jvm.internal.m.f(context, "context");
        kotlin.jvm.internal.m.f(configuration, "configuration");
        if (Build.VERSION.SDK_INT >= 28) {
            strB = a.b();
        } else {
            strB = null;
            try {
                Method declaredMethod = Class.forName("android.app.ActivityThread", false, g0.class.getClassLoader()).getDeclaredMethod("currentProcessName", null);
                declaredMethod.setAccessible(true);
                Object objInvoke = declaredMethod.invoke(null, null);
                kotlin.jvm.internal.m.c(objInvoke);
                if (objInvoke instanceof String) {
                    strB = (String) objInvoke;
                } else {
                    int iMyPid = Process.myPid();
                    Object systemService = context.getSystemService("activity");
                    kotlin.jvm.internal.m.d(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
                    List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) systemService).getRunningAppProcesses();
                    if (runningAppProcesses != null) {
                        Iterator<T> it = runningAppProcesses.iterator();
                        do {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                        } while (((ActivityManager.RunningAppProcessInfo) next).pid != iMyPid);
                        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) next;
                        if (runningAppProcessInfo != null) {
                            strB = runningAppProcessInfo.processName;
                        }
                    }
                }
            } catch (Throwable unused) {
                fb.l.b().getClass();
            }
        }
        return kotlin.jvm.internal.m.a(strB, context.getApplicationInfo().processName);
    }
}
