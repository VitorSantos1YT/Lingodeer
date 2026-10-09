package f10;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import b1.p;
import org.greenrobot.eventbus.EventBusException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class g extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f26543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f26544b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f26545c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f26546d;

    public g(e eVar, Looper looper) {
        super(looper);
        this.f26545c = eVar;
        this.f26544b = 10;
        this.f26543a = new p(8, false);
    }

    public final void a(o oVar, Object obj) {
        j jVarA = j.a(oVar, obj);
        synchronized (this) {
            try {
                this.f26543a.t(jVarA);
                if (!this.f26546d) {
                    this.f26546d = true;
                    if (!sendMessage(obtainMessage())) {
                        throw new EventBusException("Could not send handler message");
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        try {
            long jUptimeMillis = SystemClock.uptimeMillis();
            do {
                j jVarJ = this.f26543a.J();
                if (jVarJ == null) {
                    synchronized (this) {
                        jVarJ = this.f26543a.J();
                        if (jVarJ == null) {
                            this.f26546d = false;
                            return;
                        }
                    }
                }
                this.f26545c.c(jVarJ);
            } while (SystemClock.uptimeMillis() - jUptimeMillis < this.f26544b);
            if (!sendMessage(obtainMessage())) {
                throw new EventBusException("Could not send handler message");
            }
            this.f26546d = true;
        } catch (Throwable th2) {
            this.f26546d = false;
            throw th2;
        }
    }
}
