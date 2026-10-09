package b7;

import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f3973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f3974b;

    public f() {
        this(y.f4045a);
    }

    public final synchronized void a() {
        boolean z11 = false;
        while (!this.f3974b) {
            try {
                this.f3973a.getClass();
                wait();
            } catch (InterruptedException unused) {
                z11 = true;
            }
        }
        if (z11) {
            Thread.currentThread().interrupt();
        }
    }

    public final synchronized boolean b(long j11) {
        try {
            if (j11 <= 0) {
                return this.f3974b;
            }
            this.f3973a.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j12 = j11 + jElapsedRealtime;
            if (j12 < jElapsedRealtime) {
                a();
            } else {
                boolean z11 = false;
                while (!this.f3974b && jElapsedRealtime < j12) {
                    try {
                        this.f3973a.getClass();
                        wait(j12 - jElapsedRealtime);
                    } catch (InterruptedException unused) {
                        z11 = true;
                    }
                    this.f3973a.getClass();
                    jElapsedRealtime = SystemClock.elapsedRealtime();
                }
                if (z11) {
                    Thread.currentThread().interrupt();
                }
            }
            return this.f3974b;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized boolean c() {
        if (this.f3974b) {
            return false;
        }
        this.f3974b = true;
        notifyAll();
        return true;
    }

    public f(y yVar) {
        this.f3973a = yVar;
    }
}
