package pf;

import fr.p3;
import kotlin.jvm.internal.m;
import nf.c;
import ns.o;
import ob.f;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p3 f46833b = new p3(25);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static a f46834c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Thread.UncaughtExceptionHandler f46835a;

    public a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f46835a = uncaughtExceptionHandler;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread t6, Throwable e8) {
        m.f(t6, "t");
        m.f(e8, "e");
        Throwable th2 = null;
        loop0: for (Throwable cause = e8; cause != null && cause != th2; cause = cause.getCause()) {
            StackTraceElement[] stackTrace = cause.getStackTrace();
            m.e(stackTrace, "t.stackTrace");
            for (StackTraceElement element : stackTrace) {
                m.e(element, "element");
                if (f.B(element)) {
                    o.v(e8);
                    o00.a.e(e8, c.CrashReport).b();
                    break loop0;
                }
            }
            th2 = cause;
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f46835a;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(t6, e8);
        }
    }
}
