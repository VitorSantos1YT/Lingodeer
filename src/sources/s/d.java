package s;

import a2.l;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import qx.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f50984b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ExecutorService f50985c = Executors.newFixedThreadPool(4, new c());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile Handler f50986d;

    public static Handler M(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return l.e(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }

    public final boolean N() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }
}
