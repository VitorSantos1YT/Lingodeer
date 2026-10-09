package pb;

import aj.uZCn.evRpcb;
import android.content.Context;
import android.os.PowerManager;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f46748a = 0;

    public static final PowerManager.WakeLock a(Context context, String tag) {
        kotlin.jvm.internal.m.f(context, "context");
        kotlin.jvm.internal.m.f(tag, "tag");
        Object systemService = context.getApplicationContext().getSystemService("power");
        kotlin.jvm.internal.m.d(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        String strConcat = "WorkManager: ".concat(tag);
        PowerManager.WakeLock wakeLock = ((PowerManager) systemService).newWakeLock(1, strConcat);
        synchronized (m.f46749a) {
        }
        kotlin.jvm.internal.m.e(wakeLock, "wakeLock");
        return wakeLock;
    }

    static {
        kotlin.jvm.internal.m.e(fb.l.c(evRpcb.aXbHbzAh), "tagWithPrefix(\"WakeLocks\")");
    }
}
