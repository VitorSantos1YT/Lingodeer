package of;

import android.app.ActivityManager;
import android.os.Looper;
import android.os.Process;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.internal.m;
import ob.f;
import org.json.JSONArray;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f44903a = Process.myUid();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ScheduledExecutorService f44904b = Executors.newSingleThreadScheduledExecutor();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String f44905c = BuildConfig.VERSION_NAME;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final cf.c f44906d = new cf.c(11);

    public static final void a(ActivityManager activityManager) {
        if (qf.a.b(a.class)) {
            return;
        }
        try {
            List<ActivityManager.ProcessErrorStateInfo> processesInErrorState = activityManager.getProcessesInErrorState();
            if (processesInErrorState != null) {
                for (ActivityManager.ProcessErrorStateInfo processErrorStateInfo : processesInErrorState) {
                    if (processErrorStateInfo.condition == 2 && processErrorStateInfo.uid == f44903a) {
                        Thread thread = Looper.getMainLooper().getThread();
                        m.e(thread, "getMainLooper().thread");
                        StackTraceElement[] stackTrace = thread.getStackTrace();
                        JSONArray jSONArray = new JSONArray();
                        m.e(stackTrace, "stackTrace");
                        for (StackTraceElement stackTraceElement : stackTrace) {
                            jSONArray.put(stackTraceElement.toString());
                        }
                        String string = jSONArray.toString();
                        if (!m.a(string, f44905c) && f.C(thread)) {
                            f44905c = string;
                            o00.a.d(processErrorStateInfo.shortMsg, string).b();
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            qf.a.a(a.class, th2);
        }
    }
}
