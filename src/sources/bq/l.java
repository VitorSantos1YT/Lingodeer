package bq;

import java.util.concurrent.ScheduledFuture;
import java.util.logging.Level;
import java.util.logging.Logger;
import mw.i4;
import mw.m2;
import mw.y2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class l implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f4952b;

    public /* synthetic */ l(Object obj, int i11) {
        this.f4951a = i11;
        this.f4952b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0082  */
    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th2) {
        String string;
        switch (this.f4951a) {
            case 0:
                kotlin.jvm.internal.m.f(thread, "thread");
                if (th2 != null) {
                    StackTraceElement[] stackTrace = th2.getStackTrace();
                    kotlin.jvm.internal.m.e(stackTrace, "getStackTrace(...)");
                    if (stackTrace.length == 0) {
                        string = null;
                    } else {
                        string = th2.getStackTrace()[0].toString();
                    }
                } else {
                    string = null;
                }
                if (string != null) {
                    if ((th2 != null ? th2.getMessage() : null) != null) {
                        String message = th2.getMessage();
                        kotlin.jvm.internal.m.c(message);
                        if (oz.q.v0(message, "Results have already been set", false) && oz.q.v0(string, "com.google.android.gms.tagmanager", false)) {
                        }
                    }
                }
                if (th2 != null) {
                    ((Thread.UncaughtExceptionHandler) this.f4952b).uncaughtException(thread, th2);
                }
                break;
            default:
                Logger logger = y2.f42807c0;
                Level level = Level.SEVERE;
                StringBuilder sb2 = new StringBuilder("[");
                y2 y2Var = (y2) this.f4952b;
                sb2.append(y2Var.f42814a);
                sb2.append("] Uncaught exception in the SynchronizationContext. Panic!");
                logger.log(level, sb2.toString(), th2);
                if (!y2Var.f42840z) {
                    y2Var.f42840z = true;
                    i4 i4Var = y2Var.f42817b0;
                    i4Var.f42468f = false;
                    ScheduledFuture scheduledFuture = i4Var.f42469g;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                        i4Var.f42469g = null;
                    }
                    y2Var.k(false);
                    m2 m2Var = new m2(th2);
                    y2Var.f42839y = m2Var;
                    y2Var.E.g(m2Var);
                    y2Var.P.h(null);
                    y2Var.N.h(lw.e.ERROR, "PANIC! Entering TRANSIENT_FAILURE");
                    y2Var.f42832r.c(lw.n.TRANSIENT_FAILURE);
                    break;
                }
                break;
        }
    }
}
