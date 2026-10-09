package mw;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class a3 extends WeakReference {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final boolean f42332f = Boolean.parseBoolean(System.getProperty("io.grpc.ManagedChannel.enableAllocationTracking", "true"));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final RuntimeException f42333g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReferenceQueue f42334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentMap f42335b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f42336c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SoftReference f42337d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f42338e;

    static {
        RuntimeException runtimeException = new RuntimeException("ManagedChannel allocation site not recorded.  Set -Dio.grpc.ManagedChannel.enableAllocationTracking=true to enable it");
        runtimeException.setStackTrace(new StackTraceElement[0]);
        f42333g = runtimeException;
    }

    public a3(b3 b3Var, y2 y2Var, ReferenceQueue referenceQueue, ConcurrentMap concurrentMap) {
        super(b3Var, referenceQueue);
        this.f42338e = new AtomicBoolean();
        this.f42337d = new SoftReference(f42332f ? new RuntimeException("ManagedChannel allocation site") : f42333g);
        this.f42336c = y2Var.toString();
        this.f42334a = referenceQueue;
        this.f42335b = concurrentMap;
        concurrentMap.put(this, this);
        a(referenceQueue);
    }

    public static void a(ReferenceQueue referenceQueue) {
        while (true) {
            a3 a3Var = (a3) referenceQueue.poll();
            if (a3Var == null) {
                return;
            }
            SoftReference softReference = a3Var.f42337d;
            RuntimeException runtimeException = (RuntimeException) softReference.get();
            super.clear();
            a3Var.f42335b.remove(a3Var);
            softReference.clear();
            if (!a3Var.f42338e.get()) {
                Level level = Level.SEVERE;
                Logger logger = b3.f42359d;
                if (logger.isLoggable(level)) {
                    LogRecord logRecord = new LogRecord(level, "*~*~*~ Previous channel {0} was garbage collected without being shut down! ~*~*~*" + System.getProperty("line.separator") + "    Make sure to call shutdown()/shutdownNow()");
                    logRecord.setLoggerName(logger.getName());
                    logRecord.setParameters(new Object[]{a3Var.f42336c});
                    logRecord.setThrown(runtimeException);
                    logger.log(logRecord);
                }
            }
        }
    }

    @Override // java.lang.ref.Reference
    public final void clear() {
        super.clear();
        this.f42335b.remove(this);
        this.f42337d.clear();
        a(this.f42334a);
    }
}
