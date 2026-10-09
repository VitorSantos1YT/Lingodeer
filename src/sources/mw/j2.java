package mw;

import com.google.common.base.Throwables;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class j2 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Logger f42479b = Logger.getLogger(j2.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runnable f42480a;

    public j2(Runnable runnable) {
        this.f42480a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Runnable runnable = this.f42480a;
        try {
            runnable.run();
        } catch (Throwable th2) {
            f42479b.log(Level.SEVERE, "Exception while executing runnable " + runnable, th2);
            Throwables.a(th2);
            throw new AssertionError(th2);
        }
    }

    public final String toString() {
        return "LogExceptionRunnable(" + this.f42480a + ")";
    }
}
