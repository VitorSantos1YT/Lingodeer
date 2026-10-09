package mw;

import com.google.common.base.Preconditions;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;
import vf.eq.EHjhWcesDUIsIw;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class d5 implements Executor {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Logger f42392c = Logger.getLogger(d5.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f42393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayDeque f42394b;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        Preconditions.k(runnable, "'task' must not be null.");
        if (this.f42393a) {
            if (this.f42394b == null) {
                this.f42394b = new ArrayDeque(4);
            }
            this.f42394b.add(runnable);
            return;
        }
        this.f42393a = true;
        try {
            runnable.run();
            if (this.f42394b != null) {
                a();
            }
            this.f42393a = false;
        } catch (Throwable th2) {
            try {
                f42392c.log(Level.SEVERE, "Exception while executing runnable " + runnable, th2);
            } finally {
                if (this.f42394b != null) {
                    a();
                }
                this.f42393a = false;
            }
        }
    }

    public final void a() {
        while (true) {
            Runnable runnable = (Runnable) this.f42394b.poll();
            if (runnable == null) {
                return;
            }
            try {
                runnable.run();
            } catch (Throwable th2) {
                f42392c.log(Level.SEVERE, EHjhWcesDUIsIw.NyoMD + runnable, th2);
            }
        }
    }
}
