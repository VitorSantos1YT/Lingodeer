package fb;

import android.content.Context;
import androidx.work.WorkerParameters;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile l f27100c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f27098a = new l();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f27099b = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final l f27101d = new l();

    public static l b() {
        l lVar;
        synchronized (f27099b) {
            try {
                if (f27100c == null) {
                    f27100c = new l();
                }
                lVar = f27100c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return lVar;
    }

    public static String c(String str) {
        int length = str.length();
        StringBuilder sb2 = new StringBuilder(23);
        sb2.append("WM-");
        if (length >= 20) {
            sb2.append(str.substring(0, 20));
        } else {
            sb2.append(str);
        }
        return sb2.toString();
    }

    public v a(Context appContext, String workerClassName, WorkerParameters workerParameters) {
        kotlin.jvm.internal.m.f(appContext, "appContext");
        kotlin.jvm.internal.m.f(workerClassName, "workerClassName");
        kotlin.jvm.internal.m.f(workerParameters, "workerParameters");
        try {
            Class<? extends U> clsAsSubclass = Class.forName(workerClassName).asSubclass(v.class);
            kotlin.jvm.internal.m.e(clsAsSubclass, "{\n                Class.…class.java)\n            }");
            try {
                Object objNewInstance = clsAsSubclass.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(appContext, workerParameters);
                kotlin.jvm.internal.m.e(objNewInstance, "{\n                val co…Parameters)\n            }");
                v vVar = (v) objNewInstance;
                if (!vVar.f27113d) {
                    return vVar;
                }
                throw new IllegalStateException("WorkerFactory (" + getClass().getName() + ") returned an instance of a ListenableWorker (" + workerClassName + ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.");
            } catch (Throwable th2) {
                l lVarB = b();
                int i11 = i0.f27094a;
                lVarB.getClass();
                throw th2;
            }
        } catch (Throwable th3) {
            l lVarB2 = b();
            int i12 = i0.f27094a;
            lVarB2.getClass();
            throw th3;
        }
    }
}
